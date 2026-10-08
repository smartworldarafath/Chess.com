package com.google.inputmethod;

import android.os.Build;
import android.view.View;
import android.view.Window;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public final class she {

    static class a {
        static void a(Window window, boolean z) {
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
        }
    }

    static class b {
        static void a(Window window, boolean z) {
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z ? systemUiVisibility & (-257) : systemUiVisibility | 256);
            window.setDecorFitsSystemWindows(z);
        }
    }

    static class c {
        static void a(Window window, boolean z) {
            window.setDecorFitsSystemWindows(z);
        }
    }

    public static kje a(Window window, View view) {
        return new kje(window, view);
    }

    public static void b(Window window, boolean z) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            c.a(window, z);
        } else if (i >= 30) {
            b.a(window, z);
        } else {
            a.a(window, z);
        }
    }
}
