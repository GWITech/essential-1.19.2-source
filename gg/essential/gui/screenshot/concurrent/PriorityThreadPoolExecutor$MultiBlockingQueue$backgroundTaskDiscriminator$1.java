package gg.essential.gui.screenshot.concurrent;

import kotlin.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000\u0011
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0002
                                                   \u0002\b\u0002*\u0001\u0000\b
                                                   \u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004""" }, d2 = { "gg/essential/gui/screenshot/concurrent/PriorityThreadPoolExecutor$MultiBlockingQueue$backgroundTaskDiscriminator$1", "Lgg/essential/gui/screenshot/concurrent/PrioritizedCallable;", "", "call", "essential" })
public static final class PriorityThreadPoolExecutor$MultiBlockingQueue$backgroundTaskDiscriminator$1 extends PrioritizedCallable<Unit> {
    PriorityThreadPoolExecutor$MultiBlockingQueue$backgroundTaskDiscriminator$1() {
        super(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE);
    }
    
    @Override
    public /* bridge */ Object call() {
        return Unit.INSTANCE;
    }
}