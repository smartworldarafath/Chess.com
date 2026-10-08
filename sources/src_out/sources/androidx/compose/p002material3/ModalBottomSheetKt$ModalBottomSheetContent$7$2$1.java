package androidx.compose.p002material3;

import androidx.compose.p001foundation.ClickableKt;
import androidx.compose.p001foundation.layout.BoxScopeInstance;
import androidx.compose.p001foundation.layout.j;
import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.b;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import com.google.android.rw0;
import com.google.android.ta2;
import com.google.inputmethod.afb;
import com.google.inputmethod.dud;
import com.google.inputmethod.ej7;
import com.google.inputmethod.gs1;
import com.google.inputmethod.nfb;
import com.google.inputmethod.pp1;
import com.google.inputmethod.tc;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class ModalBottomSheetKt$ModalBottomSheetContent$7$2$1 implements Function2<d, Integer, Unit> {
    final /* synthetic */ SheetState a;
    final /* synthetic */ Function0<Unit> b;
    final /* synthetic */ ta2 c;
    final /* synthetic */ boolean d;
    final /* synthetic */ String e;
    final /* synthetic */ String f;
    final /* synthetic */ String g;
    final /* synthetic */ Function2<d, Integer, Unit> h;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SheetValue.values().length];
            try {
                iArr[SheetValue.Expanded.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SheetValue.PartiallyExpanded.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    ModalBottomSheetKt$ModalBottomSheetContent$7$2$1(SheetState sheetState, Function0<Unit> function0, ta2 ta2Var, boolean z, String str, String str2, String str3, Function2<? super d, ? super Integer, Unit> function2) {
        this.a = sheetState;
        this.b = function0;
        this.c = ta2Var;
        this.d = z;
        this.e = str;
        this.f = str2;
        this.g = str3;
        this.h = function2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(SheetState sheetState, Function0 function0, ta2 ta2Var) {
        int i = a.$EnumSwitchMapping$0[sheetState.i().ordinal()];
        if (i == 1) {
            function0.invoke();
            Unit unit = Unit.a;
        } else if (i != 2) {
            rw0.d(ta2Var, (CoroutineContext) null, (CoroutineStart) null, new C0197ModalBottomSheetKt$ModalBottomSheetContent$7$2$1$1$1$2(sheetState, null), 3, (Object) null);
        } else {
            rw0.d(ta2Var, (CoroutineContext) null, (CoroutineStart) null, new C0196ModalBottomSheetKt$ModalBottomSheetContent$7$2$1$1$1$1(sheetState, null), 3, (Object) null);
        }
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(boolean z, final SheetState sheetState, String str, String str2, String str3, final Function0 function0, final ta2 ta2Var, nfb nfbVar) {
        if (z) {
            SemanticsPropertiesKt.j(nfbVar, str, new Function0() { // from class: androidx.compose.material3.u0
                public final Object invoke() {
                    return Boolean.valueOf(ModalBottomSheetKt$ModalBottomSheetContent$7$2$1.l(function0));
                }
            });
            if (sheetState.i() == SheetValue.PartiallyExpanded) {
                SemanticsPropertiesKt.m(nfbVar, str2, new Function0() { // from class: androidx.compose.material3.v0
                    public final Object invoke() {
                        return Boolean.valueOf(ModalBottomSheetKt$ModalBottomSheetContent$7$2$1.m(sheetState, ta2Var, sheetState));
                    }
                });
            } else if (sheetState.k()) {
                SemanticsPropertiesKt.c(nfbVar, str3, new Function0() { // from class: androidx.compose.material3.w0
                    public final Object invoke() {
                        return Boolean.valueOf(ModalBottomSheetKt$ModalBottomSheetContent$7$2$1.o(sheetState, ta2Var));
                    }
                });
            }
        }
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean l(Function0 function0) {
        function0.invoke();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean m(SheetState sheetState, ta2 ta2Var, SheetState sheetState2) {
        if (!((Boolean) sheetState.h().s().invoke(SheetValue.Expanded)).booleanValue()) {
            return true;
        }
        rw0.d(ta2Var, (CoroutineContext) null, (CoroutineStart) null, new C0198ModalBottomSheetKt$ModalBottomSheetContent$7$2$1$2$1$1$2$1(sheetState2, null), 3, (Object) null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean o(SheetState sheetState, ta2 ta2Var) {
        if (!((Boolean) sheetState.h().s().invoke(SheetValue.PartiallyExpanded)).booleanValue()) {
            return true;
        }
        rw0.d(ta2Var, (CoroutineContext) null, (CoroutineStart) null, new C0199ModalBottomSheetKt$ModalBottomSheetContent$7$2$1$2$1$1$3$1(sheetState, null), 3, (Object) null);
        return true;
    }

    public final void i(d dVar, int i) {
        if (!dVar.g((i & 3) != 2, i & 1)) {
            dVar.q();
            return;
        }
        if (e.k()) {
            e.o(2000500644, i, -1, "androidx.compose.material3.ModalBottomSheetContent.<anonymous>.<anonymous>.<anonymous> (ModalBottomSheet.kt:383)");
        }
        b.Companion companion = b.INSTANCE;
        boolean zX = dVar.x(this.a) | dVar.x(this.b) | dVar.T(this.c);
        final SheetState sheetState = this.a;
        final Function0<Unit> function0 = this.b;
        final ta2 ta2Var = this.c;
        Object objR = dVar.R();
        if (zX || objR == d.INSTANCE.a()) {
            objR = new Function0() { // from class: androidx.compose.material3.s0
                public final Object invoke() {
                    return ModalBottomSheetKt$ModalBottomSheetContent$7$2$1.j(sheetState, function0, ta2Var);
                }
            };
            dVar.L(objR);
        }
        b bVarO = ClickableKt.o(companion, false, null, null, (Function0) objR, 7, null);
        boolean zA = dVar.A(this.d) | dVar.x(this.a) | dVar.x(this.e) | dVar.x(this.b) | dVar.x(this.f) | dVar.T(this.c) | dVar.x(this.g);
        final boolean z = this.d;
        final SheetState sheetState2 = this.a;
        final String str = this.e;
        final String str2 = this.f;
        final String str3 = this.g;
        final Function0<Unit> function1 = this.b;
        final ta2 ta2Var2 = this.c;
        Object objR2 = dVar.R();
        if (zA || objR2 == d.INSTANCE.a()) {
            Function1 function2 = new Function1() { // from class: androidx.compose.material3.t0
                public final Object invoke(Object obj) {
                    return ModalBottomSheetKt$ModalBottomSheetContent$7$2$1.k(z, sheetState2, str, str2, str3, function1, ta2Var2, (nfb) obj);
                }
            };
            dVar.L(function2);
            objR2 = function2;
        }
        b bVarC = afb.c(bVarO, true, (Function1) objR2);
        Function2<d, Integer, Unit> function3 = this.h;
        ej7 ej7VarI = j.i(tc.INSTANCE.o(), false);
        int iA = pp1.a(dVar, 0);
        gs1 gs1VarJ = dVar.j();
        b bVarE = ComposedModifierKt.e(dVar, bVarC);
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
        function3.invoke(dVar, 0);
        dVar.m();
        if (e.k()) {
            e.n();
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        i((d) obj, ((Number) obj2).intValue());
        return Unit.a;
    }
}
