package com.google.inputmethod;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.LeadingMarginSpan;
import androidx.compose.ui.graphics.drawscope.b;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.android.sh7;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.g;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0013\b\u0001\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016Jw\u0010'\u001a\u00020&2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\u00142\b\u0010!\u001a\u0004\u0018\u00010 2\u0006\u0010\"\u001a\u00020\u00142\u0006\u0010#\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010%\u001a\u0004\u0018\u00010$H\u0016¢\u0006\u0004\b'\u0010(R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010,R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010,R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00106\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00108\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00105¨\u00069"}, d2 = {"Lcom/google/android/ji2;", "Landroid/text/style/LeadingMarginSpan;", "Lcom/google/android/xkb;", "shape", "", "bulletWidthPx", "bulletHeightPx", "gapWidthPx", "Lcom/google/android/qu0;", "brush", "alpha", "Landroidx/compose/ui/graphics/drawscope/b;", "drawStyle", "Lcom/google/android/f43;", "density", "textIndentPx", "<init>", "(Lcom/google/android/xkb;FFFLcom/google/android/qu0;FLandroidx/compose/ui/graphics/drawscope/b;Lcom/google/android/f43;F)V", "", "first", "", "getLeadingMargin", "(Z)I", "Landroid/graphics/Canvas;", "c", "Landroid/graphics/Paint;", "p", "x", "dir", "top", "baseline", "bottom", "", "text", "start", "end", "Landroid/text/Layout;", "layout", "", "drawLeadingMargin", "(Landroid/graphics/Canvas;Landroid/graphics/Paint;IIIIILjava/lang/CharSequence;IIZLandroid/text/Layout;)V", "a", "Lcom/google/android/xkb;", "b", "F", "d", "Lcom/google/android/qu0;", "e", "f", "Landroidx/compose/ui/graphics/drawscope/b;", "g", "Lcom/google/android/f43;", "h", "I", "minimumRequiredIndent", "i", "diff", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ji2 implements LeadingMarginSpan {
    public static final int j = b.a;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final xkb shape;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final float bulletWidthPx;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final float bulletHeightPx;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final qu0 brush;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final float alpha;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final b drawStyle;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final f43 density;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final int minimumRequiredIndent;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final int diff;

    public ji2(xkb xkbVar, float f, float f2, float f3, qu0 qu0Var, float f4, b bVar, f43 f43Var, float f5) {
        this.shape = xkbVar;
        this.bulletWidthPx = f;
        this.bulletHeightPx = f2;
        this.brush = qu0Var;
        this.alpha = f4;
        this.drawStyle = bVar;
        this.density = f43Var;
        int iD = sh7.d(f + f3);
        this.minimumRequiredIndent = iD;
        this.diff = sh7.d(f5) - iD;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final Unit b(ji2 ji2Var, long j2, int i, Canvas canvas, Paint paint, int i2, float f) throws NoWhenBranchMatchedException {
        jx0.d(ji2Var.shape.mo5createOutlinePq9zytI(j2, i > 0 ? LayoutDirection.Ltr : LayoutDirection.Rtl, ji2Var.density), canvas, paint, i2, f, i);
        return Unit.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // android.text.style.LeadingMarginSpan
    public void drawLeadingMargin(final Canvas c, final Paint p, int x, final int dir, int top, int baseline, int bottom, CharSequence text, int start, int end, boolean first, Layout layout) throws NoWhenBranchMatchedException {
        if (c == null) {
            return;
        }
        final float f = (top + bottom) / 2.0f;
        final int iE = g.e(x - this.minimumRequiredIndent, 0);
        Intrinsics.h(text, "null cannot be cast to non-null type android.text.Spanned");
        if (((Spanned) text).getSpanStart(this) != start || p == null) {
            return;
        }
        Paint.Style style = p.getStyle();
        jx0.f(p, this.drawStyle);
        float f2 = this.bulletWidthPx;
        final long jD = tsb.d((((long) Float.floatToRawIntBits(this.bulletHeightPx)) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32));
        jx0.e(p, this.brush, this.alpha, jD, new Function0() { // from class: com.google.android.ii2
            public final Object invoke() {
                return ji2.b(this.a, jD, dir, c, p, iE, f);
            }
        });
        p.setStyle(style);
    }

    @Override // android.text.style.LeadingMarginSpan
    public int getLeadingMargin(boolean first) {
        int i = this.diff;
        if (i >= 0) {
            return 0;
        }
        return Math.abs(i);
    }
}
