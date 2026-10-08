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
@lq2(c = "androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuGestureNode$tryShowContextMenu$1", f = "TextContextMenuGesturesModifier.kt", l = {107, 108}, m = "invokeSuspend", v = 1)
final class TextContextMenuGestureNode$tryShowContextMenu$1 extends SuspendLambda implements Function2<ta2, q22<? super Unit>, Object> {
    final /* synthetic */ TextContextMenuGestureNode.a $dataProvider;
    final /* synthetic */ long $localClickOffset;
    final /* synthetic */ mrc $provider;
    int label;
    final /* synthetic */ TextContextMenuGestureNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TextContextMenuGestureNode$tryShowContextMenu$1(TextContextMenuGestureNode textContextMenuGestureNode, long j, mrc mrcVar, TextContextMenuGestureNode.a aVar, q22<? super TextContextMenuGestureNode$tryShowContextMenu$1> q22Var) {
        super(2, q22Var);
        this.this$0 = textContextMenuGestureNode;
        this.$localClickOffset = j;
        this.$provider = mrcVar;
        this.$dataProvider = aVar;
    }

    public final q22<Unit> create(Object obj, q22<?> q22Var) {
        return new TextContextMenuGestureNode$tryShowContextMenu$1(this.this$0, this.$localClickOffset, this.$provider, this.$dataProvider, q22Var);
    }

    public final Object invoke(ta2 ta2Var, q22<? super Unit> q22Var) {
        return create(ta2Var, q22Var).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0042, code lost:
    
        if (r7.a(r1, r6) == r0) goto L17;
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
            goto L45
        L12:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1a:
            kotlin.f.b(r7)
            goto L38
        L1e:
            kotlin.f.b(r7)
            androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuGestureNode r7 = r6.this$0
            kotlin.jvm.functions.Function2 r7 = androidx.compose.p001foundation.text.contextmenu.modifier.TextContextMenuGestureNode.t3(r7)
            if (r7 == 0) goto L38
            long r4 = r6.$localClickOffset
            com.google.android.rn8 r1 = com.google.inputmethod.rn8.d(r4)
            r6.label = r3
            java.lang.Object r7 = r7.invoke(r1, r6)
            if (r7 != r0) goto L38
            goto L44
        L38:
            com.google.android.mrc r7 = r6.$provider
            androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuGestureNode$a r1 = r6.$dataProvider
            r6.label = r2
            java.lang.Object r7 = r7.a(r1, r6)
            if (r7 != r0) goto L45
        L44:
            return r0
        L45:
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p001foundation.text.contextmenu.modifier.TextContextMenuGestureNode$tryShowContextMenu$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
