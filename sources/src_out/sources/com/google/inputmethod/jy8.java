package com.google.inputmethod;

import androidx.compose.p001foundation.pager.PagerState;
import kotlin.Metadata;
import kotlin.collections.m;
import kotlin.ranges.g;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\fR\u0014\u0010\r\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\tR\u0014\u0010\u0011\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\tR\u0014\u0010\u0015\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/google/android/jy8;", "Lcom/google/android/zs6;", "Landroidx/compose/foundation/pager/PagerState;", "state", "", "beyondViewportPageCount", "<init>", "(Landroidx/compose/foundation/pager/PagerState;I)V", "b", "()I", "a", "Landroidx/compose/foundation/pager/PagerState;", "I", "itemCount", "", "e", "()Z", "hasVisibleItems", "c", "firstPlacedIndex", "d", "lastPlacedIndex", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class jy8 implements zs6 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final PagerState state;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int beyondViewportPageCount;

    public jy8(PagerState pagerState, int i) {
        this.state = pagerState;
        this.beyondViewportPageCount = i;
    }

    @Override // com.google.inputmethod.zs6
    public int a() {
        return this.state.O();
    }

    @Override // com.google.inputmethod.zs6
    public int b() {
        if (this.state.J().m().size() == 0) {
            return 0;
        }
        int iA = xy8.a(this.state.J());
        int pageSize = this.state.J().getPageSize() + this.state.J().getPageSpacing();
        if (pageSize == 0) {
            return 1;
        }
        return g.e(iA / pageSize, 1);
    }

    @Override // com.google.inputmethod.zs6
    public int c() {
        return Math.max(0, this.state.getFirstVisiblePage() - this.beyondViewportPageCount);
    }

    @Override // com.google.inputmethod.zs6
    public int d() {
        return Math.min(a() - 1, ((yx8) m.L0(this.state.J().m())).getIndex() + this.beyondViewportPageCount);
    }

    @Override // com.google.inputmethod.zs6
    public boolean e() {
        return !this.state.J().m().isEmpty();
    }
}
