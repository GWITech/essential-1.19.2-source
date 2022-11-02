package gg.essential.vigilance.impl.nightconfig.core.io;

import java.util.function.*;
import gg.essential.vigilance.impl.nightconfig.core.*;
import java.util.*;
import gg.essential.vigilance.impl.nightconfig.core.utils.*;

public enum ParsingMode
{
    REPLACE(Config::clear, Config::set, Map::put), 
    MERGE(c -> {}, Config::set, Map::put), 
    ADD(c -> {}, (cfg, path, value) -> {
        cfg.add(path, value);
        return null;
    }, Map::putIfAbsent);
    
    private final Consumer<? super Config> preparationAction;
    private final PutAction putAction;
    private final MapPutAction mapPutAction;
    private static final /* synthetic */ ParsingMode[] $VALUES;
    
    public static ParsingMode[] values() {
        return ParsingMode.$VALUES.clone();
    }
    
    public static ParsingMode valueOf(final String name) {
        return Enum.valueOf(ParsingMode.class, name);
    }
    
    private ParsingMode(final Consumer<? super Config> preparationAction, final PutAction putAction, final MapPutAction mapPutAction) {
        this.preparationAction = preparationAction;
        this.putAction = putAction;
        this.mapPutAction = mapPutAction;
    }
    
    public void prepareParsing(final Config config) {
        this.preparationAction.accept(config);
    }
    
    public Object put(final Config config, final List<String> key, final Object value) {
        return this.putAction.put(config, key, value);
    }
    
    public Object put(final Config config, final String key, final Object value) {
        return this.putAction.put(config, key, value);
    }
    
    public Object put(final Map<String, Object> map, final String key, final Object value) {
        return this.mapPutAction.put(map, key, value);
    }
    
    private static /* synthetic */ Object lambda$static$2(final Config cfg, final List path, final Object value) {
        cfg.add(path, value);
        return null;
    }
    
    private static /* synthetic */ void lambda$static$1(final Config c) {
    }
    
    private static /* synthetic */ void lambda$static$0(final Config c) {
    }
    
    static {
        $VALUES = new ParsingMode[] { ParsingMode.REPLACE, ParsingMode.MERGE, ParsingMode.ADD };
    }
    
    @FunctionalInterface
    private interface PutAction
    {
        Object put(final Config p0, final List<String> p1, final Object p2);
        
        default Object put(final Config config, final String key, final Object value) {
            return this.put(config, StringUtils.split(key, '.'), value);
        }
    }
    
    @FunctionalInterface
    private interface MapPutAction
    {
        Object put(final Map<String, Object> p0, final String p1, final Object p2);
    }
}
