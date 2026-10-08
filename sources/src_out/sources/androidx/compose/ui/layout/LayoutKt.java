package androidx.compose.ui.layout;

import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode;
import com.google.android.ps4;
import com.google.android.r43;
import com.google.inputmethod.dud;
import com.google.inputmethod.ej7;
import com.google.inputmethod.gs1;
import com.google.inputmethod.ko1;
import com.google.inputmethod.pp1;
import com.google.inputmethod.rtb;
import com.google.inputmethod.s6b;
import com.google.inputmethod.saa;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a)\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a)\u0010\u000b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0004\u0012\u00020\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a/\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"", "Lkotlin/Function0;", "", "contents", "b", "(Ljava/util/List;)Lkotlin/jvm/functions/Function2;", "Landroidx/compose/ui/b;", "modifier", "Lkotlin/Function1;", "Lcom/google/android/rtb;", "Landroidx/compose/ui/node/ComposeUiNode;", "c", "(Landroidx/compose/ui/b;)Lcom/google/android/ps4;", "content", "Lcom/google/android/ej7;", "measurePolicy", "a", "(Landroidx/compose/ui/b;Lkotlin/jvm/functions/Function2;Lcom/google/android/ej7;Landroidx/compose/runtime/d;II)V", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class LayoutKt {
    @r43
    public static final void a(androidx.compose.ui.b bVar, final Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> function2, final ej7 ej7Var, androidx.compose.p004runtime.d dVar, final int i, final int i2) {
        int i3;
        androidx.compose.p004runtime.d dVarF = dVar.F(-1663319424);
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
        if ((i & 384) == 0) {
            i3 |= dVarF.x(ej7Var) ? 256 : 128;
        }
        if (dVarF.g((i3 & 147) != 146, i3 & 1)) {
            if (i4 != 0) {
                bVar = androidx.compose.ui.b.INSTANCE;
            }
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.o(-1663319424, i3, -1, "androidx.compose.ui.layout.MultiMeasureLayout (Layout.kt:241)");
            }
            int iHashCode = Integer.hashCode(pp1.a(dVarF, 0));
            androidx.compose.ui.b bVarE = ComposedModifierKt.e(dVarF, bVar);
            gs1 gs1VarJ = dVarF.j();
            Function0<LayoutNode> function0A = LayoutNode.INSTANCE.a();
            int i5 = ((i3 << 3) & 896) | 6;
            if (dVarF.G() == null) {
                pp1.d();
            }
            dVarF.o();
            if (dVarF.getInserting()) {
                dVarF.W(function0A);
            } else {
                dVarF.k();
            }
            androidx.compose.p004runtime.d dVarC = dud.c(dVarF);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            dud.i(dVarC, ej7Var, companion.d());
            dud.i(dVarC, gs1VarJ, companion.f());
            dud.e(dVarC, new Function1<LayoutNode, Unit>() { // from class: androidx.compose.ui.layout.LayoutKt$MultiMeasureLayout$1$1
                public final void a(LayoutNode layoutNode) {
                    layoutNode.Q1(true);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    a((LayoutNode) obj);
                    return Unit.a;
                }
            });
            dud.g(dVarC, companion.a());
            dud.i(dVarC, bVarE, companion.e());
            dud.i(dVarC, Integer.valueOf(iHashCode), companion.c());
            function2.invoke(dVarF, Integer.valueOf((i5 >> 6) & 14));
            dVarF.m();
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.n();
            }
        } else {
            dVarF.q();
        }
        final androidx.compose.ui.b bVar2 = bVar;
        s6b s6bVarH = dVarF.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2<androidx.compose.p004runtime.d, Integer, Unit>() { // from class: androidx.compose.ui.layout.LayoutKt$MultiMeasureLayout$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((androidx.compose.p004runtime.d) obj, ((Number) obj2).intValue());
                    return Unit.a;
                }

                public final void invoke(androidx.compose.p004runtime.d dVar2, int i6) {
                    LayoutKt.a(bVar2, function2, ej7Var, dVar2, saa.a(i | 1), i2);
                }
            });
        }
    }

    public static final Function2<androidx.compose.p004runtime.d, Integer, Unit> b(final List<? extends Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit>> list) {
        return ko1.c(1271844412, true, new Function2<androidx.compose.p004runtime.d, Integer, Unit>() { // from class: androidx.compose.ui.layout.LayoutKt$combineAsVirtualLayouts$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((androidx.compose.p004runtime.d) obj, ((Number) obj2).intValue());
                return Unit.a;
            }

            public final void invoke(androidx.compose.p004runtime.d dVar, int i) {
                if (!dVar.g((i & 3) != 2, i & 1)) {
                    dVar.q();
                    return;
                }
                if (androidx.compose.p004runtime.e.k()) {
                    androidx.compose.p004runtime.e.o(1271844412, i, -1, "androidx.compose.ui.layout.combineAsVirtualLayouts.<anonymous> (Layout.kt:180)");
                }
                List<Function2<androidx.compose.p004runtime.d, Integer, Unit>> list2 = list;
                int size = list2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    Function2<androidx.compose.p004runtime.d, Integer, Unit> function2 = list2.get(i2);
                    int iHashCode = Long.hashCode(pp1.b(dVar, 0));
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> function0G = companion.g();
                    if (dVar.G() == null) {
                        pp1.d();
                    }
                    dVar.o();
                    if (dVar.getInserting()) {
                        dVar.W(function0G);
                    } else {
                        dVar.k();
                    }
                    dud.i(dud.c(dVar), Integer.valueOf(iHashCode), companion.c());
                    function2.invoke(dVar, 0);
                    dVar.m();
                }
                if (androidx.compose.p004runtime.e.k()) {
                    androidx.compose.p004runtime.e.n();
                }
            }
        });
    }

    public static final ps4<rtb<ComposeUiNode>, androidx.compose.p004runtime.d, Integer, Unit> c(final androidx.compose.ui.b bVar) {
        return ko1.c(-511438721, true, new ps4<rtb<ComposeUiNode>, androidx.compose.p004runtime.d, Integer, Unit>() { // from class: androidx.compose.ui.layout.LayoutKt$materializerOf$1
            {
                super(3);
            }

            public final void a(androidx.compose.p004runtime.d dVar, androidx.compose.p004runtime.d dVar2, int i) {
                if (androidx.compose.p004runtime.e.k()) {
                    androidx.compose.p004runtime.e.o(-511438721, i, -1, "androidx.compose.ui.layout.materializerOf.<anonymous> (Layout.kt:200)");
                }
                int iHashCode = Long.hashCode(pp1.b(dVar2, 0));
                androidx.compose.ui.b bVarE = ComposedModifierKt.e(dVar2, bVar);
                dVar.Q(509942095);
                androidx.compose.p004runtime.d dVarC = dud.c(dVar);
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                dud.i(dVarC, bVarE, companion.e());
                dud.i(dVarC, Integer.valueOf(iHashCode), companion.c());
                dVar.a0();
                if (androidx.compose.p004runtime.e.k()) {
                    androidx.compose.p004runtime.e.n();
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                a(((rtb) obj).getComposer(), (androidx.compose.p004runtime.d) obj2, ((Number) obj3).intValue());
                return Unit.a;
            }
        });
    }
}
