package androidx.compose.p002material3;

import androidx.compose.p000animation.core.Transition;
import androidx.compose.p000animation.core.TransitionKt;
import androidx.compose.p001foundation.MutatorMutex;
import androidx.compose.p001foundation.layout.BoxScopeInstance;
import androidx.compose.p001foundation.layout.SizeKt;
import androidx.compose.p001foundation.layout.j;
import androidx.compose.p002material3.TooltipKt;
import androidx.compose.p002material3.p003internal.BasicTooltipKt;
import androidx.compose.p002material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import androidx.compose.p004runtime.s0;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.graphics.l;
import androidx.compose.ui.graphics.r;
import androidx.compose.ui.graphics.t;
import androidx.compose.ui.layout.o;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.a0;
import com.google.android.ps4;
import com.google.android.yg4;
import com.google.inputmethod.aad;
import com.google.inputmethod.afc;
import com.google.inputmethod.bad;
import com.google.inputmethod.cad;
import com.google.inputmethod.cz1;
import com.google.inputmethod.d08;
import com.google.inputmethod.dud;
import com.google.inputmethod.ei1;
import com.google.inputmethod.ej7;
import com.google.inputmethod.f43;
import com.google.inputmethod.ff3;
import com.google.inputmethod.fs1;
import com.google.inputmethod.gba;
import com.google.inputmethod.gs1;
import com.google.inputmethod.ha9;
import com.google.inputmethod.jz5;
import com.google.inputmethod.kn6;
import com.google.inputmethod.ko1;
import com.google.inputmethod.l05;
import com.google.inputmethod.nx8;
import com.google.inputmethod.o58;
import com.google.inputmethod.os9;
import com.google.inputmethod.pp1;
import com.google.inputmethod.q6c;
import com.google.inputmethod.qr;
import com.google.inputmethod.qxc;
import com.google.inputmethod.rg9;
import com.google.inputmethod.ri0;
import com.google.inputmethod.rx8;
import com.google.inputmethod.s6b;
import com.google.inputmethod.saa;
import com.google.inputmethod.tc;
import com.google.inputmethod.tjd;
import com.google.inputmethod.w2e;
import com.google.inputmethod.xa4;
import com.google.inputmethod.xkb;
import com.google.inputmethod.xod;
import com.google.inputmethod.xq8;
import com.google.inputmethod.zh7;
import com.google.inputmethod.zn6;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0016\u001a{\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\nH\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001as\u0010\u001d\u001a\u00020\u0004*\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00132\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u00152\b\b\u0002\u0010\u001c\u001a\u00020\u00152\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\nH\u0007¢\u0006\u0004\b\u001d\u0010\u001e\u001a-\u0010#\u001a\u00020\u00062\b\b\u0002\u0010\u001f\u001a\u00020\f2\b\b\u0002\u0010 \u001a\u00020\f2\b\b\u0002\u0010\"\u001a\u00020!H\u0007¢\u0006\u0004\b#\u0010$\u001a!\u0010'\u001a\u00020\b*\u00020\b2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\f0%H\u0000¢\u0006\u0004\b'\u0010(\u001a'\u0010/\u001a\u00020)2\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+2\u0006\u0010.\u001a\u00020-H\u0000¢\u0006\u0004\b/\u00100\u001aO\u0010;\u001a\u00020\b*\u00020\b2\f\u00103\u001a\b\u0012\u0004\u0012\u000202012\u0006\u00105\u001a\u0002042\u0006\u00107\u001a\u0002062\u0014\u0010:\u001a\u0010\u0012\u0004\u0012\u000208\u0012\u0006\u0012\u0004\u0018\u0001090\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b;\u0010<\"\u001a\u0010A\u001a\u00020\u00158\u0000X\u0080\u0004¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u001a\u0010D\u001a\u00020\u00158\u0000X\u0080\u0004¢\u0006\f\n\u0004\bB\u0010>\u001a\u0004\bC\u0010@\"\u001a\u0010G\u001a\u00020\u00158\u0000X\u0080\u0004¢\u0006\f\n\u0004\bE\u0010>\u001a\u0004\bF\u0010@\"\u0014\u0010I\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010>\"\u0014\u0010K\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010>\"\u001a\u0010Q\u001a\u00020L8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010P\"\u001a\u0010S\u001a\u00020\u00158\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001d\u0010>\u001a\u0004\bR\u0010@\"\u001a\u0010V\u001a\u00020\u00158\u0000X\u0080\u0004¢\u0006\f\n\u0004\bT\u0010>\u001a\u0004\bU\u0010@\"\u0014\u0010X\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010>\"\u0014\u0010Y\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010>\"\u001a\u0010\\\u001a\u00020\u00158\u0000X\u0080\u0004¢\u0006\f\n\u0004\bZ\u0010>\u001a\u0004\b[\u0010@\"\u001a\u0010_\u001a\u00020\u00158\u0000X\u0080\u0004¢\u0006\f\n\u0004\b]\u0010>\u001a\u0004\b^\u0010@¨\u0006b²\u0006\f\u0010`\u001a\u00020)8\nX\u008a\u0084\u0002²\u0006\f\u0010a\u001a\u00020)8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/google/android/rg9;", "positionProvider", "Lkotlin/Function1;", "Lcom/google/android/aad;", "", "tooltip", "Lcom/google/android/cad;", "state", "Landroidx/compose/ui/b;", "modifier", "Lkotlin/Function0;", "onDismissRequest", "", "focusable", "enableUserInput", "hasAction", "content", "j", "(Lcom/google/android/rg9;Lcom/google/android/ps4;Lcom/google/android/cad;Landroidx/compose/ui/b;Lkotlin/jvm/functions/Function0;ZZZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/d;II)V", "Lcom/google/android/xkb;", "caretShape", "Lcom/google/android/ff3;", "maxWidth", "shape", "Lcom/google/android/ei1;", "contentColor", "containerColor", "tonalElevation", "shadowElevation", "g", "(Lcom/google/android/aad;Landroidx/compose/ui/b;Lcom/google/android/xkb;FLcom/google/android/xkb;JJFFLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/d;II)V", "initialIsVisible", "isPersistent", "Landroidx/compose/foundation/MutatorMutex;", "mutatorMutex", "v", "(ZZLandroidx/compose/foundation/MutatorMutex;Landroidx/compose/runtime/d;II)Lcom/google/android/cad;", "Landroidx/compose/animation/core/Transition;", "transition", "m", "(Landroidx/compose/ui/b;Landroidx/compose/animation/core/Transition;)Landroidx/compose/ui/b;", "", "tooltipWidth", "", "screenWidthPx", "Lcom/google/android/gba;", "anchorBounds", "n", "(FILcom/google/android/gba;)F", "Lcom/google/android/o58;", "Lcom/google/android/zh7;", "transformationMatrix", "Lcom/google/android/f43;", "density", "Lcom/google/android/q16;", "windowContainerSize", "Landroidx/compose/ui/layout/j;", "Lcom/google/android/kn6;", "getAnchorLayoutCoordinates", "s", "(Landroidx/compose/ui/b;Lcom/google/android/o58;Lcom/google/android/f43;JLkotlin/jvm/functions/Function1;Lcom/google/android/rg9;)Landroidx/compose/ui/b;", "a", "F", "p", "()F", "SpacingBetweenTooltipAndAnchor", "b", "q", "TooltipMinHeight", "c", "r", "TooltipMinWidth", "d", "PlainTooltipVerticalPadding", "e", "PlainTooltipHorizontalPadding", "Lcom/google/android/rx8;", "f", "Lcom/google/android/rx8;", "o", "()Lcom/google/android/rx8;", "PlainTooltipContentPadding", "getRichTooltipHorizontalPadding", "RichTooltipHorizontalPadding", "h", "getHeightToSubheadFirstLine", "HeightToSubheadFirstLine", "i", "HeightFromSubheadToTextFirstLine", "TextBottomPadding", "k", "getActionLabelMinHeight", "ActionLabelMinHeight", "l", "getActionLabelBottomPadding", "ActionLabelBottomPadding", "scale", "alpha", "material3"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class TooltipKt {
    private static final float a;
    private static final float b;
    private static final float c = ff3.i(40);
    private static final float d;
    private static final float e;
    private static final rx8 f;
    private static final float g;
    private static final float h;
    private static final float i;
    private static final float j;
    private static final float k;
    private static final float l;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class a implements Function2<androidx.compose.p004runtime.d, Integer, Unit> {
        final /* synthetic */ float a;
        final /* synthetic */ long b;
        final /* synthetic */ Function2<androidx.compose.p004runtime.d, Integer, Unit> c;

        /* JADX WARN: Multi-variable type inference failed */
        a(float f, long j, Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> function2) {
            this.a = f;
            this.b = j;
            this.c = function2;
        }

        public final void a(androidx.compose.p004runtime.d dVar, int i) {
            if (!dVar.g((i & 3) != 2, i & 1)) {
                dVar.q();
                return;
            }
            if (e.k()) {
                e.o(-1573998995, i, -1, "androidx.compose.material3.PlainTooltip.<anonymous> (Tooltip.kt:462)");
            }
            androidx.compose.ui.b bVarL = nx8.l(SizeKt.x(androidx.compose.ui.b.INSTANCE, TooltipKt.r(), TooltipKt.q(), this.a, 0.0f, 8, null), TooltipKt.o());
            long j = this.b;
            Function2<androidx.compose.p004runtime.d, Integer, Unit> function2 = this.c;
            ej7 ej7VarI = j.i(tc.INSTANCE.o(), false);
            int iA = pp1.a(dVar, 0);
            gs1 gs1VarJ = dVar.j();
            androidx.compose.ui.b bVarE = ComposedModifierKt.e(dVar, bVarL);
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
            fs1.d(new os9[]{cz1.a().d(ei1.l(j)), qxc.q().d(xod.e(ha9.a.d(), dVar, 6))}, function2, dVar, os9.i);
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
        final /* synthetic */ Transition<Boolean> a;
        final /* synthetic */ ps4<aad, androidx.compose.p004runtime.d, Integer, Unit> b;
        final /* synthetic */ bad c;

        /* JADX WARN: Multi-variable type inference failed */
        b(Transition<Boolean> transition, ps4<? super aad, ? super androidx.compose.p004runtime.d, ? super Integer, Unit> ps4Var, bad badVar) {
            this.a = transition;
            this.b = ps4Var;
            this.c = badVar;
        }

        public final void a(androidx.compose.p004runtime.d dVar, int i) {
            if (!dVar.g((i & 3) != 2, i & 1)) {
                dVar.q();
                return;
            }
            if (e.k()) {
                e.o(-527401546, i, -1, "androidx.compose.material3.TooltipBox.<anonymous> (Tooltip.kt:321)");
            }
            androidx.compose.ui.b bVarM = TooltipKt.m(androidx.compose.ui.b.INSTANCE, this.a);
            ps4<aad, androidx.compose.p004runtime.d, Integer, Unit> ps4Var = this.b;
            bad badVar = this.c;
            ej7 ej7VarI = j.i(tc.INSTANCE.o(), false);
            int iA = pp1.a(dVar, 0);
            gs1 gs1VarJ = dVar.j();
            androidx.compose.ui.b bVarE = ComposedModifierKt.e(dVar, bVarM);
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
            ps4Var.invoke(badVar, dVar, 6);
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
        final /* synthetic */ o58<kn6> a;
        final /* synthetic */ Function2<androidx.compose.p004runtime.d, Integer, Unit> b;

        /* JADX WARN: Multi-variable type inference failed */
        c(o58<kn6> o58Var, Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> function2) {
            this.a = o58Var;
            this.b = function2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(o58 o58Var, kn6 kn6Var) {
            o58Var.setValue(kn6Var);
            return Unit.a;
        }

        public final void b(androidx.compose.p004runtime.d dVar, int i) {
            if (!dVar.g((i & 3) != 2, i & 1)) {
                dVar.q();
                return;
            }
            if (e.k()) {
                e.o(-23901870, i, -1, "androidx.compose.material3.TooltipBox.<anonymous> (Tooltip.kt:316)");
            }
            androidx.compose.ui.b.Companion companion = androidx.compose.ui.b.INSTANCE;
            final o58<kn6> o58Var = this.a;
            Object objR = dVar.R();
            if (objR == androidx.compose.p004runtime.d.INSTANCE.a()) {
                objR = new Function1() { // from class: androidx.compose.material3.t2
                    public final Object invoke(Object obj) {
                        return TooltipKt.c.c(o58Var, (kn6) obj);
                    }
                };
                dVar.L(objR);
            }
            androidx.compose.ui.b bVarA = xq8.a(companion, (Function1) objR);
            Function2<androidx.compose.p004runtime.d, Integer, Unit> function2 = this.b;
            ej7 ej7VarI = j.i(tc.INSTANCE.o(), false);
            int iA = pp1.a(dVar, 0);
            gs1 gs1VarJ = dVar.j();
            androidx.compose.ui.b bVarE = ComposedModifierKt.e(dVar, bVarA);
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
            if (e.k()) {
                e.n();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((androidx.compose.p004runtime.d) obj, ((Number) obj2).intValue());
            return Unit.a;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class d implements ps4<androidx.compose.ui.b, androidx.compose.p004runtime.d, Integer, androidx.compose.ui.b> {
        final /* synthetic */ Transition<Boolean> a;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        static final class a implements ps4<Transition.b<Boolean>, androidx.compose.p004runtime.d, Integer, xa4<Float>> {
            final /* synthetic */ xa4<Float> a;

            a(xa4<Float> xa4Var) {
                this.a = xa4Var;
            }

            public final xa4<Float> a(Transition.b<Boolean> bVar, androidx.compose.p004runtime.d dVar, int i) {
                dVar.y(-281714272);
                if (e.k()) {
                    e.o(-281714272, i, -1, "androidx.compose.material3.animateTooltip.<anonymous>.<anonymous> (Tooltip.kt:1280)");
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
        static final class b implements ps4<Transition.b<Boolean>, androidx.compose.p004runtime.d, Integer, xa4<Float>> {
            final /* synthetic */ xa4<Float> a;

            b(xa4<Float> xa4Var) {
                this.a = xa4Var;
            }

            public final xa4<Float> a(Transition.b<Boolean> bVar, androidx.compose.p004runtime.d dVar, int i) {
                dVar.y(386845748);
                if (e.k()) {
                    e.o(386845748, i, -1, "androidx.compose.material3.animateTooltip.<anonymous>.<anonymous> (Tooltip.kt:1272)");
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

        d(Transition<Boolean> transition) {
            this.a = transition;
        }

        private static final float b(q6c<Float> q6cVar) {
            return q6cVar.getValue().floatValue();
        }

        private static final float c(q6c<Float> q6cVar) {
            return q6cVar.getValue().floatValue();
        }

        public final androidx.compose.ui.b a(androidx.compose.ui.b bVar, androidx.compose.p004runtime.d dVar, int i) throws Throwable {
            dVar.y(-1498516085);
            if (e.k()) {
                e.o(-1498516085, i, -1, "androidx.compose.material3.animateTooltip.<anonymous> (Tooltip.kt:1268)");
            }
            xa4 xa4VarB = d08.b(MotionSchemeKeyTokens.FastSpatial, dVar, 6);
            xa4 xa4VarB2 = d08.b(MotionSchemeKeyTokens.FastEffects, dVar, 6);
            Transition<Boolean> transition = this.a;
            b bVar2 = new b(xa4VarB);
            yg4 yg4Var = yg4.a;
            tjd<Float, qr> tjdVarN = w2e.N(yg4Var);
            boolean zBooleanValue = transition.p().booleanValue();
            dVar.y(-1553362193);
            if (e.k()) {
                e.o(-1553362193, 0, -1, "androidx.compose.material3.animateTooltip.<anonymous>.<anonymous> (Tooltip.kt:1275)");
            }
            float f = zBooleanValue ? 1.0f : 0.8f;
            if (e.k()) {
                e.n();
            }
            dVar.u();
            Float fValueOf = Float.valueOf(f);
            boolean zBooleanValue2 = transition.w().booleanValue();
            dVar.y(-1553362193);
            if (e.k()) {
                e.o(-1553362193, 0, -1, "androidx.compose.material3.animateTooltip.<anonymous>.<anonymous> (Tooltip.kt:1275)");
            }
            float f2 = zBooleanValue2 ? 1.0f : 0.8f;
            if (e.k()) {
                e.n();
            }
            dVar.u();
            q6c q6cVarR = TransitionKt.r(transition, fValueOf, Float.valueOf(f2), (xa4) bVar2.invoke(transition.u(), dVar, 0), tjdVarN, "tooltip transition: scaling", dVar, 196608);
            Transition<Boolean> transition2 = this.a;
            a aVar = new a(xa4VarB2);
            tjd<Float, qr> tjdVarN2 = w2e.N(yg4Var);
            boolean zBooleanValue3 = transition2.p().booleanValue();
            dVar.y(2073045083);
            if (e.k()) {
                e.o(2073045083, 0, -1, "androidx.compose.material3.animateTooltip.<anonymous>.<anonymous> (Tooltip.kt:1283)");
            }
            float f3 = zBooleanValue3 ? 1.0f : 0.0f;
            if (e.k()) {
                e.n();
            }
            dVar.u();
            Float fValueOf2 = Float.valueOf(f3);
            boolean zBooleanValue4 = transition2.w().booleanValue();
            dVar.y(2073045083);
            if (e.k()) {
                e.o(2073045083, 0, -1, "androidx.compose.material3.animateTooltip.<anonymous>.<anonymous> (Tooltip.kt:1283)");
            }
            float f4 = zBooleanValue4 ? 1.0f : 0.0f;
            if (e.k()) {
                e.n();
            }
            dVar.u();
            androidx.compose.ui.b bVarD = l.d(bVar, (131064 & 1) != 0 ? 1.0f : b(q6cVarR), (131064 & 2) != 0 ? 1.0f : b(q6cVarR), (131064 & 4) == 0 ? c(TransitionKt.r(transition2, fValueOf2, Float.valueOf(f4), (xa4) aVar.invoke(transition2.u(), dVar, 0), tjdVarN2, "tooltip transition: alpha", dVar, 196608)) : 1.0f, (131064 & 8) != 0 ? 0.0f : 0.0f, (131064 & 16) != 0 ? 0.0f : 0.0f, (131064 & 32) != 0 ? 0.0f : 0.0f, (131064 & 64) != 0 ? 0.0f : 0.0f, (131064 & 128) != 0 ? 0.0f : 0.0f, (131064 & 256) == 0 ? 0.0f : 0.0f, (131064 & 512) != 0 ? 8.0f : 0.0f, (131064 & 1024) != 0 ? t.INSTANCE.a() : 0L, (131064 & 2048) != 0 ? r.a() : null, (131064 & 4096) != 0 ? false : false, (131064 & 8192) != 0 ? null : null, (131064 & 16384) != 0 ? l05.a() : 0L, (32768 & 131064) != 0 ? l05.a() : 0L, (131064 & 65536) != 0 ? androidx.compose.ui.graphics.j.INSTANCE.a() : 0);
            if (e.k()) {
                e.n();
            }
            dVar.u();
            return bVarD;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a((androidx.compose.ui.b) obj, (androidx.compose.p004runtime.d) obj2, ((Number) obj3).intValue());
        }
    }

    static {
        float f2 = 4;
        a = ff3.i(f2);
        float f3 = 24;
        b = ff3.i(f3);
        float fI = ff3.i(f2);
        d = fI;
        float f4 = 8;
        float fI2 = ff3.i(f4);
        e = fI2;
        f = nx8.f(fI2, fI);
        float f5 = 16;
        g = ff3.i(f5);
        h = ff3.i(28);
        i = ff3.i(f3);
        j = ff3.i(f5);
        k = ff3.i(36);
        l = ff3.i(f4);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x011b  */
    /* JADX WARN: Code duplicated, block: B:104:0x0125  */
    /* JADX WARN: Code duplicated, block: B:105:0x0128  */
    /* JADX WARN: Code duplicated, block: B:107:0x012c  */
    /* JADX WARN: Code duplicated, block: B:109:0x0132  */
    /* JADX WARN: Code duplicated, block: B:110:0x0135  */
    /* JADX WARN: Code duplicated, block: B:114:0x0145  */
    /* JADX WARN: Code duplicated, block: B:115:0x0147  */
    /* JADX WARN: Code duplicated, block: B:118:0x0150  */
    /* JADX WARN: Code duplicated, block: B:120:0x015e  */
    /* JADX WARN: Code duplicated, block: B:134:0x0191 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:135:0x0193  */
    /* JADX WARN: Code duplicated, block: B:137:0x0198  */
    /* JADX WARN: Code duplicated, block: B:139:0x019b  */
    /* JADX WARN: Code duplicated, block: B:142:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:145:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:146:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:149:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:150:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:152:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:153:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:155:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:157:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:160:0x0200  */
    /* JADX WARN: Code duplicated, block: B:162:0x0208  */
    /* JADX WARN: Code duplicated, block: B:164:0x021a  */
    /* JADX WARN: Code duplicated, block: B:167:0x024b  */
    /* JADX WARN: Code duplicated, block: B:173:0x0258  */
    /* JADX WARN: Code duplicated, block: B:176:0x025f  */
    /* JADX WARN: Code duplicated, block: B:178:0x0265  */
    /* JADX WARN: Code duplicated, block: B:181:0x0291  */
    /* JADX WARN: Code duplicated, block: B:183:0x0297  */
    /* JADX WARN: Code duplicated, block: B:189:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:190:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:193:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:195:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:197:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:200:0x030a  */
    /* JADX WARN: Code duplicated, block: B:202:0x031a  */
    /* JADX WARN: Code duplicated, block: B:205:0x0331  */
    /* JADX WARN: Code duplicated, block: B:207:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x0051  */
    /* JADX WARN: Code duplicated, block: B:31:0x0056  */
    /* JADX WARN: Code duplicated, block: B:33:0x005a  */
    /* JADX WARN: Code duplicated, block: B:35:0x0062  */
    /* JADX WARN: Code duplicated, block: B:36:0x0065  */
    /* JADX WARN: Code duplicated, block: B:40:0x006c  */
    /* JADX WARN: Code duplicated, block: B:42:0x0071  */
    /* JADX WARN: Code duplicated, block: B:44:0x0075  */
    /* JADX WARN: Code duplicated, block: B:46:0x007d  */
    /* JADX WARN: Code duplicated, block: B:47:0x0080  */
    /* JADX WARN: Code duplicated, block: B:51:0x0088  */
    /* JADX WARN: Code duplicated, block: B:53:0x008c  */
    /* JADX WARN: Code duplicated, block: B:55:0x0094  */
    /* JADX WARN: Code duplicated, block: B:56:0x0097  */
    /* JADX WARN: Code duplicated, block: B:59:0x009e  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:64:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:73:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:80:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:84:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:89:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:93:0x0103  */
    /* JADX WARN: Code duplicated, block: B:95:0x010a  */
    /* JADX WARN: Code duplicated, block: B:97:0x010e  */
    /* JADX WARN: Code duplicated, block: B:99:0x0118  */
    public static final void g(final aad aadVar, androidx.compose.ui.b bVar, xkb xkbVar, float f2, xkb xkbVar2, long j2, long j3, float f3, float f4, final Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> function2, androidx.compose.p004runtime.d dVar, final int i2, final int i3) {
        int i4;
        androidx.compose.ui.b bVar2;
        int i5;
        xkb xkbVar3;
        int i6;
        int i7;
        float fD;
        int i8;
        xkb xkbVarB;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z;
        androidx.compose.p004runtime.d dVar2;
        final float f5;
        final androidx.compose.ui.b bVar3;
        final xkb xkbVar4;
        final xkb xkbVar5;
        final float f6;
        final long j4;
        final long j5;
        final float f7;
        s6b s6bVarH;
        long jC;
        long jA;
        float fI;
        float fI2;
        float f8;
        int i16;
        long j6;
        long j7;
        androidx.compose.ui.b bVar4;
        xkb xkbVar6;
        Object objR;
        androidx.compose.p004runtime.d.Companion companion;
        o58 o58Var;
        boolean z2;
        Object objR2;
        boolean z3;
        boolean z4;
        Object objR3;
        int i17;
        androidx.compose.p004runtime.d dVarF = dVar.F(-343758958);
        if ((Integer.MIN_VALUE & i3) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = ((i2 & 8) == 0 ? dVarF.x(aadVar) : dVarF.T(aadVar) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i18 = i3 & 1;
        if (i18 == 0) {
            if ((i2 & 48) == 0) {
                bVar2 = bVar;
                i4 |= dVarF.x(bVar2) ? 32 : 16;
            }
            i5 = i3 & 2;
            if (i5 != 0) {
                if ((i2 & 384) == 0) {
                    xkbVar3 = xkbVar;
                    if (dVarF.x(xkbVar3)) {
                        i6 = 256;
                    } else {
                        i6 = 128;
                    }
                    i4 |= i6;
                }
                i7 = i3 & 4;
                if (i7 != 0) {
                    if ((i2 & 3072) == 0) {
                        fD = f2;
                        if (dVarF.B(fD)) {
                            i8 = 2048;
                        } else {
                            i8 = 1024;
                        }
                        i4 |= i8;
                    }
                    if ((i2 & 24576) == 0) {
                        if ((i3 & 8) == 0) {
                            xkbVarB = xkbVar2;
                            int i19 = dVarF.x(xkbVarB) ? 16384 : 8192;
                            i4 |= i19;
                        } else {
                            xkbVarB = xkbVar2;
                        }
                        i4 |= i19;
                    } else {
                        xkbVarB = xkbVar2;
                    }
                    if ((i2 & 196608) == 0) {
                        if ((i3 & 16) == 0) {
                            i9 = i18;
                            int i20 = dVarF.D(j2) ? 131072 : 65536;
                            i4 |= i20;
                        } else {
                            i9 = i18;
                        }
                        i4 |= i20;
                    } else {
                        i9 = i18;
                    }
                    if ((i2 & 1572864) != 0) {
                        if ((i3 & 32) == 0 || !dVarF.D(j3)) {
                            i17 = 524288;
                        } else {
                            i17 = 1048576;
                        }
                        i4 |= i17;
                    }
                    i10 = i3 & 64;
                    if (i10 != 0) {
                        i4 |= 12582912;
                    } else if ((i2 & 12582912) == 0) {
                        if (dVarF.B(f3)) {
                            i11 = 8388608;
                        } else {
                            i11 = 4194304;
                        }
                        i4 |= i11;
                    }
                    i12 = i3 & 128;
                    if (i12 != 0) {
                        if ((i2 & 100663296) == 0) {
                            if (dVarF.B(f4)) {
                                i13 = 67108864;
                            } else {
                                i13 = 33554432;
                            }
                            i4 |= i13;
                        }
                        if ((i3 & 256) != 0) {
                            i4 |= 805306368;
                        } else if ((i2 & 805306368) == 0) {
                            if (dVarF.T(function2)) {
                                i14 = 536870912;
                            } else {
                                i14 = 268435456;
                            }
                            i4 |= i14;
                        }
                        i15 = i4;
                        if ((306783379 & i4) != 306783378) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (dVarF.g(z, i15 & 1)) {
                            dVarF.U();
                            if ((i2 & 1) != 0 || dVarF.t()) {
                                if (i9 != 0) {
                                    bVar2 = androidx.compose.ui.b.INSTANCE;
                                }
                                if (i5 != 0) {
                                    xkbVar3 = null;
                                }
                                if (i7 != 0) {
                                    fD = s2.a.d();
                                }
                                if ((i3 & 8) != 0) {
                                    i15 &= -57345;
                                    xkbVarB = s2.a.b(dVarF, 6);
                                }
                                if ((i3 & 16) != 0) {
                                    jC = s2.a.c(dVarF, 6);
                                    i15 &= -458753;
                                } else {
                                    jC = j2;
                                }
                                if ((i3 & 32) != 0) {
                                    jA = s2.a.a(dVarF, 6);
                                    i15 &= -3670017;
                                } else {
                                    jA = j3;
                                }
                                if (i10 != 0) {
                                    fI = ff3.i(0);
                                } else {
                                    fI = f3;
                                }
                                if (i12 != 0) {
                                    fI2 = ff3.i(0);
                                } else {
                                    fI2 = f4;
                                }
                                f8 = fD;
                                i16 = i15;
                                j6 = jA;
                                j7 = jC;
                            } else {
                                dVarF.q();
                                if ((i3 & 8) != 0) {
                                    i15 &= -57345;
                                }
                                if ((i3 & 16) != 0) {
                                    i15 &= -458753;
                                }
                                if ((i3 & 32) != 0) {
                                    i15 &= -3670017;
                                }
                                j7 = j2;
                                j6 = j3;
                                fI = f3;
                                fI2 = f4;
                                f8 = fD;
                                i16 = i15;
                            }
                            dVarF.M();
                            if (e.k()) {
                                e.o(-343758958, i16, -1, "androidx.compose.material3.PlainTooltip (Tooltip.kt:430)");
                            }
                            if (xkbVar3 != null) {
                                dVarF.y(-1720477287);
                                objR = dVarF.R();
                                companion = androidx.compose.p004runtime.d.INSTANCE;
                                if (objR == companion.a()) {
                                    objR = s0.e(zh7.a(zh7.c(null, 1, null)), null, 2, null);
                                    dVarF.L(objR);
                                }
                                o58Var = (o58) objR;
                                f43 f43Var = (f43) dVarF.v(CompositionLocalsKt.g());
                                long jA2 = ((a0) dVarF.v(CompositionLocalsKt.v())).a();
                                androidx.compose.ui.b.Companion companion2 = androidx.compose.ui.b.INSTANCE;
                                if ((i16 & 14) != 4 || ((i16 & 8) != 0 && dVarF.T(aadVar))) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                objR2 = dVarF.R();
                                if (z2 || objR2 == companion.a()) {
                                    objR2 = new Function1() { // from class: com.google.android.w9d
                                        public final Object invoke(Object obj) {
                                            return TooltipKt.i(aadVar, (androidx.compose.ui.layout.j) obj);
                                        }
                                    };
                                    dVarF.L(objR2);
                                }
                                androidx.compose.ui.b bVarThen = s(companion2, o58Var, f43Var, jA2, (Function1) objR2, aadVar.getPositionProvider()).then(bVar2);
                                boolean z5 = (((57344 & i16) ^ 24576) <= 16384 && dVarF.x(xkbVarB)) || (i16 & 24576) == 16384;
                                if ((i16 & 896) == 256) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                z4 = z5 | z3;
                                objR3 = dVarF.R();
                                if (z4 || objR3 == companion.a()) {
                                    objR3 = new r2(o58Var, xkbVarB, xkbVar3);
                                    dVarF.L(objR3);
                                }
                                dVarF.u();
                                bVar4 = bVarThen;
                                xkbVar6 = (r2) objR3;
                            } else {
                                dVarF.y(-1719831991);
                                dVarF.u();
                                bVar4 = bVar2;
                                xkbVar6 = xkbVarB;
                            }
                            long j8 = j7;
                            float f9 = f8;
                            int i21 = i16 >> 9;
                            dVar2 = dVarF;
                            afc.c(bVar4, xkbVar6, j6, 0L, fI, fI2, null, ko1.e(-1573998995, true, new a(f8, j8, function2), dVarF, 54), dVar2, ((i16 >> 12) & 896) | 12582912 | (57344 & i21) | (i21 & 458752), 72);
                            if (e.k()) {
                                e.n();
                            }
                            bVar3 = bVar2;
                            xkbVar5 = xkbVar3;
                            f7 = fI;
                            f5 = fI2;
                            j4 = j8;
                            xkbVar4 = xkbVarB;
                            j5 = j6;
                            f6 = f9;
                        } else {
                            dVar2 = dVarF;
                            dVar2.q();
                            f5 = f4;
                            bVar3 = bVar2;
                            xkbVar4 = xkbVarB;
                            xkbVar5 = xkbVar3;
                            f6 = fD;
                            j4 = j2;
                            j5 = j3;
                            f7 = f3;
                        }
                        s6bVarH = dVar2.H();
                        if (s6bVarH != null) {
                            s6bVarH.a(new Function2() { // from class: com.google.android.x9d
                                public final Object invoke(Object obj, Object obj2) {
                                    return TooltipKt.h(aadVar, bVar3, xkbVar5, f6, xkbVar4, j4, j5, f7, f5, function2, i2, i3, (d) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i4 |= 100663296;
                    if ((i3 & 256) != 0) {
                        i4 |= 805306368;
                    } else if ((i2 & 805306368) == 0) {
                        if (dVarF.T(function2)) {
                            i14 = 536870912;
                        } else {
                            i14 = 268435456;
                        }
                        i4 |= i14;
                    }
                    i15 = i4;
                    if ((306783379 & i4) != 306783378) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (dVarF.g(z, i15 & 1)) {
                        dVarF.U();
                        if ((i2 & 1) != 0) {
                            if (i9 != 0) {
                                bVar2 = androidx.compose.ui.b.INSTANCE;
                            }
                            if (i5 != 0) {
                                xkbVar3 = null;
                            }
                            if (i7 != 0) {
                                fD = s2.a.d();
                            }
                            if ((i3 & 8) != 0) {
                                i15 &= -57345;
                                xkbVarB = s2.a.b(dVarF, 6);
                            }
                            if ((i3 & 16) != 0) {
                                jC = s2.a.c(dVarF, 6);
                                i15 &= -458753;
                            } else {
                                jC = j2;
                            }
                            if ((i3 & 32) != 0) {
                                jA = s2.a.a(dVarF, 6);
                                i15 &= -3670017;
                            } else {
                                jA = j3;
                            }
                            if (i10 != 0) {
                                fI = ff3.i(0);
                            } else {
                                fI = f3;
                            }
                            if (i12 != 0) {
                                fI2 = ff3.i(0);
                            } else {
                                fI2 = f4;
                            }
                            f8 = fD;
                            i16 = i15;
                            j6 = jA;
                            j7 = jC;
                        } else {
                            if (i9 != 0) {
                                bVar2 = androidx.compose.ui.b.INSTANCE;
                            }
                            if (i5 != 0) {
                                xkbVar3 = null;
                            }
                            if (i7 != 0) {
                                fD = s2.a.d();
                            }
                            if ((i3 & 8) != 0) {
                                i15 &= -57345;
                                xkbVarB = s2.a.b(dVarF, 6);
                            }
                            if ((i3 & 16) != 0) {
                                jC = s2.a.c(dVarF, 6);
                                i15 &= -458753;
                            } else {
                                jC = j2;
                            }
                            if ((i3 & 32) != 0) {
                                jA = s2.a.a(dVarF, 6);
                                i15 &= -3670017;
                            } else {
                                jA = j3;
                            }
                            if (i10 != 0) {
                                fI = ff3.i(0);
                            } else {
                                fI = f3;
                            }
                            if (i12 != 0) {
                                fI2 = ff3.i(0);
                            } else {
                                fI2 = f4;
                            }
                            f8 = fD;
                            i16 = i15;
                            j6 = jA;
                            j7 = jC;
                        }
                        dVarF.M();
                        if (e.k()) {
                            e.o(-343758958, i16, -1, "androidx.compose.material3.PlainTooltip (Tooltip.kt:430)");
                        }
                        if (xkbVar3 != null) {
                            dVarF.y(-1720477287);
                            objR = dVarF.R();
                            companion = androidx.compose.p004runtime.d.INSTANCE;
                            if (objR == companion.a()) {
                                objR = s0.e(zh7.a(zh7.c(null, 1, null)), null, 2, null);
                                dVarF.L(objR);
                            }
                            o58Var = (o58) objR;
                            f43 f43Var2 = (f43) dVarF.v(CompositionLocalsKt.g());
                            long jA3 = ((a0) dVarF.v(CompositionLocalsKt.v())).a();
                            androidx.compose.ui.b.Companion companion3 = androidx.compose.ui.b.INSTANCE;
                            if ((i16 & 14) != 4) {
                                z2 = true;
                            } else {
                                z2 = true;
                            }
                            objR2 = dVarF.R();
                            if (z2) {
                                objR2 = new Function1() { // from class: com.google.android.w9d
                                    public final Object invoke(Object obj) {
                                        return TooltipKt.i(aadVar, (androidx.compose.ui.layout.j) obj);
                                    }
                                };
                                dVarF.L(objR2);
                            } else {
                                objR2 = new Function1() { // from class: com.google.android.w9d
                                    public final Object invoke(Object obj) {
                                        return TooltipKt.i(aadVar, (androidx.compose.ui.layout.j) obj);
                                    }
                                };
                                dVarF.L(objR2);
                            }
                            androidx.compose.ui.b bVarThen2 = s(companion3, o58Var, f43Var2, jA3, (Function1) objR2, aadVar.getPositionProvider()).then(bVar2);
                            if (((57344 & i16) ^ 24576) <= 16384) {
                            }
                            if ((i16 & 896) == 256) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            z4 = z5 | z3;
                            objR3 = dVarF.R();
                            if (z4) {
                                objR3 = new r2(o58Var, xkbVarB, xkbVar3);
                                dVarF.L(objR3);
                            } else {
                                objR3 = new r2(o58Var, xkbVarB, xkbVar3);
                                dVarF.L(objR3);
                            }
                            dVarF.u();
                            bVar4 = bVarThen2;
                            xkbVar6 = (r2) objR3;
                        } else {
                            dVarF.y(-1719831991);
                            dVarF.u();
                            bVar4 = bVar2;
                            xkbVar6 = xkbVarB;
                        }
                        long j9 = j7;
                        float f10 = f8;
                        int i22 = i16 >> 9;
                        dVar2 = dVarF;
                        afc.c(bVar4, xkbVar6, j6, 0L, fI, fI2, null, ko1.e(-1573998995, true, new a(f8, j9, function2), dVarF, 54), dVar2, ((i16 >> 12) & 896) | 12582912 | (57344 & i22) | (i22 & 458752), 72);
                        if (e.k()) {
                            e.n();
                        }
                        bVar3 = bVar2;
                        xkbVar5 = xkbVar3;
                        f7 = fI;
                        f5 = fI2;
                        j4 = j9;
                        xkbVar4 = xkbVarB;
                        j5 = j6;
                        f6 = f10;
                    } else {
                        dVar2 = dVarF;
                        dVar2.q();
                        f5 = f4;
                        bVar3 = bVar2;
                        xkbVar4 = xkbVarB;
                        xkbVar5 = xkbVar3;
                        f6 = fD;
                        j4 = j2;
                        j5 = j3;
                        f7 = f3;
                    }
                    s6bVarH = dVar2.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.x9d
                            public final Object invoke(Object obj, Object obj2) {
                                return TooltipKt.h(aadVar, bVar3, xkbVar5, f6, xkbVar4, j4, j5, f7, f5, function2, i2, i3, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i4 |= 3072;
                fD = f2;
                if ((i2 & 24576) == 0) {
                    if ((i3 & 8) == 0) {
                        xkbVarB = xkbVar2;
                        if (dVarF.x(xkbVarB)) {
                        }
                        i4 |= i19;
                    } else {
                        xkbVarB = xkbVar2;
                    }
                    i4 |= i19;
                } else {
                    xkbVarB = xkbVar2;
                }
                if ((i2 & 196608) == 0) {
                    if ((i3 & 16) == 0) {
                        i9 = i18;
                        if (dVarF.D(j2)) {
                        }
                        i4 |= i20;
                    } else {
                        i9 = i18;
                    }
                    i4 |= i20;
                } else {
                    i9 = i18;
                }
                if ((i2 & 1572864) != 0) {
                    if ((i3 & 32) == 0) {
                        i17 = 524288;
                    } else {
                        i17 = 524288;
                    }
                    i4 |= i17;
                }
                i10 = i3 & 64;
                if (i10 != 0) {
                    i4 |= 12582912;
                } else if ((i2 & 12582912) == 0) {
                    if (dVarF.B(f3)) {
                        i11 = 8388608;
                    } else {
                        i11 = 4194304;
                    }
                    i4 |= i11;
                }
                i12 = i3 & 128;
                if (i12 != 0) {
                    if ((i2 & 100663296) == 0) {
                        if (dVarF.B(f4)) {
                            i13 = 67108864;
                        } else {
                            i13 = 33554432;
                        }
                        i4 |= i13;
                    }
                    if ((i3 & 256) != 0) {
                        i4 |= 805306368;
                    } else if ((i2 & 805306368) == 0) {
                        if (dVarF.T(function2)) {
                            i14 = 536870912;
                        } else {
                            i14 = 268435456;
                        }
                        i4 |= i14;
                    }
                    i15 = i4;
                    if ((306783379 & i4) != 306783378) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (dVarF.g(z, i15 & 1)) {
                        dVarF.U();
                        if ((i2 & 1) != 0) {
                            if (i9 != 0) {
                                bVar2 = androidx.compose.ui.b.INSTANCE;
                            }
                            if (i5 != 0) {
                                xkbVar3 = null;
                            }
                            if (i7 != 0) {
                                fD = s2.a.d();
                            }
                            if ((i3 & 8) != 0) {
                                i15 &= -57345;
                                xkbVarB = s2.a.b(dVarF, 6);
                            }
                            if ((i3 & 16) != 0) {
                                jC = s2.a.c(dVarF, 6);
                                i15 &= -458753;
                            } else {
                                jC = j2;
                            }
                            if ((i3 & 32) != 0) {
                                jA = s2.a.a(dVarF, 6);
                                i15 &= -3670017;
                            } else {
                                jA = j3;
                            }
                            if (i10 != 0) {
                                fI = ff3.i(0);
                            } else {
                                fI = f3;
                            }
                            if (i12 != 0) {
                                fI2 = ff3.i(0);
                            } else {
                                fI2 = f4;
                            }
                            f8 = fD;
                            i16 = i15;
                            j6 = jA;
                            j7 = jC;
                        } else {
                            if (i9 != 0) {
                                bVar2 = androidx.compose.ui.b.INSTANCE;
                            }
                            if (i5 != 0) {
                                xkbVar3 = null;
                            }
                            if (i7 != 0) {
                                fD = s2.a.d();
                            }
                            if ((i3 & 8) != 0) {
                                i15 &= -57345;
                                xkbVarB = s2.a.b(dVarF, 6);
                            }
                            if ((i3 & 16) != 0) {
                                jC = s2.a.c(dVarF, 6);
                                i15 &= -458753;
                            } else {
                                jC = j2;
                            }
                            if ((i3 & 32) != 0) {
                                jA = s2.a.a(dVarF, 6);
                                i15 &= -3670017;
                            } else {
                                jA = j3;
                            }
                            if (i10 != 0) {
                                fI = ff3.i(0);
                            } else {
                                fI = f3;
                            }
                            if (i12 != 0) {
                                fI2 = ff3.i(0);
                            } else {
                                fI2 = f4;
                            }
                            f8 = fD;
                            i16 = i15;
                            j6 = jA;
                            j7 = jC;
                        }
                        dVarF.M();
                        if (e.k()) {
                            e.o(-343758958, i16, -1, "androidx.compose.material3.PlainTooltip (Tooltip.kt:430)");
                        }
                        if (xkbVar3 != null) {
                            dVarF.y(-1720477287);
                            objR = dVarF.R();
                            companion = androidx.compose.p004runtime.d.INSTANCE;
                            if (objR == companion.a()) {
                                objR = s0.e(zh7.a(zh7.c(null, 1, null)), null, 2, null);
                                dVarF.L(objR);
                            }
                            o58Var = (o58) objR;
                            f43 f43Var3 = (f43) dVarF.v(CompositionLocalsKt.g());
                            long jA4 = ((a0) dVarF.v(CompositionLocalsKt.v())).a();
                            androidx.compose.ui.b.Companion companion4 = androidx.compose.ui.b.INSTANCE;
                            if ((i16 & 14) != 4) {
                                z2 = true;
                            } else {
                                z2 = true;
                            }
                            objR2 = dVarF.R();
                            if (z2) {
                                objR2 = new Function1() { // from class: com.google.android.w9d
                                    public final Object invoke(Object obj) {
                                        return TooltipKt.i(aadVar, (androidx.compose.ui.layout.j) obj);
                                    }
                                };
                                dVarF.L(objR2);
                            } else {
                                objR2 = new Function1() { // from class: com.google.android.w9d
                                    public final Object invoke(Object obj) {
                                        return TooltipKt.i(aadVar, (androidx.compose.ui.layout.j) obj);
                                    }
                                };
                                dVarF.L(objR2);
                            }
                            androidx.compose.ui.b bVarThen3 = s(companion4, o58Var, f43Var3, jA4, (Function1) objR2, aadVar.getPositionProvider()).then(bVar2);
                            if (((57344 & i16) ^ 24576) <= 16384) {
                            }
                            if ((i16 & 896) == 256) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            z4 = z5 | z3;
                            objR3 = dVarF.R();
                            if (z4) {
                                objR3 = new r2(o58Var, xkbVarB, xkbVar3);
                                dVarF.L(objR3);
                            } else {
                                objR3 = new r2(o58Var, xkbVarB, xkbVar3);
                                dVarF.L(objR3);
                            }
                            dVarF.u();
                            bVar4 = bVarThen3;
                            xkbVar6 = (r2) objR3;
                        } else {
                            dVarF.y(-1719831991);
                            dVarF.u();
                            bVar4 = bVar2;
                            xkbVar6 = xkbVarB;
                        }
                        long j10 = j7;
                        float f11 = f8;
                        int i23 = i16 >> 9;
                        dVar2 = dVarF;
                        afc.c(bVar4, xkbVar6, j6, 0L, fI, fI2, null, ko1.e(-1573998995, true, new a(f8, j10, function2), dVarF, 54), dVar2, ((i16 >> 12) & 896) | 12582912 | (57344 & i23) | (i23 & 458752), 72);
                        if (e.k()) {
                            e.n();
                        }
                        bVar3 = bVar2;
                        xkbVar5 = xkbVar3;
                        f7 = fI;
                        f5 = fI2;
                        j4 = j10;
                        xkbVar4 = xkbVarB;
                        j5 = j6;
                        f6 = f11;
                    } else {
                        dVar2 = dVarF;
                        dVar2.q();
                        f5 = f4;
                        bVar3 = bVar2;
                        xkbVar4 = xkbVarB;
                        xkbVar5 = xkbVar3;
                        f6 = fD;
                        j4 = j2;
                        j5 = j3;
                        f7 = f3;
                    }
                    s6bVarH = dVar2.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.x9d
                            public final Object invoke(Object obj, Object obj2) {
                                return TooltipKt.h(aadVar, bVar3, xkbVar5, f6, xkbVar4, j4, j5, f7, f5, function2, i2, i3, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i4 |= 100663296;
                if ((i3 & 256) != 0) {
                    i4 |= 805306368;
                } else if ((i2 & 805306368) == 0) {
                    if (dVarF.T(function2)) {
                        i14 = 536870912;
                    } else {
                        i14 = 268435456;
                    }
                    i4 |= i14;
                }
                i15 = i4;
                if ((306783379 & i4) != 306783378) {
                    z = true;
                } else {
                    z = false;
                }
                if (dVarF.g(z, i15 & 1)) {
                    dVarF.U();
                    if ((i2 & 1) != 0) {
                        if (i9 != 0) {
                            bVar2 = androidx.compose.ui.b.INSTANCE;
                        }
                        if (i5 != 0) {
                            xkbVar3 = null;
                        }
                        if (i7 != 0) {
                            fD = s2.a.d();
                        }
                        if ((i3 & 8) != 0) {
                            i15 &= -57345;
                            xkbVarB = s2.a.b(dVarF, 6);
                        }
                        if ((i3 & 16) != 0) {
                            jC = s2.a.c(dVarF, 6);
                            i15 &= -458753;
                        } else {
                            jC = j2;
                        }
                        if ((i3 & 32) != 0) {
                            jA = s2.a.a(dVarF, 6);
                            i15 &= -3670017;
                        } else {
                            jA = j3;
                        }
                        if (i10 != 0) {
                            fI = ff3.i(0);
                        } else {
                            fI = f3;
                        }
                        if (i12 != 0) {
                            fI2 = ff3.i(0);
                        } else {
                            fI2 = f4;
                        }
                        f8 = fD;
                        i16 = i15;
                        j6 = jA;
                        j7 = jC;
                    } else {
                        if (i9 != 0) {
                            bVar2 = androidx.compose.ui.b.INSTANCE;
                        }
                        if (i5 != 0) {
                            xkbVar3 = null;
                        }
                        if (i7 != 0) {
                            fD = s2.a.d();
                        }
                        if ((i3 & 8) != 0) {
                            i15 &= -57345;
                            xkbVarB = s2.a.b(dVarF, 6);
                        }
                        if ((i3 & 16) != 0) {
                            jC = s2.a.c(dVarF, 6);
                            i15 &= -458753;
                        } else {
                            jC = j2;
                        }
                        if ((i3 & 32) != 0) {
                            jA = s2.a.a(dVarF, 6);
                            i15 &= -3670017;
                        } else {
                            jA = j3;
                        }
                        if (i10 != 0) {
                            fI = ff3.i(0);
                        } else {
                            fI = f3;
                        }
                        if (i12 != 0) {
                            fI2 = ff3.i(0);
                        } else {
                            fI2 = f4;
                        }
                        f8 = fD;
                        i16 = i15;
                        j6 = jA;
                        j7 = jC;
                    }
                    dVarF.M();
                    if (e.k()) {
                        e.o(-343758958, i16, -1, "androidx.compose.material3.PlainTooltip (Tooltip.kt:430)");
                    }
                    if (xkbVar3 != null) {
                        dVarF.y(-1720477287);
                        objR = dVarF.R();
                        companion = androidx.compose.p004runtime.d.INSTANCE;
                        if (objR == companion.a()) {
                            objR = s0.e(zh7.a(zh7.c(null, 1, null)), null, 2, null);
                            dVarF.L(objR);
                        }
                        o58Var = (o58) objR;
                        f43 f43Var4 = (f43) dVarF.v(CompositionLocalsKt.g());
                        long jA5 = ((a0) dVarF.v(CompositionLocalsKt.v())).a();
                        androidx.compose.ui.b.Companion companion5 = androidx.compose.ui.b.INSTANCE;
                        if ((i16 & 14) != 4) {
                            z2 = true;
                        } else {
                            z2 = true;
                        }
                        objR2 = dVarF.R();
                        if (z2) {
                            objR2 = new Function1() { // from class: com.google.android.w9d
                                public final Object invoke(Object obj) {
                                    return TooltipKt.i(aadVar, (androidx.compose.ui.layout.j) obj);
                                }
                            };
                            dVarF.L(objR2);
                        } else {
                            objR2 = new Function1() { // from class: com.google.android.w9d
                                public final Object invoke(Object obj) {
                                    return TooltipKt.i(aadVar, (androidx.compose.ui.layout.j) obj);
                                }
                            };
                            dVarF.L(objR2);
                        }
                        androidx.compose.ui.b bVarThen4 = s(companion5, o58Var, f43Var4, jA5, (Function1) objR2, aadVar.getPositionProvider()).then(bVar2);
                        if (((57344 & i16) ^ 24576) <= 16384) {
                        }
                        if ((i16 & 896) == 256) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        z4 = z5 | z3;
                        objR3 = dVarF.R();
                        if (z4) {
                            objR3 = new r2(o58Var, xkbVarB, xkbVar3);
                            dVarF.L(objR3);
                        } else {
                            objR3 = new r2(o58Var, xkbVarB, xkbVar3);
                            dVarF.L(objR3);
                        }
                        dVarF.u();
                        bVar4 = bVarThen4;
                        xkbVar6 = (r2) objR3;
                    } else {
                        dVarF.y(-1719831991);
                        dVarF.u();
                        bVar4 = bVar2;
                        xkbVar6 = xkbVarB;
                    }
                    long j11 = j7;
                    float f12 = f8;
                    int i24 = i16 >> 9;
                    dVar2 = dVarF;
                    afc.c(bVar4, xkbVar6, j6, 0L, fI, fI2, null, ko1.e(-1573998995, true, new a(f8, j11, function2), dVarF, 54), dVar2, ((i16 >> 12) & 896) | 12582912 | (57344 & i24) | (i24 & 458752), 72);
                    if (e.k()) {
                        e.n();
                    }
                    bVar3 = bVar2;
                    xkbVar5 = xkbVar3;
                    f7 = fI;
                    f5 = fI2;
                    j4 = j11;
                    xkbVar4 = xkbVarB;
                    j5 = j6;
                    f6 = f12;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    f5 = f4;
                    bVar3 = bVar2;
                    xkbVar4 = xkbVarB;
                    xkbVar5 = xkbVar3;
                    f6 = fD;
                    j4 = j2;
                    j5 = j3;
                    f7 = f3;
                }
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.x9d
                        public final Object invoke(Object obj, Object obj2) {
                            return TooltipKt.h(aadVar, bVar3, xkbVar5, f6, xkbVar4, j4, j5, f7, f5, function2, i2, i3, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i4 |= 384;
            xkbVar3 = xkbVar;
            i7 = i3 & 4;
            if (i7 != 0) {
                if ((i2 & 3072) == 0) {
                    fD = f2;
                    if (dVarF.B(fD)) {
                        i8 = 2048;
                    } else {
                        i8 = 1024;
                    }
                    i4 |= i8;
                }
                if ((i2 & 24576) == 0) {
                    if ((i3 & 8) == 0) {
                        xkbVarB = xkbVar2;
                        if (dVarF.x(xkbVarB)) {
                        }
                        i4 |= i19;
                    } else {
                        xkbVarB = xkbVar2;
                    }
                    i4 |= i19;
                } else {
                    xkbVarB = xkbVar2;
                }
                if ((i2 & 196608) == 0) {
                    if ((i3 & 16) == 0) {
                        i9 = i18;
                        if (dVarF.D(j2)) {
                        }
                        i4 |= i20;
                    } else {
                        i9 = i18;
                    }
                    i4 |= i20;
                } else {
                    i9 = i18;
                }
                if ((i2 & 1572864) != 0) {
                    if ((i3 & 32) == 0) {
                        i17 = 524288;
                    } else {
                        i17 = 524288;
                    }
                    i4 |= i17;
                }
                i10 = i3 & 64;
                if (i10 != 0) {
                    i4 |= 12582912;
                } else if ((i2 & 12582912) == 0) {
                    if (dVarF.B(f3)) {
                        i11 = 8388608;
                    } else {
                        i11 = 4194304;
                    }
                    i4 |= i11;
                }
                i12 = i3 & 128;
                if (i12 != 0) {
                    if ((i2 & 100663296) == 0) {
                        if (dVarF.B(f4)) {
                            i13 = 67108864;
                        } else {
                            i13 = 33554432;
                        }
                        i4 |= i13;
                    }
                    if ((i3 & 256) != 0) {
                        i4 |= 805306368;
                    } else if ((i2 & 805306368) == 0) {
                        if (dVarF.T(function2)) {
                            i14 = 536870912;
                        } else {
                            i14 = 268435456;
                        }
                        i4 |= i14;
                    }
                    i15 = i4;
                    if ((306783379 & i4) != 306783378) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (dVarF.g(z, i15 & 1)) {
                        dVarF.U();
                        if ((i2 & 1) != 0) {
                            if (i9 != 0) {
                                bVar2 = androidx.compose.ui.b.INSTANCE;
                            }
                            if (i5 != 0) {
                                xkbVar3 = null;
                            }
                            if (i7 != 0) {
                                fD = s2.a.d();
                            }
                            if ((i3 & 8) != 0) {
                                i15 &= -57345;
                                xkbVarB = s2.a.b(dVarF, 6);
                            }
                            if ((i3 & 16) != 0) {
                                jC = s2.a.c(dVarF, 6);
                                i15 &= -458753;
                            } else {
                                jC = j2;
                            }
                            if ((i3 & 32) != 0) {
                                jA = s2.a.a(dVarF, 6);
                                i15 &= -3670017;
                            } else {
                                jA = j3;
                            }
                            if (i10 != 0) {
                                fI = ff3.i(0);
                            } else {
                                fI = f3;
                            }
                            if (i12 != 0) {
                                fI2 = ff3.i(0);
                            } else {
                                fI2 = f4;
                            }
                            f8 = fD;
                            i16 = i15;
                            j6 = jA;
                            j7 = jC;
                        } else {
                            if (i9 != 0) {
                                bVar2 = androidx.compose.ui.b.INSTANCE;
                            }
                            if (i5 != 0) {
                                xkbVar3 = null;
                            }
                            if (i7 != 0) {
                                fD = s2.a.d();
                            }
                            if ((i3 & 8) != 0) {
                                i15 &= -57345;
                                xkbVarB = s2.a.b(dVarF, 6);
                            }
                            if ((i3 & 16) != 0) {
                                jC = s2.a.c(dVarF, 6);
                                i15 &= -458753;
                            } else {
                                jC = j2;
                            }
                            if ((i3 & 32) != 0) {
                                jA = s2.a.a(dVarF, 6);
                                i15 &= -3670017;
                            } else {
                                jA = j3;
                            }
                            if (i10 != 0) {
                                fI = ff3.i(0);
                            } else {
                                fI = f3;
                            }
                            if (i12 != 0) {
                                fI2 = ff3.i(0);
                            } else {
                                fI2 = f4;
                            }
                            f8 = fD;
                            i16 = i15;
                            j6 = jA;
                            j7 = jC;
                        }
                        dVarF.M();
                        if (e.k()) {
                            e.o(-343758958, i16, -1, "androidx.compose.material3.PlainTooltip (Tooltip.kt:430)");
                        }
                        if (xkbVar3 != null) {
                            dVarF.y(-1720477287);
                            objR = dVarF.R();
                            companion = androidx.compose.p004runtime.d.INSTANCE;
                            if (objR == companion.a()) {
                                objR = s0.e(zh7.a(zh7.c(null, 1, null)), null, 2, null);
                                dVarF.L(objR);
                            }
                            o58Var = (o58) objR;
                            f43 f43Var5 = (f43) dVarF.v(CompositionLocalsKt.g());
                            long jA6 = ((a0) dVarF.v(CompositionLocalsKt.v())).a();
                            androidx.compose.ui.b.Companion companion6 = androidx.compose.ui.b.INSTANCE;
                            if ((i16 & 14) != 4) {
                                z2 = true;
                            } else {
                                z2 = true;
                            }
                            objR2 = dVarF.R();
                            if (z2) {
                                objR2 = new Function1() { // from class: com.google.android.w9d
                                    public final Object invoke(Object obj) {
                                        return TooltipKt.i(aadVar, (androidx.compose.ui.layout.j) obj);
                                    }
                                };
                                dVarF.L(objR2);
                            } else {
                                objR2 = new Function1() { // from class: com.google.android.w9d
                                    public final Object invoke(Object obj) {
                                        return TooltipKt.i(aadVar, (androidx.compose.ui.layout.j) obj);
                                    }
                                };
                                dVarF.L(objR2);
                            }
                            androidx.compose.ui.b bVarThen5 = s(companion6, o58Var, f43Var5, jA6, (Function1) objR2, aadVar.getPositionProvider()).then(bVar2);
                            if (((57344 & i16) ^ 24576) <= 16384) {
                            }
                            if ((i16 & 896) == 256) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            z4 = z5 | z3;
                            objR3 = dVarF.R();
                            if (z4) {
                                objR3 = new r2(o58Var, xkbVarB, xkbVar3);
                                dVarF.L(objR3);
                            } else {
                                objR3 = new r2(o58Var, xkbVarB, xkbVar3);
                                dVarF.L(objR3);
                            }
                            dVarF.u();
                            bVar4 = bVarThen5;
                            xkbVar6 = (r2) objR3;
                        } else {
                            dVarF.y(-1719831991);
                            dVarF.u();
                            bVar4 = bVar2;
                            xkbVar6 = xkbVarB;
                        }
                        long j12 = j7;
                        float f13 = f8;
                        int i25 = i16 >> 9;
                        dVar2 = dVarF;
                        afc.c(bVar4, xkbVar6, j6, 0L, fI, fI2, null, ko1.e(-1573998995, true, new a(f8, j12, function2), dVarF, 54), dVar2, ((i16 >> 12) & 896) | 12582912 | (57344 & i25) | (i25 & 458752), 72);
                        if (e.k()) {
                            e.n();
                        }
                        bVar3 = bVar2;
                        xkbVar5 = xkbVar3;
                        f7 = fI;
                        f5 = fI2;
                        j4 = j12;
                        xkbVar4 = xkbVarB;
                        j5 = j6;
                        f6 = f13;
                    } else {
                        dVar2 = dVarF;
                        dVar2.q();
                        f5 = f4;
                        bVar3 = bVar2;
                        xkbVar4 = xkbVarB;
                        xkbVar5 = xkbVar3;
                        f6 = fD;
                        j4 = j2;
                        j5 = j3;
                        f7 = f3;
                    }
                    s6bVarH = dVar2.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.x9d
                            public final Object invoke(Object obj, Object obj2) {
                                return TooltipKt.h(aadVar, bVar3, xkbVar5, f6, xkbVar4, j4, j5, f7, f5, function2, i2, i3, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i4 |= 100663296;
                if ((i3 & 256) != 0) {
                    i4 |= 805306368;
                } else if ((i2 & 805306368) == 0) {
                    if (dVarF.T(function2)) {
                        i14 = 536870912;
                    } else {
                        i14 = 268435456;
                    }
                    i4 |= i14;
                }
                i15 = i4;
                if ((306783379 & i4) != 306783378) {
                    z = true;
                } else {
                    z = false;
                }
                if (dVarF.g(z, i15 & 1)) {
                    dVarF.U();
                    if ((i2 & 1) != 0) {
                        if (i9 != 0) {
                            bVar2 = androidx.compose.ui.b.INSTANCE;
                        }
                        if (i5 != 0) {
                            xkbVar3 = null;
                        }
                        if (i7 != 0) {
                            fD = s2.a.d();
                        }
                        if ((i3 & 8) != 0) {
                            i15 &= -57345;
                            xkbVarB = s2.a.b(dVarF, 6);
                        }
                        if ((i3 & 16) != 0) {
                            jC = s2.a.c(dVarF, 6);
                            i15 &= -458753;
                        } else {
                            jC = j2;
                        }
                        if ((i3 & 32) != 0) {
                            jA = s2.a.a(dVarF, 6);
                            i15 &= -3670017;
                        } else {
                            jA = j3;
                        }
                        if (i10 != 0) {
                            fI = ff3.i(0);
                        } else {
                            fI = f3;
                        }
                        if (i12 != 0) {
                            fI2 = ff3.i(0);
                        } else {
                            fI2 = f4;
                        }
                        f8 = fD;
                        i16 = i15;
                        j6 = jA;
                        j7 = jC;
                    } else {
                        if (i9 != 0) {
                            bVar2 = androidx.compose.ui.b.INSTANCE;
                        }
                        if (i5 != 0) {
                            xkbVar3 = null;
                        }
                        if (i7 != 0) {
                            fD = s2.a.d();
                        }
                        if ((i3 & 8) != 0) {
                            i15 &= -57345;
                            xkbVarB = s2.a.b(dVarF, 6);
                        }
                        if ((i3 & 16) != 0) {
                            jC = s2.a.c(dVarF, 6);
                            i15 &= -458753;
                        } else {
                            jC = j2;
                        }
                        if ((i3 & 32) != 0) {
                            jA = s2.a.a(dVarF, 6);
                            i15 &= -3670017;
                        } else {
                            jA = j3;
                        }
                        if (i10 != 0) {
                            fI = ff3.i(0);
                        } else {
                            fI = f3;
                        }
                        if (i12 != 0) {
                            fI2 = ff3.i(0);
                        } else {
                            fI2 = f4;
                        }
                        f8 = fD;
                        i16 = i15;
                        j6 = jA;
                        j7 = jC;
                    }
                    dVarF.M();
                    if (e.k()) {
                        e.o(-343758958, i16, -1, "androidx.compose.material3.PlainTooltip (Tooltip.kt:430)");
                    }
                    if (xkbVar3 != null) {
                        dVarF.y(-1720477287);
                        objR = dVarF.R();
                        companion = androidx.compose.p004runtime.d.INSTANCE;
                        if (objR == companion.a()) {
                            objR = s0.e(zh7.a(zh7.c(null, 1, null)), null, 2, null);
                            dVarF.L(objR);
                        }
                        o58Var = (o58) objR;
                        f43 f43Var6 = (f43) dVarF.v(CompositionLocalsKt.g());
                        long jA7 = ((a0) dVarF.v(CompositionLocalsKt.v())).a();
                        androidx.compose.ui.b.Companion companion7 = androidx.compose.ui.b.INSTANCE;
                        if ((i16 & 14) != 4) {
                            z2 = true;
                        } else {
                            z2 = true;
                        }
                        objR2 = dVarF.R();
                        if (z2) {
                            objR2 = new Function1() { // from class: com.google.android.w9d
                                public final Object invoke(Object obj) {
                                    return TooltipKt.i(aadVar, (androidx.compose.ui.layout.j) obj);
                                }
                            };
                            dVarF.L(objR2);
                        } else {
                            objR2 = new Function1() { // from class: com.google.android.w9d
                                public final Object invoke(Object obj) {
                                    return TooltipKt.i(aadVar, (androidx.compose.ui.layout.j) obj);
                                }
                            };
                            dVarF.L(objR2);
                        }
                        androidx.compose.ui.b bVarThen6 = s(companion7, o58Var, f43Var6, jA7, (Function1) objR2, aadVar.getPositionProvider()).then(bVar2);
                        if (((57344 & i16) ^ 24576) <= 16384) {
                        }
                        if ((i16 & 896) == 256) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        z4 = z5 | z3;
                        objR3 = dVarF.R();
                        if (z4) {
                            objR3 = new r2(o58Var, xkbVarB, xkbVar3);
                            dVarF.L(objR3);
                        } else {
                            objR3 = new r2(o58Var, xkbVarB, xkbVar3);
                            dVarF.L(objR3);
                        }
                        dVarF.u();
                        bVar4 = bVarThen6;
                        xkbVar6 = (r2) objR3;
                    } else {
                        dVarF.y(-1719831991);
                        dVarF.u();
                        bVar4 = bVar2;
                        xkbVar6 = xkbVarB;
                    }
                    long j13 = j7;
                    float f14 = f8;
                    int i26 = i16 >> 9;
                    dVar2 = dVarF;
                    afc.c(bVar4, xkbVar6, j6, 0L, fI, fI2, null, ko1.e(-1573998995, true, new a(f8, j13, function2), dVarF, 54), dVar2, ((i16 >> 12) & 896) | 12582912 | (57344 & i26) | (i26 & 458752), 72);
                    if (e.k()) {
                        e.n();
                    }
                    bVar3 = bVar2;
                    xkbVar5 = xkbVar3;
                    f7 = fI;
                    f5 = fI2;
                    j4 = j13;
                    xkbVar4 = xkbVarB;
                    j5 = j6;
                    f6 = f14;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    f5 = f4;
                    bVar3 = bVar2;
                    xkbVar4 = xkbVarB;
                    xkbVar5 = xkbVar3;
                    f6 = fD;
                    j4 = j2;
                    j5 = j3;
                    f7 = f3;
                }
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.x9d
                        public final Object invoke(Object obj, Object obj2) {
                            return TooltipKt.h(aadVar, bVar3, xkbVar5, f6, xkbVar4, j4, j5, f7, f5, function2, i2, i3, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i4 |= 3072;
            fD = f2;
            if ((i2 & 24576) == 0) {
                if ((i3 & 8) == 0) {
                    xkbVarB = xkbVar2;
                    if (dVarF.x(xkbVarB)) {
                    }
                    i4 |= i19;
                } else {
                    xkbVarB = xkbVar2;
                }
                i4 |= i19;
            } else {
                xkbVarB = xkbVar2;
            }
            if ((i2 & 196608) == 0) {
                if ((i3 & 16) == 0) {
                    i9 = i18;
                    if (dVarF.D(j2)) {
                    }
                    i4 |= i20;
                } else {
                    i9 = i18;
                }
                i4 |= i20;
            } else {
                i9 = i18;
            }
            if ((i2 & 1572864) != 0) {
                if ((i3 & 32) == 0) {
                    i17 = 524288;
                } else {
                    i17 = 524288;
                }
                i4 |= i17;
            }
            i10 = i3 & 64;
            if (i10 != 0) {
                i4 |= 12582912;
            } else if ((i2 & 12582912) == 0) {
                if (dVarF.B(f3)) {
                    i11 = 8388608;
                } else {
                    i11 = 4194304;
                }
                i4 |= i11;
            }
            i12 = i3 & 128;
            if (i12 != 0) {
                if ((i2 & 100663296) == 0) {
                    if (dVarF.B(f4)) {
                        i13 = 67108864;
                    } else {
                        i13 = 33554432;
                    }
                    i4 |= i13;
                }
                if ((i3 & 256) != 0) {
                    i4 |= 805306368;
                } else if ((i2 & 805306368) == 0) {
                    if (dVarF.T(function2)) {
                        i14 = 536870912;
                    } else {
                        i14 = 268435456;
                    }
                    i4 |= i14;
                }
                i15 = i4;
                if ((306783379 & i4) != 306783378) {
                    z = true;
                } else {
                    z = false;
                }
                if (dVarF.g(z, i15 & 1)) {
                    dVarF.U();
                    if ((i2 & 1) != 0) {
                        if (i9 != 0) {
                            bVar2 = androidx.compose.ui.b.INSTANCE;
                        }
                        if (i5 != 0) {
                            xkbVar3 = null;
                        }
                        if (i7 != 0) {
                            fD = s2.a.d();
                        }
                        if ((i3 & 8) != 0) {
                            i15 &= -57345;
                            xkbVarB = s2.a.b(dVarF, 6);
                        }
                        if ((i3 & 16) != 0) {
                            jC = s2.a.c(dVarF, 6);
                            i15 &= -458753;
                        } else {
                            jC = j2;
                        }
                        if ((i3 & 32) != 0) {
                            jA = s2.a.a(dVarF, 6);
                            i15 &= -3670017;
                        } else {
                            jA = j3;
                        }
                        if (i10 != 0) {
                            fI = ff3.i(0);
                        } else {
                            fI = f3;
                        }
                        if (i12 != 0) {
                            fI2 = ff3.i(0);
                        } else {
                            fI2 = f4;
                        }
                        f8 = fD;
                        i16 = i15;
                        j6 = jA;
                        j7 = jC;
                    } else {
                        if (i9 != 0) {
                            bVar2 = androidx.compose.ui.b.INSTANCE;
                        }
                        if (i5 != 0) {
                            xkbVar3 = null;
                        }
                        if (i7 != 0) {
                            fD = s2.a.d();
                        }
                        if ((i3 & 8) != 0) {
                            i15 &= -57345;
                            xkbVarB = s2.a.b(dVarF, 6);
                        }
                        if ((i3 & 16) != 0) {
                            jC = s2.a.c(dVarF, 6);
                            i15 &= -458753;
                        } else {
                            jC = j2;
                        }
                        if ((i3 & 32) != 0) {
                            jA = s2.a.a(dVarF, 6);
                            i15 &= -3670017;
                        } else {
                            jA = j3;
                        }
                        if (i10 != 0) {
                            fI = ff3.i(0);
                        } else {
                            fI = f3;
                        }
                        if (i12 != 0) {
                            fI2 = ff3.i(0);
                        } else {
                            fI2 = f4;
                        }
                        f8 = fD;
                        i16 = i15;
                        j6 = jA;
                        j7 = jC;
                    }
                    dVarF.M();
                    if (e.k()) {
                        e.o(-343758958, i16, -1, "androidx.compose.material3.PlainTooltip (Tooltip.kt:430)");
                    }
                    if (xkbVar3 != null) {
                        dVarF.y(-1720477287);
                        objR = dVarF.R();
                        companion = androidx.compose.p004runtime.d.INSTANCE;
                        if (objR == companion.a()) {
                            objR = s0.e(zh7.a(zh7.c(null, 1, null)), null, 2, null);
                            dVarF.L(objR);
                        }
                        o58Var = (o58) objR;
                        f43 f43Var7 = (f43) dVarF.v(CompositionLocalsKt.g());
                        long jA8 = ((a0) dVarF.v(CompositionLocalsKt.v())).a();
                        androidx.compose.ui.b.Companion companion8 = androidx.compose.ui.b.INSTANCE;
                        if ((i16 & 14) != 4) {
                            z2 = true;
                        } else {
                            z2 = true;
                        }
                        objR2 = dVarF.R();
                        if (z2) {
                            objR2 = new Function1() { // from class: com.google.android.w9d
                                public final Object invoke(Object obj) {
                                    return TooltipKt.i(aadVar, (androidx.compose.ui.layout.j) obj);
                                }
                            };
                            dVarF.L(objR2);
                        } else {
                            objR2 = new Function1() { // from class: com.google.android.w9d
                                public final Object invoke(Object obj) {
                                    return TooltipKt.i(aadVar, (androidx.compose.ui.layout.j) obj);
                                }
                            };
                            dVarF.L(objR2);
                        }
                        androidx.compose.ui.b bVarThen7 = s(companion8, o58Var, f43Var7, jA8, (Function1) objR2, aadVar.getPositionProvider()).then(bVar2);
                        if (((57344 & i16) ^ 24576) <= 16384) {
                        }
                        if ((i16 & 896) == 256) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        z4 = z5 | z3;
                        objR3 = dVarF.R();
                        if (z4) {
                            objR3 = new r2(o58Var, xkbVarB, xkbVar3);
                            dVarF.L(objR3);
                        } else {
                            objR3 = new r2(o58Var, xkbVarB, xkbVar3);
                            dVarF.L(objR3);
                        }
                        dVarF.u();
                        bVar4 = bVarThen7;
                        xkbVar6 = (r2) objR3;
                    } else {
                        dVarF.y(-1719831991);
                        dVarF.u();
                        bVar4 = bVar2;
                        xkbVar6 = xkbVarB;
                    }
                    long j14 = j7;
                    float f15 = f8;
                    int i27 = i16 >> 9;
                    dVar2 = dVarF;
                    afc.c(bVar4, xkbVar6, j6, 0L, fI, fI2, null, ko1.e(-1573998995, true, new a(f8, j14, function2), dVarF, 54), dVar2, ((i16 >> 12) & 896) | 12582912 | (57344 & i27) | (i27 & 458752), 72);
                    if (e.k()) {
                        e.n();
                    }
                    bVar3 = bVar2;
                    xkbVar5 = xkbVar3;
                    f7 = fI;
                    f5 = fI2;
                    j4 = j14;
                    xkbVar4 = xkbVarB;
                    j5 = j6;
                    f6 = f15;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    f5 = f4;
                    bVar3 = bVar2;
                    xkbVar4 = xkbVarB;
                    xkbVar5 = xkbVar3;
                    f6 = fD;
                    j4 = j2;
                    j5 = j3;
                    f7 = f3;
                }
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.x9d
                        public final Object invoke(Object obj, Object obj2) {
                            return TooltipKt.h(aadVar, bVar3, xkbVar5, f6, xkbVar4, j4, j5, f7, f5, function2, i2, i3, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i4 |= 100663296;
            if ((i3 & 256) != 0) {
                i4 |= 805306368;
            } else if ((i2 & 805306368) == 0) {
                if (dVarF.T(function2)) {
                    i14 = 536870912;
                } else {
                    i14 = 268435456;
                }
                i4 |= i14;
            }
            i15 = i4;
            if ((306783379 & i4) != 306783378) {
                z = true;
            } else {
                z = false;
            }
            if (dVarF.g(z, i15 & 1)) {
                dVarF.U();
                if ((i2 & 1) != 0) {
                    if (i9 != 0) {
                        bVar2 = androidx.compose.ui.b.INSTANCE;
                    }
                    if (i5 != 0) {
                        xkbVar3 = null;
                    }
                    if (i7 != 0) {
                        fD = s2.a.d();
                    }
                    if ((i3 & 8) != 0) {
                        i15 &= -57345;
                        xkbVarB = s2.a.b(dVarF, 6);
                    }
                    if ((i3 & 16) != 0) {
                        jC = s2.a.c(dVarF, 6);
                        i15 &= -458753;
                    } else {
                        jC = j2;
                    }
                    if ((i3 & 32) != 0) {
                        jA = s2.a.a(dVarF, 6);
                        i15 &= -3670017;
                    } else {
                        jA = j3;
                    }
                    if (i10 != 0) {
                        fI = ff3.i(0);
                    } else {
                        fI = f3;
                    }
                    if (i12 != 0) {
                        fI2 = ff3.i(0);
                    } else {
                        fI2 = f4;
                    }
                    f8 = fD;
                    i16 = i15;
                    j6 = jA;
                    j7 = jC;
                } else {
                    if (i9 != 0) {
                        bVar2 = androidx.compose.ui.b.INSTANCE;
                    }
                    if (i5 != 0) {
                        xkbVar3 = null;
                    }
                    if (i7 != 0) {
                        fD = s2.a.d();
                    }
                    if ((i3 & 8) != 0) {
                        i15 &= -57345;
                        xkbVarB = s2.a.b(dVarF, 6);
                    }
                    if ((i3 & 16) != 0) {
                        jC = s2.a.c(dVarF, 6);
                        i15 &= -458753;
                    } else {
                        jC = j2;
                    }
                    if ((i3 & 32) != 0) {
                        jA = s2.a.a(dVarF, 6);
                        i15 &= -3670017;
                    } else {
                        jA = j3;
                    }
                    if (i10 != 0) {
                        fI = ff3.i(0);
                    } else {
                        fI = f3;
                    }
                    if (i12 != 0) {
                        fI2 = ff3.i(0);
                    } else {
                        fI2 = f4;
                    }
                    f8 = fD;
                    i16 = i15;
                    j6 = jA;
                    j7 = jC;
                }
                dVarF.M();
                if (e.k()) {
                    e.o(-343758958, i16, -1, "androidx.compose.material3.PlainTooltip (Tooltip.kt:430)");
                }
                if (xkbVar3 != null) {
                    dVarF.y(-1720477287);
                    objR = dVarF.R();
                    companion = androidx.compose.p004runtime.d.INSTANCE;
                    if (objR == companion.a()) {
                        objR = s0.e(zh7.a(zh7.c(null, 1, null)), null, 2, null);
                        dVarF.L(objR);
                    }
                    o58Var = (o58) objR;
                    f43 f43Var8 = (f43) dVarF.v(CompositionLocalsKt.g());
                    long jA9 = ((a0) dVarF.v(CompositionLocalsKt.v())).a();
                    androidx.compose.ui.b.Companion companion9 = androidx.compose.ui.b.INSTANCE;
                    if ((i16 & 14) != 4) {
                        z2 = true;
                    } else {
                        z2 = true;
                    }
                    objR2 = dVarF.R();
                    if (z2) {
                        objR2 = new Function1() { // from class: com.google.android.w9d
                            public final Object invoke(Object obj) {
                                return TooltipKt.i(aadVar, (androidx.compose.ui.layout.j) obj);
                            }
                        };
                        dVarF.L(objR2);
                    } else {
                        objR2 = new Function1() { // from class: com.google.android.w9d
                            public final Object invoke(Object obj) {
                                return TooltipKt.i(aadVar, (androidx.compose.ui.layout.j) obj);
                            }
                        };
                        dVarF.L(objR2);
                    }
                    androidx.compose.ui.b bVarThen8 = s(companion9, o58Var, f43Var8, jA9, (Function1) objR2, aadVar.getPositionProvider()).then(bVar2);
                    if (((57344 & i16) ^ 24576) <= 16384) {
                    }
                    if ((i16 & 896) == 256) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    z4 = z5 | z3;
                    objR3 = dVarF.R();
                    if (z4) {
                        objR3 = new r2(o58Var, xkbVarB, xkbVar3);
                        dVarF.L(objR3);
                    } else {
                        objR3 = new r2(o58Var, xkbVarB, xkbVar3);
                        dVarF.L(objR3);
                    }
                    dVarF.u();
                    bVar4 = bVarThen8;
                    xkbVar6 = (r2) objR3;
                } else {
                    dVarF.y(-1719831991);
                    dVarF.u();
                    bVar4 = bVar2;
                    xkbVar6 = xkbVarB;
                }
                long j15 = j7;
                float f16 = f8;
                int i28 = i16 >> 9;
                dVar2 = dVarF;
                afc.c(bVar4, xkbVar6, j6, 0L, fI, fI2, null, ko1.e(-1573998995, true, new a(f8, j15, function2), dVarF, 54), dVar2, ((i16 >> 12) & 896) | 12582912 | (57344 & i28) | (i28 & 458752), 72);
                if (e.k()) {
                    e.n();
                }
                bVar3 = bVar2;
                xkbVar5 = xkbVar3;
                f7 = fI;
                f5 = fI2;
                j4 = j15;
                xkbVar4 = xkbVarB;
                j5 = j6;
                f6 = f16;
            } else {
                dVar2 = dVarF;
                dVar2.q();
                f5 = f4;
                bVar3 = bVar2;
                xkbVar4 = xkbVarB;
                xkbVar5 = xkbVar3;
                f6 = fD;
                j4 = j2;
                j5 = j3;
                f7 = f3;
            }
            s6bVarH = dVar2.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.x9d
                    public final Object invoke(Object obj, Object obj2) {
                        return TooltipKt.h(aadVar, bVar3, xkbVar5, f6, xkbVar4, j4, j5, f7, f5, function2, i2, i3, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i4 |= 48;
        bVar2 = bVar;
        i5 = i3 & 2;
        if (i5 != 0) {
            if ((i2 & 384) == 0) {
                xkbVar3 = xkbVar;
                if (dVarF.x(xkbVar3)) {
                    i6 = 256;
                } else {
                    i6 = 128;
                }
                i4 |= i6;
            }
            i7 = i3 & 4;
            if (i7 != 0) {
                if ((i2 & 3072) == 0) {
                    fD = f2;
                    if (dVarF.B(fD)) {
                        i8 = 2048;
                    } else {
                        i8 = 1024;
                    }
                    i4 |= i8;
                }
                if ((i2 & 24576) == 0) {
                    if ((i3 & 8) == 0) {
                        xkbVarB = xkbVar2;
                        if (dVarF.x(xkbVarB)) {
                        }
                        i4 |= i19;
                    } else {
                        xkbVarB = xkbVar2;
                    }
                    i4 |= i19;
                } else {
                    xkbVarB = xkbVar2;
                }
                if ((i2 & 196608) == 0) {
                    if ((i3 & 16) == 0) {
                        i9 = i18;
                        if (dVarF.D(j2)) {
                        }
                        i4 |= i20;
                    } else {
                        i9 = i18;
                    }
                    i4 |= i20;
                } else {
                    i9 = i18;
                }
                if ((i2 & 1572864) != 0) {
                    if ((i3 & 32) == 0) {
                        i17 = 524288;
                    } else {
                        i17 = 524288;
                    }
                    i4 |= i17;
                }
                i10 = i3 & 64;
                if (i10 != 0) {
                    i4 |= 12582912;
                } else if ((i2 & 12582912) == 0) {
                    if (dVarF.B(f3)) {
                        i11 = 8388608;
                    } else {
                        i11 = 4194304;
                    }
                    i4 |= i11;
                }
                i12 = i3 & 128;
                if (i12 != 0) {
                    if ((i2 & 100663296) == 0) {
                        if (dVarF.B(f4)) {
                            i13 = 67108864;
                        } else {
                            i13 = 33554432;
                        }
                        i4 |= i13;
                    }
                    if ((i3 & 256) != 0) {
                        i4 |= 805306368;
                    } else if ((i2 & 805306368) == 0) {
                        if (dVarF.T(function2)) {
                            i14 = 536870912;
                        } else {
                            i14 = 268435456;
                        }
                        i4 |= i14;
                    }
                    i15 = i4;
                    if ((306783379 & i4) != 306783378) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (dVarF.g(z, i15 & 1)) {
                        dVarF.U();
                        if ((i2 & 1) != 0) {
                            if (i9 != 0) {
                                bVar2 = androidx.compose.ui.b.INSTANCE;
                            }
                            if (i5 != 0) {
                                xkbVar3 = null;
                            }
                            if (i7 != 0) {
                                fD = s2.a.d();
                            }
                            if ((i3 & 8) != 0) {
                                i15 &= -57345;
                                xkbVarB = s2.a.b(dVarF, 6);
                            }
                            if ((i3 & 16) != 0) {
                                jC = s2.a.c(dVarF, 6);
                                i15 &= -458753;
                            } else {
                                jC = j2;
                            }
                            if ((i3 & 32) != 0) {
                                jA = s2.a.a(dVarF, 6);
                                i15 &= -3670017;
                            } else {
                                jA = j3;
                            }
                            if (i10 != 0) {
                                fI = ff3.i(0);
                            } else {
                                fI = f3;
                            }
                            if (i12 != 0) {
                                fI2 = ff3.i(0);
                            } else {
                                fI2 = f4;
                            }
                            f8 = fD;
                            i16 = i15;
                            j6 = jA;
                            j7 = jC;
                        } else {
                            if (i9 != 0) {
                                bVar2 = androidx.compose.ui.b.INSTANCE;
                            }
                            if (i5 != 0) {
                                xkbVar3 = null;
                            }
                            if (i7 != 0) {
                                fD = s2.a.d();
                            }
                            if ((i3 & 8) != 0) {
                                i15 &= -57345;
                                xkbVarB = s2.a.b(dVarF, 6);
                            }
                            if ((i3 & 16) != 0) {
                                jC = s2.a.c(dVarF, 6);
                                i15 &= -458753;
                            } else {
                                jC = j2;
                            }
                            if ((i3 & 32) != 0) {
                                jA = s2.a.a(dVarF, 6);
                                i15 &= -3670017;
                            } else {
                                jA = j3;
                            }
                            if (i10 != 0) {
                                fI = ff3.i(0);
                            } else {
                                fI = f3;
                            }
                            if (i12 != 0) {
                                fI2 = ff3.i(0);
                            } else {
                                fI2 = f4;
                            }
                            f8 = fD;
                            i16 = i15;
                            j6 = jA;
                            j7 = jC;
                        }
                        dVarF.M();
                        if (e.k()) {
                            e.o(-343758958, i16, -1, "androidx.compose.material3.PlainTooltip (Tooltip.kt:430)");
                        }
                        if (xkbVar3 != null) {
                            dVarF.y(-1720477287);
                            objR = dVarF.R();
                            companion = androidx.compose.p004runtime.d.INSTANCE;
                            if (objR == companion.a()) {
                                objR = s0.e(zh7.a(zh7.c(null, 1, null)), null, 2, null);
                                dVarF.L(objR);
                            }
                            o58Var = (o58) objR;
                            f43 f43Var9 = (f43) dVarF.v(CompositionLocalsKt.g());
                            long jA10 = ((a0) dVarF.v(CompositionLocalsKt.v())).a();
                            androidx.compose.ui.b.Companion companion10 = androidx.compose.ui.b.INSTANCE;
                            if ((i16 & 14) != 4) {
                                z2 = true;
                            } else {
                                z2 = true;
                            }
                            objR2 = dVarF.R();
                            if (z2) {
                                objR2 = new Function1() { // from class: com.google.android.w9d
                                    public final Object invoke(Object obj) {
                                        return TooltipKt.i(aadVar, (androidx.compose.ui.layout.j) obj);
                                    }
                                };
                                dVarF.L(objR2);
                            } else {
                                objR2 = new Function1() { // from class: com.google.android.w9d
                                    public final Object invoke(Object obj) {
                                        return TooltipKt.i(aadVar, (androidx.compose.ui.layout.j) obj);
                                    }
                                };
                                dVarF.L(objR2);
                            }
                            androidx.compose.ui.b bVarThen9 = s(companion10, o58Var, f43Var9, jA10, (Function1) objR2, aadVar.getPositionProvider()).then(bVar2);
                            if (((57344 & i16) ^ 24576) <= 16384) {
                            }
                            if ((i16 & 896) == 256) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            z4 = z5 | z3;
                            objR3 = dVarF.R();
                            if (z4) {
                                objR3 = new r2(o58Var, xkbVarB, xkbVar3);
                                dVarF.L(objR3);
                            } else {
                                objR3 = new r2(o58Var, xkbVarB, xkbVar3);
                                dVarF.L(objR3);
                            }
                            dVarF.u();
                            bVar4 = bVarThen9;
                            xkbVar6 = (r2) objR3;
                        } else {
                            dVarF.y(-1719831991);
                            dVarF.u();
                            bVar4 = bVar2;
                            xkbVar6 = xkbVarB;
                        }
                        long j16 = j7;
                        float f17 = f8;
                        int i29 = i16 >> 9;
                        dVar2 = dVarF;
                        afc.c(bVar4, xkbVar6, j6, 0L, fI, fI2, null, ko1.e(-1573998995, true, new a(f8, j16, function2), dVarF, 54), dVar2, ((i16 >> 12) & 896) | 12582912 | (57344 & i29) | (i29 & 458752), 72);
                        if (e.k()) {
                            e.n();
                        }
                        bVar3 = bVar2;
                        xkbVar5 = xkbVar3;
                        f7 = fI;
                        f5 = fI2;
                        j4 = j16;
                        xkbVar4 = xkbVarB;
                        j5 = j6;
                        f6 = f17;
                    } else {
                        dVar2 = dVarF;
                        dVar2.q();
                        f5 = f4;
                        bVar3 = bVar2;
                        xkbVar4 = xkbVarB;
                        xkbVar5 = xkbVar3;
                        f6 = fD;
                        j4 = j2;
                        j5 = j3;
                        f7 = f3;
                    }
                    s6bVarH = dVar2.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.x9d
                            public final Object invoke(Object obj, Object obj2) {
                                return TooltipKt.h(aadVar, bVar3, xkbVar5, f6, xkbVar4, j4, j5, f7, f5, function2, i2, i3, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i4 |= 100663296;
                if ((i3 & 256) != 0) {
                    i4 |= 805306368;
                } else if ((i2 & 805306368) == 0) {
                    if (dVarF.T(function2)) {
                        i14 = 536870912;
                    } else {
                        i14 = 268435456;
                    }
                    i4 |= i14;
                }
                i15 = i4;
                if ((306783379 & i4) != 306783378) {
                    z = true;
                } else {
                    z = false;
                }
                if (dVarF.g(z, i15 & 1)) {
                    dVarF.U();
                    if ((i2 & 1) != 0) {
                        if (i9 != 0) {
                            bVar2 = androidx.compose.ui.b.INSTANCE;
                        }
                        if (i5 != 0) {
                            xkbVar3 = null;
                        }
                        if (i7 != 0) {
                            fD = s2.a.d();
                        }
                        if ((i3 & 8) != 0) {
                            i15 &= -57345;
                            xkbVarB = s2.a.b(dVarF, 6);
                        }
                        if ((i3 & 16) != 0) {
                            jC = s2.a.c(dVarF, 6);
                            i15 &= -458753;
                        } else {
                            jC = j2;
                        }
                        if ((i3 & 32) != 0) {
                            jA = s2.a.a(dVarF, 6);
                            i15 &= -3670017;
                        } else {
                            jA = j3;
                        }
                        if (i10 != 0) {
                            fI = ff3.i(0);
                        } else {
                            fI = f3;
                        }
                        if (i12 != 0) {
                            fI2 = ff3.i(0);
                        } else {
                            fI2 = f4;
                        }
                        f8 = fD;
                        i16 = i15;
                        j6 = jA;
                        j7 = jC;
                    } else {
                        if (i9 != 0) {
                            bVar2 = androidx.compose.ui.b.INSTANCE;
                        }
                        if (i5 != 0) {
                            xkbVar3 = null;
                        }
                        if (i7 != 0) {
                            fD = s2.a.d();
                        }
                        if ((i3 & 8) != 0) {
                            i15 &= -57345;
                            xkbVarB = s2.a.b(dVarF, 6);
                        }
                        if ((i3 & 16) != 0) {
                            jC = s2.a.c(dVarF, 6);
                            i15 &= -458753;
                        } else {
                            jC = j2;
                        }
                        if ((i3 & 32) != 0) {
                            jA = s2.a.a(dVarF, 6);
                            i15 &= -3670017;
                        } else {
                            jA = j3;
                        }
                        if (i10 != 0) {
                            fI = ff3.i(0);
                        } else {
                            fI = f3;
                        }
                        if (i12 != 0) {
                            fI2 = ff3.i(0);
                        } else {
                            fI2 = f4;
                        }
                        f8 = fD;
                        i16 = i15;
                        j6 = jA;
                        j7 = jC;
                    }
                    dVarF.M();
                    if (e.k()) {
                        e.o(-343758958, i16, -1, "androidx.compose.material3.PlainTooltip (Tooltip.kt:430)");
                    }
                    if (xkbVar3 != null) {
                        dVarF.y(-1720477287);
                        objR = dVarF.R();
                        companion = androidx.compose.p004runtime.d.INSTANCE;
                        if (objR == companion.a()) {
                            objR = s0.e(zh7.a(zh7.c(null, 1, null)), null, 2, null);
                            dVarF.L(objR);
                        }
                        o58Var = (o58) objR;
                        f43 f43Var10 = (f43) dVarF.v(CompositionLocalsKt.g());
                        long jA11 = ((a0) dVarF.v(CompositionLocalsKt.v())).a();
                        androidx.compose.ui.b.Companion companion11 = androidx.compose.ui.b.INSTANCE;
                        if ((i16 & 14) != 4) {
                            z2 = true;
                        } else {
                            z2 = true;
                        }
                        objR2 = dVarF.R();
                        if (z2) {
                            objR2 = new Function1() { // from class: com.google.android.w9d
                                public final Object invoke(Object obj) {
                                    return TooltipKt.i(aadVar, (androidx.compose.ui.layout.j) obj);
                                }
                            };
                            dVarF.L(objR2);
                        } else {
                            objR2 = new Function1() { // from class: com.google.android.w9d
                                public final Object invoke(Object obj) {
                                    return TooltipKt.i(aadVar, (androidx.compose.ui.layout.j) obj);
                                }
                            };
                            dVarF.L(objR2);
                        }
                        androidx.compose.ui.b bVarThen10 = s(companion11, o58Var, f43Var10, jA11, (Function1) objR2, aadVar.getPositionProvider()).then(bVar2);
                        if (((57344 & i16) ^ 24576) <= 16384) {
                        }
                        if ((i16 & 896) == 256) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        z4 = z5 | z3;
                        objR3 = dVarF.R();
                        if (z4) {
                            objR3 = new r2(o58Var, xkbVarB, xkbVar3);
                            dVarF.L(objR3);
                        } else {
                            objR3 = new r2(o58Var, xkbVarB, xkbVar3);
                            dVarF.L(objR3);
                        }
                        dVarF.u();
                        bVar4 = bVarThen10;
                        xkbVar6 = (r2) objR3;
                    } else {
                        dVarF.y(-1719831991);
                        dVarF.u();
                        bVar4 = bVar2;
                        xkbVar6 = xkbVarB;
                    }
                    long j17 = j7;
                    float f18 = f8;
                    int i210 = i16 >> 9;
                    dVar2 = dVarF;
                    afc.c(bVar4, xkbVar6, j6, 0L, fI, fI2, null, ko1.e(-1573998995, true, new a(f8, j17, function2), dVarF, 54), dVar2, ((i16 >> 12) & 896) | 12582912 | (57344 & i210) | (i210 & 458752), 72);
                    if (e.k()) {
                        e.n();
                    }
                    bVar3 = bVar2;
                    xkbVar5 = xkbVar3;
                    f7 = fI;
                    f5 = fI2;
                    j4 = j17;
                    xkbVar4 = xkbVarB;
                    j5 = j6;
                    f6 = f18;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    f5 = f4;
                    bVar3 = bVar2;
                    xkbVar4 = xkbVarB;
                    xkbVar5 = xkbVar3;
                    f6 = fD;
                    j4 = j2;
                    j5 = j3;
                    f7 = f3;
                }
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.x9d
                        public final Object invoke(Object obj, Object obj2) {
                            return TooltipKt.h(aadVar, bVar3, xkbVar5, f6, xkbVar4, j4, j5, f7, f5, function2, i2, i3, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i4 |= 3072;
            fD = f2;
            if ((i2 & 24576) == 0) {
                if ((i3 & 8) == 0) {
                    xkbVarB = xkbVar2;
                    if (dVarF.x(xkbVarB)) {
                    }
                    i4 |= i19;
                } else {
                    xkbVarB = xkbVar2;
                }
                i4 |= i19;
            } else {
                xkbVarB = xkbVar2;
            }
            if ((i2 & 196608) == 0) {
                if ((i3 & 16) == 0) {
                    i9 = i18;
                    if (dVarF.D(j2)) {
                    }
                    i4 |= i20;
                } else {
                    i9 = i18;
                }
                i4 |= i20;
            } else {
                i9 = i18;
            }
            if ((i2 & 1572864) != 0) {
                if ((i3 & 32) == 0) {
                    i17 = 524288;
                } else {
                    i17 = 524288;
                }
                i4 |= i17;
            }
            i10 = i3 & 64;
            if (i10 != 0) {
                i4 |= 12582912;
            } else if ((i2 & 12582912) == 0) {
                if (dVarF.B(f3)) {
                    i11 = 8388608;
                } else {
                    i11 = 4194304;
                }
                i4 |= i11;
            }
            i12 = i3 & 128;
            if (i12 != 0) {
                if ((i2 & 100663296) == 0) {
                    if (dVarF.B(f4)) {
                        i13 = 67108864;
                    } else {
                        i13 = 33554432;
                    }
                    i4 |= i13;
                }
                if ((i3 & 256) != 0) {
                    i4 |= 805306368;
                } else if ((i2 & 805306368) == 0) {
                    if (dVarF.T(function2)) {
                        i14 = 536870912;
                    } else {
                        i14 = 268435456;
                    }
                    i4 |= i14;
                }
                i15 = i4;
                if ((306783379 & i4) != 306783378) {
                    z = true;
                } else {
                    z = false;
                }
                if (dVarF.g(z, i15 & 1)) {
                    dVarF.U();
                    if ((i2 & 1) != 0) {
                        if (i9 != 0) {
                            bVar2 = androidx.compose.ui.b.INSTANCE;
                        }
                        if (i5 != 0) {
                            xkbVar3 = null;
                        }
                        if (i7 != 0) {
                            fD = s2.a.d();
                        }
                        if ((i3 & 8) != 0) {
                            i15 &= -57345;
                            xkbVarB = s2.a.b(dVarF, 6);
                        }
                        if ((i3 & 16) != 0) {
                            jC = s2.a.c(dVarF, 6);
                            i15 &= -458753;
                        } else {
                            jC = j2;
                        }
                        if ((i3 & 32) != 0) {
                            jA = s2.a.a(dVarF, 6);
                            i15 &= -3670017;
                        } else {
                            jA = j3;
                        }
                        if (i10 != 0) {
                            fI = ff3.i(0);
                        } else {
                            fI = f3;
                        }
                        if (i12 != 0) {
                            fI2 = ff3.i(0);
                        } else {
                            fI2 = f4;
                        }
                        f8 = fD;
                        i16 = i15;
                        j6 = jA;
                        j7 = jC;
                    } else {
                        if (i9 != 0) {
                            bVar2 = androidx.compose.ui.b.INSTANCE;
                        }
                        if (i5 != 0) {
                            xkbVar3 = null;
                        }
                        if (i7 != 0) {
                            fD = s2.a.d();
                        }
                        if ((i3 & 8) != 0) {
                            i15 &= -57345;
                            xkbVarB = s2.a.b(dVarF, 6);
                        }
                        if ((i3 & 16) != 0) {
                            jC = s2.a.c(dVarF, 6);
                            i15 &= -458753;
                        } else {
                            jC = j2;
                        }
                        if ((i3 & 32) != 0) {
                            jA = s2.a.a(dVarF, 6);
                            i15 &= -3670017;
                        } else {
                            jA = j3;
                        }
                        if (i10 != 0) {
                            fI = ff3.i(0);
                        } else {
                            fI = f3;
                        }
                        if (i12 != 0) {
                            fI2 = ff3.i(0);
                        } else {
                            fI2 = f4;
                        }
                        f8 = fD;
                        i16 = i15;
                        j6 = jA;
                        j7 = jC;
                    }
                    dVarF.M();
                    if (e.k()) {
                        e.o(-343758958, i16, -1, "androidx.compose.material3.PlainTooltip (Tooltip.kt:430)");
                    }
                    if (xkbVar3 != null) {
                        dVarF.y(-1720477287);
                        objR = dVarF.R();
                        companion = androidx.compose.p004runtime.d.INSTANCE;
                        if (objR == companion.a()) {
                            objR = s0.e(zh7.a(zh7.c(null, 1, null)), null, 2, null);
                            dVarF.L(objR);
                        }
                        o58Var = (o58) objR;
                        f43 f43Var11 = (f43) dVarF.v(CompositionLocalsKt.g());
                        long jA12 = ((a0) dVarF.v(CompositionLocalsKt.v())).a();
                        androidx.compose.ui.b.Companion companion12 = androidx.compose.ui.b.INSTANCE;
                        if ((i16 & 14) != 4) {
                            z2 = true;
                        } else {
                            z2 = true;
                        }
                        objR2 = dVarF.R();
                        if (z2) {
                            objR2 = new Function1() { // from class: com.google.android.w9d
                                public final Object invoke(Object obj) {
                                    return TooltipKt.i(aadVar, (androidx.compose.ui.layout.j) obj);
                                }
                            };
                            dVarF.L(objR2);
                        } else {
                            objR2 = new Function1() { // from class: com.google.android.w9d
                                public final Object invoke(Object obj) {
                                    return TooltipKt.i(aadVar, (androidx.compose.ui.layout.j) obj);
                                }
                            };
                            dVarF.L(objR2);
                        }
                        androidx.compose.ui.b bVarThen11 = s(companion12, o58Var, f43Var11, jA12, (Function1) objR2, aadVar.getPositionProvider()).then(bVar2);
                        if (((57344 & i16) ^ 24576) <= 16384) {
                        }
                        if ((i16 & 896) == 256) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        z4 = z5 | z3;
                        objR3 = dVarF.R();
                        if (z4) {
                            objR3 = new r2(o58Var, xkbVarB, xkbVar3);
                            dVarF.L(objR3);
                        } else {
                            objR3 = new r2(o58Var, xkbVarB, xkbVar3);
                            dVarF.L(objR3);
                        }
                        dVarF.u();
                        bVar4 = bVarThen11;
                        xkbVar6 = (r2) objR3;
                    } else {
                        dVarF.y(-1719831991);
                        dVarF.u();
                        bVar4 = bVar2;
                        xkbVar6 = xkbVarB;
                    }
                    long j18 = j7;
                    float f19 = f8;
                    int i211 = i16 >> 9;
                    dVar2 = dVarF;
                    afc.c(bVar4, xkbVar6, j6, 0L, fI, fI2, null, ko1.e(-1573998995, true, new a(f8, j18, function2), dVarF, 54), dVar2, ((i16 >> 12) & 896) | 12582912 | (57344 & i211) | (i211 & 458752), 72);
                    if (e.k()) {
                        e.n();
                    }
                    bVar3 = bVar2;
                    xkbVar5 = xkbVar3;
                    f7 = fI;
                    f5 = fI2;
                    j4 = j18;
                    xkbVar4 = xkbVarB;
                    j5 = j6;
                    f6 = f19;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    f5 = f4;
                    bVar3 = bVar2;
                    xkbVar4 = xkbVarB;
                    xkbVar5 = xkbVar3;
                    f6 = fD;
                    j4 = j2;
                    j5 = j3;
                    f7 = f3;
                }
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.x9d
                        public final Object invoke(Object obj, Object obj2) {
                            return TooltipKt.h(aadVar, bVar3, xkbVar5, f6, xkbVar4, j4, j5, f7, f5, function2, i2, i3, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i4 |= 100663296;
            if ((i3 & 256) != 0) {
                i4 |= 805306368;
            } else if ((i2 & 805306368) == 0) {
                if (dVarF.T(function2)) {
                    i14 = 536870912;
                } else {
                    i14 = 268435456;
                }
                i4 |= i14;
            }
            i15 = i4;
            if ((306783379 & i4) != 306783378) {
                z = true;
            } else {
                z = false;
            }
            if (dVarF.g(z, i15 & 1)) {
                dVarF.U();
                if ((i2 & 1) != 0) {
                    if (i9 != 0) {
                        bVar2 = androidx.compose.ui.b.INSTANCE;
                    }
                    if (i5 != 0) {
                        xkbVar3 = null;
                    }
                    if (i7 != 0) {
                        fD = s2.a.d();
                    }
                    if ((i3 & 8) != 0) {
                        i15 &= -57345;
                        xkbVarB = s2.a.b(dVarF, 6);
                    }
                    if ((i3 & 16) != 0) {
                        jC = s2.a.c(dVarF, 6);
                        i15 &= -458753;
                    } else {
                        jC = j2;
                    }
                    if ((i3 & 32) != 0) {
                        jA = s2.a.a(dVarF, 6);
                        i15 &= -3670017;
                    } else {
                        jA = j3;
                    }
                    if (i10 != 0) {
                        fI = ff3.i(0);
                    } else {
                        fI = f3;
                    }
                    if (i12 != 0) {
                        fI2 = ff3.i(0);
                    } else {
                        fI2 = f4;
                    }
                    f8 = fD;
                    i16 = i15;
                    j6 = jA;
                    j7 = jC;
                } else {
                    if (i9 != 0) {
                        bVar2 = androidx.compose.ui.b.INSTANCE;
                    }
                    if (i5 != 0) {
                        xkbVar3 = null;
                    }
                    if (i7 != 0) {
                        fD = s2.a.d();
                    }
                    if ((i3 & 8) != 0) {
                        i15 &= -57345;
                        xkbVarB = s2.a.b(dVarF, 6);
                    }
                    if ((i3 & 16) != 0) {
                        jC = s2.a.c(dVarF, 6);
                        i15 &= -458753;
                    } else {
                        jC = j2;
                    }
                    if ((i3 & 32) != 0) {
                        jA = s2.a.a(dVarF, 6);
                        i15 &= -3670017;
                    } else {
                        jA = j3;
                    }
                    if (i10 != 0) {
                        fI = ff3.i(0);
                    } else {
                        fI = f3;
                    }
                    if (i12 != 0) {
                        fI2 = ff3.i(0);
                    } else {
                        fI2 = f4;
                    }
                    f8 = fD;
                    i16 = i15;
                    j6 = jA;
                    j7 = jC;
                }
                dVarF.M();
                if (e.k()) {
                    e.o(-343758958, i16, -1, "androidx.compose.material3.PlainTooltip (Tooltip.kt:430)");
                }
                if (xkbVar3 != null) {
                    dVarF.y(-1720477287);
                    objR = dVarF.R();
                    companion = androidx.compose.p004runtime.d.INSTANCE;
                    if (objR == companion.a()) {
                        objR = s0.e(zh7.a(zh7.c(null, 1, null)), null, 2, null);
                        dVarF.L(objR);
                    }
                    o58Var = (o58) objR;
                    f43 f43Var12 = (f43) dVarF.v(CompositionLocalsKt.g());
                    long jA13 = ((a0) dVarF.v(CompositionLocalsKt.v())).a();
                    androidx.compose.ui.b.Companion companion13 = androidx.compose.ui.b.INSTANCE;
                    if ((i16 & 14) != 4) {
                        z2 = true;
                    } else {
                        z2 = true;
                    }
                    objR2 = dVarF.R();
                    if (z2) {
                        objR2 = new Function1() { // from class: com.google.android.w9d
                            public final Object invoke(Object obj) {
                                return TooltipKt.i(aadVar, (androidx.compose.ui.layout.j) obj);
                            }
                        };
                        dVarF.L(objR2);
                    } else {
                        objR2 = new Function1() { // from class: com.google.android.w9d
                            public final Object invoke(Object obj) {
                                return TooltipKt.i(aadVar, (androidx.compose.ui.layout.j) obj);
                            }
                        };
                        dVarF.L(objR2);
                    }
                    androidx.compose.ui.b bVarThen12 = s(companion13, o58Var, f43Var12, jA13, (Function1) objR2, aadVar.getPositionProvider()).then(bVar2);
                    if (((57344 & i16) ^ 24576) <= 16384) {
                    }
                    if ((i16 & 896) == 256) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    z4 = z5 | z3;
                    objR3 = dVarF.R();
                    if (z4) {
                        objR3 = new r2(o58Var, xkbVarB, xkbVar3);
                        dVarF.L(objR3);
                    } else {
                        objR3 = new r2(o58Var, xkbVarB, xkbVar3);
                        dVarF.L(objR3);
                    }
                    dVarF.u();
                    bVar4 = bVarThen12;
                    xkbVar6 = (r2) objR3;
                } else {
                    dVarF.y(-1719831991);
                    dVarF.u();
                    bVar4 = bVar2;
                    xkbVar6 = xkbVarB;
                }
                long j19 = j7;
                float f110 = f8;
                int i212 = i16 >> 9;
                dVar2 = dVarF;
                afc.c(bVar4, xkbVar6, j6, 0L, fI, fI2, null, ko1.e(-1573998995, true, new a(f8, j19, function2), dVarF, 54), dVar2, ((i16 >> 12) & 896) | 12582912 | (57344 & i212) | (i212 & 458752), 72);
                if (e.k()) {
                    e.n();
                }
                bVar3 = bVar2;
                xkbVar5 = xkbVar3;
                f7 = fI;
                f5 = fI2;
                j4 = j19;
                xkbVar4 = xkbVarB;
                j5 = j6;
                f6 = f110;
            } else {
                dVar2 = dVarF;
                dVar2.q();
                f5 = f4;
                bVar3 = bVar2;
                xkbVar4 = xkbVarB;
                xkbVar5 = xkbVar3;
                f6 = fD;
                j4 = j2;
                j5 = j3;
                f7 = f3;
            }
            s6bVarH = dVar2.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.x9d
                    public final Object invoke(Object obj, Object obj2) {
                        return TooltipKt.h(aadVar, bVar3, xkbVar5, f6, xkbVar4, j4, j5, f7, f5, function2, i2, i3, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i4 |= 384;
        xkbVar3 = xkbVar;
        i7 = i3 & 4;
        if (i7 != 0) {
            if ((i2 & 3072) == 0) {
                fD = f2;
                if (dVarF.B(fD)) {
                    i8 = 2048;
                } else {
                    i8 = 1024;
                }
                i4 |= i8;
            }
            if ((i2 & 24576) == 0) {
                if ((i3 & 8) == 0) {
                    xkbVarB = xkbVar2;
                    if (dVarF.x(xkbVarB)) {
                    }
                    i4 |= i19;
                } else {
                    xkbVarB = xkbVar2;
                }
                i4 |= i19;
            } else {
                xkbVarB = xkbVar2;
            }
            if ((i2 & 196608) == 0) {
                if ((i3 & 16) == 0) {
                    i9 = i18;
                    if (dVarF.D(j2)) {
                    }
                    i4 |= i20;
                } else {
                    i9 = i18;
                }
                i4 |= i20;
            } else {
                i9 = i18;
            }
            if ((i2 & 1572864) != 0) {
                if ((i3 & 32) == 0) {
                    i17 = 524288;
                } else {
                    i17 = 524288;
                }
                i4 |= i17;
            }
            i10 = i3 & 64;
            if (i10 != 0) {
                i4 |= 12582912;
            } else if ((i2 & 12582912) == 0) {
                if (dVarF.B(f3)) {
                    i11 = 8388608;
                } else {
                    i11 = 4194304;
                }
                i4 |= i11;
            }
            i12 = i3 & 128;
            if (i12 != 0) {
                if ((i2 & 100663296) == 0) {
                    if (dVarF.B(f4)) {
                        i13 = 67108864;
                    } else {
                        i13 = 33554432;
                    }
                    i4 |= i13;
                }
                if ((i3 & 256) != 0) {
                    i4 |= 805306368;
                } else if ((i2 & 805306368) == 0) {
                    if (dVarF.T(function2)) {
                        i14 = 536870912;
                    } else {
                        i14 = 268435456;
                    }
                    i4 |= i14;
                }
                i15 = i4;
                if ((306783379 & i4) != 306783378) {
                    z = true;
                } else {
                    z = false;
                }
                if (dVarF.g(z, i15 & 1)) {
                    dVarF.U();
                    if ((i2 & 1) != 0) {
                        if (i9 != 0) {
                            bVar2 = androidx.compose.ui.b.INSTANCE;
                        }
                        if (i5 != 0) {
                            xkbVar3 = null;
                        }
                        if (i7 != 0) {
                            fD = s2.a.d();
                        }
                        if ((i3 & 8) != 0) {
                            i15 &= -57345;
                            xkbVarB = s2.a.b(dVarF, 6);
                        }
                        if ((i3 & 16) != 0) {
                            jC = s2.a.c(dVarF, 6);
                            i15 &= -458753;
                        } else {
                            jC = j2;
                        }
                        if ((i3 & 32) != 0) {
                            jA = s2.a.a(dVarF, 6);
                            i15 &= -3670017;
                        } else {
                            jA = j3;
                        }
                        if (i10 != 0) {
                            fI = ff3.i(0);
                        } else {
                            fI = f3;
                        }
                        if (i12 != 0) {
                            fI2 = ff3.i(0);
                        } else {
                            fI2 = f4;
                        }
                        f8 = fD;
                        i16 = i15;
                        j6 = jA;
                        j7 = jC;
                    } else {
                        if (i9 != 0) {
                            bVar2 = androidx.compose.ui.b.INSTANCE;
                        }
                        if (i5 != 0) {
                            xkbVar3 = null;
                        }
                        if (i7 != 0) {
                            fD = s2.a.d();
                        }
                        if ((i3 & 8) != 0) {
                            i15 &= -57345;
                            xkbVarB = s2.a.b(dVarF, 6);
                        }
                        if ((i3 & 16) != 0) {
                            jC = s2.a.c(dVarF, 6);
                            i15 &= -458753;
                        } else {
                            jC = j2;
                        }
                        if ((i3 & 32) != 0) {
                            jA = s2.a.a(dVarF, 6);
                            i15 &= -3670017;
                        } else {
                            jA = j3;
                        }
                        if (i10 != 0) {
                            fI = ff3.i(0);
                        } else {
                            fI = f3;
                        }
                        if (i12 != 0) {
                            fI2 = ff3.i(0);
                        } else {
                            fI2 = f4;
                        }
                        f8 = fD;
                        i16 = i15;
                        j6 = jA;
                        j7 = jC;
                    }
                    dVarF.M();
                    if (e.k()) {
                        e.o(-343758958, i16, -1, "androidx.compose.material3.PlainTooltip (Tooltip.kt:430)");
                    }
                    if (xkbVar3 != null) {
                        dVarF.y(-1720477287);
                        objR = dVarF.R();
                        companion = androidx.compose.p004runtime.d.INSTANCE;
                        if (objR == companion.a()) {
                            objR = s0.e(zh7.a(zh7.c(null, 1, null)), null, 2, null);
                            dVarF.L(objR);
                        }
                        o58Var = (o58) objR;
                        f43 f43Var13 = (f43) dVarF.v(CompositionLocalsKt.g());
                        long jA14 = ((a0) dVarF.v(CompositionLocalsKt.v())).a();
                        androidx.compose.ui.b.Companion companion14 = androidx.compose.ui.b.INSTANCE;
                        if ((i16 & 14) != 4) {
                            z2 = true;
                        } else {
                            z2 = true;
                        }
                        objR2 = dVarF.R();
                        if (z2) {
                            objR2 = new Function1() { // from class: com.google.android.w9d
                                public final Object invoke(Object obj) {
                                    return TooltipKt.i(aadVar, (androidx.compose.ui.layout.j) obj);
                                }
                            };
                            dVarF.L(objR2);
                        } else {
                            objR2 = new Function1() { // from class: com.google.android.w9d
                                public final Object invoke(Object obj) {
                                    return TooltipKt.i(aadVar, (androidx.compose.ui.layout.j) obj);
                                }
                            };
                            dVarF.L(objR2);
                        }
                        androidx.compose.ui.b bVarThen13 = s(companion14, o58Var, f43Var13, jA14, (Function1) objR2, aadVar.getPositionProvider()).then(bVar2);
                        if (((57344 & i16) ^ 24576) <= 16384) {
                        }
                        if ((i16 & 896) == 256) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        z4 = z5 | z3;
                        objR3 = dVarF.R();
                        if (z4) {
                            objR3 = new r2(o58Var, xkbVarB, xkbVar3);
                            dVarF.L(objR3);
                        } else {
                            objR3 = new r2(o58Var, xkbVarB, xkbVar3);
                            dVarF.L(objR3);
                        }
                        dVarF.u();
                        bVar4 = bVarThen13;
                        xkbVar6 = (r2) objR3;
                    } else {
                        dVarF.y(-1719831991);
                        dVarF.u();
                        bVar4 = bVar2;
                        xkbVar6 = xkbVarB;
                    }
                    long j110 = j7;
                    float f111 = f8;
                    int i213 = i16 >> 9;
                    dVar2 = dVarF;
                    afc.c(bVar4, xkbVar6, j6, 0L, fI, fI2, null, ko1.e(-1573998995, true, new a(f8, j110, function2), dVarF, 54), dVar2, ((i16 >> 12) & 896) | 12582912 | (57344 & i213) | (i213 & 458752), 72);
                    if (e.k()) {
                        e.n();
                    }
                    bVar3 = bVar2;
                    xkbVar5 = xkbVar3;
                    f7 = fI;
                    f5 = fI2;
                    j4 = j110;
                    xkbVar4 = xkbVarB;
                    j5 = j6;
                    f6 = f111;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    f5 = f4;
                    bVar3 = bVar2;
                    xkbVar4 = xkbVarB;
                    xkbVar5 = xkbVar3;
                    f6 = fD;
                    j4 = j2;
                    j5 = j3;
                    f7 = f3;
                }
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.x9d
                        public final Object invoke(Object obj, Object obj2) {
                            return TooltipKt.h(aadVar, bVar3, xkbVar5, f6, xkbVar4, j4, j5, f7, f5, function2, i2, i3, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i4 |= 100663296;
            if ((i3 & 256) != 0) {
                i4 |= 805306368;
            } else if ((i2 & 805306368) == 0) {
                if (dVarF.T(function2)) {
                    i14 = 536870912;
                } else {
                    i14 = 268435456;
                }
                i4 |= i14;
            }
            i15 = i4;
            if ((306783379 & i4) != 306783378) {
                z = true;
            } else {
                z = false;
            }
            if (dVarF.g(z, i15 & 1)) {
                dVarF.U();
                if ((i2 & 1) != 0) {
                    if (i9 != 0) {
                        bVar2 = androidx.compose.ui.b.INSTANCE;
                    }
                    if (i5 != 0) {
                        xkbVar3 = null;
                    }
                    if (i7 != 0) {
                        fD = s2.a.d();
                    }
                    if ((i3 & 8) != 0) {
                        i15 &= -57345;
                        xkbVarB = s2.a.b(dVarF, 6);
                    }
                    if ((i3 & 16) != 0) {
                        jC = s2.a.c(dVarF, 6);
                        i15 &= -458753;
                    } else {
                        jC = j2;
                    }
                    if ((i3 & 32) != 0) {
                        jA = s2.a.a(dVarF, 6);
                        i15 &= -3670017;
                    } else {
                        jA = j3;
                    }
                    if (i10 != 0) {
                        fI = ff3.i(0);
                    } else {
                        fI = f3;
                    }
                    if (i12 != 0) {
                        fI2 = ff3.i(0);
                    } else {
                        fI2 = f4;
                    }
                    f8 = fD;
                    i16 = i15;
                    j6 = jA;
                    j7 = jC;
                } else {
                    if (i9 != 0) {
                        bVar2 = androidx.compose.ui.b.INSTANCE;
                    }
                    if (i5 != 0) {
                        xkbVar3 = null;
                    }
                    if (i7 != 0) {
                        fD = s2.a.d();
                    }
                    if ((i3 & 8) != 0) {
                        i15 &= -57345;
                        xkbVarB = s2.a.b(dVarF, 6);
                    }
                    if ((i3 & 16) != 0) {
                        jC = s2.a.c(dVarF, 6);
                        i15 &= -458753;
                    } else {
                        jC = j2;
                    }
                    if ((i3 & 32) != 0) {
                        jA = s2.a.a(dVarF, 6);
                        i15 &= -3670017;
                    } else {
                        jA = j3;
                    }
                    if (i10 != 0) {
                        fI = ff3.i(0);
                    } else {
                        fI = f3;
                    }
                    if (i12 != 0) {
                        fI2 = ff3.i(0);
                    } else {
                        fI2 = f4;
                    }
                    f8 = fD;
                    i16 = i15;
                    j6 = jA;
                    j7 = jC;
                }
                dVarF.M();
                if (e.k()) {
                    e.o(-343758958, i16, -1, "androidx.compose.material3.PlainTooltip (Tooltip.kt:430)");
                }
                if (xkbVar3 != null) {
                    dVarF.y(-1720477287);
                    objR = dVarF.R();
                    companion = androidx.compose.p004runtime.d.INSTANCE;
                    if (objR == companion.a()) {
                        objR = s0.e(zh7.a(zh7.c(null, 1, null)), null, 2, null);
                        dVarF.L(objR);
                    }
                    o58Var = (o58) objR;
                    f43 f43Var14 = (f43) dVarF.v(CompositionLocalsKt.g());
                    long jA15 = ((a0) dVarF.v(CompositionLocalsKt.v())).a();
                    androidx.compose.ui.b.Companion companion15 = androidx.compose.ui.b.INSTANCE;
                    if ((i16 & 14) != 4) {
                        z2 = true;
                    } else {
                        z2 = true;
                    }
                    objR2 = dVarF.R();
                    if (z2) {
                        objR2 = new Function1() { // from class: com.google.android.w9d
                            public final Object invoke(Object obj) {
                                return TooltipKt.i(aadVar, (androidx.compose.ui.layout.j) obj);
                            }
                        };
                        dVarF.L(objR2);
                    } else {
                        objR2 = new Function1() { // from class: com.google.android.w9d
                            public final Object invoke(Object obj) {
                                return TooltipKt.i(aadVar, (androidx.compose.ui.layout.j) obj);
                            }
                        };
                        dVarF.L(objR2);
                    }
                    androidx.compose.ui.b bVarThen14 = s(companion15, o58Var, f43Var14, jA15, (Function1) objR2, aadVar.getPositionProvider()).then(bVar2);
                    if (((57344 & i16) ^ 24576) <= 16384) {
                    }
                    if ((i16 & 896) == 256) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    z4 = z5 | z3;
                    objR3 = dVarF.R();
                    if (z4) {
                        objR3 = new r2(o58Var, xkbVarB, xkbVar3);
                        dVarF.L(objR3);
                    } else {
                        objR3 = new r2(o58Var, xkbVarB, xkbVar3);
                        dVarF.L(objR3);
                    }
                    dVarF.u();
                    bVar4 = bVarThen14;
                    xkbVar6 = (r2) objR3;
                } else {
                    dVarF.y(-1719831991);
                    dVarF.u();
                    bVar4 = bVar2;
                    xkbVar6 = xkbVarB;
                }
                long j111 = j7;
                float f112 = f8;
                int i214 = i16 >> 9;
                dVar2 = dVarF;
                afc.c(bVar4, xkbVar6, j6, 0L, fI, fI2, null, ko1.e(-1573998995, true, new a(f8, j111, function2), dVarF, 54), dVar2, ((i16 >> 12) & 896) | 12582912 | (57344 & i214) | (i214 & 458752), 72);
                if (e.k()) {
                    e.n();
                }
                bVar3 = bVar2;
                xkbVar5 = xkbVar3;
                f7 = fI;
                f5 = fI2;
                j4 = j111;
                xkbVar4 = xkbVarB;
                j5 = j6;
                f6 = f112;
            } else {
                dVar2 = dVarF;
                dVar2.q();
                f5 = f4;
                bVar3 = bVar2;
                xkbVar4 = xkbVarB;
                xkbVar5 = xkbVar3;
                f6 = fD;
                j4 = j2;
                j5 = j3;
                f7 = f3;
            }
            s6bVarH = dVar2.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.x9d
                    public final Object invoke(Object obj, Object obj2) {
                        return TooltipKt.h(aadVar, bVar3, xkbVar5, f6, xkbVar4, j4, j5, f7, f5, function2, i2, i3, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i4 |= 3072;
        fD = f2;
        if ((i2 & 24576) == 0) {
            if ((i3 & 8) == 0) {
                xkbVarB = xkbVar2;
                if (dVarF.x(xkbVarB)) {
                }
                i4 |= i19;
            } else {
                xkbVarB = xkbVar2;
            }
            i4 |= i19;
        } else {
            xkbVarB = xkbVar2;
        }
        if ((i2 & 196608) == 0) {
            if ((i3 & 16) == 0) {
                i9 = i18;
                if (dVarF.D(j2)) {
                }
                i4 |= i20;
            } else {
                i9 = i18;
            }
            i4 |= i20;
        } else {
            i9 = i18;
        }
        if ((i2 & 1572864) != 0) {
            if ((i3 & 32) == 0) {
                i17 = 524288;
            } else {
                i17 = 524288;
            }
            i4 |= i17;
        }
        i10 = i3 & 64;
        if (i10 != 0) {
            i4 |= 12582912;
        } else if ((i2 & 12582912) == 0) {
            if (dVarF.B(f3)) {
                i11 = 8388608;
            } else {
                i11 = 4194304;
            }
            i4 |= i11;
        }
        i12 = i3 & 128;
        if (i12 != 0) {
            if ((i2 & 100663296) == 0) {
                if (dVarF.B(f4)) {
                    i13 = 67108864;
                } else {
                    i13 = 33554432;
                }
                i4 |= i13;
            }
            if ((i3 & 256) != 0) {
                i4 |= 805306368;
            } else if ((i2 & 805306368) == 0) {
                if (dVarF.T(function2)) {
                    i14 = 536870912;
                } else {
                    i14 = 268435456;
                }
                i4 |= i14;
            }
            i15 = i4;
            if ((306783379 & i4) != 306783378) {
                z = true;
            } else {
                z = false;
            }
            if (dVarF.g(z, i15 & 1)) {
                dVarF.U();
                if ((i2 & 1) != 0) {
                    if (i9 != 0) {
                        bVar2 = androidx.compose.ui.b.INSTANCE;
                    }
                    if (i5 != 0) {
                        xkbVar3 = null;
                    }
                    if (i7 != 0) {
                        fD = s2.a.d();
                    }
                    if ((i3 & 8) != 0) {
                        i15 &= -57345;
                        xkbVarB = s2.a.b(dVarF, 6);
                    }
                    if ((i3 & 16) != 0) {
                        jC = s2.a.c(dVarF, 6);
                        i15 &= -458753;
                    } else {
                        jC = j2;
                    }
                    if ((i3 & 32) != 0) {
                        jA = s2.a.a(dVarF, 6);
                        i15 &= -3670017;
                    } else {
                        jA = j3;
                    }
                    if (i10 != 0) {
                        fI = ff3.i(0);
                    } else {
                        fI = f3;
                    }
                    if (i12 != 0) {
                        fI2 = ff3.i(0);
                    } else {
                        fI2 = f4;
                    }
                    f8 = fD;
                    i16 = i15;
                    j6 = jA;
                    j7 = jC;
                } else {
                    if (i9 != 0) {
                        bVar2 = androidx.compose.ui.b.INSTANCE;
                    }
                    if (i5 != 0) {
                        xkbVar3 = null;
                    }
                    if (i7 != 0) {
                        fD = s2.a.d();
                    }
                    if ((i3 & 8) != 0) {
                        i15 &= -57345;
                        xkbVarB = s2.a.b(dVarF, 6);
                    }
                    if ((i3 & 16) != 0) {
                        jC = s2.a.c(dVarF, 6);
                        i15 &= -458753;
                    } else {
                        jC = j2;
                    }
                    if ((i3 & 32) != 0) {
                        jA = s2.a.a(dVarF, 6);
                        i15 &= -3670017;
                    } else {
                        jA = j3;
                    }
                    if (i10 != 0) {
                        fI = ff3.i(0);
                    } else {
                        fI = f3;
                    }
                    if (i12 != 0) {
                        fI2 = ff3.i(0);
                    } else {
                        fI2 = f4;
                    }
                    f8 = fD;
                    i16 = i15;
                    j6 = jA;
                    j7 = jC;
                }
                dVarF.M();
                if (e.k()) {
                    e.o(-343758958, i16, -1, "androidx.compose.material3.PlainTooltip (Tooltip.kt:430)");
                }
                if (xkbVar3 != null) {
                    dVarF.y(-1720477287);
                    objR = dVarF.R();
                    companion = androidx.compose.p004runtime.d.INSTANCE;
                    if (objR == companion.a()) {
                        objR = s0.e(zh7.a(zh7.c(null, 1, null)), null, 2, null);
                        dVarF.L(objR);
                    }
                    o58Var = (o58) objR;
                    f43 f43Var15 = (f43) dVarF.v(CompositionLocalsKt.g());
                    long jA16 = ((a0) dVarF.v(CompositionLocalsKt.v())).a();
                    androidx.compose.ui.b.Companion companion16 = androidx.compose.ui.b.INSTANCE;
                    if ((i16 & 14) != 4) {
                        z2 = true;
                    } else {
                        z2 = true;
                    }
                    objR2 = dVarF.R();
                    if (z2) {
                        objR2 = new Function1() { // from class: com.google.android.w9d
                            public final Object invoke(Object obj) {
                                return TooltipKt.i(aadVar, (androidx.compose.ui.layout.j) obj);
                            }
                        };
                        dVarF.L(objR2);
                    } else {
                        objR2 = new Function1() { // from class: com.google.android.w9d
                            public final Object invoke(Object obj) {
                                return TooltipKt.i(aadVar, (androidx.compose.ui.layout.j) obj);
                            }
                        };
                        dVarF.L(objR2);
                    }
                    androidx.compose.ui.b bVarThen15 = s(companion16, o58Var, f43Var15, jA16, (Function1) objR2, aadVar.getPositionProvider()).then(bVar2);
                    if (((57344 & i16) ^ 24576) <= 16384) {
                    }
                    if ((i16 & 896) == 256) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    z4 = z5 | z3;
                    objR3 = dVarF.R();
                    if (z4) {
                        objR3 = new r2(o58Var, xkbVarB, xkbVar3);
                        dVarF.L(objR3);
                    } else {
                        objR3 = new r2(o58Var, xkbVarB, xkbVar3);
                        dVarF.L(objR3);
                    }
                    dVarF.u();
                    bVar4 = bVarThen15;
                    xkbVar6 = (r2) objR3;
                } else {
                    dVarF.y(-1719831991);
                    dVarF.u();
                    bVar4 = bVar2;
                    xkbVar6 = xkbVarB;
                }
                long j112 = j7;
                float f113 = f8;
                int i215 = i16 >> 9;
                dVar2 = dVarF;
                afc.c(bVar4, xkbVar6, j6, 0L, fI, fI2, null, ko1.e(-1573998995, true, new a(f8, j112, function2), dVarF, 54), dVar2, ((i16 >> 12) & 896) | 12582912 | (57344 & i215) | (i215 & 458752), 72);
                if (e.k()) {
                    e.n();
                }
                bVar3 = bVar2;
                xkbVar5 = xkbVar3;
                f7 = fI;
                f5 = fI2;
                j4 = j112;
                xkbVar4 = xkbVarB;
                j5 = j6;
                f6 = f113;
            } else {
                dVar2 = dVarF;
                dVar2.q();
                f5 = f4;
                bVar3 = bVar2;
                xkbVar4 = xkbVarB;
                xkbVar5 = xkbVar3;
                f6 = fD;
                j4 = j2;
                j5 = j3;
                f7 = f3;
            }
            s6bVarH = dVar2.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.x9d
                    public final Object invoke(Object obj, Object obj2) {
                        return TooltipKt.h(aadVar, bVar3, xkbVar5, f6, xkbVar4, j4, j5, f7, f5, function2, i2, i3, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i4 |= 100663296;
        if ((i3 & 256) != 0) {
            i4 |= 805306368;
        } else if ((i2 & 805306368) == 0) {
            if (dVarF.T(function2)) {
                i14 = 536870912;
            } else {
                i14 = 268435456;
            }
            i4 |= i14;
        }
        i15 = i4;
        if ((306783379 & i4) != 306783378) {
            z = true;
        } else {
            z = false;
        }
        if (dVarF.g(z, i15 & 1)) {
            dVarF.U();
            if ((i2 & 1) != 0) {
                if (i9 != 0) {
                    bVar2 = androidx.compose.ui.b.INSTANCE;
                }
                if (i5 != 0) {
                    xkbVar3 = null;
                }
                if (i7 != 0) {
                    fD = s2.a.d();
                }
                if ((i3 & 8) != 0) {
                    i15 &= -57345;
                    xkbVarB = s2.a.b(dVarF, 6);
                }
                if ((i3 & 16) != 0) {
                    jC = s2.a.c(dVarF, 6);
                    i15 &= -458753;
                } else {
                    jC = j2;
                }
                if ((i3 & 32) != 0) {
                    jA = s2.a.a(dVarF, 6);
                    i15 &= -3670017;
                } else {
                    jA = j3;
                }
                if (i10 != 0) {
                    fI = ff3.i(0);
                } else {
                    fI = f3;
                }
                if (i12 != 0) {
                    fI2 = ff3.i(0);
                } else {
                    fI2 = f4;
                }
                f8 = fD;
                i16 = i15;
                j6 = jA;
                j7 = jC;
            } else {
                if (i9 != 0) {
                    bVar2 = androidx.compose.ui.b.INSTANCE;
                }
                if (i5 != 0) {
                    xkbVar3 = null;
                }
                if (i7 != 0) {
                    fD = s2.a.d();
                }
                if ((i3 & 8) != 0) {
                    i15 &= -57345;
                    xkbVarB = s2.a.b(dVarF, 6);
                }
                if ((i3 & 16) != 0) {
                    jC = s2.a.c(dVarF, 6);
                    i15 &= -458753;
                } else {
                    jC = j2;
                }
                if ((i3 & 32) != 0) {
                    jA = s2.a.a(dVarF, 6);
                    i15 &= -3670017;
                } else {
                    jA = j3;
                }
                if (i10 != 0) {
                    fI = ff3.i(0);
                } else {
                    fI = f3;
                }
                if (i12 != 0) {
                    fI2 = ff3.i(0);
                } else {
                    fI2 = f4;
                }
                f8 = fD;
                i16 = i15;
                j6 = jA;
                j7 = jC;
            }
            dVarF.M();
            if (e.k()) {
                e.o(-343758958, i16, -1, "androidx.compose.material3.PlainTooltip (Tooltip.kt:430)");
            }
            if (xkbVar3 != null) {
                dVarF.y(-1720477287);
                objR = dVarF.R();
                companion = androidx.compose.p004runtime.d.INSTANCE;
                if (objR == companion.a()) {
                    objR = s0.e(zh7.a(zh7.c(null, 1, null)), null, 2, null);
                    dVarF.L(objR);
                }
                o58Var = (o58) objR;
                f43 f43Var16 = (f43) dVarF.v(CompositionLocalsKt.g());
                long jA17 = ((a0) dVarF.v(CompositionLocalsKt.v())).a();
                androidx.compose.ui.b.Companion companion17 = androidx.compose.ui.b.INSTANCE;
                if ((i16 & 14) != 4) {
                    z2 = true;
                } else {
                    z2 = true;
                }
                objR2 = dVarF.R();
                if (z2) {
                    objR2 = new Function1() { // from class: com.google.android.w9d
                        public final Object invoke(Object obj) {
                            return TooltipKt.i(aadVar, (androidx.compose.ui.layout.j) obj);
                        }
                    };
                    dVarF.L(objR2);
                } else {
                    objR2 = new Function1() { // from class: com.google.android.w9d
                        public final Object invoke(Object obj) {
                            return TooltipKt.i(aadVar, (androidx.compose.ui.layout.j) obj);
                        }
                    };
                    dVarF.L(objR2);
                }
                androidx.compose.ui.b bVarThen16 = s(companion17, o58Var, f43Var16, jA17, (Function1) objR2, aadVar.getPositionProvider()).then(bVar2);
                if (((57344 & i16) ^ 24576) <= 16384) {
                }
                if ((i16 & 896) == 256) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                z4 = z5 | z3;
                objR3 = dVarF.R();
                if (z4) {
                    objR3 = new r2(o58Var, xkbVarB, xkbVar3);
                    dVarF.L(objR3);
                } else {
                    objR3 = new r2(o58Var, xkbVarB, xkbVar3);
                    dVarF.L(objR3);
                }
                dVarF.u();
                bVar4 = bVarThen16;
                xkbVar6 = (r2) objR3;
            } else {
                dVarF.y(-1719831991);
                dVarF.u();
                bVar4 = bVar2;
                xkbVar6 = xkbVarB;
            }
            long j113 = j7;
            float f114 = f8;
            int i216 = i16 >> 9;
            dVar2 = dVarF;
            afc.c(bVar4, xkbVar6, j6, 0L, fI, fI2, null, ko1.e(-1573998995, true, new a(f8, j113, function2), dVarF, 54), dVar2, ((i16 >> 12) & 896) | 12582912 | (57344 & i216) | (i216 & 458752), 72);
            if (e.k()) {
                e.n();
            }
            bVar3 = bVar2;
            xkbVar5 = xkbVar3;
            f7 = fI;
            f5 = fI2;
            j4 = j113;
            xkbVar4 = xkbVarB;
            j5 = j6;
            f6 = f114;
        } else {
            dVar2 = dVarF;
            dVar2.q();
            f5 = f4;
            bVar3 = bVar2;
            xkbVar4 = xkbVarB;
            xkbVar5 = xkbVar3;
            f6 = fD;
            j4 = j2;
            j5 = j3;
            f7 = f3;
        }
        s6bVarH = dVar2.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2() { // from class: com.google.android.x9d
                public final Object invoke(Object obj, Object obj2) {
                    return TooltipKt.h(aadVar, bVar3, xkbVar5, f6, xkbVar4, j4, j5, f7, f5, function2, i2, i3, (d) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(aad aadVar, androidx.compose.ui.b bVar, xkb xkbVar, float f2, xkb xkbVar2, long j2, long j3, float f3, float f4, Function2 function2, int i2, int i3, androidx.compose.p004runtime.d dVar, int i4) {
        g(aadVar, bVar, xkbVar, f2, xkbVar2, j2, j3, f3, f4, function2, dVar, saa.a(i2 | 1), i3);
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kn6 i(aad aadVar, androidx.compose.ui.layout.j jVar) {
        return aadVar.b(jVar);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0117  */
    /* JADX WARN: Code duplicated, block: B:103:0x0119  */
    /* JADX WARN: Code duplicated, block: B:106:0x0122 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:107:0x0124  */
    /* JADX WARN: Code duplicated, block: B:109:0x0129  */
    /* JADX WARN: Code duplicated, block: B:111:0x012c  */
    /* JADX WARN: Code duplicated, block: B:112:0x012e  */
    /* JADX WARN: Code duplicated, block: B:115:0x0132  */
    /* JADX WARN: Code duplicated, block: B:116:0x0134  */
    /* JADX WARN: Code duplicated, block: B:118:0x0138  */
    /* JADX WARN: Code duplicated, block: B:119:0x013a  */
    /* JADX WARN: Code duplicated, block: B:122:0x0142  */
    /* JADX WARN: Code duplicated, block: B:125:0x0166  */
    /* JADX WARN: Code duplicated, block: B:126:0x0172  */
    /* JADX WARN: Code duplicated, block: B:129:0x0180  */
    /* JADX WARN: Code duplicated, block: B:132:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:134:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:137:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:139:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x0082  */
    /* JADX WARN: Code duplicated, block: B:51:0x0087  */
    /* JADX WARN: Code duplicated, block: B:53:0x008b  */
    /* JADX WARN: Code duplicated, block: B:55:0x0093  */
    /* JADX WARN: Code duplicated, block: B:56:0x0096  */
    /* JADX WARN: Code duplicated, block: B:60:0x009f  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:71:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:76:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:77:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:81:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:85:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:87:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:92:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:93:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:95:0x0102  */
    /* JADX WARN: Code duplicated, block: B:97:0x0108  */
    /* JADX WARN: Code duplicated, block: B:98:0x010b  */
    public static final void j(final rg9 rg9Var, final ps4<? super aad, ? super androidx.compose.p004runtime.d, ? super Integer, Unit> ps4Var, final cad cadVar, androidx.compose.ui.b bVar, Function0<Unit> function0, boolean z, boolean z2, boolean z3, final Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> function2, androidx.compose.p004runtime.d dVar, final int i2, final int i3) {
        int i4;
        androidx.compose.ui.b bVar2;
        int i5;
        Function0<Unit> function1;
        int i6;
        int i7;
        boolean z4;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z5;
        final boolean z6;
        final androidx.compose.ui.b bVar3;
        final Function0<Unit> function3;
        final boolean z7;
        final boolean z8;
        s6b s6bVarH;
        boolean z9;
        boolean z10;
        boolean z11;
        Object objR;
        androidx.compose.p004runtime.d.Companion companion;
        final o58 o58Var;
        Object objR2;
        androidx.compose.p004runtime.d dVarF = dVar.F(-293753984);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (dVarF.x(rg9Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= dVarF.T(ps4Var) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            i4 |= (i2 & 512) == 0 ? dVarF.x(cadVar) : dVarF.T(cadVar) ? 256 : 128;
        }
        int i14 = i3 & 8;
        if (i14 == 0) {
            if ((i2 & 3072) == 0) {
                bVar2 = bVar;
                i4 |= dVarF.x(bVar2) ? 2048 : 1024;
            }
            i5 = i3 & 16;
            if (i5 != 0) {
                if ((i2 & 24576) == 0) {
                    function1 = function0;
                    if (dVarF.T(function1)) {
                        i6 = 16384;
                    } else {
                        i6 = 8192;
                    }
                    i4 |= i6;
                }
                i7 = i3 & 32;
                if (i7 != 0) {
                    if ((196608 & i2) == 0) {
                        z4 = z;
                        if (dVarF.A(z4)) {
                            i8 = 131072;
                        } else {
                            i8 = 65536;
                        }
                        i4 |= i8;
                    }
                    i9 = i3 & 64;
                    if (i9 != 0) {
                        i4 |= 1572864;
                    } else if ((i2 & 1572864) == 0) {
                        if (dVarF.A(z2)) {
                            i10 = 1048576;
                        } else {
                            i10 = 524288;
                        }
                        i4 |= i10;
                    }
                    i11 = i3 & 128;
                    if (i11 != 0) {
                        if ((i2 & 12582912) == 0) {
                            if (dVarF.A(z3)) {
                                i12 = 8388608;
                            } else {
                                i12 = 4194304;
                            }
                            i4 |= i12;
                        }
                        if ((i3 & 256) != 0) {
                            i4 |= 100663296;
                        } else if ((i2 & 100663296) == 0) {
                            if (dVarF.T(function2)) {
                                i13 = 67108864;
                            } else {
                                i13 = 33554432;
                            }
                            i4 |= i13;
                        }
                        if ((38347923 & i4) != 38347922) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        if (dVarF.g(z5, i4 & 1)) {
                            if (i14 != 0) {
                                bVar2 = androidx.compose.ui.b.INSTANCE;
                            }
                            if (i5 != 0) {
                                function1 = null;
                            }
                            if (i7 != 0) {
                                z9 = false;
                            } else {
                                z9 = z4;
                            }
                            androidx.compose.ui.b bVar4 = bVar2;
                            if (i9 != 0) {
                                z10 = true;
                            } else {
                                z10 = z2;
                            }
                            if (i11 != 0) {
                                z11 = false;
                            } else {
                                z11 = z3;
                            }
                            if (e.k()) {
                                e.o(-293753984, i4, -1, "androidx.compose.material3.TooltipBox (Tooltip.kt:309)");
                            }
                            Transition transitionX = TransitionKt.x(cadVar.a(), "tooltip transition", dVarF, androidx.compose.p000animation.core.e.d | 48, 0);
                            objR = dVarF.R();
                            companion = androidx.compose.p004runtime.d.INSTANCE;
                            if (objR == companion.a()) {
                                objR = s0.e(null, null, 2, null);
                                dVarF.L(objR);
                            }
                            o58Var = (o58) objR;
                            objR2 = dVarF.R();
                            if (objR2 == companion.a()) {
                                objR2 = new bad(new Function0() { // from class: com.google.android.u9d
                                    public final Object invoke() {
                                        return TooltipKt.k(o58Var);
                                    }
                                }, rg9Var);
                                dVarF.L(objR2);
                            }
                            Function0<Unit> function4 = function1;
                            BasicTooltipKt.i(rg9Var, ko1.e(-527401546, true, new b(transitionX, ps4Var, (bad) objR2), dVarF, 54), cadVar, bVar4, function4, z9, z10, z11, ko1.e(-23901870, true, new c(o58Var, function2), dVarF, 54), dVarF, (i4 & 14) | 100663344 | (i4 & 896) | (i4 & 7168) | (57344 & i4) | (458752 & i4) | (3670016 & i4) | (29360128 & i4), 0);
                            if (e.k()) {
                                e.n();
                            }
                            z8 = z11;
                            z6 = z10;
                            z7 = z9;
                            function3 = function4;
                            bVar3 = bVar4;
                        } else {
                            dVarF.q();
                            z6 = z2;
                            bVar3 = bVar2;
                            function3 = function1;
                            z7 = z4;
                            z8 = z3;
                        }
                        s6bVarH = dVarF.H();
                        if (s6bVarH != null) {
                            s6bVarH.a(new Function2() { // from class: com.google.android.v9d
                                public final Object invoke(Object obj, Object obj2) {
                                    return TooltipKt.l(rg9Var, ps4Var, cadVar, bVar3, function3, z7, z6, z8, function2, i2, i3, (d) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i4 |= 12582912;
                    if ((i3 & 256) != 0) {
                        i4 |= 100663296;
                    } else if ((i2 & 100663296) == 0) {
                        if (dVarF.T(function2)) {
                            i13 = 67108864;
                        } else {
                            i13 = 33554432;
                        }
                        i4 |= i13;
                    }
                    if ((38347923 & i4) != 38347922) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (dVarF.g(z5, i4 & 1)) {
                        if (i14 != 0) {
                            bVar2 = androidx.compose.ui.b.INSTANCE;
                        }
                        if (i5 != 0) {
                            function1 = null;
                        }
                        if (i7 != 0) {
                            z9 = false;
                        } else {
                            z9 = z4;
                        }
                        androidx.compose.ui.b bVar5 = bVar2;
                        if (i9 != 0) {
                            z10 = true;
                        } else {
                            z10 = z2;
                        }
                        if (i11 != 0) {
                            z11 = false;
                        } else {
                            z11 = z3;
                        }
                        if (e.k()) {
                            e.o(-293753984, i4, -1, "androidx.compose.material3.TooltipBox (Tooltip.kt:309)");
                        }
                        Transition transitionX2 = TransitionKt.x(cadVar.a(), "tooltip transition", dVarF, androidx.compose.p000animation.core.e.d | 48, 0);
                        objR = dVarF.R();
                        companion = androidx.compose.p004runtime.d.INSTANCE;
                        if (objR == companion.a()) {
                            objR = s0.e(null, null, 2, null);
                            dVarF.L(objR);
                        }
                        o58Var = (o58) objR;
                        objR2 = dVarF.R();
                        if (objR2 == companion.a()) {
                            objR2 = new bad(new Function0() { // from class: com.google.android.u9d
                                public final Object invoke() {
                                    return TooltipKt.k(o58Var);
                                }
                            }, rg9Var);
                            dVarF.L(objR2);
                        }
                        Function0<Unit> function5 = function1;
                        BasicTooltipKt.i(rg9Var, ko1.e(-527401546, true, new b(transitionX2, ps4Var, (bad) objR2), dVarF, 54), cadVar, bVar5, function5, z9, z10, z11, ko1.e(-23901870, true, new c(o58Var, function2), dVarF, 54), dVarF, (i4 & 14) | 100663344 | (i4 & 896) | (i4 & 7168) | (57344 & i4) | (458752 & i4) | (3670016 & i4) | (29360128 & i4), 0);
                        if (e.k()) {
                            e.n();
                        }
                        z8 = z11;
                        z6 = z10;
                        z7 = z9;
                        function3 = function5;
                        bVar3 = bVar5;
                    } else {
                        dVarF.q();
                        z6 = z2;
                        bVar3 = bVar2;
                        function3 = function1;
                        z7 = z4;
                        z8 = z3;
                    }
                    s6bVarH = dVarF.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.v9d
                            public final Object invoke(Object obj, Object obj2) {
                                return TooltipKt.l(rg9Var, ps4Var, cadVar, bVar3, function3, z7, z6, z8, function2, i2, i3, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i4 |= 196608;
                z4 = z;
                i9 = i3 & 64;
                if (i9 != 0) {
                    i4 |= 1572864;
                } else if ((i2 & 1572864) == 0) {
                    if (dVarF.A(z2)) {
                        i10 = 1048576;
                    } else {
                        i10 = 524288;
                    }
                    i4 |= i10;
                }
                i11 = i3 & 128;
                if (i11 != 0) {
                    if ((i2 & 12582912) == 0) {
                        if (dVarF.A(z3)) {
                            i12 = 8388608;
                        } else {
                            i12 = 4194304;
                        }
                        i4 |= i12;
                    }
                    if ((i3 & 256) != 0) {
                        i4 |= 100663296;
                    } else if ((i2 & 100663296) == 0) {
                        if (dVarF.T(function2)) {
                            i13 = 67108864;
                        } else {
                            i13 = 33554432;
                        }
                        i4 |= i13;
                    }
                    if ((38347923 & i4) != 38347922) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (dVarF.g(z5, i4 & 1)) {
                        if (i14 != 0) {
                            bVar2 = androidx.compose.ui.b.INSTANCE;
                        }
                        if (i5 != 0) {
                            function1 = null;
                        }
                        if (i7 != 0) {
                            z9 = false;
                        } else {
                            z9 = z4;
                        }
                        androidx.compose.ui.b bVar6 = bVar2;
                        if (i9 != 0) {
                            z10 = true;
                        } else {
                            z10 = z2;
                        }
                        if (i11 != 0) {
                            z11 = false;
                        } else {
                            z11 = z3;
                        }
                        if (e.k()) {
                            e.o(-293753984, i4, -1, "androidx.compose.material3.TooltipBox (Tooltip.kt:309)");
                        }
                        Transition transitionX3 = TransitionKt.x(cadVar.a(), "tooltip transition", dVarF, androidx.compose.p000animation.core.e.d | 48, 0);
                        objR = dVarF.R();
                        companion = androidx.compose.p004runtime.d.INSTANCE;
                        if (objR == companion.a()) {
                            objR = s0.e(null, null, 2, null);
                            dVarF.L(objR);
                        }
                        o58Var = (o58) objR;
                        objR2 = dVarF.R();
                        if (objR2 == companion.a()) {
                            objR2 = new bad(new Function0() { // from class: com.google.android.u9d
                                public final Object invoke() {
                                    return TooltipKt.k(o58Var);
                                }
                            }, rg9Var);
                            dVarF.L(objR2);
                        }
                        Function0<Unit> function6 = function1;
                        BasicTooltipKt.i(rg9Var, ko1.e(-527401546, true, new b(transitionX3, ps4Var, (bad) objR2), dVarF, 54), cadVar, bVar6, function6, z9, z10, z11, ko1.e(-23901870, true, new c(o58Var, function2), dVarF, 54), dVarF, (i4 & 14) | 100663344 | (i4 & 896) | (i4 & 7168) | (57344 & i4) | (458752 & i4) | (3670016 & i4) | (29360128 & i4), 0);
                        if (e.k()) {
                            e.n();
                        }
                        z8 = z11;
                        z6 = z10;
                        z7 = z9;
                        function3 = function6;
                        bVar3 = bVar6;
                    } else {
                        dVarF.q();
                        z6 = z2;
                        bVar3 = bVar2;
                        function3 = function1;
                        z7 = z4;
                        z8 = z3;
                    }
                    s6bVarH = dVarF.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.v9d
                            public final Object invoke(Object obj, Object obj2) {
                                return TooltipKt.l(rg9Var, ps4Var, cadVar, bVar3, function3, z7, z6, z8, function2, i2, i3, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i4 |= 12582912;
                if ((i3 & 256) != 0) {
                    i4 |= 100663296;
                } else if ((i2 & 100663296) == 0) {
                    if (dVarF.T(function2)) {
                        i13 = 67108864;
                    } else {
                        i13 = 33554432;
                    }
                    i4 |= i13;
                }
                if ((38347923 & i4) != 38347922) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (dVarF.g(z5, i4 & 1)) {
                    if (i14 != 0) {
                        bVar2 = androidx.compose.ui.b.INSTANCE;
                    }
                    if (i5 != 0) {
                        function1 = null;
                    }
                    if (i7 != 0) {
                        z9 = false;
                    } else {
                        z9 = z4;
                    }
                    androidx.compose.ui.b bVar7 = bVar2;
                    if (i9 != 0) {
                        z10 = true;
                    } else {
                        z10 = z2;
                    }
                    if (i11 != 0) {
                        z11 = false;
                    } else {
                        z11 = z3;
                    }
                    if (e.k()) {
                        e.o(-293753984, i4, -1, "androidx.compose.material3.TooltipBox (Tooltip.kt:309)");
                    }
                    Transition transitionX4 = TransitionKt.x(cadVar.a(), "tooltip transition", dVarF, androidx.compose.p000animation.core.e.d | 48, 0);
                    objR = dVarF.R();
                    companion = androidx.compose.p004runtime.d.INSTANCE;
                    if (objR == companion.a()) {
                        objR = s0.e(null, null, 2, null);
                        dVarF.L(objR);
                    }
                    o58Var = (o58) objR;
                    objR2 = dVarF.R();
                    if (objR2 == companion.a()) {
                        objR2 = new bad(new Function0() { // from class: com.google.android.u9d
                            public final Object invoke() {
                                return TooltipKt.k(o58Var);
                            }
                        }, rg9Var);
                        dVarF.L(objR2);
                    }
                    Function0<Unit> function7 = function1;
                    BasicTooltipKt.i(rg9Var, ko1.e(-527401546, true, new b(transitionX4, ps4Var, (bad) objR2), dVarF, 54), cadVar, bVar7, function7, z9, z10, z11, ko1.e(-23901870, true, new c(o58Var, function2), dVarF, 54), dVarF, (i4 & 14) | 100663344 | (i4 & 896) | (i4 & 7168) | (57344 & i4) | (458752 & i4) | (3670016 & i4) | (29360128 & i4), 0);
                    if (e.k()) {
                        e.n();
                    }
                    z8 = z11;
                    z6 = z10;
                    z7 = z9;
                    function3 = function7;
                    bVar3 = bVar7;
                } else {
                    dVarF.q();
                    z6 = z2;
                    bVar3 = bVar2;
                    function3 = function1;
                    z7 = z4;
                    z8 = z3;
                }
                s6bVarH = dVarF.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.v9d
                        public final Object invoke(Object obj, Object obj2) {
                            return TooltipKt.l(rg9Var, ps4Var, cadVar, bVar3, function3, z7, z6, z8, function2, i2, i3, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i4 |= 24576;
            function1 = function0;
            i7 = i3 & 32;
            if (i7 != 0) {
                if ((196608 & i2) == 0) {
                    z4 = z;
                    if (dVarF.A(z4)) {
                        i8 = 131072;
                    } else {
                        i8 = 65536;
                    }
                    i4 |= i8;
                }
                i9 = i3 & 64;
                if (i9 != 0) {
                    i4 |= 1572864;
                } else if ((i2 & 1572864) == 0) {
                    if (dVarF.A(z2)) {
                        i10 = 1048576;
                    } else {
                        i10 = 524288;
                    }
                    i4 |= i10;
                }
                i11 = i3 & 128;
                if (i11 != 0) {
                    if ((i2 & 12582912) == 0) {
                        if (dVarF.A(z3)) {
                            i12 = 8388608;
                        } else {
                            i12 = 4194304;
                        }
                        i4 |= i12;
                    }
                    if ((i3 & 256) != 0) {
                        i4 |= 100663296;
                    } else if ((i2 & 100663296) == 0) {
                        if (dVarF.T(function2)) {
                            i13 = 67108864;
                        } else {
                            i13 = 33554432;
                        }
                        i4 |= i13;
                    }
                    if ((38347923 & i4) != 38347922) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (dVarF.g(z5, i4 & 1)) {
                        if (i14 != 0) {
                            bVar2 = androidx.compose.ui.b.INSTANCE;
                        }
                        if (i5 != 0) {
                            function1 = null;
                        }
                        if (i7 != 0) {
                            z9 = false;
                        } else {
                            z9 = z4;
                        }
                        androidx.compose.ui.b bVar8 = bVar2;
                        if (i9 != 0) {
                            z10 = true;
                        } else {
                            z10 = z2;
                        }
                        if (i11 != 0) {
                            z11 = false;
                        } else {
                            z11 = z3;
                        }
                        if (e.k()) {
                            e.o(-293753984, i4, -1, "androidx.compose.material3.TooltipBox (Tooltip.kt:309)");
                        }
                        Transition transitionX5 = TransitionKt.x(cadVar.a(), "tooltip transition", dVarF, androidx.compose.p000animation.core.e.d | 48, 0);
                        objR = dVarF.R();
                        companion = androidx.compose.p004runtime.d.INSTANCE;
                        if (objR == companion.a()) {
                            objR = s0.e(null, null, 2, null);
                            dVarF.L(objR);
                        }
                        o58Var = (o58) objR;
                        objR2 = dVarF.R();
                        if (objR2 == companion.a()) {
                            objR2 = new bad(new Function0() { // from class: com.google.android.u9d
                                public final Object invoke() {
                                    return TooltipKt.k(o58Var);
                                }
                            }, rg9Var);
                            dVarF.L(objR2);
                        }
                        Function0<Unit> function8 = function1;
                        BasicTooltipKt.i(rg9Var, ko1.e(-527401546, true, new b(transitionX5, ps4Var, (bad) objR2), dVarF, 54), cadVar, bVar8, function8, z9, z10, z11, ko1.e(-23901870, true, new c(o58Var, function2), dVarF, 54), dVarF, (i4 & 14) | 100663344 | (i4 & 896) | (i4 & 7168) | (57344 & i4) | (458752 & i4) | (3670016 & i4) | (29360128 & i4), 0);
                        if (e.k()) {
                            e.n();
                        }
                        z8 = z11;
                        z6 = z10;
                        z7 = z9;
                        function3 = function8;
                        bVar3 = bVar8;
                    } else {
                        dVarF.q();
                        z6 = z2;
                        bVar3 = bVar2;
                        function3 = function1;
                        z7 = z4;
                        z8 = z3;
                    }
                    s6bVarH = dVarF.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.v9d
                            public final Object invoke(Object obj, Object obj2) {
                                return TooltipKt.l(rg9Var, ps4Var, cadVar, bVar3, function3, z7, z6, z8, function2, i2, i3, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i4 |= 12582912;
                if ((i3 & 256) != 0) {
                    i4 |= 100663296;
                } else if ((i2 & 100663296) == 0) {
                    if (dVarF.T(function2)) {
                        i13 = 67108864;
                    } else {
                        i13 = 33554432;
                    }
                    i4 |= i13;
                }
                if ((38347923 & i4) != 38347922) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (dVarF.g(z5, i4 & 1)) {
                    if (i14 != 0) {
                        bVar2 = androidx.compose.ui.b.INSTANCE;
                    }
                    if (i5 != 0) {
                        function1 = null;
                    }
                    if (i7 != 0) {
                        z9 = false;
                    } else {
                        z9 = z4;
                    }
                    androidx.compose.ui.b bVar9 = bVar2;
                    if (i9 != 0) {
                        z10 = true;
                    } else {
                        z10 = z2;
                    }
                    if (i11 != 0) {
                        z11 = false;
                    } else {
                        z11 = z3;
                    }
                    if (e.k()) {
                        e.o(-293753984, i4, -1, "androidx.compose.material3.TooltipBox (Tooltip.kt:309)");
                    }
                    Transition transitionX6 = TransitionKt.x(cadVar.a(), "tooltip transition", dVarF, androidx.compose.p000animation.core.e.d | 48, 0);
                    objR = dVarF.R();
                    companion = androidx.compose.p004runtime.d.INSTANCE;
                    if (objR == companion.a()) {
                        objR = s0.e(null, null, 2, null);
                        dVarF.L(objR);
                    }
                    o58Var = (o58) objR;
                    objR2 = dVarF.R();
                    if (objR2 == companion.a()) {
                        objR2 = new bad(new Function0() { // from class: com.google.android.u9d
                            public final Object invoke() {
                                return TooltipKt.k(o58Var);
                            }
                        }, rg9Var);
                        dVarF.L(objR2);
                    }
                    Function0<Unit> function9 = function1;
                    BasicTooltipKt.i(rg9Var, ko1.e(-527401546, true, new b(transitionX6, ps4Var, (bad) objR2), dVarF, 54), cadVar, bVar9, function9, z9, z10, z11, ko1.e(-23901870, true, new c(o58Var, function2), dVarF, 54), dVarF, (i4 & 14) | 100663344 | (i4 & 896) | (i4 & 7168) | (57344 & i4) | (458752 & i4) | (3670016 & i4) | (29360128 & i4), 0);
                    if (e.k()) {
                        e.n();
                    }
                    z8 = z11;
                    z6 = z10;
                    z7 = z9;
                    function3 = function9;
                    bVar3 = bVar9;
                } else {
                    dVarF.q();
                    z6 = z2;
                    bVar3 = bVar2;
                    function3 = function1;
                    z7 = z4;
                    z8 = z3;
                }
                s6bVarH = dVarF.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.v9d
                        public final Object invoke(Object obj, Object obj2) {
                            return TooltipKt.l(rg9Var, ps4Var, cadVar, bVar3, function3, z7, z6, z8, function2, i2, i3, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i4 |= 196608;
            z4 = z;
            i9 = i3 & 64;
            if (i9 != 0) {
                i4 |= 1572864;
            } else if ((i2 & 1572864) == 0) {
                if (dVarF.A(z2)) {
                    i10 = 1048576;
                } else {
                    i10 = 524288;
                }
                i4 |= i10;
            }
            i11 = i3 & 128;
            if (i11 != 0) {
                if ((i2 & 12582912) == 0) {
                    if (dVarF.A(z3)) {
                        i12 = 8388608;
                    } else {
                        i12 = 4194304;
                    }
                    i4 |= i12;
                }
                if ((i3 & 256) != 0) {
                    i4 |= 100663296;
                } else if ((i2 & 100663296) == 0) {
                    if (dVarF.T(function2)) {
                        i13 = 67108864;
                    } else {
                        i13 = 33554432;
                    }
                    i4 |= i13;
                }
                if ((38347923 & i4) != 38347922) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (dVarF.g(z5, i4 & 1)) {
                    if (i14 != 0) {
                        bVar2 = androidx.compose.ui.b.INSTANCE;
                    }
                    if (i5 != 0) {
                        function1 = null;
                    }
                    if (i7 != 0) {
                        z9 = false;
                    } else {
                        z9 = z4;
                    }
                    androidx.compose.ui.b bVar10 = bVar2;
                    if (i9 != 0) {
                        z10 = true;
                    } else {
                        z10 = z2;
                    }
                    if (i11 != 0) {
                        z11 = false;
                    } else {
                        z11 = z3;
                    }
                    if (e.k()) {
                        e.o(-293753984, i4, -1, "androidx.compose.material3.TooltipBox (Tooltip.kt:309)");
                    }
                    Transition transitionX7 = TransitionKt.x(cadVar.a(), "tooltip transition", dVarF, androidx.compose.p000animation.core.e.d | 48, 0);
                    objR = dVarF.R();
                    companion = androidx.compose.p004runtime.d.INSTANCE;
                    if (objR == companion.a()) {
                        objR = s0.e(null, null, 2, null);
                        dVarF.L(objR);
                    }
                    o58Var = (o58) objR;
                    objR2 = dVarF.R();
                    if (objR2 == companion.a()) {
                        objR2 = new bad(new Function0() { // from class: com.google.android.u9d
                            public final Object invoke() {
                                return TooltipKt.k(o58Var);
                            }
                        }, rg9Var);
                        dVarF.L(objR2);
                    }
                    Function0<Unit> function10 = function1;
                    BasicTooltipKt.i(rg9Var, ko1.e(-527401546, true, new b(transitionX7, ps4Var, (bad) objR2), dVarF, 54), cadVar, bVar10, function10, z9, z10, z11, ko1.e(-23901870, true, new c(o58Var, function2), dVarF, 54), dVarF, (i4 & 14) | 100663344 | (i4 & 896) | (i4 & 7168) | (57344 & i4) | (458752 & i4) | (3670016 & i4) | (29360128 & i4), 0);
                    if (e.k()) {
                        e.n();
                    }
                    z8 = z11;
                    z6 = z10;
                    z7 = z9;
                    function3 = function10;
                    bVar3 = bVar10;
                } else {
                    dVarF.q();
                    z6 = z2;
                    bVar3 = bVar2;
                    function3 = function1;
                    z7 = z4;
                    z8 = z3;
                }
                s6bVarH = dVarF.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.v9d
                        public final Object invoke(Object obj, Object obj2) {
                            return TooltipKt.l(rg9Var, ps4Var, cadVar, bVar3, function3, z7, z6, z8, function2, i2, i3, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i4 |= 12582912;
            if ((i3 & 256) != 0) {
                i4 |= 100663296;
            } else if ((i2 & 100663296) == 0) {
                if (dVarF.T(function2)) {
                    i13 = 67108864;
                } else {
                    i13 = 33554432;
                }
                i4 |= i13;
            }
            if ((38347923 & i4) != 38347922) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (dVarF.g(z5, i4 & 1)) {
                if (i14 != 0) {
                    bVar2 = androidx.compose.ui.b.INSTANCE;
                }
                if (i5 != 0) {
                    function1 = null;
                }
                if (i7 != 0) {
                    z9 = false;
                } else {
                    z9 = z4;
                }
                androidx.compose.ui.b bVar11 = bVar2;
                if (i9 != 0) {
                    z10 = true;
                } else {
                    z10 = z2;
                }
                if (i11 != 0) {
                    z11 = false;
                } else {
                    z11 = z3;
                }
                if (e.k()) {
                    e.o(-293753984, i4, -1, "androidx.compose.material3.TooltipBox (Tooltip.kt:309)");
                }
                Transition transitionX8 = TransitionKt.x(cadVar.a(), "tooltip transition", dVarF, androidx.compose.p000animation.core.e.d | 48, 0);
                objR = dVarF.R();
                companion = androidx.compose.p004runtime.d.INSTANCE;
                if (objR == companion.a()) {
                    objR = s0.e(null, null, 2, null);
                    dVarF.L(objR);
                }
                o58Var = (o58) objR;
                objR2 = dVarF.R();
                if (objR2 == companion.a()) {
                    objR2 = new bad(new Function0() { // from class: com.google.android.u9d
                        public final Object invoke() {
                            return TooltipKt.k(o58Var);
                        }
                    }, rg9Var);
                    dVarF.L(objR2);
                }
                Function0<Unit> function11 = function1;
                BasicTooltipKt.i(rg9Var, ko1.e(-527401546, true, new b(transitionX8, ps4Var, (bad) objR2), dVarF, 54), cadVar, bVar11, function11, z9, z10, z11, ko1.e(-23901870, true, new c(o58Var, function2), dVarF, 54), dVarF, (i4 & 14) | 100663344 | (i4 & 896) | (i4 & 7168) | (57344 & i4) | (458752 & i4) | (3670016 & i4) | (29360128 & i4), 0);
                if (e.k()) {
                    e.n();
                }
                z8 = z11;
                z6 = z10;
                z7 = z9;
                function3 = function11;
                bVar3 = bVar11;
            } else {
                dVarF.q();
                z6 = z2;
                bVar3 = bVar2;
                function3 = function1;
                z7 = z4;
                z8 = z3;
            }
            s6bVarH = dVarF.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.v9d
                    public final Object invoke(Object obj, Object obj2) {
                        return TooltipKt.l(rg9Var, ps4Var, cadVar, bVar3, function3, z7, z6, z8, function2, i2, i3, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i4 |= 3072;
        bVar2 = bVar;
        i5 = i3 & 16;
        if (i5 != 0) {
            if ((i2 & 24576) == 0) {
                function1 = function0;
                if (dVarF.T(function1)) {
                    i6 = 16384;
                } else {
                    i6 = 8192;
                }
                i4 |= i6;
            }
            i7 = i3 & 32;
            if (i7 != 0) {
                if ((196608 & i2) == 0) {
                    z4 = z;
                    if (dVarF.A(z4)) {
                        i8 = 131072;
                    } else {
                        i8 = 65536;
                    }
                    i4 |= i8;
                }
                i9 = i3 & 64;
                if (i9 != 0) {
                    i4 |= 1572864;
                } else if ((i2 & 1572864) == 0) {
                    if (dVarF.A(z2)) {
                        i10 = 1048576;
                    } else {
                        i10 = 524288;
                    }
                    i4 |= i10;
                }
                i11 = i3 & 128;
                if (i11 != 0) {
                    if ((i2 & 12582912) == 0) {
                        if (dVarF.A(z3)) {
                            i12 = 8388608;
                        } else {
                            i12 = 4194304;
                        }
                        i4 |= i12;
                    }
                    if ((i3 & 256) != 0) {
                        i4 |= 100663296;
                    } else if ((i2 & 100663296) == 0) {
                        if (dVarF.T(function2)) {
                            i13 = 67108864;
                        } else {
                            i13 = 33554432;
                        }
                        i4 |= i13;
                    }
                    if ((38347923 & i4) != 38347922) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (dVarF.g(z5, i4 & 1)) {
                        if (i14 != 0) {
                            bVar2 = androidx.compose.ui.b.INSTANCE;
                        }
                        if (i5 != 0) {
                            function1 = null;
                        }
                        if (i7 != 0) {
                            z9 = false;
                        } else {
                            z9 = z4;
                        }
                        androidx.compose.ui.b bVar12 = bVar2;
                        if (i9 != 0) {
                            z10 = true;
                        } else {
                            z10 = z2;
                        }
                        if (i11 != 0) {
                            z11 = false;
                        } else {
                            z11 = z3;
                        }
                        if (e.k()) {
                            e.o(-293753984, i4, -1, "androidx.compose.material3.TooltipBox (Tooltip.kt:309)");
                        }
                        Transition transitionX9 = TransitionKt.x(cadVar.a(), "tooltip transition", dVarF, androidx.compose.p000animation.core.e.d | 48, 0);
                        objR = dVarF.R();
                        companion = androidx.compose.p004runtime.d.INSTANCE;
                        if (objR == companion.a()) {
                            objR = s0.e(null, null, 2, null);
                            dVarF.L(objR);
                        }
                        o58Var = (o58) objR;
                        objR2 = dVarF.R();
                        if (objR2 == companion.a()) {
                            objR2 = new bad(new Function0() { // from class: com.google.android.u9d
                                public final Object invoke() {
                                    return TooltipKt.k(o58Var);
                                }
                            }, rg9Var);
                            dVarF.L(objR2);
                        }
                        Function0<Unit> function12 = function1;
                        BasicTooltipKt.i(rg9Var, ko1.e(-527401546, true, new b(transitionX9, ps4Var, (bad) objR2), dVarF, 54), cadVar, bVar12, function12, z9, z10, z11, ko1.e(-23901870, true, new c(o58Var, function2), dVarF, 54), dVarF, (i4 & 14) | 100663344 | (i4 & 896) | (i4 & 7168) | (57344 & i4) | (458752 & i4) | (3670016 & i4) | (29360128 & i4), 0);
                        if (e.k()) {
                            e.n();
                        }
                        z8 = z11;
                        z6 = z10;
                        z7 = z9;
                        function3 = function12;
                        bVar3 = bVar12;
                    } else {
                        dVarF.q();
                        z6 = z2;
                        bVar3 = bVar2;
                        function3 = function1;
                        z7 = z4;
                        z8 = z3;
                    }
                    s6bVarH = dVarF.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.v9d
                            public final Object invoke(Object obj, Object obj2) {
                                return TooltipKt.l(rg9Var, ps4Var, cadVar, bVar3, function3, z7, z6, z8, function2, i2, i3, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i4 |= 12582912;
                if ((i3 & 256) != 0) {
                    i4 |= 100663296;
                } else if ((i2 & 100663296) == 0) {
                    if (dVarF.T(function2)) {
                        i13 = 67108864;
                    } else {
                        i13 = 33554432;
                    }
                    i4 |= i13;
                }
                if ((38347923 & i4) != 38347922) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (dVarF.g(z5, i4 & 1)) {
                    if (i14 != 0) {
                        bVar2 = androidx.compose.ui.b.INSTANCE;
                    }
                    if (i5 != 0) {
                        function1 = null;
                    }
                    if (i7 != 0) {
                        z9 = false;
                    } else {
                        z9 = z4;
                    }
                    androidx.compose.ui.b bVar13 = bVar2;
                    if (i9 != 0) {
                        z10 = true;
                    } else {
                        z10 = z2;
                    }
                    if (i11 != 0) {
                        z11 = false;
                    } else {
                        z11 = z3;
                    }
                    if (e.k()) {
                        e.o(-293753984, i4, -1, "androidx.compose.material3.TooltipBox (Tooltip.kt:309)");
                    }
                    Transition transitionX10 = TransitionKt.x(cadVar.a(), "tooltip transition", dVarF, androidx.compose.p000animation.core.e.d | 48, 0);
                    objR = dVarF.R();
                    companion = androidx.compose.p004runtime.d.INSTANCE;
                    if (objR == companion.a()) {
                        objR = s0.e(null, null, 2, null);
                        dVarF.L(objR);
                    }
                    o58Var = (o58) objR;
                    objR2 = dVarF.R();
                    if (objR2 == companion.a()) {
                        objR2 = new bad(new Function0() { // from class: com.google.android.u9d
                            public final Object invoke() {
                                return TooltipKt.k(o58Var);
                            }
                        }, rg9Var);
                        dVarF.L(objR2);
                    }
                    Function0<Unit> function13 = function1;
                    BasicTooltipKt.i(rg9Var, ko1.e(-527401546, true, new b(transitionX10, ps4Var, (bad) objR2), dVarF, 54), cadVar, bVar13, function13, z9, z10, z11, ko1.e(-23901870, true, new c(o58Var, function2), dVarF, 54), dVarF, (i4 & 14) | 100663344 | (i4 & 896) | (i4 & 7168) | (57344 & i4) | (458752 & i4) | (3670016 & i4) | (29360128 & i4), 0);
                    if (e.k()) {
                        e.n();
                    }
                    z8 = z11;
                    z6 = z10;
                    z7 = z9;
                    function3 = function13;
                    bVar3 = bVar13;
                } else {
                    dVarF.q();
                    z6 = z2;
                    bVar3 = bVar2;
                    function3 = function1;
                    z7 = z4;
                    z8 = z3;
                }
                s6bVarH = dVarF.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.v9d
                        public final Object invoke(Object obj, Object obj2) {
                            return TooltipKt.l(rg9Var, ps4Var, cadVar, bVar3, function3, z7, z6, z8, function2, i2, i3, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i4 |= 196608;
            z4 = z;
            i9 = i3 & 64;
            if (i9 != 0) {
                i4 |= 1572864;
            } else if ((i2 & 1572864) == 0) {
                if (dVarF.A(z2)) {
                    i10 = 1048576;
                } else {
                    i10 = 524288;
                }
                i4 |= i10;
            }
            i11 = i3 & 128;
            if (i11 != 0) {
                if ((i2 & 12582912) == 0) {
                    if (dVarF.A(z3)) {
                        i12 = 8388608;
                    } else {
                        i12 = 4194304;
                    }
                    i4 |= i12;
                }
                if ((i3 & 256) != 0) {
                    i4 |= 100663296;
                } else if ((i2 & 100663296) == 0) {
                    if (dVarF.T(function2)) {
                        i13 = 67108864;
                    } else {
                        i13 = 33554432;
                    }
                    i4 |= i13;
                }
                if ((38347923 & i4) != 38347922) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (dVarF.g(z5, i4 & 1)) {
                    if (i14 != 0) {
                        bVar2 = androidx.compose.ui.b.INSTANCE;
                    }
                    if (i5 != 0) {
                        function1 = null;
                    }
                    if (i7 != 0) {
                        z9 = false;
                    } else {
                        z9 = z4;
                    }
                    androidx.compose.ui.b bVar14 = bVar2;
                    if (i9 != 0) {
                        z10 = true;
                    } else {
                        z10 = z2;
                    }
                    if (i11 != 0) {
                        z11 = false;
                    } else {
                        z11 = z3;
                    }
                    if (e.k()) {
                        e.o(-293753984, i4, -1, "androidx.compose.material3.TooltipBox (Tooltip.kt:309)");
                    }
                    Transition transitionX11 = TransitionKt.x(cadVar.a(), "tooltip transition", dVarF, androidx.compose.p000animation.core.e.d | 48, 0);
                    objR = dVarF.R();
                    companion = androidx.compose.p004runtime.d.INSTANCE;
                    if (objR == companion.a()) {
                        objR = s0.e(null, null, 2, null);
                        dVarF.L(objR);
                    }
                    o58Var = (o58) objR;
                    objR2 = dVarF.R();
                    if (objR2 == companion.a()) {
                        objR2 = new bad(new Function0() { // from class: com.google.android.u9d
                            public final Object invoke() {
                                return TooltipKt.k(o58Var);
                            }
                        }, rg9Var);
                        dVarF.L(objR2);
                    }
                    Function0<Unit> function14 = function1;
                    BasicTooltipKt.i(rg9Var, ko1.e(-527401546, true, new b(transitionX11, ps4Var, (bad) objR2), dVarF, 54), cadVar, bVar14, function14, z9, z10, z11, ko1.e(-23901870, true, new c(o58Var, function2), dVarF, 54), dVarF, (i4 & 14) | 100663344 | (i4 & 896) | (i4 & 7168) | (57344 & i4) | (458752 & i4) | (3670016 & i4) | (29360128 & i4), 0);
                    if (e.k()) {
                        e.n();
                    }
                    z8 = z11;
                    z6 = z10;
                    z7 = z9;
                    function3 = function14;
                    bVar3 = bVar14;
                } else {
                    dVarF.q();
                    z6 = z2;
                    bVar3 = bVar2;
                    function3 = function1;
                    z7 = z4;
                    z8 = z3;
                }
                s6bVarH = dVarF.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.v9d
                        public final Object invoke(Object obj, Object obj2) {
                            return TooltipKt.l(rg9Var, ps4Var, cadVar, bVar3, function3, z7, z6, z8, function2, i2, i3, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i4 |= 12582912;
            if ((i3 & 256) != 0) {
                i4 |= 100663296;
            } else if ((i2 & 100663296) == 0) {
                if (dVarF.T(function2)) {
                    i13 = 67108864;
                } else {
                    i13 = 33554432;
                }
                i4 |= i13;
            }
            if ((38347923 & i4) != 38347922) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (dVarF.g(z5, i4 & 1)) {
                if (i14 != 0) {
                    bVar2 = androidx.compose.ui.b.INSTANCE;
                }
                if (i5 != 0) {
                    function1 = null;
                }
                if (i7 != 0) {
                    z9 = false;
                } else {
                    z9 = z4;
                }
                androidx.compose.ui.b bVar15 = bVar2;
                if (i9 != 0) {
                    z10 = true;
                } else {
                    z10 = z2;
                }
                if (i11 != 0) {
                    z11 = false;
                } else {
                    z11 = z3;
                }
                if (e.k()) {
                    e.o(-293753984, i4, -1, "androidx.compose.material3.TooltipBox (Tooltip.kt:309)");
                }
                Transition transitionX12 = TransitionKt.x(cadVar.a(), "tooltip transition", dVarF, androidx.compose.p000animation.core.e.d | 48, 0);
                objR = dVarF.R();
                companion = androidx.compose.p004runtime.d.INSTANCE;
                if (objR == companion.a()) {
                    objR = s0.e(null, null, 2, null);
                    dVarF.L(objR);
                }
                o58Var = (o58) objR;
                objR2 = dVarF.R();
                if (objR2 == companion.a()) {
                    objR2 = new bad(new Function0() { // from class: com.google.android.u9d
                        public final Object invoke() {
                            return TooltipKt.k(o58Var);
                        }
                    }, rg9Var);
                    dVarF.L(objR2);
                }
                Function0<Unit> function15 = function1;
                BasicTooltipKt.i(rg9Var, ko1.e(-527401546, true, new b(transitionX12, ps4Var, (bad) objR2), dVarF, 54), cadVar, bVar15, function15, z9, z10, z11, ko1.e(-23901870, true, new c(o58Var, function2), dVarF, 54), dVarF, (i4 & 14) | 100663344 | (i4 & 896) | (i4 & 7168) | (57344 & i4) | (458752 & i4) | (3670016 & i4) | (29360128 & i4), 0);
                if (e.k()) {
                    e.n();
                }
                z8 = z11;
                z6 = z10;
                z7 = z9;
                function3 = function15;
                bVar3 = bVar15;
            } else {
                dVarF.q();
                z6 = z2;
                bVar3 = bVar2;
                function3 = function1;
                z7 = z4;
                z8 = z3;
            }
            s6bVarH = dVarF.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.v9d
                    public final Object invoke(Object obj, Object obj2) {
                        return TooltipKt.l(rg9Var, ps4Var, cadVar, bVar3, function3, z7, z6, z8, function2, i2, i3, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i4 |= 24576;
        function1 = function0;
        i7 = i3 & 32;
        if (i7 != 0) {
            if ((196608 & i2) == 0) {
                z4 = z;
                if (dVarF.A(z4)) {
                    i8 = 131072;
                } else {
                    i8 = 65536;
                }
                i4 |= i8;
            }
            i9 = i3 & 64;
            if (i9 != 0) {
                i4 |= 1572864;
            } else if ((i2 & 1572864) == 0) {
                if (dVarF.A(z2)) {
                    i10 = 1048576;
                } else {
                    i10 = 524288;
                }
                i4 |= i10;
            }
            i11 = i3 & 128;
            if (i11 != 0) {
                if ((i2 & 12582912) == 0) {
                    if (dVarF.A(z3)) {
                        i12 = 8388608;
                    } else {
                        i12 = 4194304;
                    }
                    i4 |= i12;
                }
                if ((i3 & 256) != 0) {
                    i4 |= 100663296;
                } else if ((i2 & 100663296) == 0) {
                    if (dVarF.T(function2)) {
                        i13 = 67108864;
                    } else {
                        i13 = 33554432;
                    }
                    i4 |= i13;
                }
                if ((38347923 & i4) != 38347922) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (dVarF.g(z5, i4 & 1)) {
                    if (i14 != 0) {
                        bVar2 = androidx.compose.ui.b.INSTANCE;
                    }
                    if (i5 != 0) {
                        function1 = null;
                    }
                    if (i7 != 0) {
                        z9 = false;
                    } else {
                        z9 = z4;
                    }
                    androidx.compose.ui.b bVar16 = bVar2;
                    if (i9 != 0) {
                        z10 = true;
                    } else {
                        z10 = z2;
                    }
                    if (i11 != 0) {
                        z11 = false;
                    } else {
                        z11 = z3;
                    }
                    if (e.k()) {
                        e.o(-293753984, i4, -1, "androidx.compose.material3.TooltipBox (Tooltip.kt:309)");
                    }
                    Transition transitionX13 = TransitionKt.x(cadVar.a(), "tooltip transition", dVarF, androidx.compose.p000animation.core.e.d | 48, 0);
                    objR = dVarF.R();
                    companion = androidx.compose.p004runtime.d.INSTANCE;
                    if (objR == companion.a()) {
                        objR = s0.e(null, null, 2, null);
                        dVarF.L(objR);
                    }
                    o58Var = (o58) objR;
                    objR2 = dVarF.R();
                    if (objR2 == companion.a()) {
                        objR2 = new bad(new Function0() { // from class: com.google.android.u9d
                            public final Object invoke() {
                                return TooltipKt.k(o58Var);
                            }
                        }, rg9Var);
                        dVarF.L(objR2);
                    }
                    Function0<Unit> function16 = function1;
                    BasicTooltipKt.i(rg9Var, ko1.e(-527401546, true, new b(transitionX13, ps4Var, (bad) objR2), dVarF, 54), cadVar, bVar16, function16, z9, z10, z11, ko1.e(-23901870, true, new c(o58Var, function2), dVarF, 54), dVarF, (i4 & 14) | 100663344 | (i4 & 896) | (i4 & 7168) | (57344 & i4) | (458752 & i4) | (3670016 & i4) | (29360128 & i4), 0);
                    if (e.k()) {
                        e.n();
                    }
                    z8 = z11;
                    z6 = z10;
                    z7 = z9;
                    function3 = function16;
                    bVar3 = bVar16;
                } else {
                    dVarF.q();
                    z6 = z2;
                    bVar3 = bVar2;
                    function3 = function1;
                    z7 = z4;
                    z8 = z3;
                }
                s6bVarH = dVarF.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.v9d
                        public final Object invoke(Object obj, Object obj2) {
                            return TooltipKt.l(rg9Var, ps4Var, cadVar, bVar3, function3, z7, z6, z8, function2, i2, i3, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i4 |= 12582912;
            if ((i3 & 256) != 0) {
                i4 |= 100663296;
            } else if ((i2 & 100663296) == 0) {
                if (dVarF.T(function2)) {
                    i13 = 67108864;
                } else {
                    i13 = 33554432;
                }
                i4 |= i13;
            }
            if ((38347923 & i4) != 38347922) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (dVarF.g(z5, i4 & 1)) {
                if (i14 != 0) {
                    bVar2 = androidx.compose.ui.b.INSTANCE;
                }
                if (i5 != 0) {
                    function1 = null;
                }
                if (i7 != 0) {
                    z9 = false;
                } else {
                    z9 = z4;
                }
                androidx.compose.ui.b bVar17 = bVar2;
                if (i9 != 0) {
                    z10 = true;
                } else {
                    z10 = z2;
                }
                if (i11 != 0) {
                    z11 = false;
                } else {
                    z11 = z3;
                }
                if (e.k()) {
                    e.o(-293753984, i4, -1, "androidx.compose.material3.TooltipBox (Tooltip.kt:309)");
                }
                Transition transitionX14 = TransitionKt.x(cadVar.a(), "tooltip transition", dVarF, androidx.compose.p000animation.core.e.d | 48, 0);
                objR = dVarF.R();
                companion = androidx.compose.p004runtime.d.INSTANCE;
                if (objR == companion.a()) {
                    objR = s0.e(null, null, 2, null);
                    dVarF.L(objR);
                }
                o58Var = (o58) objR;
                objR2 = dVarF.R();
                if (objR2 == companion.a()) {
                    objR2 = new bad(new Function0() { // from class: com.google.android.u9d
                        public final Object invoke() {
                            return TooltipKt.k(o58Var);
                        }
                    }, rg9Var);
                    dVarF.L(objR2);
                }
                Function0<Unit> function17 = function1;
                BasicTooltipKt.i(rg9Var, ko1.e(-527401546, true, new b(transitionX14, ps4Var, (bad) objR2), dVarF, 54), cadVar, bVar17, function17, z9, z10, z11, ko1.e(-23901870, true, new c(o58Var, function2), dVarF, 54), dVarF, (i4 & 14) | 100663344 | (i4 & 896) | (i4 & 7168) | (57344 & i4) | (458752 & i4) | (3670016 & i4) | (29360128 & i4), 0);
                if (e.k()) {
                    e.n();
                }
                z8 = z11;
                z6 = z10;
                z7 = z9;
                function3 = function17;
                bVar3 = bVar17;
            } else {
                dVarF.q();
                z6 = z2;
                bVar3 = bVar2;
                function3 = function1;
                z7 = z4;
                z8 = z3;
            }
            s6bVarH = dVarF.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.v9d
                    public final Object invoke(Object obj, Object obj2) {
                        return TooltipKt.l(rg9Var, ps4Var, cadVar, bVar3, function3, z7, z6, z8, function2, i2, i3, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i4 |= 196608;
        z4 = z;
        i9 = i3 & 64;
        if (i9 != 0) {
            i4 |= 1572864;
        } else if ((i2 & 1572864) == 0) {
            if (dVarF.A(z2)) {
                i10 = 1048576;
            } else {
                i10 = 524288;
            }
            i4 |= i10;
        }
        i11 = i3 & 128;
        if (i11 != 0) {
            if ((i2 & 12582912) == 0) {
                if (dVarF.A(z3)) {
                    i12 = 8388608;
                } else {
                    i12 = 4194304;
                }
                i4 |= i12;
            }
            if ((i3 & 256) != 0) {
                i4 |= 100663296;
            } else if ((i2 & 100663296) == 0) {
                if (dVarF.T(function2)) {
                    i13 = 67108864;
                } else {
                    i13 = 33554432;
                }
                i4 |= i13;
            }
            if ((38347923 & i4) != 38347922) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (dVarF.g(z5, i4 & 1)) {
                if (i14 != 0) {
                    bVar2 = androidx.compose.ui.b.INSTANCE;
                }
                if (i5 != 0) {
                    function1 = null;
                }
                if (i7 != 0) {
                    z9 = false;
                } else {
                    z9 = z4;
                }
                androidx.compose.ui.b bVar18 = bVar2;
                if (i9 != 0) {
                    z10 = true;
                } else {
                    z10 = z2;
                }
                if (i11 != 0) {
                    z11 = false;
                } else {
                    z11 = z3;
                }
                if (e.k()) {
                    e.o(-293753984, i4, -1, "androidx.compose.material3.TooltipBox (Tooltip.kt:309)");
                }
                Transition transitionX15 = TransitionKt.x(cadVar.a(), "tooltip transition", dVarF, androidx.compose.p000animation.core.e.d | 48, 0);
                objR = dVarF.R();
                companion = androidx.compose.p004runtime.d.INSTANCE;
                if (objR == companion.a()) {
                    objR = s0.e(null, null, 2, null);
                    dVarF.L(objR);
                }
                o58Var = (o58) objR;
                objR2 = dVarF.R();
                if (objR2 == companion.a()) {
                    objR2 = new bad(new Function0() { // from class: com.google.android.u9d
                        public final Object invoke() {
                            return TooltipKt.k(o58Var);
                        }
                    }, rg9Var);
                    dVarF.L(objR2);
                }
                Function0<Unit> function18 = function1;
                BasicTooltipKt.i(rg9Var, ko1.e(-527401546, true, new b(transitionX15, ps4Var, (bad) objR2), dVarF, 54), cadVar, bVar18, function18, z9, z10, z11, ko1.e(-23901870, true, new c(o58Var, function2), dVarF, 54), dVarF, (i4 & 14) | 100663344 | (i4 & 896) | (i4 & 7168) | (57344 & i4) | (458752 & i4) | (3670016 & i4) | (29360128 & i4), 0);
                if (e.k()) {
                    e.n();
                }
                z8 = z11;
                z6 = z10;
                z7 = z9;
                function3 = function18;
                bVar3 = bVar18;
            } else {
                dVarF.q();
                z6 = z2;
                bVar3 = bVar2;
                function3 = function1;
                z7 = z4;
                z8 = z3;
            }
            s6bVarH = dVarF.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.v9d
                    public final Object invoke(Object obj, Object obj2) {
                        return TooltipKt.l(rg9Var, ps4Var, cadVar, bVar3, function3, z7, z6, z8, function2, i2, i3, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i4 |= 12582912;
        if ((i3 & 256) != 0) {
            i4 |= 100663296;
        } else if ((i2 & 100663296) == 0) {
            if (dVarF.T(function2)) {
                i13 = 67108864;
            } else {
                i13 = 33554432;
            }
            i4 |= i13;
        }
        if ((38347923 & i4) != 38347922) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (dVarF.g(z5, i4 & 1)) {
            if (i14 != 0) {
                bVar2 = androidx.compose.ui.b.INSTANCE;
            }
            if (i5 != 0) {
                function1 = null;
            }
            if (i7 != 0) {
                z9 = false;
            } else {
                z9 = z4;
            }
            androidx.compose.ui.b bVar19 = bVar2;
            if (i9 != 0) {
                z10 = true;
            } else {
                z10 = z2;
            }
            if (i11 != 0) {
                z11 = false;
            } else {
                z11 = z3;
            }
            if (e.k()) {
                e.o(-293753984, i4, -1, "androidx.compose.material3.TooltipBox (Tooltip.kt:309)");
            }
            Transition transitionX16 = TransitionKt.x(cadVar.a(), "tooltip transition", dVarF, androidx.compose.p000animation.core.e.d | 48, 0);
            objR = dVarF.R();
            companion = androidx.compose.p004runtime.d.INSTANCE;
            if (objR == companion.a()) {
                objR = s0.e(null, null, 2, null);
                dVarF.L(objR);
            }
            o58Var = (o58) objR;
            objR2 = dVarF.R();
            if (objR2 == companion.a()) {
                objR2 = new bad(new Function0() { // from class: com.google.android.u9d
                    public final Object invoke() {
                        return TooltipKt.k(o58Var);
                    }
                }, rg9Var);
                dVarF.L(objR2);
            }
            Function0<Unit> function19 = function1;
            BasicTooltipKt.i(rg9Var, ko1.e(-527401546, true, new b(transitionX16, ps4Var, (bad) objR2), dVarF, 54), cadVar, bVar19, function19, z9, z10, z11, ko1.e(-23901870, true, new c(o58Var, function2), dVarF, 54), dVarF, (i4 & 14) | 100663344 | (i4 & 896) | (i4 & 7168) | (57344 & i4) | (458752 & i4) | (3670016 & i4) | (29360128 & i4), 0);
            if (e.k()) {
                e.n();
            }
            z8 = z11;
            z6 = z10;
            z7 = z9;
            function3 = function19;
            bVar3 = bVar19;
        } else {
            dVarF.q();
            z6 = z2;
            bVar3 = bVar2;
            function3 = function1;
            z7 = z4;
            z8 = z3;
        }
        s6bVarH = dVarF.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2() { // from class: com.google.android.v9d
                public final Object invoke(Object obj, Object obj2) {
                    return TooltipKt.l(rg9Var, ps4Var, cadVar, bVar3, function3, z7, z6, z8, function2, i2, i3, (d) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kn6 k(o58 o58Var) {
        return (kn6) o58Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(rg9 rg9Var, ps4 ps4Var, cad cadVar, androidx.compose.ui.b bVar, Function0 function0, boolean z, boolean z2, boolean z3, Function2 function2, int i2, int i3, androidx.compose.p004runtime.d dVar, int i4) {
        j(rg9Var, ps4Var, cadVar, bVar, function0, z, z2, z3, function2, dVar, saa.a(i2 | 1), i3);
        return Unit.a;
    }

    public static final androidx.compose.ui.b m(androidx.compose.ui.b bVar, final Transition<Boolean> transition) {
        return ComposedModifierKt.b(bVar, InspectableValueKt.b() ? new Function1<jz5, Unit>() { // from class: androidx.compose.material3.TooltipKt$animateTooltip$$inlined$debugInspectorInfo$1
            {
                super(1);
            }

            public final void a(jz5 jz5Var) {
                jz5Var.b("animateTooltip");
                jz5Var.getProperties().c("transition", transition);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((jz5) obj);
                return Unit.a;
            }
        } : InspectableValueKt.a(), new d(transition));
    }

    public static final float n(float f2, int i2, gba gbaVar) {
        float fMin;
        float left = gbaVar.getLeft();
        float right = gbaVar.getRight();
        float f3 = 2;
        float f4 = (left + right) / f3;
        float f5 = i2;
        if (f2 >= f5) {
            return f4;
        }
        float f6 = f2 / f3;
        if (f4 - f6 < 0.0f) {
            fMin = Math.max(f2 - f5, -left);
        } else {
            if (f4 + f6 <= f5) {
                return f6;
            }
            fMin = Math.min(f2 - right, 0.0f);
        }
        return f4 + fMin;
    }

    public static final rx8 o() {
        return f;
    }

    public static final float p() {
        return a;
    }

    public static final float q() {
        return b;
    }

    public static final float r() {
        return c;
    }

    private static final androidx.compose.ui.b s(androidx.compose.ui.b bVar, final o58<zh7> o58Var, final f43 f43Var, final long j2, final Function1<? super androidx.compose.ui.layout.j, ? extends kn6> function1, final rg9 rg9Var) {
        return zn6.a(bVar, new ps4() { // from class: com.google.android.y9d
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return TooltipKt.t(j2, function1, f43Var, rg9Var, o58Var, (androidx.compose.ui.layout.j) obj, (dj7) obj2, (kx1) obj3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:19:0x009a A[PHI: r24 r25
  0x009a: PHI (r24v3 float) = (r24v1 float), (r24v4 float), (r24v4 float), (r24v4 float) binds: [B:30:0x00c5, B:26:0x00b5, B:23:0x00ad, B:18:0x0098] A[DONT_GENERATE, DONT_INLINE]
  0x009a: PHI (r25v2 char) = (r25v0 char), (r25v3 char), (r25v3 char), (r25v3 char) binds: [B:30:0x00c5, B:26:0x00b5, B:23:0x00ad, B:18:0x0098] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0150, code lost:
    
        r7 = r9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.google.inputmethod.fj7 t(long r24, kotlin.jvm.functions.Function1 r26, com.google.inputmethod.f43 r27, com.google.inputmethod.rg9 r28, com.google.inputmethod.o58 r29, androidx.compose.ui.layout.j r30, com.google.inputmethod.dj7 r31, com.google.inputmethod.kx1 r32) {
        /*
            Method dump skipped, instruction units count: 715
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002material3.TooltipKt.t(long, kotlin.jvm.functions.Function1, com.google.android.f43, com.google.android.rg9, com.google.android.o58, androidx.compose.ui.layout.j, com.google.android.dj7, com.google.android.kx1):com.google.android.fj7");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit u(o oVar, o.a aVar) {
        o.a.z(aVar, oVar, 0, 0, 0.0f, 4, null);
        return Unit.a;
    }

    public static final cad v(boolean z, boolean z2, MutatorMutex mutatorMutex, androidx.compose.p004runtime.d dVar, int i2, int i3) {
        if ((i3 & 1) != 0) {
            z = false;
        }
        if ((i3 & 2) != 0) {
            z2 = false;
        }
        if ((i3 & 4) != 0) {
            mutatorMutex = ri0.a.a();
        }
        if (e.k()) {
            e.o(-1413230530, i2, -1, "androidx.compose.material3.rememberTooltipState (Tooltip.kt:962)");
        }
        boolean z3 = ((((i2 & 112) ^ 48) > 32 && dVar.A(z2)) || (i2 & 48) == 32) | ((((i2 & 896) ^ 384) > 256 && dVar.x(mutatorMutex)) || (i2 & 384) == 256);
        Object objR = dVar.R();
        if (z3 || objR == androidx.compose.p004runtime.d.INSTANCE.a()) {
            objR = new TooltipStateImpl(z, z2, mutatorMutex);
            dVar.L(objR);
        }
        TooltipStateImpl tooltipStateImpl = (TooltipStateImpl) objR;
        if (e.k()) {
            e.n();
        }
        return tooltipStateImpl;
    }
}
