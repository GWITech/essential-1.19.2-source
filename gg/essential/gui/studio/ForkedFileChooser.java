package gg.essential.gui.studio;

import kotlin.*;
import gg.essential.util.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.*;
import kotlin.jvm.internal.*;
import java.io.*;
import javax.swing.*;
import javax.swing.filechooser.*;
import java.awt.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u00000
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0004
                                                   \u0002\u0010\u0002
                                                   \u0002\b\u0004
                                                   \u0002\u0010\b
                                                   \u0002\b\u0002\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\f\u001a\u00020\rJ\b\u0010\u000e\u001a\u00020\rH\u0016J\u0006\u0010\u000f\u001a\u00020\rJ\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002
                                                   \u0000R"\u0010	\u001a\u0004\u0018\u00010\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\b@BX\u0086\u000e¢\u0006\b
                                                   \u0000\u001a\u0004\b
                                                   \u0010\u000b¨\u0006\u0014""" }, d2 = { "Lgg/essential/gui/studio/ForkedFileChooser;", "Ljava/lang/AutoCloseable;", "()V", "inputStream", "Ljava/io/DataInputStream;", "jvm", "Lgg/essential/util/ForkedJvm;", "<set-?>", "Ljava/io/File;", "selectedFile", "getSelectedFile", "()Ljava/io/File;", "cancelSelection", "", "close", "showOpenDialog", "writeAndFlush", "b", "", "Companion", "essential" })
public final class ForkedFileChooser implements AutoCloseable
{
    @NotNull
    public static final Companion Companion;
    @NotNull
    private final ForkedJvm jvm;
    @NotNull
    private final DataInputStream inputStream;
    @Nullable
    private File selectedFile;
    
    public ForkedFileChooser() {
        super();
        this.jvm = new ForkedJvm(ForkedFileChooser.class);
        this.inputStream = new DataInputStream(this.jvm.getProcess().getInputStream());
    }
    
    @Nullable
    public final File getSelectedFile() {
        return this.selectedFile;
    }
    
    @Override
    public void close() {
        this.writeAndFlush(0);
        this.jvm.close();
    }
    
    public final void showOpenDialog() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: aconst_null    
        //     2: putfield        gg/essential/gui/studio/ForkedFileChooser.selectedFile:Ljava/io/File;
        //     5: aload_0         /* this */
        //     6: iconst_1       
        //     7: invokespecial   gg/essential/gui/studio/ForkedFileChooser.writeAndFlush:(I)V
        //    10: aload_0         /* this */
        //    11: aload_0         /* this */
        //    12: getfield        gg/essential/gui/studio/ForkedFileChooser.inputStream:Ljava/io/DataInputStream;
        //    15: invokevirtual   java/io/DataInputStream.readUTF:()Ljava/lang/String;
        //    18: astore_1       
        //    19: astore_2       
        //    20: aload_1         /* it */
        //    21: ldc             "null"
        //    23: invokestatic    kotlin/jvm/internal/Intrinsics.areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //    26: ifeq            33
        //    29: aconst_null    
        //    30: goto            41
        //    33: new             Ljava/io/File;
        //    36: dup            
        //    37: aload_1         /* it */
        //    38: invokespecial   java/io/File.<init>:(Ljava/lang/String;)V
        //    41: aload_2        
        //    42: swap           
        //    43: putfield        gg/essential/gui/studio/ForkedFileChooser.selectedFile:Ljava/io/File;
        //    46: return         
        //    StackMapTable: 00 02 FF 00 21 00 03 00 07 00 5C 07 00 02 00 00 FF 00 07 00 03 00 00 07 00 02 00 01 07 00 5E
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public final void cancelSelection() {
        this.writeAndFlush(2);
    }
    
    private final void writeAndFlush(final int b) {
        this.jvm.getProcess().getOutputStream().write(b);
        this.jvm.getProcess().getOutputStream().flush();
    }
    
    @JvmStatic
    public static final void main(@NotNull final String[] args) {
        ForkedFileChooser.Companion.main(args);
    }
    
    static {
        Companion = new Companion((byte)0);
    }
    
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
}
