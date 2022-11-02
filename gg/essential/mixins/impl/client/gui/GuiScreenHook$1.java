package gg.essential.mixins.impl.client.gui;

import net.minecraft.client.gui.widget.*;
import java.util.*;

class GuiScreenHook$1 extends AbstractList<ClickableWidget> {
    final /* synthetic */ List val$buttonList;
    final /* synthetic */ List val$children;
    final /* synthetic */ List val$drawableList;
    final /* synthetic */ List val$selectableList;
    
    GuiScreenHook$1(final List val$buttonList, final List val$children, final List val$drawableList, final List val$selectableList) {
        this.val$buttonList = val$buttonList;
        this.val$children = val$children;
        this.val$drawableList = val$drawableList;
        this.val$selectableList = val$selectableList;
        super();
    }
    
    @Override
    public ClickableWidget get(final int i) {
        return this.val$buttonList.get(i);
    }
    
    @Override
    public int size() {
        return this.val$buttonList.size();
    }
    
    @Override
    public ClickableWidget set(final int index, final ClickableWidget element) {
        final ClickableWidget removed = this.remove(index);
        this.add(index, element);
        return removed;
    }
    
    @Override
    public void add(final int index, final ClickableWidget element) {
        int childrenIndex = (index < this.size()) ? this.val$children.indexOf(this.val$buttonList.get(index)) : 0;
        if (childrenIndex == -1) {
            childrenIndex = 0;
        }
        int drawableIndex = (index < this.size()) ? this.val$drawableList.indexOf(this.val$buttonList.get(index)) : 0;
        if (drawableIndex == -1) {
            drawableIndex = 0;
        }
        int selectableIndex = (index < this.size()) ? this.val$selectableList.indexOf(this.val$buttonList.get(index)) : 0;
        if (selectableIndex == -1) {
            selectableIndex = 0;
        }
        this.val$buttonList.add(index, element);
        this.val$children.add(childrenIndex, element);
        this.val$drawableList.add(drawableIndex, element);
        this.val$selectableList.add(selectableIndex, element);
    }
    
    @Override
    public ClickableWidget remove(final int index) {
        final ClickableWidget removed = this.val$buttonList.remove(index);
        if (removed != null) {
            this.val$children.remove(removed);
            this.val$drawableList.remove(removed);
            this.val$selectableList.remove(removed);
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
}