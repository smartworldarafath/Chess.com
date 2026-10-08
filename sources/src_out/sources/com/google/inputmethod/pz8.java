package com.google.inputmethod;

import androidx.compose.p001foundation.pager.PagerState;
import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/foundation/pager/PagerState;", "state", "", "isVertical", "Lcom/google/android/tu6;", "a", "(Landroidx/compose/foundation/pager/PagerState;ZLandroidx/compose/runtime/d;I)Lcom/google/android/tu6;", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class pz8 {
    public static final tu6 a(PagerState pagerState, boolean z, d dVar, int i) {
        if (e.k()) {
            e.o(-786344289, i, -1, "androidx.compose.foundation.pager.rememberPagerSemanticState (PagerSemantics.kt:26)");
        }
        boolean z2 = ((((i & 14) ^ 6) > 4 && dVar.x(pagerState)) || (i & 6) == 4) | ((((i & 112) ^ 48) > 32 && dVar.A(z)) || (i & 48) == 32);
        Object objR = dVar.R();
        if (z2 || objR == d.INSTANCE.a()) {
            objR = vu6.a(pagerState, z);
            dVar.L(objR);
        }
        tu6 tu6Var = (tu6) objR;
        if (e.k()) {
            e.n();
        }
        return tu6Var;
    }
}
