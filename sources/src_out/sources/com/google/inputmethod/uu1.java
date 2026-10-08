package com.google.inputmethod;

import android.content.res.Configuration;
import android.os.LocaleList;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public final class uu1 {

    static class a {
        static LocaleList a(Configuration configuration) {
            return configuration.getLocales();
        }

        static void b(Configuration configuration, h77 h77Var) {
            configuration.setLocales((LocaleList) h77Var.i());
        }
    }

    public static h77 a(Configuration configuration) {
        return h77.j(a.a(configuration));
    }

    public static void b(Configuration configuration, h77 h77Var) {
        a.b(configuration, h77Var);
    }
}
