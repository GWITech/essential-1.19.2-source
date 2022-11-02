package gg.essential.universal;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import net.minecraft.client.sound.*;
import net.minecraft.sound.*;
import kotlin.jvm.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000"
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0000
                                                   \u0002\b\u0002
                                                   \u0002\u0010\u0002
                                                   \u0000
                                                   \u0002\u0010\u0007
                                                   \u0002\b\u0005
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u0007J\u0006\u0010\u0007\u001a\u00020\u0004J\u0006\u0010\b\u001a\u00020\u0004J\u0006\u0010	\u001a\u00020\u0004J\u001e\u0010
                                                   \u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u001a\u00020\u0006¨\u0006\u000e""" }, d2 = { "Lgg/essential/universal/USound;", "", "()V", "playButtonPress", "", "volume", "", "playExpSound", "playLevelupSound", "playPlingSound", "playSoundStatic", "event", "Lnet/minecraft/sound/SoundEvent;", "pitch", "universalcraft" })
public final class USound
{
    @NotNull
    public static final USound INSTANCE;
    
    private USound() {
        super();
    }
    
    public final void playSoundStatic(@NotNull final SoundEvent event, final float volume, final float pitch) {
        Intrinsics.checkNotNullParameter((Object)event, "event");
        final SoundManager soundManager = UMinecraft.getMinecraft().getSoundManager();
        if (soundManager == null) {
            return;
        }
        final SoundManager soundHandler = soundManager;
        final PositionedSoundInstance record = PositionedSoundRecordFactory.makeRecord(event, volume, pitch);
        if (record != null) {
            final PositionedSoundInstance it = record;
            final int n = 0;
            soundHandler.play((SoundInstance)it);
        }
    }
    
    @JvmOverloads
    public final void playButtonPress(final float volume) {
        final SoundEvent ui_BUTTON_CLICK = SoundEvents.UI_BUTTON_CLICK;
        Intrinsics.checkNotNullExpressionValue((Object)ui_BUTTON_CLICK, "UI_BUTTON_CLICK");
        this.playSoundStatic(ui_BUTTON_CLICK, volume, 1.0f);
    }
    
    public static /* synthetic */ void playButtonPress$default(final USound uSound, float volume, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            volume = 0.25f;
        }
        uSound.playButtonPress(volume);
    }
    
    public final void playExpSound() {
        final SoundEvent entity_EXPERIENCE_ORB_PICKUP = SoundEvents.ENTITY_EXPERIENCE_ORB_PICKUP;
        Intrinsics.checkNotNullExpressionValue((Object)entity_EXPERIENCE_ORB_PICKUP, "ENTITY_EXPERIENCE_ORB_PICKUP");
        this.playSoundStatic(entity_EXPERIENCE_ORB_PICKUP, 0.25f, 1.0f);
    }
    
    public final void playLevelupSound() {
        final SoundEvent entity_PLAYER_LEVELUP = SoundEvents.ENTITY_PLAYER_LEVELUP;
        Intrinsics.checkNotNullExpressionValue((Object)entity_PLAYER_LEVELUP, "ENTITY_PLAYER_LEVELUP");
        this.playSoundStatic(entity_PLAYER_LEVELUP, 0.25f, 1.0f);
    }
    
    public final void playPlingSound() {
        final SoundEvent block_NOTE_BLOCK_PLING = SoundEvents.BLOCK_NOTE_BLOCK_PLING;
        Intrinsics.checkNotNullExpressionValue((Object)block_NOTE_BLOCK_PLING, "BLOCK_NOTE_BLOCK_PLING");
        this.playSoundStatic(block_NOTE_BLOCK_PLING, 0.25f, 1.0f);
    }
    
    @JvmOverloads
    public final void playButtonPress() {
        playButtonPress$default(this, 0.0f, 1, null);
    }
    
    static {
        INSTANCE = new USound();
    }
}
