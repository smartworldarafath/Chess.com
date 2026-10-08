package com.google.inputmethod;

import kotlin.Metadata;
import kotlin.text.h;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u0017\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"", "text", "b", "(Ljava/lang/String;)Ljava/lang/String;", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class ra0 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String b(String str) {
        if (str.length() < 5000) {
            return str;
        }
        return (Character.isHighSurrogate(str.charAt(4999)) && Character.isLowSurrogate(str.charAt(5000))) ? h.d2(str, 4999) : h.d2(str, 5000);
    }
}
