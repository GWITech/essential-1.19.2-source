package gg.essential.gui.studio;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import javax.swing.*;
import javax.swing.filechooser.*;
import java.io.*;
import java.awt.*;
import kotlin.jvm.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000\u001e
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0000
                                                   \u0002\b\u0002
                                                   \u0002\u0010\u0002
                                                   \u0000
                                                   \u0002\u0010\u0011
                                                   \u0002\u0010\u000e
                                                   \u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001b\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007¢\u0006\u0002\u0010\b¨\u0006	""" }, d2 = { "Lgg/essential/gui/studio/ForkedFileChooser$Companion;", "", "()V", "main", "", "args", "", "", "([Ljava/lang/String;)V", "essential" })
public static final class Companion
{
    private Companion() {
        super();
    }
    
    @JvmStatic
    public final void main(@NotNull final String[] args) {
        Intrinsics.checkNotNullParameter((Object)args, "args");
        final DataOutputStream out = new DataOutputStream(System.out);
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        final JFileChooser it = new JFileChooser();
        it.setFileFilter(new FileNameExtensionFilter("Images", new String[] { "png" }));
        final JFileChooser fileChooser = it;
        while (true) {
            switch (System.in.read()) {
                case -1: {
                    return;
                }
                case 0: {
                    return;
                }
                case 1: {
                    fileChooser.setSelectedFile(null);
                    fileChooser.showOpenDialog(null);
                    final DataOutputStream dataOutputStream = out;
                    final File selectedFile = fileChooser.getSelectedFile();
                    dataOutputStream.writeUTF(String.valueOf((selectedFile != null) ? selectedFile.getAbsoluteFile() : null));
                    out.flush();
                    continue;
                }
                case 2: {
                    fileChooser.cancelSelection();
                    continue;
                }
            }
        }
    }
    
    public Companion(final byte b) {
        this();
    }
}
