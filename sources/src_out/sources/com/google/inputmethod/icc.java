package com.google.inputmethod;

import android.os.Build;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0005\"\u001a\u0010\u0004\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0001\u0010\u0003¨\u0006\u0005"}, d2 = {"", "a", "Z", "()Z", "isStylusHandwritingSupported", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class icc {
    private static final boolean a;

    static {
        a = Build.VERSION.SDK_INT >= 34;
    }

    public static final boolean a() {
        return a;
    }
}
