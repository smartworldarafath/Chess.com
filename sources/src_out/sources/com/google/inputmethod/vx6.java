package com.google.inputmethod;

import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0003\u001a'\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"", "gridSize", "slotCount", "spacing", "", "b", "(III)[I", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class vx6 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final int[] b(int i, int i2, int i3) {
        int i4;
        int i5 = i - (i3 * (i2 - 1));
        int i6 = i5 / i2;
        int i7 = i5 % i2;
        int[] iArr = new int[i2];
        int i8 = 0;
        while (i8 < i2) {
            if (i6 < 0) {
                i4 = 0;
            } else {
                i4 = (i8 < i7 ? 1 : 0) + i6;
            }
            iArr[i8] = i4;
            i8++;
        }
        return iArr;
    }
}
