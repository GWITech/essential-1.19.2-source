package gg.essential.gui;

import net.minecraft.client.gui.screen.option.*;
import net.minecraft.client.gui.widget.*;
import net.minecraft.text.*;
import java.util.*;
import gg.essential.lib.kbrewster.eventbus.*;
import gg.essential.event.gui.*;
import gg.essential.universal.*;
import gg.essential.util.*;
import gg.essential.config.*;
import net.minecraft.client.gui.screen.*;

public class GuiOptionsEditor
{
    private ButtonWidget essentialSettingsButton;
    private final Object accessibilityButtonText;
    
    public GuiOptionsEditor() {
        super();
        this.accessibilityButtonText = HelpersKt.textTranslatable("options.accessibility.title", new Object[0]);
    }
    
    @Subscribe
    public void guiOptionsInit(final InitGuiEvent event) {
        if (event.getScreen() instanceof OptionsScreen) {
            for (final ClickableWidget widget : event.getButtonList()) {
                if (this.accessibilityButtonText.equals(widget.getMessage())) {
                    event.getButtonList().add((ClickableWidget)(this.essentialSettingsButton = new ButtonWidget(widget.x, widget.y + 20 + 4, 150, 20, (Text)HelpersKt.textLiteral("Essential Settings..."), __ -> {})));
                }
            }
        }
    }
    
    @Subscribe
    public void guiClick(final GuiClickEvent event) {
        if (event.getScreen() instanceof OptionsScreen && event.getButton() == 0 && this.essentialSettingsButton != null && this.essentialSettingsButton.method_25405(event.getMouseX(), event.getMouseY()) && this.essentialSettingsButton.field_22763) {
            event.setCancelled$1385ff();
            USound.INSTANCE.playButtonPress();
            GuiUtil.INSTANCE.openScreen(EssentialConfig.INSTANCE.gui());
        }
    }
    
    private static /* synthetic */ void lambda$guiOptionsInit$0(final ButtonWidget __) {
    }
}
