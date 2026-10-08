package com.google.inputmethod;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001BC\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0000¢\u0006\u0004\b\u0011\u0010\u0012J-\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0013¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0010¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0013H\u0016¢\u0006\u0004\b \u0010!R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\"R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\"R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\"R\u0014\u0010\u0007\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\"R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\"R\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lcom/google/android/nea;", "", "", "topLeft", "bottomRight", "Lcom/google/android/g16;", "windowOffset", "screenOffset", "windowSize", "Lcom/google/android/zh7;", "viewToWindowMatrix", "Lcom/google/android/x23;", "node", "<init>", "(JJJJJ[FLcom/google/android/x23;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "viewport", "", "a", "(Lcom/google/android/nea;)F", "", "left", "top", "right", "bottom", "b", "(IIII)F", "c", "()F", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "J", "d", "e", "f", "[F", "g", "Lcom/google/android/x23;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class nea {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final long topLeft;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final long bottomRight;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final long windowOffset;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final long screenOffset;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final long windowSize;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final float[] viewToWindowMatrix;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final x23 node;

    public /* synthetic */ nea(long j, long j2, long j3, long j4, long j5, float[] fArr, x23 x23Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, j5, fArr, x23Var);
    }

    public final float a(nea viewport) {
        long j = viewport.topLeft;
        long j2 = viewport.bottomRight;
        return b((int) (j >> 32), (int) j, (int) (j2 >> 32), (int) j2);
    }

    public final float b(int left, int top, int right, int bottom) {
        int i = (int) (this.topLeft >> 32);
        int iMin = Math.min(Math.max(i, left), right);
        int i2 = (int) this.topLeft;
        int iMin2 = Math.min(Math.max(i2, top), bottom);
        int i3 = (int) (this.bottomRight >> 32);
        int iMax = Math.max(Math.min(i3, right), left);
        int i4 = (int) this.bottomRight;
        return Math.max((iMax - iMin) * (Math.max(Math.min(i4, bottom), top) - iMin2), 0) / Math.min((right - left) * (bottom - top), (i3 - i) * (i4 - i2));
    }

    public final float c() {
        long j = this.windowSize;
        return b(0, 0, (int) (j >> 32), (int) j);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x004d  */
    public boolean equals(Object other) {
        boolean zE;
        if (this == other) {
            return true;
        }
        if (other == null || nea.class != other.getClass()) {
            return false;
        }
        nea neaVar = (nea) other;
        if (this.topLeft != neaVar.topLeft || this.bottomRight != neaVar.bottomRight || this.windowSize != neaVar.windowSize || !g16.j(this.windowOffset, neaVar.windowOffset) || !g16.j(this.screenOffset, neaVar.screenOffset)) {
            return false;
        }
        float[] fArr = this.viewToWindowMatrix;
        float[] fArr2 = neaVar.viewToWindowMatrix;
        if (fArr == null) {
            if (fArr2 == null) {
                zE = true;
            } else {
                zE = false;
            }
        } else if (fArr2 == null) {
            zE = false;
        } else {
            zE = zh7.e(fArr, fArr2);
        }
        return zE && Intrinsics.e(this.node, neaVar.node);
    }

    public int hashCode() {
        int iHashCode = ((((((((Long.hashCode(this.topLeft) * 31) + Long.hashCode(this.bottomRight)) * 31) + Long.hashCode(this.windowSize)) * 31) + g16.m(this.windowOffset)) * 31) + g16.m(this.screenOffset)) * 31;
        float[] fArr = this.viewToWindowMatrix;
        return ((iHashCode + (fArr != null ? zh7.f(fArr) : 0)) * 31) + this.node.hashCode();
    }

    private nea(long j, long j2, long j3, long j4, long j5, float[] fArr, x23 x23Var) {
        this.topLeft = j;
        this.bottomRight = j2;
        this.windowOffset = j3;
        this.screenOffset = j4;
        this.windowSize = j5;
        this.viewToWindowMatrix = fArr;
        this.node = x23Var;
    }
}
