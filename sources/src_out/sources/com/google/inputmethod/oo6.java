package com.google.inputmethod;

import kotlin.Metadata;
import kotlin.ranges.g;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\u001a/\u0010\b\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\b\u0010\t\u001a/\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a'\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\nH\u0000¢\u0006\u0004\b\u000e\u0010\u000f\"\u0018\u0010\u0012\u001a\u00020\u0002*\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/google/android/kx1;", "constraints", "", "softWrap", "Lcom/google/android/uyc;", "overflow", "", "maxIntrinsicWidth", "a", "(JZIF)J", "", "c", "(JZIF)I", "maxLinesIn", "b", "(ZII)I", "d", "(I)Z", "isEllipsis", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class oo6 {
    public static final long a(long j, boolean z, int i, float f) {
        return kx1.INSTANCE.b(0, c(j, z, i, f), 0, kx1.k(j));
    }

    public static final int b(boolean z, int i, int i2) {
        if (z || !d(i)) {
            return g.e(i2, 1);
        }
        return 1;
    }

    public static final int c(long j, boolean z, int i, float f) {
        int iL = ((z || d(i)) && kx1.h(j)) ? kx1.l(j) : Integer.MAX_VALUE;
        return kx1.n(j) == iL ? iL : g.o(csc.a(f), kx1.n(j), iL);
    }

    public static final boolean d(int i) {
        uyc.Companion companion = uyc.INSTANCE;
        return uyc.g(i, companion.b()) || uyc.g(i, companion.d()) || uyc.g(i, companion.c());
    }
}
