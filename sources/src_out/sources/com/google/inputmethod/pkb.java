package com.google.inputmethod;

import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bv\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0001"}, d2 = {"Lcom/google/android/pkb;", "", "Lcom/google/android/xkb;", "shape", "Lcom/google/android/okb;", "shadow", "Lcom/google/android/qx5;", "a", "(Lcom/google/android/xkb;Lcom/google/android/okb;)Lcom/google/android/qx5;", "Lcom/google/android/kj3;", "d", "(Lcom/google/android/xkb;Lcom/google/android/okb;)Lcom/google/android/kj3;", "", "b", "()V", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface pkb {
    default qx5 a(xkb shape, Shadow shadow) {
        return new qx5(shape, shadow);
    }

    default void b() {
    }

    default kj3 d(xkb shape, Shadow shadow) {
        return new kj3(shape, shadow);
    }
}
