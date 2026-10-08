package com.google.inputmethod;

import androidx.compose.p001foundation.gestures.Orientation;
import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import androidx.compose.ui.b;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a9\u0010\f\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\r\u001a9\u0010\u000e\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\r\u001aQ\u0010\u0014\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00072\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"", "initial", "Lcom/google/android/v9b;", "d", "(ILandroidx/compose/runtime/d;II)Lcom/google/android/v9b;", "Landroidx/compose/ui/b;", "state", "", "enabled", "Lcom/google/android/qg4;", "flingBehavior", "reverseScrolling", "h", "(Landroidx/compose/ui/b;Lcom/google/android/v9b;ZLcom/google/android/qg4;Z)Landroidx/compose/ui/b;", "b", "isScrollable", "isVertical", "useLocalOverscrollFactory", "Lcom/google/android/zv8;", "overscrollEffect", "f", "(Landroidx/compose/ui/b;Lcom/google/android/v9b;ZLcom/google/android/qg4;ZZZLcom/google/android/zv8;)Landroidx/compose/ui/b;", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class h9b {
    public static final b b(b bVar, v9b v9bVar, boolean z, qg4 qg4Var, boolean z2) {
        return g(bVar, v9bVar, z2, qg4Var, z, false, true, null, 64, null);
    }

    public static /* synthetic */ b c(b bVar, v9b v9bVar, boolean z, qg4 qg4Var, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            qg4Var = null;
        }
        if ((i & 8) != 0) {
            z2 = false;
        }
        return b(bVar, v9bVar, z, qg4Var, z2);
    }

    public static final v9b d(final int i, d dVar, int i2, int i3) {
        boolean z = true;
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if (e.k()) {
            e.o(-1464256199, i2, -1, "androidx.compose.foundation.rememberScrollState (Scroll.kt:70)");
        }
        Object[] objArr = new Object[0];
        k0b<v9b, ?> k0bVarA = v9b.INSTANCE.a();
        if ((((i2 & 14) ^ 6) <= 4 || !dVar.C(i)) && (i2 & 6) != 4) {
            z = false;
        }
        Object objR = dVar.R();
        if (z || objR == d.INSTANCE.a()) {
            objR = new Function0() { // from class: com.google.android.g9b
                public final Object invoke() {
                    return h9b.e(i);
                }
            };
            dVar.L(objR);
        }
        v9b v9bVar = (v9b) dfa.k(objArr, k0bVarA, (Function0) objR, dVar, 0);
        if (e.k()) {
            e.n();
        }
        return v9bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final v9b e(int i) {
        return new v9b(i);
    }

    private static final b f(b bVar, v9b v9bVar, boolean z, qg4 qg4Var, boolean z2, boolean z3, boolean z4, zv8 zv8Var) {
        Orientation orientation = z3 ? Orientation.Vertical : Orientation.Horizontal;
        return (z4 ? x9b.d(bVar, v9bVar, orientation, z2, z, qg4Var, v9bVar.getInternalInteractionSource(), null, 64, null) : x9b.c(bVar, v9bVar, orientation, zv8Var, z2, z, qg4Var, v9bVar.getInternalInteractionSource(), null, 128, null)).then(new kab(v9bVar, z, z3));
    }

    static /* synthetic */ b g(b bVar, v9b v9bVar, boolean z, qg4 qg4Var, boolean z2, boolean z3, boolean z4, zv8 zv8Var, int i, Object obj) {
        return f(bVar, v9bVar, z, qg4Var, z2, z3, z4, (i & 64) != 0 ? null : zv8Var);
    }

    public static final b h(b bVar, v9b v9bVar, boolean z, qg4 qg4Var, boolean z2) {
        return g(bVar, v9bVar, z2, qg4Var, z, true, true, null, 64, null);
    }

    public static /* synthetic */ b i(b bVar, v9b v9bVar, boolean z, qg4 qg4Var, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            qg4Var = null;
        }
        if ((i & 8) != 0) {
            z2 = false;
        }
        return h(bVar, v9bVar, z, qg4Var, z2);
    }
}
