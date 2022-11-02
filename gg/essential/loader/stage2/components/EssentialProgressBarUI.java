package gg.essential.loader.stage2.components;

import javax.swing.plaf.basic.*;
import javax.swing.*;
import java.awt.*;

public class EssentialProgressBarUI extends BasicProgressBarUI
{
    private static final int STROKE_WIDTH = 3;
    
    public EssentialProgressBarUI() {
        super();
    }
    
    @Override
    protected void paintDeterminate(final Graphics g, final JComponent c) {
        final Graphics2D g2d = (Graphics2D)g.create();
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        final int width = this.progressBar.getWidth();
        final int height = this.progressBar.getHeight();
        final double percent = this.progressBar.getPercentComplete();
        final int innerWidth = (int)Math.round(width * percent);
        g2d.setColor(this.progressBar.getBackground());
        g2d.fillRect(0, 0, width, height);
        g2d.setColor(this.progressBar.getForeground());
        g2d.fillRect(0, 0, innerWidth, height);
        g2d.dispose();
    }
}
