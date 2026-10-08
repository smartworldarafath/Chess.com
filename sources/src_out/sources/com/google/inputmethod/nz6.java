package com.google.inputmethod;

import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.c;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nR\u001b\u0010\u000e\u001a\u00028\u00008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/google/android/nz6;", "T", "Lcom/google/android/c1e;", "Lkotlin/Function0;", "valueProducer", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "Lcom/google/android/a69;", "map", "a", "(Lcom/google/android/a69;)Ljava/lang/Object;", "Lkotlin/Lazy;", "b", "()Ljava/lang/Object;", "current", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class nz6<T> implements c1e<T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Lazy current;

    public nz6(Function0<? extends T> function0) {
        this.current = c.b(function0);
    }

    private final T b() {
        return (T) this.current.getValue();
    }

    @Override // com.google.inputmethod.c1e
    public T a(a69 map) {
        return b();
    }
}
