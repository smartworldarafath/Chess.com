package androidx.compose.p002material3;

import com.google.android.lq2;
import com.google.android.q22;
import com.google.inputmethod.kr;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0000\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@lq2(c = "androidx.compose.material3.AnalogTimePickerState$rotateTo$2", f = "TimePicker.kt", l = {823, 826}, m = "invokeSuspend")
final class AnalogTimePickerState$rotateTo$2 extends SuspendLambda implements Function1<q22<? super Object>, Object> {
    final /* synthetic */ float $angle;
    final /* synthetic */ boolean $animate;
    final /* synthetic */ kr<Float> $animationSpec;
    int label;
    final /* synthetic */ AnalogTimePickerState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AnalogTimePickerState$rotateTo$2(AnalogTimePickerState analogTimePickerState, float f, boolean z, kr<Float> krVar, q22<? super AnalogTimePickerState$rotateTo$2> q22Var) {
        super(1, q22Var);
        this.this$0 = analogTimePickerState;
        this.$angle = f;
        this.$animate = z;
        this.$animationSpec = krVar;
    }

    public final q22<Unit> create(q22<?> q22Var) {
        return new AnalogTimePickerState$rotateTo$2(this.this$0, this.$angle, this.$animate, this.$animationSpec, q22Var);
    }

    public final Object invoke(q22<Object> q22Var) {
        return create(q22Var).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a6, code lost:
    
        if (r12.t(r1, r11) == r0) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002material3.AnalogTimePickerState$rotateTo$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
