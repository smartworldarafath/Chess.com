package com.google.inputmethod;

import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a;\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002H\u0003¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/google/android/lt6;", "itemProvider", "Lcom/google/android/v3c;", "Lcom/google/android/cya;", "saveableStateHolder", "", "index", "", "key", "", "c", "(Lcom/google/android/lt6;Ljava/lang/Object;ILjava/lang/Object;Landroidx/compose/runtime/d;I)V", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class kt6 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(final lt6 lt6Var, final Object obj, final int i, final Object obj2, d dVar, final int i2) {
        int i3;
        d dVarF = dVar.F(1439843069);
        if ((i2 & 6) == 0) {
            i3 = (dVarF.x(lt6Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= dVarF.x(obj) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= dVarF.C(i) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= dVarF.x(obj2) ? 2048 : 1024;
        }
        if (dVarF.g((i3 & 1171) != 1170, i3 & 1)) {
            if (e.k()) {
                e.o(1439843069, i3, -1, "androidx.compose.foundation.lazy.layout.SkippableItem (LazyLayoutItemContentFactory.kt:124)");
            }
            ((cya) obj).e(obj2, ko1.e(980966366, true, new Function2() { // from class: com.google.android.it6
                public final Object invoke(Object obj3, Object obj4) {
                    return kt6.d(lt6Var, i, obj2, (d) obj3, ((Integer) obj4).intValue());
                }
            }, dVarF, 54), dVarF, 48);
            if (e.k()) {
                e.n();
            }
        } else {
            dVarF.q();
        }
        s6b s6bVarH = dVarF.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2() { // from class: com.google.android.jt6
                public final Object invoke(Object obj3, Object obj4) {
                    return kt6.e(lt6Var, obj, i, obj2, i2, (d) obj3, ((Integer) obj4).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(lt6 lt6Var, int i, Object obj, d dVar, int i2) {
        if (dVar.g((i2 & 3) != 2, i2 & 1)) {
            if (e.k()) {
                e.o(980966366, i2, -1, "androidx.compose.foundation.lazy.layout.SkippableItem.<anonymous> (LazyLayoutItemContentFactory.kt:126)");
            }
            lt6Var.i(i, obj, dVar, 0);
            if (e.k()) {
                e.n();
            }
        } else {
            dVar.q();
        }
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(lt6 lt6Var, Object obj, int i, Object obj2, int i2, d dVar, int i3) {
        c(lt6Var, obj, i, obj2, dVar, saa.a(i2 | 1));
        return Unit.a;
    }
}
