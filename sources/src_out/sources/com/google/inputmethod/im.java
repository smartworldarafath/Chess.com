package com.google.inputmethod;

import androidx.compose.ui.text.PlatformParagraphStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.b;
import androidx.compose.ui.text.e;
import androidx.compose.ui.text.font.l;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a#\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001aY\u0010\u0016\u001a\u00020\u00152\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0014\u0010\u000e\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\r0\f0\u000b2\u0012\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\f0\u000b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0000¢\u0006\u0004\b\u0016\u0010\u0017\"\u0018\u0010\u001b\u001a\u00020\u0018*\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lcom/google/android/dsc;", "textDirection", "Lcom/google/android/g77;", "localeList", "", "d", "(ILcom/google/android/g77;)I", "", "text", "Landroidx/compose/ui/text/y;", "style", "", "Landroidx/compose/ui/text/b$d;", "Landroidx/compose/ui/text/b$a;", "annotations", "Lcom/google/android/v99;", "placeholders", "Lcom/google/android/f43;", "density", "Landroidx/compose/ui/text/font/l$b;", "fontFamilyResolver", "Lcom/google/android/d19;", "a", "(Ljava/lang/String;Landroidx/compose/ui/text/y;Ljava/util/List;Ljava/util/List;Lcom/google/android/f43;Landroidx/compose/ui/text/font/l$b;)Lcom/google/android/d19;", "", "c", "(Landroidx/compose/ui/text/y;)Z", "hasEmojiCompat", "ui-text"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class im {
    public static final d19 a(String str, TextStyle textStyle, List<? extends b.Range<? extends b.a>> list, List<b.Range<Placeholder>> list2, f43 f43Var, l.b bVar) {
        return new hm(str, textStyle, list, list2, bVar, f43Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean c(TextStyle textStyle) {
        PlatformParagraphStyle paragraphSyle;
        PlatformTextStyle platformStyle = textStyle.getPlatformStyle();
        e eVarD = (platformStyle == null || (paragraphSyle = platformStyle.getParagraphSyle()) == null) ? null : e.d(paragraphSyle.getEmojiSupportMatch());
        return !(eVarD == null ? false : e.g(eVarD.getValue(), e.INSTANCE.c()));
    }

    public static final int d(int i, LocaleList localeList) {
        Locale platformLocale;
        dsc.Companion companion = dsc.INSTANCE;
        if (dsc.j(i, companion.b())) {
            return 2;
        }
        if (dsc.j(i, companion.c())) {
            return 3;
        }
        if (dsc.j(i, companion.d())) {
            return 0;
        }
        if (dsc.j(i, companion.e())) {
            return 1;
        }
        if (!dsc.j(i, companion.a()) && !dsc.j(i, companion.f())) {
            throw new IllegalStateException("Invalid TextDirection.");
        }
        if (localeList == null || (platformLocale = localeList.d(0).getPlatformLocale()) == null) {
            platformLocale = Locale.getDefault();
        }
        int iA = f0d.a(platformLocale);
        return (iA == 0 || iA != 1) ? 2 : 3;
    }
}
