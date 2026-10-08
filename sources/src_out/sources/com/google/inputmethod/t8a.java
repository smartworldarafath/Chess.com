package com.google.inputmethod;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/google/android/t8a;", "T", "Lcom/google/android/o6c;", "", "readException", "", "version", "<init>", "(Ljava/lang/Throwable;I)V", "b", "Ljava/lang/Throwable;", "()Ljava/lang/Throwable;", "datastore-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class t8a<T> extends o6c<T> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Throwable readException;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t8a(Throwable th, int i) {
        super(i, null);
        Intrinsics.checkNotNullParameter(th, "readException");
        this.readException = th;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Throwable getReadException() {
        return this.readException;
    }
}
