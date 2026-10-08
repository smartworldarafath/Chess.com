package com.google.inputmethod;

import androidx.compose.p001foundation.pager.PagerState;
import com.google.android.sh7;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/pager/PagerState;", "", "a", "(Landroidx/compose/foundation/pager/PagerState;)J", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class nz8 {
    public static final long a(PagerState pagerState) {
        return (((long) pagerState.A()) * ((long) pagerState.Q())) + sh7.f(pagerState.B() * pagerState.Q());
    }
}
