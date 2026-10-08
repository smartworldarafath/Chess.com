package com.google.inputmethod;

import androidx.compose.p001foundation.layout.g1;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.google.android.ce4, reason: from toString */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0013\u0010\u0011J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001eR\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001eR\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001e¨\u0006 "}, d2 = {"Lcom/google/android/ce4;", "Landroidx/compose/foundation/layout/g1;", "Lcom/google/android/ff3;", "leftDp", "topDp", "rightDp", "bottomDp", "<init>", "(FFFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Lcom/google/android/f43;", "density", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "", "d", "(Lcom/google/android/f43;Landroidx/compose/ui/unit/LayoutDirection;)I", "a", "(Lcom/google/android/f43;)I", "b", "c", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "F", "e", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class Insets implements g1 {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final float left;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final float top;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final float right;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    private final float bottom;

    public /* synthetic */ Insets(float f, float f2, float f3, float f4, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3, f4);
    }

    @Override // androidx.compose.p001foundation.layout.g1
    public int a(f43 density) {
        return density.O1(this.top);
    }

    @Override // androidx.compose.p001foundation.layout.g1
    public int b(f43 density, LayoutDirection layoutDirection) {
        return density.O1(this.right);
    }

    @Override // androidx.compose.p001foundation.layout.g1
    public int c(f43 density) {
        return density.O1(this.bottom);
    }

    @Override // androidx.compose.p001foundation.layout.g1
    public int d(f43 density, LayoutDirection layoutDirection) {
        return density.O1(this.left);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Insets)) {
            return false;
        }
        Insets insets = (Insets) other;
        return ff3.k(this.left, insets.left) && ff3.k(this.top, insets.top) && ff3.k(this.right, insets.right) && ff3.k(this.bottom, insets.bottom);
    }

    public int hashCode() {
        return (((((ff3.l(this.left) * 31) + ff3.l(this.top)) * 31) + ff3.l(this.right)) * 31) + ff3.l(this.bottom);
    }

    public String toString() {
        return "Insets(left=" + ((Object) ff3.m(this.left)) + ", top=" + ((Object) ff3.m(this.top)) + ", right=" + ((Object) ff3.m(this.right)) + ", bottom=" + ((Object) ff3.m(this.bottom)) + ')';
    }

    private Insets(float f, float f2, float f3, float f4) {
        this.left = f;
        this.top = f2;
        this.right = f3;
        this.bottom = f4;
    }
}
