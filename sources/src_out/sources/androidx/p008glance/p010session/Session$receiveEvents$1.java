package androidx.p008glance.p010session;

import com.google.android.lq2;
import com.google.android.q22;
import com.google.inputmethod.t04;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@lq2(c = "androidx.glance.session.Session", f = "Session.kt", l = {87, 89}, m = "receiveEvents")
final class Session$receiveEvents$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ Session this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Session$receiveEvents$1(Session session, q22<? super Session$receiveEvents$1> q22Var) {
        super(q22Var);
        this.this$0 = session;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= t04.INVALID_ID;
        return this.this$0.k(null, null, this);
    }
}
