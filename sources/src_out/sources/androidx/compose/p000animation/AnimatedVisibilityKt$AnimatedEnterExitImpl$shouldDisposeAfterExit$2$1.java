package androidx.compose.p000animation;

import androidx.compose.p000animation.core.Transition;
import androidx.compose.p004runtime.p0;
import com.google.android.ai4;
import com.google.android.lq2;
import com.google.android.q22;
import com.google.android.ui4;
import com.google.android.ut0;
import com.google.inputmethod.io9;
import com.google.inputmethod.q6c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/google/android/io9;", "", "", "<anonymous>", "(Lcom/google/android/io9;)V"}, k = 3, mv = {2, 1, 0})
@lq2(c = "androidx.compose.animation.AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1", f = "AnimatedVisibility.kt", l = {746}, m = "invokeSuspend", v = 1)
final class AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1 extends SuspendLambda implements Function2<io9<Boolean>, q22<? super Unit>, Object> {
    final /* synthetic */ Transition<EnterExitState> $childTransition;
    final /* synthetic */ q6c<Function2<EnterExitState, EnterExitState, Boolean>> $shouldDisposeBlockUpdated$delegate;
    private /* synthetic */ Object L$0;
    int label;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", "a", "(ZLcom/google/android/q22;)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
    static final class a<T> implements ui4 {
        final /* synthetic */ io9<Boolean> a;
        final /* synthetic */ Transition<EnterExitState> b;
        final /* synthetic */ q6c<Function2<EnterExitState, EnterExitState, Boolean>> c;

        a(io9<Boolean> io9Var, Transition<EnterExitState> transition, q6c<? extends Function2<? super EnterExitState, ? super EnterExitState, Boolean>> q6cVar) {
            this.a = io9Var;
            this.b = transition;
            this.c = q6cVar;
        }

        public final Object a(boolean z, q22<? super Unit> q22Var) {
            this.a.setValue(ut0.a(z ? ((Boolean) AnimatedVisibilityKt.b(this.c).invoke(this.b.p(), this.b.w())).booleanValue() : false));
            return Unit.a;
        }

        public /* bridge */ /* synthetic */ Object emit(Object obj, q22 q22Var) {
            return a(((Boolean) obj).booleanValue(), q22Var);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1(Transition<EnterExitState> transition, q6c<? extends Function2<? super EnterExitState, ? super EnterExitState, Boolean>> q6cVar, q22<? super AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1> q22Var) {
        super(2, q22Var);
        this.$childTransition = transition;
        this.$shouldDisposeBlockUpdated$delegate = q6cVar;
    }

    public final q22<Unit> create(Object obj, q22<?> q22Var) {
        AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1 animatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1 = new AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1(this.$childTransition, this.$shouldDisposeBlockUpdated$delegate, q22Var);
        animatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1.L$0 = obj;
        return animatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1;
    }

    public final Object invoke(io9<Boolean> io9Var, q22<? super Unit> q22Var) {
        return create(io9Var, q22Var).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        Object objG = kotlin.coroutines.intrinsics.a.g();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            io9 io9Var = (io9) this.L$0;
            final Transition<EnterExitState> transition = this.$childTransition;
            ai4 ai4VarS = p0.s(new Function0<Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                public final Boolean m1invoke() {
                    return Boolean.valueOf(AnimatedVisibilityKt.m(transition));
                }
            });
            a aVar = new a(io9Var, this.$childTransition, this.$shouldDisposeBlockUpdated$delegate);
            this.label = 1;
            if (ai4VarS.collect(aVar, this) == objG) {
                return objG;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        }
        return Unit.a;
    }
}
