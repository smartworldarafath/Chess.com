package com.google.inputmethod;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u0000 \u00042\u00020\u0001:\u00015B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\f¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u000f\u0010\u001aJ+\u0010\u001e\u001a\u00020\f2\b\b\u0002\u0010\u001b\u001a\u00020\u00172\b\b\u0002\u0010\u001c\u001a\u00020\u00172\b\b\u0002\u0010\u001d\u001a\u00020\u0017¢\u0006\u0004\b\u001e\u0010\u001fJ+\u0010 \u001a\u00020\f2\b\b\u0002\u0010\u001b\u001a\u00020\u00172\b\b\u0002\u0010\u001c\u001a\u00020\u00172\b\b\u0002\u0010\u001d\u001a\u00020\u0017¢\u0006\u0004\b \u0010\u001fJ{\u0010,\u001a\u00020\f2\b\b\u0002\u0010!\u001a\u00020\u00172\b\b\u0002\u0010\"\u001a\u00020\u00172\b\b\u0002\u0010#\u001a\u00020\u00172\b\b\u0002\u0010$\u001a\u00020\u00172\b\b\u0002\u0010%\u001a\u00020\u00172\b\b\u0002\u0010&\u001a\u00020\u00172\b\b\u0002\u0010'\u001a\u00020\u00172\b\b\u0002\u0010(\u001a\u00020\u00172\b\b\u0002\u0010)\u001a\u00020\u00172\b\b\u0002\u0010*\u001a\u00020\u00172\b\b\u0002\u0010+\u001a\u00020\u0017¢\u0006\u0004\b,\u0010-J\u0010\u0010/\u001a\u00020.HÖ\u0001¢\u0006\u0004\b/\u00100J\u001a\u00103\u001a\u0002022\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b3\u00104R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u00069"}, d2 = {"Lcom/google/android/zh7;", "", "", "values", "b", "([F)[F", "Lcom/google/android/rn8;", "point", "g", "([FJ)J", "Lcom/google/android/i58;", "rect", "", "h", "([FLcom/google/android/i58;)V", "m", "p", "([F[F)V", "", "q", "([F)Ljava/lang/String;", "i", "([F)V", "", "degrees", "l", "([FF)V", "x", "y", "z", "n", "([FFFF)V", "r", "pivotX", "pivotY", "translationX", "translationY", "translationZ", "rotationX", "rotationY", "rotationZ", "scaleX", "scaleY", "scaleZ", "j", "([FFFFFFFFFFFF)V", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "[F", "getValues", "()[F", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class zh7 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final float[] values;

    private /* synthetic */ zh7(float[] fArr) {
        this.values = fArr;
    }

    public static final /* synthetic */ zh7 a(float[] fArr) {
        return new zh7(fArr);
    }

    public static float[] b(float[] fArr) {
        return fArr;
    }

    public static /* synthetic */ float[] c(float[] fArr, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            fArr = new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
        }
        return b(fArr);
    }

    public static boolean d(float[] fArr, Object obj) {
        return (obj instanceof zh7) && Intrinsics.e(fArr, ((zh7) obj).getValues());
    }

    public static final boolean e(float[] fArr, float[] fArr2) {
        return Intrinsics.e(fArr, fArr2);
    }

    public static int f(float[] fArr) {
        return Arrays.hashCode(fArr);
    }

    public static final long g(float[] fArr, long j) {
        if (fArr.length < 16) {
            return j;
        }
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[3];
        float f4 = fArr[4];
        float f5 = fArr[5];
        float f6 = fArr[7];
        float f7 = fArr[12];
        float f8 = fArr[13];
        float f9 = fArr[15];
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        float f10 = 1 / (((f3 * fIntBitsToFloat) + (f6 * fIntBitsToFloat2)) + f9);
        if ((Float.floatToRawIntBits(f10) & Integer.MAX_VALUE) >= 2139095040) {
            f10 = 0.0f;
        }
        return rn8.e((((long) Float.floatToRawIntBits((((f * fIntBitsToFloat) + (f4 * fIntBitsToFloat2)) + f7) * f10)) << 32) | (((long) Float.floatToRawIntBits(f10 * ((f2 * fIntBitsToFloat) + (f5 * fIntBitsToFloat2) + f8))) & 4294967295L));
    }

    public static final void h(float[] fArr, MutableRect mutableRect) {
        if (fArr.length < 16) {
            return;
        }
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[3];
        float f4 = fArr[4];
        float f5 = fArr[5];
        float f6 = fArr[7];
        float f7 = fArr[12];
        float f8 = fArr[13];
        float f9 = fArr[15];
        float left = mutableRect.getLeft();
        float top = mutableRect.getTop();
        float right = mutableRect.getRight();
        float bottom = mutableRect.getBottom();
        float f10 = f3 * left;
        float f11 = f6 * top;
        float f12 = 1.0f / ((f10 + f11) + f9);
        if ((Float.floatToRawIntBits(f12) & Integer.MAX_VALUE) >= 2139095040) {
            f12 = 0.0f;
        }
        float f13 = f * left;
        float f14 = f4 * top;
        float f15 = f12 * (f13 + f14 + f7);
        float f16 = left * f2;
        float f17 = top * f5;
        float f18 = f12 * (f16 + f17 + f8);
        float f19 = f6 * bottom;
        float f20 = 1.0f / ((f10 + f19) + f9);
        if ((Float.floatToRawIntBits(f20) & Integer.MAX_VALUE) >= 2139095040) {
            f20 = 0.0f;
        }
        float f21 = f4 * bottom;
        float f22 = (f13 + f21 + f7) * f20;
        float f23 = f5 * bottom;
        float f24 = f20 * (f16 + f23 + f8);
        float f25 = f3 * right;
        float f26 = 1.0f / ((f11 + f25) + f9);
        if ((Float.floatToRawIntBits(f26) & Integer.MAX_VALUE) >= 2139095040) {
            f26 = 0.0f;
        }
        float f27 = f * right;
        float f28 = f26 * (f27 + f14 + f7);
        float f29 = right * f2;
        float f30 = f26 * (f17 + f29 + f8);
        float f31 = 1.0f / ((f25 + f19) + f9);
        float f32 = (Float.floatToRawIntBits(f31) & Integer.MAX_VALUE) < 2139095040 ? f31 : 0.0f;
        float f33 = (f27 + f21 + f7) * f32;
        float f34 = f32 * (f29 + f23 + f8);
        mutableRect.i(Math.min(f15, Math.min(f22, Math.min(f28, f33))));
        mutableRect.k(Math.min(f18, Math.min(f24, Math.min(f30, f34))));
        mutableRect.j(Math.max(f15, Math.max(f22, Math.max(f28, f33))));
        mutableRect.h(Math.max(f18, Math.max(f24, Math.max(f30, f34))));
    }

    public static final void i(float[] fArr) {
        if (fArr.length < 16) {
            return;
        }
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 0.0f;
        fArr[5] = 1.0f;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 1.0f;
        fArr[11] = 0.0f;
        fArr[12] = 0.0f;
        fArr[13] = 0.0f;
        fArr[14] = 0.0f;
        fArr[15] = 1.0f;
    }

    public static final void j(float[] fArr, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11) {
        double d = ((double) f6) * 0.017453292519943295d;
        float fSin = (float) Math.sin(d);
        float fCos = (float) Math.cos(d);
        float f12 = -fSin;
        float f13 = (f4 * fCos) - (f5 * fSin);
        float f14 = (f4 * fSin) + (f5 * fCos);
        double d2 = ((double) f7) * 0.017453292519943295d;
        float fSin2 = (float) Math.sin(d2);
        float fCos2 = (float) Math.cos(d2);
        float f15 = -fSin2;
        float f16 = fSin * fSin2;
        float f17 = fSin * fCos2;
        float f18 = fCos * fSin2;
        float f19 = fCos * fCos2;
        float f20 = (f3 * fCos2) + (f14 * fSin2);
        float f21 = ((-f3) * fSin2) + (f14 * fCos2);
        double d3 = ((double) f8) * 0.017453292519943295d;
        float fSin3 = (float) Math.sin(d3);
        float fCos3 = (float) Math.cos(d3);
        float f22 = -fSin3;
        float f23 = (f22 * fCos2) + (fCos3 * f16);
        float f24 = fCos * fCos3;
        float f25 = (f22 * f15) + (fCos3 * f17);
        float f26 = ((fCos2 * fCos3) + (f16 * fSin3)) * f9;
        float f27 = fSin3 * fCos * f9;
        float f28 = ((fCos3 * f15) + (fSin3 * f17)) * f9;
        float f29 = f23 * f10;
        float f30 = f24 * f10;
        float f31 = f25 * f10;
        float f32 = f18 * f11;
        float f33 = f12 * f11;
        float f34 = f19 * f11;
        if (fArr.length < 16) {
            return;
        }
        fArr[0] = f26;
        fArr[1] = f27;
        fArr[2] = f28;
        fArr[3] = 0.0f;
        fArr[4] = f29;
        fArr[5] = f30;
        fArr[6] = f31;
        fArr[7] = 0.0f;
        fArr[8] = f32;
        fArr[9] = f33;
        fArr[10] = f34;
        fArr[11] = 0.0f;
        float f35 = -f;
        fArr[12] = ((f26 * f35) - (f29 * f2)) + f20 + f;
        fArr[13] = ((f27 * f35) - (f30 * f2)) + f13 + f2;
        fArr[14] = ((f35 * f28) - (f2 * f31)) + f21;
        fArr[15] = 1.0f;
    }

    public static /* synthetic */ void k(float[] fArr, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        if ((i & 4) != 0) {
            f3 = 0.0f;
        }
        if ((i & 8) != 0) {
            f4 = 0.0f;
        }
        if ((i & 16) != 0) {
            f5 = 0.0f;
        }
        if ((i & 32) != 0) {
            f6 = 0.0f;
        }
        if ((i & 64) != 0) {
            f7 = 0.0f;
        }
        if ((i & 128) != 0) {
            f8 = 0.0f;
        }
        if ((i & 256) != 0) {
            f9 = 1.0f;
        }
        if ((i & 512) != 0) {
            f10 = 1.0f;
        }
        if ((i & 1024) != 0) {
            f11 = 1.0f;
        }
        j(fArr, f, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11);
    }

    public static final void l(float[] fArr, float f) {
        if (fArr.length < 16) {
            return;
        }
        double d = ((double) f) * 0.017453292519943295d;
        float fSin = (float) Math.sin(d);
        float fCos = (float) Math.cos(d);
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[5];
        float f5 = fArr[6];
        float f6 = fArr[9];
        float f7 = fArr[10];
        float f8 = fArr[13];
        float f9 = fArr[14];
        fArr[1] = (f2 * fCos) - (f3 * fSin);
        fArr[2] = (f2 * fSin) + (f3 * fCos);
        fArr[5] = (f4 * fCos) - (f5 * fSin);
        fArr[6] = (f4 * fSin) + (f5 * fCos);
        fArr[9] = (f6 * fCos) - (f7 * fSin);
        fArr[10] = (f6 * fSin) + (f7 * fCos);
        fArr[13] = (f8 * fCos) - (f9 * fSin);
        fArr[14] = (f8 * fSin) + (f9 * fCos);
    }

    public static final void m(float[] fArr, float f) {
        if (fArr.length < 16) {
            return;
        }
        double d = ((double) f) * 0.017453292519943295d;
        float fSin = (float) Math.sin(d);
        float fCos = (float) Math.cos(d);
        float f2 = fArr[0];
        float f3 = fArr[4];
        float f4 = (fCos * f2) + (fSin * f3);
        float f5 = -fSin;
        float f6 = fArr[1];
        float f7 = fArr[5];
        float f8 = (fCos * f6) + (fSin * f7);
        float f9 = fArr[2];
        float f10 = fArr[6];
        float f11 = (fCos * f9) + (fSin * f10);
        float f12 = fArr[3];
        float f13 = fArr[7];
        fArr[0] = f4;
        fArr[1] = f8;
        fArr[2] = f11;
        fArr[3] = (fCos * f12) + (fSin * f13);
        fArr[4] = (f2 * f5) + (f3 * fCos);
        fArr[5] = (f6 * f5) + (f7 * fCos);
        fArr[6] = (f9 * f5) + (f10 * fCos);
        fArr[7] = (f5 * f12) + (fCos * f13);
    }

    public static final void n(float[] fArr, float f, float f2, float f3) {
        if (fArr.length < 16) {
            return;
        }
        fArr[0] = fArr[0] * f;
        fArr[1] = fArr[1] * f;
        fArr[2] = fArr[2] * f;
        fArr[3] = fArr[3] * f;
        fArr[4] = fArr[4] * f2;
        fArr[5] = fArr[5] * f2;
        fArr[6] = fArr[6] * f2;
        fArr[7] = fArr[7] * f2;
        fArr[8] = fArr[8] * f3;
        fArr[9] = fArr[9] * f3;
        fArr[10] = fArr[10] * f3;
        fArr[11] = fArr[11] * f3;
    }

    public static /* synthetic */ void o(float[] fArr, float f, float f2, float f3, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        if ((i & 2) != 0) {
            f2 = 1.0f;
        }
        if ((i & 4) != 0) {
            f3 = 1.0f;
        }
        n(fArr, f, f2, f3);
    }

    public static final void p(float[] fArr, float[] fArr2) {
        if (fArr.length >= 16 && fArr2.length >= 16) {
            float f = fArr[0];
            float f2 = fArr2[0];
            float f3 = fArr[1];
            float f4 = fArr2[4];
            float f5 = fArr[2];
            float f6 = fArr2[8];
            float f7 = fArr[3];
            float f8 = fArr2[12];
            float f9 = (f * f2) + (f3 * f4) + (f5 * f6) + (f7 * f8);
            float f10 = fArr2[1];
            float f11 = fArr2[5];
            float f12 = fArr2[9];
            float f13 = fArr2[13];
            float f14 = (f * f10) + (f3 * f11) + (f5 * f12) + (f7 * f13);
            float f15 = fArr2[2];
            float f16 = fArr2[6];
            float f17 = fArr2[10];
            float f18 = fArr2[14];
            float f19 = (f * f15) + (f3 * f16) + (f5 * f17) + (f7 * f18);
            float f20 = fArr2[3];
            float f21 = fArr2[7];
            float f22 = fArr2[11];
            float f23 = fArr2[15];
            float f24 = (f * f20) + (f3 * f21) + (f5 * f22) + (f7 * f23);
            float f25 = fArr[4];
            float f26 = fArr[5];
            float f27 = fArr[6];
            float f28 = fArr[7];
            float f29 = (f25 * f2) + (f26 * f4) + (f27 * f6) + (f28 * f8);
            float f30 = (f25 * f10) + (f26 * f11) + (f27 * f12) + (f28 * f13);
            float f31 = (f25 * f15) + (f26 * f16) + (f27 * f17) + (f28 * f18);
            float f32 = (f25 * f20) + (f26 * f21) + (f27 * f22) + (f28 * f23);
            float f33 = fArr[8];
            float f34 = fArr[9];
            float f35 = fArr[10];
            float f36 = fArr[11];
            float f37 = (f33 * f2) + (f34 * f4) + (f35 * f6) + (f36 * f8);
            float f38 = (f33 * f10) + (f34 * f11) + (f35 * f12) + (f36 * f13);
            float f39 = (f33 * f15) + (f34 * f16) + (f35 * f17) + (f36 * f18);
            float f40 = (f33 * f20) + (f34 * f21) + (f35 * f22) + (f36 * f23);
            float f41 = fArr[12];
            float f42 = fArr[13];
            float f43 = (f2 * f41) + (f4 * f42);
            float f44 = fArr[14];
            float f45 = f43 + (f6 * f44);
            float f46 = fArr[15];
            fArr[0] = f9;
            fArr[1] = f14;
            fArr[2] = f19;
            fArr[3] = f24;
            fArr[4] = f29;
            fArr[5] = f30;
            fArr[6] = f31;
            fArr[7] = f32;
            fArr[8] = f37;
            fArr[9] = f38;
            fArr[10] = f39;
            fArr[11] = f40;
            fArr[12] = f45 + (f8 * f46);
            fArr[13] = (f10 * f41) + (f11 * f42) + (f12 * f44) + (f13 * f46);
            fArr[14] = (f15 * f41) + (f16 * f42) + (f17 * f44) + (f18 * f46);
            fArr[15] = (f41 * f20) + (f42 * f21) + (f44 * f22) + (f46 * f23);
        }
    }

    public static String q(float[] fArr) {
        return h.n("\n            |" + fArr[0] + ' ' + fArr[1] + ' ' + fArr[2] + ' ' + fArr[3] + "|\n            |" + fArr[4] + ' ' + fArr[5] + ' ' + fArr[6] + ' ' + fArr[7] + "|\n            |" + fArr[8] + ' ' + fArr[9] + ' ' + fArr[10] + ' ' + fArr[11] + "|\n            |" + fArr[12] + ' ' + fArr[13] + ' ' + fArr[14] + ' ' + fArr[15] + "|\n        ");
    }

    public static final void r(float[] fArr, float f, float f2, float f3) {
        if (fArr.length < 16) {
            return;
        }
        float f4 = (fArr[0] * f) + (fArr[4] * f2) + (fArr[8] * f3) + fArr[12];
        float f5 = (fArr[1] * f) + (fArr[5] * f2) + (fArr[9] * f3) + fArr[13];
        float f6 = (fArr[2] * f) + (fArr[6] * f2) + (fArr[10] * f3) + fArr[14];
        float f7 = (fArr[3] * f) + (fArr[7] * f2) + (fArr[11] * f3) + fArr[15];
        fArr[12] = f4;
        fArr[13] = f5;
        fArr[14] = f6;
        fArr[15] = f7;
    }

    public static /* synthetic */ void s(float[] fArr, float f, float f2, float f3, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        if ((i & 4) != 0) {
            f3 = 0.0f;
        }
        r(fArr, f, f2, f3);
    }

    public boolean equals(Object other) {
        return d(this.values, other);
    }

    public int hashCode() {
        return f(this.values);
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final /* synthetic */ float[] getValues() {
        return this.values;
    }

    public String toString() {
        return q(this.values);
    }
}
