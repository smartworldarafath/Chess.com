package androidx.compose.ui.layout;

import com.google.android.lq2;
import com.google.android.q22;
import com.google.android.ta2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/ta2;", "", "<anonymous>", "(Lcom/google/android/ta2;)V"}, k = 3, mv = {2, 1, 0})
@lq2(c = "androidx.compose.ui.layout.OnFirstVisibleNode$startTimer$1", f = "OnFirstVisibleModifier.kt", l = {195}, m = "invokeSuspend", v = 1)
final class OnFirstVisibleNode$startTimer$1 extends SuspendLambda implements Function2<ta2, q22<? super Unit>, Object> {
    final /* synthetic */ long $minDurationMs;
    int label;
    final /* synthetic */ OnFirstVisibleNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OnFirstVisibleNode$startTimer$1(long j, OnFirstVisibleNode onFirstVisibleNode, q22<? super OnFirstVisibleNode$startTimer$1> q22Var) {
        super(2, q22Var);
        this.$minDurationMs = j;
        this.this$0 = onFirstVisibleNode;
    }

    public final q22<Unit> create(Object obj, q22<?> q22Var) {
        return new OnFirstVisibleNode$startTimer$1(this.$minDurationMs, this.this$0, q22Var);
    }

    public final Object invoke(ta2 ta2Var, q22<? super Unit> q22Var) {
        return create(ta2Var, q22Var).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        Object objG = kotlin.coroutines.intrinsics.a.g();
        int i = this.label;
        if (i == 0) {
            kotlin.f.b(obj);
            long j = this.$minDurationMs;
            this.label = 1;
            if (DelayKt.b(j, this) == objG) {
                return objG;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.f.b(obj);
        }
        this.this$0.x3();
        return Unit.a;
    }
}
