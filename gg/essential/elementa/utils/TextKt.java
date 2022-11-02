package gg.essential.elementa.utils;

import kotlin.*;
import org.jetbrains.annotations.*;
import gg.essential.elementa.font.*;
import gg.essential.elementa.dsl.*;
import java.util.*;
import kotlin.jvm.internal.*;
import gg.essential.universal.*;
import kotlin.text.*;

@Metadata(mv = { 1, 6, 0 }, k = 2, xi = 48, d1 = { "\u0000.\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u001aB\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u000b\u001aT\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u0002\u001a\u000e\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u000e\u001a\u0016\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0005¨\u0006\u0015" }, d2 = { "getStringSplitToWidth", "", "", "text", "maxLineWidth", "", "textScale", "ensureSpaceAtEndOfLines", "", "processColorCodes", "fontProvider", "Lgg/essential/elementa/font/FontProvider;", "getStringSplitToWidthTruncated", "maxLines", "", "trimmedTextSuffix", "isFormatColor", "char", "sizeStringToWidth", "string", "width", "Elementa" })
public final class TextKt
{
    @NotNull
    public static final List<String> getStringSplitToWidthTruncated(@NotNull final String text, final float maxLineWidth, final float textScale, final int maxLines, final boolean ensureSpaceAtEndOfLines, final boolean processColorCodes, @NotNull final FontProvider fontProvider, @NotNull final String trimmedTextSuffix) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "text"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload           fontProvider
        //     8: ldc             "fontProvider"
        //    10: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    13: aload           trimmedTextSuffix
        //    15: ldc             "trimmedTextSuffix"
        //    17: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    20: aload_0         /* text */
        //    21: fload_1         /* maxLineWidth */
        //    22: fload_2         /* textScale */
        //    23: iload           ensureSpaceAtEndOfLines
        //    25: iload           processColorCodes
        //    27: aload           fontProvider
        //    29: invokestatic    gg/essential/elementa/utils/TextKt.getStringSplitToWidth:(Ljava/lang/String;FFZZLgg/essential/elementa/font/FontProvider;)Ljava/util/List;
        //    32: astore          lines
        //    34: aload           lines
        //    36: invokeinterface java/util/List.size:()I
        //    41: iload_3         /* maxLines */
        //    42: if_icmpgt       48
        //    45: aload           lines
        //    47: areturn        
        //    48: aload           trimmedTextSuffix
        //    50: fload_2         /* textScale */
        //    51: aload           fontProvider
        //    53: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.width:(Ljava/lang/String;FLgg/essential/elementa/font/FontProvider;)F
        //    56: fstore          suffixWidth
        //    58: aload           lines
        //    60: iconst_0       
        //    61: iload_3         /* maxLines */
        //    62: invokeinterface java/util/List.subList:(II)Ljava/util/List;
        //    67: checkcast       Ljava/lang/Iterable;
        //    70: astore          $this$mapIndexed$iv
        //    72: iconst_0       
        //    73: istore          $i$f$mapIndexed
        //    75: aload           $this$mapIndexed$iv
        //    77: astore          12
        //    79: new             Ljava/util/ArrayList;
        //    82: dup            
        //    83: aload           $this$mapIndexed$iv
        //    85: bipush          10
        //    87: invokestatic    kotlin/collections/CollectionsKt.collectionSizeOrDefault:(Ljava/lang/Iterable;I)I
        //    90: invokespecial   java/util/ArrayList.<init>:(I)V
        //    93: checkcast       Ljava/util/Collection;
        //    96: astore          destination$iv$iv
        //    98: iconst_0       
        //    99: istore          $i$f$mapIndexedTo
        //   101: iconst_0       
        //   102: istore          index$iv$iv
        //   104: aload           $this$mapIndexedTo$iv$iv
        //   106: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   111: astore          16
        //   113: aload           16
        //   115: invokeinterface java/util/Iterator.hasNext:()Z
        //   120: ifeq            317
        //   123: aload           16
        //   125: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   130: astore          item$iv$iv
        //   132: aload           destination$iv$iv
        //   134: iload           index$iv$iv
        //   136: iinc            index$iv$iv, 1
        //   139: istore          18
        //   141: iload           18
        //   143: ifge            149
        //   146: invokestatic    kotlin/collections/CollectionsKt.throwIndexOverflow:()V
        //   149: iload           18
        //   151: aload           item$iv$iv
        //   153: checkcast       Ljava/lang/String;
        //   156: astore          19
        //   158: istore          20
        //   160: astore          25
        //   162: iconst_0       
        //   163: istore          $i$a$-mapIndexed-TextKt$getStringSplitToWidthTruncated$1
        //   165: aload           contents
        //   167: checkcast       Ljava/lang/CharSequence;
        //   170: invokestatic    kotlin/text/StringsKt.getLastIndex:(Ljava/lang/CharSequence;)I
        //   173: istore          length
        //   175: iload           index
        //   177: iload_3         /* maxLines */
        //   178: iconst_1       
        //   179: isub           
        //   180: if_icmpne       302
        //   183: iload           length
        //   185: ifle            302
        //   188: iload           length
        //   190: ifle            258
        //   193: aload           contents
        //   195: astore          23
        //   197: iconst_0       
        //   198: istore          24
        //   200: aload           23
        //   202: dup            
        //   203: ifnonnull       216
        //   206: new             Ljava/lang/NullPointerException;
        //   209: dup            
        //   210: ldc             "null cannot be cast to non-null type java.lang.String"
        //   212: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
        //   215: athrow         
        //   216: iload           24
        //   218: iload           length
        //   220: invokevirtual   java/lang/String.substring:(II)Ljava/lang/String;
        //   223: dup            
        //   224: ldc             "(this as java.lang.Strin\u2026ing(startIndex, endIndex)"
        //   226: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   229: fload_2         /* textScale */
        //   230: aload           fontProvider
        //   232: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.width:(Ljava/lang/String;FLgg/essential/elementa/font/FontProvider;)F
        //   235: fload           suffixWidth
        //   237: fadd           
        //   238: fload_1         /* maxLineWidth */
        //   239: fload_2         /* textScale */
        //   240: fmul           
        //   241: fcmpl          
        //   242: ifle            258
        //   245: iload           length
        //   247: istore          23
        //   249: iload           23
        //   251: iconst_m1      
        //   252: iadd           
        //   253: istore          length
        //   255: goto            188
        //   258: aload           contents
        //   260: astore          23
        //   262: iconst_0       
        //   263: istore          24
        //   265: aload           23
        //   267: dup            
        //   268: ifnonnull       281
        //   271: new             Ljava/lang/NullPointerException;
        //   274: dup            
        //   275: ldc             "null cannot be cast to non-null type java.lang.String"
        //   277: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
        //   280: athrow         
        //   281: iload           24
        //   283: iload           length
        //   285: invokevirtual   java/lang/String.substring:(II)Ljava/lang/String;
        //   288: dup            
        //   289: ldc             "(this as java.lang.Strin\u2026ing(startIndex, endIndex)"
        //   291: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   294: aload           trimmedTextSuffix
        //   296: invokestatic    kotlin/jvm/internal/Intrinsics.stringPlus:(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
        //   299: goto            304
        //   302: aload           contents
        //   304: nop            
        //   305: aload           25
        //   307: swap           
        //   308: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //   313: pop            
        //   314: goto            113
        //   317: aload           destination$iv$iv
        //   319: checkcast       Ljava/util/List;
        //   322: nop            
        //   323: areturn        
        //    Signature:
        //  (Ljava/lang/String;FFIZZLgg/essential/elementa/font/FontProvider;Ljava/lang/String;)Ljava/util/List<Ljava/lang/String;>;
        //    MethodParameters:
        //  Name                     Flags  
        //  -----------------------  -----
        //  text                     
        //  maxLineWidth             
        //  textScale                
        //  maxLines                 
        //  ensureSpaceAtEndOfLines  
        //  processColorCodes        
        //  fontProvider             
        //  trimmedTextSuffix        
        //    StackMapTable: 00 0A FC 00 30 07 00 34 FF 00 40 00 11 07 00 57 02 02 01 01 01 07 00 59 07 00 57 07 00 34 02 07 00 43 01 07 00 43 07 00 51 01 01 07 00 5B 00 00 FF 00 23 00 13 07 00 57 02 02 01 01 01 07 00 59 07 00 57 07 00 34 02 07 00 43 01 07 00 43 07 00 51 01 01 07 00 5B 07 00 04 01 00 01 07 00 51 FF 00 26 00 1A 07 00 57 02 02 01 01 01 07 00 59 07 00 57 07 00 34 02 07 00 43 01 07 00 43 07 00 51 01 01 07 00 5B 07 00 04 01 07 00 57 01 01 01 00 00 07 00 51 00 00 FF 00 1B 00 1A 07 00 57 02 02 01 01 01 07 00 59 07 00 57 07 00 34 02 07 00 43 01 07 00 43 07 00 51 01 01 07 00 5B 07 00 04 01 07 00 57 01 01 01 07 00 57 01 07 00 51 00 01 07 00 57 FF 00 29 00 1A 07 00 57 02 02 01 01 01 07 00 59 07 00 57 07 00 34 02 07 00 43 01 07 00 43 07 00 51 01 01 07 00 5B 07 00 04 01 07 00 57 01 01 01 00 00 07 00 51 00 00 FF 00 16 00 1A 07 00 57 02 02 01 01 01 07 00 59 07 00 57 07 00 34 02 07 00 43 01 07 00 43 07 00 51 01 01 07 00 5B 07 00 04 01 07 00 57 01 01 01 07 00 57 01 07 00 51 00 01 07 00 57 FF 00 14 00 1A 07 00 57 02 02 01 01 01 07 00 59 07 00 57 07 00 34 02 07 00 43 01 07 00 43 07 00 51 01 01 07 00 5B 07 00 04 01 07 00 57 01 01 01 00 00 07 00 51 00 00 41 07 00 57 FF 00 0C 00 11 07 00 57 02 02 01 01 01 07 00 59 07 00 57 07 00 34 02 07 00 43 01 07 00 43 07 00 51 01 01 07 00 5B 00 00
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public static /* synthetic */ List getStringSplitToWidthTruncated$default(final String text, final float maxLineWidth, final float textScale, final int maxLines, boolean ensureSpaceAtEndOfLines, boolean processColorCodes, FontProvider vanilla_FONT_RENDERER, String trimmedTextSuffix, final int n, final Object o) {
        if ((n & 0x10) != 0x0) {
            ensureSpaceAtEndOfLines = true;
        }
        if ((n & 0x20) != 0x0) {
            processColorCodes = true;
        }
        if ((n & 0x40) != 0x0) {
            vanilla_FONT_RENDERER = DefaultFonts.getVANILLA_FONT_RENDERER();
        }
        if ((n & 0x80) != 0x0) {
            trimmedTextSuffix = "...";
        }
        return getStringSplitToWidthTruncated(text, maxLineWidth, textScale, maxLines, ensureSpaceAtEndOfLines, processColorCodes, vanilla_FONT_RENDERER, trimmedTextSuffix);
    }
    
    @NotNull
    public static final List<String> getStringSplitToWidth(@NotNull final String text, final float maxLineWidth, final float textScale, final boolean ensureSpaceAtEndOfLines, final boolean processColorCodes, @NotNull final FontProvider fontProvider) {
        Intrinsics.checkNotNullParameter((Object)text, "text");
        Intrinsics.checkNotNullParameter((Object)fontProvider, "fontProvider");
        final float spaceWidth = UtilitiesKt.width(' ', textScale);
        final float maxLineWidthSpace = maxLineWidth - (ensureSpaceAtEndOfLines ? spaceWidth : 0.0f);
        final List lineList = new ArrayList();
        final StringBuilder currLine = new StringBuilder();
        int textPos = 0;
        final Ref$ObjectRef currChatColor = new Ref$ObjectRef();
        final Ref$ObjectRef currChatFormatting = new Ref$ObjectRef();
        while (textPos < text.length()) {
            final StringBuilder builder = new StringBuilder();
        Label_0095:
            while (textPos < text.length()) {
                final char it = text.charAt(textPos);
                final int n = 0;
                if (it == ' ' || it == '\n') {
                    break;
                }
                final char ch = text.charAt(textPos);
                Label_0312: {
                    if (processColorCodes && (ch == '§' || ch == '&') && textPos + 1 < text.length()) {
                        final char colorCh = text.charAt(textPos + 1);
                        final Object[] $this$firstOrNull$iv = ChatColor.values();
                        final int $i$f$firstOrNull = 0;
                        final Object[] array = $this$firstOrNull$iv;
                        final int length = array.length;
                        int i = 0;
                        while (true) {
                            while (i < length) {
                                final ChatColor it2;
                                final Object element$iv = it2 = (ChatColor)array[i];
                                final int n2 = 0;
                                if (it2.getChar() == colorCh) {
                                    final Object o = element$iv;
                                    final ChatColor nextColor = (ChatColor)o;
                                    if (nextColor != null) {
                                        builder.append('§');
                                        builder.append(colorCh);
                                        if (nextColor.isFormat()) {
                                            currChatFormatting.element = nextColor;
                                        }
                                        else {
                                            currChatColor.element = nextColor;
                                        }
                                        textPos += 2;
                                        continue Label_0095;
                                    }
                                    break Label_0312;
                                }
                                else {
                                    ++i;
                                }
                            }
                            final Object o = null;
                            continue;
                        }
                    }
                }
                builder.append(ch);
                ++textPos;
            }
            final boolean newline = textPos < text.length() && text.charAt(textPos) == '\n';
            final String string = builder.toString();
            Intrinsics.checkNotNullExpressionValue((Object)string, "builder.toString()");
            final String word = string;
            final float wordWidth = UtilitiesKt.width(word, textScale, fontProvider);
            if (processColorCodes && newline) {
                currChatColor.element = null;
                currChatFormatting.element = null;
            }
            if (UtilitiesKt.width(Intrinsics.stringPlus(currLine.toString(), (Object)word), textScale, fontProvider) > maxLineWidthSpace) {
                if (wordWidth > maxLineWidthSpace) {
                    final String string2 = currLine.toString();
                    Intrinsics.checkNotNullExpressionValue((Object)string2, "currLine.toString()");
                    if (UtilitiesKt.width(string2, textScale, fontProvider) > 0.0f) {
                        getStringSplitToWidth$pushLine(lineList, currLine, processColorCodes, (Ref$ObjectRef<ChatColor>)currChatColor, (Ref$ObjectRef<ChatColor>)currChatFormatting);
                    }
                    final char[] charArray = word.toCharArray();
                    Intrinsics.checkNotNullExpressionValue((Object)charArray, "(this as java.lang.String).toCharArray()");
                    final char[] array2 = charArray;
                    int j = 0;
                    while (j < array2.length) {
                        final char char1 = array2[j];
                        ++j;
                        if (UtilitiesKt.width(Intrinsics.stringPlus(currLine.toString(), (Object)char1), textScale, fontProvider) > maxLineWidthSpace) {
                            getStringSplitToWidth$pushLine(lineList, currLine, processColorCodes, (Ref$ObjectRef<ChatColor>)currChatColor, (Ref$ObjectRef<ChatColor>)currChatFormatting);
                        }
                        currLine.append(char1);
                    }
                }
                else {
                    getStringSplitToWidth$pushLine(lineList, currLine, processColorCodes, (Ref$ObjectRef<ChatColor>)currChatColor, (Ref$ObjectRef<ChatColor>)currChatFormatting);
                    currLine.append(word);
                }
                if (textPos >= text.length()) {
                    continue;
                }
                if (!newline) {
                    final String string3 = currLine.toString();
                    Intrinsics.checkNotNullExpressionValue((Object)string3, "currLine.toString()");
                    if (UtilitiesKt.width(string3, textScale, fontProvider) + spaceWidth > maxLineWidthSpace) {
                        getStringSplitToWidth$pushLine(lineList, currLine, processColorCodes, (Ref$ObjectRef<ChatColor>)currChatColor, (Ref$ObjectRef<ChatColor>)currChatFormatting);
                    }
                    currLine.append(' ');
                    ++textPos;
                }
                else {
                    getStringSplitToWidth$pushLine(lineList, currLine, processColorCodes, (Ref$ObjectRef<ChatColor>)currChatColor, (Ref$ObjectRef<ChatColor>)currChatFormatting);
                    ++textPos;
                }
            }
            else {
                currLine.append(word);
                if (!newline && textPos < text.length()) {
                    ++textPos;
                    currLine.append(' ');
                }
                else {
                    if (!newline) {
                        continue;
                    }
                    getStringSplitToWidth$pushLine(lineList, currLine, processColorCodes, (Ref$ObjectRef<ChatColor>)currChatColor, (Ref$ObjectRef<ChatColor>)currChatFormatting);
                    ++textPos;
                }
            }
        }
        final List list = lineList;
        final String string4 = currLine.toString();
        Intrinsics.checkNotNullExpressionValue((Object)string4, "currLine.toString()");
        list.add(string4);
        return lineList;
    }
    
    public static /* synthetic */ List getStringSplitToWidth$default(final String text, final float maxLineWidth, final float textScale, boolean ensureSpaceAtEndOfLines, boolean processColorCodes, FontProvider vanilla_FONT_RENDERER, final int n, final Object o) {
        if ((n & 0x8) != 0x0) {
            ensureSpaceAtEndOfLines = true;
        }
        if ((n & 0x10) != 0x0) {
            processColorCodes = true;
        }
        if ((n & 0x20) != 0x0) {
            vanilla_FONT_RENDERER = DefaultFonts.getVANILLA_FONT_RENDERER();
        }
        return getStringSplitToWidth(text, maxLineWidth, textScale, ensureSpaceAtEndOfLines, processColorCodes, vanilla_FONT_RENDERER);
    }
    
    public static final int sizeStringToWidth(@NotNull final String string, final float width) {
        Intrinsics.checkNotNullParameter((Object)string, "string");
        final int i = string.length();
        float j = 0.0f;
        int k = 0;
        int l = -1;
        boolean flag = false;
        while (k < i) {
            final char char1;
            final char c0 = char1 = string.charAt(k);
            if (char1 == '\n') {
                --k;
            }
            else if (char1 == ' ') {
                l = k;
                j += UGraphics.getCharWidth(c0);
                if (flag) {
                    ++j;
                }
            }
            else if (char1 == '§') {
                if (k < i - 1) {
                    ++k;
                    final char c2 = string.charAt(k);
                    if (c2 != 'l' && c2 != 'L') {
                        if (c2 == 'r' || c2 == 'R' || isFormatColor(c2)) {
                            flag = false;
                        }
                    }
                    else {
                        flag = true;
                    }
                }
            }
            else {
                j += UGraphics.getCharWidth(c0);
                if (flag) {
                    ++j;
                }
            }
            if (c0 == '\n') {
                k = (l = k + 1);
                break;
            }
            if (j > width) {
                break;
            }
            ++k;
        }
        return (k != i && l != -1 && l < k) ? l : k;
    }
    
    public static final boolean isFormatColor(final int char) {
        return (48 <= char && char < 58) || (97 <= char && char < 103) || (65 <= char && char < 71);
    }
    
    private static final void getStringSplitToWidth$pushLine(final List<String> lineList, final StringBuilder currLine, final boolean $processColorCodes, final Ref$ObjectRef<ChatColor> currChatColor, final Ref$ObjectRef<ChatColor> currChatFormatting) {
        final String string = currLine.toString();
        Intrinsics.checkNotNullExpressionValue((Object)string, "currLine.toString()");
        lineList.add(string);
        StringsKt.clear(currLine);
        if ($processColorCodes) {
            final ChatColor chatColor = (ChatColor)currChatColor.element;
            if (chatColor != null) {
                final ChatColor it = chatColor;
                final int n = 0;
                currLine.append(Intrinsics.stringPlus("§", (Object)it.getChar()));
            }
            final ChatColor chatColor2 = (ChatColor)currChatFormatting.element;
            if (chatColor2 != null) {
                final ChatColor it = chatColor2;
                final int n2 = 0;
                currLine.append(Intrinsics.stringPlus("§", (Object)it.getChar()));
            }
        }
    }
}
