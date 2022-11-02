package gg.essential.gui.about.components;

import gg.essential.elementa.components.*;
import kotlin.*;
import java.util.*;
import gg.essential.data.*;
import kotlin.jvm.internal.*;
import gg.essential.gui.common.shadow.*;
import java.awt.*;
import gg.essential.gui.*;
import gg.essential.elementa.constraints.*;
import gg.essential.elementa.font.*;
import gg.essential.elementa.dsl.*;
import gg.essential.elementa.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000\f
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003""" }, d2 = { "Lgg/essential/gui/about/components/VersionInfo;", "Lgg/essential/elementa/components/UIContainer;", "()V", "essential" })
public final class VersionInfo extends UIContainer
{
    public VersionInfo() {
        super();
        final StringJoiner joiner = new StringJoiner("\n");
        joiner.add((CharSequence)("Essential Mod v" + VersionData.INSTANCE.getEssentialVersion()));
        joiner.add((CharSequence)("#" + VersionData.INSTANCE.getEssentialCommit()));
        joiner.add(VersionData.INSTANCE.formatPlatform(VersionData.INSTANCE.getEssentialPlatform()));
        final String string = joiner.toString();
        Intrinsics.checkNotNullExpressionValue((Object)string, "joiner.toString()");
        final UIComponent $this$constrain_u24lambda_u2d0$iv;
        final UIComponent $this$constrain$iv = $this$constrain_u24lambda_u2d0$iv = new EssentialUIWrappedText(string, false, null, false, null, 0.0f, 126);
        final UIConstraints $this$_init__u24lambda_u2d0 = $this$constrain_u24lambda_u2d0$iv.getConstraints();
        $this$_init__u24lambda_u2d0.setColor(UtilitiesKt.toConstraint(EssentialPalette.TEXT));
        final UIConstraints uiConstraints = $this$_init__u24lambda_u2d0;
        final String string2 = joiner.toString();
        Intrinsics.checkNotNullExpressionValue((Object)string2, "joiner.toString()");
        uiConstraints.setWidth(UtilitiesKt.getPixels(UtilitiesKt.width$default(string2, 0.0f, null, 3, null)));
        ComponentsKt.childOf($this$constrain_u24lambda_u2d0$iv, this);
    }
}
