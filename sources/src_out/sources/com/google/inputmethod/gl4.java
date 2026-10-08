package com.google.inputmethod;

import androidx.compose.p001foundation.FocusableNode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/google/android/gl4;", "Lcom/google/android/uy7;", "Landroidx/compose/foundation/FocusableNode;", "Lcom/google/android/r48;", "interactionSource", "<init>", "(Lcom/google/android/r48;)V", "d", "()Landroidx/compose/foundation/FocusableNode;", "node", "", "e", "(Landroidx/compose/foundation/FocusableNode;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/android/r48;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class gl4 extends uy7<FocusableNode> {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final r48 interactionSource;

    public gl4(r48 r48Var) {
        this.interactionSource = r48Var;
    }

    @Override // com.google.inputmethod.uy7
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public FocusableNode a() {
        return new FocusableNode(this.interactionSource, 0, null, 6, null);
    }

    @Override // com.google.inputmethod.uy7
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void c(FocusableNode node) {
        node.F3(this.interactionSource);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof gl4) && Intrinsics.e(this.interactionSource, ((gl4) other).interactionSource);
    }

    public int hashCode() {
        r48 r48Var = this.interactionSource;
        if (r48Var != null) {
            return r48Var.hashCode();
        }
        return 0;
    }
}
