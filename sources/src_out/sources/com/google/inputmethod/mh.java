package com.google.inputmethod;

import android.graphics.Typeface;
import android.text.SpannableString;
import android.text.style.ScaleXSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.UrlAnnotation;
import androidx.compose.ui.text.b;
import androidx.compose.ui.text.f;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.font.d;
import androidx.compose.ui.text.font.l;
import androidx.compose.ui.text.font.t;
import androidx.compose.ui.text.font.u;
import androidx.compose.ui.text.font.y;
import androidx.compose.ui.text.z;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a+\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\b\u0010\t\u001a;\u0010\u0010\u001a\u00020\u000f*\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0012*\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/text/b;", "Lcom/google/android/f43;", "density", "Landroidx/compose/ui/text/font/l$b;", "fontFamilyResolver", "Lcom/google/android/ard;", "urlSpanCache", "Landroid/text/SpannableString;", "b", "(Landroidx/compose/ui/text/b;Lcom/google/android/f43;Landroidx/compose/ui/text/font/l$b;Lcom/google/android/ard;)Landroid/text/SpannableString;", "Landroidx/compose/ui/text/r;", "spanStyle", "", "start", "end", "", "a", "(Landroid/text/SpannableString;Landroidx/compose/ui/text/r;IILcom/google/android/f43;Landroidx/compose/ui/text/font/l$b;)V", "Landroidx/compose/ui/text/b$d;", "Landroidx/compose/ui/text/f;", "Landroidx/compose/ui/text/f$b;", "c", "(Landroidx/compose/ui/text/b$d;)Landroidx/compose/ui/text/b$d;", "ui-text"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class mh {
    private static final void a(SpannableString spannableString, SpanStyle spanStyle, int i, int i2, f43 f43Var, l.b bVar) {
        b0c.n(spannableString, spanStyle.g(), i, i2);
        b0c.s(spannableString, spanStyle.getFontSize(), f43Var, i, i2);
        if (spanStyle.getFontWeight() != null || spanStyle.getFontStyle() != null) {
            FontWeight fontWeight = spanStyle.getFontWeight();
            if (fontWeight == null) {
                fontWeight = FontWeight.INSTANCE.f();
            }
            t fontStyle = spanStyle.getFontStyle();
            spannableString.setSpan(new StyleSpan(d.c(fontWeight, fontStyle != null ? fontStyle.getValue() : t.INSTANCE.b())), i, i2, 33);
        }
        if (spanStyle.getFontFamily() != null) {
            if (spanStyle.getFontFamily() instanceof y) {
                spannableString.setSpan(new TypefaceSpan(((y) spanStyle.getFontFamily()).getName()), i, i2, 33);
            } else {
                l fontFamily = spanStyle.getFontFamily();
                u fontSynthesis = spanStyle.getFontSynthesis();
                Object value = l.b.b(bVar, fontFamily, null, 0, fontSynthesis != null ? fontSynthesis.getValue() : u.INSTANCE.a(), 6, null).getValue();
                Intrinsics.h(value, "null cannot be cast to non-null type android.graphics.Typeface");
                spannableString.setSpan(pt.a.a((Typeface) value), i, i2, 33);
            }
        }
        if (spanStyle.getTextDecoration() != null) {
            wrc textDecoration = spanStyle.getTextDecoration();
            wrc.Companion companion = wrc.INSTANCE;
            if (textDecoration.d(companion.d())) {
                spannableString.setSpan(new UnderlineSpan(), i, i2, 33);
            }
            if (spanStyle.getTextDecoration().d(companion.b())) {
                spannableString.setSpan(new StrikethroughSpan(), i, i2, 33);
            }
        }
        if (spanStyle.getTextGeometricTransform() != null) {
            spannableString.setSpan(new ScaleXSpan(spanStyle.getTextGeometricTransform().getScaleX()), i, i2, 33);
        }
        b0c.w(spannableString, spanStyle.getLocaleList(), i, i2);
        b0c.j(spannableString, spanStyle.getBackground(), i, i2);
    }

    public static final SpannableString b(b bVar, f43 f43Var, l.b bVar2, ard ardVar) {
        SpannableString spannableString = new SpannableString(bVar.getText());
        List<b.Range<SpanStyle>> listH = bVar.h();
        if (listH != null) {
            int size = listH.size();
            for (int i = 0; i < size; i++) {
                b.Range<SpanStyle> range = listH.get(i);
                a(spannableString, SpanStyle.b(range.a(), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65503, null), range.getStart(), range.getEnd(), f43Var, bVar2);
            }
        }
        List<b.Range<z>> listK = bVar.k(0, bVar.length());
        int size2 = listK.size();
        for (int i2 = 0; i2 < size2; i2++) {
            b.Range<z> range2 = listK.get(i2);
            spannableString.setSpan(ojd.a(range2.a()), range2.getStart(), range2.getEnd(), 33);
        }
        List<b.Range<UrlAnnotation>> listL = bVar.l(0, bVar.length());
        int size3 = listL.size();
        for (int i3 = 0; i3 < size3; i3++) {
            b.Range<UrlAnnotation> range3 = listL.get(i3);
            spannableString.setSpan(ardVar.c(range3.a()), range3.getStart(), range3.getEnd(), 33);
        }
        List<b.Range<f>> listE = bVar.e(0, bVar.length());
        int size4 = listE.size();
        for (int i4 = 0; i4 < size4; i4++) {
            b.Range<f> range4 = listE.get(i4);
            if (range4.h() != range4.f()) {
                f fVarG = range4.g();
                if ((fVarG instanceof f.b) && ((f.b) fVarG).getLinkInteractionListener() == null) {
                    spannableString.setSpan(ardVar.b(c(range4)), range4.h(), range4.f(), 33);
                } else {
                    spannableString.setSpan(ardVar.a(range4), range4.h(), range4.f(), 33);
                }
            }
        }
        return spannableString;
    }

    private static final b.Range<f.b> c(b.Range<f> range) {
        f fVarG = range.g();
        Intrinsics.h(fVarG, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Url");
        return new b.Range<>((f.b) fVarG, range.h(), range.f());
    }
}
