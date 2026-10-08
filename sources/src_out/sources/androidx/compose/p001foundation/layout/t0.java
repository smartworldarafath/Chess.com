package androidx.compose.p001foundation.layout;

import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import com.google.inputmethod.ej7;
import com.google.inputmethod.kx1;
import com.google.inputmethod.nx1;
import com.google.inputmethod.tc;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a7\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000f\u0010\u0010\" \u0010\u0016\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010\u0011\u0012\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Landroidx/compose/foundation/layout/c$e;", "horizontalArrangement", "Lcom/google/android/tc$c;", "verticalAlignment", "Lcom/google/android/ej7;", "b", "(Landroidx/compose/foundation/layout/c$e;Lcom/google/android/tc$c;Landroidx/compose/runtime/d;I)Lcom/google/android/ej7;", "", "isPrioritizing", "", "mainAxisMin", "crossAxisMin", "mainAxisMax", "crossAxisMax", "Lcom/google/android/kx1;", "a", "(ZIIII)J", "Lcom/google/android/ej7;", "getDefaultRowMeasurePolicy", "()Lcom/google/android/ej7;", "getDefaultRowMeasurePolicy$annotations", "()V", "DefaultRowMeasurePolicy", "foundation-layout"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class t0 {
    private static final ej7 a = new RowMeasurePolicy(c.a.j(), tc.INSTANCE.l());

    public static final long a(boolean z, int i, int i2, int i3, int i4) {
        return !z ? nx1.a(i, i3, i2, i4) : kx1.INSTANCE.b(i, i3, i2, i4);
    }

    public static final ej7 b(c.e eVar, tc.c cVar, d dVar, int i) {
        ej7 ej7Var;
        if (e.k()) {
            e.o(-837807694, i, -1, "androidx.compose.foundation.layout.rowMeasurePolicy (Row.kt:118)");
        }
        if (Intrinsics.e(eVar, c.a.j()) && Intrinsics.e(cVar, tc.INSTANCE.l())) {
            dVar.y(-1073830487);
            dVar.u();
            ej7Var = a;
        } else {
            dVar.y(-1073779616);
            boolean z = ((((i & 14) ^ 6) > 4 && dVar.x(eVar)) || (i & 6) == 4) | ((((i & 112) ^ 48) > 32 && dVar.x(cVar)) || (i & 48) == 32);
            Object objR = dVar.R();
            if (z || objR == d.INSTANCE.a()) {
                objR = new RowMeasurePolicy(eVar, cVar);
                dVar.L(objR);
            }
            ej7Var = (RowMeasurePolicy) objR;
            dVar.u();
        }
        if (e.k()) {
            e.n();
        }
        return ej7Var;
    }
}
