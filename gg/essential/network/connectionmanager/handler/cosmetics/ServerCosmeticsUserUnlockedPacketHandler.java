package gg.essential.network.connectionmanager.handler.cosmetics;

import gg.essential.network.connectionmanager.handler.*;
import gg.essential.connectionmanager.common.packet.cosmetic.*;
import gg.essential.network.connectionmanager.*;
import org.jetbrains.annotations.*;
import gg.essential.gui.studio.*;
import gg.essential.gui.notification.*;
import kotlin.*;
import kotlin.jvm.functions.*;
import gg.essential.network.connectionmanager.cosmetics.*;
import java.util.*;
import gg.essential.network.cosmetics.*;
import gg.essential.connectionmanager.common.packet.*;
import gg.essential.gui.*;
import gg.essential.elementa.components.*;
import gg.essential.elementa.*;
import gg.essential.gui.common.*;
import gg.essential.elementa.constraints.*;
import gg.essential.api.gui.*;

public class ServerCosmeticsUserUnlockedPacketHandler extends PacketHandler<ServerCosmeticsUserUnlockedPacket>
{
    public ServerCosmeticsUserUnlockedPacketHandler() {
        super();
    }
    
    @Override
    protected void onHandle(@NotNull final ConnectionManager connectionManager, @NotNull final ServerCosmeticsUserUnlockedPacket packet) {
        final CosmeticsManager cosmeticsManager = connectionManager.getCosmeticsManager();
        final Set<String> unlockedCosmetics = cosmeticsManager.getUnlockedCosmetics();
        final Set<String> newCosmetics = new HashSet<String>();
        for (final String s : packet.getUnlocked()) {
            if (!unlockedCosmetics.contains(s)) {
                newCosmetics.add(s);
            }
        }
        cosmeticsManager.addUnlockedCosmetics(packet.getUnlocked());
        if (!packet.occurredFromPurchase()) {
            cosmeticsManager.getCapeManager().unlockMissingCapesAsync();
        }
        final CosmeticStudio openGui = CosmeticStudio.getInstance();
        if (openGui != null) {
            openGui.processPurchase(newCosmetics);
        }
        if (packet.occurredFromPurchase()) {
            for (String newCosmetic : newCosmetics) {
                final Cosmetic cosmetic = cosmeticsManager.getCosmetic(newCosmetic);
                if (cosmetic != null) {
                    Notifications.INSTANCE.push("Essential Store", "Your purchase of " + cosmetic.getDisplayName("en_us") + " has been processed.", 4.0f, (Function0<Unit>)(() -> Unit.INSTANCE), (Function0<Unit>)(() -> Unit.INSTANCE), (Function1<? super NotificationBuilder, Unit>)(notificationBuilder -> {
                        notificationBuilder.setElementaVersion(ElementaVersion.V1);
                        final UIContainer container = new UIContainer();
                        container.getConstraints().setWidth(new ChildBasedSizeConstraint());
                        container.getConstraints().setHeight(new AdditiveConstraint(new ChildBasedSizeConstraint(), new PixelConstraint(1.0f)));
                        final UIBlock block = new UIBlock(new ConstantColorConstraint(EssentialPalette.BUTTON));
                        block.getConstraints().setWidth(new PixelConstraint(26.0f));
                        block.getConstraints().setHeight(new AspectConstraint());
                        container.addChild(block);
                        final CosmeticPreview cosmeticPreview = new CosmeticPreview(cosmetic, (byte)0);
                        cosmeticPreview.getConstraints().setWidth(new FillConstraint());
                        cosmeticPreview.getConstraints().setHeight(new FillConstraint());
                        block.addChild(cosmeticPreview);
                        notificationBuilder.withCustomComponent(Slot.ACTION, container);
                        return Unit.INSTANCE;
                    }));
                }
            }
        }
    }
    
    @Override
    protected /* bridge */ void onHandle(@NotNull final ConnectionManager connectionManager, @NotNull final Packet packet) {
        this.onHandle(connectionManager, (ServerCosmeticsUserUnlockedPacket)packet);
    }
    
    private static /* synthetic */ Unit lambda$onHandle$2(final Cosmetic cosmetic, final NotificationBuilder notificationBuilder) {
        notificationBuilder.setElementaVersion(ElementaVersion.V1);
        final UIContainer container = new UIContainer();
        container.getConstraints().setWidth(new ChildBasedSizeConstraint());
        container.getConstraints().setHeight(new AdditiveConstraint(new ChildBasedSizeConstraint(), new PixelConstraint(1.0f)));
        final UIBlock block = new UIBlock(new ConstantColorConstraint(EssentialPalette.BUTTON));
        block.getConstraints().setWidth(new PixelConstraint(26.0f));
        block.getConstraints().setHeight(new AspectConstraint());
        container.addChild(block);
        final CosmeticPreview cosmeticPreview = new CosmeticPreview(cosmetic, (byte)0);
        cosmeticPreview.getConstraints().setWidth(new FillConstraint());
        cosmeticPreview.getConstraints().setHeight(new FillConstraint());
        block.addChild(cosmeticPreview);
        notificationBuilder.withCustomComponent(Slot.ACTION, container);
        return Unit.INSTANCE;
    }
    
    private static /* synthetic */ Unit lambda$onHandle$1() {
        return Unit.INSTANCE;
    }
    
    private static /* synthetic */ Unit lambda$onHandle$0() {
        return Unit.INSTANCE;
    }
}
