package com.google.inputmethod;

import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a!\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"", "splinePositions", "splineTimes", "", "nbSamples", "", "b", "([F[FI)V", "T", "Lcom/google/android/f43;", "density", "Lcom/google/android/vq2;", "c", "(Lcom/google/android/f43;)Lcom/google/android/vq2;", "animation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class e2c {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(float[] fArr, float[] fArr2, int i) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10 = 0.0f;
        int i2 = 0;
        float f11 = 0.0f;
        while (true) {
            float f12 = 1.0f;
            if (i2 >= i) {
                fArr2[i] = 1.0f;
                fArr[i] = 1.0f;
                return;
            }
            float f13 = i2 / i;
            float f14 = 1.0f;
            while (true) {
                f = ((f14 - f10) / 2.0f) + f10;
                f2 = f12 - f;
                f3 = f * 3.0f * f2;
                f4 = f * f * f;
                float f15 = (((f2 * 0.175f) + (f * 0.35000002f)) * f3) + f4;
                f5 = f12;
                if (Math.abs(f15 - f13) < 1.0E-5d) {
                    break;
                }
                if (f15 > f13) {
                    f14 = f;
                } else {
                    f10 = f;
                }
                f12 = f5;
            }
            float f16 = 0.5f;
            fArr[i2] = (f3 * ((f2 * 0.5f) + f)) + f4;
            float f17 = f5;
            while (true) {
                f6 = ((f17 - f11) / 2.0f) + f11;
                f7 = f5 - f6;
                f8 = f6 * 3.0f * f7;
                f9 = f6 * f6 * f6;
                float f18 = (((f7 * f16) + f6) * f8) + f9;
                float f19 = f13;
                if (Math.abs(f18 - f13) >= 1.0E-5d) {
                    if (f18 > f19) {
                        f17 = f6;
                    } else {
                        f11 = f6;
                    }
                    f13 = f19;
                    f16 = 0.5f;
                }
            }
            fArr2[i2] = (f8 * ((f7 * 0.175f) + (f6 * 0.35000002f))) + f9;
            i2++;
        }
    }

    public static final <T> vq2<T> c(f43 f43Var) {
        return xq2.d(new f2c(f43Var));
    }
}
