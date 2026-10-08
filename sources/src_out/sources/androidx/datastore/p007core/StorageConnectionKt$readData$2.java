package androidx.datastore.p007core;

import com.google.android.lq2;
import com.google.android.ps4;
import com.google.android.q22;
import com.google.inputmethod.x8a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\n"}, d2 = {"T", "Lcom/google/android/x8a;", "", "it", "<anonymous>"}, k = 3, mv = {2, 0, 0})
@lq2(c = "androidx.datastore.core.StorageConnectionKt$readData$2", f = "StorageConnection.kt", l = {63}, m = "invokeSuspend", v = 1)
final class StorageConnectionKt$readData$2<T> extends SuspendLambda implements ps4<x8a<T>, Boolean, q22<? super T>, Object> {
    private /* synthetic */ Object L$0;
    int label;

    StorageConnectionKt$readData$2(q22<? super StorageConnectionKt$readData$2> q22Var) {
        super(3, q22Var);
    }

    public final Object a(x8a<T> x8aVar, boolean z, q22<? super T> q22Var) {
        StorageConnectionKt$readData$2 storageConnectionKt$readData$2 = new StorageConnectionKt$readData$2(q22Var);
        storageConnectionKt$readData$2.L$0 = x8aVar;
        return storageConnectionKt$readData$2.invokeSuspend(Unit.a);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return a((x8a) obj, ((Boolean) obj2).booleanValue(), (q22) obj3);
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
        x8a x8aVar = (x8a) this.L$0;
        this.label = 1;
        Object objD = x8aVar.d(this);
        return objD == objG ? objG : objD;
    }
}
