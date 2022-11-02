package gg.essential.vigilance.data;

import org.jetbrains.annotations.*;
import java.util.*;
import kotlin.jvm.internal.*;
import kotlin.collections.*;
import kotlin.*;
import kotlin.jvm.*;
import gg.essential.vigilance.impl.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b)\u0018\u0000 L2\u00020\u0001:\u0001LB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u00c1\u0001\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\r\u0012\b\b\u0002\u0010\u0013\u001a\u00020\r\u0012\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u0015\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u0018\u001a\u00020\b\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0017\u0012\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\b0\u0015¢\u0006\u0002\u0010\u001dB\u00df\u0001\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\r\u0012\b\b\u0002\u0010\u0013\u001a\u00020\r\u0012\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u0015\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u0018\u001a\u00020\b\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0017\u0012\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\b0\u0015\u0012\b\b\u0002\u0010\u001e\u001a\u00020\b\u0012\b\b\u0002\u0010\u001f\u001a\u00020\b\u0012\b\b\u0002\u0010 \u001a\u00020\b¢\u0006\u0002\u0010!B\u00ef\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\r\u0012\b\b\u0002\u0010\u0013\u001a\u00020\r\u0012\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u0015\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u0018\u001a\u00020\b\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0017\u0012\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\b0\u0015\u0012\b\b\u0002\u0010\u001e\u001a\u00020\b\u0012\b\b\u0002\u0010\u001f\u001a\u00020\b\u0012\b\b\u0002\u0010 \u001a\u00020\b\u0012\u0010\b\u0002\u0010\"\u001a\n\u0012\u0006\b\u0001\u0012\u00020$0#¢\u0006\u0002\u0010%R\u0011\u0010\u0016\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0019\u0010\"\u001a\n\u0012\u0006\b\u0001\u0012\u00020$0#¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0011\u0010\u0012\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0011\u0010\u000b\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b.\u0010)R\u001a\u0010\u001b\u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010'\"\u0004\b0\u00101R\u000e\u0010\u001f\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0013\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b2\u0010-R\u0014\u00103\u001a\u00020\b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b4\u0010)R\u0014\u00105\u001a\u00020\b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b6\u0010)R\u0014\u00107\u001a\u00020\b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b8\u0010)R\u001a\u00109\u001a\b\u0012\u0004\u0012\u00020\b0\u00158@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;R\u0014\u0010<\u001a\u00020\b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b=\u0010)R\u0011\u0010\u000e\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b>\u0010-R\u0011\u0010\u0011\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b?\u0010@R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\bA\u0010-R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\bB\u0010@R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\bC\u0010)R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u0015¢\u0006\b\n\u0000\u001a\u0004\bD\u0010;R\u0011\u0010\u0018\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\bE\u0010)R\u0011\u0010\u0019\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\bF\u0010'R\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\b0\u0015¢\u0006\b\n\u0000\u001a\u0004\bG\u0010;R\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\bH\u0010)R\u0011\u0010\u001a\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\bI\u0010'R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010K¨\u0006M" }, d2 = { "Lgg/essential/vigilance/data/PropertyAttributesExt;", "", "propertyAttributes", "Lgg/essential/vigilance/data/PropertyAttributes;", "(Lgg/essential/vigilance/data/PropertyAttributes;)V", "type", "Lgg/essential/vigilance/data/PropertyType;", "name", "", "category", "subcategory", "description", "min", "", "max", "minF", "", "maxF", "decimalPlaces", "increment", "options", "", "allowAlpha", "", "placeholder", "protected", "triggerActionOnInitialization", "hidden", "searchTags", "(Lgg/essential/vigilance/data/PropertyType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIFFIILjava/util/List;ZLjava/lang/String;ZZZLjava/util/List;)V", "i18nName", "i18nCategory", "i18nSubcategory", "(Lgg/essential/vigilance/data/PropertyType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIFFIILjava/util/List;ZLjava/lang/String;ZZZLjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "customPropertyInfo", "Ljava/lang/Class;", "Lgg/essential/vigilance/data/PropertyInfo;", "(Lgg/essential/vigilance/data/PropertyType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIFFIILjava/util/List;ZLjava/lang/String;ZZZLjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;)V", "getAllowAlpha", "()Z", "getCategory", "()Ljava/lang/String;", "getCustomPropertyInfo", "()Ljava/lang/Class;", "getDecimalPlaces", "()I", "getDescription", "getHidden", "setHidden", "(Z)V", "getIncrement", "localizedCategory", "getLocalizedCategory$Vigilance", "localizedDescription", "getLocalizedDescription$Vigilance", "localizedName", "getLocalizedName$Vigilance", "localizedSearchTags", "getLocalizedSearchTags$Vigilance", "()Ljava/util/List;", "localizedSubcategory", "getLocalizedSubcategory$Vigilance", "getMax", "getMaxF", "()F", "getMin", "getMinF", "getName", "getOptions", "getPlaceholder", "getProtected", "getSearchTags", "getSubcategory", "getTriggerActionOnInitialization", "getType", "()Lgg/essential/vigilance/data/PropertyType;", "Companion", "Vigilance" })
public final class PropertyAttributesExt
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
    @NotNull
    private final List<String> searchTags;
    @NotNull
    private final String i18nName;
    @NotNull
    private final String i18nCategory;
    @NotNull
    private final String i18nSubcategory;
    @NotNull
    private final Class<? extends PropertyInfo> customPropertyInfo;
    
    public PropertyAttributesExt(@NotNull final PropertyType type, @NotNull final String name, @NotNull final String category, @NotNull final String subcategory, @NotNull final String description, final int min, final int max, final float minF, final float maxF, final int decimalPlaces, final int increment, @NotNull final List<String> options, final boolean allowAlpha, @NotNull final String placeholder, final boolean protected, final boolean triggerActionOnInitialization, final boolean hidden, @NotNull final List<String> searchTags, @NotNull final String i18nName, @NotNull final String i18nCategory, @NotNull final String i18nSubcategory, @NotNull final Class<? extends PropertyInfo> customPropertyInfo) {
        Intrinsics.checkNotNullParameter((Object)type, "type");
        Intrinsics.checkNotNullParameter((Object)name, "name");
        Intrinsics.checkNotNullParameter((Object)category, "category");
        Intrinsics.checkNotNullParameter((Object)subcategory, "subcategory");
        Intrinsics.checkNotNullParameter((Object)description, "description");
        Intrinsics.checkNotNullParameter((Object)options, "options");
        Intrinsics.checkNotNullParameter((Object)placeholder, "placeholder");
        Intrinsics.checkNotNullParameter((Object)searchTags, "searchTags");
        Intrinsics.checkNotNullParameter((Object)i18nName, "i18nName");
        Intrinsics.checkNotNullParameter((Object)i18nCategory, "i18nCategory");
        Intrinsics.checkNotNullParameter((Object)i18nSubcategory, "i18nSubcategory");
        Intrinsics.checkNotNullParameter((Object)customPropertyInfo, "customPropertyInfo");
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
        this.searchTags = searchTags;
        this.i18nName = i18nName;
        this.i18nCategory = i18nCategory;
        this.i18nSubcategory = i18nSubcategory;
        this.customPropertyInfo = customPropertyInfo;
    }
    
    public PropertyAttributesExt(final PropertyType type, final String name, final String category, String subcategory, String description, int min, int max, float minF, float maxF, int decimalPlaces, int increment, List emptyList, boolean allowAlpha, String placeholder, boolean protected1, boolean triggerActionOnInitialization, boolean hidden, List emptyList2, String i18nName, String i18nCategory, String i18nSubcategory, Class customPropertyInfo, final int n, final DefaultConstructorMarker defaultConstructorMarker) {
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
        if ((n & 0x20000) != 0x0) {
            emptyList2 = CollectionsKt.emptyList();
        }
        if ((n & 0x40000) != 0x0) {
            i18nName = name;
        }
        if ((n & 0x80000) != 0x0) {
            i18nCategory = category;
        }
        if ((n & 0x100000) != 0x0) {
            i18nSubcategory = subcategory;
        }
        if ((n & 0x200000) != 0x0) {
            customPropertyInfo = Void.class;
        }
        this(type, name, category, subcategory, description, min, max, minF, maxF, decimalPlaces, increment, emptyList, allowAlpha, placeholder, protected1, triggerActionOnInitialization, hidden, emptyList2, i18nName, i18nCategory, i18nSubcategory, (Class<? extends PropertyInfo>)customPropertyInfo);
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
    public final List<String> getSearchTags() {
        return this.searchTags;
    }
    
    @NotNull
    public final Class<? extends PropertyInfo> getCustomPropertyInfo() {
        return this.customPropertyInfo;
    }
    
    public PropertyAttributesExt(@NotNull final PropertyAttributes propertyAttributes) {
        Intrinsics.checkNotNullParameter((Object)propertyAttributes, "propertyAttributes");
        this(propertyAttributes.getType(), propertyAttributes.getName(), propertyAttributes.getCategory(), propertyAttributes.getSubcategory(), propertyAttributes.getDescription(), propertyAttributes.getMin(), propertyAttributes.getMax(), propertyAttributes.getMinF(), propertyAttributes.getMaxF(), propertyAttributes.getDecimalPlaces(), propertyAttributes.getIncrement(), CollectionsKt.toList((Iterable)propertyAttributes.getOptions()), propertyAttributes.getAllowAlpha(), propertyAttributes.getPlaceholder(), propertyAttributes.getProtected(), propertyAttributes.getTriggerActionOnInitialization(), propertyAttributes.getHidden(), CollectionsKt.emptyList(), null, null, null, null, 3932160, null);
    }
    
    @Deprecated(message = "", level = DeprecationLevel.HIDDEN)
    @JvmOverloads
    @java.lang.Deprecated
    public PropertyAttributesExt(final PropertyType type, final String name, final String category, final String subcategory, final String description, final int min, final int max, final float minF, final float maxF, final int decimalPlaces, final int increment, final List options, final boolean allowAlpha, final String placeholder, final boolean protected, final boolean triggerActionOnInitialization, final boolean hidden, final List searchTags) {
        Intrinsics.checkNotNullParameter((Object)type, "type");
        Intrinsics.checkNotNullParameter((Object)name, "name");
        Intrinsics.checkNotNullParameter((Object)category, "category");
        Intrinsics.checkNotNullParameter((Object)subcategory, "subcategory");
        Intrinsics.checkNotNullParameter((Object)description, "description");
        Intrinsics.checkNotNullParameter((Object)options, "options");
        Intrinsics.checkNotNullParameter((Object)placeholder, "placeholder");
        Intrinsics.checkNotNullParameter((Object)searchTags, "searchTags");
        this(type, name, category, subcategory, description, min, max, minF, maxF, decimalPlaces, increment, options, allowAlpha, placeholder, protected, triggerActionOnInitialization, hidden, searchTags, name, null, null, null, 3670016, null);
    }
    
    @java.lang.Deprecated
    public PropertyAttributesExt(final PropertyType type, final String name, final String category, String subcategory, String description, int min, int max, float minF, float maxF, int decimalPlaces, int increment, List emptyList, boolean allowAlpha, String placeholder, boolean protected1, boolean triggerActionOnInitialization, boolean hidden, List emptyList2, final int n, final DefaultConstructorMarker defaultConstructorMarker) {
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
        if ((n & 0x20000) != 0x0) {
            emptyList2 = CollectionsKt.emptyList();
        }
        this(type, name, category, subcategory, description, min, max, minF, maxF, decimalPlaces, increment, emptyList, allowAlpha, placeholder, protected1, triggerActionOnInitialization, hidden, emptyList2);
    }
    
    @Deprecated(message = "", level = DeprecationLevel.HIDDEN)
    @java.lang.Deprecated
    public PropertyAttributesExt(final PropertyType type, final String name, final String category, final String subcategory, final String description, final int min, final int max, final float minF, final float maxF, final int decimalPlaces, final int increment, final List options, final boolean allowAlpha, final String placeholder, final boolean protected, final boolean triggerActionOnInitialization, final boolean hidden, final List searchTags, final String i18nName, final String i18nCategory, final String i18nSubcategory) {
        Intrinsics.checkNotNullParameter((Object)type, "type");
        Intrinsics.checkNotNullParameter((Object)name, "name");
        Intrinsics.checkNotNullParameter((Object)category, "category");
        Intrinsics.checkNotNullParameter((Object)subcategory, "subcategory");
        Intrinsics.checkNotNullParameter((Object)description, "description");
        Intrinsics.checkNotNullParameter((Object)options, "options");
        Intrinsics.checkNotNullParameter((Object)placeholder, "placeholder");
        Intrinsics.checkNotNullParameter((Object)searchTags, "searchTags");
        Intrinsics.checkNotNullParameter((Object)i18nName, "i18nName");
        Intrinsics.checkNotNullParameter((Object)i18nCategory, "i18nCategory");
        Intrinsics.checkNotNullParameter((Object)i18nSubcategory, "i18nSubcategory");
        this(type, name, category, subcategory, description, min, max, minF, maxF, decimalPlaces, increment, options, allowAlpha, placeholder, protected, triggerActionOnInitialization, hidden, searchTags, i18nName, i18nCategory, i18nSubcategory, null, 2097152, null);
    }
    
    @java.lang.Deprecated
    public PropertyAttributesExt(final PropertyType type, final String name, final String category, String subcategory, String description, int min, int max, float minF, float maxF, int decimalPlaces, int increment, List emptyList, boolean allowAlpha, String placeholder, boolean protected1, boolean triggerActionOnInitialization, boolean hidden, List emptyList2, String i18nName, String i18nCategory, String i18nSubcategory, final int n, final DefaultConstructorMarker defaultConstructorMarker) {
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
        if ((n & 0x20000) != 0x0) {
            emptyList2 = CollectionsKt.emptyList();
        }
        if ((n & 0x40000) != 0x0) {
            i18nName = name;
        }
        if ((n & 0x80000) != 0x0) {
            i18nCategory = category;
        }
        if ((n & 0x100000) != 0x0) {
            i18nSubcategory = subcategory;
        }
        this(type, name, category, subcategory, description, min, max, minF, maxF, decimalPlaces, increment, emptyList, allowAlpha, placeholder, protected1, triggerActionOnInitialization, hidden, emptyList2, i18nName, i18nCategory, i18nSubcategory);
    }
    
    @NotNull
    public final String getLocalizedName$Vigilance() {
        return I18n.INSTANCE.format(this.i18nName);
    }
    
    @NotNull
    public final String getLocalizedCategory$Vigilance() {
        return I18n.INSTANCE.format(this.i18nCategory);
    }
    
    @NotNull
    public final String getLocalizedSubcategory$Vigilance() {
        return I18n.INSTANCE.format(this.i18nSubcategory);
    }
    
    @NotNull
    public final String getLocalizedDescription$Vigilance() {
        return I18n.INSTANCE.format(this.description);
    }
    
    @NotNull
    public final List<String> getLocalizedSearchTags$Vigilance() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        gg/essential/vigilance/data/PropertyAttributesExt.searchTags:Ljava/util/List;
        //     4: checkcast       Ljava/lang/Iterable;
        //     7: astore_1        /* $this$map$iv */
        //     8: iconst_0       
        //     9: istore_2        /* $i$f$map */
        //    10: aload_1         /* $this$map$iv */
        //    11: astore_3       
        //    12: new             Ljava/util/ArrayList;
        //    15: dup            
        //    16: aload_1         /* $this$map$iv */
        //    17: bipush          10
        //    19: invokestatic    kotlin/collections/CollectionsKt.collectionSizeOrDefault:(Ljava/lang/Iterable;I)I
        //    22: invokespecial   java/util/ArrayList.<init>:(I)V
        //    25: checkcast       Ljava/util/Collection;
        //    28: astore          destination$iv$iv
        //    30: iconst_0       
        //    31: istore          $i$f$mapTo
        //    33: aload_3         /* $this$mapTo$iv$iv */
        //    34: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //    39: astore          6
        //    41: aload           6
        //    43: invokeinterface java/util/Iterator.hasNext:()Z
        //    48: ifeq            94
        //    51: aload           6
        //    53: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    58: astore          item$iv$iv
        //    60: aload           destination$iv$iv
        //    62: aload           item$iv$iv
        //    64: checkcast       Ljava/lang/String;
        //    67: astore          8
        //    69: astore          10
        //    71: iconst_0       
        //    72: istore          $i$a$-map-PropertyAttributesExt$localizedSearchTags$1
        //    74: getstatic       gg/essential/vigilance/impl/I18n.INSTANCE:Lgg/essential/vigilance/impl/I18n;
        //    77: aload           it
        //    79: invokevirtual   gg/essential/vigilance/impl/I18n.format:(Ljava/lang/String;)Ljava/lang/String;
        //    82: aload           10
        //    84: swap           
        //    85: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //    90: pop            
        //    91: goto            41
        //    94: aload           destination$iv$iv
        //    96: checkcast       Ljava/util/List;
        //    99: nop            
        //   100: areturn        
        //    Signature:
        //  ()Ljava/util/List<Ljava/lang/String;>;
        //    StackMapTable: 00 02 FF 00 29 00 07 07 00 02 07 00 DA 01 07 00 DA 07 01 0D 01 07 01 13 00 00 34
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @Deprecated(message = "", level = DeprecationLevel.HIDDEN)
    @JvmOverloads
    @java.lang.Deprecated
    public PropertyAttributesExt(final PropertyType type, final String name, final String category, final String subcategory, final String description, final int min, final int max, final float minF, final float maxF, final int decimalPlaces, final int increment, final List options, final boolean allowAlpha, final String placeholder, final boolean protected, final boolean triggerActionOnInitialization, final boolean hidden) {
        Intrinsics.checkNotNullParameter((Object)type, "type");
        Intrinsics.checkNotNullParameter((Object)name, "name");
        Intrinsics.checkNotNullParameter((Object)category, "category");
        Intrinsics.checkNotNullParameter((Object)subcategory, "subcategory");
        Intrinsics.checkNotNullParameter((Object)description, "description");
        Intrinsics.checkNotNullParameter((Object)options, "options");
        Intrinsics.checkNotNullParameter((Object)placeholder, "placeholder");
        this(type, name, category, subcategory, description, min, max, minF, maxF, decimalPlaces, increment, options, allowAlpha, placeholder, protected, triggerActionOnInitialization, hidden, null, 131072, null);
    }
    
    @Deprecated(message = "", level = DeprecationLevel.HIDDEN)
    @JvmOverloads
    @java.lang.Deprecated
    public PropertyAttributesExt(final PropertyType type, final String name, final String category, final String subcategory, final String description, final int min, final int max, final float minF, final float maxF, final int decimalPlaces, final int increment, final List options, final boolean allowAlpha, final String placeholder, final boolean protected, final boolean triggerActionOnInitialization) {
        Intrinsics.checkNotNullParameter((Object)type, "type");
        Intrinsics.checkNotNullParameter((Object)name, "name");
        Intrinsics.checkNotNullParameter((Object)category, "category");
        Intrinsics.checkNotNullParameter((Object)subcategory, "subcategory");
        Intrinsics.checkNotNullParameter((Object)description, "description");
        Intrinsics.checkNotNullParameter((Object)options, "options");
        Intrinsics.checkNotNullParameter((Object)placeholder, "placeholder");
        this(type, name, category, subcategory, description, min, max, minF, maxF, decimalPlaces, increment, options, allowAlpha, placeholder, protected, triggerActionOnInitialization, false, null, 196608, null);
    }
    
    @Deprecated(message = "", level = DeprecationLevel.HIDDEN)
    @JvmOverloads
    @java.lang.Deprecated
    public PropertyAttributesExt(final PropertyType type, final String name, final String category, final String subcategory, final String description, final int min, final int max, final float minF, final float maxF, final int decimalPlaces, final int increment, final List options, final boolean allowAlpha, final String placeholder, final boolean protected) {
        Intrinsics.checkNotNullParameter((Object)type, "type");
        Intrinsics.checkNotNullParameter((Object)name, "name");
        Intrinsics.checkNotNullParameter((Object)category, "category");
        Intrinsics.checkNotNullParameter((Object)subcategory, "subcategory");
        Intrinsics.checkNotNullParameter((Object)description, "description");
        Intrinsics.checkNotNullParameter((Object)options, "options");
        Intrinsics.checkNotNullParameter((Object)placeholder, "placeholder");
        this(type, name, category, subcategory, description, min, max, minF, maxF, decimalPlaces, increment, options, allowAlpha, placeholder, protected, false, false, null, 229376, null);
    }
    
    @Deprecated(message = "", level = DeprecationLevel.HIDDEN)
    @JvmOverloads
    @java.lang.Deprecated
    public PropertyAttributesExt(final PropertyType type, final String name, final String category, final String subcategory, final String description, final int min, final int max, final float minF, final float maxF, final int decimalPlaces, final int increment, final List options, final boolean allowAlpha, final String placeholder) {
        Intrinsics.checkNotNullParameter((Object)type, "type");
        Intrinsics.checkNotNullParameter((Object)name, "name");
        Intrinsics.checkNotNullParameter((Object)category, "category");
        Intrinsics.checkNotNullParameter((Object)subcategory, "subcategory");
        Intrinsics.checkNotNullParameter((Object)description, "description");
        Intrinsics.checkNotNullParameter((Object)options, "options");
        Intrinsics.checkNotNullParameter((Object)placeholder, "placeholder");
        this(type, name, category, subcategory, description, min, max, minF, maxF, decimalPlaces, increment, options, allowAlpha, placeholder, false, false, false, null, 245760, null);
    }
    
    @Deprecated(message = "", level = DeprecationLevel.HIDDEN)
    @JvmOverloads
    @java.lang.Deprecated
    public PropertyAttributesExt(final PropertyType type, final String name, final String category, final String subcategory, final String description, final int min, final int max, final float minF, final float maxF, final int decimalPlaces, final int increment, final List options, final boolean allowAlpha) {
        Intrinsics.checkNotNullParameter((Object)type, "type");
        Intrinsics.checkNotNullParameter((Object)name, "name");
        Intrinsics.checkNotNullParameter((Object)category, "category");
        Intrinsics.checkNotNullParameter((Object)subcategory, "subcategory");
        Intrinsics.checkNotNullParameter((Object)description, "description");
        Intrinsics.checkNotNullParameter((Object)options, "options");
        this(type, name, category, subcategory, description, min, max, minF, maxF, decimalPlaces, increment, options, allowAlpha, null, false, false, false, null, 253952, null);
    }
    
    @Deprecated(message = "", level = DeprecationLevel.HIDDEN)
    @JvmOverloads
    @java.lang.Deprecated
    public PropertyAttributesExt(final PropertyType type, final String name, final String category, final String subcategory, final String description, final int min, final int max, final float minF, final float maxF, final int decimalPlaces, final int increment, final List options) {
        Intrinsics.checkNotNullParameter((Object)type, "type");
        Intrinsics.checkNotNullParameter((Object)name, "name");
        Intrinsics.checkNotNullParameter((Object)category, "category");
        Intrinsics.checkNotNullParameter((Object)subcategory, "subcategory");
        Intrinsics.checkNotNullParameter((Object)description, "description");
        Intrinsics.checkNotNullParameter((Object)options, "options");
        this(type, name, category, subcategory, description, min, max, minF, maxF, decimalPlaces, increment, options, false, null, false, false, false, null, 258048, null);
    }
    
    @Deprecated(message = "", level = DeprecationLevel.HIDDEN)
    @JvmOverloads
    @java.lang.Deprecated
    public PropertyAttributesExt(final PropertyType type, final String name, final String category, final String subcategory, final String description, final int min, final int max, final float minF, final float maxF, final int decimalPlaces, final int increment) {
        Intrinsics.checkNotNullParameter((Object)type, "type");
        Intrinsics.checkNotNullParameter((Object)name, "name");
        Intrinsics.checkNotNullParameter((Object)category, "category");
        Intrinsics.checkNotNullParameter((Object)subcategory, "subcategory");
        Intrinsics.checkNotNullParameter((Object)description, "description");
        this(type, name, category, subcategory, description, min, max, minF, maxF, decimalPlaces, increment, null, false, null, false, false, false, null, 260096, null);
    }
    
    @Deprecated(message = "", level = DeprecationLevel.HIDDEN)
    @JvmOverloads
    @java.lang.Deprecated
    public PropertyAttributesExt(final PropertyType type, final String name, final String category, final String subcategory, final String description, final int min, final int max, final float minF, final float maxF, final int decimalPlaces) {
        Intrinsics.checkNotNullParameter((Object)type, "type");
        Intrinsics.checkNotNullParameter((Object)name, "name");
        Intrinsics.checkNotNullParameter((Object)category, "category");
        Intrinsics.checkNotNullParameter((Object)subcategory, "subcategory");
        Intrinsics.checkNotNullParameter((Object)description, "description");
        this(type, name, category, subcategory, description, min, max, minF, maxF, decimalPlaces, 0, null, false, null, false, false, false, null, 261120, null);
    }
    
    @Deprecated(message = "", level = DeprecationLevel.HIDDEN)
    @JvmOverloads
    @java.lang.Deprecated
    public PropertyAttributesExt(final PropertyType type, final String name, final String category, final String subcategory, final String description, final int min, final int max, final float minF, final float maxF) {
        Intrinsics.checkNotNullParameter((Object)type, "type");
        Intrinsics.checkNotNullParameter((Object)name, "name");
        Intrinsics.checkNotNullParameter((Object)category, "category");
        Intrinsics.checkNotNullParameter((Object)subcategory, "subcategory");
        Intrinsics.checkNotNullParameter((Object)description, "description");
        this(type, name, category, subcategory, description, min, max, minF, maxF, 0, 0, null, false, null, false, false, false, null, 261632, null);
    }
    
    @Deprecated(message = "", level = DeprecationLevel.HIDDEN)
    @JvmOverloads
    @java.lang.Deprecated
    public PropertyAttributesExt(final PropertyType type, final String name, final String category, final String subcategory, final String description, final int min, final int max, final float minF) {
        Intrinsics.checkNotNullParameter((Object)type, "type");
        Intrinsics.checkNotNullParameter((Object)name, "name");
        Intrinsics.checkNotNullParameter((Object)category, "category");
        Intrinsics.checkNotNullParameter((Object)subcategory, "subcategory");
        Intrinsics.checkNotNullParameter((Object)description, "description");
        this(type, name, category, subcategory, description, min, max, minF, 0.0f, 0, 0, null, false, null, false, false, false, null, 261888, null);
    }
    
    @Deprecated(message = "", level = DeprecationLevel.HIDDEN)
    @JvmOverloads
    @java.lang.Deprecated
    public PropertyAttributesExt(final PropertyType type, final String name, final String category, final String subcategory, final String description, final int min, final int max) {
        Intrinsics.checkNotNullParameter((Object)type, "type");
        Intrinsics.checkNotNullParameter((Object)name, "name");
        Intrinsics.checkNotNullParameter((Object)category, "category");
        Intrinsics.checkNotNullParameter((Object)subcategory, "subcategory");
        Intrinsics.checkNotNullParameter((Object)description, "description");
        this(type, name, category, subcategory, description, min, max, 0.0f, 0.0f, 0, 0, null, false, null, false, false, false, null, 262016, null);
    }
    
    @Deprecated(message = "", level = DeprecationLevel.HIDDEN)
    @JvmOverloads
    @java.lang.Deprecated
    public PropertyAttributesExt(final PropertyType type, final String name, final String category, final String subcategory, final String description, final int min) {
        Intrinsics.checkNotNullParameter((Object)type, "type");
        Intrinsics.checkNotNullParameter((Object)name, "name");
        Intrinsics.checkNotNullParameter((Object)category, "category");
        Intrinsics.checkNotNullParameter((Object)subcategory, "subcategory");
        Intrinsics.checkNotNullParameter((Object)description, "description");
        this(type, name, category, subcategory, description, min, 0, 0.0f, 0.0f, 0, 0, null, false, null, false, false, false, null, 262080, null);
    }
    
    @Deprecated(message = "", level = DeprecationLevel.HIDDEN)
    @JvmOverloads
    @java.lang.Deprecated
    public PropertyAttributesExt(final PropertyType type, final String name, final String category, final String subcategory, final String description) {
        Intrinsics.checkNotNullParameter((Object)type, "type");
        Intrinsics.checkNotNullParameter((Object)name, "name");
        Intrinsics.checkNotNullParameter((Object)category, "category");
        Intrinsics.checkNotNullParameter((Object)subcategory, "subcategory");
        Intrinsics.checkNotNullParameter((Object)description, "description");
        this(type, name, category, subcategory, description, 0, 0, 0.0f, 0.0f, 0, 0, null, false, null, false, false, false, null, 262112, null);
    }
    
    @Deprecated(message = "", level = DeprecationLevel.HIDDEN)
    @JvmOverloads
    @java.lang.Deprecated
    public PropertyAttributesExt(final PropertyType type, final String name, final String category, final String subcategory) {
        Intrinsics.checkNotNullParameter((Object)type, "type");
        Intrinsics.checkNotNullParameter((Object)name, "name");
        Intrinsics.checkNotNullParameter((Object)category, "category");
        Intrinsics.checkNotNullParameter((Object)subcategory, "subcategory");
        this(type, name, category, subcategory, null, 0, 0, 0.0f, 0.0f, 0, 0, null, false, null, false, false, false, null, 262128, null);
    }
    
    @Deprecated(message = "", level = DeprecationLevel.HIDDEN)
    @JvmOverloads
    @java.lang.Deprecated
    public PropertyAttributesExt(final PropertyType type, final String name, final String category) {
        Intrinsics.checkNotNullParameter((Object)type, "type");
        Intrinsics.checkNotNullParameter((Object)name, "name");
        Intrinsics.checkNotNullParameter((Object)category, "category");
        this(type, name, category, null, null, 0, 0, 0.0f, 0.0f, 0, 0, null, false, null, false, false, false, null, 262136, null);
    }
    
    static {
        Companion = new Companion(null);
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007" }, d2 = { "Lgg/essential/vigilance/data/PropertyAttributesExt$Companion;", "", "()V", "fromPropertyAnnotation", "Lgg/essential/vigilance/data/PropertyAttributesExt;", "property", "Lgg/essential/vigilance/data/Property;", "Vigilance" })
    public static final class Companion
    {
        private Companion() {
            super();
        }
        
        @NotNull
        public final PropertyAttributesExt fromPropertyAnnotation(@NotNull final Property property) {
            // 
            // This method could not be decompiled.
            // 
            // Original Bytecode:
            // 
            //     1: ldc             "property"
            //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
            //     6: aload_1         /* property */
            //     7: invokeinterface gg/essential/vigilance/data/Property.type:()Lgg/essential/vigilance/data/PropertyType;
            //    12: aload_1         /* property */
            //    13: invokeinterface gg/essential/vigilance/data/Property.name:()Ljava/lang/String;
            //    18: aload_1         /* property */
            //    19: invokeinterface gg/essential/vigilance/data/Property.category:()Ljava/lang/String;
            //    24: aload_1         /* property */
            //    25: invokeinterface gg/essential/vigilance/data/Property.subcategory:()Ljava/lang/String;
            //    30: aload_1         /* property */
            //    31: invokeinterface gg/essential/vigilance/data/Property.description:()Ljava/lang/String;
            //    36: aload_1         /* property */
            //    37: invokeinterface gg/essential/vigilance/data/Property.min:()I
            //    42: aload_1         /* property */
            //    43: invokeinterface gg/essential/vigilance/data/Property.max:()I
            //    48: aload_1         /* property */
            //    49: invokeinterface gg/essential/vigilance/data/Property.minF:()F
            //    54: aload_1         /* property */
            //    55: invokeinterface gg/essential/vigilance/data/Property.maxF:()F
            //    60: aload_1         /* property */
            //    61: invokeinterface gg/essential/vigilance/data/Property.decimalPlaces:()I
            //    66: aload_1         /* property */
            //    67: invokeinterface gg/essential/vigilance/data/Property.increment:()I
            //    72: aload_1         /* property */
            //    73: invokeinterface gg/essential/vigilance/data/Property.options:()[Ljava/lang/String;
            //    78: invokestatic    kotlin/collections/ArraysKt.toList:([Ljava/lang/Object;)Ljava/util/List;
            //    81: aload_1         /* property */
            //    82: invokeinterface gg/essential/vigilance/data/Property.allowAlpha:()Z
            //    87: aload_1         /* property */
            //    88: invokeinterface gg/essential/vigilance/data/Property.placeholder:()Ljava/lang/String;
            //    93: aload_1         /* property */
            //    94: invokeinterface gg/essential/vigilance/data/Property.protectedText:()Z
            //    99: aload_1         /* property */
            //   100: invokeinterface gg/essential/vigilance/data/Property.triggerActionOnInitialization:()Z
            //   105: aload_1         /* property */
            //   106: invokeinterface gg/essential/vigilance/data/Property.hidden:()Z
            //   111: aload_1         /* property */
            //   112: astore_2       
            //   113: iconst_0       
            //   114: istore_3        /* $i$f$emptyArray */
            //   115: iconst_0       
            //   116: anewarray       Ljava/lang/String;
            //   119: checkcast       [Ljava/lang/Object;
            //   122: astore_3        /* $i$f$emptyArray */
            //   123: istore          23
            //   125: istore          22
            //   127: istore          21
            //   129: astore          20
            //   131: istore          19
            //   133: astore          18
            //   135: istore          17
            //   137: istore          16
            //   139: fstore          15
            //   141: fstore          14
            //   143: istore          13
            //   145: istore          12
            //   147: astore          11
            //   149: astore          10
            //   151: astore          9
            //   153: astore          8
            //   155: astore          7
            //   157: iconst_0       
            //   158: istore          $i$f$safeGet
            //   160: nop            
            //   161: aload_2         /* $this$safeGet$iv */
            //   162: astore          $this$fromPropertyAnnotation_u24lambda_u2d0
            //   164: iconst_0       
            //   165: istore          $i$a$-safeGet-PropertyAttributesExt$Companion$fromPropertyAnnotation$1
            //   167: aload           $this$fromPropertyAnnotation_u24lambda_u2d0
            //   169: invokeinterface gg/essential/vigilance/data/Property.searchTags:()[Ljava/lang/String;
            //   174: astore          null
            //   176: goto            184
            //   179: astore          e$iv
            //   181: aload_3         /* default$iv */
            //   182: astore          5
            //   184: aload           5
            //   186: nop            
            //   187: astore          24
            //   189: aload           7
            //   191: aload           8
            //   193: aload           9
            //   195: aload           10
            //   197: aload           11
            //   199: iload           12
            //   201: iload           13
            //   203: fload           14
            //   205: fload           15
            //   207: iload           16
            //   209: iload           17
            //   211: aload           18
            //   213: iload           19
            //   215: aload           20
            //   217: iload           21
            //   219: iload           22
            //   221: iload           23
            //   223: aload           24
            //   225: checkcast       [Ljava/lang/Object;
            //   228: invokestatic    kotlin/collections/ArraysKt.toList:([Ljava/lang/Object;)Ljava/util/List;
            //   231: aload_1         /* property */
            //   232: astore_2       
            //   233: ldc             ""
            //   235: astore_3       
            //   236: astore          24
            //   238: istore          23
            //   240: istore          22
            //   242: istore          21
            //   244: astore          20
            //   246: istore          19
            //   248: astore          18
            //   250: istore          17
            //   252: istore          16
            //   254: fstore          15
            //   256: fstore          14
            //   258: istore          13
            //   260: istore          12
            //   262: astore          11
            //   264: astore          10
            //   266: astore          9
            //   268: astore          8
            //   270: astore          7
            //   272: iconst_0       
            //   273: istore          $i$f$safeGet
            //   275: nop            
            //   276: aload_2         /* $this$safeGet$iv */
            //   277: astore          $this$fromPropertyAnnotation_u24lambda_u2d1
            //   279: iconst_0       
            //   280: istore          $i$a$-safeGet-PropertyAttributesExt$Companion$fromPropertyAnnotation$2
            //   282: aload           $this$fromPropertyAnnotation_u24lambda_u2d1
            //   284: invokeinterface gg/essential/vigilance/data/Property.i18nName:()Ljava/lang/String;
            //   289: astore          null
            //   291: goto            299
            //   294: astore          e$iv
            //   296: aload_3         /* default$iv */
            //   297: astore          5
            //   299: aload           5
            //   301: nop            
            //   302: astore          25
            //   304: aload           7
            //   306: aload           8
            //   308: aload           9
            //   310: aload           10
            //   312: aload           11
            //   314: iload           12
            //   316: iload           13
            //   318: fload           14
            //   320: fload           15
            //   322: iload           16
            //   324: iload           17
            //   326: aload           18
            //   328: iload           19
            //   330: aload           20
            //   332: iload           21
            //   334: iload           22
            //   336: iload           23
            //   338: aload           24
            //   340: aload           25
            //   342: checkcast       Ljava/lang/CharSequence;
            //   345: astore_2       
            //   346: aload_2        
            //   347: astore_3       
            //   348: aload_3        
            //   349: invokeinterface java/lang/CharSequence.length:()I
            //   354: ifne            361
            //   357: iconst_1       
            //   358: goto            362
            //   361: iconst_0       
            //   362: ifeq            453
            //   365: astore          24
            //   367: istore          23
            //   369: istore          22
            //   371: istore          21
            //   373: astore          20
            //   375: istore          19
            //   377: astore          18
            //   379: istore          17
            //   381: istore          16
            //   383: fstore          15
            //   385: fstore          14
            //   387: istore          13
            //   389: istore          12
            //   391: astore          11
            //   393: astore          10
            //   395: astore          9
            //   397: astore          8
            //   399: astore          7
            //   401: iconst_0       
            //   402: istore          $i$a$-ifEmpty-PropertyAttributesExt$Companion$fromPropertyAnnotation$3
            //   404: aload_1         /* property */
            //   405: invokeinterface gg/essential/vigilance/data/Property.name:()Ljava/lang/String;
            //   410: astore          25
            //   412: aload           7
            //   414: aload           8
            //   416: aload           9
            //   418: aload           10
            //   420: aload           11
            //   422: iload           12
            //   424: iload           13
            //   426: fload           14
            //   428: fload           15
            //   430: iload           16
            //   432: iload           17
            //   434: aload           18
            //   436: iload           19
            //   438: aload           20
            //   440: iload           21
            //   442: iload           22
            //   444: iload           23
            //   446: aload           24
            //   448: aload           25
            //   450: goto            454
            //   453: aload_2        
            //   454: checkcast       Ljava/lang/String;
            //   457: aload_1         /* property */
            //   458: astore_2       
            //   459: ldc             ""
            //   461: astore_3       
            //   462: astore          25
            //   464: astore          24
            //   466: istore          23
            //   468: istore          22
            //   470: istore          21
            //   472: astore          20
            //   474: istore          19
            //   476: astore          18
            //   478: istore          17
            //   480: istore          16
            //   482: fstore          15
            //   484: fstore          14
            //   486: istore          13
            //   488: istore          12
            //   490: astore          11
            //   492: astore          10
            //   494: astore          9
            //   496: astore          8
            //   498: astore          7
            //   500: iconst_0       
            //   501: istore          $i$f$safeGet
            //   503: nop            
            //   504: aload_2         /* $this$safeGet$iv */
            //   505: astore          $this$fromPropertyAnnotation_u24lambda_u2d3
            //   507: iconst_0       
            //   508: istore          $i$a$-safeGet-PropertyAttributesExt$Companion$fromPropertyAnnotation$4
            //   510: aload           $this$fromPropertyAnnotation_u24lambda_u2d3
            //   512: invokeinterface gg/essential/vigilance/data/Property.i18nCategory:()Ljava/lang/String;
            //   517: astore          null
            //   519: goto            527
            //   522: astore          e$iv
            //   524: aload_3         /* default$iv */
            //   525: astore          5
            //   527: aload           5
            //   529: nop            
            //   530: astore          26
            //   532: aload           7
            //   534: aload           8
            //   536: aload           9
            //   538: aload           10
            //   540: aload           11
            //   542: iload           12
            //   544: iload           13
            //   546: fload           14
            //   548: fload           15
            //   550: iload           16
            //   552: iload           17
            //   554: aload           18
            //   556: iload           19
            //   558: aload           20
            //   560: iload           21
            //   562: iload           22
            //   564: iload           23
            //   566: aload           24
            //   568: aload           25
            //   570: aload           26
            //   572: checkcast       Ljava/lang/CharSequence;
            //   575: astore_2       
            //   576: aload_2        
            //   577: astore_3       
            //   578: aload_3        
            //   579: invokeinterface java/lang/CharSequence.length:()I
            //   584: ifne            591
            //   587: iconst_1       
            //   588: goto            592
            //   591: iconst_0       
            //   592: ifeq            687
            //   595: astore          25
            //   597: astore          24
            //   599: istore          23
            //   601: istore          22
            //   603: istore          21
            //   605: astore          20
            //   607: istore          19
            //   609: astore          18
            //   611: istore          17
            //   613: istore          16
            //   615: fstore          15
            //   617: fstore          14
            //   619: istore          13
            //   621: istore          12
            //   623: astore          11
            //   625: astore          10
            //   627: astore          9
            //   629: astore          8
            //   631: astore          7
            //   633: iconst_0       
            //   634: istore          $i$a$-ifEmpty-PropertyAttributesExt$Companion$fromPropertyAnnotation$5
            //   636: aload_1         /* property */
            //   637: invokeinterface gg/essential/vigilance/data/Property.category:()Ljava/lang/String;
            //   642: astore          26
            //   644: aload           7
            //   646: aload           8
            //   648: aload           9
            //   650: aload           10
            //   652: aload           11
            //   654: iload           12
            //   656: iload           13
            //   658: fload           14
            //   660: fload           15
            //   662: iload           16
            //   664: iload           17
            //   666: aload           18
            //   668: iload           19
            //   670: aload           20
            //   672: iload           21
            //   674: iload           22
            //   676: iload           23
            //   678: aload           24
            //   680: aload           25
            //   682: aload           26
            //   684: goto            688
            //   687: aload_2        
            //   688: checkcast       Ljava/lang/String;
            //   691: aload_1         /* property */
            //   692: astore_2       
            //   693: ldc             ""
            //   695: astore_3       
            //   696: astore          26
            //   698: astore          25
            //   700: astore          24
            //   702: istore          23
            //   704: istore          22
            //   706: istore          21
            //   708: astore          20
            //   710: istore          19
            //   712: astore          18
            //   714: istore          17
            //   716: istore          16
            //   718: fstore          15
            //   720: fstore          14
            //   722: istore          13
            //   724: istore          12
            //   726: astore          11
            //   728: astore          10
            //   730: astore          9
            //   732: astore          8
            //   734: astore          7
            //   736: iconst_0       
            //   737: istore          $i$f$safeGet
            //   739: nop            
            //   740: aload_2         /* $this$safeGet$iv */
            //   741: astore          $this$fromPropertyAnnotation_u24lambda_u2d5
            //   743: iconst_0       
            //   744: istore          $i$a$-safeGet-PropertyAttributesExt$Companion$fromPropertyAnnotation$6
            //   746: aload           $this$fromPropertyAnnotation_u24lambda_u2d5
            //   748: invokeinterface gg/essential/vigilance/data/Property.i18nSubcategory:()Ljava/lang/String;
            //   753: astore          null
            //   755: goto            763
            //   758: astore          e$iv
            //   760: aload_3         /* default$iv */
            //   761: astore          5
            //   763: aload           5
            //   765: nop            
            //   766: astore          27
            //   768: aload           7
            //   770: aload           8
            //   772: aload           9
            //   774: aload           10
            //   776: aload           11
            //   778: iload           12
            //   780: iload           13
            //   782: fload           14
            //   784: fload           15
            //   786: iload           16
            //   788: iload           17
            //   790: aload           18
            //   792: iload           19
            //   794: aload           20
            //   796: iload           21
            //   798: iload           22
            //   800: iload           23
            //   802: aload           24
            //   804: aload           25
            //   806: aload           26
            //   808: aload           27
            //   810: checkcast       Ljava/lang/CharSequence;
            //   813: astore_2       
            //   814: aload_2        
            //   815: astore_3       
            //   816: aload_3        
            //   817: invokeinterface java/lang/CharSequence.length:()I
            //   822: ifne            829
            //   825: iconst_1       
            //   826: goto            830
            //   829: iconst_0       
            //   830: ifeq            929
            //   833: astore          26
            //   835: astore          25
            //   837: astore          24
            //   839: istore          23
            //   841: istore          22
            //   843: istore          21
            //   845: astore          20
            //   847: istore          19
            //   849: astore          18
            //   851: istore          17
            //   853: istore          16
            //   855: fstore          15
            //   857: fstore          14
            //   859: istore          13
            //   861: istore          12
            //   863: astore          11
            //   865: astore          10
            //   867: astore          9
            //   869: astore          8
            //   871: astore          7
            //   873: iconst_0       
            //   874: istore          $i$a$-ifEmpty-PropertyAttributesExt$Companion$fromPropertyAnnotation$7
            //   876: aload_1         /* property */
            //   877: invokeinterface gg/essential/vigilance/data/Property.subcategory:()Ljava/lang/String;
            //   882: astore          27
            //   884: aload           7
            //   886: aload           8
            //   888: aload           9
            //   890: aload           10
            //   892: aload           11
            //   894: iload           12
            //   896: iload           13
            //   898: fload           14
            //   900: fload           15
            //   902: iload           16
            //   904: iload           17
            //   906: aload           18
            //   908: iload           19
            //   910: aload           20
            //   912: iload           21
            //   914: iload           22
            //   916: iload           23
            //   918: aload           24
            //   920: aload           25
            //   922: aload           26
            //   924: aload           27
            //   926: goto            930
            //   929: aload_2        
            //   930: checkcast       Ljava/lang/String;
            //   933: aload_1         /* property */
            //   934: astore_2       
            //   935: ldc             Ljava/lang/Void;.class
            //   937: astore_3       
            //   938: astore          27
            //   940: astore          26
            //   942: astore          25
            //   944: astore          24
            //   946: istore          23
            //   948: istore          22
            //   950: istore          21
            //   952: astore          20
            //   954: istore          19
            //   956: astore          18
            //   958: istore          17
            //   960: istore          16
            //   962: fstore          15
            //   964: fstore          14
            //   966: istore          13
            //   968: istore          12
            //   970: astore          11
            //   972: astore          10
            //   974: astore          9
            //   976: astore          8
            //   978: astore          7
            //   980: iconst_0       
            //   981: istore          $i$f$safeGet
            //   983: nop            
            //   984: aload_2         /* $this$safeGet$iv */
            //   985: astore          $this$fromPropertyAnnotation_u24lambda_u2d7
            //   987: iconst_0       
            //   988: istore          $i$a$-safeGet-PropertyAttributesExt$Companion$fromPropertyAnnotation$8
            //   990: aload           $this$fromPropertyAnnotation_u24lambda_u2d7
            //   992: invokeinterface gg/essential/vigilance/data/Property.customPropertyInfo:()Ljava/lang/Class;
            //   997: astore          null
            //   999: goto            1007
            //  1002: astore          e$iv
            //  1004: aload_3         /* default$iv */
            //  1005: astore          5
            //  1007: aload           5
            //  1009: nop            
            //  1010: astore          28
            //  1012: aload           7
            //  1014: aload           8
            //  1016: aload           9
            //  1018: aload           10
            //  1020: aload           11
            //  1022: iload           12
            //  1024: iload           13
            //  1026: fload           14
            //  1028: fload           15
            //  1030: iload           16
            //  1032: iload           17
            //  1034: aload           18
            //  1036: iload           19
            //  1038: aload           20
            //  1040: iload           21
            //  1042: iload           22
            //  1044: iload           23
            //  1046: aload           24
            //  1048: aload           25
            //  1050: aload           26
            //  1052: aload           27
            //  1054: aload           28
            //  1056: astore          29
            //  1058: astore          30
            //  1060: astore          31
            //  1062: astore          32
            //  1064: astore          33
            //  1066: istore          34
            //  1068: istore          35
            //  1070: istore          36
            //  1072: astore          37
            //  1074: istore          38
            //  1076: astore          39
            //  1078: istore          40
            //  1080: istore          41
            //  1082: fstore          42
            //  1084: fstore          43
            //  1086: istore          44
            //  1088: istore          45
            //  1090: astore          46
            //  1092: astore          47
            //  1094: astore          48
            //  1096: astore          49
            //  1098: astore          50
            //  1100: new             Lgg/essential/vigilance/data/PropertyAttributesExt;
            //  1103: dup            
            //  1104: aload           50
            //  1106: aload           49
            //  1108: aload           48
            //  1110: aload           47
            //  1112: aload           46
            //  1114: iload           45
            //  1116: iload           44
            //  1118: fload           43
            //  1120: fload           42
            //  1122: iload           41
            //  1124: iload           40
            //  1126: aload           39
            //  1128: iload           38
            //  1130: aload           37
            //  1132: iload           36
            //  1134: iload           35
            //  1136: iload           34
            //  1138: aload           33
            //  1140: aload           32
            //  1142: aload           31
            //  1144: aload           30
            //  1146: aload           29
            //  1148: invokespecial   gg/essential/vigilance/data/PropertyAttributesExt.<init>:(Lgg/essential/vigilance/data/PropertyType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIFFIILjava/util/List;ZLjava/lang/String;ZZZLjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;)V
            //  1151: areturn        
            //    MethodParameters:
            //  Name      Flags  
            //  --------  -----
            //  property  
            //    StackMapTable: 00 16 FF 00 B3 00 18 07 00 02 07 00 2C 07 00 2C 07 00 6F 01 00 00 07 00 74 07 00 6D 07 00 6D 07 00 6D 07 00 6D 01 01 02 02 01 01 07 00 76 01 07 00 6D 01 01 01 00 01 07 00 23 FF 00 04 00 18 07 00 02 07 00 2C 07 00 2C 07 00 6F 01 07 00 6F 00 07 00 74 07 00 6D 07 00 6D 07 00 6D 07 00 6D 01 01 02 02 01 01 07 00 76 01 07 00 6D 01 01 01 00 00 FF 00 6D 00 19 07 00 02 07 00 2C 07 00 2C 07 00 6D 01 07 00 04 00 07 00 74 07 00 6D 07 00 6D 07 00 6D 07 00 6D 01 01 02 02 01 01 07 00 76 01 07 00 6D 01 01 01 07 00 76 00 01 07 00 23 FF 00 04 00 19 07 00 02 07 00 2C 07 00 2C 07 00 6D 01 07 00 6D 00 07 00 74 07 00 6D 07 00 6D 07 00 6D 07 00 6D 01 01 02 02 01 01 07 00 76 01 07 00 6D 01 01 01 07 00 76 00 00 FF 00 3D 00 1A 07 00 02 07 00 2C 07 00 7C 07 00 7C 01 07 00 6D 00 07 00 74 07 00 6D 07 00 6D 07 00 6D 07 00 6D 01 01 02 02 01 01 07 00 76 01 07 00 6D 01 01 01 07 00 76 07 00 6D 00 12 07 00 74 07 00 6D 07 00 6D 07 00 6D 07 00 6D 01 01 02 02 01 01 07 00 76 01 07 00 6D 01 01 01 07 00 76 FF 00 00 00 1A 07 00 02 07 00 2C 07 00 7C 07 00 7C 01 07 00 6D 00 07 00 74 07 00 6D 07 00 6D 07 00 6D 07 00 6D 01 01 02 02 01 01 07 00 76 01 07 00 6D 01 01 01 07 00 76 07 00 6D 00 13 07 00 74 07 00 6D 07 00 6D 07 00 6D 07 00 6D 01 01 02 02 01 01 07 00 76 01 07 00 6D 01 01 01 07 00 76 01 FF 00 5A 00 1A 07 00 02 07 00 2C 07 00 7C 07 00 7C 01 07 00 6D 00 07 00 74 07 00 6D 07 00 6D 07 00 6D 07 00 6D 01 01 02 02 01 01 07 00 76 01 07 00 6D 01 01 01 07 00 76 07 00 6D 00 12 07 00 74 07 00 6D 07 00 6D 07 00 6D 07 00 6D 01 01 02 02 01 01 07 00 76 01 07 00 6D 01 01 01 07 00 76 FF 00 00 00 1A 07 00 02 07 00 2C 07 00 7C 07 00 7C 01 00 00 07 00 74 07 00 6D 07 00 6D 07 00 6D 07 00 6D 01 01 02 02 01 01 07 00 76 01 07 00 6D 01 01 01 07 00 76 07 00 6D 00 13 07 00 74 07 00 6D 07 00 6D 07 00 6D 07 00 6D 01 01 02 02 01 01 07 00 76 01 07 00 6D 01 01 01 07 00 76 07 00 04 FF 00 43 00 1A 07 00 02 07 00 2C 07 00 2C 07 00 6D 01 00 00 07 00 74 07 00 6D 07 00 6D 07 00 6D 07 00 6D 01 01 02 02 01 01 07 00 76 01 07 00 6D 01 01 01 07 00 76 07 00 6D 00 01 07 00 23 FF 00 04 00 1A 07 00 02 07 00 2C 07 00 2C 07 00 6D 01 07 00 6D 00 07 00 74 07 00 6D 07 00 6D 07 00 6D 07 00 6D 01 01 02 02 01 01 07 00 76 01 07 00 6D 01 01 01 07 00 76 07 00 6D 00 00 FF 00 3F 00 1B 07 00 02 07 00 2C 07 00 7C 07 00 7C 01 07 00 6D 00 07 00 74 07 00 6D 07 00 6D 07 00 6D 07 00 6D 01 01 02 02 01 01 07 00 76 01 07 00 6D 01 01 01 07 00 76 07 00 6D 07 00 6D 00 13 07 00 74 07 00 6D 07 00 6D 07 00 6D 07 00 6D 01 01 02 02 01 01 07 00 76 01 07 00 6D 01 01 01 07 00 76 07 00 6D FF 00 00 00 1B 07 00 02 07 00 2C 07 00 7C 07 00 7C 01 07 00 6D 00 07 00 74 07 00 6D 07 00 6D 07 00 6D 07 00 6D 01 01 02 02 01 01 07 00 76 01 07 00 6D 01 01 01 07 00 76 07 00 6D 07 00 6D 00 14 07 00 74 07 00 6D 07 00 6D 07 00 6D 07 00 6D 01 01 02 02 01 01 07 00 76 01 07 00 6D 01 01 01 07 00 76 07 00 6D 01 FF 00 5E 00 1B 07 00 02 07 00 2C 07 00 7C 07 00 7C 01 07 00 6D 00 07 00 74 07 00 6D 07 00 6D 07 00 6D 07 00 6D 01 01 02 02 01 01 07 00 76 01 07 00 6D 01 01 01 07 00 76 07 00 6D 07 00 6D 00 13 07 00 74 07 00 6D 07 00 6D 07 00 6D 07 00 6D 01 01 02 02 01 01 07 00 76 01 07 00 6D 01 01 01 07 00 76 07 00 6D FF 00 00 00 1B 07 00 02 07 00 2C 07 00 7C 07 00 7C 01 00 00 07 00 74 07 00 6D 07 00 6D 07 00 6D 07 00 6D 01 01 02 02 01 01 07 00 76 01 07 00 6D 01 01 01 07 00 76 07 00 6D 07 00 6D 00 14 07 00 74 07 00 6D 07 00 6D 07 00 6D 07 00 6D 01 01 02 02 01 01 07 00 76 01 07 00 6D 01 01 01 07 00 76 07 00 6D 07 00 04 FF 00 45 00 1B 07 00 02 07 00 2C 07 00 2C 07 00 6D 01 00 00 07 00 74 07 00 6D 07 00 6D 07 00 6D 07 00 6D 01 01 02 02 01 01 07 00 76 01 07 00 6D 01 01 01 07 00 76 07 00 6D 07 00 6D 00 01 07 00 23 FF 00 04 00 1B 07 00 02 07 00 2C 07 00 2C 07 00 6D 01 07 00 6D 00 07 00 74 07 00 6D 07 00 6D 07 00 6D 07 00 6D 01 01 02 02 01 01 07 00 76 01 07 00 6D 01 01 01 07 00 76 07 00 6D 07 00 6D 00 00 FF 00 41 00 1C 07 00 02 07 00 2C 07 00 7C 07 00 7C 01 07 00 6D 00 07 00 74 07 00 6D 07 00 6D 07 00 6D 07 00 6D 01 01 02 02 01 01 07 00 76 01 07 00 6D 01 01 01 07 00 76 07 00 6D 07 00 6D 07 00 6D 00 14 07 00 74 07 00 6D 07 00 6D 07 00 6D 07 00 6D 01 01 02 02 01 01 07 00 76 01 07 00 6D 01 01 01 07 00 76 07 00 6D 07 00 6D FF 00 00 00 1C 07 00 02 07 00 2C 07 00 7C 07 00 7C 01 07 00 6D 00 07 00 74 07 00 6D 07 00 6D 07 00 6D 07 00 6D 01 01 02 02 01 01 07 00 76 01 07 00 6D 01 01 01 07 00 76 07 00 6D 07 00 6D 07 00 6D 00 15 07 00 74 07 00 6D 07 00 6D 07 00 6D 07 00 6D 01 01 02 02 01 01 07 00 76 01 07 00 6D 01 01 01 07 00 76 07 00 6D 07 00 6D 01 FF 00 62 00 1C 07 00 02 07 00 2C 07 00 7C 07 00 7C 01 07 00 6D 00 07 00 74 07 00 6D 07 00 6D 07 00 6D 07 00 6D 01 01 02 02 01 01 07 00 76 01 07 00 6D 01 01 01 07 00 76 07 00 6D 07 00 6D 07 00 6D 00 14 07 00 74 07 00 6D 07 00 6D 07 00 6D 07 00 6D 01 01 02 02 01 01 07 00 76 01 07 00 6D 01 01 01 07 00 76 07 00 6D 07 00 6D FF 00 00 00 1C 07 00 02 07 00 2C 07 00 7C 07 00 7C 01 00 00 07 00 74 07 00 6D 07 00 6D 07 00 6D 07 00 6D 01 01 02 02 01 01 07 00 76 01 07 00 6D 01 01 01 07 00 76 07 00 6D 07 00 6D 07 00 6D 00 15 07 00 74 07 00 6D 07 00 6D 07 00 6D 07 00 6D 01 01 02 02 01 01 07 00 76 01 07 00 6D 01 01 01 07 00 76 07 00 6D 07 00 6D 07 00 04 FF 00 47 00 1C 07 00 02 07 00 2C 07 00 2C 07 00 8D 01 00 00 07 00 74 07 00 6D 07 00 6D 07 00 6D 07 00 6D 01 01 02 02 01 01 07 00 76 01 07 00 6D 01 01 01 07 00 76 07 00 6D 07 00 6D 07 00 6D 00 01 07 00 23 FF 00 04 00 1C 07 00 02 07 00 2C 07 00 2C 07 00 8D 01 07 00 8D 00 07 00 74 07 00 6D 07 00 6D 07 00 6D 07 00 6D 01 01 02 02 01 01 07 00 76 01 07 00 6D 01 01 01 07 00 76 07 00 6D 07 00 6D 07 00 6D 00 00
            //    Exceptions:
            //  Try           Handler
            //  Start  End    Start  End    Type                           
            //  -----  -----  -----  -----  -------------------------------
            //  160    176    179    184    Ljava/lang/AbstractMethodError;
            //  275    291    294    299    Ljava/lang/AbstractMethodError;
            //  503    519    522    527    Ljava/lang/AbstractMethodError;
            //  739    755    758    763    Ljava/lang/AbstractMethodError;
            //  983    999    1002   1007   Ljava/lang/AbstractMethodError;
            // 
            throw new IllegalStateException("An error occurred while decompiling this method.");
        }
        
        public Companion(final DefaultConstructorMarker $constructor_marker) {
            this();
        }
    }
}
