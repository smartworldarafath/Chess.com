package androidx.lifecycle.p011compose;

import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import androidx.compose.p004runtime.p0;
import androidx.lifecycle.Lifecycle;
import com.google.android.ai4;
import com.google.android.r6c;
import com.google.inputmethod.h67;
import com.google.inputmethod.n17;
import com.google.inputmethod.q6c;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aC\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n\u001aK\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0006\u0010\f\u001a\u00028\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\r\u0010\u000e\u001aI\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"T", "Lcom/google/android/r6c;", "Lcom/google/android/n17;", "lifecycleOwner", "Landroidx/lifecycle/Lifecycle$State;", "minActiveState", "Lkotlin/coroutines/CoroutineContext;", "context", "Lcom/google/android/q6c;", "c", "(Lcom/google/android/r6c;Lcom/google/android/n17;Landroidx/lifecycle/Lifecycle$State;Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/d;II)Lcom/google/android/q6c;", "Lcom/google/android/ai4;", "initialValue", "b", "(Lcom/google/android/ai4;Ljava/lang/Object;Lcom/google/android/n17;Landroidx/lifecycle/Lifecycle$State;Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/d;II)Lcom/google/android/q6c;", "Landroidx/lifecycle/Lifecycle;", "lifecycle", "a", "(Lcom/google/android/ai4;Ljava/lang/Object;Landroidx/lifecycle/Lifecycle;Landroidx/lifecycle/Lifecycle$State;Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/d;II)Lcom/google/android/q6c;", "lifecycle-runtime-compose"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class FlowExtKt {
    public static final <T> q6c<T> a(ai4<? extends T> ai4Var, T t, Lifecycle lifecycle, Lifecycle.State state, CoroutineContext coroutineContext, d dVar, int i, int i2) {
        if ((i2 & 4) != 0) {
            state = Lifecycle.State.STARTED;
        }
        Lifecycle.State state2 = state;
        if ((i2 & 8) != 0) {
            coroutineContext = EmptyCoroutineContext.a;
        }
        CoroutineContext coroutineContext2 = coroutineContext;
        if (e.k()) {
            e.o(1977777920, i, -1, "androidx.lifecycle.compose.collectAsStateWithLifecycle (FlowExt.kt:174)");
        }
        Object[] objArr = {ai4Var, lifecycle, state2, coroutineContext2};
        boolean zT = dVar.T(lifecycle) | ((((i & 7168) ^ 3072) > 2048 && dVar.C(state2.ordinal())) || (i & 3072) == 2048) | dVar.T(coroutineContext2) | dVar.T(ai4Var);
        Object objR = dVar.R();
        if (zT || objR == d.INSTANCE.a()) {
            FlowExtKt$collectAsStateWithLifecycle$1$1 flowExtKt$collectAsStateWithLifecycle$1$1 = new FlowExtKt$collectAsStateWithLifecycle$1$1(lifecycle, state2, coroutineContext2, ai4Var, null);
            dVar.L(flowExtKt$collectAsStateWithLifecycle$1$1);
            objR = flowExtKt$collectAsStateWithLifecycle$1$1;
        }
        q6c<T> q6cVarP = p0.p(t, objArr, (Function2) objR, dVar, (i >> 3) & 14);
        if (e.k()) {
            e.n();
        }
        return q6cVarP;
    }

    public static final <T> q6c<T> b(ai4<? extends T> ai4Var, T t, n17 n17Var, Lifecycle.State state, CoroutineContext coroutineContext, d dVar, int i, int i2) {
        if ((i2 & 2) != 0) {
            n17Var = (n17) dVar.v(h67.c());
        }
        if ((i2 & 4) != 0) {
            state = Lifecycle.State.STARTED;
        }
        Lifecycle.State state2 = state;
        if ((i2 & 8) != 0) {
            coroutineContext = EmptyCoroutineContext.a;
        }
        CoroutineContext coroutineContext2 = coroutineContext;
        if (e.k()) {
            e.o(-1485997211, i, -1, "androidx.lifecycle.compose.collectAsStateWithLifecycle (FlowExt.kt:138)");
        }
        q6c<T> q6cVarA = a(ai4Var, t, n17Var.getLifecycle(), state2, coroutineContext2, dVar, (i & 14) | (((i >> 3) & 8) << 3) | (i & 112) | (i & 7168) | (57344 & i), 0);
        if (e.k()) {
            e.n();
        }
        return q6cVarA;
    }

    public static final <T> q6c<T> c(r6c<? extends T> r6cVar, n17 n17Var, Lifecycle.State state, CoroutineContext coroutineContext, d dVar, int i, int i2) {
        if ((i2 & 1) != 0) {
            n17Var = (n17) dVar.v(h67.c());
        }
        if ((i2 & 2) != 0) {
            state = Lifecycle.State.STARTED;
        }
        Lifecycle.State state2 = state;
        if ((i2 & 4) != 0) {
            coroutineContext = EmptyCoroutineContext.a;
        }
        CoroutineContext coroutineContext2 = coroutineContext;
        if (e.k()) {
            e.o(743249048, i, -1, "androidx.lifecycle.compose.collectAsStateWithLifecycle (FlowExt.kt:62)");
        }
        int i3 = i << 3;
        q6c<T> q6cVarA = a(r6cVar, r6cVar.getValue(), n17Var.getLifecycle(), state2, coroutineContext2, dVar, (i & 14) | (i3 & 7168) | (i3 & 57344), 0);
        if (e.k()) {
            e.n();
        }
        return q6cVarA;
    }
}
