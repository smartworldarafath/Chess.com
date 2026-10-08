package androidx.compose.ui.relocation;

import androidx.compose.ui.b;
import androidx.compose.ui.node.LayoutNode;
import com.google.android.q22;
import com.google.android.ut0;
import com.google.inputmethod.atb;
import com.google.inputmethod.au0;
import com.google.inputmethod.gba;
import com.google.inputmethod.k33;
import com.google.inputmethod.ki8;
import com.google.inputmethod.kn6;
import com.google.inputmethod.ni8;
import com.google.inputmethod.r16;
import com.google.inputmethod.r58;
import com.google.inputmethod.x23;
import com.google.inputmethod.y23;
import com.google.inputmethod.zw5;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.a;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a(\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\u0012\b\u0002\u0010\u0003\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0001H\u0086@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/google/android/x23;", "Lkotlin/Function0;", "Lcom/google/android/gba;", "bounds", "", "a", "(Lcom/google/android/x23;Lkotlin/jvm/functions/Function0;Lcom/google/android/q22;)Ljava/lang/Object;", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class BringIntoViewModifierNodeKt {
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public static final Object a(x23 x23Var, final Function0<gba> function0, q22<? super Unit> q22Var) throws KotlinNothingValueException {
        Object obj;
        final kn6 kn6VarO;
        Object objG0;
        ki8 nodes;
        if (!x23Var.getNode().getIsAttached()) {
            return Unit.a;
        }
        int iA = ni8.a(524288);
        if (!x23Var.getNode().getIsAttached()) {
            zw5.c("visitAncestors called on an unattached node");
        }
        b.c parent = x23Var.getNode().getParent();
        LayoutNode layoutNodeQ = y23.q(x23Var);
        loop0: while (true) {
            obj = null;
            if (layoutNodeQ == null) {
                break;
            }
            if ((layoutNodeQ.getNodes().getHead().getAggregateChildKindSet() & iA) != 0) {
                while (parent != null) {
                    if ((parent.getKindSet() & iA) != 0) {
                        b.c cVarJ = parent;
                        r58 r58Var = null;
                        while (cVarJ != null) {
                            if (cVarJ instanceof au0) {
                                obj = cVarJ;
                                break loop0;
                            }
                            if ((cVarJ.getKindSet() & iA) != 0 && (cVarJ instanceof k33)) {
                                int i = 0;
                                for (b.c delegate = ((k33) cVarJ).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                    if ((delegate.getKindSet() & iA) != 0) {
                                        i++;
                                        if (i == 1) {
                                            cVarJ = delegate;
                                        } else {
                                            if (r58Var == null) {
                                                r58Var = new r58(new b.c[16], 0);
                                            }
                                            if (cVarJ != null) {
                                                ut0.a(r58Var.c(cVarJ));
                                                cVarJ = null;
                                            }
                                            ut0.a(r58Var.c(delegate));
                                        }
                                    }
                                }
                                if (i == 1) {
                                }
                            }
                            cVarJ = y23.j(r58Var);
                        }
                    }
                    parent = parent.getParent();
                }
            }
            layoutNodeQ = layoutNodeQ.C0();
            parent = (layoutNodeQ == null || (nodes = layoutNodeQ.getNodes()) == null) ? null : nodes.getTail();
        }
        au0 au0Var = (au0) obj;
        return (au0Var != null && (objG0 = au0Var.G0((kn6VarO = y23.o(x23Var)), new Function0<gba>() { // from class: androidx.compose.ui.relocation.BringIntoViewModifierNodeKt$bringIntoView$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final gba invoke() {
                gba gbaVar;
                Function0<gba> function1 = function0;
                if (function1 != null && (gbaVar = (gba) function1.invoke()) != null) {
                    return gbaVar;
                }
                kn6 kn6Var = kn6VarO;
                if (!kn6Var.b()) {
                    kn6Var = null;
                }
                if (kn6Var != null) {
                    return atb.c(r16.e(kn6Var.a()));
                }
                return null;
            }
        }, q22Var)) == a.g()) ? objG0 : Unit.a;
    }

    public static /* synthetic */ Object b(x23 x23Var, Function0 function0, q22 q22Var, int i, Object obj) {
        if ((i & 1) != 0) {
            function0 = null;
        }
        return a(x23Var, function0, q22Var);
    }
}
