package androidx.compose.p004runtime;

import com.google.android.q22;
import com.google.android.rw0;
import com.google.android.ta2;
import com.google.inputmethod.lq1;
import com.google.inputmethod.ur1;
import com.google.inputmethod.yea;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.j;
import kotlinx.coroutines.s;
import kotlinx.coroutines.u;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\u0003\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B3\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\"\u0010\n\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0005¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\u000eJ\u001f\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R0\u0010\n\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u001eR\u0018\u0010#\u001a\u0006\u0012\u0002\b\u00030 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Landroidx/compose/runtime/q;", "Lcom/google/android/yea;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "Lkotlin/coroutines/CoroutineContext;", "parentCoroutineContext", "Lkotlin/Function2;", "Lcom/google/android/ta2;", "Lcom/google/android/q22;", "", "", "task", "<init>", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;)V", "d", "()V", "f", "e", "context", "", "exception", "handleException", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Throwable;)V", "a", "Lkotlin/coroutines/CoroutineContext;", "b", "Lkotlin/jvm/functions/Function2;", "c", "Lcom/google/android/ta2;", "scope", "Lkotlinx/coroutines/s;", "Lkotlinx/coroutines/s;", "job", "Lkotlin/coroutines/CoroutineContext$b;", "getKey", "()Lkotlin/coroutines/CoroutineContext$b;", "key", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class q implements yea, CoroutineExceptionHandler {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final CoroutineContext parentCoroutineContext;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Function2<ta2, q22<? super Unit>, Object> task;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final ta2 scope;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private s job;

    public q(CoroutineContext coroutineContext, Function2<? super ta2, ? super q22<? super Unit>, ? extends Object> function2) {
        this.parentCoroutineContext = coroutineContext;
        this.task = function2;
        CoroutineContext coroutineContextPlus = coroutineContext.plus(this);
        this.scope = j.a(lq1.isVerboseTracingEnabled ? coroutineContextPlus.plus(r.c) : coroutineContextPlus);
    }

    @Override // com.google.inputmethod.yea
    public void d() {
        s sVar = this.job;
        if (sVar != null) {
            u.f(sVar, "Old job was still running!", (Throwable) null, 2, (Object) null);
        }
        this.job = rw0.d(this.scope, (CoroutineContext) null, (CoroutineStart) null, this.task, 3, (Object) null);
    }

    @Override // com.google.inputmethod.yea
    public void e() {
        s sVar = this.job;
        if (sVar != null) {
            sVar.k(new LeftCompositionCancellationException());
        }
        this.job = null;
    }

    @Override // com.google.inputmethod.yea
    public void f() {
        s sVar = this.job;
        if (sVar != null) {
            sVar.k(new LeftCompositionCancellationException());
        }
        this.job = null;
    }

    public /* bridge */ <R> R fold(R r, Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
        return (R) CoroutineExceptionHandler.a.a(this, r, function2);
    }

    public /* bridge */ <E extends CoroutineContext.Element> E get(CoroutineContext.b<E> bVar) {
        return (E) CoroutineExceptionHandler.a.b(this, bVar);
    }

    public CoroutineContext.b<?> getKey() {
        return CoroutineExceptionHandler.t2;
    }

    public void handleException(CoroutineContext context, Throwable exception) throws Throwable {
        ur1 ur1Var = (ur1) context.get(ur1.INSTANCE);
        if (ur1Var != null) {
            ur1Var.d(exception, this);
        }
        CoroutineExceptionHandler coroutineExceptionHandler = this.parentCoroutineContext.get(CoroutineExceptionHandler.t2);
        if (coroutineExceptionHandler == null) {
            throw exception;
        }
        coroutineExceptionHandler.handleException(context, exception);
    }

    public /* bridge */ CoroutineContext minusKey(CoroutineContext.b<?> bVar) {
        return CoroutineExceptionHandler.a.c(this, bVar);
    }

    public /* bridge */ CoroutineContext plus(CoroutineContext coroutineContext) {
        return CoroutineExceptionHandler.a.d(this, coroutineContext);
    }
}
