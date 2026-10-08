package com.google.inputmethod;

import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a=\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000¢\u0006\u0004\b\b\u0010\t\u001a5\u0010\f\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r\u001a%\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001d\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0012\u0010\u0013\u001a=\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0014\u001a\u00020\n2\b\b\u0002\u0010\u0015\u001a\u00020\n2\b\b\u0002\u0010\u0016\u001a\u00020\n2\b\b\u0002\u0010\u0017\u001a\u00020\n¢\u0006\u0004\b\u0018\u0010\u0019\"\u0015\u0010\u001c\u001a\u00020\u000e*\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b\"\u0015\u0010 \u001a\u00020\u001d*\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"", "left", "top", "right", "bottom", "radiusX", "radiusY", "Lcom/google/android/dqa;", "a", "(FFFFFF)Lcom/google/android/dqa;", "Lcom/google/android/aa2;", "cornerRadius", "d", "(FFFFJ)Lcom/google/android/dqa;", "Lcom/google/android/gba;", "rect", "b", "(Lcom/google/android/gba;FF)Lcom/google/android/dqa;", "e", "(Lcom/google/android/gba;J)Lcom/google/android/dqa;", "topLeft", "topRight", "bottomRight", "bottomLeft", "c", "(Lcom/google/android/gba;JJJJ)Lcom/google/android/dqa;", "f", "(Lcom/google/android/dqa;)Lcom/google/android/gba;", "boundingRect", "", "g", "(Lcom/google/android/dqa;)Z", "isSimple", "ui-geometry"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class eqa {
    public static final dqa a(float f, float f2, float f3, float f4, float f5, float f6) {
        long jB = aa2.b((((long) Float.floatToRawIntBits(f5)) << 32) | (((long) Float.floatToRawIntBits(f6)) & 4294967295L));
        return new dqa(f, f2, f3, f4, jB, jB, jB, jB, null);
    }

    public static final dqa b(gba gbaVar, float f, float f2) {
        return a(gbaVar.getLeft(), gbaVar.getTop(), gbaVar.getRight(), gbaVar.getBottom(), f, f2);
    }

    public static final dqa c(gba gbaVar, long j, long j2, long j3, long j4) {
        return new dqa(gbaVar.getLeft(), gbaVar.getTop(), gbaVar.getRight(), gbaVar.getBottom(), j, j2, j3, j4, null);
    }

    public static final dqa d(float f, float f2, float f3, float f4, long j) {
        return a(f, f2, f3, f4, Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
    }

    public static final dqa e(gba gbaVar, long j) {
        return b(gbaVar, Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
    }

    public static final gba f(dqa dqaVar) {
        return new gba(dqaVar.getLeft(), dqaVar.getTop(), dqaVar.getRight(), dqaVar.getBottom());
    }

    public static final boolean g(dqa dqaVar) {
        long topLeftCornerRadius = dqaVar.getTopLeftCornerRadius();
        return (topLeftCornerRadius >>> 32) == (topLeftCornerRadius & 4294967295L) && dqaVar.getTopLeftCornerRadius() == dqaVar.getTopRightCornerRadius() && dqaVar.getTopLeftCornerRadius() == dqaVar.getBottomRightCornerRadius() && dqaVar.getTopLeftCornerRadius() == dqaVar.getBottomLeftCornerRadius();
    }
}
