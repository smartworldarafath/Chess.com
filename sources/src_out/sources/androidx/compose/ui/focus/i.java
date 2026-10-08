package androidx.compose.ui.focus;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.inputmethod.c41;
import com.google.inputmethod.gba;
import com.google.inputmethod.k33;
import com.google.inputmethod.ki8;
import com.google.inputmethod.kn6;
import com.google.inputmethod.ln6;
import com.google.inputmethod.ni8;
import com.google.inputmethod.r58;
import com.google.inputmethod.y23;
import com.google.inputmethod.zw5;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\u001a#\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001aC\u0010\r\u001a\u0004\u0018\u00010\u000b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000b0\nH\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u0013\u0010\u000f\u001a\u00020\b*\u00020\u0000H\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u0000*\u00020\u0000H\u0002¢\u0006\u0004\b\u0013\u0010\u0012\"\u0018\u0010\u0016\u001a\u00020\u000b*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\"\u001a\u0010\u0018\u001a\u0004\u0018\u00010\u0000*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0012¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/focus/FocusTargetNode;", "Landroidx/compose/ui/focus/b;", "focusDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/focus/f;", "a", "(Landroidx/compose/ui/focus/FocusTargetNode;ILandroidx/compose/ui/unit/LayoutDirection;)Landroidx/compose/ui/focus/f;", "Lcom/google/android/gba;", "previouslyFocusedRect", "Lkotlin/Function1;", "", "onFound", "e", "(Landroidx/compose/ui/focus/FocusTargetNode;ILandroidx/compose/ui/unit/LayoutDirection;Lcom/google/android/gba;Lkotlin/jvm/functions/Function1;)Ljava/lang/Boolean;", "d", "(Landroidx/compose/ui/focus/FocusTargetNode;)Lcom/google/android/gba;", "b", "(Landroidx/compose/ui/focus/FocusTargetNode;)Landroidx/compose/ui/focus/FocusTargetNode;", "c", "g", "(Landroidx/compose/ui/focus/FocusTargetNode;)Z", "isEligibleForFocusSearch", "f", "activeChild", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class i {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            try {
                iArr[LayoutDirection.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LayoutDirection.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[FocusStateImpl.values().length];
            try {
                iArr2[FocusStateImpl.Active.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[FocusStateImpl.ActiveParent.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[FocusStateImpl.Captured.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[FocusStateImpl.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final f a(FocusTargetNode focusTargetNode, int i, LayoutDirection layoutDirection) throws NoWhenBranchMatchedException, KotlinNothingValueException {
        f end;
        f fVar;
        f start;
        FocusProperties focusPropertiesT3 = focusTargetNode.t3();
        b.Companion companion = b.INSTANCE;
        if (b.l(i, companion.e())) {
            return focusPropertiesT3.getNext();
        }
        if (b.l(i, companion.f())) {
            return focusPropertiesT3.getPrevious();
        }
        if (b.l(i, companion.h())) {
            return focusPropertiesT3.getUp();
        }
        if (b.l(i, companion.a())) {
            return focusPropertiesT3.getDown();
        }
        if (b.l(i, companion.d())) {
            int i2 = a.$EnumSwitchMapping$0[layoutDirection.ordinal()];
            if (i2 == 1) {
                start = focusPropertiesT3.getStart();
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                start = focusPropertiesT3.getEnd();
            }
            fVar = start != f.INSTANCE.b() ? start : null;
            return fVar == null ? focusPropertiesT3.getLeft() : fVar;
        }
        if (b.l(i, companion.g())) {
            int i3 = a.$EnumSwitchMapping$0[layoutDirection.ordinal()];
            if (i3 == 1) {
                end = focusPropertiesT3.getEnd();
            } else {
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                end = focusPropertiesT3.getStart();
            }
            fVar = end != f.INSTANCE.b() ? end : null;
            return fVar == null ? focusPropertiesT3.getRight() : fVar;
        }
        if (!b.l(i, companion.b()) && !b.l(i, companion.c())) {
            throw new IllegalStateException("invalid FocusDirection");
        }
        c41 c41Var = new c41(i, null);
        FocusOwner focusOwner = y23.r(focusTargetNode).getFocusOwner();
        FocusTargetNode focusTargetNodeI = focusOwner.i();
        if (b.l(i, companion.b())) {
            focusPropertiesT3.n().invoke(c41Var);
        } else {
            focusPropertiesT3.o().invoke(c41Var);
        }
        if (c41Var.getIsCanceled()) {
            return f.INSTANCE.a();
        }
        return focusTargetNodeI != focusOwner.i() ? f.INSTANCE.c() : f.INSTANCE.b();
    }

    public static final FocusTargetNode b(FocusTargetNode focusTargetNode) {
        FocusTargetNode focusTargetNodeI = y23.r(focusTargetNode).getFocusOwner().i();
        if (focusTargetNodeI == null || !focusTargetNodeI.getIsAttached()) {
            return null;
        }
        return focusTargetNodeI;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    private static final FocusTargetNode c(FocusTargetNode focusTargetNode) throws KotlinNothingValueException {
        ki8 nodes;
        int iA = ni8.a(1024);
        if (!focusTargetNode.getNode().getIsAttached()) {
            zw5.c("visitAncestors called on an unattached node");
        }
        androidx.compose.ui.b.c parent = focusTargetNode.getNode().getParent();
        LayoutNode layoutNodeQ = y23.q(focusTargetNode);
        while (layoutNodeQ != null) {
            if ((layoutNodeQ.getNodes().getHead().getAggregateChildKindSet() & iA) != 0) {
                while (parent != null) {
                    if ((parent.getKindSet() & iA) != 0) {
                        androidx.compose.ui.b.c cVarJ = parent;
                        r58 r58Var = null;
                        while (cVarJ != null) {
                            if (cVarJ instanceof FocusTargetNode) {
                                FocusTargetNode focusTargetNode2 = (FocusTargetNode) cVarJ;
                                if (focusTargetNode2.t3().getCanFocus()) {
                                    return focusTargetNode2;
                                }
                            } else if ((cVarJ.getKindSet() & iA) != 0 && (cVarJ instanceof k33)) {
                                int i = 0;
                                for (androidx.compose.ui.b.c delegate = ((k33) cVarJ).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                    if ((delegate.getKindSet() & iA) != 0) {
                                        i++;
                                        if (i == 1) {
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
        return null;
    }

    public static final gba d(FocusTargetNode focusTargetNode) {
        kn6 kn6VarF;
        if (!focusTargetNode.getIsAttached()) {
            return gba.INSTANCE.a();
        }
        NodeCoordinator coordinator = focusTargetNode.getCoordinator();
        if (coordinator != null && (kn6VarF = ln6.f(coordinator)) != null) {
            if (!kn6VarF.b()) {
                kn6VarF = null;
            }
            if (kn6VarF != null) {
                return focusTargetNode.u3(kn6VarF);
            }
        }
        return gba.INSTANCE.a();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final Boolean e(FocusTargetNode focusTargetNode, int i, LayoutDirection layoutDirection, gba gbaVar, Function1<? super FocusTargetNode, Boolean> function1) throws NoWhenBranchMatchedException {
        int iG;
        b.Companion companion = b.INSTANCE;
        if (b.l(i, companion.e()) || b.l(i, companion.f())) {
            return Boolean.valueOf(OneDimensionalFocusSearchKt.f(focusTargetNode, i, function1));
        }
        if (b.l(i, companion.d()) || b.l(i, companion.g()) || b.l(i, companion.h()) || b.l(i, companion.a())) {
            return TwoDimensionalFocusSearchKt.t(focusTargetNode, i, gbaVar, function1);
        }
        if (!b.l(i, companion.b())) {
            if (b.l(i, companion.c())) {
                FocusTargetNode focusTargetNodeB = b(focusTargetNode);
                FocusTargetNode focusTargetNodeC = focusTargetNodeB != null ? c(focusTargetNodeB) : null;
                return Boolean.valueOf((focusTargetNodeC == null || Intrinsics.e(focusTargetNodeC, focusTargetNode)) ? false : ((Boolean) function1.invoke(focusTargetNodeC)).booleanValue());
            }
            throw new IllegalStateException(("Focus search invoked with invalid FocusDirection " + ((Object) b.n(i))).toString());
        }
        int i2 = a.$EnumSwitchMapping$0[layoutDirection.ordinal()];
        if (i2 == 1) {
            iG = companion.g();
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            iG = companion.d();
        }
        FocusTargetNode focusTargetNodeB2 = b(focusTargetNode);
        if (focusTargetNodeB2 != null) {
            return TwoDimensionalFocusSearchKt.t(focusTargetNodeB2, iG, gbaVar, function1);
        }
        return null;
    }

    public static final FocusTargetNode f(FocusTargetNode focusTargetNode) {
        if (!focusTargetNode.getNode().getIsAttached()) {
            return null;
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
                                if (focusTargetNode2.getNode().getIsAttached()) {
                                    int i = a.$EnumSwitchMapping$1[focusTargetNode2.v1().ordinal()];
                                    if (i == 1 || i == 2 || i == 3) {
                                        return focusTargetNode2;
                                    }
                                    if (i != 4) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                }
                            } else if ((cVarJ.getKindSet() & iA) != 0 && (cVarJ instanceof k33)) {
                                int i2 = 0;
                                for (androidx.compose.ui.b.c delegate = ((k33) cVarJ).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                    if ((delegate.getKindSet() & iA) != 0) {
                                        i2++;
                                        if (i2 == 1) {
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
                                if (i2 == 1) {
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
        return null;
    }

    public static final boolean g(FocusTargetNode focusTargetNode) {
        LayoutNode layoutNode;
        NodeCoordinator coordinator;
        LayoutNode layoutNode2;
        NodeCoordinator coordinator2 = focusTargetNode.getCoordinator();
        return (coordinator2 == null || (layoutNode = coordinator2.getLayoutNode()) == null || !layoutNode.x() || (coordinator = focusTargetNode.getCoordinator()) == null || (layoutNode2 = coordinator.getLayoutNode()) == null || !layoutNode2.b()) ? false : true;
    }
}
