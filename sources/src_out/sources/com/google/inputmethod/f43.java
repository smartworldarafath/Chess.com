package com.google.inputmethod;

import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\bg\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0017¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\u0007\u001a\u00020\u0006*\u00020\u0002H\u0017¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\n\u001a\u00020\u0003*\u00020\tH\u0017¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\f\u001a\u00020\u0006*\u00020\tH\u0017¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000e\u001a\u00020\u0002*\u00020\u0006H\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\t*\u00020\u0006H\u0017¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u0002*\u00020\u0003H\u0017¢\u0006\u0004\b\u0012\u0010\u0005J\u0013\u0010\u0013\u001a\u00020\t*\u00020\u0003H\u0017¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0017\u001a\u00020\u0016*\u00020\u0015H\u0017¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u0015*\u00020\u0016H\u0017¢\u0006\u0004\b\u0019\u0010\u0018R\u001a\u0010\u001e\u001a\u00020\u00038&X§\u0004¢\u0006\f\u0012\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001a\u0010\u001bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001fÀ\u0006\u0003"}, d2 = {"Lcom/google/android/f43;", "Lcom/google/android/hm4;", "Lcom/google/android/ff3;", "", "x2", "(F)F", "", "O1", "(F)I", "Lcom/google/android/b0d;", "T1", "(J)F", "A2", "(J)I", "O0", "(I)F", "X", "(I)J", "P0", "Y", "(F)J", "Lcom/google/android/jf3;", "Lcom/google/android/tsb;", "b1", "(J)J", "S", "getDensity", "()F", "getDensity$annotations", "()V", "density", "ui-unit"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface f43 extends hm4 {
    default int A2(long j) {
        return Math.round(T1(j));
    }

    default float O0(int i) {
        return ff3.i(i / getDensity());
    }

    default int O1(float f) {
        float fX2 = x2(f);
        if (Float.isInfinite(fX2)) {
            return Integer.MAX_VALUE;
        }
        return Math.round(fX2);
    }

    default float P0(float f) {
        return ff3.i(f / getDensity());
    }

    default long S(long j) {
        return j != 9205357640488583168L ? hf3.a(P0(Float.intBitsToFloat((int) (j >> 32))), P0(Float.intBitsToFloat((int) (j & 4294967295L)))) : jf3.INSTANCE.a();
    }

    default float T1(long j) {
        if (!d0d.g(b0d.g(j), d0d.INSTANCE.b())) {
            bx5.b("Only Sp can convert to Px");
        }
        return x2(U(j));
    }

    default long X(int i) {
        return s1(O0(i));
    }

    default long Y(float f) {
        return s1(P0(f));
    }

    default long b1(long j) {
        if (j == 9205357640488583168L) {
            return tsb.INSTANCE.a();
        }
        float fX2 = x2(jf3.h(j));
        return tsb.d((((long) Float.floatToRawIntBits(x2(jf3.g(j)))) & 4294967295L) | (Float.floatToRawIntBits(fX2) << 32));
    }

    float getDensity();

    default float x2(float f) {
        return f * getDensity();
    }
}
