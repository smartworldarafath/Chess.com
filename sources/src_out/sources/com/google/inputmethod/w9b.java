package com.google.inputmethod;

import androidx.compose.p001foundation.gestures.Orientation;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0011\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BW\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u0007\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u00072\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0096\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\"R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010#R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\t\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010%R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010\r\u001a\u0004\u0018\u00010\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\u0010\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010%R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/¨\u00060"}, d2 = {"Lcom/google/android/w9b;", "Lcom/google/android/uy7;", "Lcom/google/android/z9b;", "Lcom/google/android/hab;", "state", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "", "enabled", "reverseScrolling", "Lcom/google/android/qg4;", "flingBehavior", "Lcom/google/android/r48;", "interactionSource", "Lcom/google/android/fu0;", "bringIntoViewSpec", "useLocalOverscrollFactory", "Lcom/google/android/zv8;", "overscrollEffect", "<init>", "(Lcom/google/android/hab;Landroidx/compose/foundation/gestures/Orientation;ZZLcom/google/android/qg4;Lcom/google/android/r48;Lcom/google/android/fu0;ZLcom/google/android/zv8;)V", "d", "()Lcom/google/android/z9b;", "node", "", "e", "(Lcom/google/android/z9b;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/android/hab;", "Landroidx/compose/foundation/gestures/Orientation;", "f", "Z", "g", "h", "Lcom/google/android/qg4;", "i", "Lcom/google/android/r48;", "j", "Lcom/google/android/fu0;", "k", "l", "Lcom/google/android/zv8;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class w9b extends uy7<z9b> {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final hab state;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final Orientation orientation;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final boolean enabled;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final boolean reverseScrolling;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final qg4 flingBehavior;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final r48 interactionSource;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final fu0 bringIntoViewSpec;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final boolean useLocalOverscrollFactory;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final zv8 overscrollEffect;

    public w9b(hab habVar, Orientation orientation, boolean z, boolean z2, qg4 qg4Var, r48 r48Var, fu0 fu0Var, boolean z3, zv8 zv8Var) {
        this.state = habVar;
        this.orientation = orientation;
        this.enabled = z;
        this.reverseScrolling = z2;
        this.flingBehavior = qg4Var;
        this.interactionSource = r48Var;
        this.bringIntoViewSpec = fu0Var;
        this.useLocalOverscrollFactory = z3;
        this.overscrollEffect = zv8Var;
    }

    @Override // com.google.inputmethod.uy7
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public z9b a() {
        return new z9b(this.state, this.orientation, this.enabled, this.reverseScrolling, this.flingBehavior, this.interactionSource, this.bringIntoViewSpec, this.useLocalOverscrollFactory, this.overscrollEffect);
    }

    @Override // com.google.inputmethod.uy7
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void c(z9b node) {
        node.x3(this.state, this.orientation, this.useLocalOverscrollFactory, this.overscrollEffect, this.enabled, this.reverseScrolling, this.flingBehavior, this.interactionSource, this.bringIntoViewSpec);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || w9b.class != other.getClass()) {
            return false;
        }
        w9b w9bVar = (w9b) other;
        return Intrinsics.e(this.state, w9bVar.state) && this.orientation == w9bVar.orientation && this.enabled == w9bVar.enabled && this.reverseScrolling == w9bVar.reverseScrolling && Intrinsics.e(this.flingBehavior, w9bVar.flingBehavior) && Intrinsics.e(this.interactionSource, w9bVar.interactionSource) && Intrinsics.e(this.bringIntoViewSpec, w9bVar.bringIntoViewSpec) && this.useLocalOverscrollFactory == w9bVar.useLocalOverscrollFactory && Intrinsics.e(this.overscrollEffect, w9bVar.overscrollEffect);
    }

    public int hashCode() {
        int iHashCode = ((((((this.state.hashCode() * 31) + this.orientation.hashCode()) * 31) + Boolean.hashCode(this.enabled)) * 31) + Boolean.hashCode(this.reverseScrolling)) * 31;
        qg4 qg4Var = this.flingBehavior;
        int iHashCode2 = (iHashCode + (qg4Var != null ? qg4Var.hashCode() : 0)) * 31;
        r48 r48Var = this.interactionSource;
        int iHashCode3 = (iHashCode2 + (r48Var != null ? r48Var.hashCode() : 0)) * 31;
        fu0 fu0Var = this.bringIntoViewSpec;
        int iHashCode4 = (((iHashCode3 + (fu0Var != null ? fu0Var.hashCode() : 0)) * 31) + Boolean.hashCode(this.useLocalOverscrollFactory)) * 31;
        zv8 zv8Var = this.overscrollEffect;
        return iHashCode4 + (zv8Var != null ? zv8Var.hashCode() : 0);
    }
}
