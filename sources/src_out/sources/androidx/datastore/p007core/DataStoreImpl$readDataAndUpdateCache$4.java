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
import kotlin.jvm.functions.Function2;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0004\u0012\u00020\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "", "locked", "Lkotlin/Pair;", "Lcom/google/android/o6c;", "<anonymous>", "(Z)Lkotlin/Pair;"}, k = 3, mv = {2, 0, 0})
@lq2(c = "androidx.datastore.core.DataStoreImpl$readDataAndUpdateCache$4", f = "DataStoreImpl.kt", l = {324, 328}, m = "invokeSuspend", v = 1)
final class DataStoreImpl$readDataAndUpdateCache$4<T> extends SuspendLambda implements Function2<Boolean, q22<? super Pair<? extends o6c<T>, ? extends Boolean>>, Object> {
    final /* synthetic */ int $cachedVersion;
    Object L$0;
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ DataStoreImpl<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DataStoreImpl$readDataAndUpdateCache$4(DataStoreImpl<T> dataStoreImpl, int i, q22<? super DataStoreImpl$readDataAndUpdateCache$4> q22Var) {
        super(2, q22Var);
        this.this$0 = dataStoreImpl;
        this.$cachedVersion = i;
    }

    public final q22<Unit> create(Object obj, q22<?> q22Var) {
        DataStoreImpl$readDataAndUpdateCache$4 dataStoreImpl$readDataAndUpdateCache$4 = new DataStoreImpl$readDataAndUpdateCache$4(this.this$0, this.$cachedVersion, q22Var);
        dataStoreImpl$readDataAndUpdateCache$4.Z$0 = ((Boolean) obj).booleanValue();
        return dataStoreImpl$readDataAndUpdateCache$4;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke(((Boolean) obj).booleanValue(), (q22) obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r4v0 */
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        int iIntValue;
        ?? r0;
        ?? r1;
        o6c o6cVar;
        ?? r2;
        Object objG = a.g();
        ?? r3 = this.label;
        try {
            if (r3 == 0) {
                f.b(obj);
                boolean z = this.Z$0;
                DataStoreImpl<T> dataStoreImpl = this.this$0;
                this.Z$0 = z;
                this.label = 1;
                obj = dataStoreImpl.C(z, this);
                r3 = z;
                if (obj == objG) {
                    return objG;
                }
            } else {
                if (r3 != 1) {
                    if (r3 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    boolean z2 = this.Z$0;
                    th = (Throwable) this.L$0;
                    f.b(obj);
                    r1 = z2;
                    iIntValue = ((Number) obj).intValue();
                    r0 = r1;
                    t8a t8aVar = new t8a(th, iIntValue);
                    r2 = r0;
                    o6cVar = t8aVar;
                    return qjd.a(o6cVar, ut0.a((boolean) r2));
                }
                boolean z3 = this.Z$0;
                f.b(obj);
                r3 = z3;
            }
            o6cVar = (o6c) obj;
            r2 = r3;
        } catch (Throwable th2) {
            if (r3 != 0) {
                f26 f26VarV = this.this$0.v();
                this.L$0 = th2;
                this.Z$0 = r3;
                this.label = 2;
                Object objA = f26VarV.a(this);
                if (objA != objG) {
                    r1 = r3;
                    th = th2;
                    obj = objA;
                }
                return objG;
            }
            ?? r4 = r3;
            th = th2;
            iIntValue = this.$cachedVersion;
            r0 = r4 == true ? 1 : 0;
        }
        return qjd.a(o6cVar, ut0.a((boolean) r2));
    }

    public final Object invoke(boolean z, q22<? super Pair<? extends o6c<T>, Boolean>> q22Var) {
        return create(Boolean.valueOf(z), q22Var).invokeSuspend(Unit.a);
    }
}
