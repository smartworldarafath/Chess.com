package com.google.inputmethod;

import androidx.compose.p001foundation.gestures.snapping.f;
import androidx.compose.p001foundation.lazy.LazyListState;
import kotlin.Metadata;
import kotlin.collections.m;
import kotlin.ranges.g;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010\u000e\u001a\u0004\b\u000f\u0010\tR\u0014\u0010\u0010\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\tR\u0014\u0010\u0014\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\tR\u0014\u0010\u0018\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\t¨\u0006\u0019"}, d2 = {"Lcom/google/android/zu6;", "Lcom/google/android/zs6;", "Landroidx/compose/foundation/lazy/LazyListState;", "state", "", "beyondBoundsItemCount", "<init>", "(Landroidx/compose/foundation/lazy/LazyListState;I)V", "b", "()I", "a", "Landroidx/compose/foundation/lazy/LazyListState;", "getState", "()Landroidx/compose/foundation/lazy/LazyListState;", "I", "getBeyondBoundsItemCount", "itemCount", "", "e", "()Z", "hasVisibleItems", "c", "firstPlacedIndex", "d", "lastPlacedIndex", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class zu6 implements zs6 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final LazyListState state;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int beyondBoundsItemCount;

    public zu6(LazyListState lazyListState, int i) {
        this.state = lazyListState;
        this.beyondBoundsItemCount = i;
    }

    @Override // com.google.inputmethod.zs6
    public int a() {
        return this.state.C().getTotalItemsCount();
    }

    @Override // com.google.inputmethod.zs6
    public int b() {
        if (this.state.C().h().isEmpty()) {
            return 0;
        }
        int iD = f.d(this.state.C());
        int iA = ov6.a(this.state.C());
        if (iA == 0) {
            return 1;
        }
        return g.e(iD / iA, 1);
    }

    @Override // com.google.inputmethod.zs6
    public int c() {
        return Math.max(0, this.state.x() - this.beyondBoundsItemCount);
    }

    @Override // com.google.inputmethod.zs6
    public int d() {
        return Math.min(a() - 1, ((gv6) m.L0(this.state.C().h())).getIndex() + this.beyondBoundsItemCount);
    }

    @Override // com.google.inputmethod.zs6
    public boolean e() {
        return !this.state.C().h().isEmpty();
    }
}
