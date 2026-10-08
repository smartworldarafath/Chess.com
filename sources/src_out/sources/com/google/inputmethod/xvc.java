package com.google.inputmethod;

import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.b;
import androidx.compose.ui.layout.j;
import androidx.compose.ui.layout.o;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.font.l;
import androidx.compose.ui.text.font.t;
import androidx.compose.ui.text.font.u;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.android.ps4;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.g;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\u001a\u001b\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001b\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0005\u0010\u0004¨\u0006\b²\u0006\f\u0010\u0007\u001a\u00020\u00068\nX\u008a\u0084\u0002"}, d2 = {"Landroidx/compose/ui/b;", "Landroidx/compose/ui/text/y;", "style", "i", "(Landroidx/compose/ui/b;Landroidx/compose/ui/text/y;)Landroidx/compose/ui/b;", "d", "", "typeface", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class xvc {
    public static final b d(b bVar, final TextStyle textStyle) {
        return ComposedModifierKt.c(bVar, null, new ps4() { // from class: com.google.android.uvc
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return xvc.e(textStyle, (b) obj, (d) obj2, ((Integer) obj3).intValue());
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b e(TextStyle textStyle, b bVar, d dVar, int i) {
        dVar.y(-390200690);
        if (e.k()) {
            e.o(-390200690, i, -1, "androidx.compose.foundation.text.legacyTextFieldMinSize.<anonymous> (TextFieldSize.kt:163)");
        }
        f43 f43Var = (f43) dVar.v(CompositionLocalsKt.g());
        l.b bVar2 = (l.b) dVar.v(CompositionLocalsKt.i());
        LayoutDirection layoutDirection = (LayoutDirection) dVar.v(CompositionLocalsKt.m());
        boolean zX = dVar.x(textStyle) | dVar.C(layoutDirection.ordinal());
        Object objR = dVar.R();
        if (zX || objR == d.INSTANCE.a()) {
            objR = vzc.d(textStyle, layoutDirection);
            dVar.L(objR);
        }
        TextStyle textStyle2 = (TextStyle) objR;
        boolean zX2 = dVar.x(bVar2) | dVar.x(textStyle2);
        Object objR2 = dVar.R();
        if (zX2 || objR2 == d.INSTANCE.a()) {
            l lVarJ = textStyle2.j();
            FontWeight fontWeightO = textStyle2.o();
            if (fontWeightO == null) {
                fontWeightO = FontWeight.INSTANCE.f();
            }
            t tVarM = textStyle2.m();
            int value = tVarM != null ? tVarM.getValue() : t.INSTANCE.b();
            u uVarN = textStyle2.n();
            objR2 = bVar2.a(lVarJ, fontWeightO, value, uVarN != null ? uVarN.getValue() : u.INSTANCE.a());
            dVar.L(objR2);
        }
        q6c q6cVar = (q6c) objR2;
        Object objR3 = dVar.R();
        d.Companion companion = d.INSTANCE;
        if (objR3 == companion.a()) {
            objR3 = new f07(layoutDirection, f43Var, bVar2, textStyle, f(q6cVar));
            dVar.L(objR3);
        }
        final f07 f07Var = (f07) objR3;
        f07Var.c(layoutDirection, f43Var, bVar2, textStyle2, f(q6cVar));
        b.Companion companion2 = b.INSTANCE;
        boolean zT = dVar.T(f07Var);
        Object objR4 = dVar.R();
        if (zT || objR4 == companion.a()) {
            objR4 = new ps4() { // from class: com.google.android.vvc
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return xvc.g(f07Var, (j) obj, (dj7) obj2, (kx1) obj3);
                }
            };
            dVar.L(objR4);
        }
        b bVarA = zn6.a(companion2, (ps4) objR4);
        if (e.k()) {
            e.n();
        }
        dVar.u();
        return bVarA;
    }

    private static final Object f(q6c<? extends Object> q6cVar) {
        return q6cVar.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fj7 g(f07 f07Var, j jVar, dj7 dj7Var, kx1 kx1Var) {
        long minSize = f07Var.getMinSize();
        final o oVarR0 = dj7Var.r0(kx1.d(kx1Var.getValue(), g.o((int) (minSize >> 32), kx1.n(kx1Var.getValue()), kx1.l(kx1Var.getValue())), 0, g.o((int) (minSize & 4294967295L), kx1.m(kx1Var.getValue()), kx1.k(kx1Var.getValue())), 0, 10, null));
        return j.Q1(jVar, oVarR0.getWidth(), oVarR0.getHeight(), null, new Function1() { // from class: com.google.android.wvc
            public final Object invoke(Object obj) {
                return xvc.h(oVarR0, (o.a) obj);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(o oVar, o.a aVar) {
        o.a.L(aVar, oVar, 0, 0, 0.0f, 4, null);
        return Unit.a;
    }

    public static final b i(b bVar, TextStyle textStyle) {
        return up1.isBasicTextFieldMinSizeOptimizationEnabled ? bVar.then(new tvc(textStyle)) : d(bVar, textStyle);
    }
}
