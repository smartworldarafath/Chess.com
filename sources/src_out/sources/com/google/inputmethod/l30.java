package com.google.inputmethod;

import androidx.compose.p004runtime.p005internal.AtomicInt;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0083@\u0018\u0000 \r2\u00020\u0001:\u0001\rB\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\f\u0088\u0001\u0005\u0092\u0001\u00020\u0004¨\u0006\u000e"}, d2 = {"Lcom/google/android/l30;", "", "b", "()Landroidx/compose/runtime/internal/AtomicInt;", "Landroidx/compose/runtime/internal/AtomicInt;", "value", "c", "(Landroidx/compose/runtime/internal/AtomicInt;)Landroidx/compose/runtime/internal/AtomicInt;", "", "version", "count", "d", "(Landroidx/compose/runtime/internal/AtomicInt;II)I", "a", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class l30 {
    public static AtomicInt b() {
        return c(new AtomicInt(0));
    }

    private static AtomicInt c(AtomicInt atomicInt) {
        return atomicInt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int d(AtomicInt atomicInt, int i, int i2) {
        return ((i & 15) << 27) | (134217727 & i2);
    }
}
