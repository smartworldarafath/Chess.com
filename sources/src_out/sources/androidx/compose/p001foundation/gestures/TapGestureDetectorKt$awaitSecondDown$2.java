package androidx.compose.p001foundation.gestures;

import androidx.compose.ui.input.pointer.PointerInputChange;
import com.google.android.lq2;
import com.google.android.q22;
import com.google.inputmethod.cc0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/cc0;", "Landroidx/compose/ui/input/pointer/i;", "<anonymous>", "(Lcom/google/android/cc0;)Landroidx/compose/ui/input/pointer/i;"}, k = 3, mv = {2, 1, 0})
@lq2(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitSecondDown$2", f = "TapGestureDetector.kt", l = {254}, m = "invokeSuspend", v = 1)
final class TapGestureDetectorKt$awaitSecondDown$2 extends RestrictedSuspendLambda implements Function2<cc0, q22<? super PointerInputChange>, Object> {
    final /* synthetic */ PointerInputChange $firstUp;
    long J$0;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TapGestureDetectorKt$awaitSecondDown$2(PointerInputChange pointerInputChange, q22<? super TapGestureDetectorKt$awaitSecondDown$2> q22Var) {
        super(2, q22Var);
        this.$firstUp = pointerInputChange;
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(cc0 cc0Var, q22<? super PointerInputChange> q22Var) {
        return create(cc0Var, q22Var).invokeSuspend(Unit.a);
    }

    public final q22<Unit> create(Object obj, q22<?> q22Var) {
        TapGestureDetectorKt$awaitSecondDown$2 tapGestureDetectorKt$awaitSecondDown$2 = new TapGestureDetectorKt$awaitSecondDown$2(this.$firstUp, q22Var);
        tapGestureDetectorKt$awaitSecondDown$2.L$0 = obj;
        return tapGestureDetectorKt$awaitSecondDown$2;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0046 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:14:0x0051 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0044 -> B:12:0x0047). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:0:?
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.g()
            int r1 = r11.label
            r2 = 1
            if (r1 == 0) goto L1e
            if (r1 != r2) goto L16
            long r3 = r11.J$0
            java.lang.Object r1 = r11.L$0
            com.google.android.cc0 r1 = (com.google.inputmethod.cc0) r1
            kotlin.f.b(r12)
            r5 = r1
            goto L47
        L16:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L1e:
            kotlin.f.b(r12)
            java.lang.Object r12 = r11.L$0
            com.google.android.cc0 r12 = (com.google.inputmethod.cc0) r12
            androidx.compose.ui.input.pointer.i r1 = r11.$firstUp
            long r3 = r1.getUptimeMillis()
            com.google.android.p7e r1 = r12.getViewConfiguration()
            long r5 = r1.a()
            long r3 = r3 + r5
            r5 = r12
        L35:
            r11.L$0 = r5
            r11.J$0 = r3
            r11.label = r2
            r6 = 0
            r7 = 0
            r9 = 3
            r10 = 0
            r8 = r11
            java.lang.Object r12 = androidx.compose.p001foundation.gestures.TapGestureDetectorKt.d(r5, r6, r7, r8, r9, r10)
            if (r12 != r0) goto L47
            return r0
        L47:
            androidx.compose.ui.input.pointer.i r12 = (androidx.compose.ui.input.pointer.PointerInputChange) r12
            long r6 = r12.getUptimeMillis()
            int r1 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r1 < 0) goto L35
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p001foundation.gestures.TapGestureDetectorKt$awaitSecondDown$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
