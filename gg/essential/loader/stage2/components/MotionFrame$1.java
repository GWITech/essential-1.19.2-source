package gg.essential.loader.stage2.components;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

static final class MotionFrame$1 extends MouseAdapter {
    final /* synthetic */ Point[] val$initialClick;
    final /* synthetic */ JFrame val$parent;
    
    MotionFrame$1(final Point[] val$initialClick, final JFrame val$parent) {
        this.val$initialClick = val$initialClick;
        this.val$parent = val$parent;
        super();
    }
    
    @Override
    public void mousePressed(final MouseEvent e) {
        this.val$initialClick[0] = e.getPoint();
        this.val$parent.getComponentAt(this.val$initialClick[0]);
    }
}