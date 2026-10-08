package androidx.datastore.p007core;

import com.google.android.hl1;
import com.google.android.jl1;
import com.google.android.lq2;
import com.google.android.q22;
import com.google.android.ta2;
import com.google.inputmethod.ji8;
import com.google.inputmethod.o6c;
import com.google.inputmethod.ol2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.s;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"T", "Lcom/google/android/ta2;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
@lq2(c = "androidx.datastore.core.DataStoreImpl$updateData$2", f = "DataStoreImpl.kt", l = {185}, m = "invokeSuspend", v = 1)
final class DataStoreImpl$updateData$2<T> extends SuspendLambda implements Function2<ta2, q22<? super T>, Object> {
    final /* synthetic */ Function2<T, q22<? super T>, Object> $transform;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ DataStoreImpl<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    DataStoreImpl$updateData$2(DataStoreImpl<T> dataStoreImpl, Function2<? super T, ? super q22<? super T>, ? extends Object> function2, q22<? super DataStoreImpl$updateData$2> q22Var) {
        super(2, q22Var);
        this.this$0 = dataStoreImpl;
        this.$transform = function2;
    }

    public final q22<Unit> create(Object obj, q22<?> q22Var) {
        DataStoreImpl$updateData$2 dataStoreImpl$updateData$2 = new DataStoreImpl$updateData$2(this.this$0, this.$transform, q22Var);
        dataStoreImpl$updateData$2.L$0 = obj;
        return dataStoreImpl$updateData$2;
    }

    public final Object invoke(ta2 ta2Var, q22<? super T> q22Var) {
        return create(ta2Var, q22Var).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objG = a.g();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
            return obj;
        }
        f.b(obj);
        ta2 ta2Var = (ta2) this.L$0;
        hl1 hl1VarC = jl1.c((s) null, 1, (Object) null);
        o6c<T> o6cVarA = ((DataStoreImpl) this.this$0).inMemoryCache.a();
        if (o6cVarA instanceof ol2) {
            o6cVarA = new ji8(((ol2) o6cVarA).getVersion());
        }
        ((DataStoreImpl) this.this$0).writeActor.g(new b.a(this.$transform, hl1VarC, o6cVarA, ta2Var.getCoroutineContext()));
        this.label = 1;
        Object objK0 = hl1VarC.k0(this);
        return objK0 == objG ? objG : objK0;
    }
}
