package androidx.compose.ui.platform;

import com.google.android.lq2;
import com.google.android.q22;
import com.google.android.r6c;
import com.google.android.ta2;
import com.google.android.ui4;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/ta2;", "", "<anonymous>", "(Lcom/google/android/ta2;)V"}, k = 3, mv = {2, 1, 0})
@lq2(c = "androidx.compose.ui.platform.MotionDurationScaleImpl$startObservingSystemScaleFactor$1", f = "WindowRecomposer.android.kt", l = {446}, m = "invokeSuspend", v = 1)
final class MotionDurationScaleImpl$startObservingSystemScaleFactor$1 extends SuspendLambda implements Function2<ta2, q22<? super Unit>, Object> {
    final /* synthetic */ r6c<Float> $durationScaleStateFlow;
    int label;
    final /* synthetic */ MotionDurationScaleImpl this$0;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "scaleFactor", "", "a", "(FLcom/google/android/q22;)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
    static final class a<T> implements ui4 {
        final /* synthetic */ MotionDurationScaleImpl a;

        a(MotionDurationScaleImpl motionDurationScaleImpl) {
            this.a = motionDurationScaleImpl;
        }

        public final Object a(float f, q22<? super Unit> q22Var) {
            this.a.f(f);
            return Unit.a;
        }

        public /* bridge */ /* synthetic */ Object emit(Object obj, q22 q22Var) {
            return a(((Number) obj).floatValue(), q22Var);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MotionDurationScaleImpl$startObservingSystemScaleFactor$1(r6c<Float> r6cVar, MotionDurationScaleImpl motionDurationScaleImpl, q22<? super MotionDurationScaleImpl$startObservingSystemScaleFactor$1> q22Var) {
        super(2, q22Var);
        this.$durationScaleStateFlow = r6cVar;
        this.this$0 = motionDurationScaleImpl;
    }

    public final q22<Unit> create(Object obj, q22<?> q22Var) {
        return new MotionDurationScaleImpl$startObservingSystemScaleFactor$1(this.$durationScaleStateFlow, this.this$0, q22Var);
    }

    public final Object invoke(ta2 ta2Var, q22<? super Unit> q22Var) {
        return create(ta2Var, q22Var).invokeSuspend(Unit.a);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final Object invokeSuspend(Object obj) throws KotlinNothingValueException {
        Object objG = kotlin.coroutines.intrinsics.a.g();
        int i = this.label;
        if (i == 0) {
            kotlin.f.b(obj);
            r6c<Float> r6cVar = this.$durationScaleStateFlow;
            a aVar = new a(this.this$0);
            this.label = 1;
            if (r6cVar.collect(aVar, this) == objG) {
                return objG;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.f.b(obj);
        }
        throw new KotlinNothingValueException();
    }
}
