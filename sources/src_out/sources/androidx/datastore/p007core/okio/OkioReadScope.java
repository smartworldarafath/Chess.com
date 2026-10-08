package androidx.datastore.p007core.okio;

import com.google.android.b39;
import com.google.android.cw0;
import com.google.android.kp8;
import com.google.android.ox3;
import com.google.android.q22;
import com.google.android.t84;
import com.google.inputmethod.lp8;
import com.google.inputmethod.n30;
import com.google.inputmethod.t04;
import com.google.inputmethod.va3;
import com.google.inputmethod.x8a;
import java.io.Closeable;
import java.io.FileNotFoundException;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.a;
import kotlin.f;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B%\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0004¢\u0006\u0004\b\u0010\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u00038\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0006\u001a\u00020\u00058\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R \u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001e¨\u0006 "}, d2 = {"Landroidx/datastore/core/okio/OkioReadScope;", "T", "Lcom/google/android/x8a;", "Lcom/google/android/t84;", "fileSystem", "Lcom/google/android/b39;", "path", "Lcom/google/android/lp8;", "serializer", "<init>", "(Lcom/google/android/t84;Lcom/google/android/b39;Lcom/google/android/lp8;)V", "d", "(Lcom/google/android/q22;)Ljava/lang/Object;", "", "close", "()V", "f", "a", "Lcom/google/android/t84;", "g", "()Lcom/google/android/t84;", "b", "Lcom/google/android/b39;", "h", "()Lcom/google/android/b39;", "c", "Lcom/google/android/lp8;", "i", "()Lcom/google/android/lp8;", "Lcom/google/android/n30;", "Lcom/google/android/n30;", "closed", "datastore-core-okio"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class OkioReadScope<T> implements x8a<T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final t84 fileSystem;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final b39 path;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final lp8<T> serializer;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final n30 closed;

    public OkioReadScope(t84 t84Var, b39 b39Var, lp8<T> lp8Var) {
        Intrinsics.checkNotNullParameter(t84Var, "fileSystem");
        Intrinsics.checkNotNullParameter(b39Var, "path");
        Intrinsics.checkNotNullParameter(lp8Var, "serializer");
        this.fileSystem = t84Var;
        this.path = b39Var;
        this.serializer = lp8Var;
        this.closed = new n30(false);
    }

    /* JADX WARN: Code duplicated, block: B:103:0x008a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:105:0x007b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:72:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:73:0x00ec A[Catch: Exception -> 0x00ed, TRY_ENTER, TRY_LEAVE, TryCatch #3 {Exception -> 0x00ed, blocks: (B:73:0x00ec, B:50:0x00a6), top: B:89:0x00a6 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:80:0x0104  */
    /* JADX WARN: Code duplicated, block: B:83:0x00cc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x00dd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x00a6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v17, types: [androidx.datastore.core.okio.OkioReadScope] */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r8v31 */
    /* JADX WARN: Type inference failed for: r9v11, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r9v17, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v33, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r9v8 */
    static /* synthetic */ <T> Object j(OkioReadScope<T> okioReadScope, q22<? super T> q22Var) throws Exception {
        OkioReadScope$readData$1 okioReadScope$readData$1;
        Closeable closeableD;
        OkioReadScope<T> okioReadScope2;
        Closeable closeable;
        ?? th;
        Object objA;
        Closeable closeable2;
        Throwable th2;
        Throwable th3;
        if (q22Var instanceof OkioReadScope$readData$1) {
            okioReadScope$readData$1 = (OkioReadScope$readData$1) q22Var;
            int i = okioReadScope$readData$1.label;
            if ((i & t04.INVALID_ID) != 0) {
                okioReadScope$readData$1.label = i - t04.INVALID_ID;
            } else {
                okioReadScope$readData$1 = new OkioReadScope$readData$1(okioReadScope, q22Var);
            }
        } else {
            okioReadScope$readData$1 = new OkioReadScope$readData$1(okioReadScope, q22Var);
        }
        Object obj = okioReadScope$readData$1.result;
        Object objG = a.g();
        ?? r2 = okioReadScope$readData$1.label;
        Object th4 = null;
        try {
            if (r2 == 0) {
                f.b(obj);
                okioReadScope.f();
                try {
                    Closeable closeableD2 = kp8.d(((OkioReadScope) okioReadScope).fileSystem.U(((OkioReadScope) okioReadScope).path));
                    try {
                        lp8<T> lp8Var = ((OkioReadScope) okioReadScope).serializer;
                        okioReadScope$readData$1.L$0 = okioReadScope;
                        okioReadScope$readData$1.L$1 = closeableD2;
                        okioReadScope$readData$1.label = 1;
                        Object objA2 = lp8Var.a((cw0) closeableD2, okioReadScope$readData$1);
                        if (objA2 != objG) {
                            r2 = okioReadScope;
                            closeable2 = closeableD2;
                            obj = objA2;
                            if (closeable2 != null) {
                                closeable2.close();
                            }
                            th3 = null;
                        }
                    } catch (Throwable th5) {
                        r2 = okioReadScope;
                        closeable2 = closeableD2;
                        th2 = th5;
                        if (closeable2 != null) {
                            closeable2.close();
                        }
                        th3 = th2;
                        obj = null;
                    }
                } catch (FileNotFoundException unused) {
                    if (((OkioReadScope) okioReadScope).fileSystem.q(((OkioReadScope) okioReadScope).path)) {
                        return ((OkioReadScope) okioReadScope).serializer.getDefaultValue();
                    }
                    try {
                        closeableD = kp8.d(((OkioReadScope) okioReadScope).fileSystem.U(((OkioReadScope) okioReadScope).path));
                        try {
                            lp8<T> lp8Var2 = ((OkioReadScope) okioReadScope).serializer;
                            okioReadScope$readData$1.L$0 = okioReadScope;
                            okioReadScope$readData$1.L$1 = closeableD;
                            okioReadScope$readData$1.label = 2;
                            objA = lp8Var2.a((cw0) closeableD, okioReadScope$readData$1);
                            if (objA != objG) {
                                okioReadScope2 = okioReadScope;
                                closeable = closeableD;
                                obj = objA;
                                if (closeable != null) {
                                    closeable.close();
                                }
                                Object obj2 = th4;
                                th4 = obj;
                                th = obj2;
                                okioReadScope = okioReadScope2;
                                if (th == 0) {
                                    return th4;
                                }
                                throw th;
                            }
                        } catch (Throwable th6) {
                            okioReadScope2 = okioReadScope;
                            closeable = closeableD;
                            th = th6;
                            if (closeable != null) {
                                closeable.close();
                            }
                        }
                    } catch (Exception e) {
                        okioReadScope2 = okioReadScope;
                        e = e;
                        if (e instanceof FileNotFoundException) {
                            throw va3.c(String.valueOf(((OkioReadScope) okioReadScope2).path.j()), e);
                        }
                        throw e;
                    }
                }
                return objG;
            }
            if (r2 != 1) {
                if (r2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                closeable = (Closeable) okioReadScope$readData$1.L$1;
                okioReadScope2 = (OkioReadScope) okioReadScope$readData$1.L$0;
                try {
                    f.b(obj);
                    if (closeable != null) {
                        try {
                            closeable.close();
                        } catch (Throwable th7) {
                            th4 = th7;
                        }
                    }
                    Object obj3 = th4;
                    th4 = obj;
                    th = obj3;
                } catch (Throwable th8) {
                    th = th8;
                    if (closeable != null) {
                        try {
                            closeable.close();
                        } catch (Throwable th9) {
                            try {
                                ox3.a((Throwable) th, th9);
                            } catch (Exception e2) {
                                e = e2;
                                if (e instanceof FileNotFoundException) {
                                    throw va3.c(String.valueOf(((OkioReadScope) okioReadScope2).path.j()), e);
                                }
                                throw e;
                            }
                        }
                    }
                }
                okioReadScope = okioReadScope2;
                if (th == 0) {
                    return th4;
                }
                throw th;
            }
            closeable2 = (Closeable) okioReadScope$readData$1.L$1;
            r2 = (OkioReadScope) okioReadScope$readData$1.L$0;
            try {
                f.b(obj);
                r2 = r2;
                if (closeable2 != null) {
                    try {
                        closeable2.close();
                    } catch (Throwable th10) {
                        th3 = th10;
                    }
                }
                th3 = null;
            } catch (Throwable th11) {
                th2 = th11;
                if (closeable2 != null) {
                    try {
                        closeable2.close();
                    } catch (Throwable th12) {
                        ox3.a(th2, th12);
                    }
                }
                th3 = th2;
                obj = null;
            }
            if (th3 == null) {
                return obj;
            }
            throw th3;
        } catch (FileNotFoundException unused2) {
            okioReadScope = (OkioReadScope<T>) r2;
        }
        if (((OkioReadScope) okioReadScope).fileSystem.q(((OkioReadScope) okioReadScope).path)) {
            return ((OkioReadScope) okioReadScope).serializer.getDefaultValue();
        }
        closeableD = kp8.d(((OkioReadScope) okioReadScope).fileSystem.U(((OkioReadScope) okioReadScope).path));
        lp8<T> lp8Var3 = ((OkioReadScope) okioReadScope).serializer;
        okioReadScope$readData$1.L$0 = okioReadScope;
        okioReadScope$readData$1.L$1 = closeableD;
        okioReadScope$readData$1.label = 2;
        objA = lp8Var3.a((cw0) closeableD, okioReadScope$readData$1);
        if (objA != objG) {
            okioReadScope2 = okioReadScope;
            closeable = closeableD;
            obj = objA;
            if (closeable != null) {
                closeable.close();
            }
            Object obj4 = th4;
            th4 = obj;
            th = obj4;
            okioReadScope = okioReadScope2;
            if (th == 0) {
                return th4;
            }
            throw th;
        }
        return objG;
    }

    @Override // com.google.inputmethod.ig1
    public void close() {
        this.closed.b(true);
    }

    @Override // com.google.inputmethod.x8a
    public Object d(q22<? super T> q22Var) {
        return j(this, q22Var);
    }

    protected final void f() {
        if (this.closed.a()) {
            throw new IllegalStateException("This scope has already been closed.");
        }
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    protected final t84 getFileSystem() {
        return this.fileSystem;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    protected final b39 getPath() {
        return this.path;
    }

    protected final lp8<T> i() {
        return this.serializer;
    }
}
