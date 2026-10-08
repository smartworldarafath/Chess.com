package com.google.inputmethod;

import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000b\u0010\fR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0005R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R*\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u000e\u001a\u0004\b\r\u0010\u0010\"\u0004\b\u0017\u0010\u0005R$\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0019\u0010\u0005¨\u0006\u001b"}, d2 = {"Lcom/google/android/v2c;", "", "", "finalPosition", "<init>", "(F)V", "lastDisplacement", "lastVelocity", "", "timeElapsed", "Lcom/google/android/qz7;", "f", "(FFJ)J", "a", "F", "getFinalPosition", "()F", "d", "", "b", "D", "naturalFreq", "value", "c", "dampingRatio", "e", "stiffness", "animation-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class v2c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private float finalPosition;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private double naturalFreq = Math.sqrt(50.0d);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private float dampingRatio = 1.0f;

    public v2c(float f) {
        this.finalPosition = f;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final float getDampingRatio() {
        return this.dampingRatio;
    }

    public final float b() {
        double d = this.naturalFreq;
        return (float) (d * d);
    }

    public final void c(float f) {
        if (f < 0.0f) {
            gi9.a("Damping ratio must be non-negative");
        }
        this.dampingRatio = f;
    }

    public final void d(float f) {
        this.finalPosition = f;
    }

    public final void e(float f) {
        if (b() <= 0.0f) {
            gi9.a("Spring stiffness constant must be positive.");
        }
        this.naturalFreq = Math.sqrt(f);
    }

    public final long f(float lastDisplacement, float lastVelocity, long timeElapsed) {
        double dExp;
        double dExp2;
        float f = lastDisplacement - this.finalPosition;
        double d = timeElapsed / 1000.0d;
        float f2 = this.dampingRatio;
        double d2 = ((double) f2) * ((double) f2);
        double d3 = this.naturalFreq;
        double d4 = ((double) (-f2)) * d3;
        if (f2 > 1.0f) {
            double dSqrt = d3 * Math.sqrt(d2 - ((double) 1));
            double d5 = d4 + dSqrt;
            double d6 = d4 - dSqrt;
            double d7 = f;
            double d8 = ((d6 * d7) - ((double) lastVelocity)) / (d6 - d5);
            double d9 = d7 - d8;
            double d10 = d6 * d;
            double d11 = d * d5;
            dExp2 = (Math.exp(d10) * d9) + (Math.exp(d11) * d8);
            dExp = (d9 * d6 * Math.exp(d10)) + (d8 * d5 * Math.exp(d11));
        } else if (f2 == 1.0f) {
            double d12 = f;
            double d13 = ((double) lastVelocity) + (d3 * d12);
            double d14 = (-d3) * d;
            double d15 = d12 + (d * d13);
            dExp2 = d15 * Math.exp(d14);
            dExp = (d15 * Math.exp(d14) * (-this.naturalFreq)) + (d13 * Math.exp(d14));
        } else {
            double d16 = 1;
            double dSqrt2 = d3 * Math.sqrt(d16 - d2);
            double d17 = f;
            double d18 = (d16 / dSqrt2) * (((-d4) * d17) + ((double) lastVelocity));
            double d19 = dSqrt2 * d;
            double d20 = d * d4;
            double dExp3 = Math.exp(d20) * ((Math.cos(d19) * d17) + (Math.sin(d19) * d18));
            dExp = (d4 * dExp3) + (Math.exp(d20) * (((-dSqrt2) * d17 * Math.sin(d19)) + (dSqrt2 * d18 * Math.cos(d19))));
            dExp2 = dExp3;
        }
        return qz7.a((((long) Float.floatToRawIntBits((float) dExp)) & 4294967295L) | (Float.floatToRawIntBits((float) (dExp2 + ((double) this.finalPosition))) << 32));
    }
}
