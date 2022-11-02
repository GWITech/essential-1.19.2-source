package gg.essential.cosmetics.skinmask;

public class ModelMaskInstance
{
    byte[] data;
    SkinPartSetting[] settings;
    
    public ModelMaskInstance(final byte[] data, final SkinPartSetting[] settings) {
        super();
        this.data = data;
        this.settings = settings;
    }
}
