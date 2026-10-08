package androidx.p008glance.p010session;

import com.google.android.lq2;
import com.google.android.q22;
import com.google.android.ta2;
import com.google.inputmethod.l8d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.j;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lcom/google/android/ta2;", "", "<anonymous>", "(Lcom/google/android/ta2;)V"}, k = 3, mv = {1, 8, 0})
@lq2(c = "androidx.glance.session.TimerScopeKt$withTimer$2$1$blockScope$1$startTimer$1", f = "TimerScope.kt", l = {115}, m = "invokeSuspend")
final class TimerScopeKt$withTimer$2$1$blockScope$1$startTimer$1 extends SuspendLambda implements Function2<ta2, q22<? super Unit>, Object> {
    final /* synthetic */ Function2<l8d, q22<? super T>, Object> $block;
    final /* synthetic */ c $timeSource;
    final /* synthetic */ ta2 $timerScope;
    int label;
    final /* synthetic */ TimerScopeKt$withTimer$2$1$blockScope$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TimerScopeKt$withTimer$2$1$blockScope$1$startTimer$1(TimerScopeKt$withTimer$2$1$blockScope$1 timerScopeKt$withTimer$2$1$blockScope$1, c cVar, ta2 ta2Var, Function2 function2, q22 q22Var) {
        super(2, q22Var);
        this.this$0 = timerScopeKt$withTimer$2$1$blockScope$1;
        this.$timeSource = cVar;
        this.$timerScope = ta2Var;
        this.$block = function2;
    }

    public final q22<Unit> create(Object obj, q22<?> q22Var) {
        return new TimerScopeKt$withTimer$2$1$blockScope$1$startTimer$1(this.this$0, this.$timeSource, this.$timerScope, this.$block, q22Var);
    }

    public final Object invoke(ta2 ta2Var, q22<? super Unit> q22Var) {
        return create(ta2Var, q22Var).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        long jC0;
        Object objG = a.g();
        int i = this.label;
        if (i != 0 && i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        do {
            Object obj2 = this.this$0.deadline.get();
            Intrinsics.g(obj2);
            if (((Number) obj2).longValue() <= this.$timeSource.a()) {
                j.d(this.$timerScope, new TimeoutCancellationException("Timed out of executing block.", this.$block.hashCode()));
                return Unit.a;
            }
            jC0 = this.this$0.c0();
            this.label = 1;
        } while (DelayKt.c(jC0, this) != objG);
        return objG;
    }
}
