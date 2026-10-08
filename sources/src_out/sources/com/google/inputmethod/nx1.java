package com.google.inputmethod;

import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a\u001f\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\b\u0010\t\u001a/\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0017\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a7\u0010\u0013\u001a\u00020\u000e2\b\b\u0002\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0013\u0010\u0010\u001a\u0019\u0010\u0015\u001a\u00020\u000e*\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000e¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u001b\u0010\u0018\u001a\u00020\u0017*\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u0018\u0010\u0016\u001a\u001b\u0010\u001a\u001a\u00020\u0000*\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u001b\u0010\u001d\u001a\u00020\u0000*\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u001d\u0010\u001b\u001a'\u0010 \u001a\u00020\u000e*\u00020\u000e2\b\b\u0002\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u001f\u001a\u00020\u0000H\u0007¢\u0006\u0004\b \u0010!¨\u0006\""}, d2 = {"", "widthVal", "heightVal", "", "k", "(II)V", "size", "", "l", "(I)Ljava/lang/Void;", "minWidth", "maxWidth", "minHeight", "maxHeight", "Lcom/google/android/kx1;", "h", "(IIII)J", "c", "(I)I", "a", "otherConstraints", "e", "(JJ)J", "Lcom/google/android/q16;", "d", "width", "g", "(JI)I", "height", "f", "horizontal", "vertical", "i", "(JII)J", "ui-unit"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class nx1 {
    public static final long a(int i, int i2, int i3, int i4) {
        if (!((i3 >= 0) & (i2 >= i) & (i4 >= i3) & (i >= 0))) {
            bx5.a("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
        }
        return h(i, i2, i3, i4);
    }

    public static /* synthetic */ long b(int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = 0;
        }
        if ((i5 & 2) != 0) {
            i2 = Integer.MAX_VALUE;
        }
        if ((i5 & 4) != 0) {
            i3 = 0;
        }
        if ((i5 & 8) != 0) {
            i4 = Integer.MAX_VALUE;
        }
        return a(i, i2, i3, i4);
    }

    public static final int c(int i) {
        if (i < 8191) {
            return 13;
        }
        if (i < 32767) {
            return 15;
        }
        if (i < 65535) {
            return 16;
        }
        return i < 262143 ? 18 : 255;
    }

    public static final long d(long j, long j2) {
        int i = (int) (j2 >> 32);
        int iN = kx1.n(j);
        int iL = kx1.l(j);
        if (i < iN) {
            i = iN;
        }
        if (i <= iL) {
            iL = i;
        }
        int i2 = (int) (j2 & 4294967295L);
        int iM = kx1.m(j);
        int iK = kx1.k(j);
        if (i2 < iM) {
            i2 = iM;
        }
        if (i2 <= iK) {
            iK = i2;
        }
        return q16.c((((long) iL) << 32) | (((long) iK) & 4294967295L));
    }

    public static final long e(long j, long j2) {
        int iN = kx1.n(j);
        int iL = kx1.l(j);
        int iM = kx1.m(j);
        int iK = kx1.k(j);
        int iN2 = kx1.n(j2);
        if (iN2 < iN) {
            iN2 = iN;
        }
        if (iN2 > iL) {
            iN2 = iL;
        }
        int iL2 = kx1.l(j2);
        if (iL2 >= iN) {
            iN = iL2;
        }
        if (iN <= iL) {
            iL = iN;
        }
        int iM2 = kx1.m(j2);
        if (iM2 < iM) {
            iM2 = iM;
        }
        if (iM2 > iK) {
            iM2 = iK;
        }
        int iK2 = kx1.k(j2);
        if (iK2 >= iM) {
            iM = iK2;
        }
        if (iM <= iK) {
            iK = iM;
        }
        return a(iN2, iL, iM2, iK);
    }

    public static final int f(long j, int i) {
        int iM = kx1.m(j);
        int iK = kx1.k(j);
        if (i < iM) {
            i = iM;
        }
        return i > iK ? iK : i;
    }

    public static final int g(long j, int i) {
        int iN = kx1.n(j);
        int iL = kx1.l(j);
        if (i < iN) {
            i = iN;
        }
        return i > iL ? iL : i;
    }

    public static final long h(int i, int i2, int i3, int i4) {
        int i5 = i4 == Integer.MAX_VALUE ? i3 : i4;
        int iC = c(i5);
        int i6 = i2 == Integer.MAX_VALUE ? i : i2;
        int iC2 = c(i6);
        if (iC + iC2 > 31) {
            k(i6, i5);
        }
        int i7 = i2 + 1;
        int i8 = i4 + 1;
        int i9 = iC2 - 13;
        return kx1.b((((long) (i7 & (~(i7 >> 31)))) << 33) | ((long) ((i9 >> 1) + (i9 & 1))) | (((long) i) << 2) | (((long) i3) << (iC2 + 2)) | (((long) (i8 & (~(i8 >> 31)))) << (iC2 + 33)));
    }

    public static final long i(long j, int i, int i2) {
        int iN = kx1.n(j) + i;
        if (iN < 0) {
            iN = 0;
        }
        int iL = kx1.l(j);
        if (iL != Integer.MAX_VALUE && (iL = iL + i) < 0) {
            iL = 0;
        }
        int iM = kx1.m(j) + i2;
        if (iM < 0) {
            iM = 0;
        }
        int iK = kx1.k(j);
        return a(iN, iL, iM, (iK == Integer.MAX_VALUE || (iK = iK + i2) >= 0) ? iK : 0);
    }

    public static /* synthetic */ long j(long j, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return i(j, i, i2);
    }

    public static final void k(int i, int i2) {
        throw new IllegalArgumentException("Can't represent a width of " + i + " and height of " + i2 + " in Constraints");
    }

    public static final Void l(int i) {
        throw new IllegalArgumentException("Can't represent a size of " + i + " in Constraints");
    }
}
