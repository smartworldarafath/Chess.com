package com.google.inputmethod;

import androidx.compose.p000animation.core.AnimateAsStateKt;
import androidx.compose.p001foundation.layout.BoxScopeInstance;
import androidx.compose.p001foundation.layout.SizeKt;
import androidx.compose.p001foundation.layout.j;
import androidx.compose.p002material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import androidx.compose.p004runtime.p0;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.b;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.graphics.p;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import com.google.android.ps4;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.g;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0016\u001am\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00030\u000b2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00030\u000bH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001aC\u0010\u0014\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0013\u001a\u00020\u00122\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u000f\u0010\u0016\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u001f\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0003¢\u0006\u0004\b\u001c\u0010\u001d\u001a;\u0010&\u001a\u00020\u0003*\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u0012H\u0002¢\u0006\u0004\b&\u0010'\u001a\u0017\u0010(\u001a\u00020!2\u0006\u0010\u0019\u001a\u00020\u001fH\u0002¢\u0006\u0004\b(\u0010)\u001aC\u0010-\u001a\u00020\u0003*\u00020\u001e2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020#2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!2\u0006\u0010%\u001a\u00020\u0012H\u0002¢\u0006\u0004\b-\u0010.\"\u0014\u00101\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100\"\u0014\u00103\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00100\"\u001a\u00107\u001a\u00020\u00128\u0000X\u0080\u0004¢\u0006\f\n\u0004\b4\u00100\u001a\u0004\b5\u00106\"\u001a\u0010:\u001a\u00020\u00128\u0000X\u0080\u0004¢\u0006\f\n\u0004\b8\u00100\u001a\u0004\b9\u00106\"\u0014\u0010<\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u00100\"\u0014\u0010>\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u00100¨\u0006@²\u0006\f\u0010?\u001a\u00020\u001f8\nX\u008a\u0084\u0002"}, d2 = {"", "isRefreshing", "Lkotlin/Function0;", "", "onRefresh", "Landroidx/compose/ui/b;", "modifier", "Lcom/google/android/eu9;", "state", "Lcom/google/android/tc;", "contentAlignment", "Lkotlin/Function1;", "Lcom/google/android/mt0;", "indicator", "content", "n", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/b;Lcom/google/android/eu9;Lcom/google/android/tc;Lcom/google/android/ps4;Lcom/google/android/ps4;Landroidx/compose/runtime/d;II)V", "enabled", "Lcom/google/android/ff3;", "threshold", "v", "(Landroidx/compose/ui/b;ZLcom/google/android/eu9;ZFLkotlin/jvm/functions/Function0;)Landroidx/compose/ui/b;", "x", "(Landroidx/compose/runtime/d;I)Lcom/google/android/eu9;", "Lcom/google/android/hh4;", "progress", "Lcom/google/android/ei1;", "color", "h", "(Lcom/google/android/hh4;JLandroidx/compose/runtime/d;I)V", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "", "alpha", "Lcom/google/android/k10;", "values", "Lcom/google/android/gba;", "arcBounds", "strokeWidth", "s", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JFLcom/google/android/k10;Lcom/google/android/gba;F)V", "g", "(F)Lcom/google/android/k10;", "Landroidx/compose/ui/graphics/Path;", "arrow", "bounds", "r", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/graphics/Path;Lcom/google/android/gba;JFLcom/google/android/k10;F)V", "a", "F", "StrokeWidth", "b", "ArcRadius", "c", "u", "()F", "SpinnerSize", "d", "t", "SpinnerContainerSize", "e", "ArrowWidth", "f", "ArrowHeight", "targetAlpha", "material3"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class du9 {
    private static final float a = ff3.i((float) 2.5d);
    private static final float b = ff3.i((float) 5.5d);
    private static final float c = ff3.i(16);
    private static final float d = ff3.i(40);
    private static final float e = ff3.i(10);
    private static final float f = ff3.i(5);

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class a implements ps4<mt0, d, Integer, Unit> {
        final /* synthetic */ eu9 a;
        final /* synthetic */ boolean b;

        a(eu9 eu9Var, boolean z) {
            this.a = eu9Var;
            this.b = z;
        }

        public final void a(mt0 mt0Var, d dVar, int i) {
            int i2;
            if ((i & 6) == 0) {
                i2 = (dVar.x(mt0Var) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if (!dVar.g((i2 & 19) != 18, i2 & 1)) {
                dVar.q();
                return;
            }
            if (e.k()) {
                e.o(1028036671, i2, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshBox.<anonymous> (PullToRefresh.kt:126)");
            }
            vt9.a.g(this.a, this.b, mt0Var.k(b.INSTANCE, tc.INSTANCE.m()), 0L, 0L, 0.0f, dVar, 1572864, 56);
            if (e.k()) {
                e.n();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((mt0) obj, (d) obj2, ((Number) obj3).intValue());
            return Unit.a;
        }
    }

    private static final k10 g(float f2) {
        float fMax = (Math.max(Math.min(1.0f, f2) - 0.4f, 0.0f) * 5) / 3;
        float fN = g.n(Math.abs(f2) - 1.0f, 0.0f, 2.0f);
        float fPow = (((0.4f * fMax) - 0.25f) + (fN - (((float) Math.pow(fN, 2)) / 4))) * 0.5f;
        float f3 = 360;
        return new k10(fPow, fPow * f3, ((0.8f * fMax) + fPow) * f3, Math.min(1.0f, fMax));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(final hh4 hh4Var, final long j, d dVar, final int i) {
        int i2;
        d dVarF = dVar.F(-1353562852);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? dVarF.x(hh4Var) : dVarF.T(hh4Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= dVarF.D(j) ? 32 : 16;
        }
        if (dVarF.g((i2 & 19) != 18, i2 & 1)) {
            if (e.k()) {
                e.o(-1353562852, i2, -1, "androidx.compose.material3.pulltorefresh.CircularArrowProgressIndicator (PullToRefresh.kt:631)");
            }
            Object objR = dVarF.R();
            d.Companion companion = d.INSTANCE;
            Object obj = objR;
            if (objR == companion.a()) {
                Path pathA = androidx.compose.ui.graphics.d.a();
                pathA.u(p.INSTANCE.a());
                dVarF.L(pathA);
                obj = pathA;
            }
            final Path path = (Path) obj;
            Object objR2 = dVarF.R();
            if (objR2 == companion.a()) {
                objR2 = p0.e(new Function0() { // from class: com.google.android.zt9
                    public final Object invoke() {
                        return Float.valueOf(du9.l(hh4Var));
                    }
                });
                dVarF.L(objR2);
            }
            final q6c<Float> q6cVarE = AnimateAsStateKt.e(m((q6c) objR2), d08.b(MotionSchemeKeyTokens.DefaultEffects, dVarF, 6), 0.0f, null, null, dVarF, 0, 28);
            b.Companion companion2 = b.INSTANCE;
            int i3 = i2 & 14;
            boolean z = i3 == 4 || ((i2 & 8) != 0 && dVarF.T(hh4Var));
            Object objR3 = dVarF.R();
            if (z || objR3 == companion.a()) {
                objR3 = new Function1() { // from class: com.google.android.au9
                    public final Object invoke(Object obj2) {
                        return du9.i(hh4Var, (nfb) obj2);
                    }
                };
                dVarF.L(objR3);
            }
            b bVarT = SizeKt.t(afb.a(companion2, (Function1) objR3), c);
            boolean zX = dVarF.x(q6cVarE) | (i3 == 4 || ((i2 & 8) != 0 && dVarF.T(hh4Var))) | ((i2 & 112) == 32) | dVarF.T(path);
            Object objR4 = dVarF.R();
            if (zX || objR4 == companion.a()) {
                Function1 function1 = new Function1() { // from class: com.google.android.bu9
                    public final Object invoke(Object obj2) {
                        return du9.j(hh4Var, q6cVarE, j, path, (DrawScope) obj2);
                    }
                };
                dVarF.L(function1);
                objR4 = function1;
            }
            v51.b(bVarT, (Function1) objR4, dVarF, 0);
            if (e.k()) {
                e.n();
            }
        } else {
            dVarF.q();
        }
        s6b s6bVarH = dVarF.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2() { // from class: com.google.android.cu9
                public final Object invoke(Object obj2, Object obj3) {
                    return du9.k(hh4Var, j, i, (d) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(hh4 hh4Var, nfb nfbVar) {
        if (hh4Var.invoke() > 0.0f) {
            SemanticsPropertiesKt.o0(nfbVar, new ProgressBarRangeInfo(hh4Var.invoke(), g.b(0.0f, 1.0f), 0));
        }
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(hh4 hh4Var, q6c q6cVar, long j, Path path, DrawScope drawScope) {
        k10 k10VarG = g(hh4Var.invoke());
        float fFloatValue = ((Number) q6cVar.getValue()).floatValue();
        float rotation = k10VarG.getRotation();
        long jA = drawScope.A();
        vg3 drawContext = drawScope.getDrawContext();
        long jD = drawContext.d();
        drawContext.b().v();
        try {
            drawContext.getTransform().h(rotation, jA);
            float fX2 = drawScope.x2(b);
            float f2 = a;
            gba gbaVarB = kba.b(atb.b(drawScope.d()), fX2 + (drawScope.x2(f2) / 2.0f));
            s(drawScope, j, fFloatValue, k10VarG, gbaVarB, f2);
            r(drawScope, path, gbaVarB, j, fFloatValue, k10VarG, f2);
            return Unit.a;
        } finally {
            drawContext.b().o();
            drawContext.c(jD);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(hh4 hh4Var, long j, int i, d dVar, int i2) {
        h(hh4Var, j, dVar, saa.a(i | 1));
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float l(hh4 hh4Var) {
        return hh4Var.invoke() >= 1.0f ? 1.0f : 0.3f;
    }

    private static final float m(q6c<Float> q6cVar) {
        return q6cVar.getValue().floatValue();
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0112  */
    /* JADX WARN: Code duplicated, block: B:105:0x012e  */
    /* JADX WARN: Code duplicated, block: B:108:0x015e  */
    /* JADX WARN: Code duplicated, block: B:111:0x016a  */
    /* JADX WARN: Code duplicated, block: B:112:0x016e  */
    /* JADX WARN: Code duplicated, block: B:115:0x018d  */
    /* JADX WARN: Code duplicated, block: B:117:0x019b  */
    /* JADX WARN: Code duplicated, block: B:120:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:123:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:126:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0060  */
    /* JADX WARN: Code duplicated, block: B:38:0x0064  */
    /* JADX WARN: Code duplicated, block: B:40:0x006c  */
    /* JADX WARN: Code duplicated, block: B:41:0x006f  */
    /* JADX WARN: Code duplicated, block: B:44:0x0075  */
    /* JADX WARN: Code duplicated, block: B:47:0x007b  */
    /* JADX WARN: Code duplicated, block: B:49:0x0080  */
    /* JADX WARN: Code duplicated, block: B:51:0x0084  */
    /* JADX WARN: Code duplicated, block: B:53:0x008c  */
    /* JADX WARN: Code duplicated, block: B:54:0x008f  */
    /* JADX WARN: Code duplicated, block: B:58:0x0098  */
    /* JADX WARN: Code duplicated, block: B:60:0x009c  */
    /* JADX WARN: Code duplicated, block: B:62:0x009f  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:65:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:70:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:72:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:74:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:80:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:83:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:85:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:92:0x00f8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:93:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:96:0x0100  */
    /* JADX WARN: Code duplicated, block: B:98:0x0108  */
    /* JADX WARN: Code duplicated, block: B:99:0x010f  */
    public static final void n(final boolean z, final Function0<Unit> function0, b bVar, eu9 eu9Var, tc tcVar, ps4<? super mt0, ? super d, ? super Integer, Unit> ps4Var, final ps4<? super mt0, ? super d, ? super Integer, Unit> ps4Var2, d dVar, final int i, final int i2) {
        int i3;
        Function0<Unit> function1;
        b bVar2;
        eu9 eu9VarX;
        int i4;
        tc tcVar2;
        int i5;
        int i6;
        ps4<? super mt0, ? super d, ? super Integer, Unit> ps4VarE;
        int i7;
        int i8;
        boolean z2;
        final b bVar3;
        final eu9 eu9Var2;
        final tc tcVar3;
        final ps4<? super mt0, ? super d, ? super Integer, Unit> ps4Var3;
        s6b s6bVarH;
        tc tcVarO;
        int i9;
        b bVar4;
        eu9 eu9Var3;
        int iA;
        Function0<ComposeUiNode> function0B;
        d dVarC;
        Function2<ComposeUiNode, Integer, Unit> function2C;
        d dVarF = dVar.F(-532332839);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (dVarF.A(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
            function1 = function0;
        } else {
            function1 = function0;
            if ((i & 48) == 0) {
                i3 |= dVarF.T(function1) ? 32 : 16;
            }
        }
        int i10 = i2 & 4;
        if (i10 == 0) {
            if ((i & 384) == 0) {
                bVar2 = bVar;
                i3 |= dVarF.x(bVar2) ? 256 : 128;
            }
            if ((i & 3072) == 0) {
                if ((i2 & 8) == 0) {
                    eu9VarX = eu9Var;
                    int i11 = dVarF.x(eu9VarX) ? 2048 : 1024;
                    i3 |= i11;
                } else {
                    eu9VarX = eu9Var;
                }
                i3 |= i11;
            } else {
                eu9VarX = eu9Var;
            }
            i4 = i2 & 16;
            if (i4 != 0) {
                if ((i & 24576) == 0) {
                    tcVar2 = tcVar;
                    if (dVarF.x(tcVar2)) {
                        i5 = 16384;
                    } else {
                        i5 = 8192;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 32;
                if (i6 != 0) {
                    if ((196608 & i) == 0) {
                        ps4VarE = ps4Var;
                        if (dVarF.T(ps4VarE)) {
                            i7 = 131072;
                        } else {
                            i7 = 65536;
                        }
                        i3 |= i7;
                    }
                    if ((i2 & 64) != 0) {
                        i3 |= 1572864;
                    } else if ((i & 1572864) == 0) {
                        if (dVarF.T(ps4Var2)) {
                            i8 = 1048576;
                        } else {
                            i8 = 524288;
                        }
                        i3 |= i8;
                    }
                    if ((599187 & i3) != 599186) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (dVarF.g(z2, i3 & 1)) {
                        dVarF.U();
                        if ((i & 1) != 0 || dVarF.t()) {
                            if (i10 != 0) {
                                bVar2 = b.INSTANCE;
                            }
                            if ((i2 & 8) != 0) {
                                eu9VarX = x(dVarF, 0);
                                i3 &= -7169;
                            }
                            if (i4 != 0) {
                                tcVarO = tc.INSTANCE.o();
                            } else {
                                tcVarO = tcVar2;
                            }
                            if (i6 != 0) {
                                ps4VarE = ko1.e(1028036671, true, new a(eu9VarX, z), dVarF, 54);
                            }
                            i9 = i3;
                            bVar4 = bVar2;
                            eu9Var3 = eu9VarX;
                            tcVar2 = tcVarO;
                        } else {
                            dVarF.q();
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                            }
                            i9 = i3;
                            bVar4 = bVar2;
                            eu9Var3 = eu9VarX;
                        }
                        dVarF.M();
                        if (e.k()) {
                            e.o(-532332839, i9, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshBox (PullToRefresh.kt:133)");
                        }
                        b bVarW = w(bVar4, z, eu9Var3, false, 0.0f, function1, 12, null);
                        ej7 ej7VarI = j.i(tcVar2, false);
                        iA = pp1.a(dVarF, 0);
                        gs1 gs1VarJ = dVarF.j();
                        b bVarE = ComposedModifierKt.e(dVarF, bVarW);
                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                        function0B = companion.b();
                        if (dVarF.G() == null) {
                            pp1.d();
                        }
                        dVarF.o();
                        if (dVarF.getInserting()) {
                            dVarF.W(function0B);
                        } else {
                            dVarF.k();
                        }
                        dVarC = dud.c(dVarF);
                        dud.i(dVarC, ej7VarI, companion.d());
                        dud.i(dVarC, gs1VarJ, companion.f());
                        function2C = companion.c();
                        if (dVarC.getInserting() || !Intrinsics.e(dVarC.R(), Integer.valueOf(iA))) {
                            dVarC.L(Integer.valueOf(iA));
                            dVarC.e(Integer.valueOf(iA), function2C);
                        }
                        dud.i(dVarC, bVarE, companion.e());
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.a;
                        ps4Var2.invoke(boxScopeInstance, dVarF, Integer.valueOf(((i9 >> 15) & 112) | 6));
                        ps4VarE.invoke(boxScopeInstance, dVarF, Integer.valueOf(((i9 >> 12) & 112) | 6));
                        dVarF.m();
                        if (e.k()) {
                            e.n();
                        }
                        bVar3 = bVar4;
                        eu9Var2 = eu9Var3;
                    } else {
                        dVarF.q();
                        bVar3 = bVar2;
                        eu9Var2 = eu9VarX;
                    }
                    tcVar3 = tcVar2;
                    ps4Var3 = ps4VarE;
                    s6bVarH = dVarF.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.xt9
                            public final Object invoke(Object obj, Object obj2) {
                                return du9.o(z, function0, bVar3, eu9Var2, tcVar3, ps4Var3, ps4Var2, i, i2, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i3 |= 196608;
                ps4VarE = ps4Var;
                if ((i2 & 64) != 0) {
                    i3 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    if (dVarF.T(ps4Var2)) {
                        i8 = 1048576;
                    } else {
                        i8 = 524288;
                    }
                    i3 |= i8;
                }
                if ((599187 & i3) != 599186) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (dVarF.g(z2, i3 & 1)) {
                    dVarF.U();
                    if ((i & 1) != 0) {
                        if (i10 != 0) {
                            bVar2 = b.INSTANCE;
                        }
                        if ((i2 & 8) != 0) {
                            eu9VarX = x(dVarF, 0);
                            i3 &= -7169;
                        }
                        if (i4 != 0) {
                            tcVarO = tc.INSTANCE.o();
                        } else {
                            tcVarO = tcVar2;
                        }
                        if (i6 != 0) {
                            ps4VarE = ko1.e(1028036671, true, new a(eu9VarX, z), dVarF, 54);
                        }
                        i9 = i3;
                        bVar4 = bVar2;
                        eu9Var3 = eu9VarX;
                        tcVar2 = tcVarO;
                    } else {
                        if (i10 != 0) {
                            bVar2 = b.INSTANCE;
                        }
                        if ((i2 & 8) != 0) {
                            eu9VarX = x(dVarF, 0);
                            i3 &= -7169;
                        }
                        if (i4 != 0) {
                            tcVarO = tc.INSTANCE.o();
                        } else {
                            tcVarO = tcVar2;
                        }
                        if (i6 != 0) {
                            ps4VarE = ko1.e(1028036671, true, new a(eu9VarX, z), dVarF, 54);
                        }
                        i9 = i3;
                        bVar4 = bVar2;
                        eu9Var3 = eu9VarX;
                        tcVar2 = tcVarO;
                    }
                    dVarF.M();
                    if (e.k()) {
                        e.o(-532332839, i9, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshBox (PullToRefresh.kt:133)");
                    }
                    b bVarW2 = w(bVar4, z, eu9Var3, false, 0.0f, function1, 12, null);
                    ej7 ej7VarI2 = j.i(tcVar2, false);
                    iA = pp1.a(dVarF, 0);
                    gs1 gs1VarJ2 = dVarF.j();
                    b bVarE2 = ComposedModifierKt.e(dVarF, bVarW2);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    function0B = companion2.b();
                    if (dVarF.G() == null) {
                        pp1.d();
                    }
                    dVarF.o();
                    if (dVarF.getInserting()) {
                        dVarF.W(function0B);
                    } else {
                        dVarF.k();
                    }
                    dVarC = dud.c(dVarF);
                    dud.i(dVarC, ej7VarI2, companion2.d());
                    dud.i(dVarC, gs1VarJ2, companion2.f());
                    function2C = companion2.c();
                    if (dVarC.getInserting()) {
                        dVarC.L(Integer.valueOf(iA));
                        dVarC.e(Integer.valueOf(iA), function2C);
                    } else {
                        dVarC.L(Integer.valueOf(iA));
                        dVarC.e(Integer.valueOf(iA), function2C);
                    }
                    dud.i(dVarC, bVarE2, companion2.e());
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.a;
                    ps4Var2.invoke(boxScopeInstance2, dVarF, Integer.valueOf(((i9 >> 15) & 112) | 6));
                    ps4VarE.invoke(boxScopeInstance2, dVarF, Integer.valueOf(((i9 >> 12) & 112) | 6));
                    dVarF.m();
                    if (e.k()) {
                        e.n();
                    }
                    bVar3 = bVar4;
                    eu9Var2 = eu9Var3;
                } else {
                    dVarF.q();
                    bVar3 = bVar2;
                    eu9Var2 = eu9VarX;
                }
                tcVar3 = tcVar2;
                ps4Var3 = ps4VarE;
                s6bVarH = dVarF.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.xt9
                        public final Object invoke(Object obj, Object obj2) {
                            return du9.o(z, function0, bVar3, eu9Var2, tcVar3, ps4Var3, ps4Var2, i, i2, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i3 |= 24576;
            tcVar2 = tcVar;
            i6 = i2 & 32;
            if (i6 != 0) {
                if ((196608 & i) == 0) {
                    ps4VarE = ps4Var;
                    if (dVarF.T(ps4VarE)) {
                        i7 = 131072;
                    } else {
                        i7 = 65536;
                    }
                    i3 |= i7;
                }
                if ((i2 & 64) != 0) {
                    i3 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    if (dVarF.T(ps4Var2)) {
                        i8 = 1048576;
                    } else {
                        i8 = 524288;
                    }
                    i3 |= i8;
                }
                if ((599187 & i3) != 599186) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (dVarF.g(z2, i3 & 1)) {
                    dVarF.U();
                    if ((i & 1) != 0) {
                        if (i10 != 0) {
                            bVar2 = b.INSTANCE;
                        }
                        if ((i2 & 8) != 0) {
                            eu9VarX = x(dVarF, 0);
                            i3 &= -7169;
                        }
                        if (i4 != 0) {
                            tcVarO = tc.INSTANCE.o();
                        } else {
                            tcVarO = tcVar2;
                        }
                        if (i6 != 0) {
                            ps4VarE = ko1.e(1028036671, true, new a(eu9VarX, z), dVarF, 54);
                        }
                        i9 = i3;
                        bVar4 = bVar2;
                        eu9Var3 = eu9VarX;
                        tcVar2 = tcVarO;
                    } else {
                        if (i10 != 0) {
                            bVar2 = b.INSTANCE;
                        }
                        if ((i2 & 8) != 0) {
                            eu9VarX = x(dVarF, 0);
                            i3 &= -7169;
                        }
                        if (i4 != 0) {
                            tcVarO = tc.INSTANCE.o();
                        } else {
                            tcVarO = tcVar2;
                        }
                        if (i6 != 0) {
                            ps4VarE = ko1.e(1028036671, true, new a(eu9VarX, z), dVarF, 54);
                        }
                        i9 = i3;
                        bVar4 = bVar2;
                        eu9Var3 = eu9VarX;
                        tcVar2 = tcVarO;
                    }
                    dVarF.M();
                    if (e.k()) {
                        e.o(-532332839, i9, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshBox (PullToRefresh.kt:133)");
                    }
                    b bVarW3 = w(bVar4, z, eu9Var3, false, 0.0f, function1, 12, null);
                    ej7 ej7VarI3 = j.i(tcVar2, false);
                    iA = pp1.a(dVarF, 0);
                    gs1 gs1VarJ3 = dVarF.j();
                    b bVarE3 = ComposedModifierKt.e(dVarF, bVarW3);
                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                    function0B = companion3.b();
                    if (dVarF.G() == null) {
                        pp1.d();
                    }
                    dVarF.o();
                    if (dVarF.getInserting()) {
                        dVarF.W(function0B);
                    } else {
                        dVarF.k();
                    }
                    dVarC = dud.c(dVarF);
                    dud.i(dVarC, ej7VarI3, companion3.d());
                    dud.i(dVarC, gs1VarJ3, companion3.f());
                    function2C = companion3.c();
                    if (dVarC.getInserting()) {
                        dVarC.L(Integer.valueOf(iA));
                        dVarC.e(Integer.valueOf(iA), function2C);
                    } else {
                        dVarC.L(Integer.valueOf(iA));
                        dVarC.e(Integer.valueOf(iA), function2C);
                    }
                    dud.i(dVarC, bVarE3, companion3.e());
                    BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.a;
                    ps4Var2.invoke(boxScopeInstance3, dVarF, Integer.valueOf(((i9 >> 15) & 112) | 6));
                    ps4VarE.invoke(boxScopeInstance3, dVarF, Integer.valueOf(((i9 >> 12) & 112) | 6));
                    dVarF.m();
                    if (e.k()) {
                        e.n();
                    }
                    bVar3 = bVar4;
                    eu9Var2 = eu9Var3;
                } else {
                    dVarF.q();
                    bVar3 = bVar2;
                    eu9Var2 = eu9VarX;
                }
                tcVar3 = tcVar2;
                ps4Var3 = ps4VarE;
                s6bVarH = dVarF.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.xt9
                        public final Object invoke(Object obj, Object obj2) {
                            return du9.o(z, function0, bVar3, eu9Var2, tcVar3, ps4Var3, ps4Var2, i, i2, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i3 |= 196608;
            ps4VarE = ps4Var;
            if ((i2 & 64) != 0) {
                i3 |= 1572864;
            } else if ((i & 1572864) == 0) {
                if (dVarF.T(ps4Var2)) {
                    i8 = 1048576;
                } else {
                    i8 = 524288;
                }
                i3 |= i8;
            }
            if ((599187 & i3) != 599186) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (dVarF.g(z2, i3 & 1)) {
                dVarF.U();
                if ((i & 1) != 0) {
                    if (i10 != 0) {
                        bVar2 = b.INSTANCE;
                    }
                    if ((i2 & 8) != 0) {
                        eu9VarX = x(dVarF, 0);
                        i3 &= -7169;
                    }
                    if (i4 != 0) {
                        tcVarO = tc.INSTANCE.o();
                    } else {
                        tcVarO = tcVar2;
                    }
                    if (i6 != 0) {
                        ps4VarE = ko1.e(1028036671, true, new a(eu9VarX, z), dVarF, 54);
                    }
                    i9 = i3;
                    bVar4 = bVar2;
                    eu9Var3 = eu9VarX;
                    tcVar2 = tcVarO;
                } else {
                    if (i10 != 0) {
                        bVar2 = b.INSTANCE;
                    }
                    if ((i2 & 8) != 0) {
                        eu9VarX = x(dVarF, 0);
                        i3 &= -7169;
                    }
                    if (i4 != 0) {
                        tcVarO = tc.INSTANCE.o();
                    } else {
                        tcVarO = tcVar2;
                    }
                    if (i6 != 0) {
                        ps4VarE = ko1.e(1028036671, true, new a(eu9VarX, z), dVarF, 54);
                    }
                    i9 = i3;
                    bVar4 = bVar2;
                    eu9Var3 = eu9VarX;
                    tcVar2 = tcVarO;
                }
                dVarF.M();
                if (e.k()) {
                    e.o(-532332839, i9, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshBox (PullToRefresh.kt:133)");
                }
                b bVarW4 = w(bVar4, z, eu9Var3, false, 0.0f, function1, 12, null);
                ej7 ej7VarI4 = j.i(tcVar2, false);
                iA = pp1.a(dVarF, 0);
                gs1 gs1VarJ4 = dVarF.j();
                b bVarE4 = ComposedModifierKt.e(dVarF, bVarW4);
                ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                function0B = companion4.b();
                if (dVarF.G() == null) {
                    pp1.d();
                }
                dVarF.o();
                if (dVarF.getInserting()) {
                    dVarF.W(function0B);
                } else {
                    dVarF.k();
                }
                dVarC = dud.c(dVarF);
                dud.i(dVarC, ej7VarI4, companion4.d());
                dud.i(dVarC, gs1VarJ4, companion4.f());
                function2C = companion4.c();
                if (dVarC.getInserting()) {
                    dVarC.L(Integer.valueOf(iA));
                    dVarC.e(Integer.valueOf(iA), function2C);
                } else {
                    dVarC.L(Integer.valueOf(iA));
                    dVarC.e(Integer.valueOf(iA), function2C);
                }
                dud.i(dVarC, bVarE4, companion4.e());
                BoxScopeInstance boxScopeInstance4 = BoxScopeInstance.a;
                ps4Var2.invoke(boxScopeInstance4, dVarF, Integer.valueOf(((i9 >> 15) & 112) | 6));
                ps4VarE.invoke(boxScopeInstance4, dVarF, Integer.valueOf(((i9 >> 12) & 112) | 6));
                dVarF.m();
                if (e.k()) {
                    e.n();
                }
                bVar3 = bVar4;
                eu9Var2 = eu9Var3;
            } else {
                dVarF.q();
                bVar3 = bVar2;
                eu9Var2 = eu9VarX;
            }
            tcVar3 = tcVar2;
            ps4Var3 = ps4VarE;
            s6bVarH = dVarF.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.xt9
                    public final Object invoke(Object obj, Object obj2) {
                        return du9.o(z, function0, bVar3, eu9Var2, tcVar3, ps4Var3, ps4Var2, i, i2, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i3 |= 384;
        bVar2 = bVar;
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                eu9VarX = eu9Var;
                if (dVarF.x(eu9VarX)) {
                }
                i3 |= i11;
            } else {
                eu9VarX = eu9Var;
            }
            i3 |= i11;
        } else {
            eu9VarX = eu9Var;
        }
        i4 = i2 & 16;
        if (i4 != 0) {
            if ((i & 24576) == 0) {
                tcVar2 = tcVar;
                if (dVarF.x(tcVar2)) {
                    i5 = 16384;
                } else {
                    i5 = 8192;
                }
                i3 |= i5;
            }
            i6 = i2 & 32;
            if (i6 != 0) {
                if ((196608 & i) == 0) {
                    ps4VarE = ps4Var;
                    if (dVarF.T(ps4VarE)) {
                        i7 = 131072;
                    } else {
                        i7 = 65536;
                    }
                    i3 |= i7;
                }
                if ((i2 & 64) != 0) {
                    i3 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    if (dVarF.T(ps4Var2)) {
                        i8 = 1048576;
                    } else {
                        i8 = 524288;
                    }
                    i3 |= i8;
                }
                if ((599187 & i3) != 599186) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (dVarF.g(z2, i3 & 1)) {
                    dVarF.U();
                    if ((i & 1) != 0) {
                        if (i10 != 0) {
                            bVar2 = b.INSTANCE;
                        }
                        if ((i2 & 8) != 0) {
                            eu9VarX = x(dVarF, 0);
                            i3 &= -7169;
                        }
                        if (i4 != 0) {
                            tcVarO = tc.INSTANCE.o();
                        } else {
                            tcVarO = tcVar2;
                        }
                        if (i6 != 0) {
                            ps4VarE = ko1.e(1028036671, true, new a(eu9VarX, z), dVarF, 54);
                        }
                        i9 = i3;
                        bVar4 = bVar2;
                        eu9Var3 = eu9VarX;
                        tcVar2 = tcVarO;
                    } else {
                        if (i10 != 0) {
                            bVar2 = b.INSTANCE;
                        }
                        if ((i2 & 8) != 0) {
                            eu9VarX = x(dVarF, 0);
                            i3 &= -7169;
                        }
                        if (i4 != 0) {
                            tcVarO = tc.INSTANCE.o();
                        } else {
                            tcVarO = tcVar2;
                        }
                        if (i6 != 0) {
                            ps4VarE = ko1.e(1028036671, true, new a(eu9VarX, z), dVarF, 54);
                        }
                        i9 = i3;
                        bVar4 = bVar2;
                        eu9Var3 = eu9VarX;
                        tcVar2 = tcVarO;
                    }
                    dVarF.M();
                    if (e.k()) {
                        e.o(-532332839, i9, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshBox (PullToRefresh.kt:133)");
                    }
                    b bVarW5 = w(bVar4, z, eu9Var3, false, 0.0f, function1, 12, null);
                    ej7 ej7VarI5 = j.i(tcVar2, false);
                    iA = pp1.a(dVarF, 0);
                    gs1 gs1VarJ5 = dVarF.j();
                    b bVarE5 = ComposedModifierKt.e(dVarF, bVarW5);
                    ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                    function0B = companion5.b();
                    if (dVarF.G() == null) {
                        pp1.d();
                    }
                    dVarF.o();
                    if (dVarF.getInserting()) {
                        dVarF.W(function0B);
                    } else {
                        dVarF.k();
                    }
                    dVarC = dud.c(dVarF);
                    dud.i(dVarC, ej7VarI5, companion5.d());
                    dud.i(dVarC, gs1VarJ5, companion5.f());
                    function2C = companion5.c();
                    if (dVarC.getInserting()) {
                        dVarC.L(Integer.valueOf(iA));
                        dVarC.e(Integer.valueOf(iA), function2C);
                    } else {
                        dVarC.L(Integer.valueOf(iA));
                        dVarC.e(Integer.valueOf(iA), function2C);
                    }
                    dud.i(dVarC, bVarE5, companion5.e());
                    BoxScopeInstance boxScopeInstance5 = BoxScopeInstance.a;
                    ps4Var2.invoke(boxScopeInstance5, dVarF, Integer.valueOf(((i9 >> 15) & 112) | 6));
                    ps4VarE.invoke(boxScopeInstance5, dVarF, Integer.valueOf(((i9 >> 12) & 112) | 6));
                    dVarF.m();
                    if (e.k()) {
                        e.n();
                    }
                    bVar3 = bVar4;
                    eu9Var2 = eu9Var3;
                } else {
                    dVarF.q();
                    bVar3 = bVar2;
                    eu9Var2 = eu9VarX;
                }
                tcVar3 = tcVar2;
                ps4Var3 = ps4VarE;
                s6bVarH = dVarF.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.xt9
                        public final Object invoke(Object obj, Object obj2) {
                            return du9.o(z, function0, bVar3, eu9Var2, tcVar3, ps4Var3, ps4Var2, i, i2, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i3 |= 196608;
            ps4VarE = ps4Var;
            if ((i2 & 64) != 0) {
                i3 |= 1572864;
            } else if ((i & 1572864) == 0) {
                if (dVarF.T(ps4Var2)) {
                    i8 = 1048576;
                } else {
                    i8 = 524288;
                }
                i3 |= i8;
            }
            if ((599187 & i3) != 599186) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (dVarF.g(z2, i3 & 1)) {
                dVarF.U();
                if ((i & 1) != 0) {
                    if (i10 != 0) {
                        bVar2 = b.INSTANCE;
                    }
                    if ((i2 & 8) != 0) {
                        eu9VarX = x(dVarF, 0);
                        i3 &= -7169;
                    }
                    if (i4 != 0) {
                        tcVarO = tc.INSTANCE.o();
                    } else {
                        tcVarO = tcVar2;
                    }
                    if (i6 != 0) {
                        ps4VarE = ko1.e(1028036671, true, new a(eu9VarX, z), dVarF, 54);
                    }
                    i9 = i3;
                    bVar4 = bVar2;
                    eu9Var3 = eu9VarX;
                    tcVar2 = tcVarO;
                } else {
                    if (i10 != 0) {
                        bVar2 = b.INSTANCE;
                    }
                    if ((i2 & 8) != 0) {
                        eu9VarX = x(dVarF, 0);
                        i3 &= -7169;
                    }
                    if (i4 != 0) {
                        tcVarO = tc.INSTANCE.o();
                    } else {
                        tcVarO = tcVar2;
                    }
                    if (i6 != 0) {
                        ps4VarE = ko1.e(1028036671, true, new a(eu9VarX, z), dVarF, 54);
                    }
                    i9 = i3;
                    bVar4 = bVar2;
                    eu9Var3 = eu9VarX;
                    tcVar2 = tcVarO;
                }
                dVarF.M();
                if (e.k()) {
                    e.o(-532332839, i9, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshBox (PullToRefresh.kt:133)");
                }
                b bVarW6 = w(bVar4, z, eu9Var3, false, 0.0f, function1, 12, null);
                ej7 ej7VarI6 = j.i(tcVar2, false);
                iA = pp1.a(dVarF, 0);
                gs1 gs1VarJ6 = dVarF.j();
                b bVarE6 = ComposedModifierKt.e(dVarF, bVarW6);
                ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                function0B = companion6.b();
                if (dVarF.G() == null) {
                    pp1.d();
                }
                dVarF.o();
                if (dVarF.getInserting()) {
                    dVarF.W(function0B);
                } else {
                    dVarF.k();
                }
                dVarC = dud.c(dVarF);
                dud.i(dVarC, ej7VarI6, companion6.d());
                dud.i(dVarC, gs1VarJ6, companion6.f());
                function2C = companion6.c();
                if (dVarC.getInserting()) {
                    dVarC.L(Integer.valueOf(iA));
                    dVarC.e(Integer.valueOf(iA), function2C);
                } else {
                    dVarC.L(Integer.valueOf(iA));
                    dVarC.e(Integer.valueOf(iA), function2C);
                }
                dud.i(dVarC, bVarE6, companion6.e());
                BoxScopeInstance boxScopeInstance6 = BoxScopeInstance.a;
                ps4Var2.invoke(boxScopeInstance6, dVarF, Integer.valueOf(((i9 >> 15) & 112) | 6));
                ps4VarE.invoke(boxScopeInstance6, dVarF, Integer.valueOf(((i9 >> 12) & 112) | 6));
                dVarF.m();
                if (e.k()) {
                    e.n();
                }
                bVar3 = bVar4;
                eu9Var2 = eu9Var3;
            } else {
                dVarF.q();
                bVar3 = bVar2;
                eu9Var2 = eu9VarX;
            }
            tcVar3 = tcVar2;
            ps4Var3 = ps4VarE;
            s6bVarH = dVarF.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.xt9
                    public final Object invoke(Object obj, Object obj2) {
                        return du9.o(z, function0, bVar3, eu9Var2, tcVar3, ps4Var3, ps4Var2, i, i2, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i3 |= 24576;
        tcVar2 = tcVar;
        i6 = i2 & 32;
        if (i6 != 0) {
            if ((196608 & i) == 0) {
                ps4VarE = ps4Var;
                if (dVarF.T(ps4VarE)) {
                    i7 = 131072;
                } else {
                    i7 = 65536;
                }
                i3 |= i7;
            }
            if ((i2 & 64) != 0) {
                i3 |= 1572864;
            } else if ((i & 1572864) == 0) {
                if (dVarF.T(ps4Var2)) {
                    i8 = 1048576;
                } else {
                    i8 = 524288;
                }
                i3 |= i8;
            }
            if ((599187 & i3) != 599186) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (dVarF.g(z2, i3 & 1)) {
                dVarF.U();
                if ((i & 1) != 0) {
                    if (i10 != 0) {
                        bVar2 = b.INSTANCE;
                    }
                    if ((i2 & 8) != 0) {
                        eu9VarX = x(dVarF, 0);
                        i3 &= -7169;
                    }
                    if (i4 != 0) {
                        tcVarO = tc.INSTANCE.o();
                    } else {
                        tcVarO = tcVar2;
                    }
                    if (i6 != 0) {
                        ps4VarE = ko1.e(1028036671, true, new a(eu9VarX, z), dVarF, 54);
                    }
                    i9 = i3;
                    bVar4 = bVar2;
                    eu9Var3 = eu9VarX;
                    tcVar2 = tcVarO;
                } else {
                    if (i10 != 0) {
                        bVar2 = b.INSTANCE;
                    }
                    if ((i2 & 8) != 0) {
                        eu9VarX = x(dVarF, 0);
                        i3 &= -7169;
                    }
                    if (i4 != 0) {
                        tcVarO = tc.INSTANCE.o();
                    } else {
                        tcVarO = tcVar2;
                    }
                    if (i6 != 0) {
                        ps4VarE = ko1.e(1028036671, true, new a(eu9VarX, z), dVarF, 54);
                    }
                    i9 = i3;
                    bVar4 = bVar2;
                    eu9Var3 = eu9VarX;
                    tcVar2 = tcVarO;
                }
                dVarF.M();
                if (e.k()) {
                    e.o(-532332839, i9, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshBox (PullToRefresh.kt:133)");
                }
                b bVarW7 = w(bVar4, z, eu9Var3, false, 0.0f, function1, 12, null);
                ej7 ej7VarI7 = j.i(tcVar2, false);
                iA = pp1.a(dVarF, 0);
                gs1 gs1VarJ7 = dVarF.j();
                b bVarE7 = ComposedModifierKt.e(dVarF, bVarW7);
                ComposeUiNode.Companion companion7 = ComposeUiNode.INSTANCE;
                function0B = companion7.b();
                if (dVarF.G() == null) {
                    pp1.d();
                }
                dVarF.o();
                if (dVarF.getInserting()) {
                    dVarF.W(function0B);
                } else {
                    dVarF.k();
                }
                dVarC = dud.c(dVarF);
                dud.i(dVarC, ej7VarI7, companion7.d());
                dud.i(dVarC, gs1VarJ7, companion7.f());
                function2C = companion7.c();
                if (dVarC.getInserting()) {
                    dVarC.L(Integer.valueOf(iA));
                    dVarC.e(Integer.valueOf(iA), function2C);
                } else {
                    dVarC.L(Integer.valueOf(iA));
                    dVarC.e(Integer.valueOf(iA), function2C);
                }
                dud.i(dVarC, bVarE7, companion7.e());
                BoxScopeInstance boxScopeInstance7 = BoxScopeInstance.a;
                ps4Var2.invoke(boxScopeInstance7, dVarF, Integer.valueOf(((i9 >> 15) & 112) | 6));
                ps4VarE.invoke(boxScopeInstance7, dVarF, Integer.valueOf(((i9 >> 12) & 112) | 6));
                dVarF.m();
                if (e.k()) {
                    e.n();
                }
                bVar3 = bVar4;
                eu9Var2 = eu9Var3;
            } else {
                dVarF.q();
                bVar3 = bVar2;
                eu9Var2 = eu9VarX;
            }
            tcVar3 = tcVar2;
            ps4Var3 = ps4VarE;
            s6bVarH = dVarF.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.xt9
                    public final Object invoke(Object obj, Object obj2) {
                        return du9.o(z, function0, bVar3, eu9Var2, tcVar3, ps4Var3, ps4Var2, i, i2, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i3 |= 196608;
        ps4VarE = ps4Var;
        if ((i2 & 64) != 0) {
            i3 |= 1572864;
        } else if ((i & 1572864) == 0) {
            if (dVarF.T(ps4Var2)) {
                i8 = 1048576;
            } else {
                i8 = 524288;
            }
            i3 |= i8;
        }
        if ((599187 & i3) != 599186) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (dVarF.g(z2, i3 & 1)) {
            dVarF.U();
            if ((i & 1) != 0) {
                if (i10 != 0) {
                    bVar2 = b.INSTANCE;
                }
                if ((i2 & 8) != 0) {
                    eu9VarX = x(dVarF, 0);
                    i3 &= -7169;
                }
                if (i4 != 0) {
                    tcVarO = tc.INSTANCE.o();
                } else {
                    tcVarO = tcVar2;
                }
                if (i6 != 0) {
                    ps4VarE = ko1.e(1028036671, true, new a(eu9VarX, z), dVarF, 54);
                }
                i9 = i3;
                bVar4 = bVar2;
                eu9Var3 = eu9VarX;
                tcVar2 = tcVarO;
            } else {
                if (i10 != 0) {
                    bVar2 = b.INSTANCE;
                }
                if ((i2 & 8) != 0) {
                    eu9VarX = x(dVarF, 0);
                    i3 &= -7169;
                }
                if (i4 != 0) {
                    tcVarO = tc.INSTANCE.o();
                } else {
                    tcVarO = tcVar2;
                }
                if (i6 != 0) {
                    ps4VarE = ko1.e(1028036671, true, new a(eu9VarX, z), dVarF, 54);
                }
                i9 = i3;
                bVar4 = bVar2;
                eu9Var3 = eu9VarX;
                tcVar2 = tcVarO;
            }
            dVarF.M();
            if (e.k()) {
                e.o(-532332839, i9, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshBox (PullToRefresh.kt:133)");
            }
            b bVarW8 = w(bVar4, z, eu9Var3, false, 0.0f, function1, 12, null);
            ej7 ej7VarI8 = j.i(tcVar2, false);
            iA = pp1.a(dVarF, 0);
            gs1 gs1VarJ8 = dVarF.j();
            b bVarE8 = ComposedModifierKt.e(dVarF, bVarW8);
            ComposeUiNode.Companion companion8 = ComposeUiNode.INSTANCE;
            function0B = companion8.b();
            if (dVarF.G() == null) {
                pp1.d();
            }
            dVarF.o();
            if (dVarF.getInserting()) {
                dVarF.W(function0B);
            } else {
                dVarF.k();
            }
            dVarC = dud.c(dVarF);
            dud.i(dVarC, ej7VarI8, companion8.d());
            dud.i(dVarC, gs1VarJ8, companion8.f());
            function2C = companion8.c();
            if (dVarC.getInserting()) {
                dVarC.L(Integer.valueOf(iA));
                dVarC.e(Integer.valueOf(iA), function2C);
            } else {
                dVarC.L(Integer.valueOf(iA));
                dVarC.e(Integer.valueOf(iA), function2C);
            }
            dud.i(dVarC, bVarE8, companion8.e());
            BoxScopeInstance boxScopeInstance8 = BoxScopeInstance.a;
            ps4Var2.invoke(boxScopeInstance8, dVarF, Integer.valueOf(((i9 >> 15) & 112) | 6));
            ps4VarE.invoke(boxScopeInstance8, dVarF, Integer.valueOf(((i9 >> 12) & 112) | 6));
            dVarF.m();
            if (e.k()) {
                e.n();
            }
            bVar3 = bVar4;
            eu9Var2 = eu9Var3;
        } else {
            dVarF.q();
            bVar3 = bVar2;
            eu9Var2 = eu9VarX;
        }
        tcVar3 = tcVar2;
        ps4Var3 = ps4VarE;
        s6bVarH = dVarF.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2() { // from class: com.google.android.xt9
                public final Object invoke(Object obj, Object obj2) {
                    return du9.o(z, function0, bVar3, eu9Var2, tcVar3, ps4Var3, ps4Var2, i, i2, (d) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o(boolean z, Function0 function0, b bVar, eu9 eu9Var, tc tcVar, ps4 ps4Var, ps4 ps4Var2, int i, int i2, d dVar, int i3) {
        n(z, function0, bVar, eu9Var, tcVar, ps4Var, ps4Var2, dVar, saa.a(i | 1), i2);
        return Unit.a;
    }

    private static final void r(DrawScope drawScope, Path path, gba gbaVar, long j, float f2, k10 k10Var, float f3) {
        path.reset();
        path.b(0.0f, 0.0f);
        float f4 = e;
        path.c((drawScope.x2(f4) * k10Var.getScale()) / 2, drawScope.x2(f) * k10Var.getScale());
        path.c(drawScope.x2(f4) * k10Var.getScale(), 0.0f);
        float fMin = ((Math.min(gbaVar.getRight() - gbaVar.getLeft(), gbaVar.getBottom() - gbaVar.getTop()) / 2.0f) + Float.intBitsToFloat((int) (gbaVar.h() >> 32))) - ((drawScope.x2(f4) * k10Var.getScale()) / 2.0f);
        path.i(rn8.e((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (gbaVar.h() & 4294967295L)) - drawScope.x2(f3))) & 4294967295L) | (Float.floatToRawIntBits(fMin) << 32)));
        float endAngle = k10Var.getEndAngle() - drawScope.x2(f3);
        long jA = drawScope.A();
        vg3 drawContext = drawScope.getDrawContext();
        long jD = drawContext.d();
        drawContext.b().v();
        try {
            drawContext.getTransform().h(endAngle, jA);
            DrawScope.g0(drawScope, path, j, f2, new Stroke(drawScope.x2(f3), 0.0f, 0, 0, null, 30, null), null, 0, 48, null);
        } finally {
            drawContext.b().o();
            drawContext.c(jD);
        }
    }

    private static final void s(DrawScope drawScope, long j, float f2, k10 k10Var, gba gbaVar, float f3) {
        DrawScope.n0(drawScope, j, k10Var.getStartAngle(), k10Var.getEndAngle() - k10Var.getStartAngle(), false, gbaVar.m(), gbaVar.k(), f2, new Stroke(drawScope.x2(f3), 0.0f, wbc.INSTANCE.a(), 0, null, 26, null), null, 0, 768, null);
    }

    public static final float t() {
        return d;
    }

    public static final float u() {
        return c;
    }

    public static final b v(b bVar, boolean z, eu9 eu9Var, boolean z2, float f2, Function0<Unit> function0) {
        return bVar.then(new wt9(z, function0, z2, eu9Var, f2, null));
    }

    public static /* synthetic */ b w(b bVar, boolean z, eu9 eu9Var, boolean z2, float f2, Function0 function0, int i, Object obj) {
        if ((i & 4) != 0) {
            z2 = true;
        }
        boolean z3 = z2;
        if ((i & 8) != 0) {
            f2 = vt9.a.q();
        }
        return v(bVar, z, eu9Var, z3, f2, function0);
    }

    public static final eu9 x(d dVar, int i) {
        if (e.k()) {
            e.o(318623070, i, -1, "androidx.compose.material3.pulltorefresh.rememberPullToRefreshState (PullToRefresh.kt:585)");
        }
        Object[] objArr = new Object[0];
        k0b<hu9, Float> k0bVarA = hu9.INSTANCE.a();
        Object objR = dVar.R();
        if (objR == d.INSTANCE.a()) {
            objR = new Function0() { // from class: com.google.android.yt9
                public final Object invoke() {
                    return du9.y();
                }
            };
            dVar.L(objR);
        }
        hu9 hu9Var = (hu9) dfa.k(objArr, k0bVarA, (Function0) objR, dVar, 384);
        if (e.k()) {
            e.n();
        }
        return hu9Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final hu9 y() {
        return new hu9();
    }
}
