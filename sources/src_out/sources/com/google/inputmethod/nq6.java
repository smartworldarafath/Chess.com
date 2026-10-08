package com.google.inputmethod;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.ranges.g;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\b!\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0006¢\u0006\u0004\b\u001b\u0010\u001aJ;\u0010#\u001a\u00020\u00182\u0006\u0010\u0014\u001a\u00020\u00062\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010\"\u001a\u00020\u0006H&¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010%R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010&R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010'R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010'R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010(R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lcom/google/android/nq6;", "", "", "isVertical", "Lcom/google/android/uq6;", "slots", "", "gridItemsCount", "spaceBetweenLines", "Lcom/google/android/lq6;", "measuredItemProvider", "Lcom/google/android/yq6;", "spanLayoutProvider", "<init>", "(ZLcom/google/android/uq6;IILcom/google/android/lq6;Lcom/google/android/yq6;)V", "startSlot", "span", "Lcom/google/android/kx1;", "a", "(II)J", "index", "e", "(I)I", "lineIndex", "Lcom/google/android/mq6;", "c", "(I)Lcom/google/android/mq6;", "d", "", "Lcom/google/android/kq6;", "items", "", "Lcom/google/android/q15;", "spans", "mainAxisSpacing", "b", "(I[Lcom/google/android/kq6;Ljava/util/List;I)Lcom/google/android/mq6;", "Z", "Lcom/google/android/uq6;", "I", "Lcom/google/android/lq6;", "f", "Lcom/google/android/yq6;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class nq6 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean isVertical;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final uq6 slots;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int gridItemsCount;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final int spaceBetweenLines;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final lq6 measuredItemProvider;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final yq6 spanLayoutProvider;

    public nq6(boolean z, uq6 uq6Var, int i, int i2, lq6 lq6Var, yq6 yq6Var) {
        this.isVertical = z;
        this.slots = uq6Var;
        this.gridItemsCount = i;
        this.spaceBetweenLines = i2;
        this.measuredItemProvider = lq6Var;
        this.spanLayoutProvider = yq6Var;
    }

    public final long a(int startSlot, int span) {
        int i;
        if (span == 1) {
            i = this.slots.getSizes()[startSlot];
        } else {
            int i2 = (span + startSlot) - 1;
            i = (this.slots.getPositions()[i2] + this.slots.getSizes()[i2]) - this.slots.getPositions()[startSlot];
        }
        int iE = g.e(i, 0);
        return this.isVertical ? kx1.INSTANCE.e(iE) : kx1.INSTANCE.d(iE);
    }

    public abstract mq6 b(int index, kq6[] items, List<q15> spans, int mainAxisSpacing);

    public final mq6 c(int lineIndex) {
        yq6.c cVarD = this.spanLayoutProvider.d(lineIndex);
        int size = cVarD.b().size();
        int i = (size == 0 || cVarD.getFirstItemIndex() + size == this.gridItemsCount) ? 0 : this.spaceBetweenLines;
        kq6[] kq6VarArr = new kq6[size];
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            int iD = q15.d(cVarD.b().get(i3).getPackedValue());
            kq6 kq6VarE = this.measuredItemProvider.e(cVarD.getFirstItemIndex() + i3, a(i2, iD), i2, iD, i);
            i2 += iD;
            Unit unit = Unit.a;
            kq6VarArr[i3] = kq6VarE;
        }
        return b(lineIndex, kq6VarArr, cVarD.b(), i);
    }

    public final mq6 d(int lineIndex) {
        return c(lineIndex);
    }

    public final int e(int index) {
        yq6 yq6Var = this.spanLayoutProvider;
        return yq6Var.k(index, yq6Var.getSlotsPerLine());
    }
}
