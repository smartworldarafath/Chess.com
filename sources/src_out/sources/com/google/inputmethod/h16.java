package com.google.inputmethod;

import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a \u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001c\u0010\b\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0003H\u0087\u0002¢\u0006\u0004\b\b\u0010\t\u001a\u001c\u0010\n\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0003H\u0087\u0002¢\u0006\u0004\b\n\u0010\t\u001a\u0013\u0010\u000b\u001a\u00020\u0003*\u00020\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"", "x", "y", "Lcom/google/android/g16;", "a", "(II)J", "Lcom/google/android/rn8;", "offset", "c", "(JJ)J", "b", "d", "(J)J", "ui-unit"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class h16 {
    public static final long a(int i, int i2) {
        return g16.f((((long) i2) & 4294967295L) | (((long) i) << 32));
    }

    public static final long b(long j, long j2) {
        return rn8.e((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32)) - g16.k(j2))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) - g16.l(j2))) & 4294967295L));
    }

    public static final long c(long j, long j2) {
        return rn8.e((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32)) + g16.k(j2))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) + g16.l(j2))) & 4294967295L));
    }

    public static final long d(long j) {
        int iRound = Math.round(Float.intBitsToFloat((int) (j >> 32)));
        return g16.f((((long) Math.round(Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (((long) iRound) << 32));
    }
}
