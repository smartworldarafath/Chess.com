package androidx.p008glance.p010session;

import android.content.Context;
import androidx.concurrent.futures.ListenableFutureKt;
import androidx.work.ExistingWorkPolicy;
import androidx.work.WorkInfo;
import androidx.work.WorkManager;
import androidx.work.b;
import androidx.work.d;
import com.google.android.q22;
import com.google.android.qjd;
import com.google.android.s47;
import com.google.android.ut0;
import com.google.inputmethod.gjb;
import com.google.inputmethod.t04;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.m;
import kotlin.coroutines.intrinsics.a;
import kotlin.f;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00005\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0097@¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0010\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011R \u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00040\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0013¨\u0006\u0015"}, d2 = {"androidx/glance/session/SessionManagerImpl$scope$1", "Lcom/google/android/gjb;", "Landroid/content/Context;", "context", "Landroidx/glance/session/Session;", "session", "", "c", "(Landroid/content/Context;Landroidx/glance/session/Session;Lcom/google/android/q22;)Ljava/lang/Object;", "", "key", "d", "(Ljava/lang/String;)Landroidx/glance/session/Session;", "", "b", "(Landroid/content/Context;Ljava/lang/String;Lcom/google/android/q22;)Ljava/lang/Object;", "a", "(Ljava/lang/String;Lcom/google/android/q22;)Ljava/lang/Object;", "", "Ljava/util/Map;", "sessions", "glance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SessionManagerImpl$scope$1 implements gjb {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Map<String, Session> sessions = new LinkedHashMap();
    final /* synthetic */ SessionManagerImpl b;

    SessionManagerImpl$scope$1(SessionManagerImpl sessionManagerImpl) {
        this.b = sessionManagerImpl;
    }

    @Override // com.google.inputmethod.gjb
    public Object a(String str, q22<? super Unit> q22Var) {
        Session sessionRemove = this.sessions.remove(str);
        if (sessionRemove != null) {
            sessionRemove.a();
        }
        return Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.google.inputmethod.gjb
    public Object b(Context context, String str, q22<? super Boolean> q22Var) throws Throwable {
        SessionManagerImpl$scope$1$isSessionRunning$1 sessionManagerImpl$scope$1$isSessionRunning$1;
        SessionManagerImpl$scope$1 sessionManagerImpl$scope$1;
        boolean z;
        if (q22Var instanceof SessionManagerImpl$scope$1$isSessionRunning$1) {
            sessionManagerImpl$scope$1$isSessionRunning$1 = (SessionManagerImpl$scope$1$isSessionRunning$1) q22Var;
            int i = sessionManagerImpl$scope$1$isSessionRunning$1.label;
            if ((i & t04.INVALID_ID) != 0) {
                sessionManagerImpl$scope$1$isSessionRunning$1.label = i - t04.INVALID_ID;
            } else {
                sessionManagerImpl$scope$1$isSessionRunning$1 = new SessionManagerImpl$scope$1$isSessionRunning$1(this, q22Var);
            }
        } else {
            sessionManagerImpl$scope$1$isSessionRunning$1 = new SessionManagerImpl$scope$1$isSessionRunning$1(this, q22Var);
        }
        Object objA = sessionManagerImpl$scope$1$isSessionRunning$1.result;
        Object objG = a.g();
        int i2 = sessionManagerImpl$scope$1$isSessionRunning$1.label;
        if (i2 == 0) {
            f.b(objA);
            s47 s47VarL = WorkManager.i(context).l(str);
            sessionManagerImpl$scope$1$isSessionRunning$1.L$0 = this;
            sessionManagerImpl$scope$1$isSessionRunning$1.L$1 = str;
            sessionManagerImpl$scope$1$isSessionRunning$1.label = 1;
            objA = ListenableFutureKt.a(s47VarL, sessionManagerImpl$scope$1$isSessionRunning$1);
            if (objA == objG) {
                return objG;
            }
            sessionManagerImpl$scope$1 = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) sessionManagerImpl$scope$1$isSessionRunning$1.L$1;
            sessionManagerImpl$scope$1 = (SessionManagerImpl$scope$1) sessionManagerImpl$scope$1$isSessionRunning$1.L$0;
            f.b(objA);
        }
        Iterable iterable = (Iterable) objA;
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                if (m.s(new WorkInfo.State[]{WorkInfo.State.b, WorkInfo.State.a}).contains(((WorkInfo) it.next()).a())) {
                    z = true;
                    break;
                }
            }
        } else {
            z = false;
            break;
        }
        Session session = sessionManagerImpl$scope$1.sessions.get(str);
        return ut0.a((session != null ? session.d() : false) && z);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.google.inputmethod.gjb
    public Object c(Context context, Session session, q22<? super Unit> q22Var) {
        SessionManagerImpl$scope$1$startSession$1 sessionManagerImpl$scope$1$startSession$1;
        SessionManagerImpl$scope$1 sessionManagerImpl$scope$1;
        if (q22Var instanceof SessionManagerImpl$scope$1$startSession$1) {
            sessionManagerImpl$scope$1$startSession$1 = (SessionManagerImpl$scope$1$startSession$1) q22Var;
            int i = sessionManagerImpl$scope$1$startSession$1.label;
            if ((i & t04.INVALID_ID) != 0) {
                sessionManagerImpl$scope$1$startSession$1.label = i - t04.INVALID_ID;
            } else {
                sessionManagerImpl$scope$1$startSession$1 = new SessionManagerImpl$scope$1$startSession$1(this, q22Var);
            }
        } else {
            sessionManagerImpl$scope$1$startSession$1 = new SessionManagerImpl$scope$1$startSession$1(this, q22Var);
        }
        Object obj = sessionManagerImpl$scope$1$startSession$1.result;
        Object objG = a.g();
        int i2 = sessionManagerImpl$scope$1$startSession$1.label;
        if (i2 == 0) {
            f.b(obj);
            Session sessionPut = this.sessions.put(session.getKey(), session);
            if (sessionPut != null) {
                sessionPut.a();
            }
            d.a aVar = new d.a(this.b.workerClass);
            Pair[] pairArr = {qjd.a(this.b.a(), session.getKey())};
            b.a aVar2 = new b.a();
            Pair pair = pairArr[0];
            aVar2.b((String) pair.c(), pair.d());
            b bVarA = aVar2.a();
            Intrinsics.checkNotNullExpressionValue(bVarA, "dataBuilder.build()");
            s47 result = WorkManager.i(context).g(session.getKey(), ExistingWorkPolicy.a, aVar.m(bVarA).b()).getResult();
            sessionManagerImpl$scope$1$startSession$1.L$0 = this;
            sessionManagerImpl$scope$1$startSession$1.L$1 = context;
            sessionManagerImpl$scope$1$startSession$1.label = 1;
            if (ListenableFutureKt.a(result, sessionManagerImpl$scope$1$startSession$1) == objG) {
                return objG;
            }
            sessionManagerImpl$scope$1 = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            context = (Context) sessionManagerImpl$scope$1$startSession$1.L$1;
            sessionManagerImpl$scope$1 = (SessionManagerImpl$scope$1) sessionManagerImpl$scope$1$startSession$1.L$0;
            f.b(obj);
        }
        sessionManagerImpl$scope$1.b.e(context);
        return Unit.a;
    }

    @Override // com.google.inputmethod.gjb
    public Session d(String key) {
        return this.sessions.get(key);
    }
}
