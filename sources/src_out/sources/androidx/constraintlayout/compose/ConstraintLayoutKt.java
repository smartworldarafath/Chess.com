package androidx.constraintlayout.compose;

import androidx.compose.ui.layout.j;
import androidx.compose.ui.layout.o;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import com.google.android.qjd;
import com.google.inputmethod.dj7;
import com.google.inputmethod.ej7;
import com.google.inputmethod.f66;
import com.google.inputmethod.fj7;
import com.google.inputmethod.h66;
import com.google.inputmethod.n6c;
import com.google.inputmethod.o58;
import com.google.inputmethod.pn6;
import com.google.inputmethod.q16;
import com.google.inputmethod.zw1;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aG\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\r\u0010\u000e\u001a\u000f\u0010\u0010\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a%\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00122\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0013\u0010\u001b\u001a\u00020\u001a*\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0013\u0010\u001e\u001a\u00020\u001a*\u00020\u001dH\u0002¢\u0006\u0004\b\u001e\u0010\u001f\"\u0014\u0010\"\u001a\u00020\u00058\u0002X\u0082D¢\u0006\u0006\n\u0004\b \u0010!*\f\b\u0000\u0010$\"\u00020#2\u00020#*\f\b\u0000\u0010&\"\u00020%2\u00020%*\f\b\u0000\u0010(\"\u00020'2\u00020'*\f\b\u0000\u0010*\"\u00020)2\u00020)¨\u0006+"}, d2 = {"", "optimizationLevel", "Landroidx/constraintlayout/compose/ConstraintLayoutScope;", "scope", "Lcom/google/android/o58;", "", "remeasureRequesterState", "Landroidx/constraintlayout/compose/Measurer;", "measurer", "Lkotlin/Pair;", "Lcom/google/android/ej7;", "Lkotlin/Function0;", "", "f", "(ILandroidx/constraintlayout/compose/ConstraintLayoutScope;Lcom/google/android/o58;Landroidx/constraintlayout/compose/Measurer;Landroidx/compose/runtime/d;I)Lkotlin/Pair;", "", "e", "()Ljava/lang/Object;", "Lcom/google/android/n6c;", "state", "", "Lcom/google/android/dj7;", "measurables", "d", "(Lcom/google/android/n6c;Ljava/util/List;)V", "Landroidx/constraintlayout/core/widgets/ConstraintWidget;", "", "g", "(Landroidx/constraintlayout/core/widgets/ConstraintWidget;)Ljava/lang/String;", "Landroidx/constraintlayout/core/widgets/analyzer/b$a;", "h", "(Landroidx/constraintlayout/core/widgets/analyzer/b$a;)Ljava/lang/String;", "a", "Z", "DEBUG", "Landroidx/constraintlayout/core/state/State$Chain;", "SolverChain", "Landroidx/constraintlayout/core/state/b;", "SolverDimension", "Landroidx/constraintlayout/core/state/State$Direction;", "SolverDirection", "Landroidx/constraintlayout/core/state/State;", "SolverState", "compose_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
public final class ConstraintLayoutKt {
    private static final boolean a = false;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/constraintlayout/compose/ConstraintLayoutKt$a", "", "compose_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a {
        a() {
        }
    }

    public static final void d(n6c n6cVar, List<? extends dj7> list) {
        Intrinsics.checkNotNullParameter(n6cVar, "state");
        Intrinsics.checkNotNullParameter(list, "measurables");
        int size = list.size() - 1;
        if (size < 0) {
            return;
        }
        int i = 0;
        while (true) {
            int i2 = i + 1;
            dj7 dj7Var = list.get(i);
            Object objA = pn6.a(dj7Var);
            if (objA == null && (objA = zw1.a(dj7Var)) == null) {
                objA = e();
            }
            n6cVar.j(objA, dj7Var);
            Object objB = zw1.b(dj7Var);
            if (objB != null && (objB instanceof String) && (objA instanceof String)) {
                n6cVar.n((String) objA, (String) objB);
            }
            if (i2 > size) {
                return;
            } else {
                i = i2;
            }
        }
    }

    public static final Object e() {
        return new a();
    }

    public static final Pair<ej7, Function0<Unit>> f(final int i, ConstraintLayoutScope constraintLayoutScope, final o58<Boolean> o58Var, final Measurer measurer, androidx.compose.p004runtime.d dVar, int i2) {
        Intrinsics.checkNotNullParameter(constraintLayoutScope, "scope");
        Intrinsics.checkNotNullParameter(o58Var, "remeasureRequesterState");
        Intrinsics.checkNotNullParameter(measurer, "measurer");
        dVar.Q(-441911751);
        dVar.Q(-3687241);
        Object objR = dVar.R();
        androidx.compose.p004runtime.d.Companion companion = androidx.compose.p004runtime.d.INSTANCE;
        if (objR == companion.a()) {
            objR = new ConstraintSetForInlineDsl(constraintLayoutScope);
            dVar.L(objR);
        }
        dVar.a0();
        final ConstraintSetForInlineDsl constraintSetForInlineDsl = (ConstraintSetForInlineDsl) objR;
        Integer numValueOf = Integer.valueOf(i);
        dVar.Q(-3686930);
        boolean zX = dVar.x(numValueOf);
        Object objR2 = dVar.R();
        if (zX || objR2 == companion.a()) {
            objR2 = qjd.a(new ej7() { // from class: androidx.constraintlayout.compose.ConstraintLayoutKt$rememberConstraintLayoutMeasurePolicy$1$measurePolicy$1
                @Override // com.google.inputmethod.ej7
                public int maxIntrinsicHeight(h66 h66Var, List<? extends f66> list, int i3) {
                    return ej7.a.a(this, h66Var, list, i3);
                }

                @Override // com.google.inputmethod.ej7
                public int maxIntrinsicWidth(h66 h66Var, List<? extends f66> list, int i3) {
                    return ej7.a.b(this, h66Var, list, i3);
                }

                @Override // com.google.inputmethod.ej7
                /* JADX INFO: renamed from: measure-3p2s80s */
                public final fj7 mo0measure3p2s80s(j jVar, final List<? extends dj7> list, long j) {
                    Intrinsics.checkNotNullParameter(jVar, "$this$MeasurePolicy");
                    Intrinsics.checkNotNullParameter(list, "measurables");
                    long jL = measurer.l(j, jVar.getLayoutDirection(), constraintSetForInlineDsl, list, i, jVar);
                    o58Var.getValue();
                    int iH = q16.h(jL);
                    int iG = q16.g(jL);
                    final Measurer measurer2 = measurer;
                    return j.Q1(jVar, iH, iG, null, new Function1<o.a, Unit>() { // from class: androidx.constraintlayout.compose.ConstraintLayoutKt$rememberConstraintLayoutMeasurePolicy$1$measurePolicy$1$measure$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((o.a) obj);
                            return Unit.a;
                        }

                        public final void invoke(o.a aVar) {
                            Intrinsics.checkNotNullParameter(aVar, "$this$layout");
                            measurer2.k(aVar, list);
                        }
                    }, 4, null);
                }

                @Override // com.google.inputmethod.ej7
                public int minIntrinsicHeight(h66 h66Var, List<? extends f66> list, int i3) {
                    return ej7.a.c(this, h66Var, list, i3);
                }

                @Override // com.google.inputmethod.ej7
                public int minIntrinsicWidth(h66 h66Var, List<? extends f66> list, int i3) {
                    return ej7.a.d(this, h66Var, list, i3);
                }
            }, new Function0<Unit>() { // from class: androidx.constraintlayout.compose.ConstraintLayoutKt$rememberConstraintLayoutMeasurePolicy$1$onHelpersChanged$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                public /* bridge */ /* synthetic */ Object invoke() {
                    m81invoke();
                    return Unit.a;
                }

                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m81invoke() {
                    o58<Boolean> o58Var2 = o58Var;
                    o58Var2.setValue(Boolean.valueOf(!o58Var2.getValue().booleanValue()));
                    constraintSetForInlineDsl.i(true);
                }
            });
            dVar.L(objR2);
        }
        dVar.a0();
        Pair<ej7, Function0<Unit>> pair = (Pair) objR2;
        dVar.a0();
        return pair;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String g(ConstraintWidget constraintWidget) {
        return ((Object) constraintWidget.v()) + " width " + constraintWidget.a0() + " minWidth " + constraintWidget.L() + " maxWidth " + constraintWidget.J() + " height " + constraintWidget.z() + " minHeight " + constraintWidget.K() + " maxHeight " + constraintWidget.I() + " HDB " + constraintWidget.C() + " VDB " + constraintWidget.X() + " MCW " + constraintWidget.w + " MCH " + constraintWidget.x + " percentW " + constraintWidget.B + " percentH " + constraintWidget.E;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String h(androidx.constraintlayout.core.widgets.analyzer.b.a aVar) {
        return "measure strategy is ";
    }
}
