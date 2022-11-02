package gg.essential.elementa.impl.commonmark.internal;

enum State
{
    START_DEFINITION, 
    LABEL, 
    DESTINATION, 
    START_TITLE, 
    TITLE, 
    PARAGRAPH;
    
    private static final /* synthetic */ State[] $VALUES;
    
    public static State[] values() {
        return State.$VALUES.clone();
    }
    
    public static State valueOf(final String name) {
        return Enum.valueOf(State.class, name);
    }
    
    static {
        $VALUES = new State[] { State.START_DEFINITION, State.LABEL, State.DESTINATION, State.START_TITLE, State.TITLE, State.PARAGRAPH };
    }
}
