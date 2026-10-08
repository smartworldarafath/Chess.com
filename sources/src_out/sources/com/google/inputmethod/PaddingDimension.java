package com.google.inputmethod;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.google.android.fx8, reason: from toString */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 \n2\u00020\u0001:\u0001\u0014B!\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001a"}, d2 = {"Lcom/google/android/fx8;", "", "Lcom/google/android/ff3;", "dp", "", "", "resourceIds", "<init>", "(FLjava/util/List;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "other", "c", "(Lcom/google/android/fx8;)Lcom/google/android/fx8;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "equals", "(Ljava/lang/Object;)Z", "a", "F", "()F", "b", "Ljava/util/List;", "()Ljava/util/List;", "glance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class PaddingDimension {
    public static final int d = 8;
    private static final PaddingDimension e;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final float dp;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final List<Integer> resourceIds;

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        INSTANCE = new Companion(defaultConstructorMarker);
        e = new PaddingDimension(0.0f, defaultConstructorMarker, 3, defaultConstructorMarker);
    }

    public /* synthetic */ PaddingDimension(float f, List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, list);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final float getDp() {
        return this.dp;
    }

    public final List<Integer> b() {
        return this.resourceIds;
    }

    public final PaddingDimension c(PaddingDimension other) {
        return new PaddingDimension(ff3.i(this.dp + other.dp), m.a1(this.resourceIds, other.resourceIds), null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaddingDimension)) {
            return false;
        }
        PaddingDimension paddingDimension = (PaddingDimension) other;
        return ff3.k(this.dp, paddingDimension.dp) && Intrinsics.e(this.resourceIds, paddingDimension.resourceIds);
    }

    public int hashCode() {
        return (ff3.l(this.dp) * 31) + this.resourceIds.hashCode();
    }

    public String toString() {
        return "PaddingDimension(dp=" + ((Object) ff3.m(this.dp)) + ", resourceIds=" + this.resourceIds + ')';
    }

    private PaddingDimension(float f, List<Integer> list) {
        this.dp = f;
        this.resourceIds = list;
    }

    public /* synthetic */ PaddingDimension(float f, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? ff3.i(0) : f, (i & 2) != 0 ? m.p() : list, null);
    }
}
