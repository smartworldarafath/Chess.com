package androidx.compose.p002material3;

import com.google.android.lq2;
import com.google.android.q22;
import com.google.android.ta2;
import com.google.android.ut0;
import com.google.inputmethod.aca;
import com.google.inputmethod.j7d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: androidx.compose.material3.TimePickerKt$TimePicker$1$1, reason: from Kotlin metadata and case insensitive filesystem */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/ta2;", "", "<anonymous>", "(Lcom/google/android/ta2;)V"}, k = 3, mv = {2, 0, 0})
@lq2(c = "androidx.compose.material3.TimePickerKt$TimePicker$1$1", f = "TimePicker.kt", l = {}, m = "invokeSuspend")
final class C0210TimePickerKt$TimePicker$1$1 extends SuspendLambda implements Function2<ta2, q22<? super Unit>, Object> {
    final /* synthetic */ AnalogTimePickerState $analogState;
    final /* synthetic */ j7d $state;
    final /* synthetic */ aca<Boolean> $userOverride;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C0210TimePickerKt$TimePicker$1$1(aca<Boolean> acaVar, AnalogTimePickerState analogTimePickerState, j7d j7dVar, q22<? super C0210TimePickerKt$TimePicker$1$1> q22Var) {
        super(2, q22Var);
        this.$userOverride = acaVar;
        this.$analogState = analogTimePickerState;
        this.$state = j7dVar;
    }

    public final q22<Unit> create(Object obj, q22<?> q22Var) {
        return new C0210TimePickerKt$TimePicker$1$1(this.$userOverride, this.$analogState, this.$state, q22Var);
    }

    public final Object invoke(ta2 ta2Var, q22<? super Unit> q22Var) {
        return create(ta2Var, q22Var).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        a.g();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        if (Intrinsics.e(this.$userOverride.a(), ut0.a(true))) {
            this.$analogState.d(this.$state.a());
            this.$analogState.e(this.$state.f());
        }
        this.$userOverride.b(ut0.a(true));
        return Unit.a;
    }
}
