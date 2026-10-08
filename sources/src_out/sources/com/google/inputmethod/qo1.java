package com.google.inputmethod;

import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import com.google.android.ps4;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public final class qo1 {
    public static final qo1 a = new qo1();
    private static ps4<Function2<? super d, ? super Integer, Unit>, d, Integer, Unit> b = ko1.c(759698998, false, new ps4() { // from class: com.google.android.mo1
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return qo1.i((Function2) obj, (d) obj2, ((Integer) obj3).intValue());
        }
    });
    private static ps4<Function2<? super d, ? super Integer, Unit>, d, Integer, Unit> c = ko1.c(486633673, false, new ps4() { // from class: com.google.android.no1
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return qo1.h((Function2) obj, (d) obj2, ((Integer) obj3).intValue());
        }
    });
    private static ps4<Function2<? super d, ? super Integer, Unit>, d, Integer, Unit> d = ko1.c(444370233, false, new ps4() { // from class: com.google.android.oo1
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return qo1.g((Function2) obj, (d) obj2, ((Integer) obj3).intValue());
        }
    });
    private static ps4<Function2<? super d, ? super Integer, Unit>, d, Integer, Unit> e = ko1.c(-665310900, false, new ps4() { // from class: com.google.android.po1
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return qo1.j((Function2) obj, (d) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(Function2 function2, d dVar, int i) {
        if ((i & 6) == 0) {
            i |= dVar.T(function2) ? 4 : 2;
        }
        if (dVar.g((i & 19) != 18, i & 1)) {
            if (e.k()) {
                e.o(444370233, i, -1, "androidx.compose.foundation.text.ComposableSingletons$BasicTextFieldKt.lambda$444370233.<anonymous> (BasicTextField.kt:976)");
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(Function2 function2, d dVar, int i) {
        if ((i & 6) == 0) {
            i |= dVar.T(function2) ? 4 : 2;
        }
        if (dVar.g((i & 19) != 18, i & 1)) {
            if (e.k()) {
                e.o(486633673, i, -1, "androidx.compose.foundation.text.ComposableSingletons$BasicTextFieldKt.lambda$486633673.<anonymous> (BasicTextField.kt:932)");
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(Function2 function2, d dVar, int i) {
        if ((i & 6) == 0) {
            i |= dVar.T(function2) ? 4 : 2;
        }
        if (dVar.g((i & 19) != 18, i & 1)) {
            if (e.k()) {
                e.o(759698998, i, -1, "androidx.compose.foundation.text.ComposableSingletons$BasicTextFieldKt.lambda$759698998.<anonymous> (BasicTextField.kt:775)");
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(Function2 function2, d dVar, int i) {
        if ((i & 6) == 0) {
            i |= dVar.T(function2) ? 4 : 2;
        }
        if (dVar.g((i & 19) != 18, i & 1)) {
            if (e.k()) {
                e.o(-665310900, i, -1, "androidx.compose.foundation.text.ComposableSingletons$BasicTextFieldKt.lambda$-665310900.<anonymous> (BasicTextField.kt:1016)");
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

    public final ps4<Function2<? super d, ? super Integer, Unit>, d, Integer, Unit> e() {
        return c;
    }

    public final ps4<Function2<? super d, ? super Integer, Unit>, d, Integer, Unit> f() {
        return b;
    }
}
