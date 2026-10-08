package androidx.datastore.p007core;

import com.google.android.q22;
import com.google.inputmethod.t04;
import com.google.inputmethod.u74;
import java.io.File;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.a;
import kotlin.f;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a<\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u001c\u0010\u0006\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003H\u0082@¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"T", "Ljava/io/File;", "file", "Lkotlin/Function1;", "Lcom/google/android/q22;", "", "block", "b", "(Ljava/io/File;Lkotlin/jvm/functions/Function1;Lcom/google/android/q22;)Ljava/lang/Object;", "datastore-core"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class FileStorageKt {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final <T> Object b(File file, Function1<? super q22<? super T>, ? extends Object> function1, q22<? super T> q22Var) throws IOException {
        FileStorageKt$runFileDiagnosticsIfNotCorruption$1 fileStorageKt$runFileDiagnosticsIfNotCorruption$1;
        if (q22Var instanceof FileStorageKt$runFileDiagnosticsIfNotCorruption$1) {
            fileStorageKt$runFileDiagnosticsIfNotCorruption$1 = (FileStorageKt$runFileDiagnosticsIfNotCorruption$1) q22Var;
            int i = fileStorageKt$runFileDiagnosticsIfNotCorruption$1.label;
            if ((i & t04.INVALID_ID) != 0) {
                fileStorageKt$runFileDiagnosticsIfNotCorruption$1.label = i - t04.INVALID_ID;
            } else {
                fileStorageKt$runFileDiagnosticsIfNotCorruption$1 = new FileStorageKt$runFileDiagnosticsIfNotCorruption$1(q22Var);
            }
        } else {
            fileStorageKt$runFileDiagnosticsIfNotCorruption$1 = new FileStorageKt$runFileDiagnosticsIfNotCorruption$1(q22Var);
        }
        Object obj = fileStorageKt$runFileDiagnosticsIfNotCorruption$1.result;
        Object objG = a.g();
        int i2 = fileStorageKt$runFileDiagnosticsIfNotCorruption$1.label;
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                f.b(obj);
                return obj;
            }
            f.b(obj);
            fileStorageKt$runFileDiagnosticsIfNotCorruption$1.L$0 = file;
            fileStorageKt$runFileDiagnosticsIfNotCorruption$1.label = 1;
            Object objInvoke = function1.invoke(fileStorageKt$runFileDiagnosticsIfNotCorruption$1);
            return objInvoke == objG ? objG : objInvoke;
        } catch (IOException e) {
            if (e instanceof CorruptionException) {
                throw e;
            }
            throw u74.a.a(file, e);
        }
    }
}
