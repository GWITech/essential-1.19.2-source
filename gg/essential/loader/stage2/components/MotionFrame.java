package gg.essential.loader.stage2.components;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MotionFrame
{
    public MotionFrame() {
        super();
    }
    
    public static void addMotion(final JFrame parent) {
        final Point[] initialClick = { null };
        parent.addMouseListener(new MouseAdapter() {
            final /* synthetic */ Point[] val$initialClick;
            final /* synthetic */ JFrame val$parent;
            
            MotionFrame$1() {
                super();
            }
            
            @Override
            public void mousePressed(final MouseEvent e) {
                initialClick[0] = e.getPoint();
                parent.getComponentAt(initialClick[0]);
            }
        });
        parent.addMouseMotionListener(new MouseMotionAdapter() {
            final /* synthetic */ JFrame val$parent;
            final /* synthetic */ Point[] val$initialClick;
            
            MotionFrame$2() {
                super();
            }
            
            @Override
            public void mouseDragged(final MouseEvent e) {
                final int thisX = parent.getLocation().x;
                final int thisY = parent.getLocation().y;
                final int xMoved = thisX + e.getX() - (thisX + initialClick[0].x);
                final int yMoved = thisY + e.getY() - (thisY + initialClick[0].y);
                final int X = thisX + xMoved;
                final int Y = thisY + yMoved;
                parent.setLocation(X, Y);
            }
        });
    }
}
