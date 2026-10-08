package com.google.inputmethod;

import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.graphics.n;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0019\u0010\b\u001a\u00020\u0003*\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "graphicsLayer", "", "a", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "Landroidx/compose/ui/graphics/n;", "outline", "b", "(Landroidx/compose/ui/graphics/layer/GraphicsLayer;Landroidx/compose/ui/graphics/n;)V", "ui-graphics"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class k05 {
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void a(DrawScope drawScope, GraphicsLayer graphicsLayer) throws NoWhenBranchMatchedException {
        graphicsLayer.h(drawScope.getDrawContext().b(), drawScope.getDrawContext().getGraphicsLayer());
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void b(GraphicsLayer graphicsLayer, n nVar) throws NoWhenBranchMatchedException {
        if (nVar instanceof n.b) {
            n.b bVar = (n.b) nVar;
            long jE = rn8.e((((long) Float.floatToRawIntBits(bVar.b().getLeft())) << 32) | (((long) Float.floatToRawIntBits(bVar.b().getTop())) & 4294967295L));
            gba gbaVarB = bVar.b();
            float right = gbaVarB.getRight() - gbaVarB.getLeft();
            gba gbaVarB2 = bVar.b();
            graphicsLayer.U(jE, tsb.d((((long) Float.floatToRawIntBits(gbaVarB2.getBottom() - gbaVarB2.getTop())) & 4294967295L) | (Float.floatToRawIntBits(right) << 32)));
            return;
        }
        if (nVar instanceof n.a) {
            graphicsLayer.R(((n.a) nVar).getPath());
            return;
        }
        if (!(nVar instanceof n.c)) {
            throw new NoWhenBranchMatchedException();
        }
        n.c cVar = (n.c) nVar;
        if (cVar.getRoundRectPath() != null) {
            graphicsLayer.R(cVar.getRoundRectPath());
            return;
        }
        dqa roundRect = cVar.getRoundRect();
        long jE2 = rn8.e((((long) Float.floatToRawIntBits(roundRect.getLeft())) << 32) | (((long) Float.floatToRawIntBits(roundRect.getTop())) & 4294967295L));
        float fJ = roundRect.j();
        graphicsLayer.Z(jE2, tsb.d((((long) Float.floatToRawIntBits(roundRect.d())) & 4294967295L) | (Float.floatToRawIntBits(fJ) << 32)), Float.intBitsToFloat((int) (roundRect.getBottomLeftCornerRadius() >> 32)));
    }
}
