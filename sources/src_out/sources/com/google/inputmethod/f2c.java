package com.google.inputmethod;

import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\u0011R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0019¨\u0006\u001b"}, d2 = {"Lcom/google/android/f2c;", "Lcom/google/android/zg4;", "Lcom/google/android/f43;", "density", "<init>", "(Lcom/google/android/f43;)V", "", "startVelocity", "f", "(F)F", "initialValue", "initialVelocity", "d", "(FF)F", "", "playTimeNanos", "e", "(JFF)F", "c", "(FF)J", "b", "Lcom/google/android/rg4;", "a", "Lcom/google/android/rg4;", "flingCalculator", "()F", "absVelocityThreshold", "animation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f2c implements zg4 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final rg4 flingCalculator;

    public f2c(f43 f43Var) {
        this.flingCalculator = new rg4(g2c.a(), f43Var);
    }

    private final float f(float startVelocity) {
        return this.flingCalculator.b(startVelocity) * Math.signum(startVelocity);
    }

    @Override // com.google.inputmethod.zg4
    /* JADX INFO: renamed from: a */
    public float getAbsVelocityThreshold() {
        return 0.0f;
    }

    @Override // com.google.inputmethod.zg4
    public float b(long playTimeNanos, float initialValue, float initialVelocity) {
        return this.flingCalculator.d(initialVelocity).b(playTimeNanos / 1000000);
    }

    @Override // com.google.inputmethod.zg4
    public long c(float initialValue, float initialVelocity) {
        return this.flingCalculator.c(initialVelocity) * 1000000;
    }

    @Override // com.google.inputmethod.zg4
    public float d(float initialValue, float initialVelocity) {
        return initialValue + f(initialVelocity);
    }

    @Override // com.google.inputmethod.zg4
    public float e(long playTimeNanos, float initialValue, float initialVelocity) {
        return initialValue + this.flingCalculator.d(initialVelocity).a(playTimeNanos / 1000000);
    }
}
