package com.google.inputmethod;

import android.graphics.RectF;
import android.text.Layout;
import kotlin.Metadata;
import kotlin.collections.f;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.IntRange;
import kotlin.ranges.g;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\r\u001aO\u0010\r\u001a\u0004\u0018\u00010\f*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\tH\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a]\u0010\u0013\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00102\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0012\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001am\u0010\u001e\u001a\u00020\u0007*\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0011\u001a\u00020\u00102\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\tH\u0002¢\u0006\u0004\b\u001e\u0010\u001f\u001am\u0010 \u001a\u00020\u0007*\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0011\u001a\u00020\u00102\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\tH\u0002¢\u0006\u0004\b \u0010\u001f\u001a'\u0010\"\u001a\u00020\u00192\u0006\u0010!\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\"\u0010#\u001a'\u0010$\u001a\u00020\u00192\u0006\u0010!\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b$\u0010#\u001a#\u0010'\u001a\u00020\n*\u00020\u00052\u0006\u0010%\u001a\u00020\u00192\u0006\u0010&\u001a\u00020\u0019H\u0002¢\u0006\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lcom/google/android/rxc;", "Landroid/text/Layout;", "layout", "Lcom/google/android/nn6;", "layoutHelper", "Landroid/graphics/RectF;", "rect", "", "granularity", "Lkotlin/Function2;", "", "inclusionStrategy", "", "d", "(Lcom/google/android/rxc;Landroid/text/Layout;Lcom/google/android/nn6;Landroid/graphics/RectF;ILkotlin/jvm/functions/Function2;)[I", "lineIndex", "Lcom/google/android/ncb;", "segmentFinder", "getStart", "f", "(Lcom/google/android/rxc;Landroid/text/Layout;Lcom/google/android/nn6;ILandroid/graphics/RectF;Lcom/google/android/ncb;Lkotlin/jvm/functions/Function2;Z)I", "Lcom/google/android/nn6$a;", "lineStart", "lineTop", "lineBottom", "", "runLeft", "runRight", "", "horizontalBounds", "e", "(Lcom/google/android/nn6$a;Landroid/graphics/RectF;IIIFF[FLcom/google/android/ncb;Lkotlin/jvm/functions/Function2;)I", "c", "offset", "a", "(II[F)F", "b", "left", "right", "g", "(Landroid/graphics/RectF;FF)Z", "ui-text"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class txc {
    private static final float a(int i, int i2, float[] fArr) {
        return fArr[(i - i2) * 2];
    }

    private static final float b(int i, int i2, float[] fArr) {
        return fArr[((i - i2) * 2) + 1];
    }

    private static final int c(nn6.BidiRun bidiRun, RectF rectF, int i, int i2, int i3, float f, float f2, float[] fArr, ncb ncbVar, Function2<? super RectF, ? super RectF, Boolean> function2) {
        int start;
        int iD;
        if (!g(rectF, f, f2)) {
            return -1;
        }
        if ((bidiRun.getIsRtl() || rectF.right < f2) && (!bidiRun.getIsRtl() || rectF.left > f)) {
            start = bidiRun.getStart();
            int end = bidiRun.getEnd();
            while (end - start > 1) {
                int i4 = (end + start) / 2;
                float fA = a(i4, i, fArr);
                if ((bidiRun.getIsRtl() || fA <= rectF.right) && (!bidiRun.getIsRtl() || fA >= rectF.left)) {
                    start = i4;
                } else {
                    end = i4;
                }
            }
            if (bidiRun.getIsRtl()) {
                start = end;
            }
        } else {
            start = bidiRun.getEnd() - 1;
        }
        int iC = ncbVar.c(start + 1);
        if (iC == -1 || (iD = ncbVar.d(iC)) <= bidiRun.getStart()) {
            return -1;
        }
        int iE = g.e(iC, bidiRun.getStart());
        int iJ = g.j(iD, bidiRun.getEnd());
        RectF rectF2 = new RectF(0.0f, i2, 0.0f, i3);
        while (true) {
            rectF2.left = bidiRun.getIsRtl() ? a(iJ - 1, i, fArr) : a(iE, i, fArr);
            rectF2.right = bidiRun.getIsRtl() ? b(iE, i, fArr) : b(iJ - 1, i, fArr);
            if (((Boolean) function2.invoke(rectF2, rectF)).booleanValue()) {
                return iJ;
            }
            iJ = ncbVar.a(iJ);
            if (iJ == -1 || iJ <= bidiRun.getStart()) {
                return -1;
            }
            iE = g.e(ncbVar.c(iJ), bidiRun.getStart());
        }
    }

    public static final int[] d(rxc rxcVar, Layout layout, nn6 nn6Var, RectF rectF, int i, Function2<? super RectF, ? super RectF, Boolean> function2) {
        int i2;
        ncb fleVar = i == 1 ? new fle(rxcVar.G(), rxcVar.I()) : ocb.a(rxcVar.G(), rxcVar.getTextPaint());
        int lineForVertical = layout.getLineForVertical((int) rectF.top);
        if (rectF.top > rxcVar.l(lineForVertical) && (lineForVertical = lineForVertical + 1) >= rxcVar.getLineCount()) {
            return null;
        }
        int i3 = lineForVertical;
        int lineForVertical2 = layout.getLineForVertical((int) rectF.bottom);
        if (lineForVertical2 == 0 && rectF.bottom < rxcVar.w(0)) {
            return null;
        }
        int iF = f(rxcVar, layout, nn6Var, i3, rectF, fleVar, function2, true);
        while (true) {
            i2 = i3;
            if (iF != -1 || i2 >= lineForVertical2) {
                break;
            }
            i3 = i2 + 1;
            iF = f(rxcVar, layout, nn6Var, i3, rectF, fleVar, function2, true);
        }
        if (iF == -1) {
            return null;
        }
        int iF2 = f(rxcVar, layout, nn6Var, lineForVertical2, rectF, fleVar, function2, false);
        while (iF2 == -1 && i2 < lineForVertical2) {
            int i4 = lineForVertical2 - 1;
            iF2 = f(rxcVar, layout, nn6Var, i4, rectF, fleVar, function2, false);
            lineForVertical2 = i4;
        }
        if (iF2 == -1) {
            return null;
        }
        return new int[]{fleVar.c(iF + 1), fleVar.d(iF2 - 1)};
    }

    private static final int e(nn6.BidiRun bidiRun, RectF rectF, int i, int i2, int i3, float f, float f2, float[] fArr, ncb ncbVar, Function2<? super RectF, ? super RectF, Boolean> function2) {
        int start;
        int iC;
        if (!g(rectF, f, f2)) {
            return -1;
        }
        if ((bidiRun.getIsRtl() || rectF.left > f) && (!bidiRun.getIsRtl() || rectF.right < f2)) {
            start = bidiRun.getStart();
            int end = bidiRun.getEnd();
            while (end - start > 1) {
                int i4 = (end + start) / 2;
                float fA = a(i4, i, fArr);
                if ((bidiRun.getIsRtl() || fA <= rectF.left) && (!bidiRun.getIsRtl() || fA >= rectF.right)) {
                    start = i4;
                } else {
                    end = i4;
                }
            }
            if (bidiRun.getIsRtl()) {
                start = end;
            }
        } else {
            start = bidiRun.getStart();
        }
        int iD = ncbVar.d(start);
        if (iD == -1 || (iC = ncbVar.c(iD)) >= bidiRun.getEnd()) {
            return -1;
        }
        int iE = g.e(iC, bidiRun.getStart());
        int iJ = g.j(iD, bidiRun.getEnd());
        RectF rectF2 = new RectF(0.0f, i2, 0.0f, i3);
        while (true) {
            rectF2.left = bidiRun.getIsRtl() ? a(iJ - 1, i, fArr) : a(iE, i, fArr);
            rectF2.right = bidiRun.getIsRtl() ? b(iE, i, fArr) : b(iJ - 1, i, fArr);
            if (((Boolean) function2.invoke(rectF2, rectF)).booleanValue()) {
                return iE;
            }
            iE = ncbVar.b(iE);
            if (iE == -1 || iE >= bidiRun.getEnd()) {
                return -1;
            }
            iJ = g.j(ncbVar.d(iE), bidiRun.getEnd());
        }
    }

    private static final int f(rxc rxcVar, Layout layout, nn6 nn6Var, int i, RectF rectF, ncb ncbVar, Function2<? super RectF, ? super RectF, Boolean> function2, boolean z) {
        int lineTop = layout.getLineTop(i);
        int lineBottom = layout.getLineBottom(i);
        int lineStart = layout.getLineStart(i);
        int lineEnd = layout.getLineEnd(i);
        if (lineStart == lineEnd) {
            return -1;
        }
        float[] fArr = new float[(lineEnd - lineStart) * 2];
        rxcVar.b(i, fArr);
        nn6.BidiRun[] bidiRunArrD = nn6Var.d(i);
        IntRange intRangeS0 = z ? f.s0(bidiRunArrD) : g.u(f.x0(bidiRunArrD), 0);
        int iF = intRangeS0.f();
        int i2 = intRangeS0.i();
        int iJ = intRangeS0.j();
        if ((iJ > 0 && iF <= i2) || (iJ < 0 && i2 <= iF)) {
            int i3 = iF;
            while (true) {
                nn6.BidiRun bidiRun = bidiRunArrD[i3];
                float fA = bidiRun.getIsRtl() ? a(bidiRun.getEnd() - 1, lineStart, fArr) : a(bidiRun.getStart(), lineStart, fArr);
                float fB = bidiRun.getIsRtl() ? b(bidiRun.getStart(), lineStart, fArr) : b(bidiRun.getEnd() - 1, lineStart, fArr);
                int iE = z ? e(bidiRun, rectF, lineStart, lineTop, lineBottom, fA, fB, fArr, ncbVar, function2) : c(bidiRun, rectF, lineStart, lineTop, lineBottom, fA, fB, fArr, ncbVar, function2);
                if (iE >= 0) {
                    return iE;
                }
                if (i3 != i2) {
                    i3 += iJ;
                }
            }
        }
        return -1;
    }

    private static final boolean g(RectF rectF, float f, float f2) {
        return f2 >= rectF.left && f <= rectF.right;
    }
}
