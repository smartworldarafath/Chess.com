package com.google.inputmethod;

import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import androidx.compose.ui.layout.PinnableContainerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a7\u0010\t\u001a\u00020\u00072\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"", "key", "", "index", "Lcom/google/android/mu6;", "pinnedItemList", "Lkotlin/Function0;", "", "content", "c", "(Ljava/lang/Object;ILcom/google/android/mu6;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/d;I)V", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class lu6 {

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/google/android/lu6$a", "Lcom/google/android/jd3;", "", "dispose", "()V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements jd3 {
        final /* synthetic */ iu6 a;

        public a(iu6 iu6Var) {
            this.a = iu6Var;
        }

        @Override // com.google.inputmethod.jd3
        public void dispose() {
            this.a.d();
        }
    }

    public static final void c(final Object obj, final int i, final mu6 mu6Var, final Function2<? super d, ? super Integer, Unit> function2, d dVar, final int i2) {
        int i3;
        d dVarF = dVar.F(872548579);
        if ((i2 & 6) == 0) {
            i3 = (dVarF.T(obj) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= dVarF.C(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= dVarF.T(mu6Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= dVarF.T(function2) ? 2048 : 1024;
        }
        if (dVarF.g((i3 & 1171) != 1170, i3 & 1)) {
            if (e.k()) {
                e.o(872548579, i3, -1, "androidx.compose.foundation.lazy.layout.LazyLayoutPinnableItem (LazyLayoutPinnableItem.kt:50)");
            }
            boolean zX = dVarF.x(obj) | dVarF.x(mu6Var);
            Object objR = dVarF.R();
            if (zX || objR == d.INSTANCE.a()) {
                objR = new iu6(obj, mu6Var);
                dVarF.L(objR);
            }
            final iu6 iu6Var = (iu6) objR;
            iu6Var.e(i);
            iu6Var.f((n99) dVarF.v(PinnableContainerKt.a()));
            boolean zX2 = dVarF.x(iu6Var);
            Object objR2 = dVarF.R();
            if (zX2 || objR2 == d.INSTANCE.a()) {
                objR2 = new Function1() { // from class: com.google.android.ju6
                    public final Object invoke(Object obj2) {
                        return lu6.d(iu6Var, (kd3) obj2);
                    }
                };
                dVarF.L(objR2);
            }
            vn3.c(iu6Var, (Function1) objR2, dVarF, 0);
            fs1.c(PinnableContainerKt.a().d(iu6Var), function2, dVarF, ((i3 >> 6) & 112) | os9.i);
            if (e.k()) {
                e.n();
            }
        } else {
            dVarF.q();
        }
        s6b s6bVarH = dVarF.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2() { // from class: com.google.android.ku6
                public final Object invoke(Object obj2, Object obj3) {
                    return lu6.e(obj, i, mu6Var, function2, i2, (d) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jd3 d(iu6 iu6Var, kd3 kd3Var) {
        return new a(iu6Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(Object obj, int i, mu6 mu6Var, Function2 function2, int i2, d dVar, int i3) {
        c(obj, i, mu6Var, function2, dVar, saa.a(i2 | 1));
        return Unit.a;
    }
}
