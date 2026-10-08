package com.google.inputmethod;

import android.os.IBinder;
import androidx.compose.ui.window.SecureFlagPolicy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0007\u0018\u00002\u00020\u0001BY\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010B'\b\u0016\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001f\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0018\u001a\u0004\b\u0017\u0010\u001aR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\"R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\u0016R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b#\u0010'¨\u0006("}, d2 = {"Lcom/google/android/x93;", "", "", "dismissOnBackPress", "dismissOnClickOutside", "Landroidx/compose/ui/window/SecureFlagPolicy;", "securePolicy", "usePlatformDefaultWidth", "decorFitsSystemWindows", "", "windowTitle", "", "windowType", "Landroid/os/IBinder;", "windowToken", "<init>", "(ZZLandroidx/compose/ui/window/SecureFlagPolicy;ZZLjava/lang/String;ILandroid/os/IBinder;)V", "(ZZZ)V", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "a", "Z", "b", "()Z", "c", "Landroidx/compose/ui/window/SecureFlagPolicy;", "d", "()Landroidx/compose/ui/window/SecureFlagPolicy;", "e", "f", "Ljava/lang/String;", "()Ljava/lang/String;", "g", "I", "h", "Landroid/os/IBinder;", "()Landroid/os/IBinder;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class x93 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean dismissOnBackPress;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean dismissOnClickOutside;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final SecureFlagPolicy securePolicy;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean usePlatformDefaultWidth;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final boolean decorFitsSystemWindows;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final String windowTitle;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final int windowType;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final IBinder windowToken;

    public x93(boolean z, boolean z2, SecureFlagPolicy secureFlagPolicy, boolean z3, boolean z4, String str, int i, IBinder iBinder) {
        this.dismissOnBackPress = z;
        this.dismissOnClickOutside = z2;
        this.securePolicy = secureFlagPolicy;
        this.usePlatformDefaultWidth = z3;
        this.decorFitsSystemWindows = z4;
        this.windowTitle = str;
        this.windowType = i;
        this.windowToken = iBinder;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getDecorFitsSystemWindows() {
        return this.decorFitsSystemWindows;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getDismissOnBackPress() {
        return this.dismissOnBackPress;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getDismissOnClickOutside() {
        return this.dismissOnClickOutside;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final SecureFlagPolicy getSecurePolicy() {
        return this.securePolicy;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getUsePlatformDefaultWidth() {
        return this.usePlatformDefaultWidth;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof x93)) {
            return false;
        }
        x93 x93Var = (x93) other;
        return this.dismissOnBackPress == x93Var.dismissOnBackPress && this.dismissOnClickOutside == x93Var.dismissOnClickOutside && this.securePolicy == x93Var.securePolicy && this.usePlatformDefaultWidth == x93Var.usePlatformDefaultWidth && this.decorFitsSystemWindows == x93Var.decorFitsSystemWindows && this.windowType == x93Var.windowType && Intrinsics.e(this.windowToken, x93Var.windowToken);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getWindowTitle() {
        return this.windowTitle;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final IBinder getWindowToken() {
        return this.windowToken;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final int getWindowType() {
        return this.windowType;
    }

    public int hashCode() {
        int iHashCode = ((((((((((Boolean.hashCode(this.dismissOnBackPress) * 31) + Boolean.hashCode(this.dismissOnClickOutside)) * 31) + this.securePolicy.hashCode()) * 31) + Boolean.hashCode(this.usePlatformDefaultWidth)) * 31) + Boolean.hashCode(this.decorFitsSystemWindows)) * 31) + this.windowType) * 31;
        IBinder iBinder = this.windowToken;
        return iHashCode + (iBinder != null ? iBinder.hashCode() : 0);
    }

    public /* synthetic */ x93(boolean z, boolean z2, SecureFlagPolicy secureFlagPolicy, boolean z3, boolean z4, String str, int i, IBinder iBinder, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? true : z, (i2 & 2) != 0 ? true : z2, (i2 & 4) != 0 ? SecureFlagPolicy.Inherit : secureFlagPolicy, (i2 & 8) != 0 ? true : z3, (i2 & 16) != 0 ? true : z4, (i2 & 32) != 0 ? "" : str, (i2 & 64) != 0 ? 2 : i, (i2 & 128) != 0 ? null : iBinder);
    }

    public /* synthetic */ x93(boolean z, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? true : z2, (i & 4) != 0 ? true : z3);
    }

    public x93(boolean z, boolean z2, boolean z3) {
        this(z, z2, SecureFlagPolicy.Inherit, z3, true, null, 0, null, 224, null);
    }
}
