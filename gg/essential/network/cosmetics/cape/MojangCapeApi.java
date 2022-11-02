package gg.essential.network.cosmetics.cape;

import org.jetbrains.annotations.*;
import com.mojang.authlib.properties.*;
import gg.essential.util.*;
import gg.essential.handlers.*;
import java.util.*;
import kotlin.jvm.internal.*;
import net.minecraft.client.*;
import java.io.*;
import gg.essential.lib.kbrewster.exceptions.*;
import kotlin.*;
import kotlin.io.*;
import gg.essential.lib.okhttp3.*;
import gg.essential.lib.gson.annotations.*;
import kotlin.text.*;
import gg.essential.lib.gson.*;
import gg.essential.lib.gson.stream.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u00000
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0000
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010 
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0000
                                                   \u0002\u0010\u000e
                                                   \u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\u000eB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u0006\u0010\b\u001a\u00020	J\u0010\u0010
                                                   \u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u0004¢\u0006\u0002
                                                   \u0000¨\u0006\u000f""" }, d2 = { "Lgg/essential/network/cosmetics/cape/MojangCapeApi;", "", "()V", "JSON", "Lgg/essential/lib/okhttp3/MediaType;", "fetchCapes", "", "Lgg/essential/network/cosmetics/cape/MojangCapeApi$Cape;", "fetchCurrentTextures", "Lcom/mojang/authlib/properties/Property;", "putCape", "", "id", "", "Cape", "essential" })
public final class MojangCapeApi
{
    @NotNull
    public static final MojangCapeApi INSTANCE;
    @Nullable
    private static final MediaType JSON;
    
    private MojangCapeApi() {
        super();
    }
    
    @NotNull
    public final Property fetchCurrentTextures() {
        final Property textureProperty = EssentialSkinManager.getTextureProperty(UUIDUtil.getClientUUID());
        if (textureProperty == null) {
            throw new IOException("Failed to fetch current texture property");
        }
        return textureProperty;
    }
    
    @NotNull
    public final List<Cape> fetchCapes() {
        @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                           \u0000+
                                                           \u0000
                                                           \u0002\u0010\u0000
                                                           \u0000
                                                           \u0002\u0010 
                                                           \u0002\u0018\u0002
                                                           \u0002\b\u0007
                                                           \u0002\u0010\u000b
                                                           \u0002\b\u0002
                                                           \u0002\u0010\b
                                                           \u0000
                                                           \u0002\u0010\u000e
                                                           \u0000*\u0001\u0000\b\u008a\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u001e\u0010	\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0001¢\u0006\u0002\u0010
                                                           J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J	\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001J	\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b
                                                           \u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012""" }, d2 = { "gg/essential/network/cosmetics/cape/MojangCapeApi$fetchCapes$Response", "", "capes", "", "Lgg/essential/network/cosmetics/cape/MojangCapeApi$Cape;", "(Ljava/util/List;)V", "getCapes", "()Ljava/util/List;", "component1", "copy", "(Ljava/util/List;)Lgg/essential/network/cosmetics/cape/MojangCapeApi$fetchCapes$Response;", "equals", "", "other", "hashCode", "", "toString", "", "essential" })
        public static final class Response
        {
            @NotNull
            private final List<Cape> capes;
            
            @NotNull
            public final List<Cape> getCapes() {
                return this.capes;
            }
            
            @NotNull
            @Override
            public String toString() {
                return "Response(capes=" + this.capes;
            }
            
            @Override
            public int hashCode() {
                return this.capes.hashCode();
            }
            
            @Override
            public boolean equals(@Nullable final Object other) {
                return this == other || (other instanceof Response && Intrinsics.areEqual((Object)this.capes, (Object)((Response)other).capes));
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: invokevirtual   net/minecraft/client/MinecraftClient.getSession:()Lnet/minecraft/client/util/Session;
        //     6: invokevirtual   net/minecraft/client/util/Session.getAccessToken:()Ljava/lang/String;
        //     9: astore_1        /* accessToken */
        //    10: new             Lgg/essential/lib/okhttp3/Request$Builder;
        //    13: dup            
        //    14: invokespecial   gg/essential/lib/okhttp3/Request$Builder.<init>:()V
        //    17: astore_3       
        //    18: aload_3        
        //    19: astore          $this$fetchCapes_u24lambda_u2d0
        //    21: aload           $this$fetchCapes_u24lambda_u2d0
        //    23: ldc             "https://api.minecraftservices.com/minecraft/profile"
        //    25: invokevirtual   gg/essential/lib/okhttp3/Request$Builder.url:(Ljava/lang/String;)Lgg/essential/lib/okhttp3/Request$Builder;
        //    28: pop            
        //    29: aload           $this$fetchCapes_u24lambda_u2d0
        //    31: ldc             "Authorization"
        //    33: aload_1         /* accessToken */
        //    34: invokedynamic   BootstrapMethod #0, makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
        //    39: invokevirtual   gg/essential/lib/okhttp3/Request$Builder.header:(Ljava/lang/String;Ljava/lang/String;)Lgg/essential/lib/okhttp3/Request$Builder;
        //    42: pop            
        //    43: aload_3        
        //    44: invokevirtual   gg/essential/lib/okhttp3/Request$Builder.build:()Lgg/essential/lib/okhttp3/Request;
        //    47: astore_2        /* request */
        //    48: new             Lgg/essential/lib/okhttp3/OkHttpClient;
        //    51: dup            
        //    52: invokespecial   gg/essential/lib/okhttp3/OkHttpClient.<init>:()V
        //    55: aload_2         /* request */
        //    56: invokevirtual   gg/essential/lib/okhttp3/OkHttpClient.newCall:(Lgg/essential/lib/okhttp3/Request;)Lgg/essential/lib/okhttp3/Call;
        //    59: invokeinterface gg/essential/lib/okhttp3/Call.execute:()Lgg/essential/lib/okhttp3/Response;
        //    64: checkcast       Ljava/io/Closeable;
        //    67: astore          4
        //    69: aconst_null    
        //    70: astore          5
        //    72: aload           4
        //    74: checkcast       Lgg/essential/lib/okhttp3/Response;
        //    77: astore          it
        //    79: aload           it
        //    81: invokevirtual   gg/essential/lib/okhttp3/Response.body:()Lgg/essential/lib/okhttp3/ResponseBody;
        //    84: dup            
        //    85: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNull:(Ljava/lang/Object;)V
        //    88: invokevirtual   gg/essential/lib/okhttp3/ResponseBody.string:()Ljava/lang/String;
        //    91: astore          null
        //    93: aload           4
        //    95: aload           5
        //    97: invokestatic    kotlin/io/CloseableKt.closeFinally:(Ljava/io/Closeable;Ljava/lang/Throwable;)V
        //   100: aload           6
        //   102: goto            126
        //   105: astore          6
        //   107: aload           6
        //   109: astore          5
        //   111: aload           6
        //   113: athrow         
        //   114: astore          6
        //   116: aload           4
        //   118: aload           5
        //   120: invokestatic    kotlin/io/CloseableKt.closeFinally:(Ljava/io/Closeable;Ljava/lang/Throwable;)V
        //   123: aload           6
        //   125: athrow         
        //   126: astore_3        /* responseStr */
        //   127: new             Lgg/essential/lib/gson/Gson;
        //   130: dup            
        //   131: invokespecial   gg/essential/lib/gson/Gson.<init>:()V
        //   134: aload_3         /* responseStr */
        //   135: ldc             Lgg/essential/network/cosmetics/cape/MojangCapeApi$fetchCapes$Response;.class
        //   137: invokevirtual   gg/essential/lib/gson/Gson.fromJson:(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
        //   140: checkcast       Lgg/essential/network/cosmetics/cape/MojangCapeApi$fetchCapes$Response;
        //   143: astore          response
        //   145: aload           response
        //   147: invokevirtual   gg/essential/network/cosmetics/cape/MojangCapeApi$fetchCapes$Response.getCapes:()Ljava/util/List;
        //   150: areturn        
        //    Signature:
        //  ()Ljava/util/List<Lgg/essential/network/cosmetics/cape/MojangCapeApi$Cape;>;
        //    StackMapTable: 00 03 FF 00 69 00 06 07 00 02 07 00 9D 07 00 9F 07 00 58 07 00 84 05 00 01 07 00 46 FF 00 08 00 06 07 00 02 07 00 9D 07 00 9F 07 00 58 07 00 84 07 00 46 00 01 07 00 46 FF 00 0B 00 07 07 00 02 07 00 9D 07 00 9F 07 00 58 07 00 84 05 07 00 9D 00 01 07 00 9D
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  72     93     105    114    Ljava/lang/Throwable;
        //  72     93     114    126    Any
        //  105    114    114    126    Any
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public final void putCape(@Nullable final String id) {
        final String accessToken = MinecraftClient.getInstance().getSession().getAccessToken();
        final Request.Builder $this$putCape_u24lambda_u2d2;
        final Request.Builder builder = $this$putCape_u24lambda_u2d2 = new Request.Builder();
        $this$putCape_u24lambda_u2d2.url("https://api.minecraftservices.com/minecraft/profile/capes/active");
        $this$putCape_u24lambda_u2d2.header("Authorization", "Bearer " + accessToken);
        if (id != null) {
            final String payload = new Gson().toJson(new MojangCapeApi$putCape$request$1.Payload(id));
            $this$putCape_u24lambda_u2d2.put(RequestBody.create(MojangCapeApi.JSON, payload));
        }
        else {
            $this$putCape_u24lambda_u2d2.delete();
        }
        final Request request = builder.build();
        final Closeable closeable = new OkHttpClient().newCall(request).execute();
        Throwable t = null;
        try {
            final Response response = (Response)closeable;
            if (response.code() != 200) {
                final ResponseBody body = response.body();
                final String s2;
                final String s = s2 = ((body != null) ? body.string() : null);
                String msg;
                if (s2 == null) {
                    msg = "<null";
                }
                else {
                    Intrinsics.checkNotNullExpressionValue((Object)s2, "response.body()?.string() ?: \"<null\"");
                    msg = s;
                }
                throw new APIException(msg);
            }
            final Unit instance = Unit.INSTANCE;
        }
        catch (final Throwable t2) {
            t = t2;
            throw t2;
        }
        finally {
            CloseableKt.closeFinally(closeable, t);
        }
    }
    
    static {
        INSTANCE = new MojangCapeApi();
        JSON = MediaType.parse("application/json");
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                       \u0000 
                                                       \u0002\u0018\u0002
                                                       \u0002\u0010\u0000
                                                       \u0000
                                                       \u0002\u0010\u000e
                                                       \u0000
                                                       \u0002\u0010\u000b
                                                       \u0002\b\u0013
                                                       \u0002\u0010\b
                                                       \u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u001bB%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ	\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J	\u0010\u0012\u001a\u00020\u0005H\u00c6\u0003J	\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J	\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J1\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0016\u001a\u00020\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J	\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001J	\u0010\u001a\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b
                                                       \u0000\u001a\u0004\b	\u0010
                                                       R\u0011\u0010\u000b\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b
                                                       \u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b
                                                       \u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b
                                                       \u0000\u001a\u0004\b\u0010\u0010¨\u0006\u001c""" }, d2 = { "Lgg/essential/network/cosmetics/cape/MojangCapeApi$Cape;", "", "id", "", "active", "", "url", "name", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V", "getActive", "()Z", "hash", "getHash", "()Ljava/lang/String;", "getId", "getName", "getUrl", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "StateAdapter", "essential" })
    public static final class Cape
    {
        @NotNull
        private final String id;
        @SerializedName("state")
        @JsonAdapter(StateAdapter.class)
        private final boolean active;
        @NotNull
        private final String url;
        @SerializedName("alias")
        @NotNull
        private final String name;
        
        @NotNull
        public final String getId() {
            return this.id;
        }
        
        public final boolean getActive() {
            return this.active;
        }
        
        @NotNull
        public final String getUrl() {
            return this.url;
        }
        
        @NotNull
        public final String getName() {
            return this.name;
        }
        
        @NotNull
        public final String getHash() {
            return StringsKt.split$default((CharSequence)this.url, new String[] { "/texture/" }, false, 0, 6, (Object)null).get(1);
        }
        
        @NotNull
        @Override
        public String toString() {
            return "Cape(id=" + this.id + ", active=" + this.active + ", url=" + this.url + ", name=" + this.name;
        }
        
        @Override
        public int hashCode() {
            int result = this.id.hashCode();
            final int n = result * 31;
            int active;
            if ((active = (this.active ? 1 : 0)) != 0) {
                active = 1;
            }
            result = n + active;
            result = result * 31 + this.url.hashCode();
            result = result * 31 + this.name.hashCode();
            return result;
        }
        
        @Override
        public boolean equals(@Nullable final Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Cape)) {
                return false;
            }
            final Cape cape = (Cape)other;
            return Intrinsics.areEqual((Object)this.id, (Object)cape.id) && this.active == cape.active && Intrinsics.areEqual((Object)this.url, (Object)cape.url) && Intrinsics.areEqual((Object)this.name, (Object)cape.name);
        }
        
        @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                           \u0000&
                                                           \u0002\u0018\u0002
                                                           \u0002\u0018\u0002
                                                           \u0002\u0010\u000b
                                                           \u0002\b\u0003
                                                           \u0002\u0018\u0002
                                                           \u0002\b\u0002
                                                           \u0002\u0010\u0002
                                                           \u0000
                                                           \u0002\u0018\u0002
                                                           \u0002\b\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0015\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¢\u0006\u0002\u0010\u0007J\u0018\u0010\b\u001a\u00020	2\u0006\u0010
                                                           \u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0016¨\u0006""" }, d2 = { "Lgg/essential/network/cosmetics/cape/MojangCapeApi$Cape$StateAdapter;", "Lgg/essential/lib/gson/TypeAdapter;", "", "()V", "read", "reader", "Lgg/essential/lib/gson/stream/JsonReader;", "(Lgg/essential/lib/gson/stream/JsonReader;)Ljava/lang/Boolean;", "write", "", "out", "Lgg/essential/lib/gson/stream/JsonWriter;", "value", "essential" })
        private static final class StateAdapter extends TypeAdapter<Boolean>
        {
            @NotNull
            @Override
            public Boolean read(@NotNull final JsonReader reader) {
                Intrinsics.checkNotNullParameter((Object)reader, "reader");
                return Intrinsics.areEqual((Object)reader.nextString(), (Object)"ACTIVE");
            }
            
            public void write(@NotNull final JsonWriter out, final boolean value) {
                Intrinsics.checkNotNullParameter((Object)out, "out");
                out.value(value ? "ACTIVE" : "INACTIVE");
            }
            
            @Override
            public /* bridge */ Object read(final JsonReader p0) {
                return this.read(p0);
            }
            
            @Override
            public /* bridge */ void write(final JsonWriter p0, final Object p1) {
                this.write(p0, (boolean)p1);
            }
        }
    }
}
