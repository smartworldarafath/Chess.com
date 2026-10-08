package com.google.inputmethod;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;
import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a3\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u00042\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a=\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\rH\u0003¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"", "listenToTouchExplorationState", "listenToSwitchAccessState", "listenToVoiceAccessState", "Lcom/google/android/q6c;", "n", "(ZZZLandroidx/compose/runtime/d;II)Lcom/google/android/q6c;", "Lcom/google/android/n17;", "lifecycleOwner", "Lkotlin/Function1;", "Landroidx/lifecycle/Lifecycle$Event;", "", "handleEvent", "Lkotlin/Function0;", "onDispose", "h", "(Lcom/google/android/n17;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/d;II)V", "material3"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class b7 {

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/google/android/b7$a", "Lcom/google/android/jd3;", "", "dispose", "()V", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a implements jd3 {
        final /* synthetic */ Function0 a;
        final /* synthetic */ n17 b;
        final /* synthetic */ i c;

        public a(Function0 function0, n17 n17Var, i iVar) {
            this.a = function0;
            this.b = n17Var;
            this.c = iVar;
        }

        @Override // com.google.inputmethod.jd3
        public void dispose() {
            this.a.invoke();
            this.b.getLifecycle().g(this.c);
        }
    }

    private static final void h(final n17 n17Var, final Function1<? super Lifecycle.Event, Unit> function1, final Function0<Unit> function0, d dVar, final int i, final int i2) {
        int i3;
        d dVarF = dVar.F(-1868327245);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (dVarF.T(n17Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= dVarF.T(function1) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= dVarF.T(function0) ? 256 : 128;
        }
        if (dVarF.g((i3 & 147) != 146, i3 & 1)) {
            if (i4 != 0) {
                Object objR = dVarF.R();
                if (objR == d.INSTANCE.a()) {
                    objR = new Function1() { // from class: com.google.android.w6
                        public final Object invoke(Object obj) {
                            return b7.l((Lifecycle.Event) obj);
                        }
                    };
                    dVarF.L(objR);
                }
                function1 = (Function1) objR;
            }
            if (i5 != 0) {
                Object objR2 = dVarF.R();
                if (objR2 == d.INSTANCE.a()) {
                    objR2 = new Function0() { // from class: com.google.android.x6
                        public final Object invoke() {
                            return b7.m();
                        }
                    };
                    dVarF.L(objR2);
                }
                function0 = (Function0) objR2;
            }
            if (e.k()) {
                e.o(-1868327245, i3, -1, "androidx.compose.material3.internal.ObserveState (AccessibilityServiceStateProvider.android.kt:82)");
            }
            boolean zT = ((i3 & 112) == 32) | dVarF.T(n17Var) | ((i3 & 896) == 256);
            Object objR3 = dVarF.R();
            if (zT || objR3 == d.INSTANCE.a()) {
                objR3 = new Function1() { // from class: com.google.android.y6
                    public final Object invoke(Object obj) {
                        return b7.i(n17Var, function1, function0, (kd3) obj);
                    }
                };
                dVarF.L(objR3);
            }
            vn3.c(n17Var, (Function1) objR3, dVarF, i3 & 14);
            if (e.k()) {
                e.n();
            }
        } else {
            dVarF.q();
        }
        final Function1<? super Lifecycle.Event, Unit> function2 = function1;
        final Function0<Unit> function3 = function0;
        s6b s6bVarH = dVarF.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2() { // from class: com.google.android.z6
                public final Object invoke(Object obj, Object obj2) {
                    return b7.k(n17Var, function2, function3, i, i2, (d) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jd3 i(n17 n17Var, final Function1 function1, Function0 function0, kd3 kd3Var) {
        i iVar = new i() { // from class: com.google.android.a7
            @Override // androidx.lifecycle.i
            public final void d6(n17 n17Var2, Lifecycle.Event event) {
                b7.j(function1, n17Var2, event);
            }
        };
        n17Var.getLifecycle().c(iVar);
        return new a(function0, n17Var, iVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(Function1 function1, n17 n17Var, Lifecycle.Event event) {
        function1.invoke(event);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(n17 n17Var, Function1 function1, Function0 function0, int i, int i2, d dVar, int i3) {
        h(n17Var, function1, function0, dVar, saa.a(i | 1), i2);
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(Lifecycle.Event event) {
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m() {
        return Unit.a;
    }

    public static final q6c<Boolean> n(boolean z, boolean z2, boolean z3, d dVar, int i, int i2) {
        boolean z4 = true;
        if ((i2 & 1) != 0) {
            z = true;
        }
        if ((i2 & 2) != 0) {
            z2 = true;
        }
        if ((i2 & 4) != 0) {
            z3 = true;
        }
        if (e.k()) {
            e.o(432241692, i, -1, "androidx.compose.material3.internal.rememberAccessibilityServiceState (AccessibilityServiceStateProvider.android.kt:46)");
        }
        Object systemService = ((Context) dVar.v(AndroidCompositionLocals_androidKt.c())).getSystemService("accessibility");
        Intrinsics.h(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        final AccessibilityManager accessibilityManager = (AccessibilityManager) systemService;
        boolean z5 = ((((i & 14) ^ 6) > 4 && dVar.A(z)) || (i & 6) == 4) | ((((i & 112) ^ 48) > 32 && dVar.A(z2)) || (i & 48) == 32);
        if ((((i & 896) ^ 384) <= 256 || !dVar.A(z3)) && (i & 384) != 256) {
            z4 = false;
        }
        boolean z6 = z5 | z4;
        Object objR = dVar.R();
        if (z6 || objR == d.INSTANCE.a()) {
            objR = new u47(z, z2, z3);
            dVar.L(objR);
        }
        final u47 u47Var = (u47) objR;
        n17 n17Var = (n17) dVar.v(h67.c());
        boolean zX = dVar.x(u47Var) | dVar.T(accessibilityManager);
        Object objR2 = dVar.R();
        if (zX || objR2 == d.INSTANCE.a()) {
            objR2 = new Function1() { // from class: com.google.android.u6
                public final Object invoke(Object obj) {
                    return b7.o(u47Var, accessibilityManager, (Lifecycle.Event) obj);
                }
            };
            dVar.L(objR2);
        }
        Function1 function1 = (Function1) objR2;
        boolean zX2 = dVar.x(u47Var) | dVar.T(accessibilityManager);
        Object objR3 = dVar.R();
        if (zX2 || objR3 == d.INSTANCE.a()) {
            objR3 = new Function0() { // from class: com.google.android.v6
                public final Object invoke() {
                    return b7.p(u47Var, accessibilityManager);
                }
            };
            dVar.L(objR3);
        }
        h(n17Var, function1, (Function0) objR3, dVar, 0, 0);
        if (e.k()) {
            e.n();
        }
        return u47Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o(u47 u47Var, AccessibilityManager accessibilityManager, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_RESUME) {
            u47Var.w(accessibilityManager);
        }
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p(u47 u47Var, AccessibilityManager accessibilityManager) {
        u47Var.A(accessibilityManager);
        return Unit.a;
    }
}
