package com.google.inputmethod;

import androidx.compose.p001foundation.gestures.Orientation;
import com.google.android.ta2;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.m;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b,\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u009f\u0001\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0014\u0012\u0006\u0010\u0016\u001a\u00020\u0005\u0012\u0006\u0010\u0017\u001a\u00020\u0005\u0012\u0006\u0010\u0018\u001a\u00020\u0005\u0012\u0006\u0010\u0019\u001a\u00020\u0007\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001c\u001a\u00020\u0005\u0012\u0006\u0010\u001d\u001a\u00020\u0005¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010\"\u001a\u0004\u0018\u00010\u00002\u0006\u0010 \u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u0007¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020$H\u0096\u0001¢\u0006\u0004\b%\u0010&R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0017\u0010\f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b9\u00104\u001a\u0004\b:\u00106R\u0017\u0010\r\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b;\u00100\u001a\u0004\b<\u00102R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\b=\u0010KR\u001a\u0010\u0016\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010,\u001a\u0004\b;\u0010.R\u001a\u0010\u0017\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010,\u001a\u0004\bA\u0010.R\u001a\u0010\u0018\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\bL\u0010,\u001a\u0004\b3\u0010.R\u001a\u0010\u0019\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b1\u00100\u001a\u0004\bM\u00102R\u001a\u0010\u001b\u001a\u00020\u001a8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bG\u0010N\u001a\u0004\b'\u0010OR\u001a\u0010\u001c\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b5\u0010,\u001a\u0004\b/\u0010.R\u001a\u0010\u001d\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b?\u0010,\u001a\u0004\b9\u0010.R\u0011\u0010P\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bL\u00102R\u0014\u0010R\u001a\u00020Q8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010HR\u0014\u0010S\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b7\u0010.R\u0014\u0010U\u001a\u00020\u00058\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bT\u0010.R\u0014\u0010W\u001a\u00020\u00058\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bV\u0010.R \u0010[\u001a\u000e\u0012\u0004\u0012\u00020Y\u0012\u0004\u0012\u00020\u00050X8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bE\u0010ZR\"\u0010_\u001a\u0010\u0012\u0004\u0012\u00020]\u0012\u0004\u0012\u00020$\u0018\u00010\\8VX\u0096\u0005¢\u0006\u0006\u001a\u0004\bI\u0010^¨\u0006`"}, d2 = {"Lcom/google/android/uv6;", "Lcom/google/android/nv6;", "Lcom/google/android/fj7;", "Lcom/google/android/vv6;", "firstVisibleItem", "", "firstVisibleItemScrollOffset", "", "canScrollForward", "", "consumedScroll", "measureResult", "scrollBackAmount", "remeasureNeeded", "Lcom/google/android/ta2;", "coroutineScope", "Lcom/google/android/f43;", "density", "Lcom/google/android/kx1;", "childConstraints", "", "visibleItemsInfo", "viewportStartOffset", "viewportEndOffset", "totalItemsCount", "reverseLayout", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "afterContentPadding", "mainAxisItemSpacing", "<init>", "(Lcom/google/android/vv6;IZFLcom/google/android/fj7;FZLcom/google/android/ta2;Lcom/google/android/f43;JLjava/util/List;IIIZLandroidx/compose/foundation/gestures/Orientation;IILkotlin/jvm/internal/DefaultConstructorMarker;)V", "delta", "updateAnimations", "m", "(IZ)Lcom/google/android/uv6;", "", "l", "()V", "a", "Lcom/google/android/vv6;", "t", "()Lcom/google/android/vv6;", "b", "I", "u", "()I", "c", "Z", "o", "()Z", "d", "F", "q", "()F", "e", "Lcom/google/android/fj7;", "f", "w", "g", "getRemeasureNeeded", "h", "Lcom/google/android/ta2;", "r", "()Lcom/google/android/ta2;", "i", "Lcom/google/android/f43;", "s", "()Lcom/google/android/f43;", "j", "J", "p", "()J", "k", "Ljava/util/List;", "()Ljava/util/List;", "n", "v", "Landroidx/compose/foundation/gestures/Orientation;", "()Landroidx/compose/foundation/gestures/Orientation;", "canScrollBackward", "Lcom/google/android/q16;", "viewportSize", "beforeContentPadding", "getWidth", "width", "getHeight", "height", "", "Lcom/google/android/uc;", "()Ljava/util/Map;", "alignmentLines", "Lkotlin/Function1;", "Lcom/google/android/mra;", "()Lkotlin/jvm/functions/Function1;", "rulers", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class uv6 implements nv6, fj7 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final vv6 firstVisibleItem;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int firstVisibleItemScrollOffset;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean canScrollForward;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final float consumedScroll;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final fj7 measureResult;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final float scrollBackAmount;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final boolean remeasureNeeded;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final ta2 coroutineScope;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final f43 density;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final long childConstraints;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final List<vv6> visibleItemsInfo;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final int viewportStartOffset;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final int viewportEndOffset;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final int totalItemsCount;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final boolean reverseLayout;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private final Orientation orientation;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private final int afterContentPadding;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private final int mainAxisItemSpacing;

    public /* synthetic */ uv6(vv6 vv6Var, int i, boolean z, float f, fj7 fj7Var, float f2, boolean z2, ta2 ta2Var, f43 f43Var, long j, List list, int i2, int i3, int i4, boolean z3, Orientation orientation, int i5, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this(vv6Var, i, z, f, fj7Var, f2, z2, ta2Var, f43Var, j, list, i2, i3, i4, z3, orientation, i5, i6);
    }

    @Override // com.google.inputmethod.nv6
    /* JADX INFO: renamed from: a, reason: from getter */
    public Orientation getOrientation() {
        return this.orientation;
    }

    @Override // com.google.inputmethod.nv6
    public long b() {
        return q16.c((((long) getB()) & 4294967295L) | (((long) getA()) << 32));
    }

    @Override // com.google.inputmethod.nv6
    /* JADX INFO: renamed from: c, reason: from getter */
    public int getAfterContentPadding() {
        return this.afterContentPadding;
    }

    @Override // com.google.inputmethod.nv6
    /* JADX INFO: renamed from: d, reason: from getter */
    public int getTotalItemsCount() {
        return this.totalItemsCount;
    }

    @Override // com.google.inputmethod.nv6
    public int e() {
        return -getViewportStartOffset();
    }

    @Override // com.google.inputmethod.nv6
    /* JADX INFO: renamed from: f, reason: from getter */
    public int getMainAxisItemSpacing() {
        return this.mainAxisItemSpacing;
    }

    @Override // com.google.inputmethod.nv6
    /* JADX INFO: renamed from: g, reason: from getter */
    public int getViewportStartOffset() {
        return this.viewportStartOffset;
    }

    @Override // com.google.inputmethod.fj7
    /* JADX INFO: renamed from: getHeight */
    public int getB() {
        return this.measureResult.getB();
    }

    @Override // com.google.inputmethod.fj7
    /* JADX INFO: renamed from: getWidth */
    public int getA() {
        return this.measureResult.getA();
    }

    @Override // com.google.inputmethod.nv6
    public List<vv6> h() {
        return this.visibleItemsInfo;
    }

    @Override // com.google.inputmethod.nv6
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

    public final uv6 m(int delta, boolean updateAnimations) {
        vv6 vv6Var;
        if (!this.remeasureNeeded && !h().isEmpty() && (vv6Var = this.firstVisibleItem) != null) {
            int mainAxisSizeWithSpacings = vv6Var.getMainAxisSizeWithSpacings();
            int i = this.firstVisibleItemScrollOffset - delta;
            if (i >= 0 && i < mainAxisSizeWithSpacings) {
                vv6 vv6Var2 = (vv6) m.z0(h());
                vv6 vv6Var3 = (vv6) m.L0(h());
                if (!vv6Var2.getNonScrollableItem() && !vv6Var3.getNonScrollableItem() && (delta >= 0 ? Math.min(getViewportStartOffset() - vv6Var2.getOffset(), getViewportEndOffset() - vv6Var3.getOffset()) > delta : Math.min((vv6Var2.getOffset() + vv6Var2.getMainAxisSizeWithSpacings()) - getViewportStartOffset(), (vv6Var3.getOffset() + vv6Var3.getMainAxisSizeWithSpacings()) - getViewportEndOffset()) > (-delta))) {
                    List<vv6> listH = h();
                    int size = listH.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        listH.get(i2).a(delta, updateAnimations);
                    }
                    return new uv6(this.firstVisibleItem, this.firstVisibleItemScrollOffset - delta, this.canScrollForward || delta > 0, delta, this.measureResult, this.scrollBackAmount, this.remeasureNeeded, this.coroutineScope, this.density, this.childConstraints, h(), getViewportStartOffset(), getViewportEndOffset(), getTotalItemsCount(), getReverseLayout(), getOrientation(), getAfterContentPadding(), getMainAxisItemSpacing(), null);
                }
            }
        }
        return null;
    }

    public final boolean n() {
        vv6 vv6Var = this.firstVisibleItem;
        return ((vv6Var != null ? vv6Var.getIndex() : 0) == 0 && this.firstVisibleItemScrollOffset == 0) ? false : true;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final boolean getCanScrollForward() {
        return this.canScrollForward;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final long getChildConstraints() {
        return this.childConstraints;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final float getConsumedScroll() {
        return this.consumedScroll;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final ta2 getCoroutineScope() {
        return this.coroutineScope;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final f43 getDensity() {
        return this.density;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final vv6 getFirstVisibleItem() {
        return this.firstVisibleItem;
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final int getFirstVisibleItemScrollOffset() {
        return this.firstVisibleItemScrollOffset;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public boolean getReverseLayout() {
        return this.reverseLayout;
    }

    /* JADX INFO: renamed from: w, reason: from getter */
    public final float getScrollBackAmount() {
        return this.scrollBackAmount;
    }

    private uv6(vv6 vv6Var, int i, boolean z, float f, fj7 fj7Var, float f2, boolean z2, ta2 ta2Var, f43 f43Var, long j, List<vv6> list, int i2, int i3, int i4, boolean z3, Orientation orientation, int i5, int i6) {
        this.firstVisibleItem = vv6Var;
        this.firstVisibleItemScrollOffset = i;
        this.canScrollForward = z;
        this.consumedScroll = f;
        this.measureResult = fj7Var;
        this.scrollBackAmount = f2;
        this.remeasureNeeded = z2;
        this.coroutineScope = ta2Var;
        this.density = f43Var;
        this.childConstraints = j;
        this.visibleItemsInfo = list;
        this.viewportStartOffset = i2;
        this.viewportEndOffset = i3;
        this.totalItemsCount = i4;
        this.reverseLayout = z3;
        this.orientation = orientation;
        this.afterContentPadding = i5;
        this.mainAxisItemSpacing = i6;
    }
}
