package androidx.compose.p001foundation;

import com.google.android.lq2;
import com.google.android.q22;
import com.google.android.ta2;
import com.google.android.x58;
import com.google.inputmethod.w58;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.s;

/* JADX INFO: Add missing generic type declarations: [R] */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"R", "Lcom/google/android/ta2;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
@lq2(c = "androidx.compose.foundation.MutatorMutex$mutate$2", f = "MutatorMutex.kt", l = {212, 127}, m = "invokeSuspend", v = 1)
final class MutatorMutex$mutate$2<R> extends SuspendLambda implements Function2<ta2, q22<? super R>, Object> {
    final /* synthetic */ Function1<q22<? super R>, Object> $block;
    final /* synthetic */ MutatePriority $priority;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ MutatorMutex this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MutatorMutex$mutate$2(MutatePriority mutatePriority, MutatorMutex mutatorMutex, Function1<? super q22<? super R>, ? extends Object> function1, q22<? super MutatorMutex$mutate$2> q22Var) {
        super(2, q22Var);
        this.$priority = mutatePriority;
        this.this$0 = mutatorMutex;
        this.$block = function1;
    }

    public final q22<Unit> create(Object obj, q22<?> q22Var) {
        MutatorMutex$mutate$2 mutatorMutex$mutate$2 = new MutatorMutex$mutate$2(this.$priority, this.this$0, this.$block, q22Var);
        mutatorMutex$mutate$2.L$0 = obj;
        return mutatorMutex$mutate$2;
    }

    public final Object invoke(ta2 ta2Var, q22<? super R> q22Var) {
        return create(ta2Var, q22Var).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.google.android.x58, int] */
    public final Object invokeSuspend(Object obj) {
        x58 x58Var;
        MutatorMutex.a aVar;
        MutatorMutex mutatorMutex;
        Function1<q22<? super R>, Object> function1;
        Throwable th;
        MutatorMutex mutatorMutex2;
        MutatorMutex.a aVar2;
        x58 x58Var2;
        Object objG = a.g();
        ?? r1 = this.label;
        try {
            try {
                if (r1 == 0) {
                    f.b(obj);
                    ta2 ta2Var = (ta2) this.L$0;
                    MutatePriority mutatePriority = this.$priority;
                    s sVar = ta2Var.getCoroutineContext().get(s.u2);
                    Intrinsics.g(sVar);
                    MutatorMutex.a aVar3 = new MutatorMutex.a(mutatePriority, sVar);
                    this.this$0.h(aVar3);
                    x58Var = this.this$0.mutex;
                    Function1<q22<? super R>, Object> function2 = this.$block;
                    MutatorMutex mutatorMutex3 = this.this$0;
                    this.L$0 = aVar3;
                    this.L$1 = x58Var;
                    this.L$2 = function2;
                    this.L$3 = mutatorMutex3;
                    this.label = 1;
                    if (x58Var.g((Object) null, this) != objG) {
                        aVar = aVar3;
                        mutatorMutex = mutatorMutex3;
                        function1 = function2;
                    }
                    return objG;
                }
                if (r1 != 1) {
                    if (r1 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    mutatorMutex2 = (MutatorMutex) this.L$2;
                    x58Var2 = (x58) this.L$1;
                    aVar2 = (MutatorMutex.a) this.L$0;
                    try {
                        f.b(obj);
                        w58.a(mutatorMutex2.currentMutator, aVar2, null);
                        x58Var2.h((Object) null);
                        return obj;
                    } catch (Throwable th2) {
                        th = th2;
                        w58.a(mutatorMutex2.currentMutator, aVar2, null);
                        throw th;
                    }
                }
                mutatorMutex = (MutatorMutex) this.L$3;
                function1 = (Function1) this.L$2;
                x58 x58Var3 = (x58) this.L$1;
                aVar = (MutatorMutex.a) this.L$0;
                f.b(obj);
                x58Var = x58Var3;
                this.L$0 = aVar;
                this.L$1 = x58Var;
                this.L$2 = mutatorMutex;
                this.L$3 = null;
                this.label = 2;
                Object objInvoke = function1.invoke(this);
                if (objInvoke != objG) {
                    mutatorMutex2 = mutatorMutex;
                    x58Var2 = x58Var;
                    obj = objInvoke;
                    aVar2 = aVar;
                    w58.a(mutatorMutex2.currentMutator, aVar2, null);
                    x58Var2.h((Object) null);
                    return obj;
                }
                return objG;
            } catch (Throwable th3) {
                th = th3;
                mutatorMutex2 = mutatorMutex;
                aVar2 = aVar;
                w58.a(mutatorMutex2.currentMutator, aVar2, null);
                throw th;
            }
        } catch (Throwable th4) {
            r1.h((Object) null);
            throw th4;
        }
    }
}
