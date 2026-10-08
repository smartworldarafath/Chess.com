package androidx.p008glance.p010session;

import android.content.Context;
import com.google.android.rw0;
import com.google.inputmethod.l8d;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a<\u0010\u000b\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0082@¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/google/android/l8d;", "Landroid/content/Context;", "context", "Landroidx/glance/session/Session;", "session", "Landroidx/glance/session/d;", "timeouts", "Lkotlin/Function0;", "Lkotlinx/coroutines/s;", "effectJobFactory", "", "b", "(Lcom/google/android/l8d;Landroid/content/Context;Landroidx/glance/session/Session;Landroidx/glance/session/d;Lkotlin/jvm/functions/Function0;Lcom/google/android/q22;)Ljava/lang/Object;", "glance_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class SessionWorkerKt {

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"androidx/glance/session/SessionWorkerKt$a", "Lkotlin/coroutines/a;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "exception", "", "handleException", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a extends kotlin.coroutines.a implements CoroutineExceptionHandler {
        final /* synthetic */ l8d b;
        final /* synthetic */ Session c;
        final /* synthetic */ Context d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(CoroutineExceptionHandler.b bVar, l8d l8dVar, Session session, Context context) {
            super(bVar);
            this.b = l8dVar;
            this.c = session;
            this.d = context;
        }

        public void handleException(CoroutineContext context, Throwable exception) {
            l8d l8dVar = this.b;
            rw0.d(l8dVar, (CoroutineContext) null, (CoroutineStart) null, new C0235SessionWorkerKt$runSession$effectExceptionHandler$1$1(this.c, this.d, exception, l8dVar, null), 3, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0165, code lost:
    
        if (r8.k(r7, r6, r12) == r13) goto L41;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [com.google.android.pr1] */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v9, types: [com.google.android.pr1] */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v6, types: [androidx.compose.runtime.Recomposer] */
    /* JADX WARN: Type inference failed for: r3v7, types: [androidx.compose.runtime.Recomposer] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v6, types: [kotlinx.coroutines.s] */
    /* JADX WARN: Type inference failed for: r4v7, types: [kotlinx.coroutines.s] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlinx.coroutines.s] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(com.google.inputmethod.l8d r18, android.content.Context r19, androidx.p008glance.p010session.Session r20, androidx.p008glance.p010session.TimeoutOptions r21, kotlin.jvm.functions.Function0<? extends kotlinx.coroutines.s> r22, com.google.android.q22<? super kotlin.Unit> r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 409
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.p008glance.p010session.SessionWorkerKt.b(com.google.android.l8d, android.content.Context, androidx.glance.session.Session, androidx.glance.session.d, kotlin.jvm.functions.Function0, com.google.android.q22):java.lang.Object");
    }
}
