package gg.essential.gui.about.components;

import kotlin.reflect.*;
import org.jetbrains.annotations.*;
import kotlin.properties.*;
import gg.essential.util.*;
import kotlin.jvm.functions.*;
import gg.essential.elementa.components.*;
import java.util.function.*;
import gg.essential.elementa.state.*;
import gg.essential.gui.common.*;
import gg.essential.data.*;
import gg.essential.elementa.*;
import kotlin.*;
import gg.essential.*;
import gg.essential.gui.common.shadow.*;
import java.awt.*;
import gg.essential.elementa.constraints.*;
import gg.essential.gui.*;
import gg.essential.elementa.dsl.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000H
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u000e
                                                   \u0000
                                                   \u0002\u0010\u000b
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0005
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0007
                                                   \u0002\u0010\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0003
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0005
                                                   \u0002\u0010\b
                                                   \u0000\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0002\u0010\u0007J\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0006H\u0002J$\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u00062\b\b\u0002\u0010\u001f\u001a\u00020\u0006H\u0002J\b\u0010 \u001a\u00020\u0017H\u0016J\u0012\u0010!\u001a\u00020\u00172\b\b\u0002\u0010"\u001a\u00020#H\u0002R\u001b\u0010\b\u001a\u00020	8BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b\f\u0010\r\u001a\u0004\b
                                                   \u0010\u000bR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b\u0012\u0010\r\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0013\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002
                                                   \u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u000e\u0010\u0015\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002
                                                   \u0000¨\u0006$""" }, d2 = { "Lgg/essential/gui/about/components/ChangelogPage;", "Lgg/essential/gui/about/components/Page;", "name", "Lgg/essential/elementa/state/BasicState;", "", "platformSpecific", "", "(Lgg/essential/elementa/state/BasicState;Lgg/essential/elementa/state/BasicState;)V", "changelogContainer", "Lgg/essential/elementa/components/UIContainer;", "getChangelogContainer", "()Lgg/essential/elementa/components/UIContainer;", "changelogContainer$delegate", "Lkotlin/properties/ReadWriteProperty;", "divider", "Lgg/essential/gui/about/components/ColoredDivider;", "getDivider", "()Lgg/essential/gui/about/components/ColoredDivider;", "divider$delegate", "newestVersion", "nextChangelogVersion", "scrolling", "addChangelog", "", "log", "Lgg/essential/gui/about/components/ChangelogComponent$Changelog;", "isLatest", "addDivider", "changelog", "Lgg/essential/gui/about/components/ChangelogComponent;", "above", "updateLastSeen", "afterInitialization", "scrollContent", "amount", "", "essential" })
public final class ChangelogPage extends Page
{
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties;
    @NotNull
    private final BasicState<Boolean> platformSpecific;
    @NotNull
    private final String newestVersion;
    @Nullable
    private String nextChangelogVersion;
    private boolean scrolling;
    @NotNull
    private final ReadWriteProperty divider$delegate;
    @NotNull
    private final ReadWriteProperty changelogContainer$delegate;
    
    public ChangelogPage(@NotNull final BasicState<String> name, @NotNull final BasicState<Boolean> platformSpecific) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "name"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_2         /* platformSpecific */
        //     7: ldc             "platformSpecific"
        //     9: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    12: aload_0         /* this */
        //    13: aload_1         /* name */
        //    14: invokespecial   gg/essential/gui/about/components/Page.<init>:(Lgg/essential/elementa/state/BasicState;)V
        //    17: aload_0         /* this */
        //    18: aload_2         /* platformSpecific */
        //    19: putfield        gg/essential/gui/about/components/ChangelogPage.platformSpecific:Lgg/essential/elementa/state/BasicState;
        //    22: aload_0         /* this */
        //    23: getstatic       gg/essential/data/VersionData.INSTANCE:Lgg/essential/data/VersionData;
        //    26: invokevirtual   gg/essential/data/VersionData.getEssentialBranch:()Ljava/lang/String;
        //    29: putfield        gg/essential/gui/about/components/ChangelogPage.newestVersion:Ljava/lang/String;
        //    32: aload_0         /* this */
        //    33: aload_0         /* this */
        //    34: getfield        gg/essential/gui/about/components/ChangelogPage.newestVersion:Ljava/lang/String;
        //    37: putfield        gg/essential/gui/about/components/ChangelogPage.nextChangelogVersion:Ljava/lang/String;
        //    40: aload_0         /* this */
        //    41: new             Lgg/essential/gui/about/components/ColoredDivider;
        //    44: dup            
        //    45: ldc             "NEW"
        //    47: getstatic       gg/essential/gui/EssentialPalette.TEXT_WARNING:Ljava/awt/Color;
        //    50: iconst_0       
        //    51: aconst_null    
        //    52: getstatic       gg/essential/gui/EssentialPalette.TEXT_WARNING:Ljava/awt/Color;
        //    55: invokevirtual   java/awt/Color.darker:()Ljava/awt/Color;
        //    58: dup            
        //    59: ldc             "TEXT_WARNING.darker()"
        //    61: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //    64: ldc             10.0
        //    66: fconst_0       
        //    67: bipush          76
        //    69: invokespecial   gg/essential/gui/about/components/ColoredDivider.<init>:(Ljava/lang/String;Ljava/awt/Color;ZLjava/awt/Color;Ljava/awt/Color;FFI)V
        //    72: checkcast       Lgg/essential/elementa/UIComponent;
        //    75: aload_0         /* this */
        //    76: getstatic       gg/essential/gui/about/components/ChangelogPage.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //    79: iconst_0       
        //    80: aaload         
        //    81: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //    84: putfield        gg/essential/gui/about/components/ChangelogPage.divider$delegate:Lkotlin/properties/ReadWriteProperty;
        //    87: aload_0         /* this */
        //    88: new             Lgg/essential/elementa/components/UIContainer;
        //    91: dup            
        //    92: invokespecial   gg/essential/elementa/components/UIContainer.<init>:()V
        //    95: checkcast       Lgg/essential/elementa/UIComponent;
        //    98: astore_3        /* $this$constrain$iv */
        //    99: aload_3         /* $this$constrain$iv */
        //   100: astore          4
        //   102: aload           4
        //   104: astore          $this$constrain_u24lambda_u2d0$iv
        //   106: aload           $this$constrain_u24lambda_u2d0$iv
        //   108: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   111: astore          6
        //   113: astore          7
        //   115: aload           $this$changelogContainer_delegate_u24lambda_u2d0
        //   117: bipush          100
        //   119: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   122: checkcast       Ljava/lang/Number;
        //   125: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   128: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   131: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   134: aload           $this$changelogContainer_delegate_u24lambda_u2d0
        //   136: new             Lgg/essential/elementa/constraints/ChildBasedSizeConstraint;
        //   139: dup            
        //   140: fconst_0       
        //   141: iconst_1       
        //   142: aconst_null    
        //   143: invokespecial   gg/essential/elementa/constraints/ChildBasedSizeConstraint.<init>:(FILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   146: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   149: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   152: aload           7
        //   154: aload           4
        //   156: aload_0         /* this */
        //   157: checkcast       Lgg/essential/elementa/UIComponent;
        //   160: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   163: aload_0         /* this */
        //   164: getstatic       gg/essential/gui/about/components/ChangelogPage.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   167: iconst_1       
        //   168: aaload         
        //   169: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   172: putfield        gg/essential/gui/about/components/ChangelogPage.changelogContainer$delegate:Lkotlin/properties/ReadWriteProperty;
        //   175: return         
        //    Signature:
        //  (Lgg/essential/elementa/state/BasicState<Ljava/lang/String;>;Lgg/essential/elementa/state/BasicState<Ljava/lang/Boolean;>;)V
        //    MethodParameters:
        //  Name              Flags  
        //  ----------------  -----
        //  name              
        //  platformSpecific  
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private final ColoredDivider getDivider() {
        return (ColoredDivider)this.divider$delegate.getValue((Object)this, (KProperty)ChangelogPage.$$delegatedProperties[0]);
    }
    
    private final UIContainer getChangelogContainer() {
        return (UIContainer)this.changelogContainer$delegate.getValue((Object)this, (KProperty)ChangelogPage.$$delegatedProperties[1]);
    }
    
    @Override
    public void afterInitialization() {
        super.afterInitialization();
        this.scrollContent(10);
        final UIComponent $this$findParentOfType$iv = this;
        final ScrollComponent parentOfTypeOrNull = ExtensionsKt.findParentOfTypeOrNull($this$findParentOfType$iv, ScrollComponent.class);
        if (parentOfTypeOrNull == null) {
            throw new IllegalStateException("Failed to find parent of type " + ScrollComponent.class.getName() + " in " + $this$findParentOfType$iv);
        }
        final ScrollComponent scroller = parentOfTypeOrNull;
        scroller.addScrollAdjustEvent(false, (Function2<? super Float, ? super Float, Unit>)new ChangelogPage$afterInitialization.ChangelogPage$afterInitialization$1(this));
    }
    
    private final void scrollContent(final int amount) {
        if (this.scrolling) {
            return;
        }
        this.scrolling = true;
        final String nextChangelogVersion = this.nextChangelogVersion;
        if (nextChangelogVersion != null) {
            final String it = nextChangelogVersion;
            MenuData.INSTANCE.getCHANGELOGS().get(it).thenAcceptAsync(ChangelogPage::scrollContent$lambda-4$lambda-1, Window.Companion::enqueueRenderOperation).handleAsync((BiFunction<? super Void, Throwable, ?>)ChangelogPage::scrollContent$lambda-4$lambda-3, Window.Companion::enqueueRenderOperation);
        }
    }
    
    static /* synthetic */ void scrollContent$default$15e69288$1b1364(final ChangelogPage changelogPage) {
        changelogPage.scrollContent(1);
    }
    
    private final void addChangelog(final ChangelogComponent.Changelog log, final boolean isLatest) {
        final ChangelogComponent changelog = new ChangelogComponent(log, this.platformSpecific);
        if (((CharSequence)changelog.getData().getFirst()).length() > 0) {
            ComponentsKt.childOf((UIComponent)changelog, this.getChangelogContainer());
        }
        else {
            if (((CharSequence)changelog.getData().getSecond()).length() <= 0) {
                return;
            }
            StateExtensionsKt.bindParent((UIComponent)changelog, this.getChangelogContainer(), (State<Boolean>)StateExtensionsKt.not(this.platformSpecific), false, this.getChildren().size());
        }
        if (!isLatest && Intrinsics.areEqual((Object)changelog.getVersion(), (Object)VersionData.INSTANCE.getEssentialVersion())) {
            addDivider$default$d43750(this, changelog, false, false, 2);
        }
        else if (Intrinsics.areEqual((Object)changelog.getVersion(), (Object)VersionData.INSTANCE.getLastSeenChangelog()) && !Intrinsics.areEqual((Object)VersionData.INSTANCE.getLastSeenChangelog(), (Object)VersionData.INSTANCE.getEssentialVersion())) {
            addDivider$default$d43750(this, changelog, false, false, 6);
        }
    }
    
    private final void addDivider(final ChangelogComponent changelog, final boolean above, final boolean updateLastSeen) {
        if (this.getDivider().getHasParent()) {
            this.getDivider().getParent().removeChild(this.getDivider());
        }
        final UIComponent $this$constrain_u24lambda_u2d0$iv;
        final UIComponent $this$constrain$iv = $this$constrain_u24lambda_u2d0$iv = this.getDivider();
        final UIConstraints $this$addDivider_u24lambda_u2d5 = $this$constrain_u24lambda_u2d0$iv.getConstraints();
        $this$addDivider_u24lambda_u2d5.setY(ConstraintsKt.boundTo((YConstraint)new SiblingConstraint(12.0f, above), changelog));
        ComponentsKt.childOf($this$constrain_u24lambda_u2d0$iv, this);
        if (updateLastSeen) {
            VersionData.INSTANCE.updateLastSeenChangelog();
        }
    }
    
    static /* synthetic */ void addDivider$default$d43750(final ChangelogPage changelogPage, final ChangelogComponent changelog, boolean above, boolean updateLastSeen, final int n) {
        if ((n & 0x2) != 0x0) {
            above = true;
        }
        if ((n & 0x4) != 0x0) {
            updateLastSeen = true;
        }
        changelogPage.addDivider(changelog, above, updateLastSeen);
    }
    
    private static final void scrollContent$lambda-4$lambda-1(final ChangelogPage this$0, final Pair pair) {
        Intrinsics.checkNotNullParameter((Object)this$0, "this$0");
        final String version = (String)pair.component1();
        final ChangelogComponent.Changelog changelog = (ChangelogComponent.Changelog)pair.component2();
        this$0.addChangelog(changelog, Intrinsics.areEqual((Object)this$0.nextChangelogVersion, (Object)this$0.newestVersion));
        this$0.nextChangelogVersion = version;
    }
    
    private static final Unit scrollContent$lambda-4$lambda-3(final ChangelogPage this$0, final int $amount, final Void void1, final Throwable exception) {
        Intrinsics.checkNotNullParameter((Object)this$0, "this$0");
        this$0.scrolling = false;
        if (exception != null) {
            MenuData.INSTANCE.getCHANGELOGS().asMap().remove(this$0.nextChangelogVersion);
            Essential.logger.error("An error occurred fetching the changelog for version " + this$0.nextChangelogVersion, exception);
            this$0.nextChangelogVersion = null;
            final UIComponent $this$constrain_u24lambda_u2d0$iv;
            final UIComponent $this$constrain$iv = $this$constrain_u24lambda_u2d0$iv = new EssentialUIText("An error occurred fetching changelogs. Please check your internet connection and try again.", false, null, false, false, false, 62);
            final UIConstraints $this$scrollContent_u24lambda_u2d4_u24lambda_u2d3_u24lambda_u2d2 = $this$constrain_u24lambda_u2d0$iv.getConstraints();
            $this$scrollContent_u24lambda_u2d4_u24lambda_u2d3_u24lambda_u2d2.setY(new SiblingConstraint(15.0f, false, 2, null));
            $this$scrollContent_u24lambda_u2d4_u24lambda_u2d3_u24lambda_u2d2.setColor(UtilitiesKt.toConstraint(EssentialPalette.TEXT_WARNING));
            ComponentsKt.childOf($this$constrain_u24lambda_u2d0$iv, this$0);
        }
        if ($amount > 0) {
            this$0.scrollContent($amount - 1);
        }
        return Unit.INSTANCE;
    }
    
    static {
        $$delegatedProperties = new KProperty[] { (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)ChangelogPage.class, "divider", "getDivider()Lgg/essential/gui/about/components/ColoredDivider;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)ChangelogPage.class, "changelogContainer", "getChangelogContainer()Lgg/essential/elementa/components/UIContainer;", 0)) };
    }
}
