package gg.essential.gui.account.factory;

import java.nio.file.*;
import java.util.concurrent.locks.*;
import kotlin.jvm.internal.*;
import kotlin.*;
import java.util.concurrent.*;
import java.net.*;
import net.minecraft.client.util.*;
import java.time.*;
import com.mojang.authlib.exceptions.*;
import gg.essential.*;
import java.time.temporal.*;
import gg.essential.elementa.components.*;
import kotlin.jvm.functions.*;
import com.mojang.authlib.*;
import java.util.*;
import org.jetbrains.annotations.*;
import java.lang.reflect.*;
import gg.essential.lib.gson.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000h
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0005
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010$
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0003
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0003
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0003
                                                   \u0002\u0010\u000b
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0002\b\u0003
                                                   \u0002\u0010\u0000
                                                   \u0002\b\u0005\u0018\u00002\u00020\u0001:\u0004)*+,B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u0012H\u0002J\u0014\u0010\u001b\u001a\u00020\u00132\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dJ\u0018\u0010\u001f\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u00132\u0006\u0010!\u001a\u00020"H\u0016J\u0010\u0010#\u001a\u00020$2\u0006\u0010\u001a\u001a\u00020\u0012H\u0002J\u0006\u0010%\u001a\u00020$J\u0010\u0010&\u001a\u00020$2\u0006\u0010\u001a\u001a\u00020\u0012H\u0016J\u0010\u0010'\u001a
                                                    \u0007*\u0004\u0018\u00010(0(H\u0002R\u0016\u0010\u0005\u001a
                                                    \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u001c\u0010\b\u001a\u0004\u0018\u00010	X\u0086\u000e¢\u0006\u000e
                                                   \u0000\u001a\u0004\b
                                                   \u0010\u000b"\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002
                                                   \u0000R \u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0016\u001a
                                                    \u0007*\u0004\u0018\u00010\u00170\u0017X\u0082\u0004¢\u0006\u0002
                                                   \u0000¨\u0006-""" }, d2 = { "Lgg/essential/gui/account/factory/MicrosoftAccountSessionFactory;", "Lgg/essential/gui/account/factory/ManagedSessionFactory;", "savePath", "Ljava/nio/file/Path;", "(Ljava/nio/file/Path;)V", "gson", "Lgg/essential/lib/gson/Gson;", "kotlin.jvm.PlatformType", "latestAuthService", "Lgg/essential/gui/account/MicrosoftUserAuthentication;", "getLatestAuthService", "()Lgg/essential/gui/account/MicrosoftUserAuthentication;", "setLatestAuthService", "(Lgg/essential/gui/account/MicrosoftUserAuthentication;)V", "lock", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "sessions", "", "Ljava/util/UUID;", "Lnet/minecraft/client/util/Session;", "getSessions", "()Ljava/util/Map;", "state", "Lgg/essential/gui/account/factory/MicrosoftAccountSessionFactory$State;", "getExpiryTime", "Ljava/time/Instant;", "uuid", "login", "future", "Ljava/util/concurrent/CompletableFuture;", "Ljava/net/URI;", "refresh", "session", "force", "", "refreshRefreshToken", "", "refreshRefreshTokensIfNecessary", "remove", "save", "", "GameProfileSerializer", "InstantSerializer", "MicrosoftAccount", "State", "essential" })
public final class MicrosoftAccountSessionFactory implements ManagedSessionFactory
{
    @NotNull
    private final Path savePath;
    private final Gson gson;
    @NotNull
    private final ReentrantReadWriteLock lock;
    private final State state;
    
    public MicrosoftAccountSessionFactory(@NotNull final Path savePath) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "savePath"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_0         /* this */
        //     7: invokespecial   java/lang/Object.<init>:()V
        //    10: aload_0         /* this */
        //    11: aload_1         /* savePath */
        //    12: putfield        gg/essential/gui/account/factory/MicrosoftAccountSessionFactory.savePath:Ljava/nio/file/Path;
        //    15: aload_0         /* this */
        //    16: new             Lgg/essential/lib/gson/GsonBuilder;
        //    19: dup            
        //    20: invokespecial   gg/essential/lib/gson/GsonBuilder.<init>:()V
        //    23: astore_2       
        //    24: aload_2        
        //    25: astore_3       
        //    26: astore          5
        //    28: aload_3         /* $this$gson_u24lambda_u2d0 */
        //    29: ldc             Lcom/mojang/authlib/GameProfile;.class
        //    31: checkcast       Ljava/lang/reflect/Type;
        //    34: new             Lgg/essential/gui/account/factory/MicrosoftAccountSessionFactory$GameProfileSerializer;
        //    37: dup            
        //    38: invokespecial   gg/essential/gui/account/factory/MicrosoftAccountSessionFactory$GameProfileSerializer.<init>:()V
        //    41: invokevirtual   gg/essential/lib/gson/GsonBuilder.registerTypeAdapter:(Ljava/lang/reflect/Type;Ljava/lang/Object;)Lgg/essential/lib/gson/GsonBuilder;
        //    44: pop            
        //    45: aload_3         /* $this$gson_u24lambda_u2d0 */
        //    46: ldc             Ljava/time/Instant;.class
        //    48: checkcast       Ljava/lang/reflect/Type;
        //    51: new             Lgg/essential/gui/account/factory/MicrosoftAccountSessionFactory$InstantSerializer;
        //    54: dup            
        //    55: invokespecial   gg/essential/gui/account/factory/MicrosoftAccountSessionFactory$InstantSerializer.<init>:()V
        //    58: invokevirtual   gg/essential/lib/gson/GsonBuilder.registerTypeAdapter:(Ljava/lang/reflect/Type;Ljava/lang/Object;)Lgg/essential/lib/gson/GsonBuilder;
        //    61: pop            
        //    62: aload           5
        //    64: aload_2        
        //    65: invokevirtual   gg/essential/lib/gson/GsonBuilder.create:()Lgg/essential/lib/gson/Gson;
        //    68: putfield        gg/essential/gui/account/factory/MicrosoftAccountSessionFactory.gson:Lgg/essential/lib/gson/Gson;
        //    71: aload_0         /* this */
        //    72: new             Ljava/util/concurrent/locks/ReentrantReadWriteLock;
        //    75: dup            
        //    76: invokespecial   java/util/concurrent/locks/ReentrantReadWriteLock.<init>:()V
        //    79: putfield        gg/essential/gui/account/factory/MicrosoftAccountSessionFactory.lock:Ljava/util/concurrent/locks/ReentrantReadWriteLock;
        //    82: aload_0         /* this */
        //    83: aload_0         /* this */
        //    84: getfield        gg/essential/gui/account/factory/MicrosoftAccountSessionFactory.savePath:Ljava/nio/file/Path;
        //    87: iconst_0       
        //    88: anewarray       Ljava/nio/file/LinkOption;
        //    91: invokestatic    java/nio/file/Files.exists:(Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Z
        //    94: ifeq            274
        //    97: astore          5
        //    99: aload           5
        //   101: aload_0         /* this */
        //   102: getfield        gg/essential/gui/account/factory/MicrosoftAccountSessionFactory.savePath:Ljava/nio/file/Path;
        //   105: invokestatic    java/nio/file/Files.newBufferedReader:(Ljava/nio/file/Path;)Ljava/io/BufferedReader;
        //   108: checkcast       Ljava/io/Closeable;
        //   111: astore_2       
        //   112: astore          6
        //   114: aconst_null    
        //   115: astore_3       
        //   116: aload_2        
        //   117: checkcast       Ljava/io/BufferedReader;
        //   120: astore          it
        //   122: aload_0         /* this */
        //   123: getfield        gg/essential/gui/account/factory/MicrosoftAccountSessionFactory.gson:Lgg/essential/lib/gson/Gson;
        //   126: aload           it
        //   128: checkcast       Ljava/io/Reader;
        //   131: ldc             Lgg/essential/gui/account/factory/MicrosoftAccountSessionFactory$State;.class
        //   133: invokevirtual   gg/essential/lib/gson/Gson.fromJson:(Ljava/io/Reader;Ljava/lang/Class;)Ljava/lang/Object;
        //   136: checkcast       Lgg/essential/gui/account/factory/MicrosoftAccountSessionFactory$State;
        //   139: astore          null
        //   141: aload_2        
        //   142: aload_3        
        //   143: invokestatic    kotlin/io/CloseableKt.closeFinally:(Ljava/io/Closeable;Ljava/lang/Throwable;)V
        //   146: aload           4
        //   148: goto            169
        //   151: astore          4
        //   153: aload           4
        //   155: astore_3       
        //   156: aload           4
        //   158: athrow         
        //   159: astore          4
        //   161: aload_2        
        //   162: aload_3        
        //   163: invokestatic    kotlin/io/CloseableKt.closeFinally:(Ljava/io/Closeable;Ljava/lang/Throwable;)V
        //   166: aload           4
        //   168: athrow         
        //   169: aload           6
        //   171: swap           
        //   172: astore_2       
        //   173: goto            270
        //   176: astore_3       
        //   177: aload           5
        //   179: astore          5
        //   181: aload           5
        //   183: aload_0         /* this */
        //   184: getfield        gg/essential/gui/account/factory/MicrosoftAccountSessionFactory.savePath:Ljava/nio/file/Path;
        //   187: aload_0         /* this */
        //   188: getfield        gg/essential/gui/account/factory/MicrosoftAccountSessionFactory.savePath:Ljava/nio/file/Path;
        //   191: aload_0         /* this */
        //   192: getfield        gg/essential/gui/account/factory/MicrosoftAccountSessionFactory.savePath:Ljava/nio/file/Path;
        //   195: invokeinterface java/nio/file/Path.getFileName:()Ljava/nio/file/Path;
        //   200: invokedynamic   BootstrapMethod #0, makeConcatWithConstants:(Ljava/nio/file/Path;)Ljava/lang/String;
        //   205: invokeinterface java/nio/file/Path.resolveSibling:(Ljava/lang/String;)Ljava/nio/file/Path;
        //   210: iconst_1       
        //   211: anewarray       Ljava/nio/file/CopyOption;
        //   214: astore          4
        //   216: aload           4
        //   218: iconst_0       
        //   219: getstatic       java/nio/file/StandardCopyOption.REPLACE_EXISTING:Ljava/nio/file/StandardCopyOption;
        //   222: checkcast       Ljava/nio/file/CopyOption;
        //   225: aastore        
        //   226: aload           4
        //   228: invokestatic    java/nio/file/Files.move:(Ljava/nio/file/Path;Ljava/nio/file/Path;[Ljava/nio/file/CopyOption;)Ljava/nio/file/Path;
        //   231: pop            
        //   232: goto            238
        //   235: pop            
        //   236: aload           5
        //   238: aload_3         /* e */
        //   239: invokevirtual   gg/essential/lib/gson/JsonSyntaxException.printStackTrace:()V
        //   242: getstatic       gg/essential/gui/notification/Notifications.INSTANCE:Lgg/essential/gui/notification/Notifications;
        //   245: ldc             "Account Manager"
        //   247: ldc             "Failed to load accounts. You may need to add accounts again."
        //   249: invokevirtual   gg/essential/gui/notification/Notifications.push:(Ljava/lang/String;Ljava/lang/String;)V
        //   252: new             Lgg/essential/gui/account/factory/MicrosoftAccountSessionFactory$State;
        //   255: dup            
        //   256: new             Ljava/util/ArrayList;
        //   259: dup            
        //   260: invokespecial   java/util/ArrayList.<init>:()V
        //   263: checkcast       Ljava/util/List;
        //   266: invokespecial   gg/essential/gui/account/factory/MicrosoftAccountSessionFactory$State.<init>:(Ljava/util/List;)V
        //   269: astore_2       
        //   270: aload_2        
        //   271: goto            291
        //   274: new             Lgg/essential/gui/account/factory/MicrosoftAccountSessionFactory$State;
        //   277: dup            
        //   278: new             Ljava/util/ArrayList;
        //   281: dup            
        //   282: invokespecial   java/util/ArrayList.<init>:()V
        //   285: checkcast       Ljava/util/List;
        //   288: invokespecial   gg/essential/gui/account/factory/MicrosoftAccountSessionFactory$State.<init>:(Ljava/util/List;)V
        //   291: putfield        gg/essential/gui/account/factory/MicrosoftAccountSessionFactory.state:Lgg/essential/gui/account/factory/MicrosoftAccountSessionFactory$State;
        //   294: return         
        //    MethodParameters:
        //  Name      Flags  
        //  --------  -----
        //  savePath  
        //    StackMapTable: 00 09 FF 00 97 00 07 07 00 02 07 00 95 07 00 83 05 00 07 00 02 07 00 02 00 01 07 00 4B FF 00 07 00 07 07 00 02 07 00 95 07 00 83 07 00 4B 00 07 00 02 07 00 02 00 01 07 00 4B FF 00 09 00 07 07 00 02 07 00 95 07 00 83 05 07 00 41 07 00 02 07 00 02 00 01 07 00 41 FF 00 06 00 06 07 00 02 07 00 95 07 00 04 07 00 04 00 07 00 02 00 01 07 00 4F FF 00 3A 00 06 07 00 02 07 00 95 07 00 04 07 00 4F 00 07 00 02 00 01 07 00 4D 42 07 00 02 FF 00 1F 00 06 07 00 02 07 00 95 07 00 41 07 00 4F 00 07 00 02 00 01 07 00 02 FF 00 03 00 06 07 00 02 07 00 95 07 00 5D 07 00 5D 00 07 00 02 00 01 07 00 02 FF 00 10 00 06 07 00 02 07 00 95 07 00 04 07 00 04 00 07 00 02 00 02 07 00 02 07 00 41
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  116    141    151    159    Ljava/lang/Throwable;
        //  116    141    159    169    Any
        //  151    159    159    169    Any
        //  181    232    235    238    Ljava/io/IOException;
        //  99     173    176    270    Lgg/essential/lib/gson/JsonSyntaxException;
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private final Object save() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        gg/essential/gui/account/factory/MicrosoftAccountSessionFactory.lock:Ljava/util/concurrent/locks/ReentrantReadWriteLock;
        //     4: astore_1       
        //     5: aload_1        
        //     6: invokevirtual   java/util/concurrent/locks/ReentrantReadWriteLock.readLock:()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;
        //     9: astore_2       
        //    10: aload_1        
        //    11: invokevirtual   java/util/concurrent/locks/ReentrantReadWriteLock.getWriteHoldCount:()I
        //    14: ifne            24
        //    17: aload_1        
        //    18: invokevirtual   java/util/concurrent/locks/ReentrantReadWriteLock.getReadHoldCount:()I
        //    21: goto            25
        //    24: iconst_0       
        //    25: istore_3       
        //    26: iconst_0       
        //    27: istore          4
        //    29: iload           4
        //    31: iload_3        
        //    32: if_icmpge       45
        //    35: aload_2        
        //    36: invokevirtual   java/util/concurrent/locks/ReentrantReadWriteLock$ReadLock.unlock:()V
        //    39: iinc            4, 1
        //    42: goto            29
        //    45: aload_1        
        //    46: invokevirtual   java/util/concurrent/locks/ReentrantReadWriteLock.writeLock:()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;
        //    49: astore          4
        //    51: aload           4
        //    53: invokevirtual   java/util/concurrent/locks/ReentrantReadWriteLock$WriteLock.lock:()V
        //    56: aload_0         /* this */
        //    57: getfield        gg/essential/gui/account/factory/MicrosoftAccountSessionFactory.savePath:Ljava/nio/file/Path;
        //    60: invokeinterface java/nio/file/Path.getParent:()Ljava/nio/file/Path;
        //    65: ldc             "essential-microsoft-accounts"
        //    67: ldc             ".json"
        //    69: iconst_0       
        //    70: anewarray       Ljava/nio/file/attribute/FileAttribute;
        //    73: invokestatic    java/nio/file/Files.createTempFile:(Ljava/nio/file/Path;Ljava/lang/String;Ljava/lang/String;[Ljava/nio/file/attribute/FileAttribute;)Ljava/nio/file/Path;
        //    76: astore          tempFile
        //    78: aload           tempFile
        //    80: aload_0         /* this */
        //    81: getfield        gg/essential/gui/account/factory/MicrosoftAccountSessionFactory.gson:Lgg/essential/lib/gson/Gson;
        //    84: aload_0         /* this */
        //    85: getfield        gg/essential/gui/account/factory/MicrosoftAccountSessionFactory.state:Lgg/essential/gui/account/factory/MicrosoftAccountSessionFactory$State;
        //    88: invokevirtual   gg/essential/lib/gson/Gson.toJson:(Ljava/lang/Object;)Ljava/lang/String;
        //    91: dup            
        //    92: ldc_w           "gson.toJson(state)"
        //    95: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //    98: getstatic       kotlin/text/Charsets.UTF_8:Ljava/nio/charset/Charset;
        //   101: swap           
        //   102: swap           
        //   103: invokevirtual   java/lang/String.getBytes:(Ljava/nio/charset/Charset;)[B
        //   106: dup            
        //   107: ldc_w           "this as java.lang.String).getBytes(charset)"
        //   110: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   113: iconst_0       
        //   114: anewarray       Ljava/nio/file/OpenOption;
        //   117: invokestatic    java/nio/file/Files.write:(Ljava/nio/file/Path;[B[Ljava/nio/file/OpenOption;)Ljava/nio/file/Path;
        //   120: pop            
        //   121: aload           tempFile
        //   123: aload_0         /* this */
        //   124: getfield        gg/essential/gui/account/factory/MicrosoftAccountSessionFactory.savePath:Ljava/nio/file/Path;
        //   127: iconst_2       
        //   128: anewarray       Ljava/nio/file/CopyOption;
        //   131: astore          7
        //   133: aload           7
        //   135: iconst_0       
        //   136: getstatic       java/nio/file/StandardCopyOption.REPLACE_EXISTING:Ljava/nio/file/StandardCopyOption;
        //   139: checkcast       Ljava/nio/file/CopyOption;
        //   142: aastore        
        //   143: aload           7
        //   145: iconst_1       
        //   146: getstatic       java/nio/file/StandardCopyOption.ATOMIC_MOVE:Ljava/nio/file/StandardCopyOption;
        //   149: checkcast       Ljava/nio/file/CopyOption;
        //   152: aastore        
        //   153: aload           7
        //   155: invokestatic    java/nio/file/Files.move:(Ljava/nio/file/Path;Ljava/nio/file/Path;[Ljava/nio/file/CopyOption;)Ljava/nio/file/Path;
        //   158: astore          7
        //   160: goto            199
        //   163: astore          e
        //   165: aload           e
        //   167: invokevirtual   kotlin/io/FileSystemException.printStackTrace:()V
        //   170: aload           tempFile
        //   172: aload_0         /* this */
        //   173: getfield        gg/essential/gui/account/factory/MicrosoftAccountSessionFactory.savePath:Ljava/nio/file/Path;
        //   176: iconst_1       
        //   177: anewarray       Ljava/nio/file/CopyOption;
        //   180: astore          9
        //   182: aload           9
        //   184: iconst_0       
        //   185: getstatic       java/nio/file/StandardCopyOption.REPLACE_EXISTING:Ljava/nio/file/StandardCopyOption;
        //   188: checkcast       Ljava/nio/file/CopyOption;
        //   191: aastore        
        //   192: aload           9
        //   194: invokestatic    java/nio/file/Files.move:(Ljava/nio/file/Path;Ljava/nio/file/Path;[Ljava/nio/file/CopyOption;)Ljava/nio/file/Path;
        //   197: astore          7
        //   199: aload           7
        //   201: astore          7
        //   203: aload           tempFile
        //   205: invokestatic    java/nio/file/Files.deleteIfExists:(Ljava/nio/file/Path;)Z
        //   208: pop            
        //   209: goto            255
        //   212: astore          e
        //   214: aload           e
        //   216: invokevirtual   java/io/IOException.printStackTrace:()V
        //   219: getstatic       gg/essential/gui/notification/Notifications.INSTANCE:Lgg/essential/gui/notification/Notifications;
        //   222: ldc             "Account Manager"
        //   224: ldc_w           "Unable to save accounts. If issues persist please contact support"
        //   227: invokevirtual   gg/essential/gui/notification/Notifications.push:(Ljava/lang/String;Ljava/lang/String;)V
        //   230: getstatic       kotlin/Unit.INSTANCE:Lkotlin/Unit;
        //   233: astore          7
        //   235: aload           tempFile
        //   237: invokestatic    java/nio/file/Files.deleteIfExists:(Ljava/nio/file/Path;)Z
        //   240: pop            
        //   241: goto            255
        //   244: astore          8
        //   246: aload           tempFile
        //   248: invokestatic    java/nio/file/Files.deleteIfExists:(Ljava/nio/file/Path;)Z
        //   251: pop            
        //   252: aload           8
        //   254: athrow         
        //   255: aload           7
        //   257: astore          null
        //   259: iconst_0       
        //   260: istore          6
        //   262: iload           6
        //   264: iload_3        
        //   265: if_icmpge       278
        //   268: aload_2        
        //   269: invokevirtual   java/util/concurrent/locks/ReentrantReadWriteLock$ReadLock.lock:()V
        //   272: iinc            6, 1
        //   275: goto            262
        //   278: aload           4
        //   280: invokevirtual   java/util/concurrent/locks/ReentrantReadWriteLock$WriteLock.unlock:()V
        //   283: aload           5
        //   285: goto            317
        //   288: astore          5
        //   290: iconst_0       
        //   291: istore          6
        //   293: iload           6
        //   295: iload_3        
        //   296: if_icmpge       309
        //   299: aload_2        
        //   300: invokevirtual   java/util/concurrent/locks/ReentrantReadWriteLock$ReadLock.lock:()V
        //   303: iinc            6, 1
        //   306: goto            293
        //   309: aload           4
        //   311: invokevirtual   java/util/concurrent/locks/ReentrantReadWriteLock$WriteLock.unlock:()V
        //   314: aload           5
        //   316: athrow         
        //   317: areturn        
        //    StackMapTable: 00 0F FD 00 18 07 00 72 07 00 E9 40 01 FD 00 03 01 01 0F FF 00 75 00 07 07 00 02 07 00 72 07 00 E9 01 07 00 F2 00 07 00 95 00 01 07 00 DC FC 00 23 07 00 95 FF 00 0C 00 07 07 00 02 07 00 72 07 00 E9 01 07 00 F2 00 07 00 95 00 01 07 00 4D 5F 07 00 4B FC 00 0A 07 00 04 FF 00 06 00 08 07 00 02 07 00 72 07 00 E9 01 07 00 F2 07 00 04 01 07 00 04 00 00 0F FF 00 09 00 05 07 00 02 07 00 72 07 00 E9 01 07 00 F2 00 01 07 00 4B FD 00 04 07 00 4B 01 0F FF 00 07 00 08 07 00 02 07 00 72 07 00 E9 01 07 00 F2 07 00 04 01 07 00 04 00 01 07 00 04
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                           
        //  -----  -----  -----  -----  -------------------------------
        //  121    160    163    199    Lkotlin/io/FileSystemException;
        //  78     203    212    244    Ljava/io/IOException;
        //  78     203    244    255    Any
        //  212    235    244    255    Any
        //  56     259    288    317    Any
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @Override
    public void remove(@NotNull final UUID uuid) {
        Intrinsics.checkNotNullParameter((Object)uuid, "uuid");
        final ReentrantReadWriteLock lock = this.lock;
        final ReentrantReadWriteLock.ReadLock lock2 = lock.readLock();
        final int n = (lock.getWriteHoldCount() == 0) ? lock.getReadHoldCount() : 0;
        for (int i = 0; i < n; ++i) {
            lock2.unlock();
        }
        final ReentrantReadWriteLock.WriteLock writeLock = lock.writeLock();
        writeLock.lock();
        try {
            while (true) {
                for (final Object next : this.state.getAccounts()) {
                    final MicrosoftAccountSessionFactory.MicrosoftAccount it = (MicrosoftAccountSessionFactory.MicrosoftAccount)next;
                    if (Intrinsics.areEqual((Object)it.getUuid(), (Object)uuid)) {
                        final MicrosoftAccountSessionFactory.MicrosoftAccount microsoftAccount = (MicrosoftAccountSessionFactory.MicrosoftAccount)next;
                        final MicrosoftAccountSessionFactory.MicrosoftAccount microsoftAccount2 = microsoftAccount;
                        if (microsoftAccount2 == null) {
                            return;
                        }
                        final MicrosoftAccountSessionFactory.MicrosoftAccount account = microsoftAccount2;
                        this.state.getAccounts().remove(account);
                        this.save();
                        final Unit instance = Unit.INSTANCE;
                        return;
                    }
                }
                final MicrosoftAccountSessionFactory.MicrosoftAccount microsoftAccount = null;
                continue;
            }
        }
        finally {
            for (int j = 0; j < n; ++j) {
                lock2.lock();
            }
            writeLock.unlock();
        }
    }
    
    @NotNull
    public final Session login(@NotNull final CompletableFuture<URI> future) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc_w           "future"
        //     4: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     7: new             Lgg/essential/gui/account/MicrosoftUserAuthentication;
        //    10: dup            
        //    11: invokespecial   gg/essential/gui/account/MicrosoftUserAuthentication.<init>:()V
        //    14: astore_2        /* userAuthService */
        //    15: aload_2         /* userAuthService */
        //    16: aload_1         /* future */
        //    17: invokestatic    gg/essential/gui/account/MicrosoftUserAuthentication.logIn$default$58ef0aab$1918adb1:(Lgg/essential/gui/account/MicrosoftUserAuthentication;Ljava/util/concurrent/CompletableFuture;)Lkotlin/Pair;
        //    20: astore_3       
        //    21: aload_3        
        //    22: invokevirtual   kotlin/Pair.component1:()Ljava/lang/Object;
        //    25: checkcast       Lcom/mojang/authlib/GameProfile;
        //    28: astore          profile
        //    30: aload_3        
        //    31: invokevirtual   kotlin/Pair.component2:()Ljava/lang/Object;
        //    34: checkcast       Ljava/lang/String;
        //    37: astore          token
        //    39: new             Lgg/essential/gui/account/factory/MicrosoftAccountSessionFactory$MicrosoftAccount;
        //    42: dup            
        //    43: aload           profile
        //    45: invokevirtual   com/mojang/authlib/GameProfile.getId:()Ljava/util/UUID;
        //    48: dup            
        //    49: ldc_w           "profile.id"
        //    52: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //    55: aload           profile
        //    57: invokevirtual   com/mojang/authlib/GameProfile.getName:()Ljava/lang/String;
        //    60: dup            
        //    61: ldc_w           "profile.name"
        //    64: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //    67: aload           token
        //    69: aload_2         /* userAuthService */
        //    70: invokespecial   gg/essential/gui/account/factory/MicrosoftAccountSessionFactory$MicrosoftAccount.<init>:(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;Lgg/essential/gui/account/MicrosoftUserAuthentication;)V
        //    73: astore          account
        //    75: aload_0         /* this */
        //    76: getfield        gg/essential/gui/account/factory/MicrosoftAccountSessionFactory.lock:Ljava/util/concurrent/locks/ReentrantReadWriteLock;
        //    79: astore          7
        //    81: aload           7
        //    83: invokevirtual   java/util/concurrent/locks/ReentrantReadWriteLock.readLock:()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;
        //    86: astore          8
        //    88: aload           7
        //    90: invokevirtual   java/util/concurrent/locks/ReentrantReadWriteLock.getWriteHoldCount:()I
        //    93: ifne            104
        //    96: aload           7
        //    98: invokevirtual   java/util/concurrent/locks/ReentrantReadWriteLock.getReadHoldCount:()I
        //   101: goto            105
        //   104: iconst_0       
        //   105: istore          9
        //   107: iconst_0       
        //   108: istore          10
        //   110: iload           10
        //   112: iload           9
        //   114: if_icmpge       128
        //   117: aload           8
        //   119: invokevirtual   java/util/concurrent/locks/ReentrantReadWriteLock$ReadLock.unlock:()V
        //   122: iinc            10, 1
        //   125: goto            110
        //   128: aload           7
        //   130: invokevirtual   java/util/concurrent/locks/ReentrantReadWriteLock.writeLock:()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;
        //   133: astore          10
        //   135: aload           10
        //   137: invokevirtual   java/util/concurrent/locks/ReentrantReadWriteLock$WriteLock.lock:()V
        //   140: aload_0         /* this */
        //   141: getfield        gg/essential/gui/account/factory/MicrosoftAccountSessionFactory.state:Lgg/essential/gui/account/factory/MicrosoftAccountSessionFactory$State;
        //   144: invokevirtual   gg/essential/gui/account/factory/MicrosoftAccountSessionFactory$State.getAccounts:()Ljava/util/List;
        //   147: aload           profile
        //   149: invokedynamic   BootstrapMethod #1, test:(Lcom/mojang/authlib/GameProfile;)Ljava/util/function/Predicate;
        //   154: invokeinterface java/util/List.removeIf:(Ljava/util/function/Predicate;)Z
        //   159: pop            
        //   160: aload_0         /* this */
        //   161: getfield        gg/essential/gui/account/factory/MicrosoftAccountSessionFactory.state:Lgg/essential/gui/account/factory/MicrosoftAccountSessionFactory$State;
        //   164: invokevirtual   gg/essential/gui/account/factory/MicrosoftAccountSessionFactory$State.getAccounts:()Ljava/util/List;
        //   167: aload           account
        //   169: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   174: pop            
        //   175: aload_0         /* this */
        //   176: invokespecial   gg/essential/gui/account/factory/MicrosoftAccountSessionFactory.save:()Ljava/lang/Object;
        //   179: pop            
        //   180: aload           account
        //   182: invokevirtual   gg/essential/gui/account/factory/MicrosoftAccountSessionFactory$MicrosoftAccount.toSession:()Lnet/minecraft/client/util/Session;
        //   185: astore          null
        //   187: iconst_0       
        //   188: istore          12
        //   190: iload           12
        //   192: iload           9
        //   194: if_icmpge       208
        //   197: aload           8
        //   199: invokevirtual   java/util/concurrent/locks/ReentrantReadWriteLock$ReadLock.lock:()V
        //   202: iinc            12, 1
        //   205: goto            190
        //   208: aload           10
        //   210: invokevirtual   java/util/concurrent/locks/ReentrantReadWriteLock$WriteLock.unlock:()V
        //   213: aload           11
        //   215: goto            249
        //   218: astore          11
        //   220: iconst_0       
        //   221: istore          12
        //   223: iload           12
        //   225: iload           9
        //   227: if_icmpge       241
        //   230: aload           8
        //   232: invokevirtual   java/util/concurrent/locks/ReentrantReadWriteLock$ReadLock.lock:()V
        //   235: iinc            12, 1
        //   238: goto            223
        //   241: aload           10
        //   243: invokevirtual   java/util/concurrent/locks/ReentrantReadWriteLock$WriteLock.unlock:()V
        //   246: aload           11
        //   248: athrow         
        //   249: areturn        
        //    Signature:
        //  (Ljava/util/concurrent/CompletableFuture<Ljava/net/URI;>;)Lnet/minecraft/client/util/Session;
        //    MethodParameters:
        //  Name    Flags  
        //  ------  -----
        //  future  
        //    StackMapTable: 00 0A FF 00 68 00 09 07 00 02 07 01 7D 07 01 60 07 01 67 07 00 60 07 01 12 07 00 43 07 00 72 07 00 E9 00 00 40 01 FD 00 04 01 01 11 FF 00 3D 00 0D 07 00 02 07 01 7D 07 01 60 07 01 67 07 00 60 07 01 12 07 00 43 07 00 72 07 00 E9 01 07 00 F2 07 01 9D 01 00 00 11 FF 00 09 00 0B 07 00 02 07 01 7D 07 01 60 07 01 67 07 00 60 07 01 12 07 00 43 07 00 72 07 00 E9 01 07 00 F2 00 01 07 00 4B FD 00 04 07 00 4B 01 11 FF 00 07 00 0D 07 00 02 07 01 7D 07 01 60 07 01 67 07 00 60 07 01 12 07 00 43 07 00 72 07 00 E9 01 07 00 F2 07 01 9D 01 00 01 07 01 9D
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  140    187    218    249    Any
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @NotNull
    @Override
    public Session refresh(@NotNull final Session session, final boolean force) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc_w           "session"
        //     4: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     7: aload_0         /* this */
        //     8: getfield        gg/essential/gui/account/factory/MicrosoftAccountSessionFactory.lock:Ljava/util/concurrent/locks/ReentrantReadWriteLock;
        //    11: astore_3       
        //    12: aload_3        
        //    13: invokevirtual   java/util/concurrent/locks/ReentrantReadWriteLock.readLock:()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;
        //    16: astore          4
        //    18: aload_3        
        //    19: invokevirtual   java/util/concurrent/locks/ReentrantReadWriteLock.getWriteHoldCount:()I
        //    22: ifne            32
        //    25: aload_3        
        //    26: invokevirtual   java/util/concurrent/locks/ReentrantReadWriteLock.getReadHoldCount:()I
        //    29: goto            33
        //    32: iconst_0       
        //    33: istore          5
        //    35: iconst_0       
        //    36: istore          6
        //    38: iload           6
        //    40: iload           5
        //    42: if_icmpge       56
        //    45: aload           4
        //    47: invokevirtual   java/util/concurrent/locks/ReentrantReadWriteLock$ReadLock.unlock:()V
        //    50: iinc            6, 1
        //    53: goto            38
        //    56: aload_3        
        //    57: invokevirtual   java/util/concurrent/locks/ReentrantReadWriteLock.writeLock:()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;
        //    60: astore          6
        //    62: aload           6
        //    64: invokevirtual   java/util/concurrent/locks/ReentrantReadWriteLock$WriteLock.lock:()V
        //    67: aload_1         /* session */
        //    68: invokevirtual   net/minecraft/client/util/Session.getUuid:()Ljava/lang/String;
        //    71: invokestatic    gg/essential/util/UUIDUtil.formatWithDashes:(Ljava/lang/String;)Ljava/util/UUID;
        //    74: astore          uuid
        //    76: aload_0         /* this */
        //    77: getfield        gg/essential/gui/account/factory/MicrosoftAccountSessionFactory.state:Lgg/essential/gui/account/factory/MicrosoftAccountSessionFactory$State;
        //    80: invokevirtual   gg/essential/gui/account/factory/MicrosoftAccountSessionFactory$State.getAccounts:()Ljava/util/List;
        //    83: checkcast       Ljava/lang/Iterable;
        //    86: astore          9
        //    88: aload           9
        //    90: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //    95: astore          10
        //    97: aload           10
        //    99: invokeinterface java/util/Iterator.hasNext:()Z
        //   104: ifeq            141
        //   107: aload           10
        //   109: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   114: astore          11
        //   116: aload           11
        //   118: checkcast       Lgg/essential/gui/account/factory/MicrosoftAccountSessionFactory$MicrosoftAccount;
        //   121: astore          it
        //   123: aload           it
        //   125: invokevirtual   gg/essential/gui/account/factory/MicrosoftAccountSessionFactory$MicrosoftAccount.getUuid:()Ljava/util/UUID;
        //   128: aload           uuid
        //   130: invokestatic    kotlin/jvm/internal/Intrinsics.areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   133: ifeq            97
        //   136: aload           11
        //   138: goto            142
        //   141: aconst_null    
        //   142: checkcast       Lgg/essential/gui/account/factory/MicrosoftAccountSessionFactory$MicrosoftAccount;
        //   145: dup            
        //   146: ifnonnull       158
        //   149: pop            
        //   150: new             Lcom/mojang/authlib/exceptions/InvalidCredentialsException;
        //   153: dup            
        //   154: invokespecial   com/mojang/authlib/exceptions/InvalidCredentialsException.<init>:()V
        //   157: athrow         
        //   158: astore          account
        //   160: aload           account
        //   162: invokevirtual   gg/essential/gui/account/factory/MicrosoftAccountSessionFactory$MicrosoftAccount.getAuth:()Lgg/essential/gui/account/MicrosoftUserAuthentication;
        //   165: aconst_null    
        //   166: invokestatic    java/util/concurrent/CompletableFuture.completedFuture:(Ljava/lang/Object;)Ljava/util/concurrent/CompletableFuture;
        //   169: dup            
        //   170: ldc_w           "completedFuture(null)"
        //   173: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   176: iload_2         /* force */
        //   177: invokevirtual   gg/essential/gui/account/MicrosoftUserAuthentication.logIn:(Ljava/util/concurrent/CompletableFuture;Z)Lkotlin/Pair;
        //   180: astore          14
        //   182: aload           14
        //   184: invokevirtual   kotlin/Pair.component1:()Ljava/lang/Object;
        //   187: checkcast       Lcom/mojang/authlib/GameProfile;
        //   190: astore          profile
        //   192: aload           14
        //   194: invokevirtual   kotlin/Pair.component2:()Ljava/lang/Object;
        //   197: checkcast       Ljava/lang/String;
        //   200: astore          token
        //   202: aload           account
        //   204: aload           profile
        //   206: invokevirtual   com/mojang/authlib/GameProfile.getName:()Ljava/lang/String;
        //   209: dup            
        //   210: ldc_w           "profile.name"
        //   213: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   216: invokevirtual   gg/essential/gui/account/factory/MicrosoftAccountSessionFactory$MicrosoftAccount.setName:(Ljava/lang/String;)V
        //   219: aload           account
        //   221: aload           token
        //   223: invokevirtual   gg/essential/gui/account/factory/MicrosoftAccountSessionFactory$MicrosoftAccount.setAccessToken:(Ljava/lang/String;)V
        //   226: aload_0         /* this */
        //   227: invokespecial   gg/essential/gui/account/factory/MicrosoftAccountSessionFactory.save:()Ljava/lang/Object;
        //   230: pop            
        //   231: goto            244
        //   234: astore          14
        //   236: aload_0         /* this */
        //   237: invokespecial   gg/essential/gui/account/factory/MicrosoftAccountSessionFactory.save:()Ljava/lang/Object;
        //   240: pop            
        //   241: aload           14
        //   243: athrow         
        //   244: aload           account
        //   246: invokevirtual   gg/essential/gui/account/factory/MicrosoftAccountSessionFactory$MicrosoftAccount.toSession:()Lnet/minecraft/client/util/Session;
        //   249: astore          null
        //   251: iconst_0       
        //   252: istore          8
        //   254: iload           8
        //   256: iload           5
        //   258: if_icmpge       272
        //   261: aload           4
        //   263: invokevirtual   java/util/concurrent/locks/ReentrantReadWriteLock$ReadLock.lock:()V
        //   266: iinc            8, 1
        //   269: goto            254
        //   272: aload           6
        //   274: invokevirtual   java/util/concurrent/locks/ReentrantReadWriteLock$WriteLock.unlock:()V
        //   277: aload           7
        //   279: goto            313
        //   282: astore          7
        //   284: iconst_0       
        //   285: istore          8
        //   287: iload           8
        //   289: iload           5
        //   291: if_icmpge       305
        //   294: aload           4
        //   296: invokevirtual   java/util/concurrent/locks/ReentrantReadWriteLock$ReadLock.lock:()V
        //   299: iinc            8, 1
        //   302: goto            287
        //   305: aload           6
        //   307: invokevirtual   java/util/concurrent/locks/ReentrantReadWriteLock$WriteLock.unlock:()V
        //   310: aload           7
        //   312: athrow         
        //   313: areturn        
        //    MethodParameters:
        //  Name     Flags  
        //  -------  -----
        //  session  
        //  force    
        //    StackMapTable: 00 10 FD 00 20 07 00 72 07 00 E9 40 01 FD 00 04 01 01 11 FF 00 28 00 0B 07 00 02 07 01 9D 01 07 00 72 07 00 E9 01 07 00 F2 00 07 01 42 07 01 3C 07 01 44 00 00 2B 40 07 00 04 4F 07 00 43 FF 00 4B 00 0E 07 00 02 07 01 9D 01 07 00 72 07 00 E9 01 07 00 F2 00 07 01 42 07 00 04 07 01 44 00 00 07 00 43 00 01 07 00 4B FF 00 09 00 10 07 00 02 07 01 9D 01 07 00 72 07 00 E9 01 07 00 F2 00 07 01 42 07 01 12 07 01 44 00 00 07 00 43 07 01 67 07 00 60 00 00 FF 00 09 00 10 07 00 02 07 01 9D 01 07 00 72 07 00 E9 01 07 00 F2 07 01 9D 01 07 01 12 07 01 44 00 00 07 00 43 07 01 67 07 00 60 00 00 11 FF 00 09 00 07 07 00 02 07 01 9D 01 07 00 72 07 00 E9 01 07 00 F2 00 01 07 00 4B FD 00 04 07 00 4B 01 11 FF 00 07 00 10 07 00 02 07 01 9D 01 07 00 72 07 00 E9 01 07 00 F2 07 01 9D 01 07 01 12 07 01 44 00 00 07 00 43 07 01 67 07 00 60 00 01 07 01 9D
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  160    226    234    244    Any
        //  67     251    282    313    Any
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private final Instant getExpiryTime(final UUID uuid) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        gg/essential/gui/account/factory/MicrosoftAccountSessionFactory.lock:Ljava/util/concurrent/locks/ReentrantReadWriteLock;
        //     4: invokevirtual   java/util/concurrent/locks/ReentrantReadWriteLock.readLock:()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;
        //     7: astore_2       
        //     8: aload_2        
        //     9: invokevirtual   java/util/concurrent/locks/ReentrantReadWriteLock$ReadLock.lock:()V
        //    12: aload_0         /* this */
        //    13: getfield        gg/essential/gui/account/factory/MicrosoftAccountSessionFactory.state:Lgg/essential/gui/account/factory/MicrosoftAccountSessionFactory$State;
        //    16: invokevirtual   gg/essential/gui/account/factory/MicrosoftAccountSessionFactory$State.getAccounts:()Ljava/util/List;
        //    19: checkcast       Ljava/lang/Iterable;
        //    22: astore          4
        //    24: aload           4
        //    26: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //    31: astore          5
        //    33: aload           5
        //    35: invokeinterface java/util/Iterator.hasNext:()Z
        //    40: ifeq            76
        //    43: aload           5
        //    45: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    50: astore          6
        //    52: aload           6
        //    54: checkcast       Lgg/essential/gui/account/factory/MicrosoftAccountSessionFactory$MicrosoftAccount;
        //    57: astore          it
        //    59: aload           it
        //    61: invokevirtual   gg/essential/gui/account/factory/MicrosoftAccountSessionFactory$MicrosoftAccount.getUuid:()Ljava/util/UUID;
        //    64: aload_1         /* uuid */
        //    65: invokestatic    kotlin/jvm/internal/Intrinsics.areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //    68: ifeq            33
        //    71: aload           6
        //    73: goto            77
        //    76: aconst_null    
        //    77: checkcast       Lgg/essential/gui/account/factory/MicrosoftAccountSessionFactory$MicrosoftAccount;
        //    80: dup            
        //    81: ifnull          97
        //    84: invokevirtual   gg/essential/gui/account/factory/MicrosoftAccountSessionFactory$MicrosoftAccount.getAuth:()Lgg/essential/gui/account/MicrosoftUserAuthentication;
        //    87: dup            
        //    88: ifnull          97
        //    91: invokevirtual   gg/essential/gui/account/MicrosoftUserAuthentication.getExpiryTime:()Ljava/time/Instant;
        //    94: goto            99
        //    97: pop            
        //    98: aconst_null    
        //    99: astore_3        /* $i$a$-read-MicrosoftAccountSessionFactory$getExpiryTime$1 */
        //   100: aload_2        
        //   101: invokevirtual   java/util/concurrent/locks/ReentrantReadWriteLock$ReadLock.unlock:()V
        //   104: aload_3        
        //   105: goto            115
        //   108: astore_3       
        //   109: aload_2        
        //   110: invokevirtual   java/util/concurrent/locks/ReentrantReadWriteLock$ReadLock.unlock:()V
        //   113: aload_3        
        //   114: athrow         
        //   115: areturn        
        //    MethodParameters:
        //  Name  Flags  
        //  ----  -----
        //  uuid  
        //    StackMapTable: 00 07 FF 00 21 00 06 07 00 02 07 01 42 07 00 E9 00 07 01 3C 07 01 44 00 00 2A 40 07 00 04 53 07 00 04 41 07 00 69 FF 00 08 00 03 07 00 02 07 01 42 07 00 E9 00 01 07 00 4B FF 00 06 00 06 07 00 02 07 01 42 07 00 E9 07 00 69 07 01 3C 07 01 44 00 01 07 00 69
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  12     100    108    115    Any
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private final void refreshRefreshToken(final UUID uuid) {
        while (true) {
            for (final Object next : this.state.getAccounts()) {
                final MicrosoftAccountSessionFactory.MicrosoftAccount it = (MicrosoftAccountSessionFactory.MicrosoftAccount)next;
                if (Intrinsics.areEqual((Object)it.getUuid(), (Object)uuid)) {
                    final MicrosoftAccountSessionFactory.MicrosoftAccount microsoftAccount = (MicrosoftAccountSessionFactory.MicrosoftAccount)next;
                    final MicrosoftAccountSessionFactory.MicrosoftAccount microsoftAccount2 = microsoftAccount;
                    if (microsoftAccount2 == null) {
                        throw new InvalidCredentialsException();
                    }
                    final MicrosoftAccountSessionFactory.MicrosoftAccount account = microsoftAccount2;
                    try {
                        account.getAuth().refreshRefreshToken();
                    }
                    finally {
                        this.save();
                    }
                    return;
                }
            }
            final MicrosoftAccountSessionFactory.MicrosoftAccount microsoftAccount = null;
            continue;
        }
    }
    
    @NotNull
    @Override
    public Map<UUID, Session> getSessions() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        gg/essential/gui/account/factory/MicrosoftAccountSessionFactory.lock:Ljava/util/concurrent/locks/ReentrantReadWriteLock;
        //     4: invokevirtual   java/util/concurrent/locks/ReentrantReadWriteLock.readLock:()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;
        //     7: astore_1       
        //     8: aload_1        
        //     9: invokevirtual   java/util/concurrent/locks/ReentrantReadWriteLock$ReadLock.lock:()V
        //    12: aload_0         /* this */
        //    13: getfield        gg/essential/gui/account/factory/MicrosoftAccountSessionFactory.state:Lgg/essential/gui/account/factory/MicrosoftAccountSessionFactory$State;
        //    16: invokevirtual   gg/essential/gui/account/factory/MicrosoftAccountSessionFactory$State.getAccounts:()Ljava/util/List;
        //    19: checkcast       Ljava/lang/Iterable;
        //    22: astore_3        /* $this$associate$iv */
        //    23: aload_3         /* $this$associate$iv */
        //    24: bipush          10
        //    26: invokestatic    kotlin/collections/CollectionsKt.collectionSizeOrDefault:(Ljava/lang/Iterable;I)I
        //    29: invokestatic    kotlin/collections/MapsKt.mapCapacity:(I)I
        //    32: bipush          16
        //    34: invokestatic    kotlin/ranges/RangesKt.coerceAtLeast:(II)I
        //    37: istore          capacity$iv
        //    39: aload_3         /* $this$associate$iv */
        //    40: astore          5
        //    42: new             Ljava/util/LinkedHashMap;
        //    45: dup            
        //    46: iload           capacity$iv
        //    48: invokespecial   java/util/LinkedHashMap.<init>:(I)V
        //    51: checkcast       Ljava/util/Map;
        //    54: astore          destination$iv$iv
        //    56: aload           $this$associateTo$iv$iv
        //    58: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //    63: astore          7
        //    65: aload           7
        //    67: invokeinterface java/util/Iterator.hasNext:()Z
        //    72: ifeq            131
        //    75: aload           7
        //    77: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    82: astore          element$iv$iv
        //    84: aload           destination$iv$iv
        //    86: astore          9
        //    88: aload           element$iv$iv
        //    90: checkcast       Lgg/essential/gui/account/factory/MicrosoftAccountSessionFactory$MicrosoftAccount;
        //    93: astore          it
        //    95: aload           it
        //    97: invokevirtual   gg/essential/gui/account/factory/MicrosoftAccountSessionFactory$MicrosoftAccount.getUuid:()Ljava/util/UUID;
        //   100: aload           it
        //   102: invokevirtual   gg/essential/gui/account/factory/MicrosoftAccountSessionFactory$MicrosoftAccount.toSession:()Lnet/minecraft/client/util/Session;
        //   105: invokestatic    kotlin/TuplesKt.to:(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
        //   108: astore          null
        //   110: aload           9
        //   112: aload           10
        //   114: invokevirtual   kotlin/Pair.getFirst:()Ljava/lang/Object;
        //   117: aload           10
        //   119: invokevirtual   kotlin/Pair.getSecond:()Ljava/lang/Object;
        //   122: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   127: pop            
        //   128: goto            65
        //   131: aload           destination$iv$iv
        //   133: astore_2        /* $i$a$-read-MicrosoftAccountSessionFactory$sessions$1 */
        //   134: aload_1        
        //   135: invokevirtual   java/util/concurrent/locks/ReentrantReadWriteLock$ReadLock.unlock:()V
        //   138: aload_2        
        //   139: goto            149
        //   142: astore_2       
        //   143: aload_1        
        //   144: invokevirtual   java/util/concurrent/locks/ReentrantReadWriteLock$ReadLock.unlock:()V
        //   147: aload_2        
        //   148: athrow         
        //   149: areturn        
        //    Signature:
        //  ()Ljava/util/Map<Ljava/util/UUID;Lnet/minecraft/client/util/Session;>;
        //    StackMapTable: 00 04 FF 00 41 00 08 07 00 02 07 00 E9 00 07 01 3C 01 07 01 3C 07 01 E7 07 01 44 00 00 FB 00 41 FF 00 0A 00 02 07 00 02 07 00 E9 00 01 07 00 4B FF 00 06 00 08 07 00 02 07 00 E9 07 01 E7 07 01 3C 01 07 01 3C 07 01 E7 07 01 44 00 01 07 01 E7
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  12     134    142    149    Any
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public final void refreshRefreshTokensIfNecessary() {
        for (Map.Entry<UUID, V> entry : this.getSessions().entrySet()) {
            final UUID uuid = entry.getKey();
            final Session session = (Session)entry.getValue();
            final Instant expiryTime = this.getExpiryTime(uuid);
            if (expiryTime != null) {
                final Instant it = expiryTime;
                final String username = session.getProfile().getName();
                Essential.logger.debug(username + " " + uuid + " expires " + it);
                if (!it.isBefore(Instant.now().plus(76L, (TemporalUnit)ChronoUnit.DAYS))) {
                    continue;
                }
                Essential.logger.info("Refreshing the refresh token for " + username + " " + uuid);
                try {
                    this.refreshRefreshToken(uuid);
                }
                catch (final InvalidCredentialsException ex) {
                    Window.Companion.enqueueRenderOperation((Function0<Unit>)new MicrosoftAccountSessionFactory$refreshRefreshTokensIfNecessary$1.MicrosoftAccountSessionFactory$refreshRefreshTokensIfNecessary$1$1(username));
                }
            }
        }
    }
    
    private static final boolean login$lambda-6$lambda-5(final GameProfile $profile, final MicrosoftAccountSessionFactory.MicrosoftAccount it) {
        Intrinsics.checkNotNullParameter((Object)$profile, "$profile");
        Intrinsics.checkNotNullParameter((Object)it, "it");
        return Intrinsics.areEqual((Object)it.getUuid(), (Object)$profile.getId());
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                       \u0000*
                                                       \u0002\u0018\u0002
                                                       \u0002\u0010\u0000
                                                       \u0000
                                                       \u0002\u0010!
                                                       \u0002\u0018\u0002
                                                       \u0002\b\u0006
                                                       \u0002\u0010\u000b
                                                       \u0002\b\u0002
                                                       \u0002\u0010\b
                                                       \u0000
                                                       \u0002\u0010\u000e
                                                       \u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u0019\u0010	\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0001J\u0013\u0010
                                                       \u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J	\u0010\r\u001a\u00020\u000eH\u00d6\u0001J	\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b
                                                       \u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011""" }, d2 = { "Lgg/essential/gui/account/factory/MicrosoftAccountSessionFactory$State;", "", "accounts", "", "Lgg/essential/gui/account/factory/MicrosoftAccountSessionFactory$MicrosoftAccount;", "(Ljava/util/List;)V", "getAccounts", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "essential" })
    private static final class State
    {
        @NotNull
        private final List<MicrosoftAccountSessionFactory$MicrosoftAccount> accounts;
        
        public State(@NotNull final List<MicrosoftAccountSessionFactory$MicrosoftAccount> accounts) {
            Intrinsics.checkNotNullParameter((Object)accounts, "accounts");
            super();
            this.accounts = accounts;
        }
        
        @NotNull
        public final List<MicrosoftAccountSessionFactory$MicrosoftAccount> getAccounts() {
            return this.accounts;
        }
        
        @NotNull
        @Override
        public String toString() {
            return "State(accounts=" + this.accounts;
        }
        
        @Override
        public int hashCode() {
            return this.accounts.hashCode();
        }
        
        @Override
        public boolean equals(@Nullable final Object other) {
            return this == other || (other instanceof State && Intrinsics.areEqual((Object)this.accounts, (Object)((State)other).accounts));
        }
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                       \u00004
                                                       \u0002\u0018\u0002
                                                       \u0002\u0018\u0002
                                                       \u0002\u0018\u0002
                                                       \u0002\u0018\u0002
                                                       \u0002\b\u0003
                                                       \u0002\u0018\u0002
                                                       \u0000
                                                       \u0002\u0018\u0002
                                                       \u0000
                                                       \u0002\u0018\u0002
                                                       \u0000
                                                       \u0002\u0018\u0002
                                                       \u0002\b\u0002
                                                       \u0002\u0018\u0002
                                                       \u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J \u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020	2\u0006\u0010
                                                       \u001a\u00020\u000bH\u0016J \u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020	2\u0006\u0010
                                                       \u001a\u00020\u0010H\u0016¨\u0006\u0011""" }, d2 = { "Lgg/essential/gui/account/factory/MicrosoftAccountSessionFactory$GameProfileSerializer;", "Lgg/essential/lib/gson/JsonSerializer;", "Lcom/mojang/authlib/GameProfile;", "Lgg/essential/lib/gson/JsonDeserializer;", "()V", "deserialize", "json", "Lgg/essential/lib/gson/JsonElement;", "typeOfT", "Ljava/lang/reflect/Type;", "context", "Lgg/essential/lib/gson/JsonDeserializationContext;", "serialize", "Lgg/essential/lib/gson/JsonObject;", "src", "typeOfSrc", "Lgg/essential/lib/gson/JsonSerializationContext;", "essential" })
    private static final class GameProfileSerializer implements JsonDeserializer<GameProfile>, JsonSerializer<GameProfile>
    {
        public GameProfileSerializer() {
            super();
        }
        
        @NotNull
        @Override
        public GameProfile deserialize(@NotNull final JsonElement json, @NotNull final Type typeOfT, @NotNull final JsonDeserializationContext context) {
            Intrinsics.checkNotNullParameter((Object)json, "json");
            Intrinsics.checkNotNullParameter((Object)typeOfT, "typeOfT");
            Intrinsics.checkNotNullParameter((Object)context, "context");
            final JsonElement value = ((JsonObject)json).get("id");
            UUID uuid;
            if (value != null) {
                final JsonElement it = value;
                uuid = context.deserialize(it, UUID.class);
            }
            else {
                uuid = null;
            }
            final UUID id = uuid;
            final JsonElement value2 = ((JsonObject)json).get("name");
            final String name = (value2 != null) ? value2.getAsString() : null;
            return new GameProfile(id, name);
        }
        
        @NotNull
        @Override
        public JsonObject serialize(@NotNull final GameProfile src, @NotNull final Type typeOfSrc, @NotNull final JsonSerializationContext context) {
            Intrinsics.checkNotNullParameter((Object)src, "src");
            Intrinsics.checkNotNullParameter((Object)typeOfSrc, "typeOfSrc");
            Intrinsics.checkNotNullParameter((Object)context, "context");
            final JsonObject $this$serialize_u24lambda_u2d3;
            final JsonObject jsonObject = $this$serialize_u24lambda_u2d3 = new JsonObject();
            final UUID id;
            final UUID uuid = id = src.getId();
            if (id != null) {
                Intrinsics.checkNotNullExpressionValue((Object)id, "id");
                final UUID it = uuid;
                $this$serialize_u24lambda_u2d3.add("id", context.serialize(it));
            }
            final String name;
            final String s = name = src.getName();
            if (name != null) {
                Intrinsics.checkNotNullExpressionValue((Object)name, "name");
                final String it2 = s;
                $this$serialize_u24lambda_u2d3.add("name", context.serialize(it2));
            }
            return jsonObject;
        }
        
        @Override
        public /* bridge */ Object deserialize(final JsonElement p0, final Type p1, final JsonDeserializationContext p2) {
            return this.deserialize(p0, p1, p2);
        }
        
        @Override
        public /* bridge */ JsonElement serialize(final Object p0, final Type p1, final JsonSerializationContext p2) {
            return this.serialize((GameProfile)p0, p1, p2);
        }
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                       \u00004
                                                       \u0002\u0018\u0002
                                                       \u0002\u0018\u0002
                                                       \u0002\u0018\u0002
                                                       \u0002\u0018\u0002
                                                       \u0002\b\u0003
                                                       \u0002\u0018\u0002
                                                       \u0000
                                                       \u0002\u0018\u0002
                                                       \u0000
                                                       \u0002\u0018\u0002
                                                       \u0000
                                                       \u0002\u0018\u0002
                                                       \u0002\b\u0002
                                                       \u0002\u0018\u0002
                                                       \u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J \u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020	2\u0006\u0010
                                                       \u001a\u00020\u000bH\u0016J \u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020	2\u0006\u0010
                                                       \u001a\u00020\u0010H\u0016¨\u0006\u0011""" }, d2 = { "Lgg/essential/gui/account/factory/MicrosoftAccountSessionFactory$InstantSerializer;", "Lgg/essential/lib/gson/JsonSerializer;", "Ljava/time/Instant;", "Lgg/essential/lib/gson/JsonDeserializer;", "()V", "deserialize", "json", "Lgg/essential/lib/gson/JsonElement;", "typeOfT", "Ljava/lang/reflect/Type;", "context", "Lgg/essential/lib/gson/JsonDeserializationContext;", "serialize", "Lgg/essential/lib/gson/JsonObject;", "src", "typeOfSrc", "Lgg/essential/lib/gson/JsonSerializationContext;", "essential" })
    private static final class InstantSerializer implements JsonDeserializer<Instant>, JsonSerializer<Instant>
    {
        public InstantSerializer() {
            super();
        }
        
        @NotNull
        @Override
        public Instant deserialize(@NotNull final JsonElement json, @NotNull final Type typeOfT, @NotNull final JsonDeserializationContext context) {
            Intrinsics.checkNotNullParameter((Object)json, "json");
            Intrinsics.checkNotNullParameter((Object)typeOfT, "typeOfT");
            Intrinsics.checkNotNullParameter((Object)context, "context");
            final long seconds = ((JsonObject)json).get("seconds").getAsLong();
            final long nanos = ((JsonObject)json).get("nanos").getAsLong();
            final Instant ofEpochSecond = Instant.ofEpochSecond(seconds, nanos);
            Intrinsics.checkNotNullExpressionValue((Object)ofEpochSecond, "ofEpochSecond(seconds, nanos)");
            return ofEpochSecond;
        }
        
        @NotNull
        @Override
        public JsonObject serialize(@NotNull final Instant src, @NotNull final Type typeOfSrc, @NotNull final JsonSerializationContext context) {
            Intrinsics.checkNotNullParameter((Object)src, "src");
            Intrinsics.checkNotNullParameter((Object)typeOfSrc, "typeOfSrc");
            Intrinsics.checkNotNullParameter((Object)context, "context");
            final JsonObject $this$serialize_u24lambda_u2d0;
            final JsonObject jsonObject = $this$serialize_u24lambda_u2d0 = new JsonObject();
            $this$serialize_u24lambda_u2d0.add("seconds", context.serialize(src.getEpochSecond()));
            $this$serialize_u24lambda_u2d0.add("nanos", context.serialize(src.getNano()));
            return jsonObject;
        }
        
        @Override
        public /* bridge */ Object deserialize(final JsonElement p0, final Type p1, final JsonDeserializationContext p2) {
            return this.deserialize(p0, p1, p2);
        }
        
        @Override
        public /* bridge */ JsonElement serialize(final Object p0, final Type p1, final JsonSerializationContext p2) {
            return this.serialize((Instant)p0, p1, p2);
        }
    }
}
