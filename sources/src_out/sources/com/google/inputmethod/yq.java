package com.google.inputmethod;

import androidx.compose.p000animation.EnterExitState;
import androidx.compose.p000animation.core.Transition;
import androidx.compose.p004runtime.s0;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0017\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006R(\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\t\"\u0004\b\n\u0010\u0006R \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/google/android/yq;", "Lcom/google/android/xq;", "Landroidx/compose/animation/core/Transition;", "Landroidx/compose/animation/EnterExitState;", "transition", "<init>", "(Landroidx/compose/animation/core/Transition;)V", "a", "Landroidx/compose/animation/core/Transition;", "()Landroidx/compose/animation/core/Transition;", "setTransition", "Lcom/google/android/o58;", "Lcom/google/android/q16;", "b", "Lcom/google/android/o58;", "()Lcom/google/android/o58;", "targetSize", "animation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class yq implements xq {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private Transition<EnterExitState> transition;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final o58<q16> targetSize = s0.e(q16.b(q16.INSTANCE.a()), null, 2, null);

    public yq(Transition<EnterExitState> transition) {
        this.transition = transition;
    }

    @Override // com.google.inputmethod.xq
    public Transition<EnterExitState> a() {
        return this.transition;
    }

    public final o58<q16> b() {
        return this.targetSize;
    }
}
