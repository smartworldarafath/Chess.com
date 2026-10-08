package androidx.compose.p002material3;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.compose.p000animation.core.Animatable;
import androidx.compose.p001foundation.layout.BoxScopeInstance;
import androidx.compose.p001foundation.layout.j;
import androidx.compose.p002material3.b1;
import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import androidx.compose.p004runtime.f;
import androidx.compose.p004runtime.p0;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.android.ta2;
import com.google.inputmethod.afb;
import com.google.inputmethod.dfa;
import com.google.inputmethod.dud;
import com.google.inputmethod.ei1;
import com.google.inputmethod.ej7;
import com.google.inputmethod.f43;
import com.google.inputmethod.gs1;
import com.google.inputmethod.jd3;
import com.google.inputmethod.kd3;
import com.google.inputmethod.ki1;
import com.google.inputmethod.ko1;
import com.google.inputmethod.nfb;
import com.google.inputmethod.pp1;
import com.google.inputmethod.q6c;
import com.google.inputmethod.qr;
import com.google.inputmethod.s6b;
import com.google.inputmethod.saa;
import com.google.inputmethod.tc;
import com.google.inputmethod.vn3;
import com.google.inputmethod.vx7;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u001aO\u0010\f\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0001¢\u0006\u0004\b\f\u0010\r\u001a\u0013\u0010\u0010\u001a\u00020\u000f*\u00020\u000eH\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0013\u0010\u0012\u001a\u00020\u000f*\u00020\u0003H\u0000¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0015²\u0006\u0012\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\nX\u008a\u0084\u0002"}, d2 = {"Lkotlin/Function0;", "", "onDismissRequest", "Lcom/google/android/ei1;", "contentColor", "Lcom/google/android/vx7;", "properties", "Landroidx/compose/animation/core/Animatable;", "", "Lcom/google/android/qr;", "predictiveBackProgress", "content", "e", "(Lkotlin/jvm/functions/Function0;JLcom/google/android/vx7;Landroidx/compose/animation/core/Animatable;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/d;I)V", "Landroid/view/View;", "", "m", "(Landroid/view/View;)Z", "l", "(J)Z", "currentContent", "material3"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class b1 {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class a implements Function2<d, Integer, Unit> {
        final /* synthetic */ q6c<Function2<d, Integer, Unit>> a;

        a(q6c<? extends Function2<? super d, ? super Integer, Unit>> q6cVar) {
            this.a = q6cVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(nfb nfbVar) {
            SemanticsPropertiesKt.h(nfbVar);
            return Unit.a;
        }

        public final void b(d dVar, int i) {
            if (!dVar.g((i & 3) != 2, i & 1)) {
                dVar.q();
                return;
            }
            if (e.k()) {
                e.o(-1051373467, i, -1, "androidx.compose.material3.ModalBottomSheetDialog.<anonymous>.<anonymous>.<anonymous> (ModalBottomSheet.android.kt:392)");
            }
            androidx.compose.ui.b.Companion companion = androidx.compose.ui.b.INSTANCE;
            Object objR = dVar.R();
            if (objR == d.INSTANCE.a()) {
                objR = new Function1() { // from class: androidx.compose.material3.a1
                    public final Object invoke(Object obj) {
                        return b1.a.c((nfb) obj);
                    }
                };
                dVar.L(objR);
            }
            androidx.compose.ui.b bVarD = afb.d(companion, false, (Function1) objR, 1, null);
            q6c<Function2<d, Integer, Unit>> q6cVar = this.a;
            ej7 ej7VarI = j.i(tc.INSTANCE.o(), false);
            int iA = pp1.a(dVar, 0);
            gs1 gs1VarJ = dVar.j();
            androidx.compose.ui.b bVarE = ComposedModifierKt.e(dVar, bVarD);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> function0B = companion2.b();
            if (dVar.G() == null) {
                pp1.d();
            }
            dVar.o();
            if (dVar.getInserting()) {
                dVar.W(function0B);
            } else {
                dVar.k();
            }
            d dVarC = dud.c(dVar);
            dud.i(dVarC, ej7VarI, companion2.d());
            dud.i(dVarC, gs1VarJ, companion2.f());
            Function2<ComposeUiNode, Integer, Unit> function2C = companion2.c();
            if (dVarC.getInserting() || !Intrinsics.e(dVarC.R(), Integer.valueOf(iA))) {
                dVarC.L(Integer.valueOf(iA));
                dVarC.e(Integer.valueOf(iA), function2C);
            }
            dud.i(dVarC, bVarE, companion2.e());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.a;
            b1.f(q6cVar).invoke(dVar, 0);
            dVar.m();
            if (e.k()) {
                e.n();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((d) obj, ((Number) obj2).intValue());
            return Unit.a;
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/compose/material3/b1$b", "Lcom/google/android/jd3;", "", "dispose", "()V", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b implements jd3 {
        final /* synthetic */ ModalBottomSheetDialogWrapper a;

        public b(ModalBottomSheetDialogWrapper modalBottomSheetDialogWrapper) {
            this.a = modalBottomSheetDialogWrapper;
        }

        @Override // com.google.inputmethod.jd3
        public void dispose() {
            this.a.dismiss();
            this.a.l();
        }
    }

    public static final void e(final Function0<Unit> function0, final long j, final vx7 vx7Var, final Animatable<Float, qr> animatable, final Function2<? super d, ? super Integer, Unit> function2, d dVar, final int i) {
        int i2;
        vx7 vx7Var2;
        int i3;
        final LayoutDirection layoutDirection;
        boolean z;
        Object obj;
        d dVarF = dVar.F(766784632);
        if ((i & 6) == 0) {
            i2 = (dVarF.T(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= dVarF.D(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            vx7Var2 = vx7Var;
            i2 |= dVarF.x(vx7Var2) ? 256 : 128;
        } else {
            vx7Var2 = vx7Var;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? dVarF.x(animatable) : dVarF.T(animatable) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= dVarF.T(function2) ? 16384 : 8192;
        }
        if (dVarF.g((i2 & 9363) != 9362, i2 & 1)) {
            if (e.k()) {
                e.o(766784632, i2, -1, "androidx.compose.material3.ModalBottomSheetDialog (ModalBottomSheet.android.kt:369)");
            }
            View view = (View) dVarF.v(AndroidCompositionLocals_androidKt.g());
            f43 f43Var = (f43) dVarF.v(CompositionLocalsKt.g());
            LayoutDirection layoutDirection2 = (LayoutDirection) dVarF.v(CompositionLocalsKt.m());
            f fVarE = pp1.e(dVarF, 0);
            q6c q6cVarR = p0.r(function2, dVarF, (i2 >> 12) & 14);
            Object[] objArr = new Object[0];
            Object objR = dVarF.R();
            d.Companion companion = d.INSTANCE;
            if (objR == companion.a()) {
                objR = new Function0() { // from class: com.google.android.wx7
                    public final Object invoke() {
                        return b1.i();
                    }
                };
                dVarF.L(objR);
            }
            UUID uuid = (UUID) dfa.l(objArr, (Function0) objR, dVarF, 48);
            Object objR2 = dVarF.R();
            if (objR2 == companion.a()) {
                objR2 = vn3.k(EmptyCoroutineContext.a, dVarF);
                dVarF.L(objR2);
            }
            ta2 ta2Var = (ta2) objR2;
            boolean zX = dVarF.x(view) | dVarF.x(f43Var);
            Object objR3 = dVarF.R();
            if (zX || objR3 == companion.a()) {
                i3 = 256;
                ModalBottomSheetDialogWrapper modalBottomSheetDialogWrapper = new ModalBottomSheetDialogWrapper(function0, vx7Var2, j, view, layoutDirection2, f43Var, uuid, animatable, ta2Var, null);
                layoutDirection = layoutDirection2;
                z = true;
                modalBottomSheetDialogWrapper.m(fVarE, ko1.c(-1051373467, true, new a(q6cVarR)));
                dVarF.L(modalBottomSheetDialogWrapper);
                obj = modalBottomSheetDialogWrapper;
            } else {
                layoutDirection = layoutDirection2;
                z = true;
                i3 = 256;
                obj = objR3;
            }
            final ModalBottomSheetDialogWrapper modalBottomSheetDialogWrapper2 = (ModalBottomSheetDialogWrapper) obj;
            boolean zT = dVarF.T(modalBottomSheetDialogWrapper2);
            Object objR4 = dVarF.R();
            if (zT || objR4 == companion.a()) {
                objR4 = new Function1() { // from class: androidx.compose.material3.y0
                    public final Object invoke(Object obj2) {
                        return b1.j(modalBottomSheetDialogWrapper2, (kd3) obj2);
                    }
                };
                dVarF.L(objR4);
            }
            vn3.c(modalBottomSheetDialogWrapper2, (Function1) objR4, dVarF, 0);
            int i4 = i2;
            boolean zT2 = dVarF.T(modalBottomSheetDialogWrapper2) | ((i4 & 14) == 4 ? z : false) | ((i4 & 896) == i3 ? z : false) | ((i4 & 112) == 32 ? z : false) | dVarF.C(layoutDirection.ordinal());
            Object objR5 = dVarF.R();
            if (zT2 || objR5 == companion.a()) {
                objR5 = new Function0() { // from class: androidx.compose.material3.z0
                    public final Object invoke() {
                        return b1.g(modalBottomSheetDialogWrapper2, function0, vx7Var, j, layoutDirection);
                    }
                };
                dVarF.L(objR5);
            }
            vn3.i((Function0) objR5, dVarF, 0);
            if (e.k()) {
                e.n();
            }
        } else {
            dVarF.q();
        }
        s6b s6bVarH = dVarF.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2() { // from class: com.google.android.xx7
                public final Object invoke(Object obj2, Object obj3) {
                    return b1.h(function0, j, vx7Var, animatable, function2, i, (d) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Function2<d, Integer, Unit> f(q6c<? extends Function2<? super d, ? super Integer, Unit>> q6cVar) {
        return q6cVar.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final Unit g(ModalBottomSheetDialogWrapper modalBottomSheetDialogWrapper, Function0 function0, vx7 vx7Var, long j, LayoutDirection layoutDirection) throws NoWhenBranchMatchedException {
        modalBottomSheetDialogWrapper.p(function0, vx7Var, j, layoutDirection);
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(Function0 function0, long j, vx7 vx7Var, Animatable animatable, Function2 function2, int i, d dVar, int i2) {
        e(function0, j, vx7Var, animatable, function2, dVar, saa.a(i | 1));
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UUID i() {
        return UUID.randomUUID();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jd3 j(ModalBottomSheetDialogWrapper modalBottomSheetDialogWrapper, kd3 kd3Var) {
        modalBottomSheetDialogWrapper.show();
        return new b(modalBottomSheetDialogWrapper);
    }

    public static final boolean l(long j) {
        return !ei1.r(j, ei1.INSTANCE.h()) && ((double) ki1.i(j)) <= 0.5d;
    }

    public static final boolean m(View view) {
        ViewGroup.LayoutParams layoutParams = view.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        return (layoutParams2 == null || (layoutParams2.flags & 8192) == 0) ? false : true;
    }
}
