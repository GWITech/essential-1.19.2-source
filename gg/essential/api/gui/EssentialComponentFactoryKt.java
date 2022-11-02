package gg.essential.api.gui;

import gg.essential.elementa.state.*;
import kotlin.reflect.*;
import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;
import kotlin.*;
import gg.essential.elementa.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 2, xi = 48, d1 = { """
                                                   \u0000@
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u0000
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0005\u001a)\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0017\u0010\u0003\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007H\u0086\b\u00f8\u0001\u0000\u001a)\u0010\b\u001a\u00020\u0001*\u00020\u00022\u0017\u0010\u0003\u001a\u0013\u0012\u0004\u0012\u00020	\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007H\u0086\b\u00f8\u0001\u0000\u001a)\u0010
                                                   \u001a\u00020\u0001*\u00020\u00022\u0017\u0010\u0003\u001a\u0013\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007H\u0087\b\u00f8\u0001\u0000\u001a2\u0010\f\u001a\u0002H\r"\u0004\b\u0000\u0010\r*\b\u0012\u0004\u0012\u0002H\r0\u000e2\u0006\u0010\u000f\u001a\u00020\u00102
                                                   \u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0012H\u0082\u0002¢\u0006\u0002\u0010\u0013\u001a:\u0010\u0014\u001a\u00020\u0006"\u0004\b\u0000\u0010\r*\b\u0012\u0004\u0012\u0002H\r0\u000e2\u0006\u0010\u000f\u001a\u00020\u00102
                                                   \u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u00122\u0006\u0010\u0015\u001a\u0002H\rH\u0082\u0002¢\u0006\u0002\u0010\u0016\u0082\u0002\u0007
                                                   \u0005\b\u009920\u0001¨\u0006\u0017""" }, d2 = { "buildConfirmationModal", "Lgg/essential/elementa/UIComponent;", "Lgg/essential/api/gui/EssentialComponentFactory;", "block", "Lkotlin/Function1;", "Lgg/essential/api/gui/ConfirmationModalBuilder;", "", "Lkotlin/ExtensionFunctionType;", "buildEmulatedPlayer", "Lgg/essential/api/gui/EmulatedPlayerBuilder;", "buildIconButton", "Lgg/essential/api/gui/IconButtonBuilder;", "getValue", "T", "Lgg/essential/elementa/state/State;", "obj", "", "property", "Lkotlin/reflect/KProperty;", "(Lgg/essential/elementa/state/State;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;", "setValue", "t", "(Lgg/essential/elementa/state/State;Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V", "essential-api" })
public final class EssentialComponentFactoryKt
{
    private static final <T> void setValue(final State<T> $this$setValue, final Object obj, final KProperty<?> property, final T t) {
        Intrinsics.checkNotNullParameter((Object)$this$setValue, "<this>");
        $this$setValue.set(t);
    }
    
    private static final <T> T getValue(final State<T> $this$getValue, final Object obj, final KProperty<?> property) {
        Intrinsics.checkNotNullParameter((Object)$this$getValue, "<this>");
        return $this$getValue.get();
    }
    
    @NotNull
    public static final UIComponent buildEmulatedPlayer(@NotNull final EssentialComponentFactory $this$buildEmulatedPlayer, @NotNull final Function1<? super EmulatedPlayerBuilder, Unit> block) {
        Intrinsics.checkNotNullParameter((Object)$this$buildEmulatedPlayer, "<this>");
        Intrinsics.checkNotNullParameter((Object)block, "block");
        final EmulatedPlayerBuilder emulatedPlayerBuilder = new EmulatedPlayerBuilder();
        block.invoke((Object)emulatedPlayerBuilder);
        return emulatedPlayerBuilder.build($this$buildEmulatedPlayer);
    }
    
    @NotNull
    public static final UIComponent buildConfirmationModal(@NotNull final EssentialComponentFactory $this$buildConfirmationModal, @NotNull final Function1<? super ConfirmationModalBuilder, Unit> block) {
        Intrinsics.checkNotNullParameter((Object)$this$buildConfirmationModal, "<this>");
        Intrinsics.checkNotNullParameter((Object)block, "block");
        final ConfirmationModalBuilder confirmationModalBuilder = new ConfirmationModalBuilder();
        block.invoke((Object)confirmationModalBuilder);
        return confirmationModalBuilder.build($this$buildConfirmationModal);
    }
    
    @ApiStatus.Internal
    @NotNull
    public static final UIComponent buildIconButton(@NotNull final EssentialComponentFactory $this$buildIconButton, @NotNull final Function1<? super IconButtonBuilder, Unit> block) {
        Intrinsics.checkNotNullParameter((Object)$this$buildIconButton, "<this>");
        Intrinsics.checkNotNullParameter((Object)block, "block");
        final IconButtonBuilder iconButtonBuilder = new IconButtonBuilder();
        block.invoke((Object)iconButtonBuilder);
        return iconButtonBuilder.build($this$buildIconButton);
    }
    
    public static final /* synthetic */ Object access$getValue(final State $receiver, final Object obj, final KProperty property) {
        return getValue((State<Object>)$receiver, obj, (KProperty<?>)property);
    }
    
    public static final /* synthetic */ void access$setValue(final State $receiver, final Object obj, final KProperty property, final Object t) {
        setValue($receiver, obj, (KProperty<?>)property, t);
    }
}
