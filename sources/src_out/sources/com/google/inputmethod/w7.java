package com.google.inputmethod;

import com.google.android.qjd;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.b0;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a1\u0010\u0005\u001a\u00020\u00042\"\u0010\u0003\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u00010\u0000\"\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a1\u0010\b\u001a\u00020\u00072\"\u0010\u0003\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u00010\u0000\"\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0001¢\u0006\u0004\b\b\u0010\t\u001a\u0011\u0010\n\u001a\u00020\u0007*\u00020\u0004¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"", "Lcom/google/android/v7$b;", "", "pairs", "Lcom/google/android/v7;", "a", "([Lcom/google/android/v7$b;)Lcom/google/android/v7;", "Lcom/google/android/f48;", "b", "([Lcom/google/android/v7$b;)Lcom/google/android/f48;", "c", "(Lcom/google/android/v7;)Lcom/google/android/f48;", "glance_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class w7 {
    public static final v7 a(v7.b<? extends Object>... bVarArr) {
        return b((v7.b[]) Arrays.copyOf(bVarArr, bVarArr.length));
    }

    public static final f48 b(v7.b<? extends Object>... bVarArr) {
        ArrayList arrayList = new ArrayList(bVarArr.length);
        for (v7.b<? extends Object> bVar : bVarArr) {
            arrayList.add(qjd.a(bVar.a(), bVar.b()));
        }
        Pair[] pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
        return new f48(b0.q((Pair[]) Arrays.copyOf(pairArr, pairArr.length)));
    }

    public static final f48 c(v7 v7Var) {
        return new f48(b0.C(v7Var.a()));
    }
}
