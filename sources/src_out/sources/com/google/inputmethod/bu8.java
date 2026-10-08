package com.google.inputmethod;

import androidx.compose.p001foundation.layout.LayoutOrientation;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0081@\u0018\u00002\u00020\u0001B)\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bB\u0019\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\n\u0010\rB\u0011\b\u0002\u0012\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0011\u0010\rJ5\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u0088\u0001\u000e\u0092\u0001\u00020\t¨\u0006\u0014"}, d2 = {"Lcom/google/android/bu8;", "", "", "mainAxisMin", "mainAxisMax", "crossAxisMin", "crossAxisMax", "a", "(IIII)J", "Lcom/google/android/kx1;", "c", "Landroidx/compose/foundation/layout/LayoutOrientation;", "orientation", "(JLandroidx/compose/foundation/layout/LayoutOrientation;)J", "value", "b", "(J)J", "f", "d", "(JIIII)J", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class bu8 {
    public static long a(int i, int i2, int i3, int i4) {
        return b(nx1.a(i, i2, i3, i4));
    }

    private static long b(long j) {
        return j;
    }

    public static long c(long j, LayoutOrientation layoutOrientation) {
        LayoutOrientation layoutOrientation2 = LayoutOrientation.Horizontal;
        return a(layoutOrientation == layoutOrientation2 ? kx1.n(j) : kx1.m(j), layoutOrientation == layoutOrientation2 ? kx1.l(j) : kx1.k(j), layoutOrientation == layoutOrientation2 ? kx1.m(j) : kx1.n(j), layoutOrientation == layoutOrientation2 ? kx1.k(j) : kx1.l(j));
    }

    public static final long d(long j, int i, int i2, int i3, int i4) {
        return a(i, i2, i3, i4);
    }

    public static /* synthetic */ long e(long j, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = kx1.n(j);
        }
        int i6 = i;
        if ((i5 & 2) != 0) {
            i2 = kx1.l(j);
        }
        int i7 = i2;
        if ((i5 & 4) != 0) {
            i3 = kx1.m(j);
        }
        int i8 = i3;
        if ((i5 & 8) != 0) {
            i4 = kx1.k(j);
        }
        return d(j, i6, i7, i8, i4);
    }

    public static final long f(long j, LayoutOrientation layoutOrientation) {
        return layoutOrientation == LayoutOrientation.Horizontal ? nx1.a(kx1.n(j), kx1.l(j), kx1.m(j), kx1.k(j)) : nx1.a(kx1.m(j), kx1.k(j), kx1.n(j), kx1.l(j));
    }
}
