package gg.essential.gui.screenshot.editor;

import org.jetbrains.annotations.*;
import gg.essential.gui.screenshot.editor.change.*;
import gg.essential.gui.screenshot.image.*;
import gg.essential.elementa.state.*;
import gg.essential.gui.common.*;
import kotlin.jvm.functions.*;
import kotlin.*;
import kotlin.jvm.internal.*;
import java.util.*;
import gg.essential.universal.*;
import java.awt.*;
import gg.essential.util.lwjgl3.api.nanovg.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000d
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0004
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u000b
                                                   \u0002\b\u0003
                                                   \u0002\u0010\u0007
                                                   \u0002\b\u0005
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0003
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0004
                                                   \u0002\u0010\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0004
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0003\b\u0096\u0004\u0018\u00002\u00020\u0001B\u0013\b\u0016\u0012
                                                   \u0010\u0002\u001a\u00060\u0000R\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0015\u0012\u000e\u0010\u0005\u001a
                                                   \u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006¢\u0006\u0002\u0010\bJ\u0012\u0010 \u001a\u00060\u0000R\u00020\u00032\u0006\u0010!\u001a\u00020\u000bJ
                                                   \u0010"\u001a\u00060\u0000R\u00020\u0003J \u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u00152\u0006\u0010(\u001a\u00020\u0015H\u0014J(\u0010)\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010*\u001a\u00020+2\u0006\u0010'\u001a\u00020\u00152\u0006\u0010(\u001a\u00020\u0015H\u0014J\u0006\u0010,\u001a\u00020$J
                                                   \u0010-\u001a\u00060\u0000R\u00020\u0003R\u0014\u0010	\u001a\b\u0012\u0004\u0012\u00020\u000b0
                                                   X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0
                                                   X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u0019\u0010\u0005\u001a
                                                   \u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006¢\u0006\b
                                                   \u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\b
                                                   \u0000\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0015X\u0086\u000e¢\u0006\u000e
                                                   \u0000\u001a\u0004\b\u0016\u0010\u0017"\u0004\b\u0018\u0010\u0019R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\b
                                                   \u0000\u001a\u0004\b\u001d\u0010\u0013R\u0016\u0010\u001e\u001a
                                                   \u0012\u0006\u0012\u0004\u0018\u00010\u00070\u001fX\u0082\u0004¢\u0006\u0002
                                                   \u0000¨\u0006.""" }, d2 = { "Lgg/essential/gui/screenshot/editor/ScreenshotCanvas$VectorEditingOverlay;", "Lgg/essential/gui/common/UINanoVG;", "veo", "Lgg/essential/gui/screenshot/editor/ScreenshotCanvas;", "(Lgg/essential/gui/screenshot/editor/ScreenshotCanvas;Lgg/essential/gui/screenshot/editor/ScreenshotCanvas$VectorEditingOverlay;)V", "image", "Lgg/essential/elementa/state/State;", "Lgg/essential/gui/screenshot/image/PixelBufferTexture;", "(Lgg/essential/gui/screenshot/editor/ScreenshotCanvas;Lgg/essential/elementa/state/State;)V", "future", "Ljava/util/Stack;", "Lgg/essential/gui/screenshot/editor/change/Change;", "history", "getImage", "()Lgg/essential/elementa/state/State;", "redoEnabled", "Lgg/essential/elementa/state/BasicState;", "", "getRedoEnabled", "()Lgg/essential/elementa/state/BasicState;", "scale", "", "getScale", "()F", "setScale", "(F)V", "screenshotImage", "Lgg/essential/gui/screenshot/image/ScreenshotImage;", "undoEnabled", "getUndoEnabled", "weakImage", "Lgg/essential/gui/common/WeakState;", "pushChange", "change", "redo", "render", "", "matrixStack", "Lgg/essential/universal/UMatrixStack;", "width", "height", "renderVG", "vg", "Lgg/essential/util/lwjgl3/api/nanovg/NanoVG;", "reset", "undo", "essential" })
public class VectorEditingOverlay extends UINanoVG
{
    @NotNull
    private final State<PixelBufferTexture> image;
    @NotNull
    private final Stack<Change> history;
    @NotNull
    private final Stack<Change> future;
    @NotNull
    private final ScreenshotImage screenshotImage;
    private float scale;
    @NotNull
    private final BasicState<Boolean> undoEnabled;
    @NotNull
    private final BasicState<Boolean> redoEnabled;
    @NotNull
    private final WeakState<PixelBufferTexture> weakImage;
    final /* synthetic */ ScreenshotCanvas this$0;
    
    public VectorEditingOverlay(@NotNull final ScreenshotCanvas this$0, final State<PixelBufferTexture> image) {
        Intrinsics.checkNotNullParameter((Object)image, "image");
        this.this$0 = this$0;
        super();
        this.image = image;
        this.history = new Stack<Change>();
        this.future = new Stack<Change>();
        this.screenshotImage = new ScreenshotImage(this.image);
        this.scale = 1.0f;
        this.undoEnabled = new BasicState<Boolean>(false);
        this.redoEnabled = new BasicState<Boolean>(false);
        (this.weakImage = StateExtensionsKt.weak(this.image)).onSetValue((kotlin.jvm.functions.Function1<? super Object, Unit>)new Function1<PixelBufferTexture, Unit>() {
            final /* synthetic */ VectorEditingOverlay this$0;
            
            ScreenshotCanvas$VectorEditingOverlay$2() {
                this.this$0 = $receiver;
                super(1);
            }
            
            public final void invoke$29222cb6() {
                this.this$0.markDirty();
            }
            
            public /* bridge */ Object invoke(final Object p1) {
                this.invoke$29222cb6();
                return Unit.INSTANCE;
            }
        });
    }
    
    public final void setScale(final float <set-?>) {
        this.scale = <set-?>;
    }
    
    @NotNull
    public final BasicState<Boolean> getUndoEnabled() {
        return this.undoEnabled;
    }
    
    @NotNull
    public final BasicState<Boolean> getRedoEnabled() {
        return this.redoEnabled;
    }
    
    public final void reset() {
        this.undoEnabled.set(false);
        this.redoEnabled.set(false);
        this.history.clear();
        this.future.clear();
        this.markDirty();
    }
    
    public VectorEditingOverlay(@NotNull final ScreenshotCanvas this$0, final VectorEditingOverlay veo) {
        Intrinsics.checkNotNullParameter((Object)veo, "veo");
        this(this$0, veo.image);
        this.history.addAll((Collection<?>)veo.history);
        this.future.addAll((Collection<?>)veo.future);
        this.undoEnabled.set(veo.undoEnabled.get());
        this.redoEnabled.set(veo.redoEnabled.get());
    }
    
    @Override
    protected void render(@NotNull final UMatrixStack matrixStack, final float width, final float height) {
        Intrinsics.checkNotNullParameter((Object)matrixStack, "matrixStack");
        final ScreenshotImage screenshotImage = this.screenshotImage;
        final Color white = Color.WHITE;
        Intrinsics.checkNotNullExpressionValue((Object)white, "WHITE");
        screenshotImage.renderImage(matrixStack, white, width, height);
        super.render(matrixStack, width, height);
    }
    
    @Override
    protected void renderVG(@NotNull final UMatrixStack matrixStack, @NotNull final NanoVG vg, final float width, final float height) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "matrixStack"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_2         /* vg */
        //     7: ldc             "vg"
        //     9: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    12: aload_0         /* this */
        //    13: getfield        gg/essential/gui/screenshot/editor/ScreenshotCanvas$VectorEditingOverlay.history:Ljava/util/Stack;
        //    16: checkcast       Ljava/lang/Iterable;
        //    19: astore          $this$filterIsInstance$iv
        //    21: aload           $this$filterIsInstance$iv
        //    23: astore          6
        //    25: new             Ljava/util/ArrayList;
        //    28: dup            
        //    29: invokespecial   java/util/ArrayList.<init>:()V
        //    32: checkcast       Ljava/util/Collection;
        //    35: astore          destination$iv$iv
        //    37: aload           $this$filterIsInstanceTo$iv$iv
        //    39: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //    44: astore          9
        //    46: aload           9
        //    48: invokeinterface java/util/Iterator.hasNext:()Z
        //    53: ifeq            86
        //    56: aload           9
        //    58: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    63: astore          element$iv$iv
        //    65: aload           element$iv$iv
        //    67: instanceof      Lgg/essential/gui/screenshot/editor/change/VectorStroke;
        //    70: ifeq            46
        //    73: aload           destination$iv$iv
        //    75: aload           element$iv$iv
        //    77: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //    82: pop            
        //    83: goto            46
        //    86: aload           destination$iv$iv
        //    88: checkcast       Ljava/util/List;
        //    91: checkcast       Ljava/lang/Iterable;
        //    94: astore          $this$forEach$iv
        //    96: aload           $this$forEach$iv
        //    98: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   103: astore          6
        //   105: aload           6
        //   107: invokeinterface java/util/Iterator.hasNext:()Z
        //   112: ifeq            147
        //   115: aload           6
        //   117: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   122: astore          element$iv
        //   124: aload           element$iv
        //   126: checkcast       Lgg/essential/gui/screenshot/editor/change/VectorStroke;
        //   129: astore          vs
        //   131: aload           vs
        //   133: aload_2         /* vg */
        //   134: fload_3         /* width */
        //   135: fload           height
        //   137: aload_0         /* this */
        //   138: getfield        gg/essential/gui/screenshot/editor/ScreenshotCanvas$VectorEditingOverlay.scale:F
        //   141: invokevirtual   gg/essential/gui/screenshot/editor/change/VectorStroke.render:(Lgg/essential/util/lwjgl3/api/nanovg/NanoVG;FFF)V
        //   144: goto            105
        //   147: return         
        //    MethodParameters:
        //  Name         Flags  
        //  -----------  -----
        //  matrixStack  
        //  vg           
        //  width        
        //  height       
        //    StackMapTable: 00 04 FF 00 2E 00 0A 07 00 02 00 07 00 C3 02 02 00 00 07 00 9C 00 07 00 C5 00 00 F9 00 27 FF 00 12 00 07 07 00 02 00 07 00 C3 02 02 00 07 00 C5 00 00 FF 00 29 00 00 00 00
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @NotNull
    public final VectorEditingOverlay pushChange(@NotNull final Change change) {
        Intrinsics.checkNotNullParameter((Object)change, "change");
        final VectorEditingOverlay $this$pushChange_u24lambda_u2d1 = this;
        $this$pushChange_u24lambda_u2d1.future.clear();
        $this$pushChange_u24lambda_u2d1.history.push(change);
        $this$pushChange_u24lambda_u2d1.markDirty();
        $this$pushChange_u24lambda_u2d1.undoEnabled.set(true);
        $this$pushChange_u24lambda_u2d1.redoEnabled.set(false);
        return this;
    }
    
    @NotNull
    public final VectorEditingOverlay undo() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: astore_1       
        //     2: aload_0         /* this */
        //     3: getfield        gg/essential/gui/screenshot/editor/ScreenshotCanvas$VectorEditingOverlay.this$0:Lgg/essential/gui/screenshot/editor/ScreenshotCanvas;
        //     6: astore_2       
        //     7: aload_1        
        //     8: checkcast       Lgg/essential/gui/screenshot/editor/ScreenshotCanvas$VectorEditingOverlay;
        //    11: astore_3       
        //    12: aload_3        
        //    13: getfield        gg/essential/gui/screenshot/editor/ScreenshotCanvas$VectorEditingOverlay.history:Ljava/util/Stack;
        //    16: invokevirtual   java/util/Stack.empty:()Z
        //    19: ifne            96
        //    22: aload_3        
        //    23: getfield        gg/essential/gui/screenshot/editor/ScreenshotCanvas$VectorEditingOverlay.redoEnabled:Lgg/essential/elementa/state/BasicState;
        //    26: iconst_1       
        //    27: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //    30: invokevirtual   gg/essential/elementa/state/BasicState.set:(Ljava/lang/Object;)V
        //    33: aload_3        
        //    34: getfield        gg/essential/gui/screenshot/editor/ScreenshotCanvas$VectorEditingOverlay.future:Ljava/util/Stack;
        //    37: aload_3        
        //    38: getfield        gg/essential/gui/screenshot/editor/ScreenshotCanvas$VectorEditingOverlay.history:Ljava/util/Stack;
        //    41: invokevirtual   java/util/Stack.pop:()Ljava/lang/Object;
        //    44: astore          4
        //    46: aload           4
        //    48: checkcast       Lgg/essential/gui/screenshot/editor/change/Change;
        //    51: astore          5
        //    53: astore          6
        //    55: aload           it
        //    57: aload_2        
        //    58: invokeinterface gg/essential/gui/screenshot/editor/change/Change.undo:(Lgg/essential/gui/screenshot/editor/ScreenshotCanvas;)V
        //    63: aload           6
        //    65: aload           4
        //    67: invokevirtual   java/util/Stack.push:(Ljava/lang/Object;)Ljava/lang/Object;
        //    70: pop            
        //    71: aload_3        
        //    72: getfield        gg/essential/gui/screenshot/editor/ScreenshotCanvas$VectorEditingOverlay.undoEnabled:Lgg/essential/elementa/state/BasicState;
        //    75: aload_3        
        //    76: getfield        gg/essential/gui/screenshot/editor/ScreenshotCanvas$VectorEditingOverlay.history:Ljava/util/Stack;
        //    79: invokevirtual   java/util/Stack.isEmpty:()Z
        //    82: ifne            89
        //    85: iconst_1       
        //    86: goto            90
        //    89: iconst_0       
        //    90: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //    93: invokevirtual   gg/essential/elementa/state/BasicState.set:(Ljava/lang/Object;)V
        //    96: aload_1        
        //    97: checkcast       Lgg/essential/gui/screenshot/editor/ScreenshotCanvas$VectorEditingOverlay;
        //   100: areturn        
        //    StackMapTable: 00 03 FF 00 59 00 02 00 07 00 02 00 01 07 00 6B FF 00 00 00 02 00 07 00 02 00 02 07 00 6B 01 05
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @NotNull
    public final VectorEditingOverlay redo() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: astore_1       
        //     2: aload_0         /* this */
        //     3: getfield        gg/essential/gui/screenshot/editor/ScreenshotCanvas$VectorEditingOverlay.this$0:Lgg/essential/gui/screenshot/editor/ScreenshotCanvas;
        //     6: astore_2       
        //     7: aload_1        
        //     8: checkcast       Lgg/essential/gui/screenshot/editor/ScreenshotCanvas$VectorEditingOverlay;
        //    11: astore_3       
        //    12: aload_3        
        //    13: getfield        gg/essential/gui/screenshot/editor/ScreenshotCanvas$VectorEditingOverlay.future:Ljava/util/Stack;
        //    16: invokevirtual   java/util/Stack.empty:()Z
        //    19: ifne            96
        //    22: aload_3        
        //    23: getfield        gg/essential/gui/screenshot/editor/ScreenshotCanvas$VectorEditingOverlay.history:Ljava/util/Stack;
        //    26: aload_3        
        //    27: getfield        gg/essential/gui/screenshot/editor/ScreenshotCanvas$VectorEditingOverlay.future:Ljava/util/Stack;
        //    30: invokevirtual   java/util/Stack.pop:()Ljava/lang/Object;
        //    33: astore          4
        //    35: aload           4
        //    37: checkcast       Lgg/essential/gui/screenshot/editor/change/Change;
        //    40: astore          5
        //    42: astore          6
        //    44: aload           it
        //    46: aload_2        
        //    47: invokeinterface gg/essential/gui/screenshot/editor/change/Change.redo:(Lgg/essential/gui/screenshot/editor/ScreenshotCanvas;)V
        //    52: aload           6
        //    54: aload           4
        //    56: invokevirtual   java/util/Stack.push:(Ljava/lang/Object;)Ljava/lang/Object;
        //    59: pop            
        //    60: aload_3        
        //    61: getfield        gg/essential/gui/screenshot/editor/ScreenshotCanvas$VectorEditingOverlay.undoEnabled:Lgg/essential/elementa/state/BasicState;
        //    64: iconst_1       
        //    65: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //    68: invokevirtual   gg/essential/elementa/state/BasicState.set:(Ljava/lang/Object;)V
        //    71: aload_3        
        //    72: getfield        gg/essential/gui/screenshot/editor/ScreenshotCanvas$VectorEditingOverlay.redoEnabled:Lgg/essential/elementa/state/BasicState;
        //    75: aload_3        
        //    76: getfield        gg/essential/gui/screenshot/editor/ScreenshotCanvas$VectorEditingOverlay.future:Ljava/util/Stack;
        //    79: invokevirtual   java/util/Stack.isEmpty:()Z
        //    82: ifne            89
        //    85: iconst_1       
        //    86: goto            90
        //    89: iconst_0       
        //    90: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //    93: invokevirtual   gg/essential/elementa/state/BasicState.set:(Ljava/lang/Object;)V
        //    96: aload_1        
        //    97: checkcast       Lgg/essential/gui/screenshot/editor/ScreenshotCanvas$VectorEditingOverlay;
        //   100: areturn        
        //    StackMapTable: 00 03 FF 00 59 00 02 00 07 00 02 00 01 07 00 6B FF 00 00 00 02 00 07 00 02 00 02 07 00 6B 01 05
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
}
