package com.google.inputmethod;

import android.graphics.Typeface;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.font.l;
import androidx.compose.ui.text.font.t;
import androidx.compose.ui.text.font.u;
import com.google.android.rs4;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\u001aW\u0010\u000e\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012&\u0010\t\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00032\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a3\u0010\u0016\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u001d\u0010\u001b\u001a\u00020\u001a*\u00020\u00002\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0013\u0010\u001d\u001a\u00020\f*\u00020\u0001H\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u0017\u0010!\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001fH\u0000¢\u0006\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lcom/google/android/po;", "Landroidx/compose/ui/text/r;", "style", "Lkotlin/Function4;", "Landroidx/compose/ui/text/font/l;", "Landroidx/compose/ui/text/font/x;", "Landroidx/compose/ui/text/font/t;", "Landroidx/compose/ui/text/font/u;", "Landroid/graphics/Typeface;", "resolveTypeface", "Lcom/google/android/f43;", "density", "", "requiresLetterSpacing", "a", "(Lcom/google/android/po;Landroidx/compose/ui/text/r;Lcom/google/android/rs4;Lcom/google/android/f43;Z)Landroidx/compose/ui/text/r;", "Lcom/google/android/b0d;", "letterSpacing", "Lcom/google/android/ei1;", "background", "Lcom/google/android/wg0;", "baselineShift", "c", "(JZJLcom/google/android/wg0;)Landroidx/compose/ui/text/r;", "Lcom/google/android/ryc;", "textMotion", "", "e", "(Lcom/google/android/po;Lcom/google/android/ryc;)V", "d", "(Landroidx/compose/ui/text/r;)Z", "", "blurRadius", "b", "(F)F", "ui-text"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class vyc {
    public static final SpanStyle a(po poVar, SpanStyle spanStyle, rs4<? super l, ? super FontWeight, ? super t, ? super u, ? extends Typeface> rs4Var, f43 f43Var, boolean z) {
        long jG = b0d.g(spanStyle.getFontSize());
        d0d.Companion companion = d0d.INSTANCE;
        if (d0d.g(jG, companion.b())) {
            poVar.setTextSize(f43Var.T1(spanStyle.getFontSize()));
        } else if (d0d.g(jG, companion.a())) {
            poVar.setTextSize(poVar.getTextSize() * b0d.h(spanStyle.getFontSize()));
        }
        if (d(spanStyle)) {
            l fontFamily = spanStyle.getFontFamily();
            FontWeight fontWeight = spanStyle.getFontWeight();
            if (fontWeight == null) {
                fontWeight = FontWeight.INSTANCE.f();
            }
            t fontStyle = spanStyle.getFontStyle();
            t tVarC = t.c(fontStyle != null ? fontStyle.getValue() : t.INSTANCE.b());
            u fontSynthesis = spanStyle.getFontSynthesis();
            poVar.setTypeface((Typeface) rs4Var.invoke(fontFamily, fontWeight, tVarC, u.e(fontSynthesis != null ? fontSynthesis.getValue() : u.INSTANCE.a())));
        }
        if (spanStyle.getLocaleList() != null && !Intrinsics.e(spanStyle.getLocaleList(), LocaleList.INSTANCE.a())) {
            j77.a.b(poVar, spanStyle.getLocaleList());
        }
        if (spanStyle.getFontFeatureSettings() != null && !Intrinsics.e(spanStyle.getFontFeatureSettings(), "")) {
            poVar.setFontFeatureSettings(spanStyle.getFontFeatureSettings());
        }
        if (spanStyle.getTextGeometricTransform() != null && !Intrinsics.e(spanStyle.getTextGeometricTransform(), TextGeometricTransform.INSTANCE.a())) {
            poVar.setTextScaleX(poVar.getTextScaleX() * spanStyle.getTextGeometricTransform().getScaleX());
            poVar.setTextSkewX(poVar.getTextSkewX() + spanStyle.getTextGeometricTransform().getSkewX());
        }
        poVar.h(spanStyle.g());
        poVar.f(spanStyle.f(), tsb.INSTANCE.a(), spanStyle.c());
        poVar.j(spanStyle.getShadow());
        poVar.k(spanStyle.getTextDecoration());
        poVar.i(spanStyle.getDrawStyle());
        if (d0d.g(b0d.g(spanStyle.getLetterSpacing()), companion.b()) && b0d.h(spanStyle.getLetterSpacing()) != 0.0f) {
            float textSize = poVar.getTextSize() * poVar.getTextScaleX();
            float fT1 = f43Var.T1(spanStyle.getLetterSpacing());
            if (textSize != 0.0f) {
                poVar.setLetterSpacing(fT1 / textSize);
            }
        } else if (d0d.g(b0d.g(spanStyle.getLetterSpacing()), companion.a())) {
            poVar.setLetterSpacing(b0d.h(spanStyle.getLetterSpacing()));
        }
        return c(spanStyle.getLetterSpacing(), z, spanStyle.getBackground(), spanStyle.getBaselineShift());
    }

    public static final float b(float f) {
        if (f == 0.0f) {
            return Float.MIN_VALUE;
        }
        return f;
    }

    private static final SpanStyle c(long j, boolean z, long j2, wg0 wg0Var) {
        long jI = j2;
        boolean z2 = false;
        boolean z3 = z && d0d.g(b0d.g(j), d0d.INSTANCE.b()) && b0d.h(j) != 0.0f;
        ei1.Companion companion = ei1.INSTANCE;
        boolean z4 = (ei1.r(jI, companion.i()) || ei1.r(jI, companion.h())) ? false : true;
        if (wg0Var != null) {
            if (!wg0.e(wg0Var.getMultiplier(), wg0.INSTANCE.a())) {
                z2 = true;
            }
        }
        if (!z3 && !z4 && !z2) {
            return null;
        }
        long jA = z3 ? j : b0d.INSTANCE.a();
        if (!z4) {
            jI = companion.i();
        }
        return new SpanStyle(0L, 0L, null, null, null, null, null, jA, z2 ? wg0Var : null, null, null, jI, null, null, null, null, 63103, null);
    }

    public static final boolean d(SpanStyle spanStyle) {
        return (spanStyle.getFontFamily() == null && spanStyle.getFontStyle() == null && spanStyle.getFontWeight() == null) ? false : true;
    }

    public static final void e(po poVar, ryc rycVar) {
        if (rycVar == null) {
            rycVar = ryc.INSTANCE.a();
        }
        poVar.setFlags(rycVar.getSubpixelTextPositioning() ? poVar.getFlags() | 128 : poVar.getFlags() & (-129));
        int linearity = rycVar.getLinearity();
        ryc.b.Companion companion = ryc.b.INSTANCE;
        if (ryc.b.g(linearity, companion.b())) {
            poVar.setFlags(poVar.getFlags() | 64);
            poVar.setHinting(0);
        } else if (ryc.b.g(linearity, companion.a())) {
            poVar.getFlags();
            poVar.setHinting(1);
        } else if (!ryc.b.g(linearity, companion.c())) {
            poVar.getFlags();
        } else {
            poVar.getFlags();
            poVar.setHinting(0);
        }
    }
}
