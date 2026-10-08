package com.google.inputmethod;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
public final class kz7 implements Function1<Long, Object> {
    final /* synthetic */ Function1<Long, Object> a;

    /* JADX WARN: Multi-variable type inference failed */
    public kz7(Function1<? super Long, Object> function1) {
        this.a = function1;
    }

    public final Object a(long j) {
        return this.a.invoke(Long.valueOf(j / 1000000));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return a(((Number) obj).longValue());
    }
}
