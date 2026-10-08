package androidx.compose.p001foundation;

import com.google.android.lq2;
import com.google.android.q22;
import com.google.android.ta2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: androidx.compose.foundation.CombinedClickableNode$onClickKeyUpEvent$2, reason: from Kotlin metadata and case insensitive filesystem */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/ta2;", "", "<anonymous>", "(Lcom/google/android/ta2;)V"}, k = 3, mv = {2, 1, 0})
@lq2(c = "androidx.compose.foundation.CombinedClickableNode$onClickKeyUpEvent$2", f = "Clickable.kt", l = {1628, 1632}, m = "invokeSuspend", v = 1)
final class C0159CombinedClickableNode$onClickKeyUpEvent$2 extends SuspendLambda implements Function2<ta2, q22<? super Unit>, Object> {
    final /* synthetic */ long $keyCode;
    long J$0;
    long J$1;
    int label;
    final /* synthetic */ CombinedClickableNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C0159CombinedClickableNode$onClickKeyUpEvent$2(CombinedClickableNode combinedClickableNode, long j, q22<? super C0159CombinedClickableNode$onClickKeyUpEvent$2> q22Var) {
        super(2, q22Var);
        this.this$0 = combinedClickableNode;
        this.$keyCode = j;
    }

    public final q22<Unit> create(Object obj, q22<?> q22Var) {
        return new C0159CombinedClickableNode$onClickKeyUpEvent$2(this.this$0, this.$keyCode, q22Var);
    }

    public final Object invoke(ta2 ta2Var, q22<? super Unit> q22Var) {
        return create(ta2Var, q22Var).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0060, code lost:
    
        if (kotlinx.coroutines.DelayKt.b(r4 - r6, r10) == r0) goto L18;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.g()
            int r1 = r10.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L22
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            kotlin.f.b(r11)
            goto L63
        L12:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L1a:
            long r4 = r10.J$1
            long r6 = r10.J$0
            kotlin.f.b(r11)
            goto L46
        L22:
            kotlin.f.b(r11)
            androidx.compose.foundation.CombinedClickableNode r11 = r10.this$0
            com.google.android.ks9 r1 = androidx.compose.ui.platform.CompositionLocalsKt.u()
            java.lang.Object r11 = com.google.inputmethod.cs1.a(r11, r1)
            com.google.android.p7e r11 = (com.google.inputmethod.p7e) r11
            long r6 = r11.a()
            long r4 = r11.e()
            r10.J$0 = r6
            r10.J$1 = r4
            r10.label = r3
            java.lang.Object r11 = kotlinx.coroutines.DelayKt.b(r6, r10)
            if (r11 != r0) goto L46
            goto L62
        L46:
            androidx.compose.foundation.CombinedClickableNode r11 = r10.this$0
            com.google.android.w48 r11 = androidx.compose.p001foundation.CombinedClickableNode.j4(r11)
            long r8 = r10.$keyCode
            java.lang.Object r11 = r11.b(r8)
            androidx.compose.foundation.CombinedClickableNode$a r11 = (androidx.compose.foundation.CombinedClickableNode.a) r11
            if (r11 == 0) goto L59
            r11.c(r3)
        L59:
            long r4 = r4 - r6
            r10.label = r2
            java.lang.Object r11 = kotlinx.coroutines.DelayKt.b(r4, r10)
            if (r11 != r0) goto L63
        L62:
            return r0
        L63:
            androidx.compose.foundation.CombinedClickableNode r11 = r10.this$0
            kotlin.jvm.functions.Function0 r11 = r11.P3()
            r11.invoke()
            kotlin.Unit r11 = kotlin.Unit.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p001foundation.C0159CombinedClickableNode$onClickKeyUpEvent$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
