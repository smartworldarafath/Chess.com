package androidx.compose.p001foundation.text.selection;

import com.google.android.lq2;
import com.google.android.q22;
import com.google.inputmethod.rn8;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/google/android/rn8;", "clickLocation", "", "<anonymous>", "(Lcom/google/android/rn8;)V"}, k = 3, mv = {2, 1, 0})
@lq2(c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager$contextMenuAreaModifier$1", f = "TextFieldSelectionManager.kt", l = {228, 230}, m = "invokeSuspend", v = 1)
final class TextFieldSelectionManager$contextMenuAreaModifier$1 extends SuspendLambda implements Function2<rn8, q22<? super Unit>, Object> {
    /* synthetic */ long J$0;
    int label;
    final /* synthetic */ TextFieldSelectionManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TextFieldSelectionManager$contextMenuAreaModifier$1(TextFieldSelectionManager textFieldSelectionManager, q22<? super TextFieldSelectionManager$contextMenuAreaModifier$1> q22Var) {
        super(2, q22Var);
        this.this$0 = textFieldSelectionManager;
    }

    public final Object a(long j, q22<? super Unit> q22Var) {
        return create(rn8.d(j), q22Var).invokeSuspend(Unit.a);
    }

    public final q22<Unit> create(Object obj, q22<?> q22Var) {
        TextFieldSelectionManager$contextMenuAreaModifier$1 textFieldSelectionManager$contextMenuAreaModifier$1 = new TextFieldSelectionManager$contextMenuAreaModifier$1(this.this$0, q22Var);
        textFieldSelectionManager$contextMenuAreaModifier$1.J$0 = ((rn8) obj).getPackedValue();
        return textFieldSelectionManager$contextMenuAreaModifier$1;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return a(((rn8) obj).getPackedValue(), (q22) obj2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005f, code lost:
    
        if (r6.c(r7, r8, r10, r12) == r0) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.g()
            int r1 = r12.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L20
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            kotlin.f.b(r13)
            goto L62
        L12:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L1a:
            long r3 = r12.J$0
            kotlin.f.b(r13)
            goto L33
        L20:
            kotlin.f.b(r13)
            long r4 = r12.J$0
            androidx.compose.foundation.text.selection.TextFieldSelectionManager r13 = r12.this$0
            r12.J$0 = r4
            r12.label = r3
            java.lang.Object r13 = r13.X0(r12)
            if (r13 != r0) goto L32
            goto L61
        L32:
            r3 = r4
        L33:
            androidx.compose.foundation.text.selection.TextFieldSelectionManager r13 = r12.this$0
            kotlin.Pair r13 = androidx.compose.p001foundation.text.selection.TextFieldSelectionManager.f(r13)
            if (r13 == 0) goto L62
            androidx.compose.foundation.text.selection.TextFieldSelectionManager r1 = r12.this$0
            java.lang.Object r5 = r13.a()
            r7 = r5
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r13 = r13.b()
            androidx.compose.ui.text.x r13 = (androidx.compose.ui.text.x) r13
            long r8 = r13.getPackedValue()
            com.google.android.qb9 r6 = r1.getPlatformSelectionBehaviors()
            if (r6 == 0) goto L62
            com.google.android.rn8 r10 = com.google.inputmethod.rn8.d(r3)
            r12.label = r2
            r11 = r12
            java.lang.Object r13 = r6.c(r7, r8, r10, r11)
            if (r13 != r0) goto L62
        L61:
            return r0
        L62:
            kotlin.Unit r13 = kotlin.Unit.a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p001foundation.text.selection.TextFieldSelectionManager$contextMenuAreaModifier$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
