package androidx.compose.p004runtime.snapshots;

import com.google.inputmethod.a7c;
import com.google.inputmethod.cxb;
import com.google.inputmethod.exb;
import com.google.inputmethod.i79;
import com.google.inputmethod.lwb;
import com.google.inputmethod.lxb;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B9\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0001¢\u0006\u0004\b\f\u0010\rJ%\u0010\u000e\u001a\u00020\u00002\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\tH\u0010¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0010¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0001H\u0010¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0001H\u0010¢\u0006\u0004\b\u001b\u0010\u001aR(\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u00078\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u000b\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0014\u0010&\u001a\u00020$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010%R\"\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u00078PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b'\u0010\u001f¨\u0006)"}, d2 = {"Landroidx/compose/runtime/snapshots/d;", "Landroidx/compose/runtime/snapshots/g;", "", "Landroidx/compose/runtime/snapshots/SnapshotId;", "snapshotId", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "invalid", "Lkotlin/Function1;", "", "", "readObserver", "parent", "<init>", "(JLandroidx/compose/runtime/snapshots/SnapshotIdSet;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/snapshots/g;)V", "F", "(Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/snapshots/d;", "o", "()V", "d", "Lcom/google/android/a7c;", "state", "", "E", "(Lcom/google/android/a7c;)Ljava/lang/Void;", "snapshot", "D", "(Landroidx/compose/runtime/snapshots/g;)Ljava/lang/Void;", "C", "g", "Lkotlin/jvm/functions/Function1;", "B", "()Lkotlin/jvm/functions/Function1;", "h", "Landroidx/compose/runtime/snapshots/g;", "A", "()Landroidx/compose/runtime/snapshots/g;", "", "()Z", "readOnly", "k", "writeObserver", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d extends g {

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final Function1<Object, Unit> readObserver;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final g parent;

    public d(long j, SnapshotIdSet snapshotIdSet, Function1<Object, Unit> function1, g gVar) {
        super(j, snapshotIdSet, null);
        this.readObserver = function1;
        this.parent = gVar;
        gVar.m(this);
    }

    /* JADX INFO: renamed from: A, reason: from getter */
    public final g getParent() {
        return this.parent;
    }

    @Override // androidx.compose.p004runtime.snapshots.g
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public Function1<Object, Unit> g() {
        return this.readObserver;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    @Override // androidx.compose.p004runtime.snapshots.g
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public Void m(g snapshot) throws KotlinNothingValueException {
        lxb.b();
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    @Override // androidx.compose.p004runtime.snapshots.g
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public Void n(g snapshot) throws KotlinNothingValueException {
        lxb.b();
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    @Override // androidx.compose.p004runtime.snapshots.g
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public Void p(a7c state) throws KotlinNothingValueException {
        i.e0();
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.p004runtime.snapshots.g
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public d x(Function1<Object, Unit> readObserver) {
        Map map;
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
        d dVar = new d(getSnapshotId(), getInvalid(), i.O(readObserver, g(), false, 4, null), getParent());
        if (i79Var != null) {
            exb.c(i79Var, this, dVar, map);
        }
        return dVar;
    }

    @Override // androidx.compose.p004runtime.snapshots.g
    public void d() {
        if (getDisposed()) {
            return;
        }
        if (getSnapshotId() != this.parent.getSnapshotId()) {
            b();
        }
        this.parent.n(this);
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
    public void o() {
    }
}
