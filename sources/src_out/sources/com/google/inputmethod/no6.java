package com.google.inputmethod;

import androidx.compose.ui.layout.o;
import kotlin.Metadata;
import kotlin.ranges.g;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u001b\u0010\u0002\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\"\u001a\u0010\b\u001a\u0004\u0018\u00010\u0005*\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\"\u001a\u0010\f\u001a\u00020\u0000*\u0004\u0018\u00010\t8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\"\u001a\u0010\u000e\u001a\u00020\u0000*\u0004\u0018\u00010\t8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000b¨\u0006\u000f"}, d2 = {"", "other", "d", "(II)I", "Lcom/google/android/f66;", "", "b", "(Lcom/google/android/f66;)Ljava/lang/Object;", "layoutId", "Landroidx/compose/ui/layout/o;", "c", "(Landroidx/compose/ui/layout/o;)I", "widthOrZero", "a", "heightOrZero", "material3"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class no6 {
    public static final int a(o oVar) {
        if (oVar != null) {
            return oVar.getHeight();
        }
        return 0;
    }

    public static final Object b(f66 f66Var) {
        Object objF = f66Var.f();
        rn6 rn6Var = objF instanceof rn6 ? (rn6) objF : null;
        if (rn6Var != null) {
            return rn6Var.getLayoutId();
        }
        return null;
    }

    public static final int c(o oVar) {
        if (oVar != null) {
            return oVar.getWidth();
        }
        return 0;
    }

    public static final int d(int i, int i2) {
        return i == Integer.MAX_VALUE ? i : g.e(i - i2, 0);
    }
}
