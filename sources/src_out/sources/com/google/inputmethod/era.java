package com.google.inputmethod;

import androidx.compose.p001foundation.layout.s;
import androidx.compose.ui.layout.j;
import androidx.compose.ui.layout.o;
import com.google.android.sh7;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0087\u0001\u0010\u0015\u001a\u00020\u0014*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u000e\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\f2\u0006\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/google/android/dra;", "", "mainAxisMin", "crossAxisMin", "mainAxisMax", "crossAxisMax", "arrangementSpacingInt", "Landroidx/compose/ui/layout/j;", "measureScope", "", "Lcom/google/android/dj7;", "measurables", "", "Landroidx/compose/ui/layout/o;", "placeables", "startIndex", "endIndex", "", "crossAxisOffset", "currentLineIndex", "Lcom/google/android/fj7;", "a", "(Lcom/google/android/dra;IIIIILandroidx/compose/ui/layout/j;Ljava/util/List;[Landroidx/compose/ui/layout/o;II[II)Lcom/google/android/fj7;", "foundation-layout"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class era {
    public static final fj7 a(dra draVar, int i, int i2, int i3, int i4, int i5, j jVar, List<? extends dj7> list, o[] oVarArr, int i6, int i7, int[] iArr, int i8) {
        int i9;
        char c;
        char c2;
        int i10;
        int iMax;
        int iMax2;
        dra draVar2;
        int i11;
        int i12 = i4;
        long j = i5;
        int i13 = i7 - i6;
        int[] iArr2 = new int[i13];
        int i14 = 0;
        int i15 = i6;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        float f = 0.0f;
        while (true) {
            int i21 = 1;
            if (i15 >= i7) {
                break;
            }
            dj7 dj7Var = list.get(i15);
            RowColumnParentData rowColumnParentDataD = cra.d(dj7Var);
            float fE = cra.e(rowColumnParentDataD);
            if (i18 == 0 && !cra.f(rowColumnParentDataD)) {
                i21 = i14;
            }
            if (fE > 0.0f) {
                f += fE;
                i19++;
                i15 = i15;
                j = j;
            } else {
                if (i12 != Integer.MAX_VALUE && rowColumnParentDataD != null) {
                    rowColumnParentDataD.c();
                }
                int i22 = i3 - i20;
                o oVarR0 = oVarArr[i15];
                if (oVarR0 == null) {
                    int i23 = i3 != Integer.MAX_VALUE ? i22 < 0 ? i14 : i22 : Integer.MAX_VALUE;
                    draVar2 = draVar;
                    i11 = i17;
                    oVarR0 = dj7Var.r0(dra.p(draVar2, 0, 0, i23, i12, false, 16, null));
                } else {
                    draVar2 = draVar;
                    i11 = i17;
                }
                int iF = draVar2.f(oVarR0);
                int iC = draVar2.c(oVarR0);
                iArr2[i15 - i6] = iF;
                int i24 = i22 - iF;
                if (i24 < 0) {
                    i24 = 0;
                }
                int iMin = Math.min(i5, i24);
                i20 += iF + iMin;
                int iMax3 = Math.max(i11, iC);
                oVarArr[i15] = oVarR0;
                i17 = iMax3;
                i16 = iMin;
            }
            i15++;
            i18 = i21;
            j = j;
            i14 = 0;
        }
        dra draVar3 = draVar;
        long j2 = j;
        int i25 = i17;
        if (i19 == 0) {
            i20 -= i16;
            i9 = 0;
        } else {
            long j3 = j2 * ((long) (i19 - 1));
            long jRound = ((long) ((i3 != Integer.MAX_VALUE ? i3 : i) - i20)) - j3;
            if (jRound < 0) {
                jRound = 0;
            }
            float f2 = jRound / f;
            for (int i26 = i6; i26 < i7; i26++) {
                jRound -= (long) Math.round(cra.e(cra.d(list.get(i26))) * f2);
            }
            int i27 = i6;
            int i28 = 0;
            while (i27 < i7) {
                if (oVarArr[i27] == null) {
                    dj7 dj7Var2 = list.get(i27);
                    RowColumnParentData rowColumnParentDataD2 = cra.d(dj7Var2);
                    float fE2 = cra.e(rowColumnParentDataD2);
                    if (i12 != Integer.MAX_VALUE && rowColumnParentDataD2 != null) {
                        rowColumnParentDataD2.c();
                    }
                    if (!(fE2 > 0.0f)) {
                        xw5.b("All weights <= 0 should have placeables");
                    }
                    int iB = sh7.b(jRound);
                    long j4 = jRound - ((long) iB);
                    int iMax4 = Math.max(0, Math.round(fE2 * f2) + iB);
                    if (cra.b(rowColumnParentDataD2)) {
                        c = 65535;
                        if (iMax4 != Integer.MAX_VALUE) {
                            c2 = 65535;
                            i10 = iMax4;
                        }
                        draVar3 = draVar;
                        o oVarR1 = dj7Var2.r0(draVar3.a(i10, 0, iMax4, i12, true));
                        int iF2 = draVar3.f(oVarR1);
                        int iC2 = draVar3.c(oVarR1);
                        iArr2[i27 - i6] = iF2;
                        i28 += iF2;
                        int iMax5 = Math.max(i25, iC2);
                        oVarArr[i27] = oVarR1;
                        i25 = iMax5;
                        jRound = j4;
                    } else {
                        c = 65535;
                    }
                    c2 = c;
                    i10 = 0;
                    draVar3 = draVar;
                    o oVarR2 = dj7Var2.r0(draVar3.a(i10, 0, iMax4, i12, true));
                    int iF3 = draVar3.f(oVarR2);
                    int iC3 = draVar3.c(oVarR2);
                    iArr2[i27 - i6] = iF3;
                    i28 += iF3;
                    int iMax6 = Math.max(i25, iC3);
                    oVarArr[i27] = oVarR2;
                    i25 = iMax6;
                    jRound = j4;
                }
                i27++;
                i12 = i4;
            }
            i9 = (int) (((long) i28) + j3);
            int i29 = i3 - i20;
            if (i9 < 0) {
                i9 = 0;
            }
            if (i9 > i29) {
                i9 = i29;
            }
        }
        int i30 = i25;
        if (i18 != 0) {
            iMax = 0;
            iMax2 = 0;
            for (int i31 = i6; i31 < i7; i31++) {
                o oVar = oVarArr[i31];
                Intrinsics.g(oVar);
                s sVarA = cra.a(cra.c(oVar));
                Integer numB = sVarA != null ? sVarA.b(oVar) : null;
                if (numB != null) {
                    int iIntValue = numB.intValue();
                    int iC4 = draVar3.c(oVar);
                    iMax = Math.max(iMax, iIntValue != Integer.MIN_VALUE ? numB.intValue() : 0);
                    if (iIntValue == Integer.MIN_VALUE) {
                        iIntValue = iC4;
                    }
                    iMax2 = Math.max(iMax2, iC4 - iIntValue);
                }
            }
        } else {
            iMax = 0;
            iMax2 = 0;
        }
        int i32 = i20 + i9;
        if (i32 < 0) {
            i32 = 0;
        }
        int iMax7 = Math.max(i32, i);
        int iMax8 = Math.max(i30, Math.max(i2, iMax2 + iMax));
        int[] iArr3 = new int[i13];
        draVar3.b(iMax7, iArr2, iArr3, jVar);
        return draVar3.e(oVarArr, jVar, iMax, iArr3, iMax7, iMax8, iArr, i8, i6, i7);
    }
}
