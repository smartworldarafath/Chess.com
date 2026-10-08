package com.google.inputmethod;

import android.graphics.Matrix;
import android.graphics.Shader;
import androidx.compose.ui.graphics.drawscope.b;
import androidx.compose.ui.text.ParagraphInfo;
import androidx.compose.ui.text.g;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a[\u0010\u0010\u001a\u00020\u000f*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001aQ\u0010\u0012\u001a\u00020\u000f*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0011¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/text/g;", "Lcom/google/android/w41;", "canvas", "Lcom/google/android/qu0;", "brush", "", "alpha", "Lcom/google/android/nkb;", "shadow", "Lcom/google/android/wrc;", "decoration", "Landroidx/compose/ui/graphics/drawscope/b;", "drawStyle", "Landroidx/compose/ui/graphics/e;", "blendMode", "", "a", "(Landroidx/compose/ui/text/g;Lcom/google/android/w41;Lcom/google/android/qu0;FLcom/google/android/nkb;Lcom/google/android/wrc;Landroidx/compose/ui/graphics/drawscope/b;I)V", "b", "ui-text"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class bm {
    public static final void a(g gVar, w41 w41Var, qu0 qu0Var, float f, Shadow shadow, wrc wrcVar, b bVar, int i) {
        w41Var.v();
        if (gVar.C().size() <= 1 || (qu0Var instanceof SolidColor)) {
            b(gVar, w41Var, qu0Var, f, shadow, wrcVar, bVar, i);
        } else {
            if (!(qu0Var instanceof jkb)) {
                throw new NoWhenBranchMatchedException();
            }
            List<ParagraphInfo> listC = gVar.C();
            int size = listC.size();
            float fMax = 0.0f;
            float height = 0.0f;
            for (int i2 = 0; i2 < size; i2++) {
                ParagraphInfo paragraphInfo = listC.get(i2);
                height += paragraphInfo.getParagraph().getHeight();
                fMax = Math.max(fMax, paragraphInfo.getParagraph().getWidth());
            }
            Shader shaderB = ((jkb) qu0Var).b(tsb.d((((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(height)) & 4294967295L)));
            Matrix matrix = new Matrix();
            shaderB.getLocalMatrix(matrix);
            List<ParagraphInfo> listC2 = gVar.C();
            int size2 = listC2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                ParagraphInfo paragraphInfo2 = listC2.get(i3);
                paragraphInfo2.getParagraph().j(w41Var, ru0.a(shaderB), f, shadow, wrcVar, bVar, i);
                w41Var.c(0.0f, paragraphInfo2.getParagraph().getHeight());
                matrix.setTranslate(0.0f, -paragraphInfo2.getParagraph().getHeight());
                shaderB.setLocalMatrix(matrix);
            }
        }
        w41Var.o();
    }

    private static final void b(g gVar, w41 w41Var, qu0 qu0Var, float f, Shadow shadow, wrc wrcVar, b bVar, int i) {
        List<ParagraphInfo> listC = gVar.C();
        int size = listC.size();
        for (int i2 = 0; i2 < size; i2++) {
            ParagraphInfo paragraphInfo = listC.get(i2);
            paragraphInfo.getParagraph().j(w41Var, qu0Var, f, shadow, wrcVar, bVar, i);
            w41Var.c(0.0f, paragraphInfo.getParagraph().getHeight());
        }
    }
}
