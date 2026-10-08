package com.google.inputmethod;

import androidx.compose.p001foundation.gestures.Orientation;
import androidx.compose.ui.b;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001b\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\"\u001a\u0010\t\u001a\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Landroidx/compose/ui/b;", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "a", "(Landroidx/compose/ui/b;Landroidx/compose/foundation/gestures/Orientation;)Landroidx/compose/ui/b;", "Lcom/google/android/ff3;", "F", "b", "()F", "MaxSupportedElevation", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class hf1 {
    private static final float a = ff3.i(30);

    public static final b a(b bVar, Orientation orientation) {
        return bVar.then(orientation == Orientation.Vertical ? ff1.a(b.INSTANCE, u4e.a) : ff1.a(b.INSTANCE, rf5.a));
    }

    public static final float b() {
        return a;
    }
}
