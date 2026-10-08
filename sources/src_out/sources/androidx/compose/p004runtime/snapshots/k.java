package androidx.compose.p004runtime.snapshots;

import androidx.collection.d;
import com.google.inputmethod.a7c;
import com.google.inputmethod.lxb;
import com.google.inputmethod.q1d;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0001\n\u0002\b\u0010\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001BM\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0012H\u0010¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u0018\u001a\u00020\u00172\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J;\u0010\u001b\u001a\u00020\u00012\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00032\u0014\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0005H\u0010¢\u0006\u0004\b\u001d\u0010\u000eJ\u0017\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u0017H\u0010¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u0017H\u0010¢\u0006\u0004\b\"\u0010!R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010&R0\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00038\u0010@\u0010X\u0090\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R0\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00038\u0010@\u0010X\u0090\u000e¢\u0006\u0012\n\u0004\b.\u0010)\u001a\u0004\b/\u0010+\"\u0004\b&\u0010-R\u001a\u00104\u001a\u0002008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0018\u00101\u001a\u0004\b2\u00103R\u0014\u00107\u001a\u00020\u00018BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b5\u00106R,\u0010<\u001a\u000600j\u0002`82\n\u00109\u001a\u000600j\u0002`88V@PX\u0096\u000e¢\u0006\f\u001a\u0004\b:\u00103\"\u0004\b(\u0010;R$\u0010A\u001a\u00020=2\u0006\u00109\u001a\u00020=8P@PX\u0090\u000e¢\u0006\f\u001a\u0004\b>\u0010?\"\u0004\b'\u0010@R4\u0010G\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010B2\u000e\u00109\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010B8P@PX\u0090\u000e¢\u0006\f\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR$\u0010L\u001a\u00020H2\u0006\u00109\u001a\u00020H8P@PX\u0090\u000e¢\u0006\f\u001a\u0004\bI\u0010J\"\u0004\b.\u0010KR\u0014\u0010O\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bM\u0010N¨\u0006P"}, d2 = {"Landroidx/compose/runtime/snapshots/k;", "Landroidx/compose/runtime/snapshots/b;", "parentSnapshot", "Lkotlin/Function1;", "", "", "specifiedReadObserver", "specifiedWriteObserver", "", "mergeParentObservers", "ownsParentSnapshot", "<init>", "(Landroidx/compose/runtime/snapshots/b;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZZ)V", "d", "()V", "Landroidx/compose/runtime/snapshots/h;", "C", "()Landroidx/compose/runtime/snapshots/h;", "Lcom/google/android/a7c;", "state", "p", "(Lcom/google/android/a7c;)V", "readObserver", "Landroidx/compose/runtime/snapshots/g;", "x", "(Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/snapshots/g;", "writeObserver", "R", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/snapshots/b;", "o", "snapshot", "", "W", "(Landroidx/compose/runtime/snapshots/g;)Ljava/lang/Void;", "X", "s", "Landroidx/compose/runtime/snapshots/b;", "t", "Z", "u", "v", "Lkotlin/jvm/functions/Function1;", "H", "()Lkotlin/jvm/functions/Function1;", "Y", "(Lkotlin/jvm/functions/Function1;)V", "w", "k", "", "J", "V", "()J", "threadId", "U", "()Landroidx/compose/runtime/snapshots/b;", "currentSnapshot", "Landroidx/compose/runtime/snapshots/SnapshotId;", "value", "i", "(J)V", "snapshotId", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "f", "()Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)V", "invalid", "Landroidx/collection/d;", "E", "()Landroidx/collection/d;", "Q", "(Landroidx/collection/d;)V", "modified", "", "j", "()I", "(I)V", "writeCount", "h", "()Z", "readOnly", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class k extends b {

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private final b parentSnapshot;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private final boolean mergeParentObservers;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private final boolean ownsParentSnapshot;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private Function1<Object, Unit> readObserver;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private Function1<Object, Unit> writeObserver;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final long threadId;

    public k(b bVar, Function1<Object, Unit> function1, Function1<Object, Unit> function2, boolean z, boolean z2) {
        Function1<Object, Unit> function1K;
        Function1<Object, Unit> function1G;
        super(i.b, SnapshotIdSet.INSTANCE.a(), i.N(function1, (bVar == null || (function1G = bVar.g()) == null) ? i.k.g() : function1G, z), i.Q(function2, (bVar == null || (function1K = bVar.k()) == null) ? i.k.k() : function1K));
        this.parentSnapshot = bVar;
        this.mergeParentObservers = z;
        this.ownsParentSnapshot = z2;
        this.readObserver = super.g();
        this.writeObserver = super.k();
        this.threadId = q1d.a();
    }

    private final b U() {
        b bVar = this.parentSnapshot;
        return bVar == null ? i.k : bVar;
    }

    @Override // androidx.compose.p004runtime.snapshots.b
    public h C() {
        return U().C();
    }

    @Override // androidx.compose.p004runtime.snapshots.b
    public d<a7c> E() {
        return U().E();
    }

    @Override // androidx.compose.p004runtime.snapshots.b, androidx.compose.p004runtime.snapshots.g
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public Function1<Object, Unit> g() {
        return this.readObserver;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    @Override // androidx.compose.p004runtime.snapshots.b
    public void Q(d<a7c> dVar) throws KotlinNothingValueException {
        lxb.b();
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.p004runtime.snapshots.b
    public b R(Function1<Object, Unit> readObserver, Function1<Object, Unit> writeObserver) {
        Function1<Object, Unit> function1O = i.O(readObserver, g(), false, 4, null);
        Function1<Object, Unit> function1Q = i.Q(writeObserver, k());
        return !this.mergeParentObservers ? new k(U().R(null, function1Q), function1O, function1Q, false, true) : U().R(function1O, function1Q);
    }

    /* JADX INFO: renamed from: V, reason: from getter */
    public final long getThreadId() {
        return this.threadId;
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

    public void Y(Function1<Object, Unit> function1) {
        this.readObserver = function1;
    }

    public void Z(Function1<Object, Unit> function1) {
        this.writeObserver = function1;
    }

    @Override // androidx.compose.p004runtime.snapshots.b, androidx.compose.p004runtime.snapshots.g
    public void d() {
        b bVar;
        t(true);
        if (!this.ownsParentSnapshot || (bVar = this.parentSnapshot) == null) {
            return;
        }
        bVar.d();
    }

    @Override // androidx.compose.p004runtime.snapshots.g
    /* JADX INFO: renamed from: f */
    public SnapshotIdSet getInvalid() {
        return U().getInvalid();
    }

    @Override // androidx.compose.p004runtime.snapshots.b, androidx.compose.p004runtime.snapshots.g
    public boolean h() {
        return U().h();
    }

    @Override // androidx.compose.p004runtime.snapshots.g
    /* JADX INFO: renamed from: i */
    public long getSnapshotId() {
        return U().getSnapshotId();
    }

    @Override // androidx.compose.p004runtime.snapshots.b, androidx.compose.p004runtime.snapshots.g
    /* JADX INFO: renamed from: j */
    public int getWriteCount() {
        return U().getWriteCount();
    }

    @Override // androidx.compose.p004runtime.snapshots.b, androidx.compose.p004runtime.snapshots.g
    public Function1<Object, Unit> k() {
        return this.writeObserver;
    }

    @Override // androidx.compose.p004runtime.snapshots.b, androidx.compose.p004runtime.snapshots.g
    public void o() {
        U().o();
    }

    @Override // androidx.compose.p004runtime.snapshots.b, androidx.compose.p004runtime.snapshots.g
    public void p(a7c state) {
        U().p(state);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    @Override // androidx.compose.p004runtime.snapshots.g
    public void u(SnapshotIdSet snapshotIdSet) throws KotlinNothingValueException {
        lxb.b();
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    @Override // androidx.compose.p004runtime.snapshots.g
    public void v(long j) throws KotlinNothingValueException {
        lxb.b();
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.p004runtime.snapshots.b, androidx.compose.p004runtime.snapshots.g
    public void w(int i) {
        U().w(i);
    }

    @Override // androidx.compose.p004runtime.snapshots.b, androidx.compose.p004runtime.snapshots.g
    public g x(Function1<Object, Unit> readObserver) {
        Function1<Object, Unit> function1O = i.O(readObserver, g(), false, 4, null);
        return !this.mergeParentObservers ? i.G(U().x(null), function1O, true) : U().x(function1O);
    }
}
