package com.google.inputmethod;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u0007\u0010\u001c¨\u0006\u001e"}, d2 = {"Lcom/google/android/kab;", "Lcom/google/android/uy7;", "Lcom/google/android/n9b;", "Lcom/google/android/v9b;", "scrollState", "", "reverseScrolling", "isVertical", "<init>", "(Lcom/google/android/v9b;ZZ)V", "d", "()Lcom/google/android/n9b;", "node", "", "e", "(Lcom/google/android/n9b;)V", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/google/android/v9b;", "getScrollState", "()Lcom/google/android/v9b;", "Z", "getReverseScrolling", "()Z", "f", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class kab extends uy7<n9b> {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final v9b scrollState;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final boolean reverseScrolling;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final boolean isVertical;

    public kab(v9b v9bVar, boolean z, boolean z2) {
        this.scrollState = v9bVar;
        this.reverseScrolling = z;
        this.isVertical = z2;
    }

    @Override // com.google.inputmethod.uy7
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public n9b a() {
        return new n9b(this.scrollState, this.reverseScrolling, this.isVertical);
    }

    @Override // com.google.inputmethod.uy7
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void c(n9b node) {
        node.v3(this.scrollState);
        node.u3(this.reverseScrolling);
        node.w3(this.isVertical);
    }

    public boolean equals(Object other) {
        if (!(other instanceof kab)) {
            return false;
        }
        kab kabVar = (kab) other;
        return Intrinsics.e(this.scrollState, kabVar.scrollState) && this.reverseScrolling == kabVar.reverseScrolling && this.isVertical == kabVar.isVertical;
    }

    public int hashCode() {
        return (((this.scrollState.hashCode() * 31) + Boolean.hashCode(this.reverseScrolling)) * 31) + Boolean.hashCode(this.isVertical);
    }
}
