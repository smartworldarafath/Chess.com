package androidx.p008glance.p010session;

import com.google.android.lq2;
import com.google.android.q22;
import com.google.inputmethod.gjb;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/gjb;", "Landroidx/glance/session/Session;", "<anonymous>", "(Lcom/google/android/gjb;)Landroidx/glance/session/Session;"}, k = 3, mv = {1, 8, 0})
@lq2(c = "androidx.glance.session.SessionWorker$doWork$2$2$session$1", f = "SessionWorker.kt", l = {}, m = "invokeSuspend")
final class SessionWorker$doWork$2$2$session$1 extends SuspendLambda implements Function2<gjb, q22<? super Session>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SessionWorker this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SessionWorker$doWork$2$2$session$1(SessionWorker sessionWorker, q22<? super SessionWorker$doWork$2$2$session$1> q22Var) {
        super(2, q22Var);
        this.this$0 = sessionWorker;
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(gjb gjbVar, q22<? super Session> q22Var) {
        return create(gjbVar, q22Var).invokeSuspend(Unit.a);
    }

    public final q22<Unit> create(Object obj, q22<?> q22Var) {
        SessionWorker$doWork$2$2$session$1 sessionWorker$doWork$2$2$session$1 = new SessionWorker$doWork$2$2$session$1(this.this$0, q22Var);
        sessionWorker$doWork$2$2$session$1.L$0 = obj;
        return sessionWorker$doWork$2$2$session$1;
    }

    public final Object invokeSuspend(Object obj) {
        a.g();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        return ((gjb) this.L$0).d(this.this$0.key);
    }
}
