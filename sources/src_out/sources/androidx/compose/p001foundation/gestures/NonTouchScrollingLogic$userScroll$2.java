package androidx.compose.p001foundation.gestures;

import androidx.compose.p001foundation.MutatePriority;
import com.google.android.lq2;
import com.google.android.q22;
import com.google.android.ta2;
import com.google.inputmethod.ve8;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/ta2;", "", "<anonymous>", "(Lcom/google/android/ta2;)V"}, k = 3, mv = {2, 1, 0})
@lq2(c = "androidx.compose.foundation.gestures.NonTouchScrollingLogic$userScroll$2", f = "NonTouchScrollingLogic.kt", l = {55}, m = "invokeSuspend", v = 1)
final class NonTouchScrollingLogic$userScroll$2 extends SuspendLambda implements Function2<ta2, q22<? super Unit>, Object> {
    final /* synthetic */ Function2<ve8, q22<? super Unit>, Object> $block;
    int label;
    final /* synthetic */ NonTouchScrollingLogic this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    NonTouchScrollingLogic$userScroll$2(NonTouchScrollingLogic nonTouchScrollingLogic, Function2<? super ve8, ? super q22<? super Unit>, ? extends Object> function2, q22<? super NonTouchScrollingLogic$userScroll$2> q22Var) {
        super(2, q22Var);
        this.this$0 = nonTouchScrollingLogic;
        this.$block = function2;
    }

    public final q22<Unit> create(Object obj, q22<?> q22Var) {
        return new NonTouchScrollingLogic$userScroll$2(this.this$0, this.$block, q22Var);
    }

    public final Object invoke(ta2 ta2Var, q22<? super Unit> q22Var) {
        return create(ta2Var, q22Var).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        Object objG = a.g();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            ScrollingLogic scrollingLogicD = this.this$0.getScrollingLogic();
            MutatePriority mutatePriority = MutatePriority.UserInput;
            Function2<ve8, q22<? super Unit>, Object> function2 = this.$block;
            this.label = 1;
            if (scrollingLogicD.B(mutatePriority, function2, this) == objG) {
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
