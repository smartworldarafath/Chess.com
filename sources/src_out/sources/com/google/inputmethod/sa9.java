package com.google.inputmethod;

import androidx.compose.p001foundation.layout.BoxScopeInstance;
import androidx.compose.p001foundation.layout.j;
import androidx.compose.p001foundation.text.contextmenu.internal.DefaultTextContextMenuDropdownProvider_androidKt;
import androidx.compose.p001foundation.text.contextmenu.provider.BasicTextContextMenuProvider;
import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import androidx.compose.p004runtime.p0;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.b;
import androidx.compose.ui.node.ComposeUiNode;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a'\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a%\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0003¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b²\u0006\u0010\u0010\n\u001a\u0004\u0018\u00010\t8\n@\nX\u008a\u008e\u0002"}, d2 = {"Landroidx/compose/ui/b;", "modifier", "Lkotlin/Function0;", "", "content", "m", "(Landroidx/compose/ui/b;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/d;II)V", "f", "(Landroidx/compose/ui/b;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/d;I)V", "Lcom/google/android/kn6;", "layoutCoordinates", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class sa9 {
    private static final void f(final b bVar, final Function2<? super d, ? super Integer, Unit> function2, d dVar, final int i) {
        int i2;
        d dVarF = dVar.F(790527681);
        if ((i & 6) == 0) {
            i2 = (dVarF.x(bVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= dVarF.T(function2) ? 32 : 16;
        }
        if (dVarF.g((i2 & 19) != 18, i2 & 1)) {
            if (e.k()) {
                e.o(790527681, i2, -1, "androidx.compose.foundation.text.contextmenu.internal.ProvideBothDefaultProviders (PlatformDefaultTextContextMenuProviders.android.kt:58)");
            }
            Object objR = dVarF.R();
            d.Companion companion = d.INSTANCE;
            if (objR == companion.a()) {
                objR = p0.i(null, p0.k());
                dVarF.L(objR);
            }
            final o58 o58Var = (o58) objR;
            Object objR2 = dVarF.R();
            if (objR2 == companion.a()) {
                objR2 = new Function0() { // from class: com.google.android.oa9
                    public final Object invoke() {
                        return sa9.i(o58Var);
                    }
                };
                dVarF.L(objR2);
            }
            final Function0 function0 = (Function0) objR2;
            final BasicTextContextMenuProvider basicTextContextMenuProviderD = DefaultTextContextMenuDropdownProvider_androidKt.D(dVarF, 0);
            fs1.d(new os9[]{prc.f().d(no.p(function0, null, dVarF, 6, 2)), prc.e().d(basicTextContextMenuProviderD)}, ko1.e(1070596993, true, new Function2() { // from class: com.google.android.pa9
                public final Object invoke(Object obj, Object obj2) {
                    return sa9.j(bVar, o58Var, function2, basicTextContextMenuProviderD, function0, (d) obj, ((Integer) obj2).intValue());
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
            s6bVarH.a(new Function2() { // from class: com.google.android.qa9
                public final Object invoke(Object obj, Object obj2) {
                    return sa9.l(bVar, function2, i, (d) obj, ((Integer) obj2).intValue());
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
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public static final kn6 i(o58 o58Var) throws KotlinNothingValueException {
        kn6 kn6VarG = g(o58Var);
        if (kn6VarG != null) {
            return kn6VarG;
        }
        cx5.d("Required value was null.");
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(b bVar, final o58 o58Var, Function2 function2, BasicTextContextMenuProvider basicTextContextMenuProvider, Function0 function0, d dVar, int i) {
        if (dVar.g((i & 3) != 2, i & 1)) {
            if (e.k()) {
                e.o(1070596993, i, -1, "androidx.compose.foundation.text.contextmenu.internal.ProvideBothDefaultProviders.<anonymous> (PlatformDefaultTextContextMenuProviders.android.kt:76)");
            }
            Object objR = dVar.R();
            if (objR == d.INSTANCE.a()) {
                objR = new Function1() { // from class: com.google.android.ra9
                    public final Object invoke(Object obj) {
                        return sa9.k(o58Var, (kn6) obj);
                    }
                };
                dVar.L(objR);
            }
            b bVarA = xq8.a(bVar, (Function1) objR);
            ej7 ej7VarI = j.i(tc.INSTANCE.o(), true);
            int iHashCode = Long.hashCode(pp1.b(dVar, 0));
            gs1 gs1VarJ = dVar.j();
            b bVarE = ComposedModifierKt.e(dVar, bVarA);
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
            dud.i(dVarC, ej7VarI, companion.d());
            dud.i(dVarC, gs1VarJ, companion.f());
            dud.i(dVarC, Integer.valueOf(iHashCode), companion.c());
            dud.g(dVarC, companion.a());
            dud.i(dVarC, bVarE, companion.e());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.a;
            function2.invoke(dVar, 0);
            basicTextContextMenuProvider.d(function0, dVar, 6);
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
    public static final Unit k(o58 o58Var, kn6 kn6Var) {
        h(o58Var, kn6Var);
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(b bVar, Function2 function2, int i, d dVar, int i2) {
        f(bVar, function2, dVar, saa.a(i | 1));
        return Unit.a;
    }

    public static final void m(final b bVar, final Function2<? super d, ? super Integer, Unit> function2, d dVar, final int i, final int i2) {
        int i3;
        d dVarF = dVar.F(155925518);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (dVarF.x(bVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= dVarF.T(function2) ? 32 : 16;
        }
        if (dVarF.g((i3 & 19) != 18, i3 & 1)) {
            if (i4 != 0) {
                bVar = b.INSTANCE;
            }
            if (e.k()) {
                e.o(155925518, i3, -1, "androidx.compose.foundation.text.contextmenu.internal.ProvideDefaultPlatformTextContextMenuProviders (PlatformDefaultTextContextMenuProviders.android.kt:37)");
            }
            boolean z = dVarF.v(prc.e()) != null;
            boolean z2 = dVarF.v(prc.f()) != null;
            if (z && z2) {
                dVarF.y(-1977187922);
                ej7 ej7VarI = j.i(tc.INSTANCE.o(), true);
                int iHashCode = Long.hashCode(pp1.b(dVarF, 0));
                gs1 gs1VarJ = dVarF.j();
                b bVarE = ComposedModifierKt.e(dVarF, bVar);
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> function0B = companion.b();
                if (dVarF.G() == null) {
                    pp1.d();
                }
                dVarF.o();
                if (dVarF.getInserting()) {
                    dVarF.W(function0B);
                } else {
                    dVarF.k();
                }
                d dVarC = dud.c(dVarF);
                dud.i(dVarC, ej7VarI, companion.d());
                dud.i(dVarC, gs1VarJ, companion.f());
                dud.i(dVarC, Integer.valueOf(iHashCode), companion.c());
                dud.g(dVarC, companion.a());
                dud.i(dVarC, bVarE, companion.e());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.a;
                function2.invoke(dVarF, Integer.valueOf((i3 >> 3) & 14));
                dVarF.m();
                dVarF.u();
            } else if (z) {
                dVarF.y(-1976997706);
                no.h(bVar, function2, dVarF, i3 & 126, 0);
                dVarF.u();
            } else if (z2) {
                dVarF.y(-1976846922);
                DefaultTextContextMenuDropdownProvider_androidKt.z(bVar, function2, dVarF, i3 & 126);
                dVarF.u();
            } else {
                dVarF.y(-1976716505);
                f(bVar, function2, dVarF, i3 & 126);
                dVarF.u();
            }
            if (e.k()) {
                e.n();
            }
        } else {
            dVarF.q();
        }
        s6b s6bVarH = dVarF.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2() { // from class: com.google.android.na9
                public final Object invoke(Object obj, Object obj2) {
                    return sa9.n(bVar, function2, i, i2, (d) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n(b bVar, Function2 function2, int i, int i2, d dVar, int i3) {
        m(bVar, function2, dVar, saa.a(i | 1), i2);
        return Unit.a;
    }
}
