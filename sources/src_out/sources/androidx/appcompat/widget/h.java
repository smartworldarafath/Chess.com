package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CheckedTextView;
import com.google.inputmethod.d1a;
import com.google.inputmethod.hh3;
import com.google.inputmethod.k7e;
import com.google.inputmethod.pa1;
import com.google.inputmethod.uv;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
class h {
    private final CheckedTextView a;
    private ColorStateList b = null;
    private PorterDuff.Mode c = null;
    private boolean d = false;
    private boolean e = false;
    private boolean f;

    h(CheckedTextView checkedTextView) {
        this.a = checkedTextView;
    }

    void a() {
        Drawable drawableA = pa1.a(this.a);
        if (drawableA != null) {
            if (this.d || this.e) {
                Drawable drawableMutate = hh3.r(drawableA).mutate();
                if (this.d) {
                    hh3.o(drawableMutate, this.b);
                }
                if (this.e) {
                    hh3.p(drawableMutate, this.c);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(this.a.getDrawableState());
                }
                this.a.setCheckMarkDrawable(drawableMutate);
            }
        }
    }

    ColorStateList b() {
        return this.b;
    }

    PorterDuff.Mode c() {
        return this.c;
    }

    void d(AttributeSet attributeSet, int i) {
        int iN;
        int iN2;
        k0 k0VarV = k0.v(this.a.getContext(), attributeSet, d1a.P0, i, 0);
        CheckedTextView checkedTextView = this.a;
        k7e.j0(checkedTextView, checkedTextView.getContext(), d1a.P0, attributeSet, k0VarV.r(), i, 0);
        try {
            if (k0VarV.s(d1a.R0) && (iN2 = k0VarV.n(d1a.R0, 0)) != 0) {
                try {
                    CheckedTextView checkedTextView2 = this.a;
                    checkedTextView2.setCheckMarkDrawable(uv.b(checkedTextView2.getContext(), iN2));
                } catch (Resources.NotFoundException unused) {
                    if (k0VarV.s(d1a.Q0)) {
                        CheckedTextView checkedTextView3 = this.a;
                        checkedTextView3.setCheckMarkDrawable(uv.b(checkedTextView3.getContext(), iN));
                    }
                }
            } else if (k0VarV.s(d1a.Q0) && (iN = k0VarV.n(d1a.Q0, 0)) != 0) {
                CheckedTextView checkedTextView4 = this.a;
                checkedTextView4.setCheckMarkDrawable(uv.b(checkedTextView4.getContext(), iN));
            }
            if (k0VarV.s(d1a.S0)) {
                pa1.b(this.a, k0VarV.c(d1a.S0));
            }
            if (k0VarV.s(d1a.T0)) {
                pa1.c(this.a, z.e(k0VarV.k(d1a.T0, -1), null));
            }
        } finally {
            k0VarV.x();
        }
    }

    void e() {
        if (this.f) {
            this.f = false;
        } else {
            this.f = true;
            a();
        }
    }

    void f(ColorStateList colorStateList) {
        this.b = colorStateList;
        this.d = true;
        a();
    }

    void g(PorterDuff.Mode mode) {
        this.c = mode;
        this.e = true;
        a();
    }
}
