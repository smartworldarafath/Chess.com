package com.google.inputmethod;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import androidx.compose.ui.text.TextStyle;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\u0004\u001a\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u0004\u001a\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u0004\u001a\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0004\u001a\u001b\u0010\u0013\u001a\u00020\u0002*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001f\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0013\u0010\u001c\u001a\u00020\u001b*\u00020\u001bH\u0002¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0013\u0010\u001f\u001a\u00020\u0002*\u00020\u001eH\u0002¢\u0006\u0004\b\u001f\u0010\u0004¨\u0006 "}, d2 = {"Lcom/google/android/cpc;", "align", "", "m", "(I)I", "Lcom/google/android/qi5;", "hyphens", "o", "Lcom/google/android/d27$b;", "breakStrategy", "n", "Lcom/google/android/d27$c;", "lineBreakStrictness", "p", "Lcom/google/android/d27$d;", "lineBreakWordStyle", "q", "Lcom/google/android/rxc;", "maxHeight", "k", "(Lcom/google/android/rxc;I)I", "Landroidx/compose/ui/text/y;", "textStyle", "", "ellipsis", "l", "(Landroidx/compose/ui/text/y;Z)Z", "", "j", "(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;", "Lcom/google/android/jwc;", "r", "ui-text"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class km {
    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence j(CharSequence charSequence) {
        if (charSequence.length() == 0) {
            return charSequence;
        }
        Spannable spannableString = charSequence instanceof Spannable ? (Spannable) charSequence : null;
        if (spannableString == null) {
            spannableString = new SpannableString(charSequence);
        }
        if (!d0c.a(spannableString, nu5.class)) {
            b0c.y(spannableString, new nu5(), spannableString.length() - 1, spannableString.length() - 1);
        }
        return spannableString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int k(rxc rxcVar, int i) {
        int lineCount = rxcVar.getLineCount();
        for (int i2 = 0; i2 < lineCount; i2++) {
            if (rxcVar.l(i2) > i) {
                return i2;
            }
        }
        return rxcVar.getLineCount();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean l(TextStyle textStyle, boolean z) {
        if (z && !b0d.e(textStyle.q(), c0d.i(0)) && !b0d.e(textStyle.q(), b0d.INSTANCE.a())) {
            int iZ = textStyle.z();
            cpc.Companion companion = cpc.INSTANCE;
            if (!cpc.k(iZ, companion.g()) && !cpc.k(textStyle.z(), companion.f()) && !cpc.k(textStyle.z(), companion.c())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int m(int i) {
        cpc.Companion companion = cpc.INSTANCE;
        if (cpc.k(i, companion.d())) {
            return 3;
        }
        if (cpc.k(i, companion.e())) {
            return 4;
        }
        if (cpc.k(i, companion.a())) {
            return 2;
        }
        return (!cpc.k(i, companion.f()) && cpc.k(i, companion.b())) ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int n(int i) {
        d27.b.Companion companion = d27.b.INSTANCE;
        if (d27.b.e(i, companion.c())) {
            return 0;
        }
        if (d27.b.e(i, companion.b())) {
            return 1;
        }
        return d27.b.e(i, companion.a()) ? 2 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int o(int i) {
        qi5.Companion companion = qi5.INSTANCE;
        if (qi5.g(i, companion.a())) {
            return Build.VERSION.SDK_INT <= 32 ? 2 : 4;
        }
        qi5.g(i, companion.b());
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int p(int i) {
        d27.c.Companion companion = d27.c.INSTANCE;
        if (d27.c.f(i, companion.a())) {
            return 0;
        }
        if (d27.c.f(i, companion.b())) {
            return 1;
        }
        if (d27.c.f(i, companion.c())) {
            return 2;
        }
        return d27.c.f(i, companion.d()) ? 3 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int q(int i) {
        d27.d.Companion companion = d27.d.INSTANCE;
        return (!d27.d.d(i, companion.a()) && d27.d.d(i, companion.b())) ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int r(int i) {
        jwc.Companion companion = jwc.INSTANCE;
        return (!jwc.d(i, companion.a()) && jwc.d(i, companion.b())) ? 1 : 0;
    }
}
