package com.google.inputmethod;

import androidx.compose.p001foundation.gestures.Orientation;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/google/android/cq6;", "", "a", "(Lcom/google/android/cq6;)I", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class dq6 {
    public static final int a(cq6 cq6Var) {
        boolean z = cq6Var.a() == Orientation.Vertical;
        List<pp6> listH = cq6Var.h();
        if (listH.isEmpty()) {
            return 0;
        }
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < listH.size()) {
            int iB = b(z, cq6Var, i);
            if (iB == -1) {
                i++;
            } else {
                int iMax = 0;
                while (i < listH.size() && b(z, cq6Var, i) == iB) {
                    iMax = Math.max(iMax, (int) (z ? listH.get(i).a() & 4294967295L : listH.get(i).a() >> 32));
                    i++;
                }
                i2 += iMax;
                i3++;
            }
        }
        return (i2 / i3) + cq6Var.f();
    }

    private static final int b(boolean z, cq6 cq6Var, int i) {
        return z ? cq6Var.h().get(i).k() : cq6Var.h().get(i).getColumn();
    }
}
