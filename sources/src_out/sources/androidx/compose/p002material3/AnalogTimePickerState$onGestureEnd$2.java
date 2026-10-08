package androidx.compose.p002material3;

import androidx.compose.p000animation.core.Animatable;
import com.google.android.lq2;
import com.google.android.q22;
import com.google.android.ut0;
import com.google.inputmethod.AnimationResult;
import com.google.inputmethod.kr;
import com.google.inputmethod.qr;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/google/android/ir;", "", "Lcom/google/android/qr;", "<anonymous>", "()Lcom/google/android/ir;"}, k = 3, mv = {2, 0, 0})
@lq2(c = "androidx.compose.material3.AnalogTimePickerState$onGestureEnd$2", f = "TimePicker.kt", l = {804}, m = "invokeSuspend")
final class AnalogTimePickerState$onGestureEnd$2 extends SuspendLambda implements Function1<q22<? super AnimationResult<Float, qr>>, Object> {
    final /* synthetic */ kr<Float> $animationSpec;
    final /* synthetic */ float $end;
    int label;
    final /* synthetic */ AnalogTimePickerState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AnalogTimePickerState$onGestureEnd$2(AnalogTimePickerState analogTimePickerState, float f, kr<Float> krVar, q22<? super AnalogTimePickerState$onGestureEnd$2> q22Var) {
        super(1, q22Var);
        this.this$0 = analogTimePickerState;
        this.$end = f;
        this.$animationSpec = krVar;
    }

    public final q22<Unit> create(q22<?> q22Var) {
        return new AnalogTimePickerState$onGestureEnd$2(this.this$0, this.$end, this.$animationSpec, q22Var);
    }

    public final Object invoke(q22<? super AnimationResult<Float, qr>> q22Var) {
        return create(q22Var).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        Object objG = a.g();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
            return obj;
        }
        f.b(obj);
        Animatable animatable = this.this$0.anim;
        Float fD = ut0.d(this.$end);
        kr<Float> krVar = this.$animationSpec;
        this.label = 1;
        Object objF = Animatable.f(animatable, fD, krVar, null, null, this, 12, null);
        return objF == objG ? objG : objF;
    }
}
