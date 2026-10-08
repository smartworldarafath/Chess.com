package com.google.inputmethod;

import androidx.compose.ui.b;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a;\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a'\u0010\n\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u001b\u0010\r\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\f\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a\u001b\u0010\u0011\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u001b\u0010\u0015\u001a\u00020\u0001*\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u001b\u0010\u0017\u001a\u00020\u0001*\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0017\u0010\u0016\u001a\u0017\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0018\u0010\u0019\u001a#\u0010\u001a\u001a\u00020\u000f2\b\b\u0002\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u001a\u0010\u001b\u001a7\u0010\u001c\u001a\u00020\u000f2\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Landroidx/compose/ui/b;", "Lcom/google/android/ff3;", "start", "top", "end", "bottom", "q", "(Landroidx/compose/ui/b;FFFF)Landroidx/compose/ui/b;", "horizontal", "vertical", "o", "(Landroidx/compose/ui/b;FF)Landroidx/compose/ui/b;", "all", "n", "(Landroidx/compose/ui/b;F)Landroidx/compose/ui/b;", "Lcom/google/android/rx8;", "paddingValues", "l", "(Landroidx/compose/ui/b;Lcom/google/android/rx8;)Landroidx/compose/ui/b;", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "k", "(Lcom/google/android/rx8;Landroidx/compose/ui/unit/LayoutDirection;)F", "j", "e", "(F)Lcom/google/android/rx8;", "f", "(FF)Lcom/google/android/rx8;", "h", "(FFFF)Lcom/google/android/rx8;", "foundation-layout"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class nx8 {
    public static final rx8 e(float f) {
        return new PaddingValues(f, f, f, f, null);
    }

    public static final rx8 f(float f, float f2) {
        return new PaddingValues(f, f2, f, f2, null);
    }

    public static /* synthetic */ rx8 g(float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = ff3.i(0);
        }
        if ((i & 2) != 0) {
            f2 = ff3.i(0);
        }
        return f(f, f2);
    }

    public static final rx8 h(float f, float f2, float f3, float f4) {
        return new PaddingValues(f, f2, f3, f4, null);
    }

    public static /* synthetic */ rx8 i(float f, float f2, float f3, float f4, int i, Object obj) {
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
        return h(f, f2, f3, f4);
    }

    public static final float j(rx8 rx8Var, LayoutDirection layoutDirection) {
        return layoutDirection == LayoutDirection.Ltr ? rx8Var.c(layoutDirection) : rx8Var.b(layoutDirection);
    }

    public static final float k(rx8 rx8Var, LayoutDirection layoutDirection) {
        return layoutDirection == LayoutDirection.Ltr ? rx8Var.b(layoutDirection) : rx8Var.c(layoutDirection);
    }

    public static final b l(b bVar, final rx8 rx8Var) {
        return bVar.then(new sx8(rx8Var, new Function1() { // from class: com.google.android.jx8
            public final Object invoke(Object obj) {
                return nx8.m(rx8Var, (jz5) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(rx8 rx8Var, jz5 jz5Var) {
        jz5Var.b("padding");
        jz5Var.getProperties().c("paddingValues", rx8Var);
        return Unit.a;
    }

    public static final b n(b bVar, final float f) {
        return bVar.then(new gx8(f, f, f, f, true, new Function1() { // from class: com.google.android.lx8
            public final Object invoke(Object obj) {
                return nx8.s(f, (jz5) obj);
            }
        }, null));
    }

    public static final b o(b bVar, final float f, final float f2) {
        return bVar.then(new gx8(f, f2, f, f2, true, new Function1() { // from class: com.google.android.kx8
            public final Object invoke(Object obj) {
                return nx8.t(f, f2, (jz5) obj);
            }
        }, null));
    }

    public static /* synthetic */ b p(b bVar, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = ff3.i(0);
        }
        if ((i & 2) != 0) {
            f2 = ff3.i(0);
        }
        return o(bVar, f, f2);
    }

    public static final b q(b bVar, final float f, final float f2, final float f3, final float f4) {
        return bVar.then(new gx8(f, f2, f3, f4, true, new Function1() { // from class: com.google.android.ix8
            public final Object invoke(Object obj) {
                return nx8.u(f, f2, f3, f4, (jz5) obj);
            }
        }, null));
    }

    public static /* synthetic */ b r(b bVar, float f, float f2, float f3, float f4, int i, Object obj) {
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
        return q(bVar, f, f2, f3, f4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s(float f, jz5 jz5Var) {
        jz5Var.b("padding");
        jz5Var.c(ff3.e(f));
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(float f, float f2, jz5 jz5Var) {
        jz5Var.b("padding");
        jz5Var.getProperties().c("horizontal", ff3.e(f));
        jz5Var.getProperties().c("vertical", ff3.e(f2));
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit u(float f, float f2, float f3, float f4, jz5 jz5Var) {
        jz5Var.b("padding");
        jz5Var.getProperties().c("start", ff3.e(f));
        jz5Var.getProperties().c("top", ff3.e(f2));
        jz5Var.getProperties().c("end", ff3.e(f3));
        jz5Var.getProperties().c("bottom", ff3.e(f4));
        return Unit.a;
    }
}
