package com.google.inputmethod;

import androidx.compose.ui.b;
import androidx.compose.ui.focus.FocusTargetNode;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/google/android/tk4;", "", "a", "(Lcom/google/android/tk4;)V", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class uk4 {
    public static final void a(tk4 tk4Var) {
        int iA = ni8.a(1024);
        if (!tk4Var.getNode().getIsAttached()) {
            zw5.c("visitChildren called on an unattached node");
        }
        r58 r58Var = new r58(new b.c[16], 0);
        b.c child = tk4Var.getNode().getChild();
        if (child == null) {
            y23.c(r58Var, tk4Var.getNode(), false);
        } else {
            r58Var.c(child);
        }
        while (r58Var.getSize() != 0) {
            b.c cVarJ = (b.c) r58Var.u(r58Var.getSize() - 1);
            if ((cVarJ.getAggregateChildKindSet() & iA) == 0) {
                y23.c(r58Var, cVarJ, false);
            } else {
                while (cVarJ != null) {
                    if ((cVarJ.getKindSet() & iA) != 0) {
                        r58 r58Var2 = null;
                        while (cVarJ != null) {
                            if (cVarJ instanceof FocusTargetNode) {
                                fl4.a((FocusTargetNode) cVarJ);
                            } else if ((cVarJ.getKindSet() & iA) != 0 && (cVarJ instanceof k33)) {
                                int i = 0;
                                for (b.c delegate = ((k33) cVarJ).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                    if ((delegate.getKindSet() & iA) != 0) {
                                        i++;
                                        if (i == 1) {
                                            cVarJ = delegate;
                                        } else {
                                            if (r58Var2 == null) {
                                                r58Var2 = new r58(new b.c[16], 0);
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
    }
}
