package com.google.inputmethod;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.google.android.og, reason: from toString */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\u000e\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001aR\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/google/android/og;", "Lcom/google/android/tq7$b;", "Lcom/google/android/tc$c;", "menuAlignment", "anchorAlignment", "", "offset", "<init>", "(Lcom/google/android/tc$c;Lcom/google/android/tc$c;I)V", "Lcom/google/android/k16;", "anchorBounds", "Lcom/google/android/q16;", "windowSize", "menuHeight", "a", "(Lcom/google/android/k16;JI)I", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/google/android/tc$c;", "b", "c", "I", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class Vertical implements tq7.b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final tc.c menuAlignment;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final tc.c anchorAlignment;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final int offset;

    public Vertical(tc.c cVar, tc.c cVar2, int i) {
        this.menuAlignment = cVar;
        this.anchorAlignment = cVar2;
        this.offset = i;
    }

    @Override // com.google.android.tq7.b
    public int a(k16 anchorBounds, long windowSize, int menuHeight) {
        int iA = this.anchorAlignment.a(0, anchorBounds.j());
        return anchorBounds.getTop() + iA + (-this.menuAlignment.a(0, menuHeight)) + this.offset;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Vertical)) {
            return false;
        }
        Vertical vertical = (Vertical) other;
        return Intrinsics.e(this.menuAlignment, vertical.menuAlignment) && Intrinsics.e(this.anchorAlignment, vertical.anchorAlignment) && this.offset == vertical.offset;
    }

    public int hashCode() {
        return (((this.menuAlignment.hashCode() * 31) + this.anchorAlignment.hashCode()) * 31) + Integer.hashCode(this.offset);
    }

    public String toString() {
        return "Vertical(menuAlignment=" + this.menuAlignment + ", anchorAlignment=" + this.anchorAlignment + ", offset=" + this.offset + ')';
    }
}
