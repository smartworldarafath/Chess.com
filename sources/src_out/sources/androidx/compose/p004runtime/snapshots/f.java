package androidx.compose.p004runtime.snapshots;

import com.google.inputmethod.a7c;
import com.google.inputmethod.cxb;
import com.google.inputmethod.exb;
import com.google.inputmethod.i79;
import com.google.inputmethod.lwb;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B3\b\u0000\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\r\u001a\u00020\u00012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\tH\u0010¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0001H\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0001H\u0010¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u0016H\u0010¢\u0006\u0004\b\u0018\u0010\u0019R(\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u00078\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010$\u001a\u00020\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010#R\"\u0010&\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u00078PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\u001d¨\u0006'"}, d2 = {"Landroidx/compose/runtime/snapshots/f;", "Landroidx/compose/runtime/snapshots/g;", "", "Landroidx/compose/runtime/snapshots/SnapshotId;", "snapshotId", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "invalid", "Lkotlin/Function1;", "", "", "readObserver", "<init>", "(JLandroidx/compose/runtime/snapshots/SnapshotIdSet;Lkotlin/jvm/functions/Function1;)V", "x", "(Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/snapshots/g;", "o", "()V", "d", "snapshot", "m", "(Landroidx/compose/runtime/snapshots/g;)V", "n", "Lcom/google/android/a7c;", "state", "p", "(Lcom/google/android/a7c;)V", "g", "Lkotlin/jvm/functions/Function1;", "A", "()Lkotlin/jvm/functions/Function1;", "", "h", "I", "snapshots", "", "()Z", "readOnly", "k", "writeObserver", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f extends g {

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final Function1<Object, Unit> readObserver;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private int snapshots;

    public f(long j, SnapshotIdSet snapshotIdSet, Function1<Object, Unit> function1) {
        super(j, snapshotIdSet, null);
        this.readObserver = function1;
        this.snapshots = 1;
    }

    @Override // androidx.compose.p004runtime.snapshots.g
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public Function1<Object, Unit> g() {
        return this.readObserver;
    }

    @Override // androidx.compose.p004runtime.snapshots.g
    public void d() {
        if (getDisposed()) {
            return;
        }
        n(this);
        super.d();
        exb.e(this);
    }

    @Override // androidx.compose.p004runtime.snapshots.g
    public boolean h() {
        return true;
    }

    @Override // androidx.compose.p004runtime.snapshots.g
    public Function1<Object, Unit> k() {
        return null;
    }

    @Override // androidx.compose.p004runtime.snapshots.g
    public void m(g snapshot) {
        this.snapshots++;
    }

    @Override // androidx.compose.p004runtime.snapshots.g
    public void n(g snapshot) {
        int i = this.snapshots - 1;
        this.snapshots = i;
        if (i == 0) {
            b();
        }
    }

    @Override // androidx.compose.p004runtime.snapshots.g
    public void o() {
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    @Override // androidx.compose.p004runtime.snapshots.g
    public void p(a7c state) throws KotlinNothingValueException {
        i.e0();
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.p004runtime.snapshots.g
    public g x(Function1<Object, Unit> readObserver) {
        Map map;
        i.m0(this);
        i79 i79Var = exb.a;
        if (i79Var != null) {
            Pair<lwb, Map<cxb, lwb>> pairF = exb.f(i79Var, this, true, readObserver, null);
            lwb lwbVar = (lwb) pairF.c();
            Function1<Object, Unit> function1A = lwbVar.a();
            lwbVar.b();
            map = (Map) pairF.d();
            readObserver = function1A;
        } else {
            map = null;
        }
        d dVar = new d(getSnapshotId(), getInvalid(), i.O(readObserver, g(), false, 4, null), this);
        if (i79Var != null) {
            exb.c(i79Var, this, dVar, map);
        }
        return dVar;
    }
}
