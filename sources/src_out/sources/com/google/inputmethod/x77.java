package com.google.inputmethod;

import android.content.LocusId;
import android.os.Build;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public final class x77 {
    private final String a;
    private final LocusId b;

    private static class a {
        static LocusId a(String str) {
            return new LocusId(str);
        }

        static String b(LocusId locusId) {
            return locusId.getId();
        }
    }

    public x77(String str) {
        this.a = (String) di9.j(str, "id cannot be empty");
        if (Build.VERSION.SDK_INT >= 29) {
            this.b = a.a(str);
        } else {
            this.b = null;
        }
    }

    private String b() {
        return this.a.length() + "_chars";
    }

    public static x77 d(LocusId locusId) {
        di9.h(locusId, "locusId cannot be null");
        return new x77((String) di9.j(a.b(locusId), "id cannot be empty"));
    }

    public String a() {
        return this.a;
    }

    public LocusId c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || x77.class != obj.getClass()) {
            return false;
        }
        x77 x77Var = (x77) obj;
        String str = this.a;
        if (str == null) {
            return x77Var.a == null;
        }
        return str.equals(x77Var.a);
    }

    public int hashCode() {
        String str = this.a;
        return 31 + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "LocusIdCompat[" + b() + "]";
    }
}
