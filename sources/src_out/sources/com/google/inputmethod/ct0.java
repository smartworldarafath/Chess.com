package com.google.inputmethod;

import androidx.compose.p000animation.BoundsAnimationModifierNode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0012\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B9\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u0007\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u000b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u001f\u001a\u0004\b \u0010!R)\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u00078\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lcom/google/android/ct0;", "Lcom/google/android/uy7;", "Landroidx/compose/animation/BoundsAnimationModifierNode;", "Lcom/google/android/wa7;", "lookaheadScope", "Lcom/google/android/it0;", "boundsTransform", "Lkotlin/Function2;", "Lcom/google/android/q16;", "Lcom/google/android/kx1;", "resolveMeasureConstraints", "", "animateMotionFrameOfReference", "<init>", "(Lcom/google/android/wa7;Lcom/google/android/it0;Lkotlin/jvm/functions/Function2;Z)V", "d", "()Landroidx/compose/animation/BoundsAnimationModifierNode;", "node", "", "e", "(Landroidx/compose/animation/BoundsAnimationModifierNode;)V", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/google/android/wa7;", "getLookaheadScope", "()Lcom/google/android/wa7;", "Lcom/google/android/it0;", "getBoundsTransform", "()Lcom/google/android/it0;", "f", "Lkotlin/jvm/functions/Function2;", "getResolveMeasureConstraints", "()Lkotlin/jvm/functions/Function2;", "g", "Z", "getAnimateMotionFrameOfReference", "()Z", "animation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ct0 extends uy7<BoundsAnimationModifierNode> {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final wa7 lookaheadScope;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final it0 boundsTransform;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final Function2<q16, kx1, kx1> resolveMeasureConstraints;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final boolean animateMotionFrameOfReference;

    /* JADX WARN: Multi-variable type inference failed */
    public ct0(wa7 wa7Var, it0 it0Var, Function2<? super q16, ? super kx1, kx1> function2, boolean z) {
        this.lookaheadScope = wa7Var;
        this.boundsTransform = it0Var;
        this.resolveMeasureConstraints = function2;
        this.animateMotionFrameOfReference = z;
    }

    @Override // com.google.inputmethod.uy7
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public BoundsAnimationModifierNode a() {
        return new BoundsAnimationModifierNode(this.lookaheadScope, this.boundsTransform, this.resolveMeasureConstraints, this.animateMotionFrameOfReference);
    }

    @Override // com.google.inputmethod.uy7
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void c(BoundsAnimationModifierNode node) {
        node.r3(this.lookaheadScope);
        node.q3(this.boundsTransform);
        node.s3(this.resolveMeasureConstraints);
        node.p3(this.animateMotionFrameOfReference);
    }

    public boolean equals(Object other) {
        if (!(other instanceof ct0)) {
            return false;
        }
        ct0 ct0Var = (ct0) other;
        return Intrinsics.e(ct0Var.lookaheadScope, this.lookaheadScope) && Intrinsics.e(ct0Var.boundsTransform, this.boundsTransform) && ct0Var.resolveMeasureConstraints == this.resolveMeasureConstraints && ct0Var.animateMotionFrameOfReference == this.animateMotionFrameOfReference;
    }

    public int hashCode() {
        return (((((this.lookaheadScope.hashCode() * 31) + this.boundsTransform.hashCode()) * 31) + this.resolveMeasureConstraints.hashCode()) * 31) + Boolean.hashCode(this.animateMotionFrameOfReference);
    }
}
