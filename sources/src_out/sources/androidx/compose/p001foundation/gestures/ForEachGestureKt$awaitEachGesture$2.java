package androidx.compose.p001foundation.gestures;

import com.google.android.lq2;
import com.google.android.q22;
import com.google.inputmethod.cc0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/cc0;", "", "<anonymous>", "(Lcom/google/android/cc0;)V"}, k = 3, mv = {2, 1, 0})
@lq2(c = "androidx.compose.foundation.gestures.ForEachGestureKt$awaitEachGesture$2", f = "ForEachGesture.kt", l = {102, 105, 110}, m = "invokeSuspend", v = 1)
final class ForEachGestureKt$awaitEachGesture$2 extends RestrictedSuspendLambda implements Function2<cc0, q22<? super Unit>, Object> {
    final /* synthetic */ Function2<cc0, q22<? super Unit>, Object> $block;
    final /* synthetic */ CoroutineContext $currentContext;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ForEachGestureKt$awaitEachGesture$2(CoroutineContext coroutineContext, Function2<? super cc0, ? super q22<? super Unit>, ? extends Object> function2, q22<? super ForEachGestureKt$awaitEachGesture$2> q22Var) {
        super(2, q22Var);
        this.$currentContext = coroutineContext;
        this.$block = function2;
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(cc0 cc0Var, q22<? super Unit> q22Var) {
        return create(cc0Var, q22Var).invokeSuspend(Unit.a);
    }

    public final q22<Unit> create(Object obj, q22<?> q22Var) {
        ForEachGestureKt$awaitEachGesture$2 forEachGestureKt$awaitEachGesture$2 = new ForEachGestureKt$awaitEachGesture$2(this.$currentContext, this.$block, q22Var);
        forEachGestureKt$awaitEachGesture$2.L$0 = obj;
        return forEachGestureKt$awaitEachGesture$2;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(4:40|21|(2:24|25)|34) */
    /* JADX WARN: Code duplicated, block: B:24:0x0051  */
    /* JADX WARN: Code duplicated, block: B:32:0x0069  */
    /* JADX WARN: Code duplicated, block: B:35:0x0074  */
    /* JADX WARN: Code duplicated, block: B:36:0x0075  */
    /* JADX WARN: Code duplicated, block: B:40:0x0044 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005a, code lost:
    
        if (r9 == r0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005d, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005e, code lost:
    
        r1 = r9;
        r9 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0071, code lost:
    
        if (androidx.compose.p001foundation.gestures.ForEachGestureKt.c(r1, null, r8, 1, null) == r0) goto L34;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.google.android.cc0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v3, types: [com.google.android.cc0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x005a -> B:12:0x0029). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0071 -> B:12:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.g()
            int r1 = r8.label
            r2 = 3
            r3 = 2
            r4 = 0
            r5 = 1
            if (r1 == 0) goto L35
            if (r1 == r5) goto L2d
            if (r1 == r3) goto L22
            if (r1 != r2) goto L1a
            java.lang.Object r1 = r8.L$0
            com.google.android.cc0 r1 = (com.google.inputmethod.cc0) r1
            kotlin.f.b(r9)
            goto L29
        L1a:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L22:
            java.lang.Object r1 = r8.L$0
            com.google.android.cc0 r1 = (com.google.inputmethod.cc0) r1
            kotlin.f.b(r9)     // Catch: java.util.concurrent.CancellationException -> L2b
        L29:
            r9 = r1
            goto L3c
        L2b:
            r9 = move-exception
            goto L61
        L2d:
            java.lang.Object r1 = r8.L$0
            com.google.android.cc0 r1 = (com.google.inputmethod.cc0) r1
            kotlin.f.b(r9)     // Catch: java.util.concurrent.CancellationException -> L2b
            goto L52
        L35:
            kotlin.f.b(r9)
            java.lang.Object r9 = r8.L$0
            com.google.android.cc0 r9 = (com.google.inputmethod.cc0) r9
        L3c:
            kotlin.coroutines.CoroutineContext r1 = r8.$currentContext
            boolean r1 = kotlinx.coroutines.u.n(r1)
            if (r1 == 0) goto L75
            kotlin.jvm.functions.Function2<com.google.android.cc0, com.google.android.q22<? super kotlin.Unit>, java.lang.Object> r1 = r8.$block     // Catch: java.util.concurrent.CancellationException -> L5d
            r8.L$0 = r9     // Catch: java.util.concurrent.CancellationException -> L5d
            r8.label = r5     // Catch: java.util.concurrent.CancellationException -> L5d
            java.lang.Object r1 = r1.invoke(r9, r8)     // Catch: java.util.concurrent.CancellationException -> L5d
            if (r1 != r0) goto L51
            goto L73
        L51:
            r1 = r9
        L52:
            r8.L$0 = r1     // Catch: java.util.concurrent.CancellationException -> L2b
            r8.label = r3     // Catch: java.util.concurrent.CancellationException -> L2b
            java.lang.Object r9 = androidx.compose.p001foundation.gestures.ForEachGestureKt.c(r1, r4, r8, r5, r4)     // Catch: java.util.concurrent.CancellationException -> L2b
            if (r9 != r0) goto L29
            goto L73
        L5d:
            r1 = move-exception
            r7 = r1
            r1 = r9
            r9 = r7
        L61:
            kotlin.coroutines.CoroutineContext r6 = r8.$currentContext
            boolean r6 = kotlinx.coroutines.u.n(r6)
            if (r6 == 0) goto L74
            r8.L$0 = r1
            r8.label = r2
            java.lang.Object r9 = androidx.compose.p001foundation.gestures.ForEachGestureKt.c(r1, r4, r8, r5, r4)
            if (r9 != r0) goto L29
        L73:
            return r0
        L74:
            throw r9
        L75:
            kotlin.Unit r9 = kotlin.Unit.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p001foundation.gestures.ForEachGestureKt$awaitEachGesture$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
