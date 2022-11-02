package gg.essential.network.connectionmanager.legacyjre;

public class LegacyJre
{
    public static final boolean IS_LEGACY_JRE_51;
    public static final boolean IS_LEGACY_JRE_74;
    
    static {
        IS_LEGACY_JRE_51 = "1.8.0_51".equals(System.getProperty("java.version"));
        IS_LEGACY_JRE_74 = "1.8.0_74".equals(System.getProperty("java.version"));
    }
}
