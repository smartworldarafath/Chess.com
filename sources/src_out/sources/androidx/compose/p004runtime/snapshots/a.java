package androidx.compose.p004runtime.snapshots;

import androidx.compose.p004runtime.snapshots.a;
import com.google.inputmethod.cxb;
import com.google.inputmethod.exb;
import com.google.inputmethod.i79;
import com.google.inputmethod.lwb;
import com.google.inputmethod.lxb;
import java.util.List;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u001b\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\u000e\u001a\u00020\r2\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ;\u0010\u0011\u001a\u00020\u00012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t2\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000bH\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\rH\u0010¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\rH\u0010¢\u0006\u0004\b\u0019\u0010\u0018J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001d\u0010\u0014¨\u0006\u001e"}, d2 = {"Landroidx/compose/runtime/snapshots/a;", "Landroidx/compose/runtime/snapshots/b;", "", "Landroidx/compose/runtime/snapshots/SnapshotId;", "snapshotId", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "invalid", "<init>", "(JLandroidx/compose/runtime/snapshots/SnapshotIdSet;)V", "Lkotlin/Function1;", "", "", "readObserver", "Landroidx/compose/runtime/snapshots/g;", "x", "(Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/snapshots/g;", "writeObserver", "R", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/snapshots/b;", "o", "()V", "snapshot", "", "X", "(Landroidx/compose/runtime/snapshots/g;)Ljava/lang/Void;", "W", "Landroidx/compose/runtime/snapshots/h;", "C", "()Landroidx/compose/runtime/snapshots/h;", "d", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a extends androidx.compose.p004runtime.snapshots.b {

    /* JADX INFO: renamed from: androidx.compose.runtime.snapshots.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class C0048a implements Function1<SnapshotIdSet, androidx.compose.p004runtime.snapshots.b> {
        final /* synthetic */ Function1<Object, Unit> a;
        final /* synthetic */ Function1<Object, Unit> b;

        C0048a(Function1<Object, Unit> function1, Function1<Object, Unit> function2) {
            this.a = function1;
            this.b = function2;
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final androidx.compose.p004runtime.snapshots.b invoke(SnapshotIdSet snapshotIdSet) {
            long j;
            synchronized (i.M()) {
                j = i.f;
                i.f += (long) 1;
            }
            return new androidx.compose.p004runtime.snapshots.b(j, snapshotIdSet, this.a, this.b);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements Function1<SnapshotIdSet, f> {
        final /* synthetic */ Function1<Object, Unit> a;

        b(Function1<Object, Unit> function1) {
            this.a = function1;
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final f invoke(SnapshotIdSet snapshotIdSet) {
            long j;
            synchronized (i.M()) {
                j = i.f;
                i.f += (long) 1;
            }
            return new f(j, snapshotIdSet, this.a);
        }
    }

    public a(long j, SnapshotIdSet snapshotIdSet) {
        super(j, snapshotIdSet, null, new Function1() { // from class: com.google.android.gz4
            public final Object invoke(Object obj) {
                return a.V(obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit V(Object obj) {
        synchronized (i.M()) {
            List list = i.j;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((Function1) list.get(i)).invoke(obj);
            }
        }
        return Unit.a;
    }

    @Override // androidx.compose.p004runtime.snapshots.b
    public h C() {
        throw new IllegalStateException("Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot");
    }

    @Override // androidx.compose.p004runtime.snapshots.b
    public androidx.compose.p004runtime.snapshots.b R(Function1<Object, Unit> readObserver, Function1<Object, Unit> writeObserver) {
        Function1<Object, Unit> function1;
        Map map;
        i79 i79Var = exb.a;
        if (i79Var != null) {
            Pair<lwb, Map<cxb, lwb>> pairF = exb.f(i79Var, null, false, readObserver, writeObserver);
            lwb lwbVar = (lwb) pairF.c();
            Function1<Object, Unit> function1A = lwbVar.a();
            Function1<Object, Unit> function1B = lwbVar.b();
            map = (Map) pairF.d();
            readObserver = function1A;
            function1 = function1B;
        } else {
            function1 = writeObserver;
            map = null;
        }
        androidx.compose.p004runtime.snapshots.b bVar = (androidx.compose.p004runtime.snapshots.b) i.g0(new C0048a(readObserver, function1));
        if (i79Var != null) {
            exb.c(i79Var, null, bVar, map);
        }
        return bVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    @Override // androidx.compose.p004runtime.snapshots.b, androidx.compose.p004runtime.snapshots.g
    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    public Void m(g snapshot) throws KotlinNothingValueException {
        lxb.b();
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    @Override // androidx.compose.p004runtime.snapshots.b, androidx.compose.p004runtime.snapshots.g
    /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
    public Void n(g snapshot) throws KotlinNothingValueException {
        lxb.b();
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.p004runtime.snapshots.b, androidx.compose.p004runtime.snapshots.g
    public void d() {
        synchronized (i.M()) {
            q();
            Unit unit = Unit.a;
        }
    }

    @Override // androidx.compose.p004runtime.snapshots.b, androidx.compose.p004runtime.snapshots.g
    public void o() {
        i.E();
    }

    @Override // androidx.compose.p004runtime.snapshots.b, androidx.compose.p004runtime.snapshots.g
    public g x(Function1<Object, Unit> readObserver) {
        Map map;
        i79 i79Var = exb.a;
        if (i79Var != null) {
            Pair<lwb, Map<cxb, lwb>> pairF = exb.f(i79Var, null, true, readObserver, null);
            lwb lwbVar = (lwb) pairF.c();
            Function1<Object, Unit> function1A = lwbVar.a();
            lwbVar.b();
            map = (Map) pairF.d();
            readObserver = function1A;
        } else {
            map = null;
        }
        f fVar = (f) i.g0(new b(readObserver));
        if (i79Var != null) {
            exb.c(i79Var, null, fVar, map);
        }
        return fVar;
    }
}
