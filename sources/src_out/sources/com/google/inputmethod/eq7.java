package com.google.inputmethod;

import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u000f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\r\u0010\t\u001a\u0004\b\u000e\u0010\u000bR\u0017\u0010\u0013\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0011\u001a\u0004\b\r\u0010\u0012R\u0011\u0010\u0017\u001a\u00020\u00148G¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u001b\u001a\u00020\u00188G¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001e\u001a\u00020\u0004*\u00020\u001c8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u001d¨\u0006\u001f"}, d2 = {"Lcom/google/android/eq7;", "", "<init>", "()V", "Lcom/google/android/jq7;", "g", "(Landroidx/compose/runtime/d;I)Lcom/google/android/jq7;", "Lcom/google/android/ff3;", "b", "F", "f", "()F", "TonalElevation", "c", "d", "ShadowElevation", "Lcom/google/android/rx8;", "Lcom/google/android/rx8;", "()Lcom/google/android/rx8;", "DropdownMenuItemContentPadding", "Lcom/google/android/xkb;", "e", "(Landroidx/compose/runtime/d;I)Lcom/google/android/xkb;", "shape", "Lcom/google/android/ei1;", "a", "(Landroidx/compose/runtime/d;I)J", "containerColor", "Lcom/google/android/yi1;", "(Lcom/google/android/yi1;)Lcom/google/android/jq7;", "defaultMenuItemColors", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class eq7 {
    public static final eq7 a = new eq7();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final float TonalElevation = go3.a.a();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static final float ShadowElevation = vq7.a.b();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private static final rx8 DropdownMenuItemContentPadding = nx8.f(qq7.c, ff3.i(0));

    private eq7() {
    }

    public final long a(d dVar, int i) {
        if (e.k()) {
            e.o(-1787427929, i, -1, "androidx.compose.material3.MenuDefaults.<get-containerColor> (Menu.kt:193)");
        }
        long jL = bj1.l(vq7.a.a(), dVar, 6);
        if (e.k()) {
            e.n();
        }
        return jL;
    }

    public final jq7 b(ColorScheme yi1Var) {
        jq7 jq7VarH = yi1Var.getDefaultMenuItemColorsCached();
        if (jq7VarH != null) {
            return jq7VarH;
        }
        l47 l47Var = l47.a;
        jq7 jq7Var = new jq7(bj1.j(yi1Var, l47Var.g()), bj1.j(yi1Var, l47Var.h()), bj1.j(yi1Var, l47Var.j()), ei1.p(bj1.j(yi1Var, l47Var.a()), l47Var.b(), 0.0f, 0.0f, 0.0f, 14, null), ei1.p(bj1.j(yi1Var, l47Var.c()), l47Var.d(), 0.0f, 0.0f, 0.0f, 14, null), ei1.p(bj1.j(yi1Var, l47Var.e()), l47Var.f(), 0.0f, 0.0f, 0.0f, 14, null), null);
        yi1Var.r0(jq7Var);
        return jq7Var;
    }

    public final rx8 c() {
        return DropdownMenuItemContentPadding;
    }

    public final float d() {
        return ShadowElevation;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final xkb e(d dVar, int i) throws NoWhenBranchMatchedException {
        if (e.k()) {
            e.o(218702739, i, -1, "androidx.compose.material3.MenuDefaults.<get-shape> (Menu.kt:189)");
        }
        xkb xkbVarI = ulb.i(vq7.a.c(), dVar, 6);
        if (e.k()) {
            e.n();
        }
        return xkbVarI;
    }

    public final float f() {
        return TonalElevation;
    }

    public final jq7 g(d dVar, int i) {
        if (e.k()) {
            e.o(1326531516, i, -1, "androidx.compose.material3.MenuDefaults.itemColors (Menu.kt:199)");
        }
        jq7 jq7VarB = b(kh7.a.a(dVar, 6));
        if (e.k()) {
            e.n();
        }
        return jq7VarB;
    }
}
