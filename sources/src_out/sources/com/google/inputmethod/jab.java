package com.google.inputmethod;

import androidx.compose.p001foundation.gestures.DefaultFlingBehavior;
import androidx.compose.p001foundation.gestures.ScrollableKt;
import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u000f\u0010\u0004\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/google/android/bab;", "a", "()Lcom/google/android/bab;", "Lcom/google/android/qg4;", "b", "(Landroidx/compose/runtime/d;I)Lcom/google/android/qg4;", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class jab {
    public static final bab a() {
        return new DefaultFlingBehavior(e2c.c(ScrollableKt.i()), null, 2, null);
    }

    public static final qg4 b(d dVar, int i) {
        if (e.k()) {
            e.o(162564459, i, -1, "androidx.compose.foundation.gestures.rememberPlatformDefaultFlingBehavior (Scrollable.android.kt:28)");
        }
        vq2 vq2VarB = g2c.b(dVar, 0);
        boolean zX = dVar.x(vq2VarB);
        Object objR = dVar.R();
        if (zX || objR == d.INSTANCE.a()) {
            objR = new DefaultFlingBehavior(vq2VarB, null, 2, null);
            dVar.L(objR);
        }
        DefaultFlingBehavior defaultFlingBehavior = (DefaultFlingBehavior) objR;
        if (e.k()) {
            e.n();
        }
        return defaultFlingBehavior;
    }
}
