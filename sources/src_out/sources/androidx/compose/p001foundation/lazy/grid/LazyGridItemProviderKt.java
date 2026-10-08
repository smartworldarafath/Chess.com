package androidx.compose.p001foundation.lazy.grid;

import androidx.compose.p001foundation.lazy.grid.LazyGridItemProviderKt;
import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import androidx.compose.p004runtime.p0;
import com.google.android.qh6;
import com.google.inputmethod.op6;
import com.google.inputmethod.pe8;
import com.google.inputmethod.q6c;
import com.google.inputmethod.rp6;
import com.google.inputmethod.sq6;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.PropertyReference0Impl;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a1\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridState;", "state", "Lkotlin/Function1;", "Lcom/google/android/sq6;", "", "content", "Lkotlin/Function0;", "Lcom/google/android/rp6;", "c", "(Landroidx/compose/foundation/lazy/grid/LazyGridState;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/d;I)Lkotlin/jvm/functions/Function0;", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class LazyGridItemProviderKt {
    public static final Function0<rp6> c(final LazyGridState lazyGridState, Function1<? super sq6, Unit> function1, d dVar, int i) {
        if (e.k()) {
            e.o(-1898306282, i, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridItemProviderLambda (LazyGridItemProvider.kt:40)");
        }
        final q6c q6cVarR = p0.r(function1, dVar, (i >> 3) & 14);
        boolean z = (((i & 14) ^ 6) > 4 && dVar.x(lazyGridState)) || (i & 6) == 4;
        Object objR = dVar.R();
        if (z || objR == d.INSTANCE.a()) {
            final q6c q6cVarD = p0.d(p0.q(), new Function0() { // from class: com.google.android.sp6
                public final Object invoke() {
                    return LazyGridItemProviderKt.d(q6cVarR);
                }
            });
            final q6c q6cVarD2 = p0.d(p0.q(), new Function0() { // from class: com.google.android.tp6
                public final Object invoke() {
                    return LazyGridItemProviderKt.e(q6cVarD, lazyGridState);
                }
            });
            objR = new PropertyReference0Impl(q6cVarD2) { // from class: androidx.compose.foundation.lazy.grid.LazyGridItemProviderKt$rememberLazyGridItemProviderLambda$1$1
                public Object get() {
                    return ((q6c) ((CallableReference) this).receiver).getValue();
                }
            };
            dVar.L(objR);
        }
        qh6 qh6Var = (qh6) objR;
        if (e.k()) {
            e.n();
        }
        return qh6Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final op6 d(q6c q6cVar) {
        return new op6((Function1) q6cVar.getValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final c e(q6c q6cVar, LazyGridState lazyGridState) {
        op6 op6Var = (op6) q6cVar.getValue();
        return new c(lazyGridState, op6Var, new pe8(lazyGridState.C(), op6Var));
    }
}
