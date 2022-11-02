package gg.essential.universal;

import kotlin.jvm.functions.*;
import kotlin.jvm.*;
import org.lwjgl.glfw.*;
import net.minecraft.client.option.*;
import kotlin.jvm.internal.*;
import gg.essential.universal.wrappers.message.*;
import java.util.*;
import net.minecraft.text.*;
import org.jetbrains.annotations.*;
import kotlin.*;
import net.minecraft.client.util.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000>
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0000
                                                   \u0002\b\u0002
                                                   \u0002\u0010\b
                                                   \u0002\bi
                                                   \u0002\u0010\u0002
                                                   \u0000
                                                   \u0002\u0010\u000b
                                                   \u0000
                                                   \u0002\u0010\u000e
                                                   \u0002\b\u0003
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u000f
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0007\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0002\u008e\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010m\u001a\u00020n2\u0006\u0010o\u001a\u00020pH\u0007J\u0012\u0010q\u001a\u0004\u0018\u00010r2\u0006\u0010s\u001a\u00020\u0004H\u0007J\u001a\u0010q\u001a\u0004\u0018\u00010r2\u0006\u0010s\u001a\u00020\u00042\u0006\u0010t\u001a\u00020\u0004H\u0007J\u0012\u0010q\u001a\u0004\u0018\u00010r2\u0006\u0010u\u001a\u00020vH\u0007J\b\u0010w\u001a\u00020xH\u0007J\b\u0010y\u001a\u00020pH\u0007J\b\u0010z\u001a\u00020pH\u0007J\u0010\u0010{\u001a\u00020p2\u0006\u0010|\u001a\u00020\u0004H\u0007J\u0010\u0010}\u001a\u00020p2\u0006\u0010|\u001a\u00020\u0004H\u0007J\u0010\u0010~\u001a\u00020p2\u0006\u0010|\u001a\u00020\u0004H\u0007J\u0010\u0010\u007f\u001a\u00020p2\u0006\u0010|\u001a\u00020\u0004H\u0007J\u0011\u0010\u0080\u0001\u001a\u00020p2\u0006\u0010|\u001a\u00020\u0004H\u0007J\u0011\u0010\u0081\u0001\u001a\u00020p2\u0006\u0010|\u001a\u00020\u0004H\u0007J\u0011\u0010\u0082\u0001\u001a\u00020p2\u0006\u0010|\u001a\u00020\u0004H\u0007J\u0011\u0010\u0083\u0001\u001a\u00020p2\u0006\u0010|\u001a\u00020\u0004H\u0007J	\u0010\u0084\u0001\u001a\u00020pH\u0007J)\u0010\u0085\u0001\u001a\u0003H\u0086\u0001"\u0005\b\u0000\u0010\u0086\u00012\u000f\u0010\u0087\u0001\u001a
                                                   \u0012\u0005\u0012\u0003H\u0086\u00010\u0088\u0001H\u0082\b¢\u0006\u0003\u0010\u0089\u0001J\u0015\u0010\u008a\u0001\u001a\u00020\u0004*\u0004\u0018\u00010xH\u0000¢\u0006\u0003\b\u008b\u0001J\u0013\u0010\u008c\u0001\u001a\u00020x*\u00020\u0004H\u0000¢\u0006\u0003\b\u008d\u0001R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010	\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010
                                                   \u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010\u000b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010\f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010\r\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010\u000e\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010\u000f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010\u0010\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010\u0011\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010\u0012\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010\u0013\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010\u0014\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010\u0015\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010\u0016\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010\u0017\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010\u0018\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010\u0019\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010\u001a\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010\u001b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010\u001c\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010\u001d\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010\u001e\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010\u001f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010 \u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010!\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010"\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010#\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010$\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010%\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010&\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010'\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010(\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010)\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010*\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010+\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010,\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010-\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010.\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010/\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u00100\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u00101\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u00102\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u00103\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u00104\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u00105\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u00106\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u00107\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u00108\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u00109\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010:\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010;\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010<\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010=\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010>\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010?\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010@\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010A\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010B\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010C\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010D\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010E\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010F\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010G\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010H\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010I\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010J\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010K\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010L\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010M\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010N\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010O\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010P\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010Q\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010R\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010S\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010T\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010U\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010V\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010W\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010X\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010Y\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010Z\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010[\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010\\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010]\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010^\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010_\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010`\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010a\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010c\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010d\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010e\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010g\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010h\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010i\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010j\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010k\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010l\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                   \u0000¨\u0006\u008f\u0001""" }, d2 = { "Lgg/essential/universal/UKeyboard;", "", "()V", "KEY_0", "", "KEY_1", "KEY_2", "KEY_3", "KEY_4", "KEY_5", "KEY_6", "KEY_7", "KEY_8", "KEY_9", "KEY_A", "KEY_ADD", "KEY_APOSTROPHE", "KEY_B", "KEY_BACKSLASH", "KEY_BACKSPACE", "KEY_C", "KEY_CAPITAL", "KEY_COMMA", "KEY_D", "KEY_DECIMAL", "KEY_DELETE", "KEY_DIVIDE", "KEY_DOWN", "KEY_E", "KEY_END", "KEY_ENTER", "KEY_EQUALS", "KEY_ESCAPE", "KEY_F", "KEY_F1", "KEY_F10", "KEY_F11", "KEY_F12", "KEY_F13", "KEY_F14", "KEY_F15", "KEY_F16", "KEY_F17", "KEY_F18", "KEY_F19", "KEY_F2", "KEY_F3", "KEY_F4", "KEY_F5", "KEY_F6", "KEY_F7", "KEY_F8", "KEY_F9", "KEY_G", "KEY_GRAVE", "KEY_H", "KEY_HOME", "KEY_I", "KEY_J", "KEY_K", "KEY_L", "KEY_LBRACKET", "KEY_LCONTROL", "KEY_LEFT", "KEY_LMENU", "KEY_LMETA", "KEY_LSHIFT", "KEY_M", "KEY_MINUS", "KEY_MULTIPLY", "KEY_N", "KEY_NONE", "KEY_NUMLOCK", "KEY_NUMPAD0", "KEY_NUMPAD1", "KEY_NUMPAD2", "KEY_NUMPAD3", "KEY_NUMPAD4", "KEY_NUMPAD5", "KEY_NUMPAD6", "KEY_NUMPAD7", "KEY_NUMPAD8", "KEY_NUMPAD9", "KEY_O", "KEY_P", "KEY_PERIOD", "KEY_Q", "KEY_R", "KEY_RBRACKET", "KEY_RCONTROL", "KEY_RIGHT", "KEY_RMENU", "KEY_RMETA", "KEY_RSHIFT", "KEY_S", "KEY_SCROLL", "KEY_SEMICOLON", "KEY_SLASH", "KEY_SPACE", "KEY_SUBTRACT", "KEY_T", "KEY_TAB", "KEY_U", "KEY_UP", "KEY_V", "KEY_W", "KEY_X", "KEY_Y", "KEY_Z", "allowRepeatEvents", "", "enabled", "", "getKeyName", "", "keyCode", "scanCode", "keyBinding", "Lnet/minecraft/client/option/KeyBinding;", "getModifiers", "Lgg/essential/universal/UKeyboard$Modifiers;", "isAltKeyDown", "isCtrlKeyDown", "isKeyComboCtrlA", "key", "isKeyComboCtrlC", "isKeyComboCtrlShiftZ", "isKeyComboCtrlV", "isKeyComboCtrlX", "isKeyComboCtrlY", "isKeyComboCtrlZ", "isKeyDown", "isShiftKeyDown", "noInline", "T", "init", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "toInt", "toInt$universalcraft", "toModifiers", "toModifiers$universalcraft", "Modifiers", "universalcraft" })
public final class UKeyboard
{
    @NotNull
    public static final UKeyboard INSTANCE;
    @JvmField
    public static final int KEY_NONE;
    @JvmField
    public static final int KEY_ESCAPE;
    @JvmField
    public static final int KEY_LMETA;
    @JvmField
    public static final int KEY_RMETA;
    @JvmField
    public static final int KEY_LCONTROL;
    @JvmField
    public static final int KEY_RCONTROL;
    @JvmField
    public static final int KEY_LSHIFT;
    @JvmField
    public static final int KEY_RSHIFT;
    @JvmField
    public static final int KEY_LMENU;
    @JvmField
    public static final int KEY_RMENU;
    @JvmField
    public static final int KEY_MINUS;
    @JvmField
    public static final int KEY_EQUALS;
    @JvmField
    public static final int KEY_BACKSPACE;
    @JvmField
    public static final int KEY_ENTER;
    @JvmField
    public static final int KEY_TAB;
    @JvmField
    public static final int KEY_LBRACKET;
    @JvmField
    public static final int KEY_RBRACKET;
    @JvmField
    public static final int KEY_SEMICOLON;
    @JvmField
    public static final int KEY_APOSTROPHE;
    @JvmField
    public static final int KEY_GRAVE;
    @JvmField
    public static final int KEY_BACKSLASH;
    @JvmField
    public static final int KEY_COMMA;
    @JvmField
    public static final int KEY_PERIOD;
    @JvmField
    public static final int KEY_SLASH;
    @JvmField
    public static final int KEY_MULTIPLY;
    @JvmField
    public static final int KEY_SPACE;
    @JvmField
    public static final int KEY_CAPITAL;
    @JvmField
    public static final int KEY_LEFT;
    @JvmField
    public static final int KEY_UP;
    @JvmField
    public static final int KEY_RIGHT;
    @JvmField
    public static final int KEY_DOWN;
    @JvmField
    public static final int KEY_NUMLOCK;
    @JvmField
    public static final int KEY_SCROLL;
    @JvmField
    public static final int KEY_SUBTRACT;
    @JvmField
    public static final int KEY_ADD;
    @JvmField
    public static final int KEY_DIVIDE;
    @JvmField
    public static final int KEY_DECIMAL;
    @JvmField
    public static final int KEY_NUMPAD0;
    @JvmField
    public static final int KEY_NUMPAD1;
    @JvmField
    public static final int KEY_NUMPAD2;
    @JvmField
    public static final int KEY_NUMPAD3;
    @JvmField
    public static final int KEY_NUMPAD4;
    @JvmField
    public static final int KEY_NUMPAD5;
    @JvmField
    public static final int KEY_NUMPAD6;
    @JvmField
    public static final int KEY_NUMPAD7;
    @JvmField
    public static final int KEY_NUMPAD8;
    @JvmField
    public static final int KEY_NUMPAD9;
    @JvmField
    public static final int KEY_A;
    @JvmField
    public static final int KEY_B;
    @JvmField
    public static final int KEY_C;
    @JvmField
    public static final int KEY_D;
    @JvmField
    public static final int KEY_E;
    @JvmField
    public static final int KEY_F;
    @JvmField
    public static final int KEY_G;
    @JvmField
    public static final int KEY_H;
    @JvmField
    public static final int KEY_I;
    @JvmField
    public static final int KEY_J;
    @JvmField
    public static final int KEY_K;
    @JvmField
    public static final int KEY_L;
    @JvmField
    public static final int KEY_M;
    @JvmField
    public static final int KEY_N;
    @JvmField
    public static final int KEY_O;
    @JvmField
    public static final int KEY_P;
    @JvmField
    public static final int KEY_Q;
    @JvmField
    public static final int KEY_R;
    @JvmField
    public static final int KEY_S;
    @JvmField
    public static final int KEY_T;
    @JvmField
    public static final int KEY_U;
    @JvmField
    public static final int KEY_V;
    @JvmField
    public static final int KEY_W;
    @JvmField
    public static final int KEY_X;
    @JvmField
    public static final int KEY_Y;
    @JvmField
    public static final int KEY_Z;
    @JvmField
    public static final int KEY_0;
    @JvmField
    public static final int KEY_1;
    @JvmField
    public static final int KEY_2;
    @JvmField
    public static final int KEY_3;
    @JvmField
    public static final int KEY_4;
    @JvmField
    public static final int KEY_5;
    @JvmField
    public static final int KEY_6;
    @JvmField
    public static final int KEY_7;
    @JvmField
    public static final int KEY_8;
    @JvmField
    public static final int KEY_9;
    @JvmField
    public static final int KEY_F1;
    @JvmField
    public static final int KEY_F2;
    @JvmField
    public static final int KEY_F3;
    @JvmField
    public static final int KEY_F4;
    @JvmField
    public static final int KEY_F5;
    @JvmField
    public static final int KEY_F6;
    @JvmField
    public static final int KEY_F7;
    @JvmField
    public static final int KEY_F8;
    @JvmField
    public static final int KEY_F9;
    @JvmField
    public static final int KEY_F10;
    @JvmField
    public static final int KEY_F11;
    @JvmField
    public static final int KEY_F12;
    @JvmField
    public static final int KEY_F13;
    @JvmField
    public static final int KEY_F14;
    @JvmField
    public static final int KEY_F15;
    @JvmField
    public static final int KEY_F16;
    @JvmField
    public static final int KEY_F17;
    @JvmField
    public static final int KEY_F18;
    @JvmField
    public static final int KEY_F19;
    @JvmField
    public static final int KEY_DELETE;
    @JvmField
    public static final int KEY_HOME;
    @JvmField
    public static final int KEY_END;
    
    private UKeyboard() {
        super();
    }
    
    private final <T> T noInline(final Function0<? extends T> init) {
        final int $i$f$noInline = 0;
        return (T)init.invoke();
    }
    
    @JvmStatic
    public static final void allowRepeatEvents(final boolean enabled) {
        UMinecraft.getMinecraft().keyboard.setRepeatEvents(enabled);
    }
    
    @JvmStatic
    public static final boolean isCtrlKeyDown() {
        boolean b;
        if (UMinecraft.isRunningOnMac) {
            final UKeyboard instance = UKeyboard.INSTANCE;
            if (!isKeyDown(UKeyboard.KEY_LMETA)) {
                final UKeyboard instance2 = UKeyboard.INSTANCE;
                if (!isKeyDown(UKeyboard.KEY_RMETA)) {
                    b = false;
                    return b;
                }
            }
            b = true;
        }
        else {
            final UKeyboard instance3 = UKeyboard.INSTANCE;
            if (!isKeyDown(UKeyboard.KEY_LCONTROL)) {
                final UKeyboard instance4 = UKeyboard.INSTANCE;
                if (!isKeyDown(UKeyboard.KEY_RCONTROL)) {
                    b = false;
                    return b;
                }
            }
            b = true;
        }
        return b;
    }
    
    @JvmStatic
    public static final boolean isShiftKeyDown() {
        final UKeyboard instance = UKeyboard.INSTANCE;
        if (!isKeyDown(UKeyboard.KEY_LSHIFT)) {
            final UKeyboard instance2 = UKeyboard.INSTANCE;
            if (!isKeyDown(UKeyboard.KEY_RSHIFT)) {
                return false;
            }
        }
        return true;
    }
    
    @JvmStatic
    public static final boolean isAltKeyDown() {
        final UKeyboard instance = UKeyboard.INSTANCE;
        if (!isKeyDown(UKeyboard.KEY_LMENU)) {
            final UKeyboard instance2 = UKeyboard.INSTANCE;
            if (!isKeyDown(UKeyboard.KEY_RMENU)) {
                return false;
            }
        }
        return true;
    }
    
    @JvmStatic
    @NotNull
    public static final UKeyboard.Modifiers getModifiers() {
        final UKeyboard instance = UKeyboard.INSTANCE;
        final boolean ctrlKeyDown = isCtrlKeyDown();
        final UKeyboard instance2 = UKeyboard.INSTANCE;
        final boolean shiftKeyDown = isShiftKeyDown();
        final UKeyboard instance3 = UKeyboard.INSTANCE;
        return new UKeyboard.Modifiers(ctrlKeyDown, shiftKeyDown, isAltKeyDown());
    }
    
    @JvmStatic
    public static final boolean isKeyComboCtrlA(final int key) {
        if (key == UKeyboard.KEY_A) {
            final UKeyboard instance = UKeyboard.INSTANCE;
            if (isCtrlKeyDown()) {
                final UKeyboard instance2 = UKeyboard.INSTANCE;
                if (!isShiftKeyDown()) {
                    final UKeyboard instance3 = UKeyboard.INSTANCE;
                    if (!isAltKeyDown()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    @JvmStatic
    public static final boolean isKeyComboCtrlC(final int key) {
        if (key == UKeyboard.KEY_C) {
            final UKeyboard instance = UKeyboard.INSTANCE;
            if (isCtrlKeyDown()) {
                final UKeyboard instance2 = UKeyboard.INSTANCE;
                if (!isShiftKeyDown()) {
                    final UKeyboard instance3 = UKeyboard.INSTANCE;
                    if (!isAltKeyDown()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    @JvmStatic
    public static final boolean isKeyComboCtrlV(final int key) {
        if (key == UKeyboard.KEY_V) {
            final UKeyboard instance = UKeyboard.INSTANCE;
            if (isCtrlKeyDown()) {
                final UKeyboard instance2 = UKeyboard.INSTANCE;
                if (!isShiftKeyDown()) {
                    final UKeyboard instance3 = UKeyboard.INSTANCE;
                    if (!isAltKeyDown()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    @JvmStatic
    public static final boolean isKeyComboCtrlX(final int key) {
        if (key == UKeyboard.KEY_X) {
            final UKeyboard instance = UKeyboard.INSTANCE;
            if (isCtrlKeyDown()) {
                final UKeyboard instance2 = UKeyboard.INSTANCE;
                if (!isShiftKeyDown()) {
                    final UKeyboard instance3 = UKeyboard.INSTANCE;
                    if (!isAltKeyDown()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    @JvmStatic
    public static final boolean isKeyComboCtrlY(final int key) {
        if (key == UKeyboard.KEY_Y) {
            final UKeyboard instance = UKeyboard.INSTANCE;
            if (isCtrlKeyDown()) {
                final UKeyboard instance2 = UKeyboard.INSTANCE;
                if (!isShiftKeyDown()) {
                    final UKeyboard instance3 = UKeyboard.INSTANCE;
                    if (!isAltKeyDown()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    @JvmStatic
    public static final boolean isKeyComboCtrlZ(final int key) {
        if (key == UKeyboard.KEY_Z) {
            final UKeyboard instance = UKeyboard.INSTANCE;
            if (isCtrlKeyDown()) {
                final UKeyboard instance2 = UKeyboard.INSTANCE;
                if (!isShiftKeyDown()) {
                    final UKeyboard instance3 = UKeyboard.INSTANCE;
                    if (!isAltKeyDown()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    @JvmStatic
    public static final boolean isKeyComboCtrlShiftZ(final int key) {
        if (key == UKeyboard.KEY_Z) {
            final UKeyboard instance = UKeyboard.INSTANCE;
            if (isCtrlKeyDown()) {
                final UKeyboard instance2 = UKeyboard.INSTANCE;
                if (isShiftKeyDown()) {
                    final UKeyboard instance3 = UKeyboard.INSTANCE;
                    if (!isAltKeyDown()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    @JvmStatic
    public static final boolean isKeyDown(final int key) {
        if (key == UKeyboard.KEY_NONE) {
            return false;
        }
        final long window = UMinecraft.getMinecraft().getWindow().getHandle();
        final int state = (key < 20) ? GLFW.glfwGetMouseButton(window, key) : GLFW.glfwGetKey(window, key);
        return state == 1;
    }
    
    @JvmStatic
    @Nullable
    public static final String getKeyName(@NotNull final KeyBinding keyBinding) {
        Intrinsics.checkNotNullParameter((Object)keyBinding, "keyBinding");
        final Text boundKeyLocalizedText = keyBinding.getBoundKeyLocalizedText();
        Intrinsics.checkNotNullExpressionValue((Object)boundKeyLocalizedText, "keyBinding.boundKeyLocalizedText");
        final String it = new UTextComponent(boundKeyLocalizedText).getUnformattedText();
        final int n = 0;
        String upperCase;
        if (it.length() == 1) {
            final String s = it;
            if (s == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            Intrinsics.checkNotNullExpressionValue((Object)(upperCase = s.toUpperCase(Locale.ROOT)), "(this as java.lang.Strin\u2026.toUpperCase(Locale.ROOT)");
        }
        else {
            upperCase = it;
        }
        return upperCase;
    }
    
    @Deprecated(message = "Does not work for mouse bindings", replaceWith = @ReplaceWith(expression = "getKeyName(keyBinding)", imports = {}))
    @JvmStatic
    @Nullable
    @java.lang.Deprecated
    public static final String getKeyName(final int keyCode, final int scanCode) {
        final String glfwGetKeyName = GLFW.glfwGetKeyName(keyCode, scanCode);
        String upperCase;
        if (glfwGetKeyName == null) {
            upperCase = null;
        }
        else {
            final String it = glfwGetKeyName;
            final int n = 0;
            if (it.length() == 1) {
                Intrinsics.checkNotNullExpressionValue((Object)(upperCase = it.toUpperCase(Locale.ROOT)), "(this as java.lang.Strin\u2026.toUpperCase(Locale.ROOT)");
            }
            else {
                upperCase = it;
            }
        }
        return upperCase;
    }
    
    @Deprecated(message = "Does not work for mouse or scanCode-type bindings", replaceWith = @ReplaceWith(expression = "getKeyName(keyCode, -1)", imports = {}))
    @JvmStatic
    @Nullable
    @java.lang.Deprecated
    public static final String getKeyName(final int keyCode) {
        final UKeyboard instance = UKeyboard.INSTANCE;
        return getKeyName(keyCode, -1);
    }
    
    public final int toInt$universalcraft(@Nullable final UKeyboard.Modifiers $this$toInt) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: anewarray       Lkotlin/Pair;
        //     4: astore_2       
        //     5: aload_2        
        //     6: iconst_0       
        //     7: aload_1         /* $this$toInt */
        //     8: dup            
        //     9: ifnonnull       17
        //    12: pop            
        //    13: aconst_null    
        //    14: goto            23
        //    17: invokevirtual   gg/essential/universal/UKeyboard$Modifiers.isCtrl:()Z
        //    20: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //    23: iconst_2       
        //    24: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    27: invokestatic    kotlin/TuplesKt.to:(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
        //    30: aastore        
        //    31: aload_2        
        //    32: iconst_1       
        //    33: aload_1         /* $this$toInt */
        //    34: dup            
        //    35: ifnonnull       43
        //    38: pop            
        //    39: aconst_null    
        //    40: goto            49
        //    43: invokevirtual   gg/essential/universal/UKeyboard$Modifiers.isShift:()Z
        //    46: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //    49: iconst_1       
        //    50: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    53: invokestatic    kotlin/TuplesKt.to:(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
        //    56: aastore        
        //    57: aload_2        
        //    58: iconst_2       
        //    59: aload_1         /* $this$toInt */
        //    60: dup            
        //    61: ifnonnull       69
        //    64: pop            
        //    65: aconst_null    
        //    66: goto            75
        //    69: invokevirtual   gg/essential/universal/UKeyboard$Modifiers.isAlt:()Z
        //    72: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //    75: iconst_4       
        //    76: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    79: invokestatic    kotlin/TuplesKt.to:(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
        //    82: aastore        
        //    83: aload_2        
        //    84: invokestatic    kotlin/collections/CollectionsKt.listOf:([Ljava/lang/Object;)Ljava/util/List;
        //    87: checkcast       Ljava/lang/Iterable;
        //    90: astore_2       
        //    91: iconst_0       
        //    92: istore_3       
        //    93: aload_2        
        //    94: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //    99: astore          4
        //   101: aload           4
        //   103: invokeinterface java/util/Iterator.hasNext:()Z
        //   108: ifeq            185
        //   111: aload           4
        //   113: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   118: astore          5
        //   120: iload_3        
        //   121: aload           5
        //   123: checkcast       Lkotlin/Pair;
        //   126: astore          6
        //   128: istore          10
        //   130: iconst_0       
        //   131: istore          $i$a$-sumOfInt-UKeyboard$toInt$1
        //   133: aload           $dstr$modifier$value
        //   135: invokevirtual   kotlin/Pair.component1:()Ljava/lang/Object;
        //   138: checkcast       Ljava/lang/Boolean;
        //   141: astore          modifier
        //   143: aload           $dstr$modifier$value
        //   145: invokevirtual   kotlin/Pair.component2:()Ljava/lang/Object;
        //   148: checkcast       Ljava/lang/Number;
        //   151: invokevirtual   java/lang/Number.intValue:()I
        //   154: istore          value
        //   156: aload           modifier
        //   158: iconst_1       
        //   159: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   162: invokestatic    kotlin/jvm/internal/Intrinsics.areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   165: ifeq            173
        //   168: iload           value
        //   170: goto            174
        //   173: iconst_0       
        //   174: istore          11
        //   176: iload           10
        //   178: iload           11
        //   180: iadd           
        //   181: istore_3       
        //   182: goto            101
        //   185: iload_3        
        //   186: ireturn        
        //    MethodParameters:
        //  Name         Flags  
        //  -----------  -----
        //  $this$toInt  
        //    StackMapTable: 00 0A FF 00 11 00 03 07 00 02 07 00 9E 07 01 5D 00 03 07 01 5D 01 07 00 9E FF 00 05 00 03 07 00 02 07 00 9E 07 01 5D 00 03 07 01 5D 01 07 01 62 FF 00 13 00 03 07 00 02 07 00 9E 07 01 5D 00 03 07 01 5D 01 07 00 9E FF 00 05 00 03 07 00 02 07 00 9E 07 01 5D 00 03 07 01 5D 01 07 01 62 FF 00 13 00 03 07 00 02 07 00 9E 07 01 5D 00 03 07 01 5D 01 07 00 9E FF 00 05 00 03 07 00 02 07 00 9E 07 01 5D 00 03 07 01 5D 01 07 01 62 FF 00 19 00 05 07 00 02 07 00 9E 07 01 7F 01 07 01 85 00 00 FF 00 47 00 0B 07 00 02 07 00 9E 07 01 7F 01 07 01 85 07 00 04 07 01 5B 01 07 01 62 01 01 00 00 40 01 FF 00 0A 00 05 07 00 02 07 00 9E 07 01 7F 01 07 01 85 00 00
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @NotNull
    public final UKeyboard.Modifiers toModifiers$universalcraft(final int $this$toModifiers) {
        return new UKeyboard.Modifiers(($this$toModifiers & 0x2) != 0x0, ($this$toModifiers & 0x1) != 0x0, ($this$toModifiers & 0x4) != 0x0);
    }
    
    static {
        INSTANCE = new UKeyboard();
        UKeyboard this_$iv = UKeyboard.INSTANCE;
        int $i$f$noInline = 0;
        final int n = 0;
        KEY_NONE = InputUtil.UNKNOWN_KEY.getCode();
        this_$iv = UKeyboard.INSTANCE;
        $i$f$noInline = 0;
        final int n2 = 0;
        KEY_ESCAPE = 256;
        this_$iv = UKeyboard.INSTANCE;
        $i$f$noInline = 0;
        final int n3 = 0;
        KEY_LMETA = 343;
        this_$iv = UKeyboard.INSTANCE;
        $i$f$noInline = 0;
        final int n4 = 0;
        KEY_RMETA = 347;
        this_$iv = UKeyboard.INSTANCE;
        $i$f$noInline = 0;
        final int n5 = 0;
        KEY_LCONTROL = 341;
        this_$iv = UKeyboard.INSTANCE;
        $i$f$noInline = 0;
        final int n6 = 0;
        KEY_RCONTROL = 345;
        this_$iv = UKeyboard.INSTANCE;
        $i$f$noInline = 0;
        final int n7 = 0;
        KEY_LSHIFT = 340;
        this_$iv = UKeyboard.INSTANCE;
        $i$f$noInline = 0;
        final int n8 = 0;
        KEY_RSHIFT = 344;
        this_$iv = UKeyboard.INSTANCE;
        $i$f$noInline = 0;
        final int n9 = 0;
        KEY_LMENU = 342;
        this_$iv = UKeyboard.INSTANCE;
        $i$f$noInline = 0;
        final int n10 = 0;
        KEY_RMENU = 346;
        this_$iv = UKeyboard.INSTANCE;
        $i$f$noInline = 0;
        final int n11 = 0;
        KEY_MINUS = 45;
        this_$iv = UKeyboard.INSTANCE;
        $i$f$noInline = 0;
        final int n12 = 0;
        KEY_EQUALS = 61;
        this_$iv = UKeyboard.INSTANCE;
        $i$f$noInline = 0;
        final int n13 = 0;
        KEY_BACKSPACE = 259;
        this_$iv = UKeyboard.INSTANCE;
        $i$f$noInline = 0;
        final int n14 = 0;
        KEY_ENTER = 257;
        this_$iv = UKeyboard.INSTANCE;
        $i$f$noInline = 0;
        final int n15 = 0;
        KEY_TAB = 258;
        this_$iv = UKeyboard.INSTANCE;
        $i$f$noInline = 0;
        final int n16 = 0;
        KEY_LBRACKET = 91;
        this_$iv = UKeyboard.INSTANCE;
        $i$f$noInline = 0;
        final int n17 = 0;
        KEY_RBRACKET = 93;
        this_$iv = UKeyboard.INSTANCE;
        $i$f$noInline = 0;
        final int n18 = 0;
        KEY_SEMICOLON = 59;
        this_$iv = UKeyboard.INSTANCE;
        $i$f$noInline = 0;
        final int n19 = 0;
        KEY_APOSTROPHE = 39;
        this_$iv = UKeyboard.INSTANCE;
        $i$f$noInline = 0;
        final int n20 = 0;
        KEY_GRAVE = 96;
        this_$iv = UKeyboard.INSTANCE;
        $i$f$noInline = 0;
        final int n21 = 0;
        KEY_BACKSLASH = 92;
        this_$iv = UKeyboard.INSTANCE;
        $i$f$noInline = 0;
        final int n22 = 0;
        KEY_COMMA = 44;
        this_$iv = UKeyboard.INSTANCE;
        $i$f$noInline = 0;
        final int n23 = 0;
        KEY_PERIOD = 46;
        this_$iv = UKeyboard.INSTANCE;
        $i$f$noInline = 0;
        final int n24 = 0;
        KEY_SLASH = 47;
        this_$iv = UKeyboard.INSTANCE;
        $i$f$noInline = 0;
        final int n25 = 0;
        KEY_MULTIPLY = 332;
        this_$iv = UKeyboard.INSTANCE;
        $i$f$noInline = 0;
        final int n26 = 0;
        KEY_SPACE = 32;
        this_$iv = UKeyboard.INSTANCE;
        $i$f$noInline = 0;
        final int n27 = 0;
        KEY_CAPITAL = 280;
        this_$iv = UKeyboard.INSTANCE;
        $i$f$noInline = 0;
        final int n28 = 0;
        KEY_LEFT = 263;
        this_$iv = UKeyboard.INSTANCE;
        $i$f$noInline = 0;
        final int n29 = 0;
        KEY_UP = 265;
        this_$iv = UKeyboard.INSTANCE;
        $i$f$noInline = 0;
        final int n30 = 0;
        KEY_RIGHT = 262;
        this_$iv = UKeyboard.INSTANCE;
        $i$f$noInline = 0;
        final int n31 = 0;
        KEY_DOWN = 264;
        this_$iv = UKeyboard.INSTANCE;
        $i$f$noInline = 0;
        final int n32 = 0;
        KEY_NUMLOCK = 282;
        this_$iv = UKeyboard.INSTANCE;
        $i$f$noInline = 0;
        final int n33 = 0;
        KEY_SCROLL = 281;
        this_$iv = UKeyboard.INSTANCE;
        $i$f$noInline = 0;
        final int n34 = 0;
        KEY_SUBTRACT = 333;
        this_$iv = UKeyboard.INSTANCE;
        $i$f$noInline = 0;
        final int n35 = 0;
        KEY_ADD = 334;
        this_$iv = UKeyboard.INSTANCE;
        $i$f$noInline = 0;
        final int n36 = 0;
        KEY_DIVIDE = 331;
        this_$iv = UKeyboard.INSTANCE;
        $i$f$noInline = 0;
        final int n37 = 0;
        KEY_DECIMAL = 330;
        this_$iv = UKeyboard.INSTANCE;
        $i$f$noInline = 0;
        final int n38 = 0;
        KEY_NUMPAD0 = 320;
        this_$iv = UKeyboard.INSTANCE;
        $i$f$noInline = 0;
        final int n39 = 0;
        KEY_NUMPAD1 = 321;
        this_$iv = UKeyboard.INSTANCE;
        $i$f$noInline = 0;
        final int n40 = 0;
        KEY_NUMPAD2 = 322;
        this_$iv = UKeyboard.INSTANCE;
        $i$f$noInline = 0;
        final int n41 = 0;
        KEY_NUMPAD3 = 323;
        this_$iv = UKeyboard.INSTANCE;
        $i$f$noInline = 0;
        final int n42 = 0;
        KEY_NUMPAD4 = 324;
        this_$iv = UKeyboard.INSTANCE;
        $i$f$noInline = 0;
        final int n43 = 0;
        KEY_NUMPAD5 = 325;
        this_$iv = UKeyboard.INSTANCE;
        $i$f$noInline = 0;
        final int n44 = 0;
        KEY_NUMPAD6 = 326;
        this_$iv = UKeyboard.INSTANCE;
        $i$f$noInline = 0;
        final int n45 = 0;
        KEY_NUMPAD7 = 327;
        this_$iv = UKeyboard.INSTANCE;
        $i$f$noInline = 0;
        final int n46 = 0;
        KEY_NUMPAD8 = 328;
        this_$iv = UKeyboard.INSTANCE;
        $i$f$noInline = 0;
        final int n47 = 0;
        KEY_NUMPAD9 = 329;
        this_$iv = UKeyboard.INSTANCE;
        $i$f$noInline = 0;
        final int n48 = 0;
        KEY_A = 65;
        this_$iv = UKeyboard.INSTANCE;
        $i$f$noInline = 0;
        final int n49 = 0;
        KEY_B = 66;
        this_$iv = UKeyboard.INSTANCE;
        $i$f$noInline = 0;
        final int n50 = 0;
        KEY_C = 67;
        this_$iv = UKeyboard.INSTANCE;
        $i$f$noInline = 0;
        final int n51 = 0;
        KEY_D = 68;
        this_$iv = UKeyboard.INSTANCE;
        $i$f$noInline = 0;
        final int n52 = 0;
        KEY_E = 69;
        this_$iv = UKeyboard.INSTANCE;
        $i$f$noInline = 0;
        final int n53 = 0;
        KEY_F = 70;
        this_$iv = UKeyboard.INSTANCE;
        $i$f$noInline = 0;
        final int n54 = 0;
        KEY_G = 71;
        this_$iv = UKeyboard.INSTANCE;
        $i$f$noInline = 0;
        final int n55 = 0;
        KEY_H = 72;
        this_$iv = UKeyboard.INSTANCE;
        $i$f$noInline = 0;
        final int n56 = 0;
        KEY_I = 73;
        this_$iv = UKeyboard.INSTANCE;
        $i$f$noInline = 0;
        final int n57 = 0;
        KEY_J = 74;
        this_$iv = UKeyboard.INSTANCE;
        $i$f$noInline = 0;
        final int n58 = 0;
        KEY_K = 75;
        this_$iv = UKeyboard.INSTANCE;
        $i$f$noInline = 0;
        final int n59 = 0;
        KEY_L = 76;
        this_$iv = UKeyboard.INSTANCE;
        $i$f$noInline = 0;
        final int n60 = 0;
        KEY_M = 77;
        this_$iv = UKeyboard.INSTANCE;
        $i$f$noInline = 0;
        final int n61 = 0;
        KEY_N = 78;
        this_$iv = UKeyboard.INSTANCE;
        $i$f$noInline = 0;
        final int n62 = 0;
        KEY_O = 79;
        this_$iv = UKeyboard.INSTANCE;
        $i$f$noInline = 0;
        final int n63 = 0;
        KEY_P = 80;
        this_$iv = UKeyboard.INSTANCE;
        $i$f$noInline = 0;
        final int n64 = 0;
        KEY_Q = 81;
        this_$iv = UKeyboard.INSTANCE;
        $i$f$noInline = 0;
        final int n65 = 0;
        KEY_R = 82;
        this_$iv = UKeyboard.INSTANCE;
        $i$f$noInline = 0;
        final int n66 = 0;
        KEY_S = 83;
        this_$iv = UKeyboard.INSTANCE;
        $i$f$noInline = 0;
        final int n67 = 0;
        KEY_T = 84;
        this_$iv = UKeyboard.INSTANCE;
        $i$f$noInline = 0;
        final int n68 = 0;
        KEY_U = 85;
        this_$iv = UKeyboard.INSTANCE;
        $i$f$noInline = 0;
        final int n69 = 0;
        KEY_V = 86;
        this_$iv = UKeyboard.INSTANCE;
        $i$f$noInline = 0;
        final int n70 = 0;
        KEY_W = 87;
        this_$iv = UKeyboard.INSTANCE;
        $i$f$noInline = 0;
        final int n71 = 0;
        KEY_X = 88;
        this_$iv = UKeyboard.INSTANCE;
        $i$f$noInline = 0;
        final int n72 = 0;
        KEY_Y = 89;
        this_$iv = UKeyboard.INSTANCE;
        $i$f$noInline = 0;
        final int n73 = 0;
        KEY_Z = 90;
        this_$iv = UKeyboard.INSTANCE;
        $i$f$noInline = 0;
        final int n74 = 0;
        KEY_0 = 48;
        this_$iv = UKeyboard.INSTANCE;
        $i$f$noInline = 0;
        final int n75 = 0;
        KEY_1 = 49;
        this_$iv = UKeyboard.INSTANCE;
        $i$f$noInline = 0;
        final int n76 = 0;
        KEY_2 = 50;
        this_$iv = UKeyboard.INSTANCE;
        $i$f$noInline = 0;
        final int n77 = 0;
        KEY_3 = 51;
        this_$iv = UKeyboard.INSTANCE;
        $i$f$noInline = 0;
        final int n78 = 0;
        KEY_4 = 52;
        this_$iv = UKeyboard.INSTANCE;
        $i$f$noInline = 0;
        final int n79 = 0;
        KEY_5 = 53;
        this_$iv = UKeyboard.INSTANCE;
        $i$f$noInline = 0;
        final int n80 = 0;
        KEY_6 = 54;
        this_$iv = UKeyboard.INSTANCE;
        $i$f$noInline = 0;
        final int n81 = 0;
        KEY_7 = 55;
        this_$iv = UKeyboard.INSTANCE;
        $i$f$noInline = 0;
        final int n82 = 0;
        KEY_8 = 56;
        this_$iv = UKeyboard.INSTANCE;
        $i$f$noInline = 0;
        final int n83 = 0;
        KEY_9 = 57;
        this_$iv = UKeyboard.INSTANCE;
        $i$f$noInline = 0;
        final int n84 = 0;
        KEY_F1 = 290;
        this_$iv = UKeyboard.INSTANCE;
        $i$f$noInline = 0;
        final int n85 = 0;
        KEY_F2 = 291;
        this_$iv = UKeyboard.INSTANCE;
        $i$f$noInline = 0;
        final int n86 = 0;
        KEY_F3 = 292;
        this_$iv = UKeyboard.INSTANCE;
        $i$f$noInline = 0;
        final int n87 = 0;
        KEY_F4 = 293;
        this_$iv = UKeyboard.INSTANCE;
        $i$f$noInline = 0;
        final int n88 = 0;
        KEY_F5 = 294;
        this_$iv = UKeyboard.INSTANCE;
        $i$f$noInline = 0;
        final int n89 = 0;
        KEY_F6 = 295;
        this_$iv = UKeyboard.INSTANCE;
        $i$f$noInline = 0;
        final int n90 = 0;
        KEY_F7 = 296;
        this_$iv = UKeyboard.INSTANCE;
        $i$f$noInline = 0;
        final int n91 = 0;
        KEY_F8 = 297;
        this_$iv = UKeyboard.INSTANCE;
        $i$f$noInline = 0;
        final int n92 = 0;
        KEY_F9 = 298;
        this_$iv = UKeyboard.INSTANCE;
        $i$f$noInline = 0;
        final int n93 = 0;
        KEY_F10 = 299;
        this_$iv = UKeyboard.INSTANCE;
        $i$f$noInline = 0;
        final int n94 = 0;
        KEY_F11 = 300;
        this_$iv = UKeyboard.INSTANCE;
        $i$f$noInline = 0;
        final int n95 = 0;
        KEY_F12 = 301;
        this_$iv = UKeyboard.INSTANCE;
        $i$f$noInline = 0;
        final int n96 = 0;
        KEY_F13 = 302;
        this_$iv = UKeyboard.INSTANCE;
        $i$f$noInline = 0;
        final int n97 = 0;
        KEY_F14 = 303;
        this_$iv = UKeyboard.INSTANCE;
        $i$f$noInline = 0;
        final int n98 = 0;
        KEY_F15 = 304;
        this_$iv = UKeyboard.INSTANCE;
        $i$f$noInline = 0;
        final int n99 = 0;
        KEY_F16 = 305;
        this_$iv = UKeyboard.INSTANCE;
        $i$f$noInline = 0;
        final int n100 = 0;
        KEY_F17 = 306;
        this_$iv = UKeyboard.INSTANCE;
        $i$f$noInline = 0;
        final int n101 = 0;
        KEY_F18 = 307;
        this_$iv = UKeyboard.INSTANCE;
        $i$f$noInline = 0;
        final int n102 = 0;
        KEY_F19 = 308;
        this_$iv = UKeyboard.INSTANCE;
        $i$f$noInline = 0;
        final int n103 = 0;
        KEY_DELETE = 261;
        this_$iv = UKeyboard.INSTANCE;
        $i$f$noInline = 0;
        final int n104 = 0;
        KEY_HOME = 268;
        this_$iv = UKeyboard.INSTANCE;
        $i$f$noInline = 0;
        final int n105 = 0;
        KEY_END = 269;
    }
}
