package gg.essential.gui;

import org.jetbrains.annotations.*;
import java.awt.*;
import kotlin.jvm.*;
import kotlin.jvm.internal.*;
import kotlin.*;
import gg.essential.elementa.state.*;
import kotlin.jvm.functions.*;
import gg.essential.elementa.components.*;
import gg.essential.gui.image.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000+
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0000
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0003\bº\u0001
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u000b
                                                   \u0002\b\u0006\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001f\u0010\u00c1\u0001\u001a	\u0012\u0004\u0012\u00020\u00040\u00c2\u00012\u000f\u0010\u00c3\u0001\u001a
                                                   \u0012\u0005\u0012\u00030\u00c4\u00010\u00c2\u0001J0\u0010\u00c1\u0001\u001a	\u0012\u0004\u0012\u00020\u00040\u00c2\u00012\u000f\u0010\u00c3\u0001\u001a
                                                   \u0012\u0005\u0012\u00030\u00c4\u00010\u00c2\u00012\u000f\u0010\u00c5\u0001\u001a
                                                   \u0012\u0005\u0012\u00030\u00c4\u00010\u00c2\u0001J\u001f\u0010\u00c6\u0001\u001a	\u0012\u0004\u0012\u00020\u00040\u00c2\u00012\u000f\u0010\u00c3\u0001\u001a
                                                   \u0012\u0005\u0012\u00030\u00c4\u00010\u00c2\u0001J0\u0010\u00c6\u0001\u001a	\u0012\u0004\u0012\u00020\u00040\u00c2\u00012\u000f\u0010\u00c3\u0001\u001a
                                                   \u0012\u0005\u0012\u00030\u00c4\u00010\u00c2\u00012\u000f\u0010\u00c5\u0001\u001a
                                                   \u0012\u0005\u0012\u00030\u00c4\u00010\u00c2\u0001J)\u0010\u00c7\u0001\u001a	\u0012\u0004\u0012\u00020\u00040\u00c2\u00012\u000f\u0010\u00c3\u0001\u001a
                                                   \u0012\u0005\u0012\u00030\u00c4\u00010\u00c2\u00012\b\u0010\u00c8\u0001\u001a\u00030\u00c4\u0001J\u001f\u0010\u00c9\u0001\u001a	\u0012\u0004\u0012\u00020\u00040\u00c2\u00012\u000f\u0010\u00c3\u0001\u001a
                                                   \u0012\u0005\u0012\u00030\u00c4\u00010\u00c2\u0001J0\u0010\u00c9\u0001\u001a	\u0012\u0004\u0012\u00020\u00040\u00c2\u00012\u000f\u0010\u00c3\u0001\u001a
                                                   \u0012\u0005\u0012\u00030\u00c4\u00010\u00c2\u00012\u000f\u0010\u00c5\u0001\u001a
                                                   \u0012\u0005\u0012\u00030\u00c4\u00010\u00c2\u0001R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010	\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010
                                                   \u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010\u000b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010\f\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010\r\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010\u000e\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010\u000f\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010\u0010\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010\u0011\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010\u0012\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010\u0013\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010\u0014\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010\u0015\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010\u0016\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010\u0017\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010\u0018\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010\u0019\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010\u001a\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010\u001b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010\u001c\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010\u001d\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010\u001e\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010\u001f\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010 \u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010!\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010"\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010#\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010$\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010%\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010&\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010'\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010(\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010)\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010*\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010+\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010,\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010-\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010.\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010/\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u00100\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u00101\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u00102\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u00103\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u00104\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u00105\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u00106\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u00107\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u00108\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u00109\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010:\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010;\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010<\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010=\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010>\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010?\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010@\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010A\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010B\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010C\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010D\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010E\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010F\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010G\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010H\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010I\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010J\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010K\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010L\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010M\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010N\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010O\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010P\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010Q\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010R\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010S\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010T\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010U\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010V\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010W\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010X\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010Y\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010Z\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010[\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010\\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010]\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010^\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010_\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010`\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010a\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010c\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010d\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010e\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010f\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010g\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010h\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010i\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010j\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010k\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010l\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010m\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010o\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010p\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010q\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010r\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010s\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010t\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010u\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010v\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010w\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010x\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010y\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010z\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010{\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010|\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010}\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010~\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010\u007f\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0011\u0010\u0080\u0001\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0011\u0010\u0081\u0001\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0011\u0010\u0082\u0001\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0011\u0010\u0083\u0001\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0011\u0010\u0084\u0001\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0011\u0010\u0085\u0001\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0011\u0010\u0086\u0001\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0011\u0010\u0087\u0001\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0011\u0010\u0088\u0001\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0011\u0010\u0089\u0001\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0011\u0010\u008a\u0001\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0011\u0010\u008b\u0001\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0011\u0010\u008c\u0001\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0011\u0010\u008d\u0001\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0011\u0010\u008e\u0001\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0011\u0010\u008f\u0001\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0011\u0010\u0090\u0001\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0011\u0010\u0091\u0001\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0011\u0010\u0092\u0001\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0011\u0010\u0093\u0001\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0011\u0010\u0094\u0001\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0011\u0010\u0095\u0001\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0011\u0010\u0096\u0001\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0011\u0010\u0097\u0001\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0011\u0010\u0098\u0001\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0011\u0010\u0099\u0001\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0011\u0010\u009a\u0001\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0011\u0010\u009b\u0001\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0011\u0010\u009c\u0001\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0011\u0010\u009d\u0001\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0011\u0010\u009e\u0001\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0011\u0010\u009f\u0001\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0011\u0010 \u0001\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0011\u0010¡\u0001\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0011\u0010¢\u0001\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0011\u0010£\u0001\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0011\u0010¤\u0001\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0011\u0010¥\u0001\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0011\u0010¦\u0001\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0011\u0010§\u0001\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0011\u0010¨\u0001\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0011\u0010©\u0001\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0011\u0010ª\u0001\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0011\u0010«\u0001\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0011\u0010¬\u0001\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0011\u0010\u00ad\u0001\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0011\u0010®\u0001\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0011\u0010¯\u0001\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0011\u0010°\u0001\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0011\u0010±\u0001\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0011\u0010²\u0001\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0011\u0010³\u0001\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0011\u0010´\u0001\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0011\u0010µ\u0001\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0011\u0010¶\u0001\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0011\u0010·\u0001\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0011\u0010¸\u0001\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0011\u0010¹\u0001\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0011\u0010º\u0001\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0011\u0010»\u0001\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0011\u0010¼\u0001\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0011\u0010½\u0001\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0011\u0010¾\u0001\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0011\u0010¿\u0001\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0011\u0010\u00c0\u0001\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000¨\u0006\u00ca\u0001""" }, d2 = { "Lgg/essential/gui/EssentialPalette;", "", "()V", "ACCENT_BLUE", "Ljava/awt/Color;", "ACCENT_HOVER", "ADD_TO_CART_17X7", "Lgg/essential/gui/image/ImageFactory;", "ANIMATIONS_OFF", "ANIMATIONS_ON", "ARROW_DOWN_7X4", "ARROW_DOWN_7X5", "ARROW_LEFT_4X7", "ARROW_LEFT_5X7", "ARROW_RIGHT_3X5", "ARROW_RIGHT_4X7", "ARROW_UP_7X4", "ARROW_UP_7X5", "ARROW_UP_RIGHT_5X5", "BELL_7X", "BLACK", "BLOCK_8X", "BLUE_SHADOW", "BURGER_7X5", "BUTTON", "BUTTON_HIGHLIGHT", "CANCEL_10X", "CANCEL_12X", "CANCEL_16X", "CANCEL_5X", "CANCEL_7X", "CHECKMARK_7X5", "CHECKMARK_8X6", "COMPONENT_BACKGROUND", "COMPONENT_BACKGROUND_HIGHLIGHT", "COMPONENT_HIGHLIGHT", "COMPONENT_SELECTED", "COPY_9X", "COPY_EXISTING_LINK_16X", "COSMETICS_10X7", "COSMETICS_10X_OFF", "COSMETICS_10X_ON", "CROWN_7X5", "CUT_8X", "EDIT_10X7", "EDIT_16X", "EDIT_9X7", "EMOTES_7X", "ENVELOPE_10X7", "ESSENTIAL_5X", "ESSENTIAL_7X", "ESSENTIAL_BLUE", "ESSENTIAL_DARK_BLUE_OR_MAYBE_PURPLE_IDK", "ESSENTIAL_GOLD", "ESSENTIAL_GREEN", "ESSENTIAL_PUKE_GREEN", "ESSENTIAL_RED", "ESSENTIAL_YELLOW", "FAILED_MESSAGE_TEXT", "FEATURED_16X", "FILE_16X", "FOLDER_10X", "FOLDER_16X", "FOLDER_9X", "FRIENDS_10X7", "FULLSCREEN_10X_OFF", "FULLSCREEN_10X_ON", "FULLSCREEN_11X7", "GIFT_16X", "GRAY_OUTLINE", "GREEN", "GRID_9X", "GUI_BACKGROUND", "HAT_16X", "HEART_16X", "HEART_9X", "HEART_EMPTY_9X", "HEART_FILLED_9X", "ICON_SHADOW", "IMAGE_SIZE_BIG_10X", "IMAGE_SIZE_SMALL_9X", "INFO_9X", "INFO_ELEMENT_UNHOVERED", "INPUT_BACKGROUND", "INVITE_10X6", "ITEM_PINNED", "JOIN_ARROW_5X", "KICK_16X", "LEAVE_8X7", "LIGHTEST_BACKGROUND", "LIGHT_DIVIDER", "LIGHT_SCROLLBAR", "LINK_16X", "LINK_8X7", "LOCKED_ORANGE", "LOCK_7X9", "LOCK_CLOSED_16x", "LOCK_OPEN_16X", "MAIN_MENU_BLUE", "MARK_UNREAD", "MC_FOLDER_8X7", "MENU_BACKGROUND", "MESSAGES_7X", "MESSAGE_7X6", "MESSAGE_HIGHLIGHT", "MESSAGE_SENT", "MESSAGE_SENT_HOVER", "MESSAGE_UNREAD", "MESSAGE_UNREAD_HOVER", "MODAL_BACKGROUND", "MODAL_OUTLINE", "MODS_7X", "MUTE_8X", "NEW_22x11", "NONE", "NOTICE_11X", "NOTIFICATIONS_10X_OFF", "NOTIFICATIONS_10X_ON", "ONLINE", "OPTIONS_8X2", "OP_7X5", "OTHER_BUTTON_ACTIVE", "PACK_128X", "PARTNER_16X", "PARTNER_SMALL_9X", "PASTE_6X8", "PENDING_MESSAGE_TEXT", "PICTURES_10X7", "PINNED_8X", "PINNED_COMPONENT_BACKGROUND", "PLAY_ARROW_4x5", "PLUS_10X", "PLUS_16X", "PLUS_5X", "PLUS_7X", "POWER_BUTTON_7X7", "PROPERTIES_7X5", "RECEIVED_MESSAGE_BACKGROUND", "RECEIVED_MESSAGE_TEXT", "RED", "REDO_9X", "REINVITE_5X", "REMOVE_FROM_CART_17X7", "RENAME_8X6", "REPLY_7X5", "REPORT_8X", "RETRY_7X", "ROTATE_LEFT_7X9", "ROTATE_RIGHT_7X9", "ROW_9X", "SALE_20_PERCENT_25x11", "SALE_INDICATOR_28x11", "SAVE_9X", "SCROLLBAR", "SEARCH_16X", "SEARCH_7X", "SENT_MESSAGE_BACKGROUND", "SENT_MESSAGE_TEXT", "SETTINGS_9X7", "SETTINGS_9X8", "SETTINGS_VERTICAL_10X", "SHOPPING_CART_12X", "SHOPPING_CART_16X", "SLIDERS_9X", "SOCIAL_10X", "STAR_4X3", "TEXT", "TEXT_BLUE", "TEXT_DISABLED", "TEXT_HIGHLIGHT", "TEXT_MID_GRAY", "TEXT_RED", "TEXT_SHADOW", "TEXT_SHADOW_LIGHT", "TEXT_WARNING", "TOAST_BACKGROUND", "TOAST_BORDER", "TOAST_PROGRESS", "TOGGLE_OFF", "TOGGLE_ON", "TRASH_9X", "TRASH_CAN_16X", "TRASH_CAN_7X11", "TURN_LEFT_18X", "TURN_RIGHT_18X", "UNDO_9X", "UNMUTE_9X7", "UNPINNED_8X", "UPLOAD_9X", "UPLOAD_SKIN_16X", "UPLOAD_SKIN_9X13", "WIP_620X", "WORLD_8X", "getButtonColor", "Lgg/essential/elementa/state/State;", "hovered", "", "enabled", "getLinkColor", "getMessageColor", "sentByClient", "getTextColor", "essential" })
public final class EssentialPalette
{
    @NotNull
    public static final EssentialPalette INSTANCE;
    @JvmField
    @NotNull
    public static final Color SENT_MESSAGE_TEXT;
    @JvmField
    @NotNull
    public static final Color PENDING_MESSAGE_TEXT;
    @JvmField
    @NotNull
    public static final Color FAILED_MESSAGE_TEXT;
    @JvmField
    @NotNull
    public static final Color RECEIVED_MESSAGE_TEXT;
    @JvmField
    @NotNull
    public static final Color ESSENTIAL_RED;
    @JvmField
    @NotNull
    public static final Color ESSENTIAL_BLUE;
    @JvmField
    @NotNull
    public static final Color ESSENTIAL_GREEN;
    @JvmField
    @NotNull
    public static final Color ACCENT_HOVER;
    @JvmField
    @NotNull
    public static final Color LIGHT_DIVIDER;
    @JvmField
    @NotNull
    public static final Color LIGHT_SCROLLBAR;
    @JvmField
    @NotNull
    public static final Color GREEN;
    @JvmField
    @NotNull
    public static final Color BLACK;
    @JvmField
    @NotNull
    public static final Color BUTTON_HIGHLIGHT;
    @JvmField
    @NotNull
    public static final Color BUTTON;
    @JvmField
    @NotNull
    public static final Color TEXT;
    @JvmField
    @NotNull
    public static final Color TEXT_HIGHLIGHT;
    @JvmField
    @NotNull
    public static final Color TEXT_WARNING;
    @JvmField
    @NotNull
    public static final Color COMPONENT_BACKGROUND;
    @JvmField
    @NotNull
    public static final Color COMPONENT_BACKGROUND_HIGHLIGHT;
    @JvmField
    @NotNull
    public static final Color GUI_BACKGROUND;
    @JvmField
    @NotNull
    public static final Color MODAL_BACKGROUND;
    @JvmField
    @NotNull
    public static final Color MODAL_OUTLINE;
    @JvmField
    @NotNull
    public static final Color TEXT_RED;
    @JvmField
    @NotNull
    public static final Color GRAY_OUTLINE;
    @JvmField
    @NotNull
    public static final Color TEXT_SHADOW;
    @JvmField
    @NotNull
    public static final Color TEXT_SHADOW_LIGHT;
    @JvmField
    @NotNull
    public static final Color TEXT_DISABLED;
    @JvmField
    @NotNull
    public static final Color TEXT_MID_GRAY;
    @JvmField
    @NotNull
    public static final Color ICON_SHADOW;
    @JvmField
    @NotNull
    public static final Color SCROLLBAR;
    @JvmField
    @NotNull
    public static final Color COMPONENT_HIGHLIGHT;
    @JvmField
    @NotNull
    public static final Color RED;
    @JvmField
    @NotNull
    public static final Color MESSAGE_SENT;
    @JvmField
    @NotNull
    public static final Color BLUE_SHADOW;
    @JvmField
    @NotNull
    public static final Color OTHER_BUTTON_ACTIVE;
    @JvmField
    @NotNull
    public static final Color INPUT_BACKGROUND;
    @JvmField
    @NotNull
    public static final Color MESSAGE_SENT_HOVER;
    @JvmField
    @NotNull
    public static final Color TOAST_PROGRESS;
    @JvmField
    @NotNull
    public static final Color TOAST_BACKGROUND;
    @JvmField
    @NotNull
    public static final Color TOAST_BORDER;
    @JvmField
    @NotNull
    public static final Color MAIN_MENU_BLUE;
    @JvmField
    @NotNull
    public static final Color ACCENT_BLUE;
    @JvmField
    @NotNull
    public static final Color LOCKED_ORANGE;
    @JvmField
    @NotNull
    public static final Color INFO_ELEMENT_UNHOVERED;
    @JvmField
    @NotNull
    public static final Color ITEM_PINNED;
    @JvmField
    @NotNull
    public static final Color COMPONENT_SELECTED;
    @JvmField
    @NotNull
    public static final Color MESSAGE_HIGHLIGHT;
    @JvmField
    @NotNull
    public static final ImageFactory SHOPPING_CART_16X;
    @JvmField
    @NotNull
    public static final ImageFactory CHECKMARK_8X6;
    @JvmField
    @NotNull
    public static final ImageFactory CHECKMARK_7X5;
    @JvmField
    @NotNull
    public static final ImageFactory PLUS_5X;
    @JvmField
    @NotNull
    public static final ImageFactory PLUS_7X;
    @JvmField
    @NotNull
    public static final ImageFactory SEARCH_7X;
    @JvmField
    @NotNull
    public static final ImageFactory BURGER_7X5;
    @JvmField
    @NotNull
    public static final ImageFactory FEATURED_16X;
    @JvmField
    @NotNull
    public static final ImageFactory SLIDERS_9X;
    @JvmField
    @NotNull
    public static final ImageFactory COSMETICS_10X7;
    @JvmField
    @NotNull
    public static final ImageFactory COSMETICS_10X_ON;
    @JvmField
    @NotNull
    public static final ImageFactory COSMETICS_10X_OFF;
    @JvmField
    @NotNull
    public static final ImageFactory ESSENTIAL_7X;
    @JvmField
    @NotNull
    public static final ImageFactory MC_FOLDER_8X7;
    @JvmField
    @NotNull
    public static final ImageFactory PICTURES_10X7;
    @JvmField
    @NotNull
    public static final ImageFactory SETTINGS_9X8;
    @JvmField
    @NotNull
    public static final ImageFactory INFO_9X;
    @JvmField
    @NotNull
    public static final ImageFactory NOTICE_11X;
    @JvmField
    @NotNull
    public static final ImageFactory ARROW_UP_7X5;
    @JvmField
    @NotNull
    public static final ImageFactory ARROW_DOWN_7X5;
    @JvmField
    @NotNull
    public static final ImageFactory ARROW_LEFT_4X7;
    @JvmField
    @NotNull
    public static final ImageFactory ARROW_RIGHT_3X5;
    @JvmField
    @NotNull
    public static final ImageFactory ARROW_RIGHT_4X7;
    @JvmField
    @NotNull
    public static final ImageFactory ARROW_UP_RIGHT_5X5;
    @JvmField
    @NotNull
    public static final ImageFactory SOCIAL_10X;
    @JvmField
    @NotNull
    public static final ImageFactory TRASH_9X;
    @JvmField
    @NotNull
    public static final ImageFactory FULLSCREEN_10X_ON;
    @JvmField
    @NotNull
    public static final ImageFactory FULLSCREEN_10X_OFF;
    @JvmField
    @NotNull
    public static final ImageFactory NOTIFICATIONS_10X_ON;
    @JvmField
    @NotNull
    public static final ImageFactory NOTIFICATIONS_10X_OFF;
    @JvmField
    @NotNull
    public static final ImageFactory COPY_9X;
    @JvmField
    @NotNull
    public static final ImageFactory EDIT_10X7;
    @JvmField
    @NotNull
    public static final ImageFactory HEART_FILLED_9X;
    @JvmField
    @NotNull
    public static final ImageFactory HEART_EMPTY_9X;
    @JvmField
    @NotNull
    public static final ImageFactory IMAGE_SIZE_BIG_10X;
    @JvmField
    @NotNull
    public static final ImageFactory IMAGE_SIZE_SMALL_9X;
    @JvmField
    @NotNull
    public static final ImageFactory LINK_8X7;
    @JvmField
    @NotNull
    public static final ImageFactory REDO_9X;
    @JvmField
    @NotNull
    public static final ImageFactory SAVE_9X;
    @JvmField
    @NotNull
    public static final ImageFactory UNDO_9X;
    @JvmField
    @NotNull
    public static final ImageFactory UPLOAD_9X;
    @JvmField
    @NotNull
    public static final ImageFactory OPTIONS_8X2;
    @JvmField
    @NotNull
    public static final ImageFactory ADD_TO_CART_17X7;
    @JvmField
    @NotNull
    public static final ImageFactory REMOVE_FROM_CART_17X7;
    @JvmField
    @NotNull
    public static final ImageFactory ROTATE_RIGHT_7X9;
    @JvmField
    @NotNull
    public static final ImageFactory ROTATE_LEFT_7X9;
    @JvmField
    @NotNull
    public static final ImageFactory UPLOAD_SKIN_9X13;
    @JvmField
    @NotNull
    public static final ImageFactory CANCEL_5X;
    @JvmField
    @NotNull
    public static final ImageFactory ARROW_DOWN_7X4;
    @JvmField
    @NotNull
    public static final ImageFactory ARROW_UP_7X4;
    @JvmField
    @NotNull
    public static final ImageFactory PROPERTIES_7X5;
    @JvmField
    @NotNull
    public static final ImageFactory JOIN_ARROW_5X;
    @JvmField
    @NotNull
    public static final ImageFactory RETRY_7X;
    @JvmField
    @NotNull
    public static final ImageFactory INVITE_10X6;
    @JvmField
    @NotNull
    public static final ImageFactory WORLD_8X;
    @JvmField
    @NotNull
    public static final ImageFactory PACK_128X;
    @JvmField
    @NotNull
    public static final ImageFactory LOCK_7X9;
    @JvmField
    @NotNull
    public static final ImageFactory OP_7X5;
    @JvmField
    @NotNull
    public static final ImageFactory PINNED_8X;
    @JvmField
    @NotNull
    public static final ImageFactory UNPINNED_8X;
    @JvmField
    @NotNull
    public static final ImageFactory REINVITE_5X;
    @JvmField
    @NotNull
    public static final ImageFactory ENVELOPE_10X7;
    @JvmField
    @NotNull
    public static final ImageFactory STAR_4X3;
    @JvmField
    @NotNull
    public static final ImageFactory REPLY_7X5;
    @JvmField
    @NotNull
    public static final ImageFactory TOGGLE_ON;
    @JvmField
    @NotNull
    public static final ImageFactory TOGGLE_OFF;
    @JvmField
    @NotNull
    public static final ImageFactory BLOCK_8X;
    @JvmField
    @NotNull
    public static final ImageFactory CUT_8X;
    @JvmField
    @NotNull
    public static final ImageFactory PASTE_6X8;
    @JvmField
    @NotNull
    public static final ImageFactory EDIT_9X7;
    @JvmField
    @NotNull
    public static final ImageFactory LEAVE_8X7;
    @JvmField
    @NotNull
    public static final ImageFactory MARK_UNREAD;
    @JvmField
    @NotNull
    public static final ImageFactory MUTE_8X;
    @JvmField
    @NotNull
    public static final ImageFactory RENAME_8X6;
    @JvmField
    @NotNull
    public static final ImageFactory REPORT_8X;
    @JvmField
    @NotNull
    public static final ImageFactory UNMUTE_9X7;
    @JvmField
    @NotNull
    public static final ImageFactory MESSAGE_7X6;
    
    private EssentialPalette() {
        super();
    }
    
    @NotNull
    public final State<Color> getMessageColor(@NotNull final State<Boolean> hovered, final boolean sentByClient) {
        Intrinsics.checkNotNullParameter((Object)hovered, "hovered");
        return (State)hovered.map((kotlin.jvm.functions.Function1<? super Boolean, ?>)new EssentialPalette$getMessageColor.EssentialPalette$getMessageColor$1(sentByClient));
    }
    
    @NotNull
    public final State<Color> getTextColor(@NotNull final State<Boolean> hovered, @NotNull final State<Boolean> enabled) {
        Intrinsics.checkNotNullParameter((Object)hovered, "hovered");
        Intrinsics.checkNotNullParameter((Object)enabled, "enabled");
        return (State)hovered.zip((State<Object>)enabled).map((kotlin.jvm.functions.Function1<? super kotlin.Pair<Boolean, Object>, ?>)EssentialPalette$getTextColor.EssentialPalette$getTextColor$1.INSTANCE);
    }
    
    @NotNull
    public final State<Color> getTextColor(@NotNull final State<Boolean> hovered) {
        Intrinsics.checkNotNullParameter((Object)hovered, "hovered");
        return this.getTextColor(hovered, new BasicState<Boolean>(true));
    }
    
    @NotNull
    public final State<Color> getLinkColor(@NotNull final State<Boolean> hovered, @NotNull final State<Boolean> enabled) {
        Intrinsics.checkNotNullParameter((Object)hovered, "hovered");
        Intrinsics.checkNotNullParameter((Object)enabled, "enabled");
        return (State)hovered.zip((State<Object>)enabled).map((kotlin.jvm.functions.Function1<? super kotlin.Pair<Boolean, Object>, ?>)EssentialPalette$getLinkColor.EssentialPalette$getLinkColor$1.INSTANCE);
    }
    
    @NotNull
    public final State<Color> getLinkColor(@NotNull final State<Boolean> hovered) {
        Intrinsics.checkNotNullParameter((Object)hovered, "hovered");
        return this.getLinkColor(hovered, new BasicState<Boolean>(true));
    }
    
    @NotNull
    public final State<Color> getButtonColor(@NotNull final State<Boolean> hovered, @NotNull final State<Boolean> enabled) {
        Intrinsics.checkNotNullParameter((Object)hovered, "hovered");
        Intrinsics.checkNotNullParameter((Object)enabled, "enabled");
        return (State)hovered.zip((State<Object>)enabled).map((kotlin.jvm.functions.Function1<? super kotlin.Pair<Boolean, Object>, ?>)EssentialPalette$getButtonColor.EssentialPalette$getButtonColor$1.INSTANCE);
    }
    
    @NotNull
    public final State<Color> getButtonColor(@NotNull final State<Boolean> hovered) {
        Intrinsics.checkNotNullParameter((Object)hovered, "hovered");
        return this.getButtonColor(hovered, new BasicState<Boolean>(true));
    }
    
    static {
        INSTANCE = new EssentialPalette();
        SENT_MESSAGE_TEXT = new Color(255, 255, 255);
        PENDING_MESSAGE_TEXT = new Color(150, 150, 150);
        FAILED_MESSAGE_TEXT = new Color(245, 83, 79);
        RECEIVED_MESSAGE_TEXT = new Color(255, 255, 255);
        new Color(10, 130, 253);
        new Color(51, 51, 51);
        new Color(1, 165, 82);
        ESSENTIAL_RED = new Color(255, 79, 81);
        ESSENTIAL_BLUE = new Color(18, 153, 255);
        new Color(255, 238, 62);
        new Color(255, 183, 62);
        ESSENTIAL_GREEN = new Color(2, 217, 142);
        new Color(79, 205, 70);
        new Color(79, 55, 219);
        ACCENT_HOVER = new Color(0, 212, 105);
        new Color(19, 43, 31);
        new Color(20, 65, 42);
        Intrinsics.checkNotNullExpressionValue((Object)Color.BLACK, "BLACK");
        new Color(71, 71, 71);
        LIGHT_DIVIDER = new Color(48, 48, 48);
        LIGHT_SCROLLBAR = new Color(85, 85, 85);
        GREEN = new Color(2868563);
        BLACK = new Color(0);
        BUTTON_HIGHLIGHT = new Color(4671303);
        BUTTON = new Color(3289650);
        TEXT = new Color(12303291);
        TEXT_HIGHLIGHT = new Color(16777215);
        TEXT_WARNING = new Color(13379881);
        COMPONENT_BACKGROUND = new Color(2302755);
        COMPONENT_BACKGROUND_HIGHLIGHT = new Color(3092271);
        GUI_BACKGROUND = new Color(1579032);
        MODAL_BACKGROUND = EssentialPalette.GUI_BACKGROUND;
        MODAL_OUTLINE = new Color(4144959);
        TEXT_RED = new Color(15016482);
        new Color(5592575);
        GRAY_OUTLINE = new Color(4342338);
        TEXT_SHADOW = new Color(1447448);
        TEXT_SHADOW_LIGHT = new Color(4144959);
        TEXT_DISABLED = new Color(6974058);
        TEXT_MID_GRAY = new Color(9671571);
        ICON_SHADOW = new Color(3355443);
        SCROLLBAR = new Color(5526612);
        COMPONENT_HIGHLIGHT = new Color(3158064);
        RED = new Color(13379881);
        MESSAGE_SENT = new Color(688893);
        BLUE_SHADOW = new Color(2567990);
        OTHER_BUTTON_ACTIVE = new Color(9671571);
        INPUT_BACKGROUND = new Color(1842204);
        MESSAGE_SENT_HOVER = new Color(4957439);
        TOAST_PROGRESS = new Color(9671571);
        TOAST_BACKGROUND = new Color(1579032);
        TOAST_BORDER = new Color(3158064);
        MAIN_MENU_BLUE = new Color(2725887);
        ACCENT_BLUE = new Color(2725887);
        LOCKED_ORANGE = new Color(16415751);
        INFO_ELEMENT_UNHOVERED = new Color(9671571);
        ITEM_PINNED = new Color(688893);
        new Color(1121840);
        COMPONENT_SELECTED = new Color(1187376);
        MESSAGE_HIGHLIGHT = new Color(3358281);
        SHOPPING_CART_16X = new ResourceImageFactory("/assets/essential/textures/studio/cart.png");
        new ResourceImageFactory("/assets/essential/textures/cart_12x12.png");
        new ResourceImageFactory("/assets/essential/textures/turn_right_18x18.png");
        new ResourceImageFactory("/assets/essential/textures/turn_left_18x18.png");
        CHECKMARK_8X6 = new ResourceImageFactory("/assets/essential/textures/checkmark_8x6.png");
        CHECKMARK_7X5 = new ResourceImageFactory("/assets/essential/textures/checkmark_7x5.png");
        PLUS_5X = new ResourceImageFactory("/assets/essential/textures/plus_5x5.png");
        PLUS_7X = new ResourceImageFactory("/assets/essential/textures/plus_7x7.png");
        new ResourceImageFactory("/assets/essential/textures/plus_10x10.png");
        new ResourceImageFactory("/assets/essential/textures/plus.png");
        new ResourceImageFactory("/assets/essential/textures/cancel_7x7.png");
        new ResourceImageFactory("/assets/essential/textures/cancel_10x10.png");
        new ResourceImageFactory("/assets/essential/textures/cancel_12x12.png");
        new ResourceImageFactory("/assets/essential/textures/cancel.png");
        new ResourceImageFactory("/assets/essential/textures/search.png");
        SEARCH_7X = new ResourceImageFactory("/assets/essential/textures/search_7x.png");
        BURGER_7X5 = new ResourceImageFactory("/assets/essential/textures/friends/burger.png");
        new ResourceImageFactory("/assets/essential/textures/kick.png");
        FEATURED_16X = new ResourceImageFactory("/assets/essential/textures/studio/featured.png");
        new ResourceImageFactory("/assets/essential/textures/wip.png");
        new ResourceImageFactory("/assets/essential/textures/studio/hat.png");
        new ResourceImageFactory("/assets/essential/textures/studio/grid.png");
        new ResourceImageFactory("/assets/essential/textures/studio/row.png");
        SLIDERS_9X = new ResourceImageFactory("/assets/essential/textures/studio/sliders.png");
        new ResourceImageFactory("/assets/essential/textures/studio/upload-skin.png");
        new ResourceImageFactory("/assets/essential/textures/studio/partner.png");
        new ResourceImageFactory("/assets/essential/textures/studio/partner_small.png");
        new ResourceImageFactory("/assets/essential/textures/studio/gift.png");
        new ResourceImageFactory("/assets/essential/textures/studio/20_percent_sale.png");
        new ResourceImageFactory("/assets/essential/textures/sale_indicator.png");
        new ResourceImageFactory("/assets/essential/textures/studio/new_22x11.png");
        new ResourceImageFactory("/assets/essential/textures/studio/lock_open.png");
        new ResourceImageFactory("/assets/essential/textures/studio/lock_closed.png");
        new ResourceImageFactory("/assets/essential/textures/studio/play_arrow.png");
        COSMETICS_10X7 = new ResourceImageFactory("/assets/essential/textures/menu/cosmetics.png");
        COSMETICS_10X_ON = new ResourceImageFactory("/assets/essential/textures/menu/cosmetics_on.png");
        COSMETICS_10X_OFF = new ResourceImageFactory("/assets/essential/textures/menu/cosmetics_off.png");
        new ResourceImageFactory("/assets/essential/textures/menu/emotes.png");
        new ResourceImageFactory("/assets/essential/textures/menu/essential.png");
        ESSENTIAL_7X = new ResourceImageFactory("/assets/essential/textures/menu/logo.png");
        new ResourceImageFactory("/assets/essential/textures/menu/friends.png");
        MC_FOLDER_8X7 = new ResourceImageFactory("/assets/essential/textures/menu/mc_folder.png");
        new ResourceImageFactory("/assets/essential/textures/menu/messages.png");
        new ResourceImageFactory("/assets/essential/textures/menu/mods.png");
        PICTURES_10X7 = new ResourceImageFactory("/assets/essential/textures/menu/pictures.png");
        new ResourceImageFactory("/assets/essential/textures/menu/settings.png");
        new ResourceImageFactory("/assets/essential/textures/menu/settings_vertical.png");
        SETTINGS_9X8 = new ResourceImageFactory("/assets/essential/textures/menu/settings_9x8.png");
        INFO_9X = new ResourceImageFactory("/assets/essential/textures/info_9x9.png");
        NOTICE_11X = new ResourceImageFactory("/assets/essential/textures/notice_11x11.png");
        ARROW_UP_7X5 = new ResourceImageFactory("/assets/essential/textures/menu/arrow_up.png");
        ARROW_DOWN_7X5 = new ResourceImageFactory("/assets/essential/textures/menu/arrow_down.png");
        ARROW_LEFT_4X7 = new ResourceImageFactory("/assets/essential/textures/arrow-left.png");
        new ResourceImageFactory("/assets/essential/textures/arrow-left_5x7.png");
        ARROW_RIGHT_3X5 = new ResourceImageFactory("/assets/essential/textures/arrow-right_3x5.png");
        ARROW_RIGHT_4X7 = new ResourceImageFactory("/assets/essential/textures/arrow-right.png");
        ARROW_UP_RIGHT_5X5 = new ResourceImageFactory("/assets/essential/textures/arrow-up-right.png");
        SOCIAL_10X = new ResourceImageFactory("/assets/essential/textures/menu/social.png");
        new ResourceImageFactory("/assets/essential/textures/link.png");
        new ResourceImageFactory("/assets/essential/textures/heart.png");
        TRASH_9X = new ResourceImageFactory("/assets/essential/textures/menu/trash.png");
        new ResourceImageFactory("/assets/essential/textures/screenshots/trash_can_10x.png");
        new ResourceImageFactory("/assets/essential/textures/screenshots/trash_can_16x.png");
        new ResourceImageFactory("/assets/essential/textures/screenshots/folder_10x.png");
        new ResourceImageFactory("/assets/essential/textures/screenshots/folder_16x.png");
        new ResourceImageFactory("/assets/essential/textures/screenshots/edit.png");
        new ResourceImageFactory("/assets/essential/textures/screenshots/favorite.png");
        new ResourceImageFactory("/assets/essential/textures/screenshots/file.png");
        new ResourceImageFactory("/assets/essential/textures/screenshots/link.png");
        new ResourceImageFactory("/assets/essential/textures/menu/fullscreen.png");
        FULLSCREEN_10X_ON = new ResourceImageFactory("/assets/essential/textures/menu/fullscreen_on.png");
        FULLSCREEN_10X_OFF = new ResourceImageFactory("/assets/essential/textures/menu/fullscreen_off.png");
        new ResourceImageFactory("/assets/essential/textures/menu/bell.png");
        NOTIFICATIONS_10X_ON = new ResourceImageFactory("/assets/essential/textures/menu/notifications_on.png");
        NOTIFICATIONS_10X_OFF = new ResourceImageFactory("/assets/essential/textures/menu/notifications_off.png");
        COPY_9X = new ResourceImageFactory("/assets/essential/textures/screenshots/new/copy.png");
        EDIT_10X7 = new ResourceImageFactory("/assets/essential/textures/screenshots/new/edit.png");
        new ResourceImageFactory("/assets/essential/textures/screenshots/new/folder.png");
        HEART_FILLED_9X = new ResourceImageFactory("/assets/essential/textures/screenshots/new/heart_filled.png").withColor(EssentialPalette.TEXT_RED);
        HEART_EMPTY_9X = new ResourceImageFactory("/assets/essential/textures/screenshots/new/heart_outline.png");
        IMAGE_SIZE_BIG_10X = new ResourceImageFactory("/assets/essential/textures/screenshots/new/image_size_big.png");
        IMAGE_SIZE_SMALL_9X = new ResourceImageFactory("/assets/essential/textures/screenshots/new/image_size_small.png");
        LINK_8X7 = new ResourceImageFactory("/assets/essential/textures/screenshots/new/link.png");
        REDO_9X = new ResourceImageFactory("/assets/essential/textures/screenshots/new/redo.png");
        SAVE_9X = new ResourceImageFactory("/assets/essential/textures/screenshots/new/save.png");
        UNDO_9X = new ResourceImageFactory("/assets/essential/textures/screenshots/new/undo.png");
        UPLOAD_9X = new ResourceImageFactory("/assets/essential/textures/screenshots/new/upload.png");
        OPTIONS_8X2 = new ResourceImageFactory("/assets/essential/textures/screenshots/options.png");
        ADD_TO_CART_17X7 = new ResourceImageFactory("/assets/essential/textures/studio/add_to_cart.png");
        REMOVE_FROM_CART_17X7 = new ResourceImageFactory("/assets/essential/textures/studio/remove_from_cart.png");
        ROTATE_RIGHT_7X9 = new ResourceImageFactory("/assets/essential/textures/studio/rotate_right.png");
        ROTATE_LEFT_7X9 = new ResourceImageFactory("/assets/essential/textures/studio/rotate_left.png");
        UPLOAD_SKIN_9X13 = new ResourceImageFactory("/assets/essential/textures/studio/skin.png");
        CANCEL_5X = new ResourceImageFactory("/assets/essential/textures/cancel_5x5.png");
        new ResourceImageFactory("/assets/essential/textures/studio/animation_on.png");
        new ResourceImageFactory("/assets/essential/textures/studio/animation_off.png");
        ARROW_DOWN_7X4 = new ResourceImageFactory("/assets/essential/textures/dropdown/arrow_down.png");
        ARROW_UP_7X4 = new ResourceImageFactory("/assets/essential/textures/dropdown/arrow_up.png");
        PROPERTIES_7X5 = new ResourceImageFactory("/assets/essential/textures/properties.png");
        new ResourceImageFactory("/assets/essential/textures/power-button_7x7.png");
        JOIN_ARROW_5X = new ResourceImageFactory("/assets/essential/textures/friends/join_arrow.png");
        ImageFactoryKt.ImageFactory((Function0<? extends UIImage>)EssentialPalette$NONE.EssentialPalette$NONE$1.INSTANCE).withSettings(new ImageGeneratorSettings(false, null, null, null, 14));
        RETRY_7X = new ResourceImageFactory("/assets/essential/textures/retry_7x7.png");
        INVITE_10X6 = new ResourceImageFactory("/assets/essential/textures/menu/invite.png");
        WORLD_8X = new ResourceImageFactory("/assets/essential/textures/menu/world_8x8.png");
        PACK_128X = new ResourceImageFactory("/assets/essential/textures/pack_128x128.png");
        LOCK_7X9 = new ResourceImageFactory("/assets/essential/textures/studio/lock.png");
        new ResourceImageFactory("/assets/essential/textures/sps/crown.png");
        OP_7X5 = new ResourceImageFactory("/assets/essential/textures/sps/op.png");
        PINNED_8X = new ResourceImageFactory("/assets/essential/textures/sps/pinned.png");
        UNPINNED_8X = new ResourceImageFactory("/assets/essential/textures/sps/unpinned.png");
        REINVITE_5X = new ResourceImageFactory("/assets/essential/textures/sps/reinvite_5x5.png");
        ENVELOPE_10X7 = new ResourceImageFactory("/assets/essential/textures/envelope_10x7.png");
        STAR_4X3 = new ResourceImageFactory("/assets/essential/textures/menu/star_4x3.png");
        REPLY_7X5 = new ResourceImageFactory("/assets/essential/textures/friends/reply.png");
        TOGGLE_ON = new ResourceImageFactory("/assets/essential/textures/toggle/on.png");
        TOGGLE_OFF = new ResourceImageFactory("/assets/essential/textures/toggle/off.png");
        BLOCK_8X = new ResourceImageFactory("/assets/essential/textures/optionmenu/block.png");
        CUT_8X = new ResourceImageFactory("/assets/essential/textures/optionmenu/cut.png");
        PASTE_6X8 = new ResourceImageFactory("/assets/essential/textures/optionmenu/paste.png");
        EDIT_9X7 = new ResourceImageFactory("/assets/essential/textures/optionmenu/edit_short.png");
        LEAVE_8X7 = new ResourceImageFactory("/assets/essential/textures/optionmenu/leave.png");
        MARK_UNREAD = new ResourceImageFactory("/assets/essential/textures/optionmenu/mark_unread.png");
        MUTE_8X = new ResourceImageFactory("/assets/essential/textures/optionmenu/mute.png");
        RENAME_8X6 = new ResourceImageFactory("/assets/essential/textures/optionmenu/rename.png");
        REPORT_8X = new ResourceImageFactory("/assets/essential/textures/optionmenu/report.png");
        UNMUTE_9X7 = new ResourceImageFactory("/assets/essential/textures/optionmenu/unmute.png");
        MESSAGE_7X6 = new ResourceImageFactory("/assets/essential/textures/optionmenu/message.png");
    }
}
