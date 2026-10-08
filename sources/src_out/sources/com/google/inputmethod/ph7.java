package com.google.inputmethod;

import androidx.compose.p001foundation.IndicationKt;
import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\n\u001a;\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007¢\u0006\u0004\b\t\u0010\n\u001aE\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0001¢\u0006\u0004\b\r\u0010\u000e\u001a\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0010\u0010\u0011\" \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\" \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00128\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u0012\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lcom/google/android/yi1;", "colorScheme", "Lcom/google/android/slb;", "shapes", "Lcom/google/android/vod;", "typography", "Lkotlin/Function0;", "", "content", "g", "(Lcom/google/android/yi1;Lcom/google/android/slb;Lcom/google/android/vod;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/d;II)V", "Lcom/google/android/c08;", "motionScheme", "f", "(Lcom/google/android/yi1;Lcom/google/android/c08;Lcom/google/android/slb;Lcom/google/android/vod;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/d;II)V", "Lcom/google/android/hzc;", "l", "(Lcom/google/android/yi1;Landroidx/compose/runtime/d;I)Lcom/google/android/hzc;", "Lcom/google/android/ks9;", "", "a", "Lcom/google/android/ks9;", "getLocalUsingExpressiveTheme", "()Lcom/google/android/ks9;", "LocalUsingExpressiveTheme", "b", "get_localMotionScheme$annotations", "()V", "_localMotionScheme", "material3"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ph7 {
    private static final ks9<Boolean> a = fs1.j(new Function0() { // from class: com.google.android.mh7
        public final Object invoke() {
            return Boolean.valueOf(ph7.e());
        }
    });
    private static final ks9<c08> b = fs1.j(new Function0() { // from class: com.google.android.nh7
        public final Object invoke() {
            return ph7.j();
        }
    });

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class a implements Function2<d, Integer, Unit> {
        final /* synthetic */ Typography a;
        final /* synthetic */ Function2<d, Integer, Unit> b;

        /* JADX WARN: Multi-variable type inference failed */
        a(Typography typography, Function2<? super d, ? super Integer, Unit> function2) {
            this.a = typography;
            this.b = function2;
        }

        public final void a(d dVar, int i) {
            if (!dVar.g((i & 3) != 2, i & 1)) {
                dVar.q();
                return;
            }
            if (e.k()) {
                e.o(-1750539308, i, -1, "androidx.compose.material3.MaterialTheme.<anonymous> (MaterialTheme.kt:106)");
            }
            qxc.h(this.a.getBodyLarge(), this.b, dVar, 0);
            if (e.k()) {
                e.n();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((d) obj, ((Number) obj2).intValue());
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean e() {
        return false;
    }

    public static final void f(ColorScheme colorScheme, c08 c08Var, Shapes shapes, Typography typography, final Function2<? super d, ? super Integer, Unit> function2, d dVar, final int i, final int i2) {
        ColorScheme colorSchemeA;
        int i3;
        c08 c08VarC;
        Shapes shapesD;
        Typography typographyE;
        d dVarF = dVar.F(904511636);
        if ((i & 6) == 0) {
            if ((i2 & 1) == 0) {
                colorSchemeA = colorScheme;
                int i4 = dVarF.x(colorSchemeA) ? 4 : 2;
                i3 = i4 | i;
            } else {
                colorSchemeA = colorScheme;
            }
            i3 = i4 | i;
        } else {
            colorSchemeA = colorScheme;
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                c08VarC = c08Var;
                int i5 = dVarF.x(c08VarC) ? 32 : 16;
                i3 |= i5;
            } else {
                c08VarC = c08Var;
            }
            i3 |= i5;
        } else {
            c08VarC = c08Var;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                shapesD = shapes;
                int i6 = dVarF.x(shapesD) ? 256 : 128;
                i3 |= i6;
            } else {
                shapesD = shapes;
            }
            i3 |= i6;
        } else {
            shapesD = shapes;
        }
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                typographyE = typography;
                int i7 = dVarF.x(typographyE) ? 2048 : 1024;
                i3 |= i7;
            } else {
                typographyE = typography;
            }
            i3 |= i7;
        } else {
            typographyE = typography;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= dVarF.T(function2) ? 16384 : 8192;
        }
        if (dVarF.g((i3 & 9363) != 9362, i3 & 1)) {
            dVarF.U();
            if ((i & 1) == 0 || dVarF.t()) {
                if ((i2 & 1) != 0) {
                    colorSchemeA = kh7.a.a(dVarF, 6);
                    i3 &= -15;
                }
                if ((i2 & 2) != 0) {
                    c08VarC = kh7.a.c(dVarF, 6);
                    i3 &= -113;
                }
                if ((i2 & 4) != 0) {
                    shapesD = kh7.a.d(dVarF, 6);
                    i3 &= -897;
                }
                if ((i2 & 8) != 0) {
                    typographyE = kh7.a.e(dVarF, 6);
                    i3 &= -7169;
                }
            } else {
                dVarF.q();
                if ((i2 & 1) != 0) {
                    i3 &= -15;
                }
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                }
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                }
            }
            dVarF.M();
            if (e.k()) {
                e.o(904511636, i3, -1, "androidx.compose.material3.MaterialTheme (MaterialTheme.kt:95)");
            }
            fs1.d(new os9[]{bj1.k().d(colorSchemeA), b.d(c08VarC), IndicationKt.d().d(xoa.e(false, 0.0f, 0L, 7, null)), ulb.h().d(shapesD), jzc.c().d(l(colorSchemeA, dVarF, i3 & 14)), xod.d().d(typographyE)}, ko1.e(-1750539308, true, new a(typographyE, function2), dVarF, 54), dVarF, os9.i | 48);
            if (e.k()) {
                e.n();
            }
        } else {
            dVarF.q();
        }
        final Shapes shapes2 = shapesD;
        s6b s6bVarH = dVarF.H();
        if (s6bVarH != null) {
            final ColorScheme colorScheme2 = colorSchemeA;
            final c08 c08Var2 = c08VarC;
            final Typography typography2 = typographyE;
            s6bVarH.a(new Function2() { // from class: com.google.android.oh7
                public final Object invoke(Object obj, Object obj2) {
                    return ph7.i(colorScheme2, c08Var2, shapes2, typography2, function2, i, i2, (d) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void g(ColorScheme colorScheme, Shapes shapes, Typography typography, Function2<? super d, ? super Integer, Unit> function2, d dVar, final int i, final int i2) {
        int i3;
        final Function2<? super d, ? super Integer, Unit> function3;
        final Typography typography2;
        final Shapes shapes2;
        final ColorScheme colorScheme2;
        d dVarF = dVar.F(-449719819);
        if ((i & 6) == 0) {
            i3 = (((i2 & 1) == 0 && dVarF.x(colorScheme)) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= ((i2 & 2) == 0 && dVarF.x(shapes)) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= ((i2 & 4) == 0 && dVarF.x(typography)) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= dVarF.T(function2) ? 2048 : 1024;
        }
        if (dVarF.g((i3 & 1171) != 1170, i3 & 1)) {
            dVarF.U();
            if ((i & 1) == 0 || dVarF.t()) {
                if ((i2 & 1) != 0) {
                    colorScheme = kh7.a.a(dVarF, 6);
                    i3 &= -15;
                }
                if ((i2 & 2) != 0) {
                    shapes = kh7.a.d(dVarF, 6);
                    i3 &= -113;
                }
                if ((i2 & 4) != 0) {
                    typography = kh7.a.e(dVarF, 6);
                    i3 &= -897;
                }
            } else {
                dVarF.q();
                if ((i2 & 1) != 0) {
                    i3 &= -15;
                }
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                }
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
            }
            ColorScheme colorScheme3 = colorScheme;
            Shapes shapes3 = shapes;
            Typography typography3 = typography;
            dVarF.M();
            if (e.k()) {
                e.o(-449719819, i3, -1, "androidx.compose.material3.MaterialTheme (MaterialTheme.kt:59)");
            }
            int i4 = i3 << 3;
            f(colorScheme3, kh7.a.c(dVarF, 6), shapes3, typography3, function2, dVarF, (i3 & 14) | (i4 & 896) | (i4 & 7168) | (i4 & 57344), 0);
            function3 = function2;
            if (e.k()) {
                e.n();
            }
            colorScheme2 = colorScheme3;
            shapes2 = shapes3;
            typography2 = typography3;
        } else {
            function3 = function2;
            dVarF.q();
            typography2 = typography;
            shapes2 = shapes;
            colorScheme2 = colorScheme;
        }
        s6b s6bVarH = dVarF.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2() { // from class: com.google.android.lh7
                public final Object invoke(Object obj, Object obj2) {
                    return ph7.h(colorScheme2, shapes2, typography2, function3, i, i2, (d) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(ColorScheme colorScheme, Shapes shapes, Typography typography, Function2 function2, int i, int i2, d dVar, int i3) {
        g(colorScheme, shapes, typography, function2, dVar, saa.a(i | 1), i2);
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(ColorScheme colorScheme, c08 c08Var, Shapes shapes, Typography typography, Function2 function2, int i, int i2, d dVar, int i3) {
        f(colorScheme, c08Var, shapes, typography, function2, dVar, saa.a(i | 1), i2);
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final c08 j() {
        return c08.INSTANCE.a();
    }

    public static final SelectionColors l(ColorScheme colorScheme, d dVar, int i) {
        if (e.k()) {
            e.o(1866455512, i, -1, "androidx.compose.material3.rememberTextSelectionColors (MaterialTheme.kt:217)");
        }
        long primary = colorScheme.getPrimary();
        boolean zD = dVar.D(primary);
        Object objR = dVar.R();
        if (zD || objR == d.INSTANCE.a()) {
            SelectionColors selectionColors = new SelectionColors(primary, ei1.p(primary, 0.4f, 0.0f, 0.0f, 0.0f, 14, null), null);
            dVar.L(selectionColors);
            objR = selectionColors;
        }
        SelectionColors selectionColors2 = (SelectionColors) objR;
        if (e.k()) {
            e.n();
        }
        return selectionColors2;
    }
}
