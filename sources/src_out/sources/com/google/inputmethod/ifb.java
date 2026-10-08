package com.google.inputmethod;

import android.os.Trace;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.semantics.SemanticsProperties;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a5\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00010\u0007H\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u0015\u0010\r\u001a\u0004\u0018\u00010\u0000*\u00020\u0000H\u0002¢\u0006\u0004\b\r\u0010\u000e\"\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0010\"\u001e\u0010\u0015\u001a\u00020\u0001*\u00020\u00008@X\u0080\u0004¢\u0006\f\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0012\u0010\u0003\"\u0018\u0010\u0017\u001a\u00020\u0001*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0003\"\u0018\u0010\u0019\u001a\u00020\u0001*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0003¨\u0006\u001a"}, d2 = {"Landroidx/compose/ui/semantics/SemanticsNode;", "", "h", "(Landroidx/compose/ui/semantics/SemanticsNode;)Z", "Lcom/google/android/hfb;", "", "customRootNodeId", "Lkotlin/Function1;", "shouldIgnoreNode", "Lcom/google/android/e16;", "Lcom/google/android/ffb;", "a", "(Lcom/google/android/hfb;ILkotlin/jvm/functions/Function1;)Lcom/google/android/e16;", "f", "(Landroidx/compose/ui/semantics/SemanticsNode;)Landroidx/compose/ui/semantics/SemanticsNode;", "Lcom/google/android/gba;", "Lcom/google/android/gba;", "DefaultFakeNodeBounds", "g", "isHidden$annotations", "(Landroidx/compose/ui/semantics/SemanticsNode;)V", "isHidden", "i", "isPartiallyOffscreenInScrollParent", "j", "isScrollNode", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class ifb {
    private static final gba a = new gba(0.0f, 0.0f, 10.0f, 10.0f);

    public static final e16<ffb> a(hfb hfbVar, int i, Function1<? super SemanticsNode, Boolean> function1) {
        Trace.beginSection("getAllUncoveredSemanticsNodesToIntObjectMap");
        try {
            SemanticsNode semanticsNodeD = hfbVar.d();
            if (semanticsNodeD.getLayoutNode().x() && semanticsNodeD.getLayoutNode().b()) {
                gba gbaVarK = semanticsNodeD.k();
                o48 o48Var = new o48(48);
                ofb ofbVarA = pfb.a();
                ofbVarA.a(l16.c(gbaVarK));
                d(semanticsNodeD, o48Var, function1, i, semanticsNodeD, pfb.a(), ofbVarA);
                return o48Var;
            }
            return f16.a();
        } finally {
            Trace.endSection();
        }
    }

    private static final void b(o48<ffb> o48Var, Function1<? super SemanticsNode, Boolean> function1, SemanticsNode semanticsNode, int i, SemanticsNode semanticsNode2, ofb ofbVar, ofb ofbVar2) {
        if (!semanticsNode2.getLayoutNode().x() || !semanticsNode2.getLayoutNode().b() || ofbVar2.isEmpty()) {
            if (semanticsNode2.A()) {
                c(o48Var, semanticsNode, i, semanticsNode2);
                return;
            }
            return;
        }
        gba gbaVarX = semanticsNode2.x();
        if (gbaVarX.r()) {
            gbaVarX = semanticsNode2.y();
        }
        k16 k16VarC = l16.c(gbaVarX);
        ofbVar.a(k16VarC);
        if (ofbVar.c(ofbVar2)) {
            o48Var.r(e(semanticsNode, i, semanticsNode2), new ffb(semanticsNode2, ofbVar.getBounds()));
            List<SemanticsNode> listV = semanticsNode2.v();
            for (int size = listV.size() - 1; -1 < size; size--) {
                if (!((Boolean) function1.invoke(listV.get(size))).booleanValue()) {
                    b(o48Var, function1, semanticsNode, i, listV.get(size), ofbVar, ofbVar2);
                }
            }
            if (h(semanticsNode2)) {
                ofbVar2.b(k16VarC);
            }
        }
    }

    private static final void c(o48<ffb> o48Var, SemanticsNode semanticsNode, int i, SemanticsNode semanticsNode2) {
        un6 un6VarR;
        SemanticsNode semanticsNodeT = semanticsNode2.t();
        o48Var.r(e(semanticsNode, i, semanticsNode2), new ffb(semanticsNode2, l16.c((semanticsNodeT == null || (un6VarR = semanticsNodeT.r()) == null || !un6VarR.x()) ? a : semanticsNodeT.k())));
    }

    private static final void d(SemanticsNode semanticsNode, o48<ffb> o48Var, Function1<? super SemanticsNode, Boolean> function1, int i, SemanticsNode semanticsNode2, ofb ofbVar, ofb ofbVar2) {
        int i2 = i;
        boolean z = (semanticsNode2.getLayoutNode().x() && semanticsNode2.getLayoutNode().b()) ? false : true;
        if (!ofbVar2.isEmpty() || semanticsNode2.getId() == semanticsNode.getId()) {
            if (!z || semanticsNode2.A()) {
                k16 k16VarC = l16.c(semanticsNode2.x());
                ofb ofbVar3 = ofbVar;
                ofbVar3.a(k16VarC);
                int iE = e(semanticsNode, i, semanticsNode2);
                if (!ofbVar.c(ofbVar2)) {
                    if (semanticsNode2.A()) {
                        c(o48Var, semanticsNode, i, semanticsNode2);
                        return;
                    } else {
                        if (iE == i2) {
                            o48Var.r(iE, new ffb(semanticsNode2, ofbVar.getBounds()));
                            return;
                        }
                        return;
                    }
                }
                o48Var.r(iE, new ffb(semanticsNode2, ofbVar3.getBounds()));
                List<SemanticsNode> listV = semanticsNode2.v();
                if (mq1.isAccessibilityShouldIncludeOffscreenChildrenEnabled && semanticsNode2.getUnmergedConfig().getIsMergingSemanticsOfDescendants() && i(semanticsNode2)) {
                    ofb ofbVarA = pfb.a();
                    ofbVarA.a(l16.c(semanticsNode2.y()));
                    int size = listV.size() - 1;
                    while (-1 < size) {
                        if (!((Boolean) function1.invoke(listV.get(size))).booleanValue()) {
                            b(o48Var, function1, semanticsNode, i2, listV.get(size), pfb.a(), ofbVarA);
                        }
                        size--;
                        i2 = i;
                    }
                } else {
                    int size2 = listV.size() - 1;
                    while (-1 < size2) {
                        if (!((Boolean) function1.invoke(listV.get(size2))).booleanValue()) {
                            d(semanticsNode, o48Var, function1, i, listV.get(size2), ofbVar3, ofbVar2);
                        }
                        size2--;
                        ofbVar3 = ofbVar;
                    }
                }
                if (h(semanticsNode2)) {
                    ofbVar2.b(k16VarC);
                }
            }
        }
    }

    private static final int e(SemanticsNode semanticsNode, int i, SemanticsNode semanticsNode2) {
        return semanticsNode2.getId() == semanticsNode.getId() ? i : semanticsNode2.getId();
    }

    private static final SemanticsNode f(SemanticsNode semanticsNode) {
        for (SemanticsNode semanticsNodeT = semanticsNode.t(); semanticsNodeT != null; semanticsNodeT = semanticsNodeT.t()) {
            if (j(semanticsNodeT)) {
                return semanticsNodeT;
            }
        }
        return null;
    }

    public static final boolean g(SemanticsNode semanticsNode) {
        if (semanticsNode.C()) {
            return true;
        }
        seb unmergedConfig = semanticsNode.getUnmergedConfig();
        SemanticsProperties semanticsProperties = SemanticsProperties.a;
        return unmergedConfig.d(semanticsProperties.l()) || semanticsNode.getUnmergedConfig().d(semanticsProperties.r());
    }

    public static final boolean h(SemanticsNode semanticsNode) {
        if (g(semanticsNode)) {
            return false;
        }
        return semanticsNode.getUnmergedConfig().getIsMergingSemanticsOfDescendants() || semanticsNode.getUnmergedConfig().e();
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001d  */
    private static final boolean i(SemanticsNode semanticsNode) {
        kn6 kn6VarV;
        SemanticsNode semanticsNodeF = f(semanticsNode);
        if (semanticsNodeF != null) {
            NodeCoordinator nodeCoordinatorF = semanticsNode.f();
            kn6 kn6VarV2 = null;
            if (nodeCoordinatorF == null) {
                kn6VarV = null;
            } else {
                if (!nodeCoordinatorF.b()) {
                    nodeCoordinatorF = null;
                }
                if (nodeCoordinatorF != null) {
                    kn6VarV = nodeCoordinatorF.v();
                } else {
                    kn6VarV = null;
                }
            }
            NodeCoordinator nodeCoordinatorF2 = semanticsNodeF.f();
            if (nodeCoordinatorF2 != null) {
                if (!nodeCoordinatorF2.b()) {
                    nodeCoordinatorF2 = null;
                }
                if (nodeCoordinatorF2 != null) {
                    kn6VarV2 = nodeCoordinatorF2.v();
                }
            }
            if (kn6VarV != null && kn6VarV2 != null) {
                gba gbaVarR = kn6VarV2.R(kn6VarV, false);
                return !Intrinsics.e(gbaVarR, gbaVarR.q(kba.c(rn8.INSTANCE.c(), r16.e(kn6VarV2.a()))));
            }
        }
        return false;
    }

    private static final boolean j(SemanticsNode semanticsNode) {
        seb unmergedConfig = semanticsNode.getUnmergedConfig();
        SemanticsProperties semanticsProperties = SemanticsProperties.a;
        return unmergedConfig.d(semanticsProperties.S()) || semanticsNode.getUnmergedConfig().d(semanticsProperties.m());
    }
}
