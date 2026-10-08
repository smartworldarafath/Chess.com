package com.google.inputmethod;

import android.os.IBinder;
import androidx.compose.ui.window.AndroidPopup_androidKt;
import androidx.compose.ui.window.SecureFlagPolicy;
import com.google.android.r43;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0007\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eB;\b\u0016\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u0011BC\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u0012B1\b\u0017\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u0013BE\b\u0016\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u0016Be\b\u0016\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u0017J\u001a\u0010\u0019\u001a\u00020\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u001cR\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b \u0010#R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b%\u0010!\u001a\u0004\b$\u0010#R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010!\u001a\u0004\b%\u0010#R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010!\u001a\u0004\b&\u0010#R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010\u001e\u001a\u0004\b'\u0010\u001cR\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b(\u0010*R\u0011\u0010\u0010\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u001d\u0010#¨\u0006+"}, d2 = {"Lcom/google/android/sg9;", "", "", "flags", "", "inheritSecurePolicy", "dismissOnBackPress", "dismissOnClickOutside", "excludeFromSystemGesture", "usePlatformDefaultWidth", "windowType", "Landroid/os/IBinder;", "windowToken", "<init>", "(IZZZZZILandroid/os/IBinder;)V", "focusable", "clippingEnabled", "(ZZZZZ)V", "(IZZZZZ)V", "(ZZZZ)V", "Landroidx/compose/ui/window/SecureFlagPolicy;", "securePolicy", "(ZZZLandroidx/compose/ui/window/SecureFlagPolicy;ZZ)V", "(ZZZLandroidx/compose/ui/window/SecureFlagPolicy;ZZZILandroid/os/IBinder;)V", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "a", "I", "e", "b", "Z", "f", "()Z", "c", "d", "g", "i", "h", "Landroid/os/IBinder;", "()Landroid/os/IBinder;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class sg9 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int flags;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean inheritSecurePolicy;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean dismissOnBackPress;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean dismissOnClickOutside;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final boolean excludeFromSystemGesture;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final boolean usePlatformDefaultWidth;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final int windowType;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final IBinder windowToken;

    public sg9(int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i2, IBinder iBinder) {
        this.flags = i;
        this.inheritSecurePolicy = z;
        this.dismissOnBackPress = z2;
        this.dismissOnClickOutside = z3;
        this.excludeFromSystemGesture = z4;
        this.usePlatformDefaultWidth = z5;
        this.windowType = i2;
        this.windowToken = iBinder;
    }

    public final boolean a() {
        return (this.flags & 512) == 0;
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
    public final boolean getExcludeFromSystemGesture() {
        return this.excludeFromSystemGesture;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getFlags() {
        return this.flags;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof sg9)) {
            return false;
        }
        sg9 sg9Var = (sg9) other;
        return this.flags == sg9Var.flags && this.inheritSecurePolicy == sg9Var.inheritSecurePolicy && this.dismissOnBackPress == sg9Var.dismissOnBackPress && this.dismissOnClickOutside == sg9Var.dismissOnClickOutside && this.excludeFromSystemGesture == sg9Var.excludeFromSystemGesture && this.usePlatformDefaultWidth == sg9Var.usePlatformDefaultWidth && this.windowType == sg9Var.windowType && Intrinsics.e(this.windowToken, sg9Var.windowToken);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getInheritSecurePolicy() {
        return this.inheritSecurePolicy;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getUsePlatformDefaultWidth() {
        return this.usePlatformDefaultWidth;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final IBinder getWindowToken() {
        return this.windowToken;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((this.flags * 31) + Boolean.hashCode(this.inheritSecurePolicy)) * 31) + Boolean.hashCode(this.dismissOnBackPress)) * 31) + Boolean.hashCode(this.dismissOnClickOutside)) * 31) + Boolean.hashCode(this.excludeFromSystemGesture)) * 31) + Boolean.hashCode(this.usePlatformDefaultWidth)) * 31) + this.windowType) * 31;
        IBinder iBinder = this.windowToken;
        return iHashCode + (iBinder != null ? iBinder.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final int getWindowType() {
        return this.windowType;
    }

    public /* synthetic */ sg9(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? true : z2, (i & 4) != 0 ? true : z3, (i & 8) != 0 ? true : z4, (i & 16) != 0 ? false : z5);
    }

    public sg9(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this(z, z2, z3, SecureFlagPolicy.Inherit, true, z4, z5, 1002, null);
    }

    public /* synthetic */ sg9(int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? true : z, (i2 & 4) != 0 ? true : z2, (i2 & 8) != 0 ? true : z3, (i2 & 16) != 0 ? true : z4, (i2 & 32) != 0 ? false : z5);
    }

    @r43
    public /* synthetic */ sg9(int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this(i, z, z2, z3, z4, z5, 1002, (IBinder) null);
    }

    public /* synthetic */ sg9(boolean z, boolean z2, boolean z3, boolean z4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? true : z2, (i & 4) != 0 ? true : z3, (i & 8) != 0 ? true : z4);
    }

    @r43
    public /* synthetic */ sg9(boolean z, boolean z2, boolean z3, boolean z4) {
        this(z, z2, z3, SecureFlagPolicy.Inherit, true, z4);
    }

    public /* synthetic */ sg9(boolean z, boolean z2, boolean z3, SecureFlagPolicy secureFlagPolicy, boolean z4, boolean z5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? true : z2, (i & 4) != 0 ? true : z3, (i & 8) != 0 ? SecureFlagPolicy.Inherit : secureFlagPolicy, (i & 16) != 0 ? true : z4, (i & 32) != 0 ? true : z5);
    }

    public sg9(boolean z, boolean z2, boolean z3, SecureFlagPolicy secureFlagPolicy, boolean z4, boolean z5) {
        this(z, z2, z3, secureFlagPolicy, z4, z5, false, 0, null, 384, null);
    }

    public /* synthetic */ sg9(boolean z, boolean z2, boolean z3, SecureFlagPolicy secureFlagPolicy, boolean z4, boolean z5, boolean z6, int i, IBinder iBinder, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? true : z2, (i2 & 4) != 0 ? true : z3, (i2 & 8) != 0 ? SecureFlagPolicy.Inherit : secureFlagPolicy, (i2 & 16) != 0 ? true : z4, (i2 & 32) != 0 ? true : z5, (i2 & 64) != 0 ? false : z6, (i2 & 128) != 0 ? 1002 : i, (i2 & 256) != 0 ? null : iBinder);
    }

    public sg9(boolean z, boolean z2, boolean z3, SecureFlagPolicy secureFlagPolicy, boolean z4, boolean z5, boolean z6, int i, IBinder iBinder) {
        this(AndroidPopup_androidKt.g(z, secureFlagPolicy, z5), secureFlagPolicy == SecureFlagPolicy.Inherit, z2, z3, z4, z6, i, iBinder);
    }
}
