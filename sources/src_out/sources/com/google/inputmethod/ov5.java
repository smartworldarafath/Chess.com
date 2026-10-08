package com.google.inputmethod;

import androidx.compose.p000animation.core.RepeatMode;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B)\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ3\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00010\u000f\"\b\b\u0001\u0010\f*\u00020\u000b2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lcom/google/android/ov5;", "T", "Lcom/google/android/kr;", "Lcom/google/android/kk3;", "animation", "Landroidx/compose/animation/core/RepeatMode;", "repeatMode", "Lcom/google/android/y5c;", "initialStartOffset", "<init>", "(Lcom/google/android/kk3;Landroidx/compose/animation/core/RepeatMode;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Lcom/google/android/ur;", "V", "Lcom/google/android/tjd;", "converter", "Lcom/google/android/f3e;", "a", "(Lcom/google/android/tjd;)Lcom/google/android/f3e;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/android/kk3;", "getAnimation", "()Lcom/google/android/kk3;", "b", "Landroidx/compose/animation/core/RepeatMode;", "getRepeatMode", "()Landroidx/compose/animation/core/RepeatMode;", "c", "J", "getInitialStartOffset-Rmkjzm4", "()J", "animation-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ov5<T> implements kr<T> {
    public static final int d = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final kk3<T> animation;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final RepeatMode repeatMode;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final long initialStartOffset;

    public /* synthetic */ ov5(kk3 kk3Var, RepeatMode repeatMode, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(kk3Var, repeatMode, j);
    }

    @Override // com.google.inputmethod.kr
    public <V extends ur> f3e<V> a(tjd<T, V> converter) {
        return new m3e(this.animation.a((tjd) converter), this.repeatMode, this.initialStartOffset, null);
    }

    public boolean equals(Object other) {
        if (other instanceof ov5) {
            ov5 ov5Var = (ov5) other;
            if (Intrinsics.e(ov5Var.animation, this.animation) && ov5Var.repeatMode == this.repeatMode && y5c.d(ov5Var.initialStartOffset, this.initialStartOffset)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((this.animation.hashCode() * 31) + this.repeatMode.hashCode()) * 31) + y5c.e(this.initialStartOffset);
    }

    private ov5(kk3<T> kk3Var, RepeatMode repeatMode, long j) {
        this.animation = kk3Var;
        this.repeatMode = repeatMode;
        this.initialStartOffset = j;
        if (kk3Var instanceof rjd) {
            if (((rjd) kk3Var).getDurationMillis() != 0 || ((rjd) kk3Var).getDelay() != 0) {
                return;
            }
        } else if (kk3Var instanceof dwb) {
            if (((dwb) kk3Var).getDelay() != 0) {
                return;
            }
        } else if (kk3Var instanceof zj6) {
            if (((zj6) kk3Var).f().getDurationMillis() != 0 || ((zj6) kk3Var).f().getDelayMillis() != 0) {
                return;
            }
        } else {
            if (kk3Var instanceof bk6) {
                ((bk6) kk3Var).f();
                throw null;
            }
            if (!(kk3Var instanceof c00) || ((c00) kk3Var).getDurationMillis() != 0 || ((c00) kk3Var).getDelayMillis() != 0) {
                return;
            }
        }
        throw new IllegalArgumentException("Animation to be infinitely repeated cannot have a 0-duration");
    }
}
