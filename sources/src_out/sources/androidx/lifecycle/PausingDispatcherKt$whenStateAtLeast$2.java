package androidx.lifecycle;

import com.google.android.lq2;
import com.google.android.q22;
import com.google.android.rw0;
import com.google.android.ta2;
import com.google.inputmethod.l49;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"T", "Lcom/google/android/ta2;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
@lq2(c = "androidx.lifecycle.PausingDispatcherKt$whenStateAtLeast$2", f = "PausingDispatcher.jvm.kt", l = {213}, m = "invokeSuspend", v = 1)
final class PausingDispatcherKt$whenStateAtLeast$2<T> extends SuspendLambda implements Function2<ta2, q22<? super T>, Object> {
    final /* synthetic */ Function2<ta2, q22<? super T>, Object> $block;
    final /* synthetic */ Lifecycle.State $minState;
    final /* synthetic */ Lifecycle $this_whenStateAtLeast;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PausingDispatcherKt$whenStateAtLeast$2(Lifecycle lifecycle, Lifecycle.State state, Function2<? super ta2, ? super q22<? super T>, ? extends Object> function2, q22<? super PausingDispatcherKt$whenStateAtLeast$2> q22Var) {
        super(2, q22Var);
        this.$this_whenStateAtLeast = lifecycle;
        this.$minState = state;
        this.$block = function2;
    }

    public final q22<Unit> create(Object obj, q22<?> q22Var) {
        PausingDispatcherKt$whenStateAtLeast$2 pausingDispatcherKt$whenStateAtLeast$2 = new PausingDispatcherKt$whenStateAtLeast$2(this.$this_whenStateAtLeast, this.$minState, this.$block, q22Var);
        pausingDispatcherKt$whenStateAtLeast$2.L$0 = obj;
        return pausingDispatcherKt$whenStateAtLeast$2;
    }

    public final Object invoke(ta2 ta2Var, q22<? super T> q22Var) {
        return create(ta2Var, q22Var).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) throws Throwable {
        g gVar;
        Object objG = kotlin.coroutines.intrinsics.a.g();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gVar = (g) this.L$0;
            try {
                kotlin.f.b(obj);
                gVar.b();
                return obj;
            } catch (Throwable th) {
                th = th;
                gVar.b();
                throw th;
            }
        }
        kotlin.f.b(obj);
        kotlinx.coroutines.s sVar = ((ta2) this.L$0).getCoroutineContext().get(kotlinx.coroutines.s.u2);
        if (sVar == null) {
            throw new IllegalStateException("when[State] methods should have a parent job");
        }
        l49 l49Var = new l49();
        g gVar2 = new g(this.$this_whenStateAtLeast, this.$minState, l49Var.dispatchQueue, sVar);
        try {
            Function2<ta2, q22<? super T>, Object> function2 = this.$block;
            this.L$0 = gVar2;
            this.label = 1;
            obj = rw0.g(l49Var, function2, this);
            if (obj == objG) {
                return objG;
            }
            gVar = gVar2;
            gVar.b();
            return obj;
        } catch (Throwable th2) {
            th = th2;
            gVar = gVar2;
            gVar.b();
            throw th;
        }
    }
}
