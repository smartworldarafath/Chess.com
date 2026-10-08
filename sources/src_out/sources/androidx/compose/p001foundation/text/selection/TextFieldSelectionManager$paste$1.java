package androidx.compose.p001foundation.text.selection;

import com.google.android.lq2;
import com.google.android.q22;
import com.google.android.ta2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/ta2;", "", "<anonymous>", "(Lcom/google/android/ta2;)V"}, k = 3, mv = {2, 1, 0})
@lq2(c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager$paste$1", f = "TextFieldSelectionManager.kt", l = {928, 928}, m = "invokeSuspend", v = 1)
final class TextFieldSelectionManager$paste$1 extends SuspendLambda implements Function2<ta2, q22<? super Unit>, Object> {
    int label;
    final /* synthetic */ TextFieldSelectionManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TextFieldSelectionManager$paste$1(TextFieldSelectionManager textFieldSelectionManager, q22<? super TextFieldSelectionManager$paste$1> q22Var) {
        super(2, q22Var);
        this.this$0 = textFieldSelectionManager;
    }

    public final q22<Unit> create(Object obj, q22<?> q22Var) {
        return new TextFieldSelectionManager$paste$1(this.this$0, q22Var);
    }

    public final Object invoke(ta2 ta2Var, q22<? super Unit> q22Var) {
        return create(ta2Var, q22Var).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003c, code lost:
    
        if (r5 == r0) goto L19;
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
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            kotlin.f.b(r5)
            goto L3f
        L12:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L1a:
            kotlin.f.b(r5)
            goto L32
        L1e:
            kotlin.f.b(r5)
            androidx.compose.foundation.text.selection.TextFieldSelectionManager r5 = r4.this$0
            com.google.android.jf1 r5 = r5.getClipboard()
            if (r5 == 0) goto L4c
            r4.label = r3
            java.lang.Object r5 = r5.c(r4)
            if (r5 != r0) goto L32
            goto L3e
        L32:
            com.google.android.ef1 r5 = (com.google.inputmethod.ef1) r5
            if (r5 == 0) goto L4c
            r4.label = r2
            java.lang.Object r5 = com.google.inputmethod.mf1.e(r5, r4)
            if (r5 != r0) goto L3f
        L3e:
            return r0
        L3f:
            androidx.compose.ui.text.b r5 = (androidx.compose.ui.text.b) r5
            if (r5 != 0) goto L44
            goto L4c
        L44:
            androidx.compose.foundation.text.selection.TextFieldSelectionManager r0 = r4.this$0
            r0.x0(r5)
            kotlin.Unit r5 = kotlin.Unit.a
            return r5
        L4c:
            kotlin.Unit r5 = kotlin.Unit.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p001foundation.text.selection.TextFieldSelectionManager$paste$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
