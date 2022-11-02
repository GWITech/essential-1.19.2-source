package gg.essential.gui.friends.tabs;

import gg.essential.gui.friends.previews.*;
import kotlin.reflect.*;
import org.jetbrains.annotations.*;
import kotlin.properties.*;
import gg.essential.gui.*;
import gg.essential.elementa.components.*;
import gg.essential.elementa.constraints.*;
import gg.essential.elementa.dsl.*;
import gg.essential.elementa.*;
import kotlin.*;
import java.util.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u00004
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0005
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0004
                                                   \u0002\u0010\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\b\u0010\u0015\u001a\u00020\u0012H\u0016R\u001b\u0010\u0006\u001a\u00020\u00078FX\u0086\u0084\u0002¢\u0006\f
                                                   \u0004\b
                                                   \u0010\u000b\u001a\u0004\b\b\u0010	R\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b\u0010\u0010\u000b\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002
                                                   \u0000¨\u0006\u0016""" }, d2 = { "Lgg/essential/gui/friends/tabs/FriendsTab$Section;", "Lgg/essential/elementa/components/UIContainer;", "Lgg/essential/gui/friends/previews/SortListener;", "type", "Lgg/essential/gui/friends/tabs/FriendsTab$UserEntryType;", "(Lgg/essential/gui/friends/tabs/FriendsTab;Lgg/essential/gui/friends/tabs/FriendsTab$UserEntryType;)V", "scrollList", "Lgg/essential/elementa/components/ScrollComponent;", "getScrollList", "()Lgg/essential/elementa/components/ScrollComponent;", "scrollList$delegate", "Lkotlin/properties/ReadWriteProperty;", "text", "Lgg/essential/gui/common/shadow/EssentialUIText;", "getText", "()Lgg/essential/gui/common/shadow/EssentialUIText;", "text$delegate", "setupScrollbar", "", "parent", "Lgg/essential/elementa/UIComponent;", "sort", "essential" })
private final class Section extends UIContainer implements SortListener
{
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties;
    @NotNull
    private final UserEntryType type;
    @NotNull
    private final ReadWriteProperty scrollList$delegate;
    final /* synthetic */ FriendsTab this$0;
    
    public Section(@NotNull final FriendsTab this$0, final UserEntryType type) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "type"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_0         /* this */
        //     7: aload_1         /* this$0 */
        //     8: putfield        gg/essential/gui/friends/tabs/FriendsTab$Section.this$0:Lgg/essential/gui/friends/tabs/FriendsTab;
        //    11: aload_0         /* this */
        //    12: invokespecial   gg/essential/elementa/components/UIContainer.<init>:()V
        //    15: aload_0         /* this */
        //    16: aload_2         /* type */
        //    17: putfield        gg/essential/gui/friends/tabs/FriendsTab$Section.type:Lgg/essential/gui/friends/tabs/FriendsTab$UserEntryType;
        //    20: new             Lgg/essential/gui/common/shadow/EssentialUIText;
        //    23: dup            
        //    24: aload_0         /* this */
        //    25: getfield        gg/essential/gui/friends/tabs/FriendsTab$Section.type:Lgg/essential/gui/friends/tabs/FriendsTab$UserEntryType;
        //    28: invokevirtual   gg/essential/gui/friends/tabs/FriendsTab$UserEntryType.getSectionTitle:()Ljava/lang/String;
        //    31: iconst_0       
        //    32: aconst_null    
        //    33: iconst_0       
        //    34: iconst_0       
        //    35: iconst_0       
        //    36: bipush          62
        //    38: invokespecial   gg/essential/gui/common/shadow/EssentialUIText.<init>:(Ljava/lang/String;ZLjava/awt/Color;ZZZI)V
        //    41: checkcast       Lgg/essential/elementa/UIComponent;
        //    44: astore_3        /* $this$constrain$iv */
        //    45: aload_3         /* $this$constrain$iv */
        //    46: astore          5
        //    48: aload           5
        //    50: astore          $this$constrain_u24lambda_u2d0$iv
        //    52: aload           $this$constrain_u24lambda_u2d0$iv
        //    54: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //    57: astore          $this$text_delegate_u24lambda_u2d0
        //    59: aload           $this$text_delegate_u24lambda_u2d0
        //    61: new             Lgg/essential/elementa/constraints/CenterConstraint;
        //    64: dup            
        //    65: invokespecial   gg/essential/elementa/constraints/CenterConstraint.<init>:()V
        //    68: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //    71: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //    74: aload           $this$text_delegate_u24lambda_u2d0
        //    76: bipush          8
        //    78: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    81: checkcast       Ljava/lang/Number;
        //    84: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //    87: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //    90: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //    93: aload           $this$text_delegate_u24lambda_u2d0
        //    95: getstatic       gg/essential/gui/EssentialPalette.TEXT_HIGHLIGHT:Ljava/awt/Color;
        //    98: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.toConstraint:(Ljava/awt/Color;)Lgg/essential/elementa/constraints/ConstantColorConstraint;
        //   101: checkcast       Lgg/essential/elementa/constraints/ColorConstraint;
        //   104: invokevirtual   gg/essential/elementa/UIConstraints.setColor:(Lgg/essential/elementa/constraints/ColorConstraint;)V
        //   107: aload           5
        //   109: aload_0         /* this */
        //   110: checkcast       Lgg/essential/elementa/UIComponent;
        //   113: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   116: aload_0         /* this */
        //   117: getstatic       gg/essential/gui/friends/tabs/FriendsTab$Section.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   120: iconst_0       
        //   121: aaload         
        //   122: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   125: pop            
        //   126: aload_0         /* this */
        //   127: new             Lgg/essential/elementa/components/ScrollComponent;
        //   130: dup            
        //   131: aload_0         /* this */
        //   132: getfield        gg/essential/gui/friends/tabs/FriendsTab$Section.type:Lgg/essential/gui/friends/tabs/FriendsTab$UserEntryType;
        //   135: invokevirtual   gg/essential/gui/friends/tabs/FriendsTab$UserEntryType.getEmptyText:()Ljava/lang/String;
        //   138: fconst_0       
        //   139: aconst_null    
        //   140: iconst_0       
        //   141: iconst_0       
        //   142: iconst_0       
        //   143: iconst_0       
        //   144: fconst_0       
        //   145: fconst_0       
        //   146: aconst_null    
        //   147: sipush          1022
        //   150: aconst_null    
        //   151: invokespecial   gg/essential/elementa/components/ScrollComponent.<init>:(Ljava/lang/String;FLjava/awt/Color;ZZZZFFLgg/essential/elementa/UIComponent;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   154: checkcast       Lgg/essential/elementa/UIComponent;
        //   157: astore_3        /* $this$constrain$iv */
        //   158: aload_3         /* $this$constrain$iv */
        //   159: astore          5
        //   161: aload           5
        //   163: astore          $this$constrain_u24lambda_u2d0$iv
        //   165: aload           $this$constrain_u24lambda_u2d0$iv
        //   167: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   170: astore          8
        //   172: astore          10
        //   174: aload           $this$scrollList_delegate_u24lambda_u2d1
        //   176: new             Lgg/essential/elementa/constraints/CenterConstraint;
        //   179: dup            
        //   180: invokespecial   gg/essential/elementa/constraints/CenterConstraint.<init>:()V
        //   183: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   186: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   189: aload           $this$scrollList_delegate_u24lambda_u2d1
        //   191: new             Lgg/essential/elementa/constraints/SiblingConstraint;
        //   194: dup            
        //   195: ldc             10.0
        //   197: iconst_0       
        //   198: iconst_2       
        //   199: aconst_null    
        //   200: invokespecial   gg/essential/elementa/constraints/SiblingConstraint.<init>:(FZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   203: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   206: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   209: aload           $this$scrollList_delegate_u24lambda_u2d1
        //   211: bipush          100
        //   213: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   216: checkcast       Ljava/lang/Number;
        //   219: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   222: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   225: bipush          20
        //   227: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   230: checkcast       Ljava/lang/Number;
        //   233: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   236: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   239: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.minus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/SubtractiveConstraint;
        //   242: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   245: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   248: aload           $this$scrollList_delegate_u24lambda_u2d1
        //   250: new             Lgg/essential/elementa/constraints/FillConstraint;
        //   253: dup            
        //   254: iconst_0       
        //   255: invokespecial   gg/essential/elementa/constraints/FillConstraint.<init>:(Z)V
        //   258: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   261: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   264: aload           10
        //   266: aload           5
        //   268: astore_3        /* $this$constrain$iv */
        //   269: aload_3        
        //   270: checkcast       Lgg/essential/elementa/components/ScrollComponent;
        //   273: astore          4
        //   275: astore          10
        //   277: aload           $this$scrollList_delegate_u24lambda_u2d2
        //   279: invokevirtual   gg/essential/elementa/components/ScrollComponent.getEmptyText:()Lgg/essential/elementa/components/UIWrappedText;
        //   282: getstatic       gg/essential/gui/EssentialPalette.TEXT:Ljava/awt/Color;
        //   285: invokevirtual   gg/essential/elementa/components/UIWrappedText.setColor:(Ljava/awt/Color;)Lgg/essential/elementa/UIComponent;
        //   288: pop            
        //   289: aload           10
        //   291: aload_3        
        //   292: aload_0         /* this */
        //   293: checkcast       Lgg/essential/elementa/UIComponent;
        //   296: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   299: checkcast       Lgg/essential/elementa/components/ScrollComponent;
        //   302: bipush          20
        //   304: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   307: checkcast       Ljava/lang/Number;
        //   310: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   313: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   316: invokestatic    gg/essential/util/ExtensionsKt.scrollGradient:(Lgg/essential/elementa/components/ScrollComponent;Lgg/essential/elementa/constraints/HeightConstraint;)Lgg/essential/elementa/components/ScrollComponent;
        //   319: checkcast       Lgg/essential/elementa/UIComponent;
        //   322: aload_0         /* this */
        //   323: getstatic       gg/essential/gui/friends/tabs/FriendsTab$Section.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   326: iconst_1       
        //   327: aaload         
        //   328: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   331: putfield        gg/essential/gui/friends/tabs/FriendsTab$Section.scrollList$delegate:Lkotlin/properties/ReadWriteProperty;
        //   334: aload_0         /* this */
        //   335: checkcast       Lgg/essential/elementa/UIComponent;
        //   338: astore_3       
        //   339: aload_0         /* this */
        //   340: getfield        gg/essential/gui/friends/tabs/FriendsTab$Section.this$0:Lgg/essential/gui/friends/tabs/FriendsTab;
        //   343: astore          4
        //   345: aload_3         /* $this$constrain$iv */
        //   346: astore          6
        //   348: aload           6
        //   350: astore          $this$constrain_u24lambda_u2d0$iv
        //   352: aload           $this$constrain_u24lambda_u2d0$iv
        //   354: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   357: astore          $this$_init__u24lambda_u2d3
        //   359: aload           $this$_init__u24lambda_u2d3
        //   361: new             Lgg/essential/elementa/constraints/SiblingConstraint;
        //   364: dup            
        //   365: fconst_0       
        //   366: iconst_0       
        //   367: iconst_3       
        //   368: aconst_null    
        //   369: invokespecial   gg/essential/elementa/constraints/SiblingConstraint.<init>:(FZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   372: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   375: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   378: aload           $this$_init__u24lambda_u2d3
        //   380: bipush          100
        //   382: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   385: checkcast       Ljava/lang/Number;
        //   388: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   391: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   394: aload           4
        //   396: invokevirtual   gg/essential/gui/friends/tabs/FriendsTab.getGui:()Lgg/essential/gui/friends/SocialMenu;
        //   399: invokevirtual   gg/essential/gui/friends/SocialMenu.getDividerWidth:()F
        //   402: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //   405: checkcast       Ljava/lang/Number;
        //   408: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   411: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   414: iconst_2       
        //   415: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   418: checkcast       Ljava/lang/Number;
        //   421: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.times:(Lgg/essential/elementa/constraints/SuperConstraint;Ljava/lang/Number;)Lgg/essential/elementa/constraints/ScaleConstraint;
        //   424: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   427: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.minus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/SubtractiveConstraint;
        //   430: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   433: iconst_3       
        //   434: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   437: checkcast       Ljava/lang/Number;
        //   440: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.div:(Lgg/essential/elementa/constraints/SuperConstraint;Ljava/lang/Number;)Lgg/essential/elementa/constraints/ScaleConstraint;
        //   443: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   446: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   449: aload           $this$_init__u24lambda_u2d3
        //   451: bipush          100
        //   453: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   456: checkcast       Ljava/lang/Number;
        //   459: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   462: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   465: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   468: return         
        //    Signature:
        //  (Lgg/essential/gui/friends/tabs/FriendsTab;Lgg/essential/gui/friends/tabs/FriendsTab$UserEntryType;)V [from metadata: (Lgg/essential/gui/friends/tabs/FriendsTab$UserEntryType;)V]
        //  
        //    MethodParameters:
        //  Name    Flags  
        //  ------  -----
        //  this$0  
        //  type    
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @NotNull
    public final ScrollComponent getScrollList() {
        return (ScrollComponent)this.scrollList$delegate.getValue((Object)this, (KProperty)Section.$$delegatedProperties[1]);
    }
    
    public final void setupScrollbar(@NotNull final UIComponent parent) {
        Intrinsics.checkNotNullParameter((Object)parent, "parent");
        final UIComponent $this$constrain_u24lambda_u2d0$iv;
        final UIComponent $this$constrain$iv = $this$constrain_u24lambda_u2d0$iv = new UIBlock(EssentialPalette.SCROLLBAR);
        final UIConstraints $this$setupScrollbar_u24lambda_u2d4 = $this$constrain_u24lambda_u2d0$iv.getConstraints();
        $this$setupScrollbar_u24lambda_u2d4.setWidth(UtilitiesKt.getPercent(100));
        final UIBlock scrollbar = ComponentsKt.childOf($this$constrain_u24lambda_u2d0$iv, parent);
        this.getScrollList().setVerticalScrollBarComponent(scrollbar, true);
    }
    
    @Override
    public void sort() {
        final Comparator filter = switch (Section.WhenMappings.$EnumSwitchMapping$0[this.type.ordinal()]) {
            case 1 -> FriendsTab.access$getFriendSorter$p(this.this$0);
            case 2 -> FriendsTab.access$getPendingSorter$p(this.this$0);
            case 3 -> FriendsTab.access$getBlockedSorter$p(this.this$0);
            default -> throw new NoWhenBranchMatchedException();
        };
        this.getScrollList().sortChildren(filter);
    }
    
    static {
        $$delegatedProperties = new KProperty[] { (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)Section.class, "text", "getText()Lgg/essential/gui/common/shadow/EssentialUIText;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)Section.class, "scrollList", "getScrollList()Lgg/essential/elementa/components/ScrollComponent;", 0)) };
    }
}
