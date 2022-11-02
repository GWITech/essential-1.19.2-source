package gg.essential;

import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;
import org.kodein.di.*;
import kotlin.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\f
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H
                                                   ¢\u0006\u0002\b\u0003""" }, d2 = { "<anonymous>", "", "Lorg/kodein/di/DI$MainBuilder;", "invoke" })
static final class DI$di$1 extends Lambda implements Function1<DI$MainBuilder, Unit> {
    public static final DI$di$1 INSTANCE;
    
    DI$di$1() {
        super(1);
    }
    
    public final void invoke(@NotNull final DI$MainBuilder $this$invoke) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "$this$invoke"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_1         /* $this$invoke */
        //     7: checkcast       Lorg/kodein/di/DI$Builder;
        //    10: astore_2        /* $this$bind_u24default$iv */
        //    11: aconst_null    
        //    12: astore_3        /* tag$iv */
        //    13: aconst_null    
        //    14: astore          overrides$iv
        //    16: aload_2         /* $this$bind_u24default$iv */
        //    17: new             Lorg/kodein/type/GenericJVMTypeTokenDelegate;
        //    20: dup            
        //    21: new             Lgg/essential/DI$di$1$invoke$$inlined$bind$default$1;
        //    24: dup            
        //    25: invokespecial   gg/essential/DI$di$1$invoke$$inlined$bind$default$1.<init>:()V
        //    28: invokevirtual   gg/essential/DI$di$1$invoke$$inlined$bind$default$1.getSuperType:()Ljava/lang/reflect/Type;
        //    31: invokestatic    org/kodein/type/TypeTokensJVMKt.typeToken:(Ljava/lang/reflect/Type;)Lorg/kodein/type/JVMTypeToken;
        //    34: ldc             Lgg/essential/api/EssentialAPI;.class
        //    36: invokespecial   org/kodein/type/GenericJVMTypeTokenDelegate.<init>:(Lorg/kodein/type/JVMTypeToken;Ljava/lang/Class;)V
        //    39: checkcast       Lorg/kodein/type/TypeToken;
        //    42: aload_3         /* tag$iv */
        //    43: aload           overrides$iv
        //    45: invokeinterface org/kodein/di/DI$Builder.Bind:(Lorg/kodein/type/TypeToken;Ljava/lang/Object;Ljava/lang/Boolean;)Lorg/kodein/di/DI$Builder$TypeBinder;
        //    50: aload_1         /* $this$invoke */
        //    51: checkcast       Lorg/kodein/di/DI$BindBuilder;
        //    54: astore_2       
        //    55: getstatic       gg/essential/DI$di$1$1.INSTANCE:Lgg/essential/DI$di$1$1;
        //    58: checkcast       Lkotlin/jvm/functions/Function1;
        //    61: astore_3        /* creator$iv */
        //    62: new             Lorg/kodein/di/bindings/Provider;
        //    65: dup            
        //    66: aload_2         /* $this$provider$iv */
        //    67: invokeinterface org/kodein/di/DI$BindBuilder.getContextType:()Lorg/kodein/type/TypeToken;
        //    72: new             Lorg/kodein/type/GenericJVMTypeTokenDelegate;
        //    75: dup            
        //    76: new             Lgg/essential/DI$di$1$invoke$$inlined$provider$1;
        //    79: dup            
        //    80: invokespecial   gg/essential/DI$di$1$invoke$$inlined$provider$1.<init>:()V
        //    83: invokevirtual   gg/essential/DI$di$1$invoke$$inlined$provider$1.getSuperType:()Ljava/lang/reflect/Type;
        //    86: invokestatic    org/kodein/type/TypeTokensJVMKt.typeToken:(Ljava/lang/reflect/Type;)Lorg/kodein/type/JVMTypeToken;
        //    89: ldc             Lgg/essential/Essential;.class
        //    91: invokespecial   org/kodein/type/GenericJVMTypeTokenDelegate.<init>:(Lorg/kodein/type/JVMTypeToken;Ljava/lang/Class;)V
        //    94: checkcast       Lorg/kodein/type/TypeToken;
        //    97: aload_3         /* creator$iv */
        //    98: invokespecial   org/kodein/di/bindings/Provider.<init>:(Lorg/kodein/type/TypeToken;Lorg/kodein/type/TypeToken;Lkotlin/jvm/functions/Function1;)V
        //   101: checkcast       Lorg/kodein/di/bindings/DIBinding;
        //   104: invokeinterface org/kodein/di/DI$Builder$TypeBinder.with:(Lorg/kodein/di/bindings/DIBinding;)V
        //   109: aload_1         /* $this$invoke */
        //   110: checkcast       Lorg/kodein/di/DI$BindBuilder$WithScope;
        //   113: astore_2       
        //   114: getstatic       gg/essential/DI$di$1$2.INSTANCE:Lgg/essential/DI$di$1$2;
        //   117: checkcast       Lkotlin/jvm/functions/Function1;
        //   120: astore          creator$iv
        //   122: aconst_null    
        //   123: astore_3        /* ref$iv */
        //   124: new             Lorg/kodein/di/bindings/Singleton;
        //   127: aload_2         /* $this$singleton_u24default$iv */
        //   128: invokeinterface org/kodein/di/DI$BindBuilder$WithScope.getScope:()Lorg/kodein/di/bindings/Scope;
        //   133: aload_2         /* $this$singleton_u24default$iv */
        //   134: invokeinterface org/kodein/di/DI$BindBuilder$WithScope.getContextType:()Lorg/kodein/type/TypeToken;
        //   139: aload_2         /* $this$singleton_u24default$iv */
        //   140: invokeinterface org/kodein/di/DI$BindBuilder$WithScope.getExplicitContext:()Z
        //   145: new             Lorg/kodein/type/GenericJVMTypeTokenDelegate;
        //   148: dup            
        //   149: new             Lgg/essential/DI$di$1$invoke$$inlined$singleton$default$1;
        //   152: dup            
        //   153: invokespecial   gg/essential/DI$di$1$invoke$$inlined$singleton$default$1.<init>:()V
        //   156: invokevirtual   gg/essential/DI$di$1$invoke$$inlined$singleton$default$1.getSuperType:()Ljava/lang/reflect/Type;
        //   159: invokestatic    org/kodein/type/TypeTokensJVMKt.typeToken:(Ljava/lang/reflect/Type;)Lorg/kodein/type/JVMTypeToken;
        //   162: ldc             Lgg/essential/api/commands/CommandRegistry;.class
        //   164: invokespecial   org/kodein/type/GenericJVMTypeTokenDelegate.<init>:(Lorg/kodein/type/JVMTypeToken;Ljava/lang/Class;)V
        //   167: checkcast       Lorg/kodein/type/TypeToken;
        //   170: aload_3         /* ref$iv */
        //   171: iconst_1       
        //   172: aload           creator$iv
        //   174: invokespecial   org/kodein/di/bindings/Singleton.<init>:(Lorg/kodein/di/bindings/Scope;Lorg/kodein/type/TypeToken;ZLorg/kodein/type/TypeToken;Lorg/kodein/di/bindings/RefMaker;ZLkotlin/jvm/functions/Function1;)V
        //   177: aload_1         /* $this$invoke */
        //   178: checkcast       Lorg/kodein/di/DI$BindBuilder$WithScope;
        //   181: astore_2       
        //   182: getstatic       gg/essential/DI$di$1$3.INSTANCE:Lgg/essential/DI$di$1$3;
        //   185: checkcast       Lkotlin/jvm/functions/Function1;
        //   188: astore          creator$iv
        //   190: aconst_null    
        //   191: astore_3        /* ref$iv */
        //   192: new             Lorg/kodein/di/bindings/Singleton;
        //   195: aload_2         /* $this$singleton_u24default$iv */
        //   196: invokeinterface org/kodein/di/DI$BindBuilder$WithScope.getScope:()Lorg/kodein/di/bindings/Scope;
        //   201: aload_2         /* $this$singleton_u24default$iv */
        //   202: invokeinterface org/kodein/di/DI$BindBuilder$WithScope.getContextType:()Lorg/kodein/type/TypeToken;
        //   207: aload_2         /* $this$singleton_u24default$iv */
        //   208: invokeinterface org/kodein/di/DI$BindBuilder$WithScope.getExplicitContext:()Z
        //   213: new             Lorg/kodein/type/GenericJVMTypeTokenDelegate;
        //   216: dup            
        //   217: new             Lgg/essential/DI$di$1$invoke$$inlined$singleton$default$2;
        //   220: dup            
        //   221: invokespecial   gg/essential/DI$di$1$invoke$$inlined$singleton$default$2.<init>:()V
        //   224: invokevirtual   gg/essential/DI$di$1$invoke$$inlined$singleton$default$2.getSuperType:()Ljava/lang/reflect/Type;
        //   227: invokestatic    org/kodein/type/TypeTokensJVMKt.typeToken:(Ljava/lang/reflect/Type;)Lorg/kodein/type/JVMTypeToken;
        //   230: ldc             Lgg/essential/api/DI;.class
        //   232: invokespecial   org/kodein/type/GenericJVMTypeTokenDelegate.<init>:(Lorg/kodein/type/JVMTypeToken;Ljava/lang/Class;)V
        //   235: checkcast       Lorg/kodein/type/TypeToken;
        //   238: aload_3         /* ref$iv */
        //   239: iconst_1       
        //   240: aload           creator$iv
        //   242: invokespecial   org/kodein/di/bindings/Singleton.<init>:(Lorg/kodein/di/bindings/Scope;Lorg/kodein/type/TypeToken;ZLorg/kodein/type/TypeToken;Lorg/kodein/di/bindings/RefMaker;ZLkotlin/jvm/functions/Function1;)V
        //   245: aload_1         /* $this$invoke */
        //   246: checkcast       Lorg/kodein/di/DI$BindBuilder$WithScope;
        //   249: astore_2       
        //   250: getstatic       gg/essential/DI$di$1$4.INSTANCE:Lgg/essential/DI$di$1$4;
        //   253: checkcast       Lkotlin/jvm/functions/Function1;
        //   256: astore          creator$iv
        //   258: aconst_null    
        //   259: astore_3        /* ref$iv */
        //   260: new             Lorg/kodein/di/bindings/Singleton;
        //   263: aload_2         /* $this$singleton_u24default$iv */
        //   264: invokeinterface org/kodein/di/DI$BindBuilder$WithScope.getScope:()Lorg/kodein/di/bindings/Scope;
        //   269: aload_2         /* $this$singleton_u24default$iv */
        //   270: invokeinterface org/kodein/di/DI$BindBuilder$WithScope.getContextType:()Lorg/kodein/type/TypeToken;
        //   275: aload_2         /* $this$singleton_u24default$iv */
        //   276: invokeinterface org/kodein/di/DI$BindBuilder$WithScope.getExplicitContext:()Z
        //   281: new             Lorg/kodein/type/GenericJVMTypeTokenDelegate;
        //   284: dup            
        //   285: new             Lgg/essential/DI$di$1$invoke$$inlined$singleton$default$3;
        //   288: dup            
        //   289: invokespecial   gg/essential/DI$di$1$invoke$$inlined$singleton$default$3.<init>:()V
        //   292: invokevirtual   gg/essential/DI$di$1$invoke$$inlined$singleton$default$3.getSuperType:()Ljava/lang/reflect/Type;
        //   295: invokestatic    org/kodein/type/TypeTokensJVMKt.typeToken:(Ljava/lang/reflect/Type;)Lorg/kodein/type/JVMTypeToken;
        //   298: ldc             Lgg/essential/api/gui/Notifications;.class
        //   300: invokespecial   org/kodein/type/GenericJVMTypeTokenDelegate.<init>:(Lorg/kodein/type/JVMTypeToken;Ljava/lang/Class;)V
        //   303: checkcast       Lorg/kodein/type/TypeToken;
        //   306: aload_3         /* ref$iv */
        //   307: iconst_1       
        //   308: aload           creator$iv
        //   310: invokespecial   org/kodein/di/bindings/Singleton.<init>:(Lorg/kodein/di/bindings/Scope;Lorg/kodein/type/TypeToken;ZLorg/kodein/type/TypeToken;Lorg/kodein/di/bindings/RefMaker;ZLkotlin/jvm/functions/Function1;)V
        //   313: aload_1         /* $this$invoke */
        //   314: checkcast       Lorg/kodein/di/DI$BindBuilder$WithScope;
        //   317: astore_2       
        //   318: getstatic       gg/essential/DI$di$1$5.INSTANCE:Lgg/essential/DI$di$1$5;
        //   321: checkcast       Lkotlin/jvm/functions/Function1;
        //   324: astore          creator$iv
        //   326: aconst_null    
        //   327: astore_3        /* ref$iv */
        //   328: new             Lorg/kodein/di/bindings/Singleton;
        //   331: aload_2         /* $this$singleton_u24default$iv */
        //   332: invokeinterface org/kodein/di/DI$BindBuilder$WithScope.getScope:()Lorg/kodein/di/bindings/Scope;
        //   337: aload_2         /* $this$singleton_u24default$iv */
        //   338: invokeinterface org/kodein/di/DI$BindBuilder$WithScope.getContextType:()Lorg/kodein/type/TypeToken;
        //   343: aload_2         /* $this$singleton_u24default$iv */
        //   344: invokeinterface org/kodein/di/DI$BindBuilder$WithScope.getExplicitContext:()Z
        //   349: new             Lorg/kodein/type/GenericJVMTypeTokenDelegate;
        //   352: dup            
        //   353: new             Lgg/essential/DI$di$1$invoke$$inlined$singleton$default$4;
        //   356: dup            
        //   357: invokespecial   gg/essential/DI$di$1$invoke$$inlined$singleton$default$4.<init>:()V
        //   360: invokevirtual   gg/essential/DI$di$1$invoke$$inlined$singleton$default$4.getSuperType:()Ljava/lang/reflect/Type;
        //   363: invokestatic    org/kodein/type/TypeTokensJVMKt.typeToken:(Ljava/lang/reflect/Type;)Lorg/kodein/type/JVMTypeToken;
        //   366: ldc             Lgg/essential/api/config/EssentialConfig;.class
        //   368: invokespecial   org/kodein/type/GenericJVMTypeTokenDelegate.<init>:(Lorg/kodein/type/JVMTypeToken;Ljava/lang/Class;)V
        //   371: checkcast       Lorg/kodein/type/TypeToken;
        //   374: aload_3         /* ref$iv */
        //   375: iconst_1       
        //   376: aload           creator$iv
        //   378: invokespecial   org/kodein/di/bindings/Singleton.<init>:(Lorg/kodein/di/bindings/Scope;Lorg/kodein/type/TypeToken;ZLorg/kodein/type/TypeToken;Lorg/kodein/di/bindings/RefMaker;ZLkotlin/jvm/functions/Function1;)V
        //   381: aload_1         /* $this$invoke */
        //   382: checkcast       Lorg/kodein/di/DI$BindBuilder$WithScope;
        //   385: astore_2       
        //   386: getstatic       gg/essential/DI$di$1$6.INSTANCE:Lgg/essential/DI$di$1$6;
        //   389: checkcast       Lkotlin/jvm/functions/Function1;
        //   392: astore          creator$iv
        //   394: aconst_null    
        //   395: astore_3        /* ref$iv */
        //   396: new             Lorg/kodein/di/bindings/Singleton;
        //   399: aload_2         /* $this$singleton_u24default$iv */
        //   400: invokeinterface org/kodein/di/DI$BindBuilder$WithScope.getScope:()Lorg/kodein/di/bindings/Scope;
        //   405: aload_2         /* $this$singleton_u24default$iv */
        //   406: invokeinterface org/kodein/di/DI$BindBuilder$WithScope.getContextType:()Lorg/kodein/type/TypeToken;
        //   411: aload_2         /* $this$singleton_u24default$iv */
        //   412: invokeinterface org/kodein/di/DI$BindBuilder$WithScope.getExplicitContext:()Z
        //   417: new             Lorg/kodein/type/GenericJVMTypeTokenDelegate;
        //   420: dup            
        //   421: new             Lgg/essential/DI$di$1$invoke$$inlined$singleton$default$5;
        //   424: dup            
        //   425: invokespecial   gg/essential/DI$di$1$invoke$$inlined$singleton$default$5.<init>:()V
        //   428: invokevirtual   gg/essential/DI$di$1$invoke$$inlined$singleton$default$5.getSuperType:()Ljava/lang/reflect/Type;
        //   431: invokestatic    org/kodein/type/TypeTokensJVMKt.typeToken:(Ljava/lang/reflect/Type;)Lorg/kodein/type/JVMTypeToken;
        //   434: ldc             Lgg/essential/api/utils/GuiUtil;.class
        //   436: invokespecial   org/kodein/type/GenericJVMTypeTokenDelegate.<init>:(Lorg/kodein/type/JVMTypeToken;Ljava/lang/Class;)V
        //   439: checkcast       Lorg/kodein/type/TypeToken;
        //   442: aload_3         /* ref$iv */
        //   443: iconst_1       
        //   444: aload           creator$iv
        //   446: invokespecial   org/kodein/di/bindings/Singleton.<init>:(Lorg/kodein/di/bindings/Scope;Lorg/kodein/type/TypeToken;ZLorg/kodein/type/TypeToken;Lorg/kodein/di/bindings/RefMaker;ZLkotlin/jvm/functions/Function1;)V
        //   449: aload_1         /* $this$invoke */
        //   450: checkcast       Lorg/kodein/di/DI$BindBuilder$WithScope;
        //   453: astore_2       
        //   454: getstatic       gg/essential/DI$di$1$7.INSTANCE:Lgg/essential/DI$di$1$7;
        //   457: checkcast       Lkotlin/jvm/functions/Function1;
        //   460: astore          creator$iv
        //   462: aconst_null    
        //   463: astore_3        /* ref$iv */
        //   464: new             Lorg/kodein/di/bindings/Singleton;
        //   467: aload_2         /* $this$singleton_u24default$iv */
        //   468: invokeinterface org/kodein/di/DI$BindBuilder$WithScope.getScope:()Lorg/kodein/di/bindings/Scope;
        //   473: aload_2         /* $this$singleton_u24default$iv */
        //   474: invokeinterface org/kodein/di/DI$BindBuilder$WithScope.getContextType:()Lorg/kodein/type/TypeToken;
        //   479: aload_2         /* $this$singleton_u24default$iv */
        //   480: invokeinterface org/kodein/di/DI$BindBuilder$WithScope.getExplicitContext:()Z
        //   485: new             Lorg/kodein/type/GenericJVMTypeTokenDelegate;
        //   488: dup            
        //   489: new             Lgg/essential/DI$di$1$invoke$$inlined$singleton$default$6;
        //   492: dup            
        //   493: invokespecial   gg/essential/DI$di$1$invoke$$inlined$singleton$default$6.<init>:()V
        //   496: invokevirtual   gg/essential/DI$di$1$invoke$$inlined$singleton$default$6.getSuperType:()Ljava/lang/reflect/Type;
        //   499: invokestatic    org/kodein/type/TypeTokensJVMKt.typeToken:(Ljava/lang/reflect/Type;)Lorg/kodein/type/JVMTypeToken;
        //   502: ldc             Lgg/essential/api/utils/MinecraftUtils;.class
        //   504: invokespecial   org/kodein/type/GenericJVMTypeTokenDelegate.<init>:(Lorg/kodein/type/JVMTypeToken;Ljava/lang/Class;)V
        //   507: checkcast       Lorg/kodein/type/TypeToken;
        //   510: aload_3         /* ref$iv */
        //   511: iconst_1       
        //   512: aload           creator$iv
        //   514: invokespecial   org/kodein/di/bindings/Singleton.<init>:(Lorg/kodein/di/bindings/Scope;Lorg/kodein/type/TypeToken;ZLorg/kodein/type/TypeToken;Lorg/kodein/di/bindings/RefMaker;ZLkotlin/jvm/functions/Function1;)V
        //   517: aload_1         /* $this$invoke */
        //   518: checkcast       Lorg/kodein/di/DI$BindBuilder$WithScope;
        //   521: astore_2       
        //   522: getstatic       gg/essential/DI$di$1$8.INSTANCE:Lgg/essential/DI$di$1$8;
        //   525: checkcast       Lkotlin/jvm/functions/Function1;
        //   528: astore          creator$iv
        //   530: aconst_null    
        //   531: astore_3        /* ref$iv */
        //   532: new             Lorg/kodein/di/bindings/Singleton;
        //   535: aload_2         /* $this$singleton_u24default$iv */
        //   536: invokeinterface org/kodein/di/DI$BindBuilder$WithScope.getScope:()Lorg/kodein/di/bindings/Scope;
        //   541: aload_2         /* $this$singleton_u24default$iv */
        //   542: invokeinterface org/kodein/di/DI$BindBuilder$WithScope.getContextType:()Lorg/kodein/type/TypeToken;
        //   547: aload_2         /* $this$singleton_u24default$iv */
        //   548: invokeinterface org/kodein/di/DI$BindBuilder$WithScope.getExplicitContext:()Z
        //   553: new             Lorg/kodein/type/GenericJVMTypeTokenDelegate;
        //   556: dup            
        //   557: new             Lgg/essential/DI$di$1$invoke$$inlined$singleton$default$7;
        //   560: dup            
        //   561: invokespecial   gg/essential/DI$di$1$invoke$$inlined$singleton$default$7.<init>:()V
        //   564: invokevirtual   gg/essential/DI$di$1$invoke$$inlined$singleton$default$7.getSuperType:()Ljava/lang/reflect/Type;
        //   567: invokestatic    org/kodein/type/TypeTokensJVMKt.typeToken:(Ljava/lang/reflect/Type;)Lorg/kodein/type/JVMTypeToken;
        //   570: ldc             Lgg/essential/elementa/components/image/ImageCache;.class
        //   572: invokespecial   org/kodein/type/GenericJVMTypeTokenDelegate.<init>:(Lorg/kodein/type/JVMTypeToken;Ljava/lang/Class;)V
        //   575: checkcast       Lorg/kodein/type/TypeToken;
        //   578: aload_3         /* ref$iv */
        //   579: iconst_1       
        //   580: aload           creator$iv
        //   582: invokespecial   org/kodein/di/bindings/Singleton.<init>:(Lorg/kodein/di/bindings/Scope;Lorg/kodein/type/TypeToken;ZLorg/kodein/type/TypeToken;Lorg/kodein/di/bindings/RefMaker;ZLkotlin/jvm/functions/Function1;)V
        //   585: aload_1         /* $this$invoke */
        //   586: checkcast       Lorg/kodein/di/DI$BindBuilder$WithScope;
        //   589: astore_2       
        //   590: getstatic       gg/essential/DI$di$1$9.INSTANCE:Lgg/essential/DI$di$1$9;
        //   593: checkcast       Lkotlin/jvm/functions/Function1;
        //   596: astore          creator$iv
        //   598: aconst_null    
        //   599: astore_3        /* ref$iv */
        //   600: new             Lorg/kodein/di/bindings/Singleton;
        //   603: aload_2         /* $this$singleton_u24default$iv */
        //   604: invokeinterface org/kodein/di/DI$BindBuilder$WithScope.getScope:()Lorg/kodein/di/bindings/Scope;
        //   609: aload_2         /* $this$singleton_u24default$iv */
        //   610: invokeinterface org/kodein/di/DI$BindBuilder$WithScope.getContextType:()Lorg/kodein/type/TypeToken;
        //   615: aload_2         /* $this$singleton_u24default$iv */
        //   616: invokeinterface org/kodein/di/DI$BindBuilder$WithScope.getExplicitContext:()Z
        //   621: new             Lorg/kodein/type/GenericJVMTypeTokenDelegate;
        //   624: dup            
        //   625: new             Lgg/essential/DI$di$1$invoke$$inlined$singleton$default$8;
        //   628: dup            
        //   629: invokespecial   gg/essential/DI$di$1$invoke$$inlined$singleton$default$8.<init>:()V
        //   632: invokevirtual   gg/essential/DI$di$1$invoke$$inlined$singleton$default$8.getSuperType:()Ljava/lang/reflect/Type;
        //   635: invokestatic    org/kodein/type/TypeTokensJVMKt.typeToken:(Ljava/lang/reflect/Type;)Lorg/kodein/type/JVMTypeToken;
        //   638: ldc             Lgg/essential/api/utils/TrustedHostsUtil;.class
        //   640: invokespecial   org/kodein/type/GenericJVMTypeTokenDelegate.<init>:(Lorg/kodein/type/JVMTypeToken;Ljava/lang/Class;)V
        //   643: checkcast       Lorg/kodein/type/TypeToken;
        //   646: aload_3         /* ref$iv */
        //   647: iconst_1       
        //   648: aload           creator$iv
        //   650: invokespecial   org/kodein/di/bindings/Singleton.<init>:(Lorg/kodein/di/bindings/Scope;Lorg/kodein/type/TypeToken;ZLorg/kodein/type/TypeToken;Lorg/kodein/di/bindings/RefMaker;ZLkotlin/jvm/functions/Function1;)V
        //   653: aload_1         /* $this$invoke */
        //   654: checkcast       Lorg/kodein/di/DI$BindBuilder$WithScope;
        //   657: astore_2       
        //   658: getstatic       gg/essential/DI$di$1$10.INSTANCE:Lgg/essential/DI$di$1$10;
        //   661: checkcast       Lkotlin/jvm/functions/Function1;
        //   664: astore          creator$iv
        //   666: aconst_null    
        //   667: astore_3        /* ref$iv */
        //   668: new             Lorg/kodein/di/bindings/Singleton;
        //   671: aload_2         /* $this$singleton_u24default$iv */
        //   672: invokeinterface org/kodein/di/DI$BindBuilder$WithScope.getScope:()Lorg/kodein/di/bindings/Scope;
        //   677: aload_2         /* $this$singleton_u24default$iv */
        //   678: invokeinterface org/kodein/di/DI$BindBuilder$WithScope.getContextType:()Lorg/kodein/type/TypeToken;
        //   683: aload_2         /* $this$singleton_u24default$iv */
        //   684: invokeinterface org/kodein/di/DI$BindBuilder$WithScope.getExplicitContext:()Z
        //   689: new             Lorg/kodein/type/GenericJVMTypeTokenDelegate;
        //   692: dup            
        //   693: new             Lgg/essential/DI$di$1$invoke$$inlined$singleton$default$9;
        //   696: dup            
        //   697: invokespecial   gg/essential/DI$di$1$invoke$$inlined$singleton$default$9.<init>:()V
        //   700: invokevirtual   gg/essential/DI$di$1$invoke$$inlined$singleton$default$9.getSuperType:()Ljava/lang/reflect/Type;
        //   703: invokestatic    org/kodein/type/TypeTokensJVMKt.typeToken:(Ljava/lang/reflect/Type;)Lorg/kodein/type/JVMTypeToken;
        //   706: ldc             Lgg/essential/api/data/OnboardingData;.class
        //   708: invokespecial   org/kodein/type/GenericJVMTypeTokenDelegate.<init>:(Lorg/kodein/type/JVMTypeToken;Ljava/lang/Class;)V
        //   711: checkcast       Lorg/kodein/type/TypeToken;
        //   714: aload_3         /* ref$iv */
        //   715: iconst_1       
        //   716: aload           creator$iv
        //   718: invokespecial   org/kodein/di/bindings/Singleton.<init>:(Lorg/kodein/di/bindings/Scope;Lorg/kodein/type/TypeToken;ZLorg/kodein/type/TypeToken;Lorg/kodein/di/bindings/RefMaker;ZLkotlin/jvm/functions/Function1;)V
        //   721: aload_1         /* $this$invoke */
        //   722: checkcast       Lorg/kodein/di/DI$Builder;
        //   725: invokestatic    gg/essential/DI.access$getModules$p:()Ljava/util/List;
        //   728: checkcast       Ljava/lang/Iterable;
        //   731: iconst_0       
        //   732: iconst_2       
        //   733: aconst_null    
        //   734: invokestatic    org/kodein/di/DI$Builder$DefaultImpls.importAll$default:(Lorg/kodein/di/DI$Builder;Ljava/lang/Iterable;ZILjava/lang/Object;)V
        //   737: return         
        //    MethodParameters:
        //  Name          Flags  
        //  ------------  -----
        //  $this$invoke  
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        this.invoke((DI$MainBuilder)p1);
        return Unit.INSTANCE;
    }
    
    static {
        DI$di$1.INSTANCE = new DI$di$1();
    }
}