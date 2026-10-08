package androidx.compose.p001foundation.layout;

import com.google.inputmethod.jz5;
import com.google.inputmethod.uy7;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B+\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\r\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00078\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Landroidx/compose/foundation/layout/l0;", "Lcom/google/android/uy7;", "Landroidx/compose/foundation/layout/m0;", "Landroidx/compose/foundation/layout/IntrinsicSize;", "height", "", "enforceIncoming", "Lkotlin/Function1;", "Lcom/google/android/jz5;", "", "inspectorInfo", "<init>", "(Landroidx/compose/foundation/layout/IntrinsicSize;ZLkotlin/jvm/functions/Function1;)V", "d", "()Landroidx/compose/foundation/layout/m0;", "node", "e", "(Landroidx/compose/foundation/layout/m0;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroidx/compose/foundation/layout/IntrinsicSize;", "getHeight", "()Landroidx/compose/foundation/layout/IntrinsicSize;", "Z", "getEnforceIncoming", "()Z", "f", "Lkotlin/jvm/functions/Function1;", "getInspectorInfo", "()Lkotlin/jvm/functions/Function1;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class l0 extends uy7<m0> {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final IntrinsicSize height;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final boolean enforceIncoming;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final Function1<jz5, Unit> inspectorInfo;

    /* JADX WARN: Multi-variable type inference failed */
    public l0(IntrinsicSize intrinsicSize, boolean z, Function1<? super jz5, Unit> function1) {
        this.height = intrinsicSize;
        this.enforceIncoming = z;
        this.inspectorInfo = function1;
    }

    @Override // com.google.inputmethod.uy7
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public m0 a() {
        return new m0(this.height, this.enforceIncoming);
    }

    @Override // com.google.inputmethod.uy7
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void c(m0 node) {
        node.r3(this.height);
        node.q3(this.enforceIncoming);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        l0 l0Var = other instanceof l0 ? (l0) other : null;
        return l0Var != null && this.height == l0Var.height && this.enforceIncoming == l0Var.enforceIncoming;
    }

    public int hashCode() {
        return (this.height.hashCode() * 31) + Boolean.hashCode(this.enforceIncoming);
    }
}
