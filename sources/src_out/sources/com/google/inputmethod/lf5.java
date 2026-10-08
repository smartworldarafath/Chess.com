package com.google.inputmethod;

import androidx.compose.p001foundation.layout.i0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/google/android/lf5;", "Lcom/google/android/uy7;", "Landroidx/compose/foundation/layout/i0;", "Lcom/google/android/tc$b;", "horizontal", "<init>", "(Lcom/google/android/tc$b;)V", "d", "()Landroidx/compose/foundation/layout/i0;", "node", "", "e", "(Landroidx/compose/foundation/layout/i0;)V", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/google/android/tc$b;", "getHorizontal", "()Lcom/google/android/tc$b;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class lf5 extends uy7<i0> {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final tc.b horizontal;

    public lf5(tc.b bVar) {
        this.horizontal = bVar;
    }

    @Override // com.google.inputmethod.uy7
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public i0 a() {
        return new i0(this.horizontal);
    }

    @Override // com.google.inputmethod.uy7
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void c(i0 node) {
        node.n3(this.horizontal);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        lf5 lf5Var = other instanceof lf5 ? (lf5) other : null;
        if (lf5Var == null) {
            return false;
        }
        return Intrinsics.e(this.horizontal, lf5Var.horizontal);
    }

    public int hashCode() {
        return this.horizontal.hashCode();
    }
}
