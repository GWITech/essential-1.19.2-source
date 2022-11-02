package gg.essential.model.backend.minecraft;

import kotlin.*;
import net.minecraft.client.render.entity.*;
import org.jetbrains.annotations.*;
import gg.essential.model.backend.*;
import kotlin.jvm.internal.*;
import net.minecraft.client.render.entity.model.*;
import net.minecraft.client.model.*;
import gg.essential.mixins.ext.client.model.geom.*;

@Metadata(mv = { 1, 6, 0 }, k = 2, xi = 48, d1 = { """
                                                   \u0000"
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\u00022
                                                   \u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0006\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00072\u0006\u0010\u0005\u001a\u00020\bH\u0002\u001a\f\u0010	\u001a\u00020\u0007*\u00020\bH\u0002\u001a
                                                   \u0010	\u001a\u00020\u0002*\u00020\u0004\u001a\u000e\u0010	\u001a\u00020\u0002*\u0006\u0012\u0002\b\u00030\u0006¨\u0006
                                                   """ }, d2 = { "applyTo", "", "Lgg/essential/model/backend/PlayerPose;", "renderer", "Lnet/minecraft/client/render/entity/PlayerEntityRenderer;", "model", "Lnet/minecraft/client/render/entity/model/BipedEntityModel;", "Lgg/essential/model/backend/PlayerPose$Part;", "Lnet/minecraft/client/model/ModelPart;", "toPose", "essential" })
public final class PlayerPoseKt
{
    @NotNull
    public static final PlayerPose toPose(@NotNull final PlayerEntityRenderer $this$toPose) {
        Intrinsics.checkNotNullParameter((Object)$this$toPose, "<this>");
        final EntityModel method_4038 = $this$toPose.method_4038();
        Intrinsics.checkNotNullExpressionValue((Object)method_4038, "model");
        return toPose((BipedEntityModel<?>)method_4038);
    }
    
    @NotNull
    public static final PlayerPose toPose(@NotNull final BipedEntityModel<?> $this$toPose) {
        Intrinsics.checkNotNullParameter((Object)$this$toPose, "<this>");
        final ModelPart head = $this$toPose.head;
        Intrinsics.checkNotNullExpressionValue((Object)head, "head");
        final PlayerPose.Part pose = toPose(head);
        final ModelPart body = $this$toPose.body;
        Intrinsics.checkNotNullExpressionValue((Object)body, "body");
        final PlayerPose.Part pose2 = toPose(body);
        final ModelPart rightArm = $this$toPose.rightArm;
        Intrinsics.checkNotNullExpressionValue((Object)rightArm, "rightArm");
        final PlayerPose.Part pose3 = toPose(rightArm);
        final ModelPart leftArm = $this$toPose.leftArm;
        Intrinsics.checkNotNullExpressionValue((Object)leftArm, "leftArm");
        final PlayerPose.Part pose4 = toPose(leftArm);
        final ModelPart rightLeg = $this$toPose.rightLeg;
        Intrinsics.checkNotNullExpressionValue((Object)rightLeg, "rightLeg");
        final PlayerPose.Part pose5 = toPose(rightLeg);
        final ModelPart leftLeg = $this$toPose.leftLeg;
        Intrinsics.checkNotNullExpressionValue((Object)leftLeg, "leftLeg");
        return new PlayerPose(pose, pose2, pose3, pose4, pose5, toPose(leftLeg), $this$toPose.field_3448);
    }
    
    private static final PlayerPose.Part toPose(final ModelPart $this$toPose) {
        return new PlayerPose.Part($this$toPose.pivotX, $this$toPose.pivotY, $this$toPose.pivotZ, $this$toPose.pitch, $this$toPose.yaw, $this$toPose.roll, ((ExtraTransformHolder)$this$toPose).getExtra());
    }
    
    public static final void applyTo(@NotNull final PlayerPose $this$applyTo, @NotNull final BipedEntityModel<?> model) {
        Intrinsics.checkNotNullParameter((Object)$this$applyTo, "<this>");
        Intrinsics.checkNotNullParameter((Object)model, "model");
        final PlayerPose.Part head = $this$applyTo.getHead();
        final ModelPart head2 = model.head;
        Intrinsics.checkNotNullExpressionValue((Object)head2, "model.head");
        applyTo(head, head2);
        final PlayerPose.Part head3 = $this$applyTo.getHead();
        final ModelPart hat = model.hat;
        Intrinsics.checkNotNullExpressionValue((Object)hat, "model.hat");
        applyTo(head3, hat);
        final PlayerPose.Part body = $this$applyTo.getBody();
        final ModelPart body2 = model.body;
        Intrinsics.checkNotNullExpressionValue((Object)body2, "model.body");
        applyTo(body, body2);
        final PlayerPose.Part rightArm = $this$applyTo.getRightArm();
        final ModelPart rightArm2 = model.rightArm;
        Intrinsics.checkNotNullExpressionValue((Object)rightArm2, "model.rightArm");
        applyTo(rightArm, rightArm2);
        final PlayerPose.Part leftArm = $this$applyTo.getLeftArm();
        final ModelPart leftArm2 = model.leftArm;
        Intrinsics.checkNotNullExpressionValue((Object)leftArm2, "model.leftArm");
        applyTo(leftArm, leftArm2);
        final PlayerPose.Part rightLeg = $this$applyTo.getRightLeg();
        final ModelPart rightLeg2 = model.rightLeg;
        Intrinsics.checkNotNullExpressionValue((Object)rightLeg2, "model.rightLeg");
        applyTo(rightLeg, rightLeg2);
        final PlayerPose.Part leftLeg = $this$applyTo.getLeftLeg();
        final ModelPart leftLeg2 = model.leftLeg;
        Intrinsics.checkNotNullExpressionValue((Object)leftLeg2, "model.leftLeg");
        applyTo(leftLeg, leftLeg2);
        model.field_3448 = $this$applyTo.getChild();
    }
    
    private static final void applyTo(final PlayerPose.Part $this$applyTo, final ModelPart model) {
        model.pivotX = $this$applyTo.getPivotX();
        model.pivotY = $this$applyTo.getPivotY();
        model.pivotZ = $this$applyTo.getPivotZ();
        model.pitch = $this$applyTo.getRotateAngleX();
        model.yaw = $this$applyTo.getRotateAngleY();
        model.roll = $this$applyTo.getRotateAngleZ();
        ((ExtraTransformHolder)model).setExtra($this$applyTo.getExtra());
    }
}
