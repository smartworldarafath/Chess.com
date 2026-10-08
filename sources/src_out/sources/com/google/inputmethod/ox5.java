package com.google.inputmethod;

import androidx.compose.ui.text.b;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a#\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/text/b$b;", "", "id", "alternateText", "", "a", "(Landroidx/compose/ui/text/b$b;Ljava/lang/String;Ljava/lang/String;)V", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class ox5 {
    public static final void a(b.C0062b c0062b, String str, String str2) {
        if (!(str2.length() > 0)) {
            cx5.a("alternateText can't be an empty string.");
        }
        c0062b.q("androidx.compose.foundation.text.inlineContent", str);
        c0062b.j(str2);
        c0062b.n();
    }

    public static /* synthetic */ void b(b.C0062b c0062b, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = "�";
        }
        a(c0062b, str, str2);
    }
}
