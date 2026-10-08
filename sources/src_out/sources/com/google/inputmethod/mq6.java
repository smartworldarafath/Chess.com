package com.google.inputmethod;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.ranges.g;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001b\b\u0001\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\"R\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0019R\u0017\u0010$\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u0019\u001a\u0004\b\u001e\u0010\u001aR\u0017\u0010&\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u0019\u001a\u0004\b \u0010\u001a¨\u0006'"}, d2 = {"Lcom/google/android/mq6;", "", "", "index", "", "Lcom/google/android/kq6;", "items", "Lcom/google/android/uq6;", "slots", "", "Lcom/google/android/q15;", "spans", "", "isVertical", "mainAxisSpacing", "<init>", "(I[Lcom/google/android/kq6;Lcom/google/android/uq6;Ljava/util/List;ZI)V", "e", "()Z", "offset", "layoutWidth", "layoutHeight", "f", "(III)[Lcom/google/android/kq6;", "a", "I", "()I", "b", "[Lcom/google/android/kq6;", "()[Lcom/google/android/kq6;", "c", "Lcom/google/android/uq6;", "d", "Ljava/util/List;", "Z", "g", "mainAxisSize", "h", "mainAxisSizeWithSpacings", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class mq6 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int index;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final kq6[] items;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final uq6 slots;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final List<q15> spans;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final boolean isVertical;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final int mainAxisSpacing;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final int mainAxisSize;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final int mainAxisSizeWithSpacings;

    public mq6(int i, kq6[] kq6VarArr, uq6 uq6Var, List<q15> list, boolean z, int i2) {
        this.index = i;
        this.items = kq6VarArr;
        this.slots = uq6Var;
        this.spans = list;
        this.isVertical = z;
        this.mainAxisSpacing = i2;
        int iMax = 0;
        for (kq6 kq6Var : kq6VarArr) {
            iMax = Math.max(iMax, kq6Var.getMainAxisSize());
        }
        this.mainAxisSize = iMax;
        this.mainAxisSizeWithSpacings = g.e(iMax + this.mainAxisSpacing, 0);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final kq6[] getItems() {
        return this.items;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getMainAxisSize() {
        return this.mainAxisSize;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getMainAxisSizeWithSpacings() {
        return this.mainAxisSizeWithSpacings;
    }

    public final boolean e() {
        return this.items.length == 0;
    }

    public final kq6[] f(int offset, int layoutWidth, int layoutHeight) {
        kq6[] kq6VarArr = this.items;
        int length = kq6VarArr.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            kq6 kq6Var = kq6VarArr[i];
            int i4 = i2 + 1;
            int iD = q15.d(this.spans.get(i2).getPackedValue());
            int i5 = this.slots.getPositions()[i3];
            boolean z = this.isVertical;
            kq6Var.t(offset, i5, layoutWidth, layoutHeight, z ? this.index : i3, z ? i3 : this.index);
            Unit unit = Unit.a;
            i3 += iD;
            i++;
            i2 = i4;
        }
        return this.items;
    }
}
