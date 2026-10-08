package com.google.inputmethod;

import androidx.p008glance.g;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.google.android.u7, reason: from toString */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/google/android/u7;", "Landroidx/glance/g$b;", "Lcom/google/android/l7;", "action", "", "rippleOverride", "<init>", "(Lcom/google/android/l7;I)V", "", "toString", "()Ljava/lang/String;", "b", "Lcom/google/android/l7;", "()Lcom/google/android/l7;", "c", "I", "()I", "glance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ActionModifier implements g.b {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final l7 action;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final int rippleOverride;

    public ActionModifier(l7 l7Var, int i) {
        this.action = l7Var;
        this.rippleOverride = i;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final l7 getAction() {
        return this.action;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getRippleOverride() {
        return this.rippleOverride;
    }

    public String toString() {
        return "ActionModifier(action=" + this.action + ", rippleOverride=" + this.rippleOverride + ')';
    }

    public /* synthetic */ ActionModifier(l7 l7Var, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(l7Var, (i2 & 2) != 0 ? 0 : i);
    }
}
