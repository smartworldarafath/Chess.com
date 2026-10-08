package com.google.inputmethod;

import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u0006J\u0015\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0006J\u001d\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015R+\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019\"\u0004\b\u001a\u0010\u0010R+\u0010\b\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00028F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u0019\"\u0004\b\u001d\u0010\u0010R\u0016\u0010 \u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001fR\u0018\u0010\"\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010!R\u0017\u0010&\u001a\u00020#8\u0006¢\u0006\f\n\u0004\b\u001a\u0010$\u001a\u0004\b\u001b\u0010%¨\u0006'"}, d2 = {"Lcom/google/android/dw6;", "", "", "initialIndex", "initialScrollOffset", "<init>", "(II)V", "index", "scrollOffset", "", "g", "Lcom/google/android/uv6;", "measureResult", "h", "(Lcom/google/android/uv6;)V", "i", "(I)V", "d", "Lcom/google/android/hv6;", "itemProvider", "j", "(Lcom/google/android/hv6;I)I", "<set-?>", "a", "Lcom/google/android/q48;", "()I", "e", "b", "c", "f", "", "Z", "hadFirstNotEmptyLayout", "Ljava/lang/Object;", "lastKnownFirstItemKey", "Lcom/google/android/cu6;", "Lcom/google/android/cu6;", "()Lcom/google/android/cu6;", "nearestRangeState", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class dw6 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final q48 index;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final q48 scrollOffset;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private boolean hadFirstNotEmptyLayout;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private Object lastKnownFirstItemKey;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final cu6 nearestRangeState;

    public dw6(int i, int i2) {
        this.index = mwb.a(i);
        this.scrollOffset = mwb.a(i2);
        this.nearestRangeState = new cu6(i, 30, 100);
    }

    private final void f(int i) {
        this.scrollOffset.f(i);
    }

    private final void g(int index, int scrollOffset) {
        if (!(((float) index) >= 0.0f)) {
            cx5.a("Index should be non-negative (" + index + ')');
        }
        e(index);
        this.nearestRangeState.m(index);
        f(scrollOffset);
    }

    public final int a() {
        return this.index.getIntValue();
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final cu6 getNearestRangeState() {
        return this.nearestRangeState;
    }

    public final int c() {
        return this.scrollOffset.getIntValue();
    }

    public final void d(int index, int scrollOffset) {
        g(index, scrollOffset);
        this.lastKnownFirstItemKey = null;
    }

    public final void e(int i) {
        this.index.f(i);
    }

    public final void h(uv6 measureResult) {
        vv6 firstVisibleItem = measureResult.getFirstVisibleItem();
        this.lastKnownFirstItemKey = firstVisibleItem != null ? firstVisibleItem.getKey() : null;
        if (this.hadFirstNotEmptyLayout || measureResult.getTotalItemsCount() > 0) {
            this.hadFirstNotEmptyLayout = true;
            int firstVisibleItemScrollOffset = measureResult.getFirstVisibleItemScrollOffset();
            if (!(((float) firstVisibleItemScrollOffset) >= 0.0f)) {
                cx5.c("scrollOffset should be non-negative");
            }
            vv6 firstVisibleItem2 = measureResult.getFirstVisibleItem();
            g(firstVisibleItem2 != null ? firstVisibleItem2.getIndex() : 0, firstVisibleItemScrollOffset);
        }
    }

    public final void i(int scrollOffset) {
        if (!(((float) scrollOffset) >= 0.0f)) {
            cx5.c("scrollOffset should be non-negative");
        }
        f(scrollOffset);
    }

    public final int j(hv6 itemProvider, int index) {
        int iA = mt6.a(itemProvider, this.lastKnownFirstItemKey, index);
        if (index != iA) {
            e(iA);
            this.nearestRangeState.m(index);
        }
        return iA;
    }
}
