package com.google.inputmethod;

import android.graphics.Canvas;
import android.graphics.Point;
import android.view.View;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.a;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/google/android/tp1;", "Landroid/view/View$DragShadowBuilder;", "Lcom/google/android/f43;", "density", "Lcom/google/android/tsb;", "decorationSize", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "", "drawDragDecoration", "<init>", "(Lcom/google/android/f43;JLkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroid/graphics/Point;", "outShadowSize", "outShadowTouchPoint", "onProvideShadowMetrics", "(Landroid/graphics/Point;Landroid/graphics/Point;)V", "Landroid/graphics/Canvas;", "canvas", "onDrawShadow", "(Landroid/graphics/Canvas;)V", "a", "Lcom/google/android/f43;", "b", "J", "c", "Lkotlin/jvm/functions/Function1;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class tp1 extends View.DragShadowBuilder {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final f43 density;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final long decorationSize;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Function1<DrawScope, Unit> drawDragDecoration;

    public /* synthetic */ tp1(f43 f43Var, long j, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(f43Var, j, function1);
    }

    @Override // android.view.View.DragShadowBuilder
    public void onDrawShadow(Canvas canvas) {
        a aVar = new a();
        f43 f43Var = this.density;
        long j = this.decorationSize;
        LayoutDirection layoutDirection = LayoutDirection.Ltr;
        w41 w41VarB = xi.b(canvas);
        Function1<DrawScope, Unit> function1 = this.drawDragDecoration;
        a.DrawParams drawParams = aVar.getDrawParams();
        f43 density = drawParams.getDensity();
        LayoutDirection layoutDirection2 = drawParams.getLayoutDirection();
        w41 canvas2 = drawParams.getCanvas();
        long size = drawParams.getSize();
        a.DrawParams drawParams2 = aVar.getDrawParams();
        drawParams2.j(f43Var);
        drawParams2.k(layoutDirection);
        drawParams2.i(w41VarB);
        drawParams2.l(j);
        w41VarB.v();
        function1.invoke(aVar);
        w41VarB.o();
        a.DrawParams drawParams3 = aVar.getDrawParams();
        drawParams3.j(density);
        drawParams3.k(layoutDirection2);
        drawParams3.i(canvas2);
        drawParams3.l(size);
    }

    @Override // android.view.View.DragShadowBuilder
    public void onProvideShadowMetrics(Point outShadowSize, Point outShadowTouchPoint) {
        f43 f43Var = this.density;
        outShadowSize.set(f43Var.O1(f43Var.P0(Float.intBitsToFloat((int) (this.decorationSize >> 32)))), f43Var.O1(f43Var.P0(Float.intBitsToFloat((int) (this.decorationSize & 4294967295L)))));
        outShadowTouchPoint.set(outShadowSize.x / 2, outShadowSize.y / 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private tp1(f43 f43Var, long j, Function1<? super DrawScope, Unit> function1) {
        this.density = f43Var;
        this.decorationSize = j;
        this.drawDragDecoration = function1;
    }
}
