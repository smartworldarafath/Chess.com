package com.google.inputmethod;

import androidx.compose.p004runtime.p005internal.AtomicInt;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0081@\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u0088\u0001\u0007\u0092\u0001\u00020\u0006¨\u0006\u0012"}, d2 = {"Lcom/google/android/p30;", "", "", "value", "b", "(Z)Landroidx/compose/runtime/internal/AtomicInt;", "Landroidx/compose/runtime/internal/AtomicInt;", "wrapped", "a", "(Landroidx/compose/runtime/internal/AtomicInt;)Landroidx/compose/runtime/internal/AtomicInt;", "c", "(Landroidx/compose/runtime/internal/AtomicInt;)Z", "", "e", "(Landroidx/compose/runtime/internal/AtomicInt;Z)V", "newValue", "d", "(Landroidx/compose/runtime/internal/AtomicInt;Z)Z", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class p30 {
    public static AtomicInt a(AtomicInt atomicInt) {
        return atomicInt;
    }

    public static AtomicInt b(boolean z) {
        return a(new AtomicInt(z ? 1 : 0));
    }

    public static final boolean c(AtomicInt atomicInt) {
        return atomicInt.get() != 0;
    }

    public static final boolean d(AtomicInt atomicInt, boolean z) {
        return atomicInt.compareAndSet(1, z ? 1 : 0);
    }

    public static final void e(AtomicInt atomicInt, boolean z) {
        atomicInt.set(z ? 1 : 0);
    }
}
