package com.google.inputmethod;

import com.google.inputmethod.ur;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B!\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB)\b\u0016\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\t\u0010\fJ0\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00028\u0000H\u0096\u0001¢\u0006\u0004\b\u0012\u0010\u0013J0\u0010\u0014\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00028\u0000H\u0096\u0001¢\u0006\u0004\b\u0014\u0010\u0013J(\u0010\u0015\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00028\u0000H\u0096\u0001¢\u0006\u0004\b\u0015\u0010\u0016J(\u0010\u0017\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00028\u0000H\u0096\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u0014\u0010!\u001a\u00020\u001e8VX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lcom/google/android/q3e;", "Lcom/google/android/ur;", "V", "Lcom/google/android/j3e;", "", "dampingRatio", "stiffness", "Lcom/google/android/wr;", "anims", "<init>", "(FFLcom/google/android/wr;)V", "visibilityThreshold", "(FFLcom/google/android/ur;)V", "", "playTimeNanos", "initialValue", "targetValue", "initialVelocity", "g", "(JLcom/google/android/ur;Lcom/google/android/ur;Lcom/google/android/ur;)Lcom/google/android/ur;", "d", "b", "(Lcom/google/android/ur;Lcom/google/android/ur;Lcom/google/android/ur;)J", "e", "(Lcom/google/android/ur;Lcom/google/android/ur;Lcom/google/android/ur;)Lcom/google/android/ur;", "F", "getDampingRatio", "()F", "c", "getStiffness", "", "a", "()Z", "isInfinite", "animation-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class q3e<V extends ur> implements j3e<V> {
    private final /* synthetic */ k3e<V> a;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final float dampingRatio;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final float stiffness;

    private q3e(float f, float f2, wr wrVar) {
        this.a = new k3e<>(wrVar);
        this.dampingRatio = f;
        this.stiffness = f2;
    }

    @Override // com.google.inputmethod.j3e, com.google.inputmethod.f3e
    public boolean a() {
        return this.a.a();
    }

    @Override // com.google.inputmethod.f3e
    public long b(V initialValue, V targetValue, V initialVelocity) {
        return this.a.b(initialValue, targetValue, initialVelocity);
    }

    @Override // com.google.inputmethod.f3e
    public V d(long playTimeNanos, V initialValue, V targetValue, V initialVelocity) {
        return (V) this.a.d(playTimeNanos, initialValue, targetValue, initialVelocity);
    }

    @Override // com.google.inputmethod.f3e
    public V e(V initialValue, V targetValue, V initialVelocity) {
        return (V) this.a.e(initialValue, targetValue, initialVelocity);
    }

    @Override // com.google.inputmethod.f3e
    public V g(long playTimeNanos, V initialValue, V targetValue, V initialVelocity) {
        return (V) this.a.g(playTimeNanos, initialValue, targetValue, initialVelocity);
    }

    public q3e(float f, float f2, V v) {
        this(f, f2, g3e.f(v, f, f2));
    }
}
