package androidx.compose.ui.node;

import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.graphics.r;
import androidx.compose.ui.graphics.s;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.inputmethod.MutableRect;
import com.google.inputmethod.bi7;
import com.google.inputmethod.ci7;
import com.google.inputmethod.d58;
import com.google.inputmethod.dj7;
import com.google.inputmethod.dw8;
import com.google.inputmethod.efb;
import com.google.inputmethod.ew8;
import com.google.inputmethod.f43;
import com.google.inputmethod.fj7;
import com.google.inputmethod.fn6;
import com.google.inputmethod.fo6;
import com.google.inputmethod.g16;
import com.google.inputmethod.gba;
import com.google.inputmethod.h16;
import com.google.inputmethod.hd5;
import com.google.inputmethod.id5;
import com.google.inputmethod.ifb;
import com.google.inputmethod.j58;
import com.google.inputmethod.k33;
import com.google.inputmethod.kj7;
import com.google.inputmethod.kn6;
import com.google.inputmethod.li8;
import com.google.inputmethod.ln6;
import com.google.inputmethod.ltd;
import com.google.inputmethod.mq1;
import com.google.inputmethod.ni8;
import com.google.inputmethod.oi8;
import com.google.inputmethod.q09;
import com.google.inputmethod.q16;
import com.google.inputmethod.r16;
import com.google.inputmethod.r58;
import com.google.inputmethod.rn8;
import com.google.inputmethod.seb;
import com.google.inputmethod.tq4;
import com.google.inputmethod.tsb;
import com.google.inputmethod.ua7;
import com.google.inputmethod.uc;
import com.google.inputmethod.w41;
import com.google.inputmethod.wc;
import com.google.inputmethod.x19;
import com.google.inputmethod.xkb;
import com.google.inputmethod.xl8;
import com.google.inputmethod.y23;
import com.google.inputmethod.yg3;
import com.google.inputmethod.zh7;
import com.google.inputmethod.zw5;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000¢\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\b!\u0018\u0000 \u0083\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0004Ê\u0002Ë\u0002B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0010\u001a\u00020\t2\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J?\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0014\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00162\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010!\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010 \u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\b!\u0010\"J\u0019\u0010$\u001a\u00020\u00182\b\b\u0002\u0010#\u001a\u00020\tH\u0002¢\u0006\u0004\b$\u0010%J=\u0010/\u001a\u00020\u0018*\u0004\u0018\u00010\u000b2\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020\tH\u0002¢\u0006\u0004\b/\u00100JM\u00103\u001a\u00020\u0018*\u0004\u0018\u00010\u000b2\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020\t2\u0006\u00101\u001a\u00020\u00142\u0006\u00102\u001a\u00020\tH\u0002¢\u0006\u0004\b3\u00104JE\u00105\u001a\u00020\u0018*\u0004\u0018\u00010\u000b2\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020\t2\u0006\u00101\u001a\u00020\u0014H\u0002¢\u0006\u0004\b5\u00106JE\u00107\u001a\u00020\u0018*\u0004\u0018\u00010\u000b2\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020\t2\u0006\u00101\u001a\u00020\u0014H\u0002¢\u0006\u0004\b7\u00106J%\u00108\u001a\u00020\t*\u0004\u0018\u00010\u000b2\u0006\u0010)\u001a\u00020(2\u0006\u0010-\u001a\u00020,H\u0002¢\u0006\u0004\b8\u00109J\u0013\u0010:\u001a\u00020\u0000*\u00020\u0003H\u0002¢\u0006\u0004\b:\u0010;J\u001f\u0010?\u001a\u00020\u00182\u0006\u0010<\u001a\u00020\u00002\u0006\u0010>\u001a\u00020=H\u0002¢\u0006\u0004\b?\u0010@J\u001f\u0010A\u001a\u00020\u00182\u0006\u0010<\u001a\u00020\u00002\u0006\u0010>\u001a\u00020=H\u0002¢\u0006\u0004\bA\u0010@J'\u0010D\u001a\u00020(2\u0006\u0010<\u001a\u00020\u00002\u0006\u0010B\u001a\u00020(2\u0006\u0010C\u001a\u00020\tH\u0002¢\u0006\u0004\bD\u0010EJ'\u0010I\u001a\u00020\u00182\u0006\u0010<\u001a\u00020\u00002\u0006\u0010G\u001a\u00020F2\u0006\u0010H\u001a\u00020\tH\u0002¢\u0006\u0004\bI\u0010JJ\u001f\u0010L\u001a\u00020\u00182\u0006\u0010K\u001a\u00020F2\u0006\u0010H\u001a\u00020\tH\u0002¢\u0006\u0004\bL\u0010MJ\u0017\u0010N\u001a\u00020(2\u0006\u0010)\u001a\u00020(H\u0002¢\u0006\u0004\bN\u0010OJ\u001b\u0010P\u001a\u0004\u0018\u00010\u000b2\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u000e¢\u0006\u0004\bP\u0010QJ\r\u0010R\u001a\u00020\t¢\u0006\u0004\bR\u0010SJ\u000f\u0010T\u001a\u00020\u0018H\u0010¢\u0006\u0004\bT\u0010UJ\u000f\u0010V\u001a\u00020\u0018H&¢\u0006\u0004\bV\u0010UJ\u001f\u0010Z\u001a\u00020\u00182\u0006\u0010X\u001a\u00020W2\u0006\u0010Y\u001a\u00020WH\u0014¢\u0006\u0004\bZ\u0010[J\u000f\u0010\\\u001a\u00020\u0018H\u0000¢\u0006\u0004\b\\\u0010UJ\r\u0010]\u001a\u00020\u0018¢\u0006\u0004\b]\u0010UJ\r\u0010^\u001a\u00020\u0018¢\u0006\u0004\b^\u0010UJ5\u0010_\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0014\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0016H\u0014¢\u0006\u0004\b_\u0010`J'\u0010b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010a\u001a\u00020\u001aH\u0014¢\u0006\u0004\bb\u0010cJ\r\u0010d\u001a\u00020\u0018¢\u0006\u0004\bd\u0010UJ=\u0010e\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0014\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00162\b\u0010a\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\be\u0010\u001dJ\u001f\u0010f\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010 \u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\bf\u0010\"J!\u0010g\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010 \u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\bg\u0010\"J\r\u0010h\u001a\u00020\u0018¢\u0006\u0004\bh\u0010UJ-\u0010j\u001a\u00020\u00182\u0014\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00162\b\b\u0002\u0010i\u001a\u00020\t¢\u0006\u0004\bj\u0010kJ5\u0010l\u001a\u00020\u00182\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020\t¢\u0006\u0004\bl\u0010mJ7\u0010n\u001a\u00020\u00182\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020\tH\u0016¢\u0006\u0004\bn\u0010mJ\r\u0010p\u001a\u00020o¢\u0006\u0004\bp\u0010qJ\u0017\u0010s\u001a\u00020(2\u0006\u0010r\u001a\u00020(H\u0016¢\u0006\u0004\bs\u0010OJ\u0017\u0010u\u001a\u00020(2\u0006\u0010t\u001a\u00020(H\u0016¢\u0006\u0004\bu\u0010OJ\u0017\u0010w\u001a\u00020(2\u0006\u0010v\u001a\u00020(H\u0016¢\u0006\u0004\bw\u0010OJ\u0017\u0010x\u001a\u00020(2\u0006\u0010t\u001a\u00020(H\u0016¢\u0006\u0004\bx\u0010OJ\u001f\u0010{\u001a\u00020(2\u0006\u0010y\u001a\u00020\u00032\u0006\u0010z\u001a\u00020(H\u0016¢\u0006\u0004\b{\u0010|J'\u0010}\u001a\u00020(2\u0006\u0010y\u001a\u00020\u00032\u0006\u0010z\u001a\u00020(2\u0006\u0010C\u001a\u00020\tH\u0016¢\u0006\u0004\b}\u0010~J \u0010\u007f\u001a\u00020\u00182\u0006\u0010y\u001a\u00020\u00032\u0006\u0010>\u001a\u00020=H\u0016¢\u0006\u0005\b\u007f\u0010\u0080\u0001J\u001a\u0010\u0081\u0001\u001a\u00020\u00182\u0006\u0010>\u001a\u00020=H\u0016¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001J\"\u0010\u0083\u0001\u001a\u00020o2\u0006\u0010y\u001a\u00020\u00032\u0006\u0010H\u001a\u00020\tH\u0016¢\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001J\u0019\u0010\u0085\u0001\u001a\u00020(2\u0006\u0010t\u001a\u00020(H\u0016¢\u0006\u0005\b\u0085\u0001\u0010OJ$\u0010\u0086\u0001\u001a\u00020(2\u0006\u0010\u0013\u001a\u00020(2\b\b\u0002\u0010C\u001a\u00020\tH\u0016¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001J$\u0010\u0088\u0001\u001a\u00020(2\u0006\u0010\u0013\u001a\u00020(2\b\b\u0002\u0010C\u001a\u00020\tH\u0016¢\u0006\u0006\b\u0088\u0001\u0010\u0087\u0001J$\u0010\u008b\u0001\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010\u008a\u0001\u001a\u00030\u0089\u0001H\u0004¢\u0006\u0006\b\u008b\u0001\u0010\u008c\u0001J\u000f\u0010\u008d\u0001\u001a\u00020\u0018¢\u0006\u0005\b\u008d\u0001\u0010UJ\u000f\u0010\u008e\u0001\u001a\u00020\u0018¢\u0006\u0005\b\u008e\u0001\u0010UJ-\u0010\u0090\u0001\u001a\u00020\u00182\u0006\u0010K\u001a\u00020F2\u0006\u0010H\u001a\u00020\t2\t\b\u0002\u0010\u008f\u0001\u001a\u00020\tH\u0000¢\u0006\u0006\b\u0090\u0001\u0010\u0091\u0001J\u001a\u0010\u0092\u0001\u001a\u00020\t2\u0006\u0010)\u001a\u00020(H\u0004¢\u0006\u0006\b\u0092\u0001\u0010\u0093\u0001J\u001a\u0010\u0094\u0001\u001a\u00020\t2\u0006\u0010)\u001a\u00020(H\u0004¢\u0006\u0006\b\u0094\u0001\u0010\u0093\u0001J\u0011\u0010\u0095\u0001\u001a\u00020\u0018H\u0016¢\u0006\u0005\b\u0095\u0001\u0010UJ\u0011\u0010\u0096\u0001\u001a\u00020\u0018H\u0016¢\u0006\u0005\b\u0096\u0001\u0010UJ\u001b\u0010\u0098\u0001\u001a\u00020\u00002\u0007\u0010\u0097\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0006\b\u0098\u0001\u0010\u0099\u0001J\u000f\u0010\u009a\u0001\u001a\u00020\t¢\u0006\u0005\b\u009a\u0001\u0010SJ\u001c\u0010\u009d\u0001\u001a\u00030\u009b\u00012\b\u0010\u009c\u0001\u001a\u00030\u009b\u0001H\u0004¢\u0006\u0005\b\u009d\u0001\u0010OJ%\u0010\u009f\u0001\u001a\u00020(2\u0007\u0010\u009e\u0001\u001a\u00020F2\b\u0010\u009c\u0001\u001a\u00030\u009b\u0001H\u0004¢\u0006\u0006\b\u009f\u0001\u0010 \u0001J$\u0010¡\u0001\u001a\u00020\u00142\u0006\u0010)\u001a\u00020(2\b\u0010\u009c\u0001\u001a\u00030\u009b\u0001H\u0004¢\u0006\u0006\b¡\u0001\u0010¢\u0001R\u001e\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b£\u0001\u0010¤\u0001\u001a\u0006\b¥\u0001\u0010¦\u0001R'\u0010«\u0001\u001a\u00020\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0006\b§\u0001\u0010¨\u0001\u001a\u0005\b©\u0001\u0010S\"\u0005\bª\u0001\u0010%R'\u0010¯\u0001\u001a\u00020\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0006\b¬\u0001\u0010¨\u0001\u001a\u0005\b\u00ad\u0001\u0010S\"\u0005\b®\u0001\u0010%R+\u0010¶\u0001\u001a\u0004\u0018\u00010\u00008\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b°\u0001\u0010±\u0001\u001a\u0006\b²\u0001\u0010³\u0001\"\u0006\b´\u0001\u0010µ\u0001R+\u0010º\u0001\u001a\u0004\u0018\u00010\u00008\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b·\u0001\u0010±\u0001\u001a\u0006\b¸\u0001\u0010³\u0001\"\u0006\b¹\u0001\u0010µ\u0001R\u0019\u0010¼\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b»\u0001\u0010¨\u0001R\u0019\u0010¾\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b½\u0001\u0010¨\u0001RE\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00162\u0015\u0010¿\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00168\u0004@BX\u0084\u000e¢\u0006\u0010\n\u0006\bÀ\u0001\u0010Á\u0001\u001a\u0006\bÂ\u0001\u0010Ã\u0001R\u001a\u0010Ç\u0001\u001a\u00030Ä\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÅ\u0001\u0010Æ\u0001R\u001a\u0010Ë\u0001\u001a\u00030È\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÉ\u0001\u0010Ê\u0001R\u0019\u0010Î\u0001\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÌ\u0001\u0010Í\u0001R\u001c\u0010Ò\u0001\u001a\u0005\u0018\u00010Ï\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÐ\u0001\u0010Ñ\u0001R#\u0010×\u0001\u001a\f\u0012\u0005\u0012\u00030Ô\u0001\u0018\u00010Ó\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÕ\u0001\u0010Ö\u0001R0\u0010\u0013\u001a\u00020\u00122\u0007\u0010¿\u0001\u001a\u00020\u00128\u0016@TX\u0096\u000e¢\u0006\u0017\n\u0005\bx\u0010Ø\u0001\u001a\u0006\bÙ\u0001\u0010Ú\u0001\"\u0006\bÛ\u0001\u0010Ü\u0001R1\u0010\u0015\u001a\u00020\u00142\u0007\u0010¿\u0001\u001a\u00020\u00148\u0006@DX\u0086\u000e¢\u0006\u0018\n\u0006\bÝ\u0001\u0010Í\u0001\u001a\u0006\bÞ\u0001\u0010ß\u0001\"\u0006\bà\u0001\u0010á\u0001R\u001b\u0010ã\u0001\u001a\u0004\u0018\u00010F8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÍ\u0001\u0010â\u0001R\u001c\u0010ç\u0001\u001a\u0005\u0018\u00010ä\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bå\u0001\u0010æ\u0001R*\u0010ï\u0001\u001a\u00030è\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bé\u0001\u0010ê\u0001\u001a\u0006\bë\u0001\u0010ì\u0001\"\u0006\bí\u0001\u0010î\u0001R'\u0010ó\u0001\u001a\u00020\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0006\bð\u0001\u0010¨\u0001\u001a\u0005\bñ\u0001\u0010S\"\u0005\bò\u0001\u0010%R'\u0010ö\u0001\u001a\u00020\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0006\bØ\u0001\u0010¨\u0001\u001a\u0005\bô\u0001\u0010S\"\u0005\bõ\u0001\u0010%R\u001b\u0010ù\u0001\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b÷\u0001\u0010ø\u0001R\u001b\u0010ü\u0001\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bú\u0001\u0010û\u0001R0\u0010\u0080\u0002\u001a\u0019\u0012\u0004\u0012\u00020\u001e\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0012\u0004\u0012\u00020\u0018\u0018\u00010ý\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bþ\u0001\u0010ÿ\u0001R\u001e\u0010\u0083\u0002\u001a\t\u0012\u0004\u0012\u00020\u00180\u0081\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0082\u0002R)\u0010\u0086\u0002\u001a\u00020\t2\u0007\u0010¿\u0001\u001a\u00020\t8\u0000@BX\u0080\u000e¢\u0006\u000f\n\u0006\b\u0084\u0002\u0010¨\u0001\u001a\u0005\b\u0085\u0002\u0010SR/\u0010a\u001a\u0005\u0018\u00010\u0087\u00022\n\u0010¿\u0001\u001a\u0005\u0018\u00010\u0087\u00028\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b\u0088\u0002\u0010\u0089\u0002\u001a\u0006\b\u008a\u0002\u0010\u008b\u0002R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b{\u0010ø\u0001R\u0018\u0010\u008f\u0002\u001a\u00030\u008c\u00028BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u008d\u0002\u0010\u008e\u0002R,\u0010\u0092\u0002\u001a\u0017\u0012\u0004\u0012\u00020\u001e\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0012\u0004\u0012\u00020\u00180ý\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0090\u0002\u0010\u0091\u0002R\u0017\u0010\u0095\u0002\u001a\u00020\u000b8&X¦\u0004¢\u0006\b\u001a\u0006\b\u0093\u0002\u0010\u0094\u0002R\u0018\u0010\u0098\u0002\u001a\u00030È\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0096\u0002\u0010\u0097\u0002R\u0017\u0010\u009a\u0002\u001a\u00020\u00148VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0099\u0002\u0010ß\u0001R\u0017\u0010\u009c\u0002\u001a\u00020\u00148VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u009b\u0002\u0010ß\u0001R\u0019\u0010\u009f\u0002\u001a\u0004\u0018\u00010\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u009d\u0002\u0010\u009e\u0002R\u0017\u0010¡\u0002\u001a\u00020\u00038VX\u0096\u0004¢\u0006\b\u001a\u0006\b»\u0001\u0010 \u0002R\u0016\u0010¢\u0002\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b°\u0001\u0010SR\u0015\u0010¥\u0002\u001a\u00030£\u00028F¢\u0006\b\u001a\u0006\b¤\u0002\u0010Ú\u0001R\u0018\u0010©\u0002\u001a\u00030¦\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\b§\u0002\u0010¨\u0002R\u0019\u0010«\u0002\u001a\u0004\u0018\u00010\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bª\u0002\u0010\u009e\u0002R\u0016\u0010\u00ad\u0002\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b¬\u0002\u0010SR\u0016\u0010¯\u0002\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b®\u0002\u0010SR,\u0010´\u0002\u001a\u00030Ï\u00012\b\u0010¿\u0001\u001a\u00030Ï\u00018P@PX\u0090\u000e¢\u0006\u0010\u001a\u0006\b°\u0002\u0010±\u0002\"\u0006\b²\u0002\u0010³\u0002R0\u0010º\u0002\u001a\u0005\u0018\u00010µ\u00022\n\u0010¿\u0001\u001a\u0005\u0018\u00010µ\u00028&@dX¦\u000e¢\u0006\u0010\u001a\u0006\b¶\u0002\u0010·\u0002\"\u0006\b¸\u0002\u0010¹\u0002R\u001a\u0010¾\u0002\u001a\u0005\u0018\u00010»\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\b¼\u0002\u0010½\u0002R\u0016\u0010¿\u0002\u001a\u0004\u0018\u00010\u00038F¢\u0006\b\u001a\u0006\bú\u0001\u0010 \u0002R\u0016\u0010À\u0002\u001a\u0004\u0018\u00010\u00038F¢\u0006\b\u001a\u0006\b¨\u0001\u0010 \u0002R\u0017\u0010Ã\u0002\u001a\u00020F8DX\u0084\u0004¢\u0006\b\u001a\u0006\bÁ\u0002\u0010Â\u0002R\u0018\u0010Æ\u0002\u001a\u00030Ä\u00028@X\u0080\u0004¢\u0006\b\u001a\u0006\bÅ\u0002\u0010Ú\u0001R\u0016\u0010È\u0002\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bÇ\u0002\u0010SR\u0015\u0010\u009c\u0001\u001a\u00030\u009b\u00018F¢\u0006\b\u001a\u0006\bÉ\u0002\u0010Ú\u0001¨\u0006Ì\u0002"}, d2 = {"Landroidx/compose/ui/node/NodeCoordinator;", "Landroidx/compose/ui/node/LookaheadCapablePlaceable;", "Lcom/google/android/dj7;", "Lcom/google/android/kn6;", "Lcom/google/android/ew8;", "Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "<init>", "(Landroidx/compose/ui/node/LayoutNode;)V", "", "includeTail", "Landroidx/compose/ui/b$c;", "q3", "(Z)Landroidx/compose/ui/b$c;", "Lcom/google/android/ni8;", "type", "o3", "(I)Z", "Lcom/google/android/g16;", "position", "", "zIndex", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/m;", "", "layerBlock", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "explicitLayer", "K3", "(JFLkotlin/jvm/functions/Function1;Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "Lcom/google/android/w41;", "canvas", "graphicsLayer", "R2", "(Lcom/google/android/w41;Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "invokeOnLayoutChange", "i4", "(Z)V", "Landroidx/compose/ui/node/NodeCoordinator$d;", "hitTestSource", "Lcom/google/android/rn8;", "pointerPosition", "Lcom/google/android/hd5;", "hitTestResult", "Landroidx/compose/ui/input/pointer/j;", "pointerType", "isInLayer", "r3", "(Landroidx/compose/ui/b$c;Landroidx/compose/ui/node/NodeCoordinator$d;JLcom/google/android/hd5;IZ)V", "distanceFromEdge", "isHitInMinimumTouchTargetBetter", "I3", "(Landroidx/compose/ui/b$c;Landroidx/compose/ui/node/NodeCoordinator$d;JLcom/google/android/hd5;IZFZ)V", "s3", "(Landroidx/compose/ui/b$c;Landroidx/compose/ui/node/NodeCoordinator$d;JLcom/google/android/hd5;IZF)V", "Z3", "w3", "(Landroidx/compose/ui/b$c;JI)Z", "a4", "(Lcom/google/android/kn6;)Landroidx/compose/ui/node/NodeCoordinator;", "ancestor", "Lcom/google/android/zh7;", "matrix", "f4", "(Landroidx/compose/ui/node/NodeCoordinator;[F)V", "e4", "offset", "includeMotionFrameOfReference", "L2", "(Landroidx/compose/ui/node/NodeCoordinator;JZ)J", "Lcom/google/android/i58;", "rect", "clipBounds", "K2", "(Landroidx/compose/ui/node/NodeCoordinator;Lcom/google/android/i58;Z)V", "bounds", "W2", "(Lcom/google/android/i58;Z)V", "z3", "(J)J", "p3", "(I)Landroidx/compose/ui/b$c;", "y3", "()Z", "d2", "()V", "S2", "", "width", "height", "D3", "(II)V", "A3", "E3", "H3", "X0", "(JFLkotlin/jvm/functions/Function1;)V", "layer", "W0", "(JFLandroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "O3", "L3", "P2", "J3", "F3", "forceUpdateLayerParameters", "g4", "(Lkotlin/jvm/functions/Function1;Z)V", "t3", "(Landroidx/compose/ui/node/NodeCoordinator$d;JLcom/google/android/hd5;IZ)V", "u3", "Lcom/google/android/gba;", "d4", "()Lcom/google/android/gba;", "relativeToScreen", "i", "relativeToLocal", "m", "relativeToWindow", "b0", "D", "sourceCoordinates", "relativeToSource", "Q", "(Lcom/google/android/kn6;J)J", "f0", "(Lcom/google/android/kn6;JZ)J", "j0", "(Lcom/google/android/kn6;[F)V", "k0", "([F)V", "R", "(Lcom/google/android/kn6;Z)Lcom/google/android/gba;", "N", "b4", "(JZ)J", "U2", "Lcom/google/android/q09;", "paint", "Q2", "(Lcom/google/android/w41;Lcom/google/android/q09;)V", "C3", "G3", "clipToMinimumTouchTargetSize", "M3", "(Lcom/google/android/i58;ZZ)V", "k4", "(J)Z", "x3", "v3", "B3", "other", "T2", "(Landroidx/compose/ui/node/NodeCoordinator;)Landroidx/compose/ui/node/NodeCoordinator;", "Y3", "Lcom/google/android/tsb;", "minimumTouchTargetSize", "N2", "childRect", "M2", "(Lcom/google/android/i58;J)J", "O2", "(JJ)F", "q", "Landroidx/compose/ui/node/LayoutNode;", "a1", "()Landroidx/compose/ui/node/LayoutNode;", "r", "Z", "getForcePlaceWithLookaheadOffset$ui", "Q3", "forcePlaceWithLookaheadOffset", "s", "Z2", "P3", "forceMeasureWithLookaheadConstraints", "t", "Landroidx/compose/ui/node/NodeCoordinator;", "l3", "()Landroidx/compose/ui/node/NodeCoordinator;", "W3", "(Landroidx/compose/ui/node/NodeCoordinator;)V", "wrapped", "u", "m3", "X3", "wrappedBy", "v", "released", "w", "isClipping", "value", "x", "Lkotlin/jvm/functions/Function1;", "getLayerBlock", "()Lkotlin/jvm/functions/Function1;", "Lcom/google/android/f43;", "y", "Lcom/google/android/f43;", "layerDensity", "Landroidx/compose/ui/unit/LayoutDirection;", "z", "Landroidx/compose/ui/unit/LayoutDirection;", "layerLayoutDirection", "A", "F", "lastLayerAlpha", "Lcom/google/android/fj7;", "B", "Lcom/google/android/fj7;", "_measureResult", "Lcom/google/android/d58;", "Lcom/google/android/uc;", "C", "Lcom/google/android/d58;", "oldAlignmentLines", "J", "F1", "()J", "U3", "(J)V", "E", "n3", "()F", "setZIndex", "(F)V", "Lcom/google/android/i58;", "_rectCache", "Landroidx/compose/ui/node/b;", "G", "Landroidx/compose/ui/node/b;", "layerPositionalProperties", "Lcom/google/android/xkb;", "H", "Lcom/google/android/xkb;", "d3", "()Lcom/google/android/xkb;", "S3", "(Lcom/google/android/xkb;)V", "lastShape", "I", "a3", "R3", "lastClip", "k3", "V3", "wasLayerBlockInvoked", "K", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "drawBlockParentLayer", "L", "Lcom/google/android/w41;", "drawBlockCanvas", "Lkotlin/Function2;", "M", "Lkotlin/jvm/functions/Function2;", "_drawBlock", "Lkotlin/Function0;", "Lkotlin/jvm/functions/Function0;", "invalidateParentLayer", "O", "b3", "lastLayerDrawingWasSkipped", "Lcom/google/android/dw8;", "P", "Lcom/google/android/dw8;", "e3", "()Lcom/google/android/dw8;", "Landroidx/compose/ui/node/OwnerSnapshotObserver;", "i3", "()Landroidx/compose/ui/node/OwnerSnapshotObserver;", "snapshotObserver", "Y2", "()Lkotlin/jvm/functions/Function2;", "drawBlock", "j3", "()Landroidx/compose/ui/b$c;", "tail", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "getDensity", "density", "w2", "fontScale", "B1", "()Landroidx/compose/ui/node/LookaheadCapablePlaceable;", "parent", "()Lcom/google/android/kn6;", "coordinates", "introducesMotionFrameOfReference", "Lcom/google/android/q16;", "a", "size", "Lcom/google/android/wc;", "X2", "()Lcom/google/android/wc;", "alignmentLinesOwner", "x1", "child", "y1", "hasMeasureResult", "b", "isAttached", "z1", "()Lcom/google/android/fj7;", "T3", "(Lcom/google/android/fj7;)V", "measureResult", "Landroidx/compose/ui/node/i;", "f3", "()Landroidx/compose/ui/node/i;", "setLookaheadDelegate", "(Landroidx/compose/ui/node/i;)V", "lookaheadDelegate", "", "f", "()Ljava/lang/Object;", "parentData", "parentLayoutCoordinates", "parentCoordinates", "h3", "()Lcom/google/android/i58;", "rectCache", "Lcom/google/android/kx1;", "c3", "lastMeasurementConstraints", "z0", "isValidOwnerScope", "g3", "d", "c", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class NodeCoordinator extends LookaheadCapablePlaceable implements dj7, kn6, ew8 {

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Function1<NodeCoordinator, Unit> S = new Function1<NodeCoordinator, Unit>() { // from class: androidx.compose.ui.node.NodeCoordinator$Companion$onCommitAffectingLayerParams$1
        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
        public final void a(NodeCoordinator nodeCoordinator) throws Throwable {
            LayoutNode layoutNode = nodeCoordinator.getLayoutNode();
            try {
                if (nodeCoordinator.z0()) {
                    NodeCoordinator.j4(nodeCoordinator, false, 1, null);
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                layoutNode.O1(th);
                throw new KotlinNothingValueException();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) throws Throwable {
            a((NodeCoordinator) obj);
            return Unit.a;
        }
    };
    private static final Function1<NodeCoordinator, Unit> T = new Function1<NodeCoordinator, Unit>() { // from class: androidx.compose.ui.node.NodeCoordinator$Companion$onCommitAffectingLayer$1
        public final void a(NodeCoordinator nodeCoordinator) {
            dw8 layer = nodeCoordinator.getLayer();
            if (layer != null) {
                layer.invalidate();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((NodeCoordinator) obj);
            return Unit.a;
        }
    };
    private static final s U = new s();
    private static final androidx.compose.ui.node.b V = new androidx.compose.ui.node.b();
    private static final float[] W = zh7.c(null, 1, null);
    private static final d X = new a();
    private static final d Y = new b();

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private fj7 _measureResult;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private d58<uc> oldAlignmentLines;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private float zIndex;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private MutableRect _rectCache;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private androidx.compose.ui.node.b layerPositionalProperties;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private boolean lastClip;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private boolean wasLayerBlockInvoked;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private GraphicsLayer drawBlockParentLayer;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private w41 drawBlockCanvas;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    private Function2<? super w41, ? super GraphicsLayer, Unit> _drawBlock;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    private boolean lastLayerDrawingWasSkipped;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    private dw8 layer;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    private GraphicsLayer explicitLayer;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private final LayoutNode layoutNode;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private boolean forcePlaceWithLookaheadOffset;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private boolean forceMeasureWithLookaheadConstraints;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private NodeCoordinator wrapped;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private NodeCoordinator wrappedBy;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private boolean released;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private boolean isClipping;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private Function1<? super androidx.compose.ui.graphics.m, Unit> layerBlock;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private f43 layerDensity = getLayoutNode().getDensity();

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private LayoutDirection layerLayoutDirection = getLayoutNode().getLayoutDirection();

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private float lastLayerAlpha = 0.8f;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private long position = g16.INSTANCE.b();

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private xkb lastShape = r.a();

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    private final Function0<Unit> invalidateParentLayer = new Function0<Unit>() { // from class: androidx.compose.ui.node.NodeCoordinator$invalidateParentLayer$1
        {
            super(0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            m32invoke();
            return Unit.a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m32invoke() {
            NodeCoordinator wrappedBy = this.this$0.getWrappedBy();
            if (wrappedBy != null) {
                wrappedBy.v3();
            }
        }
    };

    @Metadata(d1 = {"\u0000G\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ7\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"androidx/compose/ui/node/NodeCoordinator$a", "Landroidx/compose/ui/node/NodeCoordinator$d;", "Lcom/google/android/ni8;", "Lcom/google/android/bf9;", "a", "()I", "Landroidx/compose/ui/b$c;", "node", "", "c", "(Landroidx/compose/ui/b$c;)Z", "Landroidx/compose/ui/node/LayoutNode;", "parentLayoutNode", "e", "(Landroidx/compose/ui/node/LayoutNode;)Z", "layoutNode", "Lcom/google/android/rn8;", "pointerPosition", "Lcom/google/android/hd5;", "hitTestResult", "Landroidx/compose/ui/input/pointer/j;", "pointerType", "isInLayer", "", "b", "(Landroidx/compose/ui/node/LayoutNode;JLcom/google/android/hd5;IZ)V", "child", "d", "(Lcom/google/android/hd5;Landroidx/compose/ui/node/LayoutNode;)Z", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements d {
        a() {
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.d
        public int a() {
            return ni8.a(16);
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.d
        public void b(LayoutNode layoutNode, long pointerPosition, hd5 hitTestResult, int pointerType, boolean isInLayer) {
            layoutNode.M0(pointerPosition, hitTestResult, pointerType, isInLayer);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r10v7 */
        /*  JADX ERROR: NullPointerException in pass: PrepareForCodeGen
            java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.getSVar()" because "result" is null
            	at jadx.core.dex.visitors.PrepareForCodeGen.removeInstructions(PrepareForCodeGen.java:118)
            	at jadx.core.dex.visitors.PrepareForCodeGen.visit(PrepareForCodeGen.java:85)
            */
        @Override // androidx.compose.ui.node.NodeCoordinator.d
        public boolean c(androidx.compose.ui.b.c r10) {
            /*
                r9 = this;
                r0 = 16
                int r1 = com.google.inputmethod.ni8.a(r0)
                r2 = 0
                r3 = r2
            L8:
                r4 = 0
                if (r10 == 0) goto L5a
                boolean r5 = r10 instanceof com.google.inputmethod.bf9
                r6 = 1
                if (r5 == 0) goto L19
                com.google.android.bf9 r10 = (com.google.inputmethod.bf9) r10
                boolean r10 = r10.Z()
                if (r10 == 0) goto L55
                return r6
            L19:
                int r5 = r10.getKindSet()
                r5 = r5 & r1
                if (r5 == 0) goto L55
                boolean r5 = r10 instanceof com.google.inputmethod.k33
                if (r5 == 0) goto L55
                r5 = r10
                com.google.android.k33 r5 = (com.google.inputmethod.k33) r5
                androidx.compose.ui.b$c r5 = r5.getDelegate()
                r7 = r4
            L2c:
                if (r5 == 0) goto L52
                int r8 = r5.getKindSet()
                r8 = r8 & r1
                if (r8 == 0) goto L4d
                int r7 = r7 + 1
                if (r7 != r6) goto L3b
                r10 = r5
                goto L4d
            L3b:
                if (r3 != 0) goto L44
                com.google.android.r58 r3 = new com.google.android.r58
                androidx.compose.ui.b$c[] r8 = new androidx.compose.ui.b.c[r0]
                r3.<init>(r8, r4)
            L44:
                if (r10 == 0) goto L4a
                r3.c(r10)
                r10 = r2
            L4a:
                r3.c(r5)
            L4d:
                androidx.compose.ui.b$c r5 = r5.getChild()
                goto L2c
            L52:
                if (r7 != r6) goto L55
                goto L8
            L55:
                androidx.compose.ui.b$c r10 = com.google.inputmethod.y23.b(r3)
                goto L8
            L5a:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.NodeCoordinator.a.c(androidx.compose.ui.b$c):boolean");
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.d
        public boolean d(hd5 hitTestResult, LayoutNode child) {
            if (!child.x0().Y3()) {
                return false;
            }
            hitTestResult.b();
            return true;
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.d
        public boolean e(LayoutNode parentLayoutNode) {
            return true;
        }
    }

    @Metadata(d1 = {"\u0000G\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ7\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001a\u0010\nJ\u001f\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"androidx/compose/ui/node/NodeCoordinator$b", "Landroidx/compose/ui/node/NodeCoordinator$d;", "Lcom/google/android/ni8;", "Lcom/google/android/bfb;", "a", "()I", "Landroidx/compose/ui/b$c;", "node", "", "c", "(Landroidx/compose/ui/b$c;)Z", "Landroidx/compose/ui/node/LayoutNode;", "parentLayoutNode", "e", "(Landroidx/compose/ui/node/LayoutNode;)Z", "layoutNode", "Lcom/google/android/rn8;", "pointerPosition", "Lcom/google/android/hd5;", "hitTestResult", "Landroidx/compose/ui/input/pointer/j;", "pointerType", "isInLayer", "", "b", "(Landroidx/compose/ui/node/LayoutNode;JLcom/google/android/hd5;IZ)V", "f", "child", "d", "(Lcom/google/android/hd5;Landroidx/compose/ui/node/LayoutNode;)Z", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements d {
        b() {
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.d
        public int a() {
            return ni8.a(8);
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.d
        public void b(LayoutNode layoutNode, long pointerPosition, hd5 hitTestResult, int pointerType, boolean isInLayer) {
            layoutNode.O0(pointerPosition, hitTestResult, pointerType, isInLayer);
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.d
        public boolean c(androidx.compose.ui.b.c node) {
            return false;
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.d
        public boolean d(hd5 hitTestResult, LayoutNode child) {
            return false;
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.d
        public boolean e(LayoutNode parentLayoutNode) {
            seb sebVarG = parentLayoutNode.g();
            boolean z = false;
            if (sebVarG != null && sebVarG.getIsClearingSemantics()) {
                z = true;
            }
            return !z;
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.d
        public boolean f(androidx.compose.ui.b.c node) {
            if (mq1.isSkipNonImportantSemanticsNodesHitTestEnabled) {
                return ifb.h(efb.a(y23.q(node), false));
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.node.NodeCoordinator$c, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0014\u0010\f\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR \u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R \u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Landroidx/compose/ui/node/NodeCoordinator$c;", "", "<init>", "()V", "Landroidx/compose/ui/node/NodeCoordinator$d;", "PointerInputSource", "Landroidx/compose/ui/node/NodeCoordinator$d;", "a", "()Landroidx/compose/ui/node/NodeCoordinator$d;", "SemanticsSource", "b", "", "ExpectAttachedLayoutCoordinates", "Ljava/lang/String;", "UnmeasuredError", "Lkotlin/Function1;", "Landroidx/compose/ui/node/NodeCoordinator;", "", "onCommitAffectingLayerParams", "Lkotlin/jvm/functions/Function1;", "onCommitAffectingLayer", "Landroidx/compose/ui/graphics/s;", "graphicsLayerScope", "Landroidx/compose/ui/graphics/s;", "Landroidx/compose/ui/node/b;", "tmpLayerPositionalProperties", "Landroidx/compose/ui/node/b;", "Lcom/google/android/zh7;", "tmpMatrix", "[F", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final d a() {
            return NodeCoordinator.X;
        }

        public final d b() {
            return NodeCoordinator.Y;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b`\u0018\u00002\u00020\u0001J\u0013\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\f\u0010\rJ7\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0007H&¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0019\u0010\tJ\u001f\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\nH&¢\u0006\u0004\b\u001b\u0010\u001cø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001dÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/node/NodeCoordinator$d;", "", "Lcom/google/android/ni8;", "a", "()I", "Landroidx/compose/ui/b$c;", "node", "", "c", "(Landroidx/compose/ui/b$c;)Z", "Landroidx/compose/ui/node/LayoutNode;", "parentLayoutNode", "e", "(Landroidx/compose/ui/node/LayoutNode;)Z", "layoutNode", "Lcom/google/android/rn8;", "pointerPosition", "Lcom/google/android/hd5;", "hitTestResult", "Landroidx/compose/ui/input/pointer/j;", "pointerType", "isInLayer", "", "b", "(Landroidx/compose/ui/node/LayoutNode;JLcom/google/android/hd5;IZ)V", "f", "child", "d", "(Lcom/google/android/hd5;Landroidx/compose/ui/node/LayoutNode;)Z", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface d {
        int a();

        void b(LayoutNode layoutNode, long pointerPosition, hd5 hitTestResult, int pointerType, boolean isInLayer);

        boolean c(androidx.compose.ui.b.c node);

        boolean d(hd5 hitTestResult, LayoutNode child);

        boolean e(LayoutNode parentLayoutNode);

        default boolean f(androidx.compose.ui.b.c node) {
            return true;
        }
    }

    public NodeCoordinator(LayoutNode layoutNode) {
        this.layoutNode = layoutNode;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I3(final androidx.compose.ui.b.c cVar, final d dVar, final long j, final hd5 hd5Var, final int i, final boolean z, final float f, final boolean z2) {
        if (cVar == null) {
            u3(dVar, j, hd5Var, i, z);
            return;
        }
        if (!dVar.f(cVar)) {
            I3(li8.d(cVar, dVar.a(), ni8.a(2)), dVar, j, hd5Var, i, z, f, z2);
            return;
        }
        if (w3(cVar, j, i)) {
            hd5Var.s(cVar, z, new Function0<Unit>() { // from class: androidx.compose.ui.node.NodeCoordinator$outOfBoundsHit$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                public /* bridge */ /* synthetic */ Object invoke() {
                    m33invoke();
                    return Unit.a;
                }

                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m33invoke() {
                    this.this$0.I3(li8.d(cVar, dVar.a(), ni8.a(2)), dVar, j, hd5Var, i, z, f, z2);
                }
            });
        } else if (z2) {
            s3(cVar, dVar, j, hd5Var, i, z, f);
        } else {
            Z3(cVar, dVar, j, hd5Var, i, z, f);
        }
    }

    private final void K2(NodeCoordinator ancestor, MutableRect rect, boolean clipBounds) {
        if (ancestor == this) {
            return;
        }
        NodeCoordinator nodeCoordinator = this.wrappedBy;
        if (nodeCoordinator != null) {
            nodeCoordinator.K2(ancestor, rect, clipBounds);
        }
        W2(rect, clipBounds);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    private final void K3(long position, float zIndex, Function1<? super androidx.compose.ui.graphics.m, Unit> layerBlock, GraphicsLayer explicitLayer) throws KotlinNothingValueException {
        if (explicitLayer != null) {
            if (!(layerBlock == null)) {
                zw5.a("both ways to create layers shouldn't be used together");
            }
            if (this.explicitLayer != explicitLayer) {
                this.explicitLayer = null;
                h4(this, null, false, 2, null);
                this.explicitLayer = explicitLayer;
            }
            if (this.layer == null) {
                dw8 dw8VarR = fo6.b(getLayoutNode()).r(Y2(), this.invalidateParentLayer, explicitLayer);
                dw8VarR.d(getMeasuredSize());
                dw8VarR.j(position);
                this.layer = dw8VarR;
                getLayoutNode().T1(true);
                this.invalidateParentLayer.invoke();
            }
        } else {
            if (this.explicitLayer != null) {
                this.explicitLayer = null;
                h4(this, null, false, 2, null);
            }
            h4(this, layerBlock, false, 2, null);
        }
        if (!g16.j(getPosition(), position)) {
            fo6.b(getLayoutNode()).K(tq4.INSTANCE.a());
            U3(position);
            dw8 dw8Var = this.layer;
            if (dw8Var != null) {
                dw8Var.j(position);
            } else {
                NodeCoordinator nodeCoordinator = this.wrappedBy;
                if (nodeCoordinator != null) {
                    nodeCoordinator.v3();
                }
            }
            getLayoutNode().s1(this);
            M1(this);
            m owner = getLayoutNode().getOwner();
            if (owner != null) {
                owner.E(getLayoutNode());
            }
        }
        this.zIndex = zIndex;
        if (this == getLayoutNode().x0()) {
            fo6.b(getLayoutNode()).getRectManager().l(getLayoutNode());
        }
        if (getIsPlacingForAlignment()) {
            return;
        }
        r1(z1());
    }

    private final long L2(NodeCoordinator ancestor, long offset, boolean includeMotionFrameOfReference) {
        if (ancestor == this) {
            return offset;
        }
        NodeCoordinator nodeCoordinator = this.wrappedBy;
        return (nodeCoordinator == null || Intrinsics.e(ancestor, nodeCoordinator)) ? U2(offset, includeMotionFrameOfReference) : U2(nodeCoordinator.L2(ancestor, offset, includeMotionFrameOfReference), includeMotionFrameOfReference);
    }

    public static /* synthetic */ void N3(NodeCoordinator nodeCoordinator, MutableRect mutableRect, boolean z, boolean z2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: rectInParent");
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        nodeCoordinator.M3(mutableRect, z, z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void R2(w41 canvas, GraphicsLayer graphicsLayer) {
        androidx.compose.ui.b.c cVarP3 = p3(ni8.a(4));
        if (cVarP3 == null) {
            J3(canvas, graphicsLayer);
        } else {
            getLayoutNode().n0().i(canvas, r16.e(a()), this, cVarP3, graphicsLayer);
        }
    }

    public static /* synthetic */ long V2(NodeCoordinator nodeCoordinator, long j, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fromParentPosition-8S9VItk");
        }
        if ((i & 2) != 0) {
            z = true;
        }
        return nodeCoordinator.U2(j, z);
    }

    private final void W2(MutableRect bounds, boolean clipBounds) {
        float fK = g16.k(getPosition());
        bounds.i(bounds.getLeft() - fK);
        bounds.j(bounds.getRight() - fK);
        float fL = g16.l(getPosition());
        bounds.k(bounds.getTop() - fL);
        bounds.h(bounds.getBottom() - fL);
        dw8 dw8Var = this.layer;
        if (dw8Var != null) {
            dw8Var.e(bounds, true);
            if (this.isClipping && clipBounds) {
                bounds.e(0.0f, 0.0f, (int) (a() >> 32), (int) (a() & 4294967295L));
                bounds.f();
            }
        }
    }

    private final Function2<w41, GraphicsLayer, Unit> Y2() {
        Function2 function2 = this._drawBlock;
        if (function2 != null) {
            return function2;
        }
        final Function0<Unit> function0 = new Function0<Unit>() { // from class: androidx.compose.ui.node.NodeCoordinator$drawBlock$drawBlockCallToDrawModifiers$1
            {
                super(0);
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                m31invoke();
                return Unit.a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m31invoke() {
                NodeCoordinator nodeCoordinator = this.this$0;
                w41 w41Var = nodeCoordinator.drawBlockCanvas;
                Intrinsics.g(w41Var);
                nodeCoordinator.R2(w41Var, this.this$0.drawBlockParentLayer);
            }
        };
        Function2<w41, GraphicsLayer, Unit> function3 = new Function2<w41, GraphicsLayer, Unit>() { // from class: androidx.compose.ui.node.NodeCoordinator$drawBlock$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
            public final void a(w41 w41Var, GraphicsLayer graphicsLayer) throws KotlinNothingValueException {
                if (!this.this$0.getLayoutNode().x()) {
                    this.this$0.lastLayerDrawingWasSkipped = true;
                    return;
                }
                this.this$0.drawBlockCanvas = w41Var;
                this.this$0.drawBlockParentLayer = graphicsLayer;
                OwnerSnapshotObserver ownerSnapshotObserverI3 = this.this$0.i3();
                ownerSnapshotObserverI3.observer.k(this.this$0, NodeCoordinator.T, function0);
                this.this$0.lastLayerDrawingWasSkipped = false;
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws KotlinNothingValueException {
                a((w41) obj, (GraphicsLayer) obj2);
                return Unit.a;
            }
        };
        this._drawBlock = function3;
        return function3;
    }

    private final void Z3(final androidx.compose.ui.b.c cVar, final d dVar, final long j, final hd5 hd5Var, final int i, final boolean z, final float f) {
        if (cVar == null) {
            u3(dVar, j, hd5Var, i, z);
            return;
        }
        if (!dVar.f(cVar)) {
            Z3(li8.d(cVar, dVar.a(), ni8.a(2)), dVar, j, hd5Var, i, z, f);
        } else if (dVar.c(cVar)) {
            hd5Var.y(cVar, f, z, new Function0<Unit>() { // from class: androidx.compose.ui.node.NodeCoordinator$speculativeHit$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                public /* bridge */ /* synthetic */ Object invoke() {
                    m34invoke();
                    return Unit.a;
                }

                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m34invoke() {
                    this.this$0.I3(li8.d(cVar, dVar.a(), ni8.a(2)), dVar, j, hd5Var, i, z, f, false);
                }
            });
        } else {
            I3(li8.d(cVar, dVar.a(), ni8.a(2)), dVar, j, hd5Var, i, z, f, false);
        }
    }

    private final NodeCoordinator a4(kn6 kn6Var) {
        NodeCoordinator nodeCoordinatorC;
        ua7 ua7Var = kn6Var instanceof ua7 ? (ua7) kn6Var : null;
        if (ua7Var != null && (nodeCoordinatorC = ua7Var.c()) != null) {
            return nodeCoordinatorC;
        }
        Intrinsics.h(kn6Var, "null cannot be cast to non-null type androidx.compose.ui.node.NodeCoordinator");
        return (NodeCoordinator) kn6Var;
    }

    public static /* synthetic */ long c4(NodeCoordinator nodeCoordinator, long j, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toParentPosition-8S9VItk");
        }
        if ((i & 2) != 0) {
            z = true;
        }
        return nodeCoordinator.b4(j, z);
    }

    private final void e4(NodeCoordinator ancestor, float[] matrix) {
        if (Intrinsics.e(ancestor, this)) {
            return;
        }
        NodeCoordinator nodeCoordinator = this.wrappedBy;
        Intrinsics.g(nodeCoordinator);
        nodeCoordinator.e4(ancestor, matrix);
        if (!g16.j(getPosition(), g16.INSTANCE.b())) {
            float[] fArr = W;
            zh7.i(fArr);
            zh7.s(fArr, -g16.k(getPosition()), -g16.l(getPosition()), 0.0f, 4, null);
            zh7.p(matrix, fArr);
        }
        dw8 dw8Var = this.layer;
        if (dw8Var != null) {
            dw8Var.h(matrix);
        }
    }

    private final void f4(NodeCoordinator ancestor, float[] matrix) {
        NodeCoordinator nodeCoordinator = this;
        while (!Intrinsics.e(nodeCoordinator, ancestor)) {
            dw8 dw8Var = nodeCoordinator.layer;
            if (dw8Var != null) {
                dw8Var.a(matrix);
            }
            long position = nodeCoordinator.getPosition();
            if (!g16.j(position, g16.INSTANCE.b())) {
                float[] fArr = W;
                zh7.i(fArr);
                zh7.s(fArr, g16.k(position), g16.l(position), 0.0f, 4, null);
                zh7.p(matrix, fArr);
            }
            nodeCoordinator = nodeCoordinator.wrappedBy;
            Intrinsics.g(nodeCoordinator);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public static /* synthetic */ void h4(NodeCoordinator nodeCoordinator, Function1 function1, boolean z, int i, Object obj) throws KotlinNothingValueException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateLayerBlock");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        nodeCoordinator.g4(function1, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final OwnerSnapshotObserver i3() throws KotlinNothingValueException {
        return fo6.b(getLayoutNode()).getSnapshotObserver();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    private final void i4(boolean invokeOnLayoutChange) throws KotlinNothingValueException {
        m owner;
        if (this.explicitLayer != null) {
            return;
        }
        dw8 dw8Var = this.layer;
        if (dw8Var == null) {
            if (this.layerBlock == null) {
                return;
            }
            zw5.c("null layer with a non-null layerBlock");
            return;
        }
        final Function1<? super androidx.compose.ui.graphics.m, Unit> function1 = this.layerBlock;
        if (function1 == null) {
            zw5.d("updateLayerParameters requires a non-null layerBlock");
            throw new KotlinNothingValueException();
        }
        s sVar = U;
        sVar.Q();
        sVar.R(getLayoutNode().getDensity());
        sVar.T(getLayoutNode().getLayoutDirection());
        sVar.W(r16.e(a()));
        i3().observer.k(this, S, new Function0<Unit>() { // from class: androidx.compose.ui.node.NodeCoordinator$updateLayerParameters$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
            public /* bridge */ /* synthetic */ Object invoke() throws KotlinNothingValueException {
                m35invoke();
                return Unit.a;
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m35invoke() throws KotlinNothingValueException {
                function1.invoke(NodeCoordinator.U);
                boolean zE = Intrinsics.e(this.getLastShape(), NodeCoordinator.U.getShape());
                boolean z = this.getLastClip() != NodeCoordinator.U.getClip();
                if (!zE || z) {
                    this.S3(NodeCoordinator.U.getShape());
                    this.R3(NodeCoordinator.U.getClip());
                    if (this.getWasLayerBlockInvoked() && (z || (this.getLastClip() && !zE))) {
                        this.getLayoutNode().W0();
                    }
                }
                this.V3(true);
                NodeCoordinator.U.Z();
            }
        });
        androidx.compose.ui.node.b bVar = this.layerPositionalProperties;
        if (bVar == null) {
            bVar = new androidx.compose.ui.node.b();
            this.layerPositionalProperties = bVar;
        }
        androidx.compose.ui.node.b bVar2 = V;
        bVar2.b(bVar);
        bVar.a(sVar);
        dw8Var.g(sVar);
        boolean z = this.isClipping;
        this.isClipping = sVar.getClip();
        this.lastLayerAlpha = sVar.getAlpha();
        boolean zC = bVar2.c(bVar);
        if (invokeOnLayoutChange && ((!zC || z != this.isClipping) && (owner = getLayoutNode().getOwner()) != null)) {
            owner.E(getLayoutNode());
        }
        if (zC) {
            return;
        }
        LayoutNode layoutNode = getLayoutNode();
        layoutNode.s1(this);
        if (layoutNode.getGloballyPositionedObservers() > 0) {
            fo6.b(layoutNode).f(layoutNode);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    static /* synthetic */ void j4(NodeCoordinator nodeCoordinator, boolean z, int i, Object obj) throws KotlinNothingValueException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateLayerParameters");
        }
        if ((i & 1) != 0) {
            z = true;
        }
        nodeCoordinator.i4(z);
    }

    private final boolean o3(int type) {
        androidx.compose.ui.b.c cVarQ3 = q3(oi8.i(type));
        return cVarQ3 != null && y23.h(cVarQ3, type);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final androidx.compose.ui.b.c q3(boolean includeTail) {
        androidx.compose.ui.b.c cVarJ3;
        if (getLayoutNode().x0() == this) {
            return getLayoutNode().getNodes().getHead();
        }
        if (!includeTail) {
            NodeCoordinator nodeCoordinator = this.wrappedBy;
            if (nodeCoordinator != null) {
                return nodeCoordinator.j3();
            }
            return null;
        }
        NodeCoordinator nodeCoordinator2 = this.wrappedBy;
        if (nodeCoordinator2 == null || (cVarJ3 = nodeCoordinator2.j3()) == null) {
            return null;
        }
        return cVarJ3.getChild();
    }

    private final void r3(androidx.compose.ui.b.c cVar, d dVar, long j, hd5 hd5Var, int i, boolean z) {
        if (cVar == null) {
            u3(dVar, j, hd5Var, i, z);
            return;
        }
        if (!dVar.f(cVar)) {
            r3(li8.d(cVar, dVar.a(), ni8.a(2)), dVar, j, hd5Var, i, z);
            return;
        }
        int i2 = hd5Var.hitDepth;
        hd5Var.x(hd5Var.hitDepth + 1, hd5Var.size());
        hd5Var.hitDepth++;
        hd5Var.values.n(cVar);
        hd5Var.distanceFromEdgeAndFlags.d(id5.a(-1.0f, z, false));
        r3(li8.d(cVar, dVar.a(), ni8.a(2)), dVar, j, hd5Var, i, z);
        hd5Var.hitDepth = i2;
    }

    private final void s3(androidx.compose.ui.b.c cVar, d dVar, long j, hd5 hd5Var, int i, boolean z, float f) {
        if (cVar == null) {
            u3(dVar, j, hd5Var, i, z);
            return;
        }
        if (!dVar.f(cVar)) {
            s3(li8.d(cVar, dVar.a(), ni8.a(2)), dVar, j, hd5Var, i, z, f);
            return;
        }
        int i2 = hd5Var.hitDepth;
        hd5Var.x(hd5Var.hitDepth + 1, hd5Var.size());
        hd5Var.hitDepth++;
        hd5Var.values.n(cVar);
        hd5Var.distanceFromEdgeAndFlags.d(id5.a(f, z, false));
        I3(li8.d(cVar, dVar.a(), ni8.a(2)), dVar, j, hd5Var, i, z, f, true);
        hd5Var.hitDepth = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v14 */
    /*  JADX ERROR: NullPointerException in pass: PrepareForCodeGen
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.getSVar()" because "result" is null
        	at jadx.core.dex.visitors.PrepareForCodeGen.removeInstructions(PrepareForCodeGen.java:118)
        	at jadx.core.dex.visitors.PrepareForCodeGen.visit(PrepareForCodeGen.java:85)
        */
    private final boolean w3(androidx.compose.ui.b.c r9, long r10, int r12) {
        /*
            Method dump skipped, instruction units count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.NodeCoordinator.w3(androidx.compose.ui.b$c, long, int):boolean");
    }

    private final long z3(long pointerPosition) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (pointerPosition >> 32));
        float fMax = Math.max(0.0f, fIntBitsToFloat < 0.0f ? -fIntBitsToFloat : fIntBitsToFloat - J0());
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (pointerPosition & 4294967295L));
        return rn8.e((((long) Float.floatToRawIntBits(Math.max(0.0f, fIntBitsToFloat2 < 0.0f ? -fIntBitsToFloat2 : fIntBitsToFloat2 - G0()))) & 4294967295L) | (((long) Float.floatToRawIntBits(fMax)) << 32));
    }

    public final void A3() {
        getLayoutNode().getLayoutDelegate().H();
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public LookaheadCapablePlaceable B1() {
        return this.wrappedBy;
    }

    public void B3() {
        dw8 dw8Var = this.layer;
        if (dw8Var != null) {
            dw8Var.invalidate();
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final void C3() throws KotlinNothingValueException {
        O3();
        if (getLayoutNode().x()) {
            H3();
        }
    }

    @Override // com.google.inputmethod.kn6
    public long D(long relativeToLocal) {
        return fo6.b(getLayoutNode()).C(N(relativeToLocal));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v8 */
    protected void D3(int width, int height) throws KotlinNothingValueException {
        NodeCoordinator nodeCoordinator;
        dw8 dw8Var = this.layer;
        if (dw8Var != null) {
            dw8Var.d(q16.c((((long) width) << 32) | (((long) height) & 4294967295L)));
        } else if (getLayoutNode().x() && (nodeCoordinator = this.wrappedBy) != null) {
            nodeCoordinator.v3();
        }
        Y0(q16.c((((long) height) & 4294967295L) | (((long) width) << 32)));
        if (this.layerBlock != null) {
            i4(false);
        }
        int iA = ni8.a(4);
        boolean zI = oi8.i(iA);
        androidx.compose.ui.b.c cVarJ3 = j3();
        if (zI || (cVarJ3 = cVarJ3.getParent()) != null) {
            for (androidx.compose.ui.b.c cVarQ3 = q3(zI); cVarQ3 != null && (cVarQ3.getAggregateChildKindSet() & iA) != 0; cVarQ3 = cVarQ3.getChild()) {
                if ((cVarQ3.getKindSet() & iA) != 0) {
                    androidx.compose.ui.b.c cVarJ = cVarQ3;
                    r58 r58Var = null;
                    while (cVarJ != 0) {
                        if (cVarJ instanceof yg3) {
                            ((yg3) cVarJ).N0();
                        } else if ((cVarJ.getKindSet() & iA) != 0 && (cVarJ instanceof k33)) {
                            androidx.compose.ui.b.c cVarN3 = ((k33) cVarJ).getDelegate();
                            int i = 0;
                            cVarJ = cVarJ;
                            while (cVarN3 != null) {
                                if ((cVarN3.getKindSet() & iA) != 0) {
                                    i++;
                                    if (i == 1) {
                                        cVarJ = cVarN3;
                                    } else {
                                        if (r58Var == null) {
                                            r58Var = new r58(new androidx.compose.ui.b.c[16], 0);
                                        }
                                        if (cVarJ != 0) {
                                            r58Var.c(cVarJ);
                                            cVarJ = 0;
                                        }
                                        r58Var.c(cVarN3);
                                    }
                                }
                                cVarN3 = cVarN3.getChild();
                                cVarJ = cVarJ;
                            }
                            if (i == 1) {
                            }
                        }
                        cVarJ = y23.j(r58Var);
                    }
                }
                if (cVarQ3 == cVarJ3) {
                    break;
                }
            }
        }
        m owner = getLayoutNode().getOwner();
        if (owner != null) {
            owner.E(getLayoutNode());
        }
        getLayoutNode().s1(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v10 */
    public final void E3() {
        androidx.compose.ui.b.c parent;
        if (o3(ni8.a(128))) {
            androidx.compose.p004runtime.snapshots.g.Companion companion = androidx.compose.p004runtime.snapshots.g.INSTANCE;
            androidx.compose.p004runtime.snapshots.g gVarD = companion.d();
            Function1<Object, Unit> function1G = gVarD != null ? gVarD.g() : null;
            androidx.compose.p004runtime.snapshots.g gVarE = companion.e(gVarD);
            try {
                int iA = ni8.a(128);
                boolean zI = oi8.i(iA);
                if (!zI) {
                    parent = j3().getParent();
                    if (parent == null) {
                    }
                    Unit unit = Unit.a;
                }
                parent = j3();
                for (androidx.compose.ui.b.c cVarQ3 = q3(zI); cVarQ3 != null && (cVarQ3.getAggregateChildKindSet() & iA) != 0; cVarQ3 = cVarQ3.getChild()) {
                    if ((cVarQ3.getKindSet() & iA) != 0) {
                        r58 r58Var = null;
                        androidx.compose.ui.b.c cVarJ = cVarQ3;
                        while (cVarJ != 0) {
                            if (cVarJ instanceof kj7) {
                                ((kj7) cVarJ).f(getMeasuredSize());
                            } else if ((cVarJ.getKindSet() & iA) != 0 && (cVarJ instanceof k33)) {
                                androidx.compose.ui.b.c cVarN3 = ((k33) cVarJ).getDelegate();
                                int i = 0;
                                cVarJ = cVarJ;
                                while (cVarN3 != null) {
                                    if ((cVarN3.getKindSet() & iA) != 0) {
                                        i++;
                                        if (i == 1) {
                                            cVarJ = cVarN3;
                                        } else {
                                            if (r58Var == null) {
                                                r58Var = new r58(new androidx.compose.ui.b.c[16], 0);
                                            }
                                            if (cVarJ != 0) {
                                                r58Var.c(cVarJ);
                                                cVarJ = 0;
                                            }
                                            r58Var.c(cVarN3);
                                        }
                                    }
                                    cVarN3 = cVarN3.getChild();
                                    cVarJ = cVarJ;
                                }
                                if (i == 1) {
                                }
                            }
                            cVarJ = y23.j(r58Var);
                        }
                    }
                    if (cVarQ3 == parent) {
                        break;
                    }
                }
                Unit unit2 = Unit.a;
            } finally {
                companion.l(gVarD, gVarE, function1G);
            }
        }
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    /* JADX INFO: renamed from: F1, reason: from getter */
    public long getPosition() {
        return this.position;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v6 */
    public final void F3() {
        int iA = ni8.a(4194304);
        boolean zI = oi8.i(iA);
        androidx.compose.ui.b.c cVarJ3 = j3();
        if (!zI && (cVarJ3 = cVarJ3.getParent()) == null) {
            return;
        }
        for (androidx.compose.ui.b.c cVarQ3 = q3(zI); cVarQ3 != null && (cVarQ3.getAggregateChildKindSet() & iA) != 0; cVarQ3 = cVarQ3.getChild()) {
            if ((cVarQ3.getKindSet() & iA) != 0) {
                androidx.compose.ui.b.c cVarJ = cVarQ3;
                r58 r58Var = null;
                while (cVarJ != 0) {
                    if (cVarJ instanceof fn6) {
                        ((fn6) cVarJ).w(this);
                    } else if ((cVarJ.getKindSet() & iA) != 0 && (cVarJ instanceof k33)) {
                        androidx.compose.ui.b.c cVarN3 = ((k33) cVarJ).getDelegate();
                        int i = 0;
                        cVarJ = cVarJ;
                        while (cVarN3 != null) {
                            if ((cVarN3.getKindSet() & iA) != 0) {
                                i++;
                                if (i == 1) {
                                    cVarJ = cVarN3;
                                } else {
                                    if (r58Var == null) {
                                        r58Var = new r58(new androidx.compose.ui.b.c[16], 0);
                                    }
                                    if (cVarJ != 0) {
                                        r58Var.c(cVarJ);
                                        cVarJ = 0;
                                    }
                                    r58Var.c(cVarN3);
                                }
                            }
                            cVarN3 = cVarN3.getChild();
                            cVarJ = cVarJ;
                        }
                        if (i == 1) {
                        }
                    }
                    cVarJ = y23.j(r58Var);
                }
            }
            if (cVarQ3 == cVarJ3) {
                return;
            }
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final void G3() throws KotlinNothingValueException {
        this.released = true;
        this.invalidateParentLayer.invoke();
        O3();
        if (g16.j(getPosition(), g16.INSTANCE.b())) {
            return;
        }
        getLayoutNode().s1(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v6 */
    public final void H3() {
        if (o3(ni8.a(1048576))) {
            int iA = ni8.a(1048576);
            boolean zI = oi8.i(iA);
            androidx.compose.ui.b.c cVarJ3 = j3();
            if (!zI && (cVarJ3 = cVarJ3.getParent()) == null) {
                return;
            }
            for (androidx.compose.ui.b.c cVarQ3 = q3(zI); cVarQ3 != null && (cVarQ3.getAggregateChildKindSet() & iA) != 0; cVarQ3 = cVarQ3.getChild()) {
                if ((cVarQ3.getKindSet() & iA) != 0) {
                    androidx.compose.ui.b.c cVarJ = cVarQ3;
                    r58 r58Var = null;
                    while (cVarJ != 0) {
                        if (cVarJ instanceof ltd) {
                            ((ltd) cVarJ).H2();
                        } else if ((cVarJ.getKindSet() & iA) != 0 && (cVarJ instanceof k33)) {
                            androidx.compose.ui.b.c cVarN3 = ((k33) cVarJ).getDelegate();
                            int i = 0;
                            cVarJ = cVarJ;
                            while (cVarN3 != null) {
                                if ((cVarN3.getKindSet() & iA) != 0) {
                                    i++;
                                    if (i == 1) {
                                        cVarJ = cVarN3;
                                    } else {
                                        if (r58Var == null) {
                                            r58Var = new r58(new androidx.compose.ui.b.c[16], 0);
                                        }
                                        if (cVarJ != 0) {
                                            r58Var.c(cVarJ);
                                            cVarJ = 0;
                                        }
                                        r58Var.c(cVarN3);
                                    }
                                }
                                cVarN3 = cVarN3.getChild();
                                cVarJ = cVarJ;
                            }
                            if (i == 1) {
                            }
                        }
                        cVarJ = y23.j(r58Var);
                    }
                }
                if (cVarQ3 == cVarJ3) {
                    return;
                }
            }
        }
    }

    public void J3(w41 canvas, GraphicsLayer graphicsLayer) {
        NodeCoordinator nodeCoordinator = this.wrapped;
        if (nodeCoordinator != null) {
            nodeCoordinator.P2(canvas, graphicsLayer);
        }
    }

    @Override // com.google.inputmethod.kn6
    public final kn6 L() {
        if (!b()) {
            StringBuilder sb = new StringBuilder("LayoutCoordinate operations are only valid when isAttached is true");
            for (LayoutNode layoutNode = getLayoutNode(); layoutNode != null; layoutNode = layoutNode.C0()) {
                sb.append('\n');
                sb.append("|");
                sb.append(layoutNode);
                sb.append(" isAttached=");
                sb.append(layoutNode.b());
                sb.append(" modifier=");
                sb.append(layoutNode.get_modifier());
                sb.append(" tail=");
                sb.append(j3());
            }
            zw5.c(sb.toString());
        }
        A3();
        return getLayoutNode().x0().wrappedBy;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final void L3(long position, float zIndex, Function1<? super androidx.compose.ui.graphics.m, Unit> layerBlock, GraphicsLayer layer) throws KotlinNothingValueException {
        K3(g16.o(position, getApparentToRealOffset()), zIndex, layerBlock, layer);
    }

    protected final long M2(MutableRect childRect, long minimumTouchTargetSize) {
        float left = childRect.getLeft();
        float top = childRect.getTop();
        if (childRect.getRight() < 0.0f || left > ((int) (a() >> 32)) || childRect.getBottom() < 0.0f || top > ((int) (a() & 4294967295L))) {
            return rn8.INSTANCE.c();
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (minimumTouchTargetSize >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (minimumTouchTargetSize & 4294967295L));
        float right = (fIntBitsToFloat - (childRect.getRight() - childRect.getLeft())) / 2.0f;
        float fD = right > 0.0f ? left - right : kotlin.ranges.g.d(left, (-fIntBitsToFloat) / 2.0f);
        float bottom = (fIntBitsToFloat2 - (childRect.getBottom() - childRect.getTop())) / 2.0f;
        return rn8.e((((long) Float.floatToRawIntBits(fD)) << 32) | (((long) Float.floatToRawIntBits(bottom > 0.0f ? top - bottom : kotlin.ranges.g.d(top, (-fIntBitsToFloat2) / 2.0f))) & 4294967295L));
    }

    public final void M3(MutableRect bounds, boolean clipBounds, boolean clipToMinimumTouchTargetSize) {
        dw8 dw8Var = this.layer;
        if (dw8Var != null) {
            if (this.isClipping) {
                if (clipToMinimumTouchTargetSize) {
                    long jG3 = g3();
                    long jM2 = M2(bounds, jG3);
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (jM2 >> 32));
                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jM2 & 4294967295L));
                    long jA = a();
                    float f = (int) (jA >> 32);
                    int i = (int) (jG3 >> 32);
                    float fMin = Math.min(Float.intBitsToFloat(i) + f, Math.max(f, Float.intBitsToFloat(i) + fIntBitsToFloat));
                    float f2 = (int) (jA & 4294967295L);
                    int i2 = (int) (jG3 & 4294967295L);
                    bounds.e(fIntBitsToFloat, fIntBitsToFloat2, fMin, Math.min(Float.intBitsToFloat(i2) + f2, Math.max(f2, Float.intBitsToFloat(i2) + fIntBitsToFloat2)));
                } else if (clipBounds) {
                    bounds.e(0.0f, 0.0f, (int) (a() >> 32), (int) (4294967295L & a()));
                }
                if (bounds.f()) {
                    return;
                }
            }
            dw8Var.e(bounds, false);
        }
        float fK = g16.k(getPosition());
        bounds.i(bounds.getLeft() + fK);
        bounds.j(bounds.getRight() + fK);
        float fL = g16.l(getPosition());
        bounds.k(bounds.getTop() + fL);
        bounds.h(bounds.getBottom() + fL);
    }

    @Override // com.google.inputmethod.kn6
    public long N(long relativeToLocal) {
        if (!b()) {
            zw5.c("LayoutCoordinate operations are only valid when isAttached is true");
        }
        A3();
        long jC4 = relativeToLocal;
        for (NodeCoordinator nodeCoordinator = this; nodeCoordinator != null; nodeCoordinator = nodeCoordinator.wrappedBy) {
            LayoutNode layoutNode = nodeCoordinator.getLayoutNode();
            if (nodeCoordinator == layoutNode.x0() && !layoutNode.getHasPositionalLayerTransformationsInOffsetFromRoot()) {
                long jD = fo6.b(layoutNode).getRectManager().d(layoutNode);
                if (!g16.j(jD, g16.INSTANCE.a())) {
                    return h16.c(jC4, jD);
                }
            }
            jC4 = c4(nodeCoordinator, jC4, false, 2, null);
        }
        return jC4;
    }

    protected final long N2(long minimumTouchTargetSize) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (minimumTouchTargetSize >> 32)) - J0();
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (minimumTouchTargetSize & 4294967295L)) - G0();
        float fMax = Math.max(0.0f, fIntBitsToFloat / 2.0f);
        return tsb.d((((long) Float.floatToRawIntBits(Math.max(0.0f, fIntBitsToFloat2 / 2.0f))) & 4294967295L) | (Float.floatToRawIntBits(fMax) << 32));
    }

    protected final float O2(long pointerPosition, long minimumTouchTargetSize) {
        if (J0() >= Float.intBitsToFloat((int) (minimumTouchTargetSize >> 32)) && G0() >= Float.intBitsToFloat((int) (minimumTouchTargetSize & 4294967295L))) {
            return Float.POSITIVE_INFINITY;
        }
        long jN2 = N2(minimumTouchTargetSize);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jN2 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jN2 & 4294967295L));
        long jZ3 = z3(pointerPosition);
        if ((fIntBitsToFloat > 0.0f || fIntBitsToFloat2 > 0.0f) && Float.intBitsToFloat((int) (jZ3 >> 32)) <= fIntBitsToFloat && Float.intBitsToFloat((int) (jZ3 & 4294967295L)) <= fIntBitsToFloat2) {
            return rn8.l(jZ3);
        }
        return Float.POSITIVE_INFINITY;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final void O3() throws KotlinNothingValueException {
        if (this.layer != null) {
            if (this.explicitLayer != null) {
                this.explicitLayer = null;
            }
            h4(this, null, false, 2, null);
            LayoutNode.I1(getLayoutNode(), false, 1, null);
        }
    }

    public final void P2(w41 canvas, GraphicsLayer graphicsLayer) {
        dw8 dw8Var = this.layer;
        if (dw8Var != null) {
            dw8Var.i(canvas, graphicsLayer);
            return;
        }
        float fK = g16.k(getPosition());
        float fL = g16.l(getPosition());
        canvas.c(fK, fL);
        R2(canvas, graphicsLayer);
        canvas.c(-fK, -fL);
    }

    public final void P3(boolean z) {
        this.forceMeasureWithLookaheadConstraints = z;
    }

    @Override // com.google.inputmethod.kn6
    public long Q(kn6 sourceCoordinates, long relativeToSource) {
        return f0(sourceCoordinates, relativeToSource, true);
    }

    protected final void Q2(w41 canvas, q09 paint) {
        canvas.g(0.5f, 0.5f, ((int) (getMeasuredSize() >> 32)) - 0.5f, ((int) (getMeasuredSize() & 4294967295L)) - 0.5f, paint);
    }

    public final void Q3(boolean z) {
        this.forcePlaceWithLookaheadOffset = z;
    }

    @Override // com.google.inputmethod.kn6
    public gba R(kn6 sourceCoordinates, boolean clipBounds) {
        if (!b()) {
            zw5.c("LayoutCoordinate operations are only valid when isAttached is true");
        }
        if (!sourceCoordinates.b()) {
            zw5.c("LayoutCoordinates " + sourceCoordinates + " is not attached!");
        }
        NodeCoordinator nodeCoordinatorA4 = a4(sourceCoordinates);
        nodeCoordinatorA4.A3();
        NodeCoordinator nodeCoordinatorT2 = T2(nodeCoordinatorA4);
        MutableRect mutableRectH3 = h3();
        mutableRectH3.i(0.0f);
        mutableRectH3.k(0.0f);
        mutableRectH3.j((int) (sourceCoordinates.a() >> 32));
        mutableRectH3.h((int) (sourceCoordinates.a() & 4294967295L));
        NodeCoordinator nodeCoordinator = nodeCoordinatorA4;
        while (nodeCoordinator != nodeCoordinatorT2) {
            boolean z = clipBounds;
            N3(nodeCoordinator, mutableRectH3, z, false, 4, null);
            if (mutableRectH3.f()) {
                return gba.INSTANCE.a();
            }
            nodeCoordinator = nodeCoordinator.wrappedBy;
            Intrinsics.g(nodeCoordinator);
            clipBounds = z;
        }
        K2(nodeCoordinatorT2, mutableRectH3, clipBounds);
        return j58.a(mutableRectH3);
    }

    public final void R3(boolean z) {
        this.lastClip = z;
    }

    public abstract void S2();

    public final void S3(xkb xkbVar) {
        this.lastShape = xkbVar;
    }

    public final NodeCoordinator T2(NodeCoordinator other) {
        LayoutNode layoutNode = other.getLayoutNode();
        LayoutNode layoutNode2 = getLayoutNode();
        if (layoutNode == layoutNode2) {
            androidx.compose.ui.b.c cVarJ3 = other.j3();
            androidx.compose.ui.b.c cVarJ4 = j3();
            int iA = ni8.a(2);
            if (!cVarJ4.getNode().getIsAttached()) {
                zw5.c("visitLocalAncestors called on an unattached node");
            }
            for (androidx.compose.ui.b.c parent = cVarJ4.getNode().getParent(); parent != null; parent = parent.getParent()) {
                if ((parent.getKindSet() & iA) != 0 && parent == cVarJ3) {
                    return other;
                }
            }
            return this;
        }
        while (layoutNode.getDepth() > layoutNode2.getDepth()) {
            layoutNode = layoutNode.C0();
            Intrinsics.g(layoutNode);
        }
        while (layoutNode2.getDepth() > layoutNode.getDepth()) {
            layoutNode2 = layoutNode2.C0();
            Intrinsics.g(layoutNode2);
        }
        while (layoutNode != layoutNode2) {
            layoutNode = layoutNode.C0();
            layoutNode2 = layoutNode2.C0();
            if (layoutNode == null || layoutNode2 == null) {
                throw new IllegalArgumentException("layouts are not part of the same hierarchy");
            }
        }
        if (layoutNode2 != getLayoutNode()) {
            if (layoutNode != other.getLayoutNode()) {
                return layoutNode.b0();
            }
            return other;
        }
        return this;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX WARN: Code duplicated, block: B:15:0x0034  */
    /* JADX WARN: Code duplicated, block: B:28:? A[RETURN, SYNTHETIC] */
    public void T3(fj7 fj7Var) throws KotlinNothingValueException {
        fj7 fj7Var2 = this._measureResult;
        if (fj7Var != fj7Var2) {
            this._measureResult = fj7Var;
            if (fj7Var2 == null || fj7Var.getWidth() != fj7Var2.getWidth() || fj7Var.getHeight() != fj7Var2.getHeight()) {
                D3(fj7Var.getWidth(), fj7Var.getHeight());
            }
            d58<uc> d58Var = this.oldAlignmentLines;
            if (d58Var != null) {
                Intrinsics.g(d58Var);
                if (!d58Var.h()) {
                    if (fj7Var.j().isEmpty()) {
                        return;
                    }
                }
            } else if (fj7Var.j().isEmpty()) {
                return;
            }
            if (li8.c(this.oldAlignmentLines, fj7Var.j())) {
                return;
            }
            X2().getAlignmentLines().m();
            d58<uc> d58VarB = this.oldAlignmentLines;
            if (d58VarB == null) {
                d58VarB = xl8.b();
                this.oldAlignmentLines = d58VarB;
            }
            d58VarB.j();
            for (Map.Entry<uc, Integer> entry : fj7Var.j().entrySet()) {
                d58VarB.u(entry.getKey(), entry.getValue().intValue());
            }
        }
    }

    public long U2(long position, boolean includeMotionFrameOfReference) {
        if (includeMotionFrameOfReference || !getIsPlacedUnderMotionFrameOfReference()) {
            position = h16.b(position, getPosition());
        }
        dw8 dw8Var = this.layer;
        return dw8Var != null ? dw8Var.c(position, true) : position;
    }

    protected void U3(long j) {
        this.position = j;
    }

    public final void V3(boolean z) {
        this.wasLayerBlockInvoked = z;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    @Override // androidx.compose.ui.layout.o
    public void W0(long position, float zIndex, GraphicsLayer layer) throws KotlinNothingValueException {
        if (!this.forcePlaceWithLookaheadOffset) {
            K3(position, zIndex, null, layer);
            return;
        }
        i iVarF3 = getLookaheadDelegate();
        Intrinsics.g(iVarF3);
        K3(iVarF3.getPosition(), zIndex, null, layer);
    }

    public final void W3(NodeCoordinator nodeCoordinator) {
        this.wrapped = nodeCoordinator;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    @Override // androidx.compose.ui.layout.o
    public void X0(long position, float zIndex, Function1<? super androidx.compose.ui.graphics.m, Unit> layerBlock) throws KotlinNothingValueException {
        if (!this.forcePlaceWithLookaheadOffset) {
            K3(position, zIndex, layerBlock, null);
            return;
        }
        i iVarF3 = getLookaheadDelegate();
        Intrinsics.g(iVarF3);
        K3(iVarF3.getPosition(), zIndex, layerBlock, null);
    }

    public wc X2() {
        return getLayoutNode().getLayoutDelegate().b();
    }

    public final void X3(NodeCoordinator nodeCoordinator) {
        this.wrappedBy = nodeCoordinator;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v7 */
    /*  JADX ERROR: NullPointerException in pass: PrepareForCodeGen
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.getSVar()" because "result" is null
        	at jadx.core.dex.visitors.PrepareForCodeGen.removeInstructions(PrepareForCodeGen.java:118)
        	at jadx.core.dex.visitors.PrepareForCodeGen.visit(PrepareForCodeGen.java:85)
        */
    public final boolean Y3() {
        /*
            r11 = this;
            r0 = 16
            int r1 = com.google.inputmethod.ni8.a(r0)
            boolean r1 = com.google.inputmethod.oi8.i(r1)
            androidx.compose.ui.b$c r1 = r11.q3(r1)
            r2 = 0
            if (r1 != 0) goto L12
            return r2
        L12:
            boolean r3 = r1.getIsAttached()
            if (r3 == 0) goto L98
            int r3 = com.google.inputmethod.ni8.a(r0)
            androidx.compose.ui.b$c r4 = r1.getNode()
            boolean r4 = r4.getIsAttached()
            if (r4 != 0) goto L2b
            java.lang.String r4 = "visitLocalDescendants called on an unattached node"
            com.google.inputmethod.zw5.c(r4)
        L2b:
            androidx.compose.ui.b$c r1 = r1.getNode()
            int r4 = r1.getAggregateChildKindSet()
            r4 = r4 & r3
            if (r4 == 0) goto L98
        L36:
            if (r1 == 0) goto L98
            int r4 = r1.getKindSet()
            r4 = r4 & r3
            if (r4 == 0) goto L93
            r4 = 0
            r5 = r1
            r6 = r4
        L42:
            if (r5 == 0) goto L93
            boolean r7 = r5 instanceof com.google.inputmethod.bf9
            r8 = 1
            if (r7 == 0) goto L52
            com.google.android.bf9 r5 = (com.google.inputmethod.bf9) r5
            boolean r5 = r5.E2()
            if (r5 == 0) goto L8e
            return r8
        L52:
            int r7 = r5.getKindSet()
            r7 = r7 & r3
            if (r7 == 0) goto L8e
            boolean r7 = r5 instanceof com.google.inputmethod.k33
            if (r7 == 0) goto L8e
            r7 = r5
            com.google.android.k33 r7 = (com.google.inputmethod.k33) r7
            androidx.compose.ui.b$c r7 = r7.getDelegate()
            r9 = r2
        L65:
            if (r7 == 0) goto L8b
            int r10 = r7.getKindSet()
            r10 = r10 & r3
            if (r10 == 0) goto L86
            int r9 = r9 + 1
            if (r9 != r8) goto L74
            r5 = r7
            goto L86
        L74:
            if (r6 != 0) goto L7d
            com.google.android.r58 r6 = new com.google.android.r58
            androidx.compose.ui.b$c[] r10 = new androidx.compose.ui.b.c[r0]
            r6.<init>(r10, r2)
        L7d:
            if (r5 == 0) goto L83
            r6.c(r5)
            r5 = r4
        L83:
            r6.c(r7)
        L86:
            androidx.compose.ui.b$c r7 = r7.getChild()
            goto L65
        L8b:
            if (r9 != r8) goto L8e
            goto L42
        L8e:
            androidx.compose.ui.b$c r5 = com.google.inputmethod.y23.b(r6)
            goto L42
        L93:
            androidx.compose.ui.b$c r1 = r1.getChild()
            goto L36
        L98:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.NodeCoordinator.Y3():boolean");
    }

    @Override // com.google.inputmethod.kn6
    public final kn6 Z() {
        if (!b()) {
            zw5.c("LayoutCoordinate operations are only valid when isAttached is true");
        }
        A3();
        return this.wrappedBy;
    }

    /* JADX INFO: renamed from: Z2, reason: from getter */
    public final boolean getForceMeasureWithLookaheadConstraints() {
        return this.forceMeasureWithLookaheadConstraints;
    }

    @Override // com.google.inputmethod.kn6
    public final long a() {
        return getMeasuredSize();
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable, com.google.inputmethod.gj7
    /* JADX INFO: renamed from: a1, reason: from getter */
    public LayoutNode getLayoutNode() {
        return this.layoutNode;
    }

    /* JADX INFO: renamed from: a3, reason: from getter */
    public final boolean getLastClip() {
        return this.lastClip;
    }

    @Override // com.google.inputmethod.kn6
    public boolean b() {
        return j3().getIsAttached();
    }

    @Override // com.google.inputmethod.kn6
    public long b0(long relativeToWindow) {
        if (!b()) {
            zw5.c("LayoutCoordinate operations are only valid when isAttached is true");
        }
        kn6 kn6VarF = ln6.f(this);
        return Q(kn6VarF, rn8.p(fo6.b(getLayoutNode()).t(relativeToWindow), ln6.h(kn6VarF)));
    }

    /* JADX INFO: renamed from: b3, reason: from getter */
    public final boolean getLastLayerDrawingWasSkipped() {
        return this.lastLayerDrawingWasSkipped;
    }

    public long b4(long position, boolean includeMotionFrameOfReference) {
        dw8 dw8Var = this.layer;
        if (dw8Var != null) {
            position = dw8Var.c(position, false);
        }
        return (includeMotionFrameOfReference || !getIsPlacedUnderMotionFrameOfReference()) ? h16.c(position, getPosition()) : position;
    }

    public final long c3() {
        return getMeasurementConstraints();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public void d2() throws KotlinNothingValueException {
        GraphicsLayer graphicsLayer = this.explicitLayer;
        if (graphicsLayer != null) {
            W0(getPosition(), this.zIndex, graphicsLayer);
        } else {
            X0(getPosition(), this.zIndex, this.layerBlock);
        }
    }

    /* JADX INFO: renamed from: d3, reason: from getter */
    public final xkb getLastShape() {
        return this.lastShape;
    }

    public final gba d4() {
        if (!b()) {
            return gba.INSTANCE.a();
        }
        kn6 kn6VarF = ln6.f(this);
        MutableRect mutableRectH3 = h3();
        long jN2 = N2(g3());
        int i = (int) (jN2 >> 32);
        mutableRectH3.i(-Float.intBitsToFloat(i));
        int i2 = (int) (jN2 & 4294967295L);
        mutableRectH3.k(-Float.intBitsToFloat(i2));
        mutableRectH3.j(J0() + Float.intBitsToFloat(i));
        mutableRectH3.h(G0() + Float.intBitsToFloat(i2));
        NodeCoordinator nodeCoordinator = this;
        while (nodeCoordinator != kn6VarF) {
            nodeCoordinator.M3(mutableRectH3, false, true);
            if (mutableRectH3.f()) {
                return gba.INSTANCE.a();
            }
            nodeCoordinator = nodeCoordinator.wrappedBy;
            Intrinsics.g(nodeCoordinator);
        }
        return j58.a(mutableRectH3);
    }

    /* JADX INFO: renamed from: e3, reason: from getter */
    public final dw8 getLayer() {
        return this.layer;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v8 */
    @Override // com.google.inputmethod.ij7, com.google.inputmethod.f66
    /* JADX INFO: renamed from: f */
    public Object getParentData() {
        if (!getLayoutNode().getNodes().p(ni8.a(64))) {
            return null;
        }
        j3();
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        for (androidx.compose.ui.b.c tail = getLayoutNode().getNodes().getTail(); tail != null; tail = tail.getParent()) {
            if ((ni8.a(64) & tail.getKindSet()) != 0) {
                int iA = ni8.a(64);
                r58 r58Var = null;
                androidx.compose.ui.b.c cVarJ = tail;
                while (cVarJ != 0) {
                    if (cVarJ instanceof x19) {
                        objectRef.element = ((x19) cVarJ).r(getLayoutNode().getDensity(), objectRef.element);
                    } else if ((cVarJ.getKindSet() & iA) != 0 && (cVarJ instanceof k33)) {
                        androidx.compose.ui.b.c cVarN3 = ((k33) cVarJ).getDelegate();
                        int i = 0;
                        cVarJ = cVarJ;
                        while (cVarN3 != null) {
                            if ((cVarN3.getKindSet() & iA) != 0) {
                                i++;
                                if (i == 1) {
                                    cVarJ = cVarN3;
                                } else {
                                    if (r58Var == null) {
                                        r58Var = new r58(new androidx.compose.ui.b.c[16], 0);
                                    }
                                    if (cVarJ != 0) {
                                        r58Var.c(cVarJ);
                                        cVarJ = 0;
                                    }
                                    r58Var.c(cVarN3);
                                }
                            }
                            cVarN3 = cVarN3.getChild();
                            cVarJ = cVarJ;
                        }
                        if (i == 1) {
                        }
                    }
                    cVarJ = y23.j(r58Var);
                }
            }
        }
        return objectRef.element;
    }

    @Override // com.google.inputmethod.kn6
    public long f0(kn6 sourceCoordinates, long relativeToSource, boolean includeMotionFrameOfReference) {
        if (sourceCoordinates instanceof ua7) {
            ua7 ua7Var = (ua7) sourceCoordinates;
            ua7Var.c().A3();
            return rn8.e(ua7Var.f0(this, rn8.e(relativeToSource ^ (-9223372034707292160L)), includeMotionFrameOfReference) ^ (-9223372034707292160L));
        }
        NodeCoordinator nodeCoordinatorA4 = a4(sourceCoordinates);
        nodeCoordinatorA4.A3();
        NodeCoordinator nodeCoordinatorT2 = T2(nodeCoordinatorA4);
        while (nodeCoordinatorA4 != nodeCoordinatorT2) {
            relativeToSource = nodeCoordinatorA4.b4(relativeToSource, includeMotionFrameOfReference);
            nodeCoordinatorA4 = nodeCoordinatorA4.wrappedBy;
            Intrinsics.g(nodeCoordinatorA4);
        }
        return L2(nodeCoordinatorT2, relativeToSource, includeMotionFrameOfReference);
    }

    /* JADX INFO: renamed from: f3 */
    public abstract i getLookaheadDelegate();

    public final long g3() {
        return this.layerDensity.b1(getLayoutNode().getViewConfiguration().g());
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final void g4(Function1<? super androidx.compose.ui.graphics.m, Unit> layerBlock, boolean forceUpdateLayerParameters) throws KotlinNothingValueException {
        m owner;
        if (!(layerBlock == null || this.explicitLayer == null)) {
            zw5.a("layerBlock can't be provided when explicitLayer is provided");
        }
        LayoutNode layoutNode = getLayoutNode();
        boolean z = (!forceUpdateLayerParameters && this.layerBlock == layerBlock && Intrinsics.e(this.layerDensity, layoutNode.getDensity()) && this.layerLayoutDirection == layoutNode.getLayoutDirection()) ? false : true;
        this.layerDensity = layoutNode.getDensity();
        this.layerLayoutDirection = layoutNode.getLayoutDirection();
        if (layoutNode.b() && layerBlock != null) {
            this.layerBlock = layerBlock;
            if (this.layer != null) {
                if (z) {
                    j4(this, false, 1, null);
                    return;
                }
                return;
            }
            dw8 dw8VarI = m.I(fo6.b(layoutNode), Y2(), this.invalidateParentLayer, null, 4, null);
            dw8VarI.d(getMeasuredSize());
            dw8VarI.j(getPosition());
            this.layer = dw8VarI;
            j4(this, false, 1, null);
            layoutNode.T1(true);
            this.invalidateParentLayer.invoke();
            return;
        }
        this.layerBlock = null;
        dw8 dw8Var = this.layer;
        if (dw8Var != null) {
            if (!bi7.a(dw8Var.mo52getUnderlyingMatrixsQKQjiQ())) {
                layoutNode.s1(this);
            }
            dw8Var.destroy();
            this.layer = null;
            layoutNode.T1(true);
            this.invalidateParentLayer.invoke();
            if (b() && layoutNode.x() && (owner = layoutNode.getOwner()) != null) {
                owner.E(layoutNode);
            }
        }
        this.lastLayerDrawingWasSkipped = false;
    }

    @Override // com.google.inputmethod.f43
    public float getDensity() {
        return getLayoutNode().getDensity().getDensity();
    }

    @Override // com.google.inputmethod.h66
    public LayoutDirection getLayoutDirection() {
        return getLayoutNode().getLayoutDirection();
    }

    protected final MutableRect h3() {
        MutableRect mutableRect = this._rectCache;
        if (mutableRect != null) {
            return mutableRect;
        }
        MutableRect mutableRect2 = new MutableRect(0.0f, 0.0f, 0.0f, 0.0f);
        this._rectCache = mutableRect2;
        return mutableRect2;
    }

    @Override // com.google.inputmethod.kn6
    public long i(long relativeToScreen) {
        if (!b()) {
            zw5.c("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return Q(ln6.f(this), fo6.b(getLayoutNode()).i(relativeToScreen));
    }

    @Override // com.google.inputmethod.kn6
    public void j0(kn6 sourceCoordinates, float[] matrix) {
        NodeCoordinator nodeCoordinatorA4 = a4(sourceCoordinates);
        nodeCoordinatorA4.A3();
        NodeCoordinator nodeCoordinatorT2 = T2(nodeCoordinatorA4);
        zh7.i(matrix);
        nodeCoordinatorA4.f4(nodeCoordinatorT2, matrix);
        e4(nodeCoordinatorT2, matrix);
    }

    public abstract androidx.compose.ui.b.c j3();

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    @Override // com.google.inputmethod.kn6
    public void k0(float[] matrix) throws KotlinNothingValueException {
        m mVarB = fo6.b(getLayoutNode());
        NodeCoordinator nodeCoordinatorA4 = a4(ln6.f(this));
        f4(nodeCoordinatorA4, matrix);
        if (mVarB instanceof ci7) {
            ((ci7) mVarB).n(matrix);
            return;
        }
        long j = ln6.j(nodeCoordinatorA4);
        if ((9223372034707292159L & j) != 9205357640488583168L) {
            zh7.r(matrix, Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), 0.0f);
        }
    }

    /* JADX INFO: renamed from: k3, reason: from getter */
    public final boolean getWasLayerBlockInvoked() {
        return this.wasLayerBlockInvoked;
    }

    protected final boolean k4(long pointerPosition) {
        if ((((9187343241974906880L ^ (pointerPosition & 9187343241974906880L)) - 4294967297L) & (-9223372034707292160L)) != 0) {
            return false;
        }
        dw8 dw8Var = this.layer;
        return dw8Var == null || !this.isClipping || dw8Var.f(pointerPosition);
    }

    /* JADX INFO: renamed from: l3, reason: from getter */
    public final NodeCoordinator getWrapped() {
        return this.wrapped;
    }

    @Override // com.google.inputmethod.kn6
    public long m(long relativeToLocal) {
        if (!b()) {
            zw5.c("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return fo6.b(getLayoutNode()).m(N(relativeToLocal));
    }

    /* JADX INFO: renamed from: m3, reason: from getter */
    public final NodeCoordinator getWrappedBy() {
        return this.wrappedBy;
    }

    /* JADX INFO: renamed from: n3, reason: from getter */
    public final float getZIndex() {
        return this.zIndex;
    }

    public final androidx.compose.ui.b.c p3(int type) {
        boolean zI = oi8.i(type);
        androidx.compose.ui.b.c cVarJ3 = j3();
        if (!zI && (cVarJ3 = cVarJ3.getParent()) == null) {
            return null;
        }
        for (androidx.compose.ui.b.c cVarQ3 = q3(zI); cVarQ3 != null && (cVarQ3.getAggregateChildKindSet() & type) != 0; cVarQ3 = cVarQ3.getChild()) {
            if ((cVarQ3.getKindSet() & type) != 0) {
                return cVarQ3;
            }
            if (cVarQ3 == cVarJ3) {
                return null;
            }
        }
        return null;
    }

    @Override // com.google.inputmethod.kn6
    public boolean t() {
        return getIsPlacedUnderMotionFrameOfReference();
    }

    public final void t3(d hitTestSource, long pointerPosition, hd5 hitTestResult, int pointerType, boolean isInLayer) {
        boolean z;
        androidx.compose.ui.b.c cVarP3 = p3(hitTestSource.a());
        boolean z2 = false;
        if (!k4(pointerPosition)) {
            if (androidx.compose.ui.input.pointer.j.i(pointerType, androidx.compose.ui.input.pointer.j.INSTANCE.d())) {
                float fO2 = O2(pointerPosition, g3());
                if ((Float.floatToRawIntBits(fO2) & Integer.MAX_VALUE) >= 2139095040 || !hitTestResult.u(fO2, false)) {
                    return;
                }
                s3(cVarP3, hitTestSource, pointerPosition, hitTestResult, pointerType, false, fO2);
                return;
            }
            return;
        }
        if (cVarP3 == null) {
            u3(hitTestSource, pointerPosition, hitTestResult, pointerType, isInLayer);
            return;
        }
        if (x3(pointerPosition)) {
            r3(cVarP3, hitTestSource, pointerPosition, hitTestResult, pointerType, isInLayer);
            return;
        }
        float fO3 = !androidx.compose.ui.input.pointer.j.i(pointerType, androidx.compose.ui.input.pointer.j.INSTANCE.d()) ? Float.POSITIVE_INFINITY : O2(pointerPosition, g3());
        if ((Float.floatToRawIntBits(fO3) & Integer.MAX_VALUE) < 2139095040) {
            z = isInLayer;
            if (hitTestResult.u(fO3, z)) {
                z2 = true;
            }
        } else {
            z = isInLayer;
        }
        I3(cVarP3, hitTestSource, pointerPosition, hitTestResult, pointerType, z, fO3, z2);
    }

    public void u3(d hitTestSource, long pointerPosition, hd5 hitTestResult, int pointerType, boolean isInLayer) {
        NodeCoordinator nodeCoordinator = this.wrapped;
        if (nodeCoordinator != null) {
            nodeCoordinator.t3(hitTestSource, V2(nodeCoordinator, pointerPosition, false, 2, null), hitTestResult, pointerType, isInLayer);
        }
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public kn6 v() {
        return this;
    }

    public void v3() {
        dw8 dw8Var = this.layer;
        if (dw8Var != null) {
            dw8Var.invalidate();
            return;
        }
        NodeCoordinator nodeCoordinator = this.wrappedBy;
        if (nodeCoordinator != null) {
            nodeCoordinator.v3();
        }
    }

    @Override // com.google.inputmethod.hm4
    /* JADX INFO: renamed from: w2 */
    public float getFontScale() {
        return getLayoutNode().getDensity().getFontScale();
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public LookaheadCapablePlaceable x1() {
        return this.wrapped;
    }

    protected final boolean x3(long pointerPosition) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (pointerPosition >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (pointerPosition & 4294967295L));
        return fIntBitsToFloat >= 0.0f && fIntBitsToFloat2 >= 0.0f && fIntBitsToFloat < ((float) J0()) && fIntBitsToFloat2 < ((float) G0());
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public boolean y1() {
        return this._measureResult != null;
    }

    public final boolean y3() {
        if (this.layer != null && this.lastLayerAlpha <= 0.0f) {
            return true;
        }
        NodeCoordinator nodeCoordinator = this.wrappedBy;
        if (nodeCoordinator != null) {
            return nodeCoordinator.y3();
        }
        return false;
    }

    @Override // com.google.inputmethod.ew8
    public boolean z0() {
        return (this.layer == null || this.released || !getLayoutNode().b()) ? false : true;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public fj7 z1() {
        fj7 fj7Var = this._measureResult;
        if (fj7Var != null) {
            return fj7Var;
        }
        throw new IllegalStateException("Asking for measurement result of unmeasured layout modifier");
    }
}
