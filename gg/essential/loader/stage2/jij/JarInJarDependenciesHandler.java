package gg.essential.loader.stage2.jij;

import gg.essential.loader.stage2.data.*;
import java.util.*;
import java.nio.file.attribute.*;
import net.fabricmc.loader.api.*;
import java.nio.file.*;
import java.util.zip.*;
import java.io.*;
import org.apache.logging.log4j.*;

public class JarInJarDependenciesHandler
{
    private static final Logger LOGGER;
    private static final String SYNTHETIC_MOD_ID = "essential-dependencies";
    private static final String SYNTHETIC_MOD_NAME = "Essential Dependencies";
    private static final String SYNTHETIC_MOD_FILE_NAME = "Essential Dependencies.jar";
    private static final boolean NEED_TO_DISABLE_USER_MODS;
    private final Map<String, Path> updates;
    private final List<String> updatedModNames;
    private final List<Path> modsToDisable;
    private final Path extractedJarsRoot;
    
    public JarInJarDependenciesHandler(final Path extractedJarsRoot) {
        super();
        this.updates = new HashMap<String, Path>();
        this.updatedModNames = new ArrayList<String>();
        this.modsToDisable = new ArrayList<Path>();
        this.extractedJarsRoot = extractedJarsRoot;
    }
    
    public List<Path> loadMod(final Path path) {
        final List<Path> jarsToLoad = new ArrayList<Path>();
        if (this.loadMod(path, false, jarsToLoad)) {
            return jarsToLoad;
        }
        return Collections.emptyList();
    }
    
    private boolean loadMod(final Path path, final boolean isDeeplyNestedJar, final List<Path> jarsToLoad) {
        FabricModJson modJson;
        String modId;
        Version modVersion;
        String modName;
        try {
            modJson = FabricModJson.readFromJar(path);
            modId = modJson.getId();
            modVersion = Version.parse(modJson.getVersion());
            modName = modJson.getName();
        }
        catch (final Exception e) {
            throw new RuntimeException("Failed to read fabric.mod.json of " + path, e);
        }
        List<Path> innerJars;
        try {
            innerJars = this.extractInnerJars(path, modJson);
        }
        catch (final IOException e2) {
            throw new RuntimeException("Failed to extract inner jars from " + path, e2);
        }
        for (final Path innerJar : innerJars) {
            if (!this.loadMod(innerJar, true, jarsToLoad)) {
                JarInJarDependenciesHandler.LOGGER.debug("An inner mod of {} needs updating, skipping up-to-date checks for the outer mod", (Object)modId);
                if (!isDeeplyNestedJar) {
                    this.updates.put(modId, path);
                    this.updatedModNames.add((modName != null) ? modName : modId);
                }
                return false;
            }
        }
        if (FabricLoader.getInstance().isDevelopmentEnvironment() && this.isAlreadyOnClasspath(modId)) {
            JarInJarDependenciesHandler.LOGGER.debug("Detected Kotlin already on the classpath, cannot load bundled {}", (Object)modId);
            return true;
        }
        final ModContainer loadedMod = FabricLoader.getInstance().getModContainer(modId).orElse(null);
        if (loadedMod == null) {
            JarInJarDependenciesHandler.LOGGER.debug("Mod {} is not loaded, injecting directly", (Object)modId);
            jarsToLoad.add(path);
            return true;
        }
        final Version loadedVersion = loadedMod.getMetadata().getVersion();
        boolean loadedIsUpToDate;
        if (loadedVersion instanceof SemanticVersion && modVersion instanceof SemanticVersion) {
            loadedIsUpToDate = (((SemanticVersion)loadedVersion).compareTo((SemanticVersion)modVersion) >= 0);
        }
        else {
            loadedIsUpToDate = false;
            JarInJarDependenciesHandler.LOGGER.debug("Mod {} is loaded but has non-semantic version, assuming outdated.", (Object)modId);
        }
        if (loadedIsUpToDate) {
            JarInJarDependenciesHandler.LOGGER.debug("A newer version ({}) of mod {} ({}) is already loaded, skipping.", (Object)loadedVersion, (Object)modId, (Object)modVersion);
            return true;
        }
        JarInJarDependenciesHandler.LOGGER.info("An older version ({}) of mod {} ({}) is already loaded, updating..", (Object)loadedVersion, (Object)modId, (Object)modVersion);
        if (!isDeeplyNestedJar) {
            this.updates.put(modId, path);
            this.updatedModNames.add((modName != null) ? modName : modId);
        }
        return false;
    }
    
    private boolean isAlreadyOnClasspath(final String modId) {
        String cls = null;
        switch (modId) {
            case "org_jetbrains_kotlin_kotlin-stdlib": {
                cls = "kotlin/Unit.class";
                break;
            }
            case "org_jetbrains_kotlin_kotlin-stdlib-jdk7": {
                cls = "kotlin/jdk7/AutoCloseableKt.class";
                break;
            }
            case "org_jetbrains_kotlin_kotlin-stdlib-jdk8": {
                cls = "kotlin/jvm/jdk8/JvmRepeatableKt.class";
                break;
            }
            case "org_jetbrains_kotlin_kotlin-reflect": {
                cls = "kotlin/reflect/jvm/KTypesJvm.class";
                break;
            }
            case "org_jetbrains_kotlinx_kotlinx-coroutines-core-jvm": {
                cls = "kotlinx/coroutines/Job.class";
                break;
            }
            case "org_jetbrains_kotlinx_kotlinx-coroutines-jdk8": {
                cls = "kotlinx/coroutines/future/FutureKt.class";
                break;
            }
            case "org_jetbrains_kotlinx_kotlinx-serialization-core-jvm": {
                cls = "kotlinx/serialization/Serializer.class";
                break;
            }
            case "org_jetbrains_kotlinx_kotlinx-serialization-json-jvm": {
                cls = "kotlinx/serialization/json/Json.class";
                break;
            }
            case "org_jetbrains_kotlinx_kotlinx-serialization-cbor-jvm": {
                cls = "kotlinx/serialization/cbor/Cbor.class";
                break;
            }
        }
        return cls != null && this.getClass().getClassLoader().getResource(cls) != null;
    }
    
    private List<Path> extractInnerJars(final Path outerJar, final FabricModJson fabricModJson) throws IOException {
        if (fabricModJson.getJars().isEmpty()) {
            return Collections.emptyList();
        }
        final List<Path> extractedJars = new ArrayList<Path>();
        try (final FileSystem fileSystem = FileSystems.newFileSystem(outerJar, (ClassLoader)null)) {
            for (final FabricModJson.Jar jarInfo : fabricModJson.getJars()) {
                final Path innerJar = fileSystem.getPath(jarInfo.getFile(), new String[0]);
                final Path extractedJar = this.extractedJarsRoot.resolve(innerJar.getFileName().toString());
                if (Files.exists(extractedJar, new LinkOption[0])) {
                    JarInJarDependenciesHandler.LOGGER.debug("Already extracted: {}", (Object)innerJar);
                }
                else {
                    JarInJarDependenciesHandler.LOGGER.debug("Extracting {} from {} to {}", (Object)innerJar, (Object)outerJar, (Object)extractedJar);
                    final Path tmpJar = Files.createTempFile(this.extractedJarsRoot, "tmp", ".jar", (FileAttribute<?>[])new FileAttribute[0]);
                    Files.copy(innerJar, tmpJar, StandardCopyOption.REPLACE_EXISTING);
                    Files.move(tmpJar, extractedJar, StandardCopyOption.ATOMIC_MOVE);
                }
                extractedJars.add(extractedJar);
            }
        }
        return extractedJars;
    }
    
    public boolean complete() {
        if (this.updates.isEmpty()) {
            return true;
        }
        try {
            this.updateSyntheticMod();
        }
        catch (final IOException e) {
            throw new RuntimeException("Error updating Essential Dependencies mod", e);
        }
        return false;
    }
    
    public List<Path> getModsToDisable() {
        return this.modsToDisable;
    }
    
    public List<String> getUpdatedModNames() {
        return this.updatedModNames;
    }
    
    private void updateSyntheticMod() throws IOException {
        final FabricLoader fabricLoader = FabricLoader.getInstance();
        final Path modsFolder = fabricLoader.getGameDir().resolve("mods").toRealPath(new LinkOption[0]);
        final Path syntheticModPath = modsFolder.resolve("Essential Dependencies.jar");
        JarInJarDependenciesHandler.LOGGER.debug("Updating synthetic essential-dependencies mod at {}", (Object)syntheticModPath);
        if (Files.notExists(syntheticModPath, new LinkOption[0])) {
            createEmptyJar(syntheticModPath);
        }
        try (final SyntheticModJar syntheticModJar = new SyntheticModJar(syntheticModPath, "essential-dependencies", "Essential Dependencies")) {
            for (final SyntheticModJar.InnerJar innerJar : syntheticModJar.getInnerJars()) {
                final String modId = innerJar.getId();
                SemanticVersion modVersion;
                try {
                    modVersion = SemanticVersion.parse(innerJar.getVersion());
                }
                catch (final VersionParsingException e) {
                    JarInJarDependenciesHandler.LOGGER.error("Failed to parse version of \"" + innerJar + "\" in " + syntheticModPath, (Throwable)e);
                    syntheticModJar.removeInnerJar(innerJar);
                    continue;
                }
                if (this.updates.containsKey(modId)) {
                    JarInJarDependenciesHandler.LOGGER.debug("Removing {}, update scheduled", (Object)innerJar);
                    syntheticModJar.removeInnerJar(innerJar);
                }
                else {
                    final ModContainer loadedMod = fabricLoader.getModContainer(modId).orElse(null);
                    if (loadedMod == null) {
                        JarInJarDependenciesHandler.LOGGER.warn("Found {} in synthetic dependencies jar but it was not loaded?", (Object)innerJar);
                        syntheticModJar.removeInnerJar(innerJar);
                    }
                    else {
                        final Version loadedVersion = loadedMod.getMetadata().getVersion();
                        if (!loadedVersion.equals(modVersion)) {
                            JarInJarDependenciesHandler.LOGGER.debug("Removing {}, appears to be unused", (Object)innerJar);
                        }
                        else {
                            JarInJarDependenciesHandler.LOGGER.debug("Keeping {}, currently in use", (Object)innerJar);
                        }
                    }
                }
            }
            for (final Map.Entry<String, Path> update : this.updates.entrySet()) {
                final String modId = update.getKey();
                final Path sourcePath = update.getValue();
                if (JarInJarDependenciesHandler.NEED_TO_DISABLE_USER_MODS) {
                    fabricLoader.getModContainer(modId).ifPresent(mod -> {
                        Path path = mod.getRootPath();
                        try {
                            if (path.isAbsolute() && path.getParent() == null && "zipfs".equals(Files.getFileStore(path).type())) {
                                path = FileSystems.getDefault().getPath(path.getFileSystem().toString(), new String[0]);
                            }
                        }
                        catch (final IOException e2) {
                            JarInJarDependenciesHandler.LOGGER.error("Failed to resolve origin of " + mod.getMetadata().getId(), (Throwable)e2);
                            return;
                        }
                        if (!Files.isRegularFile(path, new LinkOption[0])) {
                            JarInJarDependenciesHandler.LOGGER.error("Origin of {} is not a regular file: {}", (Object)mod.getMetadata().getId(), (Object)path);
                            return;
                        }
                        else {
                            JarInJarDependenciesHandler.LOGGER.info("Disabling outdated {} at {}", (Object)modId, (Object)path);
                            this.modsToDisable.add(path);
                            return;
                        }
                    });
                }
                JarInJarDependenciesHandler.LOGGER.debug("Adding {} from {}", (Object)modId, (Object)sourcePath);
                syntheticModJar.addInnerJar(sourcePath);
            }
        }
        JarInJarDependenciesHandler.LOGGER.debug("Synthetic essential-dependencies jar updated.");
    }
    
    private static void createEmptyJar(final Path path) throws IOException {
        try (final OutputStream out = Files.newOutputStream(path, new OpenOption[0])) {
            new ZipOutputStream(out).close();
        }
    }
    
    private /* synthetic */ void lambda$updateSyntheticMod$0(final String modId, final ModContainer mod) {
        Path path = mod.getRootPath();
        try {
            if (path.isAbsolute() && path.getParent() == null && "zipfs".equals(Files.getFileStore(path).type())) {
                path = FileSystems.getDefault().getPath(path.getFileSystem().toString(), new String[0]);
            }
        }
        catch (final IOException e) {
            JarInJarDependenciesHandler.LOGGER.error("Failed to resolve origin of " + mod.getMetadata().getId(), (Throwable)e);
            return;
        }
        if (!Files.isRegularFile(path, new LinkOption[0])) {
            JarInJarDependenciesHandler.LOGGER.error("Origin of {} is not a regular file: {}", (Object)mod.getMetadata().getId(), (Object)path);
            return;
        }
        JarInJarDependenciesHandler.LOGGER.info("Disabling outdated {} at {}", (Object)modId, (Object)path);
        this.modsToDisable.add(path);
    }
    
    static {
        LOGGER = LogManager.getLogger();
        boolean isOldLoader;
        try {
            Class.forName("net.fabricmc.loader.discovery.ModCandidateSet");
            isOldLoader = true;
        }
        catch (final ClassNotFoundException e) {
            isOldLoader = false;
        }
        NEED_TO_DISABLE_USER_MODS = isOldLoader;
    }
}
