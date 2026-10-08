package com.google.inputmethod;

import androidx.compose.p001foundation.gestures.Orientation;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\"\u0018\u0010\u0004\u001a\u00020\u0001*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/google/android/wy8;", "", "a", "(Lcom/google/android/wy8;)I", "mainAxisViewportSize", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class xy8 {
    public static final int a(wy8 wy8Var) {
        return (int) (wy8Var.a() == Orientation.Vertical ? wy8Var.b() & 4294967295L : wy8Var.b() >> 32);
    }
}
