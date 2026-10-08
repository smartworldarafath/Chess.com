package com.google.inputmethod;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.google.android.hx8, reason: from toString */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\u000b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0004\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\u001c\u0010\u001bR\u001d\u0010\u0005\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001e\u0010\u001bR\u001d\u0010\u0006\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u001d\u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\r\u0010\u0019\u001a\u0004\b\u001f\u0010\u001bR\u001d\u0010\b\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b \u0010\u0019\u001a\u0004\b\u0018\u0010\u001b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006!"}, d2 = {"Lcom/google/android/hx8;", "", "Lcom/google/android/ff3;", "left", "start", "top", "right", "end", "bottom", "<init>", "(FFFFFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "isRtl", "e", "(Z)Lcom/google/android/hx8;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "F", "b", "()F", "getStart-D9Ej5fM", "c", "d", "getEnd-D9Ej5fM", "f", "glance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class PaddingInDp {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final float left;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final float start;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final float top;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final float right;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    private final float end;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    private final float bottom;

    public /* synthetic */ PaddingInDp(float f, float f2, float f3, float f4, float f5, float f6, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3, f4, f5, f6);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final float getBottom() {
        return this.bottom;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final float getLeft() {
        return this.left;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final float getRight() {
        return this.right;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final float getTop() {
        return this.top;
    }

    public final PaddingInDp e(boolean isRtl) {
        return new PaddingInDp(ff3.i(this.left + (isRtl ? this.end : this.start)), 0.0f, this.top, ff3.i(this.right + (isRtl ? this.start : this.end)), 0.0f, this.bottom, 18, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaddingInDp)) {
            return false;
        }
        PaddingInDp paddingInDp = (PaddingInDp) other;
        return ff3.k(this.left, paddingInDp.left) && ff3.k(this.start, paddingInDp.start) && ff3.k(this.top, paddingInDp.top) && ff3.k(this.right, paddingInDp.right) && ff3.k(this.end, paddingInDp.end) && ff3.k(this.bottom, paddingInDp.bottom);
    }

    public int hashCode() {
        return (((((((((ff3.l(this.left) * 31) + ff3.l(this.start)) * 31) + ff3.l(this.top)) * 31) + ff3.l(this.right)) * 31) + ff3.l(this.end)) * 31) + ff3.l(this.bottom);
    }

    public String toString() {
        return "PaddingInDp(left=" + ((Object) ff3.m(this.left)) + ", start=" + ((Object) ff3.m(this.start)) + ", top=" + ((Object) ff3.m(this.top)) + ", right=" + ((Object) ff3.m(this.right)) + ", end=" + ((Object) ff3.m(this.end)) + ", bottom=" + ((Object) ff3.m(this.bottom)) + ')';
    }

    private PaddingInDp(float f, float f2, float f3, float f4, float f5, float f6) {
        this.left = f;
        this.start = f2;
        this.top = f3;
        this.right = f4;
        this.end = f5;
        this.bottom = f6;
    }

    public /* synthetic */ PaddingInDp(float f, float f2, float f3, float f4, float f5, float f6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? ff3.i(0) : f, (i & 2) != 0 ? ff3.i(0) : f2, (i & 4) != 0 ? ff3.i(0) : f3, (i & 8) != 0 ? ff3.i(0) : f4, (i & 16) != 0 ? ff3.i(0) : f5, (i & 32) != 0 ? ff3.i(0) : f6, null);
    }
}
