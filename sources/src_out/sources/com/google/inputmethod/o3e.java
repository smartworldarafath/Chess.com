package com.google.inputmethod;

import com.google.inputmethod.ur;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003BE\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010\u001f\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\tH\u0002¢\u0006\u0004\b!\u0010\"J/\u0010%\u001a\u00028\u00002\u0006\u0010$\u001a\u00020#2\u0006\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00028\u0000H\u0016¢\u0006\u0004\b%\u0010&J/\u0010'\u001a\u00028\u00002\u0006\u0010$\u001a\u00020#2\u0006\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00028\u0000H\u0016¢\u0006\u0004\b'\u0010&R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R \u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b,\u0010.R\u001a\u0010\u000b\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010-\u001a\u0004\b/\u0010.R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010-R\u0016\u00104\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u00103R\u0016\u00107\u001a\u0002058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u00106R\u0018\u00109\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u00108R\u0018\u0010:\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u00108R\u0018\u0010;\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u00108R\u0018\u0010=\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u00108R\u0016\u0010?\u001a\u0002058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u00106R\u0016\u0010A\u001a\u0002058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u00106R\u0016\u0010E\u001a\u00020B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010D¨\u0006F"}, d2 = {"Lcom/google/android/o3e;", "Lcom/google/android/ur;", "V", "Lcom/google/android/i3e;", "Lcom/google/android/x06;", "timestamps", "Lcom/google/android/e16;", "Lcom/google/android/n3e;", "keyframes", "", "durationMillis", "delayMillis", "Lcom/google/android/vl3;", "defaultEasing", "Lcom/google/android/e00;", "initialArcMode", "<init>", "(Lcom/google/android/x06;Lcom/google/android/e16;IILcom/google/android/vl3;ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "initialValue", "targetValue", "initialVelocity", "", "k", "(Lcom/google/android/ur;Lcom/google/android/ur;Lcom/google/android/ur;)V", "timeMillis", "", "i", "(I)F", "index", "", "asFraction", "j", "(IIZ)F", "h", "(I)I", "", "playTimeNanos", "g", "(JLcom/google/android/ur;Lcom/google/android/ur;Lcom/google/android/ur;)Lcom/google/android/ur;", "d", "a", "Lcom/google/android/x06;", "b", "Lcom/google/android/e16;", "c", "I", "()I", "f", "e", "Lcom/google/android/vl3;", "", "[I", "modes", "", "[F", "times", "Lcom/google/android/ur;", "valueVector", "velocityVector", "lastInitialValue", "l", "lastTargetValue", "m", "posArray", "n", "slopeArray", "Lcom/google/android/f00;", "o", "Lcom/google/android/f00;", "arcSpline", "animation-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class o3e<V extends ur> implements i3e<V> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final x06 timestamps;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final e16<VectorizedKeyframeSpecElementInfo<V>> keyframes;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int durationMillis;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final int delayMillis;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final vl3 defaultEasing;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final int initialArcMode;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private int[] modes;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private float[] times;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private V valueVector;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private V velocityVector;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private V lastInitialValue;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private V lastTargetValue;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private float[] posArray;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private float[] slopeArray;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private f00 arcSpline;

    public /* synthetic */ o3e(x06 x06Var, e16 e16Var, int i, int i2, vl3 vl3Var, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(x06Var, e16Var, i, i2, vl3Var, i3);
    }

    private final int h(int timeMillis) {
        int iB = x06.b(this.timestamps, timeMillis, 0, 0, 6, null);
        return iB < -1 ? -(iB + 2) : iB;
    }

    private final float i(int timeMillis) {
        return j(h(timeMillis), timeMillis, false);
    }

    private final float j(int index, int timeMillis, boolean asFraction) {
        vl3 easing;
        float f;
        x06 x06Var = this.timestamps;
        if (index >= x06Var._size - 1) {
            f = timeMillis;
        } else {
            int iE = x06Var.e(index);
            int iE2 = this.timestamps.e(index + 1);
            if (timeMillis == iE) {
                f = iE;
            } else {
                int i = iE2 - iE;
                VectorizedKeyframeSpecElementInfo<V> vectorizedKeyframeSpecElementInfoB = this.keyframes.b(iE);
                if (vectorizedKeyframeSpecElementInfoB == null || (easing = vectorizedKeyframeSpecElementInfoB.getEasing()) == null) {
                    easing = this.defaultEasing;
                }
                float f2 = i;
                float fA = easing.a((timeMillis - iE) / f2);
                if (asFraction) {
                    return fA;
                }
                f = (f2 * fA) + iE;
            }
        }
        return f / 1000;
    }

    private final void k(V initialValue, V targetValue, V initialVelocity) {
        float[] fArr;
        boolean z = this.arcSpline != g3e.c;
        if (this.valueVector == null) {
            this.valueVector = (V) vr.g(initialValue);
            this.velocityVector = (V) vr.g(initialVelocity);
            int i = this.timestamps._size;
            float[] fArr2 = new float[i];
            for (int i2 = 0; i2 < i; i2++) {
                fArr2[i2] = this.timestamps.e(i2) / 1000;
            }
            this.times = fArr2;
            int i3 = this.timestamps._size;
            int[] iArr = new int[i3];
            for (int i4 = 0; i4 < i3; i4++) {
                VectorizedKeyframeSpecElementInfo<V> vectorizedKeyframeSpecElementInfoB = this.keyframes.b(this.timestamps.e(i4));
                int arcMode = vectorizedKeyframeSpecElementInfoB != null ? vectorizedKeyframeSpecElementInfoB.getArcMode() : this.initialArcMode;
                if (!e00.c(arcMode, e00.INSTANCE.a())) {
                    z = true;
                }
                iArr[i4] = arcMode;
            }
            this.modes = iArr;
        }
        if (z) {
            if (this.arcSpline != g3e.c && Intrinsics.e(this.lastInitialValue, initialValue) && Intrinsics.e(this.lastTargetValue, targetValue)) {
                return;
            }
            this.lastInitialValue = initialValue;
            this.lastTargetValue = targetValue;
            int size = (initialValue.getSize() % 2) + initialValue.getSize();
            this.posArray = new float[size];
            this.slopeArray = new float[size];
            int i5 = this.timestamps._size;
            float[][] fArr3 = new float[i5][];
            for (int i6 = 0; i6 < i5; i6++) {
                int iE = this.timestamps.e(i6);
                VectorizedKeyframeSpecElementInfo<V> vectorizedKeyframeSpecElementInfoB2 = this.keyframes.b(iE);
                if (iE == 0 && vectorizedKeyframeSpecElementInfoB2 == null) {
                    fArr = new float[size];
                    for (int i7 = 0; i7 < size; i7++) {
                        fArr[i7] = initialValue.a(i7);
                    }
                } else if (iE == getDurationMillis() && vectorizedKeyframeSpecElementInfoB2 == null) {
                    fArr = new float[size];
                    for (int i8 = 0; i8 < size; i8++) {
                        fArr[i8] = targetValue.a(i8);
                    }
                } else {
                    Intrinsics.g(vectorizedKeyframeSpecElementInfoB2);
                    ur urVarC = vectorizedKeyframeSpecElementInfoB2.c();
                    float[] fArr4 = new float[size];
                    for (int i9 = 0; i9 < size; i9++) {
                        fArr4[i9] = urVarC.a(i9);
                    }
                    fArr = fArr4;
                }
                fArr3[i6] = fArr;
            }
            this.arcSpline = new f00(this.modes, this.times, fArr3);
        }
    }

    @Override // com.google.inputmethod.i3e
    /* JADX INFO: renamed from: c, reason: from getter */
    public int getDurationMillis() {
        return this.durationMillis;
    }

    @Override // com.google.inputmethod.f3e
    public V d(long playTimeNanos, V initialValue, V targetValue, V initialVelocity) {
        long jE = g3e.e(this, playTimeNanos / 1000000);
        if (jE < 0) {
            return initialVelocity;
        }
        k(initialValue, targetValue, initialVelocity);
        V v = this.velocityVector;
        Intrinsics.g(v);
        int i = 0;
        if (this.arcSpline != g3e.c) {
            float fI = i((int) jE);
            float[] fArr = this.slopeArray;
            this.arcSpline.b(fI, fArr);
            int length = fArr.length;
            while (i < length) {
                v.e(i, fArr[i]);
                i++;
            }
        } else {
            ur urVarG = g3e.g(this, jE - 1, initialValue, targetValue, initialVelocity);
            ur urVarG2 = g3e.g(this, jE, initialValue, targetValue, initialVelocity);
            int size = urVarG.getSize();
            while (i < size) {
                v.e(i, (urVarG.a(i) - urVarG2.a(i)) * 1000.0f);
                i++;
            }
        }
        return v;
    }

    @Override // com.google.inputmethod.i3e
    /* JADX INFO: renamed from: f, reason: from getter */
    public int getDelayMillis() {
        return this.delayMillis;
    }

    @Override // com.google.inputmethod.f3e
    public V g(long playTimeNanos, V initialValue, V targetValue, V initialVelocity) {
        ur urVarC;
        ur urVarC2;
        int iE = (int) g3e.e(this, playTimeNanos / 1000000);
        VectorizedKeyframeSpecElementInfo<V> vectorizedKeyframeSpecElementInfoB = this.keyframes.b(iE);
        if (vectorizedKeyframeSpecElementInfoB != null) {
            return (V) vectorizedKeyframeSpecElementInfoB.c();
        }
        if (iE >= getDurationMillis()) {
            return targetValue;
        }
        if (iE <= 0) {
            return initialValue;
        }
        k(initialValue, targetValue, initialVelocity);
        V v = this.valueVector;
        Intrinsics.g(v);
        int i = 0;
        if (this.arcSpline != g3e.c) {
            float fI = i(iE);
            float[] fArr = this.posArray;
            this.arcSpline.a(fI, fArr);
            int length = fArr.length;
            while (i < length) {
                v.e(i, fArr[i]);
                i++;
            }
            return v;
        }
        int iH = h(iE);
        float fJ = j(iH, iE, true);
        VectorizedKeyframeSpecElementInfo<V> vectorizedKeyframeSpecElementInfoB2 = this.keyframes.b(this.timestamps.e(iH));
        if (vectorizedKeyframeSpecElementInfoB2 != null && (urVarC2 = vectorizedKeyframeSpecElementInfoB2.c()) != null) {
            initialValue = (V) urVarC2;
        }
        VectorizedKeyframeSpecElementInfo<V> vectorizedKeyframeSpecElementInfoB3 = this.keyframes.b(this.timestamps.e(iH + 1));
        if (vectorizedKeyframeSpecElementInfoB3 != null && (urVarC = vectorizedKeyframeSpecElementInfoB3.c()) != null) {
            targetValue = (V) urVarC;
        }
        int size = v.getSize();
        while (i < size) {
            v.e(i, (initialValue.a(i) * (1 - fJ)) + (targetValue.a(i) * fJ));
            i++;
        }
        return v;
    }

    private o3e(x06 x06Var, e16<VectorizedKeyframeSpecElementInfo<V>> e16Var, int i, int i2, vl3 vl3Var, int i3) {
        this.timestamps = x06Var;
        this.keyframes = e16Var;
        this.durationMillis = i;
        this.delayMillis = i2;
        this.defaultEasing = vl3Var;
        this.initialArcMode = i3;
        this.modes = g3e.a;
        this.times = g3e.b;
        this.posArray = g3e.b;
        this.slopeArray = g3e.b;
        this.arcSpline = g3e.c;
    }
}
