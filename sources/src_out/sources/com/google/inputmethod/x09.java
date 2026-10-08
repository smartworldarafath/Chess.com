package com.google.inputmethod;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public class x09<F, S> {
    public final F a;
    public final S b;

    public x09(F f, S s) {
        this.a = f;
        this.b = s;
    }

    public static <A, B> x09<A, B> a(A a, B b) {
        return new x09<>(a, b);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof x09)) {
            return false;
        }
        x09 x09Var = (x09) obj;
        return mm8.a(x09Var.a, this.a) && mm8.a(x09Var.b, this.b);
    }

    public int hashCode() {
        F f = this.a;
        int iHashCode = f == null ? 0 : f.hashCode();
        S s = this.b;
        return iHashCode ^ (s != null ? s.hashCode() : 0);
    }

    public String toString() {
        return "Pair{" + this.a + " " + this.b + "}";
    }
}
