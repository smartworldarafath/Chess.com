package com.google.inputmethod;

import android.graphics.Typeface;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
class t21 {
    private final nm4.c a;
    private final Executor b;

    class a implements Runnable {
        final /* synthetic */ nm4.c a;
        final /* synthetic */ Typeface b;

        a(nm4.c cVar, Typeface typeface) {
            this.a = cVar;
            this.b = typeface;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.b(this.b);
        }
    }

    class b implements Runnable {
        final /* synthetic */ nm4.c a;
        final /* synthetic */ int b;

        b(nm4.c cVar, int i) {
            this.a = cVar;
            this.b = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.a(this.b);
        }
    }

    t21(nm4.c cVar, Executor executor) {
        this.a = cVar;
        this.b = executor;
    }

    private void a(int i) {
        this.b.execute(new b(this.a, i));
    }

    private void c(Typeface typeface) {
        this.b.execute(new a(this.a, typeface));
    }

    void b(cm4.e eVar) {
        if (eVar.a()) {
            c(eVar.a);
        } else {
            a(eVar.b);
        }
    }
}
