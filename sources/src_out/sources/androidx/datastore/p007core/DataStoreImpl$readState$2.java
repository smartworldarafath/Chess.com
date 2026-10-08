package androidx.datastore.p007core;

import com.google.android.lq2;
import com.google.android.q22;
import com.google.android.ta2;
import com.google.inputmethod.o6c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lcom/google/android/ta2;", "Lcom/google/android/o6c;", "<anonymous>", "(Lcom/google/android/ta2;)Lcom/google/android/o6c;"}, k = 3, mv = {2, 0, 0})
@lq2(c = "androidx.datastore.core.DataStoreImpl$readState$2", f = "DataStoreImpl.kt", l = {232, 240}, m = "invokeSuspend", v = 1)
final class DataStoreImpl$readState$2<T> extends SuspendLambda implements Function2<ta2, q22<? super o6c<T>>, Object> {
    final /* synthetic */ boolean $requireLock;
    int label;
    final /* synthetic */ DataStoreImpl<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DataStoreImpl$readState$2(DataStoreImpl<T> dataStoreImpl, boolean z, q22<? super DataStoreImpl$readState$2> q22Var) {
        super(2, q22Var);
        this.this$0 = dataStoreImpl;
        this.$requireLock = z;
    }

    public final q22<Unit> create(Object obj, q22<?> q22Var) {
        return new DataStoreImpl$readState$2(this.this$0, this.$requireLock, q22Var);
    }

    public final Object invoke(ta2 ta2Var, q22<? super o6c<T>> q22Var) {
        return create(ta2Var, q22Var).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0051, code lost:
    
        if (r5 == r0) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.g()
            int r1 = r4.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L20
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            kotlin.f.b(r5)
            goto L54
        L12:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L1a:
            kotlin.f.b(r5)     // Catch: java.lang.Throwable -> L1e
            goto L47
        L1e:
            r5 = move-exception
            goto L57
        L20:
            kotlin.f.b(r5)
            androidx.datastore.core.DataStoreImpl<T> r5 = r4.this$0
            com.google.android.gn2 r5 = androidx.datastore.p007core.DataStoreImpl.h(r5)
            com.google.android.o6c r5 = r5.a()
            boolean r5 = r5 instanceof com.google.inputmethod.ua4
            if (r5 == 0) goto L3c
            androidx.datastore.core.DataStoreImpl<T> r5 = r4.this$0
            com.google.android.gn2 r5 = androidx.datastore.p007core.DataStoreImpl.h(r5)
            com.google.android.o6c r5 = r5.a()
            return r5
        L3c:
            androidx.datastore.core.DataStoreImpl<T> r5 = r4.this$0     // Catch: java.lang.Throwable -> L1e
            r4.label = r3     // Catch: java.lang.Throwable -> L1e
            java.lang.Object r5 = androidx.datastore.p007core.DataStoreImpl.m(r5, r4)     // Catch: java.lang.Throwable -> L1e
            if (r5 != r0) goto L47
            goto L53
        L47:
            androidx.datastore.core.DataStoreImpl<T> r5 = r4.this$0
            boolean r1 = r4.$requireLock
            r4.label = r2
            java.lang.Object r5 = androidx.datastore.p007core.DataStoreImpl.n(r5, r1, r4)
            if (r5 != r0) goto L54
        L53:
            return r0
        L54:
            com.google.android.o6c r5 = (com.google.inputmethod.o6c) r5
            return r5
        L57:
            com.google.android.t8a r0 = new com.google.android.t8a
            r1 = -1
            r0.<init>(r5, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.p007core.DataStoreImpl$readState$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
