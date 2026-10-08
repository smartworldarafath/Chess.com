package com.google.inputmethod;

import androidx.compose.p001foundation.gestures.Orientation;
import androidx.compose.p001foundation.gestures.snapping.e;
import com.google.android.ta2;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.m;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b.\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002BÙ\u0001\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0005\u0012$\u0010\u0017\u001a \u0012\u0004\u0012\u00020\u0005\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00160\u00150\u00140\u0013\u0012\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0013\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0014\u0012\u0006\u0010\u001b\u001a\u00020\u0005\u0012\u0006\u0010\u001c\u001a\u00020\u0005\u0012\u0006\u0010\u001d\u001a\u00020\u0005\u0012\u0006\u0010\u001e\u001a\u00020\u0007\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010!\u001a\u00020\u0005\u0012\u0006\u0010\"\u001a\u00020\u0005¢\u0006\u0004\b#\u0010$J\u001f\u0010'\u001a\u0004\u0018\u00010\u00002\u0006\u0010%\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\u0007¢\u0006\u0004\b'\u0010(J\u0010\u0010*\u001a\u00020)H\u0096\u0001¢\u0006\u0004\b*\u0010+R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0017\u0010\f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b>\u00109\u001a\u0004\b?\u0010;R\u0017\u0010\r\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b@\u00105\u001a\u0004\bA\u00107R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR\u0017\u0010\u0012\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\bJ\u00101\u001a\u0004\bK\u00103R5\u0010\u0017\u001a \u0012\u0004\u0012\u00020\u0005\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00160\u00150\u00140\u00138\u0006¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010OR#\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00138\u0006¢\u0006\f\n\u0004\b*\u0010M\u001a\u0004\bP\u0010OR \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010Q\u001a\u0004\bB\u0010RR\u001a\u0010\u001b\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\bS\u00101\u001a\u0004\b@\u00103R\u001a\u0010\u001c\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b6\u00101\u001a\u0004\bF\u00103R\u001a\u0010\u001d\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b:\u00101\u001a\u0004\b8\u00103R\u001a\u0010\u001e\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\bD\u00105\u001a\u0004\bT\u00107R\u001a\u0010 \u001a\u00020\u001f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bH\u0010U\u001a\u0004\b,\u0010VR\u001a\u0010!\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b.\u00101\u001a\u0004\b4\u00103R\u001a\u0010\"\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b2\u00101\u001a\u0004\b>\u00103R\u0011\u0010W\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bS\u00107R\u0014\u0010Z\u001a\u00020X8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u0010YR\u0014\u0010[\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b<\u00103R\u0014\u0010]\u001a\u00020\u00058\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\\\u00103R\u0014\u0010_\u001a\u00020\u00058\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b^\u00103R \u0010c\u001a\u000e\u0012\u0004\u0012\u00020a\u0012\u0004\u0012\u00020\u00050`8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bJ\u0010bR\"\u0010e\u001a\u0010\u0012\u0004\u0012\u00020d\u0012\u0004\u0012\u00020)\u0018\u00010\u00138VX\u0096\u0005¢\u0006\u0006\u001a\u0004\bL\u0010O¨\u0006f"}, d2 = {"Lcom/google/android/jq6;", "Lcom/google/android/cq6;", "Lcom/google/android/fj7;", "Lcom/google/android/mq6;", "firstVisibleLine", "", "firstVisibleLineScrollOffset", "", "canScrollForward", "", "consumedScroll", "measureResult", "scrollBackAmount", "remeasureNeeded", "Lcom/google/android/ta2;", "coroutineScope", "Lcom/google/android/f43;", "density", "slotsPerLine", "Lkotlin/Function1;", "", "Lkotlin/Pair;", "Lcom/google/android/kx1;", "prefetchInfoRetriever", "lineIndexProvider", "Lcom/google/android/kq6;", "visibleItemsInfo", "viewportStartOffset", "viewportEndOffset", "totalItemsCount", "reverseLayout", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "afterContentPadding", "mainAxisItemSpacing", "<init>", "(Lcom/google/android/mq6;IZFLcom/google/android/fj7;FZLcom/google/android/ta2;Lcom/google/android/f43;ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ljava/util/List;IIIZLandroidx/compose/foundation/gestures/Orientation;II)V", "delta", "updateAnimations", "m", "(IZ)Lcom/google/android/jq6;", "", "l", "()V", "a", "Lcom/google/android/mq6;", "s", "()Lcom/google/android/mq6;", "b", "I", "t", "()I", "c", "Z", "o", "()Z", "d", "F", "p", "()F", "e", "Lcom/google/android/fj7;", "f", "w", "g", "getRemeasureNeeded", "h", "Lcom/google/android/ta2;", "q", "()Lcom/google/android/ta2;", "i", "Lcom/google/android/f43;", "r", "()Lcom/google/android/f43;", "j", "getSlotsPerLine", "k", "Lkotlin/jvm/functions/Function1;", "u", "()Lkotlin/jvm/functions/Function1;", "getLineIndexProvider", "Ljava/util/List;", "()Ljava/util/List;", "n", "v", "Landroidx/compose/foundation/gestures/Orientation;", "()Landroidx/compose/foundation/gestures/Orientation;", "canScrollBackward", "Lcom/google/android/q16;", "()J", "viewportSize", "beforeContentPadding", "getWidth", "width", "getHeight", "height", "", "Lcom/google/android/uc;", "()Ljava/util/Map;", "alignmentLines", "Lcom/google/android/mra;", "rulers", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class jq6 implements cq6, fj7 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final mq6 firstVisibleLine;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int firstVisibleLineScrollOffset;

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
    private final int slotsPerLine;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final Function1<Integer, List<Pair<Integer, kx1>>> prefetchInfoRetriever;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final Function1<Integer, Integer> lineIndexProvider;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final List<kq6> visibleItemsInfo;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final int viewportStartOffset;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final int viewportEndOffset;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private final int totalItemsCount;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private final boolean reverseLayout;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private final Orientation orientation;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private final int afterContentPadding;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private final int mainAxisItemSpacing;

    /* JADX WARN: Multi-variable type inference failed */
    public jq6(mq6 mq6Var, int i, boolean z, float f, fj7 fj7Var, float f2, boolean z2, ta2 ta2Var, f43 f43Var, int i2, Function1<? super Integer, ? extends List<Pair<Integer, kx1>>> function1, Function1<? super Integer, Integer> function2, List<kq6> list, int i3, int i4, int i5, boolean z3, Orientation orientation, int i6, int i7) {
        this.firstVisibleLine = mq6Var;
        this.firstVisibleLineScrollOffset = i;
        this.canScrollForward = z;
        this.consumedScroll = f;
        this.measureResult = fj7Var;
        this.scrollBackAmount = f2;
        this.remeasureNeeded = z2;
        this.coroutineScope = ta2Var;
        this.density = f43Var;
        this.slotsPerLine = i2;
        this.prefetchInfoRetriever = function1;
        this.lineIndexProvider = function2;
        this.visibleItemsInfo = list;
        this.viewportStartOffset = i3;
        this.viewportEndOffset = i4;
        this.totalItemsCount = i5;
        this.reverseLayout = z3;
        this.orientation = orientation;
        this.afterContentPadding = i6;
        this.mainAxisItemSpacing = i7;
    }

    @Override // com.google.inputmethod.cq6
    /* JADX INFO: renamed from: a, reason: from getter */
    public Orientation getOrientation() {
        return this.orientation;
    }

    @Override // com.google.inputmethod.cq6
    public long b() {
        return q16.c((((long) getB()) & 4294967295L) | (((long) getA()) << 32));
    }

    @Override // com.google.inputmethod.cq6
    /* JADX INFO: renamed from: c, reason: from getter */
    public int getAfterContentPadding() {
        return this.afterContentPadding;
    }

    @Override // com.google.inputmethod.cq6
    /* JADX INFO: renamed from: d, reason: from getter */
    public int getTotalItemsCount() {
        return this.totalItemsCount;
    }

    @Override // com.google.inputmethod.cq6
    public int e() {
        return -getViewportStartOffset();
    }

    @Override // com.google.inputmethod.cq6
    /* JADX INFO: renamed from: f, reason: from getter */
    public int getMainAxisItemSpacing() {
        return this.mainAxisItemSpacing;
    }

    @Override // com.google.inputmethod.cq6
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

    @Override // com.google.inputmethod.cq6
    public List<kq6> h() {
        return this.visibleItemsInfo;
    }

    @Override // com.google.inputmethod.cq6
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

    public final jq6 m(int delta, boolean updateAnimations) {
        mq6 mq6Var;
        if (!this.remeasureNeeded && !h().isEmpty() && (mq6Var = this.firstVisibleLine) != null) {
            int mainAxisSizeWithSpacings = mq6Var.getMainAxisSizeWithSpacings();
            int i = this.firstVisibleLineScrollOffset - delta;
            if (i >= 0 && i < mainAxisSizeWithSpacings) {
                kq6 kq6Var = (kq6) m.z0(h());
                kq6 kq6Var2 = (kq6) m.L0(h());
                if (!kq6Var.getNonScrollableItem() && !kq6Var2.getNonScrollableItem() && (delta >= 0 ? Math.min(getViewportStartOffset() - e.b(kq6Var, getOrientation()), getViewportEndOffset() - e.b(kq6Var2, getOrientation())) > delta : Math.min((e.b(kq6Var, getOrientation()) + kq6Var.getMainAxisSizeWithSpacings()) - getViewportStartOffset(), (e.b(kq6Var2, getOrientation()) + kq6Var2.getMainAxisSizeWithSpacings()) - getViewportEndOffset()) > (-delta))) {
                    List<kq6> listH = h();
                    int size = listH.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        listH.get(i2).o(delta, updateAnimations);
                    }
                    return new jq6(this.firstVisibleLine, this.firstVisibleLineScrollOffset - delta, this.canScrollForward || delta > 0, delta, this.measureResult, this.scrollBackAmount, this.remeasureNeeded, this.coroutineScope, this.density, this.slotsPerLine, this.prefetchInfoRetriever, this.lineIndexProvider, h(), getViewportStartOffset(), getViewportEndOffset(), getTotalItemsCount(), getReverseLayout(), getOrientation(), getAfterContentPadding(), getMainAxisItemSpacing());
                }
            }
        }
        return null;
    }

    public final boolean n() {
        mq6 mq6Var = this.firstVisibleLine;
        return ((mq6Var != null ? mq6Var.getIndex() : 0) == 0 && this.firstVisibleLineScrollOffset == 0) ? false : true;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final boolean getCanScrollForward() {
        return this.canScrollForward;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final float getConsumedScroll() {
        return this.consumedScroll;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final ta2 getCoroutineScope() {
        return this.coroutineScope;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final f43 getDensity() {
        return this.density;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final mq6 getFirstVisibleLine() {
        return this.firstVisibleLine;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final int getFirstVisibleLineScrollOffset() {
        return this.firstVisibleLineScrollOffset;
    }

    public final Function1<Integer, List<Pair<Integer, kx1>>> u() {
        return this.prefetchInfoRetriever;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public boolean getReverseLayout() {
        return this.reverseLayout;
    }

    /* JADX INFO: renamed from: w, reason: from getter */
    public final float getScrollBackAmount() {
        return this.scrollBackAmount;
    }
}
