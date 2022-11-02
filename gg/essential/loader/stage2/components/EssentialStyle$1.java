package gg.essential.loader.stage2.components;

import java.util.function.*;
import javax.swing.*;
import java.awt.event.*;

class EssentialStyle$1 extends WindowAdapter {
    final /* synthetic */ Consumer val$onExit;
    final /* synthetic */ JFrame val$frame;
    final /* synthetic */ EssentialStyle this$0;
    
    EssentialStyle$1(final EssentialStyle this$0, final Consumer val$onExit, final JFrame val$frame) {
        this.this$0 = this$0;
        this.val$onExit = val$onExit;
        this.val$frame = val$frame;
        super();
    }
    
    @Override
    public void windowClosing(final WindowEvent e) {
        this.val$onExit.accept(this.val$frame);
    }
}