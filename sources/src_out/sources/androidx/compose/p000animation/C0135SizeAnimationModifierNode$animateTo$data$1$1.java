package androidx.compose.p000animation;

import androidx.compose.p000animation.core.Animatable;
import androidx.compose.p000animation.core.AnimationEndReason;
import com.google.android.lq2;
import com.google.android.q22;
import com.google.android.ta2;
import com.google.inputmethod.AnimationResult;
import com.google.inputmethod.kr;
import com.google.inputmethod.q16;
import com.google.inputmethod.rr;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: androidx.compose.animation.SizeAnimationModifierNode$animateTo$data$1$1, reason: from Kotlin metadata and case insensitive filesystem */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/ta2;", "", "<anonymous>", "(Lcom/google/android/ta2;)V"}, k = 3, mv = {2, 1, 0})
@lq2(c = "androidx.compose.animation.SizeAnimationModifierNode$animateTo$data$1$1", f = "AnimationModifier.kt", l = {242}, m = "invokeSuspend", v = 1)
final class C0135SizeAnimationModifierNode$animateTo$data$1$1 extends SuspendLambda implements Function2<ta2, q22<? super Unit>, Object> {
    final /* synthetic */ long $targetSize;
    final /* synthetic */ SizeAnimationModifierNode.AnimData $this_apply;
    int label;
    final /* synthetic */ SizeAnimationModifierNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C0135SizeAnimationModifierNode$animateTo$data$1$1(SizeAnimationModifierNode.AnimData aVar, long j, SizeAnimationModifierNode sizeAnimationModifierNode, q22<? super C0135SizeAnimationModifierNode$animateTo$data$1$1> q22Var) {
        super(2, q22Var);
        this.$this_apply = aVar;
        this.$targetSize = j;
        this.this$0 = sizeAnimationModifierNode;
    }

    public final q22<Unit> create(Object obj, q22<?> q22Var) {
        return new C0135SizeAnimationModifierNode$animateTo$data$1$1(this.$this_apply, this.$targetSize, this.this$0, q22Var);
    }

    public final Object invoke(ta2 ta2Var, q22<? super Unit> q22Var) {
        return create(ta2Var, q22Var).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        C0135SizeAnimationModifierNode$animateTo$data$1$1 c0135SizeAnimationModifierNode$animateTo$data$1$1;
        Function2<q16, q16, Unit> function2Q3;
        Object objG = a.g();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            Animatable<q16, rr> animatableA = this.$this_apply.a();
            q16 q16VarB = q16.b(this.$targetSize);
            kr<q16> krVarP3 = this.this$0.p3();
            this.label = 1;
            c0135SizeAnimationModifierNode$animateTo$data$1$1 = this;
            obj = Animatable.f(animatableA, q16VarB, krVarP3, null, null, c0135SizeAnimationModifierNode$animateTo$data$1$1, 12, null);
            if (obj == objG) {
                return objG;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
            c0135SizeAnimationModifierNode$animateTo$data$1$1 = this;
        }
        AnimationResult animationResult = (AnimationResult) obj;
        if (animationResult.getEndReason() == AnimationEndReason.Finished && (function2Q3 = c0135SizeAnimationModifierNode$animateTo$data$1$1.this$0.q3()) != null) {
            function2Q3.invoke(q16.b(c0135SizeAnimationModifierNode$animateTo$data$1$1.$this_apply.getStartSize()), animationResult.b().getValue());
        }
        return Unit.a;
    }
}
