package androidx.compose.p004runtime;

import com.google.android.sl1;
import com.google.android.ta2;
import com.google.inputmethod.lq1;
import com.google.inputmethod.ur1;
import com.google.inputmethod.yea;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.a;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.s;
import kotlinx.coroutines.u;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u0000 \r2\u00020\u00012\u00020\u0002:\u0001\u000eB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\nJ\u000f\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\nR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u0018\u0010\u0015\u001a\u00060\u0011j\u0002`\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u000fR\u0014\u0010\u0019\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Landroidx/compose/runtime/g0;", "Lcom/google/android/ta2;", "Lcom/google/android/yea;", "Lkotlin/coroutines/CoroutineContext;", "parentContext", "overlayContext", "<init>", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;)V", "", "h", "()V", "d", "f", "e", "a", "Lkotlin/coroutines/CoroutineContext;", "b", "", "Landroidx/compose/runtime/platform/SynchronizedObject;", "c", "Ljava/lang/Object;", "lock", "_coroutineContext", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g0 implements ta2, yea {
    public static final int f = 8;
    public static final CoroutineContext g = new c();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final CoroutineContext parentContext;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final CoroutineContext overlayContext;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Object lock = this;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private volatile CoroutineContext _coroutineContext;

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"androidx/compose/runtime/g0$b", "Lkotlin/coroutines/a;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "exception", "", "handleException", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b extends a implements CoroutineExceptionHandler {
        final /* synthetic */ ur1 b;
        final /* synthetic */ g0 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(CoroutineExceptionHandler.b bVar, ur1 ur1Var, g0 g0Var) {
            super(bVar);
            this.b = ur1Var;
            this.c = g0Var;
        }

        public void handleException(CoroutineContext context, Throwable exception) throws Throwable {
            this.b.d(exception, this.c);
            CoroutineContext coroutineContext = this.c.overlayContext;
            CoroutineExceptionHandler.b bVar = CoroutineExceptionHandler.t2;
            CoroutineExceptionHandler coroutineExceptionHandler = coroutineContext.get(bVar);
            if (coroutineExceptionHandler != null) {
                coroutineExceptionHandler.handleException(context, exception);
                return;
            }
            CoroutineExceptionHandler coroutineExceptionHandler2 = this.c.parentContext.get(bVar);
            if (coroutineExceptionHandler2 == null) {
                throw exception;
            }
            coroutineExceptionHandler2.handleException(context, exception);
        }
    }

    public g0(CoroutineContext coroutineContext, CoroutineContext coroutineContext2) {
        this.parentContext = coroutineContext;
        this.overlayContext = coroutineContext2;
    }

    @Override // com.google.inputmethod.yea
    public void d() {
    }

    @Override // com.google.inputmethod.yea
    public void e() {
        h();
    }

    @Override // com.google.inputmethod.yea
    public void f() {
        h();
    }

    public CoroutineContext getCoroutineContext() {
        CoroutineContext coroutineContextPlus;
        CoroutineContext coroutineContext = this._coroutineContext;
        if (coroutineContext == null || coroutineContext == g) {
            ur1 ur1Var = (ur1) this.parentContext.get(ur1.INSTANCE);
            b bVar = ur1Var != null ? new b(CoroutineExceptionHandler.t2, ur1Var, this) : EmptyCoroutineContext.a;
            synchronized (this.lock) {
                try {
                    coroutineContextPlus = this._coroutineContext;
                    if (coroutineContextPlus == null) {
                        CoroutineContext coroutineContext2 = this.parentContext;
                        coroutineContextPlus = coroutineContext2.plus(u.a(coroutineContext2.get(s.u2))).plus(this.overlayContext).plus(bVar);
                    } else if (coroutineContextPlus == g) {
                        CoroutineContext coroutineContext3 = this.parentContext;
                        sl1 sl1VarA = u.a(coroutineContext3.get(s.u2));
                        sl1VarA.k(new ForgottenCoroutineScopeException());
                        coroutineContextPlus = coroutineContext3.plus(sl1VarA).plus(this.overlayContext).plus(bVar);
                        if (lq1.isVerboseTracingEnabled) {
                            coroutineContextPlus = coroutineContextPlus.plus(h0.c);
                        }
                    }
                    this._coroutineContext = coroutineContextPlus;
                    Unit unit = Unit.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            coroutineContext = coroutineContextPlus;
        }
        Intrinsics.g(coroutineContext);
        return coroutineContext;
    }

    public final void h() {
        synchronized (this.lock) {
            try {
                CoroutineContext coroutineContext = this._coroutineContext;
                if (coroutineContext == null) {
                    this._coroutineContext = g;
                } else {
                    u.c(coroutineContext, new ForgottenCoroutineScopeException());
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
