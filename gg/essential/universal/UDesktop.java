package gg.essential.universal;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.*;
import java.net.*;
import kotlin.jvm.internal.*;
import kotlin.collections.*;
import java.awt.*;
import java.util.concurrent.*;
import java.io.*;
import kotlin.text.*;
import java.util.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000<
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0000
                                                   \u0002\b\u0002
                                                   \u0002\u0010\u000b
                                                   \u0002\b\u000f
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0003
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0010\u000e
                                                   \u0002\b\u0005
                                                   \u0002\u0010\u0011
                                                   \u0002\b\u0003
                                                   \u0002\u0010\u0002
                                                   \u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0014H\u0007J\u0010\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0010\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0018H\u0007J\u0010\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0007J\u0010\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0018H\u0007J\u0010\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0010\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u001bH\u0002J+\u0010\u001f\u001a\u00020\u00042\u0012\u0010 \u001a
                                                   \u0012\u0006\b\u0001\u0012\u00020\u001b0!"\u00020\u001b2\b\b\u0002\u0010"\u001a\u00020\u0004H\u0002¢\u0006\u0002\u0010#J\u0010\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001bH\u0007R&\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048\u0006@BX\u0087\u000e¢\u0006\u000e
                                                   \u0000\u0012\u0004\b\u0006\u0010\u0002\u001a\u0004\b\u0005\u0010\u0007R&\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048\u0006@BX\u0087\u000e¢\u0006\u000e
                                                   \u0000\u0012\u0004\b	\u0010\u0002\u001a\u0004\b\b\u0010\u0007R&\u0010
                                                   \u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048\u0006@BX\u0087\u000e¢\u0006\u000e
                                                   \u0000\u0012\u0004\b\u000b\u0010\u0002\u001a\u0004\b
                                                   \u0010\u0007R&\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048\u0006@BX\u0087\u000e¢\u0006\u000e
                                                   \u0000\u0012\u0004\b\r\u0010\u0002\u001a\u0004\b\f\u0010\u0007R&\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048\u0006@BX\u0087\u000e¢\u0006\u000e
                                                   \u0000\u0012\u0004\b\u000f\u0010\u0002\u001a\u0004\b\u000e\u0010\u0007R&\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048\u0006@BX\u0087\u000e¢\u0006\u000e
                                                   \u0000\u0012\u0004\b\u0011\u0010\u0002\u001a\u0004\b\u0010\u0010\u0007¨\u0006'""" }, d2 = { "Lgg/essential/universal/UDesktop;", "", "()V", "<set-?>", "", "isGnome", "isGnome$annotations", "()Z", "isKde", "isKde$annotations", "isLinux", "isLinux$annotations", "isMac", "isMac$annotations", "isWindows", "isWindows$annotations", "isXdg", "isXdg$annotations", "browse", "uri", "Ljava/net/URI;", "browseDesktop", "edit", "file", "Ljava/io/File;", "editDesktop", "getClipboardString", "", "open", "openDesktop", "openSystemSpecific", "runCommand", "command", "", "checkExitStatus", "([Ljava/lang/String;Z)Z", "setClipboardString", "", "str", "universalcraft" })
public final class UDesktop
{
    @NotNull
    public static final UDesktop INSTANCE;
    private static boolean isLinux;
    private static boolean isXdg;
    private static boolean isKde;
    private static boolean isGnome;
    private static boolean isMac;
    private static boolean isWindows;
    
    private UDesktop() {
        super();
    }
    
    public static final boolean isLinux() {
        return UDesktop.isLinux;
    }
    
    @JvmStatic
    @Deprecated
    public static /* synthetic */ void isLinux$annotations() {
    }
    
    public static final boolean isXdg() {
        return UDesktop.isXdg;
    }
    
    @JvmStatic
    @Deprecated
    public static /* synthetic */ void isXdg$annotations() {
    }
    
    public static final boolean isKde() {
        return UDesktop.isKde;
    }
    
    @JvmStatic
    @Deprecated
    public static /* synthetic */ void isKde$annotations() {
    }
    
    public static final boolean isGnome() {
        return UDesktop.isGnome;
    }
    
    @JvmStatic
    @Deprecated
    public static /* synthetic */ void isGnome$annotations() {
    }
    
    public static final boolean isMac() {
        return UDesktop.isMac;
    }
    
    @JvmStatic
    @Deprecated
    public static /* synthetic */ void isMac$annotations() {
    }
    
    public static final boolean isWindows() {
        return UDesktop.isWindows;
    }
    
    @JvmStatic
    @Deprecated
    public static /* synthetic */ void isWindows$annotations() {
    }
    
    @JvmStatic
    public static final boolean browse(@NotNull final URI uri) {
        Intrinsics.checkNotNullParameter((Object)uri, "uri");
        if (!UDesktop.INSTANCE.browseDesktop(uri)) {
            final UDesktop instance = UDesktop.INSTANCE;
            final String string = uri.toString();
            Intrinsics.checkNotNullExpressionValue((Object)string, "uri.toString()");
            if (!instance.openSystemSpecific(string)) {
                return false;
            }
        }
        return true;
    }
    
    @JvmStatic
    public static final boolean open(@NotNull final File file) {
        Intrinsics.checkNotNullParameter((Object)file, "file");
        if (!UDesktop.INSTANCE.openDesktop(file)) {
            final UDesktop instance = UDesktop.INSTANCE;
            final String path = file.getPath();
            Intrinsics.checkNotNullExpressionValue((Object)path, "file.path");
            if (!instance.openSystemSpecific(path)) {
                return false;
            }
        }
        return true;
    }
    
    @JvmStatic
    public static final boolean edit(@NotNull final File file) {
        Intrinsics.checkNotNullParameter((Object)file, "file");
        if (!UDesktop.INSTANCE.editDesktop(file)) {
            final UDesktop instance = UDesktop.INSTANCE;
            final String path = file.getPath();
            Intrinsics.checkNotNullExpressionValue((Object)path, "file.path");
            if (!instance.openSystemSpecific(path)) {
                return false;
            }
        }
        return true;
    }
    
    private final boolean openSystemSpecific(final String file) {
        boolean b;
        if (UDesktop.isLinux) {
            final Iterable $this$any$iv = CollectionsKt.listOf((Object[])new String[] { "xdg-open", "kde-open", "gnome-open" });
            final int $i$f$any = 0;
            if ($this$any$iv instanceof Collection && ((Collection)$this$any$iv).isEmpty()) {
                b = false;
            }
            else {
                for (final Object element$iv : $this$any$iv) {
                    final String it = (String)element$iv;
                    final int n = 0;
                    if (UDesktop.INSTANCE.runCommand(new String[] { it, file }, true)) {
                        b = true;
                        return b;
                    }
                }
                b = false;
            }
        }
        else {
            b = (UDesktop.isMac ? runCommand$default(this, new String[] { "open", file }, false, 2, null) : (UDesktop.isWindows && runCommand$default(this, new String[] { "explorer", file }, false, 2, null)));
        }
        return b;
    }
    
    private final boolean browseDesktop(final URI uri) {
        boolean b;
        if (!Desktop.isDesktopSupported()) {
            b = false;
        }
        else {
            boolean b2;
            try {
                if (!Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
                    return false;
                }
                Desktop.getDesktop().browse(uri);
                b2 = true;
            }
            catch (final Throwable e) {
                b2 = false;
            }
            b = b2;
        }
        return b;
    }
    
    private final boolean openDesktop(final File file) {
        boolean b;
        if (!Desktop.isDesktopSupported()) {
            b = false;
        }
        else {
            boolean b2;
            try {
                if (!Desktop.getDesktop().isSupported(Desktop.Action.OPEN)) {
                    return false;
                }
                Desktop.getDesktop().open(file);
                b2 = true;
            }
            catch (final Throwable e) {
                b2 = false;
            }
            b = b2;
        }
        return b;
    }
    
    private final boolean editDesktop(final File file) {
        boolean b;
        if (!Desktop.isDesktopSupported()) {
            b = false;
        }
        else {
            boolean b2;
            try {
                if (!Desktop.getDesktop().isSupported(Desktop.Action.EDIT)) {
                    return false;
                }
                Desktop.getDesktop().edit(file);
                b2 = true;
            }
            catch (final Throwable e) {
                b2 = false;
            }
            b = b2;
        }
        return b;
    }
    
    private final boolean runCommand(final String[] command, final boolean checkExitStatus) {
        boolean b;
        try {
            final Process exec = Runtime.getRuntime().exec(command);
            if (exec == null) {
                return false;
            }
            final Process process = exec;
            b = (checkExitStatus ? (!process.waitFor(3L, TimeUnit.SECONDS) || process.exitValue() == 0) : process.isAlive());
        }
        catch (final IOException e) {
            b = false;
        }
        return b;
    }
    
    static /* synthetic */ boolean runCommand$default(final UDesktop uDesktop, final String[] command, boolean checkExitStatus, final int n, final Object o) {
        if ((n & 0x2) != 0x0) {
            checkExitStatus = false;
        }
        return uDesktop.runCommand(command, checkExitStatus);
    }
    
    @JvmStatic
    @NotNull
    public static final String getClipboardString() {
        final String clipboard = UMinecraft.getMinecraft().keyboard.getClipboard();
        Intrinsics.checkNotNullExpressionValue((Object)clipboard, "getMinecraft().keyboard.clipboard");
        return clipboard;
    }
    
    @JvmStatic
    public static final void setClipboardString(@NotNull final String str) {
        Intrinsics.checkNotNullParameter((Object)str, "str");
        UMinecraft.getMinecraft().keyboard.setClipboard(str);
    }
    
    static {
        INSTANCE = new UDesktop();
        String property;
        try {
            property = System.getProperty("os.name");
        }
        catch (final SecurityException e) {
            property = null;
        }
        final String osName = property;
        UDesktop.isLinux = (osName != null && (StringsKt.startsWith$default(osName, "Linux", false, 2, (Object)null) || StringsKt.startsWith$default(osName, "LINUX", false, 2, (Object)null)));
        UDesktop.isMac = (osName != null && StringsKt.startsWith$default(osName, "Mac", false, 2, (Object)null));
        UDesktop.isWindows = (osName != null && StringsKt.startsWith$default(osName, "Windows", false, 2, (Object)null));
        if (UDesktop.isLinux) {
            final String getenv = System.getenv("XDG_SESSION_ID");
            if (getenv != null) {
                final String it = getenv;
                final int n = 0;
                UDesktop.isXdg = (it.length() > 0);
            }
            final String getenv2 = System.getenv("GDMSESSION");
            if (getenv2 != null) {
                final String lowerCase = getenv2.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue((Object)lowerCase, "(this as java.lang.Strin\u2026.toLowerCase(Locale.ROOT)");
                if (lowerCase != null) {
                    final String it2 = lowerCase;
                    final int n2 = 0;
                    UDesktop.isGnome = StringsKt.contains$default((CharSequence)it2, (CharSequence)"gnome", false, 2, (Object)null);
                    UDesktop.isKde = StringsKt.contains$default((CharSequence)it2, (CharSequence)"kde", false, 2, (Object)null);
                }
            }
        }
        else {
            UDesktop.isXdg = false;
            UDesktop.isKde = false;
            UDesktop.isGnome = false;
        }
    }
}
