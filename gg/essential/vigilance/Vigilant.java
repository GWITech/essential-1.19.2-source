package gg.essential.vigilance;

import gg.essential.vigilance.impl.nightconfig.core.file.*;
import java.io.*;
import kotlin.jvm.*;
import kotlin.jvm.internal.*;
import kotlin.concurrent.*;
import gg.essential.vigilance.gui.*;
import gg.essential.universal.*;
import org.jetbrains.annotations.*;
import kotlin.reflect.*;
import kotlin.reflect.jvm.*;
import java.lang.reflect.*;
import java.util.function.*;
import kotlin.jvm.functions.*;
import kotlin.*;
import kotlin.collections.*;
import java.util.*;
import gg.essential.vigilance.data.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001:\u0002FGB-\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001eJ\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u0005J*\u0010\u0018\u001a\u00020\u0019\"\u0004\b\u0000\u0010!2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H!0\"2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u0002H!0\"H\u0007J'\u0010#\u001a\u00020\u00192\u0006\u0010$\u001a\u00020\u00052\u0017\u0010%\u001a\u0013\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u00190&¢\u0006\u0002\b(J\f\u0010)\u001a\b\u0012\u0004\u0012\u00020+0*J\u000e\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020\u0005J\b\u0010.\u001a\u0004\u0018\u00010/J\u0018\u00100\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u00101\u001a\u00020\u000fH\u0002J\u001c\u00100\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001e2\f\u00101\u001a\b\u0012\u0004\u0012\u00020\u000f02J\u0016\u00100\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u00101\u001a\u00020\u000fJ\u001c\u00100\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020\u00052\f\u00101\u001a\b\u0012\u0004\u0012\u00020\u000f02J*\u00100\u001a\u00020\u0019\"\u0004\b\u0000\u0010!2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H!0\"2\f\u00101\u001a\b\u0012\u0004\u0012\u00020\u000f02H\u0007J\u0006\u00103\u001a\u00020\u0019J\u0006\u00104\u001a\u00020\u0019J\u0006\u00105\u001a\u00020\u0019J\u0006\u00106\u001a\u00020\u0019J\b\u00107\u001a\u00020\u0019H\u0002J\"\u00108\u001a\u00020\u0019\"\u0004\b\u0000\u0010!2\u0006\u0010\u001d\u001a\u00020\u001e2\f\u00109\u001a\b\u0012\u0004\u0012\u0002H!0:J\"\u00108\u001a\u00020\u0019\"\u0004\b\u0000\u0010!2\u0006\u0010\u001f\u001a\u00020\u00052\f\u00109\u001a\b\u0012\u0004\u0012\u0002H!0:J0\u00108\u001a\u00020\u0019\"\u0004\b\u0000\u0010!2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H!0\"2\u0012\u00109\u001a\u000e\u0012\u0004\u0012\u0002H!\u0012\u0004\u0012\u00020\u00190&H\u0007J\u000e\u0010;\u001a\u00020\u00192\u0006\u0010<\u001a\u00020\u001bJ\u0016\u0010=\u001a\u00020\u00192\u0006\u0010#\u001a\u00020\u00052\u0006\u0010>\u001a\u00020\u0005J\u001e\u0010?\u001a\u00020\u00192\u0006\u0010#\u001a\u00020\u00052\u0006\u0010@\u001a\u00020\u00052\u0006\u0010>\u001a\u00020\u0005J\u0006\u0010A\u001a\u00020\u0019J'\u0010B\u001a\u00020\u0019\"\u0004\b\u0000\u0010!*\b\u0012\u0004\u0012\u0002H!0\"2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u0002H!0\"H\u0087\u0004J&\u0010C\u001a\u00020\u0019\"\u0004\b\u0000\u0010!*\b\u0012\u0004\u0012\u0002H!0\"2\f\u00101\u001a\b\u0012\u0004\u0012\u00020\u000f02H\u0007J\u0018\u0010D\u001a\b\u0012\u0004\u0012\u00020E0**\b\u0012\u0004\u0012\u00020\u001b0*H\u0002R\u001a\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0010\u001a\n \u0012*\u0004\u0018\u00010\u00110\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006H" }, d2 = { "Lgg/essential/vigilance/Vigilant;", "", "file", "Ljava/io/File;", "guiTitle", "", "propertyCollector", "Lgg/essential/vigilance/data/PropertyCollector;", "sortingBehavior", "Lgg/essential/vigilance/data/SortingBehavior;", "(Ljava/io/File;Ljava/lang/String;Lgg/essential/vigilance/data/PropertyCollector;Lgg/essential/vigilance/data/SortingBehavior;)V", "categoryDescription", "", "Lgg/essential/vigilance/Vigilant$CategoryDescription;", "dirty", "", "fileConfig", "Lgg/essential/vigilance/impl/nightconfig/core/file/FileConfig;", "kotlin.jvm.PlatformType", "getGuiTitle", "()Ljava/lang/String;", "hasError", "getSortingBehavior", "()Lgg/essential/vigilance/data/SortingBehavior;", "addDependency", "", "property", "Lgg/essential/vigilance/data/PropertyData;", "dependency", "field", "Ljava/lang/reflect/Field;", "propertyName", "dependencyName", "T", "Lkotlin/reflect/KProperty;", "category", "name", "builder", "Lkotlin/Function1;", "Lgg/essential/vigilance/Vigilant$CategoryPropertyBuilder;", "Lkotlin/ExtensionFunctionType;", "getCategories", "", "Lgg/essential/vigilance/data/Category;", "getCategoryFromSearch", "term", "gui", "Lgg/essential/vigilance/gui/SettingsGui;", "hidePropertyIf", "condition", "Lkotlin/Function0;", "initialize", "loadData", "markDirty", "preload", "readData", "registerListener", "listener", "Ljava/util/function/Consumer;", "registerProperty", "prop", "setCategoryDescription", "description", "setSubcategoryDescription", "subcategory", "writeData", "dependsOn", "hiddenIf", "splitBySubcategory", "Lgg/essential/vigilance/data/CategoryItem;", "CategoryDescription", "CategoryPropertyBuilder", "Vigilance" })
public abstract class Vigilant
{
    @NotNull
    private final String guiTitle;
    @NotNull
    private final PropertyCollector propertyCollector;
    @NotNull
    private final SortingBehavior sortingBehavior;
    private final FileConfig fileConfig;
    @NotNull
    private final Map<String, Vigilant.CategoryDescription> categoryDescription;
    private boolean dirty;
    private boolean hasError;
    
    @JvmOverloads
    public Vigilant(@NotNull final File file, @NotNull final String guiTitle, @NotNull final PropertyCollector propertyCollector, @NotNull final SortingBehavior sortingBehavior) {
        Intrinsics.checkNotNullParameter((Object)file, "file");
        Intrinsics.checkNotNullParameter((Object)guiTitle, "guiTitle");
        Intrinsics.checkNotNullParameter((Object)propertyCollector, "propertyCollector");
        Intrinsics.checkNotNullParameter((Object)sortingBehavior, "sortingBehavior");
        super();
        this.guiTitle = guiTitle;
        this.propertyCollector = propertyCollector;
        this.sortingBehavior = sortingBehavior;
        this.fileConfig = FileConfig.of(file);
        this.categoryDescription = new LinkedHashMap<String, Vigilant.CategoryDescription>();
        try {
            this.propertyCollector.initialize(this);
        }
        catch (final Throwable e) {
            e.printStackTrace();
            this.hasError = true;
        }
    }
    
    public Vigilant(final File file, String guiTitle, PropertyCollector propertyCollector, SortingBehavior sortingBehavior, final int n, final DefaultConstructorMarker defaultConstructorMarker) {
        if ((n & 0x2) != 0x0) {
            guiTitle = "Settings";
        }
        if ((n & 0x4) != 0x0) {
            propertyCollector = new JVMAnnotationPropertyCollector();
        }
        if ((n & 0x8) != 0x0) {
            sortingBehavior = new SortingBehavior();
        }
        this(file, guiTitle, propertyCollector, sortingBehavior);
    }
    
    @NotNull
    public final String getGuiTitle() {
        return this.guiTitle;
    }
    
    @NotNull
    public final SortingBehavior getSortingBehavior() {
        return this.sortingBehavior;
    }
    
    public final void initialize() {
        this.loadData();
    }
    
    public final void loadData() {
        try {
            this.readData();
        }
        catch (final Throwable e) {
            this.writeData();
            System.out.println((Object)Intrinsics.stringPlus("Failed to read Vigilant config data from ", (Object)this.fileConfig.getFile().getName()));
            e.printStackTrace();
        }
        TimersKt.timer((String)null, false).scheduleAtFixedRate(new TimerTask(this) {
            final /* synthetic */ Vigilant this$0;
            
            public Vigilant$loadData$$inlined$fixedRateTimer$default$1(final Vigilant this$0) {
                this.this$0 = this$0;
                super();
            }
            
            @Override
            public void run() {
                final TimerTask $this$loadData_u24lambda_u2d0 = this;
                final int n = 0;
                this.this$0.writeData();
            }
        }, 0L, 30000L);
        Runtime.getRuntime().addShutdownHook(new Thread(Vigilant::loadData$lambda-1));
    }
    
    @Nullable
    public final SettingsGui gui() {
        SettingsGui settingsGui;
        if (this.hasError) {
            UChat.chat((Object)"&c[Vigilance] Error while creating config screen; check your logs for more information");
            settingsGui = null;
        }
        else {
            settingsGui = new SettingsGui(this);
        }
        return settingsGui;
    }
    
    public final void registerProperty(@NotNull final PropertyData prop) {
        Intrinsics.checkNotNullParameter((Object)prop, "prop");
        final String fullPath = PropertyKt.fullPropertyPath(prop.getAttributesExt());
        Object o;
        if ((o = this.fileConfig.get(fullPath)) == null) {
            o = prop.getAsAny();
        }
        final Object oldValue = o;
        prop.setValue(oldValue);
        this.propertyCollector.addProperty(prop);
    }
    
    @Deprecated(message = "Due to startup performance penalties due to KReflect, we advise against using this.", replaceWith = @ReplaceWith(expression = "registerListener<T>(property.javaField!!, Consumer { listener(it) })", imports = { "kotlin.reflect.jvm.javaField", "java.util.function.Consumer" }))
    @java.lang.Deprecated
    public final <T> void registerListener(@NotNull final KProperty<? extends T> property, @NotNull final Function1<? super T, Unit> listener) {
        Intrinsics.checkNotNullParameter((Object)property, "property");
        Intrinsics.checkNotNullParameter((Object)listener, "listener");
        final Field javaField = ReflectJvmMapping.getJavaField((KProperty)property);
        Intrinsics.checkNotNull((Object)javaField);
        this.registerListener(javaField, Vigilant::registerListener$lambda-2);
    }
    
    public final <T> void registerListener(@NotNull final Field field, @NotNull final Consumer<T> listener) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc_w           "field"
        //     4: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     7: aload_2         /* listener */
        //     8: ldc_w           "listener"
        //    11: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    14: aload_0         /* this */
        //    15: getfield        gg/essential/vigilance/Vigilant.propertyCollector:Lgg/essential/vigilance/data/PropertyCollector;
        //    18: invokevirtual   gg/essential/vigilance/data/PropertyCollector.getProperties:()Ljava/util/List;
        //    21: checkcast       Ljava/lang/Iterable;
        //    24: astore_3       
        //    25: nop            
        //    26: iconst_0       
        //    27: istore          $i$f$firstOrNull
        //    29: aload_3         /* $this$firstOrNull$iv */
        //    30: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //    35: astore          5
        //    37: aload           5
        //    39: invokeinterface java/util/Iterator.hasNext:()Z
        //    44: ifeq            108
        //    47: aload           5
        //    49: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    54: astore          element$iv
        //    56: aload           element$iv
        //    58: checkcast       Lgg/essential/vigilance/data/PropertyData;
        //    61: astore          it
        //    63: iconst_0       
        //    64: istore          $i$a$-firstOrNull-Vigilant$registerListener$2
        //    66: aload           it
        //    68: invokevirtual   gg/essential/vigilance/data/PropertyData.getValue:()Lgg/essential/vigilance/data/PropertyValue;
        //    71: instanceof      Lgg/essential/vigilance/data/FieldBackedPropertyValue;
        //    74: ifeq            99
        //    77: aload           it
        //    79: invokevirtual   gg/essential/vigilance/data/PropertyData.getValue:()Lgg/essential/vigilance/data/PropertyValue;
        //    82: checkcast       Lgg/essential/vigilance/data/FieldBackedPropertyValue;
        //    85: invokevirtual   gg/essential/vigilance/data/FieldBackedPropertyValue.getField$Vigilance:()Ljava/lang/reflect/Field;
        //    88: aload_1         /* field */
        //    89: invokestatic    kotlin/jvm/internal/Intrinsics.areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //    92: ifeq            99
        //    95: iconst_1       
        //    96: goto            100
        //    99: iconst_0       
        //   100: ifeq            37
        //   103: aload           element$iv
        //   105: goto            109
        //   108: aconst_null    
        //   109: dup            
        //   110: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNull:(Ljava/lang/Object;)V
        //   113: checkcast       Lgg/essential/vigilance/data/PropertyData;
        //   116: new             Lgg/essential/vigilance/Vigilant$registerListener$3;
        //   119: dup            
        //   120: aload_2         /* listener */
        //   121: invokespecial   gg/essential/vigilance/Vigilant$registerListener$3.<init>:(Ljava/util/function/Consumer;)V
        //   124: checkcast       Lkotlin/jvm/functions/Function1;
        //   127: invokevirtual   gg/essential/vigilance/data/PropertyData.setAction:(Lkotlin/jvm/functions/Function1;)V
        //   130: return         
        //    Signature:
        //  <T:Ljava/lang/Object;>(Ljava/lang/reflect/Field;Ljava/util/function/Consumer<TT;>;)V
        //    MethodParameters:
        //  Name      Flags  
        //  --------  -----
        //  field     
        //  listener  
        //    StackMapTable: 00 05 FE 00 25 07 01 4D 01 07 01 53 FE 00 3D 07 00 04 07 01 05 01 40 01 F8 00 07 40 07 00 04
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public final <T> void registerListener(@NotNull final String propertyName, @NotNull final Consumer<T> listener) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc_w           "propertyName"
        //     4: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     7: aload_2         /* listener */
        //     8: ldc_w           "listener"
        //    11: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    14: aload_0         /* this */
        //    15: getfield        gg/essential/vigilance/Vigilant.propertyCollector:Lgg/essential/vigilance/data/PropertyCollector;
        //    18: invokevirtual   gg/essential/vigilance/data/PropertyCollector.getProperties:()Ljava/util/List;
        //    21: checkcast       Ljava/lang/Iterable;
        //    24: astore_3       
        //    25: nop            
        //    26: iconst_0       
        //    27: istore          $i$f$firstOrNull
        //    29: aload_3         /* $this$firstOrNull$iv */
        //    30: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //    35: astore          5
        //    37: aload           5
        //    39: invokeinterface java/util/Iterator.hasNext:()Z
        //    44: ifeq            111
        //    47: aload           5
        //    49: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    54: astore          element$iv
        //    56: aload           element$iv
        //    58: checkcast       Lgg/essential/vigilance/data/PropertyData;
        //    61: astore          it
        //    63: iconst_0       
        //    64: istore          $i$a$-firstOrNull-Vigilant$registerListener$4
        //    66: aload           it
        //    68: invokevirtual   gg/essential/vigilance/data/PropertyData.getValue:()Lgg/essential/vigilance/data/PropertyValue;
        //    71: instanceof      Lgg/essential/vigilance/data/FieldBackedPropertyValue;
        //    74: ifeq            102
        //    77: aload           it
        //    79: invokevirtual   gg/essential/vigilance/data/PropertyData.getValue:()Lgg/essential/vigilance/data/PropertyValue;
        //    82: checkcast       Lgg/essential/vigilance/data/FieldBackedPropertyValue;
        //    85: invokevirtual   gg/essential/vigilance/data/FieldBackedPropertyValue.getField$Vigilance:()Ljava/lang/reflect/Field;
        //    88: invokevirtual   java/lang/reflect/Field.getName:()Ljava/lang/String;
        //    91: aload_1         /* propertyName */
        //    92: invokestatic    kotlin/jvm/internal/Intrinsics.areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //    95: ifeq            102
        //    98: iconst_1       
        //    99: goto            103
        //   102: iconst_0       
        //   103: ifeq            37
        //   106: aload           element$iv
        //   108: goto            112
        //   111: aconst_null    
        //   112: dup            
        //   113: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNull:(Ljava/lang/Object;)V
        //   116: checkcast       Lgg/essential/vigilance/data/PropertyData;
        //   119: new             Lgg/essential/vigilance/Vigilant$registerListener$5;
        //   122: dup            
        //   123: aload_2         /* listener */
        //   124: invokespecial   gg/essential/vigilance/Vigilant$registerListener$5.<init>:(Ljava/util/function/Consumer;)V
        //   127: checkcast       Lkotlin/jvm/functions/Function1;
        //   130: invokevirtual   gg/essential/vigilance/data/PropertyData.setAction:(Lkotlin/jvm/functions/Function1;)V
        //   133: return         
        //    Signature:
        //  <T:Ljava/lang/Object;>(Ljava/lang/String;Ljava/util/function/Consumer<TT;>;)V
        //    MethodParameters:
        //  Name          Flags  
        //  ------------  -----
        //  propertyName  
        //  listener      
        //    StackMapTable: 00 05 FE 00 25 07 01 4D 01 07 01 53 FE 00 40 07 00 04 07 01 05 01 40 01 F8 00 07 40 07 00 04
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @Deprecated(message = "Due to startup performance penalties due to KReflect, we advise against using this.", replaceWith = @ReplaceWith(expression = "addDependency<T>(javaField!!, dependency.javaField!!)", imports = { "kotlin.reflect.jvm.javaField", "kotlin.reflect.jvm.javaField" }))
    @java.lang.Deprecated
    public final <T> void dependsOn(@NotNull final KProperty<? extends T> $this$dependsOn, @NotNull final KProperty<? extends T> dependency) {
        Intrinsics.checkNotNullParameter((Object)$this$dependsOn, "<this>");
        Intrinsics.checkNotNullParameter((Object)dependency, "dependency");
        final Field javaField = ReflectJvmMapping.getJavaField((KProperty)$this$dependsOn);
        Intrinsics.checkNotNull((Object)javaField);
        final Field javaField2 = ReflectJvmMapping.getJavaField((KProperty)dependency);
        Intrinsics.checkNotNull((Object)javaField2);
        this.addDependency(javaField, javaField2);
    }
    
    @Deprecated(message = "Due to startup performance penalties due to KReflect, we advise against using this.", replaceWith = @ReplaceWith(expression = "addDependency<T>(property.javaField!!, dependency.javaField!!)", imports = { "kotlin.reflect.jvm.javaField", "kotlin.reflect.jvm.javaField" }))
    @java.lang.Deprecated
    public final <T> void addDependency(@NotNull final KProperty<? extends T> property, @NotNull final KProperty<? extends T> dependency) {
        Intrinsics.checkNotNullParameter((Object)property, "property");
        Intrinsics.checkNotNullParameter((Object)dependency, "dependency");
        final Field javaField = ReflectJvmMapping.getJavaField((KProperty)property);
        Intrinsics.checkNotNull((Object)javaField);
        final Field javaField2 = ReflectJvmMapping.getJavaField((KProperty)dependency);
        Intrinsics.checkNotNull((Object)javaField2);
        this.addDependency(javaField, javaField2);
    }
    
    public final void addDependency(@NotNull final String propertyName, @NotNull final String dependencyName) {
        Intrinsics.checkNotNullParameter((Object)propertyName, "propertyName");
        Intrinsics.checkNotNullParameter((Object)dependencyName, "dependencyName");
        final PropertyData property$Vigilance = this.propertyCollector.getProperty$Vigilance(propertyName);
        Intrinsics.checkNotNull((Object)property$Vigilance);
        final PropertyData property$Vigilance2 = this.propertyCollector.getProperty$Vigilance(dependencyName);
        Intrinsics.checkNotNull((Object)property$Vigilance2);
        this.addDependency(property$Vigilance, property$Vigilance2);
    }
    
    public final void addDependency(@NotNull final Field field, @NotNull final Field dependency) {
        Intrinsics.checkNotNullParameter((Object)field, "field");
        Intrinsics.checkNotNullParameter((Object)dependency, "dependency");
        final PropertyData property$Vigilance = this.propertyCollector.getProperty$Vigilance(field);
        Intrinsics.checkNotNull((Object)property$Vigilance);
        final PropertyData property$Vigilance2 = this.propertyCollector.getProperty$Vigilance(dependency);
        Intrinsics.checkNotNull((Object)property$Vigilance2);
        this.addDependency(property$Vigilance, property$Vigilance2);
    }
    
    private final void addDependency(final PropertyData property, final PropertyData dependency) {
        if (dependency.getDataType() != PropertyType.SWITCH && dependency.getDataType() != PropertyType.CHECKBOX) {
            throw new IllegalStateException("Dependency must be a boolean PropertyType!".toString());
        }
        property.setDependsOn(dependency);
        dependency.setHasDependants(true);
    }
    
    @Deprecated(message = "Due to startup performance penalties due to KReflect, we advise against using this.", replaceWith = @ReplaceWith(expression = "hidePropertyIf(javaField!!, condition())", imports = { "kotlin.reflect.jvm.javaField" }))
    @java.lang.Deprecated
    public final <T> void hiddenIf(@NotNull final KProperty<? extends T> $this$hiddenIf, @NotNull final Function0<Boolean> condition) {
        Intrinsics.checkNotNullParameter((Object)$this$hiddenIf, "<this>");
        Intrinsics.checkNotNullParameter((Object)condition, "condition");
        final PropertyCollector propertyCollector = this.propertyCollector;
        final Field javaField = ReflectJvmMapping.getJavaField((KProperty)$this$hiddenIf);
        Intrinsics.checkNotNull((Object)javaField);
        final PropertyData property$Vigilance = propertyCollector.getProperty$Vigilance(javaField);
        Intrinsics.checkNotNull((Object)property$Vigilance);
        this.hidePropertyIf(property$Vigilance, (boolean)condition.invoke());
    }
    
    @Deprecated(message = "Due to startup performance penalties due to KReflect, we advise against using this.", replaceWith = @ReplaceWith(expression = "hidePropertyIf(property.javaField!!, condition())", imports = { "kotlin.reflect.jvm.javaField" }))
    @java.lang.Deprecated
    public final <T> void hidePropertyIf(@NotNull final KProperty<? extends T> property, @NotNull final Function0<Boolean> condition) {
        Intrinsics.checkNotNullParameter((Object)property, "property");
        Intrinsics.checkNotNullParameter((Object)condition, "condition");
        final PropertyCollector propertyCollector = this.propertyCollector;
        final Field javaField = ReflectJvmMapping.getJavaField((KProperty)property);
        Intrinsics.checkNotNull((Object)javaField);
        final PropertyData property$Vigilance = propertyCollector.getProperty$Vigilance(javaField);
        Intrinsics.checkNotNull((Object)property$Vigilance);
        this.hidePropertyIf(property$Vigilance, (boolean)condition.invoke());
    }
    
    public final void hidePropertyIf(@NotNull final String propertyName, @NotNull final Function0<Boolean> condition) {
        Intrinsics.checkNotNullParameter((Object)propertyName, "propertyName");
        Intrinsics.checkNotNullParameter((Object)condition, "condition");
        final PropertyData property$Vigilance = this.propertyCollector.getProperty$Vigilance(propertyName);
        Intrinsics.checkNotNull((Object)property$Vigilance);
        this.hidePropertyIf(property$Vigilance, (boolean)condition.invoke());
    }
    
    public final void hidePropertyIf(@NotNull final Field field, @NotNull final Function0<Boolean> condition) {
        Intrinsics.checkNotNullParameter((Object)field, "field");
        Intrinsics.checkNotNullParameter((Object)condition, "condition");
        final PropertyData property$Vigilance = this.propertyCollector.getProperty$Vigilance(field);
        Intrinsics.checkNotNull((Object)property$Vigilance);
        this.hidePropertyIf(property$Vigilance, (boolean)condition.invoke());
    }
    
    public final void hidePropertyIf(@NotNull final Field field, final boolean condition) {
        Intrinsics.checkNotNullParameter((Object)field, "field");
        final PropertyData property$Vigilance = this.propertyCollector.getProperty$Vigilance(field);
        Intrinsics.checkNotNull((Object)property$Vigilance);
        this.hidePropertyIf(property$Vigilance, condition);
    }
    
    private final void hidePropertyIf(final PropertyData property, final boolean condition) {
        if (condition) {
            property.getAttributesExt().setHidden(true);
        }
    }
    
    public final void setCategoryDescription(@NotNull final String category, @NotNull final String description) {
        Intrinsics.checkNotNullParameter((Object)category, "category");
        Intrinsics.checkNotNullParameter((Object)description, "description");
        final Vigilant.CategoryDescription current = this.categoryDescription.get(category);
        if (current != null) {
            current.setDescription(description);
        }
        else {
            this.categoryDescription.put(category, new Vigilant.CategoryDescription(description, (Map)null, 2, (DefaultConstructorMarker)null));
        }
    }
    
    public final void setSubcategoryDescription(@NotNull final String category, @NotNull final String subcategory, @NotNull final String description) {
        Intrinsics.checkNotNullParameter((Object)category, "category");
        Intrinsics.checkNotNullParameter((Object)subcategory, "subcategory");
        Intrinsics.checkNotNullParameter((Object)description, "description");
        final Vigilant.CategoryDescription current = this.categoryDescription.get(category);
        if (current != null) {
            current.getSubcategoryDescriptions().put(subcategory, description);
        }
        else {
            this.categoryDescription.put(category, new Vigilant.CategoryDescription((String)null, MapsKt.mutableMapOf(new Pair[] { TuplesKt.to((Object)subcategory, (Object)description) })));
        }
    }
    
    @NotNull
    public final List<Category> getCategories() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        gg/essential/vigilance/Vigilant.propertyCollector:Lgg/essential/vigilance/data/PropertyCollector;
        //     4: invokevirtual   gg/essential/vigilance/data/PropertyCollector.getProperties:()Ljava/util/List;
        //     7: checkcast       Ljava/lang/Iterable;
        //    10: astore_1       
        //    11: nop            
        //    12: iconst_0       
        //    13: istore_2        /* $i$f$filter */
        //    14: aload_1         /* $this$filter$iv */
        //    15: astore_3       
        //    16: new             Ljava/util/ArrayList;
        //    19: dup            
        //    20: invokespecial   java/util/ArrayList.<init>:()V
        //    23: checkcast       Ljava/util/Collection;
        //    26: astore          destination$iv$iv
        //    28: iconst_0       
        //    29: istore          $i$f$filterTo
        //    31: aload_3         /* $this$filterTo$iv$iv */
        //    32: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //    37: astore          6
        //    39: aload           6
        //    41: invokeinterface java/util/Iterator.hasNext:()Z
        //    46: ifeq            100
        //    49: aload           6
        //    51: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    56: astore          element$iv$iv
        //    58: aload           element$iv$iv
        //    60: checkcast       Lgg/essential/vigilance/data/PropertyData;
        //    63: astore          it
        //    65: iconst_0       
        //    66: istore          $i$a$-filter-Vigilant$getCategories$1
        //    68: aload           it
        //    70: invokevirtual   gg/essential/vigilance/data/PropertyData.getAttributesExt:()Lgg/essential/vigilance/data/PropertyAttributesExt;
        //    73: invokevirtual   gg/essential/vigilance/data/PropertyAttributesExt.getHidden:()Z
        //    76: ifne            83
        //    79: iconst_1       
        //    80: goto            84
        //    83: iconst_0       
        //    84: ifeq            39
        //    87: aload           destination$iv$iv
        //    89: aload           element$iv$iv
        //    91: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //    96: pop            
        //    97: goto            39
        //   100: aload           destination$iv$iv
        //   102: checkcast       Ljava/util/List;
        //   105: nop            
        //   106: checkcast       Ljava/lang/Iterable;
        //   109: astore_1       
        //   110: nop            
        //   111: iconst_0       
        //   112: istore_2        /* $i$f$groupBy */
        //   113: aload_1         /* $this$groupBy$iv */
        //   114: astore_3       
        //   115: new             Ljava/util/LinkedHashMap;
        //   118: dup            
        //   119: invokespecial   java/util/LinkedHashMap.<init>:()V
        //   122: checkcast       Ljava/util/Map;
        //   125: astore          destination$iv$iv
        //   127: iconst_0       
        //   128: istore          $i$f$groupByTo
        //   130: aload_3         /* $this$groupByTo$iv$iv */
        //   131: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   136: astore          6
        //   138: aload           6
        //   140: invokeinterface java/util/Iterator.hasNext:()Z
        //   145: ifeq            264
        //   148: aload           6
        //   150: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   155: astore          element$iv$iv
        //   157: aload           element$iv$iv
        //   159: checkcast       Lgg/essential/vigilance/data/PropertyData;
        //   162: astore          it
        //   164: iconst_0       
        //   165: istore          $i$a$-groupBy-Vigilant$getCategories$2
        //   167: aload           it
        //   169: invokevirtual   gg/essential/vigilance/data/PropertyData.getAttributesExt:()Lgg/essential/vigilance/data/PropertyAttributesExt;
        //   172: invokevirtual   gg/essential/vigilance/data/PropertyAttributesExt.getLocalizedCategory$Vigilance:()Ljava/lang/String;
        //   175: aload           it
        //   177: invokevirtual   gg/essential/vigilance/data/PropertyData.getAttributesExt:()Lgg/essential/vigilance/data/PropertyAttributesExt;
        //   180: invokevirtual   gg/essential/vigilance/data/PropertyAttributesExt.getCategory:()Ljava/lang/String;
        //   183: invokestatic    kotlin/TuplesKt.to:(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
        //   186: astore          key$iv$iv
        //   188: aload           destination$iv$iv
        //   190: astore          $this$getOrPut$iv$iv$iv
        //   192: iconst_0       
        //   193: istore          $i$f$getOrPut
        //   195: aload           $this$getOrPut$iv$iv$iv
        //   197: aload           key$iv$iv
        //   199: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   204: astore          value$iv$iv$iv
        //   206: aload           value$iv$iv$iv
        //   208: ifnonnull       243
        //   211: iconst_0       
        //   212: istore          $i$a$-getOrPut-CollectionsKt___CollectionsKt$groupByTo$list$1$iv$iv
        //   214: new             Ljava/util/ArrayList;
        //   217: dup            
        //   218: invokespecial   java/util/ArrayList.<init>:()V
        //   221: checkcast       Ljava/util/List;
        //   224: astore          answer$iv$iv$iv
        //   226: aload           $this$getOrPut$iv$iv$iv
        //   228: aload           key$iv$iv
        //   230: aload           answer$iv$iv$iv
        //   232: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   237: pop            
        //   238: aload           answer$iv$iv$iv
        //   240: goto            246
        //   243: aload           value$iv$iv$iv
        //   245: nop            
        //   246: checkcast       Ljava/util/List;
        //   249: astore          list$iv$iv
        //   251: aload           list$iv$iv
        //   253: aload           element$iv$iv
        //   255: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   260: pop            
        //   261: goto            138
        //   264: aload           destination$iv$iv
        //   266: nop            
        //   267: astore_1        /* $this$groupBy$iv */
        //   268: nop            
        //   269: iconst_0       
        //   270: istore_2        /* $i$f$map */
        //   271: aload_1         /* $this$map$iv */
        //   272: astore_3       
        //   273: new             Ljava/util/ArrayList;
        //   276: dup            
        //   277: aload_1         /* $this$map$iv */
        //   278: invokeinterface java/util/Map.size:()I
        //   283: invokespecial   java/util/ArrayList.<init>:(I)V
        //   286: checkcast       Ljava/util/Collection;
        //   289: astore          destination$iv$iv
        //   291: iconst_0       
        //   292: istore          $i$f$mapTo
        //   294: aload_3         /* $this$mapTo$iv$iv */
        //   295: astore          6
        //   297: aload           6
        //   299: invokeinterface java/util/Map.entrySet:()Ljava/util/Set;
        //   304: invokeinterface java/util/Set.iterator:()Ljava/util/Iterator;
        //   309: astore          8
        //   311: aload           8
        //   313: invokeinterface java/util/Iterator.hasNext:()Z
        //   318: ifeq            477
        //   321: aload           8
        //   323: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   328: checkcast       Ljava/util/Map$Entry;
        //   331: astore          item$iv$iv
        //   333: aload           destination$iv$iv
        //   335: aload           item$iv$iv
        //   337: astore          10
        //   339: astore          20
        //   341: iconst_0       
        //   342: istore          $i$a$-map-Vigilant$getCategories$3
        //   344: aload           it
        //   346: invokeinterface java/util/Map$Entry.getKey:()Ljava/lang/Object;
        //   351: checkcast       Lkotlin/Pair;
        //   354: invokevirtual   kotlin/Pair.getFirst:()Ljava/lang/Object;
        //   357: checkcast       Ljava/lang/String;
        //   360: aload_0         /* this */
        //   361: aload           it
        //   363: invokeinterface java/util/Map$Entry.getValue:()Ljava/lang/Object;
        //   368: checkcast       Ljava/util/List;
        //   371: invokespecial   gg/essential/vigilance/Vigilant.splitBySubcategory:(Ljava/util/List;)Ljava/util/List;
        //   374: aload_0         /* this */
        //   375: getfield        gg/essential/vigilance/Vigilant.categoryDescription:Ljava/util/Map;
        //   378: aload           it
        //   380: invokeinterface java/util/Map$Entry.getKey:()Ljava/lang/Object;
        //   385: checkcast       Lkotlin/Pair;
        //   388: invokevirtual   kotlin/Pair.getSecond:()Ljava/lang/Object;
        //   391: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   396: checkcast       Lgg/essential/vigilance/Vigilant$CategoryDescription;
        //   399: dup            
        //   400: ifnonnull       408
        //   403: pop            
        //   404: aconst_null    
        //   405: goto            446
        //   408: invokevirtual   gg/essential/vigilance/Vigilant$CategoryDescription.getDescription:()Ljava/lang/String;
        //   411: dup            
        //   412: ifnonnull       420
        //   415: pop            
        //   416: aconst_null    
        //   417: goto            446
        //   420: astore          15
        //   422: astore          16
        //   424: astore          17
        //   426: iconst_0       
        //   427: istore          $i$a$-let-Vigilant$getCategories$3$1
        //   429: getstatic       gg/essential/vigilance/impl/I18n.INSTANCE:Lgg/essential/vigilance/impl/I18n;
        //   432: aload           desc
        //   434: invokevirtual   gg/essential/vigilance/impl/I18n.format:(Ljava/lang/String;)Ljava/lang/String;
        //   437: astore          19
        //   439: aload           17
        //   441: aload           16
        //   443: aload           19
        //   445: nop            
        //   446: astore          21
        //   448: astore          22
        //   450: astore          23
        //   452: new             Lgg/essential/vigilance/data/Category;
        //   455: dup            
        //   456: aload           23
        //   458: aload           22
        //   460: aload           21
        //   462: invokespecial   gg/essential/vigilance/data/Category.<init>:(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V
        //   465: aload           20
        //   467: swap           
        //   468: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //   473: pop            
        //   474: goto            311
        //   477: aload           destination$iv$iv
        //   479: checkcast       Ljava/util/List;
        //   482: nop            
        //   483: checkcast       Ljava/lang/Iterable;
        //   486: aload_0         /* this */
        //   487: getfield        gg/essential/vigilance/Vigilant.sortingBehavior:Lgg/essential/vigilance/data/SortingBehavior;
        //   490: invokevirtual   gg/essential/vigilance/data/SortingBehavior.getCategoryComparator:()Ljava/util/Comparator;
        //   493: invokestatic    kotlin/collections/CollectionsKt.sortedWith:(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;
        //   496: areturn        
        //    Signature:
        //  ()Ljava/util/List<Lgg/essential/vigilance/data/Category;>;
        //    StackMapTable: 00 0D FF 00 27 00 07 07 00 02 07 01 4D 01 07 01 4D 07 02 00 01 07 01 53 00 00 FE 00 2B 07 00 04 07 01 05 01 40 01 F8 00 0F FF 00 25 00 07 07 00 02 07 01 4D 01 07 01 4D 07 00 85 01 07 01 53 00 00 FF 00 68 00 0E 07 00 02 07 01 4D 01 07 01 4D 07 00 85 01 07 01 53 07 00 04 07 01 05 01 07 01 EB 07 00 85 01 07 00 04 00 00 42 07 00 04 FF 00 11 00 07 07 00 02 07 01 4D 01 07 01 4D 07 00 85 01 07 01 53 00 00 FF 00 2E 00 09 07 00 02 07 00 85 01 07 00 85 07 02 00 01 07 00 85 00 07 01 53 00 00 FF 00 60 00 15 07 00 02 07 00 85 01 07 00 85 07 02 00 01 07 00 85 00 07 01 53 07 02 20 07 02 20 01 00 00 00 00 00 00 00 00 07 02 00 00 03 07 00 90 07 02 09 07 00 5A FF 00 0B 00 15 07 00 02 07 00 85 01 07 00 85 07 02 00 01 07 00 85 00 07 01 53 07 02 20 07 02 20 01 00 00 00 00 00 00 00 00 07 02 00 00 03 07 00 90 07 02 09 07 00 90 FF 00 19 00 15 07 00 02 07 00 85 01 07 00 85 07 02 00 01 07 00 85 00 07 01 53 07 02 20 07 02 20 01 00 00 00 00 00 00 00 00 07 02 00 00 03 07 00 90 07 02 09 07 00 90 FF 00 1E 00 09 07 00 02 07 00 85 01 07 00 85 07 02 00 01 07 00 85 00 07 01 53 00 00
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @NotNull
    public final Category getCategoryFromSearch(@NotNull final String term) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc_w           "term"
        //     4: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     7: aload_0         /* this */
        //     8: getfield        gg/essential/vigilance/Vigilant.propertyCollector:Lgg/essential/vigilance/data/PropertyCollector;
        //    11: invokevirtual   gg/essential/vigilance/data/PropertyCollector.getProperties:()Ljava/util/List;
        //    14: checkcast       Ljava/lang/Iterable;
        //    17: astore_3       
        //    18: nop            
        //    19: iconst_0       
        //    20: istore          $i$f$filter
        //    22: aload_3         /* $this$filter$iv */
        //    23: astore          5
        //    25: new             Ljava/util/ArrayList;
        //    28: dup            
        //    29: invokespecial   java/util/ArrayList.<init>:()V
        //    32: checkcast       Ljava/util/Collection;
        //    35: astore          destination$iv$iv
        //    37: iconst_0       
        //    38: istore          $i$f$filterTo
        //    40: aload           $this$filterTo$iv$iv
        //    42: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //    47: astore          8
        //    49: aload           8
        //    51: invokeinterface java/util/Iterator.hasNext:()Z
        //    56: ifeq            258
        //    59: aload           8
        //    61: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    66: astore          element$iv$iv
        //    68: aload           element$iv$iv
        //    70: checkcast       Lgg/essential/vigilance/data/PropertyData;
        //    73: astore          it
        //    75: iconst_0       
        //    76: istore          $i$a$-filter-Vigilant$getCategoryFromSearch$sorted$1
        //    78: aload           it
        //    80: invokevirtual   gg/essential/vigilance/data/PropertyData.getAttributesExt:()Lgg/essential/vigilance/data/PropertyAttributesExt;
        //    83: invokevirtual   gg/essential/vigilance/data/PropertyAttributesExt.getHidden:()Z
        //    86: ifne            240
        //    89: aload           it
        //    91: invokevirtual   gg/essential/vigilance/data/PropertyData.getAttributesExt:()Lgg/essential/vigilance/data/PropertyAttributesExt;
        //    94: invokevirtual   gg/essential/vigilance/data/PropertyAttributesExt.getLocalizedName$Vigilance:()Ljava/lang/String;
        //    97: checkcast       Ljava/lang/CharSequence;
        //   100: aload_1         /* term */
        //   101: checkcast       Ljava/lang/CharSequence;
        //   104: iconst_1       
        //   105: invokestatic    kotlin/text/StringsKt.contains:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z
        //   108: ifne            236
        //   111: aload           it
        //   113: invokevirtual   gg/essential/vigilance/data/PropertyData.getAttributesExt:()Lgg/essential/vigilance/data/PropertyAttributesExt;
        //   116: invokevirtual   gg/essential/vigilance/data/PropertyAttributesExt.getLocalizedDescription$Vigilance:()Ljava/lang/String;
        //   119: checkcast       Ljava/lang/CharSequence;
        //   122: aload_1         /* term */
        //   123: checkcast       Ljava/lang/CharSequence;
        //   126: iconst_1       
        //   127: invokestatic    kotlin/text/StringsKt.contains:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z
        //   130: ifne            236
        //   133: aload           it
        //   135: invokevirtual   gg/essential/vigilance/data/PropertyData.getAttributesExt:()Lgg/essential/vigilance/data/PropertyAttributesExt;
        //   138: invokevirtual   gg/essential/vigilance/data/PropertyAttributesExt.getLocalizedSearchTags$Vigilance:()Ljava/util/List;
        //   141: checkcast       Ljava/lang/Iterable;
        //   144: astore          $this$any$iv
        //   146: iconst_0       
        //   147: istore          $i$f$any
        //   149: aload           $this$any$iv
        //   151: instanceof      Ljava/util/Collection;
        //   154: ifeq            174
        //   157: aload           $this$any$iv
        //   159: checkcast       Ljava/util/Collection;
        //   162: invokeinterface java/util/Collection.isEmpty:()Z
        //   167: ifeq            174
        //   170: iconst_0       
        //   171: goto            233
        //   174: aload           $this$any$iv
        //   176: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   181: astore          14
        //   183: aload           14
        //   185: invokeinterface java/util/Iterator.hasNext:()Z
        //   190: ifeq            232
        //   193: aload           14
        //   195: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   200: astore          element$iv
        //   202: aload           element$iv
        //   204: checkcast       Ljava/lang/String;
        //   207: astore          str
        //   209: iconst_0       
        //   210: istore          $i$a$-any-Vigilant$getCategoryFromSearch$sorted$1$1
        //   212: aload           str
        //   214: checkcast       Ljava/lang/CharSequence;
        //   217: aload_1         /* term */
        //   218: checkcast       Ljava/lang/CharSequence;
        //   221: iconst_1       
        //   222: invokestatic    kotlin/text/StringsKt.contains:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z
        //   225: ifeq            183
        //   228: iconst_1       
        //   229: goto            233
        //   232: iconst_0       
        //   233: ifeq            240
        //   236: iconst_1       
        //   237: goto            241
        //   240: iconst_0       
        //   241: nop            
        //   242: ifeq            49
        //   245: aload           destination$iv$iv
        //   247: aload           element$iv$iv
        //   249: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //   254: pop            
        //   255: goto            49
        //   258: aload           destination$iv$iv
        //   260: checkcast       Ljava/util/List;
        //   263: nop            
        //   264: checkcast       Ljava/lang/Iterable;
        //   267: aload_0         /* this */
        //   268: getfield        gg/essential/vigilance/Vigilant.sortingBehavior:Lgg/essential/vigilance/data/SortingBehavior;
        //   271: invokevirtual   gg/essential/vigilance/data/SortingBehavior.getPropertyComparator:()Ljava/util/Comparator;
        //   274: invokestatic    kotlin/collections/CollectionsKt.sortedWith:(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;
        //   277: astore_2        /* sorted */
        //   278: new             Lgg/essential/vigilance/data/Category;
        //   281: dup            
        //   282: ldc_w           ""
        //   285: aload_0         /* this */
        //   286: aload_2         /* sorted */
        //   287: invokespecial   gg/essential/vigilance/Vigilant.splitBySubcategory:(Ljava/util/List;)Ljava/util/List;
        //   290: aconst_null    
        //   291: invokespecial   gg/essential/vigilance/data/Category.<init>:(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V
        //   294: areturn        
        //    MethodParameters:
        //  Name  Flags  
        //  ----  -----
        //  term  
        //    StackMapTable: 00 09 FF 00 31 00 09 07 00 02 07 00 90 00 07 01 4D 01 07 01 4D 07 02 00 01 07 01 53 00 00 FF 00 7C 00 0E 07 00 02 07 00 90 00 07 01 4D 01 07 01 4D 07 02 00 01 07 01 53 07 00 04 07 01 05 01 07 01 4D 01 00 00 FC 00 08 07 01 53 30 FF 00 00 00 0E 07 00 02 07 00 90 00 07 01 4D 01 07 01 4D 07 02 00 01 07 01 53 07 00 04 07 01 05 01 07 01 4D 01 00 01 01 F9 00 02 03 40 01 F8 00 10
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public final void markDirty() {
        this.dirty = true;
    }
    
    public final void preload() {
    }
    
    private final void readData() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        gg/essential/vigilance/Vigilant.fileConfig:Lgg/essential/vigilance/impl/nightconfig/core/file/FileConfig;
        //     4: invokeinterface gg/essential/vigilance/impl/nightconfig/core/file/FileConfig.load:()V
        //     9: aload_0         /* this */
        //    10: getfield        gg/essential/vigilance/Vigilant.propertyCollector:Lgg/essential/vigilance/data/PropertyCollector;
        //    13: invokevirtual   gg/essential/vigilance/data/PropertyCollector.getProperties:()Ljava/util/List;
        //    16: checkcast       Ljava/lang/Iterable;
        //    19: astore_1        /* $this$filter$iv */
        //    20: iconst_0       
        //    21: istore_2        /* $i$f$filter */
        //    22: aload_1         /* $this$filter$iv */
        //    23: astore_3       
        //    24: new             Ljava/util/ArrayList;
        //    27: dup            
        //    28: invokespecial   java/util/ArrayList.<init>:()V
        //    31: checkcast       Ljava/util/Collection;
        //    34: astore          destination$iv$iv
        //    36: iconst_0       
        //    37: istore          $i$f$filterTo
        //    39: aload_3         /* $this$filterTo$iv$iv */
        //    40: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //    45: astore          6
        //    47: aload           6
        //    49: invokeinterface java/util/Iterator.hasNext:()Z
        //    54: ifeq            100
        //    57: aload           6
        //    59: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    64: astore          element$iv$iv
        //    66: aload           element$iv$iv
        //    68: checkcast       Lgg/essential/vigilance/data/PropertyData;
        //    71: astore          it
        //    73: iconst_0       
        //    74: istore          $i$a$-filter-Vigilant$readData$1
        //    76: aload           it
        //    78: invokevirtual   gg/essential/vigilance/data/PropertyData.getValue:()Lgg/essential/vigilance/data/PropertyValue;
        //    81: invokevirtual   gg/essential/vigilance/data/PropertyValue.getWriteDataToFile:()Z
        //    84: ifeq            47
        //    87: aload           destination$iv$iv
        //    89: aload           element$iv$iv
        //    91: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //    96: pop            
        //    97: goto            47
        //   100: aload           destination$iv$iv
        //   102: checkcast       Ljava/util/List;
        //   105: nop            
        //   106: checkcast       Ljava/lang/Iterable;
        //   109: astore_1       
        //   110: nop            
        //   111: iconst_0       
        //   112: istore_2        /* $i$f$forEach */
        //   113: aload_1         /* $this$forEach$iv */
        //   114: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   119: astore_3       
        //   120: aload_3        
        //   121: invokeinterface java/util/Iterator.hasNext:()Z
        //   126: ifeq            432
        //   129: aload_3        
        //   130: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   135: astore          element$iv
        //   137: aload           element$iv
        //   139: checkcast       Lgg/essential/vigilance/data/PropertyData;
        //   142: astore          it
        //   144: iconst_0       
        //   145: istore          $i$a$-forEach-Vigilant$readData$2
        //   147: aload           it
        //   149: invokevirtual   gg/essential/vigilance/data/PropertyData.getAttributesExt:()Lgg/essential/vigilance/data/PropertyAttributesExt;
        //   152: invokestatic    gg/essential/vigilance/data/PropertyKt.fullPropertyPath:(Lgg/essential/vigilance/data/PropertyAttributesExt;)Ljava/lang/String;
        //   155: astore          fullPath
        //   157: aload_0         /* this */
        //   158: getfield        gg/essential/vigilance/Vigilant.fileConfig:Lgg/essential/vigilance/impl/nightconfig/core/file/FileConfig;
        //   161: aload           fullPath
        //   163: invokeinterface gg/essential/vigilance/impl/nightconfig/core/file/FileConfig.get:(Ljava/lang/String;)Ljava/lang/Object;
        //   168: astore          oldValue
        //   170: aload           it
        //   172: invokevirtual   gg/essential/vigilance/data/PropertyData.getAttributesExt:()Lgg/essential/vigilance/data/PropertyAttributesExt;
        //   175: invokevirtual   gg/essential/vigilance/data/PropertyAttributesExt.getType:()Lgg/essential/vigilance/data/PropertyType;
        //   178: getstatic       gg/essential/vigilance/data/PropertyType.COLOR:Lgg/essential/vigilance/data/PropertyType;
        //   181: if_acmpne       411
        //   184: aload           oldValue
        //   186: instanceof      Ljava/lang/String;
        //   189: ifeq            405
        //   192: aload           oldValue
        //   194: checkcast       Ljava/lang/CharSequence;
        //   197: iconst_1       
        //   198: anewarray       Ljava/lang/String;
        //   201: astore          9
        //   203: aload           9
        //   205: iconst_0       
        //   206: ldc_w           ","
        //   209: aastore        
        //   210: aload           9
        //   212: iconst_0       
        //   213: iconst_0       
        //   214: bipush          6
        //   216: aconst_null    
        //   217: invokestatic    kotlin/text/StringsKt.split$default:(Ljava/lang/CharSequence;[Ljava/lang/String;ZIILjava/lang/Object;)Ljava/util/List;
        //   220: checkcast       Ljava/lang/Iterable;
        //   223: astore          $this$map$iv
        //   225: iconst_0       
        //   226: istore          $i$f$map
        //   228: aload           $this$map$iv
        //   230: astore          11
        //   232: new             Ljava/util/ArrayList;
        //   235: dup            
        //   236: aload           $this$map$iv
        //   238: bipush          10
        //   240: invokestatic    kotlin/collections/CollectionsKt.collectionSizeOrDefault:(Ljava/lang/Iterable;I)I
        //   243: invokespecial   java/util/ArrayList.<init>:(I)V
        //   246: checkcast       Ljava/util/Collection;
        //   249: astore          destination$iv$iv
        //   251: iconst_0       
        //   252: istore          $i$f$mapTo
        //   254: aload           $this$mapTo$iv$iv
        //   256: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   261: astore          14
        //   263: aload           14
        //   265: invokeinterface java/util/Iterator.hasNext:()Z
        //   270: ifeq            316
        //   273: aload           14
        //   275: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   280: astore          item$iv$iv
        //   282: aload           destination$iv$iv
        //   284: aload           item$iv$iv
        //   286: checkcast       Ljava/lang/String;
        //   289: astore          16
        //   291: astore          17
        //   293: iconst_0       
        //   294: istore          $i$a$-map-Vigilant$readData$2$split$1
        //   296: aload           p0
        //   298: invokestatic    java/lang/Integer.parseInt:(Ljava/lang/String;)I
        //   301: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   304: aload           17
        //   306: swap           
        //   307: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //   312: pop            
        //   313: goto            263
        //   316: aload           destination$iv$iv
        //   318: checkcast       Ljava/util/List;
        //   321: nop            
        //   322: astore          split
        //   324: aload           split
        //   326: invokeinterface java/util/List.size:()I
        //   331: iconst_4       
        //   332: if_icmpne       401
        //   335: new             Ljava/awt/Color;
        //   338: dup            
        //   339: aload           split
        //   341: iconst_1       
        //   342: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   347: checkcast       Ljava/lang/Number;
        //   350: invokevirtual   java/lang/Number.intValue:()I
        //   353: aload           split
        //   355: iconst_2       
        //   356: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   361: checkcast       Ljava/lang/Number;
        //   364: invokevirtual   java/lang/Number.intValue:()I
        //   367: aload           split
        //   369: iconst_3       
        //   370: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   375: checkcast       Ljava/lang/Number;
        //   378: invokevirtual   java/lang/Number.intValue:()I
        //   381: aload           split
        //   383: iconst_0       
        //   384: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   389: checkcast       Ljava/lang/Number;
        //   392: invokevirtual   java/lang/Number.intValue:()I
        //   395: invokespecial   java/awt/Color.<init>:(IIII)V
        //   398: goto            409
        //   401: aconst_null    
        //   402: goto            409
        //   405: aconst_null    
        //   406: checkcast       Ljava/awt/Color;
        //   409: astore          oldValue
        //   411: aload           it
        //   413: aload           oldValue
        //   415: dup            
        //   416: ifnonnull       425
        //   419: pop            
        //   420: aload           it
        //   422: invokevirtual   gg/essential/vigilance/data/PropertyData.getAsAny:()Ljava/lang/Object;
        //   425: invokevirtual   gg/essential/vigilance/data/PropertyData.setValue:(Ljava/lang/Object;)V
        //   428: nop            
        //   429: goto            120
        //   432: nop            
        //   433: return         
        //    StackMapTable: 00 0B FF 00 2F 00 07 07 00 02 07 01 4D 01 07 01 4D 07 02 00 01 07 01 53 00 00 34 FF 00 13 00 05 07 00 02 07 01 4D 01 07 01 53 07 00 04 00 00 FF 00 8E 00 0F 07 00 02 07 01 4D 01 07 01 53 07 00 04 07 01 05 01 07 00 90 07 00 04 07 01 4D 01 07 01 4D 07 02 00 01 07 01 53 00 00 34 FF 00 54 00 14 07 00 02 07 01 4D 01 07 01 53 07 00 04 07 01 05 01 07 00 90 07 00 04 07 01 4D 01 07 01 4D 07 02 00 01 07 01 53 00 00 00 00 07 02 09 00 00 FF 00 03 00 09 07 00 02 07 01 4D 01 07 01 53 07 00 04 07 01 05 01 07 00 90 07 00 04 00 00 43 07 02 AF 01 FF 00 0D 00 09 07 00 02 07 01 4D 01 07 01 53 07 00 04 07 01 05 01 07 00 90 07 00 04 00 02 07 01 05 07 00 04 FF 00 06 00 05 07 00 02 07 01 4D 01 07 01 53 07 00 04 00 00
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public final void writeData() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        gg/essential/vigilance/Vigilant.dirty:Z
        //     4: ifne            8
        //     7: return         
        //     8: aload_0         /* this */
        //     9: getfield        gg/essential/vigilance/Vigilant.propertyCollector:Lgg/essential/vigilance/data/PropertyCollector;
        //    12: invokevirtual   gg/essential/vigilance/data/PropertyCollector.getProperties:()Ljava/util/List;
        //    15: checkcast       Ljava/lang/Iterable;
        //    18: astore_1        /* $this$filter$iv */
        //    19: iconst_0       
        //    20: istore_2        /* $i$f$filter */
        //    21: aload_1         /* $this$filter$iv */
        //    22: astore_3       
        //    23: new             Ljava/util/ArrayList;
        //    26: dup            
        //    27: invokespecial   java/util/ArrayList.<init>:()V
        //    30: checkcast       Ljava/util/Collection;
        //    33: astore          destination$iv$iv
        //    35: iconst_0       
        //    36: istore          $i$f$filterTo
        //    38: aload_3         /* $this$filterTo$iv$iv */
        //    39: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //    44: astore          6
        //    46: aload           6
        //    48: invokeinterface java/util/Iterator.hasNext:()Z
        //    53: ifeq            99
        //    56: aload           6
        //    58: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    63: astore          element$iv$iv
        //    65: aload           element$iv$iv
        //    67: checkcast       Lgg/essential/vigilance/data/PropertyData;
        //    70: astore          it
        //    72: iconst_0       
        //    73: istore          $i$a$-filter-Vigilant$writeData$1
        //    75: aload           it
        //    77: invokevirtual   gg/essential/vigilance/data/PropertyData.getValue:()Lgg/essential/vigilance/data/PropertyValue;
        //    80: invokevirtual   gg/essential/vigilance/data/PropertyValue.getWriteDataToFile:()Z
        //    83: ifeq            46
        //    86: aload           destination$iv$iv
        //    88: aload           element$iv$iv
        //    90: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //    95: pop            
        //    96: goto            46
        //    99: aload           destination$iv$iv
        //   101: checkcast       Ljava/util/List;
        //   104: nop            
        //   105: checkcast       Ljava/lang/Iterable;
        //   108: astore_1       
        //   109: nop            
        //   110: iconst_0       
        //   111: istore_2        /* $i$f$forEach */
        //   112: aload_1         /* $this$forEach$iv */
        //   113: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   118: astore_3       
        //   119: aload_3        
        //   120: invokeinterface java/util/Iterator.hasNext:()Z
        //   125: ifeq            260
        //   128: aload_3        
        //   129: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   134: astore          element$iv
        //   136: aload           element$iv
        //   138: checkcast       Lgg/essential/vigilance/data/PropertyData;
        //   141: astore          it
        //   143: iconst_0       
        //   144: istore          $i$a$-forEach-Vigilant$writeData$2
        //   146: aload           it
        //   148: invokevirtual   gg/essential/vigilance/data/PropertyData.getAttributesExt:()Lgg/essential/vigilance/data/PropertyAttributesExt;
        //   151: invokestatic    gg/essential/vigilance/data/PropertyKt.fullPropertyPath:(Lgg/essential/vigilance/data/PropertyAttributesExt;)Ljava/lang/String;
        //   154: astore          fullPath
        //   156: aload           it
        //   158: invokevirtual   gg/essential/vigilance/data/PropertyData.getAsAny:()Ljava/lang/Object;
        //   161: astore          toSet
        //   163: aload           toSet
        //   165: instanceof      Ljava/awt/Color;
        //   168: ifeq            242
        //   171: new             Ljava/lang/StringBuilder;
        //   174: dup            
        //   175: invokespecial   java/lang/StringBuilder.<init>:()V
        //   178: aload           toSet
        //   180: checkcast       Ljava/awt/Color;
        //   183: invokevirtual   java/awt/Color.getAlpha:()I
        //   186: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   189: bipush          44
        //   191: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //   194: aload           toSet
        //   196: checkcast       Ljava/awt/Color;
        //   199: invokevirtual   java/awt/Color.getRed:()I
        //   202: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   205: bipush          44
        //   207: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //   210: aload           toSet
        //   212: checkcast       Ljava/awt/Color;
        //   215: invokevirtual   java/awt/Color.getGreen:()I
        //   218: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   221: bipush          44
        //   223: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //   226: aload           toSet
        //   228: checkcast       Ljava/awt/Color;
        //   231: invokevirtual   java/awt/Color.getBlue:()I
        //   234: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   237: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   240: astore          toSet
        //   242: aload_0         /* this */
        //   243: getfield        gg/essential/vigilance/Vigilant.fileConfig:Lgg/essential/vigilance/impl/nightconfig/core/file/FileConfig;
        //   246: aload           fullPath
        //   248: aload           toSet
        //   250: invokeinterface gg/essential/vigilance/impl/nightconfig/core/file/FileConfig.set:(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
        //   255: pop            
        //   256: nop            
        //   257: goto            119
        //   260: nop            
        //   261: aload_0         /* this */
        //   262: getfield        gg/essential/vigilance/Vigilant.fileConfig:Lgg/essential/vigilance/impl/nightconfig/core/file/FileConfig;
        //   265: invokeinterface gg/essential/vigilance/impl/nightconfig/core/file/FileConfig.save:()V
        //   270: aload_0         /* this */
        //   271: iconst_0       
        //   272: putfield        gg/essential/vigilance/Vigilant.dirty:Z
        //   275: return         
        //    StackMapTable: 00 06 08 FF 00 25 00 07 07 00 02 07 01 4D 01 07 01 4D 07 02 00 01 07 01 53 00 00 34 FF 00 13 00 05 07 00 02 07 01 4D 01 07 01 53 07 00 04 00 00 FF 00 7A 00 09 07 00 02 07 01 4D 01 07 01 53 07 00 04 07 01 05 01 07 00 90 07 00 04 00 00 FF 00 11 00 05 07 00 02 07 01 4D 01 07 01 53 07 00 04 00 00
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private final List<CategoryItem> splitBySubcategory(final List<PropertyData> $this$splitBySubcategory) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: checkcast       Ljava/lang/Iterable;
        //     4: astore_3        /* $this$groupBy$iv */
        //     5: iconst_0       
        //     6: istore          $i$f$groupBy
        //     8: aload_3         /* $this$groupBy$iv */
        //     9: astore          5
        //    11: new             Ljava/util/LinkedHashMap;
        //    14: dup            
        //    15: invokespecial   java/util/LinkedHashMap.<init>:()V
        //    18: checkcast       Ljava/util/Map;
        //    21: astore          destination$iv$iv
        //    23: iconst_0       
        //    24: istore          $i$f$groupByTo
        //    26: aload           $this$groupByTo$iv$iv
        //    28: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //    33: astore          8
        //    35: aload           8
        //    37: invokeinterface java/util/Iterator.hasNext:()Z
        //    42: ifeq            150
        //    45: aload           8
        //    47: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    52: astore          element$iv$iv
        //    54: aload           element$iv$iv
        //    56: checkcast       Lgg/essential/vigilance/data/PropertyData;
        //    59: astore          it
        //    61: iconst_0       
        //    62: istore          $i$a$-groupBy-Vigilant$splitBySubcategory$items$1
        //    64: aload           it
        //    66: invokevirtual   gg/essential/vigilance/data/PropertyData.getAttributesExt:()Lgg/essential/vigilance/data/PropertyAttributesExt;
        //    69: invokevirtual   gg/essential/vigilance/data/PropertyAttributesExt.getLocalizedSubcategory$Vigilance:()Ljava/lang/String;
        //    72: astore          key$iv$iv
        //    74: aload           destination$iv$iv
        //    76: astore          $this$getOrPut$iv$iv$iv
        //    78: iconst_0       
        //    79: istore          $i$f$getOrPut
        //    81: aload           $this$getOrPut$iv$iv$iv
        //    83: aload           key$iv$iv
        //    85: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //    90: astore          value$iv$iv$iv
        //    92: aload           value$iv$iv$iv
        //    94: ifnonnull       129
        //    97: iconst_0       
        //    98: istore          $i$a$-getOrPut-CollectionsKt___CollectionsKt$groupByTo$list$1$iv$iv
        //   100: new             Ljava/util/ArrayList;
        //   103: dup            
        //   104: invokespecial   java/util/ArrayList.<init>:()V
        //   107: checkcast       Ljava/util/List;
        //   110: astore          answer$iv$iv$iv
        //   112: aload           $this$getOrPut$iv$iv$iv
        //   114: aload           key$iv$iv
        //   116: aload           answer$iv$iv$iv
        //   118: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   123: pop            
        //   124: aload           answer$iv$iv$iv
        //   126: goto            132
        //   129: aload           value$iv$iv$iv
        //   131: nop            
        //   132: checkcast       Ljava/util/List;
        //   135: astore          list$iv$iv
        //   137: aload           list$iv$iv
        //   139: aload           element$iv$iv
        //   141: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   146: pop            
        //   147: goto            35
        //   150: aload           destination$iv$iv
        //   152: nop            
        //   153: invokeinterface java/util/Map.entrySet:()Ljava/util/Set;
        //   158: checkcast       Ljava/lang/Iterable;
        //   161: aload_0         /* this */
        //   162: getfield        gg/essential/vigilance/Vigilant.sortingBehavior:Lgg/essential/vigilance/data/SortingBehavior;
        //   165: invokevirtual   gg/essential/vigilance/data/SortingBehavior.getSubcategoryComparator:()Ljava/util/Comparator;
        //   168: invokestatic    kotlin/collections/CollectionsKt.sortedWith:(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;
        //   171: astore_2        /* items */
        //   172: new             Ljava/util/ArrayList;
        //   175: dup            
        //   176: invokespecial   java/util/ArrayList.<init>:()V
        //   179: checkcast       Ljava/util/List;
        //   182: astore_3        /* withDividers */
        //   183: aload_2         /* items */
        //   184: checkcast       Ljava/lang/Iterable;
        //   187: astore          $this$forEachIndexed$iv
        //   189: iconst_0       
        //   190: istore          $i$f$forEachIndexed
        //   192: iconst_0       
        //   193: istore          index$iv
        //   195: aload           $this$forEachIndexed$iv
        //   197: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   202: astore          7
        //   204: aload           7
        //   206: invokeinterface java/util/Iterator.hasNext:()Z
        //   211: ifeq            576
        //   214: aload           7
        //   216: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   221: astore          item$iv
        //   223: iload           index$iv
        //   225: iinc            index$iv, 1
        //   228: istore          9
        //   230: iload           9
        //   232: ifge            238
        //   235: invokestatic    kotlin/collections/CollectionsKt.throwIndexOverflow:()V
        //   238: iload           9
        //   240: aload           item$iv
        //   242: checkcast       Ljava/util/Map$Entry;
        //   245: astore          11
        //   247: istore          index
        //   249: iconst_0       
        //   250: istore          $i$a$-forEachIndexed-Vigilant$splitBySubcategory$1
        //   252: aload           $dstr$subcategoryName$listOfProperties
        //   254: invokeinterface java/util/Map$Entry.getKey:()Ljava/lang/Object;
        //   259: checkcast       Ljava/lang/String;
        //   262: astore          subcategoryName
        //   264: aload           $dstr$subcategoryName$listOfProperties
        //   266: invokeinterface java/util/Map$Entry.getValue:()Ljava/lang/Object;
        //   271: checkcast       Ljava/util/List;
        //   274: astore          listOfProperties
        //   276: aload_0         /* this */
        //   277: getfield        gg/essential/vigilance/Vigilant.categoryDescription:Ljava/util/Map;
        //   280: aload           listOfProperties
        //   282: iconst_0       
        //   283: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   288: checkcast       Lgg/essential/vigilance/data/PropertyData;
        //   291: invokevirtual   gg/essential/vigilance/data/PropertyData.getAttributesExt:()Lgg/essential/vigilance/data/PropertyAttributesExt;
        //   294: invokevirtual   gg/essential/vigilance/data/PropertyAttributesExt.getCategory:()Ljava/lang/String;
        //   297: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   302: checkcast       Lgg/essential/vigilance/Vigilant$CategoryDescription;
        //   305: dup            
        //   306: ifnonnull       314
        //   309: pop            
        //   310: aconst_null    
        //   311: goto            359
        //   314: invokevirtual   gg/essential/vigilance/Vigilant$CategoryDescription.getSubcategoryDescriptions:()Ljava/util/Map;
        //   317: dup            
        //   318: ifnonnull       326
        //   321: pop            
        //   322: aconst_null    
        //   323: goto            359
        //   326: aload           subcategoryName
        //   328: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   333: checkcast       Ljava/lang/String;
        //   336: dup            
        //   337: ifnonnull       345
        //   340: pop            
        //   341: aconst_null    
        //   342: goto            359
        //   345: astore          it
        //   347: iconst_0       
        //   348: istore          $i$a$-let-Vigilant$splitBySubcategory$1$subcategoryInfo$1
        //   350: getstatic       gg/essential/vigilance/impl/I18n.INSTANCE:Lgg/essential/vigilance/impl/I18n;
        //   353: aload           it
        //   355: invokevirtual   gg/essential/vigilance/impl/I18n.format:(Ljava/lang/String;)Ljava/lang/String;
        //   358: nop            
        //   359: astore          subcategoryInfo
        //   361: iload           index
        //   363: ifgt            413
        //   366: aload           subcategoryName
        //   368: checkcast       Ljava/lang/CharSequence;
        //   371: invokestatic    kotlin/text/StringsKt.isBlank:(Ljava/lang/CharSequence;)Z
        //   374: ifne            381
        //   377: iconst_1       
        //   378: goto            382
        //   381: iconst_0       
        //   382: ifne            413
        //   385: aload           subcategoryInfo
        //   387: checkcast       Ljava/lang/CharSequence;
        //   390: astore          16
        //   392: aload           16
        //   394: ifnull          405
        //   397: aload           16
        //   399: invokestatic    kotlin/text/StringsKt.isBlank:(Ljava/lang/CharSequence;)Z
        //   402: ifeq            409
        //   405: iconst_1       
        //   406: goto            410
        //   409: iconst_0       
        //   410: ifne            431
        //   413: aload_3         /* withDividers */
        //   414: new             Lgg/essential/vigilance/data/DividerItem;
        //   417: dup            
        //   418: aload           subcategoryName
        //   420: aload           subcategoryInfo
        //   422: invokespecial   gg/essential/vigilance/data/DividerItem.<init>:(Ljava/lang/String;Ljava/lang/String;)V
        //   425: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   430: pop            
        //   431: aload_3         /* withDividers */
        //   432: aload           listOfProperties
        //   434: checkcast       Ljava/lang/Iterable;
        //   437: aload_0         /* this */
        //   438: invokevirtual   gg/essential/vigilance/Vigilant.getSortingBehavior:()Lgg/essential/vigilance/data/SortingBehavior;
        //   441: invokevirtual   gg/essential/vigilance/data/SortingBehavior.getPropertyComparator:()Ljava/util/Comparator;
        //   444: invokestatic    kotlin/collections/CollectionsKt.sortedWith:(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;
        //   447: checkcast       Ljava/lang/Iterable;
        //   450: astore          16
        //   452: astore          23
        //   454: iconst_0       
        //   455: istore          $i$f$map
        //   457: aload           $this$map$iv
        //   459: astore          18
        //   461: new             Ljava/util/ArrayList;
        //   464: dup            
        //   465: aload           $this$map$iv
        //   467: bipush          10
        //   469: invokestatic    kotlin/collections/CollectionsKt.collectionSizeOrDefault:(Ljava/lang/Iterable;I)I
        //   472: invokespecial   java/util/ArrayList.<init>:(I)V
        //   475: checkcast       Ljava/util/Collection;
        //   478: astore          destination$iv$iv
        //   480: iconst_0       
        //   481: istore          $i$f$mapTo
        //   483: aload           $this$mapTo$iv$iv
        //   485: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   490: astore          21
        //   492: aload           21
        //   494: invokeinterface java/util/Iterator.hasNext:()Z
        //   499: ifeq            554
        //   502: aload           21
        //   504: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   509: astore          item$iv$iv
        //   511: aload           destination$iv$iv
        //   513: aload           item$iv$iv
        //   515: checkcast       Lgg/essential/vigilance/data/PropertyData;
        //   518: astore          25
        //   520: astore          26
        //   522: iconst_0       
        //   523: istore          $i$a$-map-Vigilant$splitBySubcategory$1$1
        //   525: new             Lgg/essential/vigilance/data/PropertyItem;
        //   528: dup            
        //   529: aload           it
        //   531: aload           it
        //   533: invokevirtual   gg/essential/vigilance/data/PropertyData.getAttributesExt:()Lgg/essential/vigilance/data/PropertyAttributesExt;
        //   536: invokevirtual   gg/essential/vigilance/data/PropertyAttributesExt.getLocalizedSubcategory$Vigilance:()Ljava/lang/String;
        //   539: invokespecial   gg/essential/vigilance/data/PropertyItem.<init>:(Lgg/essential/vigilance/data/PropertyData;Ljava/lang/String;)V
        //   542: aload           26
        //   544: swap           
        //   545: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //   550: pop            
        //   551: goto            492
        //   554: aload           destination$iv$iv
        //   556: checkcast       Ljava/util/List;
        //   559: nop            
        //   560: aload           23
        //   562: swap           
        //   563: checkcast       Ljava/util/Collection;
        //   566: invokeinterface java/util/List.addAll:(Ljava/util/Collection;)Z
        //   571: pop            
        //   572: nop            
        //   573: goto            204
        //   576: nop            
        //   577: aload_3         /* withDividers */
        //   578: areturn        
        //    Signature:
        //  (Ljava/util/List<Lgg/essential/vigilance/data/PropertyData;>;)Ljava/util/List<Lgg/essential/vigilance/data/CategoryItem;>;
        //    MethodParameters:
        //  Name                      Flags  
        //  ------------------------  -----
        //  $this$splitBySubcategory  
        //    StackMapTable: 00 14 FF 00 23 00 09 07 00 02 07 02 09 00 07 01 4D 01 07 01 4D 07 00 85 01 07 01 53 00 00 FF 00 5D 00 10 07 00 02 07 02 09 00 07 01 4D 01 07 01 4D 07 00 85 01 07 01 53 07 00 04 07 01 05 01 07 00 90 07 00 85 01 07 00 04 00 00 42 07 00 04 FF 00 11 00 09 07 00 02 07 02 09 00 07 01 4D 01 07 01 4D 07 00 85 01 07 01 53 00 00 FF 00 35 00 09 07 00 02 07 02 09 07 02 09 07 02 09 07 01 4D 01 01 07 01 53 07 00 04 00 00 FC 00 21 01 FF 00 4B 00 10 07 00 02 07 02 09 07 02 09 07 02 09 07 01 4D 01 01 07 01 53 07 00 04 01 00 07 02 20 01 01 07 00 90 07 02 09 00 01 07 00 5A 4B 07 00 85 52 07 00 90 4D 07 00 90 FF 00 15 00 17 07 00 02 07 02 09 07 02 09 07 02 09 07 01 4D 01 01 07 01 53 07 00 04 01 00 07 02 20 01 01 07 00 90 07 02 09 00 00 00 00 00 00 07 00 90 00 00 40 01 FF 00 16 00 17 07 00 02 07 02 09 07 02 09 07 02 09 07 01 4D 01 01 07 01 53 07 00 04 01 00 07 02 20 01 01 07 00 90 07 02 09 07 02 6F 00 00 00 00 00 07 00 90 00 00 03 40 01 FF 00 02 00 17 07 00 02 07 02 09 07 02 09 07 02 09 07 01 4D 01 01 07 01 53 07 00 04 01 00 07 02 20 01 01 07 00 90 07 02 09 00 00 00 00 00 00 07 00 90 00 00 11 FF 00 3C 00 18 07 00 02 07 02 09 07 02 09 07 02 09 07 01 4D 01 01 07 01 53 07 00 04 01 00 07 02 20 01 01 07 00 90 07 02 09 07 01 4D 01 07 01 4D 07 02 00 01 07 01 53 07 00 90 07 02 09 00 00 3D FF 00 15 00 09 07 00 02 07 02 09 07 02 09 07 02 09 07 01 4D 01 01 07 01 53 07 00 04 00 00
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public final void category(@NotNull final String name, @NotNull final Function1<? super Vigilant.CategoryPropertyBuilder, Unit> builder) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc_w           "name"
        //     4: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     7: aload_2         /* builder */
        //     8: ldc_w           "builder"
        //    11: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    14: new             Lgg/essential/vigilance/Vigilant$CategoryPropertyBuilder;
        //    17: dup            
        //    18: aload_1         /* name */
        //    19: ldc_w           ""
        //    22: aload_0         /* this */
        //    23: invokespecial   gg/essential/vigilance/Vigilant$CategoryPropertyBuilder.<init>:(Ljava/lang/String;Ljava/lang/String;Lgg/essential/vigilance/Vigilant;)V
        //    26: astore_3        /* categoryBuilder */
        //    27: aload_3         /* categoryBuilder */
        //    28: astore          4
        //    30: aload_2         /* builder */
        //    31: aload           4
        //    33: invokeinterface kotlin/jvm/functions/Function1.invoke:(Ljava/lang/Object;)Ljava/lang/Object;
        //    38: pop            
        //    39: aload_3         /* categoryBuilder */
        //    40: invokevirtual   gg/essential/vigilance/Vigilant$CategoryPropertyBuilder.getProperties$Vigilance:()Ljava/util/List;
        //    43: checkcast       Ljava/lang/Iterable;
        //    46: astore          4
        //    48: aload_0         /* this */
        //    49: getfield        gg/essential/vigilance/Vigilant.propertyCollector:Lgg/essential/vigilance/data/PropertyCollector;
        //    52: astore          5
        //    54: iconst_0       
        //    55: istore          $i$f$forEach
        //    57: aload           $this$forEach$iv
        //    59: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //    64: astore          7
        //    66: aload           7
        //    68: invokeinterface java/util/Iterator.hasNext:()Z
        //    73: ifeq            105
        //    76: aload           7
        //    78: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    83: astore          element$iv
        //    85: aload           element$iv
        //    87: checkcast       Lgg/essential/vigilance/data/PropertyData;
        //    90: astore          p0
        //    92: iconst_0       
        //    93: istore          $i$a$-forEach-Vigilant$category$1
        //    95: aload           5
        //    97: aload           p0
        //    99: invokevirtual   gg/essential/vigilance/data/PropertyCollector.addProperty:(Lgg/essential/vigilance/data/PropertyData;)V
        //   102: goto            66
        //   105: nop            
        //   106: return         
        //    Signature:
        //  (Ljava/lang/String;Lkotlin/jvm/functions/Function1<-Lgg/essential/vigilance/Vigilant$CategoryPropertyBuilder;Lkotlin/Unit;>;)V
        //    MethodParameters:
        //  Name     Flags  
        //  -------  -----
        //  name     
        //  builder  
        //    StackMapTable: 00 02 FF 00 42 00 08 07 00 02 07 00 90 07 01 6D 07 00 5C 07 01 4D 07 00 89 01 07 01 53 00 00 26
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @JvmOverloads
    public Vigilant(@NotNull final File file, @NotNull final String guiTitle, @NotNull final PropertyCollector propertyCollector) {
        Intrinsics.checkNotNullParameter((Object)file, "file");
        Intrinsics.checkNotNullParameter((Object)guiTitle, "guiTitle");
        Intrinsics.checkNotNullParameter((Object)propertyCollector, "propertyCollector");
        this(file, guiTitle, propertyCollector, null, 8, null);
    }
    
    @JvmOverloads
    public Vigilant(@NotNull final File file, @NotNull final String guiTitle) {
        Intrinsics.checkNotNullParameter((Object)file, "file");
        Intrinsics.checkNotNullParameter((Object)guiTitle, "guiTitle");
        this(file, guiTitle, null, null, 12, null);
    }
    
    @JvmOverloads
    public Vigilant(@NotNull final File file) {
        Intrinsics.checkNotNullParameter((Object)file, "file");
        this(file, null, null, null, 14, null);
    }
    
    private static final void loadData$lambda-1(final Vigilant this$0) {
        Intrinsics.checkNotNullParameter((Object)this$0, "this$0");
        this$0.writeData();
    }
    
    private static final void registerListener$lambda-2(final Function1 $listener, final Object it) {
        Intrinsics.checkNotNullParameter((Object)$listener, "$listener");
        $listener.invoke(it);
    }
}
