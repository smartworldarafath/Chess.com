package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.google.inputmethod.d1a;
import com.google.inputmethod.k7e;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
class d {
    private final View a;
    private i0 d;
    private i0 e;
    private i0 f;
    private int c = -1;
    private final j b = j.b();

    d(View view) {
        this.a = view;
    }

    private boolean a(Drawable drawable) {
        if (this.f == null) {
            this.f = new i0();
        }
        i0 i0Var = this.f;
        i0Var.a();
        ColorStateList colorStateListQ = k7e.q(this.a);
        if (colorStateListQ != null) {
            i0Var.d = true;
            i0Var.a = colorStateListQ;
        }
        PorterDuff.Mode modeR = k7e.r(this.a);
        if (modeR != null) {
            i0Var.c = true;
            i0Var.b = modeR;
        }
        if (!i0Var.d && !i0Var.c) {
            return false;
        }
        j.i(drawable, i0Var, this.a.getDrawableState());
        return true;
    }

    private boolean k() {
        return this.d != null;
    }

    void b() {
        Drawable background = this.a.getBackground();
        if (background != null) {
            if (k() && a(background)) {
                return;
            }
            i0 i0Var = this.e;
            if (i0Var != null) {
                j.i(background, i0Var, this.a.getDrawableState());
                return;
            }
            i0 i0Var2 = this.d;
            if (i0Var2 != null) {
                j.i(background, i0Var2, this.a.getDrawableState());
            }
        }
    }

    ColorStateList c() {
        i0 i0Var = this.e;
        if (i0Var != null) {
            return i0Var.a;
        }
        return null;
    }

    PorterDuff.Mode d() {
        i0 i0Var = this.e;
        if (i0Var != null) {
            return i0Var.b;
        }
        return null;
    }

    void e(AttributeSet attributeSet, int i) {
        k0 k0VarV = k0.v(this.a.getContext(), attributeSet, d1a.Q3, i, 0);
        View view = this.a;
        k7e.j0(view, view.getContext(), d1a.Q3, attributeSet, k0VarV.r(), i, 0);
        try {
            if (k0VarV.s(d1a.R3)) {
                this.c = k0VarV.n(d1a.R3, -1);
                ColorStateList colorStateListF = this.b.f(this.a.getContext(), this.c);
                if (colorStateListF != null) {
                    h(colorStateListF);
                }
            }
            if (k0VarV.s(d1a.S3)) {
                k7e.q0(this.a, k0VarV.c(d1a.S3));
            }
            if (k0VarV.s(d1a.T3)) {
                k7e.r0(this.a, z.e(k0VarV.k(d1a.T3, -1), null));
            }
        } finally {
            k0VarV.x();
        }
    }

    void f(Drawable drawable) {
        this.c = -1;
        h(null);
        b();
    }

    void g(int i) {
        this.c = i;
        j jVar = this.b;
        h(jVar != null ? jVar.f(this.a.getContext(), i) : null);
        b();
    }

    void h(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.d == null) {
                this.d = new i0();
            }
            i0 i0Var = this.d;
            i0Var.a = colorStateList;
            i0Var.d = true;
        } else {
            this.d = null;
        }
        b();
    }

    void i(ColorStateList colorStateList) {
        if (this.e == null) {
            this.e = new i0();
        }
        i0 i0Var = this.e;
        i0Var.a = colorStateList;
        i0Var.d = true;
        b();
    }

    void j(PorterDuff.Mode mode) {
        if (this.e == null) {
            this.e = new i0();
        }
        i0 i0Var = this.e;
        i0Var.b = mode;
        i0Var.c = true;
        b();
    }
}
