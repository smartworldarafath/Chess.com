package com.google.inputmethod;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.google.android.kf3, reason: from toString */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0001\u000eB/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001f\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u0019\u001a\u0004\b!\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\b\u0010$¨\u0006&"}, d2 = {"Lcom/google/android/kf3;", "", "Lcom/google/android/ff3;", "start", "top", "end", "bottom", "", "isLayoutDirectionAware", "<init>", "(FFFFZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Lcom/google/android/f43;", "density", "Lcom/google/android/pbd;", "a", "(Lcom/google/android/f43;)J", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "F", "getStart-D9Ej5fM", "()F", "b", "getTop-D9Ej5fM", "c", "getEnd-D9Ej5fM", "d", "getBottom-D9Ej5fM", "e", "Z", "()Z", "f", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class DpTouchBoundsExpansion {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final float start;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final float top;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final float end;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final float bottom;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    private final boolean isLayoutDirectionAware;

    public /* synthetic */ DpTouchBoundsExpansion(float f, float f2, float f3, float f4, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3, f4, z);
    }

    public final long a(f43 density) {
        return pbd.d(pbd.INSTANCE.c(density.O1(this.start), density.O1(this.top), density.O1(this.end), density.O1(this.bottom), this.isLayoutDirectionAware));
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DpTouchBoundsExpansion)) {
            return false;
        }
        DpTouchBoundsExpansion dpTouchBoundsExpansion = (DpTouchBoundsExpansion) other;
        return ff3.k(this.start, dpTouchBoundsExpansion.start) && ff3.k(this.top, dpTouchBoundsExpansion.top) && ff3.k(this.end, dpTouchBoundsExpansion.end) && ff3.k(this.bottom, dpTouchBoundsExpansion.bottom) && this.isLayoutDirectionAware == dpTouchBoundsExpansion.isLayoutDirectionAware;
    }

    public int hashCode() {
        return (((((((ff3.l(this.start) * 31) + ff3.l(this.top)) * 31) + ff3.l(this.end)) * 31) + ff3.l(this.bottom)) * 31) + Boolean.hashCode(this.isLayoutDirectionAware);
    }

    public String toString() {
        return "DpTouchBoundsExpansion(start=" + ((Object) ff3.m(this.start)) + ", top=" + ((Object) ff3.m(this.top)) + ", end=" + ((Object) ff3.m(this.end)) + ", bottom=" + ((Object) ff3.m(this.bottom)) + ", isLayoutDirectionAware=" + this.isLayoutDirectionAware + ')';
    }

    private DpTouchBoundsExpansion(float f, float f2, float f3, float f4, boolean z) {
        this.start = f;
        this.top = f2;
        this.end = f3;
        this.bottom = f4;
        this.isLayoutDirectionAware = z;
        if (!(f >= 0.0f)) {
            zw5.a("Left must be non-negative");
        }
        if (!(f2 >= 0.0f)) {
            zw5.a("Top must be non-negative");
        }
        if (!(f3 >= 0.0f)) {
            zw5.a("Right must be non-negative");
        }
        if (f4 >= 0.0f) {
            return;
        }
        zw5.a("Bottom must be non-negative");
    }
}
