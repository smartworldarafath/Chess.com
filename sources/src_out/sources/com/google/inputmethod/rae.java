package com.google.inputmethod;

import android.os.Bundle;
import android.view.ViewStructure;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public class rae {
    private final Object a;

    private static class a {
        static Bundle a(ViewStructure viewStructure) {
            return viewStructure.getExtras();
        }

        static void b(ViewStructure viewStructure, String str) {
            viewStructure.setClassName(str);
        }

        static void c(ViewStructure viewStructure, CharSequence charSequence) {
            viewStructure.setContentDescription(charSequence);
        }

        static void d(ViewStructure viewStructure, int i, int i2, int i3, int i4, int i5, int i6) {
            viewStructure.setDimens(i, i2, i3, i4, i5, i6);
        }

        static void e(ViewStructure viewStructure, int i, String str, String str2, String str3) {
            viewStructure.setId(i, str, str2, str3);
        }

        static void f(ViewStructure viewStructure, CharSequence charSequence) {
            viewStructure.setText(charSequence);
        }

        static void g(ViewStructure viewStructure, float f, int i, int i2, int i3) {
            viewStructure.setTextStyle(f, i, i2, i3);
        }
    }

    private rae(ViewStructure viewStructure) {
        this.a = viewStructure;
    }

    public static rae i(ViewStructure viewStructure) {
        return new rae(viewStructure);
    }

    public Bundle a() {
        return a.a((ViewStructure) this.a);
    }

    public void b(String str) {
        a.b((ViewStructure) this.a, str);
    }

    public void c(CharSequence charSequence) {
        a.c((ViewStructure) this.a, charSequence);
    }

    public void d(int i, int i2, int i3, int i4, int i5, int i6) {
        a.d((ViewStructure) this.a, i, i2, i3, i4, i5, i6);
    }

    public void e(int i, String str, String str2, String str3) {
        a.e((ViewStructure) this.a, i, str, str2, str3);
    }

    public void f(CharSequence charSequence) {
        a.f((ViewStructure) this.a, charSequence);
    }

    public void g(float f, int i, int i2, int i3) {
        a.g((ViewStructure) this.a, f, i, i2, i3);
    }

    public ViewStructure h() {
        return (ViewStructure) this.a;
    }
}
