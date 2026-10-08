package androidx.p008glance.layout;

import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import androidx.p008glance.g;
import com.google.inputmethod.dud;
import com.google.inputmethod.dz;
import com.google.inputmethod.pp1;
import com.google.inputmethod.s6b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a1\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/glance/g;", "modifier", "Landroidx/glance/layout/a;", "contentAlignment", "Lkotlin/Function0;", "", "content", "a", "(Landroidx/glance/g;Landroidx/glance/layout/a;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/d;II)V", "glance_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class BoxKt {
    public static final void a(g gVar, Alignment alignment, final Function2<? super d, ? super Integer, Unit> function2, d dVar, final int i, final int i2) {
        int i3;
        d dVarF = dVar.F(1959221577);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (dVarF.x(gVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= dVarF.x(alignment) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= dVarF.x(function2) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && dVarF.c()) {
            dVarF.q();
        } else {
            if (i4 != 0) {
                gVar = g.INSTANCE;
            }
            if (i5 != 0) {
                alignment = Alignment.INSTANCE.e();
            }
            if (e.k()) {
                e.o(1959221577, i3, -1, "androidx.glance.layout.Box (Box.kt:64)");
            }
            BoxKt$Box$1 boxKt$Box$1 = BoxKt$Box$1.a;
            dVarF.Q(578571862);
            int i6 = i3 & 896;
            dVarF.Q(-548224868);
            if (!(dVarF.G() instanceof dz)) {
                pp1.d();
            }
            dVarF.J();
            if (dVarF.E()) {
                dVarF.W(boxKt$Box$1);
            } else {
                dVarF.k();
            }
            d dVarC = dud.c(dVarF);
            dud.i(dVarC, gVar, new Function2<EmittableBox, g, Unit>() { // from class: androidx.glance.layout.BoxKt$Box$2$1
                public final void a(EmittableBox emittableBox, g gVar2) {
                    emittableBox.b(gVar2);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    a((EmittableBox) obj, (g) obj2);
                    return Unit.a;
                }
            });
            dud.i(dVarC, alignment, new Function2<EmittableBox, Alignment, Unit>() { // from class: androidx.glance.layout.BoxKt$Box$2$2
                public final void a(EmittableBox emittableBox, Alignment alignment2) {
                    emittableBox.i(alignment2);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    a((EmittableBox) obj, (Alignment) obj2);
                    return Unit.a;
                }
            });
            function2.invoke(dVarF, Integer.valueOf((i6 >> 6) & 14));
            dVarF.m();
            dVarF.a0();
            dVarF.a0();
            if (e.k()) {
                e.n();
            }
        }
        final g gVar2 = gVar;
        final Alignment alignment2 = alignment;
        s6b s6bVarH = dVarF.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.glance.layout.BoxKt$Box$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((d) obj, ((Number) obj2).intValue());
                    return Unit.a;
                }

                public final void invoke(d dVar2, int i7) {
                    BoxKt.a(gVar2, alignment2, function2, dVar2, i | 1, i2);
                }
            });
        }
    }
}
