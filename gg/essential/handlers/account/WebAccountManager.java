package gg.essential.handlers.account;

import org.jetbrains.annotations.*;
import java.lang.ref.*;
import gg.essential.gui.menu.*;
import kotlin.jvm.internal.*;
import gg.essential.universal.*;
import java.net.*;
import com.sun.net.httpserver.*;
import java.util.concurrent.*;
import gg.essential.api.utils.*;
import gg.essential.gui.account.factory.*;
import kotlin.collections.*;
import kotlin.*;
import java.util.regex.*;
import gg.essential.gui.notification.*;
import java.util.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000d
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0000
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u000e
                                                   \u0002\b\u0006
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0005
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0005
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\b
                                                   \u0000
                                                   \u0002\u0010\u000b
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0004
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0010$
                                                   \u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0002J\u0006\u0010 \u001a\u00020!J\u0010\u0010"\u001a\u00020!2\u0006\u0010#\u001a\u00020$H\u0002J\u0010\u0010%\u001a\u00020!2\u0006\u0010#\u001a\u00020$H\u0002J\u0010\u0010&\u001a\u00020!2\u0006\u0010#\u001a\u00020$H\u0002J.\u0010'\u001a\u00020!2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u00052\u0014\b\u0002\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050,H\u0002J\b\u0010-\u001a\u00020!H\u0002R.\u0010\u0006\u001a
                                                   \u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u000e\u0010\u0003\u001a
                                                   \u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004@BX\u0086\u000e¢\u0006\b
                                                   \u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010	\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002
                                                   \u0000R\u0014\u0010
                                                   \u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u000e¢\u0006\u0002
                                                   \u0000R\u0016\u0010\u000b\u001a
                                                    \r*\u0004\u0018\u00010\f0\fX\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u001e\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0005@BX\u0086\u000e¢\u0006\b
                                                   \u0000\u001a\u0004\b\u000f\u0010\u0010R"\u0010\u0011\u001a
                                                   \u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0012X\u0086\u000e¢\u0006\u000e
                                                   \u0000\u001a\u0004\b\u0014\u0010\u0015"\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0018\u001a
                                                   \u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002
                                                   \u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u000e¢\u0006\u0002
                                                   \u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u000e¢\u0006\u0002
                                                   \u0000¨\u0006.""" }, d2 = { "Lgg/essential/handlers/account/WebAccountManager;", "", "()V", "<set-?>", "Ljava/util/concurrent/CompletableFuture;", "", "authorizationCodeFuture", "getAuthorizationCodeFuture", "()Ljava/util/concurrent/CompletableFuture;", "domain", "loginErrorFuture", "microsoftOauthParamPattern", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "microsoftRedirectUri", "getMicrosoftRedirectUri", "()Ljava/lang/String;", "mostRecentAccountManager", "Ljava/lang/ref/WeakReference;", "Lgg/essential/gui/menu/AccountManager;", "getMostRecentAccountManager", "()Ljava/lang/ref/WeakReference;", "setMostRecentAccountManager", "(Ljava/lang/ref/WeakReference;)V", "oauthUriFuture", "Ljava/net/URI;", "port", "", "running", "", "getMicrosoftSessionFactory", "Lgg/essential/gui/account/factory/MicrosoftAccountSessionFactory;", "openInBrowser", "", "registerAssets", "server", "Lcom/sun/net/httpserver/HttpServer;", "registerMicrosoftAccountListener", "registerPages", "send", "exchange", "Lcom/sun/net/httpserver/HttpExchange;", "path", "data", "", "startServer", "essential" })
public final class WebAccountManager
{
    @NotNull
    public static final WebAccountManager INSTANCE;
    private static boolean running;
    private static int port;
    @NotNull
    private static String domain;
    private static final Pattern microsoftOauthParamPattern;
    @Nullable
    private static CompletableFuture<URI> oauthUriFuture;
    @NotNull
    private static String microsoftRedirectUri;
    @Nullable
    private static CompletableFuture<String> authorizationCodeFuture;
    @NotNull
    private static WeakReference<AccountManager> mostRecentAccountManager;
    @NotNull
    private static CompletableFuture<String> loginErrorFuture;
    
    private WebAccountManager() {
        super();
    }
    
    @NotNull
    public final String getMicrosoftRedirectUri() {
        return WebAccountManager.microsoftRedirectUri;
    }
    
    @Nullable
    public final CompletableFuture<String> getAuthorizationCodeFuture() {
        return WebAccountManager.authorizationCodeFuture;
    }
    
    public final void setMostRecentAccountManager(@NotNull final WeakReference<AccountManager> <set-?>) {
        Intrinsics.checkNotNullParameter((Object)<set-?>, "<set-?>");
        WebAccountManager.mostRecentAccountManager = <set-?>;
    }
    
    public final void openInBrowser() {
        if (!WebAccountManager.running) {
            this.startServer();
            WebAccountManager.running = true;
        }
        WebAccountManager.authorizationCodeFuture = new CompletableFuture<String>();
        UDesktop.browse(new URI("http://localhost:" + WebAccountManager.port));
    }
    
    private final void send(final HttpExchange exchange, final String path, final Map<String, String> data) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //     4: aload_2         /* path */
        //     5: invokevirtual   java/lang/Class.getResourceAsStream:(Ljava/lang/String;)Ljava/io/InputStream;
        //     8: astore          resource
        //    10: aload           resource
        //    12: ifnonnull       52
        //    15: aload_1         /* exchange */
        //    16: sipush          500
        //    19: lconst_0       
        //    20: invokevirtual   com/sun/net/httpserver/HttpExchange.sendResponseHeaders:(IJ)V
        //    23: aload_1         /* exchange */
        //    24: invokevirtual   com/sun/net/httpserver/HttpExchange.getResponseBody:()Ljava/io/OutputStream;
        //    27: ldc             "Internal server error. Contact support"
        //    29: getstatic       kotlin/text/Charsets.UTF_8:Ljava/nio/charset/Charset;
        //    32: invokevirtual   java/lang/String.getBytes:(Ljava/nio/charset/Charset;)[B
        //    35: dup            
        //    36: ldc             "this as java.lang.String).getBytes(charset)"
        //    38: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //    41: invokevirtual   java/io/OutputStream.write:([B)V
        //    44: aload_1         /* exchange */
        //    45: invokevirtual   com/sun/net/httpserver/HttpExchange.getResponseBody:()Ljava/io/OutputStream;
        //    48: invokevirtual   java/io/OutputStream.close:()V
        //    51: return         
        //    52: aload_2         /* path */
        //    53: ldc             "png"
        //    55: iconst_0       
        //    56: iconst_2       
        //    57: aconst_null    
        //    58: invokestatic    kotlin/text/StringsKt.endsWith$default:(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z
        //    61: ifeq            155
        //    64: aload           resource
        //    66: checkcast       Ljava/io/Closeable;
        //    69: astore          6
        //    71: aconst_null    
        //    72: astore          7
        //    74: aload           resource
        //    76: invokestatic    kotlin/io/ByteStreamsKt.readBytes:(Ljava/io/InputStream;)[B
        //    79: astore          null
        //    81: aload           6
        //    83: aload           7
        //    85: invokestatic    kotlin/io/CloseableKt.closeFinally:(Ljava/io/Closeable;Ljava/lang/Throwable;)V
        //    88: aload           8
        //    90: goto            114
        //    93: astore          8
        //    95: aload           8
        //    97: astore          7
        //    99: aload           8
        //   101: athrow         
        //   102: astore          8
        //   104: aload           6
        //   106: aload           7
        //   108: invokestatic    kotlin/io/CloseableKt.closeFinally:(Ljava/io/Closeable;Ljava/lang/Throwable;)V
        //   111: aload           8
        //   113: athrow         
        //   114: astore          content
        //   116: aload_1         /* exchange */
        //   117: invokevirtual   com/sun/net/httpserver/HttpExchange.getResponseHeaders:()Lcom/sun/net/httpserver/Headers;
        //   120: ldc             "Content-Type"
        //   122: ldc             "image/png"
        //   124: invokevirtual   com/sun/net/httpserver/Headers.add:(Ljava/lang/String;Ljava/lang/String;)V
        //   127: aload_1         /* exchange */
        //   128: sipush          200
        //   131: aload           content
        //   133: arraylength    
        //   134: i2l            
        //   135: invokevirtual   com/sun/net/httpserver/HttpExchange.sendResponseHeaders:(IJ)V
        //   138: aload_1         /* exchange */
        //   139: invokevirtual   com/sun/net/httpserver/HttpExchange.getResponseBody:()Ljava/io/OutputStream;
        //   142: aload           content
        //   144: invokevirtual   java/io/OutputStream.write:([B)V
        //   147: aload_1         /* exchange */
        //   148: invokevirtual   com/sun/net/httpserver/HttpExchange.getResponseBody:()Ljava/io/OutputStream;
        //   151: invokevirtual   java/io/OutputStream.close:()V
        //   154: return         
        //   155: aload           resource
        //   157: checkcast       Ljava/io/Closeable;
        //   160: astore          6
        //   162: aconst_null    
        //   163: astore          7
        //   165: aload           resource
        //   167: invokestatic    kotlin/io/ByteStreamsKt.readBytes:(Ljava/io/InputStream;)[B
        //   170: astore          null
        //   172: aload           6
        //   174: aload           7
        //   176: invokestatic    kotlin/io/CloseableKt.closeFinally:(Ljava/io/Closeable;Ljava/lang/Throwable;)V
        //   179: aload           8
        //   181: goto            205
        //   184: astore          8
        //   186: aload           8
        //   188: astore          7
        //   190: aload           8
        //   192: athrow         
        //   193: astore          8
        //   195: aload           6
        //   197: aload           7
        //   199: invokestatic    kotlin/io/CloseableKt.closeFinally:(Ljava/io/Closeable;Ljava/lang/Throwable;)V
        //   202: aload           8
        //   204: athrow         
        //   205: astore          6
        //   207: new             Ljava/lang/String;
        //   210: dup            
        //   211: aload           6
        //   213: getstatic       kotlin/text/Charsets.UTF_8:Ljava/nio/charset/Charset;
        //   216: invokespecial   java/lang/String.<init>:([BLjava/nio/charset/Charset;)V
        //   219: astore          content
        //   221: aload_3         /* data */
        //   222: invokeinterface java/util/Map.keySet:()Ljava/util/Set;
        //   227: invokeinterface java/util/Set.iterator:()Ljava/util/Iterator;
        //   232: astore          6
        //   234: aload           6
        //   236: invokeinterface java/util/Iterator.hasNext:()Z
        //   241: ifeq            287
        //   244: aload           6
        //   246: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   251: checkcast       Ljava/lang/String;
        //   254: astore          key
        //   256: aload           content
        //   258: aload           key
        //   260: invokedynamic   BootstrapMethod #1, makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
        //   265: aload_3         /* data */
        //   266: aload           key
        //   268: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   273: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //   276: iconst_0       
        //   277: iconst_4       
        //   278: aconst_null    
        //   279: invokestatic    kotlin/text/StringsKt.replace$default:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;
        //   282: astore          content
        //   284: goto            234
        //   287: aload_1         /* exchange */
        //   288: sipush          200
        //   291: aload           content
        //   293: astore          6
        //   295: getstatic       kotlin/text/Charsets.UTF_8:Ljava/nio/charset/Charset;
        //   298: aload           6
        //   300: swap           
        //   301: invokevirtual   java/lang/String.getBytes:(Ljava/nio/charset/Charset;)[B
        //   304: dup            
        //   305: ldc             "this as java.lang.String).getBytes(charset)"
        //   307: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   310: arraylength    
        //   311: i2l            
        //   312: invokevirtual   com/sun/net/httpserver/HttpExchange.sendResponseHeaders:(IJ)V
        //   315: aload_1         /* exchange */
        //   316: invokevirtual   com/sun/net/httpserver/HttpExchange.getResponseBody:()Ljava/io/OutputStream;
        //   319: aload           content
        //   321: astore          6
        //   323: getstatic       kotlin/text/Charsets.UTF_8:Ljava/nio/charset/Charset;
        //   326: aload           6
        //   328: swap           
        //   329: invokevirtual   java/lang/String.getBytes:(Ljava/nio/charset/Charset;)[B
        //   332: dup            
        //   333: ldc             "this as java.lang.String).getBytes(charset)"
        //   335: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   338: invokevirtual   java/io/OutputStream.write:([B)V
        //   341: aload_1         /* exchange */
        //   342: invokevirtual   com/sun/net/httpserver/HttpExchange.getResponseBody:()Ljava/io/OutputStream;
        //   345: invokevirtual   java/io/OutputStream.close:()V
        //   348: return         
        //    Signature:
        //  (Lcom/sun/net/httpserver/HttpExchange;Ljava/lang/String;Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;)V
        //    MethodParameters:
        //  Name      Flags  
        //  --------  -----
        //  exchange  
        //  path      
        //  data      
        //    StackMapTable: 00 0A FC 00 34 07 00 AC FF 00 28 00 08 07 00 02 07 00 86 07 00 98 07 00 C4 07 00 AC 00 07 00 B6 05 00 01 07 00 7A FF 00 08 00 08 07 00 02 07 00 86 07 00 98 07 00 C4 07 00 AC 00 07 00 B6 07 00 7A 00 01 07 00 7A FF 00 0B 00 09 07 00 02 07 00 86 07 00 98 07 00 C4 07 00 AC 00 07 00 B6 05 07 00 C6 00 01 07 00 C6 FF 00 28 00 05 07 00 02 07 00 86 07 00 98 07 00 C4 07 00 AC 00 00 FF 00 1C 00 08 07 00 02 07 00 86 07 00 98 07 00 C4 07 00 AC 00 07 00 B6 05 00 01 07 00 7A FF 00 08 00 08 07 00 02 07 00 86 07 00 98 07 00 C4 07 00 AC 00 07 00 B6 07 00 7A 00 01 07 00 7A FF 00 0B 00 09 07 00 02 07 00 86 07 00 98 07 00 C4 07 00 AC 00 07 00 B6 05 07 00 C6 00 01 07 00 C6 FF 00 1C 00 09 07 00 02 07 00 86 07 00 98 07 00 C4 07 00 AC 07 00 98 07 00 E3 07 00 98 07 00 C6 00 00 34
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  74     81     93     102    Ljava/lang/Throwable;
        //  74     81     102    114    Any
        //  93     102    102    114    Any
        //  165    172    184    193    Ljava/lang/Throwable;
        //  165    172    193    205    Any
        //  184    193    193    205    Any
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    static /* synthetic */ void send$default$26f56c17$4f3382b3(final WebAccountManager webAccountManager, final HttpExchange exchange, final String path) {
        webAccountManager.send(exchange, path, MapsKt.emptyMap());
    }
    
    private final void startServer() {
        final HttpServer server = HttpServer.create(new InetSocketAddress("localhost", 0), 0);
        WebAccountManager.authorizationCodeFuture = new CompletableFuture<String>();
        Intrinsics.checkNotNullExpressionValue((Object)server, "server");
        this.registerAssets(server);
        this.registerPages(server);
        this.registerMicrosoftAccountListener(server);
        server.setExecutor(Multithreading.getPool());
        server.start();
        WebAccountManager.port = server.getAddress().getPort();
        WebAccountManager.domain = "http://localhost:" + WebAccountManager.port;
        WebAccountManager.microsoftRedirectUri = WebAccountManager.domain + "/microsoft/complete";
    }
    
    private final void registerMicrosoftAccountListener(final HttpServer server) {
        server.createContext("/microsoft/auth", WebAccountManager::registerMicrosoftAccountListener$lambda-2);
        server.createContext("/microsoft/complete", WebAccountManager::registerMicrosoftAccountListener$lambda-5);
        server.createContext("/login/microsoft", WebAccountManager::registerMicrosoftAccountListener$lambda-11);
    }
    
    private final MicrosoftAccountSessionFactory getMicrosoftSessionFactory() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: invokevirtual   gg/essential/Essential.getSessionFactories:()Ljava/util/List;
        //     6: dup            
        //     7: ldc_w           "getInstance().sessionFactories"
        //    10: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //    13: checkcast       Ljava/lang/Iterable;
        //    16: astore_1        /* $this$filterIsInstance$iv */
        //    17: aload_1         /* $this$filterIsInstance$iv */
        //    18: astore_2       
        //    19: new             Ljava/util/ArrayList;
        //    22: dup            
        //    23: invokespecial   java/util/ArrayList.<init>:()V
        //    26: checkcast       Ljava/util/Collection;
        //    29: astore_3        /* destination$iv$iv */
        //    30: aload_2         /* $this$filterIsInstanceTo$iv$iv */
        //    31: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //    36: astore          4
        //    38: aload           4
        //    40: invokeinterface java/util/Iterator.hasNext:()Z
        //    45: ifeq            77
        //    48: aload           4
        //    50: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    55: astore          element$iv$iv
        //    57: aload           element$iv$iv
        //    59: instanceof      Lgg/essential/gui/account/factory/MicrosoftAccountSessionFactory;
        //    62: ifeq            38
        //    65: aload_3         /* destination$iv$iv */
        //    66: aload           element$iv$iv
        //    68: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //    73: pop            
        //    74: goto            38
        //    77: aload_3         /* destination$iv$iv */
        //    78: checkcast       Ljava/util/List;
        //    81: invokestatic    kotlin/collections/CollectionsKt.first:(Ljava/util/List;)Ljava/lang/Object;
        //    84: checkcast       Lgg/essential/gui/account/factory/MicrosoftAccountSessionFactory;
        //    87: areturn        
        //    StackMapTable: 00 02 FF 00 26 00 05 07 00 02 07 01 74 07 01 74 07 01 79 07 00 E3 00 00 26
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private final void registerPages(final HttpServer server) {
        server.createContext("/login/success", WebAccountManager::registerPages$lambda-12);
        server.createContext("/", WebAccountManager::registerPages$lambda-13);
    }
    
    private final void registerAssets(final HttpServer server) {
        final List assets = CollectionsKt.listOf((Object[])new String[] { "core.c28d5d87.css", "main.c766a760.js", "main.5a1fd7db.js", "microsoft.2cc0fa02", "minecraft-computer-login.5074e926.png" });
        for (String asset : assets) {
            server.createContext("/" + asset, WebAccountManager::registerAssets$lambda-14);
        }
    }
    
    private static final void registerMicrosoftAccountListener$lambda-2(final HttpExchange it) {
        final CompletableFuture future = WebAccountManager.oauthUriFuture;
        if (future == null) {
            System.out.println((Object)"Future not initialized");
            final WebAccountManager instance = WebAccountManager.INSTANCE;
            Intrinsics.checkNotNullExpressionValue((Object)it, "it");
            instance.send(it, "/assets/essential/account/error.html", MapsKt.mapOf(TuplesKt.to((Object)"error", (Object)"Internal error please check logs")));
            return;
        }
        it.getResponseHeaders().add("Location", future.join().toString());
        it.sendResponseHeaders(302, 0L);
        it.getResponseBody().close();
    }
    
    private static final void registerMicrosoftAccountListener$lambda-5(final HttpExchange exchange) {
        final String query = exchange.getRequestURI().getQuery();
        if (query != null) {
            final Matcher matcher = WebAccountManager.microsoftOauthParamPattern.matcher(query);
            if (matcher.find()) {
                final CompletableFuture<String> authorizationCodeFuture = WebAccountManager.authorizationCodeFuture;
                final Boolean b = (authorizationCodeFuture != null) ? Boolean.valueOf(authorizationCodeFuture.complete(matcher.group("code"))) : null;
                WebAccountManager.authorizationCodeFuture = null;
                final Boolean b2 = b;
                if (b2 == null) {
                    final WebAccountManager $this$registerMicrosoftAccountListener_u24lambda_u2d5_u24lambda_u2d4 = WebAccountManager.INSTANCE;
                    System.out.println((Object)"authorizationCodeFuture == null. Perhaps the user had an extra account frame open?");
                    final WebAccountManager webAccountManager = $this$registerMicrosoftAccountListener_u24lambda_u2d5_u24lambda_u2d4;
                    Intrinsics.checkNotNullExpressionValue((Object)exchange, "exchange");
                    webAccountManager.send(exchange, "/assets/essential/account/error.html", MapsKt.mapOf(TuplesKt.to((Object)"error", (Object)"Error during login. Please close browser and try again.")));
                    return;
                }
                b2.booleanValue();
            }
        }
        final String error = WebAccountManager.loginErrorFuture.join();
        if (error != null) {
            final WebAccountManager instance = WebAccountManager.INSTANCE;
            Intrinsics.checkNotNullExpressionValue((Object)exchange, "exchange");
            instance.send(exchange, "/assets/essential/account/error.html", MapsKt.mapOf(TuplesKt.to((Object)"error", (Object)error)));
        }
        else {
            exchange.getResponseHeaders().add("Location", "/login/success");
            exchange.sendResponseHeaders(302, 0L);
            exchange.getResponseBody().close();
        }
    }
    
    private static final void registerMicrosoftAccountListener$lambda-11$lambda-10(final MicrosoftAccountSessionFactory $factory, final CompletableFuture $oauthUriFuture, final CompletableFuture $loginErrorFuture) {
        Intrinsics.checkNotNullParameter((Object)$factory, "$factory");
        Intrinsics.checkNotNullParameter((Object)$oauthUriFuture, "$oauthUriFuture");
        Intrinsics.checkNotNullParameter((Object)$loginErrorFuture, "$loginErrorFuture");
        try {
            final UUID it = $factory.login($oauthUriFuture).getProfile().getId();
            final AccountManager accountManager = WebAccountManager.mostRecentAccountManager.get();
            if (accountManager != null) {
                Intrinsics.checkNotNullExpressionValue((Object)it, "it");
                accountManager.login(it);
            }
            $loginErrorFuture.complete(null);
        }
        catch (final Exception e) {
            $loginErrorFuture.complete(e.getMessage());
            if (WebAccountManager.mostRecentAccountManager.get() != null) {
                final Notifications instance = Notifications.INSTANCE;
                final String title = "Error logging in";
                String message;
                if ((message = e.getMessage()) == null) {
                    message = "";
                }
                instance.push(title, message);
            }
            e.printStackTrace();
        }
    }
    
    private static final void registerMicrosoftAccountListener$lambda-11(final WebAccountManager this$0, final HttpExchange exchange) {
        Intrinsics.checkNotNullParameter((Object)this$0, "this$0");
        final CompletableFuture oauthUriFuture2 = new CompletableFuture();
        final CompletableFuture it = WebAccountManager.oauthUriFuture = oauthUriFuture2;
        final CompletableFuture oauthUriFuture = oauthUriFuture2;
        final CompletableFuture loginErrorFuture2 = new CompletableFuture();
        final CompletableFuture it2 = WebAccountManager.loginErrorFuture = loginErrorFuture2;
        final CompletableFuture loginErrorFuture = loginErrorFuture2;
        WebAccountManager.authorizationCodeFuture = new CompletableFuture<String>();
        final MicrosoftAccountSessionFactory factory = WebAccountManager.INSTANCE.getMicrosoftSessionFactory();
        Multithreading.runAsync(WebAccountManager::registerMicrosoftAccountListener$lambda-11$lambda-10);
        final WebAccountManager instance = WebAccountManager.INSTANCE;
        Intrinsics.checkNotNullExpressionValue((Object)exchange, "exchange");
        instance.send(exchange, "/assets/essential/account/login/microsoft.html", MapsKt.mapOf(TuplesKt.to((Object)"location", WebAccountManager.domain + "/microsoft/auth")));
    }
    
    private static final void registerPages$lambda-12(final HttpExchange it) {
        final WebAccountManager instance = WebAccountManager.INSTANCE;
        Intrinsics.checkNotNullExpressionValue((Object)it, "it");
        send$default$26f56c17$4f3382b3(instance, it, "/assets/essential/account/login/success.html");
    }
    
    private static final void registerPages$lambda-13(final HttpExchange exchange) {
        exchange.getResponseHeaders().add("Location", "/login/microsoft");
        exchange.sendResponseHeaders(302, 0L);
        exchange.getResponseBody().close();
    }
    
    private static final void registerAssets$lambda-14(final String $asset, final HttpExchange it) {
        Intrinsics.checkNotNullParameter((Object)$asset, "$asset");
        final WebAccountManager instance = WebAccountManager.INSTANCE;
        Intrinsics.checkNotNullExpressionValue((Object)it, "it");
        send$default$26f56c17$4f3382b3(instance, it, "/assets/essential/account/" + $asset);
    }
    
    static {
        INSTANCE = new WebAccountManager();
        WebAccountManager.domain = "https://essential.gg";
        microsoftOauthParamPattern = Pattern.compile("code=(?<code>.+)");
        WebAccountManager.microsoftRedirectUri = "https://essential.gg";
        WebAccountManager.mostRecentAccountManager = new WeakReference<AccountManager>(null);
        WebAccountManager.loginErrorFuture = new CompletableFuture<String>();
    }
}
