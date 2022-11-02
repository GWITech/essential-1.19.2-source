package gg.essential.elementa.markdown;

import gg.essential.elementa.*;
import gg.essential.elementa.state.*;
import kotlin.*;
import gg.essential.elementa.constraints.*;
import org.jetbrains.annotations.*;
import gg.essential.elementa.markdown.drawables.*;
import kotlin.collections.*;
import gg.essential.elementa.dsl.*;
import gg.essential.elementa.events.*;
import kotlin.ranges.*;
import gg.essential.elementa.markdown.selection.*;
import kotlin.jvm.functions.*;
import kotlin.jvm.internal.*;
import gg.essential.elementa.font.*;
import kotlin.jvm.*;
import java.util.*;
import gg.essential.universal.*;
import gg.essential.elementa.components.*;
import gg.essential.elementa.utils.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 G2\u00020\u0001:\u0003GHIB-\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nB5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\b\u00104\u001a\u00020!H\u0016J\u0014\u00105\u001a\u00020\u00002\f\u00106\u001a\b\u0012\u0004\u0012\u00020\u000303J\b\u00107\u001a\u00020\u001cH\u0002J\r\u00108\u001a\u000209H\u0000¢\u0006\u0002\b:J\u0010\u0010;\u001a\u00020!2\u0006\u0010<\u001a\u00020=H\u0016J\u0015\u0010>\u001a\u00020\f2\u0006\u0010?\u001a\u00020 H\u0000¢\u0006\u0002\b@J\u0006\u0010A\u001a\u00020!J%\u0010B\u001a\u00020!2\u001d\u0010C\u001a\u0019\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!0\u001f¢\u0006\u0002\b\"J\b\u0010D\u001a\u00020!H\u0002J\u000e\u0010E\u001a\u00020\u00002\u0006\u0010#\u001a\u00020$J\u000e\u0010F\u001a\u00020!2\u0006\u0010\u0004\u001a\u00020\u0005R\u000e\u0010\u000e\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0017\u001a\u00020\u0018¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u000e\u0010\u001b\u001a\u00020\u001cX\u0082.¢\u0006\u0002\n\u0000R+\u0010\u001d\u001a\u001f\u0012\u001b\u0012\u0019\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!0\u001f¢\u0006\u0002\b\"0\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020$X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010&\u001a\u00020\u00072\u0006\u0010%\u001a\u00020\u0007@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u000e\u0010)\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010*\u001a\b\u0012\u0004\u0012\u00020!0+X\u0082\u000e¢\u0006\u0002\n\u0000R6\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070,2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070,@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0010\u00100\u001a\u0004\u0018\u000101X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u00102\u001a\b\u0012\u0004\u0012\u00020\u000303X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006J" }, d2 = { "Lgg/essential/elementa/markdown/MarkdownComponent;", "Lgg/essential/elementa/UIComponent;", "text", "", "config", "Lgg/essential/elementa/markdown/MarkdownConfig;", "codeFontPointSize", "", "codeFontRenderer", "Lgg/essential/elementa/font/FontProvider;", "(Ljava/lang/String;Lgg/essential/elementa/markdown/MarkdownConfig;FLgg/essential/elementa/font/FontProvider;)V", "disableSelection", "", "(Ljava/lang/String;Lgg/essential/elementa/markdown/MarkdownConfig;FLgg/essential/elementa/font/FontProvider;Z)V", "baseX", "baseY", "canDrag", "getConfig", "()Lgg/essential/elementa/markdown/MarkdownConfig;", "configState", "Lgg/essential/elementa/state/BasicState;", "cursor", "Lgg/essential/elementa/markdown/selection/Cursor;", "drawables", "Lgg/essential/elementa/markdown/drawables/DrawableList;", "getDrawables", "()Lgg/essential/elementa/markdown/drawables/DrawableList;", "lastValues", "Lgg/essential/elementa/markdown/MarkdownComponent$ConstraintValues;", "linkClickListeners", "", "Lkotlin/Function2;", "Lgg/essential/elementa/markdown/MarkdownComponent$LinkClickEvent;", "", "Lkotlin/ExtensionFunctionType;", "maxHeight", "Lgg/essential/elementa/constraints/HeightConstraint;", "<set-?>", "maxTextLineWidth", "getMaxTextLineWidth", "()F", "needsInitialLayout", "removeListener", "Lkotlin/Function0;", "", "sectionOffsets", "getSectionOffsets", "()Ljava/util/Map;", "selection", "Lgg/essential/elementa/markdown/selection/Selection;", "textState", "Lgg/essential/elementa/state/State;", "animationFrame", "bindText", "state", "constraintValues", "createLayoutTree", "Lgg/essential/elementa/components/TreeListComponent;", "createLayoutTree$Elementa", "draw", "matrixStack", "Lgg/essential/universal/UMatrixStack;", "fireLinkClickEvent", "event", "fireLinkClickEvent$Elementa", "layout", "onLinkClicked", "block", "reparse", "setMaxHeight", "updateConfig", "Companion", "ConstraintValues", "LinkClickEvent", "Elementa" })
public final class MarkdownComponent extends UIComponent
{
    @NotNull
    public static final Companion Companion;
    private final float codeFontPointSize;
    @NotNull
    private final FontProvider codeFontRenderer;
    private final boolean disableSelection;
    @NotNull
    private final BasicState<MarkdownConfig> configState;
    @NotNull
    private State<String> textState;
    @NotNull
    private Function0<Unit> removeListener;
    @NotNull
    private final DrawableList drawables;
    @NotNull
    private Map<String, Float> sectionOffsets;
    private float baseX;
    private float baseY;
    private ConstraintValues lastValues;
    @NotNull
    private HeightConstraint maxHeight;
    @Nullable
    private Cursor<?> cursor;
    @Nullable
    private Selection selection;
    private boolean canDrag;
    private boolean needsInitialLayout;
    @NotNull
    private final List<Function2<MarkdownComponent, MarkdownComponent.LinkClickEvent, Unit>> linkClickListeners;
    private float maxTextLineWidth;
    public static final boolean DEBUG = false;
    
    public MarkdownComponent(@NotNull final String text, @NotNull final MarkdownConfig config, final float codeFontPointSize, @NotNull final FontProvider codeFontRenderer, final boolean disableSelection) {
        Intrinsics.checkNotNullParameter((Object)text, "text");
        Intrinsics.checkNotNullParameter((Object)config, "config");
        Intrinsics.checkNotNullParameter((Object)codeFontRenderer, "codeFontRenderer");
        super();
        this.codeFontPointSize = codeFontPointSize;
        this.codeFontRenderer = codeFontRenderer;
        this.disableSelection = disableSelection;
        this.configState = new BasicState<MarkdownConfig>(config);
        this.textState = new BasicState<String>(text);
        this.removeListener = this.textState.onSetValue((kotlin.jvm.functions.Function1<? super String, Unit>)new MarkdownComponent$removeListener.MarkdownComponent$removeListener$1(this));
        this.drawables = new DrawableList(this, CollectionsKt.emptyList());
        this.sectionOffsets = MapsKt.emptyMap();
        this.baseX = -1.0f;
        this.baseY = -1.0f;
        this.maxHeight = UtilitiesKt.pixels$default(Integer.MAX_VALUE, false, false, 3, null);
        this.needsInitialLayout = true;
        this.linkClickListeners = new ArrayList<Function2<MarkdownComponent, MarkdownComponent.LinkClickEvent, Unit>>();
        this.onMouseClick((Function2<? super UIComponent, ? super UIClickEvent, Unit>)new Function2<UIComponent, UIClickEvent, Unit>() {
            final /* synthetic */ MarkdownComponent this$0;
            
            MarkdownComponent$1() {
                this.this$0 = $receiver;
                super(2);
            }
            
            public final void invoke(@NotNull final UIComponent $this$onMouseClick, @NotNull final UIClickEvent it) {
                Intrinsics.checkNotNullParameter((Object)$this$onMouseClick, "$this$onMouseClick");
                Intrinsics.checkNotNullParameter((Object)it, "it");
                final float xShift = $this$onMouseClick.getLeft() - MarkdownComponent.access$getBaseX$p(this.this$0);
                final float yShift = $this$onMouseClick.getTop() - MarkdownComponent.access$getBaseY$p(this.this$0);
                MarkdownComponent.access$setCursor$p(this.this$0, this.this$0.getDrawables().cursorAt(it.getAbsoluteX() - xShift, it.getAbsoluteY() - yShift, false, it.getMouseButton()));
                final Selection access$getSelection$p = MarkdownComponent.access$getSelection$p(this.this$0);
                if (access$getSelection$p != null) {
                    access$getSelection$p.remove();
                }
                MarkdownComponent.access$setSelection$p(this.this$0, null);
                $this$onMouseClick.releaseWindowFocus();
            }
            
            public /* bridge */ Object invoke(final Object p1, final Object p2) {
                this.invoke((UIComponent)p1, (UIClickEvent)p2);
                return Unit.INSTANCE;
            }
        });
        if (!this.disableSelection) {
            this.onMouseClick((Function2<? super UIComponent, ? super UIClickEvent, Unit>)new Function2<UIComponent, UIClickEvent, Unit>() {
                final /* synthetic */ MarkdownComponent this$0;
                
                MarkdownComponent$2() {
                    this.this$0 = $receiver;
                    super(2);
                }
                
                public final void invoke(@NotNull final UIComponent $this$onMouseClick, @NotNull final UIClickEvent it) {
                    Intrinsics.checkNotNullParameter((Object)$this$onMouseClick, "$this$onMouseClick");
                    Intrinsics.checkNotNullParameter((Object)it, "it");
                    MarkdownComponent.access$setCanDrag$p(this.this$0, true);
                }
                
                public /* bridge */ Object invoke(final Object p1, final Object p2) {
                    this.invoke((UIComponent)p1, (UIClickEvent)p2);
                    return Unit.INSTANCE;
                }
            });
            this.onMouseRelease((Function1<? super UIComponent, Unit>)new Function1<UIComponent, Unit>() {
                final /* synthetic */ MarkdownComponent this$0;
                
                MarkdownComponent$3() {
                    this.this$0 = $receiver;
                    super(1);
                }
                
                public final void invoke(@NotNull final UIComponent $this$onMouseRelease) {
                    Intrinsics.checkNotNullParameter((Object)$this$onMouseRelease, "$this$onMouseRelease");
                    MarkdownComponent.access$setCanDrag$p(this.this$0, false);
                }
                
                public /* bridge */ Object invoke(final Object p1) {
                    this.invoke((UIComponent)p1);
                    return Unit.INSTANCE;
                }
            });
            this.onMouseDrag((Function4<? super UIComponent, ? super Float, ? super Float, ? super Integer, Unit>)new Function4<UIComponent, Float, Float, Integer, Unit>() {
                final /* synthetic */ MarkdownComponent this$0;
                
                MarkdownComponent$4() {
                    this.this$0 = $receiver;
                    super(4);
                }
                
                public final void invoke(@NotNull final UIComponent $this$onMouseDrag, final float mouseX, final float mouseY, final int mouseButton) {
                    Intrinsics.checkNotNullParameter((Object)$this$onMouseDrag, "$this$onMouseDrag");
                    if (mouseButton != 0 || !MarkdownComponent.access$getCanDrag$p(this.this$0)) {
                        return;
                    }
                    final float x = MarkdownComponent.access$getBaseX$p(this.this$0) + RangesKt.coerceIn(mouseX, 0.0f, $this$onMouseDrag.getWidth());
                    final float y = MarkdownComponent.access$getBaseY$p(this.this$0) + RangesKt.coerceIn(mouseY, 0.0f, $this$onMouseDrag.getHeight());
                    final Cursor otherEnd = this.this$0.getDrawables().cursorAt(x, y, true, mouseButton);
                    if (Intrinsics.areEqual((Object)MarkdownComponent.access$getCursor$p(this.this$0), (Object)otherEnd)) {
                        return;
                    }
                    final Selection access$getSelection$p = MarkdownComponent.access$getSelection$p(this.this$0);
                    if (access$getSelection$p != null) {
                        access$getSelection$p.remove();
                    }
                    final MarkdownComponent this$0 = this.this$0;
                    final Selection$Companion companion = Selection.Companion;
                    final Cursor access$getCursor$p = MarkdownComponent.access$getCursor$p(this.this$0);
                    Intrinsics.checkNotNull((Object)access$getCursor$p);
                    MarkdownComponent.access$setSelection$p(this$0, companion.fromCursors(access$getCursor$p, otherEnd));
                    $this$onMouseDrag.grabWindowFocus();
                }
                
                public /* bridge */ Object invoke(final Object p1, final Object p2, final Object p3, final Object p4) {
                    this.invoke((UIComponent)p1, ((Number)p2).floatValue(), ((Number)p3).floatValue(), ((Number)p4).intValue());
                    return Unit.INSTANCE;
                }
            });
            this.onKeyType((Function3<? super UIComponent, ? super Character, ? super Integer, Unit>)new Function3<UIComponent, Character, Integer, Unit>() {
                final /* synthetic */ MarkdownComponent this$0;
                
                MarkdownComponent$5() {
                    this.this$0 = $receiver;
                    super(3);
                }
                
                public final void invoke(@NotNull final UIComponent $this$onKeyType, final char $noName_0, final int keyCode) {
                    Intrinsics.checkNotNullParameter((Object)$this$onKeyType, "$this$onKeyType");
                    if (MarkdownComponent.access$getSelection$p(this.this$0) != null && keyCode == UKeyboard.KEY_C && UKeyboard.isCtrlKeyDown()) {
                        UDesktop.setClipboardString(this.this$0.getDrawables().selectedText(UKeyboard.isShiftKeyDown()));
                    }
                }
                
                public /* bridge */ Object invoke(final Object p1, final Object p2, final Object p3) {
                    this.invoke((UIComponent)p1, (char)p2, ((Number)p3).intValue());
                    return Unit.INSTANCE;
                }
            });
        }
        this.configState.onSetValue((kotlin.jvm.functions.Function1<? super Object, Unit>)new Function1<MarkdownConfig, Unit>() {
            final /* synthetic */ MarkdownComponent this$0;
            
            MarkdownComponent$6() {
                this.this$0 = $receiver;
                super(1);
            }
            
            public final void invoke(@NotNull final MarkdownConfig it) {
                Intrinsics.checkNotNullParameter((Object)it, "it");
                MarkdownComponent.this.reparse();
                this.this$0.layout();
            }
            
            public /* bridge */ Object invoke(final Object p1) {
                this.invoke((MarkdownConfig)p1);
                return Unit.INSTANCE;
            }
        });
    }
    
    public MarkdownComponent(final String text, MarkdownConfig config, float codeFontPointSize, FontProvider codeFontRenderer, boolean disableSelection, final int n, final DefaultConstructorMarker defaultConstructorMarker) {
        if ((n & 0x2) != 0x0) {
            config = new MarkdownConfig(null, null, null, null, null, null, null, null, 255, null);
        }
        if ((n & 0x4) != 0x0) {
            codeFontPointSize = 10.0f;
        }
        if ((n & 0x8) != 0x0) {
            codeFontRenderer = ElementaFonts.getJETBRAINS_MONO();
        }
        if ((n & 0x10) != 0x0) {
            disableSelection = false;
        }
        this(text, config, codeFontPointSize, codeFontRenderer, disableSelection);
    }
    
    @JvmOverloads
    public MarkdownComponent(@NotNull final String text, @NotNull final MarkdownConfig config, final float codeFontPointSize, @NotNull final FontProvider codeFontRenderer) {
        Intrinsics.checkNotNullParameter((Object)text, "text");
        Intrinsics.checkNotNullParameter((Object)config, "config");
        Intrinsics.checkNotNullParameter((Object)codeFontRenderer, "codeFontRenderer");
        this(text, config, codeFontPointSize, codeFontRenderer, false);
    }
    
    public MarkdownComponent(final String text, MarkdownConfig config, float codeFontPointSize, FontProvider codeFontRenderer, final int n, final DefaultConstructorMarker defaultConstructorMarker) {
        if ((n & 0x2) != 0x0) {
            config = new MarkdownConfig(null, null, null, null, null, null, null, null, 255, null);
        }
        if ((n & 0x4) != 0x0) {
            codeFontPointSize = 10.0f;
        }
        if ((n & 0x8) != 0x0) {
            codeFontRenderer = ElementaFonts.getJETBRAINS_MONO();
        }
        this(text, config, codeFontPointSize, codeFontRenderer);
    }
    
    @NotNull
    public final MarkdownConfig getConfig() {
        return this.configState.get();
    }
    
    @NotNull
    public final DrawableList getDrawables() {
        return this.drawables;
    }
    
    @NotNull
    public final Map<String, Float> getSectionOffsets() {
        return this.sectionOffsets;
    }
    
    public final float getMaxTextLineWidth() {
        return this.maxTextLineWidth;
    }
    
    @NotNull
    public final MarkdownComponent bindText(@NotNull final State<String> state) {
        Intrinsics.checkNotNullParameter((Object)state, "state");
        final MarkdownComponent $this$bindText_u24lambda_u2d0 = this;
        final int n = 0;
        $this$bindText_u24lambda_u2d0.removeListener.invoke();
        $this$bindText_u24lambda_u2d0.textState = state;
        $this$bindText_u24lambda_u2d0.reparse();
        $this$bindText_u24lambda_u2d0.layout();
        $this$bindText_u24lambda_u2d0.removeListener = $this$bindText_u24lambda_u2d0.textState.onSetValue((kotlin.jvm.functions.Function1<? super String, Unit>)new MarkdownComponent$bindText$1.MarkdownComponent$bindText$1$1($this$bindText_u24lambda_u2d0));
        return this;
    }
    
    @NotNull
    public final MarkdownComponent setMaxHeight(@NotNull final HeightConstraint maxHeight) {
        Intrinsics.checkNotNullParameter((Object)maxHeight, "maxHeight");
        final MarkdownComponent $this$setMaxHeight_u24lambda_u2d1 = this;
        final int n = 0;
        $this$setMaxHeight_u24lambda_u2d1.maxHeight = maxHeight;
        return this;
    }
    
    private final void reparse() {
        this.drawables.setDrawables(new MarkdownRenderer(this.textState.get(), this, this.getConfig()).render());
    }
    
    public final void layout() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: aload_0         /* this */
        //     2: invokevirtual   gg/essential/elementa/markdown/MarkdownComponent.getLeft:()F
        //     5: putfield        gg/essential/elementa/markdown/MarkdownComponent.baseX:F
        //     8: aload_0         /* this */
        //     9: aload_0         /* this */
        //    10: invokevirtual   gg/essential/elementa/markdown/MarkdownComponent.getTop:()F
        //    13: putfield        gg/essential/elementa/markdown/MarkdownComponent.baseY:F
        //    16: fconst_0       
        //    17: fstore_1        /* currY */
        //    18: aload_0         /* this */
        //    19: getfield        gg/essential/elementa/markdown/MarkdownComponent.baseY:F
        //    22: fstore_1        /* currY */
        //    23: aload_0         /* this */
        //    24: invokevirtual   gg/essential/elementa/markdown/MarkdownComponent.getWidth:()F
        //    27: fstore_2        /* width */
        //    28: aload_0         /* this */
        //    29: getfield        gg/essential/elementa/markdown/MarkdownComponent.drawables:Lgg/essential/elementa/markdown/drawables/DrawableList;
        //    32: checkcast       Ljava/lang/Iterable;
        //    35: astore_3        /* $this$forEach$iv */
        //    36: iconst_0       
        //    37: istore          $i$f$forEach
        //    39: aload_3         /* $this$forEach$iv */
        //    40: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //    45: astore          5
        //    47: aload           5
        //    49: invokeinterface java/util/Iterator.hasNext:()Z
        //    54: ifeq            97
        //    57: aload           5
        //    59: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    64: astore          element$iv
        //    66: aload           element$iv
        //    68: checkcast       Lgg/essential/elementa/markdown/drawables/Drawable;
        //    71: astore          it
        //    73: iconst_0       
        //    74: istore          $i$a$-forEach-MarkdownComponent$layout$1
        //    76: fload_1         /* currY */
        //    77: aload           it
        //    79: aload_0         /* this */
        //    80: getfield        gg/essential/elementa/markdown/MarkdownComponent.baseX:F
        //    83: fload_1         /* currY */
        //    84: fload_2         /* width */
        //    85: invokevirtual   gg/essential/elementa/markdown/drawables/Drawable.layout:(FFF)Lgg/essential/elementa/markdown/drawables/Drawable$Layout;
        //    88: invokevirtual   gg/essential/elementa/markdown/drawables/Drawable$Layout.getHeight:()F
        //    91: fadd           
        //    92: fstore_1        /* currY */
        //    93: nop            
        //    94: goto            47
        //    97: nop            
        //    98: aload_0         /* this */
        //    99: aload_0         /* this */
        //   100: getfield        gg/essential/elementa/markdown/MarkdownComponent.drawables:Lgg/essential/elementa/markdown/drawables/DrawableList;
        //   103: checkcast       Ljava/lang/Iterable;
        //   106: astore_3       
        //   107: astore          17
        //   109: iconst_0       
        //   110: istore          $i$f$filterIsInstance
        //   112: aload_3         /* $this$filterIsInstance$iv */
        //   113: astore          5
        //   115: new             Ljava/util/ArrayList;
        //   118: dup            
        //   119: invokespecial   java/util/ArrayList.<init>:()V
        //   122: checkcast       Ljava/util/Collection;
        //   125: astore          destination$iv$iv
        //   127: iconst_0       
        //   128: istore          $i$f$filterIsInstanceTo
        //   130: aload           $this$filterIsInstanceTo$iv$iv
        //   132: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   137: astore          8
        //   139: aload           8
        //   141: invokeinterface java/util/Iterator.hasNext:()Z
        //   146: ifeq            179
        //   149: aload           8
        //   151: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   156: astore          element$iv$iv
        //   158: aload           element$iv$iv
        //   160: instanceof      Lgg/essential/elementa/markdown/drawables/HeaderDrawable;
        //   163: ifeq            139
        //   166: aload           destination$iv$iv
        //   168: aload           element$iv$iv
        //   170: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //   175: pop            
        //   176: goto            139
        //   179: aload           destination$iv$iv
        //   181: checkcast       Ljava/util/List;
        //   184: nop            
        //   185: aload           17
        //   187: swap           
        //   188: checkcast       Ljava/lang/Iterable;
        //   191: astore_3       
        //   192: astore          17
        //   194: iconst_0       
        //   195: istore          $i$f$associate
        //   197: aload_3         /* $this$associate$iv */
        //   198: bipush          10
        //   200: invokestatic    kotlin/collections/CollectionsKt.collectionSizeOrDefault:(Ljava/lang/Iterable;I)I
        //   203: invokestatic    kotlin/collections/MapsKt.mapCapacity:(I)I
        //   206: bipush          16
        //   208: invokestatic    kotlin/ranges/RangesKt.coerceAtLeast:(II)I
        //   211: istore          capacity$iv
        //   213: aload_3         /* $this$associate$iv */
        //   214: astore          6
        //   216: new             Ljava/util/LinkedHashMap;
        //   219: dup            
        //   220: iload           capacity$iv
        //   222: invokespecial   java/util/LinkedHashMap.<init>:(I)V
        //   225: checkcast       Ljava/util/Map;
        //   228: astore          destination$iv$iv
        //   230: iconst_0       
        //   231: istore          $i$f$associateTo
        //   233: aload           $this$associateTo$iv$iv
        //   235: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   240: astore          9
        //   242: aload           9
        //   244: invokeinterface java/util/Iterator.hasNext:()Z
        //   249: ifeq            314
        //   252: aload           9
        //   254: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   259: astore          element$iv$iv
        //   261: aload           destination$iv$iv
        //   263: astore          11
        //   265: aload           element$iv$iv
        //   267: checkcast       Lgg/essential/elementa/markdown/drawables/HeaderDrawable;
        //   270: astore          it
        //   272: iconst_0       
        //   273: istore          $i$a$-associate-MarkdownComponent$layout$2
        //   275: aload           it
        //   277: invokevirtual   gg/essential/elementa/markdown/drawables/HeaderDrawable.getId$Elementa:()Ljava/lang/String;
        //   280: aload           it
        //   282: invokevirtual   gg/essential/elementa/markdown/drawables/HeaderDrawable.getY:()F
        //   285: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //   288: invokestatic    kotlin/TuplesKt.to:(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
        //   291: astore          null
        //   293: aload           11
        //   295: aload           12
        //   297: invokevirtual   kotlin/Pair.getFirst:()Ljava/lang/Object;
        //   300: aload           12
        //   302: invokevirtual   kotlin/Pair.getSecond:()Ljava/lang/Object;
        //   305: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   310: pop            
        //   311: goto            242
        //   314: aload           destination$iv$iv
        //   316: nop            
        //   317: aload           17
        //   319: swap           
        //   320: putfield        gg/essential/elementa/markdown/MarkdownComponent.sectionOffsets:Ljava/util/Map;
        //   323: aload_0         /* this */
        //   324: fload_1         /* currY */
        //   325: aload_0         /* this */
        //   326: getfield        gg/essential/elementa/markdown/MarkdownComponent.baseY:F
        //   329: fsub           
        //   330: aload_0         /* this */
        //   331: getfield        gg/essential/elementa/markdown/MarkdownComponent.maxHeight:Lgg/essential/elementa/constraints/HeightConstraint;
        //   334: aload_0         /* this */
        //   335: checkcast       Lgg/essential/elementa/UIComponent;
        //   338: invokeinterface gg/essential/elementa/constraints/HeightConstraint.getHeight:(Lgg/essential/elementa/UIComponent;)F
        //   343: invokestatic    kotlin/ranges/RangesKt.coerceAtMost:(FF)F
        //   346: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //   349: checkcast       Ljava/lang/Number;
        //   352: iconst_0       
        //   353: iconst_0       
        //   354: iconst_3       
        //   355: aconst_null    
        //   356: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels$default:(Ljava/lang/Number;ZZILjava/lang/Object;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   359: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   362: invokevirtual   gg/essential/elementa/markdown/MarkdownComponent.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)Lgg/essential/elementa/UIComponent;
        //   365: pop            
        //   366: aload_0         /* this */
        //   367: aload_0         /* this */
        //   368: getfield        gg/essential/elementa/markdown/MarkdownComponent.drawables:Lgg/essential/elementa/markdown/drawables/DrawableList;
        //   371: checkcast       Ljava/lang/Iterable;
        //   374: astore          4
        //   376: astore          17
        //   378: aload           4
        //   380: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   385: astore          5
        //   387: aload           5
        //   389: invokeinterface java/util/Iterator.hasNext:()Z
        //   394: ifne            401
        //   397: aconst_null    
        //   398: goto            998
        //   401: aload           5
        //   403: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   408: checkcast       Lgg/essential/elementa/markdown/drawables/Drawable;
        //   411: astore          drawable
        //   413: iconst_0       
        //   414: istore          $i$a$-maxOfOrNull-MarkdownComponent$layout$3
        //   416: aload           drawable
        //   418: astore          8
        //   420: aload           8
        //   422: instanceof      Lgg/essential/elementa/markdown/drawables/ParagraphDrawable;
        //   425: ifeq            439
        //   428: aload           drawable
        //   430: checkcast       Lgg/essential/elementa/markdown/drawables/ParagraphDrawable;
        //   433: invokevirtual   gg/essential/elementa/markdown/drawables/ParagraphDrawable.getMaxTextLineWidth:()F
        //   436: goto            683
        //   439: aload           8
        //   441: instanceof      Lgg/essential/elementa/markdown/drawables/HeaderDrawable;
        //   444: ifeq            644
        //   447: aload           drawable
        //   449: invokevirtual   gg/essential/elementa/markdown/drawables/Drawable.getChildren:()Ljava/util/List;
        //   452: checkcast       Ljava/lang/Iterable;
        //   455: astore          $this$filterIsInstance$iv
        //   457: iconst_0       
        //   458: istore          $i$f$filterIsInstance
        //   460: aload           $this$filterIsInstance$iv
        //   462: astore          11
        //   464: new             Ljava/util/ArrayList;
        //   467: dup            
        //   468: invokespecial   java/util/ArrayList.<init>:()V
        //   471: checkcast       Ljava/util/Collection;
        //   474: astore          destination$iv$iv
        //   476: iconst_0       
        //   477: istore          $i$f$filterIsInstanceTo
        //   479: aload           $this$filterIsInstanceTo$iv$iv
        //   481: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   486: astore          14
        //   488: aload           14
        //   490: invokeinterface java/util/Iterator.hasNext:()Z
        //   495: ifeq            528
        //   498: aload           14
        //   500: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   505: astore          element$iv$iv
        //   507: aload           element$iv$iv
        //   509: instanceof      Lgg/essential/elementa/markdown/drawables/ParagraphDrawable;
        //   512: ifeq            488
        //   515: aload           destination$iv$iv
        //   517: aload           element$iv$iv
        //   519: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //   524: pop            
        //   525: goto            488
        //   528: aload           destination$iv$iv
        //   530: checkcast       Ljava/util/List;
        //   533: nop            
        //   534: checkcast       Ljava/lang/Iterable;
        //   537: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   542: astore          10
        //   544: aload           10
        //   546: invokeinterface java/util/Iterator.hasNext:()Z
        //   551: ifne            558
        //   554: aconst_null    
        //   555: goto            629
        //   558: aload           10
        //   560: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   565: checkcast       Lgg/essential/elementa/markdown/drawables/ParagraphDrawable;
        //   568: astore          it
        //   570: iconst_0       
        //   571: istore          $i$a$-maxOfOrNull-MarkdownComponent$layout$3$1
        //   573: aload           it
        //   575: invokevirtual   gg/essential/elementa/markdown/drawables/ParagraphDrawable.getMaxTextLineWidth:()F
        //   578: fstore          null
        //   580: aload           10
        //   582: invokeinterface java/util/Iterator.hasNext:()Z
        //   587: ifeq            624
        //   590: aload           10
        //   592: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   597: checkcast       Lgg/essential/elementa/markdown/drawables/ParagraphDrawable;
        //   600: astore          it
        //   602: iconst_0       
        //   603: istore          $i$a$-maxOfOrNull-MarkdownComponent$layout$3$1
        //   605: aload           it
        //   607: invokevirtual   gg/essential/elementa/markdown/drawables/ParagraphDrawable.getMaxTextLineWidth:()F
        //   610: fstore          null
        //   612: fload           11
        //   614: fload           12
        //   616: invokestatic    java/lang/Math.max:(FF)F
        //   619: fstore          11
        //   621: goto            580
        //   624: fload           11
        //   626: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //   629: dup            
        //   630: ifnonnull       638
        //   633: pop            
        //   634: fconst_0       
        //   635: goto            683
        //   638: invokevirtual   java/lang/Float.floatValue:()F
        //   641: goto            683
        //   644: aload           8
        //   646: instanceof      Lgg/essential/elementa/markdown/drawables/ListDrawable;
        //   649: ifeq            663
        //   652: aload           drawable
        //   654: checkcast       Lgg/essential/elementa/markdown/drawables/ListDrawable;
        //   657: invokevirtual   gg/essential/elementa/markdown/drawables/ListDrawable.getMaxTextLineWidth:()F
        //   660: goto            683
        //   663: aload           8
        //   665: instanceof      Lgg/essential/elementa/markdown/drawables/BlockquoteDrawable;
        //   668: ifeq            682
        //   671: aload           drawable
        //   673: checkcast       Lgg/essential/elementa/markdown/drawables/BlockquoteDrawable;
        //   676: invokevirtual   gg/essential/elementa/markdown/drawables/BlockquoteDrawable.getMaxTextLineWidth:()F
        //   679: goto            683
        //   682: fconst_0       
        //   683: nop            
        //   684: fstore          null
        //   686: aload           5
        //   688: invokeinterface java/util/Iterator.hasNext:()Z
        //   693: ifeq            993
        //   696: aload           5
        //   698: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   703: checkcast       Lgg/essential/elementa/markdown/drawables/Drawable;
        //   706: astore          drawable
        //   708: iconst_0       
        //   709: istore          $i$a$-maxOfOrNull-MarkdownComponent$layout$3
        //   711: aload           drawable
        //   713: astore          9
        //   715: aload           9
        //   717: instanceof      Lgg/essential/elementa/markdown/drawables/ParagraphDrawable;
        //   720: ifeq            734
        //   723: aload           drawable
        //   725: checkcast       Lgg/essential/elementa/markdown/drawables/ParagraphDrawable;
        //   728: invokevirtual   gg/essential/elementa/markdown/drawables/ParagraphDrawable.getMaxTextLineWidth:()F
        //   731: goto            978
        //   734: aload           9
        //   736: instanceof      Lgg/essential/elementa/markdown/drawables/HeaderDrawable;
        //   739: ifeq            939
        //   742: aload           drawable
        //   744: invokevirtual   gg/essential/elementa/markdown/drawables/Drawable.getChildren:()Ljava/util/List;
        //   747: checkcast       Ljava/lang/Iterable;
        //   750: astore          $this$filterIsInstance$iv
        //   752: iconst_0       
        //   753: istore          $i$f$filterIsInstance
        //   755: aload           $this$filterIsInstance$iv
        //   757: astore          12
        //   759: new             Ljava/util/ArrayList;
        //   762: dup            
        //   763: invokespecial   java/util/ArrayList.<init>:()V
        //   766: checkcast       Ljava/util/Collection;
        //   769: astore          destination$iv$iv
        //   771: iconst_0       
        //   772: istore          $i$f$filterIsInstanceTo
        //   774: aload           $this$filterIsInstanceTo$iv$iv
        //   776: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   781: astore          15
        //   783: aload           15
        //   785: invokeinterface java/util/Iterator.hasNext:()Z
        //   790: ifeq            823
        //   793: aload           15
        //   795: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   800: astore          element$iv$iv
        //   802: aload           element$iv$iv
        //   804: instanceof      Lgg/essential/elementa/markdown/drawables/ParagraphDrawable;
        //   807: ifeq            783
        //   810: aload           destination$iv$iv
        //   812: aload           element$iv$iv
        //   814: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //   819: pop            
        //   820: goto            783
        //   823: aload           destination$iv$iv
        //   825: checkcast       Ljava/util/List;
        //   828: nop            
        //   829: checkcast       Ljava/lang/Iterable;
        //   832: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   837: astore          11
        //   839: aload           11
        //   841: invokeinterface java/util/Iterator.hasNext:()Z
        //   846: ifne            853
        //   849: aconst_null    
        //   850: goto            924
        //   853: aload           11
        //   855: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   860: checkcast       Lgg/essential/elementa/markdown/drawables/ParagraphDrawable;
        //   863: astore          it
        //   865: iconst_0       
        //   866: istore          $i$a$-maxOfOrNull-MarkdownComponent$layout$3$1
        //   868: aload           it
        //   870: invokevirtual   gg/essential/elementa/markdown/drawables/ParagraphDrawable.getMaxTextLineWidth:()F
        //   873: fstore          null
        //   875: aload           11
        //   877: invokeinterface java/util/Iterator.hasNext:()Z
        //   882: ifeq            919
        //   885: aload           11
        //   887: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   892: checkcast       Lgg/essential/elementa/markdown/drawables/ParagraphDrawable;
        //   895: astore          it
        //   897: iconst_0       
        //   898: istore          $i$a$-maxOfOrNull-MarkdownComponent$layout$3$1
        //   900: aload           it
        //   902: invokevirtual   gg/essential/elementa/markdown/drawables/ParagraphDrawable.getMaxTextLineWidth:()F
        //   905: fstore          null
        //   907: fload           12
        //   909: fload           13
        //   911: invokestatic    java/lang/Math.max:(FF)F
        //   914: fstore          12
        //   916: goto            875
        //   919: fload           12
        //   921: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //   924: dup            
        //   925: ifnonnull       933
        //   928: pop            
        //   929: fconst_0       
        //   930: goto            978
        //   933: invokevirtual   java/lang/Float.floatValue:()F
        //   936: goto            978
        //   939: aload           9
        //   941: instanceof      Lgg/essential/elementa/markdown/drawables/ListDrawable;
        //   944: ifeq            958
        //   947: aload           drawable
        //   949: checkcast       Lgg/essential/elementa/markdown/drawables/ListDrawable;
        //   952: invokevirtual   gg/essential/elementa/markdown/drawables/ListDrawable.getMaxTextLineWidth:()F
        //   955: goto            978
        //   958: aload           9
        //   960: instanceof      Lgg/essential/elementa/markdown/drawables/BlockquoteDrawable;
        //   963: ifeq            977
        //   966: aload           drawable
        //   968: checkcast       Lgg/essential/elementa/markdown/drawables/BlockquoteDrawable;
        //   971: invokevirtual   gg/essential/elementa/markdown/drawables/BlockquoteDrawable.getMaxTextLineWidth:()F
        //   974: goto            978
        //   977: fconst_0       
        //   978: nop            
        //   979: fstore          null
        //   981: fload           6
        //   983: fload           7
        //   985: invokestatic    java/lang/Math.max:(FF)F
        //   988: fstore          6
        //   990: goto            686
        //   993: fload           6
        //   995: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //   998: aload           17
        //  1000: swap           
        //  1001: astore_3       
        //  1002: aload_3        
        //  1003: ifnonnull       1010
        //  1006: fconst_0       
        //  1007: goto            1014
        //  1010: aload_3        
        //  1011: invokevirtual   java/lang/Float.floatValue:()F
        //  1014: putfield        gg/essential/elementa/markdown/MarkdownComponent.maxTextLineWidth:F
        //  1017: return         
        //    StackMapTable: 00 24 FF 00 2F 00 06 07 00 02 02 02 07 01 44 01 07 01 4A 00 00 31 FF 00 29 00 12 07 00 02 02 02 07 01 44 01 07 01 44 07 01 5D 01 07 01 4A 00 00 00 00 00 00 00 00 07 00 02 00 00 27 FF 00 3E 00 12 07 00 02 02 02 07 01 44 01 01 07 01 44 07 01 78 01 07 01 4A 00 00 00 00 00 00 00 07 00 02 00 00 FB 00 47 FF 00 56 00 12 07 00 02 02 02 07 01 44 07 01 44 07 01 4A 07 01 44 07 01 78 01 07 01 4A 00 00 00 00 00 00 00 07 00 02 00 00 FF 00 25 00 12 07 00 02 02 02 07 01 44 07 01 44 07 01 4A 07 01 53 01 07 01 53 07 01 4A 00 00 00 00 00 00 00 07 00 02 00 00 FF 00 30 00 12 07 00 02 02 02 07 01 44 07 01 44 07 01 4A 07 01 53 01 07 01 53 07 01 44 01 07 01 44 07 01 5D 01 07 01 4A 00 00 07 00 02 00 00 27 FF 00 1D 00 12 07 00 02 02 02 07 01 44 07 01 44 07 01 4A 07 01 53 01 07 01 53 07 01 44 07 01 4A 07 01 44 07 01 5D 01 07 01 4A 00 00 07 00 02 00 00 FF 00 15 00 12 07 00 02 02 02 07 01 44 07 01 44 07 01 4A 07 01 53 01 07 01 53 07 01 44 07 01 4A 02 00 01 07 01 4A 00 00 07 00 02 00 00 2B FF 00 04 00 12 07 00 02 02 02 07 01 44 07 01 44 07 01 4A 07 01 53 01 07 01 53 07 01 44 07 01 4A 00 00 01 07 01 4A 00 00 07 00 02 00 01 07 01 81 48 07 01 81 FF 00 05 00 12 07 00 02 02 02 07 01 44 07 01 44 07 01 4A 07 01 53 01 07 01 53 07 01 4A 00 00 00 00 00 00 00 07 00 02 00 00 12 12 FF 00 00 00 12 07 00 02 02 02 07 01 44 07 01 44 07 01 4A 07 01 53 01 07 01 53 07 01 B8 00 00 00 00 00 00 00 07 00 02 00 01 02 FF 00 02 00 12 07 00 02 02 02 07 01 44 07 01 44 07 01 4A 02 00 00 07 01 B8 00 00 00 00 00 00 00 07 00 02 00 00 FF 00 2F 00 12 07 00 02 02 02 07 01 44 07 01 44 07 01 4A 02 07 01 53 01 07 01 53 00 00 00 00 00 00 00 07 00 02 00 00 FF 00 30 00 12 07 00 02 02 02 07 01 44 07 01 44 07 01 4A 02 07 01 53 01 07 01 53 07 01 44 01 07 01 44 07 01 5D 01 07 01 4A 00 07 00 02 00 00 27 FF 00 1D 00 12 07 00 02 02 02 07 01 44 07 01 44 07 01 4A 02 07 01 53 01 07 01 53 07 01 44 07 01 4A 07 01 44 07 01 5D 01 07 01 4A 00 07 00 02 00 00 FF 00 15 00 12 07 00 02 02 02 07 01 44 07 01 44 07 01 4A 02 07 01 53 01 07 01 53 07 01 44 07 01 4A 02 00 01 07 01 4A 00 07 00 02 00 00 2B FF 00 04 00 12 07 00 02 02 02 07 01 44 07 01 44 07 01 4A 02 07 01 53 01 07 01 53 07 01 44 07 01 4A 00 00 01 07 01 4A 00 07 00 02 00 01 07 01 81 48 07 01 81 FF 00 05 00 12 07 00 02 02 02 07 01 44 07 01 44 07 01 4A 02 07 01 53 01 07 01 53 00 00 00 00 00 00 00 07 00 02 00 00 12 12 40 02 FF 00 0E 00 12 07 00 02 02 02 07 01 44 07 01 44 07 01 4A 02 00 00 07 01 B8 00 00 00 00 00 00 00 07 00 02 00 00 FF 00 04 00 12 07 00 02 02 02 07 01 44 07 01 44 07 01 4A 00 00 00 07 01 B8 00 00 00 00 00 00 00 07 00 02 00 01 07 01 81 FF 00 0B 00 12 07 00 02 02 02 07 01 81 07 01 44 07 01 4A 00 00 00 07 01 B8 00 00 00 00 00 00 00 07 00 02 00 01 07 00 02 FF 00 03 00 12 07 00 02 02 02 07 01 81 07 01 44 07 01 4A 00 00 00 07 01 B8 00 00 00 00 00 00 00 07 00 02 00 02 07 00 02 02
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @Override
    public void animationFrame() {
        super.animationFrame();
        if (this.needsInitialLayout) {
            this.needsInitialLayout = false;
            this.reparse();
            this.layout();
            this.lastValues = this.constraintValues();
        }
        final ConstraintValues constraintValues;
        final ConstraintValues currentValues = constraintValues = this.constraintValues();
        ConstraintValues lastValues;
        if ((lastValues = this.lastValues) == null) {
            Intrinsics.throwUninitializedPropertyAccessException("lastValues");
            lastValues = null;
        }
        if (!Intrinsics.areEqual((Object)constraintValues, (Object)lastValues)) {
            this.layout();
        }
        this.lastValues = currentValues;
    }
    
    public final void updateConfig(@NotNull final MarkdownConfig config) {
        Intrinsics.checkNotNullParameter((Object)config, "config");
        this.configState.set(config);
    }
    
    @NotNull
    public final TreeListComponent createLayoutTree$Elementa() {
        final List nodes = new ArrayList();
        final Iterable $this$forEach$iv = this.drawables;
        final int $i$f$forEach = 0;
        for (final Object element$iv : $this$forEach$iv) {
            final Drawable it = (Drawable)element$iv;
            final int n = 0;
            nodes.add(new MarkdownNode(it));
        }
        return new TreeListComponent(nodes);
    }
    
    @Override
    public void draw(@NotNull final UMatrixStack matrixStack) {
        Intrinsics.checkNotNullParameter((Object)matrixStack, "matrixStack");
        if (this.needsInitialLayout) {
            this.animationFrame();
        }
        this.beforeDraw(matrixStack);
        final DrawState drawState = new DrawState(this.getLeft() - this.baseX, this.getTop() - this.baseY);
        final Window parentWindow = Window.Companion.of(this);
        final Iterable $this$forEach$iv = this.drawables;
        final int $i$f$forEach = 0;
        for (final Object element$iv : $this$forEach$iv) {
            final Drawable it = (Drawable)element$iv;
            final int n = 0;
            if (!parentWindow.isAreaVisible(it.getLayout().getLeft() + (double)drawState.getXShift(), it.getLayout().getTop() + (double)drawState.getYShift(), it.getLayout().getRight() + (double)drawState.getXShift(), it.getLayout().getBottom() + (double)drawState.getYShift())) {
                continue;
            }
            if (OptionsKt.getElementaDebug()) {
                UIComponent.Companion.drawDebugOutline$Elementa(matrixStack, it.getLayout().getLeft() + (double)drawState.getXShift(), it.getLayout().getTop() + (double)drawState.getYShift(), it.getLayout().getRight() + (double)drawState.getXShift(), it.getLayout().getBottom() + (double)drawState.getYShift(), this);
            }
            it.draw(matrixStack, drawState);
        }
        if (!this.disableSelection) {
            final Selection selection = this.selection;
            Unit instance;
            if (selection == null) {
                instance = null;
            }
            else {
                selection.draw(matrixStack, drawState);
                instance = Unit.INSTANCE;
            }
            if (instance == null) {
                final Cursor<?> cursor = this.cursor;
                if (cursor != null) {
                    cursor.draw(matrixStack, drawState);
                    final Unit instance2 = Unit.INSTANCE;
                }
            }
        }
        super.draw(matrixStack);
    }
    
    private final ConstraintValues constraintValues() {
        return new ConstraintValues(this.getWidth(), this.getTextScale());
    }
    
    public final void onLinkClicked(@NotNull final Function2<? super MarkdownComponent, ? super MarkdownComponent.LinkClickEvent, Unit> block) {
        Intrinsics.checkNotNullParameter((Object)block, "block");
        this.linkClickListeners.add((Function2<MarkdownComponent, MarkdownComponent.LinkClickEvent, Unit>)block);
    }
    
    public final boolean fireLinkClickEvent$Elementa(@NotNull final MarkdownComponent.LinkClickEvent event) {
        Intrinsics.checkNotNullParameter((Object)event, "event");
        for (final Function2 listener : this.linkClickListeners) {
            listener.invoke((Object)this, (Object)event);
            if (event.getPropagationStoppedImmediately()) {
                return false;
            }
        }
        return !event.getPropagationStopped();
    }
    
    @JvmOverloads
    public MarkdownComponent(@NotNull final String text, @NotNull final MarkdownConfig config, final float codeFontPointSize) {
        Intrinsics.checkNotNullParameter((Object)text, "text");
        Intrinsics.checkNotNullParameter((Object)config, "config");
        this(text, config, codeFontPointSize, null, 8, null);
    }
    
    @JvmOverloads
    public MarkdownComponent(@NotNull final String text, @NotNull final MarkdownConfig config) {
        Intrinsics.checkNotNullParameter((Object)text, "text");
        Intrinsics.checkNotNullParameter((Object)config, "config");
        this(text, config, 0.0f, null, 12, null);
    }
    
    @JvmOverloads
    public MarkdownComponent(@NotNull final String text) {
        Intrinsics.checkNotNullParameter((Object)text, "text");
        this(text, null, 0.0f, null, 14, null);
    }
    
    public static final /* synthetic */ void access$reparse(final MarkdownComponent $this) {
        $this.reparse();
    }
    
    public static final /* synthetic */ float access$getBaseX$p(final MarkdownComponent $this) {
        return $this.baseX;
    }
    
    public static final /* synthetic */ float access$getBaseY$p(final MarkdownComponent $this) {
        return $this.baseY;
    }
    
    public static final /* synthetic */ void access$setCursor$p(final MarkdownComponent $this, final Cursor <set-?>) {
        $this.cursor = (Cursor<?>)<set-?>;
    }
    
    public static final /* synthetic */ Selection access$getSelection$p(final MarkdownComponent $this) {
        return $this.selection;
    }
    
    public static final /* synthetic */ void access$setSelection$p(final MarkdownComponent $this, final Selection <set-?>) {
        $this.selection = <set-?>;
    }
    
    public static final /* synthetic */ void access$setCanDrag$p(final MarkdownComponent $this, final boolean <set-?>) {
        $this.canDrag = <set-?>;
    }
    
    public static final /* synthetic */ boolean access$getCanDrag$p(final MarkdownComponent $this) {
        return $this.canDrag;
    }
    
    public static final /* synthetic */ Cursor access$getCursor$p(final MarkdownComponent $this) {
        return $this.cursor;
    }
    
    static {
        Companion = new Companion(null);
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013" }, d2 = { "Lgg/essential/elementa/markdown/MarkdownComponent$ConstraintValues;", "", "width", "", "textScale", "(FF)V", "getTextScale", "()F", "getWidth", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Elementa" })
    public static final class ConstraintValues
    {
        private final float width;
        private final float textScale;
        
        public ConstraintValues(final float width, final float textScale) {
            super();
            this.width = width;
            this.textScale = textScale;
        }
        
        public final float getWidth() {
            return this.width;
        }
        
        public final float getTextScale() {
            return this.textScale;
        }
        
        public final float component1() {
            return this.width;
        }
        
        public final float component2() {
            return this.textScale;
        }
        
        @NotNull
        public final ConstraintValues copy(final float width, final float textScale) {
            return new ConstraintValues(width, textScale);
        }
        
        public static /* synthetic */ ConstraintValues copy$default(final ConstraintValues constraintValues, float width, float textScale, final int n, final Object o) {
            if ((n & 0x1) != 0x0) {
                width = constraintValues.width;
            }
            if ((n & 0x2) != 0x0) {
                textScale = constraintValues.textScale;
            }
            return constraintValues.copy(width, textScale);
        }
        
        @NotNull
        @Override
        public String toString() {
            return "ConstraintValues(width=" + this.width + ", textScale=" + this.textScale + ')';
        }
        
        @Override
        public int hashCode() {
            int result = Float.hashCode(this.width);
            result = result * 31 + Float.hashCode(this.textScale);
            return result;
        }
        
        @Override
        public boolean equals(@Nullable final Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ConstraintValues)) {
                return false;
            }
            final ConstraintValues constraintValues = (ConstraintValues)other;
            return Intrinsics.areEqual((Object)this.width, (Object)constraintValues.width) && Intrinsics.areEqual((Object)this.textScale, (Object)constraintValues.textScale);
        }
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005" }, d2 = { "Lgg/essential/elementa/markdown/MarkdownComponent$Companion;", "", "()V", "DEBUG", "", "Elementa" })
    public static final class Companion
    {
        private Companion() {
            super();
        }
        
        public Companion(final DefaultConstructorMarker $constructor_marker) {
            this();
        }
    }
}
