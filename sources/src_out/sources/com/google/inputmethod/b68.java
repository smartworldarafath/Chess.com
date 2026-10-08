package com.google.inputmethod;

import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\u001a'\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a'\u0010\r\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\r\u0010\u000e\u001aO\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001a\u001aW\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001b\u0010\u001c\u001aW\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001d\u0010\u001c\u001a?\u0010$\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020\u00182\u0006\u0010#\u001a\u00020\u0016H\u0000¢\u0006\u0004\b$\u0010%\u001a#\u0010&\u001a\u00020\n*\u00020\u00162\u0006\u0010&\u001a\u00020\u00002\u0006\u0010'\u001a\u00020\u0000H\u0002¢\u0006\u0004\b&\u0010(¨\u0006)"}, d2 = {"", "oldSize", "newSize", "Lcom/google/android/aa3;", "cb", "Lcom/google/android/s16;", "d", "(IILcom/google/android/aa3;)Lcom/google/android/s16;", "diagonals", "callback", "", "b", "(Lcom/google/android/s16;Lcom/google/android/aa3;)V", "e", "(IILcom/google/android/aa3;)V", "oldStart", "oldEnd", "newStart", "newEnd", "Lcom/google/android/q71;", "forward", "backward", "", "snake", "", "h", "(IIIILcom/google/android/aa3;[I[I[I)Z", "g", "(IIIILcom/google/android/aa3;[I[II[I)Z", "c", "startX", "startY", "endX", "endY", "reverse", "data", "f", "(IIIIZ[I)V", "i", "j", "([III)V", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class b68 {
    private static final void b(s16 s16Var, aa3 aa3Var) {
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < s16Var.getLastIndex()) {
            int i4 = i + 2;
            int iB = s16Var.b(i) - s16Var.b(i4);
            int iB2 = s16Var.b(i + 1) - s16Var.b(i4);
            int iB3 = s16Var.b(i4);
            i += 3;
            while (i2 < iB) {
                aa3Var.b(i3, i2);
                i2++;
            }
            while (i3 < iB2) {
                aa3Var.c(i3);
                i3++;
            }
            while (true) {
                int i5 = iB3 - 1;
                if (iB3 > 0) {
                    aa3Var.d(i2, i3);
                    i2++;
                    i3++;
                    iB3 = i5;
                }
            }
        }
    }

    private static final boolean c(int i, int i2, int i3, int i4, aa3 aa3Var, int[] iArr, int[] iArr2, int i5, int[] iArr3) {
        int iB;
        int i6;
        int i7;
        int i8 = (i2 - i) - (i4 - i3);
        boolean z = (i8 & 1) == 0;
        int i9 = -i5;
        for (int i10 = i9; i10 <= i5; i10 += 2) {
            if (i10 == i9 || (i10 != i5 && q71.b(iArr2, i10 + 1) < q71.b(iArr2, i10 - 1))) {
                iB = q71.b(iArr2, i10 + 1);
                i6 = iB;
            } else {
                iB = q71.b(iArr2, i10 - 1);
                i6 = iB - 1;
            }
            int i11 = i4 - ((i2 - i6) - i10);
            int i12 = ((i5 != 0 ? 1 : 0) & (i6 == iB ? 1 : 0)) + i11;
            while (true) {
                if (i6 <= i || i11 <= i3) {
                    break;
                }
                if (!aa3Var.a(i6 - 1, i11 - 1)) {
                    break;
                }
                i6--;
                i11--;
            }
            q71.d(iArr2, i10, i6);
            if (z && (i7 = i8 - i10) >= i9 && i7 <= i5) {
                if (q71.b(iArr, i7) >= i6) {
                    f(i6, i11, iB, i12, true, iArr3);
                    return true;
                }
            }
        }
        return false;
    }

    private static final s16 d(int i, int i2, aa3 aa3Var) {
        char c = 1;
        int i3 = ((i + i2) + 1) / 2;
        s16 s16Var = new s16(i3 * 3);
        s16 s16Var2 = new s16(i3 * 4);
        s16Var2.h(0, i, 0, i2);
        int i4 = (i3 * 2) + 1;
        int[] iArrA = q71.a(new int[i4]);
        int[] iArrA2 = q71.a(new int[i4]);
        int[] iArrB = yvb.b(new int[5]);
        while (s16Var2.d()) {
            int iF = s16Var2.f();
            int iF2 = s16Var2.f();
            int iF3 = s16Var2.f();
            int iF4 = s16Var2.f();
            iArrB = iArrB;
            if (h(iF4, iF3, iF2, iF, aa3Var, iArrA, iArrA2, iArrB)) {
                char c2 = c;
                if (Math.min(iArrB[2] - iArrB[0], iArrB[3] - iArrB[c]) > 0) {
                    yvb.a(iArrB, s16Var);
                }
                s16Var2.h(iF4, iArrB[0], iF2, iArrB[c2]);
                s16Var2.h(iArrB[2], iF3, iArrB[3], iF);
                c = c2;
            }
        }
        s16Var.k();
        s16Var.g(i, i2, 0);
        return s16Var;
    }

    public static final void e(int i, int i2, aa3 aa3Var) {
        b(d(i, i2, aa3Var), aa3Var);
    }

    public static final void f(int i, int i2, int i3, int i4, boolean z, int[] iArr) {
        if (iArr.length < 5) {
            return;
        }
        iArr[0] = i;
        iArr[1] = i2;
        iArr[2] = i3;
        iArr[3] = i4;
        iArr[4] = z ? 1 : 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final boolean g(int i, int i2, int i3, int i4, aa3 aa3Var, int[] iArr, int[] iArr2, int i5, int[] iArr3) {
        int iB;
        int i6;
        boolean z;
        int i7 = (i2 - i) - (i4 - i3);
        boolean z2 = true;
        boolean z3 = (Math.abs(i7) & 1) == 1;
        int i8 = -i5;
        int i9 = i8;
        while (i9 <= i5) {
            if (i9 == i8 || (i9 != i5 && q71.b(iArr, i9 + 1) > q71.b(iArr, i9 - 1))) {
                iB = q71.b(iArr, i9 + 1);
                i6 = iB;
            } else {
                iB = q71.b(iArr, i9 - 1);
                i6 = iB + 1;
            }
            int i10 = (i3 + (i6 - i)) - i9;
            int i11 = i10 - ((i5 != 0 ? z2 : 0) & (i6 == iB ? z2 : 0));
            while (true) {
                if (i6 < i2 && i10 < i4) {
                    if (!aa3Var.a(i6, i10)) {
                        break;
                    }
                    i6++;
                    i10++;
                } else {
                    break;
                }
            }
            q71.d(iArr, i9, i6);
            if (z3) {
                int i12 = i7 - i9;
                z = z2;
                if (i12 >= i8 + 1 && i12 <= i5 - 1) {
                    if (q71.b(iArr2, i12) <= i6) {
                        f(iB, i11, i6, i10, false, iArr3);
                        return z;
                    }
                }
                i9 += 2;
                z2 = z;
            } else {
                z = z2;
            }
            i9 += 2;
            z2 = z;
        }
        return false;
    }

    private static final boolean h(int i, int i2, int i3, int i4, aa3 aa3Var, int[] iArr, int[] iArr2, int[] iArr3) {
        int i5 = i2 - i;
        int i6 = i4 - i3;
        if (i5 >= 1 && i6 >= 1) {
            int i7 = ((i5 + i6) + 1) / 2;
            int[] iArr4 = iArr;
            q71.d(iArr4, 1, i);
            int[] iArr5 = iArr2;
            q71.d(iArr5, 1, i2);
            int i8 = 0;
            while (i8 < i7) {
                if (g(i, i2, i3, i4, aa3Var, iArr4, iArr5, i8, iArr3) || c(i, i2, i3, i4, aa3Var, iArr, iArr2, i8, iArr3)) {
                    return true;
                }
                i8++;
                iArr4 = iArr;
                iArr5 = iArr2;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(int[] iArr, int i, int i2) {
        int i3 = iArr[i];
        iArr[i] = iArr[i2];
        iArr[i2] = i3;
    }
}
