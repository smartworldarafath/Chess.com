package com.google.inputmethod;

import androidx.compose.ui.b;
import androidx.compose.ui.layout.BeyondBoundsLayoutKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.c;
import androidx.compose.ui.node.m;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a!\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00000\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a)\u0010\t\u001a\u00020\b*\b\u0012\u0004\u0012\u00020\u00060\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\t\u0010\n\u001a\u001f\u0010\u000e\u001a\u00020\u0001*\u00020\u000b2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\fH\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001f\u0010\u0012\u001a\u00020\u0011*\u00020\u000b2\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\fH\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0013\u0010\u0014\u001a\u00020\u0000*\u00020\u000bH\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0013\u0010\u0017\u001a\u00020\u0016*\u00020\u000bH\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0013\u0010\u001a\u001a\u00020\u0019*\u00020\u000bH\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0011\u0010\u001c\u001a\u00020\b*\u00020\u000b¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0011\u0010\u001f\u001a\u00020\u001e*\u00020\u000b¢\u0006\u0004\b\u001f\u0010 \u001a\u0011\u0010\"\u001a\u00020!*\u00020\u000b¢\u0006\u0004\b\"\u0010#\u001a\u0011\u0010%\u001a\u00020$*\u00020\u000b¢\u0006\u0004\b%\u0010&\u001a\u0011\u0010(\u001a\u00020'*\u00020\u000b¢\u0006\u0004\b(\u0010)\u001a\u0019\u0010,\u001a\u00020\b*\u00020\u000b2\u0006\u0010+\u001a\u00020*¢\u0006\u0004\b,\u0010-\u001a\u0013\u0010/\u001a\u0004\u0018\u00010.*\u00020\u000b¢\u0006\u0004\b/\u00100\u001a\u0015\u00102\u001a\u0004\u0018\u000101*\u00020\u0006H\u0000¢\u0006\u0004\b2\u00103\u001a\u001d\u00104\u001a\u0004\u0018\u00010\u0006*\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003H\u0002¢\u0006\u0004\b4\u00105\"\u0018\u00108\u001a\u00020\u0001*\u00020\u000b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b6\u00107¨\u00069"}, d2 = {"Landroidx/compose/ui/node/LayoutNode;", "", "zOrder", "Lcom/google/android/r58;", "g", "(Landroidx/compose/ui/node/LayoutNode;Z)Lcom/google/android/r58;", "Landroidx/compose/ui/b$c;", "node", "", "c", "(Lcom/google/android/r58;Landroidx/compose/ui/b$c;Z)V", "Lcom/google/android/x23;", "Lcom/google/android/ni8;", "type", "h", "(Lcom/google/android/x23;I)Z", "kind", "Landroidx/compose/ui/node/NodeCoordinator;", "l", "(Lcom/google/android/x23;I)Landroidx/compose/ui/node/NodeCoordinator;", "q", "(Lcom/google/android/x23;)Landroidx/compose/ui/node/LayoutNode;", "Lcom/google/android/teb;", "s", "(Lcom/google/android/x23;)Lcom/google/android/teb;", "Landroidx/compose/ui/node/m;", "r", "(Lcom/google/android/x23;)Landroidx/compose/ui/node/m;", "k", "(Lcom/google/android/x23;)V", "Lcom/google/android/f43;", "m", "(Lcom/google/android/x23;)Lcom/google/android/f43;", "Lcom/google/android/i05;", "n", "(Lcom/google/android/x23;)Lcom/google/android/i05;", "Landroidx/compose/ui/unit/LayoutDirection;", "p", "(Lcom/google/android/x23;)Landroidx/compose/ui/unit/LayoutDirection;", "Lcom/google/android/kn6;", "o", "(Lcom/google/android/x23;)Lcom/google/android/kn6;", "Lcom/google/android/rn8;", "delta", "e", "(Lcom/google/android/x23;J)V", "Lcom/google/android/hm0;", "f", "(Lcom/google/android/x23;)Lcom/google/android/hm0;", "Landroidx/compose/ui/node/c;", "d", "(Landroidx/compose/ui/b$c;)Landroidx/compose/ui/node/c;", "j", "(Lcom/google/android/r58;)Landroidx/compose/ui/b$c;", "i", "(Lcom/google/android/x23;)Z", "isDelegationRoot", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class y23 {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public static final void c(r58<b.c> r58Var, b.c cVar, boolean z) throws KotlinNothingValueException {
        r58<LayoutNode> r58VarG = g(q(cVar), z);
        int size = r58VarG.getSize() - 1;
        LayoutNode[] layoutNodeArr = r58VarG.content;
        if (size < layoutNodeArr.length) {
            while (size >= 0) {
                r58Var.c(layoutNodeArr[size].getNodes().getHead());
                size--;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final c d(b.c cVar) {
        if ((ni8.a(2) & cVar.getKindSet()) != 0) {
            if (cVar instanceof c) {
                return (c) cVar;
            }
            if (cVar instanceof k33) {
                b.c cVarN3 = ((k33) cVar).getDelegate();
                while (cVarN3 != 0) {
                    if (cVarN3 instanceof c) {
                        return (c) cVarN3;
                    }
                    cVarN3 = (!(cVarN3 instanceof k33) || (ni8.a(2) & cVarN3.getKindSet()) == 0) ? cVarN3.getChild() : ((k33) cVarN3).getDelegate();
                }
            }
        }
        return null;
    }

    public static final void e(x23 x23Var, long j) {
        r(x23Var).G(j);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [androidx.compose.ui.b$c] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v9 */
    public static final hm0 f(x23 x23Var) throws KotlinNothingValueException {
        ki8 ki8VarV0;
        ?? parent;
        ?? r6;
        int iA = ni8.a(8388608) | ni8.a(32);
        if (!x23Var.getNode().getIsAttached()) {
            zw5.c("visitAncestors called on an unattached node");
        }
        b.c parent2 = x23Var.getNode().getParent();
        LayoutNode layoutNodeQ = q(x23Var);
        while (layoutNodeQ != null) {
            if ((layoutNodeQ.getNodes().getHead().getAggregateChildKindSet() & iA) != 0) {
                while (parent != 0) {
                    if ((parent.getKindSet() & iA) != 0) {
                        if ((ni8.a(8388608) & parent.getKindSet()) != 0) {
                            if (!(parent instanceof im0)) {
                                if (parent instanceof k33) {
                                    b.c cVarN3 = ((k33) parent).getDelegate();
                                    parent = 0;
                                    while (cVarN3 != null) {
                                        if (cVarN3 instanceof im0) {
                                            parent = cVarN3;
                                        }
                                        cVarN3 = cVarN3.getChild();
                                        parent = parent;
                                    }
                                } else {
                                    parent = 0;
                                }
                            }
                            im0 im0Var = (im0) parent;
                            if (im0Var != null) {
                                return im0Var.X0();
                            }
                            return null;
                        }
                        if ((ni8.a(32) & parent.getKindSet()) == 0) {
                            continue;
                        } else {
                            if (parent instanceof qy7) {
                                r6 = parent;
                            } else if (parent instanceof k33) {
                                b.c cVarN4 = ((k33) parent).getDelegate();
                                r6 = 0;
                                while (cVarN4 != null) {
                                    if (cVarN4 instanceof qy7) {
                                        r6 = cVarN4;
                                    }
                                    cVarN4 = cVarN4.getChild();
                                    r6 = r6;
                                }
                            } else {
                                r6 = 0;
                            }
                            qy7 qy7Var = (qy7) r6;
                            if (qy7Var != null && qy7Var.c0().a(BeyondBoundsLayoutKt.a())) {
                                return (hm0) qy7Var.c0().b(BeyondBoundsLayoutKt.a());
                            }
                        }
                    }
                    parent = parent.getParent();
                }
            }
            parent = parent2;
            layoutNodeQ = layoutNodeQ.C0();
            parent2 = (layoutNodeQ == null || (ki8VarV0 = layoutNodeQ.getNodes()) == null) ? null : ki8VarV0.getTail();
        }
        return null;
    }

    private static final r58<LayoutNode> g(LayoutNode layoutNode, boolean z) {
        return z ? layoutNode.K0() : layoutNode.L0();
    }

    public static final boolean h(x23 x23Var, int i) {
        return (x23Var.getNode().getAggregateChildKindSet() & i) != 0;
    }

    public static final boolean i(x23 x23Var) {
        return x23Var.getNode() == x23Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b.c j(r58<b.c> r58Var) {
        if (r58Var == null || r58Var.getSize() == 0) {
            return null;
        }
        return r58Var.u(r58Var.getSize() - 1);
    }

    public static final void k(x23 x23Var) {
        q(x23Var).C1();
    }

    public static final NodeCoordinator l(x23 x23Var, int i) {
        NodeCoordinator coordinator = x23Var.getNode().getCoordinator();
        Intrinsics.g(coordinator);
        if (coordinator.j3() != x23Var || !oi8.i(i)) {
            return coordinator;
        }
        NodeCoordinator nodeCoordinatorL3 = coordinator.getWrapped();
        Intrinsics.g(nodeCoordinatorL3);
        return nodeCoordinatorL3;
    }

    public static final f43 m(x23 x23Var) {
        return q(x23Var).getDensity();
    }

    public static final i05 n(x23 x23Var) {
        return r(x23Var).getGraphicsContext();
    }

    public static final kn6 o(x23 x23Var) {
        if (!x23Var.getNode().getIsAttached()) {
            zw5.c("Cannot get LayoutCoordinates, Modifier.Node is not attached.");
        }
        kn6 kn6VarV = l(x23Var, ni8.a(2)).v();
        if (!kn6VarV.b()) {
            zw5.c("LayoutCoordinates is not attached.");
        }
        return kn6VarV;
    }

    public static final LayoutDirection p(x23 x23Var) {
        return q(x23Var).getLayoutDirection();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public static final LayoutNode q(x23 x23Var) throws KotlinNothingValueException {
        NodeCoordinator coordinator = x23Var.getNode().getCoordinator();
        if (coordinator != null) {
            return coordinator.getLayoutNode();
        }
        zw5.d("Cannot obtain node coordinator. Is the Modifier.Node attached?");
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public static final m r(x23 x23Var) throws KotlinNothingValueException {
        m mVarB0 = q(x23Var).getOwner();
        if (mVarB0 != null) {
            return mVarB0;
        }
        zw5.d("This node does not have an owner.");
        throw new KotlinNothingValueException();
    }

    public static final teb s(x23 x23Var) {
        return q(x23Var);
    }
}
