package com.google.inputmethod;

import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u001c\u0010\u0002\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0082\u0002¢\u0006\u0004\b\u0002\u0010\u0003\"\u0014\u0010\u0006\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/google/android/b0d;", "other", "b", "(JJ)J", "a", "J", "DefaultFontSize", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class g38 {
    private static final long a = c0d.i(14);

    /* JADX INFO: Access modifiers changed from: private */
    public static final long b(long j, long j2) {
        if (!b0d.j(j2)) {
            throw new IllegalArgumentException("The multiplier must be in em, but was " + ((Object) b0d.l(j2)) + '.');
        }
        if (b0d.j(j)) {
            throw new IllegalStateException("Cannot convert Em to Px when style.fontSize is Em (" + ((Object) b0d.l(j2)) + "). Please declare the style.fontSize with Sp units instead.");
        }
        if (b0d.f(j) != 0) {
            float fH = b0d.h(j2);
            c0d.b(j);
            return c0d.k(b0d.f(j), b0d.h(j) * fH);
        }
        long j3 = a;
        float fH2 = b0d.h(j2);
        c0d.b(j3);
        return c0d.k(b0d.f(j3), b0d.h(j3) * fH2);
    }
}
