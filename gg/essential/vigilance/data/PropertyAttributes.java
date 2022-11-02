package gg.essential.vigilance.data;

import kotlin.*;
import java.util.*;
import kotlin.jvm.internal.*;
import org.jetbrains.annotations.*;
import kotlin.collections.*;

@Deprecated(message = "Use PropertyAttributesExt Instead", replaceWith = @ReplaceWith(expression = "PropertyAttributesExt", imports = { "gg.essential.vigilance.data.Property.PropertyAttributesExt" }))
@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b6\b\u0087\b\u0018\u0000 I2\u00020\u0001:\u0001IB¯\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\n\u0012\b\b\u0002\u0010\u0010\u001a\u00020\n\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u0012\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0014¢\u0006\u0002\u0010\u0019J\t\u00103\u001a\u00020\u0003H\u00c6\u0003J\t\u00104\u001a\u00020\nH\u00c6\u0003J\t\u00105\u001a\u00020\nH\u00c6\u0003J\u000f\u00106\u001a\b\u0012\u0004\u0012\u00020\u00050\u0012H\u00c6\u0003J\t\u00107\u001a\u00020\u0014H\u00c6\u0003J\t\u00108\u001a\u00020\u0005H\u00c6\u0003J\t\u00109\u001a\u00020\u0014H\u00c6\u0003J\t\u0010:\u001a\u00020\u0014H\u00c6\u0003J\t\u0010;\u001a\u00020\u0014H\u00c6\u0003J\t\u0010<\u001a\u00020\u0005H\u00c6\u0003J\t\u0010=\u001a\u00020\u0005H\u00c6\u0003J\t\u0010>\u001a\u00020\u0005H\u00c6\u0003J\t\u0010?\u001a\u00020\u0005H\u00c6\u0003J\t\u0010@\u001a\u00020\nH\u00c6\u0003J\t\u0010A\u001a\u00020\nH\u00c6\u0003J\t\u0010B\u001a\u00020\rH\u00c6\u0003J\t\u0010C\u001a\u00020\rH\u00c6\u0003J¹\u0001\u0010D\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\n2\b\b\u0002\u0010\u0010\u001a\u00020\n2\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00052\b\b\u0002\u0010\u0016\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00142\b\b\u0002\u0010\u0018\u001a\u00020\u0014H\u00c6\u0001J\u0013\u0010E\u001a\u00020\u00142\b\u0010F\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010G\u001a\u00020\nH\u00d6\u0001J\t\u0010H\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u000f\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001dR\u001a\u0010\u0018\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001b\"\u0004\b\"\u0010#R\u0011\u0010\u0010\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001fR\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001fR\u0011\u0010\u000e\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001fR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b)\u0010'R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001dR\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u0012¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0011\u0010\u0015\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001dR\u0011\u0010\u0016\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001bR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001dR\u0011\u0010\u0017\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\u001bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b1\u00102¨\u0006J" }, d2 = { "Lgg/essential/vigilance/data/PropertyAttributes;", "", "type", "Lgg/essential/vigilance/data/PropertyType;", "name", "", "category", "subcategory", "description", "min", "", "max", "minF", "", "maxF", "decimalPlaces", "increment", "options", "", "allowAlpha", "", "placeholder", "protected", "triggerActionOnInitialization", "hidden", "(Lgg/essential/vigilance/data/PropertyType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIFFIILjava/util/List;ZLjava/lang/String;ZZZ)V", "getAllowAlpha", "()Z", "getCategory", "()Ljava/lang/String;", "getDecimalPlaces", "()I", "getDescription", "getHidden", "setHidden", "(Z)V", "getIncrement", "getMax", "getMaxF", "()F", "getMin", "getMinF", "getName", "getOptions", "()Ljava/util/List;", "getPlaceholder", "getProtected", "getSubcategory", "getTriggerActionOnInitialization", "getType", "()Lgg/essential/vigilance/data/PropertyType;", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "Companion", "Vigilance" })
public final class PropertyAttributes
{
    @NotNull
    public static final Companion Companion;
    @NotNull
    private final PropertyType type;
    @NotNull
    private final String name;
    @NotNull
    private final String category;
    @NotNull
    private final String subcategory;
    @NotNull
    private final String description;
    private final int min;
    private final int max;
    private final float minF;
    private final float maxF;
    private final int decimalPlaces;
    private final int increment;
    @NotNull
    private final List<String> options;
    private final boolean allowAlpha;
    @NotNull
    private final String placeholder;
    private final boolean protected;
    private final boolean triggerActionOnInitialization;
    private boolean hidden;
    
    public PropertyAttributes(@NotNull final PropertyType type, @NotNull final String name, @NotNull final String category, @NotNull final String subcategory, @NotNull final String description, final int min, final int max, final float minF, final float maxF, final int decimalPlaces, final int increment, @NotNull final List<String> options, final boolean allowAlpha, @NotNull final String placeholder, final boolean protected, final boolean triggerActionOnInitialization, final boolean hidden) {
        Intrinsics.checkNotNullParameter((Object)type, "type");
        Intrinsics.checkNotNullParameter((Object)name, "name");
        Intrinsics.checkNotNullParameter((Object)category, "category");
        Intrinsics.checkNotNullParameter((Object)subcategory, "subcategory");
        Intrinsics.checkNotNullParameter((Object)description, "description");
        Intrinsics.checkNotNullParameter((Object)options, "options");
        Intrinsics.checkNotNullParameter((Object)placeholder, "placeholder");
        super();
        this.type = type;
        this.name = name;
        this.category = category;
        this.subcategory = subcategory;
        this.description = description;
        this.min = min;
        this.max = max;
        this.minF = minF;
        this.maxF = maxF;
        this.decimalPlaces = decimalPlaces;
        this.increment = increment;
        this.options = options;
        this.allowAlpha = allowAlpha;
        this.placeholder = placeholder;
        this.protected = protected;
        this.triggerActionOnInitialization = triggerActionOnInitialization;
        this.hidden = hidden;
    }
    
    public PropertyAttributes(final PropertyType type, final String name, final String category, String subcategory, String description, int min, int max, float minF, float maxF, int decimalPlaces, int increment, List emptyList, boolean allowAlpha, String placeholder, boolean protected1, boolean triggerActionOnInitialization, boolean hidden, final int n, final DefaultConstructorMarker defaultConstructorMarker) {
        if ((n & 0x8) != 0x0) {
            subcategory = "";
        }
        if ((n & 0x10) != 0x0) {
            description = "";
        }
        if ((n & 0x20) != 0x0) {
            min = 0;
        }
        if ((n & 0x40) != 0x0) {
            max = 0;
        }
        if ((n & 0x80) != 0x0) {
            minF = 0.0f;
        }
        if ((n & 0x100) != 0x0) {
            maxF = 0.0f;
        }
        if ((n & 0x200) != 0x0) {
            decimalPlaces = 1;
        }
        if ((n & 0x400) != 0x0) {
            increment = 1;
        }
        if ((n & 0x800) != 0x0) {
            emptyList = CollectionsKt.emptyList();
        }
        if ((n & 0x1000) != 0x0) {
            allowAlpha = true;
        }
        if ((n & 0x2000) != 0x0) {
            placeholder = "";
        }
        if ((n & 0x4000) != 0x0) {
            protected1 = false;
        }
        if ((n & 0x8000) != 0x0) {
            triggerActionOnInitialization = true;
        }
        if ((n & 0x10000) != 0x0) {
            hidden = false;
        }
        this(type, name, category, subcategory, description, min, max, minF, maxF, decimalPlaces, increment, emptyList, allowAlpha, placeholder, protected1, triggerActionOnInitialization, hidden);
    }
    
    @NotNull
    public final PropertyType getType() {
        return this.type;
    }
    
    @NotNull
    public final String getName() {
        return this.name;
    }
    
    @NotNull
    public final String getCategory() {
        return this.category;
    }
    
    @NotNull
    public final String getSubcategory() {
        return this.subcategory;
    }
    
    @NotNull
    public final String getDescription() {
        return this.description;
    }
    
    public final int getMin() {
        return this.min;
    }
    
    public final int getMax() {
        return this.max;
    }
    
    public final float getMinF() {
        return this.minF;
    }
    
    public final float getMaxF() {
        return this.maxF;
    }
    
    public final int getDecimalPlaces() {
        return this.decimalPlaces;
    }
    
    public final int getIncrement() {
        return this.increment;
    }
    
    @NotNull
    public final List<String> getOptions() {
        return this.options;
    }
    
    public final boolean getAllowAlpha() {
        return this.allowAlpha;
    }
    
    @NotNull
    public final String getPlaceholder() {
        return this.placeholder;
    }
    
    public final boolean getProtected() {
        return this.protected;
    }
    
    public final boolean getTriggerActionOnInitialization() {
        return this.triggerActionOnInitialization;
    }
    
    public final boolean getHidden() {
        return this.hidden;
    }
    
    public final void setHidden(final boolean <set-?>) {
        this.hidden = <set-?>;
    }
    
    @NotNull
    public final PropertyType component1() {
        return this.type;
    }
    
    @NotNull
    public final String component2() {
        return this.name;
    }
    
    @NotNull
    public final String component3() {
        return this.category;
    }
    
    @NotNull
    public final String component4() {
        return this.subcategory;
    }
    
    @NotNull
    public final String component5() {
        return this.description;
    }
    
    public final int component6() {
        return this.min;
    }
    
    public final int component7() {
        return this.max;
    }
    
    public final float component8() {
        return this.minF;
    }
    
    public final float component9() {
        return this.maxF;
    }
    
    public final int component10() {
        return this.decimalPlaces;
    }
    
    public final int component11() {
        return this.increment;
    }
    
    @NotNull
    public final List<String> component12() {
        return this.options;
    }
    
    public final boolean component13() {
        return this.allowAlpha;
    }
    
    @NotNull
    public final String component14() {
        return this.placeholder;
    }
    
    public final boolean component15() {
        return this.protected;
    }
    
    public final boolean component16() {
        return this.triggerActionOnInitialization;
    }
    
    public final boolean component17() {
        return this.hidden;
    }
    
    @NotNull
    public final PropertyAttributes copy(@NotNull final PropertyType type, @NotNull final String name, @NotNull final String category, @NotNull final String subcategory, @NotNull final String description, final int min, final int max, final float minF, final float maxF, final int decimalPlaces, final int increment, @NotNull final List<String> options, final boolean allowAlpha, @NotNull final String placeholder, final boolean protected, final boolean triggerActionOnInitialization, final boolean hidden) {
        Intrinsics.checkNotNullParameter((Object)type, "type");
        Intrinsics.checkNotNullParameter((Object)name, "name");
        Intrinsics.checkNotNullParameter((Object)category, "category");
        Intrinsics.checkNotNullParameter((Object)subcategory, "subcategory");
        Intrinsics.checkNotNullParameter((Object)description, "description");
        Intrinsics.checkNotNullParameter((Object)options, "options");
        Intrinsics.checkNotNullParameter((Object)placeholder, "placeholder");
        return new PropertyAttributes(type, name, category, subcategory, description, min, max, minF, maxF, decimalPlaces, increment, options, allowAlpha, placeholder, protected, triggerActionOnInitialization, hidden);
    }
    
    public static /* synthetic */ PropertyAttributes copy$default(final PropertyAttributes propertyAttributes, PropertyType type, String name, String category, String subcategory, String description, int min, int max, float minF, float maxF, int decimalPlaces, int increment, List options, boolean allowAlpha, String placeholder, boolean protected1, boolean triggerActionOnInitialization, boolean hidden, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            type = propertyAttributes.type;
        }
        if ((n & 0x2) != 0x0) {
            name = propertyAttributes.name;
        }
        if ((n & 0x4) != 0x0) {
            category = propertyAttributes.category;
        }
        if ((n & 0x8) != 0x0) {
            subcategory = propertyAttributes.subcategory;
        }
        if ((n & 0x10) != 0x0) {
            description = propertyAttributes.description;
        }
        if ((n & 0x20) != 0x0) {
            min = propertyAttributes.min;
        }
        if ((n & 0x40) != 0x0) {
            max = propertyAttributes.max;
        }
        if ((n & 0x80) != 0x0) {
            minF = propertyAttributes.minF;
        }
        if ((n & 0x100) != 0x0) {
            maxF = propertyAttributes.maxF;
        }
        if ((n & 0x200) != 0x0) {
            decimalPlaces = propertyAttributes.decimalPlaces;
        }
        if ((n & 0x400) != 0x0) {
            increment = propertyAttributes.increment;
        }
        if ((n & 0x800) != 0x0) {
            options = propertyAttributes.options;
        }
        if ((n & 0x1000) != 0x0) {
            allowAlpha = propertyAttributes.allowAlpha;
        }
        if ((n & 0x2000) != 0x0) {
            placeholder = propertyAttributes.placeholder;
        }
        if ((n & 0x4000) != 0x0) {
            protected1 = propertyAttributes.protected;
        }
        if ((n & 0x8000) != 0x0) {
            triggerActionOnInitialization = propertyAttributes.triggerActionOnInitialization;
        }
        if ((n & 0x10000) != 0x0) {
            hidden = propertyAttributes.hidden;
        }
        return propertyAttributes.copy(type, name, category, subcategory, description, min, max, minF, maxF, decimalPlaces, increment, options, allowAlpha, placeholder, protected1, triggerActionOnInitialization, hidden);
    }
    
    @NotNull
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("PropertyAttributes(type=").append(this.type).append(", name=").append(this.name).append(", category=").append(this.category).append(", subcategory=").append(this.subcategory).append(", description=").append(this.description).append(", min=").append(this.min).append(", max=").append(this.max).append(", minF=").append(this.minF).append(", maxF=").append(this.maxF).append(", decimalPlaces=").append(this.decimalPlaces).append(", increment=").append(this.increment).append(", options=");
        sb.append(this.options).append(", allowAlpha=").append(this.allowAlpha).append(", placeholder=").append(this.placeholder).append(", protected=").append(this.protected).append(", triggerActionOnInitialization=").append(this.triggerActionOnInitialization).append(", hidden=").append(this.hidden).append(')');
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        int result = this.type.hashCode();
        result = result * 31 + this.name.hashCode();
        result = result * 31 + this.category.hashCode();
        result = result * 31 + this.subcategory.hashCode();
        result = result * 31 + this.description.hashCode();
        result = result * 31 + Integer.hashCode(this.min);
        result = result * 31 + Integer.hashCode(this.max);
        result = result * 31 + Float.hashCode(this.minF);
        result = result * 31 + Float.hashCode(this.maxF);
        result = result * 31 + Integer.hashCode(this.decimalPlaces);
        result = result * 31 + Integer.hashCode(this.increment);
        result = result * 31 + this.options.hashCode();
        final int n = result * 31;
        int allowAlpha;
        if ((allowAlpha = (this.allowAlpha ? 1 : 0)) != 0) {
            allowAlpha = 1;
        }
        result = n + allowAlpha;
        result = result * 31 + this.placeholder.hashCode();
        final int n2 = result * 31;
        int protected1;
        if ((protected1 = (this.protected ? 1 : 0)) != 0) {
            protected1 = 1;
        }
        result = n2 + protected1;
        final int n3 = result * 31;
        int triggerActionOnInitialization;
        if ((triggerActionOnInitialization = (this.triggerActionOnInitialization ? 1 : 0)) != 0) {
            triggerActionOnInitialization = 1;
        }
        result = n3 + triggerActionOnInitialization;
        final int n4 = result * 31;
        int hidden;
        if ((hidden = (this.hidden ? 1 : 0)) != 0) {
            hidden = 1;
        }
        result = n4 + hidden;
        return result;
    }
    
    @Override
    public boolean equals(@Nullable final Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PropertyAttributes)) {
            return false;
        }
        final PropertyAttributes propertyAttributes = (PropertyAttributes)other;
        return this.type == propertyAttributes.type && Intrinsics.areEqual((Object)this.name, (Object)propertyAttributes.name) && Intrinsics.areEqual((Object)this.category, (Object)propertyAttributes.category) && Intrinsics.areEqual((Object)this.subcategory, (Object)propertyAttributes.subcategory) && Intrinsics.areEqual((Object)this.description, (Object)propertyAttributes.description) && this.min == propertyAttributes.min && this.max == propertyAttributes.max && Intrinsics.areEqual((Object)this.minF, (Object)propertyAttributes.minF) && Intrinsics.areEqual((Object)this.maxF, (Object)propertyAttributes.maxF) && this.decimalPlaces == propertyAttributes.decimalPlaces && this.increment == propertyAttributes.increment && Intrinsics.areEqual((Object)this.options, (Object)propertyAttributes.options) && this.allowAlpha == propertyAttributes.allowAlpha && Intrinsics.areEqual((Object)this.placeholder, (Object)propertyAttributes.placeholder) && this.protected == propertyAttributes.protected && this.triggerActionOnInitialization == propertyAttributes.triggerActionOnInitialization && this.hidden == propertyAttributes.hidden;
    }
    
    static {
        Companion = new Companion(null);
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007" }, d2 = { "Lgg/essential/vigilance/data/PropertyAttributes$Companion;", "", "()V", "fromPropertyAnnotation", "Lgg/essential/vigilance/data/PropertyAttributes;", "property", "Lgg/essential/vigilance/data/Property;", "Vigilance" })
    public static final class Companion
    {
        private Companion() {
            super();
        }
        
        @Deprecated(message = "Use PropertyAttributesExt instead", replaceWith = @ReplaceWith(expression = "PropertyAttributesExt.fromPropertyAnnotation", imports = { "gg.essential.vigilance.data.Property.PropertyAttributesExt.fromPropertyAnnotation" }))
        @NotNull
        @java.lang.Deprecated
        public final PropertyAttributes fromPropertyAnnotation(@NotNull final Property property) {
            Intrinsics.checkNotNullParameter((Object)property, "property");
            return new PropertyAttributes(property.type(), property.name(), property.category(), property.subcategory(), property.description(), property.min(), property.max(), property.minF(), property.maxF(), property.decimalPlaces(), property.increment(), ArraysKt.toList((Object[])property.options()), property.allowAlpha(), property.placeholder(), property.protectedText(), property.triggerActionOnInitialization(), property.hidden());
        }
        
        public Companion(final DefaultConstructorMarker $constructor_marker) {
            this();
        }
    }
}
