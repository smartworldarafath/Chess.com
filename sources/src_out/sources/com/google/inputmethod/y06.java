package com.google.inputmethod;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\r\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0015\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001d\u0010\b\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\t\u001a\u0019\u0010\f\u001a\u00020\u00002\n\u0010\u000b\u001a\u00020\n\"\u00020\u0003¢\u0006\u0004\b\f\u0010\r\u001a\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001d\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\u0011\u0010\u0012\"\u0014\u0010\u0014\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/google/android/x06;", "a", "()Lcom/google/android/x06;", "", "element1", "b", "(I)Lcom/google/android/x06;", "element2", "c", "(II)Lcom/google/android/x06;", "", "elements", "d", "([I)Lcom/google/android/x06;", "Lcom/google/android/n48;", "e", "(I)Lcom/google/android/n48;", "f", "(II)Lcom/google/android/n48;", "Lcom/google/android/x06;", "EmptyIntList", "collection"}, k = 2, mv = {1, lo6.HASACTION_FIELD_NUMBER, 0}, xi = 48)
public final class y06 {
    private static final x06 a = new n48(0);

    public static final x06 a() {
        return a;
    }

    public static final x06 b(int i) {
        return e(i);
    }

    public static final x06 c(int i, int i2) {
        return f(i, i2);
    }

    public static final x06 d(int... iArr) {
        Intrinsics.checkNotNullParameter(iArr, "elements");
        n48 n48Var = new n48(iArr.length);
        n48Var.l(n48Var._size, iArr);
        return n48Var;
    }

    public static final n48 e(int i) {
        n48 n48Var = new n48(1);
        n48Var.k(i);
        return n48Var;
    }

    public static final n48 f(int i, int i2) {
        n48 n48Var = new n48(2);
        n48Var.k(i);
        n48Var.k(i2);
        return n48Var;
    }
}
