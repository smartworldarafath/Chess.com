package androidx.compose.p002material3;

import androidx.compose.p000animation.core.Animatable;
import androidx.compose.p001foundation.layout.SizeKt;
import androidx.compose.p001foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.p001foundation.layout.c;
import androidx.compose.p001foundation.layout.g1;
import androidx.compose.p001foundation.layout.o;
import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.b;
import androidx.compose.ui.graphics.l;
import androidx.compose.ui.graphics.m;
import androidx.compose.ui.node.ComposeUiNode;
import com.google.android.ps4;
import com.google.android.ta2;
import com.google.inputmethod.dud;
import com.google.inputmethod.ej7;
import com.google.inputmethod.gs1;
import com.google.inputmethod.ko1;
import com.google.inputmethod.pp1;
import com.google.inputmethod.qr;
import com.google.inputmethod.rbc;
import com.google.inputmethod.tc;
import com.google.inputmethod.vbc;
import com.google.inputmethod.vs0;
import com.google.inputmethod.wz9;
import com.google.inputmethod.xj1;
import com.google.inputmethod.yj1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class ModalBottomSheetKt$ModalBottomSheetContent$7 implements Function2<d, Integer, Unit> {
    final /* synthetic */ Function2<d, Integer, g1> a;
    final /* synthetic */ Animatable<Float, qr> b;
    final /* synthetic */ SheetState c;
    final /* synthetic */ Function2<d, Integer, Unit> d;
    final /* synthetic */ ps4<xj1, d, Integer, Unit> e;
    final /* synthetic */ Function0<Unit> f;
    final /* synthetic */ ta2 g;
    final /* synthetic */ boolean h;

    /* JADX WARN: Multi-variable type inference failed */
    ModalBottomSheetKt$ModalBottomSheetContent$7(Function2<? super d, ? super Integer, ? extends g1> function2, Animatable<Float, qr> animatable, SheetState sheetState, Function2<? super d, ? super Integer, Unit> function3, ps4<? super xj1, ? super d, ? super Integer, Unit> ps4Var, Function0<Unit> function0, ta2 ta2Var, boolean z) {
        this.a = function2;
        this.b = animatable;
        this.c = sheetState;
        this.d = function3;
        this.e = ps4Var;
        this.f = function0;
        this.g = ta2Var;
        this.h = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(Animatable animatable, m mVar) {
        float fFloatValue = ((Number) animatable.m()).floatValue();
        float fR = ModalBottomSheetKt.R(mVar, fFloatValue);
        float fS = ModalBottomSheetKt.S(mVar, fFloatValue);
        mVar.M(fS == 0.0f ? 1.0f : fR / fS);
        mVar.i0(ModalBottomSheetKt.c);
        return Unit.a;
    }

    public final void b(d dVar, int i) {
        if (!dVar.g((i & 3) != 2, i & 1)) {
            dVar.q();
            return;
        }
        if (e.k()) {
            e.o(728743275, i, -1, "androidx.compose.material3.ModalBottomSheetContent.<anonymous> (ModalBottomSheet.kt:359)");
        }
        b bVarD = WindowInsetsPaddingKt.d(SizeKt.h(b.INSTANCE, 0.0f, 1, null), (g1) this.a.invoke(dVar, 0));
        boolean zT = dVar.T(this.b);
        final Animatable<Float, qr> animatable = this.b;
        Object objR = dVar.R();
        if (zT || objR == d.INSTANCE.a()) {
            objR = new Function1() { // from class: androidx.compose.material3.r0
                public final Object invoke(Object obj) {
                    return ModalBottomSheetKt$ModalBottomSheetContent$7.c(animatable, (m) obj);
                }
            };
            dVar.L(objR);
        }
        b bVarC = vs0.c(l.c(bVarD, (Function1) objR), this.c);
        Function2<d, Integer, Unit> function2 = this.d;
        ps4<xj1, d, Integer, Unit> ps4Var = this.e;
        SheetState sheetState = this.c;
        Function0<Unit> function0 = this.f;
        ta2 ta2Var = this.g;
        boolean z = this.h;
        ej7 ej7VarA = o.a(c.a.k(), tc.INSTANCE.k(), dVar, 0);
        int iA = pp1.a(dVar, 0);
        gs1 gs1VarJ = dVar.j();
        b bVarE = ComposedModifierKt.e(dVar, bVarC);
        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> function0B = companion.b();
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
        dud.i(dVarC, ej7VarA, companion.d());
        dud.i(dVarC, gs1VarJ, companion.f());
        Function2<ComposeUiNode, Integer, Unit> function2C = companion.c();
        if (dVarC.getInserting() || !Intrinsics.e(dVarC.R(), Integer.valueOf(iA))) {
            dVarC.L(Integer.valueOf(iA));
            dVarC.e(Integer.valueOf(iA), function2C);
        }
        dud.i(dVarC, bVarE, companion.e());
        yj1 yj1Var = yj1.a;
        if (function2 != null) {
            dVar.y(1352934765);
            rbc.Companion companion2 = rbc.INSTANCE;
            m1.g(yj1Var, ko1.e(2000500644, true, new ModalBottomSheetKt$ModalBottomSheetContent$7$2$1(sheetState, function0, ta2Var, z, vbc.b(rbc.a(wz9.b), dVar, 0), vbc.b(rbc.a(wz9.d), dVar, 0), vbc.b(rbc.a(wz9.a), dVar, 0), function2), dVar, 54), dVar, 54);
            dVar.u();
        } else {
            dVar.y(1356009965);
            dVar.u();
        }
        ps4Var.invoke(yj1Var, dVar, 6);
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
