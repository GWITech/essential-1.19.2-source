package gg.essential.elementa;

import java.util.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import gg.essential.elementa.dsl.*;
import gg.essential.elementa.font.*;
import java.awt.*;
import gg.essential.elementa.constraints.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0016\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\r\u00105\u001a\u000206H\u0010¢\u0006\u0002\b7J\u0006\u00108\u001a\u00020\u0000J\u0006\u00109\u001a\u00020\u0003J\b\u0010\b\u001a\u00020:H\u0016J\b\u0010\u0016\u001a\u00020;H\u0016J\b\u0010\u001c\u001a\u00020;H\u0016J\b\u0010!\u001a\u00020;H\u0016J\b\u0010%\u001a\u00020;H\u0016J\b\u0010+\u001a\u00020;H\u0016J\b\u00101\u001a\u00020;H\u0016J\u0010\u0010<\u001a\u0002062\u0006\u0010=\u001a\u00020>H\u0002J\u0010\u0010?\u001a\u00020\u00002\u0006\u0010@\u001a\u00020\u0006H\u0016J\u0010\u0010A\u001a\u0002062\u0006\u0010\u0012\u001a\u00020\u000eH\u0016J\u0010\u0010B\u001a\u00020\u00002\u0006\u0010@\u001a\u00020\u0014H\u0016J\u0010\u0010C\u001a\u00020\u00002\u0006\u0010@\u001a\u00020\u001aH\u0016J\u0010\u0010D\u001a\u00020\u00002\u0006\u0010@\u001a\u00020\u0014H\u0016J\u0010\u0010E\u001a\u00020\u00002\u0006\u0010@\u001a\u00020#H\u0016J\u0010\u0010F\u001a\u00020\u00002\u0006\u0010@\u001a\u00020)H\u0016J\u0010\u0010G\u001a\u00020\u00002\u0006\u0010@\u001a\u00020/H\u0016R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR$\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u000e@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R$\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u0014@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R$\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0005\u001a\u00020\u001a@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR$\u0010 \u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u0014@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0017\"\u0004\b\"\u0010\u0019R$\u0010$\u001a\u00020#2\u0006\u0010\u0005\u001a\u00020#@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R$\u0010*\u001a\u00020)2\u0006\u0010\u0005\u001a\u00020)@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R$\u00100\u001a\u00020/2\u0006\u0010\u0005\u001a\u00020/@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104¨\u0006H" }, d2 = { "Lgg/essential/elementa/UIConstraints;", "Ljava/util/Observable;", "component", "Lgg/essential/elementa/UIComponent;", "(Lgg/essential/elementa/UIComponent;)V", "value", "Lgg/essential/elementa/constraints/ColorConstraint;", "color", "getColor", "()Lgg/essential/elementa/constraints/ColorConstraint;", "setColor", "(Lgg/essential/elementa/constraints/ColorConstraint;)V", "getComponent", "()Lgg/essential/elementa/UIComponent;", "Lgg/essential/elementa/font/FontProvider;", "fontProvider", "getFontProvider", "()Lgg/essential/elementa/font/FontProvider;", "setFontProvider", "(Lgg/essential/elementa/font/FontProvider;)V", "Lgg/essential/elementa/constraints/HeightConstraint;", "height", "getHeight", "()Lgg/essential/elementa/constraints/HeightConstraint;", "setHeight", "(Lgg/essential/elementa/constraints/HeightConstraint;)V", "Lgg/essential/elementa/constraints/RadiusConstraint;", "radius", "getRadius", "()Lgg/essential/elementa/constraints/RadiusConstraint;", "setRadius", "(Lgg/essential/elementa/constraints/RadiusConstraint;)V", "textScale", "getTextScale", "setTextScale", "Lgg/essential/elementa/constraints/WidthConstraint;", "width", "getWidth", "()Lgg/essential/elementa/constraints/WidthConstraint;", "setWidth", "(Lgg/essential/elementa/constraints/WidthConstraint;)V", "Lgg/essential/elementa/constraints/XConstraint;", "x", "getX", "()Lgg/essential/elementa/constraints/XConstraint;", "setX", "(Lgg/essential/elementa/constraints/XConstraint;)V", "Lgg/essential/elementa/constraints/YConstraint;", "y", "getY", "()Lgg/essential/elementa/constraints/YConstraint;", "setY", "(Lgg/essential/elementa/constraints/YConstraint;)V", "animationFrame", "", "animationFrame$Elementa", "copy", "finish", "Ljava/awt/Color;", "", "update", "type", "Lgg/essential/elementa/constraints/ConstraintType;", "withColor", "constraint", "withFontProvider", "withHeight", "withRadius", "withTextScale", "withWidth", "withX", "withY", "Elementa" })
public class UIConstraints extends Observable
{
    @NotNull
    private final UIComponent component;
    @NotNull
    private XConstraint x;
    @NotNull
    private YConstraint y;
    @NotNull
    private WidthConstraint width;
    @NotNull
    private HeightConstraint height;
    @NotNull
    private RadiusConstraint radius;
    @NotNull
    private HeightConstraint textScale;
    @NotNull
    private FontProvider fontProvider;
    @NotNull
    private ColorConstraint color;
    
    public UIConstraints(@NotNull final UIComponent component) {
        Intrinsics.checkNotNullParameter((Object)component, "component");
        super();
        this.component = component;
        this.x = UtilitiesKt.pixels$default(0, false, false, 3, null);
        this.y = UtilitiesKt.pixels$default(0, false, false, 3, null);
        this.width = UtilitiesKt.pixels$default(0, false, false, 3, null);
        this.height = UtilitiesKt.pixels$default(0, false, false, 3, null);
        this.radius = UtilitiesKt.pixels$default(0, false, false, 3, null);
        this.textScale = UtilitiesKt.pixel$default(1, false, false, 3, null);
        this.fontProvider = DefaultFonts.getVANILLA_FONT_RENDERER();
        final Color white = Color.WHITE;
        Intrinsics.checkNotNullExpressionValue((Object)white, "WHITE");
        this.color = UtilitiesKt.toConstraint(white);
    }
    
    @NotNull
    protected final UIComponent getComponent() {
        return this.component;
    }
    
    @NotNull
    public final XConstraint getX() {
        return this.x;
    }
    
    public final void setX(@NotNull final XConstraint value) {
        Intrinsics.checkNotNullParameter((Object)value, "value");
        this.x = value;
        this.update(ConstraintType.X);
    }
    
    @NotNull
    public final YConstraint getY() {
        return this.y;
    }
    
    public final void setY(@NotNull final YConstraint value) {
        Intrinsics.checkNotNullParameter((Object)value, "value");
        this.y = value;
        this.update(ConstraintType.Y);
    }
    
    @NotNull
    public final WidthConstraint getWidth() {
        return this.width;
    }
    
    public final void setWidth(@NotNull final WidthConstraint value) {
        Intrinsics.checkNotNullParameter((Object)value, "value");
        this.width = value;
        this.update(ConstraintType.WIDTH);
    }
    
    @NotNull
    public final HeightConstraint getHeight() {
        return this.height;
    }
    
    public final void setHeight(@NotNull final HeightConstraint value) {
        Intrinsics.checkNotNullParameter((Object)value, "value");
        this.height = value;
        this.update(ConstraintType.HEIGHT);
    }
    
    @NotNull
    public final RadiusConstraint getRadius() {
        return this.radius;
    }
    
    public final void setRadius(@NotNull final RadiusConstraint value) {
        Intrinsics.checkNotNullParameter((Object)value, "value");
        this.radius = value;
        this.update(ConstraintType.RADIUS);
    }
    
    @NotNull
    public final HeightConstraint getTextScale() {
        return this.textScale;
    }
    
    public final void setTextScale(@NotNull final HeightConstraint value) {
        Intrinsics.checkNotNullParameter((Object)value, "value");
        this.textScale = value;
        this.update(ConstraintType.TEXT_SCALE);
    }
    
    @NotNull
    public final FontProvider getFontProvider() {
        return this.fontProvider;
    }
    
    public final void setFontProvider(@NotNull final FontProvider value) {
        Intrinsics.checkNotNullParameter((Object)value, "value");
        this.fontProvider = value;
        this.update(ConstraintType.FONT_PROVIDER);
    }
    
    @NotNull
    public final ColorConstraint getColor() {
        return this.color;
    }
    
    public final void setColor(@NotNull final ColorConstraint value) {
        Intrinsics.checkNotNullParameter((Object)value, "value");
        this.color = value;
        this.update(ConstraintType.COLOR);
    }
    
    public float getX() {
        return this.x.getXPosition(this.component);
    }
    
    @NotNull
    public UIConstraints withX(@NotNull final XConstraint constraint) {
        Intrinsics.checkNotNullParameter((Object)constraint, "constraint");
        final UIConstraints $this$withX_u24lambda_u2d0 = this;
        final int n = 0;
        $this$withX_u24lambda_u2d0.setX(constraint);
        return this;
    }
    
    public float getY() {
        return this.y.getYPosition(this.component);
    }
    
    @NotNull
    public UIConstraints withY(@NotNull final YConstraint constraint) {
        Intrinsics.checkNotNullParameter((Object)constraint, "constraint");
        final UIConstraints $this$withY_u24lambda_u2d1 = this;
        final int n = 0;
        $this$withY_u24lambda_u2d1.setY(constraint);
        return this;
    }
    
    public float getWidth() {
        return this.width.getWidth(this.component);
    }
    
    @NotNull
    public UIConstraints withWidth(@NotNull final WidthConstraint constraint) {
        Intrinsics.checkNotNullParameter((Object)constraint, "constraint");
        final UIConstraints $this$withWidth_u24lambda_u2d2 = this;
        final int n = 0;
        $this$withWidth_u24lambda_u2d2.setWidth(constraint);
        return this;
    }
    
    public float getHeight() {
        return this.height.getHeight(this.component);
    }
    
    @NotNull
    public UIConstraints withHeight(@NotNull final HeightConstraint constraint) {
        Intrinsics.checkNotNullParameter((Object)constraint, "constraint");
        final UIConstraints $this$withHeight_u24lambda_u2d3 = this;
        final int n = 0;
        $this$withHeight_u24lambda_u2d3.setHeight(constraint);
        return this;
    }
    
    public float getRadius() {
        return this.radius.getRadius(this.component);
    }
    
    @NotNull
    public UIConstraints withRadius(@NotNull final RadiusConstraint constraint) {
        Intrinsics.checkNotNullParameter((Object)constraint, "constraint");
        final UIConstraints $this$withRadius_u24lambda_u2d4 = this;
        final int n = 0;
        $this$withRadius_u24lambda_u2d4.setRadius(constraint);
        return this;
    }
    
    public float getTextScale() {
        return this.textScale.getTextScale(this.component);
    }
    
    @NotNull
    public UIConstraints withTextScale(@NotNull final HeightConstraint constraint) {
        Intrinsics.checkNotNullParameter((Object)constraint, "constraint");
        final UIConstraints $this$withTextScale_u24lambda_u2d5 = this;
        final int n = 0;
        $this$withTextScale_u24lambda_u2d5.setTextScale(constraint);
        return this;
    }
    
    public void withFontProvider(@NotNull final FontProvider setFontProvider) {
        Intrinsics.checkNotNullParameter((Object)setFontProvider, "setFontProvider");
        this.setFontProvider(setFontProvider);
    }
    
    @NotNull
    public Color getColor() {
        return this.color.getColor(this.component);
    }
    
    @NotNull
    public UIConstraints withColor(@NotNull final ColorConstraint constraint) {
        Intrinsics.checkNotNullParameter((Object)constraint, "constraint");
        final UIConstraints $this$withColor_u24lambda_u2d6 = this;
        final int n = 0;
        $this$withColor_u24lambda_u2d6.setColor(constraint);
        return this;
    }
    
    public void animationFrame$Elementa() {
        this.x.animationFrame();
        this.y.animationFrame();
        this.width.animationFrame();
        this.height.animationFrame();
        this.radius.animationFrame();
        this.color.animationFrame();
        this.textScale.animationFrame();
    }
    
    @NotNull
    public final UIComponent finish() {
        return this.component;
    }
    
    @NotNull
    public final UIConstraints copy() {
        final UIConstraints $this$copy_u24lambda_u2d7;
        final UIConstraints uiConstraints = $this$copy_u24lambda_u2d7 = new UIConstraints(this.component);
        final int n = 0;
        $this$copy_u24lambda_u2d7.setX(this.getX());
        $this$copy_u24lambda_u2d7.setY(this.getY());
        $this$copy_u24lambda_u2d7.setWidth(this.getWidth());
        $this$copy_u24lambda_u2d7.setHeight(this.getHeight());
        $this$copy_u24lambda_u2d7.setRadius(this.getRadius());
        $this$copy_u24lambda_u2d7.setColor(this.getColor());
        return uiConstraints;
    }
    
    private final void update(final ConstraintType type) {
        this.setChanged();
        this.notifyObservers(type);
    }
}
