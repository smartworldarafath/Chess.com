package androidx.compose.p001foundation.interaction;

import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import androidx.compose.p004runtime.s0;
import com.google.inputmethod.j26;
import com.google.inputmethod.o58;
import com.google.inputmethod.q6c;
import com.google.inputmethod.vn3;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/google/android/j26;", "Lcom/google/android/q6c;", "", "a", "(Lcom/google/android/j26;Landroidx/compose/runtime/d;I)Lcom/google/android/q6c;", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class FocusInteractionKt {
    public static final q6c<Boolean> a(j26 j26Var, d dVar, int i) {
        if (e.k()) {
            e.o(-1805515472, i, -1, "androidx.compose.foundation.interaction.collectIsFocusedAsState (FocusInteraction.kt:63)");
        }
        Object objR = dVar.R();
        d.Companion companion = d.INSTANCE;
        if (objR == companion.a()) {
            objR = s0.e(Boolean.FALSE, null, 2, null);
            dVar.L(objR);
        }
        o58 o58Var = (o58) objR;
        int i2 = i & 14;
        boolean z = ((i2 ^ 6) > 4 && dVar.x(j26Var)) || (i & 6) == 4;
        Object objR2 = dVar.R();
        if (z || objR2 == companion.a()) {
            objR2 = new FocusInteractionKt$collectIsFocusedAsState$1$1(j26Var, o58Var, null);
            dVar.L(objR2);
        }
        vn3.g(j26Var, (Function2) objR2, dVar, i2);
        if (e.k()) {
            e.n();
        }
        return o58Var;
    }
}
