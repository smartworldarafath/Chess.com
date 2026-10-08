package com.google.inputmethod;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0004\u001a\u0017\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0006\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0007\u0010\u0004¨\u0006\b"}, d2 = {"", "message", "", "b", "(Ljava/lang/String;)V", "c", "d", "a", "collection"}, k = 2, mv = {1, lo6.HASACTION_FIELD_NUMBER, 0}, xi = 48)
public final class qra {
    public static final void a(String str) {
        Intrinsics.checkNotNullParameter(str, "message");
        throw new IllegalArgumentException(str);
    }

    public static final void b(String str) {
        Intrinsics.checkNotNullParameter(str, "message");
        throw new IllegalStateException(str);
    }

    public static final void c(String str) {
        Intrinsics.checkNotNullParameter(str, "message");
        throw new IndexOutOfBoundsException(str);
    }

    public static final void d(String str) {
        Intrinsics.checkNotNullParameter(str, "message");
        throw new NoSuchElementException(str);
    }
}
