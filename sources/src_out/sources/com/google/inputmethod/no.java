package com.google.inputmethod;

import android.view.View;
import androidx.compose.p001foundation.layout.BoxScopeInstance;
import androidx.compose.p001foundation.layout.j;
import androidx.compose.p001foundation.text.contextmenu.internal.AndroidTextContextMenuToolbarProvider;
import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import androidx.compose.p004runtime.p0;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.b;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a=\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a5\u0010\u000f\u001a\u00020\u000e2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00022\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0001¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0012²\u0006\u0010\u0010\u0011\u001a\u0004\u0018\u00010\f8\n@\nX\u008a\u008e\u0002"}, d2 = {"Landroidx/compose/ui/b;", "modifier", "Lkotlin/Function0;", "", "content", "h", "(Landroidx/compose/ui/b;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/d;II)V", "Lkotlin/Function1;", "Lcom/google/android/bpc;", "callbackInjector", "g", "(Landroidx/compose/ui/b;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/d;II)V", "Lcom/google/android/kn6;", "coordinatesProvider", "Lcom/google/android/mrc;", "p", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/d;II)Lcom/google/android/mrc;", "layoutCoordinates", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class no {

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/google/android/no$a", "Lcom/google/android/jd3;", "", "dispose", "()V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements jd3 {
        final /* synthetic */ AndroidTextContextMenuToolbarProvider a;

        public a(AndroidTextContextMenuToolbarProvider androidTextContextMenuToolbarProvider) {
            this.a = androidTextContextMenuToolbarProvider;
        }

        @Override // com.google.inputmethod.jd3
        public void dispose() {
            this.a.w();
        }
    }

    public static final void g(final b bVar, final Function1<? super bpc, ? extends bpc> function1, final Function2<? super d, ? super Integer, Unit> function2, d dVar, final int i, final int i2) {
        int i3;
        d dVarF = dVar.F(771959668);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (dVarF.x(bVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= dVarF.T(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= dVarF.T(function2) ? 256 : 128;
        }
        if (dVarF.g((i3 & 147) != 146, i3 & 1)) {
            if (i4 != 0) {
                bVar = b.INSTANCE;
            }
            if (e.k()) {
                e.o(771959668, i3, -1, "androidx.compose.foundation.text.contextmenu.internal.ProvidePlatformTextContextMenuToolbar (AndroidTextContextMenuToolbarProvider.android.kt:84)");
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
                objR2 = new Function0() { // from class: com.google.android.ko
                    public final Object invoke() {
                        return no.l(o58Var);
                    }
                };
                dVarF.L(objR2);
            }
            fs1.c(prc.f().d(p((Function0) objR2, function1, dVarF, (i3 & 112) | 6, 0)), ko1.e(-291176396, true, new Function2() { // from class: com.google.android.lo
                public final Object invoke(Object obj, Object obj2) {
                    return no.m(bVar, o58Var, function2, (d) obj, ((Integer) obj2).intValue());
                }
            }, dVarF, 54), dVarF, os9.i | 48);
            if (e.k()) {
                e.n();
            }
        } else {
            dVarF.q();
        }
        final b bVar2 = bVar;
        s6b s6bVarH = dVarF.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2() { // from class: com.google.android.mo
                public final Object invoke(Object obj, Object obj2) {
                    return no.o(bVar2, function1, function2, i, i2, (d) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void h(final b bVar, Function2<? super d, ? super Integer, Unit> function2, d dVar, final int i, final int i2) {
        int i3;
        final Function2<? super d, ? super Integer, Unit> function3;
        d dVarF = dVar.F(2064964257);
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
                e.o(2064964257, i3, -1, "androidx.compose.foundation.text.contextmenu.internal.ProvidePlatformTextContextMenuToolbar (AndroidTextContextMenuToolbarProvider.android.kt:67)");
            }
            int i5 = (i3 & 14) | 48 | ((i3 << 3) & 896);
            b bVar2 = bVar;
            function3 = function2;
            g(bVar2, null, function3, dVarF, i5, 0);
            if (e.k()) {
                e.n();
            }
            bVar = bVar2;
        } else {
            function3 = function2;
            dVarF.q();
        }
        s6b s6bVarH = dVarF.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2() { // from class: com.google.android.io
                public final Object invoke(Object obj, Object obj2) {
                    return no.i(bVar, function3, i, i2, (d) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(b bVar, Function2 function2, int i, int i2, d dVar, int i3) {
        h(bVar, function2, dVar, saa.a(i | 1), i2);
        return Unit.a;
    }

    private static final kn6 j(o58<kn6> o58Var) {
        return o58Var.getValue();
    }

    private static final void k(o58<kn6> o58Var, kn6 kn6Var) {
        o58Var.setValue(kn6Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public static final kn6 l(o58 o58Var) throws KotlinNothingValueException {
        kn6 kn6VarJ = j(o58Var);
        if (kn6VarJ != null) {
            return kn6VarJ;
        }
        cx5.d("Required value was null.");
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(b bVar, final o58 o58Var, Function2 function2, d dVar, int i) {
        if (dVar.g((i & 3) != 2, i & 1)) {
            if (e.k()) {
                e.o(-291176396, i, -1, "androidx.compose.foundation.text.contextmenu.internal.ProvidePlatformTextContextMenuToolbar.<anonymous> (AndroidTextContextMenuToolbarProvider.android.kt:98)");
            }
            Object objR = dVar.R();
            if (objR == d.INSTANCE.a()) {
                objR = new Function1() { // from class: com.google.android.ho
                    public final Object invoke(Object obj) {
                        return no.n(o58Var, (kn6) obj);
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
    public static final Unit n(o58 o58Var, kn6 kn6Var) {
        k(o58Var, kn6Var);
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o(b bVar, Function1 function1, Function2 function2, int i, int i2, d dVar, int i3) {
        g(bVar, function1, function2, dVar, saa.a(i | 1), i2);
        return Unit.a;
    }

    public static final mrc p(Function0<? extends kn6> function0, Function1<? super bpc, ? extends bpc> function1, d dVar, int i, int i2) {
        if ((i2 & 2) != 0) {
            function1 = null;
        }
        if (e.k()) {
            e.o(549805508, i, -1, "androidx.compose.foundation.text.contextmenu.internal.platformTextContextMenuToolbarProvider (AndroidTextContextMenuToolbarProvider.android.kt:111)");
        }
        View view = (View) dVar.v(AndroidCompositionLocals_androidKt.g());
        boolean zX = dVar.x(view);
        Object objR = dVar.R();
        if (zX || objR == d.INSTANCE.a()) {
            objR = new AndroidTextContextMenuToolbarProvider(view, function1, function0);
            dVar.L(objR);
        }
        final AndroidTextContextMenuToolbarProvider androidTextContextMenuToolbarProvider = (AndroidTextContextMenuToolbarProvider) objR;
        boolean zT = dVar.T(androidTextContextMenuToolbarProvider);
        Object objR2 = dVar.R();
        if (zT || objR2 == d.INSTANCE.a()) {
            objR2 = new Function1() { // from class: com.google.android.jo
                public final Object invoke(Object obj) {
                    return no.q(androidTextContextMenuToolbarProvider, (kd3) obj);
                }
            };
            dVar.L(objR2);
        }
        vn3.c(androidTextContextMenuToolbarProvider, (Function1) objR2, dVar, 0);
        if (e.k()) {
            e.n();
        }
        return androidTextContextMenuToolbarProvider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jd3 q(AndroidTextContextMenuToolbarProvider androidTextContextMenuToolbarProvider, kd3 kd3Var) {
        androidTextContextMenuToolbarProvider.H();
        return new a(androidTextContextMenuToolbarProvider);
    }
}
