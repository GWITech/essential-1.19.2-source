package gg.essential.loader.stage2.components;

import java.util.function.*;
import javax.swing.plaf.nimbus.*;
import java.net.*;
import java.util.*;
import javax.imageio.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.io.*;

public interface EssentialStyle
{
    public static final Color COLOR_BACKGROUND = new Color(24, 24, 24);
    public static final Color COLOR_FOREGROUND = new Color(152, 166, 174);
    public static final Color COLOR_HIGHLIGHT = new Color(227, 245, 255);
    public static final Color COLOR_OUTLINE = new Color(64, 64, 64);
    public static final Color COLOR_PROGRESS_FILL = new Color(10, 130, 253);
    public static final Color COLOR_BUTTON = new Color(102, 102, 102);
    public static final Color COLOR_BUTTON_HOVER = EssentialStyle.COLOR_PROGRESS_FILL;
    
    default JFrame makeFrame(final Consumer<JFrame> onExit) {
        try {
            UIManager.setLookAndFeel(NimbusLookAndFeel.class.getName());
        }
        catch (final Exception ex) {}
        final JFrame frame = new JFrame();
        frame.setTitle("Updating Essential...");
        try {
            final boolean isMacOS = System.getProperty("os.name", "unknown").toLowerCase(Locale.ROOT).startsWith("mac");
            final String path = "/assets/essential-loader-stage2/icon" + (isMacOS ? ".macos" : "") + ".png";
            frame.setIconImage(ImageIO.read(Objects.requireNonNull(this.getClass().getResource(path))));
        }
        catch (final IOException e) {
            e.printStackTrace();
        }
        frame.setUndecorated(true);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(0);
        frame.addWindowListener(new WindowAdapter() {
            final /* synthetic */ Consumer val$onExit;
            final /* synthetic */ JFrame val$frame;
            final /* synthetic */ EssentialStyle this$0;
            
            EssentialStyle$1() {
                this.this$0 = this$0;
                super();
            }
            
            @Override
            public void windowClosing(final WindowEvent e) {
                onExit.accept(frame);
            }
        });
        MotionFrame.addMotion(frame);
        final Container container = frame.getContentPane();
        container.setBackground(EssentialStyle.COLOR_BACKGROUND);
        container.setLayout(null);
        return frame;
    }
    
    default JPanel makeContentWithLogo(final JFrame frame) {
        final JPanel contentPane = new JPanel();
        contentPane.setBackground(EssentialStyle.COLOR_BACKGROUND);
        contentPane.setLayout(new BoxLayout(contentPane, 3));
        frame.getContentPane().add(contentPane);
        frame.getContentPane().setLayout(new BoxLayout(frame.getContentPane(), 3));
        try {
            final Image icon = ImageIO.read(Objects.requireNonNull(this.getClass().getResource("/assets/essential-loader-stage2/essential.png")));
            final JLabel label = new JLabel(new ImageIcon(icon));
            label.setBorder(new EmptyBorder(26, 0, 26, 0));
            label.setAlignmentX(0.5f);
            contentPane.add(label);
        }
        catch (final IOException e) {
            e.printStackTrace();
        }
        return contentPane;
    }
    
    default String withColor(final Color color, final String str) {
        final String red = Integer.toHexString(color.getRed());
        final String green = Integer.toHexString(color.getGreen());
        final String blue = Integer.toHexString(color.getBlue());
        return "<font color=\"#" + red + green + blue + "\">" + str + "</font>";
    }
    
    public static class Fonts
    {
        public static final Font medium;
        public static final Font semiBold;
        
        public Fonts() {
            super();
        }
        
        private static Font createFont(final String path, final int format) {
            try (final InputStream stream = Fonts.class.getResourceAsStream(path)) {
                final Font font = Font.createFont(format, stream);
                GraphicsEnvironment.getLocalGraphicsEnvironment().registerFont(font);
                return font;
            }
            catch (final IOException | FontFormatException e) {
                e.printStackTrace();
                return null;
            }
        }
        
        static {
            medium = createFont("/assets/essential-loader-stage2/Gilroy-Medium.otf", 0);
            semiBold = createFont("/assets/essential-loader-stage2/Gilroy-SemiBold.otf", 0);
        }
    }
}
