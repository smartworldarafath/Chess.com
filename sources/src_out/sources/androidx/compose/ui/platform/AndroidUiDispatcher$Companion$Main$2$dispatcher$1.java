package androidx.compose.ui.platform;

import android.view.Choreographer;
import com.google.android.lq2;
import com.google.android.q22;
import com.google.android.ta2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/google/android/ta2;", "Landroid/view/Choreographer;", "kotlin.jvm.PlatformType", "<anonymous>", "(Lcom/google/android/ta2;)Landroid/view/Choreographer;"}, k = 3, mv = {2, 1, 0})
@lq2(c = "androidx.compose.ui.platform.AndroidUiDispatcher$Companion$Main$2$dispatcher$1", f = "AndroidUiDispatcher.android.kt", l = {}, m = "invokeSuspend", v = 1)
final class AndroidUiDispatcher$Companion$Main$2$dispatcher$1 extends SuspendLambda implements Function2<ta2, q22<? super Choreographer>, Object> {
    int label;

    AndroidUiDispatcher$Companion$Main$2$dispatcher$1(q22<? super AndroidUiDispatcher$Companion$Main$2$dispatcher$1> q22Var) {
        super(2, q22Var);
    }

    public final q22<Unit> create(Object obj, q22<?> q22Var) {
        return new AndroidUiDispatcher$Companion$Main$2$dispatcher$1(q22Var);
    }

    public final Object invoke(ta2 ta2Var, q22<? super Choreographer> q22Var) {
        return create(ta2Var, q22Var).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        kotlin.coroutines.intrinsics.a.g();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.f.b(obj);
        return Choreographer.getInstance();
    }
}
