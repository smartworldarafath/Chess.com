package com.google.inputmethod;

import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u000f\u001a\u00020\u0004*\u00020\r8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/google/android/ha1;", "", "<init>", "()V", "Lcom/google/android/ga1;", "a", "(Landroidx/compose/runtime/d;I)Lcom/google/android/ga1;", "Lcom/google/android/ff3;", "b", "F", "c", "()F", "StrokeWidth", "Lcom/google/android/yi1;", "(Lcom/google/android/yi1;)Lcom/google/android/ga1;", "defaultCheckboxColors", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ha1 {
    public static final ha1 a = new ha1();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final float StrokeWidth = ff3.i(2);

    private ha1() {
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final ga1 a(d dVar, int i) throws NoWhenBranchMatchedException {
        if (e.k()) {
            e.o(-9530498, i, -1, "androidx.compose.material3.CheckboxDefaults.colors (Checkbox.kt:315)");
        }
        ga1 ga1VarB = b(kh7.a.a(dVar, 6));
        if (e.k()) {
            e.n();
        }
        return ga1VarB;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final ga1 b(ColorScheme colorScheme) throws NoWhenBranchMatchedException {
        ga1 defaultCheckboxColorsCached = colorScheme.getDefaultCheckboxColorsCached();
        if (defaultCheckboxColorsCached != null) {
            return defaultCheckboxColorsCached;
        }
        oa1 oa1Var = oa1.a;
        long j = bj1.j(colorScheme, oa1Var.c());
        ei1.Companion companion = ei1.INSTANCE;
        ga1 ga1Var = new ga1(j, companion.h(), bj1.j(colorScheme, oa1Var.a()), companion.h(), ei1.p(bj1.j(colorScheme, oa1Var.b()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), companion.h(), ei1.p(bj1.j(colorScheme, oa1Var.b()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), bj1.j(colorScheme, oa1Var.a()), bj1.j(colorScheme, oa1Var.f()), ei1.p(bj1.j(colorScheme, oa1Var.b()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ei1.p(bj1.j(colorScheme, oa1Var.e()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ei1.p(bj1.j(colorScheme, oa1Var.b()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.n0(ga1Var);
        return ga1Var;
    }

    public final float c() {
        return StrokeWidth;
    }
}
