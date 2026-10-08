package com.google.inputmethod;

import androidx.compose.ui.input.pointer.k;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.google.android.jcc, reason: from toString */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B%\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lcom/google/android/jcc;", "Lcom/google/android/uy7;", "Landroidx/compose/ui/input/pointer/k;", "Lcom/google/android/ne9;", "icon", "", "overrideDescendants", "Lcom/google/android/kf3;", "touchBoundsExpansion", "<init>", "(Lcom/google/android/ne9;ZLcom/google/android/kf3;)V", "d", "()Landroidx/compose/ui/input/pointer/k;", "node", "", "e", "(Landroidx/compose/ui/input/pointer/k;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/google/android/ne9;", "getIcon", "()Lcom/google/android/ne9;", "Z", "getOverrideDescendants", "()Z", "f", "Lcom/google/android/kf3;", "getTouchBoundsExpansion", "()Lcom/google/android/kf3;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class StylusHoverIconModifierElement extends uy7<k> {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final ne9 icon;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    private final boolean overrideDescendants;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    private final DpTouchBoundsExpansion touchBoundsExpansion;

    public StylusHoverIconModifierElement(ne9 ne9Var, boolean z, DpTouchBoundsExpansion dpTouchBoundsExpansion) {
        this.icon = ne9Var;
        this.overrideDescendants = z;
        this.touchBoundsExpansion = dpTouchBoundsExpansion;
    }

    @Override // com.google.inputmethod.uy7
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public k a() {
        return new k(this.icon, this.overrideDescendants, this.touchBoundsExpansion);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    @Override // com.google.inputmethod.uy7
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void c(k node) throws KotlinNothingValueException {
        node.A3(this.icon);
        node.B3(this.overrideDescendants);
        node.z3(this.touchBoundsExpansion);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StylusHoverIconModifierElement)) {
            return false;
        }
        StylusHoverIconModifierElement stylusHoverIconModifierElement = (StylusHoverIconModifierElement) other;
        return Intrinsics.e(this.icon, stylusHoverIconModifierElement.icon) && this.overrideDescendants == stylusHoverIconModifierElement.overrideDescendants && Intrinsics.e(this.touchBoundsExpansion, stylusHoverIconModifierElement.touchBoundsExpansion);
    }

    public int hashCode() {
        int iHashCode = ((this.icon.hashCode() * 31) + Boolean.hashCode(this.overrideDescendants)) * 31;
        DpTouchBoundsExpansion dpTouchBoundsExpansion = this.touchBoundsExpansion;
        return iHashCode + (dpTouchBoundsExpansion == null ? 0 : dpTouchBoundsExpansion.hashCode());
    }

    public String toString() {
        return "StylusHoverIconModifierElement(icon=" + this.icon + ", overrideDescendants=" + this.overrideDescendants + ", touchBoundsExpansion=" + this.touchBoundsExpansion + ')';
    }
}
