package gg.essential.elementa.components.image;

import java.util.concurrent.*;
import kotlin.jvm.internal.*;
import java.net.*;
import java.nio.file.*;
import java.nio.channels.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import java.awt.image.*;
import javax.imageio.metadata.*;
import javax.imageio.stream.*;
import javax.imageio.*;
import kotlin.io.*;
import java.io.*;
import org.w3c.dom.*;
import java.util.*;
import kotlin.ranges.*;
import kotlin.collections.*;
import kotlin.jvm.functions.*;
import kotlin.sequences.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000eH\u0096\u0002J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0002J\"\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00050\u00152\u0006\u0010\u0017\u001a\u00020\u0003H\u0002J\u0019\u0010\u0018\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\fH\u0096\u0002J \u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0012\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d*\u00020\u001fH\u0002J\u0016\u0010 \u001a\u0004\u0018\u00010\u0016*\u00020\u001e2\u0006\u0010!\u001a\u00020\u0016H\u0002J\u0016\u0010\"\u001a\u0004\u0018\u00010\u0016*\u00020\u001f2\u0006\u0010#\u001a\u00020\u0016H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006$" }, d2 = { "Lgg/essential/elementa/components/image/FileImageCache;", "Lgg/essential/elementa/components/image/ImageCache;", "directory", "Ljava/io/File;", "cacheTime", "", "timeUnit", "Ljava/util/concurrent/TimeUnit;", "deleteOnCacheMiss", "", "(Ljava/io/File;JLjava/util/concurrent/TimeUnit;Z)V", "get", "Ljava/awt/image/BufferedImage;", "url", "Ljava/net/URL;", "moveDown", "", "hashCode", "", "index", "readEntry", "Lkotlin/Triple;", "", "file", "set", "image", "writeEntry", "img", "asSequence", "Lkotlin/sequences/Sequence;", "Lorg/w3c/dom/Node;", "Lorg/w3c/dom/NodeList;", "attributeValue", "name", "findValueByKeyword", "keyword", "Elementa" })
public final class FileImageCache implements ImageCache
{
    @NotNull
    private final File directory;
    private final long cacheTime;
    @NotNull
    private final TimeUnit timeUnit;
    private final boolean deleteOnCacheMiss;
    
    public FileImageCache(@NotNull final File directory, final long cacheTime, @NotNull final TimeUnit timeUnit, final boolean deleteOnCacheMiss) {
        Intrinsics.checkNotNullParameter((Object)directory, "directory");
        Intrinsics.checkNotNullParameter((Object)timeUnit, "timeUnit");
        super();
        this.directory = directory;
        this.cacheTime = cacheTime;
        this.timeUnit = timeUnit;
        this.deleteOnCacheMiss = deleteOnCacheMiss;
        if (!this.directory.exists()) {
            this.directory.mkdirs();
        }
        if (!this.directory.isDirectory()) {
            throw new IllegalArgumentException("Directory " + (Object)this.directory.getAbsolutePath() + " is not a valid directory for a FileImageCache");
        }
    }
    
    public FileImageCache(final File directory, final long cacheTime, final TimeUnit timeUnit, boolean deleteOnCacheMiss, final int n, final DefaultConstructorMarker defaultConstructorMarker) {
        if ((n & 0x8) != 0x0) {
            deleteOnCacheMiss = true;
        }
        this(directory, cacheTime, timeUnit, deleteOnCacheMiss);
    }
    
    @Nullable
    @Override
    public BufferedImage get(@NotNull final URL url) {
        Intrinsics.checkNotNullParameter((Object)url, "url");
        final int hashCode = url.hashCode();
        int index = 0;
        final Closeable closeable = FileChannel.open(new File(this.directory, new StringBuilder().append(hashCode).append('-').append(index).append(".png").toString()).toPath(), new OpenOption[0]);
        Throwable t = null;
        try {
            final FileChannel open = (FileChannel)closeable;
            final int n = 0;
            final FileLock lock = open.lock();
            while (true) {
                final File file = new File(this.directory, new StringBuilder().append(hashCode).append('-').append(index).append(".png").toString());
                if (!file.exists()) {
                    lock.release();
                    return null;
                }
                final Triple cacheItem = this.readEntry(file);
                if (Intrinsics.areEqual(cacheItem.getSecond(), (Object)url.toString())) {
                    if (System.currentTimeMillis() - ((Number)cacheItem.getThird()).longValue() < this.timeUnit.toMillis(this.cacheTime)) {
                        lock.release();
                        return (BufferedImage)cacheItem.getFirst();
                    }
                    if (this.deleteOnCacheMiss) {
                        file.delete();
                        this.moveDown(hashCode, index);
                    }
                }
                ++index;
            }
        }
        catch (final Throwable t2) {
            t = t2;
            throw t2;
        }
        finally {
            CloseableKt.closeFinally(closeable, t);
        }
    }
    
    @Override
    public void set(@NotNull final URL url, @NotNull final BufferedImage image) {
        Intrinsics.checkNotNullParameter((Object)url, "url");
        Intrinsics.checkNotNullParameter((Object)image, "image");
        final int hashCode = url.hashCode();
        int index = 0;
        File file;
        while (true) {
            file = new File(this.directory, new StringBuilder().append(hashCode).append('-').append(index).append(".png").toString());
            if (!file.exists()) {
                break;
            }
            ++index;
        }
        this.writeEntry(file, image, url);
    }
    
    private final void moveDown(final int hashCode, final int index) {
        int tmp = index + 1;
        while (true) {
            final File src = new File(this.directory, new StringBuilder().append(hashCode).append('-').append(tmp).append(".png").toString());
            if (!src.exists()) {
                break;
            }
            src.renameTo(new File(this.directory, new StringBuilder().append(hashCode).append('-').append(tmp - 1).append(".png").toString()));
            ++tmp;
        }
    }
    
    private final void writeEntry(final File file, final BufferedImage img, final URL url) {
        final ImageWriter writer = ImageIO.getImageWritersByFormatName("png").next();
        final ImageWriteParam writeParam = writer.getDefaultWriteParam();
        final ImageTypeSpecifier typeSpecifier = ImageTypeSpecifier.createFromBufferedImageType(1);
        final IIOMetadata metadata = writer.getDefaultImageMetadata(typeSpecifier, writeParam);
        final IIOMetadataNode urlEntry = new IIOMetadataNode("tEXtEntry");
        urlEntry.setAttribute("keyword", "image_url");
        urlEntry.setAttribute("value", url.toString());
        final IIOMetadataNode cacheTimeEntry = new IIOMetadataNode("tEXtEntry");
        cacheTimeEntry.setAttribute("keyword", "cache_time");
        cacheTimeEntry.setAttribute("value", String.valueOf(System.currentTimeMillis()));
        final IIOMetadataNode text = new IIOMetadataNode("tEXt");
        text.appendChild(urlEntry);
        text.appendChild(cacheTimeEntry);
        final IIOMetadataNode root = new IIOMetadataNode("javax_imageio_png_1.0");
        root.appendChild(text);
        metadata.mergeTree("javax_imageio_png_1.0", root);
        final FileOutputStream fos = new FileOutputStream(file);
        final ImageOutputStream stream = ImageIO.createImageOutputStream(fos);
        writer.setOutput(stream);
        writer.write(metadata, new IIOImage(img, null, metadata), writeParam);
        stream.close();
        fos.close();
    }
    
    private final Triple<BufferedImage, String, Long> readEntry(final File file) {
        final ImageReader imageReader = ImageIO.getImageReadersByFormatName("png").next();
        final byte[] imageData = FilesKt.readBytes(file);
        imageReader.setInput(ImageIO.createImageInputStream(new ByteArrayInputStream(imageData)), true);
        final Node metadata = imageReader.getImageMetadata(0).getAsTree("javax_imageio_1.0");
        final NodeList childNodes2 = metadata.getChildNodes();
        Intrinsics.checkNotNullExpressionValue((Object)childNodes2, "metadata.childNodes");
        while (true) {
            for (final Object next : this.asSequence(childNodes2)) {
                final Node it = (Node)next;
                final int n = 0;
                if (Intrinsics.areEqual((Object)it.getNodeName(), (Object)"Text")) {
                    final Node node2;
                    final Node node = node2 = (Node)next;
                    Intrinsics.checkNotNull((Object)node2);
                    final NodeList childNodes3 = node.getChildNodes();
                    Intrinsics.checkNotNullExpressionValue((Object)childNodes3, "metadata.childNodes.asSe\u2026 == \"Text\" }!!.childNodes");
                    final NodeList childNodes = childNodes3;
                    String valueByKeyword;
                    if ((valueByKeyword = this.findValueByKeyword(childNodes, "image_url")) == null) {
                        valueByKeyword = "";
                    }
                    final String cacheUrl = valueByKeyword;
                    final String valueByKeyword2 = this.findValueByKeyword(childNodes, "cache_time");
                    final long timeCached = (valueByKeyword2 == null) ? 0L : Long.parseLong(valueByKeyword2);
                    return (Triple<BufferedImage, String, Long>)new Triple((Object)ImageIO.read(new ByteArrayInputStream(imageData)), (Object)cacheUrl, (Object)timeCached);
                }
            }
            Node node2;
            final Node node = node2 = null;
            continue;
        }
    }
    
    private final Sequence<Node> asSequence(final NodeList $this$asSequence) {
        return (Sequence<Node>)SequencesKt.map(CollectionsKt.asSequence((Iterable)RangesKt.until(0, $this$asSequence.getLength())), (Function1)new FileImageCache$asSequence.FileImageCache$asSequence$1($this$asSequence));
    }
    
    private final String attributeValue(final Node $this$attributeValue, final String name) {
        final Node namedItem = $this$attributeValue.getAttributes().getNamedItem(name);
        return (namedItem == null) ? null : namedItem.getNodeValue();
    }
    
    private final String findValueByKeyword(final NodeList $this$findValueByKeyword, final String keyword) {
        while (true) {
            for (final Object next : this.asSequence($this$findValueByKeyword)) {
                final Node it = (Node)next;
                final int n = 0;
                if (Intrinsics.areEqual((Object)this.attributeValue(it, "keyword"), (Object)keyword)) {
                    final Node node = (Node)next;
                    final Node $this$attributeValue = node;
                    return ($this$attributeValue == null) ? null : this.attributeValue($this$attributeValue, "value");
                }
            }
            final Node node = null;
            continue;
        }
    }
}
