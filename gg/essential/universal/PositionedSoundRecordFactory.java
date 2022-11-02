package gg.essential.universal;

import net.minecraft.sound.*;
import net.minecraft.client.sound.*;

class PositionedSoundRecordFactory
{
    PositionedSoundRecordFactory() {
        super();
    }
    
    public static PositionedSoundInstance makeRecord(final SoundEvent event, final float volume, final float pitch) {
        return PositionedSoundInstance.master(event, pitch, volume);
    }
}
