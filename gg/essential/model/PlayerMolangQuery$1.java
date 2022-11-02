package gg.essential.model;

import gg.essential.event.render.*;
import gg.essential.lib.kbrewster.eventbus.*;

class PlayerMolangQuery$1 {
    PlayerMolangQuery$1() {
        super();
    }
    
    @Subscribe
    private void renderWorld(final RenderTickEvent event) {
        PlayerMolangQuery.partialTicksMenu = event.getPartialTicksMenu();
        PlayerMolangQuery.partialTicksInGame = event.getPartialTicksInGame();
    }
}