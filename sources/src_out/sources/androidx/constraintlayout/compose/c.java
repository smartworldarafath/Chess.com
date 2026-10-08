package androidx.constraintlayout.compose;

import com.google.inputmethod.rn6;
import com.google.inputmethod.ww1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0003\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017R\u001a\u0010\u001c\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Landroidx/constraintlayout/compose/c;", "Lcom/google/android/rn6;", "Lcom/google/android/ww1;", "ref", "Lkotlin/Function1;", "Landroidx/constraintlayout/compose/ConstrainScope;", "", "constrain", "<init>", "(Lcom/google/android/ww1;Lkotlin/jvm/functions/Function1;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Lcom/google/android/ww1;", "b", "()Lcom/google/android/ww1;", "Lkotlin/jvm/functions/Function1;", "()Lkotlin/jvm/functions/Function1;", "c", "Ljava/lang/Object;", "e2", "()Ljava/lang/Object;", "layoutId", "compose_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
final class c implements rn6 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final ww1 ref;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Function1<ConstrainScope, Unit> constrain;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Object layoutId;

    /* JADX WARN: Multi-variable type inference failed */
    public c(ww1 ww1Var, Function1<? super ConstrainScope, Unit> function1) {
        Intrinsics.checkNotNullParameter(ww1Var, "ref");
        Intrinsics.checkNotNullParameter(function1, "constrain");
        this.ref = ww1Var;
        this.constrain = function1;
        this.layoutId = ww1Var.getId();
    }

    public final Function1<ConstrainScope, Unit> a() {
        return this.constrain;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final ww1 getRef() {
        return this.ref;
    }

    @Override // com.google.inputmethod.rn6
    /* JADX INFO: renamed from: e2, reason: from getter */
    public Object getLayoutId() {
        return this.layoutId;
    }

    public boolean equals(Object other) {
        if (!(other instanceof c)) {
            return false;
        }
        c cVar = (c) other;
        return Intrinsics.e(this.ref.getId(), cVar.ref.getId()) && Intrinsics.e(this.constrain, cVar.constrain);
    }

    public int hashCode() {
        return (this.ref.getId().hashCode() * 31) + this.constrain.hashCode();
    }
}
