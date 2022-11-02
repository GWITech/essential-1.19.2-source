package gg.essential.loader.stage2;

import gg.essential.loader.stage2.jvm.*;
import java.nio.file.attribute.*;
import gg.essential.loader.stage2.data.*;
import org.apache.commons.lang3.tuple.*;
import org.apache.commons.io.*;
import gg.essential.loader.stage2.diff.*;
import java.nio.charset.*;
import com.google.gson.*;
import org.apache.commons.lang3.*;
import java.util.*;
import java.util.stream.*;
import org.jetbrains.annotations.*;
import java.net.*;
import gg.essential.loader.stage2.util.*;
import java.nio.file.*;
import java.util.concurrent.*;
import java.io.*;
import org.apache.logging.log4j.*;

public abstract class EssentialLoaderBase
{
    private static final Logger LOGGER;
    private static final String BASE_URL;
    private static final String DEFAULT_BRANCH = "stable";
    private static final String VERSION_BASE_URL;
    private static final String VERSION_URL;
    private static final String DOWNLOAD_URL;
    private static final String DIFF_URL;
    protected static final String CLASS_NAME = "gg.essential.api.tweaker.EssentialTweaker";
    private static final String FILE_BASE_NAME = "Essential (%s)";
    private static final String FILE_EXTENSION = "jar";
    private static final boolean AUTO_UPDATE;
    private final Path gameDir;
    private final String gameVersion;
    private final String apiGameVersion;
    private final String fileBaseName;
    private final LoaderUI ui;
    static final /* synthetic */ boolean $assertionsDisabled;
    
    public EssentialLoaderBase(final Path gameDir, final String gameVersion, final boolean lwjgl3) {
        super();
        this.gameDir = gameDir;
        this.gameVersion = gameVersion;
        this.apiGameVersion = gameVersion.replace(".", "-");
        this.fileBaseName = String.format("Essential (%s)", this.gameVersion);
        final String stage2Branch = System.getProperty("essential.stage2.branch", System.getenv().getOrDefault("ESSENTIAL_STAGE2_BRANCH", "stable"));
        if (!stage2Branch.equals("stable")) {
            EssentialLoaderBase.LOGGER.info("Essential Loader (stage2) branch set to \"{}\".", new Object[] { stage2Branch });
        }
        final String os = System.getProperty("os.name", "").toLowerCase(Locale.ROOT);
        LoaderUI gui;
        if (lwjgl3 && (os.contains("mac") || os.contains("darwin"))) {
            gui = (LoaderUI)new ForkedJvmLoaderSwingUI();
        }
        else {
            gui = new LoaderSwingUI();
        }
        this.ui = LoaderUI.all(new LoaderLoggingUI().updatesEveryMillis(1000), gui.updatesEveryMillis(16));
    }
    
    public void load() throws IOException {
        final Path dataDir = this.gameDir.resolve("essential").toRealPath(new LinkOption[0]);
        if (Files.notExists(dataDir, new LinkOption[0])) {
            Files.createDirectories(dataDir, (FileAttribute<?>[])new FileAttribute[0]);
        }
        if (this.isInClassPath()) {
            if (!Boolean.getBoolean("essential.loader.relaunched")) {
                EssentialLoaderBase.LOGGER.warn("Essential loaded as a regular mod. No automatic updates will be applied.");
            }
            this.loadPlatform();
            return;
        }
        Path essentialFile = Utils.findMostRecentFile(dataDir, this.fileBaseName, "jar").getKey();
        boolean needUpdate = false;
        ModJarMetadata currentMeta = ModJarMetadata.EMPTY;
        if (Files.exists(essentialFile, new LinkOption[0])) {
            currentMeta = ModJarMetadata.read(essentialFile);
        }
        final String currentChecksum = currentMeta.getChecksum();
        if (currentChecksum == null) {
            needUpdate = true;
        }
        final String branch = this.determineBranch();
        ModJarMetadata latestMeta = null;
        if (needUpdate || EssentialLoaderBase.AUTO_UPDATE) {
            latestMeta = this.fetchLatestVersion(ModId.ESSENTIAL, branch);
            if (latestMeta == null && needUpdate) {
                return;
            }
        }
        if (!needUpdate && latestMeta != null && !latestMeta.getChecksum().equals(currentChecksum)) {
            needUpdate = true;
        }
        if (needUpdate) {
            this.ui.start();
            Path downloadedFile;
            try {
                downloadedFile = this.update(essentialFile, currentMeta, latestMeta);
                downloadedFile = this.postProcessDownload(downloadedFile);
            }
            finally {
                this.ui.complete();
            }
            if (downloadedFile != null) {
                latestMeta.write(downloadedFile);
                try {
                    Files.deleteIfExists(essentialFile);
                }
                catch (final IOException e) {
                    EssentialLoaderBase.LOGGER.warn("Failed to delete old Essential file, will try again later.", (Throwable)e);
                }
                essentialFile = Utils.findNextMostRecentFile(dataDir, this.fileBaseName, "jar");
                Files.move(downloadedFile, essentialFile, new CopyOption[0]);
                currentMeta = latestMeta;
            }
            else {
                EssentialLoaderBase.LOGGER.warn("Unable to download Essential, please check your internet connection. If the problem persists, please contact Support.");
            }
        }
        if (!Files.exists(essentialFile, new LinkOption[0])) {
            return;
        }
        final ModVersion version = currentMeta.getVersion();
        if (version.getVersion() != null) {
            System.setProperty("essential.version", version.getVersion());
        }
        this.addToClasspath(essentialFile, this.extractJarsInJar(essentialFile));
        if (this.classpathUpdatesImmediately() && !this.isInClassPath()) {
            throw new IllegalStateException("Could not find Essential in the classpath even though we added it without errors (fileExists=" + Files.exists(essentialFile, new LinkOption[0]) + ").");
        }
        this.loadPlatform();
    }
    
    private String determineBranch() {
        final String DEFAULT_SOURCE = "default";
        final List<Pair<String, String>> configs = (List<Pair<String, String>>)Arrays.asList(Pair.of("property", System.getProperty("essential.branch")), Pair.of("environment", System.getenv().get("ESSENTIAL_BRANCH")), Pair.of("file", this.determineBranchFromFile()), Pair.of("default", "stable"));
        String resultBranch = null;
        String resultSource = null;
        for (final Pair<String, String> config : configs) {
            final String source = config.getKey();
            final String branch = config.getValue();
            if (branch == null) {
                EssentialLoaderBase.LOGGER.trace("Checked {} for Essential branch, was not supplied.", new Object[] { source });
            }
            else if (resultBranch != null) {
                if (source.equals("default")) {
                    continue;
                }
                EssentialLoaderBase.LOGGER.warn("Essential branch supplied via {} as \"{}\" but ignored because {} is more important.", new Object[] { source, branch, resultSource });
            }
            else {
                final Level level = source.equals("default") ? Level.DEBUG : Level.INFO;
                EssentialLoaderBase.LOGGER.log(level, "Essential branch set to \"{}\" via {}.", new Object[] { branch, source });
                resultBranch = branch;
                resultSource = source;
            }
        }
        assert resultBranch != null;
        System.setProperty("essential.branch", resultBranch);
        return resultBranch;
    }
    
    private String determineBranchFromFile() {
        final String BRANCH_FILE_NAME = "essential_branch.txt";
        try {
            final Enumeration<URL> resources = this.getClass().getClassLoader().getResources("essential_branch.txt");
            if (!resources.hasMoreElements()) {
                return null;
            }
            final URL url = resources.nextElement();
            final String branch = IOUtils.toString(url, StandardCharsets.UTF_8).trim();
            EssentialLoaderBase.LOGGER.info("Found {} for branch \"{}\".", new Object[] { url, branch });
            while (resources.hasMoreElements()) {
                EssentialLoaderBase.LOGGER.warn("Found extra branch file, ignoring: {}", new Object[] { resources.nextElement() });
            }
            return branch;
        }
        catch (final Exception e) {
            EssentialLoaderBase.LOGGER.warn("Failed to check for essential_branch.txt file on classpath:", (Throwable)e);
            return null;
        }
    }
    
    private Path update(final Path essentialFile, final ModJarMetadata currentMeta, final ModJarMetadata latestMeta) throws IOException {
        if (!currentMeta.getVersion().isUnknown()) {
            final Path updatedFile = this.updateViaDiff(essentialFile, currentMeta, latestMeta);
            if (updatedFile != null) {
                return updatedFile;
            }
        }
        return this.updateViaDownload(latestMeta);
    }
    
    private Path updateViaDiff(final Path essentialFile, final ModJarMetadata currentMeta, final ModJarMetadata latestMeta) throws IOException {
        final FileMeta meta = this.fetchDiffUrl(latestMeta.getMod(), currentMeta.getVersion(), latestMeta.getVersion());
        if (meta == null) {
            return null;
        }
        final Path downloadedFile = Files.createTempFile("essential-download-", "", (FileAttribute<?>[])new FileAttribute[0]);
        if (!this.downloadFile(meta.url, downloadedFile, meta.checksum)) {
            return null;
        }
        final Path patchedFile = Files.createTempFile("essential-patched-", "", (FileAttribute<?>[])new FileAttribute[0]);
        Files.copy(essentialFile, patchedFile, StandardCopyOption.REPLACE_EXISTING);
        try {
            DiffPatcher.apply(patchedFile, downloadedFile);
            Files.delete(downloadedFile);
        }
        catch (final Exception e) {
            EssentialLoaderBase.LOGGER.error("Error while applying diff:", (Throwable)e);
            Files.deleteIfExists(patchedFile);
            Files.deleteIfExists(downloadedFile);
            return null;
        }
        return patchedFile;
    }
    
    private Path updateViaDownload(final ModJarMetadata latestMeta) throws IOException {
        final FileMeta meta = this.fetchDownloadUrl(latestMeta.getMod(), latestMeta.getVersion());
        if (meta == null) {
            return null;
        }
        final Path downloadedFile = Files.createTempFile("essential-download-", "", (FileAttribute<?>[])new FileAttribute[0]);
        if (!this.downloadFile(meta.url, downloadedFile, meta.checksum)) {
            return null;
        }
        return downloadedFile;
    }
    
    private JsonObject fetchJsonObject(final String endpoint, final boolean allowEmpty) {
        URLConnection connection = null;
        try {
            connection = this.prepareConnection(endpoint);
            String response;
            try (final InputStream inputStream = connection.getInputStream()) {
                response = IOUtils.toString(inputStream, Charset.defaultCharset());
            }
            final JsonElement jsonElement = new JsonParser().parse(response);
            if (jsonElement.isJsonObject()) {
                return jsonElement.getAsJsonObject();
            }
            if (allowEmpty && jsonElement.isJsonNull()) {
                return new JsonObject();
            }
            throw new IOException("Excepted json object, got " + response);
        }
        catch (final IOException | JsonParseException e) {
            EssentialLoaderBase.LOGGER.error("Error occurred fetching " + endpoint + ": ", (Throwable)e);
            this.logConnectionInfoOnError(connection);
            return null;
        }
    }
    
    private ModJarMetadata fetchLatestVersion(final ModId modId, final String branch) {
        final JsonObject responseObject = this.fetchJsonObject(String.format(EssentialLoaderBase.VERSION_URL, branch, this.apiGameVersion), true);
        if (responseObject == null) {
            EssentialLoaderBase.LOGGER.warn("Essential does not support the following game version: {}", new Object[] { this.gameVersion });
            return null;
        }
        final JsonElement jsonId = responseObject.get("id");
        final JsonElement jsonVersion = responseObject.get("version");
        final JsonElement jsonChecksum = responseObject.get("checksum");
        final String id = (jsonId != null && jsonId.isJsonPrimitive()) ? jsonId.getAsString() : null;
        final String version = (jsonVersion != null && jsonVersion.isJsonPrimitive()) ? jsonVersion.getAsString() : null;
        final String checksum = (jsonChecksum != null && jsonChecksum.isJsonPrimitive()) ? jsonChecksum.getAsString() : null;
        if (StringUtils.isEmpty(id) || StringUtils.isEmpty(version)) {
            EssentialLoaderBase.LOGGER.warn("Unexpected response object data (id={}, version={}, checksum={})", new Object[] { jsonId, jsonVersion, jsonChecksum });
            return null;
        }
        return new ModJarMetadata(modId, new ModVersion(id, version), this.apiGameVersion, checksum);
    }
    
    private FileMeta fetchDownloadUrl(final ModId modId, final ModVersion modVersion) {
        return this.fetchFileMeta(String.format(EssentialLoaderBase.DOWNLOAD_URL, modVersion.getVersion(), this.apiGameVersion));
    }
    
    private FileMeta fetchDiffUrl(final ModId modId, final ModVersion oldVersion, final ModVersion modVersion) {
        return this.fetchFileMeta(String.format(EssentialLoaderBase.DIFF_URL, oldVersion.getVersion(), modVersion.getVersion(), this.apiGameVersion));
    }
    
    private FileMeta fetchFileMeta(final String endpoint) {
        final JsonObject responseObject = this.fetchJsonObject(endpoint, false);
        if (responseObject == null) {
            return null;
        }
        final JsonElement jsonUrl = responseObject.get("url");
        final JsonElement jsonChecksum = responseObject.get("checksum");
        final String url = (jsonUrl != null && jsonUrl.isJsonPrimitive()) ? jsonUrl.getAsString() : null;
        final String checksum = (jsonChecksum != null && jsonChecksum.isJsonPrimitive()) ? responseObject.get("checksum").getAsString() : null;
        if (StringUtils.isEmpty(url) || StringUtils.isEmpty(checksum)) {
            EssentialLoaderBase.LOGGER.warn("Unexpected response object data (url={}, checksum={})", new Object[] { jsonUrl, jsonChecksum });
            return null;
        }
        return new FileMeta(url, checksum);
    }
    
    private URLConnection prepareConnection(final String url) throws IOException {
        final URLConnection urlConnection = new URL(url).openConnection();
        if (urlConnection instanceof HttpURLConnection) {
            final HttpURLConnection httpURLConnection = (HttpURLConnection)urlConnection;
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.setUseCaches(true);
            httpURLConnection.setConnectTimeout(30000);
            httpURLConnection.setReadTimeout(30000);
            httpURLConnection.setDoOutput(true);
            httpURLConnection.addRequestProperty("User-Agent", "Mozilla/5.0 (Essential Initializer)");
        }
        return urlConnection;
    }
    
    protected Path postProcessDownload(final Path downloadedFile) {
        return downloadedFile;
    }
    
    protected Path getExtractedJarsRoot() {
        return this.gameDir.resolve("essential").resolve("libraries").resolve(this.gameVersion);
    }
    
    private List<Path> extractJarsInJar(final Path outerJar) throws IOException {
        final Path extractedJarsRoot = this.getExtractedJarsRoot();
        Files.createDirectories(extractedJarsRoot, (FileAttribute<?>[])new FileAttribute[0]);
        final List<Path> extractedJars = new ArrayList<Path>();
        try (final FileSystem fileSystem = FileSystems.newFileSystem(outerJar, (ClassLoader)null)) {
            final Path innerJarsRoot = fileSystem.getPath("META-INF", "jars");
            if (!Files.isDirectory(innerJarsRoot, new LinkOption[0])) {
                return extractedJars;
            }
            List<Path> innerJars;
            try (final Stream<Path> stream = Files.list(innerJarsRoot)) {
                innerJars = stream.collect((Collector<? super Path, ?, List<Path>>)Collectors.toList());
            }
            for (final Path innerJar : innerJars) {
                final Path extractedJar = extractedJarsRoot.resolve(innerJar.getFileName().toString());
                if (Files.exists(extractedJar, new LinkOption[0])) {
                    EssentialLoaderBase.LOGGER.debug("Already extracted: {}", new Object[] { innerJar });
                }
                else {
                    EssentialLoaderBase.LOGGER.debug("Extracting {} to {}", new Object[] { innerJar, extractedJar });
                    final Path tmpJar = Files.createTempFile(extractedJarsRoot, "tmp", ".jar", (FileAttribute<?>[])new FileAttribute[0]);
                    Files.copy(innerJar, tmpJar, StandardCopyOption.REPLACE_EXISTING);
                    Files.move(tmpJar, extractedJar, StandardCopyOption.ATOMIC_MOVE);
                }
                extractedJars.add(extractedJar);
            }
        }
        return extractedJars;
    }
    
    protected abstract void loadPlatform();
    
    @Nullable
    protected abstract ClassLoader getModClassLoader();
    
    protected void addToClasspath(final Path mainJar, final List<Path> innerJars) {
        this.addToClasspath(mainJar);
        for (final Path jar : innerJars) {
            this.addToClasspath(jar);
        }
    }
    
    protected abstract void addToClasspath(final Path p0);
    
    protected boolean classpathUpdatesImmediately() {
        return true;
    }
    
    protected boolean isInClassPath() {
        final ClassLoader loader = this.getModClassLoader();
        return loader != null && loader.getResource("gg.essential.api.tweaker.EssentialTweaker".replace('.', '/') + ".class") != null;
    }
    
    public final void initialize() {
        if (!this.isInClassPath()) {
            return;
        }
        this.doInitialize();
    }
    
    protected void doInitialize() {
        try {
            final ClassLoader loader = this.getModClassLoader();
            if (loader == null) {
                throw new IllegalStateException("Essential is about to be initialized but no associated class loader was found.");
            }
            Class.forName("gg.essential.api.tweaker.EssentialTweaker", false, loader).getDeclaredMethod("initialize", File.class).invoke(null, this.gameDir.toFile());
        }
        catch (final Throwable e) {
            throw new RuntimeException("Unexpected error", e);
        }
    }
    
    public static URI asJar(final URI uri) throws URISyntaxException {
        return new URI("jar:" + uri.getScheme(), uri.getHost(), uri.getPath(), uri.getFragment());
    }
    
    private boolean downloadFile(final String url, final Path target, final String expectedHash) throws IOException {
        if (!this.attemptDownload(url, target)) {
            EssentialLoaderBase.LOGGER.warn("Unable to download Essential, please check your internet connection. If the problem persists, please contact Support.");
            Files.deleteIfExists(target);
            return false;
        }
        final String downloadedChecksum = Checksum.getChecksum(target);
        if (downloadedChecksum.equals(expectedHash)) {
            return true;
        }
        EssentialLoaderBase.LOGGER.warn("Downloaded Essential file checksum did not match what we expected (downloaded={}, expected={}", new Object[] { downloadedChecksum, expectedHash });
        Files.deleteIfExists(target);
        return false;
    }
    
    private boolean attemptDownload(final String url, final Path target) {
        URLConnection connection = null;
        try {
            connection = this.prepareConnection(url);
            final int contentLength = connection.getContentLength();
            this.ui.setDownloadSize(contentLength);
            final long startTime = System.nanoTime();
            int totalRead = 0;
            try (final InputStream inputStream = connection.getInputStream();
                 final OutputStream fileOutputStream = Files.newOutputStream(target, new OpenOption[0])) {
                final byte[] buffer = new byte[1024];
                int read;
                while ((read = inputStream.read(buffer)) > 0) {
                    fileOutputStream.write(buffer, 0, read);
                    totalRead += read;
                    this.ui.setDownloaded(totalRead);
                }
                final long endTime = System.nanoTime();
                final long millis = TimeUnit.NANOSECONDS.toMillis(endTime - startTime);
                System.setProperty("essential.stage2.downloaded.bytes", String.valueOf(contentLength));
                System.setProperty("essential.stage2.downloaded.millis", String.valueOf(millis));
                return true;
            }
        }
        catch (final IOException e) {
            EssentialLoaderBase.LOGGER.error("Error occurred when downloading file '{}'.", new Object[] { url, e });
            this.logConnectionInfoOnError(connection);
            return false;
        }
    }
    
    private void logConnectionInfoOnError(final URLConnection connection) {
        if (connection == null) {
            return;
        }
        EssentialLoaderBase.LOGGER.error("url: {}", new Object[] { connection.getURL() });
        EssentialLoaderBase.LOGGER.error("cf-ray: {}", new Object[] { connection.getHeaderField("cf-ray") });
    }
    
    static {
        $assertionsDisabled = !EssentialLoaderBase.class.desiredAssertionStatus();
        LOGGER = LogManager.getLogger((Class)EssentialLoaderBase.class);
        BASE_URL = System.getProperty("essential.download.url", System.getenv().getOrDefault("ESSENTIAL_DOWNLOAD_URL", "https://api.essential.gg/mods"));
        VERSION_BASE_URL = EssentialLoaderBase.BASE_URL + "/v1/essential:essential/versions/%s";
        VERSION_URL = EssentialLoaderBase.VERSION_BASE_URL + "/platforms/%s";
        DOWNLOAD_URL = EssentialLoaderBase.VERSION_URL + "/download";
        DIFF_URL = EssentialLoaderBase.VERSION_BASE_URL + "/diff/%s/platforms/%s";
        AUTO_UPDATE = "true".equals(System.getProperty("essential.autoUpdate", "true"));
    }
    
    private static class FileMeta
    {
        String url;
        String checksum;
        
        public FileMeta(final String url, final String checksum) {
            super();
            this.url = url;
            this.checksum = checksum;
        }
    }
}
