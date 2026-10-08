package com.google.inputmethod;

import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import androidx.compose.ui.text.TextStyle;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a-\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/google/android/ei1;", "contentColor", "Landroidx/compose/ui/text/y;", "textStyle", "Lkotlin/Function0;", "", "content", "b", "(JLandroidx/compose/ui/text/y;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/d;I)V", "material3"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ns9 {
    public static final void b(final long j, final TextStyle textStyle, final Function2<? super d, ? super Integer, Unit> function2, d dVar, final int i) {
        int i2;
        d dVarF = dVar.F(-684938728);
        if ((i & 6) == 0) {
            i2 = (dVarF.D(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= dVarF.x(textStyle) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= dVarF.T(function2) ? 256 : 128;
        }
        if (dVarF.g((i2 & 147) != 146, i2 & 1)) {
            if (e.k()) {
                e.o(-684938728, i2, -1, "androidx.compose.material3.internal.ProvideContentColorTextStyle (ProvideContentColorTextStyle.kt:38)");
            }
            fs1.d(new os9[]{cz1.a().d(ei1.l(j)), qxc.q().d(((TextStyle) dVarF.v(qxc.q())).J(textStyle))}, function2, dVarF, ((i2 >> 3) & 112) | os9.i);
            if (e.k()) {
                e.n();
            }
        } else {
            dVarF.q();
        }
        s6b s6bVarH = dVarF.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2() { // from class: com.google.android.ms9
                public final Object invoke(Object obj, Object obj2) {
                    return ns9.c(j, textStyle, function2, i, (d) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(long j, TextStyle textStyle, Function2 function2, int i, d dVar, int i2) {
        b(j, textStyle, function2, dVar, saa.a(i | 1));
        return Unit.a;
    }
}
