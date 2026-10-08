package com.google.inputmethod;

import androidx.compose.p001foundation.pager.PagerState;
import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0017¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\rH\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010 R\u0014\u0010#\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\"R\u0014\u0010$\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001b¨\u0006%"}, d2 = {"Lcom/google/android/az8;", "Lcom/google/android/lt6;", "Landroidx/compose/foundation/pager/PagerState;", "state", "Lcom/google/android/ct6;", "Lcom/google/android/py8;", "intervalContent", "Lcom/google/android/ot6;", "keyIndexMap", "<init>", "(Landroidx/compose/foundation/pager/PagerState;Lcom/google/android/ct6;Lcom/google/android/ot6;)V", "", "index", "", "key", "", "i", "(ILjava/lang/Object;Landroidx/compose/runtime/d;I)V", "d", "(I)Ljava/lang/Object;", "c", "(Ljava/lang/Object;)I", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "a", "Landroidx/compose/foundation/pager/PagerState;", "b", "Lcom/google/android/ct6;", "Lcom/google/android/ot6;", "Lcom/google/android/lz8;", "Lcom/google/android/lz8;", "pagerScopeImpl", "itemCount", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class az8 implements lt6 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final PagerState state;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final ct6<py8> intervalContent;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final ot6 keyIndexMap;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final lz8 pagerScopeImpl = lz8.a;

    public az8(PagerState pagerState, ct6<py8> ct6Var, ot6 ot6Var) {
        this.state = pagerState;
        this.intervalContent = ct6Var;
        this.keyIndexMap = ot6Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(az8 az8Var, int i, d dVar, int i2) {
        if (dVar.g((i2 & 3) != 2, i2 & 1)) {
            if (e.k()) {
                e.o(1142237095, i2, -1, "androidx.compose.foundation.pager.PagerLazyLayoutItemProvider.Item.<anonymous> (LazyLayoutPager.kt:221)");
            }
            d66.a aVar = az8Var.intervalContent.o().get(i);
            ((py8) aVar.c()).a().invoke(az8Var.pagerScopeImpl, Integer.valueOf(i - aVar.getStartIndex()), dVar, 0);
            if (e.k()) {
                e.n();
            }
        } else {
            dVar.q();
        }
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n(az8 az8Var, int i, Object obj, int i2, d dVar, int i3) {
        az8Var.i(i, obj, dVar, saa.a(i2 | 1));
        return Unit.a;
    }

    @Override // com.google.inputmethod.lt6
    public int a() {
        return this.intervalContent.p();
    }

    @Override // com.google.inputmethod.lt6
    public int c(Object key) {
        return this.keyIndexMap.c(key);
    }

    @Override // com.google.inputmethod.lt6
    public Object d(int index) {
        Object objD = this.keyIndexMap.d(index);
        return objD == null ? this.intervalContent.q(index) : objD;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof az8) {
            return Intrinsics.e(this.intervalContent, ((az8) other).intervalContent);
        }
        return false;
    }

    public int hashCode() {
        return this.intervalContent.hashCode();
    }

    @Override // com.google.inputmethod.lt6
    public void i(final int i, Object obj, d dVar, final int i2) {
        int i3;
        final int i4;
        final Object obj2;
        d dVarF = dVar.F(-1201380429);
        if ((i2 & 6) == 0) {
            i3 = (dVarF.C(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= dVarF.T(obj) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= dVarF.x(this) ? 256 : 128;
        }
        if (dVarF.g((i3 & 147) != 146, i3 & 1)) {
            if (e.k()) {
                e.o(-1201380429, i3, -1, "androidx.compose.foundation.pager.PagerLazyLayoutItemProvider.Item (LazyLayoutPager.kt:219)");
            }
            i4 = i;
            obj2 = obj;
            lu6.c(obj2, i4, this.state.getPinnedPages(), ko1.e(1142237095, true, new Function2() { // from class: com.google.android.yy8
                public final Object invoke(Object obj3, Object obj4) {
                    return az8.m(this.a, i, (d) obj3, ((Integer) obj4).intValue());
                }
            }, dVarF, 54), dVarF, ((i3 >> 3) & 14) | 3072 | ((i3 << 3) & 112));
            if (e.k()) {
                e.n();
            }
        } else {
            i4 = i;
            obj2 = obj;
            dVarF.q();
        }
        s6b s6bVarH = dVarF.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2() { // from class: com.google.android.zy8
                public final Object invoke(Object obj3, Object obj4) {
                    return az8.n(this.a, i4, obj2, i2, (d) obj3, ((Integer) obj4).intValue());
                }
            });
        }
    }
}
