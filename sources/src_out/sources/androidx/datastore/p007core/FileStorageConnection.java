package androidx.datastore.p007core;

import com.google.android.a68;
import com.google.android.ox3;
import com.google.android.ps4;
import com.google.android.q22;
import com.google.android.ut0;
import com.google.android.x58;
import com.google.inputmethod.f26;
import com.google.inputmethod.g84;
import com.google.inputmethod.ig1;
import com.google.inputmethod.k9c;
import com.google.inputmethod.mhb;
import com.google.inputmethod.qne;
import com.google.inputmethod.t04;
import com.google.inputmethod.x8a;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.a;
import kotlin.f;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B3\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\n*\u00020\u0003H\u0002¢\u0006\u0004\b\u0010\u0010\u0011JF\u0010\u0019\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00122.\u0010\u0018\u001a*\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0014\u0012\u0004\u0012\u00020\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u0013H\u0096@¢\u0006\u0004\b\u0019\u0010\u001aJ:\u0010\u001d\u001a\u00020\n2(\u0010\u0018\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u001bH\u0096@¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001f\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\"R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b \u0010%R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010*\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010)R\u0014\u0010-\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010,¨\u0006."}, d2 = {"Landroidx/datastore/core/FileStorageConnection;", "T", "Lcom/google/android/k9c;", "Ljava/io/File;", "file", "Lcom/google/android/mhb;", "serializer", "Lcom/google/android/f26;", "coordinator", "Lkotlin/Function0;", "", "onClose", "<init>", "(Ljava/io/File;Lcom/google/android/mhb;Lcom/google/android/f26;Lkotlin/jvm/functions/Function0;)V", "f", "()V", "g", "(Ljava/io/File;)V", "R", "Lkotlin/Function3;", "Lcom/google/android/x8a;", "", "Lcom/google/android/q22;", "", "block", "e", "(Lcom/google/android/ps4;Lcom/google/android/q22;)Ljava/lang/Object;", "Lkotlin/Function2;", "Lcom/google/android/qne;", "b", "(Lkotlin/jvm/functions/Function2;Lcom/google/android/q22;)Ljava/lang/Object;", "close", "a", "Ljava/io/File;", "Lcom/google/android/mhb;", "c", "Lcom/google/android/f26;", "()Lcom/google/android/f26;", "d", "Lkotlin/jvm/functions/Function0;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "closed", "Lcom/google/android/x58;", "Lcom/google/android/x58;", "transactionMutex", "datastore-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FileStorageConnection<T> implements k9c<T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final File file;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final mhb<T> serializer;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final f26 coordinator;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Function0<Unit> onClose;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final AtomicBoolean closed;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final x58 transactionMutex;

    public FileStorageConnection(File file, mhb<T> mhbVar, f26 f26Var, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(mhbVar, "serializer");
        Intrinsics.checkNotNullParameter(f26Var, "coordinator");
        Intrinsics.checkNotNullParameter(function0, "onClose");
        this.file = file;
        this.serializer = mhbVar;
        this.coordinator = f26Var;
        this.onClose = function0;
        this.closed = new AtomicBoolean(false);
        this.transactionMutex = a68.b(false, 1, (Object) null);
    }

    private final void f() {
        if (this.closed.get()) {
            throw new IllegalStateException("StorageConnection has already been disposed.");
        }
    }

    private final void g(File file) throws IOException {
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
            if (parentFile.isDirectory()) {
                return;
            }
            throw new IOException("Unable to create parent directories of " + file);
        }
    }

    @Override // com.google.inputmethod.k9c
    /* JADX INFO: renamed from: a, reason: from getter */
    public f26 getCoordinator() {
        return this.coordinator;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00ab A[Catch: all -> 0x00e0, IOException -> 0x00e3, TRY_ENTER, TryCatch #1 {all -> 0x00e0, blocks: (B:34:0x00ab, B:36:0x00b1, B:39:0x00ba, B:40:0x00df, B:45:0x00e7, B:48:0x00ef, B:55:0x00fd, B:54:0x00fa), top: B:67:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00ef A[Catch: all -> 0x00e0, IOException -> 0x00e3, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x00e0, blocks: (B:34:0x00ab, B:36:0x00b1, B:39:0x00ba, B:40:0x00df, B:45:0x00e7, B:48:0x00ef, B:55:0x00fd, B:54:0x00fa), top: B:67:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.inputmethod.k9c
    public Object b(Function2<? super qne<T>, ? super q22<? super Unit>, ? extends Object> function2, q22<? super Unit> q22Var) throws Throwable {
        FileStorageConnection$writeScope$1 fileStorageConnection$writeScope$1;
        FileStorageConnection$writeScope$1 fileStorageConnection$writeScope$2;
        File file;
        FileWriteScope fileWriteScope;
        Throwable th;
        ig1 ig1Var;
        FileStorageConnection$writeScope$1 fileStorageConnection$writeScope$3;
        File file2;
        if (q22Var instanceof FileStorageConnection$writeScope$1) {
            fileStorageConnection$writeScope$1 = (FileStorageConnection$writeScope$1) q22Var;
            int i = fileStorageConnection$writeScope$1.label;
            if ((i & t04.INVALID_ID) != 0) {
                fileStorageConnection$writeScope$1.label = i - t04.INVALID_ID;
            } else {
                fileStorageConnection$writeScope$1 = new FileStorageConnection$writeScope$1(this, q22Var);
            }
        } else {
            fileStorageConnection$writeScope$1 = new FileStorageConnection$writeScope$1(this, q22Var);
        }
        Object obj = fileStorageConnection$writeScope$1.result;
        Object objG = a.g();
        int i2 = fileStorageConnection$writeScope$1.label;
        try {
            try {
                try {
                    try {
                        try {
                            if (i2 == 0) {
                                f.b(obj);
                                f();
                                g(this.file);
                                fileStorageConnection$writeScope$2 = this.transactionMutex;
                                fileStorageConnection$writeScope$1.L$0 = function2;
                                fileStorageConnection$writeScope$1.L$1 = fileStorageConnection$writeScope$2;
                                fileStorageConnection$writeScope$1.label = 1;
                                if (fileStorageConnection$writeScope$2.g((Object) null, fileStorageConnection$writeScope$1) != objG) {
                                }
                                return objG;
                            }
                            if (i2 != 1) {
                                if (i2 != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ig1Var = (ig1) fileStorageConnection$writeScope$1.L$2;
                                File file3 = (File) fileStorageConnection$writeScope$1.L$1;
                                fileStorageConnection$writeScope$3 = (x58) fileStorageConnection$writeScope$1.L$0;
                                try {
                                    f.b(obj);
                                    file2 = file3;
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
                                    if (file2.exists() && !g84.a(file2, this.file)) {
                                        throw new IOException("Unable to rename " + file2 + " to " + this.file + ". This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
                                    }
                                    Unit unit2 = Unit.a;
                                    fileStorageConnection$writeScope$3.h((Object) null);
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
                            FileStorageConnection$writeScope$1 fileStorageConnection$writeScope$4 = (x58) fileStorageConnection$writeScope$1.L$1;
                            Function2<? super qne<T>, ? super q22<? super Unit>, ? extends Object> function3 = (Function2) fileStorageConnection$writeScope$1.L$0;
                            f.b(obj);
                            fileStorageConnection$writeScope$2 = fileStorageConnection$writeScope$4;
                            function2 = function3;
                            fileStorageConnection$writeScope$1.L$0 = fileStorageConnection$writeScope$2;
                            fileStorageConnection$writeScope$1.L$1 = file;
                            fileStorageConnection$writeScope$1.L$2 = fileWriteScope;
                            fileStorageConnection$writeScope$1.label = 2;
                            if (function2.invoke(fileWriteScope, fileStorageConnection$writeScope$1) != objG) {
                                fileStorageConnection$writeScope$3 = fileStorageConnection$writeScope$2;
                                file2 = file;
                                ig1Var = fileWriteScope;
                                Unit unit3 = Unit.a;
                                ig1Var.close();
                                th = null;
                                if (th == null) {
                                    throw th;
                                }
                                if (file2.exists()) {
                                    throw new IOException("Unable to rename " + file2 + " to " + this.file + ". This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
                                }
                                Unit unit4 = Unit.a;
                                fileStorageConnection$writeScope$3.h((Object) null);
                                return Unit.a;
                            }
                            return objG;
                        } catch (Throwable th5) {
                            th = th5;
                            ig1Var = fileWriteScope;
                            ig1Var.close();
                            throw th;
                        }
                        fileWriteScope = new FileWriteScope(file, this.serializer);
                    } catch (IOException e) {
                        e = e;
                        if (file.exists()) {
                            file.delete();
                        }
                        throw e;
                    }
                    file = new File(this.file.getAbsolutePath() + ".tmp");
                } catch (Throwable th6) {
                    th = th6;
                    fileStorageConnection$writeScope$2.h((Object) null);
                    throw th;
                }
            } catch (Throwable th7) {
                th = th7;
                fileStorageConnection$writeScope$2 = fileStorageConnection$writeScope$1;
                fileStorageConnection$writeScope$2.h((Object) null);
                throw th;
            }
        } catch (IOException e2) {
            e = e2;
            fileStorageConnection$writeScope$2 = fileStorageConnection$writeScope$1;
            file = objG;
        }
    }

    @Override // com.google.inputmethod.ig1
    public void close() {
        this.closed.set(true);
        this.onClose.invoke();
    }

    /* JADX WARN: Code duplicated, block: B:28:0x006c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x006e  */
    /* JADX WARN: Code duplicated, block: B:31:0x0074 A[Catch: all -> 0x0075, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x0075, blocks: (B:31:0x0074, B:40:0x0084, B:39:0x0081, B:36:0x007c), top: B:52:0x0022, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x008b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [com.google.android.ps4, com.google.android.ps4<? super com.google.android.x8a<T>, ? super java.lang.Boolean, ? super com.google.android.q22<? super R>, ? extends java.lang.Object>] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v9 */
    @Override // com.google.inputmethod.k9c
    public <R> Object e(ps4<? super x8a<T>, ? super Boolean, ? super q22<? super R>, ? extends Object> ps4Var, q22<? super R> q22Var) throws Throwable {
        FileStorageConnection$readScope$1 fileStorageConnection$readScope$1;
        Throwable th;
        ig1 ig1Var;
        ?? r9;
        if (q22Var instanceof FileStorageConnection$readScope$1) {
            fileStorageConnection$readScope$1 = (FileStorageConnection$readScope$1) q22Var;
            int i = fileStorageConnection$readScope$1.label;
            if ((i & t04.INVALID_ID) != 0) {
                fileStorageConnection$readScope$1.label = i - t04.INVALID_ID;
            } else {
                fileStorageConnection$readScope$1 = new FileStorageConnection$readScope$1(this, q22Var);
            }
        } else {
            fileStorageConnection$readScope$1 = new FileStorageConnection$readScope$1(this, q22Var);
        }
        Object obj = fileStorageConnection$readScope$1.result;
        Object objG = a.g();
        int i2 = fileStorageConnection$readScope$1.label;
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ps4Var = (ps4<? super x8a<T>, ? super Boolean, ? super q22<? super R>, ? extends Object>) fileStorageConnection$readScope$1.Z$0;
                ig1Var = (ig1) fileStorageConnection$readScope$1.L$0;
                try {
                    f.b(obj);
                    r9 = ps4Var;
                    try {
                        ig1Var.close();
                        th = null;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    if (th == null) {
                        throw th;
                    }
                    if (r9 != 0) {
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
                FileReadScope fileReadScope = new FileReadScope(this.file, this.serializer);
                try {
                    Boolean boolA = ut0.a(zB);
                    fileStorageConnection$readScope$1.L$0 = fileReadScope;
                    fileStorageConnection$readScope$1.Z$0 = zB;
                    fileStorageConnection$readScope$1.label = 1;
                    Object objInvoke = ps4Var.invoke(fileReadScope, boolA, fileStorageConnection$readScope$1);
                    if (objInvoke == objG) {
                        return objG;
                    }
                    obj = objInvoke;
                    r9 = zB;
                    ig1Var = fileReadScope;
                    ig1Var.close();
                    th = null;
                    if (th == null) {
                        throw th;
                    }
                    if (r9 != 0) {
                        x58.a.c(this.transactionMutex, (Object) null, 1, (Object) null);
                    }
                    return obj;
                } catch (Throwable th5) {
                    th = th5;
                    ps4Var = zB;
                    ig1Var = fileReadScope;
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
