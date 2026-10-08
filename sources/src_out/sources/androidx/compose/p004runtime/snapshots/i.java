package androidx.compose.p004runtime.snapshots;

import androidx.collection.d;
import androidx.compose.p004runtime.p005internal.AtomicInt;
import androidx.compose.p004runtime.snapshots.SnapshotIdSet;
import androidx.compose.p004runtime.snapshots.i;
import com.google.inputmethod.a7c;
import com.google.inputmethod.c7c;
import com.google.inputmethod.fee;
import com.google.inputmethod.gwb;
import com.google.inputmethod.kwb;
import com.google.inputmethod.lq1;
import com.google.inputmethod.m4b;
import com.google.inputmethod.pxb;
import com.google.inputmethod.rxb;
import com.google.inputmethod.vbd;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.m;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a#\u0010\u0006\u001a\u00020\u00052\n\u0010\u0002\u001a\u00060\u0000j\u0002`\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u000f\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a;\u0010\u0015\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\f2\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\t\u0018\u00010\u00102\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001aS\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\t\u0018\u00010\u00102\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\t\u0018\u00010\u00102\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\t\u0018\u00010\u00102\b\b\u0002\u0010\u0018\u001a\u00020\u0013H\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001aI\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\t\u0018\u00010\u00102\u0014\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\t\u0018\u00010\u00102\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\t\u0018\u00010\u0010H\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a1\u0010\"\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u001e2\u0006\u0010 \u001a\u00020\u001f2\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u0010H\u0002¢\u0006\u0004\b\"\u0010#\u001a)\u0010$\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u001e2\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u0010H\u0002¢\u0006\u0004\b$\u0010%\u001a\u000f\u0010&\u001a\u00020\tH\u0002¢\u0006\u0004\b&\u0010'\u001a-\u0010(\u001a\u00028\u0000\"\b\b\u0000\u0010\u001e*\u00020\f2\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u0010H\u0002¢\u0006\u0004\b(\u0010)\u001a\u0017\u0010+\u001a\u00020\t2\u0006\u0010*\u001a\u00020\fH\u0002¢\u0006\u0004\b+\u0010,\u001a/\u0010/\u001a\u00020\u00132\n\u0010-\u001a\u00060\u0000j\u0002`\u00012\n\u0010.\u001a\u00060\u0000j\u0002`\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b/\u00100\u001a+\u00103\u001a\u00020\u00132\u0006\u00102\u001a\u0002012\n\u0010*\u001a\u00060\u0000j\u0002`\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b3\u00104\u001a7\u00107\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u001e*\u0002012\u0006\u00105\u001a\u00028\u00002\n\u00106\u001a\u00060\u0000j\u0002`\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b7\u00108\u001a#\u0010;\u001a\u00028\u0000\"\b\b\u0000\u0010\u001e*\u000201*\u00028\u00002\u0006\u0010:\u001a\u000209¢\u0006\u0004\b;\u0010<\u001a\u000f\u0010>\u001a\u00020=H\u0002¢\u0006\u0004\b>\u0010?\u001a\u0019\u0010@\u001a\u0004\u0018\u0001012\u0006\u0010:\u001a\u000209H\u0002¢\u0006\u0004\b@\u0010A\u001a\u0017\u0010B\u001a\u00020\u00132\u0006\u0010:\u001a\u000209H\u0002¢\u0006\u0004\bB\u0010C\u001a\u000f\u0010D\u001a\u00020\tH\u0002¢\u0006\u0004\bD\u0010'\u001a\u0017\u0010E\u001a\u00020\t2\u0006\u0010:\u001a\u000209H\u0002¢\u0006\u0004\bE\u0010F\u001a-\u0010G\u001a\u00028\u0000\"\b\b\u0000\u0010\u001e*\u000201*\u00028\u00002\u0006\u0010:\u001a\u0002092\u0006\u0010*\u001a\u00020\fH\u0001¢\u0006\u0004\bG\u0010H\u001a5\u0010J\u001a\u00028\u0000\"\b\b\u0000\u0010\u001e*\u000201*\u00028\u00002\u0006\u0010:\u001a\u0002092\u0006\u0010*\u001a\u00020\f2\u0006\u0010I\u001a\u00028\u0000H\u0000¢\u0006\u0004\bJ\u0010K\u001a-\u0010\u001e\u001a\u00028\u0000\"\b\b\u0000\u0010\u001e*\u000201*\u00028\u00002\u0006\u0010:\u001a\u0002092\u0006\u0010*\u001a\u00020\fH\u0000¢\u0006\u0004\b\u001e\u0010H\u001a-\u0010L\u001a\u00028\u0000\"\b\b\u0000\u0010\u001e*\u000201*\u00028\u00002\u0006\u0010:\u001a\u0002092\u0006\u0010*\u001a\u00020\fH\u0002¢\u0006\u0004\bL\u0010H\u001a%\u0010M\u001a\u00028\u0000\"\b\b\u0000\u0010\u001e*\u000201*\u00028\u00002\u0006\u0010:\u001a\u000209H\u0000¢\u0006\u0004\bM\u0010<\u001a\u001f\u0010N\u001a\u00020\t2\u0006\u0010*\u001a\u00020\f2\u0006\u0010:\u001a\u000209H\u0001¢\u0006\u0004\bN\u0010O\u001a9\u0010U\u001a\u0010\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u000201\u0018\u00010T2\n\u0010P\u001a\u00060\u0000j\u0002`\u00012\u0006\u0010R\u001a\u00020Q2\u0006\u0010S\u001a\u00020\u0003H\u0002¢\u0006\u0004\bU\u0010V\u001a\u000f\u0010W\u001a\u00020=H\u0002¢\u0006\u0004\bW\u0010?\u001a)\u0010X\u001a\u00028\u0000\"\b\b\u0000\u0010\u001e*\u0002012\u0006\u00105\u001a\u00028\u00002\u0006\u0010*\u001a\u00020\fH\u0001¢\u0006\u0004\bX\u0010Y\u001a!\u0010Z\u001a\u00028\u0000\"\b\b\u0000\u0010\u001e*\u0002012\u0006\u00105\u001a\u00028\u0000H\u0001¢\u0006\u0004\bZ\u0010[\u001a+\u0010^\u001a\u00020\u0003*\u00020\u00032\n\u0010\\\u001a\u00060\u0000j\u0002`\u00012\n\u0010]\u001a\u00060\u0000j\u0002`\u0001H\u0000¢\u0006\u0004\b^\u0010_\" \u0010b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010a\"\u0018\u0010d\u001a\u00060\u0000j\u0002`\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010X\"\u001a\u0010h\u001a\b\u0012\u0004\u0012\u00020\f0e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010g\"$\u0010o\u001a\u00060\u0011j\u0002`i8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bj\u0010k\u0012\u0004\bn\u0010'\u001a\u0004\bl\u0010m\"\u0016\u0010r\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bp\u0010q\"\u001a\u0010t\u001a\u00060\u0000j\u0002`\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bs\u0010X\"\u0014\u0010x\u001a\u00020u8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bv\u0010w\"\u001a\u0010|\u001a\b\u0012\u0004\u0012\u0002090y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bz\u0010{\"7\u0010\u0082\u0001\u001a \u0012\u001c\u0012\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u007f\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\t0~0}8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0080\u0001\u0010\u0081\u0001\"+\u0010\u0084\u0001\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\t0\u00100}8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0083\u0001\u0010\u0081\u0001\"\u0016\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0086\u0001\"%\u0010\u008b\u0001\u001a\u00020\f8\u0000X\u0081\u0004¢\u0006\u0016\n\u0006\b\u0087\u0001\u0010\u0088\u0001\u0012\u0005\b\u008a\u0001\u0010'\u001a\u0005\b\u0089\u0001\u0010\u000e\"\u001a\u0010\u008f\u0001\u001a\u00030\u008c\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u008e\u0001¨\u0006\u0090\u0001"}, d2 = {"", "Landroidx/compose/runtime/snapshots/SnapshotId;", "snapshotId", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "invalid", "", "i0", "(JLandroidx/compose/runtime/snapshots/SnapshotIdSet;)I", "handle", "", "d0", "(I)V", "Landroidx/compose/runtime/snapshots/g;", "K", "()Landroidx/compose/runtime/snapshots/g;", "previousSnapshot", "Lkotlin/Function1;", "", "readObserver", "", "ownsPreviousSnapshot", "G", "(Landroidx/compose/runtime/snapshots/g;Lkotlin/jvm/functions/Function1;Z)Landroidx/compose/runtime/snapshots/g;", "parentObserver", "mergeReadObserver", "N", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Z)Lkotlin/jvm/functions/Function1;", "writeObserver", "Q", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function1;", "T", "Landroidx/compose/runtime/snapshots/a;", "globalSnapshot", "block", "f0", "(Landroidx/compose/runtime/snapshots/a;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "D", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "E", "()V", "g0", "(Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/snapshots/g;", "snapshot", "m0", "(Landroidx/compose/runtime/snapshots/g;)V", "currentSnapshot", "candidateSnapshot", "k0", "(JJLandroidx/compose/runtime/snapshots/SnapshotIdSet;)Z", "Lcom/google/android/c7c;", "data", "l0", "(Lcom/google/android/c7c;JLandroidx/compose/runtime/snapshots/SnapshotIdSet;)Z", "r", "id", "b0", "(Lcom/google/android/c7c;JLandroidx/compose/runtime/snapshots/SnapshotIdSet;)Lcom/google/android/c7c;", "Lcom/google/android/a7c;", "state", "c0", "(Lcom/google/android/c7c;Lcom/google/android/a7c;)Lcom/google/android/c7c;", "", "a0", "()Ljava/lang/Void;", "j0", "(Lcom/google/android/a7c;)Lcom/google/android/c7c;", "Y", "(Lcom/google/android/a7c;)Z", "F", "Z", "(Lcom/google/android/a7c;)V", "n0", "(Lcom/google/android/c7c;Lcom/google/android/a7c;Landroidx/compose/runtime/snapshots/g;)Lcom/google/android/c7c;", "candidate", "X", "(Lcom/google/android/c7c;Lcom/google/android/a7c;Landroidx/compose/runtime/snapshots/g;Lcom/google/android/c7c;)Lcom/google/android/c7c;", "U", "S", "V", "(Landroidx/compose/runtime/snapshots/g;Lcom/google/android/a7c;)V", "currentSnapshotId", "Landroidx/compose/runtime/snapshots/b;", "applyingSnapshot", "invalidSnapshots", "", "W", "(JLandroidx/compose/runtime/snapshots/b;Landroidx/compose/runtime/snapshots/SnapshotIdSet;)Ljava/util/Map;", "e0", "J", "(Lcom/google/android/c7c;Landroidx/compose/runtime/snapshots/g;)Lcom/google/android/c7c;", "I", "(Lcom/google/android/c7c;)Lcom/google/android/c7c;", "from", "until", "C", "(Landroidx/compose/runtime/snapshots/SnapshotIdSet;JJ)Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "a", "Lkotlin/jvm/functions/Function1;", "emptyLambda", "b", "INVALID_SNAPSHOT", "Lcom/google/android/pxb;", "c", "Lcom/google/android/pxb;", "threadSnapshot", "Landroidx/compose/runtime/platform/SynchronizedObject;", "d", "Ljava/lang/Object;", "M", "()Ljava/lang/Object;", "getLock$annotations", "lock", "e", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "openSnapshots", "f", "nextSnapshotId", "Lcom/google/android/gwb;", "g", "Lcom/google/android/gwb;", "pinningTable", "Lcom/google/android/rxb;", "h", "Lcom/google/android/rxb;", "extraStateObjects", "", "Lkotlin/Function2;", "", "i", "Ljava/util/List;", "applyObservers", "j", "globalWriteObservers", "k", "Landroidx/compose/runtime/snapshots/a;", "l", "Landroidx/compose/runtime/snapshots/g;", "getSnapshotInitializer", "getSnapshotInitializer$annotations", "snapshotInitializer", "Landroidx/compose/runtime/internal/AtomicInt;", "m", "Landroidx/compose/runtime/internal/AtomicInt;", "pendingApplyObserverCount", "runtime"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class i {
    private static final long b = 0;
    private static SnapshotIdSet e;
    private static long f;
    private static final gwb g;
    private static final rxb<a7c> h;
    private static List<? extends Function2<? super Set<? extends Object>, ? super g, Unit>> i;
    private static List<? extends Function1<Object, Unit>> j;
    private static final a k;
    private static final g l;
    private static AtomicInt m;
    private static final Function1<SnapshotIdSet, Unit> a = new Function1() { // from class: com.google.android.pwb
        public final Object invoke(Object obj) {
            return i.L((SnapshotIdSet) obj);
        }
    };
    private static final pxb<g> c = new pxb<>();
    private static final Object d = new Object();

    static {
        SnapshotIdSet.Companion aVar = SnapshotIdSet.INSTANCE;
        e = aVar.a();
        long j2 = 1;
        f = kwb.c(1) + j2;
        g = new gwb();
        h = new rxb<>();
        i = m.p();
        j = m.p();
        long j3 = f;
        f = j2 + j3;
        a aVar2 = new a(j3, aVar.a());
        e = e.r(aVar2.getSnapshotId());
        k = aVar2;
        l = aVar2;
        m = new AtomicInt(0);
    }

    public static final SnapshotIdSet C(SnapshotIdSet snapshotIdSet, long j2, long j3) {
        while (Intrinsics.j(j2, j3) < 0) {
            snapshotIdSet = snapshotIdSet.r(j2);
            j2 += (long) 1;
        }
        return snapshotIdSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:53:0x00c2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x00c4 A[Catch: all -> 0x00ba, LOOP:2: B:42:0x008a->B:54:0x00c4, LOOP_END, TryCatch #2 {all -> 0x00ba, blocks: (B:37:0x007b, B:39:0x0080, B:42:0x008a, B:44:0x009a, B:46:0x00a6, B:48:0x00af, B:51:0x00bc, B:54:0x00c4, B:55:0x00c7), top: B:66:0x007b }] */
    /* JADX WARN: Code duplicated, block: B:72:0x00c7 A[EDGE_INSN: B:72:0x00c7->B:55:0x00c7 BREAK  A[LOOP:2: B:42:0x008a->B:54:0x00c4], SYNTHETIC] */
    public static final <T> T D(Function1<? super SnapshotIdSet, ? extends T> function1) {
        d<a7c> dVarE;
        T t;
        a aVar = k;
        synchronized (M()) {
            try {
                dVarE = aVar.E();
                if (dVarE != null) {
                    m.a(1);
                }
                t = (T) f0(aVar, function1);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (dVarE != null) {
            try {
                List<? extends Function2<? super Set<? extends Object>, ? super g, Unit>> list = i;
                Set setA = m4b.a(dVarE);
                if (lq1.isVerboseTracingEnabled) {
                    Object objA = vbd.a.a("Compose:applyObservers");
                    try {
                        int size = list.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            list.get(i2).invoke(setA, aVar);
                        }
                        Unit unit = Unit.a;
                        vbd.a.b(objA);
                    } catch (Throwable th2) {
                        vbd.a.b(objA);
                        throw th2;
                    }
                } else {
                    int size2 = list.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        list.get(i3).invoke(setA, aVar);
                    }
                }
                m.a(-1);
            } catch (Throwable th3) {
                m.a(-1);
                throw th3;
            }
        }
        synchronized (M()) {
            try {
                F();
                if (dVarE != null) {
                    Object[] objArr = dVarE.elements;
                    long[] jArr = dVarE.metadata;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i4 = 0;
                        while (true) {
                            long j2 = jArr[i4];
                            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) == -9187201950435737472L) {
                                if (i4 != length) {
                                    break;
                                    break;
                                }
                                i4++;
                            } else {
                                int i5 = 8 - ((~(i4 - length)) >>> 31);
                                for (int i6 = 0; i6 < i5; i6++) {
                                    if ((255 & j2) < 128) {
                                        Z((a7c) objArr[(i4 << 3) + i6]);
                                    }
                                    j2 >>= 8;
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
                    Unit unit2 = Unit.a;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E() {
        D(a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F() {
        rxb<a7c> rxbVar = h;
        int size = rxbVar.getSize();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            fee<a7c> feeVar = rxbVar.f()[i2];
            a7c a7cVar = feeVar != null ? feeVar.get() : null;
            if (a7cVar != null && Y(a7cVar)) {
                if (i3 != i2) {
                    rxbVar.f()[i3] = feeVar;
                    rxbVar.getHashes()[i3] = rxbVar.getHashes()[i2];
                }
                i3++;
            }
            i2++;
        }
        for (int i4 = i3; i4 < size; i4++) {
            rxbVar.f()[i4] = null;
            rxbVar.getHashes()[i4] = 0;
        }
        if (i3 != size) {
            rxbVar.g(i3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g G(g gVar, Function1<Object, Unit> function1, boolean z) {
        boolean z2 = gVar instanceof b;
        if (z2 || gVar == null) {
            return new k(z2 ? (b) gVar : null, function1, null, false, z);
        }
        return new l(gVar, function1, false, z);
    }

    static /* synthetic */ g H(g gVar, Function1 function1, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            function1 = null;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return G(gVar, function1, z);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public static final <T extends c7c> T I(T t) throws KotlinNothingValueException {
        T t2;
        g.Companion companion = g.INSTANCE;
        g gVarC = companion.c();
        T t3 = (T) b0(t, gVarC.getSnapshotId(), gVarC.getInvalid());
        if (t3 != null) {
            return t3;
        }
        synchronized (M()) {
            g gVarC2 = companion.c();
            t2 = (T) b0(t, gVarC2.getSnapshotId(), gVarC2.getInvalid());
        }
        if (t2 != null) {
            return t2;
        }
        a0();
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public static final <T extends c7c> T J(T t, g gVar) throws KotlinNothingValueException {
        T t2;
        T t3 = (T) b0(t, gVar.getSnapshotId(), gVar.getInvalid());
        if (t3 != null) {
            return t3;
        }
        synchronized (M()) {
            t2 = (T) b0(t, gVar.getSnapshotId(), gVar.getInvalid());
        }
        if (t2 != null) {
            return t2;
        }
        a0();
        throw new KotlinNothingValueException();
    }

    public static final g K() {
        g gVarA = c.a();
        return gVarA == null ? k : gVarA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit L(SnapshotIdSet snapshotIdSet) {
        return Unit.a;
    }

    public static final Object M() {
        return d;
    }

    public static final Function1<Object, Unit> N(final Function1<Object, Unit> function1, final Function1<Object, Unit> function2, boolean z) {
        if (!z) {
            function2 = null;
        }
        if (function1 == null || function2 == null || function1 == function2) {
            return function1 == null ? function2 : function1;
        }
        return new Function1() { // from class: com.google.android.owb
            public final Object invoke(Object obj) {
                return i.P(function1, function2, obj);
            }
        };
    }

    public static /* synthetic */ Function1 O(Function1 function1, Function1 function2, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = true;
        }
        return N(function1, function2, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit P(Function1 function1, Function1 function2, Object obj) {
        function1.invoke(obj);
        function2.invoke(obj);
        return Unit.a;
    }

    public static final Function1<Object, Unit> Q(final Function1<Object, Unit> function1, final Function1<Object, Unit> function2) {
        if (function1 == null || function2 == null || function1 == function2) {
            return function1 == null ? function2 : function1;
        }
        return new Function1() { // from class: com.google.android.qwb
            public final Object invoke(Object obj) {
                return i.R(function1, function2, obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit R(Function1 function1, Function1 function2, Object obj) {
        function1.invoke(obj);
        function2.invoke(obj);
        return Unit.a;
    }

    public static final <T extends c7c> T S(T t, a7c a7cVar) {
        T t2 = (T) j0(a7cVar);
        if (t2 != null) {
            t2.i(Long.MAX_VALUE);
            return t2;
        }
        T t3 = (T) t.e(Long.MAX_VALUE);
        t3.h(a7cVar.getFirstStateRecord());
        Intrinsics.h(t3, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.newOverwritableRecordLocked");
        a7cVar.x(t3);
        Intrinsics.h(t3, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.newOverwritableRecordLocked");
        return t3;
    }

    public static final <T extends c7c> T T(T t, a7c a7cVar, g gVar) {
        T t2;
        synchronized (M()) {
            t2 = (T) U(t, a7cVar, gVar);
        }
        return t2;
    }

    private static final <T extends c7c> T U(T t, a7c a7cVar, g gVar) {
        T t2 = (T) S(t, a7cVar);
        t2.c(t);
        t2.i(gVar.getSnapshotId());
        return t2;
    }

    public static final void V(g gVar, a7c a7cVar) {
        gVar.w(gVar.getWriteCount() + 1);
        Function1<Object, Unit> function1K = gVar.k();
        if (function1K != null) {
            function1K.invoke(a7cVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public static final Map<c7c, c7c> W(long j2, b bVar, SnapshotIdSet snapshotIdSet) throws KotlinNothingValueException {
        long[] jArr;
        Map<c7c, c7c> map;
        SnapshotIdSet snapshotIdSet2;
        Object[] objArr;
        int i2;
        long[] jArr2;
        Map<c7c, c7c> map2;
        Object[] objArr2;
        int i3;
        int i4;
        d<a7c> dVarE = bVar.E();
        Map<c7c, c7c> map3 = null;
        if (dVarE == null) {
            return null;
        }
        long snapshotId = bVar.getSnapshotId();
        SnapshotIdSet snapshotIdSetQ = bVar.getInvalid().r(snapshotId).q(bVar.getPreviousIds());
        Object[] objArr3 = dVarE.elements;
        long[] jArr3 = dVarE.metadata;
        int length = jArr3.length - 2;
        if (length < 0) {
            return null;
        }
        HashMap map4 = null;
        int i5 = 0;
        while (true) {
            long j3 = jArr3[i5];
            if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i6 = 8;
                int i7 = 8 - ((~(i5 - length)) >>> 31);
                int i8 = 0;
                while (i8 < i7) {
                    if ((255 & j3) < 128) {
                        a7c a7cVar = (a7c) objArr3[(i5 << 3) + i8];
                        map2 = map3;
                        c7c c7cVarT = a7cVar.getFirstStateRecord();
                        jArr2 = jArr3;
                        i3 = i5;
                        i4 = i6;
                        c7c c7cVarB0 = b0(c7cVarT, j2, snapshotIdSet);
                        if (c7cVarB0 == null) {
                            objArr2 = objArr3;
                        } else {
                            objArr2 = objArr3;
                            c7c c7cVarB1 = b0(c7cVarT, snapshotId, snapshotIdSetQ);
                            if (c7cVarB1 != null && !Intrinsics.e(c7cVarB0, c7cVarB1)) {
                                c7c c7cVarB2 = b0(c7cVarT, snapshotId, bVar.getInvalid());
                                if (c7cVarB2 == null) {
                                    a0();
                                    throw new KotlinNothingValueException();
                                }
                                c7c c7cVarW = a7cVar.w(c7cVarB1, c7cVarB0, c7cVarB2);
                                if (c7cVarW == null) {
                                    return map2;
                                }
                                if (map4 == null) {
                                    map4 = new HashMap();
                                }
                                map4.put(c7cVarB0, c7cVarW);
                                map4 = map4;
                            }
                        }
                    } else {
                        jArr2 = jArr3;
                        map2 = map3;
                        objArr2 = objArr3;
                        i3 = i5;
                        i4 = i6;
                    }
                    j3 >>= i4;
                    i8++;
                    map3 = map2;
                    i5 = i3;
                    i6 = i4;
                    jArr3 = jArr2;
                    objArr3 = objArr2;
                    snapshotIdSetQ = snapshotIdSetQ;
                }
                jArr = jArr3;
                map = map3;
                snapshotIdSet2 = snapshotIdSetQ;
                objArr = objArr3;
                i2 = i5;
                if (i7 != i6) {
                    return map4;
                }
            } else {
                jArr = jArr3;
                map = map3;
                snapshotIdSet2 = snapshotIdSetQ;
                objArr = objArr3;
                i2 = i5;
            }
            int i9 = i2;
            if (i9 == length) {
                return map4;
            }
            i5 = i9 + 1;
            map3 = map;
            jArr3 = jArr;
            objArr3 = objArr;
            snapshotIdSetQ = snapshotIdSet2;
        }
    }

    public static final <T extends c7c> T X(T t, a7c a7cVar, g gVar, T t2) {
        T t3;
        if (gVar.h()) {
            gVar.p(a7cVar);
        }
        long snapshotId = gVar.getSnapshotId();
        if (t2.getSnapshotId() == snapshotId) {
            return t2;
        }
        synchronized (M()) {
            t3 = (T) S(t, a7cVar);
        }
        t3.i(snapshotId);
        if (t2.getSnapshotId() != kwb.c(1)) {
            gVar.p(a7cVar);
        }
        return t3;
    }

    private static final boolean Y(a7c a7cVar) {
        c7c c7cVar;
        long jE = g.e(f);
        c7c c7cVar2 = null;
        c7c c7cVarT = null;
        int i2 = 0;
        for (c7c c7cVarT2 = a7cVar.getFirstStateRecord(); c7cVarT2 != null; c7cVarT2 = c7cVarT2.getNext()) {
            long jG = c7cVarT2.getSnapshotId();
            if (jG != b) {
                if (Intrinsics.j(jG, jE) >= 0) {
                    i2++;
                } else if (c7cVar2 == null) {
                    i2++;
                    c7cVar2 = c7cVarT2;
                } else {
                    if (Intrinsics.j(c7cVarT2.getSnapshotId(), c7cVar2.getSnapshotId()) < 0) {
                        c7cVar = c7cVar2;
                        c7cVar2 = c7cVarT2;
                    } else {
                        c7cVar = c7cVarT2;
                    }
                    if (c7cVarT == null) {
                        c7cVarT = a7cVar.getFirstStateRecord();
                        c7c c7cVar3 = c7cVarT;
                        while (true) {
                            if (c7cVarT == null) {
                                c7cVarT = c7cVar3;
                                break;
                            }
                            if (Intrinsics.j(c7cVarT.getSnapshotId(), jE) >= 0) {
                                break;
                            }
                            if (Intrinsics.j(c7cVar3.getSnapshotId(), c7cVarT.getSnapshotId()) < 0) {
                                c7cVar3 = c7cVarT;
                            }
                            c7cVarT = c7cVarT.getNext();
                        }
                    }
                    c7cVar2.i(b);
                    c7cVar2.c(c7cVarT);
                    c7cVar2 = c7cVar;
                }
            }
        }
        return i2 > 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Z(a7c a7cVar) {
        if (Y(a7cVar)) {
            h.a(a7cVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void a0() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends c7c> T b0(T t, long j2, SnapshotIdSet snapshotIdSet) {
        T t2 = null;
        while (t != null) {
            if (l0(t, j2, snapshotIdSet) && (t2 == null || Intrinsics.j(t2.getSnapshotId(), t.getSnapshotId()) < 0)) {
                t2 = t;
            }
            t = (T) t.getNext();
        }
        if (t2 != null) {
            return t2;
        }
        return null;
    }

    public static final <T extends c7c> T c0(T t, a7c a7cVar) {
        T t2;
        g.Companion companion = g.INSTANCE;
        g gVarC = companion.c();
        Function1<Object, Unit> function1G = gVarC.g();
        if (function1G != null) {
            function1G.invoke(a7cVar);
        }
        T t3 = (T) b0(t, gVarC.getSnapshotId(), gVarC.getInvalid());
        if (t3 != null) {
            return t3;
        }
        synchronized (M()) {
            g gVarC2 = companion.c();
            c7c c7cVarT = a7cVar.getFirstStateRecord();
            Intrinsics.h(c7cVarT, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.readable");
            t2 = (T) b0(c7cVarT, gVarC2.getSnapshotId(), gVarC2.getInvalid());
            if (t2 == null) {
                a0();
                throw new KotlinNothingValueException();
            }
        }
        return t2;
    }

    public static final void d0(int i2) {
        g.f(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void e0() {
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> T f0(a aVar, Function1<? super SnapshotIdSet, ? extends T> function1) {
        long snapshotId = aVar.getSnapshotId();
        T t = (T) function1.invoke(e.j(snapshotId));
        long j2 = f;
        f = ((long) 1) + j2;
        e = e.j(snapshotId);
        aVar.v(j2);
        aVar.u(e);
        aVar.w(0);
        aVar.Q(null);
        aVar.q();
        e = e.r(j2);
        return t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends g> T g0(final Function1<? super SnapshotIdSet, ? extends T> function1) {
        return (T) D(new Function1() { // from class: com.google.android.rwb
            public final Object invoke(Object obj) {
                return i.h0(function1, (SnapshotIdSet) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g h0(Function1 function1, SnapshotIdSet snapshotIdSet) {
        g gVar = (g) function1.invoke(snapshotIdSet);
        synchronized (M()) {
            e = e.r(gVar.getSnapshotId());
            Unit unit = Unit.a;
        }
        return gVar;
    }

    public static final int i0(long j2, SnapshotIdSet snapshotIdSet) {
        int iA;
        long jO = snapshotIdSet.o(j2);
        synchronized (M()) {
            iA = g.a(jO);
        }
        return iA;
    }

    private static final c7c j0(a7c a7cVar) {
        long jE = g.e(f) - ((long) 1);
        SnapshotIdSet snapshotIdSetA = SnapshotIdSet.INSTANCE.a();
        c7c c7cVar = null;
        for (c7c c7cVarT = a7cVar.getFirstStateRecord(); c7cVarT != null; c7cVarT = c7cVarT.getNext()) {
            if (c7cVarT.getSnapshotId() != b) {
                if (l0(c7cVarT, jE, snapshotIdSetA)) {
                    if (c7cVar == null) {
                        c7cVar = c7cVarT;
                    } else if (Intrinsics.j(c7cVarT.getSnapshotId(), c7cVar.getSnapshotId()) >= 0) {
                        return c7cVar;
                    }
                }
            }
            return c7cVarT;
        }
        return null;
    }

    private static final boolean k0(long j2, long j3, SnapshotIdSet snapshotIdSet) {
        return (j3 == b || Intrinsics.j(j3, j2) > 0 || snapshotIdSet.n(j3)) ? false : true;
    }

    private static final boolean l0(c7c c7cVar, long j2, SnapshotIdSet snapshotIdSet) {
        return k0(j2, c7cVar.getSnapshotId(), snapshotIdSet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m0(g gVar) {
        long jE;
        if (e.n(gVar.getSnapshotId())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Snapshot is not open: snapshotId=");
        sb.append(gVar.getSnapshotId());
        sb.append(", disposed=");
        sb.append(gVar.getDisposed());
        sb.append(", applied=");
        b bVar = gVar instanceof b ? (b) gVar : null;
        sb.append(bVar != null ? Boolean.valueOf(bVar.getApplied()) : "read-only");
        sb.append(", lowestPin=");
        synchronized (M()) {
            jE = g.e(-1L);
        }
        sb.append(jE);
        throw new IllegalStateException(sb.toString().toString());
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public static final <T extends c7c> T n0(T t, a7c a7cVar, g gVar) throws KotlinNothingValueException {
        T t2;
        if (gVar.h()) {
            gVar.p(a7cVar);
        }
        long snapshotId = gVar.getSnapshotId();
        T t3 = (T) b0(t, snapshotId, gVar.getInvalid());
        if (t3 == null) {
            a0();
            throw new KotlinNothingValueException();
        }
        if (t3.getSnapshotId() == gVar.getSnapshotId()) {
            return t3;
        }
        synchronized (M()) {
            t2 = (T) b0(a7cVar.getFirstStateRecord(), snapshotId, gVar.getInvalid());
            if (t2 == null) {
                a0();
                throw new KotlinNothingValueException();
            }
            if (t2.getSnapshotId() != snapshotId) {
                t2 = (T) U(t2, a7cVar, gVar);
            }
        }
        Intrinsics.h(t2, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.writableRecord");
        if (t3.getSnapshotId() != kwb.c(1)) {
            gVar.p(a7cVar);
        }
        return t2;
    }
}
