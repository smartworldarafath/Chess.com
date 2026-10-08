package com.google.inputmethod;

import android.content.Context;
import android.view.PointerIcon;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public final class oe9 {
    private final PointerIcon a;

    static class a {
        static PointerIcon a(Context context, int i) {
            return PointerIcon.getSystemIcon(context, i);
        }
    }

    private oe9(PointerIcon pointerIcon) {
        this.a = pointerIcon;
    }

    public static oe9 b(Context context, int i) {
        return new oe9(a.a(context, i));
    }

    public Object a() {
        return this.a;
    }
}
