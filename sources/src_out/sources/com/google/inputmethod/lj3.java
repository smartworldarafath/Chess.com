package com.google.inputmethod;

import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.e;
import androidx.compose.ui.graphics.h;
import androidx.compose.ui.graphics.n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ/\u0010\u0015\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J/\u0010\u001a\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ-\u0010\u001e\u001a\u00020\u001d*\u00020\u001c2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0014¢\u0006\u0004\b\u001e\u0010\u001fJQ\u0010%\u001a\u00020\u001d*\u00020\u001c2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010 \u001a\u00020\u00122\b\u0010\"\u001a\u0004\u0018\u00010!2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010$\u001a\u00020#H\u0014¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010'\u001a\u0004\b(\u0010)R\u0014\u0010-\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0018\u00103\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102¨\u00064"}, d2 = {"Lcom/google/android/lj3;", "Lcom/google/android/tkb;", "Lcom/google/android/okb;", "shadow", "Landroidx/compose/ui/graphics/n;", "outline", "<init>", "(Lcom/google/android/okb;Landroidx/compose/ui/graphics/n;)V", "Lcom/google/android/ml5;", "shadowBitmap", "Lcom/google/android/qu0;", "brush", "i", "(Lcom/google/android/ml5;Lcom/google/android/qu0;)Lcom/google/android/qu0;", "Lcom/google/android/tsb;", "size", "Landroidx/compose/ui/graphics/Path;", "path", "", "radius", "spread", "f", "(JLandroidx/compose/ui/graphics/Path;FF)Lcom/google/android/ml5;", "shadowRadius", "Lcom/google/android/aa2;", "cornerRadius", "g", "(JFFJ)Lcom/google/android/ml5;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "", "a", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JJLandroidx/compose/ui/graphics/Path;)V", "alpha", "Landroidx/compose/ui/graphics/h;", "colorFilter", "Landroidx/compose/ui/graphics/e;", "blendMode", "d", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JJLandroidx/compose/ui/graphics/Path;FLandroidx/compose/ui/graphics/h;Lcom/google/android/qu0;I)V", "Lcom/google/android/okb;", "h", "()Lcom/google/android/okb;", "Lcom/google/android/q09;", "j", "Lcom/google/android/q09;", "paint", "k", "Lcom/google/android/ml5;", "Lcom/google/android/nr1;", "l", "Lcom/google/android/nr1;", "compositeShader", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class lj3 extends tkb {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final Shadow shadow;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final q09 paint;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private ml5 shadowBitmap;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private CompositeShaderBrush compositeShader;

    public lj3(Shadow shadow, n nVar) {
        super(nVar);
        this.shadow = shadow;
        this.paint = dm.a();
    }

    private final ml5 f(long size, Path path, float radius, float spread) {
        float f = 2;
        float f2 = (radius * f) + (f * spread);
        ml5 ml5VarB = ol5.b((int) Math.ceil(Float.intBitsToFloat((int) (size >> 32)) + f2), (int) Math.ceil(Float.intBitsToFloat((int) (size & 4294967295L)) + f2), nl5.INSTANCE.a(), false, null, 24, null);
        w41 w41VarA = t51.a(ml5VarB);
        if (spread <= 0.0f) {
            bq0.b(this.paint, 0L, 0, radius > 0.0f ? cq0.a(radius) : null, 0, 11, null);
            w41VarA.c(radius, radius);
            w41VarA.y(path, this.paint);
            return ml5VarB;
        }
        float f3 = radius + spread;
        w41VarA.c(f3, f3);
        w41VarA.y(path, bq0.b(this.paint, 0L, 0, radius > 0.0f ? cq0.a(radius) : null, 0, 11, null));
        q09 q09VarB = bq0.b(this.paint, 0L, 0, radius > 0.0f ? cq0.a(radius) : null, w09.INSTANCE.b(), 3, null);
        q09VarB.z(2.0f * spread);
        Unit unit = Unit.a;
        w41VarA.y(path, q09VarB);
        return ml5VarB;
    }

    private final ml5 g(long size, float shadowRadius, float spread, long cornerRadius) {
        float f = 2;
        float f2 = (shadowRadius * f) + (f * spread);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (size >> 32)) + f2;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (size & 4294967295L)) + f2;
        ml5 ml5VarB = ol5.b((int) Math.ceil(fIntBitsToFloat), (int) Math.ceil(fIntBitsToFloat2), nl5.INSTANCE.a(), false, null, 24, null);
        t51.a(ml5VarB).A(shadowRadius, shadowRadius, fIntBitsToFloat - shadowRadius, fIntBitsToFloat2 - shadowRadius, Float.intBitsToFloat((int) (cornerRadius >> 32)), Float.intBitsToFloat((int) (cornerRadius & 4294967295L)), bq0.b(this.paint, 0L, 0, shadowRadius > 0.0f ? cq0.a(shadowRadius) : null, 0, 11, null));
        return ml5VarB;
    }

    private final qu0 i(ml5 shadowBitmap, qu0 brush) {
        CompositeShaderBrush compositeShaderBrush = this.compositeShader;
        if (compositeShaderBrush != null && Intrinsics.e(compositeShaderBrush.getSrcBrush(), brush)) {
            return compositeShaderBrush;
        }
        qu0.Companion companion = qu0.INSTANCE;
        jkb jkbVarA = ru0.a(mkb.c(shadowBitmap, 0, 0, 6, null));
        if (brush instanceof jkb) {
            brush = ru0.a(((jkb) brush).b(tsb.d((((long) Float.floatToRawIntBits(shadowBitmap.getWidth())) << 32) | (((long) Float.floatToRawIntBits(shadowBitmap.getHeight())) & 4294967295L))));
        }
        qu0 qu0VarA = companion.a(jkbVarA, brush, e.INSTANCE.z());
        Intrinsics.h(qu0VarA, "null cannot be cast to non-null type androidx.compose.ui.graphics.CompositeShaderBrush");
        CompositeShaderBrush compositeShaderBrush2 = (CompositeShaderBrush) qu0VarA;
        this.compositeShader = compositeShaderBrush2;
        return compositeShaderBrush2;
    }

    @Override // com.google.inputmethod.tkb
    protected void a(DrawScope drawScope, long j, long j2, Path path) {
        lj3 lj3Var;
        ml5 ml5VarG;
        float fX2 = drawScope.x2(this.shadow.getRadius());
        float fX3 = drawScope.x2(this.shadow.getSpread());
        if (path != null) {
            lj3Var = this;
            ml5VarG = lj3Var.f(j, path, fX2, fX3);
        } else {
            lj3Var = this;
            ml5VarG = lj3Var.g(j, fX2, fX3, j2);
        }
        lj3Var.shadowBitmap = ml5VarG;
    }

    @Override // com.google.inputmethod.tkb
    protected void d(DrawScope drawScope, long j, long j2, Path path, float f, h hVar, qu0 qu0Var, int i) {
        ml5 ml5Var = this.shadowBitmap;
        if (ml5Var != null) {
            float f2 = -(drawScope.x2(this.shadow.getRadius()) + drawScope.x2(this.shadow.getSpread()));
            if (qu0Var == null || hVar != null) {
                DrawScope.c2(drawScope, ml5Var, rn8.e((4294967295L & ((long) Float.floatToRawIntBits(f2))) | (Float.floatToRawIntBits(f2) << 32)), f, null, hVar, i, 8, null);
                return;
            }
            qu0 qu0VarI = i(ml5Var, qu0Var);
            drawScope.getDrawContext().getTransform().c(f2, f2);
            try {
                float width = ml5Var.getWidth();
                DrawScope.U0(drawScope, qu0VarI, 0L, tsb.d((((long) Float.floatToRawIntBits(ml5Var.getHeight())) & 4294967295L) | (Float.floatToRawIntBits(width) << 32)), f, null, null, i, 50, null);
            } finally {
                float f3 = -f2;
                drawScope.getDrawContext().getTransform().c(f3, f3);
            }
        }
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final Shadow getShadow() {
        return this.shadow;
    }
}
