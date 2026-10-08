package androidx.constraintlayout.compose;

import com.google.inputmethod.ff3;
import com.google.inputmethod.n6c;
import com.google.inputmethod.nf5;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b \u0018\u00002\u00020\u0001B)\u0012\u0018\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0004H&¢\u0006\u0004\b\r\u0010\u000eJ+\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015R&\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0016R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0019"}, d2 = {"Landroidx/constraintlayout/compose/BaseHorizontalAnchorable;", "Lcom/google/android/nf5;", "", "Lkotlin/Function1;", "Lcom/google/android/n6c;", "", "tasks", "", "index", "<init>", "(Ljava/util/List;I)V", "state", "Landroidx/constraintlayout/core/state/a;", "c", "(Lcom/google/android/n6c;)Landroidx/constraintlayout/core/state/a;", "Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$b;", "anchor", "Lcom/google/android/ff3;", "margin", "goneMargin", "a", "(Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$b;FF)V", "Ljava/util/List;", "b", "I", "compose_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public abstract class BaseHorizontalAnchorable implements nf5 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<Function1<n6c, Unit>> tasks;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int index;

    public BaseHorizontalAnchorable(List<Function1<n6c, Unit>> list, int i) {
        Intrinsics.checkNotNullParameter(list, "tasks");
        this.tasks = list;
        this.index = i;
    }

    @Override // com.google.inputmethod.nf5
    public final void a(final ConstraintLayoutBaseScope.HorizontalAnchor anchor, final float margin, final float goneMargin) {
        Intrinsics.checkNotNullParameter(anchor, "anchor");
        this.tasks.add(new Function1<n6c, Unit>() { // from class: androidx.constraintlayout.compose.BaseHorizontalAnchorable$linkTo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(n6c n6cVar) {
                Intrinsics.checkNotNullParameter(n6cVar, "state");
                androidx.constraintlayout.core.state.a aVarC = this.this$0.c(n6cVar);
                BaseHorizontalAnchorable baseHorizontalAnchorable = this.this$0;
                ConstraintLayoutBaseScope.HorizontalAnchor horizontalAnchor = anchor;
                ((androidx.constraintlayout.core.state.a) AnchorFunctions.a.e()[baseHorizontalAnchorable.index][horizontalAnchor.getIndex()].invoke(aVarC, horizontalAnchor.getId())).D(ff3.e(margin)).F(ff3.e(goneMargin));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((n6c) obj);
                return Unit.a;
            }
        });
    }

    public abstract androidx.constraintlayout.core.state.a c(n6c state);
}
