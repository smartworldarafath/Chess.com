package androidx.compose.p004runtime;

import com.google.android.ai4;
import com.google.android.r6c;
import com.google.inputmethod.hwb;
import com.google.inputmethod.q6c;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.d;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a/\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001aA\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\"\b\b\u0000\u0010\u0000*\u00028\u0001\"\u0004\b\u0001\u0010\u0007*\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\t\u001a\u00028\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a3\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u00002\b\u0010\r\u001a\u0004\u0018\u00010\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a'\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u00002\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"T", "Lcom/google/android/r6c;", "Lkotlin/coroutines/CoroutineContext;", "context", "Lcom/google/android/q6c;", "b", "(Lcom/google/android/r6c;Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/d;II)Lcom/google/android/q6c;", "R", "Lcom/google/android/ai4;", "initial", "a", "(Lcom/google/android/ai4;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/d;II)Lcom/google/android/q6c;", "Lcom/google/android/hwb;", "externalManager", "Lkotlin/Function0;", "block", "d", "(Lcom/google/android/hwb;Lkotlin/jvm/functions/Function0;)Lcom/google/android/ai4;", "c", "(Lkotlin/jvm/functions/Function0;)Lcom/google/android/ai4;", "runtime"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "androidx/compose/runtime/SnapshotStateKt")
final /* synthetic */ class SnapshotStateKt__SnapshotFlowKt {
    public static final <T extends R, R> q6c<R> a(ai4<? extends T> ai4Var, R r, CoroutineContext coroutineContext, d dVar, int i, int i2) {
        if ((i2 & 2) != 0) {
            coroutineContext = EmptyCoroutineContext.a;
        }
        CoroutineContext coroutineContext2 = coroutineContext;
        if (e.k()) {
            e.o(-606625098, i, -1, "androidx.compose.runtime.collectAsState (SnapshotFlow.kt:69)");
        }
        boolean zT = dVar.T(coroutineContext2) | dVar.T(ai4Var);
        Object objR = dVar.R();
        if (zT || objR == d.INSTANCE.a()) {
            objR = new SnapshotStateKt__SnapshotFlowKt$collectAsState$1$1(coroutineContext2, ai4Var, null);
            dVar.L(objR);
        }
        q6c<R> q6cVarM = p0.m(r, ai4Var, coroutineContext2, (Function2) objR, dVar, ((i >> 3) & 14) | ((i << 3) & 112) | (i & 896));
        if (e.k()) {
            e.n();
        }
        return q6cVarM;
    }

    public static final <T> q6c<T> b(r6c<? extends T> r6cVar, CoroutineContext coroutineContext, d dVar, int i, int i2) {
        if ((i2 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.a;
        }
        CoroutineContext coroutineContext2 = coroutineContext;
        if (e.k()) {
            e.o(-1439883919, i, -1, "androidx.compose.runtime.collectAsState (SnapshotFlow.kt:53)");
        }
        q6c<T> q6cVarA = p0.a(r6cVar, r6cVar.getValue(), coroutineContext2, dVar, (i & 14) | ((i << 3) & 896), 0);
        if (e.k()) {
            e.n();
        }
        return q6cVarA;
    }

    public static final <T> ai4<T> c(Function0<? extends T> function0) {
        return d(null, function0);
    }

    private static final <T> ai4<T> d(hwb hwbVar, Function0<? extends T> function0) {
        return d.O(new SnapshotStateKt__SnapshotFlowKt$snapshotFlowImpl$1(hwbVar, function0, null));
    }
}
