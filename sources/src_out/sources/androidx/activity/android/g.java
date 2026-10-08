package androidx.activity.android;

import androidx.activity.android.g;
import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import com.google.android.ai4;
import com.google.android.kd8;
import com.google.android.l67;
import com.google.android.ld8;
import com.google.android.q22;
import com.google.android.ta2;
import com.google.inputmethod.BackEventCompat;
import com.google.inputmethod.jd3;
import com.google.inputmethod.k17;
import com.google.inputmethod.kd3;
import com.google.inputmethod.l8;
import com.google.inputmethod.lq8;
import com.google.inputmethod.o67;
import com.google.inputmethod.pp1;
import com.google.inputmethod.s6b;
import com.google.inputmethod.saa;
import com.google.inputmethod.v17;
import com.google.inputmethod.vc0;
import com.google.inputmethod.vn3;
import com.google.inputmethod.w17;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001aC\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002(\u0010\b\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0002H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"", "enabled", "Lkotlin/Function2;", "Lcom/google/android/ai4;", "Lcom/google/android/tc0;", "Lcom/google/android/q22;", "", "", "onBack", "g", "(ZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/d;II)V", "activity-compose"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class g {

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/activity/compose/g$a", "Lcom/google/android/w17;", "", "a", "()V", "lifecycle-runtime-compose_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements w17 {
        final /* synthetic */ v17 a;
        final /* synthetic */ ComposePredictiveBackHandler b;

        public a(v17 v17Var, ComposePredictiveBackHandler composePredictiveBackHandler) {
            this.a = v17Var;
            this.b = composePredictiveBackHandler;
        }

        @Override // com.google.inputmethod.w17
        public void a() {
            this.b.h(false);
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/activity/compose/g$b", "Lcom/google/android/jd3;", "", "dispose", "()V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements jd3 {
        final /* synthetic */ vc0 a;
        final /* synthetic */ ComposePredictiveBackHandler b;

        public b(vc0 vc0Var, ComposePredictiveBackHandler composePredictiveBackHandler) {
            this.a = vc0Var;
            this.b = composePredictiveBackHandler;
        }

        @Override // com.google.inputmethod.jd3
        public void dispose() throws Exception {
            this.a.b(this.b);
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/activity/compose/g$c", "Lcom/google/android/w17;", "", "a", "()V", "lifecycle-runtime-compose_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c implements w17 {
        final /* synthetic */ v17 a;
        final /* synthetic */ vc0 b;
        final /* synthetic */ ComposePredictiveBackHandler c;

        public c(v17 v17Var, vc0 vc0Var, ComposePredictiveBackHandler composePredictiveBackHandler) {
            this.a = v17Var;
            this.b = vc0Var;
            this.c = composePredictiveBackHandler;
        }

        @Override // com.google.inputmethod.w17
        public void a() throws Exception {
            this.b.b(this.c);
        }
    }

    public static final void g(boolean z, final Function2<ai4<BackEventCompat>, ? super q22<Unit>, ? extends Object> function2, d dVar, final int i, final int i2) {
        boolean z2;
        int i3;
        final boolean z3;
        d dVarF = dVar.F(-642000585);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            z2 = z;
        } else if ((i & 6) == 0) {
            z2 = z;
            i3 = (dVarF.A(z2) ? 4 : 2) | i;
        } else {
            z2 = z;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= dVarF.T(function2) ? 32 : 16;
        }
        if (dVarF.g((i3 & 19) != 18, i3 & 1)) {
            z3 = i4 != 0 ? true : z2;
            if (e.k()) {
                e.o(-642000585, i3, -1, "androidx.activity.compose.PredictiveBackHandler (PredictiveBackHandler.kt:118)");
            }
            lq8 lq8VarC = l67.a.c(dVarF, l67.c);
            if (lq8VarC == null) {
                dVarF.y(1512740606);
                lq8VarC = o67.a.c(dVarF, 6);
            } else {
                dVarF.y(1512737723);
            }
            dVarF.u();
            if (lq8VarC == null) {
                throw new IllegalStateException("No NavigationEventDispatcherOwner was provided via LocalNavigationEventDispatcherOwner and no OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner. Please provide one of the two.");
            }
            boolean zX = dVarF.x(lq8VarC);
            Object objR = dVarF.R();
            if (zX || objR == d.INSTANCE.a()) {
                ld8 ld8Var = lq8VarC instanceof ld8 ? (ld8) lq8VarC : null;
                kd8 navigationEventDispatcher = ld8Var != null ? ld8Var.getNavigationEventDispatcher() : null;
                lq8 lq8Var = lq8VarC instanceof lq8 ? lq8VarC : null;
                objR = new vc0(navigationEventDispatcher, lq8Var != null ? lq8Var.getOnBackPressedDispatcher() : null);
                dVarF.L(objR);
            }
            final vc0 vc0Var = (vc0) objR;
            Object objR2 = dVarF.R();
            d.Companion companion = d.INSTANCE;
            if (objR2 == companion.a()) {
                objR2 = vn3.k(EmptyCoroutineContext.a, dVarF);
                dVarF.L(objR2);
            }
            ta2 ta2Var = (ta2) objR2;
            long jB = pp1.b(dVarF, 0);
            boolean zX2 = dVarF.x(vc0Var) | dVarF.D(jB);
            Object objR3 = dVarF.R();
            if (zX2 || objR3 == companion.a()) {
                objR3 = new ComposePredictiveBackHandler(ta2Var, new PredictiveBackHandlerInfo(lq8VarC, jB));
                dVarF.L(objR3);
            }
            final ComposePredictiveBackHandler composePredictiveBackHandler = (ComposePredictiveBackHandler) objR3;
            if (l8.isOnBackPressedLifecycleOrderMaintained) {
                dVarF.y(-348514256);
                boolean zT = dVarF.T(composePredictiveBackHandler) | dVarF.T(function2);
                Object objR4 = dVarF.R();
                if (zT || objR4 == companion.a()) {
                    objR4 = new Function0() { // from class: androidx.activity.compose.b
                        public final Object invoke() {
                            return g.h(composePredictiveBackHandler, function2);
                        }
                    };
                    dVarF.L(objR4);
                }
                vn3.i((Function0) objR4, dVarF, 0);
                Boolean boolValueOf = Boolean.valueOf(z3);
                int i5 = i3 & 14;
                boolean zT2 = dVarF.T(composePredictiveBackHandler) | (i5 == 4);
                Object objR5 = dVarF.R();
                if (zT2 || objR5 == companion.a()) {
                    objR5 = new Function1() { // from class: androidx.activity.compose.c
                        public final Object invoke(Object obj) {
                            return g.i(composePredictiveBackHandler, z3, (v17) obj);
                        }
                    };
                    dVarF.L(objR5);
                }
                k17.x(boolValueOf, composePredictiveBackHandler, null, (Function1) objR5, dVarF, i5, 4);
                boolean zT3 = dVarF.T(vc0Var) | dVarF.T(composePredictiveBackHandler);
                Object objR6 = dVarF.R();
                if (zT3 || objR6 == companion.a()) {
                    objR6 = new Function1() { // from class: androidx.activity.compose.d
                        public final Object invoke(Object obj) {
                            return g.j(vc0Var, composePredictiveBackHandler, (kd3) obj);
                        }
                    };
                    dVarF.L(objR6);
                }
                vn3.b(vc0Var, composePredictiveBackHandler, (Function1) objR6, dVarF, 0);
                dVarF.u();
            } else {
                dVarF.y(-347849492);
                boolean zT4 = dVarF.T(composePredictiveBackHandler) | ((i3 & 14) == 4) | dVarF.T(function2);
                Object objR7 = dVarF.R();
                if (zT4 || objR7 == companion.a()) {
                    objR7 = new Function0() { // from class: androidx.activity.compose.e
                        public final Object invoke() {
                            return g.k(composePredictiveBackHandler, z3, function2);
                        }
                    };
                    dVarF.L(objR7);
                }
                vn3.i((Function0) objR7, dVarF, 0);
                boolean zT5 = dVarF.T(vc0Var) | dVarF.T(composePredictiveBackHandler);
                Object objR8 = dVarF.R();
                if (zT5 || objR8 == companion.a()) {
                    objR8 = new Function1() { // from class: androidx.activity.compose.f
                        public final Object invoke(Object obj) {
                            return g.l(vc0Var, composePredictiveBackHandler, (v17) obj);
                        }
                    };
                    dVarF.L(objR8);
                }
                k17.x(vc0Var, composePredictiveBackHandler, null, (Function1) objR8, dVarF, 0, 4);
                dVarF.u();
            }
            if (e.k()) {
                e.n();
            }
        } else {
            dVarF.q();
            z3 = z2;
        }
        s6b s6bVarH = dVarF.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2() { // from class: com.google.android.gk9
                public final Object invoke(Object obj, Object obj2) {
                    return g.m(z3, function2, i, i2, (d) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(ComposePredictiveBackHandler composePredictiveBackHandler, Function2 function2) {
        composePredictiveBackHandler.l(function2);
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w17 i(ComposePredictiveBackHandler composePredictiveBackHandler, boolean z, v17 v17Var) {
        composePredictiveBackHandler.h(z);
        return new a(v17Var, composePredictiveBackHandler);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jd3 j(vc0 vc0Var, ComposePredictiveBackHandler composePredictiveBackHandler, kd3 kd3Var) {
        vc0Var.a(composePredictiveBackHandler);
        return new b(vc0Var, composePredictiveBackHandler);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(ComposePredictiveBackHandler composePredictiveBackHandler, boolean z, Function2 function2) {
        composePredictiveBackHandler.h(z);
        composePredictiveBackHandler.l(function2);
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w17 l(vc0 vc0Var, ComposePredictiveBackHandler composePredictiveBackHandler, v17 v17Var) {
        vc0Var.a(composePredictiveBackHandler);
        return new c(v17Var, vc0Var, composePredictiveBackHandler);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(boolean z, Function2 function2, int i, int i2, d dVar, int i3) {
        g(z, function2, dVar, saa.a(i | 1), i2);
        return Unit.a;
    }
}
