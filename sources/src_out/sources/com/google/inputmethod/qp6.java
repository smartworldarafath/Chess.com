package com.google.inputmethod;

import androidx.compose.p001foundation.gestures.Orientation;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/google/android/pp6;", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "", "a", "(Lcom/google/android/pp6;Landroidx/compose/foundation/gestures/Orientation;)I", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class qp6 {
    public static final int a(pp6 pp6Var, Orientation orientation) {
        return orientation == Orientation.Vertical ? pp6Var.k() : pp6Var.getColumn();
    }
}
