package com.google.inputmethod;

import androidx.compose.p001foundation.layout.BoxScopeInstance;
import androidx.compose.p001foundation.layout.SizeKt;
import androidx.compose.p001foundation.layout.j;
import androidx.compose.p001foundation.text.Handle;
import androidx.compose.p001foundation.text.selection.SelectionHandleAnchor;
import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.b;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.draw.c;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.h;
import androidx.compose.ui.node.ComposeUiNode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u001a)\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a\u0019\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\t\u0010\n\u001a\u001b\u0010\r\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000e\"\u001a\u0010\u0014\u001a\u00020\u000f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u001a\u0010\u0017\u001a\u00020\u000f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0016\u0010\u0013¨\u0006\u0018"}, d2 = {"Lcom/google/android/co8;", "offsetProvider", "Landroidx/compose/ui/b;", "modifier", "Lcom/google/android/jf3;", "minTouchTargetSize", "", "g", "(Lcom/google/android/co8;Landroidx/compose/ui/b;JLandroidx/compose/runtime/d;II)V", "k", "(Landroidx/compose/ui/b;Landroidx/compose/runtime/d;II)V", "Lcom/google/android/ei1;", "handleColor", "m", "(Landroidx/compose/ui/b;J)Landroidx/compose/ui/b;", "Lcom/google/android/ff3;", "a", "F", "getCursorHandleHeight", "()F", "CursorHandleHeight", "b", "getCursorHandleWidth", "CursorHandleWidth", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class nk {
    private static final float a;
    private static final float b;

    static {
        float fI = ff3.i(25);
        a = fI;
        b = ff3.i(ff3.i(fI * 2.0f) / 2.4142137f);
    }

    public static final void g(final co8 co8Var, final b bVar, final long j, d dVar, final int i, final int i2) {
        int i3;
        d dVarF = dVar.F(1776202187);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? dVarF.x(co8Var) : dVarF.T(co8Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= dVarF.x(bVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= ((i2 & 4) == 0 && dVarF.D(j)) ? 256 : 128;
        }
        if (dVarF.g((i3 & 147) != 146, i3 & 1)) {
            dVarF.U();
            if ((i & 1) != 0 && !dVarF.t()) {
                dVarF.q();
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
            } else if ((i2 & 4) != 0) {
                j = jf3.INSTANCE.a();
                i3 &= -897;
            }
            dVarF.M();
            if (e.k()) {
                e.o(1776202187, i3, -1, "androidx.compose.foundation.text.CursorHandle (AndroidCursorHandle.android.kt:51)");
            }
            int i4 = i3 & 14;
            boolean z = i4 == 4 || ((i3 & 8) != 0 && dVarF.T(co8Var));
            Object objR = dVarF.R();
            if (z || objR == d.INSTANCE.a()) {
                objR = new Function1() { // from class: com.google.android.ik
                    public final Object invoke(Object obj) {
                        return nk.h(co8Var, (nfb) obj);
                    }
                };
                dVarF.L(objR);
            }
            final b bVarD = afb.d(bVar, false, (Function1) objR, 1, null);
            pn.l(co8Var, tc.INSTANCE.m(), ko1.e(-1653527038, true, new Function2() { // from class: com.google.android.jk
                public final Object invoke(Object obj, Object obj2) {
                    return nk.i(j, bVarD, (d) obj, ((Integer) obj2).intValue());
                }
            }, dVarF, 54), dVarF, i4 | 432);
            if (e.k()) {
                e.n();
            }
        } else {
            dVarF.q();
        }
        final long j2 = j;
        s6b s6bVarH = dVarF.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2() { // from class: com.google.android.kk
                public final Object invoke(Object obj, Object obj2) {
                    return nk.j(co8Var, bVar, j2, i, i2, (d) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(co8 co8Var, nfb nfbVar) {
        nfbVar.b(feb.d(), new SelectionHandleInfo(Handle.Cursor, co8Var.a(), SelectionHandleAnchor.Middle, true, null));
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(long j, b bVar, d dVar, int i) {
        if (dVar.g((i & 3) != 2, i & 1)) {
            if (e.k()) {
                e.o(-1653527038, i, -1, "androidx.compose.foundation.text.CursorHandle.<anonymous> (AndroidCursorHandle.android.kt:63)");
            }
            if (j != 9205357640488583168L) {
                dVar.y(-1244013944);
                b bVarP = SizeKt.p(bVar, jf3.h(j), jf3.g(j), 0.0f, 0.0f, 12, null);
                ej7 ej7VarI = j.i(tc.INSTANCE.m(), false);
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
                dud.i(dVarC, ej7VarI, companion.d());
                dud.i(dVarC, gs1VarJ, companion.f());
                dud.i(dVarC, Integer.valueOf(iHashCode), companion.c());
                dud.g(dVarC, companion.a());
                dud.i(dVarC, bVarE, companion.e());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.a;
                k(null, dVar, 0, 1);
                dVar.m();
                dVar.u();
            } else {
                dVar.y(-1243644858);
                k(bVar, dVar, 0, 0);
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
    public static final Unit j(co8 co8Var, b bVar, long j, int i, int i2, d dVar, int i3) {
        g(co8Var, bVar, j, dVar, saa.a(i | 1), i2);
        return Unit.a;
    }

    private static final void k(final b bVar, d dVar, final int i, final int i2) {
        int i3;
        d dVarF = dVar.F(694251107);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (dVarF.x(bVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if (dVarF.g((i3 & 3) != 2, i3 & 1)) {
            if (i4 != 0) {
                bVar = b.INSTANCE;
            }
            if (e.k()) {
                e.o(694251107, i3, -1, "androidx.compose.foundation.text.DefaultCursorHandle (AndroidCursorHandle.android.kt:82)");
            }
            qzb.a(m(SizeKt.v(bVar, b, a), ((SelectionColors) dVarF.v(jzc.c())).getSelectionHandleColor()), dVarF, 0);
            if (e.k()) {
                e.n();
            }
        } else {
            dVarF.q();
        }
        s6b s6bVarH = dVarF.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2() { // from class: com.google.android.lk
                public final Object invoke(Object obj, Object obj2) {
                    return nk.l(bVar, i, i2, (d) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(b bVar, int i, int i2, d dVar, int i3) {
        k(bVar, dVar, saa.a(i | 1), i2);
        return Unit.a;
    }

    private static final b m(b bVar, final long j) {
        return c.c(bVar, new Function1() { // from class: com.google.android.mk
            public final Object invoke(Object obj) {
                return nk.n(j, (CacheDrawScope) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ah3 n(long j, CacheDrawScope cacheDrawScope) {
        final float fIntBitsToFloat = Float.intBitsToFloat((int) (cacheDrawScope.d() >> 32)) / 2.0f;
        final ml5 ml5VarW = pn.w(cacheDrawScope, fIntBitsToFloat);
        final h hVarC = h.Companion.c(h.INSTANCE, j, 0, 2, null);
        return cacheDrawScope.j(new Function1() { // from class: com.google.android.hk
            public final Object invoke(Object obj) {
                return nk.o(fIntBitsToFloat, ml5VarW, hVarC, (fz1) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o(float f, ml5 ml5Var, h hVar, fz1 fz1Var) {
        fz1Var.j1();
        vg3 drawContext = fz1Var.getDrawContext();
        long jD = drawContext.d();
        drawContext.b().v();
        try {
            eh3 transform = drawContext.getTransform();
            eh3.f(transform, f, 0.0f, 2, null);
            transform.h(45.0f, rn8.INSTANCE.c());
            DrawScope.c2(fz1Var, ml5Var, 0L, 0.0f, null, hVar, 0, 46, null);
            return Unit.a;
        } finally {
            drawContext.b().o();
            drawContext.c(jD);
        }
    }
}
