package androidx.datastore.p007core;

import com.google.android.lq2;
import com.google.android.q22;
import com.google.inputmethod.t04;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@lq2(c = "androidx.datastore.core.FileStorageKt", f = "FileStorage.kt", l = {224}, m = "runFileDiagnosticsIfNotCorruption", v = 1)
final class FileStorageKt$runFileDiagnosticsIfNotCorruption$1<T> extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    FileStorageKt$runFileDiagnosticsIfNotCorruption$1(q22<? super FileStorageKt$runFileDiagnosticsIfNotCorruption$1> q22Var) {
        super(q22Var);
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= t04.INVALID_ID;
        return FileStorageKt.b(null, null, this);
    }
}
