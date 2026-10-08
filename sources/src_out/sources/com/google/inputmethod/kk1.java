package com.google.inputmethod;

import androidx.compose.p001foundation.text.TextContextMenuItems;
import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
public final class kk1 implements Function2<d, Integer, String> {
    final /* synthetic */ TextContextMenuItems a;

    public kk1(TextContextMenuItems textContextMenuItems) {
        this.a = textContextMenuItems;
    }

    public final String a(d dVar, int i) {
        dVar.y(-35972707);
        if (e.k()) {
            e.o(-35972707, i, -1, "androidx.compose.foundation.text.TextItem.<anonymous> (CommonContextMenuArea.kt:190)");
        }
        String strG = this.a.g(dVar, 0);
        if (e.k()) {
            e.n();
        }
        dVar.u();
        return strG;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return a((d) obj, ((Number) obj2).intValue());
    }
}
