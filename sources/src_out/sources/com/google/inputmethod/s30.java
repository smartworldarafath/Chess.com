package com.google.inputmethod;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0013\b\u0016\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\u0007J\r\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\u0007J\r\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u0007R\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/google/android/s30;", "", "", "initialValue", "<init>", "(I)V", "c", "()I", "a", "b", "d", "Ljava/util/concurrent/atomic/AtomicInteger;", "Ljava/util/concurrent/atomic/AtomicInteger;", "delegate", "datastore-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class s30 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AtomicInteger delegate;

    public s30(int i) {
        this.delegate = new AtomicInteger(i);
    }

    public final int a() {
        return this.delegate.decrementAndGet();
    }

    public final int b() {
        return this.delegate.get();
    }

    public final int c() {
        return this.delegate.getAndIncrement();
    }

    public final int d() {
        return this.delegate.incrementAndGet();
    }
}
