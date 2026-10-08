package com.google.inputmethod;

import androidx.compose.ui.text.TextStyle;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u001a\u0010\u0005\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004\"\u001a\u0010\n\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0001\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/google/android/g27;", "a", "Lcom/google/android/g27;", "getDefaultLineHeightStyle", "()Lcom/google/android/g27;", "DefaultLineHeightStyle", "Landroidx/compose/ui/text/y;", "b", "Landroidx/compose/ui/text/y;", "()Landroidx/compose/ui/text/y;", "DefaultTextStyle", "material3"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class zod {
    private static final LineHeightStyle a;
    private static final TextStyle b;

    static {
        LineHeightStyle lineHeightStyle = new LineHeightStyle(LineHeightStyle.a.INSTANCE.a(), LineHeightStyle.d.INSTANCE.b(), (DefaultConstructorMarker) null);
        a = lineHeightStyle;
        b = TextStyle.c(TextStyle.INSTANCE.a(), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, my2.a(), lineHeightStyle, 0, 0, null, 15204351, null);
    }

    public static final TextStyle a() {
        return b;
    }
}
