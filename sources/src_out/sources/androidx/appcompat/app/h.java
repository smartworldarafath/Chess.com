package androidx.appcompat.app;

import com.google.inputmethod.h77;
import java.util.LinkedHashSet;
import java.util.Locale;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
final class h {
    private static h77 a(h77 h77Var, h77 h77Var2) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int i = 0;
        while (i < h77Var.g() + h77Var2.g()) {
            Locale localeC = i < h77Var.g() ? h77Var.c(i) : h77Var2.c(i - h77Var.g());
            if (localeC != null) {
                linkedHashSet.add(localeC);
            }
            i++;
        }
        return h77.a((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]));
    }

    static h77 b(h77 h77Var, h77 h77Var2) {
        return (h77Var == null || h77Var.f()) ? h77.e() : a(h77Var, h77Var2);
    }
}
