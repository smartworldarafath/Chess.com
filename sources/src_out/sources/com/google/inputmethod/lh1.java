package com.google.inputmethod;

import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0010\r\n\u0002\u0010\b\n\u0002\b\b\u001a\u001b\u0010\u0003\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001b\u0010\b\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\b\u0010\u0004¨\u0006\t"}, d2 = {"", "", "index", "b", "(Ljava/lang/CharSequence;I)I", "codePoint", "a", "(I)I", "c", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class lh1 {
    public static final int a(int i) {
        return Character.charCount(i);
    }

    public static final int b(CharSequence charSequence, int i) {
        return Character.codePointAt(charSequence, i);
    }

    public static final int c(CharSequence charSequence, int i) {
        return Character.codePointBefore(charSequence, i);
    }
}
