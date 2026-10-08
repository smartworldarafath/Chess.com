package com.google.inputmethod;

import androidx.compose.p001foundation.layout.BoxScopeInstance;
import androidx.compose.p001foundation.layout.SizeKt;
import androidx.compose.p001foundation.layout.j;
import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.b;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.window.AndroidDialog_androidKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0017¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/google/android/qv2;", "Lcom/google/android/zg0;", "<init>", "()V", "Lcom/google/android/ah0;", "", "a", "(Lcom/google/android/ah0;Landroidx/compose/runtime/d;I)V", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class qv2 implements zg0 {
    public static final qv2 a = new qv2();

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class a implements Function2<d, Integer, Unit> {
        final /* synthetic */ ah0 a;

        a(ah0 ah0Var) {
            this.a = ah0Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(String str, nfb nfbVar) {
            SemanticsPropertiesKt.l0(nfbVar, str);
            return Unit.a;
        }

        public final void b(d dVar, int i) {
            if (!dVar.g((i & 3) != 2, i & 1)) {
                dVar.q();
                return;
            }
            if (e.k()) {
                e.o(1163527043, i, -1, "androidx.compose.material3.DefaultBasicAlertDialogOverride.BasicAlertDialog.<anonymous> (AlertDialog.kt:165)");
            }
            rbc.Companion companion = rbc.INSTANCE;
            final String strB = vbc.b(rbc.a(wz9.D), dVar, 0);
            b bVarX = SizeKt.x(this.a.getModifier(), pc.v(), 0.0f, pc.u(), 0.0f, 10, null);
            b.Companion companion2 = b.INSTANCE;
            boolean zX = dVar.x(strB);
            Object objR = dVar.R();
            if (zX || objR == d.INSTANCE.a()) {
                objR = new Function1() { // from class: com.google.android.pv2
                    public final Object invoke(Object obj) {
                        return qv2.a.c(strB, (nfb) obj);
                    }
                };
                dVar.L(objR);
            }
            b bVarThen = bVarX.then(afb.d(companion2, false, (Function1) objR, 1, null));
            ah0 ah0Var = this.a;
            ej7 ej7VarI = j.i(tc.INSTANCE.o(), true);
            int iA = pp1.a(dVar, 0);
            gs1 gs1VarJ = dVar.j();
            b bVarE = ComposedModifierKt.e(dVar, bVarThen);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> function0B = companion3.b();
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
            dud.i(dVarC, ej7VarI, companion3.d());
            dud.i(dVarC, gs1VarJ, companion3.f());
            Function2<ComposeUiNode, Integer, Unit> function2C = companion3.c();
            if (dVarC.getInserting() || !Intrinsics.e(dVarC.R(), Integer.valueOf(iA))) {
                dVarC.L(Integer.valueOf(iA));
                dVarC.e(Integer.valueOf(iA), function2C);
            }
            dud.i(dVarC, bVarE, companion3.e());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.a;
            ah0Var.a().invoke(dVar, 0);
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

    private qv2() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(qv2 qv2Var, ah0 ah0Var, int i, d dVar, int i2) {
        qv2Var.a(ah0Var, dVar, saa.a(i | 1));
        return Unit.a;
    }

    @Override // com.google.inputmethod.zg0
    public void a(final ah0 ah0Var, d dVar, final int i) {
        int i2;
        d dVarF = dVar.F(1565826668);
        if ((i & 6) == 0) {
            i2 = (dVarF.x(ah0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (dVarF.g((i2 & 3) != 2, i2 & 1)) {
            if (e.k()) {
                e.o(1565826668, i2, -1, "androidx.compose.material3.DefaultBasicAlertDialogOverride.BasicAlertDialog (AlertDialog.kt:163)");
            }
            AndroidDialog_androidKt.a(ah0Var.c(), ah0Var.getProperties(), ko1.e(1163527043, true, new a(ah0Var), dVarF, 54), dVarF, 384, 0);
            if (e.k()) {
                e.n();
            }
        } else {
            dVarF.q();
        }
        s6b s6bVarH = dVarF.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2() { // from class: com.google.android.ov2
                public final Object invoke(Object obj, Object obj2) {
                    return qv2.c(this.a, ah0Var, i, (d) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
