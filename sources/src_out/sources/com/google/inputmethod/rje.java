package com.google.inputmethod;

import androidx.compose.p001foundation.layout.g1;
import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import androidx.compose.ui.platform.CompositionLocalsKt;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0002\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0019\u0010\u0004\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0019\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0003\u001a\u0019\u0010\b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\u000b\u001a\u00020\n*\u00020\u0000H\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a\u0019\u0010\u000f\u001a\u00020\n*\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0013\u0010\u0011\u001a\u00020\u0000*\u00020\nH\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\r\u0010\u0013\u001a\u00020\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a5\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00152\b\b\u0002\u0010\u0019\u001a\u00020\u0015¢\u0006\u0004\b\u001a\u0010\u001b\u001a5\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0016\u001a\u00020\u001c2\b\b\u0002\u0010\u0017\u001a\u00020\u001c2\b\b\u0002\u0010\u0018\u001a\u00020\u001c2\b\b\u0002\u0010\u0019\u001a\u00020\u001c¢\u0006\u0004\b\u001d\u0010\u001e\"\u0014\u0010!\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010 ¨\u0006\""}, d2 = {"Landroidx/compose/foundation/layout/g1;", "insets", "l", "(Landroidx/compose/foundation/layout/g1;Landroidx/compose/foundation/layout/g1;)Landroidx/compose/foundation/layout/g1;", "j", "f", "Lcom/google/android/fke;", "sides", "k", "(Landroidx/compose/foundation/layout/g1;I)Landroidx/compose/foundation/layout/g1;", "Lcom/google/android/rx8;", "h", "(Landroidx/compose/foundation/layout/g1;Landroidx/compose/runtime/d;I)Lcom/google/android/rx8;", "Lcom/google/android/f43;", "density", "i", "(Landroidx/compose/foundation/layout/g1;Lcom/google/android/f43;)Lcom/google/android/rx8;", "g", "(Lcom/google/android/rx8;)Landroidx/compose/foundation/layout/g1;", "a", "()Landroidx/compose/foundation/layout/g1;", "", "left", "top", "right", "bottom", "b", "(IIII)Landroidx/compose/foundation/layout/g1;", "Lcom/google/android/ff3;", "d", "(FFFF)Landroidx/compose/foundation/layout/g1;", "Lcom/google/android/ee4;", "Lcom/google/android/ee4;", "EmptyWindowInsets", "foundation-layout"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class rje {
    private static final Insets a = new Insets(0, 0, 0, 0);

    public static final g1 a() {
        return a;
    }

    public static final g1 b(int i, int i2, int i3, int i4) {
        return new Insets(i, i2, i3, i4);
    }

    public static /* synthetic */ g1 c(int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = 0;
        }
        if ((i5 & 2) != 0) {
            i2 = 0;
        }
        if ((i5 & 4) != 0) {
            i3 = 0;
        }
        if ((i5 & 8) != 0) {
            i4 = 0;
        }
        return b(i, i2, i3, i4);
    }

    public static final g1 d(float f, float f2, float f3, float f4) {
        return new Insets(f, f2, f3, f4, null);
    }

    public static /* synthetic */ g1 e(float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = ff3.i(0);
        }
        if ((i & 2) != 0) {
            f2 = ff3.i(0);
        }
        if ((i & 4) != 0) {
            f3 = ff3.i(0);
        }
        if ((i & 8) != 0) {
            f4 = ff3.i(0);
        }
        return d(f, f2, f3, f4);
    }

    public static final g1 f(g1 g1Var, g1 g1Var2) {
        return new mb(g1Var, g1Var2);
    }

    public static final g1 g(rx8 rx8Var) {
        return new PaddingValues(rx8Var);
    }

    public static final rx8 h(g1 g1Var, d dVar, int i) {
        if (e.k()) {
            e.o(-1485016250, i, -1, "androidx.compose.foundation.layout.asPaddingValues (WindowInsets.kt:221)");
        }
        InsetsPaddingValues dz5Var = new InsetsPaddingValues(g1Var, (f43) dVar.v(CompositionLocalsKt.g()));
        if (e.k()) {
            e.n();
        }
        return dz5Var;
    }

    public static final rx8 i(g1 g1Var, f43 f43Var) {
        return new InsetsPaddingValues(g1Var, f43Var);
    }

    public static final g1 j(g1 g1Var, g1 g1Var2) {
        return new xx3(g1Var, g1Var2);
    }

    public static final g1 k(g1 g1Var, int i) {
        return new y17(g1Var, i, null);
    }

    public static final g1 l(g1 g1Var, g1 g1Var2) {
        return new vsd(g1Var, g1Var2);
    }
}
