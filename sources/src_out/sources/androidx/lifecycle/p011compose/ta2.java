package androidx.lifecycle.p011compose;

import androidx.lifecycle.Lifecycle;
import com.google.android.lq2;
import com.google.android.q22;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: androidx.lifecycle.compose.RememberLifecycleOwnerKt$rememberLifecycleOwner$2$1, reason: from Kotlin metadata */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/ta2;", "", "<anonymous>", "(Lcom/google/android/ta2;)V"}, k = 3, mv = {2, 0, 0})
@lq2(c = "androidx.lifecycle.compose.RememberLifecycleOwnerKt$rememberLifecycleOwner$2$1", f = "RememberLifecycleOwner.kt", l = {}, m = "invokeSuspend", v = 1)
final class ta2 extends SuspendLambda implements Function2<com.google.android.ta2, q22<? super Unit>, Object> {
    final /* synthetic */ a $localLifecycleOwner;
    final /* synthetic */ Lifecycle.State $maxLifecycle;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ta2(a aVar, Lifecycle.State state, q22<? super ta2> q22Var) {
        super(2, q22Var);
        this.$localLifecycleOwner = aVar;
        this.$maxLifecycle = state;
    }

    public final q22<Unit> create(Object obj, q22<?> q22Var) {
        return new ta2(this.$localLifecycleOwner, this.$maxLifecycle, q22Var);
    }

    public final Object invoke(com.google.android.ta2 ta2Var, q22<? super Unit> q22Var) {
        return create(ta2Var, q22Var).invokeSuspend(Unit.a);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
        a.g();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        this.$localLifecycleOwner.b(this.$maxLifecycle);
        return Unit.a;
    }
}
