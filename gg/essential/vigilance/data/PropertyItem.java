package gg.essential.vigilance.data;

import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import kotlin.collections.*;
import java.util.*;
import java.awt.*;
import gg.essential.vigilance.gui.settings.*;
import kotlin.*;
import gg.essential.vigilance.gui.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\u0005H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000e" }, d2 = { "Lgg/essential/vigilance/data/PropertyItem;", "Lgg/essential/vigilance/data/CategoryItem;", "data", "Lgg/essential/vigilance/data/PropertyData;", "subcategory", "", "(Lgg/essential/vigilance/data/PropertyData;Ljava/lang/String;)V", "getData", "()Lgg/essential/vigilance/data/PropertyData;", "getSubcategory", "()Ljava/lang/String;", "toSettingsObject", "Lgg/essential/vigilance/gui/Setting;", "toString", "Vigilance" })
public final class PropertyItem extends CategoryItem
{
    @NotNull
    private final PropertyData data;
    @NotNull
    private final String subcategory;
    
    public PropertyItem(@NotNull final PropertyData data, @NotNull final String subcategory) {
        Intrinsics.checkNotNullParameter((Object)data, "data");
        Intrinsics.checkNotNullParameter((Object)subcategory, "subcategory");
        super(null);
        this.data = data;
        this.subcategory = subcategory;
    }
    
    @NotNull
    public final PropertyData getData() {
        return this.data;
    }
    
    @NotNull
    public final String getSubcategory() {
        return this.subcategory;
    }
    
    @NotNull
    @Override
    public Setting toSettingsObject() {
        final SettingComponent component = switch (WhenMappings.$EnumSwitchMapping$0[this.data.getDataType().ordinal()]) {
            case 1 -> new SwitchComponent(this.data.getAsBoolean());
            case 2 -> (SettingComponent)new CheckboxComponent(this.data.getAsBoolean());
            case 3 -> {
                final PropertyData this_$iv = this.data;
                final int $i$f$getValue = 0;
                final Object value = this_$iv.getValue().getValue(this_$iv.getInstance());
                if (value == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
                }
                yield (SettingComponent)new PercentSliderComponent(((Number)value).floatValue());
            }
            case 4 -> {
                final PropertyData this_$iv = this.data;
                final int $i$f$getValue = 0;
                final Object value2 = this_$iv.getValue().getValue(this_$iv.getInstance());
                if (value2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
                }
                yield (SettingComponent)new SliderComponent(((Number)value2).intValue(), this.data.getAttributesExt().getMin(), this.data.getAttributesExt().getMax());
            }
            case 5 -> {
                final PropertyData this_$iv = this.data;
                final int $i$f$getValue = 0;
                final Object value3 = this_$iv.getValue().getValue(this_$iv.getInstance());
                if (value3 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
                }
                yield (SettingComponent)new DecimalSliderComponent(((Number)value3).floatValue(), this.data.getAttributesExt().getMinF(), this.data.getAttributesExt().getMaxF(), this.data.getAttributesExt().getDecimalPlaces());
            }
            case 6 -> {
                final PropertyData this_$iv = this.data;
                final int $i$f$getValue = 0;
                final Object value4 = this_$iv.getValue().getValue(this_$iv.getInstance());
                if (value4 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
                }
                yield (SettingComponent)new NumberComponent(((Number)value4).intValue(), this.data.getAttributesExt().getMin(), this.data.getAttributesExt().getMax(), this.data.getAttributesExt().getIncrement());
            }
            case 7 -> {
                final PropertyData this_$iv = this.data;
                final int $i$f$getValue = 0;
                final Object value5 = this_$iv.getValue().getValue(this_$iv.getInstance());
                if (value5 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
                }
                yield new SelectorComponent(((Number)value5).intValue(), CollectionsKt.toList((Iterable)this.data.getAttributesExt().getOptions()));
            }
            case 8 -> {
                final PropertyData this_$iv = this.data;
                final int $i$f$getValue = 0;
                final Object value6 = this_$iv.getValue().getValue(this_$iv.getInstance());
                if (value6 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.awt.Color");
                }
                yield (SettingComponent)new ColorComponent((Color)value6, this.data.getAttributesExt().getAllowAlpha());
            }
            case 9 -> {
                final PropertyData this_$iv = this.data;
                final int $i$f$getValue = 0;
                final Object value7 = this_$iv.getValue().getValue(this_$iv.getInstance());
                if (value7 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                yield (SettingComponent)new TextComponent((String)value7, this.data.getAttributesExt().getPlaceholder(), false, this.data.getAttributesExt().getProtected());
            }
            case 10 -> {
                final PropertyData this_$iv = this.data;
                final int $i$f$getValue = 0;
                final Object value8 = this_$iv.getValue().getValue(this_$iv.getInstance());
                if (value8 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                yield (SettingComponent)new TextComponent((String)value8, this.data.getAttributesExt().getPlaceholder(), true, false);
            }
            case 11 -> new ButtonComponent(this.data.getAttributesExt().getPlaceholder(), this.data);
            case 12 -> {
                final Class propertyInfoClass = this.data.getAttributesExt().getCustomPropertyInfo();
                final PropertyInfo propertyInfo = propertyInfoClass.getConstructor((Class<?>[])new Class[0]).newInstance(new Object[0]);
                final PropertyData this_$iv2 = this.data;
                final int $i$f$getValue2 = 0;
                yield propertyInfo.createSettingComponent(this_$iv2.getValue().getValue(this_$iv2.getInstance()));
            }
            default -> throw new NoWhenBranchMatchedException();
        };
        return new DataBackedSetting(this.data, component);
    }
    
    @NotNull
    @Override
    public String toString() {
        return this.data.getAttributesExt().getType() + " \"" + this.data.getAttributesExt().getName() + '\"';
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48)
    public final synthetic class WhenMappings
    {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        
        static {
            final int[] $EnumSwitchMapping$ = new int[PropertyType.values().length];
            $EnumSwitchMapping$[PropertyType.SWITCH.ordinal()] = 1;
            $EnumSwitchMapping$[PropertyType.CHECKBOX.ordinal()] = 2;
            $EnumSwitchMapping$[PropertyType.PERCENT_SLIDER.ordinal()] = 3;
            $EnumSwitchMapping$[PropertyType.SLIDER.ordinal()] = 4;
            $EnumSwitchMapping$[PropertyType.DECIMAL_SLIDER.ordinal()] = 5;
            $EnumSwitchMapping$[PropertyType.NUMBER.ordinal()] = 6;
            $EnumSwitchMapping$[PropertyType.SELECTOR.ordinal()] = 7;
            $EnumSwitchMapping$[PropertyType.COLOR.ordinal()] = 8;
            $EnumSwitchMapping$[PropertyType.TEXT.ordinal()] = 9;
            $EnumSwitchMapping$[PropertyType.PARAGRAPH.ordinal()] = 10;
            $EnumSwitchMapping$[PropertyType.BUTTON.ordinal()] = 11;
            $EnumSwitchMapping$[PropertyType.CUSTOM.ordinal()] = 12;
            $EnumSwitchMapping$0 = $EnumSwitchMapping$;
        }
    }
}
