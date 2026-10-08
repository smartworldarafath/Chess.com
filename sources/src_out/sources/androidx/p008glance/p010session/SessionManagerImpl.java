package androidx.p008glance.p010session;

import android.content.Context;
import androidx.work.ExistingWorkPolicy;
import androidx.work.WorkManager;
import androidx.work.c;
import androidx.work.d;
import com.google.android.a68;
import com.google.android.lx1;
import com.google.android.q22;
import com.google.android.x58;
import com.google.inputmethod.ejb;
import com.google.inputmethod.gjb;
import com.google.inputmethod.t04;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.f;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0006*\u0001\u0019\b\u0000\u0018\u0000 \u001d2\u00020\u0001:\u0001\u0014B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ:\u0010\u0012\u001a\u00028\u0000\"\u0004\b\u0000\u0010\f2\"\u0010\u0011\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00100\rH\u0096@¢\u0006\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Landroidx/glance/session/SessionManagerImpl;", "Lcom/google/android/ejb;", "Ljava/lang/Class;", "Landroidx/work/c;", "workerClass", "<init>", "(Ljava/lang/Class;)V", "Landroid/content/Context;", "context", "", "e", "(Landroid/content/Context;)V", "T", "Lkotlin/Function2;", "Lcom/google/android/gjb;", "Lcom/google/android/q22;", "", "block", "b", "(Lkotlin/jvm/functions/Function2;Lcom/google/android/q22;)Ljava/lang/Object;", "a", "Ljava/lang/Class;", "Lcom/google/android/x58;", "Lcom/google/android/x58;", "mutex", "androidx/glance/session/SessionManagerImpl$scope$1", "c", "Landroidx/glance/session/SessionManagerImpl$scope$1;", "scope", "d", "glance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SessionManagerImpl implements ejb {
    private static final a d = new a(null);
    public static final int e = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Class<? extends c> workerClass;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final x58 mutex = a68.b(false, 1, (Object) null);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final SessionManagerImpl$scope$1 scope = new SessionManagerImpl$scope$1(this);

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/glance/session/SessionManagerImpl$a;", "", "<init>", "()V", "", "DEBUG", "Z", "", "TAG", "Ljava/lang/String;", "glance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public SessionManagerImpl(Class<? extends c> cls) {
        this.workerClass = cls;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e(Context context) {
        WorkManager.i(context).g("sessionWorkerKeepEnabled", ExistingWorkPolicy.b, new d.a(this.workerClass).l(3650L, TimeUnit.DAYS).j(new lx1.a().c(true).a()).b());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.google.inputmethod.ejb
    public <T> Object b(Function2<? super gjb, ? super q22<? super T>, ? extends Object> function2, q22<? super T> q22Var) throws Throwable {
        SessionManagerImpl$runWithLock$1 sessionManagerImpl$runWithLock$1;
        x58 x58Var;
        SessionManagerImpl sessionManagerImpl;
        Throwable th;
        x58 x58Var2;
        if (q22Var instanceof SessionManagerImpl$runWithLock$1) {
            sessionManagerImpl$runWithLock$1 = (SessionManagerImpl$runWithLock$1) q22Var;
            int i = sessionManagerImpl$runWithLock$1.label;
            if ((i & t04.INVALID_ID) != 0) {
                sessionManagerImpl$runWithLock$1.label = i - t04.INVALID_ID;
            } else {
                sessionManagerImpl$runWithLock$1 = new SessionManagerImpl$runWithLock$1(this, q22Var);
            }
        } else {
            sessionManagerImpl$runWithLock$1 = new SessionManagerImpl$runWithLock$1(this, q22Var);
        }
        Object obj = sessionManagerImpl$runWithLock$1.result;
        Object objG = kotlin.coroutines.intrinsics.a.g();
        int i2 = sessionManagerImpl$runWithLock$1.label;
        try {
            if (i2 == 0) {
                f.b(obj);
                x58Var = this.mutex;
                sessionManagerImpl$runWithLock$1.L$0 = this;
                sessionManagerImpl$runWithLock$1.L$1 = function2;
                sessionManagerImpl$runWithLock$1.L$2 = x58Var;
                sessionManagerImpl$runWithLock$1.label = 1;
                if (x58Var.g((Object) null, sessionManagerImpl$runWithLock$1) != objG) {
                    sessionManagerImpl = this;
                }
                return objG;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                x58Var2 = (x58) sessionManagerImpl$runWithLock$1.L$0;
                try {
                    f.b(obj);
                    x58Var2.h((Object) null);
                    return obj;
                } catch (Throwable th2) {
                    th = th2;
                    x58Var2.h((Object) null);
                    throw th;
                }
            }
            x58 x58Var3 = (x58) sessionManagerImpl$runWithLock$1.L$2;
            Function2<? super gjb, ? super q22<? super T>, ? extends Object> function3 = (Function2) sessionManagerImpl$runWithLock$1.L$1;
            sessionManagerImpl = (SessionManagerImpl) sessionManagerImpl$runWithLock$1.L$0;
            f.b(obj);
            x58Var = x58Var3;
            function2 = function3;
            SessionManagerImpl$scope$1 sessionManagerImpl$scope$1 = sessionManagerImpl.scope;
            sessionManagerImpl$runWithLock$1.L$0 = x58Var;
            sessionManagerImpl$runWithLock$1.L$1 = null;
            sessionManagerImpl$runWithLock$1.L$2 = null;
            sessionManagerImpl$runWithLock$1.label = 2;
            Object objInvoke = function2.invoke(sessionManagerImpl$scope$1, sessionManagerImpl$runWithLock$1);
            if (objInvoke != objG) {
                x58 x58Var4 = x58Var;
                obj = objInvoke;
                x58Var2 = x58Var4;
                x58Var2.h((Object) null);
                return obj;
            }
            return objG;
        } catch (Throwable th3) {
            x58 x58Var5 = x58Var;
            th = th3;
            x58Var2 = x58Var5;
            x58Var2.h((Object) null);
            throw th;
        }
    }
}
