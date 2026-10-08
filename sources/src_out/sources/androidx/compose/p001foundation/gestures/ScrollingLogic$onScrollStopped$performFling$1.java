package androidx.compose.p001foundation.gestures;

import com.google.android.lq2;
import com.google.android.q22;
import com.google.inputmethod.t3e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/t3e;", "velocity", "<anonymous>", "(Lcom/google/android/t3e;)Lcom/google/android/t3e;"}, k = 3, mv = {2, 1, 0})
@lq2(c = "androidx.compose.foundation.gestures.ScrollingLogic$onScrollStopped$performFling$1", f = "Scrollable.kt", l = {864, 867, 870}, m = "invokeSuspend", v = 1)
final class ScrollingLogic$onScrollStopped$performFling$1 extends SuspendLambda implements Function2<t3e, q22<? super t3e>, Object> {
    /* synthetic */ long J$0;
    long J$1;
    int label;
    final /* synthetic */ ScrollingLogic this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ScrollingLogic$onScrollStopped$performFling$1(ScrollingLogic scrollingLogic, q22<? super ScrollingLogic$onScrollStopped$performFling$1> q22Var) {
        super(2, q22Var);
        this.this$0 = scrollingLogic;
    }

    public final Object a(long j, q22<? super t3e> q22Var) {
        return create(t3e.b(j), q22Var).invokeSuspend(Unit.a);
    }

    public final q22<Unit> create(Object obj, q22<?> q22Var) {
        ScrollingLogic$onScrollStopped$performFling$1 scrollingLogic$onScrollStopped$performFling$1 = new ScrollingLogic$onScrollStopped$performFling$1(this.this$0, q22Var);
        scrollingLogic$onScrollStopped$performFling$1.J$0 = ((t3e) obj).getPackedValue();
        return scrollingLogic$onScrollStopped$performFling$1;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return a(((t3e) obj).getPackedValue(), (q22) obj2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0085, code lost:
    
        if (r0 == r6) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) throws java.lang.Throwable {
        /*
            r13 = this;
            java.lang.Object r6 = kotlin.coroutines.intrinsics.a.g()
            int r0 = r13.label
            r1 = 3
            r2 = 2
            r3 = 1
            if (r0 == 0) goto L35
            if (r0 == r3) goto L2e
            if (r0 == r2) goto L25
            if (r0 != r1) goto L1d
            long r0 = r13.J$1
            long r2 = r13.J$0
            kotlin.f.b(r14)
            r7 = r2
            r3 = r0
            r0 = r14
            goto L88
        L1d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L25:
            long r2 = r13.J$1
            long r7 = r13.J$0
            kotlin.f.b(r14)
            r0 = r14
            goto L68
        L2e:
            long r3 = r13.J$0
            kotlin.f.b(r14)
            r0 = r14
            goto L4c
        L35:
            kotlin.f.b(r14)
            long r7 = r13.J$0
            androidx.compose.foundation.gestures.ScrollingLogic r0 = r13.this$0
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher r0 = androidx.compose.p001foundation.gestures.ScrollingLogic.g(r0)
            r13.J$0 = r7
            r13.label = r3
            java.lang.Object r0 = r0.c(r7, r13)
            if (r0 != r6) goto L4b
            goto L87
        L4b:
            r3 = r7
        L4c:
            com.google.android.t3e r0 = (com.google.inputmethod.t3e) r0
            long r7 = r0.getPackedValue()
            long r7 = com.google.inputmethod.t3e.k(r3, r7)
            androidx.compose.foundation.gestures.ScrollingLogic r0 = r13.this$0
            r13.J$0 = r3
            r13.J$1 = r7
            r13.label = r2
            java.lang.Object r0 = r0.a(r7, r13)
            if (r0 != r6) goto L65
            goto L87
        L65:
            r11 = r7
            r7 = r3
            r2 = r11
        L68:
            com.google.android.t3e r0 = (com.google.inputmethod.t3e) r0
            long r9 = r0.getPackedValue()
            androidx.compose.foundation.gestures.ScrollingLogic r0 = r13.this$0
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher r0 = androidx.compose.p001foundation.gestures.ScrollingLogic.g(r0)
            long r2 = com.google.inputmethod.t3e.k(r2, r9)
            r13.J$0 = r7
            r13.J$1 = r9
            r13.label = r1
            r5 = r13
            r1 = r2
            r3 = r9
            java.lang.Object r0 = r0.a(r1, r3, r5)
            if (r0 != r6) goto L88
        L87:
            return r6
        L88:
            com.google.android.t3e r0 = (com.google.inputmethod.t3e) r0
            long r0 = r0.getPackedValue()
            long r0 = com.google.inputmethod.t3e.k(r3, r0)
            long r0 = com.google.inputmethod.t3e.k(r7, r0)
            com.google.android.t3e r0 = com.google.inputmethod.t3e.b(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p001foundation.gestures.ScrollingLogic$onScrollStopped$performFling$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
