package androidx.compose.p004runtime;

import com.google.android.lq2;
import com.google.android.q22;
import com.google.android.ui4;
import com.google.inputmethod.hwb;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lcom/google/android/ui4;", "", "<anonymous>", "(Lcom/google/android/ui4;)V"}, k = 3, mv = {2, 1, 0})
@lq2(c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$snapshotFlowImpl$1", f = "SnapshotFlow.kt", l = {476, 479, 484}, m = "invokeSuspend", v = 1)
final class SnapshotStateKt__SnapshotFlowKt$snapshotFlowImpl$1<T> extends SuspendLambda implements Function2<ui4<? super T>, q22<? super Unit>, Object> {
    final /* synthetic */ Function0<T> $block;
    final /* synthetic */ hwb $externalManager;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SnapshotStateKt__SnapshotFlowKt$snapshotFlowImpl$1(hwb hwbVar, Function0<? extends T> function0, q22<? super SnapshotStateKt__SnapshotFlowKt$snapshotFlowImpl$1> q22Var) {
        super(2, q22Var);
        this.$externalManager = hwbVar;
        this.$block = function0;
    }

    public final q22<Unit> create(Object obj, q22<?> q22Var) {
        SnapshotStateKt__SnapshotFlowKt$snapshotFlowImpl$1 snapshotStateKt__SnapshotFlowKt$snapshotFlowImpl$1 = new SnapshotStateKt__SnapshotFlowKt$snapshotFlowImpl$1(this.$externalManager, this.$block, q22Var);
        snapshotStateKt__SnapshotFlowKt$snapshotFlowImpl$1.L$0 = obj;
        return snapshotStateKt__SnapshotFlowKt$snapshotFlowImpl$1;
    }

    public final Object invoke(ui4<? super T> ui4Var, q22<? super Unit> q22Var) {
        return create(ui4Var, q22Var).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0080  */
    /* JADX WARN: Code duplicated, block: B:28:0x0081 A[Catch: all -> 0x0023, PHI: r1 r4 r5 r6
  0x0081: PHI (r1v5 java.lang.Object) = (r1v4 java.lang.Object), (r1v9 java.lang.Object) binds: [B:26:0x007e, B:15:0x003c] A[DONT_GENERATE, DONT_INLINE]
  0x0081: PHI (r4v7 ??) = (r4v12 ??), (r4v13 ??) binds: [B:26:0x007e, B:15:0x003c] A[DONT_GENERATE, DONT_INLINE]
  0x0081: PHI (r5v4 com.google.android.hwb) = (r5v9 com.google.android.hwb), (r5v10 com.google.android.hwb) binds: [B:26:0x007e, B:15:0x003c] A[DONT_GENERATE, DONT_INLINE]
  0x0081: PHI (r6v3 com.google.android.ui4) = (r6v2 com.google.android.ui4), (r6v7 com.google.android.ui4) binds: [B:26:0x007e, B:15:0x003c] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {all -> 0x0023, blocks: (B:15:0x003c, B:28:0x0081, B:25:0x0070, B:30:0x008d, B:8:0x001f), top: B:42:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x008d A[Catch: all -> 0x0023, TRY_LEAVE, TryCatch #1 {all -> 0x0023, blocks: (B:15:0x003c, B:28:0x0081, B:25:0x0070, B:30:0x008d, B:8:0x001f), top: B:42:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x009e  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object, kotlinx.coroutines.channels.h] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x008b -> B:25:0x0070). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x009e -> B:25:0x0070). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.g()
            int r1 = r8.label
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L40
            if (r1 == r4) goto L11
            if (r1 == r3) goto L2e
            if (r1 != r2) goto L26
        L11:
            java.lang.Object r1 = r8.L$3
            java.lang.Object r4 = r8.L$2
            com.google.android.h81 r4 = (com.google.android.h81) r4
            java.lang.Object r5 = r8.L$1
            com.google.android.hwb r5 = (com.google.inputmethod.hwb) r5
            java.lang.Object r6 = r8.L$0
            com.google.android.ui4 r6 = (com.google.android.ui4) r6
            kotlin.f.b(r9)     // Catch: java.lang.Throwable -> L23
            goto L70
        L23:
            r9 = move-exception
            goto La3
        L26:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L2e:
            java.lang.Object r1 = r8.L$3
            java.lang.Object r4 = r8.L$2
            com.google.android.h81 r4 = (com.google.android.h81) r4
            java.lang.Object r5 = r8.L$1
            com.google.android.hwb r5 = (com.google.inputmethod.hwb) r5
            java.lang.Object r6 = r8.L$0
            com.google.android.ui4 r6 = (com.google.android.ui4) r6
            kotlin.f.b(r9)     // Catch: java.lang.Throwable -> L23
            goto L81
        L40:
            kotlin.f.b(r9)
            java.lang.Object r9 = r8.L$0
            r6 = r9
            com.google.android.ui4 r6 = (com.google.android.ui4) r6
            com.google.android.hwb r9 = r8.$externalManager
            if (r9 != 0) goto L51
            com.google.android.hwb r9 = new com.google.android.hwb
            r9.<init>()
        L51:
            r5 = r9
            r9 = 6
            r1 = 0
            com.google.android.h81 r9 = com.google.android.p81.b(r4, r1, r1, r9, r1)
            kotlin.jvm.functions.Function0<T> r1 = r8.$block     // Catch: java.lang.Throwable -> La0
            java.lang.Object r1 = r5.c(r9, r1)     // Catch: java.lang.Throwable -> La0
            r8.L$0 = r6     // Catch: java.lang.Throwable -> La0
            r8.L$1 = r5     // Catch: java.lang.Throwable -> La0
            r8.L$2 = r9     // Catch: java.lang.Throwable -> La0
            r8.L$3 = r1     // Catch: java.lang.Throwable -> La0
            r8.label = r4     // Catch: java.lang.Throwable -> La0
            java.lang.Object r4 = r6.emit(r1, r8)     // Catch: java.lang.Throwable -> La0
            if (r4 != r0) goto L6f
            goto L9d
        L6f:
            r4 = r9
        L70:
            r8.L$0 = r6     // Catch: java.lang.Throwable -> L23
            r8.L$1 = r5     // Catch: java.lang.Throwable -> L23
            r8.L$2 = r4     // Catch: java.lang.Throwable -> L23
            r8.L$3 = r1     // Catch: java.lang.Throwable -> L23
            r8.label = r3     // Catch: java.lang.Throwable -> L23
            java.lang.Object r9 = r4.c(r8)     // Catch: java.lang.Throwable -> L23
            if (r9 != r0) goto L81
            goto L9d
        L81:
            kotlin.jvm.functions.Function0<T> r9 = r8.$block     // Catch: java.lang.Throwable -> L23
            java.lang.Object r9 = r5.c(r4, r9)     // Catch: java.lang.Throwable -> L23
            boolean r7 = kotlin.jvm.internal.Intrinsics.e(r9, r1)     // Catch: java.lang.Throwable -> L23
            if (r7 != 0) goto L70
            r8.L$0 = r6     // Catch: java.lang.Throwable -> L23
            r8.L$1 = r5     // Catch: java.lang.Throwable -> L23
            r8.L$2 = r4     // Catch: java.lang.Throwable -> L23
            r8.L$3 = r9     // Catch: java.lang.Throwable -> L23
            r8.label = r2     // Catch: java.lang.Throwable -> L23
            java.lang.Object r1 = r6.emit(r9, r8)     // Catch: java.lang.Throwable -> L23
            if (r1 != r0) goto L9e
        L9d:
            return r0
        L9e:
            r1 = r9
            goto L70
        La0:
            r0 = move-exception
            r4 = r9
            r9 = r0
        La3:
            r5.b(r4)
            com.google.android.hwb r0 = r8.$externalManager
            if (r0 != 0) goto Lad
            r5.a()
        Lad:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p004runtime.SnapshotStateKt__SnapshotFlowKt$snapshotFlowImpl$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
