package androidx.compose.p004runtime;

import com.google.android.q22;
import com.google.inputmethod.kz7;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a*\u0010\u0004\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u0001H\u0086@¢\u0006\u0004\b\u0004\u0010\u0005\u001a*\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u0001H\u0086@¢\u0006\u0004\b\u0006\u0010\u0005\"\u001e\u0010\r\u001a\u00020\b*\u00020\u00078FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"R", "Lkotlin/Function1;", "", "onFrame", "c", "(Lkotlin/jvm/functions/Function1;Lcom/google/android/q22;)Ljava/lang/Object;", "b", "Lkotlin/coroutines/CoroutineContext;", "Landroidx/compose/runtime/v;", "a", "(Lkotlin/coroutines/CoroutineContext;)Landroidx/compose/runtime/v;", "getMonotonicFrameClock$annotations", "(Lkotlin/coroutines/CoroutineContext;)V", "monotonicFrameClock", "runtime"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class w {
    public static final v a(CoroutineContext coroutineContext) {
        v vVar = (v) coroutineContext.get(v.INSTANCE);
        if (vVar != null) {
            return vVar;
        }
        throw new IllegalStateException("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.");
    }

    public static final <R> Object b(Function1<? super Long, ? extends R> function1, q22<? super R> q22Var) {
        return a(q22Var.getContext()).d0(new kz7(function1), q22Var);
    }

    public static final <R> Object c(Function1<? super Long, ? extends R> function1, q22<? super R> q22Var) {
        return a(q22Var.getContext()).d0(function1, q22Var);
    }
}
