package com.google.inputmethod;

import androidx.compose.ui.graphics.m;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.c;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0004\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0011\u0010\u0005\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u0003\u001a'\u0010\n\u001a\u00020\u0001*\u00020\u00002\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/compose/ui/node/c;", "", "d", "(Landroidx/compose/ui/node/c;)V", "a", "c", "b", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/m;", "layerBlock", "e", "(Landroidx/compose/ui/node/c;Lkotlin/jvm/functions/Function1;)V", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class bo6 {
    public static final void a(c cVar) {
        y23.l(cVar, ni8.a(2)).v3();
    }

    public static final void b(c cVar) {
        y23.q(cVar).T0();
    }

    public static final void c(c cVar) {
        LayoutNode.I1(y23.q(cVar), false, 1, null);
    }

    public static final void d(c cVar) {
        y23.q(cVar).h();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public static final void e(c cVar, Function1<? super m, Unit> function1) throws KotlinNothingValueException {
        NodeCoordinator wrapped;
        if (cVar.getNode().getIsAttached() && (wrapped = y23.l(cVar, ni8.a(2)).getWrapped()) != null) {
            wrapped.g4(function1, true);
        }
    }
}
