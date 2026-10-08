package androidx.compose.p002material3;

import androidx.compose.p000animation.core.Animatable;
import androidx.compose.p001foundation.layout.BoxScopeInstance;
import androidx.compose.p002material3.SnackbarHostKt;
import androidx.compose.p002material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.graphics.j;
import androidx.compose.ui.graphics.l;
import androidx.compose.ui.graphics.r;
import androidx.compose.ui.graphics.t;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import com.google.android.ps4;
import com.google.inputmethod.afb;
import com.google.inputmethod.aq;
import com.google.inputmethod.d08;
import com.google.inputmethod.d57;
import com.google.inputmethod.dud;
import com.google.inputmethod.e6;
import com.google.inputmethod.ej7;
import com.google.inputmethod.gs1;
import com.google.inputmethod.jvb;
import com.google.inputmethod.ko1;
import com.google.inputmethod.kp1;
import com.google.inputmethod.kr;
import com.google.inputmethod.l05;
import com.google.inputmethod.m47;
import com.google.inputmethod.nfb;
import com.google.inputmethod.pp1;
import com.google.inputmethod.q6c;
import com.google.inputmethod.qaa;
import com.google.inputmethod.rbc;
import com.google.inputmethod.s6b;
import com.google.inputmethod.saa;
import com.google.inputmethod.tc;
import com.google.inputmethod.vbc;
import com.google.inputmethod.vn3;
import com.google.inputmethod.wz9;
import com.google.inputmethod.xa4;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.m;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a7\u0010\b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\u001a%\u0010\u0010\u001a\u00020\u000f*\u00020\n2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a7\u0010\u0014\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0003¢\u0006\u0004\b\u0014\u0010\u0015\u001a;\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00170\u001c2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0019\u001a\u00020\u000b2\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\u001aH\u0003¢\u0006\u0004\b\u001d\u0010\u001e\u001a+\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00170\u001c2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0019\u001a\u00020\u000bH\u0003¢\u0006\u0004\b\u001f\u0010 *0\b\u0002\u0010!\"\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u001a\u0012\u0004\u0012\u00020\u00060\u00042\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u001a\u0012\u0004\u0012\u00020\u00060\u0004¨\u0006\""}, d2 = {"Landroidx/compose/material3/SnackbarHostState;", "hostState", "Landroidx/compose/ui/b;", "modifier", "Lkotlin/Function1;", "Lcom/google/android/jvb;", "", "snackbar", "f", "(Landroidx/compose/material3/SnackbarHostState;Landroidx/compose/ui/b;Lcom/google/android/ps4;Landroidx/compose/runtime/d;II)V", "Landroidx/compose/material3/SnackbarDuration;", "", "hasAction", "Lcom/google/android/e6;", "accessibilityManager", "", "m", "(Landroidx/compose/material3/SnackbarDuration;ZLcom/google/android/e6;)J", "current", "content", "d", "(Lcom/google/android/jvb;Landroidx/compose/ui/b;Lcom/google/android/ps4;Landroidx/compose/runtime/d;II)V", "Lcom/google/android/kr;", "", "animation", "visible", "Lkotlin/Function0;", "onAnimationFinish", "Lcom/google/android/q6c;", "j", "(Lcom/google/android/kr;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/d;II)Lcom/google/android/q6c;", "l", "(Lcom/google/android/kr;ZLandroidx/compose/runtime/d;I)Lcom/google/android/q6c;", "FadeInFadeOutTransition", "material3"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class SnackbarHostKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class a implements ps4<Function2<? super d, ? super Integer, ? extends Unit>, d, Integer, Unit> {
        final /* synthetic */ jvb a;
        final /* synthetic */ jvb b;
        final /* synthetic */ l0<jvb> c;
        final /* synthetic */ String d;

        a(jvb jvbVar, jvb jvbVar2, l0<jvb> l0Var, String str) {
            this.a = jvbVar;
            this.b = jvbVar2;
            this.c = l0Var;
            this.d = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit i(final jvb jvbVar, l0 l0Var) {
            if (!Intrinsics.e(jvbVar, l0Var.getCurrent())) {
                m.O(l0Var.b(), new Function1() { // from class: androidx.compose.material3.r1
                    public final Object invoke(Object obj) {
                        return Boolean.valueOf(SnackbarHostKt.a.j(jvbVar, (FadeInFadeOutAnimationItem) obj));
                    }
                });
                qaa scope = l0Var.getScope();
                if (scope != null) {
                    scope.invalidate();
                }
            }
            return Unit.a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean j(jvb jvbVar, FadeInFadeOutAnimationItem fadeInFadeOutAnimationItem) {
            return Intrinsics.e(fadeInFadeOutAnimationItem.c(), jvbVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit k(boolean z, String str, final jvb jvbVar, nfb nfbVar) {
            if (z) {
                SemanticsPropertiesKt.k0(nfbVar, d57.INSTANCE.b());
            }
            SemanticsPropertiesKt.k(nfbVar, null, new Function0() { // from class: androidx.compose.material3.q1
                public final Object invoke() {
                    return Boolean.valueOf(SnackbarHostKt.a.l(jvbVar));
                }
            }, 1, null);
            SemanticsPropertiesKt.l0(nfbVar, str);
            return Unit.a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean l(jvb jvbVar) {
            jvbVar.dismiss();
            return true;
        }

        public final void g(Function2<? super d, ? super Integer, Unit> function2, d dVar, int i) {
            int i2;
            if ((i & 6) == 0) {
                i2 = i | (dVar.T(function2) ? 4 : 2);
            } else {
                i2 = i;
            }
            if (!dVar.g((i2 & 19) != 18, i2 & 1)) {
                dVar.q();
                return;
            }
            if (e.k()) {
                e.o(-1952400805, i2, -1, "androidx.compose.material3.FadeInFadeOutWithScale.<anonymous>.<anonymous> (SnackbarHost.kt:338)");
            }
            final boolean zE = Intrinsics.e(this.a, this.b);
            xa4 xa4VarB = d08.b(MotionSchemeKeyTokens.FastEffects, dVar, 6);
            boolean zX = dVar.x(this.a) | dVar.T(this.c);
            final jvb jvbVar = this.a;
            final l0<jvb> l0Var = this.c;
            Object objR = dVar.R();
            if (zX || objR == d.INSTANCE.a()) {
                objR = new Function0() { // from class: androidx.compose.material3.o1
                    public final Object invoke() {
                        return SnackbarHostKt.a.i(jvbVar, l0Var);
                    }
                };
                dVar.L(objR);
            }
            q6c q6cVarJ = SnackbarHostKt.j(xa4VarB, zE, (Function0) objR, dVar, 0, 0);
            q6c q6cVarL = SnackbarHostKt.l(d08.b(MotionSchemeKeyTokens.FastSpatial, dVar, 6), zE, dVar, 0);
            androidx.compose.ui.b bVarD = l.d(androidx.compose.ui.b.INSTANCE, (131064 & 1) != 0 ? 1.0f : ((Number) q6cVarL.getValue()).floatValue(), (131064 & 2) != 0 ? 1.0f : ((Number) q6cVarL.getValue()).floatValue(), (131064 & 4) == 0 ? ((Number) q6cVarJ.getValue()).floatValue() : 1.0f, (131064 & 8) != 0 ? 0.0f : 0.0f, (131064 & 16) != 0 ? 0.0f : 0.0f, (131064 & 32) != 0 ? 0.0f : 0.0f, (131064 & 64) != 0 ? 0.0f : 0.0f, (131064 & 128) != 0 ? 0.0f : 0.0f, (131064 & 256) == 0 ? 0.0f : 0.0f, (131064 & 512) != 0 ? 8.0f : 0.0f, (131064 & 1024) != 0 ? t.INSTANCE.a() : 0L, (131064 & 2048) != 0 ? r.a() : null, (131064 & 4096) != 0 ? false : false, (131064 & 8192) != 0 ? null : null, (131064 & 16384) != 0 ? l05.a() : 0L, (32768 & 131064) != 0 ? l05.a() : 0L, (131064 & 65536) != 0 ? j.INSTANCE.a() : 0);
            boolean zA = dVar.A(zE) | dVar.x(this.a) | dVar.x(this.d);
            final String str = this.d;
            final jvb jvbVar2 = this.a;
            Object objR2 = dVar.R();
            if (zA || objR2 == d.INSTANCE.a()) {
                objR2 = new Function1() { // from class: androidx.compose.material3.p1
                    public final Object invoke(Object obj) {
                        return SnackbarHostKt.a.k(zE, str, jvbVar2, (nfb) obj);
                    }
                };
                dVar.L(objR2);
            }
            androidx.compose.ui.b bVarD2 = afb.d(bVarD, false, (Function1) objR2, 1, null);
            ej7 ej7VarI = androidx.compose.p001foundation.layout.j.i(tc.INSTANCE.o(), false);
            int iA = pp1.a(dVar, 0);
            gs1 gs1VarJ = dVar.j();
            androidx.compose.ui.b bVarE = ComposedModifierKt.e(dVar, bVarD2);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> function0B = companion.b();
            if (dVar.G() == null) {
                pp1.d();
            }
            dVar.o();
            if (dVar.E()) {
                dVar.W(function0B);
            } else {
                dVar.k();
            }
            d dVarC = dud.c(dVar);
            dud.i(dVarC, ej7VarI, companion.d());
            dud.i(dVarC, gs1VarJ, companion.f());
            Function2<ComposeUiNode, Integer, Unit> function2C = companion.c();
            if (dVarC.E() || !Intrinsics.e(dVarC.R(), Integer.valueOf(iA))) {
                dVarC.L(Integer.valueOf(iA));
                dVarC.e(Integer.valueOf(iA), function2C);
            }
            dud.i(dVarC, bVarE, companion.e());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.a;
            function2.invoke(dVar, Integer.valueOf(i2 & 14));
            dVar.m();
            if (e.k()) {
                e.n();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            g((Function2) obj, (d) obj2, ((Number) obj3).intValue());
            return Unit.a;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class b implements Function2<d, Integer, Unit> {
        final /* synthetic */ ps4<jvb, d, Integer, Unit> a;
        final /* synthetic */ jvb b;

        /* JADX WARN: Multi-variable type inference failed */
        b(ps4<? super jvb, ? super d, ? super Integer, Unit> ps4Var, jvb jvbVar) {
            this.a = ps4Var;
            this.b = jvbVar;
        }

        public final void a(d dVar, int i) {
            if (!dVar.g((i & 3) != 2, i & 1)) {
                dVar.q();
                return;
            }
            if (e.k()) {
                e.o(-1893791890, i, -1, "androidx.compose.material3.FadeInFadeOutWithScale.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SnackbarHost.kt:382)");
            }
            ps4<jvb, d, Integer, Unit> ps4Var = this.a;
            jvb jvbVar = this.b;
            Intrinsics.g(jvbVar);
            ps4Var.invoke(jvbVar, dVar, 0);
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
    public /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SnackbarDuration.values().length];
            try {
                iArr[SnackbarDuration.Indefinite.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SnackbarDuration.Long.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SnackbarDuration.Short.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0045  */
    /* JADX WARN: Code duplicated, block: B:27:0x0048  */
    /* JADX WARN: Code duplicated, block: B:29:0x004c  */
    /* JADX WARN: Code duplicated, block: B:31:0x0052  */
    /* JADX WARN: Code duplicated, block: B:32:0x0055  */
    /* JADX WARN: Code duplicated, block: B:36:0x0060  */
    /* JADX WARN: Code duplicated, block: B:37:0x0062  */
    /* JADX WARN: Code duplicated, block: B:40:0x006b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x006d  */
    /* JADX WARN: Code duplicated, block: B:42:0x0070  */
    /* JADX WARN: Code duplicated, block: B:45:0x0077  */
    /* JADX WARN: Code duplicated, block: B:48:0x0095  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:53:0x00c8 A[LOOP:0: B:52:0x00c6->B:53:0x00c8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:56:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:59:0x00fd A[LOOP:1: B:58:0x00fb->B:59:0x00fd, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:61:0x0123  */
    /* JADX WARN: Code duplicated, block: B:64:0x014f  */
    /* JADX WARN: Code duplicated, block: B:67:0x015b  */
    /* JADX WARN: Code duplicated, block: B:68:0x015f  */
    /* JADX WARN: Code duplicated, block: B:73:0x018c  */
    /* JADX WARN: Code duplicated, block: B:76:0x01bc A[LOOP:2: B:75:0x01ba->B:76:0x01bc, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:79:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:80:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:83:0x0206  */
    /* JADX WARN: Code duplicated, block: B:88:? A[RETURN, SYNTHETIC] */
    private static final void d(final jvb jvbVar, androidx.compose.ui.b bVar, final ps4<? super jvb, ? super d, ? super Integer, Unit> ps4Var, d dVar, final int i, final int i2) {
        int i3;
        androidx.compose.ui.b bVar2;
        int i4;
        boolean z;
        androidx.compose.ui.b bVar3;
        s6b s6bVarH;
        String strB;
        Object objR;
        l0 l0Var;
        int iA;
        Function0<ComposeUiNode> function0B;
        d dVarC;
        Function2<ComposeUiNode, Integer, Unit> function2C;
        List listB;
        int size;
        int i5;
        List listB2;
        ArrayList arrayList;
        int size2;
        int i6;
        List listB1;
        List listB3;
        List listB4;
        int size3;
        int i7;
        d dVarF = dVar.F(-977568115);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (dVarF.x(jvbVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 == 0) {
            if ((i & 48) == 0) {
                bVar2 = bVar;
                i3 |= dVarF.x(bVar2) ? 32 : 16;
            }
            if ((i2 & 4) != 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                if (dVarF.T(ps4Var)) {
                    i4 = 256;
                } else {
                    i4 = 128;
                }
                i3 |= i4;
            }
            if ((i3 & 147) != 146) {
                z = true;
            } else {
                z = false;
            }
            if (dVarF.g(z, i3 & 1)) {
                if (i8 != 0) {
                    bVar3 = androidx.compose.ui.b.INSTANCE;
                } else {
                    bVar3 = bVar2;
                }
                if (e.k()) {
                    e.o(-977568115, i3, -1, "androidx.compose.material3.FadeInFadeOutWithScale (SnackbarHost.kt:326)");
                }
                rbc.Companion companion = rbc.INSTANCE;
                strB = vbc.b(rbc.a(wz9.I), dVarF, 0);
                objR = dVarF.R();
                if (objR == d.INSTANCE.a()) {
                    objR = new l0();
                    dVarF.L(objR);
                }
                l0Var = (l0) objR;
                if (Intrinsics.e(jvbVar, l0Var.getCurrent())) {
                    dVarF.y(1443908949);
                    dVarF.u();
                } else {
                    dVarF.y(1154891761);
                    l0Var.d(jvbVar);
                    listB2 = l0Var.b();
                    arrayList = new ArrayList(listB2.size());
                    size2 = listB2.size();
                    for (i6 = 0; i6 < size2; i6++) {
                        arrayList.add((jvb) ((FadeInFadeOutAnimationItem) listB2.get(i6)).c());
                    }
                    listB1 = m.B1(arrayList);
                    if (!listB1.contains(jvbVar)) {
                        listB1.add(jvbVar);
                    }
                    l0Var.b().clear();
                    listB3 = m47.b(listB1);
                    listB4 = l0Var.b();
                    size3 = listB3.size();
                    i7 = 0;
                    while (i7 < size3) {
                        jvb jvbVar2 = (jvb) listB3.get(i7);
                        listB4.add(new FadeInFadeOutAnimationItem(jvbVar2, ko1.e(-1952400805, true, new a(jvbVar2, jvbVar, l0Var, strB), dVarF, 54)));
                        i7++;
                        strB = strB;
                    }
                    dVarF.u();
                }
                ej7 ej7VarI = androidx.compose.p001foundation.layout.j.i(tc.INSTANCE.o(), false);
                iA = pp1.a(dVarF, 0);
                gs1 gs1VarJ = dVarF.j();
                androidx.compose.ui.b bVarE = ComposedModifierKt.e(dVarF, bVar3);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                function0B = companion2.b();
                if (dVarF.G() == null) {
                    pp1.d();
                }
                dVarF.o();
                if (dVarF.E()) {
                    dVarF.W(function0B);
                } else {
                    dVarF.k();
                }
                dVarC = dud.c(dVarF);
                dud.i(dVarC, ej7VarI, companion2.d());
                dud.i(dVarC, gs1VarJ, companion2.f());
                function2C = companion2.c();
                if (dVarC.E() || !Intrinsics.e(dVarC.R(), Integer.valueOf(iA))) {
                    dVarC.L(Integer.valueOf(iA));
                    dVarC.e(Integer.valueOf(iA), function2C);
                }
                dud.i(dVarC, bVarE, companion2.e());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.a;
                l0Var.e(pp1.c(dVarF, 0));
                dVarF.y(-1888182177);
                listB = l0Var.b();
                size = listB.size();
                for (i5 = 0; i5 < size; i5++) {
                    FadeInFadeOutAnimationItem fadeInFadeOutAnimationItem = (FadeInFadeOutAnimationItem) listB.get(i5);
                    jvb jvbVar3 = (jvb) fadeInFadeOutAnimationItem.a();
                    ps4<Function2<? super d, ? super Integer, Unit>, d, Integer, Unit> ps4VarB = fadeInFadeOutAnimationItem.b();
                    dVarF.V(1325010085, jvbVar3);
                    ps4VarB.invoke(ko1.e(-1893791890, true, new b(ps4Var, jvbVar3), dVarF, 54), dVarF, 6);
                    dVarF.Z();
                }
                dVarF.u();
                dVarF.m();
                if (e.k()) {
                    e.n();
                }
            } else {
                dVarF.q();
                bVar3 = bVar2;
            }
            s6bVarH = dVarF.H();
            if (s6bVarH != null) {
                final androidx.compose.ui.b bVar4 = bVar3;
                s6bVarH.a(new Function2() { // from class: com.google.android.mvb
                    public final Object invoke(Object obj, Object obj2) {
                        return SnackbarHostKt.e(jvbVar, bVar4, ps4Var, i, i2, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i3 |= 48;
        bVar2 = bVar;
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            if (dVarF.T(ps4Var)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i3 |= i4;
        }
        if ((i3 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (dVarF.g(z, i3 & 1)) {
            if (i8 != 0) {
                bVar3 = androidx.compose.ui.b.INSTANCE;
            } else {
                bVar3 = bVar2;
            }
            if (e.k()) {
                e.o(-977568115, i3, -1, "androidx.compose.material3.FadeInFadeOutWithScale (SnackbarHost.kt:326)");
            }
            rbc.Companion companion3 = rbc.INSTANCE;
            strB = vbc.b(rbc.a(wz9.I), dVarF, 0);
            objR = dVarF.R();
            if (objR == d.INSTANCE.a()) {
                objR = new l0();
                dVarF.L(objR);
            }
            l0Var = (l0) objR;
            if (Intrinsics.e(jvbVar, l0Var.getCurrent())) {
                dVarF.y(1154891761);
                l0Var.d(jvbVar);
                listB2 = l0Var.b();
                arrayList = new ArrayList(listB2.size());
                size2 = listB2.size();
                while (i6 < size2) {
                    arrayList.add((jvb) ((FadeInFadeOutAnimationItem) listB2.get(i6)).c());
                }
                listB1 = m.B1(arrayList);
                if (!listB1.contains(jvbVar)) {
                    listB1.add(jvbVar);
                }
                l0Var.b().clear();
                listB3 = m47.b(listB1);
                listB4 = l0Var.b();
                size3 = listB3.size();
                i7 = 0;
                while (i7 < size3) {
                    jvb jvbVar4 = (jvb) listB3.get(i7);
                    listB4.add(new FadeInFadeOutAnimationItem(jvbVar4, ko1.e(-1952400805, true, new a(jvbVar4, jvbVar, l0Var, strB), dVarF, 54)));
                    i7++;
                    strB = strB;
                }
                dVarF.u();
            } else {
                dVarF.y(1443908949);
                dVarF.u();
            }
            ej7 ej7VarI2 = androidx.compose.p001foundation.layout.j.i(tc.INSTANCE.o(), false);
            iA = pp1.a(dVarF, 0);
            gs1 gs1VarJ2 = dVarF.j();
            androidx.compose.ui.b bVarE2 = ComposedModifierKt.e(dVarF, bVar3);
            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
            function0B = companion4.b();
            if (dVarF.G() == null) {
                pp1.d();
            }
            dVarF.o();
            if (dVarF.E()) {
                dVarF.W(function0B);
            } else {
                dVarF.k();
            }
            dVarC = dud.c(dVarF);
            dud.i(dVarC, ej7VarI2, companion4.d());
            dud.i(dVarC, gs1VarJ2, companion4.f());
            function2C = companion4.c();
            if (dVarC.E()) {
                dVarC.L(Integer.valueOf(iA));
                dVarC.e(Integer.valueOf(iA), function2C);
            } else {
                dVarC.L(Integer.valueOf(iA));
                dVarC.e(Integer.valueOf(iA), function2C);
            }
            dud.i(dVarC, bVarE2, companion4.e());
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.a;
            l0Var.e(pp1.c(dVarF, 0));
            dVarF.y(-1888182177);
            listB = l0Var.b();
            size = listB.size();
            while (i5 < size) {
                FadeInFadeOutAnimationItem fadeInFadeOutAnimationItem2 = (FadeInFadeOutAnimationItem) listB.get(i5);
                jvb jvbVar5 = (jvb) fadeInFadeOutAnimationItem2.a();
                ps4<Function2<? super d, ? super Integer, Unit>, d, Integer, Unit> ps4VarB2 = fadeInFadeOutAnimationItem2.b();
                dVarF.V(1325010085, jvbVar5);
                ps4VarB2.invoke(ko1.e(-1893791890, true, new b(ps4Var, jvbVar5), dVarF, 54), dVarF, 6);
                dVarF.Z();
            }
            dVarF.u();
            dVarF.m();
            if (e.k()) {
                e.n();
            }
        } else {
            dVarF.q();
            bVar3 = bVar2;
        }
        s6bVarH = dVarF.H();
        if (s6bVarH != null) {
            final androidx.compose.ui.b bVar5 = bVar3;
            s6bVarH.a(new Function2() { // from class: com.google.android.mvb
                public final Object invoke(Object obj, Object obj2) {
                    return SnackbarHostKt.e(jvbVar, bVar5, ps4Var, i, i2, (d) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(jvb jvbVar, androidx.compose.ui.b bVar, ps4 ps4Var, int i, int i2, d dVar, int i3) {
        d(jvbVar, bVar, ps4Var, dVar, saa.a(i | 1), i2);
        return Unit.a;
    }

    public static final void f(final SnackbarHostState snackbarHostState, androidx.compose.ui.b bVar, ps4<? super jvb, ? super d, ? super Integer, Unit> ps4Var, d dVar, final int i, final int i2) {
        int i3;
        final androidx.compose.ui.b bVar2;
        final ps4<? super jvb, ? super d, ? super Integer, Unit> ps4Var2;
        d dVarF = dVar.F(-1077081618);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (dVarF.x(snackbarHostState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= dVarF.x(bVar) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= dVarF.T(ps4Var) ? 256 : 128;
        }
        if (dVarF.g((i3 & 147) != 146, i3 & 1)) {
            if (i4 != 0) {
                bVar = androidx.compose.ui.b.INSTANCE;
            }
            androidx.compose.ui.b bVar3 = bVar;
            if (i5 != 0) {
                ps4Var = kp1.a.a();
            }
            if (e.k()) {
                e.o(-1077081618, i3, -1, "androidx.compose.material3.SnackbarHost (SnackbarHost.kt:220)");
            }
            jvb jvbVarB = snackbarHostState.b();
            e6 e6Var = (e6) dVarF.v(CompositionLocalsKt.c());
            boolean zX = dVarF.x(jvbVarB) | dVarF.T(e6Var);
            Object objR = dVarF.R();
            if (zX || objR == d.INSTANCE.a()) {
                objR = new C0200SnackbarHostKt$SnackbarHost$1$1(jvbVarB, e6Var, null);
                dVarF.L(objR);
            }
            vn3.g(jvbVarB, (Function2) objR, dVarF, 0);
            ps4<? super jvb, ? super d, ? super Integer, Unit> ps4Var3 = ps4Var;
            d(snackbarHostState.b(), bVar3, ps4Var3, dVarF, i3 & 1008, 0);
            if (e.k()) {
                e.n();
            }
            bVar2 = bVar3;
            ps4Var2 = ps4Var3;
        } else {
            dVarF.q();
            bVar2 = bVar;
            ps4Var2 = ps4Var;
        }
        s6b s6bVarH = dVarF.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2() { // from class: com.google.android.lvb
                public final Object invoke(Object obj, Object obj2) {
                    return SnackbarHostKt.g(snackbarHostState, bVar2, ps4Var2, i, i2, (d) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(SnackbarHostState snackbarHostState, androidx.compose.ui.b bVar, ps4 ps4Var, int i, int i2, d dVar, int i3) {
        f(snackbarHostState, bVar, ps4Var, dVar, saa.a(i | 1), i2);
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final q6c<Float> j(kr<Float> krVar, boolean z, Function0<Unit> function0, d dVar, int i, int i2) {
        if ((i2 & 4) != 0) {
            Object objR = dVar.R();
            if (objR == d.INSTANCE.a()) {
                objR = new Function0() { // from class: com.google.android.nvb
                    public final Object invoke() {
                        return SnackbarHostKt.k();
                    }
                };
                dVar.L(objR);
            }
            function0 = (Function0) objR;
        }
        Function0<Unit> function1 = function0;
        if (e.k()) {
            e.o(1431889134, i, -1, "androidx.compose.material3.animatedOpacity (SnackbarHost.kt:405)");
        }
        Object objR2 = dVar.R();
        d.Companion companion = d.INSTANCE;
        if (objR2 == companion.a()) {
            objR2 = aq.b(!z ? 1.0f : 0.0f, 0.0f, 2, null);
            dVar.L(objR2);
        }
        Animatable animatable = (Animatable) objR2;
        Boolean boolValueOf = Boolean.valueOf(z);
        boolean zT = dVar.T(animatable) | ((((i & 112) ^ 48) > 32 && dVar.A(z)) || (i & 48) == 32) | dVar.T(krVar) | ((((i & 896) ^ 384) > 256 && dVar.x(function1)) || (i & 384) == 256);
        Object objR3 = dVar.R();
        if (zT || objR3 == companion.a()) {
            Object c0201SnackbarHostKt$animatedOpacity$2$1 = new C0201SnackbarHostKt$animatedOpacity$2$1(animatable, z, krVar, function1, null);
            dVar.L(c0201SnackbarHostKt$animatedOpacity$2$1);
            objR3 = c0201SnackbarHostKt$animatedOpacity$2$1;
        }
        vn3.g(boolValueOf, (Function2) objR3, dVar, (i >> 3) & 14);
        q6c<Float> q6cVarG = animatable.g();
        if (e.k()) {
            e.n();
        }
        return q6cVarG;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k() {
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final q6c<Float> l(kr<Float> krVar, boolean z, d dVar, int i) {
        if (e.k()) {
            e.o(1966809761, i, -1, "androidx.compose.material3.animatedScale (SnackbarHost.kt:415)");
        }
        Object objR = dVar.R();
        d.Companion companion = d.INSTANCE;
        if (objR == companion.a()) {
            objR = aq.b(!z ? 1.0f : 0.8f, 0.0f, 2, null);
            dVar.L(objR);
        }
        Animatable animatable = (Animatable) objR;
        Boolean boolValueOf = Boolean.valueOf(z);
        boolean zT = dVar.T(animatable) | ((((i & 112) ^ 48) > 32 && dVar.A(z)) || (i & 48) == 32) | dVar.T(krVar);
        Object objR2 = dVar.R();
        if (zT || objR2 == companion.a()) {
            objR2 = new C0202SnackbarHostKt$animatedScale$1$1(animatable, z, krVar, null);
            dVar.L(objR2);
        }
        vn3.g(boolValueOf, (Function2) objR2, dVar, (i >> 3) & 14);
        q6c<Float> q6cVarG = animatable.g();
        if (e.k()) {
            e.n();
        }
        return q6cVarG;
    }

    public static final long m(SnackbarDuration snackbarDuration, boolean z, e6 e6Var) {
        long j;
        int i = c.$EnumSwitchMapping$0[snackbarDuration.ordinal()];
        if (i == 1) {
            j = Long.MAX_VALUE;
        } else if (i == 2) {
            j = 10000;
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            j = 4000;
        }
        long j2 = j;
        return e6Var == null ? j2 : e6Var.a(j2, true, true, z);
    }
}
