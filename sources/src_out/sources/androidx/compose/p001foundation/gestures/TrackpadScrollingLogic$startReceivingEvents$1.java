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
@lq2(c = "androidx.compose.foundation.gestures.TrackpadScrollingLogic$startReceivingEvents$1", f = "TrackpadScrollingLogic.kt", l = {99, 99}, m = "invokeSuspend", v = 1)
final class TrackpadScrollingLogic$startReceivingEvents$1 extends SuspendLambda implements Function2<ta2, q22<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ TrackpadScrollingLogic this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TrackpadScrollingLogic$startReceivingEvents$1(TrackpadScrollingLogic trackpadScrollingLogic, q22<? super TrackpadScrollingLogic$startReceivingEvents$1> q22Var) {
        super(2, q22Var);
        this.this$0 = trackpadScrollingLogic;
    }

    public final q22<Unit> create(Object obj, q22<?> q22Var) {
        TrackpadScrollingLogic$startReceivingEvents$1 trackpadScrollingLogic$startReceivingEvents$1 = new TrackpadScrollingLogic$startReceivingEvents$1(this.this$0, q22Var);
        trackpadScrollingLogic$startReceivingEvents$1.L$0 = obj;
        return trackpadScrollingLogic$startReceivingEvents$1;
    }

    public final Object invoke(ta2 ta2Var, q22<? super Unit> q22Var) {
        return create(ta2Var, q22Var).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0043 A[Catch: all -> 0x0018, TryCatch #0 {all -> 0x0018, blocks: (B:7:0x0013, B:17:0x0039, B:19:0x0043, B:23:0x0061, B:14:0x002e), top: B:31:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:21:0x005d  */
    /* JADX WARN: Code duplicated, block: B:22:0x005e  */
    /* JADX WARN: Code duplicated, block: B:26:0x0072  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0072 -> B:17:0x0039). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.g()
            int r1 = r8.label
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L32
            if (r1 == r3) goto L22
            if (r1 != r2) goto L1a
            java.lang.Object r1 = r8.L$0
            com.google.android.ta2 r1 = (com.google.android.ta2) r1
            kotlin.f.b(r9)     // Catch: java.lang.Throwable -> L18
            r9 = r1
            goto L39
        L18:
            r9 = move-exception
            goto L7c
        L1a:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L22:
            java.lang.Object r1 = r8.L$2
            androidx.compose.foundation.gestures.ScrollingLogic r1 = (androidx.compose.p001foundation.gestures.ScrollingLogic) r1
            java.lang.Object r5 = r8.L$1
            androidx.compose.foundation.gestures.TrackpadScrollingLogic r5 = (androidx.compose.p001foundation.gestures.TrackpadScrollingLogic) r5
            java.lang.Object r6 = r8.L$0
            com.google.android.ta2 r6 = (com.google.android.ta2) r6
            kotlin.f.b(r9)     // Catch: java.lang.Throwable -> L18
            goto L61
        L32:
            kotlin.f.b(r9)
            java.lang.Object r9 = r8.L$0
            com.google.android.ta2 r9 = (com.google.android.ta2) r9
        L39:
            kotlin.coroutines.CoroutineContext r1 = r9.getCoroutineContext()     // Catch: java.lang.Throwable -> L18
            boolean r1 = kotlinx.coroutines.u.n(r1)     // Catch: java.lang.Throwable -> L18
            if (r1 == 0) goto L74
            androidx.compose.foundation.gestures.TrackpadScrollingLogic r5 = r8.this$0     // Catch: java.lang.Throwable -> L18
            androidx.compose.foundation.gestures.ScrollingLogic r1 = r5.getScrollingLogic()     // Catch: java.lang.Throwable -> L18
            androidx.compose.foundation.gestures.TrackpadScrollingLogic r6 = r8.this$0     // Catch: java.lang.Throwable -> L18
            com.google.android.h81 r6 = androidx.compose.p001foundation.gestures.TrackpadScrollingLogic.l(r6)     // Catch: java.lang.Throwable -> L18
            r8.L$0 = r9     // Catch: java.lang.Throwable -> L18
            r8.L$1 = r5     // Catch: java.lang.Throwable -> L18
            r8.L$2 = r1     // Catch: java.lang.Throwable -> L18
            r8.label = r3     // Catch: java.lang.Throwable -> L18
            java.lang.Object r6 = r6.c(r8)     // Catch: java.lang.Throwable -> L18
            if (r6 != r0) goto L5e
            goto L71
        L5e:
            r7 = r6
            r6 = r9
            r9 = r7
        L61:
            androidx.compose.foundation.gestures.TrackpadScrollingLogic$a r9 = (androidx.compose.foundation.gestures.TrackpadScrollingLogic.a) r9     // Catch: java.lang.Throwable -> L18
            r8.L$0 = r6     // Catch: java.lang.Throwable -> L18
            r8.L$1 = r4     // Catch: java.lang.Throwable -> L18
            r8.L$2 = r4     // Catch: java.lang.Throwable -> L18
            r8.label = r2     // Catch: java.lang.Throwable -> L18
            java.lang.Object r9 = androidx.compose.p001foundation.gestures.TrackpadScrollingLogic.k(r5, r1, r9, r8)     // Catch: java.lang.Throwable -> L18
            if (r9 != r0) goto L72
        L71:
            return r0
        L72:
            r9 = r6
            goto L39
        L74:
            androidx.compose.foundation.gestures.TrackpadScrollingLogic r9 = r8.this$0
            androidx.compose.p001foundation.gestures.TrackpadScrollingLogic.m(r9, r4)
            kotlin.Unit r9 = kotlin.Unit.a
            return r9
        L7c:
            androidx.compose.foundation.gestures.TrackpadScrollingLogic r0 = r8.this$0
            androidx.compose.p001foundation.gestures.TrackpadScrollingLogic.m(r0, r4)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p001foundation.gestures.TrackpadScrollingLogic$startReceivingEvents$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
