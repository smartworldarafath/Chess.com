package com.google.inputmethod;

import androidx.compose.ui.b;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.semantics.SemanticsProperties;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\n\u001a\u00020\u0007*\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\t\"\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u000b*\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "", "mergingEnabled", "Landroidx/compose/ui/semantics/SemanticsNode;", "a", "(Landroidx/compose/ui/node/LayoutNode;Z)Landroidx/compose/ui/semantics/SemanticsNode;", "", "e", "(Landroidx/compose/ui/semantics/SemanticsNode;)I", "g", "Lcom/google/android/hpa;", "f", "(Landroidx/compose/ui/semantics/SemanticsNode;)Lcom/google/android/hpa;", "role", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class efb {
    /* JADX WARN: Code duplicated, block: B:36:0x0075 A[LOOP:0: B:5:0x0016->B:36:0x0075, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:44:0x007a A[EDGE_INSN: B:44:0x007a->B:37:0x007a BREAK  A[LOOP:0: B:5:0x0016->B:36:0x0075], SYNTHETIC] */
    public static final SemanticsNode a(LayoutNode layoutNode, boolean z) {
        ki8 ki8VarV0 = layoutNode.getNodes();
        int iA = ni8.a(8);
        Object obj = null;
        if ((ki8VarV0.i() & iA) != 0) {
            loop0: for (b.c head = ki8VarV0.getHead(); head != null; head = head.getChild()) {
                if ((head.getKindSet() & iA) == 0) {
                    if ((head.getAggregateChildKindSet() & iA) != 0) {
                        break;
                        break;
                    }
                } else {
                    b.c cVarJ = head;
                    r58 r58Var = null;
                    while (cVarJ != null) {
                        if (cVarJ instanceof bfb) {
                            obj = cVarJ;
                            break loop0;
                        }
                        if ((cVarJ.getKindSet() & iA) != 0 && (cVarJ instanceof k33)) {
                            int i = 0;
                            for (b.c cVarN3 = ((k33) cVarJ).getDelegate(); cVarN3 != null; cVarN3 = cVarN3.getChild()) {
                                if ((cVarN3.getKindSet() & iA) != 0) {
                                    i++;
                                    if (i == 1) {
                                        cVarJ = cVarN3;
                                    } else {
                                        if (r58Var == null) {
                                            r58Var = new r58(new b.c[16], 0);
                                        }
                                        if (cVarJ != null) {
                                            r58Var.c(cVarJ);
                                            cVarJ = null;
                                        }
                                        r58Var.c(cVarN3);
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                        cVarJ = y23.j(r58Var);
                    }
                    if ((head.getAggregateChildKindSet() & iA) != 0) {
                        break;
                    }
                }
            }
        }
        Intrinsics.g(obj);
        b.c node = ((bfb) obj).getNode();
        seb sebVarG = layoutNode.g();
        if (sebVarG == null) {
            sebVarG = new seb();
        }
        return new SemanticsNode(node, z, layoutNode, sebVarG);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int e(SemanticsNode semanticsNode) {
        return semanticsNode.getId() + 2000000000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final hpa f(SemanticsNode semanticsNode) {
        return (hpa) SemanticsConfigurationKt.a(semanticsNode.getUnmergedConfig(), SemanticsProperties.a.F());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int g(SemanticsNode semanticsNode) {
        return semanticsNode.getId() + 1000000000;
    }
}
