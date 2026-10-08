package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import com.google.inputmethod.d1a;
import com.google.inputmethod.g0d;
import com.google.inputmethod.jnd;
import com.google.inputmethod.k7e;
import com.google.inputmethod.mla;
import com.google.inputmethod.sn3;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
class w {
    private final TextView a;
    private i0 b;
    private i0 c;
    private i0 d;
    private i0 e;
    private i0 f;
    private i0 g;
    private i0 h;
    private final x i;
    private int j = 0;
    private int k = -1;
    private Typeface l;
    private boolean m;

    class a extends mla.c {
        final /* synthetic */ int a;
        final /* synthetic */ int b;
        final /* synthetic */ WeakReference c;

        a(int i, int i2, WeakReference weakReference) {
            this.a = i;
            this.b = i2;
            this.c = weakReference;
        }

        @Override // com.google.android.mla.c
        public void f(int i) {
        }

        @Override // com.google.android.mla.c
        public void g(Typeface typeface) {
            int i = this.a;
            if (i != -1) {
                typeface = e.a(typeface, i, (this.b & 2) != 0);
            }
            w.this.n(this.c, typeface);
        }
    }

    class b implements Runnable {
        final /* synthetic */ TextView a;
        final /* synthetic */ Typeface b;
        final /* synthetic */ int c;

        b(TextView textView, Typeface typeface, int i) {
            this.a = textView;
            this.b = typeface;
            this.c = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.setTypeface(this.b, this.c);
        }
    }

    static class c {
        static LocaleList a(String str) {
            return LocaleList.forLanguageTags(str);
        }

        static void b(TextView textView, LocaleList localeList) {
            textView.setTextLocales(localeList);
        }
    }

    static class d {
        static int a(TextView textView) {
            return textView.getAutoSizeStepGranularity();
        }

        static void b(TextView textView, int i, int i2, int i3, int i4) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
        }

        static void c(TextView textView, int[] iArr, int i) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
        }

        static boolean d(TextView textView, String str) {
            return textView.setFontVariationSettings(str);
        }
    }

    static class e {
        static Typeface a(Typeface typeface, int i, boolean z) {
            return Typeface.create(typeface, i, z);
        }
    }

    w(TextView textView) {
        this.a = textView;
        this.i = new x(textView);
    }

    private void B(int i, float f) {
        this.i.t(i, f);
    }

    private void C(Context context, k0 k0Var) {
        String strO;
        this.j = k0Var.k(d1a.V2, this.j);
        int iK = k0Var.k(d1a.e3, -1);
        this.k = iK;
        if (iK != -1) {
            this.j &= 2;
        }
        if (!k0Var.s(d1a.d3) && !k0Var.s(d1a.f3)) {
            if (k0Var.s(d1a.U2)) {
                this.m = false;
                int iK2 = k0Var.k(d1a.U2, 1);
                if (iK2 == 1) {
                    this.l = Typeface.SANS_SERIF;
                    return;
                } else if (iK2 == 2) {
                    this.l = Typeface.SERIF;
                    return;
                } else {
                    if (iK2 != 3) {
                        return;
                    }
                    this.l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.l = null;
        int i = k0Var.s(d1a.f3) ? d1a.f3 : d1a.d3;
        int i2 = this.k;
        int i3 = this.j;
        if (!context.isRestricted()) {
            try {
                Typeface typefaceJ = k0Var.j(i, this.j, new a(i2, i3, new WeakReference(this.a)));
                if (typefaceJ != null) {
                    if (this.k != -1) {
                        this.l = e.a(Typeface.create(typefaceJ, 0), this.k, (this.j & 2) != 0);
                    } else {
                        this.l = typefaceJ;
                    }
                }
                this.m = this.l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.l != null || (strO = k0Var.o(i)) == null) {
            return;
        }
        if (this.k != -1) {
            this.l = e.a(Typeface.create(strO, 0), this.k, (this.j & 2) != 0);
        } else {
            this.l = Typeface.create(strO, this.j);
        }
    }

    private void a(Drawable drawable, i0 i0Var) {
        if (drawable == null || i0Var == null) {
            return;
        }
        j.i(drawable, i0Var, this.a.getDrawableState());
    }

    private static i0 d(Context context, j jVar, int i) {
        ColorStateList colorStateListF = jVar.f(context, i);
        if (colorStateListF == null) {
            return null;
        }
        i0 i0Var = new i0();
        i0Var.d = true;
        i0Var.a = colorStateListF;
        return i0Var;
    }

    private void y(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6) {
        if (drawable5 != null || drawable6 != null) {
            Drawable[] compoundDrawablesRelative = this.a.getCompoundDrawablesRelative();
            if (drawable5 == null) {
                drawable5 = compoundDrawablesRelative[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative[1];
            }
            if (drawable6 == null) {
                drawable6 = compoundDrawablesRelative[2];
            }
            TextView textView = this.a;
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable5, drawable2, drawable6, drawable4);
            return;
        }
        if (drawable == null && drawable2 == null && drawable3 == null && drawable4 == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative2 = this.a.getCompoundDrawablesRelative();
        Drawable drawable7 = compoundDrawablesRelative2[0];
        if (drawable7 != null || compoundDrawablesRelative2[2] != null) {
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative2[1];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative2[3];
            }
            this.a.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable7, drawable2, compoundDrawablesRelative2[2], drawable4);
            return;
        }
        Drawable[] compoundDrawables = this.a.getCompoundDrawables();
        TextView textView2 = this.a;
        if (drawable == null) {
            drawable = compoundDrawables[0];
        }
        if (drawable2 == null) {
            drawable2 = compoundDrawables[1];
        }
        if (drawable3 == null) {
            drawable3 = compoundDrawables[2];
        }
        if (drawable4 == null) {
            drawable4 = compoundDrawables[3];
        }
        textView2.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    private void z() {
        i0 i0Var = this.h;
        this.b = i0Var;
        this.c = i0Var;
        this.d = i0Var;
        this.e = i0Var;
        this.f = i0Var;
        this.g = i0Var;
    }

    void A(int i, float f) {
        if (n0.c || l()) {
            return;
        }
        B(i, f);
    }

    void b() {
        if (this.b != null || this.c != null || this.d != null || this.e != null) {
            Drawable[] compoundDrawables = this.a.getCompoundDrawables();
            a(compoundDrawables[0], this.b);
            a(compoundDrawables[1], this.c);
            a(compoundDrawables[2], this.d);
            a(compoundDrawables[3], this.e);
        }
        if (this.f == null && this.g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = this.a.getCompoundDrawablesRelative();
        a(compoundDrawablesRelative[0], this.f);
        a(compoundDrawablesRelative[2], this.g);
    }

    void c() {
        this.i.a();
    }

    int e() {
        return this.i.f();
    }

    int f() {
        return this.i.g();
    }

    int g() {
        return this.i.h();
    }

    int[] h() {
        return this.i.i();
    }

    int i() {
        return this.i.j();
    }

    ColorStateList j() {
        i0 i0Var = this.h;
        if (i0Var != null) {
            return i0Var.a;
        }
        return null;
    }

    PorterDuff.Mode k() {
        i0 i0Var = this.h;
        if (i0Var != null) {
            return i0Var.b;
        }
        return null;
    }

    boolean l() {
        return this.i.n();
    }

    void m(AttributeSet attributeSet, int i) {
        boolean zA;
        boolean z;
        String strO;
        String strO2;
        int iA;
        float f;
        Context context = this.a.getContext();
        j jVarB = j.b();
        k0 k0VarV = k0.v(context, attributeSet, d1a.Y, i, 0);
        TextView textView = this.a;
        k7e.j0(textView, textView.getContext(), d1a.Y, attributeSet, k0VarV.r(), i, 0);
        int iN = k0VarV.n(d1a.Z, -1);
        if (k0VarV.s(d1a.c0)) {
            this.b = d(context, jVarB, k0VarV.n(d1a.c0, 0));
        }
        if (k0VarV.s(d1a.a0)) {
            this.c = d(context, jVarB, k0VarV.n(d1a.a0, 0));
        }
        if (k0VarV.s(d1a.d0)) {
            this.d = d(context, jVarB, k0VarV.n(d1a.d0, 0));
        }
        if (k0VarV.s(d1a.b0)) {
            this.e = d(context, jVarB, k0VarV.n(d1a.b0, 0));
        }
        if (k0VarV.s(d1a.e0)) {
            this.f = d(context, jVarB, k0VarV.n(d1a.e0, 0));
        }
        if (k0VarV.s(d1a.f0)) {
            this.g = d(context, jVarB, k0VarV.n(d1a.f0, 0));
        }
        k0VarV.x();
        boolean z2 = this.a.getTransformationMethod() instanceof PasswordTransformationMethod;
        boolean z3 = true;
        if (iN != -1) {
            k0 k0VarT = k0.t(context, iN, d1a.S2);
            if (z2 || !k0VarT.s(d1a.h3)) {
                zA = false;
                z = false;
            } else {
                zA = k0VarT.a(d1a.h3, false);
                z = true;
            }
            C(context, k0VarT);
            strO = k0VarT.s(d1a.i3) ? k0VarT.o(d1a.i3) : null;
            strO2 = k0VarT.s(d1a.g3) ? k0VarT.o(d1a.g3) : null;
            k0VarT.x();
        } else {
            zA = false;
            z = false;
            strO = null;
            strO2 = null;
        }
        k0 k0VarV2 = k0.v(context, attributeSet, d1a.S2, i, 0);
        if (z2 || !k0VarV2.s(d1a.h3)) {
            z3 = z;
        } else {
            zA = k0VarV2.a(d1a.h3, false);
        }
        if (k0VarV2.s(d1a.i3)) {
            strO = k0VarV2.o(d1a.i3);
        }
        if (k0VarV2.s(d1a.g3)) {
            strO2 = k0VarV2.o(d1a.g3);
        }
        if (k0VarV2.s(d1a.T2) && k0VarV2.f(d1a.T2, -1) == 0) {
            this.a.setTextSize(0, 0.0f);
        }
        C(context, k0VarV2);
        k0VarV2.x();
        if (!z2 && z3) {
            s(zA);
        }
        Typeface typeface = this.l;
        if (typeface != null) {
            if (this.k == -1) {
                this.a.setTypeface(typeface, this.j);
            } else {
                this.a.setTypeface(typeface);
            }
        }
        if (strO2 != null) {
            d.d(this.a, strO2);
        }
        if (strO != null) {
            c.b(this.a, c.a(strO));
        }
        this.i.o(attributeSet, i);
        if (n0.c && this.i.j() != 0) {
            int[] iArrI = this.i.i();
            if (iArrI.length > 0) {
                if (d.a(this.a) != -1.0f) {
                    d.b(this.a, this.i.g(), this.i.f(), this.i.h(), 0);
                } else {
                    d.c(this.a, iArrI, 0);
                }
            }
        }
        k0 k0VarU = k0.u(context, attributeSet, d1a.g0);
        int iN2 = k0VarU.n(d1a.o0, -1);
        Drawable drawableC = iN2 != -1 ? jVarB.c(context, iN2) : null;
        int iN3 = k0VarU.n(d1a.t0, -1);
        Drawable drawableC2 = iN3 != -1 ? jVarB.c(context, iN3) : null;
        int iN4 = k0VarU.n(d1a.p0, -1);
        Drawable drawableC3 = iN4 != -1 ? jVarB.c(context, iN4) : null;
        int iN5 = k0VarU.n(d1a.m0, -1);
        Drawable drawableC4 = iN5 != -1 ? jVarB.c(context, iN5) : null;
        int iN6 = k0VarU.n(d1a.q0, -1);
        Drawable drawableC5 = iN6 != -1 ? jVarB.c(context, iN6) : null;
        int iN7 = k0VarU.n(d1a.n0, -1);
        y(drawableC, drawableC2, drawableC3, drawableC4, drawableC5, iN7 != -1 ? jVarB.c(context, iN7) : null);
        if (k0VarU.s(d1a.r0)) {
            g0d.e(this.a, k0VarU.c(d1a.r0));
        }
        if (k0VarU.s(d1a.s0)) {
            g0d.f(this.a, z.e(k0VarU.k(d1a.s0, -1), null));
        }
        int iF = k0VarU.f(d1a.v0, -1);
        int iF2 = k0VarU.f(d1a.w0, -1);
        if (k0VarU.s(d1a.x0)) {
            TypedValue typedValueW = k0VarU.w(d1a.x0);
            if (typedValueW == null || typedValueW.type != 5) {
                f = k0VarU.f(d1a.x0, -1);
                iA = -1;
            } else {
                iA = jnd.a(typedValueW.data);
                f = TypedValue.complexToFloat(typedValueW.data);
            }
        } else {
            iA = -1;
            f = -1.0f;
        }
        k0VarU.x();
        if (iF != -1) {
            g0d.g(this.a, iF);
        }
        if (iF2 != -1) {
            g0d.h(this.a, iF2);
        }
        if (f != -1.0f) {
            if (iA == -1) {
                g0d.i(this.a, (int) f);
            } else {
                g0d.j(this.a, iA, f);
            }
        }
    }

    void n(WeakReference<TextView> weakReference, Typeface typeface) {
        if (this.m) {
            this.l = typeface;
            TextView textView = weakReference.get();
            if (textView != null) {
                if (textView.isAttachedToWindow()) {
                    textView.post(new b(textView, typeface, this.j));
                } else {
                    textView.setTypeface(typeface, this.j);
                }
            }
        }
    }

    void o(boolean z, int i, int i2, int i3, int i4) {
        if (n0.c) {
            return;
        }
        c();
    }

    void p() {
        b();
    }

    void q(Context context, int i) {
        String strO;
        k0 k0VarT = k0.t(context, i, d1a.S2);
        if (k0VarT.s(d1a.h3)) {
            s(k0VarT.a(d1a.h3, false));
        }
        if (k0VarT.s(d1a.T2) && k0VarT.f(d1a.T2, -1) == 0) {
            this.a.setTextSize(0, 0.0f);
        }
        C(context, k0VarT);
        if (k0VarT.s(d1a.g3) && (strO = k0VarT.o(d1a.g3)) != null) {
            d.d(this.a, strO);
        }
        k0VarT.x();
        Typeface typeface = this.l;
        if (typeface != null) {
            this.a.setTypeface(typeface, this.j);
        }
    }

    void r(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT >= 30 || inputConnection == null) {
            return;
        }
        sn3.e(editorInfo, textView.getText());
    }

    void s(boolean z) {
        this.a.setAllCaps(z);
    }

    void t(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        this.i.p(i, i2, i3, i4);
    }

    void u(int[] iArr, int i) throws IllegalArgumentException {
        this.i.q(iArr, i);
    }

    void v(int i) {
        this.i.r(i);
    }

    void w(ColorStateList colorStateList) {
        if (this.h == null) {
            this.h = new i0();
        }
        i0 i0Var = this.h;
        i0Var.a = colorStateList;
        i0Var.d = colorStateList != null;
        z();
    }

    void x(PorterDuff.Mode mode) {
        if (this.h == null) {
            this.h = new i0();
        }
        i0 i0Var = this.h;
        i0Var.b = mode;
        i0Var.c = mode != null;
        z();
    }
}
