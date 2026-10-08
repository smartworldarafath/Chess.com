package androidx.compose.p002material3;

import com.google.android.lq2;
import com.google.android.oq2;
import com.google.android.q22;
import com.google.android.ut0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.e;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@lq2(c = "androidx.compose.material3.TooltipStateImpl$show$cancellableShow$1", f = "Tooltip.kt", l = {1655}, m = "invokeSuspend")
final class TooltipStateImpl$show$cancellableShow$1 extends SuspendLambda implements Function1<q22<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ TooltipStateImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TooltipStateImpl$show$cancellableShow$1(TooltipStateImpl tooltipStateImpl, q22<? super TooltipStateImpl$show$cancellableShow$1> q22Var) {
        super(1, q22Var);
        this.this$0 = tooltipStateImpl;
    }

    public final q22<Unit> create(q22<?> q22Var) {
        return new TooltipStateImpl$show$cancellableShow$1(this.this$0, q22Var);
    }

    public final Object invoke(q22<? super Unit> q22Var) {
        return create(q22Var).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        Object objG = a.g();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            TooltipStateImpl tooltipStateImpl = this.this$0;
            this.L$0 = tooltipStateImpl;
            this.label = 1;
            e eVar = new e(a.d(this), 1);
            eVar.G();
            tooltipStateImpl.a().i(ut0.a(true));
            tooltipStateImpl.job = eVar;
            Object objY = eVar.y();
            if (objY == a.g()) {
                oq2.c(this);
            }
            if (objY == objG) {
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
