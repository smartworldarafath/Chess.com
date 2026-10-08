package com.google.inputmethod;

import com.google.android.kqd;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0019\u0010\u0006\u001a\u00020\u0000*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/google/android/ei1;", "", "b", "(J)J", "Lcom/google/android/ei1$a;", "colorLong", "a", "(Lcom/google/android/ei1$a;J)J", "ui-graphics"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class ej {
    public static final long a(ei1.Companion companion, long j) {
        long j2 = 63 & j;
        if (j2 >= 16) {
            j = (j & (-64)) | (j2 + 1);
        }
        return ei1.m(kqd.c(j));
    }

    public static final long b(long j) {
        long j2 = 63 & j;
        return Long.compareUnsigned(kqd.c(j2), 16L) < 0 ? j : kqd.c(kqd.c(j & kqd.c(-64L)) | kqd.c(kqd.c(j2) - 1));
    }
}
