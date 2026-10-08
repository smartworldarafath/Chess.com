package androidx.datastore.p007core.okio;

import com.google.android.b39;
import com.google.android.kp8;
import com.google.android.ox3;
import com.google.android.q22;
import com.google.android.t84;
import com.google.android.v74;
import com.google.inputmethod.lp8;
import com.google.inputmethod.qne;
import com.google.inputmethod.t04;
import com.google.inputmethod.va3;
import java.io.Closeable;
import java.io.FileNotFoundException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.a;
import kotlin.f;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B%\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Landroidx/datastore/core/okio/OkioWriteScope;", "T", "Landroidx/datastore/core/okio/OkioReadScope;", "Lcom/google/android/qne;", "Lcom/google/android/t84;", "fileSystem", "Lcom/google/android/b39;", "path", "Lcom/google/android/lp8;", "serializer", "<init>", "(Lcom/google/android/t84;Lcom/google/android/b39;Lcom/google/android/lp8;)V", "value", "", "c", "(Ljava/lang/Object;Lcom/google/android/q22;)Ljava/lang/Object;", "datastore-core-okio"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class OkioWriteScope<T> extends OkioReadScope<T> implements qne<T> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OkioWriteScope(t84 t84Var, b39 b39Var, lp8<T> lp8Var) {
        super(t84Var, b39Var, lp8Var);
        Intrinsics.checkNotNullParameter(t84Var, "fileSystem");
        Intrinsics.checkNotNullParameter(b39Var, "path");
        Intrinsics.checkNotNullParameter(lp8Var, "serializer");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:83:0x00a7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x0088 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.inputmethod.qne
    public Object c(T t, q22<? super Unit> q22Var) throws Exception {
        OkioWriteScope$writeData$1 okioWriteScope$writeData$1;
        Closeable closeableG;
        Closeable closeable;
        Throwable th;
        Closeable closeable2;
        Closeable closeable3;
        Throwable th2;
        if (q22Var instanceof OkioWriteScope$writeData$1) {
            okioWriteScope$writeData$1 = (OkioWriteScope$writeData$1) q22Var;
            int i = okioWriteScope$writeData$1.label;
            if ((i & t04.INVALID_ID) != 0) {
                okioWriteScope$writeData$1.label = i - t04.INVALID_ID;
            } else {
                okioWriteScope$writeData$1 = new OkioWriteScope$writeData$1(this, q22Var);
            }
        } else {
            okioWriteScope$writeData$1 = new OkioWriteScope$writeData$1(this, q22Var);
        }
        Object obj = okioWriteScope$writeData$1.result;
        Object objG = a.g();
        int i2 = okioWriteScope$writeData$1.label;
        Throwable th3 = null;
        try {
            if (i2 == 0) {
                f.b(obj);
                f();
                closeableG = getFileSystem().G(getPath());
                try {
                    Closeable closeableC = kp8.c(v74.N(closeableG, 0L, 1, (Object) null));
                    try {
                        lp8<T> lp8VarI = i();
                        okioWriteScope$writeData$1.L$0 = closeableG;
                        okioWriteScope$writeData$1.L$1 = closeableG;
                        okioWriteScope$writeData$1.L$2 = closeableC;
                        okioWriteScope$writeData$1.label = 1;
                        if (lp8VarI.b(t, closeableC, okioWriteScope$writeData$1) == objG) {
                            return objG;
                        }
                        closeable = closeableG;
                        closeable3 = closeable;
                        closeable2 = closeableC;
                    } catch (Throwable th4) {
                        closeable = closeableG;
                        th = th4;
                        closeable2 = closeableC;
                        if (closeable2 != null) {
                            closeable2.close();
                        }
                        th2 = th;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    if (closeableG != null) {
                        closeableG.close();
                    }
                    th3 = th;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                closeable2 = (Closeable) okioWriteScope$writeData$1.L$2;
                closeable3 = (v74) okioWriteScope$writeData$1.L$1;
                closeable = (Closeable) okioWriteScope$writeData$1.L$0;
                try {
                    f.b(obj);
                } catch (Throwable th6) {
                    th = th6;
                    if (closeable2 != null) {
                        try {
                            closeable2.close();
                        } catch (Throwable th7) {
                            try {
                                ox3.a(th, th7);
                            } catch (Throwable th8) {
                                th = th8;
                                closeableG = closeable;
                                if (closeableG != null) {
                                    try {
                                        closeableG.close();
                                    } catch (Throwable th9) {
                                        ox3.a(th, th9);
                                    }
                                }
                                th3 = th;
                            }
                        }
                    }
                    th2 = th;
                }
            }
            closeable3.flush();
            Unit unit = Unit.a;
            if (closeable2 != null) {
                try {
                    closeable2.close();
                } catch (Throwable th10) {
                    th2 = th10;
                }
            }
            th2 = null;
            Closeable closeable4 = closeable;
            if (th2 != null) {
                throw th2;
            }
            Unit unit2 = Unit.a;
            if (closeable4 != null) {
                try {
                    closeable4.close();
                } catch (Throwable th11) {
                    th3 = th11;
                }
            }
            if (th3 == null) {
                return Unit.a;
            }
            throw th3;
        } catch (Exception e) {
            if (e instanceof FileNotFoundException) {
                throw va3.c(String.valueOf(getPath().j()), e);
            }
            throw e;
        }
    }
}
