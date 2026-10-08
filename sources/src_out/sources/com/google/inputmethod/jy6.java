package com.google.inputmethod;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.e;
import kotlin.collections.f;
import kotlin.collections.m;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0015\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000  2\u00020\u0001:\u0002\b\u0016B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ!\u0010\r\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\tJ\u0015\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0004¢\u0006\u0004\b\u001a\u0010\u0019J\r\u0010\u001b\u001a\u00020\u0007¢\u0006\u0004\b\u001b\u0010\u0003J\u001d\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0004¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0004¢\u0006\u0004\b\u001e\u0010\u001dJ\u0015\u0010 \u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u0004¢\u0006\u0004\b \u0010!J\u001f\u0010$\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00042\b\u0010#\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u0004\u0018\u00010\"2\u0006\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b&\u0010'R\u0016\u0010)\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010(R\u0016\u0010+\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010*R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020\u000b0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.¨\u00060"}, d2 = {"Lcom/google/android/jy6;", "", "<init>", "()V", "", "capacity", "newOffset", "", "b", "(II)V", "", "Lcom/google/android/jy6$b;", "index", "k", "(Ljava/util/List;I)I", "itemIndex", "lane", "m", "h", "(I)I", "targetLane", "", "a", "(II)Z", "n", "()I", "i", "j", "f", "(II)I", "e", "requestedIndex", "d", "(I)V", "", "gaps", "l", "(I[I)V", "g", "(I)[I", "I", "anchor", "[I", "lanes", "Lkotlin/collections/e;", "c", "Lkotlin/collections/e;", "spannedItems", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class jy6 {
    public static final int e = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private int anchor;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private int[] lanes = new int[16];

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final e<b> spannedItems = new e<>();

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\f\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\f\u001a\u0004\b\b\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/google/android/jy6$b;", "", "", "index", "", "gaps", "<init>", "(I[I)V", "a", "I", "b", "()I", "[I", "()[I", "c", "([I)V", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final int index;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private int[] gaps;

        public b(int i, int[] iArr) {
            this.index = i;
            this.gaps = iArr;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int[] getGaps() {
            return this.gaps;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getIndex() {
            return this.index;
        }

        public final void c(int[] iArr) {
            this.gaps = iArr;
        }
    }

    private final void b(int capacity, int newOffset) {
        if (!(capacity <= 131072)) {
            cx5.a("Requested item capacity " + capacity + " is larger than max supported: 131072!");
        }
        int[] iArr = this.lanes;
        if (iArr.length < capacity) {
            int length = iArr.length;
            while (length < capacity) {
                length *= 2;
            }
            this.lanes = f.q(this.lanes, new int[length], newOffset, 0, 0, 12, (Object) null);
        }
    }

    static /* synthetic */ void c(jy6 jy6Var, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        jy6Var.b(i, i2);
    }

    private final int k(List<b> list, int i) {
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            int index = list.get(i3).getIndex() - i;
            if (index < 0) {
                i2 = i3 + 1;
            } else {
                if (index <= 0) {
                    return i3;
                }
                size = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    public final boolean a(int itemIndex, int targetLane) {
        int iH = h(itemIndex);
        return iH == targetLane || iH == -1 || iH == -2;
    }

    public final void d(int requestedIndex) {
        int i = this.anchor;
        int i2 = requestedIndex - i;
        if (i2 < 0 || i2 >= 131072) {
            int iMax = Math.max(requestedIndex - (this.lanes.length / 2), 0);
            this.anchor = iMax;
            int i3 = iMax - i;
            if (i3 >= 0) {
                int[] iArr = this.lanes;
                if (i3 < iArr.length) {
                    f.l(iArr, iArr, 0, i3, iArr.length);
                }
                int[] iArr2 = this.lanes;
                f.y(iArr2, 0, Math.max(0, iArr2.length - i3), this.lanes.length);
            } else {
                int i4 = -i3;
                int[] iArr3 = this.lanes;
                if (iArr3.length + i4 < 131072) {
                    b(iArr3.length + i4 + 1, i4);
                } else {
                    if (i4 < iArr3.length) {
                        f.l(iArr3, iArr3, i4, 0, iArr3.length - i4);
                    }
                    int[] iArr4 = this.lanes;
                    f.y(iArr4, 0, 0, Math.min(iArr4.length, i4));
                }
            }
        } else {
            c(this, i2 + 1, 0, 2, null);
        }
        while (!this.spannedItems.isEmpty() && ((b) this.spannedItems.first()).getIndex() < getAnchor()) {
            this.spannedItems.removeFirst();
        }
        while (!this.spannedItems.isEmpty() && ((b) this.spannedItems.last()).getIndex() > n()) {
            this.spannedItems.removeLast();
        }
    }

    public final int e(int itemIndex, int targetLane) {
        int iN = n();
        for (int i = itemIndex + 1; i < iN; i++) {
            if (a(i, targetLane)) {
                return i;
            }
        }
        return n();
    }

    public final int f(int itemIndex, int targetLane) {
        do {
            itemIndex--;
            if (-1 >= itemIndex) {
                return -1;
            }
        } while (!a(itemIndex, targetLane));
        return itemIndex;
    }

    public final int[] g(int itemIndex) {
        b bVar = (b) m.C0(this.spannedItems, k(this.spannedItems, itemIndex));
        if (bVar != null) {
            return bVar.getGaps();
        }
        return null;
    }

    public final int h(int itemIndex) {
        if (itemIndex < getAnchor() || itemIndex >= n()) {
            return -1;
        }
        return this.lanes[itemIndex - this.anchor] - 1;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final int getAnchor() {
        return this.anchor;
    }

    public final void j() {
        f.E(this.lanes, 0, 0, 0, 6, (Object) null);
        this.spannedItems.clear();
    }

    public final void l(int itemIndex, int[] gaps) {
        int iK = k(this.spannedItems, itemIndex);
        if (iK < 0) {
            if (gaps == null) {
                return;
            }
            this.spannedItems.add(-(iK + 1), new b(itemIndex, gaps));
            return;
        }
        if (gaps == null) {
            this.spannedItems.remove(iK);
        } else {
            ((b) this.spannedItems.get(iK)).c(gaps);
        }
    }

    public final void m(int itemIndex, int lane) {
        if (!(itemIndex >= 0)) {
            cx5.a("Negative lanes are not supported");
        }
        d(itemIndex);
        this.lanes[itemIndex - this.anchor] = lane + 1;
    }

    public final int n() {
        return this.anchor + this.lanes.length;
    }
}
