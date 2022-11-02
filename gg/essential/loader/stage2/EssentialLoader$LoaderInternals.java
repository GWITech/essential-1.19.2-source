package gg.essential.loader.stage2;

import java.net.*;
import net.fabricmc.loader.launch.common.*;
import net.fabricmc.loader.api.metadata.*;
import org.apache.logging.log4j.*;
import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.*;
import com.google.common.io.*;
import net.fabricmc.api.*;
import org.spongepowered.asm.mixin.*;
import java.lang.reflect.*;
import net.fabricmc.loader.api.*;
import java.util.*;

public class LoaderInternals
{
    final /* synthetic */ EssentialLoader this$0;
    
    public LoaderInternals(final EssentialLoader this$0) {
        this.this$0 = this$0;
        super();
    }
    
    private Class<?> findImplClass(final String name) throws ClassNotFoundException {
        try {
            return Class.forName("net.fabricmc.loader.impl." + name);
        }
        catch (final ClassNotFoundException e) {
            return Class.forName("net.fabricmc.loader." + name);
        }
    }
    
    private void addToClassLoaderViaFabricLauncherBase(final URL url) {
        FabricLauncherBase.getLauncher().propose(url);
    }
    
    private void addToClassLoaderViaReflection(final URL url) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        final ClassLoader classLoader = this.this$0.getModClassLoader();
        if (classLoader == null) {
            throw new IllegalStateException("Failed to traverse class loader hierarchy to find mod class loader.");
        }
        final Method method = classLoader.getClass().getDeclaredMethod("addURL", URL.class);
        method.setAccessible(true);
        method.invoke(classLoader, url);
    }
    
    private ModMetadata parseModMetadata(final Path modPath, final Path fabricJson) throws Exception {
        final Class<?> ModMetadataParser = this.findImplClass("metadata.ModMetadataParser");
        try {
            return (ModMetadata)ModMetadataParser.getDeclaredMethod("parseMetadata", Logger.class, Path.class).invoke(null, EssentialLoader.access$400(), fabricJson);
        }
        catch (final NoSuchMethodException e) {
            try (final InputStream in = Files.newInputStream(fabricJson, new OpenOption[0])) {
                try {
                    return (ModMetadata)ModMetadataParser.getDeclaredMethod("parseMetadata", InputStream.class, String.class, List.class).invoke(null, in, modPath.toString(), Collections.emptyList());
                }
                catch (final NoSuchMethodException e2) {
                    final Class<?> VersionOverrides = this.findImplClass("metadata.VersionOverrides");
                    final Class<?> DependencyOverrides = this.findImplClass("metadata.DependencyOverrides");
                    final Object versionOverrides = VersionOverrides.getConstructor((Class<?>[])new Class[0]).newInstance(new Object[0]);
                    final Object dependencyOverrides = DependencyOverrides.getConstructor(Path.class).newInstance(Paths.get("_invalid_", new String[0]));
                    return (ModMetadata)ModMetadataParser.getDeclaredMethod("parseMetadata", InputStream.class, String.class, List.class, VersionOverrides, DependencyOverrides).invoke(null, in, modPath.toString(), Collections.emptyList(), versionOverrides, dependencyOverrides);
                }
            }
        }
    }
    
    public void remapMod(final ModMetadata metadata, final Path inputPath, final Path outputPath) throws Exception {
        final Class<?> ModCandidate = this.findImplClass("discovery.ModCandidate");
        final Class<?> ModResolver = this.findImplClass("discovery.ModResolver");
        final Class<?> RuntimeModRemapper = this.findImplClass("discovery.RuntimeModRemapper");
        final Object candidate = this.createCandidate(inputPath, inputPath.toUri().toURL(), metadata);
        try {
            final Method getInMemoryFs = ModResolver.getDeclaredMethod("getInMemoryFs", (Class<?>[])new Class[0]);
            final Method remap = RuntimeModRemapper.getDeclaredMethod("remap", Collection.class, FileSystem.class);
            final Method getOriginUrl = ModCandidate.getDeclaredMethod("getOriginUrl", (Class<?>[])new Class[0]);
            final FileSystem fileSystem = (FileSystem)getInMemoryFs.invoke(null, new Object[0]);
            final Object result = remap.invoke(null, Collections.singleton(candidate), fileSystem);
            final Object remappedCandidate = ((Collection)result).iterator().next();
            final URL remappedUrl = (URL)getOriginUrl.invoke(remappedCandidate, new Object[0]);
            try (final InputStream in = remappedUrl.openStream()) {
                Files.copy(in, outputPath, new CopyOption[0]);
            }
        }
        catch (final NoSuchMethodException e) {
            final Method remap = RuntimeModRemapper.getDeclaredMethod("remap", Collection.class, Path.class, Path.class);
            final Path tmpDir = Files.createTempDirectory("remap-tmp", (FileAttribute<?>[])new FileAttribute[0]);
            final Path outDir = Files.createTempDirectory("remap-out", (FileAttribute<?>[])new FileAttribute[0]);
            try {
                remap.invoke(null, Collections.singleton(candidate), tmpDir, outDir);
                Path resultPath;
                try {
                    final Method getPath = ModCandidate.getDeclaredMethod("getPath", (Class<?>[])new Class[0]);
                    resultPath = (Path)getPath.invoke(candidate, new Object[0]);
                }
                catch (final NoSuchMethodException e2) {
                    final Method getPaths = ModCandidate.getDeclaredMethod("getPaths", (Class<?>[])new Class[0]);
                    final List<Path> paths = (List<Path>)getPaths.invoke(candidate, new Object[0]);
                    resultPath = paths.get(0);
                }
                Files.move(resultPath, outputPath, new CopyOption[0]);
            }
            finally {
                MoreFiles.deleteRecursively(tmpDir, RecursiveDeleteOption.ALLOW_INSECURE);
                MoreFiles.deleteRecursively(outDir, RecursiveDeleteOption.ALLOW_INSECURE);
            }
        }
    }
    
    private Object createCandidate(final Path path, final URL url, final Object metadata) throws ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
        final Class<?> LoaderModMetadata = this.findImplClass("metadata.LoaderModMetadata");
        final Class<?> ModCandidate = this.findImplClass("discovery.ModCandidate");
        try {
            return ModCandidate.getConstructor(LoaderModMetadata, URL.class, Integer.TYPE, Boolean.TYPE).newInstance(metadata, url, 0, true);
        }
        catch (final NoSuchMethodException e) {
            try {
                final Method createCandidate = ModCandidate.getDeclaredMethod("createPlain", Path.class, LoaderModMetadata, Boolean.TYPE, Collection.class);
                createCandidate.setAccessible(true);
                return createCandidate.invoke(null, path, metadata, true, Collections.emptyList());
            }
            catch (final NoSuchMethodException e2) {
                final Method createCandidate2 = ModCandidate.getDeclaredMethod("createPlain", List.class, LoaderModMetadata, Boolean.TYPE, Collection.class);
                createCandidate2.setAccessible(true);
                return createCandidate2.invoke(null, Collections.singletonList(path), metadata, true, Collections.emptyList());
            }
        }
    }
    
    private void injectFakeMod(final Path path, final URL url, final ModMetadata metadata) throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, ClassNotFoundException, InstantiationException {
        final FabricLoader fabricLoader = FabricLoader.getInstance();
        final Class<? extends FabricLoader> fabricLoaderClass = fabricLoader.getClass();
        Class<?> ModContainerImpl;
        try {
            ModContainerImpl = this.findImplClass("ModContainerImpl");
        }
        catch (final ClassNotFoundException e) {
            ModContainerImpl = this.findImplClass("ModContainer");
        }
        final Class<?> LoaderModMetadata = this.findImplClass("metadata.LoaderModMetadata");
        final Class<?> EntrypointMetadata = this.findImplClass("metadata.EntrypointMetadata");
        final Field modMapField = fabricLoaderClass.getDeclaredField("modMap");
        final Field modsField = fabricLoaderClass.getDeclaredField("mods");
        final Field entrypointStorageField = fabricLoaderClass.getDeclaredField("entrypointStorage");
        final Field adapterMapField = fabricLoaderClass.getDeclaredField("adapterMap");
        modMapField.setAccessible(true);
        modsField.setAccessible(true);
        entrypointStorageField.setAccessible(true);
        adapterMapField.setAccessible(true);
        final List<Object> mods = (List<Object>)modsField.get(fabricLoader);
        final Map<String, Object> modMap = (Map<String, Object>)modMapField.get(fabricLoader);
        final Object entrypointStorage = entrypointStorageField.get(fabricLoader);
        final Map<String, LanguageAdapter> adapterMap = (Map<String, LanguageAdapter>)adapterMapField.get(fabricLoader);
        final Method getMixinConfigs = LoaderModMetadata.getDeclaredMethod("getMixinConfigs", EnvType.class);
        for (final String mixinConfig : (Collection)getMixinConfigs.invoke(metadata, EnvType.CLIENT)) {
            Mixins.addConfiguration(mixinConfig);
        }
        Object modContainer;
        try {
            modContainer = ModContainerImpl.getConstructor(LoaderModMetadata, URL.class).newInstance(metadata, url);
        }
        catch (final NoSuchMethodException e2) {
            try {
                modContainer = ModContainerImpl.getConstructor(LoaderModMetadata, Path.class).newInstance(metadata, path);
            }
            catch (final NoSuchMethodException e3) {
                modContainer = ModContainerImpl.getConstructor(this.findImplClass("discovery.ModCandidate")).newInstance(this.createCandidate(path, url, metadata));
            }
        }
        mods.add(modContainer);
        modMap.put(metadata.getId(), modContainer);
        final Method addMethod = entrypointStorage.getClass().getDeclaredMethod("add", ModContainerImpl, String.class, EntrypointMetadata, Map.class);
        addMethod.setAccessible(true);
        final Method getEntrypointKeys = LoaderModMetadata.getDeclaredMethod("getEntrypointKeys", (Class<?>[])new Class[0]);
        final Method getEntrypoints = LoaderModMetadata.getDeclaredMethod("getEntrypoints", String.class);
        for (final String key : (Collection)getEntrypointKeys.invoke(metadata, new Object[0])) {
            for (final Object entrypointMetadata : (List)getEntrypoints.invoke(metadata, key)) {
                addMethod.invoke(entrypointStorage, modContainer, key, entrypointMetadata, adapterMap);
            }
        }
    }
    
    static /* synthetic */ void access$000(final LoaderInternals x0, final URL x1) {
        x0.addToClassLoaderViaFabricLauncherBase(x1);
    }
    
    static /* synthetic */ void access$100(final LoaderInternals x0, final URL x1) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        x0.addToClassLoaderViaReflection(x1);
    }
    
    static /* synthetic */ ModMetadata access$200(final LoaderInternals x0, final Path x1, final Path x2) throws Exception {
        return x0.parseModMetadata(x1, x2);
    }
    
    static /* synthetic */ void access$300(final LoaderInternals x0, final Path x1, final URL x2, final ModMetadata x3) throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, ClassNotFoundException, InstantiationException {
        x0.injectFakeMod(x1, x2, x3);
    }
}
