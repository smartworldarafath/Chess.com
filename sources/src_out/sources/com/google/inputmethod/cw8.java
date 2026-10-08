package com.google.inputmethod;

import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0011\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002\"\u001f\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/google/android/zv8;", "d", "(Landroidx/compose/runtime/d;I)Lcom/google/android/zv8;", "Lcom/google/android/ks9;", "Lcom/google/android/aw8;", "a", "Lcom/google/android/ks9;", "c", "()Lcom/google/android/ks9;", "LocalOverscrollFactory", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class cw8 {
    private static final ks9<aw8> a = fs1.i(new Function1() { // from class: com.google.android.bw8
        public final Object invoke(Object obj) {
            return cw8.b((as1) obj);
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final aw8 b(as1 as1Var) {
        return cm.b(as1Var);
    }

    public static final ks9<aw8> c() {
        return a;
    }

    public static final zv8 d(d dVar, int i) {
        dVar.y(282942128);
        if (e.k()) {
            e.o(282942128, i, -1, "androidx.compose.foundation.rememberOverscrollEffect (Overscroll.kt:343)");
        }
        aw8 aw8Var = (aw8) dVar.v(a);
        if (aw8Var == null) {
            if (e.k()) {
                e.n();
            }
            dVar.u();
            return null;
        }
        boolean zX = dVar.x(aw8Var);
        Object objR = dVar.R();
        if (zX || objR == d.INSTANCE.a()) {
            objR = aw8Var.a();
            dVar.L(objR);
        }
        zv8 zv8Var = (zv8) objR;
        if (e.k()) {
            e.n();
        }
        dVar.u();
        return zv8Var;
    }
}
