package com.google.inputmethod;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public abstract class qwd {
    private static qwd a;

    public static qwd a() {
        if (a == null) {
            a = new swd();
        }
        return a;
    }
}
