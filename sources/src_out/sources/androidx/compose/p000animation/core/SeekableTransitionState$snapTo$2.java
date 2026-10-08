package androidx.compose.p000animation.core;

import com.google.android.lq2;
import com.google.android.q22;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
@lq2(c = "androidx.compose.animation.core.SeekableTransitionState$snapTo$2", f = "Transition.kt", l = {465}, m = "invokeSuspend", v = 1)
final class SeekableTransitionState$snapTo$2 extends SuspendLambda implements Function1<q22<? super Unit>, Object> {
    final /* synthetic */ S $targetState;
    final /* synthetic */ Transition<S> $transition;
    int label;
    final /* synthetic */ SeekableTransitionState<S> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SeekableTransitionState$snapTo$2(SeekableTransitionState<S> seekableTransitionState, S s, Transition<S> transition, q22<? super SeekableTransitionState$snapTo$2> q22Var) {
        super(1, q22Var);
        this.this$0 = seekableTransitionState;
        this.$targetState = s;
        this.$transition = transition;
    }

    public final q22<Unit> create(q22<?> q22Var) {
        return new SeekableTransitionState$snapTo$2(this.this$0, this.$targetState, this.$transition, q22Var);
    }

    public final Object invoke(q22<? super Unit> q22Var) {
        return create(q22Var).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final Object invokeSuspend(Object obj) {
        float f;
        Object objG = a.g();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            this.this$0.E();
            ((SeekableTransitionState) this.this$0).lastFrameTimeNanos = Long.MIN_VALUE;
            this.this$0.W(0.0f);
            S s = this.$targetState;
            if (Intrinsics.e(s, this.this$0.a())) {
                f = -4.0f;
            } else {
                f = Intrinsics.e(s, this.this$0.b()) ? -5.0f : -3.0f;
            }
            this.$transition.Y(this.$targetState);
            this.$transition.P(0L);
            this.this$0.Y(this.$targetState);
            this.this$0.W(0.0f);
            this.this$0.d(this.$targetState);
            this.$transition.L(f);
            if (f == -3.0f) {
                SeekableTransitionState<S> seekableTransitionState = this.this$0;
                this.label = 1;
                if (seekableTransitionState.b0(this) == objG) {
                    return objG;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        }
        this.$transition.G();
        return Unit.a;
    }
}
