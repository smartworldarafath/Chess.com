package androidx.datastore.p007core;

import com.google.android.lq2;
import com.google.android.q22;
import com.google.android.ui4;
import com.google.inputmethod.ua4;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$incrementCollector$2$1, reason: from Kotlin metadata */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/ta2;", "", "<anonymous>", "(Lcom/google/android/ta2;)V"}, k = 3, mv = {2, 0, 0})
@lq2(c = "androidx.datastore.core.DataStoreImpl$incrementCollector$2$1", f = "DataStoreImpl.kt", l = {145, 146}, m = "invokeSuspend", v = 1)
final class ta2 extends SuspendLambda implements Function2<com.google.android.ta2, q22<? super Unit>, Object> {
    int label;
    final /* synthetic */ DataStoreImpl<T> this$0;

    /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$incrementCollector$2$1$a */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class a<T> implements ui4 {
        final /* synthetic */ DataStoreImpl<T> a;

        a(DataStoreImpl<T> dataStoreImpl) {
            this.a = dataStoreImpl;
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(Unit unit, q22<? super Unit> q22Var) {
            Object objA;
            return ((((DataStoreImpl) this.a).inMemoryCache.a() instanceof ua4) || (objA = this.a.A(true, q22Var)) != kotlin.coroutines.intrinsics.a.g()) ? Unit.a : objA;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ta2(DataStoreImpl<T> dataStoreImpl, q22<? super ta2> q22Var) {
        super(2, q22Var);
        this.this$0 = dataStoreImpl;
    }

    public final q22<Unit> create(Object obj, q22<?> q22Var) {
        return new ta2(this.this$0, q22Var);
    }

    public final Object invoke(com.google.android.ta2 ta2Var, q22<? super Unit> q22Var) {
        return create(ta2Var, q22Var).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004b, code lost:
    
        if (r5.collect(r1, r4) == r0) goto L15;
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
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            kotlin.f.b(r5)
            goto L4e
        L12:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L1a:
            kotlin.f.b(r5)
            goto L30
        L1e:
            kotlin.f.b(r5)
            androidx.datastore.core.DataStoreImpl<T> r5 = r4.this$0
            androidx.datastore.core.DataStoreImpl$InitDataStore r5 = androidx.datastore.p007core.DataStoreImpl.i(r5)
            r4.label = r3
            java.lang.Object r5 = r5.a(r4)
            if (r5 != r0) goto L30
            goto L4d
        L30:
            androidx.datastore.core.DataStoreImpl<T> r5 = r4.this$0
            com.google.android.f26 r5 = androidx.datastore.p007core.DataStoreImpl.g(r5)
            com.google.android.ai4 r5 = r5.b()
            com.google.android.ai4 r5 = kotlinx.coroutines.flow.d.q(r5)
            androidx.datastore.core.DataStoreImpl$incrementCollector$2$1$a r1 = new androidx.datastore.core.DataStoreImpl$incrementCollector$2$1$a
            androidx.datastore.core.DataStoreImpl<T> r3 = r4.this$0
            r1.<init>(r3)
            r4.label = r2
            java.lang.Object r5 = r5.collect(r1, r4)
            if (r5 != r0) goto L4e
        L4d:
            return r0
        L4e:
            kotlin.Unit r5 = kotlin.Unit.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.p007core.ta2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
