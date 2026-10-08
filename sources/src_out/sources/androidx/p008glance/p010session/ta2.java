package androidx.p008glance.p010session;

import com.google.android.lq2;
import com.google.android.q22;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* JADX INFO: renamed from: androidx.glance.session.InteractiveFrameClock$onNewAwaiters$2, reason: from Kotlin metadata */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/ta2;", "", "<anonymous>", "(Lcom/google/android/ta2;)V"}, k = 3, mv = {1, 8, 0})
@lq2(c = "androidx.glance.session.InteractiveFrameClock$onNewAwaiters$2", f = "InteractiveFrameClock.kt", l = {116, 119}, m = "invokeSuspend")
final class ta2 extends SuspendLambda implements Function2<com.google.android.ta2, q22<? super Unit>, Object> {
    final /* synthetic */ Ref.LongRef $minPeriod;
    final /* synthetic */ long $now;
    final /* synthetic */ Ref.LongRef $period;
    int label;
    final /* synthetic */ InteractiveFrameClock this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ta2(Ref.LongRef longRef, Ref.LongRef longRef2, InteractiveFrameClock interactiveFrameClock, long j, q22<? super ta2> q22Var) {
        super(2, q22Var);
        this.$period = longRef;
        this.$minPeriod = longRef2;
        this.this$0 = interactiveFrameClock;
        this.$now = j;
    }

    public final q22<Unit> create(Object obj, q22<?> q22Var) {
        return new ta2(this.$period, this.$minPeriod, this.this$0, this.$now, q22Var);
    }

    public final Object invoke(com.google.android.ta2 ta2Var, q22<? super Unit> q22Var) {
        return create(ta2Var, q22Var).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0033, code lost:
    
        if (com.google.android.woe.a(r8) == r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0049, code lost:
    
        if (kotlinx.coroutines.DelayKt.b((r6 - r4) / 1000000, r8) == r0) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.g()
            int r1 = r8.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            kotlin.f.b(r9)
            goto L4c
        L12:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1a:
            kotlin.f.b(r9)
            goto L36
        L1e:
            kotlin.f.b(r9)
            kotlin.jvm.internal.Ref$LongRef r9 = r8.$period
            long r4 = r9.element
            kotlin.jvm.internal.Ref$LongRef r9 = r8.$minPeriod
            long r6 = r9.element
            int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r9 < 0) goto L3e
            r8.label = r3
            java.lang.Object r9 = com.google.android.woe.a(r8)
            if (r9 != r0) goto L36
            goto L4b
        L36:
            androidx.glance.session.InteractiveFrameClock r9 = r8.this$0
            long r0 = r8.$now
            androidx.p008glance.p010session.InteractiveFrameClock.i(r9, r0)
            goto L5f
        L3e:
            long r6 = r6 - r4
            r3 = 1000000(0xf4240, double:4.940656E-318)
            long r6 = r6 / r3
            r8.label = r2
            java.lang.Object r9 = kotlinx.coroutines.DelayKt.b(r6, r8)
            if (r9 != r0) goto L4c
        L4b:
            return r0
        L4c:
            androidx.glance.session.InteractiveFrameClock r9 = r8.this$0
            kotlin.jvm.functions.Function0 r0 = androidx.p008glance.p010session.InteractiveFrameClock.f(r9)
            java.lang.Object r0 = r0.invoke()
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            androidx.p008glance.p010session.InteractiveFrameClock.i(r9, r0)
        L5f:
            kotlin.Unit r9 = kotlin.Unit.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.p008glance.p010session.ta2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
