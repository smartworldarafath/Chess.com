package com.google.inputmethod;

import androidx.compose.ui.text.x;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001f\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/text/x;", "target", "deleted", "a", "(JJ)J", "ui-text"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class hn3 {
    public static final long a(long j, long j2) {
        int iJ;
        int iL = x.l(j);
        int iK = x.k(j);
        if (x.p(j2, j)) {
            if (x.d(j2, j)) {
                iL = x.l(j2);
                iK = iL;
            } else {
                if (x.d(j, j2)) {
                    iJ = x.j(j2);
                } else if (x.e(j2, iL)) {
                    iL = x.l(j2);
                    iJ = x.j(j2);
                } else {
                    iK = x.l(j2);
                }
                iK -= iJ;
            }
        } else if (iK > x.l(j2)) {
            iL -= x.j(j2);
            iJ = x.j(j2);
            iK -= iJ;
        }
        return zyc.b(iL, iK);
    }
}
