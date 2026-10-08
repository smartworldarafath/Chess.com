package com.google.inputmethod;

import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.MetricAffectingSpan;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a'\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\n\"\u001a\u0010\u000f\u001a\u00020\b8\u0002X\u0082D¢\u0006\f\n\u0004\b\u000b\u0010\f\u0012\u0004\b\r\u0010\u000e\"$\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u00110\u0010j\b\u0012\u0004\u0012\u00020\u0011`\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"", "charSequence", "h", "(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;", "", "desiredWidth", "Landroid/text/TextPaint;", "textPaint", "", "g", "(FLjava/lang/CharSequence;Landroid/text/TextPaint;)Z", "a", "Z", "getStripNonMetricAffectingCharSpans$annotations", "()V", "stripNonMetricAffectingCharSpans", "Ljava/util/Comparator;", "Lkotlin/ranges/IntRange;", "Lkotlin/Comparator;", "b", "Ljava/util/Comparator;", "IntRangeComparator", "ui-text"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class xn6 {
    private static final boolean a = true;
    private static final Comparator<IntRange> b = new Comparator() { // from class: com.google.android.wn6
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return xn6.b((IntRange) obj, (IntRange) obj2);
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final int b(IntRange intRange, IntRange intRange2) {
        return (intRange.i() - intRange.f()) - (intRange2.i() - intRange2.f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean g(float f, CharSequence charSequence, TextPaint textPaint) {
        if (f == 0.0f) {
            return false;
        }
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            if (d0c.a(spanned, q07.class) || d0c.a(spanned, p07.class)) {
                return true;
            }
        }
        return textPaint.getLetterSpacing() != 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence h(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            if (d0c.a(spanned, CharacterStyle.class)) {
                CharacterStyle[] characterStyleArr = (CharacterStyle[]) spanned.getSpans(0, charSequence.length(), CharacterStyle.class);
                if (characterStyleArr != null && characterStyleArr.length != 0) {
                    SpannableString spannableString = null;
                    for (CharacterStyle characterStyle : characterStyleArr) {
                        if (!(characterStyle instanceof MetricAffectingSpan)) {
                            if (spannableString == null) {
                                spannableString = new SpannableString(charSequence);
                            }
                            spannableString.removeSpan(characterStyle);
                        }
                    }
                    if (spannableString != null) {
                        return spannableString;
                    }
                }
            }
        }
        return charSequence;
    }
}
