package androidx.compose.p001foundation.text.selection;

import androidx.compose.p001foundation.text.selection.h;
import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import com.google.inputmethod.fs1;
import com.google.inputmethod.os9;
import com.google.inputmethod.peb;
import com.google.inputmethod.s6b;
import com.google.inputmethod.saa;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001d\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007²\u0006\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u00058\n@\nX\u008a\u008e\u0002"}, d2 = {"Lkotlin/Function0;", "", "content", "b", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/d;I)V", "Landroidx/compose/foundation/text/selection/e;", "selection", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class h {
    public static final void b(final Function2<? super d, ? super Integer, Unit> function2, d dVar, final int i) {
        int i2;
        d dVarF = dVar.F(-1162635549);
        if ((i & 6) == 0) {
            i2 = (dVarF.T(function2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (dVarF.g((i2 & 3) != 2, i2 & 1)) {
            if (e.k()) {
                e.o(-1162635549, i2, -1, "androidx.compose.foundation.text.selection.DisableSelection (SelectionContainer.kt:73)");
            }
            fs1.c(peb.c().d(null), function2, dVarF, ((i2 << 3) & 112) | os9.i);
            if (e.k()) {
                e.n();
            }
        } else {
            dVarF.q();
        }
        s6b s6bVarH = dVarF.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2() { // from class: com.google.android.tdb
                public final Object invoke(Object obj, Object obj2) {
                    return h.c(function2, i, (d) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(Function2 function2, int i, d dVar, int i2) {
        b(function2, dVar, saa.a(i | 1));
        return Unit.a;
    }
}
