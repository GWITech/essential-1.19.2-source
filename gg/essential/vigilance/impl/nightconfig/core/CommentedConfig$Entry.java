package gg.essential.vigilance.impl.nightconfig.core;

public interface Entry extends Config.Entry, UnmodifiableCommentedConfig.Entry
{
    String setComment(final String p0);
    
    String removeComment();
}
