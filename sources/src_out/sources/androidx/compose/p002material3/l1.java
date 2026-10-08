package androidx.compose.p002material3;

import androidx.compose.p001foundation.layout.BoxScopeInstance;
import androidx.compose.p001foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.p001foundation.layout.g1;
import androidx.compose.p001foundation.layout.j;
import androidx.compose.p002material3.l1;
import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.s0;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import androidx.compose.ui.layout.o;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.android.ps4;
import com.google.inputmethod.afc;
import com.google.inputmethod.b44;
import com.google.inputmethod.bj1;
import com.google.inputmethod.dj7;
import com.google.inputmethod.dud;
import com.google.inputmethod.ej7;
import com.google.inputmethod.ff3;
import com.google.inputmethod.fj7;
import com.google.inputmethod.gs1;
import com.google.inputmethod.hp1;
import com.google.inputmethod.j3b;
import com.google.inputmethod.kh7;
import com.google.inputmethod.ko1;
import com.google.inputmethod.kx1;
import com.google.inputmethod.nx1;
import com.google.inputmethod.nx8;
import com.google.inputmethod.o58;
import com.google.inputmethod.pp1;
import com.google.inputmethod.rje;
import com.google.inputmethod.rx8;
import com.google.inputmethod.s6b;
import com.google.inputmethod.saa;
import com.google.inputmethod.scc;
import com.google.inputmethod.tc;
import com.google.inputmethod.u58;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.m;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0095\u0001\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\r2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00030\u000fH\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001ak\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00030\u000f2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0003¢\u0006\u0004\b\u0017\u0010\u0018\"\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Landroidx/compose/ui/b;", "modifier", "Lkotlin/Function0;", "", "topBar", "bottomBar", "snackbarHost", "floatingActionButton", "Landroidx/compose/material3/j0;", "floatingActionButtonPosition", "Lcom/google/android/ei1;", "containerColor", "contentColor", "Landroidx/compose/foundation/layout/g1;", "contentWindowInsets", "Lkotlin/Function1;", "Lcom/google/android/rx8;", "content", "f", "(Landroidx/compose/ui/b;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;IJJLandroidx/compose/foundation/layout/g1;Lcom/google/android/ps4;Landroidx/compose/runtime/d;II)V", "fabPosition", "snackbar", "fab", "g", "(ILkotlin/jvm/functions/Function2;Lcom/google/android/ps4;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/layout/g1;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/d;I)V", "Lcom/google/android/ff3;", "a", "F", "FabSpacing", "material3"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class l1 {
    private static final float a = ff3.i(16);

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class a implements Function2<androidx.compose.p004runtime.d, Integer, Unit> {
        final /* synthetic */ int a;
        final /* synthetic */ Function2<androidx.compose.p004runtime.d, Integer, Unit> b;
        final /* synthetic */ ps4<rx8, androidx.compose.p004runtime.d, Integer, Unit> c;
        final /* synthetic */ Function2<androidx.compose.p004runtime.d, Integer, Unit> d;
        final /* synthetic */ Function2<androidx.compose.p004runtime.d, Integer, Unit> e;
        final /* synthetic */ u58 f;
        final /* synthetic */ Function2<androidx.compose.p004runtime.d, Integer, Unit> g;

        /* JADX WARN: Multi-variable type inference failed */
        a(int i, Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> function2, ps4<? super rx8, ? super androidx.compose.p004runtime.d, ? super Integer, Unit> ps4Var, Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> function3, Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> function4, u58 u58Var, Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> function5) {
            this.a = i;
            this.b = function2;
            this.c = ps4Var;
            this.d = function3;
            this.e = function4;
            this.f = u58Var;
            this.g = function5;
        }

        public final void a(androidx.compose.p004runtime.d dVar, int i) {
            if (!dVar.g((i & 3) != 2, i & 1)) {
                dVar.q();
                return;
            }
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.o(848889571, i, -1, "androidx.compose.material3.Scaffold.<anonymous> (Scaffold.kt:104)");
            }
            l1.g(this.a, this.b, this.c, this.d, this.e, this.f, this.g, dVar, 0);
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.n();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((androidx.compose.p004runtime.d) obj, ((Number) obj2).intValue());
            return Unit.a;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class b implements Function2<androidx.compose.p004runtime.d, Integer, Unit> {
        final /* synthetic */ ps4<rx8, androidx.compose.p004runtime.d, Integer, Unit> a;
        final /* synthetic */ d b;

        /* JADX WARN: Multi-variable type inference failed */
        b(ps4<? super rx8, ? super androidx.compose.p004runtime.d, ? super Integer, Unit> ps4Var, d dVar) {
            this.a = ps4Var;
            this.b = dVar;
        }

        public final void a(androidx.compose.p004runtime.d dVar, int i) {
            if (!dVar.g((i & 3) != 2, i & 1)) {
                dVar.q();
                return;
            }
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.o(-1776388365, i, -1, "androidx.compose.material3.ScaffoldLayout.<anonymous>.<anonymous> (Scaffold.kt:162)");
            }
            ps4<rx8, androidx.compose.p004runtime.d, Integer, Unit> ps4Var = this.a;
            d dVar2 = this.b;
            androidx.compose.ui.b.Companion companion = androidx.compose.ui.b.INSTANCE;
            ej7 ej7VarI = j.i(tc.INSTANCE.o(), false);
            int iA = pp1.a(dVar, 0);
            gs1 gs1VarJ = dVar.j();
            androidx.compose.ui.b bVarE = ComposedModifierKt.e(dVar, companion);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> function0B = companion2.b();
            if (dVar.G() == null) {
                pp1.d();
            }
            dVar.o();
            if (dVar.getInserting()) {
                dVar.W(function0B);
            } else {
                dVar.k();
            }
            androidx.compose.p004runtime.d dVarC = dud.c(dVar);
            dud.i(dVarC, ej7VarI, companion2.d());
            dud.i(dVarC, gs1VarJ, companion2.f());
            Function2<ComposeUiNode, Integer, Unit> function2C = companion2.c();
            if (dVarC.getInserting() || !Intrinsics.e(dVarC.R(), Integer.valueOf(iA))) {
                dVarC.L(Integer.valueOf(iA));
                dVarC.e(Integer.valueOf(iA), function2C);
            }
            dud.i(dVarC, bVarE, companion2.e());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.a;
            ps4Var.invoke(dVar2, dVar, 6);
            dVar.m();
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.n();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((androidx.compose.p004runtime.d) obj, ((Number) obj2).intValue());
            return Unit.a;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class c implements Function2<androidx.compose.p004runtime.d, Integer, Unit> {
        final /* synthetic */ Function2<androidx.compose.p004runtime.d, Integer, Unit> a;

        /* JADX WARN: Multi-variable type inference failed */
        c(Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> function2) {
            this.a = function2;
        }

        public final void a(androidx.compose.p004runtime.d dVar, int i) {
            if (!dVar.g((i & 3) != 2, i & 1)) {
                dVar.q();
                return;
            }
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.o(-1731662488, i, -1, "androidx.compose.material3.ScaffoldLayout.<anonymous>.<anonymous> (Scaffold.kt:163)");
            }
            Function2<androidx.compose.p004runtime.d, Integer, Unit> function2 = this.a;
            androidx.compose.ui.b.Companion companion = androidx.compose.ui.b.INSTANCE;
            ej7 ej7VarI = j.i(tc.INSTANCE.o(), false);
            int iA = pp1.a(dVar, 0);
            gs1 gs1VarJ = dVar.j();
            androidx.compose.ui.b bVarE = ComposedModifierKt.e(dVar, companion);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> function0B = companion2.b();
            if (dVar.G() == null) {
                pp1.d();
            }
            dVar.o();
            if (dVar.getInserting()) {
                dVar.W(function0B);
            } else {
                dVar.k();
            }
            androidx.compose.p004runtime.d dVarC = dud.c(dVar);
            dud.i(dVarC, ej7VarI, companion2.d());
            dud.i(dVarC, gs1VarJ, companion2.f());
            Function2<ComposeUiNode, Integer, Unit> function2C = companion2.c();
            if (dVarC.getInserting() || !Intrinsics.e(dVarC.R(), Integer.valueOf(iA))) {
                dVarC.L(Integer.valueOf(iA));
                dVarC.e(Integer.valueOf(iA), function2C);
            }
            dud.i(dVarC, bVarE, companion2.e());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.a;
            function2.invoke(dVar, 0);
            dVar.m();
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.n();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((androidx.compose.p004runtime.d) obj, ((Number) obj2).intValue());
            return Unit.a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\u0006J\u000f\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\bR+\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00018F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\n\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"androidx/compose/material3/l1$d", "Lcom/google/android/rx8;", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Lcom/google/android/ff3;", "b", "(Landroidx/compose/ui/unit/LayoutDirection;)F", "d", "()F", "c", "a", "<set-?>", "Lcom/google/android/o58;", "e", "()Lcom/google/android/rx8;", "f", "(Lcom/google/android/rx8;)V", "paddingHolder", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class d implements rx8 {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final o58 paddingHolder = s0.e(nx8.e(ff3.i(0)), null, 2, null);

        d() {
        }

        @Override // com.google.inputmethod.rx8
        /* JADX INFO: renamed from: a */
        public float getBottom() {
            return e().getBottom();
        }

        @Override // com.google.inputmethod.rx8
        public float b(LayoutDirection layoutDirection) {
            return e().b(layoutDirection);
        }

        @Override // com.google.inputmethod.rx8
        public float c(LayoutDirection layoutDirection) {
            return e().c(layoutDirection);
        }

        @Override // com.google.inputmethod.rx8
        /* JADX INFO: renamed from: d */
        public float getTop() {
            return e().getTop();
        }

        public final rx8 e() {
            return (rx8) this.paddingHolder.getValue();
        }

        public final void f(rx8 rx8Var) {
            this.paddingHolder.setValue(rx8Var);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class e implements Function2<androidx.compose.p004runtime.d, Integer, Unit> {
        final /* synthetic */ Function2<androidx.compose.p004runtime.d, Integer, Unit> a;

        /* JADX WARN: Multi-variable type inference failed */
        e(Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> function2) {
            this.a = function2;
        }

        public final void a(androidx.compose.p004runtime.d dVar, int i) {
            if (!dVar.g((i & 3) != 2, i & 1)) {
                dVar.q();
                return;
            }
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.o(338600263, i, -1, "androidx.compose.material3.ScaffoldLayout.<anonymous>.<anonymous> (Scaffold.kt:160)");
            }
            Function2<androidx.compose.p004runtime.d, Integer, Unit> function2 = this.a;
            androidx.compose.ui.b.Companion companion = androidx.compose.ui.b.INSTANCE;
            ej7 ej7VarI = j.i(tc.INSTANCE.o(), false);
            int iA = pp1.a(dVar, 0);
            gs1 gs1VarJ = dVar.j();
            androidx.compose.ui.b bVarE = ComposedModifierKt.e(dVar, companion);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> function0B = companion2.b();
            if (dVar.G() == null) {
                pp1.d();
            }
            dVar.o();
            if (dVar.getInserting()) {
                dVar.W(function0B);
            } else {
                dVar.k();
            }
            androidx.compose.p004runtime.d dVarC = dud.c(dVar);
            dud.i(dVarC, ej7VarI, companion2.d());
            dud.i(dVarC, gs1VarJ, companion2.f());
            Function2<ComposeUiNode, Integer, Unit> function2C = companion2.c();
            if (dVarC.getInserting() || !Intrinsics.e(dVarC.R(), Integer.valueOf(iA))) {
                dVarC.L(Integer.valueOf(iA));
                dVarC.e(Integer.valueOf(iA), function2C);
            }
            dud.i(dVarC, bVarE, companion2.e());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.a;
            function2.invoke(dVar, 0);
            dVar.m();
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.n();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((androidx.compose.p004runtime.d) obj, ((Number) obj2).intValue());
            return Unit.a;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class f implements Function2<androidx.compose.p004runtime.d, Integer, Unit> {
        final /* synthetic */ Function2<androidx.compose.p004runtime.d, Integer, Unit> a;

        /* JADX WARN: Multi-variable type inference failed */
        f(Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> function2) {
            this.a = function2;
        }

        public final void a(androidx.compose.p004runtime.d dVar, int i) {
            if (!dVar.g((i & 3) != 2, i & 1)) {
                dVar.q();
                return;
            }
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.o(418899191, i, -1, "androidx.compose.material3.ScaffoldLayout.<anonymous>.<anonymous> (Scaffold.kt:159)");
            }
            Function2<androidx.compose.p004runtime.d, Integer, Unit> function2 = this.a;
            androidx.compose.ui.b.Companion companion = androidx.compose.ui.b.INSTANCE;
            ej7 ej7VarI = j.i(tc.INSTANCE.o(), false);
            int iA = pp1.a(dVar, 0);
            gs1 gs1VarJ = dVar.j();
            androidx.compose.ui.b bVarE = ComposedModifierKt.e(dVar, companion);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> function0B = companion2.b();
            if (dVar.G() == null) {
                pp1.d();
            }
            dVar.o();
            if (dVar.getInserting()) {
                dVar.W(function0B);
            } else {
                dVar.k();
            }
            androidx.compose.p004runtime.d dVarC = dud.c(dVar);
            dud.i(dVarC, ej7VarI, companion2.d());
            dud.i(dVarC, gs1VarJ, companion2.f());
            Function2<ComposeUiNode, Integer, Unit> function2C = companion2.c();
            if (dVarC.getInserting() || !Intrinsics.e(dVarC.R(), Integer.valueOf(iA))) {
                dVarC.L(Integer.valueOf(iA));
                dVarC.e(Integer.valueOf(iA), function2C);
            }
            dud.i(dVarC, bVarE, companion2.e());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.a;
            function2.invoke(dVar, 0);
            dVar.m();
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.n();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((androidx.compose.p004runtime.d) obj, ((Number) obj2).intValue());
            return Unit.a;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class g implements Function2<androidx.compose.p004runtime.d, Integer, Unit> {
        final /* synthetic */ Function2<androidx.compose.p004runtime.d, Integer, Unit> a;

        /* JADX WARN: Multi-variable type inference failed */
        g(Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> function2) {
            this.a = function2;
        }

        public final void a(androidx.compose.p004runtime.d dVar, int i) {
            if (!dVar.g((i & 3) != 2, i & 1)) {
                dVar.q();
                return;
            }
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.o(605195056, i, -1, "androidx.compose.material3.ScaffoldLayout.<anonymous>.<anonymous> (Scaffold.kt:158)");
            }
            Function2<androidx.compose.p004runtime.d, Integer, Unit> function2 = this.a;
            androidx.compose.ui.b.Companion companion = androidx.compose.ui.b.INSTANCE;
            ej7 ej7VarI = j.i(tc.INSTANCE.o(), false);
            int iA = pp1.a(dVar, 0);
            gs1 gs1VarJ = dVar.j();
            androidx.compose.ui.b bVarE = ComposedModifierKt.e(dVar, companion);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> function0B = companion2.b();
            if (dVar.G() == null) {
                pp1.d();
            }
            dVar.o();
            if (dVar.getInserting()) {
                dVar.W(function0B);
            } else {
                dVar.k();
            }
            androidx.compose.p004runtime.d dVarC = dud.c(dVar);
            dud.i(dVarC, ej7VarI, companion2.d());
            dud.i(dVarC, gs1VarJ, companion2.f());
            Function2<ComposeUiNode, Integer, Unit> function2C = companion2.c();
            if (dVarC.getInserting() || !Intrinsics.e(dVarC.R(), Integer.valueOf(iA))) {
                dVarC.L(Integer.valueOf(iA));
                dVarC.e(Integer.valueOf(iA), function2C);
            }
            dud.i(dVarC, bVarE, companion2.e());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.a;
            function2.invoke(dVar, 0);
            dVar.m();
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.n();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((androidx.compose.p004runtime.d) obj, ((Number) obj2).intValue());
            return Unit.a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0116  */
    /* JADX WARN: Code duplicated, block: B:102:0x011b  */
    /* JADX WARN: Code duplicated, block: B:104:0x011f  */
    /* JADX WARN: Code duplicated, block: B:106:0x0127  */
    /* JADX WARN: Code duplicated, block: B:107:0x012a  */
    /* JADX WARN: Code duplicated, block: B:111:0x0138  */
    /* JADX WARN: Code duplicated, block: B:112:0x013a  */
    /* JADX WARN: Code duplicated, block: B:115:0x0143  */
    /* JADX WARN: Code duplicated, block: B:117:0x0150  */
    /* JADX WARN: Code duplicated, block: B:130:0x0180 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:131:0x0182  */
    /* JADX WARN: Code duplicated, block: B:132:0x0185  */
    /* JADX WARN: Code duplicated, block: B:134:0x0189  */
    /* JADX WARN: Code duplicated, block: B:135:0x0190  */
    /* JADX WARN: Code duplicated, block: B:137:0x0193  */
    /* JADX WARN: Code duplicated, block: B:138:0x019a  */
    /* JADX WARN: Code duplicated, block: B:140:0x019d  */
    /* JADX WARN: Code duplicated, block: B:141:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:143:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:144:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:146:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:147:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:150:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:151:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:154:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:155:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:158:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:160:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:163:0x0202  */
    /* JADX WARN: Code duplicated, block: B:164:0x020e  */
    /* JADX WARN: Code duplicated, block: B:167:0x0219  */
    /* JADX WARN: Code duplicated, block: B:169:0x021f  */
    /* JADX WARN: Code duplicated, block: B:175:0x022c  */
    /* JADX WARN: Code duplicated, block: B:177:0x0234  */
    /* JADX WARN: Code duplicated, block: B:180:0x0248  */
    /* JADX WARN: Code duplicated, block: B:182:0x024e  */
    /* JADX WARN: Code duplicated, block: B:188:0x025d  */
    /* JADX WARN: Code duplicated, block: B:190:0x0265  */
    /* JADX WARN: Code duplicated, block: B:193:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:195:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:198:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:200:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004a  */
    /* JADX WARN: Code duplicated, block: B:28:0x004f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0053  */
    /* JADX WARN: Code duplicated, block: B:32:0x005b  */
    /* JADX WARN: Code duplicated, block: B:33:0x005e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0065  */
    /* JADX WARN: Code duplicated, block: B:39:0x006a  */
    /* JADX WARN: Code duplicated, block: B:41:0x006e  */
    /* JADX WARN: Code duplicated, block: B:43:0x0076  */
    /* JADX WARN: Code duplicated, block: B:44:0x0079  */
    /* JADX WARN: Code duplicated, block: B:48:0x0080  */
    /* JADX WARN: Code duplicated, block: B:50:0x0085  */
    /* JADX WARN: Code duplicated, block: B:52:0x0089  */
    /* JADX WARN: Code duplicated, block: B:54:0x0091  */
    /* JADX WARN: Code duplicated, block: B:55:0x0094  */
    /* JADX WARN: Code duplicated, block: B:59:0x009d  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:74:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:79:0x00db  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:84:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:86:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:89:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:91:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:94:0x0107 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:97:0x010e  */
    public static final void f(androidx.compose.ui.b bVar, Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> function2, Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> function3, Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> function4, Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> function5, int i, long j, long j2, g1 g1Var, final ps4<? super rx8, ? super androidx.compose.p004runtime.d, ? super Integer, Unit> ps4Var, androidx.compose.p004runtime.d dVar, final int i2, final int i3) {
        int i4;
        Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> function6;
        int i5;
        Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> function7;
        int i6;
        int i7;
        Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> function8;
        int i8;
        int i9;
        Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> function9;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z;
        androidx.compose.p004runtime.d dVar2;
        final androidx.compose.ui.b bVar2;
        final g1 g1Var2;
        final Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> function10;
        final Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> function11;
        final Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> function12;
        final Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> function13;
        final int i14;
        final long j3;
        final long j4;
        s6b s6bVarH;
        androidx.compose.ui.b bVar3;
        Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> function2B;
        Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> function2C;
        Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> function2D;
        Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> function2A;
        int iA;
        long background;
        long jG;
        final g1 g1VarA;
        long j5;
        boolean z2;
        Object objR;
        final u58 u58Var;
        boolean zX;
        Object objR2;
        int i15;
        int i16;
        androidx.compose.p004runtime.d dVarF = dVar.F(-1211482744);
        int i17 = i3 & 1;
        if (i17 != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (dVarF.x(bVar) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i18 = i3 & 2;
        if (i18 == 0) {
            if ((i2 & 48) == 0) {
                function6 = function2;
                i4 |= dVarF.T(function6) ? 32 : 16;
            }
            i5 = i3 & 4;
            if (i5 != 0) {
                if ((i2 & 384) == 0) {
                    function7 = function3;
                    if (dVarF.T(function7)) {
                        i6 = 256;
                    } else {
                        i6 = 128;
                    }
                    i4 |= i6;
                }
                i7 = i3 & 8;
                if (i7 != 0) {
                    if ((i2 & 3072) == 0) {
                        function8 = function4;
                        if (dVarF.T(function8)) {
                            i8 = 2048;
                        } else {
                            i8 = 1024;
                        }
                        i4 |= i8;
                    }
                    i9 = i3 & 16;
                    if (i9 != 0) {
                        if ((i2 & 24576) == 0) {
                            function9 = function5;
                            if (dVarF.T(function9)) {
                                i10 = 16384;
                            } else {
                                i10 = 8192;
                            }
                            i4 |= i10;
                        }
                        i11 = i3 & 32;
                        if (i11 != 0) {
                            i4 |= 196608;
                        } else if ((i2 & 196608) == 0) {
                            if (dVarF.C(i)) {
                                i12 = 131072;
                            } else {
                                i12 = 65536;
                            }
                            i4 |= i12;
                        }
                        if ((i2 & 1572864) != 0) {
                            if ((i3 & 64) == 0 || !dVarF.D(j)) {
                                i16 = 524288;
                            } else {
                                i16 = 1048576;
                            }
                            i4 |= i16;
                        }
                        if ((i2 & 12582912) != 0) {
                            if ((i3 & 128) == 0 || !dVarF.D(j2)) {
                                i15 = 4194304;
                            } else {
                                i15 = 8388608;
                            }
                            i4 |= i15;
                        }
                        if ((i2 & 100663296) != 0) {
                            i4 |= ((i3 & 256) == 0 || !dVarF.x(g1Var)) ? 33554432 : 67108864;
                        }
                        if ((i3 & 512) != 0) {
                            if ((i2 & 805306368) == 0) {
                                if (dVarF.T(ps4Var)) {
                                    i13 = 536870912;
                                } else {
                                    i13 = 268435456;
                                }
                                i4 |= i13;
                            }
                            if ((i4 & 306783379) != 306783378) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (dVarF.g(z, i4 & 1)) {
                                dVarF.U();
                                if ((i2 & 1) != 0 || dVarF.t()) {
                                    if (i17 != 0) {
                                        bVar3 = androidx.compose.ui.b.INSTANCE;
                                    } else {
                                        bVar3 = bVar;
                                    }
                                    if (i18 != 0) {
                                        function2B = hp1.a.b();
                                    } else {
                                        function2B = function6;
                                    }
                                    if (i5 != 0) {
                                        function2C = hp1.a.c();
                                    } else {
                                        function2C = function7;
                                    }
                                    if (i7 != 0) {
                                        function2D = hp1.a.d();
                                    } else {
                                        function2D = function8;
                                    }
                                    if (i9 != 0) {
                                        function2A = hp1.a.a();
                                    } else {
                                        function2A = function9;
                                    }
                                    if (i11 != 0) {
                                        iA = j0.INSTANCE.a();
                                    } else {
                                        iA = i;
                                    }
                                    if ((i3 & 64) != 0) {
                                        i4 &= -3670017;
                                        background = kh7.a.a(dVarF, 6).getBackground();
                                    } else {
                                        background = j;
                                    }
                                    if ((i3 & 128) != 0) {
                                        jG = bj1.g(background, dVarF, (i4 >> 18) & 14);
                                        i4 &= -29360129;
                                    } else {
                                        jG = j2;
                                    }
                                    if ((i3 & 256) != 0) {
                                        g1VarA = j3b.a.a(dVarF, 6);
                                        i4 &= -234881025;
                                    } else {
                                        g1VarA = g1Var;
                                    }
                                    j5 = jG;
                                } else {
                                    dVarF.q();
                                    if ((i3 & 64) != 0) {
                                        i4 &= -3670017;
                                    }
                                    if ((i3 & 128) != 0) {
                                        i4 &= -29360129;
                                    }
                                    if ((i3 & 256) != 0) {
                                        i4 &= -234881025;
                                    }
                                    bVar3 = bVar;
                                    iA = i;
                                    background = j;
                                    function2B = function6;
                                    function2C = function7;
                                    function2D = function8;
                                    function2A = function9;
                                    j5 = j2;
                                    g1VarA = g1Var;
                                }
                                dVarF.M();
                                if (androidx.compose.p004runtime.e.k()) {
                                    androidx.compose.p004runtime.e.o(-1211482744, i4, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:93)");
                                }
                                int i19 = (234881024 & i4) ^ r19;
                                z2 = (i19 <= 67108864 && dVarF.x(g1VarA)) || (i4 & r19) == 67108864;
                                objR = dVarF.R();
                                if (z2 || objR == androidx.compose.p004runtime.d.INSTANCE.a()) {
                                    objR = new u58(g1VarA);
                                    dVarF.L(objR);
                                }
                                u58Var = (u58) objR;
                                long j6 = background;
                                zX = dVarF.x(u58Var) | ((i19 <= 67108864 && dVarF.x(g1VarA)) || (i4 & 100663296) == 67108864);
                                objR2 = dVarF.R();
                                if (zX || objR2 == androidx.compose.p004runtime.d.INSTANCE.a()) {
                                    objR2 = new Function1() { // from class: com.google.android.k3b
                                        public final Object invoke(Object obj) {
                                            return l1.k(u58Var, g1VarA, (g1) obj);
                                        }
                                    };
                                    dVarF.L(objR2);
                                }
                                int i20 = i4 >> 12;
                                dVar2 = dVarF;
                                afc.c(WindowInsetsPaddingKt.c(bVar3, (Function1) objR2), null, j6, j5, 0.0f, 0.0f, null, ko1.e(848889571, true, new a(iA, function2B, ps4Var, function2D, function2A, u58Var, function2C), dVarF, 54), dVar2, (i20 & 896) | 12582912 | (i20 & 7168), 114);
                                if (androidx.compose.p004runtime.e.k()) {
                                    androidx.compose.p004runtime.e.n();
                                }
                                bVar2 = bVar3;
                                function10 = function2B;
                                function11 = function2C;
                                function12 = function2D;
                                function13 = function2A;
                                i14 = iA;
                                g1Var2 = g1VarA;
                                j3 = j6;
                                j4 = j5;
                            } else {
                                dVar2 = dVarF;
                                dVar2.q();
                                bVar2 = bVar;
                                g1Var2 = g1Var;
                                function10 = function6;
                                function11 = function7;
                                function12 = function8;
                                function13 = function9;
                                i14 = i;
                                j3 = j;
                                j4 = j2;
                            }
                            s6bVarH = dVar2.H();
                            if (s6bVarH != null) {
                                s6bVarH.a(new Function2() { // from class: com.google.android.l3b
                                    public final Object invoke(Object obj, Object obj2) {
                                        return l1.l(bVar2, function10, function11, function12, function13, i14, j3, j4, g1Var2, ps4Var, i2, i3, (d) obj, ((Integer) obj2).intValue());
                                    }
                                });
                            }
                        }
                        i4 |= 805306368;
                        if ((i4 & 306783379) != 306783378) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (dVarF.g(z, i4 & 1)) {
                            dVarF.U();
                            if ((i2 & 1) != 0) {
                                if (i17 != 0) {
                                    bVar3 = androidx.compose.ui.b.INSTANCE;
                                } else {
                                    bVar3 = bVar;
                                }
                                if (i18 != 0) {
                                    function2B = hp1.a.b();
                                } else {
                                    function2B = function6;
                                }
                                if (i5 != 0) {
                                    function2C = hp1.a.c();
                                } else {
                                    function2C = function7;
                                }
                                if (i7 != 0) {
                                    function2D = hp1.a.d();
                                } else {
                                    function2D = function8;
                                }
                                if (i9 != 0) {
                                    function2A = hp1.a.a();
                                } else {
                                    function2A = function9;
                                }
                                if (i11 != 0) {
                                    iA = j0.INSTANCE.a();
                                } else {
                                    iA = i;
                                }
                                if ((i3 & 64) != 0) {
                                    i4 &= -3670017;
                                    background = kh7.a.a(dVarF, 6).getBackground();
                                } else {
                                    background = j;
                                }
                                if ((i3 & 128) != 0) {
                                    jG = bj1.g(background, dVarF, (i4 >> 18) & 14);
                                    i4 &= -29360129;
                                } else {
                                    jG = j2;
                                }
                                if ((i3 & 256) != 0) {
                                    g1VarA = j3b.a.a(dVarF, 6);
                                    i4 &= -234881025;
                                } else {
                                    g1VarA = g1Var;
                                }
                                j5 = jG;
                            } else {
                                if (i17 != 0) {
                                    bVar3 = androidx.compose.ui.b.INSTANCE;
                                } else {
                                    bVar3 = bVar;
                                }
                                if (i18 != 0) {
                                    function2B = hp1.a.b();
                                } else {
                                    function2B = function6;
                                }
                                if (i5 != 0) {
                                    function2C = hp1.a.c();
                                } else {
                                    function2C = function7;
                                }
                                if (i7 != 0) {
                                    function2D = hp1.a.d();
                                } else {
                                    function2D = function8;
                                }
                                if (i9 != 0) {
                                    function2A = hp1.a.a();
                                } else {
                                    function2A = function9;
                                }
                                if (i11 != 0) {
                                    iA = j0.INSTANCE.a();
                                } else {
                                    iA = i;
                                }
                                if ((i3 & 64) != 0) {
                                    i4 &= -3670017;
                                    background = kh7.a.a(dVarF, 6).getBackground();
                                } else {
                                    background = j;
                                }
                                if ((i3 & 128) != 0) {
                                    jG = bj1.g(background, dVarF, (i4 >> 18) & 14);
                                    i4 &= -29360129;
                                } else {
                                    jG = j2;
                                }
                                if ((i3 & 256) != 0) {
                                    g1VarA = j3b.a.a(dVarF, 6);
                                    i4 &= -234881025;
                                } else {
                                    g1VarA = g1Var;
                                }
                                j5 = jG;
                            }
                            dVarF.M();
                            if (androidx.compose.p004runtime.e.k()) {
                                androidx.compose.p004runtime.e.o(-1211482744, i4, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:93)");
                            }
                            int i110 = (234881024 & i4) ^ r19;
                            if (i110 <= 67108864) {
                            }
                            objR = dVarF.R();
                            if (z2) {
                                objR = new u58(g1VarA);
                                dVarF.L(objR);
                            } else {
                                objR = new u58(g1VarA);
                                dVarF.L(objR);
                            }
                            u58Var = (u58) objR;
                            long j7 = background;
                            zX = dVarF.x(u58Var) | ((i110 <= 67108864 && dVarF.x(g1VarA)) || (i4 & 100663296) == 67108864);
                            objR2 = dVarF.R();
                            if (zX) {
                                objR2 = new Function1() { // from class: com.google.android.k3b
                                    public final Object invoke(Object obj) {
                                        return l1.k(u58Var, g1VarA, (g1) obj);
                                    }
                                };
                                dVarF.L(objR2);
                            } else {
                                objR2 = new Function1() { // from class: com.google.android.k3b
                                    public final Object invoke(Object obj) {
                                        return l1.k(u58Var, g1VarA, (g1) obj);
                                    }
                                };
                                dVarF.L(objR2);
                            }
                            int i21 = i4 >> 12;
                            dVar2 = dVarF;
                            afc.c(WindowInsetsPaddingKt.c(bVar3, (Function1) objR2), null, j7, j5, 0.0f, 0.0f, null, ko1.e(848889571, true, new a(iA, function2B, ps4Var, function2D, function2A, u58Var, function2C), dVarF, 54), dVar2, (i21 & 896) | 12582912 | (i21 & 7168), 114);
                            if (androidx.compose.p004runtime.e.k()) {
                                androidx.compose.p004runtime.e.n();
                            }
                            bVar2 = bVar3;
                            function10 = function2B;
                            function11 = function2C;
                            function12 = function2D;
                            function13 = function2A;
                            i14 = iA;
                            g1Var2 = g1VarA;
                            j3 = j7;
                            j4 = j5;
                        } else {
                            dVar2 = dVarF;
                            dVar2.q();
                            bVar2 = bVar;
                            g1Var2 = g1Var;
                            function10 = function6;
                            function11 = function7;
                            function12 = function8;
                            function13 = function9;
                            i14 = i;
                            j3 = j;
                            j4 = j2;
                        }
                        s6bVarH = dVar2.H();
                        if (s6bVarH != null) {
                            s6bVarH.a(new Function2() { // from class: com.google.android.l3b
                                public final Object invoke(Object obj, Object obj2) {
                                    return l1.l(bVar2, function10, function11, function12, function13, i14, j3, j4, g1Var2, ps4Var, i2, i3, (d) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i4 |= 24576;
                    function9 = function5;
                    i11 = i3 & 32;
                    if (i11 != 0) {
                        i4 |= 196608;
                    } else if ((i2 & 196608) == 0) {
                        if (dVarF.C(i)) {
                            i12 = 131072;
                        } else {
                            i12 = 65536;
                        }
                        i4 |= i12;
                    }
                    if ((i2 & 1572864) != 0) {
                        if ((i3 & 64) == 0) {
                            i16 = 524288;
                        } else {
                            i16 = 524288;
                        }
                        i4 |= i16;
                    }
                    if ((i2 & 12582912) != 0) {
                        if ((i3 & 128) == 0) {
                            i15 = 4194304;
                        } else {
                            i15 = 4194304;
                        }
                        i4 |= i15;
                    }
                    if ((i2 & 100663296) != 0) {
                        i4 |= ((i3 & 256) == 0 || !dVarF.x(g1Var)) ? 33554432 : 67108864;
                    }
                    if ((i3 & 512) != 0) {
                        if ((i2 & 805306368) == 0) {
                            if (dVarF.T(ps4Var)) {
                                i13 = 536870912;
                            } else {
                                i13 = 268435456;
                            }
                            i4 |= i13;
                        }
                        if ((i4 & 306783379) != 306783378) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (dVarF.g(z, i4 & 1)) {
                            dVarF.U();
                            if ((i2 & 1) != 0) {
                                if (i17 != 0) {
                                    bVar3 = androidx.compose.ui.b.INSTANCE;
                                } else {
                                    bVar3 = bVar;
                                }
                                if (i18 != 0) {
                                    function2B = hp1.a.b();
                                } else {
                                    function2B = function6;
                                }
                                if (i5 != 0) {
                                    function2C = hp1.a.c();
                                } else {
                                    function2C = function7;
                                }
                                if (i7 != 0) {
                                    function2D = hp1.a.d();
                                } else {
                                    function2D = function8;
                                }
                                if (i9 != 0) {
                                    function2A = hp1.a.a();
                                } else {
                                    function2A = function9;
                                }
                                if (i11 != 0) {
                                    iA = j0.INSTANCE.a();
                                } else {
                                    iA = i;
                                }
                                if ((i3 & 64) != 0) {
                                    i4 &= -3670017;
                                    background = kh7.a.a(dVarF, 6).getBackground();
                                } else {
                                    background = j;
                                }
                                if ((i3 & 128) != 0) {
                                    jG = bj1.g(background, dVarF, (i4 >> 18) & 14);
                                    i4 &= -29360129;
                                } else {
                                    jG = j2;
                                }
                                if ((i3 & 256) != 0) {
                                    g1VarA = j3b.a.a(dVarF, 6);
                                    i4 &= -234881025;
                                } else {
                                    g1VarA = g1Var;
                                }
                                j5 = jG;
                            } else {
                                if (i17 != 0) {
                                    bVar3 = androidx.compose.ui.b.INSTANCE;
                                } else {
                                    bVar3 = bVar;
                                }
                                if (i18 != 0) {
                                    function2B = hp1.a.b();
                                } else {
                                    function2B = function6;
                                }
                                if (i5 != 0) {
                                    function2C = hp1.a.c();
                                } else {
                                    function2C = function7;
                                }
                                if (i7 != 0) {
                                    function2D = hp1.a.d();
                                } else {
                                    function2D = function8;
                                }
                                if (i9 != 0) {
                                    function2A = hp1.a.a();
                                } else {
                                    function2A = function9;
                                }
                                if (i11 != 0) {
                                    iA = j0.INSTANCE.a();
                                } else {
                                    iA = i;
                                }
                                if ((i3 & 64) != 0) {
                                    i4 &= -3670017;
                                    background = kh7.a.a(dVarF, 6).getBackground();
                                } else {
                                    background = j;
                                }
                                if ((i3 & 128) != 0) {
                                    jG = bj1.g(background, dVarF, (i4 >> 18) & 14);
                                    i4 &= -29360129;
                                } else {
                                    jG = j2;
                                }
                                if ((i3 & 256) != 0) {
                                    g1VarA = j3b.a.a(dVarF, 6);
                                    i4 &= -234881025;
                                } else {
                                    g1VarA = g1Var;
                                }
                                j5 = jG;
                            }
                            dVarF.M();
                            if (androidx.compose.p004runtime.e.k()) {
                                androidx.compose.p004runtime.e.o(-1211482744, i4, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:93)");
                            }
                            int i111 = (234881024 & i4) ^ r19;
                            if (i111 <= 67108864) {
                            }
                            objR = dVarF.R();
                            if (z2) {
                                objR = new u58(g1VarA);
                                dVarF.L(objR);
                            } else {
                                objR = new u58(g1VarA);
                                dVarF.L(objR);
                            }
                            u58Var = (u58) objR;
                            long j8 = background;
                            zX = dVarF.x(u58Var) | ((i111 <= 67108864 && dVarF.x(g1VarA)) || (i4 & 100663296) == 67108864);
                            objR2 = dVarF.R();
                            if (zX) {
                                objR2 = new Function1() { // from class: com.google.android.k3b
                                    public final Object invoke(Object obj) {
                                        return l1.k(u58Var, g1VarA, (g1) obj);
                                    }
                                };
                                dVarF.L(objR2);
                            } else {
                                objR2 = new Function1() { // from class: com.google.android.k3b
                                    public final Object invoke(Object obj) {
                                        return l1.k(u58Var, g1VarA, (g1) obj);
                                    }
                                };
                                dVarF.L(objR2);
                            }
                            int i22 = i4 >> 12;
                            dVar2 = dVarF;
                            afc.c(WindowInsetsPaddingKt.c(bVar3, (Function1) objR2), null, j8, j5, 0.0f, 0.0f, null, ko1.e(848889571, true, new a(iA, function2B, ps4Var, function2D, function2A, u58Var, function2C), dVarF, 54), dVar2, (i22 & 896) | 12582912 | (i22 & 7168), 114);
                            if (androidx.compose.p004runtime.e.k()) {
                                androidx.compose.p004runtime.e.n();
                            }
                            bVar2 = bVar3;
                            function10 = function2B;
                            function11 = function2C;
                            function12 = function2D;
                            function13 = function2A;
                            i14 = iA;
                            g1Var2 = g1VarA;
                            j3 = j8;
                            j4 = j5;
                        } else {
                            dVar2 = dVarF;
                            dVar2.q();
                            bVar2 = bVar;
                            g1Var2 = g1Var;
                            function10 = function6;
                            function11 = function7;
                            function12 = function8;
                            function13 = function9;
                            i14 = i;
                            j3 = j;
                            j4 = j2;
                        }
                        s6bVarH = dVar2.H();
                        if (s6bVarH != null) {
                            s6bVarH.a(new Function2() { // from class: com.google.android.l3b
                                public final Object invoke(Object obj, Object obj2) {
                                    return l1.l(bVar2, function10, function11, function12, function13, i14, j3, j4, g1Var2, ps4Var, i2, i3, (d) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i4 |= 805306368;
                    if ((i4 & 306783379) != 306783378) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (dVarF.g(z, i4 & 1)) {
                        dVarF.U();
                        if ((i2 & 1) != 0) {
                            if (i17 != 0) {
                                bVar3 = androidx.compose.ui.b.INSTANCE;
                            } else {
                                bVar3 = bVar;
                            }
                            if (i18 != 0) {
                                function2B = hp1.a.b();
                            } else {
                                function2B = function6;
                            }
                            if (i5 != 0) {
                                function2C = hp1.a.c();
                            } else {
                                function2C = function7;
                            }
                            if (i7 != 0) {
                                function2D = hp1.a.d();
                            } else {
                                function2D = function8;
                            }
                            if (i9 != 0) {
                                function2A = hp1.a.a();
                            } else {
                                function2A = function9;
                            }
                            if (i11 != 0) {
                                iA = j0.INSTANCE.a();
                            } else {
                                iA = i;
                            }
                            if ((i3 & 64) != 0) {
                                i4 &= -3670017;
                                background = kh7.a.a(dVarF, 6).getBackground();
                            } else {
                                background = j;
                            }
                            if ((i3 & 128) != 0) {
                                jG = bj1.g(background, dVarF, (i4 >> 18) & 14);
                                i4 &= -29360129;
                            } else {
                                jG = j2;
                            }
                            if ((i3 & 256) != 0) {
                                g1VarA = j3b.a.a(dVarF, 6);
                                i4 &= -234881025;
                            } else {
                                g1VarA = g1Var;
                            }
                            j5 = jG;
                        } else {
                            if (i17 != 0) {
                                bVar3 = androidx.compose.ui.b.INSTANCE;
                            } else {
                                bVar3 = bVar;
                            }
                            if (i18 != 0) {
                                function2B = hp1.a.b();
                            } else {
                                function2B = function6;
                            }
                            if (i5 != 0) {
                                function2C = hp1.a.c();
                            } else {
                                function2C = function7;
                            }
                            if (i7 != 0) {
                                function2D = hp1.a.d();
                            } else {
                                function2D = function8;
                            }
                            if (i9 != 0) {
                                function2A = hp1.a.a();
                            } else {
                                function2A = function9;
                            }
                            if (i11 != 0) {
                                iA = j0.INSTANCE.a();
                            } else {
                                iA = i;
                            }
                            if ((i3 & 64) != 0) {
                                i4 &= -3670017;
                                background = kh7.a.a(dVarF, 6).getBackground();
                            } else {
                                background = j;
                            }
                            if ((i3 & 128) != 0) {
                                jG = bj1.g(background, dVarF, (i4 >> 18) & 14);
                                i4 &= -29360129;
                            } else {
                                jG = j2;
                            }
                            if ((i3 & 256) != 0) {
                                g1VarA = j3b.a.a(dVarF, 6);
                                i4 &= -234881025;
                            } else {
                                g1VarA = g1Var;
                            }
                            j5 = jG;
                        }
                        dVarF.M();
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.o(-1211482744, i4, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:93)");
                        }
                        int i112 = (234881024 & i4) ^ r19;
                        if (i112 <= 67108864) {
                        }
                        objR = dVarF.R();
                        if (z2) {
                            objR = new u58(g1VarA);
                            dVarF.L(objR);
                        } else {
                            objR = new u58(g1VarA);
                            dVarF.L(objR);
                        }
                        u58Var = (u58) objR;
                        long j9 = background;
                        zX = dVarF.x(u58Var) | ((i112 <= 67108864 && dVarF.x(g1VarA)) || (i4 & 100663296) == 67108864);
                        objR2 = dVarF.R();
                        if (zX) {
                            objR2 = new Function1() { // from class: com.google.android.k3b
                                public final Object invoke(Object obj) {
                                    return l1.k(u58Var, g1VarA, (g1) obj);
                                }
                            };
                            dVarF.L(objR2);
                        } else {
                            objR2 = new Function1() { // from class: com.google.android.k3b
                                public final Object invoke(Object obj) {
                                    return l1.k(u58Var, g1VarA, (g1) obj);
                                }
                            };
                            dVarF.L(objR2);
                        }
                        int i23 = i4 >> 12;
                        dVar2 = dVarF;
                        afc.c(WindowInsetsPaddingKt.c(bVar3, (Function1) objR2), null, j9, j5, 0.0f, 0.0f, null, ko1.e(848889571, true, new a(iA, function2B, ps4Var, function2D, function2A, u58Var, function2C), dVarF, 54), dVar2, (i23 & 896) | 12582912 | (i23 & 7168), 114);
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.n();
                        }
                        bVar2 = bVar3;
                        function10 = function2B;
                        function11 = function2C;
                        function12 = function2D;
                        function13 = function2A;
                        i14 = iA;
                        g1Var2 = g1VarA;
                        j3 = j9;
                        j4 = j5;
                    } else {
                        dVar2 = dVarF;
                        dVar2.q();
                        bVar2 = bVar;
                        g1Var2 = g1Var;
                        function10 = function6;
                        function11 = function7;
                        function12 = function8;
                        function13 = function9;
                        i14 = i;
                        j3 = j;
                        j4 = j2;
                    }
                    s6bVarH = dVar2.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.l3b
                            public final Object invoke(Object obj, Object obj2) {
                                return l1.l(bVar2, function10, function11, function12, function13, i14, j3, j4, g1Var2, ps4Var, i2, i3, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i4 |= 3072;
                function8 = function4;
                i9 = i3 & 16;
                if (i9 != 0) {
                    if ((i2 & 24576) == 0) {
                        function9 = function5;
                        if (dVarF.T(function9)) {
                            i10 = 16384;
                        } else {
                            i10 = 8192;
                        }
                        i4 |= i10;
                    }
                    i11 = i3 & 32;
                    if (i11 != 0) {
                        i4 |= 196608;
                    } else if ((i2 & 196608) == 0) {
                        if (dVarF.C(i)) {
                            i12 = 131072;
                        } else {
                            i12 = 65536;
                        }
                        i4 |= i12;
                    }
                    if ((i2 & 1572864) != 0) {
                        if ((i3 & 64) == 0) {
                            i16 = 524288;
                        } else {
                            i16 = 524288;
                        }
                        i4 |= i16;
                    }
                    if ((i2 & 12582912) != 0) {
                        if ((i3 & 128) == 0) {
                            i15 = 4194304;
                        } else {
                            i15 = 4194304;
                        }
                        i4 |= i15;
                    }
                    if ((i2 & 100663296) != 0) {
                        i4 |= ((i3 & 256) == 0 || !dVarF.x(g1Var)) ? 33554432 : 67108864;
                    }
                    if ((i3 & 512) != 0) {
                        if ((i2 & 805306368) == 0) {
                            if (dVarF.T(ps4Var)) {
                                i13 = 536870912;
                            } else {
                                i13 = 268435456;
                            }
                            i4 |= i13;
                        }
                        if ((i4 & 306783379) != 306783378) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (dVarF.g(z, i4 & 1)) {
                            dVarF.U();
                            if ((i2 & 1) != 0) {
                                if (i17 != 0) {
                                    bVar3 = androidx.compose.ui.b.INSTANCE;
                                } else {
                                    bVar3 = bVar;
                                }
                                if (i18 != 0) {
                                    function2B = hp1.a.b();
                                } else {
                                    function2B = function6;
                                }
                                if (i5 != 0) {
                                    function2C = hp1.a.c();
                                } else {
                                    function2C = function7;
                                }
                                if (i7 != 0) {
                                    function2D = hp1.a.d();
                                } else {
                                    function2D = function8;
                                }
                                if (i9 != 0) {
                                    function2A = hp1.a.a();
                                } else {
                                    function2A = function9;
                                }
                                if (i11 != 0) {
                                    iA = j0.INSTANCE.a();
                                } else {
                                    iA = i;
                                }
                                if ((i3 & 64) != 0) {
                                    i4 &= -3670017;
                                    background = kh7.a.a(dVarF, 6).getBackground();
                                } else {
                                    background = j;
                                }
                                if ((i3 & 128) != 0) {
                                    jG = bj1.g(background, dVarF, (i4 >> 18) & 14);
                                    i4 &= -29360129;
                                } else {
                                    jG = j2;
                                }
                                if ((i3 & 256) != 0) {
                                    g1VarA = j3b.a.a(dVarF, 6);
                                    i4 &= -234881025;
                                } else {
                                    g1VarA = g1Var;
                                }
                                j5 = jG;
                            } else {
                                if (i17 != 0) {
                                    bVar3 = androidx.compose.ui.b.INSTANCE;
                                } else {
                                    bVar3 = bVar;
                                }
                                if (i18 != 0) {
                                    function2B = hp1.a.b();
                                } else {
                                    function2B = function6;
                                }
                                if (i5 != 0) {
                                    function2C = hp1.a.c();
                                } else {
                                    function2C = function7;
                                }
                                if (i7 != 0) {
                                    function2D = hp1.a.d();
                                } else {
                                    function2D = function8;
                                }
                                if (i9 != 0) {
                                    function2A = hp1.a.a();
                                } else {
                                    function2A = function9;
                                }
                                if (i11 != 0) {
                                    iA = j0.INSTANCE.a();
                                } else {
                                    iA = i;
                                }
                                if ((i3 & 64) != 0) {
                                    i4 &= -3670017;
                                    background = kh7.a.a(dVarF, 6).getBackground();
                                } else {
                                    background = j;
                                }
                                if ((i3 & 128) != 0) {
                                    jG = bj1.g(background, dVarF, (i4 >> 18) & 14);
                                    i4 &= -29360129;
                                } else {
                                    jG = j2;
                                }
                                if ((i3 & 256) != 0) {
                                    g1VarA = j3b.a.a(dVarF, 6);
                                    i4 &= -234881025;
                                } else {
                                    g1VarA = g1Var;
                                }
                                j5 = jG;
                            }
                            dVarF.M();
                            if (androidx.compose.p004runtime.e.k()) {
                                androidx.compose.p004runtime.e.o(-1211482744, i4, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:93)");
                            }
                            int i113 = (234881024 & i4) ^ r19;
                            if (i113 <= 67108864) {
                            }
                            objR = dVarF.R();
                            if (z2) {
                                objR = new u58(g1VarA);
                                dVarF.L(objR);
                            } else {
                                objR = new u58(g1VarA);
                                dVarF.L(objR);
                            }
                            u58Var = (u58) objR;
                            long j10 = background;
                            zX = dVarF.x(u58Var) | ((i113 <= 67108864 && dVarF.x(g1VarA)) || (i4 & 100663296) == 67108864);
                            objR2 = dVarF.R();
                            if (zX) {
                                objR2 = new Function1() { // from class: com.google.android.k3b
                                    public final Object invoke(Object obj) {
                                        return l1.k(u58Var, g1VarA, (g1) obj);
                                    }
                                };
                                dVarF.L(objR2);
                            } else {
                                objR2 = new Function1() { // from class: com.google.android.k3b
                                    public final Object invoke(Object obj) {
                                        return l1.k(u58Var, g1VarA, (g1) obj);
                                    }
                                };
                                dVarF.L(objR2);
                            }
                            int i24 = i4 >> 12;
                            dVar2 = dVarF;
                            afc.c(WindowInsetsPaddingKt.c(bVar3, (Function1) objR2), null, j10, j5, 0.0f, 0.0f, null, ko1.e(848889571, true, new a(iA, function2B, ps4Var, function2D, function2A, u58Var, function2C), dVarF, 54), dVar2, (i24 & 896) | 12582912 | (i24 & 7168), 114);
                            if (androidx.compose.p004runtime.e.k()) {
                                androidx.compose.p004runtime.e.n();
                            }
                            bVar2 = bVar3;
                            function10 = function2B;
                            function11 = function2C;
                            function12 = function2D;
                            function13 = function2A;
                            i14 = iA;
                            g1Var2 = g1VarA;
                            j3 = j10;
                            j4 = j5;
                        } else {
                            dVar2 = dVarF;
                            dVar2.q();
                            bVar2 = bVar;
                            g1Var2 = g1Var;
                            function10 = function6;
                            function11 = function7;
                            function12 = function8;
                            function13 = function9;
                            i14 = i;
                            j3 = j;
                            j4 = j2;
                        }
                        s6bVarH = dVar2.H();
                        if (s6bVarH != null) {
                            s6bVarH.a(new Function2() { // from class: com.google.android.l3b
                                public final Object invoke(Object obj, Object obj2) {
                                    return l1.l(bVar2, function10, function11, function12, function13, i14, j3, j4, g1Var2, ps4Var, i2, i3, (d) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i4 |= 805306368;
                    if ((i4 & 306783379) != 306783378) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (dVarF.g(z, i4 & 1)) {
                        dVarF.U();
                        if ((i2 & 1) != 0) {
                            if (i17 != 0) {
                                bVar3 = androidx.compose.ui.b.INSTANCE;
                            } else {
                                bVar3 = bVar;
                            }
                            if (i18 != 0) {
                                function2B = hp1.a.b();
                            } else {
                                function2B = function6;
                            }
                            if (i5 != 0) {
                                function2C = hp1.a.c();
                            } else {
                                function2C = function7;
                            }
                            if (i7 != 0) {
                                function2D = hp1.a.d();
                            } else {
                                function2D = function8;
                            }
                            if (i9 != 0) {
                                function2A = hp1.a.a();
                            } else {
                                function2A = function9;
                            }
                            if (i11 != 0) {
                                iA = j0.INSTANCE.a();
                            } else {
                                iA = i;
                            }
                            if ((i3 & 64) != 0) {
                                i4 &= -3670017;
                                background = kh7.a.a(dVarF, 6).getBackground();
                            } else {
                                background = j;
                            }
                            if ((i3 & 128) != 0) {
                                jG = bj1.g(background, dVarF, (i4 >> 18) & 14);
                                i4 &= -29360129;
                            } else {
                                jG = j2;
                            }
                            if ((i3 & 256) != 0) {
                                g1VarA = j3b.a.a(dVarF, 6);
                                i4 &= -234881025;
                            } else {
                                g1VarA = g1Var;
                            }
                            j5 = jG;
                        } else {
                            if (i17 != 0) {
                                bVar3 = androidx.compose.ui.b.INSTANCE;
                            } else {
                                bVar3 = bVar;
                            }
                            if (i18 != 0) {
                                function2B = hp1.a.b();
                            } else {
                                function2B = function6;
                            }
                            if (i5 != 0) {
                                function2C = hp1.a.c();
                            } else {
                                function2C = function7;
                            }
                            if (i7 != 0) {
                                function2D = hp1.a.d();
                            } else {
                                function2D = function8;
                            }
                            if (i9 != 0) {
                                function2A = hp1.a.a();
                            } else {
                                function2A = function9;
                            }
                            if (i11 != 0) {
                                iA = j0.INSTANCE.a();
                            } else {
                                iA = i;
                            }
                            if ((i3 & 64) != 0) {
                                i4 &= -3670017;
                                background = kh7.a.a(dVarF, 6).getBackground();
                            } else {
                                background = j;
                            }
                            if ((i3 & 128) != 0) {
                                jG = bj1.g(background, dVarF, (i4 >> 18) & 14);
                                i4 &= -29360129;
                            } else {
                                jG = j2;
                            }
                            if ((i3 & 256) != 0) {
                                g1VarA = j3b.a.a(dVarF, 6);
                                i4 &= -234881025;
                            } else {
                                g1VarA = g1Var;
                            }
                            j5 = jG;
                        }
                        dVarF.M();
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.o(-1211482744, i4, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:93)");
                        }
                        int i114 = (234881024 & i4) ^ r19;
                        if (i114 <= 67108864) {
                        }
                        objR = dVarF.R();
                        if (z2) {
                            objR = new u58(g1VarA);
                            dVarF.L(objR);
                        } else {
                            objR = new u58(g1VarA);
                            dVarF.L(objR);
                        }
                        u58Var = (u58) objR;
                        long j11 = background;
                        zX = dVarF.x(u58Var) | ((i114 <= 67108864 && dVarF.x(g1VarA)) || (i4 & 100663296) == 67108864);
                        objR2 = dVarF.R();
                        if (zX) {
                            objR2 = new Function1() { // from class: com.google.android.k3b
                                public final Object invoke(Object obj) {
                                    return l1.k(u58Var, g1VarA, (g1) obj);
                                }
                            };
                            dVarF.L(objR2);
                        } else {
                            objR2 = new Function1() { // from class: com.google.android.k3b
                                public final Object invoke(Object obj) {
                                    return l1.k(u58Var, g1VarA, (g1) obj);
                                }
                            };
                            dVarF.L(objR2);
                        }
                        int i25 = i4 >> 12;
                        dVar2 = dVarF;
                        afc.c(WindowInsetsPaddingKt.c(bVar3, (Function1) objR2), null, j11, j5, 0.0f, 0.0f, null, ko1.e(848889571, true, new a(iA, function2B, ps4Var, function2D, function2A, u58Var, function2C), dVarF, 54), dVar2, (i25 & 896) | 12582912 | (i25 & 7168), 114);
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.n();
                        }
                        bVar2 = bVar3;
                        function10 = function2B;
                        function11 = function2C;
                        function12 = function2D;
                        function13 = function2A;
                        i14 = iA;
                        g1Var2 = g1VarA;
                        j3 = j11;
                        j4 = j5;
                    } else {
                        dVar2 = dVarF;
                        dVar2.q();
                        bVar2 = bVar;
                        g1Var2 = g1Var;
                        function10 = function6;
                        function11 = function7;
                        function12 = function8;
                        function13 = function9;
                        i14 = i;
                        j3 = j;
                        j4 = j2;
                    }
                    s6bVarH = dVar2.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.l3b
                            public final Object invoke(Object obj, Object obj2) {
                                return l1.l(bVar2, function10, function11, function12, function13, i14, j3, j4, g1Var2, ps4Var, i2, i3, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i4 |= 24576;
                function9 = function5;
                i11 = i3 & 32;
                if (i11 != 0) {
                    i4 |= 196608;
                } else if ((i2 & 196608) == 0) {
                    if (dVarF.C(i)) {
                        i12 = 131072;
                    } else {
                        i12 = 65536;
                    }
                    i4 |= i12;
                }
                if ((i2 & 1572864) != 0) {
                    if ((i3 & 64) == 0) {
                        i16 = 524288;
                    } else {
                        i16 = 524288;
                    }
                    i4 |= i16;
                }
                if ((i2 & 12582912) != 0) {
                    if ((i3 & 128) == 0) {
                        i15 = 4194304;
                    } else {
                        i15 = 4194304;
                    }
                    i4 |= i15;
                }
                if ((i2 & 100663296) != 0) {
                    i4 |= ((i3 & 256) == 0 || !dVarF.x(g1Var)) ? 33554432 : 67108864;
                }
                if ((i3 & 512) != 0) {
                    if ((i2 & 805306368) == 0) {
                        if (dVarF.T(ps4Var)) {
                            i13 = 536870912;
                        } else {
                            i13 = 268435456;
                        }
                        i4 |= i13;
                    }
                    if ((i4 & 306783379) != 306783378) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (dVarF.g(z, i4 & 1)) {
                        dVarF.U();
                        if ((i2 & 1) != 0) {
                            if (i17 != 0) {
                                bVar3 = androidx.compose.ui.b.INSTANCE;
                            } else {
                                bVar3 = bVar;
                            }
                            if (i18 != 0) {
                                function2B = hp1.a.b();
                            } else {
                                function2B = function6;
                            }
                            if (i5 != 0) {
                                function2C = hp1.a.c();
                            } else {
                                function2C = function7;
                            }
                            if (i7 != 0) {
                                function2D = hp1.a.d();
                            } else {
                                function2D = function8;
                            }
                            if (i9 != 0) {
                                function2A = hp1.a.a();
                            } else {
                                function2A = function9;
                            }
                            if (i11 != 0) {
                                iA = j0.INSTANCE.a();
                            } else {
                                iA = i;
                            }
                            if ((i3 & 64) != 0) {
                                i4 &= -3670017;
                                background = kh7.a.a(dVarF, 6).getBackground();
                            } else {
                                background = j;
                            }
                            if ((i3 & 128) != 0) {
                                jG = bj1.g(background, dVarF, (i4 >> 18) & 14);
                                i4 &= -29360129;
                            } else {
                                jG = j2;
                            }
                            if ((i3 & 256) != 0) {
                                g1VarA = j3b.a.a(dVarF, 6);
                                i4 &= -234881025;
                            } else {
                                g1VarA = g1Var;
                            }
                            j5 = jG;
                        } else {
                            if (i17 != 0) {
                                bVar3 = androidx.compose.ui.b.INSTANCE;
                            } else {
                                bVar3 = bVar;
                            }
                            if (i18 != 0) {
                                function2B = hp1.a.b();
                            } else {
                                function2B = function6;
                            }
                            if (i5 != 0) {
                                function2C = hp1.a.c();
                            } else {
                                function2C = function7;
                            }
                            if (i7 != 0) {
                                function2D = hp1.a.d();
                            } else {
                                function2D = function8;
                            }
                            if (i9 != 0) {
                                function2A = hp1.a.a();
                            } else {
                                function2A = function9;
                            }
                            if (i11 != 0) {
                                iA = j0.INSTANCE.a();
                            } else {
                                iA = i;
                            }
                            if ((i3 & 64) != 0) {
                                i4 &= -3670017;
                                background = kh7.a.a(dVarF, 6).getBackground();
                            } else {
                                background = j;
                            }
                            if ((i3 & 128) != 0) {
                                jG = bj1.g(background, dVarF, (i4 >> 18) & 14);
                                i4 &= -29360129;
                            } else {
                                jG = j2;
                            }
                            if ((i3 & 256) != 0) {
                                g1VarA = j3b.a.a(dVarF, 6);
                                i4 &= -234881025;
                            } else {
                                g1VarA = g1Var;
                            }
                            j5 = jG;
                        }
                        dVarF.M();
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.o(-1211482744, i4, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:93)");
                        }
                        int i115 = (234881024 & i4) ^ r19;
                        if (i115 <= 67108864) {
                        }
                        objR = dVarF.R();
                        if (z2) {
                            objR = new u58(g1VarA);
                            dVarF.L(objR);
                        } else {
                            objR = new u58(g1VarA);
                            dVarF.L(objR);
                        }
                        u58Var = (u58) objR;
                        long j12 = background;
                        zX = dVarF.x(u58Var) | ((i115 <= 67108864 && dVarF.x(g1VarA)) || (i4 & 100663296) == 67108864);
                        objR2 = dVarF.R();
                        if (zX) {
                            objR2 = new Function1() { // from class: com.google.android.k3b
                                public final Object invoke(Object obj) {
                                    return l1.k(u58Var, g1VarA, (g1) obj);
                                }
                            };
                            dVarF.L(objR2);
                        } else {
                            objR2 = new Function1() { // from class: com.google.android.k3b
                                public final Object invoke(Object obj) {
                                    return l1.k(u58Var, g1VarA, (g1) obj);
                                }
                            };
                            dVarF.L(objR2);
                        }
                        int i26 = i4 >> 12;
                        dVar2 = dVarF;
                        afc.c(WindowInsetsPaddingKt.c(bVar3, (Function1) objR2), null, j12, j5, 0.0f, 0.0f, null, ko1.e(848889571, true, new a(iA, function2B, ps4Var, function2D, function2A, u58Var, function2C), dVarF, 54), dVar2, (i26 & 896) | 12582912 | (i26 & 7168), 114);
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.n();
                        }
                        bVar2 = bVar3;
                        function10 = function2B;
                        function11 = function2C;
                        function12 = function2D;
                        function13 = function2A;
                        i14 = iA;
                        g1Var2 = g1VarA;
                        j3 = j12;
                        j4 = j5;
                    } else {
                        dVar2 = dVarF;
                        dVar2.q();
                        bVar2 = bVar;
                        g1Var2 = g1Var;
                        function10 = function6;
                        function11 = function7;
                        function12 = function8;
                        function13 = function9;
                        i14 = i;
                        j3 = j;
                        j4 = j2;
                    }
                    s6bVarH = dVar2.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.l3b
                            public final Object invoke(Object obj, Object obj2) {
                                return l1.l(bVar2, function10, function11, function12, function13, i14, j3, j4, g1Var2, ps4Var, i2, i3, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i4 |= 805306368;
                if ((i4 & 306783379) != 306783378) {
                    z = true;
                } else {
                    z = false;
                }
                if (dVarF.g(z, i4 & 1)) {
                    dVarF.U();
                    if ((i2 & 1) != 0) {
                        if (i17 != 0) {
                            bVar3 = androidx.compose.ui.b.INSTANCE;
                        } else {
                            bVar3 = bVar;
                        }
                        if (i18 != 0) {
                            function2B = hp1.a.b();
                        } else {
                            function2B = function6;
                        }
                        if (i5 != 0) {
                            function2C = hp1.a.c();
                        } else {
                            function2C = function7;
                        }
                        if (i7 != 0) {
                            function2D = hp1.a.d();
                        } else {
                            function2D = function8;
                        }
                        if (i9 != 0) {
                            function2A = hp1.a.a();
                        } else {
                            function2A = function9;
                        }
                        if (i11 != 0) {
                            iA = j0.INSTANCE.a();
                        } else {
                            iA = i;
                        }
                        if ((i3 & 64) != 0) {
                            i4 &= -3670017;
                            background = kh7.a.a(dVarF, 6).getBackground();
                        } else {
                            background = j;
                        }
                        if ((i3 & 128) != 0) {
                            jG = bj1.g(background, dVarF, (i4 >> 18) & 14);
                            i4 &= -29360129;
                        } else {
                            jG = j2;
                        }
                        if ((i3 & 256) != 0) {
                            g1VarA = j3b.a.a(dVarF, 6);
                            i4 &= -234881025;
                        } else {
                            g1VarA = g1Var;
                        }
                        j5 = jG;
                    } else {
                        if (i17 != 0) {
                            bVar3 = androidx.compose.ui.b.INSTANCE;
                        } else {
                            bVar3 = bVar;
                        }
                        if (i18 != 0) {
                            function2B = hp1.a.b();
                        } else {
                            function2B = function6;
                        }
                        if (i5 != 0) {
                            function2C = hp1.a.c();
                        } else {
                            function2C = function7;
                        }
                        if (i7 != 0) {
                            function2D = hp1.a.d();
                        } else {
                            function2D = function8;
                        }
                        if (i9 != 0) {
                            function2A = hp1.a.a();
                        } else {
                            function2A = function9;
                        }
                        if (i11 != 0) {
                            iA = j0.INSTANCE.a();
                        } else {
                            iA = i;
                        }
                        if ((i3 & 64) != 0) {
                            i4 &= -3670017;
                            background = kh7.a.a(dVarF, 6).getBackground();
                        } else {
                            background = j;
                        }
                        if ((i3 & 128) != 0) {
                            jG = bj1.g(background, dVarF, (i4 >> 18) & 14);
                            i4 &= -29360129;
                        } else {
                            jG = j2;
                        }
                        if ((i3 & 256) != 0) {
                            g1VarA = j3b.a.a(dVarF, 6);
                            i4 &= -234881025;
                        } else {
                            g1VarA = g1Var;
                        }
                        j5 = jG;
                    }
                    dVarF.M();
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.o(-1211482744, i4, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:93)");
                    }
                    int i116 = (234881024 & i4) ^ r19;
                    if (i116 <= 67108864) {
                    }
                    objR = dVarF.R();
                    if (z2) {
                        objR = new u58(g1VarA);
                        dVarF.L(objR);
                    } else {
                        objR = new u58(g1VarA);
                        dVarF.L(objR);
                    }
                    u58Var = (u58) objR;
                    long j13 = background;
                    zX = dVarF.x(u58Var) | ((i116 <= 67108864 && dVarF.x(g1VarA)) || (i4 & 100663296) == 67108864);
                    objR2 = dVarF.R();
                    if (zX) {
                        objR2 = new Function1() { // from class: com.google.android.k3b
                            public final Object invoke(Object obj) {
                                return l1.k(u58Var, g1VarA, (g1) obj);
                            }
                        };
                        dVarF.L(objR2);
                    } else {
                        objR2 = new Function1() { // from class: com.google.android.k3b
                            public final Object invoke(Object obj) {
                                return l1.k(u58Var, g1VarA, (g1) obj);
                            }
                        };
                        dVarF.L(objR2);
                    }
                    int i27 = i4 >> 12;
                    dVar2 = dVarF;
                    afc.c(WindowInsetsPaddingKt.c(bVar3, (Function1) objR2), null, j13, j5, 0.0f, 0.0f, null, ko1.e(848889571, true, new a(iA, function2B, ps4Var, function2D, function2A, u58Var, function2C), dVarF, 54), dVar2, (i27 & 896) | 12582912 | (i27 & 7168), 114);
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.n();
                    }
                    bVar2 = bVar3;
                    function10 = function2B;
                    function11 = function2C;
                    function12 = function2D;
                    function13 = function2A;
                    i14 = iA;
                    g1Var2 = g1VarA;
                    j3 = j13;
                    j4 = j5;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    bVar2 = bVar;
                    g1Var2 = g1Var;
                    function10 = function6;
                    function11 = function7;
                    function12 = function8;
                    function13 = function9;
                    i14 = i;
                    j3 = j;
                    j4 = j2;
                }
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.l3b
                        public final Object invoke(Object obj, Object obj2) {
                            return l1.l(bVar2, function10, function11, function12, function13, i14, j3, j4, g1Var2, ps4Var, i2, i3, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i4 |= 384;
            function7 = function3;
            i7 = i3 & 8;
            if (i7 != 0) {
                if ((i2 & 3072) == 0) {
                    function8 = function4;
                    if (dVarF.T(function8)) {
                        i8 = 2048;
                    } else {
                        i8 = 1024;
                    }
                    i4 |= i8;
                }
                i9 = i3 & 16;
                if (i9 != 0) {
                    if ((i2 & 24576) == 0) {
                        function9 = function5;
                        if (dVarF.T(function9)) {
                            i10 = 16384;
                        } else {
                            i10 = 8192;
                        }
                        i4 |= i10;
                    }
                    i11 = i3 & 32;
                    if (i11 != 0) {
                        i4 |= 196608;
                    } else if ((i2 & 196608) == 0) {
                        if (dVarF.C(i)) {
                            i12 = 131072;
                        } else {
                            i12 = 65536;
                        }
                        i4 |= i12;
                    }
                    if ((i2 & 1572864) != 0) {
                        if ((i3 & 64) == 0) {
                            i16 = 524288;
                        } else {
                            i16 = 524288;
                        }
                        i4 |= i16;
                    }
                    if ((i2 & 12582912) != 0) {
                        if ((i3 & 128) == 0) {
                            i15 = 4194304;
                        } else {
                            i15 = 4194304;
                        }
                        i4 |= i15;
                    }
                    if ((i2 & 100663296) != 0) {
                        i4 |= ((i3 & 256) == 0 || !dVarF.x(g1Var)) ? 33554432 : 67108864;
                    }
                    if ((i3 & 512) != 0) {
                        if ((i2 & 805306368) == 0) {
                            if (dVarF.T(ps4Var)) {
                                i13 = 536870912;
                            } else {
                                i13 = 268435456;
                            }
                            i4 |= i13;
                        }
                        if ((i4 & 306783379) != 306783378) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (dVarF.g(z, i4 & 1)) {
                            dVarF.U();
                            if ((i2 & 1) != 0) {
                                if (i17 != 0) {
                                    bVar3 = androidx.compose.ui.b.INSTANCE;
                                } else {
                                    bVar3 = bVar;
                                }
                                if (i18 != 0) {
                                    function2B = hp1.a.b();
                                } else {
                                    function2B = function6;
                                }
                                if (i5 != 0) {
                                    function2C = hp1.a.c();
                                } else {
                                    function2C = function7;
                                }
                                if (i7 != 0) {
                                    function2D = hp1.a.d();
                                } else {
                                    function2D = function8;
                                }
                                if (i9 != 0) {
                                    function2A = hp1.a.a();
                                } else {
                                    function2A = function9;
                                }
                                if (i11 != 0) {
                                    iA = j0.INSTANCE.a();
                                } else {
                                    iA = i;
                                }
                                if ((i3 & 64) != 0) {
                                    i4 &= -3670017;
                                    background = kh7.a.a(dVarF, 6).getBackground();
                                } else {
                                    background = j;
                                }
                                if ((i3 & 128) != 0) {
                                    jG = bj1.g(background, dVarF, (i4 >> 18) & 14);
                                    i4 &= -29360129;
                                } else {
                                    jG = j2;
                                }
                                if ((i3 & 256) != 0) {
                                    g1VarA = j3b.a.a(dVarF, 6);
                                    i4 &= -234881025;
                                } else {
                                    g1VarA = g1Var;
                                }
                                j5 = jG;
                            } else {
                                if (i17 != 0) {
                                    bVar3 = androidx.compose.ui.b.INSTANCE;
                                } else {
                                    bVar3 = bVar;
                                }
                                if (i18 != 0) {
                                    function2B = hp1.a.b();
                                } else {
                                    function2B = function6;
                                }
                                if (i5 != 0) {
                                    function2C = hp1.a.c();
                                } else {
                                    function2C = function7;
                                }
                                if (i7 != 0) {
                                    function2D = hp1.a.d();
                                } else {
                                    function2D = function8;
                                }
                                if (i9 != 0) {
                                    function2A = hp1.a.a();
                                } else {
                                    function2A = function9;
                                }
                                if (i11 != 0) {
                                    iA = j0.INSTANCE.a();
                                } else {
                                    iA = i;
                                }
                                if ((i3 & 64) != 0) {
                                    i4 &= -3670017;
                                    background = kh7.a.a(dVarF, 6).getBackground();
                                } else {
                                    background = j;
                                }
                                if ((i3 & 128) != 0) {
                                    jG = bj1.g(background, dVarF, (i4 >> 18) & 14);
                                    i4 &= -29360129;
                                } else {
                                    jG = j2;
                                }
                                if ((i3 & 256) != 0) {
                                    g1VarA = j3b.a.a(dVarF, 6);
                                    i4 &= -234881025;
                                } else {
                                    g1VarA = g1Var;
                                }
                                j5 = jG;
                            }
                            dVarF.M();
                            if (androidx.compose.p004runtime.e.k()) {
                                androidx.compose.p004runtime.e.o(-1211482744, i4, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:93)");
                            }
                            int i117 = (234881024 & i4) ^ r19;
                            if (i117 <= 67108864) {
                            }
                            objR = dVarF.R();
                            if (z2) {
                                objR = new u58(g1VarA);
                                dVarF.L(objR);
                            } else {
                                objR = new u58(g1VarA);
                                dVarF.L(objR);
                            }
                            u58Var = (u58) objR;
                            long j14 = background;
                            zX = dVarF.x(u58Var) | ((i117 <= 67108864 && dVarF.x(g1VarA)) || (i4 & 100663296) == 67108864);
                            objR2 = dVarF.R();
                            if (zX) {
                                objR2 = new Function1() { // from class: com.google.android.k3b
                                    public final Object invoke(Object obj) {
                                        return l1.k(u58Var, g1VarA, (g1) obj);
                                    }
                                };
                                dVarF.L(objR2);
                            } else {
                                objR2 = new Function1() { // from class: com.google.android.k3b
                                    public final Object invoke(Object obj) {
                                        return l1.k(u58Var, g1VarA, (g1) obj);
                                    }
                                };
                                dVarF.L(objR2);
                            }
                            int i28 = i4 >> 12;
                            dVar2 = dVarF;
                            afc.c(WindowInsetsPaddingKt.c(bVar3, (Function1) objR2), null, j14, j5, 0.0f, 0.0f, null, ko1.e(848889571, true, new a(iA, function2B, ps4Var, function2D, function2A, u58Var, function2C), dVarF, 54), dVar2, (i28 & 896) | 12582912 | (i28 & 7168), 114);
                            if (androidx.compose.p004runtime.e.k()) {
                                androidx.compose.p004runtime.e.n();
                            }
                            bVar2 = bVar3;
                            function10 = function2B;
                            function11 = function2C;
                            function12 = function2D;
                            function13 = function2A;
                            i14 = iA;
                            g1Var2 = g1VarA;
                            j3 = j14;
                            j4 = j5;
                        } else {
                            dVar2 = dVarF;
                            dVar2.q();
                            bVar2 = bVar;
                            g1Var2 = g1Var;
                            function10 = function6;
                            function11 = function7;
                            function12 = function8;
                            function13 = function9;
                            i14 = i;
                            j3 = j;
                            j4 = j2;
                        }
                        s6bVarH = dVar2.H();
                        if (s6bVarH != null) {
                            s6bVarH.a(new Function2() { // from class: com.google.android.l3b
                                public final Object invoke(Object obj, Object obj2) {
                                    return l1.l(bVar2, function10, function11, function12, function13, i14, j3, j4, g1Var2, ps4Var, i2, i3, (d) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i4 |= 805306368;
                    if ((i4 & 306783379) != 306783378) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (dVarF.g(z, i4 & 1)) {
                        dVarF.U();
                        if ((i2 & 1) != 0) {
                            if (i17 != 0) {
                                bVar3 = androidx.compose.ui.b.INSTANCE;
                            } else {
                                bVar3 = bVar;
                            }
                            if (i18 != 0) {
                                function2B = hp1.a.b();
                            } else {
                                function2B = function6;
                            }
                            if (i5 != 0) {
                                function2C = hp1.a.c();
                            } else {
                                function2C = function7;
                            }
                            if (i7 != 0) {
                                function2D = hp1.a.d();
                            } else {
                                function2D = function8;
                            }
                            if (i9 != 0) {
                                function2A = hp1.a.a();
                            } else {
                                function2A = function9;
                            }
                            if (i11 != 0) {
                                iA = j0.INSTANCE.a();
                            } else {
                                iA = i;
                            }
                            if ((i3 & 64) != 0) {
                                i4 &= -3670017;
                                background = kh7.a.a(dVarF, 6).getBackground();
                            } else {
                                background = j;
                            }
                            if ((i3 & 128) != 0) {
                                jG = bj1.g(background, dVarF, (i4 >> 18) & 14);
                                i4 &= -29360129;
                            } else {
                                jG = j2;
                            }
                            if ((i3 & 256) != 0) {
                                g1VarA = j3b.a.a(dVarF, 6);
                                i4 &= -234881025;
                            } else {
                                g1VarA = g1Var;
                            }
                            j5 = jG;
                        } else {
                            if (i17 != 0) {
                                bVar3 = androidx.compose.ui.b.INSTANCE;
                            } else {
                                bVar3 = bVar;
                            }
                            if (i18 != 0) {
                                function2B = hp1.a.b();
                            } else {
                                function2B = function6;
                            }
                            if (i5 != 0) {
                                function2C = hp1.a.c();
                            } else {
                                function2C = function7;
                            }
                            if (i7 != 0) {
                                function2D = hp1.a.d();
                            } else {
                                function2D = function8;
                            }
                            if (i9 != 0) {
                                function2A = hp1.a.a();
                            } else {
                                function2A = function9;
                            }
                            if (i11 != 0) {
                                iA = j0.INSTANCE.a();
                            } else {
                                iA = i;
                            }
                            if ((i3 & 64) != 0) {
                                i4 &= -3670017;
                                background = kh7.a.a(dVarF, 6).getBackground();
                            } else {
                                background = j;
                            }
                            if ((i3 & 128) != 0) {
                                jG = bj1.g(background, dVarF, (i4 >> 18) & 14);
                                i4 &= -29360129;
                            } else {
                                jG = j2;
                            }
                            if ((i3 & 256) != 0) {
                                g1VarA = j3b.a.a(dVarF, 6);
                                i4 &= -234881025;
                            } else {
                                g1VarA = g1Var;
                            }
                            j5 = jG;
                        }
                        dVarF.M();
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.o(-1211482744, i4, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:93)");
                        }
                        int i118 = (234881024 & i4) ^ r19;
                        if (i118 <= 67108864) {
                        }
                        objR = dVarF.R();
                        if (z2) {
                            objR = new u58(g1VarA);
                            dVarF.L(objR);
                        } else {
                            objR = new u58(g1VarA);
                            dVarF.L(objR);
                        }
                        u58Var = (u58) objR;
                        long j15 = background;
                        zX = dVarF.x(u58Var) | ((i118 <= 67108864 && dVarF.x(g1VarA)) || (i4 & 100663296) == 67108864);
                        objR2 = dVarF.R();
                        if (zX) {
                            objR2 = new Function1() { // from class: com.google.android.k3b
                                public final Object invoke(Object obj) {
                                    return l1.k(u58Var, g1VarA, (g1) obj);
                                }
                            };
                            dVarF.L(objR2);
                        } else {
                            objR2 = new Function1() { // from class: com.google.android.k3b
                                public final Object invoke(Object obj) {
                                    return l1.k(u58Var, g1VarA, (g1) obj);
                                }
                            };
                            dVarF.L(objR2);
                        }
                        int i29 = i4 >> 12;
                        dVar2 = dVarF;
                        afc.c(WindowInsetsPaddingKt.c(bVar3, (Function1) objR2), null, j15, j5, 0.0f, 0.0f, null, ko1.e(848889571, true, new a(iA, function2B, ps4Var, function2D, function2A, u58Var, function2C), dVarF, 54), dVar2, (i29 & 896) | 12582912 | (i29 & 7168), 114);
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.n();
                        }
                        bVar2 = bVar3;
                        function10 = function2B;
                        function11 = function2C;
                        function12 = function2D;
                        function13 = function2A;
                        i14 = iA;
                        g1Var2 = g1VarA;
                        j3 = j15;
                        j4 = j5;
                    } else {
                        dVar2 = dVarF;
                        dVar2.q();
                        bVar2 = bVar;
                        g1Var2 = g1Var;
                        function10 = function6;
                        function11 = function7;
                        function12 = function8;
                        function13 = function9;
                        i14 = i;
                        j3 = j;
                        j4 = j2;
                    }
                    s6bVarH = dVar2.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.l3b
                            public final Object invoke(Object obj, Object obj2) {
                                return l1.l(bVar2, function10, function11, function12, function13, i14, j3, j4, g1Var2, ps4Var, i2, i3, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i4 |= 24576;
                function9 = function5;
                i11 = i3 & 32;
                if (i11 != 0) {
                    i4 |= 196608;
                } else if ((i2 & 196608) == 0) {
                    if (dVarF.C(i)) {
                        i12 = 131072;
                    } else {
                        i12 = 65536;
                    }
                    i4 |= i12;
                }
                if ((i2 & 1572864) != 0) {
                    if ((i3 & 64) == 0) {
                        i16 = 524288;
                    } else {
                        i16 = 524288;
                    }
                    i4 |= i16;
                }
                if ((i2 & 12582912) != 0) {
                    if ((i3 & 128) == 0) {
                        i15 = 4194304;
                    } else {
                        i15 = 4194304;
                    }
                    i4 |= i15;
                }
                if ((i2 & 100663296) != 0) {
                    i4 |= ((i3 & 256) == 0 || !dVarF.x(g1Var)) ? 33554432 : 67108864;
                }
                if ((i3 & 512) != 0) {
                    if ((i2 & 805306368) == 0) {
                        if (dVarF.T(ps4Var)) {
                            i13 = 536870912;
                        } else {
                            i13 = 268435456;
                        }
                        i4 |= i13;
                    }
                    if ((i4 & 306783379) != 306783378) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (dVarF.g(z, i4 & 1)) {
                        dVarF.U();
                        if ((i2 & 1) != 0) {
                            if (i17 != 0) {
                                bVar3 = androidx.compose.ui.b.INSTANCE;
                            } else {
                                bVar3 = bVar;
                            }
                            if (i18 != 0) {
                                function2B = hp1.a.b();
                            } else {
                                function2B = function6;
                            }
                            if (i5 != 0) {
                                function2C = hp1.a.c();
                            } else {
                                function2C = function7;
                            }
                            if (i7 != 0) {
                                function2D = hp1.a.d();
                            } else {
                                function2D = function8;
                            }
                            if (i9 != 0) {
                                function2A = hp1.a.a();
                            } else {
                                function2A = function9;
                            }
                            if (i11 != 0) {
                                iA = j0.INSTANCE.a();
                            } else {
                                iA = i;
                            }
                            if ((i3 & 64) != 0) {
                                i4 &= -3670017;
                                background = kh7.a.a(dVarF, 6).getBackground();
                            } else {
                                background = j;
                            }
                            if ((i3 & 128) != 0) {
                                jG = bj1.g(background, dVarF, (i4 >> 18) & 14);
                                i4 &= -29360129;
                            } else {
                                jG = j2;
                            }
                            if ((i3 & 256) != 0) {
                                g1VarA = j3b.a.a(dVarF, 6);
                                i4 &= -234881025;
                            } else {
                                g1VarA = g1Var;
                            }
                            j5 = jG;
                        } else {
                            if (i17 != 0) {
                                bVar3 = androidx.compose.ui.b.INSTANCE;
                            } else {
                                bVar3 = bVar;
                            }
                            if (i18 != 0) {
                                function2B = hp1.a.b();
                            } else {
                                function2B = function6;
                            }
                            if (i5 != 0) {
                                function2C = hp1.a.c();
                            } else {
                                function2C = function7;
                            }
                            if (i7 != 0) {
                                function2D = hp1.a.d();
                            } else {
                                function2D = function8;
                            }
                            if (i9 != 0) {
                                function2A = hp1.a.a();
                            } else {
                                function2A = function9;
                            }
                            if (i11 != 0) {
                                iA = j0.INSTANCE.a();
                            } else {
                                iA = i;
                            }
                            if ((i3 & 64) != 0) {
                                i4 &= -3670017;
                                background = kh7.a.a(dVarF, 6).getBackground();
                            } else {
                                background = j;
                            }
                            if ((i3 & 128) != 0) {
                                jG = bj1.g(background, dVarF, (i4 >> 18) & 14);
                                i4 &= -29360129;
                            } else {
                                jG = j2;
                            }
                            if ((i3 & 256) != 0) {
                                g1VarA = j3b.a.a(dVarF, 6);
                                i4 &= -234881025;
                            } else {
                                g1VarA = g1Var;
                            }
                            j5 = jG;
                        }
                        dVarF.M();
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.o(-1211482744, i4, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:93)");
                        }
                        int i119 = (234881024 & i4) ^ r19;
                        if (i119 <= 67108864) {
                        }
                        objR = dVarF.R();
                        if (z2) {
                            objR = new u58(g1VarA);
                            dVarF.L(objR);
                        } else {
                            objR = new u58(g1VarA);
                            dVarF.L(objR);
                        }
                        u58Var = (u58) objR;
                        long j16 = background;
                        zX = dVarF.x(u58Var) | ((i119 <= 67108864 && dVarF.x(g1VarA)) || (i4 & 100663296) == 67108864);
                        objR2 = dVarF.R();
                        if (zX) {
                            objR2 = new Function1() { // from class: com.google.android.k3b
                                public final Object invoke(Object obj) {
                                    return l1.k(u58Var, g1VarA, (g1) obj);
                                }
                            };
                            dVarF.L(objR2);
                        } else {
                            objR2 = new Function1() { // from class: com.google.android.k3b
                                public final Object invoke(Object obj) {
                                    return l1.k(u58Var, g1VarA, (g1) obj);
                                }
                            };
                            dVarF.L(objR2);
                        }
                        int i210 = i4 >> 12;
                        dVar2 = dVarF;
                        afc.c(WindowInsetsPaddingKt.c(bVar3, (Function1) objR2), null, j16, j5, 0.0f, 0.0f, null, ko1.e(848889571, true, new a(iA, function2B, ps4Var, function2D, function2A, u58Var, function2C), dVarF, 54), dVar2, (i210 & 896) | 12582912 | (i210 & 7168), 114);
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.n();
                        }
                        bVar2 = bVar3;
                        function10 = function2B;
                        function11 = function2C;
                        function12 = function2D;
                        function13 = function2A;
                        i14 = iA;
                        g1Var2 = g1VarA;
                        j3 = j16;
                        j4 = j5;
                    } else {
                        dVar2 = dVarF;
                        dVar2.q();
                        bVar2 = bVar;
                        g1Var2 = g1Var;
                        function10 = function6;
                        function11 = function7;
                        function12 = function8;
                        function13 = function9;
                        i14 = i;
                        j3 = j;
                        j4 = j2;
                    }
                    s6bVarH = dVar2.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.l3b
                            public final Object invoke(Object obj, Object obj2) {
                                return l1.l(bVar2, function10, function11, function12, function13, i14, j3, j4, g1Var2, ps4Var, i2, i3, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i4 |= 805306368;
                if ((i4 & 306783379) != 306783378) {
                    z = true;
                } else {
                    z = false;
                }
                if (dVarF.g(z, i4 & 1)) {
                    dVarF.U();
                    if ((i2 & 1) != 0) {
                        if (i17 != 0) {
                            bVar3 = androidx.compose.ui.b.INSTANCE;
                        } else {
                            bVar3 = bVar;
                        }
                        if (i18 != 0) {
                            function2B = hp1.a.b();
                        } else {
                            function2B = function6;
                        }
                        if (i5 != 0) {
                            function2C = hp1.a.c();
                        } else {
                            function2C = function7;
                        }
                        if (i7 != 0) {
                            function2D = hp1.a.d();
                        } else {
                            function2D = function8;
                        }
                        if (i9 != 0) {
                            function2A = hp1.a.a();
                        } else {
                            function2A = function9;
                        }
                        if (i11 != 0) {
                            iA = j0.INSTANCE.a();
                        } else {
                            iA = i;
                        }
                        if ((i3 & 64) != 0) {
                            i4 &= -3670017;
                            background = kh7.a.a(dVarF, 6).getBackground();
                        } else {
                            background = j;
                        }
                        if ((i3 & 128) != 0) {
                            jG = bj1.g(background, dVarF, (i4 >> 18) & 14);
                            i4 &= -29360129;
                        } else {
                            jG = j2;
                        }
                        if ((i3 & 256) != 0) {
                            g1VarA = j3b.a.a(dVarF, 6);
                            i4 &= -234881025;
                        } else {
                            g1VarA = g1Var;
                        }
                        j5 = jG;
                    } else {
                        if (i17 != 0) {
                            bVar3 = androidx.compose.ui.b.INSTANCE;
                        } else {
                            bVar3 = bVar;
                        }
                        if (i18 != 0) {
                            function2B = hp1.a.b();
                        } else {
                            function2B = function6;
                        }
                        if (i5 != 0) {
                            function2C = hp1.a.c();
                        } else {
                            function2C = function7;
                        }
                        if (i7 != 0) {
                            function2D = hp1.a.d();
                        } else {
                            function2D = function8;
                        }
                        if (i9 != 0) {
                            function2A = hp1.a.a();
                        } else {
                            function2A = function9;
                        }
                        if (i11 != 0) {
                            iA = j0.INSTANCE.a();
                        } else {
                            iA = i;
                        }
                        if ((i3 & 64) != 0) {
                            i4 &= -3670017;
                            background = kh7.a.a(dVarF, 6).getBackground();
                        } else {
                            background = j;
                        }
                        if ((i3 & 128) != 0) {
                            jG = bj1.g(background, dVarF, (i4 >> 18) & 14);
                            i4 &= -29360129;
                        } else {
                            jG = j2;
                        }
                        if ((i3 & 256) != 0) {
                            g1VarA = j3b.a.a(dVarF, 6);
                            i4 &= -234881025;
                        } else {
                            g1VarA = g1Var;
                        }
                        j5 = jG;
                    }
                    dVarF.M();
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.o(-1211482744, i4, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:93)");
                    }
                    int i1110 = (234881024 & i4) ^ r19;
                    if (i1110 <= 67108864) {
                    }
                    objR = dVarF.R();
                    if (z2) {
                        objR = new u58(g1VarA);
                        dVarF.L(objR);
                    } else {
                        objR = new u58(g1VarA);
                        dVarF.L(objR);
                    }
                    u58Var = (u58) objR;
                    long j17 = background;
                    zX = dVarF.x(u58Var) | ((i1110 <= 67108864 && dVarF.x(g1VarA)) || (i4 & 100663296) == 67108864);
                    objR2 = dVarF.R();
                    if (zX) {
                        objR2 = new Function1() { // from class: com.google.android.k3b
                            public final Object invoke(Object obj) {
                                return l1.k(u58Var, g1VarA, (g1) obj);
                            }
                        };
                        dVarF.L(objR2);
                    } else {
                        objR2 = new Function1() { // from class: com.google.android.k3b
                            public final Object invoke(Object obj) {
                                return l1.k(u58Var, g1VarA, (g1) obj);
                            }
                        };
                        dVarF.L(objR2);
                    }
                    int i211 = i4 >> 12;
                    dVar2 = dVarF;
                    afc.c(WindowInsetsPaddingKt.c(bVar3, (Function1) objR2), null, j17, j5, 0.0f, 0.0f, null, ko1.e(848889571, true, new a(iA, function2B, ps4Var, function2D, function2A, u58Var, function2C), dVarF, 54), dVar2, (i211 & 896) | 12582912 | (i211 & 7168), 114);
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.n();
                    }
                    bVar2 = bVar3;
                    function10 = function2B;
                    function11 = function2C;
                    function12 = function2D;
                    function13 = function2A;
                    i14 = iA;
                    g1Var2 = g1VarA;
                    j3 = j17;
                    j4 = j5;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    bVar2 = bVar;
                    g1Var2 = g1Var;
                    function10 = function6;
                    function11 = function7;
                    function12 = function8;
                    function13 = function9;
                    i14 = i;
                    j3 = j;
                    j4 = j2;
                }
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.l3b
                        public final Object invoke(Object obj, Object obj2) {
                            return l1.l(bVar2, function10, function11, function12, function13, i14, j3, j4, g1Var2, ps4Var, i2, i3, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i4 |= 3072;
            function8 = function4;
            i9 = i3 & 16;
            if (i9 != 0) {
                if ((i2 & 24576) == 0) {
                    function9 = function5;
                    if (dVarF.T(function9)) {
                        i10 = 16384;
                    } else {
                        i10 = 8192;
                    }
                    i4 |= i10;
                }
                i11 = i3 & 32;
                if (i11 != 0) {
                    i4 |= 196608;
                } else if ((i2 & 196608) == 0) {
                    if (dVarF.C(i)) {
                        i12 = 131072;
                    } else {
                        i12 = 65536;
                    }
                    i4 |= i12;
                }
                if ((i2 & 1572864) != 0) {
                    if ((i3 & 64) == 0) {
                        i16 = 524288;
                    } else {
                        i16 = 524288;
                    }
                    i4 |= i16;
                }
                if ((i2 & 12582912) != 0) {
                    if ((i3 & 128) == 0) {
                        i15 = 4194304;
                    } else {
                        i15 = 4194304;
                    }
                    i4 |= i15;
                }
                if ((i2 & 100663296) != 0) {
                    i4 |= ((i3 & 256) == 0 || !dVarF.x(g1Var)) ? 33554432 : 67108864;
                }
                if ((i3 & 512) != 0) {
                    if ((i2 & 805306368) == 0) {
                        if (dVarF.T(ps4Var)) {
                            i13 = 536870912;
                        } else {
                            i13 = 268435456;
                        }
                        i4 |= i13;
                    }
                    if ((i4 & 306783379) != 306783378) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (dVarF.g(z, i4 & 1)) {
                        dVarF.U();
                        if ((i2 & 1) != 0) {
                            if (i17 != 0) {
                                bVar3 = androidx.compose.ui.b.INSTANCE;
                            } else {
                                bVar3 = bVar;
                            }
                            if (i18 != 0) {
                                function2B = hp1.a.b();
                            } else {
                                function2B = function6;
                            }
                            if (i5 != 0) {
                                function2C = hp1.a.c();
                            } else {
                                function2C = function7;
                            }
                            if (i7 != 0) {
                                function2D = hp1.a.d();
                            } else {
                                function2D = function8;
                            }
                            if (i9 != 0) {
                                function2A = hp1.a.a();
                            } else {
                                function2A = function9;
                            }
                            if (i11 != 0) {
                                iA = j0.INSTANCE.a();
                            } else {
                                iA = i;
                            }
                            if ((i3 & 64) != 0) {
                                i4 &= -3670017;
                                background = kh7.a.a(dVarF, 6).getBackground();
                            } else {
                                background = j;
                            }
                            if ((i3 & 128) != 0) {
                                jG = bj1.g(background, dVarF, (i4 >> 18) & 14);
                                i4 &= -29360129;
                            } else {
                                jG = j2;
                            }
                            if ((i3 & 256) != 0) {
                                g1VarA = j3b.a.a(dVarF, 6);
                                i4 &= -234881025;
                            } else {
                                g1VarA = g1Var;
                            }
                            j5 = jG;
                        } else {
                            if (i17 != 0) {
                                bVar3 = androidx.compose.ui.b.INSTANCE;
                            } else {
                                bVar3 = bVar;
                            }
                            if (i18 != 0) {
                                function2B = hp1.a.b();
                            } else {
                                function2B = function6;
                            }
                            if (i5 != 0) {
                                function2C = hp1.a.c();
                            } else {
                                function2C = function7;
                            }
                            if (i7 != 0) {
                                function2D = hp1.a.d();
                            } else {
                                function2D = function8;
                            }
                            if (i9 != 0) {
                                function2A = hp1.a.a();
                            } else {
                                function2A = function9;
                            }
                            if (i11 != 0) {
                                iA = j0.INSTANCE.a();
                            } else {
                                iA = i;
                            }
                            if ((i3 & 64) != 0) {
                                i4 &= -3670017;
                                background = kh7.a.a(dVarF, 6).getBackground();
                            } else {
                                background = j;
                            }
                            if ((i3 & 128) != 0) {
                                jG = bj1.g(background, dVarF, (i4 >> 18) & 14);
                                i4 &= -29360129;
                            } else {
                                jG = j2;
                            }
                            if ((i3 & 256) != 0) {
                                g1VarA = j3b.a.a(dVarF, 6);
                                i4 &= -234881025;
                            } else {
                                g1VarA = g1Var;
                            }
                            j5 = jG;
                        }
                        dVarF.M();
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.o(-1211482744, i4, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:93)");
                        }
                        int i1111 = (234881024 & i4) ^ r19;
                        if (i1111 <= 67108864) {
                        }
                        objR = dVarF.R();
                        if (z2) {
                            objR = new u58(g1VarA);
                            dVarF.L(objR);
                        } else {
                            objR = new u58(g1VarA);
                            dVarF.L(objR);
                        }
                        u58Var = (u58) objR;
                        long j18 = background;
                        zX = dVarF.x(u58Var) | ((i1111 <= 67108864 && dVarF.x(g1VarA)) || (i4 & 100663296) == 67108864);
                        objR2 = dVarF.R();
                        if (zX) {
                            objR2 = new Function1() { // from class: com.google.android.k3b
                                public final Object invoke(Object obj) {
                                    return l1.k(u58Var, g1VarA, (g1) obj);
                                }
                            };
                            dVarF.L(objR2);
                        } else {
                            objR2 = new Function1() { // from class: com.google.android.k3b
                                public final Object invoke(Object obj) {
                                    return l1.k(u58Var, g1VarA, (g1) obj);
                                }
                            };
                            dVarF.L(objR2);
                        }
                        int i212 = i4 >> 12;
                        dVar2 = dVarF;
                        afc.c(WindowInsetsPaddingKt.c(bVar3, (Function1) objR2), null, j18, j5, 0.0f, 0.0f, null, ko1.e(848889571, true, new a(iA, function2B, ps4Var, function2D, function2A, u58Var, function2C), dVarF, 54), dVar2, (i212 & 896) | 12582912 | (i212 & 7168), 114);
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.n();
                        }
                        bVar2 = bVar3;
                        function10 = function2B;
                        function11 = function2C;
                        function12 = function2D;
                        function13 = function2A;
                        i14 = iA;
                        g1Var2 = g1VarA;
                        j3 = j18;
                        j4 = j5;
                    } else {
                        dVar2 = dVarF;
                        dVar2.q();
                        bVar2 = bVar;
                        g1Var2 = g1Var;
                        function10 = function6;
                        function11 = function7;
                        function12 = function8;
                        function13 = function9;
                        i14 = i;
                        j3 = j;
                        j4 = j2;
                    }
                    s6bVarH = dVar2.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.l3b
                            public final Object invoke(Object obj, Object obj2) {
                                return l1.l(bVar2, function10, function11, function12, function13, i14, j3, j4, g1Var2, ps4Var, i2, i3, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i4 |= 805306368;
                if ((i4 & 306783379) != 306783378) {
                    z = true;
                } else {
                    z = false;
                }
                if (dVarF.g(z, i4 & 1)) {
                    dVarF.U();
                    if ((i2 & 1) != 0) {
                        if (i17 != 0) {
                            bVar3 = androidx.compose.ui.b.INSTANCE;
                        } else {
                            bVar3 = bVar;
                        }
                        if (i18 != 0) {
                            function2B = hp1.a.b();
                        } else {
                            function2B = function6;
                        }
                        if (i5 != 0) {
                            function2C = hp1.a.c();
                        } else {
                            function2C = function7;
                        }
                        if (i7 != 0) {
                            function2D = hp1.a.d();
                        } else {
                            function2D = function8;
                        }
                        if (i9 != 0) {
                            function2A = hp1.a.a();
                        } else {
                            function2A = function9;
                        }
                        if (i11 != 0) {
                            iA = j0.INSTANCE.a();
                        } else {
                            iA = i;
                        }
                        if ((i3 & 64) != 0) {
                            i4 &= -3670017;
                            background = kh7.a.a(dVarF, 6).getBackground();
                        } else {
                            background = j;
                        }
                        if ((i3 & 128) != 0) {
                            jG = bj1.g(background, dVarF, (i4 >> 18) & 14);
                            i4 &= -29360129;
                        } else {
                            jG = j2;
                        }
                        if ((i3 & 256) != 0) {
                            g1VarA = j3b.a.a(dVarF, 6);
                            i4 &= -234881025;
                        } else {
                            g1VarA = g1Var;
                        }
                        j5 = jG;
                    } else {
                        if (i17 != 0) {
                            bVar3 = androidx.compose.ui.b.INSTANCE;
                        } else {
                            bVar3 = bVar;
                        }
                        if (i18 != 0) {
                            function2B = hp1.a.b();
                        } else {
                            function2B = function6;
                        }
                        if (i5 != 0) {
                            function2C = hp1.a.c();
                        } else {
                            function2C = function7;
                        }
                        if (i7 != 0) {
                            function2D = hp1.a.d();
                        } else {
                            function2D = function8;
                        }
                        if (i9 != 0) {
                            function2A = hp1.a.a();
                        } else {
                            function2A = function9;
                        }
                        if (i11 != 0) {
                            iA = j0.INSTANCE.a();
                        } else {
                            iA = i;
                        }
                        if ((i3 & 64) != 0) {
                            i4 &= -3670017;
                            background = kh7.a.a(dVarF, 6).getBackground();
                        } else {
                            background = j;
                        }
                        if ((i3 & 128) != 0) {
                            jG = bj1.g(background, dVarF, (i4 >> 18) & 14);
                            i4 &= -29360129;
                        } else {
                            jG = j2;
                        }
                        if ((i3 & 256) != 0) {
                            g1VarA = j3b.a.a(dVarF, 6);
                            i4 &= -234881025;
                        } else {
                            g1VarA = g1Var;
                        }
                        j5 = jG;
                    }
                    dVarF.M();
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.o(-1211482744, i4, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:93)");
                    }
                    int i1112 = (234881024 & i4) ^ r19;
                    if (i1112 <= 67108864) {
                    }
                    objR = dVarF.R();
                    if (z2) {
                        objR = new u58(g1VarA);
                        dVarF.L(objR);
                    } else {
                        objR = new u58(g1VarA);
                        dVarF.L(objR);
                    }
                    u58Var = (u58) objR;
                    long j19 = background;
                    zX = dVarF.x(u58Var) | ((i1112 <= 67108864 && dVarF.x(g1VarA)) || (i4 & 100663296) == 67108864);
                    objR2 = dVarF.R();
                    if (zX) {
                        objR2 = new Function1() { // from class: com.google.android.k3b
                            public final Object invoke(Object obj) {
                                return l1.k(u58Var, g1VarA, (g1) obj);
                            }
                        };
                        dVarF.L(objR2);
                    } else {
                        objR2 = new Function1() { // from class: com.google.android.k3b
                            public final Object invoke(Object obj) {
                                return l1.k(u58Var, g1VarA, (g1) obj);
                            }
                        };
                        dVarF.L(objR2);
                    }
                    int i213 = i4 >> 12;
                    dVar2 = dVarF;
                    afc.c(WindowInsetsPaddingKt.c(bVar3, (Function1) objR2), null, j19, j5, 0.0f, 0.0f, null, ko1.e(848889571, true, new a(iA, function2B, ps4Var, function2D, function2A, u58Var, function2C), dVarF, 54), dVar2, (i213 & 896) | 12582912 | (i213 & 7168), 114);
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.n();
                    }
                    bVar2 = bVar3;
                    function10 = function2B;
                    function11 = function2C;
                    function12 = function2D;
                    function13 = function2A;
                    i14 = iA;
                    g1Var2 = g1VarA;
                    j3 = j19;
                    j4 = j5;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    bVar2 = bVar;
                    g1Var2 = g1Var;
                    function10 = function6;
                    function11 = function7;
                    function12 = function8;
                    function13 = function9;
                    i14 = i;
                    j3 = j;
                    j4 = j2;
                }
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.l3b
                        public final Object invoke(Object obj, Object obj2) {
                            return l1.l(bVar2, function10, function11, function12, function13, i14, j3, j4, g1Var2, ps4Var, i2, i3, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i4 |= 24576;
            function9 = function5;
            i11 = i3 & 32;
            if (i11 != 0) {
                i4 |= 196608;
            } else if ((i2 & 196608) == 0) {
                if (dVarF.C(i)) {
                    i12 = 131072;
                } else {
                    i12 = 65536;
                }
                i4 |= i12;
            }
            if ((i2 & 1572864) != 0) {
                if ((i3 & 64) == 0) {
                    i16 = 524288;
                } else {
                    i16 = 524288;
                }
                i4 |= i16;
            }
            if ((i2 & 12582912) != 0) {
                if ((i3 & 128) == 0) {
                    i15 = 4194304;
                } else {
                    i15 = 4194304;
                }
                i4 |= i15;
            }
            if ((i2 & 100663296) != 0) {
                i4 |= ((i3 & 256) == 0 || !dVarF.x(g1Var)) ? 33554432 : 67108864;
            }
            if ((i3 & 512) != 0) {
                if ((i2 & 805306368) == 0) {
                    if (dVarF.T(ps4Var)) {
                        i13 = 536870912;
                    } else {
                        i13 = 268435456;
                    }
                    i4 |= i13;
                }
                if ((i4 & 306783379) != 306783378) {
                    z = true;
                } else {
                    z = false;
                }
                if (dVarF.g(z, i4 & 1)) {
                    dVarF.U();
                    if ((i2 & 1) != 0) {
                        if (i17 != 0) {
                            bVar3 = androidx.compose.ui.b.INSTANCE;
                        } else {
                            bVar3 = bVar;
                        }
                        if (i18 != 0) {
                            function2B = hp1.a.b();
                        } else {
                            function2B = function6;
                        }
                        if (i5 != 0) {
                            function2C = hp1.a.c();
                        } else {
                            function2C = function7;
                        }
                        if (i7 != 0) {
                            function2D = hp1.a.d();
                        } else {
                            function2D = function8;
                        }
                        if (i9 != 0) {
                            function2A = hp1.a.a();
                        } else {
                            function2A = function9;
                        }
                        if (i11 != 0) {
                            iA = j0.INSTANCE.a();
                        } else {
                            iA = i;
                        }
                        if ((i3 & 64) != 0) {
                            i4 &= -3670017;
                            background = kh7.a.a(dVarF, 6).getBackground();
                        } else {
                            background = j;
                        }
                        if ((i3 & 128) != 0) {
                            jG = bj1.g(background, dVarF, (i4 >> 18) & 14);
                            i4 &= -29360129;
                        } else {
                            jG = j2;
                        }
                        if ((i3 & 256) != 0) {
                            g1VarA = j3b.a.a(dVarF, 6);
                            i4 &= -234881025;
                        } else {
                            g1VarA = g1Var;
                        }
                        j5 = jG;
                    } else {
                        if (i17 != 0) {
                            bVar3 = androidx.compose.ui.b.INSTANCE;
                        } else {
                            bVar3 = bVar;
                        }
                        if (i18 != 0) {
                            function2B = hp1.a.b();
                        } else {
                            function2B = function6;
                        }
                        if (i5 != 0) {
                            function2C = hp1.a.c();
                        } else {
                            function2C = function7;
                        }
                        if (i7 != 0) {
                            function2D = hp1.a.d();
                        } else {
                            function2D = function8;
                        }
                        if (i9 != 0) {
                            function2A = hp1.a.a();
                        } else {
                            function2A = function9;
                        }
                        if (i11 != 0) {
                            iA = j0.INSTANCE.a();
                        } else {
                            iA = i;
                        }
                        if ((i3 & 64) != 0) {
                            i4 &= -3670017;
                            background = kh7.a.a(dVarF, 6).getBackground();
                        } else {
                            background = j;
                        }
                        if ((i3 & 128) != 0) {
                            jG = bj1.g(background, dVarF, (i4 >> 18) & 14);
                            i4 &= -29360129;
                        } else {
                            jG = j2;
                        }
                        if ((i3 & 256) != 0) {
                            g1VarA = j3b.a.a(dVarF, 6);
                            i4 &= -234881025;
                        } else {
                            g1VarA = g1Var;
                        }
                        j5 = jG;
                    }
                    dVarF.M();
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.o(-1211482744, i4, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:93)");
                    }
                    int i1113 = (234881024 & i4) ^ r19;
                    if (i1113 <= 67108864) {
                    }
                    objR = dVarF.R();
                    if (z2) {
                        objR = new u58(g1VarA);
                        dVarF.L(objR);
                    } else {
                        objR = new u58(g1VarA);
                        dVarF.L(objR);
                    }
                    u58Var = (u58) objR;
                    long j110 = background;
                    zX = dVarF.x(u58Var) | ((i1113 <= 67108864 && dVarF.x(g1VarA)) || (i4 & 100663296) == 67108864);
                    objR2 = dVarF.R();
                    if (zX) {
                        objR2 = new Function1() { // from class: com.google.android.k3b
                            public final Object invoke(Object obj) {
                                return l1.k(u58Var, g1VarA, (g1) obj);
                            }
                        };
                        dVarF.L(objR2);
                    } else {
                        objR2 = new Function1() { // from class: com.google.android.k3b
                            public final Object invoke(Object obj) {
                                return l1.k(u58Var, g1VarA, (g1) obj);
                            }
                        };
                        dVarF.L(objR2);
                    }
                    int i214 = i4 >> 12;
                    dVar2 = dVarF;
                    afc.c(WindowInsetsPaddingKt.c(bVar3, (Function1) objR2), null, j110, j5, 0.0f, 0.0f, null, ko1.e(848889571, true, new a(iA, function2B, ps4Var, function2D, function2A, u58Var, function2C), dVarF, 54), dVar2, (i214 & 896) | 12582912 | (i214 & 7168), 114);
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.n();
                    }
                    bVar2 = bVar3;
                    function10 = function2B;
                    function11 = function2C;
                    function12 = function2D;
                    function13 = function2A;
                    i14 = iA;
                    g1Var2 = g1VarA;
                    j3 = j110;
                    j4 = j5;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    bVar2 = bVar;
                    g1Var2 = g1Var;
                    function10 = function6;
                    function11 = function7;
                    function12 = function8;
                    function13 = function9;
                    i14 = i;
                    j3 = j;
                    j4 = j2;
                }
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.l3b
                        public final Object invoke(Object obj, Object obj2) {
                            return l1.l(bVar2, function10, function11, function12, function13, i14, j3, j4, g1Var2, ps4Var, i2, i3, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i4 |= 805306368;
            if ((i4 & 306783379) != 306783378) {
                z = true;
            } else {
                z = false;
            }
            if (dVarF.g(z, i4 & 1)) {
                dVarF.U();
                if ((i2 & 1) != 0) {
                    if (i17 != 0) {
                        bVar3 = androidx.compose.ui.b.INSTANCE;
                    } else {
                        bVar3 = bVar;
                    }
                    if (i18 != 0) {
                        function2B = hp1.a.b();
                    } else {
                        function2B = function6;
                    }
                    if (i5 != 0) {
                        function2C = hp1.a.c();
                    } else {
                        function2C = function7;
                    }
                    if (i7 != 0) {
                        function2D = hp1.a.d();
                    } else {
                        function2D = function8;
                    }
                    if (i9 != 0) {
                        function2A = hp1.a.a();
                    } else {
                        function2A = function9;
                    }
                    if (i11 != 0) {
                        iA = j0.INSTANCE.a();
                    } else {
                        iA = i;
                    }
                    if ((i3 & 64) != 0) {
                        i4 &= -3670017;
                        background = kh7.a.a(dVarF, 6).getBackground();
                    } else {
                        background = j;
                    }
                    if ((i3 & 128) != 0) {
                        jG = bj1.g(background, dVarF, (i4 >> 18) & 14);
                        i4 &= -29360129;
                    } else {
                        jG = j2;
                    }
                    if ((i3 & 256) != 0) {
                        g1VarA = j3b.a.a(dVarF, 6);
                        i4 &= -234881025;
                    } else {
                        g1VarA = g1Var;
                    }
                    j5 = jG;
                } else {
                    if (i17 != 0) {
                        bVar3 = androidx.compose.ui.b.INSTANCE;
                    } else {
                        bVar3 = bVar;
                    }
                    if (i18 != 0) {
                        function2B = hp1.a.b();
                    } else {
                        function2B = function6;
                    }
                    if (i5 != 0) {
                        function2C = hp1.a.c();
                    } else {
                        function2C = function7;
                    }
                    if (i7 != 0) {
                        function2D = hp1.a.d();
                    } else {
                        function2D = function8;
                    }
                    if (i9 != 0) {
                        function2A = hp1.a.a();
                    } else {
                        function2A = function9;
                    }
                    if (i11 != 0) {
                        iA = j0.INSTANCE.a();
                    } else {
                        iA = i;
                    }
                    if ((i3 & 64) != 0) {
                        i4 &= -3670017;
                        background = kh7.a.a(dVarF, 6).getBackground();
                    } else {
                        background = j;
                    }
                    if ((i3 & 128) != 0) {
                        jG = bj1.g(background, dVarF, (i4 >> 18) & 14);
                        i4 &= -29360129;
                    } else {
                        jG = j2;
                    }
                    if ((i3 & 256) != 0) {
                        g1VarA = j3b.a.a(dVarF, 6);
                        i4 &= -234881025;
                    } else {
                        g1VarA = g1Var;
                    }
                    j5 = jG;
                }
                dVarF.M();
                if (androidx.compose.p004runtime.e.k()) {
                    androidx.compose.p004runtime.e.o(-1211482744, i4, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:93)");
                }
                int i1114 = (234881024 & i4) ^ r19;
                if (i1114 <= 67108864) {
                }
                objR = dVarF.R();
                if (z2) {
                    objR = new u58(g1VarA);
                    dVarF.L(objR);
                } else {
                    objR = new u58(g1VarA);
                    dVarF.L(objR);
                }
                u58Var = (u58) objR;
                long j111 = background;
                zX = dVarF.x(u58Var) | ((i1114 <= 67108864 && dVarF.x(g1VarA)) || (i4 & 100663296) == 67108864);
                objR2 = dVarF.R();
                if (zX) {
                    objR2 = new Function1() { // from class: com.google.android.k3b
                        public final Object invoke(Object obj) {
                            return l1.k(u58Var, g1VarA, (g1) obj);
                        }
                    };
                    dVarF.L(objR2);
                } else {
                    objR2 = new Function1() { // from class: com.google.android.k3b
                        public final Object invoke(Object obj) {
                            return l1.k(u58Var, g1VarA, (g1) obj);
                        }
                    };
                    dVarF.L(objR2);
                }
                int i215 = i4 >> 12;
                dVar2 = dVarF;
                afc.c(WindowInsetsPaddingKt.c(bVar3, (Function1) objR2), null, j111, j5, 0.0f, 0.0f, null, ko1.e(848889571, true, new a(iA, function2B, ps4Var, function2D, function2A, u58Var, function2C), dVarF, 54), dVar2, (i215 & 896) | 12582912 | (i215 & 7168), 114);
                if (androidx.compose.p004runtime.e.k()) {
                    androidx.compose.p004runtime.e.n();
                }
                bVar2 = bVar3;
                function10 = function2B;
                function11 = function2C;
                function12 = function2D;
                function13 = function2A;
                i14 = iA;
                g1Var2 = g1VarA;
                j3 = j111;
                j4 = j5;
            } else {
                dVar2 = dVarF;
                dVar2.q();
                bVar2 = bVar;
                g1Var2 = g1Var;
                function10 = function6;
                function11 = function7;
                function12 = function8;
                function13 = function9;
                i14 = i;
                j3 = j;
                j4 = j2;
            }
            s6bVarH = dVar2.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.l3b
                    public final Object invoke(Object obj, Object obj2) {
                        return l1.l(bVar2, function10, function11, function12, function13, i14, j3, j4, g1Var2, ps4Var, i2, i3, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i4 |= 48;
        function6 = function2;
        i5 = i3 & 4;
        if (i5 != 0) {
            if ((i2 & 384) == 0) {
                function7 = function3;
                if (dVarF.T(function7)) {
                    i6 = 256;
                } else {
                    i6 = 128;
                }
                i4 |= i6;
            }
            i7 = i3 & 8;
            if (i7 != 0) {
                if ((i2 & 3072) == 0) {
                    function8 = function4;
                    if (dVarF.T(function8)) {
                        i8 = 2048;
                    } else {
                        i8 = 1024;
                    }
                    i4 |= i8;
                }
                i9 = i3 & 16;
                if (i9 != 0) {
                    if ((i2 & 24576) == 0) {
                        function9 = function5;
                        if (dVarF.T(function9)) {
                            i10 = 16384;
                        } else {
                            i10 = 8192;
                        }
                        i4 |= i10;
                    }
                    i11 = i3 & 32;
                    if (i11 != 0) {
                        i4 |= 196608;
                    } else if ((i2 & 196608) == 0) {
                        if (dVarF.C(i)) {
                            i12 = 131072;
                        } else {
                            i12 = 65536;
                        }
                        i4 |= i12;
                    }
                    if ((i2 & 1572864) != 0) {
                        if ((i3 & 64) == 0) {
                            i16 = 524288;
                        } else {
                            i16 = 524288;
                        }
                        i4 |= i16;
                    }
                    if ((i2 & 12582912) != 0) {
                        if ((i3 & 128) == 0) {
                            i15 = 4194304;
                        } else {
                            i15 = 4194304;
                        }
                        i4 |= i15;
                    }
                    if ((i2 & 100663296) != 0) {
                        i4 |= ((i3 & 256) == 0 || !dVarF.x(g1Var)) ? 33554432 : 67108864;
                    }
                    if ((i3 & 512) != 0) {
                        if ((i2 & 805306368) == 0) {
                            if (dVarF.T(ps4Var)) {
                                i13 = 536870912;
                            } else {
                                i13 = 268435456;
                            }
                            i4 |= i13;
                        }
                        if ((i4 & 306783379) != 306783378) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (dVarF.g(z, i4 & 1)) {
                            dVarF.U();
                            if ((i2 & 1) != 0) {
                                if (i17 != 0) {
                                    bVar3 = androidx.compose.ui.b.INSTANCE;
                                } else {
                                    bVar3 = bVar;
                                }
                                if (i18 != 0) {
                                    function2B = hp1.a.b();
                                } else {
                                    function2B = function6;
                                }
                                if (i5 != 0) {
                                    function2C = hp1.a.c();
                                } else {
                                    function2C = function7;
                                }
                                if (i7 != 0) {
                                    function2D = hp1.a.d();
                                } else {
                                    function2D = function8;
                                }
                                if (i9 != 0) {
                                    function2A = hp1.a.a();
                                } else {
                                    function2A = function9;
                                }
                                if (i11 != 0) {
                                    iA = j0.INSTANCE.a();
                                } else {
                                    iA = i;
                                }
                                if ((i3 & 64) != 0) {
                                    i4 &= -3670017;
                                    background = kh7.a.a(dVarF, 6).getBackground();
                                } else {
                                    background = j;
                                }
                                if ((i3 & 128) != 0) {
                                    jG = bj1.g(background, dVarF, (i4 >> 18) & 14);
                                    i4 &= -29360129;
                                } else {
                                    jG = j2;
                                }
                                if ((i3 & 256) != 0) {
                                    g1VarA = j3b.a.a(dVarF, 6);
                                    i4 &= -234881025;
                                } else {
                                    g1VarA = g1Var;
                                }
                                j5 = jG;
                            } else {
                                if (i17 != 0) {
                                    bVar3 = androidx.compose.ui.b.INSTANCE;
                                } else {
                                    bVar3 = bVar;
                                }
                                if (i18 != 0) {
                                    function2B = hp1.a.b();
                                } else {
                                    function2B = function6;
                                }
                                if (i5 != 0) {
                                    function2C = hp1.a.c();
                                } else {
                                    function2C = function7;
                                }
                                if (i7 != 0) {
                                    function2D = hp1.a.d();
                                } else {
                                    function2D = function8;
                                }
                                if (i9 != 0) {
                                    function2A = hp1.a.a();
                                } else {
                                    function2A = function9;
                                }
                                if (i11 != 0) {
                                    iA = j0.INSTANCE.a();
                                } else {
                                    iA = i;
                                }
                                if ((i3 & 64) != 0) {
                                    i4 &= -3670017;
                                    background = kh7.a.a(dVarF, 6).getBackground();
                                } else {
                                    background = j;
                                }
                                if ((i3 & 128) != 0) {
                                    jG = bj1.g(background, dVarF, (i4 >> 18) & 14);
                                    i4 &= -29360129;
                                } else {
                                    jG = j2;
                                }
                                if ((i3 & 256) != 0) {
                                    g1VarA = j3b.a.a(dVarF, 6);
                                    i4 &= -234881025;
                                } else {
                                    g1VarA = g1Var;
                                }
                                j5 = jG;
                            }
                            dVarF.M();
                            if (androidx.compose.p004runtime.e.k()) {
                                androidx.compose.p004runtime.e.o(-1211482744, i4, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:93)");
                            }
                            int i1115 = (234881024 & i4) ^ r19;
                            if (i1115 <= 67108864) {
                            }
                            objR = dVarF.R();
                            if (z2) {
                                objR = new u58(g1VarA);
                                dVarF.L(objR);
                            } else {
                                objR = new u58(g1VarA);
                                dVarF.L(objR);
                            }
                            u58Var = (u58) objR;
                            long j112 = background;
                            zX = dVarF.x(u58Var) | ((i1115 <= 67108864 && dVarF.x(g1VarA)) || (i4 & 100663296) == 67108864);
                            objR2 = dVarF.R();
                            if (zX) {
                                objR2 = new Function1() { // from class: com.google.android.k3b
                                    public final Object invoke(Object obj) {
                                        return l1.k(u58Var, g1VarA, (g1) obj);
                                    }
                                };
                                dVarF.L(objR2);
                            } else {
                                objR2 = new Function1() { // from class: com.google.android.k3b
                                    public final Object invoke(Object obj) {
                                        return l1.k(u58Var, g1VarA, (g1) obj);
                                    }
                                };
                                dVarF.L(objR2);
                            }
                            int i216 = i4 >> 12;
                            dVar2 = dVarF;
                            afc.c(WindowInsetsPaddingKt.c(bVar3, (Function1) objR2), null, j112, j5, 0.0f, 0.0f, null, ko1.e(848889571, true, new a(iA, function2B, ps4Var, function2D, function2A, u58Var, function2C), dVarF, 54), dVar2, (i216 & 896) | 12582912 | (i216 & 7168), 114);
                            if (androidx.compose.p004runtime.e.k()) {
                                androidx.compose.p004runtime.e.n();
                            }
                            bVar2 = bVar3;
                            function10 = function2B;
                            function11 = function2C;
                            function12 = function2D;
                            function13 = function2A;
                            i14 = iA;
                            g1Var2 = g1VarA;
                            j3 = j112;
                            j4 = j5;
                        } else {
                            dVar2 = dVarF;
                            dVar2.q();
                            bVar2 = bVar;
                            g1Var2 = g1Var;
                            function10 = function6;
                            function11 = function7;
                            function12 = function8;
                            function13 = function9;
                            i14 = i;
                            j3 = j;
                            j4 = j2;
                        }
                        s6bVarH = dVar2.H();
                        if (s6bVarH != null) {
                            s6bVarH.a(new Function2() { // from class: com.google.android.l3b
                                public final Object invoke(Object obj, Object obj2) {
                                    return l1.l(bVar2, function10, function11, function12, function13, i14, j3, j4, g1Var2, ps4Var, i2, i3, (d) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i4 |= 805306368;
                    if ((i4 & 306783379) != 306783378) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (dVarF.g(z, i4 & 1)) {
                        dVarF.U();
                        if ((i2 & 1) != 0) {
                            if (i17 != 0) {
                                bVar3 = androidx.compose.ui.b.INSTANCE;
                            } else {
                                bVar3 = bVar;
                            }
                            if (i18 != 0) {
                                function2B = hp1.a.b();
                            } else {
                                function2B = function6;
                            }
                            if (i5 != 0) {
                                function2C = hp1.a.c();
                            } else {
                                function2C = function7;
                            }
                            if (i7 != 0) {
                                function2D = hp1.a.d();
                            } else {
                                function2D = function8;
                            }
                            if (i9 != 0) {
                                function2A = hp1.a.a();
                            } else {
                                function2A = function9;
                            }
                            if (i11 != 0) {
                                iA = j0.INSTANCE.a();
                            } else {
                                iA = i;
                            }
                            if ((i3 & 64) != 0) {
                                i4 &= -3670017;
                                background = kh7.a.a(dVarF, 6).getBackground();
                            } else {
                                background = j;
                            }
                            if ((i3 & 128) != 0) {
                                jG = bj1.g(background, dVarF, (i4 >> 18) & 14);
                                i4 &= -29360129;
                            } else {
                                jG = j2;
                            }
                            if ((i3 & 256) != 0) {
                                g1VarA = j3b.a.a(dVarF, 6);
                                i4 &= -234881025;
                            } else {
                                g1VarA = g1Var;
                            }
                            j5 = jG;
                        } else {
                            if (i17 != 0) {
                                bVar3 = androidx.compose.ui.b.INSTANCE;
                            } else {
                                bVar3 = bVar;
                            }
                            if (i18 != 0) {
                                function2B = hp1.a.b();
                            } else {
                                function2B = function6;
                            }
                            if (i5 != 0) {
                                function2C = hp1.a.c();
                            } else {
                                function2C = function7;
                            }
                            if (i7 != 0) {
                                function2D = hp1.a.d();
                            } else {
                                function2D = function8;
                            }
                            if (i9 != 0) {
                                function2A = hp1.a.a();
                            } else {
                                function2A = function9;
                            }
                            if (i11 != 0) {
                                iA = j0.INSTANCE.a();
                            } else {
                                iA = i;
                            }
                            if ((i3 & 64) != 0) {
                                i4 &= -3670017;
                                background = kh7.a.a(dVarF, 6).getBackground();
                            } else {
                                background = j;
                            }
                            if ((i3 & 128) != 0) {
                                jG = bj1.g(background, dVarF, (i4 >> 18) & 14);
                                i4 &= -29360129;
                            } else {
                                jG = j2;
                            }
                            if ((i3 & 256) != 0) {
                                g1VarA = j3b.a.a(dVarF, 6);
                                i4 &= -234881025;
                            } else {
                                g1VarA = g1Var;
                            }
                            j5 = jG;
                        }
                        dVarF.M();
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.o(-1211482744, i4, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:93)");
                        }
                        int i1116 = (234881024 & i4) ^ r19;
                        if (i1116 <= 67108864) {
                        }
                        objR = dVarF.R();
                        if (z2) {
                            objR = new u58(g1VarA);
                            dVarF.L(objR);
                        } else {
                            objR = new u58(g1VarA);
                            dVarF.L(objR);
                        }
                        u58Var = (u58) objR;
                        long j113 = background;
                        zX = dVarF.x(u58Var) | ((i1116 <= 67108864 && dVarF.x(g1VarA)) || (i4 & 100663296) == 67108864);
                        objR2 = dVarF.R();
                        if (zX) {
                            objR2 = new Function1() { // from class: com.google.android.k3b
                                public final Object invoke(Object obj) {
                                    return l1.k(u58Var, g1VarA, (g1) obj);
                                }
                            };
                            dVarF.L(objR2);
                        } else {
                            objR2 = new Function1() { // from class: com.google.android.k3b
                                public final Object invoke(Object obj) {
                                    return l1.k(u58Var, g1VarA, (g1) obj);
                                }
                            };
                            dVarF.L(objR2);
                        }
                        int i217 = i4 >> 12;
                        dVar2 = dVarF;
                        afc.c(WindowInsetsPaddingKt.c(bVar3, (Function1) objR2), null, j113, j5, 0.0f, 0.0f, null, ko1.e(848889571, true, new a(iA, function2B, ps4Var, function2D, function2A, u58Var, function2C), dVarF, 54), dVar2, (i217 & 896) | 12582912 | (i217 & 7168), 114);
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.n();
                        }
                        bVar2 = bVar3;
                        function10 = function2B;
                        function11 = function2C;
                        function12 = function2D;
                        function13 = function2A;
                        i14 = iA;
                        g1Var2 = g1VarA;
                        j3 = j113;
                        j4 = j5;
                    } else {
                        dVar2 = dVarF;
                        dVar2.q();
                        bVar2 = bVar;
                        g1Var2 = g1Var;
                        function10 = function6;
                        function11 = function7;
                        function12 = function8;
                        function13 = function9;
                        i14 = i;
                        j3 = j;
                        j4 = j2;
                    }
                    s6bVarH = dVar2.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.l3b
                            public final Object invoke(Object obj, Object obj2) {
                                return l1.l(bVar2, function10, function11, function12, function13, i14, j3, j4, g1Var2, ps4Var, i2, i3, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i4 |= 24576;
                function9 = function5;
                i11 = i3 & 32;
                if (i11 != 0) {
                    i4 |= 196608;
                } else if ((i2 & 196608) == 0) {
                    if (dVarF.C(i)) {
                        i12 = 131072;
                    } else {
                        i12 = 65536;
                    }
                    i4 |= i12;
                }
                if ((i2 & 1572864) != 0) {
                    if ((i3 & 64) == 0) {
                        i16 = 524288;
                    } else {
                        i16 = 524288;
                    }
                    i4 |= i16;
                }
                if ((i2 & 12582912) != 0) {
                    if ((i3 & 128) == 0) {
                        i15 = 4194304;
                    } else {
                        i15 = 4194304;
                    }
                    i4 |= i15;
                }
                if ((i2 & 100663296) != 0) {
                    i4 |= ((i3 & 256) == 0 || !dVarF.x(g1Var)) ? 33554432 : 67108864;
                }
                if ((i3 & 512) != 0) {
                    if ((i2 & 805306368) == 0) {
                        if (dVarF.T(ps4Var)) {
                            i13 = 536870912;
                        } else {
                            i13 = 268435456;
                        }
                        i4 |= i13;
                    }
                    if ((i4 & 306783379) != 306783378) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (dVarF.g(z, i4 & 1)) {
                        dVarF.U();
                        if ((i2 & 1) != 0) {
                            if (i17 != 0) {
                                bVar3 = androidx.compose.ui.b.INSTANCE;
                            } else {
                                bVar3 = bVar;
                            }
                            if (i18 != 0) {
                                function2B = hp1.a.b();
                            } else {
                                function2B = function6;
                            }
                            if (i5 != 0) {
                                function2C = hp1.a.c();
                            } else {
                                function2C = function7;
                            }
                            if (i7 != 0) {
                                function2D = hp1.a.d();
                            } else {
                                function2D = function8;
                            }
                            if (i9 != 0) {
                                function2A = hp1.a.a();
                            } else {
                                function2A = function9;
                            }
                            if (i11 != 0) {
                                iA = j0.INSTANCE.a();
                            } else {
                                iA = i;
                            }
                            if ((i3 & 64) != 0) {
                                i4 &= -3670017;
                                background = kh7.a.a(dVarF, 6).getBackground();
                            } else {
                                background = j;
                            }
                            if ((i3 & 128) != 0) {
                                jG = bj1.g(background, dVarF, (i4 >> 18) & 14);
                                i4 &= -29360129;
                            } else {
                                jG = j2;
                            }
                            if ((i3 & 256) != 0) {
                                g1VarA = j3b.a.a(dVarF, 6);
                                i4 &= -234881025;
                            } else {
                                g1VarA = g1Var;
                            }
                            j5 = jG;
                        } else {
                            if (i17 != 0) {
                                bVar3 = androidx.compose.ui.b.INSTANCE;
                            } else {
                                bVar3 = bVar;
                            }
                            if (i18 != 0) {
                                function2B = hp1.a.b();
                            } else {
                                function2B = function6;
                            }
                            if (i5 != 0) {
                                function2C = hp1.a.c();
                            } else {
                                function2C = function7;
                            }
                            if (i7 != 0) {
                                function2D = hp1.a.d();
                            } else {
                                function2D = function8;
                            }
                            if (i9 != 0) {
                                function2A = hp1.a.a();
                            } else {
                                function2A = function9;
                            }
                            if (i11 != 0) {
                                iA = j0.INSTANCE.a();
                            } else {
                                iA = i;
                            }
                            if ((i3 & 64) != 0) {
                                i4 &= -3670017;
                                background = kh7.a.a(dVarF, 6).getBackground();
                            } else {
                                background = j;
                            }
                            if ((i3 & 128) != 0) {
                                jG = bj1.g(background, dVarF, (i4 >> 18) & 14);
                                i4 &= -29360129;
                            } else {
                                jG = j2;
                            }
                            if ((i3 & 256) != 0) {
                                g1VarA = j3b.a.a(dVarF, 6);
                                i4 &= -234881025;
                            } else {
                                g1VarA = g1Var;
                            }
                            j5 = jG;
                        }
                        dVarF.M();
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.o(-1211482744, i4, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:93)");
                        }
                        int i1117 = (234881024 & i4) ^ r19;
                        if (i1117 <= 67108864) {
                        }
                        objR = dVarF.R();
                        if (z2) {
                            objR = new u58(g1VarA);
                            dVarF.L(objR);
                        } else {
                            objR = new u58(g1VarA);
                            dVarF.L(objR);
                        }
                        u58Var = (u58) objR;
                        long j114 = background;
                        zX = dVarF.x(u58Var) | ((i1117 <= 67108864 && dVarF.x(g1VarA)) || (i4 & 100663296) == 67108864);
                        objR2 = dVarF.R();
                        if (zX) {
                            objR2 = new Function1() { // from class: com.google.android.k3b
                                public final Object invoke(Object obj) {
                                    return l1.k(u58Var, g1VarA, (g1) obj);
                                }
                            };
                            dVarF.L(objR2);
                        } else {
                            objR2 = new Function1() { // from class: com.google.android.k3b
                                public final Object invoke(Object obj) {
                                    return l1.k(u58Var, g1VarA, (g1) obj);
                                }
                            };
                            dVarF.L(objR2);
                        }
                        int i218 = i4 >> 12;
                        dVar2 = dVarF;
                        afc.c(WindowInsetsPaddingKt.c(bVar3, (Function1) objR2), null, j114, j5, 0.0f, 0.0f, null, ko1.e(848889571, true, new a(iA, function2B, ps4Var, function2D, function2A, u58Var, function2C), dVarF, 54), dVar2, (i218 & 896) | 12582912 | (i218 & 7168), 114);
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.n();
                        }
                        bVar2 = bVar3;
                        function10 = function2B;
                        function11 = function2C;
                        function12 = function2D;
                        function13 = function2A;
                        i14 = iA;
                        g1Var2 = g1VarA;
                        j3 = j114;
                        j4 = j5;
                    } else {
                        dVar2 = dVarF;
                        dVar2.q();
                        bVar2 = bVar;
                        g1Var2 = g1Var;
                        function10 = function6;
                        function11 = function7;
                        function12 = function8;
                        function13 = function9;
                        i14 = i;
                        j3 = j;
                        j4 = j2;
                    }
                    s6bVarH = dVar2.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.l3b
                            public final Object invoke(Object obj, Object obj2) {
                                return l1.l(bVar2, function10, function11, function12, function13, i14, j3, j4, g1Var2, ps4Var, i2, i3, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i4 |= 805306368;
                if ((i4 & 306783379) != 306783378) {
                    z = true;
                } else {
                    z = false;
                }
                if (dVarF.g(z, i4 & 1)) {
                    dVarF.U();
                    if ((i2 & 1) != 0) {
                        if (i17 != 0) {
                            bVar3 = androidx.compose.ui.b.INSTANCE;
                        } else {
                            bVar3 = bVar;
                        }
                        if (i18 != 0) {
                            function2B = hp1.a.b();
                        } else {
                            function2B = function6;
                        }
                        if (i5 != 0) {
                            function2C = hp1.a.c();
                        } else {
                            function2C = function7;
                        }
                        if (i7 != 0) {
                            function2D = hp1.a.d();
                        } else {
                            function2D = function8;
                        }
                        if (i9 != 0) {
                            function2A = hp1.a.a();
                        } else {
                            function2A = function9;
                        }
                        if (i11 != 0) {
                            iA = j0.INSTANCE.a();
                        } else {
                            iA = i;
                        }
                        if ((i3 & 64) != 0) {
                            i4 &= -3670017;
                            background = kh7.a.a(dVarF, 6).getBackground();
                        } else {
                            background = j;
                        }
                        if ((i3 & 128) != 0) {
                            jG = bj1.g(background, dVarF, (i4 >> 18) & 14);
                            i4 &= -29360129;
                        } else {
                            jG = j2;
                        }
                        if ((i3 & 256) != 0) {
                            g1VarA = j3b.a.a(dVarF, 6);
                            i4 &= -234881025;
                        } else {
                            g1VarA = g1Var;
                        }
                        j5 = jG;
                    } else {
                        if (i17 != 0) {
                            bVar3 = androidx.compose.ui.b.INSTANCE;
                        } else {
                            bVar3 = bVar;
                        }
                        if (i18 != 0) {
                            function2B = hp1.a.b();
                        } else {
                            function2B = function6;
                        }
                        if (i5 != 0) {
                            function2C = hp1.a.c();
                        } else {
                            function2C = function7;
                        }
                        if (i7 != 0) {
                            function2D = hp1.a.d();
                        } else {
                            function2D = function8;
                        }
                        if (i9 != 0) {
                            function2A = hp1.a.a();
                        } else {
                            function2A = function9;
                        }
                        if (i11 != 0) {
                            iA = j0.INSTANCE.a();
                        } else {
                            iA = i;
                        }
                        if ((i3 & 64) != 0) {
                            i4 &= -3670017;
                            background = kh7.a.a(dVarF, 6).getBackground();
                        } else {
                            background = j;
                        }
                        if ((i3 & 128) != 0) {
                            jG = bj1.g(background, dVarF, (i4 >> 18) & 14);
                            i4 &= -29360129;
                        } else {
                            jG = j2;
                        }
                        if ((i3 & 256) != 0) {
                            g1VarA = j3b.a.a(dVarF, 6);
                            i4 &= -234881025;
                        } else {
                            g1VarA = g1Var;
                        }
                        j5 = jG;
                    }
                    dVarF.M();
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.o(-1211482744, i4, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:93)");
                    }
                    int i1118 = (234881024 & i4) ^ r19;
                    if (i1118 <= 67108864) {
                    }
                    objR = dVarF.R();
                    if (z2) {
                        objR = new u58(g1VarA);
                        dVarF.L(objR);
                    } else {
                        objR = new u58(g1VarA);
                        dVarF.L(objR);
                    }
                    u58Var = (u58) objR;
                    long j115 = background;
                    zX = dVarF.x(u58Var) | ((i1118 <= 67108864 && dVarF.x(g1VarA)) || (i4 & 100663296) == 67108864);
                    objR2 = dVarF.R();
                    if (zX) {
                        objR2 = new Function1() { // from class: com.google.android.k3b
                            public final Object invoke(Object obj) {
                                return l1.k(u58Var, g1VarA, (g1) obj);
                            }
                        };
                        dVarF.L(objR2);
                    } else {
                        objR2 = new Function1() { // from class: com.google.android.k3b
                            public final Object invoke(Object obj) {
                                return l1.k(u58Var, g1VarA, (g1) obj);
                            }
                        };
                        dVarF.L(objR2);
                    }
                    int i219 = i4 >> 12;
                    dVar2 = dVarF;
                    afc.c(WindowInsetsPaddingKt.c(bVar3, (Function1) objR2), null, j115, j5, 0.0f, 0.0f, null, ko1.e(848889571, true, new a(iA, function2B, ps4Var, function2D, function2A, u58Var, function2C), dVarF, 54), dVar2, (i219 & 896) | 12582912 | (i219 & 7168), 114);
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.n();
                    }
                    bVar2 = bVar3;
                    function10 = function2B;
                    function11 = function2C;
                    function12 = function2D;
                    function13 = function2A;
                    i14 = iA;
                    g1Var2 = g1VarA;
                    j3 = j115;
                    j4 = j5;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    bVar2 = bVar;
                    g1Var2 = g1Var;
                    function10 = function6;
                    function11 = function7;
                    function12 = function8;
                    function13 = function9;
                    i14 = i;
                    j3 = j;
                    j4 = j2;
                }
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.l3b
                        public final Object invoke(Object obj, Object obj2) {
                            return l1.l(bVar2, function10, function11, function12, function13, i14, j3, j4, g1Var2, ps4Var, i2, i3, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i4 |= 3072;
            function8 = function4;
            i9 = i3 & 16;
            if (i9 != 0) {
                if ((i2 & 24576) == 0) {
                    function9 = function5;
                    if (dVarF.T(function9)) {
                        i10 = 16384;
                    } else {
                        i10 = 8192;
                    }
                    i4 |= i10;
                }
                i11 = i3 & 32;
                if (i11 != 0) {
                    i4 |= 196608;
                } else if ((i2 & 196608) == 0) {
                    if (dVarF.C(i)) {
                        i12 = 131072;
                    } else {
                        i12 = 65536;
                    }
                    i4 |= i12;
                }
                if ((i2 & 1572864) != 0) {
                    if ((i3 & 64) == 0) {
                        i16 = 524288;
                    } else {
                        i16 = 524288;
                    }
                    i4 |= i16;
                }
                if ((i2 & 12582912) != 0) {
                    if ((i3 & 128) == 0) {
                        i15 = 4194304;
                    } else {
                        i15 = 4194304;
                    }
                    i4 |= i15;
                }
                if ((i2 & 100663296) != 0) {
                    i4 |= ((i3 & 256) == 0 || !dVarF.x(g1Var)) ? 33554432 : 67108864;
                }
                if ((i3 & 512) != 0) {
                    if ((i2 & 805306368) == 0) {
                        if (dVarF.T(ps4Var)) {
                            i13 = 536870912;
                        } else {
                            i13 = 268435456;
                        }
                        i4 |= i13;
                    }
                    if ((i4 & 306783379) != 306783378) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (dVarF.g(z, i4 & 1)) {
                        dVarF.U();
                        if ((i2 & 1) != 0) {
                            if (i17 != 0) {
                                bVar3 = androidx.compose.ui.b.INSTANCE;
                            } else {
                                bVar3 = bVar;
                            }
                            if (i18 != 0) {
                                function2B = hp1.a.b();
                            } else {
                                function2B = function6;
                            }
                            if (i5 != 0) {
                                function2C = hp1.a.c();
                            } else {
                                function2C = function7;
                            }
                            if (i7 != 0) {
                                function2D = hp1.a.d();
                            } else {
                                function2D = function8;
                            }
                            if (i9 != 0) {
                                function2A = hp1.a.a();
                            } else {
                                function2A = function9;
                            }
                            if (i11 != 0) {
                                iA = j0.INSTANCE.a();
                            } else {
                                iA = i;
                            }
                            if ((i3 & 64) != 0) {
                                i4 &= -3670017;
                                background = kh7.a.a(dVarF, 6).getBackground();
                            } else {
                                background = j;
                            }
                            if ((i3 & 128) != 0) {
                                jG = bj1.g(background, dVarF, (i4 >> 18) & 14);
                                i4 &= -29360129;
                            } else {
                                jG = j2;
                            }
                            if ((i3 & 256) != 0) {
                                g1VarA = j3b.a.a(dVarF, 6);
                                i4 &= -234881025;
                            } else {
                                g1VarA = g1Var;
                            }
                            j5 = jG;
                        } else {
                            if (i17 != 0) {
                                bVar3 = androidx.compose.ui.b.INSTANCE;
                            } else {
                                bVar3 = bVar;
                            }
                            if (i18 != 0) {
                                function2B = hp1.a.b();
                            } else {
                                function2B = function6;
                            }
                            if (i5 != 0) {
                                function2C = hp1.a.c();
                            } else {
                                function2C = function7;
                            }
                            if (i7 != 0) {
                                function2D = hp1.a.d();
                            } else {
                                function2D = function8;
                            }
                            if (i9 != 0) {
                                function2A = hp1.a.a();
                            } else {
                                function2A = function9;
                            }
                            if (i11 != 0) {
                                iA = j0.INSTANCE.a();
                            } else {
                                iA = i;
                            }
                            if ((i3 & 64) != 0) {
                                i4 &= -3670017;
                                background = kh7.a.a(dVarF, 6).getBackground();
                            } else {
                                background = j;
                            }
                            if ((i3 & 128) != 0) {
                                jG = bj1.g(background, dVarF, (i4 >> 18) & 14);
                                i4 &= -29360129;
                            } else {
                                jG = j2;
                            }
                            if ((i3 & 256) != 0) {
                                g1VarA = j3b.a.a(dVarF, 6);
                                i4 &= -234881025;
                            } else {
                                g1VarA = g1Var;
                            }
                            j5 = jG;
                        }
                        dVarF.M();
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.o(-1211482744, i4, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:93)");
                        }
                        int i1119 = (234881024 & i4) ^ r19;
                        if (i1119 <= 67108864) {
                        }
                        objR = dVarF.R();
                        if (z2) {
                            objR = new u58(g1VarA);
                            dVarF.L(objR);
                        } else {
                            objR = new u58(g1VarA);
                            dVarF.L(objR);
                        }
                        u58Var = (u58) objR;
                        long j116 = background;
                        zX = dVarF.x(u58Var) | ((i1119 <= 67108864 && dVarF.x(g1VarA)) || (i4 & 100663296) == 67108864);
                        objR2 = dVarF.R();
                        if (zX) {
                            objR2 = new Function1() { // from class: com.google.android.k3b
                                public final Object invoke(Object obj) {
                                    return l1.k(u58Var, g1VarA, (g1) obj);
                                }
                            };
                            dVarF.L(objR2);
                        } else {
                            objR2 = new Function1() { // from class: com.google.android.k3b
                                public final Object invoke(Object obj) {
                                    return l1.k(u58Var, g1VarA, (g1) obj);
                                }
                            };
                            dVarF.L(objR2);
                        }
                        int i2110 = i4 >> 12;
                        dVar2 = dVarF;
                        afc.c(WindowInsetsPaddingKt.c(bVar3, (Function1) objR2), null, j116, j5, 0.0f, 0.0f, null, ko1.e(848889571, true, new a(iA, function2B, ps4Var, function2D, function2A, u58Var, function2C), dVarF, 54), dVar2, (i2110 & 896) | 12582912 | (i2110 & 7168), 114);
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.n();
                        }
                        bVar2 = bVar3;
                        function10 = function2B;
                        function11 = function2C;
                        function12 = function2D;
                        function13 = function2A;
                        i14 = iA;
                        g1Var2 = g1VarA;
                        j3 = j116;
                        j4 = j5;
                    } else {
                        dVar2 = dVarF;
                        dVar2.q();
                        bVar2 = bVar;
                        g1Var2 = g1Var;
                        function10 = function6;
                        function11 = function7;
                        function12 = function8;
                        function13 = function9;
                        i14 = i;
                        j3 = j;
                        j4 = j2;
                    }
                    s6bVarH = dVar2.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.l3b
                            public final Object invoke(Object obj, Object obj2) {
                                return l1.l(bVar2, function10, function11, function12, function13, i14, j3, j4, g1Var2, ps4Var, i2, i3, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i4 |= 805306368;
                if ((i4 & 306783379) != 306783378) {
                    z = true;
                } else {
                    z = false;
                }
                if (dVarF.g(z, i4 & 1)) {
                    dVarF.U();
                    if ((i2 & 1) != 0) {
                        if (i17 != 0) {
                            bVar3 = androidx.compose.ui.b.INSTANCE;
                        } else {
                            bVar3 = bVar;
                        }
                        if (i18 != 0) {
                            function2B = hp1.a.b();
                        } else {
                            function2B = function6;
                        }
                        if (i5 != 0) {
                            function2C = hp1.a.c();
                        } else {
                            function2C = function7;
                        }
                        if (i7 != 0) {
                            function2D = hp1.a.d();
                        } else {
                            function2D = function8;
                        }
                        if (i9 != 0) {
                            function2A = hp1.a.a();
                        } else {
                            function2A = function9;
                        }
                        if (i11 != 0) {
                            iA = j0.INSTANCE.a();
                        } else {
                            iA = i;
                        }
                        if ((i3 & 64) != 0) {
                            i4 &= -3670017;
                            background = kh7.a.a(dVarF, 6).getBackground();
                        } else {
                            background = j;
                        }
                        if ((i3 & 128) != 0) {
                            jG = bj1.g(background, dVarF, (i4 >> 18) & 14);
                            i4 &= -29360129;
                        } else {
                            jG = j2;
                        }
                        if ((i3 & 256) != 0) {
                            g1VarA = j3b.a.a(dVarF, 6);
                            i4 &= -234881025;
                        } else {
                            g1VarA = g1Var;
                        }
                        j5 = jG;
                    } else {
                        if (i17 != 0) {
                            bVar3 = androidx.compose.ui.b.INSTANCE;
                        } else {
                            bVar3 = bVar;
                        }
                        if (i18 != 0) {
                            function2B = hp1.a.b();
                        } else {
                            function2B = function6;
                        }
                        if (i5 != 0) {
                            function2C = hp1.a.c();
                        } else {
                            function2C = function7;
                        }
                        if (i7 != 0) {
                            function2D = hp1.a.d();
                        } else {
                            function2D = function8;
                        }
                        if (i9 != 0) {
                            function2A = hp1.a.a();
                        } else {
                            function2A = function9;
                        }
                        if (i11 != 0) {
                            iA = j0.INSTANCE.a();
                        } else {
                            iA = i;
                        }
                        if ((i3 & 64) != 0) {
                            i4 &= -3670017;
                            background = kh7.a.a(dVarF, 6).getBackground();
                        } else {
                            background = j;
                        }
                        if ((i3 & 128) != 0) {
                            jG = bj1.g(background, dVarF, (i4 >> 18) & 14);
                            i4 &= -29360129;
                        } else {
                            jG = j2;
                        }
                        if ((i3 & 256) != 0) {
                            g1VarA = j3b.a.a(dVarF, 6);
                            i4 &= -234881025;
                        } else {
                            g1VarA = g1Var;
                        }
                        j5 = jG;
                    }
                    dVarF.M();
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.o(-1211482744, i4, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:93)");
                    }
                    int i11110 = (234881024 & i4) ^ r19;
                    if (i11110 <= 67108864) {
                    }
                    objR = dVarF.R();
                    if (z2) {
                        objR = new u58(g1VarA);
                        dVarF.L(objR);
                    } else {
                        objR = new u58(g1VarA);
                        dVarF.L(objR);
                    }
                    u58Var = (u58) objR;
                    long j117 = background;
                    zX = dVarF.x(u58Var) | ((i11110 <= 67108864 && dVarF.x(g1VarA)) || (i4 & 100663296) == 67108864);
                    objR2 = dVarF.R();
                    if (zX) {
                        objR2 = new Function1() { // from class: com.google.android.k3b
                            public final Object invoke(Object obj) {
                                return l1.k(u58Var, g1VarA, (g1) obj);
                            }
                        };
                        dVarF.L(objR2);
                    } else {
                        objR2 = new Function1() { // from class: com.google.android.k3b
                            public final Object invoke(Object obj) {
                                return l1.k(u58Var, g1VarA, (g1) obj);
                            }
                        };
                        dVarF.L(objR2);
                    }
                    int i2111 = i4 >> 12;
                    dVar2 = dVarF;
                    afc.c(WindowInsetsPaddingKt.c(bVar3, (Function1) objR2), null, j117, j5, 0.0f, 0.0f, null, ko1.e(848889571, true, new a(iA, function2B, ps4Var, function2D, function2A, u58Var, function2C), dVarF, 54), dVar2, (i2111 & 896) | 12582912 | (i2111 & 7168), 114);
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.n();
                    }
                    bVar2 = bVar3;
                    function10 = function2B;
                    function11 = function2C;
                    function12 = function2D;
                    function13 = function2A;
                    i14 = iA;
                    g1Var2 = g1VarA;
                    j3 = j117;
                    j4 = j5;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    bVar2 = bVar;
                    g1Var2 = g1Var;
                    function10 = function6;
                    function11 = function7;
                    function12 = function8;
                    function13 = function9;
                    i14 = i;
                    j3 = j;
                    j4 = j2;
                }
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.l3b
                        public final Object invoke(Object obj, Object obj2) {
                            return l1.l(bVar2, function10, function11, function12, function13, i14, j3, j4, g1Var2, ps4Var, i2, i3, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i4 |= 24576;
            function9 = function5;
            i11 = i3 & 32;
            if (i11 != 0) {
                i4 |= 196608;
            } else if ((i2 & 196608) == 0) {
                if (dVarF.C(i)) {
                    i12 = 131072;
                } else {
                    i12 = 65536;
                }
                i4 |= i12;
            }
            if ((i2 & 1572864) != 0) {
                if ((i3 & 64) == 0) {
                    i16 = 524288;
                } else {
                    i16 = 524288;
                }
                i4 |= i16;
            }
            if ((i2 & 12582912) != 0) {
                if ((i3 & 128) == 0) {
                    i15 = 4194304;
                } else {
                    i15 = 4194304;
                }
                i4 |= i15;
            }
            if ((i2 & 100663296) != 0) {
                i4 |= ((i3 & 256) == 0 || !dVarF.x(g1Var)) ? 33554432 : 67108864;
            }
            if ((i3 & 512) != 0) {
                if ((i2 & 805306368) == 0) {
                    if (dVarF.T(ps4Var)) {
                        i13 = 536870912;
                    } else {
                        i13 = 268435456;
                    }
                    i4 |= i13;
                }
                if ((i4 & 306783379) != 306783378) {
                    z = true;
                } else {
                    z = false;
                }
                if (dVarF.g(z, i4 & 1)) {
                    dVarF.U();
                    if ((i2 & 1) != 0) {
                        if (i17 != 0) {
                            bVar3 = androidx.compose.ui.b.INSTANCE;
                        } else {
                            bVar3 = bVar;
                        }
                        if (i18 != 0) {
                            function2B = hp1.a.b();
                        } else {
                            function2B = function6;
                        }
                        if (i5 != 0) {
                            function2C = hp1.a.c();
                        } else {
                            function2C = function7;
                        }
                        if (i7 != 0) {
                            function2D = hp1.a.d();
                        } else {
                            function2D = function8;
                        }
                        if (i9 != 0) {
                            function2A = hp1.a.a();
                        } else {
                            function2A = function9;
                        }
                        if (i11 != 0) {
                            iA = j0.INSTANCE.a();
                        } else {
                            iA = i;
                        }
                        if ((i3 & 64) != 0) {
                            i4 &= -3670017;
                            background = kh7.a.a(dVarF, 6).getBackground();
                        } else {
                            background = j;
                        }
                        if ((i3 & 128) != 0) {
                            jG = bj1.g(background, dVarF, (i4 >> 18) & 14);
                            i4 &= -29360129;
                        } else {
                            jG = j2;
                        }
                        if ((i3 & 256) != 0) {
                            g1VarA = j3b.a.a(dVarF, 6);
                            i4 &= -234881025;
                        } else {
                            g1VarA = g1Var;
                        }
                        j5 = jG;
                    } else {
                        if (i17 != 0) {
                            bVar3 = androidx.compose.ui.b.INSTANCE;
                        } else {
                            bVar3 = bVar;
                        }
                        if (i18 != 0) {
                            function2B = hp1.a.b();
                        } else {
                            function2B = function6;
                        }
                        if (i5 != 0) {
                            function2C = hp1.a.c();
                        } else {
                            function2C = function7;
                        }
                        if (i7 != 0) {
                            function2D = hp1.a.d();
                        } else {
                            function2D = function8;
                        }
                        if (i9 != 0) {
                            function2A = hp1.a.a();
                        } else {
                            function2A = function9;
                        }
                        if (i11 != 0) {
                            iA = j0.INSTANCE.a();
                        } else {
                            iA = i;
                        }
                        if ((i3 & 64) != 0) {
                            i4 &= -3670017;
                            background = kh7.a.a(dVarF, 6).getBackground();
                        } else {
                            background = j;
                        }
                        if ((i3 & 128) != 0) {
                            jG = bj1.g(background, dVarF, (i4 >> 18) & 14);
                            i4 &= -29360129;
                        } else {
                            jG = j2;
                        }
                        if ((i3 & 256) != 0) {
                            g1VarA = j3b.a.a(dVarF, 6);
                            i4 &= -234881025;
                        } else {
                            g1VarA = g1Var;
                        }
                        j5 = jG;
                    }
                    dVarF.M();
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.o(-1211482744, i4, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:93)");
                    }
                    int i11111 = (234881024 & i4) ^ r19;
                    if (i11111 <= 67108864) {
                    }
                    objR = dVarF.R();
                    if (z2) {
                        objR = new u58(g1VarA);
                        dVarF.L(objR);
                    } else {
                        objR = new u58(g1VarA);
                        dVarF.L(objR);
                    }
                    u58Var = (u58) objR;
                    long j118 = background;
                    zX = dVarF.x(u58Var) | ((i11111 <= 67108864 && dVarF.x(g1VarA)) || (i4 & 100663296) == 67108864);
                    objR2 = dVarF.R();
                    if (zX) {
                        objR2 = new Function1() { // from class: com.google.android.k3b
                            public final Object invoke(Object obj) {
                                return l1.k(u58Var, g1VarA, (g1) obj);
                            }
                        };
                        dVarF.L(objR2);
                    } else {
                        objR2 = new Function1() { // from class: com.google.android.k3b
                            public final Object invoke(Object obj) {
                                return l1.k(u58Var, g1VarA, (g1) obj);
                            }
                        };
                        dVarF.L(objR2);
                    }
                    int i2112 = i4 >> 12;
                    dVar2 = dVarF;
                    afc.c(WindowInsetsPaddingKt.c(bVar3, (Function1) objR2), null, j118, j5, 0.0f, 0.0f, null, ko1.e(848889571, true, new a(iA, function2B, ps4Var, function2D, function2A, u58Var, function2C), dVarF, 54), dVar2, (i2112 & 896) | 12582912 | (i2112 & 7168), 114);
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.n();
                    }
                    bVar2 = bVar3;
                    function10 = function2B;
                    function11 = function2C;
                    function12 = function2D;
                    function13 = function2A;
                    i14 = iA;
                    g1Var2 = g1VarA;
                    j3 = j118;
                    j4 = j5;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    bVar2 = bVar;
                    g1Var2 = g1Var;
                    function10 = function6;
                    function11 = function7;
                    function12 = function8;
                    function13 = function9;
                    i14 = i;
                    j3 = j;
                    j4 = j2;
                }
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.l3b
                        public final Object invoke(Object obj, Object obj2) {
                            return l1.l(bVar2, function10, function11, function12, function13, i14, j3, j4, g1Var2, ps4Var, i2, i3, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i4 |= 805306368;
            if ((i4 & 306783379) != 306783378) {
                z = true;
            } else {
                z = false;
            }
            if (dVarF.g(z, i4 & 1)) {
                dVarF.U();
                if ((i2 & 1) != 0) {
                    if (i17 != 0) {
                        bVar3 = androidx.compose.ui.b.INSTANCE;
                    } else {
                        bVar3 = bVar;
                    }
                    if (i18 != 0) {
                        function2B = hp1.a.b();
                    } else {
                        function2B = function6;
                    }
                    if (i5 != 0) {
                        function2C = hp1.a.c();
                    } else {
                        function2C = function7;
                    }
                    if (i7 != 0) {
                        function2D = hp1.a.d();
                    } else {
                        function2D = function8;
                    }
                    if (i9 != 0) {
                        function2A = hp1.a.a();
                    } else {
                        function2A = function9;
                    }
                    if (i11 != 0) {
                        iA = j0.INSTANCE.a();
                    } else {
                        iA = i;
                    }
                    if ((i3 & 64) != 0) {
                        i4 &= -3670017;
                        background = kh7.a.a(dVarF, 6).getBackground();
                    } else {
                        background = j;
                    }
                    if ((i3 & 128) != 0) {
                        jG = bj1.g(background, dVarF, (i4 >> 18) & 14);
                        i4 &= -29360129;
                    } else {
                        jG = j2;
                    }
                    if ((i3 & 256) != 0) {
                        g1VarA = j3b.a.a(dVarF, 6);
                        i4 &= -234881025;
                    } else {
                        g1VarA = g1Var;
                    }
                    j5 = jG;
                } else {
                    if (i17 != 0) {
                        bVar3 = androidx.compose.ui.b.INSTANCE;
                    } else {
                        bVar3 = bVar;
                    }
                    if (i18 != 0) {
                        function2B = hp1.a.b();
                    } else {
                        function2B = function6;
                    }
                    if (i5 != 0) {
                        function2C = hp1.a.c();
                    } else {
                        function2C = function7;
                    }
                    if (i7 != 0) {
                        function2D = hp1.a.d();
                    } else {
                        function2D = function8;
                    }
                    if (i9 != 0) {
                        function2A = hp1.a.a();
                    } else {
                        function2A = function9;
                    }
                    if (i11 != 0) {
                        iA = j0.INSTANCE.a();
                    } else {
                        iA = i;
                    }
                    if ((i3 & 64) != 0) {
                        i4 &= -3670017;
                        background = kh7.a.a(dVarF, 6).getBackground();
                    } else {
                        background = j;
                    }
                    if ((i3 & 128) != 0) {
                        jG = bj1.g(background, dVarF, (i4 >> 18) & 14);
                        i4 &= -29360129;
                    } else {
                        jG = j2;
                    }
                    if ((i3 & 256) != 0) {
                        g1VarA = j3b.a.a(dVarF, 6);
                        i4 &= -234881025;
                    } else {
                        g1VarA = g1Var;
                    }
                    j5 = jG;
                }
                dVarF.M();
                if (androidx.compose.p004runtime.e.k()) {
                    androidx.compose.p004runtime.e.o(-1211482744, i4, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:93)");
                }
                int i11112 = (234881024 & i4) ^ r19;
                if (i11112 <= 67108864) {
                }
                objR = dVarF.R();
                if (z2) {
                    objR = new u58(g1VarA);
                    dVarF.L(objR);
                } else {
                    objR = new u58(g1VarA);
                    dVarF.L(objR);
                }
                u58Var = (u58) objR;
                long j119 = background;
                zX = dVarF.x(u58Var) | ((i11112 <= 67108864 && dVarF.x(g1VarA)) || (i4 & 100663296) == 67108864);
                objR2 = dVarF.R();
                if (zX) {
                    objR2 = new Function1() { // from class: com.google.android.k3b
                        public final Object invoke(Object obj) {
                            return l1.k(u58Var, g1VarA, (g1) obj);
                        }
                    };
                    dVarF.L(objR2);
                } else {
                    objR2 = new Function1() { // from class: com.google.android.k3b
                        public final Object invoke(Object obj) {
                            return l1.k(u58Var, g1VarA, (g1) obj);
                        }
                    };
                    dVarF.L(objR2);
                }
                int i2113 = i4 >> 12;
                dVar2 = dVarF;
                afc.c(WindowInsetsPaddingKt.c(bVar3, (Function1) objR2), null, j119, j5, 0.0f, 0.0f, null, ko1.e(848889571, true, new a(iA, function2B, ps4Var, function2D, function2A, u58Var, function2C), dVarF, 54), dVar2, (i2113 & 896) | 12582912 | (i2113 & 7168), 114);
                if (androidx.compose.p004runtime.e.k()) {
                    androidx.compose.p004runtime.e.n();
                }
                bVar2 = bVar3;
                function10 = function2B;
                function11 = function2C;
                function12 = function2D;
                function13 = function2A;
                i14 = iA;
                g1Var2 = g1VarA;
                j3 = j119;
                j4 = j5;
            } else {
                dVar2 = dVarF;
                dVar2.q();
                bVar2 = bVar;
                g1Var2 = g1Var;
                function10 = function6;
                function11 = function7;
                function12 = function8;
                function13 = function9;
                i14 = i;
                j3 = j;
                j4 = j2;
            }
            s6bVarH = dVar2.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.l3b
                    public final Object invoke(Object obj, Object obj2) {
                        return l1.l(bVar2, function10, function11, function12, function13, i14, j3, j4, g1Var2, ps4Var, i2, i3, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i4 |= 384;
        function7 = function3;
        i7 = i3 & 8;
        if (i7 != 0) {
            if ((i2 & 3072) == 0) {
                function8 = function4;
                if (dVarF.T(function8)) {
                    i8 = 2048;
                } else {
                    i8 = 1024;
                }
                i4 |= i8;
            }
            i9 = i3 & 16;
            if (i9 != 0) {
                if ((i2 & 24576) == 0) {
                    function9 = function5;
                    if (dVarF.T(function9)) {
                        i10 = 16384;
                    } else {
                        i10 = 8192;
                    }
                    i4 |= i10;
                }
                i11 = i3 & 32;
                if (i11 != 0) {
                    i4 |= 196608;
                } else if ((i2 & 196608) == 0) {
                    if (dVarF.C(i)) {
                        i12 = 131072;
                    } else {
                        i12 = 65536;
                    }
                    i4 |= i12;
                }
                if ((i2 & 1572864) != 0) {
                    if ((i3 & 64) == 0) {
                        i16 = 524288;
                    } else {
                        i16 = 524288;
                    }
                    i4 |= i16;
                }
                if ((i2 & 12582912) != 0) {
                    if ((i3 & 128) == 0) {
                        i15 = 4194304;
                    } else {
                        i15 = 4194304;
                    }
                    i4 |= i15;
                }
                if ((i2 & 100663296) != 0) {
                    i4 |= ((i3 & 256) == 0 || !dVarF.x(g1Var)) ? 33554432 : 67108864;
                }
                if ((i3 & 512) != 0) {
                    if ((i2 & 805306368) == 0) {
                        if (dVarF.T(ps4Var)) {
                            i13 = 536870912;
                        } else {
                            i13 = 268435456;
                        }
                        i4 |= i13;
                    }
                    if ((i4 & 306783379) != 306783378) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (dVarF.g(z, i4 & 1)) {
                        dVarF.U();
                        if ((i2 & 1) != 0) {
                            if (i17 != 0) {
                                bVar3 = androidx.compose.ui.b.INSTANCE;
                            } else {
                                bVar3 = bVar;
                            }
                            if (i18 != 0) {
                                function2B = hp1.a.b();
                            } else {
                                function2B = function6;
                            }
                            if (i5 != 0) {
                                function2C = hp1.a.c();
                            } else {
                                function2C = function7;
                            }
                            if (i7 != 0) {
                                function2D = hp1.a.d();
                            } else {
                                function2D = function8;
                            }
                            if (i9 != 0) {
                                function2A = hp1.a.a();
                            } else {
                                function2A = function9;
                            }
                            if (i11 != 0) {
                                iA = j0.INSTANCE.a();
                            } else {
                                iA = i;
                            }
                            if ((i3 & 64) != 0) {
                                i4 &= -3670017;
                                background = kh7.a.a(dVarF, 6).getBackground();
                            } else {
                                background = j;
                            }
                            if ((i3 & 128) != 0) {
                                jG = bj1.g(background, dVarF, (i4 >> 18) & 14);
                                i4 &= -29360129;
                            } else {
                                jG = j2;
                            }
                            if ((i3 & 256) != 0) {
                                g1VarA = j3b.a.a(dVarF, 6);
                                i4 &= -234881025;
                            } else {
                                g1VarA = g1Var;
                            }
                            j5 = jG;
                        } else {
                            if (i17 != 0) {
                                bVar3 = androidx.compose.ui.b.INSTANCE;
                            } else {
                                bVar3 = bVar;
                            }
                            if (i18 != 0) {
                                function2B = hp1.a.b();
                            } else {
                                function2B = function6;
                            }
                            if (i5 != 0) {
                                function2C = hp1.a.c();
                            } else {
                                function2C = function7;
                            }
                            if (i7 != 0) {
                                function2D = hp1.a.d();
                            } else {
                                function2D = function8;
                            }
                            if (i9 != 0) {
                                function2A = hp1.a.a();
                            } else {
                                function2A = function9;
                            }
                            if (i11 != 0) {
                                iA = j0.INSTANCE.a();
                            } else {
                                iA = i;
                            }
                            if ((i3 & 64) != 0) {
                                i4 &= -3670017;
                                background = kh7.a.a(dVarF, 6).getBackground();
                            } else {
                                background = j;
                            }
                            if ((i3 & 128) != 0) {
                                jG = bj1.g(background, dVarF, (i4 >> 18) & 14);
                                i4 &= -29360129;
                            } else {
                                jG = j2;
                            }
                            if ((i3 & 256) != 0) {
                                g1VarA = j3b.a.a(dVarF, 6);
                                i4 &= -234881025;
                            } else {
                                g1VarA = g1Var;
                            }
                            j5 = jG;
                        }
                        dVarF.M();
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.o(-1211482744, i4, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:93)");
                        }
                        int i11113 = (234881024 & i4) ^ r19;
                        if (i11113 <= 67108864) {
                        }
                        objR = dVarF.R();
                        if (z2) {
                            objR = new u58(g1VarA);
                            dVarF.L(objR);
                        } else {
                            objR = new u58(g1VarA);
                            dVarF.L(objR);
                        }
                        u58Var = (u58) objR;
                        long j1110 = background;
                        zX = dVarF.x(u58Var) | ((i11113 <= 67108864 && dVarF.x(g1VarA)) || (i4 & 100663296) == 67108864);
                        objR2 = dVarF.R();
                        if (zX) {
                            objR2 = new Function1() { // from class: com.google.android.k3b
                                public final Object invoke(Object obj) {
                                    return l1.k(u58Var, g1VarA, (g1) obj);
                                }
                            };
                            dVarF.L(objR2);
                        } else {
                            objR2 = new Function1() { // from class: com.google.android.k3b
                                public final Object invoke(Object obj) {
                                    return l1.k(u58Var, g1VarA, (g1) obj);
                                }
                            };
                            dVarF.L(objR2);
                        }
                        int i2114 = i4 >> 12;
                        dVar2 = dVarF;
                        afc.c(WindowInsetsPaddingKt.c(bVar3, (Function1) objR2), null, j1110, j5, 0.0f, 0.0f, null, ko1.e(848889571, true, new a(iA, function2B, ps4Var, function2D, function2A, u58Var, function2C), dVarF, 54), dVar2, (i2114 & 896) | 12582912 | (i2114 & 7168), 114);
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.n();
                        }
                        bVar2 = bVar3;
                        function10 = function2B;
                        function11 = function2C;
                        function12 = function2D;
                        function13 = function2A;
                        i14 = iA;
                        g1Var2 = g1VarA;
                        j3 = j1110;
                        j4 = j5;
                    } else {
                        dVar2 = dVarF;
                        dVar2.q();
                        bVar2 = bVar;
                        g1Var2 = g1Var;
                        function10 = function6;
                        function11 = function7;
                        function12 = function8;
                        function13 = function9;
                        i14 = i;
                        j3 = j;
                        j4 = j2;
                    }
                    s6bVarH = dVar2.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.l3b
                            public final Object invoke(Object obj, Object obj2) {
                                return l1.l(bVar2, function10, function11, function12, function13, i14, j3, j4, g1Var2, ps4Var, i2, i3, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i4 |= 805306368;
                if ((i4 & 306783379) != 306783378) {
                    z = true;
                } else {
                    z = false;
                }
                if (dVarF.g(z, i4 & 1)) {
                    dVarF.U();
                    if ((i2 & 1) != 0) {
                        if (i17 != 0) {
                            bVar3 = androidx.compose.ui.b.INSTANCE;
                        } else {
                            bVar3 = bVar;
                        }
                        if (i18 != 0) {
                            function2B = hp1.a.b();
                        } else {
                            function2B = function6;
                        }
                        if (i5 != 0) {
                            function2C = hp1.a.c();
                        } else {
                            function2C = function7;
                        }
                        if (i7 != 0) {
                            function2D = hp1.a.d();
                        } else {
                            function2D = function8;
                        }
                        if (i9 != 0) {
                            function2A = hp1.a.a();
                        } else {
                            function2A = function9;
                        }
                        if (i11 != 0) {
                            iA = j0.INSTANCE.a();
                        } else {
                            iA = i;
                        }
                        if ((i3 & 64) != 0) {
                            i4 &= -3670017;
                            background = kh7.a.a(dVarF, 6).getBackground();
                        } else {
                            background = j;
                        }
                        if ((i3 & 128) != 0) {
                            jG = bj1.g(background, dVarF, (i4 >> 18) & 14);
                            i4 &= -29360129;
                        } else {
                            jG = j2;
                        }
                        if ((i3 & 256) != 0) {
                            g1VarA = j3b.a.a(dVarF, 6);
                            i4 &= -234881025;
                        } else {
                            g1VarA = g1Var;
                        }
                        j5 = jG;
                    } else {
                        if (i17 != 0) {
                            bVar3 = androidx.compose.ui.b.INSTANCE;
                        } else {
                            bVar3 = bVar;
                        }
                        if (i18 != 0) {
                            function2B = hp1.a.b();
                        } else {
                            function2B = function6;
                        }
                        if (i5 != 0) {
                            function2C = hp1.a.c();
                        } else {
                            function2C = function7;
                        }
                        if (i7 != 0) {
                            function2D = hp1.a.d();
                        } else {
                            function2D = function8;
                        }
                        if (i9 != 0) {
                            function2A = hp1.a.a();
                        } else {
                            function2A = function9;
                        }
                        if (i11 != 0) {
                            iA = j0.INSTANCE.a();
                        } else {
                            iA = i;
                        }
                        if ((i3 & 64) != 0) {
                            i4 &= -3670017;
                            background = kh7.a.a(dVarF, 6).getBackground();
                        } else {
                            background = j;
                        }
                        if ((i3 & 128) != 0) {
                            jG = bj1.g(background, dVarF, (i4 >> 18) & 14);
                            i4 &= -29360129;
                        } else {
                            jG = j2;
                        }
                        if ((i3 & 256) != 0) {
                            g1VarA = j3b.a.a(dVarF, 6);
                            i4 &= -234881025;
                        } else {
                            g1VarA = g1Var;
                        }
                        j5 = jG;
                    }
                    dVarF.M();
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.o(-1211482744, i4, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:93)");
                    }
                    int i11114 = (234881024 & i4) ^ r19;
                    if (i11114 <= 67108864) {
                    }
                    objR = dVarF.R();
                    if (z2) {
                        objR = new u58(g1VarA);
                        dVarF.L(objR);
                    } else {
                        objR = new u58(g1VarA);
                        dVarF.L(objR);
                    }
                    u58Var = (u58) objR;
                    long j1111 = background;
                    zX = dVarF.x(u58Var) | ((i11114 <= 67108864 && dVarF.x(g1VarA)) || (i4 & 100663296) == 67108864);
                    objR2 = dVarF.R();
                    if (zX) {
                        objR2 = new Function1() { // from class: com.google.android.k3b
                            public final Object invoke(Object obj) {
                                return l1.k(u58Var, g1VarA, (g1) obj);
                            }
                        };
                        dVarF.L(objR2);
                    } else {
                        objR2 = new Function1() { // from class: com.google.android.k3b
                            public final Object invoke(Object obj) {
                                return l1.k(u58Var, g1VarA, (g1) obj);
                            }
                        };
                        dVarF.L(objR2);
                    }
                    int i2115 = i4 >> 12;
                    dVar2 = dVarF;
                    afc.c(WindowInsetsPaddingKt.c(bVar3, (Function1) objR2), null, j1111, j5, 0.0f, 0.0f, null, ko1.e(848889571, true, new a(iA, function2B, ps4Var, function2D, function2A, u58Var, function2C), dVarF, 54), dVar2, (i2115 & 896) | 12582912 | (i2115 & 7168), 114);
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.n();
                    }
                    bVar2 = bVar3;
                    function10 = function2B;
                    function11 = function2C;
                    function12 = function2D;
                    function13 = function2A;
                    i14 = iA;
                    g1Var2 = g1VarA;
                    j3 = j1111;
                    j4 = j5;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    bVar2 = bVar;
                    g1Var2 = g1Var;
                    function10 = function6;
                    function11 = function7;
                    function12 = function8;
                    function13 = function9;
                    i14 = i;
                    j3 = j;
                    j4 = j2;
                }
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.l3b
                        public final Object invoke(Object obj, Object obj2) {
                            return l1.l(bVar2, function10, function11, function12, function13, i14, j3, j4, g1Var2, ps4Var, i2, i3, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i4 |= 24576;
            function9 = function5;
            i11 = i3 & 32;
            if (i11 != 0) {
                i4 |= 196608;
            } else if ((i2 & 196608) == 0) {
                if (dVarF.C(i)) {
                    i12 = 131072;
                } else {
                    i12 = 65536;
                }
                i4 |= i12;
            }
            if ((i2 & 1572864) != 0) {
                if ((i3 & 64) == 0) {
                    i16 = 524288;
                } else {
                    i16 = 524288;
                }
                i4 |= i16;
            }
            if ((i2 & 12582912) != 0) {
                if ((i3 & 128) == 0) {
                    i15 = 4194304;
                } else {
                    i15 = 4194304;
                }
                i4 |= i15;
            }
            if ((i2 & 100663296) != 0) {
                i4 |= ((i3 & 256) == 0 || !dVarF.x(g1Var)) ? 33554432 : 67108864;
            }
            if ((i3 & 512) != 0) {
                if ((i2 & 805306368) == 0) {
                    if (dVarF.T(ps4Var)) {
                        i13 = 536870912;
                    } else {
                        i13 = 268435456;
                    }
                    i4 |= i13;
                }
                if ((i4 & 306783379) != 306783378) {
                    z = true;
                } else {
                    z = false;
                }
                if (dVarF.g(z, i4 & 1)) {
                    dVarF.U();
                    if ((i2 & 1) != 0) {
                        if (i17 != 0) {
                            bVar3 = androidx.compose.ui.b.INSTANCE;
                        } else {
                            bVar3 = bVar;
                        }
                        if (i18 != 0) {
                            function2B = hp1.a.b();
                        } else {
                            function2B = function6;
                        }
                        if (i5 != 0) {
                            function2C = hp1.a.c();
                        } else {
                            function2C = function7;
                        }
                        if (i7 != 0) {
                            function2D = hp1.a.d();
                        } else {
                            function2D = function8;
                        }
                        if (i9 != 0) {
                            function2A = hp1.a.a();
                        } else {
                            function2A = function9;
                        }
                        if (i11 != 0) {
                            iA = j0.INSTANCE.a();
                        } else {
                            iA = i;
                        }
                        if ((i3 & 64) != 0) {
                            i4 &= -3670017;
                            background = kh7.a.a(dVarF, 6).getBackground();
                        } else {
                            background = j;
                        }
                        if ((i3 & 128) != 0) {
                            jG = bj1.g(background, dVarF, (i4 >> 18) & 14);
                            i4 &= -29360129;
                        } else {
                            jG = j2;
                        }
                        if ((i3 & 256) != 0) {
                            g1VarA = j3b.a.a(dVarF, 6);
                            i4 &= -234881025;
                        } else {
                            g1VarA = g1Var;
                        }
                        j5 = jG;
                    } else {
                        if (i17 != 0) {
                            bVar3 = androidx.compose.ui.b.INSTANCE;
                        } else {
                            bVar3 = bVar;
                        }
                        if (i18 != 0) {
                            function2B = hp1.a.b();
                        } else {
                            function2B = function6;
                        }
                        if (i5 != 0) {
                            function2C = hp1.a.c();
                        } else {
                            function2C = function7;
                        }
                        if (i7 != 0) {
                            function2D = hp1.a.d();
                        } else {
                            function2D = function8;
                        }
                        if (i9 != 0) {
                            function2A = hp1.a.a();
                        } else {
                            function2A = function9;
                        }
                        if (i11 != 0) {
                            iA = j0.INSTANCE.a();
                        } else {
                            iA = i;
                        }
                        if ((i3 & 64) != 0) {
                            i4 &= -3670017;
                            background = kh7.a.a(dVarF, 6).getBackground();
                        } else {
                            background = j;
                        }
                        if ((i3 & 128) != 0) {
                            jG = bj1.g(background, dVarF, (i4 >> 18) & 14);
                            i4 &= -29360129;
                        } else {
                            jG = j2;
                        }
                        if ((i3 & 256) != 0) {
                            g1VarA = j3b.a.a(dVarF, 6);
                            i4 &= -234881025;
                        } else {
                            g1VarA = g1Var;
                        }
                        j5 = jG;
                    }
                    dVarF.M();
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.o(-1211482744, i4, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:93)");
                    }
                    int i11115 = (234881024 & i4) ^ r19;
                    if (i11115 <= 67108864) {
                    }
                    objR = dVarF.R();
                    if (z2) {
                        objR = new u58(g1VarA);
                        dVarF.L(objR);
                    } else {
                        objR = new u58(g1VarA);
                        dVarF.L(objR);
                    }
                    u58Var = (u58) objR;
                    long j1112 = background;
                    zX = dVarF.x(u58Var) | ((i11115 <= 67108864 && dVarF.x(g1VarA)) || (i4 & 100663296) == 67108864);
                    objR2 = dVarF.R();
                    if (zX) {
                        objR2 = new Function1() { // from class: com.google.android.k3b
                            public final Object invoke(Object obj) {
                                return l1.k(u58Var, g1VarA, (g1) obj);
                            }
                        };
                        dVarF.L(objR2);
                    } else {
                        objR2 = new Function1() { // from class: com.google.android.k3b
                            public final Object invoke(Object obj) {
                                return l1.k(u58Var, g1VarA, (g1) obj);
                            }
                        };
                        dVarF.L(objR2);
                    }
                    int i2116 = i4 >> 12;
                    dVar2 = dVarF;
                    afc.c(WindowInsetsPaddingKt.c(bVar3, (Function1) objR2), null, j1112, j5, 0.0f, 0.0f, null, ko1.e(848889571, true, new a(iA, function2B, ps4Var, function2D, function2A, u58Var, function2C), dVarF, 54), dVar2, (i2116 & 896) | 12582912 | (i2116 & 7168), 114);
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.n();
                    }
                    bVar2 = bVar3;
                    function10 = function2B;
                    function11 = function2C;
                    function12 = function2D;
                    function13 = function2A;
                    i14 = iA;
                    g1Var2 = g1VarA;
                    j3 = j1112;
                    j4 = j5;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    bVar2 = bVar;
                    g1Var2 = g1Var;
                    function10 = function6;
                    function11 = function7;
                    function12 = function8;
                    function13 = function9;
                    i14 = i;
                    j3 = j;
                    j4 = j2;
                }
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.l3b
                        public final Object invoke(Object obj, Object obj2) {
                            return l1.l(bVar2, function10, function11, function12, function13, i14, j3, j4, g1Var2, ps4Var, i2, i3, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i4 |= 805306368;
            if ((i4 & 306783379) != 306783378) {
                z = true;
            } else {
                z = false;
            }
            if (dVarF.g(z, i4 & 1)) {
                dVarF.U();
                if ((i2 & 1) != 0) {
                    if (i17 != 0) {
                        bVar3 = androidx.compose.ui.b.INSTANCE;
                    } else {
                        bVar3 = bVar;
                    }
                    if (i18 != 0) {
                        function2B = hp1.a.b();
                    } else {
                        function2B = function6;
                    }
                    if (i5 != 0) {
                        function2C = hp1.a.c();
                    } else {
                        function2C = function7;
                    }
                    if (i7 != 0) {
                        function2D = hp1.a.d();
                    } else {
                        function2D = function8;
                    }
                    if (i9 != 0) {
                        function2A = hp1.a.a();
                    } else {
                        function2A = function9;
                    }
                    if (i11 != 0) {
                        iA = j0.INSTANCE.a();
                    } else {
                        iA = i;
                    }
                    if ((i3 & 64) != 0) {
                        i4 &= -3670017;
                        background = kh7.a.a(dVarF, 6).getBackground();
                    } else {
                        background = j;
                    }
                    if ((i3 & 128) != 0) {
                        jG = bj1.g(background, dVarF, (i4 >> 18) & 14);
                        i4 &= -29360129;
                    } else {
                        jG = j2;
                    }
                    if ((i3 & 256) != 0) {
                        g1VarA = j3b.a.a(dVarF, 6);
                        i4 &= -234881025;
                    } else {
                        g1VarA = g1Var;
                    }
                    j5 = jG;
                } else {
                    if (i17 != 0) {
                        bVar3 = androidx.compose.ui.b.INSTANCE;
                    } else {
                        bVar3 = bVar;
                    }
                    if (i18 != 0) {
                        function2B = hp1.a.b();
                    } else {
                        function2B = function6;
                    }
                    if (i5 != 0) {
                        function2C = hp1.a.c();
                    } else {
                        function2C = function7;
                    }
                    if (i7 != 0) {
                        function2D = hp1.a.d();
                    } else {
                        function2D = function8;
                    }
                    if (i9 != 0) {
                        function2A = hp1.a.a();
                    } else {
                        function2A = function9;
                    }
                    if (i11 != 0) {
                        iA = j0.INSTANCE.a();
                    } else {
                        iA = i;
                    }
                    if ((i3 & 64) != 0) {
                        i4 &= -3670017;
                        background = kh7.a.a(dVarF, 6).getBackground();
                    } else {
                        background = j;
                    }
                    if ((i3 & 128) != 0) {
                        jG = bj1.g(background, dVarF, (i4 >> 18) & 14);
                        i4 &= -29360129;
                    } else {
                        jG = j2;
                    }
                    if ((i3 & 256) != 0) {
                        g1VarA = j3b.a.a(dVarF, 6);
                        i4 &= -234881025;
                    } else {
                        g1VarA = g1Var;
                    }
                    j5 = jG;
                }
                dVarF.M();
                if (androidx.compose.p004runtime.e.k()) {
                    androidx.compose.p004runtime.e.o(-1211482744, i4, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:93)");
                }
                int i11116 = (234881024 & i4) ^ r19;
                if (i11116 <= 67108864) {
                }
                objR = dVarF.R();
                if (z2) {
                    objR = new u58(g1VarA);
                    dVarF.L(objR);
                } else {
                    objR = new u58(g1VarA);
                    dVarF.L(objR);
                }
                u58Var = (u58) objR;
                long j1113 = background;
                zX = dVarF.x(u58Var) | ((i11116 <= 67108864 && dVarF.x(g1VarA)) || (i4 & 100663296) == 67108864);
                objR2 = dVarF.R();
                if (zX) {
                    objR2 = new Function1() { // from class: com.google.android.k3b
                        public final Object invoke(Object obj) {
                            return l1.k(u58Var, g1VarA, (g1) obj);
                        }
                    };
                    dVarF.L(objR2);
                } else {
                    objR2 = new Function1() { // from class: com.google.android.k3b
                        public final Object invoke(Object obj) {
                            return l1.k(u58Var, g1VarA, (g1) obj);
                        }
                    };
                    dVarF.L(objR2);
                }
                int i2117 = i4 >> 12;
                dVar2 = dVarF;
                afc.c(WindowInsetsPaddingKt.c(bVar3, (Function1) objR2), null, j1113, j5, 0.0f, 0.0f, null, ko1.e(848889571, true, new a(iA, function2B, ps4Var, function2D, function2A, u58Var, function2C), dVarF, 54), dVar2, (i2117 & 896) | 12582912 | (i2117 & 7168), 114);
                if (androidx.compose.p004runtime.e.k()) {
                    androidx.compose.p004runtime.e.n();
                }
                bVar2 = bVar3;
                function10 = function2B;
                function11 = function2C;
                function12 = function2D;
                function13 = function2A;
                i14 = iA;
                g1Var2 = g1VarA;
                j3 = j1113;
                j4 = j5;
            } else {
                dVar2 = dVarF;
                dVar2.q();
                bVar2 = bVar;
                g1Var2 = g1Var;
                function10 = function6;
                function11 = function7;
                function12 = function8;
                function13 = function9;
                i14 = i;
                j3 = j;
                j4 = j2;
            }
            s6bVarH = dVar2.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.l3b
                    public final Object invoke(Object obj, Object obj2) {
                        return l1.l(bVar2, function10, function11, function12, function13, i14, j3, j4, g1Var2, ps4Var, i2, i3, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i4 |= 3072;
        function8 = function4;
        i9 = i3 & 16;
        if (i9 != 0) {
            if ((i2 & 24576) == 0) {
                function9 = function5;
                if (dVarF.T(function9)) {
                    i10 = 16384;
                } else {
                    i10 = 8192;
                }
                i4 |= i10;
            }
            i11 = i3 & 32;
            if (i11 != 0) {
                i4 |= 196608;
            } else if ((i2 & 196608) == 0) {
                if (dVarF.C(i)) {
                    i12 = 131072;
                } else {
                    i12 = 65536;
                }
                i4 |= i12;
            }
            if ((i2 & 1572864) != 0) {
                if ((i3 & 64) == 0) {
                    i16 = 524288;
                } else {
                    i16 = 524288;
                }
                i4 |= i16;
            }
            if ((i2 & 12582912) != 0) {
                if ((i3 & 128) == 0) {
                    i15 = 4194304;
                } else {
                    i15 = 4194304;
                }
                i4 |= i15;
            }
            if ((i2 & 100663296) != 0) {
                i4 |= ((i3 & 256) == 0 || !dVarF.x(g1Var)) ? 33554432 : 67108864;
            }
            if ((i3 & 512) != 0) {
                if ((i2 & 805306368) == 0) {
                    if (dVarF.T(ps4Var)) {
                        i13 = 536870912;
                    } else {
                        i13 = 268435456;
                    }
                    i4 |= i13;
                }
                if ((i4 & 306783379) != 306783378) {
                    z = true;
                } else {
                    z = false;
                }
                if (dVarF.g(z, i4 & 1)) {
                    dVarF.U();
                    if ((i2 & 1) != 0) {
                        if (i17 != 0) {
                            bVar3 = androidx.compose.ui.b.INSTANCE;
                        } else {
                            bVar3 = bVar;
                        }
                        if (i18 != 0) {
                            function2B = hp1.a.b();
                        } else {
                            function2B = function6;
                        }
                        if (i5 != 0) {
                            function2C = hp1.a.c();
                        } else {
                            function2C = function7;
                        }
                        if (i7 != 0) {
                            function2D = hp1.a.d();
                        } else {
                            function2D = function8;
                        }
                        if (i9 != 0) {
                            function2A = hp1.a.a();
                        } else {
                            function2A = function9;
                        }
                        if (i11 != 0) {
                            iA = j0.INSTANCE.a();
                        } else {
                            iA = i;
                        }
                        if ((i3 & 64) != 0) {
                            i4 &= -3670017;
                            background = kh7.a.a(dVarF, 6).getBackground();
                        } else {
                            background = j;
                        }
                        if ((i3 & 128) != 0) {
                            jG = bj1.g(background, dVarF, (i4 >> 18) & 14);
                            i4 &= -29360129;
                        } else {
                            jG = j2;
                        }
                        if ((i3 & 256) != 0) {
                            g1VarA = j3b.a.a(dVarF, 6);
                            i4 &= -234881025;
                        } else {
                            g1VarA = g1Var;
                        }
                        j5 = jG;
                    } else {
                        if (i17 != 0) {
                            bVar3 = androidx.compose.ui.b.INSTANCE;
                        } else {
                            bVar3 = bVar;
                        }
                        if (i18 != 0) {
                            function2B = hp1.a.b();
                        } else {
                            function2B = function6;
                        }
                        if (i5 != 0) {
                            function2C = hp1.a.c();
                        } else {
                            function2C = function7;
                        }
                        if (i7 != 0) {
                            function2D = hp1.a.d();
                        } else {
                            function2D = function8;
                        }
                        if (i9 != 0) {
                            function2A = hp1.a.a();
                        } else {
                            function2A = function9;
                        }
                        if (i11 != 0) {
                            iA = j0.INSTANCE.a();
                        } else {
                            iA = i;
                        }
                        if ((i3 & 64) != 0) {
                            i4 &= -3670017;
                            background = kh7.a.a(dVarF, 6).getBackground();
                        } else {
                            background = j;
                        }
                        if ((i3 & 128) != 0) {
                            jG = bj1.g(background, dVarF, (i4 >> 18) & 14);
                            i4 &= -29360129;
                        } else {
                            jG = j2;
                        }
                        if ((i3 & 256) != 0) {
                            g1VarA = j3b.a.a(dVarF, 6);
                            i4 &= -234881025;
                        } else {
                            g1VarA = g1Var;
                        }
                        j5 = jG;
                    }
                    dVarF.M();
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.o(-1211482744, i4, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:93)");
                    }
                    int i11117 = (234881024 & i4) ^ r19;
                    if (i11117 <= 67108864) {
                    }
                    objR = dVarF.R();
                    if (z2) {
                        objR = new u58(g1VarA);
                        dVarF.L(objR);
                    } else {
                        objR = new u58(g1VarA);
                        dVarF.L(objR);
                    }
                    u58Var = (u58) objR;
                    long j1114 = background;
                    zX = dVarF.x(u58Var) | ((i11117 <= 67108864 && dVarF.x(g1VarA)) || (i4 & 100663296) == 67108864);
                    objR2 = dVarF.R();
                    if (zX) {
                        objR2 = new Function1() { // from class: com.google.android.k3b
                            public final Object invoke(Object obj) {
                                return l1.k(u58Var, g1VarA, (g1) obj);
                            }
                        };
                        dVarF.L(objR2);
                    } else {
                        objR2 = new Function1() { // from class: com.google.android.k3b
                            public final Object invoke(Object obj) {
                                return l1.k(u58Var, g1VarA, (g1) obj);
                            }
                        };
                        dVarF.L(objR2);
                    }
                    int i2118 = i4 >> 12;
                    dVar2 = dVarF;
                    afc.c(WindowInsetsPaddingKt.c(bVar3, (Function1) objR2), null, j1114, j5, 0.0f, 0.0f, null, ko1.e(848889571, true, new a(iA, function2B, ps4Var, function2D, function2A, u58Var, function2C), dVarF, 54), dVar2, (i2118 & 896) | 12582912 | (i2118 & 7168), 114);
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.n();
                    }
                    bVar2 = bVar3;
                    function10 = function2B;
                    function11 = function2C;
                    function12 = function2D;
                    function13 = function2A;
                    i14 = iA;
                    g1Var2 = g1VarA;
                    j3 = j1114;
                    j4 = j5;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    bVar2 = bVar;
                    g1Var2 = g1Var;
                    function10 = function6;
                    function11 = function7;
                    function12 = function8;
                    function13 = function9;
                    i14 = i;
                    j3 = j;
                    j4 = j2;
                }
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.l3b
                        public final Object invoke(Object obj, Object obj2) {
                            return l1.l(bVar2, function10, function11, function12, function13, i14, j3, j4, g1Var2, ps4Var, i2, i3, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i4 |= 805306368;
            if ((i4 & 306783379) != 306783378) {
                z = true;
            } else {
                z = false;
            }
            if (dVarF.g(z, i4 & 1)) {
                dVarF.U();
                if ((i2 & 1) != 0) {
                    if (i17 != 0) {
                        bVar3 = androidx.compose.ui.b.INSTANCE;
                    } else {
                        bVar3 = bVar;
                    }
                    if (i18 != 0) {
                        function2B = hp1.a.b();
                    } else {
                        function2B = function6;
                    }
                    if (i5 != 0) {
                        function2C = hp1.a.c();
                    } else {
                        function2C = function7;
                    }
                    if (i7 != 0) {
                        function2D = hp1.a.d();
                    } else {
                        function2D = function8;
                    }
                    if (i9 != 0) {
                        function2A = hp1.a.a();
                    } else {
                        function2A = function9;
                    }
                    if (i11 != 0) {
                        iA = j0.INSTANCE.a();
                    } else {
                        iA = i;
                    }
                    if ((i3 & 64) != 0) {
                        i4 &= -3670017;
                        background = kh7.a.a(dVarF, 6).getBackground();
                    } else {
                        background = j;
                    }
                    if ((i3 & 128) != 0) {
                        jG = bj1.g(background, dVarF, (i4 >> 18) & 14);
                        i4 &= -29360129;
                    } else {
                        jG = j2;
                    }
                    if ((i3 & 256) != 0) {
                        g1VarA = j3b.a.a(dVarF, 6);
                        i4 &= -234881025;
                    } else {
                        g1VarA = g1Var;
                    }
                    j5 = jG;
                } else {
                    if (i17 != 0) {
                        bVar3 = androidx.compose.ui.b.INSTANCE;
                    } else {
                        bVar3 = bVar;
                    }
                    if (i18 != 0) {
                        function2B = hp1.a.b();
                    } else {
                        function2B = function6;
                    }
                    if (i5 != 0) {
                        function2C = hp1.a.c();
                    } else {
                        function2C = function7;
                    }
                    if (i7 != 0) {
                        function2D = hp1.a.d();
                    } else {
                        function2D = function8;
                    }
                    if (i9 != 0) {
                        function2A = hp1.a.a();
                    } else {
                        function2A = function9;
                    }
                    if (i11 != 0) {
                        iA = j0.INSTANCE.a();
                    } else {
                        iA = i;
                    }
                    if ((i3 & 64) != 0) {
                        i4 &= -3670017;
                        background = kh7.a.a(dVarF, 6).getBackground();
                    } else {
                        background = j;
                    }
                    if ((i3 & 128) != 0) {
                        jG = bj1.g(background, dVarF, (i4 >> 18) & 14);
                        i4 &= -29360129;
                    } else {
                        jG = j2;
                    }
                    if ((i3 & 256) != 0) {
                        g1VarA = j3b.a.a(dVarF, 6);
                        i4 &= -234881025;
                    } else {
                        g1VarA = g1Var;
                    }
                    j5 = jG;
                }
                dVarF.M();
                if (androidx.compose.p004runtime.e.k()) {
                    androidx.compose.p004runtime.e.o(-1211482744, i4, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:93)");
                }
                int i11118 = (234881024 & i4) ^ r19;
                if (i11118 <= 67108864) {
                }
                objR = dVarF.R();
                if (z2) {
                    objR = new u58(g1VarA);
                    dVarF.L(objR);
                } else {
                    objR = new u58(g1VarA);
                    dVarF.L(objR);
                }
                u58Var = (u58) objR;
                long j1115 = background;
                zX = dVarF.x(u58Var) | ((i11118 <= 67108864 && dVarF.x(g1VarA)) || (i4 & 100663296) == 67108864);
                objR2 = dVarF.R();
                if (zX) {
                    objR2 = new Function1() { // from class: com.google.android.k3b
                        public final Object invoke(Object obj) {
                            return l1.k(u58Var, g1VarA, (g1) obj);
                        }
                    };
                    dVarF.L(objR2);
                } else {
                    objR2 = new Function1() { // from class: com.google.android.k3b
                        public final Object invoke(Object obj) {
                            return l1.k(u58Var, g1VarA, (g1) obj);
                        }
                    };
                    dVarF.L(objR2);
                }
                int i2119 = i4 >> 12;
                dVar2 = dVarF;
                afc.c(WindowInsetsPaddingKt.c(bVar3, (Function1) objR2), null, j1115, j5, 0.0f, 0.0f, null, ko1.e(848889571, true, new a(iA, function2B, ps4Var, function2D, function2A, u58Var, function2C), dVarF, 54), dVar2, (i2119 & 896) | 12582912 | (i2119 & 7168), 114);
                if (androidx.compose.p004runtime.e.k()) {
                    androidx.compose.p004runtime.e.n();
                }
                bVar2 = bVar3;
                function10 = function2B;
                function11 = function2C;
                function12 = function2D;
                function13 = function2A;
                i14 = iA;
                g1Var2 = g1VarA;
                j3 = j1115;
                j4 = j5;
            } else {
                dVar2 = dVarF;
                dVar2.q();
                bVar2 = bVar;
                g1Var2 = g1Var;
                function10 = function6;
                function11 = function7;
                function12 = function8;
                function13 = function9;
                i14 = i;
                j3 = j;
                j4 = j2;
            }
            s6bVarH = dVar2.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.l3b
                    public final Object invoke(Object obj, Object obj2) {
                        return l1.l(bVar2, function10, function11, function12, function13, i14, j3, j4, g1Var2, ps4Var, i2, i3, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i4 |= 24576;
        function9 = function5;
        i11 = i3 & 32;
        if (i11 != 0) {
            i4 |= 196608;
        } else if ((i2 & 196608) == 0) {
            if (dVarF.C(i)) {
                i12 = 131072;
            } else {
                i12 = 65536;
            }
            i4 |= i12;
        }
        if ((i2 & 1572864) != 0) {
            if ((i3 & 64) == 0) {
                i16 = 524288;
            } else {
                i16 = 524288;
            }
            i4 |= i16;
        }
        if ((i2 & 12582912) != 0) {
            if ((i3 & 128) == 0) {
                i15 = 4194304;
            } else {
                i15 = 4194304;
            }
            i4 |= i15;
        }
        if ((i2 & 100663296) != 0) {
            i4 |= ((i3 & 256) == 0 || !dVarF.x(g1Var)) ? 33554432 : 67108864;
        }
        if ((i3 & 512) != 0) {
            if ((i2 & 805306368) == 0) {
                if (dVarF.T(ps4Var)) {
                    i13 = 536870912;
                } else {
                    i13 = 268435456;
                }
                i4 |= i13;
            }
            if ((i4 & 306783379) != 306783378) {
                z = true;
            } else {
                z = false;
            }
            if (dVarF.g(z, i4 & 1)) {
                dVarF.U();
                if ((i2 & 1) != 0) {
                    if (i17 != 0) {
                        bVar3 = androidx.compose.ui.b.INSTANCE;
                    } else {
                        bVar3 = bVar;
                    }
                    if (i18 != 0) {
                        function2B = hp1.a.b();
                    } else {
                        function2B = function6;
                    }
                    if (i5 != 0) {
                        function2C = hp1.a.c();
                    } else {
                        function2C = function7;
                    }
                    if (i7 != 0) {
                        function2D = hp1.a.d();
                    } else {
                        function2D = function8;
                    }
                    if (i9 != 0) {
                        function2A = hp1.a.a();
                    } else {
                        function2A = function9;
                    }
                    if (i11 != 0) {
                        iA = j0.INSTANCE.a();
                    } else {
                        iA = i;
                    }
                    if ((i3 & 64) != 0) {
                        i4 &= -3670017;
                        background = kh7.a.a(dVarF, 6).getBackground();
                    } else {
                        background = j;
                    }
                    if ((i3 & 128) != 0) {
                        jG = bj1.g(background, dVarF, (i4 >> 18) & 14);
                        i4 &= -29360129;
                    } else {
                        jG = j2;
                    }
                    if ((i3 & 256) != 0) {
                        g1VarA = j3b.a.a(dVarF, 6);
                        i4 &= -234881025;
                    } else {
                        g1VarA = g1Var;
                    }
                    j5 = jG;
                } else {
                    if (i17 != 0) {
                        bVar3 = androidx.compose.ui.b.INSTANCE;
                    } else {
                        bVar3 = bVar;
                    }
                    if (i18 != 0) {
                        function2B = hp1.a.b();
                    } else {
                        function2B = function6;
                    }
                    if (i5 != 0) {
                        function2C = hp1.a.c();
                    } else {
                        function2C = function7;
                    }
                    if (i7 != 0) {
                        function2D = hp1.a.d();
                    } else {
                        function2D = function8;
                    }
                    if (i9 != 0) {
                        function2A = hp1.a.a();
                    } else {
                        function2A = function9;
                    }
                    if (i11 != 0) {
                        iA = j0.INSTANCE.a();
                    } else {
                        iA = i;
                    }
                    if ((i3 & 64) != 0) {
                        i4 &= -3670017;
                        background = kh7.a.a(dVarF, 6).getBackground();
                    } else {
                        background = j;
                    }
                    if ((i3 & 128) != 0) {
                        jG = bj1.g(background, dVarF, (i4 >> 18) & 14);
                        i4 &= -29360129;
                    } else {
                        jG = j2;
                    }
                    if ((i3 & 256) != 0) {
                        g1VarA = j3b.a.a(dVarF, 6);
                        i4 &= -234881025;
                    } else {
                        g1VarA = g1Var;
                    }
                    j5 = jG;
                }
                dVarF.M();
                if (androidx.compose.p004runtime.e.k()) {
                    androidx.compose.p004runtime.e.o(-1211482744, i4, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:93)");
                }
                int i11119 = (234881024 & i4) ^ r19;
                if (i11119 <= 67108864) {
                }
                objR = dVarF.R();
                if (z2) {
                    objR = new u58(g1VarA);
                    dVarF.L(objR);
                } else {
                    objR = new u58(g1VarA);
                    dVarF.L(objR);
                }
                u58Var = (u58) objR;
                long j1116 = background;
                zX = dVarF.x(u58Var) | ((i11119 <= 67108864 && dVarF.x(g1VarA)) || (i4 & 100663296) == 67108864);
                objR2 = dVarF.R();
                if (zX) {
                    objR2 = new Function1() { // from class: com.google.android.k3b
                        public final Object invoke(Object obj) {
                            return l1.k(u58Var, g1VarA, (g1) obj);
                        }
                    };
                    dVarF.L(objR2);
                } else {
                    objR2 = new Function1() { // from class: com.google.android.k3b
                        public final Object invoke(Object obj) {
                            return l1.k(u58Var, g1VarA, (g1) obj);
                        }
                    };
                    dVarF.L(objR2);
                }
                int i21110 = i4 >> 12;
                dVar2 = dVarF;
                afc.c(WindowInsetsPaddingKt.c(bVar3, (Function1) objR2), null, j1116, j5, 0.0f, 0.0f, null, ko1.e(848889571, true, new a(iA, function2B, ps4Var, function2D, function2A, u58Var, function2C), dVarF, 54), dVar2, (i21110 & 896) | 12582912 | (i21110 & 7168), 114);
                if (androidx.compose.p004runtime.e.k()) {
                    androidx.compose.p004runtime.e.n();
                }
                bVar2 = bVar3;
                function10 = function2B;
                function11 = function2C;
                function12 = function2D;
                function13 = function2A;
                i14 = iA;
                g1Var2 = g1VarA;
                j3 = j1116;
                j4 = j5;
            } else {
                dVar2 = dVarF;
                dVar2.q();
                bVar2 = bVar;
                g1Var2 = g1Var;
                function10 = function6;
                function11 = function7;
                function12 = function8;
                function13 = function9;
                i14 = i;
                j3 = j;
                j4 = j2;
            }
            s6bVarH = dVar2.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.l3b
                    public final Object invoke(Object obj, Object obj2) {
                        return l1.l(bVar2, function10, function11, function12, function13, i14, j3, j4, g1Var2, ps4Var, i2, i3, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i4 |= 805306368;
        if ((i4 & 306783379) != 306783378) {
            z = true;
        } else {
            z = false;
        }
        if (dVarF.g(z, i4 & 1)) {
            dVarF.U();
            if ((i2 & 1) != 0) {
                if (i17 != 0) {
                    bVar3 = androidx.compose.ui.b.INSTANCE;
                } else {
                    bVar3 = bVar;
                }
                if (i18 != 0) {
                    function2B = hp1.a.b();
                } else {
                    function2B = function6;
                }
                if (i5 != 0) {
                    function2C = hp1.a.c();
                } else {
                    function2C = function7;
                }
                if (i7 != 0) {
                    function2D = hp1.a.d();
                } else {
                    function2D = function8;
                }
                if (i9 != 0) {
                    function2A = hp1.a.a();
                } else {
                    function2A = function9;
                }
                if (i11 != 0) {
                    iA = j0.INSTANCE.a();
                } else {
                    iA = i;
                }
                if ((i3 & 64) != 0) {
                    i4 &= -3670017;
                    background = kh7.a.a(dVarF, 6).getBackground();
                } else {
                    background = j;
                }
                if ((i3 & 128) != 0) {
                    jG = bj1.g(background, dVarF, (i4 >> 18) & 14);
                    i4 &= -29360129;
                } else {
                    jG = j2;
                }
                if ((i3 & 256) != 0) {
                    g1VarA = j3b.a.a(dVarF, 6);
                    i4 &= -234881025;
                } else {
                    g1VarA = g1Var;
                }
                j5 = jG;
            } else {
                if (i17 != 0) {
                    bVar3 = androidx.compose.ui.b.INSTANCE;
                } else {
                    bVar3 = bVar;
                }
                if (i18 != 0) {
                    function2B = hp1.a.b();
                } else {
                    function2B = function6;
                }
                if (i5 != 0) {
                    function2C = hp1.a.c();
                } else {
                    function2C = function7;
                }
                if (i7 != 0) {
                    function2D = hp1.a.d();
                } else {
                    function2D = function8;
                }
                if (i9 != 0) {
                    function2A = hp1.a.a();
                } else {
                    function2A = function9;
                }
                if (i11 != 0) {
                    iA = j0.INSTANCE.a();
                } else {
                    iA = i;
                }
                if ((i3 & 64) != 0) {
                    i4 &= -3670017;
                    background = kh7.a.a(dVarF, 6).getBackground();
                } else {
                    background = j;
                }
                if ((i3 & 128) != 0) {
                    jG = bj1.g(background, dVarF, (i4 >> 18) & 14);
                    i4 &= -29360129;
                } else {
                    jG = j2;
                }
                if ((i3 & 256) != 0) {
                    g1VarA = j3b.a.a(dVarF, 6);
                    i4 &= -234881025;
                } else {
                    g1VarA = g1Var;
                }
                j5 = jG;
            }
            dVarF.M();
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.o(-1211482744, i4, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:93)");
            }
            int i111110 = (234881024 & i4) ^ r19;
            if (i111110 <= 67108864) {
            }
            objR = dVarF.R();
            if (z2) {
                objR = new u58(g1VarA);
                dVarF.L(objR);
            } else {
                objR = new u58(g1VarA);
                dVarF.L(objR);
            }
            u58Var = (u58) objR;
            long j1117 = background;
            zX = dVarF.x(u58Var) | ((i111110 <= 67108864 && dVarF.x(g1VarA)) || (i4 & 100663296) == 67108864);
            objR2 = dVarF.R();
            if (zX) {
                objR2 = new Function1() { // from class: com.google.android.k3b
                    public final Object invoke(Object obj) {
                        return l1.k(u58Var, g1VarA, (g1) obj);
                    }
                };
                dVarF.L(objR2);
            } else {
                objR2 = new Function1() { // from class: com.google.android.k3b
                    public final Object invoke(Object obj) {
                        return l1.k(u58Var, g1VarA, (g1) obj);
                    }
                };
                dVarF.L(objR2);
            }
            int i21111 = i4 >> 12;
            dVar2 = dVarF;
            afc.c(WindowInsetsPaddingKt.c(bVar3, (Function1) objR2), null, j1117, j5, 0.0f, 0.0f, null, ko1.e(848889571, true, new a(iA, function2B, ps4Var, function2D, function2A, u58Var, function2C), dVarF, 54), dVar2, (i21111 & 896) | 12582912 | (i21111 & 7168), 114);
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.n();
            }
            bVar2 = bVar3;
            function10 = function2B;
            function11 = function2C;
            function12 = function2D;
            function13 = function2A;
            i14 = iA;
            g1Var2 = g1VarA;
            j3 = j1117;
            j4 = j5;
        } else {
            dVar2 = dVarF;
            dVar2.q();
            bVar2 = bVar;
            g1Var2 = g1Var;
            function10 = function6;
            function11 = function7;
            function12 = function8;
            function13 = function9;
            i14 = i;
            j3 = j;
            j4 = j2;
        }
        s6bVarH = dVar2.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2() { // from class: com.google.android.l3b
                public final Object invoke(Object obj, Object obj2) {
                    return l1.l(bVar2, function10, function11, function12, function13, i14, j3, j4, g1Var2, ps4Var, i2, i3, (d) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(final int i, final Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> function2, final ps4<? super rx8, ? super androidx.compose.p004runtime.d, ? super Integer, Unit> ps4Var, final Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> function3, final Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> function4, final g1 g1Var, final Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> function5, androidx.compose.p004runtime.d dVar, final int i2) {
        int i3;
        int i4;
        int i5;
        androidx.compose.p004runtime.d dVarF = dVar.F(-280287501);
        if ((i2 & 6) == 0) {
            i3 = (dVarF.C(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= dVarF.T(function2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= dVarF.T(ps4Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= dVarF.T(function3) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= dVarF.T(function4) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= dVarF.x(g1Var) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i3 |= dVarF.T(function5) ? 1048576 : 524288;
        }
        if (dVarF.g((i3 & 599187) != 599186, i3 & 1)) {
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.o(-280287501, i3, -1, "androidx.compose.material3.ScaffoldLayout (Scaffold.kt:137)");
            }
            Object objR = dVarF.R();
            androidx.compose.p004runtime.d.Companion companion = androidx.compose.p004runtime.d.INSTANCE;
            if (objR == companion.a()) {
                objR = new d();
                dVarF.L(objR);
            }
            final d dVar2 = (d) objR;
            boolean z = (i3 & 112) == 32;
            Object objR2 = dVarF.R();
            if (z || objR2 == companion.a()) {
                objR2 = ko1.c(605195056, true, new g(function2));
                dVarF.L(objR2);
            }
            final Function2 function6 = (Function2) objR2;
            boolean z2 = (i3 & 7168) == 2048;
            Object objR3 = dVarF.R();
            if (z2 || objR3 == companion.a()) {
                objR3 = ko1.c(418899191, true, new f(function3));
                dVarF.L(objR3);
            }
            final Function2 function7 = (Function2) objR3;
            boolean z3 = (57344 & i3) == 16384;
            Object objR4 = dVarF.R();
            if (z3 || objR4 == companion.a()) {
                objR4 = ko1.c(338600263, true, new e(function4));
                dVarF.L(objR4);
            }
            final Function2 function8 = (Function2) objR4;
            boolean z4 = (i3 & 896) == 256;
            Object objR5 = dVarF.R();
            if (z4 || objR5 == companion.a()) {
                objR5 = ko1.c(-1776388365, true, new b(ps4Var, dVar2));
                dVarF.L(objR5);
            }
            final Function2 function9 = (Function2) objR5;
            boolean z5 = (3670016 & i3) == 1048576;
            Object objR6 = dVarF.R();
            if (z5 || objR6 == companion.a()) {
                objR6 = ko1.c(-1731662488, true, new c(function5));
                dVarF.L(objR6);
            }
            final Function2 function10 = (Function2) objR6;
            boolean zX = ((458752 & i3) == 131072) | dVarF.x(function6) | dVarF.x(function7) | dVarF.x(function8) | ((i3 & 14) == 4) | dVarF.x(function10) | dVarF.x(function9);
            Object objR7 = dVarF.R();
            if (zX || objR7 == companion.a()) {
                i4 = 1;
                i5 = 0;
                Function2 function11 = new Function2() { // from class: com.google.android.m3b
                    public final Object invoke(Object obj, Object obj2) {
                        return l1.h(g1Var, function6, function7, function8, i, function10, dVar2, function9, (scc) obj, (kx1) obj2);
                    }
                };
                dVarF.L(function11);
                objR7 = function11;
            } else {
                i5 = 0;
                i4 = 1;
            }
            SubcomposeLayoutKt.a(null, (Function2) objR7, dVarF, i5, i4);
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.n();
            }
        } else {
            dVarF.q();
        }
        s6b s6bVarH = dVarF.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2() { // from class: com.google.android.n3b
                public final Object invoke(Object obj, Object obj2) {
                    return l1.j(i, function2, ps4Var, function3, function4, g1Var, function5, i2, (d) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fj7 h(final g1 g1Var, Function2 function2, Function2 function3, Function2 function4, int i, Function2 function5, d dVar, Function2 function6, final scc sccVar, kx1 kx1Var) {
        int iO1;
        int iO2;
        int i2;
        b44 b44Var;
        Integer numValueOf;
        int iIntValue;
        int height;
        int iC;
        final int iL = kx1.l(kx1Var.getValue());
        final int iK = kx1.k(kx1Var.getValue());
        long jD = kx1.d(kx1Var.getValue(), 0, 0, 0, 0, 10, null);
        int iD = g1Var.d(sccVar, sccVar.getLayoutDirection());
        int iB = g1Var.b(sccVar, sccVar.getLayoutDirection());
        int iC2 = g1Var.c(sccVar);
        final o oVarR0 = ((dj7) m.z0(sccVar.q1(ScaffoldLayoutContent.TopBar, function2))).r0(jD);
        int i3 = (-iD) - iB;
        int i4 = -iC2;
        final o oVarR1 = ((dj7) m.z0(sccVar.q1(ScaffoldLayoutContent.Snackbar, function3))).r0(nx1.i(jD, i3, i4));
        final o oVarR2 = ((dj7) m.z0(sccVar.q1(ScaffoldLayoutContent.Fab, function4))).r0(nx1.i(jD, i3, i4));
        if (oVarR2.getWidth() == 0 && oVarR2.getHeight() == 0) {
            b44Var = null;
        } else {
            int width = oVarR2.getWidth();
            int height2 = oVarR2.getHeight();
            j0.Companion companion = j0.INSTANCE;
            if (j0.e(i, companion.c())) {
                if (sccVar.getLayoutDirection() == LayoutDirection.Ltr) {
                    iO1 = sccVar.O1(a);
                    i2 = iO1 + iD;
                } else {
                    iO2 = sccVar.O1(a);
                    i2 = ((iL - iO2) - width) - iB;
                }
            } else if (!j0.e(i, companion.a()) && !j0.e(i, companion.b())) {
                i2 = (((iL - width) + iD) - iB) / 2;
            } else if (sccVar.getLayoutDirection() == LayoutDirection.Ltr) {
                iO2 = sccVar.O1(a);
                i2 = ((iL - iO2) - width) - iB;
            } else {
                iO1 = sccVar.O1(a);
                i2 = iO1 + iD;
            }
            b44Var = new b44(i2, width, height2);
        }
        final o oVarR3 = ((dj7) m.z0(sccVar.q1(ScaffoldLayoutContent.BottomBar, function5))).r0(jD);
        int i5 = 0;
        boolean z = oVarR3.getWidth() == 0 && oVarR3.getHeight() == 0;
        if (b44Var != null) {
            if (z || j0.e(i, j0.INSTANCE.b())) {
                height = b44Var.getHeight() + sccVar.O1(a);
                iC = g1Var.c(sccVar);
            } else {
                height = oVarR3.getHeight() + b44Var.getHeight();
                iC = sccVar.O1(a);
            }
            numValueOf = Integer.valueOf(height + iC);
        } else {
            numValueOf = null;
        }
        int height3 = oVarR1.getHeight();
        if (height3 != 0) {
            if (numValueOf != null) {
                iIntValue = numValueOf.intValue();
            } else {
                Integer numValueOf2 = Integer.valueOf(oVarR3.getHeight());
                if (z) {
                    numValueOf2 = null;
                }
                iIntValue = numValueOf2 != null ? numValueOf2.intValue() : g1Var.c(sccVar);
            }
            i5 = iIntValue + height3;
        }
        rx8 rx8VarI = rje.i(g1Var, sccVar);
        final Integer num = numValueOf;
        final b44 b44Var2 = b44Var;
        dVar.f(nx8.h(nx8.k(rx8VarI, sccVar.getLayoutDirection()), (oVarR0.getWidth() == 0 && oVarR0.getHeight() == 0) ? rx8VarI.getTop() : sccVar.O0(oVarR0.getHeight()), nx8.j(rx8VarI, sccVar.getLayoutDirection()), z ? rx8VarI.getBottom() : sccVar.O0(oVarR3.getHeight())));
        final o oVarR4 = ((dj7) m.z0(sccVar.q1(ScaffoldLayoutContent.MainContent, function6))).r0(jD);
        final int i6 = i5;
        return androidx.compose.ui.layout.j.Q1(sccVar, iL, iK, null, new Function1() { // from class: com.google.android.o3b
            public final Object invoke(Object obj) {
                return l1.i(oVarR4, oVarR0, oVarR1, iL, g1Var, sccVar, iK, i6, oVarR3, b44Var2, oVarR2, num, (o.a) obj);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(o oVar, o oVar2, o oVar3, int i, g1 g1Var, scc sccVar, int i2, int i3, o oVar4, b44 b44Var, o oVar5, Integer num, o.a aVar) {
        o.a.z(aVar, oVar, 0, 0, 0.0f, 4, null);
        o.a.z(aVar, oVar2, 0, 0, 0.0f, 4, null);
        o.a.z(aVar, oVar3, (((i - oVar3.getWidth()) + g1Var.d(sccVar, sccVar.getLayoutDirection())) - g1Var.b(sccVar, sccVar.getLayoutDirection())) / 2, i2 - i3, 0.0f, 4, null);
        o.a.z(aVar, oVar4, 0, i2 - oVar4.getHeight(), 0.0f, 4, null);
        if (b44Var != null) {
            int left = b44Var.getLeft();
            Intrinsics.g(num);
            o.a.z(aVar, oVar5, left, i2 - num.intValue(), 0.0f, 4, null);
        }
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(int i, Function2 function2, ps4 ps4Var, Function2 function3, Function2 function4, g1 g1Var, Function2 function5, int i2, androidx.compose.p004runtime.d dVar, int i3) {
        g(i, function2, ps4Var, function3, function4, g1Var, function5, dVar, saa.a(i2 | 1));
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(u58 u58Var, g1 g1Var, g1 g1Var2) {
        u58Var.f(rje.j(g1Var, g1Var2));
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(androidx.compose.ui.b bVar, Function2 function2, Function2 function3, Function2 function4, Function2 function5, int i, long j, long j2, g1 g1Var, ps4 ps4Var, int i2, int i3, androidx.compose.p004runtime.d dVar, int i4) {
        f(bVar, function2, function3, function4, function5, i, j, j2, g1Var, ps4Var, dVar, saa.a(i2 | 1), i3);
        return Unit.a;
    }
}
