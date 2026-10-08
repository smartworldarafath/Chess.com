package androidx.compose.p004runtime;

import com.google.android.g41;
import com.google.android.oq2;
import com.google.android.q22;
import com.google.inputmethod.ec0;
import com.google.inputmethod.o41;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.f;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.e;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0010B\u0019\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ*\u0010\u000e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00000\fH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0016\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00130\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0011\u0010\u001a\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Landroidx/compose/runtime/b;", "Landroidx/compose/runtime/v;", "Lkotlin/Function0;", "", "onNewAwaiters", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "", "timeNanos", "g", "(J)V", "R", "Lkotlin/Function1;", "onFrame", "d0", "(Lkotlin/jvm/functions/Function1;Lcom/google/android/q22;)Ljava/lang/Object;", "a", "Lkotlin/jvm/functions/Function0;", "Lcom/google/android/ec0;", "Landroidx/compose/runtime/b$a;", "b", "Lcom/google/android/ec0;", "queue", "", "f", "()Z", "hasAwaiters", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b implements v {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Function0<Unit> onNewAwaiters;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final ec0<a<?>> queue = new ec0<>();

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\t\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B)\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0014R$\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0015¨\u0006\u0016"}, d2 = {"Landroidx/compose/runtime/b$a;", "R", "Lcom/google/android/ec0$a;", "Lkotlin/Function1;", "", "onFrame", "Lcom/google/android/g41;", "continuation", "<init>", "(Lkotlin/jvm/functions/Function1;Lcom/google/android/g41;)V", "", "a", "()V", "", "exception", "b", "(Ljava/lang/Throwable;)V", "timeNanos", "c", "(J)V", "Lcom/google/android/g41;", "Lkotlin/jvm/functions/Function1;", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final class a<R> extends ec0.a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private g41<? super R> continuation;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private Function1<? super Long, ? extends R> onFrame;

        public a(Function1<? super Long, ? extends R> function1, g41<? super R> g41Var) {
            this.continuation = g41Var;
            this.onFrame = function1;
        }

        @Override // com.google.android.ec0.a
        public void a() {
            this.onFrame = null;
            this.continuation = null;
        }

        @Override // com.google.android.ec0.a
        public void b(Throwable exception) {
            g41<? super R> g41Var = this.continuation;
            if (g41Var != null) {
                Result.a aVar = Result.a;
                g41Var.resumeWith(Result.b(f.a(exception)));
            }
        }

        public final void c(long timeNanos) {
            g41<? super R> g41Var;
            Object objB;
            Function1<? super Long, ? extends R> function1 = this.onFrame;
            if (function1 == null || (g41Var = this.continuation) == null) {
                return;
            }
            try {
                Result.a aVar = Result.a;
                objB = Result.b(function1.invoke(Long.valueOf(timeNanos)));
            } catch (Throwable th) {
                Result.a aVar2 = Result.a;
                objB = Result.b(f.a(th));
            }
            g41Var.resumeWith(objB);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.runtime.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class C0045b implements Function1<Throwable, Unit> {
        final /* synthetic */ o41 a;

        C0045b(o41 o41Var) {
            this.a = o41Var;
        }

        public final void a(Throwable th) {
            this.a.cancel();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return Unit.a;
        }
    }

    public b(Function0<Unit> function0) {
        this.onNewAwaiters = function0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(long j, a aVar) {
        aVar.c(j);
        return Unit.a;
    }

    @Override // androidx.compose.p004runtime.v
    public <R> Object d0(Function1<? super Long, ? extends R> function1, q22<? super R> q22Var) {
        e eVar = new e(kotlin.coroutines.intrinsics.a.d(q22Var), 1);
        eVar.G();
        eVar.D(new C0045b(this.queue.b(new a(function1, eVar), this.onNewAwaiters)));
        Object objY = eVar.y();
        if (objY == kotlin.coroutines.intrinsics.a.g()) {
            oq2.c(q22Var);
        }
        return objY;
    }

    public final boolean f() {
        return this.queue.f();
    }

    public /* bridge */ <R> R fold(R r, Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
        return (R) v.a.a(this, r, function2);
    }

    public final void g(final long timeNanos) {
        this.queue.e(new Function1() { // from class: androidx.compose.runtime.a
            public final Object invoke(Object obj) {
                return b.i(timeNanos, (b.a) obj);
            }
        });
    }

    public /* bridge */ <E extends CoroutineContext.Element> E get(CoroutineContext.b<E> bVar) {
        return (E) v.a.b(this, bVar);
    }

    public /* bridge */ CoroutineContext minusKey(CoroutineContext.b<?> bVar) {
        return v.a.c(this, bVar);
    }

    public /* bridge */ CoroutineContext plus(CoroutineContext coroutineContext) {
        return v.a.d(this, coroutineContext);
    }
}
