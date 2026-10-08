package com.google.inputmethod;

import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a5\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a5\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u0001\u001a\u00020\b2\b\b\u0002\u0010\u0002\u001a\u00020\b2\b\b\u0002\u0010\u0003\u001a\u00020\b2\b\b\u0002\u0010\u0004\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"", "start", "top", "end", "bottom", "Lcom/google/android/pbd;", "b", "(IIII)J", "Lcom/google/android/ff3;", "Lcom/google/android/kf3;", "a", "(FFFF)Lcom/google/android/kf3;", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class qbd {
    public static final DpTouchBoundsExpansion a(float f, float f2, float f3, float f4) {
        return new DpTouchBoundsExpansion(f, f2, f3, f4, true, null);
    }

    public static final long b(int i, int i2, int i3, int i4) {
        if (!(i >= 0 && i < 32768)) {
            zw5.a("Start must be in the range of 0 .. 32767");
        }
        if (!(i2 >= 0 && i2 < 32768)) {
            zw5.a("Top must be in the range of 0 .. 32767");
        }
        if (!(i3 >= 0 && i3 < 32768)) {
            zw5.a("End must be in the range of 0 .. 32767");
        }
        if (!(i4 >= 0 && i4 < 32768)) {
            zw5.a("Bottom must be in the range of 0 .. 32767");
        }
        return pbd.d(pbd.a.c(i, i2, i3, i4, true));
    }

    public static /* synthetic */ long c(int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = 0;
        }
        if ((i5 & 2) != 0) {
            i2 = 0;
        }
        if ((i5 & 4) != 0) {
            i3 = 0;
        }
        if ((i5 & 8) != 0) {
            i4 = 0;
        }
        return b(i, i2, i3, i4);
    }
}
