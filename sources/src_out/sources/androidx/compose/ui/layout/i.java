package androidx.compose.ui.layout;

import androidx.compose.ui.node.NodeCoordinator;
import com.google.inputmethod.kn6;
import com.google.inputmethod.ua7;
import com.google.inputmethod.wa7;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0019\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\u0007\u001a\u00020\u0003*\u00020\u0003H\u0016¢\u0006\u0004\b\u0007\u0010\bR*\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\t\u0010\u0006R\u0018\u0010\u0010\u001a\u00020\u0003*\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/layout/i;", "Lcom/google/android/wa7;", "Lkotlin/Function0;", "Lcom/google/android/kn6;", "scopeCoordinates", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "f", "(Lcom/google/android/kn6;)Lcom/google/android/kn6;", "a", "Lkotlin/jvm/functions/Function0;", "getScopeCoordinates", "()Lkotlin/jvm/functions/Function0;", "Landroidx/compose/ui/layout/o$a;", "b", "(Landroidx/compose/ui/layout/o$a;)Lcom/google/android/kn6;", "lookaheadScopeCoordinates", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class i implements wa7 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private Function0<? extends kn6> scopeCoordinates;

    /* JADX WARN: Illegal instructions before constructor call */
    public i() {
        Function0 function0 = null;
        this(function0, 1, function0);
    }

    public final void a(Function0<? extends kn6> function0) {
        this.scopeCoordinates = function0;
    }

    @Override // com.google.inputmethod.wa7
    public kn6 b(o.a aVar) {
        Function0<? extends kn6> function0 = this.scopeCoordinates;
        Intrinsics.g(function0);
        return (kn6) function0.invoke();
    }

    @Override // com.google.inputmethod.wa7
    public kn6 f(kn6 kn6Var) {
        ua7 ua7VarZ2;
        ua7 ua7Var = kn6Var instanceof ua7 ? (ua7) kn6Var : null;
        if (ua7Var != null) {
            return ua7Var;
        }
        Intrinsics.h(kn6Var, "null cannot be cast to non-null type androidx.compose.ui.node.NodeCoordinator");
        NodeCoordinator nodeCoordinator = (NodeCoordinator) kn6Var;
        androidx.compose.ui.node.i iVarF3 = nodeCoordinator.getLookaheadDelegate();
        return (iVarF3 == null || (ua7VarZ2 = iVarF3.getLookaheadLayoutCoordinates()) == null) ? nodeCoordinator : ua7VarZ2;
    }

    public i(Function0<? extends kn6> function0) {
        this.scopeCoordinates = function0;
    }

    public /* synthetic */ i(Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : function0);
    }
}
