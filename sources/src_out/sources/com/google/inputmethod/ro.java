package com.google.inputmethod;

import androidx.compose.ui.text.PlatformParagraphStyle;
import androidx.compose.ui.text.e;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0006\u001a#\u0010\u0005\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a%\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f\u001a%\u0010\r\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/google/android/vb9;", "spanStyle", "Landroidx/compose/ui/text/o;", "paragraphStyle", "Lcom/google/android/cc9;", "a", "(Lcom/google/android/vb9;Landroidx/compose/ui/text/o;)Lcom/google/android/cc9;", "start", "stop", "", "fraction", "b", "(Landroidx/compose/ui/text/o;Landroidx/compose/ui/text/o;F)Landroidx/compose/ui/text/o;", "c", "(Lcom/google/android/vb9;Lcom/google/android/vb9;F)Lcom/google/android/vb9;", "ui-text"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class ro {
    public static final PlatformTextStyle a(vb9 vb9Var, PlatformParagraphStyle platformParagraphStyle) {
        return new PlatformTextStyle(vb9Var, platformParagraphStyle);
    }

    public static final PlatformParagraphStyle b(PlatformParagraphStyle platformParagraphStyle, PlatformParagraphStyle platformParagraphStyle2, float f) {
        return platformParagraphStyle.getIncludeFontPadding() == platformParagraphStyle2.getIncludeFontPadding() ? platformParagraphStyle : new PlatformParagraphStyle(((e) wzb.e(e.d(platformParagraphStyle.getEmojiSupportMatch()), e.d(platformParagraphStyle2.getEmojiSupportMatch()), f)).getValue(), ((Boolean) wzb.e(Boolean.valueOf(platformParagraphStyle.getIncludeFontPadding()), Boolean.valueOf(platformParagraphStyle2.getIncludeFontPadding()), f)).booleanValue(), null);
    }

    public static final vb9 c(vb9 vb9Var, vb9 vb9Var2, float f) {
        return vb9Var;
    }
}
