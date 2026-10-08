package com.google.inputmethod;

import androidx.compose.p001foundation.layout.g1;
import androidx.compose.p004runtime.s0;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0001\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000f\u0010\rR+\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00018F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000e\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0004¨\u0006\u0016"}, d2 = {"Lcom/google/android/u58;", "Landroidx/compose/foundation/layout/g1;", "initialInsets", "<init>", "(Landroidx/compose/foundation/layout/g1;)V", "Lcom/google/android/f43;", "density", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "", "d", "(Lcom/google/android/f43;Landroidx/compose/ui/unit/LayoutDirection;)I", "a", "(Lcom/google/android/f43;)I", "b", "c", "<set-?>", "Lcom/google/android/o58;", "e", "()Landroidx/compose/foundation/layout/g1;", "f", "insets", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class u58 implements g1 {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final o58 insets;

    /* JADX WARN: Illegal instructions before constructor call */
    public u58() {
        g1 g1Var = null;
        this(g1Var, 1, g1Var);
    }

    @Override // androidx.compose.p001foundation.layout.g1
    public int a(f43 density) {
        return e().a(density);
    }

    @Override // androidx.compose.p001foundation.layout.g1
    public int b(f43 density, LayoutDirection layoutDirection) {
        return e().b(density, layoutDirection);
    }

    @Override // androidx.compose.p001foundation.layout.g1
    public int c(f43 density) {
        return e().c(density);
    }

    @Override // androidx.compose.p001foundation.layout.g1
    public int d(f43 density, LayoutDirection layoutDirection) {
        return e().d(density, layoutDirection);
    }

    public final g1 e() {
        return (g1) this.insets.getValue();
    }

    public final void f(g1 g1Var) {
        this.insets.setValue(g1Var);
    }

    public u58(g1 g1Var) {
        this.insets = s0.e(g1Var, null, 2, null);
    }

    public /* synthetic */ u58(g1 g1Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? rje.b(0, 0, 0, 0) : g1Var);
    }
}
