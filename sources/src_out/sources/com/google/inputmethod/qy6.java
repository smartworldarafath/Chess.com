package com.google.inputmethod;

import androidx.compose.p001foundation.gestures.Orientation;
import androidx.compose.p001foundation.lazy.staggeredgrid.LazyStaggeredGridState;
import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.android.ta2;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001ae\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016\u001a#\u0010\u0019\u001a\u00020\u000b*\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001a\u001a+\u0010\u001b\u001a\u00020\u000b*\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001b\u0010\u001c\u001a+\u0010\u001d\u001a\u00020\u000b*\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001d\u0010\u001c¨\u0006\u001e"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "state", "Lkotlin/Function0;", "Lcom/google/android/cy6;", "itemProviderLambda", "Lcom/google/android/rx8;", "contentPadding", "", "reverseLayout", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "Lcom/google/android/ff3;", "mainAxisSpacing", "crossAxisSpacing", "Lcom/google/android/ta2;", "coroutineScope", "Lcom/google/android/zq6;", "slots", "Lcom/google/android/i05;", "graphicsContext", "Lcom/google/android/vt6;", "f", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Lkotlin/jvm/functions/Function0;Lcom/google/android/rx8;ZLandroidx/compose/foundation/gestures/Orientation;FFLcom/google/android/ta2;Lcom/google/android/zq6;Lcom/google/android/i05;Landroidx/compose/runtime/d;I)Lcom/google/android/vt6;", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "g", "(Lcom/google/android/rx8;Landroidx/compose/foundation/gestures/Orientation;Landroidx/compose/ui/unit/LayoutDirection;)F", "e", "(Lcom/google/android/rx8;Landroidx/compose/foundation/gestures/Orientation;ZLandroidx/compose/ui/unit/LayoutDirection;)F", "d", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class qy6 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Orientation.values().length];
            try {
                iArr[Orientation.Vertical.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Orientation.Horizontal.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements vt6 {
        final /* synthetic */ LazyStaggeredGridState a;
        final /* synthetic */ Orientation b;
        final /* synthetic */ zq6 c;
        final /* synthetic */ Function0<cy6> d;
        final /* synthetic */ rx8 e;
        final /* synthetic */ boolean f;
        final /* synthetic */ float g;
        final /* synthetic */ ta2 h;
        final /* synthetic */ i05 i;

        /* JADX WARN: Multi-variable type inference failed */
        b(LazyStaggeredGridState lazyStaggeredGridState, Orientation orientation, zq6 zq6Var, Function0<? extends cy6> function0, rx8 rx8Var, boolean z, float f, ta2 ta2Var, i05 i05Var) {
            this.a = lazyStaggeredGridState;
            this.b = orientation;
            this.c = zq6Var;
            this.d = function0;
            this.e = rx8Var;
            this.f = z;
            this.g = f;
            this.h = ta2Var;
            this.i = i05Var;
        }

        @Override // com.google.inputmethod.vt6
        public final fj7 a(wt6 wt6Var, long j) {
            long jF;
            gn8.a(this.a.C());
            boolean z = this.a.getHasLookaheadOccurred() || wt6Var.G1();
            fa1.a(j, this.b);
            az6 az6VarA = this.c.a(wt6Var, j);
            boolean z2 = this.b == Orientation.Vertical;
            cy6 cy6Var = (cy6) this.d.invoke();
            int iO1 = wt6Var.O1(qy6.e(this.e, this.b, this.f, wt6Var.getLayoutDirection()));
            int iO2 = wt6Var.O1(qy6.d(this.e, this.b, this.f, wt6Var.getLayoutDirection()));
            int iO3 = wt6Var.O1(qy6.g(this.e, this.b, wt6Var.getLayoutDirection()));
            int iK = ((z2 ? kx1.k(j) : kx1.l(j)) - iO1) - iO2;
            if (z2) {
                jF = g16.f((((long) iO1) & 4294967295L) | (((long) iO3) << 32));
            } else {
                jF = g16.f((((long) iO1) << 32) | (((long) iO3) & 4294967295L));
            }
            long j2 = jF;
            rx8 rx8Var = this.e;
            int iO4 = wt6Var.O1(ff3.i(nx8.k(rx8Var, wt6Var.getLayoutDirection()) + nx8.j(rx8Var, wt6Var.getLayoutDirection())));
            rx8 rx8Var2 = this.e;
            int iO5 = wt6Var.O1(ff3.i(rx8Var2.getTop() + rx8Var2.getBottom()));
            sy6 sy6VarQ = py6.q(wt6Var, this.a, at6.a(cy6Var, this.a.getPinnedItems(), this.a.getBeyondBoundsInfo()), cy6Var, az6VarA, kx1.d(j, nx1.g(j, iO4), 0, nx1.f(j, iO5), 0, 10, null), z2, this.f, j2, iK, wt6Var.O1(this.g), iO1, iO2, this.h, z, wt6Var.G1(), this.a.getApproachLayoutInfo(), this.i);
            LazyStaggeredGridState.p(this.a, sy6VarQ, wt6Var.G1(), false, 4, null);
            return sy6VarQ;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final float d(rx8 rx8Var, Orientation orientation, boolean z, LayoutDirection layoutDirection) throws NoWhenBranchMatchedException {
        int i = a.$EnumSwitchMapping$0[orientation.ordinal()];
        if (i == 1) {
            return z ? rx8Var.getTop() : rx8Var.getBottom();
        }
        if (i == 2) {
            return z ? nx8.k(rx8Var, layoutDirection) : nx8.j(rx8Var, layoutDirection);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final float e(rx8 rx8Var, Orientation orientation, boolean z, LayoutDirection layoutDirection) throws NoWhenBranchMatchedException {
        int i = a.$EnumSwitchMapping$0[orientation.ordinal()];
        if (i == 1) {
            return z ? rx8Var.getBottom() : rx8Var.getTop();
        }
        if (i == 2) {
            return z ? nx8.j(rx8Var, layoutDirection) : nx8.k(rx8Var, layoutDirection);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final vt6 f(LazyStaggeredGridState lazyStaggeredGridState, Function0<? extends cy6> function0, rx8 rx8Var, boolean z, Orientation orientation, float f, float f2, ta2 ta2Var, zq6 zq6Var, i05 i05Var, d dVar, int i) {
        if (e.k()) {
            e.o(234882793, i, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberStaggeredGridMeasurePolicy (LazyStaggeredGridMeasurePolicy.kt:50)");
        }
        boolean zX = ((((i & 14) ^ 6) > 4 && dVar.x(lazyStaggeredGridState)) || (i & 6) == 4) | ((((i & 112) ^ 48) > 32 && dVar.x(function0)) || (i & 48) == 32) | ((((i & 896) ^ 384) > 256 && dVar.x(rx8Var)) || (i & 384) == 256) | ((((i & 7168) ^ 3072) > 2048 && dVar.A(z)) || (i & 3072) == 2048) | ((((57344 & i) ^ 24576) > 16384 && dVar.C(orientation.ordinal())) || (i & 24576) == 16384) | ((((458752 & i) ^ 196608) > 131072 && dVar.B(f)) || (i & 196608) == 131072) | ((((3670016 & i) ^ 1572864) > 1048576 && dVar.B(f2)) || (i & 1572864) == 1048576) | ((((234881024 & i) ^ 100663296) > 67108864 && dVar.x(zq6Var)) || (i & 100663296) == 67108864) | dVar.x(i05Var);
        Object objR = dVar.R();
        if (zX || objR == d.INSTANCE.a()) {
            b bVar = new b(lazyStaggeredGridState, orientation, zq6Var, function0, rx8Var, z, f, ta2Var, i05Var);
            dVar.L(bVar);
            objR = bVar;
        }
        vt6 vt6Var = (vt6) objR;
        if (e.k()) {
            e.n();
        }
        return vt6Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final float g(rx8 rx8Var, Orientation orientation, LayoutDirection layoutDirection) throws NoWhenBranchMatchedException {
        int i = a.$EnumSwitchMapping$0[orientation.ordinal()];
        if (i == 1) {
            return nx8.k(rx8Var, layoutDirection);
        }
        if (i == 2) {
            return rx8Var.getTop();
        }
        throw new NoWhenBranchMatchedException();
    }
}
