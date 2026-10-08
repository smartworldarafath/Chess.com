package com.google.inputmethod;

import com.google.inputmethod.ur;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004BG\b\u0000\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0006\u0010\t\u001a\u00028\u0000\u0012\u0006\u0010\n\u001a\u00028\u0000\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00018\u0001¢\u0006\u0004\b\f\u0010\rBG\b\u0016\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0006\u0010\t\u001a\u00028\u0000\u0012\u0006\u0010\n\u001a\u00028\u0000\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00018\u0001¢\u0006\u0004\b\f\u0010\u000fJ\u0017\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00028\u00012\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR&\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R*\u0010(\u001a\u00028\u00002\u0006\u0010!\u001a\u00028\u00008\u0000@@X\u0080\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R*\u0010+\u001a\u00028\u00002\u0006\u0010!\u001a\u00028\u00008\u0000@@X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010#\u001a\u0004\b)\u0010%\"\u0004\b*\u0010'R\u0016\u0010-\u001a\u00028\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010,R\u0016\u0010/\u001a\u00028\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010,R\u0014\u0010\u000b\u001a\u00028\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010,R\u0016\u00102\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0018\u00104\u001a\u0004\u0018\u00018\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010,R\u0014\u00106\u001a\u00028\u00018BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b0\u00105R\u0011\u0010\t\u001a\u00028\u00008F¢\u0006\u0006\u001a\u0004\b3\u0010%R\u0014\u0010\n\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010%R\u0014\u00109\u001a\u0002078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u00108R\u0014\u0010;\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010:¨\u0006<"}, d2 = {"Lcom/google/android/lmc;", "T", "Lcom/google/android/ur;", "V", "Lcom/google/android/zq;", "Lcom/google/android/f3e;", "animationSpec", "Lcom/google/android/tjd;", "typeConverter", "initialValue", "targetValue", "initialVelocityVector", "<init>", "(Lcom/google/android/f3e;Lcom/google/android/tjd;Ljava/lang/Object;Ljava/lang/Object;Lcom/google/android/ur;)V", "Lcom/google/android/kr;", "(Lcom/google/android/kr;Lcom/google/android/tjd;Ljava/lang/Object;Ljava/lang/Object;Lcom/google/android/ur;)V", "", "playTimeNanos", "e", "(J)Ljava/lang/Object;", "g", "(J)Lcom/google/android/ur;", "", "toString", "()Ljava/lang/String;", "a", "Lcom/google/android/f3e;", "getAnimationSpec$animation_core", "()Lcom/google/android/f3e;", "b", "Lcom/google/android/tjd;", "d", "()Lcom/google/android/tjd;", "value", "c", "Ljava/lang/Object;", "getMutableTargetValue$animation_core", "()Ljava/lang/Object;", "k", "(Ljava/lang/Object;)V", "mutableTargetValue", "getMutableInitialValue$animation_core", "j", "mutableInitialValue", "Lcom/google/android/ur;", "initialValueVector", "f", "targetValueVector", "h", "J", "_durationNanos", "i", "_endVelocity", "()Lcom/google/android/ur;", "endVelocity", "", "()Z", "isInfinite", "()J", "durationNanos", "animation-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class lmc<T, V extends ur> implements zq<T, V> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final f3e<V> animationSpec;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final tjd<T, V> typeConverter;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private T mutableTargetValue;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private T mutableInitialValue;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private V initialValueVector;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private V targetValueVector;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final V initialVelocityVector;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private long _durationNanos;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private V _endVelocity;

    public lmc(f3e<V> f3eVar, tjd<T, V> tjdVar, T t, T t2, V v) {
        V v2;
        this.animationSpec = f3eVar;
        this.typeConverter = tjdVar;
        this.mutableTargetValue = t2;
        this.mutableInitialValue = t;
        this.initialValueVector = (V) d().a().invoke(t);
        this.targetValueVector = (V) d().a().invoke(t2);
        this.initialVelocityVector = (v == null || (v2 = (V) vr.e(v)) == null) ? (V) vr.g((ur) d().a().invoke(t)) : v2;
        this._durationNanos = -1L;
    }

    private final V h() {
        V v = this._endVelocity;
        if (v != null) {
            return v;
        }
        V v2 = (V) this.animationSpec.e(this.initialValueVector, this.targetValueVector, this.initialVelocityVector);
        this._endVelocity = v2;
        return v2;
    }

    @Override // com.google.inputmethod.zq
    /* JADX INFO: renamed from: a */
    public boolean getIsInfinite() {
        return this.animationSpec.a();
    }

    @Override // com.google.inputmethod.zq
    /* JADX INFO: renamed from: c */
    public long getDurationNanos() {
        if (this._durationNanos < 0) {
            this._durationNanos = this.animationSpec.b(this.initialValueVector, this.targetValueVector, this.initialVelocityVector);
        }
        return this._durationNanos;
    }

    @Override // com.google.inputmethod.zq
    public tjd<T, V> d() {
        return this.typeConverter;
    }

    @Override // com.google.inputmethod.zq
    public T e(long playTimeNanos) {
        if (b(playTimeNanos)) {
            return f();
        }
        ur urVarG = this.animationSpec.g(playTimeNanos, this.initialValueVector, this.targetValueVector, this.initialVelocityVector);
        int size = urVarG.getSize();
        for (int i = 0; i < size; i++) {
            if (Float.isNaN(urVarG.a(i))) {
                gi9.b("AnimationVector cannot contain a NaN. " + urVarG + ". Animation: " + this + ", playTimeNanos: " + playTimeNanos);
            }
        }
        return (T) d().b().invoke(urVarG);
    }

    @Override // com.google.inputmethod.zq
    public T f() {
        return this.mutableTargetValue;
    }

    @Override // com.google.inputmethod.zq
    public V g(long playTimeNanos) {
        return !b(playTimeNanos) ? (V) this.animationSpec.d(playTimeNanos, this.initialValueVector, this.targetValueVector, this.initialVelocityVector) : (V) h();
    }

    public final T i() {
        return this.mutableInitialValue;
    }

    public final void j(T t) {
        if (Intrinsics.e(t, this.mutableInitialValue)) {
            return;
        }
        this.mutableInitialValue = t;
        this.initialValueVector = (V) d().a().invoke(t);
        this._endVelocity = null;
        this._durationNanos = -1L;
    }

    public final void k(T t) {
        if (Intrinsics.e(this.mutableTargetValue, t)) {
            return;
        }
        this.mutableTargetValue = t;
        this.targetValueVector = (V) d().a().invoke(t);
        this._endVelocity = null;
        this._durationNanos = -1L;
    }

    public String toString() {
        return "TargetBasedAnimation: " + i() + " -> " + f() + ",initial velocity: " + this.initialVelocityVector + ", duration: " + hr.b(this) + " ms,animationSpec: " + this.animationSpec;
    }

    public /* synthetic */ lmc(kr krVar, tjd tjdVar, Object obj, Object obj2, ur urVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((kr<Object>) krVar, (tjd<Object, ur>) tjdVar, obj, obj2, (i & 16) != 0 ? null : urVar);
    }

    public lmc(kr<T> krVar, tjd<T, V> tjdVar, T t, T t2, V v) {
        this(krVar.a(tjdVar), tjdVar, t, t2, v);
    }
}
