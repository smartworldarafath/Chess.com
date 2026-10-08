package com.google.inputmethod;

import androidx.compose.p004runtime.p005internal.AtomicInt;
import androidx.compose.p004runtime.snapshots.e;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b!\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/google/android/b7c;", "Lcom/google/android/a7c;", "<init>", "()V", "Landroidx/compose/runtime/snapshots/e;", "reader", "", "m", "(I)V", "", "g", "(I)Z", "Landroidx/compose/runtime/internal/AtomicInt;", "a", "Landroidx/compose/runtime/internal/AtomicInt;", "readerKind", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class b7c implements a7c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AtomicInt readerKind = new AtomicInt(0);

    public final boolean g(int reader) {
        return (reader & e.a(this.readerKind.get())) != 0;
    }

    public final void m(int reader) {
        int iA;
        do {
            iA = e.a(this.readerKind.get());
            if ((iA & reader) != 0) {
                return;
            }
        } while (!this.readerKind.compareAndSet(iA, e.a(iA | reader)));
    }
}
