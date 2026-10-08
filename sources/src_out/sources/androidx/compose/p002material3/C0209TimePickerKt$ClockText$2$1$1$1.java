package androidx.compose.p002material3;

import com.google.android.lq2;
import com.google.android.q22;
import com.google.android.ta2;
import com.google.inputmethod.dwb;
import com.google.inputmethod.g16;
import com.google.inputmethod.o58;
import com.google.inputmethod.rn8;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: androidx.compose.material3.TimePickerKt$ClockText$2$1$1$1, reason: from Kotlin metadata and case insensitive filesystem */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/ta2;", "", "<anonymous>", "(Lcom/google/android/ta2;)V"}, k = 3, mv = {2, 0, 0})
@lq2(c = "androidx.compose.material3.TimePickerKt$ClockText$2$1$1$1", f = "TimePicker.kt", l = {1769}, m = "invokeSuspend")
final class C0209TimePickerKt$ClockText$2$1$1$1 extends SuspendLambda implements Function2<ta2, q22<? super Unit>, Object> {
    final /* synthetic */ boolean $autoSwitchToMinute;
    final /* synthetic */ o58<rn8> $center$delegate;
    final /* synthetic */ float $maxDist;
    final /* synthetic */ o58<g16> $parentCenter$delegate;
    final /* synthetic */ AnalogTimePickerState $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C0209TimePickerKt$ClockText$2$1$1$1(AnalogTimePickerState analogTimePickerState, float f, boolean z, o58<rn8> o58Var, o58<g16> o58Var2, q22<? super C0209TimePickerKt$ClockText$2$1$1$1> q22Var) {
        super(2, q22Var);
        this.$state = analogTimePickerState;
        this.$maxDist = f;
        this.$autoSwitchToMinute = z;
        this.$center$delegate = o58Var;
        this.$parentCenter$delegate = o58Var2;
    }

    public final q22<Unit> create(Object obj, q22<?> q22Var) {
        return new C0209TimePickerKt$ClockText$2$1$1$1(this.$state, this.$maxDist, this.$autoSwitchToMinute, this.$center$delegate, this.$parentCenter$delegate, q22Var);
    }

    public final Object invoke(ta2 ta2Var, q22<? super Unit> q22Var) {
        return create(ta2Var, q22Var).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        Object objG = a.g();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            AnalogTimePickerState analogTimePickerState = this.$state;
            float fIntBitsToFloat = Float.intBitsToFloat((int) (TimePickerKt.M(this.$center$delegate) >> 32));
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (TimePickerKt.M(this.$center$delegate) & 4294967295L));
            float f = this.$maxDist;
            boolean z = this.$autoSwitchToMinute;
            long jO = TimePickerKt.O(this.$parentCenter$delegate);
            dwb dwbVar = new dwb(0, 1, null);
            this.label = 1;
            if (TimePickerKt.j1(analogTimePickerState, fIntBitsToFloat, fIntBitsToFloat2, f, z, jO, dwbVar, this) == objG) {
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
