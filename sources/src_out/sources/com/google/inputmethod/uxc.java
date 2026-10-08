package com.google.inputmethod;

import androidx.compose.ui.text.TextLayoutInput;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.b;
import androidx.compose.ui.text.font.l;
import androidx.compose.ui.text.g;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\u001ao\u0010\u0017\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u001b\u0010\u001b\u001a\u00020\u001a*\u00020\u00002\u0006\u0010\u0019\u001a\u00020\tH\u0000¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/google/android/vxc;", "Landroidx/compose/ui/text/b;", "text", "Landroidx/compose/ui/text/y;", "style", "", "Landroidx/compose/ui/text/b$d;", "Lcom/google/android/v99;", "placeholders", "", "maxLines", "", "softWrap", "Lcom/google/android/uyc;", "overflow", "Lcom/google/android/f43;", "density", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/text/font/l$b;", "fontFamilyResolver", "Lcom/google/android/kx1;", "constraints", "a", "(Lcom/google/android/vxc;Landroidx/compose/ui/text/b;Landroidx/compose/ui/text/y;Ljava/util/List;IZILcom/google/android/f43;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/text/font/l$b;J)Z", "offset", "", "b", "(Lcom/google/android/vxc;I)F", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class uxc {
    public static final boolean a(TextLayoutResult textLayoutResult, b bVar, TextStyle textStyle, List<b.Range<Placeholder>> list, int i, boolean z, int i2, f43 f43Var, LayoutDirection layoutDirection, l.b bVar2, long j) {
        TextLayoutInput layoutInput = textLayoutResult.getLayoutInput();
        if (textLayoutResult.getMultiParagraph().getIntrinsics().c() || !Intrinsics.e(layoutInput.getText(), bVar) || !layoutInput.getStyle().G(textStyle) || !Intrinsics.e(layoutInput.g(), list) || layoutInput.getMaxLines() != i || layoutInput.getSoftWrap() != z || !uyc.g(layoutInput.getOverflow(), i2) || !Intrinsics.e(layoutInput.getDensity(), f43Var) || layoutInput.getLayoutDirection() != layoutDirection || !Intrinsics.e(layoutInput.getFontFamilyResolver(), bVar2) || kx1.n(j) != kx1.n(layoutInput.getConstraints())) {
            return false;
        }
        if (z || uyc.g(i2, uyc.INSTANCE.b())) {
            return kx1.l(j) == kx1.l(layoutInput.getConstraints()) && kx1.k(j) == kx1.k(layoutInput.getConstraints());
        }
        return true;
    }

    public static final float b(TextLayoutResult textLayoutResult, int i) {
        if (i < 0 || textLayoutResult.getLayoutInput().getText().length() == 0) {
            return 0.0f;
        }
        int iMin = Math.min(textLayoutResult.getMultiParagraph().s(i), Math.min(textLayoutResult.getMultiParagraph().getMaxLines() - 1, textLayoutResult.getMultiParagraph().getLineCount() - 1));
        if (i > g.r(textLayoutResult.getMultiParagraph(), iMin, false, 2, null)) {
            return 0.0f;
        }
        return textLayoutResult.getMultiParagraph().u(iMin);
    }
}
