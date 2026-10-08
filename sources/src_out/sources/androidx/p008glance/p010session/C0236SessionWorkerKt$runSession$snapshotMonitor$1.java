package androidx.p008glance.p010session;

import com.google.android.lq2;
import com.google.android.q22;
import com.google.android.ta2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: androidx.glance.session.SessionWorkerKt$runSession$snapshotMonitor$1, reason: from Kotlin metadata and case insensitive filesystem */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/ta2;", "", "<anonymous>", "(Lcom/google/android/ta2;)V"}, k = 3, mv = {1, 8, 0})
@lq2(c = "androidx.glance.session.SessionWorkerKt$runSession$snapshotMonitor$1", f = "SessionWorker.kt", l = {162}, m = "invokeSuspend")
final class C0236SessionWorkerKt$runSession$snapshotMonitor$1 extends SuspendLambda implements Function2<ta2, q22<? super Unit>, Object> {
    int label;

    C0236SessionWorkerKt$runSession$snapshotMonitor$1(q22<? super C0236SessionWorkerKt$runSession$snapshotMonitor$1> q22Var) {
        super(2, q22Var);
    }

    public final q22<Unit> create(Object obj, q22<?> q22Var) {
        return new C0236SessionWorkerKt$runSession$snapshotMonitor$1(q22Var);
    }

    public final Object invoke(ta2 ta2Var, q22<? super Unit> q22Var) {
        return create(ta2Var, q22Var).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        Object objG = a.g();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            this.label = 1;
            if (GlobalSnapshotManagerKt.a(this) == objG) {
                return objG;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        }
        return Unit.a;
    }
}
