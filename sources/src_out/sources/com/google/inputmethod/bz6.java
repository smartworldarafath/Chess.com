package com.google.inputmethod;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/google/android/bz6;", "", "Lcom/google/android/d66;", "Lcom/google/android/zx6;", "intervals", "<init>", "(Lcom/google/android/d66;)V", "", "itemIndex", "", "a", "(I)Z", "Lcom/google/android/d66;", "getIntervals", "()Lcom/google/android/d66;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class bz6 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final d66<zx6> intervals;

    public bz6(d66<zx6> d66Var) {
        this.intervals = d66Var;
    }

    public final boolean a(int itemIndex) {
        if (itemIndex >= 0 && itemIndex < this.intervals.getSize()) {
            d66.a<zx6> aVar = this.intervals.get(itemIndex);
            Function1<Integer, w4c> function1B = aVar.c().b();
            int startIndex = itemIndex - aVar.getStartIndex();
            if (function1B != null && function1B.invoke(Integer.valueOf(startIndex)) == w4c.INSTANCE.a()) {
                return true;
            }
        }
        return false;
    }
}
