package com.google.inputmethod;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J/\u0010\r\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u000f\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ'\u0010\u0010\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0012\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0015R\u0014\u0010\u001b\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001a¨\u0006\u001c"}, d2 = {"Lcom/google/android/mh4;", "Lcom/google/android/ug4;", "", "dampingRatio", "stiffness", "visibilityThreshold", "<init>", "(FFF)V", "", "playTimeNanos", "initialValue", "targetValue", "initialVelocity", "e", "(JFFF)F", "b", "d", "(FFF)F", "c", "(FFF)J", "a", "F", "getDampingRatio", "()F", "getStiffness", "Lcom/google/android/v2c;", "Lcom/google/android/v2c;", "spring", "animation-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class mh4 implements ug4 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final float dampingRatio;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final float stiffness;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final float visibilityThreshold;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final v2c spring;

    public mh4(float f, float f2, float f3) {
        this.dampingRatio = f;
        this.stiffness = f2;
        this.visibilityThreshold = f3;
        v2c v2cVar = new v2c(1.0f);
        v2cVar.c(f);
        v2cVar.e(f2);
        this.spring = v2cVar;
    }

    @Override // com.google.inputmethod.ug4
    public float b(long playTimeNanos, float initialValue, float targetValue, float initialVelocity) {
        this.spring.d(targetValue);
        return Float.intBitsToFloat((int) (this.spring.f(initialValue, initialVelocity, playTimeNanos / 1000000) & 4294967295L));
    }

    @Override // com.google.inputmethod.ug4
    public long c(float initialValue, float targetValue, float initialVelocity) {
        float fB = this.spring.b();
        float dampingRatio = this.spring.getDampingRatio();
        float f = initialValue - targetValue;
        float f2 = this.visibilityThreshold;
        return t2c.b(fB, dampingRatio, initialVelocity / f2, f / f2, 1.0f) * 1000000;
    }

    @Override // com.google.inputmethod.ug4
    public float d(float initialValue, float targetValue, float initialVelocity) {
        return 0.0f;
    }

    @Override // com.google.inputmethod.ug4
    public float e(long playTimeNanos, float initialValue, float targetValue, float initialVelocity) {
        this.spring.d(targetValue);
        return Float.intBitsToFloat((int) (this.spring.f(initialValue, initialVelocity, playTimeNanos / 1000000) >> 32));
    }

    public /* synthetic */ mh4(float f, float f2, float f3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 1.0f : f, (i & 2) != 0 ? 1500.0f : f2, (i & 4) != 0 ? 0.01f : f3);
    }
}
