package com.google.inputmethod;

import androidx.compose.p001foundation.layout.f1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/google/android/p4e;", "Lcom/google/android/uy7;", "Landroidx/compose/foundation/layout/f1;", "Lcom/google/android/tc$c;", "alignment", "<init>", "(Lcom/google/android/tc$c;)V", "d", "()Landroidx/compose/foundation/layout/f1;", "node", "", "e", "(Landroidx/compose/foundation/layout/f1;)V", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/google/android/tc$c;", "getAlignment", "()Lcom/google/android/tc$c;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class p4e extends uy7<f1> {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final tc.c alignment;

    public p4e(tc.c cVar) {
        this.alignment = cVar;
    }

    @Override // com.google.inputmethod.uy7
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public f1 a() {
        return new f1(this.alignment);
    }

    @Override // com.google.inputmethod.uy7
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void c(f1 node) {
        node.n3(this.alignment);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        p4e p4eVar = other instanceof p4e ? (p4e) other : null;
        if (p4eVar == null) {
            return false;
        }
        return Intrinsics.e(this.alignment, p4eVar.alignment);
    }

    public int hashCode() {
        return this.alignment.hashCode();
    }
}
