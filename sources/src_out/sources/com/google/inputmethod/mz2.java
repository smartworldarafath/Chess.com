package com.google.inputmethod;

import androidx.compose.p001foundation.layout.BoxScopeInstance;
import androidx.compose.p001foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.p001foundation.layout.j;
import androidx.compose.p001foundation.layout.t0;
import androidx.compose.p002material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import androidx.compose.p004runtime.p0;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.text.TextStyle;
import com.google.android.ps4;
import com.google.android.q22;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0017¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n²\u0006\f\u0010\t\u001a\u00020\b8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/google/android/mz2;", "Lcom/google/android/fsb;", "<init>", "()V", "Lcom/google/android/gsb;", "", "a", "(Lcom/google/android/gsb;Landroidx/compose/runtime/d;I)V", "Lcom/google/android/ei1;", "targetColor", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class mz2 implements fsb {
    public static final mz2 a = new mz2();

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class a implements PointerInputEventHandler {
        public static final a a = new a();

        a() {
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(df9 df9Var, q22<? super Unit> q22Var) {
            return Unit.a;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class b implements Function2<d, Integer, Unit> {
        final /* synthetic */ gsb a;

        b(gsb gsbVar) {
            this.a = gsbVar;
        }

        public final void a(d dVar, int i) {
            if (!dVar.g((i & 3) != 2, i & 1)) {
                dVar.q();
                return;
            }
            if (e.k()) {
                e.o(-1658896622, i, -1, "androidx.compose.material3.DefaultSingleRowTopAppBarOverride.SingleRowTopAppBar.<anonymous> (AppBar.kt:2537)");
            }
            androidx.compose.foundation.layout.c.e eVarF = androidx.compose.p001foundation.layout.c.a.f();
            tc.c cVarI = tc.INSTANCE.i();
            ps4<hra, d, Integer, Unit> ps4VarA = this.a.a();
            androidx.compose.ui.b.Companion companion = androidx.compose.ui.b.INSTANCE;
            ej7 ej7VarB = t0.b(eVarF, cVarI, dVar, 54);
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
            d dVarC = dud.c(dVar);
            dud.i(dVarC, ej7VarB, companion2.d());
            dud.i(dVarC, gs1VarJ, companion2.f());
            Function2<ComposeUiNode, Integer, Unit> function2C = companion2.c();
            if (dVarC.getInserting() || !Intrinsics.e(dVarC.R(), Integer.valueOf(iA))) {
                dVarC.L(Integer.valueOf(iA));
                dVarC.e(Integer.valueOf(iA), function2C);
            }
            dud.i(dVarC, bVarE, companion2.e());
            ps4VarA.invoke(ira.a, dVar, 6);
            dVar.m();
            if (e.k()) {
                e.n();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((d) obj, ((Number) obj2).intValue());
            return Unit.a;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class c implements Function0<ei1> {
        final /* synthetic */ gsb a;

        c(gsb gsbVar) {
            this.a = gsbVar;
        }

        public final long a() {
            this.a.f();
            return this.a.getColors().a(0.0f > 0.01f ? 1.0f : 0.0f);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            return ei1.l(a());
        }
    }

    private mz2() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float g(gsb gsbVar) {
        gsbVar.f();
        return 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float h() {
        return 1.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(mz2 mz2Var, gsb gsbVar, int i, d dVar, int i2) {
        mz2Var.a(gsbVar, dVar, saa.a(i | 1));
        return Unit.a;
    }

    private static final long j(q6c<ei1> q6cVar) {
        return q6cVar.getValue().getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(q6c q6cVar, DrawScope drawScope) {
        long value = ((ei1) q6cVar.getValue()).getValue();
        if (!ei1.r(value, ei1.INSTANCE.i())) {
            DrawScope.T0(drawScope, value, 0L, 0L, 0.0f, null, null, 0, 126, null);
        }
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(nfb nfbVar) {
        SemanticsPropertiesKt.F0(nfbVar, true);
        return Unit.a;
    }

    @Override // com.google.inputmethod.fsb
    public void a(final gsb gsbVar, d dVar, final int i) {
        int i2;
        d dVarF = dVar.F(2137486921);
        if ((i & 6) == 0) {
            i2 = (dVarF.x(gsbVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (dVarF.g((i2 & 3) != 2, i2 & 1)) {
            if (e.k()) {
                e.o(2137486921, i2, -1, "androidx.compose.material3.DefaultSingleRowTopAppBarOverride.SingleRowTopAppBar (AppBar.kt:2510)");
            }
            if (Float.isNaN(gsbVar.getExpandedHeight()) || (Float.floatToRawIntBits(gsbVar.getExpandedHeight()) & Integer.MAX_VALUE) >= 2139095040) {
                throw new IllegalArgumentException("The expandedHeight is expected to be specified and finite");
            }
            oad colors = gsbVar.getColors();
            gsbVar.f();
            boolean zX = dVarF.x(colors) | dVarF.x(null);
            Object objR = dVarF.R();
            if (zX || objR == d.INSTANCE.a()) {
                objR = p0.e(new c(gsbVar));
                dVarF.L(objR);
            }
            final q6c<ei1> q6cVarB = osb.b(j((q6c) objR), d08.b(MotionSchemeKeyTokens.DefaultEffects, dVarF, 6), null, null, dVarF, 0, 12);
            do1 do1VarE = ko1.e(-1658896622, true, new b(gsbVar), dVarF, 54);
            gsbVar.f();
            dVarF.y(690108113);
            dVarF.u();
            androidx.compose.ui.b.Companion companion = androidx.compose.ui.b.INSTANCE;
            androidx.compose.ui.b bVarThen = gsbVar.getModifier().then(companion);
            boolean zX2 = dVarF.x(q6cVarB);
            Object objR2 = dVarF.R();
            if (zX2 || objR2 == d.INSTANCE.a()) {
                objR2 = new Function1() { // from class: com.google.android.hz2
                    public final Object invoke(Object obj) {
                        return mz2.k(q6cVarB, (DrawScope) obj);
                    }
                };
                dVarF.L(objR2);
            }
            androidx.compose.ui.b bVarB = androidx.compose.ui.draw.c.b(bVarThen, (Function1) objR2);
            Object objR3 = dVarF.R();
            d.Companion companion2 = d.INSTANCE;
            if (objR3 == companion2.a()) {
                objR3 = new Function1() { // from class: com.google.android.iz2
                    public final Object invoke(Object obj) {
                        return mz2.l((nfb) obj);
                    }
                };
                dVarF.L(objR3);
            }
            androidx.compose.ui.b bVarD = afb.d(bVarB, false, (Function1) objR3, 1, null);
            Unit unit = Unit.a;
            Object objR4 = dVarF.R();
            if (objR4 == companion2.a()) {
                objR4 = a.a;
                dVarF.L(objR4);
            }
            androidx.compose.ui.b bVarC = ugc.c(bVarD, unit, (PointerInputEventHandler) objR4);
            ej7 ej7VarI = j.i(tc.INSTANCE.o(), false);
            int iA = pp1.a(dVarF, 0);
            gs1 gs1VarJ = dVarF.j();
            androidx.compose.ui.b bVarE = ComposedModifierKt.e(dVarF, bVarC);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> function0B = companion3.b();
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
            dud.i(dVarC, ej7VarI, companion3.d());
            dud.i(dVarC, gs1VarJ, companion3.f());
            Function2<ComposeUiNode, Integer, Unit> function2C = companion3.c();
            if (dVarC.getInserting() || !Intrinsics.e(dVarC.R(), Integer.valueOf(iA))) {
                dVarC.L(Integer.valueOf(iA));
                dVarC.e(Integer.valueOf(iA), function2C);
            }
            dud.i(dVarC, bVarE, companion3.e());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.a;
            androidx.compose.ui.b bVarB2 = ff1.b(WindowInsetsPaddingKt.d(companion, gsbVar.getWindowInsets()));
            gsbVar.f();
            androidx.compose.ui.b bVarZ = zu.z(bVarB2, null);
            boolean z = (i2 & 14) == 4;
            Object objR5 = dVarF.R();
            if (z || objR5 == companion2.a()) {
                objR5 = new hh4() { // from class: com.google.android.jz2
                    @Override // com.google.inputmethod.hh4
                    public final float invoke() {
                        return mz2.g(gsbVar);
                    }
                };
                dVarF.L(objR5);
            }
            hh4 hh4Var = (hh4) objR5;
            long navigationIconContentColor = gsbVar.getColors().getNavigationIconContentColor();
            long titleContentColor = gsbVar.getColors().getTitleContentColor();
            long actionIconContentColor = gsbVar.getColors().getActionIconContentColor();
            long subtitleContentColor = gsbVar.getColors().getSubtitleContentColor();
            Function2<d, Integer, Unit> function2I = gsbVar.i();
            TextStyle titleTextStyle = gsbVar.getTitleTextStyle();
            Function2<d, Integer, Unit> function2G = gsbVar.g();
            TextStyle subtitleTextStyle = gsbVar.getSubtitleTextStyle();
            androidx.compose.foundation.layout.c.f fVarE = androidx.compose.p001foundation.layout.c.a.e();
            tc.b titleHorizontalAlignment = gsbVar.getTitleHorizontalAlignment();
            Function2<d, Integer, Unit> function2E = gsbVar.e();
            float expandedHeight = gsbVar.getExpandedHeight();
            Object objR6 = dVarF.R();
            if (objR6 == companion2.a()) {
                objR6 = new Function0() { // from class: com.google.android.kz2
                    public final Object invoke() {
                        return Float.valueOf(mz2.h());
                    }
                };
                dVarF.L(objR6);
            }
            zu.p(bVarZ, hh4Var, navigationIconContentColor, titleContentColor, subtitleContentColor, actionIconContentColor, function2I, titleTextStyle, function2G, subtitleTextStyle, (Function0) objR6, fVarE, titleHorizontalAlignment, 0, false, function2E, do1VarE, expandedHeight, dVarF, 0, 1600566);
            dVarF = dVarF;
            dVarF.m();
            if (e.k()) {
                e.n();
            }
        } else {
            dVarF.q();
        }
        s6b s6bVarH = dVarF.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2() { // from class: com.google.android.lz2
                public final Object invoke(Object obj, Object obj2) {
                    return mz2.i(this.a, gsbVar, i, (d) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
