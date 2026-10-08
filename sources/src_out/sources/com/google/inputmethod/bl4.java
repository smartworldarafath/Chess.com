package com.google.inputmethod;

import androidx.compose.ui.b;
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.focus.FocusTransactionsKt;
import androidx.compose.ui.focus.g;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0004\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0011\u0010\u0005\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/google/android/al4;", "", "c", "(Lcom/google/android/al4;)Z", "a", "b", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class bl4 {
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public static final boolean a(al4 al4Var) throws KotlinNothingValueException {
        int iA = ni8.a(1024);
        b.c node = al4Var.getNode();
        r58 r58Var = null;
        while (node != null) {
            if (node instanceof FocusTargetNode) {
                if (FocusTransactionsKt.a((FocusTargetNode) node)) {
                    return true;
                }
            } else if ((node.getKindSet() & iA) != 0 && (node instanceof k33)) {
                int i = 0;
                for (b.c delegate = ((k33) node).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                    if ((delegate.getKindSet() & iA) != 0) {
                        i++;
                        if (i == 1) {
                            node = delegate;
                        } else {
                            if (r58Var == null) {
                                r58Var = new r58(new b.c[16], 0);
                            }
                            if (node != null) {
                                r58Var.c(node);
                                node = null;
                            }
                            r58Var.c(delegate);
                        }
                    }
                }
                if (i == 1) {
                }
            }
            node = y23.j(r58Var);
        }
        if (!al4Var.getNode().getIsAttached()) {
            zw5.c("visitChildren called on an unattached node");
        }
        r58 r58Var2 = new r58(new b.c[16], 0);
        b.c child = al4Var.getNode().getChild();
        if (child == null) {
            y23.c(r58Var2, al4Var.getNode(), false);
        } else {
            r58Var2.c(child);
        }
        while (r58Var2.getSize() != 0) {
            b.c cVarJ = (b.c) r58Var2.u(r58Var2.getSize() - 1);
            if ((cVarJ.getAggregateChildKindSet() & iA) == 0) {
                y23.c(r58Var2, cVarJ, false);
            } else {
                while (cVarJ != null) {
                    if ((cVarJ.getKindSet() & iA) != 0) {
                        r58 r58Var3 = null;
                        while (cVarJ != null) {
                            if (cVarJ instanceof FocusTargetNode) {
                                if (FocusTransactionsKt.a((FocusTargetNode) cVarJ)) {
                                    return true;
                                }
                            } else if ((cVarJ.getKindSet() & iA) != 0 && (cVarJ instanceof k33)) {
                                int i2 = 0;
                                for (b.c delegate2 = ((k33) cVarJ).getDelegate(); delegate2 != null; delegate2 = delegate2.getChild()) {
                                    if ((delegate2.getKindSet() & iA) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            cVarJ = delegate2;
                                        } else {
                                            if (r58Var3 == null) {
                                                r58Var3 = new r58(new b.c[16], 0);
                                            }
                                            if (cVarJ != null) {
                                                r58Var3.c(cVarJ);
                                                cVarJ = null;
                                            }
                                            r58Var3.c(delegate2);
                                        }
                                    }
                                }
                                if (i2 == 1) {
                                }
                            }
                            cVarJ = y23.j(r58Var3);
                        }
                        break;
                    }
                    cVarJ = cVarJ.getChild();
                }
            }
        }
        return false;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public static final boolean b(al4 al4Var) throws KotlinNothingValueException {
        int iA = ni8.a(1024);
        b.c node = al4Var.getNode();
        r58 r58Var = null;
        while (node != null) {
            if (node instanceof FocusTargetNode) {
                if (FocusTransactionsKt.e((FocusTargetNode) node)) {
                    return true;
                }
            } else if ((node.getKindSet() & iA) != 0 && (node instanceof k33)) {
                int i = 0;
                for (b.c delegate = ((k33) node).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                    if ((delegate.getKindSet() & iA) != 0) {
                        i++;
                        if (i == 1) {
                            node = delegate;
                        } else {
                            if (r58Var == null) {
                                r58Var = new r58(new b.c[16], 0);
                            }
                            if (node != null) {
                                r58Var.c(node);
                                node = null;
                            }
                            r58Var.c(delegate);
                        }
                    }
                }
                if (i == 1) {
                }
            }
            node = y23.j(r58Var);
        }
        if (!al4Var.getNode().getIsAttached()) {
            zw5.c("visitChildren called on an unattached node");
        }
        r58 r58Var2 = new r58(new b.c[16], 0);
        b.c child = al4Var.getNode().getChild();
        if (child == null) {
            y23.c(r58Var2, al4Var.getNode(), false);
        } else {
            r58Var2.c(child);
        }
        while (r58Var2.getSize() != 0) {
            b.c cVarJ = (b.c) r58Var2.u(r58Var2.getSize() - 1);
            if ((cVarJ.getAggregateChildKindSet() & iA) == 0) {
                y23.c(r58Var2, cVarJ, false);
            } else {
                while (cVarJ != null) {
                    if ((cVarJ.getKindSet() & iA) != 0) {
                        r58 r58Var3 = null;
                        while (cVarJ != null) {
                            if (cVarJ instanceof FocusTargetNode) {
                                if (FocusTransactionsKt.e((FocusTargetNode) cVarJ)) {
                                    return true;
                                }
                            } else if ((cVarJ.getKindSet() & iA) != 0 && (cVarJ instanceof k33)) {
                                int i2 = 0;
                                for (b.c delegate2 = ((k33) cVarJ).getDelegate(); delegate2 != null; delegate2 = delegate2.getChild()) {
                                    if ((delegate2.getKindSet() & iA) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            cVarJ = delegate2;
                                        } else {
                                            if (r58Var3 == null) {
                                                r58Var3 = new r58(new b.c[16], 0);
                                            }
                                            if (cVarJ != null) {
                                                r58Var3.c(cVarJ);
                                                cVarJ = null;
                                            }
                                            r58Var3.c(delegate2);
                                        }
                                    }
                                }
                                if (i2 == 1) {
                                }
                            }
                            cVarJ = y23.j(r58Var3);
                        }
                        break;
                    }
                    cVarJ = cVarJ.getChild();
                }
            }
        }
        return false;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public static final boolean c(al4 al4Var) throws KotlinNothingValueException {
        int iA = ni8.a(1024);
        b.c node = al4Var.getNode();
        r58 r58Var = null;
        while (node != null) {
            if (node instanceof FocusTargetNode) {
                return g.e0((FocusTargetNode) node, 0, 1, null);
            }
            if ((node.getKindSet() & iA) != 0 && (node instanceof k33)) {
                int i = 0;
                for (b.c delegate = ((k33) node).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                    if ((delegate.getKindSet() & iA) != 0) {
                        i++;
                        if (i == 1) {
                            node = delegate;
                        } else {
                            if (r58Var == null) {
                                r58Var = new r58(new b.c[16], 0);
                            }
                            if (node != null) {
                                r58Var.c(node);
                                node = null;
                            }
                            r58Var.c(delegate);
                        }
                    }
                }
                if (i == 1) {
                }
            }
            node = y23.j(r58Var);
        }
        if (!al4Var.getNode().getIsAttached()) {
            zw5.c("visitChildren called on an unattached node");
        }
        r58 r58Var2 = new r58(new b.c[16], 0);
        b.c child = al4Var.getNode().getChild();
        if (child == null) {
            y23.c(r58Var2, al4Var.getNode(), false);
        } else {
            r58Var2.c(child);
        }
        while (r58Var2.getSize() != 0) {
            b.c cVarJ = (b.c) r58Var2.u(r58Var2.getSize() - 1);
            if ((cVarJ.getAggregateChildKindSet() & iA) == 0) {
                y23.c(r58Var2, cVarJ, false);
            } else {
                while (cVarJ != null) {
                    if ((cVarJ.getKindSet() & iA) != 0) {
                        r58 r58Var3 = null;
                        while (cVarJ != null) {
                            if (cVarJ instanceof FocusTargetNode) {
                                return g.e0((FocusTargetNode) cVarJ, 0, 1, null);
                            }
                            if ((cVarJ.getKindSet() & iA) != 0 && (cVarJ instanceof k33)) {
                                int i2 = 0;
                                for (b.c delegate2 = ((k33) cVarJ).getDelegate(); delegate2 != null; delegate2 = delegate2.getChild()) {
                                    if ((delegate2.getKindSet() & iA) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            cVarJ = delegate2;
                                        } else {
                                            if (r58Var3 == null) {
                                                r58Var3 = new r58(new b.c[16], 0);
                                            }
                                            if (cVarJ != null) {
                                                r58Var3.c(cVarJ);
                                                cVarJ = null;
                                            }
                                            r58Var3.c(delegate2);
                                        }
                                    }
                                }
                                if (i2 == 1) {
                                }
                            }
                            cVarJ = y23.j(r58Var3);
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
