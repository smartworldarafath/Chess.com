package com.google.inputmethod;

import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.b;
import androidx.compose.ui.layout.j;
import androidx.compose.ui.layout.o;
import androidx.compose.ui.node.ComposeUiNode;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a'\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/b;", "modifier", "Lkotlin/Function0;", "", "content", "b", "(Landroidx/compose/ui/b;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/d;II)V", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class cqb {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements ej7 {
        public static final a a = new a();

        a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit b(List list, o.a aVar) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                o.a.z(aVar, (o) list.get(i), 0, 0, 0.0f, 4, null);
            }
            return Unit.a;
        }

        @Override // com.google.inputmethod.ej7
        /* JADX INFO: renamed from: measure-3p2s80s */
        public final fj7 mo0measure3p2s80s(j jVar, List<? extends dj7> list, long j) {
            final ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            int iMax = 0;
            int iMax2 = 0;
            for (int i = 0; i < size; i++) {
                o oVarR0 = list.get(i).r0(j);
                iMax = Math.max(iMax, oVarR0.getWidth());
                iMax2 = Math.max(iMax2, oVarR0.getHeight());
                arrayList.add(oVarR0);
            }
            return j.Q1(jVar, iMax, iMax2, null, new Function1() { // from class: com.google.android.bqb
                public final Object invoke(Object obj) {
                    return cqb.a.b(arrayList, (o.a) obj);
                }
            }, 4, null);
        }
    }

    public static final void b(final b bVar, final Function2<? super d, ? super Integer, Unit> function2, d dVar, final int i, final int i2) {
        int i3;
        d dVarF = dVar.F(-1854833411);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (dVarF.x(bVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= dVarF.T(function2) ? 32 : 16;
        }
        if (dVarF.g((i3 & 19) != 18, i3 & 1)) {
            if (i4 != 0) {
                bVar = b.INSTANCE;
            }
            if (e.k()) {
                e.o(-1854833411, i3, -1, "androidx.compose.foundation.text.selection.SimpleLayout (SimpleLayout.kt:30)");
            }
            Object objR = dVarF.R();
            if (objR == d.INSTANCE.a()) {
                objR = a.a;
                dVarF.L(objR);
            }
            ej7 ej7Var = (ej7) objR;
            int i5 = ((i3 >> 3) & 14) | 384 | ((i3 << 3) & 112);
            int iHashCode = Long.hashCode(pp1.b(dVarF, 0));
            gs1 gs1VarJ = dVarF.j();
            b bVarE = ComposedModifierKt.e(dVarF, bVar);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> function0B = companion.b();
            int i6 = ((i5 << 6) & 896) | 6;
            if (dVarF.G() == null) {
                pp1.d();
            }
            dVarF.o();
            if (dVarF.getInserting()) {
                dVarF.W(function0B);
            } else {
                dVarF.k();
            }
            d dVarC = dud.c(dVarF);
            dud.i(dVarC, ej7Var, companion.d());
            dud.i(dVarC, gs1VarJ, companion.f());
            dud.i(dVarC, Integer.valueOf(iHashCode), companion.c());
            dud.g(dVarC, companion.a());
            dud.i(dVarC, bVarE, companion.e());
            function2.invoke(dVarF, Integer.valueOf((i6 >> 6) & 14));
            dVarF.m();
            if (e.k()) {
                e.n();
            }
        } else {
            dVarF.q();
        }
        s6b s6bVarH = dVarF.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2() { // from class: com.google.android.aqb
                public final Object invoke(Object obj, Object obj2) {
                    return cqb.c(bVar, function2, i, i2, (d) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(b bVar, Function2 function2, int i, int i2, d dVar, int i3) {
        b(bVar, function2, dVar, saa.a(i | 1), i2);
        return Unit.a;
    }
}
