package com.google.inputmethod;

import androidx.compose.ui.b;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/google/android/x23;", "Landroidx/compose/ui/b$c;", "b", "(Lcom/google/android/x23;)Landroidx/compose/ui/b$c;", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class eo6 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final b.c b(x23 x23Var) {
        int iA = ni8.a(4);
        int iA2 = ni8.a(2);
        b.c child = x23Var.getNode().getChild();
        if (child == null || (child.getAggregateChildKindSet() & iA) == 0) {
            return null;
        }
        while (child != null && (child.getKindSet() & iA2) == 0) {
            if ((child.getKindSet() & iA) != 0) {
                return child;
            }
            child = child.getChild();
        }
        return null;
    }
}
