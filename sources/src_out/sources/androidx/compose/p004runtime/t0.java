package androidx.compose.p004runtime;

import com.google.inputmethod.axb;
import com.google.inputmethod.bxb;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a1\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"T", "value", "Lcom/google/android/bxb;", "policy", "Lcom/google/android/axb;", "a", "(Ljava/lang/Object;Lcom/google/android/bxb;)Lcom/google/android/axb;", "runtime"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class t0 {
    public static final <T> axb<T> a(T t, bxb<T> bxbVar) {
        return new ParcelableSnapshotMutableState(t, bxbVar);
    }
}
