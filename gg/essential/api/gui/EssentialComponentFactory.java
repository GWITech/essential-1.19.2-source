package gg.essential.api.gui;

import gg.essential.elementa.*;
import kotlin.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000(
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0000
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0010\u000b
                                                   \u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0006H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0007H'J\u001c\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010	\u001a\u00020
                                                   2\b\b\u0002\u0010\u000b\u001a\u00020
                                                   H\u0017\u00f8\u0001\u0000\u0082\u0002\u0006
                                                   \u0004\b!0\u0001¨\u0006\f\u00c0\u0006\u0001""" }, d2 = { "Lgg/essential/api/gui/EssentialComponentFactory;", "", "build", "Lgg/essential/elementa/UIComponent;", "builder", "Lgg/essential/api/gui/ConfirmationModalBuilder;", "Lgg/essential/api/gui/EmulatedPlayerBuilder;", "Lgg/essential/api/gui/IconButtonBuilder;", "buildEmulatedPlayer", "showCape", "", "draggable", "essential-api" })
public interface EssentialComponentFactory
{
    @Deprecated(message = "Does not support all options.", replaceWith = @ReplaceWith(expression = """
                                                                                                   this.buildEmulatedPlayer {
                                                                                                   this@buildEmulatedPlayer.showCape = showCape
                                                                                                   this@buildEmulatedPlayer.draggable = draggable }""", imports = { "gg.essential.api.gui.buildEmulatedPlayer" }))
    @NotNull
    @java.lang.Deprecated
    default UIComponent buildEmulatedPlayer(final boolean showCape, final boolean draggable) {
        final EssentialComponentFactory $this$buildEmulatedPlayer$iv = this;
        final EmulatedPlayerBuilder $this$buildEmulatedPlayer_u24lambda_u2d0;
        final EmulatedPlayerBuilder emulatedPlayerBuilder = $this$buildEmulatedPlayer_u24lambda_u2d0 = new EmulatedPlayerBuilder();
        $this$buildEmulatedPlayer_u24lambda_u2d0.setShowCape(showCape);
        $this$buildEmulatedPlayer_u24lambda_u2d0.setDraggable(draggable);
        return emulatedPlayerBuilder.build($this$buildEmulatedPlayer$iv);
    }
    
    @java.lang.Deprecated
    default /* synthetic */ UIComponent buildEmulatedPlayer$default(final EssentialComponentFactory essentialComponentFactory, boolean showCape, boolean draggable, final int n, final Object o) {
        if (o != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: buildEmulatedPlayer");
        }
        if ((n & 0x1) != 0x0) {
            showCape = true;
        }
        if ((n & 0x2) != 0x0) {
            draggable = true;
        }
        return essentialComponentFactory.buildEmulatedPlayer(showCape, draggable);
    }
    
    @NotNull
    UIComponent build(@NotNull final EmulatedPlayerBuilder p0);
    
    @NotNull
    UIComponent build(@NotNull final ConfirmationModalBuilder p0);
    
    @ApiStatus.Internal
    @NotNull
    UIComponent build(@NotNull final IconButtonBuilder p0);
}
