package androidx.datastore.p007core.okio;

import com.google.android.a68;
import com.google.android.b39;
import com.google.android.ox3;
import com.google.android.ps4;
import com.google.android.q22;
import com.google.android.t84;
import com.google.android.ut0;
import com.google.android.x58;
import com.google.inputmethod.f26;
import com.google.inputmethod.ig1;
import com.google.inputmethod.k9c;
import com.google.inputmethod.lp8;
import com.google.inputmethod.n30;
import com.google.inputmethod.qne;
import com.google.inputmethod.t04;
import com.google.inputmethod.x8a;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.a;
import kotlin.f;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B;\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011JF\u0010\u0019\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00122.\u0010\u0018\u001a*\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0014\u0012\u0004\u0012\u00020\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u0013H\u0096@¢\u0006\u0004\b\u0019\u0010\u001aJ:\u0010\u001d\u001a\u00020\f2(\u0010\u0018\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u001bH\u0096@¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001f\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\"R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b \u0010'R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010(R\u0014\u0010+\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010*R\u0014\u0010/\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.¨\u00060"}, d2 = {"Landroidx/datastore/core/okio/OkioStorageConnection;", "T", "Lcom/google/android/k9c;", "Lcom/google/android/t84;", "fileSystem", "Lcom/google/android/b39;", "path", "Lcom/google/android/lp8;", "serializer", "Lcom/google/android/f26;", "coordinator", "Lkotlin/Function0;", "", "onClose", "<init>", "(Lcom/google/android/t84;Lcom/google/android/b39;Lcom/google/android/lp8;Lcom/google/android/f26;Lkotlin/jvm/functions/Function0;)V", "f", "()V", "R", "Lkotlin/Function3;", "Lcom/google/android/x8a;", "", "Lcom/google/android/q22;", "", "block", "e", "(Lcom/google/android/ps4;Lcom/google/android/q22;)Ljava/lang/Object;", "Lkotlin/Function2;", "Lcom/google/android/qne;", "b", "(Lkotlin/jvm/functions/Function2;Lcom/google/android/q22;)Ljava/lang/Object;", "close", "a", "Lcom/google/android/t84;", "Lcom/google/android/b39;", "c", "Lcom/google/android/lp8;", "d", "Lcom/google/android/f26;", "()Lcom/google/android/f26;", "Lkotlin/jvm/functions/Function0;", "Lcom/google/android/n30;", "Lcom/google/android/n30;", "closed", "Lcom/google/android/x58;", "g", "Lcom/google/android/x58;", "transactionMutex", "datastore-core-okio"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class OkioStorageConnection<T> implements k9c<T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final t84 fileSystem;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final b39 path;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final lp8<T> serializer;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final f26 coordinator;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final Function0<Unit> onClose;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final n30 closed;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final x58 transactionMutex;

    public OkioStorageConnection(t84 t84Var, b39 b39Var, lp8<T> lp8Var, f26 f26Var, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(t84Var, "fileSystem");
        Intrinsics.checkNotNullParameter(b39Var, "path");
        Intrinsics.checkNotNullParameter(lp8Var, "serializer");
        Intrinsics.checkNotNullParameter(f26Var, "coordinator");
        Intrinsics.checkNotNullParameter(function0, "onClose");
        this.fileSystem = t84Var;
        this.path = b39Var;
        this.serializer = lp8Var;
        this.coordinator = f26Var;
        this.onClose = function0;
        this.closed = new n30(false);
        this.transactionMutex = a68.b(false, 1, (Object) null);
    }

    private final void f() {
        if (this.closed.a()) {
            throw new IllegalStateException("StorageConnection has already been disposed.");
        }
    }

    @Override // com.google.inputmethod.k9c
    /* JADX INFO: renamed from: a, reason: from getter */
    public f26 getCoordinator() {
        return this.coordinator;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00c1 A[Catch: all -> 0x00d1, IOException -> 0x00d4, TRY_ENTER, TryCatch #1 {all -> 0x00d1, blocks: (B:36:0x00c1, B:38:0x00c9, B:44:0x00d8, B:47:0x00e0, B:54:0x00ee, B:53:0x00eb), top: B:69:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00c9 A[Catch: all -> 0x00d1, IOException -> 0x00d4, TRY_LEAVE, TryCatch #1 {all -> 0x00d1, blocks: (B:36:0x00c1, B:38:0x00c9, B:44:0x00d8, B:47:0x00e0, B:54:0x00ee, B:53:0x00eb), top: B:69:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00e0 A[Catch: all -> 0x00d1, IOException -> 0x00d4, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x00d1, blocks: (B:36:0x00c1, B:38:0x00c9, B:44:0x00d8, B:47:0x00e0, B:54:0x00ee, B:53:0x00eb), top: B:69:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.inputmethod.k9c
    public Object b(Function2<? super qne<T>, ? super q22<? super Unit>, ? extends Object> function2, q22<? super Unit> q22Var) throws Throwable {
        OkioStorageConnection$writeScope$1 okioStorageConnection$writeScope$1;
        OkioStorageConnection$writeScope$1 okioStorageConnection$writeScope$2;
        b39 b39VarM;
        b39 b39VarJ;
        OkioWriteScope okioWriteScope;
        Throwable th;
        ig1 ig1Var;
        OkioStorageConnection$writeScope$1 okioStorageConnection$writeScope$3;
        b39 b39Var;
        if (q22Var instanceof OkioStorageConnection$writeScope$1) {
            okioStorageConnection$writeScope$1 = (OkioStorageConnection$writeScope$1) q22Var;
            int i = okioStorageConnection$writeScope$1.label;
            if ((i & t04.INVALID_ID) != 0) {
                okioStorageConnection$writeScope$1.label = i - t04.INVALID_ID;
            } else {
                okioStorageConnection$writeScope$1 = new OkioStorageConnection$writeScope$1(this, q22Var);
            }
        } else {
            okioStorageConnection$writeScope$1 = new OkioStorageConnection$writeScope$1(this, q22Var);
        }
        Object obj = okioStorageConnection$writeScope$1.result;
        Object objG = a.g();
        int i2 = okioStorageConnection$writeScope$1.label;
        try {
            try {
                try {
                    try {
                        try {
                            if (i2 == 0) {
                                f.b(obj);
                                f();
                                b39VarJ = this.path.j();
                                if (b39VarJ == null) {
                                    throw new IllegalStateException("must have a parent path");
                                }
                                this.fileSystem.h(b39VarJ, false);
                                okioStorageConnection$writeScope$2 = this.transactionMutex;
                                okioStorageConnection$writeScope$1.L$0 = function2;
                                okioStorageConnection$writeScope$1.L$1 = b39VarJ;
                                okioStorageConnection$writeScope$1.L$2 = okioStorageConnection$writeScope$2;
                                okioStorageConnection$writeScope$1.label = 1;
                                if (okioStorageConnection$writeScope$2.g((Object) null, okioStorageConnection$writeScope$1) != objG) {
                                }
                                return objG;
                            }
                            if (i2 != 1) {
                                if (i2 != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ig1Var = (ig1) okioStorageConnection$writeScope$1.L$2;
                                b39 b39Var2 = (b39) okioStorageConnection$writeScope$1.L$1;
                                okioStorageConnection$writeScope$3 = (x58) okioStorageConnection$writeScope$1.L$0;
                                try {
                                    f.b(obj);
                                    b39Var = b39Var2;
                                    Unit unit = Unit.a;
                                    try {
                                        ig1Var.close();
                                        th = null;
                                    } catch (Throwable th2) {
                                        th = th2;
                                    }
                                    if (th == null) {
                                        throw th;
                                    }
                                    if (this.fileSystem.q(b39Var)) {
                                        this.fileSystem.c(b39Var, this.path);
                                    }
                                    Unit unit2 = Unit.a;
                                    okioStorageConnection$writeScope$3.h((Object) null);
                                    return Unit.a;
                                } catch (Throwable th3) {
                                    th = th3;
                                    try {
                                        ig1Var.close();
                                    } catch (Throwable th4) {
                                        ox3.a(th, th4);
                                    }
                                    throw th;
                                }
                            }
                            OkioStorageConnection$writeScope$1 okioStorageConnection$writeScope$4 = (x58) okioStorageConnection$writeScope$1.L$2;
                            b39VarJ = (b39) okioStorageConnection$writeScope$1.L$1;
                            Function2<? super qne<T>, ? super q22<? super Unit>, ? extends Object> function3 = (Function2) okioStorageConnection$writeScope$1.L$0;
                            f.b(obj);
                            okioStorageConnection$writeScope$2 = okioStorageConnection$writeScope$4;
                            function2 = function3;
                            okioStorageConnection$writeScope$1.L$0 = okioStorageConnection$writeScope$2;
                            okioStorageConnection$writeScope$1.L$1 = b39VarM;
                            okioStorageConnection$writeScope$1.L$2 = okioWriteScope;
                            okioStorageConnection$writeScope$1.label = 2;
                            if (function2.invoke(okioWriteScope, okioStorageConnection$writeScope$1) != objG) {
                                okioStorageConnection$writeScope$3 = okioStorageConnection$writeScope$2;
                                b39Var = b39VarM;
                                ig1Var = okioWriteScope;
                                Unit unit3 = Unit.a;
                                ig1Var.close();
                                th = null;
                                if (th == null) {
                                    throw th;
                                }
                                if (this.fileSystem.q(b39Var)) {
                                    this.fileSystem.c(b39Var, this.path);
                                }
                                Unit unit4 = Unit.a;
                                okioStorageConnection$writeScope$3.h((Object) null);
                                return Unit.a;
                            }
                            return objG;
                        } catch (Throwable th5) {
                            th = th5;
                            ig1Var = okioWriteScope;
                            ig1Var.close();
                            throw th;
                        }
                        this.fileSystem.p(b39VarM, false);
                        okioWriteScope = new OkioWriteScope(this.fileSystem, b39VarM, this.serializer);
                    } catch (IOException e) {
                        e = e;
                        if (this.fileSystem.q(b39VarM)) {
                            try {
                                this.fileSystem.m(b39VarM);
                            } catch (IOException unused) {
                            }
                        }
                        throw e;
                    }
                    b39VarM = b39VarJ.m(this.path.g() + ".tmp");
                } catch (Throwable th6) {
                    th = th6;
                    okioStorageConnection$writeScope$2.h((Object) null);
                    throw th;
                }
            } catch (Throwable th7) {
                th = th7;
                okioStorageConnection$writeScope$2 = okioStorageConnection$writeScope$1;
                okioStorageConnection$writeScope$2.h((Object) null);
                throw th;
            }
        } catch (IOException e2) {
            e = e2;
            okioStorageConnection$writeScope$2 = okioStorageConnection$writeScope$1;
            b39VarM = objG;
        }
    }

    @Override // com.google.inputmethod.ig1
    public void close() {
        this.closed.b(true);
        this.onClose.invoke();
    }

    /* JADX WARN: Code duplicated, block: B:28:0x006e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x0070  */
    /* JADX WARN: Code duplicated, block: B:31:0x0076 A[Catch: all -> 0x0077, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x0077, blocks: (B:31:0x0076, B:40:0x0086, B:39:0x0083, B:36:0x007e), top: B:52:0x0022, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x008d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [com.google.android.ps4, com.google.android.ps4<? super com.google.android.x8a<T>, ? super java.lang.Boolean, ? super com.google.android.q22<? super R>, ? extends java.lang.Object>] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r10v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v9 */
    @Override // com.google.inputmethod.k9c
    public <R> Object e(ps4<? super x8a<T>, ? super Boolean, ? super q22<? super R>, ? extends Object> ps4Var, q22<? super R> q22Var) throws Throwable {
        OkioStorageConnection$readScope$1 okioStorageConnection$readScope$1;
        Throwable th;
        ig1 ig1Var;
        ?? r10;
        if (q22Var instanceof OkioStorageConnection$readScope$1) {
            okioStorageConnection$readScope$1 = (OkioStorageConnection$readScope$1) q22Var;
            int i = okioStorageConnection$readScope$1.label;
            if ((i & t04.INVALID_ID) != 0) {
                okioStorageConnection$readScope$1.label = i - t04.INVALID_ID;
            } else {
                okioStorageConnection$readScope$1 = new OkioStorageConnection$readScope$1(this, q22Var);
            }
        } else {
            okioStorageConnection$readScope$1 = new OkioStorageConnection$readScope$1(this, q22Var);
        }
        Object obj = okioStorageConnection$readScope$1.result;
        Object objG = a.g();
        int i2 = okioStorageConnection$readScope$1.label;
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ps4Var = (ps4<? super x8a<T>, ? super Boolean, ? super q22<? super R>, ? extends Object>) okioStorageConnection$readScope$1.Z$0;
                ig1Var = (ig1) okioStorageConnection$readScope$1.L$0;
                try {
                    f.b(obj);
                    r10 = ps4Var;
                    try {
                        ig1Var.close();
                        th = null;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    if (th == null) {
                        throw th;
                    }
                    if (r10 != 0) {
                        x58.a.c(this.transactionMutex, (Object) null, 1, (Object) null);
                    }
                    return obj;
                } catch (Throwable th3) {
                    th = th3;
                    try {
                        ig1Var.close();
                    } catch (Throwable th4) {
                        ox3.a(th, th4);
                    }
                    throw th;
                }
            }
            f.b(obj);
            f();
            boolean zB = x58.a.b(this.transactionMutex, (Object) null, 1, (Object) null);
            try {
                OkioReadScope okioReadScope = new OkioReadScope(this.fileSystem, this.path, this.serializer);
                try {
                    Boolean boolA = ut0.a(zB);
                    okioStorageConnection$readScope$1.L$0 = okioReadScope;
                    okioStorageConnection$readScope$1.Z$0 = zB;
                    okioStorageConnection$readScope$1.label = 1;
                    Object objInvoke = ps4Var.invoke(okioReadScope, boolA, okioStorageConnection$readScope$1);
                    if (objInvoke == objG) {
                        return objG;
                    }
                    obj = objInvoke;
                    r10 = zB;
                    ig1Var = okioReadScope;
                    ig1Var.close();
                    th = null;
                    if (th == null) {
                        throw th;
                    }
                    if (r10 != 0) {
                        x58.a.c(this.transactionMutex, (Object) null, 1, (Object) null);
                    }
                    return obj;
                } catch (Throwable th5) {
                    th = th5;
                    ps4Var = zB;
                    ig1Var = okioReadScope;
                    ig1Var.close();
                    throw th;
                }
            } catch (Throwable th6) {
                th = th6;
                ps4Var = zB;
                if (ps4Var != 0) {
                    x58.a.c(this.transactionMutex, (Object) null, 1, (Object) null);
                }
                throw th;
            }
        } catch (Throwable th7) {
            th = th7;
            if (ps4Var != 0) {
                x58.a.c(this.transactionMutex, (Object) null, 1, (Object) null);
            }
            throw th;
        }
    }
}
