package androidx.compose.p001foundation.gestures;

import androidx.compose.ui.input.pointer.PointerInputChange;
import com.google.android.lq2;
import com.google.android.ps4;
import com.google.android.q22;
import com.google.inputmethod.cc0;
import com.google.inputmethod.rn8;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/cc0;", "", "<anonymous>", "(Lcom/google/android/cc0;)V"}, k = 3, mv = {2, 1, 0})
@lq2(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$13", f = "DragGestureDetector.kt", l = {248, 249}, m = "invokeSuspend", v = 1)
final class DragGestureDetectorKt$detectDragGestures$13 extends RestrictedSuspendLambda implements Function2<cc0, q22<? super Unit>, Object> {
    final /* synthetic */ Function2<PointerInputChange, rn8, Unit> $onDrag;
    final /* synthetic */ Function0<Unit> $onDragCancel;
    final /* synthetic */ Function1<PointerInputChange, Unit> $onDragEnd;
    final /* synthetic */ ps4<PointerInputChange, PointerInputChange, rn8, Unit> $onDragStart;
    final /* synthetic */ Orientation $orientationLock;
    final /* synthetic */ Function0<Boolean> $shouldAwaitTouchSlop;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    DragGestureDetectorKt$detectDragGestures$13(Function0<Boolean> function0, Orientation orientation, ps4<? super PointerInputChange, ? super PointerInputChange, ? super rn8, Unit> ps4Var, Function2<? super PointerInputChange, ? super rn8, Unit> function2, Function0<Unit> function1, Function1<? super PointerInputChange, Unit> function3, q22<? super DragGestureDetectorKt$detectDragGestures$13> q22Var) {
        super(2, q22Var);
        this.$shouldAwaitTouchSlop = function0;
        this.$orientationLock = orientation;
        this.$onDragStart = ps4Var;
        this.$onDrag = function2;
        this.$onDragCancel = function1;
        this.$onDragEnd = function3;
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(cc0 cc0Var, q22<? super Unit> q22Var) {
        return create(cc0Var, q22Var).invokeSuspend(Unit.a);
    }

    public final q22<Unit> create(Object obj, q22<?> q22Var) {
        DragGestureDetectorKt$detectDragGestures$13 dragGestureDetectorKt$detectDragGestures$13 = new DragGestureDetectorKt$detectDragGestures$13(this.$shouldAwaitTouchSlop, this.$orientationLock, this.$onDragStart, this.$onDrag, this.$onDragCancel, this.$onDragEnd, q22Var);
        dragGestureDetectorKt$detectDragGestures$13.L$0 = obj;
        return dragGestureDetectorKt$detectDragGestures$13;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0052, code lost:
    
        if (androidx.compose.p001foundation.gestures.DragGestureDetectorKt.x(r3, (androidx.compose.ui.input.pointer.PointerInputChange) r13, r5, r6, r7, r8, r9, r10, r12) == r0) goto L16;
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
            if (r1 == 0) goto L23
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            kotlin.f.b(r13)
            goto L55
        L12:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L1a:
            java.lang.Object r1 = r12.L$0
            com.google.android.cc0 r1 = (com.google.inputmethod.cc0) r1
            kotlin.f.b(r13)
        L21:
            r3 = r1
            goto L39
        L23:
            kotlin.f.b(r13)
            java.lang.Object r13 = r12.L$0
            r1 = r13
            com.google.android.cc0 r1 = (com.google.inputmethod.cc0) r1
            androidx.compose.ui.input.pointer.PointerEventPass r13 = androidx.compose.ui.input.pointer.PointerEventPass.Initial
            r12.L$0 = r1
            r12.label = r3
            r3 = 0
            java.lang.Object r13 = androidx.compose.p001foundation.gestures.TapGestureDetectorKt.c(r1, r3, r13, r12)
            if (r13 != r0) goto L21
            goto L54
        L39:
            r4 = r13
            androidx.compose.ui.input.pointer.i r4 = (androidx.compose.ui.input.pointer.PointerInputChange) r4
            kotlin.jvm.functions.Function0<java.lang.Boolean> r5 = r12.$shouldAwaitTouchSlop
            androidx.compose.foundation.gestures.Orientation r6 = r12.$orientationLock
            com.google.android.ps4<androidx.compose.ui.input.pointer.i, androidx.compose.ui.input.pointer.i, com.google.android.rn8, kotlin.Unit> r7 = r12.$onDragStart
            kotlin.jvm.functions.Function2<androidx.compose.ui.input.pointer.i, com.google.android.rn8, kotlin.Unit> r8 = r12.$onDrag
            kotlin.jvm.functions.Function0<kotlin.Unit> r9 = r12.$onDragCancel
            kotlin.jvm.functions.Function1<androidx.compose.ui.input.pointer.i, kotlin.Unit> r10 = r12.$onDragEnd
            r13 = 0
            r12.L$0 = r13
            r12.label = r2
            r11 = r12
            java.lang.Object r13 = androidx.compose.p001foundation.gestures.DragGestureDetectorKt.x(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            if (r13 != r0) goto L55
        L54:
            return r0
        L55:
            kotlin.Unit r13 = kotlin.Unit.a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p001foundation.gestures.DragGestureDetectorKt$detectDragGestures$13.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
