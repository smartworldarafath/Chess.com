package com.google.inputmethod;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\t¨\u0006\n"}, d2 = {"Lcom/google/android/ua4;", "T", "Lcom/google/android/o6c;", "", "finalException", "<init>", "(Ljava/lang/Throwable;)V", "b", "Ljava/lang/Throwable;", "()Ljava/lang/Throwable;", "datastore-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ua4<T> extends o6c<T> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Throwable finalException;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ua4(Throwable th) {
        super(Integer.MAX_VALUE, null);
        Intrinsics.checkNotNullParameter(th, "finalException");
        this.finalException = th;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Throwable getFinalException() {
        return this.finalException;
    }
}
