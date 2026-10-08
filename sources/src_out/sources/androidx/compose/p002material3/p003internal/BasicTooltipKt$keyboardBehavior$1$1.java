package androidx.compose.p002material3.p003internal;

import androidx.compose.p001foundation.MutatePriority;
import com.google.android.lq2;
import com.google.android.q22;
import com.google.android.ta2;
import com.google.inputmethod.cad;
import com.google.inputmethod.dl4;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/ta2;", "", "<anonymous>", "(Lcom/google/android/ta2;)V"}, k = 3, mv = {2, 0, 0})
@lq2(c = "androidx.compose.material3.internal.BasicTooltipKt$keyboardBehavior$1$1", f = "BasicTooltip.kt", l = {301}, m = "invokeSuspend")
final class BasicTooltipKt$keyboardBehavior$1$1 extends SuspendLambda implements Function2<ta2, q22<? super Unit>, Object> {
    final /* synthetic */ dl4 $it;
    final /* synthetic */ cad $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BasicTooltipKt$keyboardBehavior$1$1(dl4 dl4Var, cad cadVar, q22<? super BasicTooltipKt$keyboardBehavior$1$1> q22Var) {
        super(2, q22Var);
        this.$it = dl4Var;
        this.$state = cadVar;
    }

    public final q22<Unit> create(Object obj, q22<?> q22Var) {
        return new BasicTooltipKt$keyboardBehavior$1$1(this.$it, this.$state, q22Var);
    }

    public final Object invoke(ta2 ta2Var, q22<? super Unit> q22Var) {
        return create(ta2Var, q22Var).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        Object objG = a.g();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            if (this.$it.a()) {
                cad cadVar = this.$state;
                MutatePriority mutatePriority = MutatePriority.PreventUserInput;
                this.label = 1;
                if (cadVar.c(mutatePriority, this) == objG) {
                    return objG;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        }
        if (this.$state.isVisible() && !this.$it.a()) {
            this.$state.dismiss();
        }
        return Unit.a;
    }
}
