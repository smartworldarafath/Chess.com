package androidx.compose.p001foundation.gestures;

import androidx.compose.ui.input.pointer.PointerInputChange;
import com.google.android.lq2;
import com.google.android.ps4;
import com.google.android.q22;
import com.google.android.ta2;
import com.google.inputmethod.ml9;
import com.google.inputmethod.rn8;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/ta2;", "", "<anonymous>", "(Lcom/google/android/ta2;)V"}, k = 3, mv = {2, 1, 0})
@lq2(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$processTapGesture$2", f = "TapGestureDetector.kt", l = {136}, m = "invokeSuspend", v = 1)
final class TapGestureDetectorKt$processTapGesture$2 extends SuspendLambda implements Function2<ta2, q22<? super Unit>, Object> {
    final /* synthetic */ PointerInputChange $down;
    final /* synthetic */ ps4<ml9, rn8, q22<? super Unit>, Object> $onPress;
    final /* synthetic */ PressGestureScopeImpl $pressScope;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    TapGestureDetectorKt$processTapGesture$2(ps4<? super ml9, ? super rn8, ? super q22<? super Unit>, ? extends Object> ps4Var, PressGestureScopeImpl pressGestureScopeImpl, PointerInputChange pointerInputChange, q22<? super TapGestureDetectorKt$processTapGesture$2> q22Var) {
        super(2, q22Var);
        this.$onPress = ps4Var;
        this.$pressScope = pressGestureScopeImpl;
        this.$down = pointerInputChange;
    }

    public final q22<Unit> create(Object obj, q22<?> q22Var) {
        return new TapGestureDetectorKt$processTapGesture$2(this.$onPress, this.$pressScope, this.$down, q22Var);
    }

    public final Object invoke(ta2 ta2Var, q22<? super Unit> q22Var) {
        return create(ta2Var, q22Var).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        Object objG = a.g();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            ps4<ml9, rn8, q22<? super Unit>, Object> ps4Var = this.$onPress;
            PressGestureScopeImpl pressGestureScopeImpl = this.$pressScope;
            rn8 rn8VarD = rn8.d(this.$down.getPosition());
            this.label = 1;
            if (ps4Var.invoke(pressGestureScopeImpl, rn8VarD, this) == objG) {
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
