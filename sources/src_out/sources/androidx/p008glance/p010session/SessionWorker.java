package androidx.p008glance.p010session;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import androidx.work.b;
import androidx.work.c;
import com.google.android.fc3;
import com.google.android.pa2;
import com.google.android.q22;
import com.google.inputmethod.ejb;
import com.google.inputmethod.fjb;
import com.google.inputmethod.t04;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.a;
import kotlin.f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.s;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000 *2\u00020\u0001:\u0001+B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R \u0010\u000b\u001a\u00020\n8\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u0012\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0012\u0010\u001aR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR*\u0010)\u001a\u0004\u0018\u00010!8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\"\u0010#\u0012\u0004\b(\u0010\u001c\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'¨\u0006,"}, d2 = {"Landroidx/glance/session/SessionWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "params", "Lcom/google/android/ejb;", "sessionManager", "Landroidx/glance/session/d;", "timeouts", "Lcom/google/android/pa2;", "coroutineContext", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lcom/google/android/ejb;Landroidx/glance/session/d;Lcom/google/android/pa2;)V", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Landroidx/work/c$a;", "c", "(Lcom/google/android/q22;)Ljava/lang/Object;", "d", "Landroidx/work/WorkerParameters;", "e", "Lcom/google/android/ejb;", "f", "Landroidx/glance/session/d;", "g", "Lcom/google/android/pa2;", "()Lcom/google/android/pa2;", "getCoroutineContext$annotations", "()V", "", "h", "Ljava/lang/String;", "key", "Lkotlinx/coroutines/s;", "i", "Lkotlinx/coroutines/s;", "getEffectJob$glance_release", "()Lkotlinx/coroutines/s;", "m", "(Lkotlinx/coroutines/s;)V", "getEffectJob$glance_release$annotations", "effectJob", "j", "a", "glance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SessionWorker extends CoroutineWorker {
    public static final int k = 8;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final WorkerParameters params;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final ejb sessionManager;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final TimeoutOptions timeouts;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final pa2 coroutineContext;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final String key;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private s effectJob;

    public /* synthetic */ SessionWorker(Context context, WorkerParameters workerParameters, ejb ejbVar, TimeoutOptions timeoutOptions, pa2 pa2Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, workerParameters, (i & 4) != 0 ? fjb.a() : ejbVar, (i & 8) != 0 ? new TimeoutOptions(0L, 0L, 0L, null, 15, null) : timeoutOptions, (i & 16) != 0 ? fc3.c() : pa2Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object c(q22<? super c.a> q22Var) {
        SessionWorker$doWork$1 sessionWorker$doWork$1;
        if (q22Var instanceof SessionWorker$doWork$1) {
            sessionWorker$doWork$1 = (SessionWorker$doWork$1) q22Var;
            int i = sessionWorker$doWork$1.label;
            if ((i & t04.INVALID_ID) != 0) {
                sessionWorker$doWork$1.label = i - t04.INVALID_ID;
            } else {
                sessionWorker$doWork$1 = new SessionWorker$doWork$1(this, q22Var);
            }
        } else {
            sessionWorker$doWork$1 = new SessionWorker$doWork$1(this, q22Var);
        }
        Object objD = sessionWorker$doWork$1.result;
        Object objG = a.g();
        int i2 = sessionWorker$doWork$1.label;
        if (i2 == 0) {
            f.b(objD);
            c timeSource = this.timeouts.getTimeSource();
            SessionWorker$doWork$2 sessionWorker$doWork$2 = new SessionWorker$doWork$2(this, null);
            sessionWorker$doWork$1.label = 1;
            objD = TimerScopeKt.d(timeSource, sessionWorker$doWork$2, sessionWorker$doWork$1);
            if (objD == objG) {
                return objG;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(objD);
        }
        c.a aVar = (c.a) objD;
        return aVar == null ? c.a.d(new b.a().d("TIMEOUT_EXIT_REASON", true).a()) : aVar;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public pa2 getCoroutineContext() {
        return this.coroutineContext;
    }

    public final void m(s sVar) {
        this.effectJob = sVar;
    }

    public SessionWorker(Context context, WorkerParameters workerParameters, ejb ejbVar, TimeoutOptions timeoutOptions, pa2 pa2Var) {
        super(context, workerParameters);
        this.params = workerParameters;
        this.sessionManager = ejbVar;
        this.timeouts = timeoutOptions;
        this.coroutineContext = pa2Var;
        String strL = getInputData().l(ejbVar.a());
        if (strL == null) {
            throw new IllegalStateException("SessionWorker must be started with a key");
        }
        this.key = strL;
    }

    public SessionWorker(Context context, WorkerParameters workerParameters) {
        this(context, workerParameters, fjb.a(), null, null, 24, null);
    }
}
