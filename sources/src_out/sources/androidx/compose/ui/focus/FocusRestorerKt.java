package androidx.compose.ui.focus;

import com.google.inputmethod.cs1;
import com.google.inputmethod.k33;
import com.google.inputmethod.ni8;
import com.google.inputmethod.qya;
import com.google.inputmethod.r58;
import com.google.inputmethod.tya;
import com.google.inputmethod.y23;
import com.google.inputmethod.zw5;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/focus/FocusTargetNode;", "", "a", "(Landroidx/compose/ui/focus/FocusTargetNode;)Z", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class FocusRestorerKt {
    public static final boolean a(FocusTargetNode focusTargetNode) {
        if (!focusTargetNode.v1().c()) {
            return false;
        }
        int iA = ni8.a(1024);
        if (!focusTargetNode.getNode().getIsAttached()) {
            zw5.c("visitChildren called on an unattached node");
        }
        r58 r58Var = new r58(new androidx.compose.ui.b.c[16], 0);
        androidx.compose.ui.b.c child = focusTargetNode.getNode().getChild();
        if (child == null) {
            y23.c(r58Var, focusTargetNode.getNode(), false);
        } else {
            r58Var.c(child);
        }
        while (r58Var.getSize() != 0) {
            androidx.compose.ui.b.c cVarJ = (androidx.compose.ui.b.c) r58Var.u(r58Var.getSize() - 1);
            if ((cVarJ.getAggregateChildKindSet() & iA) == 0) {
                y23.c(r58Var, cVarJ, false);
            } else {
                while (cVarJ != null) {
                    if ((cVarJ.getKindSet() & iA) != 0) {
                        r58 r58Var2 = null;
                        while (cVarJ != null) {
                            if (cVarJ instanceof FocusTargetNode) {
                                FocusTargetNode focusTargetNode2 = (FocusTargetNode) cVarJ;
                                if (focusTargetNode2.v1().c()) {
                                    final int compositeKeyHash = y23.q(focusTargetNode2).getCompositeKeyHash();
                                    focusTargetNode.B3(Integer.valueOf(compositeKeyHash));
                                    qya qyaVar = (qya) cs1.a(focusTargetNode, tya.g());
                                    if (qyaVar != null) {
                                        qyaVar.b("pfc" + y23.q(focusTargetNode).getCompositeKeyHash(), new Function0<Object>() { // from class: androidx.compose.ui.focus.FocusRestorerKt$saveFocusedChild$1$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(0);
                                            }

                                            public final Object invoke() {
                                                return Integer.valueOf(compositeKeyHash);
                                            }
                                        });
                                    }
                                    return true;
                                }
                            } else if ((cVarJ.getKindSet() & iA) != 0 && (cVarJ instanceof k33)) {
                                int i = 0;
                                for (androidx.compose.ui.b.c delegate = ((k33) cVarJ).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                    if ((delegate.getKindSet() & iA) != 0) {
                                        i++;
                                        if (i == 1) {
                                            cVarJ = delegate;
                                        } else {
                                            if (r58Var2 == null) {
                                                r58Var2 = new r58(new androidx.compose.ui.b.c[16], 0);
                                            }
                                            if (cVarJ != null) {
                                                r58Var2.c(cVarJ);
                                                cVarJ = null;
                                            }
                                            r58Var2.c(delegate);
                                        }
                                    }
                                }
                                if (i == 1) {
                                }
                            }
                            cVarJ = y23.j(r58Var2);
                        }
                        break;
                    }
                    cVarJ = cVarJ.getChild();
                }
            }
        }
        return false;
    }
}
