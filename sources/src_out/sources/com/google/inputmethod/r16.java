package com.google.inputmethod;

import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a \u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\u0007\u001a\u00020\u0006*\u00020\u0003H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u0013\u0010\t\u001a\u00020\u0003*\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\b\u001a\u0013\u0010\n\u001a\u00020\u0003*\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\b\"\u001e\u0010\u000f\u001a\u00020\u000b*\u00020\u00038FX\u0087\u0004¢\u0006\f\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\f\u0010\b¨\u0006\u0010"}, d2 = {"", "width", "height", "Lcom/google/android/q16;", "a", "(II)J", "Lcom/google/android/tsb;", "e", "(J)J", "d", "c", "Lcom/google/android/g16;", "b", "getCenter-ozmzZPI$annotations", "(J)V", "center", "ui-unit"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class r16 {
    public static final long a(int i, int i2) {
        return q16.c((((long) i2) & 4294967295L) | (((long) i) << 32));
    }

    public static final long b(long j) {
        return g16.f((((j << 32) >> 33) & 4294967295L) | ((j >> 33) << 32));
    }

    public static final long c(long j) {
        int iRound = Math.round(Float.intBitsToFloat((int) (j >> 32)));
        return q16.c((((long) Math.round(Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (((long) iRound) << 32));
    }

    public static final long d(long j) {
        int iIntBitsToFloat = (int) Float.intBitsToFloat((int) (j >> 32));
        return q16.c((((long) ((int) Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (((long) iIntBitsToFloat) << 32));
    }

    public static final long e(long j) {
        return tsb.d((((long) Float.floatToRawIntBits((int) (j & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits((int) (j >> 32)) << 32));
    }
}
