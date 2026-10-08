package androidx.compose.p001foundation;

import androidx.compose.p001foundation.interaction.a;
import com.google.android.lq2;
import com.google.android.q22;
import com.google.android.ta2;
import com.google.inputmethod.r48;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: androidx.compose.foundation.AbstractClickableNode$handlePressInteractionStart$2$1, reason: from Kotlin metadata and case insensitive filesystem */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/ta2;", "", "<anonymous>", "(Lcom/google/android/ta2;)V"}, k = 3, mv = {2, 1, 0})
@lq2(c = "androidx.compose.foundation.AbstractClickableNode$handlePressInteractionStart$2$1", f = "Clickable.kt", l = {2088, 2089}, m = "invokeSuspend", v = 1)
final class C0144AbstractClickableNode$handlePressInteractionStart$2$1 extends SuspendLambda implements Function2<ta2, q22<? super Unit>, Object> {
    final /* synthetic */ r48 $interactionSource;
    final /* synthetic */ a.b $press;
    int label;
    final /* synthetic */ AbstractClickableNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C0144AbstractClickableNode$handlePressInteractionStart$2$1(r48 r48Var, a.b bVar, AbstractClickableNode abstractClickableNode, q22<? super C0144AbstractClickableNode$handlePressInteractionStart$2$1> q22Var) {
        super(2, q22Var);
        this.$interactionSource = r48Var;
        this.$press = bVar;
        this.this$0 = abstractClickableNode;
    }

    public final q22<Unit> create(Object obj, q22<?> q22Var) {
        return new C0144AbstractClickableNode$handlePressInteractionStart$2$1(this.$interactionSource, this.$press, this.this$0, q22Var);
    }

    public final Object invoke(ta2 ta2Var, q22<? super Unit> q22Var) {
        return create(ta2Var, q22Var).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
    
        if (r7.a(r1, r6) == r0) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.g()
            int r1 = r6.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            kotlin.f.b(r7)
            goto L3b
        L12:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1a:
            kotlin.f.b(r7)
            goto L2e
        L1e:
            kotlin.f.b(r7)
            long r4 = com.google.inputmethod.le1.a()
            r6.label = r3
            java.lang.Object r7 = kotlinx.coroutines.DelayKt.b(r4, r6)
            if (r7 != r0) goto L2e
            goto L3a
        L2e:
            com.google.android.r48 r7 = r6.$interactionSource
            androidx.compose.foundation.interaction.a$b r1 = r6.$press
            r6.label = r2
            java.lang.Object r7 = r7.a(r1, r6)
            if (r7 != r0) goto L3b
        L3a:
            return r0
        L3b:
            androidx.compose.foundation.AbstractClickableNode r7 = r6.this$0
            androidx.compose.foundation.interaction.a$b r0 = r6.$press
            androidx.compose.p001foundation.AbstractClickableNode.D3(r7, r0)
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p001foundation.C0144AbstractClickableNode$handlePressInteractionStart$2$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
