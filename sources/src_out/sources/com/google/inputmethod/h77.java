package com.google.inputmethod;

import android.os.LocaleList;
import java.util.Locale;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public final class h77 {
    private static final h77 b = a(new Locale[0]);
    private final k77 a;

    static class a {
        static LocaleList a(Locale... localeArr) {
            return new LocaleList(localeArr);
        }

        static LocaleList b() {
            return LocaleList.getDefault();
        }
    }

    private h77(k77 k77Var) {
        this.a = k77Var;
    }

    public static h77 a(Locale... localeArr) {
        return j(a.a(localeArr));
    }

    public static h77 b(String str) {
        if (str == null || str.isEmpty()) {
            return e();
        }
        String[] strArrSplit = str.split(",", -1);
        int length = strArrSplit.length;
        Locale[] localeArr = new Locale[length];
        for (int i = 0; i < length; i++) {
            localeArr[i] = Locale.forLanguageTag(strArrSplit[i]);
        }
        return a(localeArr);
    }

    public static h77 d() {
        return j(a.b());
    }

    public static h77 e() {
        return b;
    }

    public static h77 j(LocaleList localeList) {
        return new h77(new l77(localeList));
    }

    public Locale c(int i) {
        return this.a.get(i);
    }

    public boolean equals(Object obj) {
        return (obj instanceof h77) && this.a.equals(((h77) obj).a);
    }

    public boolean f() {
        return this.a.isEmpty();
    }

    public int g() {
        return this.a.size();
    }

    public String h() {
        return this.a.a();
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public Object i() {
        return this.a.getLocaleList();
    }

    public String toString() {
        return this.a.toString();
    }
}
