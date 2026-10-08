package com.google.inputmethod;

import androidx.compose.p001foundation.layout.g1;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.g;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\fJ\u0017\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u000eJ\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/google/android/xx3;", "Landroidx/compose/foundation/layout/g1;", "included", "excluded", "<init>", "(Landroidx/compose/foundation/layout/g1;Landroidx/compose/foundation/layout/g1;)V", "Lcom/google/android/f43;", "density", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "", "d", "(Lcom/google/android/f43;Landroidx/compose/ui/unit/LayoutDirection;)I", "a", "(Lcom/google/android/f43;)I", "b", "c", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Landroidx/compose/foundation/layout/g1;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class xx3 implements g1 {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final g1 included;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final g1 excluded;

    public xx3(g1 g1Var, g1 g1Var2) {
        this.included = g1Var;
        this.excluded = g1Var2;
    }

    @Override // androidx.compose.p001foundation.layout.g1
    public int a(f43 density) {
        return g.e(this.included.a(density) - this.excluded.a(density), 0);
    }

    @Override // androidx.compose.p001foundation.layout.g1
    public int b(f43 density, LayoutDirection layoutDirection) {
        return g.e(this.included.b(density, layoutDirection) - this.excluded.b(density, layoutDirection), 0);
    }

    @Override // androidx.compose.p001foundation.layout.g1
    public int c(f43 density) {
        return g.e(this.included.c(density) - this.excluded.c(density), 0);
    }

    @Override // androidx.compose.p001foundation.layout.g1
    public int d(f43 density, LayoutDirection layoutDirection) {
        return g.e(this.included.d(density, layoutDirection) - this.excluded.d(density, layoutDirection), 0);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof xx3)) {
            return false;
        }
        xx3 xx3Var = (xx3) other;
        return Intrinsics.e(xx3Var.included, this.included) && Intrinsics.e(xx3Var.excluded, this.excluded);
    }

    public int hashCode() {
        return (this.included.hashCode() * 31) + this.excluded.hashCode();
    }

    public String toString() {
        return '(' + this.included + " - " + this.excluded + ')';
    }
}
