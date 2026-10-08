package androidx.compose.ui.text;

import androidx.compose.ui.unit.LayoutDirection;
import com.google.inputmethod.LineHeightStyle;
import com.google.inputmethod.TextIndent;
import com.google.inputmethod.b0d;
import com.google.inputmethod.cpc;
import com.google.inputmethod.d27;
import com.google.inputmethod.dsc;
import com.google.inputmethod.pwc;
import com.google.inputmethod.qi5;
import com.google.inputmethod.ro;
import com.google.inputmethod.ryc;
import com.google.inputmethod.vzc;
import com.google.inputmethod.wzb;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u001a'\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a-\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\u0001\u001a\u0004\u0018\u00010\u00072\b\u0010\u0002\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\b\u0010\t\u001a\u001f\u0010\r\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\r\u0010\u000e\u001ac\u0010 \u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0000¢\u0006\u0004\b \u0010!\u001a\u001f\u0010#\u001a\u0004\u0018\u00010\u0007*\u00020\u00002\b\u0010\"\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b#\u0010$\"\u0014\u0010&\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010%¨\u0006'"}, d2 = {"Landroidx/compose/ui/text/m;", "start", "stop", "", "fraction", "b", "(Landroidx/compose/ui/text/m;Landroidx/compose/ui/text/m;F)Landroidx/compose/ui/text/m;", "Landroidx/compose/ui/text/o;", "c", "(Landroidx/compose/ui/text/o;Landroidx/compose/ui/text/o;F)Landroidx/compose/ui/text/o;", "style", "Landroidx/compose/ui/unit/LayoutDirection;", "direction", "e", "(Landroidx/compose/ui/text/m;Landroidx/compose/ui/unit/LayoutDirection;)Landroidx/compose/ui/text/m;", "Lcom/google/android/cpc;", "textAlign", "Lcom/google/android/dsc;", "textDirection", "Lcom/google/android/b0d;", "lineHeight", "Lcom/google/android/owc;", "textIndent", "platformStyle", "Lcom/google/android/g27;", "lineHeightStyle", "Lcom/google/android/d27;", "lineBreak", "Lcom/google/android/qi5;", "hyphens", "Lcom/google/android/ryc;", "textMotion", "a", "(Landroidx/compose/ui/text/m;IIJLcom/google/android/owc;Landroidx/compose/ui/text/o;Lcom/google/android/g27;IILcom/google/android/ryc;)Landroidx/compose/ui/text/m;", "other", "d", "(Landroidx/compose/ui/text/m;Landroidx/compose/ui/text/o;)Landroidx/compose/ui/text/o;", "J", "DefaultLineHeight", "ui-text"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class n {
    private static final long a = b0d.INSTANCE.a();

    public static final ParagraphStyle a(ParagraphStyle paragraphStyle, int i, int i2, long j, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, int i3, int i4, ryc rycVar) {
        long j2;
        long j3;
        int textAlign = i;
        TextIndent textIndent2 = textIndent;
        cpc.Companion companion = cpc.INSTANCE;
        if (cpc.k(textAlign, companion.g()) || cpc.k(textAlign, paragraphStyle.getTextAlign())) {
            if (b0d.f(j) == 0) {
                j2 = 0;
                j3 = j;
            } else {
                j2 = 0;
                j3 = j;
                if (b0d.e(j3, paragraphStyle.getLineHeight())) {
                }
            }
            if ((textIndent2 == null || Intrinsics.e(textIndent2, paragraphStyle.getTextIndent())) && ((dsc.j(i2, dsc.INSTANCE.f()) || dsc.j(i2, paragraphStyle.getTextDirection())) && ((platformParagraphStyle == null || Intrinsics.e(platformParagraphStyle, paragraphStyle.getPlatformStyle())) && ((lineHeightStyle == null || Intrinsics.e(lineHeightStyle, paragraphStyle.getLineHeightStyle())) && ((d27.g(i3, d27.INSTANCE.c()) || d27.g(i3, paragraphStyle.getLineBreak())) && ((qi5.g(i4, qi5.INSTANCE.c()) || qi5.g(i4, paragraphStyle.getHyphens())) && (rycVar == null || Intrinsics.e(rycVar, paragraphStyle.getTextMotion())))))))) {
                return paragraphStyle;
            }
        } else {
            j2 = 0;
            j3 = j;
        }
        long lineHeight = b0d.f(j3) == j2 ? paragraphStyle.getLineHeight() : j3;
        if (textIndent2 == null) {
            textIndent2 = paragraphStyle.getTextIndent();
        }
        TextIndent textIndent3 = textIndent2;
        if (cpc.k(textAlign, companion.g())) {
            textAlign = paragraphStyle.getTextAlign();
        }
        return new ParagraphStyle(textAlign, !dsc.j(i2, dsc.INSTANCE.f()) ? i2 : paragraphStyle.getTextDirection(), lineHeight, textIndent3, d(paragraphStyle, platformParagraphStyle), lineHeightStyle == null ? paragraphStyle.getLineHeightStyle() : lineHeightStyle, !d27.g(i3, d27.INSTANCE.c()) ? i3 : paragraphStyle.getLineBreak(), !qi5.g(i4, qi5.INSTANCE.c()) ? i4 : paragraphStyle.getHyphens(), rycVar == null ? paragraphStyle.getTextMotion() : rycVar, null);
    }

    public static final ParagraphStyle b(ParagraphStyle paragraphStyle, ParagraphStyle paragraphStyle2, float f) {
        int value = ((cpc) wzb.e(cpc.h(paragraphStyle.getTextAlign()), cpc.h(paragraphStyle2.getTextAlign()), f)).getValue();
        int value2 = ((dsc) wzb.e(dsc.g(paragraphStyle.getTextDirection()), dsc.g(paragraphStyle2.getTextDirection()), f)).getValue();
        long jG = wzb.g(paragraphStyle.getLineHeight(), paragraphStyle2.getLineHeight(), f);
        TextIndent textIndent = paragraphStyle.getTextIndent();
        if (textIndent == null) {
            textIndent = TextIndent.INSTANCE.a();
        }
        TextIndent textIndent2 = paragraphStyle2.getTextIndent();
        if (textIndent2 == null) {
            textIndent2 = TextIndent.INSTANCE.a();
        }
        return new ParagraphStyle(value, value2, jG, pwc.a(textIndent, textIndent2, f), c(paragraphStyle.getPlatformStyle(), paragraphStyle2.getPlatformStyle(), f), (LineHeightStyle) wzb.e(paragraphStyle.getLineHeightStyle(), paragraphStyle2.getLineHeightStyle(), f), ((d27) wzb.e(d27.d(paragraphStyle.getLineBreak()), d27.d(paragraphStyle2.getLineBreak()), f)).getMask(), ((qi5) wzb.e(qi5.d(paragraphStyle.getHyphens()), qi5.d(paragraphStyle2.getHyphens()), f)).getValue(), (ryc) wzb.e(paragraphStyle.getTextMotion(), paragraphStyle2.getTextMotion(), f), null);
    }

    private static final PlatformParagraphStyle c(PlatformParagraphStyle platformParagraphStyle, PlatformParagraphStyle platformParagraphStyle2, float f) {
        if (platformParagraphStyle == null && platformParagraphStyle2 == null) {
            return null;
        }
        if (platformParagraphStyle == null) {
            platformParagraphStyle = PlatformParagraphStyle.INSTANCE.a();
        }
        if (platformParagraphStyle2 == null) {
            platformParagraphStyle2 = PlatformParagraphStyle.INSTANCE.a();
        }
        return ro.b(platformParagraphStyle, platformParagraphStyle2, f);
    }

    private static final PlatformParagraphStyle d(ParagraphStyle paragraphStyle, PlatformParagraphStyle platformParagraphStyle) {
        if (paragraphStyle.getPlatformStyle() == null) {
            return platformParagraphStyle;
        }
        return platformParagraphStyle == null ? paragraphStyle.getPlatformStyle() : paragraphStyle.getPlatformStyle().d(platformParagraphStyle);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final ParagraphStyle e(ParagraphStyle paragraphStyle, LayoutDirection layoutDirection) throws NoWhenBranchMatchedException {
        int textAlign = paragraphStyle.getTextAlign();
        cpc.Companion companion = cpc.INSTANCE;
        int iF = cpc.k(textAlign, companion.g()) ? companion.f() : paragraphStyle.getTextAlign();
        int iE = vzc.e(layoutDirection, paragraphStyle.getTextDirection());
        long lineHeight = b0d.f(paragraphStyle.getLineHeight()) == 0 ? a : paragraphStyle.getLineHeight();
        TextIndent textIndent = paragraphStyle.getTextIndent();
        if (textIndent == null) {
            textIndent = TextIndent.INSTANCE.a();
        }
        TextIndent textIndent2 = textIndent;
        PlatformParagraphStyle platformStyle = paragraphStyle.getPlatformStyle();
        LineHeightStyle lineHeightStyle = paragraphStyle.getLineHeightStyle();
        int lineBreak = paragraphStyle.getLineBreak();
        d27.Companion companion2 = d27.INSTANCE;
        int iB = d27.g(lineBreak, companion2.c()) ? companion2.b() : paragraphStyle.getLineBreak();
        int hyphens = paragraphStyle.getHyphens();
        qi5.Companion companion3 = qi5.INSTANCE;
        int iB2 = qi5.g(hyphens, companion3.c()) ? companion3.b() : paragraphStyle.getHyphens();
        ryc textMotion = paragraphStyle.getTextMotion();
        if (textMotion == null) {
            textMotion = ryc.INSTANCE.a();
        }
        return new ParagraphStyle(iF, iE, lineHeight, textIndent2, platformStyle, lineHeightStyle, iB, iB2, textMotion, null);
    }
}
