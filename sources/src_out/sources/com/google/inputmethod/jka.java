package com.google.inputmethod;

import androidx.concurrent.futures.AbstractResolvableFuture;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public final class jka<V> extends AbstractResolvableFuture<V> {
    private jka() {
    }

    public static <V> jka<V> y() {
        return new jka<>();
    }

    @Override // androidx.concurrent.futures.AbstractResolvableFuture
    public boolean t(V v) {
        return super.t(v);
    }

    @Override // androidx.concurrent.futures.AbstractResolvableFuture
    public boolean u(Throwable th) {
        return super.u(th);
    }
}
