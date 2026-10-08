package com.google.inputmethod;

import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001b\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/google/android/rn8;", "Lcom/google/android/gba;", "rect", "b", "(JLcom/google/android/gba;)J", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class xxc {
    /* JADX INFO: Access modifiers changed from: private */
    public static final long b(long j, gba gbaVar) {
        float right;
        float bottom;
        int i = (int) (j >> 32);
        if (Float.intBitsToFloat(i) < gbaVar.getLeft()) {
            right = gbaVar.getLeft();
        } else {
            right = Float.intBitsToFloat(i) > gbaVar.getRight() ? gbaVar.getRight() : Float.intBitsToFloat(i);
        }
        int i2 = (int) (j & 4294967295L);
        if (Float.intBitsToFloat(i2) < gbaVar.getTop()) {
            bottom = gbaVar.getTop();
        } else {
            bottom = Float.intBitsToFloat(i2) > gbaVar.getBottom() ? gbaVar.getBottom() : Float.intBitsToFloat(i2);
        }
        return rn8.e((((long) Float.floatToRawIntBits(right)) << 32) | (((long) Float.floatToRawIntBits(bottom)) & 4294967295L));
    }
}
