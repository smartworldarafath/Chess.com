package androidx.datastore.p007core;

import com.google.android.lq2;
import com.google.android.q22;
import com.google.android.qjd;
import com.google.android.ut0;
import com.google.inputmethod.f26;
import com.google.inputmethod.o6c;
import com.google.inputmethod.t8a;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.functions.Function1;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0004\u0012\u00020\u00030\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lkotlin/Pair;", "Lcom/google/android/o6c;", "", "<anonymous>", "()Lkotlin/Pair;"}, k = 3, mv = {2, 0, 0})
@lq2(c = "androidx.datastore.core.DataStoreImpl$readDataAndUpdateCache$3", f = "DataStoreImpl.kt", l = {316, 318}, m = "invokeSuspend", v = 1)
final class DataStoreImpl$readDataAndUpdateCache$3<T> extends SuspendLambda implements Function1<q22<? super Pair<? extends o6c<T>, ? extends Boolean>>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ DataStoreImpl<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DataStoreImpl$readDataAndUpdateCache$3(DataStoreImpl<T> dataStoreImpl, q22<? super DataStoreImpl$readDataAndUpdateCache$3> q22Var) {
        super(1, q22Var);
        this.this$0 = dataStoreImpl;
    }

    public final q22<Unit> create(q22<?> q22Var) {
        return new DataStoreImpl$readDataAndUpdateCache$3(this.this$0, q22Var);
    }

    public final Object invoke(q22<? super Pair<? extends o6c<T>, Boolean>> q22Var) {
        return create(q22Var).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        Throwable th;
        o6c t8aVar;
        Object objG = a.g();
        int i = this.label;
        try {
            if (i == 0) {
                f.b(obj);
                DataStoreImpl<T> dataStoreImpl = this.this$0;
                this.label = 1;
                obj = dataStoreImpl.C(true, this);
                if (obj == objG) {
                    return objG;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    th = (Throwable) this.L$0;
                    f.b(obj);
                    t8aVar = new t8a(th, ((Number) obj).intValue());
                    return qjd.a(t8aVar, ut0.a(true));
                }
                f.b(obj);
            }
            t8aVar = (o6c) obj;
        } catch (Throwable th2) {
            f26 f26VarV = this.this$0.v();
            this.L$0 = th2;
            this.label = 2;
            Object objA = f26VarV.a(this);
            if (objA != objG) {
                th = th2;
                obj = objA;
            }
            return objG;
        }
        return qjd.a(t8aVar, ut0.a(true));
    }
}
