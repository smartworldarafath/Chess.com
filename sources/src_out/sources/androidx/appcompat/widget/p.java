package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.google.inputmethod.d1a;
import com.google.inputmethod.k7e;
import com.google.inputmethod.sp5;
import com.google.inputmethod.uv;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public class p {
    private final ImageView a;
    private i0 b;
    private i0 c;
    private i0 d;
    private int e = 0;

    public p(ImageView imageView) {
        this.a = imageView;
    }

    private boolean a(Drawable drawable) {
        if (this.d == null) {
            this.d = new i0();
        }
        i0 i0Var = this.d;
        i0Var.a();
        ColorStateList colorStateListA = sp5.a(this.a);
        if (colorStateListA != null) {
            i0Var.d = true;
            i0Var.a = colorStateListA;
        }
        PorterDuff.Mode modeB = sp5.b(this.a);
        if (modeB != null) {
            i0Var.c = true;
            i0Var.b = modeB;
        }
        if (!i0Var.d && !i0Var.c) {
            return false;
        }
        j.i(drawable, i0Var, this.a.getDrawableState());
        return true;
    }

    private boolean l() {
        return this.b != null;
    }

    void b() {
        if (this.a.getDrawable() != null) {
            this.a.getDrawable().setLevel(this.e);
        }
    }

    void c() {
        Drawable drawable = this.a.getDrawable();
        if (drawable != null) {
            z.b(drawable);
        }
        if (drawable != null) {
            if (l() && a(drawable)) {
                return;
            }
            i0 i0Var = this.c;
            if (i0Var != null) {
                j.i(drawable, i0Var, this.a.getDrawableState());
                return;
            }
            i0 i0Var2 = this.b;
            if (i0Var2 != null) {
                j.i(drawable, i0Var2, this.a.getDrawableState());
            }
        }
    }

    ColorStateList d() {
        i0 i0Var = this.c;
        if (i0Var != null) {
            return i0Var.a;
        }
        return null;
    }

    PorterDuff.Mode e() {
        i0 i0Var = this.c;
        if (i0Var != null) {
            return i0Var.b;
        }
        return null;
    }

    boolean f() {
        return !(this.a.getBackground() instanceof RippleDrawable);
    }

    public void g(AttributeSet attributeSet, int i) {
        int iN;
        k0 k0VarV = k0.v(this.a.getContext(), attributeSet, d1a.P, i, 0);
        ImageView imageView = this.a;
        k7e.j0(imageView, imageView.getContext(), d1a.P, attributeSet, k0VarV.r(), i, 0);
        try {
            Drawable drawable = this.a.getDrawable();
            if (drawable == null && (iN = k0VarV.n(d1a.Q, -1)) != -1 && (drawable = uv.b(this.a.getContext(), iN)) != null) {
                this.a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                z.b(drawable);
            }
            if (k0VarV.s(d1a.R)) {
                sp5.c(this.a, k0VarV.c(d1a.R));
            }
            if (k0VarV.s(d1a.S)) {
                sp5.d(this.a, z.e(k0VarV.k(d1a.S, -1), null));
            }
        } finally {
            k0VarV.x();
        }
    }

    void h(Drawable drawable) {
        this.e = drawable.getLevel();
    }

    public void i(int i) {
        if (i != 0) {
            Drawable drawableB = uv.b(this.a.getContext(), i);
            if (drawableB != null) {
                z.b(drawableB);
            }
            this.a.setImageDrawable(drawableB);
        } else {
            this.a.setImageDrawable(null);
        }
        c();
    }

    void j(ColorStateList colorStateList) {
        if (this.c == null) {
            this.c = new i0();
        }
        i0 i0Var = this.c;
        i0Var.a = colorStateList;
        i0Var.d = true;
        c();
    }

    void k(PorterDuff.Mode mode) {
        if (this.c == null) {
            this.c = new i0();
        }
        i0 i0Var = this.c;
        i0Var.b = mode;
        i0Var.c = true;
        c();
    }
}
