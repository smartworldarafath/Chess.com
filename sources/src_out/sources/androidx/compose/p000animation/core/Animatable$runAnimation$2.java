package androidx.compose.p000animation.core;

import com.google.android.lq2;
import com.google.android.q22;
import com.google.inputmethod.AnimationResult;
import com.google.inputmethod.AnimationState;
import com.google.inputmethod.jr;
import com.google.inputmethod.or;
import com.google.inputmethod.ur;
import com.google.inputmethod.zq;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* JADX INFO: Add missing generic type declarations: [T, V] */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lcom/google/android/ur;", "V", "Lcom/google/android/ir;", "<anonymous>", "()Lcom/google/android/ir;"}, k = 3, mv = {2, 1, 0})
@lq2(c = "androidx.compose.animation.core.Animatable$runAnimation$2", f = "Animatable.kt", l = {308}, m = "invokeSuspend", v = 1)
final class Animatable$runAnimation$2<T, V> extends SuspendLambda implements Function1<q22<? super AnimationResult<T, V>>, Object> {
    final /* synthetic */ zq<T, V> $animation;
    final /* synthetic */ Function1<Animatable<T, V>, Unit> $block;
    final /* synthetic */ T $initialVelocity;
    final /* synthetic */ long $startTime;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ Animatable<T, V> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    Animatable$runAnimation$2(Animatable<T, V> animatable, T t, zq<T, V> zqVar, long j, Function1<? super Animatable<T, V>, Unit> function1, q22<? super Animatable$runAnimation$2> q22Var) {
        super(1, q22Var);
        this.this$0 = animatable;
        this.$initialVelocity = t;
        this.$animation = zqVar;
        this.$startTime = j;
        this.$block = function1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit l(Animatable animatable, AnimationState animationState, Function1 function1, Ref.BooleanRef booleanRef, jr jrVar) {
        SuspendAnimationKt.F(jrVar, animatable.j());
        Object objH = animatable.h(jrVar.e());
        if (!Intrinsics.e(objH, jrVar.e())) {
            animatable.j().B(objH);
            animationState.B(objH);
            if (function1 != null) {
                function1.invoke(animatable);
            }
            jrVar.a();
            booleanRef.element = true;
        } else if (function1 != null) {
            function1.invoke(animatable);
        }
        return Unit.a;
    }

    public final q22<Unit> create(q22<?> q22Var) {
        return new Animatable$runAnimation$2(this.this$0, this.$initialVelocity, this.$animation, this.$startTime, this.$block, q22Var);
    }

    public final Object invoke(q22<? super AnimationResult<T, V>> q22Var) {
        return create(q22Var).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        AnimationState animationState;
        Ref.BooleanRef booleanRef;
        Object objG = a.g();
        int i = this.label;
        try {
            if (i == 0) {
                f.b(obj);
                this.this$0.j().F((ur) this.this$0.l().a().invoke(this.$initialVelocity));
                this.this$0.s(this.$animation.f());
                this.this$0.r(true);
                final AnimationState animationStateH = or.h(this.this$0.j(), null, null, 0L, Long.MIN_VALUE, false, 23, null);
                final Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
                zq<T, V> zqVar = this.$animation;
                long j = this.$startTime;
                final Animatable<T, V> animatable = this.this$0;
                final Function1<Animatable<T, V>, Unit> function1 = this.$block;
                Function1 function2 = new Function1() { // from class: androidx.compose.animation.core.a
                    public final Object invoke(Object obj2) {
                        return Animatable$runAnimation$2.l(animatable, animationStateH, function1, booleanRef2, (jr) obj2);
                    }
                };
                this.L$0 = animationStateH;
                this.L$1 = booleanRef2;
                this.label = 1;
                if (SuspendAnimationKt.k(animationStateH, zqVar, j, function2, this) == objG) {
                    return objG;
                }
                animationState = animationStateH;
                booleanRef = booleanRef2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                booleanRef = (Ref.BooleanRef) this.L$1;
                animationState = (AnimationState) this.L$0;
                f.b(obj);
            }
            AnimationEndReason animationEndReason = booleanRef.element ? AnimationEndReason.BoundReached : AnimationEndReason.Finished;
            this.this$0.i();
            return new AnimationResult(animationState, animationEndReason);
        } catch (CancellationException e) {
            this.this$0.i();
            throw e;
        }
    }
}
