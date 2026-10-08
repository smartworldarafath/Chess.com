package androidx.lifecycle;

import com.google.android.lq2;
import com.google.android.q22;
import com.google.android.ta2;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/ta2;", "", "<anonymous>", "(Lcom/google/android/ta2;)V"}, k = 3, mv = {2, 0, 0})
@lq2(c = "androidx.lifecycle.LifecycleCoroutineScopeImpl$register$1", f = "Lifecycle.kt", l = {}, m = "invokeSuspend", v = 1)
final class LifecycleCoroutineScopeImpl$register$1 extends SuspendLambda implements Function2<ta2, q22<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ LifecycleCoroutineScopeImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LifecycleCoroutineScopeImpl$register$1(LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl, q22<? super LifecycleCoroutineScopeImpl$register$1> q22Var) {
        super(2, q22Var);
        this.this$0 = lifecycleCoroutineScopeImpl;
    }

    public final q22<Unit> create(Object obj, q22<?> q22Var) {
        LifecycleCoroutineScopeImpl$register$1 lifecycleCoroutineScopeImpl$register$1 = new LifecycleCoroutineScopeImpl$register$1(this.this$0, q22Var);
        lifecycleCoroutineScopeImpl$register$1.L$0 = obj;
        return lifecycleCoroutineScopeImpl$register$1;
    }

    public final Object invoke(ta2 ta2Var, q22<? super Unit> q22Var) {
        return create(ta2Var, q22Var).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        kotlin.coroutines.intrinsics.a.g();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.f.b(obj);
        ta2 ta2Var = (ta2) this.L$0;
        if (this.this$0.getLifecycle().getState().compareTo(Lifecycle.State.INITIALIZED) >= 0) {
            this.this$0.getLifecycle().c(this.this$0);
        } else {
            kotlinx.coroutines.u.e(ta2Var.getCoroutineContext(), (CancellationException) null, 1, (Object) null);
        }
        return Unit.a;
    }
}
