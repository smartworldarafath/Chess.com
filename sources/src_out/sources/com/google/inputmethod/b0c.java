package com.google.inputmethod;

import android.graphics.Typeface;
import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LeadingMarginSpan;
import android.text.style.MetricAffectingSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.ScaleXSpan;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.b;
import androidx.compose.ui.text.c;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.font.l;
import androidx.compose.ui.text.font.t;
import androidx.compose.ui.text.font.u;
import com.google.android.ps4;
import com.google.android.rs4;
import com.google.android.sh7;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.f;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000Ø\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\u001a+\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a-\u0010\u000f\u001a\u00020\u0006*\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001aC\u0010\u0015\u001a\u00020\u0006*\u00020\u00002\u0014\u0010\u0014\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00130\u00120\u00112\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a'\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0019\u0010\u001a\u001a3\u0010\u001e\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u00172\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u001cH\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001a+\u0010 \u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u00172\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b \u0010!\u001a'\u0010\"\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u00172\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\"\u0010\u001a\u001a\u0017\u0010$\u001a\u00020#2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b$\u0010%\u001aa\u0010/\u001a\u00020\u0006*\u00020\u00002\u0006\u0010'\u001a\u00020&2\u0014\u0010\u0014\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00130\u00120\u00112\u0006\u0010\u000e\u001a\u00020\r2&\u0010.\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010)\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020-0(H\u0000¢\u0006\u0004\b/\u00100\u001a3\u00103\u001a\u00020\u0006*\u00020\u00002\u0006\u00102\u001a\u0002012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b3\u00104\u001aY\u00105\u001a\u00020\u0006*\u00020\u00002\u0006\u0010'\u001a\u00020&2\u0014\u0010\u0014\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00130\u00120\u00112&\u0010.\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010)\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020-0(H\u0002¢\u0006\u0004\b5\u00106\u001aM\u0010;\u001a\u00020\u00062\b\u00107\u001a\u0004\u0018\u0001012\u0012\u00108\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002010\u00120\u00112\u001e\u0010:\u001a\u001a\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000609H\u0000¢\u0006\u0004\b;\u0010<\u001a!\u0010?\u001a\u0004\u0018\u00010>2\u0006\u0010=\u001a\u00020\u00172\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b?\u0010@\u001a-\u0010C\u001a\u00020\u0006*\u00020\u00002\b\u0010B\u001a\u0004\u0018\u00010A2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002¢\u0006\u0004\bC\u0010D\u001a-\u0010G\u001a\u00020\u0006*\u00020\u00002\b\u0010F\u001a\u0004\u0018\u00010E2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002¢\u0006\u0004\bG\u0010H\u001a+\u0010K\u001a\u00020\u0006*\u00020\u00002\u0006\u0010J\u001a\u00020I2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000¢\u0006\u0004\bK\u0010L\u001a-\u0010O\u001a\u00020\u0006*\u00020\u00002\b\u0010N\u001a\u0004\u0018\u00010M2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000¢\u0006\u0004\bO\u0010P\u001a-\u0010S\u001a\u00020\u0006*\u00020\u00002\b\u0010R\u001a\u0004\u0018\u00010Q2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002¢\u0006\u0004\bS\u0010T\u001a-\u0010W\u001a\u00020\u0006*\u00020\u00002\b\u0010V\u001a\u0004\u0018\u00010U2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002¢\u0006\u0004\bW\u0010X\u001a3\u0010Z\u001a\u00020\u0006*\u00020\u00002\u0006\u0010Y\u001a\u00020\u00172\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000¢\u0006\u0004\bZ\u0010[\u001a-\u0010^\u001a\u00020\u0006*\u00020\u00002\b\u0010]\u001a\u0004\u0018\u00010\\2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000¢\u0006\u0004\b^\u0010_\u001a+\u0010`\u001a\u00020\u0006*\u00020\u00002\u0006\u0010J\u001a\u00020I2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000¢\u0006\u0004\b`\u0010L\u001a-\u0010c\u001a\u00020\u0006*\u00020\u00002\b\u0010b\u001a\u0004\u0018\u00010a2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002¢\u0006\u0004\bc\u0010d\u001a5\u0010h\u001a\u00020\u0006*\u00020\u00002\b\u0010f\u001a\u0004\u0018\u00010e2\u0006\u0010g\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002¢\u0006\u0004\bh\u0010i\u001a\u0013\u0010j\u001a\u00020#*\u00020&H\u0002¢\u0006\u0004\bj\u0010k\u001a\u001d\u0010m\u001a\u000201*\u0004\u0018\u0001012\u0006\u0010l\u001a\u000201H\u0002¢\u0006\u0004\bm\u0010n\"\u0018\u0010q\u001a\u00020#*\u0002018BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bo\u0010p¨\u0006r"}, d2 = {"Landroid/text/Spannable;", "", "span", "", "start", "end", "", "y", "(Landroid/text/Spannable;Ljava/lang/Object;II)V", "Lcom/google/android/owc;", "textIndent", "", "contextFontSize", "Lcom/google/android/f43;", "density", "C", "(Landroid/text/Spannable;Lcom/google/android/owc;FLcom/google/android/f43;)V", "", "Landroidx/compose/ui/text/b$d;", "Landroidx/compose/ui/text/b$a;", "annotations", "m", "(Landroid/text/Spannable;Ljava/util/List;FLcom/google/android/f43;Lcom/google/android/owc;)V", "Lcom/google/android/b0d;", "size", "h", "(JFLcom/google/android/f43;)F", "lineHeight", "Lcom/google/android/g27;", "lineHeightStyle", "u", "(Landroid/text/Spannable;JFLcom/google/android/f43;Lcom/google/android/g27;)V", "v", "(Landroid/text/Spannable;JFLcom/google/android/f43;)V", "i", "", "f", "(Lcom/google/android/f43;)Z", "Landroidx/compose/ui/text/y;", "contextTextStyle", "Lkotlin/Function4;", "Landroidx/compose/ui/text/font/l;", "Landroidx/compose/ui/text/font/x;", "Landroidx/compose/ui/text/font/t;", "Landroidx/compose/ui/text/font/u;", "Landroid/graphics/Typeface;", "resolveTypeface", "A", "(Landroid/text/Spannable;Landroidx/compose/ui/text/y;Ljava/util/List;Lcom/google/android/f43;Lcom/google/android/rs4;)V", "Landroidx/compose/ui/text/r;", "style", "z", "(Landroid/text/Spannable;Landroidx/compose/ui/text/r;IILcom/google/android/f43;)V", "p", "(Landroid/text/Spannable;Landroidx/compose/ui/text/y;Ljava/util/List;Lcom/google/android/rs4;)V", "contextFontSpanStyle", "spanStyles", "Lkotlin/Function3;", "block", "c", "(Landroidx/compose/ui/text/r;Ljava/util/List;Lcom/google/android/ps4;)V", "letterSpacing", "Landroid/text/style/MetricAffectingSpan;", "b", "(JLcom/google/android/f43;)Landroid/text/style/MetricAffectingSpan;", "Lcom/google/android/nkb;", "shadow", "x", "(Landroid/text/Spannable;Lcom/google/android/nkb;II)V", "Landroidx/compose/ui/graphics/drawscope/b;", "drawStyle", "o", "(Landroid/text/Spannable;Landroidx/compose/ui/graphics/drawscope/b;II)V", "Lcom/google/android/ei1;", "color", "j", "(Landroid/text/Spannable;JII)V", "Lcom/google/android/g77;", "localeList", "w", "(Landroid/text/Spannable;Lcom/google/android/g77;II)V", "Lcom/google/android/hwc;", "textGeometricTransform", "t", "(Landroid/text/Spannable;Lcom/google/android/hwc;II)V", "", "fontFeatureSettings", "r", "(Landroid/text/Spannable;Ljava/lang/String;II)V", "fontSize", "s", "(Landroid/text/Spannable;JLcom/google/android/f43;II)V", "Lcom/google/android/wrc;", "textDecoration", "B", "(Landroid/text/Spannable;Lcom/google/android/wrc;II)V", "n", "Lcom/google/android/wg0;", "baselineShift", "k", "(Landroid/text/Spannable;Lcom/google/android/wg0;II)V", "Lcom/google/android/qu0;", "brush", "alpha", "l", "(Landroid/text/Spannable;Lcom/google/android/qu0;FII)V", "e", "(Landroidx/compose/ui/text/y;)Z", "spanStyle", "g", "(Landroidx/compose/ui/text/r;Landroidx/compose/ui/text/r;)Landroidx/compose/ui/text/r;", "d", "(Landroidx/compose/ui/text/r;)Z", "needsLetterSpacingSpan", "ui-text"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class b0c {
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void A(Spannable spannable, TextStyle textStyle, List<? extends b.Range<? extends b.a>> list, f43 f43Var, rs4<? super l, ? super FontWeight, ? super t, ? super u, ? extends Typeface> rs4Var) throws NoWhenBranchMatchedException {
        MetricAffectingSpan metricAffectingSpanB;
        p(spannable, textStyle, list, rs4Var);
        int size = list.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            b.Range<? extends b.a> range = list.get(i);
            if (range.g() instanceof SpanStyle) {
                int iH = range.h();
                int iF = range.f();
                if (iH >= 0 && iH < spannable.length() && iF > iH && iF <= spannable.length()) {
                    z(spannable, (SpanStyle) range.g(), iH, iF, f43Var);
                    if (d((SpanStyle) range.g())) {
                        z = true;
                    }
                }
            }
        }
        if (z) {
            int size2 = list.size();
            for (int i2 = 0; i2 < size2; i2++) {
                b.Range<? extends b.a> range2 = list.get(i2);
                b.a aVarG = range2.g();
                if (aVarG instanceof SpanStyle) {
                    int iH2 = range2.h();
                    int iF2 = range2.f();
                    if (iH2 >= 0 && iH2 < spannable.length() && iF2 > iH2 && iF2 <= spannable.length() && (metricAffectingSpanB = b(((SpanStyle) aVarG).getLetterSpacing(), f43Var)) != null) {
                        y(spannable, metricAffectingSpanB, iH2, iF2);
                    }
                }
            }
        }
    }

    public static final void B(Spannable spannable, wrc wrcVar, int i, int i2) {
        if (wrcVar != null) {
            wrc.Companion companion = wrc.INSTANCE;
            y(spannable, new yrc(wrcVar.d(companion.d()), wrcVar.d(companion.b())), i, i2);
        }
    }

    public static final void C(Spannable spannable, TextIndent textIndent, float f, f43 f43Var) {
        float fH;
        if (textIndent != null) {
            if ((b0d.e(textIndent.getFirstLine(), c0d.i(0)) && b0d.e(textIndent.getRestLine(), c0d.i(0))) || b0d.f(textIndent.getFirstLine()) == 0 || b0d.f(textIndent.getRestLine()) == 0) {
                return;
            }
            long jG = b0d.g(textIndent.getFirstLine());
            d0d.Companion companion = d0d.INSTANCE;
            float fH2 = 0.0f;
            if (d0d.g(jG, companion.b())) {
                fH = f43Var.T1(textIndent.getFirstLine());
            } else {
                fH = d0d.g(jG, companion.a()) ? b0d.h(textIndent.getFirstLine()) * f : 0.0f;
            }
            long jG2 = b0d.g(textIndent.getRestLine());
            if (d0d.g(jG2, companion.b())) {
                fH2 = f43Var.T1(textIndent.getRestLine());
            } else if (d0d.g(jG2, companion.a())) {
                fH2 = b0d.h(textIndent.getRestLine()) * f;
            }
            y(spannable, new LeadingMarginSpan.Standard((int) Math.ceil(fH), (int) Math.ceil(fH2)), 0, spannable.length());
        }
    }

    private static final MetricAffectingSpan b(long j, f43 f43Var) {
        long jG = b0d.g(j);
        d0d.Companion companion = d0d.INSTANCE;
        if (d0d.g(jG, companion.b())) {
            return new q07(f43Var.T1(j));
        }
        if (d0d.g(jG, companion.a())) {
            return new p07(b0d.h(j));
        }
        return null;
    }

    public static final void c(SpanStyle spanStyle, List<b.Range<SpanStyle>> list, ps4<? super SpanStyle, ? super Integer, ? super Integer, Unit> ps4Var) {
        if (list.size() <= 1) {
            if (list.isEmpty()) {
                return;
            }
            ps4Var.invoke(g(spanStyle, list.get(0).g()), Integer.valueOf(list.get(0).h()), Integer.valueOf(list.get(0).f()));
            return;
        }
        int size = list.size();
        int i = size * 2;
        int[] iArr = new int[i];
        int size2 = list.size();
        for (int i2 = 0; i2 < size2; i2++) {
            b.Range<SpanStyle> range = list.get(i2);
            iArr[i2] = range.h();
            iArr[i2 + size] = range.f();
        }
        f.Q(iArr);
        int iN0 = f.n0(iArr);
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = iArr[i3];
            if (i4 != iN0) {
                int size3 = list.size();
                SpanStyle spanStyleG = spanStyle;
                for (int i5 = 0; i5 < size3; i5++) {
                    b.Range<SpanStyle> range2 = list.get(i5);
                    if (range2.h() != range2.f() && c.j(iN0, i4, range2.h(), range2.f())) {
                        spanStyleG = g(spanStyleG, range2.g());
                    }
                }
                if (spanStyleG != null) {
                    ps4Var.invoke(spanStyleG, Integer.valueOf(iN0), Integer.valueOf(i4));
                }
                iN0 = i4;
            }
        }
    }

    private static final boolean d(SpanStyle spanStyle) {
        long jG = b0d.g(spanStyle.getLetterSpacing());
        d0d.Companion companion = d0d.INSTANCE;
        return d0d.g(jG, companion.b()) || d0d.g(b0d.g(spanStyle.getLetterSpacing()), companion.a());
    }

    private static final boolean e(TextStyle textStyle) {
        return vyc.d(textStyle.getSpanStyle()) || textStyle.n() != null;
    }

    private static final boolean f(f43 f43Var) {
        return ((double) f43Var.getFontScale()) > 1.05d;
    }

    private static final SpanStyle g(SpanStyle spanStyle, SpanStyle spanStyle2) {
        return spanStyle == null ? spanStyle2 : spanStyle.y(spanStyle2);
    }

    private static final float h(long j, float f, f43 f43Var) {
        if (b0d.e(j, b0d.INSTANCE.a())) {
            return f;
        }
        long jG = b0d.g(j);
        d0d.Companion companion = d0d.INSTANCE;
        if (d0d.g(jG, companion.b())) {
            return f43Var.T1(j);
        }
        if (d0d.g(jG, companion.a())) {
            return b0d.h(j) * f;
        }
        return Float.NaN;
    }

    private static final float i(long j, float f, f43 f43Var) {
        float fH;
        long jG = b0d.g(j);
        d0d.Companion companion = d0d.INSTANCE;
        if (d0d.g(jG, companion.b())) {
            if (!f(f43Var)) {
                return f43Var.T1(j);
            }
            fH = b0d.h(j) / b0d.h(f43Var.Y(f));
        } else {
            if (!d0d.g(jG, companion.a())) {
                return Float.NaN;
            }
            fH = b0d.h(j);
        }
        return fH * f;
    }

    public static final void j(Spannable spannable, long j, int i, int i2) {
        if (j != 16) {
            y(spannable, new BackgroundColorSpan(ki1.j(j)), i, i2);
        }
    }

    private static final void k(Spannable spannable, wg0 wg0Var, int i, int i2) {
        if (wg0Var != null) {
            y(spannable, new yg0(wg0Var.getMultiplier()), i, i2);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private static final void l(Spannable spannable, qu0 qu0Var, float f, int i, int i2) throws NoWhenBranchMatchedException {
        if (qu0Var != null) {
            if (qu0Var instanceof SolidColor) {
                n(spannable, ((SolidColor) qu0Var).getValue(), i, i2);
            } else {
                if (!(qu0Var instanceof jkb)) {
                    throw new NoWhenBranchMatchedException();
                }
                y(spannable, new lkb((jkb) qu0Var, f), i, i2);
            }
        }
    }

    public static final void m(Spannable spannable, List<? extends b.Range<? extends b.a>> list, float f, f43 f43Var, TextIndent textIndent) {
        if (textIndent != null) {
            long jG = b0d.g(textIndent.getFirstLine());
            d0d.Companion companion = d0d.INSTANCE;
            if (d0d.g(jG, companion.b())) {
                f43Var.T1(textIndent.getFirstLine());
            } else if (d0d.g(jG, companion.a())) {
                b0d.h(textIndent.getFirstLine());
            }
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            list.get(i).g();
        }
    }

    public static final void n(Spannable spannable, long j, int i, int i2) {
        if (j != 16) {
            y(spannable, new ForegroundColorSpan(ki1.j(j)), i, i2);
        }
    }

    private static final void o(Spannable spannable, androidx.compose.ui.graphics.drawscope.b bVar, int i, int i2) {
        if (bVar != null) {
            y(spannable, new ch3(bVar), i, i2);
        }
    }

    private static final void p(final Spannable spannable, TextStyle textStyle, List<? extends b.Range<? extends b.a>> list, final rs4<? super l, ? super FontWeight, ? super t, ? super u, ? extends Typeface> rs4Var) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            b.Range<? extends b.a> range = list.get(i);
            if ((range.g() instanceof SpanStyle) && (vyc.d((SpanStyle) range.g()) || ((SpanStyle) range.g()).getFontSynthesis() != null)) {
                Intrinsics.h(range, "null cannot be cast to non-null type androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.SpanStyle>");
                arrayList.add(range);
            }
        }
        c(e(textStyle) ? new SpanStyle(0L, 0L, textStyle.o(), textStyle.m(), textStyle.n(), textStyle.j(), null, 0L, null, null, null, 0L, null, null, null, null, 65475, null) : null, arrayList, new ps4() { // from class: com.google.android.a0c
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return b0c.q(spannable, rs4Var, (SpanStyle) obj, ((Integer) obj2).intValue(), ((Integer) obj3).intValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q(Spannable spannable, rs4 rs4Var, SpanStyle spanStyle, int i, int i2) {
        l fontFamily = spanStyle.getFontFamily();
        FontWeight fontWeight = spanStyle.getFontWeight();
        if (fontWeight == null) {
            fontWeight = FontWeight.INSTANCE.f();
        }
        t fontStyle = spanStyle.getFontStyle();
        t tVarC = t.c(fontStyle != null ? fontStyle.getValue() : t.INSTANCE.b());
        u fontSynthesis = spanStyle.getFontSynthesis();
        spannable.setSpan(new nod((Typeface) rs4Var.invoke(fontFamily, fontWeight, tVarC, u.e(fontSynthesis != null ? fontSynthesis.getValue() : u.INSTANCE.a()))), i, i2, 33);
        return Unit.a;
    }

    private static final void r(Spannable spannable, String str, int i, int i2) {
        if (str != null) {
            y(spannable, new vl4(str), i, i2);
        }
    }

    public static final void s(Spannable spannable, long j, f43 f43Var, int i, int i2) {
        long jG = b0d.g(j);
        d0d.Companion companion = d0d.INSTANCE;
        if (d0d.g(jG, companion.b())) {
            y(spannable, new AbsoluteSizeSpan(sh7.d(f43Var.T1(j)), false), i, i2);
        } else if (d0d.g(jG, companion.a())) {
            y(spannable, new RelativeSizeSpan(b0d.h(j)), i, i2);
        }
    }

    private static final void t(Spannable spannable, TextGeometricTransform textGeometricTransform, int i, int i2) {
        if (textGeometricTransform != null) {
            y(spannable, new ScaleXSpan(textGeometricTransform.getScaleX()), i, i2);
            y(spannable, new otb(textGeometricTransform.getSkewX()), i, i2);
        }
    }

    public static final void u(Spannable spannable, long j, float f, f43 f43Var, LineHeightStyle lineHeightStyle) {
        float fI = i(j, f, f43Var);
        if (Float.isNaN(fI)) {
            return;
        }
        y(spannable, new h27(fI, 0, (spannable.length() == 0 || h.Z1(spannable) == '\n') ? spannable.length() + 1 : spannable.length(), LineHeightStyle.d.h(lineHeightStyle.getTrim()), LineHeightStyle.d.i(lineHeightStyle.getTrim()), lineHeightStyle.getAlignment(), lineHeightStyle.getMode(), null), 0, spannable.length());
    }

    public static final void v(Spannable spannable, long j, float f, f43 f43Var) {
        float fI = i(j, f, f43Var);
        if (Float.isNaN(fI)) {
            return;
        }
        y(spannable, new f27(fI), 0, spannable.length());
    }

    public static final void w(Spannable spannable, LocaleList localeList, int i, int i2) {
        if (localeList != null) {
            y(spannable, j77.a.a(localeList), i, i2);
        }
    }

    private static final void x(Spannable spannable, Shadow shadow, int i, int i2) {
        if (shadow != null) {
            y(spannable, new vkb(ki1.j(shadow.getColor()), Float.intBitsToFloat((int) (shadow.getOffset() >> 32)), Float.intBitsToFloat((int) (shadow.getOffset() & 4294967295L)), vyc.b(shadow.getBlurRadius())), i, i2);
        }
    }

    public static final void y(Spannable spannable, Object obj, int i, int i2) {
        spannable.setSpan(obj, i, i2, 33);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private static final void z(Spannable spannable, SpanStyle spanStyle, int i, int i2, f43 f43Var) throws NoWhenBranchMatchedException {
        k(spannable, spanStyle.getBaselineShift(), i, i2);
        n(spannable, spanStyle.g(), i, i2);
        l(spannable, spanStyle.f(), spanStyle.c(), i, i2);
        B(spannable, spanStyle.getTextDecoration(), i, i2);
        s(spannable, spanStyle.getFontSize(), f43Var, i, i2);
        r(spannable, spanStyle.getFontFeatureSettings(), i, i2);
        t(spannable, spanStyle.getTextGeometricTransform(), i, i2);
        w(spannable, spanStyle.getLocaleList(), i, i2);
        j(spannable, spanStyle.getBackground(), i, i2);
        x(spannable, spanStyle.getShadow(), i, i2);
        o(spannable, spanStyle.getDrawStyle(), i, i2);
    }
}
