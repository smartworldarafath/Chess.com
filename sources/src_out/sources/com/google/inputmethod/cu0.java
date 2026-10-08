package com.google.inputmethod;

import com.google.android.q22;
import kotlin.Metadata;
import kotlin.Unit;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001J\u001c\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0001\u0001\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lcom/google/android/cu0;", "", "Lcom/google/android/gba;", "rect", "", "a", "(Lcom/google/android/gba;Lcom/google/android/q22;)Ljava/lang/Object;", "Landroidx/compose/foundation/relocation/BringIntoViewRequesterImpl;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface cu0 {
    static /* synthetic */ Object b(cu0 cu0Var, gba gbaVar, q22 q22Var, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: bringIntoView");
        }
        if ((i & 1) != 0) {
            gbaVar = null;
        }
        return cu0Var.a(gbaVar, q22Var);
    }

    Object a(gba gbaVar, q22<? super Unit> q22Var);
}
