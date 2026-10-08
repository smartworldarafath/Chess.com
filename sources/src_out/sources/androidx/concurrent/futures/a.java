package androidx.concurrent.futures;

import com.google.android.g41;
import com.google.android.s47;
import java.util.concurrent.ExecutionException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.f;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Landroidx/concurrent/futures/a;", "T", "Ljava/lang/Runnable;", "Lcom/google/android/s47;", "futureToObserve", "Lcom/google/android/g41;", "continuation", "<init>", "(Lcom/google/android/s47;Lcom/google/android/g41;)V", "", "run", "()V", "a", "Lcom/google/android/s47;", "getFutureToObserve", "()Lcom/google/android/s47;", "b", "Lcom/google/android/g41;", "getContinuation", "()Lcom/google/android/g41;", "concurrent-futures-ktx"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class a<T> implements Runnable {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final s47<T> futureToObserve;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final g41<T> continuation;

    /* JADX WARN: Multi-variable type inference failed */
    public a(s47<T> s47Var, g41<? super T> g41Var) {
        this.futureToObserve = s47Var;
        this.continuation = g41Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.futureToObserve.isCancelled()) {
            g41.a.a(this.continuation, (Throwable) null, 1, (Object) null);
            return;
        }
        try {
            g41<T> g41Var = this.continuation;
            Result.a aVar = Result.a;
            g41Var.resumeWith(Result.b(AbstractResolvableFuture.m(this.futureToObserve)));
        } catch (ExecutionException e) {
            g41<T> g41Var2 = this.continuation;
            Result.a aVar2 = Result.a;
            g41Var2.resumeWith(Result.b(f.a(ListenableFutureKt.b(e))));
        }
    }
}
