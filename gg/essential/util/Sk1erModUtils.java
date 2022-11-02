package gg.essential.util;

public class Sk1erModUtils
{
    public static boolean isOldModCorePresent() {
        try {
            Class.forName("club.sk1er.mods.core.ModCore");
            return true;
        }
        catch (final ClassNotFoundException ex) {
            return false;
        }
    }
}
