package com.google.inputmethod;

import java.util.ConcurrentModificationException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a'\u0010\u0004\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a1\u0010\b\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u001f\u0010\n\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a'\u0010\u000e\u001a\u00020\r\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\f\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"E", "Lcom/google/android/g10;", "", "hash", "b", "(Lcom/google/android/g10;I)I", "", "key", "c", "(Lcom/google/android/g10;Ljava/lang/Object;I)I", "d", "(Lcom/google/android/g10;)I", "size", "", "a", "(Lcom/google/android/g10;I)V", "collection"}, k = 2, mv = {1, lo6.HASACTION_FIELD_NUMBER, 0}, xi = 48)
public final class i10 {
    public static final <E> void a(g10<E> g10Var, int i) {
        Intrinsics.checkNotNullParameter(g10Var, "<this>");
        g10Var.n(new int[i]);
        g10Var.j(new Object[i]);
    }

    public static final <E> int b(g10<E> g10Var, int i) {
        Intrinsics.checkNotNullParameter(g10Var, "<this>");
        try {
            return ty1.a(g10Var.getHashes(), g10Var.f(), i);
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public static final <E> int c(g10<E> g10Var, Object obj, int i) {
        Intrinsics.checkNotNullParameter(g10Var, "<this>");
        int iF = g10Var.f();
        if (iF == 0) {
            return -1;
        }
        int iB = b(g10Var, i);
        if (iB < 0 || Intrinsics.e(obj, g10Var.getArray()[iB])) {
            return iB;
        }
        int i2 = iB + 1;
        while (i2 < iF && g10Var.getHashes()[i2] == i) {
            if (Intrinsics.e(obj, g10Var.getArray()[i2])) {
                return i2;
            }
            i2++;
        }
        for (int i3 = iB - 1; i3 >= 0 && g10Var.getHashes()[i3] == i; i3--) {
            if (Intrinsics.e(obj, g10Var.getArray()[i3])) {
                return i3;
            }
        }
        return ~i2;
    }

    public static final <E> int d(g10<E> g10Var) {
        Intrinsics.checkNotNullParameter(g10Var, "<this>");
        return c(g10Var, null, 0);
    }
}
