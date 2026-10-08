package androidx.compose.p001foundation.layout;

import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import com.google.inputmethod.InsetsValues;
import com.google.inputmethod.e1e;
import com.google.inputmethod.tp;
import com.google.inputmethod.uy5;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u000b\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\b\u0010\t\"\u0015\u0010\u000e\u001a\u00020\u000b*\u00020\n8G¢\u0006\u0006\u001a\u0004\b\f\u0010\r\"\u0015\u0010\u0010\u001a\u00020\u000b*\u00020\n8G¢\u0006\u0006\u001a\u0004\b\u000f\u0010\r\"\u0015\u0010\u0012\u001a\u00020\u000b*\u00020\n8G¢\u0006\u0006\u001a\u0004\b\u0011\u0010\r\"\u0015\u0010\u0014\u001a\u00020\u000b*\u00020\n8G¢\u0006\u0006\u001a\u0004\b\u0013\u0010\r\"\u0015\u0010\u0016\u001a\u00020\u000b*\u00020\n8G¢\u0006\u0006\u001a\u0004\b\u0015\u0010\r\"\u0015\u0010\u0018\u001a\u00020\u000b*\u00020\n8G¢\u0006\u0006\u001a\u0004\b\u0017\u0010\r\"\u001e\u0010\u001c\u001a\u00020\u000b*\u00020\n8GX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0019\u0010\r\"\u001e\u0010\u001f\u001a\u00020\u000b*\u00020\n8GX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001d\u0010\r\"\u001e\u0010$\u001a\u00020 *\u00020\n8GX\u0087\u0004¢\u0006\f\u0012\u0004\b#\u0010\u001b\u001a\u0004\b!\u0010\"\"\u001e\u0010'\u001a\u00020\u000b*\u00020\n8GX\u0087\u0004¢\u0006\f\u0012\u0004\b&\u0010\u001b\u001a\u0004\b%\u0010\r\"\u001e\u0010*\u001a\u00020\u000b*\u00020\n8GX\u0087\u0004¢\u0006\f\u0012\u0004\b)\u0010\u001b\u001a\u0004\b(\u0010\r¨\u0006+"}, d2 = {"Lcom/google/android/uy5;", "Lcom/google/android/fz5;", "m", "(Lcom/google/android/uy5;)Lcom/google/android/fz5;", "insets", "", "name", "Lcom/google/android/e1e;", "a", "(Lcom/google/android/uy5;Ljava/lang/String;)Lcom/google/android/e1e;", "Landroidx/compose/foundation/layout/g1$a;", "Landroidx/compose/foundation/layout/g1;", "b", "(Landroidx/compose/foundation/layout/g1$a;Landroidx/compose/runtime/d;I)Landroidx/compose/foundation/layout/g1;", "displayCutout", "c", "ime", "f", "navigationBars", "i", "statusBars", "j", "systemBars", "h", "safeDrawing", "g", "getNavigationBarsIgnoringVisibility$annotations", "(Landroidx/compose/foundation/layout/g1$a;Landroidx/compose/runtime/d;I)V", "navigationBarsIgnoringVisibility", "k", "getSystemBarsIgnoringVisibility$annotations", "systemBarsIgnoringVisibility", "", "l", "(Landroidx/compose/foundation/layout/g1$a;Landroidx/compose/runtime/d;I)Z", "isImeVisible$annotations", "isImeVisible", "d", "getImeAnimationSource$annotations", "imeAnimationSource", "e", "getImeAnimationTarget$annotations", "imeAnimationTarget", "foundation-layout"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class i1 {
    public static final e1e a(uy5 uy5Var, String str) {
        return new e1e(m(uy5Var), str);
    }

    public static final g1 b(g1.Companion companion, d dVar, int i) {
        if (e.k()) {
            e.o(1324817724, i, -1, "androidx.compose.foundation.layout.<get-displayCutout> (WindowInsets.android.kt:148)");
        }
        tp tpVarE = h1.INSTANCE.d(dVar, 6).getDisplayCutout();
        if (e.k()) {
            e.n();
        }
        return tpVarE;
    }

    public static final g1 c(g1.Companion companion, d dVar, int i) {
        if (e.k()) {
            e.o(-1466917860, i, -1, "androidx.compose.foundation.layout.<get-ime> (WindowInsets.android.kt:160)");
        }
        tp tpVarF = h1.INSTANCE.d(dVar, 6).getIme();
        if (e.k()) {
            e.n();
        }
        return tpVarF;
    }

    public static final g1 d(g1.Companion companion, d dVar, int i) {
        if (e.k()) {
            e.o(-1126064918, i, -1, "androidx.compose.foundation.layout.<get-imeAnimationSource> (WindowInsets.android.kt:340)");
        }
        e1e e1eVarG = h1.INSTANCE.d(dVar, 6).getImeAnimationSource();
        if (e.k()) {
            e.n();
        }
        return e1eVarG;
    }

    public static final g1 e(g1.Companion companion, d dVar, int i) {
        if (e.k()) {
            e.o(-466319786, i, -1, "androidx.compose.foundation.layout.<get-imeAnimationTarget> (WindowInsets.android.kt:350)");
        }
        e1e e1eVarH = h1.INSTANCE.d(dVar, 6).getImeAnimationTarget();
        if (e.k()) {
            e.n();
        }
        return e1eVarH;
    }

    public static final g1 f(g1.Companion companion, d dVar, int i) {
        if (e.k()) {
            e.o(1596175702, i, -1, "androidx.compose.foundation.layout.<get-navigationBars> (WindowInsets.android.kt:176)");
        }
        tp tpVarJ = h1.INSTANCE.d(dVar, 6).getNavigationBars();
        if (e.k()) {
            e.n();
        }
        return tpVarJ;
    }

    public static final g1 g(g1.Companion companion, d dVar, int i) {
        if (e.k()) {
            e.o(-1990981160, i, -1, "androidx.compose.foundation.layout.<get-navigationBarsIgnoringVisibility> (WindowInsets.android.kt:247)");
        }
        e1e e1eVarK = h1.INSTANCE.d(dVar, 6).getNavigationBarsIgnoringVisibility();
        if (e.k()) {
            e.n();
        }
        return e1eVarK;
    }

    public static final g1 h(g1.Companion companion, d dVar, int i) {
        if (e.k()) {
            e.o(-49441252, i, -1, "androidx.compose.foundation.layout.<get-safeDrawing> (WindowInsets.android.kt:211)");
        }
        g1 g1VarM = h1.INSTANCE.d(dVar, 6).getSafeDrawing();
        if (e.k()) {
            e.n();
        }
        return g1VarM;
    }

    public static final g1 i(g1.Companion companion, d dVar, int i) {
        if (e.k()) {
            e.o(-675090670, i, -1, "androidx.compose.foundation.layout.<get-statusBars> (WindowInsets.android.kt:180)");
        }
        tp tpVarO = h1.INSTANCE.d(dVar, 6).getStatusBars();
        if (e.k()) {
            e.n();
        }
        return tpVarO;
    }

    public static final g1 j(g1.Companion companion, d dVar, int i) {
        if (e.k()) {
            e.o(-282936756, i, -1, "androidx.compose.foundation.layout.<get-systemBars> (WindowInsets.android.kt:184)");
        }
        tp tpVarP = h1.INSTANCE.d(dVar, 6).getSystemBars();
        if (e.k()) {
            e.n();
        }
        return tpVarP;
    }

    public static final g1 k(g1.Companion companion, d dVar, int i) {
        if (e.k()) {
            e.o(1564566798, i, -1, "androidx.compose.foundation.layout.<get-systemBarsIgnoringVisibility> (WindowInsets.android.kt:268)");
        }
        e1e e1eVarQ = h1.INSTANCE.d(dVar, 6).getSystemBarsIgnoringVisibility();
        if (e.k()) {
            e.n();
        }
        return e1eVarQ;
    }

    public static final boolean l(g1.Companion companion, d dVar, int i) {
        if (e.k()) {
            e.o(-1873571424, i, -1, "androidx.compose.foundation.layout.<get-isImeVisible> (WindowInsets.android.kt:295)");
        }
        boolean zF = h1.INSTANCE.d(dVar, 6).getIme().f();
        if (e.k()) {
            e.n();
        }
        return zF;
    }

    public static final InsetsValues m(uy5 uy5Var) {
        return new InsetsValues(uy5Var.a, uy5Var.b, uy5Var.c, uy5Var.d);
    }
}
