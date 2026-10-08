package com.google.inputmethod;

import androidx.compose.p001foundation.gestures.Orientation;
import androidx.compose.p001foundation.gestures.snapping.j;
import com.google.android.ta2;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.m;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b1\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002BÑ\u0001\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u0006\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0015\u001a\u00020\u0006\u0012\u0006\u0010\u0016\u001a\u00020\u000e\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u0019\u001a\u00020\u0002\u0012\u0006\u0010\u001a\u001a\u00020\u000e\u0012\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u0004\u0018\u00010\u00002\u0006\u0010%\u001a\u00020\u0006¢\u0006\u0004\b&\u0010'J\u0010\u0010)\u001a\u00020(H\u0096\u0001¢\u0006\u0004\b)\u0010*R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u001a\u0010\b\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b3\u00100\u001a\u0004\b4\u00102R\u001a\u0010\t\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b5\u00100\u001a\u0004\b3\u00102R\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b+\u00108R\u001a\u0010\f\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b9\u00100\u001a\u0004\b:\u00102R\u001a\u0010\r\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b:\u00100\u001a\u0004\b;\u00102R\u001a\u0010\u000f\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b1\u0010<\u001a\u0004\b9\u0010=R\u001a\u0010\u0010\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b;\u00100\u001a\u0004\b>\u00102R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\bC\u0010@\u001a\u0004\bD\u0010BR\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b)\u0010E\u001a\u0004\bF\u0010GR\u0017\u0010\u0015\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b-\u00100\u001a\u0004\bH\u00102R\u0017\u0010\u0016\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b4\u0010<\u001a\u0004\bI\u0010=R\u001a\u0010\u0018\u001a\u00020\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b>\u0010J\u001a\u0004\b5\u0010KR\u0014\u0010\u0019\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010LR\u0017\u0010\u001a\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bM\u0010<\u001a\u0004\bN\u0010=R\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006¢\u0006\f\n\u0004\bI\u0010,\u001a\u0004\bO\u0010.R\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006¢\u0006\f\n\u0004\bP\u0010,\u001a\u0004\bQ\u0010.R\u0017\u0010\u001e\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bR\u0010TR\u0017\u0010 \u001a\u00020\u001f8\u0006¢\u0006\f\n\u0004\bD\u0010U\u001a\u0004\bV\u0010WR\u0017\u0010\"\u001a\u00020!8\u0006¢\u0006\f\n\u0004\bF\u0010X\u001a\u0004\bP\u0010YR\u0014\u0010[\u001a\u00020Z8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u0010YR\u0014\u0010\\\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b6\u00102R\u0011\u0010]\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\bM\u0010=R\u0014\u0010_\u001a\u00020\u00068\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b^\u00102R\u0014\u0010a\u001a\u00020\u00068\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b`\u00102R \u0010e\u001a\u000e\u0012\u0004\u0012\u00020c\u0012\u0004\u0012\u00020\u00060b8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b?\u0010dR\"\u0010i\u001a\u0010\u0012\u0004\u0012\u00020g\u0012\u0004\u0012\u00020(\u0018\u00010f8VX\u0096\u0005¢\u0006\u0006\u001a\u0004\bC\u0010h¨\u0006j"}, d2 = {"Lcom/google/android/jz8;", "Lcom/google/android/wy8;", "Lcom/google/android/fj7;", "", "Lcom/google/android/jj7;", "visiblePagesInfo", "", "pageSize", "pageSpacing", "afterContentPadding", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "viewportStartOffset", "viewportEndOffset", "", "reverseLayout", "beyondViewportPageCount", "firstVisiblePage", "currentPage", "", "currentPageOffsetFraction", "firstVisiblePageScrollOffset", "canScrollForward", "Landroidx/compose/foundation/gestures/snapping/j;", "snapPosition", "measureResult", "remeasureNeeded", "extraPagesBefore", "extraPagesAfter", "Lcom/google/android/ta2;", "coroutineScope", "Lcom/google/android/f43;", "density", "Lcom/google/android/kx1;", "childConstraints", "<init>", "(Ljava/util/List;IIILandroidx/compose/foundation/gestures/Orientation;IIZILcom/google/android/jj7;Lcom/google/android/jj7;FIZLandroidx/compose/foundation/gestures/snapping/j;Lcom/google/android/fj7;ZLjava/util/List;Ljava/util/List;Lcom/google/android/ta2;Lcom/google/android/f43;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "delta", "p", "(I)Lcom/google/android/jz8;", "", "l", "()V", "a", "Ljava/util/List;", "m", "()Ljava/util/List;", "b", "I", "h", "()I", "c", "n", "d", "e", "Landroidx/compose/foundation/gestures/Orientation;", "()Landroidx/compose/foundation/gestures/Orientation;", "f", "g", "i", "Z", "()Z", "o", "j", "Lcom/google/android/jj7;", "z", "()Lcom/google/android/jj7;", "k", "u", "F", "v", "()F", "A", "r", "Landroidx/compose/foundation/gestures/snapping/j;", "()Landroidx/compose/foundation/gestures/snapping/j;", "Lcom/google/android/fj7;", "q", "getRemeasureNeeded", "y", "s", "x", "t", "Lcom/google/android/ta2;", "()Lcom/google/android/ta2;", "Lcom/google/android/f43;", "w", "()Lcom/google/android/f43;", "J", "()J", "Lcom/google/android/q16;", "viewportSize", "beforeContentPadding", "canScrollBackward", "getWidth", "width", "getHeight", "height", "", "Lcom/google/android/uc;", "()Ljava/util/Map;", "alignmentLines", "Lkotlin/Function1;", "Lcom/google/android/mra;", "()Lkotlin/jvm/functions/Function1;", "rulers", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class jz8 implements wy8, fj7 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<jj7> visiblePagesInfo;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int pageSize;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int pageSpacing;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final int afterContentPadding;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final Orientation orientation;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final int viewportStartOffset;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final int viewportEndOffset;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final boolean reverseLayout;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final int beyondViewportPageCount;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final jj7 firstVisiblePage;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final jj7 currentPage;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final float currentPageOffsetFraction;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final int firstVisiblePageScrollOffset;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final boolean canScrollForward;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final j snapPosition;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private final fj7 measureResult;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private final boolean remeasureNeeded;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private final List<jj7> extraPagesBefore;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private final List<jj7> extraPagesAfter;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private final ta2 coroutineScope;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private final f43 density;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private final long childConstraints;

    public /* synthetic */ jz8(List list, int i, int i2, int i3, Orientation orientation, int i4, int i5, boolean z, int i6, jj7 jj7Var, jj7 jj7Var2, float f, int i7, boolean z2, j jVar, fj7 fj7Var, boolean z3, List list2, List list3, ta2 ta2Var, f43 f43Var, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, i, i2, i3, orientation, i4, i5, z, i6, jj7Var, jj7Var2, f, i7, z2, jVar, fj7Var, z3, list2, list3, ta2Var, f43Var, j);
    }

    /* JADX INFO: renamed from: A, reason: from getter */
    public final int getFirstVisiblePageScrollOffset() {
        return this.firstVisiblePageScrollOffset;
    }

    @Override // com.google.inputmethod.wy8
    /* JADX INFO: renamed from: a, reason: from getter */
    public Orientation getOrientation() {
        return this.orientation;
    }

    @Override // com.google.inputmethod.wy8
    public long b() {
        return q16.c((((long) getHeight()) & 4294967295L) | (((long) getWidth()) << 32));
    }

    @Override // com.google.inputmethod.wy8
    /* JADX INFO: renamed from: c, reason: from getter */
    public int getAfterContentPadding() {
        return this.afterContentPadding;
    }

    @Override // com.google.inputmethod.wy8
    /* JADX INFO: renamed from: d, reason: from getter */
    public j getSnapPosition() {
        return this.snapPosition;
    }

    @Override // com.google.inputmethod.wy8
    public int e() {
        return -getViewportStartOffset();
    }

    @Override // com.google.inputmethod.wy8
    /* JADX INFO: renamed from: f, reason: from getter */
    public boolean getReverseLayout() {
        return this.reverseLayout;
    }

    @Override // com.google.inputmethod.wy8
    /* JADX INFO: renamed from: g, reason: from getter */
    public int getViewportStartOffset() {
        return this.viewportStartOffset;
    }

    @Override // com.google.inputmethod.fj7
    public int getHeight() {
        return this.measureResult.getHeight();
    }

    @Override // com.google.inputmethod.fj7
    public int getWidth() {
        return this.measureResult.getWidth();
    }

    @Override // com.google.inputmethod.wy8
    /* JADX INFO: renamed from: h, reason: from getter */
    public int getPageSize() {
        return this.pageSize;
    }

    @Override // com.google.inputmethod.wy8
    /* JADX INFO: renamed from: i, reason: from getter */
    public int getViewportEndOffset() {
        return this.viewportEndOffset;
    }

    @Override // com.google.inputmethod.fj7
    public Map<uc, Integer> j() {
        return this.measureResult.j();
    }

    @Override // com.google.inputmethod.fj7
    public Function1<mra, Unit> k() {
        return this.measureResult.k();
    }

    @Override // com.google.inputmethod.fj7
    public void l() {
        this.measureResult.l();
    }

    @Override // com.google.inputmethod.wy8
    public List<jj7> m() {
        return this.visiblePagesInfo;
    }

    @Override // com.google.inputmethod.wy8
    /* JADX INFO: renamed from: n, reason: from getter */
    public int getPageSpacing() {
        return this.pageSpacing;
    }

    @Override // com.google.inputmethod.wy8
    /* JADX INFO: renamed from: o, reason: from getter */
    public int getBeyondViewportPageCount() {
        return this.beyondViewportPageCount;
    }

    public final jz8 p(int delta) {
        int i;
        int pageSize = getPageSize() + getPageSpacing();
        if (!this.remeasureNeeded && !m().isEmpty() && this.firstVisiblePage != null && (i = this.firstVisiblePageScrollOffset - delta) >= 0 && i < pageSize) {
            float f = pageSize != 0 ? delta / pageSize : 0.0f;
            float f2 = this.currentPageOffsetFraction - f;
            if (this.currentPage != null && f2 < 0.5f && f2 > -0.5f) {
                jj7 jj7Var = (jj7) m.z0(m());
                jj7 jj7Var2 = (jj7) m.L0(m());
                if (delta >= 0 ? Math.min(getViewportStartOffset() - jj7Var.getOffset(), getViewportEndOffset() - jj7Var2.getOffset()) > delta : Math.min((jj7Var.getOffset() + pageSize) - getViewportStartOffset(), (jj7Var2.getOffset() + pageSize) - getViewportEndOffset()) > (-delta)) {
                    List<jj7> listM = m();
                    int size = listM.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        listM.get(i2).a(delta);
                    }
                    List<jj7> list = this.extraPagesBefore;
                    int size2 = list.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        list.get(i3).a(delta);
                    }
                    List<jj7> list2 = this.extraPagesAfter;
                    int size3 = list2.size();
                    for (int i4 = 0; i4 < size3; i4++) {
                        list2.get(i4).a(delta);
                    }
                    return new jz8(m(), getPageSize(), getPageSpacing(), getAfterContentPadding(), getOrientation(), getViewportStartOffset(), getViewportEndOffset(), getReverseLayout(), getBeyondViewportPageCount(), this.firstVisiblePage, this.currentPage, this.currentPageOffsetFraction - f, this.firstVisiblePageScrollOffset - delta, this.canScrollForward || delta > 0, getSnapPosition(), this.measureResult, this.remeasureNeeded, this.extraPagesBefore, this.extraPagesAfter, this.coroutineScope, this.density, this.childConstraints, null);
                }
            }
        }
        return null;
    }

    public final boolean q() {
        jj7 jj7Var = this.firstVisiblePage;
        return ((jj7Var != null ? jj7Var.getIndex() : 0) == 0 && this.firstVisiblePageScrollOffset == 0) ? false : true;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final boolean getCanScrollForward() {
        return this.canScrollForward;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final long getChildConstraints() {
        return this.childConstraints;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final ta2 getCoroutineScope() {
        return this.coroutineScope;
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final jj7 getCurrentPage() {
        return this.currentPage;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final float getCurrentPageOffsetFraction() {
        return this.currentPageOffsetFraction;
    }

    /* JADX INFO: renamed from: w, reason: from getter */
    public final f43 getDensity() {
        return this.density;
    }

    public final List<jj7> x() {
        return this.extraPagesAfter;
    }

    public final List<jj7> y() {
        return this.extraPagesBefore;
    }

    /* JADX INFO: renamed from: z, reason: from getter */
    public final jj7 getFirstVisiblePage() {
        return this.firstVisiblePage;
    }

    private jz8(List<jj7> list, int i, int i2, int i3, Orientation orientation, int i4, int i5, boolean z, int i6, jj7 jj7Var, jj7 jj7Var2, float f, int i7, boolean z2, j jVar, fj7 fj7Var, boolean z3, List<jj7> list2, List<jj7> list3, ta2 ta2Var, f43 f43Var, long j) {
        this.visiblePagesInfo = list;
        this.pageSize = i;
        this.pageSpacing = i2;
        this.afterContentPadding = i3;
        this.orientation = orientation;
        this.viewportStartOffset = i4;
        this.viewportEndOffset = i5;
        this.reverseLayout = z;
        this.beyondViewportPageCount = i6;
        this.firstVisiblePage = jj7Var;
        this.currentPage = jj7Var2;
        this.currentPageOffsetFraction = f;
        this.firstVisiblePageScrollOffset = i7;
        this.canScrollForward = z2;
        this.snapPosition = jVar;
        this.measureResult = fj7Var;
        this.remeasureNeeded = z3;
        this.extraPagesBefore = list2;
        this.extraPagesAfter = list3;
        this.coroutineScope = ta2Var;
        this.density = f43Var;
        this.childConstraints = j;
    }

    public /* synthetic */ jz8(List list, int i, int i2, int i3, Orientation orientation, int i4, int i5, boolean z, int i6, jj7 jj7Var, jj7 jj7Var2, float f, int i7, boolean z2, j jVar, fj7 fj7Var, boolean z3, List list2, List list3, ta2 ta2Var, f43 f43Var, long j, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, i, i2, i3, orientation, i4, i5, z, i6, jj7Var, jj7Var2, f, i7, z2, jVar, fj7Var, z3, (i8 & 131072) != 0 ? m.p() : list2, (i8 & 262144) != 0 ? m.p() : list3, ta2Var, f43Var, j, null);
    }
}
