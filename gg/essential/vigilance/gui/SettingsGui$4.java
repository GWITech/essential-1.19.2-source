package gg.essential.vigilance.gui;

import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;
import gg.essential.elementa.*;
import kotlin.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { "\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007" }, d2 = { "<anonymous>", "", "Lgg/essential/elementa/UIComponent;", "<anonymous parameter 0>", "", "keyCode", "", "invoke" })
static final class SettingsGui$4 extends Lambda implements Function3<UIComponent, Character, Integer, Unit> {
    final /* synthetic */ SettingsGui this$0;
    
    SettingsGui$4(final SettingsGui $receiver) {
        this.this$0 = $receiver;
        super(3);
    }
    
    public final void invoke(@NotNull final UIComponent $this$onKeyType, final char $noName_0, final int keyCode) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "$this$onKeyType"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: getstatic       gg/essential/universal/UKeyboard.KEY_MINUS:I
        //     9: invokestatic    gg/essential/universal/UKeyboard.isKeyDown:(I)Z
        //    12: ifeq            57
        //    15: new             Lgg/essential/elementa/components/inspector/Inspector;
        //    18: dup            
        //    19: aload_0         /* this */
        //    20: getfield        gg/essential/vigilance/gui/SettingsGui$4.this$0:Lgg/essential/vigilance/gui/SettingsGui;
        //    23: invokevirtual   gg/essential/vigilance/gui/SettingsGui.getWindow:()Lgg/essential/elementa/components/Window;
        //    26: checkcast       Lgg/essential/elementa/UIComponent;
        //    29: aconst_null    
        //    30: aconst_null    
        //    31: fconst_0       
        //    32: aconst_null    
        //    33: bipush          30
        //    35: aconst_null    
        //    36: invokespecial   gg/essential/elementa/components/inspector/Inspector.<init>:(Lgg/essential/elementa/UIComponent;Ljava/awt/Color;Ljava/awt/Color;FLgg/essential/elementa/constraints/HeightConstraint;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //    39: checkcast       Lgg/essential/elementa/UIComponent;
        //    42: aload_0         /* this */
        //    43: getfield        gg/essential/vigilance/gui/SettingsGui$4.this$0:Lgg/essential/vigilance/gui/SettingsGui;
        //    46: invokevirtual   gg/essential/vigilance/gui/SettingsGui.getWindow:()Lgg/essential/elementa/components/Window;
        //    49: checkcast       Lgg/essential/elementa/UIComponent;
        //    52: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //    55: pop            
        //    56: return         
        //    57: aload_0         /* this */
        //    58: getfield        gg/essential/vigilance/gui/SettingsGui$4.this$0:Lgg/essential/vigilance/gui/SettingsGui;
        //    61: invokestatic    gg/essential/vigilance/gui/SettingsGui.access$getCurrentCategory$p:(Lgg/essential/vigilance/gui/SettingsGui;)Lgg/essential/vigilance/gui/SettingsCategory;
        //    64: invokevirtual   gg/essential/vigilance/gui/SettingsCategory.getScroller$Vigilance:()Lgg/essential/elementa/components/ScrollComponent;
        //    67: checkcast       Lgg/essential/elementa/UIComponent;
        //    70: astore          this_$iv
        //    72: iconst_0       
        //    73: istore          $i$f$childrenOfType
        //    75: aload           this_$iv
        //    77: ldc             Lgg/essential/vigilance/gui/DataBackedSetting;.class
        //    79: invokevirtual   gg/essential/elementa/UIComponent.childrenOfType:(Ljava/lang/Class;)Ljava/util/List;
        //    82: checkcast       Ljava/lang/Iterable;
        //    85: astore          4
        //    87: nop            
        //    88: iconst_0       
        //    89: istore          $i$f$filter
        //    91: aload           $this$filter$iv
        //    93: astore          6
        //    95: new             Ljava/util/ArrayList;
        //    98: dup            
        //    99: invokespecial   java/util/ArrayList.<init>:()V
        //   102: checkcast       Ljava/util/Collection;
        //   105: astore          destination$iv$iv
        //   107: iconst_0       
        //   108: istore          $i$f$filterTo
        //   110: aload           $this$filterTo$iv$iv
        //   112: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   117: astore          9
        //   119: aload           9
        //   121: invokeinterface java/util/Iterator.hasNext:()Z
        //   126: ifeq            169
        //   129: aload           9
        //   131: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   136: astore          element$iv$iv
        //   138: aload           element$iv$iv
        //   140: checkcast       Lgg/essential/vigilance/gui/DataBackedSetting;
        //   143: astore          it
        //   145: iconst_0       
        //   146: istore          $i$a$-filter-SettingsGui$4$1
        //   148: aload           it
        //   150: invokevirtual   gg/essential/vigilance/gui/DataBackedSetting.isHovered:()Z
        //   153: ifeq            119
        //   156: aload           destination$iv$iv
        //   158: aload           element$iv$iv
        //   160: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //   165: pop            
        //   166: goto            119
        //   169: aload           destination$iv$iv
        //   171: checkcast       Ljava/util/List;
        //   174: nop            
        //   175: checkcast       Ljava/lang/Iterable;
        //   178: astore          4
        //   180: nop            
        //   181: iconst_0       
        //   182: istore          $i$f$forEach
        //   184: aload           $this$forEach$iv
        //   186: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   191: astore          6
        //   193: aload           6
        //   195: invokeinterface java/util/Iterator.hasNext:()Z
        //   200: ifeq            621
        //   203: aload           6
        //   205: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   210: astore          element$iv
        //   212: aload           element$iv
        //   214: checkcast       Lgg/essential/vigilance/gui/DataBackedSetting;
        //   217: astore          child
        //   219: iconst_0       
        //   220: istore          $i$a$-forEach-SettingsGui$4$2
        //   222: aload           child
        //   224: invokevirtual   gg/essential/vigilance/gui/DataBackedSetting.getComponent$Vigilance:()Lgg/essential/vigilance/gui/settings/SettingComponent;
        //   227: astore          10
        //   229: aload           10
        //   231: instanceof      Lgg/essential/vigilance/gui/settings/AbstractSliderComponent;
        //   234: ifeq            283
        //   237: iload_3         /* keyCode */
        //   238: getstatic       gg/essential/universal/UKeyboard.KEY_LEFT:I
        //   241: if_icmpne       260
        //   244: aload           child
        //   246: invokevirtual   gg/essential/vigilance/gui/DataBackedSetting.getComponent$Vigilance:()Lgg/essential/vigilance/gui/settings/SettingComponent;
        //   249: checkcast       Lgg/essential/vigilance/gui/settings/AbstractSliderComponent;
        //   252: ldc             -0.05
        //   254: invokevirtual   gg/essential/vigilance/gui/settings/AbstractSliderComponent.incrementBy:(F)V
        //   257: goto            617
        //   260: iload_3         /* keyCode */
        //   261: getstatic       gg/essential/universal/UKeyboard.KEY_RIGHT:I
        //   264: if_icmpne       617
        //   267: aload           child
        //   269: invokevirtual   gg/essential/vigilance/gui/DataBackedSetting.getComponent$Vigilance:()Lgg/essential/vigilance/gui/settings/SettingComponent;
        //   272: checkcast       Lgg/essential/vigilance/gui/settings/AbstractSliderComponent;
        //   275: ldc             0.05
        //   277: invokevirtual   gg/essential/vigilance/gui/settings/AbstractSliderComponent.incrementBy:(F)V
        //   280: goto            617
        //   283: aload           10
        //   285: instanceof      Lgg/essential/vigilance/gui/settings/NumberComponent;
        //   288: ifeq            333
        //   291: iload_3         /* keyCode */
        //   292: getstatic       gg/essential/universal/UKeyboard.KEY_UP:I
        //   295: if_icmpne       312
        //   298: aload           child
        //   300: invokevirtual   gg/essential/vigilance/gui/DataBackedSetting.getComponent$Vigilance:()Lgg/essential/vigilance/gui/settings/SettingComponent;
        //   303: checkcast       Lgg/essential/vigilance/gui/settings/NumberComponent;
        //   306: invokevirtual   gg/essential/vigilance/gui/settings/NumberComponent.increment:()V
        //   309: goto            617
        //   312: iload_3         /* keyCode */
        //   313: getstatic       gg/essential/universal/UKeyboard.KEY_DOWN:I
        //   316: if_icmpne       617
        //   319: aload           child
        //   321: invokevirtual   gg/essential/vigilance/gui/DataBackedSetting.getComponent$Vigilance:()Lgg/essential/vigilance/gui/settings/SettingComponent;
        //   324: checkcast       Lgg/essential/vigilance/gui/settings/NumberComponent;
        //   327: invokevirtual   gg/essential/vigilance/gui/settings/NumberComponent.decrement:()V
        //   330: goto            617
        //   333: aload           10
        //   335: instanceof      Lgg/essential/vigilance/gui/settings/SwitchComponent;
        //   338: ifeq            456
        //   341: iload_3         /* keyCode */
        //   342: istore          11
        //   344: iload           11
        //   346: getstatic       gg/essential/universal/UKeyboard.KEY_LEFT:I
        //   349: if_icmpne       389
        //   352: aload           child
        //   354: invokevirtual   gg/essential/vigilance/gui/DataBackedSetting.getComponent$Vigilance:()Lgg/essential/vigilance/gui/settings/SettingComponent;
        //   357: checkcast       Lgg/essential/vigilance/gui/settings/SwitchComponent;
        //   360: invokevirtual   gg/essential/vigilance/gui/settings/SwitchComponent.getEnabled$Vigilance:()Lgg/essential/elementa/state/BasicState;
        //   363: invokevirtual   gg/essential/elementa/state/BasicState.get:()Ljava/lang/Object;
        //   366: checkcast       Ljava/lang/Boolean;
        //   369: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   372: ifeq            617
        //   375: aload           child
        //   377: invokevirtual   gg/essential/vigilance/gui/DataBackedSetting.getComponent$Vigilance:()Lgg/essential/vigilance/gui/settings/SettingComponent;
        //   380: checkcast       Lgg/essential/elementa/UIComponent;
        //   383: invokestatic    gg/essential/vigilance/gui/SettingsGui.access$_init_$click:(Lgg/essential/elementa/UIComponent;)V
        //   386: goto            617
        //   389: iload           11
        //   391: getstatic       gg/essential/universal/UKeyboard.KEY_RIGHT:I
        //   394: if_icmpne       434
        //   397: aload           child
        //   399: invokevirtual   gg/essential/vigilance/gui/DataBackedSetting.getComponent$Vigilance:()Lgg/essential/vigilance/gui/settings/SettingComponent;
        //   402: checkcast       Lgg/essential/vigilance/gui/settings/SwitchComponent;
        //   405: invokevirtual   gg/essential/vigilance/gui/settings/SwitchComponent.getEnabled$Vigilance:()Lgg/essential/elementa/state/BasicState;
        //   408: invokevirtual   gg/essential/elementa/state/BasicState.get:()Ljava/lang/Object;
        //   411: checkcast       Ljava/lang/Boolean;
        //   414: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   417: ifne            617
        //   420: aload           child
        //   422: invokevirtual   gg/essential/vigilance/gui/DataBackedSetting.getComponent$Vigilance:()Lgg/essential/vigilance/gui/settings/SettingComponent;
        //   425: checkcast       Lgg/essential/elementa/UIComponent;
        //   428: invokestatic    gg/essential/vigilance/gui/SettingsGui.access$_init_$click:(Lgg/essential/elementa/UIComponent;)V
        //   431: goto            617
        //   434: iload           11
        //   436: getstatic       gg/essential/universal/UKeyboard.KEY_ENTER:I
        //   439: if_icmpne       617
        //   442: aload           child
        //   444: invokevirtual   gg/essential/vigilance/gui/DataBackedSetting.getComponent$Vigilance:()Lgg/essential/vigilance/gui/settings/SettingComponent;
        //   447: checkcast       Lgg/essential/elementa/UIComponent;
        //   450: invokestatic    gg/essential/vigilance/gui/SettingsGui.access$_init_$click:(Lgg/essential/elementa/UIComponent;)V
        //   453: goto            617
        //   456: aload           10
        //   458: instanceof      Lgg/essential/vigilance/gui/settings/CheckboxComponent;
        //   461: ifeq            485
        //   464: iload_3         /* keyCode */
        //   465: getstatic       gg/essential/universal/UKeyboard.KEY_ENTER:I
        //   468: if_icmpne       617
        //   471: aload           child
        //   473: invokevirtual   gg/essential/vigilance/gui/DataBackedSetting.getComponent$Vigilance:()Lgg/essential/vigilance/gui/settings/SettingComponent;
        //   476: checkcast       Lgg/essential/elementa/UIComponent;
        //   479: invokestatic    gg/essential/vigilance/gui/SettingsGui.access$_init_$click:(Lgg/essential/elementa/UIComponent;)V
        //   482: goto            617
        //   485: aload           10
        //   487: instanceof      Lgg/essential/vigilance/gui/settings/ButtonComponent;
        //   490: ifeq            514
        //   493: iload_3         /* keyCode */
        //   494: getstatic       gg/essential/universal/UKeyboard.KEY_ENTER:I
        //   497: if_icmpne       617
        //   500: aload           child
        //   502: invokevirtual   gg/essential/vigilance/gui/DataBackedSetting.getComponent$Vigilance:()Lgg/essential/vigilance/gui/settings/SettingComponent;
        //   505: checkcast       Lgg/essential/elementa/UIComponent;
        //   508: invokestatic    gg/essential/vigilance/gui/SettingsGui.access$_init_$click:(Lgg/essential/elementa/UIComponent;)V
        //   511: goto            617
        //   514: aload           10
        //   516: instanceof      Lgg/essential/vigilance/gui/settings/SelectorComponent;
        //   519: ifeq            617
        //   522: iload_3         /* keyCode */
        //   523: getstatic       gg/essential/universal/UKeyboard.KEY_UP:I
        //   526: if_icmpne       571
        //   529: aload           child
        //   531: invokevirtual   gg/essential/vigilance/gui/DataBackedSetting.getComponent$Vigilance:()Lgg/essential/vigilance/gui/settings/SettingComponent;
        //   534: checkcast       Lgg/essential/vigilance/gui/settings/SelectorComponent;
        //   537: invokevirtual   gg/essential/vigilance/gui/settings/SelectorComponent.getDropDown$Vigilance:()Lgg/essential/vigilance/gui/settings/DropDownComponent;
        //   540: aload           child
        //   542: invokevirtual   gg/essential/vigilance/gui/DataBackedSetting.getComponent$Vigilance:()Lgg/essential/vigilance/gui/settings/SettingComponent;
        //   545: checkcast       Lgg/essential/vigilance/gui/settings/SelectorComponent;
        //   548: invokevirtual   gg/essential/vigilance/gui/settings/SelectorComponent.getDropDown$Vigilance:()Lgg/essential/vigilance/gui/settings/DropDownComponent;
        //   551: invokevirtual   gg/essential/vigilance/gui/settings/DropDownComponent.getSelectedIndex:()Lgg/essential/elementa/state/State;
        //   554: invokevirtual   gg/essential/elementa/state/State.get:()Ljava/lang/Object;
        //   557: checkcast       Ljava/lang/Number;
        //   560: invokevirtual   java/lang/Number.intValue:()I
        //   563: iconst_1       
        //   564: isub           
        //   565: invokevirtual   gg/essential/vigilance/gui/settings/DropDownComponent.select:(I)V
        //   568: goto            617
        //   571: iload_3         /* keyCode */
        //   572: getstatic       gg/essential/universal/UKeyboard.KEY_DOWN:I
        //   575: if_icmpne       617
        //   578: aload           child
        //   580: invokevirtual   gg/essential/vigilance/gui/DataBackedSetting.getComponent$Vigilance:()Lgg/essential/vigilance/gui/settings/SettingComponent;
        //   583: checkcast       Lgg/essential/vigilance/gui/settings/SelectorComponent;
        //   586: invokevirtual   gg/essential/vigilance/gui/settings/SelectorComponent.getDropDown$Vigilance:()Lgg/essential/vigilance/gui/settings/DropDownComponent;
        //   589: aload           child
        //   591: invokevirtual   gg/essential/vigilance/gui/DataBackedSetting.getComponent$Vigilance:()Lgg/essential/vigilance/gui/settings/SettingComponent;
        //   594: checkcast       Lgg/essential/vigilance/gui/settings/SelectorComponent;
        //   597: invokevirtual   gg/essential/vigilance/gui/settings/SelectorComponent.getDropDown$Vigilance:()Lgg/essential/vigilance/gui/settings/DropDownComponent;
        //   600: invokevirtual   gg/essential/vigilance/gui/settings/DropDownComponent.getSelectedIndex:()Lgg/essential/elementa/state/State;
        //   603: invokevirtual   gg/essential/elementa/state/State.get:()Ljava/lang/Object;
        //   606: checkcast       Ljava/lang/Number;
        //   609: invokevirtual   java/lang/Number.intValue:()I
        //   612: iconst_1       
        //   613: iadd           
        //   614: invokevirtual   gg/essential/vigilance/gui/settings/DropDownComponent.select:(I)V
        //   617: nop            
        //   618: goto            193
        //   621: nop            
        //   622: return         
        //    MethodParameters:
        //  Name             Flags  
        //  ---------------  -----
        //  $this$onKeyType  
        //  $noName_0        
        //  keyCode          
        //    StackMapTable: 00 10 39 FF 00 3D 00 0A 07 00 02 07 00 47 01 01 07 00 62 01 07 00 62 07 00 69 01 07 00 6F 00 00 31 FF 00 17 00 08 07 00 02 07 00 47 01 01 07 00 62 01 07 00 6F 07 00 82 00 00 FE 00 42 07 00 5C 01 07 00 92 16 1C 14 FC 00 37 01 2C FA 00 15 1C 1C 38 2D F8 00 03
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public /* bridge */ Object invoke(final Object p1, final Object p2, final Object p3) {
        this.invoke((UIComponent)p1, (char)p2, ((Number)p3).intValue());
        return Unit.INSTANCE;
    }
}