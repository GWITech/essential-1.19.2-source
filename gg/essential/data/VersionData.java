package gg.essential.data;

import java.io.*;
import java.util.*;
import kotlin.jvm.internal.*;
import kotlin.text.*;
import kotlin.collections.*;
import gg.essential.*;
import kotlin.io.*;
import java.nio.charset.*;
import gg.essential.universal.*;
import gg.essential.connectionmanager.common.packet.mod.*;
import kotlin.jvm.functions.*;
import kotlin.*;
import gg.essential.lib.gson.annotations.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000:
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0000
                                                   \u0002\b\u0002
                                                   \u0002\u0010\u000e
                                                   \u0002\b\r
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0006
                                                   \u0002\u0010 
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0004
                                                   \u0002\u0010\u0002
                                                   \u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001&B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0004J\u0006\u0010\u0017\u001a\u00020\u0004J\u0006\u0010\u0018\u001a\u00020\u0004J\u0006\u0010\u0019\u001a\u00020\u0004J\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u001b2\u0006\u0010\u001c\u001a\u00020\u0004J\r\u0010\u001d\u001a\u00020\u001eH\u0000¢\u0006\u0002\b\u001fJ\r\u0010 \u001a\u00020\u0004H\u0000¢\u0006\u0002\b!J\b\u0010"\u001a\u00020#H\u0002J\u0006\u0010$\u001a\u00020#J\u0006\u0010%\u001a\u00020#R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b
                                                   \u0000\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\u0007\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f
                                                   \u0004\b	\u0010
                                                   \u001a\u0004\b\b\u0010\u0006R\u0011\u0010\u000b\u001a\u00020\u0004¢\u0006\b
                                                   \u0000\u001a\u0004\b\f\u0010\u0006R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002
                                                   \u0000R\u001b\u0010\u000e\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b\u0010\u0010
                                                   \u001a\u0004\b\u000f\u0010\u0006R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002
                                                   \u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002
                                                   \u0000¨\u0006'""" }, d2 = { "Lgg/essential/data/VersionData;", "", "()V", "essentialBranch", "", "getEssentialBranch", "()Ljava/lang/String;", "essentialCommit", "getEssentialCommit", "essentialCommit$delegate", "Lkotlin/Lazy;", "essentialVersion", "getEssentialVersion", "noSavedVersion", "platform", "getPlatform", "platform$delegate", "state", "Lgg/essential/data/VersionData$State;", "versionFile", "Ljava/io/File;", "formatPlatform", "unformatted", "getEssentialPlatform", "getLastSeenChangelog", "getLastSeenModal", "getMajorComponents", "", "version", "getMinecraftPlatform", "Lgg/essential/connectionmanager/common/packet/mod/ClientModsAnnouncePacket$Platform;", "getMinecraftPlatform$essential", "getMinecraftVersion", "getMinecraftVersion$essential", "saveData", "", "updateLastSeenChangelog", "updateLastSeenModal", "State", "essential" })
public final class VersionData
{
    @NotNull
    public static final VersionData INSTANCE;
    @NotNull
    private static final String essentialVersion;
    @NotNull
    private static final String essentialBranch;
    @NotNull
    private static final Lazy essentialCommit$delegate;
    @NotNull
    private static final File versionFile;
    @NotNull
    private static State state;
    @NotNull
    private static final Lazy platform$delegate;
    
    private VersionData() {
        super();
    }
    
    @NotNull
    public final String getEssentialVersion() {
        return VersionData.essentialVersion;
    }
    
    @NotNull
    public final String getEssentialBranch() {
        return VersionData.essentialBranch;
    }
    
    @NotNull
    public final String getEssentialCommit() {
        return (String)VersionData.essentialCommit$delegate.getValue();
    }
    
    private final String getPlatform() {
        return (String)VersionData.platform$delegate.getValue();
    }
    
    @NotNull
    public final List<String> getMajorComponents(@NotNull final String version) {
        Intrinsics.checkNotNullParameter((Object)version, "version");
        return CollectionsKt.take((Iterable)StringsKt.split$default((CharSequence)version, new String[] { ".", "+", "-", "_" }, false, 0, 6, (Object)null), 3);
    }
    
    @NotNull
    public final String getLastSeenModal() {
        return VersionData.state.getLastSeenModal();
    }
    
    public final void updateLastSeenModal() {
        if (!Intrinsics.areEqual((Object)this.getLastSeenModal(), (Object)VersionData.essentialVersion)) {
            VersionData.state = State.copy$default$71ca3790(VersionData.state, VersionData.essentialVersion, null, 2);
            this.saveData();
        }
    }
    
    @NotNull
    public final String getLastSeenChangelog() {
        return VersionData.state.getLastSeenChangelog();
    }
    
    public final void updateLastSeenChangelog() {
        if (!Intrinsics.areEqual((Object)this.getLastSeenChangelog(), (Object)VersionData.essentialVersion)) {
            VersionData.state = State.copy$default$71ca3790(VersionData.state, null, VersionData.essentialVersion, 1);
            this.saveData();
        }
    }
    
    private final void saveData() {
        final File versionFile = VersionData.versionFile;
        final String json = Essential.GSON.toJson(VersionData.state);
        Intrinsics.checkNotNullExpressionValue((Object)json, "GSON.toJson(state)");
        FilesKt.writeText$default(versionFile, json, (Charset)null, 2, (Object)null);
    }
    
    @NotNull
    public final String getEssentialPlatform() {
        return this.getPlatform();
    }
    
    @NotNull
    public final String getMinecraftVersion$essential() {
        final String id = UMinecraft.getMinecraft().getGame().getVersion().getId();
        Intrinsics.checkNotNullExpressionValue((Object)id, "getMinecraft().game.version.id");
        return id;
    }
    
    @NotNull
    public final ClientModsAnnouncePacket.Platform getMinecraftPlatform$essential() {
        return ClientModsAnnouncePacket.Platform.FABRIC;
    }
    
    @NotNull
    public final String formatPlatform(@NotNull final String unformatted) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "unformatted"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_1         /* unformatted */
        //     7: checkcast       Ljava/lang/CharSequence;
        //    10: iconst_1       
        //    11: anewarray       Ljava/lang/String;
        //    14: astore_3       
        //    15: aload_3        
        //    16: iconst_0       
        //    17: ldc             "_"
        //    19: aastore        
        //    20: aload_3        
        //    21: iconst_0       
        //    22: iconst_0       
        //    23: bipush          6
        //    25: aconst_null    
        //    26: invokestatic    kotlin/text/StringsKt.split$default:(Ljava/lang/CharSequence;[Ljava/lang/String;ZIILjava/lang/Object;)Ljava/util/List;
        //    29: astore_2        /* split */
        //    30: aload_2         /* split */
        //    31: invokeinterface java/util/List.size:()I
        //    36: iconst_1       
        //    37: if_icmple       154
        //    40: aload_2         /* split */
        //    41: iconst_0       
        //    42: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //    47: checkcast       Ljava/lang/String;
        //    50: astore          4
        //    52: aload           4
        //    54: checkcast       Ljava/lang/CharSequence;
        //    57: invokeinterface java/lang/CharSequence.length:()I
        //    62: ifle            69
        //    65: iconst_1       
        //    66: goto            70
        //    69: iconst_0       
        //    70: ifeq            144
        //    73: new             Ljava/lang/StringBuilder;
        //    76: dup            
        //    77: invokespecial   java/lang/StringBuilder.<init>:()V
        //    80: aload           4
        //    82: iconst_0       
        //    83: invokevirtual   java/lang/String.charAt:(I)C
        //    86: istore          5
        //    88: astore          6
        //    90: iload           it
        //    92: invokestatic    java/lang/String.valueOf:(C)Ljava/lang/String;
        //    95: dup            
        //    96: ldc             "null cannot be cast to non-null type java.lang.String"
        //    98: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //   101: getstatic       java/util/Locale.ROOT:Ljava/util/Locale;
        //   104: invokevirtual   java/lang/String.toUpperCase:(Ljava/util/Locale;)Ljava/lang/String;
        //   107: dup            
        //   108: ldc             "this as java.lang.String).toUpperCase(Locale.ROOT)"
        //   110: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   113: aload           6
        //   115: swap           
        //   116: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   119: aload           4
        //   121: astore          5
        //   123: aload           5
        //   125: iconst_1       
        //   126: invokevirtual   java/lang/String.substring:(I)Ljava/lang/String;
        //   129: dup            
        //   130: ldc             "this as java.lang.String).substring(startIndex)"
        //   132: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   135: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   138: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   141: goto            146
        //   144: aload           4
        //   146: invokedynamic   BootstrapMethod #0, makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
        //   151: goto            157
        //   154: ldc_w           ""
        //   157: astore_3        /* platform */
        //   158: aload_2         /* split */
        //   159: invokestatic    kotlin/collections/CollectionsKt.last:(Ljava/util/List;)Ljava/lang/Object;
        //   162: checkcast       Ljava/lang/String;
        //   165: ldc             "-"
        //   167: ldc             "."
        //   169: iconst_0       
        //   170: iconst_4       
        //   171: aconst_null    
        //   172: invokestatic    kotlin/text/StringsKt.replace$default:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;
        //   175: astore          version
        //   177: aload           version
        //   179: aload_3         /* platform */
        //   180: invokedynamic   BootstrapMethod #1, makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //   185: areturn        
        //    MethodParameters:
        //  Name         Flags  
        //  -----------  -----
        //  unformatted  
        //    StackMapTable: 00 06 FE 00 45 07 00 C3 07 00 D0 07 00 50 40 01 FB 00 49 41 07 00 50 FA 00 07 42 07 00 50
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    static {
        INSTANCE = new VersionData();
        final String property = System.getProperty("essential.version", "0.0.0");
        Intrinsics.checkNotNullExpressionValue((Object)property, "getProperty(\"essential.version\", noSavedVersion)");
        essentialVersion = property;
        final String property2 = System.getProperty("essential.branch", "stable");
        Intrinsics.checkNotNullExpressionValue((Object)property2, "getProperty(\"essential.branch\", \"stable\")");
        essentialBranch = property2;
        essentialCommit$delegate = LazyKt.lazy((Function0)VersionData$essentialCommit.VersionData$essentialCommit$2.INSTANCE);
        versionFile = new File(Essential.getInstance().getBaseDir(), "version.json");
        VersionData.state = new State((byte)0);
        platform$delegate = LazyKt.lazy((Function0)VersionData$platform.VersionData$platform$2.INSTANCE);
        if (!VersionData.versionFile.exists()) {
            VersionData.INSTANCE.saveData();
        }
        else {
            try {
                final State fromJson = Essential.GSON.fromJson(FilesKt.readText$default(VersionData.versionFile, (Charset)null, 1, (Object)null), State.class);
                Intrinsics.checkNotNullExpressionValue((Object)fromJson, "GSON.fromJson(versionFil\u2026ext(), State::class.java)");
                VersionData.state = fromJson;
            }
            catch (final Exception ex) {
                Essential.logger.error("Failed to read from Version JSON, rewriting file.");
                VersionData.INSTANCE.saveData();
            }
        }
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                       \u0000"
                                                       \u0002\u0018\u0002
                                                       \u0002\u0010\u0000
                                                       \u0000
                                                       \u0002\u0010\u000e
                                                       \u0002\b	
                                                       \u0002\u0010\u000b
                                                       \u0002\b\u0002
                                                       \u0002\u0010\b
                                                       \u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J	\u0010	\u001a\u00020\u0003H\u00c6\u0003J	\u0010
                                                       \u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J	\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001J	\u0010\u0011\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b
                                                       \u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b
                                                       \u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012""" }, d2 = { "Lgg/essential/data/VersionData$State;", "", "lastSeenModal", "", "lastSeenChangelog", "(Ljava/lang/String;Ljava/lang/String;)V", "getLastSeenChangelog", "()Ljava/lang/String;", "getLastSeenModal", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "essential" })
    private static final class State
    {
        @SerializedName("version")
        @NotNull
        private final String lastSeenModal;
        @NotNull
        private final String lastSeenChangelog;
        
        public State(@NotNull final String lastSeenModal, @NotNull final String lastSeenChangelog) {
            Intrinsics.checkNotNullParameter((Object)lastSeenModal, "lastSeenModal");
            Intrinsics.checkNotNullParameter((Object)lastSeenChangelog, "lastSeenChangelog");
            super();
            this.lastSeenModal = lastSeenModal;
            this.lastSeenChangelog = lastSeenChangelog;
        }
        
        public State(final byte b) {
            this("0.0.0", VersionData.INSTANCE.getEssentialVersion());
        }
        
        @NotNull
        public final String getLastSeenModal() {
            return this.lastSeenModal;
        }
        
        @NotNull
        public final String getLastSeenChangelog() {
            return this.lastSeenChangelog;
        }
        
        @NotNull
        public final State copy(@NotNull final String lastSeenModal, @NotNull final String lastSeenChangelog) {
            Intrinsics.checkNotNullParameter((Object)lastSeenModal, "lastSeenModal");
            Intrinsics.checkNotNullParameter((Object)lastSeenChangelog, "lastSeenChangelog");
            return new State(lastSeenModal, lastSeenChangelog);
        }
        
        public static /* synthetic */ State copy$default$71ca3790(final State state, String lastSeenModal, String lastSeenChangelog, final int n) {
            if ((n & 0x1) != 0x0) {
                lastSeenModal = state.lastSeenModal;
            }
            if ((n & 0x2) != 0x0) {
                lastSeenChangelog = state.lastSeenChangelog;
            }
            return state.copy(lastSeenModal, lastSeenChangelog);
        }
        
        @NotNull
        @Override
        public String toString() {
            return "State(lastSeenModal=" + this.lastSeenModal + ", lastSeenChangelog=" + this.lastSeenChangelog;
        }
        
        @Override
        public int hashCode() {
            int result = this.lastSeenModal.hashCode();
            result = result * 31 + this.lastSeenChangelog.hashCode();
            return result;
        }
        
        @Override
        public boolean equals(@Nullable final Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof State)) {
                return false;
            }
            final State state = (State)other;
            return Intrinsics.areEqual((Object)this.lastSeenModal, (Object)state.lastSeenModal) && Intrinsics.areEqual((Object)this.lastSeenChangelog, (Object)state.lastSeenChangelog);
        }
        
        public State() {
            this((byte)0);
        }
    }
}
