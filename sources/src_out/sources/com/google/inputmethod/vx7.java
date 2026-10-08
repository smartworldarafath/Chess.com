package com.google.inputmethod;

import androidx.compose.ui.window.SecureFlagPolicy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\b\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0011\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028G¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0016\u0010\u0014R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0015\u0010\u0019¨\u0006\u001c"}, d2 = {"Lcom/google/android/vx7;", "", "", "shouldDismissOnBackPress", "shouldDismissOnClickOutside", "<init>", "(ZZ)V", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroidx/compose/ui/window/SecureFlagPolicy;", "a", "Landroidx/compose/ui/window/SecureFlagPolicy;", "()Landroidx/compose/ui/window/SecureFlagPolicy;", "securePolicy", "b", "Z", "()Z", "c", "e", "d", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "isAppearanceLightStatusBars", "isAppearanceLightNavigationBars", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class vx7 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final SecureFlagPolicy securePolicy;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean shouldDismissOnBackPress;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean shouldDismissOnClickOutside;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Boolean isAppearanceLightStatusBars;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final Boolean isAppearanceLightNavigationBars;

    public vx7(boolean z, boolean z2) {
        this.securePolicy = SecureFlagPolicy.Inherit;
        this.shouldDismissOnBackPress = z;
        this.shouldDismissOnClickOutside = z2;
        this.isAppearanceLightNavigationBars = null;
        this.isAppearanceLightStatusBars = null;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final SecureFlagPolicy getSecurePolicy() {
        return this.securePolicy;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getShouldDismissOnBackPress() {
        return this.shouldDismissOnBackPress;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Boolean getIsAppearanceLightNavigationBars() {
        return this.isAppearanceLightNavigationBars;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Boolean getIsAppearanceLightStatusBars() {
        return this.isAppearanceLightStatusBars;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getShouldDismissOnClickOutside() {
        return this.shouldDismissOnClickOutside;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof vx7)) {
            return false;
        }
        vx7 vx7Var = (vx7) other;
        return this.securePolicy == vx7Var.securePolicy && Intrinsics.e(this.isAppearanceLightStatusBars, vx7Var.isAppearanceLightStatusBars) && Intrinsics.e(this.isAppearanceLightNavigationBars, vx7Var.isAppearanceLightNavigationBars) && this.shouldDismissOnClickOutside == vx7Var.shouldDismissOnClickOutside && this.shouldDismissOnBackPress == vx7Var.shouldDismissOnBackPress;
    }

    public int hashCode() {
        int iHashCode = ((this.securePolicy.hashCode() * 31) + Boolean.hashCode(this.shouldDismissOnBackPress)) * 31;
        Boolean bool = this.isAppearanceLightStatusBars;
        int iHashCode2 = (iHashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        Boolean bool2 = this.isAppearanceLightNavigationBars;
        return ((iHashCode2 + (bool2 != null ? bool2.hashCode() : 0)) * 31) + Boolean.hashCode(this.shouldDismissOnClickOutside);
    }

    public /* synthetic */ vx7(boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? true : z2);
    }
}
