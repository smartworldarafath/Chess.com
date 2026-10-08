package androidx.datastore.p007core;

import com.google.android.lq2;
import com.google.android.q22;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001H\n"}, d2 = {"<anonymous>", "T"}, k = 3, mv = {2, 0, 0}, xi = 48)
@lq2(c = "androidx.datastore.core.FileReadScope$readData$2", f = "FileStorage.kt", l = {162, 170}, m = "invokeSuspend", v = 1)
final class FileReadScope$readData$2<T> extends SuspendLambda implements Function1<q22<? super T>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ FileReadScope<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FileReadScope$readData$2(FileReadScope<T> fileReadScope, q22<? super FileReadScope$readData$2> q22Var) {
        super(1, q22Var);
        this.this$0 = fileReadScope;
    }

    public final q22<Unit> create(q22<?> q22Var) {
        return new FileReadScope$readData$2(this.this$0, q22Var);
    }

    public final Object invoke(q22<? super T> q22Var) {
        return create(q22Var).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0048, code lost:
    
        if (r7 == r0) goto L34;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.io.Closeable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Exception {
        /*
            r6 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.g()
            int r1 = r6.label
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L2c
            if (r1 == r3) goto L22
            if (r1 != r2) goto L1a
            java.lang.Object r0 = r6.L$0
            java.io.Closeable r0 = (java.io.Closeable) r0
            kotlin.f.b(r7)     // Catch: java.lang.Throwable -> L17
            goto L7f
        L17:
            r7 = move-exception
            goto L89
        L1a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L22:
            java.lang.Object r1 = r6.L$0
            java.io.Closeable r1 = (java.io.Closeable) r1
            kotlin.f.b(r7)     // Catch: java.lang.Throwable -> L2a
            goto L4b
        L2a:
            r7 = move-exception
            goto L4f
        L2c:
            kotlin.f.b(r7)
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch: java.io.FileNotFoundException -> L55
            androidx.datastore.core.FileReadScope<T> r7 = r6.this$0     // Catch: java.io.FileNotFoundException -> L55
            java.io.File r7 = r7.getFile()     // Catch: java.io.FileNotFoundException -> L55
            r1.<init>(r7)     // Catch: java.io.FileNotFoundException -> L55
            androidx.datastore.core.FileReadScope<T> r7 = r6.this$0     // Catch: java.io.FileNotFoundException -> L55
            com.google.android.mhb r7 = r7.h()     // Catch: java.lang.Throwable -> L2a
            r6.L$0 = r1     // Catch: java.lang.Throwable -> L2a
            r6.label = r3     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r7 = r7.readFrom(r1, r6)     // Catch: java.lang.Throwable -> L2a
            if (r7 != r0) goto L4b
            goto L7c
        L4b:
            com.google.android.lg1.a(r1, r4)     // Catch: java.io.FileNotFoundException -> L55
            return r7
        L4f:
            throw r7     // Catch: java.lang.Throwable -> L50
        L50:
            r3 = move-exception
            com.google.android.lg1.a(r1, r7)     // Catch: java.io.FileNotFoundException -> L55
            throw r3     // Catch: java.io.FileNotFoundException -> L55
        L55:
            androidx.datastore.core.FileReadScope<T> r7 = r6.this$0
            java.io.File r7 = r7.getFile()
            boolean r7 = r7.exists()
            if (r7 == 0) goto La2
            java.io.FileInputStream r7 = new java.io.FileInputStream     // Catch: java.lang.Exception -> L83
            androidx.datastore.core.FileReadScope<T> r1 = r6.this$0     // Catch: java.lang.Exception -> L83
            java.io.File r1 = r1.getFile()     // Catch: java.lang.Exception -> L83
            r7.<init>(r1)     // Catch: java.lang.Exception -> L83
            androidx.datastore.core.FileReadScope<T> r1 = r6.this$0     // Catch: java.lang.Exception -> L83
            com.google.android.mhb r1 = r1.h()     // Catch: java.lang.Throwable -> L85
            r6.L$0 = r7     // Catch: java.lang.Throwable -> L85
            r6.label = r2     // Catch: java.lang.Throwable -> L85
            java.lang.Object r1 = r1.readFrom(r7, r6)     // Catch: java.lang.Throwable -> L85
            if (r1 != r0) goto L7d
        L7c:
            return r0
        L7d:
            r0 = r7
            r7 = r1
        L7f:
            com.google.android.lg1.a(r0, r4)     // Catch: java.lang.Exception -> L83
            goto Lac
        L83:
            r7 = move-exception
            goto L8f
        L85:
            r0 = move-exception
            r5 = r0
            r0 = r7
            r7 = r5
        L89:
            throw r7     // Catch: java.lang.Throwable -> L8a
        L8a:
            r1 = move-exception
            com.google.android.lg1.a(r0, r7)     // Catch: java.lang.Exception -> L83
            throw r1     // Catch: java.lang.Exception -> L83
        L8f:
            boolean r0 = r7 instanceof java.io.FileNotFoundException
            if (r0 == 0) goto La1
            androidx.datastore.core.FileReadScope<T> r0 = r6.this$0
            java.io.File r0 = r0.getFile()
            java.lang.String r0 = r0.getParent()
            java.lang.Exception r7 = com.google.inputmethod.va3.c(r0, r7)
        La1:
            throw r7
        La2:
            androidx.datastore.core.FileReadScope<T> r7 = r6.this$0
            com.google.android.mhb r7 = r7.h()
            java.lang.Object r7 = r7.getDefaultValue()
        Lac:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.p007core.FileReadScope$readData$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
