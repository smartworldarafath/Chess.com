package androidx.compose.p004runtime;

import com.google.android.q22;
import com.google.inputmethod.t04;
import com.google.inputmethod.xm6;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.a;
import kotlin.f;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\u0007J*\u0010\r\u001a\u00028\u0000\"\u0004\b\u0000\u0010\t2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00028\u00000\nH\u0096@¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Landroidx/compose/runtime/PausableMonotonicFrameClock;", "Landroidx/compose/runtime/v;", "frameClock", "<init>", "(Landroidx/compose/runtime/v;)V", "", "c", "()V", "d", "R", "Lkotlin/Function1;", "", "onFrame", "d0", "(Lkotlin/jvm/functions/Function1;Lcom/google/android/q22;)Ljava/lang/Object;", "a", "Landroidx/compose/runtime/v;", "Lcom/google/android/xm6;", "b", "Lcom/google/android/xm6;", "latch", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PausableMonotonicFrameClock implements v {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final v frameClock;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final xm6 latch = new xm6();

    public PausableMonotonicFrameClock(v vVar) {
        this.frameClock = vVar;
    }

    public final void c() {
        this.latch.d();
    }

    public final void d() {
        this.latch.f();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.compose.p004runtime.v
    public <R> Object d0(Function1<? super Long, ? extends R> function1, q22<? super R> q22Var) {
        PausableMonotonicFrameClock$withFrameNanos$1 pausableMonotonicFrameClock$withFrameNanos$1;
        if (q22Var instanceof PausableMonotonicFrameClock$withFrameNanos$1) {
            pausableMonotonicFrameClock$withFrameNanos$1 = (PausableMonotonicFrameClock$withFrameNanos$1) q22Var;
            int i = pausableMonotonicFrameClock$withFrameNanos$1.label;
            if ((i & t04.INVALID_ID) != 0) {
                pausableMonotonicFrameClock$withFrameNanos$1.label = i - t04.INVALID_ID;
            } else {
                pausableMonotonicFrameClock$withFrameNanos$1 = new PausableMonotonicFrameClock$withFrameNanos$1(this, q22Var);
            }
        } else {
            pausableMonotonicFrameClock$withFrameNanos$1 = new PausableMonotonicFrameClock$withFrameNanos$1(this, q22Var);
        }
        Object obj = pausableMonotonicFrameClock$withFrameNanos$1.result;
        Object objG = a.g();
        int i2 = pausableMonotonicFrameClock$withFrameNanos$1.label;
        if (i2 == 0) {
            f.b(obj);
            xm6 xm6Var = this.latch;
            pausableMonotonicFrameClock$withFrameNanos$1.L$0 = function1;
            pausableMonotonicFrameClock$withFrameNanos$1.label = 1;
            if (xm6Var.c(pausableMonotonicFrameClock$withFrameNanos$1) != objG) {
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
            return obj;
        }
        function1 = (Function1) pausableMonotonicFrameClock$withFrameNanos$1.L$0;
        f.b(obj);
        v vVar = this.frameClock;
        pausableMonotonicFrameClock$withFrameNanos$1.L$0 = null;
        pausableMonotonicFrameClock$withFrameNanos$1.label = 2;
        Object objD0 = vVar.d0(function1, pausableMonotonicFrameClock$withFrameNanos$1);
        return objD0 == objG ? objG : objD0;
    }

    public /* bridge */ <R> R fold(R r, Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
        return (R) v.a.a(this, r, function2);
    }

    public /* bridge */ <E extends CoroutineContext.Element> E get(CoroutineContext.b<E> bVar) {
        return (E) v.a.b(this, bVar);
    }

    public /* bridge */ CoroutineContext minusKey(CoroutineContext.b<?> bVar) {
        return v.a.c(this, bVar);
    }

    public /* bridge */ CoroutineContext plus(CoroutineContext coroutineContext) {
        return v.a.d(this, coroutineContext);
    }
}
