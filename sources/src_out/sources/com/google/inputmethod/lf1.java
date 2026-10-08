package com.google.inputmethod;

import android.content.ClipData;
import android.content.ClipDescription;
import androidx.compose.ui.text.b;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\n\u001a\u0004\u0018\u00010\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/google/android/lf1;", "", "<init>", "()V", "Lcom/google/android/ef1;", "clipEntry", "Landroidx/compose/ui/text/b;", "b", "(Lcom/google/android/ef1;)Landroidx/compose/ui/text/b;", "annotatedString", "c", "(Landroidx/compose/ui/text/b;)Lcom/google/android/ef1;", "Lcom/google/android/jf1;", "clipboard", "", "a", "(Lcom/google/android/jf1;)Z", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class lf1 {
    public static final lf1 a = new lf1();

    private lf1() {
    }

    public static final boolean a(jf1 clipboard) {
        ClipDescription primaryClipDescription = clipboard.b().getPrimaryClipDescription();
        return primaryClipDescription != null && primaryClipDescription.hasMimeType("text/*");
    }

    public static final b b(ef1 clipEntry) {
        CharSequence text;
        ClipData.Item itemAt = clipEntry.getClipData().getItemAt(0);
        if (itemAt == null || (text = itemAt.getText()) == null) {
            return null;
        }
        return mf1.a(text);
    }

    public static final ef1 c(b annotatedString) {
        if (annotatedString == null) {
            return null;
        }
        return new ef1(ClipData.newPlainText("plain text", mf1.b(annotatedString)));
    }
}
