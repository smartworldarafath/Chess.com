package com.google.inputmethod;

import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import androidx.compose.p004runtime.p0;
import androidx.compose.ui.b;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import androidx.compose.ui.layout.SubcomposeLayoutState;
import com.google.android.ps4;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a;\u0010\n\u001a\u00020\t2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lkotlin/Function0;", "Lcom/google/android/lt6;", "itemProvider", "Landroidx/compose/ui/b;", "modifier", "Lcom/google/android/nu6;", "prefetchState", "Lcom/google/android/vt6;", "measurePolicy", "", "f", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/b;Lcom/google/android/nu6;Lcom/google/android/vt6;Landroidx/compose/runtime/d;II)V", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class ut6 {

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/google/android/ut6$a", "Lcom/google/android/jd3;", "", "dispose", "()V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements jd3 {
        final /* synthetic */ nu6 a;

        public a(nu6 nu6Var) {
            this.a = nu6Var;
        }

        @Override // com.google.inputmethod.jd3
        public void dispose() {
            bl9 prefetchHandleProvider = this.a.getPrefetchHandleProvider();
            if (prefetchHandleProvider != null) {
                prefetchHandleProvider.g();
            }
            this.a.k(null);
        }
    }

    public static final void f(final Function0<? extends lt6> function0, final b bVar, final nu6 nu6Var, final vt6 vt6Var, d dVar, final int i, final int i2) {
        int i3;
        d dVarF = dVar.F(1055276397);
        if ((i & 6) == 0) {
            i3 = (dVarF.T(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= dVarF.x(bVar) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= dVarF.x(nu6Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= (i & 4096) == 0 ? dVarF.x(vt6Var) : dVarF.T(vt6Var) ? 2048 : 1024;
        }
        if (dVarF.g((i3 & 1171) != 1170, i3 & 1)) {
            if (i4 != 0) {
                bVar = b.INSTANCE;
            }
            if (i5 != 0) {
                nu6Var = null;
            }
            if (e.k()) {
                e.o(1055276397, i3, -1, "androidx.compose.foundation.lazy.layout.LazyLayout (LazyLayout.kt:111)");
            }
            final q6c q6cVarR = p0.r(function0, dVarF, i3 & 14);
            ox6.d(ko1.e(-933153643, true, new ps4() { // from class: com.google.android.pt6
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return ut6.g(nu6Var, bVar, vt6Var, q6cVarR, (cya) obj, (d) obj2, ((Integer) obj3).intValue());
                }
            }, dVarF, 54), dVarF, 6);
            if (e.k()) {
                e.n();
            }
        } else {
            dVarF.q();
        }
        final b bVar2 = bVar;
        final nu6 nu6Var2 = nu6Var;
        s6b s6bVarH = dVarF.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2() { // from class: com.google.android.qt6
                public final Object invoke(Object obj, Object obj2) {
                    return ut6.k(function0, bVar2, nu6Var2, vt6Var, i, i2, (d) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(final nu6 nu6Var, b bVar, final vt6 vt6Var, final q6c q6cVar, cya cyaVar, d dVar, int i) {
        if (e.k()) {
            e.o(-933153643, i, -1, "androidx.compose.foundation.lazy.layout.LazyLayout.<anonymous> (LazyLayout.kt:115)");
        }
        Object objR = dVar.R();
        d.Companion companion = d.INSTANCE;
        if (objR == companion.a()) {
            objR = new ht6(cyaVar, new Function0() { // from class: com.google.android.rt6
                public final Object invoke() {
                    return ut6.h(q6cVar);
                }
            });
            dVar.L(objR);
        }
        final ht6 ht6Var = (ht6) objR;
        Object objR2 = dVar.R();
        if (objR2 == companion.a()) {
            objR2 = new SubcomposeLayoutState(new nt6(ht6Var));
            dVar.L(objR2);
        }
        final SubcomposeLayoutState subcomposeLayoutState = (SubcomposeLayoutState) objR2;
        if (nu6Var != null) {
            dVar.y(1743490539);
            final fl9 prefetchScheduler = nu6Var.getPrefetchScheduler();
            if (prefetchScheduler == null) {
                dVar.y(887527095);
                prefetchScheduler = gl9.a(dVar, 0);
            } else {
                dVar.y(887526010);
            }
            dVar.u();
            Object[] objArr = {nu6Var, ht6Var, subcomposeLayoutState, prefetchScheduler};
            boolean zX = dVar.x(nu6Var) | dVar.T(ht6Var) | dVar.T(subcomposeLayoutState) | dVar.T(prefetchScheduler);
            Object objR3 = dVar.R();
            if (zX || objR3 == companion.a()) {
                objR3 = new Function1() { // from class: com.google.android.st6
                    public final Object invoke(Object obj) {
                        return ut6.i(nu6Var, ht6Var, subcomposeLayoutState, prefetchScheduler, (kd3) obj);
                    }
                };
                dVar.L(objR3);
            }
            vn3.d(objArr, (Function1) objR3, dVar, 0);
            dVar.u();
        } else {
            dVar.y(1744076749);
            dVar.u();
        }
        b bVarA = ou6.a(bVar, nu6Var);
        boolean zX2 = dVar.x(ht6Var) | dVar.x(vt6Var);
        Object objR4 = dVar.R();
        if (zX2 || objR4 == companion.a()) {
            objR4 = new Function2() { // from class: com.google.android.tt6
                public final Object invoke(Object obj, Object obj2) {
                    return ut6.j(ht6Var, vt6Var, (scc) obj, (kx1) obj2);
                }
            };
            dVar.L(objR4);
        }
        SubcomposeLayoutKt.b(subcomposeLayoutState, bVarA, (Function2) objR4, dVar, SubcomposeLayoutState.f, 0);
        if (e.k()) {
            e.n();
        }
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final lt6 h(q6c q6cVar) {
        return (lt6) ((Function0) q6cVar.getValue()).invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jd3 i(nu6 nu6Var, ht6 ht6Var, SubcomposeLayoutState subcomposeLayoutState, fl9 fl9Var, kd3 kd3Var) {
        nu6Var.k(new bl9(ht6Var, subcomposeLayoutState, fl9Var));
        return new a(nu6Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fj7 j(ht6 ht6Var, vt6 vt6Var, scc sccVar, kx1 kx1Var) {
        return vt6Var.a(new xt6(ht6Var, sccVar), kx1Var.getValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(Function0 function0, b bVar, nu6 nu6Var, vt6 vt6Var, int i, int i2, d dVar, int i3) {
        f(function0, bVar, nu6Var, vt6Var, dVar, saa.a(i | 1), i2);
        return Unit.a;
    }
}
