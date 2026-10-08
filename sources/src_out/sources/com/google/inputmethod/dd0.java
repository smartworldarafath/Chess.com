package com.google.inputmethod;

import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import com.google.android.kd8;
import com.google.android.l67;
import com.google.android.ld8;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a'\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"", "enabled", "Lkotlin/Function0;", "", "onBack", "g", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/d;II)V", "activity-compose"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class dd0 {

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/google/android/dd0$a", "Lcom/google/android/w17;", "", "a", "()V", "lifecycle-runtime-compose_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements w17 {
        final /* synthetic */ v17 a;
        final /* synthetic */ rp1 b;

        public a(v17 v17Var, rp1 rp1Var) {
            this.a = v17Var;
            this.b = rp1Var;
        }

        @Override // com.google.inputmethod.w17
        public void a() {
            this.b.h(false);
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/google/android/dd0$b", "Lcom/google/android/jd3;", "", "dispose", "()V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements jd3 {
        final /* synthetic */ vc0 a;
        final /* synthetic */ rp1 b;

        public b(vc0 vc0Var, rp1 rp1Var) {
            this.a = vc0Var;
            this.b = rp1Var;
        }

        @Override // com.google.inputmethod.jd3
        public void dispose() throws Exception {
            this.a.b(this.b);
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/google/android/dd0$c", "Lcom/google/android/w17;", "", "a", "()V", "lifecycle-runtime-compose_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c implements w17 {
        final /* synthetic */ v17 a;
        final /* synthetic */ vc0 b;
        final /* synthetic */ rp1 c;

        public c(v17 v17Var, vc0 vc0Var, rp1 rp1Var) {
            this.a = v17Var;
            this.b = vc0Var;
            this.c = rp1Var;
        }

        @Override // com.google.inputmethod.w17
        public void a() throws Exception {
            this.b.b(this.c);
        }
    }

    public static final void g(boolean z, final Function0<Unit> function0, d dVar, final int i, final int i2) {
        int i3;
        final boolean z2;
        d dVarF = dVar.F(-361453782);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (dVarF.A(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= dVarF.T(function0) ? 32 : 16;
        }
        if (dVarF.g((i3 & 19) != 18, i3 & 1)) {
            z2 = i4 != 0 ? true : z;
            if (e.k()) {
                e.o(-361453782, i3, -1, "androidx.activity.compose.BackHandler (BackHandler.kt:107)");
            }
            lq8 lq8VarC = l67.a.c(dVarF, l67.c);
            if (lq8VarC == null) {
                dVarF.y(535274673);
                lq8VarC = o67.a.c(dVarF, 6);
            } else {
                dVarF.y(535271790);
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
            long jB = pp1.b(dVarF, 0);
            boolean zX2 = dVarF.x(vc0Var) | dVarF.D(jB);
            Object objR2 = dVarF.R();
            if (zX2 || objR2 == d.INSTANCE.a()) {
                objR2 = new rp1(new BackHandlerInfo(lq8VarC, jB));
                dVarF.L(objR2);
            }
            final rp1 rp1Var = (rp1) objR2;
            if (l8.isOnBackPressedLifecycleOrderMaintained) {
                dVarF.y(-585307852);
                boolean zT = dVarF.T(rp1Var) | ((i3 & 112) == 32);
                Object objR3 = dVarF.R();
                if (zT || objR3 == d.INSTANCE.a()) {
                    objR3 = new Function0() { // from class: com.google.android.xc0
                        public final Object invoke() {
                            return dd0.h(rp1Var, function0);
                        }
                    };
                    dVarF.L(objR3);
                }
                vn3.i((Function0) objR3, dVarF, 0);
                Boolean boolValueOf = Boolean.valueOf(z2);
                int i5 = i3 & 14;
                boolean zT2 = dVarF.T(rp1Var) | (i5 == 4);
                Object objR4 = dVarF.R();
                if (zT2 || objR4 == d.INSTANCE.a()) {
                    objR4 = new Function1() { // from class: com.google.android.yc0
                        public final Object invoke(Object obj) {
                            return dd0.i(rp1Var, z2, (v17) obj);
                        }
                    };
                    dVarF.L(objR4);
                }
                k17.x(boolValueOf, rp1Var, null, (Function1) objR4, dVarF, i5, 4);
                boolean zT3 = dVarF.T(vc0Var) | dVarF.T(rp1Var);
                Object objR5 = dVarF.R();
                if (zT3 || objR5 == d.INSTANCE.a()) {
                    objR5 = new Function1() { // from class: com.google.android.zc0
                        public final Object invoke(Object obj) {
                            return dd0.j(vc0Var, rp1Var, (kd3) obj);
                        }
                    };
                    dVarF.L(objR5);
                }
                vn3.b(vc0Var, rp1Var, (Function1) objR5, dVarF, 0);
                dVarF.u();
            } else {
                dVarF.y(-584634160);
                boolean zT4 = dVarF.T(rp1Var) | ((i3 & 14) == 4) | ((i3 & 112) == 32);
                Object objR6 = dVarF.R();
                if (zT4 || objR6 == d.INSTANCE.a()) {
                    objR6 = new Function0() { // from class: com.google.android.ad0
                        public final Object invoke() {
                            return dd0.k(rp1Var, z2, function0);
                        }
                    };
                    dVarF.L(objR6);
                }
                vn3.i((Function0) objR6, dVarF, 0);
                boolean zT5 = dVarF.T(vc0Var) | dVarF.T(rp1Var);
                Object objR7 = dVarF.R();
                if (zT5 || objR7 == d.INSTANCE.a()) {
                    objR7 = new Function1() { // from class: com.google.android.bd0
                        public final Object invoke(Object obj) {
                            return dd0.l(vc0Var, rp1Var, (v17) obj);
                        }
                    };
                    dVarF.L(objR7);
                }
                k17.x(vc0Var, rp1Var, null, (Function1) objR7, dVarF, 0, 4);
                dVarF.u();
            }
            if (e.k()) {
                e.n();
            }
        } else {
            dVarF.q();
            z2 = z;
        }
        s6b s6bVarH = dVarF.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2() { // from class: com.google.android.cd0
                public final Object invoke(Object obj, Object obj2) {
                    return dd0.m(z2, function0, i, i2, (d) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(rp1 rp1Var, Function0 function0) {
        rp1Var.k(function0);
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w17 i(rp1 rp1Var, boolean z, v17 v17Var) {
        rp1Var.h(z);
        return new a(v17Var, rp1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jd3 j(vc0 vc0Var, rp1 rp1Var, kd3 kd3Var) {
        vc0Var.a(rp1Var);
        return new b(vc0Var, rp1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(rp1 rp1Var, boolean z, Function0 function0) {
        rp1Var.h(z);
        rp1Var.k(function0);
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w17 l(vc0 vc0Var, rp1 rp1Var, v17 v17Var) {
        vc0Var.a(rp1Var);
        return new c(v17Var, vc0Var, rp1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(boolean z, Function0 function0, int i, int i2, d dVar, int i3) {
        g(z, function0, dVar, saa.a(i | 1), i2);
        return Unit.a;
    }
}
