package com.google.inputmethod;

import android.text.Html;
import android.text.Spanned;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public final class bg5 {

    static class a {
        static Spanned a(String str, int i) {
            return Html.fromHtml(str, i);
        }

        static Spanned b(String str, int i, Html.ImageGetter imageGetter, Html.TagHandler tagHandler) {
            return Html.fromHtml(str, i, imageGetter, tagHandler);
        }
    }

    public static Spanned a(String str, int i) {
        return a.a(str, i);
    }

    public static Spanned b(String str, int i, Html.ImageGetter imageGetter, Html.TagHandler tagHandler) {
        return a.b(str, i, imageGetter, tagHandler);
    }
}
