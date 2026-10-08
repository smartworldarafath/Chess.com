package com.google.inputmethod;

import android.text.Annotation;
import android.text.SpannableString;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.b;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003*\n\u0010\u0005\"\u00020\u00042\u00020\u0004¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/text/b;", "", "a", "(Landroidx/compose/ui/text/b;)Ljava/lang/CharSequence;", "Landroid/content/ClipboardManager;", "NativeClipboard", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class bj {
    public static final CharSequence a(b bVar) {
        if (bVar.g().isEmpty()) {
            return bVar.getText();
        }
        SpannableString spannableString = new SpannableString(bVar.getText());
        fs3 fs3Var = new fs3();
        List<b.Range<SpanStyle>> listG = bVar.g();
        int size = listG.size();
        for (int i = 0; i < size; i++) {
            b.Range<SpanStyle> range = listG.get(i);
            SpanStyle rVarA = range.a();
            int start = range.getStart();
            int end = range.getEnd();
            fs3Var.q();
            fs3Var.d(rVarA);
            spannableString.setSpan(new Annotation("androidx.compose.text.SpanStyle", fs3Var.p()), start, end, 33);
        }
        return spannableString;
    }
}
