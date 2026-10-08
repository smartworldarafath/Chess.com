package androidx.compose.p001foundation.pager;

import com.google.inputmethod.fu0;
import kotlin.Metadata;
import kotlin.ranges.g;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u000f\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\t\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Landroidx/compose/foundation/pager/e;", "Lcom/google/android/fu0;", "Landroidx/compose/foundation/pager/PagerState;", "pagerState", "defaultBringIntoViewSpec", "<init>", "(Landroidx/compose/foundation/pager/PagerState;Lcom/google/android/fu0;)V", "", "proposedOffsetMove", "c", "(F)F", "offset", "size", "containerSize", "b", "(FFF)F", "Landroidx/compose/foundation/pager/PagerState;", "getPagerState", "()Landroidx/compose/foundation/pager/PagerState;", "Lcom/google/android/fu0;", "getDefaultBringIntoViewSpec", "()Lcom/google/android/fu0;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class e implements fu0 {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final PagerState pagerState;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final fu0 defaultBringIntoViewSpec;

    public e(PagerState pagerState, fu0 fu0Var) {
        this.pagerState = pagerState;
        this.defaultBringIntoViewSpec = fu0Var;
    }

    private final float c(float proposedOffsetMove) {
        float firstVisiblePageOffset = this.pagerState.getFirstVisiblePageOffset() * (-1);
        while (proposedOffsetMove > 0.0f && firstVisiblePageOffset < proposedOffsetMove) {
            firstVisiblePageOffset += this.pagerState.Q();
        }
        while (proposedOffsetMove < 0.0f && firstVisiblePageOffset > proposedOffsetMove) {
            firstVisiblePageOffset -= this.pagerState.Q();
        }
        return firstVisiblePageOffset;
    }

    @Override // com.google.inputmethod.fu0
    public float b(float offset, float size, float containerSize) {
        float fB = this.defaultBringIntoViewSpec.b(offset, size, containerSize);
        boolean z = false;
        if (offset <= 0.0f ? offset + size <= 0.0f : offset + size > containerSize) {
            z = true;
        }
        if (Math.abs(fB) != 0.0f && z) {
            return c(fB);
        }
        if (Math.abs(this.pagerState.getFirstVisiblePageOffset()) < 1.0E-6d) {
            return 0.0f;
        }
        float firstVisiblePageOffset = this.pagerState.getFirstVisiblePageOffset() * (-1.0f);
        if (this.pagerState.H()) {
            firstVisiblePageOffset += this.pagerState.Q();
        }
        return g.n(firstVisiblePageOffset, -containerSize, containerSize);
    }
}
