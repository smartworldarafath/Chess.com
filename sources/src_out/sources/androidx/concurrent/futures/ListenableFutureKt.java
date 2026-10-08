package androidx.concurrent.futures;

import com.google.android.oq2;
import com.google.android.q22;
import com.google.android.s47;
import java.util.concurrent.ExecutionException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.e;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\u001a \u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086@¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"T", "Lcom/google/android/s47;", "a", "(Lcom/google/android/s47;Lcom/google/android/q22;)Ljava/lang/Object;", "Ljava/util/concurrent/ExecutionException;", "", "b", "(Ljava/util/concurrent/ExecutionException;)Ljava/lang/Throwable;", "concurrent-futures-ktx"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ListenableFutureKt {
    public static final <T> Object a(final s47<T> s47Var, q22<? super T> q22Var) throws Throwable {
        try {
            if (s47Var.isDone()) {
                return AbstractResolvableFuture.m(s47Var);
            }
            e eVar = new e(kotlin.coroutines.intrinsics.a.d(q22Var), 1);
            eVar.G();
            s47Var.addListener(new a(s47Var, eVar), DirectExecutor.INSTANCE);
            eVar.D(new Function1<Throwable, Unit>() { // from class: androidx.concurrent.futures.ListenableFutureKt$await$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((Throwable) obj);
                    return Unit.a;
                }

                public final void invoke(Throwable th) {
                    s47Var.cancel(false);
                }
            });
            Object objY = eVar.y();
            if (objY == kotlin.coroutines.intrinsics.a.g()) {
                oq2.c(q22Var);
            }
            return objY;
        } catch (ExecutionException e) {
            throw b(e);
        }
    }

    public static final Throwable b(ExecutionException executionException) {
        Throwable cause = executionException.getCause();
        Intrinsics.g(cause);
        return cause;
    }
}
