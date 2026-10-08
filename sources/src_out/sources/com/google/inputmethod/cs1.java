package com.google.inputmethod;

import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a%\u0010\u0004\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "Lcom/google/android/bs1;", "Lcom/google/android/zr1;", "local", "a", "(Lcom/google/android/bs1;Lcom/google/android/zr1;)Ljava/lang/Object;", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class cs1 {
    public static final <T> T a(bs1 bs1Var, zr1<T> zr1Var) {
        if (!bs1Var.getNode().getIsAttached()) {
            zw5.c("Cannot read CompositionLocal because the Modifier node is not currently attached.");
        }
        return (T) y23.q(bs1Var).getCompositionLocalMap().a(zr1Var);
    }
}
