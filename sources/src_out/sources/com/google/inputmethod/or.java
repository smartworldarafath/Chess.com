package com.google.inputmethod;

import com.google.android.yg4;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u001am\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00028\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00018\u00012\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f\u001a[\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\u0003*\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\u00032\b\b\u0002\u0010\u0004\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011\u001aI\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\u00032\u0006\u0010\u0012\u001a\u00020\r2\b\b\u0002\u0010\u0013\u001a\u00020\r2\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0014\u0010\u0015\u001ak\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00012\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00162\u0006\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00028\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0018\u0010\u0019\u001a5\u0010\u001a\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00162\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"T", "Lcom/google/android/ur;", "V", "Lcom/google/android/nr;", "value", "velocityVector", "", "lastFrameTimeNanos", "finishedTimeNanos", "", "isRunning", "f", "(Lcom/google/android/nr;Ljava/lang/Object;Lcom/google/android/ur;JJZ)Lcom/google/android/nr;", "", "Lcom/google/android/qr;", "velocity", "e", "(Lcom/google/android/nr;FFJJZ)Lcom/google/android/nr;", "initialValue", "initialVelocity", "a", "(FFJJZ)Lcom/google/android/nr;", "Lcom/google/android/tjd;", "typeConverter", "b", "(Lcom/google/android/tjd;Ljava/lang/Object;Ljava/lang/Object;JJZ)Lcom/google/android/nr;", "i", "(Lcom/google/android/tjd;Ljava/lang/Object;)Lcom/google/android/ur;", "animation-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class or {
    public static final AnimationState<Float, qr> a(float f, float f2, long j, long j2, boolean z) {
        return new AnimationState<>(w2e.N(yg4.a), Float.valueOf(f), vr.a(f2), j, j2, z);
    }

    public static final <T, V extends ur> AnimationState<T, V> b(tjd<T, V> tjdVar, T t, T t2, long j, long j2, boolean z) {
        return new AnimationState<>(tjdVar, t, (ur) tjdVar.a().invoke(t2), j, j2, z);
    }

    public static /* synthetic */ AnimationState c(float f, float f2, long j, long j2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        if ((i & 4) != 0) {
            j = Long.MIN_VALUE;
        }
        if ((i & 8) != 0) {
            j2 = Long.MIN_VALUE;
        }
        if ((i & 16) != 0) {
            z = false;
        }
        return a(f, f2, j, j2, z);
    }

    public static /* synthetic */ AnimationState d(tjd tjdVar, Object obj, Object obj2, long j, long j2, boolean z, int i, Object obj3) {
        if ((i & 8) != 0) {
            j = Long.MIN_VALUE;
        }
        if ((i & 16) != 0) {
            j2 = Long.MIN_VALUE;
        }
        if ((i & 32) != 0) {
            z = false;
        }
        return b(tjdVar, obj, obj2, j, j2, z);
    }

    public static final AnimationState<Float, qr> e(AnimationState<Float, qr> animationState, float f, float f2, long j, long j2, boolean z) {
        return new AnimationState<>(animationState.m(), Float.valueOf(f), vr.a(f2), j, j2, z);
    }

    public static final <T, V extends ur> AnimationState<T, V> f(AnimationState<T, V> animationState, T t, V v, long j, long j2, boolean z) {
        return new AnimationState<>(animationState.m(), t, v, j, j2, z);
    }

    public static /* synthetic */ AnimationState g(AnimationState animationState, float f, float f2, long j, long j2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            f = ((Number) animationState.getValue()).floatValue();
        }
        if ((i & 2) != 0) {
            f2 = ((qr) animationState.t()).getValue();
        }
        if ((i & 4) != 0) {
            j = animationState.getLastFrameTimeNanos();
        }
        if ((i & 8) != 0) {
            j2 = animationState.getFinishedTimeNanos();
        }
        if ((i & 16) != 0) {
            z = animationState.getIsRunning();
        }
        boolean z2 = z;
        long j3 = j2;
        return e(animationState, f, f2, j, j3, z2);
    }

    public static /* synthetic */ AnimationState h(AnimationState animationState, Object obj, ur urVar, long j, long j2, boolean z, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = animationState.getValue();
        }
        if ((i & 2) != 0) {
            urVar = vr.e(animationState.t());
        }
        if ((i & 4) != 0) {
            j = animationState.getLastFrameTimeNanos();
        }
        if ((i & 8) != 0) {
            j2 = animationState.getFinishedTimeNanos();
        }
        if ((i & 16) != 0) {
            z = animationState.getIsRunning();
        }
        boolean z2 = z;
        long j3 = j2;
        return f(animationState, obj, urVar, j, j3, z2);
    }

    public static final <T, V extends ur> V i(tjd<T, V> tjdVar, T t) {
        V v = (V) tjdVar.a().invoke(t);
        v.d();
        return v;
    }
}
