package com.google.inputmethod;

import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.a;
import androidx.compose.ui.graphics.e;
import androidx.compose.ui.graphics.h;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007JA\u0010\u0012\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0010¢\u0006\u0004\b\u0012\u0010\u0013J+\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00042\b\b\u0002\u0010\u0016\u001a\u00020\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aR*\u0010\"\u001a\u0004\u0018\u00010\u001b8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\u0006\u0010\u001c\u0012\u0004\b!\u0010\u0003\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0018\u0010%\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010$R\u0018\u0010'\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010&R\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010(R\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u00100\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/¨\u00061"}, d2 = {"Lcom/google/android/rg3;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "", "a", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;)V", "Lcom/google/android/nl5;", "config", "Lcom/google/android/q16;", "size", "Lcom/google/android/f43;", "density", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Lkotlin/Function1;", "block", "b", "(IJLcom/google/android/f43;Landroidx/compose/ui/unit/LayoutDirection;Lkotlin/jvm/functions/Function1;)V", "target", "", "alpha", "Landroidx/compose/ui/graphics/h;", "colorFilter", "c", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FLandroidx/compose/ui/graphics/h;)V", "Lcom/google/android/ml5;", "Lcom/google/android/ml5;", "d", "()Lcom/google/android/ml5;", "setMCachedImage", "(Lcom/google/android/ml5;)V", "getMCachedImage$annotations", "mCachedImage", "Lcom/google/android/w41;", "Lcom/google/android/w41;", "cachedCanvas", "Lcom/google/android/f43;", "scopeDensity", "Landroidx/compose/ui/unit/LayoutDirection;", "e", "J", "f", "I", "Landroidx/compose/ui/graphics/drawscope/a;", "g", "Landroidx/compose/ui/graphics/drawscope/a;", "cacheScope", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class rg3 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private ml5 mCachedImage;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private w41 cachedCanvas;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private f43 scopeDensity;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private LayoutDirection layoutDirection = LayoutDirection.Ltr;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private long size = q16.INSTANCE.a();

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private int config = nl5.INSTANCE.b();

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final a cacheScope = new a();

    private final void a(DrawScope drawScope) {
        DrawScope.T0(drawScope, ei1.INSTANCE.a(), 0L, 0L, 0.0f, null, null, e.INSTANCE.a(), 62, null);
    }

    public final void b(int config, long size, f43 density, LayoutDirection layoutDirection, Function1<? super DrawScope, Unit> block) {
        this.scopeDensity = density;
        this.layoutDirection = layoutDirection;
        ml5 ml5VarB = this.mCachedImage;
        w41 w41VarA = this.cachedCanvas;
        if (ml5VarB == null || w41VarA == null || ((int) (size >> 32)) > ml5VarB.getWidth() || ((int) (size & 4294967295L)) > ml5VarB.getHeight() || !nl5.i(this.config, config)) {
            ml5VarB = ol5.b((int) (size >> 32), (int) (4294967295L & size), config, false, null, 24, null);
            w41VarA = t51.a(ml5VarB);
            this.mCachedImage = ml5VarB;
            this.cachedCanvas = w41VarA;
            this.config = config;
        }
        this.size = size;
        a aVar = this.cacheScope;
        long jE = r16.e(size);
        a.DrawParams drawParams = aVar.getDrawParams();
        f43 density2 = drawParams.getDensity();
        LayoutDirection layoutDirection2 = drawParams.getLayoutDirection();
        w41 canvas = drawParams.getCanvas();
        long size2 = drawParams.getSize();
        a.DrawParams drawParams2 = aVar.getDrawParams();
        drawParams2.j(density);
        drawParams2.k(layoutDirection);
        drawParams2.i(w41VarA);
        drawParams2.l(jE);
        w41VarA.v();
        a(aVar);
        block.invoke(aVar);
        w41VarA.o();
        a.DrawParams drawParams3 = aVar.getDrawParams();
        drawParams3.j(density2);
        drawParams3.k(layoutDirection2);
        drawParams3.i(canvas);
        drawParams3.l(size2);
        ml5VarB.a();
    }

    public final void c(DrawScope target, float alpha, h colorFilter) {
        ml5 ml5Var = this.mCachedImage;
        if (!(ml5Var != null)) {
            zw5.c("drawCachedImage must be invoked first before attempting to draw the result into another destination");
        }
        DrawScope.u2(target, ml5Var, 0L, this.size, 0L, 0L, alpha, null, colorFilter, 0, 0, 858, null);
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final ml5 getMCachedImage() {
        return this.mCachedImage;
    }
}
