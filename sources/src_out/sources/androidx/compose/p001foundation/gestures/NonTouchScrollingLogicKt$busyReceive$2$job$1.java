package androidx.compose.p001foundation.gestures;

import androidx.compose.p004runtime.w;
import com.google.android.lq2;
import com.google.android.q22;
import com.google.android.ta2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.u;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/ta2;", "", "<anonymous>", "(Lcom/google/android/ta2;)V"}, k = 3, mv = {2, 1, 0})
@lq2(c = "androidx.compose.foundation.gestures.NonTouchScrollingLogicKt$busyReceive$2$job$1", f = "NonTouchScrollingLogic.kt", l = {76}, m = "invokeSuspend", v = 1)
final class NonTouchScrollingLogicKt$busyReceive$2$job$1 extends SuspendLambda implements Function2<ta2, q22<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;

    NonTouchScrollingLogicKt$busyReceive$2$job$1(q22<? super NonTouchScrollingLogicKt$busyReceive$2$job$1> q22Var) {
        super(2, q22Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(long j) {
        return Unit.a;
    }

    public final q22<Unit> create(Object obj, q22<?> q22Var) {
        NonTouchScrollingLogicKt$busyReceive$2$job$1 nonTouchScrollingLogicKt$busyReceive$2$job$1 = new NonTouchScrollingLogicKt$busyReceive$2$job$1(q22Var);
        nonTouchScrollingLogicKt$busyReceive$2$job$1.L$0 = obj;
        return nonTouchScrollingLogicKt$busyReceive$2$job$1;
    }

    public final Object invoke(ta2 ta2Var, q22<? super Unit> q22Var) {
        return create(ta2Var, q22Var).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        ta2 ta2Var;
        Object objG = a.g();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            ta2Var = (ta2) this.L$0;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ta2Var = (ta2) this.L$0;
            f.b(obj);
        }
        while (u.n(ta2Var.getCoroutineContext())) {
            Function1 function1 = new Function1() { // from class: androidx.compose.foundation.gestures.p
                public final Object invoke(Object obj2) {
                    return NonTouchScrollingLogicKt$busyReceive$2$job$1.l(((Long) obj2).longValue());
                }
            };
            this.L$0 = ta2Var;
            this.label = 1;
            if (w.c(function1, this) == objG) {
                return objG;
            }
        }
        return Unit.a;
    }
}
