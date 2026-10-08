package com.google.inputmethod;

import androidx.compose.p001foundation.BackgroundKt;
import androidx.compose.p001foundation.ClickableKt;
import androidx.compose.p001foundation.layout.BoxScopeInstance;
import androidx.compose.p001foundation.layout.j;
import androidx.compose.p002material3.InteractiveComponentSizeKt;
import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.graphics.l;
import androidx.compose.ui.graphics.r;
import androidx.compose.ui.graphics.t;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import com.google.android.q22;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u001ae\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0089\u0001\u0010\u0016\u001a\u00020\r2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0007¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0091\u0001\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u00122\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0007¢\u0006\u0004\b\u0019\u0010\u001a\u001a5\u0010\u001d\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\u001cH\u0003¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u001f\u0010 \u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u0007H\u0003¢\u0006\u0004\b \u0010!\"\u001d\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00070\"8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&¨\u0006("}, d2 = {"Landroidx/compose/ui/b;", "modifier", "Lcom/google/android/xkb;", "shape", "Lcom/google/android/ei1;", "color", "contentColor", "Lcom/google/android/ff3;", "tonalElevation", "shadowElevation", "Lcom/google/android/or0;", "border", "Lkotlin/Function0;", "", "content", "c", "(Landroidx/compose/ui/b;Lcom/google/android/xkb;JJFFLcom/google/android/or0;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/d;II)V", "onClick", "", "enabled", "Lcom/google/android/r48;", "interactionSource", "e", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/b;ZLcom/google/android/xkb;JJFFLcom/google/android/or0;Lcom/google/android/r48;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/d;III)V", "selected", "d", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/b;ZLcom/google/android/xkb;JJFFLcom/google/android/or0;Lcom/google/android/r48;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/d;III)V", "backgroundColor", "", "h", "(Landroidx/compose/ui/b;Lcom/google/android/xkb;JLcom/google/android/or0;F)Landroidx/compose/ui/b;", "elevation", "i", "(JFLandroidx/compose/runtime/d;I)J", "Lcom/google/android/ks9;", "a", "Lcom/google/android/ks9;", "getLocalAbsoluteTonalElevation", "()Lcom/google/android/ks9;", "LocalAbsoluteTonalElevation", "material3"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class afc {
    private static final ks9<ff3> a = fs1.h(null, new Function0() { // from class: com.google.android.yec
        public final Object invoke() {
            return afc.b();
        }
    }, 1, null);

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class a implements Function2<d, Integer, Unit> {
        final /* synthetic */ androidx.compose.ui.b a;
        final /* synthetic */ xkb b;
        final /* synthetic */ long c;
        final /* synthetic */ float d;
        final /* synthetic */ BorderStroke e;
        final /* synthetic */ float f;
        final /* synthetic */ Function2<d, Integer, Unit> g;

        /* JADX INFO: renamed from: com.google.android.afc$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        static final class C0095a implements PointerInputEventHandler {
            public static final C0095a a = new C0095a();

            C0095a() {
            }

            @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
            public final Object invoke(df9 df9Var, q22<? super Unit> q22Var) {
                return Unit.a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        a(androidx.compose.ui.b bVar, xkb xkbVar, long j, float f, BorderStroke borderStroke, float f2, Function2<? super d, ? super Integer, Unit> function2) {
            this.a = bVar;
            this.b = xkbVar;
            this.c = j;
            this.d = f;
            this.e = borderStroke;
            this.f = f2;
            this.g = function2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(nfb nfbVar) {
            SemanticsPropertiesKt.Z(nfbVar, true);
            return Unit.a;
        }

        public final void b(d dVar, int i) {
            if (!dVar.g((i & 3) != 2, i & 1)) {
                dVar.q();
                return;
            }
            if (e.k()) {
                e.o(421772006, i, -1, "androidx.compose.material3.Surface.<anonymous> (Surface.kt:110)");
            }
            androidx.compose.ui.b bVarH = afc.h(this.a, this.b, afc.i(this.c, this.d, dVar, 0), this.e, ((f43) dVar.v(CompositionLocalsKt.g())).x2(this.f));
            Object objR = dVar.R();
            d.Companion companion = d.INSTANCE;
            if (objR == companion.a()) {
                objR = new Function1() { // from class: com.google.android.zec
                    public final Object invoke(Object obj) {
                        return afc.a.c((nfb) obj);
                    }
                };
                dVar.L(objR);
            }
            androidx.compose.ui.b bVarC = afb.c(bVarH, false, (Function1) objR);
            Unit unit = Unit.a;
            Object objR2 = dVar.R();
            if (objR2 == companion.a()) {
                objR2 = C0095a.a;
                dVar.L(objR2);
            }
            androidx.compose.ui.b bVarC2 = ugc.c(bVarC, unit, (PointerInputEventHandler) objR2);
            Function2<d, Integer, Unit> function2 = this.g;
            ej7 ej7VarI = j.i(tc.INSTANCE.o(), true);
            int iA = pp1.a(dVar, 0);
            gs1 gs1VarJ = dVar.j();
            androidx.compose.ui.b bVarE = ComposedModifierKt.e(dVar, bVarC2);
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
            b((d) obj, ((Number) obj2).intValue());
            return Unit.a;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class b implements Function2<d, Integer, Unit> {
        final /* synthetic */ androidx.compose.ui.b a;
        final /* synthetic */ xkb b;
        final /* synthetic */ long c;
        final /* synthetic */ float d;
        final /* synthetic */ BorderStroke e;
        final /* synthetic */ r48 f;
        final /* synthetic */ boolean g;
        final /* synthetic */ Function0<Unit> h;
        final /* synthetic */ float i;
        final /* synthetic */ Function2<d, Integer, Unit> j;

        /* JADX WARN: Multi-variable type inference failed */
        b(androidx.compose.ui.b bVar, xkb xkbVar, long j, float f, BorderStroke borderStroke, r48 r48Var, boolean z, Function0<Unit> function0, float f2, Function2<? super d, ? super Integer, Unit> function2) {
            this.a = bVar;
            this.b = xkbVar;
            this.c = j;
            this.d = f;
            this.e = borderStroke;
            this.f = r48Var;
            this.g = z;
            this.h = function0;
            this.i = f2;
            this.j = function2;
        }

        public final void a(d dVar, int i) {
            if (!dVar.g((i & 3) != 2, i & 1)) {
                dVar.q();
                return;
            }
            if (e.k()) {
                e.o(849208527, i, -1, "androidx.compose.material3.Surface.<anonymous> (Surface.kt:215)");
            }
            androidx.compose.ui.b bVarC = va1.c(ClickableKt.m(afc.h(InteractiveComponentSizeKt.h(this.a), this.b, afc.i(this.c, this.d, dVar, 0), this.e, ((f43) dVar.v(CompositionLocalsKt.g())).x2(this.i)), this.f, xoa.e(false, 0.0f, 0L, 7, null), this.g, null, null, this.h, 24, null), null, 1, null);
            Function2<d, Integer, Unit> function2 = this.j;
            ej7 ej7VarI = j.i(tc.INSTANCE.o(), true);
            int iA = pp1.a(dVar, 0);
            gs1 gs1VarJ = dVar.j();
            androidx.compose.ui.b bVarE = ComposedModifierKt.e(dVar, bVarC);
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
            d dVarC = dud.c(dVar);
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
            a((d) obj, ((Number) obj2).intValue());
            return Unit.a;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class c implements Function2<d, Integer, Unit> {
        final /* synthetic */ androidx.compose.ui.b a;
        final /* synthetic */ xkb b;
        final /* synthetic */ long c;
        final /* synthetic */ float d;
        final /* synthetic */ BorderStroke e;
        final /* synthetic */ boolean f;
        final /* synthetic */ r48 g;
        final /* synthetic */ boolean h;
        final /* synthetic */ Function0<Unit> i;
        final /* synthetic */ float j;
        final /* synthetic */ Function2<d, Integer, Unit> k;

        /* JADX WARN: Multi-variable type inference failed */
        c(androidx.compose.ui.b bVar, xkb xkbVar, long j, float f, BorderStroke borderStroke, boolean z, r48 r48Var, boolean z2, Function0<Unit> function0, float f2, Function2<? super d, ? super Integer, Unit> function2) {
            this.a = bVar;
            this.b = xkbVar;
            this.c = j;
            this.d = f;
            this.e = borderStroke;
            this.f = z;
            this.g = r48Var;
            this.h = z2;
            this.i = function0;
            this.j = f2;
            this.k = function2;
        }

        public final void a(d dVar, int i) {
            if (!dVar.g((i & 3) != 2, i & 1)) {
                dVar.q();
                return;
            }
            if (e.k()) {
                e.o(1508735219, i, -1, "androidx.compose.material3.Surface.<anonymous> (Surface.kt:321)");
            }
            androidx.compose.ui.b bVarC = va1.c(hdb.b(afc.h(InteractiveComponentSizeKt.h(this.a), this.b, afc.i(this.c, this.d, dVar, 0), this.e, ((f43) dVar.v(CompositionLocalsKt.g())).x2(this.j)), this.f, this.g, xoa.e(false, 0.0f, 0L, 7, null), this.h, null, this.i, 16, null), null, 1, null);
            Function2<d, Integer, Unit> function2 = this.k;
            ej7 ej7VarI = j.i(tc.INSTANCE.o(), true);
            int iA = pp1.a(dVar, 0);
            gs1 gs1VarJ = dVar.j();
            androidx.compose.ui.b bVarE = ComposedModifierKt.e(dVar, bVarC);
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
            d dVarC = dud.c(dVar);
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
            a((d) obj, ((Number) obj2).intValue());
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ff3 b() {
        return ff3.e(ff3.i(0));
    }

    public static final void c(androidx.compose.ui.b bVar, xkb xkbVar, long j, long j2, float f, float f2, BorderStroke borderStroke, Function2<? super d, ? super Integer, Unit> function2, d dVar, int i, int i2) {
        if ((i2 & 1) != 0) {
            bVar = androidx.compose.ui.b.INSTANCE;
        }
        if ((i2 & 2) != 0) {
            xkbVar = r.a();
        }
        if ((i2 & 4) != 0) {
            j = kh7.a.a(dVar, 6).getSurface();
        }
        if ((i2 & 8) != 0) {
            j2 = bj1.g(j, dVar, (i >> 6) & 14);
        }
        if ((i2 & 16) != 0) {
            f = ff3.i(0);
        }
        if ((i2 & 32) != 0) {
            f2 = ff3.i(0);
        }
        if ((i2 & 64) != 0) {
            borderStroke = null;
        }
        if (e.k()) {
            e.o(-1093433818, i, -1, "androidx.compose.material3.Surface (Surface.kt:104)");
        }
        ks9<ff3> ks9Var = a;
        float fI = ff3.i(((ff3) dVar.v(ks9Var)).getValue() + f);
        fs1.d(new os9[]{cz1.a().d(ei1.l(j2)), ks9Var.d(ff3.e(fI))}, ko1.e(421772006, true, new a(bVar, xkbVar, j, fI, borderStroke, f2, function2), dVar, 54), dVar, os9.i | 48);
        if (e.k()) {
            e.n();
        }
    }

    public static final void d(boolean z, Function0<Unit> function0, androidx.compose.ui.b bVar, boolean z2, xkb xkbVar, long j, long j2, float f, float f2, BorderStroke borderStroke, r48 r48Var, Function2<? super d, ? super Integer, Unit> function2, d dVar, int i, int i2, int i3) {
        androidx.compose.ui.b bVar2 = (i3 & 4) != 0 ? androidx.compose.ui.b.INSTANCE : bVar;
        boolean z3 = (i3 & 8) != 0 ? true : z2;
        xkb xkbVarA = (i3 & 16) != 0 ? r.a() : xkbVar;
        long surface = (i3 & 32) != 0 ? kh7.a.a(dVar, 6).getSurface() : j;
        long jG = (i3 & 64) != 0 ? bj1.g(surface, dVar, (i >> 15) & 14) : j2;
        float fI = (i3 & 128) != 0 ? ff3.i(0) : f;
        float fI2 = (i3 & 256) != 0 ? ff3.i(0) : f2;
        BorderStroke borderStroke2 = (i3 & 512) != 0 ? null : borderStroke;
        r48 r48Var2 = (i3 & 1024) == 0 ? r48Var : null;
        if (e.k()) {
            e.o(1416521139, i, i2, "androidx.compose.material3.Surface (Surface.kt:313)");
        }
        if (r48Var2 == null) {
            dVar.y(1528143336);
            Object objR = dVar.R();
            if (objR == d.INSTANCE.a()) {
                objR = k26.a();
                dVar.L(objR);
            }
            r48Var2 = (r48) objR;
        } else {
            dVar.y(-227800369);
        }
        dVar.u();
        ks9<ff3> ks9Var = a;
        float fI3 = ff3.i(((ff3) dVar.v(ks9Var)).getValue() + fI);
        fs1.d(new os9[]{cz1.a().d(ei1.l(jG)), ks9Var.d(ff3.e(fI3))}, ko1.e(1508735219, true, new c(bVar2, xkbVarA, surface, fI3, borderStroke2, z, r48Var2, z3, function0, fI2, function2), dVar, 54), dVar, os9.i | 48);
        if (e.k()) {
            e.n();
        }
    }

    public static final void e(Function0<Unit> function0, androidx.compose.ui.b bVar, boolean z, xkb xkbVar, long j, long j2, float f, float f2, BorderStroke borderStroke, r48 r48Var, Function2<? super d, ? super Integer, Unit> function2, d dVar, int i, int i2, int i3) {
        androidx.compose.ui.b bVar2 = (i3 & 2) != 0 ? androidx.compose.ui.b.INSTANCE : bVar;
        boolean z2 = (i3 & 4) != 0 ? true : z;
        xkb xkbVarA = (i3 & 8) != 0 ? r.a() : xkbVar;
        long surface = (i3 & 16) != 0 ? kh7.a.a(dVar, 6).getSurface() : j;
        long jG = (i3 & 32) != 0 ? bj1.g(surface, dVar, (i >> 12) & 14) : j2;
        float fI = (i3 & 64) != 0 ? ff3.i(0) : f;
        float fI2 = (i3 & 128) != 0 ? ff3.i(0) : f2;
        BorderStroke borderStroke2 = (i3 & 256) != 0 ? null : borderStroke;
        r48 r48Var2 = (i3 & 512) == 0 ? r48Var : null;
        if (e.k()) {
            e.o(-1472753265, i, i2, "androidx.compose.material3.Surface (Surface.kt:207)");
        }
        if (r48Var2 == null) {
            dVar.y(-1701037204);
            Object objR = dVar.R();
            if (objR == d.INSTANCE.a()) {
                objR = k26.a();
                dVar.L(objR);
            }
            r48Var2 = (r48) objR;
        } else {
            dVar.y(2023337163);
        }
        dVar.u();
        ks9<ff3> ks9Var = a;
        float fI3 = ff3.i(((ff3) dVar.v(ks9Var)).getValue() + fI);
        fs1.d(new os9[]{cz1.a().d(ei1.l(jG)), ks9Var.d(ff3.e(fI3))}, ko1.e(849208527, true, new b(bVar2, xkbVarA, surface, fI3, borderStroke2, r48Var2, z2, function0, fI2, function2), dVar, 54), dVar, os9.i | 48);
        if (e.k()) {
            e.n();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.b h(androidx.compose.ui.b bVar, xkb xkbVar, long j, BorderStroke borderStroke, float f) {
        xkb xkbVar2;
        androidx.compose.ui.b bVarD;
        if (f > 0.0f) {
            xkbVar2 = xkbVar;
            bVarD = l.d(androidx.compose.ui.b.INSTANCE, (131064 & 1) != 0 ? 1.0f : 0.0f, (131064 & 2) != 0 ? 1.0f : 0.0f, (131064 & 4) == 0 ? 0.0f : 1.0f, (131064 & 8) != 0 ? 0.0f : 0.0f, (131064 & 16) != 0 ? 0.0f : 0.0f, (131064 & 32) != 0 ? 0.0f : f, (131064 & 64) != 0 ? 0.0f : 0.0f, (131064 & 128) != 0 ? 0.0f : 0.0f, (131064 & 256) == 0 ? 0.0f : 0.0f, (131064 & 512) != 0 ? 8.0f : 0.0f, (131064 & 1024) != 0 ? t.INSTANCE.a() : 0L, (131064 & 2048) != 0 ? r.a() : xkbVar2, (131064 & 4096) != 0 ? false : false, (131064 & 8192) != 0 ? null : null, (131064 & 16384) != 0 ? l05.a() : 0L, (32768 & 131064) != 0 ? l05.a() : 0L, (131064 & 65536) != 0 ? androidx.compose.ui.graphics.j.INSTANCE.a() : 0);
        } else {
            xkbVar2 = xkbVar;
            bVarD = androidx.compose.ui.b.INSTANCE;
        }
        return ff1.a(BackgroundKt.c(bVar.then(bVarD).then(borderStroke != null ? gr0.g(androidx.compose.ui.b.INSTANCE, borderStroke, xkbVar2) : androidx.compose.ui.b.INSTANCE), j, xkbVar2), xkbVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long i(long j, float f, d dVar, int i) {
        if (e.k()) {
            e.o(-2079918090, i, -1, "androidx.compose.material3.surfaceColorAtElevation (Surface.kt:478)");
        }
        long jE = bj1.e(kh7.a.a(dVar, 6), j, f, dVar, (i << 3) & 1008);
        if (e.k()) {
            e.n();
        }
        return jE;
    }
}
