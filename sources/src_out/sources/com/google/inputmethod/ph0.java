package com.google.inputmethod;

import androidx.compose.p001foundation.layout.BoxScopeInstance;
import androidx.compose.p001foundation.layout.j;
import androidx.compose.p001foundation.text.contextmenu.provider.BasicTextContextMenuProvider;
import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import androidx.compose.p004runtime.p0;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.b;
import androidx.compose.ui.node.ComposeUiNode;
import com.google.android.ts4;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a[\u0010\r\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022$\u0010\u000b\u001a \u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0004\u0012\u00020\n0\u00052\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\bH\u0001¢\u0006\u0004\b\r\u0010\u000e\u001a5\u0010\u0010\u001a\u00020\u000f2$\u0010\u000b\u001a \u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0004\u0012\u00020\n0\u0005H\u0001¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0013²\u0006\u0010\u0010\u0012\u001a\u0004\u0018\u00010\t8\n@\nX\u008a\u008e\u0002"}, d2 = {"Landroidx/compose/ui/b;", "modifier", "Lcom/google/android/ks9;", "Lcom/google/android/mrc;", "providableCompositionLocal", "Lkotlin/Function3;", "Lcom/google/android/rrc;", "Lcom/google/android/grc;", "Lkotlin/Function0;", "Lcom/google/android/kn6;", "", "contextMenu", "content", "f", "(Landroidx/compose/ui/b;Lcom/google/android/ks9;Lcom/google/android/ts4;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/d;I)V", "Landroidx/compose/foundation/text/contextmenu/provider/BasicTextContextMenuProvider;", "m", "(Lcom/google/android/ts4;Landroidx/compose/runtime/d;I)Landroidx/compose/foundation/text/contextmenu/provider/BasicTextContextMenuProvider;", "layoutCoordinates", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class ph0 {

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/google/android/ph0$a", "Lcom/google/android/jd3;", "", "dispose", "()V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements jd3 {
        final /* synthetic */ BasicTextContextMenuProvider a;

        public a(BasicTextContextMenuProvider basicTextContextMenuProvider) {
            this.a = basicTextContextMenuProvider;
        }

        @Override // com.google.inputmethod.jd3
        public void dispose() {
            this.a.h();
        }
    }

    public static final void f(final b bVar, final ks9<mrc> ks9Var, final ts4<? super rrc, ? super grc, ? super Function0<? extends kn6>, ? super d, ? super Integer, Unit> ts4Var, final Function2<? super d, ? super Integer, Unit> function2, d dVar, final int i) {
        int i2;
        d dVarF = dVar.F(-714464401);
        if ((i & 6) == 0) {
            i2 = (dVarF.x(bVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= dVarF.x(ks9Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= dVarF.T(ts4Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= dVarF.T(function2) ? 2048 : 1024;
        }
        if (dVarF.g((i2 & 1171) != 1170, i2 & 1)) {
            if (e.k()) {
                e.o(-714464401, i2, -1, "androidx.compose.foundation.text.contextmenu.provider.ProvideBasicTextContextMenu (BasicTextContextMenuProvider.kt:80)");
            }
            Object objR = dVarF.R();
            if (objR == d.INSTANCE.a()) {
                objR = p0.i(null, p0.k());
                dVarF.L(objR);
            }
            final o58 o58Var = (o58) objR;
            final BasicTextContextMenuProvider basicTextContextMenuProviderM = m(ts4Var, dVarF, (i2 >> 6) & 14);
            fs1.c(ks9Var.d(basicTextContextMenuProviderM), ko1.e(274270255, true, new Function2() { // from class: com.google.android.nh0
                public final Object invoke(Object obj, Object obj2) {
                    return ph0.i(bVar, o58Var, function2, basicTextContextMenuProviderM, (d) obj, ((Integer) obj2).intValue());
                }
            }, dVarF, 54), dVarF, os9.i | 48);
            if (e.k()) {
                e.n();
            }
        } else {
            dVarF.q();
        }
        s6b s6bVarH = dVarF.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2() { // from class: com.google.android.oh0
                public final Object invoke(Object obj, Object obj2) {
                    return ph0.l(bVar, ks9Var, ts4Var, function2, i, (d) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final kn6 g(o58<kn6> o58Var) {
        return o58Var.getValue();
    }

    private static final void h(o58<kn6> o58Var, kn6 kn6Var) {
        o58Var.setValue(kn6Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(b bVar, final o58 o58Var, Function2 function2, BasicTextContextMenuProvider basicTextContextMenuProvider, d dVar, int i) {
        if (dVar.g((i & 3) != 2, i & 1)) {
            if (e.k()) {
                e.o(274270255, i, -1, "androidx.compose.foundation.text.contextmenu.provider.ProvideBasicTextContextMenu.<anonymous> (BasicTextContextMenuProvider.kt:87)");
            }
            Object objR = dVar.R();
            d.Companion companion = d.INSTANCE;
            if (objR == companion.a()) {
                objR = new Function1() { // from class: com.google.android.kh0
                    public final Object invoke(Object obj) {
                        return ph0.j(o58Var, (kn6) obj);
                    }
                };
                dVar.L(objR);
            }
            b bVarA = xq8.a(bVar, (Function1) objR);
            ej7 ej7VarI = j.i(tc.INSTANCE.o(), true);
            int iHashCode = Long.hashCode(pp1.b(dVar, 0));
            gs1 gs1VarJ = dVar.j();
            b bVarE = ComposedModifierKt.e(dVar, bVarA);
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
            dud.i(dVarC, Integer.valueOf(iHashCode), companion2.c());
            dud.g(dVarC, companion2.a());
            dud.i(dVarC, bVarE, companion2.e());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.a;
            function2.invoke(dVar, 0);
            Object objR2 = dVar.R();
            if (objR2 == companion.a()) {
                objR2 = new Function0() { // from class: com.google.android.lh0
                    public final Object invoke() {
                        return ph0.k(o58Var);
                    }
                };
                dVar.L(objR2);
            }
            basicTextContextMenuProvider.d((Function0) objR2, dVar, 6);
            dVar.m();
            if (e.k()) {
                e.n();
            }
        } else {
            dVar.q();
        }
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(o58 o58Var, kn6 kn6Var) {
        h(o58Var, kn6Var);
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public static final kn6 k(o58 o58Var) throws KotlinNothingValueException {
        kn6 kn6VarG = g(o58Var);
        if (kn6VarG != null) {
            return kn6VarG;
        }
        cx5.d("Required value was null.");
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(b bVar, ks9 ks9Var, ts4 ts4Var, Function2 function2, int i, d dVar, int i2) {
        f(bVar, ks9Var, ts4Var, function2, dVar, saa.a(i | 1));
        return Unit.a;
    }

    public static final BasicTextContextMenuProvider m(ts4<? super rrc, ? super grc, ? super Function0<? extends kn6>, ? super d, ? super Integer, Unit> ts4Var, d dVar, int i) {
        if (e.k()) {
            e.o(100861460, i, -1, "androidx.compose.foundation.text.contextmenu.provider.basicTextContextMenuProvider (BasicTextContextMenuProvider.kt:106)");
        }
        boolean z = (((i & 14) ^ 6) > 4 && dVar.x(ts4Var)) || (i & 6) == 4;
        Object objR = dVar.R();
        if (z || objR == d.INSTANCE.a()) {
            objR = new BasicTextContextMenuProvider(ts4Var);
            dVar.L(objR);
        }
        final BasicTextContextMenuProvider basicTextContextMenuProvider = (BasicTextContextMenuProvider) objR;
        boolean zX = dVar.x(basicTextContextMenuProvider);
        Object objR2 = dVar.R();
        if (zX || objR2 == d.INSTANCE.a()) {
            objR2 = new Function1() { // from class: com.google.android.mh0
                public final Object invoke(Object obj) {
                    return ph0.n(basicTextContextMenuProvider, (kd3) obj);
                }
            };
            dVar.L(objR2);
        }
        vn3.c(basicTextContextMenuProvider, (Function1) objR2, dVar, 0);
        if (e.k()) {
            e.n();
        }
        return basicTextContextMenuProvider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jd3 n(BasicTextContextMenuProvider basicTextContextMenuProvider, kd3 kd3Var) {
        return new a(basicTextContextMenuProvider);
    }
}
