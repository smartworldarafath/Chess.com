package androidx.compose.p002material3;

import androidx.compose.p001foundation.gestures.AnchoredDraggableKt;
import androidx.compose.p001foundation.gestures.AnchoredDraggableState;
import androidx.compose.p001foundation.gestures.Orientation;
import androidx.compose.p001foundation.layout.BoxScopeInstance;
import androidx.compose.p001foundation.layout.c;
import androidx.compose.p001foundation.layout.j;
import androidx.compose.p001foundation.layout.t0;
import androidx.compose.p002material3.SwipeToDismissBoxKt;
import androidx.compose.p002material3.SwipeToDismissBoxValue;
import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.b;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import com.google.android.ps4;
import com.google.android.qjd;
import com.google.android.r43;
import com.google.inputmethod.dfa;
import com.google.inputmethod.dud;
import com.google.inputmethod.ej7;
import com.google.inputmethod.f43;
import com.google.inputmethod.ff3;
import com.google.inputmethod.fg3;
import com.google.inputmethod.gs1;
import com.google.inputmethod.hg3;
import com.google.inputmethod.hhc;
import com.google.inputmethod.hra;
import com.google.inputmethod.ira;
import com.google.inputmethod.k0b;
import com.google.inputmethod.kx1;
import com.google.inputmethod.omc;
import com.google.inputmethod.pp1;
import com.google.inputmethod.q16;
import com.google.inputmethod.s6b;
import com.google.inputmethod.saa;
import com.google.inputmethod.tc;
import com.google.inputmethod.tg;
import com.google.inputmethod.vn3;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aE\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0002H\u0007¢\u0006\u0004\b\b\u0010\t\u001a}\u0010\u0015\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00072\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\u0014\b\u0002\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\f0\u00022\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\u0002H\u0007¢\u0006\u0004\b\u0015\u0010\u0016\"\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Landroidx/compose/material3/SwipeToDismissBoxValue;", "initialValue", "Lkotlin/Function1;", "", "confirmValueChange", "", "positionalThreshold", "Landroidx/compose/material3/s1;", "m", "(Landroidx/compose/material3/SwipeToDismissBoxValue;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/d;II)Landroidx/compose/material3/s1;", "state", "Lcom/google/android/hra;", "", "backgroundContent", "Landroidx/compose/ui/b;", "modifier", "enableDismissFromStartToEnd", "enableDismissFromEndToStart", "gesturesEnabled", "onDismiss", "content", "g", "(Landroidx/compose/material3/s1;Lcom/google/android/ps4;Landroidx/compose/ui/b;ZZZLkotlin/jvm/functions/Function1;Lcom/google/android/ps4;Landroidx/compose/runtime/d;II)V", "Lcom/google/android/ff3;", "a", "F", "DismissVelocityThreshold", "material3"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class SwipeToDismissBoxKt {
    private static final float a = ff3.i(125);

    /* JADX WARN: Code duplicated, block: B:100:0x0111  */
    /* JADX WARN: Code duplicated, block: B:102:0x0115  */
    /* JADX WARN: Code duplicated, block: B:103:0x0117  */
    /* JADX WARN: Code duplicated, block: B:105:0x011a  */
    /* JADX WARN: Code duplicated, block: B:107:0x0126  */
    /* JADX WARN: Code duplicated, block: B:109:0x0131  */
    /* JADX WARN: Code duplicated, block: B:112:0x0138  */
    /* JADX WARN: Code duplicated, block: B:115:0x0149  */
    /* JADX WARN: Code duplicated, block: B:118:0x0154  */
    /* JADX WARN: Code duplicated, block: B:121:0x015d  */
    /* JADX WARN: Code duplicated, block: B:122:0x0183  */
    /* JADX WARN: Code duplicated, block: B:125:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:128:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:129:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:132:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:134:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:137:0x0249  */
    /* JADX WARN: Code duplicated, block: B:140:0x0255  */
    /* JADX WARN: Code duplicated, block: B:141:0x0259  */
    /* JADX WARN: Code duplicated, block: B:144:0x027a  */
    /* JADX WARN: Code duplicated, block: B:146:0x0288  */
    /* JADX WARN: Code duplicated, block: B:149:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:150:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:153:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:154:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:157:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:159:0x02db  */
    /* JADX WARN: Code duplicated, block: B:162:0x0310  */
    /* JADX WARN: Code duplicated, block: B:165:0x031c  */
    /* JADX WARN: Code duplicated, block: B:166:0x0320  */
    /* JADX WARN: Code duplicated, block: B:169:0x033f  */
    /* JADX WARN: Code duplicated, block: B:171:0x034d  */
    /* JADX WARN: Code duplicated, block: B:174:0x0384  */
    /* JADX WARN: Code duplicated, block: B:175:0x0386  */
    /* JADX WARN: Code duplicated, block: B:178:0x038e  */
    /* JADX WARN: Code duplicated, block: B:180:0x0396  */
    /* JADX WARN: Code duplicated, block: B:183:0x03ae  */
    /* JADX WARN: Code duplicated, block: B:185:0x03b9  */
    /* JADX WARN: Code duplicated, block: B:188:0x03c7  */
    /* JADX WARN: Code duplicated, block: B:190:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0060  */
    /* JADX WARN: Code duplicated, block: B:38:0x0065  */
    /* JADX WARN: Code duplicated, block: B:40:0x0069  */
    /* JADX WARN: Code duplicated, block: B:42:0x0071  */
    /* JADX WARN: Code duplicated, block: B:43:0x0074  */
    /* JADX WARN: Code duplicated, block: B:47:0x007b  */
    /* JADX WARN: Code duplicated, block: B:49:0x0080  */
    /* JADX WARN: Code duplicated, block: B:51:0x0084  */
    /* JADX WARN: Code duplicated, block: B:53:0x008c  */
    /* JADX WARN: Code duplicated, block: B:54:0x008f  */
    /* JADX WARN: Code duplicated, block: B:58:0x0099  */
    /* JADX WARN: Code duplicated, block: B:59:0x009e  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:63:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:74:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:81:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:89:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:92:0x00ff A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:93:0x0101  */
    /* JADX WARN: Code duplicated, block: B:94:0x0106  */
    /* JADX WARN: Code duplicated, block: B:96:0x010a  */
    /* JADX WARN: Code duplicated, block: B:97:0x010c  */
    /* JADX WARN: Code duplicated, block: B:99:0x010f  */
    public static final void g(final s1 s1Var, final ps4<? super hra, ? super d, ? super Integer, Unit> ps4Var, b bVar, boolean z, boolean z2, boolean z3, Function1<? super SwipeToDismissBoxValue, Unit> function1, final ps4<? super hra, ? super d, ? super Integer, Unit> ps4Var2, d dVar, final int i, final int i2) {
        int i3;
        b bVar2;
        int i4;
        boolean z4;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z5;
        int i9;
        int i10;
        final Function1<? super SwipeToDismissBoxValue, Unit> function2;
        int i11;
        int i12;
        boolean z6;
        final b bVar3;
        final boolean z7;
        final boolean z8;
        final boolean z9;
        s6b s6bVarH;
        b bVar4;
        final boolean z10;
        final boolean z11;
        boolean z12;
        Function1<? super SwipeToDismissBoxValue, Unit> function3;
        boolean z13;
        boolean z14;
        omc omcVar;
        int iA;
        Function0<ComposeUiNode> function0B;
        d dVarC;
        Function2<ComposeUiNode, Integer, Unit> function2C;
        int iA2;
        Function0<ComposeUiNode> function0B2;
        d dVarC2;
        Function2<ComposeUiNode, Integer, Unit> function2C2;
        boolean z15;
        boolean z16;
        boolean zT;
        Object objR;
        int iA3;
        Function0<ComposeUiNode> function0B3;
        d dVarC3;
        Function2<ComposeUiNode, Integer, Unit> function2C3;
        boolean z17;
        boolean z18;
        Object objR2;
        Object objR3;
        d dVarF = dVar.F(-741495334);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (dVarF.T(s1Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= dVarF.T(ps4Var) ? 32 : 16;
        }
        int i13 = i2 & 4;
        if (i13 == 0) {
            if ((i & 384) == 0) {
                bVar2 = bVar;
                i3 |= dVarF.x(bVar2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    z4 = z;
                    if (dVarF.A(z4)) {
                        i5 = 2048;
                    } else {
                        i5 = 1024;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 16;
                if (i6 != 0) {
                    if ((i & 24576) == 0) {
                        if (dVarF.A(z2)) {
                            i7 = 16384;
                        } else {
                            i7 = 8192;
                        }
                        i3 |= i7;
                    }
                    i8 = i2 & 32;
                    if (i8 != 0) {
                        i3 |= 196608;
                        z5 = z3;
                    } else {
                        z5 = z3;
                        if ((i & 196608) == 0) {
                            if (dVarF.A(z5)) {
                                i9 = 131072;
                            } else {
                                i9 = 65536;
                            }
                            i3 |= i9;
                        }
                    }
                    i10 = i2 & 64;
                    if (i10 != 0) {
                        i3 |= 1572864;
                        function2 = function1;
                    } else {
                        function2 = function1;
                        if ((i & 1572864) == 0) {
                            if (dVarF.T(function2)) {
                                i11 = 1048576;
                            } else {
                                i11 = 524288;
                            }
                            i3 |= i11;
                        }
                    }
                    if ((i2 & 128) != 0) {
                        i3 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        if (dVarF.T(ps4Var2)) {
                            i12 = 8388608;
                        } else {
                            i12 = 4194304;
                        }
                        i3 |= i12;
                    }
                    if ((4793491 & i3) != 4793490) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (dVarF.g(z6, i3 & 1)) {
                        if (i13 != 0) {
                            bVar4 = b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        if (i4 != 0) {
                            z10 = true;
                        } else {
                            z10 = z4;
                        }
                        if (i6 != 0) {
                            z11 = true;
                        } else {
                            z11 = z2;
                        }
                        if (i8 != 0) {
                            z12 = true;
                        } else {
                            z12 = z5;
                        }
                        if (i10 != 0) {
                            objR3 = dVarF.R();
                            if (objR3 == d.INSTANCE.a()) {
                                objR3 = new Function1() { // from class: com.google.android.khc
                                    public final Object invoke(Object obj) {
                                        return SwipeToDismissBoxKt.k((SwipeToDismissBoxValue) obj);
                                    }
                                };
                                dVarF.L(objR3);
                            }
                            function3 = (Function1) objR3;
                        } else {
                            function3 = function2;
                        }
                        if (e.k()) {
                            e.o(-741495334, i3, -1, "androidx.compose.material3.SwipeToDismissBox (SwipeToDismissBox.kt:313)");
                        }
                        AnchoredDraggableState<SwipeToDismissBoxValue> anchoredDraggableStateC = s1Var.c();
                        Orientation orientation = Orientation.Horizontal;
                        if (z12 || s1Var.h() != SwipeToDismissBoxValue.Settled) {
                            z13 = false;
                        } else {
                            z13 = true;
                        }
                        if (s1Var.j()) {
                            dVarF.y(387581105);
                            z14 = true;
                            omc omcVarC = tg.a.c(s1Var.c(), s1Var.g(), null, dVarF, tg.e << 9, 4);
                            dVarF.u();
                            omcVar = omcVarC;
                        } else {
                            z14 = true;
                            dVarF.y(-869685853);
                            dVarF.u();
                            omcVar = null;
                        }
                        b bVarR = AnchoredDraggableKt.r(bVar4, anchoredDraggableStateC, orientation, z13, null, null, omcVar, 24, null);
                        tc.Companion companion = tc.INSTANCE;
                        ej7 ej7VarI = j.i(companion.o(), z14);
                        iA = pp1.a(dVarF, 0);
                        gs1 gs1VarJ = dVarF.j();
                        b bVarE = ComposedModifierKt.e(dVarF, bVarR);
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        boolean z19 = z12;
                        function0B = companion2.b();
                        if (dVarF.G() == null) {
                            pp1.d();
                        }
                        dVarF.o();
                        if (dVarF.getInserting()) {
                            dVarF.W(function0B);
                        } else {
                            dVarF.k();
                        }
                        dVarC = dud.c(dVarF);
                        dud.i(dVarC, ej7VarI, companion2.d());
                        dud.i(dVarC, gs1VarJ, companion2.f());
                        function2C = companion2.c();
                        if (dVarC.getInserting() || !Intrinsics.e(dVarC.R(), Integer.valueOf(iA))) {
                            dVarC.L(Integer.valueOf(iA));
                            dVarC.e(Integer.valueOf(iA), function2C);
                        }
                        dud.i(dVarC, bVarE, companion2.e());
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.a;
                        b.Companion companion3 = b.INSTANCE;
                        b bVarJ = boxScopeInstance.j(companion3);
                        int i14 = (i3 << 6) & 7168;
                        c cVar = c.a;
                        ej7 ej7VarB = t0.b(cVar.j(), companion.l(), dVarF, 0);
                        iA2 = pp1.a(dVarF, 0);
                        gs1 gs1VarJ2 = dVarF.j();
                        b bVarE2 = ComposedModifierKt.e(dVarF, bVarJ);
                        function0B2 = companion2.b();
                        if (dVarF.G() == null) {
                            pp1.d();
                        }
                        dVarF.o();
                        if (dVarF.getInserting()) {
                            dVarF.W(function0B2);
                        } else {
                            dVarF.k();
                        }
                        dVarC2 = dud.c(dVarF);
                        dud.i(dVarC2, ej7VarB, companion2.d());
                        dud.i(dVarC2, gs1VarJ2, companion2.f());
                        function2C2 = companion2.c();
                        if (dVarC2.getInserting() || !Intrinsics.e(dVarC2.R(), Integer.valueOf(iA2))) {
                            dVarC2.L(Integer.valueOf(iA2));
                            dVarC2.e(Integer.valueOf(iA2), function2C2);
                        }
                        dud.i(dVarC2, bVarE2, companion2.e());
                        ira iraVar = ira.a;
                        ps4Var.invoke(iraVar, dVarF, Integer.valueOf(((i14 >> 6) & 112) | 6));
                        dVarF.m();
                        AnchoredDraggableState<SwipeToDismissBoxValue> anchoredDraggableStateC2 = s1Var.c();
                        if ((i3 & 7168) == 2048) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if ((57344 & i3) == 16384) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        zT = z16 | z15 | dVarF.T(s1Var);
                        objR = dVarF.R();
                        if (zT || objR == d.INSTANCE.a()) {
                            objR = new Function2() { // from class: com.google.android.lhc
                                public final Object invoke(Object obj, Object obj2) {
                                    return SwipeToDismissBoxKt.h(s1Var, z10, z11, (q16) obj, (kx1) obj2);
                                }
                            };
                            dVarF.L(objR);
                        }
                        b bVarA = hg3.a(companion3, anchoredDraggableStateC2, orientation, (Function2) objR);
                        int i15 = (i3 >> 12) & 7168;
                        ej7 ej7VarB2 = t0.b(cVar.j(), companion.l(), dVarF, 0);
                        iA3 = pp1.a(dVarF, 0);
                        gs1 gs1VarJ3 = dVarF.j();
                        b bVarE3 = ComposedModifierKt.e(dVarF, bVarA);
                        function0B3 = companion2.b();
                        if (dVarF.G() == null) {
                            pp1.d();
                        }
                        dVarF.o();
                        if (dVarF.getInserting()) {
                            dVarF.W(function0B3);
                        } else {
                            dVarF.k();
                        }
                        dVarC3 = dud.c(dVarF);
                        dud.i(dVarC3, ej7VarB2, companion2.d());
                        dud.i(dVarC3, gs1VarJ3, companion2.f());
                        function2C3 = companion2.c();
                        if (dVarC3.getInserting() || !Intrinsics.e(dVarC3.R(), Integer.valueOf(iA3))) {
                            dVarC3.L(Integer.valueOf(iA3));
                            dVarC3.e(Integer.valueOf(iA3), function2C3);
                        }
                        dud.i(dVarC3, bVarE3, companion2.e());
                        ps4Var2.invoke(iraVar, dVarF, Integer.valueOf(((i15 >> 6) & 112) | 6));
                        dVarF.m();
                        dVarF.m();
                        SwipeToDismissBoxValue swipeToDismissBoxValueH = s1Var.h();
                        boolean zT2 = dVarF.T(s1Var);
                        if ((3670016 & i3) == 1048576) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        z18 = zT2 | z17;
                        objR2 = dVarF.R();
                        if (z18 || objR2 == d.INSTANCE.a()) {
                            objR2 = new C0203SwipeToDismissBoxKt$SwipeToDismissBox$3$1(s1Var, function3, null);
                            dVarF.L(objR2);
                        }
                        vn3.f(swipeToDismissBoxValueH, function3, (Function2) objR2, dVarF, (i3 >> 15) & 112);
                        if (e.k()) {
                            e.n();
                        }
                        z9 = z11;
                        function2 = function3;
                        bVar3 = bVar4;
                        z8 = z19;
                        z7 = z10;
                    } else {
                        dVarF.q();
                        bVar3 = bVar2;
                        z7 = z4;
                        z8 = z5;
                        z9 = z2;
                    }
                    s6bVarH = dVarF.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.mhc
                            public final Object invoke(Object obj, Object obj2) {
                                return SwipeToDismissBoxKt.j(s1Var, ps4Var, bVar3, z7, z9, z8, function2, ps4Var2, i, i2, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i3 |= 24576;
                i8 = i2 & 32;
                if (i8 != 0) {
                    i3 |= 196608;
                    z5 = z3;
                } else {
                    z5 = z3;
                    if ((i & 196608) == 0) {
                        if (dVarF.A(z5)) {
                            i9 = 131072;
                        } else {
                            i9 = 65536;
                        }
                        i3 |= i9;
                    }
                }
                i10 = i2 & 64;
                if (i10 != 0) {
                    i3 |= 1572864;
                    function2 = function1;
                } else {
                    function2 = function1;
                    if ((i & 1572864) == 0) {
                        if (dVarF.T(function2)) {
                            i11 = 1048576;
                        } else {
                            i11 = 524288;
                        }
                        i3 |= i11;
                    }
                }
                if ((i2 & 128) != 0) {
                    i3 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    if (dVarF.T(ps4Var2)) {
                        i12 = 8388608;
                    } else {
                        i12 = 4194304;
                    }
                    i3 |= i12;
                }
                if ((4793491 & i3) != 4793490) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (dVarF.g(z6, i3 & 1)) {
                    if (i13 != 0) {
                        bVar4 = b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    if (i4 != 0) {
                        z10 = true;
                    } else {
                        z10 = z4;
                    }
                    if (i6 != 0) {
                        z11 = true;
                    } else {
                        z11 = z2;
                    }
                    if (i8 != 0) {
                        z12 = true;
                    } else {
                        z12 = z5;
                    }
                    if (i10 != 0) {
                        objR3 = dVarF.R();
                        if (objR3 == d.INSTANCE.a()) {
                            objR3 = new Function1() { // from class: com.google.android.khc
                                public final Object invoke(Object obj) {
                                    return SwipeToDismissBoxKt.k((SwipeToDismissBoxValue) obj);
                                }
                            };
                            dVarF.L(objR3);
                        }
                        function3 = (Function1) objR3;
                    } else {
                        function3 = function2;
                    }
                    if (e.k()) {
                        e.o(-741495334, i3, -1, "androidx.compose.material3.SwipeToDismissBox (SwipeToDismissBox.kt:313)");
                    }
                    AnchoredDraggableState<SwipeToDismissBoxValue> anchoredDraggableStateC3 = s1Var.c();
                    Orientation orientation2 = Orientation.Horizontal;
                    if (z12) {
                        z13 = false;
                    } else {
                        z13 = false;
                    }
                    if (s1Var.j()) {
                        dVarF.y(387581105);
                        z14 = true;
                        omc omcVarC2 = tg.a.c(s1Var.c(), s1Var.g(), null, dVarF, tg.e << 9, 4);
                        dVarF.u();
                        omcVar = omcVarC2;
                    } else {
                        z14 = true;
                        dVarF.y(-869685853);
                        dVarF.u();
                        omcVar = null;
                    }
                    b bVarR2 = AnchoredDraggableKt.r(bVar4, anchoredDraggableStateC3, orientation2, z13, null, null, omcVar, 24, null);
                    tc.Companion companion4 = tc.INSTANCE;
                    ej7 ej7VarI2 = j.i(companion4.o(), z14);
                    iA = pp1.a(dVarF, 0);
                    gs1 gs1VarJ4 = dVarF.j();
                    b bVarE4 = ComposedModifierKt.e(dVarF, bVarR2);
                    ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                    boolean z110 = z12;
                    function0B = companion5.b();
                    if (dVarF.G() == null) {
                        pp1.d();
                    }
                    dVarF.o();
                    if (dVarF.getInserting()) {
                        dVarF.W(function0B);
                    } else {
                        dVarF.k();
                    }
                    dVarC = dud.c(dVarF);
                    dud.i(dVarC, ej7VarI2, companion5.d());
                    dud.i(dVarC, gs1VarJ4, companion5.f());
                    function2C = companion5.c();
                    if (dVarC.getInserting()) {
                        dVarC.L(Integer.valueOf(iA));
                        dVarC.e(Integer.valueOf(iA), function2C);
                    } else {
                        dVarC.L(Integer.valueOf(iA));
                        dVarC.e(Integer.valueOf(iA), function2C);
                    }
                    dud.i(dVarC, bVarE4, companion5.e());
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.a;
                    b.Companion companion6 = b.INSTANCE;
                    b bVarJ2 = boxScopeInstance2.j(companion6);
                    int i16 = (i3 << 6) & 7168;
                    c cVar2 = c.a;
                    ej7 ej7VarB3 = t0.b(cVar2.j(), companion4.l(), dVarF, 0);
                    iA2 = pp1.a(dVarF, 0);
                    gs1 gs1VarJ5 = dVarF.j();
                    b bVarE5 = ComposedModifierKt.e(dVarF, bVarJ2);
                    function0B2 = companion5.b();
                    if (dVarF.G() == null) {
                        pp1.d();
                    }
                    dVarF.o();
                    if (dVarF.getInserting()) {
                        dVarF.W(function0B2);
                    } else {
                        dVarF.k();
                    }
                    dVarC2 = dud.c(dVarF);
                    dud.i(dVarC2, ej7VarB3, companion5.d());
                    dud.i(dVarC2, gs1VarJ5, companion5.f());
                    function2C2 = companion5.c();
                    if (dVarC2.getInserting()) {
                        dVarC2.L(Integer.valueOf(iA2));
                        dVarC2.e(Integer.valueOf(iA2), function2C2);
                    } else {
                        dVarC2.L(Integer.valueOf(iA2));
                        dVarC2.e(Integer.valueOf(iA2), function2C2);
                    }
                    dud.i(dVarC2, bVarE5, companion5.e());
                    ira iraVar2 = ira.a;
                    ps4Var.invoke(iraVar2, dVarF, Integer.valueOf(((i16 >> 6) & 112) | 6));
                    dVarF.m();
                    AnchoredDraggableState<SwipeToDismissBoxValue> anchoredDraggableStateC4 = s1Var.c();
                    if ((i3 & 7168) == 2048) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if ((57344 & i3) == 16384) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    zT = z16 | z15 | dVarF.T(s1Var);
                    objR = dVarF.R();
                    if (zT) {
                        objR = new Function2() { // from class: com.google.android.lhc
                            public final Object invoke(Object obj, Object obj2) {
                                return SwipeToDismissBoxKt.h(s1Var, z10, z11, (q16) obj, (kx1) obj2);
                            }
                        };
                        dVarF.L(objR);
                    } else {
                        objR = new Function2() { // from class: com.google.android.lhc
                            public final Object invoke(Object obj, Object obj2) {
                                return SwipeToDismissBoxKt.h(s1Var, z10, z11, (q16) obj, (kx1) obj2);
                            }
                        };
                        dVarF.L(objR);
                    }
                    b bVarA2 = hg3.a(companion6, anchoredDraggableStateC4, orientation2, (Function2) objR);
                    int i17 = (i3 >> 12) & 7168;
                    ej7 ej7VarB4 = t0.b(cVar2.j(), companion4.l(), dVarF, 0);
                    iA3 = pp1.a(dVarF, 0);
                    gs1 gs1VarJ6 = dVarF.j();
                    b bVarE6 = ComposedModifierKt.e(dVarF, bVarA2);
                    function0B3 = companion5.b();
                    if (dVarF.G() == null) {
                        pp1.d();
                    }
                    dVarF.o();
                    if (dVarF.getInserting()) {
                        dVarF.W(function0B3);
                    } else {
                        dVarF.k();
                    }
                    dVarC3 = dud.c(dVarF);
                    dud.i(dVarC3, ej7VarB4, companion5.d());
                    dud.i(dVarC3, gs1VarJ6, companion5.f());
                    function2C3 = companion5.c();
                    if (dVarC3.getInserting()) {
                        dVarC3.L(Integer.valueOf(iA3));
                        dVarC3.e(Integer.valueOf(iA3), function2C3);
                    } else {
                        dVarC3.L(Integer.valueOf(iA3));
                        dVarC3.e(Integer.valueOf(iA3), function2C3);
                    }
                    dud.i(dVarC3, bVarE6, companion5.e());
                    ps4Var2.invoke(iraVar2, dVarF, Integer.valueOf(((i17 >> 6) & 112) | 6));
                    dVarF.m();
                    dVarF.m();
                    SwipeToDismissBoxValue swipeToDismissBoxValueH2 = s1Var.h();
                    boolean zT3 = dVarF.T(s1Var);
                    if ((3670016 & i3) == 1048576) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    z18 = zT3 | z17;
                    objR2 = dVarF.R();
                    if (z18) {
                        objR2 = new C0203SwipeToDismissBoxKt$SwipeToDismissBox$3$1(s1Var, function3, null);
                        dVarF.L(objR2);
                    } else {
                        objR2 = new C0203SwipeToDismissBoxKt$SwipeToDismissBox$3$1(s1Var, function3, null);
                        dVarF.L(objR2);
                    }
                    vn3.f(swipeToDismissBoxValueH2, function3, (Function2) objR2, dVarF, (i3 >> 15) & 112);
                    if (e.k()) {
                        e.n();
                    }
                    z9 = z11;
                    function2 = function3;
                    bVar3 = bVar4;
                    z8 = z110;
                    z7 = z10;
                } else {
                    dVarF.q();
                    bVar3 = bVar2;
                    z7 = z4;
                    z8 = z5;
                    z9 = z2;
                }
                s6bVarH = dVarF.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.mhc
                        public final Object invoke(Object obj, Object obj2) {
                            return SwipeToDismissBoxKt.j(s1Var, ps4Var, bVar3, z7, z9, z8, function2, ps4Var2, i, i2, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i3 |= 3072;
            z4 = z;
            i6 = i2 & 16;
            if (i6 != 0) {
                if ((i & 24576) == 0) {
                    if (dVarF.A(z2)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 32;
                if (i8 != 0) {
                    i3 |= 196608;
                    z5 = z3;
                } else {
                    z5 = z3;
                    if ((i & 196608) == 0) {
                        if (dVarF.A(z5)) {
                            i9 = 131072;
                        } else {
                            i9 = 65536;
                        }
                        i3 |= i9;
                    }
                }
                i10 = i2 & 64;
                if (i10 != 0) {
                    i3 |= 1572864;
                    function2 = function1;
                } else {
                    function2 = function1;
                    if ((i & 1572864) == 0) {
                        if (dVarF.T(function2)) {
                            i11 = 1048576;
                        } else {
                            i11 = 524288;
                        }
                        i3 |= i11;
                    }
                }
                if ((i2 & 128) != 0) {
                    i3 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    if (dVarF.T(ps4Var2)) {
                        i12 = 8388608;
                    } else {
                        i12 = 4194304;
                    }
                    i3 |= i12;
                }
                if ((4793491 & i3) != 4793490) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (dVarF.g(z6, i3 & 1)) {
                    if (i13 != 0) {
                        bVar4 = b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    if (i4 != 0) {
                        z10 = true;
                    } else {
                        z10 = z4;
                    }
                    if (i6 != 0) {
                        z11 = true;
                    } else {
                        z11 = z2;
                    }
                    if (i8 != 0) {
                        z12 = true;
                    } else {
                        z12 = z5;
                    }
                    if (i10 != 0) {
                        objR3 = dVarF.R();
                        if (objR3 == d.INSTANCE.a()) {
                            objR3 = new Function1() { // from class: com.google.android.khc
                                public final Object invoke(Object obj) {
                                    return SwipeToDismissBoxKt.k((SwipeToDismissBoxValue) obj);
                                }
                            };
                            dVarF.L(objR3);
                        }
                        function3 = (Function1) objR3;
                    } else {
                        function3 = function2;
                    }
                    if (e.k()) {
                        e.o(-741495334, i3, -1, "androidx.compose.material3.SwipeToDismissBox (SwipeToDismissBox.kt:313)");
                    }
                    AnchoredDraggableState<SwipeToDismissBoxValue> anchoredDraggableStateC5 = s1Var.c();
                    Orientation orientation3 = Orientation.Horizontal;
                    if (z12) {
                        z13 = false;
                    } else {
                        z13 = false;
                    }
                    if (s1Var.j()) {
                        dVarF.y(387581105);
                        z14 = true;
                        omc omcVarC3 = tg.a.c(s1Var.c(), s1Var.g(), null, dVarF, tg.e << 9, 4);
                        dVarF.u();
                        omcVar = omcVarC3;
                    } else {
                        z14 = true;
                        dVarF.y(-869685853);
                        dVarF.u();
                        omcVar = null;
                    }
                    b bVarR3 = AnchoredDraggableKt.r(bVar4, anchoredDraggableStateC5, orientation3, z13, null, null, omcVar, 24, null);
                    tc.Companion companion7 = tc.INSTANCE;
                    ej7 ej7VarI3 = j.i(companion7.o(), z14);
                    iA = pp1.a(dVarF, 0);
                    gs1 gs1VarJ7 = dVarF.j();
                    b bVarE7 = ComposedModifierKt.e(dVarF, bVarR3);
                    ComposeUiNode.Companion companion8 = ComposeUiNode.INSTANCE;
                    boolean z111 = z12;
                    function0B = companion8.b();
                    if (dVarF.G() == null) {
                        pp1.d();
                    }
                    dVarF.o();
                    if (dVarF.getInserting()) {
                        dVarF.W(function0B);
                    } else {
                        dVarF.k();
                    }
                    dVarC = dud.c(dVarF);
                    dud.i(dVarC, ej7VarI3, companion8.d());
                    dud.i(dVarC, gs1VarJ7, companion8.f());
                    function2C = companion8.c();
                    if (dVarC.getInserting()) {
                        dVarC.L(Integer.valueOf(iA));
                        dVarC.e(Integer.valueOf(iA), function2C);
                    } else {
                        dVarC.L(Integer.valueOf(iA));
                        dVarC.e(Integer.valueOf(iA), function2C);
                    }
                    dud.i(dVarC, bVarE7, companion8.e());
                    BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.a;
                    b.Companion companion9 = b.INSTANCE;
                    b bVarJ3 = boxScopeInstance3.j(companion9);
                    int i18 = (i3 << 6) & 7168;
                    c cVar3 = c.a;
                    ej7 ej7VarB5 = t0.b(cVar3.j(), companion7.l(), dVarF, 0);
                    iA2 = pp1.a(dVarF, 0);
                    gs1 gs1VarJ8 = dVarF.j();
                    b bVarE8 = ComposedModifierKt.e(dVarF, bVarJ3);
                    function0B2 = companion8.b();
                    if (dVarF.G() == null) {
                        pp1.d();
                    }
                    dVarF.o();
                    if (dVarF.getInserting()) {
                        dVarF.W(function0B2);
                    } else {
                        dVarF.k();
                    }
                    dVarC2 = dud.c(dVarF);
                    dud.i(dVarC2, ej7VarB5, companion8.d());
                    dud.i(dVarC2, gs1VarJ8, companion8.f());
                    function2C2 = companion8.c();
                    if (dVarC2.getInserting()) {
                        dVarC2.L(Integer.valueOf(iA2));
                        dVarC2.e(Integer.valueOf(iA2), function2C2);
                    } else {
                        dVarC2.L(Integer.valueOf(iA2));
                        dVarC2.e(Integer.valueOf(iA2), function2C2);
                    }
                    dud.i(dVarC2, bVarE8, companion8.e());
                    ira iraVar3 = ira.a;
                    ps4Var.invoke(iraVar3, dVarF, Integer.valueOf(((i18 >> 6) & 112) | 6));
                    dVarF.m();
                    AnchoredDraggableState<SwipeToDismissBoxValue> anchoredDraggableStateC6 = s1Var.c();
                    if ((i3 & 7168) == 2048) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if ((57344 & i3) == 16384) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    zT = z16 | z15 | dVarF.T(s1Var);
                    objR = dVarF.R();
                    if (zT) {
                        objR = new Function2() { // from class: com.google.android.lhc
                            public final Object invoke(Object obj, Object obj2) {
                                return SwipeToDismissBoxKt.h(s1Var, z10, z11, (q16) obj, (kx1) obj2);
                            }
                        };
                        dVarF.L(objR);
                    } else {
                        objR = new Function2() { // from class: com.google.android.lhc
                            public final Object invoke(Object obj, Object obj2) {
                                return SwipeToDismissBoxKt.h(s1Var, z10, z11, (q16) obj, (kx1) obj2);
                            }
                        };
                        dVarF.L(objR);
                    }
                    b bVarA3 = hg3.a(companion9, anchoredDraggableStateC6, orientation3, (Function2) objR);
                    int i19 = (i3 >> 12) & 7168;
                    ej7 ej7VarB6 = t0.b(cVar3.j(), companion7.l(), dVarF, 0);
                    iA3 = pp1.a(dVarF, 0);
                    gs1 gs1VarJ9 = dVarF.j();
                    b bVarE9 = ComposedModifierKt.e(dVarF, bVarA3);
                    function0B3 = companion8.b();
                    if (dVarF.G() == null) {
                        pp1.d();
                    }
                    dVarF.o();
                    if (dVarF.getInserting()) {
                        dVarF.W(function0B3);
                    } else {
                        dVarF.k();
                    }
                    dVarC3 = dud.c(dVarF);
                    dud.i(dVarC3, ej7VarB6, companion8.d());
                    dud.i(dVarC3, gs1VarJ9, companion8.f());
                    function2C3 = companion8.c();
                    if (dVarC3.getInserting()) {
                        dVarC3.L(Integer.valueOf(iA3));
                        dVarC3.e(Integer.valueOf(iA3), function2C3);
                    } else {
                        dVarC3.L(Integer.valueOf(iA3));
                        dVarC3.e(Integer.valueOf(iA3), function2C3);
                    }
                    dud.i(dVarC3, bVarE9, companion8.e());
                    ps4Var2.invoke(iraVar3, dVarF, Integer.valueOf(((i19 >> 6) & 112) | 6));
                    dVarF.m();
                    dVarF.m();
                    SwipeToDismissBoxValue swipeToDismissBoxValueH3 = s1Var.h();
                    boolean zT4 = dVarF.T(s1Var);
                    if ((3670016 & i3) == 1048576) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    z18 = zT4 | z17;
                    objR2 = dVarF.R();
                    if (z18) {
                        objR2 = new C0203SwipeToDismissBoxKt$SwipeToDismissBox$3$1(s1Var, function3, null);
                        dVarF.L(objR2);
                    } else {
                        objR2 = new C0203SwipeToDismissBoxKt$SwipeToDismissBox$3$1(s1Var, function3, null);
                        dVarF.L(objR2);
                    }
                    vn3.f(swipeToDismissBoxValueH3, function3, (Function2) objR2, dVarF, (i3 >> 15) & 112);
                    if (e.k()) {
                        e.n();
                    }
                    z9 = z11;
                    function2 = function3;
                    bVar3 = bVar4;
                    z8 = z111;
                    z7 = z10;
                } else {
                    dVarF.q();
                    bVar3 = bVar2;
                    z7 = z4;
                    z8 = z5;
                    z9 = z2;
                }
                s6bVarH = dVarF.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.mhc
                        public final Object invoke(Object obj, Object obj2) {
                            return SwipeToDismissBoxKt.j(s1Var, ps4Var, bVar3, z7, z9, z8, function2, ps4Var2, i, i2, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i3 |= 24576;
            i8 = i2 & 32;
            if (i8 != 0) {
                i3 |= 196608;
                z5 = z3;
            } else {
                z5 = z3;
                if ((i & 196608) == 0) {
                    if (dVarF.A(z5)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i3 |= i9;
                }
            }
            i10 = i2 & 64;
            if (i10 != 0) {
                i3 |= 1572864;
                function2 = function1;
            } else {
                function2 = function1;
                if ((i & 1572864) == 0) {
                    if (dVarF.T(function2)) {
                        i11 = 1048576;
                    } else {
                        i11 = 524288;
                    }
                    i3 |= i11;
                }
            }
            if ((i2 & 128) != 0) {
                i3 |= 12582912;
            } else if ((i & 12582912) == 0) {
                if (dVarF.T(ps4Var2)) {
                    i12 = 8388608;
                } else {
                    i12 = 4194304;
                }
                i3 |= i12;
            }
            if ((4793491 & i3) != 4793490) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (dVarF.g(z6, i3 & 1)) {
                if (i13 != 0) {
                    bVar4 = b.INSTANCE;
                } else {
                    bVar4 = bVar2;
                }
                if (i4 != 0) {
                    z10 = true;
                } else {
                    z10 = z4;
                }
                if (i6 != 0) {
                    z11 = true;
                } else {
                    z11 = z2;
                }
                if (i8 != 0) {
                    z12 = true;
                } else {
                    z12 = z5;
                }
                if (i10 != 0) {
                    objR3 = dVarF.R();
                    if (objR3 == d.INSTANCE.a()) {
                        objR3 = new Function1() { // from class: com.google.android.khc
                            public final Object invoke(Object obj) {
                                return SwipeToDismissBoxKt.k((SwipeToDismissBoxValue) obj);
                            }
                        };
                        dVarF.L(objR3);
                    }
                    function3 = (Function1) objR3;
                } else {
                    function3 = function2;
                }
                if (e.k()) {
                    e.o(-741495334, i3, -1, "androidx.compose.material3.SwipeToDismissBox (SwipeToDismissBox.kt:313)");
                }
                AnchoredDraggableState<SwipeToDismissBoxValue> anchoredDraggableStateC7 = s1Var.c();
                Orientation orientation4 = Orientation.Horizontal;
                if (z12) {
                    z13 = false;
                } else {
                    z13 = false;
                }
                if (s1Var.j()) {
                    dVarF.y(387581105);
                    z14 = true;
                    omc omcVarC4 = tg.a.c(s1Var.c(), s1Var.g(), null, dVarF, tg.e << 9, 4);
                    dVarF.u();
                    omcVar = omcVarC4;
                } else {
                    z14 = true;
                    dVarF.y(-869685853);
                    dVarF.u();
                    omcVar = null;
                }
                b bVarR4 = AnchoredDraggableKt.r(bVar4, anchoredDraggableStateC7, orientation4, z13, null, null, omcVar, 24, null);
                tc.Companion companion10 = tc.INSTANCE;
                ej7 ej7VarI4 = j.i(companion10.o(), z14);
                iA = pp1.a(dVarF, 0);
                gs1 gs1VarJ10 = dVarF.j();
                b bVarE10 = ComposedModifierKt.e(dVarF, bVarR4);
                ComposeUiNode.Companion companion11 = ComposeUiNode.INSTANCE;
                boolean z112 = z12;
                function0B = companion11.b();
                if (dVarF.G() == null) {
                    pp1.d();
                }
                dVarF.o();
                if (dVarF.getInserting()) {
                    dVarF.W(function0B);
                } else {
                    dVarF.k();
                }
                dVarC = dud.c(dVarF);
                dud.i(dVarC, ej7VarI4, companion11.d());
                dud.i(dVarC, gs1VarJ10, companion11.f());
                function2C = companion11.c();
                if (dVarC.getInserting()) {
                    dVarC.L(Integer.valueOf(iA));
                    dVarC.e(Integer.valueOf(iA), function2C);
                } else {
                    dVarC.L(Integer.valueOf(iA));
                    dVarC.e(Integer.valueOf(iA), function2C);
                }
                dud.i(dVarC, bVarE10, companion11.e());
                BoxScopeInstance boxScopeInstance4 = BoxScopeInstance.a;
                b.Companion companion12 = b.INSTANCE;
                b bVarJ4 = boxScopeInstance4.j(companion12);
                int i110 = (i3 << 6) & 7168;
                c cVar4 = c.a;
                ej7 ej7VarB7 = t0.b(cVar4.j(), companion10.l(), dVarF, 0);
                iA2 = pp1.a(dVarF, 0);
                gs1 gs1VarJ11 = dVarF.j();
                b bVarE11 = ComposedModifierKt.e(dVarF, bVarJ4);
                function0B2 = companion11.b();
                if (dVarF.G() == null) {
                    pp1.d();
                }
                dVarF.o();
                if (dVarF.getInserting()) {
                    dVarF.W(function0B2);
                } else {
                    dVarF.k();
                }
                dVarC2 = dud.c(dVarF);
                dud.i(dVarC2, ej7VarB7, companion11.d());
                dud.i(dVarC2, gs1VarJ11, companion11.f());
                function2C2 = companion11.c();
                if (dVarC2.getInserting()) {
                    dVarC2.L(Integer.valueOf(iA2));
                    dVarC2.e(Integer.valueOf(iA2), function2C2);
                } else {
                    dVarC2.L(Integer.valueOf(iA2));
                    dVarC2.e(Integer.valueOf(iA2), function2C2);
                }
                dud.i(dVarC2, bVarE11, companion11.e());
                ira iraVar4 = ira.a;
                ps4Var.invoke(iraVar4, dVarF, Integer.valueOf(((i110 >> 6) & 112) | 6));
                dVarF.m();
                AnchoredDraggableState<SwipeToDismissBoxValue> anchoredDraggableStateC8 = s1Var.c();
                if ((i3 & 7168) == 2048) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if ((57344 & i3) == 16384) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                zT = z16 | z15 | dVarF.T(s1Var);
                objR = dVarF.R();
                if (zT) {
                    objR = new Function2() { // from class: com.google.android.lhc
                        public final Object invoke(Object obj, Object obj2) {
                            return SwipeToDismissBoxKt.h(s1Var, z10, z11, (q16) obj, (kx1) obj2);
                        }
                    };
                    dVarF.L(objR);
                } else {
                    objR = new Function2() { // from class: com.google.android.lhc
                        public final Object invoke(Object obj, Object obj2) {
                            return SwipeToDismissBoxKt.h(s1Var, z10, z11, (q16) obj, (kx1) obj2);
                        }
                    };
                    dVarF.L(objR);
                }
                b bVarA4 = hg3.a(companion12, anchoredDraggableStateC8, orientation4, (Function2) objR);
                int i111 = (i3 >> 12) & 7168;
                ej7 ej7VarB8 = t0.b(cVar4.j(), companion10.l(), dVarF, 0);
                iA3 = pp1.a(dVarF, 0);
                gs1 gs1VarJ12 = dVarF.j();
                b bVarE12 = ComposedModifierKt.e(dVarF, bVarA4);
                function0B3 = companion11.b();
                if (dVarF.G() == null) {
                    pp1.d();
                }
                dVarF.o();
                if (dVarF.getInserting()) {
                    dVarF.W(function0B3);
                } else {
                    dVarF.k();
                }
                dVarC3 = dud.c(dVarF);
                dud.i(dVarC3, ej7VarB8, companion11.d());
                dud.i(dVarC3, gs1VarJ12, companion11.f());
                function2C3 = companion11.c();
                if (dVarC3.getInserting()) {
                    dVarC3.L(Integer.valueOf(iA3));
                    dVarC3.e(Integer.valueOf(iA3), function2C3);
                } else {
                    dVarC3.L(Integer.valueOf(iA3));
                    dVarC3.e(Integer.valueOf(iA3), function2C3);
                }
                dud.i(dVarC3, bVarE12, companion11.e());
                ps4Var2.invoke(iraVar4, dVarF, Integer.valueOf(((i111 >> 6) & 112) | 6));
                dVarF.m();
                dVarF.m();
                SwipeToDismissBoxValue swipeToDismissBoxValueH4 = s1Var.h();
                boolean zT5 = dVarF.T(s1Var);
                if ((3670016 & i3) == 1048576) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                z18 = zT5 | z17;
                objR2 = dVarF.R();
                if (z18) {
                    objR2 = new C0203SwipeToDismissBoxKt$SwipeToDismissBox$3$1(s1Var, function3, null);
                    dVarF.L(objR2);
                } else {
                    objR2 = new C0203SwipeToDismissBoxKt$SwipeToDismissBox$3$1(s1Var, function3, null);
                    dVarF.L(objR2);
                }
                vn3.f(swipeToDismissBoxValueH4, function3, (Function2) objR2, dVarF, (i3 >> 15) & 112);
                if (e.k()) {
                    e.n();
                }
                z9 = z11;
                function2 = function3;
                bVar3 = bVar4;
                z8 = z112;
                z7 = z10;
            } else {
                dVarF.q();
                bVar3 = bVar2;
                z7 = z4;
                z8 = z5;
                z9 = z2;
            }
            s6bVarH = dVarF.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.mhc
                    public final Object invoke(Object obj, Object obj2) {
                        return SwipeToDismissBoxKt.j(s1Var, ps4Var, bVar3, z7, z9, z8, function2, ps4Var2, i, i2, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i3 |= 384;
        bVar2 = bVar;
        i4 = i2 & 8;
        if (i4 != 0) {
            if ((i & 3072) == 0) {
                z4 = z;
                if (dVarF.A(z4)) {
                    i5 = 2048;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
            i6 = i2 & 16;
            if (i6 != 0) {
                if ((i & 24576) == 0) {
                    if (dVarF.A(z2)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 32;
                if (i8 != 0) {
                    i3 |= 196608;
                    z5 = z3;
                } else {
                    z5 = z3;
                    if ((i & 196608) == 0) {
                        if (dVarF.A(z5)) {
                            i9 = 131072;
                        } else {
                            i9 = 65536;
                        }
                        i3 |= i9;
                    }
                }
                i10 = i2 & 64;
                if (i10 != 0) {
                    i3 |= 1572864;
                    function2 = function1;
                } else {
                    function2 = function1;
                    if ((i & 1572864) == 0) {
                        if (dVarF.T(function2)) {
                            i11 = 1048576;
                        } else {
                            i11 = 524288;
                        }
                        i3 |= i11;
                    }
                }
                if ((i2 & 128) != 0) {
                    i3 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    if (dVarF.T(ps4Var2)) {
                        i12 = 8388608;
                    } else {
                        i12 = 4194304;
                    }
                    i3 |= i12;
                }
                if ((4793491 & i3) != 4793490) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (dVarF.g(z6, i3 & 1)) {
                    if (i13 != 0) {
                        bVar4 = b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    if (i4 != 0) {
                        z10 = true;
                    } else {
                        z10 = z4;
                    }
                    if (i6 != 0) {
                        z11 = true;
                    } else {
                        z11 = z2;
                    }
                    if (i8 != 0) {
                        z12 = true;
                    } else {
                        z12 = z5;
                    }
                    if (i10 != 0) {
                        objR3 = dVarF.R();
                        if (objR3 == d.INSTANCE.a()) {
                            objR3 = new Function1() { // from class: com.google.android.khc
                                public final Object invoke(Object obj) {
                                    return SwipeToDismissBoxKt.k((SwipeToDismissBoxValue) obj);
                                }
                            };
                            dVarF.L(objR3);
                        }
                        function3 = (Function1) objR3;
                    } else {
                        function3 = function2;
                    }
                    if (e.k()) {
                        e.o(-741495334, i3, -1, "androidx.compose.material3.SwipeToDismissBox (SwipeToDismissBox.kt:313)");
                    }
                    AnchoredDraggableState<SwipeToDismissBoxValue> anchoredDraggableStateC9 = s1Var.c();
                    Orientation orientation5 = Orientation.Horizontal;
                    if (z12) {
                        z13 = false;
                    } else {
                        z13 = false;
                    }
                    if (s1Var.j()) {
                        dVarF.y(387581105);
                        z14 = true;
                        omc omcVarC5 = tg.a.c(s1Var.c(), s1Var.g(), null, dVarF, tg.e << 9, 4);
                        dVarF.u();
                        omcVar = omcVarC5;
                    } else {
                        z14 = true;
                        dVarF.y(-869685853);
                        dVarF.u();
                        omcVar = null;
                    }
                    b bVarR5 = AnchoredDraggableKt.r(bVar4, anchoredDraggableStateC9, orientation5, z13, null, null, omcVar, 24, null);
                    tc.Companion companion13 = tc.INSTANCE;
                    ej7 ej7VarI5 = j.i(companion13.o(), z14);
                    iA = pp1.a(dVarF, 0);
                    gs1 gs1VarJ13 = dVarF.j();
                    b bVarE13 = ComposedModifierKt.e(dVarF, bVarR5);
                    ComposeUiNode.Companion companion14 = ComposeUiNode.INSTANCE;
                    boolean z113 = z12;
                    function0B = companion14.b();
                    if (dVarF.G() == null) {
                        pp1.d();
                    }
                    dVarF.o();
                    if (dVarF.getInserting()) {
                        dVarF.W(function0B);
                    } else {
                        dVarF.k();
                    }
                    dVarC = dud.c(dVarF);
                    dud.i(dVarC, ej7VarI5, companion14.d());
                    dud.i(dVarC, gs1VarJ13, companion14.f());
                    function2C = companion14.c();
                    if (dVarC.getInserting()) {
                        dVarC.L(Integer.valueOf(iA));
                        dVarC.e(Integer.valueOf(iA), function2C);
                    } else {
                        dVarC.L(Integer.valueOf(iA));
                        dVarC.e(Integer.valueOf(iA), function2C);
                    }
                    dud.i(dVarC, bVarE13, companion14.e());
                    BoxScopeInstance boxScopeInstance5 = BoxScopeInstance.a;
                    b.Companion companion15 = b.INSTANCE;
                    b bVarJ5 = boxScopeInstance5.j(companion15);
                    int i112 = (i3 << 6) & 7168;
                    c cVar5 = c.a;
                    ej7 ej7VarB9 = t0.b(cVar5.j(), companion13.l(), dVarF, 0);
                    iA2 = pp1.a(dVarF, 0);
                    gs1 gs1VarJ14 = dVarF.j();
                    b bVarE14 = ComposedModifierKt.e(dVarF, bVarJ5);
                    function0B2 = companion14.b();
                    if (dVarF.G() == null) {
                        pp1.d();
                    }
                    dVarF.o();
                    if (dVarF.getInserting()) {
                        dVarF.W(function0B2);
                    } else {
                        dVarF.k();
                    }
                    dVarC2 = dud.c(dVarF);
                    dud.i(dVarC2, ej7VarB9, companion14.d());
                    dud.i(dVarC2, gs1VarJ14, companion14.f());
                    function2C2 = companion14.c();
                    if (dVarC2.getInserting()) {
                        dVarC2.L(Integer.valueOf(iA2));
                        dVarC2.e(Integer.valueOf(iA2), function2C2);
                    } else {
                        dVarC2.L(Integer.valueOf(iA2));
                        dVarC2.e(Integer.valueOf(iA2), function2C2);
                    }
                    dud.i(dVarC2, bVarE14, companion14.e());
                    ira iraVar5 = ira.a;
                    ps4Var.invoke(iraVar5, dVarF, Integer.valueOf(((i112 >> 6) & 112) | 6));
                    dVarF.m();
                    AnchoredDraggableState<SwipeToDismissBoxValue> anchoredDraggableStateC10 = s1Var.c();
                    if ((i3 & 7168) == 2048) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if ((57344 & i3) == 16384) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    zT = z16 | z15 | dVarF.T(s1Var);
                    objR = dVarF.R();
                    if (zT) {
                        objR = new Function2() { // from class: com.google.android.lhc
                            public final Object invoke(Object obj, Object obj2) {
                                return SwipeToDismissBoxKt.h(s1Var, z10, z11, (q16) obj, (kx1) obj2);
                            }
                        };
                        dVarF.L(objR);
                    } else {
                        objR = new Function2() { // from class: com.google.android.lhc
                            public final Object invoke(Object obj, Object obj2) {
                                return SwipeToDismissBoxKt.h(s1Var, z10, z11, (q16) obj, (kx1) obj2);
                            }
                        };
                        dVarF.L(objR);
                    }
                    b bVarA5 = hg3.a(companion15, anchoredDraggableStateC10, orientation5, (Function2) objR);
                    int i113 = (i3 >> 12) & 7168;
                    ej7 ej7VarB10 = t0.b(cVar5.j(), companion13.l(), dVarF, 0);
                    iA3 = pp1.a(dVarF, 0);
                    gs1 gs1VarJ15 = dVarF.j();
                    b bVarE15 = ComposedModifierKt.e(dVarF, bVarA5);
                    function0B3 = companion14.b();
                    if (dVarF.G() == null) {
                        pp1.d();
                    }
                    dVarF.o();
                    if (dVarF.getInserting()) {
                        dVarF.W(function0B3);
                    } else {
                        dVarF.k();
                    }
                    dVarC3 = dud.c(dVarF);
                    dud.i(dVarC3, ej7VarB10, companion14.d());
                    dud.i(dVarC3, gs1VarJ15, companion14.f());
                    function2C3 = companion14.c();
                    if (dVarC3.getInserting()) {
                        dVarC3.L(Integer.valueOf(iA3));
                        dVarC3.e(Integer.valueOf(iA3), function2C3);
                    } else {
                        dVarC3.L(Integer.valueOf(iA3));
                        dVarC3.e(Integer.valueOf(iA3), function2C3);
                    }
                    dud.i(dVarC3, bVarE15, companion14.e());
                    ps4Var2.invoke(iraVar5, dVarF, Integer.valueOf(((i113 >> 6) & 112) | 6));
                    dVarF.m();
                    dVarF.m();
                    SwipeToDismissBoxValue swipeToDismissBoxValueH5 = s1Var.h();
                    boolean zT6 = dVarF.T(s1Var);
                    if ((3670016 & i3) == 1048576) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    z18 = zT6 | z17;
                    objR2 = dVarF.R();
                    if (z18) {
                        objR2 = new C0203SwipeToDismissBoxKt$SwipeToDismissBox$3$1(s1Var, function3, null);
                        dVarF.L(objR2);
                    } else {
                        objR2 = new C0203SwipeToDismissBoxKt$SwipeToDismissBox$3$1(s1Var, function3, null);
                        dVarF.L(objR2);
                    }
                    vn3.f(swipeToDismissBoxValueH5, function3, (Function2) objR2, dVarF, (i3 >> 15) & 112);
                    if (e.k()) {
                        e.n();
                    }
                    z9 = z11;
                    function2 = function3;
                    bVar3 = bVar4;
                    z8 = z113;
                    z7 = z10;
                } else {
                    dVarF.q();
                    bVar3 = bVar2;
                    z7 = z4;
                    z8 = z5;
                    z9 = z2;
                }
                s6bVarH = dVarF.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.mhc
                        public final Object invoke(Object obj, Object obj2) {
                            return SwipeToDismissBoxKt.j(s1Var, ps4Var, bVar3, z7, z9, z8, function2, ps4Var2, i, i2, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i3 |= 24576;
            i8 = i2 & 32;
            if (i8 != 0) {
                i3 |= 196608;
                z5 = z3;
            } else {
                z5 = z3;
                if ((i & 196608) == 0) {
                    if (dVarF.A(z5)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i3 |= i9;
                }
            }
            i10 = i2 & 64;
            if (i10 != 0) {
                i3 |= 1572864;
                function2 = function1;
            } else {
                function2 = function1;
                if ((i & 1572864) == 0) {
                    if (dVarF.T(function2)) {
                        i11 = 1048576;
                    } else {
                        i11 = 524288;
                    }
                    i3 |= i11;
                }
            }
            if ((i2 & 128) != 0) {
                i3 |= 12582912;
            } else if ((i & 12582912) == 0) {
                if (dVarF.T(ps4Var2)) {
                    i12 = 8388608;
                } else {
                    i12 = 4194304;
                }
                i3 |= i12;
            }
            if ((4793491 & i3) != 4793490) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (dVarF.g(z6, i3 & 1)) {
                if (i13 != 0) {
                    bVar4 = b.INSTANCE;
                } else {
                    bVar4 = bVar2;
                }
                if (i4 != 0) {
                    z10 = true;
                } else {
                    z10 = z4;
                }
                if (i6 != 0) {
                    z11 = true;
                } else {
                    z11 = z2;
                }
                if (i8 != 0) {
                    z12 = true;
                } else {
                    z12 = z5;
                }
                if (i10 != 0) {
                    objR3 = dVarF.R();
                    if (objR3 == d.INSTANCE.a()) {
                        objR3 = new Function1() { // from class: com.google.android.khc
                            public final Object invoke(Object obj) {
                                return SwipeToDismissBoxKt.k((SwipeToDismissBoxValue) obj);
                            }
                        };
                        dVarF.L(objR3);
                    }
                    function3 = (Function1) objR3;
                } else {
                    function3 = function2;
                }
                if (e.k()) {
                    e.o(-741495334, i3, -1, "androidx.compose.material3.SwipeToDismissBox (SwipeToDismissBox.kt:313)");
                }
                AnchoredDraggableState<SwipeToDismissBoxValue> anchoredDraggableStateC11 = s1Var.c();
                Orientation orientation6 = Orientation.Horizontal;
                if (z12) {
                    z13 = false;
                } else {
                    z13 = false;
                }
                if (s1Var.j()) {
                    dVarF.y(387581105);
                    z14 = true;
                    omc omcVarC6 = tg.a.c(s1Var.c(), s1Var.g(), null, dVarF, tg.e << 9, 4);
                    dVarF.u();
                    omcVar = omcVarC6;
                } else {
                    z14 = true;
                    dVarF.y(-869685853);
                    dVarF.u();
                    omcVar = null;
                }
                b bVarR6 = AnchoredDraggableKt.r(bVar4, anchoredDraggableStateC11, orientation6, z13, null, null, omcVar, 24, null);
                tc.Companion companion16 = tc.INSTANCE;
                ej7 ej7VarI6 = j.i(companion16.o(), z14);
                iA = pp1.a(dVarF, 0);
                gs1 gs1VarJ16 = dVarF.j();
                b bVarE16 = ComposedModifierKt.e(dVarF, bVarR6);
                ComposeUiNode.Companion companion17 = ComposeUiNode.INSTANCE;
                boolean z114 = z12;
                function0B = companion17.b();
                if (dVarF.G() == null) {
                    pp1.d();
                }
                dVarF.o();
                if (dVarF.getInserting()) {
                    dVarF.W(function0B);
                } else {
                    dVarF.k();
                }
                dVarC = dud.c(dVarF);
                dud.i(dVarC, ej7VarI6, companion17.d());
                dud.i(dVarC, gs1VarJ16, companion17.f());
                function2C = companion17.c();
                if (dVarC.getInserting()) {
                    dVarC.L(Integer.valueOf(iA));
                    dVarC.e(Integer.valueOf(iA), function2C);
                } else {
                    dVarC.L(Integer.valueOf(iA));
                    dVarC.e(Integer.valueOf(iA), function2C);
                }
                dud.i(dVarC, bVarE16, companion17.e());
                BoxScopeInstance boxScopeInstance6 = BoxScopeInstance.a;
                b.Companion companion18 = b.INSTANCE;
                b bVarJ6 = boxScopeInstance6.j(companion18);
                int i114 = (i3 << 6) & 7168;
                c cVar6 = c.a;
                ej7 ej7VarB11 = t0.b(cVar6.j(), companion16.l(), dVarF, 0);
                iA2 = pp1.a(dVarF, 0);
                gs1 gs1VarJ17 = dVarF.j();
                b bVarE17 = ComposedModifierKt.e(dVarF, bVarJ6);
                function0B2 = companion17.b();
                if (dVarF.G() == null) {
                    pp1.d();
                }
                dVarF.o();
                if (dVarF.getInserting()) {
                    dVarF.W(function0B2);
                } else {
                    dVarF.k();
                }
                dVarC2 = dud.c(dVarF);
                dud.i(dVarC2, ej7VarB11, companion17.d());
                dud.i(dVarC2, gs1VarJ17, companion17.f());
                function2C2 = companion17.c();
                if (dVarC2.getInserting()) {
                    dVarC2.L(Integer.valueOf(iA2));
                    dVarC2.e(Integer.valueOf(iA2), function2C2);
                } else {
                    dVarC2.L(Integer.valueOf(iA2));
                    dVarC2.e(Integer.valueOf(iA2), function2C2);
                }
                dud.i(dVarC2, bVarE17, companion17.e());
                ira iraVar6 = ira.a;
                ps4Var.invoke(iraVar6, dVarF, Integer.valueOf(((i114 >> 6) & 112) | 6));
                dVarF.m();
                AnchoredDraggableState<SwipeToDismissBoxValue> anchoredDraggableStateC12 = s1Var.c();
                if ((i3 & 7168) == 2048) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if ((57344 & i3) == 16384) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                zT = z16 | z15 | dVarF.T(s1Var);
                objR = dVarF.R();
                if (zT) {
                    objR = new Function2() { // from class: com.google.android.lhc
                        public final Object invoke(Object obj, Object obj2) {
                            return SwipeToDismissBoxKt.h(s1Var, z10, z11, (q16) obj, (kx1) obj2);
                        }
                    };
                    dVarF.L(objR);
                } else {
                    objR = new Function2() { // from class: com.google.android.lhc
                        public final Object invoke(Object obj, Object obj2) {
                            return SwipeToDismissBoxKt.h(s1Var, z10, z11, (q16) obj, (kx1) obj2);
                        }
                    };
                    dVarF.L(objR);
                }
                b bVarA6 = hg3.a(companion18, anchoredDraggableStateC12, orientation6, (Function2) objR);
                int i115 = (i3 >> 12) & 7168;
                ej7 ej7VarB12 = t0.b(cVar6.j(), companion16.l(), dVarF, 0);
                iA3 = pp1.a(dVarF, 0);
                gs1 gs1VarJ18 = dVarF.j();
                b bVarE18 = ComposedModifierKt.e(dVarF, bVarA6);
                function0B3 = companion17.b();
                if (dVarF.G() == null) {
                    pp1.d();
                }
                dVarF.o();
                if (dVarF.getInserting()) {
                    dVarF.W(function0B3);
                } else {
                    dVarF.k();
                }
                dVarC3 = dud.c(dVarF);
                dud.i(dVarC3, ej7VarB12, companion17.d());
                dud.i(dVarC3, gs1VarJ18, companion17.f());
                function2C3 = companion17.c();
                if (dVarC3.getInserting()) {
                    dVarC3.L(Integer.valueOf(iA3));
                    dVarC3.e(Integer.valueOf(iA3), function2C3);
                } else {
                    dVarC3.L(Integer.valueOf(iA3));
                    dVarC3.e(Integer.valueOf(iA3), function2C3);
                }
                dud.i(dVarC3, bVarE18, companion17.e());
                ps4Var2.invoke(iraVar6, dVarF, Integer.valueOf(((i115 >> 6) & 112) | 6));
                dVarF.m();
                dVarF.m();
                SwipeToDismissBoxValue swipeToDismissBoxValueH6 = s1Var.h();
                boolean zT7 = dVarF.T(s1Var);
                if ((3670016 & i3) == 1048576) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                z18 = zT7 | z17;
                objR2 = dVarF.R();
                if (z18) {
                    objR2 = new C0203SwipeToDismissBoxKt$SwipeToDismissBox$3$1(s1Var, function3, null);
                    dVarF.L(objR2);
                } else {
                    objR2 = new C0203SwipeToDismissBoxKt$SwipeToDismissBox$3$1(s1Var, function3, null);
                    dVarF.L(objR2);
                }
                vn3.f(swipeToDismissBoxValueH6, function3, (Function2) objR2, dVarF, (i3 >> 15) & 112);
                if (e.k()) {
                    e.n();
                }
                z9 = z11;
                function2 = function3;
                bVar3 = bVar4;
                z8 = z114;
                z7 = z10;
            } else {
                dVarF.q();
                bVar3 = bVar2;
                z7 = z4;
                z8 = z5;
                z9 = z2;
            }
            s6bVarH = dVarF.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.mhc
                    public final Object invoke(Object obj, Object obj2) {
                        return SwipeToDismissBoxKt.j(s1Var, ps4Var, bVar3, z7, z9, z8, function2, ps4Var2, i, i2, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i3 |= 3072;
        z4 = z;
        i6 = i2 & 16;
        if (i6 != 0) {
            if ((i & 24576) == 0) {
                if (dVarF.A(z2)) {
                    i7 = 16384;
                } else {
                    i7 = 8192;
                }
                i3 |= i7;
            }
            i8 = i2 & 32;
            if (i8 != 0) {
                i3 |= 196608;
                z5 = z3;
            } else {
                z5 = z3;
                if ((i & 196608) == 0) {
                    if (dVarF.A(z5)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i3 |= i9;
                }
            }
            i10 = i2 & 64;
            if (i10 != 0) {
                i3 |= 1572864;
                function2 = function1;
            } else {
                function2 = function1;
                if ((i & 1572864) == 0) {
                    if (dVarF.T(function2)) {
                        i11 = 1048576;
                    } else {
                        i11 = 524288;
                    }
                    i3 |= i11;
                }
            }
            if ((i2 & 128) != 0) {
                i3 |= 12582912;
            } else if ((i & 12582912) == 0) {
                if (dVarF.T(ps4Var2)) {
                    i12 = 8388608;
                } else {
                    i12 = 4194304;
                }
                i3 |= i12;
            }
            if ((4793491 & i3) != 4793490) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (dVarF.g(z6, i3 & 1)) {
                if (i13 != 0) {
                    bVar4 = b.INSTANCE;
                } else {
                    bVar4 = bVar2;
                }
                if (i4 != 0) {
                    z10 = true;
                } else {
                    z10 = z4;
                }
                if (i6 != 0) {
                    z11 = true;
                } else {
                    z11 = z2;
                }
                if (i8 != 0) {
                    z12 = true;
                } else {
                    z12 = z5;
                }
                if (i10 != 0) {
                    objR3 = dVarF.R();
                    if (objR3 == d.INSTANCE.a()) {
                        objR3 = new Function1() { // from class: com.google.android.khc
                            public final Object invoke(Object obj) {
                                return SwipeToDismissBoxKt.k((SwipeToDismissBoxValue) obj);
                            }
                        };
                        dVarF.L(objR3);
                    }
                    function3 = (Function1) objR3;
                } else {
                    function3 = function2;
                }
                if (e.k()) {
                    e.o(-741495334, i3, -1, "androidx.compose.material3.SwipeToDismissBox (SwipeToDismissBox.kt:313)");
                }
                AnchoredDraggableState<SwipeToDismissBoxValue> anchoredDraggableStateC13 = s1Var.c();
                Orientation orientation7 = Orientation.Horizontal;
                if (z12) {
                    z13 = false;
                } else {
                    z13 = false;
                }
                if (s1Var.j()) {
                    dVarF.y(387581105);
                    z14 = true;
                    omc omcVarC7 = tg.a.c(s1Var.c(), s1Var.g(), null, dVarF, tg.e << 9, 4);
                    dVarF.u();
                    omcVar = omcVarC7;
                } else {
                    z14 = true;
                    dVarF.y(-869685853);
                    dVarF.u();
                    omcVar = null;
                }
                b bVarR7 = AnchoredDraggableKt.r(bVar4, anchoredDraggableStateC13, orientation7, z13, null, null, omcVar, 24, null);
                tc.Companion companion19 = tc.INSTANCE;
                ej7 ej7VarI7 = j.i(companion19.o(), z14);
                iA = pp1.a(dVarF, 0);
                gs1 gs1VarJ19 = dVarF.j();
                b bVarE19 = ComposedModifierKt.e(dVarF, bVarR7);
                ComposeUiNode.Companion companion110 = ComposeUiNode.INSTANCE;
                boolean z115 = z12;
                function0B = companion110.b();
                if (dVarF.G() == null) {
                    pp1.d();
                }
                dVarF.o();
                if (dVarF.getInserting()) {
                    dVarF.W(function0B);
                } else {
                    dVarF.k();
                }
                dVarC = dud.c(dVarF);
                dud.i(dVarC, ej7VarI7, companion110.d());
                dud.i(dVarC, gs1VarJ19, companion110.f());
                function2C = companion110.c();
                if (dVarC.getInserting()) {
                    dVarC.L(Integer.valueOf(iA));
                    dVarC.e(Integer.valueOf(iA), function2C);
                } else {
                    dVarC.L(Integer.valueOf(iA));
                    dVarC.e(Integer.valueOf(iA), function2C);
                }
                dud.i(dVarC, bVarE19, companion110.e());
                BoxScopeInstance boxScopeInstance7 = BoxScopeInstance.a;
                b.Companion companion111 = b.INSTANCE;
                b bVarJ7 = boxScopeInstance7.j(companion111);
                int i116 = (i3 << 6) & 7168;
                c cVar7 = c.a;
                ej7 ej7VarB13 = t0.b(cVar7.j(), companion19.l(), dVarF, 0);
                iA2 = pp1.a(dVarF, 0);
                gs1 gs1VarJ110 = dVarF.j();
                b bVarE110 = ComposedModifierKt.e(dVarF, bVarJ7);
                function0B2 = companion110.b();
                if (dVarF.G() == null) {
                    pp1.d();
                }
                dVarF.o();
                if (dVarF.getInserting()) {
                    dVarF.W(function0B2);
                } else {
                    dVarF.k();
                }
                dVarC2 = dud.c(dVarF);
                dud.i(dVarC2, ej7VarB13, companion110.d());
                dud.i(dVarC2, gs1VarJ110, companion110.f());
                function2C2 = companion110.c();
                if (dVarC2.getInserting()) {
                    dVarC2.L(Integer.valueOf(iA2));
                    dVarC2.e(Integer.valueOf(iA2), function2C2);
                } else {
                    dVarC2.L(Integer.valueOf(iA2));
                    dVarC2.e(Integer.valueOf(iA2), function2C2);
                }
                dud.i(dVarC2, bVarE110, companion110.e());
                ira iraVar7 = ira.a;
                ps4Var.invoke(iraVar7, dVarF, Integer.valueOf(((i116 >> 6) & 112) | 6));
                dVarF.m();
                AnchoredDraggableState<SwipeToDismissBoxValue> anchoredDraggableStateC14 = s1Var.c();
                if ((i3 & 7168) == 2048) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if ((57344 & i3) == 16384) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                zT = z16 | z15 | dVarF.T(s1Var);
                objR = dVarF.R();
                if (zT) {
                    objR = new Function2() { // from class: com.google.android.lhc
                        public final Object invoke(Object obj, Object obj2) {
                            return SwipeToDismissBoxKt.h(s1Var, z10, z11, (q16) obj, (kx1) obj2);
                        }
                    };
                    dVarF.L(objR);
                } else {
                    objR = new Function2() { // from class: com.google.android.lhc
                        public final Object invoke(Object obj, Object obj2) {
                            return SwipeToDismissBoxKt.h(s1Var, z10, z11, (q16) obj, (kx1) obj2);
                        }
                    };
                    dVarF.L(objR);
                }
                b bVarA7 = hg3.a(companion111, anchoredDraggableStateC14, orientation7, (Function2) objR);
                int i117 = (i3 >> 12) & 7168;
                ej7 ej7VarB14 = t0.b(cVar7.j(), companion19.l(), dVarF, 0);
                iA3 = pp1.a(dVarF, 0);
                gs1 gs1VarJ111 = dVarF.j();
                b bVarE111 = ComposedModifierKt.e(dVarF, bVarA7);
                function0B3 = companion110.b();
                if (dVarF.G() == null) {
                    pp1.d();
                }
                dVarF.o();
                if (dVarF.getInserting()) {
                    dVarF.W(function0B3);
                } else {
                    dVarF.k();
                }
                dVarC3 = dud.c(dVarF);
                dud.i(dVarC3, ej7VarB14, companion110.d());
                dud.i(dVarC3, gs1VarJ111, companion110.f());
                function2C3 = companion110.c();
                if (dVarC3.getInserting()) {
                    dVarC3.L(Integer.valueOf(iA3));
                    dVarC3.e(Integer.valueOf(iA3), function2C3);
                } else {
                    dVarC3.L(Integer.valueOf(iA3));
                    dVarC3.e(Integer.valueOf(iA3), function2C3);
                }
                dud.i(dVarC3, bVarE111, companion110.e());
                ps4Var2.invoke(iraVar7, dVarF, Integer.valueOf(((i117 >> 6) & 112) | 6));
                dVarF.m();
                dVarF.m();
                SwipeToDismissBoxValue swipeToDismissBoxValueH7 = s1Var.h();
                boolean zT8 = dVarF.T(s1Var);
                if ((3670016 & i3) == 1048576) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                z18 = zT8 | z17;
                objR2 = dVarF.R();
                if (z18) {
                    objR2 = new C0203SwipeToDismissBoxKt$SwipeToDismissBox$3$1(s1Var, function3, null);
                    dVarF.L(objR2);
                } else {
                    objR2 = new C0203SwipeToDismissBoxKt$SwipeToDismissBox$3$1(s1Var, function3, null);
                    dVarF.L(objR2);
                }
                vn3.f(swipeToDismissBoxValueH7, function3, (Function2) objR2, dVarF, (i3 >> 15) & 112);
                if (e.k()) {
                    e.n();
                }
                z9 = z11;
                function2 = function3;
                bVar3 = bVar4;
                z8 = z115;
                z7 = z10;
            } else {
                dVarF.q();
                bVar3 = bVar2;
                z7 = z4;
                z8 = z5;
                z9 = z2;
            }
            s6bVarH = dVarF.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.mhc
                    public final Object invoke(Object obj, Object obj2) {
                        return SwipeToDismissBoxKt.j(s1Var, ps4Var, bVar3, z7, z9, z8, function2, ps4Var2, i, i2, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i3 |= 24576;
        i8 = i2 & 32;
        if (i8 != 0) {
            i3 |= 196608;
            z5 = z3;
        } else {
            z5 = z3;
            if ((i & 196608) == 0) {
                if (dVarF.A(z5)) {
                    i9 = 131072;
                } else {
                    i9 = 65536;
                }
                i3 |= i9;
            }
        }
        i10 = i2 & 64;
        if (i10 != 0) {
            i3 |= 1572864;
            function2 = function1;
        } else {
            function2 = function1;
            if ((i & 1572864) == 0) {
                if (dVarF.T(function2)) {
                    i11 = 1048576;
                } else {
                    i11 = 524288;
                }
                i3 |= i11;
            }
        }
        if ((i2 & 128) != 0) {
            i3 |= 12582912;
        } else if ((i & 12582912) == 0) {
            if (dVarF.T(ps4Var2)) {
                i12 = 8388608;
            } else {
                i12 = 4194304;
            }
            i3 |= i12;
        }
        if ((4793491 & i3) != 4793490) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (dVarF.g(z6, i3 & 1)) {
            if (i13 != 0) {
                bVar4 = b.INSTANCE;
            } else {
                bVar4 = bVar2;
            }
            if (i4 != 0) {
                z10 = true;
            } else {
                z10 = z4;
            }
            if (i6 != 0) {
                z11 = true;
            } else {
                z11 = z2;
            }
            if (i8 != 0) {
                z12 = true;
            } else {
                z12 = z5;
            }
            if (i10 != 0) {
                objR3 = dVarF.R();
                if (objR3 == d.INSTANCE.a()) {
                    objR3 = new Function1() { // from class: com.google.android.khc
                        public final Object invoke(Object obj) {
                            return SwipeToDismissBoxKt.k((SwipeToDismissBoxValue) obj);
                        }
                    };
                    dVarF.L(objR3);
                }
                function3 = (Function1) objR3;
            } else {
                function3 = function2;
            }
            if (e.k()) {
                e.o(-741495334, i3, -1, "androidx.compose.material3.SwipeToDismissBox (SwipeToDismissBox.kt:313)");
            }
            AnchoredDraggableState<SwipeToDismissBoxValue> anchoredDraggableStateC15 = s1Var.c();
            Orientation orientation8 = Orientation.Horizontal;
            if (z12) {
                z13 = false;
            } else {
                z13 = false;
            }
            if (s1Var.j()) {
                dVarF.y(387581105);
                z14 = true;
                omc omcVarC8 = tg.a.c(s1Var.c(), s1Var.g(), null, dVarF, tg.e << 9, 4);
                dVarF.u();
                omcVar = omcVarC8;
            } else {
                z14 = true;
                dVarF.y(-869685853);
                dVarF.u();
                omcVar = null;
            }
            b bVarR8 = AnchoredDraggableKt.r(bVar4, anchoredDraggableStateC15, orientation8, z13, null, null, omcVar, 24, null);
            tc.Companion companion112 = tc.INSTANCE;
            ej7 ej7VarI8 = j.i(companion112.o(), z14);
            iA = pp1.a(dVarF, 0);
            gs1 gs1VarJ112 = dVarF.j();
            b bVarE112 = ComposedModifierKt.e(dVarF, bVarR8);
            ComposeUiNode.Companion companion113 = ComposeUiNode.INSTANCE;
            boolean z116 = z12;
            function0B = companion113.b();
            if (dVarF.G() == null) {
                pp1.d();
            }
            dVarF.o();
            if (dVarF.getInserting()) {
                dVarF.W(function0B);
            } else {
                dVarF.k();
            }
            dVarC = dud.c(dVarF);
            dud.i(dVarC, ej7VarI8, companion113.d());
            dud.i(dVarC, gs1VarJ112, companion113.f());
            function2C = companion113.c();
            if (dVarC.getInserting()) {
                dVarC.L(Integer.valueOf(iA));
                dVarC.e(Integer.valueOf(iA), function2C);
            } else {
                dVarC.L(Integer.valueOf(iA));
                dVarC.e(Integer.valueOf(iA), function2C);
            }
            dud.i(dVarC, bVarE112, companion113.e());
            BoxScopeInstance boxScopeInstance8 = BoxScopeInstance.a;
            b.Companion companion114 = b.INSTANCE;
            b bVarJ8 = boxScopeInstance8.j(companion114);
            int i118 = (i3 << 6) & 7168;
            c cVar8 = c.a;
            ej7 ej7VarB15 = t0.b(cVar8.j(), companion112.l(), dVarF, 0);
            iA2 = pp1.a(dVarF, 0);
            gs1 gs1VarJ113 = dVarF.j();
            b bVarE113 = ComposedModifierKt.e(dVarF, bVarJ8);
            function0B2 = companion113.b();
            if (dVarF.G() == null) {
                pp1.d();
            }
            dVarF.o();
            if (dVarF.getInserting()) {
                dVarF.W(function0B2);
            } else {
                dVarF.k();
            }
            dVarC2 = dud.c(dVarF);
            dud.i(dVarC2, ej7VarB15, companion113.d());
            dud.i(dVarC2, gs1VarJ113, companion113.f());
            function2C2 = companion113.c();
            if (dVarC2.getInserting()) {
                dVarC2.L(Integer.valueOf(iA2));
                dVarC2.e(Integer.valueOf(iA2), function2C2);
            } else {
                dVarC2.L(Integer.valueOf(iA2));
                dVarC2.e(Integer.valueOf(iA2), function2C2);
            }
            dud.i(dVarC2, bVarE113, companion113.e());
            ira iraVar8 = ira.a;
            ps4Var.invoke(iraVar8, dVarF, Integer.valueOf(((i118 >> 6) & 112) | 6));
            dVarF.m();
            AnchoredDraggableState<SwipeToDismissBoxValue> anchoredDraggableStateC16 = s1Var.c();
            if ((i3 & 7168) == 2048) {
                z15 = true;
            } else {
                z15 = false;
            }
            if ((57344 & i3) == 16384) {
                z16 = true;
            } else {
                z16 = false;
            }
            zT = z16 | z15 | dVarF.T(s1Var);
            objR = dVarF.R();
            if (zT) {
                objR = new Function2() { // from class: com.google.android.lhc
                    public final Object invoke(Object obj, Object obj2) {
                        return SwipeToDismissBoxKt.h(s1Var, z10, z11, (q16) obj, (kx1) obj2);
                    }
                };
                dVarF.L(objR);
            } else {
                objR = new Function2() { // from class: com.google.android.lhc
                    public final Object invoke(Object obj, Object obj2) {
                        return SwipeToDismissBoxKt.h(s1Var, z10, z11, (q16) obj, (kx1) obj2);
                    }
                };
                dVarF.L(objR);
            }
            b bVarA8 = hg3.a(companion114, anchoredDraggableStateC16, orientation8, (Function2) objR);
            int i119 = (i3 >> 12) & 7168;
            ej7 ej7VarB16 = t0.b(cVar8.j(), companion112.l(), dVarF, 0);
            iA3 = pp1.a(dVarF, 0);
            gs1 gs1VarJ114 = dVarF.j();
            b bVarE114 = ComposedModifierKt.e(dVarF, bVarA8);
            function0B3 = companion113.b();
            if (dVarF.G() == null) {
                pp1.d();
            }
            dVarF.o();
            if (dVarF.getInserting()) {
                dVarF.W(function0B3);
            } else {
                dVarF.k();
            }
            dVarC3 = dud.c(dVarF);
            dud.i(dVarC3, ej7VarB16, companion113.d());
            dud.i(dVarC3, gs1VarJ114, companion113.f());
            function2C3 = companion113.c();
            if (dVarC3.getInserting()) {
                dVarC3.L(Integer.valueOf(iA3));
                dVarC3.e(Integer.valueOf(iA3), function2C3);
            } else {
                dVarC3.L(Integer.valueOf(iA3));
                dVarC3.e(Integer.valueOf(iA3), function2C3);
            }
            dud.i(dVarC3, bVarE114, companion113.e());
            ps4Var2.invoke(iraVar8, dVarF, Integer.valueOf(((i119 >> 6) & 112) | 6));
            dVarF.m();
            dVarF.m();
            SwipeToDismissBoxValue swipeToDismissBoxValueH8 = s1Var.h();
            boolean zT9 = dVarF.T(s1Var);
            if ((3670016 & i3) == 1048576) {
                z17 = true;
            } else {
                z17 = false;
            }
            z18 = zT9 | z17;
            objR2 = dVarF.R();
            if (z18) {
                objR2 = new C0203SwipeToDismissBoxKt$SwipeToDismissBox$3$1(s1Var, function3, null);
                dVarF.L(objR2);
            } else {
                objR2 = new C0203SwipeToDismissBoxKt$SwipeToDismissBox$3$1(s1Var, function3, null);
                dVarF.L(objR2);
            }
            vn3.f(swipeToDismissBoxValueH8, function3, (Function2) objR2, dVarF, (i3 >> 15) & 112);
            if (e.k()) {
                e.n();
            }
            z9 = z11;
            function2 = function3;
            bVar3 = bVar4;
            z8 = z116;
            z7 = z10;
        } else {
            dVarF.q();
            bVar3 = bVar2;
            z7 = z4;
            z8 = z5;
            z9 = z2;
        }
        s6bVarH = dVarF.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2() { // from class: com.google.android.mhc
                public final Object invoke(Object obj, Object obj2) {
                    return SwipeToDismissBoxKt.j(s1Var, ps4Var, bVar3, z7, z9, z8, function2, ps4Var2, i, i2, (d) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pair h(s1 s1Var, final boolean z, final boolean z2, final q16 q16Var, kx1 kx1Var) {
        return qjd.a(AnchoredDraggableKt.h(new Function1() { // from class: com.google.android.nhc
            public final Object invoke(Object obj) {
                return SwipeToDismissBoxKt.i(q16Var, z, z2, (fg3) obj);
            }
        }), s1Var.i());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(q16 q16Var, boolean z, boolean z2, fg3 fg3Var) {
        float packedValue = (int) (q16Var.getPackedValue() >> 32);
        fg3Var.a(SwipeToDismissBoxValue.Settled, 0.0f);
        if (z) {
            fg3Var.a(SwipeToDismissBoxValue.StartToEnd, packedValue);
        }
        if (z2) {
            fg3Var.a(SwipeToDismissBoxValue.EndToStart, -packedValue);
        }
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(s1 s1Var, ps4 ps4Var, b bVar, boolean z, boolean z2, boolean z3, Function1 function1, ps4 ps4Var2, int i, int i2, d dVar, int i3) {
        g(s1Var, ps4Var, bVar, z, z2, z3, function1, ps4Var2, dVar, saa.a(i | 1), i2);
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(SwipeToDismissBoxValue swipeToDismissBoxValue) {
        return Unit.a;
    }

    @r43
    public static final s1 m(final SwipeToDismissBoxValue swipeToDismissBoxValue, final Function1<? super SwipeToDismissBoxValue, Boolean> function1, final Function1<? super Float, Float> function2, d dVar, int i, int i2) {
        if ((i2 & 1) != 0) {
            swipeToDismissBoxValue = SwipeToDismissBoxValue.Settled;
        }
        if ((i2 & 2) != 0) {
            Object objR = dVar.R();
            if (objR == d.INSTANCE.a()) {
                objR = new Function1() { // from class: com.google.android.ihc
                    public final Object invoke(Object obj) {
                        return Boolean.valueOf(SwipeToDismissBoxKt.n((SwipeToDismissBoxValue) obj));
                    }
                };
                dVar.L(objR);
            }
            function1 = (Function1) objR;
        }
        if ((i2 & 4) != 0) {
            function2 = hhc.a.c(dVar, 6);
        }
        if (e.k()) {
            e.o(-246335487, i, -1, "androidx.compose.material3.rememberSwipeToDismissBoxState (SwipeToDismissBox.kt:273)");
        }
        final f43 f43Var = (f43) dVar.v(CompositionLocalsKt.g());
        Object[] objArr = new Object[0];
        k0b<s1, SwipeToDismissBoxValue> k0bVarC = s1.INSTANCE.c(function1, function2, f43Var);
        boolean z = true;
        boolean zX = (((6 ^ (i & 14)) > 4 && dVar.C(swipeToDismissBoxValue.ordinal())) || (i & 6) == 4) | dVar.x(f43Var) | ((((i & 112) ^ 48) > 32 && dVar.x(function1)) || (i & 48) == 32);
        if ((((i & 896) ^ 384) <= 256 || !dVar.x(function2)) && (i & 384) != 256) {
            z = false;
        }
        boolean z2 = zX | z;
        Object objR2 = dVar.R();
        if (z2 || objR2 == d.INSTANCE.a()) {
            objR2 = new Function0() { // from class: com.google.android.jhc
                public final Object invoke() {
                    return SwipeToDismissBoxKt.o(swipeToDismissBoxValue, f43Var, function1, function2);
                }
            };
            dVar.L(objR2);
        }
        s1 s1Var = (s1) dfa.k(objArr, k0bVarC, (Function0) objR2, dVar, 0);
        if (e.k()) {
            e.n();
        }
        return s1Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean n(SwipeToDismissBoxValue swipeToDismissBoxValue) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final s1 o(SwipeToDismissBoxValue swipeToDismissBoxValue, f43 f43Var, Function1 function1, Function1 function2) {
        return new s1(swipeToDismissBoxValue, f43Var, function1, function2);
    }
}
