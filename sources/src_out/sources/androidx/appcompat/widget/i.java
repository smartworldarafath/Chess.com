package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import com.google.inputmethod.d1a;
import com.google.inputmethod.hh3;
import com.google.inputmethod.k7e;
import com.google.inputmethod.os1;
import com.google.inputmethod.uv;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
class i {
    private final CompoundButton a;
    private ColorStateList b = null;
    private PorterDuff.Mode c = null;
    private boolean d = false;
    private boolean e = false;
    private boolean f;

    i(CompoundButton compoundButton) {
        this.a = compoundButton;
    }

    void a() {
        Drawable drawableA = os1.a(this.a);
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
                this.a.setButtonDrawable(drawableMutate);
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
        k0 k0VarV = k0.v(this.a.getContext(), attributeSet, d1a.U0, i, 0);
        CompoundButton compoundButton = this.a;
        k7e.j0(compoundButton, compoundButton.getContext(), d1a.U0, attributeSet, k0VarV.r(), i, 0);
        try {
            if (k0VarV.s(d1a.W0) && (iN2 = k0VarV.n(d1a.W0, 0)) != 0) {
                try {
                    CompoundButton compoundButton2 = this.a;
                    compoundButton2.setButtonDrawable(uv.b(compoundButton2.getContext(), iN2));
                } catch (Resources.NotFoundException unused) {
                    if (k0VarV.s(d1a.V0)) {
                        CompoundButton compoundButton3 = this.a;
                        compoundButton3.setButtonDrawable(uv.b(compoundButton3.getContext(), iN));
                    }
                }
            } else if (k0VarV.s(d1a.V0) && (iN = k0VarV.n(d1a.V0, 0)) != 0) {
                CompoundButton compoundButton4 = this.a;
                compoundButton4.setButtonDrawable(uv.b(compoundButton4.getContext(), iN));
            }
            if (k0VarV.s(d1a.X0)) {
                os1.d(this.a, k0VarV.c(d1a.X0));
            }
            if (k0VarV.s(d1a.Y0)) {
                os1.e(this.a, z.e(k0VarV.k(d1a.Y0, -1), null));
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
