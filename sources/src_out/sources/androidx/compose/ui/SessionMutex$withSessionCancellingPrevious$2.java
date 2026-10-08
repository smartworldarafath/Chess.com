package androidx.compose.ui;

import com.google.android.lq2;
import com.google.android.q22;
import com.google.android.ta2;
import com.google.inputmethod.w58;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.s;
import kotlinx.coroutines.u;

/* JADX INFO: Add missing generic type declarations: [R] */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"R", "Lcom/google/android/ta2;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
@lq2(c = "androidx.compose.ui.SessionMutex$withSessionCancellingPrevious$2", f = "SessionMutex.kt", l = {61, 63}, m = "invokeSuspend", v = 1)
final class SessionMutex$withSessionCancellingPrevious$2<R> extends SuspendLambda implements Function2<ta2, q22<? super R>, Object> {
    final /* synthetic */ AtomicReference<SessionMutex.a<T>> $arg0;
    final /* synthetic */ Function2<T, q22<? super R>, Object> $session;
    final /* synthetic */ Function1<ta2, T> $sessionInitializer;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SessionMutex$withSessionCancellingPrevious$2(Function1<? super ta2, ? extends T> function1, AtomicReference<SessionMutex.a<T>> atomicReference, Function2<? super T, ? super q22<? super R>, ? extends Object> function2, q22<? super SessionMutex$withSessionCancellingPrevious$2> q22Var) {
        super(2, q22Var);
        this.$sessionInitializer = function1;
        this.$arg0 = atomicReference;
        this.$session = function2;
    }

    public final q22<Unit> create(Object obj, q22<?> q22Var) {
        SessionMutex$withSessionCancellingPrevious$2 sessionMutex$withSessionCancellingPrevious$2 = new SessionMutex$withSessionCancellingPrevious$2(this.$sessionInitializer, this.$arg0, this.$session, q22Var);
        sessionMutex$withSessionCancellingPrevious$2.L$0 = obj;
        return sessionMutex$withSessionCancellingPrevious$2;
    }

    public final Object invoke(ta2 ta2Var, q22<? super R> q22Var) {
        return create(ta2Var, q22Var).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final Object invokeSuspend(Object obj) throws Throwable {
        SessionMutex.a aVar;
        s sVarA;
        SessionMutex.a aVar2;
        Object objG = kotlin.coroutines.intrinsics.a.g();
        int i = this.label;
        try {
            if (i == 0) {
                f.b(obj);
                ta2 ta2Var = (ta2) this.L$0;
                aVar = new SessionMutex.a(u.k(ta2Var.getCoroutineContext()), this.$sessionInitializer.invoke(ta2Var));
                SessionMutex.a aVar3 = (SessionMutex.a) this.$arg0.getAndSet((SessionMutex.a<T>) aVar);
                if (aVar3 != null && (sVarA = aVar3.getJob()) != null) {
                    this.L$0 = aVar;
                    this.label = 1;
                    if (u.g(sVarA, this) != objG) {
                    }
                }
                return objG;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar2 = (SessionMutex.a) this.L$0;
                try {
                    f.b(obj);
                    w58.a(this.$arg0, aVar2, null);
                    return obj;
                } catch (Throwable th) {
                    th = th;
                    w58.a(this.$arg0, aVar2, null);
                    throw th;
                }
            }
            aVar = (SessionMutex.a) this.L$0;
            f.b(obj);
            Function2<T, q22<? super R>, Object> function2 = this.$session;
            Object objB = aVar.b();
            this.L$0 = aVar;
            this.label = 2;
            obj = function2.invoke(objB, this);
            if (obj != objG) {
                aVar2 = aVar;
                w58.a(this.$arg0, aVar2, null);
                return obj;
            }
            return objG;
        } catch (Throwable th2) {
            th = th2;
            aVar2 = aVar;
            w58.a(this.$arg0, aVar2, null);
            throw th;
        }
    }
}
