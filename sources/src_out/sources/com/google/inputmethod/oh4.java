package com.google.inputmethod;

import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0013\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0011\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J/\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001b¨\u0006\u001e"}, d2 = {"Lcom/google/android/oh4;", "Lcom/google/android/ug4;", "", "duration", "delay", "Lcom/google/android/vl3;", "easing", "<init>", "(IILcom/google/android/vl3;)V", "", "playTimeNanos", "", "initialValue", "targetValue", "initialVelocity", "e", "(JFFF)F", "c", "(FFF)J", "b", "a", "I", "getDuration", "()I", "getDelay", "Lcom/google/android/vl3;", "d", "J", "durationNanos", "delayNanos", "animation-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class oh4 implements ug4 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int duration;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int delay;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final vl3 easing;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final long durationNanos;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final long delayNanos;

    public oh4(int i, int i2, vl3 vl3Var) {
        this.duration = i;
        this.delay = i2;
        this.easing = vl3Var;
        this.durationNanos = ((long) i) * 1000000;
        this.delayNanos = ((long) i2) * 1000000;
    }

    @Override // com.google.inputmethod.ug4
    public float b(long playTimeNanos, float initialValue, float targetValue, float initialVelocity) {
        long j = playTimeNanos - this.delayNanos;
        long j2 = this.durationNanos;
        if (j < 0) {
            j = 0;
        }
        long j3 = j > j2 ? j2 : j;
        if (j3 == 0) {
            return initialVelocity;
        }
        return (e(j3, initialValue, targetValue, initialVelocity) - e(j3 - 1000000, initialValue, targetValue, initialVelocity)) * 1000.0f;
    }

    @Override // com.google.inputmethod.ug4
    public long c(float initialValue, float targetValue, float initialVelocity) {
        return this.delayNanos + this.durationNanos;
    }

    @Override // com.google.inputmethod.ug4
    public float e(long playTimeNanos, float initialValue, float targetValue, float initialVelocity) {
        long j = playTimeNanos - this.delayNanos;
        long j2 = this.durationNanos;
        if (j < 0) {
            j = 0;
        }
        if (j > j2) {
            j = j2;
        }
        float fA = this.easing.a(this.duration == 0 ? 1.0f : j / j2);
        return (initialValue * (1 - fA)) + (targetValue * fA);
    }
}
