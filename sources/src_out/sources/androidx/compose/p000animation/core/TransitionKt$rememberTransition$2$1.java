package androidx.compose.p000animation.core;

import com.google.android.g41;
import com.google.android.lq2;
import com.google.android.q22;
import com.google.android.ta2;
import com.google.android.x58;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/ta2;", "", "<anonymous>", "(Lcom/google/android/ta2;)V"}, k = 3, mv = {2, 1, 0})
@lq2(c = "androidx.compose.animation.core.TransitionKt$rememberTransition$2$1", f = "Transition.kt", l = {2194}, m = "invokeSuspend", v = 1)
final class TransitionKt$rememberTransition$2$1 extends SuspendLambda implements Function2<ta2, q22<? super Unit>, Object> {
    final /* synthetic */ g<T> $transitionState;
    Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TransitionKt$rememberTransition$2$1(g<T> gVar, q22<? super TransitionKt$rememberTransition$2$1> q22Var) {
        super(2, q22Var);
        this.$transitionState = gVar;
    }

    public final q22<Unit> create(Object obj, q22<?> q22Var) {
        return new TransitionKt$rememberTransition$2$1(this.$transitionState, q22Var);
    }

    public final Object invoke(ta2 ta2Var, q22<? super Unit> q22Var) {
        return create(ta2Var, q22Var).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        x58 compositionContinuationMutex;
        g gVar;
        Object objG = a.g();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            ((SeekableTransitionState) this.$transitionState).M();
            compositionContinuationMutex = ((SeekableTransitionState) this.$transitionState).getCompositionContinuationMutex();
            g gVar2 = this.$transitionState;
            this.L$0 = compositionContinuationMutex;
            this.L$1 = gVar2;
            this.label = 1;
            if (compositionContinuationMutex.g((Object) null, this) == objG) {
                return objG;
            }
            gVar = gVar2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gVar = (g) this.L$1;
            compositionContinuationMutex = (x58) this.L$0;
            f.b(obj);
        }
        try {
            ((SeekableTransitionState) gVar).U(((SeekableTransitionState) gVar).b());
            g41 g41VarH = ((SeekableTransitionState) gVar).H();
            if (g41VarH != null) {
                Result.a aVar = Result.a;
                g41VarH.resumeWith(Result.b(((SeekableTransitionState) gVar).b()));
            }
            ((SeekableTransitionState) gVar).V(null);
            Unit unit = Unit.a;
            return Unit.a;
        } finally {
            compositionContinuationMutex.h((Object) null);
        }
    }
}
