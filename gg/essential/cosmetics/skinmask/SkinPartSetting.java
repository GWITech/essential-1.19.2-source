package gg.essential.cosmetics.skinmask;

import kotlin.*;
import gg.essential.model.*;
import kotlin.jvm.internal.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0002\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0007H\u00c6\u0003J;\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u0018\u001a\u00020\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001a\u001a\u00020\u0007H\u00d6\u0001J\t\u0010\u001b\u001a\u00020\u001cH\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u001d" }, d2 = { "Lgg/essential/cosmetics/skinmask/SkinPartSetting;", "", "part", "Lgg/essential/model/EnumPart;", "isHidden", "", "shiftX", "", "shiftY", "shiftZ", "(Lgg/essential/model/EnumPart;ZIII)V", "()Z", "getPart", "()Lgg/essential/model/EnumPart;", "getShiftX", "()I", "getShiftY", "getShiftZ", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "", "cosmetics" })
public final class SkinPartSetting
{
    @NotNull
    private final EnumPart part;
    private final boolean isHidden;
    private final int shiftX;
    private final int shiftY;
    private final int shiftZ;
    
    public SkinPartSetting(@NotNull final EnumPart part, final boolean isHidden, final int shiftX, final int shiftY, final int shiftZ) {
        Intrinsics.checkNotNullParameter((Object)part, "part");
        super();
        this.part = part;
        this.isHidden = isHidden;
        this.shiftX = shiftX;
        this.shiftY = shiftY;
        this.shiftZ = shiftZ;
    }
    
    @NotNull
    public final EnumPart getPart() {
        return this.part;
    }
    
    public final boolean isHidden() {
        return this.isHidden;
    }
    
    public final int getShiftX() {
        return this.shiftX;
    }
    
    public final int getShiftY() {
        return this.shiftY;
    }
    
    public final int getShiftZ() {
        return this.shiftZ;
    }
    
    @NotNull
    @Override
    public String toString() {
        return "SkinPartSetting(part=" + this.part + ", isHidden=" + this.isHidden + ", shiftX=" + this.shiftX + ", shiftY=" + this.shiftY + ", shiftZ=" + this.shiftZ + ')';
    }
    
    @Override
    public int hashCode() {
        int result = this.part.hashCode();
        final int n = result * 31;
        int isHidden;
        if ((isHidden = (this.isHidden ? 1 : 0)) != 0) {
            isHidden = 1;
        }
        result = n + isHidden;
        result = result * 31 + Integer.hashCode(this.shiftX);
        result = result * 31 + Integer.hashCode(this.shiftY);
        result = result * 31 + Integer.hashCode(this.shiftZ);
        return result;
    }
    
    @Override
    public boolean equals(@Nullable final Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SkinPartSetting)) {
            return false;
        }
        final SkinPartSetting skinPartSetting = (SkinPartSetting)other;
        return this.part == skinPartSetting.part && this.isHidden == skinPartSetting.isHidden && this.shiftX == skinPartSetting.shiftX && this.shiftY == skinPartSetting.shiftY && this.shiftZ == skinPartSetting.shiftZ;
    }
}
