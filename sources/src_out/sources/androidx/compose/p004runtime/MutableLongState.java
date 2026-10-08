package androidx.compose.p004runtime;

import androidx.compose.p004runtime.MutableLongState;
import androidx.compose.p004runtime.snapshots.g;
import androidx.compose.p004runtime.snapshots.i;
import com.google.inputmethod.axb;
import com.google.inputmethod.b7c;
import com.google.inputmethod.bxb;
import com.google.inputmethod.c7c;
import com.google.inputmethod.kwb;
import com.google.inputmethod.y48;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: androidx.compose.runtime.n0, reason: from toString */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0011\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001(B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b0\nH\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0014\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR$\u0010#\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010\u0007R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00040$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006)"}, d2 = {"Landroidx/compose/runtime/n0;", "Lcom/google/android/b7c;", "Lcom/google/android/y48;", "Lcom/google/android/axb;", "", "value", "<init>", "(J)V", "F", "()Ljava/lang/Long;", "Lkotlin/Function1;", "", "s", "()Lkotlin/jvm/functions/Function1;", "Lcom/google/android/c7c;", "x", "(Lcom/google/android/c7c;)V", "previous", "current", "applied", "w", "(Lcom/google/android/c7c;Lcom/google/android/c7c;Lcom/google/android/c7c;)Lcom/google/android/c7c;", "", "toString", "()Ljava/lang/String;", "Landroidx/compose/runtime/n0$a;", "b", "Landroidx/compose/runtime/n0$a;", "next", "t", "()Lcom/google/android/c7c;", "firstStateRecord", "getLongValue", "()J", "C", "longValue", "Lcom/google/android/bxb;", "getPolicy", "()Lcom/google/android/bxb;", "policy", "a", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class MutableLongState extends b7c implements y48, axb<Long> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private a next;

    /* JADX INFO: renamed from: androidx.compose.runtime.n0$a */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\f\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\r\u001a\u00020\u00012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0016¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Landroidx/compose/runtime/n0$a;", "Lcom/google/android/c7c;", "", "Landroidx/compose/runtime/snapshots/SnapshotId;", "snapshotId", "value", "<init>", "(JJ)V", "", "c", "(Lcom/google/android/c7c;)V", "d", "()Lcom/google/android/c7c;", "e", "(J)Lcom/google/android/c7c;", "J", "j", "()J", "k", "(J)V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class a extends c7c {

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private long value;

        public a(long j, long j2) {
            super(j);
            this.value = j2;
        }

        @Override // com.google.inputmethod.c7c
        public void c(c7c value) {
            Intrinsics.h(value, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
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
        public final long getValue() {
            return this.value;
        }

        public final void k(long j) {
            this.value = j;
        }
    }

    public MutableLongState(long j) {
        g gVarK = i.K();
        a aVar = new a(gVarK.getSnapshotId(), j);
        if (!(gVarK instanceof androidx.compose.p004runtime.snapshots.a)) {
            aVar.h(new a(kwb.c(1), j));
        }
        this.next = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit I(MutableLongState mutableLongState, long j) {
        mutableLongState.C(j);
        return Unit.a;
    }

    @Override // com.google.inputmethod.y48
    public void C(long j) {
        g gVarC;
        a aVar = (a) i.I(this.next);
        if (aVar.getValue() != j) {
            a aVar2 = this.next;
            synchronized (i.M()) {
                gVarC = g.INSTANCE.c();
                ((a) i.X(aVar2, this, gVarC, aVar)).k(j);
                Unit unit = Unit.a;
            }
            i.V(gVarC, this);
        }
    }

    @Override // com.google.inputmethod.o58
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public Long D() {
        return Long.valueOf(getLongValue());
    }

    @Override // com.google.inputmethod.y48, com.google.inputmethod.ja7
    public long getLongValue() {
        return ((a) i.c0(this.next, this)).getValue();
    }

    @Override // com.google.inputmethod.axb
    public bxb<Long> getPolicy() {
        return p0.t();
    }

    @Override // com.google.inputmethod.o58
    public Function1<Long, Unit> s() {
        return new Function1() { // from class: com.google.android.zwb
            public final Object invoke(Object obj) {
                return MutableLongState.I(this.a, ((Long) obj).longValue());
            }
        };
    }

    @Override // com.google.inputmethod.a7c
    /* JADX INFO: renamed from: t */
    public c7c getFirstStateRecord() {
        return this.next;
    }

    public String toString() {
        return "MutableLongState(value=" + ((a) i.I(this.next)).getValue() + ")@" + hashCode();
    }

    @Override // com.google.inputmethod.a7c
    public c7c w(c7c previous, c7c current, c7c applied) {
        Intrinsics.h(current, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
        Intrinsics.h(applied, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
        if (((a) current).getValue() == ((a) applied).getValue()) {
            return current;
        }
        return null;
    }

    @Override // com.google.inputmethod.a7c
    public void x(c7c value) {
        Intrinsics.h(value, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
        this.next = (a) value;
    }
}
