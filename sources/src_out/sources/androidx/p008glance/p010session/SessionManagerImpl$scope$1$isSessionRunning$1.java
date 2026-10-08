package androidx.p008glance.p010session;

import com.google.android.lq2;
import com.google.android.q22;
import com.google.inputmethod.t04;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@lq2(c = "androidx.glance.session.SessionManagerImpl$scope$1", f = "SessionManager.kt", l = {132}, m = "isSessionRunning")
final class SessionManagerImpl$scope$1$isSessionRunning$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SessionManagerImpl$scope$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SessionManagerImpl$scope$1$isSessionRunning$1(SessionManagerImpl$scope$1 sessionManagerImpl$scope$1, q22<? super SessionManagerImpl$scope$1$isSessionRunning$1> q22Var) {
        super(q22Var);
        this.this$0 = sessionManagerImpl$scope$1;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= t04.INVALID_ID;
        return this.this$0.b(null, null, this);
    }
}
