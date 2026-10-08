package com.google.inputmethod;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\u0005J\r\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/google/android/o30;", "", "", "initialValue", "<init>", "(Z)V", "value", "", "b", "a", "()Z", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "delegate", "datastore-preferences-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class o30 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AtomicBoolean delegate;

    public o30(boolean z) {
        this.delegate = new AtomicBoolean(z);
    }

    public final boolean a() {
        return this.delegate.get();
    }

    public final void b(boolean value) {
        this.delegate.set(value);
    }
}
