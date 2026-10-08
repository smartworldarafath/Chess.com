package com.google.inputmethod;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public abstract class lr9 {
    private static final Interpolator l = new PathInterpolator(0.0f, 0.0f, 0.0f, 1.0f);
    private static final Interpolator m = new PathInterpolator(0.6f, 0.0f, 1.0f, 1.0f);
    private static final Interpolator n = new PathInterpolator(0.0f, 0.0f, 0.2f, 1.0f);
    private static final Interpolator o = new PathInterpolator(0.4f, 0.0f, 1.0f, 1.0f);
    private final int a;
    private final a b = new a();
    private uy5 c;
    private uy5 d;
    private float e;
    private float f;
    private float g;
    private float h;
    private Object i;
    private ValueAnimator j;
    private ValueAnimator k;

    static class a {
        private int a = -1;
        private int b = -1;
        private uy5 c = uy5.e;
        private boolean d = false;
        private Drawable e = null;
        private float f = 0.0f;
        private float g = 0.0f;
        private float h = 1.0f;
        private InterfaceC0114a i;

        /* JADX INFO: renamed from: com.google.android.lr9$a$a, reason: collision with other inner class name */
        interface InterfaceC0114a {
            default void a(Drawable drawable) {
            }

            default void b(int i) {
            }

            default void c(float f) {
            }

            default void d(int i) {
            }

            default void e(float f) {
            }

            default void f(float f) {
            }

            default void g(uy5 uy5Var) {
            }

            default void onVisibilityChanged(boolean z) {
            }
        }

        a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void A(int i) {
            if (this.a != i) {
                this.a = i;
                InterfaceC0114a interfaceC0114a = this.i;
                if (interfaceC0114a != null) {
                    interfaceC0114a.d(i);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void s(float f) {
            if (this.h != f) {
                this.h = f;
                InterfaceC0114a interfaceC0114a = this.i;
                if (interfaceC0114a != null) {
                    interfaceC0114a.c(f);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void u(Drawable drawable) {
            this.e = drawable;
            InterfaceC0114a interfaceC0114a = this.i;
            if (interfaceC0114a != null) {
                interfaceC0114a.a(drawable);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void v(int i) {
            if (this.b != i) {
                this.b = i;
                InterfaceC0114a interfaceC0114a = this.i;
                if (interfaceC0114a != null) {
                    interfaceC0114a.b(i);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void w(uy5 uy5Var) {
            if (this.c.equals(uy5Var)) {
                return;
            }
            this.c = uy5Var;
            InterfaceC0114a interfaceC0114a = this.i;
            if (interfaceC0114a != null) {
                interfaceC0114a.g(uy5Var);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void x(float f) {
            if (this.f != f) {
                this.f = f;
                InterfaceC0114a interfaceC0114a = this.i;
                if (interfaceC0114a != null) {
                    interfaceC0114a.e(f);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void y(float f) {
            if (this.g != f) {
                this.g = f;
                InterfaceC0114a interfaceC0114a = this.i;
                if (interfaceC0114a != null) {
                    interfaceC0114a.f(f);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void z(boolean z) {
            if (this.d != z) {
                this.d = z;
                InterfaceC0114a interfaceC0114a = this.i;
                if (interfaceC0114a != null) {
                    interfaceC0114a.onVisibilityChanged(z);
                }
            }
        }

        float k() {
            return this.h;
        }

        Drawable l() {
            return this.e;
        }

        int m() {
            return this.b;
        }

        uy5 n() {
            return this.c;
        }

        float o() {
            return this.f;
        }

        float p() {
            return this.g;
        }

        int q() {
            return this.a;
        }

        boolean r() {
            return this.d;
        }

        void t(InterfaceC0114a interfaceC0114a) {
            if (this.i != null && interfaceC0114a != null) {
                throw new IllegalStateException("Trying to overwrite the existing callback. Did you send one protection to multiple ProtectionLayouts?");
            }
            this.i = interfaceC0114a;
        }
    }

    public lr9(int i) {
        uy5 uy5Var = uy5.e;
        this.c = uy5Var;
        this.d = uy5Var;
        this.e = 1.0f;
        this.f = 1.0f;
        this.g = 1.0f;
        this.h = 1.0f;
        this.i = null;
        this.j = null;
        this.k = null;
        if (i == 1 || i == 2 || i == 4 || i == 8) {
            this.a = i;
            return;
        }
        throw new IllegalArgumentException("Unexpected side: " + i);
    }

    private void m() {
        this.b.s(this.e * this.f);
    }

    private void n() {
        float f = this.h * this.g;
        int i = this.a;
        if (i == 1) {
            a aVar = this.b;
            aVar.x((-(1.0f - f)) * aVar.a);
            return;
        }
        if (i == 2) {
            a aVar2 = this.b;
            aVar2.y((-(1.0f - f)) * aVar2.b);
        } else if (i == 4) {
            a aVar3 = this.b;
            aVar3.x((1.0f - f) * aVar3.a);
        } else {
            if (i != 8) {
                return;
            }
            a aVar4 = this.b;
            aVar4.y((1.0f - f) * aVar4.b);
        }
    }

    void a(int i) {
    }

    uy5 b(uy5 uy5Var, uy5 uy5Var2, uy5 uy5Var3) {
        this.c = uy5Var;
        this.d = uy5Var2;
        this.b.w(uy5Var3);
        return o();
    }

    a c() {
        return this.b;
    }

    Object d() {
        return this.i;
    }

    public int e() {
        return this.a;
    }

    int f(int i) {
        return i;
    }

    boolean g() {
        return false;
    }

    void h(Object obj) {
        this.i = obj;
    }

    void i(Drawable drawable) {
        this.b.u(drawable);
    }

    void j(float f) {
        this.e = f;
        m();
    }

    void k(float f) {
        this.g = f;
        n();
    }

    void l(boolean z) {
        this.b.z(z);
    }

    uy5 o() {
        int i;
        uy5 uy5VarD = uy5.e;
        int i2 = this.a;
        if (i2 == 1) {
            i = this.c.a;
            this.b.A(f(this.d.a));
            if (g()) {
                uy5VarD = uy5.d(f(i), 0, 0, 0);
            }
        } else if (i2 == 2) {
            i = this.c.b;
            this.b.v(f(this.d.b));
            if (g()) {
                uy5VarD = uy5.d(0, f(i), 0, 0);
            }
        } else if (i2 == 4) {
            i = this.c.c;
            this.b.A(f(this.d.c));
            if (g()) {
                uy5VarD = uy5.d(0, 0, f(i), 0);
            }
        } else if (i2 != 8) {
            i = 0;
        } else {
            i = this.c.d;
            this.b.v(f(this.d.d));
            if (g()) {
                uy5VarD = uy5.d(0, 0, 0, f(i));
            }
        }
        l(i > 0);
        j(i > 0 ? 1.0f : 0.0f);
        k(i > 0 ? 1.0f : 0.0f);
        return uy5VarD;
    }
}
