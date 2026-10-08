package com.google.inputmethod;

import androidx.compose.p001foundation.pager.PagerState;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u000eJ\u001d\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0019\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u0002¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001e\u001a\u0004\b\u001f\u0010 R+\u0010\u0003\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u00028F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b\"\u0010$\"\u0004\b%\u0010\u001dR+\u0010\u0005\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u00048F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b&\u0010(\"\u0004\b)\u0010\u001aR\u0016\u0010-\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u0010/\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010.R\u0017\u00103\u001a\u0002008\u0006¢\u0006\f\n\u0004\b\u0014\u00101\u001a\u0004\b+\u00102¨\u00064"}, d2 = {"Lcom/google/android/mz8;", "", "", "currentPage", "", "currentPageOffsetFraction", "Landroidx/compose/foundation/pager/PagerState;", "state", "<init>", "(IFLandroidx/compose/foundation/pager/PagerState;)V", "page", "offsetFraction", "", "i", "(IF)V", "Lcom/google/android/jz8;", "measureResult", "k", "(Lcom/google/android/jz8;)V", "index", "f", "Lcom/google/android/az8;", "itemProvider", "e", "(Lcom/google/android/az8;I)I", "j", "(F)V", "delta", "a", "(I)V", "Landroidx/compose/foundation/pager/PagerState;", "getState", "()Landroidx/compose/foundation/pager/PagerState;", "<set-?>", "b", "Lcom/google/android/q48;", "()I", "g", "c", "Lcom/google/android/l48;", "()F", "h", "", "d", "Z", "hadFirstNotEmptyLayout", "Ljava/lang/Object;", "lastKnownCurrentPageKey", "Lcom/google/android/cu6;", "Lcom/google/android/cu6;", "()Lcom/google/android/cu6;", "nearestRangeState", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class mz8 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final PagerState state;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final q48 currentPage;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final l48 currentPageOffsetFraction;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private boolean hadFirstNotEmptyLayout;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private Object lastKnownCurrentPageKey;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final cu6 nearestRangeState;

    public mz8(int i, float f, PagerState pagerState) {
        this.state = pagerState;
        this.currentPage = mwb.a(i);
        this.currentPageOffsetFraction = tm9.a(f);
        this.nearestRangeState = new cu6(i, 30, 100);
    }

    private final void g(int i) {
        this.currentPage.f(i);
    }

    private final void h(float f) {
        this.currentPageOffsetFraction.p(f);
    }

    private final void i(int page, float offsetFraction) {
        g(page);
        this.nearestRangeState.m(page);
        h(offsetFraction);
    }

    public final void a(int delta) {
        h(c() + (this.state.Q() == 0 ? 0.0f : delta / this.state.Q()));
    }

    public final int b() {
        return this.currentPage.getIntValue();
    }

    public final float c() {
        return this.currentPageOffsetFraction.b();
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final cu6 getNearestRangeState() {
        return this.nearestRangeState;
    }

    public final int e(az8 itemProvider, int index) {
        int iA = mt6.a(itemProvider, this.lastKnownCurrentPageKey, index);
        if (index != iA) {
            g(iA);
            this.nearestRangeState.m(index);
        }
        return iA;
    }

    public final void f(int index, float offsetFraction) {
        i(index, offsetFraction);
        this.lastKnownCurrentPageKey = null;
    }

    public final void j(float offsetFraction) {
        h(offsetFraction);
    }

    public final void k(jz8 measureResult) {
        jj7 currentPage = measureResult.getCurrentPage();
        this.lastKnownCurrentPageKey = currentPage != null ? currentPage.getKey() : null;
        if (this.hadFirstNotEmptyLayout || !measureResult.m().isEmpty()) {
            this.hadFirstNotEmptyLayout = true;
            jj7 currentPage2 = measureResult.getCurrentPage();
            i(currentPage2 != null ? currentPage2.getIndex() : 0, measureResult.getCurrentPageOffsetFraction());
        }
    }
}
