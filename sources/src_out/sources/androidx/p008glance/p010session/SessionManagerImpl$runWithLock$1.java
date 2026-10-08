package androidx.p008glance.p010session;

import com.google.android.lq2;
import com.google.android.q22;
import com.google.inputmethod.t04;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@lq2(c = "androidx.glance.session.SessionManagerImpl", f = "SessionManager.kt", l = {174, 148}, m = "runWithLock")
final class SessionManagerImpl$runWithLock$1<T> extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SessionManagerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SessionManagerImpl$runWithLock$1(SessionManagerImpl sessionManagerImpl, q22<? super SessionManagerImpl$runWithLock$1> q22Var) {
        super(q22Var);
        this.this$0 = sessionManagerImpl;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= t04.INVALID_ID;
        return this.this$0.b(null, this);
    }
}
