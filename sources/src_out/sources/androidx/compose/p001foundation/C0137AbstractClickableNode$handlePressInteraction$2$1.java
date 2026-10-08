package androidx.compose.p001foundation;

import com.google.android.lq2;
import com.google.android.q22;
import com.google.android.ta2;
import com.google.inputmethod.ml9;
import com.google.inputmethod.r48;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: androidx.compose.foundation.AbstractClickableNode$handlePressInteraction$2$1, reason: from Kotlin metadata and case insensitive filesystem */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/ta2;", "", "<anonymous>", "(Lcom/google/android/ta2;)V"}, k = 3, mv = {2, 1, 0})
@lq2(c = "androidx.compose.foundation.AbstractClickableNode$handlePressInteraction$2$1", f = "Clickable.kt", l = {2245, 2247, 2254, 2255, 2265}, m = "invokeSuspend", v = 1)
final class C0137AbstractClickableNode$handlePressInteraction$2$1 extends SuspendLambda implements Function2<ta2, q22<? super Unit>, Object> {
    final /* synthetic */ r48 $interactionSource;
    final /* synthetic */ long $offset;
    final /* synthetic */ ml9 $this_handlePressInteraction;
    private /* synthetic */ Object L$0;
    boolean Z$0;
    int label;
    final /* synthetic */ AbstractClickableNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C0137AbstractClickableNode$handlePressInteraction$2$1(ml9 ml9Var, long j, r48 r48Var, AbstractClickableNode abstractClickableNode, q22<? super C0137AbstractClickableNode$handlePressInteraction$2$1> q22Var) {
        super(2, q22Var);
        this.$this_handlePressInteraction = ml9Var;
        this.$offset = j;
        this.$interactionSource = r48Var;
        this.this$0 = abstractClickableNode;
    }

    public final q22<Unit> create(Object obj, q22<?> q22Var) {
        C0137AbstractClickableNode$handlePressInteraction$2$1 c0137AbstractClickableNode$handlePressInteraction$2$1 = new C0137AbstractClickableNode$handlePressInteraction$2$1(this.$this_handlePressInteraction, this.$offset, this.$interactionSource, this.this$0, q22Var);
        c0137AbstractClickableNode$handlePressInteraction$2$1.L$0 = obj;
        return c0137AbstractClickableNode$handlePressInteraction$2$1;
    }

    public final Object invoke(ta2 ta2Var, q22<? super Unit> q22Var) {
        return create(ta2Var, q22Var).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0087  */
    /* JADX WARN: Code duplicated, block: B:29:0x00a0  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ab, code lost:
    
        if (r3.a(r2, r16) == r1) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00cd, code lost:
    
        if (r4.a(r5, r16) == r1) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p001foundation.C0137AbstractClickableNode$handlePressInteraction$2$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
