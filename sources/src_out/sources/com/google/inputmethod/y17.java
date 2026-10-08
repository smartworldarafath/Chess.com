package com.google.inputmethod;

import androidx.compose.p001foundation.layout.g1;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0011\u0010\u000fJ\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0002\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001f\u001a\u0004\b \u0010\u0018¨\u0006!"}, d2 = {"Lcom/google/android/y17;", "Landroidx/compose/foundation/layout/g1;", "insets", "Lcom/google/android/fke;", "sides", "<init>", "(Landroidx/compose/foundation/layout/g1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "Lcom/google/android/f43;", "density", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "", "d", "(Lcom/google/android/f43;Landroidx/compose/ui/unit/LayoutDirection;)I", "a", "(Lcom/google/android/f43;)I", "b", "c", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroidx/compose/foundation/layout/g1;", "getInsets", "()Landroidx/compose/foundation/layout/g1;", "I", "getSides-JoeWqyM", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class y17 implements g1 {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final g1 insets;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int sides;

    public /* synthetic */ y17(g1 g1Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(g1Var, i);
    }

    @Override // androidx.compose.p001foundation.layout.g1
    public int a(f43 density) {
        if (fke.l(this.sides, fke.INSTANCE.h())) {
            return this.insets.a(density);
        }
        return 0;
    }

    @Override // androidx.compose.p001foundation.layout.g1
    public int b(f43 density, LayoutDirection layoutDirection) {
        if (fke.l(this.sides, layoutDirection == LayoutDirection.Ltr ? fke.INSTANCE.c() : fke.INSTANCE.d())) {
            return this.insets.b(density, layoutDirection);
        }
        return 0;
    }

    @Override // androidx.compose.p001foundation.layout.g1
    public int c(f43 density) {
        if (fke.l(this.sides, fke.INSTANCE.e())) {
            return this.insets.c(density);
        }
        return 0;
    }

    @Override // androidx.compose.p001foundation.layout.g1
    public int d(f43 density, LayoutDirection layoutDirection) {
        if (fke.l(this.sides, layoutDirection == LayoutDirection.Ltr ? fke.INSTANCE.a() : fke.INSTANCE.b())) {
            return this.insets.d(density, layoutDirection);
        }
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof y17)) {
            return false;
        }
        y17 y17Var = (y17) other;
        return Intrinsics.e(this.insets, y17Var.insets) && fke.k(this.sides, y17Var.sides);
    }

    public int hashCode() {
        return (this.insets.hashCode() * 31) + fke.m(this.sides);
    }

    public String toString() {
        return '(' + this.insets + " only " + ((Object) fke.o(this.sides)) + ')';
    }

    private y17(g1 g1Var, int i) {
        this.insets = g1Var;
        this.sides = i;
    }
}
