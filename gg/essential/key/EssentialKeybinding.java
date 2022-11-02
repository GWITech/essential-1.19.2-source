package gg.essential.key;

import java.util.function.*;
import net.minecraft.client.*;
import gg.essential.mixins.transformers.client.options.*;
import net.minecraft.client.option.*;
import org.apache.commons.lang3.*;
import net.minecraft.client.gui.screen.*;
import gg.essential.api.utils.*;
import gg.essential.config.*;
import gg.essential.universal.*;
import java.util.*;
import com.google.common.collect.*;

public class EssentialKeybinding
{
    public static final List<EssentialKeybinding> ALL_BINDS;
    public final KeyBinding keyBinding;
    private final boolean alwaysTick;
    private Runnable onInitialPress;
    private Runnable onRepeatedHold;
    private Runnable onRelease;
    private boolean registeredWithMinecraft;
    private boolean pressed;
    private String requiresUnlocked;
    private Supplier<Boolean> customUnlockStatus;
    private boolean requiresEssentialFull;
    private static final Map<String, String> LEGACY_IDS;
    
    public EssentialKeybinding(final String keyId, final String category, final int keyCode) {
        this(keyId, category, keyCode, false);
    }
    
    public EssentialKeybinding(final String keyId, final String category, final int keyCode, final boolean alwaysTick) {
        super();
        this.registeredWithMinecraft = false;
        this.pressed = false;
        this.requiresEssentialFull = false;
        this.keyBinding = new KeyBinding((String)EssentialKeybinding.LEGACY_IDS.getOrDefault((Object)keyId, "keybind.name." + keyId), keyCode, category);
        this.alwaysTick = alwaysTick;
        EssentialKeybinding.ALL_BINDS.add(this);
    }
    
    public int getKeyCode() {
        return ((KeyBindingAccessor)this.keyBinding).getBoundKey().getCode();
    }
    
    public void register() {
        final GameOptions settings = MinecraftClient.getInstance().options;
        ((GameOptionsAccessor)settings).setKeyBindings(this.register(settings.allKeys));
        KeyBindingAccessor.getKeybinds().put(this.keyBinding.getTranslationKey(), this.keyBinding);
        KeyBinding.updateKeysByCode();
    }
    
    KeyBinding[] register(final KeyBinding[] allBindings) {
        if (this.registeredWithMinecraft) {
            return allBindings;
        }
        this.registeredWithMinecraft = true;
        return ArrayUtils.add(allBindings, this.keyBinding);
    }
    
    public EssentialKeybinding withInitialPress(final Runnable runnable) {
        this.onInitialPress = runnable;
        return this;
    }
    
    public EssentialKeybinding requiresEssentialFull() {
        this.requiresEssentialFull = true;
        return this;
    }
    
    public EssentialKeybinding withRelease(final Runnable runnable) {
        this.onRelease = runnable;
        return this;
    }
    
    public EssentialKeybinding withRepeatedHold(final Runnable runnable) {
        this.onRepeatedHold = runnable;
        return this;
    }
    
    public void tickEvents() {
        if (this.alwaysTick) {
            this.tickMainMenu();
        }
        else if (GuiUtil.getOpenedScreen() instanceof TitleScreen ^ false) {
            this.tickMainMenu();
        }
        else if (UMinecraft.getWorld() != null) {
            this.tickWorld();
        }
    }
    
    private void tickMainMenu() {
        if (this.getRequiresEssentialFull() && !EssentialConfig.INSTANCE.getEssentialFull()) {
            return;
        }
        final int keyCode = this.getKeyCode();
        final boolean keyDown = keyCode != UKeyboard.KEY_NONE && UKeyboard.isKeyDown(keyCode);
        if (!this.pressed && keyDown) {
            this.pressed = true;
            if (this.onInitialPress != null) {
                this.onInitialPress.run();
            }
        }
        else if (this.pressed && keyDown) {
            if (this.onRepeatedHold != null) {
                this.onRepeatedHold.run();
            }
        }
        else if (this.pressed) {
            this.pressed = false;
            if (this.onRelease != null) {
                this.onRelease.run();
            }
        }
    }
    
    private void tickWorld() {
        if (this.getRequiresEssentialFull() && !EssentialConfig.INSTANCE.getEssentialFull()) {
            return;
        }
        if (this.keyBinding.wasPressed() && this.onInitialPress != null) {
            this.onInitialPress.run();
        }
        else if (this.keyBinding.isPressed() && this.onRepeatedHold != null) {
            this.onRepeatedHold.run();
        }
        else if (this.pressed && !this.keyBinding.isPressed() && this.onRelease != null) {
            this.onRelease.run();
        }
        this.pressed = this.keyBinding.isPressed();
    }
    
    public boolean isRegisteredWithMinecraft() {
        return this.registeredWithMinecraft;
    }
    
    public void unregister() {
        if (!this.registeredWithMinecraft) {
            return;
        }
        final GameOptions settings = MinecraftClient.getInstance().options;
        final int i = ArrayUtils.indexOf(settings.allKeys, this.keyBinding);
        if (i > 0) {
            ((GameOptionsAccessor)settings).setKeyBindings(ArrayUtils.removeAll(settings.allKeys, i));
        }
        KeyBindingAccessor.getKeybinds().remove(this.keyBinding.getTranslationKey());
        KeyBinding.updateKeysByCode();
        this.registeredWithMinecraft = false;
    }
    
    public String getRequiresUnlocked() {
        return this.requiresUnlocked;
    }
    
    public Supplier<Boolean> getCustomUnlockStatus() {
        return this.customUnlockStatus;
    }
    
    public boolean getRequiresEssentialFull() {
        return this.requiresEssentialFull;
    }
    
    static {
        ALL_BINDS = new ArrayList<EssentialKeybinding>();
        LEGACY_IDS = ImmutableMap.builder().build();
    }
}
