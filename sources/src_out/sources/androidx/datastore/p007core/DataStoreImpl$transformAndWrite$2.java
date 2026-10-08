package androidx.datastore.p007core;

import com.google.android.lq2;
import com.google.android.q22;
import com.google.android.rw0;
import com.google.inputmethod.ol2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001H\n"}, d2 = {"<anonymous>", "T"}, k = 3, mv = {2, 0, 0}, xi = 48)
@lq2(c = "androidx.datastore.core.DataStoreImpl$transformAndWrite$2", f = "DataStoreImpl.kt", l = {350, 351, 357}, m = "invokeSuspend", v = 1)
final class DataStoreImpl$transformAndWrite$2<T> extends SuspendLambda implements Function1<q22<? super T>, Object> {
    final /* synthetic */ CoroutineContext $callerContext;
    final /* synthetic */ Function2<T, q22<? super T>, Object> $transform;
    Object L$0;
    int label;
    final /* synthetic */ DataStoreImpl<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    DataStoreImpl$transformAndWrite$2(DataStoreImpl<T> dataStoreImpl, CoroutineContext coroutineContext, Function2<? super T, ? super q22<? super T>, ? extends Object> function2, q22<? super DataStoreImpl$transformAndWrite$2> q22Var) {
        super(1, q22Var);
        this.this$0 = dataStoreImpl;
        this.$callerContext = coroutineContext;
        this.$transform = function2;
    }

    public final q22<Unit> create(q22<?> q22Var) {
        return new DataStoreImpl$transformAndWrite$2(this.this$0, this.$callerContext, this.$transform, q22Var);
    }

    public final Object invoke(q22<? super T> q22Var) {
        return create(q22Var).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005e  */
    public final Object invokeSuspend(Object obj) throws CorruptionException {
        ol2 ol2Var;
        DataStoreImpl<T> dataStoreImpl;
        Object objG = a.g();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            DataStoreImpl<T> dataStoreImpl2 = this.this$0;
            this.label = 1;
            obj = dataStoreImpl2.C(true, this);
            if (obj != objG) {
            }
            return objG;
        }
        if (i == 1) {
            f.b(obj);
        } else {
            if (i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Object obj2 = this.L$0;
                f.b(obj);
                return obj2;
            }
            ol2Var = (ol2) this.L$0;
            f.b(obj);
        }
        ol2Var.b();
        if (!Intrinsics.e(ol2Var.c(), obj)) {
            dataStoreImpl = this.this$0;
            this.L$0 = obj;
            this.label = 3;
            if (dataStoreImpl.I((T) obj, true, (q22<? super Integer>) this) == objG) {
                return objG;
            }
        }
        return obj;
        ol2Var = (ol2) obj;
        CoroutineContext coroutineContext = this.$callerContext;
        DataStoreImpl$transformAndWrite$2$newData$1 dataStoreImpl$transformAndWrite$2$newData$1 = new DataStoreImpl$transformAndWrite$2$newData$1(this.$transform, ol2Var, null);
        this.L$0 = ol2Var;
        this.label = 2;
        obj = rw0.g(coroutineContext, dataStoreImpl$transformAndWrite$2$newData$1, this);
        if (obj != objG) {
            ol2Var.b();
            if (!Intrinsics.e(ol2Var.c(), obj)) {
                dataStoreImpl = this.this$0;
                this.L$0 = obj;
                this.label = 3;
                if (dataStoreImpl.I((T) obj, true, (q22<? super Integer>) this) == objG) {
                }
            }
            return obj;
        }
        return objG;
    }
}
