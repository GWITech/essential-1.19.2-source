package gg.essential.api.gui;

import kotlin.jvm.functions.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import gg.essential.elementa.state.*;
import kotlin.jvm.internal.*;
import gg.essential.elementa.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000@
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0000
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0002
                                                   \u0002\b\u0003
                                                   \u0002\u0010\u0007
                                                   \u0002\b\u0005
                                                   \u0002\u0018\u0002
                                                   \u0002\b\f
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u000b
                                                   \u0002\b\u000b
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010&\u001a\u00020\u00002\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*H&J\u0010\u0010+\u001a\u00020\u00002\u0006\u0010,\u001a\u00020\u000eH\u0016R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001a\u00020\bX¦\u000e¢\u0006\f\u001a\u0004\b	\u0010
                                                   "\u0004\b\u000b\u0010\fR\u0018\u0010\r\u001a\u00020\u000eX¦\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\u0010"\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\u0006"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0006"\u0004\b\u0019\u0010\u0016R\u001e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bX¦\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u001e"\u0004\b\u001f\u0010 R\u0018\u0010!\u001a\u00020\u001cX¦\u000e¢\u0006\f\u001a\u0004\b"\u0010#"\u0004\b$\u0010%\u00f8\u0001\u0000\u0082\u0002\u0006
                                                   \u0004\b!0\u0001¨\u0006-\u00c0\u0006\u0001""" }, d2 = { "Lgg/essential/api/gui/NotificationBuilder;", "", "dismissNotification", "Lkotlin/Function0;", "", "getDismissNotification", "()Lkotlin/jvm/functions/Function0;", "duration", "", "getDuration", "()F", "setDuration", "(F)V", "elementaVersion", "Lgg/essential/elementa/ElementaVersion;", "getElementaVersion", "()Lgg/essential/elementa/ElementaVersion;", "setElementaVersion", "(Lgg/essential/elementa/ElementaVersion;)V", "onAction", "getOnAction", "setOnAction", "(Lkotlin/jvm/functions/Function0;)V", "onClose", "getOnClose", "setOnClose", "timerEnabled", "Lgg/essential/elementa/state/State;", "", "getTimerEnabled", "()Lgg/essential/elementa/state/State;", "setTimerEnabled", "(Lgg/essential/elementa/state/State;)V", "trimMessage", "getTrimMessage", "()Z", "setTrimMessage", "(Z)V", "withCustomComponent", "slot", "Lgg/essential/api/gui/Slot;", "component", "Lgg/essential/elementa/UIComponent;", "withElementaVersion", "version", "essential-api" })
public interface NotificationBuilder
{
    float getDuration();
    
    void setDuration(final float p0);
    
    @NotNull
    Function0<Unit> getOnAction();
    
    void setOnAction(@NotNull final Function0<Unit> p0);
    
    @NotNull
    Function0<Unit> getOnClose();
    
    void setOnClose(@NotNull final Function0<Unit> p0);
    
    @NotNull
    ElementaVersion getElementaVersion();
    
    void setElementaVersion(@NotNull final ElementaVersion p0);
    
    @NotNull
    State<Boolean> getTimerEnabled();
    
    void setTimerEnabled(@NotNull final State<Boolean> p0);
    
    boolean getTrimMessage();
    
    void setTrimMessage(final boolean p0);
    
    @NotNull
    Function0<Unit> getDismissNotification();
    
    @NotNull
    default NotificationBuilder withElementaVersion(@NotNull final ElementaVersion version) {
        Intrinsics.checkNotNullParameter((Object)version, "version");
        final NotificationBuilder $this$withElementaVersion_u24lambda_u2d0 = this;
        $this$withElementaVersion_u24lambda_u2d0.setElementaVersion(version);
        return this;
    }
    
    @NotNull
    NotificationBuilder withCustomComponent(@NotNull final Slot p0, @NotNull final UIComponent p1);
}
