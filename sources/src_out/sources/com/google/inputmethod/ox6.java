package com.google.inputmethod;

import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import com.google.android.ps4;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.b0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a#\u0010\u0004\u001a\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lkotlin/Function1;", "Lcom/google/android/cya;", "", "content", "d", "(Lcom/google/android/ps4;Landroidx/compose/runtime/d;I)V", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class ox6 {
    public static final void d(final ps4<? super cya, ? super d, ? super Integer, Unit> ps4Var, d dVar, final int i) {
        int i2;
        d dVarF = dVar.F(-709502251);
        if ((i & 6) == 0) {
            i2 = (dVarF.T(ps4Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (dVarF.g((i2 & 3) != 2, i2 & 1)) {
            if (e.k()) {
                e.o(-709502251, i2, -1, "androidx.compose.foundation.lazy.layout.LazySaveableStateHolderProvider (LazySaveableStateHolder.kt:39)");
            }
            final qya qyaVar = (qya) dVarF.v(tya.g());
            final cya cyaVarB = kya.b(dVarF, 0);
            Object[] objArr = {qyaVar};
            k0b<kx6, Map<String, List<Object>>> k0bVarC = kx6.INSTANCE.c(qyaVar, cyaVarB);
            boolean zT = dVarF.T(qyaVar) | dVarF.T(cyaVarB);
            Object objR = dVarF.R();
            if (zT || objR == d.INSTANCE.a()) {
                objR = new Function0() { // from class: com.google.android.lx6
                    public final Object invoke() {
                        return ox6.e(qyaVar, cyaVarB);
                    }
                };
                dVarF.L(objR);
            }
            final kx6 kx6Var = (kx6) dfa.k(objArr, k0bVarC, (Function0) objR, dVarF, 0);
            fs1.c(tya.g().d(kx6Var), ko1.e(-412824043, true, new Function2() { // from class: com.google.android.mx6
                public final Object invoke(Object obj, Object obj2) {
                    return ox6.f(ps4Var, kx6Var, (d) obj, ((Integer) obj2).intValue());
                }
            }, dVarF, 54), dVarF, os9.i | 48);
            if (e.k()) {
                e.n();
            }
        } else {
            dVarF.q();
        }
        s6b s6bVarH = dVarF.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2() { // from class: com.google.android.nx6
                public final Object invoke(Object obj, Object obj2) {
                    return ox6.g(ps4Var, i, (d) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kx6 e(qya qyaVar, cya cyaVar) {
        return new kx6(qyaVar, b0.j(), cyaVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(ps4 ps4Var, kx6 kx6Var, d dVar, int i) {
        if (dVar.g((i & 3) != 2, i & 1)) {
            if (e.k()) {
                e.o(-412824043, i, -1, "androidx.compose.foundation.lazy.layout.LazySaveableStateHolderProvider.<anonymous> (LazySaveableStateHolder.kt:49)");
            }
            ps4Var.invoke(kx6Var, dVar, 0);
            if (e.k()) {
                e.n();
            }
        } else {
            dVar.q();
        }
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(ps4 ps4Var, int i, d dVar, int i2) {
        d(ps4Var, dVar, saa.a(i | 1));
        return Unit.a;
    }
}
