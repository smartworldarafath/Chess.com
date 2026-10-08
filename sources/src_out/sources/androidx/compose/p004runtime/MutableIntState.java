package androidx.compose.p004runtime;

import androidx.compose.p004runtime.MutableIntState;
import androidx.compose.p004runtime.snapshots.g;
import androidx.compose.p004runtime.snapshots.i;
import com.google.inputmethod.axb;
import com.google.inputmethod.b7c;
import com.google.inputmethod.bxb;
import com.google.inputmethod.c7c;
import com.google.inputmethod.kwb;
import com.google.inputmethod.q48;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: androidx.compose.runtime.m0, reason: from toString */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0011\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001(B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b0\nH\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0014\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR$\u0010#\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010\u0007R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00040$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006)"}, d2 = {"Landroidx/compose/runtime/m0;", "Lcom/google/android/b7c;", "Lcom/google/android/q48;", "Lcom/google/android/axb;", "", "value", "<init>", "(I)V", "F", "()Ljava/lang/Integer;", "Lkotlin/Function1;", "", "s", "()Lkotlin/jvm/functions/Function1;", "Lcom/google/android/c7c;", "x", "(Lcom/google/android/c7c;)V", "previous", "current", "applied", "w", "(Lcom/google/android/c7c;Lcom/google/android/c7c;Lcom/google/android/c7c;)Lcom/google/android/c7c;", "", "toString", "()Ljava/lang/String;", "Landroidx/compose/runtime/m0$a;", "b", "Landroidx/compose/runtime/m0$a;", "next", "t", "()Lcom/google/android/c7c;", "firstStateRecord", "getIntValue", "()I", "f", "intValue", "Lcom/google/android/bxb;", "getPolicy", "()Lcom/google/android/bxb;", "policy", "a", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class MutableIntState extends b7c implements q48, axb<Integer> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private a next;

    /* JADX INFO: renamed from: androidx.compose.runtime.m0$a */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\f\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u000e\u001a\u00020\u00012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Landroidx/compose/runtime/m0$a;", "Lcom/google/android/c7c;", "", "Landroidx/compose/runtime/snapshots/SnapshotId;", "snapshotId", "", "value", "<init>", "(JI)V", "", "c", "(Lcom/google/android/c7c;)V", "d", "()Lcom/google/android/c7c;", "e", "(J)Lcom/google/android/c7c;", "I", "j", "()I", "k", "(I)V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class a extends c7c {

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private int value;

        public a(long j, int i) {
            super(j);
            this.value = i;
        }

        @Override // com.google.inputmethod.c7c
        public void c(c7c value) {
            Intrinsics.h(value, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord");
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
        public final int getValue() {
            return this.value;
        }

        public final void k(int i) {
            this.value = i;
        }
    }

    public MutableIntState(int i) {
        g gVarK = i.K();
        a aVar = new a(gVarK.getSnapshotId(), i);
        if (!(gVarK instanceof androidx.compose.p004runtime.snapshots.a)) {
            aVar.h(new a(kwb.c(1), i));
        }
        this.next = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit I(MutableIntState mutableIntState, int i) {
        mutableIntState.f(i);
        return Unit.a;
    }

    @Override // com.google.inputmethod.o58
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public Integer D() {
        return Integer.valueOf(getIntValue());
    }

    @Override // com.google.inputmethod.q48
    public void f(int i) {
        g gVarC;
        a aVar = (a) i.I(this.next);
        if (aVar.getValue() != i) {
            a aVar2 = this.next;
            synchronized (i.M()) {
                gVarC = g.INSTANCE.c();
                ((a) i.X(aVar2, this, gVarC, aVar)).k(i);
                Unit unit = Unit.a;
            }
            i.V(gVarC, this);
        }
    }

    @Override // com.google.inputmethod.q48, com.google.inputmethod.u16
    public int getIntValue() {
        return ((a) i.c0(this.next, this)).getValue();
    }

    @Override // com.google.inputmethod.axb
    public bxb<Integer> getPolicy() {
        return p0.t();
    }

    @Override // com.google.inputmethod.o58
    public Function1<Integer, Unit> s() {
        return new Function1() { // from class: com.google.android.ywb
            public final Object invoke(Object obj) {
                return MutableIntState.I(this.a, ((Integer) obj).intValue());
            }
        };
    }

    @Override // com.google.inputmethod.a7c
    /* JADX INFO: renamed from: t */
    public c7c getFirstStateRecord() {
        return this.next;
    }

    public String toString() {
        return "MutableIntState(value=" + ((a) i.I(this.next)).getValue() + ")@" + hashCode();
    }

    @Override // com.google.inputmethod.a7c
    public c7c w(c7c previous, c7c current, c7c applied) {
        Intrinsics.h(current, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord");
        Intrinsics.h(applied, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord");
        if (((a) current).getValue() == ((a) applied).getValue()) {
            return current;
        }
        return null;
    }

    @Override // com.google.inputmethod.a7c
    public void x(c7c value) {
        Intrinsics.h(value, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord");
        this.next = (a) value;
    }
}
