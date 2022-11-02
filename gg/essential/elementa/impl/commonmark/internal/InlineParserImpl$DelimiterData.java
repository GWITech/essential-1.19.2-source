package gg.essential.elementa.impl.commonmark.internal;

import java.util.*;
import gg.essential.elementa.impl.commonmark.node.*;

private static class DelimiterData
{
    final List<Text> characters;
    final boolean canClose;
    final boolean canOpen;
    
    DelimiterData(final List<Text> characters, final boolean canOpen, final boolean canClose) {
        super();
        this.characters = characters;
        this.canOpen = canOpen;
        this.canClose = canClose;
    }
}
