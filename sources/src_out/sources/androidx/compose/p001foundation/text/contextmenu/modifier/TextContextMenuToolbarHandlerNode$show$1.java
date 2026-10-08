package androidx.compose.p001foundation.text.contextmenu.modifier;

import com.google.android.lq2;
import com.google.android.q22;
import com.google.android.ta2;
import com.google.inputmethod.mrc;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/ta2;", "", "<anonymous>", "(Lcom/google/android/ta2;)V"}, k = 3, mv = {2, 1, 0})
@lq2(c = "androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuToolbarHandlerNode$show$1", f = "TextContextMenuToolbarHandlerModifier.kt", l = {205, 206, 208, 208}, m = "invokeSuspend", v = 1)
final class TextContextMenuToolbarHandlerNode$show$1 extends SuspendLambda implements Function2<ta2, q22<? super Unit>, Object> {
    final /* synthetic */ mrc $provider;
    Object L$0;
    int label;
    final /* synthetic */ TextContextMenuToolbarHandlerNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TextContextMenuToolbarHandlerNode$show$1(TextContextMenuToolbarHandlerNode textContextMenuToolbarHandlerNode, mrc mrcVar, q22<? super TextContextMenuToolbarHandlerNode$show$1> q22Var) {
        super(2, q22Var);
        this.this$0 = textContextMenuToolbarHandlerNode;
        this.$provider = mrcVar;
    }

    public final q22<Unit> create(Object obj, q22<?> q22Var) {
        return new TextContextMenuToolbarHandlerNode$show$1(this.this$0, this.$provider, q22Var);
    }

    public final Object invoke(ta2 ta2Var, q22<? super Unit> q22Var) {
        return create(ta2Var, q22Var).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x005b  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0061, code lost:
    
        if (r7.invoke(r6) == r0) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
        /*
            r6 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.g()
            int r1 = r6.label
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L32
            if (r1 == r5) goto L2e
            if (r1 == r4) goto L28
            if (r1 == r3) goto L24
            if (r1 == r2) goto L1c
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1c:
            java.lang.Object r0 = r6.L$0
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            kotlin.f.b(r7)
            goto L7b
        L24:
            kotlin.f.b(r7)
            goto L64
        L28:
            kotlin.f.b(r7)     // Catch: java.lang.Throwable -> L2c
            goto L53
        L2c:
            r7 = move-exception
            goto L67
        L2e:
            kotlin.f.b(r7)     // Catch: java.lang.Throwable -> L2c
            goto L46
        L32:
            kotlin.f.b(r7)
            androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuToolbarHandlerNode r7 = r6.this$0     // Catch: java.lang.Throwable -> L2c
            kotlin.jvm.functions.Function1 r7 = r7.w3()     // Catch: java.lang.Throwable -> L2c
            if (r7 == 0) goto L46
            r6.label = r5     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r7 = r7.invoke(r6)     // Catch: java.lang.Throwable -> L2c
            if (r7 != r0) goto L46
            goto L79
        L46:
            com.google.android.mrc r7 = r6.$provider     // Catch: java.lang.Throwable -> L2c
            androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuToolbarHandlerNode r1 = r6.this$0     // Catch: java.lang.Throwable -> L2c
            r6.label = r4     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r7 = r7.a(r1, r6)     // Catch: java.lang.Throwable -> L2c
            if (r7 != r0) goto L53
            goto L79
        L53:
            androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuToolbarHandlerNode r7 = r6.this$0
            kotlin.jvm.functions.Function1 r7 = r7.v3()
            if (r7 == 0) goto L64
            r6.label = r3
            java.lang.Object r7 = r7.invoke(r6)
            if (r7 != r0) goto L64
            goto L79
        L64:
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        L67:
            androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuToolbarHandlerNode r1 = r6.this$0
            kotlin.jvm.functions.Function1 r1 = r1.v3()
            if (r1 == 0) goto L7c
            r6.L$0 = r7
            r6.label = r2
            java.lang.Object r1 = r1.invoke(r6)
            if (r1 != r0) goto L7a
        L79:
            return r0
        L7a:
            r0 = r7
        L7b:
            r7 = r0
        L7c:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p001foundation.text.contextmenu.modifier.TextContextMenuToolbarHandlerNode$show$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
