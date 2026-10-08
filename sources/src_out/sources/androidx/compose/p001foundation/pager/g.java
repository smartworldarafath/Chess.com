package androidx.compose.p001foundation.pager;

import androidx.compose.p001foundation.gestures.Orientation;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.android.q06;
import com.google.inputmethod.fu0;
import com.google.inputmethod.kce;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\fJ'\u0010\u0011\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0018\u0010 \u001a\u00020\u001e*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001fR\u0015\u0010#\u001a\u00020!*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\"¨\u0006$"}, d2 = {"Landroidx/compose/foundation/pager/g;", "Lcom/google/android/fu0;", "Landroidx/compose/foundation/pager/PagerState;", "pagerState", "defaultBringIntoViewSpec", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "<init>", "(Landroidx/compose/foundation/pager/PagerState;Lcom/google/android/fu0;Landroidx/compose/ui/unit/LayoutDirection;)V", "", "containerSize", "f", "(F)F", "proposedOffsetMove", "e", "offset", "size", "b", "(FFF)F", "Landroidx/compose/foundation/pager/PagerState;", "getPagerState", "()Landroidx/compose/foundation/pager/PagerState;", "c", "Lcom/google/android/fu0;", "getDefaultBringIntoViewSpec", "()Lcom/google/android/fu0;", "d", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "", "(Landroidx/compose/foundation/pager/PagerState;)Z", "shouldChangeScrollDirection", "", "(Landroidx/compose/foundation/pager/PagerState;)I", "layoutAwareFirstOffset", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class g implements fu0 {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final PagerState pagerState;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final fu0 defaultBringIntoViewSpec;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final LayoutDirection layoutDirection;

    public g(PagerState pagerState, fu0 fu0Var, LayoutDirection layoutDirection) {
        this.pagerState = pagerState;
        this.defaultBringIntoViewSpec = fu0Var;
        this.layoutDirection = layoutDirection;
    }

    private final boolean d(PagerState pagerState) {
        return this.layoutDirection == LayoutDirection.Rtl && pagerState.J().getOrientation() == Orientation.Horizontal;
    }

    private final float e(float proposedOffsetMove) {
        float fC = c(this.pagerState) * (-1);
        while (proposedOffsetMove > 0.0f && fC < proposedOffsetMove) {
            fC += this.pagerState.Q();
        }
        while (proposedOffsetMove < 0.0f && fC > proposedOffsetMove) {
            fC -= this.pagerState.Q();
        }
        return fC;
    }

    private final float f(float containerSize) {
        int iQ;
        float fC = c(this.pagerState) * (-1.0f);
        if (d(this.pagerState)) {
            if (!this.pagerState.H()) {
                iQ = this.pagerState.Q();
                fC += iQ;
            }
        } else if (this.pagerState.H()) {
            iQ = this.pagerState.Q();
            fC += iQ;
        }
        return kotlin.ranges.g.n(fC, -containerSize, containerSize);
    }

    @Override // com.google.inputmethod.fu0
    public float b(float offset, float size, float containerSize) {
        float fB = this.defaultBringIntoViewSpec.b(offset, size, containerSize);
        boolean z = false;
        if (offset <= 0.0f ? offset + size <= kce.b(q06.a) : offset + size > containerSize) {
            z = true;
        }
        if (Math.abs(fB) != 0.0f && z) {
            return e(fB);
        }
        if (Math.abs(this.pagerState.getFirstVisiblePageOffset()) < 1.0E-6d) {
            return 0.0f;
        }
        return f(containerSize);
    }

    public final int c(PagerState pagerState) {
        return d(pagerState) ? (-pagerState.getFirstVisiblePageOffset()) + pagerState.Q() : pagerState.getFirstVisiblePageOffset();
    }
}
