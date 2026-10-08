package com.google.inputmethod;

import androidx.compose.ui.b;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a)\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/b;", "", "enabled", "Lcom/google/android/r48;", "interactionSource", "a", "(Landroidx/compose/ui/b;ZLcom/google/android/r48;)Landroidx/compose/ui/b;", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class hl4 {
    public static final b a(b bVar, boolean z, r48 r48Var) {
        return bVar.then(z ? new gl4(r48Var) : b.INSTANCE);
    }

    public static /* synthetic */ b b(b bVar, boolean z, r48 r48Var, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            r48Var = null;
        }
        return a(bVar, z, r48Var);
    }
}
