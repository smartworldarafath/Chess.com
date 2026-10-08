package androidx.compose.p001foundation.text.selection;

import com.google.android.lq2;
import com.google.android.q22;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
@lq2(c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager$contextMenuAreaModifier$2", f = "TextFieldSelectionManager.kt", l = {241, 243}, m = "invokeSuspend", v = 1)
final class TextFieldSelectionManager$contextMenuAreaModifier$2 extends SuspendLambda implements Function1<q22<? super Unit>, Object> {
    int label;
    final /* synthetic */ TextFieldSelectionManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TextFieldSelectionManager$contextMenuAreaModifier$2(TextFieldSelectionManager textFieldSelectionManager, q22<? super TextFieldSelectionManager$contextMenuAreaModifier$2> q22Var) {
        super(1, q22Var);
        this.this$0 = textFieldSelectionManager;
    }

    public final q22<Unit> create(q22<?> q22Var) {
        return new TextFieldSelectionManager$contextMenuAreaModifier$2(this.this$0, q22Var);
    }

    public final Object invoke(q22<? super Unit> q22Var) {
        return create(q22Var).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0052, code lost:
    
        if (r8.a(r4, r5, r7) == r0) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.g()
            int r1 = r7.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            kotlin.f.b(r8)
            goto L55
        L12:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1a:
            kotlin.f.b(r8)
            goto L2c
        L1e:
            kotlin.f.b(r8)
            androidx.compose.foundation.text.selection.TextFieldSelectionManager r8 = r7.this$0
            r7.label = r3
            java.lang.Object r8 = r8.X0(r7)
            if (r8 != r0) goto L2c
            goto L54
        L2c:
            androidx.compose.foundation.text.selection.TextFieldSelectionManager r8 = r7.this$0
            kotlin.Pair r8 = androidx.compose.p001foundation.text.selection.TextFieldSelectionManager.f(r8)
            if (r8 == 0) goto L55
            androidx.compose.foundation.text.selection.TextFieldSelectionManager r1 = r7.this$0
            java.lang.Object r4 = r8.a()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r8 = r8.b()
            androidx.compose.ui.text.x r8 = (androidx.compose.ui.text.x) r8
            long r5 = r8.getPackedValue()
            com.google.android.qb9 r8 = r1.getPlatformSelectionBehaviors()
            if (r8 == 0) goto L55
            r7.label = r2
            java.lang.Object r8 = r8.a(r4, r5, r7)
            if (r8 != r0) goto L55
        L54:
            return r0
        L55:
            androidx.compose.foundation.text.selection.TextFieldSelectionManager r8 = r7.this$0
            r8.S0(r3)
            kotlin.Unit r8 = kotlin.Unit.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p001foundation.text.selection.TextFieldSelectionManager$contextMenuAreaModifier$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
