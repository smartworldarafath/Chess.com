package com.google.inputmethod;

import com.google.android.yg4;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0004\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a-\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000\"\u0004\b\u0000\u0010\u00062\b\b\u0003\u0010\u0007\u001a\u00020\u00012\b\b\u0003\u0010\b\u001a\u00020\u0001¢\u0006\u0004\b\t\u0010\n\u001a\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000\"\u0004\b\u0000\u0010\u0006*\u00020\u000b¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/google/android/vq2;", "", "initialValue", "initialVelocity", "a", "(Lcom/google/android/vq2;FF)F", "T", "frictionMultiplier", "absVelocityThreshold", "b", "(FF)Lcom/google/android/vq2;", "Lcom/google/android/zg4;", "d", "(Lcom/google/android/zg4;)Lcom/google/android/vq2;", "animation-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class xq2 {
    public static final float a(vq2<Float> vq2Var, float f, float f2) {
        return ((qr) vq2Var.a(w2e.N(yg4.a)).c(vr.a(f), vr.a(f2))).getValue();
    }

    public static final <T> vq2<T> b(float f, float f2) {
        return d(new ah4(f, f2));
    }

    public static /* synthetic */ vq2 c(float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.1f;
        }
        return b(f, f2);
    }

    public static final <T> vq2<T> d(zg4 zg4Var) {
        return new wq2(zg4Var);
    }
}
