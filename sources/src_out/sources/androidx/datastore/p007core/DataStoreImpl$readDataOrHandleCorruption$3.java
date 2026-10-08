package androidx.datastore.p007core;

import com.google.android.lq2;
import com.google.android.q22;
import com.google.inputmethod.f26;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@lq2(c = "androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$3", f = "DataStoreImpl.kt", l = {403, 404, 406}, m = "invokeSuspend", v = 1)
final class DataStoreImpl$readDataOrHandleCorruption$3 extends SuspendLambda implements Function1<q22<? super Unit>, Object> {
    final /* synthetic */ Ref.ObjectRef<T> $newData;
    final /* synthetic */ Ref.IntRef $version;
    Object L$0;
    int label;
    final /* synthetic */ DataStoreImpl<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DataStoreImpl$readDataOrHandleCorruption$3(Ref.ObjectRef<T> objectRef, DataStoreImpl<T> dataStoreImpl, Ref.IntRef intRef, q22<? super DataStoreImpl$readDataOrHandleCorruption$3> q22Var) {
        super(1, q22Var);
        this.$newData = objectRef;
        this.this$0 = dataStoreImpl;
        this.$version = intRef;
    }

    public final q22<Unit> create(q22<?> q22Var) {
        return new DataStoreImpl$readDataOrHandleCorruption$3(this.$newData, this.this$0, this.$version, q22Var);
    }

    public final Object invoke(q22<? super Unit> q22Var) {
        return create(q22Var).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final Object invokeSuspend(Object obj) {
        Ref.IntRef intRef;
        Ref.ObjectRef objectRef;
        Ref.IntRef intRef2;
        Object objG = a.g();
        int i = this.label;
        try {
            if (i == 0) {
                f.b(obj);
                objectRef = this.$newData;
                DataStoreImpl<T> dataStoreImpl = this.this$0;
                this.L$0 = objectRef;
                this.label = 1;
                obj = dataStoreImpl.B(this);
                if (obj == objG) {
                }
                return objG;
            }
            if (i == 1) {
                objectRef = (Ref.ObjectRef) this.L$0;
                f.b(obj);
            } else {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    intRef = (Ref.IntRef) this.L$0;
                    f.b(obj);
                    intRef.element = ((Number) obj).intValue();
                    return Unit.a;
                }
                intRef2 = (Ref.IntRef) this.L$0;
                f.b(obj);
            }
            intRef2.element = ((Number) obj).intValue();
            return Unit.a;
            objectRef.element = obj;
            intRef2 = this.$version;
            f26 f26VarV = this.this$0.v();
            this.L$0 = intRef2;
            this.label = 2;
            obj = f26VarV.a(this);
            if (obj == objG) {
                return objG;
            }
            intRef2.element = ((Number) obj).intValue();
        } catch (CorruptionException unused) {
            Ref.IntRef intRef3 = this.$version;
            DataStoreImpl<T> dataStoreImpl2 = this.this$0;
            Object obj2 = this.$newData.element;
            this.L$0 = intRef3;
            this.label = 3;
            Object objI = dataStoreImpl2.I((T) obj2, true, (q22<? super Integer>) this);
            if (objI != objG) {
                intRef = intRef3;
                obj = objI;
            }
            return objG;
        }
        return Unit.a;
    }
}
