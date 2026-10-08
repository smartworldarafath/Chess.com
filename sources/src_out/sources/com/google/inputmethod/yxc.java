package com.google.inputmethod;

import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import kotlin.Metadata;
import kotlin.collections.f;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\u000b\u001a\u00020\u0007*\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a\u0019\u0010\u000f\u001a\u00020\u0007*\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a5\u0010\u0016\u001a\u0004\u0018\u00010\u0015*\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00022\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u001b\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r*\u00020\nH\u0002¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u001b\u0010\u001d\u001a\u00020\u001c*\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u001d\u0010\u001e\"&\u0010&\u001a\b\u0012\u0004\u0012\u00020 0\u001f8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\b\u0010!\u0012\u0004\b$\u0010%\u001a\u0004\b\"\u0010#\"\u0014\u0010)\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006*"}, d2 = {"", "textDirectionHeuristic", "Landroid/text/TextDirectionHeuristic;", "k", "(I)Landroid/text/TextDirectionHeuristic;", "topPadding", "bottomPadding", "Lcom/google/android/t4e;", "a", "(II)J", "Lcom/google/android/rxc;", "l", "(Lcom/google/android/rxc;)J", "", "Lcom/google/android/h27;", "h", "([Lcom/google/android/h27;)J", "Landroid/text/TextPaint;", "textPaint", "frameworkTextDir", "lineHeightSpans", "Landroid/graphics/Paint$FontMetricsInt;", "g", "(Lcom/google/android/rxc;Landroid/text/TextPaint;Landroid/text/TextDirectionHeuristic;[Lcom/google/android/h27;)Landroid/graphics/Paint$FontMetricsInt;", "i", "(Lcom/google/android/rxc;)[Lcom/google/android/h27;", "Landroid/text/Layout;", "lineIndex", "", "m", "(Landroid/text/Layout;I)Z", "Ljava/lang/ThreadLocal;", "Lcom/google/android/fpc;", "Ljava/lang/ThreadLocal;", "j", "()Ljava/lang/ThreadLocal;", "getSharedTextAndroidCanvas$annotations", "()V", "SharedTextAndroidCanvas", "b", "J", "ZeroVerticalPadding", "ui-text"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class yxc {
    private static final ThreadLocal<fpc> a = new ThreadLocal<>();
    private static final long b = a(0, 0);

    public static final long a(int i, int i2) {
        return t4e.a((((long) i2) & 4294967295L) | (((long) i) << 32));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Paint.FontMetricsInt g(rxc rxcVar, TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, h27[] h27VarArr) {
        int iM = rxcVar.m() - 1;
        if (rxcVar.i().getLineStart(iM) != rxcVar.i().getLineEnd(iM) || h27VarArr == null || h27VarArr.length == 0) {
            return null;
        }
        SpannableString spannableString = new SpannableString("\u200b");
        h27 h27Var = (h27) f.o0(h27VarArr);
        spannableString.setSpan(h27Var.b(0, spannableString.length(), (iM == 0 || !h27Var.getTrimLastLineBottom()) ? h27Var.getTrimLastLineBottom() : false), 0, spannableString.length(), 33);
        StaticLayout staticLayoutA = y7c.a.a(spannableString, textPaint, Integer.MAX_VALUE, (2072512 & 8) != 0 ? 0 : 0, (2072512 & 16) != 0 ? spannableString.length() : spannableString.length(), (2072512 & 32) != 0 ? in6.a.b() : textDirectionHeuristic, (2072512 & 64) != 0 ? in6.a.a() : null, (2072512 & 128) != 0 ? Integer.MAX_VALUE : 0, (2072512 & 256) != 0 ? null : null, (2072512 & 512) != 0 ? Integer.MAX_VALUE : 0, (2072512 & 1024) != 0 ? 1.0f : 0.0f, (2072512 & 2048) != 0 ? 0.0f : 0.0f, (2072512 & 4096) != 0 ? 0 : 0, (2072512 & 8192) != 0 ? false : rxcVar.h(), (2072512 & 16384) != 0 ? true : rxcVar.e(), (32768 & 2072512) != 0 ? 0 : 0, (65536 & 2072512) != 0 ? 0 : 0, (131072 & 2072512) != 0 ? 0 : 0, (262144 & 2072512) != 0 ? 0 : 0, (524288 & 2072512) != 0 ? null : null, (2072512 & 1048576) != 0 ? null : null);
        Paint.FontMetricsInt fontMetricsInt = new Paint.FontMetricsInt();
        fontMetricsInt.ascent = staticLayoutA.getLineAscent(0);
        fontMetricsInt.descent = staticLayoutA.getLineDescent(0);
        fontMetricsInt.top = staticLayoutA.getLineTop(0);
        fontMetricsInt.bottom = staticLayoutA.getLineBottom(0);
        return fontMetricsInt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long h(h27[] h27VarArr) {
        int iMax = 0;
        int iMax2 = 0;
        for (h27 h27Var : h27VarArr) {
            if (h27Var.getFirstAscentDiff() < 0) {
                iMax = Math.max(iMax, Math.abs(h27Var.getFirstAscentDiff()));
            }
            if (h27Var.getLastDescentDiff() < 0) {
                iMax2 = Math.max(iMax, Math.abs(h27Var.getLastDescentDiff()));
            }
        }
        return (iMax == 0 && iMax2 == 0) ? b : a(iMax, iMax2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h27[] i(rxc rxcVar) {
        if (!(rxcVar.G() instanceof Spanned)) {
            return null;
        }
        CharSequence charSequenceG = rxcVar.G();
        Intrinsics.h(charSequenceG, "null cannot be cast to non-null type android.text.Spanned");
        if (!d0c.a((Spanned) charSequenceG, h27.class) && rxcVar.G().length() > 0) {
            return null;
        }
        CharSequence charSequenceG2 = rxcVar.G();
        Intrinsics.h(charSequenceG2, "null cannot be cast to non-null type android.text.Spanned");
        return (h27[]) ((Spanned) charSequenceG2).getSpans(0, rxcVar.G().length(), h27.class);
    }

    public static final ThreadLocal<fpc> j() {
        return a;
    }

    public static final TextDirectionHeuristic k(int i) {
        if (i == 0) {
            return TextDirectionHeuristics.LTR;
        }
        if (i == 1) {
            return TextDirectionHeuristics.RTL;
        }
        if (i == 2) {
            return TextDirectionHeuristics.FIRSTSTRONG_LTR;
        }
        if (i == 3) {
            return TextDirectionHeuristics.FIRSTSTRONG_RTL;
        }
        if (i != 4) {
            return i != 5 ? TextDirectionHeuristics.FIRSTSTRONG_LTR : TextDirectionHeuristics.LOCALE;
        }
        return TextDirectionHeuristics.ANYRTL_LTR;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long l(rxc rxcVar) {
        if (rxcVar.h() || rxcVar.J()) {
            return b;
        }
        TextPaint paint = rxcVar.i().getPaint();
        CharSequence text = rxcVar.i().getText();
        Rect rectC = s09.c(paint, text, rxcVar.i().getLineStart(0), rxcVar.i().getLineEnd(0));
        int lineAscent = rxcVar.i().getLineAscent(0);
        int i = rectC.top;
        int topPadding = i < lineAscent ? lineAscent - i : rxcVar.i().getTopPadding();
        if (rxcVar.m() != 1) {
            int iM = rxcVar.m() - 1;
            rectC = s09.c(paint, text, rxcVar.i().getLineStart(iM), rxcVar.i().getLineEnd(iM));
        }
        int lineDescent = rxcVar.i().getLineDescent(rxcVar.m() - 1);
        int i2 = rectC.bottom;
        int bottomPadding = i2 > lineDescent ? i2 - lineDescent : rxcVar.i().getBottomPadding();
        return (topPadding == 0 && bottomPadding == 0) ? b : a(topPadding, bottomPadding);
    }

    public static final boolean m(Layout layout, int i) {
        return layout.getEllipsisCount(i) > 0;
    }
}
