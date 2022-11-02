package gg.essential.util;

import kotlin.reflect.*;
import com.sparkuniverse.toolbox.chat.enums.*;
import org.jetbrains.annotations.*;
import com.sparkuniverse.toolbox.chat.model.*;
import gg.essential.gui.friends.message.*;
import gg.essential.serverdiscovery.model.*;
import gg.essential.mixins.ext.client.multiplayer.*;
import net.minecraft.client.network.*;
import kotlin.text.*;
import gg.essential.elementa.constraints.animation.*;
import java.awt.*;
import java.util.function.*;
import org.apache.logging.log4j.*;
import kotlin.jvm.*;
import gg.essential.*;
import net.minecraft.client.*;
import gg.essential.mixins.ext.client.*;
import net.minecraft.server.*;
import com.mojang.authlib.*;
import com.google.common.collect.*;
import java.time.temporal.*;
import java.time.*;
import net.minecraft.client.util.*;
import gg.essential.mixins.impl.client.*;
import gg.essential.event.client.*;
import gg.essential.mod.*;
import java.nio.file.*;
import kotlin.ranges.*;
import gg.essential.elementa.state.*;
import gg.essential.elementa.effects.*;
import gg.essential.elementa.*;
import kotlin.jvm.functions.*;
import gg.essential.gui.*;
import net.minecraft.client.texture.*;
import java.io.*;
import gg.essential.api.gui.*;
import gg.essential.elementa.dsl.*;
import kotlin.properties.*;
import gg.essential.gui.common.*;
import gg.essential.elementa.components.*;
import gg.essential.elementa.constraints.*;
import gg.essential.gui.common.constraints.*;
import gg.essential.mixins.impl.util.math.*;
import net.minecraft.server.integrated.*;
import net.minecraft.util.*;
import net.minecraft.world.level.storage.*;
import net.minecraft.nbt.*;
import gg.essential.universal.*;
import java.util.*;
import gg.essential.elementa.utils.*;
import kotlin.jvm.internal.*;
import kotlin.*;
import java.util.concurrent.*;
import kotlin.collections.*;

@Metadata(mv = { 1, 6, 0 }, k = 2, xi = 48, d1 = { """
                                                   \u0000\u00f0\u0003
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0003
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0005
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010	
                                                   \u0002\u0010\u000e
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0010\u000b
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0003
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0003
                                                   \u0002\u0010\u0007
                                                   \u0002\b\u0003
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0004
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0003
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0005
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b
                                                   
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0004
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0003
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\b
                                                   \u0002\u0010\u0011
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0003
                                                   \u0002\b\u0005
                                                   \u0002\u0010\b
                                                   \u0002\b\u0004
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0004
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0003
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0004
                                                   \u0002\u0010!
                                                   \u0002\b\u0005
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010"
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\r
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010 
                                                   \u0002\b\u0003
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0007
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u0012
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0003
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0006
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010$
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0005
                                                   \u0002\u0018\u0002\u001aF\u0010>\u001a\u0014\u0012\u0004\u0012\u00020@\u0012
                                                   \u0012\b\u0012\u0004\u0012\u00020B0A0?2\f\u0010C\u001a\b\u0012\u0004\u0012\u00020\u001a0D2\u0006\u0010E\u001a\u00020\u001b2\u0006\u0010F\u001a\u00020\u001b2\u0006\u0010G\u001a\u00020\u001b2\u0006\u0010H\u001a\u00020\u001a\u001a\u0018\u0010I\u001a\u00020\u00102\u0006\u0010J\u001a\u00020\u00102\u0006\u0010K\u001a\u00020\u0010H\u0002\u001a\u0006\u0010L\u001a\u00020B\u001a5\u0010M\u001a\u0002H+"\b\b\u0000\u0010+*\u00020\u001b*\u0002H+2\u0006\u0010N\u001a\u00020O2\b\b\u0002\u0010P\u001a\u00020#2\b\b\u0002\u0010Q\u001a\u00020R¢\u0006\u0002\u0010S\u001a5\u0010M\u001a\u0002H+"\b\b\u0000\u0010+*\u00020\u001b*\u0002H+2\u0006\u0010N\u001a\u00020T2\b\b\u0002\u0010P\u001a\u00020#2\b\b\u0002\u0010Q\u001a\u00020R¢\u0006\u0002\u0010U\u001ap\u0010V\u001a\u0002H+"\b\b\u0000\u0010+*\u00020\u001b*\u0002H+2\f\u0010C\u001a\b\u0012\u0004\u0012\u00020\u001a0D2\f\u0010W\u001a\b\u0012\u0004\u0012\u00020\u00100D2\b\b\u0002\u0010X\u001a\u00020Y2\b\b\u0002\u0010Z\u001a\u00020#2
                                                   \b\u0002\u0010[\u001a\u0004\u0018\u00010#2\u0019\b\u0002\u0010\\u001a\u0013\u0012\u0004\u0012\u00020^\u0012\u0004\u0012\u00020B0]¢\u0006\u0002\b_¢\u0006\u0002\u0010`\u001ad\u0010a\u001a\u0002H+"\b\b\u0000\u0010+*\u00020\u001b*\u0002H+2\f\u0010W\u001a\b\u0012\u0004\u0012\u00020\u00100D2\b\b\u0002\u0010X\u001a\u00020Y2\b\b\u0002\u0010Z\u001a\u00020#2
                                                   \b\u0002\u0010[\u001a\u0004\u0018\u00010#2\u0019\b\u0002\u0010\\u001a\u0013\u0012\u0004\u0012\u00020^\u0012\u0004\u0012\u00020B0]¢\u0006\u0002\b_H\u0007¢\u0006\u0002\u0010b\u001a1\u0010c\u001a\u0002H+"\b\b\u0000\u0010+*\u00020\u001b*\u0002H+2\f\u0010W\u001a\b\u0012\u0004\u0012\u00020\u00100D2\b\b\u0002\u0010d\u001a\u00020\u001a¢\u0006\u0002\u0010e\u001aS\u0010f\u001a\u00020B*\b\u0012\u0004\u0012\u00020B0A2"\u0010g\u001a\u0012\u0012\u000e\b\u0001\u0012
                                                   \u0012\u0006\b\u0001\u0012\u00020j0i0h"
                                                   \u0012\u0006\b\u0001\u0012\u00020j0i2\u0012\u0010k\u001a\u000e\u0012\u0004\u0012\u00020j\u0012\u0004\u0012\u00020B0]H\u0086\b\u00f8\u0001\u0000¢\u0006\u0002\u0010l\u001a\u0019\u0010m\u001a\u0002H+"\b\b\u0000\u0010+*\u00020\u001b*\u0002H+¢\u0006\u0002\u0010n\u001a\r\u0010o\u001a\u00020p*\u00020TH\u0086\u0002\u001a\r\u0010q\u001a\u00020p*\u00020TH\u0086\u0002\u001a\r\u0010r\u001a\u00020p*\u00020TH\u0086\u0002\u001a\r\u0010s\u001a\u00020p*\u00020TH\u0086\u0002\u001a
                                                   \u0010t\u001a\u00020u*\u00020u\u001aS\u0010v\u001a\u00020w"\b\b\u0000\u0010+*\u00020\u001b*\u0002H+2\u0006\u0010x\u001a\u00020\u001a2\u0006\u0010y\u001a\u00020z2\b\b\u0002\u0010N\u001a\u00020T2\b\b\u0002\u0010{\u001a\u00020p2\f\u0010|\u001a\b\u0012\u0004\u0012\u00020#0D2\u0006\u0010F\u001a\u00020\u001b¢\u0006\u0002\u0010}\u001aR\u0010~\u001a\u0014\u0012\u0004\u0012\u00020@\u0012
                                                   \u0012\b\u0012\u0004\u0012\u00020B0A0?*\u00020\u007f2\f\u0010C\u001a\b\u0012\u0004\u0012\u00020\u001a0D2\b\b\u0002\u0010E\u001a\u00020\u001b2\b\b\u0002\u0010F\u001a\u00020\u001b2\b\b\u0002\u0010G\u001a\u00020\u001b2\b\b\u0002\u0010H\u001a\u00020\u001a\u001a0\u0010\u0080\u0001\u001a\u00020w*\u00030\u0081\u00012\u0006\u0010x\u001a\u00020\u001a2\u0006\u0010y\u001a\u00020z2\b\b\u0002\u0010N\u001a\u00020T2\b\b\u0002\u0010{\u001a\u00020p\u001a&\u0010\u0082\u0001\u001a\u00030\u0083\u0001*	\u0012\u0004\u0012\u00020#0\u0084\u00012\u000e\u0010\u0085\u0001\u001a	\u0012\u0004\u0012\u00020#0\u0084\u0001H\u0086\u0002\u001a8\u0010\u0086\u0001\u001a\u0004\u0018\u0001H+"\b\b\u0000\u0010+*\u00020\u001b*\u00020\u001b2\u000e\u0010\u0087\u0001\u001a	\u0012\u0004\u0012\u0002H+0\u0088\u00012	\b\u0002\u0010\u0089\u0001\u001a\u00020\u001a¢\u0006\u0003\u0010\u008a\u0001\u001a-\u0010\u0086\u0001\u001a\u0004\u0018\u0001H+"
                                                   \b\u0000\u0010+\u0018\u0001*\u00020\u001b*\u00020\u001b2	\b\u0002\u0010\u0089\u0001\u001a\u00020\u001aH\u0086\b¢\u0006\u0003\u0010\u008b\u0001\u001a7\u0010\u008c\u0001\u001a	\u0012\u0004\u0012\u0002H+0\u008d\u0001"\b\b\u0000\u0010+*\u00020\u001b*\u00020\u001b2\u000e\u0010\u0087\u0001\u001a	\u0012\u0004\u0012\u0002H+0\u0088\u00012	\b\u0002\u0010\u0089\u0001\u001a\u00020\u001a\u001a,\u0010\u008c\u0001\u001a	\u0012\u0004\u0012\u0002H+0\u008d\u0001"
                                                   \b\u0000\u0010+\u0018\u0001*\u00020\u001b*\u00020\u001b2	\b\u0002\u0010\u0089\u0001\u001a\u00020\u001aH\u0086\b\u001a\u001f\u0010\u008e\u0001\u001a\u0002H+"
                                                   \b\u0000\u0010+\u0018\u0001*\u00020\u001b*\u00020\u001bH\u0086\b¢\u0006\u0002\u0010n\u001a!\u0010\u008f\u0001\u001a\u0004\u0018\u0001H+"
                                                   \b\u0000\u0010+\u0018\u0001*\u00020\u001b*\u00020\u001bH\u0086\b¢\u0006\u0002\u0010n\u001a-\u0010\u008f\u0001\u001a\u0004\u0018\u0001H+"\b\b\u0000\u0010+*\u00020\u001b*\u00020\u001b2\u000e\u0010\u0087\u0001\u001a	\u0012\u0004\u0012\u0002H+0\u0088\u0001¢\u0006\u0003\u0010\u0090\u0001\u001a\u0014\u0010\u0091\u0001\u001a\u00020\u001a*\u00020u2\u0007\u0010\u0085\u0001\u001a\u00020u\u001a\f\u0010\u0092\u0001\u001a\u000208*\u00030\u0093\u0001\u001a\u001e\u0010\u0094\u0001\u001a
                                                   \u0012\u0005\u0012\u00030\u0096\u00010\u0095\u0001*\u00030\u0097\u00012\b\u0010\u0098\u0001\u001a\u00030\u0099\u0001\u001a/\u0010\u009a\u0001\u001a\u0004\u0018\u0001H+"\u0004\b\u0000\u0010+*\u00020<2\u0014\u0010\u009b\u0001\u001a\u000f\u0012\u0005\u0012\u00030\u009c\u0001\u0012\u0004\u0012\u0002H+0]¢\u0006\u0003\u0010\u009d\u0001\u001a\u000e\u0010\u009e\u0001\u001a\u0004\u0018\u00010\u0001*\u00030\u009f\u0001\u001a\f\u0010 \u0001\u001a\u00020\u000f*\u00030¡\u0001\u001a&\u0010¢\u0001\u001a\u0002H+"\b\b\u0000\u0010+*\u00020\u001b*\u0002H+2\u0006\u0010F\u001a\u00020\u001bH\u0086\u0004¢\u0006\u0003\u0010£\u0001\u001a$\u0010¤\u0001\u001a\u00020B*\u00030\u0081\u00012\u0007\u0010¥\u0001\u001a\u00020\u001b2\r\u0010¦\u0001\u001a\b\u0012\u0004\u0012\u00020B0A\u001a'\u0010§\u0001\u001a\b\u0012\u0004\u0012\u00020\u001a0D*\u00020\u001b2	\b\u0002\u0010¨\u0001\u001a\u00020\u001a2	\b\u0002\u0010©\u0001\u001a\u00020\u001a\u001a\f\u0010ª\u0001\u001a\u00020\u001a*\u00030\u009f\u0001\u001a\u0016\u0010«\u0001\u001a\u00020\u001a*\u00020\u001b2\u0007\u0010¬\u0001\u001a\u00020\u001bH\u0002\u001a\u000b\u0010\u00ad\u0001\u001a\u00020\u001a*\u00020\u001b\u001aL\u0010®\u0001\u001a(\u0012\f\u0012
                                                    \u0002*\u0004\u0018\u0001H+H+ \u0002*\u0013\u0012\f\u0012
                                                    \u0002*\u0004\u0018\u0001H+H+\u0018\u00010¯\u00010¯\u0001"\u0004\b\u0000\u0010+*	\u0012\u0004\u0012\u0002H+0¯\u00012
                                                   \b\u0002\u0010°\u0001\u001a\u00030±\u0001H\u0007\u001a-\u0010²\u0001\u001a\u0010\u0012\u000b\u0012	\u0012\u0004\u0012\u0002H+0³\u00010¯\u0001"\u0004\b\u0000\u0010+*\u0010\u0012\u000b\u0012	\u0012\u0004\u0012\u0002H+0¯\u00010³\u0001\u001a\u001a\u0010´\u0001\u001a\u00020\u001b*\u00020\u001b2\r\u0010¦\u0001\u001a\b\u0012\u0004\u0012\u00020B0A\u001a0\u0010µ\u0001\u001a\u00020B"\u0005\b\u0000\u0010¶\u0001*
                                                   \u0012\u0005\u0012\u0003H¶\u00010·\u00012\u0014\u0010¸\u0001\u001a\u000f\u0012\u0005\u0012\u0003H¶\u0001\u0012\u0004\u0012\u00020B0]\u001a0\u0010¹\u0001\u001a\u00020B"\u0005\b\u0000\u0010¶\u0001*
                                                   \u0012\u0005\u0012\u0003H¶\u00010·\u00012\u0014\u0010¸\u0001\u001a\u000f\u0012\u0005\u0012\u0003H¶\u0001\u0012\u0004\u0012\u00020B0]\u001a9\u0010º\u0001\u001a\b\u0012\u0004\u0012\u0002H+0D"\u0004\b\u0000\u0010+*\u00020\u001b2\u000b\b\u0002\u0010»\u0001\u001a\u0004\u0018\u0001H+2\r\u0010¼\u0001\u001a\b\u0012\u0004\u0012\u0002H+0A¢\u0006\u0003\u0010½\u0001\u001a\u0017\u0010¾\u0001\u001a\u00030¿\u0001*\u00030\u00c0\u00012\b\u0010\u00c1\u0001\u001a\u00030\u00c2\u0001\u001a\u0017\u0010¾\u0001\u001a\u00030¿\u0001*\u00030\u00c0\u00012\b\u0010\u00c3\u0001\u001a\u00030\u00c4\u0001\u001a+\u0010\u00c5\u0001\u001a\u00030\u00c6\u0001*\u00030\u00c7\u00012\u0007\u0010\u00c8\u0001\u001a\u00020\u00102\u0007\u0010\u00c9\u0001\u001a\u00020\u00102\b\u0010\u00ca\u0001\u001a\u00030\u00cb\u0001H\u0000\u001a\u0016\u0010\u00cc\u0001\u001a\u00030\u00cd\u0001*\u00030\u00ce\u00012\u0007\u0010\u00cc\u0001\u001a\u00020\u001a\u001a\u0018\u0010\u00cf\u0001\u001a\u00030\u0081\u0001*\u00030\u0081\u00012\u0006\u0010y\u001a\u00020zH\u0086\u0004\u001a \u0010\u00d0\u0001\u001a\u00020B*\u00030\u0081\u00012\u0007\u0010\u00d1\u0001\u001a\u00020\u001b2	\b\u0002\u0010\u00d2\u0001\u001a\u00020\u001a\u001a\u0019\u0010\u00d3\u0001\u001a\u00020B*\u00060\u0013j\u0002`\u00142\b\u0010\u00d4\u0001\u001a\u00030\u00d5\u0001\u001a\u0011\u0010\u00d6\u0001\u001a\u00030\u00d7\u0001*\u0007\u0012\u0002\b\u00030·\u0001\u001aW\u0010\u00d8\u0001\u001a,\u0012\u000e\u0012\f \u0002*\u0005\u0018\u00010\u00d9\u00010\u00d9\u0001 \u0002*\u0015\u0012\u000e\u0012\f \u0002*\u0005\u0018\u00010\u00d9\u00010\u00d9\u0001\u0018\u00010¯\u00010¯\u0001"\u0004\b\u0000\u0010+*	\u0012\u0004\u0012\u0002H+0¯\u00012\u0013\u0010¸\u0001\u001a\u000e\u0012\u0004\u0012\u0002H+\u0012\u0004\u0012\u00020B0]\u001a&\u0010\u00da\u0001\u001a\u00030\u00db\u0001*	\u0012\u0004\u0012\u00020#0\u0084\u00012\u000e\u0010\u0085\u0001\u001a	\u0012\u0004\u0012\u00020#0\u0084\u0001H\u0086\u0002\u001a\r\u0010\u00dc\u0001\u001a\u00030\u00dd\u0001*\u00030\u00de\u0001\u001a\f\u0010\u00df\u0001\u001a\u00020\u0010*\u00030\u00e0\u0001\u001a\u000b\u0010\u00e1\u0001\u001a\u00020\u0010*\u00020\u0001\u001a$\u0010\u00e2\u0001\u001a\u000202*\u00030\u00e3\u00012\u0016\b\u0002\u0010\u00e4\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u0002020\u00e5\u0001\u001a\f\u0010\u00e6\u0001\u001a\u00020\u0010*\u00030\u00e7\u0001\u001a\r\u0010\u00e8\u0001\u001a\u00030\u00de\u0001*\u00030\u00dd\u0001"\u0016\u0010\u0000\u001a
                                                    \u0002*\u0004\u0018\u00010\u00010\u0001X\u0082\u0004¢\u0006\u0002
                                                   \u0000"\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006"\u001b\u0010\u0007\u001a\u00020\b8FX\u0086\u0084\u0002¢\u0006\f
                                                   \u0004\b\u000b\u0010\f\u001a\u0004\b	\u0010
                                                   "*\u0010\r\u001a\u001e\u0012\f\u0012
                                                    \u0002*\u0004\u0018\u00010\u000f0\u000f\u0012\f\u0012
                                                    \u0002*\u0004\u0018\u00010\u00100\u00100\u000eX\u0082\u0004¢\u0006\u0002
                                                   \u0000"\u0019\u0010\u0011\u001a\u00020\u0012*\u00060\u0013j\u0002`\u00148F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016"\u0015\u0010\u0011\u001a\u00020\u0017*\u00020\u00178F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0018"\u0015\u0010\u0019\u001a\u00020\u001a*\u00020\u001b8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d"\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u001a*\u0004\u0018\u00010\u001f8F¢\u0006\u0006\u001a\u0004\b \u0010!"\u0019\u0010"\u001a\u0004\u0018\u00010#*\u0004\u0018\u00010\u001f8F¢\u0006\u0006\u001a\u0004\b$\u0010%"\u0019\u0010&\u001a\u0004\u0018\u00010'*\u0004\u0018\u00010\u001f8F¢\u0006\u0006\u001a\u0004\b(\u0010)"#\u0010*\u001a\u0004\u0018\u0001H+"\u0004\b\u0000\u0010+*\b\u0012\u0004\u0012\u0002H+0,8F¢\u0006\u0006\u001a\u0004\b-\u0010."8\u00101\u001a
                                                    \u0002*\u0004\u0018\u00010000*\u0002022\u000e\u0010/\u001a
                                                    \u0002*\u0004\u0018\u000100008F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b3\u00104"\u0004\b5\u00106"\u0015\u00107\u001a\u000208*\u0002098F¢\u0006\u0006\u001a\u0004\b:\u0010;"\u0015\u00107\u001a\u000208*\u00020<8F¢\u0006\u0006\u001a\u0004\b:\u0010=\u0082\u0002\u0007
                                                   \u0005\b\u009920\u0001¨\u0006\u00e9\u0001²\u0006\u000b\u0010\u00ea\u0001\u001a\u00020@X\u008a\u0084\u0002²\u0006\u000b\u0010\u00eb\u0001\u001a\u00020@X\u008a\u0084\u0002²\u0006\f\u0010\u00ec\u0001\u001a\u00030\u00ed\u0001X\u008a\u0084\u0002""" }, d2 = { "BOT_UUID", "Ljava/util/UUID;", "kotlin.jvm.PlatformType", "minecraftDirectory", "Ljava/io/File;", "getMinecraftDirectory", "()Ljava/io/File;", "os", "Lgg/essential/util/OperatingSystem;", "getOs", "()Lgg/essential/util/OperatingSystem;", "os$delegate", "Lkotlin/Lazy;", "timeMap", "Ljava/util/TreeMap;", "", "", "executor", "Ljava/util/concurrent/Executor;", "Lnet/minecraft/client/MinecraftClient;", "Lgg/essential/universal/utils/MCMinecraft;", "getExecutor", "(Lnet/minecraft/client/MinecraftClient;)Ljava/util/concurrent/Executor;", "Lnet/minecraft/server/MinecraftServer;", "(Lnet/minecraft/server/MinecraftServer;)Lnet/minecraft/server/MinecraftServer;", "hasWindow", "", "Lgg/essential/elementa/UIComponent;", "getHasWindow", "(Lgg/essential/elementa/UIComponent;)Z", "optBoolean", "Lgg/essential/lib/gson/JsonElement;", "getOptBoolean", "(Lgg/essential/lib/gson/JsonElement;)Ljava/lang/Boolean;", "optFloat", "", "getOptFloat", "(Lgg/essential/lib/gson/JsonElement;)Ljava/lang/Float;", "optObject", "Lgg/essential/lib/gson/JsonObject;", "getOptObject", "(Lgg/essential/lib/gson/JsonElement;)Lgg/essential/lib/gson/JsonObject;", "orNull", "T", "Lkotlin/Lazy;", "getOrNull", "(Lkotlin/Lazy;)Ljava/lang/Object;", "value", "Lnet/minecraft/client/network/ServerInfo$ResourcePackPolicy;", "serverResourcePack", "Lnet/minecraft/client/network/ServerInfo;", "getServerResourcePack", "(Lnet/minecraft/client/network/ServerInfo;)Lnet/minecraft/client/network/ServerInfo$ResourcePackPolicy;", "setServerResourcePack", "(Lnet/minecraft/client/network/ServerInfo;Lnet/minecraft/client/network/ServerInfo$ResourcePackPolicy;)V", "worldDirectory", "Ljava/nio/file/Path;", "Lnet/minecraft/server/integrated/IntegratedServer;", "getWorldDirectory", "(Lnet/minecraft/server/integrated/IntegratedServer;)Ljava/nio/file/Path;", "Lnet/minecraft/world/level/storage/LevelSummary;", "(Lnet/minecraft/world/level/storage/LevelSummary;)Ljava/nio/file/Path;", "createScrollbarRelativeTo", "Lkotlin/Pair;", "Lgg/essential/elementa/components/UIContainer;", "Lkotlin/Function0;", "", "display", "Lgg/essential/elementa/state/State;", "xPositionAndWidth", "parent", "yPositionAndHeight", "initializeToBottom", "readShader", "name", "ext", "toggleElementaDebug", "animateColor", "color", "Lgg/essential/elementa/constraints/ColorConstraint;", "time", "strategy", "Lgg/essential/elementa/constraints/animation/AnimationStrategy;", "(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/constraints/ColorConstraint;FLgg/essential/elementa/constraints/animation/AnimationStrategy;)Lgg/essential/elementa/UIComponent;", "Ljava/awt/Color;", "(Lgg/essential/elementa/UIComponent;Ljava/awt/Color;FLgg/essential/elementa/constraints/animation/AnimationStrategy;)Lgg/essential/elementa/UIComponent;", "bindEssentialTooltip", "tooltipContent", "position", "Lgg/essential/gui/common/EssentialTooltip$Position;", "padding", "wrapAtWidth", "configure", "Lkotlin/Function1;", "Lgg/essential/elementa/components/UIText;", "Lkotlin/ExtensionFunctionType;", "(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;Lgg/essential/gui/common/EssentialTooltip$Position;FLjava/lang/Float;Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/UIComponent;", "bindHoverEssentialTooltip", "(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/state/State;Lgg/essential/gui/common/EssentialTooltip$Position;FLjava/lang/Float;Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/UIComponent;", "bindHoverVanillaTooltip", "belowComponent", "(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/state/State;Z)Lgg/essential/elementa/UIComponent;", "catch", "exceptions", "", "Lkotlin/reflect/KClass;", "", "catchBlock", "(Lkotlin/jvm/functions/Function0;[Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function1;)V", "centered", "(Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;", "component1", "", "component2", "component3", "component4", "copy", "Lcom/mojang/authlib/GameProfile;", "createGradient", "Lgg/essential/elementa/components/GradientComponent;", "top", "heightSize", "Lgg/essential/elementa/constraints/HeightConstraint;", "maxGradient", "percentState", "(Lgg/essential/elementa/UIComponent;ZLgg/essential/elementa/constraints/HeightConstraint;Ljava/awt/Color;ILgg/essential/elementa/state/State;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/components/GradientComponent;", "createRightDividerScroller", "Lgg/essential/api/gui/EssentialGUI;", "createScrollGradient", "Lgg/essential/elementa/components/ScrollComponent;", "div", "Lgg/essential/elementa/constraints/SizeConstraint;", "Lgg/essential/elementa/constraints/SuperConstraint;", "other", "findChildOfTypeOrNull", "type", "Ljava/lang/Class;", "recursive", "(Lgg/essential/elementa/UIComponent;Ljava/lang/Class;Z)Lgg/essential/elementa/UIComponent;", "(Lgg/essential/elementa/UIComponent;Z)Lgg/essential/elementa/UIComponent;", "findChildrenOfType", "", "findParentOfType", "findParentOfTypeOrNull", "(Lgg/essential/elementa/UIComponent;Ljava/lang/Class;)Lgg/essential/elementa/UIComponent;", "fullyEquals", "getAssetCachePath", "Lgg/essential/mod/EssentialAsset;", "getCoveredSkinLayers", "", "Lgg/essential/mod/cosmetics/SkinLayer;", "Lgg/essential/network/cosmetics/Cosmetic;", "manager", "Lgg/essential/network/connectionmanager/cosmetics/CosmeticsManager;", "getLevelNbtValue", "nbtAction", "Lnet/minecraft/nbt/NbtCompound;", "(Lnet/minecraft/world/level/storage/LevelSummary;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "getOtherUser", "Lcom/sparkuniverse/toolbox/chat/model/Channel;", "getSentTimestamp", "Lcom/sparkuniverse/toolbox/chat/model/Message;", "hiddenChildOf", "(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;", "holdScrollVerticalLocation", "child", "block", "hoveredState", "hitTest", "layoutSafe", "isAnnouncement", "isComponentInParentChain", "target", "isInComponentTree", "logExceptions", "Ljava/util/concurrent/CompletableFuture;", "logger", "Lorg/apache/logging/log4j/Logger;", "merge", "", "onAnimationFrame", "onItemAdded", "E", "Lgg/essential/elementa/utils/ObservableList;", "callback", "onItemRemoved", "pollingState", "initialValue", "getter", "(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Lgg/essential/elementa/state/State;", "read", "Lgg/essential/universal/UImage;", "Lgg/essential/universal/UImage$Companion;", "stream", "Ljava/io/InputStream;", "bytes", "", "readFromLegacyShader", "Lgg/essential/universal/shader/UShader;", "Lgg/essential/universal/shader/UShader$Companion;", "vertName", "fragName", "blendState", "Lgg/essential/universal/shader/BlendState;", "reversed", "Lkotlin/ranges/IntProgression;", "Lkotlin/ranges/IntRange;", "scrollGradient", "scrollToCenterComponent", "component", "smooth", "setSession", "session", "Lnet/minecraft/client/util/Session;", "sizeAsConstraint", "Lgg/essential/gui/common/constraints/ObservableListSizeConstraint;", "thenAcceptOnMainThread", "Ljava/lang/Void;", "times", "Lgg/essential/elementa/constraints/MasterConstraint;", "toCommon", "Lgg/essential/model/util/UMatrixStack;", "Lgg/essential/universal/UMatrixStack;", "toCosmeticOptionTime", "Ljava/time/Instant;", "toDashlessString", "toServerData", "Lgg/essential/serverdiscovery/model/ServerDiscovery;", "knownServers", "", "toShortString", "Ljava/time/Duration;", "toUC", "essential", "scrollContainer", "scrollbar", "scrollbarBlock", "Lgg/essential/elementa/components/UIBlock;" })
public final class ExtensionsKt
{
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties;
    private static final UUID BOT_UUID;
    @NotNull
    private static final Lazy os$delegate;
    @NotNull
    private static final TreeMap<Long, String> timeMap;
    
    @Nullable
    public static final UUID getOtherUser(@NotNull final Channel $this$getOtherUser) {
        Intrinsics.checkNotNullParameter((Object)$this$getOtherUser, "<this>");
        if ($this$getOtherUser.getType() == ChannelType.DIRECT_MESSAGE) {
            final Set members = $this$getOtherUser.getMembers();
            Intrinsics.checkNotNullExpressionValue((Object)members, "members");
            final Iterable $this$firstOrNull$iv = members;
            for (final Object element$iv : $this$firstOrNull$iv) {
                final UUID it = (UUID)element$iv;
                if (!Intrinsics.areEqual((Object)it, (Object)UUIDUtil.getClientUUID())) {
                    final Object o = element$iv;
                    return (UUID)o;
                }
            }
            final Object o = null;
            return (UUID)o;
        }
        return null;
    }
    
    public static final boolean isAnnouncement(@NotNull final Channel $this$isAnnouncement) {
        Intrinsics.checkNotNullParameter((Object)$this$isAnnouncement, "<this>");
        return $this$isAnnouncement.getType() == ChannelType.ANNOUNCEMENT || $this$isAnnouncement.getMembers().contains(ExtensionsKt.BOT_UUID);
    }
    
    public static final long getSentTimestamp(@NotNull final Message $this$getSentTimestamp) {
        Intrinsics.checkNotNullParameter((Object)$this$getSentTimestamp, "<this>");
        return MessageUtils.INSTANCE.getSentTimeStamp($this$getSentTimestamp.getId());
    }
    
    @NotNull
    public static final ServerInfo toServerData(@NotNull final ServerDiscovery $this$toServerData, @NotNull final Map<String, ? extends ServerInfo> knownServers) {
        Intrinsics.checkNotNullParameter((Object)$this$toServerData, "<this>");
        Intrinsics.checkNotNullParameter((Object)knownServers, "knownServers");
        Object o;
        if ((o = (ServerInfo)knownServers.get($this$toServerData.getAddresses().get(0))) == null) {
            String displayName;
            if ((displayName = $this$toServerData.getDisplayName("en_us")) == null) {
                displayName = $this$toServerData.getAddresses().get(0);
            }
            final ServerInfo $this$toServerData_u24lambda_u2d1;
            final ServerInfo serverInfo = $this$toServerData_u24lambda_u2d1 = new ServerInfo(displayName, (String)$this$toServerData.getAddresses().get(0), (boolean)(0 != 0));
            ServerDataExtKt.setTrusted$791c11fa(ServerDataExtKt.getExt($this$toServerData_u24lambda_u2d1));
            $this$toServerData_u24lambda_u2d1.setResourcePackPolicy(ServerInfo$ResourcePackPolicy.ENABLED);
            o = serverInfo;
        }
        return (ServerInfo)o;
    }
    
    @NotNull
    public static final String toDashlessString(@NotNull final UUID $this$toDashlessString) {
        Intrinsics.checkNotNullParameter((Object)$this$toDashlessString, "<this>");
        final String string = $this$toDashlessString.toString();
        Intrinsics.checkNotNullExpressionValue((Object)string, "toString()");
        return StringsKt.replace$default(string, "-", "", false, 4, (Object)null);
    }
    
    @Nullable
    public static final <T> T getOrNull(@NotNull final Lazy<? extends T> $this$orNull) {
        Intrinsics.checkNotNullParameter((Object)$this$orNull, "<this>");
        return (T)($this$orNull.isInitialized() ? $this$orNull.getValue() : null);
    }
    
    @NotNull
    public static final <T extends UIComponent> T hiddenChildOf(@NotNull final T $this$hiddenChildOf, @NotNull final UIComponent parent) {
        Intrinsics.checkNotNullParameter((Object)$this$hiddenChildOf, "<this>");
        Intrinsics.checkNotNullParameter((Object)parent, "parent");
        final UIComponent $this$hiddenChildOf_u24lambda_u2d3 = $this$hiddenChildOf;
        parent.addChild($this$hiddenChildOf_u24lambda_u2d3);
        $this$hiddenChildOf_u24lambda_u2d3.hide(true);
        return $this$hiddenChildOf;
    }
    
    @NotNull
    public static final <T extends UIComponent> T animateColor(@NotNull final T $this$animateColor, @NotNull final ColorConstraint color, final float time, @NotNull final AnimationStrategy strategy) {
        Intrinsics.checkNotNullParameter((Object)$this$animateColor, "<this>");
        Intrinsics.checkNotNullParameter((Object)color, "color");
        Intrinsics.checkNotNullParameter((Object)strategy, "strategy");
        final UIComponent $this$animateColor_u24lambda_u2d5 = $this$animateColor;
        final UIComponent $this$animate_u24lambda_u2d0$iv;
        final UIComponent $this$animate$iv = $this$animate_u24lambda_u2d0$iv = $this$animateColor_u24lambda_u2d5;
        final AnimatingConstraints $this$animateColor_u24lambda_u2d5_u24lambda_u2d4;
        final AnimatingConstraints anim$iv = $this$animateColor_u24lambda_u2d5_u24lambda_u2d4 = $this$animate_u24lambda_u2d0$iv.makeAnimation();
        AnimatingConstraints.setColorAnimation$default($this$animateColor_u24lambda_u2d5_u24lambda_u2d4, strategy, 0.3f, color, 0.0f, 8, null);
        $this$animate_u24lambda_u2d0$iv.animateTo(anim$iv);
        return $this$animateColor;
    }
    
    public static /* synthetic */ UIComponent animateColor$default$248f32e2$23c94306(final UIComponent $this$animateColor, final ColorConstraint color) {
        return animateColor($this$animateColor, color, 0.3f, Animations.OUT_EXP);
    }
    
    @NotNull
    public static final <T extends UIComponent> T animateColor$465db92f(@NotNull final T $this$animateColor, @NotNull final Color color, @NotNull final AnimationStrategy strategy) {
        Intrinsics.checkNotNullParameter((Object)$this$animateColor, "<this>");
        Intrinsics.checkNotNullParameter((Object)color, "color");
        Intrinsics.checkNotNullParameter((Object)strategy, "strategy");
        return animateColor($this$animateColor, UtilitiesKt.toConstraint(color), 0.3f, strategy);
    }
    
    public static /* synthetic */ UIComponent animateColor$default$7bfe46b2$7cb552a(final UIComponent $this$animateColor, final Color color) {
        return animateColor$465db92f($this$animateColor, color, Animations.OUT_EXP);
    }
    
    public static final boolean getHasWindow(@NotNull final UIComponent $this$hasWindow) {
        Intrinsics.checkNotNullParameter((Object)$this$hasWindow, "<this>");
        return $this$hasWindow instanceof Window || ($this$hasWindow.getHasParent() && getHasWindow($this$hasWindow.getParent()));
    }
    
    @NotNull
    public static final <T> CompletableFuture<List<T>> merge(@NotNull final List<? extends CompletableFuture<T>> $this$merge) {
        Intrinsics.checkNotNullParameter((Object)$this$merge, "<this>");
        final Collection thisCollection$iv;
        final Collection $this$toTypedArray$iv = thisCollection$iv = $this$merge;
        final CompletableFuture[] array = thisCollection$iv.toArray(new CompletableFuture[0]);
        Intrinsics.checkNotNull((Object)array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        final CompletableFuture[] original = array;
        final CompletableFuture<Object> thenApply = (CompletableFuture<Object>)CompletableFuture.allOf((CompletableFuture<?>[])Arrays.copyOf(original, original.length)).thenApply((Function<? super Void, ? extends List<T>>)ExtensionsKt::merge$lambda-7);
        Intrinsics.checkNotNullExpressionValue((Object)thenApply, "allOf(*toTypedArray()).t\u2026ply { map { it.join() } }");
        return (CompletableFuture<List<T>>)thenApply;
    }
    
    @JvmOverloads
    public static final <T> CompletableFuture<T> logExceptions(@NotNull final CompletableFuture<T> $this$logExceptions, @NotNull final Logger logger) {
        Intrinsics.checkNotNullParameter((Object)$this$logExceptions, "<this>");
        Intrinsics.checkNotNullParameter((Object)logger, "logger");
        return $this$logExceptions.whenComplete(ExtensionsKt::logExceptions$lambda-8);
    }
    
    public static /* synthetic */ CompletableFuture logExceptions$default$68026618$686f8a8c(final CompletableFuture $this$logExceptions) {
        final Logger logger = Essential.logger;
        Intrinsics.checkNotNullExpressionValue((Object)logger, "logger");
        return logExceptions((CompletableFuture<Object>)$this$logExceptions, logger);
    }
    
    @NotNull
    public static final Executor getExecutor(@NotNull final MinecraftClient $this$executor) {
        Intrinsics.checkNotNullParameter((Object)$this$executor, "<this>");
        return MinecraftExtKt.getExecutor(MinecraftExtKt.getExt($this$executor));
    }
    
    @NotNull
    public static final MinecraftServer getExecutor(@NotNull final MinecraftServer $this$executor) {
        Intrinsics.checkNotNullParameter((Object)$this$executor, "<this>");
        return $this$executor;
    }
    
    public static final boolean fullyEquals(@NotNull final GameProfile $this$fullyEquals, @NotNull final GameProfile other) {
        Intrinsics.checkNotNullParameter((Object)$this$fullyEquals, "<this>");
        Intrinsics.checkNotNullParameter((Object)other, "other");
        return Intrinsics.areEqual((Object)$this$fullyEquals.getId(), (Object)other.getId()) && Intrinsics.areEqual((Object)$this$fullyEquals.getName(), (Object)other.getName()) && Intrinsics.areEqual((Object)$this$fullyEquals.getProperties(), (Object)other.getProperties());
    }
    
    @NotNull
    public static final GameProfile copy(@NotNull final GameProfile $this$copy) {
        Intrinsics.checkNotNullParameter((Object)$this$copy, "<this>");
        final GameProfile it = new GameProfile($this$copy.getId(), $this$copy.getName());
        it.getProperties().putAll((Multimap)$this$copy.getProperties());
        return it;
    }
    
    public static final void toggleElementaDebug() {
        OptionsKt.setElementaDebug(!OptionsKt.getElementaDebug());
    }
    
    @NotNull
    public static final OperatingSystem getOs() {
        return (OperatingSystem)ExtensionsKt.os$delegate.getValue();
    }
    
    @NotNull
    public static final File getMinecraftDirectory() {
        return switch (WhenMappings.$EnumSwitchMapping$0[getOs().ordinal()]) {
            case 1 -> new File(System.getenv("APPDATA"), ".minecraft");
            case 2 -> new File(System.getProperty("user.home"), "Library/Application Support/minecraft");
            default -> new File(System.getProperty("user.home"), ".minecraft");
        };
    }
    
    @NotNull
    public static final String toCosmeticOptionTime(@NotNull final Instant $this$toCosmeticOptionTime) {
        Intrinsics.checkNotNullParameter((Object)$this$toCosmeticOptionTime, "<this>");
        final Duration between = Duration.between(Instant.now(), $this$toCosmeticOptionTime);
        Intrinsics.checkNotNullExpressionValue((Object)between, "between(Instant.now(), this)");
        return toShortString(between);
    }
    
    @NotNull
    public static final String toShortString(@NotNull final Duration $this$toShortString) {
        Intrinsics.checkNotNullParameter((Object)$this$toShortString, "<this>");
        final long delta = $this$toShortString.toMillis();
        final Map.Entry<Long, String> floorEntry2 = ExtensionsKt.timeMap.floorEntry(delta);
        if (floorEntry2 == null) {
            return "Expired";
        }
        final Map.Entry ceilEntry = (Map.Entry)floorEntry2;
        final Map.Entry floorEntry = (Map.Entry)ExtensionsKt.timeMap.floorEntry(ceilEntry.getKey().longValue() - 1L);
        if (ceilEntry == floorEntry || floorEntry == null) {
            final long n = delta;
            final Number key = ceilEntry.getKey();
            Intrinsics.checkNotNullExpressionValue((Object)key, "ceilEntry.key");
            return "" + n / key.longValue() + ceilEntry.getValue();
        }
        final long n2 = delta;
        final Number key2 = ceilEntry.getKey();
        Intrinsics.checkNotNullExpressionValue((Object)key2, "ceilEntry.key");
        final long ceilUnits = n2 / key2.longValue();
        final long n3 = delta;
        final long n4 = ceilUnits;
        final Number key3 = ceilEntry.getKey();
        Intrinsics.checkNotNullExpressionValue((Object)key3, "ceilEntry.key");
        final long n5 = n3 - n4 * key3.longValue();
        final Number key4 = floorEntry.getKey();
        Intrinsics.checkNotNullExpressionValue((Object)key4, "floorEntry.key");
        final long floorUnits = n5 / key4.longValue();
        return "" + ceilUnits + ceilEntry.getValue() + " " + floorUnits + floorEntry.getValue();
    }
    
    public static final void setSession(@NotNull final MinecraftClient $this$setSession, @NotNull final Session session) {
        Intrinsics.checkNotNullParameter((Object)$this$setSession, "<this>");
        Intrinsics.checkNotNullParameter((Object)session, "session");
        ((MinecraftExt)$this$setSession).setSession(session);
        $this$setSession.getSessionProperties().clear();
        Essential.EVENT_BUS.post(new ReAuthEvent.Pre(session));
    }
    
    @NotNull
    public static final Path getAssetCachePath(@NotNull final EssentialAsset $this$getAssetCachePath) {
        Intrinsics.checkNotNullParameter((Object)$this$getAssetCachePath, "<this>");
        final String checksum = $this$getAssetCachePath.getChecksum();
        final Path resolve = Essential.getInstance().getBaseDir().toPath().resolve("cosmetic-cache").resolve(String.valueOf(checksum.charAt(0))).resolve(String.valueOf(checksum.charAt(1)));
        final String substring = checksum.substring(2);
        Intrinsics.checkNotNullExpressionValue((Object)substring, "this as java.lang.String).substring(startIndex)");
        final Path resolve2 = resolve.resolve(substring);
        Intrinsics.checkNotNullExpressionValue((Object)resolve2, "getInstance().baseDir.to\u2026ve(checksum.substring(2))");
        return resolve2;
    }
    
    @NotNull
    public static final IntProgression reversed(@NotNull final IntRange $this$reversed, final boolean reversed) {
        Intrinsics.checkNotNullParameter((Object)$this$reversed, "<this>");
        return (IntProgression)(reversed ? RangesKt.downTo($this$reversed.getLast(), $this$reversed.getFirst()) : $this$reversed);
    }
    
    @NotNull
    public static final <T> State<T> pollingState(@NotNull final UIComponent $this$pollingState, @Nullable final T initialValue, @NotNull final Function0<? extends T> getter) {
        Intrinsics.checkNotNullParameter((Object)$this$pollingState, "<this>");
        Intrinsics.checkNotNullParameter((Object)getter, "getter");
        Object invoke = initialValue;
        if (initialValue == null) {
            invoke = getter.invoke();
        }
        final BasicState state = new BasicState(invoke);
        $this$pollingState.enableEffect((Effect)new ExtensionsKt$pollingState.ExtensionsKt$pollingState$1(state, (Function0)getter));
        return state;
    }
    
    public static /* synthetic */ State pollingState$default$a9b5a09$5bde5825(final UIComponent $this$pollingState, final Function0 getter) {
        return pollingState($this$pollingState, null, (kotlin.jvm.functions.Function0<? extends __Null>)getter);
    }
    
    @NotNull
    public static final UIComponent onAnimationFrame(@NotNull final UIComponent $this$onAnimationFrame, @NotNull final Function0<Unit> block) {
        Intrinsics.checkNotNullParameter((Object)$this$onAnimationFrame, "<this>");
        Intrinsics.checkNotNullParameter((Object)block, "block");
        return $this$onAnimationFrame.enableEffect((Effect)new ExtensionsKt$onAnimationFrame.ExtensionsKt$onAnimationFrame$1((Function0)block));
    }
    
    @NotNull
    public static final State<Boolean> hoveredState(@NotNull final UIComponent $this$hoveredState, final boolean hitTest, final boolean layoutSafe) {
        Intrinsics.checkNotNullParameter((Object)$this$hoveredState, "<this>");
        final BasicState unsafeHovered = new BasicState((T)false);
        final BasicState safeHovered = new BasicState((T)false);
        if (hitTest) {
            final Ref$BooleanRef registerHitTest = new Ref$BooleanRef();
            registerHitTest.element = true;
            onAnimationFrame($this$hoveredState, (Function0<Unit>)new ExtensionsKt$hoveredState.ExtensionsKt$hoveredState$1(registerHitTest, $this$hoveredState, unsafeHovered));
        }
        $this$hoveredState.onMouseEnter((Function1<? super UIComponent, Unit>)new ExtensionsKt$hoveredState.ExtensionsKt$hoveredState$2(hitTest, unsafeHovered, $this$hoveredState));
        $this$hoveredState.onMouseLeave((Function1<? super UIComponent, Unit>)new ExtensionsKt$hoveredState.ExtensionsKt$hoveredState$3(unsafeHovered));
        State state;
        if (layoutSafe) {
            unsafeHovered.onSetValue((Function1)new ExtensionsKt$hoveredState.ExtensionsKt$hoveredState$4(safeHovered));
            state = safeHovered;
        }
        else {
            state = unsafeHovered;
        }
        return state;
    }
    
    public static /* synthetic */ State hoveredState$default$56721d26(final UIComponent $this$hoveredState, boolean hitTest, boolean layoutSafe, final int n) {
        if ((n & 0x1) != 0x0) {
            hitTest = true;
        }
        if ((n & 0x2) != 0x0) {
            layoutSafe = true;
        }
        return hoveredState($this$hoveredState, hitTest, layoutSafe);
    }
    
    private static final boolean isComponentInParentChain(final UIComponent $this$isComponentInParentChain, final UIComponent target) {
        UIComponent component = $this$isComponentInParentChain;
        while (component.getHasParent() && !(component instanceof Window)) {
            component = component.getParent();
            if (Intrinsics.areEqual((Object)component, (Object)target)) {
                return true;
            }
        }
        return false;
    }
    
    @NotNull
    public static final <T extends UIComponent> T bindEssentialTooltip(@NotNull final T $this$bindEssentialTooltip, @NotNull final State<Boolean> display, @NotNull final State<String> tooltipContent, @NotNull final EssentialTooltip.Position position, final float padding, @Nullable final Float wrapAtWidth, @NotNull final Function1<? super UIText, Unit> configure) {
        Intrinsics.checkNotNullParameter((Object)$this$bindEssentialTooltip, "<this>");
        Intrinsics.checkNotNullParameter((Object)display, "display");
        Intrinsics.checkNotNullParameter((Object)tooltipContent, "tooltipContent");
        Intrinsics.checkNotNullParameter((Object)position, "position");
        Intrinsics.checkNotNullParameter((Object)configure, "configure");
        final UIComponent $this$constrain_u24lambda_u2d0$iv;
        final UIComponent $this$constrain$iv = $this$constrain_u24lambda_u2d0$iv = new EssentialTooltip($this$bindEssentialTooltip, position, 0, false, 12);
        final UIConstraints constraints;
        final UIConstraints $this$bindEssentialTooltip_u24lambda_u2d11 = constraints = $this$constrain_u24lambda_u2d0$iv.getConstraints();
        constraints.setX(ConstraintsKt.boundTo((XConstraint)switch (WhenMappings.$EnumSwitchMapping$1[position.ordinal()]) {
            case 1 -> new SiblingConstraint(padding, true);
            case 2 -> new SiblingConstraint(padding, false, 2, null);
            case 3,  4 -> new CenterConstraint();
            default -> throw new NoWhenBranchMatchedException();
        }, $this$bindEssentialTooltip));
        final UIConstraints uiConstraints = $this$bindEssentialTooltip_u24lambda_u2d11;
        uiConstraints.setY(ConstraintsKt.boundTo((YConstraint)switch (WhenMappings.$EnumSwitchMapping$1[position.ordinal()]) {
            case 1,  2 -> new CenterConstraint();
            case 3 -> new SiblingConstraint(padding, true);
            case 4 -> new SiblingConstraint(padding, false, 2, null);
            default -> throw new NoWhenBranchMatchedException();
        }, $this$bindEssentialTooltip));
        final EssentialTooltip tooltip = (EssentialTooltip)$this$constrain_u24lambda_u2d0$iv;
        tooltip.bindLine(tooltipContent, wrapAtWidth, configure);
        tooltip.bindVisibility(display);
        return $this$bindEssentialTooltip;
    }
    
    public static /* synthetic */ UIComponent bindEssentialTooltip$default$5d648aca(final UIComponent $this$bindEssentialTooltip, final State display, final State tooltipContent, EssentialTooltip.Position below, float padding, Float wrapAtWidth, Function1 configure, final int n) {
        if ((n & 0x4) != 0x0) {
            below = EssentialTooltip.Position.BELOW;
        }
        if ((n & 0x8) != 0x0) {
            padding = 5.0f;
        }
        if ((n & 0x10) != 0x0) {
            wrapAtWidth = null;
        }
        if ((n & 0x20) != 0x0) {
            configure = (Function1)ExtensionsKt$bindEssentialTooltip.ExtensionsKt$bindEssentialTooltip$1.INSTANCE;
        }
        return bindEssentialTooltip($this$bindEssentialTooltip, display, tooltipContent, below, padding, wrapAtWidth, (Function1<? super UIText, Unit>)configure);
    }
    
    @JvmOverloads
    @NotNull
    public static final <T extends UIComponent> T bindHoverEssentialTooltip(@NotNull final T $this$bindHoverEssentialTooltip, @NotNull final State<String> tooltipContent, @NotNull final EssentialTooltip.Position position, final float padding, @Nullable final Float wrapAtWidth, @NotNull final Function1<? super UIText, Unit> configure) {
        Intrinsics.checkNotNullParameter((Object)$this$bindHoverEssentialTooltip, "<this>");
        Intrinsics.checkNotNullParameter((Object)tooltipContent, "tooltipContent");
        Intrinsics.checkNotNullParameter((Object)position, "position");
        Intrinsics.checkNotNullParameter((Object)configure, "configure");
        return bindEssentialTooltip($this$bindHoverEssentialTooltip, hoveredState$default$56721d26($this$bindHoverEssentialTooltip, false, false, 3), tooltipContent, position, padding, wrapAtWidth, configure);
    }
    
    public static /* synthetic */ UIComponent bindHoverEssentialTooltip$default$3fdaea44(final UIComponent $this$bindHoverEssentialTooltip, final State tooltipContent, EssentialTooltip.Position below, float padding, Float wrapAtWidth, Function1 configure, final int n) {
        if ((n & 0x2) != 0x0) {
            below = EssentialTooltip.Position.BELOW;
        }
        if ((n & 0x4) != 0x0) {
            padding = 5.0f;
        }
        if ((n & 0x8) != 0x0) {
            wrapAtWidth = null;
        }
        if ((n & 0x10) != 0x0) {
            configure = (Function1)ExtensionsKt$bindHoverEssentialTooltip.ExtensionsKt$bindHoverEssentialTooltip$1.INSTANCE;
        }
        return bindHoverEssentialTooltip($this$bindHoverEssentialTooltip, tooltipContent, below, padding, wrapAtWidth, (Function1<? super UIText, Unit>)configure);
    }
    
    @NotNull
    public static final <T extends UIComponent> T centered(@NotNull final T $this$centered) {
        Intrinsics.checkNotNullParameter((Object)$this$centered, "<this>");
        final UIComponent $this$centered_u24lambda_u2d14 = $this$centered;
        final UIComponent $this$constrain_u24lambda_u2d0$iv;
        final UIComponent $this$constrain$iv = $this$constrain_u24lambda_u2d0$iv = $this$centered_u24lambda_u2d14;
        final UIConstraints $this$centered_u24lambda_u2d14_u24lambda_u2d13 = $this$constrain_u24lambda_u2d0$iv.getConstraints();
        $this$centered_u24lambda_u2d14_u24lambda_u2d13.setX(new CenterConstraint());
        $this$centered_u24lambda_u2d14_u24lambda_u2d13.setY(new CenterConstraint());
        return $this$centered;
    }
    
    @Nullable
    public static final <T extends UIComponent> T findChildOfTypeOrNull(@NotNull final UIComponent $this$findChildOfTypeOrNull, @NotNull final Class<T> type, final boolean recursive) {
        Intrinsics.checkNotNullParameter((Object)$this$findChildOfTypeOrNull, "<this>");
        Intrinsics.checkNotNullParameter((Object)type, "type");
        for (final UIComponent child : $this$findChildOfTypeOrNull.getChildren()) {
            if (type.isInstance(child)) {
                return (T)type.cast(child);
            }
            if (!recursive) {
                continue;
            }
            Intrinsics.checkNotNullExpressionValue((Object)child, "child");
            final UIComponent childOfTypeOrNull = findChildOfTypeOrNull(child, (Class<UIComponent>)type, true);
            if (childOfTypeOrNull == null) {
                continue;
            }
            return (T)childOfTypeOrNull;
        }
        return null;
    }
    
    @NotNull
    public static final <T extends UIComponent> List<T> findChildrenOfType$2f5ee413(@NotNull final UIComponent $this$findChildrenOfType, @NotNull final Class<T> type) {
        Intrinsics.checkNotNullParameter((Object)$this$findChildrenOfType, "<this>");
        Intrinsics.checkNotNullParameter((Object)type, "type");
        final List found = new ArrayList();
        for (final UIComponent child : $this$findChildrenOfType.getChildren()) {
            if (type.isInstance(child)) {
                final List list = found;
                final Object cast = type.cast(child);
                Intrinsics.checkNotNullExpressionValue(cast, "type.cast(child)");
                list.add(cast);
            }
            final List list2 = found;
            Intrinsics.checkNotNullExpressionValue((Object)child, "child");
            list2.addAll(findChildrenOfType$2f5ee413(child, (Class<UIComponent>)type));
        }
        return found;
    }
    
    @Nullable
    public static final <T extends UIComponent> T findParentOfTypeOrNull(@NotNull final UIComponent $this$findParentOfTypeOrNull, @NotNull final Class<T> type) {
        Intrinsics.checkNotNullParameter((Object)$this$findParentOfTypeOrNull, "<this>");
        Intrinsics.checkNotNullParameter((Object)type, "type");
        return (T)(type.isInstance($this$findParentOfTypeOrNull.getParent()) ? ((T)type.cast($this$findParentOfTypeOrNull.getParent())) : (Intrinsics.areEqual((Object)$this$findParentOfTypeOrNull.getParent(), (Object)$this$findParentOfTypeOrNull) ? null : findParentOfTypeOrNull($this$findParentOfTypeOrNull.getParent(), (Class<UIComponent>)type)));
    }
    
    @NotNull
    public static final GradientComponent createScrollGradient$5f4d2a89(@NotNull final ScrollComponent $this$createScrollGradient, final boolean top, @NotNull final HeightConstraint heightSize, @NotNull final Color color) {
        Intrinsics.checkNotNullParameter((Object)$this$createScrollGradient, "<this>");
        Intrinsics.checkNotNullParameter((Object)heightSize, "heightSize");
        Intrinsics.checkNotNullParameter((Object)color, "color");
        final BasicState percentState = new BasicState((T)0.0f);
        $this$createScrollGradient.addScrollAdjustEvent(false, (Function2<? super Float, ? super Float, Unit>)new ExtensionsKt$createScrollGradient.ExtensionsKt$createScrollGradient$1(percentState));
        return createGradient((UIComponent)$this$createScrollGradient, top, heightSize, color, 204, percentState, $this$createScrollGradient.getParent());
    }
    
    public static /* synthetic */ GradientComponent createScrollGradient$default$4f856f78$17e59214(final ScrollComponent $this$createScrollGradient, final boolean top, final HeightConstraint heightSize) {
        return createScrollGradient$5f4d2a89($this$createScrollGradient, top, heightSize, EssentialPalette.GUI_BACKGROUND);
    }
    
    @NotNull
    public static final <T extends UIComponent> GradientComponent createGradient(@NotNull final T $this$createGradient, final boolean top, @NotNull final HeightConstraint heightSize, @NotNull final Color color, final int maxGradient, @NotNull final State<Float> percentState, @NotNull final UIComponent parent) {
        Intrinsics.checkNotNullParameter((Object)$this$createGradient, "<this>");
        Intrinsics.checkNotNullParameter((Object)heightSize, "heightSize");
        Intrinsics.checkNotNullParameter((Object)color, "color");
        Intrinsics.checkNotNullParameter((Object)percentState, "percentState");
        Intrinsics.checkNotNullParameter((Object)parent, "parent");
        final UIComponent $this$constrain_u24lambda_u2d0$iv;
        final UIComponent $this$constrain$iv = $this$constrain_u24lambda_u2d0$iv = new ExtensionsKt$createGradient$gradient.ExtensionsKt$createGradient$gradient$1(gg.essential.elementa.utils.ExtensionsKt.withAlpha(color, 0), gg.essential.elementa.utils.ExtensionsKt.withAlpha(color, 0)).bindStartColor((State)percentState.map((kotlin.jvm.functions.Function1<? super Float, ?>)new ExtensionsKt$createGradient$gradient.ExtensionsKt$createGradient$gradient$2(top, color, 204))).bindEndColor((State<Color>)percentState.map((kotlin.jvm.functions.Function1<? super Float, ?>)new ExtensionsKt$createGradient$gradient.ExtensionsKt$createGradient$gradient$3(top, color, 204)));
        final UIConstraints $this$createGradient_u24lambda_u2d15 = $this$constrain_u24lambda_u2d0$iv.getConstraints();
        $this$createGradient_u24lambda_u2d15.setY(ConstraintsKt.boundTo((YConstraint)UtilitiesKt.pixels$default(0, !top, false, 2, null), $this$createGradient));
        $this$createGradient_u24lambda_u2d15.setX(ConstraintsKt.boundTo((XConstraint)new CopyConstraintFloat(false, 1, null), $this$createGradient));
        $this$createGradient_u24lambda_u2d15.setWidth(ConstraintsKt.boundTo((WidthConstraint)new CopyConstraintFloat(false, 1, null), $this$createGradient));
        $this$createGradient_u24lambda_u2d15.setHeight(heightSize);
        final GradientComponent gradient = (GradientComponent)$this$constrain_u24lambda_u2d0$iv;
        gradient.setParent($this$createGradient);
        $this$createGradient.getChildren().add(gradient);
        return gradient;
    }
    
    public static /* synthetic */ GradientComponent createGradient$default$e735f6c$17d75708(final UIComponent $this$createGradient, final boolean top, final HeightConstraint heightSize, final State percentState, final UIComponent parent) {
        return createGradient($this$createGradient, top, heightSize, EssentialPalette.GUI_BACKGROUND, 204, percentState, parent);
    }
    
    @NotNull
    public static final ScrollComponent scrollGradient(@NotNull final ScrollComponent $this$scrollGradient, @NotNull final HeightConstraint heightSize) {
        Intrinsics.checkNotNullParameter((Object)$this$scrollGradient, "<this>");
        Intrinsics.checkNotNullParameter((Object)heightSize, "heightSize");
        final ScrollComponent $this$scrollGradient_u24lambda_u2d16 = $this$scrollGradient;
        final GradientComponent topGradient = createScrollGradient$default$4f856f78$17e59214($this$scrollGradient_u24lambda_u2d16, true, heightSize);
        createScrollGradient$default$4f856f78$17e59214($this$scrollGradient_u24lambda_u2d16, false, ConstraintsKt.boundTo((HeightConstraint)UtilitiesKt.getPercent(100), topGradient));
        return $this$scrollGradient;
    }
    
    @NotNull
    public static final UImage read(@NotNull final UImage.Companion $this$read, @NotNull final InputStream stream) {
        Intrinsics.checkNotNullParameter((Object)$this$read, "<this>");
        Intrinsics.checkNotNullParameter((Object)stream, "stream");
        final NativeImage read = NativeImage.read(stream);
        Intrinsics.checkNotNullExpressionValue((Object)read, "read(stream)");
        return new UImage(read);
    }
    
    @NotNull
    public static final UImage read(@NotNull final UImage.Companion $this$read, @NotNull final byte[] bytes) {
        Intrinsics.checkNotNullParameter((Object)$this$read, "<this>");
        Intrinsics.checkNotNullParameter((Object)bytes, "bytes");
        return read($this$read, new ByteArrayInputStream(bytes));
    }
    
    public static final <T> CompletableFuture<Void> thenAcceptOnMainThread(@NotNull final CompletableFuture<T> $this$thenAcceptOnMainThread, @NotNull final Function1<? super T, Unit> callback) {
        Intrinsics.checkNotNullParameter((Object)$this$thenAcceptOnMainThread, "<this>");
        Intrinsics.checkNotNullParameter((Object)callback, "callback");
        return $this$thenAcceptOnMainThread.thenAcceptAsync(ExtensionsKt::thenAcceptOnMainThread$lambda-17, getExecutor(UMinecraft.getMinecraft()));
    }
    
    public static final <E> void onItemRemoved(@NotNull final ObservableList<E> $this$onItemRemoved, @NotNull final Function1<? super E, Unit> callback) {
        Intrinsics.checkNotNullParameter((Object)$this$onItemRemoved, "<this>");
        Intrinsics.checkNotNullParameter((Object)callback, "callback");
        $this$onItemRemoved.addObserver(ExtensionsKt::onItemRemoved$lambda-18);
    }
    
    public static final <E> void onItemAdded(@NotNull final ObservableList<E> $this$onItemAdded, @NotNull final Function1<? super E, Unit> callback) {
        Intrinsics.checkNotNullParameter((Object)$this$onItemAdded, "<this>");
        Intrinsics.checkNotNullParameter((Object)callback, "callback");
        $this$onItemAdded.addObserver(ExtensionsKt::onItemAdded$lambda-19);
    }
    
    @NotNull
    public static final Pair<UIContainer, Function0<Unit>> createRightDividerScroller(@NotNull final EssentialGUI $this$createRightDividerScroller, @NotNull final State<Boolean> display, @NotNull final UIComponent xPositionAndWidth, @NotNull final UIComponent parent, @NotNull final UIComponent yPositionAndHeight, final boolean initializeToBottom) {
        Intrinsics.checkNotNullParameter((Object)$this$createRightDividerScroller, "<this>");
        Intrinsics.checkNotNullParameter((Object)display, "display");
        Intrinsics.checkNotNullParameter((Object)xPositionAndWidth, "xPositionAndWidth");
        Intrinsics.checkNotNullParameter((Object)parent, "parent");
        Intrinsics.checkNotNullParameter((Object)yPositionAndHeight, "yPositionAndHeight");
        return createScrollbarRelativeTo(display, xPositionAndWidth, parent, yPositionAndHeight, initializeToBottom);
    }
    
    public static /* synthetic */ Pair createRightDividerScroller$default$6f501d84(final EssentialGUI $this$createRightDividerScroller, final State display, UIComponent xPositionAndWidth, UIComponent parent, UIComponent yPositionAndHeight, boolean initializeToBottom, final int n) {
        if ((n & 0x2) != 0x0) {
            xPositionAndWidth = $this$createRightDividerScroller.getRightDivider();
        }
        if ((n & 0x4) != 0x0) {
            parent = $this$createRightDividerScroller.getWindow();
        }
        if ((n & 0x8) != 0x0) {
            yPositionAndHeight = $this$createRightDividerScroller.getContent();
        }
        if ((n & 0x10) != 0x0) {
            initializeToBottom = false;
        }
        return createRightDividerScroller($this$createRightDividerScroller, display, xPositionAndWidth, parent, yPositionAndHeight, initializeToBottom);
    }
    
    @NotNull
    public static final Pair<UIContainer, Function0<Unit>> createScrollbarRelativeTo(@NotNull final State<Boolean> display, @NotNull final UIComponent xPositionAndWidth, @NotNull final UIComponent parent, @NotNull final UIComponent yPositionAndHeight, final boolean initializeToBottom) {
        Intrinsics.checkNotNullParameter((Object)display, "display");
        Intrinsics.checkNotNullParameter((Object)xPositionAndWidth, "xPositionAndWidth");
        Intrinsics.checkNotNullParameter((Object)parent, "parent");
        Intrinsics.checkNotNullParameter((Object)yPositionAndHeight, "yPositionAndHeight");
        final UIComponent $this$constrain_u24lambda_u2d0$iv;
        final UIComponent $this$constrain$iv = $this$constrain_u24lambda_u2d0$iv = new UIContainer();
        final UIConstraints $this$createScrollbarRelativeTo_u24lambda_u2d20 = $this$constrain_u24lambda_u2d0$iv.getConstraints();
        $this$createScrollbarRelativeTo_u24lambda_u2d20.setY(ConstraintsKt.boundTo((YConstraint)new CenterConstraint(), yPositionAndHeight));
        $this$createScrollbarRelativeTo_u24lambda_u2d20.setX(ConstraintsKt.boundTo((XConstraint)new CenterConstraint(), xPositionAndWidth));
        $this$createScrollbarRelativeTo_u24lambda_u2d20.setWidth(new ChildBasedSizeConstraint(0.0f, 1, null));
        $this$createScrollbarRelativeTo_u24lambda_u2d20.setHeight(ConstraintsKt.boundTo((HeightConstraint)UtilitiesKt.getPercent(100), yPositionAndHeight));
        final ReadWriteProperty scrollContainer$delegate = ComponentsKt.provideDelegate((UIComponent)ComponentsKt.childOf($this$constrain_u24lambda_u2d0$iv, parent), null, ExtensionsKt.$$delegatedProperties[0]);
        final UIComponent $this$constrain_u24lambda_u2d0$iv2;
        final UIComponent $this$constrain$iv2 = $this$constrain_u24lambda_u2d0$iv2 = new UIContainer();
        final UIConstraints $this$createScrollbarRelativeTo_u24lambda_u2d21 = $this$constrain_u24lambda_u2d0$iv2.getConstraints();
        $this$createScrollbarRelativeTo_u24lambda_u2d21.setY(UtilitiesKt.pixels$default(0, initializeToBottom, false, 2, null));
        $this$createScrollbarRelativeTo_u24lambda_u2d21.setX(new CenterConstraint());
        $this$createScrollbarRelativeTo_u24lambda_u2d21.setWidth(ConstraintsKt.plus(new ChildBasedSizeConstraint(0.0f, 1, null), UtilitiesKt.getPixels(6)));
        final ReadWriteProperty scrollbar$delegate = ComponentsKt.provideDelegate(StateExtensionsKt.bindParent$default$6fcd5b6b($this$constrain_u24lambda_u2d0$iv2, createScrollbarRelativeTo$lambda-21((ReadWriteProperty<Object, UIContainer>)scrollContainer$delegate), display, false, null, 12), null, ExtensionsKt.$$delegatedProperties[1]);
        final UIComponent $this$constrain_u24lambda_u2d0$iv3;
        final UIComponent $this$constrain$iv3 = $this$constrain_u24lambda_u2d0$iv3 = new UIBlock(EssentialPalette.LIGHT_SCROLLBAR);
        final UIConstraints $this$createScrollbarRelativeTo_u24lambda_u2d22 = $this$constrain_u24lambda_u2d0$iv3.getConstraints();
        $this$createScrollbarRelativeTo_u24lambda_u2d22.setX(new CenterConstraint());
        $this$createScrollbarRelativeTo_u24lambda_u2d22.setWidth(ConstraintsKt.boundTo((WidthConstraint)UtilitiesKt.getPercent(100), xPositionAndWidth));
        $this$createScrollbarRelativeTo_u24lambda_u2d22.setHeight(UtilitiesKt.getPercent(100));
        ComponentsKt.provideDelegate((UIComponent)ComponentsKt.childOf($this$constrain_u24lambda_u2d0$iv3, createScrollbarRelativeTo$lambda-23((ReadWriteProperty<Object, UIContainer>)scrollbar$delegate)), null, ExtensionsKt.$$delegatedProperties[2]);
        return (Pair<UIContainer, Function0<Unit>>)TuplesKt.to((Object)createScrollbarRelativeTo$lambda-23((ReadWriteProperty<Object, UIContainer>)scrollbar$delegate), (Object)new ExtensionsKt$createScrollbarRelativeTo.ExtensionsKt$createScrollbarRelativeTo$1(parent, scrollContainer$delegate));
    }
    
    @NotNull
    public static final MasterConstraint times(@NotNull final SuperConstraint<Float> $this$times, @NotNull final SuperConstraint<Float> other) {
        Intrinsics.checkNotNullParameter((Object)$this$times, "<this>");
        Intrinsics.checkNotNullParameter((Object)other, "other");
        return new MultiplicativeConstraint($this$times, other);
    }
    
    @NotNull
    public static final SizeConstraint div(@NotNull final SuperConstraint<Float> $this$div, @NotNull final SuperConstraint<Float> other) {
        Intrinsics.checkNotNullParameter((Object)$this$div, "<this>");
        Intrinsics.checkNotNullParameter((Object)other, "other");
        return (SizeConstraint)new DivisionConstraint((SuperConstraint)$this$div, (SuperConstraint)other);
    }
    
    @NotNull
    public static final gg.essential.model.util.UMatrixStack toCommon(@NotNull final UMatrixStack $this$toCommon) {
        Intrinsics.checkNotNullParameter((Object)$this$toCommon, "<this>");
        return new gg.essential.model.util.UMatrixStack(((Matrix4fExt)$this$toCommon.peek().getModel()).getKotgl(), ((Matrix3fExt)$this$toCommon.peek().getNormal()).getKotgl());
    }
    
    public static final boolean isInComponentTree(@NotNull final UIComponent $this$isInComponentTree) {
        Intrinsics.checkNotNullParameter((Object)$this$isInComponentTree, "<this>");
        return $this$isInComponentTree instanceof Window || ($this$isInComponentTree.getHasParent() && $this$isInComponentTree.getParent().getChildren().contains($this$isInComponentTree) && isInComponentTree($this$isInComponentTree.getParent()));
    }
    
    @NotNull
    public static final Path getWorldDirectory(@NotNull final IntegratedServer $this$worldDirectory) {
        Intrinsics.checkNotNullParameter((Object)$this$worldDirectory, "<this>");
        final Path method_27050 = $this$worldDirectory.method_27050(WorldSavePath.ROOT);
        Intrinsics.checkNotNullExpressionValue((Object)method_27050, "this.getSavePath(WorldSavePath.ROOT)");
        return method_27050;
    }
    
    @NotNull
    public static final Path getWorldDirectory(@NotNull final LevelSummary $this$worldDirectory) {
        Intrinsics.checkNotNullParameter((Object)$this$worldDirectory, "<this>");
        final Path savesDirectory = UMinecraft.getMinecraft().getLevelStorage().getSavesDirectory();
        Intrinsics.checkNotNullExpressionValue((Object)savesDirectory, "getMinecraft().levelStorage.savesDirectory");
        final Path path = savesDirectory;
        final String name = $this$worldDirectory.getName();
        Intrinsics.checkNotNullExpressionValue((Object)name, "this.name");
        final Path resolve = path.resolve(name);
        Intrinsics.checkNotNullExpressionValue((Object)resolve, "this.resolve(other)");
        return resolve;
    }
    
    @Nullable
    public static final <T> T getLevelNbtValue(@NotNull final LevelSummary $this$getLevelNbtValue, @NotNull final Function1<? super NbtCompound, ? extends T> nbtAction) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc_w           "<this>"
        //     4: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     7: aload_1         /* nbtAction */
        //     8: ldc_w           "nbtAction"
        //    11: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    14: aload_0         /* $this$getLevelNbtValue */
        //    15: invokestatic    gg/essential/util/ExtensionsKt.getWorldDirectory:(Lnet/minecraft/world/level/storage/LevelSummary;)Ljava/nio/file/Path;
        //    18: ldc_w           "level.dat"
        //    21: invokeinterface java/nio/file/Path.resolve:(Ljava/lang/String;)Ljava/nio/file/Path;
        //    26: astore_2        /* file */
        //    27: aload_2         /* file */
        //    28: ldc_w           "file"
        //    31: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //    34: aload_2         /* file */
        //    35: iconst_0       
        //    36: anewarray       Ljava/nio/file/LinkOption;
        //    39: iconst_0       
        //    40: invokestatic    java/util/Arrays.copyOf:([Ljava/lang/Object;I)[Ljava/lang/Object;
        //    43: checkcast       [Ljava/nio/file/LinkOption;
        //    46: invokestatic    java/nio/file/Files.exists:(Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Z
        //    49: ifeq            161
        //    52: aload_2         /* file */
        //    53: iconst_0       
        //    54: anewarray       Ljava/nio/file/OpenOption;
        //    57: iconst_0       
        //    58: invokestatic    java/util/Arrays.copyOf:([Ljava/lang/Object;I)[Ljava/lang/Object;
        //    61: checkcast       [Ljava/nio/file/OpenOption;
        //    64: invokestatic    java/nio/file/Files.newInputStream:(Ljava/nio/file/Path;[Ljava/nio/file/OpenOption;)Ljava/io/InputStream;
        //    67: dup            
        //    68: ldc_w           "newInputStream(this, *options)"
        //    71: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //    74: checkcast       Ljava/io/Closeable;
        //    77: astore_3       
        //    78: aconst_null    
        //    79: astore          4
        //    81: aload_3        
        //    82: checkcast       Ljava/io/InputStream;
        //    85: astore          it
        //    87: aload_1         /* nbtAction */
        //    88: aload           it
        //    90: invokestatic    net/minecraft/nbt/NbtIo.readCompressed:(Ljava/io/InputStream;)Lnet/minecraft/nbt/NbtCompound;
        //    93: dup            
        //    94: ldc_w           "readCompressed(it)"
        //    97: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   100: invokeinterface kotlin/jvm/functions/Function1.invoke:(Ljava/lang/Object;)Ljava/lang/Object;
        //   105: astore          null
        //   107: aload_3        
        //   108: aload           4
        //   110: invokestatic    kotlin/io/CloseableKt.closeFinally:(Ljava/io/Closeable;Ljava/lang/Throwable;)V
        //   113: aload           5
        //   115: goto            138
        //   118: astore          5
        //   120: aload           5
        //   122: astore          4
        //   124: aload           5
        //   126: athrow         
        //   127: astore          5
        //   129: aload_3        
        //   130: aload           4
        //   132: invokestatic    kotlin/io/CloseableKt.closeFinally:(Ljava/io/Closeable;Ljava/lang/Throwable;)V
        //   135: aload           5
        //   137: athrow         
        //   138: areturn        
        //   139: astore_3        /* exception */
        //   140: getstatic       gg/essential/Essential.logger:Lorg/apache/logging/log4j/Logger;
        //   143: aload_0         /* $this$getLevelNbtValue */
        //   144: invokevirtual   net/minecraft/world/level/storage/LevelSummary.getDisplayName:()Ljava/lang/String;
        //   147: invokedynamic   BootstrapMethod #7, makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
        //   152: aload_3         /* exception */
        //   153: checkcast       Ljava/lang/Throwable;
        //   156: invokeinterface org/apache/logging/log4j/Logger.warn:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   161: aconst_null    
        //   162: areturn        
        //    Signature:
        //  <T:Ljava/lang/Object;>(Lnet/minecraft/world/level/storage/LevelSummary;Lkotlin/jvm/functions/Function1<-Lnet/minecraft/nbt/NbtCompound;+TT;>;)TT;
        //    MethodParameters:
        //  Name                    Flags  
        //  ----------------------  -----
        //  $this$getLevelNbtValue  
        //  nbtAction               
        //    StackMapTable: 00 05 FF 00 76 00 05 07 05 BB 07 03 A7 07 03 41 07 05 E3 05 00 01 07 05 C4 FF 00 08 00 05 07 05 BB 07 03 A7 07 03 41 07 05 E3 07 05 C4 00 01 07 05 C4 FF 00 0A 00 06 07 05 BB 07 03 A7 07 03 41 07 05 E3 05 07 00 04 00 01 07 00 04 FF 00 00 00 03 07 05 BB 07 03 A7 07 03 41 00 01 07 05 C6 15
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  81     107    118    127    Ljava/lang/Throwable;
        //  81     107    127    138    Any
        //  118    127    127    138    Any
        //  52     139    139    161    Ljava/lang/Exception;
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public static final void holdScrollVerticalLocation(@NotNull final ScrollComponent $this$holdScrollVerticalLocation, @NotNull final UIComponent child, @NotNull final Function0<Unit> block) {
        Intrinsics.checkNotNullParameter((Object)$this$holdScrollVerticalLocation, "<this>");
        Intrinsics.checkNotNullParameter((Object)child, "child");
        Intrinsics.checkNotNullParameter((Object)block, "block");
        final float offset = $this$holdScrollVerticalLocation.getVerticalOffset();
        final float top = child.getTop();
        block.invoke();
        $this$holdScrollVerticalLocation.animationFrame();
        final float newTop = child.getTop();
        ScrollComponent.scrollTo$default($this$holdScrollVerticalLocation, 0.0f, offset - (newTop - top), false, 1, null);
    }
    
    public static final void scrollToCenterComponent$518015f5(@NotNull final ScrollComponent $this$scrollToCenterComponent, @NotNull final UIComponent component) {
        Intrinsics.checkNotNullParameter((Object)$this$scrollToCenterComponent, "<this>");
        Intrinsics.checkNotNullParameter((Object)component, "component");
        if (!isComponentInParentChain(component, $this$scrollToCenterComponent)) {
            throw new IllegalArgumentException("Component " + component.getComponentName() + " is not a child of " + $this$scrollToCenterComponent.getComponentName());
        }
        ScrollComponent.scrollTo$default($this$scrollToCenterComponent, 0.0f, $this$scrollToCenterComponent.getVerticalOffset() - (scrollToCenterComponent$center(component) - scrollToCenterComponent$center($this$scrollToCenterComponent)), true, 1, null);
    }
    
    @JvmOverloads
    public static final <T> CompletableFuture<T> logExceptions(@NotNull final CompletableFuture<T> $this$logExceptions) {
        Intrinsics.checkNotNullParameter((Object)$this$logExceptions, "<this>");
        return logExceptions$default$68026618$686f8a8c($this$logExceptions);
    }
    
    private static final List merge$lambda-7(final List $this_merge, final Void it) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc_w           "$this_merge"
        //     4: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     7: aload_0         /* $this_merge */
        //     8: checkcast       Ljava/lang/Iterable;
        //    11: astore_2        /* $this$map$iv */
        //    12: aload_2         /* $this$map$iv */
        //    13: astore_3       
        //    14: new             Ljava/util/ArrayList;
        //    17: dup            
        //    18: aload_2         /* $this$map$iv */
        //    19: bipush          10
        //    21: invokestatic    kotlin/collections/CollectionsKt.collectionSizeOrDefault:(Ljava/lang/Iterable;I)I
        //    24: invokespecial   java/util/ArrayList.<init>:(I)V
        //    27: checkcast       Ljava/util/Collection;
        //    30: astore          destination$iv$iv
        //    32: aload_3         /* $this$mapTo$iv$iv */
        //    33: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //    38: astore          5
        //    40: aload           5
        //    42: invokeinterface java/util/Iterator.hasNext:()Z
        //    47: ifeq            87
        //    50: aload           5
        //    52: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    57: astore          item$iv$iv
        //    59: aload           destination$iv$iv
        //    61: aload           item$iv$iv
        //    63: checkcast       Ljava/util/concurrent/CompletableFuture;
        //    66: astore          7
        //    68: astore          8
        //    70: aload           it
        //    72: invokevirtual   java/util/concurrent/CompletableFuture.join:()Ljava/lang/Object;
        //    75: aload           8
        //    77: swap           
        //    78: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //    83: pop            
        //    84: goto            40
        //    87: aload           destination$iv$iv
        //    89: checkcast       Ljava/util/List;
        //    92: areturn        
        //    MethodParameters:
        //  Name         Flags  
        //  -----------  -----
        //  $this_merge  
        //  it           
        //    StackMapTable: 00 02 FF 00 28 00 06 07 01 82 07 06 3C 07 01 38 07 01 38 07 02 1C 07 01 3E 00 00 2E
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private static final void logExceptions$lambda-8(final Logger $logger, final Object o, final Throwable e) {
        Intrinsics.checkNotNullParameter((Object)$logger, "$logger");
        if (e != null) {
            $logger.error("Unhandled error:", e);
        }
    }
    
    private static final boolean hoveredState$hitTestHovered(final UIComponent $this_hoveredState) {
        final float halfPixel = 0.5f / (float)UResolution.getScaleFactor();
        final float mouseX = (float)UMouse.Scaled.getX() + halfPixel;
        final float mouseY = (float)UMouse.Scaled.getY() + halfPixel;
        boolean b;
        if ($this_hoveredState.isPointInside(mouseX, mouseY)) {
            final Window window = Window.Companion.of($this_hoveredState);
            final UIComponent hoveredFloatingComponent = window.getHoveredFloatingComponent();
            UIComponent uiComponent;
            if (hoveredFloatingComponent == null || (uiComponent = hoveredFloatingComponent.hitTest(mouseX, mouseY)) == null) {
                uiComponent = window.hitTest(mouseX, mouseY);
            }
            final UIComponent hit = uiComponent;
            b = (isComponentInParentChain(hit, $this_hoveredState) || Intrinsics.areEqual((Object)hit, (Object)$this_hoveredState));
        }
        else {
            b = false;
        }
        return b;
    }
    
    private static final void thenAcceptOnMainThread$lambda-17(final Function1 $callback, final Object it) {
        Intrinsics.checkNotNullParameter((Object)$callback, "$callback");
        $callback.invoke(it);
    }
    
    private static final void onItemRemoved$lambda-18(final Function1 $callback, final Observable observable, final Object arg) {
        Intrinsics.checkNotNullParameter((Object)$callback, "$callback");
        if (arg instanceof final ObservableRemoveEvent observableRemoveEvent) {
            $callback.invoke(observableRemoveEvent.getElement().getValue());
        }
    }
    
    private static final void onItemAdded$lambda-19(final Function1 $callback, final Observable observable, final Object arg) {
        Intrinsics.checkNotNullParameter((Object)$callback, "$callback");
        if (arg instanceof final ObservableAddEvent observableAddEvent) {
            $callback.invoke(observableAddEvent.getElement().getValue());
        }
    }
    
    private static final UIContainer createScrollbarRelativeTo$lambda-21(final ReadWriteProperty<Object, UIContainer> $scrollContainer$delegate) {
        return (UIContainer)$scrollContainer$delegate.getValue((Object)null, (KProperty)ExtensionsKt.$$delegatedProperties[0]);
    }
    
    private static final UIContainer createScrollbarRelativeTo$lambda-23(final ReadWriteProperty<Object, UIContainer> $scrollbar$delegate) {
        return (UIContainer)$scrollbar$delegate.getValue((Object)null, (KProperty)ExtensionsKt.$$delegatedProperties[1]);
    }
    
    private static final float scrollToCenterComponent$center(final UIComponent $this$scrollToCenterComponent_u24center) {
        return ($this$scrollToCenterComponent_u24center.getTop() + $this$scrollToCenterComponent_u24center.getBottom()) / 2.0f;
    }
    
    public static final /* synthetic */ boolean access$hoveredState$hitTestHovered(final UIComponent $this_hoveredState) {
        return hoveredState$hitTestHovered($this_hoveredState);
    }
    
    public static final /* synthetic */ UIContainer access$createScrollbarRelativeTo$lambda-21(final ReadWriteProperty $scrollContainer$delegate) {
        return createScrollbarRelativeTo$lambda-21((ReadWriteProperty<Object, UIContainer>)$scrollContainer$delegate);
    }
    
    static {
        $$delegatedProperties = new KProperty[] { (KProperty)Reflection.property0((PropertyReference0)new PropertyReference0Impl((Class)ExtensionsKt.class, "scrollContainer", "<v#0>", 1)), (KProperty)Reflection.property0((PropertyReference0)new PropertyReference0Impl((Class)ExtensionsKt.class, "scrollbar", "<v#1>", 1)), (KProperty)Reflection.property0((PropertyReference0)new PropertyReference0Impl((Class)ExtensionsKt.class, "scrollbarBlock", "<v#2>", 1)) };
        BOT_UUID = UUID.fromString("cd899a14-de78-4de8-8d31-9d42fff31d7a");
        os$delegate = LazyKt.lazy((Function0)ExtensionsKt$os.ExtensionsKt$os$2.INSTANCE);
        timeMap = new TreeMap<Long, String>(MapsKt.mutableMapOf(new Pair[] { TuplesKt.to((Object)TimeUnit.DAYS.toMillis(7L), (Object)"w"), TuplesKt.to((Object)TimeUnit.DAYS.toMillis(1L), (Object)"d"), TuplesKt.to((Object)TimeUnit.HOURS.toMillis(1L), (Object)"h"), TuplesKt.to((Object)TimeUnit.MINUTES.toMillis(1L), (Object)"m"), TuplesKt.to((Object)TimeUnit.SECONDS.toMillis(1L), (Object)"s") }));
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48)
    public final synthetic class WhenMappings
    {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        
        static {
            final int[] $EnumSwitchMapping$2 = new int[OperatingSystem.values().length];
            $EnumSwitchMapping$2[OperatingSystem.WINDOWS.ordinal()] = 1;
            $EnumSwitchMapping$2[OperatingSystem.MACOS.ordinal()] = 2;
            $EnumSwitchMapping$0 = $EnumSwitchMapping$2;
            final int[] $EnumSwitchMapping$3 = new int[EssentialTooltip.Position.values().length];
            $EnumSwitchMapping$3[EssentialTooltip.Position.LEFT.ordinal()] = 1;
            $EnumSwitchMapping$3[EssentialTooltip.Position.RIGHT.ordinal()] = 2;
            $EnumSwitchMapping$3[EssentialTooltip.Position.ABOVE.ordinal()] = 3;
            $EnumSwitchMapping$3[EssentialTooltip.Position.BELOW.ordinal()] = 4;
            $EnumSwitchMapping$1 = $EnumSwitchMapping$3;
        }
    }
}
