package com.google.inputmethod;

import androidx.compose.p001foundation.lazy.staggeredgrid.LazyStaggeredGridState;
import androidx.compose.ui.layout.o;
import com.google.android.ta2;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B¥\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0005\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0014\u001a\u00020\u0005\u0012\u0006\u0010\u0015\u001a\u00020\u0005\u0012\u0006\u0010\u0016\u001a\u00020\r\u0012\u0006\u0010\u0017\u001a\u00020\u0005\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001a\u001a\u00020\r\u0012\u0006\u0010\u001b\u001a\u00020\r\u0012\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u0004\u0012\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u0019\u0010#\u001a\u00020\r*\u00020\u00072\u0006\u0010\"\u001a\u00020\u0005¢\u0006\u0004\b#\u0010$J!\u0010'\u001a\u00020&*\u00020\u00072\u0006\u0010\"\u001a\u00020\u00052\u0006\u0010%\u001a\u00020\u0005¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b5\u0010;R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\u0017\u0010\u0011\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b3\u0010D\u001a\u0004\bE\u0010FR\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\bG\u0010:\u001a\u0004\b9\u0010;R\u0017\u0010\u0014\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\bH\u0010D\u001a\u0004\b1\u0010FR\u0017\u0010\u0015\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\bE\u0010D\u001a\u0004\b)\u0010FR\u0017\u0010\u0016\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\bI\u0010=\u001a\u0004\bJ\u0010?R\u0017\u0010\u0017\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\bB\u0010D\u001a\u0004\bI\u0010FR\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\b<\u0010MR\u0017\u0010\u001a\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b/\u0010=\u001a\u0004\bN\u0010?R\u0017\u0010\u001b\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b7\u0010=\u001a\u0004\b\u001b\u0010?R\u001f\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\bJ\u0010.\u001a\u0004\b-\u00100R\u0017\u0010\u001f\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b'\u0010O\u001a\u0004\b@\u0010PR\u0017\u0010T\u001a\u00020Q8\u0006¢\u0006\f\n\u0004\b+\u0010R\u001a\u0004\bK\u0010SR\u0017\u0010X\u001a\u00020U8\u0006¢\u0006\f\n\u0004\b#\u0010V\u001a\u0004\bH\u0010WR\u0017\u0010Y\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\bN\u0010D\u001a\u0004\bG\u0010F¨\u0006Z"}, d2 = {"Lcom/google/android/ly6;", "", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "state", "", "", "pinnedItems", "Lcom/google/android/cy6;", "itemProvider", "Lcom/google/android/az6;", "resolvedSlots", "Lcom/google/android/kx1;", "constraints", "", "isVertical", "Lcom/google/android/wt6;", "measureScope", "mainAxisAvailableSize", "Lcom/google/android/g16;", "contentOffset", "beforeContentPadding", "afterContentPadding", "reverseLayout", "mainAxisSpacing", "Lcom/google/android/ta2;", "coroutineScope", "isInLookaheadScope", "isLookingAhead", "Lcom/google/android/by6;", "approachVisibleItems", "Lcom/google/android/i05;", "graphicsContext", "<init>", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Ljava/util/List;Lcom/google/android/cy6;Lcom/google/android/az6;JZLcom/google/android/wt6;IJIIZILcom/google/android/ta2;ZZLjava/util/List;Lcom/google/android/i05;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "itemIndex", "t", "(Lcom/google/android/cy6;I)Z", "lane", "Lcom/google/android/uzb;", "r", "(Lcom/google/android/cy6;II)J", "a", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "s", "()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "b", "Ljava/util/List;", "o", "()Ljava/util/List;", "c", "Lcom/google/android/cy6;", "h", "()Lcom/google/android/cy6;", "d", "Lcom/google/android/az6;", "p", "()Lcom/google/android/az6;", "e", "J", "()J", "f", "Z", "v", "()Z", "g", "Lcom/google/android/wt6;", "m", "()Lcom/google/android/wt6;", "I", "k", "()I", "i", "j", "l", "q", "n", "Lcom/google/android/ta2;", "()Lcom/google/android/ta2;", "u", "Lcom/google/android/i05;", "()Lcom/google/android/i05;", "Lcom/google/android/ry6;", "Lcom/google/android/ry6;", "()Lcom/google/android/ry6;", "measuredItemProvider", "Lcom/google/android/jy6;", "Lcom/google/android/jy6;", "()Lcom/google/android/jy6;", "laneInfo", "laneCount", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ly6 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final LazyStaggeredGridState state;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final List<Integer> pinnedItems;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final cy6 itemProvider;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final az6 resolvedSlots;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final long constraints;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final boolean isVertical;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final wt6 measureScope;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final int mainAxisAvailableSize;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final long contentOffset;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final int beforeContentPadding;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final int afterContentPadding;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final boolean reverseLayout;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final int mainAxisSpacing;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final ta2 coroutineScope;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final boolean isInLookaheadScope;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private final boolean isLookingAhead;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private final List<by6> approachVisibleItems;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private final i05 graphicsContext;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private final ry6 measuredItemProvider;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private final jy6 laneInfo;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private final int laneCount;

    @Metadata(d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001JO\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"com/google/android/ly6$a", "Lcom/google/android/ry6;", "", "index", "lane", "span", "", "key", "contentType", "", "Landroidx/compose/ui/layout/o;", "placeables", "Lcom/google/android/kx1;", "constraints", "Lcom/google/android/vy6;", "d", "(IIILjava/lang/Object;Ljava/lang/Object;Ljava/util/List;J)Lcom/google/android/vy6;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends ry6 {
        a(boolean z, cy6 cy6Var, wt6 wt6Var, az6 az6Var) {
            super(z, cy6Var, wt6Var, az6Var);
        }

        @Override // com.google.inputmethod.ry6
        public vy6 d(int index, int lane, int span, Object key, Object contentType, List<? extends o> placeables, long constraints) {
            return new vy6(index, key, placeables, ly6.this.getIsVertical(), ly6.this.getMainAxisSpacing(), lane, span, ly6.this.getBeforeContentPadding(), ly6.this.getAfterContentPadding(), contentType, ly6.this.getState().z(), constraints, null);
        }
    }

    public /* synthetic */ ly6(LazyStaggeredGridState lazyStaggeredGridState, List list, cy6 cy6Var, az6 az6Var, long j, boolean z, wt6 wt6Var, int i, long j2, int i2, int i3, boolean z2, int i4, ta2 ta2Var, boolean z3, boolean z4, List list2, i05 i05Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(lazyStaggeredGridState, list, cy6Var, az6Var, j, z, wt6Var, i, j2, i2, i3, z2, i4, ta2Var, z3, z4, list2, i05Var);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getAfterContentPadding() {
        return this.afterContentPadding;
    }

    public final List<by6> b() {
        return this.approachVisibleItems;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getBeforeContentPadding() {
        return this.beforeContentPadding;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getConstraints() {
        return this.constraints;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final long getContentOffset() {
        return this.contentOffset;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final ta2 getCoroutineScope() {
        return this.coroutineScope;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final i05 getGraphicsContext() {
        return this.graphicsContext;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final cy6 getItemProvider() {
        return this.itemProvider;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final int getLaneCount() {
        return this.laneCount;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final jy6 getLaneInfo() {
        return this.laneInfo;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final int getMainAxisAvailableSize() {
        return this.mainAxisAvailableSize;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final int getMainAxisSpacing() {
        return this.mainAxisSpacing;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final wt6 getMeasureScope() {
        return this.measureScope;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final ry6 getMeasuredItemProvider() {
        return this.measuredItemProvider;
    }

    public final List<Integer> o() {
        return this.pinnedItems;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final az6 getResolvedSlots() {
        return this.resolvedSlots;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final boolean getReverseLayout() {
        return this.reverseLayout;
    }

    public final long r(cy6 cy6Var, int i, int i2) {
        boolean zA = cy6Var.g().a(i);
        int i3 = zA ? this.laneCount : 1;
        if (zA) {
            i2 = 0;
        }
        return uzb.a(i2, i3);
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final LazyStaggeredGridState getState() {
        return this.state;
    }

    public final boolean t(cy6 cy6Var, int i) {
        return cy6Var.g().a(i);
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final boolean getIsInLookaheadScope() {
        return this.isInLookaheadScope;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final boolean getIsVertical() {
        return this.isVertical;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private ly6(LazyStaggeredGridState lazyStaggeredGridState, List<Integer> list, cy6 cy6Var, az6 az6Var, long j, boolean z, wt6 wt6Var, int i, long j2, int i2, int i3, boolean z2, int i4, ta2 ta2Var, boolean z3, boolean z4, List<? extends by6> list2, i05 i05Var) {
        this.state = lazyStaggeredGridState;
        this.pinnedItems = list;
        this.itemProvider = cy6Var;
        this.resolvedSlots = az6Var;
        this.constraints = j;
        this.isVertical = z;
        this.measureScope = wt6Var;
        this.mainAxisAvailableSize = i;
        this.contentOffset = j2;
        this.beforeContentPadding = i2;
        this.afterContentPadding = i3;
        this.reverseLayout = z2;
        this.mainAxisSpacing = i4;
        this.coroutineScope = ta2Var;
        this.isInLookaheadScope = z3;
        this.isLookingAhead = z4;
        this.approachVisibleItems = list2;
        this.graphicsContext = i05Var;
        this.measuredItemProvider = new a(z, cy6Var, wt6Var, az6Var);
        this.laneInfo = lazyStaggeredGridState.getLaneInfo();
        this.laneCount = az6Var.getSizes().length;
    }
}
