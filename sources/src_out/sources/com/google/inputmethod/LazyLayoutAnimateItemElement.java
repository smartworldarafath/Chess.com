package com.google.inputmethod;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.google.android.ss6, reason: from toString */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B7\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001cR\u001c\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001cR\u001c\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001c¨\u0006\u001e"}, d2 = {"Lcom/google/android/ss6;", "Lcom/google/android/uy7;", "Lcom/google/android/ts6;", "Lcom/google/android/xa4;", "", "fadeInSpec", "Lcom/google/android/g16;", "placementSpec", "fadeOutSpec", "<init>", "(Lcom/google/android/xa4;Lcom/google/android/xa4;Lcom/google/android/xa4;)V", "d", "()Lcom/google/android/ts6;", "node", "", "e", "(Lcom/google/android/ts6;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/google/android/xa4;", "f", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class LazyLayoutAnimateItemElement extends uy7<ts6> {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final xa4<Float> fadeInSpec;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    private final xa4<g16> placementSpec;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    private final xa4<Float> fadeOutSpec;

    public LazyLayoutAnimateItemElement(xa4<Float> xa4Var, xa4<g16> xa4Var2, xa4<Float> xa4Var3) {
        this.fadeInSpec = xa4Var;
        this.placementSpec = xa4Var2;
        this.fadeOutSpec = xa4Var3;
    }

    @Override // com.google.inputmethod.uy7
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public ts6 a() {
        return new ts6(this.fadeInSpec, this.placementSpec, this.fadeOutSpec);
    }

    @Override // com.google.inputmethod.uy7
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void c(ts6 node) {
        node.p3(this.fadeInSpec);
        node.r3(this.placementSpec);
        node.q3(this.fadeOutSpec);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LazyLayoutAnimateItemElement)) {
            return false;
        }
        LazyLayoutAnimateItemElement lazyLayoutAnimateItemElement = (LazyLayoutAnimateItemElement) other;
        return Intrinsics.e(this.fadeInSpec, lazyLayoutAnimateItemElement.fadeInSpec) && Intrinsics.e(this.placementSpec, lazyLayoutAnimateItemElement.placementSpec) && Intrinsics.e(this.fadeOutSpec, lazyLayoutAnimateItemElement.fadeOutSpec);
    }

    public int hashCode() {
        xa4<Float> xa4Var = this.fadeInSpec;
        int iHashCode = (xa4Var == null ? 0 : xa4Var.hashCode()) * 31;
        xa4<g16> xa4Var2 = this.placementSpec;
        int iHashCode2 = (iHashCode + (xa4Var2 == null ? 0 : xa4Var2.hashCode())) * 31;
        xa4<Float> xa4Var3 = this.fadeOutSpec;
        return iHashCode2 + (xa4Var3 != null ? xa4Var3.hashCode() : 0);
    }

    public String toString() {
        return "LazyLayoutAnimateItemElement(fadeInSpec=" + this.fadeInSpec + ", placementSpec=" + this.placementSpec + ", fadeOutSpec=" + this.fadeOutSpec + ')';
    }
}
