package androidx.compose.ui.viewinterop;

import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.compose.ui.focus.FocusOwner;
import androidx.compose.ui.focus.FocusProperties;
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.focus.FocusTransactionsKt;
import androidx.compose.ui.node.m;
import com.google.inputmethod.ek4;
import com.google.inputmethod.k33;
import com.google.inputmethod.mq1;
import com.google.inputmethod.ni8;
import com.google.inputmethod.r58;
import com.google.inputmethod.tk4;
import com.google.inputmethod.y23;
import com.google.inputmethod.z23;
import com.google.inputmethod.zw5;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ#\u0010\u0011\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\u0005J\u000f\u0010\u0014\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\u0005R$\u0010\u001b\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR$\u0010#\u001a\u0004\u0018\u00010\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R#\u0010*\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u000b0$8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R#\u0010-\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u000b0$8\u0006¢\u0006\f\n\u0004\b+\u0010'\u001a\u0004\b,\u0010)¨\u0006."}, d2 = {"Landroidx/compose/ui/viewinterop/FocusGroupPropertiesNode;", "Landroidx/compose/ui/b$c;", "Lcom/google/android/tk4;", "Landroid/view/ViewTreeObserver$OnGlobalFocusChangeListener;", "<init>", "()V", "Landroidx/compose/ui/focus/FocusTargetNode;", "m3", "()Landroidx/compose/ui/focus/FocusTargetNode;", "Landroidx/compose/ui/focus/FocusProperties;", "focusProperties", "", "m2", "(Landroidx/compose/ui/focus/FocusProperties;)V", "Landroid/view/View;", "oldFocus", "newFocus", "onGlobalFocusChanged", "(Landroid/view/View;Landroid/view/View;)V", "V2", "W2", "p", "Landroid/view/View;", "n3", "()Landroid/view/View;", "setFocusedChild", "(Landroid/view/View;)V", "focusedChild", "Landroid/view/ViewTreeObserver;", "q", "Landroid/view/ViewTreeObserver;", "getAttachedViewTreeObserver", "()Landroid/view/ViewTreeObserver;", "setAttachedViewTreeObserver", "(Landroid/view/ViewTreeObserver;)V", "attachedViewTreeObserver", "Lkotlin/Function1;", "Lcom/google/android/ek4;", "r", "Lkotlin/jvm/functions/Function1;", "getOnEnter", "()Lkotlin/jvm/functions/Function1;", "onEnter", "s", "getOnExit", "onExit", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class FocusGroupPropertiesNode extends androidx.compose.ui.b.c implements tk4, ViewTreeObserver.OnGlobalFocusChangeListener {

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private View focusedChild;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private ViewTreeObserver attachedViewTreeObserver;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private final Function1<ek4, Unit> onEnter = new Function1<ek4, Unit>() { // from class: androidx.compose.ui.viewinterop.FocusGroupPropertiesNode$onEnter$1
        {
            super(1);
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
        public final void a(ek4 ek4Var) throws KotlinNothingValueException {
            View viewG = d.g(this.this$0);
            if (viewG.isFocused() || viewG.hasFocus()) {
                return;
            }
            if (androidx.compose.ui.focus.c.b(viewG, androidx.compose.ui.focus.c.c(ek4Var.getRequestedFocusDirection()), d.f(y23.r(this.this$0).getFocusOwner(), z23.a(this.this$0), viewG))) {
                return;
            }
            ek4Var.a();
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
        public /* bridge */ /* synthetic */ Object invoke(Object obj) throws KotlinNothingValueException {
            a((ek4) obj);
            return Unit.a;
        }
    };

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private final Function1<ek4, Unit> onExit = new Function1<ek4, Unit>() { // from class: androidx.compose.ui.viewinterop.FocusGroupPropertiesNode$onExit$1
        {
            super(1);
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
        public final void a(ek4 ek4Var) throws KotlinNothingValueException {
            View viewFindNextFocusFromRect;
            View viewG = d.g(this.this$0);
            if (mq1.isViewFocusFixEnabled) {
                if (viewG.hasFocus() || viewG.isFocused()) {
                    viewG.clearFocus();
                    return;
                }
                return;
            }
            if (mq1.isBypassUnfocusableComposeViewEnabled || !viewG.hasFocus()) {
                return;
            }
            FocusOwner focusOwner = y23.r(this.this$0).getFocusOwner();
            View viewA = z23.a(this.this$0);
            if (!(viewG instanceof ViewGroup)) {
                if (!viewA.requestFocus()) {
                    throw new IllegalStateException("host view did not take focus");
                }
                return;
            }
            Rect rectF = d.f(focusOwner, viewA, viewG);
            Integer numC = androidx.compose.ui.focus.c.c(ek4Var.getRequestedFocusDirection());
            int iIntValue = numC != null ? numC.intValue() : 130;
            FocusFinder focusFinder = FocusFinder.getInstance();
            FocusGroupPropertiesNode focusGroupPropertiesNode = this.this$0;
            if (focusGroupPropertiesNode.getFocusedChild() != null) {
                Intrinsics.h(viewA, "null cannot be cast to non-null type android.view.ViewGroup");
                viewFindNextFocusFromRect = focusFinder.findNextFocus((ViewGroup) viewA, focusGroupPropertiesNode.getFocusedChild(), iIntValue);
            } else {
                Intrinsics.h(viewA, "null cannot be cast to non-null type android.view.ViewGroup");
                viewFindNextFocusFromRect = focusFinder.findNextFocusFromRect((ViewGroup) viewA, rectF, iIntValue);
            }
            if (viewFindNextFocusFromRect == null || !d.d(viewG, viewFindNextFocusFromRect)) {
                if (!viewA.requestFocus()) {
                    throw new IllegalStateException("host view did not take focus");
                }
            } else {
                viewFindNextFocusFromRect.requestFocus(iIntValue, rectF);
                ek4Var.a();
            }
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
        public /* bridge */ /* synthetic */ Object invoke(Object obj) throws KotlinNothingValueException {
            a((ek4) obj);
            return Unit.a;
        }
    };

    private final FocusTargetNode m3() {
        boolean z;
        int iA = ni8.a(1024);
        if (!getNode().getIsAttached()) {
            zw5.c("visitLocalDescendants called on an unattached node");
        }
        androidx.compose.ui.b.c node = getNode();
        if ((node.getAggregateChildKindSet() & iA) != 0) {
            boolean z2 = false;
            for (androidx.compose.ui.b.c child = node.getChild(); child != null; child = child.getChild()) {
                if ((child.getKindSet() & iA) != 0) {
                    androidx.compose.ui.b.c cVarJ = child;
                    r58 r58Var = null;
                    while (cVarJ != null) {
                        if (cVarJ instanceof FocusTargetNode) {
                            FocusTargetNode focusTargetNode = (FocusTargetNode) cVarJ;
                            if (z2) {
                                return focusTargetNode;
                            }
                            z = false;
                            z2 = true;
                        } else {
                            z = true;
                        }
                        if (z && (cVarJ.getKindSet() & iA) != 0 && (cVarJ instanceof k33)) {
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
            }
        }
        throw new IllegalStateException("Could not find focus target of embedded view wrapper");
    }

    @Override // androidx.compose.ui.b.c
    public void V2() {
        super.V2();
        ViewTreeObserver viewTreeObserver = z23.a(this).getViewTreeObserver();
        this.attachedViewTreeObserver = viewTreeObserver;
        viewTreeObserver.addOnGlobalFocusChangeListener(this);
    }

    @Override // androidx.compose.ui.b.c
    public void W2() {
        ViewTreeObserver viewTreeObserver = this.attachedViewTreeObserver;
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnGlobalFocusChangeListener(this);
        }
        this.attachedViewTreeObserver = null;
        z23.a(this).getViewTreeObserver().removeOnGlobalFocusChangeListener(this);
        this.focusedChild = null;
        super.W2();
    }

    @Override // com.google.inputmethod.tk4
    public void m2(FocusProperties focusProperties) {
        focusProperties.h(false);
        focusProperties.l(this.onEnter);
        focusProperties.p(this.onExit);
    }

    /* JADX INFO: renamed from: n3, reason: from getter */
    public final View getFocusedChild() {
        return this.focusedChild;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public void onGlobalFocusChanged(View oldFocus, View newFocus) throws NoWhenBranchMatchedException, KotlinNothingValueException {
        if (y23.q(this).getOwner() == null) {
            return;
        }
        View viewG = d.g(this);
        FocusOwner focusOwner = y23.r(this).getFocusOwner();
        m mVarR = y23.r(this);
        boolean z = (oldFocus == null || Intrinsics.e(oldFocus, mVarR) || !d.d(viewG, oldFocus)) ? false : true;
        boolean z2 = (newFocus == null || Intrinsics.e(newFocus, mVarR) || !d.d(viewG, newFocus)) ? false : true;
        if (z && z2) {
            this.focusedChild = newFocus;
            return;
        }
        if (z2) {
            this.focusedChild = newFocus;
            FocusTargetNode focusTargetNodeM3 = m3();
            if (focusTargetNodeM3.v1().c()) {
                return;
            }
            FocusTransactionsKt.k(focusTargetNodeM3);
            return;
        }
        if (!z) {
            this.focusedChild = null;
            return;
        }
        this.focusedChild = null;
        if (m3().v1().a()) {
            focusOwner.n(false, true, false, androidx.compose.ui.focus.b.INSTANCE.c());
        }
    }
}
