package com.google.inputmethod;

import android.graphics.Typeface;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import androidx.compose.ui.text.PlatformParagraphStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.b;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.font.l;
import androidx.compose.ui.text.font.t;
import androidx.compose.ui.text.font.u;
import androidx.emoji2.text.e;
import com.google.android.rs4;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000[\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\b\u0004*\u0001\u001c\u001a\u0089\u0001\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0014\u0010\t\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\b0\u00070\u00062\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00070\u00062\u0006\u0010\r\u001a\u00020\f2&\u0010\u0014\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u000e2\u0006\u0010\u0016\u001a\u00020\u0015H\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0013\u0010\u001a\u001a\u00020\u0015*\u00020\u0004H\u0000¢\u0006\u0004\b\u001a\u0010\u001b\"\u0014\u0010\u001e\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001d¨\u0006\u001f"}, d2 = {"", "text", "", "contextFontSize", "Landroidx/compose/ui/text/y;", "contextTextStyle", "", "Landroidx/compose/ui/text/b$d;", "Landroidx/compose/ui/text/b$a;", "annotations", "Lcom/google/android/v99;", "placeholders", "Lcom/google/android/f43;", "density", "Lkotlin/Function4;", "Landroidx/compose/ui/text/font/l;", "Landroidx/compose/ui/text/font/x;", "Landroidx/compose/ui/text/font/t;", "Landroidx/compose/ui/text/font/u;", "Landroid/graphics/Typeface;", "resolveTypeface", "", "useEmojiCompat", "", "a", "(Ljava/lang/String;FLandroidx/compose/ui/text/y;Ljava/util/List;Ljava/util/List;Lcom/google/android/f43;Lcom/google/android/rs4;Z)Ljava/lang/CharSequence;", "b", "(Landroidx/compose/ui/text/y;)Z", "com/google/android/fm$a", "Lcom/google/android/fm$a;", "NoopSpan", "ui-text"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class fm {
    private static final a a = new a();

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"com/google/android/fm$a", "Landroid/text/style/CharacterStyle;", "Landroid/text/TextPaint;", "p0", "", "updateDrawState", "(Landroid/text/TextPaint;)V", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends CharacterStyle {
        a() {
        }

        @Override // android.text.style.CharacterStyle
        public void updateDrawState(TextPaint p0) {
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [androidx.emoji2.text.e] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [int] */
    /* JADX WARN: Type inference failed for: r6v3 */
    public static final CharSequence a(String str, float f, TextStyle textStyle, List<? extends b.Range<? extends b.a>> list, List<b.Range<Placeholder>> list2, f43 f43Var, rs4<? super l, ? super FontWeight, ? super t, ? super u, ? extends Typeface> rs4Var, boolean z) throws NoWhenBranchMatchedException {
        String str2;
        CharSequence charSequenceU;
        float f2;
        f43 f43Var2;
        PlatformParagraphStyle paragraphSyle;
        if (z && e.k()) {
            PlatformTextStyle platformStyle = textStyle.getPlatformStyle();
            androidx.compose.ui.text.e eVarD = (platformStyle == null || (paragraphSyle = platformStyle.getParagraphSyle()) == null) ? null : androidx.compose.ui.text.e.d(paragraphSyle.getEmojiSupportMatch());
            str2 = str;
            charSequenceU = e.c().u(str2, 0, str.length(), Integer.MAX_VALUE, eVarD == null ? 0 : androidx.compose.ui.text.e.g(eVarD.getValue(), androidx.compose.ui.text.e.INSTANCE.a()));
            Intrinsics.g(charSequenceU);
        } else {
            str2 = str;
            charSequenceU = str2;
        }
        if (list.isEmpty() && list2.isEmpty() && Intrinsics.e(textStyle.D(), TextIndent.INSTANCE.a()) && b0d.f(textStyle.s()) == 0) {
            return charSequenceU;
        }
        Spannable spannableString = charSequenceU instanceof Spannable ? (Spannable) charSequenceU : new SpannableString(charSequenceU);
        if (Intrinsics.e(textStyle.A(), wrc.INSTANCE.d())) {
            b0c.y(spannableString, a, 0, str2.length());
        }
        if (b(textStyle) && textStyle.t() == null) {
            b0c.v(spannableString, textStyle.s(), f, f43Var);
            f2 = f;
            f43Var2 = f43Var;
        } else {
            LineHeightStyle lineHeightStyleT = textStyle.t();
            if (lineHeightStyleT == null) {
                lineHeightStyleT = LineHeightStyle.INSTANCE.a();
            }
            f2 = f;
            f43Var2 = f43Var;
            b0c.u(spannableString, textStyle.s(), f2, f43Var2, lineHeightStyleT);
        }
        b0c.C(spannableString, textStyle.D(), f2, f43Var2);
        b0c.A(spannableString, textStyle, list, f43Var2, rs4Var);
        b0c.m(spannableString, list, f2, f43Var2, textStyle.D());
        y99.d(spannableString, list2, f43Var2);
        return spannableString;
    }

    public static final boolean b(TextStyle textStyle) {
        PlatformParagraphStyle paragraphSyle;
        PlatformTextStyle platformStyle = textStyle.getPlatformStyle();
        if (platformStyle == null || (paragraphSyle = platformStyle.getParagraphSyle()) == null) {
            return false;
        }
        return paragraphSyle.getIncludeFontPadding();
    }
}
