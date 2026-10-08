package androidx.compose.p002material3;

import androidx.compose.p001foundation.layout.SizeKt;
import androidx.compose.p001foundation.layout.c;
import androidx.compose.p001foundation.layout.o;
import androidx.compose.p001foundation.lazy.LazyListState;
import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.b;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import com.google.android.ps4;
import com.google.android.rw0;
import com.google.android.ta2;
import com.google.inputmethod.CalendarMonth;
import com.google.inputmethod.afb;
import com.google.inputmethod.ce3;
import com.google.inputmethod.d21;
import com.google.inputmethod.ddb;
import com.google.inputmethod.dud;
import com.google.inputmethod.ej7;
import com.google.inputmethod.ff3;
import com.google.inputmethod.gs1;
import com.google.inputmethod.nfb;
import com.google.inputmethod.nx8;
import com.google.inputmethod.o58;
import com.google.inputmethod.pp1;
import com.google.inputmethod.rbc;
import com.google.inputmethod.tc;
import com.google.inputmethod.vbc;
import com.google.inputmethod.vn2;
import com.google.inputmethod.wz9;
import com.google.inputmethod.xd3;
import com.google.inputmethod.xq;
import com.google.inputmethod.yj1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class DatePickerKt$DatePickerContent$2$4$2 implements ps4<xq, d, Integer, Unit> {
    final /* synthetic */ long a;
    final /* synthetic */ o58<Boolean> b;
    final /* synthetic */ ta2 c;
    final /* synthetic */ LazyListState d;
    final /* synthetic */ IntRange e;
    final /* synthetic */ CalendarMonth f;
    final /* synthetic */ ddb g;
    final /* synthetic */ d21 h;
    final /* synthetic */ vn2 i;

    DatePickerKt$DatePickerContent$2$4$2(long j, o58<Boolean> o58Var, ta2 ta2Var, LazyListState lazyListState, IntRange intRange, CalendarMonth calendarMonth, ddb ddbVar, d21 d21Var, vn2 vn2Var) {
        this.a = j;
        this.b = o58Var;
        this.c = ta2Var;
        this.d = lazyListState;
        this.e = intRange;
        this.f = calendarMonth;
        this.g = ddbVar;
        this.h = d21Var;
        this.i = vn2Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(String str, nfb nfbVar) {
        SemanticsPropertiesKt.l0(nfbVar, str);
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(ta2 ta2Var, o58 o58Var, LazyListState lazyListState, IntRange intRange, CalendarMonth calendarMonth, int i) {
        DatePickerKt.P(o58Var, !DatePickerKt.O(o58Var));
        rw0.d(ta2Var, (CoroutineContext) null, (CoroutineStart) null, new C0178DatePickerKt$DatePickerContent$2$4$2$2$1$1$1(lazyListState, i, intRange, calendarMonth, null), 3, (Object) null);
        return Unit.a;
    }

    public final void c(xq xqVar, d dVar, int i) {
        if (e.k()) {
            e.o(1193716082, i, -1, "androidx.compose.material3.DatePickerContent.<anonymous>.<anonymous>.<anonymous> (DatePicker.kt:1632)");
        }
        rbc.Companion companion = rbc.INSTANCE;
        final String strB = vbc.b(rbc.a(wz9.z), dVar, 0);
        b.Companion companion2 = b.INSTANCE;
        boolean zX = dVar.x(strB);
        Object objR = dVar.R();
        if (zX || objR == d.INSTANCE.a()) {
            objR = new Function1() { // from class: androidx.compose.material3.m
                public final Object invoke(Object obj) {
                    return DatePickerKt$DatePickerContent$2$4$2.d(strB, (nfb) obj);
                }
            };
            dVar.L(objR);
        }
        b bVarD = afb.d(companion2, false, (Function1) objR, 1, null);
        long j = this.a;
        final o58<Boolean> o58Var = this.b;
        final ta2 ta2Var = this.c;
        final LazyListState lazyListState = this.d;
        final IntRange intRange = this.e;
        final CalendarMonth calendarMonth = this.f;
        ddb ddbVar = this.g;
        d21 d21Var = this.h;
        vn2 vn2Var = this.i;
        ej7 ej7VarA = o.a(c.a.k(), tc.INSTANCE.k(), dVar, 0);
        int iA = pp1.a(dVar, 0);
        gs1 gs1VarJ = dVar.j();
        b bVarE = ComposedModifierKt.e(dVar, bVarD);
        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> function0B = companion3.b();
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
        dud.i(dVarC, ej7VarA, companion3.d());
        dud.i(dVarC, gs1VarJ, companion3.f());
        Function2<ComposeUiNode, Integer, Unit> function2C = companion3.c();
        if (dVarC.getInserting() || !Intrinsics.e(dVarC.R(), Integer.valueOf(iA))) {
            dVarC.L(Integer.valueOf(iA));
            dVarC.e(Integer.valueOf(iA), function2C);
        }
        dud.i(dVarC, bVarE, companion3.e());
        yj1 yj1Var = yj1.a;
        b bVarP = nx8.p(SizeKt.l(companion2, ff3.i(ff3.i(DatePickerKt.Q0() * 7) - xd3.a.b())), DatePickerKt.O0(), 0.0f, 2, null);
        boolean zX2 = dVar.x(o58Var) | dVar.T(ta2Var) | dVar.x(lazyListState) | dVar.T(intRange) | dVar.x(calendarMonth);
        Object objR2 = dVar.R();
        if (zX2 || objR2 == d.INSTANCE.a()) {
            Object obj = new Function1() { // from class: androidx.compose.material3.n
                public final Object invoke(Object obj2) {
                    return DatePickerKt$DatePickerContent$2$4$2.g(ta2Var, o58Var, lazyListState, intRange, calendarMonth, ((Integer) obj2).intValue());
                }
            };
            dVar.L(obj);
            objR2 = obj;
        }
        DatePickerKt.z0(bVarP, j, (Function1) objR2, ddbVar, d21Var, intRange, vn2Var, dVar, 6);
        ce3.e(null, 0.0f, vn2Var.getDividerColor(), dVar, 0, 3);
        dVar.m();
        if (e.k()) {
            e.n();
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        c((xq) obj, (d) obj2, ((Number) obj3).intValue());
        return Unit.a;
    }
}
