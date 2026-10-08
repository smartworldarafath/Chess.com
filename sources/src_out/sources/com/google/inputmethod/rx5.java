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
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ?\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J?\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ-\u0010 \u001a\u00020\u001f*\u00020\u001e2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0014¢\u0006\u0004\b \u0010!JQ\u0010'\u001a\u00020\u001f*\u00020\u001e2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\"\u001a\u00020\u00132\b\u0010$\u001a\u0004\u0018\u00010#2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010&\u001a\u00020%H\u0014¢\u0006\u0004\b'\u0010(R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010.\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0018\u00103\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102¨\u00064"}, d2 = {"Lcom/google/android/rx5;", "Lcom/google/android/tkb;", "Lcom/google/android/okb;", "shadow", "Landroidx/compose/ui/graphics/n;", "outline", "<init>", "(Lcom/google/android/okb;Landroidx/compose/ui/graphics/n;)V", "Lcom/google/android/jkb;", "shadowMask", "Lcom/google/android/qu0;", "brush", "Lcom/google/android/nr1;", "h", "(Lcom/google/android/jkb;Lcom/google/android/qu0;)Lcom/google/android/nr1;", "Lcom/google/android/tsb;", "size", "Landroidx/compose/ui/graphics/Path;", "path", "", "radius", "spread", "offsetX", "offsetY", "f", "(JLandroidx/compose/ui/graphics/Path;FFFF)Lcom/google/android/jkb;", "Lcom/google/android/aa2;", "cornerRadius", "g", "(JFFFFJ)Lcom/google/android/jkb;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "", "a", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JJLandroidx/compose/ui/graphics/Path;)V", "alpha", "Landroidx/compose/ui/graphics/h;", "colorFilter", "Landroidx/compose/ui/graphics/e;", "blendMode", "d", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JJLandroidx/compose/ui/graphics/Path;FLandroidx/compose/ui/graphics/h;Lcom/google/android/qu0;I)V", "i", "Lcom/google/android/okb;", "Lcom/google/android/q09;", "j", "Lcom/google/android/q09;", "paint", "k", "Lcom/google/android/jkb;", "l", "Lcom/google/android/nr1;", "compositeShader", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class rx5 extends tkb {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final Shadow shadow;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final q09 paint;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private jkb shadowMask;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private CompositeShaderBrush compositeShader;

    public rx5(Shadow shadow, n nVar) {
        super(nVar);
        this.shadow = shadow;
        this.paint = dm.a();
    }

    private final jkb f(long size, Path path, float radius, float spread, float offsetX, float offsetY) {
        ml5 ml5VarB;
        int iCeil = (int) Math.ceil(Float.intBitsToFloat((int) (size >> 32)));
        int iCeil2 = (int) Math.ceil(Float.intBitsToFloat((int) (size & 4294967295L)));
        if (spread > 0.0f) {
            gba bounds = path.getBounds();
            float right = bounds.getRight() - bounds.getLeft();
            float bottom = bounds.getBottom() - bounds.getTop();
            ml5VarB = ol5.b((int) Math.ceil(right), (int) Math.ceil(bottom), nl5.INSTANCE.a(), false, null, 24, null);
            w41 w41VarA = t51.a(ml5VarB);
            w41VarA.y(path, this.paint);
            w41.i(w41VarA, 0.0f, 0.0f, right, bottom, 0, 16, null);
            q09 q09VarB = bq0.b(this.paint, 0L, e.INSTANCE.a(), null, w09.INSTANCE.b(), 5, null);
            q09VarB.z(2.0f * spread);
            Unit unit = Unit.a;
            w41VarA.y(path, q09VarB);
        } else {
            ml5VarB = null;
        }
        int iCeil3 = ((int) Math.ceil(radius)) * 2;
        ml5 ml5VarB2 = ol5.b(iCeil + iCeil3, iCeil2 + iCeil3, nl5.INSTANCE.a(), false, null, 24, null);
        w41 w41VarA2 = t51.a(ml5VarB2);
        if (ml5VarB != null) {
            w41VarA2.g(0.0f, 0.0f, ml5VarB2.getWidth(), ml5VarB2.getHeight(), bq0.b(this.paint, 0L, 0, null, 0, 15, null));
            w41VarA2.f(ml5VarB, rn8.e((4294967295L & ((long) Float.floatToRawIntBits(offsetY))) | (((long) Float.floatToRawIntBits(offsetX)) << 32)), bq0.b(this.paint, 0L, e.INSTANCE.C(), radius > 0.0f ? cq0.a(radius) : null, 0, 9, null));
            return ru0.a(mkb.c(ml5VarB2, 0, 0, 6, null));
        }
        w41VarA2.v();
        w41VarA2.c(offsetX, offsetY);
        w41VarA2.y(path, bq0.b(this.paint, 0L, 0, radius > 0.0f ? cq0.a(radius) : null, 0, 11, null));
        w41VarA2.o();
        w41VarA2.g(0.0f, 0.0f, ml5VarB2.getWidth(), ml5VarB2.getHeight(), bq0.b(this.paint, 0L, e.INSTANCE.C(), null, 0, 13, null));
        return ru0.a(mkb.c(ml5VarB2, 0, 0, 6, null));
    }

    private final jkb g(long size, float radius, float spread, float offsetX, float offsetY, long cornerRadius) {
        int i = (int) (size >> 32);
        int i2 = (int) (size & 4294967295L);
        ml5 ml5VarB = ol5.b((int) Math.ceil(Float.intBitsToFloat(i)), (int) Math.ceil(Float.intBitsToFloat(i2)), nl5.INSTANCE.a(), false, null, 24, null);
        w41 w41VarA = t51.a(ml5VarB);
        float f = offsetX + spread;
        float f2 = offsetY + spread;
        w41VarA.A(f, f2, Math.max(f, (offsetX + Float.intBitsToFloat(i)) - spread), Math.max(f2, (offsetY + Float.intBitsToFloat(i2)) - spread), Float.intBitsToFloat((int) (cornerRadius >> 32)), Float.intBitsToFloat((int) (cornerRadius & 4294967295L)), bq0.b(this.paint, 0L, 0, radius > 0.0f ? cq0.a(radius) : null, 0, 11, null));
        w41VarA.g(0.0f, 0.0f, ml5VarB.getWidth(), ml5VarB.getHeight(), bq0.b(this.paint, 0L, e.INSTANCE.C(), null, 0, 13, null));
        return ru0.a(mkb.c(ml5VarB, 0, 0, 6, null));
    }

    private final CompositeShaderBrush h(jkb shadowMask, qu0 brush) {
        CompositeShaderBrush compositeShaderBrush = this.compositeShader;
        if (compositeShaderBrush != null && Intrinsics.e(compositeShaderBrush.getSrcBrush(), brush)) {
            return compositeShaderBrush;
        }
        CompositeShaderBrush compositeShaderBrush2 = new CompositeShaderBrush(ru0.b(shadowMask), ru0.b(brush), e.INSTANCE.z(), null);
        this.compositeShader = compositeShaderBrush2;
        return compositeShaderBrush2;
    }

    @Override // com.google.inputmethod.tkb
    protected void a(DrawScope drawScope, long j, long j2, Path path) {
        float fX2 = drawScope.x2(this.shadow.getRadius());
        float fX3 = drawScope.x2(this.shadow.getSpread());
        float fX4 = drawScope.x2(if3.f(this.shadow.getOffset()));
        float fX5 = drawScope.x2(if3.g(this.shadow.getOffset()));
        this.shadowMask = path != null ? f(j, path, fX2, fX3, fX4, fX5) : g(j, fX2, fX3, fX4, fX5, j2);
    }

    @Override // com.google.inputmethod.tkb
    protected void d(DrawScope drawScope, long j, long j2, Path path, float f, h hVar, qu0 qu0Var, int i) {
        jkb jkbVarH = this.shadowMask;
        if (jkbVarH != null) {
            if (this.shadow.getBrush() instanceof jkb) {
                jkbVarH = h(jkbVarH, this.shadow.getBrush());
            }
            jkb jkbVar = jkbVarH;
            if (path != null) {
                DrawScope.E0(drawScope, path, jkbVar, f, null, hVar, i, 8, null);
            } else if (aa2.c(j2, aa2.INSTANCE.a())) {
                DrawScope.U0(drawScope, jkbVar, 0L, 0L, f, null, hVar, i, 22, null);
            } else {
                DrawScope.J1(drawScope, jkbVar, 0L, 0L, j2, f, null, hVar, this.shadow.getBlendMode(), 38, null);
            }
        }
    }
}
