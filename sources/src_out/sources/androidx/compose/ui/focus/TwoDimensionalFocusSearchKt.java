package androidx.compose.ui.focus;

import com.google.inputmethod.gba;
import com.google.inputmethod.hm0;
import com.google.inputmethod.k33;
import com.google.inputmethod.ni8;
import com.google.inputmethod.r58;
import com.google.inputmethod.x23;
import com.google.inputmethod.y23;
import com.google.inputmethod.zw5;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0014\u001a;\u0010\b\u001a\u0004\u0018\u00010\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00060\u0005H\u0000¢\u0006\u0004\b\b\u0010\t\u001a/\u0010\n\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00060\u0005H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a7\u0010\r\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00060\u0005H\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a7\u0010\u000f\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00060\u0005H\u0002¢\u0006\u0004\b\u000f\u0010\u000e\u001a!\u0010\u0014\u001a\u00020\u0013*\u00020\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00000\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a+\u0010\u0017\u001a\u0004\u0018\u00010\u0000*\b\u0012\u0004\u0012\u00020\u00000\u00112\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u001a/\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a/\u0010!\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b!\u0010\u001d\u001a\u0013\u0010\"\u001a\u00020\u0003*\u00020\u0003H\u0002¢\u0006\u0004\b\"\u0010#\u001a\u0013\u0010$\u001a\u00020\u0003*\u00020\u0003H\u0002¢\u0006\u0004\b$\u0010#\u001a\u0013\u0010%\u001a\u00020\u0000*\u00020\u0000H\u0002¢\u0006\u0004\b%\u0010&¨\u0006'"}, d2 = {"Landroidx/compose/ui/focus/FocusTargetNode;", "Landroidx/compose/ui/focus/b;", "direction", "Lcom/google/android/gba;", "previouslyFocusedRect", "Lkotlin/Function1;", "", "onFound", "t", "(Landroidx/compose/ui/focus/FocusTargetNode;ILcom/google/android/gba;Lkotlin/jvm/functions/Function1;)Ljava/lang/Boolean;", "k", "(Landroidx/compose/ui/focus/FocusTargetNode;ILkotlin/jvm/functions/Function1;)Z", "focusedItem", "l", "(Landroidx/compose/ui/focus/FocusTargetNode;Lcom/google/android/gba;ILkotlin/jvm/functions/Function1;)Z", "r", "Lcom/google/android/x23;", "Lcom/google/android/r58;", "accessibleChildren", "", "i", "(Lcom/google/android/x23;Lcom/google/android/r58;)V", "focusRect", "j", "(Lcom/google/android/r58;Lcom/google/android/gba;I)Landroidx/compose/ui/focus/FocusTargetNode;", "proposedCandidate", "currentCandidate", "focusedRect", "m", "(Lcom/google/android/gba;Lcom/google/android/gba;Lcom/google/android/gba;I)Z", "source", "rect1", "rect2", "c", "s", "(Lcom/google/android/gba;)Lcom/google/android/gba;", "h", "b", "(Landroidx/compose/ui/focus/FocusTargetNode;)Landroidx/compose/ui/focus/FocusTargetNode;", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class TwoDimensionalFocusSearchKt {

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

    private static final FocusTargetNode b(FocusTargetNode focusTargetNode) {
        if (focusTargetNode.v1() != FocusStateImpl.ActiveParent) {
            throw new IllegalStateException("Searching for active node in inactive hierarchy");
        }
        FocusTargetNode focusTargetNodeB = i.b(focusTargetNode);
        if (focusTargetNodeB != null) {
            return focusTargetNodeB;
        }
        throw new IllegalStateException("ActiveParent must have a focusedChild");
    }

    private static final boolean c(gba gbaVar, gba gbaVar2, gba gbaVar3, int i) {
        if (d(gbaVar3, i, gbaVar) || !d(gbaVar2, i, gbaVar)) {
            return false;
        }
        if (!e(gbaVar3, i, gbaVar)) {
            return true;
        }
        b.Companion companion = b.INSTANCE;
        return b.l(i, companion.d()) || b.l(i, companion.g()) || f(gbaVar2, i, gbaVar) < g(gbaVar3, i, gbaVar);
    }

    private static final boolean d(gba gbaVar, int i, gba gbaVar2) {
        b.Companion companion = b.INSTANCE;
        if (b.l(i, companion.d()) || b.l(i, companion.g())) {
            return gbaVar.getBottom() > gbaVar2.getTop() && gbaVar.getTop() < gbaVar2.getBottom();
        }
        if (b.l(i, companion.h()) || b.l(i, companion.a())) {
            return gbaVar.getRight() > gbaVar2.getLeft() && gbaVar.getLeft() < gbaVar2.getRight();
        }
        throw new IllegalStateException("This function should only be used for 2-D focus search");
    }

    private static final boolean e(gba gbaVar, int i, gba gbaVar2) {
        b.Companion companion = b.INSTANCE;
        if (b.l(i, companion.d())) {
            return gbaVar2.getLeft() >= gbaVar.getRight();
        }
        if (b.l(i, companion.g())) {
            return gbaVar2.getRight() <= gbaVar.getLeft();
        }
        if (b.l(i, companion.h())) {
            return gbaVar2.getTop() >= gbaVar.getBottom();
        }
        if (b.l(i, companion.a())) {
            return gbaVar2.getBottom() <= gbaVar.getTop();
        }
        throw new IllegalStateException("This function should only be used for 2-D focus search");
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0056 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:19:0x0057 A[RETURN] */
    private static final float f(gba gbaVar, int i, gba gbaVar2) {
        float top;
        float bottom;
        float top2;
        float bottom2;
        float f;
        b.Companion companion = b.INSTANCE;
        if (!b.l(i, companion.d())) {
            if (b.l(i, companion.g())) {
                top = gbaVar.getLeft();
                bottom = gbaVar2.getRight();
            } else if (b.l(i, companion.h())) {
                top2 = gbaVar2.getTop();
                bottom2 = gbaVar.getBottom();
            } else {
                if (!b.l(i, companion.a())) {
                    throw new IllegalStateException("This function should only be used for 2-D focus search");
                }
                top = gbaVar.getTop();
                bottom = gbaVar2.getBottom();
            }
            f = top - bottom;
            if (f < 0.0f) {
                return 0.0f;
            }
            return f;
        }
        top2 = gbaVar2.getLeft();
        bottom2 = gbaVar.getRight();
        f = top2 - bottom2;
        if (f < 0.0f) {
            return 0.0f;
        }
        return f;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0057 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:19:0x0058 A[RETURN] */
    private static final float g(gba gbaVar, int i, gba gbaVar2) {
        float bottom;
        float bottom2;
        float top;
        float top2;
        float f;
        b.Companion companion = b.INSTANCE;
        if (!b.l(i, companion.d())) {
            if (b.l(i, companion.g())) {
                bottom = gbaVar.getRight();
                bottom2 = gbaVar2.getRight();
            } else if (b.l(i, companion.h())) {
                top = gbaVar2.getTop();
                top2 = gbaVar.getTop();
            } else {
                if (!b.l(i, companion.a())) {
                    throw new IllegalStateException("This function should only be used for 2-D focus search");
                }
                bottom = gbaVar.getBottom();
                bottom2 = gbaVar2.getBottom();
            }
            f = bottom - bottom2;
            if (f < 1.0f) {
                return 1.0f;
            }
            return f;
        }
        top = gbaVar2.getLeft();
        top2 = gbaVar.getLeft();
        f = top - top2;
        if (f < 1.0f) {
            return 1.0f;
        }
        return f;
    }

    private static final gba h(gba gbaVar) {
        return new gba(gbaVar.getRight(), gbaVar.getBottom(), gbaVar.getRight(), gbaVar.getBottom());
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    private static final void i(x23 x23Var, r58<FocusTargetNode> r58Var) throws KotlinNothingValueException {
        int iA = ni8.a(1024);
        if (!x23Var.getNode().getIsAttached()) {
            zw5.c("visitChildren called on an unattached node");
        }
        r58 r58Var2 = new r58(new androidx.compose.ui.b.c[16], 0);
        androidx.compose.ui.b.c child = x23Var.getNode().getChild();
        if (child == null) {
            y23.c(r58Var2, x23Var.getNode(), false);
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
                                FocusTargetNode focusTargetNode = (FocusTargetNode) cVarJ;
                                if (focusTargetNode.getIsAttached() && !y23.q(focusTargetNode).getIsDeactivated()) {
                                    if (focusTargetNode.t3().getCanFocus()) {
                                        r58Var.c(focusTargetNode);
                                    } else {
                                        i(focusTargetNode, r58Var);
                                    }
                                }
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
    }

    private static final FocusTargetNode j(r58<FocusTargetNode> r58Var, gba gbaVar, int i) {
        gba gbaVarT;
        b.Companion companion = b.INSTANCE;
        if (b.l(i, companion.d())) {
            gbaVarT = gbaVar.t((gbaVar.getRight() - gbaVar.getLeft()) + 1, 0.0f);
        } else if (b.l(i, companion.g())) {
            gbaVarT = gbaVar.t(-((gbaVar.getRight() - gbaVar.getLeft()) + 1), 0.0f);
        } else if (b.l(i, companion.h())) {
            gbaVarT = gbaVar.t(0.0f, (gbaVar.getBottom() - gbaVar.getTop()) + 1);
        } else {
            if (!b.l(i, companion.a())) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            gbaVarT = gbaVar.t(0.0f, -((gbaVar.getBottom() - gbaVar.getTop()) + 1));
        }
        FocusTargetNode[] focusTargetNodeArr = r58Var.content;
        int size = r58Var.getSize();
        FocusTargetNode focusTargetNode = null;
        for (int i2 = 0; i2 < size; i2++) {
            FocusTargetNode focusTargetNode2 = focusTargetNodeArr[i2];
            if (i.g(focusTargetNode2)) {
                gba gbaVarD = i.d(focusTargetNode2);
                if (m(gbaVarD, gbaVarT, gbaVar, i)) {
                    focusTargetNode = focusTargetNode2;
                    gbaVarT = gbaVarD;
                }
            }
        }
        return focusTargetNode;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public static final boolean k(FocusTargetNode focusTargetNode, int i, Function1<? super FocusTargetNode, Boolean> function1) throws KotlinNothingValueException {
        gba gbaVarS;
        r58 r58Var = new r58(new FocusTargetNode[16], 0);
        i(focusTargetNode, r58Var);
        if (r58Var.getSize() <= 1) {
            FocusTargetNode focusTargetNode2 = (FocusTargetNode) (r58Var.getSize() == 0 ? null : r58Var.content[0]);
            if (focusTargetNode2 != null) {
                return ((Boolean) function1.invoke(focusTargetNode2)).booleanValue();
            }
            return false;
        }
        b.Companion companion = b.INSTANCE;
        if (b.l(i, companion.b())) {
            i = companion.g();
        }
        if (b.l(i, companion.g()) || b.l(i, companion.a())) {
            gbaVarS = s(i.d(focusTargetNode));
        } else {
            if (!b.l(i, companion.d()) && !b.l(i, companion.h())) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            gbaVarS = h(i.d(focusTargetNode));
        }
        FocusTargetNode focusTargetNodeJ = j(r58Var, gbaVarS, i);
        if (focusTargetNodeJ != null) {
            return ((Boolean) function1.invoke(focusTargetNodeJ)).booleanValue();
        }
        return false;
    }

    private static final boolean l(final FocusTargetNode focusTargetNode, final gba gbaVar, final int i, final Function1<? super FocusTargetNode, Boolean> function1) {
        if (r(focusTargetNode, gbaVar, i, function1)) {
            return true;
        }
        final FocusTargetNode focusTargetNodeI = y23.r(focusTargetNode).getFocusOwner().i();
        Boolean bool = (Boolean) androidx.compose.ui.focus.a.a(focusTargetNode, i, new Function1<hm0.a, Boolean>() { // from class: androidx.compose.ui.focus.TwoDimensionalFocusSearchKt$generateAndSearchChildren$1
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
                boolean zR = TwoDimensionalFocusSearchKt.r(focusTargetNode, gbaVar, i, function1);
                Boolean boolValueOf = Boolean.valueOf(zR);
                if (zR || !aVar.getHasMoreContent()) {
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

    public static final boolean m(gba gbaVar, gba gbaVar2, gba gbaVar3, int i) {
        if (!n(gbaVar, i, gbaVar3)) {
            return false;
        }
        if (n(gbaVar2, i, gbaVar3) && !c(gbaVar3, gbaVar, gbaVar2, i)) {
            return !c(gbaVar3, gbaVar2, gbaVar, i) && q(i, gbaVar3, gbaVar) < q(i, gbaVar3, gbaVar2);
        }
        return true;
    }

    private static final boolean n(gba gbaVar, int i, gba gbaVar2) {
        b.Companion companion = b.INSTANCE;
        if (b.l(i, companion.d())) {
            return (gbaVar2.getRight() > gbaVar.getRight() || gbaVar2.getLeft() >= gbaVar.getRight()) && gbaVar2.getLeft() > gbaVar.getLeft();
        }
        if (b.l(i, companion.g())) {
            return (gbaVar2.getLeft() < gbaVar.getLeft() || gbaVar2.getRight() <= gbaVar.getLeft()) && gbaVar2.getRight() < gbaVar.getRight();
        }
        if (b.l(i, companion.h())) {
            return (gbaVar2.getBottom() > gbaVar.getBottom() || gbaVar2.getTop() >= gbaVar.getBottom()) && gbaVar2.getTop() > gbaVar.getTop();
        }
        if (b.l(i, companion.a())) {
            return (gbaVar2.getTop() < gbaVar.getTop() || gbaVar2.getBottom() <= gbaVar.getTop()) && gbaVar2.getBottom() < gbaVar.getBottom();
        }
        throw new IllegalStateException("This function should only be used for 2-D focus search");
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0056 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:19:0x0057 A[RETURN] */
    private static final float o(gba gbaVar, int i, gba gbaVar2) {
        float top;
        float bottom;
        float top2;
        float bottom2;
        float f;
        b.Companion companion = b.INSTANCE;
        if (!b.l(i, companion.d())) {
            if (b.l(i, companion.g())) {
                top = gbaVar.getLeft();
                bottom = gbaVar2.getRight();
            } else if (b.l(i, companion.h())) {
                top2 = gbaVar2.getTop();
                bottom2 = gbaVar.getBottom();
            } else {
                if (!b.l(i, companion.a())) {
                    throw new IllegalStateException("This function should only be used for 2-D focus search");
                }
                top = gbaVar.getTop();
                bottom = gbaVar2.getBottom();
            }
            f = top - bottom;
            if (f < 0.0f) {
                return 0.0f;
            }
            return f;
        }
        top2 = gbaVar2.getLeft();
        bottom2 = gbaVar.getRight();
        f = top2 - bottom2;
        if (f < 0.0f) {
            return 0.0f;
        }
        return f;
    }

    private static final float p(gba gbaVar, int i, gba gbaVar2) {
        float f;
        float f2;
        float top;
        float bottom;
        float top2;
        b.Companion companion = b.INSTANCE;
        if (b.l(i, companion.d()) || b.l(i, companion.g())) {
            float top3 = gbaVar2.getTop();
            float bottom2 = gbaVar2.getBottom() - gbaVar2.getTop();
            f = 2;
            f2 = top3 + (bottom2 / f);
            top = gbaVar.getTop();
            bottom = gbaVar.getBottom();
            top2 = gbaVar.getTop();
        } else {
            if (!b.l(i, companion.h()) && !b.l(i, companion.a())) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            float left = gbaVar2.getLeft();
            float right = gbaVar2.getRight() - gbaVar2.getLeft();
            f = 2;
            f2 = left + (right / f);
            top = gbaVar.getLeft();
            bottom = gbaVar.getRight();
            top2 = gbaVar.getLeft();
        }
        return f2 - (top + ((bottom - top2) / f));
    }

    private static final long q(int i, gba gbaVar, gba gbaVar2) {
        long jO = (long) o(gbaVar2, i, gbaVar);
        long jP = (long) p(gbaVar2, i, gbaVar);
        return (((long) 13) * jO * jO) + (jP * jP);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public static final boolean r(FocusTargetNode focusTargetNode, gba gbaVar, int i, Function1<? super FocusTargetNode, Boolean> function1) throws KotlinNothingValueException {
        FocusTargetNode focusTargetNodeJ;
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
                                FocusTargetNode focusTargetNode2 = (FocusTargetNode) cVarJ;
                                if (focusTargetNode2.getIsAttached()) {
                                    r58Var.c(focusTargetNode2);
                                }
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
        while (r58Var.getSize() != 0 && (focusTargetNodeJ = j(r58Var, gbaVar, i)) != null) {
            if (focusTargetNodeJ.t3().getCanFocus()) {
                return ((Boolean) function1.invoke(focusTargetNodeJ)).booleanValue();
            }
            if (l(focusTargetNodeJ, gbaVar, i, function1)) {
                return true;
            }
            r58Var.s(focusTargetNodeJ);
        }
        return false;
    }

    private static final gba s(gba gbaVar) {
        return new gba(gbaVar.getLeft(), gbaVar.getTop(), gbaVar.getLeft(), gbaVar.getTop());
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final Boolean t(FocusTargetNode focusTargetNode, int i, gba gbaVar, Function1<? super FocusTargetNode, Boolean> function1) throws NoWhenBranchMatchedException, KotlinNothingValueException {
        FocusStateImpl focusStateImplV1 = focusTargetNode.v1();
        int[] iArr = a.$EnumSwitchMapping$0;
        int i2 = iArr[focusStateImplV1.ordinal()];
        if (i2 != 1) {
            if (i2 == 2 || i2 == 3) {
                return Boolean.valueOf(k(focusTargetNode, i, function1));
            }
            if (i2 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            if (focusTargetNode.t3().getCanFocus()) {
                return (Boolean) function1.invoke(focusTargetNode);
            }
            return gbaVar == null ? Boolean.valueOf(k(focusTargetNode, i, function1)) : Boolean.valueOf(r(focusTargetNode, gbaVar, i, function1));
        }
        FocusTargetNode focusTargetNodeF = i.f(focusTargetNode);
        if (focusTargetNodeF == null) {
            throw new IllegalStateException("ActiveParent must have a focusedChild");
        }
        int i3 = iArr[focusTargetNodeF.v1().ordinal()];
        if (i3 == 1) {
            Boolean boolT = t(focusTargetNodeF, i, gbaVar, function1);
            if (!Intrinsics.e(boolT, Boolean.FALSE)) {
                return boolT;
            }
            if (gbaVar == null) {
                gbaVar = i.d(b(focusTargetNodeF));
            }
            return Boolean.valueOf(l(focusTargetNode, gbaVar, i, function1));
        }
        if (i3 == 2 || i3 == 3) {
            if (gbaVar == null) {
                gbaVar = i.d(focusTargetNodeF);
            }
            return Boolean.valueOf(l(focusTargetNode, gbaVar, i, function1));
        }
        if (i3 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        throw new IllegalStateException("ActiveParent must have a focusedChild");
    }
}
