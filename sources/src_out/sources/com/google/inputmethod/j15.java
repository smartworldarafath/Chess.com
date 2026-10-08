package com.google.inputmethod;

import android.graphics.Rect;
import android.view.Gravity;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public final class j15 {
    public static void a(int i, int i2, int i3, Rect rect, Rect rect2, int i4) {
        Gravity.apply(i, i2, i3, rect, rect2, i4);
    }

    public static int b(int i, int i2) {
        return Gravity.getAbsoluteGravity(i, i2);
    }
}
