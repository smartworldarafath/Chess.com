package androidx.p008glance.p009appwidget;

import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import androidx.p008glance.g;
import com.google.inputmethod.EmittableCircularProgressIndicator;
import com.google.inputmethod.dud;
import com.google.inputmethod.dz;
import com.google.inputmethod.pp1;
import com.google.inputmethod.s6b;
import com.google.inputmethod.ti1;
import com.google.inputmethod.vp9;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a#\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/glance/g;", "modifier", "Lcom/google/android/ti1;", "color", "", "a", "(Landroidx/glance/g;Lcom/google/android/ti1;Landroidx/compose/runtime/d;II)V", "glance-appwidget_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class CircularProgressIndicatorKt {
    public static final void a(final g gVar, final ti1 ti1Var, d dVar, final int i, final int i2) {
        int i3;
        d dVarF = dVar.F(-525156579);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (dVarF.x(gVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= ((i2 & 2) == 0 && dVarF.x(ti1Var)) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && dVarF.c()) {
            dVarF.q();
        } else {
            dVarF.U();
            if ((i & 1) == 0 || dVarF.t()) {
                if (i4 != 0) {
                    gVar = g.INSTANCE;
                }
                if ((i2 & 2) != 0) {
                    ti1Var = vp9.a.a();
                    i3 &= -113;
                }
            } else {
                dVarF.q();
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                }
            }
            dVarF.M();
            if (e.k()) {
                e.o(-525156579, i3, -1, "androidx.glance.appwidget.CircularProgressIndicator (CircularProgressIndicator.kt:35)");
            }
            final CircularProgressIndicatorKt$CircularProgressIndicator$1 circularProgressIndicatorKt$CircularProgressIndicator$1 = CircularProgressIndicatorKt$CircularProgressIndicator$1.a;
            dVarF.Q(-1115894518);
            dVarF.Q(1886828752);
            if (!(dVarF.G() instanceof dz)) {
                pp1.d();
            }
            dVarF.J();
            if (dVarF.E()) {
                dVarF.W(new Function0<EmittableCircularProgressIndicator>() { // from class: androidx.glance.appwidget.CircularProgressIndicatorKt$CircularProgressIndicator$$inlined$GlanceNode$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.vp3, java.lang.Object] */
                    public final EmittableCircularProgressIndicator invoke() {
                        return circularProgressIndicatorKt$CircularProgressIndicator$1.invoke();
                    }
                });
            } else {
                dVarF.k();
            }
            d dVarC = dud.c(dVarF);
            dud.i(dVarC, gVar, new Function2<EmittableCircularProgressIndicator, g, Unit>() { // from class: androidx.glance.appwidget.CircularProgressIndicatorKt$CircularProgressIndicator$2$1
                public final void a(EmittableCircularProgressIndicator emittableCircularProgressIndicator, g gVar2) {
                    emittableCircularProgressIndicator.b(gVar2);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    a((EmittableCircularProgressIndicator) obj, (g) obj2);
                    return Unit.a;
                }
            });
            dud.i(dVarC, ti1Var, new Function2<EmittableCircularProgressIndicator, ti1, Unit>() { // from class: androidx.glance.appwidget.CircularProgressIndicatorKt$CircularProgressIndicator$2$2
                public final void a(EmittableCircularProgressIndicator emittableCircularProgressIndicator, ti1 ti1Var2) {
                    emittableCircularProgressIndicator.d(ti1Var2);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    a((EmittableCircularProgressIndicator) obj, (ti1) obj2);
                    return Unit.a;
                }
            });
            dVarF.m();
            dVarF.a0();
            dVarF.a0();
            if (e.k()) {
                e.n();
            }
        }
        s6b s6bVarH = dVarF.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.glance.appwidget.CircularProgressIndicatorKt$CircularProgressIndicator$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((d) obj, ((Number) obj2).intValue());
                    return Unit.a;
                }

                public final void invoke(d dVar2, int i5) {
                    CircularProgressIndicatorKt.a(gVar, ti1Var, dVar2, i | 1, i2);
                }
            });
        }
    }
}
