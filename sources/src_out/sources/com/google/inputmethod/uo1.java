package com.google.inputmethod;

import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public final class uo1 {
    public static final uo1 a = new uo1();
    private static Function2<d, Integer, Unit> b = ko1.c(954879418, false, new Function2() { // from class: com.google.android.so1
        public final Object invoke(Object obj, Object obj2) {
            return uo1.f((d) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function2<d, Integer, Unit> c = ko1.c(1918065384, false, new Function2() { // from class: com.google.android.to1
        public final Object invoke(Object obj, Object obj2) {
            return uo1.e((d) obj, ((Integer) obj2).intValue());
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(d dVar, int i) {
        if (dVar.g((i & 3) != 2, i & 1)) {
            if (e.k()) {
                e.o(1918065384, i, -1, "androidx.compose.runtime.ComposableSingletons$CompositionKt.lambda$1918065384.<anonymous> (Composition.kt:917)");
            }
            if (e.k()) {
                e.n();
            }
        } else {
            dVar.q();
        }
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(d dVar, int i) {
        if (dVar.g((i & 3) != 2, i & 1)) {
            if (e.k()) {
                e.o(954879418, i, -1, "androidx.compose.runtime.ComposableSingletons$CompositionKt.lambda$954879418.<anonymous> (Composition.kt:680)");
            }
            if (e.k()) {
                e.n();
            }
        } else {
            dVar.q();
        }
        return Unit.a;
    }

    public final Function2<d, Integer, Unit> c() {
        return c;
    }

    public final Function2<d, Integer, Unit> d() {
        return b;
    }
}
