package androidx.compose.ui.focus;

import androidx.compose.ui.node.LayoutNode;
import com.google.inputmethod.hm0;
import com.google.inputmethod.k33;
import com.google.inputmethod.ki8;
import com.google.inputmethod.ni8;
import com.google.inputmethod.r58;
import com.google.inputmethod.y23;
import com.google.inputmethod.zw5;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a9\u0010\u0007\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"T", "Landroidx/compose/ui/focus/FocusTargetNode;", "Landroidx/compose/ui/focus/b;", "direction", "Lkotlin/Function1;", "Lcom/google/android/hm0$a;", "block", "a", "(Landroidx/compose/ui/focus/FocusTargetNode;ILkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class a {
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public static final <T> T a(FocusTargetNode focusTargetNode, int i, Function1<? super hm0.a, ? extends T> function1) throws KotlinNothingValueException {
        androidx.compose.ui.b.c cVarJ;
        hm0 hm0VarW3;
        int iC;
        ki8 nodes;
        int iA = ni8.a(1024);
        if (!focusTargetNode.getNode().getIsAttached()) {
            zw5.c("visitAncestors called on an unattached node");
        }
        androidx.compose.ui.b.c parent = focusTargetNode.getNode().getParent();
        LayoutNode layoutNodeQ = y23.q(focusTargetNode);
        loop0: while (true) {
            if (layoutNodeQ == null) {
                cVarJ = null;
                break;
            }
            if ((layoutNodeQ.getNodes().getHead().getAggregateChildKindSet() & iA) != 0) {
                while (parent != null) {
                    if ((parent.getKindSet() & iA) != 0) {
                        cVarJ = parent;
                        r58 r58Var = null;
                        while (cVarJ != null) {
                            if (cVarJ instanceof FocusTargetNode) {
                                break loop0;
                            }
                            if ((cVarJ.getKindSet() & iA) != 0 && (cVarJ instanceof k33)) {
                                int i2 = 0;
                                for (androidx.compose.ui.b.c delegate = ((k33) cVarJ).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                    if ((delegate.getKindSet() & iA) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            cVarJ = delegate;
                                        } else {
                                            if (r58Var == null) {
                                                r58Var = new r58(new androidx.compose.ui.b.c[16], 0);
                                            }
                                            if (cVarJ != null) {
                                                r58Var.c(cVarJ);
                                                cVarJ = null;
                                            }
                                            r58Var.c(delegate);
                                        }
                                    }
                                }
                                if (i2 == 1) {
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
        FocusTargetNode focusTargetNode2 = (FocusTargetNode) cVarJ;
        if ((focusTargetNode2 != null && Intrinsics.e(focusTargetNode2.w3(), focusTargetNode.w3())) || (hm0VarW3 = focusTargetNode.w3()) == null) {
            return null;
        }
        b.Companion companion = b.INSTANCE;
        if (b.l(i, companion.h())) {
            iC = hm0.b.INSTANCE.a();
        } else if (b.l(i, companion.a())) {
            iC = hm0.b.INSTANCE.d();
        } else if (b.l(i, companion.d())) {
            iC = hm0.b.INSTANCE.e();
        } else if (b.l(i, companion.g())) {
            iC = hm0.b.INSTANCE.f();
        } else if (b.l(i, companion.e())) {
            iC = hm0.b.INSTANCE.b();
        } else {
            if (!b.l(i, companion.f())) {
                throw new IllegalStateException("Unsupported direction for beyond bounds layout");
            }
            iC = hm0.b.INSTANCE.c();
        }
        return (T) hm0VarW3.y1(iC, function1);
    }
}
