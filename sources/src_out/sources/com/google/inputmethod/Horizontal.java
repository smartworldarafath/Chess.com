package com.google.inputmethod;

import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.g;

/* JADX INFO: renamed from: com.google.android.ohe, reason: from toString */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J/\u0010\u000f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/google/android/ohe;", "Lcom/google/android/tq7$a;", "Lcom/google/android/tc$b;", "alignment", "", "margin", "<init>", "(Lcom/google/android/tc$b;I)V", "Lcom/google/android/k16;", "anchorBounds", "Lcom/google/android/q16;", "windowSize", "menuWidth", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "a", "(Lcom/google/android/k16;JILandroidx/compose/ui/unit/LayoutDirection;)I", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/google/android/tc$b;", "b", "I", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class Horizontal implements tq7.a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final tc.b alignment;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int margin;

    public Horizontal(tc.b bVar, int i) {
        this.alignment = bVar;
        this.margin = i;
    }

    @Override // com.google.android.tq7.a
    public int a(k16 anchorBounds, long windowSize, int menuWidth, LayoutDirection layoutDirection) {
        int i = (int) (windowSize >> 32);
        if (menuWidth >= i - (this.margin * 2)) {
            return tc.INSTANCE.g().a(menuWidth, i, layoutDirection);
        }
        int iA = this.alignment.a(menuWidth, i, layoutDirection);
        int i2 = this.margin;
        return g.o(iA, i2, (i - i2) - menuWidth);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Horizontal)) {
            return false;
        }
        Horizontal horizontal = (Horizontal) other;
        return Intrinsics.e(this.alignment, horizontal.alignment) && this.margin == horizontal.margin;
    }

    public int hashCode() {
        return (this.alignment.hashCode() * 31) + Integer.hashCode(this.margin);
    }

    public String toString() {
        return "Horizontal(alignment=" + this.alignment + ", margin=" + this.margin + ')';
    }
}
