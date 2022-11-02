package gg.essential.gui.common.modal;

import kotlin.reflect.*;
import gg.essential.elementa.state.*;
import java.util.*;
import org.jetbrains.annotations.*;
import kotlin.properties.*;
import kotlin.collections.*;
import kotlin.*;
import kotlin.jvm.functions.*;
import kotlin.jvm.internal.*;
import gg.essential.elementa.components.*;
import gg.essential.gui.common.input.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000N
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u000b
                                                   \u0002\b\u0002
                                                   \u0002\u0010"
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0010\u0007
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0005
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0004
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0002
                                                   \u0002\b\u0004
                                                   \u0002\u0018\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0002\u001d\u001eB=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010	\u001a\u00020
                                                   ¢\u0006\u0002\u0010\u000bJ \u0010\u0019\u001a\u00020\u00002\u0018\u0010\u001a\u001a\u0014\u0012
                                                   \u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0004\u0012\u00020\u001c0\u001bR\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0017\u001a\u000e\u0012
                                                   \u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0018X\u0082\u0004¢\u0006\u0002
                                                   \u0000¨\u0006\u001f²\u0006
                                                   \u0010 \u001a\u00020!X\u008a\u0084\u0002""" }, d2 = { "Lgg/essential/gui/common/modal/UserSelectionModal;", "Lgg/essential/gui/common/modal/ConfirmDenyModal;", "requiresButtonPress", "", "requiresSelection", "allUsers", "", "Ljava/util/UUID;", "preselected", "fadeTime", "", "(ZZLjava/util/Set;Ljava/util/Set;F)V", "scrollContainer", "Lgg/essential/elementa/components/UIContainer;", "getScrollContainer", "()Lgg/essential/elementa/components/UIContainer;", "scrollContainer$delegate", "Lkotlin/properties/ReadWriteProperty;", "scroller", "Lgg/essential/elementa/components/ScrollComponent;", "getScroller", "()Lgg/essential/elementa/components/ScrollComponent;", "scroller$delegate", "selectedUsers", "Lgg/essential/elementa/state/BasicState;", "onPrimaryActionWithValue", "callback", "Lkotlin/Function1;", "", "Friend", "Searchbar", "essential", "search", "Lgg/essential/gui/common/modal/UserSelectionModal$Searchbar;" })
public class UserSelectionModal extends ConfirmDenyModal
{
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties;
    @NotNull
    private final BasicState<Set<UUID>> selectedUsers;
    @NotNull
    private final ReadWriteProperty scrollContainer$delegate;
    @NotNull
    private final ReadWriteProperty scroller$delegate;
    
    public UserSelectionModal(final boolean requiresButtonPress, final boolean requiresSelection, @NotNull final Set<UUID> allUsers, @NotNull final Set<UUID> preselected, final float fadeTime) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "allUsers"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload           preselected
        //     8: ldc             "preselected"
        //    10: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    13: aload_0         /* this */
        //    14: iconst_0       
        //    15: ldc             0.5
        //    17: invokespecial   gg/essential/gui/common/modal/ConfirmDenyModal.<init>:(ZF)V
        //    20: aload_0         /* this */
        //    21: new             Lgg/essential/elementa/state/BasicState;
        //    24: dup            
        //    25: aload           preselected
        //    27: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //    30: putfield        gg/essential/gui/common/modal/UserSelectionModal.selectedUsers:Lgg/essential/elementa/state/BasicState;
        //    33: aload_0         /* this */
        //    34: new             Lgg/essential/elementa/components/UIContainer;
        //    37: dup            
        //    38: invokespecial   gg/essential/elementa/components/UIContainer.<init>:()V
        //    41: checkcast       Lgg/essential/elementa/UIComponent;
        //    44: astore          $this$constrain$iv
        //    46: aload           $this$constrain$iv
        //    48: astore          7
        //    50: aload           7
        //    52: astore          $this$constrain_u24lambda_u2d0$iv
        //    54: aload           $this$constrain_u24lambda_u2d0$iv
        //    56: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //    59: astore          9
        //    61: astore          10
        //    63: aload           $this$scrollContainer_delegate_u24lambda_u2d0
        //    65: new             Lgg/essential/elementa/constraints/SiblingConstraint;
        //    68: dup            
        //    69: ldc             15.0
        //    71: iconst_0       
        //    72: iconst_2       
        //    73: aconst_null    
        //    74: invokespecial   gg/essential/elementa/constraints/SiblingConstraint.<init>:(FZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //    77: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //    80: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //    83: aload           $this$scrollContainer_delegate_u24lambda_u2d0
        //    85: bipush          100
        //    87: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    90: checkcast       Ljava/lang/Number;
        //    93: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //    96: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //    99: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   102: aload           $this$scrollContainer_delegate_u24lambda_u2d0
        //   104: sipush          146
        //   107: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   110: checkcast       Ljava/lang/Number;
        //   113: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   116: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   119: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   122: aload           10
        //   124: aload           7
        //   126: aload_0         /* this */
        //   127: getstatic       gg/essential/gui/common/modal/UserSelectionModal.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   130: iconst_0       
        //   131: aaload         
        //   132: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   135: putfield        gg/essential/gui/common/modal/UserSelectionModal.scrollContainer$delegate:Lkotlin/properties/ReadWriteProperty;
        //   138: aload_0         /* this */
        //   139: new             Lgg/essential/elementa/components/ScrollComponent;
        //   142: dup            
        //   143: ldc             "No Friends Found"
        //   145: fconst_0       
        //   146: aconst_null    
        //   147: iconst_0       
        //   148: iconst_0       
        //   149: iconst_0       
        //   150: iconst_0       
        //   151: fconst_0       
        //   152: fconst_0       
        //   153: aconst_null    
        //   154: sipush          1022
        //   157: aconst_null    
        //   158: invokespecial   gg/essential/elementa/components/ScrollComponent.<init>:(Ljava/lang/String;FLjava/awt/Color;ZZZZFFLgg/essential/elementa/UIComponent;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   161: checkcast       Lgg/essential/elementa/UIComponent;
        //   164: astore          $this$constrain$iv
        //   166: aload           $this$constrain$iv
        //   168: astore          7
        //   170: aload           7
        //   172: astore          $this$constrain_u24lambda_u2d0$iv
        //   174: aload           $this$constrain_u24lambda_u2d0$iv
        //   176: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   179: astore          9
        //   181: astore          10
        //   183: aload           $this$scroller_delegate_u24lambda_u2d1
        //   185: new             Lgg/essential/elementa/constraints/CenterConstraint;
        //   188: dup            
        //   189: invokespecial   gg/essential/elementa/constraints/CenterConstraint.<init>:()V
        //   192: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   195: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   198: aload           $this$scroller_delegate_u24lambda_u2d1
        //   200: bipush          100
        //   202: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   205: checkcast       Ljava/lang/Number;
        //   208: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   211: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   214: bipush          26
        //   216: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   219: checkcast       Ljava/lang/Number;
        //   222: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   225: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   228: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.minus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/SubtractiveConstraint;
        //   231: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   234: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   237: aload           $this$scroller_delegate_u24lambda_u2d1
        //   239: bipush          100
        //   241: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   244: checkcast       Ljava/lang/Number;
        //   247: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   250: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   253: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   256: aload           10
        //   258: aload           7
        //   260: aload_0         /* this */
        //   261: invokespecial   gg/essential/gui/common/modal/UserSelectionModal.getScrollContainer:()Lgg/essential/elementa/components/UIContainer;
        //   264: checkcast       Lgg/essential/elementa/UIComponent;
        //   267: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   270: checkcast       Lgg/essential/elementa/components/ScrollComponent;
        //   273: bipush          40
        //   275: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   278: checkcast       Ljava/lang/Number;
        //   281: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   284: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   287: invokestatic    gg/essential/util/ExtensionsKt.scrollGradient:(Lgg/essential/elementa/components/ScrollComponent;Lgg/essential/elementa/constraints/HeightConstraint;)Lgg/essential/elementa/components/ScrollComponent;
        //   290: checkcast       Lgg/essential/elementa/UIComponent;
        //   293: aload_0         /* this */
        //   294: getstatic       gg/essential/gui/common/modal/UserSelectionModal.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   297: iconst_1       
        //   298: aaload         
        //   299: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   302: putfield        gg/essential/gui/common/modal/UserSelectionModal.scroller$delegate:Lkotlin/properties/ReadWriteProperty;
        //   305: aload_0         /* this */
        //   306: new             Lgg/essential/gui/common/modal/UserSelectionModal$1;
        //   309: dup            
        //   310: aload_0         /* this */
        //   311: aload_3         /* allUsers */
        //   312: invokespecial   gg/essential/gui/common/modal/UserSelectionModal$1.<init>:(Lgg/essential/gui/common/modal/UserSelectionModal;Ljava/util/Set;)V
        //   315: checkcast       Lkotlin/jvm/functions/Function1;
        //   318: invokevirtual   gg/essential/gui/common/modal/UserSelectionModal.configureLayout:(Lkotlin/jvm/functions/Function1;)Lgg/essential/gui/common/modal/EssentialModal;
        //   321: pop            
        //   322: aload_0         /* this */
        //   323: aload_0         /* this */
        //   324: getfield        gg/essential/gui/common/modal/UserSelectionModal.selectedUsers:Lgg/essential/elementa/state/BasicState;
        //   327: getstatic       gg/essential/gui/common/modal/UserSelectionModal$2.INSTANCE:Lgg/essential/gui/common/modal/UserSelectionModal$2;
        //   330: checkcast       Lkotlin/jvm/functions/Function1;
        //   333: invokevirtual   gg/essential/elementa/state/BasicState.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //   336: checkcast       Lgg/essential/elementa/state/State;
        //   339: invokevirtual   gg/essential/gui/common/modal/UserSelectionModal.bindConfirmAvailable:(Lgg/essential/elementa/state/State;)Lgg/essential/gui/common/modal/EssentialModal;
        //   342: pop            
        //   343: return         
        //    Signature:
        //  (ZZLjava/util/Set<Ljava/util/UUID;>;Ljava/util/Set<Ljava/util/UUID;>;F)V
        //    MethodParameters:
        //  Name                 Flags  
        //  -------------------  -----
        //  requiresButtonPress  
        //  requiresSelection    
        //  allUsers             
        //  preselected          
        //  fadeTime             
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public UserSelectionModal(final Set allUsers) {
        this(false, true, allUsers, SetsKt.emptySet(), 0.5f);
    }
    
    private final UIContainer getScrollContainer() {
        return (UIContainer)this.scrollContainer$delegate.getValue((Object)this, (KProperty)UserSelectionModal.$$delegatedProperties[0]);
    }
    
    private final ScrollComponent getScroller() {
        return (ScrollComponent)this.scroller$delegate.getValue((Object)this, (KProperty)UserSelectionModal.$$delegatedProperties[1]);
    }
    
    @NotNull
    public final UserSelectionModal onPrimaryActionWithValue(@NotNull final Function1<? super Set<UUID>, Unit> callback) {
        Intrinsics.checkNotNullParameter((Object)callback, "callback");
        final UserSelectionModal $this$onPrimaryActionWithValue_u24lambda_u2d2 = this;
        super.onPrimaryAction((Function0<Unit>)new UserSelectionModal$onPrimaryActionWithValue$1.UserSelectionModal$onPrimaryActionWithValue$1$1((Function1)callback, $this$onPrimaryActionWithValue_u24lambda_u2d2));
        return this;
    }
    
    public static final /* synthetic */ BasicState access$getSelectedUsers$p(final UserSelectionModal $this) {
        return $this.selectedUsers;
    }
    
    public static final /* synthetic */ UIContainer access$getScrollContainer(final UserSelectionModal $this) {
        return $this.getScrollContainer();
    }
    
    public static final /* synthetic */ ScrollComponent access$getScroller(final UserSelectionModal $this) {
        return $this.getScroller();
    }
    
    static {
        $$delegatedProperties = new KProperty[] { (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)UserSelectionModal.class, "scrollContainer", "getScrollContainer()Lgg/essential/elementa/components/UIContainer;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)UserSelectionModal.class, "scroller", "getScroller()Lgg/essential/elementa/components/ScrollComponent;", 0)) };
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                       \u0000.
                                                       \u0002\u0018\u0002
                                                       \u0002\u0018\u0002
                                                       \u0002\b\u0002
                                                       \u0002\u0018\u0002
                                                       \u0002\b\u0005
                                                       \u0002\u0018\u0002
                                                       \u0002\b\u0004
                                                       \u0002\u0018\u0002
                                                       \u0002\u0010\u000e
                                                       \u0002\b\u0003
                                                       \u0002\u0010\u0002
                                                       \u0000\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0016R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f
                                                       \u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010	\u001a\u00020
                                                       8BX\u0082\u0084\u0002¢\u0006\f
                                                       \u0004\b\r\u0010\b\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\b
                                                       \u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0015""" }, d2 = { "Lgg/essential/gui/common/modal/UserSelectionModal$Searchbar;", "Lgg/essential/elementa/components/UIBlock;", "()V", "searchIcon", "Lgg/essential/gui/common/shadow/ShadowIcon;", "getSearchIcon", "()Lgg/essential/gui/common/shadow/ShadowIcon;", "searchIcon$delegate", "Lkotlin/properties/ReadWriteProperty;", "searchInput", "Lgg/essential/gui/common/input/UITextInput;", "getSearchInput", "()Lgg/essential/gui/common/input/UITextInput;", "searchInput$delegate", "textState", "Lgg/essential/elementa/state/BasicState;", "", "getTextState", "()Lgg/essential/elementa/state/BasicState;", "afterInitialization", "", "essential" })
    private static final class Searchbar extends UIBlock
    {
        static final /* synthetic */ KProperty<Object>[] $$delegatedProperties;
        @NotNull
        private final BasicState<String> textState;
        @NotNull
        private final ReadWriteProperty searchInput$delegate;
        
        public Searchbar() {
            // 
            // This method could not be decompiled.
            // 
            // Original Bytecode:
            // 
            //     1: getstatic       gg/essential/gui/EssentialPalette.BUTTON_HIGHLIGHT:Ljava/awt/Color;
            //     4: invokespecial   gg/essential/elementa/components/UIBlock.<init>:(Ljava/awt/Color;)V
            //     7: aload_0         /* this */
            //     8: new             Lgg/essential/elementa/state/BasicState;
            //    11: dup            
            //    12: ldc             ""
            //    14: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
            //    17: putfield        gg/essential/gui/common/modal/UserSelectionModal$Searchbar.textState:Lgg/essential/elementa/state/BasicState;
            //    20: new             Lgg/essential/gui/common/shadow/ShadowIcon;
            //    23: dup            
            //    24: getstatic       gg/essential/gui/EssentialPalette.SEARCH_7X:Lgg/essential/gui/image/ImageFactory;
            //    27: invokespecial   gg/essential/gui/common/shadow/ShadowIcon.<init>:(Lgg/essential/gui/image/ImageFactory;)V
            //    30: checkcast       Lgg/essential/elementa/UIComponent;
            //    33: astore_1        /* $this$constrain$iv */
            //    34: aload_1         /* $this$constrain$iv */
            //    35: astore_2       
            //    36: aload_2        
            //    37: astore_3        /* $this$constrain_u24lambda_u2d0$iv */
            //    38: aload_3         /* $this$constrain_u24lambda_u2d0$iv */
            //    39: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
            //    42: astore          $this$searchIcon_delegate_u24lambda_u2d0
            //    44: aload           $this$searchIcon_delegate_u24lambda_u2d0
            //    46: iconst_5       
            //    47: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
            //    50: checkcast       Ljava/lang/Number;
            //    53: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
            //    56: checkcast       Lgg/essential/elementa/constraints/XConstraint;
            //    59: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
            //    62: aload           $this$searchIcon_delegate_u24lambda_u2d0
            //    64: new             Lgg/essential/elementa/constraints/CenterConstraint;
            //    67: dup            
            //    68: invokespecial   gg/essential/elementa/constraints/CenterConstraint.<init>:()V
            //    71: checkcast       Lgg/essential/elementa/constraints/YConstraint;
            //    74: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
            //    77: aload_2        
            //    78: aload_0         /* this */
            //    79: checkcast       Lgg/essential/elementa/UIComponent;
            //    82: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
            //    85: aload_0         /* this */
            //    86: getstatic       gg/essential/gui/common/modal/UserSelectionModal$Searchbar.$$delegatedProperties:[Lkotlin/reflect/KProperty;
            //    89: iconst_0       
            //    90: aaload         
            //    91: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
            //    94: pop            
            //    95: aload_0         /* this */
            //    96: new             Lgg/essential/gui/common/input/UITextInput;
            //    99: dup            
            //   100: ldc             "Search"
            //   102: iconst_0       
            //   103: getstatic       gg/essential/gui/EssentialPalette.BLACK:Ljava/awt/Color;
            //   106: aconst_null    
            //   107: aconst_null    
            //   108: aconst_null    
            //   109: aconst_null    
            //   110: aconst_null    
            //   111: sipush          506
            //   114: invokespecial   gg/essential/gui/common/input/UITextInput.<init>:(Ljava/lang/String;ZLjava/awt/Color;Ljava/awt/Color;Ljava/awt/Color;Ljava/awt/Color;Ljava/awt/Color;Ljava/awt/Color;I)V
            //   117: checkcast       Lgg/essential/elementa/UIComponent;
            //   120: astore_1        /* $this$constrain$iv */
            //   121: aload_1         /* $this$constrain$iv */
            //   122: astore_2       
            //   123: aload_2        
            //   124: astore_3        /* $this$constrain_u24lambda_u2d0$iv */
            //   125: aload_3         /* $this$constrain_u24lambda_u2d0$iv */
            //   126: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
            //   129: astore          4
            //   131: astore          5
            //   133: aload           $this$searchInput_delegate_u24lambda_u2d1
            //   135: new             Lgg/essential/elementa/constraints/SiblingConstraint;
            //   138: dup            
            //   139: ldc             5.0
            //   141: iconst_0       
            //   142: iconst_2       
            //   143: aconst_null    
            //   144: invokespecial   gg/essential/elementa/constraints/SiblingConstraint.<init>:(FZILkotlin/jvm/internal/DefaultConstructorMarker;)V
            //   147: checkcast       Lgg/essential/elementa/constraints/XConstraint;
            //   150: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
            //   153: aload           $this$searchInput_delegate_u24lambda_u2d1
            //   155: new             Lgg/essential/elementa/constraints/CenterConstraint;
            //   158: dup            
            //   159: invokespecial   gg/essential/elementa/constraints/CenterConstraint.<init>:()V
            //   162: checkcast       Lgg/essential/elementa/constraints/YConstraint;
            //   165: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
            //   168: aload           $this$searchInput_delegate_u24lambda_u2d1
            //   170: new             Lgg/essential/elementa/constraints/FillConstraint;
            //   173: dup            
            //   174: iconst_0       
            //   175: invokespecial   gg/essential/elementa/constraints/FillConstraint.<init>:(Z)V
            //   178: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
            //   181: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
            //   184: aload           $this$searchInput_delegate_u24lambda_u2d1
            //   186: bipush          9
            //   188: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
            //   191: checkcast       Ljava/lang/Number;
            //   194: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
            //   197: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
            //   200: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
            //   203: aload           5
            //   205: aload_2        
            //   206: aload_0         /* this */
            //   207: checkcast       Lgg/essential/elementa/UIComponent;
            //   210: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
            //   213: aload_0         /* this */
            //   214: getstatic       gg/essential/gui/common/modal/UserSelectionModal$Searchbar.$$delegatedProperties:[Lkotlin/reflect/KProperty;
            //   217: iconst_1       
            //   218: aaload         
            //   219: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
            //   222: putfield        gg/essential/gui/common/modal/UserSelectionModal$Searchbar.searchInput$delegate:Lkotlin/properties/ReadWriteProperty;
            //   225: aload_0         /* this */
            //   226: checkcast       Lgg/essential/elementa/UIComponent;
            //   229: astore_1        /* $this$constrain$iv */
            //   230: aload_1         /* $this$constrain$iv */
            //   231: astore_2       
            //   232: aload_2        
            //   233: astore_3        /* $this$constrain_u24lambda_u2d0$iv */
            //   234: aload_3         /* $this$constrain_u24lambda_u2d0$iv */
            //   235: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
            //   238: astore          $this$_init__u24lambda_u2d2
            //   240: aload           $this$_init__u24lambda_u2d2
            //   242: bipush          100
            //   244: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
            //   247: checkcast       Ljava/lang/Number;
            //   250: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
            //   253: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
            //   256: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
            //   259: aload           $this$_init__u24lambda_u2d2
            //   261: bipush          17
            //   263: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
            //   266: checkcast       Ljava/lang/Number;
            //   269: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
            //   272: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
            //   275: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
            //   278: aload_0         /* this */
            //   279: invokespecial   gg/essential/gui/common/modal/UserSelectionModal$Searchbar.getSearchInput:()Lgg/essential/gui/common/input/UITextInput;
            //   282: new             Lgg/essential/gui/common/modal/UserSelectionModal$Searchbar$2;
            //   285: dup            
            //   286: aload_0         /* this */
            //   287: invokespecial   gg/essential/gui/common/modal/UserSelectionModal$Searchbar$2.<init>:(Lgg/essential/gui/common/modal/UserSelectionModal$Searchbar;)V
            //   290: checkcast       Lkotlin/jvm/functions/Function1;
            //   293: invokevirtual   gg/essential/gui/common/input/UITextInput.onUpdate:(Lkotlin/jvm/functions/Function1;)Lgg/essential/gui/common/input/AbstractTextInput;
            //   296: pop            
            //   297: aload_0         /* this */
            //   298: invokespecial   gg/essential/gui/common/modal/UserSelectionModal$Searchbar.getSearchInput:()Lgg/essential/gui/common/input/UITextInput;
            //   301: checkcast       Lgg/essential/elementa/UIComponent;
            //   304: astore_1        /* $this$onLeftClick$iv */
            //   305: aload_1         /* $this$onLeftClick$iv */
            //   306: new             Lgg/essential/gui/common/modal/UserSelectionModal$Searchbar$special$$inlined$onLeftClick$1;
            //   309: dup            
            //   310: aload_0         /* this */
            //   311: invokespecial   gg/essential/gui/common/modal/UserSelectionModal$Searchbar$special$$inlined$onLeftClick$1.<init>:(Lgg/essential/gui/common/modal/UserSelectionModal$Searchbar;)V
            //   314: checkcast       Lkotlin/jvm/functions/Function2;
            //   317: invokevirtual   gg/essential/elementa/UIComponent.onMouseClick:(Lkotlin/jvm/functions/Function2;)Lgg/essential/elementa/UIComponent;
            //   320: pop            
            //   321: return         
            // 
            throw new IllegalStateException("An error occurred while decompiling this method.");
        }
        
        @NotNull
        public final BasicState<String> getTextState() {
            return this.textState;
        }
        
        private final UITextInput getSearchInput() {
            return (UITextInput)this.searchInput$delegate.getValue((Object)this, (KProperty)Searchbar.$$delegatedProperties[1]);
        }
        
        @Override
        public void afterInitialization() {
            super.afterInitialization();
            this.getSearchInput().grabWindowFocus();
        }
        
        public static final /* synthetic */ UITextInput access$getSearchInput(final Searchbar $this) {
            return $this.getSearchInput();
        }
        
        static {
            $$delegatedProperties = new KProperty[] { (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)Searchbar.class, "searchIcon", "getSearchIcon()Lgg/essential/gui/common/shadow/ShadowIcon;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)Searchbar.class, "searchInput", "getSearchInput()Lgg/essential/gui/common/input/UITextInput;", 0)) };
        }
    }
}
