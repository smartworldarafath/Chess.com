package androidx.datastore.p007core;

import com.google.android.lq2;
import com.google.android.q22;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: androidx.datastore.core.SingleProcessCoordinator$updateNotifications$1, reason: from Kotlin metadata */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/ui4;", "", "<anonymous>", "(Lcom/google/android/ui4;)V"}, k = 3, mv = {2, 0, 0})
@lq2(c = "androidx.datastore.core.SingleProcessCoordinator$updateNotifications$1", f = "SingleProcessCoordinator.kt", l = {}, m = "invokeSuspend", v = 1)
final class ui4 extends SuspendLambda implements Function2<com.google.android.ui4<? super Unit>, q22<? super Unit>, Object> {
    int label;

    ui4(q22<? super ui4> q22Var) {
        super(2, q22Var);
    }

    public final q22<Unit> create(Object obj, q22<?> q22Var) {
        return new ui4(q22Var);
    }

    public final Object invoke(com.google.android.ui4<? super Unit> ui4Var, q22<? super Unit> q22Var) {
        return create(ui4Var, q22Var).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        a.g();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        return Unit.a;
    }
}
