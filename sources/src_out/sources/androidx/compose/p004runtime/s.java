package androidx.compose.p004runtime;

import androidx.collection.ScatterSet;
import androidx.compose.p004runtime.composer.linkbuffer.changelist.ComposerChangeListWriterAddressMode;
import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.s;
import androidx.compose.p004runtime.snapshots.i;
import com.google.android.bqd;
import com.google.inputmethod.ComposeStackTraceFrame;
import com.google.inputmethod.IntRef;
import com.google.inputmethod.JoinedKey;
import com.google.inputmethod.ObjectLocation;
import com.google.inputmethod.StaticValueHolder;
import com.google.inputmethod.a69;
import com.google.inputmethod.aq1;
import com.google.inputmethod.b69;
import com.google.inputmethod.b81;
import com.google.inputmethod.c1e;
import com.google.inputmethod.c37;
import com.google.inputmethod.cub;
import com.google.inputmethod.d81;
import com.google.inputmethod.dna;
import com.google.inputmethod.ei9;
import com.google.inputmethod.ena;
import com.google.inputmethod.eub;
import com.google.inputmethod.ez;
import com.google.inputmethod.fob;
import com.google.inputmethod.fq1;
import com.google.inputmethod.g37;
import com.google.inputmethod.g81;
import com.google.inputmethod.gs1;
import com.google.inputmethod.hs1;
import com.google.inputmethod.iub;
import com.google.inputmethod.iz5;
import com.google.inputmethod.jq1;
import com.google.inputmethod.js1;
import com.google.inputmethod.jub;
import com.google.inputmethod.k58;
import com.google.inputmethod.k79;
import com.google.inputmethod.ko1;
import com.google.inputmethod.kub;
import com.google.inputmethod.m48;
import com.google.inputmethod.mg;
import com.google.inputmethod.n08;
import com.google.inputmethod.o41;
import com.google.inputmethod.o48;
import com.google.inputmethod.o58;
import com.google.inputmethod.oe4;
import com.google.inputmethod.os9;
import com.google.inputmethod.p04;
import com.google.inputmethod.p47;
import com.google.inputmethod.p48;
import com.google.inputmethod.pr1;
import com.google.inputmethod.q08;
import com.google.inputmethod.q6b;
import com.google.inputmethod.qaa;
import com.google.inputmethod.qq1;
import com.google.inputmethod.r08;
import com.google.inputmethod.r58;
import com.google.inputmethod.r6b;
import com.google.inputmethod.rr1;
import com.google.inputmethod.s6b;
import com.google.inputmethod.sr1;
import com.google.inputmethod.sub;
import com.google.inputmethod.t04;
import com.google.inputmethod.t16;
import com.google.inputmethod.t27;
import com.google.inputmethod.ti6;
import com.google.inputmethod.u27;
import com.google.inputmethod.ur1;
import com.google.inputmethod.uub;
import com.google.inputmethod.v15;
import com.google.inputmethod.v1d;
import com.google.inputmethod.vbd;
import com.google.inputmethod.vub;
import com.google.inputmethod.w3c;
import com.google.inputmethod.wr1;
import com.google.inputmethod.x22;
import com.google.inputmethod.x43;
import com.google.inputmethod.y1d;
import com.google.inputmethod.yea;
import com.google.inputmethod.z15;
import com.google.inputmethod.zea;
import com.google.inputmethod.zr1;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.m;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0090\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0002È\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0004º\u0001ø\u0002BQ\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0018\u0010\u0016J\u000f\u0010\u0019\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0019\u0010\u0016J\u0011\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ3\u0010#\u001a\u00020\u00142\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f0\u001d2\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010!H\u0003¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020\u00142\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u0014H\u0002¢\u0006\u0004\b)\u0010\u0016J\u000f\u0010*\u001a\u00020\u0014H\u0002¢\u0006\u0004\b*\u0010\u0016J!\u0010-\u001a\u00020\u00142\u0006\u0010&\u001a\u00020%2\b\u0010,\u001a\u0004\u0018\u00010+H\u0002¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u0014H\u0002¢\u0006\u0004\b/\u0010\u0016J\u001f\u00103\u001a\u00020\u00142\u0006\u00101\u001a\u0002002\u0006\u00102\u001a\u00020%H\u0002¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\u0014H\u0002¢\u0006\u0004\b5\u0010\u0016J\u000f\u00106\u001a\u00020\u0014H\u0002¢\u0006\u0004\b6\u0010\u0016J\u000f\u00108\u001a\u000207H\u0002¢\u0006\u0004\b8\u00109J\u001b\u0010<\u001a\u0002072\n\u0010;\u001a\u000600j\u0002`:H\u0002¢\u0006\u0004\b<\u0010=J+\u0010B\u001a\u00020\u00142\u001a\u0010A\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020@\u0012\u0006\u0012\u0004\u0018\u00010@0?0>H\u0003¢\u0006\u0004\bB\u0010CJg\u0010K\u001a\u00028\u0000\"\u0004\b\u0000\u0010D2\n\b\u0002\u0010F\u001a\u0004\u0018\u00010E2\n\b\u0002\u0010G\u001a\u0004\u0018\u00010E2\f\b\u0002\u0010H\u001a\u000600j\u0002`:2\u001c\b\u0002\u0010I\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0006\u0012\u0004\u0018\u00010\u001f0?0>2\f\u0010J\u001a\b\u0012\u0004\u0012\u00028\u00000!H\u0002¢\u0006\u0004\bK\u0010LJ9\u0010Q\u001a\u00020\u00142\u000e\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0M2\u0006\u0010N\u001a\u0002072\b\u0010O\u001a\u0004\u0018\u00010\u001f2\u0006\u0010P\u001a\u00020%H\u0003¢\u0006\u0004\bQ\u0010RJ\u001b\u0010U\u001a\u00020%2\n\u0010;\u001a\u00060Sj\u0002`TH\u0002¢\u0006\u0004\bU\u0010VJ\u000f\u0010W\u001a\u00020\u0014H\u0003¢\u0006\u0004\bW\u0010\u0016J\u000f\u0010X\u001a\u00020\u0014H\u0002¢\u0006\u0004\bX\u0010\u0016J\u001b\u0010Z\u001a\u00020\u00142\n\u0010Y\u001a\u00060Sj\u0002`TH\u0002¢\u0006\u0004\bZ\u0010[J\u0017\u0010]\u001a\u00020\u00142\u0006\u0010\\\u001a\u000207H\u0002¢\u0006\u0004\b]\u0010^J\u000f\u0010_\u001a\u00020\u0014H\u0002¢\u0006\u0004\b_\u0010\u0016J\u001b\u0010a\u001a\u00020\u00142\n\u0010`\u001a\u00060Sj\u0002`TH\u0002¢\u0006\u0004\ba\u0010[J\u0017\u0010c\u001a\u00020\u00142\u0006\u0010b\u001a\u00020%H\u0002¢\u0006\u0004\bc\u0010(J\u001b\u0010d\u001a\u00020\u001e2\n\u0010;\u001a\u000600j\u0002`:H\u0002¢\u0006\u0004\bd\u0010eJ\u001b\u0010f\u001a\u00020%2\n\u0010;\u001a\u000600j\u0002`:H\u0002¢\u0006\u0004\bf\u0010gJ\u001b\u0010h\u001a\u0002002\n\u0010;\u001a\u000600j\u0002`:H\u0002¢\u0006\u0004\bh\u0010iJ\u000f\u0010j\u001a\u00020\u0014H\u0002¢\u0006\u0004\bj\u0010\u0016J\u000f\u0010k\u001a\u00020\u0014H\u0002¢\u0006\u0004\bk\u0010\u0016J3\u0010q\u001a\u00020\u00142\u0006\u0010l\u001a\u0002002\b\u0010m\u001a\u0004\u0018\u00010\u001f2\u0006\u0010o\u001a\u00020n2\b\u0010p\u001a\u0004\u0018\u00010\u001fH\u0002¢\u0006\u0004\bq\u0010rJ!\u0010t\u001a\u00020\u00142\u0006\u0010l\u001a\u0002002\b\u0010s\u001a\u0004\u0018\u00010\u001fH\u0002¢\u0006\u0004\bt\u0010uJ!\u0010v\u001a\u00020\u00142\u0006\u0010&\u001a\u00020%2\b\u0010p\u001a\u0004\u0018\u00010\u001fH\u0002¢\u0006\u0004\bv\u0010wJ\u000f\u0010x\u001a\u00020\u0014H\u0002¢\u0006\u0004\bx\u0010\u0016J'\u0010{\u001a\b\u0012\u0004\u0012\u00020z0>2\u0006\u0010;\u001a\u0002002\b\u0010y\u001a\u0004\u0018\u000100H\u0002¢\u0006\u0004\b{\u0010|J&\u0010\u0080\u0001\u001a\u00020\u00142\n\u0010~\u001a\u00060Sj\u0002`}2\u0006\u0010\u007f\u001a\u000200H\u0002¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001J(\u0010\u0084\u0001\u001a\u00020\u00142\u000b\u0010\u0082\u0001\u001a\u00060Sj\u0002`}2\u0007\u0010\u0083\u0001\u001a\u000200H\u0002¢\u0006\u0006\b\u0084\u0001\u0010\u0081\u0001J$\u0010\u0087\u0001\u001a\u0002072\u0007\u0010\u0085\u0001\u001a\u0002072\u0007\u0010\u0086\u0001\u001a\u000207H\u0002¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001J\u001d\u0010\u008a\u0001\u001a\u00020\u00142\t\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u001fH\u0002¢\u0006\u0006\b\u008a\u0001\u0010\u008b\u0001J\u001f\u0010\u008c\u0001\u001a\u0002002\u000b\u0010\u0082\u0001\u001a\u00060Sj\u0002`}H\u0002¢\u0006\u0006\b\u008c\u0001\u0010\u008d\u0001J\u001a\u0010\u008e\u0001\u001a\u0004\u0018\u00010\u001f*\u0004\u0018\u00010\u001fH\u0002¢\u0006\u0006\b\u008e\u0001\u0010\u008f\u0001J\u001b\u0010\u0091\u0001\u001a\u00020\u00142\u0007\u0010\u0090\u0001\u001a\u00020\u001eH\u0002¢\u0006\u0006\b\u0091\u0001\u0010\u0092\u0001J+\u0010\u0095\u0001\u001a\u0012\u0012\u0005\u0012\u00030\u0094\u0001\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0093\u00012\u0007\u0010\u0090\u0001\u001a\u00020\u001eH\u0002¢\u0006\u0006\b\u0095\u0001\u0010\u0096\u0001J\u0011\u0010\u0097\u0001\u001a\u00020\u0014H\u0002¢\u0006\u0005\b\u0097\u0001\u0010\u0016J\u0011\u0010\u0098\u0001\u001a\u00020\u0014H\u0002¢\u0006\u0005\b\u0098\u0001\u0010\u0016J \u0010\u0099\u0001\u001a\u00020\u00142\f\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00140!H\u0010¢\u0006\u0006\b\u0099\u0001\u0010\u009a\u0001J\u001c\u0010\u009c\u0001\u001a\u00020\u00142\b\u0010\u0090\u0001\u001a\u00030\u009b\u0001H\u0016¢\u0006\u0006\b\u009c\u0001\u0010\u009d\u0001JD\u0010¡\u0001\u001a\u00020\u0014\"\u0005\b\u0000\u0010\u009e\u0001\"\u0005\b\u0001\u0010\u009f\u00012\u0007\u0010\u0089\u0001\u001a\u00028\u00002\u0019\u0010J\u001a\u0015\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00140 \u0001H\u0016¢\u0006\u0006\b¡\u0001\u0010¢\u0001J\u0012\u0010£\u0001\u001a\u00020\u0004H\u0017¢\u0006\u0006\b£\u0001\u0010¤\u0001J\u001d\u0010¥\u0001\u001a\u00020%2\t\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0006\b¥\u0001\u0010¦\u0001J\u001d\u0010\u009f\u0001\u001a\u00020%2\t\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0006\b\u009f\u0001\u0010¦\u0001J\u001b\u0010§\u0001\u001a\u00020%2\u0007\u0010\u0089\u0001\u001a\u00020%H\u0016¢\u0006\u0006\b§\u0001\u0010¨\u0001J\u001c\u0010ª\u0001\u001a\u00020%2\b\u0010\u0089\u0001\u001a\u00030©\u0001H\u0016¢\u0006\u0006\bª\u0001\u0010«\u0001J\u001a\u0010¬\u0001\u001a\u00020%2\u0007\u0010\u0089\u0001\u001a\u00020SH\u0016¢\u0006\u0005\b¬\u0001\u0010VJ\u001a\u0010\u00ad\u0001\u001a\u00020%2\u0007\u0010\u0089\u0001\u001a\u000200H\u0016¢\u0006\u0005\b\u00ad\u0001\u0010gJ\u0011\u0010®\u0001\u001a\u00020\u0014H\u0016¢\u0006\u0005\b®\u0001\u0010\u0016J@\u0010±\u0001\u001a\u00020\u00142\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f0\u001d2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00140!2\n\u0010°\u0001\u001a\u0005\u0018\u00010¯\u0001H\u0011¢\u0006\u0006\b±\u0001\u0010²\u0001J(\u0010´\u0001\u001a\u00028\u0000\"\u0005\b\u0000\u0010\u009f\u00012\r\u0010l\u001a\t\u0012\u0004\u0012\u00028\u00000³\u0001H\u0017¢\u0006\u0006\b´\u0001\u0010µ\u0001J(\u0010·\u0001\u001a\u00020\u0014\"\u0005\b\u0000\u0010\u009f\u00012\r\u0010¶\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000!H\u0016¢\u0006\u0006\b·\u0001\u0010\u009a\u0001J\u0011\u0010¸\u0001\u001a\u00020\u0014H\u0010¢\u0006\u0005\b¸\u0001\u0010\u0016J\u001a\u0010º\u0001\u001a\u00020\u00142\u0007\u0010¹\u0001\u001a\u00020%H\u0016¢\u0006\u0005\bº\u0001\u0010(J\u0011\u0010»\u0001\u001a\u00020\u0014H\u0010¢\u0006\u0005\b»\u0001\u0010\u0016J\u0011\u0010¼\u0001\u001a\u00020\u0014H\u0016¢\u0006\u0005\b¼\u0001\u0010\u0016J\u0011\u0010½\u0001\u001a\u00020\u0014H\u0016¢\u0006\u0005\b½\u0001\u0010\u0016J\u0011\u0010¾\u0001\u001a\u00020\u0014H\u0017¢\u0006\u0005\b¾\u0001\u0010\u0016J\u0011\u0010¿\u0001\u001a\u00020\u0014H\u0017¢\u0006\u0005\b¿\u0001\u0010\u0016J\u0011\u0010À\u0001\u001a\u00020\u0014H\u0016¢\u0006\u0005\bÀ\u0001\u0010\u0016J\u0015\u0010Â\u0001\u001a\u0005\u0018\u00010Á\u0001H\u0016¢\u0006\u0006\bÂ\u0001\u0010Ã\u0001J\u0011\u0010Ä\u0001\u001a\u00020\u0014H\u0017¢\u0006\u0005\bÄ\u0001\u0010\u0016J\u0011\u0010Å\u0001\u001a\u00020\u0014H\u0016¢\u0006\u0005\bÅ\u0001\u0010\u0016J\u0011\u0010Æ\u0001\u001a\u00020\u0014H\u0010¢\u0006\u0005\bÆ\u0001\u0010\u0016J\u0011\u0010Ç\u0001\u001a\u00020\u0014H\u0016¢\u0006\u0005\bÇ\u0001\u0010\u0016J\u001f\u0010É\u0001\u001a\u00020\u00142\u000b\u0010È\u0001\u001a\u000600j\u0002`:H\u0016¢\u0006\u0006\bÉ\u0001\u0010Ê\u0001J)\u0010Ë\u0001\u001a\u00020\u00142\u000b\u0010\u0089\u0001\u001a\u0006\u0012\u0002\b\u00030M2\b\u0010O\u001a\u0004\u0018\u00010\u001fH\u0017¢\u0006\u0006\bË\u0001\u0010Ì\u0001J-\u0010Í\u0001\u001a\u00020\u00142\u001a\u0010A\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020@\u0012\u0006\u0012\u0004\u0018\u00010@0?0>H\u0017¢\u0006\u0005\bÍ\u0001\u0010CJ(\u0010Ð\u0001\u001a\u00020\u001f2\t\u0010Î\u0001\u001a\u0004\u0018\u00010\u001f2\t\u0010Ï\u0001\u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0006\bÐ\u0001\u0010Ñ\u0001J\u0018\u0010Ò\u0001\u001a\b\u0012\u0004\u0012\u00020z0>H\u0010¢\u0006\u0006\bÒ\u0001\u0010Ó\u0001J2\u0010Ô\u0001\u001a\u00020%2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f0\u001d2\n\u0010°\u0001\u001a\u0005\u0018\u00010¯\u0001H\u0011¢\u0006\u0006\bÔ\u0001\u0010Õ\u0001J!\u0010×\u0001\u001a\u00020\u00142\r\u0010Ö\u0001\u001a\b\u0012\u0004\u0012\u00020\u00140!H\u0017¢\u0006\u0006\b×\u0001\u0010\u009a\u0001J\u0012\u0010D\u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0005\bD\u0010Ø\u0001J$\u0010Û\u0001\u001a\u00020%2\u0007\u0010Ù\u0001\u001a\u00020%2\u0007\u0010Ú\u0001\u001a\u000200H\u0017¢\u0006\u0006\bÛ\u0001\u0010Ü\u0001J\u0011\u0010Ý\u0001\u001a\u00020\u0014H\u0017¢\u0006\u0005\bÝ\u0001\u0010\u0016J\u0011\u0010Þ\u0001\u001a\u00020\u0014H\u0017¢\u0006\u0005\bÞ\u0001\u0010\u0016J\u001d\u0010ß\u0001\u001a\u00020\u001a2\t\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u001fH\u0010¢\u0006\u0006\bß\u0001\u0010à\u0001J\u0011\u0010á\u0001\u001a\u00020\u0014H\u0016¢\u0006\u0005\bá\u0001\u0010\u0016J\u0011\u0010â\u0001\u001a\u00020\u0014H\u0016¢\u0006\u0005\bâ\u0001\u0010\u0016J \u0010ä\u0001\u001a\u00020\u00142\f\u0010\u0089\u0001\u001a\u0007\u0012\u0002\b\u00030ã\u0001H\u0017¢\u0006\u0006\bä\u0001\u0010å\u0001J)\u0010è\u0001\u001a\u00020\u00142\u0015\u0010ç\u0001\u001a\u0010\u0012\u000b\b\u0001\u0012\u0007\u0012\u0002\b\u00030ã\u00010æ\u0001H\u0017¢\u0006\u0006\bè\u0001\u0010é\u0001J\u001a\u0010ê\u0001\u001a\u00020\u00142\u0006\u0010l\u001a\u000200H\u0016¢\u0006\u0006\bê\u0001\u0010Ê\u0001J\u001a\u0010ë\u0001\u001a\u00020\u00142\u0006\u0010l\u001a\u000200H\u0016¢\u0006\u0006\bë\u0001\u0010Ê\u0001J\u001b\u0010í\u0001\u001a\u00030ì\u00012\u0006\u0010l\u001a\u000200H\u0016¢\u0006\u0006\bí\u0001\u0010î\u0001J#\u0010ï\u0001\u001a\u00020\u00142\u0006\u0010l\u001a\u0002002\b\u0010s\u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0005\bï\u0001\u0010uJ\u0011\u0010ð\u0001\u001a\u00020\u0014H\u0016¢\u0006\u0005\bð\u0001\u0010\u0016J\u0011\u0010ñ\u0001\u001a\u00020\u0014H\u0010¢\u0006\u0005\bñ\u0001\u0010\u0016J#\u0010\u009e\u0001\u001a\u00020\u00142\u0006\u0010l\u001a\u0002002\b\u0010s\u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0005\b\u009e\u0001\u0010uJ&\u0010ó\u0001\u001a\u00020%2\u0007\u0010\u0090\u0001\u001a\u00020\u001e2\t\u0010ò\u0001\u001a\u0004\u0018\u00010\u001fH\u0010¢\u0006\u0006\bó\u0001\u0010ô\u0001J&\u0010õ\u0001\u001a\u00020\u00142\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f0\u001dH\u0010¢\u0006\u0006\bõ\u0001\u0010ö\u0001J\u001d\u0010÷\u0001\u001a\u00020\u00142\t\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0006\b÷\u0001\u0010\u008b\u0001J\u0011\u0010ø\u0001\u001a\u00020\u0014H\u0016¢\u0006\u0005\bø\u0001\u0010\u0016J\u0014\u0010ù\u0001\u001a\u0004\u0018\u00010\u001fH\u0000¢\u0006\u0006\bù\u0001\u0010Ø\u0001J\u0014\u0010ú\u0001\u001a\u0004\u0018\u00010\u001fH\u0000¢\u0006\u0006\bú\u0001\u0010Ø\u0001J\u001d\u0010û\u0001\u001a\u00020\u00142\t\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u001fH\u0001¢\u0006\u0006\bû\u0001\u0010\u008b\u0001J\u0011\u0010ü\u0001\u001a\u00020\u0014H\u0010¢\u0006\u0005\bü\u0001\u0010\u0016J\u001d\u0010ý\u0001\u001a\u00020\u00142\t\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u001fH\u0000¢\u0006\u0006\bý\u0001\u0010\u008b\u0001R\"\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bº\u0001\u0010þ\u0001\u001a\u0006\bÿ\u0001\u0010\u0080\u0002R\u0016\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0081\u0002\u0010\u0082\u0002R\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÍ\u0001\u0010\u0083\u0002R\u0016\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¡\u0001\u0010\u0084\u0002R\u0018\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0085\u0002\u0010\u0086\u0002R\u0018\u0010\r\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÛ\u0001\u0010\u0086\u0002R\u0016\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÉ\u0001\u0010\u0087\u0002R\u001e\u0010\u0011\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bè\u0001\u0010\u0088\u0002\u001a\u0006\b\u0089\u0002\u0010\u008a\u0002R\"\u0010I\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f0\u001d8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008b\u0002\u0010\u008c\u0002R \u0010\u008f\u0002\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010+0\u008d\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bø\u0001\u0010\u008e\u0002R\u001b\u0010\u0091\u0002\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¾\u0001\u0010\u0090\u0002R\u0019\u0010\u0092\u0002\u001a\u0002008\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b½\u0001\u0010Ð\u0001R\u0019\u0010\u0093\u0002\u001a\u0002008\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b×\u0001\u0010Ð\u0001R\u0019\u0010\u0094\u0002\u001a\u0002008\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bð\u0001\u0010Ð\u0001R\u0018\u0010\u0097\u0002\u001a\u00030\u0095\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bï\u0001\u0010\u0096\u0002R\u001c\u0010\u009a\u0002\u001a\u0005\u0018\u00010\u0098\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÞ\u0001\u0010\u0099\u0002R\u001c\u0010\u009b\u0002\u001a\u0005\u0018\u00010\u0098\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bä\u0001\u0010\u0099\u0002R\u0019\u0010\u009c\u0002\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bË\u0001\u0010Ç\u0001R\u0019\u0010\u009e\u0002\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009d\u0002\u0010Ç\u0001R\u0019\u0010\u009f\u0002\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÄ\u0001\u0010Ç\u0001R\u0018\u0010 \u0002\u001a\u00030\u0095\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b´\u0001\u0010\u0096\u0002R\u0019\u0010¢\u0002\u001a\u0002078\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b£\u0001\u0010¡\u0002R\"\u0010¥\u0002\u001a\u000b\u0012\u0004\u0012\u000207\u0018\u00010£\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¥\u0001\u0010¤\u0002R\u0019\u0010¦\u0002\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bë\u0001\u0010Ç\u0001R\u0018\u0010§\u0002\u001a\u00030\u0095\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009c\u0001\u0010\u0096\u0002R\u0019\u0010¨\u0002\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b§\u0001\u0010Ç\u0001R\u0019\u0010©\u0002\u001a\u0002008\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bª\u0001\u0010Ð\u0001R\u001b\u0010ª\u0002\u001a\u0004\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u00ad\u0001\u0010¡\u0002R*\u0010±\u0002\u001a\u00030«\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b¬\u0001\u0010¬\u0002\u001a\u0006\b\u00ad\u0002\u0010®\u0002\"\u0006\b¯\u0002\u0010°\u0002R\u001a\u0010µ\u0002\u001a\u00030²\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b³\u0002\u0010´\u0002R\u0019\u0010¶\u0002\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bí\u0001\u0010Ç\u0001R\u0018\u0010¹\u0002\u001a\u00030·\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÿ\u0001\u0010¸\u0002R\u001c\u0010¼\u0002\u001a\u0005\u0018\u00010º\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÂ\u0001\u0010»\u0002R\u0019\u0010½\u0002\u001a\u0002008\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÐ\u0001\u0010Ð\u0001R\u001a\u0010À\u0002\u001a\u00030¾\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bâ\u0001\u0010¿\u0002R\u0019\u0010Â\u0002\u001a\u0002008\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÁ\u0002\u0010Ð\u0001R\u0019\u0010Ã\u0002\u001a\u0002008\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b÷\u0001\u0010Ð\u0001R(\u0010Ç\u0002\u001a\u00020%8\u0010@\u0010X\u0090\u000e¢\u0006\u0017\n\u0006\b¼\u0001\u0010Ç\u0001\u001a\u0006\bÄ\u0002\u0010Å\u0002\"\u0005\bÆ\u0002\u0010(R\u0018\u0010Ê\u0002\u001a\u00030È\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b®\u0001\u0010É\u0002R\u001e\u0010Ì\u0002\u001a\t\u0012\u0004\u0012\u00020\u001e0\u008d\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bË\u0002\u0010\u008e\u0002R*\u0010Î\u0002\u001a\u00020%2\u0007\u0010\u0089\u0001\u001a\u00020%8\u0010@RX\u0090\u000e¢\u0006\u0010\n\u0006\bÅ\u0001\u0010Ç\u0001\u001a\u0006\bÍ\u0002\u0010Å\u0002R*\u0010Ð\u0002\u001a\u00020%2\u0007\u0010\u0089\u0001\u001a\u00020%8\u0000@BX\u0080\u000e¢\u0006\u0010\n\u0006\bê\u0001\u0010Ç\u0001\u001a\u0006\bÏ\u0002\u0010Å\u0002R:\u0010Ô\u0002\u001a\u00070Sj\u0003`Ñ\u00022\f\u0010\u0089\u0001\u001a\u00070Sj\u0003`Ñ\u00028\u0016@RX\u0097\u000e¢\u0006\u0016\n\u0005\bD\u0010â\u0001\u0012\u0005\bÓ\u0002\u0010\u0016\u001a\u0006\b\u0085\u0002\u0010Ò\u0002R+\u0010Ú\u0002\u001a\u0004\u0018\u00010\u000b8\u0010@\u0010X\u0090\u000e¢\u0006\u0018\n\u0006\bÕ\u0002\u0010\u0086\u0002\u001a\u0006\bÖ\u0002\u0010×\u0002\"\u0006\bØ\u0002\u0010Ù\u0002R\u001c\u0010Ü\u0002\u001a\u0005\u0018\u00010¯\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009f\u0001\u0010Û\u0002R\"\u0010á\u0002\u001a\u0005\u0018\u00010Ý\u00028PX\u0090\u0004¢\u0006\u0010\n\u0006\bá\u0001\u0010Þ\u0002\u001a\u0006\bß\u0002\u0010à\u0002R)\u00102\u001a\u00020%2\u0007\u0010\u0089\u0001\u001a\u00020%8\u0016@RX\u0096\u000e¢\u0006\u0010\n\u0006\b\u009e\u0001\u0010Ç\u0001\u001a\u0006\b³\u0002\u0010Å\u0002R'\u0010æ\u0002\u001a\u00030â\u00028\u0016X\u0097\u0004¢\u0006\u0017\n\u0006\b·\u0001\u0010ã\u0002\u0012\u0005\bå\u0002\u0010\u0016\u001a\u0006\bÁ\u0002\u0010ä\u0002R\u0017\u0010é\u0002\u001a\u00020\t8@X\u0080\u0004¢\u0006\b\u001a\u0006\bç\u0002\u0010è\u0002R\u0017\u0010ë\u0002\u001a\u00020%8PX\u0090\u0004¢\u0006\b\u001a\u0006\bê\u0002\u0010Å\u0002R\u0019\u0010î\u0002\u001a\u0004\u0018\u00010\u001e8PX\u0090\u0004¢\u0006\b\u001a\u0006\bì\u0002\u0010í\u0002R\u0017\u0010ï\u0002\u001a\u00020%8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u009d\u0002\u0010Å\u0002R\u001a\u0010ñ\u0002\u001a\u0005\u0018\u00010\u009b\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bË\u0002\u0010ð\u0002R\u0017\u0010ò\u0002\u001a\u00020%8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0081\u0002\u0010Å\u0002R\u0018\u0010ô\u0002\u001a\u00030º\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\bÕ\u0002\u0010ó\u0002R\u0018\u0010÷\u0002\u001a\u00030õ\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u008b\u0002\u0010ö\u0002R\u001b\u0010ú\u0002\u001a\u000600j\u0002`:8VX\u0096\u0004¢\u0006\b\u001a\u0006\bø\u0002\u0010ù\u0002¨\u0006û\u0002"}, d2 = {"Landroidx/compose/runtime/s;", "Landroidx/compose/runtime/o;", "Lcom/google/android/ez;", "applier", "Landroidx/compose/runtime/f;", "parentContext", "", "Lcom/google/android/yea;", "abandonSet", "Lcom/google/android/eub;", "slotTable", "Lcom/google/android/g81;", "changes", "lateChanges", "Lcom/google/android/js1;", "observerHolder", "Landroidx/compose/runtime/g;", "composition", "<init>", "(Lcom/google/android/ez;Landroidx/compose/runtime/f;Ljava/util/Set;Lcom/google/android/eub;Lcom/google/android/g81;Lcom/google/android/g81;Lcom/google/android/js1;Landroidx/compose/runtime/g;)V", "", "z0", "()V", "D0", "E0", "F0", "Lcom/google/android/fq1;", "I0", "()Lcom/google/android/fq1;", "Lcom/google/android/r6b;", "Landroidx/compose/runtime/b0;", "", "invalidationsRequested", "Lkotlin/Function0;", "content", "J0", "(Lcom/google/android/k58;Lkotlin/jvm/functions/Function2;)V", "", "isNode", "L0", "(Z)V", "M0", "N0", "Landroidx/compose/runtime/u;", "newPending", "P0", "(ZLandroidx/compose/runtime/u;)V", "R0", "", "expectedNodeCount", "inserting", "S0", "(IZ)V", "O0", "U0", "Lcom/google/android/a69;", "G0", "()Lcom/google/android/a69;", "Landroidx/compose/runtime/composer/linkbuffer/GroupAddress;", "group", "H0", "(I)Lcom/google/android/a69;", "", "Lkotlin/Pair;", "Lcom/google/android/r08;", "references", "Y0", "(Ljava/util/List;)V", "R", "Lcom/google/android/x22;", "from", "to", "address", "invalidations", "block", "i1", "(Lcom/google/android/x22;Lcom/google/android/x22;ILjava/util/List;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "Lcom/google/android/n08;", "locals", "parameter", "force", "b1", "(Lcom/google/android/n08;Lcom/google/android/a69;Ljava/lang/Object;Z)V", "", "Landroidx/compose/runtime/composer/linkbuffer/GroupHandle;", "e1", "(J)Z", "k1", "l1", "source", "m1", "(J)V", "providers", "n1", "(Lcom/google/android/a69;)V", "o1", "groupBeingRemoved", "p1", "dispose", "v1", "t1", "(I)Landroidx/compose/runtime/b0;", "u1", "(I)Z", "h1", "(I)I", "z1", "A1", "key", "objectKey", "Lcom/google/android/z15;", "kind", "data", "D1", "(ILjava/lang/Object;ILjava/lang/Object;)V", "dataKey", "E1", "(ILjava/lang/Object;)V", "F1", "(ZLjava/lang/Object;)V", "G1", "dataOffset", "Lcom/google/android/iq1;", "B1", "(ILjava/lang/Integer;)Ljava/util/List;", "Landroidx/compose/runtime/VirtualGroupHandle;", "virtualGroup", "count", "J1", "(JI)V", "virtualHandle", "newCount", "K1", "parentScope", "currentProviders", "L1", "(Lcom/google/android/a69;Lcom/google/android/a69;)Lcom/google/android/a69;", "value", "M1", "(Ljava/lang/Object;)V", "O1", "(J)I", "H1", "(Ljava/lang/Object;)Ljava/lang/Object;", "scope", "Q0", "(Landroidx/compose/runtime/b0;)V", "Lkotlin/Function1;", "Lcom/google/android/pr1;", "T0", "(Landroidx/compose/runtime/b0;)Lkotlin/jvm/functions/Function1;", "P1", "Q1", "n0", "(Lkotlin/jvm/functions/Function0;)V", "Lcom/google/android/qaa;", "z", "(Lcom/google/android/qaa;)V", "V", "T", "Lkotlin/Function2;", "e", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "w", "()Landroidx/compose/runtime/f;", "x", "(Ljava/lang/Object;)Z", "A", "(Z)Z", "", "B", "(F)Z", "D", "C", "N", "Lcom/google/android/fob;", "shouldPause", "c0", "(Lcom/google/android/k58;Lkotlin/jvm/functions/Function2;Lcom/google/android/fob;)V", "Lcom/google/android/zr1;", "v", "(Lcom/google/android/zr1;)Ljava/lang/Object;", "factory", "W", "d0", "changed", "b", "e0", "M", "m", "l", "X", "a0", "Lcom/google/android/s6b;", "H", "()Lcom/google/android/s6b;", "u", "P", "f0", "Z", "marker", "h", "(I)V", "s", "(Lcom/google/android/n08;Ljava/lang/Object;)V", "d", "left", "right", "I", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "m0", "()Ljava/util/List;", "o0", "(Lcom/google/android/k58;Lcom/google/android/fob;)Z", "effect", "n", "()Ljava/lang/Object;", "parametersChanged", "flags", "g", "(ZI)Z", "y1", "q", "p0", "(Ljava/lang/Object;)Lcom/google/android/fq1;", "U", "J", "Lcom/google/android/os9;", "r", "(Lcom/google/android/os9;)V", "", "values", "i", "([Lcom/google/android/os9;)V", "Q", "y", "Landroidx/compose/runtime/d;", "F", "(I)Landroidx/compose/runtime/d;", "p", "o", "q0", "instance", "r0", "(Landroidx/compose/runtime/b0;Ljava/lang/Object;)Z", "s0", "(Lcom/google/android/k58;)V", "L", "k", "f1", "g1", "N1", "b0", "I1", "Lcom/google/android/ez;", "G", "()Lcom/google/android/ez;", "c", "Landroidx/compose/runtime/f;", "Ljava/util/Set;", "Lcom/google/android/eub;", "f", "Lcom/google/android/g81;", "Lcom/google/android/js1;", "Landroidx/compose/runtime/g;", "V0", "()Landroidx/compose/runtime/g;", "j", "Lcom/google/android/k58;", "Lcom/google/android/w3c;", "Ljava/util/ArrayList;", "pendingStack", "Landroidx/compose/runtime/u;", "pending", "nodeIndex", "groupNodeCount", "rGroupIndex", "Lcom/google/android/t16;", "Lcom/google/android/t16;", "parentStateStack", "Lcom/google/android/m48;", "Lcom/google/android/m48;", "nodeCountOverrides", "nodeCountVirtualOverrides", "forceRecomposeScopes", "t", "forciblyRecompose", "nodeExpected", "entersStack", "Lcom/google/android/a69;", "rootProvider", "Lcom/google/android/o48;", "Lcom/google/android/o48;", "providerUpdates", "providersInvalid", "providersInvalidStack", "reusing", "reusingGroup", "providerCache", "Lcom/google/android/uub;", "Lcom/google/android/uub;", "W0", "()Lcom/google/android/uub;", "setReader$runtime", "(Lcom/google/android/uub;)V", "reader", "Lcom/google/android/iub;", "E", "Lcom/google/android/iub;", "builder", "builderHasAProvider", "Lcom/google/android/qq1;", "Lcom/google/android/qq1;", "changeListWriter", "Lcom/google/android/rr1;", "Lcom/google/android/rr1;", "_compositionData", "lastPlacedChildGroup", "Lcom/google/android/oe4;", "Lcom/google/android/oe4;", "insertFixups", "K", "childrenComposing", "compositionToken", "k0", "()Z", "x1", "sourceMarkersEnabled", "androidx/compose/runtime/s$c", "Landroidx/compose/runtime/s$c;", "derivedStateObserver", "O", "invalidateStack", "l0", "isComposing", "isDisposed$runtime", "isDisposed", "Landroidx/compose/runtime/CompositeKeyHashCode;", "()J", "getCompositeKeyHashCode$annotations", "compositeKeyHashCode", "S", "i0", "()Lcom/google/android/g81;", "w1", "(Lcom/google/android/g81;)V", "deferredChanges", "Lcom/google/android/fob;", "shouldPauseCallback", "Lcom/google/android/ur1;", "Lcom/google/android/ur1;", "j0", "()Lcom/google/android/ur1;", "errorContext", "Lkotlin/coroutines/CoroutineContext;", "Lkotlin/coroutines/CoroutineContext;", "()Lkotlin/coroutines/CoroutineContext;", "getApplyCoroutineContext$annotations", "applyCoroutineContext", "X0", "()Lcom/google/android/eub;", "readerTable", "g0", "areChildrenComposing", "h0", "()Landroidx/compose/runtime/b0;", "currentRecomposeScope", "defaultsInvalid", "()Lcom/google/android/qaa;", "recomposeScope", "skipping", "()Lcom/google/android/rr1;", "compositionData", "Lcom/google/android/gs1;", "()Lcom/google/android/gs1;", "currentCompositionLocalMap", "a", "()I", "currentMarker", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class s extends o {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private boolean reusing;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private a69 providerCache;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private uub reader;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private iub builder;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private boolean builderHasAProvider;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final qq1 changeListWriter;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private rr1 _compositionData;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private int lastPlacedChildGroup;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private oe4 insertFixups;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private int childrenComposing;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private int compositionToken;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    private boolean sourceMarkersEnabled;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    private final c derivedStateObserver;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    private final ArrayList<b0> invalidateStack;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    private boolean isComposing;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    private boolean isDisposed;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    private long compositeKeyHashCode;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    private g81 deferredChanges;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    private fob shouldPauseCallback;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    private final ur1 errorContext;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    private boolean inserting;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    private final CoroutineContext applyCoroutineContext;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final ez<?> applier;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final f parentContext;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Set<yea> abandonSet;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final eub slotTable;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private g81 changes;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private g81 lateChanges;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final js1 observerHolder;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final g composition;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private u pending;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private int nodeIndex;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private int groupNodeCount;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private int rGroupIndex;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private m48 nodeCountOverrides;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private m48 nodeCountVirtualOverrides;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private boolean forceRecomposeScopes;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private boolean forciblyRecompose;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private boolean nodeExpected;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private o48<a69> providerUpdates;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private boolean providersInvalid;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final k58<Object, Object> invalidations = r6b.e(null, 1, null);

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final ArrayList<u> pendingStack = w3c.c(null, 1, null);

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private final t16 parentStateStack = new t16();

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private final t16 entersStack = new t16();

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private a69 rootProvider = b69.a();

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final t16 providersInvalidStack = new t16();

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private int reusingGroup = -1;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002R\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tR\u001b\u0010\u0004\u001a\u00060\u0002R\u00020\u00038\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/compose/runtime/s$a;", "Lcom/google/android/yea;", "Landroidx/compose/runtime/s$b;", "Landroidx/compose/runtime/s;", "ref", "<init>", "(Landroidx/compose/runtime/s$b;)V", "", "d", "()V", "e", "f", "a", "Landroidx/compose/runtime/s$b;", "()Landroidx/compose/runtime/s$b;", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
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

    @Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0004\u0018\u00002\u00020\u0001B-\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0010¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0014H\u0010¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u0018H\u0010¢\u0006\u0004\b\u001a\u0010\u001bJ%\u0010\u001e\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00142\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\f0\u001cH\u0011¢\u0006\u0004\b\u001e\u0010\u001fJ3\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00180\"2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010!\u001a\u00020 2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\f0\u001cH\u0011¢\u0006\u0004\b#\u0010$J3\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00180\"2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010!\u001a\u00020 2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00180\"H\u0010¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0014H\u0010¢\u0006\u0004\b(\u0010\u0017J\u000f\u0010*\u001a\u00020)H\u0010¢\u0006\u0004\b*\u0010+J\u0015\u0010,\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020)¢\u0006\u0004\b,\u0010-J\u001d\u00101\u001a\u00020\f2\f\u00100\u001a\b\u0012\u0004\u0012\u00020/0.H\u0010¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\fH\u0010¢\u0006\u0004\b3\u0010\u000eJ\u000f\u00104\u001a\u00020\fH\u0010¢\u0006\u0004\b4\u0010\u000eJ\u0017\u00107\u001a\u00020\f2\u0006\u00106\u001a\u000205H\u0010¢\u0006\u0004\b7\u00108J\u0017\u00109\u001a\u00020\f2\u0006\u00106\u001a\u000205H\u0010¢\u0006\u0004\b9\u00108J\u0019\u0010;\u001a\u0004\u0018\u00010:2\u0006\u00106\u001a\u000205H\u0010¢\u0006\u0004\b;\u0010<J+\u0010@\u001a\u00020\f2\u0006\u00106\u001a\u0002052\u0006\u0010=\u001a\u00020:2\n\u0010?\u001a\u0006\u0012\u0002\b\u00030>H\u0010¢\u0006\u0004\b@\u0010AJ\u0017\u0010B\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0014H\u0010¢\u0006\u0004\bB\u0010\u0017J\u001d\u0010E\u001a\u00020D2\f\u0010C\u001a\b\u0012\u0004\u0012\u00020\f0\u001cH\u0016¢\u0006\u0004\bE\u0010FR\u001e\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u001e\u0010G\u001a\u0004\bH\u0010IR\u001a\u0010\u0006\u001a\u00020\u00058\u0010X\u0090\u0004¢\u0006\f\n\u0004\b#\u0010J\u001a\u0004\bK\u0010LR\u001a\u0010\u0007\u001a\u00020\u00058\u0010X\u0090\u0004¢\u0006\f\n\u0004\b9\u0010J\u001a\u0004\bM\u0010LR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b4\u0010N\u001a\u0004\bO\u0010PR0\u0010V\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020/0.\u0018\u00010.8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u00102R\u001d\u0010Y\u001a\b\u0012\u0004\u0012\u00020W0.8\u0006¢\u0006\f\n\u0004\bK\u0010R\u001a\u0004\bX\u0010TR+\u0010^\u001a\u00020)2\u0006\u0010Z\u001a\u00020)8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bM\u0010[\u001a\u0004\b\\\u0010+\"\u0004\b]\u0010-R\u0014\u0010_\u001a\u00020\u00058PX\u0090\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010LR\u0014\u0010a\u001a\u00020\u00058PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b`\u0010LR\u0014\u0010e\u001a\u00020b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bc\u0010dR\u0014\u0010\u0015\u001a\u00020f8PX\u0090\u0004¢\u0006\u0006\u001a\u0004\bg\u0010h¨\u0006i"}, d2 = {"Landroidx/compose/runtime/s$b;", "Landroidx/compose/runtime/f;", "", "Landroidx/compose/runtime/CompositeKeyHashCode;", "compositeKeyHashCode", "", "collectingParameterInformation", "collectingSourceInformation", "Lcom/google/android/js1;", "observerHolder", "<init>", "(Landroidx/compose/runtime/s;JZZLcom/google/android/js1;)V", "", "A", "()V", "Landroidx/compose/runtime/d;", "composer", "t", "(Landroidx/compose/runtime/d;)V", "y", "Lcom/google/android/x22;", "composition", "z", "(Lcom/google/android/x22;)V", "Landroidx/compose/runtime/b0;", "scope", "u", "(Landroidx/compose/runtime/b0;)V", "Lkotlin/Function0;", "content", "a", "(Lcom/google/android/x22;Lkotlin/jvm/functions/Function2;)V", "Lcom/google/android/fob;", "shouldPause", "Landroidx/collection/ScatterSet;", "b", "(Lcom/google/android/x22;Lcom/google/android/fob;Lkotlin/jvm/functions/Function2;)Landroidx/collection/ScatterSet;", "invalidScopes", "r", "(Lcom/google/android/x22;Lcom/google/android/fob;Landroidx/collection/ScatterSet;)Landroidx/collection/ScatterSet;", "o", "Lcom/google/android/a69;", "j", "()Lcom/google/android/a69;", "E", "(Lcom/google/android/a69;)V", "", "Lcom/google/android/rr1;", "table", "s", "(Ljava/util/Set;)V", "x", "d", "Lcom/google/android/r08;", "reference", "n", "(Lcom/google/android/r08;)V", "c", "Lcom/google/android/q08;", "q", "(Lcom/google/android/r08;)Lcom/google/android/q08;", "data", "Lcom/google/android/ez;", "applier", "p", "(Lcom/google/android/r08;Lcom/google/android/q08;Lcom/google/android/ez;)V", "v", "action", "Lcom/google/android/o41;", "w", "(Lkotlin/jvm/functions/Function0;)Lcom/google/android/o41;", "J", "h", "()J", "Z", "f", "()Z", "g", "Lcom/google/android/js1;", "l", "()Lcom/google/android/js1;", "e", "Ljava/util/Set;", "getInspectionTables", "()Ljava/util/Set;", "setInspectionTables", "inspectionTables", "Landroidx/compose/runtime/s;", "B", "composers", "<set-?>", "Lcom/google/android/o58;", "C", "D", "compositionLocalScope", "collectingCallByInformation", "m", "stackTraceEnabled", "Lkotlin/coroutines/CoroutineContext;", "k", "()Lkotlin/coroutines/CoroutineContext;", "effectCoroutineContext", "Lcom/google/android/pr1;", "i", "()Lcom/google/android/pr1;", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
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
        private final Set<s> composers = new LinkedHashSet();

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

        public final void A() {
            if (this.composers.isEmpty()) {
                return;
            }
            Set<Set<rr1>> set = this.inspectionTables;
            if (set != null) {
                for (s sVar : this.composers) {
                    Iterator<Set<rr1>> it = set.iterator();
                    while (it.hasNext()) {
                        it.next().remove(sVar.S());
                    }
                }
            }
            this.composers.clear();
        }

        public final Set<s> B() {
            return this.composers;
        }

        public final void E(a69 scope) {
            D(scope);
        }

        @Override // androidx.compose.p004runtime.f
        public void a(x22 composition, Function2<? super d, ? super Integer, Unit> content) {
            s.this.parentContext.a(composition, content);
        }

        @Override // androidx.compose.p004runtime.f
        public ScatterSet<b0> b(x22 composition, fob shouldPause, Function2<? super d, ? super Integer, Unit> content) {
            return s.this.parentContext.b(composition, shouldPause, content);
        }

        @Override // androidx.compose.p004runtime.f
        public void c(r08 reference) {
            s.this.parentContext.c(reference);
        }

        @Override // androidx.compose.p004runtime.f
        public void d() {
            s.this.childrenComposing--;
        }

        @Override // androidx.compose.p004runtime.f
        public boolean e() {
            return s.this.parentContext.e();
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
            return s.this.getComposition();
        }

        @Override // androidx.compose.p004runtime.f
        public a69 j() {
            return C();
        }

        @Override // androidx.compose.p004runtime.f
        /* JADX INFO: renamed from: k */
        public CoroutineContext getEffectCoroutineContext() {
            return s.this.parentContext.getEffectCoroutineContext();
        }

        @Override // androidx.compose.p004runtime.f
        /* JADX INFO: renamed from: l, reason: from getter */
        public js1 getObserverHolder() {
            return this.observerHolder;
        }

        @Override // androidx.compose.p004runtime.f
        public boolean m() {
            return s.this.parentContext.m();
        }

        @Override // androidx.compose.p004runtime.f
        public void n(r08 reference) {
            s.this.parentContext.n(reference);
        }

        @Override // androidx.compose.p004runtime.f
        public void o(x22 composition) {
            s.this.parentContext.o(s.this.getComposition());
            s.this.parentContext.o(composition);
        }

        @Override // androidx.compose.p004runtime.f
        public void p(r08 reference, q08 data, ez<?> applier) {
            s.this.parentContext.p(reference, data, applier);
        }

        @Override // androidx.compose.p004runtime.f
        public q08 q(r08 reference) {
            return s.this.parentContext.q(reference);
        }

        @Override // androidx.compose.p004runtime.f
        public ScatterSet<b0> r(x22 composition, fob shouldPause, ScatterSet<b0> invalidScopes) {
            return s.this.parentContext.r(composition, shouldPause, invalidScopes);
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
            super.t(composer);
            this.composers.add(t.k(composer));
        }

        @Override // androidx.compose.p004runtime.f
        public void u(b0 scope) {
            s.this.parentContext.u(scope);
        }

        @Override // androidx.compose.p004runtime.f
        public void v(x22 composition) {
            s.this.parentContext.v(composition);
        }

        @Override // androidx.compose.p004runtime.f
        public o41 w(Function0<Unit> action) {
            return s.this.parentContext.w(action);
        }

        @Override // androidx.compose.p004runtime.f
        public void x() {
            s.this.childrenComposing++;
        }

        @Override // androidx.compose.p004runtime.f
        public void y(d composer) {
            Set<Set<rr1>> set = this.inspectionTables;
            if (set != null) {
                Iterator<T> it = set.iterator();
                while (it.hasNext()) {
                    ((Set) it.next()).remove(t.k(composer).S());
                }
            }
            kotlin.jvm.internal.a.a(this.composers).remove(composer);
        }

        @Override // androidx.compose.p004runtime.f
        public void z(x22 composition) {
            s.this.parentContext.z(composition);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u00020\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\u0007\u001a\u00020\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"androidx/compose/runtime/s$c", "Lcom/google/android/x43;", "Landroidx/compose/runtime/j;", "derivedState", "", "b", "(Landroidx/compose/runtime/j;)V", "a", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c implements x43 {
        c() {
        }

        @Override // com.google.inputmethod.x43
        public void a(j<?> derivedState) {
            s.this.childrenComposing--;
        }

        @Override // com.google.inputmethod.x43
        public void b(j<?> derivedState) {
            s.this.childrenComposing++;
        }
    }

    public s(ez<?> ezVar, f fVar, Set<yea> set, eub eubVar, g81 g81Var, g81 g81Var2, js1 js1Var, g gVar) {
        this.applier = ezVar;
        this.parentContext = fVar;
        this.abandonSet = set;
        this.slotTable = eubVar;
        this.changes = g81Var;
        this.lateChanges = g81Var2;
        this.observerHolder = js1Var;
        this.composition = gVar;
        uub uubVarP = eubVar.P();
        uubVarP.d();
        this.reader = uubVarP;
        iub iubVar = new iub(eubVar.getAddressSpace(), false, false);
        iubVar.g();
        this.builder = iubVar;
        this.changeListWriter = new qq1(this, d81.a(this.changes));
        this.lastPlacedChildGroup = -1;
        this.insertFixups = new oe4();
        this.sourceMarkersEnabled = fVar.getCollectingSourceInformation() || fVar.e();
        this.derivedStateObserver = new c();
        this.invalidateStack = w3c.c(null, 1, null);
        this.errorContext = new ur1(this);
        CoroutineContext effectCoroutineContext = fVar.getEffectCoroutineContext();
        EmptyCoroutineContext emptyCoroutineContextJ0 = j0();
        this.applyCoroutineContext = effectCoroutineContext.plus(emptyCoroutineContextJ0 == null ? EmptyCoroutineContext.a : emptyCoroutineContextJ0);
    }

    private final void A1() {
        this.groupNodeCount = this.reader.z();
        this.reader.f0();
    }

    private final List<ComposeStackTraceFrame> B1(int group, Integer dataOffset) {
        if (!getSourceMarkersEnabled()) {
            return m.p();
        }
        uub uubVarP = this.slotTable.P();
        try {
            return vub.b(uubVarP, group, dataOffset);
        } finally {
            uubVarP.d();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean C1(Object obj, Object obj2) {
        if (obj2 == obj) {
            return true;
        }
        zea zeaVar = obj2 instanceof zea ? (zea) obj2 : null;
        return (zeaVar != null ? zeaVar.getWrapped() : null) == obj;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:26:0x007a  */
    private final void D0() throws NoWhenBranchMatchedException, KotlinNothingValueException {
        b0 b0Var;
        boolean z;
        if (getInserting()) {
            b0 b0Var2 = new b0(getComposition());
            w3c.j(this.invalidateStack, b0Var2);
            N1(b0Var2);
            Q0(b0Var2);
            return;
        }
        int parent = this.reader.getParent();
        b0 b0VarS = t.s(this.reader, parent);
        Object objL = b0VarS != null ? r6b.l(this.invalidations, b0VarS) : null;
        boolean zV = this.reader.V(parent);
        if (zV) {
            this.reader.W(67108864);
        }
        Object objQ = this.reader.Q();
        if (Intrinsics.e(objQ, d.INSTANCE.a())) {
            b0Var = new b0(getComposition());
            N1(b0Var);
        } else {
            Intrinsics.h(objQ, "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl");
            b0Var = (b0) objQ;
        }
        if (zV || objL != null) {
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
        Q0(b0Var);
        if (b0Var.m()) {
            b0Var.H(false);
            b0Var.L(true);
            this.changeListWriter.V(b0Var);
            if (this.reusing || !b0Var.r()) {
                return;
            }
            this.reusing = true;
            this.reusingGroup = this.reader.getParent();
            b0Var.K(true);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:102:0x0205  */
    /* JADX WARN: Code duplicated, block: B:103:0x0207  */
    /* JADX WARN: Code duplicated, block: B:107:0x0239  */
    /* JADX WARN: Code duplicated, block: B:108:0x023b  */
    /* JADX WARN: Code duplicated, block: B:19:0x0078  */
    /* JADX WARN: Code duplicated, block: B:22:0x0085  */
    /* JADX WARN: Code duplicated, block: B:23:0x0087  */
    /* JADX WARN: Code duplicated, block: B:26:0x0097  */
    /* JADX WARN: Code duplicated, block: B:28:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:30:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:31:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x00bb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:36:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:42:0x00d8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x00da  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:47:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:52:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:55:0x011e  */
    /* JADX WARN: Code duplicated, block: B:61:0x012c  */
    /* JADX WARN: Code duplicated, block: B:64:0x0131  */
    /* JADX WARN: Code duplicated, block: B:70:0x014b  */
    /* JADX WARN: Code duplicated, block: B:73:0x015e  */
    /* JADX WARN: Code duplicated, block: B:80:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:82:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:84:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:85:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:88:0x01d3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:89:0x01d5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:90:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:91:0x01df  */
    /* JADX WARN: Code duplicated, block: B:94:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:95:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:97:0x01f2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:98:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:99:0x01fc  */
    private final void D1(int key, Object objectKey, int kind, Object data) throws NoWhenBranchMatchedException, KotlinNothingValueException {
        long jRotateLeft;
        long j;
        z15.Companion companion;
        boolean z;
        u uVar;
        boolean z2;
        u uVar2;
        iub iubVar;
        Object objA;
        int i;
        Object objA2;
        int i2;
        int i3;
        d.Companion companion2;
        Object objA3;
        int i4;
        iub iubVar2;
        Object objA4;
        int i5;
        Object objA5;
        int i6;
        u uVar3;
        d.Companion companion3;
        Object objA6;
        int i7;
        Q1();
        int i8 = this.rGroupIndex;
        if (objectKey == null) {
            if (data == null || key != 207 || Intrinsics.e(data, d.INSTANCE.a())) {
                jRotateLeft = Long.rotateLeft(Long.rotateLeft(getCompositeKeyHashCode(), 3) ^ ((long) key), 3);
                j = i8;
            } else {
                this.compositeKeyHashCode = Long.rotateLeft(Long.rotateLeft(getCompositeKeyHashCode(), 3) ^ ((long) data.hashCode()), 3) ^ ((long) i8);
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
            uVar = null;
            if (getInserting()) {
                this.reader.c();
                iubVar2 = this.builder;
                if (z) {
                    companion3 = d.INSTANCE;
                    objA6 = companion3.a();
                    Object objA7 = companion3.a();
                    if (objA6 == companion3.a()) {
                        i7 = 8388608;
                    } else {
                        i7 = 25165824;
                    }
                    iubVar2.C(key, i7, objA6, null, objA7);
                } else if (data != null) {
                    if (objectKey == null) {
                        objA5 = d.INSTANCE.a();
                    } else {
                        objA5 = objectKey;
                    }
                    if (objA5 == d.INSTANCE.a()) {
                        i6 = 33554432;
                    } else {
                        i6 = 50331648;
                    }
                    iubVar2.C(key, i6, objA5, data, null);
                } else {
                    if (objectKey == null) {
                        objA4 = d.INSTANCE.a();
                    } else {
                        objA4 = objectKey;
                    }
                    if (objA4 == d.INSTANCE.a()) {
                        i5 = 0;
                    } else {
                        i5 = 16777216;
                    }
                    iubVar2.C(key, i5, objA4, null, null);
                }
                uVar3 = this.pending;
                if (uVar3 != null) {
                    ti6 ti6Var = new ti6(key, -1, t.v(iubVar2.l()), -1, 0);
                    uVar3.k(ti6Var, this.nodeIndex - uVar3.getStartIndex());
                    uVar3.j(ti6Var);
                }
                P0(z, null);
                return;
            }
            if (kind != companion.b() && this.reusing) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (this.pending == null) {
                int iO = this.reader.o();
                if (z2 && iO == key && Intrinsics.e(objectKey, this.reader.p())) {
                    F1(z, data);
                } else {
                    this.pending = new u(this.reader.g(), this.nodeIndex);
                }
            }
            uVar2 = this.pending;
            if (uVar2 != null) {
                ti6 ti6VarD = uVar2.d(key, objectKey);
                if (!z2 || ti6VarD == null) {
                    this.reader.c();
                    this.inserting = true;
                    this.providerCache = null;
                    O0();
                    iubVar = this.builder;
                    if (z) {
                        companion2 = d.INSTANCE;
                        objA3 = companion2.a();
                        Object objA8 = companion2.a();
                        if (objA3 == companion2.a()) {
                            i4 = 8388608;
                        } else {
                            i4 = 25165824;
                        }
                        iubVar.C(key, i4, objA3, null, objA8);
                    } else if (data != null) {
                        if (objectKey == null) {
                            objA2 = d.INSTANCE.a();
                        } else {
                            objA2 = objectKey;
                        }
                        if (objA2 == d.INSTANCE.a()) {
                            i2 = 33554432;
                        } else {
                            i2 = 50331648;
                        }
                        iubVar.C(key, i2, objA2, data, null);
                    } else {
                        if (objectKey == null) {
                            objA = d.INSTANCE.a();
                        } else {
                            objA = objectKey;
                        }
                        if (objA == d.INSTANCE.a()) {
                            i = 0;
                        } else {
                            i = 16777216;
                        }
                        iubVar.C(key, i, objA, null, null);
                    }
                    ti6 ti6Var2 = new ti6(key, -1, t.v(iubVar.l()), -1, 0);
                    uVar2.k(ti6Var2, this.nodeIndex - uVar2.getStartIndex());
                    uVar2.j(ti6Var2);
                    ArrayList arrayList = new ArrayList();
                    if (z) {
                        i3 = 0;
                    } else {
                        i3 = this.nodeIndex;
                    }
                    uVar = new u(arrayList, i3);
                } else {
                    uVar2.j(ti6VarD);
                    long handle = ti6VarD.getHandle();
                    this.nodeIndex = uVar2.i(ti6VarD) + uVar2.getStartIndex();
                    int iO2 = uVar2.o(ti6VarD);
                    int groupIndex = iO2 - uVar2.getGroupIndex();
                    uVar2.m(iO2, uVar2.getGroupIndex());
                    if (groupIndex > 0) {
                        this.reader.Z(uVar2.g());
                        this.changeListWriter.x(groupIndex);
                    }
                    uVar2.h(ti6VarD.getIndex());
                    this.reader.Z(handle);
                    F1(z, data);
                }
            }
            P0(z, uVar);
        }
        jRotateLeft = Long.rotateLeft(Long.rotateLeft(getCompositeKeyHashCode(), 3) ^ ((long) (objectKey instanceof Enum ? ((Enum) objectKey).ordinal() : objectKey.hashCode())), 3);
        j = 0;
        this.compositeKeyHashCode = jRotateLeft ^ j;
        if (objectKey == null) {
            this.rGroupIndex++;
        }
        companion = z15.INSTANCE;
        if (kind != companion.a()) {
            z = true;
        } else {
            z = false;
        }
        uVar = null;
        if (getInserting()) {
            this.reader.c();
            iubVar2 = this.builder;
            if (z) {
                companion3 = d.INSTANCE;
                objA6 = companion3.a();
                Object objA9 = companion3.a();
                if (objA6 == companion3.a()) {
                    i7 = 8388608;
                } else {
                    i7 = 25165824;
                }
                iubVar2.C(key, i7, objA6, null, objA9);
            } else if (data != null) {
                if (objectKey == null) {
                    objA5 = d.INSTANCE.a();
                } else {
                    objA5 = objectKey;
                }
                if (objA5 == d.INSTANCE.a()) {
                    i6 = 33554432;
                } else {
                    i6 = 50331648;
                }
                iubVar2.C(key, i6, objA5, data, null);
            } else {
                if (objectKey == null) {
                    objA4 = d.INSTANCE.a();
                } else {
                    objA4 = objectKey;
                }
                if (objA4 == d.INSTANCE.a()) {
                    i5 = 0;
                } else {
                    i5 = 16777216;
                }
                iubVar2.C(key, i5, objA4, null, null);
            }
            uVar3 = this.pending;
            if (uVar3 != null) {
                ti6 ti6Var3 = new ti6(key, -1, t.v(iubVar2.l()), -1, 0);
                uVar3.k(ti6Var3, this.nodeIndex - uVar3.getStartIndex());
                uVar3.j(ti6Var3);
            }
            P0(z, null);
            return;
        }
        if (kind != companion.b()) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (this.pending == null) {
            int iO3 = this.reader.o();
            if (z2) {
                this.pending = new u(this.reader.g(), this.nodeIndex);
            } else {
                this.pending = new u(this.reader.g(), this.nodeIndex);
            }
        }
        uVar2 = this.pending;
        if (uVar2 != null) {
            ti6 ti6VarD2 = uVar2.d(key, objectKey);
            if (z2) {
                this.reader.c();
                this.inserting = true;
                this.providerCache = null;
                O0();
                iubVar = this.builder;
                if (z) {
                    companion2 = d.INSTANCE;
                    objA3 = companion2.a();
                    Object objA10 = companion2.a();
                    if (objA3 == companion2.a()) {
                        i4 = 8388608;
                    } else {
                        i4 = 25165824;
                    }
                    iubVar.C(key, i4, objA3, null, objA10);
                } else if (data != null) {
                    if (objectKey == null) {
                        objA2 = d.INSTANCE.a();
                    } else {
                        objA2 = objectKey;
                    }
                    if (objA2 == d.INSTANCE.a()) {
                        i2 = 33554432;
                    } else {
                        i2 = 50331648;
                    }
                    iubVar.C(key, i2, objA2, data, null);
                } else {
                    if (objectKey == null) {
                        objA = d.INSTANCE.a();
                    } else {
                        objA = objectKey;
                    }
                    if (objA == d.INSTANCE.a()) {
                        i = 0;
                    } else {
                        i = 16777216;
                    }
                    iubVar.C(key, i, objA, null, null);
                }
                ti6 ti6Var4 = new ti6(key, -1, t.v(iubVar.l()), -1, 0);
                uVar2.k(ti6Var4, this.nodeIndex - uVar2.getStartIndex());
                uVar2.j(ti6Var4);
                ArrayList arrayList2 = new ArrayList();
                if (z) {
                    i3 = 0;
                } else {
                    i3 = this.nodeIndex;
                }
                uVar = new u(arrayList2, i3);
            } else {
                this.reader.c();
                this.inserting = true;
                this.providerCache = null;
                O0();
                iubVar = this.builder;
                if (z) {
                    companion2 = d.INSTANCE;
                    objA3 = companion2.a();
                    Object objA11 = companion2.a();
                    if (objA3 == companion2.a()) {
                        i4 = 8388608;
                    } else {
                        i4 = 25165824;
                    }
                    iubVar.C(key, i4, objA3, null, objA11);
                } else if (data != null) {
                    if (objectKey == null) {
                        objA2 = d.INSTANCE.a();
                    } else {
                        objA2 = objectKey;
                    }
                    if (objA2 == d.INSTANCE.a()) {
                        i2 = 33554432;
                    } else {
                        i2 = 50331648;
                    }
                    iubVar.C(key, i2, objA2, data, null);
                } else {
                    if (objectKey == null) {
                        objA = d.INSTANCE.a();
                    } else {
                        objA = objectKey;
                    }
                    if (objA == d.INSTANCE.a()) {
                        i = 0;
                    } else {
                        i = 16777216;
                    }
                    iubVar.C(key, i, objA, null, null);
                }
                ti6 ti6Var5 = new ti6(key, -1, t.v(iubVar.l()), -1, 0);
                uVar2.k(ti6Var5, this.nodeIndex - uVar2.getStartIndex());
                uVar2.j(ti6Var5);
                ArrayList arrayList3 = new ArrayList();
                if (z) {
                    i3 = 0;
                } else {
                    i3 = this.nodeIndex;
                }
                uVar = new u(arrayList3, i3);
            }
        }
        P0(z, uVar);
    }

    private final void E0() {
        this.pending = null;
        this.nodeIndex = 0;
        this.groupNodeCount = 0;
        this.compositeKeyHashCode = 0L;
        this.nodeExpected = false;
        w3c.a(this.invalidateStack);
        F0();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final void E1(int key, Object dataKey) throws NoWhenBranchMatchedException, KotlinNothingValueException {
        D1(key, dataKey, z15.INSTANCE.a(), null);
    }

    private final void F0() {
        this.nodeCountOverrides = null;
        this.nodeCountVirtualOverrides = null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final void F1(boolean isNode, Object data) throws NoWhenBranchMatchedException {
        if (isNode) {
            this.reader.h0();
            return;
        }
        if (data != null && this.reader.n() != data) {
            this.changeListWriter.W(data);
        }
        this.reader.g0();
    }

    private final a69 G0() {
        a69 a69Var = this.providerCache;
        return a69Var != null ? a69Var : H0(this.reader.getParent());
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final void G1() throws NoWhenBranchMatchedException, KotlinNothingValueException {
        this.rGroupIndex = 0;
        this.reader = this.slotTable.P();
        z15.Companion companion = z15.INSTANCE;
        D1(100, null, companion.a(), null);
        this.parentContext.x();
        a69 a69VarJ = this.parentContext.j();
        this.providersInvalidStack.i(t.j(this.providersInvalid));
        this.providersInvalid = x(a69VarJ);
        this.providerCache = null;
        if (!this.forceRecomposeScopes) {
            this.forceRecomposeScopes = this.parentContext.getCollectingParameterInformation();
        }
        if (!getSourceMarkersEnabled()) {
            x1(this.parentContext.getCollectingSourceInformation());
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
        D1(Long.hashCode(this.parentContext.getCompositeKeyHashCode()), null, companion.a(), null);
    }

    private final a69 H0(int group) {
        a69 a69VarB;
        if (getInserting() && this.builderHasAProvider) {
            int parent = this.builder.getParent();
            while (parent >= 0) {
                if (this.builder.p(parent) == 202 && Intrinsics.e(this.builder.q(parent), e.f())) {
                    Object objO = this.builder.o(parent);
                    Intrinsics.h(objO, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
                    a69 a69Var = (a69) objO;
                    this.providerCache = a69Var;
                    return a69Var;
                }
                parent = this.builder.w(parent);
            }
        }
        if (!this.reader.M()) {
            while (group >= 0) {
                if (this.reader.F(group) == 202 && Intrinsics.e(this.reader.H(group), e.f())) {
                    o48<a69> o48Var = this.providerUpdates;
                    if (o48Var == null || (a69VarB = o48Var.b(group)) == null) {
                        Object objE = this.reader.E(group);
                        Intrinsics.h(objE, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
                        a69VarB = (a69) objE;
                    }
                    this.providerCache = a69VarB;
                    return a69VarB;
                }
                group = this.reader.U(group);
            }
        }
        a69 a69Var2 = this.rootProvider;
        this.providerCache = a69Var2;
        return a69Var2;
    }

    private final Object H1(Object obj) {
        return obj instanceof zea ? ((zea) obj).getWrapped() : obj;
    }

    private final fq1 I0() {
        if (!getSourceMarkersEnabled()) {
            return null;
        }
        List listC = m.c();
        listC.addAll(jub.a(this.builder));
        listC.addAll(vub.a(this.reader));
        listC.addAll(m0());
        return new fq1(m.a(listC), getSourceMarkersEnabled());
    }

    private final void J0(k58<Object, Object> invalidationsRequested, Function2<? super d, ? super Integer, Unit> content) {
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
                G1();
                Object objF1 = f1();
                if (objF1 != content && content != null) {
                    Function2<? super d, ? super Integer, Unit> function2 = content;
                    N1(content);
                }
                c cVar = this.derivedStateObserver;
                r58<x43> r58VarC = p0.c();
                try {
                    r58VarC.c(cVar);
                    if (content != null) {
                        E1(200, e.g());
                        p04.a(this, content);
                        M0();
                    } else if ((!this.forciblyRecompose && !this.providersInvalid) || objF1 == null || Intrinsics.e(objF1, d.INSTANCE.a())) {
                        y1();
                    } else {
                        E1(200, e.g());
                        p04.a(this, (Function2) kotlin.jvm.internal.a.f(objF1, 2));
                        M0();
                    }
                    r58VarC.u(r58VarC.getSize() - 1);
                    N0();
                    this.isComposing = false;
                    v1(false);
                    Unit unit = Unit.a;
                    vbdVar.b(objA);
                } catch (Throwable th) {
                    r58VarC.u(r58VarC.getSize() - 1);
                    throw th;
                }
            } catch (Throwable th2) {
                try {
                    throw jq1.b(th2, new Function0() { // from class: com.google.android.w27
                        public final Object invoke() {
                            return s.K0(this.a);
                        }
                    });
                } catch (Throwable th3) {
                    this.isComposing = false;
                    z0();
                    v1(true);
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            vbd.a.b(objA);
            throw th4;
        }
    }

    private final void J1(long virtualGroup, int count) {
        if (O1(virtualGroup) != count) {
            if (t.t(virtualGroup)) {
                m48 m48Var = this.nodeCountVirtualOverrides;
                if (m48Var == null) {
                    m48Var = new m48(0, 1, null);
                    this.nodeCountVirtualOverrides = m48Var;
                }
                m48Var.u(v15.b(virtualGroup), count);
                return;
            }
            m48 m48Var2 = this.nodeCountOverrides;
            if (m48Var2 == null) {
                m48Var2 = new m48(0, 1, null);
                this.nodeCountOverrides = m48Var2;
            }
            t.t(virtualGroup);
            m48Var2.u(v15.b(virtualGroup), count);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fq1 K0(s sVar) {
        return sVar.I0();
    }

    private final void K1(long virtualHandle, int newCount) {
        int iO1 = O1(virtualHandle);
        if (iO1 != newCount) {
            int i = newCount - iO1;
            int iD = w3c.d(this.pendingStack) - 1;
            while (v15.b(virtualHandle) != -1) {
                int iO2 = O1(virtualHandle) + i;
                J1(virtualHandle, iO2);
                for (int i2 = iD; -1 < i2; i2--) {
                    u uVar = (u) w3c.h(this.pendingStack, i2);
                    if (uVar != null && uVar.p(v15.b(virtualHandle), iO2)) {
                        iD = i2 - 1;
                        break;
                    }
                }
                if (t.t(virtualHandle)) {
                    virtualHandle = this.reader.x();
                } else {
                    int[] groups = X0().getAddressSpace().getGroups();
                    int iB = v15.b(virtualHandle);
                    if ((groups[iB + 4] & 8388608) == 8388608) {
                        return;
                    }
                    virtualHandle = (((long) bqd.c(groups[iB + 2])) & 4294967295L) | (((long) 0) << 32);
                }
            }
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final void L0(boolean isNode) throws NoWhenBranchMatchedException {
        long jRotateRight;
        long j;
        long jRotateRight2;
        long j2;
        int iE = this.parentStateStack.e() - 1;
        if (getInserting()) {
            int parent = this.builder.getParent();
            int iP = this.builder.p(parent);
            Object objQ = this.builder.q(parent);
            Object objO = this.builder.o(parent);
            if (objQ != null) {
                int iOrdinal = objQ instanceof Enum ? ((Enum) objQ).ordinal() : objQ.hashCode();
                jRotateRight2 = Long.rotateRight(getCompositeKeyHashCode() ^ ((long) 0), 3);
                j2 = iOrdinal;
            } else if (objO == null || iP != 207 || Intrinsics.e(objO, d.INSTANCE.a())) {
                jRotateRight2 = Long.rotateRight(getCompositeKeyHashCode() ^ ((long) iE), 3);
                j2 = iP;
            } else {
                this.compositeKeyHashCode = Long.rotateRight(((long) objO.hashCode()) ^ Long.rotateRight(getCompositeKeyHashCode() ^ ((long) iE), 3), 3);
            }
            this.compositeKeyHashCode = Long.rotateRight(jRotateRight2 ^ j2, 3);
        } else {
            int parent2 = this.reader.getParent();
            int iF = this.reader.F(parent2);
            Object objH = this.reader.H(parent2);
            Object objE = this.reader.E(parent2);
            if (objH != null) {
                int iOrdinal2 = objH instanceof Enum ? ((Enum) objH).ordinal() : objH.hashCode();
                jRotateRight = Long.rotateRight(getCompositeKeyHashCode() ^ ((long) 0), 3);
                j = iOrdinal2;
            } else if (objE == null || iF != 207 || Intrinsics.e(objE, d.INSTANCE.a())) {
                jRotateRight = Long.rotateRight(getCompositeKeyHashCode() ^ ((long) iE), 3);
                j = iF;
            } else {
                this.compositeKeyHashCode = Long.rotateRight(((long) objE.hashCode()) ^ Long.rotateRight(getCompositeKeyHashCode() ^ ((long) iE), 3), 3);
            }
            this.compositeKeyHashCode = Long.rotateRight(jRotateRight ^ j, 3);
        }
        int i = this.groupNodeCount;
        u uVar = this.pending;
        if (uVar != null && !uVar.b().isEmpty()) {
            List<ti6> listB = uVar.b();
            List<ti6> listF = uVar.f();
            Set setE = p47.e(listF);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int size = listF.size();
            int size2 = listB.size();
            int i2 = 0;
            int i3 = 0;
            int iQ = 0;
            while (i2 < size2) {
                ti6 ti6Var = listB.get(i2);
                if (!setE.contains(ti6Var)) {
                    this.changeListWriter.L(uVar.i(ti6Var) + uVar.getStartIndex(), ti6Var.getNodes());
                    uVar.p(v15.b(ti6Var.getHandle()), 0);
                    this.reader.Z(ti6Var.getHandle());
                    l1();
                    this.reader.e0();
                } else if (!linkedHashSet.contains(ti6Var)) {
                    if (i3 < size) {
                        ti6 ti6Var2 = listF.get(i3);
                        if (ti6Var2 != ti6Var) {
                            int i4 = uVar.i(ti6Var2);
                            linkedHashSet.add(ti6Var2);
                            if (i4 != iQ) {
                                int iQ2 = uVar.q(ti6Var2);
                                this.changeListWriter.y(i4 + uVar.getStartIndex(), iQ + uVar.getStartIndex(), iQ2);
                                uVar.l(i4, iQ, iQ2);
                            }
                        } else {
                            i2++;
                        }
                        i3++;
                        iQ += uVar.q(ti6Var2);
                        listB = listB;
                        listF = listF;
                    }
                }
                i2++;
            }
            this.changeListWriter.k();
            if (!listB.isEmpty()) {
                this.reader.f0();
            }
        }
        boolean inserting = getInserting();
        if (!inserting) {
            int i5 = this.nodeIndex;
            int i6 = this.reader.get_previousSibling();
            eub eubVarX0 = X0();
            int iM = this.reader.m();
            int[] groups = eubVarX0.getAddressSpace().getGroups();
            while (true) {
                int i7 = iM;
                int i8 = i6;
                i6 = i7;
                if (i6 < 0) {
                    break;
                }
                p1(v15.c(this.reader.getParent(), i8, i6));
                this.changeListWriter.L(i5, this.reader.T(i6));
                this.changeListWriter.k();
                iM = groups[i6 + 1];
            }
            this.changeListWriter.M(this.reader.m(), this.reader.B());
        }
        if (inserting) {
            if (isNode) {
                this.insertFixups.d();
                i = 1;
            }
            this.lastPlacedChildGroup = this.builder.getParent();
            this.reader.e();
            this.builder.i();
            if (!this.reader.s()) {
                long jU = this.builder.u();
                m1(jU);
                this.inserting = false;
                if (!X0().isEmpty()) {
                    long jV = t.v(jU);
                    J1(jV, 0);
                    K1(jV, i);
                }
            }
        } else {
            if (isNode) {
                this.changeListWriter.z();
            }
            long jX = this.reader.x();
            if (i != O1(jX)) {
                K1(jX, i);
            }
            int i9 = isNode ? 1 : i;
            this.lastPlacedChildGroup = v15.b(jX);
            this.reader.f();
            this.changeListWriter.k();
            i = i9;
        }
        S0(i, inserting);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [com.google.android.a69, java.lang.Object] */
    private final a69 L1(a69 parentScope, a69 currentProviders) throws NoWhenBranchMatchedException, KotlinNothingValueException {
        k79.a<zr1<Object>, c1e<Object>> aVarBuilder2 = parentScope.builder2();
        aVarBuilder2.putAll(currentProviders);
        ?? Build2 = aVarBuilder2.build2();
        E1(204, e.i());
        M1(Build2);
        M1(currentProviders);
        M0();
        return Build2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final void M0() throws NoWhenBranchMatchedException {
        L0(false);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final void M1(Object value) throws NoWhenBranchMatchedException, KotlinNothingValueException {
        f1();
        N1(value);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final void N0() throws NoWhenBranchMatchedException {
        M0();
        this.parentContext.d();
        M0();
        U0();
        this.reader.d();
        this.forciblyRecompose = false;
        this.providersInvalid = t.i(this.providersInvalidStack.g());
    }

    private final void O0() {
        if (this.builder.getIsClosed()) {
            iub iubVar = new iub(this.slotTable.getAddressSpace(), this.slotTable.getRecordSourceInformation(), this.slotTable.getRecordCallByInformation());
            this.builder = iubVar;
            iubVar.f();
            this.builderHasAProvider = false;
            this.providerCache = null;
        }
    }

    private final int O1(long virtualHandle) {
        int iE;
        if (t.t(virtualHandle)) {
            m48 m48Var = this.nodeCountVirtualOverrides;
            if (m48Var != null) {
                return m48Var.e(v15.b(virtualHandle), 0);
            }
            return 0;
        }
        t.t(virtualHandle);
        int iB = v15.b(virtualHandle);
        m48 m48Var2 = this.nodeCountOverrides;
        return (m48Var2 == null || (iE = m48Var2.e(iB, -1)) < 0) ? X0().getAddressSpace().getGroups()[iB + 4] & 8388607 : iE;
    }

    private final void P0(boolean isNode, u newPending) {
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
        this.lastPlacedChildGroup = -1;
    }

    private final void P1() {
        if (!this.nodeExpected) {
            e.b("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.nodeExpected = false;
    }

    private final void Q0(b0 scope) {
        scope.P(this.compositionToken);
        this.observerHolder.a();
    }

    private final void Q1() {
        if (this.nodeExpected) {
            e.b("A call to createNode(), emitNode() or useNode() expected");
        }
    }

    private final void R0() {
        kub kubVarO = this.slotTable.O();
        try {
            d81.a(this.changes).e(v1d.a, kubVarO, y1d.a, j0());
            Unit unit = Unit.a;
        } finally {
            kubVarO.b();
        }
    }

    private final void S0(int expectedNodeCount, boolean inserting) {
        u uVar = (u) w3c.i(this.pendingStack);
        if (uVar != null && !inserting) {
            uVar.n(uVar.getGroupIndex() + 1);
        }
        this.pending = uVar;
        this.nodeIndex = this.parentStateStack.g() + expectedNodeCount;
        this.rGroupIndex = this.parentStateStack.g();
        this.groupNodeCount = this.parentStateStack.g() + expectedNodeCount;
    }

    private final Function1<pr1, Unit> T0(b0 scope) {
        this.observerHolder.a();
        return scope.f(this.compositionToken);
    }

    private final void U0() {
        this.changeListWriter.n();
        if (!w3c.e(this.pendingStack)) {
            e.b("Start/end imbalance");
        }
        E0();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX WARN: Code duplicated, block: B:69:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:70:0x01f2  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r1v2 */
    private final void Y0(List<Pair<r08, r08>> references) throws Throwable {
        qq1 qq1Var;
        b81 b81Var;
        qq1 qq1Var2;
        b81 b81Var2;
        eub eubVarF;
        eub eubVar;
        uub uubVarP;
        uub uubVar;
        uub uubVar2;
        m48 m48Var;
        o48<a69> o48Var;
        qq1 qq1Var3;
        b81 changeList;
        qq1 qq1Var4;
        qq1 qq1Var5;
        boolean implicitRootStart;
        qq1 qq1Var6;
        int i;
        ComposerChangeListWriterAddressMode composerChangeListWriterAddressMode;
        ComposerChangeListWriterAddressMode addressMode;
        long j;
        ComposerChangeListWriterAddressMode composerChangeListWriterAddressMode2;
        long j2;
        cub slotStorage;
        eub eubVarF2;
        cub slotStorage2;
        uub uubVar3;
        s sVar = this;
        qq1 qq1Var7 = sVar.changeListWriter;
        b81 b81VarA = d81.a(sVar.lateChanges);
        b81 changeList2 = qq1Var7.getChangeList();
        try {
            qq1Var7.R(b81VarA);
            sVar.changeListWriter.N();
            int size = references.size();
            boolean z = 0;
            int i2 = 0;
            final s sVar2 = sVar;
            while (i2 < size) {
                try {
                    Pair<r08, r08> pair = references.get(i2);
                    final r08 r08Var = (r08) pair.a();
                    r08 r08Var2 = (r08) pair.b();
                    long j3 = ((long) z) << 32;
                    final long jC = (((long) bqd.c(u27.c(r08Var.getAnchor()).getAddress())) & 4294967295L) | j3;
                    IntRef intRef = new IntRef(z, 1, null);
                    sVar2.changeListWriter.g(intRef, jC);
                    if (r08Var2 == null) {
                        eub eubVarF3 = sub.f(r08Var.getSlotStorage());
                        if (Intrinsics.e(eubVarF3, sVar2.builder.getTable())) {
                            sVar2.v1(z);
                        }
                        final uub uubVarP2 = eubVarF3.P();
                        try {
                            uubVarP2.Z(jC);
                            final b81 b81Var3 = new b81();
                            Function0 function0 = new Function0() { // from class: com.google.android.x27
                                public final Object invoke() {
                                    return s.Z0(this.a, b81Var3, uubVarP2, jC, r08Var);
                                }
                            };
                            uubVar3 = uubVarP2;
                            sVar2 = this;
                            try {
                                j1(sVar2, null, null, 0, null, function0, 15, null);
                                sVar2.changeListWriter.s(b81Var3, intRef);
                                Unit unit = Unit.a;
                                uubVar3.d();
                                qq1Var2 = qq1Var7;
                                b81Var2 = changeList2;
                                i = size;
                            } catch (Throwable th) {
                                th = th;
                                uubVar3.d();
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            uubVar3 = uubVarP2;
                        }
                    } else {
                        q08 q08VarQ = sVar2.parentContext.q(r08Var2);
                        if (q08VarQ == null || (slotStorage2 = q08VarQ.getSlotStorage()) == null || (eubVarF = sub.f(slotStorage2)) == null) {
                            eubVarF = sub.f(r08Var2.getSlotStorage());
                        }
                        int address = (q08VarQ == null || (slotStorage = q08VarQ.getSlotStorage()) == null || (eubVarF2 = sub.f(slotStorage)) == null) ? u27.c(r08Var2.getAnchor()).getAddress() : eubVarF2.getRoot();
                        List<? extends Object> listM = t.m(eubVarF, address);
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                try {
                                                                                    if (listM.isEmpty()) {
                                                                                        eubVar = eubVarF;
                                                                                    } else {
                                                                                        sVar2.changeListWriter.d(listM, intRef);
                                                                                        eubVar = eubVarF;
                                                                                        if (Intrinsics.e(r08Var.getSlotStorage(), sVar2.slotTable)) {
                                                                                            sVar2.J1(j3 | (((long) bqd.c(u27.c(r08Var.getAnchor()).getAddress())) & 4294967295L), sVar2.O1(j3 | (((long) bqd.c(u27.c(r08Var.getAnchor()).getAddress())) & 4294967295L)) + listM.size());
                                                                                        }
                                                                                        sVar2.changeListWriter.e(q08VarQ, sVar2.parentContext, r08Var2, r08Var);
                                                                                        uubVarP = eubVar.P();
                                                                                        uubVar2 = sVar2.reader;
                                                                                        m48Var = sVar2.nodeCountOverrides;
                                                                                        o48Var = sVar2.providerUpdates;
                                                                                        sVar2.nodeCountOverrides = null;
                                                                                        sVar2.providerUpdates = null;
                                                                                        sVar2.reader = uubVarP;
                                                                                        uubVarP.Y(address);
                                                                                        b81 b81Var4 = new b81();
                                                                                        qq1Var3 = sVar2.changeListWriter;
                                                                                        uubVar = uubVarP;
                                                                                        changeList = qq1Var3.getChangeList();
                                                                                        qq1Var3.R(b81Var4);
                                                                                        qq1Var5 = sVar2.changeListWriter;
                                                                                        implicitRootStart = qq1Var5.getImplicitRootStart();
                                                                                        qq1Var5.S(false);
                                                                                        qq1Var6 = sVar2.changeListWriter;
                                                                                        i = size;
                                                                                        o48Var = o48Var;
                                                                                        qq1Var6.editorCurrentPosition = sVar2.reader.I();
                                                                                        composerChangeListWriterAddressMode = ComposerChangeListWriterAddressMode.RelativeAddressing;
                                                                                        addressMode = qq1Var6.getAddressMode();
                                                                                        j = qq1Var6.editorCurrentPosition;
                                                                                        qq1Var6.Q(composerChangeListWriterAddressMode);
                                                                                        r08Var2.j();
                                                                                        x22 composition = r08Var2.getComposition();
                                                                                        x22 composition2 = r08Var.getComposition();
                                                                                        int iM = sVar2.reader.m();
                                                                                        List<Pair<b0, Object>> listD = r08Var2.d();
                                                                                        Function0 function1 = new Function0() { // from class: com.google.android.y27
                                                                                            public final Object invoke() {
                                                                                                return s.a1(this.a, r08Var);
                                                                                            }
                                                                                        };
                                                                                        b81 b81Var5 = changeList2;
                                                                                        qq1Var4 = qq1Var3;
                                                                                        b81Var2 = b81Var5;
                                                                                        qq1Var2 = qq1Var7;
                                                                                        composerChangeListWriterAddressMode2 = addressMode;
                                                                                        sVar2.i1(composition, composition2, iM, listD, function1);
                                                                                        qq1Var6.Q(composerChangeListWriterAddressMode2);
                                                                                        if (composerChangeListWriterAddressMode2 == composerChangeListWriterAddressMode) {
                                                                                            j2 = j;
                                                                                        } else {
                                                                                            j2 = -1;
                                                                                        }
                                                                                        qq1Var6.editorCurrentPosition = j2;
                                                                                        qq1Var5.S(implicitRootStart);
                                                                                        qq1Var4.R(changeList);
                                                                                        sVar2.changeListWriter.s(b81Var4, intRef);
                                                                                        Unit unit2 = Unit.a;
                                                                                        sVar2.reader = uubVar2;
                                                                                        sVar2.nodeCountOverrides = m48Var;
                                                                                        sVar2.providerUpdates = o48Var;
                                                                                        uubVar.d();
                                                                                        sVar2.changeListWriter.h(q08VarQ);
                                                                                    }
                                                                                    uubVar.d();
                                                                                    sVar2.changeListWriter.h(q08VarQ);
                                                                                } catch (Throwable th3) {
                                                                                    th = th3;
                                                                                    b81Var = b81Var2;
                                                                                    qq1Var = qq1Var2;
                                                                                    qq1Var.R(b81Var);
                                                                                    throw th;
                                                                                }
                                                                                sVar2.reader = uubVar2;
                                                                                sVar2.nodeCountOverrides = m48Var;
                                                                                sVar2.providerUpdates = o48Var;
                                                                            } catch (Throwable th4) {
                                                                                th = th4;
                                                                                uubVar.d();
                                                                                throw th;
                                                                            }
                                                                            qq1Var4.R(changeList);
                                                                            sVar2.changeListWriter.s(b81Var4, intRef);
                                                                            Unit unit3 = Unit.a;
                                                                        } catch (Throwable th5) {
                                                                            th = th5;
                                                                            o48Var = o48Var;
                                                                            m48Var = m48Var;
                                                                            sVar2.reader = uubVar2;
                                                                            sVar2.nodeCountOverrides = m48Var;
                                                                            sVar2.providerUpdates = o48Var;
                                                                            throw th;
                                                                        }
                                                                        qq1Var5.S(implicitRootStart);
                                                                    } catch (Throwable th6) {
                                                                        th = th6;
                                                                        o48Var = o48Var;
                                                                        m48Var = m48Var;
                                                                        try {
                                                                            qq1Var4.R(changeList);
                                                                            throw th;
                                                                        } catch (Throwable th7) {
                                                                            th = th7;
                                                                            sVar2.reader = uubVar2;
                                                                            sVar2.nodeCountOverrides = m48Var;
                                                                            sVar2.providerUpdates = o48Var;
                                                                            throw th;
                                                                        }
                                                                    }
                                                                    qq1Var6.Q(composerChangeListWriterAddressMode2);
                                                                    if (composerChangeListWriterAddressMode2 == composerChangeListWriterAddressMode) {
                                                                        j2 = j;
                                                                    } else {
                                                                        j2 = -1;
                                                                    }
                                                                    qq1Var6.editorCurrentPosition = j2;
                                                                } catch (Throwable th8) {
                                                                    th = th8;
                                                                    o48Var = o48Var;
                                                                    m48Var = m48Var;
                                                                    try {
                                                                        qq1Var5.S(implicitRootStart);
                                                                        throw th;
                                                                    } catch (Throwable th9) {
                                                                        th = th9;
                                                                        qq1Var4.R(changeList);
                                                                        throw th;
                                                                    }
                                                                }
                                                                sVar2.i1(composition, composition2, iM, listD, function1);
                                                            } catch (Throwable th10) {
                                                                th = th10;
                                                                m48Var = m48Var;
                                                                try {
                                                                    qq1Var6.Q(composerChangeListWriterAddressMode2);
                                                                    qq1Var6.editorCurrentPosition = composerChangeListWriterAddressMode2 == ComposerChangeListWriterAddressMode.RelativeAddressing ? j : -1L;
                                                                    throw th;
                                                                } catch (Throwable th11) {
                                                                    th = th11;
                                                                    qq1Var5.S(implicitRootStart);
                                                                    throw th;
                                                                }
                                                            }
                                                            x22 composition3 = r08Var.getComposition();
                                                            int iM2 = sVar2.reader.m();
                                                            List<Pair<b0, Object>> listD2 = r08Var2.d();
                                                            Function0 function2 = new Function0() { // from class: com.google.android.y27
                                                                public final Object invoke() {
                                                                    return s.a1(this.a, r08Var);
                                                                }
                                                            };
                                                            b81 b81Var6 = changeList2;
                                                            qq1Var4 = qq1Var3;
                                                            b81Var2 = b81Var6;
                                                            qq1Var2 = qq1Var7;
                                                            composerChangeListWriterAddressMode2 = addressMode;
                                                        } catch (Throwable th12) {
                                                            th = th12;
                                                            m48Var = m48Var;
                                                            composerChangeListWriterAddressMode2 = addressMode;
                                                            qq1Var4 = qq1Var3;
                                                        }
                                                        x22 composition4 = r08Var2.getComposition();
                                                    } catch (Throwable th13) {
                                                        th = th13;
                                                        m48Var = m48Var;
                                                        composerChangeListWriterAddressMode2 = addressMode;
                                                        qq1Var4 = qq1Var3;
                                                    }
                                                    r08Var2.j();
                                                } catch (Throwable th14) {
                                                    th = th14;
                                                    composerChangeListWriterAddressMode2 = addressMode;
                                                    qq1Var4 = qq1Var3;
                                                    m48Var = m48Var;
                                                }
                                                qq1Var6.editorCurrentPosition = sVar2.reader.I();
                                                composerChangeListWriterAddressMode = ComposerChangeListWriterAddressMode.RelativeAddressing;
                                                addressMode = qq1Var6.getAddressMode();
                                                j = qq1Var6.editorCurrentPosition;
                                                qq1Var6.Q(composerChangeListWriterAddressMode);
                                            } catch (Throwable th15) {
                                                th = th15;
                                                m48Var = m48Var;
                                                o48Var = o48Var;
                                                qq1Var4 = qq1Var3;
                                                qq1Var5.S(implicitRootStart);
                                                throw th;
                                            }
                                            qq1Var5.S(false);
                                            qq1Var6 = sVar2.changeListWriter;
                                            i = size;
                                            o48Var = o48Var;
                                        } catch (Throwable th16) {
                                            th = th16;
                                        }
                                        qq1Var3.R(b81Var4);
                                        qq1Var5 = sVar2.changeListWriter;
                                        implicitRootStart = qq1Var5.getImplicitRootStart();
                                    } catch (Throwable th17) {
                                        th = th17;
                                        qq1Var4 = qq1Var3;
                                    }
                                    changeList = qq1Var3.getChangeList();
                                } catch (Throwable th18) {
                                    th = th18;
                                }
                                sVar2.reader = uubVarP;
                                uubVarP.Y(address);
                                b81 b81Var7 = new b81();
                                qq1Var3 = sVar2.changeListWriter;
                                uubVar = uubVarP;
                            } catch (Throwable th19) {
                                th = th19;
                                uubVar = uubVarP;
                            }
                            uubVar2 = sVar2.reader;
                            m48Var = sVar2.nodeCountOverrides;
                            o48Var = sVar2.providerUpdates;
                            sVar2.nodeCountOverrides = null;
                            sVar2.providerUpdates = null;
                        } catch (Throwable th20) {
                            th = th20;
                            uubVar = uubVarP;
                        }
                        sVar2.changeListWriter.e(q08VarQ, sVar2.parentContext, r08Var2, r08Var);
                        uubVarP = eubVar.P();
                    }
                    i2++;
                    changeList2 = b81Var2;
                    size = i;
                    qq1Var7 = qq1Var2;
                    z = 0;
                    sVar2 = sVar2;
                } catch (Throwable th21) {
                    th = th21;
                    qq1Var2 = qq1Var7;
                    b81Var2 = changeList2;
                }
            }
            qq1 qq1Var8 = qq1Var7;
            b81 b81Var8 = changeList2;
            sVar2.v1(z);
            sVar2.changeListWriter.j();
            qq1Var8.R(b81Var8);
        } catch (Throwable th22) {
            th = th22;
            qq1Var = qq1Var7;
            b81Var = changeList2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Z0(s sVar, b81 b81Var, uub uubVar, long j, r08 r08Var) {
        long j2;
        qq1 qq1Var = sVar.changeListWriter;
        b81 changeList = qq1Var.getChangeList();
        try {
            qq1Var.R(b81Var);
            uub uubVar2 = sVar.reader;
            m48 m48Var = sVar.nodeCountOverrides;
            o48<a69> o48Var = sVar.providerUpdates;
            sVar.nodeCountOverrides = null;
            sVar.providerUpdates = null;
            try {
                sVar.reader = uubVar;
                qq1 qq1Var2 = sVar.changeListWriter;
                boolean implicitRootStart = qq1Var2.getImplicitRootStart();
                try {
                    qq1Var2.S(false);
                    qq1 qq1Var3 = sVar.changeListWriter;
                    qq1Var3.editorCurrentPosition = j;
                    ComposerChangeListWriterAddressMode composerChangeListWriterAddressMode = ComposerChangeListWriterAddressMode.RelativeAddressing;
                    ComposerChangeListWriterAddressMode addressMode = qq1Var3.getAddressMode();
                    long j3 = qq1Var3.editorCurrentPosition;
                    qq1Var3.Q(composerChangeListWriterAddressMode);
                    try {
                        j2 = j3;
                        try {
                            sVar.b1(r08Var.c(), r08Var.getLocals(), r08Var.getParameter(), true);
                            qq1Var3.Q(addressMode);
                            qq1Var3.editorCurrentPosition = addressMode == composerChangeListWriterAddressMode ? j2 : -1L;
                            qq1Var2.S(implicitRootStart);
                            Unit unit = Unit.a;
                            sVar.reader = uubVar2;
                            sVar.nodeCountOverrides = m48Var;
                            sVar.providerUpdates = o48Var;
                            qq1Var.R(changeList);
                            return Unit.a;
                        } catch (Throwable th) {
                            th = th;
                            qq1Var3.Q(addressMode);
                            qq1Var3.editorCurrentPosition = addressMode == ComposerChangeListWriterAddressMode.RelativeAddressing ? j2 : -1L;
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        j2 = j3;
                    }
                } catch (Throwable th3) {
                    qq1Var2.S(implicitRootStart);
                    throw th3;
                }
            } catch (Throwable th4) {
                sVar.reader = uubVar2;
                sVar.nodeCountOverrides = m48Var;
                sVar.providerUpdates = o48Var;
                throw th4;
            }
        } catch (Throwable th5) {
            qq1Var.R(changeList);
            throw th5;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final Unit a1(s sVar, r08 r08Var) throws NoWhenBranchMatchedException, KotlinNothingValueException {
        sVar.b1(r08Var.c(), r08Var.getLocals(), r08Var.getParameter(), true);
        return Unit.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final void b1(final n08<Object> content, a69 locals, final Object parameter, boolean force) throws NoWhenBranchMatchedException, KotlinNothingValueException {
        V(126665345, content);
        M1(parameter);
        long compositeKeyHashCode = getCompositeKeyHashCode();
        try {
            this.compositeKeyHashCode = 126665345;
            if (getInserting()) {
                this.builder.b(268435456);
            }
            boolean z = false;
            if (!getInserting() && !Intrinsics.e(this.reader.n(), locals)) {
                z = true;
            }
            if (z) {
                n1(locals);
            }
            D1(202, e.f(), z15.INSTANCE.a(), locals);
            this.providerCache = null;
            if (!getInserting() || force) {
                boolean z2 = this.providersInvalid;
                this.providersInvalid = z;
                this.changeListWriter.O(this.reader.I(), true);
                qq1 qq1Var = this.changeListWriter;
                qq1Var.editorCurrentPosition = -1L;
                ComposerChangeListWriterAddressMode composerChangeListWriterAddressMode = ComposerChangeListWriterAddressMode.AnchorAddressing;
                ComposerChangeListWriterAddressMode addressMode = qq1Var.getAddressMode();
                long j = qq1Var.editorCurrentPosition;
                qq1Var.Q(composerChangeListWriterAddressMode);
                try {
                    p04.a(this, ko1.c(-1241221479, true, new Function2() { // from class: com.google.android.a37
                        public final Object invoke(Object obj, Object obj2) {
                            return s.c1(content, parameter, (d) obj, ((Integer) obj2).intValue());
                        }
                    }));
                    qq1Var.Q(addressMode);
                    qq1Var.editorCurrentPosition = addressMode == ComposerChangeListWriterAddressMode.RelativeAddressing ? j : -1L;
                    this.providersInvalid = z2;
                } catch (Throwable th) {
                    qq1Var.Q(addressMode);
                    qq1Var.editorCurrentPosition = addressMode == ComposerChangeListWriterAddressMode.RelativeAddressing ? j : -1L;
                    throw th;
                }
            } else {
                this.builderHasAProvider = true;
                iub iubVar = this.builder;
                this.parentContext.n(new r08(content, parameter, getComposition(), this.builder.getTable(), this.builder.getTable().getAddressSpace().d(iubVar.w(iubVar.getParent())), m.p(), G0(), null));
            }
            M0();
            this.providerCache = null;
            this.compositeKeyHashCode = compositeKeyHashCode;
            Z();
        } catch (Throwable th2) {
            try {
                throw jq1.b(th2, new Function0() { // from class: com.google.android.b37
                    public final Object invoke() {
                        return s.d1(this.a);
                    }
                });
            } catch (Throwable th3) {
                M0();
                this.providerCache = null;
                this.compositeKeyHashCode = compositeKeyHashCode;
                Z();
                throw th3;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c1(n08 n08Var, Object obj, d dVar, int i) {
        if (dVar.g((i & 3) != 2, i & 1)) {
            if (e.k()) {
                e.o(-1241221479, i, -1, "androidx.compose.runtime.LinkComposer.invokeMovableContentLambda.<anonymous>.<anonymous> (LinkComposer.kt:2031)");
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
    public static final fq1 d1(s sVar) {
        return sVar.I0();
    }

    private final boolean e1(long group) {
        long jI = this.reader.I();
        return jI == -1 || t.q(X0(), group, jI) == jI;
    }

    private final int h1(int group) {
        int iU = this.reader.U(group);
        int[] groups = X0().getAddressSpace().getGroups();
        int i = 0;
        for (int root = iU < 0 ? X0().getRoot() : this.reader.h(iU); root >= 0 && root != group; root = groups[root + 1]) {
            if (!this.reader.J(root)) {
                i++;
            }
        }
        return i;
    }

    private final <R> R i1(x22 from, x22 to, int address, List<? extends Pair<b0, ? extends Object>> invalidations, Function0<? extends R> block) {
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
            if (from == null || (r = (R) from.x(to, address, block)) == null) {
                r = (R) block.invoke();
            }
            return r;
        } finally {
            this.isComposing = isComposing;
            this.nodeIndex = i;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ Object j1(s sVar, x22 x22Var, x22 x22Var2, int i, List list, Function0 function0, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            x22Var = null;
        }
        if ((i2 & 2) != 0) {
            x22Var2 = null;
        }
        if ((i2 & 4) != 0) {
            i = -1;
        }
        if ((i2 & 8) != 0) {
            list = m.p();
        }
        return sVar.i1(x22Var, x22Var2, i, list, function0);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0277 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:107:0x0271 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x0188  */
    /* JADX WARN: Code duplicated, block: B:54:0x0191 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:57:0x019b  */
    /* JADX WARN: Code duplicated, block: B:58:0x019e  */
    /* JADX WARN: Code duplicated, block: B:61:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:66:0x01cd A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:90:0x026b  */
    private final void k1() {
        long j;
        char c2;
        int i;
        int iH;
        int i2;
        int iU;
        int i3;
        long compositeKeyHashCode;
        int iO1;
        int i4;
        long jRotateLeft;
        long j2;
        int i5;
        boolean isComposing = getIsComposing();
        int i6 = 1;
        this.isComposing = true;
        uub uubVar = this.reader;
        int parent = uubVar.getParent();
        int i7 = this.nodeIndex;
        long compositeKeyHashCode2 = getCompositeKeyHashCode();
        int i8 = this.groupNodeCount;
        int i9 = this.rGroupIndex;
        int iH2 = uubVar.h(parent);
        int i10 = 0;
        loop0: while (true) {
            int i11 = i6;
            int i12 = -1;
            if (iH2 == -1) {
                i7 = i7;
                compositeKeyHashCode2 = compositeKeyHashCode2;
                j = 4294967295L;
                c2 = ' ';
                break;
            }
            if (uubVar.V(iH2)) {
                uubVar.Y(iH2);
                j = 4294967295L;
                b0 b0VarT1 = t1(iH2);
                if (b0VarT1.x(r6b.h(this.invalidations, b0VarT1))) {
                    this.providerCache = null;
                    h1(iH2);
                    b0VarT1.e(this);
                    this.providerCache = null;
                    i10 = i11;
                    i = i10;
                } else {
                    w3c.j(this.invalidateStack, b0VarT1);
                    this.observerHolder.a();
                    b0VarT1.B();
                    w3c.i(this.invalidateStack);
                }
                iH = uubVar.h(iH2);
                c2 = ' ';
                if (i == 0 || iH == -1) {
                    i7 = i7;
                    compositeKeyHashCode2 = compositeKeyHashCode2;
                    i2 = i10;
                    i = i;
                } else {
                    boolean zK = uubVar.K(iH2);
                    if (zK) {
                        if (uubVar.H(iH2) instanceof n08) {
                            i2 = i10;
                            this.compositeKeyHashCode = 126665345;
                            i7 = i7;
                            compositeKeyHashCode2 = compositeKeyHashCode2;
                            i = i;
                        } else {
                            i2 = i10;
                            int iF = uubVar.F(iH2);
                            int i13 = this.rGroupIndex;
                            Object objH = uubVar.H(iH2);
                            Object objE = uubVar.E(iH2);
                            if (objH != null) {
                                if (objH instanceof Enum) {
                                    jRotateLeft = Long.rotateLeft(Long.rotateLeft(getCompositeKeyHashCode(), 3) ^ ((long) ((Enum) objH).ordinal()), 3);
                                    i4 = 0;
                                } else {
                                    i4 = 0;
                                    jRotateLeft = Long.rotateLeft(((long) objH.hashCode()) ^ Long.rotateLeft(getCompositeKeyHashCode(), 3), 3);
                                }
                                j2 = i4;
                            } else if (objE == null || iF != 207 || Intrinsics.e(objE, d.INSTANCE.a())) {
                                jRotateLeft = Long.rotateLeft(Long.rotateLeft(getCompositeKeyHashCode(), 3) ^ ((long) iF), 3);
                                j2 = i13;
                            } else {
                                int iHashCode = objE.hashCode();
                                i = i;
                                i7 = i7;
                                compositeKeyHashCode2 = compositeKeyHashCode2;
                                this.compositeKeyHashCode = ((long) i13) ^ Long.rotateLeft(Long.rotateLeft(getCompositeKeyHashCode(), 3) ^ ((long) iHashCode), 3);
                            }
                            this.compositeKeyHashCode = jRotateLeft ^ j2;
                        }
                        this.parentStateStack.i(this.nodeIndex);
                        this.parentStateStack.i(this.rGroupIndex);
                        if (uubVar.P(iH2)) {
                            this.changeListWriter.w(uubVar.S(iH2));
                            i5 = 0;
                            this.nodeIndex = 0;
                        } else {
                            i5 = 0;
                        }
                        this.rGroupIndex = i5;
                    } else {
                        i7 = i7;
                        compositeKeyHashCode2 = compositeKeyHashCode2;
                        i2 = i10;
                        i = i;
                        this.nodeIndex += uubVar.P(iH2) ? i11 : O1((((long) 0) << 32) | (((long) bqd.c(iH2)) & j));
                        if (!uubVar.J(iH2)) {
                            this.rGroupIndex++;
                        }
                    }
                    if (zK) {
                        iH2 = iH;
                    } else {
                        i12 = -1;
                    }
                    i6 = i11;
                    i10 = i2;
                    i7 = i7;
                    compositeKeyHashCode2 = compositeKeyHashCode2;
                }
                if (iH == i12 && i == 0) {
                    int i14 = this.nodeIndex;
                    if (uubVar.P(iH2)) {
                        iO1 = i11;
                    } else {
                        iO1 = O1((((long) 0) << 32) | (((long) bqd.c(iH2)) & j));
                    }
                    this.nodeIndex = i14 + iO1;
                    if (!uubVar.J(iH2)) {
                        this.rGroupIndex++;
                    }
                }
                int i15 = iH2;
                iH2 = uubVar.R(iH2);
                iU = i15;
                while (iH2 == -1) {
                    iU = uubVar.U(iU);
                    if (iU != -1 || iU == parent) {
                        i10 = i2;
                        break loop0;
                    }
                    if (uubVar.P(iU)) {
                        this.changeListWriter.z();
                    }
                    this.rGroupIndex = this.parentStateStack.g();
                    long j3 = 0;
                    this.nodeIndex = this.parentStateStack.g() + O1((j3 << 32) | (((long) bqd.c(iU)) & j));
                    int iF2 = uubVar.F(iU);
                    int i16 = this.rGroupIndex;
                    Object objH2 = uubVar.H(iU);
                    Object objE2 = uubVar.E(iU);
                    if (objH2 == null) {
                        if (objE2 == null || iF2 != 207 || Intrinsics.e(objE2, d.INSTANCE.a())) {
                            i3 = 3;
                            compositeKeyHashCode = getCompositeKeyHashCode() ^ ((long) i16);
                        } else {
                            this.compositeKeyHashCode = Long.rotateRight(((long) objE2.hashCode()) ^ Long.rotateRight(getCompositeKeyHashCode() ^ ((long) i16), 3), 3);
                        }
                        if (!uubVar.J(iU)) {
                            this.rGroupIndex++;
                        }
                        iH2 = uubVar.R(iU);
                    } else {
                        i3 = 3;
                        iF2 = objH2 instanceof Enum ? ((Enum) objH2).ordinal() : objH2.hashCode();
                        compositeKeyHashCode = j3 ^ getCompositeKeyHashCode();
                    }
                    this.compositeKeyHashCode = Long.rotateRight(((long) iF2) ^ Long.rotateRight(compositeKeyHashCode, i3), i3);
                    if (!uubVar.J(iU)) {
                        this.rGroupIndex++;
                    }
                    iH2 = uubVar.R(iU);
                }
                i6 = i11;
                i10 = i2;
                i7 = i7;
                compositeKeyHashCode2 = compositeKeyHashCode2;
            } else {
                j = 4294967295L;
            }
            i = 0;
            iH = uubVar.h(iH2);
            c2 = ' ';
            if (i == 0) {
                i7 = i7;
                compositeKeyHashCode2 = compositeKeyHashCode2;
                i2 = i10;
                i = i;
                if (iH == i12) {
                    int i17 = this.nodeIndex;
                    if (uubVar.P(iH2)) {
                        iO1 = i11;
                    } else {
                        iO1 = O1((((long) 0) << 32) | (((long) bqd.c(iH2)) & j));
                    }
                    this.nodeIndex = i17 + iO1;
                    if (!uubVar.J(iH2)) {
                        this.rGroupIndex++;
                    }
                }
                int i18 = iH2;
                iH2 = uubVar.R(iH2);
                iU = i18;
                while (true) {
                    iU = uubVar.U(iU);
                    if (iU != -1) {
                    }
                    i10 = i2;
                    iH2 = uubVar.R(iU);
                }
            } else {
                i7 = i7;
                compositeKeyHashCode2 = compositeKeyHashCode2;
                i2 = i10;
                i = i;
                if (iH == i12) {
                    int i19 = this.nodeIndex;
                    if (uubVar.P(iH2)) {
                        iO1 = i11;
                    } else {
                        iO1 = O1((((long) 0) << 32) | (((long) bqd.c(iH2)) & j));
                    }
                    this.nodeIndex = i19 + iO1;
                    if (!uubVar.J(iH2)) {
                        this.rGroupIndex++;
                    }
                }
                int i110 = iH2;
                iH2 = uubVar.R(iH2);
                iU = i110;
                while (true) {
                    iU = uubVar.U(iU);
                    if (iU != -1) {
                    }
                    i10 = i2;
                    iH2 = uubVar.R(iU);
                }
            }
            i6 = i11;
            i10 = i2;
            i7 = i7;
            compositeKeyHashCode2 = compositeKeyHashCode2;
        }
        uubVar.a0(parent);
        if (i10 != 0) {
            uubVar.f0();
            int iO2 = O1((((long) 0) << c2) | (((long) bqd.c(parent)) & j));
            this.nodeIndex = i7 + iO2;
            this.groupNodeCount = i8 + iO2;
            this.rGroupIndex = i9;
        } else {
            A1();
        }
        this.compositeKeyHashCode = compositeKeyHashCode2;
        this.isComposing = isComposing;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final void l1() throws NoWhenBranchMatchedException {
        p1(this.reader.I());
        this.changeListWriter.K();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final void m1(long source) throws NoWhenBranchMatchedException {
        if (this.insertFixups.f()) {
            this.changeListWriter.t(this.builder.getTable(), source);
        } else {
            this.changeListWriter.u(this.builder.getTable(), source, this.insertFixups);
            this.insertFixups = new oe4();
        }
    }

    private final void n1(a69 providers) {
        o48<a69> o48Var = this.providerUpdates;
        if (o48Var == null) {
            o48Var = new o48<>(0, 1, null);
            this.providerUpdates = o48Var;
        }
        o48Var.r(this.reader.m(), providers);
    }

    private final void o1() {
        if (this.slotTable.x(536870912)) {
            getComposition().c0();
            b81 b81Var = new b81();
            w1(b81Var);
            uub uubVarP = this.slotTable.P();
            try {
                this.reader = uubVarP;
                qq1 qq1Var = this.changeListWriter;
                b81 changeList = qq1Var.getChangeList();
                try {
                    qq1Var.R(b81Var);
                    p1(uubVarP.b0());
                    qq1Var.R(changeList);
                    Unit unit = Unit.a;
                    uubVarP.d();
                } catch (Throwable th) {
                    qq1Var.R(changeList);
                    throw th;
                }
            } catch (Throwable th2) {
                uubVarP.d();
                throw th2;
            }
        }
    }

    private final void p1(long groupBeingRemoved) {
        int iB = v15.b(groupBeingRemoved);
        boolean z = (this.reader.i(iB) & 8388608) == 8388608;
        if (z) {
            this.changeListWriter.k();
            this.changeListWriter.w(this.reader.S(iB));
        }
        s1(this, groupBeingRemoved, z, 0);
        this.changeListWriter.k();
        if (z) {
            this.changeListWriter.z();
        }
    }

    private static final r08 q1(s sVar, int i, List<r08> list) {
        Object objH = sVar.reader.H(i);
        Intrinsics.h(objH, "null cannot be cast to non-null type androidx.compose.runtime.MovableContent<kotlin.Any?>");
        n08 n08Var = (n08) objH;
        Object objK = sVar.reader.k(i, 0);
        List<Pair<b0, Object>> listO = t.o(sVar.reader, i, sVar.invalidations);
        return new r08(n08Var, objK, sVar.getComposition(), sVar.X0(), sVar.X0().getAddressSpace().d(i), listO, sVar.H0(i), list);
    }

    private static final r08 r1(s sVar, int i) {
        boolean z;
        int i2 = sVar.reader.i(i);
        List listA = null;
        if ((i2 & 268435456) != 268435456) {
            return null;
        }
        if ((i2 & 536870912) == 536870912) {
            List listC = m.c();
            uub uubVar = sVar.reader;
            int iH = uubVar.h(i);
            loop0: while (iH != -1) {
                if ((sVar.reader.i(iH) & 268435456) == 268435456) {
                    r08 r08VarR1 = r1(sVar, iH);
                    if (r08VarR1 != null) {
                        listC.add(r08VarR1);
                    }
                    z = true;
                } else {
                    z = false;
                }
                int iH2 = uubVar.h(iH);
                if (z || iH2 == -1 || (sVar.reader.i(iH) & 536870912) != 536870912) {
                    int iU = iH;
                    iH = uubVar.R(iH);
                    while (iH == -1) {
                        iU = uubVar.U(iU);
                        if (iU == -1 || iU == i) {
                            break loop0;
                        }
                        iH = uubVar.R(iU);
                    }
                } else {
                    iH = iH2;
                }
            }
            listA = m.a(listC);
        }
        return q1(sVar, i, listA);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0047  */
    /* JADX WARN: Code duplicated, block: B:15:0x004a A[PHI: r0
  0x004a: PHI (r0v5 int) = (r0v2 int), (r0v4 int), (r0v9 int) binds: [B:64:0x0134, B:34:0x00a3, B:13:0x0045] A[DONT_GENERATE, DONT_INLINE]] */
    private static final int s1(s sVar, long j, boolean z, int i) {
        int i2;
        int iB = v15.b(j);
        int i3 = 0;
        if (iB < 0) {
            return 0;
        }
        int i4 = sVar.reader.i(iB);
        if ((i4 & 268435456) == 268435456) {
            r08 r08VarR1 = r1(sVar, iB);
            if (r08VarR1 != null) {
                sVar.parentContext.c(r08VarR1);
                sVar.changeListWriter.H(sVar.getComposition(), sVar.parentContext, r08VarR1);
            }
            if (z) {
                sVar.changeListWriter.l(i, iB);
            } else {
                i2 = sVar.reader.i(iB);
                if ((i2 & 8388608) == 8388608) {
                    i3 = 1;
                } else {
                    i3 = i2 & 8388607;
                }
            }
        } else if ((i4 & 1073741824) == 1073741824) {
            Object objK = sVar.reader.k(iB, 0);
            zea zeaVar = objK instanceof zea ? (zea) objK : null;
            yea wrapped = zeaVar != null ? zeaVar.getWrapped() : null;
            a aVar = wrapped instanceof a ? (a) wrapped : null;
            if (aVar != null) {
                for (s sVar2 : aVar.getRef().B()) {
                    sVar2.o1();
                    sVar.parentContext.v(sVar2.getComposition());
                }
            }
            i2 = sVar.reader.i(iB);
            if ((i2 & 8388608) == 8388608) {
                i3 = 1;
            } else {
                i3 = i2 & 8388607;
            }
        } else if ((i4 & 536870912) == 536870912 || (i4 & t04.INVALID_ID) == Integer.MIN_VALUE) {
            uub uubVar = sVar.reader;
            long jC = (((long) (-1)) << 32) | (((long) bqd.c(uubVar.h(iB))) & 4294967295L);
            int iS1 = 0;
            for (int i5 = -1; v15.b(jC) != i5; i5 = -1) {
                int iB2 = v15.b(jC);
                int i6 = (sVar.reader.i(iB2) & 8388608) == 8388608 ? 1 : i3;
                if (i6 != 0) {
                    sVar.changeListWriter.k();
                    sVar.changeListWriter.w(sVar.reader.S(iB2));
                }
                iS1 += s1(sVar, jC, i6 != 0 || z, i6 != 0 ? 0 : i + iS1);
                if (i6 != 0) {
                    sVar.changeListWriter.k();
                    sVar.changeListWriter.z();
                }
                jC = (((long) v15.b(jC)) << 32) | (((long) bqd.c(uubVar.R(v15.b(jC)))) & 4294967295L);
                i3 = 0;
            }
            i3 = iS1;
        } else {
            i2 = sVar.reader.i(iB);
            if ((i2 & 8388608) == 8388608) {
                i3 = 1;
            } else {
                i3 = i2 & 8388607;
            }
        }
        if ((i4 & 8388608) == 8388608) {
            return 1;
        }
        return i3;
    }

    private final b0 t1(int group) {
        Object objK = this.reader.k(group, 0);
        if (Intrinsics.e(objK, d.INSTANCE.a())) {
            e.b("Cannot obtain RecomposeScope. Group does not have a corresponding slot.");
        }
        if (!(objK instanceof b0)) {
            e.b("Expected a RecomposeScope in the first non-utility slot, found " + objK + '.');
        }
        return (b0) objK;
    }

    private final boolean u1(int group) {
        return this.reader.K(group);
    }

    private final void v1(boolean dispose) {
        if (!this.builder.getIsClosed()) {
            eub eubVarD = this.builder.d();
            if (dispose) {
                eubVarD.f();
            }
        }
        iub iubVar = new iub(this.slotTable.getAddressSpace(), false, false);
        iubVar.g();
        this.builder = iubVar;
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
        if (!this.reader.getIsClosed()) {
            this.reader.d();
        }
        v1(false);
    }

    private final void z1() {
        this.groupNodeCount += this.reader.e0();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // androidx.compose.p004runtime.d
    public boolean A(boolean value) throws NoWhenBranchMatchedException, KotlinNothingValueException {
        Object objF1 = f1();
        if ((objF1 instanceof Boolean) && value == ((Boolean) objF1).booleanValue()) {
            return false;
        }
        N1(Boolean.valueOf(value));
        return true;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // androidx.compose.p004runtime.d
    public boolean B(float value) throws NoWhenBranchMatchedException, KotlinNothingValueException {
        Object objF1 = f1();
        if ((objF1 instanceof Float) && Intrinsics.a(value, (Float) objF1)) {
            return false;
        }
        N1(Float.valueOf(value));
        return true;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // androidx.compose.p004runtime.d
    public boolean C(int value) throws NoWhenBranchMatchedException, KotlinNothingValueException {
        Object objF1 = f1();
        if ((objF1 instanceof Integer) && value == ((Number) objF1).intValue()) {
            return false;
        }
        N1(Integer.valueOf(value));
        return true;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // androidx.compose.p004runtime.d
    public boolean D(long value) throws NoWhenBranchMatchedException, KotlinNothingValueException {
        Object objF1 = f1();
        if ((objF1 instanceof Long) && value == ((Number) objF1).longValue()) {
            return false;
        }
        N1(Long.valueOf(value));
        return true;
    }

    @Override // androidx.compose.p004runtime.d
    /* JADX INFO: renamed from: E, reason: from getter */
    public boolean getInserting() {
        return this.inserting;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // androidx.compose.p004runtime.d
    public d F(int key) throws NoWhenBranchMatchedException, KotlinNothingValueException {
        y(key);
        D0();
        return this;
    }

    @Override // androidx.compose.p004runtime.d
    public ez<?> G() {
        return this.applier;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // androidx.compose.p004runtime.d
    public s6b H() throws NoWhenBranchMatchedException {
        b0 b0Var = null;
        b0 b0Var2 = w3c.f(this.invalidateStack) ? (b0) w3c.i(this.invalidateStack) : null;
        if (b0Var2 != null) {
            b0Var2.I(false);
            Function1<pr1, Unit> function1T0 = T0(b0Var2);
            if (function1T0 != null) {
                this.changeListWriter.i(function1T0, getComposition());
            }
            if (b0Var2.q()) {
                b0Var2.L(false);
                this.changeListWriter.m(b0Var2);
                b0Var2.M(false);
                if (b0Var2.p() && this.reusingGroup == this.reader.getParent()) {
                    b0Var2.K(false);
                    this.reusingGroup = -1;
                    this.reusing = false;
                }
            }
        }
        if (b0Var2 != null && !b0Var2.s() && (b0Var2.t() || this.forceRecomposeScopes)) {
            if (b0Var2.getAnchor() == null) {
                b0Var2.D(getInserting() ? this.builder.j() : this.reader.u());
            }
            b0Var2.F(false);
            b0Var = b0Var2;
        }
        L0(false);
        return b0Var;
    }

    @Override // androidx.compose.p004runtime.d
    public Object I(Object left, Object right) {
        Object objR = t.r(getInserting() ? null : this.reader.p(), left, right);
        return objR == null ? new JoinedKey(left, right) : objR;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final void I1(Object value) throws NoWhenBranchMatchedException, KotlinNothingValueException {
        boolean z = value instanceof yea;
        Object obj = value;
        if (z) {
            g37 g37Var = new g37((yea) value, X0().getAddressSpace().d(this.lastPlacedChildGroup));
            if (getInserting()) {
                this.changeListWriter.I(g37Var);
            }
            this.abandonSet.add(value);
            obj = g37Var;
        }
        N1(obj);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // androidx.compose.p004runtime.d
    public void J() throws NoWhenBranchMatchedException, KotlinNothingValueException {
        D1(125, null, z15.INSTANCE.b(), null);
        this.nodeExpected = true;
    }

    @Override // androidx.compose.p004runtime.d
    /* JADX INFO: renamed from: K, reason: from getter */
    public CoroutineContext getApplyCoroutineContext() {
        return this.applyCoroutineContext;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // androidx.compose.p004runtime.d
    public void L(Object value) throws NoWhenBranchMatchedException, KotlinNothingValueException {
        I1(value);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // androidx.compose.p004runtime.d
    public void M() throws NoWhenBranchMatchedException {
        M0();
        b0 b0VarH0 = h0();
        if (b0VarH0 == null || !b0VarH0.t()) {
            return;
        }
        b0VarH0.E(true);
    }

    @Override // androidx.compose.p004runtime.d
    public void N() {
        this.forceRecomposeScopes = true;
        x1(true);
        this.slotTable.d();
        this.builder.h();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final void N1(Object value) throws NoWhenBranchMatchedException, KotlinNothingValueException {
        if (getInserting()) {
            this.builder.c(value);
        } else if (this.reader.getHadNext()) {
            this.changeListWriter.Z(this.reader.v() - 1, value);
        } else {
            this.changeListWriter.c(value);
        }
    }

    @Override // androidx.compose.p004runtime.d
    public qaa O() {
        return h0();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // androidx.compose.p004runtime.d
    public void P() throws NoWhenBranchMatchedException {
        if (this.reusing && this.reader.getParent() == this.reusingGroup) {
            this.reusingGroup = -1;
            this.reusing = false;
        }
        L0(false);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // androidx.compose.p004runtime.d
    public void Q(int key) throws NoWhenBranchMatchedException, KotlinNothingValueException {
        D1(key, null, z15.INSTANCE.a(), null);
    }

    @Override // androidx.compose.p004runtime.d
    public Object R() {
        return H1(g1());
    }

    @Override // androidx.compose.p004runtime.d
    public rr1 S() {
        rr1 rr1Var = this._compositionData;
        if (rr1Var != null) {
            return rr1Var;
        }
        c37 c37Var = new c37(getComposition());
        this._compositionData = c37Var;
        return c37Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // androidx.compose.p004runtime.d
    public boolean T(Object value) throws NoWhenBranchMatchedException, KotlinNothingValueException {
        if (f1() == value) {
            return false;
        }
        N1(value);
        return true;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // androidx.compose.p004runtime.d
    public void U() throws NoWhenBranchMatchedException, KotlinNothingValueException {
        D1(-127, null, z15.INSTANCE.a(), null);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // androidx.compose.p004runtime.d
    public void V(int key, Object dataKey) throws NoWhenBranchMatchedException, KotlinNothingValueException {
        D1(key, dataKey, z15.INSTANCE.a(), null);
    }

    /* JADX INFO: renamed from: V0, reason: from getter */
    public g getComposition() {
        return this.composition;
    }

    @Override // androidx.compose.p004runtime.d
    public <T> void W(Function0<? extends T> factory) {
        P1();
        if (!getInserting()) {
            e.b("createNode() can only be called when inserting");
        }
        int iC = this.parentStateStack.c();
        this.groupNodeCount++;
        long jL = this.builder.l();
        if (!this.changeListWriter.v()) {
            this.insertFixups.b(factory, iC, this.builder.l());
        } else {
            this.insertFixups.c(factory, iC, this.builder.getTable().getAddressSpace().d(v15.b(jL)));
        }
    }

    /* JADX INFO: renamed from: W0, reason: from getter */
    public final uub getReader() {
        return this.reader;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // androidx.compose.p004runtime.d
    public void X() throws NoWhenBranchMatchedException {
        M0();
        M0();
        this.providersInvalid = t.i(this.providersInvalidStack.g());
        this.providerCache = null;
    }

    public final eub X0() {
        return this.reader.getTable();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // androidx.compose.p004runtime.d
    public void Z() throws NoWhenBranchMatchedException {
        M0();
    }

    @Override // androidx.compose.p004runtime.d
    public int a() {
        return getInserting() ? -this.builder.getParent() : this.reader.getParent();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // androidx.compose.p004runtime.d
    public void a0() throws NoWhenBranchMatchedException {
        M0();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // androidx.compose.p004runtime.d
    public void b(boolean changed) throws NoWhenBranchMatchedException {
        if (!(this.groupNodeCount == 0)) {
            e.b("No nodes can be emitted before calling deactivateToEndGroup");
        }
        if (getInserting()) {
            return;
        }
        if (!changed) {
            A1();
        } else {
            this.changeListWriter.f();
            this.reader.f0();
        }
    }

    @Override // androidx.compose.p004runtime.o
    public void b0() {
        this.providerUpdates = null;
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
            J0(invalidationsRequested, content);
        } finally {
            this.shouldPauseCallback = null;
        }
    }

    @Override // androidx.compose.p004runtime.d
    public void d(List<Pair<r08, r08>> references) {
        try {
            Y0(references);
            E0();
        } catch (Throwable th) {
            z0();
            throw th;
        }
    }

    @Override // androidx.compose.p004runtime.o
    public void d0() {
        w3c.a(this.invalidateStack);
        r6b.c(this.invalidations);
        this.changes.a();
        this.providerUpdates = null;
    }

    @Override // androidx.compose.p004runtime.d
    public <V, T> void e(V value, Function2<? super T, ? super V, Unit> block) {
        if (getInserting()) {
            this.insertFixups.g(value, block);
        } else {
            this.changeListWriter.X(value, block);
        }
    }

    @Override // androidx.compose.p004runtime.o
    public void e0() {
        this.slotTable.f();
        this.parentContext.y(this);
        d0();
        G().clear();
        this.isDisposed = true;
    }

    @Override // androidx.compose.p004runtime.d
    /* JADX INFO: renamed from: f, reason: from getter */
    public long getCompositeKeyHashCode() {
        return this.compositeKeyHashCode;
    }

    @Override // androidx.compose.p004runtime.o
    public void f0() {
        int i = this.reusingGroup;
        if (!(!getIsComposing() && (i < 0 ? 100 : this.reader.F(i)) == 100)) {
            ei9.a("Cannot disable reuse from root if it was caused by other groups");
        }
        this.reusingGroup = -1;
        this.reusing = false;
    }

    public final Object f1() {
        if (getInserting()) {
            Q1();
            return d.INSTANCE.a();
        }
        Object objQ = this.reader.Q();
        return (!this.reusing || (objQ instanceof ena)) ? objQ : d.INSTANCE.a();
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
        this.changeListWriter.J(b0VarH0);
        this.parentContext.u(b0VarH0);
        return false;
    }

    @Override // androidx.compose.p004runtime.o
    public boolean g0() {
        return this.childrenComposing > 0;
    }

    public final Object g1() {
        if (getInserting()) {
            Q1();
            return d.INSTANCE.a();
        }
        Object objQ = this.reader.Q();
        if (this.reusing && !(objQ instanceof ena)) {
            return d.INSTANCE.a();
        }
        if (objQ instanceof zea) {
            this.changeListWriter.Y(t.l((zea) objQ), X0().getAddressSpace().d(this.lastPlacedChildGroup));
        }
        return objQ;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // androidx.compose.p004runtime.d
    public void h(int marker) throws NoWhenBranchMatchedException {
        if (marker < 0) {
            int i = -marker;
            iub iubVar = this.builder;
            p48 p48Var = new p48(0, 1, null);
            int[] groups = X0().getAddressSpace().getGroups();
            int i2 = i;
            while (i2 > 0) {
                p48Var.g(i2);
                i2 = groups[i2 + 2];
            }
            if (!(i2 != 0)) {
                e.b("Traversing parent of group not in the slot table: " + i);
            }
            while (!p48Var.a(iubVar.getParent())) {
                L0(iubVar.t());
            }
            return;
        }
        if (getInserting()) {
            iub iubVar2 = this.builder;
            while (getInserting()) {
                L0(iubVar2.t());
            }
        }
        p48 p48Var2 = new p48(0, 1, null);
        int[] groups2 = X0().getAddressSpace().getGroups();
        int i3 = marker;
        while (i3 > 0) {
            p48Var2.g(i3);
            i3 = groups2[i3 + 2];
        }
        if (!(i3 != 0)) {
            e.b("Traversing parent of group not in the slot table: " + marker);
        }
        uub uubVar = this.reader;
        for (int parent = uubVar.getParent(); !p48Var2.a(parent); parent = uubVar.getParent()) {
            L0((uubVar.i(parent) & 8388608) == 8388608);
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

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // androidx.compose.p004runtime.d
    public void i(os9<?>[] values) throws NoWhenBranchMatchedException, KotlinNothingValueException {
        a69 a69VarL1;
        a69 a69VarG0 = G0();
        E1(201, e.h());
        boolean z = true;
        boolean z2 = false;
        if (getInserting()) {
            a69VarL1 = L1(a69VarG0, hs1.d(values, a69VarG0, null, 4, null));
            this.builderHasAProvider = true;
        } else {
            Object objJ = this.reader.j(0);
            Intrinsics.h(objJ, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            a69 a69Var = (a69) objJ;
            Object objJ2 = this.reader.j(1);
            Intrinsics.h(objJ2, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            a69 a69Var2 = (a69) objJ2;
            a69 a69VarC = hs1.c(values, a69VarG0, a69Var2);
            if (c() && !this.reusing && Intrinsics.e(a69Var2, a69VarC)) {
                z1();
                a69VarL1 = a69Var;
            } else {
                a69VarL1 = L1(a69VarG0, a69VarC);
                if (!this.reusing && Intrinsics.e(a69VarL1, a69Var)) {
                    z = false;
                }
                z2 = z;
            }
        }
        if (z2 && !getInserting()) {
            n1(a69VarL1);
        }
        this.providersInvalidStack.i(t.j(this.providersInvalid));
        this.providersInvalid = z2;
        this.providerCache = a69VarL1;
        D1(202, e.f(), z15.INSTANCE.a(), a69VarL1);
    }

    @Override // androidx.compose.p004runtime.o
    /* JADX INFO: renamed from: i0, reason: from getter */
    public g81 getDeferredChanges() {
        return this.deferredChanges;
    }

    @Override // androidx.compose.p004runtime.d
    public gs1 j() {
        return G0();
    }

    @Override // androidx.compose.p004runtime.o
    public ur1 j0() {
        if (getSourceMarkersEnabled()) {
            return this.errorContext;
        }
        return null;
    }

    @Override // androidx.compose.p004runtime.d
    public void k() {
        P1();
        if (getInserting()) {
            e.b("useNode() called while inserting");
        }
        Object objY = this.reader.y();
        this.changeListWriter.w(objY);
        if (this.reusing && (objY instanceof aq1)) {
            this.changeListWriter.a0(objY);
        }
    }

    @Override // androidx.compose.p004runtime.o
    /* JADX INFO: renamed from: k0, reason: from getter */
    public boolean getSourceMarkersEnabled() {
        return this.sourceMarkersEnabled;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // androidx.compose.p004runtime.d
    public void l() throws NoWhenBranchMatchedException {
        M0();
        M0();
        this.providersInvalid = t.i(this.providersInvalidStack.g());
        this.providerCache = null;
    }

    @Override // androidx.compose.p004runtime.o
    /* JADX INFO: renamed from: l0, reason: from getter */
    public boolean getIsComposing() {
        return this.isComposing;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // androidx.compose.p004runtime.d
    public void m() throws NoWhenBranchMatchedException {
        L0(true);
    }

    @Override // androidx.compose.p004runtime.o
    public List<ComposeStackTraceFrame> m0() {
        Integer numP;
        pr1 pr1VarI = this.parentContext.i();
        g gVar = pr1VarI instanceof g ? (g) pr1VarI : null;
        if (gVar != null && (numP = t.p(sub.f(gVar.getSlotStorage()), this.parentContext)) != null) {
            uub uubVarP = sub.f(gVar.getSlotStorage()).P();
            try {
                return m.a1(vub.b(uubVarP, numP.intValue(), 0), gVar.getComposer().m0());
            } finally {
                uubVarP.d();
            }
        }
        return m.p();
    }

    @Override // androidx.compose.p004runtime.d
    public void n(Function0<Unit> effect) {
        this.changeListWriter.T(effect);
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

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // androidx.compose.p004runtime.d
    public void o() throws NoWhenBranchMatchedException, KotlinNothingValueException {
        D1(125, null, z15.INSTANCE.c(), null);
        this.nodeExpected = true;
    }

    @Override // androidx.compose.p004runtime.o
    public boolean o0(k58<Object, Object> invalidationsRequested, fob shouldPause) {
        if (!this.changes.c()) {
            e.b("Expected applyChanges() to have been called");
        }
        if (r6b.i(invalidationsRequested) <= 0 && !r6b.k(this.invalidations) && ((this.slotTable.getRoot() < 0 || !u1(this.slotTable.getRoot())) && !this.forciblyRecompose)) {
            return false;
        }
        this.shouldPauseCallback = shouldPause;
        try {
            this.changeListWriter.U();
            J0(invalidationsRequested, null);
            this.shouldPauseCallback = null;
            if (d81.a(this.changes).f()) {
                return true;
            }
            if (!this.changes.d()) {
                return false;
            }
            R0();
            return false;
        } catch (Throwable th) {
            this.shouldPauseCallback = null;
            throw th;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // androidx.compose.p004runtime.d
    public void p(int key, Object dataKey) throws NoWhenBranchMatchedException, KotlinNothingValueException {
        if (!getInserting() && this.reader.o() == key && !Intrinsics.e(this.reader.n(), dataKey) && this.reusingGroup < 0) {
            this.reusingGroup = this.reader.m();
            this.reusing = true;
        }
        D1(key, null, z15.INSTANCE.a(), dataKey);
    }

    @Override // androidx.compose.p004runtime.o
    public fq1 p0(final Object value) {
        List listP;
        if (!getSourceMarkersEnabled()) {
            return new fq1(m.p(), false);
        }
        ObjectLocation objectLocationJ = sub.j(this.slotTable, new Function1() { // from class: com.google.android.z27
            public final Object invoke(Object obj) {
                return Boolean.valueOf(s.C1(value, obj));
            }
        });
        if (objectLocationJ == null || (listP = m.a1(B1(objectLocationJ.getGroup(), objectLocationJ.getDataOffset()), m0())) == null) {
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
        if (this.reader.m() < 0 || !u1(this.reader.getParent())) {
            A1();
        } else {
            k1();
        }
    }

    @Override // androidx.compose.p004runtime.o
    public void q0() {
        this.reusingGroup = this.slotTable.getRoot();
        this.reusing = true;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // androidx.compose.p004runtime.d
    public void r(os9<?> value) throws NoWhenBranchMatchedException, KotlinNothingValueException {
        c1e<?> c1eVar;
        a69 a69VarG0 = G0();
        E1(201, e.h());
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
            if (value.getCanOverride() || !hs1.a(a69VarG0, zr1VarB)) {
                a69VarG0 = a69VarG0.Y0(zr1VarB, c1eVarB);
            }
            this.builderHasAProvider = true;
        } else {
            uub uubVar = this.reader;
            Object objE = uubVar.E(uubVar.m());
            Intrinsics.h(objE, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            a69 a69Var = (a69) objE;
            if (!(c() && zE) && (value.getCanOverride() || !hs1.a(a69VarG0, zr1VarB))) {
                a69VarG0 = a69VarG0.Y0(zr1VarB, c1eVarB);
            } else if ((zE && !this.providersInvalid) || !this.providersInvalid) {
                a69VarG0 = a69Var;
            }
            if (!this.reusing && a69Var == a69VarG0) {
                z = false;
            }
            z2 = z;
        }
        if (z2 && !getInserting()) {
            n1(a69VarG0);
        }
        this.providersInvalidStack.i(t.j(this.providersInvalid));
        this.providersInvalid = z2;
        this.providerCache = a69VarG0;
        D1(202, e.f(), z15.INSTANCE.a(), a69VarG0);
    }

    @Override // androidx.compose.p004runtime.o
    public boolean r0(b0 scope, Object instance) {
        int address;
        mg anchor = scope.getAnchor();
        if (anchor == null || (address = u27.c(anchor).getAddress()) < 0 || !getIsComposing() || !e1((((long) 0) << 32) | (((long) bqd.c(address)) & 4294967295L))) {
            return false;
        }
        this.reader.b(address, 67108864);
        if (instance != null) {
            q6b q6bVar = q6b.a;
            if (!Intrinsics.e(instance, q6bVar)) {
                if (instance instanceof ScatterSet) {
                    k58<Object, Object> k58Var = this.invalidations;
                    Intrinsics.h(instance, "null cannot be cast to non-null type androidx.collection.ScatterSet<kotlin.Any>");
                    r6b.b(k58Var, scope, (ScatterSet) instance);
                    return true;
                }
                if (Intrinsics.e(r6b.h(this.invalidations, scope), q6bVar)) {
                    return true;
                }
                r6b.a(this.invalidations, scope, instance);
                return true;
            }
        }
        r6b.o(this.invalidations, scope, q6b.a);
        return true;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // androidx.compose.p004runtime.d
    public void s(n08<?> value, Object parameter) throws NoWhenBranchMatchedException, KotlinNothingValueException {
        Intrinsics.h(value, "null cannot be cast to non-null type androidx.compose.runtime.MovableContent<kotlin.Any?>");
        b1(value, G0(), parameter, false);
    }

    @Override // androidx.compose.p004runtime.o
    public void s0(k58<Object, Object> invalidationsRequested) {
        Object[] objArr = invalidationsRequested.keys;
        Object[] objArr2 = invalidationsRequested.values;
        long[] jArr = invalidationsRequested.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        Object obj = objArr[i4];
                        Object obj2 = objArr2[i4];
                        Intrinsics.h(obj, "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl");
                        mg anchor = ((b0) obj).getAnchor();
                        t27 t27VarC = anchor != null ? u27.c(anchor) : null;
                        if (t27VarC != null && t27VarC.a()) {
                            int address = t27VarC.getAddress();
                            this.reader.b(address, 67108864);
                            q6b q6bVar = q6b.a;
                            if (Intrinsics.e(obj2, q6bVar)) {
                                r6b.o(this.invalidations, obj, q6bVar);
                            } else if (obj2 instanceof androidx.collection.d) {
                                Intrinsics.h(obj2, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<kotlin.Any>");
                                r6b.b(this.invalidations, obj, (ScatterSet) obj2);
                            } else {
                                r6b.a(this.invalidations, obj, obj2);
                            }
                            this.reader.b(address, 67108864);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    @Override // androidx.compose.p004runtime.d
    public boolean t() {
        b0 b0VarH0;
        return !c() || this.providersInvalid || ((b0VarH0 = h0()) != null && b0VarH0.k());
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // androidx.compose.p004runtime.d
    public void u() throws NoWhenBranchMatchedException {
        M0();
    }

    @Override // androidx.compose.p004runtime.d
    public <T> T v(zr1<T> key) {
        return (T) hs1.b(G0(), key);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // androidx.compose.p004runtime.d
    public f w() throws NoWhenBranchMatchedException, KotlinNothingValueException {
        E1(206, e.j());
        if (getInserting()) {
            this.builder.b(1073741824);
        }
        Object objF1 = f1();
        ena dnaVar = objF1 instanceof ena ? (ena) objF1 : null;
        if (dnaVar == null) {
            dnaVar = new dna(new a(new b(getCompositeKeyHashCode(), this.forceRecomposeScopes, getSourceMarkersEnabled(), getComposition().getObserverHolder())), u27.e());
            N1(dnaVar);
        }
        yea wrapped = dnaVar.getWrapped();
        Intrinsics.h(wrapped, "null cannot be cast to non-null type androidx.compose.runtime.LinkComposer.CompositionContextHolder");
        a aVar = (a) wrapped;
        aVar.getRef().E(G0());
        M0();
        return aVar.getRef();
    }

    public void w1(g81 g81Var) {
        this.deferredChanges = g81Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // androidx.compose.p004runtime.d
    public boolean x(Object value) throws NoWhenBranchMatchedException, KotlinNothingValueException {
        if (Intrinsics.e(f1(), value)) {
            return false;
        }
        N1(value);
        return true;
    }

    public void x1(boolean z) {
        this.sourceMarkersEnabled = z;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // androidx.compose.p004runtime.d
    public void y(int key) throws NoWhenBranchMatchedException, KotlinNothingValueException {
        if (this.pending != null) {
            D1(key, null, z15.INSTANCE.a(), null);
            return;
        }
        Q1();
        this.compositeKeyHashCode = Long.rotateLeft(Long.rotateLeft(getCompositeKeyHashCode(), 3) ^ ((long) key), 3) ^ ((long) this.rGroupIndex);
        this.rGroupIndex++;
        uub uubVar = this.reader;
        if (getInserting()) {
            uubVar.c();
            iub iubVar = this.builder;
            d.Companion companion = d.INSTANCE;
            Object objA = companion.a();
            iubVar.C(key, objA == companion.a() ? 0 : 16777216, objA, null, null);
            P0(false, null);
            return;
        }
        if (uubVar.o() == key && !uubVar.r()) {
            uubVar.g0();
            P0(false, null);
            return;
        }
        if (!uubVar.N()) {
            int i = this.nodeIndex;
            l1();
            this.changeListWriter.L(i, uubVar.e0());
        }
        uubVar.c();
        this.inserting = true;
        this.providerCache = null;
        O0();
        iub iubVar2 = this.builder;
        d.Companion companion2 = d.INSTANCE;
        Object objA2 = companion2.a();
        iubVar2.C(key, objA2 == companion2.a() ? 0 : 16777216, objA2, null, null);
        P0(false, null);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:22:0x0092  */
    /* JADX WARN: Code duplicated, block: B:30:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:32:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:34:0x00eb  */
    public void y1() throws NoWhenBranchMatchedException {
        long jRotateLeft;
        long j;
        if (!u1(this.reader.m())) {
            z1();
            return;
        }
        uub uubVar = this.reader;
        int iO = uubVar.o();
        Object objP = uubVar.p();
        Object objN = uubVar.n();
        int i = this.rGroupIndex;
        if (objP == null) {
            if (objN == null || iO != 207 || Intrinsics.e(objN, d.INSTANCE.a())) {
                jRotateLeft = Long.rotateLeft(Long.rotateLeft(getCompositeKeyHashCode(), 3) ^ ((long) iO), 3);
                j = i;
            } else {
                this.compositeKeyHashCode = Long.rotateLeft(Long.rotateLeft(getCompositeKeyHashCode(), 3) ^ ((long) objN.hashCode()), 3) ^ ((long) i);
            }
            F1(uubVar.O(), null);
            k1();
            uubVar.f();
            if (objP != null) {
                if (objP instanceof Enum) {
                    this.compositeKeyHashCode = Long.rotateRight(Long.rotateRight(getCompositeKeyHashCode() ^ ((long) 0), 3) ^ ((long) ((Enum) objP).ordinal()), 3);
                } else {
                    this.compositeKeyHashCode = Long.rotateRight(Long.rotateRight(getCompositeKeyHashCode() ^ ((long) 0), 3) ^ ((long) objP.hashCode()), 3);
                }
            }
            if (objN == null && iO == 207 && !Intrinsics.e(objN, d.INSTANCE.a())) {
                this.compositeKeyHashCode = Long.rotateRight(Long.rotateRight(getCompositeKeyHashCode() ^ ((long) i), 3) ^ ((long) objN.hashCode()), 3);
                return;
            } else {
                this.compositeKeyHashCode = Long.rotateRight(((long) iO) ^ Long.rotateRight(getCompositeKeyHashCode() ^ ((long) i), 3), 3);
            }
        }
        jRotateLeft = Long.rotateLeft(Long.rotateLeft(getCompositeKeyHashCode(), 3) ^ ((long) (objP instanceof Enum ? ((Enum) objP).ordinal() : objP.hashCode())), 3);
        j = 0;
        this.compositeKeyHashCode = jRotateLeft ^ j;
        F1(uubVar.O(), null);
        k1();
        uubVar.f();
        if (objP != null) {
            if (objN == null) {
            }
            this.compositeKeyHashCode = Long.rotateRight(((long) iO) ^ Long.rotateRight(getCompositeKeyHashCode() ^ ((long) i), 3), 3);
        } else if (objP instanceof Enum) {
            this.compositeKeyHashCode = Long.rotateRight(Long.rotateRight(getCompositeKeyHashCode() ^ ((long) 0), 3) ^ ((long) ((Enum) objP).ordinal()), 3);
        } else {
            this.compositeKeyHashCode = Long.rotateRight(Long.rotateRight(getCompositeKeyHashCode() ^ ((long) 0), 3) ^ ((long) objP.hashCode()), 3);
        }
    }

    @Override // androidx.compose.p004runtime.d
    public void z(qaa scope) {
        b0 b0Var = scope instanceof b0 ? (b0) scope : null;
        if (b0Var != null) {
            b0Var.O(true);
        }
    }
}
