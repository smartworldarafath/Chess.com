package androidx.datastore.p007core;

import com.google.android.q22;
import com.google.inputmethod.mhb;
import com.google.inputmethod.x8a;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0004¢\u0006\u0004\b\u000e\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00038\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Landroidx/datastore/core/FileReadScope;", "T", "Lcom/google/android/x8a;", "Ljava/io/File;", "file", "Lcom/google/android/mhb;", "serializer", "<init>", "(Ljava/io/File;Lcom/google/android/mhb;)V", "d", "(Lcom/google/android/q22;)Ljava/lang/Object;", "", "close", "()V", "f", "a", "Ljava/io/File;", "g", "()Ljava/io/File;", "b", "Lcom/google/android/mhb;", "h", "()Lcom/google/android/mhb;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "c", "Ljava/util/concurrent/atomic/AtomicBoolean;", "closed", "datastore-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class FileReadScope<T> implements x8a<T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final File file;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final mhb<T> serializer;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final AtomicBoolean closed;

    public FileReadScope(File file, mhb<T> mhbVar) {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(mhbVar, "serializer");
        this.file = file;
        this.serializer = mhbVar;
        this.closed = new AtomicBoolean(false);
    }

    static /* synthetic */ <T> Object i(FileReadScope<T> fileReadScope, q22<? super T> q22Var) {
        fileReadScope.f();
        return FileStorageKt.b(((FileReadScope) fileReadScope).file, new FileReadScope$readData$2(fileReadScope, null), q22Var);
    }

    @Override // com.google.inputmethod.ig1
    public void close() {
        this.closed.set(true);
    }

    @Override // com.google.inputmethod.x8a
    public Object d(q22<? super T> q22Var) {
        return i(this, q22Var);
    }

    protected final void f() {
        if (this.closed.get()) {
            throw new IllegalStateException("This scope has already been closed.");
        }
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    protected final File getFile() {
        return this.file;
    }

    protected final mhb<T> h() {
        return this.serializer;
    }
}
