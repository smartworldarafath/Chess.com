package com.google.inputmethod;

import androidx.compose.p001foundation.layout.g1;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.google.android.dz5, reason: from toString */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\fJ\u000f\u0010\u0010\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0010\u0010\u000eJ\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001f¨\u0006 "}, d2 = {"Lcom/google/android/dz5;", "Lcom/google/android/rx8;", "Landroidx/compose/foundation/layout/g1;", "insets", "Lcom/google/android/f43;", "density", "<init>", "(Landroidx/compose/foundation/layout/g1;Lcom/google/android/f43;)V", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Lcom/google/android/ff3;", "b", "(Landroidx/compose/ui/unit/LayoutDirection;)F", "d", "()F", "c", "a", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroidx/compose/foundation/layout/g1;", "getInsets", "()Landroidx/compose/foundation/layout/g1;", "Lcom/google/android/f43;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class InsetsPaddingValues implements rx8 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final g1 insets;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final f43 density;

    public InsetsPaddingValues(g1 g1Var, f43 f43Var) {
        this.insets = g1Var;
        this.density = f43Var;
    }

    @Override // com.google.inputmethod.rx8
    /* JADX INFO: renamed from: a */
    public float getBottom() {
        f43 f43Var = this.density;
        return f43Var.O0(this.insets.c(f43Var));
    }

    @Override // com.google.inputmethod.rx8
    public float b(LayoutDirection layoutDirection) {
        f43 f43Var = this.density;
        return f43Var.O0(this.insets.d(f43Var, layoutDirection));
    }

    @Override // com.google.inputmethod.rx8
    public float c(LayoutDirection layoutDirection) {
        f43 f43Var = this.density;
        return f43Var.O0(this.insets.b(f43Var, layoutDirection));
    }

    @Override // com.google.inputmethod.rx8
    /* JADX INFO: renamed from: d */
    public float getTop() {
        f43 f43Var = this.density;
        return f43Var.O0(this.insets.a(f43Var));
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InsetsPaddingValues)) {
            return false;
        }
        InsetsPaddingValues insetsPaddingValues = (InsetsPaddingValues) other;
        return Intrinsics.e(this.insets, insetsPaddingValues.insets) && Intrinsics.e(this.density, insetsPaddingValues.density);
    }

    public int hashCode() {
        return (this.insets.hashCode() * 31) + this.density.hashCode();
    }

    public String toString() {
        return "InsetsPaddingValues(insets=" + this.insets + ", density=" + this.density + ')';
    }
}
