package com.google.inputmethod;

import androidx.collection.ScatterSet;
import androidx.compose.p004runtime.collection.ScatterSetWrapper;
import java.util.Set;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\b\u0003\u001a%\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"T", "Landroidx/collection/ScatterSet;", "", "a", "(Landroidx/collection/ScatterSet;)Ljava/util/Set;", "runtime"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class m4b {
    public static final <T> Set<T> a(ScatterSet<T> scatterSet) {
        return new ScatterSetWrapper(scatterSet);
    }
}
