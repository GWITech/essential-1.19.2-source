package gg.essential.gui.common.input;

import kotlin.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000\f
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0010
                                                   \u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007""" }, d2 = { "Lgg/essential/gui/common/input/AbstractTextInput$SelectionMode;", "", "(Ljava/lang/String;I)V", "None", "Character", "Word", "Line", "essential" })
public enum SelectionMode
{
    None("None", 0), 
    Character("Character", 1), 
    Word("Word", 2), 
    Line("Line", 3);
    
    private static final /* synthetic */ SelectionMode[] $VALUES;
    
    private SelectionMode(final String $enum$name, final int $enum$ordinal) {
    }
    
    public static SelectionMode[] values() {
        return SelectionMode.$VALUES.clone();
    }
    
    public static SelectionMode valueOf(final String value) {
        return Enum.valueOf(SelectionMode.class, value);
    }
    
    private static final /* synthetic */ SelectionMode[] $values() {
        return new SelectionMode[] { SelectionMode.None, SelectionMode.Character, SelectionMode.Word, SelectionMode.Line };
    }
    
    static {
        $VALUES = $values();
    }
}
