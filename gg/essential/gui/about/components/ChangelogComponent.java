package gg.essential.gui.about.components;

import gg.essential.elementa.components.*;
import kotlin.reflect.*;
import kotlin.*;
import java.awt.*;
import gg.essential.gui.elementa.*;
import gg.essential.gui.*;
import kotlin.properties.*;
import gg.essential.util.*;
import gg.essential.elementa.constraints.*;
import gg.essential.elementa.dsl.*;
import gg.essential.gui.common.shadow.*;
import gg.essential.gui.about.*;
import gg.essential.elementa.markdown.*;
import gg.essential.elementa.font.*;
import gg.essential.elementa.state.*;
import gg.essential.gui.common.*;
import gg.essential.elementa.*;
import java.time.*;
import gg.essential.data.*;
import kotlin.jvm.functions.*;
import kotlin.collections.*;
import kotlin.jvm.internal.*;
import java.util.*;
import org.jetbrains.annotations.*;
import gg.essential.lib.gson.annotations.*;
import gg.essential.lib.gson.*;
import gg.essential.lib.gson.stream.*;
import kotlin.text.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000:
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u000b
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u000e
                                                   \u0002\b\u000b
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002\u0018\u00002\u00020\u0001:\u0002\u0011\u0012B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\u0014\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020
                                                   \u0012\u0004\u0012\u00020
                                                   0	H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u001d\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020
                                                   \u0012\u0004\u0012\u00020
                                                   0	¢\u0006\b
                                                   \u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020
                                                   ¢\u0006\b
                                                   \u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013²\u0006
                                                   \u0010\u0014\u001a\u00020\u0001X\u008a\u0084\u0002²\u0006
                                                   \u0010\u0015\u001a\u00020\u0016X\u008a\u0084\u0002²\u0006
                                                   \u0010\u0017\u001a\u00020\u0016X\u008a\u0084\u0002²\u0006
                                                   \u0010\u0018\u001a\u00020\u0019X\u008a\u0084\u0002²\u0006
                                                   \u0010\u001a\u001a\u00020\u001bX\u008a\u0084\u0002""" }, d2 = { "Lgg/essential/gui/about/components/ChangelogComponent;", "Lgg/essential/elementa/components/UIContainer;", "changelog", "Lgg/essential/gui/about/components/ChangelogComponent$Changelog;", "platformSpecific", "Lgg/essential/elementa/state/BasicState;", "", "(Lgg/essential/gui/about/components/ChangelogComponent$Changelog;Lgg/essential/elementa/state/BasicState;)V", "data", "Lkotlin/Pair;", "", "getData", "()Lkotlin/Pair;", "version", "getVersion", "()Ljava/lang/String;", "getChangelogContent", "Changelog", "PlatformChangelog", "essential", "headerContainer", "headerText", "Lgg/essential/gui/common/shadow/EssentialUIText;", "dateText", "summary", "Lgg/essential/gui/common/shadow/EssentialUIWrappedText;", "mainChangelog", "Lgg/essential/elementa/markdown/MarkdownComponent;" })
public final class ChangelogComponent extends UIContainer
{
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties;
    @NotNull
    private final Changelog changelog;
    @NotNull
    private final String version;
    @NotNull
    private final Pair<String, String> data;
    
    public ChangelogComponent(@NotNull final Changelog changelog, @NotNull final BasicState<Boolean> platformSpecific) {
        Intrinsics.checkNotNullParameter((Object)changelog, "changelog");
        Intrinsics.checkNotNullParameter((Object)platformSpecific, "platformSpecific");
        super();
        this.changelog = changelog;
        this.version = this.changelog.getVersion();
        this.data = this.getChangelogContent();
        final UIComponent $this$constrain_u24lambda_u2d0$iv;
        final UIComponent $this$constrain$iv = $this$constrain_u24lambda_u2d0$iv = this;
        final UIConstraints $this$_init__u24lambda_u2d0 = $this$constrain_u24lambda_u2d0$iv.getConstraints();
        $this$_init__u24lambda_u2d0.setY(new SiblingConstraint(33.0f, false, 2, null));
        $this$_init__u24lambda_u2d0.setHeight(new ChildBasedSizeConstraint(0.0f, 1, null));
        $this$_init__u24lambda_u2d0.setWidth(UtilitiesKt.getPercent(65));
        final UIComponent $this$constrain_u24lambda_u2d0$iv2;
        final UIComponent $this$constrain$iv2 = $this$constrain_u24lambda_u2d0$iv2 = new UIContainer();
        final UIConstraints $this$_init__u24lambda_u2d2 = $this$constrain_u24lambda_u2d0$iv2.getConstraints();
        $this$_init__u24lambda_u2d2.setY(new SiblingConstraint(15.0f, false, 2, null));
        $this$_init__u24lambda_u2d2.setWidth(UtilitiesKt.getPercent(100));
        $this$_init__u24lambda_u2d2.setHeight(new ChildBasedRangeConstraint());
        final ReadWriteProperty headerContainer$delegate = ComponentsKt.provideDelegate((UIComponent)ComponentsKt.childOf($this$constrain_u24lambda_u2d0$iv2, this), null, ChangelogComponent.$$delegatedProperties[0]);
        final UIComponent $this$constrain_u24lambda_u2d0$iv3;
        final UIComponent $this$constrain$iv3 = $this$constrain_u24lambda_u2d0$iv3 = new EssentialUIText("Essential Mod v" + this.version, false, (Color)null, false, false, false, 62);
        final UIConstraints $this$_init__u24lambda_u2d3 = $this$constrain_u24lambda_u2d0$iv3.getConstraints();
        $this$_init__u24lambda_u2d3.setTextScale(new GuiScaleOffsetConstraint(1.0f));
        $this$_init__u24lambda_u2d3.setColor(UtilitiesKt.toConstraint(EssentialPalette.ACCENT_BLUE));
        final ReadWriteProperty headerText$delegate = ComponentsKt.provideDelegate((UIComponent)ComponentsKt.childOf($this$constrain_u24lambda_u2d0$iv3, _init_$lambda-2((ReadWriteProperty<Object, UIContainer>)headerContainer$delegate)), null, ChangelogComponent.$$delegatedProperties[1]);
        final LocalDate date = Instant.ofEpochMilli(this.changelog.getTimestamp()).atZone(ZoneId.systemDefault()).toLocalDate();
        Intrinsics.checkNotNullExpressionValue((Object)date, "date");
        final UIComponent $this$constrain_u24lambda_u2d0$iv4;
        final UIComponent $this$constrain$iv4 = $this$constrain_u24lambda_u2d0$iv4 = new EssentialUIText(HelpersKt.formatDate(date), false, null, false, false, false, 62);
        final UIConstraints $this$_init__u24lambda_u2d4 = $this$constrain_u24lambda_u2d0$iv4.getConstraints();
        $this$_init__u24lambda_u2d4.setX(new SiblingConstraint(11.0f, false, 2, null));
        $this$_init__u24lambda_u2d4.setY(ConstraintsKt.boundTo((YConstraint)UtilitiesKt.pixels$default(0, true, false, 2, null), _init_$lambda-4((ReadWriteProperty<Object, EssentialUIText>)headerText$delegate)));
        $this$_init__u24lambda_u2d4.setColor(UtilitiesKt.toConstraint(EssentialPalette.TEXT));
        ComponentsKt.provideDelegate((UIComponent)ComponentsKt.childOf($this$constrain_u24lambda_u2d0$iv4, _init_$lambda-2((ReadWriteProperty<Object, UIContainer>)headerContainer$delegate)), null, ChangelogComponent.$$delegatedProperties[2]);
        final UIComponent $this$constrain_u24lambda_u2d0$iv5;
        final UIComponent $this$constrain$iv5 = $this$constrain_u24lambda_u2d0$iv5 = new EssentialUIWrappedText(this.changelog.getSummary(), false, null, false, null, 0.0f, 126);
        final UIConstraints $this$_init__u24lambda_u2d5 = $this$constrain_u24lambda_u2d0$iv5.getConstraints();
        $this$_init__u24lambda_u2d5.setWidth(UtilitiesKt.getPercent(100));
        $this$_init__u24lambda_u2d5.setY(new SiblingConstraint(14.0f, false, 2, null));
        $this$_init__u24lambda_u2d5.setColor(UtilitiesKt.toConstraint(EssentialPalette.TEXT));
        ComponentsKt.provideDelegate((UIComponent)ComponentsKt.childOf($this$constrain_u24lambda_u2d0$iv5, _init_$lambda-2((ReadWriteProperty<Object, UIContainer>)headerContainer$delegate)), null, ChangelogComponent.$$delegatedProperties[3]);
        UIComponent $this$constrain_u24lambda_u2d0$iv6;
        UIComponent $this$constrain$iv6 = $this$constrain_u24lambda_u2d0$iv6 = new MarkdownComponent((String)this.data.getFirst(), AboutMenu.Companion.getMarkdownConfig(), 0.0f, null, true, 12, null);
        final UIConstraints $this$_init__u24lambda_u2d6 = $this$constrain_u24lambda_u2d0$iv6.getConstraints();
        $this$_init__u24lambda_u2d6.setY(new SiblingConstraint(14.0f, false, 2, null));
        $this$_init__u24lambda_u2d6.setWidth(UtilitiesKt.getPercent(100));
        final ReadWriteProperty mainChangelog$delegate = ComponentsKt.provideDelegate($this$constrain_u24lambda_u2d0$iv6, null, ChangelogComponent.$$delegatedProperties[4]);
        if (((CharSequence)this.data.getSecond()).length() > 0) {
            StateExtensionsKt.bindParent$default$6fcd5b6b(_init_$lambda-10((ReadWriteProperty<Object, MarkdownComponent>)mainChangelog$delegate), this, platformSpecific, false, null, 12);
            $this$constrain$iv6 = ($this$constrain_u24lambda_u2d0$iv6 = new MarkdownComponent((String)this.data.getSecond(), AboutMenu.Companion.getMarkdownConfig(), 0.0f, null, true, 12, null));
            final UIConstraints $this$_init__u24lambda_u2d7 = $this$constrain_u24lambda_u2d0$iv6.getConstraints();
            $this$_init__u24lambda_u2d7.setY(new SiblingConstraint(14.0f, false, 2, null));
            $this$_init__u24lambda_u2d7.setWidth(UtilitiesKt.getPercent(100));
            StateExtensionsKt.bindParent$default$6fcd5b6b($this$constrain_u24lambda_u2d0$iv6, this, StateExtensionsKt.not(platformSpecific), false, null, 12);
        }
        else {
            ComponentsKt.childOf((UIComponent)_init_$lambda-10((ReadWriteProperty<Object, MarkdownComponent>)mainChangelog$delegate), this);
        }
    }
    
    @NotNull
    public final String getVersion() {
        return this.version;
    }
    
    @NotNull
    public final Pair<String, String> getData() {
        return this.data;
    }
    
    private final Pair<String, String> getChangelogContent() {
        final StringBuilder mainLogsBuilder = new StringBuilder();
        final StringBuilder otherLogsBuilder = new StringBuilder();
        final Iterable $this$forEach$iv = this.changelog.getEntries();
        for (Object element$iv : $this$forEach$iv) {
            final PlatformChangelog platformChangelog = (PlatformChangelog)element$iv;
            if (platformChangelog.getContent().length() > 1) {
                final Collection collection = platformChangelog.getPlatforms();
                if (collection == null || collection.isEmpty()) {
                    final StringBuilder append = otherLogsBuilder.append("###### All Versions");
                    Intrinsics.checkNotNullExpressionValue((Object)append, "append(value)");
                    Intrinsics.checkNotNullExpressionValue((Object)append.append('\n'), "append('\\n')");
                    final StringBuilder append2 = otherLogsBuilder.append(platformChangelog.getContent());
                    Intrinsics.checkNotNullExpressionValue((Object)append2, "append(value)");
                    Intrinsics.checkNotNullExpressionValue((Object)append2.append('\n'), "append('\\n')");
                    final StringBuilder append3 = mainLogsBuilder.append(platformChangelog.getContent());
                    Intrinsics.checkNotNullExpressionValue((Object)append3, "append(value)");
                    Intrinsics.checkNotNullExpressionValue((Object)append3.append('\n'), "append('\\n')");
                }
                else {
                    final Iterable $this$any$iv = platformChangelog.getPlatforms();
                    boolean b = false;
                    Label_0277: {
                        if ($this$any$iv instanceof Collection && ((Collection)$this$any$iv).isEmpty()) {
                            b = false;
                        }
                        else {
                            for (final Object element$iv2 : $this$any$iv) {
                                final String it = (String)element$iv2;
                                if (Intrinsics.areEqual((Object)it, (Object)VersionData.INSTANCE.getEssentialPlatform())) {
                                    b = true;
                                    break Label_0277;
                                }
                            }
                            b = false;
                        }
                    }
                    if (b) {
                        final StringBuilder append4 = mainLogsBuilder.append("\n" + platformChangelog.getContent());
                        Intrinsics.checkNotNullExpressionValue((Object)append4, "append(value)");
                        Intrinsics.checkNotNullExpressionValue((Object)append4.append('\n'), "append('\\n')");
                    }
                    final StringBuilder header = new StringBuilder().append(CollectionsKt.joinToString$default((Iterable)platformChangelog.getPlatforms(), (CharSequence)null, (CharSequence)null, (CharSequence)null, 0, (CharSequence)null, (Function1)ChangelogComponent$getChangelogContent$1$header.ChangelogComponent$getChangelogContent$1$header$1.INSTANCE, 31, (Object)null));
                    final int index = header.lastIndexOf(",");
                    if (index != -1) {
                        header.replace(index, index + 1, " and");
                    }
                    final StringBuilder append5 = otherLogsBuilder.append("###### " + header);
                    Intrinsics.checkNotNullExpressionValue((Object)append5, "append(value)");
                    Intrinsics.checkNotNullExpressionValue((Object)append5.append('\n'), "append('\\n')");
                    final StringBuilder append6 = otherLogsBuilder.append("\n" + platformChangelog.getContent());
                    Intrinsics.checkNotNullExpressionValue((Object)append6, "append(value)");
                    Intrinsics.checkNotNullExpressionValue((Object)append6.append('\n'), "append('\\n')");
                }
            }
        }
        final String string = mainLogsBuilder.toString();
        Intrinsics.checkNotNullExpressionValue((Object)string, "mainLogsBuilder.toString()");
        final String string2 = otherLogsBuilder.toString();
        Intrinsics.checkNotNullExpressionValue((Object)string2, "otherLogsBuilder.toString()");
        return (Pair<String, String>)new Pair((Object)string, (Object)string2);
    }
    
    private static final UIContainer _init_$lambda-2(final ReadWriteProperty<Object, UIContainer> $headerContainer$delegate) {
        return (UIContainer)$headerContainer$delegate.getValue((Object)null, (KProperty)ChangelogComponent.$$delegatedProperties[0]);
    }
    
    private static final EssentialUIText _init_$lambda-4(final ReadWriteProperty<Object, EssentialUIText> $headerText$delegate) {
        return (EssentialUIText)$headerText$delegate.getValue((Object)null, (KProperty)ChangelogComponent.$$delegatedProperties[1]);
    }
    
    private static final MarkdownComponent _init_$lambda-10(final ReadWriteProperty<Object, MarkdownComponent> $mainChangelog$delegate) {
        return (MarkdownComponent)$mainChangelog$delegate.getValue((Object)null, (KProperty)ChangelogComponent.$$delegatedProperties[4]);
    }
    
    static {
        $$delegatedProperties = new KProperty[] { (KProperty)Reflection.property0((PropertyReference0)new PropertyReference0Impl((Class)ChangelogComponent.class, "headerContainer", "<v#0>", 0)), (KProperty)Reflection.property0((PropertyReference0)new PropertyReference0Impl((Class)ChangelogComponent.class, "headerText", "<v#1>", 0)), (KProperty)Reflection.property0((PropertyReference0)new PropertyReference0Impl((Class)ChangelogComponent.class, "dateText", "<v#2>", 0)), (KProperty)Reflection.property0((PropertyReference0)new PropertyReference0Impl((Class)ChangelogComponent.class, "summary", "<v#3>", 0)), (KProperty)Reflection.property0((PropertyReference0)new PropertyReference0Impl((Class)ChangelogComponent.class, "mainChangelog", "<v#4>", 0)) };
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                       \u00002
                                                       \u0002\u0018\u0002
                                                       \u0002\u0010\u0000
                                                       \u0000
                                                       \u0002\u0010	
                                                       \u0000
                                                       \u0002\u0010 
                                                       \u0002\u0018\u0002
                                                       \u0000
                                                       \u0002\u0010\u000e
                                                       \u0002\b\u0015
                                                       \u0002\u0010\u000b
                                                       \u0002\b\u0002
                                                       \u0002\u0010\b
                                                       \u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\u0010\u0007\u001a
                                                       \u0012\u0004\u0012\u00020\b\u0018\u00010\u0005\u0012\u0006\u0010	\u001a\u00020\b\u0012\u0006\u0010
                                                       \u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0002\u0010\fJ	\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J\u0011\u0010\u0018\u001a
                                                       \u0012\u0004\u0012\u00020\b\u0018\u00010\u0005H\u00c6\u0003J	\u0010\u0019\u001a\u00020\bH\u00c6\u0003J	\u0010\u001a\u001a\u00020\bH\u00c6\u0003J	\u0010\u001b\u001a\u00020\bH\u00c6\u0003JS\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0010\b\u0002\u0010\u0007\u001a
                                                       \u0012\u0004\u0012\u00020\b\u0018\u00010\u00052\b\b\u0002\u0010	\u001a\u00020\b2\b\b\u0002\u0010
                                                       \u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\bH\u00c6\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J	\u0010 \u001a\u00020!H\u00d6\u0001J	\u0010"\u001a\u00020\bH\u00d6\u0001R\u0019\u0010\u0007\u001a
                                                       \u0012\u0004\u0012\u00020\b\u0018\u00010\u0005¢\u0006\b
                                                       \u0000\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\b
                                                       \u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010
                                                       \u001a\u00020\b¢\u0006\b
                                                       \u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u000b\u001a\u00020\b¢\u0006\b
                                                       \u0000\u001a\u0004\b\u0012\u0010\u0011R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b
                                                       \u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010	\u001a\u00020\b¢\u0006\b
                                                       \u0000\u001a\u0004\b\u0015\u0010\u0011¨\u0006#""" }, d2 = { "Lgg/essential/gui/about/components/ChangelogComponent$Changelog;", "", "timestamp", "", "entries", "", "Lgg/essential/gui/about/components/ChangelogComponent$PlatformChangelog;", "branches", "", "version", "id", "summary", "(JLjava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBranches", "()Ljava/util/List;", "getEntries", "getId", "()Ljava/lang/String;", "getSummary", "getTimestamp", "()J", "getVersion", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "essential" })
    public static final class Changelog
    {
        @SerializedName("created_at")
        private final long timestamp;
        @SerializedName("changelog")
        @NotNull
        private final List<PlatformChangelog> entries;
        @Nullable
        private final List<String> branches;
        @NotNull
        private final String version;
        @NotNull
        private final String id;
        @NotNull
        private final String summary;
        
        public final long getTimestamp() {
            return this.timestamp;
        }
        
        @NotNull
        public final List<PlatformChangelog> getEntries() {
            return this.entries;
        }
        
        @NotNull
        public final String getVersion() {
            return this.version;
        }
        
        @NotNull
        public final String getSummary() {
            return this.summary;
        }
        
        @NotNull
        @Override
        public String toString() {
            return "Changelog(timestamp=" + this.timestamp + ", entries=" + this.entries + ", branches=" + this.branches + ", version=" + this.version + ", id=" + this.id + ", summary=" + this.summary;
        }
        
        @Override
        public int hashCode() {
            int result = Long.hashCode(this.timestamp);
            result = result * 31 + this.entries.hashCode();
            result = result * 31 + ((this.branches == null) ? 0 : this.branches.hashCode());
            result = result * 31 + this.version.hashCode();
            result = result * 31 + this.id.hashCode();
            result = result * 31 + this.summary.hashCode();
            return result;
        }
        
        @Override
        public boolean equals(@Nullable final Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Changelog)) {
                return false;
            }
            final Changelog changelog = (Changelog)other;
            return this.timestamp == changelog.timestamp && Intrinsics.areEqual((Object)this.entries, (Object)changelog.entries) && Intrinsics.areEqual((Object)this.branches, (Object)changelog.branches) && Intrinsics.areEqual((Object)this.version, (Object)changelog.version) && Intrinsics.areEqual((Object)this.id, (Object)changelog.id) && Intrinsics.areEqual((Object)this.summary, (Object)changelog.summary);
        }
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                       \u0000(
                                                       \u0002\u0018\u0002
                                                       \u0002\u0010\u0000
                                                       \u0000
                                                       \u0002\u0010\u000e
                                                       \u0000
                                                       \u0002\u0010 
                                                       \u0002\b	
                                                       \u0002\u0010\u000b
                                                       \u0002\b\u0002
                                                       \u0002\u0010\b
                                                       \u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0014B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a
                                                       \u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J	\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\u0011\u0010\f\u001a
                                                       \u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005H\u00c6\u0003J%\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a
                                                       \u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J	\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J	\u0010\u0013\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b
                                                       \u0000\u001a\u0004\b\u0007\u0010\bR\u0019\u0010\u0004\u001a
                                                       \u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005¢\u0006\b
                                                       \u0000\u001a\u0004\b	\u0010
                                                       ¨\u0006\u0015""" }, d2 = { "Lgg/essential/gui/about/components/ChangelogComponent$PlatformChangelog;", "", "content", "", "platforms", "", "(Ljava/lang/String;Ljava/util/List;)V", "getContent", "()Ljava/lang/String;", "getPlatforms", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "ValueAdapter", "essential" })
    public static final class PlatformChangelog
    {
        @SerializedName("value")
        @JsonAdapter(ValueAdapter.class)
        @NotNull
        private final String content;
        @Nullable
        private final List<String> platforms;
        
        @NotNull
        public final String getContent() {
            return this.content;
        }
        
        @Nullable
        public final List<String> getPlatforms() {
            return this.platforms;
        }
        
        @NotNull
        @Override
        public String toString() {
            return "PlatformChangelog(content=" + this.content + ", platforms=" + this.platforms;
        }
        
        @Override
        public int hashCode() {
            int result = this.content.hashCode();
            result = result * 31 + ((this.platforms == null) ? 0 : this.platforms.hashCode());
            return result;
        }
        
        @Override
        public boolean equals(@Nullable final Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PlatformChangelog)) {
                return false;
            }
            final PlatformChangelog platformChangelog = (PlatformChangelog)other;
            return Intrinsics.areEqual((Object)this.content, (Object)platformChangelog.content) && Intrinsics.areEqual((Object)this.platforms, (Object)platformChangelog.platforms);
        }
        
        @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                           \u0000$
                                                           \u0002\u0018\u0002
                                                           \u0002\u0018\u0002
                                                           \u0002\u0010\u000e
                                                           \u0002\b\u0003
                                                           \u0002\u0018\u0002
                                                           \u0000
                                                           \u0002\u0010\u0002
                                                           \u0000
                                                           \u0002\u0018\u0002
                                                           \u0002\b\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001a\u0010\u0007\u001a\u00020\b2\u0006\u0010	\u001a\u00020
                                                           2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\f""" }, d2 = { "Lgg/essential/gui/about/components/ChangelogComponent$PlatformChangelog$ValueAdapter;", "Lgg/essential/lib/gson/TypeAdapter;", "", "()V", "read", "reader", "Lgg/essential/lib/gson/stream/JsonReader;", "write", "", "out", "Lgg/essential/lib/gson/stream/JsonWriter;", "value", "essential" })
        private static final class ValueAdapter extends TypeAdapter<String>
        {
            @Override
            public void write(@NotNull final JsonWriter out, @Nullable final String value) {
                Intrinsics.checkNotNullParameter((Object)out, "out");
                out.value(value);
            }
            
            @NotNull
            @Override
            public String read(@NotNull final JsonReader reader) {
                Intrinsics.checkNotNullParameter((Object)reader, "reader");
                final String nextString = reader.nextString();
                Intrinsics.checkNotNullExpressionValue((Object)nextString, "reader.nextString()");
                return StringsKt.replace$default(new Regex("```.*?[\\s\\n\\r]").replace((CharSequence)nextString, ""), "`", "", false, 4, (Object)null);
            }
            
            @Override
            public /* bridge */ void write(final JsonWriter p0, final Object p1) {
                this.write(p0, (String)p1);
            }
            
            @Override
            public /* bridge */ Object read(final JsonReader p0) {
                return this.read(p0);
            }
        }
    }
}
