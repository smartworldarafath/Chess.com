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
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\u001a/\u0010\u0006\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a'\u0010\b\u001a\u00020\u0004*\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0002¢\u0006\u0004\b\b\u0010\t\u001a'\u0010\n\u001a\u00020\u0004*\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0002¢\u0006\u0004\b\n\u0010\t\u001a7\u0010\f\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0002¢\u0006\u0004\b\f\u0010\r\u001a7\u0010\u000e\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0002¢\u0006\u0004\b\u000e\u0010\r\u001a'\u0010\u000f\u001a\u00020\u0004*\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0002¢\u0006\u0004\b\u000f\u0010\t\u001a'\u0010\u0010\u001a\u00020\u0004*\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0002¢\u0006\u0004\b\u0010\u0010\t\u001a\u0013\u0010\u0011\u001a\u00020\u0004*\u00020\u0000H\u0002¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/focus/FocusTargetNode;", "Landroidx/compose/ui/focus/b;", "direction", "Lkotlin/Function1;", "", "onFound", "f", "(Landroidx/compose/ui/focus/FocusTargetNode;ILkotlin/jvm/functions/Function1;)Z", "c", "(Landroidx/compose/ui/focus/FocusTargetNode;Lkotlin/jvm/functions/Function1;)Z", "b", "focusedItem", "d", "(Landroidx/compose/ui/focus/FocusTargetNode;Landroidx/compose/ui/focus/FocusTargetNode;ILkotlin/jvm/functions/Function1;)Z", "i", "h", "g", "e", "(Landroidx/compose/ui/focus/FocusTargetNode;)Z", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class OneDimensionalFocusSearchKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FocusStateImpl.values().length];
            try {
                iArr[FocusStateImpl.ActiveParent.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FocusStateImpl.Active.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FocusStateImpl.Captured.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FocusStateImpl.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private static final boolean b(FocusTargetNode focusTargetNode, Function1<? super FocusTargetNode, Boolean> function1) throws NoWhenBranchMatchedException, KotlinNothingValueException {
        FocusStateImpl focusStateImplV1 = focusTargetNode.v1();
        int[] iArr = a.$EnumSwitchMapping$0;
        int i = iArr[focusStateImplV1.ordinal()];
        if (i != 1) {
            if (i == 2 || i == 3) {
                return g(focusTargetNode, function1);
            }
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            if (!g(focusTargetNode, function1)) {
                if (!(focusTargetNode.t3().getCanFocus() ? ((Boolean) function1.invoke(focusTargetNode)).booleanValue() : false)) {
                    return false;
                }
            }
            return true;
        }
        FocusTargetNode focusTargetNodeF = i.f(focusTargetNode);
        if (focusTargetNodeF == null) {
            throw new IllegalStateException("ActiveParent must have a focusedChild");
        }
        int i2 = iArr[focusTargetNodeF.v1().ordinal()];
        if (i2 == 1) {
            return b(focusTargetNodeF, function1) || d(focusTargetNode, focusTargetNodeF, b.INSTANCE.f(), function1) || (focusTargetNodeF.t3().getCanFocus() && ((Boolean) function1.invoke(focusTargetNodeF)).booleanValue());
        }
        if (i2 == 2 || i2 == 3) {
            return d(focusTargetNode, focusTargetNodeF, b.INSTANCE.f(), function1);
        }
        if (i2 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        throw new IllegalStateException("ActiveParent must have a focusedChild");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private static final boolean c(FocusTargetNode focusTargetNode, Function1<? super FocusTargetNode, Boolean> function1) throws NoWhenBranchMatchedException {
        int i = a.$EnumSwitchMapping$0[focusTargetNode.v1().ordinal()];
        if (i == 1) {
            FocusTargetNode focusTargetNodeF = i.f(focusTargetNode);
            if (focusTargetNodeF != null) {
                return c(focusTargetNodeF, function1) || d(focusTargetNode, focusTargetNodeF, b.INSTANCE.e(), function1);
            }
            throw new IllegalStateException("ActiveParent must have a focusedChild");
        }
        if (i == 2 || i == 3) {
            return h(focusTargetNode, function1);
        }
        if (i == 4) {
            return focusTargetNode.t3().getCanFocus() ? ((Boolean) function1.invoke(focusTargetNode)).booleanValue() : h(focusTargetNode, function1);
        }
        throw new NoWhenBranchMatchedException();
    }

    private static final boolean d(final FocusTargetNode focusTargetNode, final FocusTargetNode focusTargetNode2, final int i, final Function1<? super FocusTargetNode, Boolean> function1) {
        if (i(focusTargetNode, focusTargetNode2, i, function1)) {
            return true;
        }
        final FocusTargetNode focusTargetNodeI = y23.r(focusTargetNode).getFocusOwner().i();
        Boolean bool = (Boolean) androidx.compose.ui.focus.a.a(focusTargetNode, i, new Function1<hm0.a, Boolean>() { // from class: androidx.compose.ui.focus.OneDimensionalFocusSearchKt$generateAndSearchChildren$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(hm0.a aVar) throws KotlinNothingValueException {
                if (focusTargetNodeI != y23.r(focusTargetNode).getFocusOwner().i()) {
                    return Boolean.TRUE;
                }
                boolean zI = OneDimensionalFocusSearchKt.i(focusTargetNode, focusTargetNode2, i, function1);
                Boolean boolValueOf = Boolean.valueOf(zI);
                if (zI || !aVar.getHasMoreContent()) {
                    return boolValueOf;
                }
                return null;
            }
        });
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    private static final boolean e(FocusTargetNode focusTargetNode) throws KotlinNothingValueException {
        androidx.compose.ui.b.c cVar;
        ki8 nodes;
        int iA = ni8.a(1024);
        if (!focusTargetNode.getNode().getIsAttached()) {
            zw5.c("visitAncestors called on an unattached node");
        }
        androidx.compose.ui.b.c parent = focusTargetNode.getNode().getParent();
        LayoutNode layoutNodeQ = y23.q(focusTargetNode);
        loop0: while (true) {
            cVar = null;
            if (layoutNodeQ == null) {
                break;
            }
            if ((layoutNodeQ.getNodes().getHead().getAggregateChildKindSet() & iA) != 0) {
                while (parent != null) {
                    if ((parent.getKindSet() & iA) != 0) {
                        androidx.compose.ui.b.c cVarJ = parent;
                        r58 r58Var = null;
                        while (cVarJ != null) {
                            if (cVarJ instanceof FocusTargetNode) {
                                cVar = cVarJ;
                                break loop0;
                            }
                            if ((cVarJ.getKindSet() & iA) != 0 && (cVarJ instanceof k33)) {
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
        return cVar == null;
    }

    public static final boolean f(FocusTargetNode focusTargetNode, int i, Function1<? super FocusTargetNode, Boolean> function1) {
        b.Companion companion = b.INSTANCE;
        if (b.l(i, companion.e())) {
            return c(focusTargetNode, function1);
        }
        if (b.l(i, companion.f())) {
            return b(focusTargetNode, function1);
        }
        throw new IllegalStateException("This function should only be used for 1-D focus search");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    private static final boolean g(FocusTargetNode focusTargetNode, Function1<? super FocusTargetNode, Boolean> function1) throws KotlinNothingValueException {
        r58 r58Var = new r58(new FocusTargetNode[16], 0);
        int iA = ni8.a(1024);
        if (!focusTargetNode.getNode().getIsAttached()) {
            zw5.c("visitChildren called on an unattached node");
        }
        r58 r58Var2 = new r58(new androidx.compose.ui.b.c[16], 0);
        androidx.compose.ui.b.c child = focusTargetNode.getNode().getChild();
        if (child == null) {
            y23.c(r58Var2, focusTargetNode.getNode(), false);
        } else {
            r58Var2.c(child);
        }
        while (r58Var2.getSize() != 0) {
            androidx.compose.ui.b.c cVarJ = (androidx.compose.ui.b.c) r58Var2.u(r58Var2.getSize() - 1);
            if ((cVarJ.getAggregateChildKindSet() & iA) == 0) {
                y23.c(r58Var2, cVarJ, false);
            } else {
                while (cVarJ != null) {
                    if ((cVarJ.getKindSet() & iA) != 0) {
                        r58 r58Var3 = null;
                        while (cVarJ != null) {
                            if (cVarJ instanceof FocusTargetNode) {
                                r58Var.c((FocusTargetNode) cVarJ);
                            } else if ((cVarJ.getKindSet() & iA) != 0 && (cVarJ instanceof k33)) {
                                int i = 0;
                                for (androidx.compose.ui.b.c delegate = ((k33) cVarJ).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                    if ((delegate.getKindSet() & iA) != 0) {
                                        i++;
                                        if (i == 1) {
                                            cVarJ = delegate;
                                        } else {
                                            if (r58Var3 == null) {
                                                r58Var3 = new r58(new androidx.compose.ui.b.c[16], 0);
                                            }
                                            if (cVarJ != null) {
                                                r58Var3.c(cVarJ);
                                                cVarJ = null;
                                            }
                                            r58Var3.c(delegate);
                                        }
                                    }
                                }
                                if (i == 1) {
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
        r58Var.A(k.a);
        int size = r58Var.getSize() - 1;
        Object[] objArr = r58Var.content;
        if (size < objArr.length) {
            while (size >= 0) {
                FocusTargetNode focusTargetNode2 = (FocusTargetNode) objArr[size];
                if (i.g(focusTargetNode2) && b(focusTargetNode2, function1)) {
                    return true;
                }
                size--;
            }
        }
        return false;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    private static final boolean h(FocusTargetNode focusTargetNode, Function1<? super FocusTargetNode, Boolean> function1) throws KotlinNothingValueException {
        r58 r58Var = new r58(new FocusTargetNode[16], 0);
        int iA = ni8.a(1024);
        if (!focusTargetNode.getNode().getIsAttached()) {
            zw5.c("visitChildren called on an unattached node");
        }
        r58 r58Var2 = new r58(new androidx.compose.ui.b.c[16], 0);
        androidx.compose.ui.b.c child = focusTargetNode.getNode().getChild();
        if (child == null) {
            y23.c(r58Var2, focusTargetNode.getNode(), false);
        } else {
            r58Var2.c(child);
        }
        while (r58Var2.getSize() != 0) {
            androidx.compose.ui.b.c cVarJ = (androidx.compose.ui.b.c) r58Var2.u(r58Var2.getSize() - 1);
            if ((cVarJ.getAggregateChildKindSet() & iA) == 0) {
                y23.c(r58Var2, cVarJ, false);
            } else {
                while (cVarJ != null) {
                    if ((cVarJ.getKindSet() & iA) != 0) {
                        r58 r58Var3 = null;
                        while (cVarJ != null) {
                            if (cVarJ instanceof FocusTargetNode) {
                                r58Var.c((FocusTargetNode) cVarJ);
                            } else if ((cVarJ.getKindSet() & iA) != 0 && (cVarJ instanceof k33)) {
                                int i = 0;
                                for (androidx.compose.ui.b.c delegate = ((k33) cVarJ).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                    if ((delegate.getKindSet() & iA) != 0) {
                                        i++;
                                        if (i == 1) {
                                            cVarJ = delegate;
                                        } else {
                                            if (r58Var3 == null) {
                                                r58Var3 = new r58(new androidx.compose.ui.b.c[16], 0);
                                            }
                                            if (cVarJ != null) {
                                                r58Var3.c(cVarJ);
                                                cVarJ = null;
                                            }
                                            r58Var3.c(delegate);
                                        }
                                    }
                                }
                                if (i == 1) {
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
        r58Var.A(k.a);
        Object[] objArr = r58Var.content;
        int size = r58Var.getSize();
        for (int i2 = 0; i2 < size; i2++) {
            FocusTargetNode focusTargetNode2 = (FocusTargetNode) objArr[i2];
            if (i.g(focusTargetNode2) && c(focusTargetNode2, function1)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public static final boolean i(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2, int i, Function1<? super FocusTargetNode, Boolean> function1) throws KotlinNothingValueException {
        if (focusTargetNode.v1() != FocusStateImpl.ActiveParent) {
            throw new IllegalStateException("This function should only be used within a parent that has focus.");
        }
        r58 r58Var = new r58(new FocusTargetNode[16], 0);
        int iA = ni8.a(1024);
        if (!focusTargetNode.getNode().getIsAttached()) {
            zw5.c("visitChildren called on an unattached node");
        }
        r58 r58Var2 = new r58(new androidx.compose.ui.b.c[16], 0);
        androidx.compose.ui.b.c child = focusTargetNode.getNode().getChild();
        if (child == null) {
            y23.c(r58Var2, focusTargetNode.getNode(), false);
        } else {
            r58Var2.c(child);
        }
        while (r58Var2.getSize() != 0) {
            androidx.compose.ui.b.c cVarJ = (androidx.compose.ui.b.c) r58Var2.u(r58Var2.getSize() - 1);
            if ((cVarJ.getAggregateChildKindSet() & iA) == 0) {
                y23.c(r58Var2, cVarJ, false);
            } else {
                while (cVarJ != null) {
                    if ((cVarJ.getKindSet() & iA) != 0) {
                        r58 r58Var3 = null;
                        while (cVarJ != null) {
                            if (cVarJ instanceof FocusTargetNode) {
                                r58Var.c((FocusTargetNode) cVarJ);
                            } else if ((cVarJ.getKindSet() & iA) != 0 && (cVarJ instanceof k33)) {
                                int i2 = 0;
                                for (androidx.compose.ui.b.c delegate = ((k33) cVarJ).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                    if ((delegate.getKindSet() & iA) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            cVarJ = delegate;
                                        } else {
                                            if (r58Var3 == null) {
                                                r58Var3 = new r58(new androidx.compose.ui.b.c[16], 0);
                                            }
                                            if (cVarJ != null) {
                                                r58Var3.c(cVarJ);
                                                cVarJ = null;
                                            }
                                            r58Var3.c(delegate);
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
        r58Var.A(k.a);
        b.Companion companion = b.INSTANCE;
        if (b.l(i, companion.e())) {
            IntRange intRangeA = kotlin.ranges.g.A(0, r58Var.getSize());
            int iF = intRangeA.f();
            int i3 = intRangeA.i();
            if (iF <= i3) {
                boolean z = false;
                while (true) {
                    if (z) {
                        FocusTargetNode focusTargetNode3 = (FocusTargetNode) r58Var.content[iF];
                        if (i.g(focusTargetNode3) && c(focusTargetNode3, function1)) {
                            return true;
                        }
                    }
                    if (Intrinsics.e(r58Var.content[iF], focusTargetNode2)) {
                        z = true;
                    }
                    if (iF == i3) {
                        break;
                    }
                    iF++;
                }
            }
        } else {
            if (!b.l(i, companion.f())) {
                throw new IllegalStateException("This function should only be used for 1-D focus search");
            }
            IntRange intRangeA2 = kotlin.ranges.g.A(0, r58Var.getSize());
            int iF2 = intRangeA2.f();
            int i4 = intRangeA2.i();
            if (iF2 <= i4) {
                boolean z2 = false;
                while (true) {
                    if (z2) {
                        FocusTargetNode focusTargetNode4 = (FocusTargetNode) r58Var.content[i4];
                        if (i.g(focusTargetNode4) && b(focusTargetNode4, function1)) {
                            return true;
                        }
                    }
                    if (Intrinsics.e(r58Var.content[i4], focusTargetNode2)) {
                        z2 = true;
                    }
                    if (i4 == iF2) {
                        break;
                    }
                    i4--;
                }
            }
        }
        if (b.l(i, b.INSTANCE.e()) || !focusTargetNode.t3().getCanFocus() || e(focusTargetNode)) {
            return false;
        }
        return ((Boolean) function1.invoke(focusTargetNode)).booleanValue();
    }
}
