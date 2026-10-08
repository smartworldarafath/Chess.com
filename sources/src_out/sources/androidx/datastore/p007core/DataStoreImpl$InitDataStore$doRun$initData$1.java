package androidx.datastore.p007core;

import com.google.android.a68;
import com.google.android.lq2;
import com.google.android.q22;
import com.google.android.x58;
import com.google.inputmethod.f26;
import com.google.inputmethod.ol2;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "Lcom/google/android/ol2;", "<anonymous>", "()Lcom/google/android/ol2;"}, k = 3, mv = {2, 0, 0})
@lq2(c = "androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$initData$1", f = "DataStoreImpl.kt", l = {456, 478, 568, 486}, m = "invokeSuspend", v = 1)
final class DataStoreImpl$InitDataStore$doRun$initData$1<T> extends SuspendLambda implements Function1<q22<? super ol2<T>>, Object> {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ DataStoreImpl<T> this$0;
    final /* synthetic */ DataStoreImpl<T>.InitDataStore this$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DataStoreImpl$InitDataStore$doRun$initData$1(DataStoreImpl<T> dataStoreImpl, DataStoreImpl<T>.InitDataStore initDataStore, q22<? super DataStoreImpl$InitDataStore$doRun$initData$1> q22Var) {
        super(1, q22Var);
        this.this$0 = dataStoreImpl;
        this.this$1 = initDataStore;
    }

    public final q22<Unit> create(q22<?> q22Var) {
        return new DataStoreImpl$InitDataStore$doRun$initData$1(this.this$0, this.this$1, q22Var);
    }

    public final Object invoke(q22<? super ol2<T>> q22Var) {
        return create(q22Var).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00af  */
    /* JADX WARN: Code duplicated, block: B:31:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:35:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:39:0x010d  */
    /* JADX WARN: Code duplicated, block: B:48:0x010c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:? A[LOOP:0: B:21:0x00a9->B:50:?, LOOP_END, SYNTHETIC] */
    public final Object invokeSuspend(Object obj) throws CorruptionException {
        x58 x58VarB;
        Ref.BooleanRef booleanRef;
        Ref.ObjectRef objectRef;
        Ref.ObjectRef objectRef2;
        Ref.BooleanRef booleanRef2;
        x58 x58Var;
        Iterator<T> it;
        x58 x58Var2;
        Ref.BooleanRef booleanRef3;
        Ref.ObjectRef objectRef3;
        DataStoreImpl$InitDataStore$doRun$initData$1$api$1 dataStoreImpl$InitDataStore$doRun$initData$1$api$1;
        Ref.ObjectRef objectRef4;
        Function2 function2;
        Object obj2;
        int iHashCode;
        int i;
        Object objG = a.g();
        int i2 = this.label;
        if (i2 == 0) {
            f.b(obj);
            x58VarB = a68.b(false, 1, (Object) null);
            booleanRef = new Ref.BooleanRef();
            objectRef = new Ref.ObjectRef();
            DataStoreImpl<T> dataStoreImpl = this.this$0;
            this.L$0 = x58VarB;
            this.L$1 = booleanRef;
            this.L$2 = objectRef;
            this.L$3 = objectRef;
            this.label = 1;
            obj = dataStoreImpl.C(true, this);
            if (obj != objG) {
                objectRef2 = objectRef;
            }
            return objG;
        }
        if (i2 == 1) {
            objectRef = (Ref.ObjectRef) this.L$3;
            objectRef2 = (Ref.ObjectRef) this.L$2;
            booleanRef = (Ref.BooleanRef) this.L$1;
            x58VarB = (x58) this.L$0;
            f.b(obj);
        } else {
            if (i2 == 2) {
                it = (Iterator) this.L$4;
                dataStoreImpl$InitDataStore$doRun$initData$1$api$1 = (DataStoreImpl$InitDataStore$doRun$initData$1$api$1) this.L$3;
                objectRef3 = (Ref.ObjectRef) this.L$2;
                booleanRef3 = (Ref.BooleanRef) this.L$1;
                x58Var2 = (x58) this.L$0;
                f.b(obj);
                while (it.hasNext()) {
                    function2 = (Function2) it.next();
                    this.L$0 = x58Var2;
                    this.L$1 = booleanRef3;
                    this.L$2 = objectRef3;
                    this.L$3 = dataStoreImpl$InitDataStore$doRun$initData$1$api$1;
                    this.L$4 = it;
                    this.label = 2;
                    if (function2.invoke(dataStoreImpl$InitDataStore$doRun$initData$1$api$1, this) == objG) {
                        return objG;
                    }
                }
                objectRef2 = objectRef3;
                booleanRef2 = booleanRef3;
                x58Var = x58Var2;
                ((DataStoreImpl.InitDataStore) this.this$1).initTasks = null;
                this.L$0 = booleanRef2;
                this.L$1 = objectRef2;
                this.L$2 = x58Var;
                this.L$3 = null;
                this.L$4 = null;
                this.label = 3;
                if (x58Var.g((Object) null, this) != objG) {
                    objectRef4 = objectRef2;
                    booleanRef2.element = true;
                    Unit unit = Unit.a;
                    x58Var.h((Object) null);
                    obj2 = objectRef4.element;
                    if (obj2 != null) {
                    }
                    f26 f26VarV = this.this$0.v();
                    this.L$0 = obj2;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.I$0 = iHashCode;
                    this.label = 4;
                    obj = f26VarV.a(this);
                    if (obj != objG) {
                        i = iHashCode;
                    }
                }
                return objG;
            }
            if (i2 == 3) {
                x58Var = (x58) this.L$2;
                objectRef4 = (Ref.ObjectRef) this.L$1;
                booleanRef2 = (Ref.BooleanRef) this.L$0;
                f.b(obj);
                try {
                    booleanRef2.element = true;
                    Unit unit2 = Unit.a;
                    x58Var.h((Object) null);
                    obj2 = objectRef4.element;
                    iHashCode = obj2 != null ? obj2.hashCode() : 0;
                    f26 f26VarV2 = this.this$0.v();
                    this.L$0 = obj2;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.I$0 = iHashCode;
                    this.label = 4;
                    obj = f26VarV2.a(this);
                    if (obj != objG) {
                        i = iHashCode;
                    }
                    return objG;
                } catch (Throwable th) {
                    x58Var.h((Object) null);
                    throw th;
                }
            }
            if (i2 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = this.I$0;
            obj2 = this.L$0;
            f.b(obj);
        }
        return new ol2(obj2, i, ((Number) obj).intValue());
        objectRef.element = ((ol2) obj).c();
        DataStoreImpl$InitDataStore$doRun$initData$1$api$1 dataStoreImpl$InitDataStore$doRun$initData$1$api$2 = new DataStoreImpl$InitDataStore$doRun$initData$1$api$1(x58VarB, booleanRef, objectRef2, this.this$0);
        List list = ((DataStoreImpl.InitDataStore) this.this$1).initTasks;
        if (list != null) {
            it = list.iterator();
            x58Var2 = x58VarB;
            booleanRef3 = booleanRef;
            objectRef3 = objectRef2;
            dataStoreImpl$InitDataStore$doRun$initData$1$api$1 = dataStoreImpl$InitDataStore$doRun$initData$1$api$2;
            while (it.hasNext()) {
                function2 = (Function2) it.next();
                this.L$0 = x58Var2;
                this.L$1 = booleanRef3;
                this.L$2 = objectRef3;
                this.L$3 = dataStoreImpl$InitDataStore$doRun$initData$1$api$1;
                this.L$4 = it;
                this.label = 2;
                if (function2.invoke(dataStoreImpl$InitDataStore$doRun$initData$1$api$1, this) == objG) {
                    return objG;
                }
            }
            objectRef2 = objectRef3;
            booleanRef2 = booleanRef3;
            x58Var = x58Var2;
        } else {
            booleanRef2 = booleanRef;
            x58Var = x58VarB;
        }
        ((DataStoreImpl.InitDataStore) this.this$1).initTasks = null;
        this.L$0 = booleanRef2;
        this.L$1 = objectRef2;
        this.L$2 = x58Var;
        this.L$3 = null;
        this.L$4 = null;
        this.label = 3;
        if (x58Var.g((Object) null, this) != objG) {
            objectRef4 = objectRef2;
            booleanRef2.element = true;
            Unit unit3 = Unit.a;
            x58Var.h((Object) null);
            obj2 = objectRef4.element;
            if (obj2 != null) {
            }
            f26 f26VarV3 = this.this$0.v();
            this.L$0 = obj2;
            this.L$1 = null;
            this.L$2 = null;
            this.I$0 = iHashCode;
            this.label = 4;
            obj = f26VarV3.a(this);
            if (obj != objG) {
                i = iHashCode;
                return new ol2(obj2, i, ((Number) obj).intValue());
            }
        }
        return objG;
    }
}
