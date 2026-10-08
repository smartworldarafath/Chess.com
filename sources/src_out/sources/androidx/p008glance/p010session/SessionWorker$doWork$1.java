package androidx.p008glance.p010session;

import com.google.android.lq2;
import com.google.android.q22;
import com.google.inputmethod.t04;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@lq2(c = "androidx.glance.session.SessionWorker", f = "SessionWorker.kt", l = {98}, m = "doWork")
final class SessionWorker$doWork$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SessionWorker this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SessionWorker$doWork$1(SessionWorker sessionWorker, q22<? super SessionWorker$doWork$1> q22Var) {
        super(q22Var);
        this.this$0 = sessionWorker;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= t04.INVALID_ID;
        return this.this$0.c(this);
    }
}
