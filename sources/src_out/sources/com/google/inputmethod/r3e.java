package com.google.inputmethod;

import com.google.inputmethod.ur;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B%\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ/\u0010\u0010\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J/\u0010\u0012\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0012\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0006\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001d¨\u0006\u001f"}, d2 = {"Lcom/google/android/r3e;", "Lcom/google/android/ur;", "V", "Lcom/google/android/i3e;", "", "durationMillis", "delayMillis", "Lcom/google/android/vl3;", "easing", "<init>", "(IILcom/google/android/vl3;)V", "", "playTimeNanos", "initialValue", "targetValue", "initialVelocity", "g", "(JLcom/google/android/ur;Lcom/google/android/ur;Lcom/google/android/ur;)Lcom/google/android/ur;", "d", "a", "I", "c", "()I", "b", "f", "Lcom/google/android/vl3;", "getEasing", "()Lcom/google/android/vl3;", "Lcom/google/android/k3e;", "Lcom/google/android/k3e;", "anim", "animation-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class r3e<V extends ur> implements i3e<V> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int durationMillis;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int delayMillis;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final vl3 easing;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final k3e<V> anim;

    public r3e(int i, int i2, vl3 vl3Var) {
        this.durationMillis = i;
        this.delayMillis = i2;
        this.easing = vl3Var;
        this.anim = new k3e<>(new oh4(getDurationMillis(), getDelayMillis(), vl3Var));
    }

    @Override // com.google.inputmethod.i3e
    /* JADX INFO: renamed from: c, reason: from getter */
    public int getDurationMillis() {
        return this.durationMillis;
    }

    @Override // com.google.inputmethod.f3e
    public V d(long playTimeNanos, V initialValue, V targetValue, V initialVelocity) {
        return (V) this.anim.d(playTimeNanos, initialValue, targetValue, initialVelocity);
    }

    @Override // com.google.inputmethod.i3e
    /* JADX INFO: renamed from: f, reason: from getter */
    public int getDelayMillis() {
        return this.delayMillis;
    }

    @Override // com.google.inputmethod.f3e
    public V g(long playTimeNanos, V initialValue, V targetValue, V initialVelocity) {
        return (V) this.anim.g(playTimeNanos, initialValue, targetValue, initialVelocity);
    }
}
