package com.google.inputmethod;

import android.graphics.Insets;
import android.graphics.Rect;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public final class uy5 {
    public static final uy5 e = new uy5(0, 0, 0, 0);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    static class a {
        static Insets a(int i, int i2, int i3, int i4) {
            return Insets.of(i, i2, i3, i4);
        }
    }

    private uy5(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public static uy5 a(uy5 uy5Var, uy5 uy5Var2) {
        return d(uy5Var.a + uy5Var2.a, uy5Var.b + uy5Var2.b, uy5Var.c + uy5Var2.c, uy5Var.d + uy5Var2.d);
    }

    public static uy5 b(uy5 uy5Var, uy5 uy5Var2) {
        return d(Math.max(uy5Var.a, uy5Var2.a), Math.max(uy5Var.b, uy5Var2.b), Math.max(uy5Var.c, uy5Var2.c), Math.max(uy5Var.d, uy5Var2.d));
    }

    public static uy5 c(uy5 uy5Var, uy5 uy5Var2) {
        return d(Math.min(uy5Var.a, uy5Var2.a), Math.min(uy5Var.b, uy5Var2.b), Math.min(uy5Var.c, uy5Var2.c), Math.min(uy5Var.d, uy5Var2.d));
    }

    public static uy5 d(int i, int i2, int i3, int i4) {
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? e : new uy5(i, i2, i3, i4);
    }

    public static uy5 e(Rect rect) {
        return d(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static uy5 f(Insets insets) {
        return d(insets.left, insets.top, insets.right, insets.bottom);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || uy5.class != obj.getClass()) {
            return false;
        }
        uy5 uy5Var = (uy5) obj;
        return this.d == uy5Var.d && this.a == uy5Var.a && this.c == uy5Var.c && this.b == uy5Var.b;
    }

    public Insets g() {
        return a.a(this.a, this.b, this.c, this.d);
    }

    public int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public String toString() {
        return "Insets{left=" + this.a + ", top=" + this.b + ", right=" + this.c + ", bottom=" + this.d + '}';
    }
}
