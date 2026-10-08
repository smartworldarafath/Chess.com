package androidx.compose.p004runtime.snapshots;

import androidx.compose.p004runtime.snapshots.g;
import com.google.inputmethod.a7c;
import com.google.inputmethod.ei9;
import com.google.inputmethod.nn8;
import com.google.inputmethod.q1d;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.m;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 22\u00020\u0001:\u0001$B\u001d\b\u0004\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u000e\u001a\u00020\u00002\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t\u0018\u00010\fH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u0011\u0010\u0010\u001a\u0004\u0018\u00010\u0000H\u0011¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0013\u001a\u00020\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0000H\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0000H ¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0000H ¢\u0006\u0004\b\u0016\u0010\u0014J\u0017\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0017H ¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\tH ¢\u0006\u0004\b\u001b\u0010\u000bJ\u000f\u0010\u001c\u001a\u00020\tH\u0000¢\u0006\u0004\b\u001c\u0010\u000bJ\u000f\u0010\u001d\u001a\u00020\tH\u0010¢\u0006\u0004\b\u001d\u0010\u000bJ\u000f\u0010\u001e\u001a\u00020\tH\u0010¢\u0006\u0004\b\u001e\u0010\u000bJ\u000f\u0010\u001f\u001a\u00020\tH\u0000¢\u0006\u0004\b\u001f\u0010\u000bJ\u000f\u0010 \u001a\u00020\tH\u0000¢\u0006\u0004\b \u0010\u000bJ\u000f\u0010\"\u001a\u00020!H\u0000¢\u0006\u0004\b\"\u0010#R\"\u0010\u0006\u001a\u00020\u00058\u0010@\u0010X\u0090\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R2\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\n\u0010*\u001a\u00060\u0002j\u0002`\u00038\u0016@PX\u0096\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\"\u00106\u001a\u0002008\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001d\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u001c\u00109\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b\n\u00107\u0012\u0004\b8\u0010\u000bR$\u0010=\u001a\u00020!2\u0006\u0010*\u001a\u00020!8P@PX\u0090\u000e¢\u0006\f\u001a\u0004\b:\u0010#\"\u0004\b;\u0010<R\u0014\u0010?\u001a\u0002008&X¦\u0004¢\u0006\u0006\u001a\u0004\b>\u00103R(\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t\u0018\u00010\f8 X¡\u0004¢\u0006\f\u0012\u0004\bB\u0010\u000b\u001a\u0004\b@\u0010AR\"\u0010D\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t\u0018\u00010\f8 X \u0004¢\u0006\u0006\u001a\u0004\bC\u0010A\u0082\u0001\u0004EFGH¨\u0006I"}, d2 = {"Landroidx/compose/runtime/snapshots/g;", "", "", "Landroidx/compose/runtime/snapshots/SnapshotId;", "snapshotId", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "invalid", "<init>", "(JLandroidx/compose/runtime/snapshots/SnapshotIdSet;)V", "", "d", "()V", "Lkotlin/Function1;", "readObserver", "x", "(Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/snapshots/g;", "l", "()Landroidx/compose/runtime/snapshots/g;", "snapshot", "s", "(Landroidx/compose/runtime/snapshots/g;)V", "m", "n", "Lcom/google/android/a7c;", "state", "p", "(Lcom/google/android/a7c;)V", "o", "b", "c", "r", "z", "q", "", "y", "()I", "a", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "f", "()Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "u", "(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)V", "value", "J", "i", "()J", "v", "(J)V", "", "Z", "e", "()Z", "t", "(Z)V", "disposed", "I", "getPinningTrackingHandle$annotations", "pinningTrackingHandle", "j", "w", "(I)V", "writeCount", "h", "readOnly", "g", "()Lkotlin/jvm/functions/Function1;", "getReadObserver$annotations", "k", "writeObserver", "Landroidx/compose/runtime/snapshots/b;", "Landroidx/compose/runtime/snapshots/d;", "Landroidx/compose/runtime/snapshots/f;", "Landroidx/compose/runtime/snapshots/l;", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class g {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int f = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private SnapshotIdSet invalid;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private long snapshotId;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private boolean disposed;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private int pinningTrackingHandle;

    /* JADX INFO: renamed from: androidx.compose.runtime.snapshots.g$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\b\u001a\u00020\u00072\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ=\u0010\f\u001a\u00020\u000b2\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\f\u0010\rJQ\u0010\u0011\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000e2\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0014\u001a\u00020\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u0007H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J7\u0010\u0018\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0016\u001a\u00020\u00072\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J-\u0010\u001d\u001a\u00020\u001c2\u001e\u0010\u0017\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u001b\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00050\u001a¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010\u001f\u001a\u00020\u001c2\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\u0005¢\u0006\u0004\b!\u0010\u0003J\r\u0010\"\u001a\u00020\u0005¢\u0006\u0004\b\"\u0010\u0003R\u0011\u0010%\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b#\u0010$R\u001c\u0010(\u001a\u0004\u0018\u00010\u00078@X\u0081\u0004¢\u0006\f\u0012\u0004\b'\u0010\u0003\u001a\u0004\b&\u0010$¨\u0006)"}, d2 = {"Landroidx/compose/runtime/snapshots/g$a;", "", "<init>", "()V", "Lkotlin/Function1;", "", "readObserver", "Landroidx/compose/runtime/snapshots/g;", "p", "(Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/snapshots/g;", "writeObserver", "Landroidx/compose/runtime/snapshots/b;", "n", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/snapshots/b;", "T", "Lkotlin/Function0;", "block", "g", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "previous", "e", "(Landroidx/compose/runtime/snapshots/g;)Landroidx/compose/runtime/snapshots/g;", "nonObservable", "observer", "l", "(Landroidx/compose/runtime/snapshots/g;Landroidx/compose/runtime/snapshots/g;Lkotlin/jvm/functions/Function1;)V", "Lkotlin/Function2;", "", "Lcom/google/android/nn8;", "h", "(Lkotlin/jvm/functions/Function2;)Lcom/google/android/nn8;", "j", "(Lkotlin/jvm/functions/Function1;)Lcom/google/android/nn8;", "f", "m", "c", "()Landroidx/compose/runtime/snapshots/g;", "current", "d", "getCurrentThreadSnapshot$annotations", "currentThreadSnapshot", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void i(Function2 function2) {
            synchronized (i.M()) {
                i.i = m.X0(i.i, function2);
                Unit unit = Unit.a;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void k(Function1 function1) {
            synchronized (i.M()) {
                i.j = m.X0(i.j, function1);
                Unit unit = Unit.a;
            }
            i.E();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ b o(Companion companion, Function1 function1, Function1 function2, int i, Object obj) {
            if ((i & 1) != 0) {
                function1 = null;
            }
            if ((i & 2) != 0) {
                function2 = null;
            }
            return companion.n(function1, function2);
        }

        public final g c() {
            return i.K();
        }

        public final g d() {
            return (g) i.c.a();
        }

        public final g e(g previous) {
            if (previous instanceof k) {
                k kVar = (k) previous;
                if (kVar.getThreadId() == q1d.a()) {
                    kVar.Y(null);
                    return previous;
                }
            }
            if (previous instanceof l) {
                l lVar = (l) previous;
                if (lVar.C() == q1d.a()) {
                    lVar.F(null);
                    return previous;
                }
            }
            g gVarH = i.H(previous, null, false, 6, null);
            gVarH.l();
            return gVarH;
        }

        public final void f() {
            i.K().o();
        }

        public final <T> T g(Function1<Object, Unit> readObserver, Function1<Object, Unit> writeObserver, Function0<? extends T> block) {
            g kVar;
            if (readObserver == null && writeObserver == null) {
                return (T) block.invoke();
            }
            g gVar = (g) i.c.a();
            if (gVar instanceof k) {
                k kVar2 = (k) gVar;
                if (kVar2.getThreadId() == q1d.a()) {
                    Function1<Object, Unit> function1H = kVar2.g();
                    Function1<Object, Unit> function1K = kVar2.k();
                    try {
                        ((k) gVar).Y(i.O(readObserver, function1H, false, 4, null));
                        ((k) gVar).Z(i.Q(writeObserver, function1K));
                        return (T) block.invoke();
                    } finally {
                        kVar2.Y(function1H);
                        kVar2.Z(function1K);
                    }
                }
            }
            if (gVar == null || (gVar instanceof b)) {
                kVar = new k(gVar instanceof b ? (b) gVar : null, readObserver, writeObserver, true, false);
            } else {
                if (readObserver == null) {
                    return (T) block.invoke();
                }
                kVar = gVar.x(readObserver);
            }
            try {
                g gVarL = kVar.l();
                try {
                    T t = (T) block.invoke();
                    kVar.s(gVarL);
                    kVar.d();
                    return t;
                } catch (Throwable th) {
                    kVar.s(gVarL);
                    throw th;
                }
            } catch (Throwable th2) {
                kVar.d();
                throw th2;
            }
        }

        public final nn8 h(final Function2<? super Set<? extends Object>, ? super g, Unit> observer) {
            i.D(i.a);
            synchronized (i.M()) {
                i.i = m.b1(i.i, observer);
                Unit unit = Unit.a;
            }
            return new nn8() { // from class: com.google.android.fwb
                @Override // com.google.inputmethod.nn8
                public final void dispose() {
                    g.Companion.i(observer);
                }
            };
        }

        public final nn8 j(final Function1<Object, Unit> observer) {
            synchronized (i.M()) {
                i.j = m.b1(i.j, observer);
                Unit unit = Unit.a;
            }
            i.E();
            return new nn8() { // from class: com.google.android.ewb
                @Override // com.google.inputmethod.nn8
                public final void dispose() {
                    g.Companion.k(observer);
                }
            };
        }

        public final void l(g previous, g nonObservable, Function1<Object, Unit> observer) {
            if (previous != nonObservable) {
                nonObservable.s(previous);
                nonObservable.d();
            } else if (previous instanceof k) {
                ((k) previous).Y(observer);
            } else {
                if (previous instanceof l) {
                    ((l) previous).F(observer);
                    return;
                }
                throw new IllegalStateException(("Non-transparent snapshot was reused: " + previous).toString());
            }
        }

        public final void m() {
            boolean zI;
            synchronized (i.M()) {
                zI = i.k.I();
            }
            if (zI) {
                i.E();
            }
        }

        public final b n(Function1<Object, Unit> readObserver, Function1<Object, Unit> writeObserver) {
            b bVarR;
            g gVarK = i.K();
            b bVar = gVarK instanceof b ? (b) gVarK : null;
            if (bVar == null || (bVarR = bVar.R(readObserver, writeObserver)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            return bVarR;
        }

        public final g p(Function1<Object, Unit> readObserver) {
            return i.K().x(readObserver);
        }

        private Companion() {
        }
    }

    public /* synthetic */ g(long j, SnapshotIdSet snapshotIdSet, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, snapshotIdSet);
    }

    public final void b() {
        synchronized (i.M()) {
            c();
            r();
            Unit unit = Unit.a;
        }
    }

    public void c() {
        i.e = i.e.j(getSnapshotId());
    }

    public void d() {
        this.disposed = true;
        synchronized (i.M()) {
            q();
            Unit unit = Unit.a;
        }
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getDisposed() {
        return this.disposed;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public SnapshotIdSet getInvalid() {
        return this.invalid;
    }

    public abstract Function1<Object, Unit> g();

    public abstract boolean h();

    /* JADX INFO: renamed from: i, reason: from getter */
    public long getSnapshotId() {
        return this.snapshotId;
    }

    public int j() {
        return 0;
    }

    public abstract Function1<Object, Unit> k();

    public g l() {
        g gVar = (g) i.c.a();
        i.c.b(this);
        return gVar;
    }

    public abstract void m(g snapshot);

    public abstract void n(g snapshot);

    public abstract void o();

    public abstract void p(a7c state);

    public final void q() {
        int i = this.pinningTrackingHandle;
        if (i >= 0) {
            i.d0(i);
            this.pinningTrackingHandle = -1;
        }
    }

    public void r() {
        q();
    }

    public void s(g snapshot) {
        i.c.b(snapshot);
    }

    public final void t(boolean z) {
        this.disposed = z;
    }

    public void u(SnapshotIdSet snapshotIdSet) {
        this.invalid = snapshotIdSet;
    }

    public void v(long j) {
        this.snapshotId = j;
    }

    public void w(int i) {
        throw new IllegalStateException("Updating write count is not supported for this snapshot");
    }

    public abstract g x(Function1<Object, Unit> readObserver);

    public final int y() {
        int i = this.pinningTrackingHandle;
        this.pinningTrackingHandle = -1;
        return i;
    }

    public final void z() {
        if (this.disposed) {
            ei9.a("Cannot use a disposed snapshot");
        }
    }

    private g(long j, SnapshotIdSet snapshotIdSet) {
        this.invalid = snapshotIdSet;
        this.snapshotId = j;
        this.pinningTrackingHandle = j != i.b ? i.i0(j, getInvalid()) : -1;
    }
}
