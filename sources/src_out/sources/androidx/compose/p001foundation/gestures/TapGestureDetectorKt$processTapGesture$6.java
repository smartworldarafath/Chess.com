package androidx.compose.p001foundation.gestures;

import com.google.android.lq2;
import com.google.android.q22;
import com.google.android.ta2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.s;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/ta2;", "", "<anonymous>", "(Lcom/google/android/ta2;)V"}, k = 3, mv = {2, 1, 0})
@lq2(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$processTapGesture$6", f = "TapGestureDetector.kt", l = {184, 185}, m = "invokeSuspend", v = 1)
final class TapGestureDetectorKt$processTapGesture$6 extends SuspendLambda implements Function2<ta2, q22<? super Unit>, Object> {
    final /* synthetic */ s $cancelOrReleaseJob;
    final /* synthetic */ PressGestureScopeImpl $pressScope;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TapGestureDetectorKt$processTapGesture$6(s sVar, PressGestureScopeImpl pressGestureScopeImpl, q22<? super TapGestureDetectorKt$processTapGesture$6> q22Var) {
        super(2, q22Var);
        this.$cancelOrReleaseJob = sVar;
        this.$pressScope = pressGestureScopeImpl;
    }

    public final q22<Unit> create(Object obj, q22<?> q22Var) {
        return new TapGestureDetectorKt$processTapGesture$6(this.$cancelOrReleaseJob, this.$pressScope, q22Var);
    }

    public final Object invoke(ta2 ta2Var, q22<? super Unit> q22Var) {
        return create(ta2Var, q22Var).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
    
        if (r5.i(r4) == r0) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.g()
            int r1 = r4.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            kotlin.f.b(r5)
            goto L37
        L12:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L1a:
            kotlin.f.b(r5)
            goto L2c
        L1e:
            kotlin.f.b(r5)
            kotlinx.coroutines.s r5 = r4.$cancelOrReleaseJob
            r4.label = r3
            java.lang.Object r5 = r5.f1(r4)
            if (r5 != r0) goto L2c
            goto L36
        L2c:
            androidx.compose.foundation.gestures.PressGestureScopeImpl r5 = r4.$pressScope
            r4.label = r2
            java.lang.Object r5 = r5.i(r4)
            if (r5 != r0) goto L37
        L36:
            return r0
        L37:
            kotlin.Unit r5 = kotlin.Unit.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p001foundation.gestures.TapGestureDetectorKt$processTapGesture$6.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
