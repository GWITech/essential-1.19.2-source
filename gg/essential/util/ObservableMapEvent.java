package gg.essential.util;

import kotlin.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000\u001e
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0010\u0000
                                                   \u0002\b\u0004
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000\b6\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003:\u0003\u0005\u0006\u0007B\u0007\b\u0004¢\u0006\u0002\u0010\u0004\u0082\u0001\u0003\b	
                                                   ¨\u0006\u000b""" }, d2 = { "Lgg/essential/util/ObservableMapEvent;", "K", "V", "", "()V", "Add", "Clear", "Remove", "Lgg/essential/util/ObservableMapEvent$Add;", "Lgg/essential/util/ObservableMapEvent$Remove;", "Lgg/essential/util/ObservableMapEvent$Clear;", "essential" })
public abstract class ObservableMapEvent<K, V>
{
    private ObservableMapEvent() {
        super();
    }
    
    public ObservableMapEvent(final byte b) {
        this();
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                       \u0000\u0010
                                                       \u0002\u0018\u0002
                                                       \u0002\b\u0002
                                                       \u0002\u0018\u0002
                                                       \u0002\b\u0002\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004¨\u0006\u0005""" }, d2 = { "Lgg/essential/util/ObservableMapEvent$Clear;", "K", "V", "Lgg/essential/util/ObservableMapEvent;", "()V", "essential" })
    public static final class Clear<K, V> extends ObservableMapEvent<K, V>
    {
        public Clear() {
            super((byte)0);
        }
    }
}
