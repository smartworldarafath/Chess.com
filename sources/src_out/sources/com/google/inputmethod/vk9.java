package com.google.inputmethod;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002\u001a+\u0010\u0007\u001a\u00020\u00062\u001a\u0010\u0005\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003\"\u0006\u0012\u0002\b\u00030\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/google/android/uk9;", "a", "()Lcom/google/android/uk9;", "", "Lcom/google/android/uk9$b;", "pairs", "Lcom/google/android/h58;", "b", "([Lcom/google/android/uk9$b;)Lcom/google/android/h58;", "datastore-preferences-core"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class vk9 {
    public static final uk9 a() {
        return new h58(null, true, 1, null);
    }

    public static final h58 b(uk9.b<?>... bVarArr) {
        Intrinsics.checkNotNullParameter(bVarArr, "pairs");
        h58 h58Var = new h58(null, false, 1, null);
        h58Var.j((uk9.b[]) Arrays.copyOf(bVarArr, bVarArr.length));
        return h58Var;
    }
}
