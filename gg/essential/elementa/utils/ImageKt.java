package gg.essential.elementa.utils;

import kotlin.*;
import java.util.*;
import gg.essential.universal.utils.*;
import java.awt.*;
import kotlin.jvm.internal.*;
import gg.essential.universal.*;
import org.jetbrains.annotations.*;
import java.awt.image.*;
import kotlin.ranges.*;
import org.lwjgl.opengl.*;

@Metadata(mv = { 1, 6, 0 }, k = 2, xi = 48, d1 = { "\u0000T\n\u0000\n\u0002\u0010$\n\u0002\u0010\f\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0007\u001a;\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00032\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0002\u0010\r\u001a$\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u0003H\u0002\u001a\u0018\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0016H\u0002\u001a,\u0010\u0017\u001a\u0004\u0018\u00010\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u0016\u001a\u0010\u0010\u001a\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u0003H\u0002\u001aT\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020%2\u0006\u0010\u0006\u001a\u00020%2\u0006\u0010\u0007\u001a\u00020%2\b\b\u0002\u0010'\u001a\u00020\u00032\b\b\u0002\u0010(\u001a\u00020\u0003H\u0000\u001a\u0010\u0010)\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0016H\u0002\u001a\u0010\u0010*\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u0016H\u0002\u001a\u0010\u0010+\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u0003H\u0002\"\u001a\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006," }, d2 = { "charMap", "", "", "", "composeBitmap", "Ljava/awt/image/BufferedImage;", "width", "height", "numCompX", "numCompY", "colors", "", "", "(IIII[[F)Ljava/awt/image/BufferedImage;", "decode83", "str", "", "from", "to", "decodeAc", "value", "maxAc", "", "decodeBlurHash", "blurHash", "punch", "decodeDc", "colorEnc", "drawTexture", "", "matrixStack", "Lgg/essential/universal/UMatrixStack;", "texture", "Lgg/essential/universal/utils/ReleasedDynamicTexture;", "color", "Ljava/awt/Color;", "x", "", "y", "textureMinFilter", "textureMagFilter", "linearToSrgb", "signedPow2", "srgbToLinear", "Elementa" })
public final class ImageKt
{
    @NotNull
    private static final Map<Character, Integer> charMap;
    
    public static final void drawTexture(@NotNull final UMatrixStack matrixStack, @NotNull final ReleasedDynamicTexture texture, @NotNull final Color color, final double x, final double y, final double width, final double height, final int textureMinFilter, final int textureMagFilter) {
        Intrinsics.checkNotNullParameter((Object)matrixStack, "matrixStack");
        Intrinsics.checkNotNullParameter((Object)texture, "texture");
        Intrinsics.checkNotNullParameter((Object)color, "color");
        matrixStack.push();
        UGraphics.enableBlend();
        UGraphics.enableAlpha();
        matrixStack.scale(1.0f, 1.0f, 50.0f);
        final int glId = texture.getDynamicGlId();
        UGraphics.bindTexture(0, glId);
        final float red = color.getRed() / 255.0f;
        final float green = color.getGreen() / 255.0f;
        final float blue = color.getBlue() / 255.0f;
        final float alpha = color.getAlpha() / 255.0f;
        final UGraphics worldRenderer = UGraphics.getFromTessellator();
        UGraphics.configureTexture(glId, ImageKt::drawTexture$lambda-0);
        worldRenderer.beginWithDefaultShader(UGraphics.DrawMode.QUADS, UGraphics.CommonVertexFormats.POSITION_TEXTURE_COLOR);
        worldRenderer.pos(matrixStack, x, y + height, 0.0).tex(0.0, 1.0).color(red, green, blue, alpha).endVertex();
        worldRenderer.pos(matrixStack, x + width, y + height, 0.0).tex(1.0, 1.0).color(red, green, blue, alpha).endVertex();
        worldRenderer.pos(matrixStack, x + width, y, 0.0).tex(1.0, 0.0).color(red, green, blue, alpha).endVertex();
        worldRenderer.pos(matrixStack, x, y, 0.0).tex(0.0, 0.0).color(red, green, blue, alpha).endVertex();
        worldRenderer.drawDirect();
        matrixStack.pop();
    }
    
    public static /* synthetic */ void drawTexture$default(final UMatrixStack matrixStack, final ReleasedDynamicTexture texture, final Color color, final double x, final double y, final double width, final double height, int textureMinFilter, int textureMagFilter, final int n, final Object o) {
        if ((n & 0x80) != 0x0) {
            textureMinFilter = 9728;
        }
        if ((n & 0x100) != 0x0) {
            textureMagFilter = 9728;
        }
        drawTexture(matrixStack, texture, color, x, y, width, height, textureMinFilter, textureMagFilter);
    }
    
    @Nullable
    public static final BufferedImage decodeBlurHash(@Nullable final String blurHash, final int width, final int height, final float punch) {
        if (blurHash == null || blurHash.length() < 6) {
            return null;
        }
        final int numCompEnc = decode83(blurHash, 0, 1);
        final int numCompX = numCompEnc % 9 + 1;
        final int numCompY = numCompEnc / 9 + 1;
        if (blurHash.length() != 4 + 2 * numCompX * numCompY) {
            return null;
        }
        final int maxAcEnc = decode83(blurHash, 1, 2);
        final float maxAc = (maxAcEnc + 1) / 166.0f;
        int i = 0;
        final int n = numCompX * numCompY;
        final float[][] array = new float[n][];
        while (i < n) {
            final int n2 = i;
            final float[][] array2 = array;
            final int n3;
            float[] array3;
            if ((n3 = n2) == 0) {
                final int colorEnc = decode83(blurHash, 2, 6);
                array3 = decodeDc(colorEnc);
            }
            else {
                final int from = 4 + n2 * 2;
                final int colorEnc2 = decode83(blurHash, from, from + 2);
                array3 = decodeAc(colorEnc2, maxAc * punch);
            }
            array2[n3] = array3;
            ++i;
        }
        final float[][] colors = array;
        return composeBitmap(width, height, numCompX, numCompY, colors);
    }
    
    public static /* synthetic */ BufferedImage decodeBlurHash$default(final String blurHash, final int width, final int height, float punch, final int n, final Object o) {
        if ((n & 0x8) != 0x0) {
            punch = 1.0f;
        }
        return decodeBlurHash(blurHash, width, height, punch);
    }
    
    private static final int decode83(final String str, final int from, final int to) {
        int result = 0;
        int j = from;
        while (j < to) {
            final int i = j;
            ++j;
            final Integer n = ImageKt.charMap.get(str.charAt(i));
            final int index = (n == null) ? -1 : n;
            if (index != -1) {
                result = result * 83 + index;
            }
        }
        return result;
    }
    
    static /* synthetic */ int decode83$default(final String str, int from, int length, final int n, final Object o) {
        if ((n & 0x2) != 0x0) {
            from = 0;
        }
        if ((n & 0x4) != 0x0) {
            length = str.length();
        }
        return decode83(str, from, length);
    }
    
    private static final float[] decodeDc(final int colorEnc) {
        final int r = colorEnc >> 16;
        final int g = colorEnc >> 8 & 0xFF;
        final int b = colorEnc & 0xFF;
        return new float[] { srgbToLinear(r), srgbToLinear(g), srgbToLinear(b) };
    }
    
    private static final float srgbToLinear(final int colorEnc) {
        final float v = colorEnc / 255.0f;
        return (v <= 0.04045f) ? (v / 12.92f) : ((float)Math.pow((v + 0.055f) / 1.055f, 2.4f));
    }
    
    private static final float[] decodeAc(final int value, final float maxAc) {
        final int r = value / 361;
        final int g = value / 19 % 19;
        final int b = value % 19;
        return new float[] { signedPow2((r - 9) / 9.0f) * maxAc, signedPow2((g - 9) / 9.0f) * maxAc, signedPow2((b - 9) / 9.0f) * maxAc };
    }
    
    private static final float signedPow2(final float value) {
        return Math.copySign((float)Math.pow(value, 2.0f), value);
    }
    
    private static final BufferedImage composeBitmap(final int width, final int height, final int numCompX, final int numCompY, final float[][] colors) {
        final BufferedImage bitmap = new BufferedImage(width, height, 6);
        int k = 0;
        while (k < height) {
            final int y = k;
            ++k;
            int l = 0;
            while (l < width) {
                final int x = l;
                ++l;
                float r = 0.0f;
                float g = 0.0f;
                float b = 0.0f;
                int n = 0;
                while (n < numCompY) {
                    final int j = n;
                    ++n;
                    int i;
                    float basis;
                    float[] color;
                    for (int n2 = 0; n2 < numCompX; ++n2, basis = (float)(Math.cos(3.141592653589793 * x * i / width) * Math.cos(3.141592653589793 * y * j / height)), color = colors[j * numCompX + i], r += color[0] * basis, g += color[1] * basis, b += color[2] * basis) {
                        i = n2;
                    }
                }
                bitmap.setRGB(x, y, -16777216 + (linearToSrgb(r) << 16) + (linearToSrgb(g) << 8) + linearToSrgb(b));
            }
        }
        return bitmap;
    }
    
    private static final int linearToSrgb(final float value) {
        final float v = RangesKt.coerceIn(value, 0.0f, 1.0f);
        return (v <= 0.0031308f) ? ((int)(v * 12.92f * 255.0f + 0.5f)) : ((int)((1.055f * (float)Math.pow(v, 0.41666666f) - 0.055f) * 255 + 0.5f));
    }
    
    private static final void drawTexture$lambda-0(final int $textureMinFilter, final int $textureMagFilter) {
        GL11.glTexParameteri(3553, 10241, $textureMinFilter);
        GL11.glTexParameteri(3553, 10240, $textureMagFilter);
    }
    
    static {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: anewarray       Ljava/lang/Character;
        //     5: astore_0       
        //     6: aload_0        
        //     7: iconst_0       
        //     8: bipush          48
        //    10: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
        //    13: aastore        
        //    14: aload_0        
        //    15: iconst_1       
        //    16: bipush          49
        //    18: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
        //    21: aastore        
        //    22: aload_0        
        //    23: iconst_2       
        //    24: bipush          50
        //    26: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
        //    29: aastore        
        //    30: aload_0        
        //    31: iconst_3       
        //    32: bipush          51
        //    34: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
        //    37: aastore        
        //    38: aload_0        
        //    39: iconst_4       
        //    40: bipush          52
        //    42: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
        //    45: aastore        
        //    46: aload_0        
        //    47: iconst_5       
        //    48: bipush          53
        //    50: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
        //    53: aastore        
        //    54: aload_0        
        //    55: bipush          6
        //    57: bipush          54
        //    59: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
        //    62: aastore        
        //    63: aload_0        
        //    64: bipush          7
        //    66: bipush          55
        //    68: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
        //    71: aastore        
        //    72: aload_0        
        //    73: bipush          8
        //    75: bipush          56
        //    77: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
        //    80: aastore        
        //    81: aload_0        
        //    82: bipush          9
        //    84: bipush          57
        //    86: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
        //    89: aastore        
        //    90: aload_0        
        //    91: bipush          10
        //    93: bipush          65
        //    95: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
        //    98: aastore        
        //    99: aload_0        
        //   100: bipush          11
        //   102: bipush          66
        //   104: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
        //   107: aastore        
        //   108: aload_0        
        //   109: bipush          12
        //   111: bipush          67
        //   113: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
        //   116: aastore        
        //   117: aload_0        
        //   118: bipush          13
        //   120: bipush          68
        //   122: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
        //   125: aastore        
        //   126: aload_0        
        //   127: bipush          14
        //   129: bipush          69
        //   131: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
        //   134: aastore        
        //   135: aload_0        
        //   136: bipush          15
        //   138: bipush          70
        //   140: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
        //   143: aastore        
        //   144: aload_0        
        //   145: bipush          16
        //   147: bipush          71
        //   149: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
        //   152: aastore        
        //   153: aload_0        
        //   154: bipush          17
        //   156: bipush          72
        //   158: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
        //   161: aastore        
        //   162: aload_0        
        //   163: bipush          18
        //   165: bipush          73
        //   167: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
        //   170: aastore        
        //   171: aload_0        
        //   172: bipush          19
        //   174: bipush          74
        //   176: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
        //   179: aastore        
        //   180: aload_0        
        //   181: bipush          20
        //   183: bipush          75
        //   185: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
        //   188: aastore        
        //   189: aload_0        
        //   190: bipush          21
        //   192: bipush          76
        //   194: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
        //   197: aastore        
        //   198: aload_0        
        //   199: bipush          22
        //   201: bipush          77
        //   203: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
        //   206: aastore        
        //   207: aload_0        
        //   208: bipush          23
        //   210: bipush          78
        //   212: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
        //   215: aastore        
        //   216: aload_0        
        //   217: bipush          24
        //   219: bipush          79
        //   221: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
        //   224: aastore        
        //   225: aload_0        
        //   226: bipush          25
        //   228: bipush          80
        //   230: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
        //   233: aastore        
        //   234: aload_0        
        //   235: bipush          26
        //   237: bipush          81
        //   239: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
        //   242: aastore        
        //   243: aload_0        
        //   244: bipush          27
        //   246: bipush          82
        //   248: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
        //   251: aastore        
        //   252: aload_0        
        //   253: bipush          28
        //   255: bipush          83
        //   257: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
        //   260: aastore        
        //   261: aload_0        
        //   262: bipush          29
        //   264: bipush          84
        //   266: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
        //   269: aastore        
        //   270: aload_0        
        //   271: bipush          30
        //   273: bipush          85
        //   275: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
        //   278: aastore        
        //   279: aload_0        
        //   280: bipush          31
        //   282: bipush          86
        //   284: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
        //   287: aastore        
        //   288: aload_0        
        //   289: bipush          32
        //   291: bipush          87
        //   293: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
        //   296: aastore        
        //   297: aload_0        
        //   298: bipush          33
        //   300: bipush          88
        //   302: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
        //   305: aastore        
        //   306: aload_0        
        //   307: bipush          34
        //   309: bipush          89
        //   311: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
        //   314: aastore        
        //   315: aload_0        
        //   316: bipush          35
        //   318: bipush          90
        //   320: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
        //   323: aastore        
        //   324: aload_0        
        //   325: bipush          36
        //   327: bipush          97
        //   329: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
        //   332: aastore        
        //   333: aload_0        
        //   334: bipush          37
        //   336: bipush          98
        //   338: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
        //   341: aastore        
        //   342: aload_0        
        //   343: bipush          38
        //   345: bipush          99
        //   347: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
        //   350: aastore        
        //   351: aload_0        
        //   352: bipush          39
        //   354: bipush          100
        //   356: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
        //   359: aastore        
        //   360: aload_0        
        //   361: bipush          40
        //   363: bipush          101
        //   365: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
        //   368: aastore        
        //   369: aload_0        
        //   370: bipush          41
        //   372: bipush          102
        //   374: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
        //   377: aastore        
        //   378: aload_0        
        //   379: bipush          42
        //   381: bipush          103
        //   383: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
        //   386: aastore        
        //   387: aload_0        
        //   388: bipush          43
        //   390: bipush          104
        //   392: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
        //   395: aastore        
        //   396: aload_0        
        //   397: bipush          44
        //   399: bipush          105
        //   401: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
        //   404: aastore        
        //   405: aload_0        
        //   406: bipush          45
        //   408: bipush          106
        //   410: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
        //   413: aastore        
        //   414: aload_0        
        //   415: bipush          46
        //   417: bipush          107
        //   419: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
        //   422: aastore        
        //   423: aload_0        
        //   424: bipush          47
        //   426: bipush          108
        //   428: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
        //   431: aastore        
        //   432: aload_0        
        //   433: bipush          48
        //   435: bipush          109
        //   437: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
        //   440: aastore        
        //   441: aload_0        
        //   442: bipush          49
        //   444: bipush          110
        //   446: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
        //   449: aastore        
        //   450: aload_0        
        //   451: bipush          50
        //   453: bipush          111
        //   455: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
        //   458: aastore        
        //   459: aload_0        
        //   460: bipush          51
        //   462: bipush          112
        //   464: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
        //   467: aastore        
        //   468: aload_0        
        //   469: bipush          52
        //   471: bipush          113
        //   473: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
        //   476: aastore        
        //   477: aload_0        
        //   478: bipush          53
        //   480: bipush          114
        //   482: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
        //   485: aastore        
        //   486: aload_0        
        //   487: bipush          54
        //   489: bipush          115
        //   491: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
        //   494: aastore        
        //   495: aload_0        
        //   496: bipush          55
        //   498: bipush          116
        //   500: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
        //   503: aastore        
        //   504: aload_0        
        //   505: bipush          56
        //   507: bipush          117
        //   509: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
        //   512: aastore        
        //   513: aload_0        
        //   514: bipush          57
        //   516: bipush          118
        //   518: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
        //   521: aastore        
        //   522: aload_0        
        //   523: bipush          58
        //   525: bipush          119
        //   527: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
        //   530: aastore        
        //   531: aload_0        
        //   532: bipush          59
        //   534: bipush          120
        //   536: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
        //   539: aastore        
        //   540: aload_0        
        //   541: bipush          60
        //   543: bipush          121
        //   545: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
        //   548: aastore        
        //   549: aload_0        
        //   550: bipush          61
        //   552: bipush          122
        //   554: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
        //   557: aastore        
        //   558: aload_0        
        //   559: bipush          62
        //   561: bipush          35
        //   563: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
        //   566: aastore        
        //   567: aload_0        
        //   568: bipush          63
        //   570: bipush          36
        //   572: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
        //   575: aastore        
        //   576: aload_0        
        //   577: bipush          64
        //   579: bipush          37
        //   581: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
        //   584: aastore        
        //   585: aload_0        
        //   586: bipush          65
        //   588: bipush          42
        //   590: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
        //   593: aastore        
        //   594: aload_0        
        //   595: bipush          66
        //   597: bipush          43
        //   599: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
        //   602: aastore        
        //   603: aload_0        
        //   604: bipush          67
        //   606: bipush          44
        //   608: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
        //   611: aastore        
        //   612: aload_0        
        //   613: bipush          68
        //   615: bipush          45
        //   617: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
        //   620: aastore        
        //   621: aload_0        
        //   622: bipush          69
        //   624: bipush          46
        //   626: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
        //   629: aastore        
        //   630: aload_0        
        //   631: bipush          70
        //   633: bipush          58
        //   635: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
        //   638: aastore        
        //   639: aload_0        
        //   640: bipush          71
        //   642: bipush          59
        //   644: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
        //   647: aastore        
        //   648: aload_0        
        //   649: bipush          72
        //   651: bipush          61
        //   653: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
        //   656: aastore        
        //   657: aload_0        
        //   658: bipush          73
        //   660: bipush          63
        //   662: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
        //   665: aastore        
        //   666: aload_0        
        //   667: bipush          74
        //   669: bipush          64
        //   671: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
        //   674: aastore        
        //   675: aload_0        
        //   676: bipush          75
        //   678: bipush          91
        //   680: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
        //   683: aastore        
        //   684: aload_0        
        //   685: bipush          76
        //   687: bipush          93
        //   689: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
        //   692: aastore        
        //   693: aload_0        
        //   694: bipush          77
        //   696: bipush          94
        //   698: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
        //   701: aastore        
        //   702: aload_0        
        //   703: bipush          78
        //   705: bipush          95
        //   707: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
        //   710: aastore        
        //   711: aload_0        
        //   712: bipush          79
        //   714: bipush          123
        //   716: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
        //   719: aastore        
        //   720: aload_0        
        //   721: bipush          80
        //   723: bipush          124
        //   725: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
        //   728: aastore        
        //   729: aload_0        
        //   730: bipush          81
        //   732: bipush          125
        //   734: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
        //   737: aastore        
        //   738: aload_0        
        //   739: bipush          82
        //   741: bipush          126
        //   743: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
        //   746: aastore        
        //   747: aload_0        
        //   748: invokestatic    kotlin/collections/CollectionsKt.listOf:([Ljava/lang/Object;)Ljava/util/List;
        //   751: checkcast       Ljava/lang/Iterable;
        //   754: astore_0       
        //   755: nop            
        //   756: iconst_0       
        //   757: istore_1        /* $i$f$mapIndexed */
        //   758: aload_0         /* $this$mapIndexed$iv */
        //   759: astore_2       
        //   760: new             Ljava/util/ArrayList;
        //   763: dup            
        //   764: aload_0         /* $this$mapIndexed$iv */
        //   765: bipush          10
        //   767: invokestatic    kotlin/collections/CollectionsKt.collectionSizeOrDefault:(Ljava/lang/Iterable;I)I
        //   770: invokespecial   java/util/ArrayList.<init>:(I)V
        //   773: checkcast       Ljava/util/Collection;
        //   776: astore_3        /* destination$iv$iv */
        //   777: iconst_0       
        //   778: istore          $i$f$mapIndexedTo
        //   780: iconst_0       
        //   781: istore          index$iv$iv
        //   783: aload_2         /* $this$mapIndexedTo$iv$iv */
        //   784: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   789: astore          6
        //   791: aload           6
        //   793: invokeinterface java/util/Iterator.hasNext:()Z
        //   798: ifeq            870
        //   801: aload           6
        //   803: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   808: astore          item$iv$iv
        //   810: aload_3         /* destination$iv$iv */
        //   811: iload           index$iv$iv
        //   813: iinc            index$iv$iv, 1
        //   816: istore          8
        //   818: iload           8
        //   820: ifge            826
        //   823: invokestatic    kotlin/collections/CollectionsKt.throwIndexOverflow:()V
        //   826: iload           8
        //   828: aload           item$iv$iv
        //   830: checkcast       Ljava/lang/Character;
        //   833: invokevirtual   java/lang/Character.charValue:()C
        //   836: istore          9
        //   838: istore          10
        //   840: astore          12
        //   842: iconst_0       
        //   843: istore          $i$a$-mapIndexed-ImageKt$charMap$1
        //   845: iload           c
        //   847: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
        //   850: iload           i
        //   852: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   855: invokestatic    kotlin/TuplesKt.to:(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
        //   858: aload           12
        //   860: swap           
        //   861: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //   866: pop            
        //   867: goto            791
        //   870: aload_3         /* destination$iv$iv */
        //   871: checkcast       Ljava/util/List;
        //   874: nop            
        //   875: checkcast       Ljava/lang/Iterable;
        //   878: invokestatic    kotlin/collections/MapsKt.toMap:(Ljava/lang/Iterable;)Ljava/util/Map;
        //   881: putstatic       gg/essential/elementa/utils/ImageKt.charMap:Ljava/util/Map;
        //   884: return         
        //    StackMapTable: 00 03 FF 03 17 00 07 07 01 3C 01 07 01 3C 07 01 47 01 01 07 01 4D 00 00 FF 00 22 00 09 07 01 3C 01 07 01 3C 07 01 47 01 01 07 01 4D 07 00 04 01 00 01 07 01 47 F9 00 2B
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
}
