package com.google.inputmethod;

import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.b;
import androidx.compose.ui.graphics.drawscope.c;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.g;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/google/android/wyc;", "", "<init>", "()V", "Lcom/google/android/w41;", "canvas", "Lcom/google/android/vxc;", "textLayoutResult", "", "a", "(Lcom/google/android/w41;Lcom/google/android/vxc;)V", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class wyc {
    public static final wyc a = new wyc();

    private wyc() {
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:54:? A[SYNTHETIC] */
    public final void a(w41 canvas, TextLayoutResult textLayoutResult) throws Throwable {
        w41 w41Var;
        Throwable th;
        w41 w41Var2;
        float alpha;
        boolean z = textLayoutResult.i() && !uyc.g(textLayoutResult.getLayoutInput().getOverflow(), uyc.INSTANCE.e());
        if (z) {
            float size = (int) (textLayoutResult.getSize() >> 32);
            gba gbaVarC = kba.c(rn8.INSTANCE.c(), tsb.d((((long) Float.floatToRawIntBits((int) (textLayoutResult.getSize() & 4294967295L))) & 4294967295L) | (((long) Float.floatToRawIntBits(size)) << 32)));
            canvas.v();
            w41Var = null;
            w41.n(canvas, gbaVarC, 0, 2, null);
        }
        SpanStyle spanStyleY = textLayoutResult.getLayoutInput().getStyle().y();
        wrc textDecoration = spanStyleY.getTextDecoration();
        if (textDecoration == null) {
            textDecoration = wrc.INSTANCE.c();
        }
        wrc wrcVar = textDecoration;
        Shadow shadow = spanStyleY.getShadow();
        if (shadow == null) {
            shadow = Shadow.INSTANCE.a();
        }
        Shadow shadow2 = shadow;
        b drawStyle = spanStyleY.getDrawStyle();
        if (drawStyle == null) {
            drawStyle = c.b;
        }
        b bVar = drawStyle;
        try {
            qu0 qu0VarF = spanStyleY.f();
            try {
                if (qu0VarF != null) {
                    if (spanStyleY.getTextForegroundStyle() != gwc.b.b) {
                        try {
                            alpha = spanStyleY.getTextForegroundStyle().getAlpha();
                        } catch (Throwable th2) {
                            th = th2;
                            w41Var = canvas;
                            if (z) {
                                throw th;
                            }
                            w41Var.o();
                            throw th;
                        }
                    } else {
                        alpha = 1.0f;
                    }
                    w41Var2 = canvas;
                    g.N(textLayoutResult.getMultiParagraph(), w41Var2, qu0VarF, alpha, shadow2, wrcVar, bVar, 0, 64, null);
                } else {
                    w41Var2 = canvas;
                    textLayoutResult.getMultiParagraph().K(w41Var2, (30 & 2) != 0 ? ei1.INSTANCE.i() : spanStyleY.getTextForegroundStyle() != gwc.b.b ? spanStyleY.getTextForegroundStyle().getValue() : ei1.INSTANCE.a(), (30 & 4) != 0 ? null : shadow2, (30 & 8) != 0 ? null : wrcVar, (30 & 16) == 0 ? bVar : null, (30 & 32) != 0 ? DrawScope.INSTANCE.a() : 0);
                }
                if (z) {
                    w41Var2.o();
                }
            } catch (Throwable th3) {
                th = th3;
                th = th;
                if (z) {
                    throw th;
                }
                w41Var.o();
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            w41Var = canvas;
        }
    }
}
