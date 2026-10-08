package com.google.inputmethod;

import android.view.View;
import android.widget.PopupWindow;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public final class tg9 {
    public static void a(PopupWindow popupWindow, boolean z) {
        popupWindow.setOverlapAnchor(z);
    }

    public static void b(PopupWindow popupWindow, int i) {
        popupWindow.setWindowLayoutType(i);
    }

    @Deprecated
    public static void c(PopupWindow popupWindow, View view, int i, int i2, int i3) {
        popupWindow.showAsDropDown(view, i, i2, i3);
    }
}
