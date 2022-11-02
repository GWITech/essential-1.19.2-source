package gg.essential.mixins.impl.client.gui;

import gg.essential.mixins.impl.*;
import net.minecraft.client.gui.screen.*;
import gg.essential.mixins.transformers.client.gui.*;
import net.minecraft.client.gui.widget.*;
import kotlin.collections.*;
import java.util.*;
import gg.essential.*;
import net.minecraft.client.gui.*;
import gg.essential.universal.*;
import gg.essential.event.gui.*;

public class GuiScreenHook extends ClassHook<Screen>
{
    public GuiScreenHook(final Screen instance) {
        super(instance);
    }
    
    public void setWorldAndResolution() {
        final List<Drawable> drawableList = ((GuiScreenAccessor)this.instance).getDrawables();
        final List<Selectable> selectableList = ((GuiScreenAccessor)this.instance).getSelectables();
        final List<ClickableWidget> buttonList = (List<ClickableWidget>)CollectionsKt.filterIsInstanceTo((Iterable)selectableList, (Collection)new ArrayList(), (Class)ClickableWidget.class);
        final List<Element> children = ((GuiScreenAccessor)this.instance).essential$getChildren();
        final InitGuiEvent event = new InitGuiEvent((Screen)this.instance, new AbstractList<ClickableWidget>() {
            final /* synthetic */ List val$buttonList;
            final /* synthetic */ List val$children;
            final /* synthetic */ List val$drawableList;
            final /* synthetic */ List val$selectableList;
            
            GuiScreenHook$1() {
                super();
            }
            
            @Override
            public ClickableWidget get(final int i) {
                return buttonList.get(i);
            }
            
            @Override
            public int size() {
                return buttonList.size();
            }
            
            @Override
            public ClickableWidget set(final int index, final ClickableWidget element) {
                final ClickableWidget removed = this.remove(index);
                this.add(index, element);
                return removed;
            }
            
            @Override
            public void add(final int index, final ClickableWidget element) {
                int childrenIndex = (index < this.size()) ? children.indexOf(buttonList.get(index)) : 0;
                if (childrenIndex == -1) {
                    childrenIndex = 0;
                }
                int drawableIndex = (index < this.size()) ? drawableList.indexOf(buttonList.get(index)) : 0;
                if (drawableIndex == -1) {
                    drawableIndex = 0;
                }
                int selectableIndex = (index < this.size()) ? selectableList.indexOf(buttonList.get(index)) : 0;
                if (selectableIndex == -1) {
                    selectableIndex = 0;
                }
                buttonList.add(index, element);
                children.add(childrenIndex, element);
                drawableList.add(drawableIndex, element);
                selectableList.add(selectableIndex, element);
            }
            
            @Override
            public ClickableWidget remove(final int index) {
                final ClickableWidget removed = buttonList.remove(index);
                if (removed != null) {
                    children.remove(removed);
                    drawableList.remove(removed);
                    selectableList.remove(removed);
                }
                return removed;
            }
            
            @Override
            public /* bridge */ Object remove(final int index) {
                return this.remove(index);
            }
            
            @Override
            public /* bridge */ void add(final int index, final Object o) {
                this.add(index, (ClickableWidget)o);
            }
            
            @Override
            public /* bridge */ Object set(final int index, final Object o) {
                return this.set(index, (ClickableWidget)o);
            }
            
            @Override
            public /* bridge */ Object get(final int i) {
                return this.get(i);
            }
        });
        Essential.EVENT_BUS.post(event);
    }
    
    public GuiDrawScreenEvent drawScreen$158f4203(final UMatrixStack matrixStack, final int mouseX, final int mouseY, final boolean post) {
        final GuiDrawScreenEvent event = new GuiDrawScreenEvent((Screen)this.instance, matrixStack, mouseX, mouseY, post);
        Essential.EVENT_BUS.post(event);
        return event;
    }
}
