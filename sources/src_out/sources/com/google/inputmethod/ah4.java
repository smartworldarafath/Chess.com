package com.google.inputmethod;

import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\u000b\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\r\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\fJ\u001f\u0010\u000e\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0010\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/google/android/ah4;", "Lcom/google/android/zg4;", "", "frictionMultiplier", "absVelocityThreshold", "<init>", "(FF)V", "", "playTimeNanos", "initialValue", "initialVelocity", "e", "(JFF)F", "b", "c", "(FF)J", "d", "(FF)F", "a", "F", "()F", "friction", "animation-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ah4 implements zg4 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final float absVelocityThreshold;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final float friction;

    public ah4(float f, float f2) {
        this.absVelocityThreshold = Math.max(1.0E-7f, Math.abs(f2));
        this.friction = Math.max(1.0E-4f, f) * (-4.2f);
    }

    @Override // com.google.inputmethod.zg4
    /* JADX INFO: renamed from: a, reason: from getter */
    public float getAbsVelocityThreshold() {
        return this.absVelocityThreshold;
    }

    @Override // com.google.inputmethod.zg4
    public float b(long playTimeNanos, float initialValue, float initialVelocity) {
        return initialVelocity * ((float) Math.exp(((playTimeNanos / 1000000) / 1000.0f) * this.friction));
    }

    @Override // com.google.inputmethod.zg4
    public long c(float initialValue, float initialVelocity) {
        return ((long) ((((float) Math.log(getAbsVelocityThreshold() / Math.abs(initialVelocity))) * 1000.0f) / this.friction)) * 1000000;
    }

    @Override // com.google.inputmethod.zg4
    public float d(float initialValue, float initialVelocity) {
        if (Math.abs(initialVelocity) <= getAbsVelocityThreshold()) {
            return initialValue;
        }
        double dLog = Math.log(Math.abs(getAbsVelocityThreshold() / initialVelocity));
        float f = this.friction;
        return (initialValue - (initialVelocity / f)) + ((initialVelocity / f) * ((float) Math.exp((((double) f) * ((dLog / ((double) f)) * ((double) 1000))) / ((double) 1000.0f))));
    }

    @Override // com.google.inputmethod.zg4
    public float e(long playTimeNanos, float initialValue, float initialVelocity) {
        float f = this.friction;
        return (initialValue - (initialVelocity / f)) + ((initialVelocity / f) * ((float) Math.exp((f * (playTimeNanos / 1000000)) / 1000.0f)));
    }
}
