package androidx.compose.ui.focus;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.l;
import com.google.inputmethod.c41;
import com.google.inputmethod.gba;
import com.google.inputmethod.k33;
import com.google.inputmethod.ki8;
import com.google.inputmethod.mq1;
import com.google.inputmethod.ni8;
import com.google.inputmethod.r58;
import com.google.inputmethod.y23;
import com.google.inputmethod.zw5;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0003\u001a%\u0010\b\u001a\u00020\u0001*\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\n\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\n\u0010\u0003\u001a'\u0010\u000b\u001a\u00020\u0001*\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u000b\u0010\t\u001a+\u0010\u0010\u001a\u00020\u0001*\u00020\u00002\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0013\u0010\u0012\u001a\u00020\u0000*\u00020\u0000H\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u001b\u0010\u0015\u001a\u00020\u0014*\u00020\u00002\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u001b\u0010\u0017\u001a\u00020\u0014*\u00020\u00002\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u0017\u0010\u0016\u001a\u001b\u0010\u0018\u001a\u00020\u0014*\u00020\u00002\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0018\u0010\u0016\u001a\u001b\u0010\u0019\u001a\u00020\u0014*\u00020\u00002\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0019\u0010\u0016¨\u0006\u001a"}, d2 = {"Landroidx/compose/ui/focus/FocusTargetNode;", "", "k", "(Landroidx/compose/ui/focus/FocusTargetNode;)Z", "a", "e", "forced", "refreshFocusEvents", "c", "(Landroidx/compose/ui/focus/FocusTargetNode;ZZ)Z", "f", "b", "Landroidx/compose/ui/focus/b;", "focusDirection", "Lcom/google/android/gba;", "previouslyFocusedRect", "l", "(Landroidx/compose/ui/focus/FocusTargetNode;Landroidx/compose/ui/focus/b;Lcom/google/android/gba;)Z", "n", "(Landroidx/compose/ui/focus/FocusTargetNode;)Landroidx/compose/ui/focus/FocusTargetNode;", "Landroidx/compose/ui/focus/CustomDestinationResult;", "j", "(Landroidx/compose/ui/focus/FocusTargetNode;I)Landroidx/compose/ui/focus/CustomDestinationResult;", "g", "h", "i", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class FocusTransactionsKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FocusStateImpl.values().length];
            try {
                iArr[FocusStateImpl.Active.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FocusStateImpl.Captured.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FocusStateImpl.ActiveParent.ordinal()] = 3;
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
    public static final boolean a(FocusTargetNode focusTargetNode) throws NoWhenBranchMatchedException, KotlinNothingValueException {
        int i = a.$EnumSwitchMapping$0[focusTargetNode.v1().ordinal()];
        if (i == 1) {
            y23.r(focusTargetNode).getFocusOwner().f(true);
            focusTargetNode.s3(FocusStateImpl.Active, FocusStateImpl.Captured);
            return true;
        }
        if (i == 2) {
            return true;
        }
        if (i == 3 || i == 4) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    private static final boolean b(FocusTargetNode focusTargetNode, boolean z, boolean z2) {
        FocusTargetNode focusTargetNodeF = i.f(focusTargetNode);
        if (focusTargetNodeF != null) {
            return c(focusTargetNodeF, z, z2);
        }
        return true;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final boolean c(FocusTargetNode focusTargetNode, boolean z, boolean z2) throws NoWhenBranchMatchedException, KotlinNothingValueException {
        int i = a.$EnumSwitchMapping$0[focusTargetNode.v1().ordinal()];
        if (i == 1) {
            if (!mq1.isOptimizedFocusEventDispatchEnabled) {
                y23.r(focusTargetNode).getFocusOwner().q(null);
                if (z2) {
                    focusTargetNode.s3(FocusStateImpl.Active, FocusStateImpl.Inactive);
                }
            }
            return true;
        }
        if (i == 2) {
            if (z && !mq1.isOptimizedFocusEventDispatchEnabled) {
                y23.r(focusTargetNode).getFocusOwner().q(null);
                if (z2) {
                    focusTargetNode.s3(FocusStateImpl.Captured, FocusStateImpl.Inactive);
                }
            }
            return z;
        }
        if (i != 3) {
            if (i == 4) {
                return true;
            }
            throw new NoWhenBranchMatchedException();
        }
        if (!b(focusTargetNode, z, z2)) {
            return false;
        }
        if (z2) {
            focusTargetNode.s3(FocusStateImpl.ActiveParent, FocusStateImpl.Inactive);
        }
        return true;
    }

    public static /* synthetic */ boolean d(FocusTargetNode focusTargetNode, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return c(focusTargetNode, z, z2);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final boolean e(FocusTargetNode focusTargetNode) throws NoWhenBranchMatchedException, KotlinNothingValueException {
        int i = a.$EnumSwitchMapping$0[focusTargetNode.v1().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3 || i == 4) {
                    return false;
                }
                throw new NoWhenBranchMatchedException();
            }
            y23.r(focusTargetNode).getFocusOwner().f(false);
            focusTargetNode.s3(FocusStateImpl.Captured, FocusStateImpl.Active);
        }
        return true;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private static final boolean f(final FocusTargetNode focusTargetNode) throws NoWhenBranchMatchedException, KotlinNothingValueException {
        l.a(focusTargetNode, new Function0<Unit>() { // from class: androidx.compose.ui.focus.FocusTransactionsKt$grantFocus$1
            {
                super(0);
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
            public /* bridge */ /* synthetic */ Object invoke() throws KotlinNothingValueException {
                m11invoke();
                return Unit.a;
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m11invoke() throws KotlinNothingValueException {
                focusTargetNode.t3();
            }
        });
        int i = a.$EnumSwitchMapping$0[focusTargetNode.v1().ordinal()];
        if (i != 1 && i != 2) {
            if (i != 3 && i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            y23.r(focusTargetNode).getFocusOwner().q(focusTargetNode);
        }
        return true;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final CustomDestinationResult g(FocusTargetNode focusTargetNode, int i) throws NoWhenBranchMatchedException {
        int i2 = a.$EnumSwitchMapping$0[focusTargetNode.v1().ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                return CustomDestinationResult.Cancelled;
            }
            if (i2 == 3) {
                CustomDestinationResult customDestinationResultG = g(n(focusTargetNode), i);
                if (customDestinationResultG == CustomDestinationResult.None) {
                    customDestinationResultG = null;
                }
                return customDestinationResultG == null ? i(focusTargetNode, i) : customDestinationResultG;
            }
            if (i2 != 4) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return CustomDestinationResult.None;
    }

    private static final CustomDestinationResult h(FocusTargetNode focusTargetNode, int i) {
        if (!focusTargetNode.isProcessingCustomEnter) {
            focusTargetNode.isProcessingCustomEnter = true;
            try {
                FocusProperties focusPropertiesT3 = focusTargetNode.t3();
                c41 c41Var = new c41(i, null);
                FocusOwner focusOwner = y23.r(focusTargetNode).getFocusOwner();
                FocusTargetNode focusTargetNodeI = focusOwner.i();
                focusPropertiesT3.n().invoke(c41Var);
                FocusTargetNode focusTargetNodeI2 = focusOwner.i();
                if (c41Var.getIsCanceled()) {
                    f.Companion companion = f.INSTANCE;
                    f fVarA = companion.a();
                    if (fVarA == companion.a()) {
                        return CustomDestinationResult.Cancelled;
                    }
                    if (fVarA == companion.c()) {
                        return CustomDestinationResult.Redirected;
                    }
                    return f.h(fVarA, 0, 1, null) ? CustomDestinationResult.Redirected : CustomDestinationResult.RedirectCancelled;
                }
                if (focusTargetNodeI != focusTargetNodeI2 && focusTargetNodeI2 != null) {
                    f.Companion companion2 = f.INSTANCE;
                    f fVarC = companion2.c();
                    if (fVarC == companion2.a()) {
                        return CustomDestinationResult.Cancelled;
                    }
                    if (fVarC == companion2.c()) {
                        return CustomDestinationResult.Redirected;
                    }
                    return f.h(fVarC, 0, 1, null) ? CustomDestinationResult.Redirected : CustomDestinationResult.RedirectCancelled;
                }
            } finally {
                focusTargetNode.isProcessingCustomEnter = false;
            }
        }
        return CustomDestinationResult.None;
    }

    private static final CustomDestinationResult i(FocusTargetNode focusTargetNode, int i) {
        if (!focusTargetNode.isProcessingCustomExit) {
            focusTargetNode.isProcessingCustomExit = true;
            try {
                FocusProperties focusPropertiesT3 = focusTargetNode.t3();
                c41 c41Var = new c41(i, null);
                FocusOwner focusOwner = y23.r(focusTargetNode).getFocusOwner();
                FocusTargetNode focusTargetNodeI = focusOwner.i();
                focusPropertiesT3.o().invoke(c41Var);
                FocusTargetNode focusTargetNodeI2 = focusOwner.i();
                if (c41Var.getIsCanceled()) {
                    f.Companion companion = f.INSTANCE;
                    f fVarA = companion.a();
                    if (fVarA == companion.a()) {
                        return CustomDestinationResult.Cancelled;
                    }
                    if (fVarA == companion.c()) {
                        return CustomDestinationResult.Redirected;
                    }
                    return f.h(fVarA, 0, 1, null) ? CustomDestinationResult.Redirected : CustomDestinationResult.RedirectCancelled;
                }
                if (focusTargetNodeI != focusTargetNodeI2 && focusTargetNodeI2 != null) {
                    f.Companion companion2 = f.INSTANCE;
                    f fVarC = companion2.c();
                    if (fVarC == companion2.a()) {
                        return CustomDestinationResult.Cancelled;
                    }
                    if (fVarC == companion2.c()) {
                        return CustomDestinationResult.Redirected;
                    }
                    return f.h(fVarC, 0, 1, null) ? CustomDestinationResult.Redirected : CustomDestinationResult.RedirectCancelled;
                }
            } finally {
                focusTargetNode.isProcessingCustomExit = false;
            }
        }
        return CustomDestinationResult.None;
    }

    public static final CustomDestinationResult j(FocusTargetNode focusTargetNode, int i) {
        androidx.compose.ui.b.c cVarJ;
        ki8 nodes;
        int i2 = a.$EnumSwitchMapping$0[focusTargetNode.v1().ordinal()];
        if (i2 == 1 || i2 == 2) {
            return CustomDestinationResult.None;
        }
        if (i2 == 3) {
            return g(n(focusTargetNode), i);
        }
        if (i2 != 4) {
            throw new NoWhenBranchMatchedException();
        }
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
                                int i3 = 0;
                                for (androidx.compose.ui.b.c delegate = ((k33) cVarJ).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                    if ((delegate.getKindSet() & iA) != 0) {
                                        i3++;
                                        if (i3 == 1) {
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
                                if (i3 == 1) {
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
        if (focusTargetNode2 == null) {
            return CustomDestinationResult.None;
        }
        int i4 = a.$EnumSwitchMapping$0[focusTargetNode2.v1().ordinal()];
        if (i4 == 1) {
            return h(focusTargetNode2, i);
        }
        if (i4 == 2) {
            return CustomDestinationResult.Cancelled;
        }
        if (i4 == 3) {
            return j(focusTargetNode2, i);
        }
        if (i4 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        CustomDestinationResult customDestinationResultJ = j(focusTargetNode2, i);
        CustomDestinationResult customDestinationResult = customDestinationResultJ != CustomDestinationResult.None ? customDestinationResultJ : null;
        return customDestinationResult == null ? h(focusTargetNode2, i) : customDestinationResult;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final boolean k(FocusTargetNode focusTargetNode) throws NoWhenBranchMatchedException, KotlinNothingValueException {
        r58 r58Var;
        ki8 nodes;
        ki8 nodes2;
        boolean z;
        String str;
        ki8 nodes3;
        FocusOwner focusOwner = y23.r(focusTargetNode).getFocusOwner();
        FocusTargetNode focusTargetNodeI = focusOwner.i();
        FocusStateImpl focusStateImplV1 = focusTargetNode.v1();
        int i = 1;
        if (focusTargetNodeI == focusTargetNode) {
            focusTargetNode.s3(focusStateImplV1, focusStateImplV1);
            return true;
        }
        r58 r58Var2 = null;
        if (mq1.isBypassUnfocusableComposeViewEnabled) {
            if ((focusTargetNodeI == null || focusTargetNodeI.getIsInteropViewHost()) && !focusTargetNode.getIsInteropViewHost() && !m(focusTargetNode, null, null, 3, null)) {
                return false;
            }
        } else if (focusTargetNodeI == null && !m(focusTargetNode, null, null, 3, null)) {
            return false;
        }
        String str2 = "visitAncestors called on an unattached node";
        int i2 = 1024;
        if (focusTargetNodeI != null) {
            r58Var = new r58(new FocusTargetNode[16], 0);
            int iA = ni8.a(1024);
            if (!focusTargetNodeI.getNode().getIsAttached()) {
                zw5.c("visitAncestors called on an unattached node");
            }
            androidx.compose.ui.b.c parent = focusTargetNodeI.getNode().getParent();
            LayoutNode layoutNodeQ = y23.q(focusTargetNodeI);
            while (layoutNodeQ != null) {
                if ((layoutNodeQ.getNodes().getHead().getAggregateChildKindSet() & iA) != 0) {
                    while (parent != null) {
                        if ((parent.getKindSet() & iA) != 0) {
                            r58 r58Var3 = r58Var2;
                            androidx.compose.ui.b.c cVarJ = parent;
                            while (cVarJ != null) {
                                i2 = i2;
                                if (cVarJ instanceof FocusTargetNode) {
                                    r58Var.c((FocusTargetNode) cVarJ);
                                } else if ((cVarJ.getKindSet() & iA) != 0 && (cVarJ instanceof k33)) {
                                    androidx.compose.ui.b.c delegate = ((k33) cVarJ).getDelegate();
                                    int i3 = 0;
                                    while (delegate != null) {
                                        if ((delegate.getKindSet() & iA) != 0) {
                                            i3++;
                                            if (i3 == i) {
                                                Unit unit = Unit.a;
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
                                        delegate = delegate.getChild();
                                        i = 1;
                                    }
                                    if (i3 == i) {
                                    }
                                }
                                cVarJ = y23.j(r58Var3);
                                i = 1;
                            }
                        }
                        parent = parent.getParent();
                        i2 = i2;
                        i = 1;
                        r58Var2 = null;
                    }
                }
                int i4 = i2;
                layoutNodeQ = layoutNodeQ.C0();
                parent = (layoutNodeQ == null || (nodes3 = layoutNodeQ.getNodes()) == null) ? null : nodes3.getTail();
                i2 = i4;
                i = 1;
                r58Var2 = null;
            }
        } else {
            r58Var = null;
        }
        int i5 = i2;
        r58 r58Var4 = new r58(new FocusTargetNode[16], 0);
        r58 r58Var5 = new r58(new FocusTargetNode[16], 0);
        int iA2 = ni8.a(i5);
        if (!focusTargetNode.getNode().getIsAttached()) {
            zw5.c("visitAncestors called on an unattached node");
        }
        androidx.compose.ui.b.c parent2 = focusTargetNode.getNode().getParent();
        LayoutNode layoutNodeQ2 = y23.q(focusTargetNode);
        boolean z2 = true;
        while (layoutNodeQ2 != null) {
            if ((layoutNodeQ2.getNodes().getHead().getAggregateChildKindSet() & iA2) != 0) {
                while (parent2 != null) {
                    if ((parent2.getKindSet() & iA2) != 0) {
                        androidx.compose.ui.b.c cVarJ2 = parent2;
                        r58 r58Var6 = null;
                        while (cVarJ2 != null) {
                            if (cVarJ2 instanceof FocusTargetNode) {
                                FocusTargetNode focusTargetNode2 = (FocusTargetNode) cVarJ2;
                                if (Intrinsics.e(r58Var != null ? Boolean.valueOf(r58Var.s(focusTargetNode2)) : null, Boolean.TRUE)) {
                                    r58Var4.c(focusTargetNode2);
                                } else {
                                    r58Var5.c(focusTargetNode2);
                                }
                                if (focusTargetNode2 == focusTargetNodeI) {
                                    z2 = false;
                                }
                                z = false;
                            } else {
                                z = true;
                            }
                            if (z && (cVarJ2.getKindSet() & iA2) != 0 && (cVarJ2 instanceof k33)) {
                                androidx.compose.ui.b.c delegate2 = ((k33) cVarJ2).getDelegate();
                                int i6 = 0;
                                while (delegate2 != null) {
                                    if ((delegate2.getKindSet() & iA2) == 0) {
                                        str2 = str2;
                                    } else {
                                        i6++;
                                        if (i6 == 1) {
                                            Unit unit2 = Unit.a;
                                            cVarJ2 = delegate2;
                                            str2 = str2;
                                        } else {
                                            if (r58Var6 == null) {
                                                r58Var6 = new r58(new androidx.compose.ui.b.c[16], 0);
                                            }
                                            if (cVarJ2 != null) {
                                                r58Var6.c(cVarJ2);
                                                cVarJ2 = null;
                                            }
                                            r58Var6.c(delegate2);
                                        }
                                    }
                                    delegate2 = delegate2.getChild();
                                    str2 = str2;
                                }
                                str = str2;
                                if (i6 == 1) {
                                }
                                focusOwner = focusOwner;
                                str2 = str;
                            } else {
                                str = str2;
                            }
                            cVarJ2 = y23.j(r58Var6);
                            focusOwner = focusOwner;
                            str2 = str;
                        }
                    }
                    parent2 = parent2.getParent();
                    focusOwner = focusOwner;
                    str2 = str2;
                }
            }
            FocusOwner focusOwner2 = focusOwner;
            String str3 = str2;
            layoutNodeQ2 = layoutNodeQ2.C0();
            parent2 = (layoutNodeQ2 == null || (nodes2 = layoutNodeQ2.getNodes()) == null) ? null : nodes2.getTail();
            focusOwner = focusOwner2;
            str2 = str3;
        }
        FocusOwner focusOwner3 = focusOwner;
        String str4 = str2;
        if (z2 && focusTargetNodeI != null && !d(focusTargetNodeI, false, true, 1, null)) {
            return false;
        }
        f(focusTargetNode);
        if (mq1.isOptimizedFocusEventDispatchEnabled && z2 && focusTargetNodeI != null) {
            focusTargetNodeI.s3(FocusStateImpl.Active, FocusStateImpl.Inactive);
            Unit unit3 = Unit.a;
        }
        if (r58Var != null) {
            int size = r58Var.getSize() - 1;
            Object[] objArr = r58Var.content;
            if (size < objArr.length) {
                while (size >= 0) {
                    FocusTargetNode focusTargetNode3 = (FocusTargetNode) objArr[size];
                    if (focusOwner3.i() != focusTargetNode) {
                        return false;
                    }
                    focusTargetNode3.s3(FocusStateImpl.ActiveParent, FocusStateImpl.Inactive);
                    size--;
                }
            }
            Unit unit4 = Unit.a;
        }
        int size2 = r58Var5.getSize() - 1;
        Object[] objArr2 = r58Var5.content;
        if (size2 < objArr2.length) {
            while (size2 >= 0) {
                FocusTargetNode focusTargetNode4 = (FocusTargetNode) objArr2[size2];
                if (focusOwner3.i() != focusTargetNode) {
                    return false;
                }
                focusTargetNode4.s3(focusTargetNode4 == focusTargetNodeI ? FocusStateImpl.Active : FocusStateImpl.Inactive, FocusStateImpl.ActiveParent);
                size2--;
            }
        }
        if (focusOwner3.i() != focusTargetNode) {
            return false;
        }
        focusTargetNode.s3(focusStateImplV1, FocusStateImpl.Active);
        if (focusOwner3.i() != focusTargetNode) {
            return false;
        }
        if (mq1.isFocusRestorationEnabled) {
            FocusTargetNode focusTargetNode5 = (FocusTargetNode) (r58Var4.getSize() == 0 ? null : r58Var4.content[r58Var4.getSize() - 1]);
            int iA3 = ni8.a(i5);
            if (!focusTargetNode.getNode().getIsAttached()) {
                zw5.c(str4);
            }
            androidx.compose.ui.b.c parent3 = focusTargetNode.getNode().getParent();
            LayoutNode layoutNodeQ3 = y23.q(focusTargetNode);
            loop10: while (layoutNodeQ3 != null) {
                if ((layoutNodeQ3.getNodes().getHead().getAggregateChildKindSet() & iA3) != 0) {
                    while (parent3 != null) {
                        if ((parent3.getKindSet() & iA3) != 0) {
                            androidx.compose.ui.b.c cVarJ3 = parent3;
                            r58 r58Var7 = null;
                            while (cVarJ3 != null) {
                                if (cVarJ3 instanceof FocusTargetNode) {
                                    FocusTargetNode focusTargetNode6 = (FocusTargetNode) cVarJ3;
                                    FocusRestorerKt.a(focusTargetNode6);
                                    if (focusTargetNode6 == focusTargetNode5) {
                                        break loop10;
                                    }
                                } else if ((cVarJ3.getKindSet() & iA3) != 0 && (cVarJ3 instanceof k33)) {
                                    int i7 = 0;
                                    for (androidx.compose.ui.b.c delegate3 = ((k33) cVarJ3).getDelegate(); delegate3 != null; delegate3 = delegate3.getChild()) {
                                        if ((delegate3.getKindSet() & iA3) != 0) {
                                            i7++;
                                            if (i7 == 1) {
                                                Unit unit5 = Unit.a;
                                                cVarJ3 = delegate3;
                                            } else {
                                                if (r58Var7 == null) {
                                                    r58Var7 = new r58(new androidx.compose.ui.b.c[16], 0);
                                                }
                                                if (cVarJ3 != null) {
                                                    r58Var7.c(cVarJ3);
                                                    cVarJ3 = null;
                                                }
                                                r58Var7.c(delegate3);
                                            }
                                        }
                                    }
                                    if (i7 != 1) {
                                        cVarJ3 = y23.j(r58Var7);
                                    }
                                }
                                cVarJ3 = y23.j(r58Var7);
                            }
                        }
                        parent3 = parent3.getParent();
                    }
                }
                layoutNodeQ3 = layoutNodeQ3.C0();
                parent3 = (layoutNodeQ3 == null || (nodes = layoutNodeQ3.getNodes()) == null) ? null : nodes.getTail();
            }
            Unit unit6 = Unit.a;
        }
        if (!mq1.isViewFocusFixEnabled || y23.q(focusTargetNode).d0() != null) {
            return true;
        }
        l(focusTargetNode, b.i(b.INSTANCE.e()), null);
        return true;
    }

    private static final boolean l(FocusTargetNode focusTargetNode, b bVar, gba gbaVar) {
        return y23.r(focusTargetNode).getFocusOwner().b(bVar, gbaVar);
    }

    static /* synthetic */ boolean m(FocusTargetNode focusTargetNode, b bVar, gba gbaVar, int i, Object obj) {
        if ((i & 1) != 0) {
            bVar = null;
        }
        if ((i & 2) != 0) {
            gbaVar = null;
        }
        return l(focusTargetNode, bVar, gbaVar);
    }

    private static final FocusTargetNode n(FocusTargetNode focusTargetNode) {
        FocusTargetNode focusTargetNodeF = i.f(focusTargetNode);
        if (focusTargetNodeF != null) {
            return focusTargetNodeF;
        }
        throw new IllegalArgumentException("ActiveParent with no focused child");
    }
}
