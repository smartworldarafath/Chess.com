package com.google.inputmethod;

import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0081@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\r\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0011\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0013\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0014"}, d2 = {"Lcom/google/android/rd3;", "", "", "packedValue", "b", "(J)J", "other", "", "a", "(JJ)I", "", "c", "(J)F", "distance", "", "e", "(J)Z", "isInLayer", "d", "isInExpandedBounds", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class rd3 {
    public static final int a(long j, long j2) {
        boolean zE = e(j);
        if (zE != e(j2)) {
            return zE ? -1 : 1;
        }
        int iSignum = (int) Math.signum(c(j) - c(j2));
        if (Math.min(c(j), c(j2)) >= 0.0f && d(j) != d(j2)) {
            return d(j) ? -1 : 1;
        }
        return iSignum;
    }

    public static long b(long j) {
        return j;
    }

    public static final float c(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static final boolean d(long j) {
        return (j & 2) != 0;
    }

    public static final boolean e(long j) {
        return (j & 1) != 0;
    }
}
