package androidx.compose.p001foundation.lazy;

import androidx.compose.p001foundation.lazy.LazyListItemProviderKt;
import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import androidx.compose.p004runtime.p0;
import com.google.android.qh6;
import com.google.inputmethod.cw6;
import com.google.inputmethod.fv6;
import com.google.inputmethod.hv6;
import com.google.inputmethod.mr6;
import com.google.inputmethod.pe8;
import com.google.inputmethod.q6c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.PropertyReference0Impl;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a1\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/foundation/lazy/LazyListState;", "state", "Lkotlin/Function1;", "Lcom/google/android/cw6;", "", "content", "Lkotlin/Function0;", "Lcom/google/android/hv6;", "c", "(Landroidx/compose/foundation/lazy/LazyListState;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/d;I)Lkotlin/jvm/functions/Function0;", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class LazyListItemProviderKt {
    public static final Function0<hv6> c(final LazyListState lazyListState, Function1<? super cw6, Unit> function1, d dVar, int i) {
        if (e.k()) {
            e.o(-343736148, i, -1, "androidx.compose.foundation.lazy.rememberLazyListItemProviderLambda (LazyListItemProvider.kt:41)");
        }
        final q6c q6cVarR = p0.r(function1, dVar, (i >> 3) & 14);
        boolean z = (((i & 14) ^ 6) > 4 && dVar.x(lazyListState)) || (i & 6) == 4;
        Object objR = dVar.R();
        if (z || objR == d.INSTANCE.a()) {
            final mr6 mr6Var = new mr6();
            final q6c q6cVarD = p0.d(p0.q(), new Function0() { // from class: com.google.android.iv6
                public final Object invoke() {
                    return LazyListItemProviderKt.d(q6cVarR);
                }
            });
            final q6c q6cVarD2 = p0.d(p0.q(), new Function0() { // from class: com.google.android.jv6
                public final Object invoke() {
                    return LazyListItemProviderKt.e(q6cVarD, lazyListState, mr6Var);
                }
            });
            objR = new PropertyReference0Impl(q6cVarD2) { // from class: androidx.compose.foundation.lazy.LazyListItemProviderKt$rememberLazyListItemProviderLambda$1$1
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
    public static final fv6 d(q6c q6cVar) {
        return new fv6((Function1) q6cVar.getValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final c e(q6c q6cVar, LazyListState lazyListState, mr6 mr6Var) {
        fv6 fv6Var = (fv6) q6cVar.getValue();
        return new c(lazyListState, fv6Var, mr6Var, new pe8(lazyListState.E(), fv6Var));
    }
}
