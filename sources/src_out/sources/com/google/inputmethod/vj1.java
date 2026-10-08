package com.google.inputmethod;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0085\u0001\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u0000¢\u0006\u0004\b\u000e\u0010\u000f\" \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\r0\u00108\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lcom/google/android/ei1;", "primary", "primaryVariant", "secondary", "secondaryVariant", "background", "surface", "error", "onPrimary", "onSecondary", "onBackground", "onSurface", "onError", "Lcom/google/android/tj1;", "d", "(JJJJJJJJJJJJ)Lcom/google/android/tj1;", "Lcom/google/android/ks9;", "a", "Lcom/google/android/ks9;", "c", "()Lcom/google/android/ks9;", "LocalColors", "material"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class vj1 {
    private static final ks9<Colors> a = fs1.j(new Function0() { // from class: com.google.android.uj1
        public final Object invoke() {
            return vj1.b();
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final Colors b() {
        return e(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 4095, null);
    }

    public static final ks9<Colors> c() {
        return a;
    }

    public static final Colors d(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12) {
        return new Colors(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, true, null);
    }

    public static /* synthetic */ Colors e(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, int i, Object obj) {
        long jD = (i & 1) != 0 ? ki1.d(4284612846L) : j;
        long jD2 = (i & 2) != 0 ? ki1.d(4281794739L) : j2;
        long jD3 = (i & 4) != 0 ? ki1.d(4278442694L) : j3;
        long jD4 = (i & 8) != 0 ? ki1.d(4278290310L) : j4;
        long j13 = (i & 16) != 0 ? ei1.INSTANCE.j() : j5;
        long j14 = (i & 32) != 0 ? ei1.INSTANCE.j() : j6;
        long jD5 = (i & 64) != 0 ? ki1.d(4289724448L) : j7;
        long j15 = (i & 128) != 0 ? ei1.INSTANCE.j() : j8;
        long j16 = jD;
        long jA = (i & 256) != 0 ? ei1.INSTANCE.a() : j9;
        long jA2 = (i & 512) != 0 ? ei1.INSTANCE.a() : j10;
        long jA3 = (i & 1024) != 0 ? ei1.INSTANCE.a() : j11;
        if ((i & 2048) != 0) {
            j12 = ei1.INSTANCE.j();
        }
        return d(j16, jD2, jD3, jD4, j13, j14, jD5, j15, jA, jA2, jA3, j12);
    }
}
