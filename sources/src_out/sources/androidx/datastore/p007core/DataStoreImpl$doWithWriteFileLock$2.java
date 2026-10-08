package androidx.datastore.p007core;

import com.google.android.lq2;
import com.google.android.q22;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.functions.Function1;

/* JADX INFO: Add missing generic type declarations: [R] */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001H\n"}, d2 = {"<anonymous>", "R"}, k = 3, mv = {2, 0, 0}, xi = 48)
@lq2(c = "androidx.datastore.core.DataStoreImpl$doWithWriteFileLock$2", f = "DataStoreImpl.kt", l = {434}, m = "invokeSuspend", v = 1)
final class DataStoreImpl$doWithWriteFileLock$2<R> extends SuspendLambda implements Function1<q22<? super R>, Object> {
    final /* synthetic */ Function1<q22<? super R>, Object> $block;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DataStoreImpl$doWithWriteFileLock$2(Function1<? super q22<? super R>, ? extends Object> function1, q22<? super DataStoreImpl$doWithWriteFileLock$2> q22Var) {
        super(1, q22Var);
        this.$block = function1;
    }

    public final q22<Unit> create(q22<?> q22Var) {
        return new DataStoreImpl$doWithWriteFileLock$2(this.$block, q22Var);
    }

    public final Object invoke(q22<? super R> q22Var) {
        return create(q22Var).invokeSuspend(Unit.a);
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
        Function1<q22<? super R>, Object> function1 = this.$block;
        this.label = 1;
        Object objInvoke = function1.invoke(this);
        return objInvoke == objG ? objG : objInvoke;
    }
}
