package androidx.datastore.p007core;

import com.google.android.lq2;
import com.google.android.q22;
import com.google.android.ta2;
import com.google.inputmethod.ji8;
import com.google.inputmethod.ksd;
import com.google.inputmethod.o6c;
import com.google.inputmethod.ol2;
import com.google.inputmethod.t8a;
import com.google.inputmethod.ua4;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.functions.Function2;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"T", "Lcom/google/android/ta2;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
@lq2(c = "androidx.datastore.core.DataStoreImpl$handleUpdate$2$1", f = "DataStoreImpl.kt", l = {256, 262, 265}, m = "invokeSuspend", v = 1)
final class DataStoreImpl$handleUpdate$2$1<T> extends SuspendLambda implements Function2<ta2, q22<? super T>, Object> {
    final /* synthetic */ DataStoreImpl<T> $this_runCatching;
    final /* synthetic */ b.a<T> $update;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DataStoreImpl$handleUpdate$2$1(DataStoreImpl<T> dataStoreImpl, b.a<T> aVar, q22<? super DataStoreImpl$handleUpdate$2$1> q22Var) {
        super(2, q22Var);
        this.$this_runCatching = dataStoreImpl;
        this.$update = aVar;
    }

    public final q22<Unit> create(Object obj, q22<?> q22Var) {
        return new DataStoreImpl$handleUpdate$2$1(this.$this_runCatching, this.$update, q22Var);
    }

    public final Object invoke(ta2 ta2Var, q22<? super T> q22Var) {
        return create(ta2Var, q22Var).invokeSuspend(Unit.a);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objG = a.g();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            o6c<T> o6cVarA = ((DataStoreImpl) this.$this_runCatching).inMemoryCache.a();
            if (o6cVarA instanceof ol2) {
                DataStoreImpl<T> dataStoreImpl = this.$this_runCatching;
                Function2<T, q22<? super T>, Object> function2D = this.$update.d();
                CoroutineContext callerContext = this.$update.getCallerContext();
                this.label = 1;
                Object objF = dataStoreImpl.F(function2D, callerContext, this);
                if (objF != objG) {
                    return objF;
                }
            } else {
                if (!(o6cVarA instanceof t8a) && !(o6cVarA instanceof ksd)) {
                    if (o6cVarA instanceof ua4) {
                        throw ((ua4) o6cVarA).getFinalException();
                    }
                    if (o6cVarA instanceof ji8) {
                        throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                    }
                    throw new NoWhenBranchMatchedException();
                }
                if (o6cVarA != this.$update.c()) {
                    throw ((t8a) o6cVarA).getReadException();
                }
                DataStoreImpl<T> dataStoreImpl2 = this.$this_runCatching;
                this.label = 2;
                if (dataStoreImpl2.z(this) != objG) {
                }
            }
        }
        if (i == 1) {
            f.b(obj);
            return obj;
        }
        if (i != 2) {
            if (i != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
            return obj;
        }
        f.b(obj);
        DataStoreImpl<T> dataStoreImpl3 = this.$this_runCatching;
        Function2<T, q22<? super T>, Object> function2D2 = this.$update.d();
        CoroutineContext callerContext2 = this.$update.getCallerContext();
        this.label = 3;
        Object objF2 = dataStoreImpl3.F(function2D2, callerContext2, this);
        return objF2 == objG ? objG : objF2;
    }
}
