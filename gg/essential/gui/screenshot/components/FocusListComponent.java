package gg.essential.gui.screenshot.components;

import gg.essential.elementa.events.*;
import kotlin.*;
import kotlin.jvm.internal.*;
import gg.essential.elementa.state.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.functions.*;
import gg.essential.universal.*;
import gg.essential.elementa.constraints.*;
import gg.essential.elementa.dsl.*;
import gg.essential.elementa.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000&
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0010\b
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u000b\fB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010	\u001a\u00020
                                                   R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002
                                                   \u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002
                                                   \u0000¨\u0006""" }, d2 = { "Lgg/essential/gui/screenshot/components/FocusListComponent;", "Lgg/essential/gui/screenshot/components/FocusComponent;", "screenshotBrowser", "Lgg/essential/gui/screenshot/components/ScreenshotBrowser;", "(Lgg/essential/gui/screenshot/components/ScreenshotBrowser;)V", "previewIndex", "", "beginPreview", "", "properties", "Lgg/essential/gui/screenshot/components/ScreenshotProperties;", "Alignment", "FocusScreenshotRange", "essential" })
public final class FocusListComponent extends FocusComponent
{
    @NotNull
    private final ScreenshotBrowser screenshotBrowser;
    private int previewIndex;
    
    public FocusListComponent(@NotNull final ScreenshotBrowser screenshotBrowser) {
        Intrinsics.checkNotNullParameter((Object)screenshotBrowser, "screenshotBrowser");
        super(screenshotBrowser, FocusType.VIEW);
        this.screenshotBrowser = screenshotBrowser;
        UIComponent $this$onLeftClick$iv = this.getDelete();
        $this$onLeftClick$iv.onMouseClick((Function2<? super UIComponent, ? super UIClickEvent, Unit>)new Function2<UIComponent, UIClickEvent, Unit>(this) {
            final /* synthetic */ FocusListComponent this$0;
            
            public FocusListComponent$special$$inlined$onLeftClick$1(final FocusListComponent this$0) {
                this.this$0 = this$0;
                super(2);
            }
            
            public final void invoke(@NotNull final UIComponent $this$onMouseClick, @NotNull final UIClickEvent it) {
                Intrinsics.checkNotNullParameter((Object)$this$onMouseClick, "$this$onMouseClick");
                Intrinsics.checkNotNullParameter((Object)it, "it");
                if (it.getMouseButton() == 0) {
                    this.this$0.deleteCurrentFocus$1385ff();
                }
            }
            
            public /* bridge */ Object invoke(final Object p1, final Object p2) {
                this.invoke((UIComponent)p1, (UIClickEvent)p2);
                return Unit.INSTANCE;
            }
        });
        $this$onLeftClick$iv = this.getFavorite();
        $this$onLeftClick$iv.onMouseClick((Function2<? super UIComponent, ? super UIClickEvent, Unit>)new Function2<UIComponent, UIClickEvent, Unit>(this) {
            final /* synthetic */ FocusListComponent this$0;
            
            public FocusListComponent$special$$inlined$onLeftClick$2(final FocusListComponent this$0) {
                this.this$0 = this$0;
                super(2);
            }
            
            public final void invoke(@NotNull final UIComponent $this$onMouseClick, @NotNull final UIClickEvent it) {
                Intrinsics.checkNotNullParameter((Object)$this$onMouseClick, "$this$onMouseClick");
                Intrinsics.checkNotNullParameter((Object)it, "it");
                if (it.getMouseButton() == 0) {
                    final State favState = FocusListComponent.access$getScreenshotBrowser$p(this.this$0).getStateManager().getFavoriteState(this.this$0.getPreviewing());
                    favState.set((Function1)FocusListComponent$2$1.INSTANCE);
                }
            }
            
            public /* bridge */ Object invoke(final Object p1, final Object p2) {
                this.invoke((UIComponent)p1, (UIClickEvent)p2);
                return Unit.INSTANCE;
            }
        });
        this.screenshotBrowser.getFocusing().onSetValue((kotlin.jvm.functions.Function1<? super Object, Unit>)new Function1<ScreenshotProperties, Unit>() {
            final /* synthetic */ FocusListComponent this$0;
            
            FocusListComponent$3() {
                this.this$0 = $receiver;
                super(1);
            }
            
            public final void invoke(@Nullable final ScreenshotProperties properties) {
                if (properties != null) {
                    final State favState = FocusListComponent.access$getScreenshotBrowser$p(this.this$0).getStateManager().getFavoriteState(properties);
                    this.this$0.applyFavoriteState(favState);
                }
            }
            
            public /* bridge */ Object invoke(final Object p1) {
                this.invoke((ScreenshotProperties)p1);
                return Unit.INSTANCE;
            }
        });
        this.screenshotBrowser.getWindow().onKeyType((Function3<? super UIComponent, ? super Character, ? super Integer, Unit>)new Function3<UIComponent, Character, Integer, Unit>() {
            final /* synthetic */ FocusListComponent this$0;
            
            FocusListComponent$4() {
                this.this$0 = $receiver;
                super(3);
            }
            
            public final void invoke$69f0f35d(@NotNull final UIComponent $this$onKeyType, final int keyCode) {
                Intrinsics.checkNotNullParameter((Object)$this$onKeyType, "$this$onKeyType");
                if (this.this$0.getActive().get()) {
                    if (keyCode == UKeyboard.KEY_LEFT && FocusListComponent.access$getPreviewIndex$p(this.this$0) > 0) {
                        this.this$0.focus(FocusListComponent.access$getPreviewIndex$p(this.this$0) - 1);
                    }
                    else if (keyCode == UKeyboard.KEY_RIGHT && FocusListComponent.access$getPreviewIndex$p(this.this$0) < this.this$0.getProviderManager().getCurrentPaths().size() - 1) {
                        this.this$0.focus(FocusListComponent.access$getPreviewIndex$p(this.this$0) + 1);
                    }
                }
            }
            
            public /* bridge */ Object invoke(final Object p1, final Object p2, final Object p3) {
                final UIComponent $this$onKeyType = (UIComponent)p1;
                ((Character)p2).charValue();
                this.invoke$69f0f35d($this$onKeyType, ((Number)p3).intValue());
                return Unit.INSTANCE;
            }
        });
    }
    
    public final void beginPreview(@NotNull final ScreenshotProperties properties) {
        Intrinsics.checkNotNullParameter((Object)properties, "properties");
        this.getTime().setText(properties.getPath().getFileName().toString());
        this.previewIndex = this.getProviderManager().getCurrentPaths().indexOf(properties.getPath());
        this.getContainer().clearChildren();
        final UIComponent $this$constrain_u24lambda_u2d0$iv;
        final UIComponent $this$constrain$iv = $this$constrain_u24lambda_u2d0$iv = (UIComponent)new FocusListComponent.FocusScreenshotRange(this, this.screenshotBrowser, properties);
        final UIConstraints $this$beginPreview_u24lambda_u2d0 = $this$constrain_u24lambda_u2d0$iv.getConstraints();
        $this$beginPreview_u24lambda_u2d0.setWidth(UtilitiesKt.getPercent(100));
        $this$beginPreview_u24lambda_u2d0.setHeight(UtilitiesKt.getPercent(100));
        ComponentsKt.childOf($this$constrain_u24lambda_u2d0$iv, this.getContainer());
    }
    
    public static final /* synthetic */ ScreenshotBrowser access$getScreenshotBrowser$p(final FocusListComponent $this) {
        return $this.screenshotBrowser;
    }
    
    public static final /* synthetic */ int access$getPreviewIndex$p(final FocusListComponent $this) {
        return $this.previewIndex;
    }
}
