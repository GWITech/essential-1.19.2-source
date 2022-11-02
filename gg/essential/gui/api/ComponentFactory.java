package gg.essential.gui.api;

import org.jetbrains.annotations.*;
import gg.essential.elementa.*;
import kotlin.jvm.internal.*;
import gg.essential.elementa.state.*;
import com.mojang.authlib.*;
import gg.essential.gui.common.modal.*;
import kotlin.*;
import kotlin.jvm.functions.*;
import gg.essential.api.gui.*;
import gg.essential.gui.common.*;
import gg.essential.gui.image.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000 
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0007H\u0016J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\bH\u0016¨\u0006	""" }, d2 = { "Lgg/essential/gui/api/ComponentFactory;", "Lgg/essential/api/gui/EssentialComponentFactory;", "()V", "build", "Lgg/essential/elementa/UIComponent;", "builder", "Lgg/essential/api/gui/ConfirmationModalBuilder;", "Lgg/essential/api/gui/EmulatedPlayerBuilder;", "Lgg/essential/api/gui/IconButtonBuilder;", "essential" })
public final class ComponentFactory implements EssentialComponentFactory
{
    @NotNull
    public static final ComponentFactory INSTANCE;
    
    private ComponentFactory() {
        super();
    }
    
    @NotNull
    @Override
    public UIComponent build(@NotNull final EmulatedPlayerBuilder builder) {
        Intrinsics.checkNotNullParameter((Object)builder, "builder");
        final EmulatedPlayerBuilder $this$build_u24lambda_u2d0 = builder;
        return new EmulatedUI3DPlayer($this$build_u24lambda_u2d0.getShowCapeState(), $this$build_u24lambda_u2d0.getDraggableState(), $this$build_u24lambda_u2d0.getProfileState(), $this$build_u24lambda_u2d0.getRenderNameTagState());
    }
    
    @NotNull
    @Override
    public UIComponent build(@NotNull final ConfirmationModalBuilder builder) {
        Intrinsics.checkNotNullParameter((Object)builder, "builder");
        final ConfirmationModalBuilder $this$build_u24lambda_u2d2 = builder;
        final String inputPlaceholder = $this$build_u24lambda_u2d2.getInputPlaceholder();
        final String secondaryText = $this$build_u24lambda_u2d2.getSecondaryText();
        final EssentialModal $this$configure_u24lambda_u2d0$iv;
        final EssentialModal $this$configure$iv = $this$configure_u24lambda_u2d0$iv = ((inputPlaceholder != null) ? new CancelableInputModal(inputPlaceholder, "").onPrimaryActionWithValue((Function1<? super String, Unit>)$this$build_u24lambda_u2d2.getOnConfirm()) : new ConfirmDenyModal(false).onPrimaryAction((Function0<Unit>)new ComponentFactory$build$2.ComponentFactory$build$2$1($this$build_u24lambda_u2d2)));
        final ConfirmDenyModal $this$build_u24lambda_u2d2_u24lambda_u2d1 = (ConfirmDenyModal)$this$configure_u24lambda_u2d0$iv;
        $this$build_u24lambda_u2d2_u24lambda_u2d1.setTitleText($this$build_u24lambda_u2d2.getText());
        if (secondaryText != null) {
            $this$build_u24lambda_u2d2_u24lambda_u2d1.setContentText(secondaryText);
        }
        $this$build_u24lambda_u2d2_u24lambda_u2d1.setPrimaryButtonText($this$build_u24lambda_u2d2.getConfirmButtonText());
        $this$build_u24lambda_u2d2_u24lambda_u2d1.setCancelButtonText($this$build_u24lambda_u2d2.getDenyButtonText());
        return ((ConfirmDenyModal)$this$configure_u24lambda_u2d0$iv).onCancel((Function1<? super Boolean, Unit>)new ComponentFactory$build$2.ComponentFactory$build$2$3($this$build_u24lambda_u2d2));
    }
    
    @NotNull
    @Override
    public UIComponent build(@NotNull final IconButtonBuilder builder) {
        Intrinsics.checkNotNullParameter((Object)builder, "builder");
        return new IconButton((State<ImageFactory>)builder.getIconResourceState().map((kotlin.jvm.functions.Function1<? super String, ?>)ComponentFactory$build.ComponentFactory$build$3.INSTANCE), builder.getTooltipTextState(), builder.getEnabledState(), builder.getButtonTextState(), builder.getIconShadowState(), builder.getTextShadowState(), builder.getTooltipBelowComponent());
    }
    
    static {
        INSTANCE = new ComponentFactory();
    }
}
