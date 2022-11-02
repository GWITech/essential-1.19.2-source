package gg.essential.cosmetics;

import java.util.concurrent.*;
import java.util.*;
import net.minecraft.util.*;
import gg.essential.network.cosmetics.*;

private static class CapeInformation
{
    private final CompletableFuture<List<Identifier>> future;
    private final Cosmetic cosmetic;
    
    public CapeInformation(final Cosmetic cosmetic, final CompletableFuture<List<Identifier>> future) {
        super();
        this.future = future;
        this.cosmetic = cosmetic;
    }
}
