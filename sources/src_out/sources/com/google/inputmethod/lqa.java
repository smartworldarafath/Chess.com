package com.google.inputmethod;

import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0015\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b\u001a\u0015\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\t¢\u0006\u0004\b\n\u0010\b\u001a\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e\u001a5\u0010\u0013\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u0005¢\u0006\u0004\b\u0013\u0010\u0014\"\u0017\u0010\u0018\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lcom/google/android/ea2;", "corner", "Lcom/google/android/kqa;", "c", "(Lcom/google/android/ea2;)Lcom/google/android/kqa;", "Lcom/google/android/ff3;", "size", "d", "(F)Lcom/google/android/kqa;", "", "a", "", "percent", "b", "(I)Lcom/google/android/kqa;", "topStart", "topEnd", "bottomEnd", "bottomStart", "e", "(FFFF)Lcom/google/android/kqa;", "Lcom/google/android/kqa;", "g", "()Lcom/google/android/kqa;", "CircleShape", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class lqa {
    private static final RoundedCornerShape a = b(50);

    public static final RoundedCornerShape a(float f) {
        return c(fa2.a(f));
    }

    public static final RoundedCornerShape b(int i) {
        return c(fa2.b(i));
    }

    public static final RoundedCornerShape c(ea2 ea2Var) {
        return new RoundedCornerShape(ea2Var, ea2Var, ea2Var, ea2Var);
    }

    public static final RoundedCornerShape d(float f) {
        return c(fa2.c(f));
    }

    public static final RoundedCornerShape e(float f, float f2, float f3, float f4) {
        return new RoundedCornerShape(fa2.c(f), fa2.c(f2), fa2.c(f3), fa2.c(f4));
    }

    public static /* synthetic */ RoundedCornerShape f(float f, float f2, float f3, float f4, int i, Object obj) {
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
        return e(f, f2, f3, f4);
    }

    public static final RoundedCornerShape g() {
        return a;
    }
}
