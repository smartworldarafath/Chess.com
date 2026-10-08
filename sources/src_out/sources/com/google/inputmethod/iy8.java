package com.google.inputmethod;

import androidx.compose.p001foundation.pager.PagerState;
import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/foundation/pager/PagerState;", "state", "", "beyondViewportPageCount", "Lcom/google/android/zs6;", "a", "(Landroidx/compose/foundation/pager/PagerState;ILandroidx/compose/runtime/d;I)Lcom/google/android/zs6;", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class iy8 {
    public static final zs6 a(PagerState pagerState, int i, d dVar, int i2) {
        if (e.k()) {
            e.o(373558254, i2, -1, "androidx.compose.foundation.pager.rememberPagerBeyondBoundsState (PagerBeyondBoundsModifier.kt:25)");
        }
        boolean z = ((((i2 & 14) ^ 6) > 4 && dVar.x(pagerState)) || (i2 & 6) == 4) | ((((i2 & 112) ^ 48) > 32 && dVar.C(i)) || (i2 & 48) == 32);
        Object objR = dVar.R();
        if (z || objR == d.INSTANCE.a()) {
            objR = new jy8(pagerState, i);
            dVar.L(objR);
        }
        jy8 jy8Var = (jy8) objR;
        if (e.k()) {
            e.n();
        }
        return jy8Var;
    }
}
