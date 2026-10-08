package androidx.compose.p001foundation.gestures.snapping;

import androidx.compose.p001foundation.gestures.Orientation;
import androidx.compose.p001foundation.pager.PagerState;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.android.ps4;
import com.google.android.qjd;
import com.google.inputmethod.bwb;
import com.google.inputmethod.cwb;
import com.google.inputmethod.cx5;
import com.google.inputmethod.qz8;
import com.google.inputmethod.wy8;
import com.google.inputmethod.xy8;
import com.google.inputmethod.yx8;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u001a?\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u001e\u0010\u0006\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u001b\u0010\f\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\n\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\f\u0010\r\u001a\u0013\u0010\u000e\u001a\u00020\u0005*\u00020\u0000H\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a?\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Landroidx/compose/foundation/pager/PagerState;", "pagerState", "Lcom/google/android/qz8;", "pagerSnapDistance", "Lkotlin/Function3;", "", "calculateFinalSnappingBound", "Lcom/google/android/bwb;", "a", "(Landroidx/compose/foundation/pager/PagerState;Lcom/google/android/qz8;Lcom/google/android/ps4;)Lcom/google/android/bwb;", "velocity", "", "e", "(Landroidx/compose/foundation/pager/PagerState;F)Z", "d", "(Landroidx/compose/foundation/pager/PagerState;)F", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "snapPositionalThreshold", "flingVelocity", "lowerBoundOffset", "upperBoundOffset", "c", "(Landroidx/compose/foundation/pager/PagerState;Landroidx/compose/ui/unit/LayoutDirection;FFFF)F", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class g {

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J+\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\n\u001a\u00020\t*\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0014\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"androidx/compose/foundation/gestures/snapping/g$a", "Lcom/google/android/bwb;", "Landroidx/compose/foundation/gestures/snapping/j;", "snapPosition", "", "velocity", "Lkotlin/Pair;", "e", "(Landroidx/compose/foundation/gestures/snapping/j;F)Lkotlin/Pair;", "", "d", "(F)Z", "a", "(F)F", "decayOffset", "b", "(FF)F", "Lcom/google/android/wy8;", "c", "()Lcom/google/android/wy8;", "layoutInfo", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements bwb {
        final /* synthetic */ PagerState a;
        final /* synthetic */ ps4<Float, Float, Float, Float> b;
        final /* synthetic */ qz8 c;

        /* JADX WARN: Multi-variable type inference failed */
        a(PagerState pagerState, ps4<? super Float, ? super Float, ? super Float, Float> ps4Var, qz8 qz8Var) {
            this.a = pagerState;
            this.b = ps4Var;
            this.c = qz8Var;
        }

        private final Pair<Float, Float> e(j snapPosition, float velocity) {
            float f;
            List<yx8> listM = c().m();
            PagerState pagerState = this.a;
            int size = listM.size();
            int i = 0;
            float f2 = Float.NEGATIVE_INFINITY;
            float f3 = Float.POSITIVE_INFINITY;
            while (true) {
                f = 0.0f;
                if (i >= size) {
                    break;
                }
                yx8 yx8Var = listM.get(i);
                float fA = cwb.a(xy8.a(c()), c().e(), c().getAfterContentPadding(), c().getPageSize(), yx8Var.getOffset(), yx8Var.getIndex(), snapPosition, pagerState.O());
                if (fA <= 0.0f && fA > f2) {
                    f2 = fA;
                }
                if (fA >= 0.0f && fA < f3) {
                    f3 = fA;
                }
                i++;
            }
            if (f2 == Float.NEGATIVE_INFINITY) {
                f2 = f3;
            }
            if (f3 == Float.POSITIVE_INFINITY) {
                f3 = f2;
            }
            if (!this.a.c()) {
                if (g.e(this.a, velocity)) {
                    f2 = 0.0f;
                    f3 = 0.0f;
                } else {
                    f3 = 0.0f;
                }
            }
            if (this.a.f()) {
                f = f2;
            } else if (!g.e(this.a, velocity)) {
                f3 = 0.0f;
            }
            return qjd.a(Float.valueOf(f), Float.valueOf(f3));
        }

        @Override // com.google.inputmethod.bwb
        public float a(float velocity) {
            Pair<Float, Float> pairE = e(this.a.J().getSnapPosition(), velocity);
            float fFloatValue = ((Number) pairE.a()).floatValue();
            float fFloatValue2 = ((Number) pairE.b()).floatValue();
            float fFloatValue3 = ((Number) this.b.invoke(Float.valueOf(velocity), Float.valueOf(fFloatValue), Float.valueOf(fFloatValue2))).floatValue();
            if (!(fFloatValue3 == fFloatValue || fFloatValue3 == fFloatValue2 || fFloatValue3 == 0.0f)) {
                cx5.c("Final Snapping Offset Should Be one of " + fFloatValue + ", " + fFloatValue2 + " or 0.0");
            }
            if (d(fFloatValue3)) {
                return fFloatValue3;
            }
            return 0.0f;
        }

        @Override // com.google.inputmethod.bwb
        public float b(float velocity, float decayOffset) {
            int iP = this.a.P() + this.a.R();
            if (iP == 0) {
                return 0.0f;
            }
            int firstVisiblePage = velocity < 0.0f ? this.a.getFirstVisiblePage() + 1 : this.a.getFirstVisiblePage();
            int iE = kotlin.ranges.g.e(Math.abs((kotlin.ranges.g.o(this.c.a(firstVisiblePage, kotlin.ranges.g.o(((int) (decayOffset / iP)) + firstVisiblePage, 0, this.a.O()), velocity, this.a.P(), this.a.R()), 0, this.a.O()) - firstVisiblePage) * iP) - iP, 0);
            return iE == 0 ? iE : iE * Math.signum(velocity);
        }

        public final wy8 c() {
            return this.a.J();
        }

        public final boolean d(float f) {
            return (f == Float.POSITIVE_INFINITY || f == Float.NEGATIVE_INFINITY) ? false : true;
        }
    }

    public static final bwb a(PagerState pagerState, qz8 qz8Var, ps4<? super Float, ? super Float, ? super Float, Float> ps4Var) {
        return new a(pagerState, ps4Var, qz8Var);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0086 A[RETURN] */
    public static final float c(PagerState pagerState, LayoutDirection layoutDirection, float f, float f2, float f3, float f4) {
        boolean zE = e(pagerState, f2);
        if (pagerState.J().getOrientation() != Orientation.Vertical && layoutDirection != LayoutDirection.Ltr) {
            zE = !zE;
        }
        int pageSize = pagerState.J().getPageSize();
        float fD = pageSize == 0 ? 0.0f : d(pagerState) / pageSize;
        float f5 = fD - ((int) fD);
        int iC = f.c(pagerState.getDensity(), f2);
        d.Companion companion = d.INSTANCE;
        if (!d.e(iC, companion.a())) {
            if (!d.e(iC, companion.b())) {
                if (d.e(iC, companion.c())) {
                    return f3;
                }
                return 0.0f;
            }
            return f4;
        }
        if (Math.abs(f5) <= f ? Math.abs(fD) < Math.abs(pagerState.U()) ? Math.abs(f3) >= Math.abs(f4) : !zE : zE) {
            return f4;
        }
        return f3;
    }

    private static final float d(PagerState pagerState) {
        return pagerState.J().getOrientation() == Orientation.Horizontal ? Float.intBitsToFloat((int) (pagerState.c0() >> 32)) : Float.intBitsToFloat((int) (pagerState.c0() & 4294967295L));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean e(PagerState pagerState, float f) {
        boolean reverseLayout = pagerState.J().getReverseLayout();
        boolean z = (pagerState.e0() ? -f : d(pagerState)) > 0.0f;
        return (z && reverseLayout) || !(z || reverseLayout);
    }
}
