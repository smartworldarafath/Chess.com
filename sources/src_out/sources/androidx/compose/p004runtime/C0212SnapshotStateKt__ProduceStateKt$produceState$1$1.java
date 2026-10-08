package androidx.compose.p004runtime;

import com.google.android.lq2;
import com.google.android.q22;
import com.google.android.ta2;
import com.google.inputmethod.io9;
import com.google.inputmethod.o58;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: androidx.compose.runtime.SnapshotStateKt__ProduceStateKt$produceState$1$1, reason: from Kotlin metadata and case insensitive filesystem */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/ta2;", "", "<anonymous>", "(Lcom/google/android/ta2;)V"}, k = 3, mv = {2, 1, 0})
@lq2(c = "androidx.compose.runtime.SnapshotStateKt__ProduceStateKt$produceState$1$1", f = "ProduceState.kt", l = {80}, m = "invokeSuspend", v = 1)
final class C0212SnapshotStateKt__ProduceStateKt$produceState$1$1 extends SuspendLambda implements Function2<ta2, q22<? super Unit>, Object> {
    final /* synthetic */ Function2<io9<T>, q22<? super Unit>, Object> $producer;
    final /* synthetic */ o58<T> $result;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    C0212SnapshotStateKt__ProduceStateKt$produceState$1$1(Function2<? super io9<T>, ? super q22<? super Unit>, ? extends Object> function2, o58<T> o58Var, q22<? super C0212SnapshotStateKt__ProduceStateKt$produceState$1$1> q22Var) {
        super(2, q22Var);
        this.$producer = function2;
        this.$result = o58Var;
    }

    public final q22<Unit> create(Object obj, q22<?> q22Var) {
        C0212SnapshotStateKt__ProduceStateKt$produceState$1$1 c0212SnapshotStateKt__ProduceStateKt$produceState$1$1 = new C0212SnapshotStateKt__ProduceStateKt$produceState$1$1(this.$producer, this.$result, q22Var);
        c0212SnapshotStateKt__ProduceStateKt$produceState$1$1.L$0 = obj;
        return c0212SnapshotStateKt__ProduceStateKt$produceState$1$1;
    }

    public final Object invoke(ta2 ta2Var, q22<? super Unit> q22Var) {
        return create(ta2Var, q22Var).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        Object objG = a.g();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            ta2 ta2Var = (ta2) this.L$0;
            Function2<io9<T>, q22<? super Unit>, Object> function2 = this.$producer;
            ProduceStateScopeImpl produceStateScopeImpl = new ProduceStateScopeImpl(this.$result, ta2Var.getCoroutineContext());
            this.label = 1;
            if (function2.invoke(produceStateScopeImpl, this) == objG) {
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
