package androidx.datastore.p007core;

import com.google.android.q22;
import com.google.android.x58;
import com.google.inputmethod.nw5;
import com.google.inputmethod.t04;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.a;
import kotlin.f;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J4\u0010\u0006\u001a\u00028\u00002\"\u0010\u0005\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002H\u0096@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"androidx/datastore/core/DataStoreImpl$InitDataStore$doRun$initData$1$api$1", "Lcom/google/android/nw5;", "Lkotlin/Function2;", "Lcom/google/android/q22;", "", "transform", "a", "(Lkotlin/jvm/functions/Function2;Lcom/google/android/q22;)Ljava/lang/Object;", "datastore-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DataStoreImpl$InitDataStore$doRun$initData$1$api$1<T> implements nw5<T> {
    final /* synthetic */ x58 a;
    final /* synthetic */ Ref.BooleanRef b;
    final /* synthetic */ Ref.ObjectRef<T> c;
    final /* synthetic */ DataStoreImpl<T> d;

    DataStoreImpl$InitDataStore$doRun$initData$1$api$1(x58 x58Var, Ref.BooleanRef booleanRef, Ref.ObjectRef<T> objectRef, DataStoreImpl<T> dataStoreImpl) {
        this.a = x58Var;
        this.b = booleanRef;
        this.c = objectRef;
        this.d = dataStoreImpl;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00ba A[Catch: all -> 0x0056, TRY_LEAVE, TryCatch #0 {all -> 0x0056, blocks: (B:21:0x0052, B:36:0x00b2, B:38:0x00ba), top: B:53:0x0052 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.google.inputmethod.nw5
    public Object a(Function2<? super T, ? super q22<? super T>, ? extends Object> function2, q22<? super T> q22Var) throws Throwable {
        q22<? super Integer> dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1;
        x58 x58Var;
        DataStoreImpl dataStoreImpl;
        Ref.BooleanRef booleanRef;
        Ref.ObjectRef<T> objectRef;
        x58 x58Var2;
        x58 x58Var3;
        DataStoreImpl dataStoreImpl2;
        Object obj;
        Ref.ObjectRef<T> objectRef2;
        if (q22Var instanceof DataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1) {
            dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1 = (DataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1) q22Var;
            int i = dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.label;
            if ((i & t04.INVALID_ID) != 0) {
                dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.label = i - t04.INVALID_ID;
            } else {
                dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1 = new DataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1(this, q22Var);
            }
        } else {
            dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1 = new DataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1(this, q22Var);
        }
        Object obj2 = dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.result;
        Object objG = a.g();
        int i2 = dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.label;
        try {
            if (i2 == 0) {
                f.b(obj2);
                x58Var = this.a;
                Ref.BooleanRef booleanRef2 = this.b;
                Ref.ObjectRef<T> objectRef3 = this.c;
                dataStoreImpl = this.d;
                dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$0 = function2;
                dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$1 = x58Var;
                dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$2 = booleanRef2;
                dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$3 = objectRef3;
                dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$4 = dataStoreImpl;
                dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.label = 1;
                if (x58Var.g((Object) null, dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1) != objG) {
                    booleanRef = booleanRef2;
                    objectRef = objectRef3;
                }
                return objG;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj = dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$2;
                    objectRef2 = (Ref.ObjectRef) dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$1;
                    x58Var2 = (x58) dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$0;
                    try {
                        f.b(obj2);
                        objectRef2.element = obj;
                        objectRef = objectRef2;
                        Object obj3 = objectRef.element;
                        x58Var2.h((Object) null);
                        return obj3;
                    } catch (Throwable th) {
                        th = th;
                        x58Var2.h((Object) null);
                        throw th;
                    }
                }
                DataStoreImpl dataStoreImpl3 = (DataStoreImpl) dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$2;
                objectRef = (Ref.ObjectRef) dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$1;
                x58Var3 = (x58) dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$0;
                try {
                    f.b(obj2);
                    dataStoreImpl2 = dataStoreImpl3;
                    if (!Intrinsics.e(obj2, objectRef.element)) {
                        dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$0 = x58Var3;
                        dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$1 = objectRef;
                        dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$2 = obj2;
                        dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.label = 3;
                        if (dataStoreImpl2.I(obj2, false, dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1) != objG) {
                            obj = obj2;
                            objectRef2 = objectRef;
                            x58Var2 = x58Var3;
                            objectRef2.element = obj;
                            objectRef = objectRef2;
                        }
                        return objG;
                    }
                    x58Var2 = x58Var3;
                    Object obj4 = objectRef.element;
                    x58Var2.h((Object) null);
                    return obj4;
                } catch (Throwable th2) {
                    th = th2;
                    x58Var2 = x58Var3;
                    x58Var2.h((Object) null);
                    throw th;
                }
            }
            DataStoreImpl dataStoreImpl4 = (DataStoreImpl) dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$4;
            objectRef = (Ref.ObjectRef) dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$3;
            booleanRef = (Ref.BooleanRef) dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$2;
            x58 x58Var4 = (x58) dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$1;
            Function2<? super T, ? super q22<? super T>, ? extends Object> function3 = (Function2) dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$0;
            f.b(obj2);
            dataStoreImpl = dataStoreImpl4;
            function2 = function3;
            x58Var = x58Var4;
            if (booleanRef.element) {
                throw new IllegalStateException("InitializerApi.updateData should not be called after initialization is complete.");
            }
            Object obj5 = objectRef.element;
            dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$0 = x58Var;
            dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$1 = objectRef;
            dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$2 = dataStoreImpl;
            dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$3 = null;
            dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$4 = null;
            dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.label = 2;
            Object objInvoke = function2.invoke(obj5, dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1);
            if (objInvoke != objG) {
                x58Var3 = x58Var;
                obj2 = objInvoke;
                dataStoreImpl2 = dataStoreImpl;
                if (!Intrinsics.e(obj2, objectRef.element)) {
                    dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$0 = x58Var3;
                    dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$1 = objectRef;
                    dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$2 = obj2;
                    dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.label = 3;
                    if (dataStoreImpl2.I(obj2, false, dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1) != objG) {
                        obj = obj2;
                        objectRef2 = objectRef;
                        x58Var2 = x58Var3;
                        objectRef2.element = obj;
                        objectRef = objectRef2;
                    }
                } else {
                    x58Var2 = x58Var3;
                }
                Object obj6 = objectRef.element;
                x58Var2.h((Object) null);
                return obj6;
            }
            return objG;
        } catch (Throwable th3) {
            th = th3;
            x58Var2 = x58Var;
            x58Var2.h((Object) null);
            throw th;
        }
    }
}
