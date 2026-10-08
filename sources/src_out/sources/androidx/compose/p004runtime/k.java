package androidx.compose.p004runtime;

import androidx.collection.ScatterSet;
import androidx.collection.d;
import androidx.compose.p004runtime.k;
import androidx.compose.p004runtime.snapshots.i;
import com.google.android.qjd;
import com.google.inputmethod.ComposeStackTraceFrame;
import com.google.inputmethod.IntRef;
import com.google.inputmethod.JoinedKey;
import com.google.inputmethod.ObjectLocation;
import com.google.inputmethod.SlotReader;
import com.google.inputmethod.SlotWriter;
import com.google.inputmethod.StaticValueHolder;
import com.google.inputmethod.a69;
import com.google.inputmethod.aq1;
import com.google.inputmethod.b69;
import com.google.inputmethod.c1e;
import com.google.inputmethod.c81;
import com.google.inputmethod.cna;
import com.google.inputmethod.cub;
import com.google.inputmethod.e81;
import com.google.inputmethod.ei9;
import com.google.inputmethod.ena;
import com.google.inputmethod.ez;
import com.google.inputmethod.fob;
import com.google.inputmethod.fq1;
import com.google.inputmethod.fub;
import com.google.inputmethod.g81;
import com.google.inputmethod.gs1;
import com.google.inputmethod.hq1;
import com.google.inputmethod.hs1;
import com.google.inputmethod.iz5;
import com.google.inputmethod.jq1;
import com.google.inputmethod.js1;
import com.google.inputmethod.k58;
import com.google.inputmethod.k79;
import com.google.inputmethod.ko1;
import com.google.inputmethod.ku4;
import com.google.inputmethod.l4b;
import com.google.inputmethod.lu4;
import com.google.inputmethod.m48;
import com.google.inputmethod.mg;
import com.google.inputmethod.n08;
import com.google.inputmethod.o41;
import com.google.inputmethod.o48;
import com.google.inputmethod.o58;
import com.google.inputmethod.os9;
import com.google.inputmethod.p04;
import com.google.inputmethod.p47;
import com.google.inputmethod.pe4;
import com.google.inputmethod.pq1;
import com.google.inputmethod.pr1;
import com.google.inputmethod.q08;
import com.google.inputmethod.q6b;
import com.google.inputmethod.qaa;
import com.google.inputmethod.r08;
import com.google.inputmethod.r58;
import com.google.inputmethod.r6b;
import com.google.inputmethod.rr1;
import com.google.inputmethod.s6b;
import com.google.inputmethod.sr1;
import com.google.inputmethod.t16;
import com.google.inputmethod.tub;
import com.google.inputmethod.ui6;
import com.google.inputmethod.ur1;
import com.google.inputmethod.vbd;
import com.google.inputmethod.w3c;
import com.google.inputmethod.wr1;
import com.google.inputmethod.wu4;
import com.google.inputmethod.x22;
import com.google.inputmethod.x43;
import com.google.inputmethod.yea;
import com.google.inputmethod.yu4;
import com.google.inputmethod.z15;
import com.google.inputmethod.zea;
import com.google.inputmethod.zr1;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.f;
import kotlin.collections.m;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000¦\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\b*\u0002Â\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0004\u0087\u0003ð\u0001BQ\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0018\u0010\u0016J\u0017\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0014H\u0002¢\u0006\u0004\b!\u0010\u0016J\u000f\u0010\"\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\"\u0010\u0016J\u0019\u0010$\u001a\u00020\u00142\b\u0010#\u001a\u0004\u0018\u00010\u001dH\u0002¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0019H\u0002¢\u0006\u0004\b&\u0010'J\u000f\u0010)\u001a\u00020(H\u0002¢\u0006\u0004\b)\u0010*J\u0017\u0010,\u001a\u00020(2\u0006\u0010+\u001a\u00020\u0019H\u0002¢\u0006\u0004\b,\u0010-J\u001f\u00100\u001a\u00020(2\u0006\u0010.\u001a\u00020(2\u0006\u0010/\u001a\u00020(H\u0002¢\u0006\u0004\b0\u00101J\u0017\u00103\u001a\u00020\u00142\u0006\u00102\u001a\u00020(H\u0002¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\u0014H\u0002¢\u0006\u0004\b5\u0010\u0016J\u000f\u00106\u001a\u00020\u0014H\u0002¢\u0006\u0004\b6\u0010\u0016J\u000f\u00107\u001a\u00020\u0014H\u0002¢\u0006\u0004\b7\u0010\u0016J!\u0010;\u001a\u00020\u00142\u0006\u00109\u001a\u0002082\b\u0010:\u001a\u0004\u0018\u00010\u001dH\u0002¢\u0006\u0004\b;\u0010<J3\u0010@\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010=\u001a\u0004\u0018\u00010\u001d2\u0006\u0010?\u001a\u00020>2\b\u0010:\u001a\u0004\u0018\u00010\u001dH\u0002¢\u0006\u0004\b@\u0010AJ!\u0010D\u001a\u00020\u00142\u0006\u00109\u001a\u0002082\b\u0010C\u001a\u0004\u0018\u00010BH\u0002¢\u0006\u0004\bD\u0010EJ\u001f\u0010H\u001a\u00020\u00142\u0006\u0010F\u001a\u00020\u00192\u0006\u0010G\u001a\u000208H\u0002¢\u0006\u0004\bH\u0010IJ\u0017\u0010J\u001a\u00020\u00142\u0006\u00109\u001a\u000208H\u0002¢\u0006\u0004\bJ\u0010KJ\u000f\u0010L\u001a\u00020\u0014H\u0002¢\u0006\u0004\bL\u0010\u0016J\u0017\u0010N\u001a\u00020\u00192\u0006\u0010M\u001a\u00020\u0019H\u0002¢\u0006\u0004\bN\u0010OJ\u001f\u0010Q\u001a\u00020\u00142\u0006\u0010+\u001a\u00020\u00192\u0006\u0010P\u001a\u00020\u0019H\u0002¢\u0006\u0004\bQ\u0010RJ/\u0010V\u001a\u00020\u00192\u0006\u0010S\u001a\u00020\u00192\u0006\u0010+\u001a\u00020\u00192\u0006\u0010T\u001a\u00020\u00192\u0006\u0010U\u001a\u00020\u0019H\u0002¢\u0006\u0004\bV\u0010WJ\u0017\u0010X\u001a\u00020\u00192\u0006\u0010+\u001a\u00020\u0019H\u0002¢\u0006\u0004\bX\u0010OJ\u0017\u0010Y\u001a\u00020\u00192\u0006\u0010+\u001a\u00020\u0019H\u0002¢\u0006\u0004\bY\u0010OJ\u001f\u0010[\u001a\u00020\u00142\u0006\u0010+\u001a\u00020\u00192\u0006\u0010Z\u001a\u00020\u0019H\u0002¢\u0006\u0004\b[\u0010RJ\u000f\u0010\\\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\\\u0010\u0016J'\u0010`\u001a\u00020\u00142\u0006\u0010]\u001a\u00020\u00192\u0006\u0010^\u001a\u00020\u00192\u0006\u0010_\u001a\u00020\u0019H\u0002¢\u0006\u0004\b`\u0010aJ\u001f\u0010c\u001a\u00020\u00142\u0006\u0010+\u001a\u00020\u00192\u0006\u0010b\u001a\u00020\u0019H\u0002¢\u0006\u0004\bc\u0010RJ/\u0010g\u001a\u00060dj\u0002`e2\u0006\u0010+\u001a\u00020\u00192\u0006\u0010T\u001a\u00020\u00192\n\u0010f\u001a\u00060dj\u0002`eH\u0002¢\u0006\u0004\bg\u0010hJ\u001b\u0010j\u001a\u00020\u0019*\u00020i2\u0006\u0010+\u001a\u00020\u0019H\u0002¢\u0006\u0004\bj\u0010kJ\u000f\u0010l\u001a\u00020\u0014H\u0002¢\u0006\u0004\bl\u0010\u0016J\u000f\u0010m\u001a\u00020\u0014H\u0002¢\u0006\u0004\bm\u0010\u0016J\u0017\u0010p\u001a\u00020\u00142\u0006\u0010o\u001a\u00020nH\u0002¢\u0006\u0004\bp\u0010qJ%\u0010t\u001a\u0010\u0012\u0004\u0012\u00020s\u0012\u0004\u0012\u00020\u0014\u0018\u00010r2\u0006\u0010o\u001a\u00020nH\u0002¢\u0006\u0004\bt\u0010uJ9\u0010{\u001a\u00020\u00142\u000e\u0010w\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0v2\u0006\u0010x\u001a\u00020(2\b\u0010y\u001a\u0004\u0018\u00010\u001d2\u0006\u0010z\u001a\u000208H\u0002¢\u0006\u0004\b{\u0010|J/\u0010\u0081\u0001\u001a\u00020\u00142\u001b\u0010\u0080\u0001\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u007f\u0012\u0006\u0012\u0004\u0018\u00010\u007f0~0}H\u0002¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001Jp\u0010\u008a\u0001\u001a\u00028\u0000\"\u0005\b\u0000\u0010\u0083\u00012\f\b\u0002\u0010\u0085\u0001\u001a\u0005\u0018\u00010\u0084\u00012\f\b\u0002\u0010\u0086\u0001\u001a\u0005\u0018\u00010\u0084\u00012\n\b\u0002\u0010M\u001a\u0004\u0018\u00010\u00192\u001d\b\u0002\u0010\u0087\u0001\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0~0}2\u000e\u0010\u0089\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000\u0088\u0001H\u0002¢\u0006\u0006\b\u008a\u0001\u0010\u008b\u0001J\u0015\u0010\u008d\u0001\u001a\u0005\u0018\u00010\u008c\u0001H\u0002¢\u0006\u0006\b\u008d\u0001\u0010\u008e\u0001J,\u0010\u0091\u0001\u001a\t\u0012\u0005\u0012\u00030\u0090\u00010}2\u0006\u0010+\u001a\u00020\u00192\t\u0010\u008f\u0001\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0006\b\u0091\u0001\u0010\u0092\u0001J9\u0010\u0095\u0001\u001a\u00020\u00142\u0014\u0010\u0094\u0001\u001a\u000f\u0012\u0004\u0012\u00020n\u0012\u0004\u0012\u00020\u001d0\u0093\u00012\u000f\u0010w\u001a\u000b\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0088\u0001H\u0002¢\u0006\u0006\b\u0095\u0001\u0010\u0096\u0001J \u0010\u0097\u0001\u001a\u0004\u0018\u00010\u001d*\u00020i2\u0006\u0010M\u001a\u00020\u0019H\u0002¢\u0006\u0006\b\u0097\u0001\u0010\u0098\u0001J\u0011\u0010\u0099\u0001\u001a\u00020\u0014H\u0002¢\u0006\u0005\b\u0099\u0001\u0010\u0016J\u0011\u0010\u009a\u0001\u001a\u00020\u0014H\u0002¢\u0006\u0005\b\u009a\u0001\u0010\u0016J\u001c\u0010\u009d\u0001\u001a\u00020\u00142\b\u0010\u009c\u0001\u001a\u00030\u009b\u0001H\u0002¢\u0006\u0006\b\u009d\u0001\u0010\u009e\u0001J\u0011\u0010\u009f\u0001\u001a\u00020\u0014H\u0002¢\u0006\u0005\b\u009f\u0001\u0010\u0016J\u001a\u0010¡\u0001\u001a\u00020\u00142\u0007\u0010 \u0001\u001a\u00020\u0019H\u0002¢\u0006\u0005\b¡\u0001\u0010\u001cJ\u0011\u0010¢\u0001\u001a\u00020\u0014H\u0002¢\u0006\u0005\b¢\u0001\u0010\u0016J\u0011\u0010£\u0001\u001a\u00020\u0014H\u0002¢\u0006\u0005\b£\u0001\u0010\u0016J\u0011\u0010¤\u0001\u001a\u00020\u0014H\u0002¢\u0006\u0005\b¤\u0001\u0010\u0016J\u0019\u0010¥\u0001\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u0019H\u0017¢\u0006\u0005\b¥\u0001\u0010\u001cJ\u0011\u0010¦\u0001\u001a\u00020\u0014H\u0017¢\u0006\u0005\b¦\u0001\u0010\u0016J\u0019\u0010§\u0001\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u0019H\u0017¢\u0006\u0005\b§\u0001\u0010\u001cJ\u0011\u0010¨\u0001\u001a\u00020\u0014H\u0017¢\u0006\u0005\b¨\u0001\u0010\u0016J\u0011\u0010©\u0001\u001a\u00020\u0014H\u0017¢\u0006\u0005\b©\u0001\u0010\u0016J\u0011\u0010ª\u0001\u001a\u00020\u0014H\u0017¢\u0006\u0005\bª\u0001\u0010\u0016J#\u0010«\u0001\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0017¢\u0006\u0005\b«\u0001\u0010 J\u0011\u0010¬\u0001\u001a\u00020\u0014H\u0017¢\u0006\u0005\b¬\u0001\u0010\u0016J\u0011\u0010\u00ad\u0001\u001a\u00020\u0014H\u0010¢\u0006\u0005\b\u00ad\u0001\u0010\u0016J\u0011\u0010®\u0001\u001a\u00020\u0014H\u0016¢\u0006\u0005\b®\u0001\u0010\u0016J\u0011\u0010¯\u0001\u001a\u00020\u0014H\u0010¢\u0006\u0005\b¯\u0001\u0010\u0016J\u0011\u0010°\u0001\u001a\u00020\u0014H\u0010¢\u0006\u0005\b°\u0001\u0010\u0016J\u0011\u0010±\u0001\u001a\u00020\u0014H\u0016¢\u0006\u0005\b±\u0001\u0010\u0016J\u0011\u0010²\u0001\u001a\u00020\u0014H\u0016¢\u0006\u0005\b²\u0001\u0010\u0016J)\u0010µ\u0001\u001a\u00020\u0014\"\u0005\b\u0000\u0010³\u00012\u000e\u0010´\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000\u0088\u0001H\u0016¢\u0006\u0006\bµ\u0001\u0010¶\u0001J\u0011\u0010·\u0001\u001a\u00020\u0014H\u0016¢\u0006\u0005\b·\u0001\u0010\u0016J\u0011\u0010¸\u0001\u001a\u00020\u0014H\u0016¢\u0006\u0005\b¸\u0001\u0010\u0016J#\u0010¹\u0001\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0005\b¹\u0001\u0010 J\u0011\u0010º\u0001\u001a\u00020\u0014H\u0016¢\u0006\u0005\bº\u0001\u0010\u0016J\u0011\u0010»\u0001\u001a\u00020\u0014H\u0010¢\u0006\u0005\b»\u0001\u0010\u0016J\u0011\u0010¼\u0001\u001a\u00020\u0014H\u0010¢\u0006\u0005\b¼\u0001\u0010\u0016J\u001a\u0010¾\u0001\u001a\u00020\u00142\u0007\u0010½\u0001\u001a\u00020\u0019H\u0016¢\u0006\u0005\b¾\u0001\u0010\u001cJD\u0010À\u0001\u001a\u00020\u0014\"\u0005\b\u0000\u0010«\u0001\"\u0005\b\u0001\u0010³\u00012\u0006\u0010#\u001a\u00028\u00002\u001a\u0010\u0089\u0001\u001a\u0015\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00140¿\u0001H\u0016¢\u0006\u0006\bÀ\u0001\u0010Á\u0001J(\u0010Ä\u0001\u001a\u00020\u001d2\t\u0010Â\u0001\u001a\u0004\u0018\u00010\u001d2\t\u0010Ã\u0001\u001a\u0004\u0018\u00010\u001dH\u0017¢\u0006\u0006\bÄ\u0001\u0010Å\u0001J\u0014\u0010Æ\u0001\u001a\u0004\u0018\u00010\u001dH\u0001¢\u0006\u0006\bÆ\u0001\u0010Ç\u0001J\u0014\u0010È\u0001\u001a\u0004\u0018\u00010\u001dH\u0001¢\u0006\u0006\bÈ\u0001\u0010Ç\u0001J\u001c\u0010É\u0001\u001a\u0002082\b\u0010#\u001a\u0004\u0018\u00010\u001dH\u0017¢\u0006\u0006\bÉ\u0001\u0010Ê\u0001J\u001c\u0010³\u0001\u001a\u0002082\b\u0010#\u001a\u0004\u0018\u00010\u001dH\u0017¢\u0006\u0006\b³\u0001\u0010Ê\u0001J\u001a\u0010Ë\u0001\u001a\u0002082\u0006\u0010#\u001a\u000208H\u0017¢\u0006\u0006\bË\u0001\u0010Ì\u0001J\u001b\u0010Î\u0001\u001a\u0002082\u0007\u0010#\u001a\u00030Í\u0001H\u0017¢\u0006\u0006\bÎ\u0001\u0010Ï\u0001J\u001a\u0010Ð\u0001\u001a\u0002082\u0006\u0010#\u001a\u00020dH\u0017¢\u0006\u0006\bÐ\u0001\u0010Ñ\u0001J\u001a\u0010Ò\u0001\u001a\u0002082\u0006\u0010#\u001a\u00020\u0019H\u0017¢\u0006\u0006\bÒ\u0001\u0010Ó\u0001J\u001b\u0010Ô\u0001\u001a\u00020\u00142\b\u0010#\u001a\u0004\u0018\u00010\u001dH\u0001¢\u0006\u0005\bÔ\u0001\u0010%J\u001b\u0010Õ\u0001\u001a\u00020\u00142\b\u0010#\u001a\u0004\u0018\u00010\u001dH\u0001¢\u0006\u0005\bÕ\u0001\u0010%J\"\u0010×\u0001\u001a\u00020\u00142\u000e\u0010Ö\u0001\u001a\t\u0012\u0004\u0012\u00020\u00140\u0088\u0001H\u0016¢\u0006\u0006\b×\u0001\u0010¶\u0001J\u001f\u0010Ù\u0001\u001a\u00020\u00142\u000b\u0010#\u001a\u0007\u0012\u0002\b\u00030Ø\u0001H\u0017¢\u0006\u0006\bÙ\u0001\u0010Ú\u0001J\u0011\u0010Û\u0001\u001a\u00020\u0014H\u0017¢\u0006\u0005\bÛ\u0001\u0010\u0016J)\u0010Þ\u0001\u001a\u00020\u00142\u0015\u0010Ý\u0001\u001a\u0010\u0012\u000b\b\u0001\u0012\u0007\u0012\u0002\b\u00030Ø\u00010Ü\u0001H\u0017¢\u0006\u0006\bÞ\u0001\u0010ß\u0001J\u0011\u0010à\u0001\u001a\u00020\u0014H\u0017¢\u0006\u0005\bà\u0001\u0010\u0016J(\u0010â\u0001\u001a\u00028\u0000\"\u0005\b\u0000\u0010³\u00012\r\u0010\u001a\u001a\t\u0012\u0004\u0012\u00028\u00000á\u0001H\u0017¢\u0006\u0006\bâ\u0001\u0010ã\u0001J\u0012\u0010ä\u0001\u001a\u00020\u0004H\u0016¢\u0006\u0006\bä\u0001\u0010å\u0001J%\u0010ç\u0001\u001a\u0002082\u0006\u0010o\u001a\u00020n2\t\u0010æ\u0001\u001a\u0004\u0018\u00010\u001dH\u0010¢\u0006\u0006\bç\u0001\u0010è\u0001J\u0011\u0010é\u0001\u001a\u00020\u0014H\u0017¢\u0006\u0005\bé\u0001\u0010\u0016J$\u0010ì\u0001\u001a\u0002082\u0007\u0010ê\u0001\u001a\u0002082\u0007\u0010ë\u0001\u001a\u00020\u0019H\u0017¢\u0006\u0006\bì\u0001\u0010í\u0001J\u0011\u0010î\u0001\u001a\u00020\u0014H\u0017¢\u0006\u0005\bî\u0001\u0010\u0016J\u001a\u0010ð\u0001\u001a\u00020\u00142\u0007\u0010ï\u0001\u001a\u000208H\u0017¢\u0006\u0005\bð\u0001\u0010KJ\u001b\u0010ò\u0001\u001a\u00030ñ\u00012\u0006\u0010\u001a\u001a\u00020\u0019H\u0017¢\u0006\u0006\bò\u0001\u0010ó\u0001J\u0015\u0010õ\u0001\u001a\u0005\u0018\u00010ô\u0001H\u0017¢\u0006\u0006\bõ\u0001\u0010ö\u0001J(\u0010÷\u0001\u001a\u00020\u00142\n\u0010#\u001a\u0006\u0012\u0002\b\u00030v2\b\u0010y\u001a\u0004\u0018\u00010\u001dH\u0017¢\u0006\u0006\b÷\u0001\u0010ø\u0001J/\u0010ù\u0001\u001a\u00020\u00142\u001b\u0010\u0080\u0001\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u007f\u0012\u0006\u0012\u0004\u0018\u00010\u007f0~0}H\u0017¢\u0006\u0006\bù\u0001\u0010\u0082\u0001J\u001d\u0010ú\u0001\u001a\u00030\u008c\u00012\b\u0010#\u001a\u0004\u0018\u00010\u001dH\u0010¢\u0006\u0006\bú\u0001\u0010û\u0001J\u0019\u0010ü\u0001\u001a\t\u0012\u0005\u0012\u00030\u0090\u00010}H\u0010¢\u0006\u0006\bü\u0001\u0010ý\u0001JC\u0010\u0080\u0002\u001a\u00020\u00142\u0014\u0010\u0094\u0001\u001a\u000f\u0012\u0004\u0012\u00020n\u0012\u0004\u0012\u00020\u001d0\u0093\u00012\r\u0010w\u001a\t\u0012\u0004\u0012\u00020\u00140\u0088\u00012\n\u0010ÿ\u0001\u001a\u0005\u0018\u00010þ\u0001H\u0010¢\u0006\u0006\b\u0080\u0002\u0010\u0081\u0002J\"\u0010\u0082\u0002\u001a\u00020\u00142\u000e\u0010\u0089\u0001\u001a\t\u0012\u0004\u0012\u00020\u00140\u0088\u0001H\u0010¢\u0006\u0006\b\u0082\u0002\u0010¶\u0001J4\u0010\u0083\u0002\u001a\u0002082\u0014\u0010\u0094\u0001\u001a\u000f\u0012\u0004\u0012\u00020n\u0012\u0004\u0012\u00020\u001d0\u0093\u00012\n\u0010ÿ\u0001\u001a\u0005\u0018\u00010þ\u0001H\u0010¢\u0006\u0006\b\u0083\u0002\u0010\u0084\u0002J(\u0010\u0085\u0002\u001a\u00020\u00142\u0014\u0010\u0094\u0001\u001a\u000f\u0012\u0004\u0012\u00020n\u0012\u0004\u0012\u00020\u001d0\u0093\u0001H\u0010¢\u0006\u0006\b\u0085\u0002\u0010\u0086\u0002J\u0014\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0006\b\u0083\u0001\u0010Ç\u0001J\u001b\u0010\u0087\u0002\u001a\u00020\u00142\b\u0010#\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0005\b\u0087\u0002\u0010%J\u001b\u0010\u0089\u0002\u001a\u00020\u00142\u0007\u0010o\u001a\u00030\u0088\u0002H\u0016¢\u0006\u0006\b\u0089\u0002\u0010\u008a\u0002R\"\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bð\u0001\u0010\u008b\u0002\u001a\u0006\b\u008c\u0002\u0010\u008d\u0002R\u0016\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008e\u0002\u0010\u008f\u0002R\u0016\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\b\n\u0006\bù\u0001\u0010\u0090\u0002R\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÀ\u0001\u0010\u0091\u0002R\u0018\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0092\u0002\u0010\u0093\u0002R\u0018\u0010\r\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bì\u0001\u0010\u0093\u0002R\u0016\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¾\u0001\u0010\u0094\u0002R\u001e\u0010\u0011\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bÞ\u0001\u0010\u0095\u0002\u001a\u0006\b\u0096\u0002\u0010\u0097\u0002R \u0010\u009b\u0002\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010B0\u0098\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0099\u0002\u0010\u009a\u0002R\u001b\u0010\u009d\u0002\u001a\u0004\u0018\u00010B8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b·\u0001\u0010\u009c\u0002R\u0019\u0010\u009e\u0002\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÛ\u0001\u0010Ä\u0001R\u0019\u0010\u009f\u0002\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¸\u0001\u0010Ä\u0001R\u0019\u0010 \u0002\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b×\u0001\u0010Ä\u0001R\u0018\u0010£\u0002\u001a\u00030¡\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b²\u0001\u0010¢\u0002R\u001c\u0010¦\u0002\u001a\u0005\u0018\u00010¤\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¹\u0001\u0010¥\u0002R\u001c\u0010©\u0002\u001a\u0005\u0018\u00010§\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bî\u0001\u0010¨\u0002R\u0019\u0010ª\u0002\u001a\u0002088\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÙ\u0001\u0010¬\u0001R\u0019\u0010«\u0002\u001a\u0002088\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b÷\u0001\u0010¬\u0001R\u0019\u0010\u00ad\u0002\u001a\u0002088\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¬\u0002\u0010¬\u0001R\u001f\u0010\u0087\u0001\u001a\n\u0012\u0005\u0012\u00030¯\u00020®\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¨\u0001\u0010°\u0002R\u0018\u0010±\u0002\u001a\u00030¡\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bâ\u0001\u0010¢\u0002R\u0019\u0010³\u0002\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bä\u0001\u0010²\u0002R\"\u0010¶\u0002\u001a\u000b\u0012\u0004\u0012\u00020(\u0018\u00010´\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÉ\u0001\u0010µ\u0002R\u0019\u0010·\u0002\u001a\u0002088\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b§\u0001\u0010¬\u0001R\u0018\u0010¸\u0002\u001a\u00030¡\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0089\u0002\u0010¢\u0002R\u0019\u0010¹\u0002\u001a\u0002088\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bË\u0001\u0010¬\u0001R\u0019\u0010º\u0002\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÎ\u0001\u0010Ä\u0001R\u0019\u0010»\u0002\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÒ\u0001\u0010Ä\u0001R\u0019\u0010¼\u0002\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÐ\u0001\u0010Ä\u0001R(\u0010Á\u0002\u001a\u0002088\u0010@\u0010X\u0090\u000e¢\u0006\u0017\n\u0006\b½\u0002\u0010¬\u0001\u001a\u0006\b¾\u0002\u0010¿\u0002\"\u0005\bÀ\u0002\u0010KR\u0018\u0010Ä\u0002\u001a\u00030Â\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bò\u0001\u0010Ã\u0002R\u001e\u0010Å\u0002\u001a\t\u0012\u0004\u0012\u00020n0\u0098\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008c\u0002\u0010\u009a\u0002R)\u0010Ç\u0002\u001a\u0002082\u0006\u0010#\u001a\u0002088\u0010@RX\u0090\u000e¢\u0006\u0010\n\u0006\bõ\u0001\u0010¬\u0001\u001a\u0006\bÆ\u0002\u0010¿\u0002R)\u0010É\u0002\u001a\u0002082\u0006\u0010#\u001a\u0002088\u0000@BX\u0080\u000e¢\u0006\u0010\n\u0006\bÄ\u0001\u0010¬\u0001\u001a\u0006\bÈ\u0002\u0010¿\u0002R)\u0010Ï\u0002\u001a\u00020i8\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b±\u0001\u0010Ê\u0002\u001a\u0006\bË\u0002\u0010Ì\u0002\"\u0006\bÍ\u0002\u0010Î\u0002R)\u0010Õ\u0002\u001a\u00020\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bÐ\u0002\u0010\u0090\u0002\u001a\u0006\bÑ\u0002\u0010Ò\u0002\"\u0006\bÓ\u0002\u0010Ô\u0002R\u001a\u0010Ø\u0002\u001a\u00030Ö\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0087\u0002\u0010×\u0002R\u0019\u0010Ù\u0002\u001a\u0002088\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bª\u0001\u0010¬\u0001R\u001b\u0010Ú\u0002\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b®\u0001\u0010²\u0002R,\u0010â\u0002\u001a\u0005\u0018\u00010Û\u00028\u0010@\u0010X\u0090\u000e¢\u0006\u0018\n\u0006\bÜ\u0002\u0010Ý\u0002\u001a\u0006\bÞ\u0002\u0010ß\u0002\"\u0006\bà\u0002\u0010á\u0002R\u0018\u0010å\u0002\u001a\u00030ã\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bº\u0001\u0010ä\u0002R\u001a\u0010ç\u0002\u001a\u00030\u009b\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¥\u0001\u0010æ\u0002R\u001a\u0010ê\u0002\u001a\u00030è\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0083\u0001\u0010é\u0002R\u001c\u0010í\u0002\u001a\u0005\u0018\u00010þ\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bë\u0002\u0010ì\u0002R\"\u0010ò\u0002\u001a\u0005\u0018\u00010î\u00028PX\u0090\u0004¢\u0006\u0010\n\u0006\b³\u0001\u0010ï\u0002\u001a\u0006\bð\u0002\u0010ñ\u0002R \u0010ö\u0002\u001a\u00030ó\u00028\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b©\u0001\u0010ô\u0002\u001a\u0006\bÐ\u0002\u0010õ\u0002R/\u0010G\u001a\u0002082\u0006\u0010#\u001a\u0002088\u0016@RX\u0097\u000e¢\u0006\u0017\n\u0006\b«\u0001\u0010¬\u0001\u0012\u0005\b÷\u0002\u0010\u0016\u001a\u0006\b½\u0002\u0010¿\u0002R8\u0010ú\u0002\u001a\u00060dj\u0002`e2\n\u0010#\u001a\u00060dj\u0002`e8\u0016@RX\u0097\u000e¢\u0006\u0017\n\u0006\bµ\u0001\u0010±\u0001\u0012\u0005\bù\u0002\u0010\u0016\u001a\u0006\b\u0092\u0002\u0010ø\u0002R\u001c\u0010ý\u0002\u001a\u0005\u0018\u00010û\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bà\u0001\u0010ü\u0002R\u001d\u0010\u0080\u0003\u001a\u0004\u0018\u00010\u001d*\u00020i8BX\u0082\u0004¢\u0006\b\u001a\u0006\bþ\u0002\u0010ÿ\u0002R\u0017\u0010\u0082\u0003\u001a\u0002088PX\u0090\u0004¢\u0006\b\u001a\u0006\b\u0081\u0003\u0010¿\u0002R\u001e\u0010\u0084\u0003\u001a\u0002088VX\u0097\u0004¢\u0006\u000f\u0012\u0005\b\u0083\u0003\u0010\u0016\u001a\u0006\b¬\u0002\u0010¿\u0002R\u001e\u0010\u0086\u0003\u001a\u0002088VX\u0097\u0004¢\u0006\u000f\u0012\u0005\b\u0085\u0003\u0010\u0016\u001a\u0006\b\u008e\u0002\u0010¿\u0002R\u0016\u0010\u0088\u0003\u001a\u00020\u00198VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0087\u0003\u0010'R\u0018\u0010\u008a\u0003\u001a\u00030û\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\bë\u0002\u0010\u0089\u0003R\u0018\u0010\u008d\u0003\u001a\u00030\u008b\u00038VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0099\u0002\u0010\u008c\u0003R\u0019\u0010\u0090\u0003\u001a\u0004\u0018\u00010n8PX\u0090\u0004¢\u0006\b\u001a\u0006\b\u008e\u0003\u0010\u008f\u0003R\u001a\u0010\u0092\u0003\u001a\u0005\u0018\u00010\u0088\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\bÜ\u0002\u0010\u0091\u0003¨\u0006\u0093\u0003"}, d2 = {"Landroidx/compose/runtime/k;", "Landroidx/compose/runtime/o;", "Lcom/google/android/ez;", "applier", "Landroidx/compose/runtime/f;", "parentContext", "Lcom/google/android/fub;", "slotTable", "", "Lcom/google/android/yea;", "abandonSet", "Lcom/google/android/g81;", "changes", "lateChanges", "Lcom/google/android/js1;", "observerHolder", "Landroidx/compose/runtime/g;", "composition", "<init>", "(Lcom/google/android/ez;Landroidx/compose/runtime/f;Lcom/google/android/fub;Ljava/util/Set;Lcom/google/android/g81;Lcom/google/android/g81;Lcom/google/android/js1;Landroidx/compose/runtime/g;)V", "", "O1", "()V", "Q0", "z0", "", "key", "L1", "(I)V", "", "dataKey", "M1", "(ILjava/lang/Object;)V", "P0", "G1", "value", "T1", "(Ljava/lang/Object;)V", "w1", "()I", "Lcom/google/android/a69;", "I0", "()Lcom/google/android/a69;", "group", "J0", "(I)Lcom/google/android/a69;", "parentScope", "currentProviders", "S1", "(Lcom/google/android/a69;Lcom/google/android/a69;)Lcom/google/android/a69;", "providers", "u1", "(Lcom/google/android/a69;)V", "R0", "H0", "X0", "", "isNode", "data", "N1", "(ZLjava/lang/Object;)V", "objectKey", "Lcom/google/android/z15;", "kind", "K1", "(ILjava/lang/Object;ILjava/lang/Object;)V", "Landroidx/compose/runtime/n;", "newPending", "S0", "(ZLandroidx/compose/runtime/n;)V", "expectedNodeCount", "inserting", "U0", "(IZ)V", "O0", "(Z)V", "r1", "index", "g1", "(I)I", "newCount", "R1", "(II)V", "groupLocation", "recomposeGroup", "recomposeIndex", "n1", "(IIII)I", "o1", "V1", "count", "Q1", "F0", "oldGroup", "newGroup", "commonRoot", "v1", "(III)V", "nearestCommonRoot", "N0", "", "Landroidx/compose/runtime/CompositeKeyHashCode;", "recomposeKey", "G0", "(IIJ)J", "Lcom/google/android/bub;", "c1", "(Lcom/google/android/bub;I)I", "H1", "D0", "Landroidx/compose/runtime/b0;", "scope", "T0", "(Landroidx/compose/runtime/b0;)V", "Lkotlin/Function1;", "Lcom/google/android/pr1;", "V0", "(Landroidx/compose/runtime/b0;)Lkotlin/jvm/functions/Function1;", "Lcom/google/android/n08;", "content", "locals", "parameter", "force", "h1", "(Lcom/google/android/n08;Lcom/google/android/a69;Ljava/lang/Object;Z)V", "", "Lkotlin/Pair;", "Lcom/google/android/r08;", "references", "d1", "(Ljava/util/List;)V", "R", "Lcom/google/android/x22;", "from", "to", "invalidations", "Lkotlin/Function0;", "block", "p1", "(Lcom/google/android/x22;Lcom/google/android/x22;Ljava/lang/Integer;Ljava/util/List;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "Lcom/google/android/fq1;", "K0", "()Lcom/google/android/fq1;", "dataOffset", "Lcom/google/android/iq1;", "I1", "(ILjava/lang/Integer;)Ljava/util/List;", "Lcom/google/android/r6b;", "invalidationsRequested", "L0", "(Lcom/google/android/k58;Lkotlin/jvm/functions/Function2;)V", "m1", "(Lcom/google/android/bub;I)Ljava/lang/Object;", "W1", "X1", "Lcom/google/android/ku4;", "anchor", "t1", "(Lcom/google/android/ku4;)V", "s1", "groupBeingRemoved", "y1", "x1", "W0", "E0", "Q", "a0", "y", "u", "U", "M", "V", "Z", "b0", "N", "e0", "d0", "J", "o", "T", "factory", "W", "(Lkotlin/jvm/functions/Function0;)V", "k", "m", "p", "P", "q0", "f0", "marker", "h", "Lkotlin/Function2;", "e", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "left", "right", "I", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "k1", "()Ljava/lang/Object;", "l1", "x", "(Ljava/lang/Object;)Z", "A", "(Z)Z", "", "B", "(F)Z", "D", "(J)Z", "C", "(I)Z", "U1", "P1", "effect", "n", "Lcom/google/android/os9;", "r", "(Lcom/google/android/os9;)V", "l", "", "values", "i", "([Lcom/google/android/os9;)V", "X", "Lcom/google/android/zr1;", "v", "(Lcom/google/android/zr1;)Ljava/lang/Object;", "w", "()Landroidx/compose/runtime/f;", "instance", "r0", "(Landroidx/compose/runtime/b0;Ljava/lang/Object;)Z", "F1", "parametersChanged", "flags", "g", "(ZI)Z", "q", "changed", "b", "Landroidx/compose/runtime/d;", "F", "(I)Landroidx/compose/runtime/d;", "Lcom/google/android/s6b;", "H", "()Lcom/google/android/s6b;", "s", "(Lcom/google/android/n08;Ljava/lang/Object;)V", "d", "p0", "(Ljava/lang/Object;)Lcom/google/android/fq1;", "m0", "()Ljava/util/List;", "Lcom/google/android/fob;", "shouldPause", "c0", "(Lcom/google/android/k58;Lkotlin/jvm/functions/Function2;Lcom/google/android/fob;)V", "n0", "o0", "(Lcom/google/android/k58;Lcom/google/android/fob;)Z", "s0", "(Lcom/google/android/k58;)V", "L", "Lcom/google/android/qaa;", "z", "(Lcom/google/android/qaa;)V", "Lcom/google/android/ez;", "G", "()Lcom/google/android/ez;", "c", "Landroidx/compose/runtime/f;", "Lcom/google/android/fub;", "Ljava/util/Set;", "f", "Lcom/google/android/g81;", "Lcom/google/android/js1;", "Landroidx/compose/runtime/g;", "Y0", "()Landroidx/compose/runtime/g;", "Lcom/google/android/w3c;", "j", "Ljava/util/ArrayList;", "pendingStack", "Landroidx/compose/runtime/n;", "pending", "nodeIndex", "groupNodeCount", "rGroupIndex", "Lcom/google/android/t16;", "Lcom/google/android/t16;", "parentStateStack", "", "[I", "nodeCountOverrides", "Lcom/google/android/m48;", "Lcom/google/android/m48;", "nodeCountVirtualOverrides", "forceRecomposeScopes", "forciblyRecompose", "t", "nodeExpected", "", "Landroidx/compose/runtime/p;", "Ljava/util/List;", "entersStack", "Lcom/google/android/a69;", "rootProvider", "Lcom/google/android/o48;", "Lcom/google/android/o48;", "providerUpdates", "providersInvalid", "providersInvalidStack", "reusing", "reusingGroup", "childrenComposing", "compositionToken", "E", "k0", "()Z", "E1", "sourceMarkersEnabled", "androidx/compose/runtime/k$c", "Landroidx/compose/runtime/k$c;", "derivedStateObserver", "invalidateStack", "l0", "isComposing", "isDisposed$runtime", "isDisposed", "Lcom/google/android/bub;", "b1", "()Lcom/google/android/bub;", "setReader$runtime", "(Lcom/google/android/bub;)V", "reader", "K", "getInsertTable$runtime", "()Lcom/google/android/fub;", "setInsertTable$runtime", "(Lcom/google/android/fub;)V", "insertTable", "Lcom/google/android/wub;", "Lcom/google/android/wub;", "writer", "writerHasAProvider", "providerCache", "Lcom/google/android/c81;", "O", "Lcom/google/android/c81;", "Z0", "()Lcom/google/android/c81;", "D1", "(Lcom/google/android/c81;)V", "deferredChanges", "Lcom/google/android/pq1;", "Lcom/google/android/pq1;", "changeListWriter", "Lcom/google/android/ku4;", "insertAnchor", "Lcom/google/android/pe4;", "Lcom/google/android/pe4;", "insertFixups", "S", "Lcom/google/android/fob;", "shouldPauseCallback", "Lcom/google/android/ur1;", "Lcom/google/android/ur1;", "j0", "()Lcom/google/android/ur1;", "errorContext", "Lkotlin/coroutines/CoroutineContext;", "Lkotlin/coroutines/CoroutineContext;", "()Lkotlin/coroutines/CoroutineContext;", "applyCoroutineContext", "getInserting$annotations", "()J", "getCompositeKeyHashCode$annotations", "compositeKeyHashCode", "Lcom/google/android/rr1;", "Lcom/google/android/rr1;", "_compositionData", "a1", "(Lcom/google/android/bub;)Ljava/lang/Object;", "node", "g0", "areChildrenComposing", "getDefaultsInvalid$annotations", "defaultsInvalid", "getSkipping$annotations", "skipping", "a", "currentMarker", "()Lcom/google/android/rr1;", "compositionData", "Lcom/google/android/gs1;", "()Lcom/google/android/gs1;", "currentCompositionLocalMap", "h0", "()Landroidx/compose/runtime/b0;", "currentRecomposeScope", "()Lcom/google/android/qaa;", "recomposeScope", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class k extends o {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private boolean reusing;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private int childrenComposing;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private int compositionToken;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private boolean sourceMarkersEnabled;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final c derivedStateObserver;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final ArrayList<b0> invalidateStack;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private boolean isComposing;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private boolean isDisposed;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private SlotReader reader;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private fub insertTable;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private SlotWriter writer;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    private boolean writerHasAProvider;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    private a69 providerCache;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    private c81 deferredChanges;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    private final pq1 changeListWriter;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    private ku4 insertAnchor;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    private pe4 insertFixups;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    private fob shouldPauseCallback;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    private final ur1 errorContext;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    private final CoroutineContext applyCoroutineContext;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    private boolean inserting;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    private long compositeKeyHashCode;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    private rr1 _compositionData;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final ez<?> applier;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final f parentContext;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final fub slotTable;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final Set<yea> abandonSet;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private g81 changes;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private g81 lateChanges;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final js1 observerHolder;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final g composition;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private n pending;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private int nodeIndex;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private int groupNodeCount;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private int rGroupIndex;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private int[] nodeCountOverrides;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private m48 nodeCountVirtualOverrides;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private boolean forceRecomposeScopes;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private boolean forciblyRecompose;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private boolean nodeExpected;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private o48<a69> providerUpdates;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private boolean providersInvalid;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final ArrayList<n> pendingStack = w3c.c(null, 1, null);

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final t16 parentStateStack = new t16();

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private final List<p> invalidations = new ArrayList();

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private final t16 entersStack = new t16();

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private a69 rootProvider = b69.a();

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final t16 providersInvalidStack = new t16();

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private int reusingGroup = -1;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002R\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tR\u001b\u0010\u0004\u001a\u00060\u0002R\u00020\u00038\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/compose/runtime/k$a;", "Lcom/google/android/yea;", "Landroidx/compose/runtime/k$b;", "Landroidx/compose/runtime/k;", "ref", "<init>", "(Landroidx/compose/runtime/k$b;)V", "", "d", "()V", "e", "f", "a", "Landroidx/compose/runtime/k$b;", "()Landroidx/compose/runtime/k$b;", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements yea {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final b ref;

        public a(b bVar) {
            this.ref = bVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final b getRef() {
            return this.ref;
        }

        @Override // com.google.inputmethod.yea
        public void d() {
        }

        @Override // com.google.inputmethod.yea
        public void e() {
            this.ref.A();
        }

        @Override // com.google.inputmethod.yea
        public void f() {
            this.ref.A();
        }
    }

    @Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0004\u0018\u00002\u00020\u0001B-\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0010¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0014H\u0010¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u0018H\u0010¢\u0006\u0004\b\u001a\u0010\u001bJ%\u0010\u001e\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00142\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\f0\u001cH\u0011¢\u0006\u0004\b\u001e\u0010\u001fJ3\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00180\"2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010!\u001a\u00020 2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\f0\u001cH\u0011¢\u0006\u0004\b#\u0010$J3\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00180\"2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010!\u001a\u00020 2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00180\"H\u0010¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0014H\u0010¢\u0006\u0004\b(\u0010\u0017J\u000f\u0010*\u001a\u00020)H\u0010¢\u0006\u0004\b*\u0010+J\u0015\u0010,\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020)¢\u0006\u0004\b,\u0010-J\u001d\u00101\u001a\u00020\f2\f\u00100\u001a\b\u0012\u0004\u0012\u00020/0.H\u0010¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\fH\u0010¢\u0006\u0004\b3\u0010\u000eJ\u000f\u00104\u001a\u00020\fH\u0010¢\u0006\u0004\b4\u0010\u000eJ\u0017\u00107\u001a\u00020\f2\u0006\u00106\u001a\u000205H\u0010¢\u0006\u0004\b7\u00108J\u0017\u00109\u001a\u00020\f2\u0006\u00106\u001a\u000205H\u0010¢\u0006\u0004\b9\u00108J\u0019\u0010;\u001a\u0004\u0018\u00010:2\u0006\u00106\u001a\u000205H\u0010¢\u0006\u0004\b;\u0010<J+\u0010@\u001a\u00020\f2\u0006\u00106\u001a\u0002052\u0006\u0010=\u001a\u00020:2\n\u0010?\u001a\u0006\u0012\u0002\b\u00030>H\u0010¢\u0006\u0004\b@\u0010AJ\u0017\u0010B\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0014H\u0010¢\u0006\u0004\bB\u0010\u0017J\u001d\u0010E\u001a\u00020D2\f\u0010C\u001a\b\u0012\u0004\u0012\u00020\f0\u001cH\u0016¢\u0006\u0004\bE\u0010FR\u001e\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u001e\u0010G\u001a\u0004\bH\u0010IR\u001a\u0010\u0006\u001a\u00020\u00058\u0010X\u0090\u0004¢\u0006\f\n\u0004\b#\u0010J\u001a\u0004\bK\u0010LR\u001a\u0010\u0007\u001a\u00020\u00058\u0010X\u0090\u0004¢\u0006\f\n\u0004\b9\u0010J\u001a\u0004\bM\u0010LR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b4\u0010N\u001a\u0004\bO\u0010PR0\u0010V\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020/0.\u0018\u00010.8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u00102R\u001d\u0010\\\u001a\b\u0012\u0004\u0012\u00020X0W8\u0006¢\u0006\f\n\u0004\bK\u0010Y\u001a\u0004\bZ\u0010[R+\u0010a\u001a\u00020)2\u0006\u0010]\u001a\u00020)8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bM\u0010^\u001a\u0004\b_\u0010+\"\u0004\b`\u0010-R\u0014\u0010b\u001a\u00020\u00058PX\u0090\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010LR\u0014\u0010d\u001a\u00020\u00058PX\u0090\u0004¢\u0006\u0006\u001a\u0004\bc\u0010LR\u0014\u0010h\u001a\u00020e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bf\u0010gR\u0014\u0010\u0015\u001a\u00020i8PX\u0090\u0004¢\u0006\u0006\u001a\u0004\bj\u0010k¨\u0006l"}, d2 = {"Landroidx/compose/runtime/k$b;", "Landroidx/compose/runtime/f;", "", "Landroidx/compose/runtime/CompositeKeyHashCode;", "compositeKeyHashCode", "", "collectingParameterInformation", "collectingSourceInformation", "Lcom/google/android/js1;", "observerHolder", "<init>", "(Landroidx/compose/runtime/k;JZZLcom/google/android/js1;)V", "", "A", "()V", "Landroidx/compose/runtime/d;", "composer", "t", "(Landroidx/compose/runtime/d;)V", "y", "Lcom/google/android/x22;", "composition", "z", "(Lcom/google/android/x22;)V", "Landroidx/compose/runtime/b0;", "scope", "u", "(Landroidx/compose/runtime/b0;)V", "Lkotlin/Function0;", "content", "a", "(Lcom/google/android/x22;Lkotlin/jvm/functions/Function2;)V", "Lcom/google/android/fob;", "shouldPause", "Landroidx/collection/ScatterSet;", "b", "(Lcom/google/android/x22;Lcom/google/android/fob;Lkotlin/jvm/functions/Function2;)Landroidx/collection/ScatterSet;", "invalidScopes", "r", "(Lcom/google/android/x22;Lcom/google/android/fob;Landroidx/collection/ScatterSet;)Landroidx/collection/ScatterSet;", "o", "Lcom/google/android/a69;", "j", "()Lcom/google/android/a69;", "E", "(Lcom/google/android/a69;)V", "", "Lcom/google/android/rr1;", "table", "s", "(Ljava/util/Set;)V", "x", "d", "Lcom/google/android/r08;", "reference", "n", "(Lcom/google/android/r08;)V", "c", "Lcom/google/android/q08;", "q", "(Lcom/google/android/r08;)Lcom/google/android/q08;", "data", "Lcom/google/android/ez;", "applier", "p", "(Lcom/google/android/r08;Lcom/google/android/q08;Lcom/google/android/ez;)V", "v", "action", "Lcom/google/android/o41;", "w", "(Lkotlin/jvm/functions/Function0;)Lcom/google/android/o41;", "J", "h", "()J", "Z", "f", "()Z", "g", "Lcom/google/android/js1;", "l", "()Lcom/google/android/js1;", "e", "Ljava/util/Set;", "getInspectionTables", "()Ljava/util/Set;", "setInspectionTables", "inspectionTables", "Landroidx/collection/d;", "Landroidx/compose/runtime/k;", "Landroidx/collection/d;", "B", "()Landroidx/collection/d;", "composers", "<set-?>", "Lcom/google/android/o58;", "C", "D", "compositionLocalScope", "collectingCallByInformation", "m", "stackTraceEnabled", "Lkotlin/coroutines/CoroutineContext;", "k", "()Lkotlin/coroutines/CoroutineContext;", "effectCoroutineContext", "Lcom/google/android/pr1;", "i", "()Lcom/google/android/pr1;", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class b extends f {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final long compositeKeyHashCode;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final boolean collectingParameterInformation;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final boolean collectingSourceInformation;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final js1 observerHolder;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private Set<Set<rr1>> inspectionTables;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final d<k> composers = l4b.b();

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final o58 compositionLocalScope = p0.i(b69.a(), p0.q());

        public b(long j, boolean z, boolean z2, js1 js1Var) {
            this.compositeKeyHashCode = j;
            this.collectingParameterInformation = z;
            this.collectingSourceInformation = z2;
            this.observerHolder = js1Var;
        }

        private final a69 C() {
            return (a69) this.compositionLocalScope.getValue();
        }

        private final void D(a69 a69Var) {
            this.compositionLocalScope.setValue(a69Var);
        }

        /* JADX WARN: Code duplicated, block: B:21:0x0063 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:22:0x0065 A[LOOP:0: B:9:0x0019->B:22:0x0065, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:26:0x0068 A[EDGE_INSN: B:26:0x0068->B:23:0x0068 BREAK  A[LOOP:0: B:9:0x0019->B:22:0x0065], SYNTHETIC] */
        public final void A() {
            if (this.composers.e()) {
                Set<Set<rr1>> set = this.inspectionTables;
                if (set != null) {
                    d<k> dVar = this.composers;
                    Object[] objArr = dVar.elements;
                    long[] jArr = dVar.metadata;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i = 0;
                        while (true) {
                            long j = jArr[i];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                                if (i != length) {
                                    break;
                                    break;
                                }
                                i++;
                            } else {
                                int i2 = 8 - ((~(i - length)) >>> 31);
                                for (int i3 = 0; i3 < i2; i3++) {
                                    if ((255 & j) < 128) {
                                        k kVar = (k) objArr[(i << 3) + i3];
                                        Iterator<Set<rr1>> it = set.iterator();
                                        while (it.hasNext()) {
                                            it.next().remove(kVar.S());
                                        }
                                    }
                                    j >>= 8;
                                }
                                if (i2 != 8) {
                                    break;
                                } else if (i != length) {
                                    break;
                                } else {
                                    i++;
                                }
                            }
                        }
                    }
                }
                this.composers.m();
            }
        }

        public final d<k> B() {
            return this.composers;
        }

        public final void E(a69 scope) {
            D(scope);
        }

        @Override // androidx.compose.p004runtime.f
        public void a(x22 composition, Function2<? super d, ? super Integer, Unit> content) {
            k.this.parentContext.a(composition, content);
        }

        @Override // androidx.compose.p004runtime.f
        public ScatterSet<b0> b(x22 composition, fob shouldPause, Function2<? super d, ? super Integer, Unit> content) {
            return k.this.parentContext.b(composition, shouldPause, content);
        }

        @Override // androidx.compose.p004runtime.f
        public void c(r08 reference) {
            k.this.parentContext.c(reference);
        }

        @Override // androidx.compose.p004runtime.f
        public void d() {
            k.this.childrenComposing--;
        }

        @Override // androidx.compose.p004runtime.f
        public boolean e() {
            return k.this.parentContext.e();
        }

        @Override // androidx.compose.p004runtime.f
        /* JADX INFO: renamed from: f, reason: from getter */
        public boolean getCollectingParameterInformation() {
            return this.collectingParameterInformation;
        }

        @Override // androidx.compose.p004runtime.f
        /* JADX INFO: renamed from: g, reason: from getter */
        public boolean getCollectingSourceInformation() {
            return this.collectingSourceInformation;
        }

        @Override // androidx.compose.p004runtime.f
        /* JADX INFO: renamed from: h, reason: from getter */
        public long getCompositeKeyHashCode() {
            return this.compositeKeyHashCode;
        }

        @Override // androidx.compose.p004runtime.f
        public pr1 i() {
            return k.this.getComposition();
        }

        @Override // androidx.compose.p004runtime.f
        public a69 j() {
            return C();
        }

        @Override // androidx.compose.p004runtime.f
        /* JADX INFO: renamed from: k */
        public CoroutineContext getEffectCoroutineContext() {
            return k.this.parentContext.getEffectCoroutineContext();
        }

        @Override // androidx.compose.p004runtime.f
        /* JADX INFO: renamed from: l, reason: from getter */
        public js1 getObserverHolder() {
            return this.observerHolder;
        }

        @Override // androidx.compose.p004runtime.f
        public boolean m() {
            return k.this.parentContext.m();
        }

        @Override // androidx.compose.p004runtime.f
        public void n(r08 reference) {
            k.this.parentContext.n(reference);
        }

        @Override // androidx.compose.p004runtime.f
        public void o(x22 composition) {
            k.this.parentContext.o(k.this.getComposition());
            k.this.parentContext.o(composition);
        }

        @Override // androidx.compose.p004runtime.f
        public void p(r08 reference, q08 data, ez<?> applier) {
            k.this.parentContext.p(reference, data, applier);
        }

        @Override // androidx.compose.p004runtime.f
        public q08 q(r08 reference) {
            return k.this.parentContext.q(reference);
        }

        @Override // androidx.compose.p004runtime.f
        public ScatterSet<b0> r(x22 composition, fob shouldPause, ScatterSet<b0> invalidScopes) {
            return k.this.parentContext.r(composition, shouldPause, invalidScopes);
        }

        @Override // androidx.compose.p004runtime.f
        public void s(Set<rr1> table) {
            Set hashSet = this.inspectionTables;
            if (hashSet == null) {
                hashSet = new HashSet();
                this.inspectionTables = hashSet;
            }
            hashSet.add(table);
        }

        @Override // androidx.compose.p004runtime.f
        public void t(d composer) {
            Intrinsics.h(composer, "null cannot be cast to non-null type androidx.compose.runtime.GapComposer");
            super.t((k) composer);
            this.composers.h(composer);
        }

        @Override // androidx.compose.p004runtime.f
        public void u(b0 scope) {
            k.this.parentContext.u(scope);
        }

        @Override // androidx.compose.p004runtime.f
        public void v(x22 composition) {
            k.this.parentContext.v(composition);
        }

        @Override // androidx.compose.p004runtime.f
        public o41 w(Function0<Unit> action) {
            return k.this.parentContext.w(action);
        }

        @Override // androidx.compose.p004runtime.f
        public void x() {
            k.this.childrenComposing++;
        }

        @Override // androidx.compose.p004runtime.f
        public void y(d composer) {
            Set<Set<rr1>> set = this.inspectionTables;
            if (set != null) {
                Iterator<T> it = set.iterator();
                while (it.hasNext()) {
                    Set set2 = (Set) it.next();
                    Intrinsics.h(composer, "null cannot be cast to non-null type androidx.compose.runtime.GapComposer");
                    set2.remove(((k) composer).S());
                }
            }
            if (composer instanceof k) {
                this.composers.y(composer);
            }
        }

        @Override // androidx.compose.p004runtime.f
        public void z(x22 composition) {
            k.this.parentContext.z(composition);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u00020\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\u0007\u001a\u00020\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"androidx/compose/runtime/k$c", "Lcom/google/android/x43;", "Landroidx/compose/runtime/j;", "derivedState", "", "b", "(Landroidx/compose/runtime/j;)V", "a", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c implements x43 {
        c() {
        }

        @Override // com.google.inputmethod.x43
        public void a(j<?> derivedState) {
            k.this.childrenComposing--;
        }

        @Override // com.google.inputmethod.x43
        public void b(j<?> derivedState) {
            k.this.childrenComposing++;
        }
    }

    public k(ez<?> ezVar, f fVar, fub fubVar, Set<yea> set, g81 g81Var, g81 g81Var2, js1 js1Var, g gVar) {
        this.applier = ezVar;
        this.parentContext = fVar;
        this.slotTable = fubVar;
        this.abandonSet = set;
        this.changes = g81Var;
        this.lateChanges = g81Var2;
        this.observerHolder = js1Var;
        this.composition = gVar;
        this.sourceMarkersEnabled = fVar.getCollectingSourceInformation() || fVar.e();
        this.derivedStateObserver = new c();
        this.invalidateStack = w3c.c(null, 1, null);
        SlotReader slotReaderM = fubVar.M();
        slotReaderM.d();
        this.reader = slotReaderM;
        fub fubVar2 = new fub();
        if (fVar.getCollectingSourceInformation()) {
            fubVar2.d();
        }
        if (fVar.e()) {
            fubVar2.c();
        }
        this.insertTable = fubVar2;
        SlotWriter slotWriterN = fubVar2.N();
        slotWriterN.K(true);
        this.writer = slotWriterN;
        this.changeListWriter = new pq1(this, e81.a(this.changes));
        SlotReader slotReaderM2 = this.insertTable.M();
        try {
            ku4 ku4VarA = slotReaderM2.a(0);
            slotReaderM2.d();
            this.insertAnchor = ku4VarA;
            this.insertFixups = new pe4();
            this.errorContext = new ur1(this);
            CoroutineContext effectCoroutineContext = fVar.getEffectCoroutineContext();
            EmptyCoroutineContext emptyCoroutineContextJ0 = j0();
            this.applyCoroutineContext = effectCoroutineContext.plus(emptyCoroutineContextJ0 == null ? EmptyCoroutineContext.a : emptyCoroutineContextJ0);
        } catch (Throwable th) {
            slotReaderM2.d();
            throw th;
        }
    }

    private static final r08 A1(k kVar, int i) {
        int iD = kVar.reader.D(i);
        Object objE = kVar.reader.E(i);
        ArrayList arrayList = null;
        if (iD != 126665345 || !(objE instanceof n08)) {
            return null;
        }
        if (kVar.reader.e(i)) {
            ArrayList arrayList2 = new ArrayList();
            B1(kVar, arrayList2, i);
            if (!arrayList2.isEmpty()) {
                arrayList = arrayList2;
            }
        }
        return z1(kVar, i, arrayList);
    }

    private static final void B1(k kVar, List<r08> list, int i) {
        int iF = kVar.reader.F(i) + i;
        int iF2 = i + 1;
        while (iF2 < iF) {
            if (kVar.reader.G(iF2)) {
                r08 r08VarA1 = A1(kVar, iF2);
                if (r08VarA1 != null) {
                    list.add(r08VarA1);
                }
            } else if (kVar.reader.e(iF2)) {
                B1(kVar, list, iF2);
            }
            iF2 += kVar.reader.F(iF2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00c9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x00cb A[LOOP:0: B:35:0x008b->B:45:0x00cb, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:82:0x00ce A[EDGE_INSN: B:82:0x00ce->B:46:0x00ce BREAK  A[LOOP:0: B:35:0x008b->B:45:0x00cb], SYNTHETIC] */
    private static final int C1(k kVar, int i, int i2, boolean z, int i3) {
        SlotReader slotReader = kVar.reader;
        if (!slotReader.G(i2)) {
            if (!slotReader.e(i2)) {
                if (slotReader.K(i2)) {
                    return 1;
                }
                return slotReader.O(i2);
            }
            int iF = slotReader.F(i2) + i2;
            int iC1 = 0;
            for (int iF2 = i2 + 1; iF2 < iF; iF2 += slotReader.F(iF2)) {
                boolean zK = slotReader.K(iF2);
                if (zK) {
                    kVar.changeListWriter.i();
                    kVar.changeListWriter.x(slotReader.M(iF2));
                }
                iC1 += C1(kVar, i, iF2, zK || z, zK ? 0 : i3 + iC1);
                if (zK) {
                    kVar.changeListWriter.i();
                    kVar.changeListWriter.B();
                }
            }
            if (slotReader.K(i2)) {
                return 1;
            }
            return iC1;
        }
        int iD = slotReader.D(i2);
        Object objE = slotReader.E(i2);
        if (iD == 126665345 && (objE instanceof n08)) {
            r08 r08VarA1 = A1(kVar, i2);
            if (r08VarA1 != null) {
                kVar.parentContext.c(r08VarA1);
                kVar.changeListWriter.M();
                kVar.changeListWriter.O(kVar.getComposition(), kVar.parentContext, r08VarA1);
            }
            if (!z || i2 == i) {
                return slotReader.O(i2);
            }
            kVar.changeListWriter.j(i3, i2);
            return 0;
        }
        if (iD != 206 || !Intrinsics.e(objE, e.j())) {
            if (slotReader.K(i2)) {
                return 1;
            }
            return slotReader.O(i2);
        }
        Object objC = slotReader.C(i2, 0);
        zea zeaVar = objC instanceof zea ? (zea) objC : null;
        yea wrapped = zeaVar != null ? zeaVar.getWrapped() : null;
        a aVar = wrapped instanceof a ? (a) wrapped : null;
        if (aVar != null) {
            d<k> dVarB = aVar.getRef().B();
            Object[] objArr = dVarB.elements;
            long[] jArr = dVarB.metadata;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i4 = 0;
                while (true) {
                    long j = jArr[i4];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i4 != length) {
                            break;
                            break;
                        }
                        i4++;
                    } else {
                        int i5 = 8 - ((~(i4 - length)) >>> 31);
                        for (int i6 = 0; i6 < i5; i6++) {
                            if ((255 & j) < 128) {
                                k kVar2 = (k) objArr[(i4 << 3) + i6];
                                kVar2.x1();
                                kVar.parentContext.v(kVar2.getComposition());
                            }
                            j >>= 8;
                        }
                        if (i5 != 8) {
                            break;
                        }
                        if (i4 != length) {
                            break;
                        }
                        i4++;
                    }
                }
            }
        }
        return slotReader.O(i2);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0067  */
    private final void D0() {
        b0 b0Var;
        boolean z;
        if (getInserting()) {
            g composition = getComposition();
            Intrinsics.h(composition, "null cannot be cast to non-null type androidx.compose.runtime.CompositionImpl");
            b0 b0Var2 = new b0(composition);
            w3c.j(this.invalidateStack, b0Var2);
            U1(b0Var2);
            T0(b0Var2);
            return;
        }
        p pVarH = m.H(this.invalidations, this.reader.getParent());
        Object objL = this.reader.L();
        if (Intrinsics.e(objL, d.INSTANCE.a())) {
            g composition2 = getComposition();
            Intrinsics.h(composition2, "null cannot be cast to non-null type androidx.compose.runtime.CompositionImpl");
            b0Var = new b0(composition2);
            U1(b0Var);
        } else {
            Intrinsics.h(objL, "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl");
            b0Var = (b0) objL;
        }
        if (pVarH != null) {
            z = true;
        } else {
            boolean zL = b0Var.l();
            if (zL) {
                b0Var.G(false);
            }
            if (zL) {
                z = true;
            } else {
                z = false;
            }
        }
        b0Var.I(z);
        w3c.j(this.invalidateStack, b0Var);
        T0(b0Var);
        if (b0Var.m()) {
            b0Var.H(false);
            b0Var.L(true);
            this.changeListWriter.Z(b0Var);
            if (this.reusing || !b0Var.r()) {
                return;
            }
            this.reusing = true;
            this.reusingGroup = this.reader.getParent();
            b0Var.K(true);
        }
    }

    private final void E0() {
        this.pending = null;
        this.nodeIndex = 0;
        this.groupNodeCount = 0;
        this.compositeKeyHashCode = 0L;
        this.nodeExpected = false;
        this.changeListWriter.U();
        w3c.a(this.invalidateStack);
        F0();
    }

    private final void F0() {
        this.nodeCountOverrides = null;
        this.nodeCountVirtualOverrides = null;
    }

    private final long G0(int group, int recomposeGroup, long recomposeKey) {
        long jRotateLeft;
        long jRotateLeft2 = 0;
        int i = 3;
        int i2 = 0;
        while (group >= 0) {
            if (group == recomposeGroup) {
                jRotateLeft = Long.rotateLeft(recomposeKey, i2);
            } else {
                int iC1 = c1(this.reader, group);
                if (iC1 == 126665345) {
                    jRotateLeft = Long.rotateLeft(iC1, i2);
                } else {
                    jRotateLeft2 = (jRotateLeft2 ^ Long.rotateLeft(iC1, i)) ^ Long.rotateLeft(this.reader.H(group) ? 0 : o1(group), i2);
                    i = (i + 6) % 64;
                    i2 = (i2 + 6) % 64;
                    group = this.reader.Q(group);
                }
            }
            return jRotateLeft ^ jRotateLeft2;
        }
        return jRotateLeft2;
    }

    private final void G1() {
        this.groupNodeCount += this.reader.T();
    }

    private final void H0() {
        if (!this.writer.getClosed()) {
            e.b("Check failed");
        }
        X0();
    }

    private final void H1() {
        this.groupNodeCount = this.reader.v();
        this.reader.U();
    }

    private final a69 I0() {
        a69 a69Var = this.providerCache;
        return a69Var != null ? a69Var : J0(this.reader.getParent());
    }

    private final List<ComposeStackTraceFrame> I1(int group, Integer dataOffset) {
        SlotReader slotReaderM = this.slotTable.M();
        try {
            return hq1.g(slotReaderM, group, dataOffset);
        } finally {
            slotReaderM.d();
        }
    }

    private final a69 J0(int group) {
        a69 a69VarB;
        if (getInserting() && this.writerHasAProvider) {
            int parent = this.writer.getParent();
            while (parent > 0) {
                if (this.writer.j0(parent) == 202 && Intrinsics.e(this.writer.k0(parent), e.f())) {
                    Object objH0 = this.writer.h0(parent);
                    Intrinsics.h(objH0, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
                    a69 a69Var = (a69) objH0;
                    this.providerCache = a69Var;
                    return a69Var;
                }
                parent = this.writer.L0(parent);
            }
        }
        if (this.reader.getGroupsSize() > 0) {
            while (group > 0) {
                if (this.reader.D(group) == 202 && Intrinsics.e(this.reader.E(group), e.f())) {
                    o48<a69> o48Var = this.providerUpdates;
                    if (o48Var == null || (a69VarB = o48Var.b(group)) == null) {
                        Object objA = this.reader.A(group);
                        Intrinsics.h(objA, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
                        a69VarB = (a69) objA;
                    }
                    this.providerCache = a69VarB;
                    return a69VarB;
                }
                group = this.reader.Q(group);
            }
        }
        a69 a69Var2 = this.rootProvider;
        this.providerCache = a69Var2;
        return a69Var2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean J1(Object obj, Object obj2) {
        if (obj2 == obj) {
            return true;
        }
        zea zeaVar = obj2 instanceof zea ? (zea) obj2 : null;
        return (zeaVar != null ? zeaVar.getWrapped() : null) == obj;
    }

    private final fq1 K0() {
        if (!this.parentContext.m()) {
            return null;
        }
        List listC = m.c();
        listC.addAll(hq1.c(this.writer, null, 0, null, 7, null));
        listC.addAll(hq1.a(this.reader));
        listC.addAll(m0());
        return new fq1(m.a(listC), getSourceMarkersEnabled());
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0070  */
    /* JADX WARN: Code duplicated, block: B:22:0x007d  */
    /* JADX WARN: Code duplicated, block: B:23:0x007f  */
    /* JADX WARN: Code duplicated, block: B:26:0x0087  */
    /* JADX WARN: Code duplicated, block: B:28:0x0094  */
    /* JADX WARN: Code duplicated, block: B:29:0x00a0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:43:0x00de  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:52:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:58:0x010b  */
    /* JADX WARN: Code duplicated, block: B:61:0x011e  */
    /* JADX WARN: Code duplicated, block: B:68:0x015e  */
    /* JADX WARN: Code duplicated, block: B:70:0x0177  */
    /* JADX WARN: Code duplicated, block: B:71:0x0183 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x0185  */
    /* JADX WARN: Code duplicated, block: B:74:0x0189  */
    /* JADX WARN: Code duplicated, block: B:76:0x0193  */
    /* JADX WARN: Code duplicated, block: B:78:0x0197  */
    /* JADX WARN: Code duplicated, block: B:83:0x01ca  */
    private final void K1(int key, Object objectKey, int kind, Object data) {
        long jRotateLeft;
        z15.Companion companion;
        boolean z;
        n nVar;
        boolean z2;
        n nVar2;
        int currentGroup;
        n nVar3;
        X1();
        int i = this.rGroupIndex;
        if (objectKey == null) {
            if (data == null || key != 207 || Intrinsics.e(data, d.INSTANCE.a())) {
                jRotateLeft = Long.rotateLeft(Long.rotateLeft(getCompositeKeyHashCode(), 3) ^ ((long) key), 3) ^ ((long) i);
            } else {
                this.compositeKeyHashCode = Long.rotateLeft(Long.rotateLeft(getCompositeKeyHashCode(), 3) ^ ((long) data.hashCode()), 3) ^ ((long) i);
            }
            if (objectKey == null) {
                this.rGroupIndex++;
            }
            companion = z15.INSTANCE;
            if (kind != companion.a()) {
                z = true;
            } else {
                z = false;
            }
            nVar = null;
            if (getInserting()) {
                this.reader.c();
                currentGroup = this.writer.getCurrentGroup();
                if (z) {
                    this.writer.p1(key, d.INSTANCE.a());
                } else if (data != null) {
                    SlotWriter slotWriter = this.writer;
                    if (objectKey == null) {
                        objectKey = d.INSTANCE.a();
                    }
                    slotWriter.l1(key, objectKey, data);
                } else {
                    SlotWriter slotWriter2 = this.writer;
                    if (objectKey == null) {
                        objectKey = d.INSTANCE.a();
                    }
                    slotWriter2.n1(key, objectKey);
                }
                nVar3 = this.pending;
                if (nVar3 != null) {
                    ui6 ui6Var = new ui6(key, -1, g1(currentGroup), -1, 0);
                    nVar3.i(ui6Var, this.nodeIndex - nVar3.getStartIndex());
                    nVar3.h(ui6Var);
                }
                S0(z, null);
                return;
            }
            if (kind != companion.b() && this.reusing) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (this.pending == null) {
                int iN = this.reader.n();
                if (z2 && iN == key && Intrinsics.e(objectKey, this.reader.o())) {
                    N1(z, data);
                } else {
                    this.pending = new n(this.reader.h(), this.nodeIndex);
                }
            }
            nVar2 = this.pending;
            if (nVar2 != null) {
                ui6 ui6VarD = nVar2.d(key, objectKey);
                if (!z2 || ui6VarD == null) {
                    this.reader.c();
                    this.inserting = true;
                    this.providerCache = null;
                    R0();
                    this.writer.F();
                    int currentGroup2 = this.writer.getCurrentGroup();
                    if (z) {
                        this.writer.p1(key, d.INSTANCE.a());
                    } else if (data != null) {
                        SlotWriter slotWriter3 = this.writer;
                        if (objectKey == null) {
                            objectKey = d.INSTANCE.a();
                        }
                        slotWriter3.l1(key, objectKey, data);
                    } else {
                        SlotWriter slotWriter4 = this.writer;
                        if (objectKey == null) {
                            objectKey = d.INSTANCE.a();
                        }
                        slotWriter4.n1(key, objectKey);
                    }
                    this.insertAnchor = this.writer.B(currentGroup2);
                    ui6 ui6Var2 = new ui6(key, -1, g1(currentGroup2), -1, 0);
                    nVar2.i(ui6Var2, this.nodeIndex - nVar2.getStartIndex());
                    nVar2.h(ui6Var2);
                    nVar = new n(new ArrayList(), z ? 0 : this.nodeIndex);
                } else {
                    nVar2.h(ui6VarD);
                    int location = ui6VarD.getLocation();
                    this.nodeIndex = nVar2.g(ui6VarD) + nVar2.getStartIndex();
                    int iM = nVar2.m(ui6VarD);
                    int groupIndex = iM - nVar2.getGroupIndex();
                    nVar2.k(iM, nVar2.getGroupIndex());
                    this.changeListWriter.z(location);
                    this.reader.R(location);
                    if (groupIndex > 0) {
                        this.changeListWriter.w(groupIndex);
                    }
                    N1(z, data);
                }
            }
            S0(z, nVar);
        }
        jRotateLeft = Long.rotateLeft(Long.rotateLeft(getCompositeKeyHashCode(), 3) ^ ((long) (objectKey instanceof Enum ? ((Enum) objectKey).ordinal() : objectKey.hashCode())), 3) ^ ((long) 0);
        this.compositeKeyHashCode = jRotateLeft;
        if (objectKey == null) {
            this.rGroupIndex++;
        }
        companion = z15.INSTANCE;
        if (kind != companion.a()) {
            z = true;
        } else {
            z = false;
        }
        nVar = null;
        if (getInserting()) {
            this.reader.c();
            currentGroup = this.writer.getCurrentGroup();
            if (z) {
                this.writer.p1(key, d.INSTANCE.a());
            } else if (data != null) {
                SlotWriter slotWriter5 = this.writer;
                if (objectKey == null) {
                    objectKey = d.INSTANCE.a();
                }
                slotWriter5.l1(key, objectKey, data);
            } else {
                SlotWriter slotWriter6 = this.writer;
                if (objectKey == null) {
                    objectKey = d.INSTANCE.a();
                }
                slotWriter6.n1(key, objectKey);
            }
            nVar3 = this.pending;
            if (nVar3 != null) {
                ui6 ui6Var3 = new ui6(key, -1, g1(currentGroup), -1, 0);
                nVar3.i(ui6Var3, this.nodeIndex - nVar3.getStartIndex());
                nVar3.h(ui6Var3);
            }
            S0(z, null);
            return;
        }
        if (kind != companion.b()) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (this.pending == null) {
            int iN2 = this.reader.n();
            if (z2) {
                this.pending = new n(this.reader.h(), this.nodeIndex);
            } else {
                this.pending = new n(this.reader.h(), this.nodeIndex);
            }
        }
        nVar2 = this.pending;
        if (nVar2 != null) {
            ui6 ui6VarD2 = nVar2.d(key, objectKey);
            if (z2) {
                this.reader.c();
                this.inserting = true;
                this.providerCache = null;
                R0();
                this.writer.F();
                int currentGroup3 = this.writer.getCurrentGroup();
                if (z) {
                    this.writer.p1(key, d.INSTANCE.a());
                } else if (data != null) {
                    SlotWriter slotWriter7 = this.writer;
                    if (objectKey == null) {
                        objectKey = d.INSTANCE.a();
                    }
                    slotWriter7.l1(key, objectKey, data);
                } else {
                    SlotWriter slotWriter8 = this.writer;
                    if (objectKey == null) {
                        objectKey = d.INSTANCE.a();
                    }
                    slotWriter8.n1(key, objectKey);
                }
                this.insertAnchor = this.writer.B(currentGroup3);
                ui6 ui6Var4 = new ui6(key, -1, g1(currentGroup3), -1, 0);
                nVar2.i(ui6Var4, this.nodeIndex - nVar2.getStartIndex());
                nVar2.h(ui6Var4);
                nVar = new n(new ArrayList(), z ? 0 : this.nodeIndex);
            } else {
                this.reader.c();
                this.inserting = true;
                this.providerCache = null;
                R0();
                this.writer.F();
                int currentGroup4 = this.writer.getCurrentGroup();
                if (z) {
                    this.writer.p1(key, d.INSTANCE.a());
                } else if (data != null) {
                    SlotWriter slotWriter9 = this.writer;
                    if (objectKey == null) {
                        objectKey = d.INSTANCE.a();
                    }
                    slotWriter9.l1(key, objectKey, data);
                } else {
                    SlotWriter slotWriter10 = this.writer;
                    if (objectKey == null) {
                        objectKey = d.INSTANCE.a();
                    }
                    slotWriter10.n1(key, objectKey);
                }
                this.insertAnchor = this.writer.B(currentGroup4);
                ui6 ui6Var5 = new ui6(key, -1, g1(currentGroup4), -1, 0);
                nVar2.i(ui6Var5, this.nodeIndex - nVar2.getStartIndex());
                nVar2.h(ui6Var5);
                nVar = new n(new ArrayList(), z ? 0 : this.nodeIndex);
            }
        }
        S0(z, nVar);
    }

    private final void L0(k58<Object, Object> invalidationsRequested, Function2<? super d, ? super Integer, Unit> content) {
        if (getIsComposing()) {
            e.b("Reentrant composition is not supported");
        }
        this.observerHolder.a();
        vbd vbdVar = vbd.a;
        Object objA = vbdVar.a("Compose:recompose");
        try {
            this.compositionToken = Long.hashCode(i.K().getSnapshotId());
            this.providerUpdates = null;
            s0(invalidationsRequested);
            this.nodeIndex = 0;
            this.isComposing = true;
            try {
                O1();
                Object objK1 = k1();
                if (objK1 != content && content != null) {
                    Function2<? super d, ? super Integer, Unit> function2 = content;
                    U1(content);
                }
                c cVar = this.derivedStateObserver;
                r58<x43> r58VarC = p0.c();
                try {
                    r58VarC.c(cVar);
                    if (content != null) {
                        M1(200, e.g());
                        p04.a(this, content);
                        P0();
                    } else if ((!this.forciblyRecompose && !this.providersInvalid) || objK1 == null || Intrinsics.e(objK1, d.INSTANCE.a())) {
                        F1();
                    } else {
                        M1(200, e.g());
                        p04.a(this, (Function2) kotlin.jvm.internal.a.f(objK1, 2));
                        P0();
                    }
                    r58VarC.u(r58VarC.getSize() - 1);
                    Q0();
                    this.isComposing = false;
                    this.invalidations.clear();
                    H0();
                    Unit unit = Unit.a;
                    vbdVar.b(objA);
                } catch (Throwable th) {
                    r58VarC.u(r58VarC.getSize() - 1);
                    throw th;
                }
            } catch (Throwable th2) {
                try {
                    throw jq1.b(th2, new Function0() { // from class: com.google.android.ru4
                        public final Object invoke() {
                            return k.M0(this.a);
                        }
                    });
                } catch (Throwable th3) {
                    this.isComposing = false;
                    this.invalidations.clear();
                    z0();
                    H0();
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            vbd.a.b(objA);
            throw th4;
        }
    }

    private final void L1(int key) {
        K1(key, null, z15.INSTANCE.a(), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fq1 M0(k kVar) {
        return kVar.K0();
    }

    private final void M1(int key, Object dataKey) {
        K1(key, dataKey, z15.INSTANCE.a(), null);
    }

    private final void N0(int group, int nearestCommonRoot) {
        if (group <= 0 || group == nearestCommonRoot) {
            return;
        }
        N0(this.reader.Q(group), nearestCommonRoot);
        if (this.reader.K(group)) {
            this.changeListWriter.x(m1(this.reader, group));
        }
    }

    private final void N1(boolean isNode, Object data) {
        if (isNode) {
            this.reader.X();
            return;
        }
        if (data != null && this.reader.l() != data) {
            this.changeListWriter.c0(data);
        }
        this.reader.W();
    }

    private final void O0(boolean isNode) {
        long jRotateRight;
        long j;
        int iW;
        List<ui6> list;
        long jRotateRight2;
        long j2;
        int iE = this.parentStateStack.e() - 1;
        if (getInserting()) {
            int parent = this.writer.getParent();
            int iJ0 = this.writer.j0(parent);
            Object objK0 = this.writer.k0(parent);
            Object objH0 = this.writer.h0(parent);
            if (objK0 != null) {
                int iOrdinal = objK0 instanceof Enum ? ((Enum) objK0).ordinal() : objK0.hashCode();
                jRotateRight2 = Long.rotateRight(getCompositeKeyHashCode() ^ ((long) 0), 3);
                j2 = iOrdinal;
            } else if (objH0 == null || iJ0 != 207 || Intrinsics.e(objH0, d.INSTANCE.a())) {
                jRotateRight2 = Long.rotateRight(getCompositeKeyHashCode() ^ ((long) iE), 3);
                j2 = iJ0;
            } else {
                this.compositeKeyHashCode = Long.rotateRight(((long) objH0.hashCode()) ^ Long.rotateRight(getCompositeKeyHashCode() ^ ((long) iE), 3), 3);
            }
            this.compositeKeyHashCode = Long.rotateRight(jRotateRight2 ^ j2, 3);
        } else {
            int parent2 = this.reader.getParent();
            int iD = this.reader.D(parent2);
            Object objE = this.reader.E(parent2);
            Object objA = this.reader.A(parent2);
            if (objE != null) {
                int iOrdinal2 = objE instanceof Enum ? ((Enum) objE).ordinal() : objE.hashCode();
                jRotateRight = Long.rotateRight(getCompositeKeyHashCode() ^ ((long) 0), 3);
                j = iOrdinal2;
            } else if (objA == null || iD != 207 || Intrinsics.e(objA, d.INSTANCE.a())) {
                jRotateRight = Long.rotateRight(getCompositeKeyHashCode() ^ ((long) iE), 3);
                j = iD;
            } else {
                this.compositeKeyHashCode = Long.rotateRight(((long) objA.hashCode()) ^ Long.rotateRight(getCompositeKeyHashCode() ^ ((long) iE), 3), 3);
            }
            this.compositeKeyHashCode = Long.rotateRight(jRotateRight ^ j, 3);
        }
        int i = this.groupNodeCount;
        n nVar = this.pending;
        if (nVar != null && nVar.b().size() > 0) {
            List<ui6> listB = nVar.b();
            List<ui6> listF = nVar.f();
            Set setE = p47.e(listF);
            d dVarB = l4b.b();
            int size = listF.size();
            int size2 = listB.size();
            int i2 = 0;
            int i3 = 0;
            int iO = 0;
            while (i2 < size2) {
                ui6 ui6Var = listB.get(i2);
                if (setE.contains(ui6Var)) {
                    list = listB;
                    if (!dVarB.a(ui6Var)) {
                        if (i3 < size) {
                            ui6 ui6Var2 = listF.get(i3);
                            if (ui6Var2 != ui6Var) {
                                int iG = nVar.g(ui6Var2);
                                dVarB.h(ui6Var2);
                                if (iG != iO) {
                                    int iO2 = nVar.o(ui6Var2);
                                    this.changeListWriter.y(nVar.getStartIndex() + iG, iO + nVar.getStartIndex(), iO2);
                                    nVar.j(iG, iO, iO2);
                                }
                            } else {
                                i2++;
                            }
                            i3++;
                            iO += nVar.o(ui6Var2);
                            listB = list;
                            listF = listF;
                        }
                    }
                    listB = list;
                } else {
                    this.changeListWriter.S(nVar.g(ui6Var) + nVar.getStartIndex(), ui6Var.getNodes());
                    nVar.n(ui6Var.getLocation(), 0);
                    this.changeListWriter.z(ui6Var.getLocation());
                    this.reader.R(ui6Var.getLocation());
                    s1();
                    this.reader.T();
                    list = listB;
                    m.I(this.invalidations, ui6Var.getLocation(), ui6Var.getLocation() + this.reader.F(ui6Var.getLocation()));
                }
                i2++;
                listB = list;
            }
            this.changeListWriter.i();
            if (listB.size() > 0) {
                this.changeListWriter.z(this.reader.m());
                this.reader.U();
            }
        }
        boolean inserting = getInserting();
        if (!inserting && (iW = this.reader.w()) > 0) {
            this.changeListWriter.a0(iW);
        }
        int i4 = this.nodeIndex;
        while (!this.reader.I()) {
            int current = this.reader.getCurrent();
            s1();
            this.changeListWriter.S(i4, this.reader.T());
            m.I(this.invalidations, current, this.reader.getCurrent());
        }
        if (inserting) {
            if (isNode) {
                this.insertFixups.c();
                i = 1;
            }
            this.reader.f();
            int parent3 = this.writer.getParent();
            this.writer.S();
            if (!this.reader.t()) {
                int iG1 = g1(parent3);
                this.writer.T();
                this.writer.K(true);
                t1(this.insertAnchor);
                this.inserting = false;
                if (!this.slotTable.isEmpty()) {
                    Q1(iG1, 0);
                    R1(iG1, i);
                }
            }
        } else {
            if (isNode) {
                this.changeListWriter.B();
            }
            this.changeListWriter.g();
            int parent4 = this.reader.getParent();
            if (i != V1(parent4)) {
                R1(parent4, i);
            }
            if (isNode) {
                i = 1;
            }
            this.reader.g();
            this.changeListWriter.i();
        }
        U0(i, inserting);
    }

    private final void O1() {
        this.rGroupIndex = 0;
        this.reader = this.slotTable.M();
        L1(100);
        this.parentContext.x();
        a69 a69VarJ = this.parentContext.j();
        this.providersInvalidStack.i(m.s(this.providersInvalid));
        this.providersInvalid = x(a69VarJ);
        this.providerCache = null;
        if (!this.forceRecomposeScopes) {
            this.forceRecomposeScopes = this.parentContext.getCollectingParameterInformation();
        }
        if (!getSourceMarkersEnabled()) {
            E1(this.parentContext.getCollectingSourceInformation());
        }
        if (getSourceMarkersEnabled()) {
            zr1<sr1> zr1VarC = wr1.c();
            Intrinsics.h(zr1VarC, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
            a69VarJ = a69VarJ.Y0(zr1VarC, new StaticValueHolder(j0()));
        }
        this.rootProvider = a69VarJ;
        Set<rr1> set = (Set) hs1.b(a69VarJ, iz5.c());
        if (set != null) {
            set.add(S());
            this.parentContext.s(set);
        }
        L1(Long.hashCode(this.parentContext.getCompositeKeyHashCode()));
    }

    private final void P0() {
        O0(false);
    }

    private final void Q0() {
        P0();
        this.parentContext.d();
        P0();
        this.changeListWriter.l();
        W0();
        this.reader.d();
        this.forciblyRecompose = false;
        this.providersInvalid = m.q(this.providersInvalidStack.g());
    }

    private final void Q1(int group, int count) {
        if (V1(group) != count) {
            if (group < 0) {
                m48 m48Var = this.nodeCountVirtualOverrides;
                if (m48Var == null) {
                    m48Var = new m48(0, 1, null);
                    this.nodeCountVirtualOverrides = m48Var;
                }
                m48Var.u(group, count);
                return;
            }
            int[] iArr = this.nodeCountOverrides;
            if (iArr == null) {
                int[] iArr2 = new int[this.reader.getGroupsSize()];
                f.E(iArr2, -1, 0, 0, 6, (Object) null);
                this.nodeCountOverrides = iArr2;
                iArr = iArr2;
            }
            iArr[group] = count;
        }
    }

    private final void R0() {
        if (this.writer.getClosed()) {
            SlotWriter slotWriterN = this.insertTable.N();
            this.writer = slotWriterN;
            slotWriterN.d1();
            this.writerHasAProvider = false;
            this.providerCache = null;
        }
    }

    private final void R1(int group, int newCount) {
        int iV1 = V1(group);
        if (iV1 != newCount) {
            int i = newCount - iV1;
            int iD = w3c.d(this.pendingStack) - 1;
            while (group != -1) {
                int iV2 = V1(group) + i;
                Q1(group, iV2);
                for (int i2 = iD; -1 < i2; i2--) {
                    n nVar = (n) w3c.h(this.pendingStack, i2);
                    if (nVar != null && nVar.n(group, iV2)) {
                        iD = i2 - 1;
                        break;
                    }
                }
                if (group < 0) {
                    group = this.reader.getParent();
                } else if (this.reader.K(group)) {
                    return;
                } else {
                    group = this.reader.Q(group);
                }
            }
        }
    }

    private final void S0(boolean isNode, n newPending) {
        w3c.j(this.pendingStack, this.pending);
        this.pending = newPending;
        this.parentStateStack.i(this.groupNodeCount);
        this.parentStateStack.i(this.rGroupIndex);
        this.parentStateStack.i(this.nodeIndex);
        if (isNode) {
            this.nodeIndex = 0;
        }
        this.groupNodeCount = 0;
        this.rGroupIndex = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [com.google.android.a69, java.lang.Object] */
    private final a69 S1(a69 parentScope, a69 currentProviders) {
        k79.a<zr1<Object>, c1e<Object>> aVarBuilder2 = parentScope.builder2();
        aVarBuilder2.putAll(currentProviders);
        ?? Build2 = aVarBuilder2.build2();
        M1(204, e.i());
        T1(Build2);
        T1(currentProviders);
        P0();
        return Build2;
    }

    private final void T0(b0 scope) {
        scope.P(this.compositionToken);
        this.observerHolder.a();
    }

    private final void T1(Object value) {
        k1();
        U1(value);
    }

    private final void U0(int expectedNodeCount, boolean inserting) {
        n nVar = (n) w3c.i(this.pendingStack);
        if (nVar != null && !inserting) {
            nVar.l(nVar.getGroupIndex() + 1);
        }
        this.pending = nVar;
        this.nodeIndex = this.parentStateStack.g() + expectedNodeCount;
        this.rGroupIndex = this.parentStateStack.g();
        this.groupNodeCount = this.parentStateStack.g() + expectedNodeCount;
    }

    private final Function1<pr1, Unit> V0(b0 scope) {
        this.observerHolder.a();
        return scope.f(this.compositionToken);
    }

    private final int V1(int group) {
        int i;
        if (group >= 0) {
            int[] iArr = this.nodeCountOverrides;
            return (iArr == null || (i = iArr[group]) < 0) ? this.reader.O(group) : i;
        }
        m48 m48Var = this.nodeCountVirtualOverrides;
        if (m48Var == null || !m48Var.a(group)) {
            return 0;
        }
        return m48Var.c(group);
    }

    private final void W0() {
        this.changeListWriter.o();
        if (!w3c.e(this.pendingStack)) {
            e.b("Start/end imbalance");
        }
        E0();
    }

    private final void W1() {
        if (!this.nodeExpected) {
            e.b("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.nodeExpected = false;
    }

    private final void X0() {
        fub fubVar = new fub();
        if (getSourceMarkersEnabled()) {
            fubVar.d();
        }
        if (this.parentContext.e()) {
            fubVar.c();
        }
        this.insertTable = fubVar;
        SlotWriter slotWriterN = fubVar.N();
        slotWriterN.K(true);
        this.writer = slotWriterN;
    }

    private final void X1() {
        if (this.nodeExpected) {
            e.b("A call to createNode(), emitNode() or useNode() expected");
        }
    }

    private final Object a1(SlotReader slotReader) {
        return slotReader.M(slotReader.getParent());
    }

    private final int c1(SlotReader slotReader, int i) {
        Object objA;
        if (!slotReader.H(i)) {
            int iD = slotReader.D(i);
            return (iD != 207 || (objA = slotReader.A(i)) == null || Intrinsics.e(objA, d.INSTANCE.a())) ? iD : objA.hashCode();
        }
        Object objE = slotReader.E(i);
        if (objE == null) {
            return 0;
        }
        if (objE instanceof Enum) {
            return ((Enum) objE).ordinal();
        }
        if (objE instanceof n08) {
            return 126665345;
        }
        return objE.hashCode();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    private final void d1(List<Pair<r08, r08>> references) throws Throwable {
        pq1 pq1Var;
        c81 c81Var;
        mg anchor;
        SlotReader slotReader;
        o48<a69> o48Var;
        c81 c81Var2;
        cub slotStorage;
        pq1 pq1Var2 = this.changeListWriter;
        c81 c81VarA = e81.a(this.lateChanges);
        c81 c81VarP = pq1Var2.getChangeList();
        try {
            pq1Var2.V(c81VarA);
            this.changeListWriter.T();
            int size = references.size();
            int i = 0;
            int i2 = 0;
            while (i2 < size) {
                try {
                    Pair<r08, r08> pair = references.get(i2);
                    final r08 r08Var = (r08) pair.a();
                    r08 r08Var2 = (r08) pair.b();
                    ku4 ku4VarA = lu4.a(r08Var.getAnchor());
                    fub fubVarO = tub.o(r08Var.getSlotStorage());
                    int iU = fubVarO.u(ku4VarA);
                    IntRef intRef = new IntRef(i, 1, null);
                    this.changeListWriter.e(intRef, ku4VarA);
                    if (r08Var2 == null) {
                        if (Intrinsics.e(fubVarO, this.insertTable)) {
                            H0();
                        }
                        final SlotReader slotReaderM = fubVarO.M();
                        try {
                            slotReaderM.R(iU);
                            this.changeListWriter.A(iU);
                            final c81 c81Var3 = new c81();
                            q1(this, null, null, null, null, new Function0() { // from class: com.google.android.pu4
                                public final Object invoke() {
                                    return k.e1(this.a, c81Var3, slotReaderM, r08Var);
                                }
                            }, 15, null);
                            this.changeListWriter.t(c81Var3, intRef);
                            Unit unit = Unit.a;
                            slotReaderM.d();
                        } catch (Throwable th) {
                            slotReaderM.d();
                            throw th;
                        }
                    } else {
                        q08 q08VarQ = this.parentContext.q(r08Var2);
                        fub fubVarO2 = (q08VarQ == null || (slotStorage = q08VarQ.getSlotStorage()) == null) ? null : tub.o(slotStorage);
                        fub fubVarO3 = fubVarO2 == null ? tub.o(r08Var2.getSlotStorage()) : fubVarO2;
                        if (fubVarO2 == null || (anchor = fubVarO2.t(0)) == null) {
                            anchor = r08Var2.getAnchor();
                        }
                        ku4 ku4VarA2 = lu4.a(anchor);
                        List<? extends Object> listT = m.t(fubVarO3, ku4VarA2);
                        if (!listT.isEmpty()) {
                            this.changeListWriter.b(listT, intRef);
                            if (Intrinsics.e(fubVarO, this.slotTable)) {
                                int iU2 = this.slotTable.u(ku4VarA);
                                Q1(iU2, V1(iU2) + listT.size());
                            }
                        }
                        this.changeListWriter.c(q08VarQ, this.parentContext, r08Var2, r08Var);
                        SlotReader slotReaderM2 = fubVarO3.M();
                        try {
                            SlotReader slotReader2 = this.reader;
                            int[] iArr = this.nodeCountOverrides;
                            o48<a69> o48Var2 = this.providerUpdates;
                            this.nodeCountOverrides = null;
                            this.providerUpdates = null;
                            try {
                                this.reader = slotReaderM2;
                                int iU3 = fubVarO3.u(lu4.a(ku4VarA2));
                                slotReaderM2.R(iU3);
                                this.changeListWriter.A(iU3);
                                c81 c81Var4 = new c81();
                                pq1 pq1Var3 = this.changeListWriter;
                                c81 c81VarP2 = pq1Var3.getChangeList();
                                try {
                                    pq1Var3.V(c81Var4);
                                    slotReader = slotReaderM2;
                                    try {
                                        pq1 pq1Var4 = this.changeListWriter;
                                        boolean zQ = pq1Var4.getImplicitRootStart();
                                        try {
                                            pq1Var4.W(false);
                                            try {
                                                iArr = iArr;
                                                c81Var2 = c81VarP2;
                                                o48Var = o48Var2;
                                                try {
                                                    p1(r08Var2.getComposition(), r08Var.getComposition(), Integer.valueOf(slotReader.getCurrent()), r08Var2.d(), new Function0() { // from class: com.google.android.qu4
                                                        public final Object invoke() {
                                                            return k.f1(this.a, r08Var);
                                                        }
                                                    });
                                                    try {
                                                        pq1Var4.W(zQ);
                                                        try {
                                                            pq1Var3.V(c81Var2);
                                                            this.changeListWriter.t(c81Var4, intRef);
                                                            Unit unit2 = Unit.a;
                                                            try {
                                                                this.reader = slotReader2;
                                                                this.nodeCountOverrides = iArr;
                                                                this.providerUpdates = o48Var;
                                                                slotReader.d();
                                                            } catch (Throwable th2) {
                                                                th = th2;
                                                                slotReader.d();
                                                                throw th;
                                                            }
                                                        } catch (Throwable th3) {
                                                            th = th3;
                                                            this.reader = slotReader2;
                                                            this.nodeCountOverrides = iArr;
                                                            this.providerUpdates = o48Var;
                                                            throw th;
                                                        }
                                                    } catch (Throwable th4) {
                                                        th = th4;
                                                        pq1Var3.V(c81Var2);
                                                        throw th;
                                                    }
                                                } catch (Throwable th5) {
                                                    th = th5;
                                                    pq1Var4.W(zQ);
                                                    throw th;
                                                }
                                            } catch (Throwable th6) {
                                                th = th6;
                                                iArr = iArr;
                                                c81Var2 = c81VarP2;
                                                o48Var = o48Var2;
                                            }
                                        } catch (Throwable th7) {
                                            th = th7;
                                            iArr = iArr;
                                            o48Var = o48Var2;
                                            c81Var2 = c81VarP2;
                                        }
                                    } catch (Throwable th8) {
                                        th = th8;
                                        o48Var = o48Var2;
                                        c81Var2 = c81VarP2;
                                        pq1Var3.V(c81Var2);
                                        throw th;
                                    }
                                } catch (Throwable th9) {
                                    th = th9;
                                    slotReader = slotReaderM2;
                                }
                            } catch (Throwable th10) {
                                th = th10;
                                iArr = iArr;
                                slotReader = slotReaderM2;
                                o48Var = o48Var2;
                            }
                        } catch (Throwable th11) {
                            th = th11;
                            slotReader = slotReaderM2;
                        }
                    }
                    try {
                        this.changeListWriter.Y();
                        i2++;
                        size = size;
                        pq1Var2 = pq1Var2;
                        c81VarP = c81VarP;
                        i = 0;
                    } catch (Throwable th12) {
                        th = th12;
                        pq1Var = pq1Var2;
                        c81Var = c81VarP;
                        pq1Var.V(c81Var);
                        throw th;
                    }
                } catch (Throwable th13) {
                    th = th13;
                    pq1Var2 = pq1Var2;
                    c81VarP = c81VarP;
                }
            }
            pq1 pq1Var5 = pq1Var2;
            c81 c81Var5 = c81VarP;
            this.changeListWriter.h();
            this.changeListWriter.A(0);
            pq1Var5.V(c81Var5);
        } catch (Throwable th14) {
            th = th14;
            pq1Var = pq1Var2;
            c81Var = c81VarP;
            pq1Var.V(c81Var);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e1(k kVar, c81 c81Var, SlotReader slotReader, r08 r08Var) {
        pq1 pq1Var = kVar.changeListWriter;
        c81 c81VarP = pq1Var.getChangeList();
        try {
            pq1Var.V(c81Var);
            SlotReader slotReader2 = kVar.reader;
            int[] iArr = kVar.nodeCountOverrides;
            o48<a69> o48Var = kVar.providerUpdates;
            kVar.nodeCountOverrides = null;
            kVar.providerUpdates = null;
            try {
                kVar.reader = slotReader;
                pq1 pq1Var2 = kVar.changeListWriter;
                boolean zQ = pq1Var2.getImplicitRootStart();
                try {
                    pq1Var2.W(false);
                    kVar.h1(r08Var.c(), r08Var.getLocals(), r08Var.getParameter(), true);
                    pq1Var2.W(zQ);
                    Unit unit = Unit.a;
                    kVar.reader = slotReader2;
                    kVar.nodeCountOverrides = iArr;
                    kVar.providerUpdates = o48Var;
                    pq1Var.V(c81VarP);
                    return Unit.a;
                } catch (Throwable th) {
                    pq1Var2.W(zQ);
                    throw th;
                }
            } catch (Throwable th2) {
                kVar.reader = slotReader2;
                kVar.nodeCountOverrides = iArr;
                kVar.providerUpdates = o48Var;
                throw th2;
            }
        } catch (Throwable th3) {
            pq1Var.V(c81VarP);
            throw th3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f1(k kVar, r08 r08Var) {
        kVar.h1(r08Var.c(), r08Var.getLocals(), r08Var.getParameter(), true);
        return Unit.a;
    }

    private final int g1(int index) {
        return (-2) - index;
    }

    private final void h1(final n08<Object> content, a69 locals, final Object parameter, boolean force) {
        V(126665345, content);
        T1(parameter);
        long compositeKeyHashCode = getCompositeKeyHashCode();
        try {
            this.compositeKeyHashCode = 126665345;
            boolean z = false;
            if (getInserting()) {
                SlotWriter.z0(this.writer, 0, 1, null);
            }
            if (!getInserting() && !Intrinsics.e(this.reader.l(), locals)) {
                z = true;
            }
            if (z) {
                u1(locals);
            }
            K1(202, e.f(), z15.INSTANCE.a(), locals);
            this.providerCache = null;
            if (!getInserting() || force) {
                boolean z2 = this.providersInvalid;
                this.providersInvalid = z;
                p04.a(this, ko1.c(-59194059, true, new Function2() { // from class: com.google.android.tu4
                    public final Object invoke(Object obj, Object obj2) {
                        return k.i1(content, parameter, (androidx.compose.p004runtime.d) obj, ((Integer) obj2).intValue());
                    }
                }));
                this.providersInvalid = z2;
            } else {
                this.writerHasAProvider = true;
                SlotWriter slotWriter = this.writer;
                this.parentContext.n(new r08(content, parameter, getComposition(), this.insertTable, slotWriter.B(slotWriter.L0(slotWriter.getParent())), m.p(), I0(), null));
            }
            P0();
            this.providerCache = null;
            this.compositeKeyHashCode = compositeKeyHashCode;
            Z();
        } catch (Throwable th) {
            try {
                throw jq1.b(th, new Function0() { // from class: com.google.android.uu4
                    public final Object invoke() {
                        return k.j1(this.a);
                    }
                });
            } catch (Throwable th2) {
                P0();
                this.providerCache = null;
                this.compositeKeyHashCode = compositeKeyHashCode;
                Z();
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i1(n08 n08Var, Object obj, d dVar, int i) {
        if (dVar.g((i & 3) != 2, i & 1)) {
            if (e.k()) {
                e.o(-59194059, i, -1, "androidx.compose.runtime.GapComposer.invokeMovableContentLambda.<anonymous> (GapComposer.kt:2265)");
            }
            n08Var.a().invoke(obj, dVar, 0);
            if (e.k()) {
                e.n();
            }
        } else {
            dVar.q();
        }
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fq1 j1(k kVar) {
        return kVar.K0();
    }

    private final Object m1(SlotReader slotReader, int i) {
        return slotReader.M(i);
    }

    private final int n1(int groupLocation, int group, int recomposeGroup, int recomposeIndex) {
        int iQ = this.reader.Q(group);
        while (iQ != recomposeGroup && !this.reader.K(iQ)) {
            iQ = this.reader.Q(iQ);
        }
        if (this.reader.K(iQ)) {
            recomposeIndex = 0;
        }
        if (iQ == group) {
            return recomposeIndex;
        }
        int iV1 = (V1(iQ) - this.reader.O(group)) + recomposeIndex;
        loop1: while (recomposeIndex < iV1 && iQ != groupLocation) {
            iQ++;
            while (iQ < groupLocation) {
                int iF = this.reader.F(iQ) + iQ;
                if (groupLocation >= iF) {
                    recomposeIndex += this.reader.K(iQ) ? 1 : V1(iQ);
                    iQ = iF;
                }
            }
            break loop1;
        }
        return recomposeIndex;
    }

    private final int o1(int group) {
        int iQ = this.reader.Q(group) + 1;
        int i = 0;
        while (iQ < group) {
            if (!this.reader.H(iQ)) {
                i++;
            }
            iQ += this.reader.F(iQ);
        }
        return i;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0041 A[Catch: all -> 0x0028, TRY_LEAVE, TryCatch #0 {all -> 0x0028, blocks: (B:3:0x0007, B:5:0x0012, B:7:0x0024, B:11:0x002e, B:10:0x002a, B:14:0x0035, B:16:0x003b, B:18:0x0041), top: B:23:0x0007 }] */
    private final <R> R p1(x22 from, x22 to, Integer index, List<? extends Pair<b0, ? extends Object>> invalidations, Function0<? extends R> block) {
        R r;
        boolean isComposing = getIsComposing();
        int i = this.nodeIndex;
        try {
            this.isComposing = true;
            this.nodeIndex = 0;
            int size = invalidations.size();
            for (int i2 = 0; i2 < size; i2++) {
                Pair<b0, ? extends Object> pair = invalidations.get(i2);
                b0 b0Var = (b0) pair.a();
                Object objB = pair.b();
                if (objB != null) {
                    r0(b0Var, objB);
                } else {
                    r0(b0Var, null);
                }
            }
            if (from == null) {
                r = (R) block.invoke();
            } else {
                r = (R) from.x(to, index != null ? index.intValue() : -1, block);
                if (r == null) {
                    r = (R) block.invoke();
                }
            }
            return r;
        } finally {
            this.isComposing = isComposing;
            this.nodeIndex = i;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ Object q1(k kVar, x22 x22Var, x22 x22Var2, Integer num, List list, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            x22Var = null;
        }
        if ((i & 2) != 0) {
            x22Var2 = null;
        }
        if ((i & 4) != 0) {
            num = null;
        }
        if ((i & 8) != 0) {
            list = m.p();
        }
        return kVar.p1(x22Var, x22Var2, num, list, function0);
    }

    private final void r1() {
        boolean isComposing = getIsComposing();
        this.isComposing = true;
        int parent = this.reader.getParent();
        int iF = this.reader.F(parent) + parent;
        int i = this.nodeIndex;
        long compositeKeyHashCode = getCompositeKeyHashCode();
        int i2 = this.groupNodeCount;
        int i3 = this.rGroupIndex;
        p pVarA = m.A(this.invalidations, this.reader.getCurrent(), iF);
        boolean z = false;
        int i4 = parent;
        while (pVarA != null) {
            int location = pVarA.getLocation();
            b0 scope = pVarA.getScope();
            m.H(this.invalidations, location);
            if (pVarA.d()) {
                this.reader.R(location);
                int current = this.reader.getCurrent();
                v1(i4, current, parent);
                this.nodeIndex = n1(location, current, parent, i);
                this.rGroupIndex = o1(current);
                this.compositeKeyHashCode = G0(this.reader.Q(current), parent, compositeKeyHashCode);
                this.providerCache = null;
                scope.e(this);
                this.providerCache = null;
                this.reader.S(parent);
                z = true;
                i4 = current;
            } else {
                w3c.j(this.invalidateStack, scope);
                this.observerHolder.a();
                scope.B();
                w3c.i(this.invalidateStack);
            }
            pVarA = m.A(this.invalidations, this.reader.getCurrent(), iF);
        }
        if (z) {
            v1(i4, parent, parent);
            this.reader.U();
            int iV1 = V1(parent);
            this.nodeIndex = i + iV1;
            this.groupNodeCount = i2 + iV1;
            this.rGroupIndex = i3;
        } else {
            H1();
        }
        this.compositeKeyHashCode = compositeKeyHashCode;
        this.isComposing = isComposing;
    }

    private final void s1() {
        y1(this.reader.getCurrent());
        this.changeListWriter.R();
    }

    private final void t1(ku4 anchor) {
        if (this.insertFixups.e()) {
            this.changeListWriter.u(anchor, this.insertTable);
        } else {
            this.changeListWriter.v(anchor, this.insertTable, this.insertFixups);
            this.insertFixups = new pe4();
        }
    }

    private final void u1(a69 providers) {
        o48<a69> o48Var = this.providerUpdates;
        if (o48Var == null) {
            o48Var = new o48<>(0, 1, null);
            this.providerUpdates = o48Var;
        }
        o48Var.r(this.reader.getCurrent(), providers);
    }

    private final void v1(int oldGroup, int newGroup, int commonRoot) {
        SlotReader slotReader = this.reader;
        int iF = m.F(slotReader, oldGroup, newGroup, commonRoot);
        while (oldGroup > 0 && oldGroup != iF) {
            if (slotReader.K(oldGroup)) {
                this.changeListWriter.B();
            }
            oldGroup = slotReader.Q(oldGroup);
        }
        N0(newGroup, iF);
    }

    private final int w1() {
        return this.rGroupIndex - 1;
    }

    private final void x1() {
        if (this.slotTable.x()) {
            getComposition().c0();
            c81 c81Var = new c81();
            D1(c81Var);
            SlotReader slotReaderM = this.slotTable.M();
            try {
                this.reader = slotReaderM;
                pq1 pq1Var = this.changeListWriter;
                c81 c81VarP = pq1Var.getChangeList();
                try {
                    pq1Var.V(c81Var);
                    y1(0);
                    this.changeListWriter.N();
                    pq1Var.V(c81VarP);
                    Unit unit = Unit.a;
                    slotReaderM.d();
                } catch (Throwable th) {
                    pq1Var.V(c81VarP);
                    throw th;
                }
            } catch (Throwable th2) {
                slotReaderM.d();
                throw th2;
            }
        }
    }

    private final void y1(int groupBeingRemoved) {
        boolean zK = this.reader.K(groupBeingRemoved);
        if (zK) {
            this.changeListWriter.i();
            this.changeListWriter.x(this.reader.M(groupBeingRemoved));
        }
        C1(this, groupBeingRemoved, groupBeingRemoved, zK, 0);
        this.changeListWriter.i();
        if (zK) {
            this.changeListWriter.B();
        }
    }

    private final void z0() {
        E0();
        w3c.a(this.pendingStack);
        this.parentStateStack.a();
        this.entersStack.a();
        this.providersInvalidStack.a();
        this.providerUpdates = null;
        this.insertFixups.a();
        this.compositeKeyHashCode = 0;
        this.childrenComposing = 0;
        this.nodeExpected = false;
        this.inserting = false;
        this.reusing = false;
        this.isComposing = false;
        this.forciblyRecompose = false;
        this.reusingGroup = -1;
        if (!this.reader.getClosed()) {
            this.reader.d();
        }
        if (this.writer.getClosed()) {
            return;
        }
        X0();
    }

    private static final r08 z1(k kVar, int i, List<r08> list) {
        Object objE = kVar.reader.E(i);
        Intrinsics.h(objE, "null cannot be cast to non-null type androidx.compose.runtime.MovableContent<kotlin.Any?>");
        n08 n08Var = (n08) objE;
        Object objC = kVar.reader.C(i, 0);
        ku4 ku4VarA = kVar.reader.a(i);
        int iF = kVar.reader.F(i) + i;
        ArrayList arrayList = new ArrayList();
        List<p> list2 = kVar.invalidations;
        for (int iY = m.y(list2, i); iY < list2.size(); iY++) {
            p pVar = list2.get(iY);
            if (pVar.getLocation() >= iF) {
                break;
            }
            arrayList.add(qjd.a(pVar.getScope(), pVar.getInstances()));
        }
        return new r08(n08Var, objC, kVar.getComposition(), kVar.slotTable, ku4VarA, arrayList, kVar.J0(i), list);
    }

    @Override // androidx.compose.p004runtime.d
    public boolean A(boolean value) {
        Object objK1 = k1();
        if ((objK1 instanceof Boolean) && value == ((Boolean) objK1).booleanValue()) {
            return false;
        }
        U1(Boolean.valueOf(value));
        return true;
    }

    @Override // androidx.compose.p004runtime.d
    public boolean B(float value) {
        Object objK1 = k1();
        if ((objK1 instanceof Float) && value == ((Number) objK1).floatValue()) {
            return false;
        }
        U1(Float.valueOf(value));
        return true;
    }

    @Override // androidx.compose.p004runtime.d
    public boolean C(int value) {
        Object objK1 = k1();
        if ((objK1 instanceof Integer) && value == ((Number) objK1).intValue()) {
            return false;
        }
        U1(Integer.valueOf(value));
        return true;
    }

    @Override // androidx.compose.p004runtime.d
    public boolean D(long value) {
        Object objK1 = k1();
        if ((objK1 instanceof Long) && value == ((Number) objK1).longValue()) {
            return false;
        }
        U1(Long.valueOf(value));
        return true;
    }

    public void D1(c81 c81Var) {
        this.deferredChanges = c81Var;
    }

    @Override // androidx.compose.p004runtime.d
    /* JADX INFO: renamed from: E, reason: from getter */
    public boolean getInserting() {
        return this.inserting;
    }

    public void E1(boolean z) {
        this.sourceMarkersEnabled = z;
    }

    @Override // androidx.compose.p004runtime.d
    public d F(int key) {
        y(key);
        D0();
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x008e  */
    /* JADX WARN: Code duplicated, block: B:30:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:32:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:34:0x00e7  */
    public void F1() {
        long jRotateLeft;
        long j;
        if (this.invalidations.isEmpty()) {
            G1();
            return;
        }
        SlotReader slotReader = this.reader;
        int iN = slotReader.n();
        Object objO = slotReader.o();
        Object objL = slotReader.l();
        int i = this.rGroupIndex;
        if (objO == null) {
            if (objL == null || iN != 207 || Intrinsics.e(objL, d.INSTANCE.a())) {
                jRotateLeft = Long.rotateLeft(Long.rotateLeft(getCompositeKeyHashCode(), 3) ^ ((long) iN), 3);
                j = i;
            } else {
                this.compositeKeyHashCode = Long.rotateLeft(Long.rotateLeft(getCompositeKeyHashCode(), 3) ^ ((long) objL.hashCode()), 3) ^ ((long) i);
            }
            N1(slotReader.J(), null);
            r1();
            slotReader.g();
            if (objO != null) {
                if (objO instanceof Enum) {
                    this.compositeKeyHashCode = Long.rotateRight(Long.rotateRight(getCompositeKeyHashCode() ^ ((long) 0), 3) ^ ((long) ((Enum) objO).ordinal()), 3);
                } else {
                    this.compositeKeyHashCode = Long.rotateRight(Long.rotateRight(getCompositeKeyHashCode() ^ ((long) 0), 3) ^ ((long) objO.hashCode()), 3);
                }
            }
            if (objL == null && iN == 207 && !Intrinsics.e(objL, d.INSTANCE.a())) {
                this.compositeKeyHashCode = Long.rotateRight(Long.rotateRight(getCompositeKeyHashCode() ^ ((long) i), 3) ^ ((long) objL.hashCode()), 3);
                return;
            } else {
                this.compositeKeyHashCode = Long.rotateRight(((long) iN) ^ Long.rotateRight(getCompositeKeyHashCode() ^ ((long) i), 3), 3);
            }
        }
        jRotateLeft = Long.rotateLeft(Long.rotateLeft(getCompositeKeyHashCode(), 3) ^ ((long) (objO instanceof Enum ? ((Enum) objO).ordinal() : objO.hashCode())), 3);
        j = 0;
        this.compositeKeyHashCode = jRotateLeft ^ j;
        N1(slotReader.J(), null);
        r1();
        slotReader.g();
        if (objO != null) {
            if (objL == null) {
            }
            this.compositeKeyHashCode = Long.rotateRight(((long) iN) ^ Long.rotateRight(getCompositeKeyHashCode() ^ ((long) i), 3), 3);
        } else if (objO instanceof Enum) {
            this.compositeKeyHashCode = Long.rotateRight(Long.rotateRight(getCompositeKeyHashCode() ^ ((long) 0), 3) ^ ((long) ((Enum) objO).ordinal()), 3);
        } else {
            this.compositeKeyHashCode = Long.rotateRight(Long.rotateRight(getCompositeKeyHashCode() ^ ((long) 0), 3) ^ ((long) objO.hashCode()), 3);
        }
    }

    @Override // androidx.compose.p004runtime.d
    public ez<?> G() {
        return this.applier;
    }

    @Override // androidx.compose.p004runtime.d
    public s6b H() {
        ku4 ku4VarA;
        b0 b0Var = null;
        b0 b0Var2 = w3c.f(this.invalidateStack) ? (b0) w3c.i(this.invalidateStack) : null;
        if (b0Var2 != null) {
            b0Var2.I(false);
            Function1<pr1, Unit> function1V0 = V0(b0Var2);
            if (function1V0 != null) {
                this.changeListWriter.f(function1V0, getComposition());
            }
            if (b0Var2.q()) {
                b0Var2.L(false);
                this.changeListWriter.k(b0Var2);
                b0Var2.M(false);
                if (b0Var2.p()) {
                    b0Var2.K(false);
                    if (this.reusingGroup == this.reader.getParent()) {
                        this.reusing = false;
                        this.reusingGroup = -1;
                    }
                }
            }
        }
        if (b0Var2 != null && !b0Var2.s() && (b0Var2.t() || this.forceRecomposeScopes)) {
            if (b0Var2.getAnchor() == null) {
                if (getInserting()) {
                    SlotWriter slotWriter = this.writer;
                    ku4VarA = slotWriter.B(slotWriter.getParent());
                } else {
                    SlotReader slotReader = this.reader;
                    ku4VarA = slotReader.a(slotReader.getParent());
                }
                b0Var2.D(ku4VarA);
            }
            b0Var2.F(false);
            b0Var = b0Var2;
        }
        O0(false);
        return b0Var;
    }

    @Override // androidx.compose.p004runtime.d
    public Object I(Object left, Object right) {
        Object objC = m.C(this.reader.o(), left, right);
        return objC == null ? new JoinedKey(left, right) : objC;
    }

    @Override // androidx.compose.p004runtime.d
    public void J() {
        K1(125, null, z15.INSTANCE.b(), null);
        this.nodeExpected = true;
    }

    @Override // androidx.compose.p004runtime.d
    /* JADX INFO: renamed from: K, reason: from getter */
    public CoroutineContext getApplyCoroutineContext() {
        return this.applyCoroutineContext;
    }

    @Override // androidx.compose.p004runtime.d
    public void L(Object value) {
        P1(value);
    }

    @Override // androidx.compose.p004runtime.d
    public void M() {
        P0();
        b0 b0VarH0 = h0();
        if (b0VarH0 == null || !b0VarH0.t()) {
            return;
        }
        b0VarH0.E(true);
    }

    @Override // androidx.compose.p004runtime.d
    public void N() {
        this.forceRecomposeScopes = true;
        E1(true);
        this.slotTable.d();
        this.insertTable.d();
        this.writer.B1();
    }

    @Override // androidx.compose.p004runtime.d
    public qaa O() {
        return h0();
    }

    @Override // androidx.compose.p004runtime.d
    public void P() {
        if (this.reusing && this.reader.getParent() == this.reusingGroup) {
            this.reusingGroup = -1;
            this.reusing = false;
        }
        O0(false);
    }

    public final void P1(Object value) {
        boolean z = value instanceof yea;
        Object obj = value;
        if (z) {
            yu4 yu4Var = new yu4((yea) value, w1());
            if (getInserting()) {
                this.changeListWriter.P(yu4Var);
            }
            this.abandonSet.add(value);
            obj = yu4Var;
        }
        U1(obj);
    }

    @Override // androidx.compose.p004runtime.d
    public void Q(int key) {
        K1(key, null, z15.INSTANCE.a(), null);
    }

    @Override // androidx.compose.p004runtime.d
    public Object R() {
        return l1();
    }

    @Override // androidx.compose.p004runtime.d
    public rr1 S() {
        rr1 rr1Var = this._compositionData;
        if (rr1Var != null) {
            return rr1Var;
        }
        wu4 wu4Var = new wu4(getComposition());
        this._compositionData = wu4Var;
        return wu4Var;
    }

    @Override // androidx.compose.p004runtime.d
    public boolean T(Object value) {
        if (k1() == value) {
            return false;
        }
        U1(value);
        return true;
    }

    @Override // androidx.compose.p004runtime.d
    public void U() {
        K1(-127, null, z15.INSTANCE.a(), null);
    }

    public final void U1(Object value) {
        if (getInserting()) {
            this.writer.s1(value);
            return;
        }
        if (!this.reader.getHadNext()) {
            pq1 pq1Var = this.changeListWriter;
            SlotReader slotReader = this.reader;
            pq1Var.a(slotReader.a(slotReader.getParent()), value);
            return;
        }
        int iQ = this.reader.q() - 1;
        if (!this.changeListWriter.r()) {
            this.changeListWriter.e0(value, iQ);
            return;
        }
        pq1 pq1Var2 = this.changeListWriter;
        SlotReader slotReader2 = this.reader;
        pq1Var2.b0(value, slotReader2.a(slotReader2.getParent()), iQ);
    }

    @Override // androidx.compose.p004runtime.d
    public void V(int key, Object dataKey) {
        K1(key, dataKey, z15.INSTANCE.a(), null);
    }

    @Override // androidx.compose.p004runtime.d
    public <T> void W(Function0<? extends T> factory) {
        W1();
        if (!getInserting()) {
            e.b("createNode() can only be called when inserting");
        }
        int iC = this.parentStateStack.c();
        SlotWriter slotWriter = this.writer;
        ku4 ku4VarB = slotWriter.B(slotWriter.getParent());
        this.groupNodeCount++;
        this.insertFixups.b(factory, iC, ku4VarB);
    }

    @Override // androidx.compose.p004runtime.d
    public void X() {
        P0();
        P0();
        this.providersInvalid = m.q(this.providersInvalidStack.g());
        this.providerCache = null;
    }

    /* JADX INFO: renamed from: Y0, reason: from getter */
    public g getComposition() {
        return this.composition;
    }

    @Override // androidx.compose.p004runtime.d
    public void Z() {
        P0();
    }

    @Override // androidx.compose.p004runtime.o
    /* JADX INFO: renamed from: Z0, reason: from getter and merged with bridge method [inline-methods] */
    public c81 getDeferredChanges() {
        return this.deferredChanges;
    }

    @Override // androidx.compose.p004runtime.d
    public int a() {
        return getInserting() ? -this.writer.getParent() : this.reader.getParent();
    }

    @Override // androidx.compose.p004runtime.d
    public void a0() {
        P0();
    }

    @Override // androidx.compose.p004runtime.d
    public void b(boolean changed) {
        if (!(this.groupNodeCount == 0)) {
            e.b("No nodes can be emitted before calling deactivateToEndGroup");
        }
        if (getInserting()) {
            return;
        }
        if (!changed) {
            H1();
            return;
        }
        int current = this.reader.getCurrent();
        int end = this.reader.getEnd();
        this.changeListWriter.d();
        m.I(this.invalidations, current, end);
        this.reader.U();
    }

    @Override // androidx.compose.p004runtime.o
    public void b0() {
        this.providerUpdates = null;
    }

    /* JADX INFO: renamed from: b1, reason: from getter */
    public final SlotReader getReader() {
        return this.reader;
    }

    @Override // androidx.compose.p004runtime.d
    public boolean c() {
        b0 b0VarH0;
        return (getInserting() || this.reusing || this.providersInvalid || (b0VarH0 = h0()) == null || b0VarH0.n() || this.forciblyRecompose) ? false : true;
    }

    @Override // androidx.compose.p004runtime.o
    public void c0(k58<Object, Object> invalidationsRequested, Function2<? super d, ? super Integer, Unit> content, fob shouldPause) {
        if (!this.changes.c()) {
            e.b("Expected applyChanges() to have been called");
        }
        this.shouldPauseCallback = shouldPause;
        try {
            L0(invalidationsRequested, content);
        } finally {
            this.shouldPauseCallback = null;
        }
    }

    @Override // androidx.compose.p004runtime.d
    public void d(List<Pair<r08, r08>> references) {
        vbd vbdVar = vbd.a;
        Object objA = vbdVar.a("Compose:insertMovableContent");
        try {
            try {
                d1(references);
                E0();
                Unit unit = Unit.a;
                vbdVar.b(objA);
            } catch (Throwable th) {
                z0();
                throw th;
            }
        } catch (Throwable th2) {
            vbd.a.b(objA);
            throw th2;
        }
    }

    @Override // androidx.compose.p004runtime.o
    public void d0() {
        w3c.a(this.invalidateStack);
        this.invalidations.clear();
        this.changes.a();
        this.providerUpdates = null;
    }

    @Override // androidx.compose.p004runtime.d
    public <V, T> void e(V value, Function2<? super T, ? super V, Unit> block) {
        if (getInserting()) {
            this.insertFixups.f(value, block);
        } else {
            this.changeListWriter.d0(value, block);
        }
    }

    @Override // androidx.compose.p004runtime.o
    public void e0() {
        Object objA = vbd.a.a("Compose:Composer.dispose");
        try {
            this.parentContext.y(this);
            d0();
            G().clear();
            this.isDisposed = true;
            Unit unit = Unit.a;
        } finally {
            vbd.a.b(objA);
        }
    }

    @Override // androidx.compose.p004runtime.d
    /* JADX INFO: renamed from: f, reason: from getter */
    public long getCompositeKeyHashCode() {
        return this.compositeKeyHashCode;
    }

    @Override // androidx.compose.p004runtime.o
    public void f0() {
        if (!(!getIsComposing() && this.reusingGroup == 0)) {
            ei9.a("Cannot disable reuse from root if it was caused by other groups");
        }
        this.reusingGroup = -1;
        this.reusing = false;
    }

    @Override // androidx.compose.p004runtime.d
    public boolean g(boolean parametersChanged, int flags) {
        b0 b0VarH0;
        if ((flags & 1) != 0 || (!getInserting() && !this.reusing)) {
            return parametersChanged || !c();
        }
        fob fobVar = this.shouldPauseCallback;
        if (fobVar == null || (b0VarH0 = h0()) == null || !fobVar.a() || b0VarH0.q()) {
            return true;
        }
        b0VarH0.O(true);
        b0VarH0.M(this.reusing);
        b0VarH0.H(true);
        this.changeListWriter.Q(b0VarH0);
        this.parentContext.u(b0VarH0);
        return false;
    }

    @Override // androidx.compose.p004runtime.o
    public boolean g0() {
        return this.childrenComposing > 0;
    }

    @Override // androidx.compose.p004runtime.d
    public void h(int marker) {
        if (marker < 0) {
            int i = -marker;
            SlotWriter slotWriter = this.writer;
            while (true) {
                int parent = slotWriter.getParent();
                if (parent <= i) {
                    return;
                } else {
                    O0(slotWriter.w0(parent));
                }
            }
        } else {
            if (getInserting()) {
                SlotWriter slotWriter2 = this.writer;
                while (getInserting()) {
                    O0(slotWriter2.w0(slotWriter2.getParent()));
                }
            }
            SlotReader slotReader = this.reader;
            while (true) {
                int parent2 = slotReader.getParent();
                if (parent2 <= marker) {
                    return;
                } else {
                    O0(slotReader.K(parent2));
                }
            }
        }
    }

    @Override // androidx.compose.p004runtime.o
    public b0 h0() {
        ArrayList<b0> arrayList = this.invalidateStack;
        if (this.childrenComposing == 0 && w3c.f(arrayList)) {
            return (b0) w3c.g(arrayList);
        }
        return null;
    }

    @Override // androidx.compose.p004runtime.d
    public void i(os9<?>[] values) {
        a69 a69VarS1;
        a69 a69VarI0 = I0();
        M1(201, e.h());
        boolean z = true;
        boolean z2 = false;
        if (getInserting()) {
            a69VarS1 = S1(a69VarI0, hs1.d(values, a69VarI0, null, 4, null));
            this.writerHasAProvider = true;
        } else {
            Object objB = this.reader.B(0);
            Intrinsics.h(objB, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            a69 a69Var = (a69) objB;
            Object objB2 = this.reader.B(1);
            Intrinsics.h(objB2, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            a69 a69Var2 = (a69) objB2;
            a69 a69VarC = hs1.c(values, a69VarI0, a69Var2);
            if (c() && !this.reusing && Intrinsics.e(a69Var2, a69VarC)) {
                G1();
                a69VarS1 = a69Var;
            } else {
                a69VarS1 = S1(a69VarI0, a69VarC);
                if (!this.reusing && Intrinsics.e(a69VarS1, a69Var)) {
                    z = false;
                }
                z2 = z;
            }
        }
        if (z2 && !getInserting()) {
            u1(a69VarS1);
        }
        this.providersInvalidStack.i(m.s(this.providersInvalid));
        this.providersInvalid = z2;
        this.providerCache = a69VarS1;
        K1(202, e.f(), z15.INSTANCE.a(), a69VarS1);
    }

    @Override // androidx.compose.p004runtime.d
    public gs1 j() {
        return I0();
    }

    @Override // androidx.compose.p004runtime.o
    public ur1 j0() {
        if (this.parentContext.m()) {
            return this.errorContext;
        }
        return null;
    }

    @Override // androidx.compose.p004runtime.d
    public void k() {
        W1();
        if (getInserting()) {
            e.b("useNode() called while inserting");
        }
        Object objA1 = a1(this.reader);
        this.changeListWriter.x(objA1);
        if (this.reusing && (objA1 instanceof aq1)) {
            this.changeListWriter.f0(objA1);
        }
    }

    @Override // androidx.compose.p004runtime.o
    /* JADX INFO: renamed from: k0, reason: from getter */
    public boolean getSourceMarkersEnabled() {
        return this.sourceMarkersEnabled;
    }

    public final Object k1() {
        if (getInserting()) {
            X1();
            return d.INSTANCE.a();
        }
        Object objL = this.reader.L();
        return (!this.reusing || (objL instanceof ena)) ? objL : d.INSTANCE.a();
    }

    @Override // androidx.compose.p004runtime.d
    public void l() {
        P0();
        P0();
        this.providersInvalid = m.q(this.providersInvalidStack.g());
        this.providerCache = null;
    }

    @Override // androidx.compose.p004runtime.o
    /* JADX INFO: renamed from: l0, reason: from getter */
    public boolean getIsComposing() {
        return this.isComposing;
    }

    public final Object l1() {
        if (getInserting()) {
            X1();
            return d.INSTANCE.a();
        }
        Object objL = this.reader.L();
        if (!this.reusing || (objL instanceof ena)) {
            return objL instanceof zea ? ((zea) objL).getWrapped() : objL;
        }
        return d.INSTANCE.a();
    }

    @Override // androidx.compose.p004runtime.d
    public void m() {
        O0(true);
    }

    @Override // androidx.compose.p004runtime.o
    public List<ComposeStackTraceFrame> m0() {
        Integer numE;
        pr1 pr1VarI = this.parentContext.i();
        g gVar = pr1VarI instanceof g ? (g) pr1VarI : null;
        if (gVar != null && (numE = hq1.e(tub.o(gVar.getSlotStorage()), this.parentContext)) != null) {
            SlotReader slotReaderM = tub.o(gVar.getSlotStorage()).M();
            try {
                return m.a1(hq1.g(slotReaderM, numE.intValue(), 0), gVar.getComposer().m0());
            } finally {
                slotReaderM.d();
            }
        }
        return m.p();
    }

    @Override // androidx.compose.p004runtime.d
    public void n(Function0<Unit> effect) {
        this.changeListWriter.X(effect);
    }

    @Override // androidx.compose.p004runtime.o
    public void n0(Function0<Unit> block) {
        if (getIsComposing()) {
            e.b("Preparing a composition while composing is not supported");
        }
        this.isComposing = true;
        try {
            block.invoke();
        } finally {
            this.isComposing = false;
        }
    }

    @Override // androidx.compose.p004runtime.d
    public void o() {
        K1(125, null, z15.INSTANCE.c(), null);
        this.nodeExpected = true;
    }

    @Override // androidx.compose.p004runtime.o
    public boolean o0(k58<Object, Object> invalidationsRequested, fob shouldPause) {
        if (!this.changes.c()) {
            e.b("Expected applyChanges() to have been called");
        }
        if (r6b.i(invalidationsRequested) <= 0 && this.invalidations.isEmpty() && !this.forciblyRecompose) {
            return false;
        }
        this.shouldPauseCallback = shouldPause;
        try {
            L0(invalidationsRequested, null);
            return this.changes.d();
        } finally {
            this.shouldPauseCallback = null;
        }
    }

    @Override // androidx.compose.p004runtime.d
    public void p(int key, Object dataKey) {
        if (!getInserting() && this.reader.n() == key && !Intrinsics.e(this.reader.l(), dataKey) && this.reusingGroup < 0) {
            this.reusingGroup = this.reader.getCurrent();
            this.reusing = true;
        }
        K1(key, null, z15.INSTANCE.a(), dataKey);
    }

    @Override // androidx.compose.p004runtime.o
    public fq1 p0(final Object value) {
        List listP;
        ObjectLocation objectLocationD = hq1.d(this.slotTable, new Function1() { // from class: com.google.android.su4
            public final Object invoke(Object obj) {
                return Boolean.valueOf(k.J1(value, obj));
            }
        });
        if (objectLocationD == null || (listP = m.a1(I1(objectLocationD.getGroup(), objectLocationD.getDataOffset()), m0())) == null) {
            listP = m.p();
        }
        return new fq1(listP, getSourceMarkersEnabled());
    }

    @Override // androidx.compose.p004runtime.d
    public void q() {
        if (!(this.groupNodeCount == 0)) {
            e.b("No nodes can be emitted before calling skipAndEndGroup");
        }
        if (getInserting()) {
            return;
        }
        b0 b0VarH0 = h0();
        if (b0VarH0 != null) {
            b0VarH0.C();
        }
        if (this.invalidations.isEmpty()) {
            H1();
        } else {
            r1();
        }
    }

    @Override // androidx.compose.p004runtime.o
    public void q0() {
        this.reusingGroup = 0;
        this.reusing = true;
    }

    @Override // androidx.compose.p004runtime.d
    public void r(os9<?> value) {
        c1e<?> c1eVar;
        a69 a69VarI0 = I0();
        M1(201, e.h());
        Object objR = R();
        if (Intrinsics.e(objR, d.INSTANCE.a())) {
            c1eVar = null;
        } else {
            Intrinsics.h(objR, "null cannot be cast to non-null type androidx.compose.runtime.ValueHolder<kotlin.Any?>");
            c1eVar = (c1e) objR;
        }
        zr1<?> zr1VarB = value.b();
        Intrinsics.h(zr1VarB, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
        Intrinsics.h(value, "null cannot be cast to non-null type androidx.compose.runtime.ProvidedValue<kotlin.Any?>");
        c1e<?> c1eVarB = zr1VarB.b(value, c1eVar);
        boolean zE = Intrinsics.e(c1eVarB, c1eVar);
        if (!zE) {
            L(c1eVarB);
        }
        boolean z = true;
        boolean z2 = false;
        if (getInserting()) {
            if (value.getCanOverride() || !hs1.a(a69VarI0, zr1VarB)) {
                a69VarI0 = a69VarI0.Y0(zr1VarB, c1eVarB);
            }
            this.writerHasAProvider = true;
        } else {
            SlotReader slotReader = this.reader;
            Object objA = slotReader.A(slotReader.getCurrent());
            Intrinsics.h(objA, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            a69 a69Var = (a69) objA;
            if (!(c() && zE) && (value.getCanOverride() || !hs1.a(a69VarI0, zr1VarB))) {
                a69VarI0 = a69VarI0.Y0(zr1VarB, c1eVarB);
            } else if ((zE && !this.providersInvalid) || !this.providersInvalid) {
                a69VarI0 = a69Var;
            }
            if (!this.reusing && a69Var == a69VarI0) {
                z = false;
            }
            z2 = z;
        }
        if (z2 && !getInserting()) {
            u1(a69VarI0);
        }
        this.providersInvalidStack.i(m.s(this.providersInvalid));
        this.providersInvalid = z2;
        this.providerCache = a69VarI0;
        K1(202, e.f(), z15.INSTANCE.a(), a69VarI0);
    }

    @Override // androidx.compose.p004runtime.o
    public boolean r0(b0 scope, Object instance) {
        mg anchor = scope.getAnchor();
        if (anchor == null) {
            return false;
        }
        int iD = lu4.a(anchor).d(this.reader.getTable());
        if (!getIsComposing() || iD < this.reader.getCurrent()) {
            return false;
        }
        m.D(this.invalidations, iD, scope, instance);
        return true;
    }

    @Override // androidx.compose.p004runtime.d
    public void s(n08<?> value, Object parameter) {
        Intrinsics.h(value, "null cannot be cast to non-null type androidx.compose.runtime.MovableContent<kotlin.Any?>");
        h1(value, I0(), parameter, false);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00ab A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x00ad A[LOOP:1: B:20:0x0053->B:37:0x00ad, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:45:0x00b0 A[EDGE_INSN: B:45:0x00b0->B:38:0x00b0 BREAK  A[LOOP:1: B:20:0x0053->B:37:0x00ad], SYNTHETIC] */
    @Override // androidx.compose.p004runtime.o
    public void s0(k58<Object, Object> invalidationsRequested) {
        ku4 ku4VarA;
        for (int iR = m.r(this.invalidations); -1 < iR; iR--) {
            p pVar = this.invalidations.get(iR);
            mg anchor = pVar.getScope().getAnchor();
            ku4 ku4VarA2 = anchor != null ? lu4.a(anchor) : null;
            if (ku4VarA2 == null || !ku4VarA2.a()) {
                this.invalidations.remove(iR);
            } else if (pVar.getLocation() != ku4VarA2.getLocation()) {
                pVar.f(ku4VarA2.getLocation());
            }
        }
        Object[] objArr = invalidationsRequested.keys;
        Object[] objArr2 = invalidationsRequested.values;
        long[] jArr = invalidationsRequested.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i != length) {
                        break;
                        break;
                    }
                    i++;
                } else {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            Object obj = objArr[i4];
                            Object obj2 = objArr2[i4];
                            Intrinsics.h(obj, "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl");
                            b0 b0Var = (b0) obj;
                            mg anchor2 = b0Var.getAnchor();
                            if (anchor2 != null && (ku4VarA = lu4.a(anchor2)) != null) {
                                int location = ku4VarA.getLocation();
                                List<p> list = this.invalidations;
                                if (obj2 == q6b.a) {
                                    obj2 = null;
                                }
                                list.add(new p(b0Var, location, obj2));
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    } else if (i != length) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
        m.F(this.invalidations, m.a);
    }

    @Override // androidx.compose.p004runtime.d
    public boolean t() {
        b0 b0VarH0;
        return !c() || this.providersInvalid || ((b0VarH0 = h0()) != null && b0VarH0.k());
    }

    @Override // androidx.compose.p004runtime.d
    public void u() {
        P0();
    }

    @Override // androidx.compose.p004runtime.d
    public <T> T v(zr1<T> key) {
        return (T) hs1.b(I0(), key);
    }

    @Override // androidx.compose.p004runtime.d
    public f w() {
        M1(206, e.j());
        if (getInserting()) {
            SlotWriter.z0(this.writer, 0, 1, null);
        }
        Object objK1 = k1();
        zea cnaVar = objK1 instanceof zea ? (zea) objK1 : null;
        if (cnaVar == null) {
            cnaVar = new cna(new a(new b(getCompositeKeyHashCode(), this.forceRecomposeScopes, getSourceMarkersEnabled(), getComposition().getObserverHolder())), -1);
            U1(cnaVar);
        }
        yea wrapped = cnaVar.getWrapped();
        Intrinsics.h(wrapped, "null cannot be cast to non-null type androidx.compose.runtime.GapComposer.CompositionContextHolder");
        a aVar = (a) wrapped;
        aVar.getRef().E(I0());
        P0();
        return aVar.getRef();
    }

    @Override // androidx.compose.p004runtime.d
    public boolean x(Object value) {
        if (Intrinsics.e(k1(), value)) {
            return false;
        }
        U1(value);
        return true;
    }

    @Override // androidx.compose.p004runtime.d
    public void y(int key) {
        if (this.pending != null) {
            K1(key, null, z15.INSTANCE.a(), null);
            return;
        }
        X1();
        this.compositeKeyHashCode = Long.rotateLeft(Long.rotateLeft(getCompositeKeyHashCode(), 3) ^ ((long) key), 3) ^ ((long) this.rGroupIndex);
        this.rGroupIndex++;
        SlotReader slotReader = this.reader;
        if (getInserting()) {
            slotReader.c();
            this.writer.n1(key, d.INSTANCE.a());
            S0(false, null);
            return;
        }
        if (slotReader.n() == key && !slotReader.s()) {
            slotReader.W();
            S0(false, null);
            return;
        }
        if (!slotReader.I()) {
            int i = this.nodeIndex;
            int current = slotReader.getCurrent();
            s1();
            this.changeListWriter.S(i, slotReader.T());
            m.I(this.invalidations, current, slotReader.getCurrent());
        }
        slotReader.c();
        this.inserting = true;
        this.providerCache = null;
        R0();
        SlotWriter slotWriter = this.writer;
        slotWriter.F();
        int currentGroup = slotWriter.getCurrentGroup();
        slotWriter.n1(key, d.INSTANCE.a());
        this.insertAnchor = slotWriter.B(currentGroup);
        S0(false, null);
    }

    @Override // androidx.compose.p004runtime.d
    public void z(qaa scope) {
        b0 b0Var = scope instanceof b0 ? (b0) scope : null;
        if (b0Var != null) {
            b0Var.O(true);
        }
    }
}
