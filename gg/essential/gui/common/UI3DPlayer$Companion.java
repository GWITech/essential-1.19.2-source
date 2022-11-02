package gg.essential.gui.common;

import kotlin.*;
import gg.essential.mod.cosmetics.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000.
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0000
                                                   \u0002\b\u0002
                                                   \u0002\u0010\u0006
                                                   \u0000
                                                   \u0002\u0010\u0007
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0005
                                                   \u0002\u0010\u000b
                                                   \u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002
                                                   \u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002
                                                   \u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002
                                                   \u0000R\u001b\u0010	\u001a\u00020
                                                   8BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u0012\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0002
                                                   \u0000R\u000e\u0010\u0011\u001a\u00020\u0006X\u0082T¢\u0006\u0002
                                                   \u0000R\u000e\u0010\u0012\u001a\u00020\u0006X\u0082T¢\u0006\u0002
                                                   \u0000¨\u0006\u0013""" }, d2 = { "Lgg/essential/gui/common/UI3DPlayer$Companion;", "", "()V", "MAGIC_HEIGHT_SCALING_FACTOR", "", "PADDING_FACTOR", "", "current", "Lgg/essential/gui/common/UI3DPlayer;", "fallbackCosmeticsService", "Lgg/essential/mod/cosmetics/CosmeticsService;", "getFallbackCosmeticsService", "()Lgg/essential/mod/cosmetics/CosmeticsService;", "fallbackCosmeticsService$delegate", "Lkotlin/Lazy;", "isRenderingPerspective", "", "playerHeight", "playerWidth", "essential" })
public static final class Companion
{
    private Companion() {
        super();
    }
    
    private final CosmeticsService getFallbackCosmeticsService() {
        return (CosmeticsService)UI3DPlayer.access$getFallbackCosmeticsService$delegate$cp().getValue();
    }
    
    public static final /* synthetic */ CosmeticsService access$getFallbackCosmeticsService(final Companion $this) {
        return $this.getFallbackCosmeticsService();
    }
    
    public Companion(final byte b) {
        this();
    }
}
