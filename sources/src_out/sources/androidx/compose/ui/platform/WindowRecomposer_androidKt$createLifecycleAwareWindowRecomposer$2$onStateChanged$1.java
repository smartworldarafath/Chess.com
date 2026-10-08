package androidx.compose.ui.platform;

import androidx.compose.p004runtime.Recomposer;
import com.google.android.lq2;
import com.google.android.q22;
import com.google.android.ta2;
import com.google.inputmethod.n17;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/ta2;", "", "<anonymous>", "(Lcom/google/android/ta2;)V"}, k = 3, mv = {2, 1, 0})
@lq2(c = "androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1", f = "WindowRecomposer.android.kt", l = {379}, m = "invokeSuspend", v = 1)
final class WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1 extends SuspendLambda implements Function2<ta2, q22<? super Unit>, Object> {
    final /* synthetic */ Ref.ObjectRef<MotionDurationScaleImpl> $motionDurationScaleImpl;
    final /* synthetic */ Recomposer $recomposer;
    final /* synthetic */ WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2 $self;
    final /* synthetic */ n17 $source;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1(Ref.ObjectRef<MotionDurationScaleImpl> objectRef, Recomposer recomposer, n17 n17Var, WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2 windowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2, q22<? super WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1> q22Var) {
        super(2, q22Var);
        this.$motionDurationScaleImpl = objectRef;
        this.$recomposer = recomposer;
        this.$source = n17Var;
        this.$self = windowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2;
    }

    public final q22<Unit> create(Object obj, q22<?> q22Var) {
        return new WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1(this.$motionDurationScaleImpl, this.$recomposer, this.$source, this.$self, q22Var);
    }

    public final Object invoke(ta2 ta2Var, q22<? super Unit> q22Var) {
        return create(ta2Var, q22Var).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        Object objG = kotlin.coroutines.intrinsics.a.g();
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.f.b(obj);
                MotionDurationScaleImpl motionDurationScaleImpl = (MotionDurationScaleImpl) this.$motionDurationScaleImpl.element;
                if (motionDurationScaleImpl != null) {
                    motionDurationScaleImpl.e(kotlinx.coroutines.j.a(this.$recomposer.getEffectCoroutineContext()));
                }
                Recomposer recomposer = this.$recomposer;
                this.label = 1;
                if (recomposer.X0(this) == objG) {
                    return objG;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.f.b(obj);
            }
            this.$source.getLifecycle().g(this.$self);
            return Unit.a;
        } catch (Throwable th) {
            this.$source.getLifecycle().g(this.$self);
            throw th;
        }
    }
}
