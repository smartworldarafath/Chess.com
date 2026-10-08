package com.google.inputmethod;

import android.graphics.Matrix;
import android.os.Build;
import android.view.inputmethod.CursorAnchorInfo;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.text.x;
import com.google.android.r43;
import kotlin.Metadata;
import kotlin.ranges.g;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0005\u001ak\u0010\u0012\u001a\u00020\u0011*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u001a3\u0010\u0016\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001a;\u0010\u001a\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001a\u0010\u001b\u001a#\u0010\u001f\u001a\u00020\f*\u00020\t2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Landroid/view/inputmethod/CursorAnchorInfo$Builder;", "Lcom/google/android/cwc;", "textFieldValue", "Lcom/google/android/zn8;", "offsetMapping", "Lcom/google/android/vxc;", "textLayoutResult", "Landroid/graphics/Matrix;", "matrix", "Lcom/google/android/gba;", "innerTextFieldBounds", "decorationBoxBounds", "", "includeInsertionMarker", "includeCharacterBounds", "includeEditorBounds", "includeLineBounds", "Landroid/view/inputmethod/CursorAnchorInfo;", "b", "(Landroid/view/inputmethod/CursorAnchorInfo$Builder;Lcom/google/android/cwc;Lcom/google/android/zn8;Lcom/google/android/vxc;Landroid/graphics/Matrix;Lcom/google/android/gba;Lcom/google/android/gba;ZZZZ)Landroid/view/inputmethod/CursorAnchorInfo;", "", "selectionStart", "d", "(Landroid/view/inputmethod/CursorAnchorInfo$Builder;ILcom/google/android/zn8;Lcom/google/android/vxc;Lcom/google/android/gba;)Landroid/view/inputmethod/CursorAnchorInfo$Builder;", "startOffset", "endOffset", "a", "(Landroid/view/inputmethod/CursorAnchorInfo$Builder;IILcom/google/android/zn8;Lcom/google/android/vxc;Lcom/google/android/gba;)Landroid/view/inputmethod/CursorAnchorInfo$Builder;", "", "x", "y", "c", "(Lcom/google/android/gba;FF)Z", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class ci2 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    private static final CursorAnchorInfo.Builder a(CursorAnchorInfo.Builder builder, int i, int i2, zn8 zn8Var, TextLayoutResult textLayoutResult, gba gbaVar) {
        ?? r5;
        int iB = zn8Var.b(i);
        int iB2 = zn8Var.b(i2);
        float[] fArr = new float[(iB2 - iB) * 4];
        textLayoutResult.getMultiParagraph().c(zyc.b(iB, iB2), fArr, 0);
        for (int i3 = i; i3 < i2; i3++) {
            int iB3 = zn8Var.b(i3);
            int i4 = (iB3 - iB) * 4;
            gba gbaVar2 = new gba(fArr[i4], fArr[i4 + 1], fArr[i4 + 2], fArr[i4 + 3]);
            boolean zS = gbaVar.s(gbaVar2);
            if (!c(gbaVar, gbaVar2.getLeft(), gbaVar2.getTop()) || !c(gbaVar, gbaVar2.getRight(), gbaVar2.getBottom())) {
                r5 = zS;
                r5 = (zS ? 1 : 0) | 2;
            }
            r5 = zS;
            if (textLayoutResult.c(iB3) == ResolvedTextDirection.Rtl) {
                r5 = (r5 == true ? 1 : 0) | 4;
            }
            builder.addCharacterBounds(i3, gbaVar2.getLeft(), gbaVar2.getTop(), gbaVar2.getRight(), gbaVar2.getBottom(), r5 == true ? 1 : 0);
        }
        return builder;
    }

    @r43
    public static final CursorAnchorInfo b(CursorAnchorInfo.Builder builder, TextFieldValue textFieldValue, zn8 zn8Var, TextLayoutResult textLayoutResult, Matrix matrix, gba gbaVar, gba gbaVar2, boolean z, boolean z2, boolean z3, boolean z4) {
        builder.reset();
        builder.setMatrix(matrix);
        int iL = x.l(textFieldValue.getSelection());
        builder.setSelectionRange(iL, x.k(textFieldValue.getSelection()));
        if (z) {
            d(builder, iL, zn8Var, textLayoutResult, gbaVar);
        }
        if (z2) {
            x composition = textFieldValue.getComposition();
            int iL2 = composition != null ? x.l(composition.getPackedValue()) : -1;
            x composition2 = textFieldValue.getComposition();
            int iK = composition2 != null ? x.k(composition2.getPackedValue()) : -1;
            if (iL2 >= 0 && iL2 < iK) {
                builder.setComposingText(iL2, textFieldValue.m().subSequence(iL2, iK));
                a(builder, iL2, iK, zn8Var, textLayoutResult, gbaVar);
            }
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 33 && z3) {
            xh2.a(builder, gbaVar2);
        }
        if (i >= 34 && z4) {
            ai2.a(builder, textLayoutResult, gbaVar);
        }
        return builder.build();
    }

    private static final boolean c(gba gbaVar, float f, float f2) {
        float left = gbaVar.getLeft();
        if (f > gbaVar.getRight() || left > f) {
            return false;
        }
        return f2 <= gbaVar.getBottom() && gbaVar.getTop() <= f2;
    }

    private static final CursorAnchorInfo.Builder d(CursorAnchorInfo.Builder builder, int i, zn8 zn8Var, TextLayoutResult textLayoutResult, gba gbaVar) {
        if (i < 0) {
            return builder;
        }
        int iB = zn8Var.b(i);
        gba gbaVarE = textLayoutResult.e(iB);
        float fN = g.n(gbaVarE.getLeft(), 0.0f, (int) (textLayoutResult.getSize() >> 32));
        boolean zC = c(gbaVar, fN, gbaVarE.getTop());
        boolean zC2 = c(gbaVar, fN, gbaVarE.getBottom());
        boolean z = textLayoutResult.c(iB) == ResolvedTextDirection.Rtl;
        int i2 = (zC || zC2) ? 1 : 0;
        if (!zC || !zC2) {
            i2 |= 2;
        }
        if (z) {
            i2 |= 4;
        }
        builder.setInsertionMarkerLocation(fN, gbaVarE.getTop(), gbaVarE.getBottom(), gbaVarE.getBottom(), i2);
        return builder;
    }
}
