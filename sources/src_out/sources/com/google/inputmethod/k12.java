package com.google.inputmethod;

import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\u001a1\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a/\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\t\u001a/\u0010\n\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\t\u001a'\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a'\u0010\r\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\f\u001a'\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\f\u001a'\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\f¨\u0006\u0010"}, d2 = {"", "position", "popupLength", "windowLength", "", "closeAffinity", "b", "(IIIZ)I", "h", "(IIIZ)Z", "g", "e", "(IIZ)I", "d", "f", "a", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class k12 {
    private static final int a(int i, int i2, boolean z) {
        return f(i, i2, !z);
    }

    public static final int b(int i, int i2, int i3, boolean z) {
        if (i2 >= i3) {
            return f(i2, i3, z);
        }
        if (g(i, i2, i3, z)) {
            return e(i, i2, z);
        }
        return h(i, i2, i3, z) ? d(i, i2, z) : a(i2, i3, z);
    }

    public static /* synthetic */ int c(int i, int i2, int i3, boolean z, int i4, Object obj) {
        if ((i4 & 8) != 0) {
            z = true;
        }
        return b(i, i2, i3, z);
    }

    private static final int d(int i, int i2, boolean z) {
        return e(i, i2, !z);
    }

    private static final int e(int i, int i2, boolean z) {
        return z ? i : i - i2;
    }

    private static final int f(int i, int i2, boolean z) {
        if (z) {
            return 0;
        }
        return i2 - i;
    }

    private static final boolean g(int i, int i2, int i3, boolean z) {
        return h(i, i2, i3, !z);
    }

    private static final boolean h(int i, int i2, int i3, boolean z) {
        if (z) {
            return i2 <= i;
        }
        return i3 - i2 > i;
    }
}
