package com.google.inputmethod;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0081@\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u000f\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0011"}, d2 = {"Lcom/google/android/dn9;", "", "Lcom/google/android/n48;", "list", "b", "(Lcom/google/android/n48;)Lcom/google/android/n48;", "", "value", "", "a", "(Lcom/google/android/n48;I)V", "", "d", "(Lcom/google/android/n48;)Z", "e", "(Lcom/google/android/n48;)I", "f", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class dn9 {
    public static final void a(n48 n48Var, int i) {
        if (n48Var._size == 0 || !(n48Var.e(0) == i || n48Var.e(n48Var._size - 1) == i)) {
            int i2 = n48Var._size;
            n48Var.k(i);
            while (i2 > 0) {
                int i3 = ((i2 + 1) >>> 1) - 1;
                int iE = n48Var.e(i3);
                if (i <= iE) {
                    break;
                }
                n48Var.r(i2, iE);
                i2 = i3;
            }
            n48Var.r(i2, i);
        }
    }

    public static n48 b(n48 n48Var) {
        return n48Var;
    }

    public static /* synthetic */ n48 c(n48 n48Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            n48Var = new n48(0, 1, null);
        }
        return b(n48Var);
    }

    public static final boolean d(n48 n48Var) {
        return n48Var._size != 0;
    }

    public static final int e(n48 n48Var) {
        return n48Var.d();
    }

    public static final int f(n48 n48Var) {
        int iE;
        int i = n48Var._size;
        int iE2 = n48Var.e(0);
        while (n48Var._size != 0 && n48Var.e(0) == iE2) {
            n48Var.r(0, n48Var.i());
            n48Var.p(n48Var._size - 1);
            int i2 = n48Var._size;
            int i3 = i2 >>> 1;
            int i4 = 0;
            while (i4 < i3) {
                int iE3 = n48Var.e(i4);
                int i5 = (i4 + 1) * 2;
                int i6 = i5 - 1;
                int iE4 = n48Var.e(i6);
                if (i5 < i2 && (iE = n48Var.e(i5)) > iE4) {
                    if (iE <= iE3) {
                        break;
                    }
                    n48Var.r(i4, iE);
                    n48Var.r(i5, iE3);
                    i4 = i5;
                } else {
                    if (iE4 <= iE3) {
                        break;
                    }
                    n48Var.r(i4, iE4);
                    n48Var.r(i6, iE3);
                    i4 = i6;
                }
            }
        }
        return iE2;
    }
}
