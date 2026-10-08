package androidx.compose.p000animation.core;

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
import kotlinx.coroutines.j;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/ta2;", "", "<anonymous>", "(Lcom/google/android/ta2;)V"}, k = 3, mv = {2, 1, 0})
@lq2(c = "androidx.compose.animation.core.Transition$animateTo$1$1$1", f = "Transition.kt", l = {1222}, m = "invokeSuspend", v = 1)
final class Transition$animateTo$1$1$1 extends SuspendLambda implements Function2<ta2, q22<? super Unit>, Object> {
    float F$0;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ Transition<S> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Transition$animateTo$1$1$1(Transition<S> transition, q22<? super Transition$animateTo$1$1$1> q22Var) {
        super(2, q22Var);
        this.this$0 = transition;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(Transition transition, float f, long j) {
        if (!transition.B()) {
            transition.E(j, f);
        }
        return Unit.a;
    }

    public final q22<Unit> create(Object obj, q22<?> q22Var) {
        Transition$animateTo$1$1$1 transition$animateTo$1$1$1 = new Transition$animateTo$1$1$1(this.this$0, q22Var);
        transition$animateTo$1$1$1.L$0 = obj;
        return transition$animateTo$1$1$1;
    }

    public final Object invoke(ta2 ta2Var, q22<? super Unit> q22Var) {
        return create(ta2Var, q22Var).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        final float fE;
        ta2 ta2Var;
        Object objG = a.g();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            ta2 ta2Var2 = (ta2) this.L$0;
            fE = SuspendAnimationKt.E(ta2Var2.getCoroutineContext());
            ta2Var = ta2Var2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fE = this.F$0;
            ta2Var = (ta2) this.L$0;
            f.b(obj);
        }
        while (j.i(ta2Var)) {
            final Transition<S> transition = this.this$0;
            Function1 function1 = new Function1() { // from class: androidx.compose.animation.core.f
                public final Object invoke(Object obj2) {
                    return Transition$animateTo$1$1$1.l(transition, fE, ((Long) obj2).longValue());
                }
            };
            this.L$0 = ta2Var;
            this.F$0 = fE;
            this.label = 1;
            if (w.c(function1, this) == objG) {
                return objG;
            }
        }
        return Unit.a;
    }
}
