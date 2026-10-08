package com.google.inputmethod;

import android.os.Build;
import android.view.ScrollFeedbackProvider;
import android.view.View;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public class f9b {
    private final d a;

    private static class b implements d {
        private final ScrollFeedbackProvider a;

        b(View view) {
            this.a = ScrollFeedbackProvider.createProvider(view);
        }

        @Override // com.google.android.f9b.d
        public void onScrollLimit(int i, int i2, int i3, boolean z) {
            this.a.onScrollLimit(i, i2, i3, z);
        }

        @Override // com.google.android.f9b.d
        public void onScrollProgress(int i, int i2, int i3, int i4) {
            this.a.onScrollProgress(i, i2, i3, i4);
        }
    }

    private static class c implements d {
        private c() {
        }

        @Override // com.google.android.f9b.d
        public void onScrollLimit(int i, int i2, int i3, boolean z) {
        }

        @Override // com.google.android.f9b.d
        public void onScrollProgress(int i, int i2, int i3, int i4) {
        }
    }

    private interface d {
        void onScrollLimit(int i, int i2, int i3, boolean z);

        void onScrollProgress(int i, int i2, int i3, int i4);
    }

    private f9b(View view) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.a = new b(view);
        } else {
            this.a = new c();
        }
    }

    public static f9b a(View view) {
        return new f9b(view);
    }

    public void b(int i, int i2, int i3, boolean z) {
        this.a.onScrollLimit(i, i2, i3, z);
    }

    public void c(int i, int i2, int i3, int i4) {
        this.a.onScrollProgress(i, i2, i3, i4);
    }
}
