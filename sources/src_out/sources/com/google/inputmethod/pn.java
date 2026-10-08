package com.google.inputmethod;

import androidx.compose.p001foundation.layout.SizeKt;
import androidx.compose.p001foundation.layout.c;
import androidx.compose.p001foundation.layout.t0;
import androidx.compose.p001foundation.text.Handle;
import androidx.compose.p001foundation.text.selection.SelectionHandleAnchor;
import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.b;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.a;
import androidx.compose.ui.graphics.h;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.AndroidPopup_androidKt;
import androidx.compose.ui.window.SecureFlagPolicy;
import com.google.android.ps4;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aI\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a-\u0010\u0013\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0013\u0010\u0014\u001a)\u0010\u0015\u001a\u00020\u000b*\u00020\u000b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u001b\u0010\u001a\u001a\u00020\u0019*\u00020\u00172\u0006\u0010\u0018\u001a\u00020\tH\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a-\u0010 \u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001d2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\r0\u0010H\u0001¢\u0006\u0004\b \u0010!¨\u0006\""}, d2 = {"Lcom/google/android/co8;", "offsetProvider", "", "isStartHandle", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "direction", "handlesCrossed", "Lcom/google/android/jf3;", "minTouchTargetSize", "", "lineHeight", "Landroidx/compose/ui/b;", "modifier", "", "n", "(Lcom/google/android/co8;ZLandroidx/compose/ui/text/style/ResolvedTextDirection;ZJFLandroidx/compose/ui/b;Landroidx/compose/runtime/d;II)V", "Lkotlin/Function0;", "iconVisible", "isLeft", "o", "(Landroidx/compose/ui/b;Lkotlin/jvm/functions/Function0;ZLandroidx/compose/runtime/d;I)V", "x", "(Landroidx/compose/ui/b;Lkotlin/jvm/functions/Function0;Z)Landroidx/compose/ui/b;", "Landroidx/compose/ui/draw/CacheDrawScope;", "radius", "Lcom/google/android/ml5;", "w", "(Landroidx/compose/ui/draw/CacheDrawScope;F)Lcom/google/android/ml5;", "positionProvider", "Lcom/google/android/tc;", "handleReferencePoint", "content", "l", "(Lcom/google/android/co8;Lcom/google/android/tc;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/d;I)V", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class pn {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit A(Function0 function0, boolean z, ml5 ml5Var, h hVar, fz1 fz1Var) {
        fz1Var.j1();
        if (!((Boolean) function0.invoke()).booleanValue()) {
            return Unit.a;
        }
        if (z) {
            long jA = fz1Var.A();
            vg3 drawContext = fz1Var.getDrawContext();
            long jD = drawContext.d();
            drawContext.b().v();
            try {
                drawContext.getTransform().g(-1.0f, 1.0f, jA);
                DrawScope.c2(fz1Var, ml5Var, 0L, 0.0f, null, hVar, 0, 46, null);
            } finally {
                drawContext.b().o();
                drawContext.c(jD);
            }
        } else {
            DrawScope.c2(fz1Var, ml5Var, 0L, 0.0f, null, hVar, 0, 46, null);
        }
        return Unit.a;
    }

    public static final void l(final co8 co8Var, final tc tcVar, final Function2<? super d, ? super Integer, Unit> function2, d dVar, final int i) {
        int i2;
        d dVarF = dVar.F(-1090171650);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? dVarF.x(co8Var) : dVarF.T(co8Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= dVarF.x(tcVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= dVarF.T(function2) ? 256 : 128;
        }
        boolean z = false;
        if (dVarF.g((i2 & 147) != 146, i2 & 1)) {
            if (e.k()) {
                e.o(-1090171650, i2, -1, "androidx.compose.foundation.text.selection.HandlePopup (AndroidSelectionHandles.android.kt:219)");
            }
            boolean z2 = (i2 & 112) == 32;
            if ((i2 & 14) == 4 || ((i2 & 8) != 0 && dVarF.x(co8Var))) {
                z = true;
            }
            boolean z3 = z2 | z;
            Object objR = dVarF.R();
            if (z3 || objR == d.INSTANCE.a()) {
                objR = new g45(tcVar, co8Var);
                dVarF.L(objR);
            }
            AndroidPopup_androidKt.a((g45) objR, null, new sg9(false, false, false, (SecureFlagPolicy) null, true, false, 15, (DefaultConstructorMarker) null), function2, dVarF, ((i2 << 3) & 7168) | 384, 2);
            if (e.k()) {
                e.n();
            }
        } else {
            dVarF.q();
        }
        s6b s6bVarH = dVarF.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2() { // from class: com.google.android.ln
                public final Object invoke(Object obj, Object obj2) {
                    return pn.m(co8Var, tcVar, function2, i, (d) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(co8 co8Var, tc tcVar, Function2 function2, int i, d dVar, int i2) {
        l(co8Var, tcVar, function2, dVar, saa.a(i | 1));
        return Unit.a;
    }

    public static final void n(final co8 co8Var, final boolean z, final ResolvedTextDirection resolvedTextDirection, final boolean z2, long j, final float f, final b bVar, d dVar, final int i, final int i2) {
        int i3;
        long jA;
        d dVarF = dVar.F(-466280168);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? dVarF.x(co8Var) : dVarF.T(co8Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= dVarF.A(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= dVarF.C(resolvedTextDirection.ordinal()) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= dVarF.A(z2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            jA = j;
            i3 |= ((i2 & 16) == 0 && dVarF.D(jA)) ? 16384 : 8192;
        } else {
            jA = j;
        }
        if ((1572864 & i) == 0) {
            i3 |= dVarF.x(bVar) ? 1048576 : 524288;
        }
        if (dVarF.g((533651 & i3) != 533650, i3 & 1)) {
            dVarF.U();
            if ((i & 1) != 0 && !dVarF.t()) {
                dVarF.q();
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                }
            } else if ((i2 & 16) != 0) {
                jA = jf3.INSTANCE.a();
                i3 &= -57345;
            }
            dVarF.M();
            if (e.k()) {
                e.o(-466280168, i3, -1, "androidx.compose.foundation.text.selection.SelectionHandle (AndroidSelectionHandles.android.kt:65)");
            }
            final boolean zF = feb.f(z, resolvedTextDirection, z2);
            m0 m0Var = m0.a;
            tc tcVarD = zF ? m0Var.d() : m0Var.c();
            int i4 = i3 & 14;
            boolean zA = ((i3 & 112) == 32) | (i4 == 4 || ((i3 & 8) != 0 && dVarF.T(co8Var))) | dVarF.A(zF);
            Object objR = dVarF.R();
            if (zA || objR == d.INSTANCE.a()) {
                objR = new Function1() { // from class: com.google.android.mn
                    public final Object invoke(Object obj) {
                        return pn.q(co8Var, z, zF, (nfb) obj);
                    }
                };
                dVarF.L(objR);
            }
            final b bVarD = afb.d(bVar, false, (Function1) objR, 1, null);
            final p7e p7eVar = (p7e) dVarF.v(CompositionLocalsKt.u());
            final long j2 = jA;
            l(co8Var, tcVarD, ko1.e(1365123137, true, new Function2() { // from class: com.google.android.nn
                public final Object invoke(Object obj, Object obj2) {
                    return pn.r(p7eVar, j2, zF, bVarD, co8Var, (d) obj, ((Integer) obj2).intValue());
                }
            }, dVarF, 54), dVarF, i4 | 384);
            if (e.k()) {
                e.n();
            }
            jA = j2;
        } else {
            dVarF.q();
        }
        s6b s6bVarH = dVarF.H();
        if (s6bVarH != null) {
            final long j3 = jA;
            s6bVarH.a(new Function2() { // from class: com.google.android.on
                public final Object invoke(Object obj, Object obj2) {
                    return pn.v(co8Var, z, resolvedTextDirection, z2, j3, f, bVar, i, i2, (d) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void o(final b bVar, final Function0<Boolean> function0, final boolean z, d dVar, final int i) {
        int i2;
        d dVarF = dVar.F(2111672474);
        if ((i & 6) == 0) {
            i2 = (dVarF.x(bVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= dVarF.T(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= dVarF.A(z) ? 256 : 128;
        }
        if (dVarF.g((i2 & 147) != 146, i2 & 1)) {
            if (e.k()) {
                e.o(2111672474, i2, -1, "androidx.compose.foundation.text.selection.SelectionHandleIcon (AndroidSelectionHandles.android.kt:123)");
            }
            qzb.a(x(SizeKt.v(bVar, feb.c(), feb.b()), function0, z), dVarF, 0);
            if (e.k()) {
                e.n();
            }
        } else {
            dVarF.q();
        }
        s6b s6bVarH = dVarF.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2() { // from class: com.google.android.hn
                public final Object invoke(Object obj, Object obj2) {
                    return pn.p(bVar, function0, z, i, (d) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p(b bVar, Function0 function0, boolean z, int i, d dVar, int i2) {
        o(bVar, function0, z, dVar, saa.a(i | 1));
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q(co8 co8Var, boolean z, boolean z2, nfb nfbVar) {
        long jA = co8Var.a();
        nfbVar.b(feb.d(), new SelectionHandleInfo(z ? Handle.SelectionStart : Handle.SelectionEnd, jA, z2 ? SelectionHandleAnchor.Left : SelectionHandleAnchor.Right, (9223372034707292159L & jA) != 9205357640488583168L, null));
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r(p7e p7eVar, final long j, final boolean z, final b bVar, final co8 co8Var, d dVar, int i) {
        if (dVar.g((i & 3) != 2, i & 1)) {
            if (e.k()) {
                e.o(1365123137, i, -1, "androidx.compose.foundation.text.selection.SelectionHandle.<anonymous> (AndroidSelectionHandles.android.kt:85)");
            }
            fs1.c(CompositionLocalsKt.u().d(p7eVar), ko1.e(1260045569, true, new Function2() { // from class: com.google.android.fn
                public final Object invoke(Object obj, Object obj2) {
                    return pn.s(j, z, bVar, co8Var, (d) obj, ((Integer) obj2).intValue());
                }
            }, dVar, 54), dVar, os9.i | 48);
            if (e.k()) {
                e.n();
            }
        } else {
            dVar.q();
        }
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s(long j, boolean z, b bVar, final co8 co8Var, d dVar, int i) {
        if (dVar.g((i & 3) != 2, i & 1)) {
            if (e.k()) {
                e.o(1260045569, i, -1, "androidx.compose.foundation.text.selection.SelectionHandle.<anonymous>.<anonymous> (AndroidSelectionHandles.android.kt:86)");
            }
            if (j != 9205357640488583168L) {
                dVar.y(3458246);
                c.e eVarD = z ? c.a.a.d() : c.a.a.c();
                b bVarP = SizeKt.p(bVar, jf3.h(j), jf3.g(j), 0.0f, 0.0f, 12, null);
                ej7 ej7VarB = t0.b(eVarD, tc.INSTANCE.l(), dVar, 0);
                int iHashCode = Long.hashCode(pp1.b(dVar, 0));
                gs1 gs1VarJ = dVar.j();
                b bVarE = ComposedModifierKt.e(dVar, bVarP);
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
                dud.i(dVarC, ej7VarB, companion.d());
                dud.i(dVarC, gs1VarJ, companion.f());
                dud.i(dVarC, Integer.valueOf(iHashCode), companion.c());
                dud.g(dVarC, companion.a());
                dud.i(dVarC, bVarE, companion.e());
                ira iraVar = ira.a;
                b.Companion companion2 = b.INSTANCE;
                boolean zT = dVar.T(co8Var);
                Object objR = dVar.R();
                if (zT || objR == d.INSTANCE.a()) {
                    objR = new Function0() { // from class: com.google.android.en
                        public final Object invoke() {
                            return Boolean.valueOf(pn.t(co8Var));
                        }
                    };
                    dVar.L(objR);
                }
                o(companion2, (Function0) objR, z, dVar, 6);
                dVar.m();
                dVar.u();
            } else {
                dVar.y(4389176);
                boolean zT2 = dVar.T(co8Var);
                Object objR2 = dVar.R();
                if (zT2 || objR2 == d.INSTANCE.a()) {
                    objR2 = new Function0() { // from class: com.google.android.gn
                        public final Object invoke() {
                            return Boolean.valueOf(pn.u(co8Var));
                        }
                    };
                    dVar.L(objR2);
                }
                o(bVar, (Function0) objR2, z, dVar, 0);
                dVar.u();
            }
            if (e.k()) {
                e.n();
            }
        } else {
            dVar.q();
        }
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean t(co8 co8Var) {
        return (co8Var.a() & 9223372034707292159L) != 9205357640488583168L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean u(co8 co8Var) {
        return (co8Var.a() & 9223372034707292159L) != 9205357640488583168L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit v(co8 co8Var, boolean z, ResolvedTextDirection resolvedTextDirection, boolean z2, long j, float f, b bVar, int i, int i2, d dVar, int i3) {
        n(co8Var, z, resolvedTextDirection, z2, j, f, bVar, dVar, saa.a(i | 1), i2);
        return Unit.a;
    }

    public static final ml5 w(CacheDrawScope cacheDrawScope, float f) {
        int iCeil = ((int) Math.ceil(f)) * 2;
        f45 f45Var = f45.a;
        ml5 ml5VarC = f45Var.c();
        w41 w41VarA = f45Var.a();
        a aVarB = f45Var.b();
        if (ml5VarC == null || w41VarA == null || iCeil > ml5VarC.getWidth() || iCeil > ml5VarC.getHeight()) {
            ml5VarC = ol5.b(iCeil, iCeil, nl5.INSTANCE.a(), false, null, 24, null);
            f45Var.f(ml5VarC);
            w41VarA = t51.a(ml5VarC);
            f45Var.d(w41VarA);
        }
        ml5 ml5Var = ml5VarC;
        w41 w41Var = w41VarA;
        if (aVarB == null) {
            aVarB = new a();
            f45Var.e(aVarB);
        }
        a aVar = aVarB;
        LayoutDirection layoutDirection = cacheDrawScope.getLayoutDirection();
        float width = ml5Var.getWidth();
        long jD = tsb.d((((long) Float.floatToRawIntBits(ml5Var.getHeight())) & 4294967295L) | (Float.floatToRawIntBits(width) << 32));
        a.DrawParams drawParams = aVar.getDrawParams();
        f43 density = drawParams.getDensity();
        LayoutDirection layoutDirection2 = drawParams.getLayoutDirection();
        w41 canvas = drawParams.getCanvas();
        long size = drawParams.getSize();
        a.DrawParams drawParams2 = aVar.getDrawParams();
        drawParams2.j(cacheDrawScope);
        drawParams2.k(layoutDirection);
        drawParams2.i(w41Var);
        drawParams2.l(jD);
        w41Var.v();
        DrawScope.T0(aVar, ei1.INSTANCE.a(), 0L, aVar.d(), 0.0f, null, null, androidx.compose.ui.graphics.e.INSTANCE.a(), 58, null);
        DrawScope.T0(aVar, ki1.d(4278190080L), rn8.INSTANCE.c(), tsb.d((((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L)), 0.0f, null, null, 0, 120, null);
        DrawScope.i1(aVar, ki1.d(4278190080L), f, rn8.e((((long) Float.floatToRawIntBits(f)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32)), 0.0f, null, null, 0, 120, null);
        w41Var.o();
        a.DrawParams drawParams3 = aVar.getDrawParams();
        drawParams3.j(density);
        drawParams3.k(layoutDirection2);
        drawParams3.i(canvas);
        drawParams3.l(size);
        return ml5Var;
    }

    public static final b x(b bVar, final Function0<Boolean> function0, final boolean z) {
        return ComposedModifierKt.c(bVar, null, new ps4() { // from class: com.google.android.in
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return pn.y(function0, z, (b) obj, (d) obj2, ((Integer) obj3).intValue());
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b y(final Function0 function0, final boolean z, b bVar, d dVar, int i) {
        dVar.y(-196777734);
        if (e.k()) {
            e.o(-196777734, i, -1, "androidx.compose.foundation.text.selection.drawSelectionHandle.<anonymous> (AndroidSelectionHandles.android.kt:129)");
        }
        final long selectionHandleColor = ((SelectionColors) dVar.v(jzc.c())).getSelectionHandleColor();
        boolean zD = dVar.D(selectionHandleColor) | dVar.x(function0) | dVar.A(z);
        Object objR = dVar.R();
        if (zD || objR == d.INSTANCE.a()) {
            objR = new Function1() { // from class: com.google.android.jn
                public final Object invoke(Object obj) {
                    return pn.z(selectionHandleColor, function0, z, (CacheDrawScope) obj);
                }
            };
            dVar.L(objR);
        }
        b bVarC = androidx.compose.ui.draw.c.c(bVar, (Function1) objR);
        if (e.k()) {
            e.n();
        }
        dVar.u();
        return bVarC;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ah3 z(long j, final Function0 function0, final boolean z, CacheDrawScope cacheDrawScope) {
        final ml5 ml5VarW = w(cacheDrawScope, Float.intBitsToFloat((int) (cacheDrawScope.d() >> 32)) / 2.0f);
        final h hVarC = h.Companion.c(h.INSTANCE, j, 0, 2, null);
        return cacheDrawScope.j(new Function1() { // from class: com.google.android.kn
            public final Object invoke(Object obj) {
                return pn.A(function0, z, ml5VarW, hVarC, (fz1) obj);
            }
        });
    }
}
