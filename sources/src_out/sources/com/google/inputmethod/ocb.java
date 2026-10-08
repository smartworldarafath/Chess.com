package com.google.inputmethod;

import android.os.Build;
import android.text.TextPaint;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"", "text", "Landroid/text/TextPaint;", "textPaint", "Lcom/google/android/ncb;", "a", "(Ljava/lang/CharSequence;Landroid/text/TextPaint;)Lcom/google/android/ncb;", "ui-text"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class ocb {
    public static final ncb a(CharSequence charSequence, TextPaint textPaint) {
        return Build.VERSION.SDK_INT >= 29 ? new g05(charSequence, textPaint) : new h05(charSequence);
    }
}
