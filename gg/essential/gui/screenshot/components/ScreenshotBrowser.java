package gg.essential.gui.screenshot.components;

import gg.essential.api.gui.*;
import gg.essential.network.connectionmanager.media.*;
import java.nio.file.*;
import org.jetbrains.annotations.*;
import gg.essential.*;
import gg.essential.elementa.state.*;
import gg.essential.elementa.*;
import gg.essential.gui.common.*;
import kotlin.jvm.internal.*;
import kotlin.collections.*;
import kotlin.jvm.functions.*;
import gg.essential.gui.screenshot.handler.*;
import java.io.*;
import kotlin.*;
import gg.essential.api.utils.*;
import java.text.*;
import java.time.temporal.*;
import gg.essential.handlers.screenshot.*;
import com.sparkuniverse.toolbox.util.*;
import java.time.*;
import java.util.*;
import net.minecraft.client.*;
import gg.essential.universal.*;
import gg.essential.util.*;
import java.util.function.*;
import java.util.concurrent.*;
import io.netty.buffer.*;
import gg.essential.util.lwjgl3.api.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000¨\u0001
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0003
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0003
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0003
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0005
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0003
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0003
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0003
                                                   \u0002\u0018\u0002
                                                   \u0002\b\f
                                                   \u0002\u0010\u000b
                                                   \u0002\b\u0002
                                                   \u0002\u0010"
                                                   \u0000
                                                   \u0002\u0010 
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u000e
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0004
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\b
                                                   \u0002\b\u0004\u0018\u0000 O2\u00020\u0001:\u0001OB\u0011\u0012
                                                   \b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000e\u00104\u001a\u00020\b2\u0006\u00105\u001a\u00020\u001aJ\u0006\u00106\u001a\u00020\bJ\u0014\u00107\u001a\u00020\b2\f\u00108\u001a\b\u0012\u0004\u0012\u00020\b0\u0007J\u000e\u00109\u001a\u00020\b2\u0006\u00105\u001a\u00020\u001aJ\u0016\u0010:\u001a\u00020\b2\u0006\u0010;\u001a\u00020\u00032\u0006\u0010<\u001a\u00020=J\u0014\u0010>\u001a\u00020\b2\f\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00030@J(\u0010A\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020D\u0012
                                                   \u0012\b\u0012\u0004\u0012\u00020D0E0C0B2\u0006\u00105\u001a\u00020\u001aH\u0002J\b\u0010F\u001a\u00020\bH\u0016J\u0006\u0010G\u001a\u00020\bJ\u000e\u0010G\u001a\u00020\b2\u0006\u00105\u001a\u00020\u001aJ\u000e\u0010<\u001a\u00020\b2\u0006\u00105\u001a\u00020\u001aJ \u0010H\u001a\u00020\b2\u0006\u0010I\u001a\u00020J2\u0006\u0010K\u001a\u00020L2\u0006\u0010M\u001a\u00020LH\u0016J\b\u0010N\u001a\u00020\bH\u0016R\u001a\u0010\u0005\u001a\u000e\u0012
                                                   \u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u0017\u0010	\u001a\b\u0012\u0004\u0012\u00020\u000b0
                                                   ¢\u0006\b
                                                   \u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b
                                                   \u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b
                                                   \u0000\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170
                                                   ¢\u0006\b
                                                   \u0000\u001a\u0004\b\u0018\u0010\rR\u0019\u0010\u0019\u001a
                                                   \u0012\u0006\u0012\u0004\u0018\u00010\u001a0
                                                   ¢\u0006\b
                                                   \u0000\u001a\u0004\b\u001b\u0010\rR\u0011\u0010\u001c\u001a\u00020\u001d¢\u0006\b
                                                   \u0000\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010 \u001a
                                                   \u0012\u0006\u0012\u0004\u0018\u00010\u001a0
                                                   ¢\u0006\b
                                                   \u0000\u001a\u0004\b!\u0010\rR\u0011\u0010"\u001a\u00020#¢\u0006\b
                                                   \u0000\u001a\u0004\b$\u0010%R\u0011\u0010&\u001a\u00020'¢\u0006\b
                                                   \u0000\u001a\u0004\b(\u0010)R\u0016\u0010*\u001a\u00070+¢\u0006\u0002\b,¢\u0006\b
                                                   \u0000\u001a\u0004\b-\u0010.R\u0011\u0010/\u001a\u000200¢\u0006\b
                                                   \u0000\u001a\u0004\b1\u00102R\u000e\u00103\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002
                                                   \u0000¨\u0006P""" }, d2 = { "Lgg/essential/gui/screenshot/components/ScreenshotBrowser;", "Lgg/essential/api/gui/EssentialGUI;", "editPath", "Ljava/nio/file/Path;", "(Ljava/nio/file/Path;)V", "closeOperations", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "Lkotlin/Function0;", "", "currentView", "Lgg/essential/elementa/state/BasicState;", "Lgg/essential/gui/screenshot/components/View;", "getCurrentView", "()Lgg/essential/elementa/state/BasicState;", "focusEditComponent", "Lgg/essential/gui/screenshot/components/FocusEditComponent;", "getFocusEditComponent", "()Lgg/essential/gui/screenshot/components/FocusEditComponent;", "focusListComponent", "Lgg/essential/gui/screenshot/components/FocusListComponent;", "getFocusListComponent", "()Lgg/essential/gui/screenshot/components/FocusListComponent;", "focusType", "Lgg/essential/gui/screenshot/components/FocusType;", "getFocusType", "focusing", "Lgg/essential/gui/screenshot/components/ScreenshotProperties;", "getFocusing", "listViewComponent", "Lgg/essential/gui/screenshot/components/ListViewComponent;", "getListViewComponent", "()Lgg/essential/gui/screenshot/components/ListViewComponent;", "menuDialogOwner", "getMenuDialogOwner", "optionsDropdown", "Lgg/essential/gui/screenshot/components/ScreenshotOptionsDropdown;", "getOptionsDropdown", "()Lgg/essential/gui/screenshot/components/ScreenshotOptionsDropdown;", "providerManager", "Lgg/essential/gui/screenshot/components/ScreenshotProviderManager;", "getProviderManager", "()Lgg/essential/gui/screenshot/components/ScreenshotProviderManager;", "screenshotManager", "Lgg/essential/network/connectionmanager/media/ScreenshotManager;", "Lorg/jetbrains/annotations/NotNull;", "getScreenshotManager", "()Lgg/essential/network/connectionmanager/media/ScreenshotManager;", "stateManager", "Lgg/essential/gui/screenshot/components/ScreenshotStateManager;", "getStateManager", "()Lgg/essential/gui/screenshot/components/ScreenshotStateManager;", "stateToRestore", "changeFocusedComponent", "properties", "closeFocus", "closeOperation", "function", "displayPropertiesModal", "editCallback", "newScreenshot", "openFocusView", "", "externalDelete", "paths", "", "generateImageProperties", "", "Lkotlin/Pair;", "", "Lgg/essential/elementa/state/State;", "onScreenClose", "openEditor", "resize", "mcIn", "Lnet/minecraft/client/MinecraftClient;", "w", "", "h", "updateGuiScale", "Companion", "essential" })
public final class ScreenshotBrowser extends EssentialGUI
{
    @NotNull
    public static final Companion Companion;
    @NotNull
    private final ConcurrentLinkedQueue<Function0<Unit>> closeOperations;
    @NotNull
    private final BasicState<ScreenshotProperties> focusing;
    @NotNull
    private final BasicState<View> currentView;
    @NotNull
    private final BasicState<FocusType> focusType;
    @NotNull
    private final ScreenshotManager screenshotManager;
    @NotNull
    private final ScreenshotStateManager stateManager;
    @NotNull
    private final ListViewComponent listViewComponent;
    @NotNull
    private final ScreenshotProviderManager providerManager;
    @NotNull
    private final FocusListComponent focusListComponent;
    @NotNull
    private final FocusEditComponent focusEditComponent;
    @NotNull
    private final BasicState<ScreenshotProperties> menuDialogOwner;
    @NotNull
    private final ScreenshotOptionsDropdown optionsDropdown;
    @NotNull
    private View stateToRestore;
    @NotNull
    private static final DateFormat DATE_FORMAT;
    
    public ScreenshotBrowser(@Nullable final Path editPath) {
        super(ElementaVersion.V1, "Screenshot Browser", 0, false, "Browsing screenshots", 12, null);
        this.closeOperations = new ConcurrentLinkedQueue<Function0<Unit>>();
        this.focusing = new BasicState<ScreenshotProperties>(null);
        this.currentView = (BasicState)this.focusing.map((kotlin.jvm.functions.Function1<? super Object, ?>)ScreenshotBrowser$currentView.ScreenshotBrowser$currentView$1.INSTANCE);
        this.focusType = new BasicState<FocusType>(FocusType.VIEW);
        final ScreenshotManager screenshotManager = Essential.getInstance().getConnectionManager().getScreenshotManager();
        Intrinsics.checkNotNullExpressionValue((Object)screenshotManager, "getInstance().connectionManager.screenshotManager");
        this.screenshotManager = screenshotManager;
        this.stateManager = new ScreenshotStateManager(this);
        this.listViewComponent = new ListViewComponent(this);
        this.providerManager = new ScreenshotProviderManager(this, this.listViewComponent.getScreenshotScrollComponent());
        this.focusListComponent = new FocusListComponent(this);
        this.focusEditComponent = new FocusEditComponent(this);
        this.menuDialogOwner = new BasicState<ScreenshotProperties>(null);
        this.optionsDropdown = new ScreenshotOptionsDropdown(this, this.menuDialogOwner);
        this.stateToRestore = View.LIST;
        StateExtensionsKt.bindParent$default$6fcd5b6b(this.getTitleText(), this.getTitleBar(), this.listViewComponent.getActive(), false, null, 12);
        this.currentView.map((kotlin.jvm.functions.Function1<? super Object, ?>)ScreenshotBrowser$1.INSTANCE).onSetValue((kotlin.jvm.functions.Function1<? super Object, Unit>)new Function1<Boolean, Unit>() {
            final /* synthetic */ ScreenshotBrowser this$0;
            
            ScreenshotBrowser$2() {
                this.this$0 = $receiver;
                super(1);
            }
            
            public final void invoke(final boolean it) {
                this.this$0.setBackButtonVisible(it);
            }
            
            public /* bridge */ Object invoke(final Object p1) {
                this.invoke((boolean)p1);
                return Unit.INSTANCE;
            }
        });
        CollectionsKt.removeFirst((List)this.getWindow().getKeyTypedListeners());
        this.getWindow().onKeyType((Function3<? super UIComponent, ? super Character, ? super Integer, Unit>)new Function3<UIComponent, Character, Integer, Unit>() {
            final /* synthetic */ ScreenshotBrowser this$0;
            
            ScreenshotBrowser$3() {
                this.this$0 = $receiver;
                super(3);
            }
            
            public final void invoke(@NotNull final UIComponent $this$onKeyType, final char typedChar, final int keyCode) {
                Intrinsics.checkNotNullParameter((Object)$this$onKeyType, "$this$onKeyType");
                if (this.this$0.getCurrentView().get() == View.FOCUS && keyCode == UKeyboard.KEY_ESCAPE) {
                    this.this$0.closeFocus();
                }
                else {
                    this.this$0.defaultKeyBehavior(typedChar, keyCode);
                }
            }
            
            public /* bridge */ Object invoke(final Object p1, final Object p2, final Object p3) {
                this.invoke((UIComponent)p1, (char)p2, ((Number)p3).intValue());
                return Unit.INSTANCE;
            }
        });
        if (editPath != null) {
            final ScreenshotMetadataManager screenshotMetadataManager = this.screenshotManager.getScreenshotMetadataManager();
            final File file = editPath.toFile();
            Intrinsics.checkNotNullExpressionValue((Object)file, "editPath.toFile()");
            this.openEditor(new ScreenshotProperties(editPath, screenshotMetadataManager.getMetadata(file)));
        }
    }
    
    public ScreenshotBrowser(final byte b) {
        this((Path)null);
    }
    
    @NotNull
    public final BasicState<ScreenshotProperties> getFocusing() {
        return this.focusing;
    }
    
    @NotNull
    public final BasicState<View> getCurrentView() {
        return this.currentView;
    }
    
    @NotNull
    public final BasicState<FocusType> getFocusType() {
        return this.focusType;
    }
    
    @NotNull
    public final ScreenshotManager getScreenshotManager() {
        return this.screenshotManager;
    }
    
    @NotNull
    public final ScreenshotStateManager getStateManager() {
        return this.stateManager;
    }
    
    @NotNull
    public final ListViewComponent getListViewComponent() {
        return this.listViewComponent;
    }
    
    @NotNull
    public final ScreenshotProviderManager getProviderManager() {
        return this.providerManager;
    }
    
    @NotNull
    public final FocusEditComponent getFocusEditComponent() {
        return this.focusEditComponent;
    }
    
    @NotNull
    public final BasicState<ScreenshotProperties> getMenuDialogOwner() {
        return this.menuDialogOwner;
    }
    
    @NotNull
    public final ScreenshotOptionsDropdown getOptionsDropdown() {
        return this.optionsDropdown;
    }
    
    public final void openFocusView(@NotNull final ScreenshotProperties properties) {
        Intrinsics.checkNotNullParameter((Object)properties, "properties");
        this.changeFocusedComponent(properties);
        this.focusType.set(FocusType.VIEW);
    }
    
    public final void changeFocusedComponent(@NotNull final ScreenshotProperties properties) {
        Intrinsics.checkNotNullParameter((Object)properties, "properties");
        this.focusing.set(properties);
        this.focusListComponent.beginPreview(properties);
    }
    
    public final void displayPropertiesModal(@NotNull final ScreenshotProperties properties) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc_w           "properties"
        //     4: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     7: aload_0         /* this */
        //     8: aload_1         /* properties */
        //     9: invokespecial   gg/essential/gui/screenshot/components/ScreenshotBrowser.generateImageProperties:(Lgg/essential/gui/screenshot/components/ScreenshotProperties;)Ljava/util/List;
        //    12: astore_2        /* metadata */
        //    13: getstatic       gg/essential/util/GuiUtil.INSTANCE:Lgg/essential/util/GuiUtil;
        //    16: new             Lgg/essential/gui/common/modal/PropertiesModal;
        //    19: dup            
        //    20: invokespecial   gg/essential/gui/common/modal/PropertiesModal.<init>:()V
        //    23: checkcast       Lgg/essential/gui/common/modal/EssentialModal;
        //    26: astore          $this$configure$iv
        //    28: aload           $this$configure$iv
        //    30: astore          5
        //    32: aload           5
        //    34: astore          $this$configure_u24lambda_u2d0$iv
        //    36: aload           $this$configure_u24lambda_u2d0$iv
        //    38: checkcast       Lgg/essential/gui/common/modal/PropertiesModal;
        //    41: astore          7
        //    43: astore          10
        //    45: aload           $this$displayPropertiesModal_u24lambda_u2d0
        //    47: ldc_w           "Image Properties"
        //    50: invokevirtual   gg/essential/gui/common/modal/PropertiesModal.setTitleText:(Ljava/lang/String;)V
        //    53: aload_2         /* metadata */
        //    54: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //    59: astore          8
        //    61: aload           8
        //    63: invokeinterface java/util/Iterator.hasNext:()Z
        //    68: ifeq            107
        //    71: aload           8
        //    73: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    78: checkcast       Lkotlin/Pair;
        //    81: astore          pair
        //    83: aload           $this$displayPropertiesModal_u24lambda_u2d0
        //    85: aload           pair
        //    87: invokevirtual   kotlin/Pair.getFirst:()Ljava/lang/Object;
        //    90: checkcast       Ljava/lang/String;
        //    93: aload           pair
        //    95: invokevirtual   kotlin/Pair.getSecond:()Ljava/lang/Object;
        //    98: checkcast       Lgg/essential/elementa/state/State;
        //   101: invokevirtual   gg/essential/gui/common/modal/PropertiesModal.addLine:(Ljava/lang/String;Lgg/essential/elementa/state/State;)V
        //   104: goto            61
        //   107: aload           10
        //   109: aload           5
        //   111: checkcast       Lgg/essential/gui/common/modal/Modal;
        //   114: invokevirtual   gg/essential/util/GuiUtil.pushModal:(Lgg/essential/gui/common/modal/Modal;)Lgg/essential/gui/overlay/Layer;
        //   117: astore_3        /* pushModal */
        //   118: aload_3         /* pushModal */
        //   119: invokevirtual   gg/essential/gui/overlay/Layer.getWindow:()Lgg/essential/elementa/components/Window;
        //   122: invokevirtual   gg/essential/elementa/components/Window.getKeyTypedListeners:()Ljava/util/List;
        //   125: invokeinterface java/util/List.clear:()V
        //   130: aload_3         /* pushModal */
        //   131: invokevirtual   gg/essential/gui/overlay/Layer.getWindow:()Lgg/essential/elementa/components/Window;
        //   134: new             Lgg/essential/gui/screenshot/components/ScreenshotBrowser$displayPropertiesModal$1;
        //   137: dup            
        //   138: aload_3         /* pushModal */
        //   139: invokespecial   gg/essential/gui/screenshot/components/ScreenshotBrowser$displayPropertiesModal$1.<init>:(Lgg/essential/gui/overlay/Layer;)V
        //   142: checkcast       Lkotlin/jvm/functions/Function3;
        //   145: invokevirtual   gg/essential/elementa/components/Window.onKeyType:(Lkotlin/jvm/functions/Function3;)Lgg/essential/elementa/UIComponent;
        //   148: pop            
        //   149: return         
        //    MethodParameters:
        //  Name        Flags  
        //  ----------  -----
        //  properties  
        //    StackMapTable: 00 02 FF 00 3D 00 0B 07 00 02 07 01 26 07 01 68 00 07 01 60 07 01 60 07 01 60 07 01 5D 07 01 6E 00 07 01 58 00 00 2D
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private final List<Pair<String, State<String>>> generateImageProperties(final ScreenshotProperties properties) {
        final List pairList = new ArrayList();
        pairList.add(TuplesKt.to((Object)"Name", (Object)StateExtensionsKt.state(properties.getPath().getFileName().toString())));
        final ClientScreenshotMetadata metadata = properties.getMetadata();
        if (metadata != null) {
            String identifier;
            if ((identifier = metadata.getLocationMetadata().getIdentifier()) == null) {
                identifier = "";
            }
            final String locationIdentifier = identifier;
            switch (ScreenshotBrowser.WhenMappings.$EnumSwitchMapping$0[metadata.getLocationMetadata().getType().ordinal()]) {
                case 1: {
                    pairList.add(TuplesKt.to((Object)"Location", (Object)StateExtensionsKt.state("Unknown")));
                    break;
                }
                case 2: {
                    pairList.add(TuplesKt.to((Object)"Server", (Object)StateExtensionsKt.state(locationIdentifier)));
                    break;
                }
                case 3: {
                    pairList.add(TuplesKt.to((Object)"Menu", (Object)StateExtensionsKt.state(locationIdentifier)));
                    break;
                }
                case 4: {
                    pairList.add(TuplesKt.to((Object)"World", (Object)StateExtensionsKt.state(locationIdentifier)));
                    break;
                }
                case 5: {
                    final UUID host = Essential.getInstance().getConnectionManager().getSpsManager().getHostFromSpsAddress(locationIdentifier);
                    if (host != null) {
                        pairList.add(TuplesKt.to((Object)"Location", (Object)StateExtensionsKt.state("Shared World")));
                        final BasicState hostName = new BasicState((T)"Loading...");
                        pairList.add(TuplesKt.to((Object)"Host", (Object)hostName));
                        Multithreading.runAsync(ScreenshotBrowser::generateImageProperties$lambda-2);
                        break;
                    }
                    pairList.add(TuplesKt.to((Object)"Location", (Object)StateExtensionsKt.state(locationIdentifier)));
                    break;
                }
            }
            final BasicState creatorName = new BasicState((T)"Loading...");
            Multithreading.runAsync(ScreenshotBrowser::generateImageProperties$lambda-4);
            pairList.add(TuplesKt.to((Object)"Creator", (Object)creatorName));
        }
        final DateTime imageTime = HelpersKt.getImageTime(properties, false);
        if (imageTime.getTime() > 0L) {
            final Instant instant = Instant.ofEpochMilli(imageTime.getTime());
            final LocalDate localDate = instant.atZone(ZoneId.systemDefault()).toLocalDate();
            final List list = pairList;
            final String s = "Date";
            final String format = imageTime.format(new SimpleDateFormat("EEEE"));
            Intrinsics.checkNotNullExpressionValue((Object)localDate, "localDate");
            list.add(TuplesKt.to((Object)s, (Object)StateExtensionsKt.state(format + ", " + HelpersKt.formatDate(localDate))));
            final List list2 = pairList;
            final String s2 = "Time";
            Intrinsics.checkNotNullExpressionValue((Object)instant, "instant");
            list2.add(TuplesKt.to((Object)s2, (Object)StateExtensionsKt.state(HelpersKt.formatTime(instant, true))));
        }
        final ClientScreenshotMetadata metadata2 = properties.getMetadata();
        final DateTime editTime = (metadata2 != null) ? metadata2.getEditTime() : null;
        if (editTime != null) {
            final Instant instant2 = Instant.ofEpochMilli(editTime.getTime());
            final LocalDate localDate2 = instant2.atZone(ZoneId.systemDefault()).toLocalDate();
            final List list3 = pairList;
            final String s3 = "Edit Date";
            final String format2 = editTime.format(new SimpleDateFormat("EEEE"));
            Intrinsics.checkNotNullExpressionValue((Object)localDate2, "localDate");
            list3.add(TuplesKt.to((Object)s3, (Object)StateExtensionsKt.state(format2 + ", " + HelpersKt.formatDate(localDate2))));
            final List list4 = pairList;
            final String s4 = "Edit Time";
            Intrinsics.checkNotNullExpressionValue((Object)instant2, "instant");
            list4.add(TuplesKt.to((Object)s4, (Object)StateExtensionsKt.state(HelpersKt.formatTime(instant2, true))));
        }
        final BasicState dimension = new BasicState((T)"Loading...");
        Multithreading.runAsync(ScreenshotBrowser::generateImageProperties$lambda-6);
        pairList.add(TuplesKt.to((Object)"Dimensions", (Object)dimension));
        return pairList;
    }
    
    public final void openEditor(@NotNull final ScreenshotProperties properties) {
        Intrinsics.checkNotNullParameter((Object)properties, "properties");
        this.stateToRestore = this.currentView.get();
        this.focusing.set(properties);
        this.focusType.set(FocusType.EDIT);
    }
    
    public final void openEditor() {
        final ScreenshotProperties value = this.focusing.get();
        Intrinsics.checkNotNull((Object)value);
        this.openEditor(value);
    }
    
    public final void closeFocus() {
        if (this.focusType.get() == FocusType.EDIT) {
            this.focusEditComponent.onClose();
        }
        else {
            this.focusListComponent.onClose();
        }
        if (this.stateToRestore == View.LIST) {
            this.focusing.set((kotlin.jvm.functions.Function1<? super Object, ?>)ScreenshotBrowser$closeFocus.ScreenshotBrowser$closeFocus$1.INSTANCE);
        }
        else {
            this.focusType.set(FocusType.VIEW);
            this.stateToRestore = View.LIST;
        }
    }
    
    @Override
    public void onScreenClose() {
        super.onScreenClose();
        this.providerManager.cleanup();
        for (final Function0 closeOperation : this.closeOperations) {
            closeOperation.invoke();
        }
    }
    
    public final void externalDelete(@NotNull final Set<? extends Path> paths) {
        Intrinsics.checkNotNullParameter((Object)paths, "paths");
        this.providerManager.externalDelete(paths);
        this.listViewComponent.reload();
        final ScreenshotProperties screenshotProperties = this.focusing.get();
        if (screenshotProperties == null) {
            return;
        }
        final ScreenshotProperties focused = screenshotProperties;
        if (paths.contains(focused.getPath())) {
            this.stateToRestore = View.LIST;
            this.closeFocus();
        }
        else if (this.focusType.get() == FocusType.VIEW) {
            this.openFocusView(focused);
        }
    }
    
    @Override
    public void updateGuiScale() {
        this.setNewGuiScale(GuiUtil.INSTANCE.getGuiScale());
        super.updateGuiScale();
    }
    
    public void resize(@NotNull final MinecraftClient mcIn, final int w, final int h) {
        Intrinsics.checkNotNullParameter((Object)mcIn, "mcIn");
        this.setNewGuiScale(GuiUtil.INSTANCE.getGuiScale());
        super.resize(mcIn, w, h);
    }
    
    public final void editCallback(@NotNull final Path newScreenshot, final boolean openFocusView) {
        Intrinsics.checkNotNullParameter((Object)newScreenshot, "newScreenshot");
        this.providerManager.reloadItems();
        this.listViewComponent.reload();
        final ScreenshotProperties screenshotProperties = this.focusing.get();
        if (screenshotProperties != null) {
            final ScreenshotProperties it = screenshotProperties;
            this.focusListComponent.beginPreview(it);
        }
        if (openFocusView) {
            final ScreenshotProperties properties = this.providerManager.getPropertyMap().get(newScreenshot);
            if (properties != null) {
                if (this.focusType.get() == FocusType.EDIT) {
                    this.closeFocus();
                }
                this.openFocusView(properties);
            }
        }
    }
    
    public final void closeOperation(@NotNull final Function0<Unit> function) {
        Intrinsics.checkNotNullParameter((Object)function, "function");
        this.closeOperations.add(function);
    }
    
    private static final void generateImageProperties$lambda-2$lambda-1(final BasicState $hostName, final String it) {
        Intrinsics.checkNotNullParameter((Object)$hostName, "$hostName");
        Intrinsics.checkNotNullExpressionValue((Object)it, "it");
        $hostName.set(it);
    }
    
    private static final void generateImageProperties$lambda-2(final UUID $host, final BasicState $hostName) {
        Intrinsics.checkNotNullParameter((Object)$hostName, "$hostName");
        final CompletableFuture name = MojangAPI.INSTANCE.getName($host);
        if (name != null) {
            name.thenAcceptAsync((Consumer)ScreenshotBrowser::generateImageProperties$lambda-2$lambda-1, ExtensionsKt.getExecutor(UMinecraft.getMinecraft()));
        }
    }
    
    private static final void generateImageProperties$lambda-4$lambda-3(final BasicState $creatorName, final String it) {
        Intrinsics.checkNotNullParameter((Object)$creatorName, "$creatorName");
        Intrinsics.checkNotNullExpressionValue((Object)it, "it");
        $creatorName.set(it);
    }
    
    private static final void generateImageProperties$lambda-4(final ClientScreenshotMetadata $metadata, final BasicState $creatorName) {
        Intrinsics.checkNotNullParameter((Object)$creatorName, "$creatorName");
        final CompletableFuture name = MojangAPI.INSTANCE.getName($metadata.getAuthorId());
        if (name != null) {
            name.thenAcceptAsync((Consumer)ScreenshotBrowser::generateImageProperties$lambda-4$lambda-3, ExtensionsKt.getExecutor(UMinecraft.getMinecraft()));
        }
    }
    
    private static final void generateImageProperties$lambda-6$lambda-5(final BasicState $dimension, final String $text) {
        Intrinsics.checkNotNullParameter((Object)$dimension, "$dimension");
        Intrinsics.checkNotNullParameter((Object)$text, "$text");
        $dimension.set($text);
    }
    
    private static final void generateImageProperties$lambda-6(final ScreenshotBrowser this$0, final ScreenshotProperties $properties, final BasicState $dimension) {
        Intrinsics.checkNotNullParameter((Object)this$0, "this$0");
        Intrinsics.checkNotNullParameter((Object)$properties, "$properties");
        Intrinsics.checkNotNullParameter((Object)$dimension, "$dimension");
        final NativeImageReader nativeImageReader = this$0.screenshotManager.getNativeImageReader();
        final Path path = $properties.getPath();
        final UnpooledByteBufAllocator default1 = UnpooledByteBufAllocator.DEFAULT;
        Intrinsics.checkNotNullExpressionValue((Object)default1, "DEFAULT");
        final ImageData image = nativeImageReader.getImageData(path, (ByteBufAllocator)default1);
        final String text = image.getWidth() + "x" + image.getHeight() + " pixels";
        image.release();
        ExtensionsKt.getExecutor(UMinecraft.getMinecraft()).execute(ScreenshotBrowser::generateImageProperties$lambda-6$lambda-5);
    }
    
    public ScreenshotBrowser() {
        this((byte)0);
    }
    
    public static final /* synthetic */ DateFormat access$getDATE_FORMAT$cp() {
        return ScreenshotBrowser.DATE_FORMAT;
    }
    
    static {
        Companion = new Companion((byte)0);
        DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd_HH.mm.ss");
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                       \u0000\u0014
                                                       \u0002\u0018\u0002
                                                       \u0002\u0010\u0000
                                                       \u0002\b\u0002
                                                       \u0002\u0018\u0002
                                                       \u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b
                                                       \u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007""" }, d2 = { "Lgg/essential/gui/screenshot/components/ScreenshotBrowser$Companion;", "", "()V", "DATE_FORMAT", "Ljava/text/DateFormat;", "getDATE_FORMAT", "()Ljava/text/DateFormat;", "essential" })
    public static final class Companion
    {
        private Companion() {
            super();
        }
        
        @NotNull
        public final DateFormat getDATE_FORMAT() {
            return ScreenshotBrowser.access$getDATE_FORMAT$cp();
        }
        
        public Companion(final byte b) {
            this();
        }
    }
}
