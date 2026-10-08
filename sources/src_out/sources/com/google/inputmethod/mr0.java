package com.google.inputmethod;

import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.draw.c;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.graphics.drawscope.a;
import androidx.compose.ui.graphics.e;
import androidx.compose.ui.graphics.h;
import androidx.compose.ui.graphics.n;
import androidx.compose.ui.graphics.q;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ3\u0010\u0014\u001a\u00020\u0013*\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015JC\u0010\u001b\u001a\u00020\u0013*\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0013\u0010\u001f\u001a\u00020\u001e*\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010%\u001a\u00020\u000f8\u0016X\u0096D¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010(\u001a\u00020\u000f8\u0016X\u0096D¢\u0006\f\n\u0004\b&\u0010\"\u001a\u0004\b'\u0010$R\u0018\u0010,\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R*\u00104\u001a\u00020\u00032\u0006\u0010-\u001a\u00020\u00038\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R*\u0010\f\u001a\u00020\u00052\u0006\u0010-\u001a\u00020\u00058\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R*\u0010A\u001a\u00020\u00072\u0006\u0010-\u001a\u00020\u00078\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\u0014\u0010E\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010D¨\u0006F"}, d2 = {"Lcom/google/android/mr0;", "Lcom/google/android/k33;", "Lcom/google/android/bfb;", "Lcom/google/android/ff3;", "widthParameter", "Lcom/google/android/qu0;", "brushParameter", "Lcom/google/android/xkb;", "shapeParameter", "<init>", "(FLcom/google/android/qu0;Lcom/google/android/xkb;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/draw/CacheDrawScope;", "brush", "Landroidx/compose/ui/graphics/n$a;", "outline", "", "fillArea", "", "strokeWidth", "Lcom/google/android/ah3;", "x3", "(Landroidx/compose/ui/draw/CacheDrawScope;Lcom/google/android/qu0;Landroidx/compose/ui/graphics/n$a;ZF)Lcom/google/android/ah3;", "Landroidx/compose/ui/graphics/n$c;", "Lcom/google/android/rn8;", "topLeft", "Lcom/google/android/tsb;", "borderSize", "A3", "(Landroidx/compose/ui/draw/CacheDrawScope;Lcom/google/android/qu0;Landroidx/compose/ui/graphics/n$c;JJZF)Lcom/google/android/ah3;", "Lcom/google/android/nfb;", "", "H0", "(Lcom/google/android/nfb;)V", "r", "Z", "Q2", "()Z", "shouldAutoInvalidate", "s", "o1", "isImportantForBounds", "Lcom/google/android/dr0;", "t", "Lcom/google/android/dr0;", "borderCache", "value", "u", "F", "getWidth-D9Ej5fM", "()F", "E3", "(F)V", "width", "v", "Lcom/google/android/qu0;", "getBrush", "()Lcom/google/android/qu0;", "Z1", "(Lcom/google/android/qu0;)V", "w", "Lcom/google/android/xkb;", "getShape", "()Lcom/google/android/xkb;", "R0", "(Lcom/google/android/xkb;)V", "shape", "Lcom/google/android/o01;", "x", "Lcom/google/android/o01;", "drawWithCacheModifierNode", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class mr0 extends k33 implements bfb {

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private final boolean shouldAutoInvalidate;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private final boolean isImportantForBounds;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private BorderCache borderCache;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private float width;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private qu0 brush;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private xkb shape;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final o01 drawWithCacheModifierNode;

    public /* synthetic */ mr0(float f, qu0 qu0Var, xkb xkbVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, qu0Var, xkbVar);
    }

    private final ah3 A3(CacheDrawScope cacheDrawScope, final qu0 qu0Var, n.c cVar, final long j, final long j2, final boolean z, final float f) {
        if (eqa.g(cVar.getRoundRect())) {
            final long topLeftCornerRadius = cVar.getRoundRect().getTopLeftCornerRadius();
            final float f2 = f / 2;
            final Stroke stroke = new Stroke(f, 0.0f, 0, 0, null, 30, null);
            return cacheDrawScope.j(new Function1() { // from class: com.google.android.ir0
                public final Object invoke(Object obj) {
                    return mr0.B3(z, qu0Var, topLeftCornerRadius, f2, f, j, j2, stroke, (fz1) obj);
                }
            });
        }
        if (this.borderCache == null) {
            this.borderCache = new BorderCache(null, null, null, null, 15, null);
        }
        BorderCache borderCache = this.borderCache;
        Intrinsics.g(borderCache);
        final Path pathL = gr0.l(borderCache.g(), cVar.getRoundRect(), f, z);
        return cacheDrawScope.j(new Function1() { // from class: com.google.android.jr0
            public final Object invoke(Object obj) {
                return mr0.C3(pathL, qu0Var, (fz1) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit B3(boolean z, qu0 qu0Var, long j, float f, float f2, long j2, long j3, Stroke stroke, fz1 fz1Var) {
        fz1Var.j1();
        if (z) {
            DrawScope.J1(fz1Var, qu0Var, 0L, 0L, j, 0.0f, null, null, 0, 246, null);
        } else if (Float.intBitsToFloat((int) (j >> 32)) < f) {
            float fIntBitsToFloat = Float.intBitsToFloat((int) (fz1Var.d() >> 32)) - f2;
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (fz1Var.d() & 4294967295L)) - f2;
            int iA = gf1.INSTANCE.a();
            vg3 drawContext = fz1Var.getDrawContext();
            long jD = drawContext.d();
            drawContext.b().v();
            try {
                drawContext.getTransform().b(f2, f2, fIntBitsToFloat, fIntBitsToFloat2, iA);
                DrawScope.J1(fz1Var, qu0Var, 0L, 0L, j, 0.0f, null, null, 0, 246, null);
            } finally {
                drawContext.b().o();
                drawContext.c(jD);
            }
        } else {
            DrawScope.J1(fz1Var, qu0Var, j2, j3, gr0.q(j, f), 0.0f, stroke, null, 0, 208, null);
        }
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit C3(Path path, qu0 qu0Var, fz1 fz1Var) {
        fz1Var.j1();
        DrawScope.E0(fz1Var, path, qu0Var, 0.0f, null, null, 0, 60, null);
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final ah3 D3(mr0 mr0Var, CacheDrawScope cacheDrawScope) throws NoWhenBranchMatchedException {
        if (cacheDrawScope.x2(mr0Var.width) < 0.0f || tsb.k(cacheDrawScope.d()) <= 0.0f) {
            return gr0.m(cacheDrawScope);
        }
        float f = 2;
        float fMin = Math.min(ff3.k(mr0Var.width, ff3.INSTANCE.a()) ? 1.0f : (float) Math.ceil(cacheDrawScope.x2(mr0Var.width)), (float) Math.ceil(tsb.k(cacheDrawScope.d()) / f));
        float f2 = fMin / f;
        long jE = rn8.e((((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (((long) Float.floatToRawIntBits(f2)) << 32));
        long jD = tsb.d((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (cacheDrawScope.d() & 4294967295L)) - fMin)) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (cacheDrawScope.d() >> 32)) - fMin)) << 32));
        boolean z = f * fMin > tsb.k(cacheDrawScope.d());
        n nVarMo5createOutlinePq9zytI = mr0Var.shape.mo5createOutlinePq9zytI(cacheDrawScope.d(), cacheDrawScope.getLayoutDirection(), cacheDrawScope);
        if (nVarMo5createOutlinePq9zytI instanceof n.a) {
            return mr0Var.x3(cacheDrawScope, mr0Var.brush, (n.a) nVarMo5createOutlinePq9zytI, z, fMin);
        }
        if (nVarMo5createOutlinePq9zytI instanceof n.c) {
            return mr0Var.A3(cacheDrawScope, mr0Var.brush, (n.c) nVarMo5createOutlinePq9zytI, jE, jD, z, fMin);
        }
        if (nVarMo5createOutlinePq9zytI instanceof n.b) {
            return gr0.o(cacheDrawScope, mr0Var.brush, jE, jD, z, fMin);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:41:0x015f  */
    private final ah3 x3(CacheDrawScope cacheDrawScope, final qu0 qu0Var, final n.a aVar, boolean z, float f) throws Throwable {
        int iB;
        h hVarC;
        boolean z2;
        gba gbaVar;
        BorderCache borderCache;
        Ref.ObjectRef objectRef;
        ml5 ml5Var;
        w41 w41Var;
        a aVar2;
        a aVar3;
        float f2;
        float f3;
        float f4;
        float f5;
        vg3 drawContext;
        long jD;
        vg3 vg3Var;
        long j;
        if (z) {
            return cacheDrawScope.j(new Function1() { // from class: com.google.android.kr0
                public final Object invoke(Object obj) {
                    return mr0.y3(aVar, qu0Var, (fz1) obj);
                }
            });
        }
        if (qu0Var instanceof SolidColor) {
            iB = nl5.INSTANCE.a();
            hVarC = h.Companion.c(h.INSTANCE, ei1.p(((SolidColor) qu0Var).getValue(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), 0, 2, null);
        } else {
            iB = nl5.INSTANCE.b();
            hVarC = null;
        }
        int i = iB;
        gba bounds = aVar.getPath().getBounds();
        if (this.borderCache == null) {
            this.borderCache = new BorderCache(null, null, null, null, 15, null);
        }
        BorderCache borderCache2 = this.borderCache;
        Intrinsics.g(borderCache2);
        Path pathG = borderCache2.g();
        pathG.reset();
        Path.x(pathG, bounds, null, 2, null);
        pathG.y(pathG, aVar.getPath(), q.INSTANCE.a());
        Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        final long jC = q16.c((((long) ((int) Math.ceil(bounds.getBottom() - bounds.getTop()))) & 4294967295L) | (((long) ((int) Math.ceil(bounds.getRight() - bounds.getLeft()))) << 32));
        BorderCache borderCache3 = this.borderCache;
        Intrinsics.g(borderCache3);
        ml5 ml5Var2 = borderCache3.imageBitmap;
        w41 w41Var2 = borderCache3.canvas;
        nl5 nl5VarF = ml5Var2 != null ? nl5.f(ml5Var2.b()) : null;
        if (!(nl5VarF == null ? false : nl5.i(nl5VarF.getValue(), nl5.INSTANCE.b()))) {
            z2 = nl5.h(i, ml5Var2 != null ? nl5.f(ml5Var2.b()) : null);
        }
        try {
            try {
                try {
                    try {
                        if (ml5Var2 != null && w41Var2 != null) {
                            gbaVar = bounds;
                            if (Float.intBitsToFloat((int) (cacheDrawScope.d() >> 32)) <= ml5Var2.getWidth() && Float.intBitsToFloat((int) (cacheDrawScope.d() & 4294967295L)) <= ml5Var2.getHeight() && z2) {
                                borderCache = borderCache3;
                                objectRef = objectRef2;
                                w41Var = w41Var2;
                                ml5Var = ml5Var2;
                            }
                            aVar2 = borderCache.canvasDrawScope;
                            if (aVar2 == null) {
                                aVar2 = new a();
                                borderCache.canvasDrawScope = aVar2;
                            }
                            aVar3 = aVar2;
                            long jE = r16.e(jC);
                            LayoutDirection layoutDirection = cacheDrawScope.getLayoutDirection();
                            a.DrawParams drawParams = aVar3.getDrawParams();
                            f43 density = drawParams.getDensity();
                            LayoutDirection layoutDirection2 = drawParams.getLayoutDirection();
                            w41 canvas = drawParams.getCanvas();
                            long size = drawParams.getSize();
                            a.DrawParams drawParams2 = aVar3.getDrawParams();
                            drawParams2.j(cacheDrawScope);
                            drawParams2.k(layoutDirection);
                            drawParams2.i(w41Var);
                            drawParams2.l(jE);
                            w41Var.v();
                            long jA = ei1.INSTANCE.a();
                            e.Companion companion = e.INSTANCE;
                            DrawScope.T0(aVar3, jA, 0L, jE, 0.0f, null, null, companion.a(), 58, null);
                            f2 = -gbaVar.getLeft();
                            f3 = -gbaVar.getTop();
                            aVar3.getDrawContext().getTransform().c(f2, f3);
                            ml5 ml5Var3 = ml5Var;
                            f5 = f3;
                            w41 w41Var3 = w41Var;
                            final h hVar = hVarC;
                            f4 = f2;
                            DrawScope.E0(aVar3, aVar.getPath(), qu0Var, 0.0f, new Stroke(f * 2, 0.0f, 0, 0, null, 30, null), null, 0, 52, null);
                            float f6 = 1;
                            float fIntBitsToFloat = (Float.intBitsToFloat((int) (aVar3.d() >> 32)) + f6) / Float.intBitsToFloat((int) (aVar3.d() >> 32));
                            float fIntBitsToFloat2 = (Float.intBitsToFloat((int) (aVar3.d() & 4294967295L)) + f6) / Float.intBitsToFloat((int) (aVar3.d() & 4294967295L));
                            long jA2 = aVar3.A();
                            drawContext = aVar3.getDrawContext();
                            jD = drawContext.d();
                            drawContext.b().v();
                            drawContext.getTransform().g(fIntBitsToFloat, fIntBitsToFloat2, jA2);
                            final Ref.ObjectRef objectRef3 = objectRef;
                            j = jD;
                            DrawScope.E0(aVar3, pathG, qu0Var, 0.0f, null, null, companion.a(), 28, null);
                            drawContext.b().o();
                            drawContext.c(j);
                            aVar3.getDrawContext().getTransform().c(-f4, -f5);
                            w41Var3.o();
                            a.DrawParams drawParams3 = aVar3.getDrawParams();
                            drawParams3.j(density);
                            drawParams3.k(layoutDirection2);
                            drawParams3.i(canvas);
                            drawParams3.l(size);
                            ml5Var3.a();
                            objectRef3.element = ml5Var3;
                            final gba gbaVar2 = gbaVar;
                            return cacheDrawScope.j(new Function1() { // from class: com.google.android.lr0
                                public final Object invoke(Object obj) {
                                    return mr0.z3(gbaVar2, objectRef3, jC, hVar, (fz1) obj);
                                }
                            });
                        }
                        gbaVar = bounds;
                        DrawScope.E0(aVar3, pathG, qu0Var, 0.0f, null, null, companion.a(), 28, null);
                        drawContext.b().o();
                        drawContext.c(j);
                        aVar3.getDrawContext().getTransform().c(-f4, -f5);
                        w41Var3.o();
                        a.DrawParams drawParams4 = aVar3.getDrawParams();
                        drawParams4.j(density);
                        drawParams4.k(layoutDirection2);
                        drawParams4.i(canvas);
                        drawParams4.l(size);
                        ml5Var3.a();
                        objectRef3.element = ml5Var3;
                        final gba gbaVar3 = gbaVar;
                        return cacheDrawScope.j(new Function1() { // from class: com.google.android.lr0
                            public final Object invoke(Object obj) {
                                return mr0.z3(gbaVar3, objectRef3, jC, hVar, (fz1) obj);
                            }
                        });
                    } catch (Throwable th) {
                        th = th;
                        vg3Var = drawContext;
                        vg3Var.b().o();
                        vg3Var.c(j);
                        throw th;
                    }
                    drawContext.getTransform().g(fIntBitsToFloat, fIntBitsToFloat2, jA2);
                    final Ref.ObjectRef objectRef4 = objectRef;
                    j = jD;
                } catch (Throwable th2) {
                    th = th2;
                    vg3Var = drawContext;
                    j = jD;
                }
                DrawScope.E0(aVar3, aVar.getPath(), qu0Var, 0.0f, new Stroke(f * 2, 0.0f, 0, 0, null, 30, null), null, 0, 52, null);
                float f7 = 1;
                float fIntBitsToFloat3 = (Float.intBitsToFloat((int) (aVar3.d() >> 32)) + f7) / Float.intBitsToFloat((int) (aVar3.d() >> 32));
                float fIntBitsToFloat4 = (Float.intBitsToFloat((int) (aVar3.d() & 4294967295L)) + f7) / Float.intBitsToFloat((int) (aVar3.d() & 4294967295L));
                long jA3 = aVar3.A();
                drawContext = aVar3.getDrawContext();
                jD = drawContext.d();
                drawContext.b().v();
            } catch (Throwable th3) {
                th = th3;
                aVar3.getDrawContext().getTransform().c(-f4, -f5);
                throw th;
            }
            ml5 ml5Var4 = ml5Var;
            f5 = f3;
            w41 w41Var4 = w41Var;
            final h hVar2 = hVarC;
            f4 = f2;
        } catch (Throwable th4) {
            th = th4;
            f4 = f2;
            f5 = f3;
        }
        borderCache = borderCache3;
        objectRef = objectRef2;
        ml5 ml5VarB = ol5.b((int) (jC >> 32), (int) (jC & 4294967295L), i, false, null, 24, null);
        borderCache.imageBitmap = ml5VarB;
        w41 w41VarA = t51.a(ml5VarB);
        borderCache.canvas = w41VarA;
        ml5Var = ml5VarB;
        w41Var = w41VarA;
        aVar2 = borderCache.canvasDrawScope;
        if (aVar2 == null) {
            aVar2 = new a();
            borderCache.canvasDrawScope = aVar2;
        }
        aVar3 = aVar2;
        long jE2 = r16.e(jC);
        LayoutDirection layoutDirection3 = cacheDrawScope.getLayoutDirection();
        a.DrawParams drawParams5 = aVar3.getDrawParams();
        f43 density2 = drawParams5.getDensity();
        LayoutDirection layoutDirection4 = drawParams5.getLayoutDirection();
        w41 canvas2 = drawParams5.getCanvas();
        long size2 = drawParams5.getSize();
        a.DrawParams drawParams6 = aVar3.getDrawParams();
        drawParams6.j(cacheDrawScope);
        drawParams6.k(layoutDirection3);
        drawParams6.i(w41Var);
        drawParams6.l(jE2);
        w41Var.v();
        long jA4 = ei1.INSTANCE.a();
        e.Companion companion2 = e.INSTANCE;
        DrawScope.T0(aVar3, jA4, 0L, jE2, 0.0f, null, null, companion2.a(), 58, null);
        f2 = -gbaVar.getLeft();
        f3 = -gbaVar.getTop();
        aVar3.getDrawContext().getTransform().c(f2, f3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit y3(n.a aVar, qu0 qu0Var, fz1 fz1Var) {
        fz1Var.j1();
        DrawScope.E0(fz1Var, aVar.getPath(), qu0Var, 0.0f, null, null, 0, 60, null);
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit z3(gba gbaVar, Ref.ObjectRef objectRef, long j, h hVar, fz1 fz1Var) {
        fz1Var.j1();
        float left = gbaVar.getLeft();
        float top = gbaVar.getTop();
        fz1Var.getDrawContext().getTransform().c(left, top);
        try {
            DrawScope.u2(fz1Var, (ml5) objectRef.element, 0L, j, 0L, 0L, 0.0f, null, hVar, 0, 0, 890, null);
            return Unit.a;
        } finally {
            fz1Var.getDrawContext().getTransform().c(-left, -top);
        }
    }

    public final void E3(float f) {
        if (ff3.k(this.width, f)) {
            return;
        }
        this.width = f;
        this.drawWithCacheModifierNode.b2();
    }

    @Override // com.google.inputmethod.bfb
    public void H0(nfb nfbVar) {
        SemanticsPropertiesKt.t0(nfbVar, this.shape);
    }

    @Override // androidx.compose.ui.b.c
    /* JADX INFO: renamed from: Q2, reason: from getter */
    public boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    public final void R0(xkb xkbVar) {
        if (Intrinsics.e(this.shape, xkbVar)) {
            return;
        }
        this.shape = xkbVar;
        this.drawWithCacheModifierNode.b2();
        cfb.d(this);
    }

    public final void Z1(qu0 qu0Var) {
        if (Intrinsics.e(this.brush, qu0Var)) {
            return;
        }
        this.brush = qu0Var;
        this.drawWithCacheModifierNode.b2();
    }

    @Override // com.google.inputmethod.bfb
    /* JADX INFO: renamed from: o1, reason: from getter */
    public boolean getIsImportantForBounds() {
        return this.isImportantForBounds;
    }

    private mr0(float f, qu0 qu0Var, xkb xkbVar) {
        this.width = f;
        this.brush = qu0Var;
        this.shape = xkbVar;
        this.drawWithCacheModifierNode = (o01) m3(c.a(new Function1() { // from class: com.google.android.hr0
            public final Object invoke(Object obj) {
                return mr0.D3(this.a, (CacheDrawScope) obj);
            }
        }));
    }
}
