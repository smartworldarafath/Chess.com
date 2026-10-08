package com.google.inputmethod;

import com.google.inputmethod.ur;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0003\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\f\u001a\u00020\u00052\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\f\u0010\rJ/\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J/\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\f\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010!¨\u0006#"}, d2 = {"Lcom/google/android/x5c;", "Lcom/google/android/ur;", "V", "Lcom/google/android/f3e;", "vectorizedAnimationSpec", "", "startDelayNanos", "<init>", "(Lcom/google/android/f3e;J)V", "initialValue", "targetValue", "initialVelocity", "b", "(Lcom/google/android/ur;Lcom/google/android/ur;Lcom/google/android/ur;)J", "playTimeNanos", "d", "(JLcom/google/android/ur;Lcom/google/android/ur;Lcom/google/android/ur;)Lcom/google/android/ur;", "g", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/google/android/f3e;", "getVectorizedAnimationSpec", "()Lcom/google/android/f3e;", "J", "getStartDelayNanos", "()J", "()Z", "isInfinite", "animation-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class x5c<V extends ur> implements f3e<V> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final f3e<V> vectorizedAnimationSpec;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final long startDelayNanos;

    public x5c(f3e<V> f3eVar, long j) {
        this.vectorizedAnimationSpec = f3eVar;
        this.startDelayNanos = j;
    }

    @Override // com.google.inputmethod.f3e
    public boolean a() {
        return this.vectorizedAnimationSpec.a();
    }

    @Override // com.google.inputmethod.f3e
    public long b(V initialValue, V targetValue, V initialVelocity) {
        return this.vectorizedAnimationSpec.b(initialValue, targetValue, initialVelocity) + this.startDelayNanos;
    }

    @Override // com.google.inputmethod.f3e
    public V d(long playTimeNanos, V initialValue, V targetValue, V initialVelocity) {
        long j = this.startDelayNanos;
        return playTimeNanos < j ? initialVelocity : (V) this.vectorizedAnimationSpec.d(playTimeNanos - j, initialValue, targetValue, initialVelocity);
    }

    public boolean equals(Object other) {
        if (!(other instanceof x5c)) {
            return false;
        }
        x5c x5cVar = (x5c) other;
        return x5cVar.startDelayNanos == this.startDelayNanos && Intrinsics.e(x5cVar.vectorizedAnimationSpec, this.vectorizedAnimationSpec);
    }

    @Override // com.google.inputmethod.f3e
    public V g(long playTimeNanos, V initialValue, V targetValue, V initialVelocity) {
        long j = this.startDelayNanos;
        return playTimeNanos < j ? initialValue : (V) this.vectorizedAnimationSpec.g(playTimeNanos - j, initialValue, targetValue, initialVelocity);
    }

    public int hashCode() {
        return (this.vectorizedAnimationSpec.hashCode() * 31) + Long.hashCode(this.startDelayNanos);
    }
}
