package com.google.inputmethod;

import androidx.compose.p001foundation.lazy.staggeredgrid.LazyStaggeredGridState;
import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "state", "Lcom/google/android/zs6;", "a", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Landroidx/compose/runtime/d;I)Lcom/google/android/zs6;", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class tx6 {
    public static final zs6 a(LazyStaggeredGridState lazyStaggeredGridState, d dVar, int i) {
        if (e.k()) {
            e.o(-363070453, i, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberLazyStaggeredGridBeyondBoundsState (LazyStaggeredGridBeyondBoundsModifier.kt:25)");
        }
        boolean z = (((i & 14) ^ 6) > 4 && dVar.x(lazyStaggeredGridState)) || (i & 6) == 4;
        Object objR = dVar.R();
        if (z || objR == d.INSTANCE.a()) {
            objR = new ux6(lazyStaggeredGridState);
            dVar.L(objR);
        }
        ux6 ux6Var = (ux6) objR;
        if (e.k()) {
            e.n();
        }
        return ux6Var;
    }
}
