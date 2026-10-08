package com.google.inputmethod;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a'\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a'\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a5\u0010\u000e\u001a\u00020\u00012\u0012\u0010\u000b\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\n0\t2\u0006\u0010\f\u001a\u00020\u00012\b\b\u0002\u0010\r\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"T", "Lcom/google/android/a69;", "Lcom/google/android/zr1;", "key", "", "a", "(Lcom/google/android/a69;Lcom/google/android/zr1;)Z", "b", "(Lcom/google/android/a69;Lcom/google/android/zr1;)Ljava/lang/Object;", "", "Lcom/google/android/os9;", "values", "parentScope", "previous", "c", "([Lcom/google/android/os9;Lcom/google/android/a69;Lcom/google/android/a69;)Lcom/google/android/a69;", "runtime"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class hs1 {
    public static final <T> boolean a(a69 a69Var, zr1<T> zr1Var) {
        Intrinsics.h(zr1Var, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
        return a69Var.containsKey(zr1Var);
    }

    public static final <T> T b(a69 a69Var, zr1<T> zr1Var) {
        Intrinsics.h(zr1Var, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
        c1e<T> c1eVarA = (c1e<T>) a69Var.get(zr1Var);
        if (c1eVarA == null) {
            c1eVarA = zr1Var.a();
        }
        return (T) c1eVarA.a(a69Var);
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [com.google.android.a69] */
    public static final a69 c(os9<?>[] os9VarArr, a69 a69Var, a69 a69Var2) {
        z59.a aVarV = b69.a().builder();
        for (os9<?> os9Var : os9VarArr) {
            zr1<?> zr1VarB = os9Var.b();
            Intrinsics.h(zr1VarB, "null cannot be cast to non-null type androidx.compose.runtime.ProvidableCompositionLocal<kotlin.Any?>");
            ks9 ks9Var = (ks9) zr1VarB;
            if (os9Var.getCanOverride() || !a(a69Var, ks9Var)) {
                c1e c1eVar = (c1e) a69Var2.get(ks9Var);
                Intrinsics.h(os9Var, "null cannot be cast to non-null type androidx.compose.runtime.ProvidedValue<kotlin.Any?>");
                aVarV.put(ks9Var, ks9Var.b(os9Var, c1eVar));
            }
        }
        return aVarV.build2();
    }

    public static /* synthetic */ a69 d(os9[] os9VarArr, a69 a69Var, a69 a69Var2, int i, Object obj) {
        if ((i & 4) != 0) {
            a69Var2 = b69.a();
        }
        return c(os9VarArr, a69Var, a69Var2);
    }
}
