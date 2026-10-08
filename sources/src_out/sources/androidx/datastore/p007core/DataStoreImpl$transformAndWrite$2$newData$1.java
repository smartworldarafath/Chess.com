package androidx.datastore.p007core;

import com.google.android.lq2;
import com.google.android.q22;
import com.google.android.ta2;
import com.google.inputmethod.ol2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.functions.Function2;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"T", "Lcom/google/android/ta2;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
@lq2(c = "androidx.datastore.core.DataStoreImpl$transformAndWrite$2$newData$1", f = "DataStoreImpl.kt", l = {351}, m = "invokeSuspend", v = 1)
final class DataStoreImpl$transformAndWrite$2$newData$1<T> extends SuspendLambda implements Function2<ta2, q22<? super T>, Object> {
    final /* synthetic */ ol2<T> $curData;
    final /* synthetic */ Function2<T, q22<? super T>, Object> $transform;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    DataStoreImpl$transformAndWrite$2$newData$1(Function2<? super T, ? super q22<? super T>, ? extends Object> function2, ol2<T> ol2Var, q22<? super DataStoreImpl$transformAndWrite$2$newData$1> q22Var) {
        super(2, q22Var);
        this.$transform = function2;
        this.$curData = ol2Var;
    }

    public final q22<Unit> create(Object obj, q22<?> q22Var) {
        return new DataStoreImpl$transformAndWrite$2$newData$1(this.$transform, this.$curData, q22Var);
    }

    public final Object invoke(ta2 ta2Var, q22<? super T> q22Var) {
        return create(ta2Var, q22Var).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
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
        Function2<T, q22<? super T>, Object> function2 = this.$transform;
        T tC = this.$curData.c();
        this.label = 1;
        Object objInvoke = function2.invoke(tC, this);
        return objInvoke == objG ? objG : objInvoke;
    }
}
