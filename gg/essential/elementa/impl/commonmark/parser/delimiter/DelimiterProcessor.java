package gg.essential.elementa.impl.commonmark.parser.delimiter;

public interface DelimiterProcessor
{
    char getOpeningCharacter();
    
    char getClosingCharacter();
    
    int getMinLength();
    
    int process(final DelimiterRun p0, final DelimiterRun p1);
}
