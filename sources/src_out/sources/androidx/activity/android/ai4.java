package androidx.activity.android;

import com.google.android.lq2;
import com.google.android.q22;
import com.google.inputmethod.BackEventCompat;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: androidx.activity.compose.ComposePredictiveBackHandler$currentOnBack$1, reason: from Kotlin metadata */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/google/android/ai4;", "Lcom/google/android/tc0;", "it", "", "<anonymous>", "(Lcom/google/android/ai4;)V"}, k = 3, mv = {2, 1, 0})
@lq2(c = "androidx.activity.compose.ComposePredictiveBackHandler$currentOnBack$1", f = "PredictiveBackHandler.kt", l = {}, m = "invokeSuspend", v = 1)
final class ai4 extends SuspendLambda implements Function2<com.google.android.ai4<? extends BackEventCompat>, q22<? super Unit>, Object> {
    int label;

    ai4(q22<? super ai4> q22Var) {
        super(2, q22Var);
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(com.google.android.ai4<BackEventCompat> ai4Var, q22<? super Unit> q22Var) {
        return create(ai4Var, q22Var).invokeSuspend(Unit.a);
    }

    public final q22<Unit> create(Object obj, q22<?> q22Var) {
        return new ai4(q22Var);
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
