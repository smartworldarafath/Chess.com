package androidx.datastore.p007core;

import com.google.android.lq2;
import com.google.android.q22;
import com.google.android.ta2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: androidx.datastore.core.SimpleActor$offer$2, reason: from Kotlin metadata and case insensitive filesystem */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/ta2;", "", "<anonymous>", "(Lcom/google/android/ta2;)V"}, k = 3, mv = {2, 0, 0})
@lq2(c = "androidx.datastore.core.SimpleActor$offer$2", f = "SimpleActor.kt", l = {114, 114}, m = "invokeSuspend", v = 1)
final class C0224SimpleActor$offer$2 extends SuspendLambda implements Function2<ta2, q22<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ SimpleActor<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C0224SimpleActor$offer$2(SimpleActor<T> simpleActor, q22<? super C0224SimpleActor$offer$2> q22Var) {
        super(2, q22Var);
        this.this$0 = simpleActor;
    }

    public final q22<Unit> create(Object obj, q22<?> q22Var) {
        return new C0224SimpleActor$offer$2(this.this$0, q22Var);
    }

    public final Object invoke(ta2 ta2Var, q22<? super Unit> q22Var) {
        return create(ta2Var, q22Var).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0051 A[PHI: r1 r6
  0x0051: PHI (r1v1 kotlin.jvm.functions.Function2) = (r1v2 kotlin.jvm.functions.Function2), (r1v4 kotlin.jvm.functions.Function2) binds: [B:13:0x004e, B:9:0x001a] A[DONT_GENERATE, DONT_INLINE]
  0x0051: PHI (r6v5 java.lang.Object) = (r6v12 java.lang.Object), (r6v0 java.lang.Object) binds: [B:13:0x004e, B:9:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005a, code lost:
    
        if (r1.invoke(r6, r5) == r0) goto L17;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x005a -> B:18:0x005d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.g()
            int r1 = r5.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L22
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            kotlin.f.b(r6)
            goto L5d
        L12:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1a:
            java.lang.Object r1 = r5.L$0
            kotlin.jvm.functions.Function2 r1 = (kotlin.jvm.functions.Function2) r1
            kotlin.f.b(r6)
            goto L51
        L22:
            kotlin.f.b(r6)
            androidx.datastore.core.SimpleActor<T> r6 = r5.this$0
            com.google.android.s30 r6 = androidx.datastore.p007core.SimpleActor.e(r6)
            int r6 = r6.b()
            if (r6 <= 0) goto L6c
        L31:
            androidx.datastore.core.SimpleActor<T> r6 = r5.this$0
            com.google.android.ta2 r6 = androidx.datastore.p007core.SimpleActor.f(r6)
            kotlinx.coroutines.j.h(r6)
            androidx.datastore.core.SimpleActor<T> r6 = r5.this$0
            kotlin.jvm.functions.Function2 r1 = androidx.datastore.p007core.SimpleActor.c(r6)
            androidx.datastore.core.SimpleActor<T> r6 = r5.this$0
            com.google.android.h81 r6 = androidx.datastore.p007core.SimpleActor.d(r6)
            r5.L$0 = r1
            r5.label = r3
            java.lang.Object r6 = r6.c(r5)
            if (r6 != r0) goto L51
            goto L5c
        L51:
            r4 = 0
            r5.L$0 = r4
            r5.label = r2
            java.lang.Object r6 = r1.invoke(r6, r5)
            if (r6 != r0) goto L5d
        L5c:
            return r0
        L5d:
            androidx.datastore.core.SimpleActor<T> r6 = r5.this$0
            com.google.android.s30 r6 = androidx.datastore.p007core.SimpleActor.e(r6)
            int r6 = r6.a()
            if (r6 != 0) goto L31
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        L6c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "Check failed."
            r6.<init>(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.p007core.C0224SimpleActor$offer$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
