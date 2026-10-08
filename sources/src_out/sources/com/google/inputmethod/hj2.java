package com.google.inputmethod;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public class hj2 {
    String a;
    private int b;
    private int c;
    private float d;
    private String e;
    boolean f;

    public hj2(hj2 hj2Var) {
        this.c = t04.INVALID_ID;
        this.d = Float.NaN;
        this.e = null;
        this.a = hj2Var.a;
        this.b = hj2Var.b;
        this.c = hj2Var.c;
        this.d = hj2Var.d;
        this.e = hj2Var.e;
        this.f = hj2Var.f;
    }

    public static String a(int i) {
        String str = "00000000" + Integer.toHexString(i);
        return "#" + str.substring(str.length() - 8);
    }

    public hj2 b() {
        return new hj2(this);
    }

    public boolean c() {
        return this.f;
    }

    public float d() {
        return this.d;
    }

    public int e() {
        return this.c;
    }

    public String f() {
        return this.a;
    }

    public String g() {
        return this.e;
    }

    public int h() {
        return this.b;
    }

    public void i(float f) {
        this.d = f;
    }

    public void j(int i) {
        this.c = i;
    }

    public String toString() {
        String str = this.a + ':';
        switch (this.b) {
            case 900:
                return str + this.c;
            case 901:
                return str + this.d;
            case 902:
                return str + a(this.c);
            case 903:
                return str + this.e;
            case 904:
                return str + Boolean.valueOf(this.f);
            case 905:
                return str + this.d;
            default:
                return str + "????";
        }
    }

    public hj2(String str, int i, int i2) {
        this.c = t04.INVALID_ID;
        this.d = Float.NaN;
        this.e = null;
        this.a = str;
        this.b = i;
        if (i == 901) {
            this.d = i2;
        } else {
            this.c = i2;
        }
    }

    public hj2(String str, int i, float f) {
        this.c = t04.INVALID_ID;
        this.e = null;
        this.a = str;
        this.b = i;
        this.d = f;
    }
}
