package gg.essential.elementa;

import org.jetbrains.annotations.*;
import gg.essential.elementa.events.*;
import java.util.concurrent.*;
import kotlin.jvm.functions.*;
import kotlin.collections.*;
import java.util.*;
import gg.essential.elementa.font.*;
import gg.essential.elementa.constraints.*;
import java.awt.*;
import gg.essential.elementa.dsl.*;
import gg.essential.universal.*;
import kotlin.*;
import gg.essential.elementa.utils.*;
import java.util.function.*;
import kotlin.jvm.*;
import kotlin.reflect.*;
import gg.essential.elementa.constraints.animation.*;
import kotlin.jvm.internal.*;
import kotlin.text.*;
import gg.essential.elementa.effects.*;
import org.lwjgl.opengl.*;
import gg.essential.elementa.components.*;
import kotlin.ranges.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u00d2\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010#\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000 \u0094\u00022\u00020\u0001:\u0004\u0094\u0002\u0095\u0002B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010o\u001a\u00020\u00002\u0006\u0010p\u001a\u00020\u0000H\u0016J!\u0010q\u001a\u00020\u00002\u0012\u0010r\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000s\"\u00020\u0000H\u0016¢\u0006\u0002\u0010tJ\b\u0010u\u001a\u00020\u000bH\u0017J\u0010\u0010u\u001a\u00020\u000b2\u0006\u0010v\u001a\u00020wH\u0016J\u000e\u0010x\u001a\u00020\u000b2\u0006\u0010v\u001a\u00020wJ\b\u0010y\u001a\u00020\u000bH\u0016J\b\u0010z\u001a\u00020(H\u0016J\u001f\u0010{\u001a\u00020\u00002\u0017\u0010|\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0002\b\fJ\u001f\u0010}\u001a\u00020\u00002\u0017\u0010|\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0002\b\fJ\u000e\u0010~\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\nJ\b\u0010\u007f\u001a\u00020\u000bH\u0016J\t\u0010\u0080\u0001\u001a\u00020\u000bH\u0017J\u0011\u0010\u0080\u0001\u001a\u00020\u000b2\u0006\u0010v\u001a\u00020wH\u0016J\u000f\u0010\u0081\u0001\u001a\u00020\u000b2\u0006\u0010v\u001a\u00020wJ\t\u0010\u0082\u0001\u001a\u00020\u000bH\u0017J\u0011\u0010\u0082\u0001\u001a\u00020\u000b2\u0006\u0010v\u001a\u00020wH\u0016J\u000f\u0010\u0083\u0001\u001a\u00020\u000b2\u0006\u0010v\u001a\u00020wJ\u001b\u0010\u0084\u0001\u001a\n\u0012\u0005\u0012\u0003H\u0086\u00010\u0085\u0001\"\u0007\b\u0000\u0010\u0086\u0001\u0018\u0001H\u0086\bJ)\u0010\u0084\u0001\u001a\n\u0012\u0005\u0012\u0003H\u0086\u00010\u0085\u0001\"\u0005\b\u0000\u0010\u0086\u00012\u000f\u0010\u0087\u0001\u001a\n\u0012\u0005\u0012\u0003H\u0086\u00010\u0088\u0001H\u0016J\t\u0010\u0089\u0001\u001a\u00020\u0000H\u0016J'\u0010\u008a\u0001\u001a\t\u0012\u0004\u0012\u00020\u000b0\u008b\u00012\u0007\u0010\u008a\u0001\u001a\u00020C2\u000e\u0010\u008c\u0001\u001a\t\u0012\u0004\u0012\u00020\u000b0\u008b\u0001J\u0007\u0010\u008d\u0001\u001a\u00020\u0005J<\u0010\u008e\u0001\u001a\u00020\u000b2\u0006\u0010U\u001a\u00020T2\u0006\u0010V\u001a\u00020T2\u0006\u0010W\u001a\u00020\u00052\u0018\u0010\u008f\u0001\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0002\b\fH\u0082\bJ!\u0010\u0090\u0001\u001a\u00020\u000b2\u0006\u0010U\u001a\u00020T2\u0006\u0010V\u001a\u00020T2\u0006\u0010W\u001a\u00020\u0005H\u0016J!\u0010\u0090\u0001\u001a\u00020\u000b2\u0006\u0010U\u001a\u00020\u00052\u0006\u0010V\u001a\u00020\u00052\u0006\u0010W\u001a\u00020\u0005H\u0017J\t\u0010\u0091\u0001\u001a\u00020\u000bH\u0017J\u0011\u0010\u0091\u0001\u001a\u00020\u000b2\u0006\u0010v\u001a\u00020wH\u0016J\u000f\u0010\u0092\u0001\u001a\u00020\u000b2\u0006\u0010v\u001a\u00020wJ\u0010\u0010\u0093\u0001\u001a\u00020\u00002\u0007\u0010\u0094\u0001\u001a\u00020+J!\u0010\u0095\u0001\u001a\u00020\u00002\u0012\u0010*\u001a\n\u0012\u0006\b\u0001\u0012\u00020+0s\"\u00020+¢\u0006\u0003\u0010\u0096\u0001J\u0012\u0010\u0097\u0001\u001a\u00020\u000b2\u0007\u0010\u0098\u0001\u001a\u00020PH\u0004J\u0012\u0010\u0099\u0001\u001a\u00020\u000b2\u0007\u0010\u0098\u0001\u001a\u00020`H\u0004J\u0007\u0010\u009a\u0001\u001a\u00020\u000bJ\u001f\u0010\u009b\u0001\u001a\u00020\u000b2\u0013\u0010\u009c\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000b0\tH\u0082\bJ\t\u0010\u009d\u0001\u001a\u00020TH\u0016J\n\u0010\u009e\u0001\u001a\u00030\u009f\u0001H\u0016J\n\u0010 \u0001\u001a\u00030¡\u0001H\u0016J\t\u0010¢\u0001\u001a\u00020TH\u0016J\t\u0010£\u0001\u001a\u00020TH\u0016J\u0016\u0010¤\u0001\u001a\u000f\u0012\u0004\u0012\u00020T\u0012\u0004\u0012\u00020T0¥\u0001H\u0004J\t\u0010¦\u0001\u001a\u00020TH\u0016J\t\u0010§\u0001\u001a\u00020TH\u0016J\t\u0010¨\u0001\u001a\u00020TH\u0016J\t\u0010©\u0001\u001a\u00020TH\u0016J\t\u0010ª\u0001\u001a\u00020TH\u0016J\u0007\u0010«\u0001\u001a\u00020\u000bJ\u0007\u0010¬\u0001\u001a\u00020(J\u0014\u0010\u00ad\u0001\u001a\u00020\u000b2\t\b\u0002\u0010®\u0001\u001a\u00020(H\u0007J\u001b\u0010¯\u0001\u001a\u00020\u00002\u0007\u0010°\u0001\u001a\u00020T2\u0007\u0010±\u0001\u001a\u00020TH\u0016J\u001b\u0010²\u0001\u001a\u00020\u00002\u0007\u0010³\u0001\u001a\u00020\u00002\u0007\u0010´\u0001\u001a\u00020\u0000H\u0016J\u001a\u0010µ\u0001\u001a\u00020\u00002\u0006\u0010p\u001a\u00020\u00002\u0007\u0010¶\u0001\u001a\u00020\u0005H\u0016J\u001b\u0010·\u0001\u001a\u00020\u00002\u0007\u0010³\u0001\u001a\u00020\u00002\u0007\u0010´\u0001\u001a\u00020\u0000H\u0016J\u0011\u0010¸\u0001\u001a\u00020(2\u0006\u0010p\u001a\u00020\u0000H\u0016J\u0012\u0010¹\u0001\u001a\u00020(2\u0007\u0010º\u0001\u001a\u00020\u0000H\u0002J\t\u0010»\u0001\u001a\u00020(H\u0016J\u001b\u0010¼\u0001\u001a\u00020(2\u0007\u0010°\u0001\u001a\u00020T2\u0007\u0010±\u0001\u001a\u00020TH\u0016J\t\u0010½\u0001\u001a\u00020(H\u0016J\u0019\u0010¾\u0001\u001a\u00020\u000b2\u0006\u0010>\u001a\u00020;2\u0006\u0010?\u001a\u00020\u0005H\u0016J\u0007\u0010¿\u0001\u001a\u00020\u000bJ\u0007\u0010\u00c0\u0001\u001a\u00020\nJ!\u0010\u00c1\u0001\u001a\u00020\u000b2\u0006\u0010U\u001a\u00020E2\u0006\u0010V\u001a\u00020E2\u0006\u0010W\u001a\u00020\u0005H\u0016J!\u0010\u00c2\u0001\u001a\u00020\u000b2\u0006\u0010U\u001a\u00020\u00052\u0006\u0010V\u001a\u00020\u00052\u0006\u0010W\u001a\u00020\u0005H\u0017J\u0012\u0010\u00c3\u0001\u001a\u00020\u000b2\u0007\u0010\u00c4\u0001\u001a\u00020\u000fH\u0016J\t\u0010\u00c5\u0001\u001a\u00020\u000bH\u0016J\u0012\u0010\u00c6\u0001\u001a\u00020\u000b2\u0007\u0010\u00c7\u0001\u001a\u00020EH\u0016J!\u0010\u00c8\u0001\u001a\u00020\u00002\u0018\u0010\u00c9\u0001\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0002\b\fJ!\u0010\u00ca\u0001\u001a\u00020\u00002\u0018\u0010\u00c9\u0001\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0002\b\fJK\u0010\u00cb\u0001\u001a\u00020\u00002B\u0010\u00cc\u0001\u001a=\u0012\u0004\u0012\u00020\u0000\u0012\u0013\u0012\u00110;¢\u0006\f\b<\u0012\b\b=\u0012\u0004\b\b(>\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b<\u0012\b\b=\u0012\u0004\b\b(?\u0012\u0004\u0012\u00020\u000b0:¢\u0006\u0002\b\fJ\u001d\u0010\u00cd\u0001\u001a\u00020\u000b2\u0014\u0010\u00cc\u0001\u001a\u000f\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020\u00050\u00ce\u0001J7\u0010\u00cf\u0001\u001a\u00020\u00002.\u0010\u00cc\u0001\u001a)\u0012\u0004\u0012\u00020\u0000\u0012\u0014\u0012\u00120P¢\u0006\r\b<\u0012\t\b=\u0012\u0005\b\b(\u0098\u0001\u0012\u0004\u0012\u00020\u000b0O¢\u0006\u0002\b\fJ\u0017\u0010\u00d0\u0001\u001a\u00020\u00002\u000e\u0010\u00cc\u0001\u001a\t\u0012\u0004\u0012\u00020P0\u00d1\u0001Ja\u0010\u00d2\u0001\u001a\u00020\u00002X\u0010\u00cc\u0001\u001aS\u0012\u0004\u0012\u00020\u0000\u0012\u0013\u0012\u00110T¢\u0006\f\b<\u0012\b\b=\u0012\u0004\b\b(U\u0012\u0013\u0012\u00110T¢\u0006\f\b<\u0012\b\b=\u0012\u0004\b\b(V\u0012\u0014\u0012\u00120\u0005¢\u0006\r\b<\u0012\t\b=\u0012\u0005\b\b(\u00d3\u0001\u0012\u0004\u0012\u00020\u000b0S¢\u0006\u0002\b\fJ#\u0010\u00d4\u0001\u001a\u00020\u00002\u001a\u0010\u00cc\u0001\u001a\u0015\u0012\u0004\u0012\u00020T\u0012\u0004\u0012\u00020T\u0012\u0004\u0012\u00020\u00050\u00d5\u0001J!\u0010\u00d6\u0001\u001a\u00020\u00002\u0018\u0010\u00cc\u0001\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0002\b\fJ\u0011\u0010\u00d7\u0001\u001a\u00020\u00002\b\u0010\u00cc\u0001\u001a\u00030\u00d8\u0001J!\u0010\u00d9\u0001\u001a\u00020\u00002\u0018\u0010\u00cc\u0001\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0002\b\fJ\u0011\u0010\u00da\u0001\u001a\u00020\u00002\b\u0010\u00cc\u0001\u001a\u00030\u00d8\u0001J!\u0010\u00db\u0001\u001a\u00020\u00002\u0018\u0010\u00cc\u0001\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0002\b\fJ\u0011\u0010\u00dc\u0001\u001a\u00020\u00002\b\u0010\u00cc\u0001\u001a\u00030\u00d8\u0001J'\u0010\u00dd\u0001\u001a\u00020\u00002\u001e\u0010\u00cc\u0001\u001a\u0019\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020`\u0012\u0004\u0012\u00020\u000b0O¢\u0006\u0002\b\fJ\u0017\u0010\u00de\u0001\u001a\u00020\u00002\u000e\u0010\u00cc\u0001\u001a\t\u0012\u0004\u0012\u00020`0\u00d1\u0001J\t\u0010\u00df\u0001\u001a\u00020\u000bH\u0016J,\u0010\u00e0\u0001\u001a\u000f\u0012\u0004\u0012\u00020E\u0012\u0004\u0012\u00020E0¥\u00012\u0006\u0010U\u001a\u00020E2\u0006\u0010V\u001a\u00020EH\u0000¢\u0006\u0003\b\u00e1\u0001J\u0014\u0010\u00e2\u0001\u001a\u00020\u000b2\t\u0010\u00c4\u0001\u001a\u0004\u0018\u00010\u000fH\u0002J\u0007\u0010\u00e3\u0001\u001a\u00020\u000bJ\u0011\u0010\u00e4\u0001\u001a\u00020\u00002\u0006\u0010p\u001a\u00020\u0000H\u0016J\u0013\u0010\u00e5\u0001\u001a\u00020\u000b\"\u0007\b\u0000\u0010\u0086\u0001\u0018\u0001H\u0086\bJ\u0010\u0010\u00e5\u0001\u001a\u00020\u000b2\u0007\u0010\u0094\u0001\u001a\u00020+J#\u0010\u00e5\u0001\u001a\u00020\u000b\"\t\b\u0000\u0010\u0086\u0001*\u00020+2\u000f\u0010\u0087\u0001\u001a\n\u0012\u0005\u0012\u0003H\u0086\u00010\u0088\u0001J\u001b\u0010\u00e6\u0001\u001a\u00020\u00002\u0007\u0010³\u0001\u001a\u00020\u00002\u0007\u0010\u00e7\u0001\u001a\u00020\u0000H\u0016J\t\u0010\u00e8\u0001\u001a\u00020\u000bH\u0004J\u000f\u0010\u00e9\u0001\u001a\u00020\u00002\u0006\u0010g\u001a\u00020\u0000J\u0011\u0010\u00ea\u0001\u001a\u00020\u00002\b\u0010\u00eb\u0001\u001a\u00030\u00ec\u0001J\u0011\u0010\u00ea\u0001\u001a\u00020\u00002\b\u0010\u00ed\u0001\u001a\u00030\u009f\u0001J\u0010\u0010\u00ee\u0001\u001a\u00020\u000b2\u0007\u0010\u00ef\u0001\u001a\u00020(J\u0011\u0010\u00f0\u0001\u001a\u00020\u00002\b\u0010\u00f1\u0001\u001a\u00030¡\u0001J\u0011\u0010\u00f2\u0001\u001a\u00020\u00002\b\u0010\u00eb\u0001\u001a\u00030\u00f3\u0001J\u0011\u0010\u00f4\u0001\u001a\u00020\u00002\b\u0010\u00eb\u0001\u001a\u00030\u00f5\u0001J\u0011\u0010\u00f6\u0001\u001a\u00020\u00002\b\u0010\u00eb\u0001\u001a\u00030\u00f3\u0001J\u0011\u0010\u00f7\u0001\u001a\u00020\u00002\b\u0010\u00eb\u0001\u001a\u00030\u00f8\u0001J\u0013\u0010\u00f9\u0001\u001a\u00020\u000b2\b\u0010\u00fa\u0001\u001a\u00030\u00fb\u0001H\u0002J\u0011\u0010\u00fc\u0001\u001a\u00020\u00002\b\u0010\u00eb\u0001\u001a\u00030\u00fd\u0001J\u0011\u0010\u00fe\u0001\u001a\u00020\u00002\b\u0010\u00eb\u0001\u001a\u00030\u00ff\u0001J \u0010\u0080\u0002\u001a\u00020\u00052\u0007\u0010\u008a\u0001\u001a\u00020C2\u000e\u0010\u008c\u0001\u001a\t\u0012\u0004\u0012\u00020\u000b0\u008b\u0001J0\u0010\u0081\u0002\u001a\u00020\u00052\u0007\u0010\u0082\u0002\u001a\u00020C2\t\b\u0002\u0010\u008a\u0001\u001a\u00020C2\u0013\u0010\u008c\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\tJ\u0010\u0010\u0083\u0002\u001a\u00020(2\u0007\u0010\u0084\u0002\u001a\u00020\u0005J\u0010\u0010\u0085\u0002\u001a\u00020(2\u0007\u0010\u0084\u0002\u001a\u00020\u0005J7\u0010\u0086\u0002\u001a\t\u0012\u0004\u0012\u00020\u000b0\u008b\u00012\u0007\u0010\u0082\u0002\u001a\u00020C2\t\b\u0002\u0010\u008a\u0001\u001a\u00020C2\u0013\u0010\u008c\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\tJ\u0012\u0010\u0087\u0002\u001a\u00020\u000b2\t\b\u0002\u0010\u0088\u0002\u001a\u00020(J\u001b\u0010\u0089\u0002\u001a\u00020(2\u0007\u0010\u008a\u0002\u001a\u00020T2\u0007\u0010\u008a\u0001\u001a\u00020TH\u0002J)\u0010\u008b\u0002\u001a\u0003H\u008c\u0002\"\u0005\b\u0000\u0010\u008c\u00022\u000f\u0010\u009c\u0001\u001a\n\u0012\u0005\u0012\u0003H\u008c\u00020\u008b\u0001H\u0082\b¢\u0006\u0003\u0010\u008d\u0002J;\u0010\u008e\u0002\u001a\u00020\u000b*\n\u0012\u0005\u0012\u00030\u009f\u00010\u008f\u00022\b\u0010\u0090\u0002\u001a\u00030\u0091\u00022\u0007\u0010\u008a\u0002\u001a\u00020T2\b\u0010\u0092\u0002\u001a\u00030\u009f\u00012\t\b\u0002\u0010\u008a\u0001\u001a\u00020TJ9\u0010\u008e\u0002\u001a\u00020\u000b*\t\u0012\u0004\u0012\u00020E0\u008f\u00022\b\u0010\u0090\u0002\u001a\u00030\u0091\u00022\u0007\u0010\u008a\u0002\u001a\u00020T2\u0007\u0010\u0092\u0002\u001a\u00020E2\t\b\u0002\u0010\u008a\u0001\u001a\u00020TJ9\u0010\u008e\u0002\u001a\u00020\u000b*\t\u0012\u0004\u0012\u00020T0\u008f\u00022\b\u0010\u0090\u0002\u001a\u00030\u0091\u00022\u0007\u0010\u008a\u0002\u001a\u00020T2\u0007\u0010\u0092\u0002\u001a\u00020T2\t\b\u0002\u0010\u008a\u0001\u001a\u00020TJ9\u0010\u008e\u0002\u001a\u00020\u000b*\t\u0012\u0004\u0012\u00020\u00050\u008f\u00022\b\u0010\u0090\u0002\u001a\u00030\u0091\u00022\u0007\u0010\u008a\u0002\u001a\u00020T2\u0007\u0010\u0092\u0002\u001a\u00020\u00052\t\b\u0002\u0010\u008a\u0001\u001a\u00020TJ9\u0010\u008e\u0002\u001a\u00020\u000b*\t\u0012\u0004\u0012\u00020C0\u008f\u00022\b\u0010\u0090\u0002\u001a\u00030\u0091\u00022\u0007\u0010\u008a\u0002\u001a\u00020T2\u0007\u0010\u0092\u0002\u001a\u00020C2\t\b\u0002\u0010\u008a\u0001\u001a\u00020TJ\u0010\u0010\u0093\u0002\u001a\u00020\u000b*\u0007\u0012\u0002\b\u00030\u008f\u0002R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R%\u0010\u0007\u001a\u0019\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0002\b\f0\bX\u0082\u0004¢\u0006\u0002\n\u0000R%\u0010\r\u001a\u0019\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0002\b\f0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u0014\u001a\u0010\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\u00000\u00000\u0015X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0019\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u001a\u001a\u00020\u001b8FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR$\u0010\"\u001a\u00020!2\u0006\u0010 \u001a\u00020!@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u000e\u0010'\u001a\u00020(X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020(X\u0082\u000e¢\u0006\u0002\n\u0000R\u0017\u0010*\u001a\b\u0012\u0004\u0012\u00020+0\b¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0018\u0010.\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u0003000/X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u00101\u001a\u00020(8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u00103R\u000e\u00104\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00105\u001a\u00020(X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u00106\u001a\u00020(X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u00103\"\u0004\b7\u00108RR\u00109\u001aC\u0012?\u0012=\u0012\u0004\u0012\u00020\u0000\u0012\u0013\u0012\u00110;¢\u0006\f\b<\u0012\b\b=\u0012\u0004\b\b(>\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b<\u0012\b\b=\u0012\u0004\b\b(?\u0012\u0004\u0012\u00020\u000b0:¢\u0006\u0002\b\f0\b¢\u0006\b\n\u0000\u001a\u0004\b@\u0010-R\u000e\u0010A\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010B\u001a\u00020CX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010D\u001a\u0004\u0018\u00010EX\u0086\u000e¢\u0006\u0010\n\u0002\u0010J\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\u001e\u0010K\u001a\u0004\u0018\u00010EX\u0086\u000e¢\u0006\u0010\n\u0002\u0010J\u001a\u0004\bL\u0010G\"\u0004\bM\u0010IR.\u0010N\u001a\u001f\u0012\u001b\u0012\u0019\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020P\u0012\u0004\u0012\u00020\u000b0O¢\u0006\u0002\b\f0\b¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010-Rg\u0010R\u001aX\u0012T\u0012R\u0012\u0004\u0012\u00020\u0000\u0012\u0013\u0012\u00110T¢\u0006\f\b<\u0012\b\b=\u0012\u0004\b\b(U\u0012\u0013\u0012\u00110T¢\u0006\f\b<\u0012\b\b=\u0012\u0004\b\b(V\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b<\u0012\b\b=\u0012\u0004\b\b(W\u0012\u0004\u0012\u00020\u000b0S¢\u0006\u0002\b\f0\b¢\u0006\b\n\u0000\u001a\u0004\bX\u0010-R(\u0010Y\u001a\u0019\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0002\b\f0\b¢\u0006\b\n\u0000\u001a\u0004\bZ\u0010-R(\u0010[\u001a\u0019\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0002\b\f0\b¢\u0006\b\n\u0000\u001a\u0004\b\\\u0010-R(\u0010]\u001a\u0019\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0002\b\f0\b¢\u0006\b\n\u0000\u001a\u0004\b^\u0010-R7\u0010_\u001a\u001f\u0012\u001b\u0012\u0019\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020`\u0012\u0004\u0012\u00020\u000b0O¢\u0006\u0002\b\f0\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\ba\u0010-\"\u0004\bb\u0010cR\u000e\u0010d\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R%\u0010e\u001a\u0019\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0002\b\f0\bX\u0082\u0004¢\u0006\u0002\n\u0000R%\u0010f\u001a\u0019\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0002\b\f0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010g\u001a\u00020\u0000X\u0096.¢\u0006\u000e\n\u0000\u001a\u0004\bh\u0010i\"\u0004\bj\u0010kR\u0014\u0010l\u001a\b\u0012\u0004\u0012\u00020\u00050mX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010n\u001a\u00020(X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0096\u0002" }, d2 = { "Lgg/essential/elementa/UIComponent;", "Ljava/util/Observable;", "()V", "activeTimers", "", "", "Lgg/essential/elementa/UIComponent$Timer;", "afterUnhideAnimations", "", "Lkotlin/Function1;", "Lgg/essential/elementa/constraints/animation/AnimatingConstraints;", "", "Lkotlin/ExtensionFunctionType;", "beforeHideAnimations", "cachedWindow", "Lgg/essential/elementa/components/Window;", "getCachedWindow$Elementa", "()Lgg/essential/elementa/components/Window;", "setCachedWindow$Elementa", "(Lgg/essential/elementa/components/Window;)V", "children", "Lgg/essential/elementa/utils/ObservableList;", "kotlin.jvm.PlatformType", "getChildren", "()Lgg/essential/elementa/utils/ObservableList;", "childrenLocked", "componentName", "", "getComponentName", "()Ljava/lang/String;", "setComponentName", "(Ljava/lang/String;)V", "value", "Lgg/essential/elementa/UIConstraints;", "constraints", "getConstraints", "()Lgg/essential/elementa/UIConstraints;", "setConstraints", "(Lgg/essential/elementa/UIConstraints;)V", "currentlyHovered", "", "didCallBeforeDraw", "effects", "Lgg/essential/elementa/effects/Effect;", "getEffects", "()Ljava/util/List;", "fieldAnimationQueue", "Ljava/util/concurrent/ConcurrentLinkedDeque;", "Lgg/essential/elementa/constraints/animation/FieldAnimationComponent;", "hasParent", "getHasParent", "()Z", "indexInParent", "isFloating", "isInitialized", "setInitialized", "(Z)V", "keyTypedListeners", "Lkotlin/Function3;", "", "Lkotlin/ParameterName;", "name", "typedChar", "keyCode", "getKeyTypedListeners", "lastClickCount", "lastClickTime", "", "lastDraggedMouseX", "", "getLastDraggedMouseX", "()Ljava/lang/Double;", "setLastDraggedMouseX", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "lastDraggedMouseY", "getLastDraggedMouseY", "setLastDraggedMouseY", "mouseClickListeners", "Lkotlin/Function2;", "Lgg/essential/elementa/events/UIClickEvent;", "getMouseClickListeners", "mouseDragListeners", "Lkotlin/Function4;", "", "mouseX", "mouseY", "button", "getMouseDragListeners", "mouseEnterListeners", "getMouseEnterListeners", "mouseLeaveListeners", "getMouseLeaveListeners", "mouseReleaseListeners", "getMouseReleaseListeners", "mouseScrollListeners", "Lgg/essential/elementa/events/UIScrollEvent;", "getMouseScrollListeners", "setMouseScrollListeners", "(Ljava/util/List;)V", "nextTimerId", "onFocusActions", "onFocusLostActions", "parent", "getParent", "()Lgg/essential/elementa/UIComponent;", "setParent", "(Lgg/essential/elementa/UIComponent;)V", "stoppedTimers", "", "warnedAboutBeforeDraw", "addChild", "component", "addChildren", "components", "", "([Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;", "afterDraw", "matrixStack", "Lgg/essential/universal/UMatrixStack;", "afterDrawCompat", "afterInitialization", "alwaysDrawChildren", "animateAfterUnhide", "animation", "animateBeforeHide", "animateTo", "animationFrame", "beforeChildrenDraw", "beforeChildrenDrawCompat", "beforeDraw", "beforeDrawCompat", "childrenOfType", "", "T", "clazz", "Ljava/lang/Class;", "clearChildren", "delay", "Lkotlin/Function0;", "callback", "depth", "doDragMouse", "superCall", "dragMouse", "draw", "drawCompat", "enableEffect", "effect", "enableEffects", "([Lgg/essential/elementa/effects/Effect;)Lgg/essential/elementa/UIComponent;", "fireClickEvent", "event", "fireScrollEvent", "focus", "forEachChild", "block", "getBottom", "getColor", "Ljava/awt/Color;", "getFontProvider", "Lgg/essential/elementa/font/FontProvider;", "getHeight", "getLeft", "getMousePosition", "Lkotlin/Pair;", "getRadius", "getRight", "getTextScale", "getTop", "getWidth", "grabWindowFocus", "hasFocus", "hide", "instantly", "hitTest", "x", "y", "insertChildAfter", "newComponent", "targetComponent", "insertChildAt", "index", "insertChildBefore", "isChildOf", "isComponentInParentChain", "target", "isHovered", "isPointInside", "isPositionCenter", "keyType", "loseFocus", "makeAnimation", "mouseClick", "mouseDrag", "mouseMove", "window", "mouseRelease", "mouseScroll", "delta", "onFocus", "listener", "onFocusLost", "onKeyType", "method", "onKeyTypeConsumer", "Ljava/util/function/BiConsumer;", "onMouseClick", "onMouseClickConsumer", "Ljava/util/function/Consumer;", "onMouseDrag", "mouseButton", "onMouseDragConsumer", "Lgg/essential/elementa/utils/TriConsumer;", "onMouseEnter", "onMouseEnterRunnable", "Ljava/lang/Runnable;", "onMouseLeave", "onMouseLeaveRunnable", "onMouseRelease", "onMouseReleaseRunnable", "onMouseScroll", "onMouseScrollConsumer", "onWindowResize", "pixelCoordinatesToPixelCenter", "pixelCoordinatesToPixelCenter$Elementa", "recursivelySetWindowCache", "releaseWindowFocus", "removeChild", "removeEffect", "replaceChild", "componentToReplace", "requireChildrenUnlocked", "setChildOf", "setColor", "constraint", "Lgg/essential/elementa/constraints/ColorConstraint;", "color", "setFloating", "floating", "setFontProvider", "fontProvider", "setHeight", "Lgg/essential/elementa/constraints/HeightConstraint;", "setRadius", "Lgg/essential/elementa/constraints/RadiusConstraint;", "setTextScale", "setWidth", "Lgg/essential/elementa/constraints/WidthConstraint;", "setWindowCacheOnChangedChild", "possibleEvent", "", "setX", "Lgg/essential/elementa/constraints/XConstraint;", "setY", "Lgg/essential/elementa/constraints/YConstraint;", "startDelay", "startTimer", "interval", "stopDelay", "id", "stopTimer", "timer", "unhide", "useLastPosition", "validateAnimationFields", "time", "withChildrenLocked", "R", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "animate", "Lkotlin/reflect/KMutableProperty0;", "strategy", "Lgg/essential/elementa/constraints/animation/AnimationStrategy;", "newValue", "stopAnimating", "Companion", "Timer", "Elementa" })
public abstract class UIComponent extends Observable
{
    @NotNull
    public static final Companion Companion;
    @NotNull
    private String componentName;
    @NotNull
    private final ObservableList<UIComponent> children;
    @NotNull
    private final List<Effect> effects;
    private int childrenLocked;
    public UIComponent parent;
    @NotNull
    private UIConstraints constraints;
    @Nullable
    private Double lastDraggedMouseX;
    @Nullable
    private Double lastDraggedMouseY;
    @NotNull
    private List<Function2<UIComponent, UIScrollEvent, Unit>> mouseScrollListeners;
    @NotNull
    private final List<Function2<UIComponent, UIClickEvent, Unit>> mouseClickListeners;
    private long lastClickTime;
    private int lastClickCount;
    @NotNull
    private final List<Function1<UIComponent, Unit>> mouseReleaseListeners;
    @NotNull
    private final List<Function1<UIComponent, Unit>> mouseEnterListeners;
    @NotNull
    private final List<Function1<UIComponent, Unit>> mouseLeaveListeners;
    @NotNull
    private final List<Function4<UIComponent, Float, Float, Integer, Unit>> mouseDragListeners;
    @NotNull
    private final List<Function3<UIComponent, Character, Integer, Unit>> keyTypedListeners;
    private boolean currentlyHovered;
    @NotNull
    private final List<Function1<AnimatingConstraints, Unit>> beforeHideAnimations;
    @NotNull
    private final List<Function1<AnimatingConstraints, Unit>> afterUnhideAnimations;
    @NotNull
    private final List<Function1<UIComponent, Unit>> onFocusActions;
    @NotNull
    private final List<Function1<UIComponent, Unit>> onFocusLostActions;
    private int indexInParent;
    @NotNull
    private final ConcurrentLinkedDeque<FieldAnimationComponent<?>> fieldAnimationQueue;
    @NotNull
    private final Map<Integer, Timer> activeTimers;
    @NotNull
    private final Set<Integer> stoppedTimers;
    private int nextTimerId;
    private boolean isInitialized;
    private boolean isFloating;
    private boolean didCallBeforeDraw;
    private boolean warnedAboutBeforeDraw;
    @Nullable
    private Window cachedWindow;
    @NotNull
    private static final String defaultComponentName;
    private static final double DEBUG_OUTLINE_WIDTH;
    
    public UIComponent() {
        super();
        this.componentName = UIComponent.defaultComponentName;
        this.children = ObservableListKt.observable(new CopyOnWriteArrayList<UIComponent>());
        this.effects = new ArrayList<Effect>();
        this.getChildren().addObserver(UIComponent::_init_$lambda-0);
        this.getChildren().addObserver(UIComponent::_init_$lambda-1);
        this.constraints = new UIConstraints(this);
        this.mouseScrollListeners = new ArrayList<Function2<UIComponent, UIScrollEvent, Unit>>();
        this.mouseClickListeners = new ArrayList<Function2<UIComponent, UIClickEvent, Unit>>();
        this.lastClickTime = System.currentTimeMillis();
        this.mouseReleaseListeners = new ArrayList<Function1<UIComponent, Unit>>();
        this.mouseEnterListeners = new ArrayList<Function1<UIComponent, Unit>>();
        this.mouseLeaveListeners = new ArrayList<Function1<UIComponent, Unit>>();
        this.mouseDragListeners = new ArrayList<Function4<UIComponent, Float, Float, Integer, Unit>>();
        this.keyTypedListeners = new ArrayList<Function3<UIComponent, Character, Integer, Unit>>();
        this.beforeHideAnimations = new ArrayList<Function1<AnimatingConstraints, Unit>>();
        this.afterUnhideAnimations = new ArrayList<Function1<AnimatingConstraints, Unit>>();
        this.onFocusActions = new ArrayList<Function1<UIComponent, Unit>>();
        this.onFocusLostActions = new ArrayList<Function1<UIComponent, Unit>>();
        this.fieldAnimationQueue = new ConcurrentLinkedDeque<FieldAnimationComponent<?>>();
        this.activeTimers = new LinkedHashMap<Integer, Timer>();
        this.stoppedTimers = new LinkedHashSet<Integer>();
    }
    
    @NotNull
    public final String getComponentName() {
        if (this.componentName == UIComponent.defaultComponentName) {
            final String simpleName = this.getClass().getSimpleName();
            Intrinsics.checkNotNullExpressionValue((Object)simpleName, "this.javaClass.simpleName");
            this.componentName = simpleName;
        }
        return this.componentName;
    }
    
    public final void setComponentName(@NotNull final String <set-?>) {
        Intrinsics.checkNotNullParameter((Object)<set-?>, "<set-?>");
        this.componentName = <set-?>;
    }
    
    @NotNull
    public ObservableList<UIComponent> getChildren() {
        return this.children;
    }
    
    @NotNull
    public final List<Effect> getEffects() {
        return this.effects;
    }
    
    @NotNull
    public UIComponent getParent() {
        final UIComponent parent = this.parent;
        if (parent != null) {
            return parent;
        }
        Intrinsics.throwUninitializedPropertyAccessException("parent");
        return null;
    }
    
    public void setParent(@NotNull final UIComponent <set-?>) {
        Intrinsics.checkNotNullParameter((Object)<set-?>, "<set-?>");
        this.parent = <set-?>;
    }
    
    public boolean getHasParent() {
        return this.parent != null;
    }
    
    @NotNull
    public final UIConstraints getConstraints() {
        return this.constraints;
    }
    
    public final void setConstraints(@NotNull final UIConstraints value) {
        Intrinsics.checkNotNullParameter((Object)value, "value");
        this.constraints = value;
        this.setChanged();
        this.notifyObservers(this.constraints);
    }
    
    @Nullable
    public final Double getLastDraggedMouseX() {
        return this.lastDraggedMouseX;
    }
    
    public final void setLastDraggedMouseX(@Nullable final Double <set-?>) {
        this.lastDraggedMouseX = <set-?>;
    }
    
    @Nullable
    public final Double getLastDraggedMouseY() {
        return this.lastDraggedMouseY;
    }
    
    public final void setLastDraggedMouseY(@Nullable final Double <set-?>) {
        this.lastDraggedMouseY = <set-?>;
    }
    
    @NotNull
    public final List<Function2<UIComponent, UIScrollEvent, Unit>> getMouseScrollListeners() {
        return this.mouseScrollListeners;
    }
    
    public final void setMouseScrollListeners(@NotNull final List<Function2<UIComponent, UIScrollEvent, Unit>> <set-?>) {
        Intrinsics.checkNotNullParameter((Object)<set-?>, "<set-?>");
        this.mouseScrollListeners = <set-?>;
    }
    
    @NotNull
    public final List<Function2<UIComponent, UIClickEvent, Unit>> getMouseClickListeners() {
        return this.mouseClickListeners;
    }
    
    @NotNull
    public final List<Function1<UIComponent, Unit>> getMouseReleaseListeners() {
        return this.mouseReleaseListeners;
    }
    
    @NotNull
    public final List<Function1<UIComponent, Unit>> getMouseEnterListeners() {
        return this.mouseEnterListeners;
    }
    
    @NotNull
    public final List<Function1<UIComponent, Unit>> getMouseLeaveListeners() {
        return this.mouseLeaveListeners;
    }
    
    @NotNull
    public final List<Function4<UIComponent, Float, Float, Integer, Unit>> getMouseDragListeners() {
        return this.mouseDragListeners;
    }
    
    @NotNull
    public final List<Function3<UIComponent, Character, Integer, Unit>> getKeyTypedListeners() {
        return this.keyTypedListeners;
    }
    
    protected final boolean isInitialized() {
        return this.isInitialized;
    }
    
    protected final void setInitialized(final boolean <set-?>) {
        this.isInitialized = <set-?>;
    }
    
    @Nullable
    public final Window getCachedWindow$Elementa() {
        return this.cachedWindow;
    }
    
    public final void setCachedWindow$Elementa(@Nullable final Window <set-?>) {
        this.cachedWindow = <set-?>;
    }
    
    private final void setWindowCacheOnChangedChild(final Object possibleEvent) {
        final ObservableListEvent observableListEvent = (possibleEvent instanceof ObservableListEvent) ? ((ObservableListEvent)possibleEvent) : null;
        if (observableListEvent == null) {
            return;
        }
        final ObservableListEvent event = observableListEvent;
        if (event instanceof ObservableAddEvent) {
            ((UIComponent)((ObservableAddEvent)event).getElement().getValue()).recursivelySetWindowCache(Window.Companion.ofOrNull(this));
        }
        else if (event instanceof ObservableRemoveEvent) {
            ((UIComponent)((ObservableRemoveEvent)event).getElement().getValue()).recursivelySetWindowCache(null);
        }
        else if (event instanceof ObservableClearEvent) {
            final Iterable $this$forEach$iv = ((ObservableClearEvent)event).getOldChildren();
            final int $i$f$forEach = 0;
            for (final Object element$iv : $this$forEach$iv) {
                final UIComponent it = (UIComponent)element$iv;
                final int n = 0;
                it.recursivelySetWindowCache(null);
            }
        }
    }
    
    private final void recursivelySetWindowCache(final Window window) {
        this.cachedWindow = window;
        final Iterable $this$forEach$iv = this.getChildren();
        final int $i$f$forEach = 0;
        for (final Object element$iv : $this$forEach$iv) {
            final UIComponent it = (UIComponent)element$iv;
            final int n = 0;
            it.recursivelySetWindowCache(window);
        }
    }
    
    protected final void requireChildrenUnlocked() {
        InvalidUsageKt.requireState(this.childrenLocked == 0, "Cannot modify children while iterating over them.");
    }
    
    private final <R> R withChildrenLocked(final Function0<? extends R> block) {
        final int $i$f$withChildrenLocked = 0;
        ++this.childrenLocked;
        try {
            return (R)block.invoke();
        }
        finally {
            InlineMarker.finallyStart(1);
            --this.childrenLocked;
            InlineMarker.finallyEnd(1);
        }
    }
    
    private final void forEachChild(final Function1<? super UIComponent, Unit> block) {
        final int $i$f$forEachChild = 0;
        final UIComponent this_$iv = this;
        final int $i$f$withChildrenLocked = 0;
        ++this_$iv.childrenLocked;
        try {
            final int n = 0;
            final Iterable $this$forEach$iv = this.getChildren();
            final int $i$f$forEach = 0;
            for (final Object element$iv : $this$forEach$iv) {
                block.invoke(element$iv);
            }
            final Unit instance = Unit.INSTANCE;
        }
        finally {
            InlineMarker.finallyStart(1);
            --this_$iv.childrenLocked;
            InlineMarker.finallyEnd(1);
        }
    }
    
    @NotNull
    public UIComponent addChild(@NotNull final UIComponent component) {
        Intrinsics.checkNotNullParameter((Object)component, "component");
        final UIComponent $this$addChild_u24lambda_u2d5 = this;
        final int n = 0;
        component.setParent($this$addChild_u24lambda_u2d5);
        $this$addChild_u24lambda_u2d5.getChildren().add(component);
        return this;
    }
    
    @NotNull
    public UIComponent insertChildAt(@NotNull final UIComponent component, final int index) {
        Intrinsics.checkNotNullParameter((Object)component, "component");
        final UIComponent $this$insertChildAt_u24lambda_u2d6 = this;
        final int n = 0;
        if (index < 0 || index > $this$insertChildAt_u24lambda_u2d6.getChildren().size()) {
            System.out.println((Object)("Bad index given to insertChildAt (index: " + index + ", children size: " + $this$insertChildAt_u24lambda_u2d6.getChildren().size()));
        }
        else {
            component.setParent($this$insertChildAt_u24lambda_u2d6);
            $this$insertChildAt_u24lambda_u2d6.getChildren().add(index, component);
        }
        return this;
    }
    
    @NotNull
    public UIComponent insertChildBefore(@NotNull final UIComponent newComponent, @NotNull final UIComponent targetComponent) {
        Intrinsics.checkNotNullParameter((Object)newComponent, "newComponent");
        Intrinsics.checkNotNullParameter((Object)targetComponent, "targetComponent");
        final UIComponent $this$insertChildBefore_u24lambda_u2d7 = this;
        final int n = 0;
        final int indexOfExisting = $this$insertChildBefore_u24lambda_u2d7.getChildren().indexOf(targetComponent);
        if (indexOfExisting == -1) {
            System.out.println((Object)"targetComponent given to insertChildBefore is not a child of this component");
        }
        else {
            newComponent.setParent($this$insertChildBefore_u24lambda_u2d7);
            $this$insertChildBefore_u24lambda_u2d7.getChildren().add(indexOfExisting, newComponent);
        }
        return this;
    }
    
    @NotNull
    public UIComponent insertChildAfter(@NotNull final UIComponent newComponent, @NotNull final UIComponent targetComponent) {
        Intrinsics.checkNotNullParameter((Object)newComponent, "newComponent");
        Intrinsics.checkNotNullParameter((Object)targetComponent, "targetComponent");
        final UIComponent $this$insertChildAfter_u24lambda_u2d8 = this;
        final int n = 0;
        final int indexOfExisting = $this$insertChildAfter_u24lambda_u2d8.getChildren().indexOf(targetComponent);
        if (indexOfExisting == -1) {
            System.out.println((Object)"targetComponent given to insertChildAfter is not a child of this component");
        }
        else {
            newComponent.setParent($this$insertChildAfter_u24lambda_u2d8);
            $this$insertChildAfter_u24lambda_u2d8.getChildren().add(indexOfExisting + 1, newComponent);
        }
        return this;
    }
    
    @NotNull
    public UIComponent replaceChild(@NotNull final UIComponent newComponent, @NotNull final UIComponent componentToReplace) {
        Intrinsics.checkNotNullParameter((Object)newComponent, "newComponent");
        Intrinsics.checkNotNullParameter((Object)componentToReplace, "componentToReplace");
        final UIComponent $this$replaceChild_u24lambda_u2d9 = this;
        final int n = 0;
        final int indexOfExisting = $this$replaceChild_u24lambda_u2d9.getChildren().indexOf(componentToReplace);
        if (indexOfExisting == -1) {
            System.out.println((Object)"componentToReplace given to replaceChild is not a child of this component");
        }
        else {
            newComponent.setParent($this$replaceChild_u24lambda_u2d9);
            $this$replaceChild_u24lambda_u2d9.getChildren().remove(indexOfExisting);
            $this$replaceChild_u24lambda_u2d9.getChildren().add(indexOfExisting, newComponent);
        }
        return this;
    }
    
    @NotNull
    public UIComponent addChildren(@NotNull final UIComponent... components) {
        Intrinsics.checkNotNullParameter((Object)components, "components");
        final UIComponent $this$addChildren_u24lambda_u2d11 = this;
        final int n = 0;
        final Object[] $this$forEach$iv = components;
        final int $i$f$forEach = 0;
        for (final UIComponent it : $this$forEach$iv) {
            final Object element$iv = it;
            final int n2 = 0;
            $this$addChildren_u24lambda_u2d11.addChild(it);
        }
        return this;
    }
    
    @NotNull
    public UIComponent removeChild(@NotNull final UIComponent component) {
        Intrinsics.checkNotNullParameter((Object)component, "component");
        final UIComponent $this$removeChild_u24lambda_u2d12 = this;
        final int n = 0;
        $this$removeChild_u24lambda_u2d12.getChildren().remove(component);
        return this;
    }
    
    @NotNull
    public UIComponent clearChildren() {
        final UIComponent $this$clearChildren_u24lambda_u2d13 = this;
        final int n = 0;
        $this$clearChildren_u24lambda_u2d13.getChildren().clear();
        return this;
    }
    
    public final /* synthetic */  <T> List<T> childrenOfType() {
        final int $i$f$childrenOfType = 0;
        Intrinsics.reifiedOperationMarker(4, "T");
        return this.childrenOfType((Class<T>)Object.class);
    }
    
    @NotNull
    public <T> List<T> childrenOfType(@NotNull final Class<T> clazz) {
        Intrinsics.checkNotNullParameter((Object)clazz, "clazz");
        return CollectionsKt.filterIsInstance((Iterable)this.getChildren(), (Class)clazz);
    }
    
    @NotNull
    public final AnimatingConstraints makeAnimation() {
        return new AnimatingConstraints(this, this.constraints);
    }
    
    public final void animateTo(@NotNull final AnimatingConstraints constraints) {
        Intrinsics.checkNotNullParameter((Object)constraints, "constraints");
        this.setConstraints(constraints);
    }
    
    @NotNull
    public final UIComponent enableEffects(@NotNull final Effect... effects) {
        Intrinsics.checkNotNullParameter((Object)effects, "effects");
        final UIComponent $this$enableEffects_u24lambda_u2d15 = this;
        final int n = 0;
        final Object[] $this$forEach$iv = effects;
        final int $i$f$forEach = 0;
        for (final Effect it : $this$forEach$iv) {
            final Object element$iv = it;
            final int n2 = 0;
            it.bindComponent($this$enableEffects_u24lambda_u2d15);
            if ($this$enableEffects_u24lambda_u2d15.isInitialized()) {
                it.setup();
            }
        }
        CollectionsKt.addAll((Collection)$this$enableEffects_u24lambda_u2d15.getEffects(), (Object[])effects);
        return this;
    }
    
    @NotNull
    public final UIComponent enableEffect(@NotNull final Effect effect) {
        Intrinsics.checkNotNullParameter((Object)effect, "effect");
        final UIComponent $this$enableEffect_u24lambda_u2d16 = this;
        final int n = 0;
        effect.bindComponent($this$enableEffect_u24lambda_u2d16);
        if ($this$enableEffect_u24lambda_u2d16.isInitialized()) {
            effect.setup();
        }
        $this$enableEffect_u24lambda_u2d16.getEffects().add(effect);
        return this;
    }
    
    public final /* synthetic */  <T> void removeEffect() {
        final int $i$f$removeEffect = 0;
        final List<Effect> effects = this.getEffects();
        Intrinsics.needClassReification();
        effects.removeIf((Predicate<? super Object>)UIComponent$removeEffect.UIComponent$removeEffect$1.INSTANCE);
    }
    
    public final <T extends Effect> void removeEffect(@NotNull final Class<T> clazz) {
        Intrinsics.checkNotNullParameter((Object)clazz, "clazz");
        this.effects.removeIf(UIComponent::removeEffect$lambda-17);
    }
    
    public final void removeEffect(@NotNull final Effect effect) {
        Intrinsics.checkNotNullParameter((Object)effect, "effect");
        this.effects.remove(effect);
    }
    
    @NotNull
    public final UIComponent setChildOf(@NotNull final UIComponent parent) {
        Intrinsics.checkNotNullParameter((Object)parent, "parent");
        final UIComponent $this$setChildOf_u24lambda_u2d18 = this;
        final int n = 0;
        parent.addChild($this$setChildOf_u24lambda_u2d18);
        return this;
    }
    
    @NotNull
    public final UIComponent setX(@NotNull final XConstraint constraint) {
        Intrinsics.checkNotNullParameter((Object)constraint, "constraint");
        final UIComponent $this$setX_u24lambda_u2d19 = this;
        final int n = 0;
        $this$setX_u24lambda_u2d19.getConstraints().withX(constraint);
        return this;
    }
    
    @NotNull
    public final UIComponent setY(@NotNull final YConstraint constraint) {
        Intrinsics.checkNotNullParameter((Object)constraint, "constraint");
        final UIComponent $this$setY_u24lambda_u2d20 = this;
        final int n = 0;
        $this$setY_u24lambda_u2d20.getConstraints().withY(constraint);
        return this;
    }
    
    @NotNull
    public final UIComponent setWidth(@NotNull final WidthConstraint constraint) {
        Intrinsics.checkNotNullParameter((Object)constraint, "constraint");
        final UIComponent $this$setWidth_u24lambda_u2d21 = this;
        final int n = 0;
        $this$setWidth_u24lambda_u2d21.getConstraints().withWidth(constraint);
        return this;
    }
    
    @NotNull
    public final UIComponent setHeight(@NotNull final HeightConstraint constraint) {
        Intrinsics.checkNotNullParameter((Object)constraint, "constraint");
        final UIComponent $this$setHeight_u24lambda_u2d22 = this;
        final int n = 0;
        $this$setHeight_u24lambda_u2d22.getConstraints().withHeight(constraint);
        return this;
    }
    
    @NotNull
    public final UIComponent setRadius(@NotNull final RadiusConstraint constraint) {
        Intrinsics.checkNotNullParameter((Object)constraint, "constraint");
        final UIComponent $this$setRadius_u24lambda_u2d23 = this;
        final int n = 0;
        $this$setRadius_u24lambda_u2d23.getConstraints().withRadius(constraint);
        return this;
    }
    
    @NotNull
    public final UIComponent setTextScale(@NotNull final HeightConstraint constraint) {
        Intrinsics.checkNotNullParameter((Object)constraint, "constraint");
        final UIComponent $this$setTextScale_u24lambda_u2d24 = this;
        final int n = 0;
        $this$setTextScale_u24lambda_u2d24.getConstraints().withTextScale(constraint);
        return this;
    }
    
    @NotNull
    public final UIComponent setFontProvider(@NotNull final FontProvider fontProvider) {
        Intrinsics.checkNotNullParameter((Object)fontProvider, "fontProvider");
        final UIComponent $this$setFontProvider_u24lambda_u2d25 = this;
        final int n = 0;
        $this$setFontProvider_u24lambda_u2d25.getConstraints().setFontProvider(fontProvider);
        return this;
    }
    
    @NotNull
    public final UIComponent setColor(@NotNull final ColorConstraint constraint) {
        Intrinsics.checkNotNullParameter((Object)constraint, "constraint");
        final UIComponent $this$setColor_u24lambda_u2d26 = this;
        final int n = 0;
        $this$setColor_u24lambda_u2d26.getConstraints().withColor(constraint);
        return this;
    }
    
    @NotNull
    public final UIComponent setColor(@NotNull final Color color) {
        Intrinsics.checkNotNullParameter((Object)color, "color");
        return this.setColor(UtilitiesKt.toConstraint(color));
    }
    
    public float getLeft() {
        return this.constraints.getX();
    }
    
    public float getTop() {
        return this.constraints.getY();
    }
    
    public float getRight() {
        return this.getLeft() + this.getWidth();
    }
    
    public float getBottom() {
        return this.getTop() + this.getHeight();
    }
    
    public float getWidth() {
        return this.constraints.getWidth();
    }
    
    public float getHeight() {
        return this.constraints.getHeight();
    }
    
    public float getRadius() {
        return this.constraints.getRadius();
    }
    
    public float getTextScale() {
        return this.constraints.getTextScale();
    }
    
    @NotNull
    public FontProvider getFontProvider() {
        return this.constraints.getFontProvider();
    }
    
    @NotNull
    public Color getColor() {
        return this.constraints.getColor();
    }
    
    public boolean isPositionCenter() {
        return false;
    }
    
    public boolean isHovered() {
        final Pair<Float, Float> mousePosition = this.getMousePosition();
        final float mouseX = ((Number)mousePosition.component1()).floatValue();
        final float mouseY = ((Number)mousePosition.component2()).floatValue();
        return this.isPointInside(mouseX, mouseY);
    }
    
    @NotNull
    protected final Pair<Float, Float> getMousePosition() {
        final Pair $dstr$x$y = this.pixelCoordinatesToPixelCenter$Elementa(UMouse.Scaled.getX(), UMouse.Scaled.getY());
        final int n = 0;
        final double x = ((Number)$dstr$x$y.component1()).doubleValue();
        final double y = ((Number)$dstr$x$y.component2()).doubleValue();
        return (Pair<Float, Float>)TuplesKt.to((Object)(float)x, (Object)(float)y);
    }
    
    @NotNull
    public final Pair<Double, Double> pixelCoordinatesToPixelCenter$Elementa(final double mouseX, final double mouseY) {
        final Window ofOrNull = Window.Companion.ofOrNull(this);
        ElementaVersion v0$Elementa = (ofOrNull == null) ? null : ofOrNull.getVersion$Elementa();
        if (v0$Elementa == null) {
            v0$Elementa = ElementaVersion.Companion.getV0$Elementa();
        }
        Pair pair;
        if (v0$Elementa.compareTo((ElementaVersion)ElementaVersion.Companion.getV2$Elementa()) >= 0) {
            final double halfPixel = 0.5 / UResolution.getScaleFactor();
            pair = TuplesKt.to((Object)(mouseX + halfPixel), (Object)(mouseY + halfPixel));
        }
        else {
            pair = TuplesKt.to((Object)mouseX, (Object)mouseY);
        }
        return (Pair<Double, Double>)pair;
    }
    
    public boolean isPointInside(final float x, final float y) {
        return x > this.getLeft() && x < this.getRight() && y > this.getTop() && y < this.getBottom();
    }
    
    @NotNull
    public UIComponent hitTest(final float x, final float y) {
        int lastIndex = CollectionsKt.getLastIndex((List)this.getChildren());
        if (0 <= lastIndex) {
            do {
                final int i = lastIndex;
                --lastIndex;
                final UIComponent child = this.getChildren().get(i);
                if (child.isPointInside(x, y)) {
                    return child.hitTest(x, y);
                }
            } while (0 <= lastIndex);
        }
        return this;
    }
    
    public boolean isChildOf(@NotNull final UIComponent component) {
        Intrinsics.checkNotNullParameter((Object)component, "component");
        UIComponent currentParent = this.getParent();
        while (!Intrinsics.areEqual((Object)currentParent, (Object)component)) {
            currentParent = currentParent.getParent();
            if (Intrinsics.areEqual((Object)currentParent.getParent(), (Object)currentParent)) {
                return false;
            }
        }
        return true;
    }
    
    public void afterInitialization() {
        final Iterable $this$forEach$iv = this.effects;
        final int $i$f$forEach = 0;
        for (final Object element$iv : $this$forEach$iv) {
            final Effect it = (Effect)element$iv;
            final int n = 0;
            it.setup();
        }
    }
    
    @Deprecated(message = "For 1.17 this method requires you pass a UMatrixStack as the first argument.\n\nIf you are currently extending this method, you should instead extend the method with the added argument.\nNote however for this to be non-breaking, your parent class needs to transition before you do.\n\nIf you are calling this method and you cannot guarantee that your target class has been fully updated (such as when\ncalling an open method on an open class), you should instead call the method with the \"Compat\" suffix, which will\ncall both methods, the new and the deprecated one.\nIf you are sure that your target class has been updated (such as when calling the super method), you should\n(for super calls you must!) instead just call the method with the original name and added argument.", replaceWith = @ReplaceWith(expression = "draw(matrixStack)", imports = {}))
    @java.lang.Deprecated
    public void draw() {
        this.draw(UMatrixStack.Compat.INSTANCE.get());
    }
    
    public final void drawCompat(@NotNull final UMatrixStack matrixStack) {
        Intrinsics.checkNotNullParameter((Object)matrixStack, "matrixStack");
        UMatrixStack.Compat.INSTANCE.runLegacyMethod(matrixStack, (kotlin.jvm.functions.Function0<?>)new UIComponent$drawCompat.UIComponent$drawCompat$1(this));
    }
    
    public void draw(@NotNull final UMatrixStack matrixStack) {
        Intrinsics.checkNotNullParameter((Object)matrixStack, "matrixStack");
        if (!this.isInitialized) {
            this.isInitialized = true;
            this.afterInitialization();
        }
        if (!this.didCallBeforeDraw && !this.warnedAboutBeforeDraw) {
            this.warnedAboutBeforeDraw = true;
            InvalidUsageKt.handleInvalidUsage(Intrinsics.stringPlus(this.getClass().getName(), (Object)" failed to call `beforeDraw` at the start of its `draw` method. Consider extending UIContainer if you do not wish to override the draw method. If you do need to override it, then be sure to call `beforeDraw` from it before you do any drawing."));
        }
        this.didCallBeforeDraw = false;
        if (OptionsKt.getElementaDebug()) {
            UIComponent.Companion.drawDebugOutline$Elementa(matrixStack, this.getLeft(), this.getTop(), this.getRight(), this.getBottom(), this);
        }
        this.beforeChildrenDrawCompat(matrixStack);
        final Window parentWindow = Window.Companion.of(this);
        final UIComponent this_$iv = this;
        final int $i$f$forEachChild = 0;
        final UIComponent this_$iv$iv = this_$iv;
        final int $i$f$withChildrenLocked = 0;
        ++this_$iv$iv.childrenLocked;
        try {
            final int n = 0;
            final Iterable $this$forEach$iv$iv = this_$iv.getChildren();
            final int $i$f$forEach = 0;
            for (final Object element$iv$iv : $this$forEach$iv$iv) {
                final UIComponent child = (UIComponent)element$iv$iv;
                final int n2 = 0;
                if (child.isFloating) {
                    continue;
                }
                if (!this.alwaysDrawChildren() && !parentWindow.isAreaVisible(child.getLeft(), child.getTop(), child.getRight(), child.getBottom())) {
                    continue;
                }
                child.drawCompat(matrixStack);
            }
            final Unit instance = Unit.INSTANCE;
        }
        finally {
            --this_$iv$iv.childrenLocked;
        }
        if (this instanceof Window) {
            ((Window)this).drawFloatingComponents(matrixStack);
        }
        this.afterDrawCompat(matrixStack);
    }
    
    public void beforeDraw(@NotNull final UMatrixStack matrixStack) {
        Intrinsics.checkNotNullParameter((Object)matrixStack, "matrixStack");
        if (this.didCallBeforeDraw && !this.warnedAboutBeforeDraw) {
            this.warnedAboutBeforeDraw = true;
            final String advice = (this instanceof UIContainer) ? "It should not be extending UIContainer if it overrides `draw` and calls `beforeDraw` on its own." : "Make sure that none of its super classes already call `beforeDraw`.";
            InvalidUsageKt.handleInvalidUsage((Object)this.getClass().getName() + " called `beforeDraw` more than once without a call to `draw`. " + advice);
        }
        this.didCallBeforeDraw = true;
        final Iterable $this$forEach$iv = this.effects;
        final int $i$f$forEach = 0;
        for (final Object element$iv : $this$forEach$iv) {
            final Effect it = (Effect)element$iv;
            final int n = 0;
            it.beforeDraw(matrixStack);
        }
    }
    
    public void afterDraw(@NotNull final UMatrixStack matrixStack) {
        Intrinsics.checkNotNullParameter((Object)matrixStack, "matrixStack");
        final Iterable $this$forEach$iv = this.effects;
        final int $i$f$forEach = 0;
        for (final Object element$iv : $this$forEach$iv) {
            final Effect it = (Effect)element$iv;
            final int n = 0;
            it.afterDraw(matrixStack);
        }
    }
    
    public void beforeChildrenDraw(@NotNull final UMatrixStack matrixStack) {
        Intrinsics.checkNotNullParameter((Object)matrixStack, "matrixStack");
        final Iterable $this$forEach$iv = this.effects;
        final int $i$f$forEach = 0;
        for (final Object element$iv : $this$forEach$iv) {
            final Effect it = (Effect)element$iv;
            final int n = 0;
            it.beforeChildrenDraw(matrixStack);
        }
    }
    
    @Deprecated(message = "For 1.17 this method requires you pass a UMatrixStack as the first argument.\n\nIf you are currently extending this method, you should instead extend the method with the added argument.\nNote however for this to be non-breaking, your parent class needs to transition before you do.\n\nIf you are calling this method and you cannot guarantee that your target class has been fully updated (such as when\ncalling an open method on an open class), you should instead call the method with the \"Compat\" suffix, which will\ncall both methods, the new and the deprecated one.\nIf you are sure that your target class has been updated (such as when calling the super method), you should\n(for super calls you must!) instead just call the method with the original name and added argument.", replaceWith = @ReplaceWith(expression = "beforeDraw(matrixStack)", imports = {}))
    @java.lang.Deprecated
    public void beforeDraw() {
        this.beforeDraw(UMatrixStack.Compat.INSTANCE.get());
    }
    
    @Deprecated(message = "For 1.17 this method requires you pass a UMatrixStack as the first argument.\n\nIf you are currently extending this method, you should instead extend the method with the added argument.\nNote however for this to be non-breaking, your parent class needs to transition before you do.\n\nIf you are calling this method and you cannot guarantee that your target class has been fully updated (such as when\ncalling an open method on an open class), you should instead call the method with the \"Compat\" suffix, which will\ncall both methods, the new and the deprecated one.\nIf you are sure that your target class has been updated (such as when calling the super method), you should\n(for super calls you must!) instead just call the method with the original name and added argument.", replaceWith = @ReplaceWith(expression = "afterDraw(matrixStack)", imports = {}))
    @java.lang.Deprecated
    public void afterDraw() {
        this.afterDraw(UMatrixStack.Compat.INSTANCE.get());
    }
    
    @Deprecated(message = "For 1.17 this method requires you pass a UMatrixStack as the first argument.\n\nIf you are currently extending this method, you should instead extend the method with the added argument.\nNote however for this to be non-breaking, your parent class needs to transition before you do.\n\nIf you are calling this method and you cannot guarantee that your target class has been fully updated (such as when\ncalling an open method on an open class), you should instead call the method with the \"Compat\" suffix, which will\ncall both methods, the new and the deprecated one.\nIf you are sure that your target class has been updated (such as when calling the super method), you should\n(for super calls you must!) instead just call the method with the original name and added argument.", replaceWith = @ReplaceWith(expression = "beforeChildrenDraw(matrixStack)", imports = {}))
    @java.lang.Deprecated
    public void beforeChildrenDraw() {
        this.beforeChildrenDraw(UMatrixStack.Compat.INSTANCE.get());
    }
    
    public final void beforeDrawCompat(@NotNull final UMatrixStack matrixStack) {
        Intrinsics.checkNotNullParameter((Object)matrixStack, "matrixStack");
        UMatrixStack.Compat.INSTANCE.runLegacyMethod(matrixStack, (kotlin.jvm.functions.Function0<?>)new UIComponent$beforeDrawCompat.UIComponent$beforeDrawCompat$1(this));
    }
    
    public final void afterDrawCompat(@NotNull final UMatrixStack matrixStack) {
        Intrinsics.checkNotNullParameter((Object)matrixStack, "matrixStack");
        UMatrixStack.Compat.INSTANCE.runLegacyMethod(matrixStack, (kotlin.jvm.functions.Function0<?>)new UIComponent$afterDrawCompat.UIComponent$afterDrawCompat$1(this));
    }
    
    public final void beforeChildrenDrawCompat(@NotNull final UMatrixStack matrixStack) {
        Intrinsics.checkNotNullParameter((Object)matrixStack, "matrixStack");
        UMatrixStack.Compat.INSTANCE.runLegacyMethod(matrixStack, (kotlin.jvm.functions.Function0<?>)new UIComponent$beforeChildrenDrawCompat.UIComponent$beforeChildrenDrawCompat$1(this));
    }
    
    public void mouseMove(@NotNull final Window window) {
        Intrinsics.checkNotNullParameter((Object)window, "window");
        boolean b = false;
        Label_0059: {
            if (this.isHovered()) {
                final UIComponent it = window.getHoveredFloatingComponent();
                final int n = 0;
                if (it == null || Intrinsics.areEqual((Object)it, (Object)this) || this.isComponentInParentChain(it)) {
                    b = true;
                    break Label_0059;
                }
            }
            b = false;
        }
        final boolean hovered = b;
        if (hovered && !this.currentlyHovered) {
            for (final Function1 listener : this.mouseEnterListeners) {
                listener.invoke((Object)this);
            }
            this.currentlyHovered = true;
        }
        else if (!hovered && this.currentlyHovered) {
            for (final Function1 listener : this.mouseLeaveListeners) {
                listener.invoke((Object)this);
            }
            this.currentlyHovered = false;
        }
        final UIComponent this_$iv = this;
        final int $i$f$forEachChild = 0;
        final UIComponent this_$iv$iv = this_$iv;
        final int $i$f$withChildrenLocked = 0;
        ++this_$iv$iv.childrenLocked;
        try {
            final int n2 = 0;
            final Iterable $this$forEach$iv$iv = this_$iv.getChildren();
            final int $i$f$forEach = 0;
            for (final Object element$iv$iv : $this$forEach$iv$iv) {
                final UIComponent it2 = (UIComponent)element$iv$iv;
                final int n3 = 0;
                it2.mouseMove(window);
            }
            final Unit instance = Unit.INSTANCE;
        }
        finally {
            --this_$iv$iv.childrenLocked;
        }
    }
    
    public void mouseClick(final double mouseX, final double mouseY, final int button) {
        final UIComponent clicked = this.hitTest((float)mouseX, (float)mouseY);
        this.lastDraggedMouseX = mouseX;
        this.lastDraggedMouseY = mouseY;
        this.lastClickCount = ((System.currentTimeMillis() - this.lastClickTime < 500L) ? (this.lastClickCount + 1) : 1);
        this.lastClickTime = System.currentTimeMillis();
        clicked.fireClickEvent(new UIClickEvent((float)mouseX, (float)mouseY, button, clicked, clicked, this.lastClickCount));
    }
    
    protected final void fireClickEvent(@NotNull final UIClickEvent event) {
        Intrinsics.checkNotNullParameter((Object)event, "event");
        for (final Function2 listener : this.mouseClickListeners) {
            listener.invoke((Object)this, (Object)event);
            if (event.getPropagationStoppedImmediately()) {
                return;
            }
        }
        if (!event.getPropagationStopped() && !Intrinsics.areEqual((Object)this.getParent(), (Object)this)) {
            this.getParent().fireClickEvent(UIClickEvent.copy$default(event, 0.0f, 0.0f, 0, null, this.getParent(), 0, 47, null));
        }
    }
    
    public void mouseRelease() {
        for (final Function1 listener : this.mouseReleaseListeners) {
            listener.invoke((Object)this);
        }
        this.lastDraggedMouseX = null;
        this.lastDraggedMouseY = null;
        final UIComponent this_$iv = this;
        final int $i$f$forEachChild = 0;
        final UIComponent this_$iv$iv = this_$iv;
        final int $i$f$withChildrenLocked = 0;
        ++this_$iv$iv.childrenLocked;
        try {
            final int n = 0;
            final Iterable $this$forEach$iv$iv = this_$iv.getChildren();
            final int $i$f$forEach = 0;
            for (final Object element$iv$iv : $this$forEach$iv$iv) {
                final UIComponent it = (UIComponent)element$iv$iv;
                final int n2 = 0;
                it.mouseRelease();
            }
            final Unit instance = Unit.INSTANCE;
        }
        finally {
            --this_$iv$iv.childrenLocked;
        }
    }
    
    public void mouseScroll(final double delta) {
        if (delta == 0.0) {
            return;
        }
        int lastIndex = CollectionsKt.getLastIndex((List)this.getChildren());
        if (0 <= lastIndex) {
            do {
                final int i = lastIndex;
                --lastIndex;
                final UIComponent child = this.getChildren().get(i);
                if (child.isHovered()) {
                    child.mouseScroll(delta);
                    return;
                }
            } while (0 <= lastIndex);
        }
        this.fireScrollEvent(new UIScrollEvent(delta, this, this));
    }
    
    public void onWindowResize() {
        this.constraints.getWidth().setRecalculate(true);
        this.constraints.getHeight().setRecalculate(true);
        this.constraints.getX().setRecalculate(true);
        this.constraints.getY().setRecalculate(true);
        this.constraints.getRadius().setRecalculate(true);
        this.constraints.getTextScale().setRecalculate(true);
        this.constraints.getColor().setRecalculate(true);
        this.constraints.getFontProvider().setRecalculate(true);
        final UIComponent this_$iv = this;
        final int $i$f$forEachChild = 0;
        final UIComponent this_$iv$iv = this_$iv;
        final int $i$f$withChildrenLocked = 0;
        ++this_$iv$iv.childrenLocked;
        try {
            final int n = 0;
            final Iterable $this$forEach$iv$iv = this_$iv.getChildren();
            final int $i$f$forEach = 0;
            for (final Object element$iv$iv : $this$forEach$iv$iv) {
                final UIComponent it = (UIComponent)element$iv$iv;
                final int n2 = 0;
                it.onWindowResize();
            }
            final Unit instance = Unit.INSTANCE;
        }
        finally {
            --this_$iv$iv.childrenLocked;
        }
    }
    
    protected final void fireScrollEvent(@NotNull final UIScrollEvent event) {
        Intrinsics.checkNotNullParameter((Object)event, "event");
        for (final Function2 listener : this.mouseScrollListeners) {
            listener.invoke((Object)this, (Object)event);
            if (event.getPropagationStoppedImmediately()) {
                return;
            }
        }
        if (!event.getPropagationStopped() && !Intrinsics.areEqual((Object)this.getParent(), (Object)this)) {
            this.getParent().fireScrollEvent(UIScrollEvent.copy$default(event, 0.0, null, this.getParent(), 3, null));
        }
    }
    
    @Deprecated(message = "You no longer need to call mouseDrag manually, Elementa handles it internally.", level = DeprecationLevel.ERROR)
    @java.lang.Deprecated
    public void mouseDrag(final int mouseX, final int mouseY, final int button) {
    }
    
    @Deprecated(message = "Replaced by override using Float for coordinates.", replaceWith = @ReplaceWith(expression = "dragMouse(mouseX.toFloat(), mouseY.toFloat(), button)", imports = {}))
    @java.lang.Deprecated
    public void dragMouse(final int mouseX, final int mouseY, final int button) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: astore          4
        //     3: iload_1         /* mouseX */
        //     4: i2f            
        //     5: fstore          5
        //     7: iload_2         /* mouseY */
        //     8: i2f            
        //     9: fstore          mouseY$iv
        //    11: iconst_0       
        //    12: istore          $i$f$doDragMouse
        //    14: aload           this_$iv
        //    16: invokevirtual   gg/essential/elementa/UIComponent.getLastDraggedMouseX:()Ljava/lang/Double;
        //    19: fload           mouseX$iv
        //    21: f2d            
        //    22: invokestatic    kotlin/jvm/internal/Intrinsics.areEqual:(Ljava/lang/Double;D)Z
        //    25: ifeq            45
        //    28: aload           this_$iv
        //    30: invokevirtual   gg/essential/elementa/UIComponent.getLastDraggedMouseY:()Ljava/lang/Double;
        //    33: fload           mouseY$iv
        //    35: f2d            
        //    36: invokestatic    kotlin/jvm/internal/Intrinsics.areEqual:(Ljava/lang/Double;D)Z
        //    39: ifeq            45
        //    42: goto            300
        //    45: aload           this_$iv
        //    47: fload           mouseX$iv
        //    49: f2d            
        //    50: invokestatic    java/lang/Double.valueOf:(D)Ljava/lang/Double;
        //    53: invokevirtual   gg/essential/elementa/UIComponent.setLastDraggedMouseX:(Ljava/lang/Double;)V
        //    56: aload           this_$iv
        //    58: fload           mouseY$iv
        //    60: f2d            
        //    61: invokestatic    java/lang/Double.valueOf:(D)Ljava/lang/Double;
        //    64: invokevirtual   gg/essential/elementa/UIComponent.setLastDraggedMouseY:(Ljava/lang/Double;)V
        //    67: fload           mouseX$iv
        //    69: aload           this_$iv
        //    71: invokevirtual   gg/essential/elementa/UIComponent.getLeft:()F
        //    74: fsub           
        //    75: fstore          relativeX$iv
        //    77: fload           mouseY$iv
        //    79: aload           this_$iv
        //    81: invokevirtual   gg/essential/elementa/UIComponent.getTop:()F
        //    84: fsub           
        //    85: fstore          relativeY$iv
        //    87: aload           this_$iv
        //    89: invokevirtual   gg/essential/elementa/UIComponent.getMouseDragListeners:()Ljava/util/List;
        //    92: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //    97: astore          10
        //    99: aload           10
        //   101: invokeinterface java/util/Iterator.hasNext:()Z
        //   106: ifeq            148
        //   109: aload           10
        //   111: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   116: checkcast       Lkotlin/jvm/functions/Function4;
        //   119: astore          listener$iv
        //   121: aload           listener$iv
        //   123: aload           this_$iv
        //   125: fload           relativeX$iv
        //   127: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //   130: fload           relativeY$iv
        //   132: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //   135: iload_3         /* button */
        //   136: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   139: invokeinterface kotlin/jvm/functions/Function4.invoke:(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   144: pop            
        //   145: goto            99
        //   148: aload           this_$iv
        //   150: astore          this_$iv$iv
        //   152: iconst_0       
        //   153: istore          $i$f$forEachChild
        //   155: aload           this_$iv$iv
        //   157: astore          this_$iv$iv$iv
        //   159: iconst_0       
        //   160: istore          $i$f$withChildrenLocked
        //   162: aload           this_$iv$iv$iv
        //   164: getfield        gg/essential/elementa/UIComponent.childrenLocked:I
        //   167: istore          14
        //   169: aload           this_$iv$iv$iv
        //   171: iload           14
        //   173: iconst_1       
        //   174: iadd           
        //   175: putfield        gg/essential/elementa/UIComponent.childrenLocked:I
        //   178: nop            
        //   179: iconst_0       
        //   180: istore          $i$a$-withChildrenLocked-UIComponent$forEachChild$1$iv$iv
        //   182: aload           this_$iv$iv
        //   184: invokevirtual   gg/essential/elementa/UIComponent.getChildren:()Lgg/essential/elementa/utils/ObservableList;
        //   187: checkcast       Ljava/lang/Iterable;
        //   190: astore          $this$forEach$iv$iv$iv
        //   192: iconst_0       
        //   193: istore          $i$f$forEach
        //   195: aload           $this$forEach$iv$iv$iv
        //   197: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   202: astore          18
        //   204: aload           18
        //   206: invokeinterface java/util/Iterator.hasNext:()Z
        //   211: ifeq            251
        //   214: aload           18
        //   216: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   221: astore          element$iv$iv$iv
        //   223: aload           element$iv$iv$iv
        //   225: checkcast       Lgg/essential/elementa/UIComponent;
        //   228: astore          it$iv
        //   230: iconst_0       
        //   231: istore          $i$a$-forEachChild-UIComponent$doDragMouse$1$iv
        //   233: aload           it$iv
        //   235: astore          $this$dragMouse_u24lambda_u2d37
        //   237: iconst_0       
        //   238: istore          $i$a$-doDragMouse-UIComponent$dragMouse$1
        //   240: aload           $this$dragMouse_u24lambda_u2d37
        //   242: iload_1         /* mouseX */
        //   243: iload_2         /* mouseY */
        //   244: iload_3         /* button */
        //   245: invokevirtual   gg/essential/elementa/UIComponent.dragMouse:(III)V
        //   248: goto            204
        //   251: nop            
        //   252: nop            
        //   253: getstatic       kotlin/Unit.INSTANCE:Lkotlin/Unit;
        //   256: astore          14
        //   258: aload           this_$iv$iv$iv
        //   260: getfield        gg/essential/elementa/UIComponent.childrenLocked:I
        //   263: istore          20
        //   265: aload           this_$iv$iv$iv
        //   267: iload           20
        //   269: iconst_m1      
        //   270: iadd           
        //   271: putfield        gg/essential/elementa/UIComponent.childrenLocked:I
        //   274: goto            298
        //   277: astore          14
        //   279: aload           this_$iv$iv$iv
        //   281: getfield        gg/essential/elementa/UIComponent.childrenLocked:I
        //   284: istore          20
        //   286: aload           this_$iv$iv$iv
        //   288: iload           20
        //   290: iconst_m1      
        //   291: iadd           
        //   292: putfield        gg/essential/elementa/UIComponent.childrenLocked:I
        //   295: aload           14
        //   297: athrow         
        //   298: nop            
        //   299: nop            
        //   300: return         
        //    MethodParameters:
        //  Name    Flags  
        //  ------  -----
        //  mouseX  
        //  mouseY  
        //  button  
        //    StackMapTable: 00 08 FF 00 2D 00 08 07 00 02 01 01 01 07 00 02 02 02 01 00 00 FE 00 35 02 02 07 02 27 30 FF 00 37 00 13 07 00 02 01 01 01 07 00 02 02 02 01 02 02 07 00 02 01 07 00 02 01 01 01 07 02 21 01 07 02 27 00 00 2E FF 00 19 00 0E 07 00 02 01 01 01 07 00 02 02 02 01 02 02 07 00 02 01 07 00 02 01 00 01 07 02 51 FF 00 14 00 15 07 00 02 01 01 01 07 00 02 02 02 01 02 02 07 00 02 01 07 00 02 01 07 02 5C 01 07 02 21 01 07 02 27 00 01 00 00 FF 00 01 00 08 07 00 02 01 01 01 07 00 02 02 02 01 00 00
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  178    258    277    298    Any
        //  277    279    277    298    Any
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public void dragMouse(final float mouseX, final float mouseY, final int button) {
        final UIComponent this_$iv = this;
        final int $i$f$doDragMouse = 0;
        if (!Intrinsics.areEqual(this_$iv.getLastDraggedMouseX(), (double)mouseX) || !Intrinsics.areEqual(this_$iv.getLastDraggedMouseY(), (double)mouseY)) {
            this_$iv.setLastDraggedMouseX((double)mouseX);
            this_$iv.setLastDraggedMouseY((double)mouseY);
            final float relativeX$iv = mouseX - this_$iv.getLeft();
            final float relativeY$iv = mouseY - this_$iv.getTop();
            for (final Function4 listener$iv : this_$iv.getMouseDragListeners()) {
                listener$iv.invoke((Object)this_$iv, (Object)relativeX$iv, (Object)relativeY$iv, (Object)button);
            }
            final UIComponent this_$iv$iv = this_$iv;
            final int $i$f$forEachChild = 0;
            final UIComponent this_$iv$iv$iv = this_$iv$iv;
            final int $i$f$withChildrenLocked = 0;
            ++this_$iv$iv$iv.childrenLocked;
            try {
                final int n = 0;
                final Iterable $this$forEach$iv$iv$iv = this_$iv$iv.getChildren();
                final int $i$f$forEach = 0;
                for (final Object element$iv$iv$iv : $this$forEach$iv$iv$iv) {
                    final UIComponent it$iv = (UIComponent)element$iv$iv$iv;
                    final int n2 = 0;
                    final UIComponent $this$dragMouse_u24lambda_u2d38 = it$iv;
                    final int n3 = 0;
                    $this$dragMouse_u24lambda_u2d38.dragMouse(mouseX, mouseY, button);
                }
                final Unit instance = Unit.INSTANCE;
            }
            finally {
                --this_$iv$iv$iv.childrenLocked;
            }
        }
    }
    
    private final void doDragMouse(final float mouseX, final float mouseY, final int button, final Function1<? super UIComponent, Unit> superCall) {
        final int $i$f$doDragMouse = 0;
        if (Intrinsics.areEqual(this.getLastDraggedMouseX(), (double)mouseX) && Intrinsics.areEqual(this.getLastDraggedMouseY(), (double)mouseY)) {
            return;
        }
        this.setLastDraggedMouseX((double)mouseX);
        this.setLastDraggedMouseY((double)mouseY);
        final float relativeX = mouseX - this.getLeft();
        final float relativeY = mouseY - this.getTop();
        for (final Function4 listener : this.getMouseDragListeners()) {
            listener.invoke((Object)this, (Object)relativeX, (Object)relativeY, (Object)button);
        }
        final UIComponent this_$iv = this;
        final int $i$f$forEachChild = 0;
        final UIComponent this_$iv$iv = this_$iv;
        final int $i$f$withChildrenLocked = 0;
        ++this_$iv$iv.childrenLocked;
        try {
            final int n = 0;
            final Iterable $this$forEach$iv$iv = this_$iv.getChildren();
            final int $i$f$forEach = 0;
            for (final Object element$iv$iv : $this$forEach$iv$iv) {
                final UIComponent it = (UIComponent)element$iv$iv;
                final int n2 = 0;
                superCall.invoke((Object)it);
            }
            final Unit instance = Unit.INSTANCE;
        }
        finally {
            InlineMarker.finallyStart(1);
            --this_$iv$iv.childrenLocked;
            InlineMarker.finallyEnd(1);
        }
    }
    
    public void keyType(final char typedChar, final int keyCode) {
        for (final Function3 listener : this.keyTypedListeners) {
            listener.invoke((Object)this, (Object)typedChar, (Object)keyCode);
        }
    }
    
    public void animationFrame() {
        this.constraints.animationFrame$Elementa();
        Iterable $this$forEach$iv = this.effects;
        int $i$f$forEach = 0;
        for (final Object element$iv : $this$forEach$iv) {
            final Effect p0 = (Effect)element$iv;
            final int n = 0;
            p0.animationFrame();
        }
        $this$forEach$iv = this.getChildren();
        $i$f$forEach = 0;
        for (final Object element$iv : $this$forEach$iv) {
            final UIComponent p2 = (UIComponent)element$iv;
            final int n2 = 0;
            p2.animationFrame();
        }
        final Iterator<FieldAnimationComponent<?>> iterator3 = this.fieldAnimationQueue.iterator();
        Intrinsics.checkNotNullExpressionValue((Object)iterator3, "fieldAnimationQueue.iterator()");
        final Iterator queueIterator = iterator3;
        queueIterator.forEachRemaining(UIComponent::animationFrame$lambda-41);
        final Iterator timerIterator = this.activeTimers.entrySet().iterator();
        timerIterator.forEachRemaining(UIComponent::animationFrame$lambda-42);
        final Iterable $this$forEach$iv2 = this.stoppedTimers;
        final int $i$f$forEach2 = 0;
        for (final Object element$iv2 : $this$forEach$iv2) {
            final int it = ((Number)element$iv2).intValue();
            final int n3 = 0;
            this.activeTimers.remove(it);
        }
    }
    
    public boolean alwaysDrawChildren() {
        return false;
    }
    
    public final int depth() {
        UIComponent current;
        int depth;
        for (current = this, depth = 0; !(current instanceof Window) && current.getHasParent() && !Intrinsics.areEqual((Object)current.getParent(), (Object)current); current = current.getParent(), ++depth) {}
        if (!(current instanceof Window)) {
            throw new IllegalStateException("No window parent? It's possible you haven't called Window.addChild() at this point in time.");
        }
        return depth;
    }
    
    @NotNull
    public final UIComponent onMouseClick(@NotNull final Function2<? super UIComponent, ? super UIClickEvent, Unit> method) {
        Intrinsics.checkNotNullParameter((Object)method, "method");
        final UIComponent $this$onMouseClick_u24lambda_u2d44 = this;
        final int n = 0;
        $this$onMouseClick_u24lambda_u2d44.getMouseClickListeners().add((Function2<UIComponent, UIClickEvent, Unit>)method);
        return this;
    }
    
    @NotNull
    public final UIComponent onMouseClickConsumer(@NotNull final Consumer<UIClickEvent> method) {
        Intrinsics.checkNotNullParameter((Object)method, "method");
        final UIComponent $this$onMouseClickConsumer_u24lambda_u2d45 = this;
        final int n = 0;
        $this$onMouseClickConsumer_u24lambda_u2d45.getMouseClickListeners().add((Function2<UIComponent, UIClickEvent, Unit>)new UIComponent$onMouseClickConsumer$1.UIComponent$onMouseClickConsumer$1$1((Consumer)method));
        return this;
    }
    
    @NotNull
    public final UIComponent onMouseRelease(@NotNull final Function1<? super UIComponent, Unit> method) {
        Intrinsics.checkNotNullParameter((Object)method, "method");
        final UIComponent $this$onMouseRelease_u24lambda_u2d46 = this;
        final int n = 0;
        $this$onMouseRelease_u24lambda_u2d46.getMouseReleaseListeners().add((Function1<UIComponent, Unit>)method);
        return this;
    }
    
    @NotNull
    public final UIComponent onMouseReleaseRunnable(@NotNull final Runnable method) {
        Intrinsics.checkNotNullParameter((Object)method, "method");
        final UIComponent $this$onMouseReleaseRunnable_u24lambda_u2d47 = this;
        final int n = 0;
        $this$onMouseReleaseRunnable_u24lambda_u2d47.getMouseReleaseListeners().add((Function1<UIComponent, Unit>)new UIComponent$onMouseReleaseRunnable$1.UIComponent$onMouseReleaseRunnable$1$1(method));
        return this;
    }
    
    @NotNull
    public final UIComponent onMouseDrag(@NotNull final Function4<? super UIComponent, ? super Float, ? super Float, ? super Integer, Unit> method) {
        Intrinsics.checkNotNullParameter((Object)method, "method");
        final UIComponent $this$onMouseDrag_u24lambda_u2d48 = this;
        final int n = 0;
        $this$onMouseDrag_u24lambda_u2d48.getMouseDragListeners().add((Function4<UIComponent, Float, Float, Integer, Unit>)method);
        return this;
    }
    
    @NotNull
    public final UIComponent onMouseDragConsumer(@NotNull final TriConsumer<Float, Float, Integer> method) {
        Intrinsics.checkNotNullParameter((Object)method, "method");
        final UIComponent $this$onMouseDragConsumer_u24lambda_u2d49 = this;
        final int n = 0;
        $this$onMouseDragConsumer_u24lambda_u2d49.getMouseDragListeners().add((Function4<UIComponent, Float, Float, Integer, Unit>)new UIComponent$onMouseDragConsumer$1.UIComponent$onMouseDragConsumer$1$1((TriConsumer)method));
        return this;
    }
    
    @NotNull
    public final UIComponent onMouseEnter(@NotNull final Function1<? super UIComponent, Unit> method) {
        Intrinsics.checkNotNullParameter((Object)method, "method");
        final UIComponent $this$onMouseEnter_u24lambda_u2d50 = this;
        final int n = 0;
        $this$onMouseEnter_u24lambda_u2d50.getMouseEnterListeners().add((Function1<UIComponent, Unit>)method);
        return this;
    }
    
    @NotNull
    public final UIComponent onMouseEnterRunnable(@NotNull final Runnable method) {
        Intrinsics.checkNotNullParameter((Object)method, "method");
        final UIComponent $this$onMouseEnterRunnable_u24lambda_u2d51 = this;
        final int n = 0;
        $this$onMouseEnterRunnable_u24lambda_u2d51.getMouseEnterListeners().add((Function1<UIComponent, Unit>)new UIComponent$onMouseEnterRunnable$1.UIComponent$onMouseEnterRunnable$1$1(method));
        return this;
    }
    
    @NotNull
    public final UIComponent onMouseLeave(@NotNull final Function1<? super UIComponent, Unit> method) {
        Intrinsics.checkNotNullParameter((Object)method, "method");
        final UIComponent $this$onMouseLeave_u24lambda_u2d52 = this;
        final int n = 0;
        $this$onMouseLeave_u24lambda_u2d52.getMouseLeaveListeners().add((Function1<UIComponent, Unit>)method);
        return this;
    }
    
    @NotNull
    public final UIComponent onMouseLeaveRunnable(@NotNull final Runnable method) {
        Intrinsics.checkNotNullParameter((Object)method, "method");
        final UIComponent $this$onMouseLeaveRunnable_u24lambda_u2d53 = this;
        final int n = 0;
        $this$onMouseLeaveRunnable_u24lambda_u2d53.getMouseLeaveListeners().add((Function1<UIComponent, Unit>)new UIComponent$onMouseLeaveRunnable$1.UIComponent$onMouseLeaveRunnable$1$1(method));
        return this;
    }
    
    @NotNull
    public final UIComponent onMouseScroll(@NotNull final Function2<? super UIComponent, ? super UIScrollEvent, Unit> method) {
        Intrinsics.checkNotNullParameter((Object)method, "method");
        final UIComponent $this$onMouseScroll_u24lambda_u2d54 = this;
        final int n = 0;
        $this$onMouseScroll_u24lambda_u2d54.getMouseScrollListeners().add((Function2<UIComponent, UIScrollEvent, Unit>)method);
        return this;
    }
    
    @NotNull
    public final UIComponent onMouseScrollConsumer(@NotNull final Consumer<UIScrollEvent> method) {
        Intrinsics.checkNotNullParameter((Object)method, "method");
        final UIComponent $this$onMouseScrollConsumer_u24lambda_u2d55 = this;
        final int n = 0;
        $this$onMouseScrollConsumer_u24lambda_u2d55.getMouseScrollListeners().add((Function2<UIComponent, UIScrollEvent, Unit>)new UIComponent$onMouseScrollConsumer$1.UIComponent$onMouseScrollConsumer$1$1((Consumer)method));
        return this;
    }
    
    @NotNull
    public final UIComponent onKeyType(@NotNull final Function3<? super UIComponent, ? super Character, ? super Integer, Unit> method) {
        Intrinsics.checkNotNullParameter((Object)method, "method");
        final UIComponent $this$onKeyType_u24lambda_u2d56 = this;
        final int n = 0;
        $this$onKeyType_u24lambda_u2d56.getKeyTypedListeners().add((Function3<UIComponent, Character, Integer, Unit>)method);
        return this;
    }
    
    public final void onKeyTypeConsumer(@NotNull final BiConsumer<Character, Integer> method) {
        Intrinsics.checkNotNullParameter((Object)method, "method");
        this.keyTypedListeners.add((Function3<UIComponent, Character, Integer, Unit>)new UIComponent$onKeyTypeConsumer.UIComponent$onKeyTypeConsumer$1((BiConsumer)method));
    }
    
    @JvmOverloads
    public final void hide(final boolean instantly) {
        if (this.isInitialized) {
            InvalidUsageKt.requireMainThread$default(null, 1, null);
        }
        if (instantly) {
            this.indexInParent = this.getParent().getChildren().indexOf(this);
            this.getParent().removeChild(this);
            return;
        }
        final UIComponent $this$animate$iv = this;
        final int $i$f$animate = 0;
        final UIComponent uiComponent = $this$animate$iv;
        final UIComponent $this$animate_u24lambda_u2d0$iv = uiComponent;
        final int n = 0;
        final AnimatingConstraints $this$hide_u24lambda_u2d57;
        final AnimatingConstraints anim$iv = $this$hide_u24lambda_u2d57 = $this$animate_u24lambda_u2d0$iv.makeAnimation();
        final int n2 = 0;
        for (final Function1 animation : this.beforeHideAnimations) {
            animation.invoke((Object)$this$hide_u24lambda_u2d57);
        }
        final Function0 comp = $this$hide_u24lambda_u2d57.getCompleteAction();
        $this$hide_u24lambda_u2d57.onComplete((Function0<Unit>)new UIComponent$hide$1.UIComponent$hide$1$1(comp, this));
        $this$animate_u24lambda_u2d0$iv.animateTo(anim$iv);
        final UIComponent uiComponent2 = uiComponent;
    }
    
    public static /* synthetic */ void hide$default(final UIComponent uiComponent, boolean instantly, final int n, final Object o) {
        if (o != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: hide");
        }
        if ((n & 0x1) != 0x0) {
            instantly = false;
        }
        uiComponent.hide(instantly);
    }
    
    public final void unhide(final boolean useLastPosition) {
        if (this.isInitialized) {
            InvalidUsageKt.requireMainThread$default(null, 1, null);
        }
        if (this.getParent().getChildren().contains(this)) {
            return;
        }
        if (useLastPosition && this.indexInParent >= 0 && this.indexInParent < this.getParent().getChildren().size()) {
            this.getParent().getChildren().add(this.indexInParent, this);
        }
        else {
            this.getParent().getChildren().add(this);
        }
        final UIComponent $this$animate$iv = this;
        final int $i$f$animate = 0;
        final UIComponent uiComponent = $this$animate$iv;
        final UIComponent $this$animate_u24lambda_u2d0$iv = uiComponent;
        final int n = 0;
        final AnimatingConstraints $this$unhide_u24lambda_u2d58;
        final AnimatingConstraints anim$iv = $this$unhide_u24lambda_u2d58 = $this$animate_u24lambda_u2d0$iv.makeAnimation();
        final int n2 = 0;
        for (final Function1 animation : this.afterUnhideAnimations) {
            animation.invoke((Object)$this$unhide_u24lambda_u2d58);
        }
        $this$animate_u24lambda_u2d0$iv.animateTo(anim$iv);
        final UIComponent uiComponent2 = uiComponent;
    }
    
    public static /* synthetic */ void unhide$default(final UIComponent uiComponent, boolean useLastPosition, final int n, final Object o) {
        if (o != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: unhide");
        }
        if ((n & 0x1) != 0x0) {
            useLastPosition = true;
        }
        uiComponent.unhide(useLastPosition);
    }
    
    @NotNull
    public final UIComponent animateBeforeHide(@NotNull final Function1<? super AnimatingConstraints, Unit> animation) {
        Intrinsics.checkNotNullParameter((Object)animation, "animation");
        final UIComponent $this$animateBeforeHide_u24lambda_u2d59 = this;
        final int n = 0;
        $this$animateBeforeHide_u24lambda_u2d59.beforeHideAnimations.add((Function1<AnimatingConstraints, Unit>)animation);
        return this;
    }
    
    @NotNull
    public final UIComponent animateAfterUnhide(@NotNull final Function1<? super AnimatingConstraints, Unit> animation) {
        Intrinsics.checkNotNullParameter((Object)animation, "animation");
        final UIComponent $this$animateAfterUnhide_u24lambda_u2d60 = this;
        final int n = 0;
        $this$animateAfterUnhide_u24lambda_u2d60.afterUnhideAnimations.add((Function1<AnimatingConstraints, Unit>)animation);
        return this;
    }
    
    public final void grabWindowFocus() {
        Window.Companion.of(this).focus(this);
    }
    
    @NotNull
    public final UIComponent onFocus(@NotNull final Function1<? super UIComponent, Unit> listener) {
        Intrinsics.checkNotNullParameter((Object)listener, "listener");
        final UIComponent $this$onFocus_u24lambda_u2d61 = this;
        final int n = 0;
        $this$onFocus_u24lambda_u2d61.onFocusActions.add((Function1<UIComponent, Unit>)listener);
        return this;
    }
    
    public final void focus() {
        for (final Function1 listener : this.onFocusActions) {
            listener.invoke((Object)this);
        }
    }
    
    public final void releaseWindowFocus() {
        Window.Companion.of(this).unfocus();
    }
    
    @NotNull
    public final UIComponent onFocusLost(@NotNull final Function1<? super UIComponent, Unit> listener) {
        Intrinsics.checkNotNullParameter((Object)listener, "listener");
        final UIComponent $this$onFocusLost_u24lambda_u2d62 = this;
        final int n = 0;
        $this$onFocusLost_u24lambda_u2d62.onFocusLostActions.add((Function1<UIComponent, Unit>)listener);
        return this;
    }
    
    public final void loseFocus() {
        for (final Function1 listener : this.onFocusLostActions) {
            listener.invoke((Object)this);
        }
    }
    
    public final boolean hasFocus() {
        return Intrinsics.areEqual((Object)Window.Companion.of(this).getFocusedComponent(), (Object)this);
    }
    
    public final void setFloating(final boolean floating) {
        this.isFloating = floating;
        if (floating) {
            Window.Companion.of(this).addFloatingComponent(this);
        }
        else {
            Window.Companion.of(this).removeFloatingComponent(this);
        }
    }
    
    public final void animate(@NotNull final KMutableProperty0<Integer> $this$animate, @NotNull final AnimationStrategy strategy, final float time, final int newValue, final float delay) {
        Intrinsics.checkNotNullParameter((Object)$this$animate, "<this>");
        Intrinsics.checkNotNullParameter((Object)strategy, "strategy");
        if (!this.validateAnimationFields(time, delay)) {
            return;
        }
        if (time == 0.0f) {
            $this$animate.set((Object)newValue);
            return;
        }
        final int totalFrames = (int)(time * Window.Companion.of(this).getAnimationFPS());
        final int totalDelay = (int)(delay * Window.Companion.of(this).getAnimationFPS());
        this.fieldAnimationQueue.removeIf(UIComponent::animate$lambda-63);
        this.fieldAnimationQueue.addFirst((FieldAnimationComponent<?>)new IntFieldAnimationComponent((KMutableProperty0)$this$animate, strategy, totalFrames, ((Number)$this$animate.get()).intValue(), newValue, totalDelay));
    }
    
    public static /* synthetic */ void animate$default(final UIComponent uiComponent, final KMutableProperty0 $this$animate, final AnimationStrategy strategy, final float time, final int newValue, float delay, final int n, final Object o) {
        if (o != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animate");
        }
        if ((n & 0x8) != 0x0) {
            delay = 0.0f;
        }
        uiComponent.animate((KMutableProperty0<Integer>)$this$animate, strategy, time, newValue, delay);
    }
    
    public final void animate(@NotNull final KMutableProperty0<Float> $this$animate, @NotNull final AnimationStrategy strategy, final float time, final float newValue, final float delay) {
        Intrinsics.checkNotNullParameter((Object)$this$animate, "<this>");
        Intrinsics.checkNotNullParameter((Object)strategy, "strategy");
        if (!this.validateAnimationFields(time, delay)) {
            return;
        }
        if (time == 0.0f) {
            $this$animate.set((Object)newValue);
            return;
        }
        final int totalFrames = (int)(time * Window.Companion.of(this).getAnimationFPS());
        final int totalDelay = (int)(delay * Window.Companion.of(this).getAnimationFPS());
        this.fieldAnimationQueue.removeIf(UIComponent::animate$lambda-64);
        this.fieldAnimationQueue.addFirst(new FloatFieldAnimationComponent($this$animate, strategy, totalFrames, ((Number)$this$animate.get()).floatValue(), newValue, totalDelay));
    }
    
    public static /* synthetic */ void animate$default(final UIComponent uiComponent, final KMutableProperty0 $this$animate, final AnimationStrategy strategy, final float time, final float newValue, float delay, final int n, final Object o) {
        if (o != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animate");
        }
        if ((n & 0x8) != 0x0) {
            delay = 0.0f;
        }
        uiComponent.animate((KMutableProperty0<Float>)$this$animate, strategy, time, newValue, delay);
    }
    
    public final void animate(@NotNull final KMutableProperty0<Long> $this$animate, @NotNull final AnimationStrategy strategy, final float time, final long newValue, final float delay) {
        Intrinsics.checkNotNullParameter((Object)$this$animate, "<this>");
        Intrinsics.checkNotNullParameter((Object)strategy, "strategy");
        if (!this.validateAnimationFields(time, delay)) {
            return;
        }
        if (time == 0.0f) {
            $this$animate.set((Object)newValue);
            return;
        }
        final int totalFrames = (int)(time * Window.Companion.of(this).getAnimationFPS());
        final int totalDelay = (int)(delay * Window.Companion.of(this).getAnimationFPS());
        this.fieldAnimationQueue.removeIf(UIComponent::animate$lambda-65);
        this.fieldAnimationQueue.addFirst((FieldAnimationComponent<?>)new LongFieldAnimationComponent((KMutableProperty0)$this$animate, strategy, totalFrames, ((Number)$this$animate.get()).longValue(), newValue, totalDelay));
    }
    
    public static /* synthetic */ void animate$default(final UIComponent uiComponent, final KMutableProperty0 $this$animate, final AnimationStrategy strategy, final float time, final long newValue, float delay, final int n, final Object o) {
        if (o != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animate");
        }
        if ((n & 0x8) != 0x0) {
            delay = 0.0f;
        }
        uiComponent.animate((KMutableProperty0<Long>)$this$animate, strategy, time, newValue, delay);
    }
    
    public final void animate(@NotNull final KMutableProperty0<Double> $this$animate, @NotNull final AnimationStrategy strategy, final float time, final double newValue, final float delay) {
        Intrinsics.checkNotNullParameter((Object)$this$animate, "<this>");
        Intrinsics.checkNotNullParameter((Object)strategy, "strategy");
        if (!this.validateAnimationFields(time, delay)) {
            return;
        }
        if (time == 0.0f) {
            $this$animate.set((Object)newValue);
            return;
        }
        final int totalFrames = (int)(time * Window.Companion.of(this).getAnimationFPS());
        final int totalDelay = (int)(delay * Window.Companion.of(this).getAnimationFPS());
        this.fieldAnimationQueue.removeIf(UIComponent::animate$lambda-66);
        this.fieldAnimationQueue.addFirst((FieldAnimationComponent<?>)new DoubleFieldAnimationComponent((KMutableProperty0)$this$animate, strategy, totalFrames, ((Number)$this$animate.get()).doubleValue(), newValue, totalDelay));
    }
    
    public static /* synthetic */ void animate$default(final UIComponent uiComponent, final KMutableProperty0 $this$animate, final AnimationStrategy strategy, final float time, final double newValue, float delay, final int n, final Object o) {
        if (o != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animate");
        }
        if ((n & 0x8) != 0x0) {
            delay = 0.0f;
        }
        uiComponent.animate((KMutableProperty0<Double>)$this$animate, strategy, time, newValue, delay);
    }
    
    public final void animate(@NotNull final KMutableProperty0<Color> $this$animate, @NotNull final AnimationStrategy strategy, final float time, @NotNull final Color newValue, final float delay) {
        Intrinsics.checkNotNullParameter((Object)$this$animate, "<this>");
        Intrinsics.checkNotNullParameter((Object)strategy, "strategy");
        Intrinsics.checkNotNullParameter((Object)newValue, "newValue");
        if (!this.validateAnimationFields(time, delay)) {
            return;
        }
        if (time == 0.0f) {
            $this$animate.set((Object)newValue);
            return;
        }
        final int totalFrames = (int)(time * Window.Companion.of(this).getAnimationFPS());
        final int totalDelay = (int)(delay * Window.Companion.of(this).getAnimationFPS());
        this.fieldAnimationQueue.removeIf(UIComponent::animate$lambda-67);
        this.fieldAnimationQueue.addFirst((FieldAnimationComponent<?>)new ColorFieldAnimationComponent((KMutableProperty0)$this$animate, strategy, totalFrames, (Color)$this$animate.get(), newValue, totalDelay));
    }
    
    public static /* synthetic */ void animate$default(final UIComponent uiComponent, final KMutableProperty0 $this$animate, final AnimationStrategy strategy, final float time, final Color newValue, float delay, final int n, final Object o) {
        if (o != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animate");
        }
        if ((n & 0x8) != 0x0) {
            delay = 0.0f;
        }
        uiComponent.animate((KMutableProperty0<Color>)$this$animate, strategy, time, newValue, delay);
    }
    
    public final void stopAnimating(@NotNull final KMutableProperty0<?> $this$stopAnimating) {
        Intrinsics.checkNotNullParameter((Object)$this$stopAnimating, "<this>");
        this.fieldAnimationQueue.removeIf(UIComponent::stopAnimating$lambda-68);
    }
    
    private final boolean validateAnimationFields(final float time, final float delay) {
        if (time < 0.0f) {
            System.out.println((Object)"time parameter of field animation call cannot be less than 0");
            return false;
        }
        if (delay < 0.0f) {
            System.out.println((Object)"delay parameter of field animation call cannot be less than 0");
            return false;
        }
        return true;
    }
    
    private final boolean isComponentInParentChain(final UIComponent target) {
        UIComponent component = this;
        while (component.getHasParent() && !(component instanceof Window)) {
            component = component.getParent();
            if (Intrinsics.areEqual((Object)component, (Object)target)) {
                return true;
            }
        }
        return false;
    }
    
    public final int startTimer(final long interval, final long delay, @NotNull final Function1<? super Integer, Unit> callback) {
        Intrinsics.checkNotNullParameter((Object)callback, "callback");
        final int id = this.nextTimerId++;
        this.activeTimers.put(id, new Timer(delay, interval, callback));
        return id;
    }
    
    public static /* synthetic */ int startTimer$default(final UIComponent uiComponent, final long interval, long delay, final Function1 callback, final int n, final Object o) {
        if (o != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startTimer");
        }
        if ((n & 0x2) != 0x0) {
            delay = 0L;
        }
        return uiComponent.startTimer(interval, delay, (Function1<? super Integer, Unit>)callback);
    }
    
    public final boolean stopTimer(final int id) {
        return this.stoppedTimers.add(id);
    }
    
    @NotNull
    public final Function0<Unit> timer(final long interval, final long delay, @NotNull final Function1<? super Integer, Unit> callback) {
        Intrinsics.checkNotNullParameter((Object)callback, "callback");
        final int id = this.startTimer(interval, delay, callback);
        return (Function0<Unit>)new UIComponent$timer.UIComponent$timer$1(this, id);
    }
    
    public static /* synthetic */ Function0 timer$default(final UIComponent uiComponent, final long interval, long delay, final Function1 callback, final int n, final Object o) {
        if (o != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: timer");
        }
        if ((n & 0x2) != 0x0) {
            delay = 0L;
        }
        return uiComponent.timer(interval, delay, (Function1<? super Integer, Unit>)callback);
    }
    
    public final int startDelay(final long delay, @NotNull final Function0<Unit> callback) {
        Intrinsics.checkNotNullParameter((Object)callback, "callback");
        return startTimer$default(this, delay, 0L, (Function1)new UIComponent$startDelay.UIComponent$startDelay$1((Function0)callback, this), 2, null);
    }
    
    public final boolean stopDelay(final int id) {
        return this.stopTimer(id);
    }
    
    @NotNull
    public final Function0<Unit> delay(final long delay, @NotNull final Function0<Unit> callback) {
        Intrinsics.checkNotNullParameter((Object)callback, "callback");
        final int id = this.startDelay(delay, callback);
        return (Function0<Unit>)new UIComponent$delay.UIComponent$delay$1(this, id);
    }
    
    @JvmOverloads
    public final void hide() {
        hide$default(this, false, 1, null);
    }
    
    private static final void _init_$lambda-0(final UIComponent this$0, final Observable $noName_0, final Object $noName_1) {
        Intrinsics.checkNotNullParameter((Object)this$0, "this$0");
        this$0.requireChildrenUnlocked();
    }
    
    private static final void _init_$lambda-1(final UIComponent this$0, final Observable $noName_0, final Object event) {
        Intrinsics.checkNotNullParameter((Object)this$0, "this$0");
        Intrinsics.checkNotNullExpressionValue(event, "event");
        this$0.setWindowCacheOnChangedChild(event);
    }
    
    private static final boolean removeEffect$lambda-17(final Class $clazz, final Effect it) {
        Intrinsics.checkNotNullParameter((Object)$clazz, "$clazz");
        Intrinsics.checkNotNullParameter((Object)it, "it");
        return $clazz.isInstance(it);
    }
    
    private static final void animationFrame$lambda-41(final Iterator $queueIterator, final FieldAnimationComponent it) {
        Intrinsics.checkNotNullParameter((Object)$queueIterator, "$queueIterator");
        it.animationFrame();
        if (it.isComplete()) {
            $queueIterator.remove();
        }
    }
    
    private static final void animationFrame$lambda-42(final UIComponent this$0, final Map.Entry $dstr$id$timer) {
        Intrinsics.checkNotNullParameter((Object)this$0, "this$0");
        Intrinsics.checkNotNullParameter((Object)$dstr$id$timer, "$dstr$id$timer");
        final int id = $dstr$id$timer.getKey().intValue();
        final Timer timer = (Timer)$dstr$id$timer.getValue();
        if (this$0.stoppedTimers.contains(id)) {
            return;
        }
        final long time = System.currentTimeMillis();
        timer.setTimeLeft(timer.getTimeLeft() - (time - timer.getLastTime()));
        timer.setLastTime(time);
        if (!timer.getHasDelayed() && timer.getTimeLeft() <= 0L) {
            timer.setHasDelayed(true);
            timer.setTimeLeft(timer.getTimeLeft() + timer.getInterval());
        }
        while (timer.getTimeLeft() <= 0L && !this$0.stoppedTimers.contains(id)) {
            timer.getCallback().invoke((Object)id);
            timer.setTimeLeft(timer.getTimeLeft() + timer.getInterval());
        }
    }
    
    private static final boolean animate$lambda-63(final KMutableProperty0 $this_animate, final FieldAnimationComponent it) {
        Intrinsics.checkNotNullParameter((Object)$this_animate, "$this_animate");
        return Intrinsics.areEqual((Object)it.getField(), (Object)$this_animate);
    }
    
    private static final boolean animate$lambda-64(final KMutableProperty0 $this_animate, final FieldAnimationComponent it) {
        Intrinsics.checkNotNullParameter((Object)$this_animate, "$this_animate");
        return Intrinsics.areEqual((Object)it.getField(), (Object)$this_animate);
    }
    
    private static final boolean animate$lambda-65(final KMutableProperty0 $this_animate, final FieldAnimationComponent it) {
        Intrinsics.checkNotNullParameter((Object)$this_animate, "$this_animate");
        return Intrinsics.areEqual((Object)it.getField(), (Object)$this_animate);
    }
    
    private static final boolean animate$lambda-66(final KMutableProperty0 $this_animate, final FieldAnimationComponent it) {
        Intrinsics.checkNotNullParameter((Object)$this_animate, "$this_animate");
        return Intrinsics.areEqual((Object)it.getField(), (Object)$this_animate);
    }
    
    private static final boolean animate$lambda-67(final KMutableProperty0 $this_animate, final FieldAnimationComponent it) {
        Intrinsics.checkNotNullParameter((Object)$this_animate, "$this_animate");
        return Intrinsics.areEqual((Object)it.getField(), (Object)$this_animate);
    }
    
    private static final boolean stopAnimating$lambda-68(final KMutableProperty0 $this_stopAnimating, final FieldAnimationComponent it) {
        Intrinsics.checkNotNullParameter((Object)$this_stopAnimating, "$this_stopAnimating");
        return Intrinsics.areEqual((Object)it.getField(), (Object)$this_stopAnimating);
    }
    
    public static final /* synthetic */ double access$getDEBUG_OUTLINE_WIDTH$cp() {
        return UIComponent.DEBUG_OUTLINE_WIDTH;
    }
    
    public static final /* synthetic */ void access$setIndexInParent$p(final UIComponent $this, final int <set-?>) {
        $this.indexInParent = <set-?>;
    }
    
    static {
        Companion = new Companion(null);
        defaultComponentName = new String();
        final String property = System.getProperty("elementa.debug.width");
        double debug_OUTLINE_WIDTH;
        if (property == null) {
            debug_OUTLINE_WIDTH = 2.0;
        }
        else {
            final Double doubleOrNull = StringsKt.toDoubleOrNull(property);
            debug_OUTLINE_WIDTH = ((doubleOrNull == null) ? 2.0 : doubleOrNull);
        }
        DEBUG_OUTLINE_WIDTH = debug_OUTLINE_WIDTH;
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0002\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\u0010\tR\u001d\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0013\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0013\"\u0004\b\u001a\u0010\u0017¨\u0006\u001b" }, d2 = { "Lgg/essential/elementa/UIComponent$Timer;", "", "delay", "", "interval", "callback", "Lkotlin/Function1;", "", "", "(JJLkotlin/jvm/functions/Function1;)V", "getCallback", "()Lkotlin/jvm/functions/Function1;", "hasDelayed", "", "getHasDelayed", "()Z", "setHasDelayed", "(Z)V", "getInterval", "()J", "lastTime", "getLastTime", "setLastTime", "(J)V", "timeLeft", "getTimeLeft", "setTimeLeft", "Elementa" })
    private static final class Timer
    {
        private final long interval;
        @NotNull
        private final Function1<Integer, Unit> callback;
        private boolean hasDelayed;
        private long timeLeft;
        private long lastTime;
        
        public Timer(final long delay, final long interval, @NotNull final Function1<? super Integer, Unit> callback) {
            Intrinsics.checkNotNullParameter((Object)callback, "callback");
            super();
            this.interval = interval;
            this.callback = (Function1<Integer, Unit>)callback;
            this.timeLeft = delay;
            this.lastTime = System.currentTimeMillis();
            if (delay == 0L) {
                this.hasDelayed = true;
                this.timeLeft = this.interval;
            }
        }
        
        public final long getInterval() {
            return this.interval;
        }
        
        @NotNull
        public final Function1<Integer, Unit> getCallback() {
            return this.callback;
        }
        
        public final boolean getHasDelayed() {
            return this.hasDelayed;
        }
        
        public final void setHasDelayed(final boolean <set-?>) {
            this.hasDelayed = <set-?>;
        }
        
        public final long getTimeLeft() {
            return this.timeLeft;
        }
        
        public final void setTimeLeft(final long <set-?>) {
            this.timeLeft = <set-?>;
        }
        
        public final long getLastTime() {
            return this.lastTime;
        }
        
        public final void setLastTime(final long <set-?>) {
            this.lastTime = <set-?>;
        }
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J=\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0012H\u0000¢\u0006\u0002\b\u0013J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0004H\u0002J\r\u0010\u0019\u001a\u00020\u001aH\u0000¢\u0006\u0002\b\u001bJ\r\u0010\u001c\u001a\u00020\u001aH\u0000¢\u0006\u0002\b\u001dJ\u0016\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u00042\u0006\u0010 \u001a\u00020!J\u0016\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020!R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\"" }, d2 = { "Lgg/essential/elementa/UIComponent$Companion;", "", "()V", "DEBUG_OUTLINE_WIDTH", "", "getDEBUG_OUTLINE_WIDTH", "()D", "defaultComponentName", "", "drawDebugOutline", "", "matrixStack", "Lgg/essential/universal/UMatrixStack;", "left", "top", "right", "bottom", "component", "Lgg/essential/elementa/UIComponent;", "drawDebugOutline$Elementa", "getDebugColor", "Ljava/awt/Color;", "depth", "", "offset", "getMouseX", "", "getMouseX$Elementa", "getMouseY", "getMouseY$Elementa", "guiHint", "number", "roundDown", "", "Elementa" })
    public static final class Companion
    {
        private Companion() {
            super();
        }
        
        public final double getDEBUG_OUTLINE_WIDTH() {
            return UIComponent.access$getDEBUG_OUTLINE_WIDTH$cp();
        }
        
        public final void drawDebugOutline$Elementa(@NotNull final UMatrixStack matrixStack, final double left, final double top, final double right, final double bottom, @NotNull final UIComponent component) {
            Intrinsics.checkNotNullParameter((Object)matrixStack, "matrixStack");
            Intrinsics.checkNotNullParameter((Object)component, "component");
            if (ScissorEffect.Companion.getCurrentScissorState() != null) {
                GL11.glDisable(3089);
            }
            final Color color = this.getDebugColor(component.depth(), component.getParent().hashCode() / 3.141592653589793 % 3.141592653589793);
            UIBlock.Companion.drawBlock(matrixStack, color, left - this.getDEBUG_OUTLINE_WIDTH(), top - this.getDEBUG_OUTLINE_WIDTH(), right + this.getDEBUG_OUTLINE_WIDTH(), top);
            UIBlock.Companion.drawBlock(matrixStack, color, right, top, right + this.getDEBUG_OUTLINE_WIDTH(), bottom);
            UIBlock.Companion.drawBlock(matrixStack, color, left - this.getDEBUG_OUTLINE_WIDTH(), bottom, right + this.getDEBUG_OUTLINE_WIDTH(), bottom + this.getDEBUG_OUTLINE_WIDTH());
            UIBlock.Companion.drawBlock(matrixStack, color, left - this.getDEBUG_OUTLINE_WIDTH(), top, left, bottom);
            if (ScissorEffect.Companion.getCurrentScissorState() != null) {
                GL11.glEnable(3089);
            }
        }
        
        private final Color getDebugColor(final int depth, final double offset) {
            final double step = depth / 3.141592653589793 + offset;
            final int red = RangesKt.coerceIn((int)((Math.sin(step) + 0.75) * 170), (ClosedRange)new IntRange(0, 255));
            final int green = RangesKt.coerceIn((int)((Math.sin(step + 2.0943951023931953) + 0.75) * 170), (ClosedRange)new IntRange(0, 255));
            final int blue = RangesKt.coerceIn((int)((Math.sin(step + 4.1887902047863905) + 0.75) * 170), (ClosedRange)new IntRange(0, 255));
            return new Color(red, green, blue, 255);
        }
        
        public final float guiHint(final float number, final boolean roundDown) {
            final float factor = (float)UResolution.getScaleFactor();
            final float it = number * factor;
            final int n = 0;
            return (roundDown ? ((float)Math.floor(it)) : ((float)Math.ceil(it))) / factor;
        }
        
        public final double guiHint(final double number, final boolean roundDown) {
            final double factor = UResolution.getScaleFactor();
            final double it = number * factor;
            final int n = 0;
            return (roundDown ? Math.floor(it) : Math.ceil(it)) / factor;
        }
        
        public final float getMouseX$Elementa() {
            return (float)UMouse.Scaled.getX();
        }
        
        public final float getMouseY$Elementa() {
            return (float)UMouse.Scaled.getY();
        }
        
        public Companion(final DefaultConstructorMarker $constructor_marker) {
            this();
        }
    }
}
