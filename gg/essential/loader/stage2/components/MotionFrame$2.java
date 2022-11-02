package gg.essential.loader.stage2.components;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

static final class MotionFrame$2 extends MouseMotionAdapter {
    final /* synthetic */ JFrame val$parent;
    final /* synthetic */ Point[] val$initialClick;
    
    MotionFrame$2(final JFrame val$parent, final Point[] val$initialClick) {
        this.val$parent = val$parent;
        this.val$initialClick = val$initialClick;
        super();
    }
    
    @Override
    public void mouseDragged(final MouseEvent e) {
        final int thisX = this.val$parent.getLocation().x;
        final int thisY = this.val$parent.getLocation().y;
        final int xMoved = thisX + e.getX() - (thisX + this.val$initialClick[0].x);
        final int yMoved = thisY + e.getY() - (thisY + this.val$initialClick[0].y);
        final int X = thisX + xMoved;
        final int Y = thisY + yMoved;
        this.val$parent.setLocation(X, Y);
    }
}