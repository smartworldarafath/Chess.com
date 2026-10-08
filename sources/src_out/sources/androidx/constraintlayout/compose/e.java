package androidx.constraintlayout.compose;

import com.google.inputmethod.n6c;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0018\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00070\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Landroidx/constraintlayout/compose/e;", "Landroidx/constraintlayout/compose/BaseVerticalAnchorable;", "", "id", "", "index", "", "Lkotlin/Function1;", "Lcom/google/android/n6c;", "", "tasks", "<init>", "(Ljava/lang/Object;ILjava/util/List;)V", "state", "Landroidx/constraintlayout/core/state/a;", "c", "(Lcom/google/android/n6c;)Landroidx/constraintlayout/core/state/a;", "Ljava/lang/Object;", "getId", "()Ljava/lang/Object;", "compose_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
final class e extends BaseVerticalAnchorable {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Object id;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Object obj, int i, List<Function1<n6c, Unit>> list) {
        super(list, i);
        Intrinsics.checkNotNullParameter(obj, "id");
        Intrinsics.checkNotNullParameter(list, "tasks");
        this.id = obj;
    }

    @Override // androidx.constraintlayout.compose.BaseVerticalAnchorable
    public androidx.constraintlayout.core.state.a c(n6c state) {
        Intrinsics.checkNotNullParameter(state, "state");
        androidx.constraintlayout.core.state.a aVarC = state.c(this.id);
        Intrinsics.checkNotNullExpressionValue(aVarC, "state.constraints(id)");
        return aVarC;
    }
}
