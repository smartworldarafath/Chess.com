package com.google.inputmethod;

import android.content.res.Resources;
import androidx.p008glance.g;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.google.android.ox8, reason: from toString */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001d\u001a\u0004\b \u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001d\u001a\u0004\b\"\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u001d\u001a\u0004\b$\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u001d\u001a\u0004\b&\u0010\u001fR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010\u001d\u001a\u0004\b(\u0010\u001f¨\u0006)"}, d2 = {"Lcom/google/android/ox8;", "Landroidx/glance/g$b;", "Lcom/google/android/fx8;", "left", "start", "top", "right", "end", "bottom", "<init>", "(Lcom/google/android/fx8;Lcom/google/android/fx8;Lcom/google/android/fx8;Lcom/google/android/fx8;Lcom/google/android/fx8;Lcom/google/android/fx8;)V", "other", "b", "(Lcom/google/android/ox8;)Lcom/google/android/ox8;", "Landroid/content/res/Resources;", "resources", "Lcom/google/android/hx8;", "c", "(Landroid/content/res/Resources;)Lcom/google/android/hx8;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/google/android/fx8;", "getLeft", "()Lcom/google/android/fx8;", "getStart", "d", "getTop", "e", "getRight", "f", "getEnd", "g", "getBottom", "glance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class PaddingModifier implements g.b {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final PaddingDimension left;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final PaddingDimension start;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final PaddingDimension top;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    private final PaddingDimension right;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    private final PaddingDimension end;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    private final PaddingDimension bottom;

    public PaddingModifier() {
        this(null, null, null, null, null, null, 63, null);
    }

    public final PaddingModifier b(PaddingModifier other) {
        return new PaddingModifier(this.left.c(other.left), this.start.c(other.start), this.top.c(other.top), this.right.c(other.right), this.end.c(other.end), this.bottom.c(other.bottom));
    }

    public final PaddingInDp c(Resources resources) {
        return new PaddingInDp(ff3.i(this.left.getDp() + mx8.c(this.left.b(), resources)), ff3.i(this.start.getDp() + mx8.c(this.start.b(), resources)), ff3.i(this.top.getDp() + mx8.c(this.top.b(), resources)), ff3.i(this.right.getDp() + mx8.c(this.right.b(), resources)), ff3.i(this.end.getDp() + mx8.c(this.end.b(), resources)), ff3.i(this.bottom.getDp() + mx8.c(this.bottom.b(), resources)), null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaddingModifier)) {
            return false;
        }
        PaddingModifier paddingModifier = (PaddingModifier) other;
        return Intrinsics.e(this.left, paddingModifier.left) && Intrinsics.e(this.start, paddingModifier.start) && Intrinsics.e(this.top, paddingModifier.top) && Intrinsics.e(this.right, paddingModifier.right) && Intrinsics.e(this.end, paddingModifier.end) && Intrinsics.e(this.bottom, paddingModifier.bottom);
    }

    public int hashCode() {
        return (((((((((this.left.hashCode() * 31) + this.start.hashCode()) * 31) + this.top.hashCode()) * 31) + this.right.hashCode()) * 31) + this.end.hashCode()) * 31) + this.bottom.hashCode();
    }

    public String toString() {
        return "PaddingModifier(left=" + this.left + ", start=" + this.start + ", top=" + this.top + ", right=" + this.right + ", end=" + this.end + ", bottom=" + this.bottom + ')';
    }

    public PaddingModifier(PaddingDimension paddingDimension, PaddingDimension paddingDimension2, PaddingDimension paddingDimension3, PaddingDimension paddingDimension4, PaddingDimension paddingDimension5, PaddingDimension paddingDimension6) {
        this.left = paddingDimension;
        this.start = paddingDimension2;
        this.top = paddingDimension3;
        this.right = paddingDimension4;
        this.end = paddingDimension5;
        this.bottom = paddingDimension6;
    }

    public /* synthetic */ PaddingModifier(PaddingDimension paddingDimension, PaddingDimension paddingDimension2, PaddingDimension paddingDimension3, PaddingDimension paddingDimension4, PaddingDimension paddingDimension5, PaddingDimension paddingDimension6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new PaddingDimension(0.0f, null, 3, null) : paddingDimension, (i & 2) != 0 ? new PaddingDimension(0.0f, null, 3, null) : paddingDimension2, (i & 4) != 0 ? new PaddingDimension(0.0f, null, 3, null) : paddingDimension3, (i & 8) != 0 ? new PaddingDimension(0.0f, null, 3, null) : paddingDimension4, (i & 16) != 0 ? new PaddingDimension(0.0f, null, 3, null) : paddingDimension5, (i & 32) != 0 ? new PaddingDimension(0.0f, null, 3, null) : paddingDimension6);
    }
}
