package com.google.inputmethod;

import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001f\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\t\u0010\u0006\u001a\u0013\u0010\u000b\u001a\u00020\n*\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a\u0013\u0010\r\u001a\u00020\u0004*\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/google/android/g16;", "offset", "Lcom/google/android/q16;", "size", "Lcom/google/android/k16;", "b", "(JJ)Lcom/google/android/k16;", "topLeft", "bottomRight", "a", "Lcom/google/android/gba;", "d", "(Lcom/google/android/k16;)Lcom/google/android/gba;", "c", "(Lcom/google/android/gba;)Lcom/google/android/k16;", "ui-unit"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class l16 {
    public static final k16 a(long j, long j2) {
        return new k16(g16.k(j), g16.l(j), g16.k(j2), g16.l(j2));
    }

    public static final k16 b(long j, long j2) {
        return new k16(g16.k(j), g16.l(j), g16.k(j) + ((int) (j2 >> 32)), g16.l(j) + ((int) (j2 & 4294967295L)));
    }

    public static final k16 c(gba gbaVar) {
        return new k16(Math.round(gbaVar.getLeft()), Math.round(gbaVar.getTop()), Math.round(gbaVar.getRight()), Math.round(gbaVar.getBottom()));
    }

    public static final gba d(k16 k16Var) {
        return new gba(k16Var.getLeft(), k16Var.getTop(), k16Var.getRight(), k16Var.getBottom());
    }
}
