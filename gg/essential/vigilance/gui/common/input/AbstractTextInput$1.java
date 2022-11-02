package gg.essential.vigilance.gui.common.input;

import kotlin.jvm.functions.*;
import gg.essential.elementa.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import gg.essential.universal.*;
import gg.essential.vigilance.impl.*;
import kotlin.collections.*;
import java.util.*;
import kotlin.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { "\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007" }, d2 = { "<anonymous>", "", "Lgg/essential/elementa/UIComponent;", "typedChar", "", "keyCode", "", "invoke" })
static final class AbstractTextInput$1 extends Lambda implements Function3<UIComponent, Character, Integer, Unit> {
    final /* synthetic */ AbstractTextInput this$0;
    
    AbstractTextInput$1(final AbstractTextInput $receiver) {
        this.this$0 = $receiver;
        super(3);
    }
    
    public final void invoke(@NotNull final UIComponent $this$onKeyType, final char typedChar, final int keyCode) {
        Intrinsics.checkNotNullParameter((Object)$this$onKeyType, "$this$onKeyType");
        if (!this.this$0.getActive()) {
            return;
        }
        if (keyCode == UKeyboard.KEY_ESCAPE) {
            $this$onKeyType.releaseWindowFocus();
        }
        else if (UKeyboard.isKeyComboCtrlA(keyCode)) {
            this.this$0.selectAll();
        }
        else if (UKeyboard.isKeyComboCtrlC(keyCode) && this.this$0.hasSelection()) {
            this.this$0.copySelection();
        }
        else if (UKeyboard.isKeyComboCtrlX(keyCode) && this.this$0.hasSelection()) {
            this.this$0.copySelection();
            this.this$0.deleteSelection();
        }
        else if (UKeyboard.isKeyComboCtrlV(keyCode)) {
            this.this$0.commitTextAddition(UDesktop.getClipboardString());
        }
        else if (UKeyboard.isKeyComboCtrlZ(keyCode)) {
            if (this.this$0.getUndoStack().isEmpty()) {
                return;
            }
            final AbstractTextInput$TextOperation operationToUndo = this.this$0.getUndoStack().pop();
            operationToUndo.undo();
            this.this$0.getRedoStack().push(operationToUndo);
        }
        else if (UKeyboard.isKeyComboCtrlShiftZ(keyCode) || UKeyboard.isKeyComboCtrlY(keyCode)) {
            if (this.this$0.getRedoStack().isEmpty()) {
                return;
            }
            final AbstractTextInput$TextOperation operationToRedo = this.this$0.getRedoStack().pop();
            operationToRedo.redo();
            this.this$0.getUndoStack().push(operationToRedo);
        }
        else if (Platform.Companion.getPlatform$Vigilance().isAllowedInChat(typedChar)) {
            this.this$0.commitTextAddition(String.valueOf(typedChar));
        }
        else if (keyCode == UKeyboard.KEY_LEFT) {
            final boolean holdingShift = UKeyboard.isShiftKeyDown();
            final boolean holdingCtrl = UKeyboard.isCtrlKeyDown();
            final LinePosition newCursorPosition = holdingCtrl ? this.this$0.getNearestWordBoundary(this.this$0.getCursor(), AbstractTextInput$Direction.Left) : (this.this$0.hasSelection() ? (holdingShift ? this.this$0.getCursor().offsetColumn(-1) : this.this$0.selectionStart()) : this.this$0.getCursor().offsetColumn(-1));
            if (!holdingShift) {
                AbstractTextInput.access$setCursorPosition(this.this$0, newCursorPosition);
                return;
            }
            this.this$0.setCursor(newCursorPosition);
            this.this$0.setCursorNeedsRefocus(true);
        }
        else if (keyCode == UKeyboard.KEY_RIGHT) {
            final boolean holdingShift = UKeyboard.isShiftKeyDown();
            final boolean holdingCtrl = UKeyboard.isCtrlKeyDown();
            final LinePosition newCursorPosition = holdingCtrl ? this.this$0.getNearestWordBoundary(this.this$0.getCursor(), AbstractTextInput$Direction.Right) : (this.this$0.hasSelection() ? (holdingShift ? this.this$0.getCursor().offsetColumn(1) : this.this$0.selectionEnd()) : this.this$0.getCursor().offsetColumn(1));
            if (!holdingShift) {
                AbstractTextInput.access$setCursorPosition(this.this$0, newCursorPosition);
                return;
            }
            this.this$0.setCursor(newCursorPosition);
            this.this$0.setCursorNeedsRefocus(true);
        }
        else if (keyCode == UKeyboard.KEY_UP) {
            Comparable<LinePosition> screenPosToVisualPos;
            if (this.this$0.getCursor().getLine() == 0) {
                screenPosToVisualPos = this.this$0.new LinePosition(0, 0, true);
            }
            else {
                final Pair<Float, Float> screenPos = this.this$0.getCursor().toScreenPos();
                final float currX = ((Number)screenPos.component1()).floatValue();
                final float currY = ((Number)screenPos.component2()).floatValue();
                screenPosToVisualPos = this.this$0.screenPosToVisualPos(currX, currY - this.this$0.getLineHeight());
            }
            final LinePosition newVisualPos = (LinePosition)screenPosToVisualPos;
            if (UKeyboard.isShiftKeyDown()) {
                this.this$0.setCursor(newVisualPos);
                this.this$0.setCursorNeedsRefocus(true);
            }
            else {
                AbstractTextInput.access$setCursorPosition(this.this$0, newVisualPos);
            }
        }
        else if (keyCode == UKeyboard.KEY_DOWN) {
            Comparable<LinePosition> screenPosToVisualPos2;
            if (this.this$0.getCursor().getLine() == CollectionsKt.getLastIndex((List)this.this$0.getVisualLines())) {
                screenPosToVisualPos2 = this.this$0.new LinePosition(CollectionsKt.getLastIndex((List)this.this$0.getVisualLines()), ((Line)CollectionsKt.last((List)this.this$0.getVisualLines())).getLength(), true);
            }
            else {
                final Pair<Float, Float> screenPos2 = this.this$0.getCursor().toScreenPos();
                final float currX = ((Number)screenPos2.component1()).floatValue();
                final float currY = ((Number)screenPos2.component2()).floatValue();
                screenPosToVisualPos2 = this.this$0.screenPosToVisualPos(currX, currY + this.this$0.getLineHeight());
            }
            final LinePosition newVisualPos = (LinePosition)screenPosToVisualPos2;
            if (UKeyboard.isShiftKeyDown()) {
                this.this$0.setCursor(newVisualPos);
                this.this$0.setCursorNeedsRefocus(true);
            }
            else {
                AbstractTextInput.access$setCursorPosition(this.this$0, newVisualPos);
            }
        }
        else if (keyCode == UKeyboard.KEY_BACKSPACE) {
            if (this.this$0.hasSelection()) {
                this.this$0.deleteSelection();
            }
            else if (!this.this$0.getCursor().isAtAbsoluteStart()) {
                final LinePosition startPos = UKeyboard.isCtrlKeyDown() ? this.this$0.getNearestWordBoundary(this.this$0.getCursor(), AbstractTextInput$Direction.Left) : this.this$0.getCursor().offsetColumn(-1).toTextualPos();
                final LinePosition endPos = this.this$0.getCursor().toTextualPos();
                this.this$0.commitTextRemoval(startPos, endPos, false);
            }
        }
        else if (keyCode == UKeyboard.KEY_DELETE) {
            if (this.this$0.hasSelection()) {
                this.this$0.deleteSelection();
            }
            else if (!this.this$0.getCursor().isAtAbsoluteEnd()) {
                final LinePosition startPos = this.this$0.getCursor().toTextualPos();
                final LinePosition endPos = UKeyboard.isCtrlKeyDown() ? this.this$0.getNearestWordBoundary(this.this$0.getCursor(), AbstractTextInput$Direction.Right) : this.this$0.getCursor().offsetColumn(1).toTextualPos();
                this.this$0.commitTextRemoval(startPos, endPos, false);
            }
        }
        else if (keyCode == UKeyboard.KEY_HOME) {
            if (UKeyboard.isShiftKeyDown()) {
                this.this$0.setCursor(this.this$0.getCursor().withColumn(0));
                this.this$0.setCursorNeedsRefocus(true);
            }
            else {
                AbstractTextInput.access$setCursorPosition(this.this$0, this.this$0.getCursor().withColumn(0));
            }
        }
        else if (keyCode == UKeyboard.KEY_END) {
            final Comparable<LinePosition> withColumn = this.this$0.getCursor().withColumn(((Line)this.this$0.getVisualLines().get(this.this$0.getCursor().getLine())).getLength());
            final AbstractTextInput this$0 = this.this$0;
            final LinePosition it = (LinePosition)withColumn;
            final int n = 0;
            if (UKeyboard.isShiftKeyDown()) {
                this$0.setCursor(it);
                this$0.setCursorNeedsRefocus(true);
            }
            else {
                AbstractTextInput.access$setCursorPosition(this$0, it);
            }
        }
        else if (keyCode == UKeyboard.KEY_ENTER) {
            this.this$0.onEnterPressed();
        }
    }
    
    public /* bridge */ Object invoke(final Object p1, final Object p2, final Object p3) {
        this.invoke((UIComponent)p1, (char)p2, ((Number)p3).intValue());
        return Unit.INSTANCE;
    }
}