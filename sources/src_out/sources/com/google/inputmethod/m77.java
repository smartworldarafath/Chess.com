package com.google.inputmethod;

import android.app.LocaleManager;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.LocaleList;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public final class m77 {

    static class a {
        static h77 a(Configuration configuration) {
            return h77.b(configuration.getLocales().toLanguageTags());
        }
    }

    static class b {
        static LocaleList a(Object obj) {
            return ((LocaleManager) obj).getSystemLocales();
        }
    }

    static h77 a(Configuration configuration) {
        return a.a(configuration);
    }

    private static Object b(Context context) {
        return context.getSystemService("locale");
    }

    public static h77 c(Context context) {
        h77 h77VarE = h77.e();
        if (Build.VERSION.SDK_INT < 33) {
            return a(Resources.getSystem().getConfiguration());
        }
        Object objB = b(context);
        return objB != null ? h77.j(b.a(objB)) : h77VarE;
    }
}
