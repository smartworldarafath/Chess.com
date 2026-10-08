package com.google.inputmethod;

import android.view.inputmethod.CursorAnchorInfo;
import kotlin.Metadata;
import kotlin.ranges.g;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/google/android/bi2;", "", "<init>", "()V", "Landroid/view/inputmethod/CursorAnchorInfo$Builder;", "builder", "Lcom/google/android/vxc;", "textLayoutResult", "Lcom/google/android/gba;", "innerTextFieldBounds", "a", "(Landroid/view/inputmethod/CursorAnchorInfo$Builder;Lcom/google/android/vxc;Lcom/google/android/gba;)Landroid/view/inputmethod/CursorAnchorInfo$Builder;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class bi2 {
    public static final bi2 a = new bi2();

    private bi2() {
    }

    public static final CursorAnchorInfo.Builder a(CursorAnchorInfo.Builder builder, TextLayoutResult textLayoutResult, gba innerTextFieldBounds) {
        int iE;
        int iO;
        int iO2;
        if (!innerTextFieldBounds.r() && (iO = g.o(textLayoutResult.r(innerTextFieldBounds.getTop()), 0, (iE = g.e(textLayoutResult.n() - 1, 0)))) <= (iO2 = g.o(textLayoutResult.r(innerTextFieldBounds.getBottom()), 0, iE))) {
            while (true) {
                builder.addVisibleLineBounds(textLayoutResult.s(iO), textLayoutResult.v(iO), textLayoutResult.t(iO), textLayoutResult.m(iO));
                if (iO == iO2) {
                    break;
                }
                iO++;
            }
        }
        return builder;
    }
}
