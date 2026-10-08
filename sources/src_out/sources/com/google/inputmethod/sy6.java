package com.google.inputmethod;

import androidx.compose.p001foundation.gestures.Orientation;
import com.google.android.ta2;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b/\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u00ad\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001b\u001a\u00020\u0014\u0012\u0006\u0010\u001c\u001a\u00020\u0014\u0012\u0006\u0010\u001d\u001a\u00020\u0014\u0012\u0006\u0010\u001e\u001a\u00020\u0014\u0012\u0006\u0010\u001f\u001a\u00020\u0014\u0012\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\u001f\u0010&\u001a\u0004\u0018\u00010\u00002\u0006\u0010$\u001a\u00020\u00142\u0006\u0010%\u001a\u00020\n¢\u0006\u0004\b&\u0010'J\u0010\u0010)\u001a\u00020(H\u0096\u0001¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b/\u0010,\u001a\u0004\b0\u0010.R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b9\u00102\u001a\u0004\b:\u00104R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u0017\u0010\f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b&\u0010<\u001a\u0004\b\f\u0010>R\u0017\u0010\r\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b?\u0010<\u001a\u0004\b@\u0010>R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR\u001a\u0010\u0015\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010M\u001a\u0004\b5\u0010NR \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b=\u0010O\u001a\u0004\b?\u0010PR\u001a\u0010\u001a\u001a\u00020\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b3\u0010Q\u001a\u0004\b/\u0010RR\u001a\u0010\u001b\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\bS\u0010M\u001a\u0004\bT\u0010NR\u001a\u0010\u001c\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\bK\u0010M\u001a\u0004\bU\u0010NR\u001a\u0010\u001d\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010M\u001a\u0004\b9\u0010NR\u001a\u0010\u001e\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b0\u0010M\u001a\u0004\b1\u0010NR\u001a\u0010\u001f\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b:\u0010M\u001a\u0004\b;\u0010NR\u0017\u0010!\u001a\u00020 8\u0006¢\u0006\f\n\u0004\bC\u0010V\u001a\u0004\bS\u0010WR\u001a\u0010[\u001a\u00020X8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bG\u0010Y\u001a\u0004\b+\u0010ZR\u0011\u0010\\\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\bA\u0010>R\u0014\u0010^\u001a\u00020\u00148\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b]\u0010NR\u0014\u0010`\u001a\u00020\u00148\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b_\u0010NR \u0010d\u001a\u000e\u0012\u0004\u0012\u00020b\u0012\u0004\u0012\u00020\u00140a8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bE\u0010cR\"\u0010h\u001a\u0010\u0012\u0004\u0012\u00020f\u0012\u0004\u0012\u00020(\u0018\u00010e8VX\u0096\u0005¢\u0006\u0006\u001a\u0004\bI\u0010g¨\u0006i"}, d2 = {"Lcom/google/android/sy6;", "Lcom/google/android/ky6;", "Lcom/google/android/fj7;", "", "firstVisibleItemIndices", "firstVisibleItemScrollOffsets", "", "consumedScroll", "measureResult", "scrollBackAmount", "", "canScrollForward", "isVertical", "remeasureNeeded", "Lcom/google/android/az6;", "slots", "Lcom/google/android/bz6;", "spanProvider", "Lcom/google/android/f43;", "density", "", "totalItemsCount", "", "Lcom/google/android/vy6;", "visibleItemsInfo", "Lcom/google/android/q16;", "viewportSize", "viewportStartOffset", "viewportEndOffset", "beforeContentPadding", "afterContentPadding", "mainAxisItemSpacing", "Lcom/google/android/ta2;", "coroutineScope", "<init>", "([I[IFLcom/google/android/fj7;FZZZLcom/google/android/az6;Lcom/google/android/bz6;Lcom/google/android/f43;ILjava/util/List;JIIIIILcom/google/android/ta2;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "delta", "updateAnimations", "g", "(IZ)Lcom/google/android/sy6;", "", "l", "()V", "a", "[I", "q", "()[I", "b", "r", "c", "F", "n", "()F", "d", "Lcom/google/android/fj7;", "getMeasureResult", "()Lcom/google/android/fj7;", "e", "s", "f", "Z", "m", "()Z", "h", "getRemeasureNeeded", "i", "Lcom/google/android/az6;", "t", "()Lcom/google/android/az6;", "j", "Lcom/google/android/bz6;", "u", "()Lcom/google/android/bz6;", "k", "Lcom/google/android/f43;", "p", "()Lcom/google/android/f43;", "I", "()I", "Ljava/util/List;", "()Ljava/util/List;", "J", "()J", "o", "w", "v", "Lcom/google/android/ta2;", "()Lcom/google/android/ta2;", "Landroidx/compose/foundation/gestures/Orientation;", "Landroidx/compose/foundation/gestures/Orientation;", "()Landroidx/compose/foundation/gestures/Orientation;", "orientation", "canScrollBackward", "getWidth", "width", "getHeight", "height", "", "Lcom/google/android/uc;", "()Ljava/util/Map;", "alignmentLines", "Lkotlin/Function1;", "Lcom/google/android/mra;", "()Lkotlin/jvm/functions/Function1;", "rulers", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class sy6 implements ky6, fj7 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int[] firstVisibleItemIndices;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int[] firstVisibleItemScrollOffsets;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final float consumedScroll;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final fj7 measureResult;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final float scrollBackAmount;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final boolean canScrollForward;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final boolean isVertical;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final boolean remeasureNeeded;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final az6 slots;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final bz6 spanProvider;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final f43 density;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final int totalItemsCount;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final List<vy6> visibleItemsInfo;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final long viewportSize;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final int viewportStartOffset;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private final int viewportEndOffset;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private final int beforeContentPadding;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private final int afterContentPadding;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private final int mainAxisItemSpacing;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private final ta2 coroutineScope;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private final Orientation orientation;

    public /* synthetic */ sy6(int[] iArr, int[] iArr2, float f, fj7 fj7Var, float f2, boolean z, boolean z2, boolean z3, az6 az6Var, bz6 bz6Var, f43 f43Var, int i, List list, long j, int i2, int i3, int i4, int i5, int i6, ta2 ta2Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(iArr, iArr2, f, fj7Var, f2, z, z2, z3, az6Var, bz6Var, f43Var, i, list, j, i2, i3, i4, i5, i6, ta2Var);
    }

    @Override // com.google.inputmethod.ky6
    /* JADX INFO: renamed from: a, reason: from getter */
    public Orientation getOrientation() {
        return this.orientation;
    }

    @Override // com.google.inputmethod.ky6
    /* JADX INFO: renamed from: b, reason: from getter */
    public long getViewportSize() {
        return this.viewportSize;
    }

    @Override // com.google.inputmethod.ky6
    /* JADX INFO: renamed from: c, reason: from getter */
    public int getAfterContentPadding() {
        return this.afterContentPadding;
    }

    @Override // com.google.inputmethod.ky6
    /* JADX INFO: renamed from: d, reason: from getter */
    public int getTotalItemsCount() {
        return this.totalItemsCount;
    }

    @Override // com.google.inputmethod.ky6
    /* JADX INFO: renamed from: e, reason: from getter */
    public int getBeforeContentPadding() {
        return this.beforeContentPadding;
    }

    @Override // com.google.inputmethod.ky6
    /* JADX INFO: renamed from: f, reason: from getter */
    public int getMainAxisItemSpacing() {
        return this.mainAxisItemSpacing;
    }

    public final sy6 g(int delta, boolean updateAnimations) {
        if (this.remeasureNeeded || h().isEmpty() || this.firstVisibleItemIndices.length == 0 || this.firstVisibleItemScrollOffsets.length == 0) {
            return null;
        }
        int viewportEndOffset = getViewportEndOffset() - getAfterContentPadding();
        List<vy6> listH = h();
        int size = listH.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                List<vy6> listH2 = h();
                int size2 = listH2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    listH2.get(i2).k(delta, updateAnimations);
                }
                int[] iArr = this.firstVisibleItemIndices;
                int length = this.firstVisibleItemScrollOffsets.length;
                int[] iArr2 = new int[length];
                for (int i3 = 0; i3 < length; i3++) {
                    iArr2[i3] = this.firstVisibleItemScrollOffsets[i3] - delta;
                }
                return new sy6(iArr, iArr2, delta, this.measureResult, this.scrollBackAmount, this.canScrollForward || delta > 0, this.isVertical, this.remeasureNeeded, this.slots, this.spanProvider, this.density, getTotalItemsCount(), h(), getViewportSize(), getViewportStartOffset(), getViewportEndOffset(), getBeforeContentPadding(), getAfterContentPadding(), getMainAxisItemSpacing(), this.coroutineScope, null);
            }
            vy6 vy6Var = listH.get(i);
            if (!vy6Var.getNonScrollableItem()) {
                if ((vy6Var.p() <= 0) == (vy6Var.p() + delta <= 0)) {
                    if (vy6Var.p() <= getViewportStartOffset()) {
                        if (delta < 0) {
                            if ((vy6Var.p() + vy6Var.getMainAxisSizeWithSpacings()) - getViewportStartOffset() <= (-delta)) {
                                return null;
                            }
                        } else if (getViewportStartOffset() - vy6Var.p() <= delta) {
                            return null;
                        }
                    }
                    if (vy6Var.p() + vy6Var.getMainAxisSizeWithSpacings() >= viewportEndOffset) {
                        if (delta < 0) {
                            if ((vy6Var.p() + vy6Var.getMainAxisSizeWithSpacings()) - getViewportEndOffset() <= (-delta)) {
                                return null;
                            }
                        } else if (getViewportEndOffset() - vy6Var.p() <= delta) {
                            return null;
                        }
                    }
                    i++;
                }
            }
            return null;
        }
    }

    @Override // com.google.inputmethod.fj7
    public int getHeight() {
        return this.measureResult.getHeight();
    }

    @Override // com.google.inputmethod.fj7
    public int getWidth() {
        return this.measureResult.getWidth();
    }

    @Override // com.google.inputmethod.ky6
    public List<vy6> h() {
        return this.visibleItemsInfo;
    }

    public final boolean i() {
        return this.firstVisibleItemIndices[0] != 0 || this.firstVisibleItemScrollOffsets[0] > 0;
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

    /* JADX INFO: renamed from: m, reason: from getter */
    public final boolean getCanScrollForward() {
        return this.canScrollForward;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final float getConsumedScroll() {
        return this.consumedScroll;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final ta2 getCoroutineScope() {
        return this.coroutineScope;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final f43 getDensity() {
        return this.density;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final int[] getFirstVisibleItemIndices() {
        return this.firstVisibleItemIndices;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final int[] getFirstVisibleItemScrollOffsets() {
        return this.firstVisibleItemScrollOffsets;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final float getScrollBackAmount() {
        return this.scrollBackAmount;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final az6 getSlots() {
        return this.slots;
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final bz6 getSpanProvider() {
        return this.spanProvider;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public int getViewportEndOffset() {
        return this.viewportEndOffset;
    }

    /* JADX INFO: renamed from: w, reason: from getter */
    public int getViewportStartOffset() {
        return this.viewportStartOffset;
    }

    private sy6(int[] iArr, int[] iArr2, float f, fj7 fj7Var, float f2, boolean z, boolean z2, boolean z3, az6 az6Var, bz6 bz6Var, f43 f43Var, int i, List<vy6> list, long j, int i2, int i3, int i4, int i5, int i6, ta2 ta2Var) {
        this.firstVisibleItemIndices = iArr;
        this.firstVisibleItemScrollOffsets = iArr2;
        this.consumedScroll = f;
        this.measureResult = fj7Var;
        this.scrollBackAmount = f2;
        this.canScrollForward = z;
        this.isVertical = z2;
        this.remeasureNeeded = z3;
        this.slots = az6Var;
        this.spanProvider = bz6Var;
        this.density = f43Var;
        this.totalItemsCount = i;
        this.visibleItemsInfo = list;
        this.viewportSize = j;
        this.viewportStartOffset = i2;
        this.viewportEndOffset = i3;
        this.beforeContentPadding = i4;
        this.afterContentPadding = i5;
        this.mainAxisItemSpacing = i6;
        this.coroutineScope = ta2Var;
        this.orientation = z2 ? Orientation.Vertical : Orientation.Horizontal;
    }
}
