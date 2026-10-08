package com.google.inputmethod;

import androidx.compose.ui.layout.o;
import java.util.List;
import kotlin.Metadata;
import kotlin.ranges.g;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b!\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J/\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJO\u0010!\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001b2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\u0006\u0010\u0018\u001a\u00020\u0010H&¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010%R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010&R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010'R\u0011\u0010+\u001a\u00020(8F¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u0006,"}, d2 = {"Lcom/google/android/ry6;", "Lcom/google/android/bu6;", "Lcom/google/android/vy6;", "", "isVertical", "Lcom/google/android/cy6;", "itemProvider", "Lcom/google/android/wt6;", "measureScope", "Lcom/google/android/az6;", "resolvedSlots", "<init>", "(ZLcom/google/android/cy6;Lcom/google/android/wt6;Lcom/google/android/az6;)V", "", "slot", "span", "Lcom/google/android/kx1;", "c", "(II)J", "index", "Lcom/google/android/uzb;", "f", "(IJ)Lcom/google/android/vy6;", "lane", "constraints", "e", "(IIIJ)Lcom/google/android/vy6;", "", "key", "contentType", "", "Landroidx/compose/ui/layout/o;", "placeables", "d", "(IIILjava/lang/Object;Ljava/lang/Object;Ljava/util/List;J)Lcom/google/android/vy6;", "b", "Z", "Lcom/google/android/cy6;", "Lcom/google/android/wt6;", "Lcom/google/android/az6;", "Lcom/google/android/ot6;", "g", "()Lcom/google/android/ot6;", "keyIndexMap", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class ry6 extends bu6<vy6> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean isVertical;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final cy6 itemProvider;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final wt6 measureScope;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final az6 resolvedSlots;

    public ry6(boolean z, cy6 cy6Var, wt6 wt6Var, az6 az6Var) {
        this.isVertical = z;
        this.itemProvider = cy6Var;
        this.measureScope = wt6Var;
        this.resolvedSlots = az6Var;
    }

    private final long c(int slot, int span) {
        int i;
        if (span == 1) {
            i = this.resolvedSlots.getSizes()[slot];
        } else {
            int i2 = this.resolvedSlots.getPositions()[slot];
            int i3 = (slot + span) - 1;
            i = (this.resolvedSlots.getPositions()[i3] + this.resolvedSlots.getSizes()[i3]) - i2;
        }
        return this.isVertical ? kx1.INSTANCE.e(i) : kx1.INSTANCE.d(i);
    }

    public abstract vy6 d(int index, int lane, int span, Object key, Object contentType, List<? extends o> placeables, long constraints);

    @Override // com.google.inputmethod.bu6
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public vy6 a(int index, int lane, int span, long constraints) {
        return d(index, lane, span, this.itemProvider.d(index), this.itemProvider.f(index), b(this.measureScope, index, constraints), constraints);
    }

    public final vy6 f(int index, long span) {
        Object objD = this.itemProvider.d(index);
        Object objF = this.itemProvider.f(index);
        int length = this.resolvedSlots.getSizes().length;
        int i = (int) (span >> 32);
        int iJ = g.j(i, length - 1);
        int iJ2 = g.j(((int) (span & 4294967295L)) - i, length - iJ);
        long jC = c(iJ, iJ2);
        return d(index, iJ, iJ2, objD, objF, b(this.measureScope, index, jC), jC);
    }

    public final ot6 g() {
        return this.itemProvider.b();
    }
}
