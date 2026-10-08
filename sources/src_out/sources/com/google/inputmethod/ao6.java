package com.google.inputmethod;

import androidx.compose.ui.node.LookaheadCapablePlaceable;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/node/LookaheadCapablePlaceable;", "Lcom/google/android/uc;", "alignmentLine", "", "b", "(Landroidx/compose/ui/node/LookaheadCapablePlaceable;Lcom/google/android/uc;)I", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class ao6 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final int b(LookaheadCapablePlaceable lookaheadCapablePlaceable, uc ucVar) {
        LookaheadCapablePlaceable lookaheadCapablePlaceableX1 = lookaheadCapablePlaceable.x1();
        if (!(lookaheadCapablePlaceableX1 != null)) {
            zw5.c("Child of " + lookaheadCapablePlaceable + " cannot be null when calculating alignment line");
        }
        if (lookaheadCapablePlaceable.z1().j().containsKey(ucVar)) {
            Integer num = lookaheadCapablePlaceable.z1().j().get(ucVar);
            return num != null ? num.intValue() : t04.INVALID_ID;
        }
        int iJ = lookaheadCapablePlaceableX1.J(ucVar);
        if (iJ == Integer.MIN_VALUE) {
            return t04.INVALID_ID;
        }
        lookaheadCapablePlaceableX1.i2(true);
        lookaheadCapablePlaceable.g2(true);
        lookaheadCapablePlaceable.d2();
        lookaheadCapablePlaceableX1.i2(false);
        lookaheadCapablePlaceable.g2(false);
        return iJ + (ucVar instanceof mf5 ? g16.l(lookaheadCapablePlaceableX1.getPosition()) : g16.k(lookaheadCapablePlaceableX1.getPosition()));
    }
}
