package com.google.inputmethod;

import androidx.compose.p001foundation.BackgroundKt;
import androidx.compose.p001foundation.layout.SizeKt;
import androidx.compose.p001foundation.layout.j;
import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import androidx.compose.ui.b;
import com.google.android.ps4;
import com.google.android.zs4;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public final class xo1 {
    public static final xo1 a = new xo1();
    private static zs4<b, String, Boolean, ContextMenuColors, ps4<? super ei1, ? super d, ? super Integer, Unit>, Function0<Unit>, d, Integer, Unit> b = ko1.c(-1571120048, false, new zs4() { // from class: com.google.android.vo1
        public final Object q(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
            return xo1.f((b) obj, (String) obj2, ((Boolean) obj3).booleanValue(), (ContextMenuColors) obj4, (ps4) obj5, (Function0) obj6, (d) obj7, ((Integer) obj8).intValue());
        }
    });
    private static ps4<ContextMenuColors, d, Integer, Unit> c = ko1.c(-1455401925, false, new ps4() { // from class: com.google.android.wo1
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return xo1.e((ContextMenuColors) obj, (d) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(ContextMenuColors contextMenuColors, d dVar, int i) {
        if ((i & 6) == 0) {
            i |= dVar.x(contextMenuColors) ? 4 : 2;
        }
        if (dVar.g((i & 19) != 18, i & 1)) {
            if (e.k()) {
                e.o(-1455401925, i, -1, "androidx.compose.foundation.contextmenu.ComposableSingletons$ContextMenuUiKt.lambda$-1455401925.<anonymous> (ContextMenuUi.kt:305)");
            }
            b.Companion companion = b.INSTANCE;
            o12 o12Var = o12.a;
            j.b(BackgroundKt.d(SizeKt.i(SizeKt.h(nx8.p(companion, 0.0f, o12Var.e(), 1, null), 0.0f, 1, null), o12Var.d()), contextMenuColors.getIconColor(), null, 2, null), dVar, 0);
            if (e.k()) {
                e.n();
            }
        } else {
            dVar.q();
        }
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(b bVar, String str, boolean z, ContextMenuColors contextMenuColors, ps4 ps4Var, Function0 function0, d dVar, int i) {
        int i2;
        if ((i & 6) == 0) {
            i2 = (dVar.x(bVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= dVar.x(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= dVar.A(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= dVar.x(contextMenuColors) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= dVar.T(ps4Var) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i2 |= dVar.T(function0) ? 131072 : 65536;
        }
        if (dVar.g((599187 & i2) != 599186, i2 & 1)) {
            if (e.k()) {
                e.o(-1571120048, i2, -1, "androidx.compose.foundation.contextmenu.ComposableSingletons$ContextMenuUiKt.lambda$-1571120048.<anonymous> (ContextMenuUi.kt:136)");
            }
            a22.n(str, z, contextMenuColors, bVar, ps4Var, function0, dVar, ((i2 >> 3) & 1022) | ((i2 << 9) & 7168) | (57344 & i2) | (i2 & 458752), 0);
            if (e.k()) {
                e.n();
            }
        } else {
            dVar.q();
        }
        return Unit.a;
    }

    public final ps4<ContextMenuColors, d, Integer, Unit> c() {
        return c;
    }

    public final zs4<b, String, Boolean, ContextMenuColors, ps4<? super ei1, ? super d, ? super Integer, Unit>, Function0<Unit>, d, Integer, Unit> d() {
        return b;
    }
}
