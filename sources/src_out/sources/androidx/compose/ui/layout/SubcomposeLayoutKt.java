package androidx.compose.ui.layout;

import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode;
import com.google.inputmethod.dud;
import com.google.inputmethod.fj7;
import com.google.inputmethod.gs1;
import com.google.inputmethod.kx1;
import com.google.inputmethod.pp1;
import com.google.inputmethod.s6b;
import com.google.inputmethod.saa;
import com.google.inputmethod.scc;
import com.google.inputmethod.vn3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003*\u0001\u000e\u001a3\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0002H\u0007¢\u0006\u0004\b\b\u0010\t\u001a;\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0002H\u0007¢\u0006\u0004\b\f\u0010\r\"\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u000f\"\u0014\u0010\u0013\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0012¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/b;", "modifier", "Lkotlin/Function2;", "Lcom/google/android/scc;", "Lcom/google/android/kx1;", "Lcom/google/android/fj7;", "measurePolicy", "", "a", "(Landroidx/compose/ui/b;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/d;II)V", "Landroidx/compose/ui/layout/SubcomposeLayoutState;", "state", "b", "(Landroidx/compose/ui/layout/SubcomposeLayoutState;Landroidx/compose/ui/b;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/d;II)V", "androidx/compose/ui/layout/SubcomposeLayoutKt$a", "Landroidx/compose/ui/layout/SubcomposeLayoutKt$a;", "ReusedSlotId", "", "Ljava/lang/Object;", "UnspecifiedSlotId", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class SubcomposeLayoutKt {
    private static final a a = new a();
    private static final Object b = new Object();

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/compose/ui/layout/SubcomposeLayoutKt$a", "", "", "toString", "()Ljava/lang/String;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        a() {
        }

        public String toString() {
            return "ReusedSlotId";
        }
    }

    public static final void a(final androidx.compose.ui.b bVar, Function2<? super scc, ? super kx1, ? extends fj7> function2, androidx.compose.p004runtime.d dVar, final int i, final int i2) {
        int i3;
        final Function2<? super scc, ? super kx1, ? extends fj7> function3;
        androidx.compose.p004runtime.d dVarF = dVar.F(-1298353104);
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
                bVar = androidx.compose.ui.b.INSTANCE;
            }
            androidx.compose.ui.b bVar2 = bVar;
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.o(-1298353104, i3, -1, "androidx.compose.ui.layout.SubcomposeLayout (SubcomposeLayout.kt:95)");
            }
            Object objR = dVarF.R();
            if (objR == androidx.compose.p004runtime.d.INSTANCE.a()) {
                objR = new SubcomposeLayoutState();
                dVarF.L(objR);
            }
            function3 = function2;
            b((SubcomposeLayoutState) objR, bVar2, function3, dVarF, (i3 << 3) & 1008, 0);
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.n();
            }
            bVar = bVar2;
        } else {
            function3 = function2;
            dVarF.q();
        }
        s6b s6bVarH = dVarF.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2<androidx.compose.p004runtime.d, Integer, Unit>() { // from class: androidx.compose.ui.layout.SubcomposeLayoutKt$SubcomposeLayout$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((androidx.compose.p004runtime.d) obj, ((Number) obj2).intValue());
                    return Unit.a;
                }

                public final void invoke(androidx.compose.p004runtime.d dVar2, int i5) {
                    SubcomposeLayoutKt.a(bVar, function3, dVar2, saa.a(i | 1), i2);
                }
            });
        }
    }

    public static final void b(final SubcomposeLayoutState subcomposeLayoutState, androidx.compose.ui.b bVar, final Function2<? super scc, ? super kx1, ? extends fj7> function2, androidx.compose.p004runtime.d dVar, final int i, final int i2) {
        int i3;
        androidx.compose.p004runtime.d dVarF = dVar.F(-511989831);
        if ((i & 6) == 0) {
            i3 = (dVarF.T(subcomposeLayoutState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= dVarF.x(bVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= dVarF.T(function2) ? 256 : 128;
        }
        if (dVarF.g((i3 & 147) != 146, i3 & 1)) {
            if (i4 != 0) {
                bVar = androidx.compose.ui.b.INSTANCE;
            }
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.o(-511989831, i3, -1, "androidx.compose.ui.layout.SubcomposeLayout (SubcomposeLayout.kt:128)");
            }
            int iHashCode = Long.hashCode(pp1.b(dVarF, 0));
            androidx.compose.p004runtime.f fVarE = pp1.e(dVarF, 0);
            androidx.compose.ui.b bVarE = ComposedModifierKt.e(dVarF, bVar);
            gs1 gs1VarJ = dVarF.j();
            Function0<LayoutNode> function0A = LayoutNode.INSTANCE.a();
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
            dud.i(dVarC, subcomposeLayoutState, subcomposeLayoutState.h());
            dud.i(dVarC, fVarE, subcomposeLayoutState.f());
            dud.i(dVarC, function2, subcomposeLayoutState.g());
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            dud.i(dVarC, gs1VarJ, companion.f());
            dud.g(dVarC, companion.a());
            dud.i(dVarC, bVarE, companion.e());
            dud.i(dVarC, Integer.valueOf(iHashCode), companion.c());
            dVarF.m();
            if (dVarF.c()) {
                dVarF.y(-1259187287);
                dVarF.u();
            } else {
                dVarF.y(-1259245908);
                boolean zT = dVarF.T(subcomposeLayoutState);
                Object objR = dVarF.R();
                if (zT || objR == androidx.compose.p004runtime.d.INSTANCE.a()) {
                    objR = new Function0<Unit>() { // from class: androidx.compose.ui.layout.SubcomposeLayoutKt$SubcomposeLayout$4$1
                        {
                            super(0);
                        }

                        public /* bridge */ /* synthetic */ Object invoke() {
                            m17invoke();
                            return Unit.a;
                        }

                        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                        public final void m17invoke() {
                            subcomposeLayoutState.e();
                        }
                    };
                    dVarF.L(objR);
                }
                vn3.i((Function0) objR, dVarF, 0);
                dVarF.u();
            }
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.n();
            }
        } else {
            dVarF.q();
        }
        final androidx.compose.ui.b bVar2 = bVar;
        s6b s6bVarH = dVarF.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2<androidx.compose.p004runtime.d, Integer, Unit>() { // from class: androidx.compose.ui.layout.SubcomposeLayoutKt$SubcomposeLayout$5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((androidx.compose.p004runtime.d) obj, ((Number) obj2).intValue());
                    return Unit.a;
                }

                public final void invoke(androidx.compose.p004runtime.d dVar2, int i5) {
                    SubcomposeLayoutKt.b(subcomposeLayoutState, bVar2, function2, dVar2, saa.a(i | 1), i2);
                }
            });
        }
    }
}
