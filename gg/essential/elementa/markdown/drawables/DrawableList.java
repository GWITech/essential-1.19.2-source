package gg.essential.elementa.markdown.drawables;

import kotlin.jvm.internal.markers.*;
import org.jetbrains.annotations.*;
import gg.essential.elementa.markdown.selection.*;
import kotlin.*;
import kotlin.collections.*;
import gg.essential.universal.*;
import gg.essential.elementa.markdown.*;
import java.util.function.*;
import java.util.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010*\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00010\u0002:\u00019B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002¢\u0006\u0002\u0010\u0006J\u0011\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0001H\u0096\u0002J\u0016\u0010\u0011\u001a\u00020\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u0013H\u0016J,\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u000bH\u0016J\f\u0010\u001b\u001a\u0006\u0012\u0002\b\u00030\u0015H\u0016J\f\u0010\u001c\u001a\u0006\u0012\u0002\b\u00030\u0015H\u0016J\u0018\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0016J\u0011\u0010#\u001a\u00020\u00012\u0006\u0010$\u001a\u00020\u000bH\u0096\u0002J\u0010\u0010%\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0001H\u0016J\b\u0010&\u001a\u00020\u000fH\u0016J\u000f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00010(H\u0096\u0002J\u0010\u0010)\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0001H\u0016J \u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u00172\u0006\u0010-\u001a\u00020\u00172\u0006\u0010.\u001a\u00020\u0017H\u0014J\u000e\u0010/\u001a\b\u0012\u0004\u0012\u00020\u000100H\u0016J\u0016\u0010/\u001a\b\u0012\u0004\u0012\u00020\u0001002\u0006\u0010$\u001a\u00020\u000bH\u0016J\u0010\u00101\u001a\u0002022\u0006\u00103\u001a\u00020\u000fH\u0016J\u0014\u00104\u001a\u00020\u001e2\f\u00105\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002J\u001e\u00106\u001a\b\u0012\u0004\u0012\u00020\u00010\u00022\u0006\u00107\u001a\u00020\u000b2\u0006\u00108\u001a\u00020\u000bH\u0016R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002X\u0082.¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006:" }, d2 = { "Lgg/essential/elementa/markdown/drawables/DrawableList;", "Lgg/essential/elementa/markdown/drawables/Drawable;", "", "md", "Lgg/essential/elementa/markdown/MarkdownComponent;", "drawables", "(Lgg/essential/elementa/markdown/MarkdownComponent;Ljava/util/List;)V", "children", "getChildren", "()Ljava/util/List;", "size", "", "getSize", "()I", "contains", "", "element", "containsAll", "elements", "", "cursorAt", "Lgg/essential/elementa/markdown/selection/Cursor;", "mouseX", "", "mouseY", "dragged", "mouseButton", "cursorAtEnd", "cursorAtStart", "draw", "", "matrixStack", "Lgg/essential/universal/UMatrixStack;", "state", "Lgg/essential/elementa/markdown/DrawState;", "get", "index", "indexOf", "isEmpty", "iterator", "", "lastIndexOf", "layoutImpl", "Lgg/essential/elementa/markdown/drawables/Drawable$Layout;", "x", "y", "width", "listIterator", "", "selectedText", "", "asMarkdown", "setDrawables", "newDrawables", "subList", "fromIndex", "toIndex", "Direction", "Elementa" })
public final class DrawableList extends Drawable implements List<Drawable>, KMappedMarker
{
    private List<? extends Drawable> drawables;
    
    public DrawableList(@NotNull final MarkdownComponent md, @NotNull final List<? extends Drawable> drawables) {
        Intrinsics.checkNotNullParameter((Object)md, "md");
        Intrinsics.checkNotNullParameter((Object)drawables, "drawables");
        super(md);
        this.setDrawables(drawables);
    }
    
    @NotNull
    @Override
    public List<Drawable> getChildren() {
        List<? extends Drawable> drawables;
        if ((drawables = this.drawables) == null) {
            Intrinsics.throwUninitializedPropertyAccessException("drawables");
            drawables = null;
        }
        return (List<Drawable>)drawables;
    }
    
    public final void setDrawables(@NotNull final List<? extends Drawable> newDrawables) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "newDrawables"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_0         /* this */
        //     7: aload_1         /* newDrawables */
        //     8: putfield        gg/essential/elementa/markdown/drawables/DrawableList.drawables:Ljava/util/List;
        //    11: aload_0         /* this */
        //    12: getfield        gg/essential/elementa/markdown/drawables/DrawableList.drawables:Ljava/util/List;
        //    15: dup            
        //    16: ifnonnull       26
        //    19: pop            
        //    20: ldc             "drawables"
        //    22: invokestatic    kotlin/jvm/internal/Intrinsics.throwUninitializedPropertyAccessException:(Ljava/lang/String;)V
        //    25: aconst_null    
        //    26: checkcast       Ljava/lang/Iterable;
        //    29: astore_2        /* $this$forEach$iv */
        //    30: iconst_0       
        //    31: istore_3        /* $i$f$forEach */
        //    32: aload_2         /* $this$forEach$iv */
        //    33: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //    38: astore          4
        //    40: aload           4
        //    42: invokeinterface java/util/Iterator.hasNext:()Z
        //    47: ifeq            81
        //    50: aload           4
        //    52: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    57: astore          element$iv
        //    59: aload           element$iv
        //    61: checkcast       Lgg/essential/elementa/markdown/drawables/Drawable;
        //    64: astore          it
        //    66: iconst_0       
        //    67: istore          $i$a$-forEach-DrawableList$setDrawables$1
        //    69: aload           it
        //    71: aload_0         /* this */
        //    72: checkcast       Lgg/essential/elementa/markdown/drawables/Drawable;
        //    75: invokevirtual   gg/essential/elementa/markdown/drawables/Drawable.setParent:(Lgg/essential/elementa/markdown/drawables/Drawable;)V
        //    78: goto            40
        //    81: nop            
        //    82: getstatic       gg/essential/elementa/markdown/drawables/Drawable.Companion:Lgg/essential/elementa/markdown/drawables/Drawable$Companion;
        //    85: aload_0         /* this */
        //    86: invokevirtual   gg/essential/elementa/markdown/drawables/Drawable$Companion.trim:(Lgg/essential/elementa/markdown/drawables/DrawableList;)V
        //    89: aload_0         /* this */
        //    90: checkcast       Ljava/lang/Iterable;
        //    93: astore_2        /* $this$forEachIndexed$iv */
        //    94: iconst_0       
        //    95: istore_3        /* $i$f$forEachIndexed */
        //    96: iconst_0       
        //    97: istore          index$iv
        //    99: aload_2         /* $this$forEachIndexed$iv */
        //   100: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   105: astore          5
        //   107: aload           5
        //   109: invokeinterface java/util/Iterator.hasNext:()Z
        //   114: ifeq            202
        //   117: aload           5
        //   119: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   124: astore          item$iv
        //   126: iload           index$iv
        //   128: iinc            index$iv, 1
        //   131: istore          7
        //   133: iload           7
        //   135: ifge            141
        //   138: invokestatic    kotlin/collections/CollectionsKt.throwIndexOverflow:()V
        //   141: iload           7
        //   143: aload           item$iv
        //   145: checkcast       Lgg/essential/elementa/markdown/drawables/Drawable;
        //   148: astore          8
        //   150: istore          index
        //   152: iconst_0       
        //   153: istore          $i$a$-forEachIndexed-DrawableList$setDrawables$2
        //   155: iload           index
        //   157: ifle            173
        //   160: aload           drawable
        //   162: aload_0         /* this */
        //   163: iload           index
        //   165: iconst_1       
        //   166: isub           
        //   167: invokevirtual   gg/essential/elementa/markdown/drawables/DrawableList.get:(I)Lgg/essential/elementa/markdown/drawables/Drawable;
        //   170: invokevirtual   gg/essential/elementa/markdown/drawables/Drawable.setPrevious:(Lgg/essential/elementa/markdown/drawables/Drawable;)V
        //   173: iload           index
        //   175: aload_0         /* this */
        //   176: checkcast       Ljava/util/List;
        //   179: invokestatic    kotlin/collections/CollectionsKt.getLastIndex:(Ljava/util/List;)I
        //   182: if_icmpeq       198
        //   185: aload           drawable
        //   187: aload_0         /* this */
        //   188: iload           index
        //   190: iconst_1       
        //   191: iadd           
        //   192: invokevirtual   gg/essential/elementa/markdown/drawables/DrawableList.get:(I)Lgg/essential/elementa/markdown/drawables/Drawable;
        //   195: invokevirtual   gg/essential/elementa/markdown/drawables/Drawable.setNext:(Lgg/essential/elementa/markdown/drawables/Drawable;)V
        //   198: nop            
        //   199: goto            107
        //   202: nop            
        //   203: return         
        //    Signature:
        //  (Ljava/util/List<+Lgg/essential/elementa/markdown/drawables/Drawable;>;)V
        //    MethodParameters:
        //  Name          Flags  
        //  ------------  -----
        //  newDrawables  
        //    StackMapTable: 00 08 5A 07 00 07 FE 00 0D 07 00 6E 01 07 00 73 28 FF 00 19 00 06 07 00 02 07 00 07 07 00 6E 01 01 07 00 73 00 00 FD 00 21 07 00 91 01 FE 00 1F 07 00 05 01 01 18 FF 00 03 00 06 07 00 02 07 00 07 07 00 6E 01 01 07 00 73 00 00
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @NotNull
    @Override
    protected Layout layoutImpl(final float x, final float y, final float width) {
        float currY = 0.0f;
        currY = y;
        final Iterable $this$forEach$iv = this;
        final int $i$f$forEach = 0;
        for (final Object element$iv : $this$forEach$iv) {
            final Drawable it = (Drawable)element$iv;
            final int n = 0;
            currY += it.layout(x, currY, width).getHeight();
        }
        final float height = currY - y;
        return new Layout(x, y, width, height, null, 16, null);
    }
    
    @NotNull
    @Override
    public Cursor<?> cursorAt(final float mouseX, final float mouseY, final boolean dragged, final int mouseButton) {
        Drawable closestDrawable = null;
        float closestDistance = Float.MAX_VALUE;
        DrawableList.Direction direction = null;
        List<? extends Drawable> drawables;
        if ((drawables = this.drawables) == null) {
            Intrinsics.throwUninitializedPropertyAccessException("drawables");
            drawables = null;
        }
        for (final Drawable drawable : drawables) {
            if (drawable.isHovered(mouseX, mouseY)) {
                return drawable.cursorAt(mouseX, mouseY, dragged, mouseButton);
            }
            if (mouseY < drawable.getY()) {
                if (drawable.getY() - mouseY >= closestDistance) {
                    continue;
                }
                direction = DrawableList.Direction.Up;
                closestDistance = drawable.getY() - mouseY;
                closestDrawable = drawable;
            }
            else {
                if (mouseY <= drawable.getY() + drawable.getHeight()) {
                    closestDistance = 0.0f;
                    closestDrawable = drawable;
                    direction = ((mouseX < drawable.getX()) ? DrawableList.Direction.Left : DrawableList.Direction.Right);
                    break;
                }
                if (drawable.getY() + drawable.getHeight() - mouseY >= closestDistance) {
                    continue;
                }
                direction = DrawableList.Direction.Down;
                closestDistance = mouseY - (drawable.getY() + drawable.getHeight());
                closestDrawable = drawable;
            }
        }
        if (closestDrawable == null || closestDistance == Float.MAX_VALUE || direction == null) {
            throw (Throwable)new NotImplementedError((String)null, 1, (DefaultConstructorMarker)null);
        }
        return switch (DrawableList.WhenMappings.$EnumSwitchMapping$0[direction.ordinal()]) {
            case 1 -> closestDrawable.cursorAtStart();
            case 2 -> closestDrawable.cursorAtEnd();
            case 3,  4 -> closestDrawable.cursorAt(mouseX, mouseY, dragged, mouseButton);
            default -> throw new NoWhenBranchMatchedException();
        };
    }
    
    @NotNull
    @Override
    public Cursor<?> cursorAtStart() {
        List<? extends Drawable> drawables;
        if ((drawables = this.drawables) == null) {
            Intrinsics.throwUninitializedPropertyAccessException("drawables");
            drawables = null;
        }
        return ((Drawable)CollectionsKt.first((List)drawables)).cursorAtStart();
    }
    
    @NotNull
    @Override
    public Cursor<?> cursorAtEnd() {
        List<? extends Drawable> drawables;
        if ((drawables = this.drawables) == null) {
            Intrinsics.throwUninitializedPropertyAccessException("drawables");
            drawables = null;
        }
        return ((Drawable)CollectionsKt.last((List)drawables)).cursorAtEnd();
    }
    
    @Override
    public void draw(@NotNull final UMatrixStack matrixStack, @NotNull final DrawState state) {
        Intrinsics.checkNotNullParameter((Object)matrixStack, "matrixStack");
        Intrinsics.checkNotNullParameter((Object)state, "state");
        final Iterable $this$forEach$iv = this;
        final int $i$f$forEach = 0;
        for (final Object element$iv : $this$forEach$iv) {
            final Drawable it = (Drawable)element$iv;
            final int n = 0;
            it.drawCompat(matrixStack, state);
        }
    }
    
    @NotNull
    @Override
    public String selectedText(final boolean asMarkdown) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: checkcast       Ljava/lang/Iterable;
        //     4: astore_2        /* $this$filter$iv */
        //     5: iconst_0       
        //     6: istore_3        /* $i$f$filter */
        //     7: aload_2         /* $this$filter$iv */
        //     8: astore          4
        //    10: new             Ljava/util/ArrayList;
        //    13: dup            
        //    14: invokespecial   java/util/ArrayList.<init>:()V
        //    17: checkcast       Ljava/util/Collection;
        //    20: astore          destination$iv$iv
        //    22: iconst_0       
        //    23: istore          $i$f$filterTo
        //    25: aload           $this$filterTo$iv$iv
        //    27: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //    32: astore          7
        //    34: aload           7
        //    36: invokeinterface java/util/Iterator.hasNext:()Z
        //    41: ifeq            84
        //    44: aload           7
        //    46: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    51: astore          element$iv$iv
        //    53: aload           element$iv$iv
        //    55: checkcast       Lgg/essential/elementa/markdown/drawables/Drawable;
        //    58: astore          it
        //    60: iconst_0       
        //    61: istore          $i$a$-filter-DrawableList$selectedText$1
        //    63: aload           it
        //    65: invokevirtual   gg/essential/elementa/markdown/drawables/Drawable.hasSelectedText:()Z
        //    68: ifeq            34
        //    71: aload           destination$iv$iv
        //    73: aload           element$iv$iv
        //    75: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //    80: pop            
        //    81: goto            34
        //    84: aload           destination$iv$iv
        //    86: checkcast       Ljava/util/List;
        //    89: nop            
        //    90: checkcast       Ljava/lang/Iterable;
        //    93: ldc_w           "\n\n"
        //    96: checkcast       Ljava/lang/CharSequence;
        //    99: aconst_null    
        //   100: aconst_null    
        //   101: iconst_0       
        //   102: aconst_null    
        //   103: new             Lgg/essential/elementa/markdown/drawables/DrawableList$selectedText$2;
        //   106: dup            
        //   107: iload_1         /* asMarkdown */
        //   108: invokespecial   gg/essential/elementa/markdown/drawables/DrawableList$selectedText$2.<init>:(Z)V
        //   111: checkcast       Lkotlin/jvm/functions/Function1;
        //   114: bipush          30
        //   116: aconst_null    
        //   117: invokestatic    kotlin/collections/CollectionsKt.joinToString$default:(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;
        //   120: areturn        
        //    MethodParameters:
        //  Name        Flags  
        //  ----------  -----
        //  asMarkdown  
        //    StackMapTable: 00 02 FF 00 22 00 08 07 00 02 01 07 00 6E 01 07 00 6E 07 01 0D 01 07 00 73 00 00 31
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public int getSize() {
        List<? extends Drawable> drawables;
        if ((drawables = this.drawables) == null) {
            Intrinsics.throwUninitializedPropertyAccessException("drawables");
            drawables = null;
        }
        return drawables.size();
    }
    
    public boolean contains(@NotNull final Drawable element) {
        Intrinsics.checkNotNullParameter((Object)element, "element");
        List<? extends Drawable> drawables;
        if ((drawables = this.drawables) == null) {
            Intrinsics.throwUninitializedPropertyAccessException("drawables");
            drawables = null;
        }
        return drawables.contains(element);
    }
    
    @Override
    public boolean containsAll(@NotNull final Collection<?> elements) {
        Intrinsics.checkNotNullParameter((Object)elements, "elements");
        List<? extends Drawable> drawables;
        if ((drawables = this.drawables) == null) {
            Intrinsics.throwUninitializedPropertyAccessException("drawables");
            drawables = null;
        }
        return drawables.containsAll(elements);
    }
    
    @NotNull
    @Override
    public Drawable get(final int index) {
        List<? extends Drawable> drawables;
        if ((drawables = this.drawables) == null) {
            Intrinsics.throwUninitializedPropertyAccessException("drawables");
            drawables = null;
        }
        return (Drawable)drawables.get(index);
    }
    
    public int indexOf(@NotNull final Drawable element) {
        Intrinsics.checkNotNullParameter((Object)element, "element");
        List<? extends Drawable> drawables;
        if ((drawables = this.drawables) == null) {
            Intrinsics.throwUninitializedPropertyAccessException("drawables");
            drawables = null;
        }
        return drawables.indexOf(element);
    }
    
    @Override
    public boolean isEmpty() {
        List<? extends Drawable> drawables;
        if ((drawables = this.drawables) == null) {
            Intrinsics.throwUninitializedPropertyAccessException("drawables");
            drawables = null;
        }
        return drawables.isEmpty();
    }
    
    @NotNull
    @Override
    public Iterator<Drawable> iterator() {
        List<? extends Drawable> drawables;
        if ((drawables = this.drawables) == null) {
            Intrinsics.throwUninitializedPropertyAccessException("drawables");
            drawables = null;
        }
        return (Iterator<Drawable>)drawables.iterator();
    }
    
    public int lastIndexOf(@NotNull final Drawable element) {
        Intrinsics.checkNotNullParameter((Object)element, "element");
        List<? extends Drawable> drawables;
        if ((drawables = this.drawables) == null) {
            Intrinsics.throwUninitializedPropertyAccessException("drawables");
            drawables = null;
        }
        return drawables.lastIndexOf(element);
    }
    
    @NotNull
    @Override
    public ListIterator<Drawable> listIterator() {
        List<? extends Drawable> drawables;
        if ((drawables = this.drawables) == null) {
            Intrinsics.throwUninitializedPropertyAccessException("drawables");
            drawables = null;
        }
        return (ListIterator<Drawable>)drawables.listIterator();
    }
    
    @NotNull
    @Override
    public ListIterator<Drawable> listIterator(final int index) {
        List<? extends Drawable> drawables;
        if ((drawables = this.drawables) == null) {
            Intrinsics.throwUninitializedPropertyAccessException("drawables");
            drawables = null;
        }
        return (ListIterator<Drawable>)drawables.listIterator(index);
    }
    
    @NotNull
    @Override
    public List<Drawable> subList(final int fromIndex, final int toIndex) {
        List<? extends Drawable> drawables;
        if ((drawables = this.drawables) == null) {
            Intrinsics.throwUninitializedPropertyAccessException("drawables");
            drawables = null;
        }
        return (List<Drawable>)drawables.subList(fromIndex, toIndex);
    }
    
    @Override
    public boolean add(final Drawable element) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    @Override
    public void add(final int index, final Drawable element) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    @Override
    public boolean addAll(final int index, final Collection<? extends Drawable> elements) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    @Override
    public boolean addAll(final Collection<? extends Drawable> elements) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    @Override
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    @Override
    public boolean remove(final Object element) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    @Override
    public boolean removeAll(final Collection<?> elements) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    @Override
    public Drawable remove(final int index) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    @Override
    public /* bridge */ Object remove(final int index) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    @Override
    public void replaceAll(final UnaryOperator<Drawable> p0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    @Override
    public boolean retainAll(final Collection<?> elements) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    @Override
    public Drawable set(final int index, final Drawable element) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    @Override
    public void sort(final Comparator<? super Drawable> p0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    @Override
    public final /* bridge */ int size() {
        return this.getSize();
    }
    
    @Override
    public final /* bridge */ boolean contains(final Object element) {
        return element instanceof Drawable && this.contains((Drawable)element);
    }
    
    @Override
    public /* bridge */ Object get(final int index) {
        return this.get(index);
    }
    
    @Override
    public final /* bridge */ int indexOf(final Object element) {
        if (!(element instanceof Drawable)) {
            return -1;
        }
        return this.indexOf((Drawable)element);
    }
    
    @Override
    public final /* bridge */ int lastIndexOf(final Object element) {
        if (!(element instanceof Drawable)) {
            return -1;
        }
        return this.lastIndexOf((Drawable)element);
    }
    
    @Override
    public /* bridge */ boolean add(final Object element) {
        return this.add((Drawable)element);
    }
    
    @Override
    public /* bridge */ void add(final int index, final Object element) {
        this.add(index, (Drawable)element);
    }
    
    @Override
    public /* bridge */ Object set(final int index, final Object element) {
        return this.set(index, (Drawable)element);
    }
    
    @Override
    public <T> T[] toArray(final T[] array) {
        Intrinsics.checkNotNullParameter((Object)array, "array");
        return (T[])CollectionToArray.toArray((Collection)this, (Object[])array);
    }
    
    @Override
    public Object[] toArray() {
        return CollectionToArray.toArray((Collection)this);
    }
}
