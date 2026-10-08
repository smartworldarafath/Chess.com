package androidx.compose.ui.scrollcapture;

import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.semantics.SemanticsProperties;
import com.google.android.q22;
import com.google.inputmethod.ScrollAxisRange;
import com.google.inputmethod.ifb;
import com.google.inputmethod.k16;
import com.google.inputmethod.kn6;
import com.google.inputmethod.l16;
import com.google.inputmethod.ln6;
import com.google.inputmethod.r58;
import com.google.inputmethod.rn8;
import com.google.inputmethod.zw5;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a5\u0010\b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0002¢\u0006\u0004\b\b\u0010\t\u001a\u0019\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00000\n*\u00020\u0000H\u0002¢\u0006\u0004\b\u000b\u0010\f\"6\u0010\u0013\u001a \b\u0001\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010\r*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012\"\u0018\u0010\u0017\u001a\u00020\u0014*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/semantics/SemanticsNode;", "fromNode", "", "depth", "Lkotlin/Function1;", "Landroidx/compose/ui/scrollcapture/b;", "", "onCandidate", "d", "(Landroidx/compose/ui/semantics/SemanticsNode;ILkotlin/jvm/functions/Function1;)V", "", "b", "(Landroidx/compose/ui/semantics/SemanticsNode;)Ljava/util/List;", "Lkotlin/Function2;", "Lcom/google/android/rn8;", "Lcom/google/android/q22;", "", "c", "(Landroidx/compose/ui/semantics/SemanticsNode;)Lkotlin/jvm/functions/Function2;", "scrollCaptureScrollByAction", "", "a", "(Landroidx/compose/ui/semantics/SemanticsNode;)Z", "canScrollVertically", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class c {
    private static final boolean a(SemanticsNode semanticsNode) {
        Function2<rn8, q22<? super rn8>, Object> function2C = c(semanticsNode);
        ScrollAxisRange scrollAxisRange = (ScrollAxisRange) SemanticsConfigurationKt.a(semanticsNode.getUnmergedConfig(), SemanticsProperties.a.S());
        return (function2C == null || scrollAxisRange == null || ((Number) scrollAxisRange.a().invoke()).floatValue() <= 0.0f) ? false : true;
    }

    private static final List<SemanticsNode> b(SemanticsNode semanticsNode) {
        return semanticsNode.n(false, false, false);
    }

    public static final Function2<rn8, q22<? super rn8>, Object> c(SemanticsNode semanticsNode) {
        return (Function2) SemanticsConfigurationKt.a(semanticsNode.getUnmergedConfig(), SemanticsActions.a.w());
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    private static final void d(SemanticsNode semanticsNode, int i, Function1<? super ScrollCaptureCandidate, Unit> function1) throws KotlinNothingValueException {
        r58 r58Var = new r58(new SemanticsNode[16], 0);
        List<SemanticsNode> listB = b(semanticsNode);
        while (true) {
            r58Var.f(r58Var.getSize(), listB);
            while (r58Var.getSize() != 0) {
                SemanticsNode semanticsNode2 = (SemanticsNode) r58Var.u(r58Var.getSize() - 1);
                if (!ifb.g(semanticsNode2) && !semanticsNode2.getUnmergedConfig().d(SemanticsProperties.a.f())) {
                    NodeCoordinator nodeCoordinatorF = semanticsNode2.f();
                    if (nodeCoordinatorF == null) {
                        zw5.d("Expected semantics node to have a coordinator.");
                        throw new KotlinNothingValueException();
                    }
                    kn6 kn6VarV = nodeCoordinatorF.v();
                    k16 k16VarC = l16.c(ln6.e(kn6VarV, false, 1, null));
                    if (k16VarC.s()) {
                        continue;
                    } else if (a(semanticsNode2)) {
                        int i2 = 1 + i;
                        function1.invoke(new ScrollCaptureCandidate(semanticsNode2, i2, k16VarC, kn6VarV));
                        d(semanticsNode2, i2, function1);
                    } else {
                        listB = b(semanticsNode2);
                    }
                }
            }
            return;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    static /* synthetic */ void e(SemanticsNode semanticsNode, int i, Function1 function1, int i2, Object obj) throws KotlinNothingValueException {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        d(semanticsNode, i, function1);
    }
}
