package com.google.inputmethod;

import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/google/android/nv6;", "", "a", "(Lcom/google/android/nv6;)I", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class ov6 {
    public static final int a(nv6 nv6Var) {
        List<gv6> listH = nv6Var.h();
        if (listH.isEmpty()) {
            return 0;
        }
        int size = listH.size();
        int size2 = 0;
        for (int i = 0; i < size; i++) {
            size2 += listH.get(i).getSize();
        }
        return (size2 / listH.size()) + nv6Var.f();
    }
}
