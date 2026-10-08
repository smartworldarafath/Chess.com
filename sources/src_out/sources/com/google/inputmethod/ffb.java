package com.google.inputmethod;

import androidx.compose.ui.semantics.SemanticsNode;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\f\u001a\u0004\b\b\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/google/android/ffb;", "", "Landroidx/compose/ui/semantics/SemanticsNode;", "semanticsNode", "Lcom/google/android/k16;", "adjustedBounds", "<init>", "(Landroidx/compose/ui/semantics/SemanticsNode;Lcom/google/android/k16;)V", "a", "Landroidx/compose/ui/semantics/SemanticsNode;", "b", "()Landroidx/compose/ui/semantics/SemanticsNode;", "Lcom/google/android/k16;", "()Lcom/google/android/k16;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ffb {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final SemanticsNode semanticsNode;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final k16 adjustedBounds;

    public ffb(SemanticsNode semanticsNode, k16 k16Var) {
        this.semanticsNode = semanticsNode;
        this.adjustedBounds = k16Var;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final k16 getAdjustedBounds() {
        return this.adjustedBounds;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final SemanticsNode getSemanticsNode() {
        return this.semanticsNode;
    }
}
