package androidx.compose.p001foundation.gestures;

import com.google.android.lq2;
import com.google.android.q22;
import com.google.android.ta2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/ta2;", "", "<anonymous>", "(Lcom/google/android/ta2;)V"}, k = 3, mv = {2, 1, 0})
@lq2(c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic$startReceivingEvents$1", f = "MouseWheelScrollingLogic.kt", l = {109, 112}, m = "invokeSuspend", v = 1)
final class MouseWheelScrollingLogic$startReceivingEvents$1 extends SuspendLambda implements Function2<ta2, q22<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ MouseWheelScrollingLogic this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MouseWheelScrollingLogic$startReceivingEvents$1(MouseWheelScrollingLogic mouseWheelScrollingLogic, q22<? super MouseWheelScrollingLogic$startReceivingEvents$1> q22Var) {
        super(2, q22Var);
        this.this$0 = mouseWheelScrollingLogic;
    }

    public final q22<Unit> create(Object obj, q22<?> q22Var) {
        MouseWheelScrollingLogic$startReceivingEvents$1 mouseWheelScrollingLogic$startReceivingEvents$1 = new MouseWheelScrollingLogic$startReceivingEvents$1(this.this$0, q22Var);
        mouseWheelScrollingLogic$startReceivingEvents$1.L$0 = obj;
        return mouseWheelScrollingLogic$startReceivingEvents$1;
    }

    public final Object invoke(ta2 ta2Var, q22<? super Unit> q22Var) {
        return create(ta2Var, q22Var).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003f A[Catch: all -> 0x0088, TryCatch #1 {all -> 0x0088, blocks: (B:18:0x0035, B:20:0x003f, B:24:0x0054), top: B:39:0x0035 }] */
    /* JADX WARN: Code duplicated, block: B:22:0x004f  */
    /* JADX WARN: Code duplicated, block: B:23:0x0051  */
    /* JADX WARN: Code duplicated, block: B:9:0x0017  */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.g()
            int r1 = r12.label
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L2e
            if (r1 == r4) goto L26
            if (r1 != r3) goto L1e
            java.lang.Object r1 = r12.L$0
            com.google.android.ta2 r1 = (com.google.android.ta2) r1
            kotlin.f.b(r13)     // Catch: java.lang.Throwable -> L19
            r10 = r12
        L17:
            r13 = r1
            goto L35
        L19:
            r0 = move-exception
            r13 = r0
            r10 = r12
            goto L94
        L1e:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L26:
            java.lang.Object r1 = r12.L$0
            com.google.android.ta2 r1 = (com.google.android.ta2) r1
            kotlin.f.b(r13)     // Catch: java.lang.Throwable -> L19
            goto L54
        L2e:
            kotlin.f.b(r13)
            java.lang.Object r13 = r12.L$0
            com.google.android.ta2 r13 = (com.google.android.ta2) r13
        L35:
            kotlin.coroutines.CoroutineContext r1 = r13.getCoroutineContext()     // Catch: java.lang.Throwable -> L88
            boolean r1 = kotlinx.coroutines.u.n(r1)     // Catch: java.lang.Throwable -> L88
            if (r1 == 0) goto L8b
            androidx.compose.foundation.gestures.MouseWheelScrollingLogic r1 = r12.this$0     // Catch: java.lang.Throwable -> L88
            com.google.android.h81 r1 = androidx.compose.p001foundation.gestures.MouseWheelScrollingLogic.o(r1)     // Catch: java.lang.Throwable -> L88
            r12.L$0 = r13     // Catch: java.lang.Throwable -> L88
            r12.label = r4     // Catch: java.lang.Throwable -> L88
            java.lang.Object r1 = r1.c(r12)     // Catch: java.lang.Throwable -> L88
            if (r1 != r0) goto L51
            r10 = r12
            goto L84
        L51:
            r11 = r1
            r1 = r13
            r13 = r11
        L54:
            r7 = r13
            androidx.compose.foundation.gestures.MouseWheelScrollingLogic$a r7 = (androidx.compose.p001foundation.gestures.MouseWheelScrollingLogic.MouseWheelScrollDelta) r7     // Catch: java.lang.Throwable -> L88
            androidx.compose.foundation.gestures.MouseWheelScrollingLogic r13 = r12.this$0     // Catch: java.lang.Throwable -> L88
            com.google.android.f43 r13 = r13.getDensity()     // Catch: java.lang.Throwable -> L88
            float r5 = com.google.inputmethod.m08.b()     // Catch: java.lang.Throwable -> L88
            float r8 = r13.x2(r5)     // Catch: java.lang.Throwable -> L88
            androidx.compose.foundation.gestures.MouseWheelScrollingLogic r13 = r12.this$0     // Catch: java.lang.Throwable -> L88
            com.google.android.f43 r13 = r13.getDensity()     // Catch: java.lang.Throwable -> L88
            float r5 = com.google.inputmethod.m08.a()     // Catch: java.lang.Throwable -> L88
            float r9 = r13.x2(r5)     // Catch: java.lang.Throwable -> L88
            androidx.compose.foundation.gestures.MouseWheelScrollingLogic r5 = r12.this$0     // Catch: java.lang.Throwable -> L88
            androidx.compose.foundation.gestures.ScrollingLogic r6 = r5.getScrollingLogic()     // Catch: java.lang.Throwable -> L88
            r12.L$0 = r1     // Catch: java.lang.Throwable -> L88
            r12.label = r3     // Catch: java.lang.Throwable -> L88
            r10 = r12
            java.lang.Object r13 = androidx.compose.p001foundation.gestures.MouseWheelScrollingLogic.m(r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L85
            if (r13 != r0) goto L17
        L84:
            return r0
        L85:
            r0 = move-exception
        L86:
            r13 = r0
            goto L94
        L88:
            r0 = move-exception
            r10 = r12
            goto L86
        L8b:
            r10 = r12
            androidx.compose.foundation.gestures.MouseWheelScrollingLogic r13 = r10.this$0
            androidx.compose.p001foundation.gestures.MouseWheelScrollingLogic.p(r13, r2)
            kotlin.Unit r13 = kotlin.Unit.a
            return r13
        L94:
            androidx.compose.foundation.gestures.MouseWheelScrollingLogic r0 = r10.this$0
            androidx.compose.p001foundation.gestures.MouseWheelScrollingLogic.p(r0, r2)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p001foundation.gestures.MouseWheelScrollingLogic$startReceivingEvents$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
