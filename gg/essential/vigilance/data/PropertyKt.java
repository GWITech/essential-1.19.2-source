package gg.essential.vigilance.data;

import kotlin.jvm.functions.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import kotlin.collections.*;
import kotlin.*;
import java.util.*;
import kotlin.text.*;

@Metadata(mv = { 1, 6, 0 }, k = 2, xi = 48, d1 = { "\u0000&\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0007\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0003\u001a9\u0010\u0004\u001a\u0002H\u0005\"\u0004\b\u0000\u0010\u0005*\u00020\u00062\u0006\u0010\u0007\u001a\u0002H\u00052\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u0002H\u00050\t¢\u0006\u0002\b\nH\u0082\b¢\u0006\u0002\u0010\u000b\u001a\n\u0010\f\u001a\u00020\u0002*\u00020\u0003\u001a\f\u0010\r\u001a\u00020\u0001*\u00020\u0001H\u0002¨\u0006\u000e" }, d2 = { "fullPropertyPath", "", "Lgg/essential/vigilance/data/PropertyAttributes;", "Lgg/essential/vigilance/data/PropertyAttributesExt;", "safeGet", "T", "Lgg/essential/vigilance/data/Property;", "default", "getter", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "(Lgg/essential/vigilance/data/Property;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "toPropertyAttributes", "toPropertyPath", "Vigilance" })
public final class PropertyKt
{
    private static final <T> T safeGet(final Property $this$safeGet, final T default, final Function1<? super Property, ? extends T> getter) {
        final int $i$f$safeGet = 0;
        Object invoke;
        try {
            invoke = getter.invoke((Object)$this$safeGet);
        }
        catch (final AbstractMethodError e) {
            invoke = default;
        }
        return (T)invoke;
    }
    
    @NotNull
    public static final PropertyAttributes toPropertyAttributes(@NotNull final PropertyAttributesExt $this$toPropertyAttributes) {
        Intrinsics.checkNotNullParameter((Object)$this$toPropertyAttributes, "<this>");
        return new PropertyAttributes($this$toPropertyAttributes.getType(), $this$toPropertyAttributes.getName(), $this$toPropertyAttributes.getCategory(), $this$toPropertyAttributes.getSubcategory(), $this$toPropertyAttributes.getDescription(), $this$toPropertyAttributes.getMin(), $this$toPropertyAttributes.getMax(), $this$toPropertyAttributes.getMinF(), $this$toPropertyAttributes.getMaxF(), $this$toPropertyAttributes.getDecimalPlaces(), $this$toPropertyAttributes.getIncrement(), CollectionsKt.toList((Iterable)$this$toPropertyAttributes.getOptions()), $this$toPropertyAttributes.getAllowAlpha(), $this$toPropertyAttributes.getPlaceholder(), $this$toPropertyAttributes.getProtected(), $this$toPropertyAttributes.getTriggerActionOnInitialization(), $this$toPropertyAttributes.getHidden());
    }
    
    @NotNull
    public static final String fullPropertyPath(@NotNull final PropertyAttributesExt $this$fullPropertyPath) {
        Intrinsics.checkNotNullParameter((Object)$this$fullPropertyPath, "<this>");
        final StringBuilder sb = new StringBuilder();
        sb.append(toPropertyPath($this$fullPropertyPath.getCategory())).append(".");
        if (!Intrinsics.areEqual((Object)$this$fullPropertyPath.getSubcategory(), (Object)"")) {
            sb.append(toPropertyPath($this$fullPropertyPath.getSubcategory())).append(".");
        }
        sb.append(toPropertyPath($this$fullPropertyPath.getName()));
        final String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue((Object)string, "sb.toString()");
        return string;
    }
    
    @Deprecated(message = "", replaceWith = @ReplaceWith(expression = "PropertyAttributesExt(this).fullPropertyPath()", imports = { "gg.essential.vigilance.data.PropertyAttributesExt" }))
    @NotNull
    @java.lang.Deprecated
    public static final String fullPropertyPath(@NotNull final PropertyAttributes $this$fullPropertyPath) {
        Intrinsics.checkNotNullParameter((Object)$this$fullPropertyPath, "<this>");
        return fullPropertyPath(new PropertyAttributesExt($this$fullPropertyPath));
    }
    
    private static final String toPropertyPath(final String $this$toPropertyPath) {
        final Locale english = Locale.ENGLISH;
        Intrinsics.checkNotNullExpressionValue((Object)english, "ENGLISH");
        final Locale locale = english;
        if ($this$toPropertyPath == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        final String lowerCase = $this$toPropertyPath.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue((Object)lowerCase, "(this as java.lang.String).toLowerCase(locale)");
        return StringsKt.replace$default(lowerCase, " ", "_", false, 4, (Object)null);
    }
}
