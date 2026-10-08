package com.google.inputmethod;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public final class kje {
    private final g a;

    private static class a extends g {
        protected final Window a;
        private final jyb b;

        a(Window window, jyb jybVar) {
            this.a = window;
            this.b = jybVar;
        }

        private void g(int i) {
            if (i == 1) {
                h(4);
            } else if (i == 2) {
                h(2);
            } else {
                if (i != 8) {
                    return;
                }
                this.b.a();
            }
        }

        private void j(int i) {
            if (i == 1) {
                k(4);
                l(1024);
            } else if (i == 2) {
                k(2);
            } else {
                if (i != 8) {
                    return;
                }
                this.b.b();
            }
        }

        @Override // com.google.android.kje.g
        void a(int i) {
            for (int i2 = 1; i2 <= 512; i2 <<= 1) {
                if ((i & i2) != 0) {
                    g(i2);
                }
            }
        }

        @Override // com.google.android.kje.g
        void e(int i) {
            this.a.getDecorView().setTag(356039078, Integer.valueOf(i));
            if (i == 0) {
                k(6144);
                return;
            }
            if (i == 1) {
                k(4096);
                h(2048);
            } else {
                if (i != 2) {
                    return;
                }
                k(2048);
                h(4096);
            }
        }

        @Override // com.google.android.kje.g
        void f(int i) {
            for (int i2 = 1; i2 <= 512; i2 <<= 1) {
                if ((i & i2) != 0) {
                    j(i2);
                }
            }
        }

        protected void h(int i) {
            View decorView = this.a.getDecorView();
            decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
        }

        protected void i(int i) {
            this.a.addFlags(i);
        }

        protected void k(int i) {
            View decorView = this.a.getDecorView();
            decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
        }

        protected void l(int i) {
            this.a.clearFlags(i);
        }
    }

    private static class b extends a {
        b(Window window, jyb jybVar) {
            super(window, jybVar);
        }

        @Override // com.google.android.kje.g
        public boolean b() {
            return (this.a.getDecorView().getSystemUiVisibility() & 8192) != 0;
        }

        @Override // com.google.android.kje.g
        public void d(boolean z) {
            if (!z) {
                k(8192);
                return;
            }
            l(67108864);
            i(t04.INVALID_ID);
            h(8192);
        }
    }

    private static class c extends b {
        c(Window window, jyb jybVar) {
            super(window, jybVar);
        }

        @Override // com.google.android.kje.g
        public void c(boolean z) {
            if (!z) {
                k(16);
                return;
            }
            l(134217728);
            i(t04.INVALID_ID);
            h(16);
        }
    }

    private static class e extends d {
        e(Window window, kje kjeVar, jyb jybVar) {
            super(window, kjeVar, jybVar);
        }

        @Override // com.google.android.kje.d, com.google.android.kje.g
        void e(int i) {
            this.b.setSystemBarsBehavior(i);
        }

        e(WindowInsetsController windowInsetsController, kje kjeVar, jyb jybVar) {
            super(windowInsetsController, kjeVar, jybVar);
        }
    }

    private static class f extends e {
        f(Window window, kje kjeVar, jyb jybVar) {
            super(window, kjeVar, jybVar);
        }

        @Override // com.google.android.kje.d, com.google.android.kje.g
        public boolean b() {
            return (this.b.getSystemBarsAppearance() & 8) != 0;
        }

        @Override // com.google.android.kje.d, com.google.android.kje.g
        public void c(boolean z) {
            this.b.setSystemBarsAppearance(z ? 16 : 0, 16);
        }

        @Override // com.google.android.kje.d, com.google.android.kje.g
        public void d(boolean z) {
            this.b.setSystemBarsAppearance(z ? 8 : 0, 8);
        }

        f(WindowInsetsController windowInsetsController, kje kjeVar, jyb jybVar) {
            super(windowInsetsController, kjeVar, jybVar);
        }
    }

    private static class g {
        g() {
        }

        void a(int i) {
            throw null;
        }

        public boolean b() {
            throw null;
        }

        public void c(boolean z) {
            throw null;
        }

        public void d(boolean z) {
            throw null;
        }

        void e(int i) {
            throw null;
        }

        void f(int i) {
            throw null;
        }
    }

    @Deprecated
    private kje(WindowInsetsController windowInsetsController) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.a = new f(windowInsetsController, this, new jyb(windowInsetsController));
        } else {
            this.a = new d(windowInsetsController, this, new jyb(windowInsetsController));
        }
    }

    @Deprecated
    public static kje g(WindowInsetsController windowInsetsController) {
        return new kje(windowInsetsController);
    }

    public void a(int i) {
        this.a.a(i);
    }

    public boolean b() {
        return this.a.b();
    }

    public void c(boolean z) {
        this.a.c(z);
    }

    public void d(boolean z) {
        this.a.d(z);
    }

    public void e(int i) {
        this.a.e(i);
    }

    public void f(int i) {
        this.a.f(i);
    }

    private static class d extends g {
        final kje a;
        final WindowInsetsController b;
        final jyb c;
        private final qpb<Object, WindowInsetsController.OnControllableInsetsChangedListener> d;
        protected Window e;

        d(Window window, kje kjeVar, jyb jybVar) {
            this(window.getInsetsController(), kjeVar, jybVar);
            this.e = window;
        }

        private boolean g(int i, int i2) {
            Window window = this.e;
            if (window != null) {
                return (i & window.getDecorView().getSystemUiVisibility()) != 0;
            }
            this.b.setSystemBarsAppearance(0, 0);
            return (this.b.getSystemBarsAppearance() & i2) != 0;
        }

        private void h(boolean z, int i, int i2) {
            if (this.e != null) {
                if (z) {
                    i(i);
                    return;
                } else {
                    j(i);
                    return;
                }
            }
            if (z) {
                this.b.setSystemBarsAppearance(i2, i2);
            } else {
                this.b.setSystemBarsAppearance(0, i2);
            }
        }

        @Override // com.google.android.kje.g
        void a(int i) {
            if ((i & 8) != 0) {
                this.c.a();
            }
            this.b.hide(i & (-9));
        }

        @Override // com.google.android.kje.g
        public boolean b() {
            return g(8192, 8);
        }

        @Override // com.google.android.kje.g
        public void c(boolean z) {
            h(z, 16, 16);
        }

        @Override // com.google.android.kje.g
        public void d(boolean z) {
            h(z, 8192, 8);
        }

        @Override // com.google.android.kje.g
        void e(int i) {
            Window window = this.e;
            if (window == null) {
                this.b.setSystemBarsBehavior(i);
                return;
            }
            window.getDecorView().setTag(356039078, Integer.valueOf(i));
            if (i == 0) {
                j(6144);
                return;
            }
            if (i == 1) {
                j(4096);
                i(2048);
            } else {
                if (i != 2) {
                    return;
                }
                j(2048);
                i(4096);
            }
        }

        @Override // com.google.android.kje.g
        void f(int i) {
            if ((i & 8) != 0) {
                this.c.b();
            }
            this.b.show(i & (-9));
        }

        protected void i(int i) {
            View decorView = this.e.getDecorView();
            decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
        }

        protected void j(int i) {
            View decorView = this.e.getDecorView();
            decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
        }

        d(WindowInsetsController windowInsetsController, kje kjeVar, jyb jybVar) {
            this.d = new qpb<>();
            this.b = windowInsetsController;
            this.a = kjeVar;
            this.c = jybVar;
        }
    }

    public kje(Window window, View view) {
        jyb jybVar = new jyb(view);
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            this.a = new f(window, this, jybVar);
        } else if (i >= 30) {
            this.a = new d(window, this, jybVar);
        } else {
            this.a = new c(window, jybVar);
        }
    }
}
