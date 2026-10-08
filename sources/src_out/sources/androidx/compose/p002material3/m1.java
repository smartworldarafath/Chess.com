package androidx.compose.p002material3;

import androidx.compose.p001foundation.gestures.Orientation;
import androidx.compose.p001foundation.layout.BoxScopeInstance;
import androidx.compose.p001foundation.layout.j;
import androidx.compose.p002material3.SheetValue;
import androidx.compose.p002material3.m1;
import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import com.google.android.ps4;
import com.google.android.q22;
import com.google.android.ut0;
import com.google.inputmethod.aad;
import com.google.inputmethod.dfa;
import com.google.inputmethod.dud;
import com.google.inputmethod.ej7;
import com.google.inputmethod.em3;
import com.google.inputmethod.f43;
import com.google.inputmethod.ff3;
import com.google.inputmethod.gs1;
import com.google.inputmethod.k0b;
import com.google.inputmethod.ko1;
import com.google.inputmethod.kr;
import com.google.inputmethod.lr;
import com.google.inputmethod.pp1;
import com.google.inputmethod.qxc;
import com.google.inputmethod.rbc;
import com.google.inputmethod.re8;
import com.google.inputmethod.rn8;
import com.google.inputmethod.s6b;
import com.google.inputmethod.saa;
import com.google.inputmethod.ss0;
import com.google.inputmethod.t3e;
import com.google.inputmethod.tc;
import com.google.inputmethod.vbc;
import com.google.inputmethod.we8;
import com.google.inputmethod.wz9;
import com.google.inputmethod.xj1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a!\u0010\u0004\u001a\u00020\u0002*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a3\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00020\nH\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001aW\u0010\u0019\u001a\u00020\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u00102\u0014\b\u0002\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00100\n2\b\b\u0002\u0010\u0014\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00102\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001a\"\u0014\u0010\u001d\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c\"\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lcom/google/android/xj1;", "Lkotlin/Function0;", "", "content", "g", "(Lcom/google/android/xj1;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/d;I)V", "Landroidx/compose/material3/SheetState;", "sheetState", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "Lkotlin/Function1;", "", "onFling", "Lcom/google/android/re8;", "f", "(Landroidx/compose/material3/SheetState;Landroidx/compose/foundation/gestures/Orientation;Lkotlin/jvm/functions/Function1;)Lcom/google/android/re8;", "", "skipPartiallyExpanded", "Landroidx/compose/material3/SheetValue;", "confirmValueChange", "initialValue", "skipHiddenState", "Lcom/google/android/ff3;", "positionalThreshold", "velocityThreshold", "k", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/material3/SheetValue;ZFFLandroidx/compose/runtime/d;II)Landroidx/compose/material3/SheetState;", "a", "F", "DragHandleVerticalPadding", "Lcom/google/android/kr;", "b", "Lcom/google/android/kr;", "BottomSheetAnimationSpec", "material3"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class m1 {
    private static final float a = ff3.i(22);
    private static final kr<Float> b = lr.l(300, 0, em3.d(), 2, null);

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\u0007\u001a\u00020\u0002*\u00020\u0006H\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\t\u001a\u00020\u0002*\u00020\u0003H\u0003¢\u0006\u0004\b\t\u0010\bJ\u001f\u0010\r\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0012\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u0012\u0010\u0013J \u0010\u0014\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"androidx/compose/material3/m1$a", "Lcom/google/android/re8;", "", "Lcom/google/android/rn8;", "b", "(F)J", "Lcom/google/android/t3e;", "c", "(J)F", "a", "available", "Lcom/google/android/we8;", "source", "v2", "(JI)J", "consumed", "o0", "(JJI)J", "q0", "(JLcom/google/android/q22;)Ljava/lang/Object;", "r1", "(JJLcom/google/android/q22;)Ljava/lang/Object;", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a implements re8 {
        final /* synthetic */ SheetState a;
        final /* synthetic */ Function1<Float, Unit> b;
        final /* synthetic */ Orientation c;

        /* JADX WARN: Multi-variable type inference failed */
        a(SheetState sheetState, Function1<? super Float, Unit> function1, Orientation orientation) {
            this.a = sheetState;
            this.b = function1;
            this.c = orientation;
        }

        private final float a(long j) {
            return Float.intBitsToFloat((int) (this.c == Orientation.Horizontal ? j >> 32 : j & 4294967295L));
        }

        private final long b(float f) {
            Orientation orientation = this.c;
            float f2 = orientation == Orientation.Horizontal ? f : 0.0f;
            if (orientation != Orientation.Vertical) {
                f = 0.0f;
            }
            return rn8.e((((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L));
        }

        private final float c(long j) {
            return this.c == Orientation.Horizontal ? t3e.h(j) : t3e.i(j);
        }

        @Override // com.google.inputmethod.re8
        public long o0(long consumed, long available, int source) {
            return we8.d(source, we8.INSTANCE.b()) ? b(this.a.h().o(a(available))) : rn8.INSTANCE.c();
        }

        @Override // com.google.inputmethod.re8
        public Object q0(long j, q22<? super t3e> q22Var) {
            float fC = c(j);
            float fS = this.a.s();
            float fE = this.a.h().p().e();
            if (fC >= 0.0f || fS <= fE) {
                j = t3e.INSTANCE.a();
            } else {
                this.b.invoke(ut0.d(fC));
            }
            return t3e.b(j);
        }

        @Override // com.google.inputmethod.re8
        public Object r1(long j, long j2, q22<? super t3e> q22Var) {
            this.b.invoke(ut0.d(c(j2)));
            return t3e.b(j2);
        }

        @Override // com.google.inputmethod.re8
        public long v2(long available, int source) {
            float fA = a(available);
            return (fA >= 0.0f || !we8.d(source, we8.INSTANCE.b())) ? rn8.INSTANCE.c() : b(this.a.h().o(fA));
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class b implements ps4<aad, d, Integer, Unit> {
        final /* synthetic */ String a;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        static final class a implements Function2<d, Integer, Unit> {
            final /* synthetic */ String a;

            a(String str) {
                this.a = str;
            }

            public final void a(d dVar, int i) {
                if (!dVar.g((i & 3) != 2, i & 1)) {
                    dVar.q();
                    return;
                }
                if (e.k()) {
                    e.o(-999924215, i, -1, "androidx.compose.material3.DragHandleWithTooltip.<anonymous>.<anonymous>.<anonymous> (SheetDefaults.kt:439)");
                }
                qxc.j(this.a, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, dVar, 0, 0, 262142);
                if (e.k()) {
                    e.n();
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                a((d) obj, ((Number) obj2).intValue());
                return Unit.a;
            }
        }

        b(String str) {
            this.a = str;
        }

        public final void a(aad aadVar, d dVar, int i) {
            int i2;
            if ((i & 6) == 0) {
                i2 = i | ((i & 8) == 0 ? dVar.x(aadVar) : dVar.T(aadVar) ? 4 : 2);
            } else {
                i2 = i;
            }
            if (!dVar.g((i2 & 19) != 18, i2 & 1)) {
                dVar.q();
                return;
            }
            if (e.k()) {
                e.o(2059851063, i2, -1, "androidx.compose.material3.DragHandleWithTooltip.<anonymous>.<anonymous> (SheetDefaults.kt:439)");
            }
            TooltipKt.g(aadVar, null, null, 0.0f, null, 0L, 0L, 0.0f, 0.0f, ko1.e(-999924215, true, new a(this.a), dVar, 54), dVar, (i2 & 14) | 805306368, 255);
            if (e.k()) {
                e.n();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((aad) obj, (d) obj2, ((Number) obj3).intValue());
            return Unit.a;
        }
    }

    public static final re8 f(SheetState sheetState, Orientation orientation, Function1<? super Float, Unit> function1) {
        return new a(sheetState, function1, orientation);
    }

    public static final void g(final xj1 xj1Var, final Function2<? super d, ? super Integer, Unit> function2, d dVar, final int i) {
        int i2;
        d dVarF = dVar.F(1033612924);
        if ((i & 6) == 0) {
            i2 = (dVarF.x(xj1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= dVarF.T(function2) ? 32 : 16;
        }
        int i3 = i2;
        if (dVarF.g((i3 & 19) != 18, i3 & 1)) {
            if (e.k()) {
                e.o(1033612924, i3, -1, "androidx.compose.material3.DragHandleWithTooltip (SheetDefaults.kt:432)");
            }
            rbc.Companion companion = rbc.INSTANCE;
            String strB = vbc.b(rbc.a(wz9.c), dVarF, 0);
            androidx.compose.ui.b.Companion companion2 = androidx.compose.ui.b.INSTANCE;
            tc.Companion companion3 = tc.INSTANCE;
            androidx.compose.ui.b bVarB = xj1Var.b(companion2, companion3.g());
            ej7 ej7VarI = j.i(companion3.o(), false);
            int iA = pp1.a(dVarF, 0);
            gs1 gs1VarJ = dVarF.j();
            androidx.compose.ui.b bVarE = ComposedModifierKt.e(dVarF, bVarB);
            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> function0B = companion4.b();
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
            dud.i(dVarC, ej7VarI, companion4.d());
            dud.i(dVarC, gs1VarJ, companion4.f());
            Function2<ComposeUiNode, Integer, Unit> function2C = companion4.c();
            if (dVarC.getInserting() || !Intrinsics.e(dVarC.R(), Integer.valueOf(iA))) {
                dVarC.L(Integer.valueOf(iA));
                dVarC.e(Integer.valueOf(iA), function2C);
            }
            dud.i(dVarC, bVarE, companion4.e());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.a;
            TooltipKt.j(s2.a.f(q2.INSTANCE.a(), 0.0f, dVarF, 390, 2), ko1.e(2059851063, true, new b(strB), dVarF, 54), TooltipKt.v(false, false, null, dVarF, 0, 7), null, null, false, false, false, function2, dVarF, ((i3 << 21) & 234881024) | 48, 248);
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
            s6bVarH.a(new Function2() { // from class: com.google.android.pmb
                public final Object invoke(Object obj, Object obj2) {
                    return m1.h(xj1Var, function2, i, (d) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(xj1 xj1Var, Function2 function2, int i, d dVar, int i2) {
        g(xj1Var, function2, dVar, saa.a(i | 1));
        return Unit.a;
    }

    public static final SheetState k(boolean z, Function1<? super SheetValue, Boolean> function1, SheetValue sheetValue, boolean z2, float f, float f2, d dVar, int i, int i2) {
        final Function1<? super SheetValue, Boolean> function2;
        final boolean z3 = (i2 & 1) != 0 ? false : z;
        if ((i2 & 2) != 0) {
            Object objR = dVar.R();
            if (objR == d.INSTANCE.a()) {
                objR = new Function1() { // from class: com.google.android.lmb
                    public final Object invoke(Object obj) {
                        return Boolean.valueOf(m1.m((SheetValue) obj));
                    }
                };
                dVar.L(objR);
            }
            function2 = (Function1) objR;
        } else {
            function2 = function1;
        }
        final SheetValue sheetValue2 = (i2 & 4) != 0 ? SheetValue.Hidden : sheetValue;
        final boolean z4 = (i2 & 8) != 0 ? false : z2;
        final float fI = (i2 & 16) != 0 ? ss0.a.i() : f;
        final float fL = (i2 & 32) != 0 ? ss0.a.l() : f2;
        if (e.k()) {
            e.o(-20307384, i, -1, "androidx.compose.material3.rememberSheetState (SheetDefaults.kt:514)");
        }
        final f43 f43Var = (f43) dVar.v(CompositionLocalsKt.g());
        boolean z5 = true;
        boolean zX = dVar.x(f43Var) | ((((57344 & i) ^ 24576) > 16384 && dVar.B(fI)) || (i & 24576) == 16384);
        Object objR2 = dVar.R();
        if (zX || objR2 == d.INSTANCE.a()) {
            objR2 = new Function0() { // from class: com.google.android.mmb
                public final Object invoke() {
                    return Float.valueOf(m1.n(f43Var, fI));
                }
            };
            dVar.L(objR2);
        }
        final Function0<Float> function0 = (Function0) objR2;
        boolean zX2 = dVar.x(f43Var) | ((((458752 & i) ^ 196608) > 131072 && dVar.B(fL)) || (i & 196608) == 131072);
        Object objR3 = dVar.R();
        if (zX2 || objR3 == d.INSTANCE.a()) {
            objR3 = new Function0() { // from class: com.google.android.nmb
                public final Object invoke() {
                    return Float.valueOf(m1.o(f43Var, fL));
                }
            };
            dVar.L(objR3);
        }
        final Function0<Float> function3 = (Function0) objR3;
        Object[] objArr = {Boolean.valueOf(z3), function2, Boolean.valueOf(z4)};
        k0b<SheetState, SheetValue> k0bVarC = SheetState.INSTANCE.c(z3, function0, function3, function2, z4);
        boolean zX3 = ((((i & 112) ^ 48) > 32 && dVar.x(function2)) || (i & 48) == 32) | ((((i & 14) ^ 6) > 4 && dVar.A(z3)) || (i & 6) == 4) | dVar.x(function0) | dVar.x(function3) | ((((i & 896) ^ 384) > 256 && dVar.C(sheetValue2.ordinal())) || (i & 384) == 256);
        if ((((i & 7168) ^ 3072) <= 2048 || !dVar.A(z4)) && (i & 3072) != 2048) {
            z5 = false;
        }
        boolean z6 = zX3 | z5;
        Object objR4 = dVar.R();
        if (z6 || objR4 == d.INSTANCE.a()) {
            objR4 = new Function0() { // from class: com.google.android.omb
                public final Object invoke() {
                    return m1.l(z3, function0, function3, sheetValue2, function2, z4);
                }
            };
            dVar.L(objR4);
        }
        SheetState sheetState = (SheetState) dfa.k(objArr, k0bVarC, (Function0) objR4, dVar, 0);
        if (e.k()) {
            e.n();
        }
        return sheetState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SheetState l(boolean z, Function0 function0, Function0 function1, SheetValue sheetValue, Function1 function2, boolean z2) {
        return new SheetState(z, function0, function1, sheetValue, function2, z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean m(SheetValue sheetValue) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float n(f43 f43Var, float f) {
        return f43Var.x2(f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float o(f43 f43Var, float f) {
        return f43Var.x2(f);
    }
}
