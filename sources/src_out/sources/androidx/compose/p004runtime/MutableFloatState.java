package androidx.compose.p004runtime;

import androidx.compose.p004runtime.snapshots.g;
import androidx.compose.p004runtime.snapshots.i;
import com.google.inputmethod.axb;
import com.google.inputmethod.b7c;
import com.google.inputmethod.bxb;
import com.google.inputmethod.c7c;
import com.google.inputmethod.kwb;
import com.google.inputmethod.l48;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: androidx.compose.runtime.l0, reason: from toString */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0011\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001\"B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\u000f\u001a\u0004\u0018\u00010\b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R$\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u001b\"\u0004\b\u001c\u0010\u0007R\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00040\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006#"}, d2 = {"Landroidx/compose/runtime/l0;", "Lcom/google/android/b7c;", "Lcom/google/android/l48;", "Lcom/google/android/axb;", "", "value", "<init>", "(F)V", "Lcom/google/android/c7c;", "", "x", "(Lcom/google/android/c7c;)V", "previous", "current", "applied", "w", "(Lcom/google/android/c7c;Lcom/google/android/c7c;Lcom/google/android/c7c;)Lcom/google/android/c7c;", "", "toString", "()Ljava/lang/String;", "Landroidx/compose/runtime/l0$a;", "b", "Landroidx/compose/runtime/l0$a;", "next", "t", "()Lcom/google/android/c7c;", "firstStateRecord", "()F", "p", "floatValue", "Lcom/google/android/bxb;", "getPolicy", "()Lcom/google/android/bxb;", "policy", "a", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class MutableFloatState extends b7c implements l48, axb<Float> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private a next;

    /* JADX INFO: renamed from: androidx.compose.runtime.l0$a */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\f\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u000e\u001a\u00020\u00012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Landroidx/compose/runtime/l0$a;", "Lcom/google/android/c7c;", "", "Landroidx/compose/runtime/snapshots/SnapshotId;", "snapshotId", "", "value", "<init>", "(JF)V", "", "c", "(Lcom/google/android/c7c;)V", "d", "()Lcom/google/android/c7c;", "e", "(J)Lcom/google/android/c7c;", "F", "j", "()F", "k", "(F)V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class a extends c7c {

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private float value;

        public a(long j, float f) {
            super(j);
            this.value = f;
        }

        @Override // com.google.inputmethod.c7c
        public void c(c7c value) {
            Intrinsics.h(value, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
            this.value = ((a) value).value;
        }

        @Override // com.google.inputmethod.c7c
        public c7c d() {
            return e(i.K().getSnapshotId());
        }

        @Override // com.google.inputmethod.c7c
        public c7c e(long snapshotId) {
            return new a(snapshotId, this.value);
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final float getValue() {
            return this.value;
        }

        public final void k(float f) {
            this.value = f;
        }
    }

    public MutableFloatState(float f) {
        g gVarK = i.K();
        a aVar = new a(gVarK.getSnapshotId(), f);
        if (!(gVarK instanceof androidx.compose.p004runtime.snapshots.a)) {
            aVar.h(new a(kwb.c(1), f));
        }
        this.next = aVar;
    }

    @Override // com.google.inputmethod.l48, com.google.inputmethod.nh4
    public float b() {
        return ((a) i.c0(this.next, this)).getValue();
    }

    @Override // com.google.inputmethod.axb
    public bxb<Float> getPolicy() {
        return p0.t();
    }

    @Override // com.google.inputmethod.l48
    public void p(float f) {
        g gVarC;
        a aVar = (a) i.I(this.next);
        if (aVar.getValue() == f) {
            return;
        }
        a aVar2 = this.next;
        synchronized (i.M()) {
            gVarC = g.INSTANCE.c();
            ((a) i.X(aVar2, this, gVarC, aVar)).k(f);
            Unit unit = Unit.a;
        }
        i.V(gVarC, this);
    }

    @Override // com.google.inputmethod.a7c
    /* JADX INFO: renamed from: t */
    public c7c getFirstStateRecord() {
        return this.next;
    }

    public String toString() {
        return "MutableFloatState(value=" + ((a) i.I(this.next)).getValue() + ")@" + hashCode();
    }

    @Override // com.google.inputmethod.a7c
    public c7c w(c7c previous, c7c current, c7c applied) {
        Intrinsics.h(current, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
        Intrinsics.h(applied, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
        if (((a) current).getValue() == ((a) applied).getValue()) {
            return current;
        }
        return null;
    }

    @Override // com.google.inputmethod.a7c
    public void x(c7c value) {
        Intrinsics.h(value, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
        this.next = (a) value;
    }
}
