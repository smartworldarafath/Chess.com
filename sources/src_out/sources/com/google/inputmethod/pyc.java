package com.google.inputmethod;

import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.font.l;
import androidx.compose.ui.text.v;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\"\u0014\u0010\u0006\u001a\u00020\u00008\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0003\u0010\u0005¨\u0006\u0007"}, d2 = {"", "cacheSize", "Landroidx/compose/ui/text/v;", "a", "(ILandroidx/compose/runtime/d;II)Landroidx/compose/ui/text/v;", "I", "DefaultCacheSize", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class pyc {
    private static final int a = 8;

    public static final v a(int i, d dVar, int i2, int i3) {
        boolean z = true;
        if ((i3 & 1) != 0) {
            i = a;
        }
        if (e.k()) {
            e.o(1538166871, i2, -1, "androidx.compose.ui.text.rememberTextMeasurer (TextMeasurerHelper.kt:41)");
        }
        l.b bVar = (l.b) dVar.v(CompositionLocalsKt.i());
        f43 f43Var = (f43) dVar.v(CompositionLocalsKt.g());
        LayoutDirection layoutDirection = (LayoutDirection) dVar.v(CompositionLocalsKt.m());
        boolean zX = dVar.x(bVar) | dVar.x(f43Var) | dVar.C(layoutDirection.ordinal());
        if ((((i2 & 14) ^ 6) <= 4 || !dVar.C(i)) && (i2 & 6) != 4) {
            z = false;
        }
        boolean z2 = zX | z;
        Object objR = dVar.R();
        if (z2 || objR == d.INSTANCE.a()) {
            objR = new v(bVar, f43Var, layoutDirection, i);
            dVar.L(objR);
        }
        v vVar = (v) objR;
        if (e.k()) {
            e.n();
        }
        return vVar;
    }
}
