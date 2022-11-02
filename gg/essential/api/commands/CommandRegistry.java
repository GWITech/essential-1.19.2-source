package gg.essential.api.commands;

import kotlin.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000&
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0000
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0003
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J*\u0010\u0006\u001a\u00020\u0003"\u0004\b\u0000\u0010\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00070	2\f\u0010
                                                   \u001a\b\u0012\u0004\u0012\u0002H\u00070\u000bH&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00f8\u0001\u0000\u0082\u0002\u0006
                                                   \u0004\b!0\u0001¨\u0006\u00c0\u0006\u0001""" }, d2 = { "Lgg/essential/api/commands/CommandRegistry;", "", "registerCommand", "", "command", "Lgg/essential/api/commands/Command;", "registerParser", "T", "type", "Ljava/lang/Class;", "parser", "Lgg/essential/api/commands/ArgumentParser;", "unregisterCommand", "essential-api" })
public interface CommandRegistry
{
    void registerCommand(@NotNull final Command p0);
    
     <T> void registerParser(@NotNull final Class<T> p0, @NotNull final ArgumentParser<T> p1);
    
    void unregisterCommand(@NotNull final Command p0);
}
