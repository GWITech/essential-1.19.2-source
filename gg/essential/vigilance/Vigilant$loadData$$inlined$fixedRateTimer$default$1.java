package gg.essential.vigilance;

import java.util.*;
import kotlin.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, d1 = { "\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004¸\u0006\u0000" }, d2 = { "kotlin/concurrent/TimersKt$timerTask$1", "Ljava/util/TimerTask;", "run", "", "kotlin-stdlib" })
public static final class Vigilant$loadData$$inlined$fixedRateTimer$default$1 extends TimerTask {
    final /* synthetic */ Vigilant this$0;
    
    public Vigilant$loadData$$inlined$fixedRateTimer$default$1(final Vigilant this$0) {
        this.this$0 = this$0;
        super();
    }
    
    @Override
    public void run() {
        final TimerTask $this$loadData_u24lambda_u2d0 = this;
        final int n = 0;
        this.this$0.writeData();
    }
}