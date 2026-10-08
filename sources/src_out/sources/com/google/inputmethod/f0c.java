package com.google.inputmethod;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a)\u0010\u0004\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a'\u0010\u0007\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u001f\u0010\t\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0002¢\u0006\u0004\b\t\u0010\n\"\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"E", "Lcom/google/android/e0c;", "", "key", "c", "(Lcom/google/android/e0c;I)Ljava/lang/Object;", "", "d", "(Lcom/google/android/e0c;I)V", "e", "(Lcom/google/android/e0c;)V", "", "a", "Ljava/lang/Object;", "DELETED", "collection"}, k = 2, mv = {1, lo6.HASACTION_FIELD_NUMBER, 0}, xi = 48)
public final class f0c {
    private static final Object a = new Object();

    public static final <E> E c(e0c<E> e0cVar, int i) {
        E e;
        Intrinsics.checkNotNullParameter(e0cVar, "<this>");
        int iA = ty1.a(e0cVar.b, e0cVar.d, i);
        if (iA < 0 || (e = (E) e0cVar.c[iA]) == a) {
            return null;
        }
        return e;
    }

    public static final <E> void d(e0c<E> e0cVar, int i) {
        Intrinsics.checkNotNullParameter(e0cVar, "<this>");
        int iA = ty1.a(e0cVar.b, e0cVar.d, i);
        if (iA >= 0) {
            Object[] objArr = e0cVar.c;
            Object obj = objArr[iA];
            Object obj2 = a;
            if (obj != obj2) {
                objArr[iA] = obj2;
                e0cVar.a = true;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <E> void e(e0c<E> e0cVar) {
        int i = e0cVar.d;
        int[] iArr = e0cVar.b;
        Object[] objArr = e0cVar.c;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != a) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        e0cVar.a = false;
        e0cVar.d = i2;
    }
}
