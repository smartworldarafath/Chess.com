package androidx.p008glance.p010session;

import android.content.Context;
import androidx.compose.p004runtime.Recomposer;
import com.google.android.lq2;
import com.google.android.q22;
import com.google.android.ta2;
import com.google.inputmethod.l8d;
import com.google.inputmethod.pr1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: androidx.glance.session.SessionWorkerKt$runSession$3, reason: from Kotlin metadata and case insensitive filesystem */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/ta2;", "", "<anonymous>", "(Lcom/google/android/ta2;)V"}, k = 3, mv = {1, 8, 0})
@lq2(c = "androidx.glance.session.SessionWorkerKt$runSession$3", f = "SessionWorker.kt", l = {188, 192}, m = "invokeSuspend")
final class C0233SessionWorkerKt$runSession$3 extends SuspendLambda implements Function2<ta2, q22<? super Unit>, Object> {
    final /* synthetic */ pr1 $composition;
    final /* synthetic */ Context $context;
    final /* synthetic */ Recomposer $recomposer;
    final /* synthetic */ Session $session;
    final /* synthetic */ l8d $this_runSession;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C0233SessionWorkerKt$runSession$3(pr1 pr1Var, Session session, Context context, Recomposer recomposer, l8d l8dVar, q22<? super C0233SessionWorkerKt$runSession$3> q22Var) {
        super(2, q22Var);
        this.$composition = pr1Var;
        this.$session = session;
        this.$context = context;
        this.$recomposer = recomposer;
        this.$this_runSession = l8dVar;
    }

    public final q22<Unit> create(Object obj, q22<?> q22Var) {
        return new C0233SessionWorkerKt$runSession$3(this.$composition, this.$session, this.$context, this.$recomposer, this.$this_runSession, q22Var);
    }

    public final Object invoke(ta2 ta2Var, q22<? super Unit> q22Var) {
        return create(ta2Var, q22Var).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003c, code lost:
    
        if (r6.X0(r5) == r0) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.g()
            int r1 = r5.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L24
            if (r1 == r3) goto L1e
            if (r1 != r2) goto L16
            java.lang.Object r0 = r5.L$0
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            kotlin.f.b(r6)
            goto L4f
        L16:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1e:
            kotlin.f.b(r6)     // Catch: java.lang.Throwable -> L22 java.util.concurrent.CancellationException -> L56
            goto L56
        L22:
            r6 = move-exception
            goto L3f
        L24:
            kotlin.f.b(r6)
            com.google.android.pr1 r6 = r5.$composition     // Catch: java.lang.Throwable -> L22 java.util.concurrent.CancellationException -> L56
            androidx.glance.session.Session r1 = r5.$session     // Catch: java.lang.Throwable -> L22 java.util.concurrent.CancellationException -> L56
            android.content.Context r4 = r5.$context     // Catch: java.lang.Throwable -> L22 java.util.concurrent.CancellationException -> L56
            kotlin.jvm.functions.Function2 r1 = r1.j(r4)     // Catch: java.lang.Throwable -> L22 java.util.concurrent.CancellationException -> L56
            r6.c(r1)     // Catch: java.lang.Throwable -> L22 java.util.concurrent.CancellationException -> L56
            androidx.compose.runtime.Recomposer r6 = r5.$recomposer     // Catch: java.lang.Throwable -> L22 java.util.concurrent.CancellationException -> L56
            r5.label = r3     // Catch: java.lang.Throwable -> L22 java.util.concurrent.CancellationException -> L56
            java.lang.Object r6 = r6.X0(r5)     // Catch: java.lang.Throwable -> L22 java.util.concurrent.CancellationException -> L56
            if (r6 != r0) goto L56
            goto L4d
        L3f:
            androidx.glance.session.Session r1 = r5.$session
            android.content.Context r3 = r5.$context
            r5.L$0 = r6
            r5.label = r2
            java.lang.Object r1 = r1.f(r3, r6, r5)
            if (r1 != r0) goto L4e
        L4d:
            return r0
        L4e:
            r0 = r6
        L4f:
            com.google.android.l8d r6 = r5.$this_runSession
            java.lang.String r1 = "Error in recomposition coroutine"
            kotlinx.coroutines.j.c(r6, r1, r0)
        L56:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.p008glance.p010session.C0233SessionWorkerKt$runSession$3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
