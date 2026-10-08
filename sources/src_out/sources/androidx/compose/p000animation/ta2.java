package androidx.compose.p000animation;

import androidx.compose.p000animation.core.Animatable;
import com.google.android.lq2;
import com.google.android.q22;
import com.google.inputmethod.gba;
import com.google.inputmethod.it0;
import com.google.inputmethod.tr;
import com.google.inputmethod.xa4;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: androidx.compose.animation.BoundsTransformDeferredAnimation$animate$1, reason: from Kotlin metadata */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/ta2;", "", "<anonymous>", "(Lcom/google/android/ta2;)V"}, k = 3, mv = {2, 1, 0})
@lq2(c = "androidx.compose.animation.BoundsTransformDeferredAnimation$animate$1", f = "AnimateBoundsModifier.kt", l = {537}, m = "invokeSuspend", v = 1)
final class ta2 extends SuspendLambda implements Function2<com.google.android.ta2, q22<? super Unit>, Object> {
    final /* synthetic */ Animatable<gba, tr> $anim;
    final /* synthetic */ it0 $boundsTransform;
    final /* synthetic */ gba $target;
    int label;
    final /* synthetic */ BoundsTransformDeferredAnimation this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ta2(Animatable<gba, tr> animatable, gba gbaVar, it0 it0Var, BoundsTransformDeferredAnimation boundsTransformDeferredAnimation, q22<? super ta2> q22Var) {
        super(2, q22Var);
        this.$anim = animatable;
        this.$target = gbaVar;
        this.$boundsTransform = it0Var;
        this.this$0 = boundsTransformDeferredAnimation;
    }

    public final q22<Unit> create(Object obj, q22<?> q22Var) {
        return new ta2(this.$anim, this.$target, this.$boundsTransform, this.this$0, q22Var);
    }

    public final Object invoke(com.google.android.ta2 ta2Var, q22<? super Unit> q22Var) {
        return create(ta2Var, q22Var).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        Object objG = a.g();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            Animatable<gba, tr> animatable = this.$anim;
            gba gbaVar = this.$target;
            it0 it0Var = this.$boundsTransform;
            gba gbaVarC = this.this$0.c();
            Intrinsics.g(gbaVarC);
            xa4<gba> xa4VarA = it0Var.a(gbaVarC, this.$target);
            this.label = 1;
            if (Animatable.f(animatable, gbaVar, xa4VarA, null, null, this, 12, null) == objG) {
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
