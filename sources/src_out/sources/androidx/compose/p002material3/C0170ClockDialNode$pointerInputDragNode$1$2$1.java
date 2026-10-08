package androidx.compose.p002material3;

import com.google.android.lq2;
import com.google.android.q22;
import com.google.android.ta2;
import com.google.inputmethod.g16;
import com.google.inputmethod.kr;
import com.google.inputmethod.rn8;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: androidx.compose.material3.ClockDialNode$pointerInputDragNode$1$2$1, reason: from Kotlin metadata and case insensitive filesystem */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/ta2;", "", "<anonymous>", "(Lcom/google/android/ta2;)V"}, k = 3, mv = {2, 0, 0})
@lq2(c = "androidx.compose.material3.ClockDialNode$pointerInputDragNode$1$2$1", f = "TimePicker.kt", l = {1539}, m = "invokeSuspend")
final class C0170ClockDialNode$pointerInputDragNode$1$2$1 extends SuspendLambda implements Function2<ta2, q22<? super Unit>, Object> {
    final /* synthetic */ rn8 $dragAmount;
    int label;
    final /* synthetic */ ClockDialNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C0170ClockDialNode$pointerInputDragNode$1$2$1(ClockDialNode clockDialNode, rn8 rn8Var, q22<? super C0170ClockDialNode$pointerInputDragNode$1$2$1> q22Var) {
        super(2, q22Var);
        this.this$0 = clockDialNode;
        this.$dragAmount = rn8Var;
    }

    public final q22<Unit> create(Object obj, q22<?> q22Var) {
        return new C0170ClockDialNode$pointerInputDragNode$1$2$1(this.this$0, this.$dragAmount, q22Var);
    }

    public final Object invoke(ta2 ta2Var, q22<? super Unit> q22Var) {
        return create(ta2Var, q22Var).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        C0170ClockDialNode$pointerInputDragNode$1$2$1 c0170ClockDialNode$pointerInputDragNode$1$2$1;
        Object objG = a.g();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            this.this$0.offsetX += Float.intBitsToFloat((int) (this.$dragAmount.getPackedValue() >> 32));
            this.this$0.offsetY += Float.intBitsToFloat((int) (this.$dragAmount.getPackedValue() & 4294967295L));
            AnalogTimePickerState analogTimePickerState = this.this$0.state;
            float fY0 = TimePickerKt.Y0(this.this$0.offsetY - g16.l(this.this$0.B3()), this.this$0.offsetX - g16.k(this.this$0.B3()));
            kr krVar = this.this$0.animationSpec;
            this.label = 1;
            c0170ClockDialNode$pointerInputDragNode$1$2$1 = this;
            if (AnalogTimePickerState.B(analogTimePickerState, fY0, krVar, false, c0170ClockDialNode$pointerInputDragNode$1$2$1, 4, null) == objG) {
                return objG;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
            c0170ClockDialNode$pointerInputDragNode$1$2$1 = this;
        }
        TimePickerKt.h1(c0170ClockDialNode$pointerInputDragNode$1$2$1.this$0.state, c0170ClockDialNode$pointerInputDragNode$1$2$1.this$0.offsetX, c0170ClockDialNode$pointerInputDragNode$1$2$1.this$0.offsetY, c0170ClockDialNode$pointerInputDragNode$1$2$1.this$0.C3(), c0170ClockDialNode$pointerInputDragNode$1$2$1.this$0.B3());
        return Unit.a;
    }
}
