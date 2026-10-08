package com.google.inputmethod;

import androidx.compose.p001foundation.lazy.staggeredgrid.LazyStaggeredGridState;
import kotlin.Metadata;
import kotlin.collections.m;
import kotlin.ranges.g;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\bR\u0014\u0010\u0011\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\bR\u0014\u0010\u0015\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\b¨\u0006\u0016"}, d2 = {"Lcom/google/android/ux6;", "Lcom/google/android/zs6;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "state", "<init>", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;)V", "", "b", "()I", "a", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "getState", "()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "itemCount", "", "e", "()Z", "hasVisibleItems", "c", "firstPlacedIndex", "d", "lastPlacedIndex", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ux6 implements zs6 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final LazyStaggeredGridState state;

    public ux6(LazyStaggeredGridState lazyStaggeredGridState) {
        this.state = lazyStaggeredGridState;
    }

    @Override // com.google.inputmethod.zs6
    public int a() {
        return this.state.B().getTotalItemsCount();
    }

    @Override // com.google.inputmethod.zs6
    public int b() {
        if (this.state.B().h().isEmpty()) {
            return 0;
        }
        int iE = uy6.e(this.state.B());
        int iF = uy6.f(this.state.B());
        if (iF == 0) {
            return 1;
        }
        return g.e(iE / iF, 1);
    }

    @Override // com.google.inputmethod.zs6
    public int c() {
        return this.state.w();
    }

    @Override // com.google.inputmethod.zs6
    public int d() {
        return ((by6) m.L0(this.state.B().h())).getIndex();
    }

    @Override // com.google.inputmethod.zs6
    public boolean e() {
        return !this.state.B().h().isEmpty();
    }
}
