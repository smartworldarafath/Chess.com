package androidx.compose.p004runtime.snapshots;

import androidx.collection.d;
import com.google.inputmethod.a7c;
import com.google.inputmethod.c7c;
import com.google.inputmethod.exb;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001BO\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007\u0012\u0006\u0010\f\u001a\u00020\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\f\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Landroidx/compose/runtime/snapshots/c;", "Landroidx/compose/runtime/snapshots/b;", "", "Landroidx/compose/runtime/snapshots/SnapshotId;", "snapshotId", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "invalid", "Lkotlin/Function1;", "", "", "readObserver", "writeObserver", "parent", "<init>", "(JLandroidx/compose/runtime/snapshots/SnapshotIdSet;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/snapshots/b;)V", "U", "()V", "d", "Landroidx/compose/runtime/snapshots/h;", "C", "()Landroidx/compose/runtime/snapshots/h;", "s", "Landroidx/compose/runtime/snapshots/b;", "getParent", "()Landroidx/compose/runtime/snapshots/b;", "", "t", "Z", "deactivated", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c extends b {

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private final b parent;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private boolean deactivated;

    public c(long j, SnapshotIdSet snapshotIdSet, Function1<Object, Unit> function1, Function1<Object, Unit> function2, b bVar) {
        super(j, snapshotIdSet, function1, function2);
        this.parent = bVar;
        bVar.m(this);
    }

    private final void U() {
        if (this.deactivated) {
            return;
        }
        this.deactivated = true;
        this.parent.n(this);
    }

    @Override // androidx.compose.p004runtime.snapshots.b
    public h C() throws Throwable {
        c cVar;
        if (this.parent.getApplied() || this.parent.getDisposed()) {
            return new h.a(this);
        }
        d<a7c> dVarE = E();
        long snapshotId = getSnapshotId();
        Map<c7c, ? extends c7c> mapW = dVarE != null ? i.W(this.parent.getSnapshotId(), this, this.parent.getInvalid()) : null;
        synchronized (i.M()) {
            try {
                i.m0(this);
                try {
                    if (dVarE == null || dVarE.get_size() == 0) {
                        cVar = this;
                        b();
                        Unit unit = Unit.a;
                    } else {
                        cVar = this;
                        h hVarJ = cVar.J(this.parent.getSnapshotId(), dVarE, mapW, this.parent.getInvalid());
                        if (!Intrinsics.e(hVarJ, h.b.a)) {
                            return hVarJ;
                        }
                        d<a7c> dVarE2 = cVar.parent.E();
                        if (dVarE2 != null) {
                            dVarE2.i(dVarE);
                        } else {
                            cVar.parent.Q(dVarE);
                            Q(null);
                        }
                    }
                    if (Intrinsics.j(cVar.parent.getSnapshotId(), snapshotId) < 0) {
                        cVar.parent.B();
                    }
                    b bVar = cVar.parent;
                    bVar.u(bVar.getInvalid().j(snapshotId).i(getPreviousIds()));
                    cVar.parent.K(snapshotId);
                    cVar.parent.M(y());
                    cVar.parent.L(getPreviousIds());
                    cVar.parent.N(getPreviousPinnedSnapshots());
                    Unit unit2 = Unit.a;
                    P(true);
                    U();
                    exb.d(this, dVarE);
                    return h.b.a;
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    @Override // androidx.compose.p004runtime.snapshots.b, androidx.compose.p004runtime.snapshots.g
    public void d() {
        if (getDisposed()) {
            return;
        }
        super.d();
        U();
    }
}
