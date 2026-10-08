package com.google.inputmethod;

import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import com.google.android.ps4;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public final class zo1 {
    public static final zo1 a = new zo1();
    private static ps4<Function2<? super d, ? super Integer, Unit>, d, Integer, Unit> b = ko1.c(559628295, false, new ps4() { // from class: com.google.android.yo1
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return zo1.c((Function2) obj, (d) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(Function2 function2, d dVar, int i) {
        if ((i & 6) == 0) {
            i |= dVar.T(function2) ? 4 : 2;
        }
        if (dVar.g((i & 19) != 18, i & 1)) {
            if (e.k()) {
                e.o(559628295, i, -1, "androidx.compose.foundation.text.ComposableSingletons$CoreTextFieldKt.lambda$559628295.<anonymous> (CoreTextField.kt:206)");
            }
            function2.invoke(dVar, Integer.valueOf(i & 14));
            if (e.k()) {
                e.n();
            }
        } else {
            dVar.q();
        }
        return Unit.a;
    }

    public final ps4<Function2<? super d, ? super Integer, Unit>, d, Integer, Unit> b() {
        return b;
    }
}
