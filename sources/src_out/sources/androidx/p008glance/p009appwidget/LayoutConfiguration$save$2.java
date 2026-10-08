package androidx.p008glance.p009appwidget;

import com.google.android.lq2;
import com.google.android.q22;
import com.google.android.ut0;
import com.google.inputmethod.jo6;
import com.google.inputmethod.ko6;
import com.google.inputmethod.lo6;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/jo6;", "config", "<anonymous>", "(Lcom/google/android/jo6;)Lcom/google/android/jo6;"}, k = 3, mv = {1, 8, 0})
@lq2(c = "androidx.glance.appwidget.LayoutConfiguration$save$2", f = "WidgetLayout.kt", l = {}, m = "invokeSuspend")
final class LayoutConfiguration$save$2 extends SuspendLambda implements Function2<jo6, q22<? super jo6>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ LayoutConfiguration this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LayoutConfiguration$save$2(LayoutConfiguration layoutConfiguration, q22<? super LayoutConfiguration$save$2> q22Var) {
        super(2, q22Var);
        this.this$0 = layoutConfiguration;
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(jo6 jo6Var, q22<? super jo6> q22Var) {
        return create(jo6Var, q22Var).invokeSuspend(Unit.a);
    }

    public final q22<Unit> create(Object obj, q22<?> q22Var) {
        LayoutConfiguration$save$2 layoutConfiguration$save$2 = new LayoutConfiguration$save$2(this.this$0, q22Var);
        layoutConfiguration$save$2.L$0 = obj;
        return layoutConfiguration$save$2;
    }

    public final Object invokeSuspend(Object obj) {
        a.g();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        jo6.a builder = ((jo6) this.L$0).toBuilder();
        LayoutConfiguration layoutConfiguration = this.this$0;
        jo6.a aVar = builder;
        aVar.u(aVar.t());
        aVar.s();
        for (Map.Entry entry : layoutConfiguration.layoutConfig.entrySet()) {
            lo6 lo6Var = (lo6) entry.getKey();
            int iIntValue = ((Number) entry.getValue()).intValue();
            if (layoutConfiguration.usedLayoutIds.contains(ut0.e(iIntValue))) {
                ko6.a aVarQ = ko6.Q();
                aVarQ.r(lo6Var);
                aVarQ.s(iIntValue);
                aVar.r(aVarQ);
            }
        }
        return aVar.build();
    }
}
