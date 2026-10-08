package androidx.compose.p001foundation.lazy.staggeredgrid;

import androidx.compose.p001foundation.lazy.staggeredgrid.d;
import androidx.compose.p004runtime.e;
import com.google.inputmethod.dfa;
import com.google.inputmethod.k0b;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a#\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"", "initialFirstVisibleItemIndex", "initialFirstVisibleItemScrollOffset", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "b", "(IILandroidx/compose/runtime/d;II)Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class d {
    public static final LazyStaggeredGridState b(final int i, final int i2, androidx.compose.p004runtime.d dVar, int i3, int i4) {
        if ((i4 & 1) != 0) {
            i = 0;
        }
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if (e.k()) {
            e.o(161145796, i3, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberLazyStaggeredGridState (LazyStaggeredGridState.kt:84)");
        }
        Object[] objArr = new Object[0];
        k0b<LazyStaggeredGridState, Object> k0bVarA = LazyStaggeredGridState.INSTANCE.a();
        boolean z = true;
        boolean z2 = (((i3 & 14) ^ 6) > 4 && dVar.C(i)) || (i3 & 6) == 4;
        if ((((i3 & 112) ^ 48) <= 32 || !dVar.C(i2)) && (i3 & 48) != 32) {
            z = false;
        }
        boolean z3 = z2 | z;
        Object objR = dVar.R();
        if (z3 || objR == androidx.compose.p004runtime.d.INSTANCE.a()) {
            objR = new Function0() { // from class: com.google.android.fz6
                public final Object invoke() {
                    return d.c(i, i2);
                }
            };
            dVar.L(objR);
        }
        LazyStaggeredGridState lazyStaggeredGridState = (LazyStaggeredGridState) dfa.k(objArr, k0bVarA, (Function0) objR, dVar, 0);
        if (e.k()) {
            e.n();
        }
        return lazyStaggeredGridState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LazyStaggeredGridState c(int i, int i2) {
        return new LazyStaggeredGridState(i, i2);
    }
}
