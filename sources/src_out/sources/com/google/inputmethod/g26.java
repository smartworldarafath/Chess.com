package com.google.inputmethod;

import androidx.datastore.p007core.SingleProcessCoordinator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"", "filePath", "Lcom/google/android/f26;", "a", "(Ljava/lang/String;)Lcom/google/android/f26;", "datastore-core"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class g26 {
    public static final f26 a(String str) {
        Intrinsics.checkNotNullParameter(str, "filePath");
        return new SingleProcessCoordinator(str);
    }
}
