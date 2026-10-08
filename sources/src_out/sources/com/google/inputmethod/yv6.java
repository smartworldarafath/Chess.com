package com.google.inputmethod;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J/\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H&¢\u0006\u0004\b\b\u0010\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Lcom/google/android/yv6;", "", "", "index", "Lkotlin/Function1;", "", "onPrefetchFinished", "Lcom/google/android/nu6$b;", "a", "(ILkotlin/jvm/functions/Function1;)Lcom/google/android/nu6$b;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface yv6 {
    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ nu6.b b(yv6 yv6Var, int i, Function1 function1, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: schedulePrefetch");
        }
        if ((i2 & 2) != 0) {
            function1 = null;
        }
        return yv6Var.a(i, function1);
    }

    nu6.b a(int index, Function1<Object, Unit> onPrefetchFinished);
}
