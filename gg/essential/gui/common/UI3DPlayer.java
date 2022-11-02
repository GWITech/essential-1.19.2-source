package gg.essential.gui.common;

import gg.essential.elementa.*;
import gg.essential.elementa.state.*;
import com.mojang.authlib.*;
import net.minecraft.entity.player.*;
import org.jetbrains.annotations.*;
import gg.essential.cosmetics.source.*;
import kotlin.jvm.*;
import gg.essential.mod.cosmetics.*;
import gg.essential.elementa.dsl.*;
import gg.essential.elementa.constraints.*;
import gg.essential.elementa.events.*;
import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;
import gg.essential.mixins.impl.client.entity.*;
import kotlin.ranges.*;
import gg.essential.util.*;
import org.lwjgl.opengl.*;
import com.mojang.blaze3d.systems.*;
import kotlin.*;
import gg.essential.model.*;
import gg.essential.*;
import net.minecraft.client.*;
import gg.essential.universal.*;
import net.minecraft.client.render.entity.*;
import net.minecraft.util.math.*;
import gg.essential.model.backend.minecraft.*;
import gg.essential.model.backend.*;
import net.minecraft.client.render.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000v
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u000b
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u000f
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0010\u0007
                                                   \u0002\b\u0005
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u000e
                                                   \u0002\u0010\b
                                                   \u0002\b\u0004
                                                   \u0002\u0010\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0006
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0012
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0007\b\u0016\u0018\u0000 \2\u00020\u0001:\u0004\]^_B=\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\b\u001a
                                                   \u0012\u0006\u0012\u0004\u0018\u00010	0\u0003¢\u0006\u0002\u0010
                                                   J\b\u00109\u001a\u00020:H\u0016J\u000e\u0010;\u001a\u00020:2\u0006\u0010<\u001a\u00020=J \u0010>\u001a\u00020:2\u0006\u0010?\u001a\u00020 2\u0006\u0010@\u001a\u00020 2\u0006\u0010A\u001a\u000205H\u0002J\u0010\u0010B\u001a\u00020:2\u0006\u0010C\u001a\u00020DH\u0002J\u0018\u0010E\u001a\u00020:2\u0006\u0010C\u001a\u00020F2\u0006\u0010G\u001a\u000205H\u0002J\u0010\u0010H\u001a\u00020:2\u0006\u0010I\u001a\u00020FH\u0016J\u0018\u0010J\u001a\u00020:2\u0006\u0010C\u001a\u00020F2\u0006\u0010G\u001a\u000205H\u0002J\u0010\u0010K\u001a\u00020:2\u0006\u0010C\u001a\u00020FH\u0002J\u0018\u0010L\u001a\u00020:2\u0006\u0010C\u001a\u00020F2\u0006\u0010M\u001a\u00020&H\u0002J\u0006\u0010N\u001a\u00020:J\u000e\u0010O\u001a\u00020:2\u0006\u0010P\u001a\u00020 J\u000e\u0010Q\u001a\u00020:2\u0006\u0010P\u001a\u00020 J\u0016\u0010R\u001a\u00020:2\u0006\u0010S\u001a\u00020 2\u0006\u0010T\u001a\u00020 J\u0006\u0010U\u001a\u00020:J\u0006\u0010V\u001a\u00020:J\f\u0010W\u001a\u00020F*\u00020&H\u0002J(\u0010X\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020 0Y*\u00020F2\u0006\u0010Z\u001a\u00020 2\u0006\u0010[\u001a\u00020 H\u0002R(\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\f@FX\u0086\u000e¢\u0006\u000e
                                                   \u0000\u001a\u0004\b\u000e\u0010\u000f"\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b
                                                   \u0000\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002
                                                   \u0000R\u001a\u0010\u0015\u001a\u00020\u0004X\u0084\u000e¢\u0006\u000e
                                                   \u0000\u001a\u0004\b\u0016\u0010\u0017"\u0004\b\u0018\u0010\u0019R\u000e\u0010\u001a\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002
                                                   \u0000R\u0018\u0010\u001b\u001a\f\u0012\b\u0012\u00060\u001dR\u00020\u00000\u001cX\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b
                                                   \u0000\u001a\u0004\b\u001e\u0010\u0013R\u001a\u0010\u001f\u001a\u00020 X\u0086\u000e¢\u0006\u000e
                                                   \u0000\u001a\u0004\b!\u0010""\u0004\b#\u0010$R\u001c\u0010%\u001a\u0004\u0018\u00010&X\u0086\u000e¢\u0006\u000e
                                                   \u0000\u001a\u0004\b'\u0010("\u0004\b)\u0010*R(\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007@FX\u0086\u000e¢\u0006\u000e
                                                   \u0000\u001a\u0004\b+\u0010,"\u0004\b-\u0010.R\u000e\u0010/\u001a\u00020 X\u0082\u000e¢\u0006\u0002
                                                   \u0000R\u000e\u00100\u001a\u00020 X\u0082\u000e¢\u0006\u0002
                                                   \u0000R\u0016\u0010\b\u001a
                                                   \u0012\u0006\u0012\u0004\u0018\u00010	0\u0003X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u000e\u00101\u001a\u00020 X\u0082\u000e¢\u0006\u0002
                                                   \u0000R\u000e\u00102\u001a\u00020 X\u0082\u000e¢\u0006\u0002
                                                   \u0000R\u000e\u00103\u001a\u00020 X\u0082\u000e¢\u0006\u0002
                                                   \u0000R\u000e\u00104\u001a\u000205X\u0082\u000e¢\u0006\u0002
                                                   \u0000R\u000e\u00106\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002
                                                   \u0000R\u000e\u00107\u001a\u000205X\u0082\u000e¢\u0006\u0002
                                                   \u0000R\u000e\u00108\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002
                                                   \u0000¨\u0006`""" }, d2 = { "Lgg/essential/gui/common/UI3DPlayer;", "Lgg/essential/elementa/UIComponent;", "hideNameTags", "Lgg/essential/elementa/state/State;", "", "draggable", "player", "Lnet/minecraft/entity/player/PlayerEntity;", "profile", "Lcom/mojang/authlib/GameProfile;", "(Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;Lnet/minecraft/entity/player/PlayerEntity;Lgg/essential/elementa/state/State;)V", "value", "Lgg/essential/cosmetics/source/CosmeticsSource;", "cosmeticsSource", "getCosmeticsSource", "()Lgg/essential/cosmetics/source/CosmeticsSource;", "setCosmeticsSource", "(Lgg/essential/cosmetics/source/CosmeticsSource;)V", "getDraggable", "()Lgg/essential/elementa/state/State;", "dragging", "errored", "getErrored", "()Z", "setErrored", "(Z)V", "fallbackErrored", "fallbackPlayer", "Lkotlin/Lazy;", "Lgg/essential/gui/common/UI3DPlayer$FallbackPlayer;", "getHideNameTags", "partialTicks", "", "getPartialTicks", "()F", "setPartialTicks", "(F)V", "perspectiveCamera", "Lgg/essential/gui/common/UI3DPlayer$PerspectiveCamera;", "getPerspectiveCamera", "()Lgg/essential/gui/common/UI3DPlayer$PerspectiveCamera;", "setPerspectiveCamera", "(Lgg/essential/gui/common/UI3DPlayer$PerspectiveCamera;)V", "getPlayer", "()Lnet/minecraft/entity/player/PlayerEntity;", "setPlayer", "(Lnet/minecraft/entity/player/PlayerEntity;)V", "prevX", "prevY", "rotationAngleHorizontal", "rotationAngleVerticalFront", "rotationAngleVerticalSide", "walkAnimationProgress", "", "walkAnimationStage", "walkAnimationTotal", "walkingEnabled", "animationFrame", "", "applyCameraRotation", "renderManager", "Lnet/minecraft/client/render/entity/EntityRenderDispatcher;", "doDrag", "mouseX", "mouseY", "mouseButton", "doDrawFallbackPlayer", "stack", "Lgg/essential/model/util/UMatrixStack;", "doDrawPlayer", "Lgg/essential/universal/UMatrixStack;", "scale", "draw", "matrixStack", "drawPlayer", "drawWithOrthographicProjection", "drawWithPerspectiveProjection", "camera", "resetWalkingAnimation", "rotateClockwise", "diff", "rotateCounterClockwise", "setRotations", "pitch", "yaw", "startWalking", "stopWalking", "createModelViewMatrix", "transform", "Lkotlin/Pair;", "x", "y", "Companion", "FallbackPlayer", "MolangQueryEntityImpl", "PerspectiveCamera", "essential" })
public class UI3DPlayer extends UIComponent
{
    @NotNull
    public static final Companion Companion;
    @NotNull
    private final State<Boolean> hideNameTags;
    @NotNull
    private final State<Boolean> draggable;
    @NotNull
    private final State<GameProfile> profile;
    @Nullable
    private PlayerEntity player;
    @Nullable
    private CosmeticsSource cosmeticsSource;
    private boolean dragging;
    private float rotationAngleHorizontal;
    private float rotationAngleVerticalFront;
    private float prevX;
    private float prevY;
    @Nullable
    private PerspectiveCamera perspectiveCamera;
    private boolean errored;
    @NotNull
    private final Lazy<UI3DPlayer.FallbackPlayer> fallbackPlayer;
    private boolean fallbackErrored;
    @JvmField
    @Nullable
    public static UI3DPlayer current;
    @JvmField
    public static boolean isRenderingPerspective;
    @NotNull
    private static final Lazy<CosmeticsService> fallbackCosmeticsService$delegate;
    
    public UI3DPlayer(@NotNull final State<Boolean> hideNameTags, @NotNull final State<Boolean> draggable, @Nullable final PlayerEntity player, @NotNull final State<GameProfile> profile) {
        Intrinsics.checkNotNullParameter((Object)hideNameTags, "hideNameTags");
        Intrinsics.checkNotNullParameter((Object)draggable, "draggable");
        Intrinsics.checkNotNullParameter((Object)profile, "profile");
        super();
        this.hideNameTags = hideNameTags;
        this.draggable = draggable;
        this.profile = profile;
        this.player = player;
        this.rotationAngleHorizontal = 30.0f;
        this.rotationAngleVerticalFront = -10.0f;
        this.prevX = -1.0f;
        this.prevY = -1.0f;
        if (ModLoaderUtil.INSTANCE.isModLoaded("figura")) {
            this.errored = true;
        }
        this.fallbackPlayer = (Lazy<UI3DPlayer.FallbackPlayer>)LazyKt.lazy((Function0)new UI3DPlayer$fallbackPlayer.UI3DPlayer$fallbackPlayer$1(this));
        this.setWidth(UtilitiesKt.pixels$default(60.000004f, false, false, 3, null));
        this.setHeight(UtilitiesKt.pixels$default(180.0f, false, false, 3, null));
        final UIComponent $this$onLeftClick$iv = this;
        $this$onLeftClick$iv.onMouseClick((Function2<? super UIComponent, ? super UIClickEvent, Unit>)new Function2<UIComponent, UIClickEvent, Unit>(this) {
            final /* synthetic */ UI3DPlayer this$0;
            
            public UI3DPlayer$special$$inlined$onLeftClick$1(final UI3DPlayer this$0) {
                this.this$0 = this$0;
                super(2);
            }
            
            public final void invoke(@NotNull final UIComponent $this$onMouseClick, @NotNull final UIClickEvent it) {
                Intrinsics.checkNotNullParameter((Object)$this$onMouseClick, "$this$onMouseClick");
                Intrinsics.checkNotNullParameter((Object)it, "it");
                if (it.getMouseButton() == 0) {
                    final UIClickEvent event = it;
                    if (this.this$0.getDraggable().get()) {
                        UI3DPlayer.access$setDragging$p(this.this$0, true);
                        UI3DPlayer.access$setPrevX$p(this.this$0, event.getRelativeX());
                        UI3DPlayer.access$setPrevY$p(this.this$0, event.getRelativeY());
                    }
                }
            }
            
            public /* bridge */ Object invoke(final Object p1, final Object p2) {
                this.invoke((UIComponent)p1, (UIClickEvent)p2);
                return Unit.INSTANCE;
            }
        });
        this.onMouseDrag((Function4<? super UIComponent, ? super Float, ? super Float, ? super Integer, Unit>)new Function4<UIComponent, Float, Float, Integer, Unit>() {
            final /* synthetic */ UI3DPlayer this$0;
            
            UI3DPlayer$2() {
                this.this$0 = $receiver;
                super(4);
            }
            
            public final void invoke$2bfbe426(@NotNull final UIComponent $this$onMouseDrag, final float mouseX, final float mouseY) {
                Intrinsics.checkNotNullParameter((Object)$this$onMouseDrag, "$this$onMouseDrag");
                UI3DPlayer.this.doDrag$483d2f6e(mouseX, mouseY);
            }
            
            public /* bridge */ Object invoke(final Object p1, final Object p2, final Object p3, final Object p4) {
                final UIComponent $this$onMouseDrag = (UIComponent)p1;
                final float floatValue = ((Number)p2).floatValue();
                final float floatValue2 = ((Number)p3).floatValue();
                ((Number)p4).intValue();
                this.invoke$2bfbe426($this$onMouseDrag, floatValue, floatValue2);
                return Unit.INSTANCE;
            }
        });
        this.onMouseRelease((Function1<? super UIComponent, Unit>)new Function1<UIComponent, Unit>() {
            final /* synthetic */ UI3DPlayer this$0;
            
            UI3DPlayer$3() {
                this.this$0 = $receiver;
                super(1);
            }
            
            public final void invoke(@NotNull final UIComponent $this$onMouseRelease) {
                Intrinsics.checkNotNullParameter((Object)$this$onMouseRelease, "$this$onMouseRelease");
                if (this.this$0.getDraggable().get()) {
                    UI3DPlayer.access$setPrevX$p(this.this$0, -1.0f);
                    UI3DPlayer.access$setPrevY$p(this.this$0, -1.0f);
                    UI3DPlayer.access$setDragging$p(this.this$0, false);
                }
            }
            
            public /* bridge */ Object invoke(final Object p1) {
                this.invoke((UIComponent)p1);
                return Unit.INSTANCE;
            }
        });
    }
    
    @NotNull
    public final State<Boolean> getHideNameTags() {
        return this.hideNameTags;
    }
    
    @NotNull
    public final State<Boolean> getDraggable() {
        return this.draggable;
    }
    
    @Nullable
    public final PlayerEntity getPlayer() {
        return this.player;
    }
    
    public final void setPlayer(@Nullable final PlayerEntity value) {
        this.player = value;
        this.setCosmeticsSource(this.cosmeticsSource);
    }
    
    @Nullable
    public final CosmeticsSource getCosmeticsSource() {
        return this.cosmeticsSource;
    }
    
    public final void setCosmeticsSource(@Nullable final CosmeticsSource value) {
        this.cosmeticsSource = value;
        if (value != null) {
            final PlayerEntity player = this.player;
            final AbstractClientPlayerExt abstractClientPlayerExt = (player instanceof AbstractClientPlayerExt) ? player : null;
            if (abstractClientPlayerExt != null) {
                abstractClientPlayerExt.setCosmeticsSource(value);
            }
        }
    }
    
    public final void setPerspectiveCamera(@Nullable final PerspectiveCamera <set-?>) {
        this.perspectiveCamera = <set-?>;
    }
    
    protected final boolean getErrored() {
        return this.errored;
    }
    
    protected final void setErrored$1385ff() {
        this.errored = true;
    }
    
    public final void rotateClockwise(final float diff) {
        this.rotationAngleHorizontal -= diff;
    }
    
    public final void setRotations$2548a35() {
        this.rotationAngleHorizontal = 0.0f;
        this.rotationAngleVerticalFront = 0.0f;
    }
    
    private final void doDrag$483d2f6e(final float mouseX, final float mouseY) {
        if (!this.dragging || !this.draggable.get()) {
            return;
        }
        final float dX = (mouseX - this.prevX) / 1.5f;
        final float dY = (mouseY - this.prevY) / 1.5f;
        this.rotationAngleHorizontal += dX;
        this.rotationAngleVerticalFront += -(dY * 1.0f);
        this.rotationAngleVerticalFront = RangesKt.coerceIn(this.rotationAngleVerticalFront, -30.0f, 30.0f);
        this.prevX = mouseX;
        this.prevY = mouseY;
    }
    
    @Override
    public void animationFrame() {
        super.animationFrame();
        final UI3DPlayer.FallbackPlayer fallbackPlayer = ExtensionsKt.getOrNull((kotlin.Lazy<? extends UI3DPlayer.FallbackPlayer>)this.fallbackPlayer);
        if (fallbackPlayer != null) {
            fallbackPlayer.animationFrame();
        }
    }
    
    @Override
    public void draw(@NotNull final UMatrixStack matrixStack) {
        Intrinsics.checkNotNullParameter((Object)matrixStack, "matrixStack");
        this.beforeDraw(matrixStack);
        final PerspectiveCamera camera = this.perspectiveCamera;
        if (camera != null) {
            this.drawWithPerspectiveProjection(matrixStack.fork(), camera);
        }
        else {
            this.drawWithOrthographicProjection(matrixStack.fork());
        }
        super.draw(matrixStack);
    }
    
    private final void drawWithOrthographicProjection(final UMatrixStack stack) {
        float width = this.getWidth();
        float height = this.getHeight();
        final float widthPadding = width * 0.05f;
        final float heightPadding = height * 0.05f;
        width -= widthPadding;
        height -= heightPadding;
        final double x = this.getLeft();
        final double y = this.getTop() - (double)(heightPadding / 2.0f);
        final float boundingHeight = Math.min(width * 2.0f, height);
        final double scale = boundingHeight * 0.525;
        stack.translate(0.0, -this.getHeight() / 4.0, 0.0);
        stack.translate(0.0f, 0.0f, 500.0f);
        stack.translate(x + this.getWidth() / 2.0f, y + this.getHeight() / 2.0f, 0.0);
        stack.translate(0.0f, this.getHeight() / 4.0f, -50.0f);
        UMatrixStack.rotate$default(stack, this.rotationAngleVerticalFront, 1.0f, 0.0f, 0.0f, false, 16, null);
        UMatrixStack.rotate$default(stack, 0.0f, 0.0f, 0.0f, 1.0f, false, 16, null);
        UMatrixStack.rotate$default(stack, this.rotationAngleHorizontal, 0.0f, 1.0f, 0.0f, false, 16, null);
        stack.translate(0.0f, this.getHeight() / 2.0f, -50.0f);
        stack.translate(0.0, -(height - boundingHeight) / 2.0, 0.0);
        this.drawPlayer(stack, (int)scale);
    }
    
    private final void drawWithPerspectiveProjection(final UMatrixStack stack, final PerspectiveCamera camera) {
        GL11.glClear(256);
        final Pair<Float, Float> transform = this.transform(stack, this.getLeft(), this.getTop());
        final float left = ((Number)transform.component1()).floatValue();
        final float top = ((Number)transform.component2()).floatValue();
        final Pair<Float, Float> transform2 = this.transform(stack, this.getRight(), this.getBottom());
        final float right = ((Number)transform2.component1()).floatValue();
        final float bottom = ((Number)transform2.component2()).floatValue();
        final float middleX = (left + right) / 2.0f;
        final float middleY = (top + bottom) / 2.0f;
        final float width = right - left;
        final float height = bottom - top;
        final float windowWidth = UResolution.getViewportWidth() / (float)UResolution.getScaleFactor();
        final float windowHeight = UResolution.getViewportHeight() / (float)UResolution.getScaleFactor();
        final float scaleX = width / windowWidth;
        final float scaleY = height / windowHeight;
        final UMatrixStack modelViewMatrix = this.createModelViewMatrix(camera);
        modelViewMatrix.translate(0.0, 0.0, -50.0);
        final UMatrixStack projectionMatrix = new UMatrixStack();
        projectionMatrix.translate(-1.0f + middleX / windowWidth * 2.0f, 1.0f - middleY / windowHeight * 2.0f, 0.0f);
        projectionMatrix.scale(scaleX, scaleY, 1.0f);
        projectionMatrix.peek().getModel().multiply(Matrix4f.viewboxMatrix(22.0, this.getWidth() / this.getHeight(), 0.5f, 20.0f));
        final Matrix4f orgProjectionMatrix = RenderSystem.getProjectionMatrix();
        RenderSystem.setProjectionMatrix(projectionMatrix.peek().getModel());
        UI3DPlayer.isRenderingPerspective = true;
        modelViewMatrix.runReplacingGlobalState((kotlin.jvm.functions.Function0<?>)new UI3DPlayer$drawWithPerspectiveProjection.UI3DPlayer$drawWithPerspectiveProjection$1(this));
        UI3DPlayer.isRenderingPerspective = false;
        RenderSystem.setProjectionMatrix(orgProjectionMatrix);
    }
    
    private final Pair<Float, Float> transform(final UMatrixStack $this$transform, final float x, final float y) {
        final Vector4f vec = new Vector4f(x, y, 0.0f, 1.0f);
        vec.transform($this$transform.peek().getModel());
        return (Pair<Float, Float>)new Pair((Object)vec.getX(), (Object)vec.getY());
    }
    
    private final UMatrixStack createModelViewMatrix(final PerspectiveCamera $this$createModelViewMatrix) {
        final Vector3 forward = Vector3.copy$default$43f21962$6d547e82($this$createModelViewMatrix.getTarget()).sub($this$createModelViewMatrix.getCamera()).normalize();
        final float yaw = (float)Math.atan2(-forward.x, forward.z);
        final float pitch = (float)Math.asin(forward.y);
        final UMatrixStack stack = new UMatrixStack();
        stack.scale(1.0, -1.0, 1.0);
        stack.rotate(pitch, 1.0f, 0.0f, 0.0f, false);
        stack.rotate(yaw, 0.0f, 1.0f, 0.0f, false);
        stack.translate($this$createModelViewMatrix.getCamera().x, $this$createModelViewMatrix.getCamera().y, $this$createModelViewMatrix.getCamera().z);
        return stack;
    }
    
    private final void drawPlayer(final UMatrixStack stack, final int scale) {
        if (!this.errored) {
            try {
                (UI3DPlayer.current = this).doDrawPlayer(stack, scale);
            }
            catch (final Exception e) {
                Essential.logger.error("Error rendering emulated player", (Throwable)e);
                this.errored = true;
            }
            finally {
                UI3DPlayer.current = null;
            }
            return;
        }
        if (this.fallbackErrored) {
            return;
        }
        try {
            stack.translate(0.0f, 0.0f, 50.0f);
            stack.scale(-(float)scale, (float)scale, (float)scale);
            UMatrixStack.rotate$default(stack, 180.0f, 0.0f, 0.0f, 1.0f, false, 16, null);
            stack.runWithGlobalState((kotlin.jvm.functions.Function0<?>)new UI3DPlayer$drawPlayer.UI3DPlayer$drawPlayer$1(this));
        }
        catch (final Exception e) {
            Essential.logger.error("Error rendering fallback player", (Throwable)e);
            this.fallbackErrored = true;
        }
    }
    
    private final void doDrawPlayer(final UMatrixStack stack, final int scale) {
        final PlayerEntity player = this.player;
        if (player == null) {
            return;
        }
        final PlayerEntity p = player;
        final EntityRenderDispatcher renderManager = MinecraftClient.getInstance().getEntityRenderDispatcher();
        renderManager.camera = (Camera)new UI3DPlayer$doDrawPlayer.UI3DPlayer$doDrawPlayer$1(p, this);
        UGraphics.directColor3f(1.0f, 1.0f, 1.0f);
        UGraphics.enableDepth();
        stack.runWithGlobalState((kotlin.jvm.functions.Function0<?>)new UI3DPlayer$doDrawPlayer.UI3DPlayer$doDrawPlayer$2(scale, p));
        UGraphics.depthFunc(515);
        UGraphics.color4f(1.0f, 1.0f, 1.0f, 1.0f);
        UGraphics.disableDepth();
    }
    
    public final void applyCameraRotation(@NotNull final EntityRenderDispatcher renderManager) {
        Intrinsics.checkNotNullParameter((Object)renderManager, "renderManager");
        final Matrix4f matrix = new Matrix4f();
        matrix.loadIdentity();
        matrix.multiply(Matrix4f.scale(1.0f, -1.0f, 1.0f));
        matrix.multiply(Vec3f.POSITIVE_Y.getDegreesQuaternion(135.0f));
        DiffuseLighting.disableForLevel(matrix);
        renderManager.setRotation(renderManager.camera.getRotation());
    }
    
    private final void doDrawFallbackPlayer(final gg.essential.model.util.UMatrixStack stack) {
        final Matrix4f matrix = new Matrix4f();
        matrix.loadIdentity();
        matrix.multiply(Vec3f.POSITIVE_Y.getDegreesQuaternion(135.0f));
        DiffuseLighting.disableForLevel(matrix);
        final VertexConsumerProvider$Immediate immediate = MinecraftClient.getInstance().getBufferBuilders().getEntityVertexConsumers();
        Intrinsics.checkNotNullExpressionValue((Object)immediate, "immediate");
        final MinecraftRenderBackend.VertexConsumerProvider vertexConsumerProvider = new MinecraftRenderBackend.VertexConsumerProvider((VertexConsumerProvider)immediate, 15728880);
        stack.rotate(180.0f, 0.0f, 1.0f, 0.0f, true);
        stack.scale(-1.0f, -1.0f, 1.0f);
        stack.scale$133aeb();
        ((UI3DPlayer.FallbackPlayer)this.fallbackPlayer.getValue()).render(stack, (RenderBackend.VertexConsumerProvider)vertexConsumerProvider);
        immediate.draw();
        DiffuseLighting.enableGuiDepthLighting();
    }
    
    public static final /* synthetic */ void access$drawPlayer$4de8d7fa(final UI3DPlayer $this, final UMatrixStack stack) {
        $this.drawPlayer(stack, 1);
    }
    
    public static final /* synthetic */ void access$doDrawFallbackPlayer(final UI3DPlayer $this, final gg.essential.model.util.UMatrixStack stack) {
        $this.doDrawFallbackPlayer(stack);
    }
    
    public static final /* synthetic */ float access$getRotationAngleHorizontal$p(final UI3DPlayer $this) {
        return $this.rotationAngleHorizontal;
    }
    
    public static final /* synthetic */ float access$getRotationAngleVerticalFront$p(final UI3DPlayer $this) {
        return $this.rotationAngleVerticalFront;
    }
    
    public static final /* synthetic */ State access$getProfile$p(final UI3DPlayer $this) {
        return $this.profile;
    }
    
    public static final /* synthetic */ Lazy access$getFallbackCosmeticsService$delegate$cp() {
        return UI3DPlayer.fallbackCosmeticsService$delegate;
    }
    
    public static final /* synthetic */ void access$setDragging$p(final UI3DPlayer $this, final boolean <set-?>) {
        $this.dragging = <set-?>;
    }
    
    public static final /* synthetic */ void access$setPrevX$p(final UI3DPlayer $this, final float <set-?>) {
        $this.prevX = <set-?>;
    }
    
    public static final /* synthetic */ void access$setPrevY$p(final UI3DPlayer $this, final float <set-?>) {
        $this.prevY = <set-?>;
    }
    
    public static final /* synthetic */ void access$doDrag$3acf633b(final UI3DPlayer $this, final float mouseX, final float mouseY) {
        $this.doDrag$483d2f6e(mouseX, mouseY);
    }
    
    static {
        Companion = new Companion((byte)0);
        fallbackCosmeticsService$delegate = LazyKt.lazy((Function0)UI3DPlayer$Companion$fallbackCosmeticsService.UI3DPlayer$Companion$fallbackCosmeticsService$2.INSTANCE);
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                       \u0000.
                                                       \u0002\u0018\u0002
                                                       \u0002\u0010\u0000
                                                       \u0000
                                                       \u0002\u0018\u0002
                                                       \u0002\b\u0002
                                                       \u0002\u0010\u0007
                                                       \u0002\b\u000b
                                                       \u0002\u0010\u000b
                                                       \u0002\b\u0002
                                                       \u0002\u0010\b
                                                       \u0000
                                                       \u0002\u0010\u000e
                                                       \u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J	\u0010\r\u001a\u00020\u0003H\u00c6\u0003J	\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J	\u0010\u000f\u001a\u00020\u0006H\u00c6\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J	\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001J	\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b
                                                       \u0000\u001a\u0004\b\b\u0010	R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b
                                                       \u0000\u001a\u0004\b
                                                       \u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b
                                                       \u0000\u001a\u0004\b\f\u0010	¨\u0006\u0018""" }, d2 = { "Lgg/essential/gui/common/UI3DPlayer$PerspectiveCamera;", "", "camera", "Lgg/essential/model/Vector3;", "target", "fov", "", "(Lgg/essential/model/Vector3;Lgg/essential/model/Vector3;F)V", "getCamera", "()Lgg/essential/model/Vector3;", "getFov", "()F", "getTarget", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "essential" })
    public static final class PerspectiveCamera
    {
        @NotNull
        private final Vector3 camera;
        @NotNull
        private final Vector3 target;
        
        public PerspectiveCamera(@NotNull final Vector3 camera, @NotNull final Vector3 target) {
            Intrinsics.checkNotNullParameter((Object)camera, "camera");
            Intrinsics.checkNotNullParameter((Object)target, "target");
            super();
            this.camera = camera;
            this.target = target;
        }
        
        @NotNull
        public final Vector3 getCamera() {
            return this.camera;
        }
        
        @NotNull
        public final Vector3 getTarget() {
            return this.target;
        }
        
        @NotNull
        @Override
        public String toString() {
            return "PerspectiveCamera(camera=" + this.camera + ", target=" + this.target + ", fov=" + 22.0f;
        }
        
        @Override
        public int hashCode() {
            int result = this.camera.hashCode();
            result = result * 31 + this.target.hashCode();
            result = result * 31 + Float.hashCode(22.0f);
            return result;
        }
        
        @Override
        public boolean equals(@Nullable final Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PerspectiveCamera)) {
                return false;
            }
            final PerspectiveCamera perspectiveCamera = (PerspectiveCamera)other;
            return Intrinsics.areEqual((Object)this.camera, (Object)perspectiveCamera.camera) && Intrinsics.areEqual((Object)this.target, (Object)perspectiveCamera.target) && Intrinsics.areEqual((Object)22.0f, (Object)22.0f);
        }
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                       \u0000.
                                                       \u0002\u0018\u0002
                                                       \u0002\u0010\u0000
                                                       \u0002\b\u0002
                                                       \u0002\u0010\u0006
                                                       \u0000
                                                       \u0002\u0010\u0007
                                                       \u0000
                                                       \u0002\u0018\u0002
                                                       \u0000
                                                       \u0002\u0018\u0002
                                                       \u0002\b\u0005
                                                       \u0002\u0010\u000b
                                                       \u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002
                                                       \u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002
                                                       \u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002
                                                       \u0000R\u001b\u0010	\u001a\u00020
                                                       8BX\u0082\u0084\u0002¢\u0006\f
                                                       \u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u0012\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0002
                                                       \u0000R\u000e\u0010\u0011\u001a\u00020\u0006X\u0082T¢\u0006\u0002
                                                       \u0000R\u000e\u0010\u0012\u001a\u00020\u0006X\u0082T¢\u0006\u0002
                                                       \u0000¨\u0006\u0013""" }, d2 = { "Lgg/essential/gui/common/UI3DPlayer$Companion;", "", "()V", "MAGIC_HEIGHT_SCALING_FACTOR", "", "PADDING_FACTOR", "", "current", "Lgg/essential/gui/common/UI3DPlayer;", "fallbackCosmeticsService", "Lgg/essential/mod/cosmetics/CosmeticsService;", "getFallbackCosmeticsService", "()Lgg/essential/mod/cosmetics/CosmeticsService;", "fallbackCosmeticsService$delegate", "Lkotlin/Lazy;", "isRenderingPerspective", "", "playerHeight", "playerWidth", "essential" })
    public static final class Companion
    {
        private Companion() {
            super();
        }
        
        private final CosmeticsService getFallbackCosmeticsService() {
            return (CosmeticsService)UI3DPlayer.access$getFallbackCosmeticsService$delegate$cp().getValue();
        }
        
        public static final /* synthetic */ CosmeticsService access$getFallbackCosmeticsService(final Companion $this) {
            return $this.getFallbackCosmeticsService();
        }
        
        public Companion(final byte b) {
            this();
        }
    }
}
