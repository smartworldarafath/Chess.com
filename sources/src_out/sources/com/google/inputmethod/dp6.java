package com.google.inputmethod;

import androidx.compose.p001foundation.lazy.grid.LazyGridState;
import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridState;", "state", "Lcom/google/android/zs6;", "a", "(Landroidx/compose/foundation/lazy/grid/LazyGridState;Landroidx/compose/runtime/d;I)Lcom/google/android/zs6;", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class dp6 {
    public static final zs6 a(LazyGridState lazyGridState, d dVar, int i) {
        if (e.k()) {
            e.o(2004349821, i, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridBeyondBoundsState (LazyGridBeyondBoundsModifier.kt:24)");
        }
        boolean z = (((i & 14) ^ 6) > 4 && dVar.x(lazyGridState)) || (i & 6) == 4;
        Object objR = dVar.R();
        if (z || objR == d.INSTANCE.a()) {
            objR = new ep6(lazyGridState);
            dVar.L(objR);
        }
        ep6 ep6Var = (ep6) objR;
        if (e.k()) {
            e.n();
        }
        return ep6Var;
    }
}
