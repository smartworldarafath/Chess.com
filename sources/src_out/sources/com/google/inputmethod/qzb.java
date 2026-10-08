package com.google.inputmethod;

import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.b;
import androidx.compose.ui.node.ComposeUiNode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/b;", "modifier", "", "a", "(Landroidx/compose/ui/b;Landroidx/compose/runtime/d;I)V", "foundation-layout"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class qzb {
    public static final void a(b bVar, d dVar, int i) {
        if (e.k()) {
            e.o(-72882467, i, -1, "androidx.compose.foundation.layout.Spacer (Spacer.kt:37)");
        }
        szb szbVar = szb.a;
        int iHashCode = Long.hashCode(pp1.b(dVar, 0));
        b bVarE = ComposedModifierKt.e(dVar, bVar);
        gs1 gs1VarJ = dVar.j();
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
        dud.i(dVarC, szbVar, companion.d());
        dud.i(dVarC, gs1VarJ, companion.f());
        dud.g(dVarC, companion.a());
        dud.i(dVarC, bVarE, companion.e());
        dud.i(dVarC, Integer.valueOf(iHashCode), companion.c());
        dVar.m();
        if (e.k()) {
            e.n();
        }
    }
}
