package com.google.inputmethod;

import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a'\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006*\f\b\u0000\u0010\b\"\u00020\u00072\u00020\u0007¨\u0006\t"}, d2 = {"", "enabled", "Lkotlin/Function0;", "", "onBack", "b", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/d;II)V", "Lcom/google/android/tc0;", "BackEventCompat", "material3"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class gd0 {
    public static final void b(final boolean z, final Function0<Unit> function0, d dVar, final int i, final int i2) {
        int i3;
        d dVarF = dVar.F(-1339183247);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (dVarF.A(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= dVarF.T(function0) ? 32 : 16;
        }
        if (dVarF.g((i3 & 19) != 18, i3 & 1)) {
            if (i4 != 0) {
                z = true;
            }
            if (e.k()) {
                e.o(-1339183247, i3, -1, "androidx.compose.material3.internal.BackHandler (BackHandler.android.kt:24)");
            }
            dd0.g(z, function0, dVarF, i3 & 126, 0);
            if (e.k()) {
                e.n();
            }
        } else {
            dVarF.q();
        }
        s6b s6bVarH = dVarF.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2() { // from class: com.google.android.fd0
                public final Object invoke(Object obj, Object obj2) {
                    return gd0.c(z, function0, i, i2, (d) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(boolean z, Function0 function0, int i, int i2, d dVar, int i3) {
        b(z, function0, dVar, saa.a(i | 1), i2);
        return Unit.a;
    }
}
