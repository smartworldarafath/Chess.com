package androidx.compose.ui.text;

import androidx.compose.ui.graphics.drawscope.DrawScope;
import com.google.inputmethod.Shadow;
import com.google.inputmethod.TextLayoutResult;
import com.google.inputmethod.eh3;
import com.google.inputmethod.ei1;
import com.google.inputmethod.hsc;
import com.google.inputmethod.nx1;
import com.google.inputmethod.qu0;
import com.google.inputmethod.uyc;
import com.google.inputmethod.vg3;
import com.google.inputmethod.w41;
import com.google.inputmethod.wrc;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001ag\u0010\u0014\u001a\u00020\u0013*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015\u001ae\u0010\"\u001a\u00020\u0013*\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 2\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\"\u0010#\u001a\u001b\u0010%\u001a\u00020\u0013*\u00020$2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b%\u0010&\u001a#\u0010(\u001a\u00020'*\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b(\u0010)¨\u0006*"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Landroidx/compose/ui/text/v;", "textMeasurer", "", "text", "Lcom/google/android/rn8;", "topLeft", "Landroidx/compose/ui/text/y;", "style", "Lcom/google/android/uyc;", "overflow", "", "softWrap", "", "maxLines", "Lcom/google/android/tsb;", "size", "Landroidx/compose/ui/graphics/e;", "blendMode", "", "b", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/text/v;Ljava/lang/String;JLandroidx/compose/ui/text/y;IZIJI)V", "Lcom/google/android/vxc;", "textLayoutResult", "Lcom/google/android/ei1;", "color", "", "alpha", "Lcom/google/android/nkb;", "shadow", "Lcom/google/android/wrc;", "textDecoration", "Landroidx/compose/ui/graphics/drawscope/b;", "drawStyle", "d", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Lcom/google/android/vxc;JJFLcom/google/android/nkb;Lcom/google/android/wrc;Landroidx/compose/ui/graphics/drawscope/b;I)V", "Lcom/google/android/eh3;", "a", "(Lcom/google/android/eh3;Lcom/google/android/vxc;)V", "Lcom/google/android/kx1;", "f", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JJ)J", "ui-text"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class w {
    private static final void a(eh3 eh3Var, TextLayoutResult textLayoutResult) {
        if (!textLayoutResult.i() || uyc.g(textLayoutResult.getLayoutInput().getOverflow(), uyc.INSTANCE.e())) {
            return;
        }
        eh3.j(eh3Var, 0.0f, 0.0f, (int) (textLayoutResult.getSize() >> 32), (int) (textLayoutResult.getSize() & 4294967295L), 0, 16, null);
    }

    public static final void b(DrawScope drawScope, v vVar, String str, long j, TextStyle textStyle, int i, boolean z, int i2, long j2, int i3) {
        TextLayoutResult textLayoutResultD = v.d(vVar, new b(str, null, 2, null), textStyle, i, z, i2, null, f(drawScope, j2, j), drawScope.getLayoutDirection(), drawScope, null, false, 1568, null);
        vg3 drawContext = drawScope.getDrawContext();
        long jD = drawContext.d();
        drawContext.b().v();
        try {
            eh3 transform = drawContext.getTransform();
            transform.c(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
            a(transform, textLayoutResultD);
            textLayoutResultD.getMultiParagraph().K(drawScope.getDrawContext().b(), (30 & 2) != 0 ? ei1.INSTANCE.i() : 0L, (30 & 4) != 0 ? null : null, (30 & 8) != 0 ? null : null, (30 & 16) == 0 ? null : null, (30 & 32) != 0 ? DrawScope.INSTANCE.a() : i3);
        } finally {
            drawContext.b().o();
            drawContext.c(jD);
        }
    }

    public static final void d(DrawScope drawScope, TextLayoutResult textLayoutResult, long j, long j2, float f, Shadow shadow, wrc wrcVar, androidx.compose.ui.graphics.drawscope.b bVar, int i) {
        Shadow shadowX = shadow == null ? textLayoutResult.getLayoutInput().getStyle().x() : shadow;
        wrc wrcVarA = wrcVar == null ? textLayoutResult.getLayoutInput().getStyle().A() : wrcVar;
        androidx.compose.ui.graphics.drawscope.b bVarI = bVar == null ? textLayoutResult.getLayoutInput().getStyle().i() : bVar;
        vg3 drawContext = drawScope.getDrawContext();
        long jD = drawContext.d();
        drawContext.b().v();
        try {
            eh3 transform = drawContext.getTransform();
            transform.c(Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (4294967295L & j2)));
            a(transform, textLayoutResult);
            qu0 qu0VarG = textLayoutResult.getLayoutInput().getStyle().g();
            if (qu0VarG == null || j != 16) {
                g multiParagraph = textLayoutResult.getMultiParagraph();
                w41 w41VarB = drawScope.getDrawContext().b();
                if (j == 16) {
                    j = textLayoutResult.getLayoutInput().getStyle().h();
                }
                multiParagraph.K(w41VarB, hsc.c(j, f), shadowX, wrcVarA, bVarI, i);
            } else {
                textLayoutResult.getMultiParagraph().M(drawScope.getDrawContext().b(), qu0VarG, !Float.isNaN(f) ? f : textLayoutResult.getLayoutInput().getStyle().d(), shadowX, wrcVarA, bVarI, i);
            }
        } finally {
            drawContext.b().o();
            drawContext.c(jD);
        }
    }

    private static final long f(DrawScope drawScope, long j, long j2) {
        int iE;
        int iRound;
        int iE2;
        int iRound2 = 0;
        if (j == 9205357640488583168L || Float.isNaN(Float.intBitsToFloat((int) (j >> 32)))) {
            iE = kotlin.ranges.g.e(Math.round((float) Math.ceil(Float.intBitsToFloat((int) (drawScope.d() >> 32)) - Float.intBitsToFloat((int) (j2 >> 32)))), 0);
            iRound = 0;
        } else {
            iRound = Math.round((float) Math.ceil(Float.intBitsToFloat((int) (j >> 32))));
            iE = iRound;
        }
        if (j == 9205357640488583168L || Float.isNaN(Float.intBitsToFloat((int) (j & 4294967295L)))) {
            iE2 = kotlin.ranges.g.e(Math.round((float) Math.ceil(Float.intBitsToFloat((int) (drawScope.d() & 4294967295L)) - Float.intBitsToFloat((int) (j2 & 4294967295L)))), 0);
        } else {
            iRound2 = Math.round((float) Math.ceil(Float.intBitsToFloat((int) (j & 4294967295L))));
            iE2 = iRound2;
        }
        return nx1.a(iRound, iE, iRound2, iE2);
    }
}
