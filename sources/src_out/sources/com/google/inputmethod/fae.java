package com.google.inputmethod;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public class fae {
    private Interpolator c;
    gae d;
    private boolean e;
    private long b = -1;
    private final hae f = new a();
    final ArrayList<eae> a = new ArrayList<>();

    class a extends hae {
        private boolean a = false;
        private int b = 0;

        a() {
        }

        @Override // com.google.inputmethod.gae
        public void b(View view) {
            int i = this.b + 1;
            this.b = i;
            if (i == fae.this.a.size()) {
                gae gaeVar = fae.this.d;
                if (gaeVar != null) {
                    gaeVar.b(null);
                }
                d();
            }
        }

        @Override // com.google.inputmethod.hae, com.google.inputmethod.gae
        public void c(View view) {
            if (this.a) {
                return;
            }
            this.a = true;
            gae gaeVar = fae.this.d;
            if (gaeVar != null) {
                gaeVar.c(null);
            }
        }

        void d() {
            this.b = 0;
            this.a = false;
            fae.this.b();
        }
    }

    public void a() {
        if (this.e) {
            Iterator<eae> it = this.a.iterator();
            while (it.hasNext()) {
                it.next().c();
            }
            this.e = false;
        }
    }

    void b() {
        this.e = false;
    }

    public fae c(eae eaeVar) {
        if (!this.e) {
            this.a.add(eaeVar);
        }
        return this;
    }

    public fae d(eae eaeVar, eae eaeVar2) {
        this.a.add(eaeVar);
        eaeVar2.i(eaeVar.d());
        this.a.add(eaeVar2);
        return this;
    }

    public fae e(long j) {
        if (!this.e) {
            this.b = j;
        }
        return this;
    }

    public fae f(Interpolator interpolator) {
        if (!this.e) {
            this.c = interpolator;
        }
        return this;
    }

    public fae g(gae gaeVar) {
        if (!this.e) {
            this.d = gaeVar;
        }
        return this;
    }

    public void h() {
        if (this.e) {
            return;
        }
        for (eae eaeVar : this.a) {
            long j = this.b;
            if (j >= 0) {
                eaeVar.e(j);
            }
            Interpolator interpolator = this.c;
            if (interpolator != null) {
                eaeVar.f(interpolator);
            }
            if (this.d != null) {
                eaeVar.g(this.f);
            }
            eaeVar.k();
        }
        this.e = true;
    }
}
