package androidx.compose.p004runtime.snapshots;

import androidx.collection.d;
import com.google.android.qjd;
import com.google.inputmethod.a7c;
import com.google.inputmethod.c7c;
import com.google.inputmethod.cxb;
import com.google.inputmethod.ei9;
import com.google.inputmethod.exb;
import com.google.inputmethod.i79;
import com.google.inputmethod.kwb;
import com.google.inputmethod.l4b;
import com.google.inputmethod.lq1;
import com.google.inputmethod.lwb;
import com.google.inputmethod.m4b;
import com.google.inputmethod.vbd;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.f;
import kotlin.collections.m;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0019\n\u0002\u0010 \n\u0002\b\u0019\b\u0017\u0018\u0000 >2\u00020\u0001:\u0001hBI\b\u0000\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0011\u0010\u000fJ\u000f\u0010\u0012\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0012\u0010\u000fJ\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J?\u0010\u0016\u001a\u00020\u00002\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u00072\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001b\u0010\u000fJ%\u0010\u001c\u001a\u00020\u00012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u0001H\u0010¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u0001H\u0010¢\u0006\u0004\b!\u0010 J\u000f\u0010\"\u001a\u00020\tH\u0010¢\u0006\u0004\b\"\u0010\u000fJ\u000f\u0010#\u001a\u00020\tH\u0010¢\u0006\u0004\b#\u0010\u000fJ\u000f\u0010$\u001a\u00020\tH\u0010¢\u0006\u0004\b$\u0010\u000fJG\u0010-\u001a\u00020\u00182\n\u0010%\u001a\u00060\u0002j\u0002`\u00032\f\u0010(\u001a\b\u0012\u0004\u0012\u00020'0&2\u0014\u0010+\u001a\u0010\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020*\u0018\u00010)2\u0006\u0010,\u001a\u00020\u0005H\u0000¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\tH\u0000¢\u0006\u0004\b/\u0010\u000fJ\u001b\u00101\u001a\u00020\t2\n\u00100\u001a\u00060\u0002j\u0002`\u0003H\u0000¢\u0006\u0004\b1\u00102J\u0017\u00104\u001a\u00020\t2\u0006\u00100\u001a\u000203H\u0000¢\u0006\u0004\b4\u00105J\u0017\u00108\u001a\u00020\t2\u0006\u00107\u001a\u000206H\u0000¢\u0006\u0004\b8\u00109J\u0017\u0010;\u001a\u00020\t2\u0006\u0010:\u001a\u00020\u0005H\u0000¢\u0006\u0004\b;\u0010<J\u0017\u0010>\u001a\u00020\t2\u0006\u0010=\u001a\u00020'H\u0010¢\u0006\u0004\b>\u0010?R(\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u00078\u0010X\u0090\u0004¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR(\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u00078\u0010X\u0090\u0004¢\u0006\f\n\u0004\bD\u0010A\u001a\u0004\bE\u0010CR\"\u0010J\u001a\u0002038\u0010@\u0010X\u0090\u000e¢\u0006\u0012\n\u0004\bF\u0010\u0014\u001a\u0004\bG\u0010H\"\u0004\bI\u00105R*\u0010(\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010&8\u0010@\u0010X\u0090\u000e¢\u0006\u0012\n\u0004\bG\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR*\u0010V\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010P8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bE\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR\"\u0010\\\u001a\u00020\u00058\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bW\u0010X\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010<R\"\u0010a\u001a\u0002068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010]\u001a\u0004\b^\u0010_\"\u0004\b`\u00109R\u0016\u0010:\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\u0014R\"\u0010f\u001a\u00020\u00138\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\"\u0010b\u001a\u0004\bc\u0010\u0015\"\u0004\bd\u0010eR\u0014\u0010g\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bD\u0010\u0015¨\u0006i"}, d2 = {"Landroidx/compose/runtime/snapshots/b;", "Landroidx/compose/runtime/snapshots/g;", "", "Landroidx/compose/runtime/snapshots/SnapshotId;", "snapshotId", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "invalid", "Lkotlin/Function1;", "", "", "readObserver", "writeObserver", "<init>", "(JLandroidx/compose/runtime/snapshots/SnapshotIdSet;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "S", "()V", "T", "A", "O", "", "I", "()Z", "R", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/snapshots/b;", "Landroidx/compose/runtime/snapshots/h;", "C", "()Landroidx/compose/runtime/snapshots/h;", "d", "x", "(Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/snapshots/g;", "snapshot", "m", "(Landroidx/compose/runtime/snapshots/g;)V", "n", "o", "c", "r", "nextId", "Landroidx/collection/d;", "Lcom/google/android/a7c;", "modified", "", "Lcom/google/android/c7c;", "optimisticMerges", "invalidSnapshots", "J", "(JLandroidx/collection/d;Ljava/util/Map;Landroidx/compose/runtime/snapshots/SnapshotIdSet;)Landroidx/compose/runtime/snapshots/h;", "B", "id", "K", "(J)V", "", "M", "(I)V", "", "handles", "N", "([I)V", "snapshots", "L", "(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)V", "state", "p", "(Lcom/google/android/a7c;)V", "g", "Lkotlin/jvm/functions/Function1;", "H", "()Lkotlin/jvm/functions/Function1;", "h", "k", "i", "j", "()I", "w", "writeCount", "Landroidx/collection/d;", "E", "()Landroidx/collection/d;", "Q", "(Landroidx/collection/d;)V", "", "Ljava/util/List;", "getMerged$runtime", "()Ljava/util/List;", "setMerged$runtime", "(Ljava/util/List;)V", "merged", "l", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "F", "()Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "setPreviousIds$runtime", "previousIds", "[I", "G", "()[I", "setPreviousPinnedSnapshots$runtime", "previousPinnedSnapshots", "Z", "D", "P", "(Z)V", "applied", "readOnly", "a", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class b extends g {
    private static final a p = new a(null);
    public static final int q = 8;
    private static final int[] r = new int[0];

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final Function1<Object, Unit> readObserver;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final Function1<Object, Unit> writeObserver;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private int writeCount;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private d<a7c> modified;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private List<? extends a7c> merged;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private SnapshotIdSet previousIds;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private int[] previousPinnedSnapshots;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private int snapshots;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private boolean applied;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/runtime/snapshots/b$a;", "", "<init>", "()V", "", "EmptyIntArray", "[I", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public b(long j, SnapshotIdSet snapshotIdSet, Function1<Object, Unit> function1, Function1<Object, Unit> function2) {
        super(j, snapshotIdSet, null);
        this.readObserver = function1;
        this.writeObserver = function2;
        this.previousIds = SnapshotIdSet.INSTANCE.a();
        this.previousPinnedSnapshots = r;
        this.snapshots = 1;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x007a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x007c A[LOOP:0: B:7:0x001e->B:24:0x007c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:28:0x007f A[EDGE_INSN: B:28:0x007f->B:25:0x007f BREAK  A[LOOP:0: B:7:0x001e->B:24:0x007c], SYNTHETIC] */
    private final void A() {
        d<a7c> dVarE = E();
        if (dVarE != null) {
            S();
            Q(null);
            long snapshotId = getSnapshotId();
            Object[] objArr = dVarE.elements;
            long[] jArr = dVarE.metadata;
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
                                for (c7c firstStateRecord = ((a7c) objArr[(i << 3) + i3]).getFirstStateRecord(); firstStateRecord != null; firstStateRecord = firstStateRecord.getNext()) {
                                    if (firstStateRecord.getSnapshotId() == snapshotId || m.n0(this.previousIds, Long.valueOf(firstStateRecord.getSnapshotId()))) {
                                        firstStateRecord.i(i.b);
                                    }
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
        b();
    }

    private final void O() {
        int length = this.previousPinnedSnapshots.length;
        for (int i = 0; i < length; i++) {
            i.d0(this.previousPinnedSnapshots[i]);
        }
    }

    private final void S() {
        if (this.applied) {
            ei9.b("Unsupported operation on a snapshot that has been applied");
        }
    }

    private final void T() {
        if (!this.applied || ((g) this).pinningTrackingHandle >= 0) {
            return;
        }
        ei9.b("Unsupported operation on a disposed or applied snapshot");
    }

    public final void B() {
        long j;
        K(getSnapshotId());
        Unit unit = Unit.a;
        if (getApplied() || getDisposed()) {
            return;
        }
        long snapshotId = getSnapshotId();
        synchronized (i.M()) {
            long j2 = i.f;
            j = 1;
            i.f += j;
            v(j2);
            i.e = i.e.r(getSnapshotId());
        }
        u(i.C(getInvalid(), snapshotId + j, getSnapshotId()));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX WARN: Code duplicated, block: B:100:0x01d5 A[Catch: all -> 0x018b, LOOP:6: B:90:0x01a9->B:100:0x01d5, LOOP_END, TryCatch #1 {all -> 0x018b, blocks: (B:67:0x0147, B:69:0x0157, B:72:0x0163, B:74:0x016f, B:76:0x0179, B:78:0x017f, B:81:0x018e, B:87:0x019f, B:90:0x01a9, B:92:0x01b3, B:94:0x01bd, B:96:0x01c3, B:97:0x01cd, B:100:0x01d5, B:101:0x01d8, B:103:0x01dc, B:105:0x01e3, B:106:0x01ef, B:84:0x0196), top: B:116:0x0147 }] */
    /* JADX WARN: Code duplicated, block: B:127:0x019d A[EDGE_INSN: B:127:0x019d->B:86:0x019d BREAK  A[LOOP:4: B:72:0x0163->B:84:0x0196], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:132:0x01d8 A[EDGE_INSN: B:132:0x01d8->B:101:0x01d8 BREAK  A[LOOP:6: B:90:0x01a9->B:100:0x01d5], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x0194 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x0196 A[Catch: all -> 0x018b, LOOP:4: B:72:0x0163->B:84:0x0196, LOOP_END, TryCatch #1 {all -> 0x018b, blocks: (B:67:0x0147, B:69:0x0157, B:72:0x0163, B:74:0x016f, B:76:0x0179, B:78:0x017f, B:81:0x018e, B:87:0x019f, B:90:0x01a9, B:92:0x01b3, B:94:0x01bd, B:96:0x01c3, B:97:0x01cd, B:100:0x01d5, B:101:0x01d8, B:103:0x01dc, B:105:0x01e3, B:106:0x01ef, B:84:0x0196), top: B:116:0x0147 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x0199  */
    /* JADX WARN: Code duplicated, block: B:99:0x01d3 A[DONT_INVERT] */
    public h C() throws KotlinNothingValueException {
        Map<c7c, ? extends c7c> mapW;
        List list;
        d<a7c> dVarE;
        long j;
        long j2;
        d<a7c> dVarE2 = E();
        if (dVarE2 != null) {
            androidx.compose.p004runtime.snapshots.a aVar = i.k;
            mapW = i.W(aVar.getSnapshotId(), this, i.e.j(aVar.getSnapshotId()));
        } else {
            mapW = null;
        }
        List listP = m.p();
        synchronized (i.M()) {
            try {
                i.m0(this);
                if (dVarE2 == null || dVarE2.get_size() == 0) {
                    c();
                    androidx.compose.p004runtime.snapshots.a aVar2 = i.k;
                    d<a7c> dVarE3 = aVar2.E();
                    i.f0(aVar2, i.a);
                    if (dVarE3 == null || !dVarE3.e()) {
                        list = listP;
                        dVarE = null;
                    } else {
                        list = i.i;
                        dVarE = dVarE3;
                    }
                } else {
                    androidx.compose.p004runtime.snapshots.a aVar3 = i.k;
                    h hVarJ = J(i.f, dVarE2, mapW, i.e.j(aVar3.getSnapshotId()));
                    if (!Intrinsics.e(hVarJ, h.b.a)) {
                        return hVarJ;
                    }
                    c();
                    dVarE = aVar3.E();
                    i.f0(aVar3, i.a);
                    Q(null);
                    aVar3.Q(null);
                    list = i.i;
                }
                Unit unit = Unit.a;
                this.applied = true;
                if (dVarE != null) {
                    Set setA = m4b.a(dVarE);
                    if (!setA.isEmpty()) {
                        if (lq1.isVerboseTracingEnabled) {
                            Object objA = vbd.a.a("Compose:applyObservers");
                            try {
                                int size = list.size();
                                for (int i = 0; i < size; i++) {
                                    ((Function2) list.get(i)).invoke(setA, this);
                                }
                                Unit unit2 = Unit.a;
                                vbd.a.b(objA);
                            } catch (Throwable th) {
                                vbd.a.b(objA);
                                throw th;
                            }
                        } else {
                            int size2 = list.size();
                            for (int i2 = 0; i2 < size2; i2++) {
                                ((Function2) list.get(i2)).invoke(setA, this);
                            }
                        }
                    }
                }
                if (dVarE2 != null && dVarE2.e()) {
                    Set setA2 = m4b.a(dVarE2);
                    if (lq1.isVerboseTracingEnabled) {
                        Object objA2 = vbd.a.a("Compose:applyObservers");
                        try {
                            int size3 = list.size();
                            for (int i3 = 0; i3 < size3; i3++) {
                                ((Function2) list.get(i3)).invoke(setA2, this);
                            }
                            Unit unit3 = Unit.a;
                            vbd.a.b(objA2);
                        } catch (Throwable th2) {
                            vbd.a.b(objA2);
                            throw th2;
                        }
                    } else {
                        int size4 = list.size();
                        for (int i4 = 0; i4 < size4; i4++) {
                            ((Function2) list.get(i4)).invoke(setA2, this);
                        }
                    }
                }
                exb.d(this, dVarE2);
                synchronized (i.M()) {
                    try {
                        r();
                        i.F();
                        if (dVarE != null) {
                            Object[] objArr = dVarE.elements;
                            long[] jArr = dVarE.metadata;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i5 = 0;
                                j = 128;
                                while (true) {
                                    long j3 = jArr[i5];
                                    j2 = 255;
                                    if ((((~j3) << 7) & j3 & (-9187201950435737472L)) == -9187201950435737472L) {
                                        if (i5 != length) {
                                            break;
                                            break;
                                        }
                                        i5++;
                                    } else {
                                        int i6 = 8 - ((~(i5 - length)) >>> 31);
                                        for (int i7 = 0; i7 < i6; i7++) {
                                            if ((j3 & 255) < 128) {
                                                i.Z((a7c) objArr[(i5 << 3) + i7]);
                                            }
                                            j3 >>= 8;
                                        }
                                        if (i6 != 8) {
                                            break;
                                        }
                                        if (i5 != length) {
                                            break;
                                        }
                                        i5++;
                                    }
                                }
                            } else {
                                j = 128;
                                j2 = 255;
                            }
                        } else {
                            j = 128;
                            j2 = 255;
                        }
                        if (dVarE2 != null) {
                            Object[] objArr2 = dVarE2.elements;
                            long[] jArr2 = dVarE2.metadata;
                            int length2 = jArr2.length - 2;
                            if (length2 >= 0) {
                                int i8 = 0;
                                while (true) {
                                    long j4 = jArr2[i8];
                                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) == -9187201950435737472L) {
                                        if (i8 != length2) {
                                            break;
                                            break;
                                        }
                                        i8++;
                                    } else {
                                        int i9 = 8 - ((~(i8 - length2)) >>> 31);
                                        for (int i10 = 0; i10 < i9; i10++) {
                                            if ((j4 & j2) < j) {
                                                i.Z((a7c) objArr2[(i8 << 3) + i10]);
                                            }
                                            j4 >>= 8;
                                        }
                                        if (i9 != 8) {
                                            break;
                                        }
                                        if (i8 != length2) {
                                            break;
                                        }
                                        i8++;
                                    }
                                }
                            }
                        }
                        List<? extends a7c> list2 = this.merged;
                        if (list2 != null) {
                            int size5 = list2.size();
                            for (int i11 = 0; i11 < size5; i11++) {
                                i.Z(list2.get(i11));
                            }
                        }
                        this.merged = null;
                        Unit unit4 = Unit.a;
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                return h.b.a;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    /* JADX INFO: renamed from: D, reason: from getter */
    public final boolean getApplied() {
        return this.applied;
    }

    public d<a7c> E() {
        return this.modified;
    }

    /* JADX INFO: renamed from: F, reason: from getter */
    public final SnapshotIdSet getPreviousIds() {
        return this.previousIds;
    }

    /* JADX INFO: renamed from: G, reason: from getter */
    public final int[] getPreviousPinnedSnapshots() {
        return this.previousPinnedSnapshots;
    }

    @Override // androidx.compose.p004runtime.snapshots.g
    /* JADX INFO: renamed from: H */
    public Function1<Object, Unit> g() {
        return this.readObserver;
    }

    public boolean I() {
        d<a7c> dVarE = E();
        return dVarE != null && dVarE.e();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final h J(long nextId, d<a7c> modified, Map<c7c, ? extends c7c> optimisticMerges, SnapshotIdSet invalidSnapshots) throws KotlinNothingValueException {
        SnapshotIdSet snapshotIdSet;
        Object[] objArr;
        long[] jArr;
        SnapshotIdSet snapshotIdSet2;
        Object[] objArr2;
        long[] jArr2;
        int i;
        long j;
        int i2;
        c7c c7cVarW;
        SnapshotIdSet snapshotIdSetQ = getInvalid().r(getSnapshotId()).q(this.previousIds);
        Object[] objArr3 = modified.elements;
        long[] jArr3 = modified.metadata;
        int length = jArr3.length - 2;
        ArrayList arrayList = null;
        List<? extends a7c> listA1 = null;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j2 = jArr3[i3];
                List<? extends a7c> arrayList2 = listA1;
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8;
                    int i5 = 8 - ((~(i3 - length)) >>> 31);
                    int i6 = 0;
                    while (i6 < i5) {
                        if ((j2 & 255) < 128) {
                            i = i4;
                            a7c a7cVar = (a7c) objArr3[(i3 << 3) + i6];
                            objArr2 = objArr3;
                            c7c firstStateRecord = a7cVar.getFirstStateRecord();
                            jArr2 = jArr3;
                            ArrayList arrayList3 = arrayList;
                            c7c c7cVarB0 = i.b0(firstStateRecord, nextId, invalidSnapshots);
                            if (c7cVarB0 == null) {
                                j = j2;
                            } else {
                                j = j2;
                                c7c c7cVarB1 = i.b0(firstStateRecord, getSnapshotId(), snapshotIdSetQ);
                                if (c7cVarB1 != null && c7cVarB1.getSnapshotId() != kwb.c(1) && !Intrinsics.e(c7cVarB0, c7cVarB1)) {
                                    i2 = i6;
                                    snapshotIdSet2 = snapshotIdSetQ;
                                    c7c c7cVarB2 = i.b0(firstStateRecord, getSnapshotId(), getInvalid());
                                    if (c7cVarB2 == null) {
                                        i.a0();
                                        throw new KotlinNothingValueException();
                                    }
                                    if (optimisticMerges == null || (c7cVarW = optimisticMerges.get(c7cVarB0)) == null) {
                                        c7cVarW = a7cVar.w(c7cVarB1, c7cVarB0, c7cVarB2);
                                    }
                                    if (c7cVarW == null) {
                                        return new h.a(this);
                                    }
                                    if (!Intrinsics.e(c7cVarW, c7cVarB2)) {
                                        if (Intrinsics.e(c7cVarW, c7cVarB0)) {
                                            ArrayList arrayList4 = arrayList3 == null ? new ArrayList() : arrayList3;
                                            arrayList4.add(qjd.a(a7cVar, c7cVarB0.e(getSnapshotId())));
                                            if (arrayList2 == null) {
                                                arrayList2 = new ArrayList<>();
                                            }
                                            List<? extends a7c> list = arrayList2;
                                            list.add(a7cVar);
                                            arrayList = arrayList4;
                                            arrayList2 = list;
                                        } else {
                                            arrayList = arrayList3 == null ? new ArrayList() : arrayList3;
                                            arrayList.add(!Intrinsics.e(c7cVarW, c7cVarB1) ? qjd.a(a7cVar, c7cVarW) : qjd.a(a7cVar, c7cVarB1.e(getSnapshotId())));
                                        }
                                    }
                                }
                                arrayList = arrayList3;
                            }
                            snapshotIdSet2 = snapshotIdSetQ;
                            i2 = i6;
                            arrayList = arrayList3;
                        } else {
                            snapshotIdSet2 = snapshotIdSetQ;
                            objArr2 = objArr3;
                            jArr2 = jArr3;
                            i = i4;
                            j = j2;
                            i2 = i6;
                        }
                        j2 = j >> i;
                        i6 = i2 + 1;
                        objArr3 = objArr2;
                        i4 = i;
                        jArr3 = jArr2;
                        snapshotIdSetQ = snapshotIdSet2;
                    }
                    snapshotIdSet = snapshotIdSetQ;
                    objArr = objArr3;
                    jArr = jArr3;
                    ArrayList arrayList5 = arrayList;
                    if (i5 != i4) {
                        listA1 = arrayList2;
                        arrayList = arrayList5;
                        break;
                    }
                    arrayList = arrayList5;
                } else {
                    snapshotIdSet = snapshotIdSetQ;
                    objArr = objArr3;
                    jArr = jArr3;
                }
                listA1 = arrayList2;
                if (i3 == length) {
                    break;
                }
                i3++;
                objArr3 = objArr;
                jArr3 = jArr;
                snapshotIdSetQ = snapshotIdSet;
            }
        }
        if (arrayList != null) {
            B();
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                Pair pair = (Pair) arrayList.get(i7);
                a7c a7cVar2 = (a7c) pair.a();
                c7c c7cVar = (c7c) pair.b();
                c7cVar.i(nextId);
                synchronized (i.M()) {
                    c7cVar.h(a7cVar2.getFirstStateRecord());
                    a7cVar2.x(c7cVar);
                    Unit unit = Unit.a;
                }
            }
        }
        if (listA1 != null) {
            int size2 = listA1.size();
            for (int i8 = 0; i8 < size2; i8++) {
                modified.y(listA1.get(i8));
            }
            List<? extends a7c> list2 = this.merged;
            if (list2 != null) {
                listA1 = m.a1(list2, listA1);
            }
            this.merged = listA1;
        }
        return h.b.a;
    }

    public final void K(long id) {
        synchronized (i.M()) {
            this.previousIds = this.previousIds.r(id);
            Unit unit = Unit.a;
        }
    }

    public final void L(SnapshotIdSet snapshots) {
        synchronized (i.M()) {
            this.previousIds = this.previousIds.q(snapshots);
            Unit unit = Unit.a;
        }
    }

    public final void M(int id) {
        if (id >= 0) {
            this.previousPinnedSnapshots = f.K(this.previousPinnedSnapshots, id);
        }
    }

    public final void N(int[] handles) {
        if (handles.length == 0) {
            return;
        }
        int[] iArr = this.previousPinnedSnapshots;
        if (iArr.length != 0) {
            handles = f.L(iArr, handles);
        }
        this.previousPinnedSnapshots = handles;
    }

    public final void P(boolean z) {
        this.applied = z;
    }

    public void Q(d<a7c> dVar) {
        this.modified = dVar;
    }

    public b R(Function1<Object, Unit> readObserver, Function1<Object, Unit> writeObserver) {
        Map map;
        long j;
        c cVar;
        z();
        T();
        i79 i79Var = exb.a;
        Function1<Object, Unit> function1 = readObserver;
        Function1<Object, Unit> function1B = writeObserver;
        if (i79Var != null) {
            Pair<lwb, Map<cxb, lwb>> pairF = exb.f(i79Var, this, false, function1, function1B);
            lwb lwbVar = (lwb) pairF.c();
            Function1<Object, Unit> function1A = lwbVar.a();
            function1B = lwbVar.b();
            map = (Map) pairF.d();
            function1 = function1A;
        } else {
            map = null;
        }
        K(getSnapshotId());
        synchronized (i.M()) {
            long j2 = i.f;
            j = 1;
            i.f += j;
            i.e = i.e.r(j2);
            SnapshotIdSet invalid = getInvalid();
            u(invalid.r(j2));
            cVar = new c(j2, i.C(invalid, getSnapshotId() + j, j2), i.O(function1, g(), false, 4, null), i.Q(function1B, k()), this);
        }
        if (!getApplied() && !getDisposed()) {
            long snapshotId = getSnapshotId();
            synchronized (i.M()) {
                long j3 = i.f;
                i.f += j;
                v(j3);
                i.e = i.e.r(getSnapshotId());
                Unit unit = Unit.a;
            }
            u(i.C(getInvalid(), snapshotId + j, getSnapshotId()));
        }
        if (i79Var != null) {
            exb.c(i79Var, this, cVar, map);
        }
        return cVar;
    }

    @Override // androidx.compose.p004runtime.snapshots.g
    public void c() {
        i.e = i.e.j(getSnapshotId()).i(this.previousIds);
    }

    @Override // androidx.compose.p004runtime.snapshots.g
    public void d() {
        if (getDisposed()) {
            return;
        }
        super.d();
        n(this);
        exb.e(this);
    }

    @Override // androidx.compose.p004runtime.snapshots.g
    public boolean h() {
        return false;
    }

    @Override // androidx.compose.p004runtime.snapshots.g
    /* JADX INFO: renamed from: j, reason: from getter */
    public int getWriteCount() {
        return this.writeCount;
    }

    @Override // androidx.compose.p004runtime.snapshots.g
    public Function1<Object, Unit> k() {
        return this.writeObserver;
    }

    @Override // androidx.compose.p004runtime.snapshots.g
    public void m(g snapshot) {
        this.snapshots++;
    }

    @Override // androidx.compose.p004runtime.snapshots.g
    public void n(g snapshot) {
        if (!(this.snapshots > 0)) {
            ei9.a("no pending nested snapshots");
        }
        int i = this.snapshots - 1;
        this.snapshots = i;
        if (i != 0 || this.applied) {
            return;
        }
        A();
    }

    @Override // androidx.compose.p004runtime.snapshots.g
    public void o() {
        if (this.applied || getDisposed()) {
            return;
        }
        B();
    }

    @Override // androidx.compose.p004runtime.snapshots.g
    public void p(a7c state) {
        d<a7c> dVarE = E();
        if (dVarE == null) {
            dVarE = l4b.b();
            Q(dVarE);
        }
        dVarE.h(state);
    }

    @Override // androidx.compose.p004runtime.snapshots.g
    public void r() {
        O();
        super.r();
    }

    @Override // androidx.compose.p004runtime.snapshots.g
    public void w(int i) {
        this.writeCount = i;
    }

    @Override // androidx.compose.p004runtime.snapshots.g
    public g x(Function1<Object, Unit> readObserver) {
        Map map;
        long j;
        d dVar;
        z();
        T();
        long snapshotId = getSnapshotId();
        b bVar = this instanceof androidx.compose.p004runtime.snapshots.a ? null : this;
        i79 i79Var = exb.a;
        Function1<Object, Unit> function1 = readObserver;
        if (i79Var != null) {
            Pair<lwb, Map<cxb, lwb>> pairF = exb.f(i79Var, bVar, true, function1, null);
            lwb lwbVar = (lwb) pairF.c();
            Function1<Object, Unit> function1A = lwbVar.a();
            lwbVar.b();
            map = (Map) pairF.d();
            function1 = function1A;
        } else {
            map = null;
        }
        K(getSnapshotId());
        synchronized (i.M()) {
            long j2 = i.f;
            j = 1;
            i.f += j;
            i.e = i.e.r(j2);
            dVar = new d(j2, i.C(getInvalid(), snapshotId + j, j2), i.O(function1, g(), false, 4, null), this);
        }
        if (!getApplied() && !getDisposed()) {
            long snapshotId2 = getSnapshotId();
            synchronized (i.M()) {
                long j3 = i.f;
                i.f += j;
                v(j3);
                i.e = i.e.r(getSnapshotId());
                Unit unit = Unit.a;
            }
            u(i.C(getInvalid(), snapshotId2 + j, getSnapshotId()));
        }
        if (i79Var != null) {
            exb.c(i79Var, bVar, dVar, map);
        }
        return dVar;
    }
}
