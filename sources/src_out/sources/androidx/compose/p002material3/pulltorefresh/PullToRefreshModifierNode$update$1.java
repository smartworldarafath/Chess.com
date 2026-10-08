package androidx.compose.p002material3.pulltorefresh;

import com.google.android.lq2;
import com.google.android.q22;
import com.google.android.ta2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/ta2;", "", "<anonymous>", "(Lcom/google/android/ta2;)V"}, k = 3, mv = {2, 0, 0})
@lq2(c = "androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$update$1", f = "PullToRefresh.kt", l = {304, 306}, m = "invokeSuspend")
final class PullToRefreshModifierNode$update$1 extends SuspendLambda implements Function2<ta2, q22<? super Unit>, Object> {
    int label;
    final /* synthetic */ PullToRefreshModifierNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PullToRefreshModifierNode$update$1(PullToRefreshModifierNode pullToRefreshModifierNode, q22<? super PullToRefreshModifierNode$update$1> q22Var) {
        super(2, q22Var);
        this.this$0 = pullToRefreshModifierNode;
    }

    public final q22<Unit> create(Object obj, q22<?> q22Var) {
        return new PullToRefreshModifierNode$update$1(this.this$0, q22Var);
    }

    public final Object invoke(ta2 ta2Var, q22<? super Unit> q22Var) {
        return create(ta2Var, q22Var).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002e, code lost:
    
        if (r5.x3(r4) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0039, code lost:
    
        if (r5.y3(r4) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003b, code lost:
    
        return r0;
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
            if (r1 == 0) goto L1b
            if (r1 == r3) goto L17
            if (r1 != r2) goto Lf
            goto L17
        Lf:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L17:
            kotlin.f.b(r5)
            goto L3c
        L1b:
            kotlin.f.b(r5)
            androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode r5 = r4.this$0
            boolean r5 = r5.getIsRefreshing()
            if (r5 != 0) goto L31
            androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode r5 = r4.this$0
            r4.label = r3
            java.lang.Object r5 = androidx.compose.p002material3.pulltorefresh.PullToRefreshModifierNode.s3(r5, r4)
            if (r5 != r0) goto L3c
            goto L3b
        L31:
            androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode r5 = r4.this$0
            r4.label = r2
            java.lang.Object r5 = androidx.compose.p002material3.pulltorefresh.PullToRefreshModifierNode.t3(r5, r4)
            if (r5 != r0) goto L3c
        L3b:
            return r0
        L3c:
            kotlin.Unit r5 = kotlin.Unit.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002material3.pulltorefresh.PullToRefreshModifierNode$update$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
