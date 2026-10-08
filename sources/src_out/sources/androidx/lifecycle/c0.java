package androidx.lifecycle;

import com.google.android.g41;
import com.google.android.oq2;
import com.google.android.pa2;
import com.google.android.q22;
import com.google.inputmethod.n17;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a@\u0010\n\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0081@¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"R", "Landroidx/lifecycle/Lifecycle;", "Landroidx/lifecycle/Lifecycle$State;", "state", "", "dispatchNeeded", "Lcom/google/android/pa2;", "lifecycleDispatcher", "Lkotlin/Function0;", "block", "a", "(Landroidx/lifecycle/Lifecycle;Landroidx/lifecycle/Lifecycle$State;ZLcom/google/android/pa2;Lkotlin/jvm/functions/Function0;Lcom/google/android/q22;)Ljava/lang/Object;", "lifecycle-runtime"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class c0 {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class a implements Runnable {
        final /* synthetic */ Lifecycle a;
        final /* synthetic */ c b;

        a(Lifecycle lifecycle, c cVar) {
            this.a = lifecycle;
            this.b = cVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.a.c(this.b);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class b implements Function1<Throwable, Unit> {
        final /* synthetic */ pa2 a;
        final /* synthetic */ Lifecycle b;
        final /* synthetic */ c c;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        static final class a implements Runnable {
            final /* synthetic */ Lifecycle a;
            final /* synthetic */ c b;

            a(Lifecycle lifecycle, c cVar) {
                this.a = lifecycle;
                this.b = cVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.g(this.b);
            }
        }

        b(pa2 pa2Var, Lifecycle lifecycle, c cVar) {
            this.a = pa2Var;
            this.b = lifecycle;
            this.c = cVar;
        }

        public final void a(Throwable th) {
            pa2 pa2Var = this.a;
            EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.a;
            if (pa2Var.c0(emptyCoroutineContext)) {
                this.a.U(emptyCoroutineContext, new a(this.b, this.c));
            } else {
                this.b.g(this.c);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return Unit.a;
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"androidx/lifecycle/c0$c", "Landroidx/lifecycle/i;", "Lcom/google/android/n17;", "source", "Landroidx/lifecycle/Lifecycle$Event;", "event", "", "d6", "(Lcom/google/android/n17;Landroidx/lifecycle/Lifecycle$Event;)V", "lifecycle-runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c implements i {
        final /* synthetic */ Lifecycle.State a;
        final /* synthetic */ Lifecycle b;
        final /* synthetic */ g41<R> c;
        final /* synthetic */ Function0<R> d;

        /* JADX WARN: Multi-variable type inference failed */
        c(Lifecycle.State state, Lifecycle lifecycle, g41<? super R> g41Var, Function0<? extends R> function0) {
            this.a = state;
            this.b = lifecycle;
            this.c = g41Var;
            this.d = function0;
        }

        @Override // androidx.lifecycle.i
        public void d6(n17 source, Lifecycle.Event event) {
            Object objB;
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(event, "event");
            if (event != Lifecycle.Event.INSTANCE.c(this.a)) {
                if (event == Lifecycle.Event.ON_DESTROY) {
                    this.b.g(this);
                    g41<R> g41Var = this.c;
                    Result.a aVar = Result.a;
                    g41Var.resumeWith(Result.b(kotlin.f.a(new LifecycleDestroyedException())));
                    return;
                }
                return;
            }
            this.b.g(this);
            g41<R> g41Var2 = this.c;
            Function0<R> function0 = this.d;
            try {
                Result.a aVar2 = Result.a;
                objB = Result.b(function0.invoke());
            } catch (Throwable th) {
                Result.a aVar3 = Result.a;
                objB = Result.b(kotlin.f.a(th));
            }
            g41Var2.resumeWith(objB);
        }
    }

    public static final <R> Object a(Lifecycle lifecycle, Lifecycle.State state, boolean z, pa2 pa2Var, Function0<? extends R> function0, q22<? super R> q22Var) {
        kotlinx.coroutines.e eVar = new kotlinx.coroutines.e(kotlin.coroutines.intrinsics.a.d(q22Var), 1);
        eVar.G();
        c cVar = new c(state, lifecycle, eVar, function0);
        if (z) {
            pa2Var.U(EmptyCoroutineContext.a, new a(lifecycle, cVar));
        } else {
            lifecycle.c(cVar);
        }
        eVar.D(new b(pa2Var, lifecycle, cVar));
        Object objY = eVar.y();
        if (objY == kotlin.coroutines.intrinsics.a.g()) {
            oq2.c(q22Var);
        }
        return objY;
    }
}
