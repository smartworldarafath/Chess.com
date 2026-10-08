package androidx.compose.p001foundation.layout;

import androidx.compose.p001foundation.layout.j;
import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.b;
import androidx.compose.ui.layout.o;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.inputmethod.dj7;
import com.google.inputmethod.dud;
import com.google.inputmethod.ej7;
import com.google.inputmethod.fj7;
import com.google.inputmethod.gs1;
import com.google.inputmethod.k58;
import com.google.inputmethod.kx1;
import com.google.inputmethod.pp1;
import com.google.inputmethod.q16;
import com.google.inputmethod.s6b;
import com.google.inputmethod.saa;
import com.google.inputmethod.tc;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001f\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\t\u0010\n\u001a\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u000b\u0010\f\u001aC\u0010\u0018\u001a\u00020\u0017*\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0007\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0017\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\u001c\u0010\u001d\" \u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f\" \u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001f\"\u0014\u0010$\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#\"\u001a\u0010(\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b%\u0010#\u001a\u0004\b&\u0010'\"\u001a\u0010,\u001a\u0004\u0018\u00010)*\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+\"\u0018\u0010/\u001a\u00020\u0000*\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.¨\u00060"}, d2 = {"", "propagate", "Lcom/google/android/k58;", "Lcom/google/android/tc;", "Lcom/google/android/ej7;", "f", "(Z)Lcom/google/android/k58;", "alignment", "propagateMinConstraints", "i", "(Lcom/google/android/tc;Z)Lcom/google/android/ej7;", "k", "(Lcom/google/android/tc;ZLandroidx/compose/runtime/d;I)Lcom/google/android/ej7;", "Landroidx/compose/ui/layout/o$a;", "Landroidx/compose/ui/layout/o;", "placeable", "Lcom/google/android/dj7;", "measurable", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "", "boxWidth", "boxHeight", "", "j", "(Landroidx/compose/ui/layout/o$a;Landroidx/compose/ui/layout/o;Lcom/google/android/dj7;Landroidx/compose/ui/unit/LayoutDirection;IILcom/google/android/tc;)V", "Landroidx/compose/ui/b;", "modifier", "b", "(Landroidx/compose/ui/b;Landroidx/compose/runtime/d;I)V", "a", "Lcom/google/android/k58;", "Cache1", "Cache2", "c", "Lcom/google/android/ej7;", "DefaultBoxMeasurePolicy", "d", "getEmptyBoxMeasurePolicy", "()Lcom/google/android/ej7;", "EmptyBoxMeasurePolicy", "Landroidx/compose/foundation/layout/h;", "g", "(Lcom/google/android/dj7;)Landroidx/compose/foundation/layout/h;", "boxChildDataNode", "h", "(Lcom/google/android/dj7;)Z", "matchesParentSize", "foundation-layout"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class j {
    private static final k58<tc, ej7> a = f(true);
    private static final k58<tc, ej7> b = f(false);
    private static final ej7 c = new n(tc.INSTANCE.o(), false);
    private static final ej7 d = a.a;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements ej7 {
        public static final a a = new a();

        a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit b(o.a aVar) {
            return Unit.a;
        }

        @Override // com.google.inputmethod.ej7
        /* JADX INFO: renamed from: measure-3p2s80s */
        public final fj7 mo0measure3p2s80s(androidx.compose.ui.layout.j jVar, List<? extends dj7> list, long j) {
            return androidx.compose.ui.layout.j.Q1(jVar, kx1.n(j), kx1.m(j), null, new Function1() { // from class: androidx.compose.foundation.layout.i
                public final Object invoke(Object obj) {
                    return j.a.b((o.a) obj);
                }
            }, 4, null);
        }
    }

    public static final void b(final b bVar, d dVar, final int i) {
        int i2;
        d dVarF = dVar.F(-211209833);
        if ((i & 6) == 0) {
            i2 = (dVarF.x(bVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (dVarF.g((i2 & 3) != 2, i2 & 1)) {
            if (e.k()) {
                e.o(-211209833, i2, -1, "androidx.compose.foundation.layout.Box (Box.kt:232)");
            }
            ej7 ej7Var = d;
            int iHashCode = Long.hashCode(pp1.b(dVarF, 0));
            b bVarE = ComposedModifierKt.e(dVarF, bVar);
            gs1 gs1VarJ = dVarF.j();
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> function0B = companion.b();
            if (dVarF.G() == null) {
                pp1.d();
            }
            dVarF.o();
            if (dVarF.E()) {
                dVarF.W(function0B);
            } else {
                dVarF.k();
            }
            d dVarC = dud.c(dVarF);
            dud.i(dVarC, ej7Var, companion.d());
            dud.i(dVarC, gs1VarJ, companion.f());
            dud.g(dVarC, companion.a());
            dud.i(dVarC, bVarE, companion.e());
            dud.i(dVarC, Integer.valueOf(iHashCode), companion.c());
            dVarF.m();
            if (e.k()) {
                e.n();
            }
        } else {
            dVarF.q();
        }
        s6b s6bVarH = dVarF.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2() { // from class: com.google.android.kt0
                public final Object invoke(Object obj, Object obj2) {
                    return j.c(bVar, i, (d) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(b bVar, int i, d dVar, int i2) {
        b(bVar, dVar, saa.a(i | 1));
        return Unit.a;
    }

    private static final k58<tc, ej7> f(boolean z) {
        k58<tc, ej7> k58Var = new k58<>(9);
        tc.Companion companion = tc.INSTANCE;
        k58Var.x(companion.o(), new n(companion.o(), z));
        k58Var.x(companion.m(), new n(companion.m(), z));
        k58Var.x(companion.n(), new n(companion.n(), z));
        k58Var.x(companion.h(), new n(companion.h(), z));
        k58Var.x(companion.e(), new n(companion.e(), z));
        k58Var.x(companion.f(), new n(companion.f(), z));
        k58Var.x(companion.d(), new n(companion.d(), z));
        k58Var.x(companion.b(), new n(companion.b(), z));
        k58Var.x(companion.c(), new n(companion.c(), z));
        return k58Var;
    }

    private static final h g(dj7 dj7Var) {
        Object objF = dj7Var.getParentData();
        if (objF instanceof h) {
            return (h) objF;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean h(dj7 dj7Var) {
        h hVarG = g(dj7Var);
        if (hVarG != null) {
            return hVarG.getMatchParentSize();
        }
        return false;
    }

    public static final ej7 i(tc tcVar, boolean z) {
        ej7 ej7VarE = (z ? a : b).e(tcVar);
        return ej7VarE == null ? new n(tcVar, z) : ej7VarE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(o.a aVar, o oVar, dj7 dj7Var, LayoutDirection layoutDirection, int i, int i2, tc tcVar) {
        tc alignment;
        h hVarG = g(dj7Var);
        o.a.F(aVar, oVar, ((hVarG == null || (alignment = hVarG.getAlignment()) == null) ? tcVar : alignment).a(q16.c((((long) oVar.getWidth()) << 32) | (((long) oVar.getHeight()) & 4294967295L)), q16.c((((long) i2) & 4294967295L) | (((long) i) << 32)), layoutDirection), 0.0f, 2, null);
    }

    public static final ej7 k(tc tcVar, boolean z, d dVar, int i) {
        ej7 ej7Var;
        if (e.k()) {
            e.o(56522820, i, -1, "androidx.compose.foundation.layout.rememberBoxMeasurePolicy (Box.kt:109)");
        }
        if (!Intrinsics.e(tcVar, tc.INSTANCE.o()) || z) {
            dVar.y(244380021);
            boolean z2 = ((((i & 14) ^ 6) > 4 && dVar.x(tcVar)) || (i & 6) == 4) | ((((i & 112) ^ 48) > 32 && dVar.A(z)) || (i & 48) == 32);
            Object objR = dVar.R();
            if (z2 || objR == d.INSTANCE.a()) {
                objR = new n(tcVar, z);
                dVar.L(objR);
            }
            ej7Var = (n) objR;
            dVar.u();
        } else {
            dVar.y(244332343);
            dVar.u();
            ej7Var = c;
        }
        if (e.k()) {
            e.n();
        }
        return ej7Var;
    }
}
