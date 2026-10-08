package androidx.compose.p001foundation.text.contextmenu.gestures;

import com.google.android.lq2;
import com.google.android.q22;
import com.google.inputmethod.cc0;
import com.google.inputmethod.rn8;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/cc0;", "", "<anonymous>", "(Lcom/google/android/cc0;)V"}, k = 3, mv = {2, 1, 0})
@lq2(c = "androidx.compose.foundation.text.contextmenu.gestures.RightClickGesturesKt$onRightClickDown$2", f = "RightClickGestures.kt", l = {32, 35}, m = "invokeSuspend", v = 1)
final class RightClickGesturesKt$onRightClickDown$2 extends RestrictedSuspendLambda implements Function2<cc0, q22<? super Unit>, Object> {
    final /* synthetic */ Function1<rn8, Unit> $onDown;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    RightClickGesturesKt$onRightClickDown$2(Function1<? super rn8, Unit> function1, q22<? super RightClickGesturesKt$onRightClickDown$2> q22Var) {
        super(2, q22Var);
        this.$onDown = function1;
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(cc0 cc0Var, q22<? super Unit> q22Var) {
        return create(cc0Var, q22Var).invokeSuspend(Unit.a);
    }

    public final q22<Unit> create(Object obj, q22<?> q22Var) {
        RightClickGesturesKt$onRightClickDown$2 rightClickGesturesKt$onRightClickDown$2 = new RightClickGesturesKt$onRightClickDown$2(this.$onDown, q22Var);
        rightClickGesturesKt$onRightClickDown$2.L$0 = obj;
        return rightClickGesturesKt$onRightClickDown$2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0050, code lost:
    
        if (r8 == r0) goto L15;
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
            if (r1 == 0) goto L22
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            kotlin.f.b(r8)
            goto L53
        L12:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1a:
            java.lang.Object r1 = r7.L$0
            com.google.android.cc0 r1 = (com.google.inputmethod.cc0) r1
            kotlin.f.b(r8)
            goto L35
        L22:
            kotlin.f.b(r8)
            java.lang.Object r8 = r7.L$0
            r1 = r8
            com.google.android.cc0 r1 = (com.google.inputmethod.cc0) r1
            r7.L$0 = r1
            r7.label = r3
            java.lang.Object r8 = androidx.compose.p001foundation.text.contextmenu.gestures.RightClickGesturesKt.a(r1, r7)
            if (r8 != r0) goto L35
            goto L52
        L35:
            androidx.compose.ui.input.pointer.i r8 = (androidx.compose.ui.input.pointer.PointerInputChange) r8
            r8.a()
            kotlin.jvm.functions.Function1<com.google.android.rn8, kotlin.Unit> r4 = r7.$onDown
            long r5 = r8.getPosition()
            com.google.android.rn8 r8 = com.google.inputmethod.rn8.d(r5)
            r4.invoke(r8)
            r8 = 0
            r7.L$0 = r8
            r7.label = r2
            java.lang.Object r8 = androidx.compose.p001foundation.gestures.TapGestureDetectorKt.r(r1, r8, r7, r3, r8)
            if (r8 != r0) goto L53
        L52:
            return r0
        L53:
            androidx.compose.ui.input.pointer.i r8 = (androidx.compose.ui.input.pointer.PointerInputChange) r8
            if (r8 == 0) goto L5a
            r8.a()
        L5a:
            kotlin.Unit r8 = kotlin.Unit.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p001foundation.text.contextmenu.gestures.RightClickGesturesKt$onRightClickDown$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
