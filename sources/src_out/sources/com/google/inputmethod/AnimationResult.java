package com.google.inputmethod;

import androidx.compose.p000animation.core.AnimationEndReason;
import com.google.inputmethod.ur;
import kotlin.Metadata;

/* JADX INFO: renamed from: com.google.android.ir, reason: from toString */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0004B#\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0012\u001a\u0004\b\u000e\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/google/android/ir;", "T", "Lcom/google/android/ur;", "V", "", "Lcom/google/android/nr;", "endState", "Landroidx/compose/animation/core/AnimationEndReason;", "endReason", "<init>", "(Lcom/google/android/nr;Landroidx/compose/animation/core/AnimationEndReason;)V", "", "toString", "()Ljava/lang/String;", "a", "Lcom/google/android/nr;", "b", "()Lcom/google/android/nr;", "Landroidx/compose/animation/core/AnimationEndReason;", "()Landroidx/compose/animation/core/AnimationEndReason;", "animation-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AnimationResult<T, V extends ur> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final AnimationState<T, V> endState;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final AnimationEndReason endReason;

    public AnimationResult(AnimationState<T, V> animationState, AnimationEndReason animationEndReason) {
        this.endState = animationState;
        this.endReason = animationEndReason;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final AnimationEndReason getEndReason() {
        return this.endReason;
    }

    public final AnimationState<T, V> b() {
        return this.endState;
    }

    public String toString() {
        return "AnimationResult(endReason=" + this.endReason + ", endState=" + this.endState + ')';
    }
}
