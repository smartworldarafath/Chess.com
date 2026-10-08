package com.google.inputmethod;

import androidx.compose.p001foundation.gestures.Orientation;
import androidx.compose.p001foundation.pager.PagerState;
import com.google.android.q22;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ranges.g;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\f\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u0019\u0010\u000e\u001a\u00020\r*\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J \u0010\u0018\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\rH\u0096@¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lcom/google/android/hy2;", "Lcom/google/android/re8;", "Landroidx/compose/foundation/pager/PagerState;", "state", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "<init>", "(Landroidx/compose/foundation/pager/PagerState;Landroidx/compose/foundation/gestures/Orientation;)V", "Lcom/google/android/rn8;", "", "c", "(J)F", "b", "Lcom/google/android/t3e;", "a", "(JLandroidx/compose/foundation/gestures/Orientation;)J", "available", "Lcom/google/android/we8;", "source", "v2", "(JI)J", "consumed", "o0", "(JJI)J", "r1", "(JJLcom/google/android/q22;)Ljava/lang/Object;", "Landroidx/compose/foundation/pager/PagerState;", "getState", "()Landroidx/compose/foundation/pager/PagerState;", "Landroidx/compose/foundation/gestures/Orientation;", "getOrientation", "()Landroidx/compose/foundation/gestures/Orientation;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class hy2 implements re8 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final PagerState state;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Orientation orientation;

    public hy2(PagerState pagerState, Orientation orientation) {
        this.state = pagerState;
        this.orientation = orientation;
    }

    private final float b(long j) {
        return Float.intBitsToFloat((int) (this.orientation == Orientation.Horizontal ? j >> 32 : j & 4294967295L));
    }

    private final float c(long j) {
        return Float.intBitsToFloat((int) (this.orientation == Orientation.Horizontal ? j >> 32 : j & 4294967295L));
    }

    public final long a(long j, Orientation orientation) {
        return orientation == Orientation.Vertical ? t3e.e(j, 0.0f, 0.0f, 2, null) : t3e.e(j, 0.0f, 0.0f, 1, null);
    }

    @Override // com.google.inputmethod.re8
    public long o0(long consumed, long available, int source) {
        if (!we8.d(source, we8.INSTANCE.a()) || b(available) == 0.0f) {
            return rn8.INSTANCE.c();
        }
        throw new CancellationException("Scroll cancelled");
    }

    @Override // com.google.inputmethod.re8
    public Object r1(long j, long j2, q22<? super t3e> q22Var) {
        return t3e.b(a(j2, this.orientation));
    }

    @Override // com.google.inputmethod.re8
    public long v2(long available, int source) {
        if (!we8.d(source, we8.INSTANCE.b()) || Math.abs(this.state.B()) <= 1.0E-6d || Math.abs(c(available)) <= 0.0f) {
            return rn8.INSTANCE.c();
        }
        wy8 wy8VarJ = this.state.J();
        float fB = this.state.B() * this.state.P();
        float pageSize = ((wy8VarJ.getPageSize() + wy8VarJ.getPageSpacing()) * (-Math.signum(this.state.B()))) + fB;
        if (this.state.B() > 0.0f) {
            pageSize = fB;
            fB = pageSize;
        }
        float fN = g.n(c(available), fB, pageSize);
        Orientation orientation = this.orientation;
        Orientation orientation2 = Orientation.Horizontal;
        float fD = (orientation == orientation2 && wy8VarJ.getReverseLayout() && up1.isReverseLayoutNestedScrollConnectionInPagerFixEnabled) ? this.state.d(fN) : -this.state.d(-fN);
        float fIntBitsToFloat = this.orientation == orientation2 ? fD : Float.intBitsToFloat((int) (available >> 32));
        if (this.orientation != Orientation.Vertical) {
            fD = Float.intBitsToFloat((int) (4294967295L & available));
        }
        return rn8.f(available, fIntBitsToFloat, fD);
    }
}
