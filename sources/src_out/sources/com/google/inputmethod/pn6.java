package com.google.inputmethod;

import androidx.compose.ui.b;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\"\u0017\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/ui/b;", "", "layoutId", "b", "(Landroidx/compose/ui/b;Ljava/lang/Object;)Landroidx/compose/ui/b;", "Lcom/google/android/dj7;", "a", "(Lcom/google/android/dj7;)Ljava/lang/Object;", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class pn6 {
    public static final Object a(dj7 dj7Var) {
        Object objF = dj7Var.f();
        rn6 rn6Var = objF instanceof rn6 ? (rn6) objF : null;
        if (rn6Var != null) {
            return rn6Var.getLayoutId();
        }
        return null;
    }

    public static final b b(b bVar, Object obj) {
        return bVar.then(new LayoutIdElement(obj));
    }
}
