package gg.essential.loader.stage1;

import java.nio.file.attribute.*;
import org.apache.commons.codec.digest.*;
import java.net.*;
import java.io.*;
import java.nio.charset.*;
import org.apache.commons.io.*;
import org.apache.commons.lang3.*;
import com.google.gson.*;
import java.nio.file.*;
import org.apache.logging.log4j.*;

public abstract class EssentialLoaderBase
{
    private static final Logger LOGGER;
    protected static final String STAGE2_PKG = "gg.essential.loader.stage2.";
    protected static final String STAGE2_CLS = "gg.essential.loader.stage2.EssentialLoader";
    private static final String BASE_URL;
    private static final String BRANCH;
    private static final String VERSION_URL;
    private static final boolean AUTO_UPDATE;
    private final String variant;
    private final String gameVersion;
    private Object stage2;
    private boolean loaded;
    
    EssentialLoaderBase(final String variant, final String gameVersion) {
        super();
        this.variant = variant;
        this.gameVersion = gameVersion;
    }
    
    public void load(final Path gameDir) throws Exception {
        if (this.loaded) {
            return;
        }
        this.loaded = true;
        final Path dataDir = gameDir.resolve("essential").resolve("loader").resolve("stage1").resolve(this.variant);
        final Path stage2File = dataDir.resolve("stage2." + this.gameVersion + ".jar");
        final URL stage2Url = stage2File.toUri().toURL();
        if (!Files.exists(dataDir, new LinkOption[0])) {
            Files.createDirectories(dataDir, (FileAttribute<?>[])new FileAttribute[0]);
        }
        boolean needUpdate = !Files.exists(stage2File, new LinkOption[0]);
        FileMeta meta = null;
        if (needUpdate || EssentialLoaderBase.AUTO_UPDATE) {
            meta = this.fetchLatestMetadata();
            if (meta == null && needUpdate) {
                return;
            }
        }
        if (!needUpdate && meta != null && !meta.checksum.equals(this.getChecksum(stage2File))) {
            needUpdate = true;
        }
        if (needUpdate) {
            final Path downloadedFile = Files.createTempFile("essential-download-", "", (FileAttribute<?>[])new FileAttribute[0]);
            if (this.downloadFile(meta, downloadedFile)) {
                Files.deleteIfExists(stage2File);
                Files.move(downloadedFile, stage2File, new CopyOption[0]);
            }
            else {
                EssentialLoaderBase.LOGGER.warn("Unable to download Essential, please check your internet connection. If the problem persists, please contact Support.");
                Files.deleteIfExists(downloadedFile);
            }
        }
        if (!Files.exists(stage2File, new LinkOption[0])) {
            return;
        }
        final ClassLoader classLoader = this.addToClassLoader(stage2Url);
        this.stage2 = Class.forName("gg.essential.loader.stage2.EssentialLoader", true, classLoader).getConstructor(Path.class, String.class).newInstance(gameDir, this.gameVersion);
        this.stage2.getClass().getMethod("load", (Class<?>[])new Class[0]).invoke(this.stage2, new Object[0]);
    }
    
    protected abstract ClassLoader addToClassLoader(final URL p0) throws Exception;
    
    public void initialize() {
        if (this.stage2 == null) {
            return;
        }
        try {
            this.stage2.getClass().getMethod("initialize", (Class<?>[])new Class[0]).invoke(this.stage2, new Object[0]);
        }
        catch (final Throwable e) {
            throw new RuntimeException("Unexpected error", e);
        }
    }
    
    private String getChecksum(final Path input) {
        try (final InputStream inputStream = Files.newInputStream(input, new OpenOption[0])) {
            return DigestUtils.md5Hex(inputStream);
        }
        catch (final Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    private URLConnection prepareConnection(final String url) throws IOException {
        final URLConnection urlConnection = new URL(url).openConnection();
        if (urlConnection instanceof HttpURLConnection) {
            final HttpURLConnection httpURLConnection = (HttpURLConnection)urlConnection;
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.setUseCaches(true);
            httpURLConnection.setReadTimeout(3000);
            httpURLConnection.setReadTimeout(3000);
            httpURLConnection.setDoOutput(true);
            httpURLConnection.addRequestProperty("User-Agent", "Mozilla/5.0 (Essential Initializer)");
        }
        return urlConnection;
    }
    
    private FileMeta fetchLatestMetadata() {
        JsonObject responseObject;
        try {
            final URLConnection connection = this.prepareConnection(String.format(EssentialLoaderBase.VERSION_URL, this.gameVersion.replace(".", "-")));
            String response;
            try (final InputStream inputStream = connection.getInputStream()) {
                response = IOUtils.toString(inputStream, Charset.defaultCharset());
            }
            final JsonElement jsonElement = new JsonParser().parse(response);
            responseObject = (jsonElement.isJsonObject() ? jsonElement.getAsJsonObject() : null);
        }
        catch (final IOException | JsonParseException e) {
            EssentialLoaderBase.LOGGER.error("Error occurred checking for updates for game version {}.", new Object[] { this.gameVersion, e });
            return null;
        }
        if (responseObject == null) {
            EssentialLoaderBase.LOGGER.warn("Essential does not support the following game version: {}", new Object[] { this.gameVersion });
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
    
    private boolean downloadFile(final FileMeta meta, final Path target) {
        try {
            final URLConnection connection = this.prepareConnection(meta.url);
            Files.copy(connection.getInputStream(), target, StandardCopyOption.REPLACE_EXISTING);
        }
        catch (final IOException e) {
            EssentialLoaderBase.LOGGER.error("Error occurred when downloading file '{}'.", new Object[] { meta.url, e });
            return false;
        }
        final String actualHash = this.getChecksum(target);
        if (!meta.checksum.equals(actualHash)) {
            EssentialLoaderBase.LOGGER.warn("Downloaded Essential file checksum did not match what we expected (actual={}, expected={}", new Object[] { actualHash, meta.checksum });
            return false;
        }
        return true;
    }
    
    static {
        LOGGER = LogManager.getLogger((Class)EssentialLoaderBase.class);
        BASE_URL = System.getProperty("essential.download.url", System.getenv().getOrDefault("ESSENTIAL_DOWNLOAD_URL", "https://downloads.essential.gg"));
        BRANCH = System.getProperty("essential.stage2.branch", System.getenv().getOrDefault("ESSENTIAL_STAGE2_BRANCH", "stable"));
        VERSION_URL = EssentialLoaderBase.BASE_URL + "/v1/mods/essential/loader-stage2/updates/" + EssentialLoaderBase.BRANCH + "/%s/";
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
