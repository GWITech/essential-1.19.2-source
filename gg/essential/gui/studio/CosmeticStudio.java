package gg.essential.gui.studio;

import gg.essential.api.gui.*;
import kotlin.reflect.*;
import gg.essential.network.connectionmanager.cosmetics.*;
import java.awt.*;
import gg.essential.elementa.state.*;
import gg.essential.gui.state.*;
import gg.essential.network.cosmetics.*;
import kotlin.properties.*;
import org.jetbrains.annotations.*;
import gg.essential.config.*;
import gg.essential.gui.common.*;
import gg.essential.util.*;
import gg.essential.elementa.components.*;
import kotlin.jvm.functions.*;
import net.minecraft.client.*;
import kotlin.comparisons.*;
import gg.essential.universal.*;
import gg.essential.api.utils.*;
import gg.essential.*;
import com.google.common.collect.*;
import java.util.*;
import gg.essential.connectionmanager.common.packet.*;
import gg.essential.connectionmanager.common.packet.response.*;
import gg.essential.connectionmanager.common.packet.cosmetic.*;
import kotlin.jvm.*;
import kotlin.*;
import gg.essential.mod.cosmetics.*;
import gg.essential.cosmetics.model.*;
import kotlin.collections.*;
import kotlin.jvm.internal.*;
import gg.essential.gui.*;
import gg.essential.elementa.constraints.*;
import gg.essential.elementa.dsl.*;
import gg.essential.elementa.*;
import net.minecraft.client.gui.screen.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000\u00ca\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u000e
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\b
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u000b
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010"
                                                   \u0002\u0010 
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0007
                                                   \u0002\u0010#
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0006
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0004
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0004
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0004
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0004
                                                   \u0002\u0018\u0002
                                                   \u0002\b\r
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0003
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u000b
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010$
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0003
                                                   \u0002\u0010\b
                                                   \u0002\b	
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0004
                                                   \u0002\u0018\u0002
                                                   \u0002\b	
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0007
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0004
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0012
                                                   \u0002\u0018\u0002
                                                   \u0002\b
                                                   
                                                   \u0002\u0010	
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0006
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0010\u0002
                                                   \u0002\b\u0007
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u000f
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0003
                                                   \u0002\u0010\u0007
                                                   \u0002\b\u0007
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0004
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0004
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0004
                                                   \u0002\u0010%
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0007\u0018\u0000 \u00df\u00012\u00020\u00012\u00020\u0002:
                                                   \u00de\u0001\u00df\u0001\u00e0\u0001\u00e1\u0001\u00e2\u0001B\u0005¢\u0006\u0002\u0010\u0003J
                                                   \u0010´\u0001\u001a\u00030µ\u0001H\u0016J\u0011\u0010¶\u0001\u001a\u00030µ\u00012\u0007\u0010·\u0001\u001a\u00020cJ\u0013\u0010¸\u0001\u001a\u00030µ\u00012\u0007\u0010¹\u0001\u001a\u00020YH\u0002J\u0013\u0010º\u0001\u001a\u000e\u0012\u0004\u0012\u00020_\u0012\u0004\u0012\u00020\b0^J
                                                   \u0010»\u0001\u001a\u00030µ\u0001H\u0002J\u001d\u0010¼\u0001\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\u000b\u0012	\u0012\u0002\b\u0003\u0018\u00010¾\u00010½\u0001H\u0002J0\u0010¿\u0001\u001a\u00030µ\u00012\b\u0010\u00c0\u0001\u001a\u00030\u00c1\u00012\u0007\u0010\u00c2\u0001\u001a\u00020c2\u0007\u0010\u00c3\u0001\u001a\u00020c2\b\u0010\u00c4\u0001\u001a\u00030\u00c5\u0001H\u0016J
                                                   \u0010\u00c6\u0001\u001a\u00030µ\u0001H\u0016J\b\u0010\u00c7\u0001\u001a\u00030µ\u0001J\u0017\u0010\u00c8\u0001\u001a\u00030µ\u00012\r\u0010\u00c9\u0001\u001a\b\u0012\u0004\u0012\u00020\b0-J&\u0010\u00ca\u0001\u001a\u00030µ\u00012\u000b\b\u0002\u0010\u00cb\u0001\u001a\u0004\u0018\u00010\b2\u000f\u0010\u00cc\u0001\u001a
                                                   \u0012\u0005\u0012\u00030µ\u00010\u00cd\u0001J\u0011\u0010\u00ce\u0001\u001a\u00030µ\u00012\u0007\u0010\u00cf\u0001\u001a\u00020\bJ&\u0010\u00d0\u0001\u001a\u00030µ\u00012\b\u0010\u00d1\u0001\u001a\u00030\u00d2\u00012\u0007\u0010\u00d3\u0001\u001a\u00020c2\u0007\u0010\u00d4\u0001\u001a\u00020cH\u0016J\u001d\u0010\u00d5\u0001\u001a\u00030µ\u00012\b\u0010\u00d6\u0001\u001a\u00030\u00d7\u00012\u0007\u0010¹\u0001\u001a\u00020YH\u0002J\u001d\u0010\u00d8\u0001\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\u000b\u0012	\u0012\u0002\b\u0003\u0018\u00010¾\u00010½\u0001H\u0002J
                                                   \u0010\u00d9\u0001\u001a\u00030µ\u0001H\u0016J2\u0010\u00da\u0001\u001a\u00030µ\u00012(\u0010\u00db\u0001\u001a#\u0012\u0011\u0012\u000f\u0012\u0004\u0012\u00020_\u0012\u0004\u0012\u00020#0\u00dc\u0001\u0012\u0005\u0012\u00030µ\u00010½\u0001¢\u0006\u0003\b\u00dd\u0001R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002
                                                   \u0000R+\u0010\u000b\u001a\u00020
                                                   2\u0006\u0010	\u001a\u00020
                                                   8B@BX\u0082\u008e\u0002¢\u0006\u0012
                                                   \u0004\b\u0010\u0010\u0011\u001a\u0004\b\f\u0010\r"\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0017\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b\u001a\u0010\u0011\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001b\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b\u001d\u0010\u0011\u001a\u0004\b\u001c\u0010\u0015R2\u0010\u001e\u001a&\u0012
                                                   \u0012\b\u0012\u0004\u0012\u00020\b0 \u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020#0"0!0\u001fX\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u001b\u0010$\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b(\u0010\u0011\u001a\u0004\b&\u0010'R;\u0010)\u001a,\u0012\u001c\u0012\u001a\u0012
                                                   \u0012\b\u0012\u0004\u0012\u00020\b0 \u0012
                                                   \u0012\b\u0012\u0004\u0012\u00020\b0 0"\u0012
                                                   \u0012\b\u0012\u0004\u0012\u00020\b0 0\u001f¢\u0006\b
                                                   \u0000\u001a\u0004\b*\u0010+Rd\u0010,\u001aX\u0012N\u0012L\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020#0"0!\u00120\u0012.\u0012\f\u0012
                                                    /*\u0004\u0018\u00010.0. /*\u0015\u0012\f\u0012
                                                    /*\u0004\u0018\u00010.0.0 ¢\u0006\u0002\b00-¢\u0006\u0002\b00"\u0012\u0004\u0012\u0002010\u001fX\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u001b\u00102\u001a\u0002038BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b6\u0010\u0011\u001a\u0004\b4\u00105R\u001b\u00107\u001a\u0002088BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b;\u0010\u0011\u001a\u0004\b9\u0010:R\u001b\u0010<\u001a\u00020=8BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b@\u0010\u0011\u001a\u0004\b>\u0010?R\u001b\u0010A\u001a\u00020B8BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\bE\u0010\u0011\u001a\u0004\bC\u0010DR\u001b\u0010F\u001a\u00020G8BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\bJ\u0010\u0011\u001a\u0004\bH\u0010IR\u001b\u0010K\u001a\u00020
                                                   8BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\bM\u0010\u0011\u001a\u0004\bL\u0010\rR\u001b\u0010N\u001a\u00020G8BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\bP\u0010\u0011\u001a\u0004\bO\u0010IR\u001b\u0010Q\u001a\u00020G8BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\bS\u0010\u0011\u001a\u0004\bR\u0010IR\u0016\u0010T\u001a\u00070U¢\u0006\u0002\b0¢\u0006\b
                                                   \u0000\u001a\u0004\bV\u0010WR\u001f\u0010X\u001a\u0013\u0012\u0004\u0012\u00020Y\u0012	\u0012\u00070\b¢\u0006\u0002\b00\u001fX\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u001f\u0010Z\u001a\u0013\u0012	\u0012\u00070\b¢\u0006\u0002\b0\u0012\u0004\u0012\u00020[0\u001fX\u0082\u0004¢\u0006\u0002
                                                   \u0000R#\u0010\\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020_\u0012\u0004\u0012\u00020\b0^0]¢\u0006\b
                                                   \u0000\u001a\u0004\b`\u0010aR\u0017\u0010b\u001a\b\u0012\u0004\u0012\u00020c0\u0007¢\u0006\b
                                                   \u0000\u001a\u0004\bd\u0010eR\u001d\u0010f\u001a\u000e\u0012
                                                   \u0012\b\u0012\u0004\u0012\u00020\b0 0\u0007¢\u0006\b
                                                   \u0000\u001a\u0004\bg\u0010eR\u001b\u0010h\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\bj\u0010\u0011\u001a\u0004\bi\u0010\u0015R\u001a\u0010k\u001a\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020\b0\u001fX\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u000e\u0010l\u001a\u00020mX\u0082\u0004¢\u0006\u0002
                                                   \u0000R/\u0010n\u001a \u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020_\u0012\u0004\u0012\u00020#0^\u0012
                                                   \u0012\b\u0012\u0004\u0012\u00020\b0 0\u001f¢\u0006\b
                                                   \u0000\u001a\u0004\bo\u0010+R\u001a\u0010p\u001a\u000e\u0012\u0004\u0012\u00020Y\u0012\u0004\u0012\u00020[0\u001fX\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u001a\u0010q\u001a\u000e\u0012\u0004\u0012\u00020[\u0012\u0004\u0012\u00020r0\u001fX\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u000e\u0010s\u001a\u00020[X\u0082\u000e¢\u0006\u0002
                                                   \u0000R\u0014\u0010t\u001a\b\u0012\u0004\u0012\u00020\b0-X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u001b\u0010u\u001a\u00020
                                                   8BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\bw\u0010\u0011\u001a\u0004\bv\u0010\rR\u001b\u0010x\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\bz\u0010\u0011\u001a\u0004\by\u0010\u0015R\u001b\u0010{\u001a\u00020|8BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b\u007f\u0010\u0011\u001a\u0004\b}\u0010~R\u001e\u0010\u0080\u0001\u001a\u00020
                                                   8BX\u0082\u0084\u0002¢\u0006\u000e
                                                   \u0005\b\u0082\u0001\u0010\u0011\u001a\u0005\b\u0081\u0001\u0010\rR \u0010\u0083\u0001\u001a\u00030\u0084\u00018FX\u0086\u0084\u0002¢\u0006\u000f
                                                   \u0005\b\u0087\u0001\u0010\u0011\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001R \u0010\u0088\u0001\u001a\u00030\u0089\u0001X\u0086\u000e¢\u0006\u0012
                                                   \u0000\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001"\u0006\b\u008c\u0001\u0010\u008d\u0001R%\u0010\u008e\u0001\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020_\u0012\u0004\u0012\u00020#0^0]¢\u0006	
                                                   \u0000\u001a\u0005\b\u008f\u0001\u0010aR-\u0010\u0090\u0001\u001a \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020c\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020_\u0012\u0004\u0012\u00020#0^0^0\u0007X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u001e\u0010\u0091\u0001\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\u000e
                                                   \u0005\b\u0093\u0001\u0010\u0011\u001a\u0005\b\u0092\u0001\u0010\u0015R\u007f\u0010\u0094\u0001\u001an\u00120\u0012.\u0012\f\u0012
                                                    /*\u0004\u0018\u00010.0. /*\u0015\u0012\f\u0012
                                                    /*\u0004\u0018\u00010.0.0 ¢\u0006\u0002\b00-¢\u0006\u0002\b0 /*6\u00120\u0012.\u0012\f\u0012
                                                    /*\u0004\u0018\u00010.0. /*\u0015\u0012\f\u0012
                                                    /*\u0004\u0018\u00010.0.0 ¢\u0006\u0002\b00-¢\u0006\u0002\b0\u0018\u00010]0]¢\u0006	
                                                   \u0000\u001a\u0005\b\u0095\u0001\u0010aR\u001e\u0010\u0096\u0001\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\u000e
                                                   \u0005\b\u0098\u0001\u0010\u0011\u001a\u0005\b\u0097\u0001\u0010\u0015R\u0019\u0010\u0099\u0001\u001a\b\u0012\u0004\u0012\u00020Y0\u0007¢\u0006	
                                                   \u0000\u001a\u0005\b\u009a\u0001\u0010eR \u0010\u009b\u0001\u001a\u00030\u009c\u00018BX\u0082\u0084\u0002¢\u0006\u000f
                                                   \u0005\b\u009f\u0001\u0010\u0011\u001a\u0006\b\u009d\u0001\u0010\u009e\u0001R\u001e\u0010 \u0001\u001a\u00020
                                                   8BX\u0082\u0084\u0002¢\u0006\u000e
                                                   \u0005\b¢\u0001\u0010\u0011\u001a\u0005\b¡\u0001\u0010\rR\u001e\u0010£\u0001\u001a\u0002088BX\u0082\u0084\u0002¢\u0006\u000e
                                                   \u0005\b¥\u0001\u0010\u0011\u001a\u0005\b¤\u0001\u0010:R\u0010\u0010¦\u0001\u001a\u00030§\u0001X\u0082\u000e¢\u0006\u0002
                                                   \u0000R\u0012\u0010¨\u0001\u001a\u0005\u0018\u00010©\u0001X\u0082\u000e¢\u0006\u0002
                                                   \u0000R \u0010ª\u0001\u001a\u00030«\u00018BX\u0082\u0084\u0002¢\u0006\u000f
                                                   \u0005\b®\u0001\u0010\u0011\u001a\u0006\b¬\u0001\u0010\u00ad\u0001R'\u0010¯\u0001\u001a\u0016\u0012\u0012\u0012\u0010\u0012\f\u0012
                                                    /*\u0004\u0018\u00010\b0\b0 0\u0007¢\u0006	
                                                   \u0000\u001a\u0005\b°\u0001\u0010eR \u0010±\u0001\u001a\u000f\u0012\u0004\u0012\u00020[\u0012\u0005\u0012\u00030²\u00010\u001f¢\u0006	
                                                   \u0000\u001a\u0005\b³\u0001\u0010+¨\u0006\u00e3\u0001²\u0006\f\u0010\u00e4\u0001\u001a\u00030«\u0001X\u008a\u0084\u0002""" }, d2 = { "Lgg/essential/gui/studio/CosmeticStudio;", "Lgg/essential/api/gui/EssentialGUI;", "Lgg/essential/api/gui/GuiRequiresTOS;", "()V", "buyButton", "Lgg/essential/elementa/UIComponent;", "buyButtonText", "Lgg/essential/elementa/state/BasicState;", "", "<set-?>", "Lgg/essential/elementa/components/UIContainer;", "buyContainer", "getBuyContainer", "()Lgg/essential/elementa/components/UIContainer;", "setBuyContainer", "(Lgg/essential/elementa/components/UIContainer;)V", "buyContainer$delegate", "Lkotlin/properties/ReadWriteProperty;", "cartBackground", "Lgg/essential/elementa/components/UIBlock;", "getCartBackground", "()Lgg/essential/elementa/components/UIBlock;", "cartBackground$delegate", "cartButtonContainer", "getCartButtonContainer", "()Lgg/essential/elementa/UIComponent;", "cartButtonContainer$delegate", "cartContainer", "getCartContainer", "cartContainer$delegate", "cartCosmetics", "Lgg/essential/elementa/state/MappedState;", "", "", "Lkotlin/Pair;", "Lgg/essential/network/cosmetics/Cosmetic;", "cartIcon", "Lgg/essential/gui/common/shadow/ShadowIcon;", "getCartIcon", "()Lgg/essential/gui/common/shadow/ShadowIcon;", "cartIcon$delegate", "cartItems", "getCartItems", "()Lgg/essential/elementa/state/MappedState;", "cartPrice", "", "Lgg/essential/gui/state/Sale;", "kotlin.jvm.PlatformType", "Lorg/jetbrains/annotations/NotNull;", "", "cartQuantityContainer", "Lgg/essential/gui/common/EssentialQuantityIndicator;", "getCartQuantityContainer", "()Lgg/essential/gui/common/EssentialQuantityIndicator;", "cartQuantityContainer$delegate", "cartText", "Lgg/essential/gui/common/shadow/EssentialUIText;", "getCartText", "()Lgg/essential/gui/common/shadow/EssentialUIText;", "cartText$delegate", "categoriesContainer", "Lgg/essential/gui/studio/CategoriesSection;", "getCategoriesContainer", "()Lgg/essential/gui/studio/CategoriesSection;", "categoriesContainer$delegate", "categoryDescription", "Lgg/essential/elementa/components/UIWrappedText;", "getCategoryDescription", "()Lgg/essential/elementa/components/UIWrappedText;", "categoryDescription$delegate", "categoryDescriptionBottomSpacer", "Lgg/essential/gui/common/Spacer;", "getCategoryDescriptionBottomSpacer", "()Lgg/essential/gui/common/Spacer;", "categoryDescriptionBottomSpacer$delegate", "categoryDescriptionContainer", "getCategoryDescriptionContainer", "categoryDescriptionContainer$delegate", "categoryDescriptionTopSpacer", "getCategoryDescriptionTopSpacer", "categoryDescriptionTopSpacer$delegate", "consistentSpacer", "getConsistentSpacer", "consistentSpacer$delegate", "cosmeticsManager", "Lgg/essential/network/connectionmanager/cosmetics/CosmeticsManager;", "getCosmeticsManager", "()Lgg/essential/network/connectionmanager/cosmetics/CosmeticsManager;", "descriptionText", "Lgg/essential/gui/studio/CosmeticStudio$Category;", "descriptionVisible", "", "equippedCosmeticsState", "Lgg/essential/elementa/state/State;", "", "Lgg/essential/mod/cosmetics/CosmeticSlot;", "getEquippedCosmeticsState", "()Lgg/essential/elementa/state/State;", "equippedOutfit", "", "getEquippedOutfit", "()Lgg/essential/elementa/state/BasicState;", "explicitCartItems", "getExplicitCartItems", "firstDivider", "getFirstDivider", "firstDivider$delegate", "formattedPrice", "giftButton", "Lgg/essential/gui/studio/GiftButton;", "implicitCartItems", "getImplicitCartItems", "inCart", "indicatorBackground", "Ljava/awt/Color;", "isInitialized", "noticeClearList", "optionsContainer", "getOptionsContainer", "optionsContainer$delegate", "optionsScrollBar", "getOptionsScrollBar", "optionsScrollBar$delegate", "optionsView", "Lgg/essential/elementa/components/ScrollComponent;", "getOptionsView", "()Lgg/essential/elementa/components/ScrollComponent;", "optionsView$delegate", "optionsViewContainer", "getOptionsViewContainer", "optionsViewContainer$delegate", "playerDisplayContainer", "Lgg/essential/gui/studio/PlayerSection;", "getPlayerDisplayContainer", "()Lgg/essential/gui/studio/PlayerSection;", "playerDisplayContainer$delegate", "playerRotationMode", "Lgg/essential/gui/studio/CosmeticStudio$RotationMode;", "getPlayerRotationMode", "()Lgg/essential/gui/studio/CosmeticStudio$RotationMode;", "setPlayerRotationMode", "(Lgg/essential/gui/studio/CosmeticStudio$RotationMode;)V", "previewingCosmetics", "getPreviewingCosmetics", "previewingOutfits", "priceBlock", "getPriceBlock", "priceBlock$delegate", "saleState", "getSaleState", "secondDivider", "getSecondDivider", "secondDivider$delegate", "selectedCategory", "getSelectedCategory", "sortOptions", "Lgg/essential/gui/common/EssentialDropDown;", "getSortOptions", "()Lgg/essential/gui/common/EssentialDropDown;", "sortOptions$delegate", "sortOptionsContainer", "getSortOptionsContainer", "sortOptionsContainer$delegate", "sortText", "getSortText", "sortText$delegate", "systemTime", "", "tooSmallNotice", "Lgg/essential/gui/common/GuiTooSmallOverlay;", "totalPrice", "Lgg/essential/elementa/components/UIText;", "getTotalPrice", "()Lgg/essential/elementa/components/UIText;", "totalPrice$delegate", "unlockedCosmetics", "getUnlockedCosmetics", "view", "Lgg/essential/gui/studio/CosmeticOption$View;", "getView", "afterInitialization", "", "changeOutfit", "offset", "filterAndSortCosmeticOptions", "category", "getEquippedCosmetics", "handleResize", "nameSorter", "Lkotlin/Function1;", "", "onDrawScreen", "matrixStack", "Lgg/essential/universal/UMatrixStack;", "mouseX", "mouseY", "partialTicks", "", "onScreenClose", "populateCosmetics", "processPurchase", "newItems", "purchase", "giftTo", "callback", "Lkotlin/Function0;", "queueNoticeClear", "id", "resize", "mcIn", "Lnet/minecraft/client/MinecraftClient;", "w", "h", "sortCosmeticOptions", "sortOption", "Lgg/essential/gui/studio/CosmeticStudio$SortOption;", "typeSorter", "updateGuiScale", "updatePreviewingCosmetics", "update", "", "Lkotlin/ExtensionFunctionType;", "Category", "Companion", "CosmeticDivider", "RotationMode", "SortOption", "essential", "categoryTitle" })
public final class CosmeticStudio extends EssentialGUI implements GuiRequiresTOS
{
    @NotNull
    public static final Companion Companion;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties;
    @NotNull
    private final CosmeticsManager cosmeticsManager;
    private boolean isInitialized;
    @NotNull
    private RotationMode playerRotationMode;
    @NotNull
    private final BasicState<Category> selectedCategory;
    @NotNull
    private final MappedState<Category, Boolean> inCart;
    @NotNull
    private final MappedState<Boolean, CosmeticOption.View> view;
    private long systemTime;
    @NotNull
    private final MappedState<Boolean, Color> indicatorBackground;
    private final State<Set<Sale>> saleState;
    @NotNull
    private final Set<String> noticeClearList;
    @NotNull
    private final BasicState<Integer> equippedOutfit;
    @NotNull
    private final BasicState<Map<Integer, Map<CosmeticSlot, Cosmetic>>> previewingOutfits;
    @NotNull
    private final State<Map<CosmeticSlot, Cosmetic>> previewingCosmetics;
    @NotNull
    private final State<Map<CosmeticSlot, String>> equippedCosmeticsState;
    @NotNull
    private final BasicState<Set<String>> explicitCartItems;
    @NotNull
    private final MappedState<Map<CosmeticSlot, Cosmetic>, Set<String>> implicitCartItems;
    @NotNull
    private final MappedState<Pair<Set<String>, Set<String>>, Set<String>> cartItems;
    @NotNull
    private final MappedState<Set<String>, List<Pair<String, Cosmetic>>> cartCosmetics;
    @NotNull
    private final MappedState<Pair<List<Pair<String, Cosmetic>>, Set<Sale>>, Double> cartPrice;
    @NotNull
    private final MappedState<Double, String> formattedPrice;
    @NotNull
    private final BasicState<Set<String>> unlockedCosmetics;
    @NotNull
    private final ReadWriteProperty categoriesContainer$delegate;
    @NotNull
    private final ReadWriteProperty cartButtonContainer$delegate;
    @NotNull
    private final ReadWriteProperty firstDivider$delegate;
    @NotNull
    private final ReadWriteProperty optionsContainer$delegate;
    @NotNull
    private final ReadWriteProperty secondDivider$delegate;
    @NotNull
    private final ReadWriteProperty playerDisplayContainer$delegate;
    @NotNull
    private final ReadWriteProperty cartBackground$delegate;
    @NotNull
    private final MappedState<Category, String> descriptionText;
    @NotNull
    private final MappedState<String, Boolean> descriptionVisible;
    @NotNull
    private final ReadWriteProperty optionsViewContainer$delegate;
    @NotNull
    private final ReadWriteProperty optionsView$delegate;
    @NotNull
    private final ReadWriteProperty categoryDescriptionContainer$delegate;
    @NotNull
    private final ReadWriteProperty optionsScrollBar$delegate;
    @NotNull
    private final ReadWriteProperty cartContainer$delegate;
    @NotNull
    private final ReadWriteProperty priceBlock$delegate;
    @NotNull
    private final ReadWriteProperty buyContainer$delegate;
    @NotNull
    private final BasicState<String> buyButtonText;
    @NotNull
    private final UIComponent buyButton;
    @NotNull
    private final ReadWriteProperty sortOptionsContainer$delegate;
    @NotNull
    private final ReadWriteProperty sortOptions$delegate;
    @Nullable
    private GuiTooSmallOverlay tooSmallNotice;
    @NotNull
    private static final CosmeticSlot[] slotOrder;
    
    public CosmeticStudio() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getstatic       gg/essential/elementa/ElementaVersion.V1:Lgg/essential/elementa/ElementaVersion;
        //     4: ldc_w           "Wardrobe"
        //     7: iconst_0       
        //     8: iconst_0       
        //     9: ldc_w           "Customizing their character"
        //    12: bipush          12
        //    14: aconst_null    
        //    15: invokespecial   gg/essential/api/gui/EssentialGUI.<init>:(Lgg/essential/elementa/ElementaVersion;Ljava/lang/String;IZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //    18: aload_0         /* this */
        //    19: invokestatic    gg/essential/Essential.getInstance:()Lgg/essential/Essential;
        //    22: invokevirtual   gg/essential/Essential.getConnectionManager:()Lgg/essential/network/connectionmanager/ConnectionManager;
        //    25: invokevirtual   gg/essential/network/connectionmanager/ConnectionManager.getCosmeticsManager:()Lgg/essential/network/connectionmanager/cosmetics/CosmeticsManager;
        //    28: astore_1       
        //    29: aload_1        
        //    30: ldc_w           "getInstance().connectionManager.cosmeticsManager"
        //    33: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //    36: aload_1        
        //    37: putfield        gg/essential/gui/studio/CosmeticStudio.cosmeticsManager:Lgg/essential/network/connectionmanager/cosmetics/CosmeticsManager;
        //    40: aload_0         /* this */
        //    41: getstatic       gg/essential/gui/studio/CosmeticStudio$RotationMode.NONE:Lgg/essential/gui/studio/CosmeticStudio$RotationMode;
        //    44: putfield        gg/essential/gui/studio/CosmeticStudio.playerRotationMode:Lgg/essential/gui/studio/CosmeticStudio$RotationMode;
        //    47: aload_0         /* this */
        //    48: new             Lgg/essential/elementa/state/BasicState;
        //    51: dup            
        //    52: getstatic       gg/essential/gui/studio/CosmeticStudio$Category$Owned.INSTANCE:Lgg/essential/gui/studio/CosmeticStudio$Category$Owned;
        //    55: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //    58: putfield        gg/essential/gui/studio/CosmeticStudio.selectedCategory:Lgg/essential/elementa/state/BasicState;
        //    61: aload_0         /* this */
        //    62: aload_0         /* this */
        //    63: getfield        gg/essential/gui/studio/CosmeticStudio.selectedCategory:Lgg/essential/elementa/state/BasicState;
        //    66: getstatic       gg/essential/gui/studio/CosmeticStudio$inCart$1.INSTANCE:Lgg/essential/gui/studio/CosmeticStudio$inCart$1;
        //    69: checkcast       Lkotlin/jvm/functions/Function1;
        //    72: invokevirtual   gg/essential/elementa/state/BasicState.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //    75: putfield        gg/essential/gui/studio/CosmeticStudio.inCart:Lgg/essential/elementa/state/MappedState;
        //    78: aload_0         /* this */
        //    79: aload_0         /* this */
        //    80: getfield        gg/essential/gui/studio/CosmeticStudio.inCart:Lgg/essential/elementa/state/MappedState;
        //    83: getstatic       gg/essential/gui/studio/CosmeticStudio$view$1.INSTANCE:Lgg/essential/gui/studio/CosmeticStudio$view$1;
        //    86: checkcast       Lkotlin/jvm/functions/Function1;
        //    89: invokevirtual   gg/essential/elementa/state/MappedState.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //    92: putfield        gg/essential/gui/studio/CosmeticStudio.view:Lgg/essential/elementa/state/MappedState;
        //    95: aload_0         /* this */
        //    96: invokestatic    java/lang/System.currentTimeMillis:()J
        //    99: putfield        gg/essential/gui/studio/CosmeticStudio.systemTime:J
        //   102: aload_0         /* this */
        //   103: aload_0         /* this */
        //   104: getfield        gg/essential/gui/studio/CosmeticStudio.inCart:Lgg/essential/elementa/state/MappedState;
        //   107: getstatic       gg/essential/gui/studio/CosmeticStudio$indicatorBackground$1.INSTANCE:Lgg/essential/gui/studio/CosmeticStudio$indicatorBackground$1;
        //   110: checkcast       Lkotlin/jvm/functions/Function1;
        //   113: invokevirtual   gg/essential/elementa/state/MappedState.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //   116: putfield        gg/essential/gui/studio/CosmeticStudio.indicatorBackground:Lgg/essential/elementa/state/MappedState;
        //   119: aload_0         /* this */
        //   120: invokestatic    gg/essential/Essential.getInstance:()Lgg/essential/Essential;
        //   123: invokevirtual   gg/essential/Essential.getConnectionManager:()Lgg/essential/network/connectionmanager/ConnectionManager;
        //   126: invokevirtual   gg/essential/network/connectionmanager/ConnectionManager.getNoticesManager:()Lgg/essential/network/connectionmanager/notices/NoticesManager;
        //   129: invokevirtual   gg/essential/network/connectionmanager/notices/NoticesManager.getSaleNoticeManager:()Lgg/essential/network/connectionmanager/notices/NoticesManager$SaleNoticeManager;
        //   132: invokevirtual   gg/essential/network/connectionmanager/notices/NoticesManager$SaleNoticeManager.getSaleState:()Lgg/essential/elementa/state/State;
        //   135: putfield        gg/essential/gui/studio/CosmeticStudio.saleState:Lgg/essential/elementa/state/State;
        //   138: aload_0         /* this */
        //   139: new             Ljava/util/LinkedHashSet;
        //   142: dup            
        //   143: invokespecial   java/util/LinkedHashSet.<init>:()V
        //   146: checkcast       Ljava/util/Set;
        //   149: putfield        gg/essential/gui/studio/CosmeticStudio.noticeClearList:Ljava/util/Set;
        //   152: aload_0         /* this */
        //   153: aload_0         /* this */
        //   154: getfield        gg/essential/gui/studio/CosmeticStudio.cosmeticsManager:Lgg/essential/network/connectionmanager/cosmetics/CosmeticsManager;
        //   157: invokevirtual   gg/essential/network/connectionmanager/cosmetics/CosmeticsManager.getOrderedOutfits:()Ljava/util/List;
        //   160: astore_1       
        //   161: aload_1        
        //   162: ldc_w           "cosmeticsManager.orderedOutfits"
        //   165: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   168: aload_1        
        //   169: astore_1       
        //   170: astore          10
        //   172: iconst_0       
        //   173: istore_3        /* index$iv */
        //   174: aload_1         /* $this$indexOfFirst$iv */
        //   175: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   180: astore          4
        //   182: aload           4
        //   184: invokeinterface java/util/Iterator.hasNext:()Z
        //   189: ifeq            226
        //   192: aload           4
        //   194: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   199: astore          item$iv
        //   201: aload           item$iv
        //   203: checkcast       Lgg/essential/mod/cosmetics/CosmeticOutfit;
        //   206: astore          it
        //   208: aload           it
        //   210: invokevirtual   gg/essential/mod/cosmetics/CosmeticOutfit.isSelected:()Z
        //   213: ifeq            220
        //   216: iload_3         /* index$iv */
        //   217: goto            227
        //   220: iinc            index$iv, 1
        //   223: goto            182
        //   226: iconst_m1      
        //   227: istore          11
        //   229: aload           10
        //   231: iload           11
        //   233: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   236: astore          14
        //   238: new             Lgg/essential/elementa/state/BasicState;
        //   241: dup            
        //   242: aload           14
        //   244: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //   247: putfield        gg/essential/gui/studio/CosmeticStudio.equippedOutfit:Lgg/essential/elementa/state/BasicState;
        //   250: aload_0         /* this */
        //   251: new             Lgg/essential/elementa/state/BasicState;
        //   254: dup            
        //   255: invokestatic    kotlin/collections/MapsKt.emptyMap:()Ljava/util/Map;
        //   258: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //   261: putfield        gg/essential/gui/studio/CosmeticStudio.previewingOutfits:Lgg/essential/elementa/state/BasicState;
        //   264: aload_0         /* this */
        //   265: aload_0         /* this */
        //   266: getfield        gg/essential/gui/studio/CosmeticStudio.previewingOutfits:Lgg/essential/elementa/state/BasicState;
        //   269: aload_0         /* this */
        //   270: getfield        gg/essential/gui/studio/CosmeticStudio.equippedOutfit:Lgg/essential/elementa/state/BasicState;
        //   273: checkcast       Lgg/essential/elementa/state/State;
        //   276: invokevirtual   gg/essential/elementa/state/BasicState.zip:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/state/State;
        //   279: getstatic       gg/essential/gui/studio/CosmeticStudio$previewingCosmetics$1.INSTANCE:Lgg/essential/gui/studio/CosmeticStudio$previewingCosmetics$1;
        //   282: checkcast       Lkotlin/jvm/functions/Function1;
        //   285: invokevirtual   gg/essential/elementa/state/State.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //   288: checkcast       Lgg/essential/elementa/state/State;
        //   291: putfield        gg/essential/gui/studio/CosmeticStudio.previewingCosmetics:Lgg/essential/elementa/state/State;
        //   294: aload_0         /* this */
        //   295: aload_0         /* this */
        //   296: invokevirtual   gg/essential/gui/studio/CosmeticStudio.getWindow:()Lgg/essential/elementa/components/Window;
        //   299: checkcast       Lgg/essential/elementa/UIComponent;
        //   302: new             Lgg/essential/gui/studio/CosmeticStudio$equippedCosmeticsState$1;
        //   305: dup            
        //   306: aload_0         /* this */
        //   307: invokespecial   gg/essential/gui/studio/CosmeticStudio$equippedCosmeticsState$1.<init>:(Lgg/essential/gui/studio/CosmeticStudio;)V
        //   310: checkcast       Lkotlin/jvm/functions/Function0;
        //   313: invokestatic    gg/essential/util/ExtensionsKt.pollingState$default$a9b5a09$5bde5825:(Lgg/essential/elementa/UIComponent;Lkotlin/jvm/functions/Function0;)Lgg/essential/elementa/state/State;
        //   316: putfield        gg/essential/gui/studio/CosmeticStudio.equippedCosmeticsState:Lgg/essential/elementa/state/State;
        //   319: aload_0         /* this */
        //   320: new             Lgg/essential/elementa/state/BasicState;
        //   323: dup            
        //   324: invokestatic    kotlin/collections/SetsKt.emptySet:()Ljava/util/Set;
        //   327: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //   330: putfield        gg/essential/gui/studio/CosmeticStudio.explicitCartItems:Lgg/essential/elementa/state/BasicState;
        //   333: aload_0         /* this */
        //   334: aload_0         /* this */
        //   335: getfield        gg/essential/gui/studio/CosmeticStudio.previewingCosmetics:Lgg/essential/elementa/state/State;
        //   338: getstatic       gg/essential/gui/studio/CosmeticStudio$implicitCartItems$1.INSTANCE:Lgg/essential/gui/studio/CosmeticStudio$implicitCartItems$1;
        //   341: checkcast       Lkotlin/jvm/functions/Function1;
        //   344: invokevirtual   gg/essential/elementa/state/State.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //   347: putfield        gg/essential/gui/studio/CosmeticStudio.implicitCartItems:Lgg/essential/elementa/state/MappedState;
        //   350: aload_0         /* this */
        //   351: aload_0         /* this */
        //   352: getfield        gg/essential/gui/studio/CosmeticStudio.explicitCartItems:Lgg/essential/elementa/state/BasicState;
        //   355: aload_0         /* this */
        //   356: getfield        gg/essential/gui/studio/CosmeticStudio.implicitCartItems:Lgg/essential/elementa/state/MappedState;
        //   359: checkcast       Lgg/essential/elementa/state/State;
        //   362: invokevirtual   gg/essential/elementa/state/BasicState.zip:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/state/State;
        //   365: getstatic       gg/essential/gui/studio/CosmeticStudio$cartItems$1.INSTANCE:Lgg/essential/gui/studio/CosmeticStudio$cartItems$1;
        //   368: checkcast       Lkotlin/jvm/functions/Function1;
        //   371: invokevirtual   gg/essential/elementa/state/State.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //   374: putfield        gg/essential/gui/studio/CosmeticStudio.cartItems:Lgg/essential/elementa/state/MappedState;
        //   377: aload_0         /* this */
        //   378: aload_0         /* this */
        //   379: getfield        gg/essential/gui/studio/CosmeticStudio.cartItems:Lgg/essential/elementa/state/MappedState;
        //   382: new             Lgg/essential/gui/studio/CosmeticStudio$cartCosmetics$1;
        //   385: dup            
        //   386: aload_0         /* this */
        //   387: invokespecial   gg/essential/gui/studio/CosmeticStudio$cartCosmetics$1.<init>:(Lgg/essential/gui/studio/CosmeticStudio;)V
        //   390: checkcast       Lkotlin/jvm/functions/Function1;
        //   393: invokevirtual   gg/essential/elementa/state/MappedState.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //   396: putfield        gg/essential/gui/studio/CosmeticStudio.cartCosmetics:Lgg/essential/elementa/state/MappedState;
        //   399: aload_0         /* this */
        //   400: aload_0         /* this */
        //   401: getfield        gg/essential/gui/studio/CosmeticStudio.cartCosmetics:Lgg/essential/elementa/state/MappedState;
        //   404: aload_0         /* this */
        //   405: getfield        gg/essential/gui/studio/CosmeticStudio.saleState:Lgg/essential/elementa/state/State;
        //   408: astore_1       
        //   409: aload_1        
        //   410: ldc_w           "saleState"
        //   413: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   416: aload_1        
        //   417: invokevirtual   gg/essential/elementa/state/MappedState.zip:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/state/State;
        //   420: getstatic       gg/essential/gui/studio/CosmeticStudio$cartPrice$1.INSTANCE:Lgg/essential/gui/studio/CosmeticStudio$cartPrice$1;
        //   423: checkcast       Lkotlin/jvm/functions/Function1;
        //   426: invokevirtual   gg/essential/elementa/state/State.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //   429: putfield        gg/essential/gui/studio/CosmeticStudio.cartPrice:Lgg/essential/elementa/state/MappedState;
        //   432: aload_0         /* this */
        //   433: aload_0         /* this */
        //   434: getfield        gg/essential/gui/studio/CosmeticStudio.cartPrice:Lgg/essential/elementa/state/MappedState;
        //   437: getstatic       gg/essential/gui/studio/CosmeticStudio$formattedPrice$1.INSTANCE:Lgg/essential/gui/studio/CosmeticStudio$formattedPrice$1;
        //   440: checkcast       Lkotlin/jvm/functions/Function1;
        //   443: invokevirtual   gg/essential/elementa/state/MappedState.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //   446: putfield        gg/essential/gui/studio/CosmeticStudio.formattedPrice:Lgg/essential/elementa/state/MappedState;
        //   449: aload_0         /* this */
        //   450: new             Lgg/essential/elementa/state/BasicState;
        //   453: dup            
        //   454: aload_0         /* this */
        //   455: getfield        gg/essential/gui/studio/CosmeticStudio.cosmeticsManager:Lgg/essential/network/connectionmanager/cosmetics/CosmeticsManager;
        //   458: invokevirtual   gg/essential/network/connectionmanager/cosmetics/CosmeticsManager.getUnlockedCosmetics:()Ljava/util/Set;
        //   461: astore_1       
        //   462: aload_1        
        //   463: ldc_w           "cosmeticsManager.unlockedCosmetics"
        //   466: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   469: aload_1        
        //   470: checkcast       Ljava/lang/Iterable;
        //   473: invokestatic    kotlin/collections/CollectionsKt.toSet:(Ljava/lang/Iterable;)Ljava/util/Set;
        //   476: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //   479: putfield        gg/essential/gui/studio/CosmeticStudio.unlockedCosmetics:Lgg/essential/elementa/state/BasicState;
        //   482: aload_0         /* this */
        //   483: new             Lgg/essential/gui/studio/CategoriesSection;
        //   486: dup            
        //   487: aload_0         /* this */
        //   488: invokespecial   gg/essential/gui/studio/CategoriesSection.<init>:(Lgg/essential/gui/studio/CosmeticStudio;)V
        //   491: checkcast       Lgg/essential/elementa/UIComponent;
        //   494: astore_1        /* $this$constrain$iv */
        //   495: aload_1         /* $this$constrain$iv */
        //   496: astore_3       
        //   497: aload_3        
        //   498: astore          $this$constrain_u24lambda_u2d0$iv
        //   500: aload           $this$constrain_u24lambda_u2d0$iv
        //   502: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   505: astore          6
        //   507: astore          10
        //   509: aload           $this$categoriesContainer_delegate_u24lambda_u2d1
        //   511: ldc_w           127.0
        //   514: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //   517: checkcast       Ljava/lang/Number;
        //   520: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   523: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   526: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   529: aload           $this$categoriesContainer_delegate_u24lambda_u2d1
        //   531: bipush          100
        //   533: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   536: checkcast       Ljava/lang/Number;
        //   539: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   542: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   545: ldc_w           25.0
        //   548: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //   551: checkcast       Ljava/lang/Number;
        //   554: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   557: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   560: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.minus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/SubtractiveConstraint;
        //   563: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   566: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   569: getstatic       kotlin/Unit.INSTANCE:Lkotlin/Unit;
        //   572: pop            
        //   573: aload           10
        //   575: aload_3        
        //   576: aload_0         /* this */
        //   577: invokevirtual   gg/essential/gui/studio/CosmeticStudio.getContent:()Lgg/essential/elementa/components/UIContainer;
        //   580: checkcast       Lgg/essential/elementa/UIComponent;
        //   583: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   586: aload_0         /* this */
        //   587: getstatic       gg/essential/gui/studio/CosmeticStudio.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   590: iconst_0       
        //   591: aaload         
        //   592: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   595: putfield        gg/essential/gui/studio/CosmeticStudio.categoriesContainer$delegate:Lkotlin/properties/ReadWriteProperty;
        //   598: aload_0         /* this */
        //   599: new             Lgg/essential/elementa/components/UIContainer;
        //   602: dup            
        //   603: invokespecial   gg/essential/elementa/components/UIContainer.<init>:()V
        //   606: checkcast       Lgg/essential/elementa/UIComponent;
        //   609: astore_1        /* $this$constrain$iv */
        //   610: aload_1         /* $this$constrain$iv */
        //   611: astore_3       
        //   612: aload_3        
        //   613: astore          $this$constrain_u24lambda_u2d0$iv
        //   615: aload           $this$constrain_u24lambda_u2d0$iv
        //   617: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   620: astore          6
        //   622: astore          10
        //   624: aload           $this$cartButtonContainer_delegate_u24lambda_u2d2
        //   626: new             Lgg/essential/elementa/constraints/CopyConstraintFloat;
        //   629: dup            
        //   630: iconst_0       
        //   631: iconst_1       
        //   632: aconst_null    
        //   633: invokespecial   gg/essential/elementa/constraints/CopyConstraintFloat.<init>:(ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   636: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   639: aload_0         /* this */
        //   640: invokespecial   gg/essential/gui/studio/CosmeticStudio.getCategoriesContainer:()Lgg/essential/gui/studio/CategoriesSection;
        //   643: checkcast       Lgg/essential/elementa/UIComponent;
        //   646: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.boundTo:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/constraints/SuperConstraint;
        //   649: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   652: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   655: aload           $this$cartButtonContainer_delegate_u24lambda_u2d2
        //   657: iconst_0       
        //   658: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   661: checkcast       Ljava/lang/Number;
        //   664: iconst_1       
        //   665: iconst_0       
        //   666: iconst_2       
        //   667: aconst_null    
        //   668: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels$default:(Ljava/lang/Number;ZZILjava/lang/Object;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   671: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   674: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   677: aload           $this$cartButtonContainer_delegate_u24lambda_u2d2
        //   679: ldc_w           25.0
        //   682: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //   685: checkcast       Ljava/lang/Number;
        //   688: iconst_0       
        //   689: iconst_0       
        //   690: iconst_3       
        //   691: aconst_null    
        //   692: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels$default:(Ljava/lang/Number;ZZILjava/lang/Object;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   695: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   698: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   701: aload           $this$cartButtonContainer_delegate_u24lambda_u2d2
        //   703: bipush          100
        //   705: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   708: checkcast       Ljava/lang/Number;
        //   711: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   714: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   717: aload_0         /* this */
        //   718: invokespecial   gg/essential/gui/studio/CosmeticStudio.getCategoriesContainer:()Lgg/essential/gui/studio/CategoriesSection;
        //   721: checkcast       Lgg/essential/elementa/UIComponent;
        //   724: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.boundTo:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/constraints/SuperConstraint;
        //   727: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   730: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   733: getstatic       kotlin/Unit.INSTANCE:Lkotlin/Unit;
        //   736: pop            
        //   737: aload           10
        //   739: aload_3        
        //   740: astore_1        /* $this$constrain$iv */
        //   741: aload_1         /* $this$onLeftClick$iv */
        //   742: new             Lgg/essential/gui/studio/CosmeticStudio$special$$inlined$onLeftClick$1;
        //   745: dup            
        //   746: aload_0         /* this */
        //   747: invokespecial   gg/essential/gui/studio/CosmeticStudio$special$$inlined$onLeftClick$1.<init>:(Lgg/essential/gui/studio/CosmeticStudio;)V
        //   750: checkcast       Lkotlin/jvm/functions/Function2;
        //   753: invokevirtual   gg/essential/elementa/UIComponent.onMouseClick:(Lkotlin/jvm/functions/Function2;)Lgg/essential/elementa/UIComponent;
        //   756: aload_0         /* this */
        //   757: invokevirtual   gg/essential/gui/studio/CosmeticStudio.getContent:()Lgg/essential/elementa/components/UIContainer;
        //   760: checkcast       Lgg/essential/elementa/UIComponent;
        //   763: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   766: aload_0         /* this */
        //   767: getstatic       gg/essential/gui/studio/CosmeticStudio.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   770: iconst_1       
        //   771: aaload         
        //   772: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   775: putfield        gg/essential/gui/studio/CosmeticStudio.cartButtonContainer$delegate:Lkotlin/properties/ReadWriteProperty;
        //   778: aload_0         /* this */
        //   779: new             Lgg/essential/elementa/components/UIBlock;
        //   782: dup            
        //   783: getstatic       gg/essential/gui/EssentialPalette.COMPONENT_BACKGROUND:Ljava/awt/Color;
        //   786: invokespecial   gg/essential/elementa/components/UIBlock.<init>:(Ljava/awt/Color;)V
        //   789: checkcast       Lgg/essential/elementa/UIComponent;
        //   792: astore_1        /* $this$constrain$iv */
        //   793: aload_1         /* $this$constrain$iv */
        //   794: astore_3       
        //   795: aload_3        
        //   796: astore          $this$constrain_u24lambda_u2d0$iv
        //   798: aload           $this$constrain_u24lambda_u2d0$iv
        //   800: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   803: astore          6
        //   805: astore          10
        //   807: aload           $this$firstDivider_delegate_u24lambda_u2d4
        //   809: new             Lgg/essential/elementa/constraints/SiblingConstraint;
        //   812: dup            
        //   813: fconst_0       
        //   814: iconst_0       
        //   815: iconst_3       
        //   816: aconst_null    
        //   817: invokespecial   gg/essential/elementa/constraints/SiblingConstraint.<init>:(FZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   820: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   823: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   826: aload           $this$firstDivider_delegate_u24lambda_u2d4
        //   828: bipush          100
        //   830: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   833: checkcast       Ljava/lang/Number;
        //   836: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   839: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   842: aload_0         /* this */
        //   843: invokevirtual   gg/essential/gui/studio/CosmeticStudio.getRightDivider:()Lgg/essential/elementa/components/UIBlock;
        //   846: checkcast       Lgg/essential/elementa/UIComponent;
        //   849: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.boundTo:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/constraints/SuperConstraint;
        //   852: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   855: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   858: aload           $this$firstDivider_delegate_u24lambda_u2d4
        //   860: bipush          100
        //   862: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   865: checkcast       Ljava/lang/Number;
        //   868: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   871: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   874: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   877: getstatic       kotlin/Unit.INSTANCE:Lkotlin/Unit;
        //   880: pop            
        //   881: aload           10
        //   883: aload_3        
        //   884: aload_0         /* this */
        //   885: invokevirtual   gg/essential/gui/studio/CosmeticStudio.getContent:()Lgg/essential/elementa/components/UIContainer;
        //   888: checkcast       Lgg/essential/elementa/UIComponent;
        //   891: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   894: aload_0         /* this */
        //   895: getstatic       gg/essential/gui/studio/CosmeticStudio.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   898: iconst_2       
        //   899: aaload         
        //   900: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   903: putfield        gg/essential/gui/studio/CosmeticStudio.firstDivider$delegate:Lkotlin/properties/ReadWriteProperty;
        //   906: aload_0         /* this */
        //   907: new             Lgg/essential/elementa/components/UIContainer;
        //   910: dup            
        //   911: invokespecial   gg/essential/elementa/components/UIContainer.<init>:()V
        //   914: checkcast       Lgg/essential/elementa/UIComponent;
        //   917: astore_1        /* $this$constrain$iv */
        //   918: aload_1         /* $this$constrain$iv */
        //   919: astore_3       
        //   920: aload_3        
        //   921: astore          $this$constrain_u24lambda_u2d0$iv
        //   923: aload           $this$constrain_u24lambda_u2d0$iv
        //   925: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   928: astore          6
        //   930: astore          10
        //   932: aload           $this$optionsContainer_delegate_u24lambda_u2d5
        //   934: new             Lgg/essential/elementa/constraints/SiblingConstraint;
        //   937: dup            
        //   938: fconst_0       
        //   939: iconst_0       
        //   940: iconst_3       
        //   941: aconst_null    
        //   942: invokespecial   gg/essential/elementa/constraints/SiblingConstraint.<init>:(FZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   945: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   948: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   951: aload           $this$optionsContainer_delegate_u24lambda_u2d5
        //   953: bipush          100
        //   955: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   958: checkcast       Ljava/lang/Number;
        //   961: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   964: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   967: ldc_w           127.0
        //   970: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //   973: checkcast       Ljava/lang/Number;
        //   976: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   979: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   982: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.minus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/SubtractiveConstraint;
        //   985: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   988: iconst_2       
        //   989: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   992: checkcast       Ljava/lang/Number;
        //   995: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   998: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //  1001: aload_0         /* this */
        //  1002: invokevirtual   gg/essential/gui/studio/CosmeticStudio.getOutlineThickness:()F
        //  1005: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //  1008: checkcast       Ljava/lang/Number;
        //  1011: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.times:(Lgg/essential/elementa/constraints/SuperConstraint;Ljava/lang/Number;)Lgg/essential/elementa/constraints/ScaleConstraint;
        //  1014: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //  1017: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.minus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/SubtractiveConstraint;
        //  1020: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //  1023: iconst_2       
        //  1024: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1027: checkcast       Ljava/lang/Number;
        //  1030: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.div:(Lgg/essential/elementa/constraints/SuperConstraint;Ljava/lang/Number;)Lgg/essential/elementa/constraints/ScaleConstraint;
        //  1033: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //  1036: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //  1039: aload           $this$optionsContainer_delegate_u24lambda_u2d5
        //  1041: bipush          100
        //  1043: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1046: checkcast       Ljava/lang/Number;
        //  1049: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //  1052: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //  1055: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //  1058: getstatic       kotlin/Unit.INSTANCE:Lkotlin/Unit;
        //  1061: pop            
        //  1062: aload           10
        //  1064: aload_3        
        //  1065: aload_0         /* this */
        //  1066: invokevirtual   gg/essential/gui/studio/CosmeticStudio.getContent:()Lgg/essential/elementa/components/UIContainer;
        //  1069: checkcast       Lgg/essential/elementa/UIComponent;
        //  1072: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //  1075: aload_0         /* this */
        //  1076: getstatic       gg/essential/gui/studio/CosmeticStudio.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //  1079: iconst_3       
        //  1080: aaload         
        //  1081: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //  1084: putfield        gg/essential/gui/studio/CosmeticStudio.optionsContainer$delegate:Lkotlin/properties/ReadWriteProperty;
        //  1087: aload_0         /* this */
        //  1088: new             Lgg/essential/elementa/components/UIBlock;
        //  1091: dup            
        //  1092: getstatic       gg/essential/gui/EssentialPalette.COMPONENT_BACKGROUND:Ljava/awt/Color;
        //  1095: invokespecial   gg/essential/elementa/components/UIBlock.<init>:(Ljava/awt/Color;)V
        //  1098: checkcast       Lgg/essential/elementa/UIComponent;
        //  1101: astore_1        /* $this$constrain$iv */
        //  1102: aload_1         /* $this$constrain$iv */
        //  1103: astore_3       
        //  1104: aload_3        
        //  1105: astore          $this$constrain_u24lambda_u2d0$iv
        //  1107: aload           $this$constrain_u24lambda_u2d0$iv
        //  1109: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //  1112: astore          6
        //  1114: astore          10
        //  1116: aload           $this$secondDivider_delegate_u24lambda_u2d6
        //  1118: new             Lgg/essential/elementa/constraints/SiblingConstraint;
        //  1121: dup            
        //  1122: fconst_0       
        //  1123: iconst_0       
        //  1124: iconst_3       
        //  1125: aconst_null    
        //  1126: invokespecial   gg/essential/elementa/constraints/SiblingConstraint.<init>:(FZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //  1129: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //  1132: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //  1135: aload           $this$secondDivider_delegate_u24lambda_u2d6
        //  1137: bipush          100
        //  1139: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1142: checkcast       Ljava/lang/Number;
        //  1145: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //  1148: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //  1151: aload_0         /* this */
        //  1152: invokevirtual   gg/essential/gui/studio/CosmeticStudio.getRightDivider:()Lgg/essential/elementa/components/UIBlock;
        //  1155: checkcast       Lgg/essential/elementa/UIComponent;
        //  1158: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.boundTo:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/constraints/SuperConstraint;
        //  1161: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //  1164: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //  1167: aload           $this$secondDivider_delegate_u24lambda_u2d6
        //  1169: bipush          100
        //  1171: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1174: checkcast       Ljava/lang/Number;
        //  1177: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //  1180: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //  1183: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //  1186: getstatic       kotlin/Unit.INSTANCE:Lkotlin/Unit;
        //  1189: pop            
        //  1190: aload           10
        //  1192: aload_3        
        //  1193: aload_0         /* this */
        //  1194: invokevirtual   gg/essential/gui/studio/CosmeticStudio.getContent:()Lgg/essential/elementa/components/UIContainer;
        //  1197: checkcast       Lgg/essential/elementa/UIComponent;
        //  1200: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //  1203: aload_0         /* this */
        //  1204: getstatic       gg/essential/gui/studio/CosmeticStudio.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //  1207: iconst_4       
        //  1208: aaload         
        //  1209: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //  1212: putfield        gg/essential/gui/studio/CosmeticStudio.secondDivider$delegate:Lkotlin/properties/ReadWriteProperty;
        //  1215: aload_0         /* this */
        //  1216: new             Lgg/essential/gui/studio/PlayerSection;
        //  1219: dup            
        //  1220: aload_0         /* this */
        //  1221: getfield        gg/essential/gui/studio/CosmeticStudio.equippedOutfit:Lgg/essential/elementa/state/BasicState;
        //  1224: aload_0         /* this */
        //  1225: invokespecial   gg/essential/gui/studio/PlayerSection.<init>:(Lgg/essential/elementa/state/BasicState;Lgg/essential/gui/studio/CosmeticStudio;)V
        //  1228: checkcast       Lgg/essential/elementa/UIComponent;
        //  1231: astore_1        /* $this$constrain$iv */
        //  1232: aload_1         /* $this$constrain$iv */
        //  1233: astore_3       
        //  1234: aload_3        
        //  1235: astore          $this$constrain_u24lambda_u2d0$iv
        //  1237: aload           $this$constrain_u24lambda_u2d0$iv
        //  1239: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //  1242: astore          6
        //  1244: astore          10
        //  1246: aload           $this$playerDisplayContainer_delegate_u24lambda_u2d7
        //  1248: new             Lgg/essential/elementa/constraints/SiblingConstraint;
        //  1251: dup            
        //  1252: fconst_0       
        //  1253: iconst_0       
        //  1254: iconst_3       
        //  1255: aconst_null    
        //  1256: invokespecial   gg/essential/elementa/constraints/SiblingConstraint.<init>:(FZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //  1259: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //  1262: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //  1265: aload           $this$playerDisplayContainer_delegate_u24lambda_u2d7
        //  1267: new             Lgg/essential/elementa/constraints/CopyConstraintFloat;
        //  1270: dup            
        //  1271: iconst_0       
        //  1272: iconst_1       
        //  1273: aconst_null    
        //  1274: invokespecial   gg/essential/elementa/constraints/CopyConstraintFloat.<init>:(ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //  1277: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //  1280: aload_0         /* this */
        //  1281: invokespecial   gg/essential/gui/studio/CosmeticStudio.getOptionsContainer:()Lgg/essential/elementa/components/UIContainer;
        //  1284: checkcast       Lgg/essential/elementa/UIComponent;
        //  1287: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.boundTo:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/constraints/SuperConstraint;
        //  1290: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //  1293: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //  1296: aload           $this$playerDisplayContainer_delegate_u24lambda_u2d7
        //  1298: bipush          100
        //  1300: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1303: checkcast       Ljava/lang/Number;
        //  1306: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //  1309: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //  1312: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //  1315: getstatic       kotlin/Unit.INSTANCE:Lkotlin/Unit;
        //  1318: pop            
        //  1319: aload           10
        //  1321: aload_3        
        //  1322: aload_0         /* this */
        //  1323: invokevirtual   gg/essential/gui/studio/CosmeticStudio.getContent:()Lgg/essential/elementa/components/UIContainer;
        //  1326: checkcast       Lgg/essential/elementa/UIComponent;
        //  1329: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //  1332: aload_0         /* this */
        //  1333: getstatic       gg/essential/gui/studio/CosmeticStudio.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //  1336: iconst_5       
        //  1337: aaload         
        //  1338: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //  1341: putfield        gg/essential/gui/studio/CosmeticStudio.playerDisplayContainer$delegate:Lkotlin/properties/ReadWriteProperty;
        //  1344: aload_0         /* this */
        //  1345: new             Lgg/essential/elementa/components/UIBlock;
        //  1348: dup            
        //  1349: aconst_null    
        //  1350: iconst_1       
        //  1351: aconst_null    
        //  1352: invokespecial   gg/essential/elementa/components/UIBlock.<init>:(Lgg/essential/elementa/constraints/ColorConstraint;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //  1355: checkcast       Lgg/essential/elementa/UIComponent;
        //  1358: astore_1        /* $this$constrain$iv */
        //  1359: aload_1         /* $this$constrain$iv */
        //  1360: astore_3       
        //  1361: aload_3        
        //  1362: astore          $this$constrain_u24lambda_u2d0$iv
        //  1364: aload           $this$constrain_u24lambda_u2d0$iv
        //  1366: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //  1369: astore          6
        //  1371: astore          10
        //  1373: aload           $this$cartBackground_delegate_u24lambda_u2d8
        //  1375: new             Lgg/essential/elementa/constraints/FillConstraint;
        //  1378: dup            
        //  1379: iconst_0       
        //  1380: invokespecial   gg/essential/elementa/constraints/FillConstraint.<init>:(Z)V
        //  1383: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //  1386: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //  1389: aload           $this$cartBackground_delegate_u24lambda_u2d8
        //  1391: new             Lgg/essential/elementa/constraints/FillConstraint;
        //  1394: dup            
        //  1395: iconst_0       
        //  1396: invokespecial   gg/essential/elementa/constraints/FillConstraint.<init>:(Z)V
        //  1399: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //  1402: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //  1405: getstatic       kotlin/Unit.INSTANCE:Lkotlin/Unit;
        //  1408: pop            
        //  1409: aload           10
        //  1411: aload_3        
        //  1412: aload_0         /* this */
        //  1413: invokespecial   gg/essential/gui/studio/CosmeticStudio.getCartButtonContainer:()Lgg/essential/elementa/UIComponent;
        //  1416: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //  1419: aload_0         /* this */
        //  1420: getstatic       gg/essential/gui/studio/CosmeticStudio.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //  1423: bipush          6
        //  1425: aaload         
        //  1426: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //  1429: putfield        gg/essential/gui/studio/CosmeticStudio.cartBackground$delegate:Lkotlin/properties/ReadWriteProperty;
        //  1432: new             Lgg/essential/gui/common/shadow/ShadowIcon;
        //  1435: dup            
        //  1436: getstatic       gg/essential/gui/EssentialPalette.SHOPPING_CART_16X:Lgg/essential/gui/image/ImageFactory;
        //  1439: invokespecial   gg/essential/gui/common/shadow/ShadowIcon.<init>:(Lgg/essential/gui/image/ImageFactory;)V
        //  1442: getstatic       gg/essential/gui/EssentialPalette.TEXT_HIGHLIGHT:Ljava/awt/Color;
        //  1445: invokestatic    gg/essential/gui/common/StateExtensionsKt.state:(Ljava/lang/Object;)Lgg/essential/elementa/state/BasicState;
        //  1448: checkcast       Lgg/essential/elementa/state/State;
        //  1451: invokevirtual   gg/essential/gui/common/shadow/ShadowIcon.rebindPrimaryColor:(Lgg/essential/elementa/state/State;)Lgg/essential/gui/common/shadow/ShadowIcon;
        //  1454: checkcast       Lgg/essential/elementa/UIComponent;
        //  1457: astore_1        /* $this$constrain$iv */
        //  1458: aload_1         /* $this$constrain$iv */
        //  1459: astore_3       
        //  1460: aload_3        
        //  1461: astore          $this$constrain_u24lambda_u2d0$iv
        //  1463: aload           $this$constrain_u24lambda_u2d0$iv
        //  1465: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //  1468: astore          $this$cartIcon_delegate_u24lambda_u2d9
        //  1470: aload           $this$cartIcon_delegate_u24lambda_u2d9
        //  1472: bipush          8
        //  1474: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1477: checkcast       Ljava/lang/Number;
        //  1480: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //  1483: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //  1486: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //  1489: aload           $this$cartIcon_delegate_u24lambda_u2d9
        //  1491: new             Lgg/essential/elementa/constraints/CenterConstraint;
        //  1494: dup            
        //  1495: invokespecial   gg/essential/elementa/constraints/CenterConstraint.<init>:()V
        //  1498: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //  1501: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //  1504: getstatic       kotlin/Unit.INSTANCE:Lkotlin/Unit;
        //  1507: pop            
        //  1508: aload_3        
        //  1509: aload_0         /* this */
        //  1510: invokespecial   gg/essential/gui/studio/CosmeticStudio.getCartButtonContainer:()Lgg/essential/elementa/UIComponent;
        //  1513: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //  1516: aload_0         /* this */
        //  1517: getstatic       gg/essential/gui/studio/CosmeticStudio.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //  1520: bipush          7
        //  1522: aaload         
        //  1523: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //  1526: pop            
        //  1527: new             Lgg/essential/gui/common/shadow/EssentialUIText;
        //  1530: dup            
        //  1531: ldc_w           "Cart"
        //  1534: iconst_0       
        //  1535: getstatic       gg/essential/gui/EssentialPalette.TEXT_SHADOW:Ljava/awt/Color;
        //  1538: iconst_0       
        //  1539: iconst_0       
        //  1540: iconst_0       
        //  1541: bipush          58
        //  1543: invokespecial   gg/essential/gui/common/shadow/EssentialUIText.<init>:(Ljava/lang/String;ZLjava/awt/Color;ZZZI)V
        //  1546: checkcast       Lgg/essential/elementa/UIComponent;
        //  1549: astore_1        /* $this$constrain$iv */
        //  1550: aload_1         /* $this$constrain$iv */
        //  1551: astore_3       
        //  1552: aload_3        
        //  1553: astore          $this$constrain_u24lambda_u2d0$iv
        //  1555: aload           $this$constrain_u24lambda_u2d0$iv
        //  1557: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //  1560: astore          $this$cartText_delegate_u24lambda_u2d10
        //  1562: aload           $this$cartText_delegate_u24lambda_u2d10
        //  1564: new             Lgg/essential/elementa/constraints/SiblingConstraint;
        //  1567: dup            
        //  1568: ldc_w           6.0
        //  1571: iconst_0       
        //  1572: iconst_2       
        //  1573: aconst_null    
        //  1574: invokespecial   gg/essential/elementa/constraints/SiblingConstraint.<init>:(FZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //  1577: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //  1580: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //  1583: aload           $this$cartText_delegate_u24lambda_u2d10
        //  1585: new             Lgg/essential/elementa/constraints/CenterConstraint;
        //  1588: dup            
        //  1589: invokespecial   gg/essential/elementa/constraints/CenterConstraint.<init>:()V
        //  1592: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //  1595: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //  1598: getstatic       kotlin/Unit.INSTANCE:Lkotlin/Unit;
        //  1601: pop            
        //  1602: aload_3        
        //  1603: aload_0         /* this */
        //  1604: invokespecial   gg/essential/gui/studio/CosmeticStudio.getCartButtonContainer:()Lgg/essential/elementa/UIComponent;
        //  1607: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //  1610: aload_0         /* this */
        //  1611: getstatic       gg/essential/gui/studio/CosmeticStudio.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //  1614: bipush          8
        //  1616: aaload         
        //  1617: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //  1620: pop            
        //  1621: new             Lgg/essential/gui/common/EssentialQuantityIndicator;
        //  1624: dup            
        //  1625: aload_0         /* this */
        //  1626: getfield        gg/essential/gui/studio/CosmeticStudio.cartItems:Lgg/essential/elementa/state/MappedState;
        //  1629: getstatic       gg/essential/gui/studio/CosmeticStudio$cartQuantityContainer$2.INSTANCE:Lgg/essential/gui/studio/CosmeticStudio$cartQuantityContainer$2;
        //  1632: checkcast       Lkotlin/jvm/functions/Function1;
        //  1635: invokevirtual   gg/essential/elementa/state/MappedState.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //  1638: checkcast       Lgg/essential/elementa/state/State;
        //  1641: aload_0         /* this */
        //  1642: getfield        gg/essential/gui/studio/CosmeticStudio.indicatorBackground:Lgg/essential/elementa/state/MappedState;
        //  1645: checkcast       Lgg/essential/elementa/state/State;
        //  1648: invokespecial   gg/essential/gui/common/EssentialQuantityIndicator.<init>:(Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;)V
        //  1651: checkcast       Lgg/essential/elementa/UIComponent;
        //  1654: astore_1        /* $this$constrain$iv */
        //  1655: aload_1         /* $this$constrain$iv */
        //  1656: astore_3       
        //  1657: aload_3        
        //  1658: astore          $this$constrain_u24lambda_u2d0$iv
        //  1660: aload           $this$constrain_u24lambda_u2d0$iv
        //  1662: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //  1665: astore          $this$cartQuantityContainer_delegate_u24lambda_u2d11
        //  1667: aload           $this$cartQuantityContainer_delegate_u24lambda_u2d11
        //  1669: bipush          8
        //  1671: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1674: checkcast       Ljava/lang/Number;
        //  1677: iconst_1       
        //  1678: iconst_0       
        //  1679: iconst_2       
        //  1680: aconst_null    
        //  1681: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels$default:(Ljava/lang/Number;ZZILjava/lang/Object;)Lgg/essential/elementa/constraints/PixelConstraint;
        //  1684: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //  1687: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //  1690: aload           $this$cartQuantityContainer_delegate_u24lambda_u2d11
        //  1692: new             Lgg/essential/elementa/constraints/CenterConstraint;
        //  1695: dup            
        //  1696: invokespecial   gg/essential/elementa/constraints/CenterConstraint.<init>:()V
        //  1699: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //  1702: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //  1705: getstatic       kotlin/Unit.INSTANCE:Lkotlin/Unit;
        //  1708: pop            
        //  1709: aload_3        
        //  1710: aload_0         /* this */
        //  1711: invokespecial   gg/essential/gui/studio/CosmeticStudio.getCartButtonContainer:()Lgg/essential/elementa/UIComponent;
        //  1714: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //  1717: aload_0         /* this */
        //  1718: getstatic       gg/essential/gui/studio/CosmeticStudio.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //  1721: bipush          9
        //  1723: aaload         
        //  1724: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //  1727: pop            
        //  1728: aload_0         /* this */
        //  1729: aload_0         /* this */
        //  1730: getfield        gg/essential/gui/studio/CosmeticStudio.selectedCategory:Lgg/essential/elementa/state/BasicState;
        //  1733: getstatic       gg/essential/gui/studio/CosmeticStudio$descriptionText$1.INSTANCE:Lgg/essential/gui/studio/CosmeticStudio$descriptionText$1;
        //  1736: checkcast       Lkotlin/jvm/functions/Function1;
        //  1739: invokevirtual   gg/essential/elementa/state/BasicState.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //  1742: putfield        gg/essential/gui/studio/CosmeticStudio.descriptionText:Lgg/essential/elementa/state/MappedState;
        //  1745: aload_0         /* this */
        //  1746: aload_0         /* this */
        //  1747: getfield        gg/essential/gui/studio/CosmeticStudio.descriptionText:Lgg/essential/elementa/state/MappedState;
        //  1750: getstatic       gg/essential/gui/studio/CosmeticStudio$descriptionVisible$1.INSTANCE:Lgg/essential/gui/studio/CosmeticStudio$descriptionVisible$1;
        //  1753: checkcast       Lkotlin/jvm/functions/Function1;
        //  1756: invokevirtual   gg/essential/elementa/state/MappedState.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //  1759: putfield        gg/essential/gui/studio/CosmeticStudio.descriptionVisible:Lgg/essential/elementa/state/MappedState;
        //  1762: aload_0         /* this */
        //  1763: new             Lgg/essential/elementa/components/UIContainer;
        //  1766: dup            
        //  1767: invokespecial   gg/essential/elementa/components/UIContainer.<init>:()V
        //  1770: checkcast       Lgg/essential/elementa/UIComponent;
        //  1773: astore_1        /* $this$constrain$iv */
        //  1774: aload_1         /* $this$constrain$iv */
        //  1775: astore_3       
        //  1776: aload_3        
        //  1777: astore          $this$constrain_u24lambda_u2d0$iv
        //  1779: aload           $this$constrain_u24lambda_u2d0$iv
        //  1781: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //  1784: astore          6
        //  1786: astore          10
        //  1788: aload           $this$optionsViewContainer_delegate_u24lambda_u2d12
        //  1790: new             Lgg/essential/elementa/constraints/CenterConstraint;
        //  1793: dup            
        //  1794: invokespecial   gg/essential/elementa/constraints/CenterConstraint.<init>:()V
        //  1797: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //  1800: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //  1803: aload           $this$optionsViewContainer_delegate_u24lambda_u2d12
        //  1805: new             Lgg/essential/elementa/constraints/SiblingConstraint;
        //  1808: dup            
        //  1809: ldc_w           15.0
        //  1812: iconst_0       
        //  1813: iconst_2       
        //  1814: aconst_null    
        //  1815: invokespecial   gg/essential/elementa/constraints/SiblingConstraint.<init>:(FZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //  1818: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //  1821: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //  1824: aload           $this$optionsViewContainer_delegate_u24lambda_u2d12
        //  1826: bipush          100
        //  1828: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1831: checkcast       Ljava/lang/Number;
        //  1834: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //  1837: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //  1840: bipush          12
        //  1842: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1845: checkcast       Ljava/lang/Number;
        //  1848: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //  1851: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //  1854: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.minus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/SubtractiveConstraint;
        //  1857: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //  1860: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //  1863: aload           $this$optionsViewContainer_delegate_u24lambda_u2d12
        //  1865: new             Lgg/essential/elementa/constraints/FillConstraint;
        //  1868: dup            
        //  1869: iconst_0       
        //  1870: iconst_1       
        //  1871: aconst_null    
        //  1872: invokespecial   gg/essential/elementa/constraints/FillConstraint.<init>:(ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //  1875: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //  1878: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //  1881: getstatic       kotlin/Unit.INSTANCE:Lkotlin/Unit;
        //  1884: pop            
        //  1885: aload           10
        //  1887: aload_3        
        //  1888: aload_0         /* this */
        //  1889: invokespecial   gg/essential/gui/studio/CosmeticStudio.getOptionsContainer:()Lgg/essential/elementa/components/UIContainer;
        //  1892: checkcast       Lgg/essential/elementa/UIComponent;
        //  1895: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //  1898: aload_0         /* this */
        //  1899: getstatic       gg/essential/gui/studio/CosmeticStudio.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //  1902: bipush          10
        //  1904: aaload         
        //  1905: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //  1908: putfield        gg/essential/gui/studio/CosmeticStudio.optionsViewContainer$delegate:Lkotlin/properties/ReadWriteProperty;
        //  1911: aload_0         /* this */
        //  1912: new             Lgg/essential/elementa/components/ScrollComponent;
        //  1915: dup            
        //  1916: ldc_w           ""
        //  1919: fconst_2       
        //  1920: aconst_null    
        //  1921: iconst_0       
        //  1922: iconst_0       
        //  1923: iconst_0       
        //  1924: iconst_0       
        //  1925: fconst_0       
        //  1926: fconst_0       
        //  1927: aconst_null    
        //  1928: sipush          1020
        //  1931: aconst_null    
        //  1932: invokespecial   gg/essential/elementa/components/ScrollComponent.<init>:(Ljava/lang/String;FLjava/awt/Color;ZZZZFFLgg/essential/elementa/UIComponent;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //  1935: astore_1       
        //  1936: aload_1        
        //  1937: astore_2       
        //  1938: astore          10
        //  1940: aload_2         /* $this$optionsView_delegate_u24lambda_u2d14 */
        //  1941: invokevirtual   gg/essential/elementa/components/ScrollComponent.getEmptyText:()Lgg/essential/elementa/components/UIWrappedText;
        //  1944: aload_0         /* this */
        //  1945: getfield        gg/essential/gui/studio/CosmeticStudio.inCart:Lgg/essential/elementa/state/MappedState;
        //  1948: getstatic       gg/essential/gui/studio/CosmeticStudio$optionsView$2$1.INSTANCE:Lgg/essential/gui/studio/CosmeticStudio$optionsView$2$1;
        //  1951: checkcast       Lkotlin/jvm/functions/Function1;
        //  1954: invokevirtual   gg/essential/elementa/state/MappedState.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //  1957: checkcast       Lgg/essential/elementa/state/State;
        //  1960: invokevirtual   gg/essential/elementa/components/UIWrappedText.bindText:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/components/UIWrappedText;
        //  1963: pop            
        //  1964: aload_2         /* $this$optionsView_delegate_u24lambda_u2d14 */
        //  1965: invokevirtual   gg/essential/elementa/components/ScrollComponent.getChildren:()Lgg/essential/elementa/utils/ObservableList;
        //  1968: checkcast       Ljava/util/List;
        //  1971: invokestatic    kotlin/collections/CollectionsKt.first:(Ljava/util/List;)Ljava/lang/Object;
        //  1974: checkcast       Lgg/essential/elementa/UIComponent;
        //  1977: astore          $this$constrain$iv
        //  1979: aload           $this$constrain$iv
        //  1981: astore          6
        //  1983: aload           6
        //  1985: astore          $this$constrain_u24lambda_u2d0$iv
        //  1987: aload           $this$constrain_u24lambda_u2d0$iv
        //  1989: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //  1992: astore          $this$optionsView_delegate_u24lambda_u2d14_u24lambda_u2d13
        //  1994: aload           $this$optionsView_delegate_u24lambda_u2d14_u24lambda_u2d13
        //  1996: bipush          100
        //  1998: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  2001: checkcast       Ljava/lang/Number;
        //  2004: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //  2007: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //  2010: iconst_4       
        //  2011: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  2014: checkcast       Ljava/lang/Number;
        //  2017: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //  2020: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //  2023: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.minus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/SubtractiveConstraint;
        //  2026: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //  2029: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //  2032: aload           $this$optionsView_delegate_u24lambda_u2d14_u24lambda_u2d13
        //  2034: bipush          100
        //  2036: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  2039: checkcast       Ljava/lang/Number;
        //  2042: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //  2045: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //  2048: iconst_4       
        //  2049: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  2052: checkcast       Ljava/lang/Number;
        //  2055: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //  2058: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //  2061: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.minus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/SubtractiveConstraint;
        //  2064: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //  2067: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //  2070: getstatic       kotlin/Unit.INSTANCE:Lkotlin/Unit;
        //  2073: pop            
        //  2074: aload           10
        //  2076: aload_1        
        //  2077: checkcast       Lgg/essential/elementa/UIComponent;
        //  2080: astore_1        /* $this$constrain$iv */
        //  2081: aload_1         /* $this$constrain$iv */
        //  2082: astore_3       
        //  2083: aload_3        
        //  2084: astore          $this$constrain_u24lambda_u2d0$iv
        //  2086: aload           $this$constrain_u24lambda_u2d0$iv
        //  2088: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //  2091: astore          6
        //  2093: astore          10
        //  2095: aload           $this$optionsView_delegate_u24lambda_u2d15
        //  2097: bipush          100
        //  2099: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  2102: checkcast       Ljava/lang/Number;
        //  2105: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //  2108: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //  2111: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //  2114: aload           $this$optionsView_delegate_u24lambda_u2d15
        //  2116: new             Lgg/essential/elementa/constraints/FillConstraint;
        //  2119: dup            
        //  2120: iconst_0       
        //  2121: invokespecial   gg/essential/elementa/constraints/FillConstraint.<init>:(Z)V
        //  2124: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //  2127: aload_0         /* this */
        //  2128: getfield        gg/essential/gui/studio/CosmeticStudio.inCart:Lgg/essential/elementa/state/MappedState;
        //  2131: getstatic       gg/essential/gui/studio/CosmeticStudio$optionsView$3$1.INSTANCE:Lgg/essential/gui/studio/CosmeticStudio$optionsView$3$1;
        //  2134: checkcast       Lkotlin/jvm/functions/Function1;
        //  2137: invokevirtual   gg/essential/elementa/state/MappedState.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //  2140: checkcast       Lgg/essential/elementa/state/State;
        //  2143: iconst_0       
        //  2144: iconst_0       
        //  2145: iconst_3       
        //  2146: aconst_null    
        //  2147: invokestatic    gg/essential/elementa/state/ExtensionsKt.pixels$default:(Lgg/essential/elementa/state/State;ZZILjava/lang/Object;)Lgg/essential/elementa/constraints/PixelConstraint;
        //  2150: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //  2153: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.minus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/SubtractiveConstraint;
        //  2156: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //  2159: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //  2162: getstatic       kotlin/Unit.INSTANCE:Lkotlin/Unit;
        //  2165: pop            
        //  2166: aload           10
        //  2168: aload_3        
        //  2169: aload_0         /* this */
        //  2170: invokespecial   gg/essential/gui/studio/CosmeticStudio.getOptionsViewContainer:()Lgg/essential/elementa/components/UIContainer;
        //  2173: checkcast       Lgg/essential/elementa/UIComponent;
        //  2176: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //  2179: checkcast       Lgg/essential/elementa/components/ScrollComponent;
        //  2182: bipush          20
        //  2184: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  2187: checkcast       Ljava/lang/Number;
        //  2190: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //  2193: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //  2196: invokestatic    gg/essential/util/ExtensionsKt.scrollGradient:(Lgg/essential/elementa/components/ScrollComponent;Lgg/essential/elementa/constraints/HeightConstraint;)Lgg/essential/elementa/components/ScrollComponent;
        //  2199: checkcast       Lgg/essential/elementa/UIComponent;
        //  2202: aload_0         /* this */
        //  2203: getstatic       gg/essential/gui/studio/CosmeticStudio.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //  2206: bipush          11
        //  2208: aaload         
        //  2209: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //  2212: putfield        gg/essential/gui/studio/CosmeticStudio.optionsView$delegate:Lkotlin/properties/ReadWriteProperty;
        //  2215: aload_0         /* this */
        //  2216: new             Lgg/essential/elementa/components/UIContainer;
        //  2219: dup            
        //  2220: invokespecial   gg/essential/elementa/components/UIContainer.<init>:()V
        //  2223: checkcast       Lgg/essential/elementa/UIComponent;
        //  2226: astore_1        /* $this$constrain$iv */
        //  2227: aload_1         /* $this$constrain$iv */
        //  2228: astore_3       
        //  2229: aload_3        
        //  2230: astore          $this$constrain_u24lambda_u2d0$iv
        //  2232: aload           $this$constrain_u24lambda_u2d0$iv
        //  2234: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //  2237: astore          6
        //  2239: astore          10
        //  2241: aload           $this$categoryDescriptionContainer_delegate_u24lambda_u2d16
        //  2243: bipush          100
        //  2245: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  2248: checkcast       Ljava/lang/Number;
        //  2251: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //  2254: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //  2257: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //  2260: aload           $this$categoryDescriptionContainer_delegate_u24lambda_u2d16
        //  2262: new             Lgg/essential/elementa/constraints/ChildBasedSizeConstraint;
        //  2265: dup            
        //  2266: fconst_0       
        //  2267: iconst_1       
        //  2268: aconst_null    
        //  2269: invokespecial   gg/essential/elementa/constraints/ChildBasedSizeConstraint.<init>:(FILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //  2272: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //  2275: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //  2278: aload           $this$categoryDescriptionContainer_delegate_u24lambda_u2d16
        //  2280: new             Lgg/essential/elementa/constraints/SiblingConstraint;
        //  2283: dup            
        //  2284: fconst_0       
        //  2285: iconst_0       
        //  2286: iconst_3       
        //  2287: aconst_null    
        //  2288: invokespecial   gg/essential/elementa/constraints/SiblingConstraint.<init>:(FZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //  2291: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //  2294: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //  2297: getstatic       kotlin/Unit.INSTANCE:Lkotlin/Unit;
        //  2300: pop            
        //  2301: aload           10
        //  2303: aload_3        
        //  2304: aload_0         /* this */
        //  2305: getstatic       gg/essential/gui/studio/CosmeticStudio.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //  2308: bipush          12
        //  2310: aaload         
        //  2311: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //  2314: putfield        gg/essential/gui/studio/CosmeticStudio.categoryDescriptionContainer$delegate:Lkotlin/properties/ReadWriteProperty;
        //  2317: new             Lgg/essential/gui/common/Spacer;
        //  2320: dup            
        //  2321: aconst_null    
        //  2322: bipush          11
        //  2324: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  2327: checkcast       Ljava/lang/Number;
        //  2330: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //  2333: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //  2336: iconst_1       
        //  2337: invokespecial   gg/essential/gui/common/Spacer.<init>:(Lgg/essential/elementa/constraints/WidthConstraint;Lgg/essential/elementa/constraints/HeightConstraint;I)V
        //  2340: checkcast       Lgg/essential/elementa/UIComponent;
        //  2343: aload_0         /* this */
        //  2344: invokespecial   gg/essential/gui/studio/CosmeticStudio.getCategoryDescriptionContainer:()Lgg/essential/elementa/components/UIContainer;
        //  2347: checkcast       Lgg/essential/elementa/UIComponent;
        //  2350: aload_0         /* this */
        //  2351: getfield        gg/essential/gui/studio/CosmeticStudio.descriptionVisible:Lgg/essential/elementa/state/MappedState;
        //  2354: checkcast       Lgg/essential/elementa/state/State;
        //  2357: iconst_0       
        //  2358: iconst_0       
        //  2359: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  2362: iconst_4       
        //  2363: invokestatic    gg/essential/gui/common/StateExtensionsKt.bindParent$default$6fcd5b6b:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/state/State;ZLjava/lang/Integer;I)Lgg/essential/elementa/UIComponent;
        //  2366: aload_0         /* this */
        //  2367: getstatic       gg/essential/gui/studio/CosmeticStudio.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //  2370: bipush          13
        //  2372: aaload         
        //  2373: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //  2376: pop            
        //  2377: new             Lgg/essential/elementa/components/UIWrappedText;
        //  2380: dup            
        //  2381: aconst_null    
        //  2382: iconst_0       
        //  2383: aconst_null    
        //  2384: iconst_0       
        //  2385: iconst_0       
        //  2386: fconst_0       
        //  2387: aconst_null    
        //  2388: bipush          127
        //  2390: aconst_null    
        //  2391: invokespecial   gg/essential/elementa/components/UIWrappedText.<init>:(Ljava/lang/String;ZLjava/awt/Color;ZZFLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //  2394: aload_0         /* this */
        //  2395: getfield        gg/essential/gui/studio/CosmeticStudio.descriptionText:Lgg/essential/elementa/state/MappedState;
        //  2398: checkcast       Lgg/essential/elementa/state/State;
        //  2401: invokevirtual   gg/essential/elementa/components/UIWrappedText.bindText:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/components/UIWrappedText;
        //  2404: checkcast       Lgg/essential/elementa/UIComponent;
        //  2407: astore_1        /* $this$constrain$iv */
        //  2408: aload_1         /* $this$constrain$iv */
        //  2409: astore_3       
        //  2410: aload_3        
        //  2411: astore          $this$constrain_u24lambda_u2d0$iv
        //  2413: aload           $this$constrain_u24lambda_u2d0$iv
        //  2415: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //  2418: astore          $this$categoryDescription_delegate_u24lambda_u2d17
        //  2420: aload           $this$categoryDescription_delegate_u24lambda_u2d17
        //  2422: new             Lgg/essential/elementa/constraints/SiblingConstraint;
        //  2425: dup            
        //  2426: fconst_0       
        //  2427: iconst_0       
        //  2428: iconst_3       
        //  2429: aconst_null    
        //  2430: invokespecial   gg/essential/elementa/constraints/SiblingConstraint.<init>:(FZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //  2433: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //  2436: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //  2439: aload           $this$categoryDescription_delegate_u24lambda_u2d17
        //  2441: new             Lgg/essential/elementa/constraints/CenterConstraint;
        //  2444: dup            
        //  2445: invokespecial   gg/essential/elementa/constraints/CenterConstraint.<init>:()V
        //  2448: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //  2451: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //  2454: aload           $this$categoryDescription_delegate_u24lambda_u2d17
        //  2456: bipush          100
        //  2458: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  2461: checkcast       Ljava/lang/Number;
        //  2464: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //  2467: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //  2470: iconst_4       
        //  2471: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  2474: checkcast       Ljava/lang/Number;
        //  2477: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //  2480: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //  2483: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.minus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/SubtractiveConstraint;
        //  2486: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //  2489: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //  2492: aload           $this$categoryDescription_delegate_u24lambda_u2d17
        //  2494: getstatic       gg/essential/gui/EssentialPalette.TEXT:Ljava/awt/Color;
        //  2497: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.toConstraint:(Ljava/awt/Color;)Lgg/essential/elementa/constraints/ConstantColorConstraint;
        //  2500: checkcast       Lgg/essential/elementa/constraints/ColorConstraint;
        //  2503: invokevirtual   gg/essential/elementa/UIConstraints.setColor:(Lgg/essential/elementa/constraints/ColorConstraint;)V
        //  2506: getstatic       kotlin/Unit.INSTANCE:Lkotlin/Unit;
        //  2509: pop            
        //  2510: aload_3        
        //  2511: aload_0         /* this */
        //  2512: invokespecial   gg/essential/gui/studio/CosmeticStudio.getCategoryDescriptionContainer:()Lgg/essential/elementa/components/UIContainer;
        //  2515: checkcast       Lgg/essential/elementa/UIComponent;
        //  2518: aload_0         /* this */
        //  2519: getfield        gg/essential/gui/studio/CosmeticStudio.descriptionVisible:Lgg/essential/elementa/state/MappedState;
        //  2522: checkcast       Lgg/essential/elementa/state/State;
        //  2525: iconst_0       
        //  2526: iconst_1       
        //  2527: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  2530: iconst_4       
        //  2531: invokestatic    gg/essential/gui/common/StateExtensionsKt.bindParent$default$6fcd5b6b:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/state/State;ZLjava/lang/Integer;I)Lgg/essential/elementa/UIComponent;
        //  2534: aload_0         /* this */
        //  2535: getstatic       gg/essential/gui/studio/CosmeticStudio.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //  2538: bipush          14
        //  2540: aaload         
        //  2541: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //  2544: pop            
        //  2545: new             Lgg/essential/gui/common/Spacer;
        //  2548: dup            
        //  2549: ldc_w           3.0
        //  2552: invokespecial   gg/essential/gui/common/Spacer.<init>:(F)V
        //  2555: checkcast       Lgg/essential/elementa/UIComponent;
        //  2558: aload_0         /* this */
        //  2559: invokespecial   gg/essential/gui/studio/CosmeticStudio.getCategoryDescriptionContainer:()Lgg/essential/elementa/components/UIContainer;
        //  2562: checkcast       Lgg/essential/elementa/UIComponent;
        //  2565: aload_0         /* this */
        //  2566: getfield        gg/essential/gui/studio/CosmeticStudio.descriptionVisible:Lgg/essential/elementa/state/MappedState;
        //  2569: checkcast       Lgg/essential/elementa/state/State;
        //  2572: iconst_0       
        //  2573: iconst_2       
        //  2574: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  2577: iconst_4       
        //  2578: invokestatic    gg/essential/gui/common/StateExtensionsKt.bindParent$default$6fcd5b6b:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/state/State;ZLjava/lang/Integer;I)Lgg/essential/elementa/UIComponent;
        //  2581: aload_0         /* this */
        //  2582: getstatic       gg/essential/gui/studio/CosmeticStudio.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //  2585: bipush          15
        //  2587: aaload         
        //  2588: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //  2591: pop            
        //  2592: new             Lgg/essential/gui/common/Spacer;
        //  2595: dup            
        //  2596: ldc_w           10.0
        //  2599: invokespecial   gg/essential/gui/common/Spacer.<init>:(F)V
        //  2602: checkcast       Lgg/essential/elementa/UIComponent;
        //  2605: aload_0         /* this */
        //  2606: invokespecial   gg/essential/gui/studio/CosmeticStudio.getCategoryDescriptionContainer:()Lgg/essential/elementa/components/UIContainer;
        //  2609: checkcast       Lgg/essential/elementa/UIComponent;
        //  2612: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //  2615: aload_0         /* this */
        //  2616: getstatic       gg/essential/gui/studio/CosmeticStudio.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //  2619: bipush          16
        //  2621: aaload         
        //  2622: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //  2625: pop            
        //  2626: aload_0         /* this */
        //  2627: new             Lgg/essential/elementa/components/UIBlock;
        //  2630: dup            
        //  2631: getstatic       gg/essential/gui/EssentialPalette.SCROLLBAR:Ljava/awt/Color;
        //  2634: invokespecial   gg/essential/elementa/components/UIBlock.<init>:(Ljava/awt/Color;)V
        //  2637: checkcast       Lgg/essential/elementa/UIComponent;
        //  2640: astore_1        /* $this$constrain$iv */
        //  2641: aload_1         /* $this$constrain$iv */
        //  2642: astore_3       
        //  2643: aload_3        
        //  2644: astore          $this$constrain_u24lambda_u2d0$iv
        //  2646: aload           $this$constrain_u24lambda_u2d0$iv
        //  2648: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //  2651: astore          6
        //  2653: astore          10
        //  2655: aload           $this$optionsScrollBar_delegate_u24lambda_u2d18
        //  2657: bipush          100
        //  2659: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  2662: checkcast       Ljava/lang/Number;
        //  2665: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //  2668: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //  2671: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //  2674: aload           $this$optionsScrollBar_delegate_u24lambda_u2d18
        //  2676: new             Lgg/essential/elementa/constraints/CenterConstraint;
        //  2679: dup            
        //  2680: invokespecial   gg/essential/elementa/constraints/CenterConstraint.<init>:()V
        //  2683: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //  2686: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //  2689: getstatic       kotlin/Unit.INSTANCE:Lkotlin/Unit;
        //  2692: pop            
        //  2693: aload           10
        //  2695: aload_3        
        //  2696: aload_0         /* this */
        //  2697: invokespecial   gg/essential/gui/studio/CosmeticStudio.getSecondDivider:()Lgg/essential/elementa/components/UIBlock;
        //  2700: checkcast       Lgg/essential/elementa/UIComponent;
        //  2703: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //  2706: aload_0         /* this */
        //  2707: getstatic       gg/essential/gui/studio/CosmeticStudio.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //  2710: bipush          17
        //  2712: aaload         
        //  2713: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //  2716: putfield        gg/essential/gui/studio/CosmeticStudio.optionsScrollBar$delegate:Lkotlin/properties/ReadWriteProperty;
        //  2719: new             Lgg/essential/elementa/components/UIBlock;
        //  2722: dup            
        //  2723: getstatic       gg/essential/gui/EssentialPalette.COMPONENT_HIGHLIGHT:Ljava/awt/Color;
        //  2726: invokespecial   gg/essential/elementa/components/UIBlock.<init>:(Ljava/awt/Color;)V
        //  2729: checkcast       Lgg/essential/elementa/UIComponent;
        //  2732: astore_1        /* $this$constrain$iv */
        //  2733: aload_1         /* $this$constrain$iv */
        //  2734: astore_3       
        //  2735: aload_3        
        //  2736: astore          $this$constrain_u24lambda_u2d0$iv
        //  2738: aload           $this$constrain_u24lambda_u2d0$iv
        //  2740: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //  2743: astore          $this$_init__u24lambda_u2d19
        //  2745: aload           $this$_init__u24lambda_u2d19
        //  2747: iconst_0       
        //  2748: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  2751: checkcast       Ljava/lang/Number;
        //  2754: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //  2757: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //  2760: aload_0         /* this */
        //  2761: invokespecial   gg/essential/gui/studio/CosmeticStudio.getFirstDivider:()Lgg/essential/elementa/components/UIBlock;
        //  2764: checkcast       Lgg/essential/elementa/UIComponent;
        //  2767: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.boundTo:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/constraints/SuperConstraint;
        //  2770: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //  2773: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //  2776: aload           $this$_init__u24lambda_u2d19
        //  2778: iconst_0       
        //  2779: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  2782: checkcast       Ljava/lang/Number;
        //  2785: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //  2788: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //  2791: aload_0         /* this */
        //  2792: invokevirtual   gg/essential/gui/studio/CosmeticStudio.getTitleBar:()Lgg/essential/elementa/components/UIBlock;
        //  2795: checkcast       Lgg/essential/elementa/UIComponent;
        //  2798: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.boundTo:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/constraints/SuperConstraint;
        //  2801: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //  2804: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //  2807: aload           $this$_init__u24lambda_u2d19
        //  2809: bipush          100
        //  2811: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  2814: checkcast       Ljava/lang/Number;
        //  2817: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //  2820: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //  2823: aload_0         /* this */
        //  2824: invokevirtual   gg/essential/gui/studio/CosmeticStudio.getTitleBar:()Lgg/essential/elementa/components/UIBlock;
        //  2827: checkcast       Lgg/essential/elementa/UIComponent;
        //  2830: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.boundTo:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/constraints/SuperConstraint;
        //  2833: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //  2836: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //  2839: aload           $this$_init__u24lambda_u2d19
        //  2841: bipush          100
        //  2843: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  2846: checkcast       Ljava/lang/Number;
        //  2849: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //  2852: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //  2855: aload_0         /* this */
        //  2856: invokevirtual   gg/essential/gui/studio/CosmeticStudio.getRightDivider:()Lgg/essential/elementa/components/UIBlock;
        //  2859: checkcast       Lgg/essential/elementa/UIComponent;
        //  2862: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.boundTo:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/constraints/SuperConstraint;
        //  2865: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //  2868: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //  2871: aload_3        
        //  2872: aload_0         /* this */
        //  2873: invokevirtual   gg/essential/gui/studio/CosmeticStudio.getWindow:()Lgg/essential/elementa/components/Window;
        //  2876: checkcast       Lgg/essential/elementa/UIComponent;
        //  2879: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //  2882: pop            
        //  2883: new             Lgg/essential/elementa/components/UIBlock;
        //  2886: dup            
        //  2887: getstatic       gg/essential/gui/EssentialPalette.COMPONENT_HIGHLIGHT:Ljava/awt/Color;
        //  2890: invokespecial   gg/essential/elementa/components/UIBlock.<init>:(Ljava/awt/Color;)V
        //  2893: checkcast       Lgg/essential/elementa/UIComponent;
        //  2896: astore_1        /* $this$constrain$iv */
        //  2897: aload_1         /* $this$constrain$iv */
        //  2898: astore_3       
        //  2899: aload_3        
        //  2900: astore          $this$constrain_u24lambda_u2d0$iv
        //  2902: aload           $this$constrain_u24lambda_u2d0$iv
        //  2904: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //  2907: astore          $this$_init__u24lambda_u2d20
        //  2909: aload           $this$_init__u24lambda_u2d20
        //  2911: iconst_0       
        //  2912: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  2915: checkcast       Ljava/lang/Number;
        //  2918: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //  2921: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //  2924: aload_0         /* this */
        //  2925: invokespecial   gg/essential/gui/studio/CosmeticStudio.getSecondDivider:()Lgg/essential/elementa/components/UIBlock;
        //  2928: checkcast       Lgg/essential/elementa/UIComponent;
        //  2931: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.boundTo:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/constraints/SuperConstraint;
        //  2934: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //  2937: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //  2940: aload           $this$_init__u24lambda_u2d20
        //  2942: iconst_0       
        //  2943: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  2946: checkcast       Ljava/lang/Number;
        //  2949: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //  2952: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //  2955: aload_0         /* this */
        //  2956: invokevirtual   gg/essential/gui/studio/CosmeticStudio.getTitleBar:()Lgg/essential/elementa/components/UIBlock;
        //  2959: checkcast       Lgg/essential/elementa/UIComponent;
        //  2962: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.boundTo:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/constraints/SuperConstraint;
        //  2965: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //  2968: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //  2971: aload           $this$_init__u24lambda_u2d20
        //  2973: bipush          100
        //  2975: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  2978: checkcast       Ljava/lang/Number;
        //  2981: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //  2984: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //  2987: aload_0         /* this */
        //  2988: invokevirtual   gg/essential/gui/studio/CosmeticStudio.getTitleBar:()Lgg/essential/elementa/components/UIBlock;
        //  2991: checkcast       Lgg/essential/elementa/UIComponent;
        //  2994: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.boundTo:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/constraints/SuperConstraint;
        //  2997: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //  3000: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //  3003: aload           $this$_init__u24lambda_u2d20
        //  3005: bipush          100
        //  3007: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  3010: checkcast       Ljava/lang/Number;
        //  3013: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //  3016: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //  3019: aload_0         /* this */
        //  3020: invokevirtual   gg/essential/gui/studio/CosmeticStudio.getRightDivider:()Lgg/essential/elementa/components/UIBlock;
        //  3023: checkcast       Lgg/essential/elementa/UIComponent;
        //  3026: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.boundTo:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/constraints/SuperConstraint;
        //  3029: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //  3032: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //  3035: aload_3        
        //  3036: aload_0         /* this */
        //  3037: invokevirtual   gg/essential/gui/studio/CosmeticStudio.getWindow:()Lgg/essential/elementa/components/Window;
        //  3040: checkcast       Lgg/essential/elementa/UIComponent;
        //  3043: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //  3046: pop            
        //  3047: aload_0         /* this */
        //  3048: invokespecial   gg/essential/gui/studio/CosmeticStudio.getCartButtonContainer:()Lgg/essential/elementa/UIComponent;
        //  3051: iconst_0       
        //  3052: iconst_0       
        //  3053: iconst_3       
        //  3054: invokestatic    gg/essential/util/ExtensionsKt.hoveredState$default$56721d26:(Lgg/essential/elementa/UIComponent;ZZI)Lgg/essential/elementa/state/State;
        //  3057: aload_0         /* this */
        //  3058: getfield        gg/essential/gui/studio/CosmeticStudio.selectedCategory:Lgg/essential/elementa/state/BasicState;
        //  3061: getstatic       gg/essential/gui/studio/CosmeticStudio$cartActiveOrHovered$1.INSTANCE:Lgg/essential/gui/studio/CosmeticStudio$cartActiveOrHovered$1;
        //  3064: checkcast       Lkotlin/jvm/functions/Function1;
        //  3067: invokevirtual   gg/essential/elementa/state/BasicState.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //  3070: checkcast       Lgg/essential/elementa/state/State;
        //  3073: invokestatic    gg/essential/gui/common/StateExtensionsKt.or:(Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;)Lgg/essential/elementa/state/MappedState;
        //  3076: astore_1        /* cartActiveOrHovered */
        //  3077: aload_0         /* this */
        //  3078: invokespecial   gg/essential/gui/studio/CosmeticStudio.getCartBackground:()Lgg/essential/elementa/components/UIBlock;
        //  3081: aload_1         /* cartActiveOrHovered */
        //  3082: getstatic       gg/essential/gui/studio/CosmeticStudio$3.INSTANCE:Lgg/essential/gui/studio/CosmeticStudio$3;
        //  3085: checkcast       Lkotlin/jvm/functions/Function1;
        //  3088: invokevirtual   gg/essential/elementa/state/MappedState.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //  3091: checkcast       Lgg/essential/elementa/state/State;
        //  3094: invokestatic    gg/essential/elementa/state/ExtensionsKt.toConstraint:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/constraints/ConstantColorConstraint;
        //  3097: checkcast       Lgg/essential/elementa/constraints/ColorConstraint;
        //  3100: invokevirtual   gg/essential/elementa/components/UIBlock.setColor:(Lgg/essential/elementa/constraints/ColorConstraint;)Lgg/essential/elementa/UIComponent;
        //  3103: pop            
        //  3104: aload_0         /* this */
        //  3105: invokespecial   gg/essential/gui/studio/CosmeticStudio.getOptionsView:()Lgg/essential/elementa/components/ScrollComponent;
        //  3108: aload_0         /* this */
        //  3109: invokespecial   gg/essential/gui/studio/CosmeticStudio.getOptionsScrollBar:()Lgg/essential/elementa/components/UIBlock;
        //  3112: checkcast       Lgg/essential/elementa/UIComponent;
        //  3115: iconst_1       
        //  3116: invokevirtual   gg/essential/elementa/components/ScrollComponent.setVerticalScrollBarComponent:(Lgg/essential/elementa/UIComponent;Z)V
        //  3119: aload_0         /* this */
        //  3120: invokespecial   gg/essential/gui/studio/CosmeticStudio.getCategoriesContainer:()Lgg/essential/gui/studio/CategoriesSection;
        //  3123: aload_0         /* this */
        //  3124: invokespecial   gg/essential/gui/studio/CosmeticStudio.getFirstDivider:()Lgg/essential/elementa/components/UIBlock;
        //  3127: checkcast       Lgg/essential/elementa/UIComponent;
        //  3130: invokevirtual   gg/essential/gui/studio/CategoriesSection.createScrollbar:(Lgg/essential/elementa/UIComponent;)V
        //  3133: aload_0         /* this */
        //  3134: getfield        gg/essential/gui/studio/CosmeticStudio.selectedCategory:Lgg/essential/elementa/state/BasicState;
        //  3137: new             Lgg/essential/gui/studio/CosmeticStudio$4;
        //  3140: dup            
        //  3141: aload_0         /* this */
        //  3142: invokespecial   gg/essential/gui/studio/CosmeticStudio$4.<init>:(Lgg/essential/gui/studio/CosmeticStudio;)V
        //  3145: checkcast       Lkotlin/jvm/functions/Function1;
        //  3148: invokevirtual   gg/essential/elementa/state/BasicState.onSetValue:(Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function0;
        //  3151: pop            
        //  3152: aload_0         /* this */
        //  3153: getfield        gg/essential/gui/studio/CosmeticStudio.selectedCategory:Lgg/essential/elementa/state/BasicState;
        //  3156: aload_0         /* this */
        //  3157: getfield        gg/essential/gui/studio/CosmeticStudio.cartItems:Lgg/essential/elementa/state/MappedState;
        //  3160: checkcast       Lgg/essential/elementa/state/State;
        //  3163: invokevirtual   gg/essential/elementa/state/BasicState.zip:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/state/State;
        //  3166: new             Lgg/essential/gui/studio/CosmeticStudio$5;
        //  3169: dup            
        //  3170: aload_0         /* this */
        //  3171: invokespecial   gg/essential/gui/studio/CosmeticStudio$5.<init>:(Lgg/essential/gui/studio/CosmeticStudio;)V
        //  3174: checkcast       Lkotlin/jvm/functions/Function1;
        //  3177: invokevirtual   gg/essential/elementa/state/State.onSetValue:(Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function0;
        //  3180: pop            
        //  3181: aload_0         /* this */
        //  3182: invokevirtual   gg/essential/gui/studio/CosmeticStudio.getWindow:()Lgg/essential/elementa/components/Window;
        //  3185: invokevirtual   gg/essential/elementa/components/Window.getKeyTypedListeners:()Ljava/util/List;
        //  3188: invokestatic    kotlin/collections/CollectionsKt.removeFirst:(Ljava/util/List;)Ljava/lang/Object;
        //  3191: checkcast       Lkotlin/jvm/functions/Function3;
        //  3194: astore_2        /* defaultKeyBehavior */
        //  3195: aload_0         /* this */
        //  3196: invokevirtual   gg/essential/gui/studio/CosmeticStudio.getWindow:()Lgg/essential/elementa/components/Window;
        //  3199: new             Lgg/essential/gui/studio/CosmeticStudio$6;
        //  3202: dup            
        //  3203: aload_0         /* this */
        //  3204: aload_2         /* defaultKeyBehavior */
        //  3205: invokespecial   gg/essential/gui/studio/CosmeticStudio$6.<init>:(Lgg/essential/gui/studio/CosmeticStudio;Lkotlin/jvm/functions/Function3;)V
        //  3208: checkcast       Lkotlin/jvm/functions/Function3;
        //  3211: invokevirtual   gg/essential/elementa/components/Window.onKeyType:(Lkotlin/jvm/functions/Function3;)Lgg/essential/elementa/UIComponent;
        //  3214: pop            
        //  3215: aload_0         /* this */
        //  3216: new             Lgg/essential/elementa/components/UIBlock;
        //  3219: dup            
        //  3220: getstatic       gg/essential/gui/EssentialPalette.BUTTON_HIGHLIGHT:Ljava/awt/Color;
        //  3223: invokespecial   gg/essential/elementa/components/UIBlock.<init>:(Ljava/awt/Color;)V
        //  3226: checkcast       Lgg/essential/elementa/UIComponent;
        //  3229: astore_1        /* $this$constrain$iv */
        //  3230: aload_1         /* $this$constrain$iv */
        //  3231: astore_3       
        //  3232: aload_3        
        //  3233: astore          $this$constrain_u24lambda_u2d0$iv
        //  3235: aload           $this$constrain_u24lambda_u2d0$iv
        //  3237: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //  3240: astore          6
        //  3242: astore          10
        //  3244: aload           $this$cartContainer_delegate_u24lambda_u2d21
        //  3246: iconst_0       
        //  3247: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  3250: checkcast       Ljava/lang/Number;
        //  3253: iconst_1       
        //  3254: iconst_0       
        //  3255: iconst_2       
        //  3256: aconst_null    
        //  3257: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels$default:(Ljava/lang/Number;ZZILjava/lang/Object;)Lgg/essential/elementa/constraints/PixelConstraint;
        //  3260: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //  3263: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //  3266: aload           $this$cartContainer_delegate_u24lambda_u2d21
        //  3268: bipush          100
        //  3270: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  3273: checkcast       Ljava/lang/Number;
        //  3276: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //  3279: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //  3282: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //  3285: aload           $this$cartContainer_delegate_u24lambda_u2d21
        //  3287: ldc_w           25.0
        //  3290: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //  3293: checkcast       Ljava/lang/Number;
        //  3296: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //  3299: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //  3302: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //  3305: getstatic       kotlin/Unit.INSTANCE:Lkotlin/Unit;
        //  3308: pop            
        //  3309: aload           10
        //  3311: aload_3        
        //  3312: aload_0         /* this */
        //  3313: invokespecial   gg/essential/gui/studio/CosmeticStudio.getOptionsContainer:()Lgg/essential/elementa/components/UIContainer;
        //  3316: checkcast       Lgg/essential/elementa/UIComponent;
        //  3319: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //  3322: astore_1       
        //  3323: aload_1        
        //  3324: checkcast       Lgg/essential/elementa/components/UIBlock;
        //  3327: astore_2       
        //  3328: astore          10
        //  3330: aload_0         /* this */
        //  3331: getfield        gg/essential/gui/studio/CosmeticStudio.inCart:Lgg/essential/elementa/state/MappedState;
        //  3334: checkcast       Lgg/essential/elementa/state/State;
        //  3337: new             Lgg/essential/gui/studio/CosmeticStudio$cartContainer$3$1;
        //  3340: dup            
        //  3341: aload_2         /* $this$cartContainer_delegate_u24lambda_u2d22 */
        //  3342: invokespecial   gg/essential/gui/studio/CosmeticStudio$cartContainer$3$1.<init>:(Lgg/essential/elementa/components/UIBlock;)V
        //  3345: checkcast       Lkotlin/jvm/functions/Function1;
        //  3348: invokestatic    gg/essential/gui/common/StateExtensionsKt.onSetValueAndNow:(Lgg/essential/elementa/state/State;Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function0;
        //  3351: pop            
        //  3352: getstatic       kotlin/Unit.INSTANCE:Lkotlin/Unit;
        //  3355: pop            
        //  3356: aload           10
        //  3358: aload_1        
        //  3359: aload_0         /* this */
        //  3360: getstatic       gg/essential/gui/studio/CosmeticStudio.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //  3363: bipush          18
        //  3365: aaload         
        //  3366: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //  3369: putfield        gg/essential/gui/studio/CosmeticStudio.cartContainer$delegate:Lkotlin/properties/ReadWriteProperty;
        //  3372: aload_0         /* this */
        //  3373: new             Lgg/essential/elementa/components/UIBlock;
        //  3376: dup            
        //  3377: getstatic       gg/essential/gui/EssentialPalette.BUTTON:Ljava/awt/Color;
        //  3380: invokespecial   gg/essential/elementa/components/UIBlock.<init>:(Ljava/awt/Color;)V
        //  3383: checkcast       Lgg/essential/elementa/UIComponent;
        //  3386: astore_1        /* $this$constrain$iv */
        //  3387: aload_1         /* $this$constrain$iv */
        //  3388: astore_3       
        //  3389: aload_3        
        //  3390: astore          $this$constrain_u24lambda_u2d0$iv
        //  3392: aload           $this$constrain_u24lambda_u2d0$iv
        //  3394: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //  3397: astore          6
        //  3399: astore          10
        //  3401: aload           $this$priceBlock_delegate_u24lambda_u2d23
        //  3403: bipush          11
        //  3405: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  3408: checkcast       Ljava/lang/Number;
        //  3411: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //  3414: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //  3417: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //  3420: aload           $this$priceBlock_delegate_u24lambda_u2d23
        //  3422: new             Lgg/essential/elementa/constraints/CenterConstraint;
        //  3425: dup            
        //  3426: invokespecial   gg/essential/elementa/constraints/CenterConstraint.<init>:()V
        //  3429: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //  3432: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //  3435: aload           $this$priceBlock_delegate_u24lambda_u2d23
        //  3437: new             Lgg/essential/elementa/constraints/ChildBasedSizeConstraint;
        //  3440: dup            
        //  3441: fconst_0       
        //  3442: iconst_1       
        //  3443: aconst_null    
        //  3444: invokespecial   gg/essential/elementa/constraints/ChildBasedSizeConstraint.<init>:(FILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //  3447: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //  3450: bipush          18
        //  3452: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  3455: checkcast       Ljava/lang/Number;
        //  3458: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //  3461: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //  3464: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.plus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/AdditiveConstraint;
        //  3467: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //  3470: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //  3473: aload           $this$priceBlock_delegate_u24lambda_u2d23
        //  3475: bipush          17
        //  3477: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  3480: checkcast       Ljava/lang/Number;
        //  3483: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //  3486: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //  3489: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //  3492: getstatic       kotlin/Unit.INSTANCE:Lkotlin/Unit;
        //  3495: pop            
        //  3496: aload           10
        //  3498: aload_3        
        //  3499: aload_0         /* this */
        //  3500: invokespecial   gg/essential/gui/studio/CosmeticStudio.getCartContainer:()Lgg/essential/elementa/components/UIBlock;
        //  3503: checkcast       Lgg/essential/elementa/UIComponent;
        //  3506: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //  3509: aload_0         /* this */
        //  3510: getstatic       gg/essential/gui/studio/CosmeticStudio.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //  3513: bipush          19
        //  3515: aaload         
        //  3516: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //  3519: putfield        gg/essential/gui/studio/CosmeticStudio.priceBlock$delegate:Lkotlin/properties/ReadWriteProperty;
        //  3522: new             Lgg/essential/gui/common/shadow/EssentialUIText;
        //  3525: dup            
        //  3526: aconst_null    
        //  3527: iconst_0       
        //  3528: aconst_null    
        //  3529: iconst_0       
        //  3530: iconst_0       
        //  3531: iconst_0       
        //  3532: bipush          63
        //  3534: invokespecial   gg/essential/gui/common/shadow/EssentialUIText.<init>:(Ljava/lang/String;ZLjava/awt/Color;ZZZI)V
        //  3537: aload_0         /* this */
        //  3538: getfield        gg/essential/gui/studio/CosmeticStudio.formattedPrice:Lgg/essential/elementa/state/MappedState;
        //  3541: checkcast       Lgg/essential/elementa/state/State;
        //  3544: invokevirtual   gg/essential/gui/common/shadow/EssentialUIText.bindText:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/components/UIText;
        //  3547: checkcast       Lgg/essential/elementa/UIComponent;
        //  3550: invokestatic    gg/essential/util/ExtensionsKt.centered:(Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //  3553: aload_0         /* this */
        //  3554: invokespecial   gg/essential/gui/studio/CosmeticStudio.getPriceBlock:()Lgg/essential/elementa/components/UIBlock;
        //  3557: checkcast       Lgg/essential/elementa/UIComponent;
        //  3560: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //  3563: aload_0         /* this */
        //  3564: getstatic       gg/essential/gui/studio/CosmeticStudio.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //  3567: bipush          20
        //  3569: aaload         
        //  3570: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //  3573: pop            
        //  3574: aload_0         /* this */
        //  3575: new             Lgg/essential/elementa/components/UIContainer;
        //  3578: dup            
        //  3579: invokespecial   gg/essential/elementa/components/UIContainer.<init>:()V
        //  3582: checkcast       Lgg/essential/elementa/UIComponent;
        //  3585: astore_1        /* $this$constrain$iv */
        //  3586: aload_1         /* $this$constrain$iv */
        //  3587: astore_3       
        //  3588: aload_3        
        //  3589: astore          $this$constrain_u24lambda_u2d0$iv
        //  3591: aload           $this$constrain_u24lambda_u2d0$iv
        //  3593: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //  3596: astore          6
        //  3598: astore          10
        //  3600: aload           $this$buyContainer_delegate_u24lambda_u2d24
        //  3602: bipush          9
        //  3604: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  3607: checkcast       Ljava/lang/Number;
        //  3610: iconst_1       
        //  3611: iconst_0       
        //  3612: iconst_2       
        //  3613: aconst_null    
        //  3614: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels$default:(Ljava/lang/Number;ZZILjava/lang/Object;)Lgg/essential/elementa/constraints/PixelConstraint;
        //  3617: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //  3620: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //  3623: aload           $this$buyContainer_delegate_u24lambda_u2d24
        //  3625: new             Lgg/essential/elementa/constraints/CenterConstraint;
        //  3628: dup            
        //  3629: invokespecial   gg/essential/elementa/constraints/CenterConstraint.<init>:()V
        //  3632: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //  3635: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //  3638: aload           $this$buyContainer_delegate_u24lambda_u2d24
        //  3640: new             Lgg/essential/elementa/constraints/ChildBasedSizeConstraint;
        //  3643: dup            
        //  3644: fconst_0       
        //  3645: iconst_1       
        //  3646: aconst_null    
        //  3647: invokespecial   gg/essential/elementa/constraints/ChildBasedSizeConstraint.<init>:(FILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //  3650: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //  3653: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //  3656: aload           $this$buyContainer_delegate_u24lambda_u2d24
        //  3658: bipush          17
        //  3660: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  3663: checkcast       Ljava/lang/Number;
        //  3666: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //  3669: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //  3672: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //  3675: getstatic       kotlin/Unit.INSTANCE:Lkotlin/Unit;
        //  3678: pop            
        //  3679: aload           10
        //  3681: aload_3        
        //  3682: aload_0         /* this */
        //  3683: invokespecial   gg/essential/gui/studio/CosmeticStudio.getCartContainer:()Lgg/essential/elementa/components/UIBlock;
        //  3686: checkcast       Lgg/essential/elementa/UIComponent;
        //  3689: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //  3692: aload_0         /* this */
        //  3693: getstatic       gg/essential/gui/studio/CosmeticStudio.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //  3696: bipush          21
        //  3698: aaload         
        //  3699: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //  3702: putfield        gg/essential/gui/studio/CosmeticStudio.buyContainer$delegate:Lkotlin/properties/ReadWriteProperty;
        //  3705: aload_0         /* this */
        //  3706: new             Lgg/essential/elementa/state/BasicState;
        //  3709: dup            
        //  3710: ldc_w           "Buy"
        //  3713: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //  3716: putfield        gg/essential/gui/studio/CosmeticStudio.buyButtonText:Lgg/essential/elementa/state/BasicState;
        //  3719: aload_0         /* this */
        //  3720: new             Lgg/essential/elementa/components/UIBlock;
        //  3723: dup            
        //  3724: aconst_null    
        //  3725: iconst_1       
        //  3726: aconst_null    
        //  3727: invokespecial   gg/essential/elementa/components/UIBlock.<init>:(Lgg/essential/elementa/constraints/ColorConstraint;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //  3730: checkcast       Lgg/essential/elementa/UIComponent;
        //  3733: astore_1        /* $this$constrain$iv */
        //  3734: aload_1         /* $this$constrain$iv */
        //  3735: astore_3       
        //  3736: aload_3        
        //  3737: astore          $this$constrain_u24lambda_u2d0$iv
        //  3739: aload           $this$constrain_u24lambda_u2d0$iv
        //  3741: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //  3744: astore          6
        //  3746: astore          10
        //  3748: aload           $this$buyButton_u24lambda_u2d25
        //  3750: iconst_0       
        //  3751: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  3754: checkcast       Ljava/lang/Number;
        //  3757: iconst_1       
        //  3758: iconst_0       
        //  3759: iconst_2       
        //  3760: aconst_null    
        //  3761: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels$default:(Ljava/lang/Number;ZZILjava/lang/Object;)Lgg/essential/elementa/constraints/PixelConstraint;
        //  3764: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //  3767: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //  3770: aload           $this$buyButton_u24lambda_u2d25
        //  3772: bipush          73
        //  3774: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  3777: checkcast       Ljava/lang/Number;
        //  3780: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //  3783: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //  3786: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //  3789: aload           $this$buyButton_u24lambda_u2d25
        //  3791: bipush          100
        //  3793: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  3796: checkcast       Ljava/lang/Number;
        //  3799: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //  3802: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //  3805: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //  3808: getstatic       kotlin/Unit.INSTANCE:Lkotlin/Unit;
        //  3811: pop            
        //  3812: aload           10
        //  3814: aload_3        
        //  3815: astore_1        /* $this$constrain$iv */
        //  3816: aload_1         /* $this$onLeftClick$iv */
        //  3817: new             Lgg/essential/gui/studio/CosmeticStudio$special$$inlined$onLeftClick$2;
        //  3820: dup            
        //  3821: aload_0         /* this */
        //  3822: invokespecial   gg/essential/gui/studio/CosmeticStudio$special$$inlined$onLeftClick$2.<init>:(Lgg/essential/gui/studio/CosmeticStudio;)V
        //  3825: checkcast       Lkotlin/jvm/functions/Function2;
        //  3828: invokevirtual   gg/essential/elementa/UIComponent.onMouseClick:(Lkotlin/jvm/functions/Function2;)Lgg/essential/elementa/UIComponent;
        //  3831: new             Lgg/essential/gui/common/shadow/EssentialUIText;
        //  3834: dup            
        //  3835: aconst_null    
        //  3836: iconst_0       
        //  3837: aconst_null    
        //  3838: iconst_0       
        //  3839: iconst_0       
        //  3840: iconst_0       
        //  3841: bipush          63
        //  3843: invokespecial   gg/essential/gui/common/shadow/EssentialUIText.<init>:(Ljava/lang/String;ZLjava/awt/Color;ZZZI)V
        //  3846: aload_0         /* this */
        //  3847: getfield        gg/essential/gui/studio/CosmeticStudio.buyButtonText:Lgg/essential/elementa/state/BasicState;
        //  3850: checkcast       Lgg/essential/elementa/state/State;
        //  3853: invokevirtual   gg/essential/gui/common/shadow/EssentialUIText.bindText:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/components/UIText;
        //  3856: checkcast       Lgg/essential/elementa/UIComponent;
        //  3859: invokestatic    gg/essential/util/ExtensionsKt.centered:(Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //  3862: checkcast       Lgg/essential/elementa/components/UIText;
        //  3865: getstatic       gg/essential/gui/EssentialPalette.TEXT_HIGHLIGHT:Ljava/awt/Color;
        //  3868: invokevirtual   gg/essential/elementa/components/UIText.setColor:(Ljava/awt/Color;)Lgg/essential/elementa/UIComponent;
        //  3871: invokevirtual   gg/essential/elementa/UIComponent.addChild:(Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //  3874: aload_0         /* this */
        //  3875: invokespecial   gg/essential/gui/studio/CosmeticStudio.getBuyContainer:()Lgg/essential/elementa/components/UIContainer;
        //  3878: checkcast       Lgg/essential/elementa/UIComponent;
        //  3881: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //  3884: putfield        gg/essential/gui/studio/CosmeticStudio.buyButton:Lgg/essential/elementa/UIComponent;
        //  3887: new             Lgg/essential/gui/studio/GiftButton;
        //  3890: dup            
        //  3891: aload_0         /* this */
        //  3892: invokevirtual   gg/essential/gui/studio/CosmeticStudio.getWindow:()Lgg/essential/elementa/components/Window;
        //  3895: aload_0         /* this */
        //  3896: getfield        gg/essential/gui/studio/CosmeticStudio.cartItems:Lgg/essential/elementa/state/MappedState;
        //  3899: checkcast       Lgg/essential/elementa/state/State;
        //  3902: aload_0         /* this */
        //  3903: getfield        gg/essential/gui/studio/CosmeticStudio.inCart:Lgg/essential/elementa/state/MappedState;
        //  3906: checkcast       Lgg/essential/elementa/state/State;
        //  3909: new             Lgg/essential/gui/studio/CosmeticStudio$giftButton$1;
        //  3912: dup            
        //  3913: aload_0         /* this */
        //  3914: invokespecial   gg/essential/gui/studio/CosmeticStudio$giftButton$1.<init>:(Lgg/essential/gui/studio/CosmeticStudio;)V
        //  3917: checkcast       Lkotlin/jvm/functions/Function1;
        //  3920: invokespecial   gg/essential/gui/studio/GiftButton.<init>:(Lgg/essential/elementa/components/Window;Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;Lkotlin/jvm/functions/Function1;)V
        //  3923: checkcast       Lgg/essential/elementa/UIComponent;
        //  3926: astore_1        /* $this$constrain$iv */
        //  3927: aload_1         /* $this$constrain$iv */
        //  3928: astore_3       
        //  3929: aload_3        
        //  3930: astore          $this$constrain_u24lambda_u2d0$iv
        //  3932: aload           $this$constrain_u24lambda_u2d0$iv
        //  3934: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //  3937: astore          $this$giftButton_u24lambda_u2d27
        //  3939: aload           $this$giftButton_u24lambda_u2d27
        //  3941: new             Lgg/essential/elementa/constraints/SiblingConstraint;
        //  3944: dup            
        //  3945: ldc_w           3.0
        //  3948: iconst_1       
        //  3949: invokespecial   gg/essential/elementa/constraints/SiblingConstraint.<init>:(FZ)V
        //  3952: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //  3955: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //  3958: aload           $this$giftButton_u24lambda_u2d27
        //  3960: bipush          100
        //  3962: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  3965: checkcast       Ljava/lang/Number;
        //  3968: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //  3971: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //  3974: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //  3977: getstatic       kotlin/Unit.INSTANCE:Lkotlin/Unit;
        //  3980: pop            
        //  3981: aload_3        
        //  3982: aload_0         /* this */
        //  3983: invokespecial   gg/essential/gui/studio/CosmeticStudio.getBuyContainer:()Lgg/essential/elementa/components/UIContainer;
        //  3986: checkcast       Lgg/essential/elementa/UIComponent;
        //  3989: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //  3992: pop            
        //  3993: aload_0         /* this */
        //  3994: new             Lgg/essential/elementa/components/UIContainer;
        //  3997: dup            
        //  3998: invokespecial   gg/essential/elementa/components/UIContainer.<init>:()V
        //  4001: checkcast       Lgg/essential/elementa/UIComponent;
        //  4004: astore_1        /* $this$constrain$iv */
        //  4005: aload_1         /* $this$constrain$iv */
        //  4006: astore_3       
        //  4007: aload_3        
        //  4008: astore          $this$constrain_u24lambda_u2d0$iv
        //  4010: aload           $this$constrain_u24lambda_u2d0$iv
        //  4012: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //  4015: astore          6
        //  4017: astore          10
        //  4019: aload           $this$sortOptionsContainer_delegate_u24lambda_u2d28
        //  4021: iconst_2       
        //  4022: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  4025: checkcast       Ljava/lang/Number;
        //  4028: iconst_1       
        //  4029: iconst_0       
        //  4030: iconst_2       
        //  4031: aconst_null    
        //  4032: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels$default:(Ljava/lang/Number;ZZILjava/lang/Object;)Lgg/essential/elementa/constraints/PixelConstraint;
        //  4035: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //  4038: aload_0         /* this */
        //  4039: invokespecial   gg/essential/gui/studio/CosmeticStudio.getOptionsViewContainer:()Lgg/essential/elementa/components/UIContainer;
        //  4042: checkcast       Lgg/essential/elementa/UIComponent;
        //  4045: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.boundTo:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/constraints/SuperConstraint;
        //  4048: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //  4051: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //  4054: aload           $this$sortOptionsContainer_delegate_u24lambda_u2d28
        //  4056: new             Lgg/essential/gui/common/constraints/CenterPixelConstraint;
        //  4059: dup            
        //  4060: iconst_0       
        //  4061: invokespecial   gg/essential/gui/common/constraints/CenterPixelConstraint.<init>:(C)V
        //  4064: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //  4067: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //  4070: aload           $this$sortOptionsContainer_delegate_u24lambda_u2d28
        //  4072: new             Lgg/essential/elementa/constraints/ChildBasedSizeConstraint;
        //  4075: dup            
        //  4076: fconst_0       
        //  4077: iconst_1       
        //  4078: aconst_null    
        //  4079: invokespecial   gg/essential/elementa/constraints/ChildBasedSizeConstraint.<init>:(FILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //  4082: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //  4085: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //  4088: aload           $this$sortOptionsContainer_delegate_u24lambda_u2d28
        //  4090: bipush          17
        //  4092: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  4095: checkcast       Ljava/lang/Number;
        //  4098: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //  4101: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //  4104: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //  4107: getstatic       kotlin/Unit.INSTANCE:Lkotlin/Unit;
        //  4110: pop            
        //  4111: aload           10
        //  4113: aload_3        
        //  4114: aload_0         /* this */
        //  4115: invokevirtual   gg/essential/gui/studio/CosmeticStudio.getTitleBar:()Lgg/essential/elementa/components/UIBlock;
        //  4118: checkcast       Lgg/essential/elementa/UIComponent;
        //  4121: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //  4124: aload_0         /* this */
        //  4125: getstatic       gg/essential/gui/studio/CosmeticStudio.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //  4128: bipush          22
        //  4130: aaload         
        //  4131: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //  4134: putfield        gg/essential/gui/studio/CosmeticStudio.sortOptionsContainer$delegate:Lkotlin/properties/ReadWriteProperty;
        //  4137: new             Lgg/essential/gui/common/shadow/EssentialUIText;
        //  4140: dup            
        //  4141: ldc_w           "Sort by"
        //  4144: iconst_0       
        //  4145: aconst_null    
        //  4146: iconst_0       
        //  4147: iconst_0       
        //  4148: iconst_0       
        //  4149: bipush          62
        //  4151: invokespecial   gg/essential/gui/common/shadow/EssentialUIText.<init>:(Ljava/lang/String;ZLjava/awt/Color;ZZZI)V
        //  4154: checkcast       Lgg/essential/elementa/UIComponent;
        //  4157: astore_1        /* $this$constrain$iv */
        //  4158: aload_1         /* $this$constrain$iv */
        //  4159: astore_3       
        //  4160: aload_3        
        //  4161: astore          $this$constrain_u24lambda_u2d0$iv
        //  4163: aload           $this$constrain_u24lambda_u2d0$iv
        //  4165: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //  4168: astore          $this$sortText_delegate_u24lambda_u2d29
        //  4170: aload           $this$sortText_delegate_u24lambda_u2d29
        //  4172: new             Lgg/essential/elementa/constraints/CenterConstraint;
        //  4175: dup            
        //  4176: invokespecial   gg/essential/elementa/constraints/CenterConstraint.<init>:()V
        //  4179: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //  4182: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //  4185: aload           $this$sortText_delegate_u24lambda_u2d29
        //  4187: getstatic       gg/essential/gui/EssentialPalette.TEXT:Ljava/awt/Color;
        //  4190: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.toConstraint:(Ljava/awt/Color;)Lgg/essential/elementa/constraints/ConstantColorConstraint;
        //  4193: checkcast       Lgg/essential/elementa/constraints/ColorConstraint;
        //  4196: invokevirtual   gg/essential/elementa/UIConstraints.setColor:(Lgg/essential/elementa/constraints/ColorConstraint;)V
        //  4199: getstatic       kotlin/Unit.INSTANCE:Lkotlin/Unit;
        //  4202: pop            
        //  4203: aload_3        
        //  4204: aload_0         /* this */
        //  4205: invokespecial   gg/essential/gui/studio/CosmeticStudio.getSortOptionsContainer:()Lgg/essential/elementa/components/UIContainer;
        //  4208: checkcast       Lgg/essential/elementa/UIComponent;
        //  4211: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //  4214: aload_0         /* this */
        //  4215: getstatic       gg/essential/gui/studio/CosmeticStudio.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //  4218: bipush          23
        //  4220: aaload         
        //  4221: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //  4224: pop            
        //  4225: aload_0         /* this */
        //  4226: getstatic       gg/essential/config/EssentialConfig.INSTANCE:Lgg/essential/config/EssentialConfig;
        //  4229: invokevirtual   gg/essential/config/EssentialConfig.getWardrobeSortOption:()I
        //  4232: invokestatic    gg/essential/gui/studio/CosmeticStudio$SortOption.values:()[Lgg/essential/gui/studio/CosmeticStudio$SortOption;
        //  4235: astore_1       
        //  4236: istore          11
        //  4238: astore          10
        //  4240: aload_1         /* $this$map$iv */
        //  4241: astore_3       
        //  4242: new             Ljava/util/ArrayList;
        //  4245: dup            
        //  4246: aload_1         /* $this$map$iv */
        //  4247: arraylength    
        //  4248: invokespecial   java/util/ArrayList.<init>:(I)V
        //  4251: checkcast       Ljava/util/Collection;
        //  4254: astore          destination$iv$iv
        //  4256: iconst_0       
        //  4257: istore          6
        //  4259: aload_3         /* $this$mapTo$iv$iv */
        //  4260: arraylength    
        //  4261: istore          7
        //  4263: iload           6
        //  4265: iload           7
        //  4267: if_icmpge       4307
        //  4270: aload_3         /* $this$mapTo$iv$iv */
        //  4271: iload           6
        //  4273: aaload         
        //  4274: astore          item$iv$iv
        //  4276: aload           destination$iv$iv
        //  4278: aload           item$iv$iv
        //  4280: astore          9
        //  4282: astore          12
        //  4284: aload           it
        //  4286: invokevirtual   gg/essential/gui/studio/CosmeticStudio$SortOption.getDisplayName:()Ljava/lang/String;
        //  4289: astore          13
        //  4291: aload           12
        //  4293: aload           13
        //  4295: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //  4300: pop            
        //  4301: iinc            6, 1
        //  4304: goto            4263
        //  4307: aload           destination$iv$iv
        //  4309: checkcast       Ljava/util/List;
        //  4312: astore          12
        //  4314: aload           10
        //  4316: iload           11
        //  4318: aload           12
        //  4320: astore          15
        //  4322: istore          16
        //  4324: new             Lgg/essential/gui/common/EssentialDropDown;
        //  4327: dup            
        //  4328: iload           16
        //  4330: aload           15
        //  4332: invokespecial   gg/essential/gui/common/EssentialDropDown.<init>:(ILjava/util/List;)V
        //  4335: checkcast       Lgg/essential/elementa/UIComponent;
        //  4338: astore_1        /* $this$constrain$iv */
        //  4339: aload_1         /* $this$constrain$iv */
        //  4340: astore_3       
        //  4341: aload_3        
        //  4342: astore          $this$constrain_u24lambda_u2d0$iv
        //  4344: aload           $this$constrain_u24lambda_u2d0$iv
        //  4346: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //  4349: astore          6
        //  4351: astore          10
        //  4353: aload           $this$sortOptions_delegate_u24lambda_u2d31
        //  4355: new             Lgg/essential/elementa/constraints/SiblingConstraint;
        //  4358: dup            
        //  4359: ldc_w           11.0
        //  4362: iconst_0       
        //  4363: iconst_2       
        //  4364: aconst_null    
        //  4365: invokespecial   gg/essential/elementa/constraints/SiblingConstraint.<init>:(FZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //  4368: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //  4371: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //  4374: getstatic       kotlin/Unit.INSTANCE:Lkotlin/Unit;
        //  4377: pop            
        //  4378: aload           10
        //  4380: aload_3        
        //  4381: aload_0         /* this */
        //  4382: invokespecial   gg/essential/gui/studio/CosmeticStudio.getSortOptionsContainer:()Lgg/essential/elementa/components/UIContainer;
        //  4385: checkcast       Lgg/essential/elementa/UIComponent;
        //  4388: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //  4391: aload_0         /* this */
        //  4392: getstatic       gg/essential/gui/studio/CosmeticStudio.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //  4395: bipush          24
        //  4397: aaload         
        //  4398: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //  4401: putfield        gg/essential/gui/studio/CosmeticStudio.sortOptions$delegate:Lkotlin/properties/ReadWriteProperty;
        //  4404: aload_0         /* this */
        //  4405: getfield        gg/essential/gui/studio/CosmeticStudio.buyButton:Lgg/essential/elementa/UIComponent;
        //  4408: aload_0         /* this */
        //  4409: getfield        gg/essential/gui/studio/CosmeticStudio.cartItems:Lgg/essential/elementa/state/MappedState;
        //  4412: getstatic       gg/essential/gui/studio/CosmeticStudio$7.INSTANCE:Lgg/essential/gui/studio/CosmeticStudio$7;
        //  4415: checkcast       Lkotlin/jvm/functions/Function1;
        //  4418: invokevirtual   gg/essential/elementa/state/MappedState.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //  4421: checkcast       Lgg/essential/elementa/state/State;
        //  4424: aload_0         /* this */
        //  4425: getfield        gg/essential/gui/studio/CosmeticStudio.buyButton:Lgg/essential/elementa/UIComponent;
        //  4428: iconst_0       
        //  4429: iconst_0       
        //  4430: iconst_3       
        //  4431: invokestatic    gg/essential/util/ExtensionsKt.hoveredState$default$56721d26:(Lgg/essential/elementa/UIComponent;ZZI)Lgg/essential/elementa/state/State;
        //  4434: invokestatic    gg/essential/gui/common/StateExtensionsKt.and:(Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;)Lgg/essential/elementa/state/MappedState;
        //  4437: getstatic       gg/essential/gui/studio/CosmeticStudio$8.INSTANCE:Lgg/essential/gui/studio/CosmeticStudio$8;
        //  4440: checkcast       Lkotlin/jvm/functions/Function1;
        //  4443: invokevirtual   gg/essential/elementa/state/MappedState.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //  4446: checkcast       Lgg/essential/elementa/state/State;
        //  4449: invokestatic    gg/essential/elementa/state/ExtensionsKt.toConstraint:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/constraints/ConstantColorConstraint;
        //  4452: checkcast       Lgg/essential/elementa/constraints/ColorConstraint;
        //  4455: invokevirtual   gg/essential/elementa/UIComponent.setColor:(Lgg/essential/elementa/constraints/ColorConstraint;)Lgg/essential/elementa/UIComponent;
        //  4458: pop            
        //  4459: aload_0         /* this */
        //  4460: invokespecial   gg/essential/gui/studio/CosmeticStudio.getSortOptions:()Lgg/essential/gui/common/EssentialDropDown;
        //  4463: iconst_1       
        //  4464: invokevirtual   gg/essential/gui/common/EssentialDropDown.setFloating:(Z)V
        //  4467: aload_0         /* this */
        //  4468: invokespecial   gg/essential/gui/studio/CosmeticStudio.getSortOptions:()Lgg/essential/gui/common/EssentialDropDown;
        //  4471: invokevirtual   gg/essential/gui/common/EssentialDropDown.getSelectedIndex:()Lgg/essential/elementa/state/State;
        //  4474: aload_0         /* this */
        //  4475: getfield        gg/essential/gui/studio/CosmeticStudio.selectedCategory:Lgg/essential/elementa/state/BasicState;
        //  4478: checkcast       Lgg/essential/elementa/state/State;
        //  4481: invokevirtual   gg/essential/elementa/state/State.zip:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/state/State;
        //  4484: new             Lgg/essential/gui/studio/CosmeticStudio$9;
        //  4487: dup            
        //  4488: aload_0         /* this */
        //  4489: invokespecial   gg/essential/gui/studio/CosmeticStudio$9.<init>:(Lgg/essential/gui/studio/CosmeticStudio;)V
        //  4492: checkcast       Lkotlin/jvm/functions/Function1;
        //  4495: invokevirtual   gg/essential/elementa/state/State.onSetValue:(Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function0;
        //  4498: pop            
        //  4499: aload_0         /* this */
        //  4500: getfield        gg/essential/gui/studio/CosmeticStudio.selectedCategory:Lgg/essential/elementa/state/BasicState;
        //  4503: getstatic       gg/essential/gui/studio/CosmeticStudio$categoryTextState$1.INSTANCE:Lgg/essential/gui/studio/CosmeticStudio$categoryTextState$1;
        //  4506: checkcast       Lkotlin/jvm/functions/Function1;
        //  4509: invokevirtual   gg/essential/elementa/state/BasicState.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //  4512: astore_1        /* categoryTextState */
        //  4513: new             Lgg/essential/gui/common/shadow/EssentialUIText;
        //  4516: dup            
        //  4517: aconst_null    
        //  4518: iconst_0       
        //  4519: aconst_null    
        //  4520: iconst_0       
        //  4521: iconst_0       
        //  4522: iconst_0       
        //  4523: bipush          63
        //  4525: invokespecial   gg/essential/gui/common/shadow/EssentialUIText.<init>:(Ljava/lang/String;ZLjava/awt/Color;ZZZI)V
        //  4528: aload_1         /* categoryTextState */
        //  4529: checkcast       Lgg/essential/elementa/state/State;
        //  4532: invokevirtual   gg/essential/gui/common/shadow/EssentialUIText.bindText:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/components/UIText;
        //  4535: checkcast       Lgg/essential/elementa/UIComponent;
        //  4538: astore_3        /* $this$constrain$iv */
        //  4539: aload_3         /* $this$constrain$iv */
        //  4540: astore          5
        //  4542: aload           5
        //  4544: astore          $this$constrain_u24lambda_u2d0$iv
        //  4546: aload           $this$constrain_u24lambda_u2d0$iv
        //  4548: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //  4551: astore          $this$_init__u24lambda_u2d45
        //  4553: aload           $this$_init__u24lambda_u2d45
        //  4555: iconst_2       
        //  4556: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  4559: checkcast       Ljava/lang/Number;
        //  4562: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //  4565: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //  4568: aload_0         /* this */
        //  4569: invokespecial   gg/essential/gui/studio/CosmeticStudio.getOptionsViewContainer:()Lgg/essential/elementa/components/UIContainer;
        //  4572: checkcast       Lgg/essential/elementa/UIComponent;
        //  4575: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.boundTo:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/constraints/SuperConstraint;
        //  4578: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //  4581: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //  4584: aload           $this$_init__u24lambda_u2d45
        //  4586: new             Lgg/essential/gui/common/constraints/CenterPixelConstraint;
        //  4589: dup            
        //  4590: iconst_0       
        //  4591: invokespecial   gg/essential/gui/common/constraints/CenterPixelConstraint.<init>:(C)V
        //  4594: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //  4597: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //  4600: aload           5
        //  4602: aload_0         /* this */
        //  4603: invokevirtual   gg/essential/gui/studio/CosmeticStudio.getTitleBar:()Lgg/essential/elementa/components/UIBlock;
        //  4606: checkcast       Lgg/essential/elementa/UIComponent;
        //  4609: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //  4612: aconst_null    
        //  4613: getstatic       gg/essential/gui/studio/CosmeticStudio.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //  4616: bipush          25
        //  4618: aaload         
        //  4619: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //  4622: pop            
        //  4623: return         
        //    StackMapTable: 00 06 FF 00 B6 00 0B 07 00 02 07 01 E3 00 01 07 01 E9 00 00 00 00 00 07 00 02 00 00 FF 00 25 00 0B 07 00 02 07 01 E3 00 01 07 01 E9 07 01 F8 07 01 F3 00 00 00 07 00 02 00 00 FF 00 05 00 0B 07 00 02 07 01 E3 00 01 07 01 E9 00 00 00 00 00 07 00 02 00 00 40 01 FF 0F C3 00 0F 07 00 02 07 04 30 07 02 C7 07 04 30 07 04 2E 00 01 01 00 07 01 F8 07 00 02 01 00 00 07 01 FA 00 00 2B
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @NotNull
    public final CosmeticsManager getCosmeticsManager() {
        return this.cosmeticsManager;
    }
    
    public final void setPlayerRotationMode(@NotNull final RotationMode <set-?>) {
        Intrinsics.checkNotNullParameter((Object)<set-?>, "<set-?>");
        this.playerRotationMode = <set-?>;
    }
    
    @NotNull
    public final BasicState<Category> getSelectedCategory() {
        return this.selectedCategory;
    }
    
    @NotNull
    public final MappedState<Boolean, CosmeticOption.View> getView() {
        return this.view;
    }
    
    public final State<Set<Sale>> getSaleState() {
        return this.saleState;
    }
    
    @NotNull
    public final BasicState<Integer> getEquippedOutfit() {
        return this.equippedOutfit;
    }
    
    @NotNull
    public final State<Map<CosmeticSlot, Cosmetic>> getPreviewingCosmetics() {
        return this.previewingCosmetics;
    }
    
    @NotNull
    public final State<Map<CosmeticSlot, String>> getEquippedCosmeticsState() {
        return this.equippedCosmeticsState;
    }
    
    @NotNull
    public final BasicState<Set<String>> getExplicitCartItems() {
        return this.explicitCartItems;
    }
    
    @NotNull
    public final MappedState<Map<CosmeticSlot, Cosmetic>, Set<String>> getImplicitCartItems() {
        return this.implicitCartItems;
    }
    
    @NotNull
    public final MappedState<Pair<Set<String>, Set<String>>, Set<String>> getCartItems() {
        return this.cartItems;
    }
    
    public final void updatePreviewingCosmetics(@NotNull final Function1<? super Map<CosmeticSlot, Cosmetic>, Unit> update) {
        Intrinsics.checkNotNullParameter((Object)update, "update");
        this.previewingOutfits.set((kotlin.jvm.functions.Function1<? super Object, ?>)new CosmeticStudio$updatePreviewingCosmetics.CosmeticStudio$updatePreviewingCosmetics$1(this, (Function1)update));
    }
    
    @NotNull
    public final BasicState<Set<String>> getUnlockedCosmetics() {
        return this.unlockedCosmetics;
    }
    
    public final void changeOutfit(final int offset) {
        this.equippedOutfit.set((kotlin.jvm.functions.Function1<? super Object, ?>)new CosmeticStudio$changeOutfit.CosmeticStudio$changeOutfit$1(offset));
        this.cosmeticsManager.selectOutfit(this.equippedOutfit.get().intValue());
    }
    
    private final CategoriesSection getCategoriesContainer() {
        return (CategoriesSection)this.categoriesContainer$delegate.getValue((Object)this, (KProperty)CosmeticStudio.$$delegatedProperties[0]);
    }
    
    private final UIComponent getCartButtonContainer() {
        return (UIComponent)this.cartButtonContainer$delegate.getValue((Object)this, (KProperty)CosmeticStudio.$$delegatedProperties[1]);
    }
    
    private final UIBlock getFirstDivider() {
        return (UIBlock)this.firstDivider$delegate.getValue((Object)this, (KProperty)CosmeticStudio.$$delegatedProperties[2]);
    }
    
    private final UIContainer getOptionsContainer() {
        return (UIContainer)this.optionsContainer$delegate.getValue((Object)this, (KProperty)CosmeticStudio.$$delegatedProperties[3]);
    }
    
    private final UIBlock getSecondDivider() {
        return (UIBlock)this.secondDivider$delegate.getValue((Object)this, (KProperty)CosmeticStudio.$$delegatedProperties[4]);
    }
    
    @NotNull
    public final PlayerSection getPlayerDisplayContainer() {
        return (PlayerSection)this.playerDisplayContainer$delegate.getValue((Object)this, (KProperty)CosmeticStudio.$$delegatedProperties[5]);
    }
    
    private final UIBlock getCartBackground() {
        return (UIBlock)this.cartBackground$delegate.getValue((Object)this, (KProperty)CosmeticStudio.$$delegatedProperties[6]);
    }
    
    private final UIContainer getOptionsViewContainer() {
        return (UIContainer)this.optionsViewContainer$delegate.getValue((Object)this, (KProperty)CosmeticStudio.$$delegatedProperties[10]);
    }
    
    private final ScrollComponent getOptionsView() {
        return (ScrollComponent)this.optionsView$delegate.getValue((Object)this, (KProperty)CosmeticStudio.$$delegatedProperties[11]);
    }
    
    private final UIContainer getCategoryDescriptionContainer() {
        return (UIContainer)this.categoryDescriptionContainer$delegate.getValue((Object)this, (KProperty)CosmeticStudio.$$delegatedProperties[12]);
    }
    
    private final UIBlock getOptionsScrollBar() {
        return (UIBlock)this.optionsScrollBar$delegate.getValue((Object)this, (KProperty)CosmeticStudio.$$delegatedProperties[17]);
    }
    
    private final void filterAndSortCosmeticOptions(final Category category) {
        this.getOptionsView().filterChildren((Function1<? super UIComponent, Boolean>)new CosmeticStudio$filterAndSortCosmeticOptions.CosmeticStudio$filterAndSortCosmeticOptions$1(category, this));
        this.sortCosmeticOptions(SortOption.Companion.fromIndex(EssentialConfig.INSTANCE.getWardrobeSortOption()), this.selectedCategory.get());
    }
    
    private final UIBlock getCartContainer() {
        return (UIBlock)this.cartContainer$delegate.getValue((Object)this, (KProperty)CosmeticStudio.$$delegatedProperties[18]);
    }
    
    private final UIBlock getPriceBlock() {
        return (UIBlock)this.priceBlock$delegate.getValue((Object)this, (KProperty)CosmeticStudio.$$delegatedProperties[19]);
    }
    
    private final UIContainer getBuyContainer() {
        return (UIContainer)this.buyContainer$delegate.getValue((Object)this, (KProperty)CosmeticStudio.$$delegatedProperties[21]);
    }
    
    private final UIContainer getSortOptionsContainer() {
        return (UIContainer)this.sortOptionsContainer$delegate.getValue((Object)this, (KProperty)CosmeticStudio.$$delegatedProperties[22]);
    }
    
    private final EssentialDropDown getSortOptions() {
        return (EssentialDropDown)this.sortOptions$delegate.getValue((Object)this, (KProperty)CosmeticStudio.$$delegatedProperties[24]);
    }
    
    private final void handleResize() {
        this.setNewGuiScale(GuiUtil.INSTANCE.getGuiScale());
    }
    
    @Override
    public void afterInitialization() {
        Window.Companion.enqueueRenderOperation((Function0<Unit>)new CosmeticStudio$afterInitialization.CosmeticStudio$afterInitialization$1((Object)this));
        Window.Companion.enqueueRenderOperation((Function0<Unit>)new CosmeticStudio$afterInitialization.CosmeticStudio$afterInitialization$2((Object)this));
    }
    
    @Override
    public void updateGuiScale() {
        this.setNewGuiScale(GuiUtil.INSTANCE.getGuiScale());
        super.updateGuiScale();
    }
    
    public void resize(@NotNull final MinecraftClient mcIn, final int w, final int h) {
        Intrinsics.checkNotNullParameter((Object)mcIn, "mcIn");
        super.resize(mcIn, w, h);
        this.handleResize();
    }
    
    public final void populateCosmetics() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokespecial   gg/essential/gui/studio/CosmeticStudio.getOptionsView:()Lgg/essential/elementa/components/ScrollComponent;
        //     4: invokevirtual   gg/essential/elementa/components/ScrollComponent.clearChildren:()Lgg/essential/elementa/components/ScrollComponent;
        //     7: pop            
        //     8: aload_0         /* this */
        //     9: getfield        gg/essential/gui/studio/CosmeticStudio.cosmeticsManager:Lgg/essential/network/connectionmanager/cosmetics/CosmeticsManager;
        //    12: invokevirtual   gg/essential/network/connectionmanager/cosmetics/CosmeticsManager.getCosmetics:()Ljava/util/Map;
        //    15: dup            
        //    16: ldc_w           "cosmeticsManager.cosmetics"
        //    19: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //    22: astore_2        /* $this$filter$iv */
        //    23: aload_2         /* $this$filter$iv */
        //    24: astore_3       
        //    25: new             Ljava/util/LinkedHashMap;
        //    28: dup            
        //    29: invokespecial   java/util/LinkedHashMap.<init>:()V
        //    32: checkcast       Ljava/util/Map;
        //    35: astore          destination$iv$iv
        //    37: aload_3         /* $this$filterTo$iv$iv */
        //    38: invokeinterface java/util/Map.entrySet:()Ljava/util/Set;
        //    43: invokeinterface java/util/Set.iterator:()Ljava/util/Iterator;
        //    48: astore          6
        //    50: aload           6
        //    52: invokeinterface java/util/Iterator.hasNext:()Z
        //    57: ifeq            205
        //    60: aload           6
        //    62: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    67: checkcast       Ljava/util/Map$Entry;
        //    70: astore          element$iv$iv
        //    72: aload           element$iv$iv
        //    74: astore          it
        //    76: aload           it
        //    78: invokeinterface java/util/Map$Entry.getValue:()Ljava/lang/Object;
        //    83: checkcast       Lgg/essential/network/cosmetics/Cosmetic;
        //    86: invokevirtual   gg/essential/network/cosmetics/Cosmetic.isAvailable:()Z
        //    89: ifne            120
        //    92: aload_0         /* this */
        //    93: getfield        gg/essential/gui/studio/CosmeticStudio.cosmeticsManager:Lgg/essential/network/connectionmanager/cosmetics/CosmeticsManager;
        //    96: invokevirtual   gg/essential/network/connectionmanager/cosmetics/CosmeticsManager.getUnlockedCosmetics:()Ljava/util/Set;
        //    99: aload           it
        //   101: invokeinterface java/util/Map$Entry.getValue:()Ljava/lang/Object;
        //   106: checkcast       Lgg/essential/network/cosmetics/Cosmetic;
        //   109: invokevirtual   gg/essential/network/cosmetics/Cosmetic.getId:()Ljava/lang/String;
        //   112: invokeinterface java/util/Set.contains:(Ljava/lang/Object;)Z
        //   117: ifeq            176
        //   120: aload           it
        //   122: invokeinterface java/util/Map$Entry.getValue:()Ljava/lang/Object;
        //   127: checkcast       Lgg/essential/network/cosmetics/Cosmetic;
        //   130: invokevirtual   gg/essential/network/cosmetics/Cosmetic.getTags:()Ljava/util/Set;
        //   133: ldc_w           "HIDDEN"
        //   136: invokeinterface java/util/Set.contains:(Ljava/lang/Object;)Z
        //   141: ifeq            172
        //   144: aload_0         /* this */
        //   145: getfield        gg/essential/gui/studio/CosmeticStudio.cosmeticsManager:Lgg/essential/network/connectionmanager/cosmetics/CosmeticsManager;
        //   148: invokevirtual   gg/essential/network/connectionmanager/cosmetics/CosmeticsManager.getUnlockedCosmetics:()Ljava/util/Set;
        //   151: aload           it
        //   153: invokeinterface java/util/Map$Entry.getValue:()Ljava/lang/Object;
        //   158: checkcast       Lgg/essential/network/cosmetics/Cosmetic;
        //   161: invokevirtual   gg/essential/network/cosmetics/Cosmetic.getId:()Ljava/lang/String;
        //   164: invokeinterface java/util/Set.contains:(Ljava/lang/Object;)Z
        //   169: ifeq            176
        //   172: iconst_1       
        //   173: goto            177
        //   176: iconst_0       
        //   177: ifeq            50
        //   180: aload           destination$iv$iv
        //   182: aload           element$iv$iv
        //   184: invokeinterface java/util/Map$Entry.getKey:()Ljava/lang/Object;
        //   189: aload           element$iv$iv
        //   191: invokeinterface java/util/Map$Entry.getValue:()Ljava/lang/Object;
        //   196: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   201: pop            
        //   202: goto            50
        //   205: aload           destination$iv$iv
        //   207: astore_1        /* visibleCosmetics */
        //   208: aload_0         /* this */
        //   209: invokespecial   gg/essential/gui/studio/CosmeticStudio.getCategoriesContainer:()Lgg/essential/gui/studio/CategoriesSection;
        //   212: aload_0         /* this */
        //   213: getfield        gg/essential/gui/studio/CosmeticStudio.cosmeticsManager:Lgg/essential/network/connectionmanager/cosmetics/CosmeticsManager;
        //   216: aload_0         /* this */
        //   217: aload_1         /* visibleCosmetics */
        //   218: invokevirtual   gg/essential/gui/studio/CategoriesSection.populateCategories:(Lgg/essential/network/connectionmanager/cosmetics/CosmeticsManager;Lgg/essential/gui/studio/CosmeticStudio;Ljava/util/Map;)V
        //   221: aload_0         /* this */
        //   222: invokespecial   gg/essential/gui/studio/CosmeticStudio.getCategoryDescriptionContainer:()Lgg/essential/elementa/components/UIContainer;
        //   225: checkcast       Lgg/essential/elementa/UIComponent;
        //   228: aload_0         /* this */
        //   229: invokespecial   gg/essential/gui/studio/CosmeticStudio.getOptionsView:()Lgg/essential/elementa/components/ScrollComponent;
        //   232: checkcast       Lgg/essential/elementa/UIComponent;
        //   235: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   238: pop            
        //   239: new             Lgg/essential/gui/common/HollowUIContainer;
        //   242: dup            
        //   243: invokespecial   gg/essential/gui/common/HollowUIContainer.<init>:()V
        //   246: checkcast       Lgg/essential/elementa/UIComponent;
        //   249: astore_2        /* $this$constrain$iv */
        //   250: aload_2         /* $this$constrain$iv */
        //   251: astore_3       
        //   252: aload_3        
        //   253: astore          $this$constrain_u24lambda_u2d0$iv
        //   255: aload           $this$constrain_u24lambda_u2d0$iv
        //   257: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   260: astore          $this$populateCosmetics_u24lambda_u2d33
        //   262: aload           $this$populateCosmetics_u24lambda_u2d33
        //   264: bipush          100
        //   266: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   269: checkcast       Ljava/lang/Number;
        //   272: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   275: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   278: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   281: aload           $this$populateCosmetics_u24lambda_u2d33
        //   283: bipush          10
        //   285: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   288: checkcast       Ljava/lang/Number;
        //   291: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   294: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   297: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   300: aload           $this$populateCosmetics_u24lambda_u2d33
        //   302: new             Lgg/essential/elementa/constraints/SiblingConstraint;
        //   305: dup            
        //   306: fconst_0       
        //   307: iconst_0       
        //   308: iconst_3       
        //   309: aconst_null    
        //   310: invokespecial   gg/essential/elementa/constraints/SiblingConstraint.<init>:(FZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   313: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   316: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   319: aload_3        
        //   320: aload_0         /* this */
        //   321: invokespecial   gg/essential/gui/studio/CosmeticStudio.getOptionsView:()Lgg/essential/elementa/components/ScrollComponent;
        //   324: checkcast       Lgg/essential/elementa/UIComponent;
        //   327: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   330: pop            
        //   331: aload_1         /* visibleCosmetics */
        //   332: astore_2        /* $this$forEach$iv */
        //   333: aload_2         /* $this$forEach$iv */
        //   334: invokeinterface java/util/Map.entrySet:()Ljava/util/Set;
        //   339: invokeinterface java/util/Set.iterator:()Ljava/util/Iterator;
        //   344: astore_3       
        //   345: aload_3        
        //   346: invokeinterface java/util/Iterator.hasNext:()Z
        //   351: ifeq            419
        //   354: aload_3        
        //   355: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   360: checkcast       Ljava/util/Map$Entry;
        //   363: astore          element$iv
        //   365: aload           element$iv
        //   367: astore          it
        //   369: new             Lgg/essential/gui/studio/CosmeticOption;
        //   372: dup            
        //   373: aload_0         /* this */
        //   374: getfield        gg/essential/gui/studio/CosmeticStudio.cosmeticsManager:Lgg/essential/network/connectionmanager/cosmetics/CosmeticsManager;
        //   377: aload           it
        //   379: invokeinterface java/util/Map$Entry.getValue:()Ljava/lang/Object;
        //   384: dup            
        //   385: ldc_w           "it.value"
        //   388: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   391: checkcast       Lgg/essential/network/cosmetics/Cosmetic;
        //   394: aload_0         /* this */
        //   395: invokevirtual   gg/essential/gui/studio/CosmeticStudio.getWindow:()Lgg/essential/elementa/components/Window;
        //   398: aload_0         /* this */
        //   399: invokespecial   gg/essential/gui/studio/CosmeticOption.<init>:(Lgg/essential/network/connectionmanager/cosmetics/CosmeticsManager;Lgg/essential/network/cosmetics/Cosmetic;Lgg/essential/elementa/components/Window;Lgg/essential/gui/studio/CosmeticStudio;)V
        //   402: checkcast       Lgg/essential/elementa/UIComponent;
        //   405: aload_0         /* this */
        //   406: invokespecial   gg/essential/gui/studio/CosmeticStudio.getOptionsView:()Lgg/essential/elementa/components/ScrollComponent;
        //   409: checkcast       Lgg/essential/elementa/UIComponent;
        //   412: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   415: pop            
        //   416: goto            345
        //   419: getstatic       gg/essential/elementa/components/Window.Companion:Lgg/essential/elementa/components/Window$Companion;
        //   422: new             Lgg/essential/gui/studio/CosmeticStudio$populateCosmetics$3;
        //   425: dup            
        //   426: aload_0         /* this */
        //   427: invokespecial   gg/essential/gui/studio/CosmeticStudio$populateCosmetics$3.<init>:(Lgg/essential/gui/studio/CosmeticStudio;)V
        //   430: checkcast       Lkotlin/jvm/functions/Function0;
        //   433: invokevirtual   gg/essential/elementa/components/Window$Companion.enqueueRenderOperation:(Lkotlin/jvm/functions/Function0;)V
        //   436: return         
        //    StackMapTable: 00 08 FF 00 32 00 07 07 00 02 00 07 05 13 07 05 13 07 05 13 00 07 01 E9 00 00 FD 00 45 07 05 19 07 05 19 33 03 40 01 F9 00 1B FF 00 8B 00 07 07 00 02 07 05 13 07 05 13 07 01 E9 07 01 F8 00 07 02 6F 00 00 FB 00 49
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public final void purchase(@Nullable final String giftTo, @NotNull final Function0<Unit> callback) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc_w           "callback"
        //     4: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     7: aload_0         /* this */
        //     8: getfield        gg/essential/gui/studio/CosmeticStudio.cartCosmetics:Lgg/essential/elementa/state/MappedState;
        //    11: invokevirtual   gg/essential/elementa/state/MappedState.get:()Ljava/lang/Object;
        //    14: checkcast       Ljava/lang/Iterable;
        //    17: astore          $this$map$iv
        //    19: aload           $this$map$iv
        //    21: astore          6
        //    23: new             Ljava/util/ArrayList;
        //    26: dup            
        //    27: aload           $this$map$iv
        //    29: bipush          10
        //    31: invokestatic    kotlin/collections/CollectionsKt.collectionSizeOrDefault:(Ljava/lang/Iterable;I)I
        //    34: invokespecial   java/util/ArrayList.<init>:(I)V
        //    37: checkcast       Ljava/util/Collection;
        //    40: astore          destination$iv$iv
        //    42: aload           $this$mapTo$iv$iv
        //    44: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //    49: astore          9
        //    51: aload           9
        //    53: invokeinterface java/util/Iterator.hasNext:()Z
        //    58: ifeq            107
        //    61: aload           9
        //    63: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    68: astore          item$iv$iv
        //    70: aload           destination$iv$iv
        //    72: aload           item$iv$iv
        //    74: checkcast       Lkotlin/Pair;
        //    77: astore          11
        //    79: astore          13
        //    81: aload           it
        //    83: invokevirtual   kotlin/Pair.getSecond:()Ljava/lang/Object;
        //    86: checkcast       Lgg/essential/network/cosmetics/Cosmetic;
        //    89: invokevirtual   gg/essential/network/cosmetics/Cosmetic.getStorePackageId:()I
        //    92: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    95: aload           13
        //    97: swap           
        //    98: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //   103: pop            
        //   104: goto            51
        //   107: aload           destination$iv$iv
        //   109: checkcast       Ljava/util/List;
        //   112: checkcast       Ljava/lang/Iterable;
        //   115: ldc_w           ","
        //   118: checkcast       Ljava/lang/CharSequence;
        //   121: aconst_null    
        //   122: aconst_null    
        //   123: iconst_0       
        //   124: aconst_null    
        //   125: aconst_null    
        //   126: bipush          62
        //   128: aconst_null    
        //   129: invokestatic    kotlin/collections/CollectionsKt.joinToString$default:(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;
        //   132: astore_3        /* items */
        //   133: aload_0         /* this */
        //   134: getfield        gg/essential/gui/studio/CosmeticStudio.cartPrice:Lgg/essential/elementa/state/MappedState;
        //   137: invokevirtual   gg/essential/elementa/state/MappedState.get:()Ljava/lang/Object;
        //   140: checkcast       Ljava/lang/Number;
        //   143: invokevirtual   java/lang/Number.doubleValue:()D
        //   146: dconst_0       
        //   147: dcmpg          
        //   148: ifne            155
        //   151: iconst_1       
        //   152: goto            156
        //   155: iconst_0       
        //   156: ifeq            397
        //   159: aload_0         /* this */
        //   160: getfield        gg/essential/gui/studio/CosmeticStudio.cartCosmetics:Lgg/essential/elementa/state/MappedState;
        //   163: invokevirtual   gg/essential/elementa/state/MappedState.get:()Ljava/lang/Object;
        //   166: checkcast       Ljava/lang/Iterable;
        //   169: astore          $this$filter$iv
        //   171: aload           $this$filter$iv
        //   173: astore          7
        //   175: new             Ljava/util/ArrayList;
        //   178: dup            
        //   179: invokespecial   java/util/ArrayList.<init>:()V
        //   182: checkcast       Ljava/util/Collection;
        //   185: astore          destination$iv$iv
        //   187: aload           $this$filterTo$iv$iv
        //   189: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   194: astore          10
        //   196: aload           10
        //   198: invokeinterface java/util/Iterator.hasNext:()Z
        //   203: ifeq            263
        //   206: aload           10
        //   208: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   213: astore          element$iv$iv
        //   215: aload           element$iv$iv
        //   217: checkcast       Lkotlin/Pair;
        //   220: astore          it
        //   222: aload_0         /* this */
        //   223: getfield        gg/essential/gui/studio/CosmeticStudio.cosmeticsManager:Lgg/essential/network/connectionmanager/cosmetics/CosmeticsManager;
        //   226: invokevirtual   gg/essential/network/connectionmanager/cosmetics/CosmeticsManager.getUnlockedCosmetics:()Ljava/util/Set;
        //   229: aload           it
        //   231: invokevirtual   kotlin/Pair.getFirst:()Ljava/lang/Object;
        //   234: invokeinterface java/util/Set.contains:(Ljava/lang/Object;)Z
        //   239: ifne            246
        //   242: iconst_1       
        //   243: goto            247
        //   246: iconst_0       
        //   247: ifeq            196
        //   250: aload           destination$iv$iv
        //   252: aload           element$iv$iv
        //   254: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //   259: pop            
        //   260: goto            196
        //   263: aload           destination$iv$iv
        //   265: checkcast       Ljava/util/List;
        //   268: checkcast       Ljava/lang/Iterable;
        //   271: astore          $this$map$iv
        //   273: aload           $this$map$iv
        //   275: astore          7
        //   277: new             Ljava/util/ArrayList;
        //   280: dup            
        //   281: aload           $this$map$iv
        //   283: bipush          10
        //   285: invokestatic    kotlin/collections/CollectionsKt.collectionSizeOrDefault:(Ljava/lang/Iterable;I)I
        //   288: invokespecial   java/util/ArrayList.<init>:(I)V
        //   291: checkcast       Ljava/util/Collection;
        //   294: astore          destination$iv$iv
        //   296: aload           $this$mapTo$iv$iv
        //   298: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   303: astore          10
        //   305: aload           10
        //   307: invokeinterface java/util/Iterator.hasNext:()Z
        //   312: ifeq            355
        //   315: aload           10
        //   317: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   322: astore          item$iv$iv
        //   324: aload           destination$iv$iv
        //   326: aload           item$iv$iv
        //   328: checkcast       Lkotlin/Pair;
        //   331: astore          12
        //   333: astore          13
        //   335: aload           it
        //   337: invokevirtual   kotlin/Pair.getFirst:()Ljava/lang/Object;
        //   340: checkcast       Ljava/lang/String;
        //   343: aload           13
        //   345: swap           
        //   346: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //   351: pop            
        //   352: goto            305
        //   355: aload           destination$iv$iv
        //   357: checkcast       Ljava/util/List;
        //   360: checkcast       Ljava/lang/Iterable;
        //   363: invokestatic    kotlin/collections/CollectionsKt.toSet:(Ljava/lang/Iterable;)Ljava/util/Set;
        //   366: astore          cosmeticsNotOwned
        //   368: invokestatic    gg/essential/Essential.getInstance:()Lgg/essential/Essential;
        //   371: invokevirtual   gg/essential/Essential.getConnectionManager:()Lgg/essential/network/connectionmanager/ConnectionManager;
        //   374: new             Lgg/essential/connectionmanager/common/packet/cosmetic/ClientCosmeticCheckoutPacket;
        //   377: dup            
        //   378: aload           cosmeticsNotOwned
        //   380: invokespecial   gg/essential/connectionmanager/common/packet/cosmetic/ClientCosmeticCheckoutPacket.<init>:(Ljava/util/Set;)V
        //   383: checkcast       Lgg/essential/connectionmanager/common/packet/Packet;
        //   386: invokedynamic   BootstrapMethod #0, accept:()Ljava/util/function/Consumer;
        //   391: invokevirtual   gg/essential/network/connectionmanager/ConnectionManager.send:(Lgg/essential/connectionmanager/common/packet/Packet;Ljava/util/function/Consumer;)V
        //   394: goto            466
        //   397: invokestatic    net/minecraft/client/MinecraftClient.getInstance:()Lnet/minecraft/client/MinecraftClient;
        //   400: invokevirtual   net/minecraft/client/MinecraftClient.getSession:()Lnet/minecraft/client/util/Session;
        //   403: invokevirtual   net/minecraft/client/util/Session.getProfile:()Lcom/mojang/authlib/GameProfile;
        //   406: invokevirtual   com/mojang/authlib/GameProfile.getName:()Ljava/lang/String;
        //   409: aload_3         /* items */
        //   410: aload_1         /* giftTo */
        //   411: dup            
        //   412: ifnull          440
        //   415: astore          7
        //   417: astore          14
        //   419: astore          13
        //   421: aload           it
        //   423: invokedynamic   BootstrapMethod #1, makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
        //   428: astore          15
        //   430: aload           13
        //   432: aload           14
        //   434: aload           15
        //   436: dup            
        //   437: ifnonnull       444
        //   440: pop            
        //   441: ldc_w           ""
        //   444: invokedynamic   BootstrapMethod #2, makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //   449: astore          url
        //   451: getstatic       gg/essential/gui/common/modal/OpenLinkModal.Companion:Lgg/essential/gui/common/modal/OpenLinkModal$Companion;
        //   454: new             Ljava/net/URI;
        //   457: dup            
        //   458: aload           url
        //   460: invokespecial   java/net/URI.<init>:(Ljava/lang/String;)V
        //   463: invokevirtual   gg/essential/gui/common/modal/OpenLinkModal$Companion.openUrl:(Ljava/net/URI;)V
        //   466: aload_2         /* callback */
        //   467: invokeinterface kotlin/jvm/functions/Function0.invoke:()Ljava/lang/Object;
        //   472: pop            
        //   473: return         
        //    Signature:
        //  (Ljava/lang/String;Lkotlin/jvm/functions/Function0<Lkotlin/Unit;>;)V
        //    MethodParameters:
        //  Name      Flags  
        //  --------  -----
        //  giftTo    
        //  callback  
        //    StackMapTable: 00 0E FF 00 33 00 0A 07 00 02 07 05 58 07 02 1F 00 07 02 4E 00 07 02 4E 07 04 2E 00 07 01 E9 00 00 37 FF 00 2F 00 0A 07 00 02 07 05 58 07 02 1F 07 05 58 07 02 4E 00 07 02 4E 07 04 2E 00 07 01 E9 00 00 40 01 FF 00 27 00 0B 07 00 02 07 05 58 07 02 1F 07 05 58 07 02 4E 07 02 4E 07 02 4E 07 02 4E 07 04 2E 07 01 E9 07 01 E9 00 00 FD 00 31 07 01 F8 07 05 5A 40 01 F9 00 0F 29 31 FF 00 29 00 0A 07 00 02 07 05 58 07 02 1F 07 05 58 07 02 4E 00 07 02 4E 07 04 2E 00 07 01 E9 00 00 FF 00 2A 00 0A 07 00 02 07 05 58 07 02 1F 07 05 58 07 02 4E 00 07 02 4E 07 01 F8 00 07 01 E9 00 03 07 05 58 07 05 58 07 05 58 FF 00 03 00 0A 07 00 02 07 05 58 07 02 1F 07 05 58 07 02 4E 00 07 02 4E 07 01 F8 00 07 01 E9 00 03 07 05 58 07 05 58 07 05 58 FF 00 15 00 0A 07 00 02 07 05 58 07 02 1F 07 05 58 07 01 F8 00 07 02 4E 07 01 F8 00 07 01 E9 00 00
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public static /* synthetic */ void purchase$default$56acfba4$10dedc8(final CosmeticStudio cosmeticStudio, final Function0 callback) {
        cosmeticStudio.purchase(null, (Function0<Unit>)callback);
    }
    
    public final void processPurchase(@NotNull final Set<String> newItems) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc_w           "newItems"
        //     4: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     7: invokestatic    gg/essential/Essential.getInstance:()Lgg/essential/Essential;
        //    10: invokevirtual   gg/essential/Essential.getConnectionManager:()Lgg/essential/network/connectionmanager/ConnectionManager;
        //    13: invokevirtual   gg/essential/network/connectionmanager/ConnectionManager.getCosmeticsManager:()Lgg/essential/network/connectionmanager/cosmetics/CosmeticsManager;
        //    16: dup            
        //    17: ldc_w           "getInstance().connectionManager.cosmeticsManager"
        //    20: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //    23: astore_2        /* cosmeticsManager */
        //    24: aload_1         /* newItems */
        //    25: checkcast       Ljava/lang/Iterable;
        //    28: astore          $this$mapNotNull$iv
        //    30: aload           $this$mapNotNull$iv
        //    32: astore          5
        //    34: new             Ljava/util/ArrayList;
        //    37: dup            
        //    38: invokespecial   java/util/ArrayList.<init>:()V
        //    41: checkcast       Ljava/util/Collection;
        //    44: astore          destination$iv$iv
        //    46: aload           $this$mapNotNullTo$iv$iv
        //    48: astore          $this$forEach$iv$iv$iv
        //    50: aload           $this$forEach$iv$iv$iv
        //    52: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //    57: astore          8
        //    59: aload           8
        //    61: invokeinterface java/util/Iterator.hasNext:()Z
        //    66: ifeq            118
        //    69: aload           8
        //    71: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    76: astore          element$iv$iv$iv
        //    78: aload           element$iv$iv$iv
        //    80: astore          element$iv$iv
        //    82: aload           element$iv$iv
        //    84: checkcast       Ljava/lang/String;
        //    87: astore          it
        //    89: aload_2         /* cosmeticsManager */
        //    90: aload           it
        //    92: invokevirtual   gg/essential/network/connectionmanager/cosmetics/CosmeticsManager.getCosmetic:(Ljava/lang/String;)Lgg/essential/network/cosmetics/Cosmetic;
        //    95: dup            
        //    96: ifnull          114
        //    99: astore          it$iv$iv
        //   101: aload           destination$iv$iv
        //   103: aload           it$iv$iv
        //   105: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //   110: pop            
        //   111: goto            59
        //   114: pop            
        //   115: goto            59
        //   118: aload           destination$iv$iv
        //   120: checkcast       Ljava/util/List;
        //   123: astore_3        /* newCosmetics */
        //   124: aload_0         /* this */
        //   125: getfield        gg/essential/gui/studio/CosmeticStudio.explicitCartItems:Lgg/essential/elementa/state/BasicState;
        //   128: new             Lgg/essential/gui/studio/CosmeticStudio$processPurchase$1;
        //   131: dup            
        //   132: aload_1         /* newItems */
        //   133: invokespecial   gg/essential/gui/studio/CosmeticStudio$processPurchase$1.<init>:(Ljava/util/Set;)V
        //   136: checkcast       Lkotlin/jvm/functions/Function1;
        //   139: invokevirtual   gg/essential/elementa/state/BasicState.set:(Lkotlin/jvm/functions/Function1;)V
        //   142: aload_0         /* this */
        //   143: getfield        gg/essential/gui/studio/CosmeticStudio.previewingOutfits:Lgg/essential/elementa/state/BasicState;
        //   146: aload_0         /* this */
        //   147: getfield        gg/essential/gui/studio/CosmeticStudio.previewingOutfits:Lgg/essential/elementa/state/BasicState;
        //   150: invokevirtual   gg/essential/elementa/state/BasicState.get:()Ljava/lang/Object;
        //   153: checkcast       Ljava/util/Map;
        //   156: astore          4
        //   158: astore          28
        //   160: aload           $this$mapValues$iv
        //   162: astore          5
        //   164: new             Ljava/util/LinkedHashMap;
        //   167: dup            
        //   168: aload           $this$mapValues$iv
        //   170: invokeinterface java/util/Map.size:()I
        //   175: invokestatic    kotlin/collections/MapsKt.mapCapacity:(I)I
        //   178: invokespecial   java/util/LinkedHashMap.<init>:(I)V
        //   181: checkcast       Ljava/util/Map;
        //   184: astore          destination$iv$iv
        //   186: aload           $this$mapValuesTo$iv$iv
        //   188: invokeinterface java/util/Map.entrySet:()Ljava/util/Set;
        //   193: checkcast       Ljava/lang/Iterable;
        //   196: astore          $this$associateByTo$iv$iv$iv
        //   198: aload           $this$associateByTo$iv$iv$iv
        //   200: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   205: astore          8
        //   207: aload           8
        //   209: invokeinterface java/util/Iterator.hasNext:()Z
        //   214: ifeq            466
        //   217: aload           8
        //   219: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   224: astore          element$iv$iv$iv
        //   226: aload           destination$iv$iv
        //   228: aload           element$iv$iv$iv
        //   230: checkcast       Ljava/util/Map$Entry;
        //   233: astore          10
        //   235: astore          11
        //   237: aload           it$iv$iv
        //   239: invokeinterface java/util/Map$Entry.getKey:()Ljava/lang/Object;
        //   244: aload           11
        //   246: swap           
        //   247: aload           element$iv$iv$iv
        //   249: checkcast       Ljava/util/Map$Entry;
        //   252: astore          13
        //   254: astore          30
        //   256: astore          29
        //   258: aload           13
        //   260: invokeinterface java/util/Map$Entry.getKey:()Ljava/lang/Object;
        //   265: checkcast       Ljava/lang/Number;
        //   268: invokevirtual   java/lang/Number.intValue:()I
        //   271: istore          outfitIndex
        //   273: aload           13
        //   275: invokeinterface java/util/Map$Entry.getValue:()Ljava/lang/Object;
        //   280: checkcast       Ljava/util/Map;
        //   283: astore          outfit
        //   285: aload           outfit
        //   287: astore          $this$mapNotNull$iv
        //   289: aload           $this$mapNotNull$iv
        //   291: astore          18
        //   293: new             Ljava/util/ArrayList;
        //   296: dup            
        //   297: invokespecial   java/util/ArrayList.<init>:()V
        //   300: checkcast       Ljava/util/Collection;
        //   303: astore          destination$iv$iv
        //   305: aload           $this$mapNotNullTo$iv$iv
        //   307: astore          $this$forEach$iv$iv$iv
        //   309: aload           $this$forEach$iv$iv$iv
        //   311: invokeinterface java/util/Map.entrySet:()Ljava/util/Set;
        //   316: invokeinterface java/util/Set.iterator:()Ljava/util/Iterator;
        //   321: astore          21
        //   323: aload           21
        //   325: invokeinterface java/util/Iterator.hasNext:()Z
        //   330: ifeq            438
        //   333: aload           21
        //   335: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   340: checkcast       Ljava/util/Map$Entry;
        //   343: astore          element$iv$iv$iv
        //   345: aload           element$iv$iv$iv
        //   347: astore          element$iv$iv
        //   349: aload           element$iv$iv
        //   351: astore          24
        //   353: aload           24
        //   355: invokeinterface java/util/Map$Entry.getKey:()Ljava/lang/Object;
        //   360: checkcast       Lgg/essential/mod/cosmetics/CosmeticSlot;
        //   363: astore          slot
        //   365: aload           24
        //   367: invokeinterface java/util/Map$Entry.getValue:()Ljava/lang/Object;
        //   372: checkcast       Lgg/essential/network/cosmetics/Cosmetic;
        //   375: astore          cosmetic
        //   377: aload_3         /* newCosmetics */
        //   378: aload           cosmetic
        //   380: invokeinterface java/util/List.contains:(Ljava/lang/Object;)Z
        //   385: ifeq            408
        //   388: aload_2         /* cosmeticsManager */
        //   389: iload           outfitIndex
        //   391: aload           slot
        //   393: aload           cosmetic
        //   395: invokevirtual   gg/essential/network/cosmetics/Cosmetic.getId:()Ljava/lang/String;
        //   398: invokevirtual   gg/essential/network/connectionmanager/cosmetics/CosmeticsManager.updateEquippedCosmetic:(ILgg/essential/mod/cosmetics/CosmeticSlot;Ljava/lang/String;)V
        //   401: aconst_null    
        //   402: checkcast       Lkotlin/Pair;
        //   405: goto            415
        //   408: aload           slot
        //   410: aload           cosmetic
        //   412: invokestatic    kotlin/TuplesKt.to:(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
        //   415: dup            
        //   416: ifnull          434
        //   419: astore          it$iv$iv
        //   421: aload           destination$iv$iv
        //   423: aload           it$iv$iv
        //   425: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //   430: pop            
        //   431: goto            323
        //   434: pop            
        //   435: goto            323
        //   438: aload           destination$iv$iv
        //   440: checkcast       Ljava/util/List;
        //   443: checkcast       Ljava/lang/Iterable;
        //   446: invokestatic    kotlin/collections/MapsKt.toMap:(Ljava/lang/Iterable;)Ljava/util/Map;
        //   449: astore          31
        //   451: aload           29
        //   453: aload           30
        //   455: aload           31
        //   457: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   462: pop            
        //   463: goto            207
        //   466: aload           destination$iv$iv
        //   468: aload           28
        //   470: swap           
        //   471: invokevirtual   gg/essential/elementa/state/BasicState.set:(Ljava/lang/Object;)V
        //   474: return         
        //    Signature:
        //  (Ljava/util/Set<Ljava/lang/String;>;)V
        //    MethodParameters:
        //  Name      Flags  
        //  --------  -----
        //  newItems  
        //    StackMapTable: 00 0A FF 00 3B 00 09 07 00 02 07 01 D7 07 01 DB 00 07 02 4E 07 02 4E 07 04 2E 07 02 4E 07 01 E9 00 00 FF 00 36 00 0D 07 00 02 07 01 D7 07 01 DB 00 07 02 4E 07 02 4E 07 04 2E 07 02 4E 07 01 E9 07 01 F8 07 01 F8 00 07 05 58 00 01 07 05 1D FF 00 03 00 09 07 00 02 07 01 D7 07 01 DB 00 07 02 4E 07 02 4E 07 04 2E 07 02 4E 07 01 E9 00 00 FF 00 58 00 1D 07 00 02 07 01 D7 07 01 DB 07 01 E3 07 05 13 07 05 13 07 05 13 07 02 4E 07 01 E9 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 01 96 00 00 FF 00 73 00 1F 07 00 02 07 01 D7 07 01 DB 07 01 E3 07 05 13 07 05 13 07 05 13 07 02 4E 07 01 E9 07 01 F8 07 05 19 07 05 13 00 07 05 19 00 01 07 05 13 07 05 13 07 05 13 07 04 2E 07 05 13 07 01 E9 00 00 00 00 00 00 07 01 96 07 05 13 07 01 F8 00 00 FF 00 54 00 1F 07 00 02 07 01 D7 07 01 DB 07 01 E3 07 05 13 07 05 13 07 05 13 07 02 4E 07 01 E9 07 01 F8 07 05 19 07 05 13 00 07 05 19 00 01 07 05 13 07 05 13 07 05 13 07 04 2E 07 05 13 07 01 E9 07 05 19 07 05 19 07 05 19 07 05 E3 07 05 1D 00 07 01 96 07 05 13 07 01 F8 00 00 46 07 05 5A 52 07 05 5A FF 00 03 00 1F 07 00 02 07 01 D7 07 01 DB 07 01 E3 07 05 13 07 05 13 07 05 13 07 02 4E 07 01 E9 07 01 F8 07 05 19 07 05 13 00 07 05 19 00 01 07 05 13 07 05 13 07 05 13 07 04 2E 07 05 13 07 01 E9 00 00 00 00 00 00 07 01 96 07 05 13 07 01 F8 00 00 FF 00 1B 00 1D 07 00 02 07 01 D7 07 01 DB 07 01 E3 07 05 13 07 05 13 07 05 13 07 02 4E 07 01 E9 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 01 96 00 00
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private final void sortCosmeticOptions(final SortOption sortOption, final Category category) {
        switch (WhenMappings.$EnumSwitchMapping$0[sortOption.ordinal()]) {
            case 1: {
                this.getOptionsView().sortChildren(ComparisonsKt.compareBy(new Function1[] { this.typeSorter(), (Function1)CosmeticStudio$sortCosmeticOptions.CosmeticStudio$sortCosmeticOptions$1.INSTANCE, this.nameSorter() }));
                break;
            }
            case 2: {
                this.getOptionsView().sortChildren(ComparisonsKt.compareBy(new Function1[] { this.typeSorter(), (Function1)CosmeticStudio$sortCosmeticOptions.CosmeticStudio$sortCosmeticOptions$2.INSTANCE, this.nameSorter() }));
                break;
            }
            case 3: {
                this.getOptionsView().sortChildren(ComparisonsKt.compareBy(new Function1[] { this.typeSorter(), (Function1)CosmeticStudio$sortCosmeticOptions.CosmeticStudio$sortCosmeticOptions$3.INSTANCE, this.nameSorter() }));
                break;
            }
            case 4: {
                this.getOptionsView().sortChildren(ComparisonsKt.compareBy(new Function1[] { this.typeSorter(), (Function1)CosmeticStudio$sortCosmeticOptions.CosmeticStudio$sortCosmeticOptions$4.INSTANCE, this.nameSorter() }));
                break;
            }
            case 5: {
                this.getOptionsView().sortChildren(ComparisonsKt.compareBy(new Function1[] { this.typeSorter(), (Function1)new CosmeticStudio$sortCosmeticOptions.CosmeticStudio$sortCosmeticOptions$5(category) }));
                break;
            }
        }
    }
    
    private final Function1<UIComponent, Comparable<?>> typeSorter() {
        return (Function1<UIComponent, Comparable<?>>)CosmeticStudio$typeSorter.CosmeticStudio$typeSorter$1.INSTANCE;
    }
    
    private final Function1<UIComponent, Comparable<?>> nameSorter() {
        return (Function1<UIComponent, Comparable<?>>)CosmeticStudio$nameSorter.CosmeticStudio$nameSorter$1.INSTANCE;
    }
    
    @Override
    public void onDrawScreen(@NotNull final UMatrixStack matrixStack, final int mouseX, final int mouseY, final float partialTicks) {
        Intrinsics.checkNotNullParameter((Object)matrixStack, "matrixStack");
        if (!this.isInitialized) {
            this.isInitialized = true;
            this.afterInitialization();
        }
        if (UResolution.getScaledWidth() < 394 || UResolution.getScaledHeight() < 200) {
            if (this.tooSmallNotice == null) {
                this.tooSmallNotice = new GuiTooSmallOverlay((Function0)new CosmeticStudio$onDrawScreen.CosmeticStudio$onDrawScreen$1(this));
            }
        }
        else {
            final GuiTooSmallOverlay tooSmallNotice = this.tooSmallNotice;
            if (tooSmallNotice != null) {
                tooSmallNotice.remove();
            }
            this.tooSmallNotice = null;
        }
        final BasicState<Set<String>> unlockedCosmetics = this.unlockedCosmetics;
        final Set<String> unlockedCosmetics2 = this.cosmeticsManager.getUnlockedCosmetics();
        Intrinsics.checkNotNullExpressionValue((Object)unlockedCosmetics2, "cosmeticsManager.unlockedCosmetics");
        unlockedCosmetics.set(CollectionsKt.toSet((Iterable)unlockedCosmetics2));
        final long currentTime = System.currentTimeMillis();
        final long timeDiff = currentTime - this.systemTime;
        this.systemTime = currentTime;
        if (this.playerRotationMode == RotationMode.CLOCKWISE) {
            this.getPlayerDisplayContainer().rotate(0.1875f * timeDiff);
        }
        else if (this.playerRotationMode == RotationMode.COUNTER_CLOCKWISE) {
            this.getPlayerDisplayContainer().rotate(-0.1875f * timeDiff);
        }
        matrixStack.translate(0.0, 0.0, -100.0);
        this.onDrawBackground(matrixStack, 0);
        matrixStack.translate(0.0, 0.0, 100.0);
        this.getWindow().draw(matrixStack);
    }
    
    @Override
    public void onScreenClose() {
        Multithreading.runAsync(CosmeticStudio::onScreenClose$lambda-43);
        Multithreading.runAsync(CosmeticStudio::onScreenClose$lambda-44);
        this.getPlayerDisplayContainer().onScreenClose();
        for (final String id : this.noticeClearList) {
            Essential.getInstance().getConnectionManager().getNoticesManager().getCosmeticNotices().clearNewState(id);
        }
        final GuiTooSmallOverlay tooSmallNotice = this.tooSmallNotice;
        if (tooSmallNotice != null) {
            tooSmallNotice.remove();
        }
        this.tooSmallNotice = null;
        super.onScreenClose();
    }
    
    @NotNull
    public final Map<CosmeticSlot, String> getEquippedCosmetics() {
        final CosmeticsManager cosmeticsManager2 = Essential.getInstance().getConnectionManager().getCosmeticsManager();
        Intrinsics.checkNotNullExpressionValue((Object)cosmeticsManager2, "getInstance().connectionManager.cosmeticsManager");
        final CosmeticsManager cosmeticsManager = cosmeticsManager2;
        final ImmutableMap<CosmeticSlot, String> equippedCosmetics2 = cosmeticsManager.getEquippedCosmetics();
        Intrinsics.checkNotNullExpressionValue((Object)equippedCosmetics2, "cosmeticsManager.equippedCosmetics");
        final Map equippedCosmetics = MapsKt.toMutableMap((Map)equippedCosmetics2);
        for (final Map.Entry<CosmeticSlot, V> entry : this.previewingCosmetics.get().entrySet()) {
            final CosmeticSlot slot = entry.getKey();
            final Cosmetic cosmetic = (Cosmetic)entry.getValue();
            equippedCosmetics.put(slot, cosmetic.getId());
        }
        return equippedCosmetics;
    }
    
    public final void queueNoticeClear(@NotNull final String id) {
        Intrinsics.checkNotNullParameter((Object)id, "id");
        this.noticeClearList.add(id);
    }
    
    private static final void purchase$lambda-38(final Optional it) {
        if (it.isPresent()) {
            final Packet value = it.get();
            Intrinsics.checkNotNullExpressionValue((Object)value, "it.get()");
            final Packet packet = value;
            if (packet instanceof final ResponseActionPacket responseActionPacket) {
                if (!responseActionPacket.isSuccessful()) {
                    Essential.debug.error("ClientCosmeticCheckoutPacket did give an expected response");
                }
            }
            else if (packet instanceof final ServerCosmeticsUserUnlockedPacket serverCosmeticsUserUnlockedPacket) {
                Essential.debug.debug("Automatically unlocked " + serverCosmeticsUserUnlockedPacket.getUnlocked().size() + " free cosmetics.");
            }
        }
        else {
            Essential.debug.error("ClientCosmeticCheckoutPacket did not give a response");
        }
    }
    
    private static final void onScreenClose$lambda-43(final CosmeticStudio this$0) {
        Intrinsics.checkNotNullParameter((Object)this$0, "this$0");
        this$0.cosmeticsManager.getCapeManager().flushCapeUpdates();
    }
    
    private static final void onScreenClose$lambda-44() {
        Essential.getInstance().getSkinManager().flushChanges();
    }
    
    @JvmStatic
    @Nullable
    public static final CosmeticStudio getInstance() {
        return CosmeticStudio.Companion.getInstance();
    }
    
    public static final /* synthetic */ void access$handleResize(final CosmeticStudio $this) {
        $this.handleResize();
    }
    
    public static final /* synthetic */ void access$filterAndSortCosmeticOptions(final CosmeticStudio $this, final Category category) {
        $this.filterAndSortCosmeticOptions(category);
    }
    
    public static final /* synthetic */ void access$setTooSmallNotice$p(final CosmeticStudio $this, final GuiTooSmallOverlay <set-?>) {
        $this.tooSmallNotice = <set-?>;
    }
    
    public static final /* synthetic */ CosmeticSlot[] access$getSlotOrder$cp() {
        return CosmeticStudio.slotOrder;
    }
    
    public static final /* synthetic */ BasicState access$getBuyButtonText$p(final CosmeticStudio $this) {
        return $this.buyButtonText;
    }
    
    public static final /* synthetic */ ScrollComponent access$getOptionsView(final CosmeticStudio $this) {
        return $this.getOptionsView();
    }
    
    public static final /* synthetic */ void access$sortCosmeticOptions(final CosmeticStudio $this, final SortOption sortOption, final Category category) {
        $this.sortCosmeticOptions(sortOption, category);
    }
    
    static {
        $$delegatedProperties = new KProperty[] { (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)CosmeticStudio.class, "categoriesContainer", "getCategoriesContainer()Lgg/essential/gui/studio/CategoriesSection;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)CosmeticStudio.class, "cartButtonContainer", "getCartButtonContainer()Lgg/essential/elementa/UIComponent;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)CosmeticStudio.class, "firstDivider", "getFirstDivider()Lgg/essential/elementa/components/UIBlock;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)CosmeticStudio.class, "optionsContainer", "getOptionsContainer()Lgg/essential/elementa/components/UIContainer;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)CosmeticStudio.class, "secondDivider", "getSecondDivider()Lgg/essential/elementa/components/UIBlock;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)CosmeticStudio.class, "playerDisplayContainer", "getPlayerDisplayContainer()Lgg/essential/gui/studio/PlayerSection;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)CosmeticStudio.class, "cartBackground", "getCartBackground()Lgg/essential/elementa/components/UIBlock;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)CosmeticStudio.class, "cartIcon", "getCartIcon()Lgg/essential/gui/common/shadow/ShadowIcon;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)CosmeticStudio.class, "cartText", "getCartText()Lgg/essential/gui/common/shadow/EssentialUIText;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)CosmeticStudio.class, "cartQuantityContainer", "getCartQuantityContainer()Lgg/essential/gui/common/EssentialQuantityIndicator;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)CosmeticStudio.class, "optionsViewContainer", "getOptionsViewContainer()Lgg/essential/elementa/components/UIContainer;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)CosmeticStudio.class, "optionsView", "getOptionsView()Lgg/essential/elementa/components/ScrollComponent;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)CosmeticStudio.class, "categoryDescriptionContainer", "getCategoryDescriptionContainer()Lgg/essential/elementa/components/UIContainer;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)CosmeticStudio.class, "categoryDescriptionTopSpacer", "getCategoryDescriptionTopSpacer()Lgg/essential/gui/common/Spacer;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)CosmeticStudio.class, "categoryDescription", "getCategoryDescription()Lgg/essential/elementa/components/UIWrappedText;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)CosmeticStudio.class, "categoryDescriptionBottomSpacer", "getCategoryDescriptionBottomSpacer()Lgg/essential/gui/common/Spacer;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)CosmeticStudio.class, "consistentSpacer", "getConsistentSpacer()Lgg/essential/gui/common/Spacer;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)CosmeticStudio.class, "optionsScrollBar", "getOptionsScrollBar()Lgg/essential/elementa/components/UIBlock;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)CosmeticStudio.class, "cartContainer", "getCartContainer()Lgg/essential/elementa/components/UIBlock;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)CosmeticStudio.class, "priceBlock", "getPriceBlock()Lgg/essential/elementa/components/UIBlock;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)CosmeticStudio.class, "totalPrice", "getTotalPrice()Lgg/essential/elementa/components/UIText;", 0)), (KProperty)Reflection.mutableProperty1((MutablePropertyReference1)new MutablePropertyReference1Impl((Class)CosmeticStudio.class, "buyContainer", "getBuyContainer()Lgg/essential/elementa/components/UIContainer;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)CosmeticStudio.class, "sortOptionsContainer", "getSortOptionsContainer()Lgg/essential/elementa/components/UIContainer;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)CosmeticStudio.class, "sortText", "getSortText()Lgg/essential/gui/common/shadow/EssentialUIText;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)CosmeticStudio.class, "sortOptions", "getSortOptions()Lgg/essential/gui/common/EssentialDropDown;", 0)), (KProperty)Reflection.property0((PropertyReference0)new PropertyReference0Impl((Class)CosmeticStudio.class, "categoryTitle", "<v#0>", 0)) };
        Companion = new Companion((byte)0);
        slotOrder = new CosmeticSlot[] { CosmeticSlot.FULL_BODY, CosmeticSlot.EFFECT, CosmeticSlot.HAT, CosmeticSlot.EARS, CosmeticSlot.FACE, CosmeticSlot.WINGS, CosmeticSlot.BACK, CosmeticSlot.SHOULDERS, CosmeticSlot.ARMS, CosmeticSlot.TAIL, CosmeticSlot.PANTS, CosmeticSlot.SHOES };
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                       \u0000\u0012
                                                       \u0002\u0018\u0002
                                                       \u0002\u0010\u0010
                                                       \u0000
                                                       \u0002\u0010\u000e
                                                       \u0002\b
                                                       \b\u0086\u0001\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b
                                                       \u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b	j\u0002\b
                                                       j\u0002\b\u000b¨\u0006""" }, d2 = { "Lgg/essential/gui/studio/CosmeticStudio$SortOption;", "", "displayName", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getDisplayName", "()Ljava/lang/String;", "CUSTOM_COLLECTION", "RELEASE_DATE", "NAME", "PRICE", "IS_PURCHASED", "Companion", "essential" })
    public enum SortOption
    {
        @NotNull
        public static final Companion Companion;
        @NotNull
        private final String displayName;
        
        CUSTOM_COLLECTION("CUSTOM_COLLECTION", 0, "Featured"), 
        RELEASE_DATE("RELEASE_DATE", 1, "Release"), 
        NAME("NAME", 2, "Name"), 
        PRICE("PRICE", 3, "Price"), 
        IS_PURCHASED("IS_PURCHASED", 4, "Owned");
        
        private static final /* synthetic */ SortOption[] $VALUES;
        
        private SortOption(final String $enum$name, final int $enum$ordinal, final String displayName) {
            this.displayName = displayName;
        }
        
        @NotNull
        public final String getDisplayName() {
            return this.displayName;
        }
        
        public static SortOption[] values() {
            return SortOption.$VALUES.clone();
        }
        
        public static SortOption valueOf(final String value) {
            return Enum.valueOf(SortOption.class, value);
        }
        
        private static final /* synthetic */ SortOption[] $values() {
            return new SortOption[] { SortOption.CUSTOM_COLLECTION, SortOption.RELEASE_DATE, SortOption.NAME, SortOption.PRICE, SortOption.IS_PURCHASED };
        }
        
        static {
            $VALUES = $values();
            Companion = new Companion((byte)0);
        }
        
        @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                           \u0000\u0018
                                                           \u0002\u0018\u0002
                                                           \u0002\u0010\u0000
                                                           \u0002\b\u0002
                                                           \u0002\u0018\u0002
                                                           \u0000
                                                           \u0002\u0010\b
                                                           \u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007""" }, d2 = { "Lgg/essential/gui/studio/CosmeticStudio$SortOption$Companion;", "", "()V", "fromIndex", "Lgg/essential/gui/studio/CosmeticStudio$SortOption;", "index", "", "essential" })
        public static final class Companion
        {
            private Companion() {
                super();
            }
            
            @NotNull
            public final SortOption fromIndex(final int index) {
                return SortOption.values()[index];
            }
            
            public Companion(final byte b) {
                this();
            }
        }
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                       \u0000\f
                                                       \u0002\u0018\u0002
                                                       \u0002\u0010\u0010
                                                       \u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006""" }, d2 = { "Lgg/essential/gui/studio/CosmeticStudio$RotationMode;", "", "(Ljava/lang/String;I)V", "NONE", "CLOCKWISE", "COUNTER_CLOCKWISE", "essential" })
    public enum RotationMode
    {
        NONE("NONE", 0), 
        CLOCKWISE("CLOCKWISE", 1), 
        COUNTER_CLOCKWISE("COUNTER_CLOCKWISE", 2);
        
        private static final /* synthetic */ RotationMode[] $VALUES;
        
        private RotationMode(final String $enum$name, final int $enum$ordinal) {
        }
        
        public static RotationMode[] values() {
            return RotationMode.$VALUES.clone();
        }
        
        public static RotationMode valueOf(final String value) {
            return Enum.valueOf(RotationMode.class, value);
        }
        
        private static final /* synthetic */ RotationMode[] $values() {
            return new RotationMode[] { RotationMode.NONE, RotationMode.CLOCKWISE, RotationMode.COUNTER_CLOCKWISE };
        }
        
        static {
            $VALUES = $values();
        }
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                       \u0000H
                                                       \u0002\u0018\u0002
                                                       \u0002\u0010\u0000
                                                       \u0000
                                                       \u0002\u0010\b
                                                       \u0000
                                                       \u0002\u0010\u000e
                                                       \u0002\b\u0006
                                                       \u0002\u0010\u000b
                                                       \u0000
                                                       \u0002\u0018\u0002
                                                       \u0000
                                                       \u0002\u0018\u0002
                                                       \u0000
                                                       \u0002\u0018\u0002
                                                       \u0002\b\u0005
                                                       \u0002\u0018\u0002
                                                       \u0002\u0018\u0002
                                                       \u0002\u0018\u0002
                                                       \u0002\u0018\u0002
                                                       \u0002\u0018\u0002
                                                       \u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0013\u0014\u0015\u0016\u0017B\u0017\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J \u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b
                                                       \u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b
                                                       \u0000\u001a\u0004\b	\u0010
                                                       \u0082\u0001\u0005\u0018\u0019\u001a\u001b\u001c¨\u0006\u001d""" }, d2 = { "Lgg/essential/gui/studio/CosmeticStudio$Category;", "", "order", "", "id", "", "(ILjava/lang/String;)V", "getId", "()Ljava/lang/String;", "getOrder", "()I", "filter", "", "cosmetic", "Lgg/essential/network/cosmetics/Cosmetic;", "cosmeticStudio", "Lgg/essential/gui/studio/CosmeticStudio;", "cosmeticsManager", "Lgg/essential/network/connectionmanager/cosmetics/CosmeticsManager;", "Cart", "InfraSlot", "New", "Owned", "Slot", "Lgg/essential/gui/studio/CosmeticStudio$Category$Owned;", "Lgg/essential/gui/studio/CosmeticStudio$Category$New;", "Lgg/essential/gui/studio/CosmeticStudio$Category$InfraSlot;", "Lgg/essential/gui/studio/CosmeticStudio$Category$Slot;", "Lgg/essential/gui/studio/CosmeticStudio$Category$Cart;", "essential" })
    public abstract static class Category
    {
        @NotNull
        private final String id;
        
        private Category(final String id, final byte b) {
            super();
            this.id = id;
        }
        
        @NotNull
        public final String getId() {
            return this.id;
        }
        
        public final boolean filter(@NotNull final Cosmetic cosmetic, @NotNull final CosmeticStudio cosmeticStudio, @NotNull final CosmeticsManager cosmeticsManager) {
            Intrinsics.checkNotNullParameter((Object)cosmetic, "cosmetic");
            Intrinsics.checkNotNullParameter((Object)cosmeticStudio, "cosmeticStudio");
            Intrinsics.checkNotNullParameter((Object)cosmeticsManager, "cosmeticsManager");
            boolean b;
            if (this instanceof Slot) {
                final CosmeticType cosmeticType = cosmeticsManager.getCosmeticType(cosmetic.getTypeId());
                b = (((cosmeticType != null) ? cosmeticType.getSlot() : null) == ((Slot)this).getSlot());
            }
            else if (this instanceof Owned) {
                if (cosmeticsManager.getUnlockedCosmetics().contains(cosmetic.getId()) && !Intrinsics.areEqual((Object)cosmetic.getId(), (Object)"CAPE_DISABLED")) {
                    final CosmeticType cosmeticType2 = cosmeticsManager.getCosmeticType(cosmetic.getTypeId());
                    if (((cosmeticType2 != null) ? cosmeticType2.getSlot() : null) != CosmeticSlot.CAPE || cosmetic.getId().length() != 64) {
                        b = true;
                        return b;
                    }
                }
                b = false;
            }
            else if (this instanceof New) {
                final Boolean value = Essential.getInstance().getConnectionManager().getNoticesManager().getCosmeticNotices().getNewState(cosmetic.getId()).get();
                Intrinsics.checkNotNullExpressionValue((Object)value, "getInstance().connection\u2026d)\n                .get()");
                b = value;
            }
            else if (this instanceof Cart) {
                b = cosmeticStudio.getCartItems().get().contains(cosmetic.getId());
            }
            else {
                if (!(this instanceof InfraSlot)) {
                    throw new NoWhenBranchMatchedException();
                }
                final Map<String, Integer> categories = cosmetic.getCategories();
                if (categories != null) {
                    final Set<String> keySet = categories.keySet();
                    if (keySet != null) {
                        b = keySet.contains(this.id);
                        return b;
                    }
                }
                b = false;
            }
            return b;
        }
        
        public static /* synthetic */ boolean filter$default$50d04712(final Category category, final Cosmetic cosmetic, final CosmeticStudio cosmeticStudio, final Object o) {
            if (o != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: filter");
            }
            return category.filter(cosmetic, cosmeticStudio, cosmeticStudio.getCosmeticsManager());
        }
        
        public Category(final String id) {
            this(id, (byte)0);
        }
        
        @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                           \u0000\f
                                                           \u0002\u0018\u0002
                                                           \u0002\u0018\u0002
                                                           \u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003""" }, d2 = { "Lgg/essential/gui/studio/CosmeticStudio$Category$Owned;", "Lgg/essential/gui/studio/CosmeticStudio$Category;", "()V", "essential" })
        public static final class Owned extends Category
        {
            @NotNull
            public static final Owned INSTANCE;
            
            private Owned() {
                super("OWNED");
            }
            
            static {
                INSTANCE = new Owned();
            }
        }
        
        @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                           \u0000\f
                                                           \u0002\u0018\u0002
                                                           \u0002\u0018\u0002
                                                           \u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003""" }, d2 = { "Lgg/essential/gui/studio/CosmeticStudio$Category$New;", "Lgg/essential/gui/studio/CosmeticStudio$Category;", "()V", "essential" })
        public static final class New extends Category
        {
            @NotNull
            public static final New INSTANCE;
            
            private New() {
                super("NEW");
            }
            
            static {
                INSTANCE = new New();
            }
        }
        
        @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                           \u0000*
                                                           \u0002\u0018\u0002
                                                           \u0002\u0018\u0002
                                                           \u0000
                                                           \u0002\u0018\u0002
                                                           \u0002\b\u0006
                                                           \u0002\u0010\u000b
                                                           \u0000
                                                           \u0002\u0010\u0000
                                                           \u0000
                                                           \u0002\u0010\b
                                                           \u0000
                                                           \u0002\u0010\u000e
                                                           \u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J	\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010	\u001a\u00020
                                                           2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J	\u0010\r\u001a\u00020\u000eH\u00d6\u0001J	\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b
                                                           \u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011""" }, d2 = { "Lgg/essential/gui/studio/CosmeticStudio$Category$InfraSlot;", "Lgg/essential/gui/studio/CosmeticStudio$Category;", "category", "Lgg/essential/cosmetics/model/CosmeticCategory;", "(Lgg/essential/cosmetics/model/CosmeticCategory;)V", "getCategory", "()Lgg/essential/cosmetics/model/CosmeticCategory;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "essential" })
        public static final class InfraSlot extends Category
        {
            @NotNull
            private final CosmeticCategory category;
            
            public InfraSlot(@NotNull final CosmeticCategory category) {
                Intrinsics.checkNotNullParameter((Object)category, "category");
                category.getOrder();
                final String id = category.getId();
                Intrinsics.checkNotNullExpressionValue((Object)id, "category.id");
                super(id);
                this.category = category;
            }
            
            @NotNull
            public final CosmeticCategory getCategory() {
                return this.category;
            }
            
            @NotNull
            @Override
            public String toString() {
                return "InfraSlot(category=" + this.category;
            }
            
            @Override
            public int hashCode() {
                return this.category.hashCode();
            }
            
            @Override
            public boolean equals(@Nullable final Object other) {
                return this == other || (other instanceof InfraSlot && Intrinsics.areEqual((Object)this.category, (Object)((InfraSlot)other).category));
            }
        }
        
        @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                           \u0000*
                                                           \u0002\u0018\u0002
                                                           \u0002\u0018\u0002
                                                           \u0000
                                                           \u0002\u0018\u0002
                                                           \u0002\b\u0006
                                                           \u0002\u0010\u000b
                                                           \u0000
                                                           \u0002\u0010\u0000
                                                           \u0000
                                                           \u0002\u0010\b
                                                           \u0000
                                                           \u0002\u0010\u000e
                                                           \u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J	\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010	\u001a\u00020
                                                           2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J	\u0010\r\u001a\u00020\u000eH\u00d6\u0001J	\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b
                                                           \u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011""" }, d2 = { "Lgg/essential/gui/studio/CosmeticStudio$Category$Slot;", "Lgg/essential/gui/studio/CosmeticStudio$Category;", "slot", "Lgg/essential/mod/cosmetics/CosmeticSlot;", "(Lgg/essential/mod/cosmetics/CosmeticSlot;)V", "getSlot", "()Lgg/essential/mod/cosmetics/CosmeticSlot;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "essential" })
        public static final class Slot extends Category
        {
            @NotNull
            private final CosmeticSlot slot;
            
            public Slot(@NotNull final CosmeticSlot slot) {
                Intrinsics.checkNotNullParameter((Object)slot, "slot");
                ArraysKt.indexOf((Object[])CosmeticStudio.Companion.getSlotOrder(), (Object)slot);
                super(slot.name());
                this.slot = slot;
            }
            
            @NotNull
            public final CosmeticSlot getSlot() {
                return this.slot;
            }
            
            @NotNull
            @Override
            public String toString() {
                return "Slot(slot=" + this.slot;
            }
            
            @Override
            public int hashCode() {
                return this.slot.hashCode();
            }
            
            @Override
            public boolean equals(@Nullable final Object other) {
                return this == other || (other instanceof Slot && this.slot == ((Slot)other).slot);
            }
        }
        
        @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                           \u0000\f
                                                           \u0002\u0018\u0002
                                                           \u0002\u0018\u0002
                                                           \u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003""" }, d2 = { "Lgg/essential/gui/studio/CosmeticStudio$Category$Cart;", "Lgg/essential/gui/studio/CosmeticStudio$Category;", "()V", "essential" })
        public static final class Cart extends Category
        {
            @NotNull
            public static final Cart INSTANCE;
            
            private Cart() {
                super("cart");
            }
            
            static {
                INSTANCE = new Cart();
            }
        }
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                       \u0000\f
                                                       \u0002\u0018\u0002
                                                       \u0002\u0018\u0002
                                                       \u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003""" }, d2 = { "Lgg/essential/gui/studio/CosmeticStudio$CosmeticDivider;", "Lgg/essential/elementa/components/UIContainer;", "()V", "essential" })
    public static final class CosmeticDivider extends UIContainer
    {
        public CosmeticDivider() {
            super();
            UIComponent $this$constrain_u24lambda_u2d0$iv;
            UIComponent $this$constrain$iv = $this$constrain_u24lambda_u2d0$iv = this;
            final UIConstraints $this$_init__u24lambda_u2d0 = $this$constrain_u24lambda_u2d0$iv.getConstraints();
            $this$_init__u24lambda_u2d0.setY(new SiblingConstraint(0.0f, false, 3, null));
            $this$_init__u24lambda_u2d0.setWidth(UtilitiesKt.getPercent(100));
            $this$_init__u24lambda_u2d0.setHeight(UtilitiesKt.getPixels(16));
            $this$constrain$iv = ($this$constrain_u24lambda_u2d0$iv = new UIBlock(EssentialPalette.COMPONENT_BACKGROUND));
            final UIConstraints $this$_init__u24lambda_u2d2 = $this$constrain_u24lambda_u2d0$iv.getConstraints();
            $this$_init__u24lambda_u2d2.setY(new CenterConstraint());
            $this$_init__u24lambda_u2d2.setWidth(UtilitiesKt.getPercent(100));
            $this$_init__u24lambda_u2d2.setHeight(UtilitiesKt.getPixel(1));
            ComponentsKt.childOf($this$constrain_u24lambda_u2d0$iv, this);
        }
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                       \u0000&
                                                       \u0002\u0018\u0002
                                                       \u0002\u0010\u0000
                                                       \u0002\b\u0002
                                                       \u0002\u0010\u0007
                                                       \u0002\b\u0002
                                                       \u0002\u0010\u0011
                                                       \u0002\u0018\u0002
                                                       \u0002\b\u0004
                                                       \u0002\u0018\u0002
                                                       \u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J
                                                       \u0010\f\u001a\u0004\u0018\u00010\rH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002
                                                       \u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002
                                                       \u0000R\u0019\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006
                                                       
                                                       \u0002\u0010\u000b\u001a\u0004\b	\u0010
                                                       ¨\u0006\u000e""" }, d2 = { "Lgg/essential/gui/studio/CosmeticStudio$Companion;", "", "()V", "CART_HEIGHT", "", "categoryWidth", "slotOrder", "", "Lgg/essential/mod/cosmetics/CosmeticSlot;", "getSlotOrder", "()[Lgg/essential/mod/cosmetics/CosmeticSlot;", "[Lgg/essential/mod/cosmetics/CosmeticSlot;", "getInstance", "Lgg/essential/gui/studio/CosmeticStudio;", "essential" })
    public static final class Companion
    {
        private Companion() {
            super();
        }
        
        @NotNull
        public final CosmeticSlot[] getSlotOrder() {
            return CosmeticStudio.access$getSlotOrder$cp();
        }
        
        @JvmStatic
        @Nullable
        public final CosmeticStudio getInstance() {
            final Screen openedScreen = GuiUtil.INSTANCE.openedScreen();
            return (openedScreen instanceof CosmeticStudio) ? ((CosmeticStudio)openedScreen) : null;
        }
        
        public Companion(final byte b) {
            this();
        }
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48)
    public final synthetic class WhenMappings
    {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        
        static {
            final int[] $EnumSwitchMapping$ = new int[SortOption.values().length];
            $EnumSwitchMapping$[SortOption.NAME.ordinal()] = 1;
            $EnumSwitchMapping$[SortOption.PRICE.ordinal()] = 2;
            $EnumSwitchMapping$[SortOption.RELEASE_DATE.ordinal()] = 3;
            $EnumSwitchMapping$[SortOption.IS_PURCHASED.ordinal()] = 4;
            $EnumSwitchMapping$[SortOption.CUSTOM_COLLECTION.ordinal()] = 5;
            $EnumSwitchMapping$0 = $EnumSwitchMapping$;
        }
    }
}
