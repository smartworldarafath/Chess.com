package androidx.compose.p002material3.p003internal;

import android.view.KeyEvent;
import androidx.compose.p001foundation.MutatePriority;
import androidx.compose.p001foundation.gestures.ForEachGestureKt;
import androidx.compose.p001foundation.gestures.TapGestureDetectorKt;
import androidx.compose.p001foundation.layout.BoxScopeInstance;
import androidx.compose.p001foundation.layout.j;
import androidx.compose.p002material3.p003internal.BasicTooltipKt;
import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import androidx.compose.p004runtime.s0;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.window.AndroidPopup_androidKt;
import com.google.android.lq2;
import com.google.android.p58;
import com.google.android.q22;
import com.google.android.rw0;
import com.google.android.ta2;
import com.google.inputmethod.afb;
import com.google.inputmethod.aj0;
import com.google.inputmethod.b7;
import com.google.inputmethod.cad;
import com.google.inputmethod.cc0;
import com.google.inputmethod.ck4;
import com.google.inputmethod.d57;
import com.google.inputmethod.df9;
import com.google.inputmethod.dl4;
import com.google.inputmethod.dud;
import com.google.inputmethod.ej7;
import com.google.inputmethod.gs1;
import com.google.inputmethod.ii6;
import com.google.inputmethod.jd3;
import com.google.inputmethod.kd3;
import com.google.inputmethod.ko1;
import com.google.inputmethod.nfb;
import com.google.inputmethod.o58;
import com.google.inputmethod.oi6;
import com.google.inputmethod.pp1;
import com.google.inputmethod.q6c;
import com.google.inputmethod.rg9;
import com.google.inputmethod.ri6;
import com.google.inputmethod.s6b;
import com.google.inputmethod.saa;
import com.google.inputmethod.sg9;
import com.google.inputmethod.si6;
import com.google.inputmethod.tc;
import com.google.inputmethod.ugc;
import com.google.inputmethod.va1;
import com.google.inputmethod.vn3;
import com.google.inputmethod.wi6;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u001au\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u001aM\u0010\u0013\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\u00112\u0006\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\b\u001a\u00020\u00072\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0003¢\u0006\u0004\b\u0013\u0010\u0014\u001a[\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\u00112\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0003¢\u0006\u0004\b\u0017\u0010\u0018\u001a#\u0010\u001a\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001a\u0010\u001b\u001a3\u0010\u001e\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001e\u0010\u001f\u001aA\u0010 \u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\r\u001a\u00020\n2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\u0011H\u0002¢\u0006\u0004\b \u0010!\u001a\u0015\u0010#\u001a\b\u0012\u0004\u0012\u00020\n0\"H\u0003¢\u0006\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lcom/google/android/rg9;", "positionProvider", "Lkotlin/Function0;", "", "tooltip", "Lcom/google/android/cad;", "state", "Landroidx/compose/ui/b;", "modifier", "onDismissRequest", "", "focusable", "enableUserInput", "hasAction", "content", "i", "(Lcom/google/android/rg9;Lkotlin/jvm/functions/Function2;Lcom/google/android/cad;Landroidx/compose/ui/b;Lkotlin/jvm/functions/Function0;ZZZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/d;II)V", "Lcom/google/android/o58;", "forceKeyboardFocusable", "o", "(ZLcom/google/android/cad;Lcom/google/android/o58;ZLandroidx/compose/ui/b;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/d;II)V", "Lcom/google/android/ta2;", "scope", "l", "(Lcom/google/android/rg9;Lcom/google/android/cad;Lkotlin/jvm/functions/Function0;Lcom/google/android/ta2;ZLcom/google/android/o58;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/d;I)V", "enabled", "t", "(Landroidx/compose/ui/b;ZLcom/google/android/cad;)Landroidx/compose/ui/b;", "", "label", "q", "(Landroidx/compose/ui/b;Ljava/lang/String;ZLcom/google/android/cad;Lcom/google/android/ta2;)Landroidx/compose/ui/b;", "u", "(Landroidx/compose/ui/b;ZLcom/google/android/cad;Lcom/google/android/ta2;ZLcom/google/android/o58;)Landroidx/compose/ui/b;", "Lcom/google/android/q6c;", "w", "(Landroidx/compose/runtime/d;I)Lcom/google/android/q6c;", "material3"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class BasicTooltipKt {

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/compose/material3/internal/BasicTooltipKt$a", "Lcom/google/android/jd3;", "", "dispose", "()V", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a implements jd3 {
        final /* synthetic */ cad a;

        public a(cad cadVar) {
            this.a = cadVar;
        }

        @Override // com.google.inputmethod.jd3
        public void dispose() {
            this.a.b();
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class b implements Function2<d, Integer, Unit> {
        final /* synthetic */ String a;
        final /* synthetic */ Function2<d, Integer, Unit> b;

        /* JADX WARN: Multi-variable type inference failed */
        b(String str, Function2<? super d, ? super Integer, Unit> function2) {
            this.a = str;
            this.b = function2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(String str, nfb nfbVar) {
            SemanticsPropertiesKt.k0(nfbVar, d57.INSTANCE.a());
            SemanticsPropertiesKt.l0(nfbVar, str);
            return Unit.a;
        }

        public final void b(d dVar, int i) {
            if (!dVar.g((i & 3) != 2, i & 1)) {
                dVar.q();
                return;
            }
            if (e.k()) {
                e.o(-1287705660, i, -1, "androidx.compose.material3.internal.TooltipPopup.<anonymous> (BasicTooltip.kt:186)");
            }
            androidx.compose.ui.b.Companion companion = androidx.compose.ui.b.INSTANCE;
            boolean zX = dVar.x(this.a);
            final String str = this.a;
            Object objR = dVar.R();
            if (zX || objR == d.INSTANCE.a()) {
                objR = new Function1() { // from class: androidx.compose.material3.internal.d
                    public final Object invoke(Object obj) {
                        return BasicTooltipKt.b.c(str, (nfb) obj);
                    }
                };
                dVar.L(objR);
            }
            androidx.compose.ui.b bVarD = afb.d(companion, false, (Function1) objR, 1, null);
            Function2<d, Integer, Unit> function2 = this.b;
            ej7 ej7VarI = j.i(tc.INSTANCE.o(), false);
            int iA = pp1.a(dVar, 0);
            gs1 gs1VarJ = dVar.j();
            androidx.compose.ui.b bVarE = ComposedModifierKt.e(dVar, bVarD);
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
    static final class c implements Function1<oi6, Boolean> {
        final /* synthetic */ cad a;
        final /* synthetic */ o58<Boolean> b;
        final /* synthetic */ boolean c;

        c(cad cadVar, o58<Boolean> o58Var, boolean z) {
            this.a = cadVar;
            this.b = o58Var;
            this.c = z;
        }

        public final Boolean a(KeyEvent keyEvent) {
            if (!this.a.isVisible()) {
                this.b.setValue(Boolean.FALSE);
            }
            if (!this.c || !ri6.e(si6.b(keyEvent), ri6.INSTANCE.a()) || !ii6.T(si6.a(keyEvent), ii6.INSTANCE.L()) || !this.a.isVisible()) {
                return Boolean.FALSE;
            }
            o58<Boolean> o58Var = this.b;
            Boolean bool = Boolean.TRUE;
            o58Var.setValue(bool);
            return bool;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((oi6) obj).getNativeKeyEvent());
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0126  */
    /* JADX WARN: Code duplicated, block: B:103:0x0129  */
    /* JADX WARN: Code duplicated, block: B:106:0x0132 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:107:0x0134  */
    /* JADX WARN: Code duplicated, block: B:108:0x0139  */
    /* JADX WARN: Code duplicated, block: B:111:0x013e  */
    /* JADX WARN: Code duplicated, block: B:112:0x0140  */
    /* JADX WARN: Code duplicated, block: B:114:0x0143  */
    /* JADX WARN: Code duplicated, block: B:116:0x0146  */
    /* JADX WARN: Code duplicated, block: B:117:0x0149  */
    /* JADX WARN: Code duplicated, block: B:119:0x014d  */
    /* JADX WARN: Code duplicated, block: B:120:0x014f  */
    /* JADX WARN: Code duplicated, block: B:123:0x0157  */
    /* JADX WARN: Code duplicated, block: B:126:0x016c  */
    /* JADX WARN: Code duplicated, block: B:129:0x0182  */
    /* JADX WARN: Code duplicated, block: B:132:0x0190  */
    /* JADX WARN: Code duplicated, block: B:137:0x01af  */
    /* JADX WARN: Code duplicated, block: B:140:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:143:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:144:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:147:0x0207  */
    /* JADX WARN: Code duplicated, block: B:149:0x0215  */
    /* JADX WARN: Code duplicated, block: B:152:0x0232  */
    /* JADX WARN: Code duplicated, block: B:154:0x023a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:157:0x0240  */
    /* JADX WARN: Code duplicated, block: B:159:0x026b  */
    /* JADX WARN: Code duplicated, block: B:162:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:170:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:172:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:175:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:178:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:181:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:183:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004c  */
    /* JADX WARN: Code duplicated, block: B:27:0x004f  */
    /* JADX WARN: Code duplicated, block: B:29:0x0053  */
    /* JADX WARN: Code duplicated, block: B:31:0x0057  */
    /* JADX WARN: Code duplicated, block: B:32:0x005c  */
    /* JADX WARN: Code duplicated, block: B:34:0x0062  */
    /* JADX WARN: Code duplicated, block: B:35:0x0065  */
    /* JADX WARN: Code duplicated, block: B:39:0x006c  */
    /* JADX WARN: Code duplicated, block: B:41:0x0071  */
    /* JADX WARN: Code duplicated, block: B:43:0x0075  */
    /* JADX WARN: Code duplicated, block: B:45:0x007d  */
    /* JADX WARN: Code duplicated, block: B:46:0x0080  */
    /* JADX WARN: Code duplicated, block: B:50:0x0087  */
    /* JADX WARN: Code duplicated, block: B:52:0x008c  */
    /* JADX WARN: Code duplicated, block: B:54:0x0090  */
    /* JADX WARN: Code duplicated, block: B:56:0x0098  */
    /* JADX WARN: Code duplicated, block: B:57:0x009b  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:62:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:67:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:72:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:84:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:91:0x0101  */
    /* JADX WARN: Code duplicated, block: B:93:0x0106  */
    /* JADX WARN: Code duplicated, block: B:95:0x010a  */
    /* JADX WARN: Code duplicated, block: B:97:0x0112  */
    /* JADX WARN: Code duplicated, block: B:98:0x0115  */
    public static final void i(final rg9 rg9Var, final Function2<? super d, ? super Integer, Unit> function2, cad cadVar, androidx.compose.ui.b bVar, Function0<Unit> function0, boolean z, boolean z2, boolean z3, final Function2<? super d, ? super Integer, Unit> function3, d dVar, final int i, final int i2) {
        int i3;
        Function2<? super d, ? super Integer, Unit> function4;
        boolean zT;
        int i4;
        int i5;
        androidx.compose.ui.b bVar2;
        int i6;
        int i7;
        Function0<Unit> function1;
        int i8;
        int i9;
        int i10;
        boolean z4;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        boolean z5;
        boolean z6;
        final cad cadVar2;
        final boolean z7;
        final androidx.compose.ui.b bVar3;
        final Function0<Unit> function5;
        final boolean z8;
        final boolean z9;
        s6b s6bVarH;
        androidx.compose.ui.b bVar4;
        Function0<Unit> function6;
        boolean z10;
        boolean z11;
        Object objR;
        d.Companion companion;
        ta2 ta2Var;
        Object objR2;
        o58 o58Var;
        boolean z12;
        int iA;
        Function0<ComposeUiNode> function0B;
        d dVarC;
        Function2<ComposeUiNode, Integer, Unit> function2C;
        o58 o58Var2;
        Object objR3;
        boolean z13;
        d dVarF = dVar.F(-1221877520);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (dVarF.x(rg9Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) == 0) {
            if ((i & 48) == 0) {
                function4 = function2;
                i3 |= dVarF.T(function4) ? 32 : 16;
            }
            if ((i2 & 4) != 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                if ((i & 512) == 0) {
                    zT = dVarF.x(cadVar);
                } else {
                    zT = dVarF.T(cadVar);
                }
                if (zT) {
                    i4 = 256;
                } else {
                    i4 = 128;
                }
                i3 |= i4;
            }
            i5 = i2 & 8;
            if (i5 != 0) {
                if ((i & 3072) == 0) {
                    bVar2 = bVar;
                    if (dVarF.x(bVar2)) {
                        i6 = 2048;
                    } else {
                        i6 = 1024;
                    }
                    i3 |= i6;
                }
                i7 = i2 & 16;
                if (i7 != 0) {
                    if ((i & 24576) == 0) {
                        function1 = function0;
                        if (dVarF.T(function1)) {
                            i8 = 16384;
                        } else {
                            i8 = 8192;
                        }
                        i3 |= i8;
                    }
                    i9 = i2 & 32;
                    if (i9 != 0) {
                        i3 |= 196608;
                        i10 = 196608;
                        z4 = z;
                    } else {
                        i10 = 196608;
                        z4 = z;
                        if ((i & 196608) == 0) {
                            if (dVarF.A(z4)) {
                                i11 = 131072;
                            } else {
                                i11 = 65536;
                            }
                            i3 |= i11;
                        }
                    }
                    i12 = i2 & 64;
                    if (i12 != 0) {
                        i3 |= 1572864;
                    } else if ((i & 1572864) == 0) {
                        if (dVarF.A(z2)) {
                            i13 = 1048576;
                        } else {
                            i13 = 524288;
                        }
                        i3 |= i13;
                    }
                    i14 = i2 & 128;
                    if (i14 != 0) {
                        i3 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        if (dVarF.A(z3)) {
                            i15 = 8388608;
                        } else {
                            i15 = 4194304;
                        }
                        i3 |= i15;
                    }
                    if ((i2 & 256) != 0) {
                        if ((i & 100663296) == 0) {
                            if (dVarF.T(function3)) {
                                i16 = 67108864;
                            } else {
                                i16 = 33554432;
                            }
                            i3 |= i16;
                        }
                        z5 = true;
                        if ((i3 & 38347923) != 38347922) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        if (dVarF.g(z6, i3 & 1)) {
                            if (i5 != 0) {
                                bVar4 = androidx.compose.ui.b.INSTANCE;
                            } else {
                                bVar4 = bVar2;
                            }
                            if (i7 != 0) {
                                function6 = null;
                            } else {
                                function6 = function1;
                            }
                            if (i9 != 0) {
                                z4 = false;
                            }
                            if (i12 != 0) {
                                z10 = true;
                            } else {
                                z10 = z2;
                            }
                            if (i14 != 0) {
                                z11 = false;
                            } else {
                                z11 = z3;
                            }
                            if (e.k()) {
                                e.o(-1221877520, i3, -1, "androidx.compose.material3.internal.BasicTooltipBox (BasicTooltip.kt:103)");
                            }
                            objR = dVarF.R();
                            companion = d.INSTANCE;
                            if (objR == companion.a()) {
                                objR = vn3.k(EmptyCoroutineContext.a, dVarF);
                                dVarF.L(objR);
                            }
                            ta2Var = (ta2) objR;
                            objR2 = dVarF.R();
                            if (objR2 == companion.a()) {
                                objR2 = s0.e(Boolean.FALSE, null, 2, null);
                                dVarF.L(objR2);
                            }
                            o58Var = (o58) objR2;
                            if (z11 || !(w(dVarF, 0).getValue().booleanValue() || ((Boolean) o58Var.getValue()).booleanValue())) {
                                z12 = false;
                            } else {
                                z12 = true;
                            }
                            androidx.compose.ui.b.Companion companion2 = androidx.compose.ui.b.INSTANCE;
                            ej7 ej7VarI = j.i(tc.INSTANCE.o(), false);
                            iA = pp1.a(dVarF, 0);
                            gs1 gs1VarJ = dVarF.j();
                            androidx.compose.ui.b bVarE = ComposedModifierKt.e(dVarF, companion2);
                            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                            boolean z14 = z12;
                            function0B = companion3.b();
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
                            dud.i(dVarC, ej7VarI, companion3.d());
                            dud.i(dVarC, gs1VarJ, companion3.f());
                            function2C = companion3.c();
                            if (dVarC.getInserting() || !Intrinsics.e(dVarC.R(), Integer.valueOf(iA))) {
                                dVarC.L(Integer.valueOf(iA));
                                dVarC.e(Integer.valueOf(iA), function2C);
                            }
                            dud.i(dVarC, bVarE, companion3.e());
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.a;
                            if (cadVar.isVisible()) {
                                dVarF.y(-1891243071);
                                if (!z4 || z14) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                Function2<? super d, ? super Integer, Unit> function7 = function4;
                                o58Var2 = o58Var;
                                l(rg9Var, cadVar, function6, ta2Var, z13, o58Var2, function7, dVarF, (i3 & 14) | i10 | ((i3 >> 3) & 112) | ((i3 >> 6) & 896) | ((i3 << 15) & 3670016));
                                dVarF = dVarF;
                                dVarF.u();
                            } else {
                                o58Var2 = o58Var;
                                dVarF.y(-1890863476);
                                dVarF.u();
                            }
                            int i17 = ((i3 >> 18) & 14) | 384 | ((i3 >> 3) & 112) | ((i3 >> 12) & 7168) | (57344 & (i3 << 3)) | ((i3 >> 9) & 458752);
                            cadVar2 = cadVar;
                            boolean z15 = z10;
                            boolean z16 = z11;
                            bVar3 = bVar4;
                            o(z15, cadVar2, o58Var2, z16, bVar3, function3, dVarF, i17, 0);
                            dVarF.m();
                            if ((i3 & 896) != 256 && ((i3 & 512) == 0 || !dVarF.T(cadVar2))) {
                                z5 = false;
                            }
                            objR3 = dVarF.R();
                            if (z5 || objR3 == companion.a()) {
                                objR3 = new Function1() { // from class: com.google.android.si0
                                    public final Object invoke(Object obj) {
                                        return BasicTooltipKt.j(cadVar2, (kd3) obj);
                                    }
                                };
                                dVarF.L(objR3);
                            }
                            vn3.c(cadVar2, (Function1) objR3, dVarF, (i3 >> 6) & 14);
                            if (e.k()) {
                                e.n();
                            }
                            z7 = z15;
                            z8 = z16;
                            function5 = function6;
                        } else {
                            cadVar2 = cadVar;
                            dVarF.q();
                            z7 = z2;
                            bVar3 = bVar2;
                            function5 = function1;
                            z8 = z3;
                        }
                        d dVar2 = dVarF;
                        z9 = z4;
                        s6bVarH = dVar2.H();
                        if (s6bVarH != null) {
                            final cad cadVar3 = cadVar2;
                            s6bVarH.a(new Function2() { // from class: com.google.android.ti0
                                public final Object invoke(Object obj, Object obj2) {
                                    return BasicTooltipKt.k(rg9Var, function2, cadVar3, bVar3, function5, z9, z7, z8, function3, i, i2, (d) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i3 |= 100663296;
                    z5 = true;
                    if ((i3 & 38347923) != 38347922) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (dVarF.g(z6, i3 & 1)) {
                        if (i5 != 0) {
                            bVar4 = androidx.compose.ui.b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        if (i7 != 0) {
                            function6 = null;
                        } else {
                            function6 = function1;
                        }
                        if (i9 != 0) {
                            z4 = false;
                        }
                        if (i12 != 0) {
                            z10 = true;
                        } else {
                            z10 = z2;
                        }
                        if (i14 != 0) {
                            z11 = false;
                        } else {
                            z11 = z3;
                        }
                        if (e.k()) {
                            e.o(-1221877520, i3, -1, "androidx.compose.material3.internal.BasicTooltipBox (BasicTooltip.kt:103)");
                        }
                        objR = dVarF.R();
                        companion = d.INSTANCE;
                        if (objR == companion.a()) {
                            objR = vn3.k(EmptyCoroutineContext.a, dVarF);
                            dVarF.L(objR);
                        }
                        ta2Var = (ta2) objR;
                        objR2 = dVarF.R();
                        if (objR2 == companion.a()) {
                            objR2 = s0.e(Boolean.FALSE, null, 2, null);
                            dVarF.L(objR2);
                        }
                        o58Var = (o58) objR2;
                        if (z11) {
                            z12 = false;
                        } else {
                            z12 = false;
                        }
                        androidx.compose.ui.b.Companion companion4 = androidx.compose.ui.b.INSTANCE;
                        ej7 ej7VarI2 = j.i(tc.INSTANCE.o(), false);
                        iA = pp1.a(dVarF, 0);
                        gs1 gs1VarJ2 = dVarF.j();
                        androidx.compose.ui.b bVarE2 = ComposedModifierKt.e(dVarF, companion4);
                        ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                        boolean z17 = z12;
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
                        dud.i(dVarC, gs1VarJ2, companion5.f());
                        function2C = companion5.c();
                        if (dVarC.getInserting()) {
                            dVarC.L(Integer.valueOf(iA));
                            dVarC.e(Integer.valueOf(iA), function2C);
                        } else {
                            dVarC.L(Integer.valueOf(iA));
                            dVarC.e(Integer.valueOf(iA), function2C);
                        }
                        dud.i(dVarC, bVarE2, companion5.e());
                        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.a;
                        if (cadVar.isVisible()) {
                            dVarF.y(-1891243071);
                            if (z4) {
                                z13 = true;
                            } else {
                                z13 = true;
                            }
                            Function2<? super d, ? super Integer, Unit> function8 = function4;
                            o58Var2 = o58Var;
                            l(rg9Var, cadVar, function6, ta2Var, z13, o58Var2, function8, dVarF, (i3 & 14) | i10 | ((i3 >> 3) & 112) | ((i3 >> 6) & 896) | ((i3 << 15) & 3670016));
                            dVarF = dVarF;
                            dVarF.u();
                        } else {
                            o58Var2 = o58Var;
                            dVarF.y(-1890863476);
                            dVarF.u();
                        }
                        int i18 = ((i3 >> 18) & 14) | 384 | ((i3 >> 3) & 112) | ((i3 >> 12) & 7168) | (57344 & (i3 << 3)) | ((i3 >> 9) & 458752);
                        cadVar2 = cadVar;
                        boolean z18 = z10;
                        boolean z19 = z11;
                        bVar3 = bVar4;
                        o(z18, cadVar2, o58Var2, z19, bVar3, function3, dVarF, i18, 0);
                        dVarF.m();
                        if ((i3 & 896) != 256) {
                            z5 = false;
                        }
                        objR3 = dVarF.R();
                        if (z5) {
                            objR3 = new Function1() { // from class: com.google.android.si0
                                public final Object invoke(Object obj) {
                                    return BasicTooltipKt.j(cadVar2, (kd3) obj);
                                }
                            };
                            dVarF.L(objR3);
                        } else {
                            objR3 = new Function1() { // from class: com.google.android.si0
                                public final Object invoke(Object obj) {
                                    return BasicTooltipKt.j(cadVar2, (kd3) obj);
                                }
                            };
                            dVarF.L(objR3);
                        }
                        vn3.c(cadVar2, (Function1) objR3, dVarF, (i3 >> 6) & 14);
                        if (e.k()) {
                            e.n();
                        }
                        z7 = z18;
                        z8 = z19;
                        function5 = function6;
                    } else {
                        cadVar2 = cadVar;
                        dVarF.q();
                        z7 = z2;
                        bVar3 = bVar2;
                        function5 = function1;
                        z8 = z3;
                    }
                    d dVar3 = dVarF;
                    z9 = z4;
                    s6bVarH = dVar3.H();
                    if (s6bVarH != null) {
                        final cad cadVar4 = cadVar2;
                        s6bVarH.a(new Function2() { // from class: com.google.android.ti0
                            public final Object invoke(Object obj, Object obj2) {
                                return BasicTooltipKt.k(rg9Var, function2, cadVar4, bVar3, function5, z9, z7, z8, function3, i, i2, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i3 |= 24576;
                function1 = function0;
                i9 = i2 & 32;
                if (i9 != 0) {
                    i3 |= 196608;
                    i10 = 196608;
                    z4 = z;
                } else {
                    i10 = 196608;
                    z4 = z;
                    if ((i & 196608) == 0) {
                        if (dVarF.A(z4)) {
                            i11 = 131072;
                        } else {
                            i11 = 65536;
                        }
                        i3 |= i11;
                    }
                }
                i12 = i2 & 64;
                if (i12 != 0) {
                    i3 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    if (dVarF.A(z2)) {
                        i13 = 1048576;
                    } else {
                        i13 = 524288;
                    }
                    i3 |= i13;
                }
                i14 = i2 & 128;
                if (i14 != 0) {
                    i3 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    if (dVarF.A(z3)) {
                        i15 = 8388608;
                    } else {
                        i15 = 4194304;
                    }
                    i3 |= i15;
                }
                if ((i2 & 256) != 0) {
                    if ((i & 100663296) == 0) {
                        if (dVarF.T(function3)) {
                            i16 = 67108864;
                        } else {
                            i16 = 33554432;
                        }
                        i3 |= i16;
                    }
                    z5 = true;
                    if ((i3 & 38347923) != 38347922) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (dVarF.g(z6, i3 & 1)) {
                        if (i5 != 0) {
                            bVar4 = androidx.compose.ui.b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        if (i7 != 0) {
                            function6 = null;
                        } else {
                            function6 = function1;
                        }
                        if (i9 != 0) {
                            z4 = false;
                        }
                        if (i12 != 0) {
                            z10 = true;
                        } else {
                            z10 = z2;
                        }
                        if (i14 != 0) {
                            z11 = false;
                        } else {
                            z11 = z3;
                        }
                        if (e.k()) {
                            e.o(-1221877520, i3, -1, "androidx.compose.material3.internal.BasicTooltipBox (BasicTooltip.kt:103)");
                        }
                        objR = dVarF.R();
                        companion = d.INSTANCE;
                        if (objR == companion.a()) {
                            objR = vn3.k(EmptyCoroutineContext.a, dVarF);
                            dVarF.L(objR);
                        }
                        ta2Var = (ta2) objR;
                        objR2 = dVarF.R();
                        if (objR2 == companion.a()) {
                            objR2 = s0.e(Boolean.FALSE, null, 2, null);
                            dVarF.L(objR2);
                        }
                        o58Var = (o58) objR2;
                        if (z11) {
                            z12 = false;
                        } else {
                            z12 = false;
                        }
                        androidx.compose.ui.b.Companion companion6 = androidx.compose.ui.b.INSTANCE;
                        ej7 ej7VarI3 = j.i(tc.INSTANCE.o(), false);
                        iA = pp1.a(dVarF, 0);
                        gs1 gs1VarJ3 = dVarF.j();
                        androidx.compose.ui.b bVarE3 = ComposedModifierKt.e(dVarF, companion6);
                        ComposeUiNode.Companion companion7 = ComposeUiNode.INSTANCE;
                        boolean z110 = z12;
                        function0B = companion7.b();
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
                        dud.i(dVarC, ej7VarI3, companion7.d());
                        dud.i(dVarC, gs1VarJ3, companion7.f());
                        function2C = companion7.c();
                        if (dVarC.getInserting()) {
                            dVarC.L(Integer.valueOf(iA));
                            dVarC.e(Integer.valueOf(iA), function2C);
                        } else {
                            dVarC.L(Integer.valueOf(iA));
                            dVarC.e(Integer.valueOf(iA), function2C);
                        }
                        dud.i(dVarC, bVarE3, companion7.e());
                        BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.a;
                        if (cadVar.isVisible()) {
                            dVarF.y(-1891243071);
                            if (z4) {
                                z13 = true;
                            } else {
                                z13 = true;
                            }
                            Function2<? super d, ? super Integer, Unit> function9 = function4;
                            o58Var2 = o58Var;
                            l(rg9Var, cadVar, function6, ta2Var, z13, o58Var2, function9, dVarF, (i3 & 14) | i10 | ((i3 >> 3) & 112) | ((i3 >> 6) & 896) | ((i3 << 15) & 3670016));
                            dVarF = dVarF;
                            dVarF.u();
                        } else {
                            o58Var2 = o58Var;
                            dVarF.y(-1890863476);
                            dVarF.u();
                        }
                        int i19 = ((i3 >> 18) & 14) | 384 | ((i3 >> 3) & 112) | ((i3 >> 12) & 7168) | (57344 & (i3 << 3)) | ((i3 >> 9) & 458752);
                        cadVar2 = cadVar;
                        boolean z111 = z10;
                        boolean z112 = z11;
                        bVar3 = bVar4;
                        o(z111, cadVar2, o58Var2, z112, bVar3, function3, dVarF, i19, 0);
                        dVarF.m();
                        if ((i3 & 896) != 256) {
                            z5 = false;
                        }
                        objR3 = dVarF.R();
                        if (z5) {
                            objR3 = new Function1() { // from class: com.google.android.si0
                                public final Object invoke(Object obj) {
                                    return BasicTooltipKt.j(cadVar2, (kd3) obj);
                                }
                            };
                            dVarF.L(objR3);
                        } else {
                            objR3 = new Function1() { // from class: com.google.android.si0
                                public final Object invoke(Object obj) {
                                    return BasicTooltipKt.j(cadVar2, (kd3) obj);
                                }
                            };
                            dVarF.L(objR3);
                        }
                        vn3.c(cadVar2, (Function1) objR3, dVarF, (i3 >> 6) & 14);
                        if (e.k()) {
                            e.n();
                        }
                        z7 = z111;
                        z8 = z112;
                        function5 = function6;
                    } else {
                        cadVar2 = cadVar;
                        dVarF.q();
                        z7 = z2;
                        bVar3 = bVar2;
                        function5 = function1;
                        z8 = z3;
                    }
                    d dVar4 = dVarF;
                    z9 = z4;
                    s6bVarH = dVar4.H();
                    if (s6bVarH != null) {
                        final cad cadVar5 = cadVar2;
                        s6bVarH.a(new Function2() { // from class: com.google.android.ti0
                            public final Object invoke(Object obj, Object obj2) {
                                return BasicTooltipKt.k(rg9Var, function2, cadVar5, bVar3, function5, z9, z7, z8, function3, i, i2, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i3 |= 100663296;
                z5 = true;
                if ((i3 & 38347923) != 38347922) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (dVarF.g(z6, i3 & 1)) {
                    if (i5 != 0) {
                        bVar4 = androidx.compose.ui.b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    if (i7 != 0) {
                        function6 = null;
                    } else {
                        function6 = function1;
                    }
                    if (i9 != 0) {
                        z4 = false;
                    }
                    if (i12 != 0) {
                        z10 = true;
                    } else {
                        z10 = z2;
                    }
                    if (i14 != 0) {
                        z11 = false;
                    } else {
                        z11 = z3;
                    }
                    if (e.k()) {
                        e.o(-1221877520, i3, -1, "androidx.compose.material3.internal.BasicTooltipBox (BasicTooltip.kt:103)");
                    }
                    objR = dVarF.R();
                    companion = d.INSTANCE;
                    if (objR == companion.a()) {
                        objR = vn3.k(EmptyCoroutineContext.a, dVarF);
                        dVarF.L(objR);
                    }
                    ta2Var = (ta2) objR;
                    objR2 = dVarF.R();
                    if (objR2 == companion.a()) {
                        objR2 = s0.e(Boolean.FALSE, null, 2, null);
                        dVarF.L(objR2);
                    }
                    o58Var = (o58) objR2;
                    if (z11) {
                        z12 = false;
                    } else {
                        z12 = false;
                    }
                    androidx.compose.ui.b.Companion companion8 = androidx.compose.ui.b.INSTANCE;
                    ej7 ej7VarI4 = j.i(tc.INSTANCE.o(), false);
                    iA = pp1.a(dVarF, 0);
                    gs1 gs1VarJ4 = dVarF.j();
                    androidx.compose.ui.b bVarE4 = ComposedModifierKt.e(dVarF, companion8);
                    ComposeUiNode.Companion companion9 = ComposeUiNode.INSTANCE;
                    boolean z113 = z12;
                    function0B = companion9.b();
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
                    dud.i(dVarC, ej7VarI4, companion9.d());
                    dud.i(dVarC, gs1VarJ4, companion9.f());
                    function2C = companion9.c();
                    if (dVarC.getInserting()) {
                        dVarC.L(Integer.valueOf(iA));
                        dVarC.e(Integer.valueOf(iA), function2C);
                    } else {
                        dVarC.L(Integer.valueOf(iA));
                        dVarC.e(Integer.valueOf(iA), function2C);
                    }
                    dud.i(dVarC, bVarE4, companion9.e());
                    BoxScopeInstance boxScopeInstance4 = BoxScopeInstance.a;
                    if (cadVar.isVisible()) {
                        dVarF.y(-1891243071);
                        if (z4) {
                            z13 = true;
                        } else {
                            z13 = true;
                        }
                        Function2<? super d, ? super Integer, Unit> function10 = function4;
                        o58Var2 = o58Var;
                        l(rg9Var, cadVar, function6, ta2Var, z13, o58Var2, function10, dVarF, (i3 & 14) | i10 | ((i3 >> 3) & 112) | ((i3 >> 6) & 896) | ((i3 << 15) & 3670016));
                        dVarF = dVarF;
                        dVarF.u();
                    } else {
                        o58Var2 = o58Var;
                        dVarF.y(-1890863476);
                        dVarF.u();
                    }
                    int i110 = ((i3 >> 18) & 14) | 384 | ((i3 >> 3) & 112) | ((i3 >> 12) & 7168) | (57344 & (i3 << 3)) | ((i3 >> 9) & 458752);
                    cadVar2 = cadVar;
                    boolean z114 = z10;
                    boolean z115 = z11;
                    bVar3 = bVar4;
                    o(z114, cadVar2, o58Var2, z115, bVar3, function3, dVarF, i110, 0);
                    dVarF.m();
                    if ((i3 & 896) != 256) {
                        z5 = false;
                    }
                    objR3 = dVarF.R();
                    if (z5) {
                        objR3 = new Function1() { // from class: com.google.android.si0
                            public final Object invoke(Object obj) {
                                return BasicTooltipKt.j(cadVar2, (kd3) obj);
                            }
                        };
                        dVarF.L(objR3);
                    } else {
                        objR3 = new Function1() { // from class: com.google.android.si0
                            public final Object invoke(Object obj) {
                                return BasicTooltipKt.j(cadVar2, (kd3) obj);
                            }
                        };
                        dVarF.L(objR3);
                    }
                    vn3.c(cadVar2, (Function1) objR3, dVarF, (i3 >> 6) & 14);
                    if (e.k()) {
                        e.n();
                    }
                    z7 = z114;
                    z8 = z115;
                    function5 = function6;
                } else {
                    cadVar2 = cadVar;
                    dVarF.q();
                    z7 = z2;
                    bVar3 = bVar2;
                    function5 = function1;
                    z8 = z3;
                }
                d dVar5 = dVarF;
                z9 = z4;
                s6bVarH = dVar5.H();
                if (s6bVarH != null) {
                    final cad cadVar6 = cadVar2;
                    s6bVarH.a(new Function2() { // from class: com.google.android.ti0
                        public final Object invoke(Object obj, Object obj2) {
                            return BasicTooltipKt.k(rg9Var, function2, cadVar6, bVar3, function5, z9, z7, z8, function3, i, i2, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i3 |= 3072;
            bVar2 = bVar;
            i7 = i2 & 16;
            if (i7 != 0) {
                if ((i & 24576) == 0) {
                    function1 = function0;
                    if (dVarF.T(function1)) {
                        i8 = 16384;
                    } else {
                        i8 = 8192;
                    }
                    i3 |= i8;
                }
                i9 = i2 & 32;
                if (i9 != 0) {
                    i3 |= 196608;
                    i10 = 196608;
                    z4 = z;
                } else {
                    i10 = 196608;
                    z4 = z;
                    if ((i & 196608) == 0) {
                        if (dVarF.A(z4)) {
                            i11 = 131072;
                        } else {
                            i11 = 65536;
                        }
                        i3 |= i11;
                    }
                }
                i12 = i2 & 64;
                if (i12 != 0) {
                    i3 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    if (dVarF.A(z2)) {
                        i13 = 1048576;
                    } else {
                        i13 = 524288;
                    }
                    i3 |= i13;
                }
                i14 = i2 & 128;
                if (i14 != 0) {
                    i3 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    if (dVarF.A(z3)) {
                        i15 = 8388608;
                    } else {
                        i15 = 4194304;
                    }
                    i3 |= i15;
                }
                if ((i2 & 256) != 0) {
                    if ((i & 100663296) == 0) {
                        if (dVarF.T(function3)) {
                            i16 = 67108864;
                        } else {
                            i16 = 33554432;
                        }
                        i3 |= i16;
                    }
                    z5 = true;
                    if ((i3 & 38347923) != 38347922) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (dVarF.g(z6, i3 & 1)) {
                        if (i5 != 0) {
                            bVar4 = androidx.compose.ui.b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        if (i7 != 0) {
                            function6 = null;
                        } else {
                            function6 = function1;
                        }
                        if (i9 != 0) {
                            z4 = false;
                        }
                        if (i12 != 0) {
                            z10 = true;
                        } else {
                            z10 = z2;
                        }
                        if (i14 != 0) {
                            z11 = false;
                        } else {
                            z11 = z3;
                        }
                        if (e.k()) {
                            e.o(-1221877520, i3, -1, "androidx.compose.material3.internal.BasicTooltipBox (BasicTooltip.kt:103)");
                        }
                        objR = dVarF.R();
                        companion = d.INSTANCE;
                        if (objR == companion.a()) {
                            objR = vn3.k(EmptyCoroutineContext.a, dVarF);
                            dVarF.L(objR);
                        }
                        ta2Var = (ta2) objR;
                        objR2 = dVarF.R();
                        if (objR2 == companion.a()) {
                            objR2 = s0.e(Boolean.FALSE, null, 2, null);
                            dVarF.L(objR2);
                        }
                        o58Var = (o58) objR2;
                        if (z11) {
                            z12 = false;
                        } else {
                            z12 = false;
                        }
                        androidx.compose.ui.b.Companion companion10 = androidx.compose.ui.b.INSTANCE;
                        ej7 ej7VarI5 = j.i(tc.INSTANCE.o(), false);
                        iA = pp1.a(dVarF, 0);
                        gs1 gs1VarJ5 = dVarF.j();
                        androidx.compose.ui.b bVarE5 = ComposedModifierKt.e(dVarF, companion10);
                        ComposeUiNode.Companion companion11 = ComposeUiNode.INSTANCE;
                        boolean z116 = z12;
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
                        dud.i(dVarC, ej7VarI5, companion11.d());
                        dud.i(dVarC, gs1VarJ5, companion11.f());
                        function2C = companion11.c();
                        if (dVarC.getInserting()) {
                            dVarC.L(Integer.valueOf(iA));
                            dVarC.e(Integer.valueOf(iA), function2C);
                        } else {
                            dVarC.L(Integer.valueOf(iA));
                            dVarC.e(Integer.valueOf(iA), function2C);
                        }
                        dud.i(dVarC, bVarE5, companion11.e());
                        BoxScopeInstance boxScopeInstance5 = BoxScopeInstance.a;
                        if (cadVar.isVisible()) {
                            dVarF.y(-1891243071);
                            if (z4) {
                                z13 = true;
                            } else {
                                z13 = true;
                            }
                            Function2<? super d, ? super Integer, Unit> function11 = function4;
                            o58Var2 = o58Var;
                            l(rg9Var, cadVar, function6, ta2Var, z13, o58Var2, function11, dVarF, (i3 & 14) | i10 | ((i3 >> 3) & 112) | ((i3 >> 6) & 896) | ((i3 << 15) & 3670016));
                            dVarF = dVarF;
                            dVarF.u();
                        } else {
                            o58Var2 = o58Var;
                            dVarF.y(-1890863476);
                            dVarF.u();
                        }
                        int i111 = ((i3 >> 18) & 14) | 384 | ((i3 >> 3) & 112) | ((i3 >> 12) & 7168) | (57344 & (i3 << 3)) | ((i3 >> 9) & 458752);
                        cadVar2 = cadVar;
                        boolean z117 = z10;
                        boolean z118 = z11;
                        bVar3 = bVar4;
                        o(z117, cadVar2, o58Var2, z118, bVar3, function3, dVarF, i111, 0);
                        dVarF.m();
                        if ((i3 & 896) != 256) {
                            z5 = false;
                        }
                        objR3 = dVarF.R();
                        if (z5) {
                            objR3 = new Function1() { // from class: com.google.android.si0
                                public final Object invoke(Object obj) {
                                    return BasicTooltipKt.j(cadVar2, (kd3) obj);
                                }
                            };
                            dVarF.L(objR3);
                        } else {
                            objR3 = new Function1() { // from class: com.google.android.si0
                                public final Object invoke(Object obj) {
                                    return BasicTooltipKt.j(cadVar2, (kd3) obj);
                                }
                            };
                            dVarF.L(objR3);
                        }
                        vn3.c(cadVar2, (Function1) objR3, dVarF, (i3 >> 6) & 14);
                        if (e.k()) {
                            e.n();
                        }
                        z7 = z117;
                        z8 = z118;
                        function5 = function6;
                    } else {
                        cadVar2 = cadVar;
                        dVarF.q();
                        z7 = z2;
                        bVar3 = bVar2;
                        function5 = function1;
                        z8 = z3;
                    }
                    d dVar6 = dVarF;
                    z9 = z4;
                    s6bVarH = dVar6.H();
                    if (s6bVarH != null) {
                        final cad cadVar7 = cadVar2;
                        s6bVarH.a(new Function2() { // from class: com.google.android.ti0
                            public final Object invoke(Object obj, Object obj2) {
                                return BasicTooltipKt.k(rg9Var, function2, cadVar7, bVar3, function5, z9, z7, z8, function3, i, i2, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i3 |= 100663296;
                z5 = true;
                if ((i3 & 38347923) != 38347922) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (dVarF.g(z6, i3 & 1)) {
                    if (i5 != 0) {
                        bVar4 = androidx.compose.ui.b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    if (i7 != 0) {
                        function6 = null;
                    } else {
                        function6 = function1;
                    }
                    if (i9 != 0) {
                        z4 = false;
                    }
                    if (i12 != 0) {
                        z10 = true;
                    } else {
                        z10 = z2;
                    }
                    if (i14 != 0) {
                        z11 = false;
                    } else {
                        z11 = z3;
                    }
                    if (e.k()) {
                        e.o(-1221877520, i3, -1, "androidx.compose.material3.internal.BasicTooltipBox (BasicTooltip.kt:103)");
                    }
                    objR = dVarF.R();
                    companion = d.INSTANCE;
                    if (objR == companion.a()) {
                        objR = vn3.k(EmptyCoroutineContext.a, dVarF);
                        dVarF.L(objR);
                    }
                    ta2Var = (ta2) objR;
                    objR2 = dVarF.R();
                    if (objR2 == companion.a()) {
                        objR2 = s0.e(Boolean.FALSE, null, 2, null);
                        dVarF.L(objR2);
                    }
                    o58Var = (o58) objR2;
                    if (z11) {
                        z12 = false;
                    } else {
                        z12 = false;
                    }
                    androidx.compose.ui.b.Companion companion12 = androidx.compose.ui.b.INSTANCE;
                    ej7 ej7VarI6 = j.i(tc.INSTANCE.o(), false);
                    iA = pp1.a(dVarF, 0);
                    gs1 gs1VarJ6 = dVarF.j();
                    androidx.compose.ui.b bVarE6 = ComposedModifierKt.e(dVarF, companion12);
                    ComposeUiNode.Companion companion13 = ComposeUiNode.INSTANCE;
                    boolean z119 = z12;
                    function0B = companion13.b();
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
                    dud.i(dVarC, ej7VarI6, companion13.d());
                    dud.i(dVarC, gs1VarJ6, companion13.f());
                    function2C = companion13.c();
                    if (dVarC.getInserting()) {
                        dVarC.L(Integer.valueOf(iA));
                        dVarC.e(Integer.valueOf(iA), function2C);
                    } else {
                        dVarC.L(Integer.valueOf(iA));
                        dVarC.e(Integer.valueOf(iA), function2C);
                    }
                    dud.i(dVarC, bVarE6, companion13.e());
                    BoxScopeInstance boxScopeInstance6 = BoxScopeInstance.a;
                    if (cadVar.isVisible()) {
                        dVarF.y(-1891243071);
                        if (z4) {
                            z13 = true;
                        } else {
                            z13 = true;
                        }
                        Function2<? super d, ? super Integer, Unit> function12 = function4;
                        o58Var2 = o58Var;
                        l(rg9Var, cadVar, function6, ta2Var, z13, o58Var2, function12, dVarF, (i3 & 14) | i10 | ((i3 >> 3) & 112) | ((i3 >> 6) & 896) | ((i3 << 15) & 3670016));
                        dVarF = dVarF;
                        dVarF.u();
                    } else {
                        o58Var2 = o58Var;
                        dVarF.y(-1890863476);
                        dVarF.u();
                    }
                    int i112 = ((i3 >> 18) & 14) | 384 | ((i3 >> 3) & 112) | ((i3 >> 12) & 7168) | (57344 & (i3 << 3)) | ((i3 >> 9) & 458752);
                    cadVar2 = cadVar;
                    boolean z1110 = z10;
                    boolean z1111 = z11;
                    bVar3 = bVar4;
                    o(z1110, cadVar2, o58Var2, z1111, bVar3, function3, dVarF, i112, 0);
                    dVarF.m();
                    if ((i3 & 896) != 256) {
                        z5 = false;
                    }
                    objR3 = dVarF.R();
                    if (z5) {
                        objR3 = new Function1() { // from class: com.google.android.si0
                            public final Object invoke(Object obj) {
                                return BasicTooltipKt.j(cadVar2, (kd3) obj);
                            }
                        };
                        dVarF.L(objR3);
                    } else {
                        objR3 = new Function1() { // from class: com.google.android.si0
                            public final Object invoke(Object obj) {
                                return BasicTooltipKt.j(cadVar2, (kd3) obj);
                            }
                        };
                        dVarF.L(objR3);
                    }
                    vn3.c(cadVar2, (Function1) objR3, dVarF, (i3 >> 6) & 14);
                    if (e.k()) {
                        e.n();
                    }
                    z7 = z1110;
                    z8 = z1111;
                    function5 = function6;
                } else {
                    cadVar2 = cadVar;
                    dVarF.q();
                    z7 = z2;
                    bVar3 = bVar2;
                    function5 = function1;
                    z8 = z3;
                }
                d dVar7 = dVarF;
                z9 = z4;
                s6bVarH = dVar7.H();
                if (s6bVarH != null) {
                    final cad cadVar8 = cadVar2;
                    s6bVarH.a(new Function2() { // from class: com.google.android.ti0
                        public final Object invoke(Object obj, Object obj2) {
                            return BasicTooltipKt.k(rg9Var, function2, cadVar8, bVar3, function5, z9, z7, z8, function3, i, i2, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i3 |= 24576;
            function1 = function0;
            i9 = i2 & 32;
            if (i9 != 0) {
                i3 |= 196608;
                i10 = 196608;
                z4 = z;
            } else {
                i10 = 196608;
                z4 = z;
                if ((i & 196608) == 0) {
                    if (dVarF.A(z4)) {
                        i11 = 131072;
                    } else {
                        i11 = 65536;
                    }
                    i3 |= i11;
                }
            }
            i12 = i2 & 64;
            if (i12 != 0) {
                i3 |= 1572864;
            } else if ((i & 1572864) == 0) {
                if (dVarF.A(z2)) {
                    i13 = 1048576;
                } else {
                    i13 = 524288;
                }
                i3 |= i13;
            }
            i14 = i2 & 128;
            if (i14 != 0) {
                i3 |= 12582912;
            } else if ((i & 12582912) == 0) {
                if (dVarF.A(z3)) {
                    i15 = 8388608;
                } else {
                    i15 = 4194304;
                }
                i3 |= i15;
            }
            if ((i2 & 256) != 0) {
                if ((i & 100663296) == 0) {
                    if (dVarF.T(function3)) {
                        i16 = 67108864;
                    } else {
                        i16 = 33554432;
                    }
                    i3 |= i16;
                }
                z5 = true;
                if ((i3 & 38347923) != 38347922) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (dVarF.g(z6, i3 & 1)) {
                    if (i5 != 0) {
                        bVar4 = androidx.compose.ui.b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    if (i7 != 0) {
                        function6 = null;
                    } else {
                        function6 = function1;
                    }
                    if (i9 != 0) {
                        z4 = false;
                    }
                    if (i12 != 0) {
                        z10 = true;
                    } else {
                        z10 = z2;
                    }
                    if (i14 != 0) {
                        z11 = false;
                    } else {
                        z11 = z3;
                    }
                    if (e.k()) {
                        e.o(-1221877520, i3, -1, "androidx.compose.material3.internal.BasicTooltipBox (BasicTooltip.kt:103)");
                    }
                    objR = dVarF.R();
                    companion = d.INSTANCE;
                    if (objR == companion.a()) {
                        objR = vn3.k(EmptyCoroutineContext.a, dVarF);
                        dVarF.L(objR);
                    }
                    ta2Var = (ta2) objR;
                    objR2 = dVarF.R();
                    if (objR2 == companion.a()) {
                        objR2 = s0.e(Boolean.FALSE, null, 2, null);
                        dVarF.L(objR2);
                    }
                    o58Var = (o58) objR2;
                    if (z11) {
                        z12 = false;
                    } else {
                        z12 = false;
                    }
                    androidx.compose.ui.b.Companion companion14 = androidx.compose.ui.b.INSTANCE;
                    ej7 ej7VarI7 = j.i(tc.INSTANCE.o(), false);
                    iA = pp1.a(dVarF, 0);
                    gs1 gs1VarJ7 = dVarF.j();
                    androidx.compose.ui.b bVarE7 = ComposedModifierKt.e(dVarF, companion14);
                    ComposeUiNode.Companion companion15 = ComposeUiNode.INSTANCE;
                    boolean z1112 = z12;
                    function0B = companion15.b();
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
                    dud.i(dVarC, ej7VarI7, companion15.d());
                    dud.i(dVarC, gs1VarJ7, companion15.f());
                    function2C = companion15.c();
                    if (dVarC.getInserting()) {
                        dVarC.L(Integer.valueOf(iA));
                        dVarC.e(Integer.valueOf(iA), function2C);
                    } else {
                        dVarC.L(Integer.valueOf(iA));
                        dVarC.e(Integer.valueOf(iA), function2C);
                    }
                    dud.i(dVarC, bVarE7, companion15.e());
                    BoxScopeInstance boxScopeInstance7 = BoxScopeInstance.a;
                    if (cadVar.isVisible()) {
                        dVarF.y(-1891243071);
                        if (z4) {
                            z13 = true;
                        } else {
                            z13 = true;
                        }
                        Function2<? super d, ? super Integer, Unit> function13 = function4;
                        o58Var2 = o58Var;
                        l(rg9Var, cadVar, function6, ta2Var, z13, o58Var2, function13, dVarF, (i3 & 14) | i10 | ((i3 >> 3) & 112) | ((i3 >> 6) & 896) | ((i3 << 15) & 3670016));
                        dVarF = dVarF;
                        dVarF.u();
                    } else {
                        o58Var2 = o58Var;
                        dVarF.y(-1890863476);
                        dVarF.u();
                    }
                    int i113 = ((i3 >> 18) & 14) | 384 | ((i3 >> 3) & 112) | ((i3 >> 12) & 7168) | (57344 & (i3 << 3)) | ((i3 >> 9) & 458752);
                    cadVar2 = cadVar;
                    boolean z1113 = z10;
                    boolean z1114 = z11;
                    bVar3 = bVar4;
                    o(z1113, cadVar2, o58Var2, z1114, bVar3, function3, dVarF, i113, 0);
                    dVarF.m();
                    if ((i3 & 896) != 256) {
                        z5 = false;
                    }
                    objR3 = dVarF.R();
                    if (z5) {
                        objR3 = new Function1() { // from class: com.google.android.si0
                            public final Object invoke(Object obj) {
                                return BasicTooltipKt.j(cadVar2, (kd3) obj);
                            }
                        };
                        dVarF.L(objR3);
                    } else {
                        objR3 = new Function1() { // from class: com.google.android.si0
                            public final Object invoke(Object obj) {
                                return BasicTooltipKt.j(cadVar2, (kd3) obj);
                            }
                        };
                        dVarF.L(objR3);
                    }
                    vn3.c(cadVar2, (Function1) objR3, dVarF, (i3 >> 6) & 14);
                    if (e.k()) {
                        e.n();
                    }
                    z7 = z1113;
                    z8 = z1114;
                    function5 = function6;
                } else {
                    cadVar2 = cadVar;
                    dVarF.q();
                    z7 = z2;
                    bVar3 = bVar2;
                    function5 = function1;
                    z8 = z3;
                }
                d dVar8 = dVarF;
                z9 = z4;
                s6bVarH = dVar8.H();
                if (s6bVarH != null) {
                    final cad cadVar9 = cadVar2;
                    s6bVarH.a(new Function2() { // from class: com.google.android.ti0
                        public final Object invoke(Object obj, Object obj2) {
                            return BasicTooltipKt.k(rg9Var, function2, cadVar9, bVar3, function5, z9, z7, z8, function3, i, i2, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i3 |= 100663296;
            z5 = true;
            if ((i3 & 38347923) != 38347922) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (dVarF.g(z6, i3 & 1)) {
                if (i5 != 0) {
                    bVar4 = androidx.compose.ui.b.INSTANCE;
                } else {
                    bVar4 = bVar2;
                }
                if (i7 != 0) {
                    function6 = null;
                } else {
                    function6 = function1;
                }
                if (i9 != 0) {
                    z4 = false;
                }
                if (i12 != 0) {
                    z10 = true;
                } else {
                    z10 = z2;
                }
                if (i14 != 0) {
                    z11 = false;
                } else {
                    z11 = z3;
                }
                if (e.k()) {
                    e.o(-1221877520, i3, -1, "androidx.compose.material3.internal.BasicTooltipBox (BasicTooltip.kt:103)");
                }
                objR = dVarF.R();
                companion = d.INSTANCE;
                if (objR == companion.a()) {
                    objR = vn3.k(EmptyCoroutineContext.a, dVarF);
                    dVarF.L(objR);
                }
                ta2Var = (ta2) objR;
                objR2 = dVarF.R();
                if (objR2 == companion.a()) {
                    objR2 = s0.e(Boolean.FALSE, null, 2, null);
                    dVarF.L(objR2);
                }
                o58Var = (o58) objR2;
                if (z11) {
                    z12 = false;
                } else {
                    z12 = false;
                }
                androidx.compose.ui.b.Companion companion16 = androidx.compose.ui.b.INSTANCE;
                ej7 ej7VarI8 = j.i(tc.INSTANCE.o(), false);
                iA = pp1.a(dVarF, 0);
                gs1 gs1VarJ8 = dVarF.j();
                androidx.compose.ui.b bVarE8 = ComposedModifierKt.e(dVarF, companion16);
                ComposeUiNode.Companion companion17 = ComposeUiNode.INSTANCE;
                boolean z1115 = z12;
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
                dud.i(dVarC, ej7VarI8, companion17.d());
                dud.i(dVarC, gs1VarJ8, companion17.f());
                function2C = companion17.c();
                if (dVarC.getInserting()) {
                    dVarC.L(Integer.valueOf(iA));
                    dVarC.e(Integer.valueOf(iA), function2C);
                } else {
                    dVarC.L(Integer.valueOf(iA));
                    dVarC.e(Integer.valueOf(iA), function2C);
                }
                dud.i(dVarC, bVarE8, companion17.e());
                BoxScopeInstance boxScopeInstance8 = BoxScopeInstance.a;
                if (cadVar.isVisible()) {
                    dVarF.y(-1891243071);
                    if (z4) {
                        z13 = true;
                    } else {
                        z13 = true;
                    }
                    Function2<? super d, ? super Integer, Unit> function14 = function4;
                    o58Var2 = o58Var;
                    l(rg9Var, cadVar, function6, ta2Var, z13, o58Var2, function14, dVarF, (i3 & 14) | i10 | ((i3 >> 3) & 112) | ((i3 >> 6) & 896) | ((i3 << 15) & 3670016));
                    dVarF = dVarF;
                    dVarF.u();
                } else {
                    o58Var2 = o58Var;
                    dVarF.y(-1890863476);
                    dVarF.u();
                }
                int i114 = ((i3 >> 18) & 14) | 384 | ((i3 >> 3) & 112) | ((i3 >> 12) & 7168) | (57344 & (i3 << 3)) | ((i3 >> 9) & 458752);
                cadVar2 = cadVar;
                boolean z1116 = z10;
                boolean z1117 = z11;
                bVar3 = bVar4;
                o(z1116, cadVar2, o58Var2, z1117, bVar3, function3, dVarF, i114, 0);
                dVarF.m();
                if ((i3 & 896) != 256) {
                    z5 = false;
                }
                objR3 = dVarF.R();
                if (z5) {
                    objR3 = new Function1() { // from class: com.google.android.si0
                        public final Object invoke(Object obj) {
                            return BasicTooltipKt.j(cadVar2, (kd3) obj);
                        }
                    };
                    dVarF.L(objR3);
                } else {
                    objR3 = new Function1() { // from class: com.google.android.si0
                        public final Object invoke(Object obj) {
                            return BasicTooltipKt.j(cadVar2, (kd3) obj);
                        }
                    };
                    dVarF.L(objR3);
                }
                vn3.c(cadVar2, (Function1) objR3, dVarF, (i3 >> 6) & 14);
                if (e.k()) {
                    e.n();
                }
                z7 = z1116;
                z8 = z1117;
                function5 = function6;
            } else {
                cadVar2 = cadVar;
                dVarF.q();
                z7 = z2;
                bVar3 = bVar2;
                function5 = function1;
                z8 = z3;
            }
            d dVar9 = dVarF;
            z9 = z4;
            s6bVarH = dVar9.H();
            if (s6bVarH != null) {
                final cad cadVar10 = cadVar2;
                s6bVarH.a(new Function2() { // from class: com.google.android.ti0
                    public final Object invoke(Object obj, Object obj2) {
                        return BasicTooltipKt.k(rg9Var, function2, cadVar10, bVar3, function5, z9, z7, z8, function3, i, i2, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i3 |= 48;
        function4 = function2;
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            if ((i & 512) == 0) {
                zT = dVarF.x(cadVar);
            } else {
                zT = dVarF.T(cadVar);
            }
            if (zT) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i3 |= i4;
        }
        i5 = i2 & 8;
        if (i5 != 0) {
            if ((i & 3072) == 0) {
                bVar2 = bVar;
                if (dVarF.x(bVar2)) {
                    i6 = 2048;
                } else {
                    i6 = 1024;
                }
                i3 |= i6;
            }
            i7 = i2 & 16;
            if (i7 != 0) {
                if ((i & 24576) == 0) {
                    function1 = function0;
                    if (dVarF.T(function1)) {
                        i8 = 16384;
                    } else {
                        i8 = 8192;
                    }
                    i3 |= i8;
                }
                i9 = i2 & 32;
                if (i9 != 0) {
                    i3 |= 196608;
                    i10 = 196608;
                    z4 = z;
                } else {
                    i10 = 196608;
                    z4 = z;
                    if ((i & 196608) == 0) {
                        if (dVarF.A(z4)) {
                            i11 = 131072;
                        } else {
                            i11 = 65536;
                        }
                        i3 |= i11;
                    }
                }
                i12 = i2 & 64;
                if (i12 != 0) {
                    i3 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    if (dVarF.A(z2)) {
                        i13 = 1048576;
                    } else {
                        i13 = 524288;
                    }
                    i3 |= i13;
                }
                i14 = i2 & 128;
                if (i14 != 0) {
                    i3 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    if (dVarF.A(z3)) {
                        i15 = 8388608;
                    } else {
                        i15 = 4194304;
                    }
                    i3 |= i15;
                }
                if ((i2 & 256) != 0) {
                    if ((i & 100663296) == 0) {
                        if (dVarF.T(function3)) {
                            i16 = 67108864;
                        } else {
                            i16 = 33554432;
                        }
                        i3 |= i16;
                    }
                    z5 = true;
                    if ((i3 & 38347923) != 38347922) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (dVarF.g(z6, i3 & 1)) {
                        if (i5 != 0) {
                            bVar4 = androidx.compose.ui.b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        if (i7 != 0) {
                            function6 = null;
                        } else {
                            function6 = function1;
                        }
                        if (i9 != 0) {
                            z4 = false;
                        }
                        if (i12 != 0) {
                            z10 = true;
                        } else {
                            z10 = z2;
                        }
                        if (i14 != 0) {
                            z11 = false;
                        } else {
                            z11 = z3;
                        }
                        if (e.k()) {
                            e.o(-1221877520, i3, -1, "androidx.compose.material3.internal.BasicTooltipBox (BasicTooltip.kt:103)");
                        }
                        objR = dVarF.R();
                        companion = d.INSTANCE;
                        if (objR == companion.a()) {
                            objR = vn3.k(EmptyCoroutineContext.a, dVarF);
                            dVarF.L(objR);
                        }
                        ta2Var = (ta2) objR;
                        objR2 = dVarF.R();
                        if (objR2 == companion.a()) {
                            objR2 = s0.e(Boolean.FALSE, null, 2, null);
                            dVarF.L(objR2);
                        }
                        o58Var = (o58) objR2;
                        if (z11) {
                            z12 = false;
                        } else {
                            z12 = false;
                        }
                        androidx.compose.ui.b.Companion companion18 = androidx.compose.ui.b.INSTANCE;
                        ej7 ej7VarI9 = j.i(tc.INSTANCE.o(), false);
                        iA = pp1.a(dVarF, 0);
                        gs1 gs1VarJ9 = dVarF.j();
                        androidx.compose.ui.b bVarE9 = ComposedModifierKt.e(dVarF, companion18);
                        ComposeUiNode.Companion companion19 = ComposeUiNode.INSTANCE;
                        boolean z1118 = z12;
                        function0B = companion19.b();
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
                        dud.i(dVarC, ej7VarI9, companion19.d());
                        dud.i(dVarC, gs1VarJ9, companion19.f());
                        function2C = companion19.c();
                        if (dVarC.getInserting()) {
                            dVarC.L(Integer.valueOf(iA));
                            dVarC.e(Integer.valueOf(iA), function2C);
                        } else {
                            dVarC.L(Integer.valueOf(iA));
                            dVarC.e(Integer.valueOf(iA), function2C);
                        }
                        dud.i(dVarC, bVarE9, companion19.e());
                        BoxScopeInstance boxScopeInstance9 = BoxScopeInstance.a;
                        if (cadVar.isVisible()) {
                            dVarF.y(-1891243071);
                            if (z4) {
                                z13 = true;
                            } else {
                                z13 = true;
                            }
                            Function2<? super d, ? super Integer, Unit> function15 = function4;
                            o58Var2 = o58Var;
                            l(rg9Var, cadVar, function6, ta2Var, z13, o58Var2, function15, dVarF, (i3 & 14) | i10 | ((i3 >> 3) & 112) | ((i3 >> 6) & 896) | ((i3 << 15) & 3670016));
                            dVarF = dVarF;
                            dVarF.u();
                        } else {
                            o58Var2 = o58Var;
                            dVarF.y(-1890863476);
                            dVarF.u();
                        }
                        int i115 = ((i3 >> 18) & 14) | 384 | ((i3 >> 3) & 112) | ((i3 >> 12) & 7168) | (57344 & (i3 << 3)) | ((i3 >> 9) & 458752);
                        cadVar2 = cadVar;
                        boolean z1119 = z10;
                        boolean z11110 = z11;
                        bVar3 = bVar4;
                        o(z1119, cadVar2, o58Var2, z11110, bVar3, function3, dVarF, i115, 0);
                        dVarF.m();
                        if ((i3 & 896) != 256) {
                            z5 = false;
                        }
                        objR3 = dVarF.R();
                        if (z5) {
                            objR3 = new Function1() { // from class: com.google.android.si0
                                public final Object invoke(Object obj) {
                                    return BasicTooltipKt.j(cadVar2, (kd3) obj);
                                }
                            };
                            dVarF.L(objR3);
                        } else {
                            objR3 = new Function1() { // from class: com.google.android.si0
                                public final Object invoke(Object obj) {
                                    return BasicTooltipKt.j(cadVar2, (kd3) obj);
                                }
                            };
                            dVarF.L(objR3);
                        }
                        vn3.c(cadVar2, (Function1) objR3, dVarF, (i3 >> 6) & 14);
                        if (e.k()) {
                            e.n();
                        }
                        z7 = z1119;
                        z8 = z11110;
                        function5 = function6;
                    } else {
                        cadVar2 = cadVar;
                        dVarF.q();
                        z7 = z2;
                        bVar3 = bVar2;
                        function5 = function1;
                        z8 = z3;
                    }
                    d dVar10 = dVarF;
                    z9 = z4;
                    s6bVarH = dVar10.H();
                    if (s6bVarH != null) {
                        final cad cadVar11 = cadVar2;
                        s6bVarH.a(new Function2() { // from class: com.google.android.ti0
                            public final Object invoke(Object obj, Object obj2) {
                                return BasicTooltipKt.k(rg9Var, function2, cadVar11, bVar3, function5, z9, z7, z8, function3, i, i2, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i3 |= 100663296;
                z5 = true;
                if ((i3 & 38347923) != 38347922) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (dVarF.g(z6, i3 & 1)) {
                    if (i5 != 0) {
                        bVar4 = androidx.compose.ui.b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    if (i7 != 0) {
                        function6 = null;
                    } else {
                        function6 = function1;
                    }
                    if (i9 != 0) {
                        z4 = false;
                    }
                    if (i12 != 0) {
                        z10 = true;
                    } else {
                        z10 = z2;
                    }
                    if (i14 != 0) {
                        z11 = false;
                    } else {
                        z11 = z3;
                    }
                    if (e.k()) {
                        e.o(-1221877520, i3, -1, "androidx.compose.material3.internal.BasicTooltipBox (BasicTooltip.kt:103)");
                    }
                    objR = dVarF.R();
                    companion = d.INSTANCE;
                    if (objR == companion.a()) {
                        objR = vn3.k(EmptyCoroutineContext.a, dVarF);
                        dVarF.L(objR);
                    }
                    ta2Var = (ta2) objR;
                    objR2 = dVarF.R();
                    if (objR2 == companion.a()) {
                        objR2 = s0.e(Boolean.FALSE, null, 2, null);
                        dVarF.L(objR2);
                    }
                    o58Var = (o58) objR2;
                    if (z11) {
                        z12 = false;
                    } else {
                        z12 = false;
                    }
                    androidx.compose.ui.b.Companion companion110 = androidx.compose.ui.b.INSTANCE;
                    ej7 ej7VarI10 = j.i(tc.INSTANCE.o(), false);
                    iA = pp1.a(dVarF, 0);
                    gs1 gs1VarJ10 = dVarF.j();
                    androidx.compose.ui.b bVarE10 = ComposedModifierKt.e(dVarF, companion110);
                    ComposeUiNode.Companion companion111 = ComposeUiNode.INSTANCE;
                    boolean z11111 = z12;
                    function0B = companion111.b();
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
                    dud.i(dVarC, ej7VarI10, companion111.d());
                    dud.i(dVarC, gs1VarJ10, companion111.f());
                    function2C = companion111.c();
                    if (dVarC.getInserting()) {
                        dVarC.L(Integer.valueOf(iA));
                        dVarC.e(Integer.valueOf(iA), function2C);
                    } else {
                        dVarC.L(Integer.valueOf(iA));
                        dVarC.e(Integer.valueOf(iA), function2C);
                    }
                    dud.i(dVarC, bVarE10, companion111.e());
                    BoxScopeInstance boxScopeInstance10 = BoxScopeInstance.a;
                    if (cadVar.isVisible()) {
                        dVarF.y(-1891243071);
                        if (z4) {
                            z13 = true;
                        } else {
                            z13 = true;
                        }
                        Function2<? super d, ? super Integer, Unit> function16 = function4;
                        o58Var2 = o58Var;
                        l(rg9Var, cadVar, function6, ta2Var, z13, o58Var2, function16, dVarF, (i3 & 14) | i10 | ((i3 >> 3) & 112) | ((i3 >> 6) & 896) | ((i3 << 15) & 3670016));
                        dVarF = dVarF;
                        dVarF.u();
                    } else {
                        o58Var2 = o58Var;
                        dVarF.y(-1890863476);
                        dVarF.u();
                    }
                    int i116 = ((i3 >> 18) & 14) | 384 | ((i3 >> 3) & 112) | ((i3 >> 12) & 7168) | (57344 & (i3 << 3)) | ((i3 >> 9) & 458752);
                    cadVar2 = cadVar;
                    boolean z11112 = z10;
                    boolean z11113 = z11;
                    bVar3 = bVar4;
                    o(z11112, cadVar2, o58Var2, z11113, bVar3, function3, dVarF, i116, 0);
                    dVarF.m();
                    if ((i3 & 896) != 256) {
                        z5 = false;
                    }
                    objR3 = dVarF.R();
                    if (z5) {
                        objR3 = new Function1() { // from class: com.google.android.si0
                            public final Object invoke(Object obj) {
                                return BasicTooltipKt.j(cadVar2, (kd3) obj);
                            }
                        };
                        dVarF.L(objR3);
                    } else {
                        objR3 = new Function1() { // from class: com.google.android.si0
                            public final Object invoke(Object obj) {
                                return BasicTooltipKt.j(cadVar2, (kd3) obj);
                            }
                        };
                        dVarF.L(objR3);
                    }
                    vn3.c(cadVar2, (Function1) objR3, dVarF, (i3 >> 6) & 14);
                    if (e.k()) {
                        e.n();
                    }
                    z7 = z11112;
                    z8 = z11113;
                    function5 = function6;
                } else {
                    cadVar2 = cadVar;
                    dVarF.q();
                    z7 = z2;
                    bVar3 = bVar2;
                    function5 = function1;
                    z8 = z3;
                }
                d dVar11 = dVarF;
                z9 = z4;
                s6bVarH = dVar11.H();
                if (s6bVarH != null) {
                    final cad cadVar12 = cadVar2;
                    s6bVarH.a(new Function2() { // from class: com.google.android.ti0
                        public final Object invoke(Object obj, Object obj2) {
                            return BasicTooltipKt.k(rg9Var, function2, cadVar12, bVar3, function5, z9, z7, z8, function3, i, i2, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i3 |= 24576;
            function1 = function0;
            i9 = i2 & 32;
            if (i9 != 0) {
                i3 |= 196608;
                i10 = 196608;
                z4 = z;
            } else {
                i10 = 196608;
                z4 = z;
                if ((i & 196608) == 0) {
                    if (dVarF.A(z4)) {
                        i11 = 131072;
                    } else {
                        i11 = 65536;
                    }
                    i3 |= i11;
                }
            }
            i12 = i2 & 64;
            if (i12 != 0) {
                i3 |= 1572864;
            } else if ((i & 1572864) == 0) {
                if (dVarF.A(z2)) {
                    i13 = 1048576;
                } else {
                    i13 = 524288;
                }
                i3 |= i13;
            }
            i14 = i2 & 128;
            if (i14 != 0) {
                i3 |= 12582912;
            } else if ((i & 12582912) == 0) {
                if (dVarF.A(z3)) {
                    i15 = 8388608;
                } else {
                    i15 = 4194304;
                }
                i3 |= i15;
            }
            if ((i2 & 256) != 0) {
                if ((i & 100663296) == 0) {
                    if (dVarF.T(function3)) {
                        i16 = 67108864;
                    } else {
                        i16 = 33554432;
                    }
                    i3 |= i16;
                }
                z5 = true;
                if ((i3 & 38347923) != 38347922) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (dVarF.g(z6, i3 & 1)) {
                    if (i5 != 0) {
                        bVar4 = androidx.compose.ui.b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    if (i7 != 0) {
                        function6 = null;
                    } else {
                        function6 = function1;
                    }
                    if (i9 != 0) {
                        z4 = false;
                    }
                    if (i12 != 0) {
                        z10 = true;
                    } else {
                        z10 = z2;
                    }
                    if (i14 != 0) {
                        z11 = false;
                    } else {
                        z11 = z3;
                    }
                    if (e.k()) {
                        e.o(-1221877520, i3, -1, "androidx.compose.material3.internal.BasicTooltipBox (BasicTooltip.kt:103)");
                    }
                    objR = dVarF.R();
                    companion = d.INSTANCE;
                    if (objR == companion.a()) {
                        objR = vn3.k(EmptyCoroutineContext.a, dVarF);
                        dVarF.L(objR);
                    }
                    ta2Var = (ta2) objR;
                    objR2 = dVarF.R();
                    if (objR2 == companion.a()) {
                        objR2 = s0.e(Boolean.FALSE, null, 2, null);
                        dVarF.L(objR2);
                    }
                    o58Var = (o58) objR2;
                    if (z11) {
                        z12 = false;
                    } else {
                        z12 = false;
                    }
                    androidx.compose.ui.b.Companion companion112 = androidx.compose.ui.b.INSTANCE;
                    ej7 ej7VarI11 = j.i(tc.INSTANCE.o(), false);
                    iA = pp1.a(dVarF, 0);
                    gs1 gs1VarJ11 = dVarF.j();
                    androidx.compose.ui.b bVarE11 = ComposedModifierKt.e(dVarF, companion112);
                    ComposeUiNode.Companion companion113 = ComposeUiNode.INSTANCE;
                    boolean z11114 = z12;
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
                    dud.i(dVarC, ej7VarI11, companion113.d());
                    dud.i(dVarC, gs1VarJ11, companion113.f());
                    function2C = companion113.c();
                    if (dVarC.getInserting()) {
                        dVarC.L(Integer.valueOf(iA));
                        dVarC.e(Integer.valueOf(iA), function2C);
                    } else {
                        dVarC.L(Integer.valueOf(iA));
                        dVarC.e(Integer.valueOf(iA), function2C);
                    }
                    dud.i(dVarC, bVarE11, companion113.e());
                    BoxScopeInstance boxScopeInstance11 = BoxScopeInstance.a;
                    if (cadVar.isVisible()) {
                        dVarF.y(-1891243071);
                        if (z4) {
                            z13 = true;
                        } else {
                            z13 = true;
                        }
                        Function2<? super d, ? super Integer, Unit> function17 = function4;
                        o58Var2 = o58Var;
                        l(rg9Var, cadVar, function6, ta2Var, z13, o58Var2, function17, dVarF, (i3 & 14) | i10 | ((i3 >> 3) & 112) | ((i3 >> 6) & 896) | ((i3 << 15) & 3670016));
                        dVarF = dVarF;
                        dVarF.u();
                    } else {
                        o58Var2 = o58Var;
                        dVarF.y(-1890863476);
                        dVarF.u();
                    }
                    int i117 = ((i3 >> 18) & 14) | 384 | ((i3 >> 3) & 112) | ((i3 >> 12) & 7168) | (57344 & (i3 << 3)) | ((i3 >> 9) & 458752);
                    cadVar2 = cadVar;
                    boolean z11115 = z10;
                    boolean z11116 = z11;
                    bVar3 = bVar4;
                    o(z11115, cadVar2, o58Var2, z11116, bVar3, function3, dVarF, i117, 0);
                    dVarF.m();
                    if ((i3 & 896) != 256) {
                        z5 = false;
                    }
                    objR3 = dVarF.R();
                    if (z5) {
                        objR3 = new Function1() { // from class: com.google.android.si0
                            public final Object invoke(Object obj) {
                                return BasicTooltipKt.j(cadVar2, (kd3) obj);
                            }
                        };
                        dVarF.L(objR3);
                    } else {
                        objR3 = new Function1() { // from class: com.google.android.si0
                            public final Object invoke(Object obj) {
                                return BasicTooltipKt.j(cadVar2, (kd3) obj);
                            }
                        };
                        dVarF.L(objR3);
                    }
                    vn3.c(cadVar2, (Function1) objR3, dVarF, (i3 >> 6) & 14);
                    if (e.k()) {
                        e.n();
                    }
                    z7 = z11115;
                    z8 = z11116;
                    function5 = function6;
                } else {
                    cadVar2 = cadVar;
                    dVarF.q();
                    z7 = z2;
                    bVar3 = bVar2;
                    function5 = function1;
                    z8 = z3;
                }
                d dVar12 = dVarF;
                z9 = z4;
                s6bVarH = dVar12.H();
                if (s6bVarH != null) {
                    final cad cadVar13 = cadVar2;
                    s6bVarH.a(new Function2() { // from class: com.google.android.ti0
                        public final Object invoke(Object obj, Object obj2) {
                            return BasicTooltipKt.k(rg9Var, function2, cadVar13, bVar3, function5, z9, z7, z8, function3, i, i2, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i3 |= 100663296;
            z5 = true;
            if ((i3 & 38347923) != 38347922) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (dVarF.g(z6, i3 & 1)) {
                if (i5 != 0) {
                    bVar4 = androidx.compose.ui.b.INSTANCE;
                } else {
                    bVar4 = bVar2;
                }
                if (i7 != 0) {
                    function6 = null;
                } else {
                    function6 = function1;
                }
                if (i9 != 0) {
                    z4 = false;
                }
                if (i12 != 0) {
                    z10 = true;
                } else {
                    z10 = z2;
                }
                if (i14 != 0) {
                    z11 = false;
                } else {
                    z11 = z3;
                }
                if (e.k()) {
                    e.o(-1221877520, i3, -1, "androidx.compose.material3.internal.BasicTooltipBox (BasicTooltip.kt:103)");
                }
                objR = dVarF.R();
                companion = d.INSTANCE;
                if (objR == companion.a()) {
                    objR = vn3.k(EmptyCoroutineContext.a, dVarF);
                    dVarF.L(objR);
                }
                ta2Var = (ta2) objR;
                objR2 = dVarF.R();
                if (objR2 == companion.a()) {
                    objR2 = s0.e(Boolean.FALSE, null, 2, null);
                    dVarF.L(objR2);
                }
                o58Var = (o58) objR2;
                if (z11) {
                    z12 = false;
                } else {
                    z12 = false;
                }
                androidx.compose.ui.b.Companion companion114 = androidx.compose.ui.b.INSTANCE;
                ej7 ej7VarI12 = j.i(tc.INSTANCE.o(), false);
                iA = pp1.a(dVarF, 0);
                gs1 gs1VarJ12 = dVarF.j();
                androidx.compose.ui.b bVarE12 = ComposedModifierKt.e(dVarF, companion114);
                ComposeUiNode.Companion companion115 = ComposeUiNode.INSTANCE;
                boolean z11117 = z12;
                function0B = companion115.b();
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
                dud.i(dVarC, ej7VarI12, companion115.d());
                dud.i(dVarC, gs1VarJ12, companion115.f());
                function2C = companion115.c();
                if (dVarC.getInserting()) {
                    dVarC.L(Integer.valueOf(iA));
                    dVarC.e(Integer.valueOf(iA), function2C);
                } else {
                    dVarC.L(Integer.valueOf(iA));
                    dVarC.e(Integer.valueOf(iA), function2C);
                }
                dud.i(dVarC, bVarE12, companion115.e());
                BoxScopeInstance boxScopeInstance12 = BoxScopeInstance.a;
                if (cadVar.isVisible()) {
                    dVarF.y(-1891243071);
                    if (z4) {
                        z13 = true;
                    } else {
                        z13 = true;
                    }
                    Function2<? super d, ? super Integer, Unit> function18 = function4;
                    o58Var2 = o58Var;
                    l(rg9Var, cadVar, function6, ta2Var, z13, o58Var2, function18, dVarF, (i3 & 14) | i10 | ((i3 >> 3) & 112) | ((i3 >> 6) & 896) | ((i3 << 15) & 3670016));
                    dVarF = dVarF;
                    dVarF.u();
                } else {
                    o58Var2 = o58Var;
                    dVarF.y(-1890863476);
                    dVarF.u();
                }
                int i118 = ((i3 >> 18) & 14) | 384 | ((i3 >> 3) & 112) | ((i3 >> 12) & 7168) | (57344 & (i3 << 3)) | ((i3 >> 9) & 458752);
                cadVar2 = cadVar;
                boolean z11118 = z10;
                boolean z11119 = z11;
                bVar3 = bVar4;
                o(z11118, cadVar2, o58Var2, z11119, bVar3, function3, dVarF, i118, 0);
                dVarF.m();
                if ((i3 & 896) != 256) {
                    z5 = false;
                }
                objR3 = dVarF.R();
                if (z5) {
                    objR3 = new Function1() { // from class: com.google.android.si0
                        public final Object invoke(Object obj) {
                            return BasicTooltipKt.j(cadVar2, (kd3) obj);
                        }
                    };
                    dVarF.L(objR3);
                } else {
                    objR3 = new Function1() { // from class: com.google.android.si0
                        public final Object invoke(Object obj) {
                            return BasicTooltipKt.j(cadVar2, (kd3) obj);
                        }
                    };
                    dVarF.L(objR3);
                }
                vn3.c(cadVar2, (Function1) objR3, dVarF, (i3 >> 6) & 14);
                if (e.k()) {
                    e.n();
                }
                z7 = z11118;
                z8 = z11119;
                function5 = function6;
            } else {
                cadVar2 = cadVar;
                dVarF.q();
                z7 = z2;
                bVar3 = bVar2;
                function5 = function1;
                z8 = z3;
            }
            d dVar13 = dVarF;
            z9 = z4;
            s6bVarH = dVar13.H();
            if (s6bVarH != null) {
                final cad cadVar14 = cadVar2;
                s6bVarH.a(new Function2() { // from class: com.google.android.ti0
                    public final Object invoke(Object obj, Object obj2) {
                        return BasicTooltipKt.k(rg9Var, function2, cadVar14, bVar3, function5, z9, z7, z8, function3, i, i2, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i3 |= 3072;
        bVar2 = bVar;
        i7 = i2 & 16;
        if (i7 != 0) {
            if ((i & 24576) == 0) {
                function1 = function0;
                if (dVarF.T(function1)) {
                    i8 = 16384;
                } else {
                    i8 = 8192;
                }
                i3 |= i8;
            }
            i9 = i2 & 32;
            if (i9 != 0) {
                i3 |= 196608;
                i10 = 196608;
                z4 = z;
            } else {
                i10 = 196608;
                z4 = z;
                if ((i & 196608) == 0) {
                    if (dVarF.A(z4)) {
                        i11 = 131072;
                    } else {
                        i11 = 65536;
                    }
                    i3 |= i11;
                }
            }
            i12 = i2 & 64;
            if (i12 != 0) {
                i3 |= 1572864;
            } else if ((i & 1572864) == 0) {
                if (dVarF.A(z2)) {
                    i13 = 1048576;
                } else {
                    i13 = 524288;
                }
                i3 |= i13;
            }
            i14 = i2 & 128;
            if (i14 != 0) {
                i3 |= 12582912;
            } else if ((i & 12582912) == 0) {
                if (dVarF.A(z3)) {
                    i15 = 8388608;
                } else {
                    i15 = 4194304;
                }
                i3 |= i15;
            }
            if ((i2 & 256) != 0) {
                if ((i & 100663296) == 0) {
                    if (dVarF.T(function3)) {
                        i16 = 67108864;
                    } else {
                        i16 = 33554432;
                    }
                    i3 |= i16;
                }
                z5 = true;
                if ((i3 & 38347923) != 38347922) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (dVarF.g(z6, i3 & 1)) {
                    if (i5 != 0) {
                        bVar4 = androidx.compose.ui.b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    if (i7 != 0) {
                        function6 = null;
                    } else {
                        function6 = function1;
                    }
                    if (i9 != 0) {
                        z4 = false;
                    }
                    if (i12 != 0) {
                        z10 = true;
                    } else {
                        z10 = z2;
                    }
                    if (i14 != 0) {
                        z11 = false;
                    } else {
                        z11 = z3;
                    }
                    if (e.k()) {
                        e.o(-1221877520, i3, -1, "androidx.compose.material3.internal.BasicTooltipBox (BasicTooltip.kt:103)");
                    }
                    objR = dVarF.R();
                    companion = d.INSTANCE;
                    if (objR == companion.a()) {
                        objR = vn3.k(EmptyCoroutineContext.a, dVarF);
                        dVarF.L(objR);
                    }
                    ta2Var = (ta2) objR;
                    objR2 = dVarF.R();
                    if (objR2 == companion.a()) {
                        objR2 = s0.e(Boolean.FALSE, null, 2, null);
                        dVarF.L(objR2);
                    }
                    o58Var = (o58) objR2;
                    if (z11) {
                        z12 = false;
                    } else {
                        z12 = false;
                    }
                    androidx.compose.ui.b.Companion companion116 = androidx.compose.ui.b.INSTANCE;
                    ej7 ej7VarI13 = j.i(tc.INSTANCE.o(), false);
                    iA = pp1.a(dVarF, 0);
                    gs1 gs1VarJ13 = dVarF.j();
                    androidx.compose.ui.b bVarE13 = ComposedModifierKt.e(dVarF, companion116);
                    ComposeUiNode.Companion companion117 = ComposeUiNode.INSTANCE;
                    boolean z111110 = z12;
                    function0B = companion117.b();
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
                    dud.i(dVarC, ej7VarI13, companion117.d());
                    dud.i(dVarC, gs1VarJ13, companion117.f());
                    function2C = companion117.c();
                    if (dVarC.getInserting()) {
                        dVarC.L(Integer.valueOf(iA));
                        dVarC.e(Integer.valueOf(iA), function2C);
                    } else {
                        dVarC.L(Integer.valueOf(iA));
                        dVarC.e(Integer.valueOf(iA), function2C);
                    }
                    dud.i(dVarC, bVarE13, companion117.e());
                    BoxScopeInstance boxScopeInstance13 = BoxScopeInstance.a;
                    if (cadVar.isVisible()) {
                        dVarF.y(-1891243071);
                        if (z4) {
                            z13 = true;
                        } else {
                            z13 = true;
                        }
                        Function2<? super d, ? super Integer, Unit> function19 = function4;
                        o58Var2 = o58Var;
                        l(rg9Var, cadVar, function6, ta2Var, z13, o58Var2, function19, dVarF, (i3 & 14) | i10 | ((i3 >> 3) & 112) | ((i3 >> 6) & 896) | ((i3 << 15) & 3670016));
                        dVarF = dVarF;
                        dVarF.u();
                    } else {
                        o58Var2 = o58Var;
                        dVarF.y(-1890863476);
                        dVarF.u();
                    }
                    int i119 = ((i3 >> 18) & 14) | 384 | ((i3 >> 3) & 112) | ((i3 >> 12) & 7168) | (57344 & (i3 << 3)) | ((i3 >> 9) & 458752);
                    cadVar2 = cadVar;
                    boolean z111111 = z10;
                    boolean z111112 = z11;
                    bVar3 = bVar4;
                    o(z111111, cadVar2, o58Var2, z111112, bVar3, function3, dVarF, i119, 0);
                    dVarF.m();
                    if ((i3 & 896) != 256) {
                        z5 = false;
                    }
                    objR3 = dVarF.R();
                    if (z5) {
                        objR3 = new Function1() { // from class: com.google.android.si0
                            public final Object invoke(Object obj) {
                                return BasicTooltipKt.j(cadVar2, (kd3) obj);
                            }
                        };
                        dVarF.L(objR3);
                    } else {
                        objR3 = new Function1() { // from class: com.google.android.si0
                            public final Object invoke(Object obj) {
                                return BasicTooltipKt.j(cadVar2, (kd3) obj);
                            }
                        };
                        dVarF.L(objR3);
                    }
                    vn3.c(cadVar2, (Function1) objR3, dVarF, (i3 >> 6) & 14);
                    if (e.k()) {
                        e.n();
                    }
                    z7 = z111111;
                    z8 = z111112;
                    function5 = function6;
                } else {
                    cadVar2 = cadVar;
                    dVarF.q();
                    z7 = z2;
                    bVar3 = bVar2;
                    function5 = function1;
                    z8 = z3;
                }
                d dVar14 = dVarF;
                z9 = z4;
                s6bVarH = dVar14.H();
                if (s6bVarH != null) {
                    final cad cadVar15 = cadVar2;
                    s6bVarH.a(new Function2() { // from class: com.google.android.ti0
                        public final Object invoke(Object obj, Object obj2) {
                            return BasicTooltipKt.k(rg9Var, function2, cadVar15, bVar3, function5, z9, z7, z8, function3, i, i2, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i3 |= 100663296;
            z5 = true;
            if ((i3 & 38347923) != 38347922) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (dVarF.g(z6, i3 & 1)) {
                if (i5 != 0) {
                    bVar4 = androidx.compose.ui.b.INSTANCE;
                } else {
                    bVar4 = bVar2;
                }
                if (i7 != 0) {
                    function6 = null;
                } else {
                    function6 = function1;
                }
                if (i9 != 0) {
                    z4 = false;
                }
                if (i12 != 0) {
                    z10 = true;
                } else {
                    z10 = z2;
                }
                if (i14 != 0) {
                    z11 = false;
                } else {
                    z11 = z3;
                }
                if (e.k()) {
                    e.o(-1221877520, i3, -1, "androidx.compose.material3.internal.BasicTooltipBox (BasicTooltip.kt:103)");
                }
                objR = dVarF.R();
                companion = d.INSTANCE;
                if (objR == companion.a()) {
                    objR = vn3.k(EmptyCoroutineContext.a, dVarF);
                    dVarF.L(objR);
                }
                ta2Var = (ta2) objR;
                objR2 = dVarF.R();
                if (objR2 == companion.a()) {
                    objR2 = s0.e(Boolean.FALSE, null, 2, null);
                    dVarF.L(objR2);
                }
                o58Var = (o58) objR2;
                if (z11) {
                    z12 = false;
                } else {
                    z12 = false;
                }
                androidx.compose.ui.b.Companion companion118 = androidx.compose.ui.b.INSTANCE;
                ej7 ej7VarI14 = j.i(tc.INSTANCE.o(), false);
                iA = pp1.a(dVarF, 0);
                gs1 gs1VarJ14 = dVarF.j();
                androidx.compose.ui.b bVarE14 = ComposedModifierKt.e(dVarF, companion118);
                ComposeUiNode.Companion companion119 = ComposeUiNode.INSTANCE;
                boolean z111113 = z12;
                function0B = companion119.b();
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
                dud.i(dVarC, ej7VarI14, companion119.d());
                dud.i(dVarC, gs1VarJ14, companion119.f());
                function2C = companion119.c();
                if (dVarC.getInserting()) {
                    dVarC.L(Integer.valueOf(iA));
                    dVarC.e(Integer.valueOf(iA), function2C);
                } else {
                    dVarC.L(Integer.valueOf(iA));
                    dVarC.e(Integer.valueOf(iA), function2C);
                }
                dud.i(dVarC, bVarE14, companion119.e());
                BoxScopeInstance boxScopeInstance14 = BoxScopeInstance.a;
                if (cadVar.isVisible()) {
                    dVarF.y(-1891243071);
                    if (z4) {
                        z13 = true;
                    } else {
                        z13 = true;
                    }
                    Function2<? super d, ? super Integer, Unit> function110 = function4;
                    o58Var2 = o58Var;
                    l(rg9Var, cadVar, function6, ta2Var, z13, o58Var2, function110, dVarF, (i3 & 14) | i10 | ((i3 >> 3) & 112) | ((i3 >> 6) & 896) | ((i3 << 15) & 3670016));
                    dVarF = dVarF;
                    dVarF.u();
                } else {
                    o58Var2 = o58Var;
                    dVarF.y(-1890863476);
                    dVarF.u();
                }
                int i1110 = ((i3 >> 18) & 14) | 384 | ((i3 >> 3) & 112) | ((i3 >> 12) & 7168) | (57344 & (i3 << 3)) | ((i3 >> 9) & 458752);
                cadVar2 = cadVar;
                boolean z111114 = z10;
                boolean z111115 = z11;
                bVar3 = bVar4;
                o(z111114, cadVar2, o58Var2, z111115, bVar3, function3, dVarF, i1110, 0);
                dVarF.m();
                if ((i3 & 896) != 256) {
                    z5 = false;
                }
                objR3 = dVarF.R();
                if (z5) {
                    objR3 = new Function1() { // from class: com.google.android.si0
                        public final Object invoke(Object obj) {
                            return BasicTooltipKt.j(cadVar2, (kd3) obj);
                        }
                    };
                    dVarF.L(objR3);
                } else {
                    objR3 = new Function1() { // from class: com.google.android.si0
                        public final Object invoke(Object obj) {
                            return BasicTooltipKt.j(cadVar2, (kd3) obj);
                        }
                    };
                    dVarF.L(objR3);
                }
                vn3.c(cadVar2, (Function1) objR3, dVarF, (i3 >> 6) & 14);
                if (e.k()) {
                    e.n();
                }
                z7 = z111114;
                z8 = z111115;
                function5 = function6;
            } else {
                cadVar2 = cadVar;
                dVarF.q();
                z7 = z2;
                bVar3 = bVar2;
                function5 = function1;
                z8 = z3;
            }
            d dVar15 = dVarF;
            z9 = z4;
            s6bVarH = dVar15.H();
            if (s6bVarH != null) {
                final cad cadVar16 = cadVar2;
                s6bVarH.a(new Function2() { // from class: com.google.android.ti0
                    public final Object invoke(Object obj, Object obj2) {
                        return BasicTooltipKt.k(rg9Var, function2, cadVar16, bVar3, function5, z9, z7, z8, function3, i, i2, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i3 |= 24576;
        function1 = function0;
        i9 = i2 & 32;
        if (i9 != 0) {
            i3 |= 196608;
            i10 = 196608;
            z4 = z;
        } else {
            i10 = 196608;
            z4 = z;
            if ((i & 196608) == 0) {
                if (dVarF.A(z4)) {
                    i11 = 131072;
                } else {
                    i11 = 65536;
                }
                i3 |= i11;
            }
        }
        i12 = i2 & 64;
        if (i12 != 0) {
            i3 |= 1572864;
        } else if ((i & 1572864) == 0) {
            if (dVarF.A(z2)) {
                i13 = 1048576;
            } else {
                i13 = 524288;
            }
            i3 |= i13;
        }
        i14 = i2 & 128;
        if (i14 != 0) {
            i3 |= 12582912;
        } else if ((i & 12582912) == 0) {
            if (dVarF.A(z3)) {
                i15 = 8388608;
            } else {
                i15 = 4194304;
            }
            i3 |= i15;
        }
        if ((i2 & 256) != 0) {
            if ((i & 100663296) == 0) {
                if (dVarF.T(function3)) {
                    i16 = 67108864;
                } else {
                    i16 = 33554432;
                }
                i3 |= i16;
            }
            z5 = true;
            if ((i3 & 38347923) != 38347922) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (dVarF.g(z6, i3 & 1)) {
                if (i5 != 0) {
                    bVar4 = androidx.compose.ui.b.INSTANCE;
                } else {
                    bVar4 = bVar2;
                }
                if (i7 != 0) {
                    function6 = null;
                } else {
                    function6 = function1;
                }
                if (i9 != 0) {
                    z4 = false;
                }
                if (i12 != 0) {
                    z10 = true;
                } else {
                    z10 = z2;
                }
                if (i14 != 0) {
                    z11 = false;
                } else {
                    z11 = z3;
                }
                if (e.k()) {
                    e.o(-1221877520, i3, -1, "androidx.compose.material3.internal.BasicTooltipBox (BasicTooltip.kt:103)");
                }
                objR = dVarF.R();
                companion = d.INSTANCE;
                if (objR == companion.a()) {
                    objR = vn3.k(EmptyCoroutineContext.a, dVarF);
                    dVarF.L(objR);
                }
                ta2Var = (ta2) objR;
                objR2 = dVarF.R();
                if (objR2 == companion.a()) {
                    objR2 = s0.e(Boolean.FALSE, null, 2, null);
                    dVarF.L(objR2);
                }
                o58Var = (o58) objR2;
                if (z11) {
                    z12 = false;
                } else {
                    z12 = false;
                }
                androidx.compose.ui.b.Companion companion1110 = androidx.compose.ui.b.INSTANCE;
                ej7 ej7VarI15 = j.i(tc.INSTANCE.o(), false);
                iA = pp1.a(dVarF, 0);
                gs1 gs1VarJ15 = dVarF.j();
                androidx.compose.ui.b bVarE15 = ComposedModifierKt.e(dVarF, companion1110);
                ComposeUiNode.Companion companion1111 = ComposeUiNode.INSTANCE;
                boolean z111116 = z12;
                function0B = companion1111.b();
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
                dud.i(dVarC, ej7VarI15, companion1111.d());
                dud.i(dVarC, gs1VarJ15, companion1111.f());
                function2C = companion1111.c();
                if (dVarC.getInserting()) {
                    dVarC.L(Integer.valueOf(iA));
                    dVarC.e(Integer.valueOf(iA), function2C);
                } else {
                    dVarC.L(Integer.valueOf(iA));
                    dVarC.e(Integer.valueOf(iA), function2C);
                }
                dud.i(dVarC, bVarE15, companion1111.e());
                BoxScopeInstance boxScopeInstance15 = BoxScopeInstance.a;
                if (cadVar.isVisible()) {
                    dVarF.y(-1891243071);
                    if (z4) {
                        z13 = true;
                    } else {
                        z13 = true;
                    }
                    Function2<? super d, ? super Integer, Unit> function111 = function4;
                    o58Var2 = o58Var;
                    l(rg9Var, cadVar, function6, ta2Var, z13, o58Var2, function111, dVarF, (i3 & 14) | i10 | ((i3 >> 3) & 112) | ((i3 >> 6) & 896) | ((i3 << 15) & 3670016));
                    dVarF = dVarF;
                    dVarF.u();
                } else {
                    o58Var2 = o58Var;
                    dVarF.y(-1890863476);
                    dVarF.u();
                }
                int i1111 = ((i3 >> 18) & 14) | 384 | ((i3 >> 3) & 112) | ((i3 >> 12) & 7168) | (57344 & (i3 << 3)) | ((i3 >> 9) & 458752);
                cadVar2 = cadVar;
                boolean z111117 = z10;
                boolean z111118 = z11;
                bVar3 = bVar4;
                o(z111117, cadVar2, o58Var2, z111118, bVar3, function3, dVarF, i1111, 0);
                dVarF.m();
                if ((i3 & 896) != 256) {
                    z5 = false;
                }
                objR3 = dVarF.R();
                if (z5) {
                    objR3 = new Function1() { // from class: com.google.android.si0
                        public final Object invoke(Object obj) {
                            return BasicTooltipKt.j(cadVar2, (kd3) obj);
                        }
                    };
                    dVarF.L(objR3);
                } else {
                    objR3 = new Function1() { // from class: com.google.android.si0
                        public final Object invoke(Object obj) {
                            return BasicTooltipKt.j(cadVar2, (kd3) obj);
                        }
                    };
                    dVarF.L(objR3);
                }
                vn3.c(cadVar2, (Function1) objR3, dVarF, (i3 >> 6) & 14);
                if (e.k()) {
                    e.n();
                }
                z7 = z111117;
                z8 = z111118;
                function5 = function6;
            } else {
                cadVar2 = cadVar;
                dVarF.q();
                z7 = z2;
                bVar3 = bVar2;
                function5 = function1;
                z8 = z3;
            }
            d dVar16 = dVarF;
            z9 = z4;
            s6bVarH = dVar16.H();
            if (s6bVarH != null) {
                final cad cadVar17 = cadVar2;
                s6bVarH.a(new Function2() { // from class: com.google.android.ti0
                    public final Object invoke(Object obj, Object obj2) {
                        return BasicTooltipKt.k(rg9Var, function2, cadVar17, bVar3, function5, z9, z7, z8, function3, i, i2, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i3 |= 100663296;
        z5 = true;
        if ((i3 & 38347923) != 38347922) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (dVarF.g(z6, i3 & 1)) {
            if (i5 != 0) {
                bVar4 = androidx.compose.ui.b.INSTANCE;
            } else {
                bVar4 = bVar2;
            }
            if (i7 != 0) {
                function6 = null;
            } else {
                function6 = function1;
            }
            if (i9 != 0) {
                z4 = false;
            }
            if (i12 != 0) {
                z10 = true;
            } else {
                z10 = z2;
            }
            if (i14 != 0) {
                z11 = false;
            } else {
                z11 = z3;
            }
            if (e.k()) {
                e.o(-1221877520, i3, -1, "androidx.compose.material3.internal.BasicTooltipBox (BasicTooltip.kt:103)");
            }
            objR = dVarF.R();
            companion = d.INSTANCE;
            if (objR == companion.a()) {
                objR = vn3.k(EmptyCoroutineContext.a, dVarF);
                dVarF.L(objR);
            }
            ta2Var = (ta2) objR;
            objR2 = dVarF.R();
            if (objR2 == companion.a()) {
                objR2 = s0.e(Boolean.FALSE, null, 2, null);
                dVarF.L(objR2);
            }
            o58Var = (o58) objR2;
            if (z11) {
                z12 = false;
            } else {
                z12 = false;
            }
            androidx.compose.ui.b.Companion companion1112 = androidx.compose.ui.b.INSTANCE;
            ej7 ej7VarI16 = j.i(tc.INSTANCE.o(), false);
            iA = pp1.a(dVarF, 0);
            gs1 gs1VarJ16 = dVarF.j();
            androidx.compose.ui.b bVarE16 = ComposedModifierKt.e(dVarF, companion1112);
            ComposeUiNode.Companion companion1113 = ComposeUiNode.INSTANCE;
            boolean z111119 = z12;
            function0B = companion1113.b();
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
            dud.i(dVarC, ej7VarI16, companion1113.d());
            dud.i(dVarC, gs1VarJ16, companion1113.f());
            function2C = companion1113.c();
            if (dVarC.getInserting()) {
                dVarC.L(Integer.valueOf(iA));
                dVarC.e(Integer.valueOf(iA), function2C);
            } else {
                dVarC.L(Integer.valueOf(iA));
                dVarC.e(Integer.valueOf(iA), function2C);
            }
            dud.i(dVarC, bVarE16, companion1113.e());
            BoxScopeInstance boxScopeInstance16 = BoxScopeInstance.a;
            if (cadVar.isVisible()) {
                dVarF.y(-1891243071);
                if (z4) {
                    z13 = true;
                } else {
                    z13 = true;
                }
                Function2<? super d, ? super Integer, Unit> function112 = function4;
                o58Var2 = o58Var;
                l(rg9Var, cadVar, function6, ta2Var, z13, o58Var2, function112, dVarF, (i3 & 14) | i10 | ((i3 >> 3) & 112) | ((i3 >> 6) & 896) | ((i3 << 15) & 3670016));
                dVarF = dVarF;
                dVarF.u();
            } else {
                o58Var2 = o58Var;
                dVarF.y(-1890863476);
                dVarF.u();
            }
            int i1112 = ((i3 >> 18) & 14) | 384 | ((i3 >> 3) & 112) | ((i3 >> 12) & 7168) | (57344 & (i3 << 3)) | ((i3 >> 9) & 458752);
            cadVar2 = cadVar;
            boolean z1111110 = z10;
            boolean z1111111 = z11;
            bVar3 = bVar4;
            o(z1111110, cadVar2, o58Var2, z1111111, bVar3, function3, dVarF, i1112, 0);
            dVarF.m();
            if ((i3 & 896) != 256) {
                z5 = false;
            }
            objR3 = dVarF.R();
            if (z5) {
                objR3 = new Function1() { // from class: com.google.android.si0
                    public final Object invoke(Object obj) {
                        return BasicTooltipKt.j(cadVar2, (kd3) obj);
                    }
                };
                dVarF.L(objR3);
            } else {
                objR3 = new Function1() { // from class: com.google.android.si0
                    public final Object invoke(Object obj) {
                        return BasicTooltipKt.j(cadVar2, (kd3) obj);
                    }
                };
                dVarF.L(objR3);
            }
            vn3.c(cadVar2, (Function1) objR3, dVarF, (i3 >> 6) & 14);
            if (e.k()) {
                e.n();
            }
            z7 = z1111110;
            z8 = z1111111;
            function5 = function6;
        } else {
            cadVar2 = cadVar;
            dVarF.q();
            z7 = z2;
            bVar3 = bVar2;
            function5 = function1;
            z8 = z3;
        }
        d dVar17 = dVarF;
        z9 = z4;
        s6bVarH = dVar17.H();
        if (s6bVarH != null) {
            final cad cadVar18 = cadVar2;
            s6bVarH.a(new Function2() { // from class: com.google.android.ti0
                public final Object invoke(Object obj, Object obj2) {
                    return BasicTooltipKt.k(rg9Var, function2, cadVar18, bVar3, function5, z9, z7, z8, function3, i, i2, (d) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jd3 j(cad cadVar, kd3 kd3Var) {
        return new a(cadVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(rg9 rg9Var, Function2 function2, cad cadVar, androidx.compose.ui.b bVar, Function0 function0, boolean z, boolean z2, boolean z3, Function2 function3, int i, int i2, d dVar, int i3) {
        i(rg9Var, function2, cadVar, bVar, function0, z, z2, z3, function3, dVar, saa.a(i | 1), i2);
        return Unit.a;
    }

    private static final void l(final rg9 rg9Var, final cad cadVar, final Function0<Unit> function0, final ta2 ta2Var, final boolean z, final o58<Boolean> o58Var, final Function2<? super d, ? super Integer, Unit> function2, d dVar, final int i) {
        int i2;
        d dVarF = dVar.F(-1413720282);
        if ((i & 6) == 0) {
            i2 = (dVarF.x(rg9Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? dVarF.x(cadVar) : dVarF.T(cadVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= dVarF.T(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= dVarF.T(ta2Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= dVarF.A(z) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= dVarF.x(o58Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= dVarF.T(function2) ? 1048576 : 524288;
        }
        if (dVarF.g((599187 & i2) != 599186, i2 & 1)) {
            if (e.k()) {
                e.o(-1413720282, i2, -1, "androidx.compose.material3.internal.TooltipPopup (BasicTooltip.kt:169)");
            }
            String strA = aj0.a.a(dVarF, 6);
            boolean zT = ((i2 & 896) == 256) | ((i2 & 112) == 32 || ((i2 & 64) != 0 && dVarF.T(cadVar))) | dVarF.T(ta2Var) | ((458752 & i2) == 131072);
            Object objR = dVarF.R();
            if (zT || objR == d.INSTANCE.a()) {
                objR = new Function0() { // from class: com.google.android.ui0
                    public final Object invoke() {
                        return BasicTooltipKt.n(function0, cadVar, ta2Var, o58Var);
                    }
                };
                dVarF.L(objR);
            }
            AndroidPopup_androidKt.a(rg9Var, (Function0) objR, new sg9(z, false, false, false, 14, (DefaultConstructorMarker) null), ko1.e(-1287705660, true, new b(strA, function2), dVarF, 54), dVarF, (i2 & 14) | 3072, 0);
            if (e.k()) {
                e.n();
            }
        } else {
            dVarF.q();
        }
        s6b s6bVarH = dVarF.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2() { // from class: com.google.android.vi0
                public final Object invoke(Object obj, Object obj2) {
                    return BasicTooltipKt.m(rg9Var, cadVar, function0, ta2Var, z, o58Var, function2, i, (d) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(rg9 rg9Var, cad cadVar, Function0 function0, ta2 ta2Var, boolean z, o58 o58Var, Function2 function2, int i, d dVar, int i2) {
        l(rg9Var, cadVar, function0, ta2Var, z, o58Var, function2, dVar, saa.a(i | 1));
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n(Function0 function0, cad cadVar, ta2 ta2Var, o58 o58Var) {
        if (function0 != null) {
            function0.invoke();
        } else if (cadVar.isVisible()) {
            rw0.d(ta2Var, (CoroutineContext) null, (CoroutineStart) null, new BasicTooltipKt$TooltipPopup$1$1$1(cadVar, null), 3, (Object) null);
            o58Var.setValue(Boolean.FALSE);
        }
        return Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x019b  */
    /* JADX WARN: Code duplicated, block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x007e  */
    /* JADX WARN: Code duplicated, block: B:51:0x0083  */
    /* JADX WARN: Code duplicated, block: B:53:0x0087  */
    /* JADX WARN: Code duplicated, block: B:55:0x008f  */
    /* JADX WARN: Code duplicated, block: B:56:0x0092  */
    /* JADX WARN: Code duplicated, block: B:60:0x009b  */
    /* JADX WARN: Code duplicated, block: B:62:0x009e  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:66:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:71:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:72:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:79:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:85:0x0124  */
    /* JADX WARN: Code duplicated, block: B:88:0x0130  */
    /* JADX WARN: Code duplicated, block: B:89:0x0134  */
    /* JADX WARN: Code duplicated, block: B:92:0x0153  */
    /* JADX WARN: Code duplicated, block: B:94:0x0161  */
    /* JADX WARN: Code duplicated, block: B:97:0x018c  */
    /* JADX WARN: Code duplicated, block: B:99:0x0191  */
    private static final void o(final boolean z, final cad cadVar, final o58<Boolean> o58Var, final boolean z2, androidx.compose.ui.b bVar, final Function2<? super d, ? super Integer, Unit> function2, d dVar, final int i, final int i2) {
        int i3;
        o58<Boolean> o58Var2;
        boolean z3;
        int i4;
        androidx.compose.ui.b bVar2;
        int i5;
        int i6;
        int i7;
        boolean z4;
        final androidx.compose.ui.b bVar3;
        s6b s6bVarH;
        Object objR;
        int iA;
        Function0<ComposeUiNode> function0B;
        d dVarC;
        Function2<ComposeUiNode, Integer, Unit> function2C;
        d dVarF = dVar.F(1873232064);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (dVarF.A(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? dVarF.x(cadVar) : dVarF.T(cadVar) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
            o58Var2 = o58Var;
        } else {
            o58Var2 = o58Var;
            if ((i & 384) == 0) {
                i3 |= dVarF.x(o58Var2) ? 256 : 128;
            }
        }
        if ((i2 & 8) == 0) {
            if ((i & 3072) == 0) {
                z3 = z2;
                i3 |= dVarF.A(z3) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 != 0) {
                if ((i & 24576) == 0) {
                    bVar2 = bVar;
                    if (dVarF.x(bVar2)) {
                        i5 = 16384;
                    } else {
                        i5 = 8192;
                    }
                    i3 |= i5;
                }
                if ((i2 & 32) != 0) {
                    i3 |= 196608;
                } else if ((i & 196608) == 0) {
                    if (dVarF.T(function2)) {
                        i6 = 131072;
                    } else {
                        i6 = 65536;
                    }
                    i3 |= i6;
                }
                i7 = i3;
                if ((74899 & i7) != 74898) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (dVarF.g(z4, i7 & 1)) {
                    if (i4 != 0) {
                        bVar2 = androidx.compose.ui.b.INSTANCE;
                    }
                    if (e.k()) {
                        e.o(1873232064, i7, -1, "androidx.compose.material3.internal.WrappedAnchor (BasicTooltip.kt:146)");
                    }
                    objR = dVarF.R();
                    if (objR == d.INSTANCE.a()) {
                        objR = vn3.k(EmptyCoroutineContext.a, dVarF);
                        dVarF.L(objR);
                    }
                    ta2 ta2Var = (ta2) objR;
                    androidx.compose.ui.b bVarU = u(q(t(bVar2, z, cadVar), aj0.a.b(dVarF, 6), z, cadVar, ta2Var), z, cadVar, ta2Var, z3, o58Var2);
                    ej7 ej7VarI = j.i(tc.INSTANCE.o(), false);
                    iA = pp1.a(dVarF, 0);
                    gs1 gs1VarJ = dVarF.j();
                    androidx.compose.ui.b bVarE = ComposedModifierKt.e(dVarF, bVarU);
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    function0B = companion.b();
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
                    dud.i(dVarC, ej7VarI, companion.d());
                    dud.i(dVarC, gs1VarJ, companion.f());
                    function2C = companion.c();
                    if (dVarC.getInserting() || !Intrinsics.e(dVarC.R(), Integer.valueOf(iA))) {
                        dVarC.L(Integer.valueOf(iA));
                        dVarC.e(Integer.valueOf(iA), function2C);
                    }
                    dud.i(dVarC, bVarE, companion.e());
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.a;
                    function2.invoke(dVarF, Integer.valueOf((i7 >> 15) & 14));
                    dVarF.m();
                    if (e.k()) {
                        e.n();
                    }
                } else {
                    dVarF.q();
                }
                bVar3 = bVar2;
                s6bVarH = dVarF.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.wi0
                        public final Object invoke(Object obj, Object obj2) {
                            return BasicTooltipKt.p(z, cadVar, o58Var, z2, bVar3, function2, i, i2, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i3 |= 24576;
            bVar2 = bVar;
            if ((i2 & 32) != 0) {
                i3 |= 196608;
            } else if ((i & 196608) == 0) {
                if (dVarF.T(function2)) {
                    i6 = 131072;
                } else {
                    i6 = 65536;
                }
                i3 |= i6;
            }
            i7 = i3;
            if ((74899 & i7) != 74898) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (dVarF.g(z4, i7 & 1)) {
                if (i4 != 0) {
                    bVar2 = androidx.compose.ui.b.INSTANCE;
                }
                if (e.k()) {
                    e.o(1873232064, i7, -1, "androidx.compose.material3.internal.WrappedAnchor (BasicTooltip.kt:146)");
                }
                objR = dVarF.R();
                if (objR == d.INSTANCE.a()) {
                    objR = vn3.k(EmptyCoroutineContext.a, dVarF);
                    dVarF.L(objR);
                }
                ta2 ta2Var2 = (ta2) objR;
                androidx.compose.ui.b bVarU2 = u(q(t(bVar2, z, cadVar), aj0.a.b(dVarF, 6), z, cadVar, ta2Var2), z, cadVar, ta2Var2, z3, o58Var2);
                ej7 ej7VarI2 = j.i(tc.INSTANCE.o(), false);
                iA = pp1.a(dVarF, 0);
                gs1 gs1VarJ2 = dVarF.j();
                androidx.compose.ui.b bVarE2 = ComposedModifierKt.e(dVarF, bVarU2);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
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
                dud.i(dVarC, ej7VarI2, companion2.d());
                dud.i(dVarC, gs1VarJ2, companion2.f());
                function2C = companion2.c();
                if (dVarC.getInserting()) {
                    dVarC.L(Integer.valueOf(iA));
                    dVarC.e(Integer.valueOf(iA), function2C);
                } else {
                    dVarC.L(Integer.valueOf(iA));
                    dVarC.e(Integer.valueOf(iA), function2C);
                }
                dud.i(dVarC, bVarE2, companion2.e());
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.a;
                function2.invoke(dVarF, Integer.valueOf((i7 >> 15) & 14));
                dVarF.m();
                if (e.k()) {
                    e.n();
                }
            } else {
                dVarF.q();
            }
            bVar3 = bVar2;
            s6bVarH = dVarF.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.wi0
                    public final Object invoke(Object obj, Object obj2) {
                        return BasicTooltipKt.p(z, cadVar, o58Var, z2, bVar3, function2, i, i2, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i3 |= 3072;
        z3 = z2;
        i4 = i2 & 16;
        if (i4 != 0) {
            if ((i & 24576) == 0) {
                bVar2 = bVar;
                if (dVarF.x(bVar2)) {
                    i5 = 16384;
                } else {
                    i5 = 8192;
                }
                i3 |= i5;
            }
            if ((i2 & 32) != 0) {
                i3 |= 196608;
            } else if ((i & 196608) == 0) {
                if (dVarF.T(function2)) {
                    i6 = 131072;
                } else {
                    i6 = 65536;
                }
                i3 |= i6;
            }
            i7 = i3;
            if ((74899 & i7) != 74898) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (dVarF.g(z4, i7 & 1)) {
                if (i4 != 0) {
                    bVar2 = androidx.compose.ui.b.INSTANCE;
                }
                if (e.k()) {
                    e.o(1873232064, i7, -1, "androidx.compose.material3.internal.WrappedAnchor (BasicTooltip.kt:146)");
                }
                objR = dVarF.R();
                if (objR == d.INSTANCE.a()) {
                    objR = vn3.k(EmptyCoroutineContext.a, dVarF);
                    dVarF.L(objR);
                }
                ta2 ta2Var3 = (ta2) objR;
                androidx.compose.ui.b bVarU3 = u(q(t(bVar2, z, cadVar), aj0.a.b(dVarF, 6), z, cadVar, ta2Var3), z, cadVar, ta2Var3, z3, o58Var2);
                ej7 ej7VarI3 = j.i(tc.INSTANCE.o(), false);
                iA = pp1.a(dVarF, 0);
                gs1 gs1VarJ3 = dVarF.j();
                androidx.compose.ui.b bVarE3 = ComposedModifierKt.e(dVarF, bVarU3);
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                function0B = companion3.b();
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
                dud.i(dVarC, ej7VarI3, companion3.d());
                dud.i(dVarC, gs1VarJ3, companion3.f());
                function2C = companion3.c();
                if (dVarC.getInserting()) {
                    dVarC.L(Integer.valueOf(iA));
                    dVarC.e(Integer.valueOf(iA), function2C);
                } else {
                    dVarC.L(Integer.valueOf(iA));
                    dVarC.e(Integer.valueOf(iA), function2C);
                }
                dud.i(dVarC, bVarE3, companion3.e());
                BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.a;
                function2.invoke(dVarF, Integer.valueOf((i7 >> 15) & 14));
                dVarF.m();
                if (e.k()) {
                    e.n();
                }
            } else {
                dVarF.q();
            }
            bVar3 = bVar2;
            s6bVarH = dVarF.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.wi0
                    public final Object invoke(Object obj, Object obj2) {
                        return BasicTooltipKt.p(z, cadVar, o58Var, z2, bVar3, function2, i, i2, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i3 |= 24576;
        bVar2 = bVar;
        if ((i2 & 32) != 0) {
            i3 |= 196608;
        } else if ((i & 196608) == 0) {
            if (dVarF.T(function2)) {
                i6 = 131072;
            } else {
                i6 = 65536;
            }
            i3 |= i6;
        }
        i7 = i3;
        if ((74899 & i7) != 74898) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (dVarF.g(z4, i7 & 1)) {
            if (i4 != 0) {
                bVar2 = androidx.compose.ui.b.INSTANCE;
            }
            if (e.k()) {
                e.o(1873232064, i7, -1, "androidx.compose.material3.internal.WrappedAnchor (BasicTooltip.kt:146)");
            }
            objR = dVarF.R();
            if (objR == d.INSTANCE.a()) {
                objR = vn3.k(EmptyCoroutineContext.a, dVarF);
                dVarF.L(objR);
            }
            ta2 ta2Var4 = (ta2) objR;
            androidx.compose.ui.b bVarU4 = u(q(t(bVar2, z, cadVar), aj0.a.b(dVarF, 6), z, cadVar, ta2Var4), z, cadVar, ta2Var4, z3, o58Var2);
            ej7 ej7VarI4 = j.i(tc.INSTANCE.o(), false);
            iA = pp1.a(dVarF, 0);
            gs1 gs1VarJ4 = dVarF.j();
            androidx.compose.ui.b bVarE4 = ComposedModifierKt.e(dVarF, bVarU4);
            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
            function0B = companion4.b();
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
            dud.i(dVarC, ej7VarI4, companion4.d());
            dud.i(dVarC, gs1VarJ4, companion4.f());
            function2C = companion4.c();
            if (dVarC.getInserting()) {
                dVarC.L(Integer.valueOf(iA));
                dVarC.e(Integer.valueOf(iA), function2C);
            } else {
                dVarC.L(Integer.valueOf(iA));
                dVarC.e(Integer.valueOf(iA), function2C);
            }
            dud.i(dVarC, bVarE4, companion4.e());
            BoxScopeInstance boxScopeInstance4 = BoxScopeInstance.a;
            function2.invoke(dVarF, Integer.valueOf((i7 >> 15) & 14));
            dVarF.m();
            if (e.k()) {
                e.n();
            }
        } else {
            dVarF.q();
        }
        bVar3 = bVar2;
        s6bVarH = dVarF.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2() { // from class: com.google.android.wi0
                public final Object invoke(Object obj, Object obj2) {
                    return BasicTooltipKt.p(z, cadVar, o58Var, z2, bVar3, function2, i, i2, (d) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p(boolean z, cad cadVar, o58 o58Var, boolean z2, androidx.compose.ui.b bVar, Function2 function2, int i, int i2, d dVar, int i3) {
        o(z, cadVar, o58Var, z2, bVar, function2, dVar, saa.a(i | 1), i2);
        return Unit.a;
    }

    private static final androidx.compose.ui.b q(androidx.compose.ui.b bVar, final String str, boolean z, final cad cadVar, final ta2 ta2Var) {
        return z ? va1.e(bVar, new Function1() { // from class: com.google.android.yi0
            public final Object invoke(Object obj) {
                return BasicTooltipKt.r(str, ta2Var, cadVar, (nfb) obj);
            }
        }) : bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r(String str, final ta2 ta2Var, final cad cadVar, nfb nfbVar) {
        SemanticsPropertiesKt.C(nfbVar, str, new Function0() { // from class: com.google.android.zi0
            public final Object invoke() {
                return Boolean.valueOf(BasicTooltipKt.s(ta2Var, cadVar));
            }
        });
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean s(ta2 ta2Var, cad cadVar) {
        rw0.d(ta2Var, (CoroutineContext) null, (CoroutineStart) null, new BasicTooltipKt$anchorSemantics$1$1$1(cadVar, null), 3, (Object) null);
        return true;
    }

    private static final androidx.compose.ui.b t(androidx.compose.ui.b bVar, boolean z, final cad cadVar) {
        return z ? ugc.c(ugc.c(bVar, cadVar, new PointerInputEventHandler() { // from class: androidx.compose.material3.internal.BasicTooltipKt$handleGestures$1

            /* JADX INFO: renamed from: androidx.compose.material3.internal.BasicTooltipKt$handleGestures$1$1, reason: invalid class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/ta2;", "", "<anonymous>", "(Lcom/google/android/ta2;)V"}, k = 3, mv = {2, 0, 0})
            @lq2(c = "androidx.compose.material3.internal.BasicTooltipKt$handleGestures$1$1", f = "BasicTooltip.kt", l = {203}, m = "invokeSuspend")
            static final class AnonymousClass1 extends SuspendLambda implements Function2<ta2, q22<? super Unit>, Object> {
                final /* synthetic */ cad $state;
                final /* synthetic */ df9 $this_pointerInput;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX INFO: renamed from: androidx.compose.material3.internal.BasicTooltipKt$handleGestures$1$1$1, reason: invalid class name and collision with other inner class name */
                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/cc0;", "", "<anonymous>", "(Lcom/google/android/cc0;)V"}, k = 3, mv = {2, 0, 0})
                @lq2(c = "androidx.compose.material3.internal.BasicTooltipKt$handleGestures$1$1$1", f = "BasicTooltip.kt", l = {210, 216, 238}, m = "invokeSuspend")
                static final class C00381 extends RestrictedSuspendLambda implements Function2<cc0, q22<? super Unit>, Object> {
                    final /* synthetic */ ta2 $$this$coroutineScope;
                    final /* synthetic */ cad $state;
                    long J$0;
                    private /* synthetic */ Object L$0;
                    Object L$1;
                    Object L$2;
                    int label;

                    /* JADX INFO: renamed from: androidx.compose.material3.internal.BasicTooltipKt$handleGestures$1$1$1$1, reason: invalid class name and collision with other inner class name */
                    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/cc0;", "Landroidx/compose/ui/input/pointer/i;", "<anonymous>", "(Lcom/google/android/cc0;)Landroidx/compose/ui/input/pointer/i;"}, k = 3, mv = {2, 0, 0})
                    @lq2(c = "androidx.compose.material3.internal.BasicTooltipKt$handleGestures$1$1$1$1", f = "BasicTooltip.kt", l = {217}, m = "invokeSuspend")
                    static final class C00391 extends RestrictedSuspendLambda implements Function2<cc0, q22<? super PointerInputChange>, Object> {
                        final /* synthetic */ PointerEventPass $pass;
                        private /* synthetic */ Object L$0;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C00391(PointerEventPass pointerEventPass, q22<? super C00391> q22Var) {
                            super(2, q22Var);
                            this.$pass = pointerEventPass;
                        }

                        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                        public final Object invoke(cc0 cc0Var, q22<? super PointerInputChange> q22Var) {
                            return create(cc0Var, q22Var).invokeSuspend(Unit.a);
                        }

                        public final q22<Unit> create(Object obj, q22<?> q22Var) {
                            C00391 c00391 = new C00391(this.$pass, q22Var);
                            c00391.L$0 = obj;
                            return c00391;
                        }

                        public final Object invokeSuspend(Object obj) {
                            Object objG = a.g();
                            int i = this.label;
                            if (i != 0) {
                                if (i != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                f.b(obj);
                                return obj;
                            }
                            f.b(obj);
                            cc0 cc0Var = (cc0) this.L$0;
                            PointerEventPass pointerEventPass = this.$pass;
                            this.label = 1;
                            Object objQ = TapGestureDetectorKt.q(cc0Var, pointerEventPass, this);
                            return objQ == objG ? objG : objQ;
                        }
                    }

                    /* JADX INFO: renamed from: androidx.compose.material3.internal.BasicTooltipKt$handleGestures$1$1$1$3, reason: invalid class name */
                    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/ta2;", "", "<anonymous>", "(Lcom/google/android/ta2;)V"}, k = 3, mv = {2, 0, 0})
                    @lq2(c = "androidx.compose.material3.internal.BasicTooltipKt$handleGestures$1$1$1$3", f = "BasicTooltip.kt", l = {224, 227, 227}, m = "invokeSuspend")
                    static final class AnonymousClass3 extends SuspendLambda implements Function2<ta2, q22<? super Unit>, Object> {
                        final /* synthetic */ p58<Boolean> $isLongPressedFlow;
                        final /* synthetic */ cad $state;
                        Object L$0;
                        int label;

                        /* JADX INFO: renamed from: androidx.compose.material3.internal.BasicTooltipKt$handleGestures$1$1$1$3$1, reason: invalid class name and collision with other inner class name */
                        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "isLongPressed", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
                        @lq2(c = "androidx.compose.material3.internal.BasicTooltipKt$handleGestures$1$1$1$3$1", f = "BasicTooltip.kt", l = {}, m = "invokeSuspend")
                        static final class C00401 extends SuspendLambda implements Function2<Boolean, q22<? super Unit>, Object> {
                            final /* synthetic */ cad $state;
                            /* synthetic */ boolean Z$0;
                            int label;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            C00401(cad cadVar, q22<? super C00401> q22Var) {
                                super(2, q22Var);
                                this.$state = cadVar;
                            }

                            public final q22<Unit> create(Object obj, q22<?> q22Var) {
                                C00401 c00401 = new C00401(this.$state, q22Var);
                                c00401.Z$0 = ((Boolean) obj).booleanValue();
                                return c00401;
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                return invoke(((Boolean) obj).booleanValue(), (q22<? super Unit>) obj2);
                            }

                            public final Object invokeSuspend(Object obj) {
                                a.g();
                                if (this.label != 0) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                f.b(obj);
                                if (!this.Z$0) {
                                    this.$state.dismiss();
                                }
                                return Unit.a;
                            }

                            public final Object invoke(boolean z, q22<? super Unit> q22Var) {
                                return create(Boolean.valueOf(z), q22Var).invokeSuspend(Unit.a);
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        AnonymousClass3(p58<Boolean> p58Var, cad cadVar, q22<? super AnonymousClass3> q22Var) {
                            super(2, q22Var);
                            this.$isLongPressedFlow = p58Var;
                            this.$state = cadVar;
                        }

                        public final q22<Unit> create(Object obj, q22<?> q22Var) {
                            return new AnonymousClass3(this.$isLongPressedFlow, this.$state, q22Var);
                        }

                        public final Object invoke(ta2 ta2Var, q22<? super Unit> q22Var) {
                            return create(ta2Var, q22Var).invokeSuspend(Unit.a);
                        }

                        /* JADX WARN: Code restructure failed: missing block: B:22:0x005c, code lost:
                        
                            if (kotlinx.coroutines.flow.d.l(r7, r1, r6) == r0) goto L30;
                         */
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
                            /*
                                r6 = this;
                                java.lang.Object r0 = kotlin.coroutines.intrinsics.a.g()
                                int r1 = r6.label
                                r2 = 0
                                r3 = 3
                                r4 = 2
                                r5 = 1
                                if (r1 == 0) goto L2c
                                if (r1 == r5) goto L26
                                if (r1 == r4) goto L22
                                if (r1 == r3) goto L1a
                                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                                r7.<init>(r0)
                                throw r7
                            L1a:
                                java.lang.Object r0 = r6.L$0
                                java.lang.Throwable r0 = (java.lang.Throwable) r0
                                kotlin.f.b(r7)
                                goto L7f
                            L22:
                                kotlin.f.b(r7)
                                goto L5f
                            L26:
                                kotlin.f.b(r7)     // Catch: java.lang.Throwable -> L2a
                                goto L45
                            L2a:
                                r7 = move-exception
                                goto L62
                            L2c:
                                kotlin.f.b(r7)
                                com.google.android.p58<java.lang.Boolean> r7 = r6.$isLongPressedFlow     // Catch: java.lang.Throwable -> L2a
                                java.lang.Boolean r1 = com.google.android.ut0.a(r5)     // Catch: java.lang.Throwable -> L2a
                                r7.g(r1)     // Catch: java.lang.Throwable -> L2a
                                com.google.android.cad r7 = r6.$state     // Catch: java.lang.Throwable -> L2a
                                androidx.compose.foundation.MutatePriority r1 = androidx.compose.p001foundation.MutatePriority.PreventUserInput     // Catch: java.lang.Throwable -> L2a
                                r6.label = r5     // Catch: java.lang.Throwable -> L2a
                                java.lang.Object r7 = r7.c(r1, r6)     // Catch: java.lang.Throwable -> L2a
                                if (r7 != r0) goto L45
                                goto L7d
                            L45:
                                com.google.android.cad r7 = r6.$state
                                boolean r7 = r7.isVisible()
                                if (r7 == 0) goto L5f
                                com.google.android.p58<java.lang.Boolean> r7 = r6.$isLongPressedFlow
                                androidx.compose.material3.internal.BasicTooltipKt$handleGestures$1$1$1$3$1 r1 = new androidx.compose.material3.internal.BasicTooltipKt$handleGestures$1$1$1$3$1
                                com.google.android.cad r3 = r6.$state
                                r1.<init>(r3, r2)
                                r6.label = r4
                                java.lang.Object r7 = kotlinx.coroutines.flow.d.l(r7, r1, r6)
                                if (r7 != r0) goto L5f
                                goto L7d
                            L5f:
                                kotlin.Unit r7 = kotlin.Unit.a
                                return r7
                            L62:
                                com.google.android.cad r1 = r6.$state
                                boolean r1 = r1.isVisible()
                                if (r1 == 0) goto L80
                                com.google.android.p58<java.lang.Boolean> r1 = r6.$isLongPressedFlow
                                androidx.compose.material3.internal.BasicTooltipKt$handleGestures$1$1$1$3$1 r4 = new androidx.compose.material3.internal.BasicTooltipKt$handleGestures$1$1$1$3$1
                                com.google.android.cad r5 = r6.$state
                                r4.<init>(r5, r2)
                                r6.L$0 = r7
                                r6.label = r3
                                java.lang.Object r1 = kotlinx.coroutines.flow.d.l(r1, r4, r6)
                                if (r1 != r0) goto L7e
                            L7d:
                                return r0
                            L7e:
                                r0 = r7
                            L7f:
                                r7 = r0
                            L80:
                                throw r7
                            */
                            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002material3.p003internal.BasicTooltipKt$handleGestures$1.AnonymousClass1.C00381.AnonymousClass3.invokeSuspend(java.lang.Object):java.lang.Object");
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C00381(ta2 ta2Var, cad cadVar, q22<? super C00381> q22Var) {
                        super(2, q22Var);
                        this.$$this$coroutineScope = ta2Var;
                        this.$state = cadVar;
                    }

                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final Object invoke(cc0 cc0Var, q22<? super Unit> q22Var) {
                        return create(cc0Var, q22Var).invokeSuspend(Unit.a);
                    }

                    public final q22<Unit> create(Object obj, q22<?> q22Var) {
                        C00381 c00381 = new C00381(this.$$this$coroutineScope, this.$state, q22Var);
                        c00381.L$0 = obj;
                        return c00381;
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:35:0x00e0, code lost:
                    
                        if (r0 == r6) goto L36;
                     */
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r1v0 */
                    /* JADX WARN: Type inference failed for: r1v7 */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object invokeSuspend(java.lang.Object r18) throws java.lang.Throwable {
                        /*
                            Method dump skipped, instruction units count: 246
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002material3.p003internal.BasicTooltipKt$handleGestures$1.AnonymousClass1.C00381.invokeSuspend(java.lang.Object):java.lang.Object");
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(df9 df9Var, cad cadVar, q22<? super AnonymousClass1> q22Var) {
                    super(2, q22Var);
                    this.$this_pointerInput = df9Var;
                    this.$state = cadVar;
                }

                public final q22<Unit> create(Object obj, q22<?> q22Var) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_pointerInput, this.$state, q22Var);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                public final Object invoke(ta2 ta2Var, q22<? super Unit> q22Var) {
                    return create(ta2Var, q22Var).invokeSuspend(Unit.a);
                }

                public final Object invokeSuspend(Object obj) {
                    Object objG = a.g();
                    int i = this.label;
                    if (i == 0) {
                        f.b(obj);
                        ta2 ta2Var = (ta2) this.L$0;
                        df9 df9Var = this.$this_pointerInput;
                        C00381 c00381 = new C00381(ta2Var, this.$state, null);
                        this.label = 1;
                        if (ForEachGestureKt.d(df9Var, c00381, this) == objG) {
                            return objG;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        f.b(obj);
                    }
                    return Unit.a;
                }
            }

            @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
            public final Object invoke(df9 df9Var, q22<? super Unit> q22Var) {
                Object objG = kotlinx.coroutines.j.g(new AnonymousClass1(df9Var, cadVar, null), q22Var);
                return objG == a.g() ? objG : Unit.a;
            }
        }), cadVar, new PointerInputEventHandler() { // from class: androidx.compose.material3.internal.BasicTooltipKt$handleGestures$2

            /* JADX INFO: renamed from: androidx.compose.material3.internal.BasicTooltipKt$handleGestures$2$1, reason: invalid class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/ta2;", "", "<anonymous>", "(Lcom/google/android/ta2;)V"}, k = 3, mv = {2, 0, 0})
            @lq2(c = "androidx.compose.material3.internal.BasicTooltipKt$handleGestures$2$1", f = "BasicTooltip.kt", l = {249}, m = "invokeSuspend")
            static final class AnonymousClass1 extends SuspendLambda implements Function2<ta2, q22<? super Unit>, Object> {
                final /* synthetic */ cad $state;
                final /* synthetic */ df9 $this_pointerInput;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX INFO: renamed from: androidx.compose.material3.internal.BasicTooltipKt$handleGestures$2$1$1, reason: invalid class name and collision with other inner class name */
                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/cc0;", "", "<anonymous>", "(Lcom/google/android/cc0;)V"}, k = 3, mv = {2, 0, 0})
                @lq2(c = "androidx.compose.material3.internal.BasicTooltipKt$handleGestures$2$1$1", f = "BasicTooltip.kt", l = {253}, m = "invokeSuspend")
                static final class C00411 extends RestrictedSuspendLambda implements Function2<cc0, q22<? super Unit>, Object> {
                    final /* synthetic */ ta2 $$this$coroutineScope;
                    final /* synthetic */ cad $state;
                    private /* synthetic */ Object L$0;
                    Object L$1;
                    int label;

                    /* JADX INFO: renamed from: androidx.compose.material3.internal.BasicTooltipKt$handleGestures$2$1$1$1, reason: invalid class name and collision with other inner class name */
                    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/ta2;", "", "<anonymous>", "(Lcom/google/android/ta2;)V"}, k = 3, mv = {2, 0, 0})
                    @lq2(c = "androidx.compose.material3.internal.BasicTooltipKt$handleGestures$2$1$1$1", f = "BasicTooltip.kt", l = {258}, m = "invokeSuspend")
                    static final class C00421 extends SuspendLambda implements Function2<ta2, q22<? super Unit>, Object> {
                        final /* synthetic */ cad $state;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C00421(cad cadVar, q22<? super C00421> q22Var) {
                            super(2, q22Var);
                            this.$state = cadVar;
                        }

                        public final q22<Unit> create(Object obj, q22<?> q22Var) {
                            return new C00421(this.$state, q22Var);
                        }

                        public final Object invoke(ta2 ta2Var, q22<? super Unit> q22Var) {
                            return create(ta2Var, q22Var).invokeSuspend(Unit.a);
                        }

                        public final Object invokeSuspend(Object obj) {
                            Object objG = a.g();
                            int i = this.label;
                            if (i == 0) {
                                f.b(obj);
                                cad cadVar = this.$state;
                                MutatePriority mutatePriority = MutatePriority.UserInput;
                                this.label = 1;
                                if (cadVar.c(mutatePriority, this) == objG) {
                                    return objG;
                                }
                            } else {
                                if (i != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                f.b(obj);
                            }
                            return Unit.a;
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C00411(ta2 ta2Var, cad cadVar, q22<? super C00411> q22Var) {
                        super(2, q22Var);
                        this.$$this$coroutineScope = ta2Var;
                        this.$state = cadVar;
                    }

                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final Object invoke(cc0 cc0Var, q22<? super Unit> q22Var) {
                        return create(cc0Var, q22Var).invokeSuspend(Unit.a);
                    }

                    public final q22<Unit> create(Object obj, q22<?> q22Var) {
                        C00411 c00411 = new C00411(this.$$this$coroutineScope, this.$state, q22Var);
                        c00411.L$0 = obj;
                        return c00411;
                    }

                    /* JADX WARN: Code duplicated, block: B:11:0x0035 A[RETURN] */
                    /* JADX WARN: Code duplicated, block: B:14:0x0053  */
                    /* JADX WARN: Code duplicated, block: B:16:0x0063  */
                    /* JADX WARN: Code duplicated, block: B:17:0x0075  */
                    /* JADX WARN: Code duplicated, block: B:19:0x007f  */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0033 -> B:12:0x0036). Please report as a decompilation issue!!! */
                    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:0:?
                        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                        */
                    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
                        /*
                            r12 = this;
                            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.g()
                            int r1 = r12.label
                            r2 = 1
                            if (r1 == 0) goto L1f
                            if (r1 != r2) goto L17
                            java.lang.Object r1 = r12.L$1
                            androidx.compose.ui.input.pointer.PointerEventPass r1 = (androidx.compose.ui.input.pointer.PointerEventPass) r1
                            java.lang.Object r3 = r12.L$0
                            com.google.android.cc0 r3 = (com.google.inputmethod.cc0) r3
                            kotlin.f.b(r13)
                            goto L36
                        L17:
                            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                            r13.<init>(r0)
                            throw r13
                        L1f:
                            kotlin.f.b(r13)
                            java.lang.Object r13 = r12.L$0
                            com.google.android.cc0 r13 = (com.google.inputmethod.cc0) r13
                            androidx.compose.ui.input.pointer.PointerEventPass r1 = androidx.compose.ui.input.pointer.PointerEventPass.Main
                            r3 = r13
                        L29:
                            r12.L$0 = r3
                            r12.L$1 = r1
                            r12.label = r2
                            java.lang.Object r13 = r3.f2(r1, r12)
                            if (r13 != r0) goto L36
                            return r0
                        L36:
                            androidx.compose.ui.input.pointer.e r13 = (androidx.compose.ui.input.pointer.e) r13
                            java.util.List r4 = r13.c()
                            r5 = 0
                            java.lang.Object r4 = r4.get(r5)
                            androidx.compose.ui.input.pointer.i r4 = (androidx.compose.ui.input.pointer.PointerInputChange) r4
                            int r4 = r4.getType()
                            androidx.compose.ui.input.pointer.j$a r5 = androidx.compose.ui.input.pointer.j.INSTANCE
                            int r5 = r5.b()
                            boolean r4 = androidx.compose.ui.input.pointer.j.i(r4, r5)
                            if (r4 == 0) goto L29
                            int r13 = r13.getType()
                            androidx.compose.ui.input.pointer.g$a r4 = androidx.compose.ui.input.pointer.g.INSTANCE
                            int r5 = r4.a()
                            boolean r5 = androidx.compose.ui.input.pointer.g.o(r13, r5)
                            if (r5 == 0) goto L75
                            com.google.android.ta2 r6 = r12.$$this$coroutineScope
                            androidx.compose.material3.internal.BasicTooltipKt$handleGestures$2$1$1$1 r9 = new androidx.compose.material3.internal.BasicTooltipKt$handleGestures$2$1$1$1
                            com.google.android.cad r13 = r12.$state
                            r4 = 0
                            r9.<init>(r13, r4)
                            r10 = 3
                            r11 = 0
                            r7 = 0
                            r8 = 0
                            com.google.android.rw0.d(r6, r7, r8, r9, r10, r11)
                            goto L29
                        L75:
                            int r4 = r4.b()
                            boolean r13 = androidx.compose.ui.input.pointer.g.o(r13, r4)
                            if (r13 == 0) goto L29
                            com.google.android.cad r13 = r12.$state
                            r13.dismiss()
                            goto L29
                        */
                        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002material3.p003internal.BasicTooltipKt$handleGestures$2.AnonymousClass1.C00411.invokeSuspend(java.lang.Object):java.lang.Object");
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(df9 df9Var, cad cadVar, q22<? super AnonymousClass1> q22Var) {
                    super(2, q22Var);
                    this.$this_pointerInput = df9Var;
                    this.$state = cadVar;
                }

                public final q22<Unit> create(Object obj, q22<?> q22Var) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_pointerInput, this.$state, q22Var);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                public final Object invoke(ta2 ta2Var, q22<? super Unit> q22Var) {
                    return create(ta2Var, q22Var).invokeSuspend(Unit.a);
                }

                public final Object invokeSuspend(Object obj) {
                    Object objG = a.g();
                    int i = this.label;
                    if (i == 0) {
                        f.b(obj);
                        ta2 ta2Var = (ta2) this.L$0;
                        df9 df9Var = this.$this_pointerInput;
                        C00411 c00411 = new C00411(ta2Var, this.$state, null);
                        this.label = 1;
                        if (df9Var.l0(c00411, this) == objG) {
                            return objG;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        f.b(obj);
                    }
                    return Unit.a;
                }
            }

            @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
            public final Object invoke(df9 df9Var, q22<? super Unit> q22Var) {
                Object objG = kotlinx.coroutines.j.g(new AnonymousClass1(df9Var, cadVar, null), q22Var);
                return objG == a.g() ? objG : Unit.a;
            }
        }) : bVar;
    }

    private static final androidx.compose.ui.b u(androidx.compose.ui.b bVar, boolean z, final cad cadVar, final ta2 ta2Var, boolean z2, o58<Boolean> o58Var) {
        if (z) {
            return wi6.b(ck4.a(bVar, new Function1() { // from class: com.google.android.xi0
                public final Object invoke(Object obj) {
                    return BasicTooltipKt.v(ta2Var, cadVar, (dl4) obj);
                }
            }), new c(cadVar, o58Var, z2));
        }
        o58Var.setValue(Boolean.FALSE);
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit v(ta2 ta2Var, cad cadVar, dl4 dl4Var) {
        rw0.d(ta2Var, (CoroutineContext) null, (CoroutineStart) null, new BasicTooltipKt$keyboardBehavior$1$1(dl4Var, cadVar, null), 3, (Object) null);
        return Unit.a;
    }

    private static final q6c<Boolean> w(d dVar, int i) {
        if (e.k()) {
            e.o(1960751094, i, -1, "androidx.compose.material3.internal.rememberTouchExplorationOrSwitchAccessServiceState (BasicTooltip.kt:456)");
        }
        q6c<Boolean> q6cVarN = b7.n(true, true, false, dVar, 438, 0);
        if (e.k()) {
            e.n();
        }
        return q6cVarN;
    }
}
