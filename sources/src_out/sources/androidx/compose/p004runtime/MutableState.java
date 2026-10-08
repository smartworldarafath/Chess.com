package androidx.compose.p004runtime;

import androidx.compose.p004runtime.snapshots.g;
import androidx.compose.p004runtime.snapshots.i;
import com.google.inputmethod.axb;
import com.google.inputmethod.b7c;
import com.google.inputmethod.bxb;
import com.google.inputmethod.c7c;
import com.google.inputmethod.kwb;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: androidx.compose.runtime.o0, reason: from toString */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0011\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001&B\u001d\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\u0010\u001a\u0004\u0018\u00010\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR*\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00028\u00008V@VX\u0096\u000e¢\u0006\u0012\u0012\u0004\b!\u0010\"\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006'"}, d2 = {"Landroidx/compose/runtime/o0;", "T", "Lcom/google/android/b7c;", "Lcom/google/android/axb;", "value", "Lcom/google/android/bxb;", "policy", "<init>", "(Ljava/lang/Object;Lcom/google/android/bxb;)V", "Lcom/google/android/c7c;", "", "x", "(Lcom/google/android/c7c;)V", "previous", "current", "applied", "w", "(Lcom/google/android/c7c;Lcom/google/android/c7c;Lcom/google/android/c7c;)Lcom/google/android/c7c;", "", "toString", "()Ljava/lang/String;", "b", "Lcom/google/android/bxb;", "getPolicy", "()Lcom/google/android/bxb;", "Landroidx/compose/runtime/o0$a;", "c", "Landroidx/compose/runtime/o0$a;", "next", "getValue", "()Ljava/lang/Object;", "setValue", "(Ljava/lang/Object;)V", "getValue$annotations", "()V", "t", "()Lcom/google/android/c7c;", "firstStateRecord", "a", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class MutableState<T> extends b7c implements axb<T> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final bxb<T> policy;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private a<T> next;

    /* JADX INFO: renamed from: androidx.compose.runtime.o0$a */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\f\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002B\u001b\u0012\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004\u0012\u0006\u0010\u0006\u001a\u00028\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\u0000H\u0016¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\"\u0010\t\u001a\u00028\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Landroidx/compose/runtime/o0$a;", "T", "Lcom/google/android/c7c;", "", "Landroidx/compose/runtime/snapshots/SnapshotId;", "snapshotId", "myValue", "<init>", "(JLjava/lang/Object;)V", "value", "", "c", "(Lcom/google/android/c7c;)V", "j", "()Landroidx/compose/runtime/o0$a;", "k", "(J)Landroidx/compose/runtime/o0$a;", "Ljava/lang/Object;", "l", "()Ljava/lang/Object;", "m", "(Ljava/lang/Object;)V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class a<T> extends c7c {

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private T value;

        public a(long j, T t) {
            super(j);
            this.value = t;
        }

        @Override // com.google.inputmethod.c7c
        public void c(c7c value) {
            Intrinsics.h(value, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord>");
            this.value = ((a) value).value;
        }

        @Override // com.google.inputmethod.c7c
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public a<T> d() {
            return new a<>(i.K().getSnapshotId(), this.value);
        }

        @Override // com.google.inputmethod.c7c
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public a<T> e(long snapshotId) {
            return new a<>(i.K().getSnapshotId(), this.value);
        }

        public final T l() {
            return this.value;
        }

        public final void m(T t) {
            this.value = t;
        }
    }

    public MutableState(T t, bxb<T> bxbVar) {
        this.policy = bxbVar;
        g gVarK = i.K();
        a<T> aVar = new a<>(gVarK.getSnapshotId(), t);
        if (!(gVarK instanceof androidx.compose.p004runtime.snapshots.a)) {
            aVar.h(new a(kwb.c(1), t));
        }
        this.next = aVar;
    }

    @Override // com.google.inputmethod.axb
    public bxb<T> getPolicy() {
        return this.policy;
    }

    @Override // com.google.inputmethod.o58, com.google.inputmethod.q6c
    public T getValue() {
        return (T) ((a) i.c0(this.next, this)).l();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.inputmethod.o58
    public void setValue(T t) {
        g gVarC;
        a aVar = (a) i.I(this.next);
        if (getPolicy().a(aVar.l(), t)) {
            return;
        }
        a<T> aVar2 = this.next;
        synchronized (i.M()) {
            gVarC = g.INSTANCE.c();
            ((a) i.X(aVar2, this, gVarC, aVar)).m(t);
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
        return "MutableState(value=" + ((a) i.I(this.next)).l() + ")@" + hashCode();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.inputmethod.a7c
    public c7c w(c7c previous, c7c current, c7c applied) {
        Intrinsics.h(previous, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>");
        a aVar = (a) previous;
        Intrinsics.h(current, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>");
        a aVar2 = (a) current;
        Intrinsics.h(applied, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>");
        a aVar3 = (a) applied;
        if (getPolicy().a(aVar2.l(), aVar3.l())) {
            return current;
        }
        Object objB = getPolicy().b(aVar.l(), aVar2.l(), aVar3.l());
        if (objB == null) {
            return null;
        }
        a aVarE = aVar3.e(aVar3.getSnapshotId());
        aVarE.m(objB);
        return aVarE;
    }

    @Override // com.google.inputmethod.a7c
    public void x(c7c value) {
        Intrinsics.h(value, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>");
        this.next = (a) value;
    }
}
