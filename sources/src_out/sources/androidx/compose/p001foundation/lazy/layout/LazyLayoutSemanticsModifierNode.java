package androidx.compose.p001foundation.lazy.layout;

import androidx.compose.p001foundation.gestures.Orientation;
import androidx.compose.ui.b;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import com.google.android.rw0;
import com.google.inputmethod.CollectionInfo;
import com.google.inputmethod.ScrollAxisRange;
import com.google.inputmethod.bfb;
import com.google.inputmethod.cfb;
import com.google.inputmethod.cx5;
import com.google.inputmethod.lt6;
import com.google.inputmethod.nfb;
import com.google.inputmethod.tu6;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B5\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J;\u0010\u0012\u001a\u00020\u000f2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\u0012\u0010\u000eJ\u0013\u0010\u0014\u001a\u00020\u000f*\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\f\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b \u0010!R \u0010(\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R$\u0010*\u001a\u0010\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\n\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010'R\u0014\u0010-\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0014\u00101\u001a\u00020.8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b/\u00100R\u0014\u00103\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u0010,¨\u00064"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifierNode;", "Landroidx/compose/ui/b$c;", "Lcom/google/android/bfb;", "Lkotlin/Function0;", "Lcom/google/android/lt6;", "itemProviderLambda", "Lcom/google/android/tu6;", "state", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "", "userScrollEnabled", "reverseScrolling", "<init>", "(Lkotlin/jvm/functions/Function0;Lcom/google/android/tu6;Landroidx/compose/foundation/gestures/Orientation;ZZ)V", "", "x3", "()V", "w3", "Lcom/google/android/nfb;", "H0", "(Lcom/google/android/nfb;)V", "p", "Lkotlin/jvm/functions/Function0;", "q", "Lcom/google/android/tu6;", "r", "Landroidx/compose/foundation/gestures/Orientation;", "s", "Z", "t", "Lcom/google/android/a9b;", "u", "Lcom/google/android/a9b;", "scrollAxisRange", "Lkotlin/Function1;", "", "", "v", "Lkotlin/jvm/functions/Function1;", "indexForKeyMapping", "w", "scrollToIndexAction", "v3", "()Z", "isVertical", "Lcom/google/android/nh1;", "t3", "()Lcom/google/android/nh1;", "collectionInfo", "Q2", "shouldAutoInvalidate", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class LazyLayoutSemanticsModifierNode extends b.c implements bfb {

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private Function0<? extends lt6> itemProviderLambda;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private tu6 state;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private Orientation orientation;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private boolean userScrollEnabled;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private boolean reverseScrolling;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private ScrollAxisRange scrollAxisRange;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private final Function1<Object, Integer> indexForKeyMapping = new Function1() { // from class: androidx.compose.foundation.lazy.layout.h
        public final Object invoke(Object obj) {
            return Integer.valueOf(LazyLayoutSemanticsModifierNode.u3(this.a, obj));
        }
    };

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private Function1<? super Integer, Boolean> scrollToIndexAction;

    public LazyLayoutSemanticsModifierNode(Function0<? extends lt6> function0, tu6 tu6Var, Orientation orientation, boolean z, boolean z2) {
        this.itemProviderLambda = function0;
        this.state = tu6Var;
        this.orientation = orientation;
        this.userScrollEnabled = z;
        this.reverseScrolling = z2;
        x3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean A3(LazyLayoutSemanticsModifierNode lazyLayoutSemanticsModifierNode, int i) {
        lt6 lt6Var = (lt6) lazyLayoutSemanticsModifierNode.itemProviderLambda.invoke();
        if (!(i >= 0 && i < lt6Var.a())) {
            cx5.a("Can't scroll to index " + i + ", it is out of bounds [0, " + lt6Var.a() + ')');
        }
        rw0.d(lazyLayoutSemanticsModifierNode.L2(), (CoroutineContext) null, (CoroutineStart) null, new LazyLayoutSemanticsModifierNode$updateCachedSemanticsValues$3$2(lazyLayoutSemanticsModifierNode, i, null), 3, (Object) null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Float s3(LazyLayoutSemanticsModifierNode lazyLayoutSemanticsModifierNode) {
        return Float.valueOf(lazyLayoutSemanticsModifierNode.state.f() - lazyLayoutSemanticsModifierNode.state.a());
    }

    private final CollectionInfo t3() {
        return this.state.e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int u3(LazyLayoutSemanticsModifierNode lazyLayoutSemanticsModifierNode, Object obj) {
        lt6 lt6Var = (lt6) lazyLayoutSemanticsModifierNode.itemProviderLambda.invoke();
        int iA = lt6Var.a();
        for (int i = 0; i < iA; i++) {
            if (Intrinsics.e(lt6Var.d(i), obj)) {
                return i;
            }
        }
        return -1;
    }

    private final boolean v3() {
        return this.orientation == Orientation.Vertical;
    }

    private final void x3() {
        this.scrollAxisRange = new ScrollAxisRange(new Function0() { // from class: androidx.compose.foundation.lazy.layout.i
            public final Object invoke() {
                return Float.valueOf(LazyLayoutSemanticsModifierNode.y3(this.a));
            }
        }, new Function0() { // from class: androidx.compose.foundation.lazy.layout.j
            public final Object invoke() {
                return Float.valueOf(LazyLayoutSemanticsModifierNode.z3(this.a));
            }
        }, this.reverseScrolling);
        this.scrollToIndexAction = this.userScrollEnabled ? new Function1() { // from class: androidx.compose.foundation.lazy.layout.k
            public final Object invoke(Object obj) {
                return Boolean.valueOf(LazyLayoutSemanticsModifierNode.A3(this.a, ((Integer) obj).intValue()));
            }
        } : null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float y3(LazyLayoutSemanticsModifierNode lazyLayoutSemanticsModifierNode) {
        return lazyLayoutSemanticsModifierNode.state.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float z3(LazyLayoutSemanticsModifierNode lazyLayoutSemanticsModifierNode) {
        return lazyLayoutSemanticsModifierNode.state.d();
    }

    @Override // com.google.inputmethod.bfb
    public void H0(nfb nfbVar) {
        SemanticsPropertiesKt.F0(nfbVar, true);
        SemanticsPropertiesKt.t(nfbVar, this.indexForKeyMapping);
        if (v3()) {
            ScrollAxisRange scrollAxisRange = this.scrollAxisRange;
            if (scrollAxisRange == null) {
                Intrinsics.x("scrollAxisRange");
                scrollAxisRange = null;
            }
            SemanticsPropertiesKt.H0(nfbVar, scrollAxisRange);
        } else {
            ScrollAxisRange scrollAxisRange2 = this.scrollAxisRange;
            if (scrollAxisRange2 == null) {
                Intrinsics.x("scrollAxisRange");
                scrollAxisRange2 = null;
            }
            SemanticsPropertiesKt.i0(nfbVar, scrollAxisRange2);
        }
        Function1<? super Integer, Boolean> function1 = this.scrollToIndexAction;
        if (function1 != null) {
            SemanticsPropertiesKt.W(nfbVar, null, function1, 1, null);
        }
        SemanticsPropertiesKt.o(nfbVar, null, new Function0() { // from class: androidx.compose.foundation.lazy.layout.l
            public final Object invoke() {
                return LazyLayoutSemanticsModifierNode.s3(this.a);
            }
        }, 1, null);
        SemanticsPropertiesKt.Y(nfbVar, t3());
    }

    @Override // androidx.compose.ui.b.c
    /* JADX INFO: renamed from: Q2 */
    public boolean getShouldAutoInvalidate() {
        return false;
    }

    public final void w3(Function0<? extends lt6> itemProviderLambda, tu6 state, Orientation orientation, boolean userScrollEnabled, boolean reverseScrolling) {
        this.itemProviderLambda = itemProviderLambda;
        this.state = state;
        if (this.orientation != orientation) {
            this.orientation = orientation;
            cfb.d(this);
        }
        if (this.userScrollEnabled == userScrollEnabled && this.reverseScrolling == reverseScrolling) {
            return;
        }
        this.userScrollEnabled = userScrollEnabled;
        this.reverseScrolling = reverseScrolling;
        x3();
        cfb.d(this);
    }
}
