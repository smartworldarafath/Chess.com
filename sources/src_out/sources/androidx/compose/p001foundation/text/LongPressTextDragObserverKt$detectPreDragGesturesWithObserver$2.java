package androidx.compose.p001foundation.text;

import com.google.android.lq2;
import com.google.android.q22;
import com.google.inputmethod.cc0;
import com.google.inputmethod.gsc;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/cc0;", "", "<anonymous>", "(Lcom/google/android/cc0;)V"}, k = 3, mv = {2, 1, 0})
@lq2(c = "androidx.compose.foundation.text.LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2", f = "LongPressTextDragObserver.kt", l = {77, 81}, m = "invokeSuspend", v = 1)
final class LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2 extends RestrictedSuspendLambda implements Function2<cc0, q22<? super Unit>, Object> {
    final /* synthetic */ gsc $observer;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2(gsc gscVar, q22<? super LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2> q22Var) {
        super(2, q22Var);
        this.$observer = gscVar;
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(cc0 cc0Var, q22<? super Unit> q22Var) {
        return create(cc0Var, q22Var).invokeSuspend(Unit.a);
    }

    public final q22<Unit> create(Object obj, q22<?> q22Var) {
        LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2 longPressTextDragObserverKt$detectPreDragGesturesWithObserver$2 = new LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2(this.$observer, q22Var);
        longPressTextDragObserverKt$detectPreDragGesturesWithObserver$2.L$0 = obj;
        return longPressTextDragObserverKt$detectPreDragGesturesWithObserver$2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x005d, code lost:
    
        if (r14 == r0) goto L17;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x005d -> B:18:0x0060). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.g()
            int r1 = r13.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L2c
            if (r1 == r3) goto L23
            if (r1 != r2) goto L1b
            java.lang.Object r1 = r13.L$1
            androidx.compose.ui.input.pointer.i r1 = (androidx.compose.ui.input.pointer.PointerInputChange) r1
            java.lang.Object r4 = r13.L$0
            com.google.android.cc0 r4 = (com.google.inputmethod.cc0) r4
            kotlin.f.b(r14)
            r7 = r13
            goto L60
        L1b:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L23:
            java.lang.Object r1 = r13.L$0
            com.google.android.cc0 r1 = (com.google.inputmethod.cc0) r1
            kotlin.f.b(r14)
            r7 = r13
            goto L45
        L2c:
            kotlin.f.b(r14)
            java.lang.Object r14 = r13.L$0
            r4 = r14
            com.google.android.cc0 r4 = (com.google.inputmethod.cc0) r4
            r13.L$0 = r4
            r13.label = r3
            r5 = 0
            r6 = 0
            r8 = 2
            r9 = 0
            r7 = r13
            java.lang.Object r14 = androidx.compose.p001foundation.gestures.TapGestureDetectorKt.d(r4, r5, r6, r7, r8, r9)
            if (r14 != r0) goto L44
            goto L5f
        L44:
            r1 = r4
        L45:
            androidx.compose.ui.input.pointer.i r14 = (androidx.compose.ui.input.pointer.PointerInputChange) r14
            com.google.android.gsc r4 = r7.$observer
            long r5 = r14.getPosition()
            r4.a(r5)
            r4 = r1
            r1 = r14
        L52:
            r7.L$0 = r4
            r7.L$1 = r1
            r7.label = r2
            r14 = 0
            java.lang.Object r14 = com.google.inputmethod.cc0.E1(r4, r14, r13, r3, r14)
            if (r14 != r0) goto L60
        L5f:
            return r0
        L60:
            androidx.compose.ui.input.pointer.e r14 = (androidx.compose.ui.input.pointer.e) r14
            java.util.List r14 = r14.c()
            int r5 = r14.size()
            r6 = 0
        L6b:
            if (r6 >= r5) goto L8b
            java.lang.Object r8 = r14.get(r6)
            androidx.compose.ui.input.pointer.i r8 = (androidx.compose.ui.input.pointer.PointerInputChange) r8
            long r9 = r8.getId()
            long r11 = r1.getId()
            boolean r9 = com.google.inputmethod.se9.b(r9, r11)
            if (r9 == 0) goto L88
            boolean r8 = r8.getPressed()
            if (r8 == 0) goto L88
            goto L52
        L88:
            int r6 = r6 + 1
            goto L6b
        L8b:
            com.google.android.gsc r14 = r7.$observer
            r14.d()
            kotlin.Unit r14 = kotlin.Unit.a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p001foundation.text.LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
