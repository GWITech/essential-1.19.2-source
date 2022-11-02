package gg.essential.cosmetics;

import java.util.concurrent.*;
import gg.essential.model.*;
import gg.essential.network.cosmetics.*;

private static class ModelInformation
{
    private final CompletableFuture<BedrockModel> future;
    private final Cosmetic cosmetic;
    
    public ModelInformation(final Cosmetic cosmetic, final CompletableFuture<BedrockModel> future) {
        super();
        this.future = future;
        this.cosmetic = cosmetic;
    }
}
