package androidx.datastore.p007core;

import com.google.android.lq2;
import com.google.android.q22;
import com.google.inputmethod.f26;
import com.google.inputmethod.ol2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.functions.Function2;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "locked", "Lcom/google/android/ol2;", "<anonymous>", "(Z)Lcom/google/android/ol2;"}, k = 3, mv = {2, 0, 0})
@lq2(c = "androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$2", f = "DataStoreImpl.kt", l = {390, 391}, m = "invokeSuspend", v = 1)
final class DataStoreImpl$readDataOrHandleCorruption$2<T> extends SuspendLambda implements Function2<Boolean, q22<? super ol2<T>>, Object> {
    final /* synthetic */ int $preLockVersion;
    Object L$0;
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ DataStoreImpl<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DataStoreImpl$readDataOrHandleCorruption$2(DataStoreImpl<T> dataStoreImpl, int i, q22<? super DataStoreImpl$readDataOrHandleCorruption$2> q22Var) {
        super(2, q22Var);
        this.this$0 = dataStoreImpl;
        this.$preLockVersion = i;
    }

    public final q22<Unit> create(Object obj, q22<?> q22Var) {
        DataStoreImpl$readDataOrHandleCorruption$2 dataStoreImpl$readDataOrHandleCorruption$2 = new DataStoreImpl$readDataOrHandleCorruption$2(this.this$0, this.$preLockVersion, q22Var);
        dataStoreImpl$readDataOrHandleCorruption$2.Z$0 = ((Boolean) obj).booleanValue();
        return dataStoreImpl$readDataOrHandleCorruption$2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke(((Boolean) obj).booleanValue(), (q22) obj2);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0059  */
    /* JADX WARN: Code duplicated, block: B:23:0x005e  */
    public final Object invokeSuspend(Object obj) {
        boolean z;
        Object obj2;
        int iIntValue;
        int iHashCode;
        Object objG = a.g();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            z = this.Z$0;
            DataStoreImpl<T> dataStoreImpl = this.this$0;
            this.Z$0 = z;
            this.label = 1;
            obj = dataStoreImpl.B(this);
            if (obj != objG) {
            }
            return objG;
        }
        if (i == 1) {
            z = this.Z$0;
            f.b(obj);
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            obj2 = this.L$0;
            f.b(obj);
        }
        iIntValue = ((Number) obj).intValue();
        if (obj2 != null) {
            iHashCode = obj2.hashCode();
        } else {
            iHashCode = 0;
        }
        return new ol2(obj2, iHashCode, iIntValue);
        if (z) {
            f26 f26VarV = this.this$0.v();
            this.L$0 = obj;
            this.label = 2;
            Object objA = f26VarV.a(this);
            if (objA != objG) {
                obj2 = obj;
                obj = objA;
                iIntValue = ((Number) obj).intValue();
            }
            return objG;
        }
        obj2 = obj;
        iIntValue = this.$preLockVersion;
        if (obj2 != null) {
            iHashCode = obj2.hashCode();
        } else {
            iHashCode = 0;
        }
        return new ol2(obj2, iHashCode, iIntValue);
    }

    public final Object invoke(boolean z, q22<? super ol2<T>> q22Var) {
        return create(Boolean.valueOf(z), q22Var).invokeSuspend(Unit.a);
    }
}
