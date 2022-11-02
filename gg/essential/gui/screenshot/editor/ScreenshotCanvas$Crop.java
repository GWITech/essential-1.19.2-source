package gg.essential.gui.screenshot.editor;

import kotlin.*;
import kotlin.jvm.internal.*;
import gg.essential.elementa.state.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u00002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0000
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0007
                                                   \u0002\b\u0015
                                                   \u0002\u0010\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0010\u000b
                                                   \u0000
                                                   \u0002\u0010\b
                                                   \u0002\b\u0002
                                                   \u0002\u0010\u000e
                                                   \u0000\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\bJ\u0006\u0010\u0013\u001a\u00020\u0000J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003JI\u0010\u0018\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0001J\u000e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0000J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J	\u0010\u001e\u001a\u00020\u001fH\u00d6\u0001J\u0006\u0010 \u001a\u00020\u001aJ\b\u0010!\u001a\u00020"H\u0016R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0086\u000e¢\u0006\u000e
                                                   \u0000\u001a\u0004\b	\u0010
                                                   "\u0004\b\u000b\u0010\fR \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0086\u000e¢\u0006\u000e
                                                   \u0000\u001a\u0004\b\r\u0010
                                                   "\u0004\b\u000e\u0010\fR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0086\u000e¢\u0006\u000e
                                                   \u0000\u001a\u0004\b\u000f\u0010
                                                   "\u0004\b\u0010\u0010\fR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0086\u000e¢\u0006\u000e
                                                   \u0000\u001a\u0004\b\u0011\u0010
                                                   "\u0004\b\u0012\u0010\f¨\u0006#""" }, d2 = { "Lgg/essential/gui/screenshot/editor/ScreenshotCanvas$Crop;", "", "left", "Lgg/essential/elementa/state/State;", "", "right", "top", "bottom", "(Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;)V", "getBottom", "()Lgg/essential/elementa/state/State;", "setBottom", "(Lgg/essential/elementa/state/State;)V", "getLeft", "setLeft", "getRight", "setRight", "getTop", "setTop", "clone", "component1", "component2", "component3", "component4", "copy", "copyFrom", "", "other", "equals", "", "hashCode", "", "reset", "toString", "", "essential" })
public static final class Crop
{
    @NotNull
    private State<Float> left;
    @NotNull
    private State<Float> right;
    @NotNull
    private State<Float> top;
    @NotNull
    private State<Float> bottom;
    
    public Crop(@NotNull final State<Float> left, @NotNull final State<Float> right, @NotNull final State<Float> top, @NotNull final State<Float> bottom) {
        Intrinsics.checkNotNullParameter((Object)left, "left");
        Intrinsics.checkNotNullParameter((Object)right, "right");
        Intrinsics.checkNotNullParameter((Object)top, "top");
        Intrinsics.checkNotNullParameter((Object)bottom, "bottom");
        super();
        this.left = left;
        this.right = right;
        this.top = top;
        this.bottom = bottom;
    }
    
    public Crop(final byte b) {
        this(new BasicState<Float>(0.0f), new BasicState<Float>(1.0f), new BasicState<Float>(0.0f), new BasicState<Float>(1.0f));
    }
    
    @NotNull
    public final State<Float> getLeft() {
        return this.left;
    }
    
    @NotNull
    public final State<Float> getRight() {
        return this.right;
    }
    
    @NotNull
    public final State<Float> getTop() {
        return this.top;
    }
    
    @NotNull
    public final State<Float> getBottom() {
        return this.bottom;
    }
    
    @NotNull
    @Override
    public String toString() {
        return "Crop[left=" + this.left.get() + ",right=" + this.right.get() + ",top=" + this.top.get() + ",bottom=" + this.bottom.get();
    }
    
    @Override
    public boolean equals(@Nullable final Object other) {
        return other instanceof Crop && ((Crop)other).left.get().floatValue() == this.left.get().floatValue() && ((Crop)other).right.get().floatValue() == this.right.get().floatValue() && ((Crop)other).top.get().floatValue() == this.top.get().floatValue() && ((Crop)other).bottom.get().floatValue() == this.bottom.get().floatValue();
    }
    
    public final void reset() {
        this.left.set(0.0f);
        this.right.set(1.0f);
        this.top.set(0.0f);
        this.bottom.set(1.0f);
    }
    
    @NotNull
    public final Crop clone() {
        return new Crop(new BasicState<Float>(this.left.get()), new BasicState<Float>(this.right.get()), new BasicState<Float>(this.top.get()), new BasicState<Float>(this.bottom.get()));
    }
    
    public final void copyFrom(@NotNull final Crop other) {
        Intrinsics.checkNotNullParameter((Object)other, "other");
        this.left.set(other.left.get());
        this.right.set(other.right.get());
        this.top.set(other.top.get());
        this.bottom.set(other.bottom.get());
    }
    
    @Override
    public int hashCode() {
        int result = this.left.hashCode();
        result = result * 31 + this.right.hashCode();
        result = result * 31 + this.top.hashCode();
        result = result * 31 + this.bottom.hashCode();
        return result;
    }
    
    public Crop() {
        this((byte)0);
    }
}
