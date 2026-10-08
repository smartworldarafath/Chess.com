package com.google.inputmethod;

import androidx.compose.p001foundation.layout.s;
import androidx.compose.ui.layout.o;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003\"\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u00058@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\"\u001a\u0010\u000b\u001a\u00020\b*\u0004\u0018\u00010\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n\"\u001a\u0010\u000f\u001a\u00020\f*\u0004\u0018\u00010\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e\"\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0010*\u0004\u0018\u00010\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012\"\u001a\u0010\u0015\u001a\u00020\f*\u0004\u0018\u00010\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u000e¨\u0006\u0016"}, d2 = {"Lcom/google/android/f66;", "Lcom/google/android/fra;", "d", "(Lcom/google/android/f66;)Lcom/google/android/fra;", "rowColumnParentData", "Landroidx/compose/ui/layout/o;", "c", "(Landroidx/compose/ui/layout/o;)Lcom/google/android/fra;", "", "e", "(Lcom/google/android/fra;)F", "weight", "", "b", "(Lcom/google/android/fra;)Z", "fill", "Landroidx/compose/foundation/layout/s;", "a", "(Lcom/google/android/fra;)Landroidx/compose/foundation/layout/s;", "crossAxisAlignment", "f", "isRelative", "foundation-layout"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class cra {
    public static final s a(RowColumnParentData rowColumnParentData) {
        if (rowColumnParentData != null) {
            return rowColumnParentData.getCrossAxisAlignment();
        }
        return null;
    }

    public static final boolean b(RowColumnParentData rowColumnParentData) {
        if (rowColumnParentData != null) {
            return rowColumnParentData.getFill();
        }
        return true;
    }

    public static final RowColumnParentData c(o oVar) {
        Object objF = oVar.f();
        if (objF instanceof RowColumnParentData) {
            return (RowColumnParentData) objF;
        }
        return null;
    }

    public static final RowColumnParentData d(f66 f66Var) {
        Object objF = f66Var.f();
        if (objF instanceof RowColumnParentData) {
            return (RowColumnParentData) objF;
        }
        return null;
    }

    public static final float e(RowColumnParentData rowColumnParentData) {
        if (rowColumnParentData != null) {
            return rowColumnParentData.getWeight();
        }
        return 0.0f;
    }

    public static final boolean f(RowColumnParentData rowColumnParentData) {
        s sVarA = a(rowColumnParentData);
        if (sVarA != null) {
            return sVarA.c();
        }
        return false;
    }
}
