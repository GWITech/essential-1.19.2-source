package gg.essential.loader.stage2.components;

import java.awt.*;
import java.io.*;

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
