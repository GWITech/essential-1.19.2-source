package gg.essential.handlers;

import gg.essential.config.*;
import gg.essential.util.*;
import gg.essential.universal.*;
import net.minecraft.client.option.*;
import gg.essential.event.gui.*;
import gg.essential.lib.kbrewster.eventbus.*;
import gg.essential.elementa.constraints.animation.*;

public class ZoomHandler
{
    private static ZoomHandler instance;
    private boolean oldSmoothCamera;
    public boolean isZoomActive;
    public KeyBinding zoomKeybinding;
    private float currentModifier;
    private float desiredModifier;
    private float smoothZoomProgress;
    private boolean hasScrolledYet;
    private boolean zoomingOut;
    private long timeOfLastUpdate;
    private boolean isZoomToggled;
    private boolean isZoomBeingHeld;
    
    public ZoomHandler() {
        super();
        this.currentModifier = 4.0f;
        this.desiredModifier = this.currentModifier;
        this.smoothZoomProgress = 0.0f;
        this.hasScrolledYet = false;
        this.zoomingOut = false;
        this.timeOfLastUpdate = System.currentTimeMillis();
        this.isZoomToggled = false;
        this.isZoomBeingHeld = false;
    }
    
    public static ZoomHandler getInstance() {
        if (ZoomHandler.instance == null) {
            ZoomHandler.instance = new ZoomHandler();
        }
        return ZoomHandler.instance;
    }
    
    private boolean getZoomState() {
        if (!EssentialConfig.INSTANCE.getEssentialEnabled()) {
            return false;
        }
        final boolean down = this.zoomKeybinding.isPressed();
        if (!EssentialConfig.INSTANCE.getToggleToZoom()) {
            return down;
        }
        if (down) {
            if (this.isZoomBeingHeld) {
                return this.isZoomToggled;
            }
            this.isZoomBeingHeld = true;
            this.isZoomToggled = !this.isZoomToggled;
        }
        else {
            this.isZoomBeingHeld = false;
        }
        return this.isZoomToggled;
    }
    
    public float applyModifiers(float f) {
        if (OptiFineUtil.isLoaded()) {
            return f;
        }
        final GameOptions settings = UMinecraft.getSettings();
        if (UMinecraft.getMinecraft().currentScreen == null && this.getZoomState()) {
            if (!this.isZoomActive) {
                this.isZoomActive = true;
                this.timeOfLastUpdate = System.currentTimeMillis();
                if (EssentialConfig.INSTANCE.getZoomSmoothCamera()) {
                    this.oldSmoothCamera = settings.smoothCameraEnabled;
                    settings.smoothCameraEnabled = true;
                }
                final float n = 4.0f;
                this.desiredModifier = n;
                this.currentModifier = n;
            }
            f /= this.getZoomHeldModifier();
            if (EssentialConfig.INSTANCE.getSmoothZoomAnimation()) {
                f *= this.getConstantModifier();
            }
        }
        else {
            if (this.isZoomActive) {
                this.isZoomActive = false;
                this.hasScrolledYet = false;
                settings.smoothCameraEnabled = this.oldSmoothCamera;
                this.queueTerrainUpdate();
                this.zoomingOut = true;
            }
            if (this.zoomingOut) {
                if (EssentialConfig.INSTANCE.getSmoothZoomAnimation()) {
                    if (this.smoothZoomProgress > 0.0f) {
                        f *= this.getConstantModifier();
                    }
                    else {
                        this.zoomingOut = false;
                    }
                }
                else {
                    this.zoomingOut = false;
                }
            }
        }
        return f;
    }
    
    @Subscribe
    public void onMouseScroll(final MouseScrollEvent event) {
        if (!this.isZoomActive || !this.getZoomState() || event.getScreen() != null) {
            return;
        }
        event.setCancelled$1385ff();
        final double moved = event.getAmount();
        if (moved > 0.0) {
            this.smoothZoomProgress = 0.0f;
            this.hasScrolledYet = true;
            this.desiredModifier += 0.25f * this.desiredModifier;
        }
        else if (moved < 0.0) {
            this.smoothZoomProgress = 0.0f;
            this.hasScrolledYet = true;
            this.desiredModifier -= 0.25f * this.desiredModifier;
            this.queueTerrainUpdate();
        }
    }
    
    private float getZoomHeldModifier() {
        final long currentTime = System.currentTimeMillis();
        final long timeSinceLastUpdate = currentTime - this.timeOfLastUpdate;
        if (this.desiredModifier < 1.0f) {
            this.desiredModifier = 1.0f;
        }
        if (this.desiredModifier > 600.0f) {
            this.desiredModifier = 600.0f;
        }
        if (EssentialConfig.INSTANCE.getSmoothZoomAnimation()) {
            if (this.hasScrolledYet && this.smoothZoomProgress < 1.0f) {
                this.queueTerrainUpdate();
                this.smoothZoomProgress += 0.004f * timeSinceLastUpdate;
                this.smoothZoomProgress = ((this.smoothZoomProgress > 1.0f) ? 1.0f : this.smoothZoomProgress);
                return this.currentModifier += (this.desiredModifier - this.currentModifier) * this.calculateEasing(this.smoothZoomProgress);
            }
        }
        else {
            this.currentModifier = this.desiredModifier;
        }
        return this.desiredModifier;
    }
    
    private float getConstantModifier() {
        final long currentTime = System.currentTimeMillis();
        final long timeSinceLastUpdate = currentTime - this.timeOfLastUpdate;
        this.timeOfLastUpdate = currentTime;
        if (this.isZoomActive) {
            if (this.hasScrolledYet) {
                return 1.0f;
            }
            if (this.smoothZoomProgress < 1.0f) {
                this.smoothZoomProgress += 0.005f * timeSinceLastUpdate;
                this.smoothZoomProgress = ((this.smoothZoomProgress > 1.0f) ? 1.0f : this.smoothZoomProgress);
                return 4.0f - 3.0f * this.calculateEasing(this.smoothZoomProgress);
            }
        }
        else {
            if (this.hasScrolledYet) {
                this.hasScrolledYet = false;
                this.smoothZoomProgress = 1.0f;
            }
            if (this.smoothZoomProgress > 0.0f) {
                this.smoothZoomProgress -= 0.005f * timeSinceLastUpdate;
                this.smoothZoomProgress = ((this.smoothZoomProgress < 0.0f) ? 0.0f : this.smoothZoomProgress);
                this.queueTerrainUpdate();
                final float progress = 1.0f - this.smoothZoomProgress;
                final float diff = 1.0f / this.currentModifier;
                return diff + (1.0f - diff) * this.calculateEasing(progress);
            }
        }
        return 1.0f;
    }
    
    private void queueTerrainUpdate() {
        UMinecraft.getMinecraft().worldRenderer.scheduleTerrainUpdate();
    }
    
    private float calculateEasing(final float progress) {
        switch (EssentialConfig.INSTANCE.getSmoothZoomAlgorithm()) {
            case 0: {
                return Animations.IN_OUT_QUAD.getValue(progress);
            }
            case 1: {
                return Animations.IN_OUT_CIRCULAR.getValue(progress);
            }
            case 2: {
                return Animations.OUT_QUINT.getValue(progress);
            }
            default: {
                return Animations.IN_OUT_QUAD.getValue(progress);
            }
        }
    }
}
