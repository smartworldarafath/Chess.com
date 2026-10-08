package com.google.inputmethod;

import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0018\u0010\u0004\u001a\u00020\u0001*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/google/android/lf3;", "Lcom/google/android/rn8;", "a", "(Lcom/google/android/lf3;)J", "positionInRoot", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class qf3 {
    public static final long a(lf3 lf3Var) {
        float x = lf3Var.getDragEvent().getX();
        float y = lf3Var.getDragEvent().getY();
        return rn8.e((((long) Float.floatToRawIntBits(x)) << 32) | (((long) Float.floatToRawIntBits(y)) & 4294967295L));
    }
}
