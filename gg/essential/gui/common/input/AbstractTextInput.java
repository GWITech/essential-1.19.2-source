package gg.essential.gui.common.input;

import gg.essential.elementa.*;
import java.awt.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import gg.essential.gui.*;
import kotlin.jvm.functions.*;
import gg.essential.gui.friends.message.*;
import gg.essential.elementa.state.*;
import java.util.*;
import gg.essential.elementa.dsl.*;
import kotlin.collections.*;
import gg.essential.elementa.constraints.*;
import gg.essential.elementa.utils.*;
import gg.essential.elementa.font.*;
import kotlin.comparisons.*;
import kotlin.*;
import gg.essential.universal.*;
import kotlin.reflect.*;
import gg.essential.elementa.constraints.animation.*;
import gg.essential.elementa.components.*;
import kotlin.text.*;
import kotlin.ranges.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000ª\u0001
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u000e
                                                   \u0000
                                                   \u0002\u0010\u000b
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\b
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0010\u0002
                                                   \u0002\b\u0012
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u000f
                                                   \u0002\u0010\u0007
                                                   \u0002\b\b
                                                   \u0002\u0010\b
                                                   \u0002\b\u0005
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0005
                                                   \u0002\u0010	
                                                   \u0002\b\u000f
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0005
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0006
                                                   \u0002\u0018\u0002
                                                   \u0002\b
                                                   
                                                   \u0002\u0010!
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u000b
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0007
                                                   \u0002\u0010\f
                                                   \u0002\b\u000e
                                                   \u0002\u0018\u0002
                                                   \u0002\b\r
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u001f
                                                   \u0002\u0010 
                                                   \u0002\b\u000f\b&\u0018\u0000 \u00cc\u00012\u00020\u0001:\u0016\u00cb\u0001\u00cc\u0001\u00cd\u0001\u00ce\u0001\u00cf\u0001\u00d0\u0001\u00d1\u0001\u00d2\u0001\u00d3\u0001\u00d4\u0001\u00d5\u0001BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010	\u001a\u00020\u0007\u0012\u0006\u0010
                                                   \u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\u0007¢\u0006\u0002\u0010\u000eJ\u001f\u0010\u0084\u0001\u001a\u00020\u00142\u0007\u0010\u0085\u0001\u001a\u00020\u00032\u000b\u0010\u0086\u0001\u001a\u00060'R\u00020\u0000H\u0004J	\u0010\u0087\u0001\u001a\u00020\u0014H\u0014J	\u0010\u0088\u0001\u001a\u00020\u0014H\u0016J\u001f\u0010\u0089\u0001\u001a\u0005\u0018\u00010\u008a\u00012\u000b\u0010\u008b\u0001\u001a\u00060'R\u00020\u0000H\u0014¢\u0006\u0003\u0010\u008c\u0001J\u001f\u0010\u008d\u0001\u001a\u0005\u0018\u00010\u008a\u00012\u000b\u0010\u008b\u0001\u001a\u00060'R\u00020\u0000H\u0014¢\u0006\u0003\u0010\u008c\u0001J\u0012\u0010\u008e\u0001\u001a\u00020\u00142\u0007\u0010\u0085\u0001\u001a\u00020\u0003H\u0004J\u0016\u0010\u008f\u0001\u001a\u00020\u00142\u000b\u0010\u0090\u0001\u001a\u00060cR\u00020\u0000H\u0014J,\u0010\u0091\u0001\u001a\u00020\u00142\u000b\u0010\u0092\u0001\u001a\u00060'R\u00020\u00002\u000b\u0010\u0093\u0001\u001a\u00060'R\u00020\u00002\u0007\u0010\u0094\u0001\u001a\u00020\u0005H\u0004J	\u0010\u0095\u0001\u001a\u00020\u0014H\u0014J	\u0010\u0096\u0001\u001a\u00020\u0014H\u0014J\u0013\u0010\u0097\u0001\u001a\u00020\u00142\b\u0010\u0098\u0001\u001a\u00030\u0099\u0001H\u0016J\u0013\u0010\u009a\u0001\u001a\u00020\u00142\b\u0010\u0098\u0001\u001a\u00030\u0099\u0001H\u0014J6\u0010\u009b\u0001\u001a\u00020\u00142\b\u0010\u0098\u0001\u001a\u00030\u0099\u00012\u0006\u0010\u0013\u001a\u00020\u00032\u0007\u0010\u009c\u0001\u001a\u0002072\u0007\u0010\u009d\u0001\u001a\u0002072\u0007\u0010\u009e\u0001\u001a\u00020@H\u0014J,\u0010\u009b\u0001\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00032\u0007\u0010\u009c\u0001\u001a\u0002072\u0007\u0010\u009d\u0001\u001a\u0002072\u0007\u0010\u009e\u0001\u001a\u00020@H\u0015J6\u0010\u009f\u0001\u001a\u00020\u00142\b\u0010\u0098\u0001\u001a\u00030\u0099\u00012\u0006\u0010\u0013\u001a\u00020\u00032\u0007\u0010\u009c\u0001\u001a\u0002072\u0007\u0010\u009d\u0001\u001a\u0002072\u0007\u0010\u009e\u0001\u001a\u00020@H\u0004JR\u0010 \u0001\u001a\u00020\u00142\b\u0010\u0098\u0001\u001a\u00030\u0099\u00012\u0006\u0010\u0013\u001a\u00020\u00032\u0007\u0010\u009c\u0001\u001a\u0002072\u0007\u0010\u009e\u0001\u001a\u00020@2\u000b\b\u0002\u0010¡\u0001\u001a\u0004\u0018\u00010\u00072	\b\u0002\u0010¢\u0001\u001a\u00020\u00052\u000b\b\u0002\u0010£\u0001\u001a\u0004\u0018\u00010\u0007H\u0014J#\u0010 \u0001\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00032\u0007\u0010\u009c\u0001\u001a\u0002072\u0007\u0010\u009e\u0001\u001a\u00020@H\u0015J-\u0010¤\u0001\u001a\u00020\u00142\b\u0010\u0098\u0001\u001a\u00030\u0099\u00012\u0006\u0010\u0013\u001a\u00020\u00032\u0007\u0010\u009c\u0001\u001a\u0002072\u0007\u0010\u009e\u0001\u001a\u00020@H\u0004J$\u0010¥\u0001\u001a\u00060'R\u00020\u00002\u000b\u0010\u008b\u0001\u001a\u00060'R\u00020\u00002\b\u0010¦\u0001\u001a\u00030§\u0001H\u0014J\u001d\u0010¨\u0001\u001a\u0016\u0012\b\u0012\u00060'R\u00020\u0000\u0012\b\u0012\u00060'R\u00020\u00000FH\u0014J	\u0010©\u0001\u001a\u00020\u0003H&J#\u0010ª\u0001\u001a\u00020\u00032\u000b\u0010\u0092\u0001\u001a\u00060'R\u00020\u00002\u000b\u0010\u0093\u0001\u001a\u00060'R\u00020\u0000H\u0014J	\u0010«\u0001\u001a\u00020\u0005H\u0014J	\u0010¬\u0001\u001a\u00020\u0005H\u0014J\u0007\u0010\u00ad\u0001\u001a\u00020\u0005J\u0013\u0010®\u0001\u001a\u00020\u00052\b\u0010¯\u0001\u001a\u00030\u008a\u0001H\u0014J+\u0010°\u0001\u001a\u00020\u00002"\u0010±\u0001\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00140\u0010J	\u0010²\u0001\u001a\u00020\u0014H$J+\u0010³\u0001\u001a\u00020\u00002"\u0010±\u0001\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00140\u0010J	\u0010´\u0001\u001a\u00020\u0014H\u0014J	\u0010µ\u0001\u001a\u00020\u0014H$J\u0012\u0010¶\u0001\u001a\u00020\u00142\u0007\u0010·\u0001\u001a\u00020@H\u0014J#\u0010¸\u0001\u001a\u00020\u00142\u000b\u0010\u0092\u0001\u001a\u00060'R\u00020\u00002\u000b\u0010\u0093\u0001\u001a\u00060'R\u00020\u0000H\u0002J\u001f\u0010¹\u0001\u001a\u00060'R\u00020\u00002\u0007\u0010º\u0001\u001a\u0002072\u0007\u0010»\u0001\u001a\u000207H$J\u0016\u0010¼\u0001\u001a\u00020\u00142\u000b\u0010\u008b\u0001\u001a\u00060'R\u00020\u0000H$J	\u0010½\u0001\u001a\u00020\u0014H\u0014J\r\u0010¾\u0001\u001a\u00060'R\u00020\u0000H\u0014J\r\u0010¿\u0001\u001a\u00060'R\u00020\u0000H\u0014J\u000f\u0010\u001c\u001a\u00020\u00002\u0007\u0010\u00ad\u0001\u001a\u00020\u0005J\u0016\u0010\u00c0\u0001\u001a\u00020\u00142\u000b\u0010\u00c1\u0001\u001a\u00060'R\u00020\u0000H\u0002J\u000f\u0010\u00c2\u0001\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0003J\u001b\u0010\u00c3\u0001\u001a\u00020\u00142\u0007\u0010\u00c4\u0001\u001a\u0002072\u0007\u0010\u00c5\u0001\u001a\u000207H\u0002J!\u0010\u00c6\u0001\u001a	\u0012\u0004\u0012\u00020\u00030\u00c7\u00012\u0006\u0010\u0013\u001a\u00020\u00032\u0007\u0010\u00c8\u0001\u001a\u000207H\u0014J\u0018\u0010\u00c9\u0001\u001a	\u0012\u0004\u0012\u00020\u00030\u00c7\u00012\u0006\u0010\u0013\u001a\u00020\u0003H$J\u0007\u0010\u00ca\u0001\u001a\u00020\u0014R5\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00140\u0010X\u0084\u000e¢\u0006\u000e
                                                   \u0000\u001a\u0004\b\u0015\u0010\u0016"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u0005X\u0084\u000e¢\u0006\u000e
                                                   \u0000\u001a\u0004\b\u001a\u0010\u001b"\u0004\b\u001c\u0010\u001dR\u0014\u0010
                                                   \u001a\u00020\u0005X\u0084\u0004¢\u0006\b
                                                   \u0000\u001a\u0004\b\u001e\u0010\u001bR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e
                                                   \u0000\u001a\u0004\b\u001f\u0010\u001b"\u0004\b \u0010\u001dR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e
                                                   \u0000\u001a\u0004\b!\u0010""\u0004\b#\u0010$R\u000e\u0010%\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002
                                                   \u0000R,\u0010(\u001a\u00060'R\u00020\u00002
                                                   \u0010&\u001a\u00060'R\u00020\u0000@DX\u0084\u000e¢\u0006\u000e
                                                   \u0000\u001a\u0004\b)\u0010*"\u0004\b+\u0010,R\u0014\u0010\r\u001a\u00020\u0007X\u0084\u0004¢\u0006\b
                                                   \u0000\u001a\u0004\b-\u0010"R\u001a\u0010.\u001a\u00020\u0001X\u0084\u000e¢\u0006\u000e
                                                   \u0000\u001a\u0004\b/\u00100"\u0004\b1\u00102R\u001a\u00103\u001a\u00020\u0005X\u0084\u000e¢\u0006\u000e
                                                   \u0000\u001a\u0004\b4\u0010\u001b"\u0004\b5\u0010\u001dR\u001a\u00106\u001a\u000207X\u0084\u000e¢\u0006\u000e
                                                   \u0000\u001a\u0004\b8\u00109"\u0004\b:\u0010;R\u0014\u0010\u000b\u001a\u00020\u0007X\u0084\u0004¢\u0006\b
                                                   \u0000\u001a\u0004\b<\u0010"R\u001a\u0010\f\u001a\u00020\u0007X\u0084\u000e¢\u0006\u000e
                                                   \u0000\u001a\u0004\b=\u0010""\u0004\b>\u0010$R\u001a\u0010?\u001a\u00020@X\u0084\u000e¢\u0006\u000e
                                                   \u0000\u001a\u0004\bA\u0010B"\u0004\bC\u0010DR.\u0010E\u001a\u0016\u0012\b\u0012\u00060'R\u00020\u0000\u0012\b\u0012\u00060'R\u00020\u00000FX\u0084\u000e¢\u0006\u000e
                                                   \u0000\u001a\u0004\bG\u0010H"\u0004\bI\u0010JR\u001a\u0010K\u001a\u00020LX\u0084\u000e¢\u0006\u000e
                                                   \u0000\u001a\u0004\bM\u0010N"\u0004\bO\u0010PR$\u0010Q\u001a\u0002072\u0006\u0010&\u001a\u000207@FX\u0086\u000e¢\u0006\u000e
                                                   \u0000\u001a\u0004\bR\u00109"\u0004\bS\u0010;R,\u0010T\u001a\u00060'R\u00020\u00002
                                                   \u0010&\u001a\u00060'R\u00020\u0000@DX\u0084\u000e¢\u0006\u000e
                                                   \u0000\u001a\u0004\bU\u0010*"\u0004\bV\u0010,R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e
                                                   \u0000\u001a\u0004\bW\u0010X"\u0004\bY\u0010ZR\u0017\u0010[\u001a\b\u0012\u0004\u0012\u00020\u00070\¢\u0006\b
                                                   \u0000\u001a\u0004\b]\u0010^R\u0017\u0010_\u001a\b\u0012\u0004\u0012\u00020\u00050\¢\u0006\b
                                                   \u0000\u001a\u0004\b`\u0010^R\u001e\u0010a\u001a\f\u0012\b\u0012\u00060cR\u00020\u00000bX\u0084\u0004¢\u0006\b
                                                   \u0000\u001a\u0004\bd\u0010eR\u0014\u0010\b\u001a\u00020\u0007X\u0084\u0004¢\u0006\b
                                                   \u0000\u001a\u0004\bf\u0010"R\u001a\u0010	\u001a\u00020\u0007X\u0084\u000e¢\u0006\u000e
                                                   \u0000\u001a\u0004\bg\u0010""\u0004\bh\u0010$R\u001a\u0010i\u001a\u00020jX\u0084\u000e¢\u0006\u000e
                                                   \u0000\u001a\u0004\bk\u0010l"\u0004\bm\u0010nR\u001a\u0010o\u001a\u000207X\u0084\u000e¢\u0006\u000e
                                                   \u0000\u001a\u0004\bp\u00109"\u0004\bq\u0010;R\u0017\u0010r\u001a\b\u0012\u0004\u0012\u00020\u00030\¢\u0006\b
                                                   \u0000\u001a\u0004\bs\u0010^R\u001e\u0010t\u001a\f\u0012\b\u0012\u00060vR\u00020\u00000uX\u0084\u0004¢\u0006\b
                                                   \u0000\u001a\u0004\bw\u0010xR\u001e\u0010y\u001a\f\u0012\b\u0012\u00060cR\u00020\u00000bX\u0084\u0004¢\u0006\b
                                                   \u0000\u001a\u0004\bz\u0010eR5\u0010{\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00140\u0010X\u0084\u000e¢\u0006\u000e
                                                   \u0000\u001a\u0004\b|\u0010\u0016"\u0004\b}\u0010\u0018R\u001b\u0010~\u001a\u000207X\u0084\u000e¢\u0006\u000f
                                                   \u0000\u001a\u0004\b\u007f\u00109"\u0005\b\u0080\u0001\u0010;R!\u0010\u0081\u0001\u001a\r\u0012	\u0012\u00070\u0082\u0001R\u00020\u00000uX\u0084\u0004¢\u0006	
                                                   \u0000\u001a\u0005\b\u0083\u0001\u0010x¨\u0006\u00d6\u0001""" }, d2 = { "Lgg/essential/gui/common/input/AbstractTextInput;", "Lgg/essential/elementa/UIComponent;", "placeholder", "", "contentShadow", "", "contentShadowColor", "Ljava/awt/Color;", "selectionBackgroundColor", "selectionForegroundColor", "allowInactiveSelection", "inactiveSelectionBackgroundColor", "inactiveSelectionForegroundColor", "cursorColor", "(Ljava/lang/String;ZLjava/awt/Color;Ljava/awt/Color;Ljava/awt/Color;ZLjava/awt/Color;Ljava/awt/Color;Ljava/awt/Color;)V", "activateAction", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "text", "", "getActivateAction", "()Lkotlin/jvm/functions/Function1;", "setActivateAction", "(Lkotlin/jvm/functions/Function1;)V", "active", "getActive", "()Z", "setActive", "(Z)V", "getAllowInactiveSelection", "getContentShadow", "setContentShadow", "getContentShadowColor", "()Ljava/awt/Color;", "setContentShadowColor", "(Ljava/awt/Color;)V", "contextMenuOpen", "value", "Lgg/essential/gui/common/input/AbstractTextInput$LinePosition;", "cursor", "getCursor", "()Lgg/essential/gui/common/input/AbstractTextInput$LinePosition;", "setCursor", "(Lgg/essential/gui/common/input/AbstractTextInput$LinePosition;)V", "getCursorColor", "cursorComponent", "getCursorComponent", "()Lgg/essential/elementa/UIComponent;", "setCursorComponent", "(Lgg/essential/elementa/UIComponent;)V", "cursorNeedsRefocus", "getCursorNeedsRefocus", "setCursorNeedsRefocus", "horizontalScrollingOffset", "", "getHorizontalScrollingOffset", "()F", "setHorizontalScrollingOffset", "(F)V", "getInactiveSelectionBackgroundColor", "getInactiveSelectionForegroundColor", "setInactiveSelectionForegroundColor", "initiallySelectedLine", "", "getInitiallySelectedLine", "()I", "setInitiallySelectedLine", "(I)V", "initiallySelectedWord", "Lkotlin/Pair;", "getInitiallySelectedWord", "()Lkotlin/Pair;", "setInitiallySelectedWord", "(Lkotlin/Pair;)V", "lastSelectionMoveTimestamp", "", "getLastSelectionMoveTimestamp", "()J", "setLastSelectionMoveTimestamp", "(J)V", "lineHeight", "getLineHeight", "setLineHeight", "otherSelectionEnd", "getOtherSelectionEnd", "setOtherSelectionEnd", "getPlaceholder", "()Ljava/lang/String;", "setPlaceholder", "(Ljava/lang/String;)V", "placeholderColor", "Lgg/essential/elementa/state/BasicState;", "getPlaceholderColor", "()Lgg/essential/elementa/state/BasicState;", "placeholderShadow", "getPlaceholderShadow", "redoStack", "Ljava/util/ArrayDeque;", "Lgg/essential/gui/common/input/AbstractTextInput$TextOperation;", "getRedoStack", "()Ljava/util/ArrayDeque;", "getSelectionBackgroundColor", "getSelectionForegroundColor", "setSelectionForegroundColor", "selectionMode", "Lgg/essential/gui/common/input/AbstractTextInput$SelectionMode;", "getSelectionMode", "()Lgg/essential/gui/common/input/AbstractTextInput$SelectionMode;", "setSelectionMode", "(Lgg/essential/gui/common/input/AbstractTextInput$SelectionMode;)V", "targetVerticalScrollingOffset", "getTargetVerticalScrollingOffset", "setTargetVerticalScrollingOffset", "textState", "getTextState", "textualLines", "", "Lgg/essential/gui/common/input/AbstractTextInput$TextualLine;", "getTextualLines", "()Ljava/util/List;", "undoStack", "getUndoStack", "updateAction", "getUpdateAction", "setUpdateAction", "verticalScrollingOffset", "getVerticalScrollingOffset", "setVerticalScrollingOffset", "visualLines", "Lgg/essential/gui/common/input/AbstractTextInput$VisualLine;", "getVisualLines", "addText", "newText", "position", "animateCursor", "animationFrame", "charAfter", "", "pos", "(Lgg/essential/gui/common/input/AbstractTextInput$LinePosition;)Ljava/lang/Character;", "charBefore", "commitTextAddition", "commitTextOperation", "operation", "commitTextRemoval", "startPos", "endPos", "selectAfterUndo", "copySelection", "deleteSelection", "draw", "matrixStack", "Lgg/essential/universal/UMatrixStack;", "drawPlaceholder", "drawSelectedText", "left", "right", "row", "drawSelectedTextCompat", "drawUnselectedText", "color", "shadow", "shadowColor", "drawUnselectedTextCompat", "getNearestWordBoundary", "direction", "Lgg/essential/gui/common/input/AbstractTextInput$Direction;", "getSelection", "getText", "getTextBetween", "hasSelection", "hasText", "isActive", "isBreakingCharacter", "ch", "onActivate", "listener", "onEnterPressed", "onUpdate", "recalculateAllVisualLines", "recalculateDimensions", "recalculateVisualLinesFor", "textualLineIndex", "removeText", "screenPosToVisualPos", "x", "y", "scrollIntoView", "selectAll", "selectionEnd", "selectionStart", "setCursorPosition", "newPosition", "setText", "showOptionMenu", "posX", "posY", "splitTextForWrapping", "", "maxLineWidth", "textToLines", "undoLastOperation", "AddTextOperation", "Companion", "Direction", "Line", "LinePosition", "RemoveTextOperation", "ReplaceTextOperation", "SelectionMode", "TextOperation", "TextualLine", "VisualLine", "essential" })
public abstract class AbstractTextInput extends UIComponent
{
    @NotNull
    private String placeholder;
    private boolean contentShadow;
    @Nullable
    private Color contentShadowColor;
    @NotNull
    private final Color selectionBackgroundColor;
    @NotNull
    private Color selectionForegroundColor;
    private final boolean allowInactiveSelection;
    @NotNull
    private final Color inactiveSelectionBackgroundColor;
    @NotNull
    private Color inactiveSelectionForegroundColor;
    @NotNull
    private final Color cursorColor;
    @NotNull
    private final BasicState<Color> placeholderColor;
    @NotNull
    private final BasicState<Boolean> placeholderShadow;
    @NotNull
    private final BasicState<String> textState;
    private boolean contextMenuOpen;
    private boolean active;
    private float lineHeight;
    @NotNull
    private Function1<? super String, Unit> updateAction;
    @NotNull
    private Function1<? super String, Unit> activateAction;
    @NotNull
    private final List<TextualLine> textualLines;
    @NotNull
    private final List<VisualLine> visualLines;
    private float verticalScrollingOffset;
    private float targetVerticalScrollingOffset;
    private float horizontalScrollingOffset;
    private boolean cursorNeedsRefocus;
    private long lastSelectionMoveTimestamp;
    @NotNull
    private SelectionMode selectionMode;
    private int initiallySelectedLine;
    @NotNull
    private Pair<LinePosition, LinePosition> initiallySelectedWord;
    @NotNull
    private final ArrayDeque<AbstractTextInput.TextOperation> undoStack;
    @NotNull
    private final ArrayDeque<AbstractTextInput.TextOperation> redoStack;
    @NotNull
    private UIComponent cursorComponent;
    @NotNull
    private LinePosition cursor;
    @NotNull
    private LinePosition otherSelectionEnd;
    
    public AbstractTextInput(@NotNull final String placeholder, final boolean contentShadow, @Nullable final Color contentShadowColor, @NotNull final Color selectionBackgroundColor, @NotNull final Color selectionForegroundColor, final boolean allowInactiveSelection, @NotNull final Color inactiveSelectionBackgroundColor, @NotNull final Color inactiveSelectionForegroundColor, @NotNull final Color cursorColor) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc_w           "placeholder"
        //     4: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     7: aload           selectionBackgroundColor
        //     9: ldc_w           "selectionBackgroundColor"
        //    12: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    15: aload           selectionForegroundColor
        //    17: ldc_w           "selectionForegroundColor"
        //    20: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    23: aload           inactiveSelectionBackgroundColor
        //    25: ldc_w           "inactiveSelectionBackgroundColor"
        //    28: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    31: aload           inactiveSelectionForegroundColor
        //    33: ldc_w           "inactiveSelectionForegroundColor"
        //    36: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    39: aload           cursorColor
        //    41: ldc_w           "cursorColor"
        //    44: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    47: aload_0         /* this */
        //    48: invokespecial   gg/essential/elementa/UIComponent.<init>:()V
        //    51: aload_0         /* this */
        //    52: aload_1         /* placeholder */
        //    53: putfield        gg/essential/gui/common/input/AbstractTextInput.placeholder:Ljava/lang/String;
        //    56: aload_0         /* this */
        //    57: iload_2         /* contentShadow */
        //    58: putfield        gg/essential/gui/common/input/AbstractTextInput.contentShadow:Z
        //    61: aload_0         /* this */
        //    62: aload_3         /* contentShadowColor */
        //    63: putfield        gg/essential/gui/common/input/AbstractTextInput.contentShadowColor:Ljava/awt/Color;
        //    66: aload_0         /* this */
        //    67: aload           selectionBackgroundColor
        //    69: putfield        gg/essential/gui/common/input/AbstractTextInput.selectionBackgroundColor:Ljava/awt/Color;
        //    72: aload_0         /* this */
        //    73: aload           selectionForegroundColor
        //    75: putfield        gg/essential/gui/common/input/AbstractTextInput.selectionForegroundColor:Ljava/awt/Color;
        //    78: aload_0         /* this */
        //    79: iconst_0       
        //    80: putfield        gg/essential/gui/common/input/AbstractTextInput.allowInactiveSelection:Z
        //    83: aload_0         /* this */
        //    84: aload           inactiveSelectionBackgroundColor
        //    86: putfield        gg/essential/gui/common/input/AbstractTextInput.inactiveSelectionBackgroundColor:Ljava/awt/Color;
        //    89: aload_0         /* this */
        //    90: aload           inactiveSelectionForegroundColor
        //    92: putfield        gg/essential/gui/common/input/AbstractTextInput.inactiveSelectionForegroundColor:Ljava/awt/Color;
        //    95: aload_0         /* this */
        //    96: aload           cursorColor
        //    98: putfield        gg/essential/gui/common/input/AbstractTextInput.cursorColor:Ljava/awt/Color;
        //   101: aload_0         /* this */
        //   102: new             Lgg/essential/elementa/state/BasicState;
        //   105: dup            
        //   106: getstatic       gg/essential/gui/EssentialPalette.TEXT:Ljava/awt/Color;
        //   109: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //   112: putfield        gg/essential/gui/common/input/AbstractTextInput.placeholderColor:Lgg/essential/elementa/state/BasicState;
        //   115: aload_0         /* this */
        //   116: new             Lgg/essential/elementa/state/BasicState;
        //   119: dup            
        //   120: iconst_1       
        //   121: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   124: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //   127: putfield        gg/essential/gui/common/input/AbstractTextInput.placeholderShadow:Lgg/essential/elementa/state/BasicState;
        //   130: aload_0         /* this */
        //   131: new             Lgg/essential/elementa/state/BasicState;
        //   134: dup            
        //   135: ldc_w           ""
        //   138: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //   141: putfield        gg/essential/gui/common/input/AbstractTextInput.textState:Lgg/essential/elementa/state/BasicState;
        //   144: aload_0         /* this */
        //   145: ldc_w           9.0
        //   148: putfield        gg/essential/gui/common/input/AbstractTextInput.lineHeight:F
        //   151: aload_0         /* this */
        //   152: getstatic       gg/essential/gui/common/input/AbstractTextInput$updateAction$1.INSTANCE:Lgg/essential/gui/common/input/AbstractTextInput$updateAction$1;
        //   155: checkcast       Lkotlin/jvm/functions/Function1;
        //   158: putfield        gg/essential/gui/common/input/AbstractTextInput.updateAction:Lkotlin/jvm/functions/Function1;
        //   161: aload_0         /* this */
        //   162: getstatic       gg/essential/gui/common/input/AbstractTextInput$activateAction$1.INSTANCE:Lgg/essential/gui/common/input/AbstractTextInput$activateAction$1;
        //   165: checkcast       Lkotlin/jvm/functions/Function1;
        //   168: putfield        gg/essential/gui/common/input/AbstractTextInput.activateAction:Lkotlin/jvm/functions/Function1;
        //   171: aload_0         /* this */
        //   172: iconst_1       
        //   173: anewarray       Lgg/essential/gui/common/input/AbstractTextInput$TextualLine;
        //   176: astore          10
        //   178: aload           10
        //   180: iconst_0       
        //   181: new             Lgg/essential/gui/common/input/AbstractTextInput$TextualLine;
        //   184: dup            
        //   185: ldc_w           ""
        //   188: new             Lkotlin/ranges/IntRange;
        //   191: dup            
        //   192: iconst_0       
        //   193: iconst_0       
        //   194: invokespecial   kotlin/ranges/IntRange.<init>:(II)V
        //   197: invokespecial   gg/essential/gui/common/input/AbstractTextInput$TextualLine.<init>:(Ljava/lang/String;Lkotlin/ranges/IntRange;)V
        //   200: aastore        
        //   201: aload           10
        //   203: invokestatic    kotlin/collections/CollectionsKt.mutableListOf:([Ljava/lang/Object;)Ljava/util/List;
        //   206: putfield        gg/essential/gui/common/input/AbstractTextInput.textualLines:Ljava/util/List;
        //   209: aload_0         /* this */
        //   210: iconst_1       
        //   211: anewarray       Lgg/essential/gui/common/input/AbstractTextInput$VisualLine;
        //   214: astore          10
        //   216: aload           10
        //   218: iconst_0       
        //   219: new             Lgg/essential/gui/common/input/AbstractTextInput$VisualLine;
        //   222: dup            
        //   223: ldc_w           ""
        //   226: iconst_0       
        //   227: invokespecial   gg/essential/gui/common/input/AbstractTextInput$VisualLine.<init>:(Ljava/lang/String;I)V
        //   230: aastore        
        //   231: aload           10
        //   233: invokestatic    kotlin/collections/CollectionsKt.mutableListOf:([Ljava/lang/Object;)Ljava/util/List;
        //   236: putfield        gg/essential/gui/common/input/AbstractTextInput.visualLines:Ljava/util/List;
        //   239: aload_0         /* this */
        //   240: invokestatic    java/lang/System.currentTimeMillis:()J
        //   243: putfield        gg/essential/gui/common/input/AbstractTextInput.lastSelectionMoveTimestamp:J
        //   246: aload_0         /* this */
        //   247: getstatic       gg/essential/gui/common/input/AbstractTextInput$SelectionMode.None:Lgg/essential/gui/common/input/AbstractTextInput$SelectionMode;
        //   250: putfield        gg/essential/gui/common/input/AbstractTextInput.selectionMode:Lgg/essential/gui/common/input/AbstractTextInput$SelectionMode;
        //   253: aload_0         /* this */
        //   254: iconst_m1      
        //   255: putfield        gg/essential/gui/common/input/AbstractTextInput.initiallySelectedLine:I
        //   258: aload_0         /* this */
        //   259: new             Lgg/essential/gui/common/input/AbstractTextInput$LinePosition;
        //   262: dup            
        //   263: aload_0         /* this */
        //   264: iconst_0       
        //   265: iconst_0       
        //   266: iconst_1       
        //   267: invokespecial   gg/essential/gui/common/input/AbstractTextInput$LinePosition.<init>:(Lgg/essential/gui/common/input/AbstractTextInput;IIZ)V
        //   270: new             Lgg/essential/gui/common/input/AbstractTextInput$LinePosition;
        //   273: dup            
        //   274: aload_0         /* this */
        //   275: iconst_0       
        //   276: iconst_0       
        //   277: iconst_1       
        //   278: invokespecial   gg/essential/gui/common/input/AbstractTextInput$LinePosition.<init>:(Lgg/essential/gui/common/input/AbstractTextInput;IIZ)V
        //   281: invokestatic    kotlin/TuplesKt.to:(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
        //   284: putfield        gg/essential/gui/common/input/AbstractTextInput.initiallySelectedWord:Lkotlin/Pair;
        //   287: aload_0         /* this */
        //   288: new             Ljava/util/ArrayDeque;
        //   291: dup            
        //   292: invokespecial   java/util/ArrayDeque.<init>:()V
        //   295: putfield        gg/essential/gui/common/input/AbstractTextInput.undoStack:Ljava/util/ArrayDeque;
        //   298: aload_0         /* this */
        //   299: new             Ljava/util/ArrayDeque;
        //   302: dup            
        //   303: invokespecial   java/util/ArrayDeque.<init>:()V
        //   306: putfield        gg/essential/gui/common/input/AbstractTextInput.redoStack:Ljava/util/ArrayDeque;
        //   309: aload_0         /* this */
        //   310: new             Lgg/essential/elementa/components/UIBlock;
        //   313: dup            
        //   314: new             Ljava/awt/Color;
        //   317: dup            
        //   318: sipush          255
        //   321: sipush          255
        //   324: sipush          255
        //   327: iconst_0       
        //   328: invokespecial   java/awt/Color.<init>:(IIII)V
        //   331: invokespecial   gg/essential/elementa/components/UIBlock.<init>:(Ljava/awt/Color;)V
        //   334: checkcast       Lgg/essential/elementa/UIComponent;
        //   337: astore          $this$constrain$iv
        //   339: aload           $this$constrain$iv
        //   341: astore          11
        //   343: aload           11
        //   345: astore          $this$constrain_u24lambda_u2d0$iv
        //   347: aload           $this$constrain_u24lambda_u2d0$iv
        //   349: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   352: astore          13
        //   354: astore          14
        //   356: aload           $this$cursorComponent_u24lambda_u2d0
        //   358: new             Lgg/essential/elementa/constraints/CenterConstraint;
        //   361: dup            
        //   362: invokespecial   gg/essential/elementa/constraints/CenterConstraint.<init>:()V
        //   365: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   368: ldc_w           0.5
        //   371: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //   374: checkcast       Ljava/lang/Number;
        //   377: iconst_0       
        //   378: iconst_0       
        //   379: iconst_3       
        //   380: aconst_null    
        //   381: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels$default:(Ljava/lang/Number;ZZILjava/lang/Object;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   384: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   387: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.minus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/SubtractiveConstraint;
        //   390: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   393: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   396: aload           $this$cursorComponent_u24lambda_u2d0
        //   398: iconst_1       
        //   399: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   402: checkcast       Ljava/lang/Number;
        //   405: iconst_0       
        //   406: iconst_0       
        //   407: iconst_3       
        //   408: aconst_null    
        //   409: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixel$default:(Ljava/lang/Number;ZZILjava/lang/Object;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   412: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   415: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   418: aload           $this$cursorComponent_u24lambda_u2d0
        //   420: aload_0         /* this */
        //   421: getfield        gg/essential/gui/common/input/AbstractTextInput.lineHeight:F
        //   424: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //   427: checkcast       Ljava/lang/Number;
        //   430: iconst_0       
        //   431: iconst_0       
        //   432: iconst_3       
        //   433: aconst_null    
        //   434: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels$default:(Ljava/lang/Number;ZZILjava/lang/Object;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   437: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   440: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   443: aload           14
        //   445: aload           11
        //   447: aload_0         /* this */
        //   448: checkcast       Lgg/essential/elementa/UIComponent;
        //   451: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   454: putfield        gg/essential/gui/common/input/AbstractTextInput.cursorComponent:Lgg/essential/elementa/UIComponent;
        //   457: aload_0         /* this */
        //   458: new             Lgg/essential/gui/common/input/AbstractTextInput$LinePosition;
        //   461: dup            
        //   462: aload_0         /* this */
        //   463: iconst_0       
        //   464: iconst_0       
        //   465: iconst_1       
        //   466: invokespecial   gg/essential/gui/common/input/AbstractTextInput$LinePosition.<init>:(Lgg/essential/gui/common/input/AbstractTextInput;IIZ)V
        //   469: putfield        gg/essential/gui/common/input/AbstractTextInput.cursor:Lgg/essential/gui/common/input/AbstractTextInput$LinePosition;
        //   472: aload_0         /* this */
        //   473: new             Lgg/essential/gui/common/input/AbstractTextInput$LinePosition;
        //   476: dup            
        //   477: aload_0         /* this */
        //   478: iconst_0       
        //   479: iconst_0       
        //   480: iconst_1       
        //   481: invokespecial   gg/essential/gui/common/input/AbstractTextInput$LinePosition.<init>:(Lgg/essential/gui/common/input/AbstractTextInput;IIZ)V
        //   484: putfield        gg/essential/gui/common/input/AbstractTextInput.otherSelectionEnd:Lgg/essential/gui/common/input/AbstractTextInput$LinePosition;
        //   487: aload_0         /* this */
        //   488: aload_0         /* this */
        //   489: getfield        gg/essential/gui/common/input/AbstractTextInput.lineHeight:F
        //   492: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //   495: checkcast       Ljava/lang/Number;
        //   498: iconst_0       
        //   499: iconst_0       
        //   500: iconst_3       
        //   501: aconst_null    
        //   502: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels$default:(Ljava/lang/Number;ZZILjava/lang/Object;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   505: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   508: invokevirtual   gg/essential/gui/common/input/AbstractTextInput.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)Lgg/essential/elementa/UIComponent;
        //   511: pop            
        //   512: aload_0         /* this */
        //   513: new             Lgg/essential/gui/common/input/AbstractTextInput$1;
        //   516: dup            
        //   517: aload_0         /* this */
        //   518: invokespecial   gg/essential/gui/common/input/AbstractTextInput$1.<init>:(Lgg/essential/gui/common/input/AbstractTextInput;)V
        //   521: checkcast       Lkotlin/jvm/functions/Function3;
        //   524: invokevirtual   gg/essential/gui/common/input/AbstractTextInput.onKeyType:(Lkotlin/jvm/functions/Function3;)Lgg/essential/elementa/UIComponent;
        //   527: pop            
        //   528: aload_0         /* this */
        //   529: new             Lgg/essential/gui/common/input/AbstractTextInput$2;
        //   532: dup            
        //   533: aload_0         /* this */
        //   534: invokespecial   gg/essential/gui/common/input/AbstractTextInput$2.<init>:(Lgg/essential/gui/common/input/AbstractTextInput;)V
        //   537: checkcast       Lkotlin/jvm/functions/Function2;
        //   540: invokevirtual   gg/essential/gui/common/input/AbstractTextInput.onMouseScroll:(Lkotlin/jvm/functions/Function2;)Lgg/essential/elementa/UIComponent;
        //   543: pop            
        //   544: aload_0         /* this */
        //   545: new             Lgg/essential/gui/common/input/AbstractTextInput$3;
        //   548: dup            
        //   549: aload_0         /* this */
        //   550: invokespecial   gg/essential/gui/common/input/AbstractTextInput$3.<init>:(Lgg/essential/gui/common/input/AbstractTextInput;)V
        //   553: checkcast       Lkotlin/jvm/functions/Function2;
        //   556: invokevirtual   gg/essential/gui/common/input/AbstractTextInput.onMouseClick:(Lkotlin/jvm/functions/Function2;)Lgg/essential/elementa/UIComponent;
        //   559: pop            
        //   560: aload_0         /* this */
        //   561: new             Lgg/essential/gui/common/input/AbstractTextInput$4;
        //   564: dup            
        //   565: aload_0         /* this */
        //   566: invokespecial   gg/essential/gui/common/input/AbstractTextInput$4.<init>:(Lgg/essential/gui/common/input/AbstractTextInput;)V
        //   569: checkcast       Lkotlin/jvm/functions/Function2;
        //   572: invokevirtual   gg/essential/gui/common/input/AbstractTextInput.onMouseClick:(Lkotlin/jvm/functions/Function2;)Lgg/essential/elementa/UIComponent;
        //   575: pop            
        //   576: aload_0         /* this */
        //   577: new             Lgg/essential/gui/common/input/AbstractTextInput$5;
        //   580: dup            
        //   581: aload_0         /* this */
        //   582: invokespecial   gg/essential/gui/common/input/AbstractTextInput$5.<init>:(Lgg/essential/gui/common/input/AbstractTextInput;)V
        //   585: checkcast       Lkotlin/jvm/functions/Function4;
        //   588: invokevirtual   gg/essential/gui/common/input/AbstractTextInput.onMouseDrag:(Lkotlin/jvm/functions/Function4;)Lgg/essential/elementa/UIComponent;
        //   591: pop            
        //   592: aload_0         /* this */
        //   593: new             Lgg/essential/gui/common/input/AbstractTextInput$6;
        //   596: dup            
        //   597: aload_0         /* this */
        //   598: invokespecial   gg/essential/gui/common/input/AbstractTextInput$6.<init>:(Lgg/essential/gui/common/input/AbstractTextInput;)V
        //   601: checkcast       Lkotlin/jvm/functions/Function1;
        //   604: invokevirtual   gg/essential/gui/common/input/AbstractTextInput.onMouseRelease:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/UIComponent;
        //   607: pop            
        //   608: aload_0         /* this */
        //   609: new             Lgg/essential/gui/common/input/AbstractTextInput$7;
        //   612: dup            
        //   613: aload_0         /* this */
        //   614: invokespecial   gg/essential/gui/common/input/AbstractTextInput$7.<init>:(Lgg/essential/gui/common/input/AbstractTextInput;)V
        //   617: checkcast       Lkotlin/jvm/functions/Function1;
        //   620: invokevirtual   gg/essential/gui/common/input/AbstractTextInput.onFocus:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/UIComponent;
        //   623: pop            
        //   624: aload_0         /* this */
        //   625: new             Lgg/essential/gui/common/input/AbstractTextInput$8;
        //   628: dup            
        //   629: aload_0         /* this */
        //   630: invokespecial   gg/essential/gui/common/input/AbstractTextInput$8.<init>:(Lgg/essential/gui/common/input/AbstractTextInput;)V
        //   633: checkcast       Lkotlin/jvm/functions/Function1;
        //   636: invokevirtual   gg/essential/gui/common/input/AbstractTextInput.onFocusLost:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/UIComponent;
        //   639: pop            
        //   640: aload_0         /* this */
        //   641: getfield        gg/essential/gui/common/input/AbstractTextInput.cursorComponent:Lgg/essential/elementa/UIComponent;
        //   644: new             Lgg/essential/gui/common/input/AbstractTextInput$9;
        //   647: dup            
        //   648: aload_0         /* this */
        //   649: invokespecial   gg/essential/gui/common/input/AbstractTextInput$9.<init>:(Lgg/essential/gui/common/input/AbstractTextInput;)V
        //   652: checkcast       Lkotlin/jvm/functions/Function1;
        //   655: invokevirtual   gg/essential/elementa/UIComponent.animateAfterUnhide:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/UIComponent;
        //   658: pop            
        //   659: aload_0         /* this */
        //   660: new             Lgg/essential/elementa/effects/ScissorEffect;
        //   663: dup            
        //   664: aconst_null    
        //   665: iconst_0       
        //   666: iconst_3       
        //   667: aconst_null    
        //   668: invokespecial   gg/essential/elementa/effects/ScissorEffect.<init>:(Lgg/essential/elementa/UIComponent;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   671: checkcast       Lgg/essential/elementa/effects/Effect;
        //   674: invokevirtual   gg/essential/gui/common/input/AbstractTextInput.enableEffect:(Lgg/essential/elementa/effects/Effect;)Lgg/essential/elementa/UIComponent;
        //   677: pop            
        //   678: aload_0         /* this */
        //   679: getfield        gg/essential/gui/common/input/AbstractTextInput.textState:Lgg/essential/elementa/state/BasicState;
        //   682: new             Lgg/essential/gui/common/input/AbstractTextInput$10;
        //   685: dup            
        //   686: aload_0         /* this */
        //   687: invokespecial   gg/essential/gui/common/input/AbstractTextInput$10.<init>:(Lgg/essential/gui/common/input/AbstractTextInput;)V
        //   690: checkcast       Lkotlin/jvm/functions/Function1;
        //   693: invokevirtual   gg/essential/elementa/state/BasicState.onSetValue:(Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function0;
        //   696: pop            
        //   697: return         
        //    MethodParameters:
        //  Name                              Flags  
        //  --------------------------------  -----
        //  placeholder                       
        //  contentShadow                     
        //  contentShadowColor                
        //  selectionBackgroundColor          
        //  selectionForegroundColor          
        //  allowInactiveSelection            
        //  inactiveSelectionBackgroundColor  
        //  inactiveSelectionForegroundColor  
        //  cursorColor                       
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public final void setPlaceholder(@NotNull final String <set-?>) {
        Intrinsics.checkNotNullParameter((Object)<set-?>, "<set-?>");
        this.placeholder = <set-?>;
    }
    
    @NotNull
    protected final Color getSelectionForegroundColor() {
        return this.selectionForegroundColor;
    }
    
    protected final void setSelectionForegroundColor(@NotNull final Color <set-?>) {
        Intrinsics.checkNotNullParameter((Object)<set-?>, "<set-?>");
        this.selectionForegroundColor = <set-?>;
    }
    
    @NotNull
    protected final Color getInactiveSelectionForegroundColor() {
        return this.inactiveSelectionForegroundColor;
    }
    
    protected final void setInactiveSelectionForegroundColor(@NotNull final Color <set-?>) {
        Intrinsics.checkNotNullParameter((Object)<set-?>, "<set-?>");
        this.inactiveSelectionForegroundColor = <set-?>;
    }
    
    @NotNull
    protected final Color getCursorColor() {
        return this.cursorColor;
    }
    
    @NotNull
    public final BasicState<Color> getPlaceholderColor() {
        return this.placeholderColor;
    }
    
    @NotNull
    public final BasicState<String> getTextState() {
        return this.textState;
    }
    
    protected final boolean getActive() {
        return this.active;
    }
    
    public final float getLineHeight() {
        return this.lineHeight;
    }
    
    @NotNull
    protected final Function1<String, Unit> getUpdateAction() {
        return (Function1<String, Unit>)this.updateAction;
    }
    
    @NotNull
    protected final Function1<String, Unit> getActivateAction() {
        return (Function1<String, Unit>)this.activateAction;
    }
    
    @NotNull
    protected final List<TextualLine> getTextualLines() {
        return this.textualLines;
    }
    
    @NotNull
    protected final List<VisualLine> getVisualLines() {
        return this.visualLines;
    }
    
    protected final float getVerticalScrollingOffset() {
        return this.verticalScrollingOffset;
    }
    
    protected final float getTargetVerticalScrollingOffset() {
        return this.targetVerticalScrollingOffset;
    }
    
    protected final void setTargetVerticalScrollingOffset(final float <set-?>) {
        this.targetVerticalScrollingOffset = <set-?>;
    }
    
    protected final float getHorizontalScrollingOffset() {
        return this.horizontalScrollingOffset;
    }
    
    protected final void setHorizontalScrollingOffset(final float <set-?>) {
        this.horizontalScrollingOffset = <set-?>;
    }
    
    protected final void setCursorNeedsRefocus$1385ff() {
        this.cursorNeedsRefocus = true;
    }
    
    protected final long getLastSelectionMoveTimestamp() {
        return this.lastSelectionMoveTimestamp;
    }
    
    protected final void setLastSelectionMoveTimestamp(final long <set-?>) {
        this.lastSelectionMoveTimestamp = <set-?>;
    }
    
    @NotNull
    protected final SelectionMode getSelectionMode() {
        return this.selectionMode;
    }
    
    protected final void setSelectionMode(@NotNull final SelectionMode <set-?>) {
        Intrinsics.checkNotNullParameter((Object)<set-?>, "<set-?>");
        this.selectionMode = <set-?>;
    }
    
    protected final int getInitiallySelectedLine() {
        return this.initiallySelectedLine;
    }
    
    protected final void setInitiallySelectedLine(final int <set-?>) {
        this.initiallySelectedLine = <set-?>;
    }
    
    @NotNull
    protected final Pair<LinePosition, LinePosition> getInitiallySelectedWord() {
        return this.initiallySelectedWord;
    }
    
    protected final void setInitiallySelectedWord(@NotNull final Pair<LinePosition, LinePosition> <set-?>) {
        Intrinsics.checkNotNullParameter((Object)<set-?>, "<set-?>");
        this.initiallySelectedWord = <set-?>;
    }
    
    @NotNull
    protected final ArrayDeque<AbstractTextInput.TextOperation> getUndoStack() {
        return this.undoStack;
    }
    
    @NotNull
    protected final ArrayDeque<AbstractTextInput.TextOperation> getRedoStack() {
        return this.redoStack;
    }
    
    @NotNull
    protected final UIComponent getCursorComponent() {
        return this.cursorComponent;
    }
    
    @NotNull
    protected final LinePosition getCursor() {
        return this.cursor;
    }
    
    protected final void setCursor(@NotNull final LinePosition value) {
        Intrinsics.checkNotNullParameter((Object)value, "value");
        this.cursor = value.toVisualPos();
    }
    
    @NotNull
    protected final LinePosition getOtherSelectionEnd() {
        return this.otherSelectionEnd;
    }
    
    protected final void setOtherSelectionEnd(@NotNull final LinePosition value) {
        Intrinsics.checkNotNullParameter((Object)value, "value");
        this.otherSelectionEnd = value.toVisualPos();
    }
    
    private final void showOptionMenu(final float posX, final float posY) {
        this.contextMenuOpen = true;
        final List options = new ArrayList();
        if (this.hasSelection()) {
            options.add(new OptionMenu.Option("Copy", null, EssentialPalette.COPY_9X, null, null, null, null, (Function0)new AbstractTextInput$showOptionMenu.AbstractTextInput$showOptionMenu$1(this), 122));
            options.add(new OptionMenu.Option("Cut", null, EssentialPalette.CUT_8X, null, null, null, null, (Function0)new AbstractTextInput$showOptionMenu.AbstractTextInput$showOptionMenu$2(this), 122));
        }
        options.add(new OptionMenu.Option("Paste", null, EssentialPalette.PASTE_6X8, null, null, null, null, (Function0)new AbstractTextInput$showOptionMenu.AbstractTextInput$showOptionMenu$3(this), 122));
        final Collection thisCollection$iv;
        final Collection $this$toTypedArray$iv = thisCollection$iv = options;
        final OptionMenu.Option[] array = thisCollection$iv.toArray(new OptionMenu.Option[0]);
        Intrinsics.checkNotNull((Object)array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        final OptionMenu.Option[] original = array;
        final OptionMenu menu = ComponentsKt.childOf(new OptionMenu(posX, posY, (OptionMenu.Option[])Arrays.copyOf(original, original.length)), Window.Companion.of(this));
        menu.init();
        menu.setFloating(true);
        menu.onClose((Function0<Unit>)new AbstractTextInput$showOptionMenu.AbstractTextInput$showOptionMenu$4(menu, this));
    }
    
    public final void undoLastOperation() {
        if (this.undoStack.isEmpty()) {
            return;
        }
        final AbstractTextInput.TextOperation operationToUndo = this.undoStack.pop();
        operationToUndo.undo();
        this.redoStack.push(operationToUndo);
    }
    
    @Override
    public void draw(@NotNull final UMatrixStack matrixStack) {
        Intrinsics.checkNotNullParameter((Object)matrixStack, "matrixStack");
        this.cursorComponent.setHeight(UtilitiesKt.pixels$default(this.lineHeight * this.getTextScale(), false, false, 3, null));
        super.draw(matrixStack);
    }
    
    @NotNull
    public abstract String getText();
    
    public final void setText(@NotNull final String text) {
        Intrinsics.checkNotNullParameter((Object)text, "text");
        final LinePosition absoluteStart = new LinePosition(0, 0, true);
        final AbstractTextInput.ReplaceTextOperation replaceTextOperation = new AbstractTextInput.ReplaceTextOperation(new AbstractTextInput.AddTextOperation(this, text, absoluteStart), new AbstractTextInput.RemoveTextOperation(this, absoluteStart, new LinePosition(CollectionsKt.getLastIndex((List)this.visualLines), ((Line)CollectionsKt.last((List)this.visualLines)).getLength(), true), true));
        this.commitTextOperation((AbstractTextInput.TextOperation)replaceTextOperation);
    }
    
    protected abstract void scrollIntoView(@NotNull final LinePosition p0);
    
    @NotNull
    protected abstract LinePosition screenPosToVisualPos(final float p0, final float p1);
    
    protected abstract void recalculateDimensions();
    
    @NotNull
    protected abstract List<String> textToLines(@NotNull final String p0);
    
    protected abstract void onEnterPressed();
    
    @NotNull
    public final AbstractTextInput setActive(final boolean isActive) {
        final AbstractTextInput $this$setActive_u24lambda_u2d1 = this;
        $this$setActive_u24lambda_u2d1.active = isActive;
        if (isActive) {
            UIComponent.unhide$default($this$setActive_u24lambda_u2d1.cursorComponent, false, 1, null);
            $this$setActive_u24lambda_u2d1.animateCursor();
        }
        else {
            $this$setActive_u24lambda_u2d1.cursorComponent.setColor(UtilitiesKt.toConstraint(new Color(255, 255, 255, 0)));
            if ($this$setActive_u24lambda_u2d1.hasText() && (!$this$setActive_u24lambda_u2d1.allowInactiveSelection || !$this$setActive_u24lambda_u2d1.hasSelection())) {
                $this$setActive_u24lambda_u2d1.setCursorPosition($this$setActive_u24lambda_u2d1.new LinePosition(CollectionsKt.getLastIndex((List)$this$setActive_u24lambda_u2d1.visualLines), ((Line)CollectionsKt.last((List)$this$setActive_u24lambda_u2d1.visualLines)).getLength(), true));
            }
        }
        return this;
    }
    
    @NotNull
    public final AbstractTextInput onUpdate(@NotNull final Function1<? super String, Unit> listener) {
        Intrinsics.checkNotNullParameter((Object)listener, "listener");
        final AbstractTextInput $this$onUpdate_u24lambda_u2d2 = this;
        $this$onUpdate_u24lambda_u2d2.updateAction = listener;
        return this;
    }
    
    protected void commitTextOperation(@NotNull final AbstractTextInput.TextOperation operation) {
        Intrinsics.checkNotNullParameter((Object)operation, "operation");
        operation.redo();
        this.undoStack.push(operation);
        this.redoStack.clear();
    }
    
    protected final void commitTextAddition(@NotNull final String newText) {
        Intrinsics.checkNotNullParameter((Object)newText, "newText");
        final AbstractTextInput.AddTextOperation addTextOperation = new AbstractTextInput.AddTextOperation(this, newText, this.cursor);
        if (this.hasSelection()) {
            final AbstractTextInput.RemoveTextOperation removeTextOperation = new AbstractTextInput.RemoveTextOperation(this, this.selectionStart(), this.selectionEnd(), true);
            final AbstractTextInput.ReplaceTextOperation replaceTextOperation = new AbstractTextInput.ReplaceTextOperation(addTextOperation, removeTextOperation);
            this.commitTextOperation((AbstractTextInput.TextOperation)replaceTextOperation);
            return;
        }
        this.commitTextOperation((AbstractTextInput.TextOperation)addTextOperation);
    }
    
    protected final void addText(@NotNull final String newText, @NotNull final LinePosition position) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc_w           "newText"
        //     4: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     7: aload_2         /* position */
        //     8: ldc_w           "position"
        //    11: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    14: aload_2         /* position */
        //    15: invokevirtual   gg/essential/gui/common/input/AbstractTextInput$LinePosition.toTextualPos:()Lgg/essential/gui/common/input/AbstractTextInput$LinePosition;
        //    18: astore_3        /* textPos */
        //    19: aload_0         /* this */
        //    20: getfield        gg/essential/gui/common/input/AbstractTextInput.textualLines:Ljava/util/List;
        //    23: aload_3         /* textPos */
        //    24: invokevirtual   gg/essential/gui/common/input/AbstractTextInput$LinePosition.getLine:()I
        //    27: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //    32: checkcast       Lgg/essential/gui/common/input/AbstractTextInput$TextualLine;
        //    35: astore          textualLine
        //    37: aload_0         /* this */
        //    38: aload_1         /* newText */
        //    39: invokevirtual   gg/essential/gui/common/input/AbstractTextInput.textToLines:(Ljava/lang/String;)Ljava/util/List;
        //    42: astore          lines
        //    44: aload           lines
        //    46: invokeinterface java/util/List.isEmpty:()Z
        //    51: ifeq            55
        //    54: return         
        //    55: aload           lines
        //    57: invokeinterface java/util/List.size:()I
        //    62: iconst_1       
        //    63: if_icmpne       86
        //    66: aload           textualLine
        //    68: aload           lines
        //    70: invokestatic    kotlin/collections/CollectionsKt.first:(Ljava/util/List;)Ljava/lang/Object;
        //    73: checkcast       Ljava/lang/String;
        //    76: aload_3         /* textPos */
        //    77: invokevirtual   gg/essential/gui/common/input/AbstractTextInput$LinePosition.getColumn:()I
        //    80: invokevirtual   gg/essential/gui/common/input/AbstractTextInput$TextualLine.addTextAt:(Ljava/lang/String;I)V
        //    83: goto            330
        //    86: aload           lines
        //    88: checkcast       Ljava/lang/Iterable;
        //    91: iconst_1       
        //    92: invokestatic    kotlin/collections/CollectionsKt.drop:(Ljava/lang/Iterable;I)Ljava/util/List;
        //    95: checkcast       Ljava/lang/Iterable;
        //    98: astore          $this$map$iv
        //   100: aload           $this$map$iv
        //   102: astore          9
        //   104: new             Ljava/util/ArrayList;
        //   107: dup            
        //   108: aload           $this$map$iv
        //   110: bipush          10
        //   112: invokestatic    kotlin/collections/CollectionsKt.collectionSizeOrDefault:(Ljava/lang/Iterable;I)I
        //   115: invokespecial   java/util/ArrayList.<init>:(I)V
        //   118: checkcast       Ljava/util/Collection;
        //   121: astore          destination$iv$iv
        //   123: aload           $this$mapTo$iv$iv
        //   125: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   130: astore          11
        //   132: aload           11
        //   134: invokeinterface java/util/Iterator.hasNext:()Z
        //   139: ifeq            184
        //   142: aload           11
        //   144: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   149: astore          item$iv$iv
        //   151: aload           destination$iv$iv
        //   153: aload           item$iv$iv
        //   155: checkcast       Ljava/lang/String;
        //   158: astore          13
        //   160: astore          14
        //   162: new             Lgg/essential/gui/common/input/AbstractTextInput$TextualLine;
        //   165: dup            
        //   166: aload_0         /* this */
        //   167: aload           it
        //   169: invokespecial   gg/essential/gui/common/input/AbstractTextInput$TextualLine.<init>:(Lgg/essential/gui/common/input/AbstractTextInput;Ljava/lang/String;)V
        //   172: aload           14
        //   174: swap           
        //   175: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //   180: pop            
        //   181: goto            132
        //   184: aload           destination$iv$iv
        //   186: checkcast       Ljava/util/List;
        //   189: astore          newTextualLines
        //   191: aload_3         /* textPos */
        //   192: invokevirtual   gg/essential/gui/common/input/AbstractTextInput$LinePosition.getColumn:()I
        //   195: aload           textualLine
        //   197: invokevirtual   gg/essential/gui/common/input/AbstractTextInput$TextualLine.getText:()Ljava/lang/String;
        //   200: invokevirtual   java/lang/String.length:()I
        //   203: if_icmpge       292
        //   206: aload           textualLine
        //   208: invokevirtual   gg/essential/gui/common/input/AbstractTextInput$TextualLine.getText:()Ljava/lang/String;
        //   211: aload_3         /* textPos */
        //   212: invokevirtual   gg/essential/gui/common/input/AbstractTextInput$LinePosition.getColumn:()I
        //   215: invokevirtual   java/lang/String.substring:(I)Ljava/lang/String;
        //   218: dup            
        //   219: ldc_w           "this as java.lang.String).substring(startIndex)"
        //   222: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   225: astore          textAfterInsertion
        //   227: aload           textualLine
        //   229: aload           textualLine
        //   231: invokevirtual   gg/essential/gui/common/input/AbstractTextInput$TextualLine.getText:()Ljava/lang/String;
        //   234: iconst_0       
        //   235: aload_3         /* textPos */
        //   236: invokevirtual   gg/essential/gui/common/input/AbstractTextInput$LinePosition.getColumn:()I
        //   239: invokevirtual   java/lang/String.substring:(II)Ljava/lang/String;
        //   242: dup            
        //   243: ldc_w           "this as java.lang.String\u2026ing(startIndex, endIndex)"
        //   246: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   249: aload           lines
        //   251: invokestatic    kotlin/collections/CollectionsKt.first:(Ljava/util/List;)Ljava/lang/Object;
        //   254: invokedynamic   BootstrapMethod #0, makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
        //   259: invokevirtual   gg/essential/gui/common/input/AbstractTextInput$TextualLine.setText:(Ljava/lang/String;)V
        //   262: aload           newTextualLines
        //   264: invokestatic    kotlin/collections/CollectionsKt.last:(Ljava/util/List;)Ljava/lang/Object;
        //   267: checkcast       Lgg/essential/gui/common/input/AbstractTextInput$TextualLine;
        //   270: astore          8
        //   272: aload           8
        //   274: aload           8
        //   276: invokevirtual   gg/essential/gui/common/input/AbstractTextInput$TextualLine.getText:()Ljava/lang/String;
        //   279: aload           textAfterInsertion
        //   281: invokedynamic   BootstrapMethod #0, makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //   286: invokevirtual   gg/essential/gui/common/input/AbstractTextInput$TextualLine.setText:(Ljava/lang/String;)V
        //   289: goto            309
        //   292: aload           textualLine
        //   294: aload           lines
        //   296: invokestatic    kotlin/collections/CollectionsKt.first:(Ljava/util/List;)Ljava/lang/Object;
        //   299: checkcast       Ljava/lang/String;
        //   302: aload_3         /* textPos */
        //   303: invokevirtual   gg/essential/gui/common/input/AbstractTextInput$LinePosition.getColumn:()I
        //   306: invokevirtual   gg/essential/gui/common/input/AbstractTextInput$TextualLine.addTextAt:(Ljava/lang/String;I)V
        //   309: aload_0         /* this */
        //   310: getfield        gg/essential/gui/common/input/AbstractTextInput.textualLines:Ljava/util/List;
        //   313: aload_3         /* textPos */
        //   314: invokevirtual   gg/essential/gui/common/input/AbstractTextInput$LinePosition.getLine:()I
        //   317: iconst_1       
        //   318: iadd           
        //   319: aload           newTextualLines
        //   321: checkcast       Ljava/util/Collection;
        //   324: invokeinterface java/util/List.addAll:(ILjava/util/Collection;)Z
        //   329: pop            
        //   330: aload_0         /* this */
        //   331: invokevirtual   gg/essential/gui/common/input/AbstractTextInput.recalculateAllVisualLines:()V
        //   334: aload_0         /* this */
        //   335: aload_3         /* textPos */
        //   336: aload_1         /* newText */
        //   337: invokevirtual   java/lang/String.length:()I
        //   340: invokevirtual   gg/essential/gui/common/input/AbstractTextInput$LinePosition.offsetColumn:(I)Lgg/essential/gui/common/input/AbstractTextInput$LinePosition;
        //   343: invokevirtual   gg/essential/gui/common/input/AbstractTextInput$LinePosition.toVisualPos:()Lgg/essential/gui/common/input/AbstractTextInput$LinePosition;
        //   346: invokespecial   gg/essential/gui/common/input/AbstractTextInput.setCursorPosition:(Lgg/essential/gui/common/input/AbstractTextInput$LinePosition;)V
        //   349: aload_0         /* this */
        //   350: getfield        gg/essential/gui/common/input/AbstractTextInput.updateAction:Lkotlin/jvm/functions/Function1;
        //   353: aload_0         /* this */
        //   354: invokevirtual   gg/essential/gui/common/input/AbstractTextInput.getText:()Ljava/lang/String;
        //   357: invokeinterface kotlin/jvm/functions/Function1.invoke:(Ljava/lang/Object;)Ljava/lang/Object;
        //   362: pop            
        //   363: aload_0         /* this */
        //   364: getfield        gg/essential/gui/common/input/AbstractTextInput.textState:Lgg/essential/elementa/state/BasicState;
        //   367: aload_0         /* this */
        //   368: invokevirtual   gg/essential/gui/common/input/AbstractTextInput.getText:()Ljava/lang/String;
        //   371: invokevirtual   gg/essential/elementa/state/BasicState.set:(Ljava/lang/Object;)V
        //   374: return         
        //    MethodParameters:
        //  Name      Flags  
        //  --------  -----
        //  newText   
        //  position  
        //    StackMapTable: 00 07 FF 00 37 00 06 07 00 02 07 03 27 00 07 00 F7 07 00 FB 07 02 62 00 00 1E FF 00 2D 00 0C 07 00 02 07 03 27 00 07 00 F7 07 00 FB 07 02 62 00 00 00 00 07 02 86 07 03 45 00 00 FA 00 33 FF 00 6B 00 07 07 00 02 07 03 27 00 07 00 F7 07 00 FB 07 02 62 07 02 62 00 00 FF 00 10 00 07 07 00 02 07 03 27 00 07 00 F7 00 00 07 02 62 00 00 F8 00 14
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    protected void recalculateAllVisualLines() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        gg/essential/gui/common/input/AbstractTextInput.visualLines:Ljava/util/List;
        //     4: invokeinterface java/util/List.clear:()V
        //     9: aload_0         /* this */
        //    10: getfield        gg/essential/gui/common/input/AbstractTextInput.textualLines:Ljava/util/List;
        //    13: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //    18: astore_1       
        //    19: iconst_0       
        //    20: istore_2       
        //    21: aload_1        
        //    22: invokeinterface java/util/Iterator.hasNext:()Z
        //    27: ifeq            217
        //    30: iload_2        
        //    31: istore_3        /* index */
        //    32: iload_2        
        //    33: iconst_1       
        //    34: iadd           
        //    35: istore_2       
        //    36: aload_1        
        //    37: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    42: checkcast       Lgg/essential/gui/common/input/AbstractTextInput$TextualLine;
        //    45: astore          textualLine
        //    47: aload_0         /* this */
        //    48: aload           textualLine
        //    50: invokevirtual   gg/essential/gui/common/input/AbstractTextInput$TextualLine.getText:()Ljava/lang/String;
        //    53: aload_0         /* this */
        //    54: invokevirtual   gg/essential/gui/common/input/AbstractTextInput.getWidth:()F
        //    57: invokevirtual   gg/essential/gui/common/input/AbstractTextInput.splitTextForWrapping:(Ljava/lang/String;F)Ljava/util/List;
        //    60: astore          splitLines
        //    62: aload           textualLine
        //    64: new             Lkotlin/ranges/IntRange;
        //    67: dup            
        //    68: aload_0         /* this */
        //    69: getfield        gg/essential/gui/common/input/AbstractTextInput.visualLines:Ljava/util/List;
        //    72: invokeinterface java/util/List.size:()I
        //    77: aload_0         /* this */
        //    78: getfield        gg/essential/gui/common/input/AbstractTextInput.visualLines:Ljava/util/List;
        //    81: invokeinterface java/util/List.size:()I
        //    86: aload           splitLines
        //    88: invokeinterface java/util/List.size:()I
        //    93: iadd           
        //    94: invokespecial   kotlin/ranges/IntRange.<init>:(II)V
        //    97: invokevirtual   gg/essential/gui/common/input/AbstractTextInput$TextualLine.setVisualIndices:(Lkotlin/ranges/IntRange;)V
        //   100: aload_0         /* this */
        //   101: getfield        gg/essential/gui/common/input/AbstractTextInput.visualLines:Ljava/util/List;
        //   104: aload           splitLines
        //   106: checkcast       Ljava/lang/Iterable;
        //   109: astore          6
        //   111: astore          12
        //   113: aload           $this$map$iv
        //   115: astore          7
        //   117: new             Ljava/util/ArrayList;
        //   120: dup            
        //   121: aload           $this$map$iv
        //   123: bipush          10
        //   125: invokestatic    kotlin/collections/CollectionsKt.collectionSizeOrDefault:(Ljava/lang/Iterable;I)I
        //   128: invokespecial   java/util/ArrayList.<init>:(I)V
        //   131: checkcast       Ljava/util/Collection;
        //   134: astore          destination$iv$iv
        //   136: aload           $this$mapTo$iv$iv
        //   138: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   143: astore          9
        //   145: aload           9
        //   147: invokeinterface java/util/Iterator.hasNext:()Z
        //   152: ifeq            197
        //   155: aload           9
        //   157: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   162: astore          item$iv$iv
        //   164: aload           destination$iv$iv
        //   166: aload           item$iv$iv
        //   168: checkcast       Ljava/lang/String;
        //   171: astore          11
        //   173: astore          13
        //   175: new             Lgg/essential/gui/common/input/AbstractTextInput$VisualLine;
        //   178: dup            
        //   179: aload           it
        //   181: iload_3         /* index */
        //   182: invokespecial   gg/essential/gui/common/input/AbstractTextInput$VisualLine.<init>:(Ljava/lang/String;I)V
        //   185: aload           13
        //   187: swap           
        //   188: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //   193: pop            
        //   194: goto            145
        //   197: aload           destination$iv$iv
        //   199: checkcast       Ljava/util/List;
        //   202: aload           12
        //   204: swap           
        //   205: checkcast       Ljava/util/Collection;
        //   208: invokeinterface java/util/List.addAll:(Ljava/util/Collection;)Z
        //   213: pop            
        //   214: goto            21
        //   217: return         
        //    StackMapTable: 00 04 FD 00 15 07 03 45 01 FF 00 7B 00 0D 07 00 02 07 03 45 01 01 00 00 00 00 07 02 86 07 03 45 00 00 07 02 62 00 00 FF 00 33 00 0D 07 00 02 07 03 45 01 00 00 00 00 00 07 02 86 00 00 00 07 02 62 00 00 FF 00 13 00 00 00 00
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @NotNull
    protected List<String> splitTextForWrapping(@NotNull final String text, final float maxLineWidth) {
        Intrinsics.checkNotNullParameter((Object)text, "text");
        return TextKt.getStringSplitToWidth$default(text, maxLineWidth, this.getTextScale(), false, false, null, 40, null);
    }
    
    protected final void commitTextRemoval(@NotNull final LinePosition startPos, @NotNull final LinePosition endPos, final boolean selectAfterUndo) {
        Intrinsics.checkNotNullParameter((Object)startPos, "startPos");
        Intrinsics.checkNotNullParameter((Object)endPos, "endPos");
        final AbstractTextInput.RemoveTextOperation removeTextOperation = new AbstractTextInput.RemoveTextOperation(this, startPos, endPos, selectAfterUndo);
        this.commitTextOperation((AbstractTextInput.TextOperation)removeTextOperation);
    }
    
    private final void removeText(final LinePosition startPos, final LinePosition endPos) {
        final LinePosition textualStartPos = startPos.toTextualPos();
        final LinePosition textualEndPos = endPos.toTextualPos();
        final TextualLine startTextualLine = this.textualLines.get(textualStartPos.getLine());
        final TextualLine endTextualLine = this.textualLines.get(textualEndPos.getLine());
        final TextualLine textualLine = startTextualLine;
        final String substring = ((Line)startTextualLine).getText().substring(0, textualStartPos.getColumn());
        Intrinsics.checkNotNullExpressionValue((Object)substring, "this as java.lang.String\u2026ing(startIndex, endIndex)");
        final String substring2 = ((Line)endTextualLine).getText().substring(textualEndPos.getColumn());
        Intrinsics.checkNotNullExpressionValue((Object)substring2, "this as java.lang.String).substring(startIndex)");
        ((Line)textualLine).setText(substring + substring2);
        final int firstItemToDelete = textualStartPos.getLine() + 1;
        for (int n = textualEndPos.getLine() - firstItemToDelete + 1, i = 0; i < n; ++i) {
            this.textualLines.remove(firstItemToDelete);
        }
        this.recalculateAllVisualLines();
        final float heightDifference = this.getHeight() - this.visualLines.size() * this.lineHeight;
        if (this.verticalScrollingOffset < heightDifference) {
            this.targetVerticalScrollingOffset = RangesKt.coerceAtMost(heightDifference, 0.0f);
        }
        this.updateAction.invoke((Object)this.getText());
        this.textState.set(this.getText());
    }
    
    private final void setCursorPosition(final LinePosition newPosition) {
        final LinePosition $this$setCursorPosition_u24lambda_u2d9 = newPosition.toVisualPos();
        this.setCursor($this$setCursorPosition_u24lambda_u2d9);
        this.setOtherSelectionEnd($this$setCursorPosition_u24lambda_u2d9);
        this.cursorNeedsRefocus = true;
    }
    
    @NotNull
    protected String getTextBetween(@NotNull final LinePosition startPos, @NotNull final LinePosition endPos) {
        Intrinsics.checkNotNullParameter((Object)startPos, "startPos");
        Intrinsics.checkNotNullParameter((Object)endPos, "endPos");
        final LinePosition textStart = startPos.toTextualPos();
        final LinePosition textEnd = endPos.toTextualPos();
        String s;
        if (textStart.getLine() == textEnd.getLine()) {
            Intrinsics.checkNotNullExpressionValue((Object)(s = ((Line)this.textualLines.get(textStart.getLine())).getText().substring(textStart.getColumn(), textEnd.getColumn())), "this as java.lang.String\u2026ing(startIndex, endIndex)");
        }
        else {
            final List list;
            final List lines = list = new ArrayList();
            final String substring = ((Line)this.textualLines.get(textStart.getLine())).getText().substring(textStart.getColumn());
            Intrinsics.checkNotNullExpressionValue((Object)substring, "this as java.lang.String).substring(startIndex)");
            list.add(substring);
            for (int i = textStart.getLine() + 1; i < textEnd.getLine(); ++i) {
                lines.add(((Line)this.textualLines.get(i)).getText());
            }
            final List list2 = lines;
            final String substring2 = ((Line)this.textualLines.get(textEnd.getLine())).getText().substring(0, textEnd.getColumn());
            Intrinsics.checkNotNullExpressionValue((Object)substring2, "this as java.lang.String\u2026ing(startIndex, endIndex)");
            list2.add(substring2);
            s = CollectionsKt.joinToString$default((Iterable)lines, (CharSequence)"\n", (CharSequence)null, (CharSequence)null, 0, (CharSequence)null, (Function1)null, 62, (Object)null);
        }
        return s;
    }
    
    protected void selectAll() {
        this.setCursor(new LinePosition(0, 0, true));
        this.setOtherSelectionEnd(new LinePosition(this.visualLines.size() - 1, ((Line)CollectionsKt.last((List)this.visualLines)).getLength(), true));
    }
    
    protected boolean hasSelection() {
        return !Intrinsics.areEqual((Object)this.cursor, (Object)this.otherSelectionEnd);
    }
    
    @NotNull
    protected LinePosition selectionStart() {
        return (LinePosition)ComparisonsKt.minOf((Comparable)this.cursor, (Comparable)this.otherSelectionEnd);
    }
    
    @NotNull
    protected LinePosition selectionEnd() {
        return (LinePosition)ComparisonsKt.maxOf((Comparable)this.cursor, (Comparable)this.otherSelectionEnd);
    }
    
    @NotNull
    protected Pair<LinePosition, LinePosition> getSelection() {
        return (Pair<LinePosition, LinePosition>)TuplesKt.to((Object)this.selectionStart(), (Object)this.selectionEnd());
    }
    
    protected void deleteSelection() {
        if (!this.hasSelection()) {
            return;
        }
        this.commitTextRemoval(this.selectionStart(), this.selectionEnd(), true);
    }
    
    protected void copySelection() {
        final Pair<LinePosition, LinePosition> selection = this.getSelection();
        final LinePosition visualSelectionStart = (LinePosition)selection.component1();
        final LinePosition visualSelectionEnd = (LinePosition)selection.component2();
        if (Intrinsics.areEqual((Object)visualSelectionStart, (Object)visualSelectionEnd)) {
            return;
        }
        UDesktop.setClipboardString(this.getTextBetween(visualSelectionStart, visualSelectionEnd));
    }
    
    @Nullable
    protected Character charBefore(@NotNull final LinePosition pos) {
        Intrinsics.checkNotNullParameter((Object)pos, "pos");
        final LinePosition it = pos.toTextualPos();
        return it.isAtAbsoluteStart() ? null : (it.isAtLineStart() ? Character.valueOf('\n') : Character.valueOf(((Line)this.textualLines.get(it.getLine())).getText().charAt(it.getColumn() - 1)));
    }
    
    @Nullable
    protected Character charAfter(@NotNull final LinePosition pos) {
        Intrinsics.checkNotNullParameter((Object)pos, "pos");
        final LinePosition it = pos.toTextualPos();
        return it.isAtAbsoluteEnd() ? null : (it.isAtLineEnd() ? Character.valueOf('\n') : Character.valueOf(((Line)this.textualLines.get(it.getLine())).getText().charAt(it.getColumn())));
    }
    
    protected boolean isBreakingCharacter(final char ch) {
        return !Character.isLetterOrDigit(ch) && ch != '_';
    }
    
    @NotNull
    protected LinePosition getNearestWordBoundary(@NotNull final LinePosition pos, @NotNull final AbstractTextInput.Direction direction) {
        Intrinsics.checkNotNullParameter((Object)pos, "pos");
        Intrinsics.checkNotNullParameter((Object)direction, "direction");
        final KProperty0 atEndOfDirection = (KProperty0)((direction == AbstractTextInput.Direction.Left) ? new AbstractTextInput$getNearestWordBoundary$atEndOfDirection.AbstractTextInput$getNearestWordBoundary$atEndOfDirection$1((Object)pos) : ((KProperty0)new AbstractTextInput$getNearestWordBoundary$atEndOfDirection.AbstractTextInput$getNearestWordBoundary$atEndOfDirection$2((Object)pos)));
        if (atEndOfDirection.invoke()) {
            return pos;
        }
        LinePosition textualPos = pos.toTextualPos();
        final int columnOffset = (direction == AbstractTextInput.Direction.Left) ? -1 : 1;
        final KFunction nextChar = (KFunction)((direction == AbstractTextInput.Direction.Left) ? new AbstractTextInput$getNearestWordBoundary$nextChar.AbstractTextInput$getNearestWordBoundary$nextChar$1((Object)this) : ((KFunction)new AbstractTextInput$getNearestWordBoundary$nextChar.AbstractTextInput$getNearestWordBoundary$nextChar$2((Object)this)));
        if (direction == AbstractTextInput.Direction.Left && textualPos.isAtLineStart()) {
            final TextualLine previousLine = this.textualLines.get(textualPos.getLine() - 1);
            return new LinePosition(textualPos.getLine() - 1, ((Line)previousLine).getLength(), false);
        }
        if (direction == AbstractTextInput.Direction.Right && textualPos.isAtLineEnd()) {
            return new LinePosition(textualPos.getLine() + 1, 0, false);
        }
        Character ch = (Character)((Function1)nextChar).invoke((Object)textualPos);
        while (!(boolean)atEndOfDirection.invoke()) {
            final Character c = ch;
            boolean b;
            if (c != null) {
                final char p0 = c;
                b = this.isBreakingCharacter(p0);
            }
            else {
                b = false;
            }
            if (!b) {
                break;
            }
            textualPos = textualPos.offsetColumn(columnOffset);
            final Character c2;
            ch = (c2 = (Character)((Function1)nextChar).invoke((Object)textualPos));
            if (c2 == null) {
                continue;
            }
            if (c2 == '\n') {
                return textualPos;
            }
        }
        while (!(boolean)atEndOfDirection.invoke()) {
            final Character c3 = ch;
            boolean b2;
            if (c3 != null) {
                final char p0 = c3;
                b2 = !this.isBreakingCharacter(p0);
            }
            else {
                b2 = false;
            }
            if (!b2) {
                break;
            }
            textualPos = textualPos.offsetColumn(columnOffset);
            final Character c4;
            ch = (c4 = (Character)((Function1)nextChar).invoke((Object)textualPos));
            if (c4 == null) {
                continue;
            }
            if (c4 == '\n') {
                return textualPos;
            }
        }
        final LinePosition visualPos = textualPos.toVisualPos();
        if (direction == AbstractTextInput.Direction.Left && visualPos.isAtLineEnd() && !visualPos.isInLastLine()) {
            textualPos = new LinePosition(visualPos.getLine() + 1, 0, true);
        }
        else if (direction == AbstractTextInput.Direction.Right && visualPos.isAtLineStart() && !visualPos.isInFirstLine()) {
            textualPos = new LinePosition(visualPos.getLine() - 1, ((Line)this.visualLines.get(visualPos.getLine() - 1)).getText().length(), true);
        }
        return textualPos;
    }
    
    protected void animateCursor() {
        if (!this.active) {
            return;
        }
        final UIComponent $this$animate_u24lambda_u2d0$iv;
        final UIComponent $this$animate$iv = $this$animate_u24lambda_u2d0$iv = this.cursorComponent;
        final AnimatingConstraints $this$animateCursor_u24lambda_u2d13;
        final AnimatingConstraints anim$iv = $this$animateCursor_u24lambda_u2d13 = $this$animate_u24lambda_u2d0$iv.makeAnimation();
        AnimatingConstraints.setColorAnimation$default($this$animateCursor_u24lambda_u2d13, Animations.OUT_CIRCULAR, 0.5f, UtilitiesKt.toConstraint(this.cursorColor), 0.0f, 8, null);
        $this$animateCursor_u24lambda_u2d13.onComplete((Function0<Unit>)new AbstractTextInput$animateCursor$1.AbstractTextInput$animateCursor$1$1(this));
        $this$animate_u24lambda_u2d0$iv.animateTo(anim$iv);
    }
    
    protected boolean hasText() {
        return this.textualLines.size() > 1 || ((Line)this.textualLines.get(0)).getText().length() > 0;
    }
    
    protected void drawPlaceholder(@NotNull final UMatrixStack matrixStack) {
        Intrinsics.checkNotNullParameter((Object)matrixStack, "matrixStack");
        drawUnselectedText$default(this, matrixStack, this.placeholder, this.getLeft(), 0, this.placeholderColor.get(), this.placeholderShadow.get(), null, 64, null);
    }
    
    protected void drawUnselectedText(@NotNull final UMatrixStack matrixStack, @NotNull final String text, final float left, final int row, @Nullable final Color color, final boolean shadow, @Nullable final Color shadowColor) {
        Intrinsics.checkNotNullParameter((Object)matrixStack, "matrixStack");
        Intrinsics.checkNotNullParameter((Object)text, "text");
        final FontProvider fontProvider = this.getFontProvider();
        Color color2 = color;
        if (color == null) {
            color2 = this.getColor();
        }
        fontProvider.drawString(matrixStack, text, color2, left - this.horizontalScrollingOffset, this.getTop() + (this.lineHeight * row + 1.0f) * this.getTextScale() + this.verticalScrollingOffset, 10.0f, this.getTextScale(), shadow, shadowColor);
    }
    
    public static /* synthetic */ void drawUnselectedText$default(final AbstractTextInput abstractTextInput, final UMatrixStack matrixStack, final String text, final float left, final int row, Color color, boolean contentShadow, Color contentShadowColor, final int n, final Object o) {
        if (o != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawUnselectedText");
        }
        if ((n & 0x10) != 0x0) {
            color = null;
        }
        if ((n & 0x20) != 0x0) {
            contentShadow = abstractTextInput.contentShadow;
        }
        if ((n & 0x40) != 0x0) {
            contentShadowColor = abstractTextInput.contentShadowColor;
        }
        abstractTextInput.drawUnselectedText(matrixStack, text, left, row, color, contentShadow, contentShadowColor);
    }
    
    protected void drawSelectedText(@NotNull final UMatrixStack matrixStack, @NotNull final String text, final float left, final float right, final int row) {
        Intrinsics.checkNotNullParameter((Object)matrixStack, "matrixStack");
        Intrinsics.checkNotNullParameter((Object)text, "text");
        UIBlock.Companion.drawBlock(matrixStack, this.active ? this.selectionBackgroundColor : this.inactiveSelectionBackgroundColor, left - (double)this.horizontalScrollingOffset, this.getTop() + (double)(this.lineHeight * row * this.getTextScale()) + this.verticalScrollingOffset, right - (double)this.horizontalScrollingOffset, this.getTop() + (double)(this.lineHeight * ((row + 1) * this.getTextScale())) + this.verticalScrollingOffset);
        if (text.length() > 0) {
            FontProvider.drawString$default(this.getFontProvider(), matrixStack, text, this.active ? this.selectionForegroundColor : this.inactiveSelectionForegroundColor, left - this.horizontalScrollingOffset, this.getTop() + (this.lineHeight * row + 1.0f) * this.getTextScale() + this.verticalScrollingOffset, 10.0f, this.getTextScale(), this.contentShadow, null, 256, null);
        }
    }
    
    @Override
    public void animationFrame() {
        super.animationFrame();
        final float diff = (this.targetVerticalScrollingOffset - this.verticalScrollingOffset) * 0.1f;
        if (Math.abs(diff) < 0.25f) {
            this.verticalScrollingOffset = this.targetVerticalScrollingOffset;
        }
        this.verticalScrollingOffset += diff;
        this.recalculateDimensions();
        if (this.cursorNeedsRefocus) {
            this.scrollIntoView(this.cursor);
            this.cursorNeedsRefocus = false;
        }
    }
    
    public static final /* synthetic */ void access$setContextMenuOpen$p$5b3915c2(final AbstractTextInput $this) {
        $this.contextMenuOpen = false;
    }
    
    public static final /* synthetic */ void access$removeText(final AbstractTextInput $this, final LinePosition startPos, final LinePosition endPos) {
        $this.removeText(startPos, endPos);
    }
    
    public static final /* synthetic */ void access$setCursorPosition(final AbstractTextInput $this, final LinePosition newPosition) {
        $this.setCursorPosition(newPosition);
    }
    
    public static final /* synthetic */ void access$showOptionMenu(final AbstractTextInput $this, final float posX, final float posY) {
        $this.showOptionMenu(posX, posY);
    }
    
    public static final /* synthetic */ boolean access$getContextMenuOpen$p(final AbstractTextInput $this) {
        return $this.contextMenuOpen;
    }
    
    static {
        new Companion((byte)0);
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                       \u0000\f
                                                       \u0002\u0018\u0002
                                                       \u0002\u0010\u0010
                                                       \u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007""" }, d2 = { "Lgg/essential/gui/common/input/AbstractTextInput$SelectionMode;", "", "(Ljava/lang/String;I)V", "None", "Character", "Word", "Line", "essential" })
    public enum SelectionMode
    {
        None("None", 0), 
        Character("Character", 1), 
        Word("Word", 2), 
        Line("Line", 3);
        
        private static final /* synthetic */ SelectionMode[] $VALUES;
        
        private SelectionMode(final String $enum$name, final int $enum$ordinal) {
        }
        
        public static SelectionMode[] values() {
            return SelectionMode.$VALUES.clone();
        }
        
        public static SelectionMode valueOf(final String value) {
            return Enum.valueOf(SelectionMode.class, value);
        }
        
        private static final /* synthetic */ SelectionMode[] $values() {
            return new SelectionMode[] { SelectionMode.None, SelectionMode.Character, SelectionMode.Word, SelectionMode.Line };
        }
        
        static {
            $VALUES = $values();
        }
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                       \u0000D
                                                       \u0002\u0018\u0002
                                                       \u0002\u0010\u000f
                                                       \u0002\u0018\u0002
                                                       \u0000
                                                       \u0002\u0010\b
                                                       \u0002\b\u0002
                                                       \u0002\u0010\u000b
                                                       \u0002\b\f
                                                       \u0002\u0010 
                                                       \u0002\u0018\u0002
                                                       \u0002\b\u0006
                                                       \u0002\u0010\u0000
                                                       \u0002\b\b
                                                       \u0002\u0018\u0002
                                                       \u0002\u0010\u0007
                                                       \u0000
                                                       \u0002\u0010\u000e
                                                       \u0002\b\u0005\b\u0084\u0004\u0018\u00002\f\u0012\b\u0012\u00060\u0000R\u00020\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0015\u0010\u0016\u001a\u00020\u00042
                                                       \u0010\u0017\u001a\u00060\u0000R\u00020\u0002H\u0096\u0002J\u0018\u0010\u0018\u001a\u00060\u0000R\u00020\u00022
                                                       \u0010\u0019\u001a\u00060\u0000R\u00020\u0002H\u0002J\u0018\u0010\u001a\u001a\u00060\u0000R\u00020\u00022
                                                       \u0010\u0019\u001a\u00060\u0000R\u00020\u0002H\u0002J\u0013\u0010\u001b\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u001cH\u0096\u0002J\b\u0010\u001d\u001a\u00020\u0004H\u0016J\u0012\u0010\u001e\u001a\u00060\u0000R\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u0004J!\u0010 \u001a\u00060\u0000R\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u00042
                                                       \u0010\u0019\u001a\u00060\u0000R\u00020\u0002H\u0082\u0010J!\u0010!\u001a\u00060\u0000R\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u00042
                                                       \u0010\u0019\u001a\u00060\u0000R\u00020\u0002H\u0082\u0010J\u0018\u0010"\u001a\u00060\u0000R\u00020\u00022
                                                       \u0010\u0019\u001a\u00060\u0000R\u00020\u0002H\u0002J\u0018\u0010#\u001a\u00060\u0000R\u00020\u00022
                                                       \u0010\u0019\u001a\u00060\u0000R\u00020\u0002H\u0002J\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020&0%J\b\u0010'\u001a\u00020(H\u0016J
                                                       \u0010)\u001a\u00060\u0000R\u00020\u0002J
                                                       \u0010*\u001a\u00060\u0000R\u00020\u0002J\u0012\u0010+\u001a\u00060\u0000R\u00020\u00022\u0006\u0010,\u001a\u00020\u0004R\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b
                                                       \u0000\u001a\u0004\b	\u0010
                                                       R\u0011\u0010\u000b\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\r\u0010\fR\u0011\u0010\u000e\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u000f\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0010\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\u0011\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b
                                                       \u0000\u001a\u0004\b\u0006\u0010\fR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b
                                                       \u0000\u001a\u0004\b\u0012\u0010
                                                       R\u0018\u0010\u0013\u001a\f\u0012\b\u0012\u00060\u0015R\u00020\u00020\u0014X\u0082\u0004¢\u0006\u0002
                                                       \u0000¨\u0006-""" }, d2 = { "Lgg/essential/gui/common/input/AbstractTextInput$LinePosition;", "", "Lgg/essential/gui/common/input/AbstractTextInput;", "line", "", "column", "isVisual", "", "(Lgg/essential/gui/common/input/AbstractTextInput;IIZ)V", "getColumn", "()I", "isAtAbsoluteEnd", "()Z", "isAtAbsoluteStart", "isAtLineEnd", "isAtLineStart", "isInFirstLine", "isInLastLine", "getLine", "lines", "", "Lgg/essential/gui/common/input/AbstractTextInput$Line;", "compareTo", "other", "complexOffsetColumnNegative", "pos", "complexOffsetColumnPositive", "equals", "", "hashCode", "offsetColumn", "amount", "offsetColumnNegative", "offsetColumnPositive", "simpleOffsetColumnNegative", "simpleOffsetColumnPositive", "toScreenPos", "Lkotlin/Pair;", "", "toString", "", "toTextualPos", "toVisualPos", "withColumn", "newColumn", "essential" })
    protected final class LinePosition implements Comparable<LinePosition>
    {
        private final int line;
        private final int column;
        private final boolean isVisual;
        @NotNull
        private final List<Line> lines;
        final /* synthetic */ AbstractTextInput this$0;
        
        public LinePosition(final AbstractTextInput this$0, final int line, final int column, final boolean isVisual) {
            this.this$0 = this$0;
            super();
            this.line = line;
            this.column = column;
            this.isVisual = isVisual;
            this.lines = (List<Line>)(this.isVisual ? this.this$0.getVisualLines() : this.this$0.getTextualLines());
        }
        
        public final int getLine() {
            return this.line;
        }
        
        public final int getColumn() {
            return this.column;
        }
        
        public final boolean isAtLineStart() {
            return this.column == 0;
        }
        
        public final boolean isAtLineEnd() {
            return this.column == this.lines.get(this.line).getLength();
        }
        
        public final boolean isInFirstLine() {
            return this.line == 0;
        }
        
        public final boolean isInLastLine() {
            return this.line == CollectionsKt.getLastIndex((List)this.lines);
        }
        
        public final boolean isAtAbsoluteStart() {
            return this.isInFirstLine() && this.isAtLineStart();
        }
        
        public final boolean isAtAbsoluteEnd() {
            return this.isInLastLine() && this.isAtLineEnd();
        }
        
        @NotNull
        public final LinePosition offsetColumn(final int amount) {
            return (amount > 0) ? this.offsetColumnPositive(amount, this) : ((amount < 0) ? this.offsetColumnNegative(-amount, this) : this);
        }
        
        private final LinePosition offsetColumnNegative(final int amount, final LinePosition pos) {
            LinePosition linePosition = this;
            int n = amount;
            LinePosition linePosition2 = pos;
            LinePosition pos2;
            while (true) {
                final LinePosition linePosition3 = linePosition;
                final int n2 = n;
                pos2 = linePosition2;
                if (n2 == 0 || pos2.isAtAbsoluteStart()) {
                    break;
                }
                final int n3 = n2 - 1;
                final LinePosition complexOffsetColumnNegative = linePosition3.complexOffsetColumnNegative(pos2);
                linePosition = linePosition3;
                n = n3;
                linePosition2 = complexOffsetColumnNegative;
            }
            return pos2;
        }
        
        private final LinePosition complexOffsetColumnNegative(final LinePosition pos) {
            if (!pos.isVisual) {
                return this.simpleOffsetColumnNegative(pos);
            }
            if (!pos.isAtLineStart()) {
                return this.simpleOffsetColumnNegative(pos);
            }
            final VisualLine currentLine = this.this$0.getVisualLines().get(pos.line);
            final VisualLine previousLine = this.this$0.getVisualLines().get(pos.line - 1);
            if (currentLine.getTextIndex() != previousLine.getTextIndex()) {
                return this.simpleOffsetColumnNegative(pos);
            }
            if (StringsKt.last((CharSequence)((Line)previousLine).getText()) != ' ') {
                return this.simpleOffsetColumnNegative(pos);
            }
            return this.this$0.new LinePosition(pos.line - 1, ((Line)previousLine).getLength() - 1, true);
        }
        
        private final LinePosition simpleOffsetColumnNegative(final LinePosition pos) {
            return (pos.column == 0) ? this.this$0.new LinePosition(pos.line - 1, pos.lines.get(pos.line - 1).getLength(), pos.isVisual) : pos.withColumn(pos.column - 1);
        }
        
        private final LinePosition offsetColumnPositive(final int amount, final LinePosition pos) {
            LinePosition linePosition = this;
            int n = amount;
            LinePosition linePosition2 = pos;
            LinePosition pos2;
            while (true) {
                final LinePosition linePosition3 = linePosition;
                final int n2 = n;
                pos2 = linePosition2;
                if (n2 == 0 || pos2.isAtAbsoluteEnd()) {
                    break;
                }
                final int n3 = n2 - 1;
                final LinePosition complexOffsetColumnPositive = linePosition3.complexOffsetColumnPositive(pos2);
                linePosition = linePosition3;
                n = n3;
                linePosition2 = complexOffsetColumnPositive;
            }
            return pos2;
        }
        
        private final LinePosition complexOffsetColumnPositive(final LinePosition pos) {
            if (!pos.isVisual) {
                return this.simpleOffsetColumnPositive(pos);
            }
            final VisualLine currentLine = this.this$0.getVisualLines().get(pos.line);
            if (pos.column < ((Line)currentLine).getLength() - 1) {
                return this.simpleOffsetColumnPositive(pos);
            }
            if (pos.line == CollectionsKt.getLastIndex((List)this.this$0.getVisualLines())) {
                return this.this$0.new LinePosition(pos.line, ((Line)currentLine).getLength(), true);
            }
            if (pos.column == ((Line)currentLine).getLength() - 1 && StringsKt.last((CharSequence)((Line)currentLine).getText()) != ' ') {
                return this.simpleOffsetColumnPositive(pos);
            }
            final VisualLine nextLine = this.this$0.getVisualLines().get(pos.line + 1);
            if (currentLine.getTextIndex() == nextLine.getTextIndex()) {
                return this.this$0.new LinePosition(pos.line + 1, 0, true);
            }
            return this.simpleOffsetColumnPositive(pos);
        }
        
        private final LinePosition simpleOffsetColumnPositive(final LinePosition pos) {
            return (pos.column >= pos.lines.get(pos.line).getLength()) ? ((pos.line == CollectionsKt.getLastIndex((List)pos.lines)) ? this.this$0.new LinePosition(CollectionsKt.getLastIndex((List)pos.lines), ((Line)CollectionsKt.last((List)pos.lines)).getLength(), pos.isVisual) : this.this$0.new LinePosition(pos.line + 1, 0, pos.isVisual)) : pos.withColumn(pos.column + 1);
        }
        
        @NotNull
        public final LinePosition withColumn(final int newColumn) {
            return this.this$0.new LinePosition(this.line, newColumn, this.isVisual);
        }
        
        @NotNull
        public final LinePosition toTextualPos() {
            if (!this.isVisual) {
                return this;
            }
            final VisualLine visualLine = this.this$0.getVisualLines().get(this.line);
            final TextualLine textualLine = this.this$0.getTextualLines().get(visualLine.getTextIndex());
            int totalVisualLength = 0;
            for (int i = textualLine.getVisualIndices().getFirst(); i < this.line; ++i) {
                totalVisualLength += ((Line)this.this$0.getVisualLines().get(i)).getLength();
            }
            return this.this$0.new LinePosition(visualLine.getTextIndex(), totalVisualLength + this.column, false);
        }
        
        @NotNull
        public final LinePosition toVisualPos() {
            if (this.isVisual) {
                return this;
            }
            final TextualLine textualLine = this.this$0.getTextualLines().get(this.line);
            int lengthRemaining = this.column;
            final IntRange visualIndices = textualLine.getVisualIndices();
            int visualLineIndex = visualIndices.getFirst();
            final int last = visualIndices.getLast();
            if (visualLineIndex <= last) {
                while (true) {
                    final VisualLine visualLine = this.this$0.getVisualLines().get(visualLineIndex);
                    if (((Line)visualLine).getLength() >= lengthRemaining) {
                        return this.this$0.new LinePosition(visualLineIndex, lengthRemaining, true);
                    }
                    lengthRemaining -= ((Line)visualLine).getLength();
                    if (visualLineIndex == last) {
                        break;
                    }
                    ++visualLineIndex;
                }
            }
            System.out.println((Object)"toTextualPos: Unexpected end of function");
            return this.this$0.new LinePosition(0, 0, true);
        }
        
        @NotNull
        public final Pair<Float, Float> toScreenPos() {
            final LinePosition visualPos = this.toVisualPos();
            final String substring = ((Line)this.this$0.getVisualLines().get(visualPos.line)).getText().substring(0, visualPos.column);
            Intrinsics.checkNotNullExpressionValue((Object)substring, "this as java.lang.String\u2026ing(startIndex, endIndex)");
            final float x = UtilitiesKt.width$default(substring, this.this$0.getTextScale(), null, 2, null) - this.this$0.getHorizontalScrollingOffset();
            final float y = this.this$0.getLineHeight() * visualPos.line * this.this$0.getTextScale() + this.this$0.getVerticalScrollingOffset();
            return (Pair<Float, Float>)TuplesKt.to((Object)x, (Object)y);
        }
        
        @Override
        public int compareTo(@NotNull final LinePosition other) {
            Intrinsics.checkNotNullParameter((Object)other, "other");
            final LinePosition thisVisual = this.toVisualPos();
            final LinePosition otherVisual = other.toVisualPos();
            return (thisVisual.line < otherVisual.line) ? -1 : ((thisVisual.line > otherVisual.line) ? 1 : ((thisVisual.column < otherVisual.column) ? -1 : ((thisVisual.column > otherVisual.column) ? 1 : 0)));
        }
        
        @Override
        public boolean equals(@Nullable final Object other) {
            return other instanceof LinePosition && this.line == ((LinePosition)other).line && this.column == ((LinePosition)other).column && this.isVisual == ((LinePosition)other).isVisual;
        }
        
        @Override
        public int hashCode() {
            int result = this.line;
            result = 31 * result + this.column;
            result = 31 * result + Boolean.hashCode(this.isVisual);
            return result;
        }
        
        @NotNull
        @Override
        public String toString() {
            return "LinePosition(line=" + this.line + ", column=" + this.column + ", isVisual=" + this.isVisual;
        }
        
        @Override
        public /* bridge */ int compareTo(final Object other) {
            return this.compareTo((LinePosition)other);
        }
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                       \u0000\u001a
                                                       \u0002\u0018\u0002
                                                       \u0002\u0010\u0000
                                                       \u0000
                                                       \u0002\u0010\u000e
                                                       \u0002\b\u0002
                                                       \u0002\u0010\b
                                                       \u0002\b\u0007\b\u0094\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e
                                                       \u0000\u001a\u0004\b	\u0010
                                                       "\u0004\b\u000b\u0010\f¨\u0006""" }, d2 = { "Lgg/essential/gui/common/input/AbstractTextInput$Line;", "", "text", "", "(Lgg/essential/gui/common/input/AbstractTextInput;Ljava/lang/String;)V", "length", "", "getLength", "()I", "getText", "()Ljava/lang/String;", "setText", "(Ljava/lang/String;)V", "essential" })
    protected class Line
    {
        @NotNull
        private String text;
        
        public Line(@NotNull final String text) {
            Intrinsics.checkNotNullParameter((Object)text, "text");
            super();
            this.text = text;
        }
        
        @NotNull
        public final String getText() {
            return this.text;
        }
        
        public final void setText(@NotNull final String <set-?>) {
            Intrinsics.checkNotNullParameter((Object)<set-?>, "<set-?>");
            this.text = <set-?>;
        }
        
        public final int getLength() {
            return this.text.length();
        }
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                       \u0000,
                                                       \u0002\u0018\u0002
                                                       \u0002\u0018\u0002
                                                       \u0002\u0018\u0002
                                                       \u0000
                                                       \u0002\u0010\u000e
                                                       \u0000
                                                       \u0002\u0018\u0002
                                                       \u0002\b\u0006
                                                       \u0002\u0010\u0002
                                                       \u0002\b\u0002
                                                       \u0002\u0010\b
                                                       \u0002\b\u0002\b\u0084\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0010J\b\u0010\u0011\u001a\u00020\u0004H\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e
                                                       \u0000\u001a\u0004\b\b\u0010	"\u0004\b
                                                       \u0010\u000b¨\u0006\u0012""" }, d2 = { "Lgg/essential/gui/common/input/AbstractTextInput$TextualLine;", "Lgg/essential/gui/common/input/AbstractTextInput$Line;", "Lgg/essential/gui/common/input/AbstractTextInput;", "text", "", "visualIndices", "Lkotlin/ranges/IntRange;", "(Lgg/essential/gui/common/input/AbstractTextInput;Ljava/lang/String;Lkotlin/ranges/IntRange;)V", "getVisualIndices", "()Lkotlin/ranges/IntRange;", "setVisualIndices", "(Lkotlin/ranges/IntRange;)V", "addTextAt", "", "newText", "column", "", "toString", "essential" })
    protected final class TextualLine extends Line
    {
        @NotNull
        private IntRange visualIndices;
        
        public TextualLine(@NotNull final String text, @NotNull final IntRange visualIndices) {
            Intrinsics.checkNotNullParameter((Object)text, "text");
            Intrinsics.checkNotNullParameter((Object)visualIndices, "visualIndices");
            super(text);
            this.visualIndices = visualIndices;
        }
        
        public TextualLine(final AbstractTextInput abstractTextInput, final String text) {
            this(text, new IntRange(0, 0));
        }
        
        @NotNull
        public final IntRange getVisualIndices() {
            return this.visualIndices;
        }
        
        public final void setVisualIndices(@NotNull final IntRange <set-?>) {
            Intrinsics.checkNotNullParameter((Object)<set-?>, "<set-?>");
            this.visualIndices = <set-?>;
        }
        
        public final void addTextAt(@NotNull final String newText, final int column) {
            Intrinsics.checkNotNullParameter((Object)newText, "newText");
            if (column >= ((Line)this).getText().length()) {
                ((Line)this).setText(((Line)this).getText() + newText);
            }
            else {
                final String substring = ((Line)this).getText().substring(0, column);
                Intrinsics.checkNotNullExpressionValue((Object)substring, "this as java.lang.String\u2026ing(startIndex, endIndex)");
                final String substring2 = ((Line)this).getText().substring(column);
                Intrinsics.checkNotNullExpressionValue((Object)substring2, "this as java.lang.String).substring(startIndex)");
                ((Line)this).setText(substring + newText + substring2);
            }
        }
        
        @NotNull
        @Override
        public String toString() {
            return "TextualLine(text=" + ((Line)this).getText() + ", visualIndices=" + this.visualIndices;
        }
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                       \u0000\u001c
                                                       \u0002\u0018\u0002
                                                       \u0002\u0018\u0002
                                                       \u0002\u0018\u0002
                                                       \u0000
                                                       \u0002\u0010\u000e
                                                       \u0000
                                                       \u0002\u0010\b
                                                       \u0002\b\u0005\b\u0084\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010
                                                       \u001a\u00020\u0004H\u0016R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b
                                                       \u0000\u001a\u0004\b\b\u0010	¨\u0006\u000b""" }, d2 = { "Lgg/essential/gui/common/input/AbstractTextInput$VisualLine;", "Lgg/essential/gui/common/input/AbstractTextInput$Line;", "Lgg/essential/gui/common/input/AbstractTextInput;", "text", "", "textIndex", "", "(Lgg/essential/gui/common/input/AbstractTextInput;Ljava/lang/String;I)V", "getTextIndex", "()I", "toString", "essential" })
    protected final class VisualLine extends Line
    {
        private final int textIndex;
        
        public VisualLine(@NotNull final String text, final int textIndex) {
            Intrinsics.checkNotNullParameter((Object)text, "text");
            super(text);
            this.textIndex = textIndex;
        }
        
        public final int getTextIndex() {
            return this.textIndex;
        }
        
        @NotNull
        @Override
        public String toString() {
            return "VisualLine(text=" + ((Line)this).getText() + ", textIndex=" + this.textIndex;
        }
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                       \u0000\u0012
                                                       \u0002\u0018\u0002
                                                       \u0002\u0010\u0000
                                                       \u0002\b\u0002
                                                       \u0002\u0010\b
                                                       \u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002
                                                       \u0000¨\u0006\u0005""" }, d2 = { "Lgg/essential/gui/common/input/AbstractTextInput$Companion;", "", "()V", "MENU_KEY", "", "essential" })
    public static final class Companion
    {
        private Companion() {
            super();
        }
        
        public Companion(final byte b) {
            this();
        }
    }
}
