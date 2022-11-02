package gg.essential.gui.screenshot.handler;

import gg.essential.lib.gson.*;
import gg.essential.vigilance.impl.nightconfig.core.utils.*;
import kotlin.jvm.internal.*;
import java.nio.charset.*;
import org.apache.commons.io.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import java.util.*;
import org.apache.commons.codec.digest.*;
import java.io.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u00006
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0000
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u000e
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u000b
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0002\b
                                                   \u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0003J\u0013\u0010\u0011\u001a\u0004\u0018\u00010	2\u0006\u0010\u0010\u001a\u00020\u0003H\u0086\u0002J\u0010\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0003H\u0002J\u0012\u0010\u0013\u001a\u0004\u0018\u00010	2\u0006\u0010\u0010\u001a\u00020\u0003H\u0002J\u0010\u0010\u0014\u001a\u0004\u0018\u00010	2\u0006\u0010\u0015\u001a\u00020	J\b\u0010\u0016\u001a\u00020\u000fH\u0002J\u0019\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020	H\u0086\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002
                                                   \u0000R*\u0010\u0005\u001a\u001e\u0012\f\u0012
                                                    \b*\u0004\u0018\u00010\u00070\u0007\u0012\f\u0012
                                                    \b*\u0004\u0018\u00010	0	0\u0006X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u000e\u0010
                                                   \u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002
                                                   \u0000¨\u0006\u0019""" }, d2 = { "Lgg/essential/gui/screenshot/handler/ScreenshotChecksumManager;", "", "cacheFile", "Ljava/io/File;", "(Ljava/io/File;)V", "entries", "Lgg/essential/vigilance/impl/nightconfig/core/utils/ObservedMap;", "Lgg/essential/gui/screenshot/handler/ChecksumSnapshot;", "kotlin.jvm.PlatformType", "", "gson", "Lgg/essential/lib/gson/Gson;", "persistChanges", "", "delete", "", "file", "get", "getChecksumSnapshot", "readFileChecksum", "remove", "name", "saveState", "set", "checksum", "essential" })
public final class ScreenshotChecksumManager
{
    @NotNull
    private final File cacheFile;
    @NotNull
    private final Gson gson;
    private boolean persistChanges;
    @NotNull
    private final ObservedMap<ChecksumSnapshot, String> entries;
    
    public ScreenshotChecksumManager(@NotNull final File cacheFile) {
        Intrinsics.checkNotNullParameter((Object)cacheFile, "cacheFile");
        super();
        this.cacheFile = cacheFile;
        this.gson = new Gson();
        this.persistChanges = true;
        synchronized (this.entries = new ObservedMap<ChecksumSnapshot, String>(new LinkedHashMap<ChecksumSnapshot, String>(), ScreenshotChecksumManager::entries$lambda-0)) {
            if (this.cacheFile.exists()) {
                try {
                    this.persistChanges = false;
                    final SerializedChecksum[] data = this.gson.fromJson(FileUtils.readFileToString(this.cacheFile, StandardCharsets.UTF_8), SerializedChecksum[].class);
                    if (data != null) {
                        final SerializedChecksum[] array = data;
                        for (int i = 0; i < array.length; ++i) {
                            final SerializedChecksum entry = array[i];
                            this.entries.put(entry.getSnapshot(), entry.getChecksum());
                        }
                    }
                }
                finally {
                    this.persistChanges = true;
                }
            }
            final Unit instance = Unit.INSTANCE;
        }
    }
    
    public final void set(@NotNull final File file, @NotNull final String checksum) {
        Intrinsics.checkNotNullParameter((Object)file, "file");
        Intrinsics.checkNotNullParameter((Object)checksum, "checksum");
        synchronized (this.entries) {
            this.entries.put(this.getChecksumSnapshot(file), checksum);
            final Unit instance = Unit.INSTANCE;
        }
    }
    
    @Nullable
    public final String get(@NotNull final File file) {
        Intrinsics.checkNotNullParameter((Object)file, "file");
        synchronized (this.entries) {
            final ChecksumSnapshot checksumSnapshot = this.getChecksumSnapshot(file);
            final String get = this.entries.get(checksumSnapshot);
            String s;
            if (get != null) {
                s = get;
            }
            else {
                final String fileChecksum2;
                final String fileChecksum = fileChecksum2 = this.readFileChecksum(file);
                if (fileChecksum2 != null) {
                    final String s2 = fileChecksum2;
                    this.entries.put(checksumSnapshot, fileChecksum);
                    s = s2;
                }
                else {
                    s = null;
                }
            }
            return s;
        }
    }
    
    @Nullable
    public final String remove(@NotNull final String name) {
        Intrinsics.checkNotNullParameter((Object)name, "name");
        synchronized (this.entries) {
            final Set<Map.Entry<ChecksumSnapshot, String>> entrySet = this.entries.entrySet();
            Intrinsics.checkNotNullExpressionValue((Object)entrySet, "entries.entries");
            final Iterable $this$firstOrNull$iv = entrySet;
            while (true) {
                for (final Object element$iv : $this$firstOrNull$iv) {
                    final Map.Entry it = (Map.Entry)element$iv;
                    if (Intrinsics.areEqual((Object)it.getKey().getName(), (Object)name)) {
                        final Object o = element$iv;
                        final Map.Entry entry = (Map.Entry)o;
                        String s;
                        if (entry != null) {
                            final Map.Entry it2 = entry;
                            this.entries.remove(it2.getKey());
                            s = it2.getValue();
                        }
                        else {
                            s = null;
                        }
                        return s;
                    }
                }
                final Object o = null;
                continue;
            }
        }
    }
    
    private final void saveState() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        gg/essential/gui/screenshot/handler/ScreenshotChecksumManager.persistChanges:Z
        //     4: ifne            8
        //     7: return         
        //     8: aload_0         /* this */
        //     9: getfield        gg/essential/gui/screenshot/handler/ScreenshotChecksumManager.entries:Lgg/essential/vigilance/impl/nightconfig/core/utils/ObservedMap;
        //    12: astore_1       
        //    13: aload_1        
        //    14: monitorenter   
        //    15: aload_0         /* this */
        //    16: getfield        gg/essential/gui/screenshot/handler/ScreenshotChecksumManager.cacheFile:Ljava/io/File;
        //    19: aload_0         /* this */
        //    20: getfield        gg/essential/gui/screenshot/handler/ScreenshotChecksumManager.gson:Lgg/essential/lib/gson/Gson;
        //    23: aload_0         /* this */
        //    24: getfield        gg/essential/gui/screenshot/handler/ScreenshotChecksumManager.entries:Lgg/essential/vigilance/impl/nightconfig/core/utils/ObservedMap;
        //    27: checkcast       Ljava/util/Map;
        //    30: astore_3       
        //    31: astore          4
        //    33: astore          5
        //    35: aload_3         /* $this$map$iv */
        //    36: astore          6
        //    38: new             Ljava/util/ArrayList;
        //    41: dup            
        //    42: aload_3         /* $this$map$iv */
        //    43: invokeinterface java/util/Map.size:()I
        //    48: invokespecial   java/util/ArrayList.<init>:(I)V
        //    51: checkcast       Ljava/util/Collection;
        //    54: astore          destination$iv$iv
        //    56: aload           $this$mapTo$iv$iv
        //    58: invokeinterface java/util/Map.entrySet:()Ljava/util/Set;
        //    63: invokeinterface java/util/Set.iterator:()Ljava/util/Iterator;
        //    68: astore          8
        //    70: aload           8
        //    72: invokeinterface java/util/Iterator.hasNext:()Z
        //    77: ifeq            151
        //    80: aload           8
        //    82: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    87: checkcast       Ljava/util/Map$Entry;
        //    90: astore          item$iv$iv
        //    92: aload           destination$iv$iv
        //    94: aload           item$iv$iv
        //    96: astore          10
        //    98: astore          11
        //   100: new             Lgg/essential/gui/screenshot/handler/SerializedChecksum;
        //   103: dup            
        //   104: aload           it
        //   106: invokeinterface java/util/Map$Entry.getValue:()Ljava/lang/Object;
        //   111: dup            
        //   112: ldc             "it.value"
        //   114: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   117: checkcast       Ljava/lang/String;
        //   120: aload           it
        //   122: invokeinterface java/util/Map$Entry.getKey:()Ljava/lang/Object;
        //   127: dup            
        //   128: ldc             "it.key"
        //   130: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   133: checkcast       Lgg/essential/gui/screenshot/handler/ChecksumSnapshot;
        //   136: invokespecial   gg/essential/gui/screenshot/handler/SerializedChecksum.<init>:(Ljava/lang/String;Lgg/essential/gui/screenshot/handler/ChecksumSnapshot;)V
        //   139: aload           11
        //   141: swap           
        //   142: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //   147: pop            
        //   148: goto            70
        //   151: aload           destination$iv$iv
        //   153: checkcast       Ljava/util/List;
        //   156: astore          11
        //   158: aload           5
        //   160: aload           4
        //   162: aload           11
        //   164: invokevirtual   gg/essential/lib/gson/Gson.toJson:(Ljava/lang/Object;)Ljava/lang/String;
        //   167: checkcast       Ljava/lang/CharSequence;
        //   170: getstatic       java/nio/charset/StandardCharsets.UTF_8:Ljava/nio/charset/Charset;
        //   173: invokestatic    org/apache/commons/io/FileUtils.write:(Ljava/io/File;Ljava/lang/CharSequence;Ljava/nio/charset/Charset;)V
        //   176: getstatic       kotlin/Unit.INSTANCE:Lkotlin/Unit;
        //   179: pop            
        //   180: aload_1        
        //   181: monitorexit    
        //   182: goto            190
        //   185: astore_2       
        //   186: aload_1        
        //   187: monitorexit    
        //   188: aload_2        
        //   189: athrow         
        //   190: return         
        //    StackMapTable: 00 05 08 FF 00 3D 00 09 00 07 00 40 00 00 07 00 39 07 00 5D 00 07 00 E4 07 00 B8 00 00 FA 00 50 FF 00 21 00 02 00 07 00 40 00 01 07 00 83 F9 00 04
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  15     180    185    190    Any
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private final String readFileChecksum(final File file) {
        String md5Hex;
        try {
            md5Hex = DigestUtils.md5Hex(FileUtils.readFileToByteArray(file));
        }
        catch (final IOException e) {
            e.printStackTrace();
            md5Hex = null;
        }
        return md5Hex;
    }
    
    private final ChecksumSnapshot getChecksumSnapshot(final File file) {
        final String name = file.getName();
        Intrinsics.checkNotNullExpressionValue((Object)name, "file.name");
        return new ChecksumSnapshot(name, file.lastModified(), file.length());
    }
    
    public final void delete(@NotNull final File file) {
        Intrinsics.checkNotNullParameter((Object)file, "file");
        this.entries.remove(this.getChecksumSnapshot(file));
    }
    
    private static final void entries$lambda-0(final ScreenshotChecksumManager this$0) {
        Intrinsics.checkNotNullParameter((Object)this$0, "this$0");
        this$0.saveState();
    }
}
