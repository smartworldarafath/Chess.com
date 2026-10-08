package com.google.inputmethod;

import android.os.Build;
import android.view.Display;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public final class wc3 {
    public static jqa a(Display display, int i) {
        if (Build.VERSION.SDK_INT >= 31) {
            return jqa.d(display.getRoundedCorner(i));
        }
        return null;
    }
}
