package com.google.inputmethod;

import com.google.inputmethod.ur;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\f\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000e\u001a\u00020\b2\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0010\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0010\u0010\rJ\u001f\u0010\u0011\u001a\u00028\u00002\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0018\u001a\u00028\u00008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000e\u0010\u0017R\u0016\u0010\u0019\u001a\u00028\u00008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0011\u0010\u0017R\u0016\u0010\u001a\u001a\u00028\u00008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0010\u0010\u0017R\u001a\u0010\u001e\u001a\u00020\u001b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\u001c\u001a\u0004\b\u0013\u0010\u001d¨\u0006\u001f"}, d2 = {"Lcom/google/android/l3e;", "Lcom/google/android/ur;", "V", "Lcom/google/android/h3e;", "Lcom/google/android/zg4;", "floatDecaySpec", "<init>", "(Lcom/google/android/zg4;)V", "", "playTimeNanos", "initialValue", "initialVelocity", "e", "(JLcom/google/android/ur;Lcom/google/android/ur;)Lcom/google/android/ur;", "b", "(Lcom/google/android/ur;Lcom/google/android/ur;)J", "d", "c", "(Lcom/google/android/ur;Lcom/google/android/ur;)Lcom/google/android/ur;", "a", "Lcom/google/android/zg4;", "getFloatDecaySpec", "()Lcom/google/android/zg4;", "Lcom/google/android/ur;", "valueVector", "velocityVector", "targetVector", "", "F", "()F", "absVelocityThreshold", "animation-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class l3e<V extends ur> implements h3e<V> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final zg4 floatDecaySpec;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private V valueVector;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private V velocityVector;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private V targetVector;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final float absVelocityThreshold;

    public l3e(zg4 zg4Var) {
        this.floatDecaySpec = zg4Var;
        this.absVelocityThreshold = zg4Var.getAbsVelocityThreshold();
    }

    @Override // com.google.inputmethod.h3e
    /* JADX INFO: renamed from: a, reason: from getter */
    public float getAbsVelocityThreshold() {
        return this.absVelocityThreshold;
    }

    @Override // com.google.inputmethod.h3e
    public long b(V initialValue, V initialVelocity) {
        if (this.velocityVector == null) {
            this.velocityVector = (V) vr.g(initialValue);
        }
        V v = this.velocityVector;
        if (v == null) {
            Intrinsics.x("velocityVector");
            v = null;
        }
        int size = v.getSize();
        long jMax = 0;
        for (int i = 0; i < size; i++) {
            jMax = Math.max(jMax, this.floatDecaySpec.c(initialValue.a(i), initialVelocity.a(i)));
        }
        return jMax;
    }

    @Override // com.google.inputmethod.h3e
    public V c(V initialValue, V initialVelocity) {
        if (this.targetVector == null) {
            this.targetVector = (V) vr.g(initialValue);
        }
        V v = this.targetVector;
        if (v == null) {
            Intrinsics.x("targetVector");
            v = null;
        }
        int size = v.getSize();
        for (int i = 0; i < size; i++) {
            V v2 = this.targetVector;
            if (v2 == null) {
                Intrinsics.x("targetVector");
                v2 = null;
            }
            v2.e(i, this.floatDecaySpec.d(initialValue.a(i), initialVelocity.a(i)));
        }
        V v3 = this.targetVector;
        if (v3 != null) {
            return v3;
        }
        Intrinsics.x("targetVector");
        return null;
    }

    @Override // com.google.inputmethod.h3e
    public V d(long playTimeNanos, V initialValue, V initialVelocity) {
        if (this.velocityVector == null) {
            this.velocityVector = (V) vr.g(initialValue);
        }
        V v = this.velocityVector;
        if (v == null) {
            Intrinsics.x("velocityVector");
            v = null;
        }
        int size = v.getSize();
        for (int i = 0; i < size; i++) {
            V v2 = this.velocityVector;
            if (v2 == null) {
                Intrinsics.x("velocityVector");
                v2 = null;
            }
            v2.e(i, this.floatDecaySpec.b(playTimeNanos, initialValue.a(i), initialVelocity.a(i)));
        }
        V v3 = this.velocityVector;
        if (v3 != null) {
            return v3;
        }
        Intrinsics.x("velocityVector");
        return null;
    }

    @Override // com.google.inputmethod.h3e
    public V e(long playTimeNanos, V initialValue, V initialVelocity) {
        if (this.valueVector == null) {
            this.valueVector = (V) vr.g(initialValue);
        }
        V v = this.valueVector;
        if (v == null) {
            Intrinsics.x("valueVector");
            v = null;
        }
        int size = v.getSize();
        for (int i = 0; i < size; i++) {
            V v2 = this.valueVector;
            if (v2 == null) {
                Intrinsics.x("valueVector");
                v2 = null;
            }
            v2.e(i, this.floatDecaySpec.e(playTimeNanos, initialValue.a(i), initialVelocity.a(i)));
        }
        V v3 = this.valueVector;
        if (v3 != null) {
            return v3;
        }
        Intrinsics.x("valueVector");
        return null;
    }
}
