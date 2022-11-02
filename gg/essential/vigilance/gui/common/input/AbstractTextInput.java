package gg.essential.vigilance.gui.common.input;

import gg.essential.elementa.*;
import java.awt.*;
import org.jetbrains.annotations.*;
import gg.essential.elementa.state.*;
import gg.essential.elementa.dsl.*;
import kotlin.collections.*;
import gg.essential.elementa.constraints.*;
import gg.essential.elementa.utils.*;
import gg.essential.elementa.font.*;
import java.util.*;
import kotlin.comparisons.*;
import gg.essential.universal.*;
import kotlin.reflect.*;
import gg.essential.elementa.constraints.animation.*;
import kotlin.jvm.functions.*;
import kotlin.*;
import gg.essential.elementa.components.*;
import kotlin.text.*;
import kotlin.ranges.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\f\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010 \n\u0002\b\r\b \u0018\u00002\u00020\u0001:\u0014\u00c5\u0001\u00c6\u0001\u00c7\u0001\u00c8\u0001\u00c9\u0001\u00ca\u0001\u00cb\u0001\u00cc\u0001\u00cd\u0001\u00ce\u0001BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\u0007¢\u0006\u0002\u0010\u000eJ\u001f\u0010\u0082\u0001\u001a\u00020\u00142\u0007\u0010\u0083\u0001\u001a\u00020\u00032\u000b\u0010\u0084\u0001\u001a\u00060&R\u00020\u0000H\u0004J\t\u0010\u0085\u0001\u001a\u00020\u0014H\u0014J\t\u0010\u0086\u0001\u001a\u00020\u0014H\u0016J\u001f\u0010\u0087\u0001\u001a\u0005\u0018\u00010\u0088\u00012\u000b\u0010\u0089\u0001\u001a\u00060&R\u00020\u0000H\u0014¢\u0006\u0003\u0010\u008a\u0001J\u001f\u0010\u008b\u0001\u001a\u0005\u0018\u00010\u0088\u00012\u000b\u0010\u0089\u0001\u001a\u00060&R\u00020\u0000H\u0014¢\u0006\u0003\u0010\u008a\u0001J\u0012\u0010\u008c\u0001\u001a\u00020\u00142\u0007\u0010\u0083\u0001\u001a\u00020\u0003H\u0004J\u0016\u0010\u008d\u0001\u001a\u00020\u00142\u000b\u0010\u008e\u0001\u001a\u00060bR\u00020\u0000H\u0014J,\u0010\u008f\u0001\u001a\u00020\u00142\u000b\u0010\u0090\u0001\u001a\u00060&R\u00020\u00002\u000b\u0010\u0091\u0001\u001a\u00060&R\u00020\u00002\u0007\u0010\u0092\u0001\u001a\u00020\u0005H\u0004J\t\u0010\u0093\u0001\u001a\u00020\u0014H\u0014J\t\u0010\u0094\u0001\u001a\u00020\u0014H\u0014J\u0013\u0010\u0095\u0001\u001a\u00020\u00142\b\u0010\u0096\u0001\u001a\u00030\u0097\u0001H\u0016J\u0013\u0010\u0098\u0001\u001a\u00020\u00142\b\u0010\u0096\u0001\u001a\u00030\u0097\u0001H\u0014J6\u0010\u0099\u0001\u001a\u00020\u00142\b\u0010\u0096\u0001\u001a\u00030\u0097\u00012\u0006\u0010\u0013\u001a\u00020\u00032\u0007\u0010\u009a\u0001\u001a\u0002062\u0007\u0010\u009b\u0001\u001a\u0002062\u0007\u0010\u009c\u0001\u001a\u00020>H\u0014J,\u0010\u0099\u0001\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00032\u0007\u0010\u009a\u0001\u001a\u0002062\u0007\u0010\u009b\u0001\u001a\u0002062\u0007\u0010\u009c\u0001\u001a\u00020>H\u0015J6\u0010\u009d\u0001\u001a\u00020\u00142\b\u0010\u0096\u0001\u001a\u00030\u0097\u00012\u0006\u0010\u0013\u001a\u00020\u00032\u0007\u0010\u009a\u0001\u001a\u0002062\u0007\u0010\u009b\u0001\u001a\u0002062\u0007\u0010\u009c\u0001\u001a\u00020>H\u0004JR\u0010\u009e\u0001\u001a\u00020\u00142\b\u0010\u0096\u0001\u001a\u00030\u0097\u00012\u0006\u0010\u0013\u001a\u00020\u00032\u0007\u0010\u009a\u0001\u001a\u0002062\u0007\u0010\u009c\u0001\u001a\u00020>2\u000b\b\u0002\u0010\u009f\u0001\u001a\u0004\u0018\u00010\u00072\t\b\u0002\u0010 \u0001\u001a\u00020\u00052\u000b\b\u0002\u0010¡\u0001\u001a\u0004\u0018\u00010\u0007H\u0014J#\u0010\u009e\u0001\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00032\u0007\u0010\u009a\u0001\u001a\u0002062\u0007\u0010\u009c\u0001\u001a\u00020>H\u0015J-\u0010¢\u0001\u001a\u00020\u00142\b\u0010\u0096\u0001\u001a\u00030\u0097\u00012\u0006\u0010\u0013\u001a\u00020\u00032\u0007\u0010\u009a\u0001\u001a\u0002062\u0007\u0010\u009c\u0001\u001a\u00020>H\u0004J$\u0010£\u0001\u001a\u00060&R\u00020\u00002\u000b\u0010\u0089\u0001\u001a\u00060&R\u00020\u00002\b\u0010¤\u0001\u001a\u00030¥\u0001H\u0014J\u001d\u0010¦\u0001\u001a\u0016\u0012\b\u0012\u00060&R\u00020\u0000\u0012\b\u0012\u00060&R\u00020\u00000DH\u0014J\t\u0010§\u0001\u001a\u00020\u0003H&J#\u0010¨\u0001\u001a\u00020\u00032\u000b\u0010\u0090\u0001\u001a\u00060&R\u00020\u00002\u000b\u0010\u0091\u0001\u001a\u00060&R\u00020\u0000H\u0014J\t\u0010©\u0001\u001a\u00020\u0005H\u0014J\t\u0010ª\u0001\u001a\u00020\u0005H\u0014J\u0007\u0010«\u0001\u001a\u00020\u0005J\u0013\u0010¬\u0001\u001a\u00020\u00052\b\u0010\u00ad\u0001\u001a\u00030\u0088\u0001H\u0014J+\u0010®\u0001\u001a\u00020\u00002\"\u0010¯\u0001\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00140\u0010J\t\u0010°\u0001\u001a\u00020\u0014H$J+\u0010±\u0001\u001a\u00020\u00002\"\u0010¯\u0001\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00140\u0010J\t\u0010²\u0001\u001a\u00020\u0014H\u0014J\t\u0010³\u0001\u001a\u00020\u0014H$J\u0012\u0010´\u0001\u001a\u00020\u00142\u0007\u0010µ\u0001\u001a\u00020>H\u0014J#\u0010¶\u0001\u001a\u00020\u00142\u000b\u0010\u0090\u0001\u001a\u00060&R\u00020\u00002\u000b\u0010\u0091\u0001\u001a\u00060&R\u00020\u0000H\u0002J\u001f\u0010·\u0001\u001a\u00060&R\u00020\u00002\u0007\u0010¸\u0001\u001a\u0002062\u0007\u0010¹\u0001\u001a\u000206H$J\u0016\u0010º\u0001\u001a\u00020\u00142\u000b\u0010\u0089\u0001\u001a\u00060&R\u00020\u0000H$J\t\u0010»\u0001\u001a\u00020\u0014H\u0014J\r\u0010¼\u0001\u001a\u00060&R\u00020\u0000H\u0014J\r\u0010½\u0001\u001a\u00060&R\u00020\u0000H\u0014J\u000f\u0010\u001c\u001a\u00020\u00002\u0007\u0010«\u0001\u001a\u00020\u0005J\u0016\u0010¾\u0001\u001a\u00020\u00142\u000b\u0010¿\u0001\u001a\u00060&R\u00020\u0000H\u0002J\u000f\u0010\u00c0\u0001\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0003J!\u0010\u00c1\u0001\u001a\t\u0012\u0004\u0012\u00020\u00030\u00c2\u00012\u0006\u0010\u0013\u001a\u00020\u00032\u0007\u0010\u00c3\u0001\u001a\u000206H\u0014J\u0018\u0010\u00c4\u0001\u001a\t\u0012\u0004\u0012\u00020\u00030\u00c2\u00012\u0006\u0010\u0013\u001a\u00020\u0003H$R5\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00140\u0010X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u0005X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0014\u0010\n\u001a\u00020\u0005X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001bR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u001b\"\u0004\b \u0010\u001dR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R,\u0010'\u001a\u00060&R\u00020\u00002\n\u0010%\u001a\u00060&R\u00020\u0000@DX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u0014\u0010\r\u001a\u00020\u0007X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\"R\u001a\u0010-\u001a\u00020\u0001X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u001a\u00102\u001a\u00020\u0005X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u001b\"\u0004\b4\u0010\u001dR\u001a\u00105\u001a\u000206X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u0014\u0010\u000b\u001a\u00020\u0007X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u0010\"R\u0014\u0010\f\u001a\u00020\u0007X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u0010\"R\u001a\u0010=\u001a\u00020>X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR.\u0010C\u001a\u0016\u0012\b\u0012\u00060&R\u00020\u0000\u0012\b\u0012\u00060&R\u00020\u00000DX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\u001a\u0010I\u001a\u00020JX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR$\u0010O\u001a\u0002062\u0006\u0010%\u001a\u000206@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bP\u00108\"\u0004\bQ\u0010:R,\u0010R\u001a\u00060&R\u00020\u00002\n\u0010%\u001a\u00060&R\u00020\u0000@DX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bS\u0010)\"\u0004\bT\u0010+R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR\u001f\u0010Y\u001a\u0010\u0012\f\u0012\n [*\u0004\u0018\u00010\u00070\u00070Z¢\u0006\b\n\u0000\u001a\u0004\b\\\u0010]R\u0017\u0010^\u001a\b\u0012\u0004\u0012\u00020\u00050Z¢\u0006\b\n\u0000\u001a\u0004\b_\u0010]R\u001e\u0010`\u001a\f\u0012\b\u0012\u00060bR\u00020\u00000aX\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\bc\u0010dR\u0014\u0010\b\u001a\u00020\u0007X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\be\u0010\"R\u0014\u0010\t\u001a\u00020\u0007X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\bf\u0010\"R\u001a\u0010g\u001a\u00020hX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bi\u0010j\"\u0004\bk\u0010lR\u001a\u0010m\u001a\u000206X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bn\u00108\"\u0004\bo\u0010:R\u0017\u0010p\u001a\b\u0012\u0004\u0012\u00020\u00030Z¢\u0006\b\n\u0000\u001a\u0004\bq\u0010]R\u001e\u0010r\u001a\f\u0012\b\u0012\u00060tR\u00020\u00000sX\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\bu\u0010vR\u001e\u0010w\u001a\f\u0012\b\u0012\u00060bR\u00020\u00000aX\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\bx\u0010dR5\u0010y\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00140\u0010X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bz\u0010\u0016\"\u0004\b{\u0010\u0018R\u001a\u0010|\u001a\u000206X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b}\u00108\"\u0004\b~\u0010:R \u0010\u007f\u001a\r\u0012\t\u0012\u00070\u0080\u0001R\u00020\u00000sX\u0084\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0081\u0001\u0010v¨\u0006\u00cf\u0001" }, d2 = { "Lgg/essential/vigilance/gui/common/input/AbstractTextInput;", "Lgg/essential/elementa/UIComponent;", "placeholder", "", "contentShadow", "", "contentShadowColor", "Ljava/awt/Color;", "selectionBackgroundColor", "selectionForegroundColor", "allowInactiveSelection", "inactiveSelectionBackgroundColor", "inactiveSelectionForegroundColor", "cursorColor", "(Ljava/lang/String;ZLjava/awt/Color;Ljava/awt/Color;Ljava/awt/Color;ZLjava/awt/Color;Ljava/awt/Color;Ljava/awt/Color;)V", "activateAction", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "text", "", "getActivateAction", "()Lkotlin/jvm/functions/Function1;", "setActivateAction", "(Lkotlin/jvm/functions/Function1;)V", "active", "getActive", "()Z", "setActive", "(Z)V", "getAllowInactiveSelection", "getContentShadow", "setContentShadow", "getContentShadowColor", "()Ljava/awt/Color;", "setContentShadowColor", "(Ljava/awt/Color;)V", "value", "Lgg/essential/vigilance/gui/common/input/AbstractTextInput$LinePosition;", "cursor", "getCursor", "()Lgg/essential/vigilance/gui/common/input/AbstractTextInput$LinePosition;", "setCursor", "(Lgg/essential/vigilance/gui/common/input/AbstractTextInput$LinePosition;)V", "getCursorColor", "cursorComponent", "getCursorComponent", "()Lgg/essential/elementa/UIComponent;", "setCursorComponent", "(Lgg/essential/elementa/UIComponent;)V", "cursorNeedsRefocus", "getCursorNeedsRefocus", "setCursorNeedsRefocus", "horizontalScrollingOffset", "", "getHorizontalScrollingOffset", "()F", "setHorizontalScrollingOffset", "(F)V", "getInactiveSelectionBackgroundColor", "getInactiveSelectionForegroundColor", "initiallySelectedLine", "", "getInitiallySelectedLine", "()I", "setInitiallySelectedLine", "(I)V", "initiallySelectedWord", "Lkotlin/Pair;", "getInitiallySelectedWord", "()Lkotlin/Pair;", "setInitiallySelectedWord", "(Lkotlin/Pair;)V", "lastSelectionMoveTimestamp", "", "getLastSelectionMoveTimestamp", "()J", "setLastSelectionMoveTimestamp", "(J)V", "lineHeight", "getLineHeight", "setLineHeight", "otherSelectionEnd", "getOtherSelectionEnd", "setOtherSelectionEnd", "getPlaceholder", "()Ljava/lang/String;", "setPlaceholder", "(Ljava/lang/String;)V", "placeholderColor", "Lgg/essential/elementa/state/BasicState;", "kotlin.jvm.PlatformType", "getPlaceholderColor", "()Lgg/essential/elementa/state/BasicState;", "placeholderShadow", "getPlaceholderShadow", "redoStack", "Ljava/util/ArrayDeque;", "Lgg/essential/vigilance/gui/common/input/AbstractTextInput$TextOperation;", "getRedoStack", "()Ljava/util/ArrayDeque;", "getSelectionBackgroundColor", "getSelectionForegroundColor", "selectionMode", "Lgg/essential/vigilance/gui/common/input/AbstractTextInput$SelectionMode;", "getSelectionMode", "()Lgg/essential/vigilance/gui/common/input/AbstractTextInput$SelectionMode;", "setSelectionMode", "(Lgg/essential/vigilance/gui/common/input/AbstractTextInput$SelectionMode;)V", "targetVerticalScrollingOffset", "getTargetVerticalScrollingOffset", "setTargetVerticalScrollingOffset", "textState", "getTextState", "textualLines", "", "Lgg/essential/vigilance/gui/common/input/AbstractTextInput$TextualLine;", "getTextualLines", "()Ljava/util/List;", "undoStack", "getUndoStack", "updateAction", "getUpdateAction", "setUpdateAction", "verticalScrollingOffset", "getVerticalScrollingOffset", "setVerticalScrollingOffset", "visualLines", "Lgg/essential/vigilance/gui/common/input/AbstractTextInput$VisualLine;", "getVisualLines", "addText", "newText", "position", "animateCursor", "animationFrame", "charAfter", "", "pos", "(Lgg/essential/vigilance/gui/common/input/AbstractTextInput$LinePosition;)Ljava/lang/Character;", "charBefore", "commitTextAddition", "commitTextOperation", "operation", "commitTextRemoval", "startPos", "endPos", "selectAfterUndo", "copySelection", "deleteSelection", "draw", "matrixStack", "Lgg/essential/universal/UMatrixStack;", "drawPlaceholder", "drawSelectedText", "left", "right", "row", "drawSelectedTextCompat", "drawUnselectedText", "color", "shadow", "shadowColor", "drawUnselectedTextCompat", "getNearestWordBoundary", "direction", "Lgg/essential/vigilance/gui/common/input/AbstractTextInput$Direction;", "getSelection", "getText", "getTextBetween", "hasSelection", "hasText", "isActive", "isBreakingCharacter", "ch", "onActivate", "listener", "onEnterPressed", "onUpdate", "recalculateAllVisualLines", "recalculateDimensions", "recalculateVisualLinesFor", "textualLineIndex", "removeText", "screenPosToVisualPos", "x", "y", "scrollIntoView", "selectAll", "selectionEnd", "selectionStart", "setCursorPosition", "newPosition", "setText", "splitTextForWrapping", "", "maxLineWidth", "textToLines", "AddTextOperation", "Direction", "Line", "LinePosition", "RemoveTextOperation", "ReplaceTextOperation", "SelectionMode", "TextOperation", "TextualLine", "VisualLine", "Vigilance" })
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
    private final Color selectionForegroundColor;
    private final boolean allowInactiveSelection;
    @NotNull
    private final Color inactiveSelectionBackgroundColor;
    @NotNull
    private final Color inactiveSelectionForegroundColor;
    @NotNull
    private final Color cursorColor;
    @NotNull
    private final BasicState<Color> placeholderColor;
    @NotNull
    private final BasicState<Boolean> placeholderShadow;
    @NotNull
    private final BasicState<String> textState;
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
        //    53: putfield        gg/essential/vigilance/gui/common/input/AbstractTextInput.placeholder:Ljava/lang/String;
        //    56: aload_0         /* this */
        //    57: iload_2         /* contentShadow */
        //    58: putfield        gg/essential/vigilance/gui/common/input/AbstractTextInput.contentShadow:Z
        //    61: aload_0         /* this */
        //    62: aload_3         /* contentShadowColor */
        //    63: putfield        gg/essential/vigilance/gui/common/input/AbstractTextInput.contentShadowColor:Ljava/awt/Color;
        //    66: aload_0         /* this */
        //    67: aload           selectionBackgroundColor
        //    69: putfield        gg/essential/vigilance/gui/common/input/AbstractTextInput.selectionBackgroundColor:Ljava/awt/Color;
        //    72: aload_0         /* this */
        //    73: aload           selectionForegroundColor
        //    75: putfield        gg/essential/vigilance/gui/common/input/AbstractTextInput.selectionForegroundColor:Ljava/awt/Color;
        //    78: aload_0         /* this */
        //    79: iload           allowInactiveSelection
        //    81: putfield        gg/essential/vigilance/gui/common/input/AbstractTextInput.allowInactiveSelection:Z
        //    84: aload_0         /* this */
        //    85: aload           inactiveSelectionBackgroundColor
        //    87: putfield        gg/essential/vigilance/gui/common/input/AbstractTextInput.inactiveSelectionBackgroundColor:Ljava/awt/Color;
        //    90: aload_0         /* this */
        //    91: aload           inactiveSelectionForegroundColor
        //    93: putfield        gg/essential/vigilance/gui/common/input/AbstractTextInput.inactiveSelectionForegroundColor:Ljava/awt/Color;
        //    96: aload_0         /* this */
        //    97: aload           cursorColor
        //    99: putfield        gg/essential/vigilance/gui/common/input/AbstractTextInput.cursorColor:Ljava/awt/Color;
        //   102: aload_0         /* this */
        //   103: getstatic       gg/essential/vigilance/gui/VigilancePalette.INSTANCE:Lgg/essential/vigilance/gui/VigilancePalette;
        //   106: invokevirtual   gg/essential/vigilance/gui/VigilancePalette.getText$Vigilance:()Lgg/essential/elementa/state/BasicState;
        //   109: putfield        gg/essential/vigilance/gui/common/input/AbstractTextInput.placeholderColor:Lgg/essential/elementa/state/BasicState;
        //   112: aload_0         /* this */
        //   113: new             Lgg/essential/elementa/state/BasicState;
        //   116: dup            
        //   117: iconst_1       
        //   118: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   121: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //   124: putfield        gg/essential/vigilance/gui/common/input/AbstractTextInput.placeholderShadow:Lgg/essential/elementa/state/BasicState;
        //   127: aload_0         /* this */
        //   128: new             Lgg/essential/elementa/state/BasicState;
        //   131: dup            
        //   132: ldc_w           ""
        //   135: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //   138: putfield        gg/essential/vigilance/gui/common/input/AbstractTextInput.textState:Lgg/essential/elementa/state/BasicState;
        //   141: aload_0         /* this */
        //   142: ldc_w           9.0
        //   145: putfield        gg/essential/vigilance/gui/common/input/AbstractTextInput.lineHeight:F
        //   148: aload_0         /* this */
        //   149: getstatic       gg/essential/vigilance/gui/common/input/AbstractTextInput$updateAction$1.INSTANCE:Lgg/essential/vigilance/gui/common/input/AbstractTextInput$updateAction$1;
        //   152: checkcast       Lkotlin/jvm/functions/Function1;
        //   155: putfield        gg/essential/vigilance/gui/common/input/AbstractTextInput.updateAction:Lkotlin/jvm/functions/Function1;
        //   158: aload_0         /* this */
        //   159: getstatic       gg/essential/vigilance/gui/common/input/AbstractTextInput$activateAction$1.INSTANCE:Lgg/essential/vigilance/gui/common/input/AbstractTextInput$activateAction$1;
        //   162: checkcast       Lkotlin/jvm/functions/Function1;
        //   165: putfield        gg/essential/vigilance/gui/common/input/AbstractTextInput.activateAction:Lkotlin/jvm/functions/Function1;
        //   168: aload_0         /* this */
        //   169: iconst_1       
        //   170: anewarray       Lgg/essential/vigilance/gui/common/input/AbstractTextInput$TextualLine;
        //   173: astore          10
        //   175: aload           10
        //   177: iconst_0       
        //   178: new             Lgg/essential/vigilance/gui/common/input/AbstractTextInput$TextualLine;
        //   181: dup            
        //   182: aload_0         /* this */
        //   183: ldc_w           ""
        //   186: new             Lkotlin/ranges/IntRange;
        //   189: dup            
        //   190: iconst_0       
        //   191: iconst_0       
        //   192: invokespecial   kotlin/ranges/IntRange.<init>:(II)V
        //   195: invokespecial   gg/essential/vigilance/gui/common/input/AbstractTextInput$TextualLine.<init>:(Lgg/essential/vigilance/gui/common/input/AbstractTextInput;Ljava/lang/String;Lkotlin/ranges/IntRange;)V
        //   198: aastore        
        //   199: aload           10
        //   201: invokestatic    kotlin/collections/CollectionsKt.mutableListOf:([Ljava/lang/Object;)Ljava/util/List;
        //   204: putfield        gg/essential/vigilance/gui/common/input/AbstractTextInput.textualLines:Ljava/util/List;
        //   207: aload_0         /* this */
        //   208: iconst_1       
        //   209: anewarray       Lgg/essential/vigilance/gui/common/input/AbstractTextInput$VisualLine;
        //   212: astore          10
        //   214: aload           10
        //   216: iconst_0       
        //   217: new             Lgg/essential/vigilance/gui/common/input/AbstractTextInput$VisualLine;
        //   220: dup            
        //   221: aload_0         /* this */
        //   222: ldc_w           ""
        //   225: iconst_0       
        //   226: invokespecial   gg/essential/vigilance/gui/common/input/AbstractTextInput$VisualLine.<init>:(Lgg/essential/vigilance/gui/common/input/AbstractTextInput;Ljava/lang/String;I)V
        //   229: aastore        
        //   230: aload           10
        //   232: invokestatic    kotlin/collections/CollectionsKt.mutableListOf:([Ljava/lang/Object;)Ljava/util/List;
        //   235: putfield        gg/essential/vigilance/gui/common/input/AbstractTextInput.visualLines:Ljava/util/List;
        //   238: aload_0         /* this */
        //   239: invokestatic    java/lang/System.currentTimeMillis:()J
        //   242: putfield        gg/essential/vigilance/gui/common/input/AbstractTextInput.lastSelectionMoveTimestamp:J
        //   245: aload_0         /* this */
        //   246: getstatic       gg/essential/vigilance/gui/common/input/AbstractTextInput$SelectionMode.None:Lgg/essential/vigilance/gui/common/input/AbstractTextInput$SelectionMode;
        //   249: putfield        gg/essential/vigilance/gui/common/input/AbstractTextInput.selectionMode:Lgg/essential/vigilance/gui/common/input/AbstractTextInput$SelectionMode;
        //   252: aload_0         /* this */
        //   253: iconst_m1      
        //   254: putfield        gg/essential/vigilance/gui/common/input/AbstractTextInput.initiallySelectedLine:I
        //   257: aload_0         /* this */
        //   258: new             Lgg/essential/vigilance/gui/common/input/AbstractTextInput$LinePosition;
        //   261: dup            
        //   262: aload_0         /* this */
        //   263: iconst_0       
        //   264: iconst_0       
        //   265: iconst_1       
        //   266: invokespecial   gg/essential/vigilance/gui/common/input/AbstractTextInput$LinePosition.<init>:(Lgg/essential/vigilance/gui/common/input/AbstractTextInput;IIZ)V
        //   269: new             Lgg/essential/vigilance/gui/common/input/AbstractTextInput$LinePosition;
        //   272: dup            
        //   273: aload_0         /* this */
        //   274: iconst_0       
        //   275: iconst_0       
        //   276: iconst_1       
        //   277: invokespecial   gg/essential/vigilance/gui/common/input/AbstractTextInput$LinePosition.<init>:(Lgg/essential/vigilance/gui/common/input/AbstractTextInput;IIZ)V
        //   280: invokestatic    kotlin/TuplesKt.to:(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
        //   283: putfield        gg/essential/vigilance/gui/common/input/AbstractTextInput.initiallySelectedWord:Lkotlin/Pair;
        //   286: aload_0         /* this */
        //   287: new             Ljava/util/ArrayDeque;
        //   290: dup            
        //   291: invokespecial   java/util/ArrayDeque.<init>:()V
        //   294: putfield        gg/essential/vigilance/gui/common/input/AbstractTextInput.undoStack:Ljava/util/ArrayDeque;
        //   297: aload_0         /* this */
        //   298: new             Ljava/util/ArrayDeque;
        //   301: dup            
        //   302: invokespecial   java/util/ArrayDeque.<init>:()V
        //   305: putfield        gg/essential/vigilance/gui/common/input/AbstractTextInput.redoStack:Ljava/util/ArrayDeque;
        //   308: aload_0         /* this */
        //   309: new             Lgg/essential/elementa/components/UIBlock;
        //   312: dup            
        //   313: new             Ljava/awt/Color;
        //   316: dup            
        //   317: sipush          255
        //   320: sipush          255
        //   323: sipush          255
        //   326: iconst_0       
        //   327: invokespecial   java/awt/Color.<init>:(IIII)V
        //   330: invokespecial   gg/essential/elementa/components/UIBlock.<init>:(Ljava/awt/Color;)V
        //   333: checkcast       Lgg/essential/elementa/UIComponent;
        //   336: astore          $this$constrain$iv
        //   338: iconst_0       
        //   339: istore          $i$f$constrain
        //   341: aload           $this$constrain$iv
        //   343: astore          12
        //   345: aload           12
        //   347: astore          $this$constrain_u24lambda_u2d0$iv
        //   349: iconst_0       
        //   350: istore          $i$a$-apply-ComponentsKt$constrain$1$iv
        //   352: aload           $this$constrain_u24lambda_u2d0$iv
        //   354: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   357: astore          15
        //   359: astore          17
        //   361: iconst_0       
        //   362: istore          $i$a$-constrain-AbstractTextInput$cursorComponent$1
        //   364: aload           $this$cursorComponent_u24lambda_u2d0
        //   366: new             Lgg/essential/elementa/constraints/CenterConstraint;
        //   369: dup            
        //   370: invokespecial   gg/essential/elementa/constraints/CenterConstraint.<init>:()V
        //   373: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   376: ldc_w           0.5
        //   379: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //   382: checkcast       Ljava/lang/Number;
        //   385: iconst_0       
        //   386: iconst_0       
        //   387: iconst_3       
        //   388: aconst_null    
        //   389: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels$default:(Ljava/lang/Number;ZZILjava/lang/Object;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   392: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   395: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.minus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/SubtractiveConstraint;
        //   398: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   401: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   404: aload           $this$cursorComponent_u24lambda_u2d0
        //   406: iconst_1       
        //   407: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   410: checkcast       Ljava/lang/Number;
        //   413: iconst_0       
        //   414: iconst_0       
        //   415: iconst_3       
        //   416: aconst_null    
        //   417: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixel$default:(Ljava/lang/Number;ZZILjava/lang/Object;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   420: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   423: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   426: aload           $this$cursorComponent_u24lambda_u2d0
        //   428: aload_0         /* this */
        //   429: invokevirtual   gg/essential/vigilance/gui/common/input/AbstractTextInput.getLineHeight:()F
        //   432: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //   435: checkcast       Ljava/lang/Number;
        //   438: iconst_0       
        //   439: iconst_0       
        //   440: iconst_3       
        //   441: aconst_null    
        //   442: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels$default:(Ljava/lang/Number;ZZILjava/lang/Object;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   445: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   448: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   451: nop            
        //   452: aload           17
        //   454: nop            
        //   455: aload           12
        //   457: nop            
        //   458: aload_0         /* this */
        //   459: checkcast       Lgg/essential/elementa/UIComponent;
        //   462: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   465: putfield        gg/essential/vigilance/gui/common/input/AbstractTextInput.cursorComponent:Lgg/essential/elementa/UIComponent;
        //   468: aload_0         /* this */
        //   469: new             Lgg/essential/vigilance/gui/common/input/AbstractTextInput$LinePosition;
        //   472: dup            
        //   473: aload_0         /* this */
        //   474: iconst_0       
        //   475: iconst_0       
        //   476: iconst_1       
        //   477: invokespecial   gg/essential/vigilance/gui/common/input/AbstractTextInput$LinePosition.<init>:(Lgg/essential/vigilance/gui/common/input/AbstractTextInput;IIZ)V
        //   480: putfield        gg/essential/vigilance/gui/common/input/AbstractTextInput.cursor:Lgg/essential/vigilance/gui/common/input/AbstractTextInput$LinePosition;
        //   483: aload_0         /* this */
        //   484: new             Lgg/essential/vigilance/gui/common/input/AbstractTextInput$LinePosition;
        //   487: dup            
        //   488: aload_0         /* this */
        //   489: iconst_0       
        //   490: iconst_0       
        //   491: iconst_1       
        //   492: invokespecial   gg/essential/vigilance/gui/common/input/AbstractTextInput$LinePosition.<init>:(Lgg/essential/vigilance/gui/common/input/AbstractTextInput;IIZ)V
        //   495: putfield        gg/essential/vigilance/gui/common/input/AbstractTextInput.otherSelectionEnd:Lgg/essential/vigilance/gui/common/input/AbstractTextInput$LinePosition;
        //   498: nop            
        //   499: aload_0         /* this */
        //   500: aload_0         /* this */
        //   501: getfield        gg/essential/vigilance/gui/common/input/AbstractTextInput.lineHeight:F
        //   504: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //   507: checkcast       Ljava/lang/Number;
        //   510: iconst_0       
        //   511: iconst_0       
        //   512: iconst_3       
        //   513: aconst_null    
        //   514: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels$default:(Ljava/lang/Number;ZZILjava/lang/Object;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   517: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   520: invokevirtual   gg/essential/vigilance/gui/common/input/AbstractTextInput.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)Lgg/essential/elementa/UIComponent;
        //   523: pop            
        //   524: aload_0         /* this */
        //   525: new             Lgg/essential/vigilance/gui/common/input/AbstractTextInput$1;
        //   528: dup            
        //   529: aload_0         /* this */
        //   530: invokespecial   gg/essential/vigilance/gui/common/input/AbstractTextInput$1.<init>:(Lgg/essential/vigilance/gui/common/input/AbstractTextInput;)V
        //   533: checkcast       Lkotlin/jvm/functions/Function3;
        //   536: invokevirtual   gg/essential/vigilance/gui/common/input/AbstractTextInput.onKeyType:(Lkotlin/jvm/functions/Function3;)Lgg/essential/elementa/UIComponent;
        //   539: pop            
        //   540: aload_0         /* this */
        //   541: new             Lgg/essential/vigilance/gui/common/input/AbstractTextInput$2;
        //   544: dup            
        //   545: aload_0         /* this */
        //   546: invokespecial   gg/essential/vigilance/gui/common/input/AbstractTextInput$2.<init>:(Lgg/essential/vigilance/gui/common/input/AbstractTextInput;)V
        //   549: checkcast       Lkotlin/jvm/functions/Function2;
        //   552: invokevirtual   gg/essential/vigilance/gui/common/input/AbstractTextInput.onMouseScroll:(Lkotlin/jvm/functions/Function2;)Lgg/essential/elementa/UIComponent;
        //   555: pop            
        //   556: aload_0         /* this */
        //   557: new             Lgg/essential/vigilance/gui/common/input/AbstractTextInput$3;
        //   560: dup            
        //   561: aload_0         /* this */
        //   562: invokespecial   gg/essential/vigilance/gui/common/input/AbstractTextInput$3.<init>:(Lgg/essential/vigilance/gui/common/input/AbstractTextInput;)V
        //   565: checkcast       Lkotlin/jvm/functions/Function2;
        //   568: invokevirtual   gg/essential/vigilance/gui/common/input/AbstractTextInput.onMouseClick:(Lkotlin/jvm/functions/Function2;)Lgg/essential/elementa/UIComponent;
        //   571: pop            
        //   572: aload_0         /* this */
        //   573: new             Lgg/essential/vigilance/gui/common/input/AbstractTextInput$4;
        //   576: dup            
        //   577: aload_0         /* this */
        //   578: invokespecial   gg/essential/vigilance/gui/common/input/AbstractTextInput$4.<init>:(Lgg/essential/vigilance/gui/common/input/AbstractTextInput;)V
        //   581: checkcast       Lkotlin/jvm/functions/Function4;
        //   584: invokevirtual   gg/essential/vigilance/gui/common/input/AbstractTextInput.onMouseDrag:(Lkotlin/jvm/functions/Function4;)Lgg/essential/elementa/UIComponent;
        //   587: pop            
        //   588: aload_0         /* this */
        //   589: new             Lgg/essential/vigilance/gui/common/input/AbstractTextInput$5;
        //   592: dup            
        //   593: aload_0         /* this */
        //   594: invokespecial   gg/essential/vigilance/gui/common/input/AbstractTextInput$5.<init>:(Lgg/essential/vigilance/gui/common/input/AbstractTextInput;)V
        //   597: checkcast       Lkotlin/jvm/functions/Function1;
        //   600: invokevirtual   gg/essential/vigilance/gui/common/input/AbstractTextInput.onMouseRelease:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/UIComponent;
        //   603: pop            
        //   604: aload_0         /* this */
        //   605: new             Lgg/essential/vigilance/gui/common/input/AbstractTextInput$6;
        //   608: dup            
        //   609: aload_0         /* this */
        //   610: invokespecial   gg/essential/vigilance/gui/common/input/AbstractTextInput$6.<init>:(Lgg/essential/vigilance/gui/common/input/AbstractTextInput;)V
        //   613: checkcast       Lkotlin/jvm/functions/Function1;
        //   616: invokevirtual   gg/essential/vigilance/gui/common/input/AbstractTextInput.onFocus:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/UIComponent;
        //   619: pop            
        //   620: aload_0         /* this */
        //   621: new             Lgg/essential/vigilance/gui/common/input/AbstractTextInput$7;
        //   624: dup            
        //   625: aload_0         /* this */
        //   626: invokespecial   gg/essential/vigilance/gui/common/input/AbstractTextInput$7.<init>:(Lgg/essential/vigilance/gui/common/input/AbstractTextInput;)V
        //   629: checkcast       Lkotlin/jvm/functions/Function1;
        //   632: invokevirtual   gg/essential/vigilance/gui/common/input/AbstractTextInput.onFocusLost:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/UIComponent;
        //   635: pop            
        //   636: aload_0         /* this */
        //   637: getfield        gg/essential/vigilance/gui/common/input/AbstractTextInput.cursorComponent:Lgg/essential/elementa/UIComponent;
        //   640: new             Lgg/essential/vigilance/gui/common/input/AbstractTextInput$8;
        //   643: dup            
        //   644: aload_0         /* this */
        //   645: invokespecial   gg/essential/vigilance/gui/common/input/AbstractTextInput$8.<init>:(Lgg/essential/vigilance/gui/common/input/AbstractTextInput;)V
        //   648: checkcast       Lkotlin/jvm/functions/Function1;
        //   651: invokevirtual   gg/essential/elementa/UIComponent.animateAfterUnhide:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/UIComponent;
        //   654: pop            
        //   655: aload_0         /* this */
        //   656: new             Lgg/essential/elementa/effects/ScissorEffect;
        //   659: dup            
        //   660: aconst_null    
        //   661: iconst_0       
        //   662: iconst_3       
        //   663: aconst_null    
        //   664: invokespecial   gg/essential/elementa/effects/ScissorEffect.<init>:(Lgg/essential/elementa/UIComponent;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   667: checkcast       Lgg/essential/elementa/effects/Effect;
        //   670: invokevirtual   gg/essential/vigilance/gui/common/input/AbstractTextInput.enableEffect:(Lgg/essential/elementa/effects/Effect;)Lgg/essential/elementa/UIComponent;
        //   673: pop            
        //   674: aload_0         /* this */
        //   675: getfield        gg/essential/vigilance/gui/common/input/AbstractTextInput.textState:Lgg/essential/elementa/state/BasicState;
        //   678: new             Lgg/essential/vigilance/gui/common/input/AbstractTextInput$9;
        //   681: dup            
        //   682: aload_0         /* this */
        //   683: invokespecial   gg/essential/vigilance/gui/common/input/AbstractTextInput$9.<init>:(Lgg/essential/vigilance/gui/common/input/AbstractTextInput;)V
        //   686: checkcast       Lkotlin/jvm/functions/Function1;
        //   689: invokevirtual   gg/essential/elementa/state/BasicState.onSetValue:(Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function0;
        //   692: pop            
        //   693: nop            
        //   694: return         
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
    
    @NotNull
    public final String getPlaceholder() {
        return this.placeholder;
    }
    
    public final void setPlaceholder(@NotNull final String <set-?>) {
        Intrinsics.checkNotNullParameter((Object)<set-?>, "<set-?>");
        this.placeholder = <set-?>;
    }
    
    public final boolean getContentShadow() {
        return this.contentShadow;
    }
    
    public final void setContentShadow(final boolean <set-?>) {
        this.contentShadow = <set-?>;
    }
    
    @Nullable
    public final Color getContentShadowColor() {
        return this.contentShadowColor;
    }
    
    public final void setContentShadowColor(@Nullable final Color <set-?>) {
        this.contentShadowColor = <set-?>;
    }
    
    @NotNull
    protected final Color getSelectionBackgroundColor() {
        return this.selectionBackgroundColor;
    }
    
    @NotNull
    protected final Color getSelectionForegroundColor() {
        return this.selectionForegroundColor;
    }
    
    protected final boolean getAllowInactiveSelection() {
        return this.allowInactiveSelection;
    }
    
    @NotNull
    protected final Color getInactiveSelectionBackgroundColor() {
        return this.inactiveSelectionBackgroundColor;
    }
    
    @NotNull
    protected final Color getInactiveSelectionForegroundColor() {
        return this.inactiveSelectionForegroundColor;
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
    public final BasicState<Boolean> getPlaceholderShadow() {
        return this.placeholderShadow;
    }
    
    @NotNull
    public final BasicState<String> getTextState() {
        return this.textState;
    }
    
    protected final boolean getActive() {
        return this.active;
    }
    
    protected final void setActive(final boolean <set-?>) {
        this.active = <set-?>;
    }
    
    public final float getLineHeight() {
        return this.lineHeight;
    }
    
    public final void setLineHeight(final float value) {
        this.cursorComponent.setHeight(UtilitiesKt.pixels$default(value, false, false, 3, null));
        this.setHeight(UtilitiesKt.pixels$default(value, false, false, 3, null));
        this.lineHeight = value;
    }
    
    @NotNull
    protected final Function1<String, Unit> getUpdateAction() {
        return (Function1<String, Unit>)this.updateAction;
    }
    
    protected final void setUpdateAction(@NotNull final Function1<? super String, Unit> <set-?>) {
        Intrinsics.checkNotNullParameter((Object)<set-?>, "<set-?>");
        this.updateAction = <set-?>;
    }
    
    @NotNull
    protected final Function1<String, Unit> getActivateAction() {
        return (Function1<String, Unit>)this.activateAction;
    }
    
    protected final void setActivateAction(@NotNull final Function1<? super String, Unit> <set-?>) {
        Intrinsics.checkNotNullParameter((Object)<set-?>, "<set-?>");
        this.activateAction = <set-?>;
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
    
    protected final void setVerticalScrollingOffset(final float <set-?>) {
        this.verticalScrollingOffset = <set-?>;
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
    
    protected final boolean getCursorNeedsRefocus() {
        return this.cursorNeedsRefocus;
    }
    
    protected final void setCursorNeedsRefocus(final boolean <set-?>) {
        this.cursorNeedsRefocus = <set-?>;
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
    
    protected final void setCursorComponent(@NotNull final UIComponent <set-?>) {
        Intrinsics.checkNotNullParameter((Object)<set-?>, "<set-?>");
        this.cursorComponent = <set-?>;
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
        final AbstractTextInput.ReplaceTextOperation replaceTextOperation = new AbstractTextInput.ReplaceTextOperation(this, new AbstractTextInput.AddTextOperation(this, text, absoluteStart), new AbstractTextInput.RemoveTextOperation(this, absoluteStart, new LinePosition(CollectionsKt.getLastIndex((List)this.visualLines), ((Line)CollectionsKt.last((List)this.visualLines)).getLength(), true), true));
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
        final int n = 0;
        $this$setActive_u24lambda_u2d1.setActive(isActive);
        if (isActive) {
            UIComponent.unhide$default($this$setActive_u24lambda_u2d1.getCursorComponent(), false, 1, null);
            $this$setActive_u24lambda_u2d1.animateCursor();
        }
        else {
            $this$setActive_u24lambda_u2d1.getCursorComponent().setColor(UtilitiesKt.toConstraint(new Color(255, 255, 255, 0)));
            if ($this$setActive_u24lambda_u2d1.hasText() && (!$this$setActive_u24lambda_u2d1.getAllowInactiveSelection() || !$this$setActive_u24lambda_u2d1.hasSelection())) {
                $this$setActive_u24lambda_u2d1.setCursorPosition($this$setActive_u24lambda_u2d1.new LinePosition(CollectionsKt.getLastIndex((List)$this$setActive_u24lambda_u2d1.getVisualLines()), ((Line)CollectionsKt.last((List)$this$setActive_u24lambda_u2d1.getVisualLines())).getLength(), true));
            }
        }
        return this;
    }
    
    public final boolean isActive() {
        return this.active;
    }
    
    @NotNull
    public final AbstractTextInput onUpdate(@NotNull final Function1<? super String, Unit> listener) {
        Intrinsics.checkNotNullParameter((Object)listener, "listener");
        final AbstractTextInput $this$onUpdate_u24lambda_u2d2 = this;
        final int n = 0;
        $this$onUpdate_u24lambda_u2d2.setUpdateAction(listener);
        return this;
    }
    
    @NotNull
    public final AbstractTextInput onActivate(@NotNull final Function1<? super String, Unit> listener) {
        Intrinsics.checkNotNullParameter((Object)listener, "listener");
        final AbstractTextInput $this$onActivate_u24lambda_u2d3 = this;
        final int n = 0;
        $this$onActivate_u24lambda_u2d3.setActivateAction(listener);
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
            final AbstractTextInput.ReplaceTextOperation replaceTextOperation = new AbstractTextInput.ReplaceTextOperation(this, addTextOperation, removeTextOperation);
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
        //    15: invokevirtual   gg/essential/vigilance/gui/common/input/AbstractTextInput$LinePosition.toTextualPos:()Lgg/essential/vigilance/gui/common/input/AbstractTextInput$LinePosition;
        //    18: astore_3        /* textPos */
        //    19: aload_0         /* this */
        //    20: getfield        gg/essential/vigilance/gui/common/input/AbstractTextInput.textualLines:Ljava/util/List;
        //    23: aload_3         /* textPos */
        //    24: invokevirtual   gg/essential/vigilance/gui/common/input/AbstractTextInput$LinePosition.getLine:()I
        //    27: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //    32: checkcast       Lgg/essential/vigilance/gui/common/input/AbstractTextInput$TextualLine;
        //    35: astore          textualLine
        //    37: aload_0         /* this */
        //    38: aload_1         /* newText */
        //    39: invokevirtual   gg/essential/vigilance/gui/common/input/AbstractTextInput.textToLines:(Ljava/lang/String;)Ljava/util/List;
        //    42: astore          lines
        //    44: nop            
        //    45: aload           lines
        //    47: invokeinterface java/util/List.isEmpty:()Z
        //    52: ifeq            56
        //    55: return         
        //    56: aload           lines
        //    58: invokeinterface java/util/List.size:()I
        //    63: iconst_1       
        //    64: if_icmpne       87
        //    67: aload           textualLine
        //    69: aload           lines
        //    71: invokestatic    kotlin/collections/CollectionsKt.first:(Ljava/util/List;)Ljava/lang/Object;
        //    74: checkcast       Ljava/lang/String;
        //    77: aload_3         /* textPos */
        //    78: invokevirtual   gg/essential/vigilance/gui/common/input/AbstractTextInput$LinePosition.getColumn:()I
        //    81: invokevirtual   gg/essential/vigilance/gui/common/input/AbstractTextInput$TextualLine.addTextAt:(Ljava/lang/String;I)V
        //    84: goto            390
        //    87: aload           lines
        //    89: checkcast       Ljava/lang/Iterable;
        //    92: iconst_1       
        //    93: invokestatic    kotlin/collections/CollectionsKt.drop:(Ljava/lang/Iterable;I)Ljava/util/List;
        //    96: checkcast       Ljava/lang/Iterable;
        //    99: astore          $this$map$iv
        //   101: iconst_0       
        //   102: istore          $i$f$map
        //   104: aload           $this$map$iv
        //   106: astore          9
        //   108: new             Ljava/util/ArrayList;
        //   111: dup            
        //   112: aload           $this$map$iv
        //   114: bipush          10
        //   116: invokestatic    kotlin/collections/CollectionsKt.collectionSizeOrDefault:(Ljava/lang/Iterable;I)I
        //   119: invokespecial   java/util/ArrayList.<init>:(I)V
        //   122: checkcast       Ljava/util/Collection;
        //   125: astore          destination$iv$iv
        //   127: iconst_0       
        //   128: istore          $i$f$mapTo
        //   130: aload           $this$mapTo$iv$iv
        //   132: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   137: astore          12
        //   139: aload           12
        //   141: invokeinterface java/util/Iterator.hasNext:()Z
        //   146: ifeq            197
        //   149: aload           12
        //   151: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   156: astore          item$iv$iv
        //   158: aload           destination$iv$iv
        //   160: aload           item$iv$iv
        //   162: checkcast       Ljava/lang/String;
        //   165: astore          14
        //   167: astore          16
        //   169: iconst_0       
        //   170: istore          $i$a$-map-AbstractTextInput$addText$newTextualLines$1
        //   172: new             Lgg/essential/vigilance/gui/common/input/AbstractTextInput$TextualLine;
        //   175: dup            
        //   176: aload_0         /* this */
        //   177: aload           it
        //   179: aconst_null    
        //   180: iconst_2       
        //   181: aconst_null    
        //   182: invokespecial   gg/essential/vigilance/gui/common/input/AbstractTextInput$TextualLine.<init>:(Lgg/essential/vigilance/gui/common/input/AbstractTextInput;Ljava/lang/String;Lkotlin/ranges/IntRange;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   185: aload           16
        //   187: swap           
        //   188: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //   193: pop            
        //   194: goto            139
        //   197: aload           destination$iv$iv
        //   199: checkcast       Ljava/util/List;
        //   202: nop            
        //   203: astore          newTextualLines
        //   205: aload_3         /* textPos */
        //   206: invokevirtual   gg/essential/vigilance/gui/common/input/AbstractTextInput$LinePosition.getColumn:()I
        //   209: aload           textualLine
        //   211: invokevirtual   gg/essential/vigilance/gui/common/input/AbstractTextInput$TextualLine.getText:()Ljava/lang/String;
        //   214: invokevirtual   java/lang/String.length:()I
        //   217: if_icmpge       352
        //   220: aload           textualLine
        //   222: invokevirtual   gg/essential/vigilance/gui/common/input/AbstractTextInput$TextualLine.getText:()Ljava/lang/String;
        //   225: astore          8
        //   227: aload_3         /* textPos */
        //   228: invokevirtual   gg/essential/vigilance/gui/common/input/AbstractTextInput$LinePosition.getColumn:()I
        //   231: istore          9
        //   233: aload           8
        //   235: dup            
        //   236: ifnonnull       250
        //   239: new             Ljava/lang/NullPointerException;
        //   242: dup            
        //   243: ldc_w           "null cannot be cast to non-null type java.lang.String"
        //   246: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
        //   249: athrow         
        //   250: iload           9
        //   252: invokevirtual   java/lang/String.substring:(I)Ljava/lang/String;
        //   255: dup            
        //   256: ldc_w           "(this as java.lang.String).substring(startIndex)"
        //   259: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   262: astore          textAfterInsertion
        //   264: aload           textualLine
        //   266: aload           textualLine
        //   268: invokevirtual   gg/essential/vigilance/gui/common/input/AbstractTextInput$TextualLine.getText:()Ljava/lang/String;
        //   271: astore          8
        //   273: iconst_0       
        //   274: istore          9
        //   276: aload_3         /* textPos */
        //   277: invokevirtual   gg/essential/vigilance/gui/common/input/AbstractTextInput$LinePosition.getColumn:()I
        //   280: istore          10
        //   282: aload           8
        //   284: dup            
        //   285: ifnonnull       299
        //   288: new             Ljava/lang/NullPointerException;
        //   291: dup            
        //   292: ldc_w           "null cannot be cast to non-null type java.lang.String"
        //   295: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
        //   298: athrow         
        //   299: iload           9
        //   301: iload           10
        //   303: invokevirtual   java/lang/String.substring:(II)Ljava/lang/String;
        //   306: dup            
        //   307: ldc_w           "(this as java.lang.Strin\u2026ing(startIndex, endIndex)"
        //   310: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   313: aload           lines
        //   315: invokestatic    kotlin/collections/CollectionsKt.first:(Ljava/util/List;)Ljava/lang/Object;
        //   318: invokestatic    kotlin/jvm/internal/Intrinsics.stringPlus:(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
        //   321: invokevirtual   gg/essential/vigilance/gui/common/input/AbstractTextInput$TextualLine.setText:(Ljava/lang/String;)V
        //   324: aload           newTextualLines
        //   326: invokestatic    kotlin/collections/CollectionsKt.last:(Ljava/util/List;)Ljava/lang/Object;
        //   329: checkcast       Lgg/essential/vigilance/gui/common/input/AbstractTextInput$TextualLine;
        //   332: astore          8
        //   334: aload           8
        //   336: aload           8
        //   338: invokevirtual   gg/essential/vigilance/gui/common/input/AbstractTextInput$TextualLine.getText:()Ljava/lang/String;
        //   341: aload           textAfterInsertion
        //   343: invokestatic    kotlin/jvm/internal/Intrinsics.stringPlus:(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
        //   346: invokevirtual   gg/essential/vigilance/gui/common/input/AbstractTextInput$TextualLine.setText:(Ljava/lang/String;)V
        //   349: goto            369
        //   352: aload           textualLine
        //   354: aload           lines
        //   356: invokestatic    kotlin/collections/CollectionsKt.first:(Ljava/util/List;)Ljava/lang/Object;
        //   359: checkcast       Ljava/lang/String;
        //   362: aload_3         /* textPos */
        //   363: invokevirtual   gg/essential/vigilance/gui/common/input/AbstractTextInput$LinePosition.getColumn:()I
        //   366: invokevirtual   gg/essential/vigilance/gui/common/input/AbstractTextInput$TextualLine.addTextAt:(Ljava/lang/String;I)V
        //   369: aload_0         /* this */
        //   370: getfield        gg/essential/vigilance/gui/common/input/AbstractTextInput.textualLines:Ljava/util/List;
        //   373: aload_3         /* textPos */
        //   374: invokevirtual   gg/essential/vigilance/gui/common/input/AbstractTextInput$LinePosition.getLine:()I
        //   377: iconst_1       
        //   378: iadd           
        //   379: aload           newTextualLines
        //   381: checkcast       Ljava/util/Collection;
        //   384: invokeinterface java/util/List.addAll:(ILjava/util/Collection;)Z
        //   389: pop            
        //   390: aload_0         /* this */
        //   391: invokevirtual   gg/essential/vigilance/gui/common/input/AbstractTextInput.recalculateAllVisualLines:()V
        //   394: aload_0         /* this */
        //   395: aload_3         /* textPos */
        //   396: aload_1         /* newText */
        //   397: invokevirtual   java/lang/String.length:()I
        //   400: invokevirtual   gg/essential/vigilance/gui/common/input/AbstractTextInput$LinePosition.offsetColumn:(I)Lgg/essential/vigilance/gui/common/input/AbstractTextInput$LinePosition;
        //   403: invokevirtual   gg/essential/vigilance/gui/common/input/AbstractTextInput$LinePosition.toVisualPos:()Lgg/essential/vigilance/gui/common/input/AbstractTextInput$LinePosition;
        //   406: invokespecial   gg/essential/vigilance/gui/common/input/AbstractTextInput.setCursorPosition:(Lgg/essential/vigilance/gui/common/input/AbstractTextInput$LinePosition;)V
        //   409: aload_0         /* this */
        //   410: getfield        gg/essential/vigilance/gui/common/input/AbstractTextInput.updateAction:Lkotlin/jvm/functions/Function1;
        //   413: aload_0         /* this */
        //   414: invokevirtual   gg/essential/vigilance/gui/common/input/AbstractTextInput.getText:()Ljava/lang/String;
        //   417: invokeinterface kotlin/jvm/functions/Function1.invoke:(Ljava/lang/Object;)Ljava/lang/Object;
        //   422: pop            
        //   423: aload_0         /* this */
        //   424: getfield        gg/essential/vigilance/gui/common/input/AbstractTextInput.textState:Lgg/essential/elementa/state/BasicState;
        //   427: aload_0         /* this */
        //   428: invokevirtual   gg/essential/vigilance/gui/common/input/AbstractTextInput.getText:()Ljava/lang/String;
        //   431: invokevirtual   gg/essential/elementa/state/BasicState.set:(Ljava/lang/Object;)V
        //   434: return         
        //    MethodParameters:
        //  Name      Flags  
        //  --------  -----
        //  newText   
        //  position  
        //    StackMapTable: 00 09 FE 00 38 07 00 EC 07 00 F0 07 02 C2 1E FF 00 33 00 0D 07 00 02 07 02 D3 07 00 EC 07 00 EC 07 00 F0 07 02 C2 00 07 02 DC 01 07 02 DC 07 02 EA 01 07 02 F0 00 00 39 FF 00 34 00 0D 07 00 02 07 02 D3 07 00 EC 07 00 EC 07 00 F0 07 02 C2 07 02 C2 07 02 DC 07 02 D3 01 07 02 EA 01 07 02 F0 00 01 07 02 D3 FF 00 30 00 0D 07 00 02 07 02 D3 07 00 EC 07 00 EC 07 00 F0 07 02 C2 07 02 C2 07 02 D3 07 02 D3 01 01 01 07 02 F0 00 02 07 00 F0 07 02 D3 FF 00 34 00 0D 07 00 02 07 02 D3 07 00 EC 07 00 EC 07 00 F0 07 02 C2 07 02 C2 07 02 DC 01 07 02 DC 07 02 EA 01 07 02 F0 00 00 FF 00 10 00 0D 07 00 02 07 02 D3 07 00 EC 07 00 EC 07 00 F0 07 02 C2 07 02 C2 07 03 1F 00 00 00 01 07 02 F0 00 00 FF 00 14 00 06 07 00 02 07 02 D3 07 00 EC 07 00 EC 07 00 F0 07 02 C2 00 00
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    protected void recalculateVisualLinesFor(final int textualLineIndex) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        gg/essential/vigilance/gui/common/input/AbstractTextInput.textualLines:Ljava/util/List;
        //     4: iload_1         /* textualLineIndex */
        //     5: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //    10: checkcast       Lgg/essential/vigilance/gui/common/input/AbstractTextInput$TextualLine;
        //    13: astore_2        /* textualLine */
        //    14: aload_2         /* textualLine */
        //    15: invokevirtual   gg/essential/vigilance/gui/common/input/AbstractTextInput$TextualLine.getVisualIndices:()Lkotlin/ranges/IntRange;
        //    18: invokevirtual   kotlin/ranges/IntRange.getFirst:()I
        //    21: istore_3        /* firstVisualIndex */
        //    22: aload_2         /* textualLine */
        //    23: invokevirtual   gg/essential/vigilance/gui/common/input/AbstractTextInput$TextualLine.getVisualIndices:()Lkotlin/ranges/IntRange;
        //    26: checkcast       Ljava/lang/Iterable;
        //    29: invokestatic    kotlin/collections/CollectionsKt.count:(Ljava/lang/Iterable;)I
        //    32: istore          4
        //    34: iconst_0       
        //    35: istore          5
        //    37: iload           4
        //    39: istore          6
        //    41: iload           5
        //    43: iload           6
        //    45: if_icmpge       86
        //    48: iload           5
        //    50: istore          it
        //    52: iconst_0       
        //    53: istore          $i$a$-repeat-AbstractTextInput$recalculateVisualLinesFor$1
        //    55: iload_3         /* firstVisualIndex */
        //    56: aload_0         /* this */
        //    57: invokevirtual   gg/essential/vigilance/gui/common/input/AbstractTextInput.getVisualLines:()Ljava/util/List;
        //    60: invokeinterface java/util/List.size:()I
        //    65: if_icmpge       79
        //    68: aload_0         /* this */
        //    69: invokevirtual   gg/essential/vigilance/gui/common/input/AbstractTextInput.getVisualLines:()Ljava/util/List;
        //    72: iload_3         /* firstVisualIndex */
        //    73: invokeinterface java/util/List.remove:(I)Ljava/lang/Object;
        //    78: pop            
        //    79: nop            
        //    80: iinc            5, 1
        //    83: goto            41
        //    86: aload_0         /* this */
        //    87: aload_2         /* textualLine */
        //    88: invokevirtual   gg/essential/vigilance/gui/common/input/AbstractTextInput$TextualLine.getText:()Ljava/lang/String;
        //    91: aload_0         /* this */
        //    92: invokevirtual   gg/essential/vigilance/gui/common/input/AbstractTextInput.getWidth:()F
        //    95: invokevirtual   gg/essential/vigilance/gui/common/input/AbstractTextInput.splitTextForWrapping:(Ljava/lang/String;F)Ljava/util/List;
        //    98: astore          splitLines
        //   100: aload_0         /* this */
        //   101: getfield        gg/essential/vigilance/gui/common/input/AbstractTextInput.visualLines:Ljava/util/List;
        //   104: iload_3         /* firstVisualIndex */
        //   105: aload           splitLines
        //   107: checkcast       Ljava/lang/Iterable;
        //   110: astore          5
        //   112: istore          15
        //   114: astore          14
        //   116: iconst_0       
        //   117: istore          $i$f$map
        //   119: aload           $this$map$iv
        //   121: astore          7
        //   123: new             Ljava/util/ArrayList;
        //   126: dup            
        //   127: aload           $this$map$iv
        //   129: bipush          10
        //   131: invokestatic    kotlin/collections/CollectionsKt.collectionSizeOrDefault:(Ljava/lang/Iterable;I)I
        //   134: invokespecial   java/util/ArrayList.<init>:(I)V
        //   137: checkcast       Ljava/util/Collection;
        //   140: astore          destination$iv$iv
        //   142: iconst_0       
        //   143: istore          $i$f$mapTo
        //   145: aload           $this$mapTo$iv$iv
        //   147: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   152: astore          10
        //   154: aload           10
        //   156: invokeinterface java/util/Iterator.hasNext:()Z
        //   161: ifeq            210
        //   164: aload           10
        //   166: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   171: astore          item$iv$iv
        //   173: aload           destination$iv$iv
        //   175: aload           item$iv$iv
        //   177: checkcast       Ljava/lang/String;
        //   180: astore          12
        //   182: astore          16
        //   184: iconst_0       
        //   185: istore          $i$a$-map-AbstractTextInput$recalculateVisualLinesFor$2
        //   187: new             Lgg/essential/vigilance/gui/common/input/AbstractTextInput$VisualLine;
        //   190: dup            
        //   191: aload_0         /* this */
        //   192: aload           it
        //   194: iload_1         /* textualLineIndex */
        //   195: invokespecial   gg/essential/vigilance/gui/common/input/AbstractTextInput$VisualLine.<init>:(Lgg/essential/vigilance/gui/common/input/AbstractTextInput;Ljava/lang/String;I)V
        //   198: aload           16
        //   200: swap           
        //   201: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //   206: pop            
        //   207: goto            154
        //   210: aload           destination$iv$iv
        //   212: checkcast       Ljava/util/List;
        //   215: nop            
        //   216: astore          16
        //   218: aload           14
        //   220: iload           15
        //   222: aload           16
        //   224: checkcast       Ljava/util/Collection;
        //   227: invokeinterface java/util/List.addAll:(ILjava/util/Collection;)Z
        //   232: pop            
        //   233: aload_2         /* textualLine */
        //   234: iload_3         /* firstVisualIndex */
        //   235: iload_3         /* firstVisualIndex */
        //   236: aload           splitLines
        //   238: invokeinterface java/util/List.size:()I
        //   243: iadd           
        //   244: invokestatic    kotlin/ranges/RangesKt.until:(II)Lkotlin/ranges/IntRange;
        //   247: invokevirtual   gg/essential/vigilance/gui/common/input/AbstractTextInput$TextualLine.setVisualIndices:(Lkotlin/ranges/IntRange;)V
        //   250: return         
        //    MethodParameters:
        //  Name              Flags  
        //  ----------------  -----
        //  textualLineIndex  
        //    StackMapTable: 00 05 FF 00 29 00 07 07 00 02 01 07 00 F0 01 01 01 01 00 00 FD 00 25 01 01 F9 00 06 FF 00 43 00 10 07 00 02 01 07 00 F0 01 07 02 C2 07 02 DC 01 07 02 DC 07 02 EA 01 07 02 F0 00 00 00 07 02 C2 01 00 00 37
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    protected void recalculateAllVisualLines() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        gg/essential/vigilance/gui/common/input/AbstractTextInput.visualLines:Ljava/util/List;
        //     4: invokeinterface java/util/List.clear:()V
        //     9: aload_0         /* this */
        //    10: getfield        gg/essential/vigilance/gui/common/input/AbstractTextInput.textualLines:Ljava/util/List;
        //    13: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //    18: astore_1       
        //    19: iconst_0       
        //    20: istore_2       
        //    21: aload_1        
        //    22: invokeinterface java/util/Iterator.hasNext:()Z
        //    27: ifeq            228
        //    30: iload_2        
        //    31: istore_3        /* index */
        //    32: iload_2        
        //    33: iconst_1       
        //    34: iadd           
        //    35: istore_2       
        //    36: aload_1        
        //    37: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    42: checkcast       Lgg/essential/vigilance/gui/common/input/AbstractTextInput$TextualLine;
        //    45: astore          textualLine
        //    47: aload_0         /* this */
        //    48: aload           textualLine
        //    50: invokevirtual   gg/essential/vigilance/gui/common/input/AbstractTextInput$TextualLine.getText:()Ljava/lang/String;
        //    53: aload_0         /* this */
        //    54: invokevirtual   gg/essential/vigilance/gui/common/input/AbstractTextInput.getWidth:()F
        //    57: invokevirtual   gg/essential/vigilance/gui/common/input/AbstractTextInput.splitTextForWrapping:(Ljava/lang/String;F)Ljava/util/List;
        //    60: astore          splitLines
        //    62: aload           textualLine
        //    64: new             Lkotlin/ranges/IntRange;
        //    67: dup            
        //    68: aload_0         /* this */
        //    69: getfield        gg/essential/vigilance/gui/common/input/AbstractTextInput.visualLines:Ljava/util/List;
        //    72: invokeinterface java/util/List.size:()I
        //    77: aload_0         /* this */
        //    78: getfield        gg/essential/vigilance/gui/common/input/AbstractTextInput.visualLines:Ljava/util/List;
        //    81: invokeinterface java/util/List.size:()I
        //    86: aload           splitLines
        //    88: invokeinterface java/util/List.size:()I
        //    93: iadd           
        //    94: invokespecial   kotlin/ranges/IntRange.<init>:(II)V
        //    97: invokevirtual   gg/essential/vigilance/gui/common/input/AbstractTextInput$TextualLine.setVisualIndices:(Lkotlin/ranges/IntRange;)V
        //   100: aload_0         /* this */
        //   101: getfield        gg/essential/vigilance/gui/common/input/AbstractTextInput.visualLines:Ljava/util/List;
        //   104: aload           splitLines
        //   106: checkcast       Ljava/lang/Iterable;
        //   109: astore          6
        //   111: astore          15
        //   113: iconst_0       
        //   114: istore          $i$f$map
        //   116: aload           $this$map$iv
        //   118: astore          8
        //   120: new             Ljava/util/ArrayList;
        //   123: dup            
        //   124: aload           $this$map$iv
        //   126: bipush          10
        //   128: invokestatic    kotlin/collections/CollectionsKt.collectionSizeOrDefault:(Ljava/lang/Iterable;I)I
        //   131: invokespecial   java/util/ArrayList.<init>:(I)V
        //   134: checkcast       Ljava/util/Collection;
        //   137: astore          destination$iv$iv
        //   139: iconst_0       
        //   140: istore          $i$f$mapTo
        //   142: aload           $this$mapTo$iv$iv
        //   144: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   149: astore          11
        //   151: aload           11
        //   153: invokeinterface java/util/Iterator.hasNext:()Z
        //   158: ifeq            207
        //   161: aload           11
        //   163: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   168: astore          item$iv$iv
        //   170: aload           destination$iv$iv
        //   172: aload           item$iv$iv
        //   174: checkcast       Ljava/lang/String;
        //   177: astore          13
        //   179: astore          16
        //   181: iconst_0       
        //   182: istore          $i$a$-map-AbstractTextInput$recalculateAllVisualLines$1
        //   184: new             Lgg/essential/vigilance/gui/common/input/AbstractTextInput$VisualLine;
        //   187: dup            
        //   188: aload_0         /* this */
        //   189: aload           it
        //   191: iload_3         /* index */
        //   192: invokespecial   gg/essential/vigilance/gui/common/input/AbstractTextInput$VisualLine.<init>:(Lgg/essential/vigilance/gui/common/input/AbstractTextInput;Ljava/lang/String;I)V
        //   195: aload           16
        //   197: swap           
        //   198: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //   203: pop            
        //   204: goto            151
        //   207: aload           destination$iv$iv
        //   209: checkcast       Ljava/util/List;
        //   212: nop            
        //   213: aload           15
        //   215: swap           
        //   216: checkcast       Ljava/util/Collection;
        //   219: invokeinterface java/util/List.addAll:(Ljava/util/Collection;)Z
        //   224: pop            
        //   225: goto            21
        //   228: return         
        //    StackMapTable: 00 04 FD 00 15 07 02 F0 01 FF 00 81 00 10 07 00 02 07 02 F0 01 01 07 00 F0 07 02 C2 07 02 DC 01 07 02 DC 07 02 EA 01 07 02 F0 00 00 00 07 02 C2 00 00 37 FF 00 14 00 03 07 00 02 07 02 F0 01 00 00
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
        final String text = ((Line)startTextualLine).getText();
        final int beginIndex = 0;
        final int column = textualStartPos.getColumn();
        final String s = text;
        if (s == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        final String substring = s.substring(beginIndex, column);
        Intrinsics.checkNotNullExpressionValue((Object)substring, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
        final String text2 = ((Line)endTextualLine).getText();
        final int column2 = textualEndPos.getColumn();
        final String s2 = text2;
        if (s2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        final String substring2 = s2.substring(column2);
        Intrinsics.checkNotNullExpressionValue((Object)substring2, "(this as java.lang.String).substring(startIndex)");
        ((Line)textualLine).setText(Intrinsics.stringPlus(substring, (Object)substring2));
        final int firstItemToDelete = textualStartPos.getLine() + 1;
        for (int n = textualEndPos.getLine() - firstItemToDelete + 1, i = 0; i < n; ++i) {
            final int it = i;
            final int n2 = 0;
            this.getTextualLines().remove(firstItemToDelete);
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
        final int n = 0;
        this.setCursor($this$setCursorPosition_u24lambda_u2d9);
        this.setOtherSelectionEnd($this$setCursorPosition_u24lambda_u2d9);
        this.setCursorNeedsRefocus(true);
    }
    
    @NotNull
    protected String getTextBetween(@NotNull final LinePosition startPos, @NotNull final LinePosition endPos) {
        Intrinsics.checkNotNullParameter((Object)startPos, "startPos");
        Intrinsics.checkNotNullParameter((Object)endPos, "endPos");
        final LinePosition textStart = startPos.toTextualPos();
        final LinePosition textEnd = endPos.toTextualPos();
        String s2;
        if (textStart.getLine() == textEnd.getLine()) {
            final String text = ((Line)this.textualLines.get(textStart.getLine())).getText();
            final int column = textStart.getColumn();
            final int column2 = textEnd.getColumn();
            final String s = text;
            if (s == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            Intrinsics.checkNotNullExpressionValue((Object)(s2 = s.substring(column, column2)), "(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
        }
        else {
            final List list;
            final List lines = list = new ArrayList();
            final String text2 = ((Line)this.textualLines.get(textStart.getLine())).getText();
            final int column3 = textStart.getColumn();
            final String s3 = text2;
            if (s3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            final String substring = s3.substring(column3);
            Intrinsics.checkNotNullExpressionValue((Object)substring, "(this as java.lang.String).substring(startIndex)");
            list.add(substring);
            int j = textStart.getLine() + 1;
            while (j < textEnd.getLine()) {
                final int i = j;
                ++j;
                lines.add(((Line)this.textualLines.get(i)).getText());
            }
            final List list2 = lines;
            final String text3 = ((Line)this.textualLines.get(textEnd.getLine())).getText();
            final int beginIndex = 0;
            final int column4 = textEnd.getColumn();
            final String s4 = text3;
            if (s4 == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            final String substring2 = s4.substring(beginIndex, column4);
            Intrinsics.checkNotNullExpressionValue((Object)substring2, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
            list2.add(substring2);
            s2 = CollectionsKt.joinToString$default((Iterable)lines, (CharSequence)"\n", (CharSequence)null, (CharSequence)null, 0, (CharSequence)null, (Function1)null, 62, (Object)null);
        }
        return s2;
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
        final int n = 0;
        return it.isAtAbsoluteStart() ? null : (it.isAtLineStart() ? Character.valueOf('\n') : Character.valueOf(((Line)this.getTextualLines().get(it.getLine())).getText().charAt(it.getColumn() - 1)));
    }
    
    @Nullable
    protected Character charAfter(@NotNull final LinePosition pos) {
        Intrinsics.checkNotNullParameter((Object)pos, "pos");
        final LinePosition it = pos.toTextualPos();
        final int n = 0;
        return it.isAtAbsoluteEnd() ? null : (it.isAtLineEnd() ? Character.valueOf('\n') : Character.valueOf(((Line)this.getTextualLines().get(it.getLine())).getText().charAt(it.getColumn())));
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
            if (c == null) {
                b = false;
            }
            else {
                final char p0 = c;
                final int n = 0;
                b = this.isBreakingCharacter(p0);
            }
            if (!b) {
                break;
            }
            textualPos = textualPos.offsetColumn(columnOffset);
            final Character c2;
            ch = (c2 = (Character)((Function1)nextChar).invoke((Object)textualPos));
            final char c3 = '\n';
            if (c2 == null) {
                continue;
            }
            if (c2 == c3) {
                return textualPos;
            }
        }
        while (!(boolean)atEndOfDirection.invoke()) {
            final Character c4 = ch;
            boolean b2;
            if (c4 == null) {
                b2 = false;
            }
            else {
                final char p0 = c4;
                final int n2 = 0;
                b2 = !this.isBreakingCharacter(p0);
            }
            if (!b2) {
                break;
            }
            textualPos = textualPos.offsetColumn(columnOffset);
            final Character c5;
            ch = (c5 = (Character)((Function1)nextChar).invoke((Object)textualPos));
            final char c6 = '\n';
            if (c5 == null) {
                continue;
            }
            if (c5 == c6) {
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
        final UIComponent $this$animate$iv = this.cursorComponent;
        final int $i$f$animate = 0;
        final UIComponent $this$animate_u24lambda_u2d0$iv = $this$animate$iv;
        final int n = 0;
        final AnimatingConstraints $this$animateCursor_u24lambda_u2d13;
        final AnimatingConstraints anim$iv = $this$animateCursor_u24lambda_u2d13 = $this$animate_u24lambda_u2d0$iv.makeAnimation();
        final int n2 = 0;
        AnimatingConstraints.setColorAnimation$default($this$animateCursor_u24lambda_u2d13, Animations.OUT_CIRCULAR, 0.5f, UtilitiesKt.toConstraint(this.getCursorColor()), 0.0f, 8, null);
        $this$animateCursor_u24lambda_u2d13.onComplete((Function0<Unit>)new AbstractTextInput$animateCursor$1.AbstractTextInput$animateCursor$1$1(this));
        $this$animate_u24lambda_u2d0$iv.animateTo(anim$iv);
    }
    
    protected boolean hasText() {
        return this.textualLines.size() > 1 || ((Line)this.textualLines.get(0)).getText().length() > 0;
    }
    
    @Deprecated(message = "For 1.17 this method requires you pass a UMatrixStack as the first argument.\n\nIf you are currently extending this method, you should instead extend the method with the added argument.\nNote however for this to be non-breaking, your parent class needs to transition before you do.\n\nIf you are calling this method and you cannot guarantee that your target class has been fully updated (such as when\ncalling an open method on an open class), you should instead call the method with the \"Compat\" suffix, which will\ncall both methods, the new and the deprecated one.\nIf you are sure that your target class has been updated (such as when calling the super method), you should\n(for super calls you must!) instead just call the method with the original name and added argument.", replaceWith = @ReplaceWith(expression = "drawUnselectedText(matrixStack, text, left, row)", imports = {}))
    @java.lang.Deprecated
    protected void drawUnselectedText(@NotNull final String text, final float left, final int row) {
        Intrinsics.checkNotNullParameter((Object)text, "text");
        drawUnselectedText$default(this, UMatrixStack.Compat.INSTANCE.get(), text, left, row, null, false, null, 112, null);
    }
    
    protected final void drawUnselectedTextCompat(@NotNull final UMatrixStack matrixStack, @NotNull final String text, final float left, final int row) {
        Intrinsics.checkNotNullParameter((Object)matrixStack, "matrixStack");
        Intrinsics.checkNotNullParameter((Object)text, "text");
        UMatrixStack.Compat.INSTANCE.runLegacyMethod(matrixStack, (kotlin.jvm.functions.Function0<?>)new AbstractTextInput$drawUnselectedTextCompat.AbstractTextInput$drawUnselectedTextCompat$1(this, text, left, row));
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
        fontProvider.drawString(matrixStack, text, color2, left - this.horizontalScrollingOffset, this.getTop() + (this.lineHeight * row + 1) * this.getTextScale() + this.verticalScrollingOffset, 10.0f, this.getTextScale(), shadow, shadowColor);
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
    
    @Deprecated(message = "For 1.17 this method requires you pass a UMatrixStack as the first argument.\n\nIf you are currently extending this method, you should instead extend the method with the added argument.\nNote however for this to be non-breaking, your parent class needs to transition before you do.\n\nIf you are calling this method and you cannot guarantee that your target class has been fully updated (such as when\ncalling an open method on an open class), you should instead call the method with the \"Compat\" suffix, which will\ncall both methods, the new and the deprecated one.\nIf you are sure that your target class has been updated (such as when calling the super method), you should\n(for super calls you must!) instead just call the method with the original name and added argument.", replaceWith = @ReplaceWith(expression = "drawSelectedText(matrixStack, text, left, right, row)", imports = {}))
    @java.lang.Deprecated
    protected void drawSelectedText(@NotNull final String text, final float left, final float right, final int row) {
        Intrinsics.checkNotNullParameter((Object)text, "text");
        this.drawSelectedText(UMatrixStack.Compat.INSTANCE.get(), text, left, right, row);
    }
    
    protected final void drawSelectedTextCompat(@NotNull final UMatrixStack matrixStack, @NotNull final String text, final float left, final float right, final int row) {
        Intrinsics.checkNotNullParameter((Object)matrixStack, "matrixStack");
        Intrinsics.checkNotNullParameter((Object)text, "text");
        UMatrixStack.Compat.INSTANCE.runLegacyMethod(matrixStack, (kotlin.jvm.functions.Function0<?>)new AbstractTextInput$drawSelectedTextCompat.AbstractTextInput$drawSelectedTextCompat$1(this, text, left, right, row));
    }
    
    protected void drawSelectedText(@NotNull final UMatrixStack matrixStack, @NotNull final String text, final float left, final float right, final int row) {
        Intrinsics.checkNotNullParameter((Object)matrixStack, "matrixStack");
        Intrinsics.checkNotNullParameter((Object)text, "text");
        UIBlock.Companion.drawBlock(matrixStack, this.active ? this.selectionBackgroundColor : this.inactiveSelectionBackgroundColor, left - (double)this.horizontalScrollingOffset, this.getTop() + (double)(this.lineHeight * row * this.getTextScale()) + this.verticalScrollingOffset, right - (double)this.horizontalScrollingOffset, this.getTop() + (double)(this.lineHeight * ((row + 1) * this.getTextScale())) + this.verticalScrollingOffset);
        if (text.length() > 0) {
            FontProvider.drawString$default(this.getFontProvider(), matrixStack, text, this.active ? this.selectionForegroundColor : this.inactiveSelectionForegroundColor, left - this.horizontalScrollingOffset, this.getTop() + (this.lineHeight * row + 1) * this.getTextScale() + this.verticalScrollingOffset, 10.0f, this.getTextScale(), this.contentShadow, null, 256, null);
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
    
    public static final /* synthetic */ void access$removeText(final AbstractTextInput $this, final LinePosition startPos, final LinePosition endPos) {
        $this.removeText(startPos, endPos);
    }
    
    public static final /* synthetic */ void access$setCursorPosition(final AbstractTextInput $this, final LinePosition newPosition) {
        $this.setCursorPosition(newPosition);
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007" }, d2 = { "Lgg/essential/vigilance/gui/common/input/AbstractTextInput$SelectionMode;", "", "(Ljava/lang/String;I)V", "None", "Character", "Word", "Line", "Vigilance" })
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
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0084\u0004\u0018\u00002\f\u0012\b\u0012\u00060\u0000R\u00020\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0015\u0010\u0016\u001a\u00020\u00042\n\u0010\u0017\u001a\u00060\u0000R\u00020\u0002H\u0096\u0002J\u0018\u0010\u0018\u001a\u00060\u0000R\u00020\u00022\n\u0010\u0019\u001a\u00060\u0000R\u00020\u0002H\u0002J\u0018\u0010\u001a\u001a\u00060\u0000R\u00020\u00022\n\u0010\u0019\u001a\u00060\u0000R\u00020\u0002H\u0002J\u0013\u0010\u001b\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u001cH\u0096\u0002J\b\u0010\u001d\u001a\u00020\u0004H\u0016J\u0012\u0010\u001e\u001a\u00060\u0000R\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u0004J!\u0010 \u001a\u00060\u0000R\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u00042\n\u0010\u0019\u001a\u00060\u0000R\u00020\u0002H\u0082\u0010J!\u0010!\u001a\u00060\u0000R\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u00042\n\u0010\u0019\u001a\u00060\u0000R\u00020\u0002H\u0082\u0010J\u0018\u0010\"\u001a\u00060\u0000R\u00020\u00022\n\u0010\u0019\u001a\u00060\u0000R\u00020\u0002H\u0002J\u0018\u0010#\u001a\u00060\u0000R\u00020\u00022\n\u0010\u0019\u001a\u00060\u0000R\u00020\u0002H\u0002J\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020&0%J\b\u0010'\u001a\u00020(H\u0016J\n\u0010)\u001a\u00060\u0000R\u00020\u0002J\n\u0010*\u001a\u00060\u0000R\u00020\u0002J\u0012\u0010+\u001a\u00060\u0000R\u00020\u00022\u0006\u0010,\u001a\u00020\u0004R\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\r\u0010\fR\u0011\u0010\u000e\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u000f\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0010\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\u0011\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\fR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\nR\u0018\u0010\u0013\u001a\f\u0012\b\u0012\u00060\u0015R\u00020\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006-" }, d2 = { "Lgg/essential/vigilance/gui/common/input/AbstractTextInput$LinePosition;", "", "Lgg/essential/vigilance/gui/common/input/AbstractTextInput;", "line", "", "column", "isVisual", "", "(Lgg/essential/vigilance/gui/common/input/AbstractTextInput;IIZ)V", "getColumn", "()I", "isAtAbsoluteEnd", "()Z", "isAtAbsoluteStart", "isAtLineEnd", "isAtLineStart", "isInFirstLine", "isInLastLine", "getLine", "lines", "", "Lgg/essential/vigilance/gui/common/input/AbstractTextInput$Line;", "compareTo", "other", "complexOffsetColumnNegative", "pos", "complexOffsetColumnPositive", "equals", "", "hashCode", "offsetColumn", "amount", "offsetColumnNegative", "offsetColumnPositive", "simpleOffsetColumnNegative", "simpleOffsetColumnPositive", "toScreenPos", "Lkotlin/Pair;", "", "toString", "", "toTextualPos", "toVisualPos", "withColumn", "newColumn", "Vigilance" })
    protected final class LinePosition implements Comparable<LinePosition>
    {
        private final int line;
        private final int column;
        private final boolean isVisual;
        @NotNull
        private final List<Line> lines;
        final /* synthetic */ AbstractTextInput this$0;
        
        public LinePosition(final AbstractTextInput this$0, final int line, final int column, final boolean isVisual) {
            Intrinsics.checkNotNullParameter((Object)this$0, "this$0");
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
        
        public final boolean isVisual() {
            return this.isVisual;
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
            LinePosition complexOffsetColumnNegative = pos;
            LinePosition pos2;
            while (true) {
                final LinePosition linePosition2 = linePosition;
                final int n2 = n;
                pos2 = complexOffsetColumnNegative;
                if (n2 == 0 || pos2.isAtAbsoluteStart()) {
                    break;
                }
                linePosition = linePosition2;
                n = n2 - 1;
                complexOffsetColumnNegative = linePosition2.complexOffsetColumnNegative(pos2);
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
            LinePosition complexOffsetColumnPositive = pos;
            LinePosition pos2;
            while (true) {
                final LinePosition linePosition2 = linePosition;
                final int n2 = n;
                pos2 = complexOffsetColumnPositive;
                if (n2 == 0 || pos2.isAtAbsoluteEnd()) {
                    break;
                }
                linePosition = linePosition2;
                n = n2 - 1;
                complexOffsetColumnPositive = linePosition2.complexOffsetColumnPositive(pos2);
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
            int i;
            for (int j = textualLine.getVisualIndices().getFirst(); j < this.line; ++j, totalVisualLength += ((Line)this.this$0.getVisualLines().get(i)).getLength()) {
                i = j;
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
            int first = visualIndices.getFirst();
            final int last = visualIndices.getLast();
            if (first <= last) {
                int visualLineIndex;
                do {
                    visualLineIndex = first;
                    ++first;
                    final VisualLine visualLine = this.this$0.getVisualLines().get(visualLineIndex);
                    if (((Line)visualLine).getLength() >= lengthRemaining) {
                        return this.this$0.new LinePosition(visualLineIndex, lengthRemaining, true);
                    }
                    lengthRemaining -= ((Line)visualLine).getLength();
                } while (visualLineIndex != last);
            }
            System.out.println((Object)"toTextualPos: Unexpected end of function");
            return this.this$0.new LinePosition(0, 0, true);
        }
        
        @NotNull
        public final Pair<Float, Float> toScreenPos() {
            final LinePosition visualPos = this.toVisualPos();
            final String text = ((Line)this.this$0.getVisualLines().get(visualPos.line)).getText();
            final int beginIndex = 0;
            final int column = visualPos.column;
            final String s = text;
            if (s == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            final String substring = s.substring(beginIndex, column);
            Intrinsics.checkNotNullExpressionValue((Object)substring, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
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
            return "LinePosition(line=" + this.line + ", column=" + this.column + ", isVisual=" + this.isVisual + ')';
        }
        
        @Override
        public /* bridge */ int compareTo(final Object other) {
            return this.compareTo((LinePosition)other);
        }
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0094\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\r" }, d2 = { "Lgg/essential/vigilance/gui/common/input/AbstractTextInput$Line;", "", "text", "", "(Lgg/essential/vigilance/gui/common/input/AbstractTextInput;Ljava/lang/String;)V", "length", "", "getLength", "()I", "getText", "()Ljava/lang/String;", "setText", "(Ljava/lang/String;)V", "Vigilance" })
    protected class Line
    {
        @NotNull
        private String text;
        final /* synthetic */ AbstractTextInput this$0;
        
        public Line(@NotNull final AbstractTextInput this$0, final String text) {
            Intrinsics.checkNotNullParameter((Object)this$0, "this$0");
            Intrinsics.checkNotNullParameter((Object)text, "text");
            this.this$0 = this$0;
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
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0084\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0010J\b\u0010\u0011\u001a\u00020\u0004H\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u0012" }, d2 = { "Lgg/essential/vigilance/gui/common/input/AbstractTextInput$TextualLine;", "Lgg/essential/vigilance/gui/common/input/AbstractTextInput$Line;", "Lgg/essential/vigilance/gui/common/input/AbstractTextInput;", "text", "", "visualIndices", "Lkotlin/ranges/IntRange;", "(Lgg/essential/vigilance/gui/common/input/AbstractTextInput;Ljava/lang/String;Lkotlin/ranges/IntRange;)V", "getVisualIndices", "()Lkotlin/ranges/IntRange;", "setVisualIndices", "(Lkotlin/ranges/IntRange;)V", "addTextAt", "", "newText", "column", "", "toString", "Vigilance" })
    protected final class TextualLine extends Line
    {
        @NotNull
        private IntRange visualIndices;
        final /* synthetic */ AbstractTextInput this$0;
        
        public TextualLine(@NotNull final AbstractTextInput this$0, @NotNull final String text, final IntRange visualIndices) {
            Intrinsics.checkNotNullParameter((Object)this$0, "this$0");
            Intrinsics.checkNotNullParameter((Object)text, "text");
            Intrinsics.checkNotNullParameter((Object)visualIndices, "visualIndices");
            this.this$0 = this$0;
            this$0.super(text);
            this.visualIndices = visualIndices;
        }
        
        public TextualLine(final AbstractTextInput abstractTextInput, final String text, IntRange visualIndices, final int n, final DefaultConstructorMarker defaultConstructorMarker) {
            this.this$0 = abstractTextInput;
            if ((n & 0x2) != 0x0) {
                visualIndices = new IntRange(0, 0);
            }
            this(abstractTextInput, text, visualIndices);
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
                ((Line)this).setText(Intrinsics.stringPlus(((Line)this).getText(), (Object)newText));
            }
            else {
                final StringBuilder sb = new StringBuilder();
                final String text = ((Line)this).getText();
                final int beginIndex = 0;
                final String s = text;
                if (s == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
                final String substring = s.substring(beginIndex, column);
                Intrinsics.checkNotNullExpressionValue((Object)substring, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
                final StringBuilder append = sb.append(substring).append(newText);
                final String text2 = ((Line)this).getText();
                if (text2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
                final String substring2 = text2.substring(column);
                Intrinsics.checkNotNullExpressionValue((Object)substring2, "(this as java.lang.String).substring(startIndex)");
                ((Line)this).setText(append.append(substring2).toString());
            }
        }
        
        @NotNull
        @Override
        public String toString() {
            return "TextualLine(text=" + ((Line)this).getText() + ", visualIndices=" + this.visualIndices + ')';
        }
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0084\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\n\u001a\u00020\u0004H\u0016R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u000b" }, d2 = { "Lgg/essential/vigilance/gui/common/input/AbstractTextInput$VisualLine;", "Lgg/essential/vigilance/gui/common/input/AbstractTextInput$Line;", "Lgg/essential/vigilance/gui/common/input/AbstractTextInput;", "text", "", "textIndex", "", "(Lgg/essential/vigilance/gui/common/input/AbstractTextInput;Ljava/lang/String;I)V", "getTextIndex", "()I", "toString", "Vigilance" })
    protected final class VisualLine extends Line
    {
        private final int textIndex;
        final /* synthetic */ AbstractTextInput this$0;
        
        public VisualLine(@NotNull final AbstractTextInput this$0, final String text, final int textIndex) {
            Intrinsics.checkNotNullParameter((Object)this$0, "this$0");
            Intrinsics.checkNotNullParameter((Object)text, "text");
            this.this$0 = this$0;
            this$0.super(text);
            this.textIndex = textIndex;
        }
        
        public final int getTextIndex() {
            return this.textIndex;
        }
        
        @NotNull
        @Override
        public String toString() {
            return "VisualLine(text=" + ((Line)this).getText() + ", textIndex=" + this.textIndex + ')';
        }
    }
}
