package androidx.compose.p001foundation.gestures;

import androidx.compose.p000animation.core.SuspendAnimationKt;
import com.google.android.lq2;
import com.google.android.q22;
import com.google.android.ta2;
import com.google.android.ut0;
import com.google.inputmethod.AnimationState;
import com.google.inputmethod.jr;
import com.google.inputmethod.or;
import com.google.inputmethod.p9b;
import com.google.inputmethod.vq2;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/ta2;", "", "<anonymous>", "(Lcom/google/android/ta2;)F"}, k = 3, mv = {2, 1, 0})
@lq2(c = "androidx.compose.foundation.gestures.DefaultFlingBehavior$performFling$2", f = "Scrollable.kt", l = {1079}, m = "invokeSuspend", v = 1)
final class DefaultFlingBehavior$performFling$2 extends SuspendLambda implements Function2<ta2, q22<? super Float>, Object> {
    final /* synthetic */ float $initialVelocity;
    final /* synthetic */ p9b $this_performFling;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ DefaultFlingBehavior this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DefaultFlingBehavior$performFling$2(float f, DefaultFlingBehavior defaultFlingBehavior, p9b p9bVar, q22<? super DefaultFlingBehavior$performFling$2> q22Var) {
        super(2, q22Var);
        this.$initialVelocity = f;
        this.this$0 = defaultFlingBehavior;
        this.$this_performFling = p9bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(Ref.FloatRef floatRef, p9b p9bVar, Ref.FloatRef floatRef2, DefaultFlingBehavior defaultFlingBehavior, jr jrVar) {
        float fFloatValue = ((Number) jrVar.e()).floatValue() - floatRef.element;
        float fE = p9bVar.e(fFloatValue);
        floatRef.element = ((Number) jrVar.e()).floatValue();
        floatRef2.element = ((Number) jrVar.f()).floatValue();
        if (Math.abs(fFloatValue - fE) > 0.5f) {
            jrVar.a();
        }
        defaultFlingBehavior.g(defaultFlingBehavior.getLastAnimationCycleCount() + 1);
        return Unit.a;
    }

    public final q22<Unit> create(Object obj, q22<?> q22Var) {
        return new DefaultFlingBehavior$performFling$2(this.$initialVelocity, this.this$0, this.$this_performFling, q22Var);
    }

    public final Object invoke(ta2 ta2Var, q22<? super Float> q22Var) {
        return create(ta2Var, q22Var).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        float f;
        AnimationState animationState;
        Ref.FloatRef floatRef;
        Object objG = a.g();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            if (Math.abs(this.$initialVelocity) > 1.0f) {
                final Ref.FloatRef floatRef2 = new Ref.FloatRef();
                floatRef2.element = this.$initialVelocity;
                final Ref.FloatRef floatRef3 = new Ref.FloatRef();
                AnimationState animationStateC = or.c(0.0f, this.$initialVelocity, 0L, 0L, false, 28, null);
                try {
                    vq2 vq2Var = this.this$0.flingDecay;
                    final p9b p9bVar = this.$this_performFling;
                    final DefaultFlingBehavior defaultFlingBehavior = this.this$0;
                    Function1 function1 = new Function1() { // from class: androidx.compose.foundation.gestures.k
                        public final Object invoke(Object obj2) {
                            return DefaultFlingBehavior$performFling$2.l(floatRef3, p9bVar, floatRef2, defaultFlingBehavior, (jr) obj2);
                        }
                    };
                    this.L$0 = floatRef2;
                    this.L$1 = animationStateC;
                    this.label = 1;
                    animationState = animationStateC;
                    try {
                        if (SuspendAnimationKt.v(animationState, vq2Var, false, function1, this, 2, null) == objG) {
                            return objG;
                        }
                        floatRef = floatRef2;
                        f = floatRef.element;
                    } catch (CancellationException unused) {
                        floatRef = floatRef2;
                        floatRef.element = ((Number) animationState.q()).floatValue();
                    }
                } catch (CancellationException unused2) {
                    animationState = animationStateC;
                }
            } else {
                f = this.$initialVelocity;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            animationState = (AnimationState) this.L$1;
            floatRef = (Ref.FloatRef) this.L$0;
            try {
                f.b(obj);
            } catch (CancellationException unused3) {
                floatRef.element = ((Number) animationState.q()).floatValue();
            }
            f = floatRef.element;
        }
        return ut0.d(f);
    }
}
