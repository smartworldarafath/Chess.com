package androidx.compose.p001foundation.text.selection;

import com.google.android.lq2;
import com.google.android.q22;
import com.google.inputmethod.cc0;
import com.google.inputmethod.gsc;
import com.google.inputmethod.j08;
import com.google.inputmethod.me1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/cc0;", "", "<anonymous>", "(Lcom/google/android/cc0;)V"}, k = 3, mv = {2, 1, 0})
@lq2(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt$awaitSelectionGestures$2", f = "SelectionGestures.kt", l = {111, 119, 122, 124}, m = "invokeSuspend", v = 1)
final class SelectionGesturesKt$awaitSelectionGestures$2 extends RestrictedSuspendLambda implements Function2<cc0, q22<? super Unit>, Object> {
    final /* synthetic */ me1 $clicksCounter;
    final /* synthetic */ j08 $mouseSelectionObserver;
    final /* synthetic */ gsc $textDragObserver;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SelectionGesturesKt$awaitSelectionGestures$2(me1 me1Var, j08 j08Var, gsc gscVar, q22<? super SelectionGesturesKt$awaitSelectionGestures$2> q22Var) {
        super(2, q22Var);
        this.$clicksCounter = me1Var;
        this.$mouseSelectionObserver = j08Var;
        this.$textDragObserver = gscVar;
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(cc0 cc0Var, q22<? super Unit> q22Var) {
        return create(cc0Var, q22Var).invokeSuspend(Unit.a);
    }

    public final q22<Unit> create(Object obj, q22<?> q22Var) {
        SelectionGesturesKt$awaitSelectionGestures$2 selectionGesturesKt$awaitSelectionGestures$2 = new SelectionGesturesKt$awaitSelectionGestures$2(this.$clicksCounter, this.$mouseSelectionObserver, this.$textDragObserver, q22Var);
        selectionGesturesKt$awaitSelectionGestures$2.L$0 = obj;
        return selectionGesturesKt$awaitSelectionGestures$2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x007c, code lost:
    
        if (androidx.compose.p001foundation.text.selection.SelectionGesturesKt.k(r1, r2, r3, r13, r12) == r0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0093, code lost:
    
        if (androidx.compose.p001foundation.text.selection.SelectionGesturesKt.n(r1, r2, r13, r12) == r0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a6, code lost:
    
        if (androidx.compose.p001foundation.text.selection.SelectionGesturesKt.p(r1, r3, r13, r4, r12) == r0) goto L37;
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
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L2a
            if (r1 == r5) goto L22
            if (r1 == r4) goto L1d
            if (r1 == r3) goto L1d
            if (r1 != r2) goto L15
            goto L1d
        L15:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L1d:
            kotlin.f.b(r13)
            goto La9
        L22:
            java.lang.Object r1 = r12.L$0
            com.google.android.cc0 r1 = (com.google.inputmethod.cc0) r1
            kotlin.f.b(r13)
            goto L3d
        L2a:
            kotlin.f.b(r13)
            java.lang.Object r13 = r12.L$0
            r1 = r13
            com.google.android.cc0 r1 = (com.google.inputmethod.cc0) r1
            r12.L$0 = r1
            r12.label = r5
            java.lang.Object r13 = androidx.compose.p001foundation.text.selection.SelectionGesturesKt.e(r1, r12)
            if (r13 != r0) goto L3d
            goto La8
        L3d:
            androidx.compose.ui.input.pointer.e r13 = (androidx.compose.ui.input.pointer.e) r13
            com.google.android.me1 r6 = r12.$clicksCounter
            r6.d(r13)
            boolean r6 = androidx.compose.p001foundation.text.selection.j.b(r13)
            r7 = 0
            if (r6 == 0) goto L7f
            int r8 = r13.getButtons()
            boolean r8 = com.google.inputmethod.ke9.c(r8)
            if (r8 == 0) goto L7f
            java.util.List r8 = r13.c()
            int r9 = r8.size()
            r10 = 0
        L5e:
            if (r10 >= r9) goto L70
            java.lang.Object r11 = r8.get(r10)
            androidx.compose.ui.input.pointer.i r11 = (androidx.compose.ui.input.pointer.PointerInputChange) r11
            boolean r11 = r11.q()
            if (r11 == 0) goto L6d
            goto L7f
        L6d:
            int r10 = r10 + 1
            goto L5e
        L70:
            com.google.android.j08 r2 = r12.$mouseSelectionObserver
            com.google.android.me1 r3 = r12.$clicksCounter
            r12.L$0 = r7
            r12.label = r4
            java.lang.Object r13 = androidx.compose.p001foundation.text.selection.SelectionGesturesKt.k(r1, r2, r3, r13, r12)
            if (r13 != r0) goto La9
            goto La8
        L7f:
            if (r6 != 0) goto La9
            com.google.android.me1 r4 = r12.$clicksCounter
            int r4 = r4.getClicks()
            if (r4 != r5) goto L96
            com.google.android.gsc r2 = r12.$textDragObserver
            r12.L$0 = r7
            r12.label = r3
            java.lang.Object r13 = androidx.compose.p001foundation.text.selection.SelectionGesturesKt.n(r1, r2, r13, r12)
            if (r13 != r0) goto La9
            goto La8
        L96:
            com.google.android.gsc r3 = r12.$textDragObserver
            com.google.android.me1 r4 = r12.$clicksCounter
            int r4 = r4.getClicks()
            r12.L$0 = r7
            r12.label = r2
            java.lang.Object r13 = androidx.compose.p001foundation.text.selection.SelectionGesturesKt.g(r1, r3, r13, r4, r12)
            if (r13 != r0) goto La9
        La8:
            return r0
        La9:
            kotlin.Unit r13 = kotlin.Unit.a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p001foundation.text.selection.SelectionGesturesKt$awaitSelectionGestures$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
