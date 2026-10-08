package com.google.inputmethod;

import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import androidx.compose.ui.graphics.h;
import androidx.compose.ui.graphics.vector.GroupComponent;
import androidx.compose.ui.graphics.vector.PathComponent;
import androidx.compose.ui.graphics.vector.VectorPainter;
import androidx.compose.ui.platform.CompositionLocalsKt;
import kotlin.Metadata;
import kotlin.Unit;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a#\u0010\n\u001a\u00020\t*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a'\u0010\u0010\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a!\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u001aA\u0010\u001f\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\t2\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001c\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u001e\u001a\u00020\u001dH\u0000¢\u0006\u0004\b\u001f\u0010 \u001a'\u0010%\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020\u00002\u0006\u0010$\u001a\u00020#H\u0000¢\u0006\u0004\b%\u0010&\u001a\u001b\u0010)\u001a\u00020#*\u00020#2\u0006\u0010(\u001a\u00020'H\u0000¢\u0006\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lcom/google/android/pp5;", "image", "Landroidx/compose/ui/graphics/vector/VectorPainter;", "g", "(Lcom/google/android/pp5;Landroidx/compose/runtime/d;I)Landroidx/compose/ui/graphics/vector/VectorPainter;", "Lcom/google/android/f43;", "Lcom/google/android/ff3;", "defaultWidth", "defaultHeight", "Lcom/google/android/tsb;", "e", "(Lcom/google/android/f43;FF)J", "defaultSize", "", "viewportWidth", "viewportHeight", "f", "(JFF)J", "Lcom/google/android/ei1;", "tintColor", "Landroidx/compose/ui/graphics/e;", "tintBlendMode", "Landroidx/compose/ui/graphics/h;", "b", "(JI)Landroidx/compose/ui/graphics/h;", "viewportSize", "", "name", "intrinsicColorFilter", "", "autoMirror", "a", "(Landroidx/compose/ui/graphics/vector/VectorPainter;JJLjava/lang/String;Landroidx/compose/ui/graphics/h;Z)Landroidx/compose/ui/graphics/vector/VectorPainter;", "density", "imageVector", "Landroidx/compose/ui/graphics/vector/GroupComponent;", "root", "d", "(Lcom/google/android/f43;Lcom/google/android/pp5;Landroidx/compose/ui/graphics/vector/GroupComponent;)Landroidx/compose/ui/graphics/vector/VectorPainter;", "Lcom/google/android/z2e;", "currentGroup", "c", "(Landroidx/compose/ui/graphics/vector/GroupComponent;Lcom/google/android/z2e;)Landroidx/compose/ui/graphics/vector/GroupComponent;", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class c3e {
    public static final VectorPainter a(VectorPainter vectorPainter, long j, long j2, String str, h hVar, boolean z) {
        vectorPainter.w(j);
        vectorPainter.s(z);
        vectorPainter.u(hVar);
        vectorPainter.x(j2);
        vectorPainter.v(str);
        return vectorPainter;
    }

    private static final h b(long j, int i) {
        if (j != 16) {
            return h.INSTANCE.b(j, i);
        }
        return null;
    }

    public static final GroupComponent c(GroupComponent groupComponent, z2e z2eVar) {
        int iQ = z2eVar.q();
        for (int i = 0; i < iQ; i++) {
            b3e b3eVarC = z2eVar.c(i);
            if (b3eVarC instanceof d3e) {
                PathComponent pathComponent = new PathComponent();
                d3e d3eVar = (d3e) b3eVarC;
                pathComponent.l(d3eVar.e());
                pathComponent.m(d3eVar.getPathFillType());
                pathComponent.k(d3eVar.getName());
                pathComponent.i(d3eVar.getFill());
                pathComponent.j(d3eVar.getFillAlpha());
                pathComponent.n(d3eVar.getStroke());
                pathComponent.o(d3eVar.getStrokeAlpha());
                pathComponent.s(d3eVar.getStrokeLineWidth());
                pathComponent.p(d3eVar.getStrokeLineCap());
                pathComponent.q(d3eVar.getStrokeLineJoin());
                pathComponent.r(d3eVar.getStrokeLineMiter());
                pathComponent.v(d3eVar.getTrimPathStart());
                pathComponent.t(d3eVar.getTrimPathEnd());
                pathComponent.u(d3eVar.getTrimPathOffset());
                groupComponent.i(i, pathComponent);
            } else if (b3eVarC instanceof z2e) {
                GroupComponent groupComponent2 = new GroupComponent();
                z2e z2eVar2 = (z2e) b3eVarC;
                groupComponent2.p(z2eVar2.getName());
                groupComponent2.s(z2eVar2.getRotation());
                groupComponent2.t(z2eVar2.getScaleX());
                groupComponent2.u(z2eVar2.getScaleY());
                groupComponent2.v(z2eVar2.getTranslationX());
                groupComponent2.w(z2eVar2.getTranslationY());
                groupComponent2.q(z2eVar2.getPivotX());
                groupComponent2.r(z2eVar2.getPivotY());
                groupComponent2.o(z2eVar2.d());
                c(groupComponent2, z2eVar2);
                groupComponent.i(i, groupComponent2);
            }
        }
        return groupComponent;
    }

    public static final VectorPainter d(f43 f43Var, pp5 pp5Var, GroupComponent groupComponent) {
        long jE = e(f43Var, pp5Var.getDefaultWidth(), pp5Var.getDefaultHeight());
        return a(new VectorPainter(groupComponent), jE, f(jE, pp5Var.getViewportWidth(), pp5Var.getViewportHeight()), pp5Var.getName(), b(pp5Var.getTintColor(), pp5Var.getTintBlendMode()), pp5Var.getAutoMirror());
    }

    private static final long e(f43 f43Var, float f, float f2) {
        float fX2 = f43Var.x2(f);
        float fX3 = f43Var.x2(f2);
        return tsb.d((((long) Float.floatToRawIntBits(fX2)) << 32) | (((long) Float.floatToRawIntBits(fX3)) & 4294967295L));
    }

    private static final long f(long j, float f, float f2) {
        if (Float.isNaN(f)) {
            f = Float.intBitsToFloat((int) (j >> 32));
        }
        if (Float.isNaN(f2)) {
            f2 = Float.intBitsToFloat((int) (j & 4294967295L));
        }
        return tsb.d((((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L));
    }

    public static final VectorPainter g(pp5 pp5Var, d dVar, int i) {
        if (e.k()) {
            e.o(1413834416, i, -1, "androidx.compose.ui.graphics.vector.rememberVectorPainter (VectorPainter.kt:169)");
        }
        f43 f43Var = (f43) dVar.v(CompositionLocalsKt.g());
        float genId = pp5Var.getGenId();
        boolean zD = dVar.D((((long) Float.floatToRawIntBits(f43Var.getDensity())) & 4294967295L) | (Float.floatToRawIntBits(genId) << 32));
        Object objR = dVar.R();
        if (zD || objR == d.INSTANCE.a()) {
            GroupComponent groupComponent = new GroupComponent();
            c(groupComponent, pp5Var.getRoot());
            Unit unit = Unit.a;
            objR = d(f43Var, pp5Var, groupComponent);
            dVar.L(objR);
        }
        VectorPainter vectorPainter = (VectorPainter) objR;
        if (e.k()) {
            e.n();
        }
        return vectorPainter;
    }
}
