package androidx.p008glance.p010session;

import com.google.android.lq2;
import com.google.android.q22;
import com.google.android.ut0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", "", "it"}, k = 3, mv = {1, 8, 0}, xi = 48)
@lq2(c = "androidx.glance.session.SessionWorkerKt$runSession$5", f = "SessionWorker.kt", l = {}, m = "invokeSuspend")
final class SessionWorkerKt$runSession$5 extends SuspendLambda implements Function2<Boolean, q22<? super Boolean>, Object> {
    /* synthetic */ boolean Z$0;
    int label;

    SessionWorkerKt$runSession$5(q22<? super SessionWorkerKt$runSession$5> q22Var) {
        super(2, q22Var);
    }

    public final q22<Unit> create(Object obj, q22<?> q22Var) {
        SessionWorkerKt$runSession$5 sessionWorkerKt$runSession$5 = new SessionWorkerKt$runSession$5(q22Var);
        sessionWorkerKt$runSession$5.Z$0 = ((Boolean) obj).booleanValue();
        return sessionWorkerKt$runSession$5;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke(((Boolean) obj).booleanValue(), (q22<? super Boolean>) obj2);
    }

    public final Object invokeSuspend(Object obj) {
        a.g();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        return ut0.a(this.Z$0);
    }

    public final Object invoke(boolean z, q22<? super Boolean> q22Var) {
        return create(Boolean.valueOf(z), q22Var).invokeSuspend(Unit.a);
    }
}
