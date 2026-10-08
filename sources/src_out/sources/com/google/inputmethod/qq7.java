package com.google.inputmethod;

import androidx.compose.p000animation.core.Transition;
import androidx.compose.p000animation.core.TransitionKt;
import androidx.compose.p001foundation.ClickableKt;
import androidx.compose.p001foundation.layout.BoxScopeInstance;
import androidx.compose.p001foundation.layout.IntrinsicKt;
import androidx.compose.p001foundation.layout.IntrinsicSize;
import androidx.compose.p001foundation.layout.SizeKt;
import androidx.compose.p001foundation.layout.j;
import androidx.compose.p001foundation.layout.o;
import androidx.compose.p001foundation.layout.t0;
import androidx.compose.p002material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.graphics.l;
import androidx.compose.ui.graphics.m;
import androidx.compose.ui.graphics.t;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.InspectionModeKt;
import com.google.android.ps4;
import com.google.android.yg4;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0007\n\u0002\b\u0003\u001ay\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013H\u0001¢\u0006\u0004\b\u0017\u0010\u0018\u001au\u0010%\u001a\u00020\u00152\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00150\u00192\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00150\u00192\u0006\u0010\u0001\u001a\u00020\u00002\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00192\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00192\u0006\u0010\u001e\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!2\b\u0010$\u001a\u0004\u0018\u00010#H\u0001¢\u0006\u0004\b%\u0010&\u001a\u001f\u0010*\u001a\u00020\u00062\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020'H\u0000¢\u0006\u0004\b*\u0010+\"\u001a\u00100\u001a\u00020\u000e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0014\u00102\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010-\"\u0014\u00104\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010-\"\u001a\u00106\u001a\u00020\u000e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0017\u0010-\u001a\u0004\b5\u0010/\"\u0014\u00108\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u0010-\"\u0014\u0010:\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010-¨\u0006>²\u0006\f\u0010<\u001a\u00020;8\nX\u008a\u0084\u0002²\u0006\f\u0010=\u001a\u00020;8\nX\u008a\u0084\u0002"}, d2 = {"Landroidx/compose/ui/b;", "modifier", "Landroidx/compose/animation/core/e;", "", "expandedState", "Lcom/google/android/o58;", "Landroidx/compose/ui/graphics/t;", "transformOriginState", "Lcom/google/android/v9b;", "scrollState", "Lcom/google/android/xkb;", "shape", "Lcom/google/android/ei1;", "containerColor", "Lcom/google/android/ff3;", "tonalElevation", "shadowElevation", "Lcom/google/android/or0;", "border", "Lkotlin/Function1;", "Lcom/google/android/xj1;", "", "content", "d", "(Landroidx/compose/ui/b;Landroidx/compose/animation/core/e;Lcom/google/android/o58;Lcom/google/android/v9b;Lcom/google/android/xkb;JFFLcom/google/android/or0;Lcom/google/android/ps4;Landroidx/compose/runtime/d;I)V", "Lkotlin/Function0;", "text", "onClick", "leadingIcon", "trailingIcon", "enabled", "Lcom/google/android/jq7;", "colors", "Lcom/google/android/rx8;", "contentPadding", "Lcom/google/android/r48;", "interactionSource", "i", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/b;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLcom/google/android/jq7;Lcom/google/android/rx8;Lcom/google/android/r48;Landroidx/compose/runtime/d;I)V", "Lcom/google/android/k16;", "anchorBounds", "menuBounds", "l", "(Lcom/google/android/k16;Lcom/google/android/k16;)J", "a", "F", "n", "()F", "MenuVerticalMargin", "b", "MenuListItemContainerHeight", "c", "DropdownMenuItemHorizontalPadding", "m", "DropdownMenuVerticalPadding", "e", "DropdownMenuItemDefaultMinWidth", "f", "DropdownMenuItemDefaultMaxWidth", "", "scale", "alpha", "material3"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class qq7 {
    private static final float a;
    private static final float b;
    private static final float c = ff3.i(12);
    private static final float d = ff3.i(8);
    private static final float e = ff3.i(112);
    private static final float f = ff3.i(280);

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class a implements Function2<androidx.compose.p004runtime.d, Integer, Unit> {
        final /* synthetic */ androidx.compose.ui.b a;
        final /* synthetic */ v9b b;
        final /* synthetic */ ps4<xj1, androidx.compose.p004runtime.d, Integer, Unit> c;

        /* JADX WARN: Multi-variable type inference failed */
        a(androidx.compose.ui.b bVar, v9b v9bVar, ps4<? super xj1, ? super androidx.compose.p004runtime.d, ? super Integer, Unit> ps4Var) {
            this.a = bVar;
            this.b = v9bVar;
            this.c = ps4Var;
        }

        public final void a(androidx.compose.p004runtime.d dVar, int i) {
            if (!dVar.g((i & 3) != 2, i & 1)) {
                dVar.q();
                return;
            }
            if (e.k()) {
                e.o(-1463404422, i, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:406)");
            }
            androidx.compose.ui.b bVarI = h9b.i(IntrinsicKt.b(nx8.p(this.a, 0.0f, qq7.m(), 1, null), IntrinsicSize.Max), this.b, false, null, false, 14, null);
            ps4<xj1, androidx.compose.p004runtime.d, Integer, Unit> ps4Var = this.c;
            ej7 ej7VarA = o.a(androidx.compose.p001foundation.layout.c.a.k(), tc.INSTANCE.k(), dVar, 0);
            int iA = pp1.a(dVar, 0);
            gs1 gs1VarJ = dVar.j();
            androidx.compose.ui.b bVarE = ComposedModifierKt.e(dVar, bVarI);
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
            androidx.compose.p004runtime.d dVarC = dud.c(dVar);
            dud.i(dVarC, ej7VarA, companion.d());
            dud.i(dVarC, gs1VarJ, companion.f());
            Function2<ComposeUiNode, Integer, Unit> function2C = companion.c();
            if (dVarC.getInserting() || !Intrinsics.e(dVarC.R(), Integer.valueOf(iA))) {
                dVarC.L(Integer.valueOf(iA));
                dVarC.e(Integer.valueOf(iA), function2C);
            }
            dud.i(dVarC, bVarE, companion.e());
            ps4Var.invoke(yj1.a, dVar, 6);
            dVar.m();
            if (e.k()) {
                e.n();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((androidx.compose.p004runtime.d) obj, ((Number) obj2).intValue());
            return Unit.a;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class b implements ps4<Transition.b<Boolean>, androidx.compose.p004runtime.d, Integer, xa4<Float>> {
        final /* synthetic */ xa4<Float> a;

        b(xa4<Float> xa4Var) {
            this.a = xa4Var;
        }

        public final xa4<Float> a(Transition.b<Boolean> bVar, androidx.compose.p004runtime.d dVar, int i) {
            dVar.y(2839488);
            if (e.k()) {
                e.o(2839488, i, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:381)");
            }
            xa4<Float> xa4Var = this.a;
            if (e.k()) {
                e.n();
            }
            dVar.u();
            return xa4Var;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a((Transition.b) obj, (androidx.compose.p004runtime.d) obj2, ((Number) obj3).intValue());
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class c implements ps4<Transition.b<Boolean>, androidx.compose.p004runtime.d, Integer, xa4<Float>> {
        final /* synthetic */ xa4<Float> a;

        c(xa4<Float> xa4Var) {
            this.a = xa4Var;
        }

        public final xa4<Float> a(Transition.b<Boolean> bVar, androidx.compose.p004runtime.d dVar, int i) {
            dVar.y(-745957716);
            if (e.k()) {
                e.o(-745957716, i, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:376)");
            }
            xa4<Float> xa4Var = this.a;
            if (e.k()) {
                e.n();
            }
            dVar.u();
            return xa4Var;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a((Transition.b) obj, (androidx.compose.p004runtime.d) obj2, ((Number) obj3).intValue());
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class d implements Function2<androidx.compose.p004runtime.d, Integer, Unit> {
        final /* synthetic */ Function2<androidx.compose.p004runtime.d, Integer, Unit> a;
        final /* synthetic */ jq7 b;
        final /* synthetic */ boolean c;
        final /* synthetic */ Function2<androidx.compose.p004runtime.d, Integer, Unit> d;
        final /* synthetic */ hra e;
        final /* synthetic */ Function2<androidx.compose.p004runtime.d, Integer, Unit> f;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        static final class a implements Function2<androidx.compose.p004runtime.d, Integer, Unit> {
            final /* synthetic */ Function2<androidx.compose.p004runtime.d, Integer, Unit> a;

            /* JADX WARN: Multi-variable type inference failed */
            a(Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> function2) {
                this.a = function2;
            }

            public final void a(androidx.compose.p004runtime.d dVar, int i) {
                if (!dVar.g((i & 3) != 2, i & 1)) {
                    dVar.q();
                    return;
                }
                if (e.k()) {
                    e.o(1241781204, i, -1, "androidx.compose.material3.DropdownMenuItemContent.<anonymous>.<anonymous>.<anonymous> (Menu.kt:454)");
                }
                androidx.compose.ui.b bVarB = SizeKt.b(androidx.compose.ui.b.INSTANCE, l47.a.i(), 0.0f, 2, null);
                Function2<androidx.compose.p004runtime.d, Integer, Unit> function2 = this.a;
                ej7 ej7VarI = j.i(tc.INSTANCE.o(), false);
                int iA = pp1.a(dVar, 0);
                gs1 gs1VarJ = dVar.j();
                androidx.compose.ui.b bVarE = ComposedModifierKt.e(dVar, bVarB);
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
                androidx.compose.p004runtime.d dVarC = dud.c(dVar);
                dud.i(dVarC, ej7VarI, companion.d());
                dud.i(dVarC, gs1VarJ, companion.f());
                Function2<ComposeUiNode, Integer, Unit> function2C = companion.c();
                if (dVarC.getInserting() || !Intrinsics.e(dVarC.R(), Integer.valueOf(iA))) {
                    dVarC.L(Integer.valueOf(iA));
                    dVarC.e(Integer.valueOf(iA), function2C);
                }
                dud.i(dVarC, bVarE, companion.e());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.a;
                function2.invoke(dVar, 0);
                dVar.m();
                if (e.k()) {
                    e.n();
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                a((androidx.compose.p004runtime.d) obj, ((Number) obj2).intValue());
                return Unit.a;
            }
        }

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        static final class b implements Function2<androidx.compose.p004runtime.d, Integer, Unit> {
            final /* synthetic */ hra a;
            final /* synthetic */ Function2<androidx.compose.p004runtime.d, Integer, Unit> b;
            final /* synthetic */ Function2<androidx.compose.p004runtime.d, Integer, Unit> c;
            final /* synthetic */ Function2<androidx.compose.p004runtime.d, Integer, Unit> d;

            /* JADX WARN: Multi-variable type inference failed */
            b(hra hraVar, Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> function2, Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> function3, Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> function4) {
                this.a = hraVar;
                this.b = function2;
                this.c = function3;
                this.d = function4;
            }

            public final void a(androidx.compose.p004runtime.d dVar, int i) {
                if (!dVar.g((i & 3) != 2, i & 1)) {
                    dVar.q();
                    return;
                }
                if (e.k()) {
                    e.o(-893579015, i, -1, "androidx.compose.material3.DropdownMenuItemContent.<anonymous>.<anonymous>.<anonymous> (Menu.kt:460)");
                }
                androidx.compose.ui.b bVarR = nx8.r(hra.b(this.a, androidx.compose.ui.b.INSTANCE, 1.0f, false, 2, null), this.b != null ? qq7.c : ff3.i(0), 0.0f, this.c != null ? qq7.c : ff3.i(0), 0.0f, 10, null);
                Function2<androidx.compose.p004runtime.d, Integer, Unit> function2 = this.d;
                ej7 ej7VarI = j.i(tc.INSTANCE.o(), false);
                int iA = pp1.a(dVar, 0);
                gs1 gs1VarJ = dVar.j();
                androidx.compose.ui.b bVarE = ComposedModifierKt.e(dVar, bVarR);
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
                androidx.compose.p004runtime.d dVarC = dud.c(dVar);
                dud.i(dVarC, ej7VarI, companion.d());
                dud.i(dVarC, gs1VarJ, companion.f());
                Function2<ComposeUiNode, Integer, Unit> function2C = companion.c();
                if (dVarC.getInserting() || !Intrinsics.e(dVarC.R(), Integer.valueOf(iA))) {
                    dVarC.L(Integer.valueOf(iA));
                    dVarC.e(Integer.valueOf(iA), function2C);
                }
                dud.i(dVarC, bVarE, companion.e());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.a;
                function2.invoke(dVar, 0);
                dVar.m();
                if (e.k()) {
                    e.n();
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
                if (e.k()) {
                    e.o(-782441013, i, -1, "androidx.compose.material3.DropdownMenuItemContent.<anonymous>.<anonymous>.<anonymous> (Menu.kt:484)");
                }
                androidx.compose.ui.b bVarB = SizeKt.b(androidx.compose.ui.b.INSTANCE, l47.a.k(), 0.0f, 2, null);
                Function2<androidx.compose.p004runtime.d, Integer, Unit> function2 = this.a;
                ej7 ej7VarI = j.i(tc.INSTANCE.o(), false);
                int iA = pp1.a(dVar, 0);
                gs1 gs1VarJ = dVar.j();
                androidx.compose.ui.b bVarE = ComposedModifierKt.e(dVar, bVarB);
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
                androidx.compose.p004runtime.d dVarC = dud.c(dVar);
                dud.i(dVarC, ej7VarI, companion.d());
                dud.i(dVarC, gs1VarJ, companion.f());
                Function2<ComposeUiNode, Integer, Unit> function2C = companion.c();
                if (dVarC.getInserting() || !Intrinsics.e(dVarC.R(), Integer.valueOf(iA))) {
                    dVarC.L(Integer.valueOf(iA));
                    dVarC.e(Integer.valueOf(iA), function2C);
                }
                dud.i(dVarC, bVarE, companion.e());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.a;
                function2.invoke(dVar, 0);
                dVar.m();
                if (e.k()) {
                    e.n();
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                a((androidx.compose.p004runtime.d) obj, ((Number) obj2).intValue());
                return Unit.a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        d(Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> function2, jq7 jq7Var, boolean z, Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> function3, hra hraVar, Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> function4) {
            this.a = function2;
            this.b = jq7Var;
            this.c = z;
            this.d = function3;
            this.e = hraVar;
            this.f = function4;
        }

        public final void a(androidx.compose.p004runtime.d dVar, int i) {
            if (!dVar.g((i & 3) != 2, i & 1)) {
                dVar.q();
                return;
            }
            if (e.k()) {
                e.o(865999929, i, -1, "androidx.compose.material3.DropdownMenuItemContent.<anonymous>.<anonymous> (Menu.kt:450)");
            }
            if (this.a != null) {
                dVar.y(-864613220);
                fs1.c(cz1.a().d(ei1.l(this.b.a(this.c))), ko1.e(1241781204, true, new a(this.a), dVar, 54), dVar, os9.i | 48);
                dVar.u();
            } else {
                dVar.y(-864293207);
                dVar.u();
            }
            os9<ei1> os9VarD = cz1.a().d(ei1.l(this.b.b(this.c)));
            do1 do1VarE = ko1.e(-893579015, true, new b(this.e, this.a, this.d, this.f), dVar, 54);
            int i2 = os9.i;
            fs1.c(os9VarD, do1VarE, dVar, i2 | 48);
            if (this.d != null) {
                dVar.y(-863394951);
                fs1.c(cz1.a().d(ei1.l(this.b.c(this.c))), ko1.e(-782441013, true, new c(this.d), dVar, 54), dVar, i2 | 48);
                dVar.u();
            } else {
                dVar.y(-863072055);
                dVar.u();
            }
            if (e.k()) {
                e.n();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((androidx.compose.p004runtime.d) obj, ((Number) obj2).intValue());
            return Unit.a;
        }
    }

    static {
        float f2 = 48;
        a = ff3.i(f2);
        b = ff3.i(f2);
    }

    public static final void d(final androidx.compose.ui.b bVar, final androidx.compose.p000animation.core.e<Boolean> eVar, final o58<t> o58Var, final v9b v9bVar, final xkb xkbVar, final long j, final float f2, final float f3, final BorderStroke borderStroke, final ps4<? super xj1, ? super androidx.compose.p004runtime.d, ? super Integer, Unit> ps4Var, androidx.compose.p004runtime.d dVar, final int i) throws Throwable {
        int i2;
        androidx.compose.p004runtime.d dVar2;
        boolean z;
        Object obj;
        int i3;
        androidx.compose.p004runtime.d dVarF = dVar.F(848986741);
        if ((i & 6) == 0) {
            i2 = (dVarF.x(bVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? dVarF.x(eVar) : dVarF.T(eVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= dVarF.x(o58Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= dVarF.x(v9bVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= dVarF.x(xkbVar) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= dVarF.D(j) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i2 |= dVarF.B(f2) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i2 |= dVarF.B(f3) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i2 |= dVarF.x(borderStroke) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i2 |= dVarF.T(ps4Var) ? 536870912 : 268435456;
        }
        if (dVarF.g((i2 & 306783379) != 306783378, i2 & 1)) {
            if (e.k()) {
                e.o(848986741, i2, -1, "androidx.compose.material3.DropdownMenuContent (Menu.kt:369)");
            }
            Transition transitionX = TransitionKt.x(eVar, "DropDownMenu", dVarF, androidx.compose.p000animation.core.e.d | 48 | ((i2 >> 3) & 14), 0);
            xa4 xa4VarB = d08.b(MotionSchemeKeyTokens.FastSpatial, dVarF, 6);
            xa4 xa4VarB2 = d08.b(MotionSchemeKeyTokens.FastEffects, dVarF, 6);
            c cVar = new c(xa4VarB);
            yg4 yg4Var = yg4.a;
            tjd<Float, qr> tjdVarN = w2e.N(yg4Var);
            boolean zBooleanValue = ((Boolean) transitionX.p()).booleanValue();
            dVarF.y(143964305);
            if (e.k()) {
                e.o(143964305, 0, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:377)");
            }
            float f4 = zBooleanValue ? 1.0f : 0.8f;
            if (e.k()) {
                e.n();
            }
            dVarF.u();
            Float fValueOf = Float.valueOf(f4);
            boolean zBooleanValue2 = ((Boolean) transitionX.w()).booleanValue();
            dVarF.y(143964305);
            if (e.k()) {
                e.o(143964305, 0, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:377)");
            }
            float f5 = zBooleanValue2 ? 1.0f : 0.8f;
            if (e.k()) {
                e.n();
            }
            dVarF.u();
            final q6c q6cVarR = TransitionKt.r(transitionX, fValueOf, Float.valueOf(f5), (xa4) cVar.invoke(transitionX.u(), dVarF, 0), tjdVarN, "FloatAnimation", dVarF, 0);
            b bVar2 = new b(xa4VarB2);
            tjd<Float, qr> tjdVarN2 = w2e.N(yg4Var);
            boolean zBooleanValue3 = ((Boolean) transitionX.p()).booleanValue();
            dVarF.y(892761509);
            if (e.k()) {
                e.o(892761509, 0, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:382)");
            }
            float f6 = zBooleanValue3 ? 1.0f : 0.0f;
            if (e.k()) {
                e.n();
            }
            dVarF.u();
            Float fValueOf2 = Float.valueOf(f6);
            boolean zBooleanValue4 = ((Boolean) transitionX.w()).booleanValue();
            dVarF.y(892761509);
            if (e.k()) {
                z = false;
                e.o(892761509, 0, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:382)");
            } else {
                z = false;
            }
            float f7 = zBooleanValue4 ? 1.0f : 0.0f;
            if (e.k()) {
                e.n();
            }
            dVarF.u();
            boolean z2 = z;
            final q6c q6cVarR2 = TransitionKt.r(transitionX, fValueOf2, Float.valueOf(f7), (xa4) bVar2.invoke(transitionX.u(), dVarF, 0), tjdVarN2, "FloatAnimation", dVarF, 0);
            final boolean zBooleanValue5 = ((Boolean) dVarF.v(InspectionModeKt.a())).booleanValue();
            androidx.compose.ui.b.Companion companion = androidx.compose.ui.b.INSTANCE;
            boolean zA = dVarF.A(zBooleanValue5) | dVarF.x(q6cVarR) | (((i2 & 112) == 32 || ((i2 & 64) != 0 && dVarF.T(eVar))) ? true : z2) | dVarF.x(q6cVarR2);
            if ((i2 & 896) == 256) {
                z2 = true;
            }
            boolean z3 = zA | z2;
            Object objR = dVarF.R();
            if (z3 || objR == androidx.compose.p004runtime.d.INSTANCE.a()) {
                i3 = i2;
                obj = new Function1() { // from class: com.google.android.oq7
                    public final Object invoke(Object obj2) {
                        return qq7.g(zBooleanValue5, eVar, o58Var, q6cVarR, q6cVarR2, (m) obj2);
                    }
                };
                dVarF.L(obj);
            } else {
                obj = objR;
                i3 = i2;
            }
            int i4 = i3 >> 9;
            int i5 = i3 >> 6;
            afc.c(l.c(companion, (Function1) obj), xkbVar, j, 0L, f2, f3, borderStroke, ko1.e(-1463404422, true, new a(bVar, v9bVar, ps4Var), dVarF, 54), dVarF, (i4 & 896) | (i4 & 112) | 12582912 | (57344 & i5) | (458752 & i5) | (i5 & 3670016), 8);
            dVar2 = dVarF;
            if (e.k()) {
                e.n();
            }
        } else {
            dVar2 = dVarF;
            dVar2.q();
        }
        s6b s6bVarH = dVar2.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2() { // from class: com.google.android.pq7
                public final Object invoke(Object obj2, Object obj3) {
                    return qq7.h(bVar, eVar, o58Var, v9bVar, xkbVar, j, f2, f3, borderStroke, ps4Var, i, (d) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    private static final float e(q6c<Float> q6cVar) {
        return q6cVar.getValue().floatValue();
    }

    private static final float f(q6c<Float> q6cVar) {
        return q6cVar.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(boolean z, androidx.compose.p000animation.core.e eVar, o58 o58Var, q6c q6cVar, q6c q6cVar2, m mVar) {
        float fE;
        float fE2 = 0.8f;
        float f2 = 1.0f;
        if (z) {
            fE = ((Boolean) eVar.b()).booleanValue() ? 1.0f : 0.8f;
        } else {
            fE = e(q6cVar);
        }
        mVar.G(fE);
        if (!z) {
            fE2 = e(q6cVar);
        } else if (((Boolean) eVar.b()).booleanValue()) {
            fE2 = 1.0f;
        }
        mVar.M(fE2);
        if (!z) {
            f2 = f(q6cVar2);
        } else if (!((Boolean) eVar.b()).booleanValue()) {
            f2 = 0.0f;
        }
        mVar.c(f2);
        mVar.i0(((t) o58Var.getValue()).getPackedValue());
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(androidx.compose.ui.b bVar, androidx.compose.p000animation.core.e eVar, o58 o58Var, v9b v9bVar, xkb xkbVar, long j, float f2, float f3, BorderStroke borderStroke, ps4 ps4Var, int i, androidx.compose.p004runtime.d dVar, int i2) throws Throwable {
        d(bVar, eVar, o58Var, v9bVar, xkbVar, j, f2, f3, borderStroke, ps4Var, dVar, saa.a(i | 1));
        return Unit.a;
    }

    public static final void i(final Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> function2, final Function0<Unit> function0, final androidx.compose.ui.b bVar, final Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> function3, final Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> function4, final boolean z, final jq7 jq7Var, final rx8 rx8Var, final r48 r48Var, androidx.compose.p004runtime.d dVar, final int i) {
        Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> function5;
        int i2;
        Function0<Unit> function1;
        Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> function6;
        Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> function7;
        jq7 jq7Var2;
        r48 r48Var2;
        androidx.compose.p004runtime.d dVarF = dVar.F(-1325192924);
        if ((i & 6) == 0) {
            function5 = function2;
            i2 = (dVarF.T(function5) ? 4 : 2) | i;
        } else {
            function5 = function2;
            i2 = i;
        }
        if ((i & 48) == 0) {
            function1 = function0;
            i2 |= dVarF.T(function1) ? 32 : 16;
        } else {
            function1 = function0;
        }
        if ((i & 384) == 0) {
            i2 |= dVarF.x(bVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            function6 = function3;
            i2 |= dVarF.T(function6) ? 2048 : 1024;
        } else {
            function6 = function3;
        }
        if ((i & 24576) == 0) {
            function7 = function4;
            i2 |= dVarF.T(function7) ? 16384 : 8192;
        } else {
            function7 = function4;
        }
        if ((196608 & i) == 0) {
            i2 |= dVarF.A(z) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            jq7Var2 = jq7Var;
            i2 |= dVarF.x(jq7Var2) ? 1048576 : 524288;
        } else {
            jq7Var2 = jq7Var;
        }
        if ((12582912 & i) == 0) {
            i2 |= dVarF.x(rx8Var) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            r48Var2 = r48Var;
            i2 |= dVarF.x(r48Var2) ? 67108864 : 33554432;
        } else {
            r48Var2 = r48Var;
        }
        if (dVarF.g((38347923 & i2) != 38347922, i2 & 1)) {
            if (e.k()) {
                e.o(-1325192924, i2, -1, "androidx.compose.material3.DropdownMenuItemContent (Menu.kt:428)");
            }
            androidx.compose.ui.b bVarL = nx8.l(SizeKt.x(SizeKt.h(ClickableKt.m(bVar, r48Var2, xoa.e(true, 0.0f, 0L, 6, null), z, null, null, function1, 24, null), 0.0f, 1, null), e, b, f, 0.0f, 8, null), rx8Var);
            ej7 ej7VarB = t0.b(androidx.compose.p001foundation.layout.c.a.j(), tc.INSTANCE.i(), dVarF, 48);
            int iA = pp1.a(dVarF, 0);
            gs1 gs1VarJ = dVarF.j();
            androidx.compose.ui.b bVarE = ComposedModifierKt.e(dVarF, bVarL);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> function0B = companion.b();
            if (dVarF.G() == null) {
                pp1.d();
            }
            dVarF.o();
            if (dVarF.getInserting()) {
                dVarF.W(function0B);
            } else {
                dVarF.k();
            }
            androidx.compose.p004runtime.d dVarC = dud.c(dVarF);
            dud.i(dVarC, ej7VarB, companion.d());
            dud.i(dVarC, gs1VarJ, companion.f());
            Function2<ComposeUiNode, Integer, Unit> function2C = companion.c();
            if (dVarC.getInserting() || !Intrinsics.e(dVarC.R(), Integer.valueOf(iA))) {
                dVarC.L(Integer.valueOf(iA));
                dVarC.e(Integer.valueOf(iA), function2C);
            }
            dud.i(dVarC, bVarE, companion.e());
            jq7 jq7Var3 = jq7Var2;
            Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> function8 = function6;
            qxc.h(kh7.a.e(dVarF, 6).getLabelLarge(), ko1.e(865999929, true, new d(function8, jq7Var3, z, function7, ira.a, function5), dVarF, 54), dVarF, 48);
            dVarF.m();
            if (e.k()) {
                e.n();
            }
        } else {
            dVarF.q();
        }
        s6b s6bVarH = dVarF.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2() { // from class: com.google.android.nq7
                public final Object invoke(Object obj, Object obj2) {
                    return qq7.j(function2, function0, bVar, function3, function4, z, jq7Var, rx8Var, r48Var, i, (d) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(Function2 function2, Function0 function0, androidx.compose.ui.b bVar, Function2 function3, Function2 function4, boolean z, jq7 jq7Var, rx8 rx8Var, r48 r48Var, int i, androidx.compose.p004runtime.d dVar, int i2) {
        i(function2, function0, bVar, function3, function4, z, jq7Var, rx8Var, r48Var, dVar, saa.a(i | 1));
        return Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0053  */
    /* JADX WARN: Code duplicated, block: B:4:0x000d  */
    public static final long l(k16 k16Var, k16 k16Var2) {
        float fMax;
        float fMax2 = 1.0f;
        if (k16Var2.getLeft() >= k16Var.getRight()) {
            fMax = 0.0f;
        } else if (k16Var2.getRight() <= k16Var.getLeft()) {
            fMax = 1.0f;
        } else if (k16Var2.r() == 0) {
            fMax = 0.0f;
        } else {
            fMax = (((Math.max(k16Var.getLeft(), k16Var2.getLeft()) + Math.min(k16Var.getRight(), k16Var2.getRight())) / 2) - k16Var2.getLeft()) / k16Var2.r();
        }
        if (k16Var2.getTop() >= k16Var.getBottom()) {
            fMax2 = 0.0f;
        } else if (k16Var2.getBottom() > k16Var.getTop()) {
            if (k16Var2.j() == 0) {
                fMax2 = 0.0f;
            } else {
                fMax2 = (((Math.max(k16Var.getTop(), k16Var2.getTop()) + Math.min(k16Var.getBottom(), k16Var2.getBottom())) / 2) - k16Var2.getTop()) / k16Var2.j();
            }
        }
        return xdd.a(fMax, fMax2);
    }

    public static final float m() {
        return d;
    }

    public static final float n() {
        return a;
    }
}
