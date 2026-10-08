package com.google.inputmethod;

import androidx.compose.p004runtime.snapshots.g;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.f;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u0006¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010 \u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b \u0010!R&\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\"R$\u0010\n\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u00028\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u000e\u0010$\u001a\u0004\b%\u0010&R+\u0010\u001a\u001a\u00020\u00062\u0006\u0010'\u001a\u00020\u00068F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b(\u0010*\"\u0004\b+\u0010,R$\u0010\u0017\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u00028\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b%\u0010$\u001a\u0004\b-\u0010&R+\u0010\u001b\u001a\u00020\u00062\u0006\u0010'\u001a\u00020\u00068F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b.\u0010)\u001a\u0004\b/\u0010*\"\u0004\b0\u0010,R\u0016\u00103\u001a\u0002018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00102R\u0018\u00105\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u00104R\u0017\u00109\u001a\u0002068\u0006¢\u0006\f\n\u0004\b\u001c\u00107\u001a\u0004\b.\u00108¨\u0006:"}, d2 = {"Lcom/google/android/xy6;", "", "", "initialIndices", "initialOffsets", "Lkotlin/Function2;", "", "fillIndices", "<init>", "([I[ILkotlin/jvm/functions/Function2;)V", "indices", "a", "([I)I", "offsets", "b", "([I[I)I", "", "k", "([I[I)V", "Lcom/google/android/sy6;", "measureResult", "l", "(Lcom/google/android/sy6;)V", "scrollOffsets", "m", "([I)V", "index", "scrollOffset", "h", "(II)V", "Lcom/google/android/lt6;", "itemProvider", "n", "(Lcom/google/android/lt6;[I)[I", "Lkotlin/jvm/functions/Function2;", "value", "[I", "d", "()[I", "<set-?>", "c", "Lcom/google/android/q48;", "()I", "i", "(I)V", "g", "e", "f", "j", "", "Z", "hadFirstNotEmptyLayout", "Ljava/lang/Object;", "lastKnownFirstItemKey", "Lcom/google/android/cu6;", "Lcom/google/android/cu6;", "()Lcom/google/android/cu6;", "nearestRangeState", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class xy6 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Function2<Integer, Integer, int[]> fillIndices;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private int[] indices;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final q48 index;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private int[] scrollOffsets;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final q48 scrollOffset;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private boolean hadFirstNotEmptyLayout;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private Object lastKnownFirstItemKey;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final cu6 nearestRangeState;

    /* JADX WARN: Multi-variable type inference failed */
    public xy6(int[] iArr, int[] iArr2, Function2<? super Integer, ? super Integer, int[]> function2) {
        this.fillIndices = function2;
        this.indices = iArr;
        this.index = mwb.a(a(iArr));
        this.scrollOffsets = iArr2;
        this.scrollOffset = mwb.a(b(iArr, iArr2));
        Integer numX0 = f.X0(iArr);
        this.nearestRangeState = new cu6(numX0 != null ? numX0.intValue() : 0, 90, 200);
    }

    private final int a(int[] indices) {
        int i = Integer.MAX_VALUE;
        for (int i2 : indices) {
            if (i2 <= 0) {
                return 0;
            }
            if (i > i2) {
                i = i2;
            }
        }
        if (i == Integer.MAX_VALUE) {
            return 0;
        }
        return i;
    }

    private final int b(int[] indices, int[] offsets) {
        int iA = a(indices);
        int length = offsets.length;
        int iMin = Integer.MAX_VALUE;
        for (int i = 0; i < length; i++) {
            if (indices[i] == iA) {
                iMin = Math.min(iMin, offsets[i]);
            }
        }
        if (iMin == Integer.MAX_VALUE) {
            return 0;
        }
        return iMin;
    }

    private final void i(int i) {
        this.index.f(i);
    }

    private final void j(int i) {
        this.scrollOffset.f(i);
    }

    private final void k(int[] indices, int[] offsets) {
        this.indices = indices;
        i(a(indices));
        this.scrollOffsets = offsets;
        j(b(indices, offsets));
    }

    public final int c() {
        return this.index.getIntValue();
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int[] getIndices() {
        return this.indices;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final cu6 getNearestRangeState() {
        return this.nearestRangeState;
    }

    public final int f() {
        return this.scrollOffset.getIntValue();
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int[] getScrollOffsets() {
        return this.scrollOffsets;
    }

    public final void h(int index, int scrollOffset) {
        int[] iArr = (int[]) this.fillIndices.invoke(Integer.valueOf(index), Integer.valueOf(this.indices.length));
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i = 0; i < length; i++) {
            iArr2[i] = scrollOffset;
        }
        k(iArr, iArr2);
        this.nearestRangeState.m(index);
        this.lastKnownFirstItemKey = null;
    }

    public final void l(sy6 measureResult) {
        vy6 vy6Var;
        int iA = a(measureResult.getFirstVisibleItemIndices());
        List<vy6> listH = measureResult.h();
        int size = listH.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                vy6Var = null;
                break;
            }
            vy6Var = listH.get(i);
            if (vy6Var.getIndex() == iA) {
                break;
            } else {
                i++;
            }
        }
        vy6 vy6Var2 = vy6Var;
        this.lastKnownFirstItemKey = vy6Var2 != null ? vy6Var2.getKey() : null;
        this.nearestRangeState.m(iA);
        if (this.hadFirstNotEmptyLayout || measureResult.getTotalItemsCount() > 0) {
            this.hadFirstNotEmptyLayout = true;
            g.Companion companion = g.INSTANCE;
            g gVarD = companion.d();
            Function1<Object, Unit> function1G = gVarD != null ? gVarD.g() : null;
            g gVarE = companion.e(gVarD);
            try {
                k(measureResult.getFirstVisibleItemIndices(), measureResult.getFirstVisibleItemScrollOffsets());
                Unit unit = Unit.a;
            } finally {
                companion.l(gVarD, gVarE, function1G);
            }
        }
    }

    public final void m(int[] scrollOffsets) {
        this.scrollOffsets = scrollOffsets;
        j(b(this.indices, scrollOffsets));
    }

    public final int[] n(lt6 itemProvider, int[] indices) {
        Object obj = this.lastKnownFirstItemKey;
        Integer numY0 = f.y0(indices, 0);
        int iA = mt6.a(itemProvider, obj, numY0 != null ? numY0.intValue() : 0);
        if (f.f0(indices, iA)) {
            return indices;
        }
        this.nearestRangeState.m(iA);
        g.Companion companion = g.INSTANCE;
        g gVarD = companion.d();
        Function1<Object, Unit> function1G = gVarD != null ? gVarD.g() : null;
        g gVarE = companion.e(gVarD);
        try {
            int[] iArr = (int[]) this.fillIndices.invoke(Integer.valueOf(iA), Integer.valueOf(indices.length));
            companion.l(gVarD, gVarE, function1G);
            this.indices = iArr;
            i(a(iArr));
            return iArr;
        } catch (Throwable th) {
            companion.l(gVarD, gVarE, function1G);
            throw th;
        }
    }
}
