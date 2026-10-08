package com.google.inputmethod;

import androidx.compose.ui.b;
import androidx.compose.ui.node.LayoutNode;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001d\u0010\u0007\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0006*\u00020\u0003*\u00028\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a/\u0010\r\u001a\u00020\f*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\r\u0010\u000e\u001a/\u0010\u000f\u001a\u00020\f\"\b\b\u0000\u0010\u0006*\u00020\u0003*\u00028\u00002\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u000f\u0010\u0010\u001a/\u0010\u0012\u001a\u00020\f*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00110\t¢\u0006\u0004\b\u0012\u0010\u000e\u001a/\u0010\u0013\u001a\u00020\f\"\b\b\u0000\u0010\u0006*\u00020\u0003*\u00028\u00002\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00110\t¢\u0006\u0004\b\u0013\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/google/android/x23;", "", "key", "Lcom/google/android/fhd;", "a", "(Lcom/google/android/x23;Ljava/lang/Object;)Lcom/google/android/fhd;", "T", "b", "(Lcom/google/android/fhd;)Lcom/google/android/fhd;", "Lkotlin/Function1;", "", "block", "", "c", "(Lcom/google/android/x23;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "d", "(Lcom/google/android/fhd;Lkotlin/jvm/functions/Function1;)V", "Landroidx/compose/ui/node/TraversableNode$Companion$TraverseDescendantsAction;", "e", "f", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class ghd {
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX WARN: Code duplicated, block: B:21:0x0056  */
    public static final fhd a(x23 x23Var, Object obj) throws KotlinNothingValueException {
        ki8 nodes;
        int iA = ni8.a(262144);
        boolean z = mq1.isTraversableDelegatesFixEnabled;
        if (!x23Var.getNode().getIsAttached()) {
            zw5.c("visitAncestors called on an unattached node");
        }
        b.c parent = x23Var.getNode().getParent();
        LayoutNode layoutNodeQ = y23.q(x23Var);
        while (layoutNodeQ != null) {
            if ((layoutNodeQ.getNodes().getHead().getAggregateChildKindSet() & iA) != 0) {
                while (parent != null) {
                    if ((parent.getKindSet() & iA) != 0) {
                        b.c cVarJ = parent;
                        r58 r58Var = null;
                        while (cVarJ != null) {
                            if (cVarJ instanceof fhd) {
                                fhd fhdVar = (fhd) cVarJ;
                                if (Intrinsics.e(obj, fhdVar.getTraverseKey())) {
                                    return fhdVar;
                                }
                                if (z) {
                                    if ((cVarJ.getKindSet() & iA) == 0 && (cVarJ instanceof k33)) {
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
                                                        r58Var.c(cVarJ);
                                                        cVarJ = null;
                                                    }
                                                    r58Var.c(delegate);
                                                }
                                            }
                                        }
                                        if (i == 1) {
                                        }
                                    }
                                }
                                cVarJ = y23.j(r58Var);
                            } else {
                                if ((cVarJ.getKindSet() & iA) == 0) {
                                }
                                cVarJ = y23.j(r58Var);
                            }
                        }
                    }
                    parent = parent.getParent();
                }
            }
            layoutNodeQ = layoutNodeQ.C0();
            parent = (layoutNodeQ == null || (nodes = layoutNodeQ.getNodes()) == null) ? null : nodes.getTail();
        }
        return null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX WARN: Code duplicated, block: B:23:0x0060  */
    public static final <T extends fhd> T b(T t) throws KotlinNothingValueException {
        ki8 nodes;
        int iA = ni8.a(262144);
        boolean z = mq1.isTraversableDelegatesFixEnabled;
        if (!t.getNode().getIsAttached()) {
            zw5.c("visitAncestors called on an unattached node");
        }
        b.c parent = t.getNode().getParent();
        LayoutNode layoutNodeQ = y23.q(t);
        while (layoutNodeQ != null) {
            if ((layoutNodeQ.getNodes().getHead().getAggregateChildKindSet() & iA) != 0) {
                while (parent != null) {
                    if ((parent.getKindSet() & iA) != 0) {
                        b.c cVarJ = parent;
                        r58 r58Var = null;
                        while (cVarJ != null) {
                            if (cVarJ instanceof fhd) {
                                T t2 = (T) cVarJ;
                                if (Intrinsics.e(t.getTraverseKey(), t2.getTraverseKey()) && ja.a(t, t2)) {
                                    return t2;
                                }
                                if (z) {
                                    if ((cVarJ.getKindSet() & iA) == 0 && (cVarJ instanceof k33)) {
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
                                                        r58Var.c(cVarJ);
                                                        cVarJ = null;
                                                    }
                                                    r58Var.c(delegate);
                                                }
                                            }
                                        }
                                        if (i == 1) {
                                        }
                                    }
                                }
                                cVarJ = y23.j(r58Var);
                            } else {
                                if ((cVarJ.getKindSet() & iA) == 0) {
                                }
                                cVarJ = y23.j(r58Var);
                            }
                        }
                    }
                    parent = parent.getParent();
                }
            }
            layoutNodeQ = layoutNodeQ.C0();
            parent = (layoutNodeQ == null || (nodes = layoutNodeQ.getNodes()) == null) ? null : nodes.getTail();
        }
        return null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public static final void c(x23 x23Var, Object obj, Function1<? super fhd, Boolean> function1) throws KotlinNothingValueException {
        ki8 nodes;
        boolean z;
        int iA = ni8.a(262144);
        if (!x23Var.getNode().getIsAttached()) {
            zw5.c("visitAncestors called on an unattached node");
        }
        b.c parent = x23Var.getNode().getParent();
        LayoutNode layoutNodeQ = y23.q(x23Var);
        while (layoutNodeQ != null) {
            if ((layoutNodeQ.getNodes().getHead().getAggregateChildKindSet() & iA) != 0) {
                while (parent != null) {
                    if ((parent.getKindSet() & iA) != 0) {
                        b.c cVarJ = parent;
                        r58 r58Var = null;
                        while (cVarJ != null) {
                            if (cVarJ instanceof fhd) {
                                fhd fhdVar = (fhd) cVarJ;
                                if (!(Intrinsics.e(obj, fhdVar.getTraverseKey()) ? ((Boolean) function1.invoke(fhdVar)).booleanValue() : true)) {
                                    return;
                                } else {
                                    z = false;
                                }
                            } else {
                                z = true;
                            }
                            if (z) {
                                if (((cVarJ.getKindSet() & iA) != 0) && (cVarJ instanceof k33)) {
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
                                                    r58Var.c(cVarJ);
                                                    cVarJ = null;
                                                }
                                                r58Var.c(delegate);
                                            }
                                        }
                                    }
                                    if (i == 1) {
                                    }
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
    }

    public static final <T extends fhd> void d(T t, Function1<? super T, Boolean> function1) {
        ki8 nodes;
        boolean z;
        int iA = ni8.a(262144);
        if (!t.getNode().getIsAttached()) {
            zw5.c("visitAncestors called on an unattached node");
        }
        b.c parent = t.getNode().getParent();
        LayoutNode layoutNodeQ = y23.q(t);
        while (layoutNodeQ != null) {
            if ((layoutNodeQ.getNodes().getHead().getAggregateChildKindSet() & iA) != 0) {
                while (parent != null) {
                    if ((parent.getKindSet() & iA) != 0) {
                        b.c cVarJ = parent;
                        r58 r58Var = null;
                        while (cVarJ != null) {
                            if (cVarJ instanceof fhd) {
                                fhd fhdVar = (fhd) cVarJ;
                                if (!((Intrinsics.e(t.getTraverseKey(), fhdVar.getTraverseKey()) && ja.a(t, fhdVar)) ? ((Boolean) function1.invoke(fhdVar)).booleanValue() : true)) {
                                    return;
                                } else {
                                    z = false;
                                }
                            } else {
                                z = true;
                            }
                            if (z) {
                                if (((cVarJ.getKindSet() & iA) != 0) && (cVarJ instanceof k33)) {
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
                                                    r58Var.c(cVarJ);
                                                    cVarJ = null;
                                                }
                                                r58Var.c(delegate);
                                            }
                                        }
                                    }
                                    if (i == 1) {
                                    }
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
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    /*  JADX ERROR: NullPointerException in pass: PrepareForCodeGen
        java.lang.NullPointerException
        */
    public static final void e(com.google.inputmethod.x23 r12, java.lang.Object r13, kotlin.jvm.functions.Function1<? super com.google.inputmethod.fhd, ? extends androidx.compose.ui.node.TraversableNode$Companion$TraverseDescendantsAction> r14) throws kotlin.KotlinNothingValueException {
        /*
            Method dump skipped, instruction units count: 209
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.inputmethod.ghd.e(com.google.android.x23, java.lang.Object, kotlin.jvm.functions.Function1):void");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v10 */
    /*  JADX ERROR: NullPointerException in pass: PrepareForCodeGen
        java.lang.NullPointerException
        */
    public static final <T extends com.google.inputmethod.fhd> void f(T r13, kotlin.jvm.functions.Function1<? super T, ? extends androidx.compose.ui.node.TraversableNode$Companion$TraverseDescendantsAction> r14) throws kotlin.KotlinNothingValueException {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.inputmethod.ghd.f(com.google.android.fhd, kotlin.jvm.functions.Function1):void");
    }
}
