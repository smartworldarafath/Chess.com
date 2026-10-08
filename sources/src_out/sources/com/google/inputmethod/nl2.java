package com.google.inputmethod;

import android.content.res.Configuration;
import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"", "a", "(Landroidx/compose/runtime/d;I)Z", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class nl2 {
    public static final boolean a(d dVar, int i) {
        if (e.k()) {
            e.o(-882615028, i, -1, "androidx.compose.foundation._isSystemInDarkTheme (DarkTheme.android.kt:45)");
        }
        boolean z = (((Configuration) dVar.v(AndroidCompositionLocals_androidKt.b())).uiMode & 48) == 32;
        if (e.k()) {
            e.n();
        }
        return z;
    }
}
