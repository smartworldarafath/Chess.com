package androidx.compose.p002material3;

import androidx.compose.p002material3.SheetState;
import androidx.compose.p002material3.SheetValue;
import androidx.compose.p002material3.p003internal.AnchoredDraggableState;
import com.google.android.q22;
import com.google.inputmethod.k0b;
import com.google.inputmethod.kr;
import com.google.inputmethod.lr;
import com.google.inputmethod.n0b;
import com.google.inputmethod.o0b;
import com.google.inputmethod.xa4;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001f\b\u0007\u0018\u0000 32\u00020\u0001:\u0001\u001fBU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\u0005¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011H\u0086@¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0011H\u0086@¢\u0006\u0004\b\u0014\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0011H\u0086@¢\u0006\u0004\b\u0015\u0010\u0013J\u0010\u0010\u0016\u001a\u00020\u0011H\u0086@¢\u0006\u0004\b\u0016\u0010\u0013J0\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\b2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u0005H\u0080@¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u0005H\u0080@¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R&\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00020\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010\f\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b'\u0010 \u001a\u0004\b(\u0010\"R(\u00100\u001a\b\u0012\u0004\u0012\u00020\u00050)8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R(\u00107\u001a\b\u0012\u0004\u0012\u00020\b018\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001b\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R(\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00050\u00188\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R(\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00050\u00188\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0012\u00109\u001a\u0004\b?\u0010;\"\u0004\b@\u0010=R\u0011\u0010D\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\bB\u0010CR\u0011\u0010\u0017\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\bE\u0010CR\u0011\u0010G\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bF\u0010\"R\u0011\u0010I\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bH\u0010\"R\u0011\u0010K\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bJ\u0010\"R\u0011\u0010M\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bL\u0010\"R\u0014\u0010O\u001a\u00020\u00058@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bN\u0010\u0010¨\u0006P"}, d2 = {"Landroidx/compose/material3/SheetState;", "", "", "skipPartiallyExpanded", "Lkotlin/Function0;", "", "positionalThreshold", "velocityThreshold", "Landroidx/compose/material3/SheetValue;", "initialValue", "Lkotlin/Function1;", "confirmValueChange", "skipHiddenState", "<init>", "(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/material3/SheetValue;Lkotlin/jvm/functions/Function1;Z)V", "s", "()F", "", "g", "(Lcom/google/android/q22;)Ljava/lang/Object;", "r", "x", "o", "targetValue", "Lcom/google/android/xa4;", "animationSpec", "velocity", "e", "(Landroidx/compose/material3/SheetValue;Lcom/google/android/xa4;FLcom/google/android/q22;)Ljava/lang/Object;", "w", "(FLcom/google/android/q22;)Ljava/lang/Object;", "a", "Z", "m", "()Z", "b", "Lkotlin/jvm/functions/Function1;", "getConfirmValueChange$material3", "()Lkotlin/jvm/functions/Function1;", "c", "getSkipHiddenState$material3", "Lcom/google/android/kr;", "d", "Lcom/google/android/kr;", "getAnchoredDraggableMotionSpec$material3", "()Lcom/google/android/kr;", "t", "(Lcom/google/android/kr;)V", "anchoredDraggableMotionSpec", "Landroidx/compose/material3/internal/AnchoredDraggableState;", "Landroidx/compose/material3/internal/AnchoredDraggableState;", "h", "()Landroidx/compose/material3/internal/AnchoredDraggableState;", "setAnchoredDraggableState$material3", "(Landroidx/compose/material3/internal/AnchoredDraggableState;)V", "anchoredDraggableState", "f", "Lcom/google/android/xa4;", "getShowMotionSpec$material3", "()Lcom/google/android/xa4;", "v", "(Lcom/google/android/xa4;)V", "showMotionSpec", "getHideMotionSpec$material3", "u", "hideMotionSpec", "i", "()Landroidx/compose/material3/SheetValue;", "currentValue", "n", "q", "isVisible", "p", "isAnimationRunning", "j", "hasExpandedState", "k", "hasPartiallyExpandedState", "l", "offset", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SheetState {

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean skipPartiallyExpanded;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Function1<SheetValue, Boolean> confirmValueChange;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean skipHiddenState;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private kr<Float> anchoredDraggableMotionSpec;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private AnchoredDraggableState<SheetValue> anchoredDraggableState;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private xa4<Float> showMotionSpec;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private xa4<Float> hideMotionSpec;

    /* JADX INFO: renamed from: androidx.compose.material3.SheetState$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JY\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000b0\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00040\n2\u0006\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroidx/compose/material3/SheetState$a;", "", "<init>", "()V", "", "skipPartiallyExpanded", "Lkotlin/Function0;", "", "positionalThreshold", "velocityThreshold", "Lkotlin/Function1;", "Landroidx/compose/material3/SheetValue;", "confirmValueChange", "skipHiddenState", "Lcom/google/android/k0b;", "Landroidx/compose/material3/SheetState;", "c", "(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Z)Lcom/google/android/k0b;", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final SheetValue d(o0b o0bVar, SheetState sheetState) {
            return sheetState.i();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final SheetState e(boolean z, Function0 function0, Function0 function1, Function1 function2, boolean z2, SheetValue sheetValue) {
            return new SheetState(z, function0, function1, sheetValue, function2, z2);
        }

        public final k0b<SheetState, SheetValue> c(final boolean skipPartiallyExpanded, final Function0<Float> positionalThreshold, final Function0<Float> velocityThreshold, final Function1<? super SheetValue, Boolean> confirmValueChange, final boolean skipHiddenState) {
            return n0b.e(new Function2() { // from class: com.google.android.anb
                public final Object invoke(Object obj, Object obj2) {
                    return SheetState.Companion.d((o0b) obj, (SheetState) obj2);
                }
            }, new Function1() { // from class: com.google.android.bnb
                public final Object invoke(Object obj) {
                    return SheetState.Companion.e(skipPartiallyExpanded, positionalThreshold, velocityThreshold, confirmValueChange, skipHiddenState, (SheetValue) obj);
                }
            });
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SheetState(boolean z, final Function0<Float> function0, Function0<Float> function1, SheetValue sheetValue, Function1<? super SheetValue, Boolean> function2, boolean z2) {
        this.skipPartiallyExpanded = z;
        this.confirmValueChange = function2;
        this.skipHiddenState = z2;
        if (z && sheetValue == SheetValue.PartiallyExpanded) {
            throw new IllegalArgumentException("The initial value must not be set to PartiallyExpanded if skipPartiallyExpanded is set to true.");
        }
        if (z2 && sheetValue == SheetValue.Hidden) {
            throw new IllegalArgumentException("The initial value must not be set to Hidden if skipHiddenState is set to true.");
        }
        this.anchoredDraggableMotionSpec = m1.b;
        this.anchoredDraggableState = new AnchoredDraggableState<>(sheetValue, new Function1() { // from class: com.google.android.ymb
            public final Object invoke(Object obj) {
                return Float.valueOf(SheetState.c(function0, ((Float) obj).floatValue()));
            }
        }, function1, new Function0() { // from class: com.google.android.zmb
            public final Object invoke() {
                return SheetState.d(this.a);
            }
        }, function2);
        this.showMotionSpec = lr.h(0, 1, null);
        this.hideMotionSpec = lr.h(0, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float c(Function0 function0, float f) {
        return ((Number) function0.invoke()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kr d(SheetState sheetState) {
        return sheetState.anchoredDraggableMotionSpec;
    }

    public static /* synthetic */ Object f(SheetState sheetState, SheetValue sheetValue, xa4 xa4Var, float f, q22 q22Var, int i, Object obj) {
        if ((i & 4) != 0) {
            f = sheetState.anchoredDraggableState.w();
        }
        return sheetState.e(sheetValue, xa4Var, f, q22Var);
    }

    public final Object e(SheetValue sheetValue, xa4<Float> xa4Var, float f, q22<? super Unit> q22Var) {
        Object objK = AnchoredDraggableState.k(this.anchoredDraggableState, sheetValue, null, new SheetState$animateTo$2(this, f, xa4Var, null), q22Var, 2, null);
        return objK == a.g() ? objK : Unit.a;
    }

    public final Object g(q22<? super Unit> q22Var) {
        Object objF;
        Function1<SheetValue, Boolean> function1 = this.confirmValueChange;
        SheetValue sheetValue = SheetValue.Expanded;
        return (((Boolean) function1.invoke(sheetValue)).booleanValue() && (objF = f(this, sheetValue, this.showMotionSpec, 0.0f, q22Var, 4, null)) == a.g()) ? objF : Unit.a;
    }

    public final AnchoredDraggableState<SheetValue> h() {
        return this.anchoredDraggableState;
    }

    public final SheetValue i() {
        return this.anchoredDraggableState.t();
    }

    public final boolean j() {
        return this.anchoredDraggableState.p().d(SheetValue.Expanded);
    }

    public final boolean k() {
        return this.anchoredDraggableState.p().d(SheetValue.PartiallyExpanded);
    }

    public final float l() {
        return this.anchoredDraggableState.x();
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final boolean getSkipPartiallyExpanded() {
        return this.skipPartiallyExpanded;
    }

    public final SheetValue n() {
        return this.anchoredDraggableState.y();
    }

    public final Object o(q22<? super Unit> q22Var) {
        Object objF;
        if (this.skipHiddenState) {
            throw new IllegalStateException("Attempted to animate to hidden when skipHiddenState was enabled. Set skipHiddenState to false to use this function.");
        }
        Function1<SheetValue, Boolean> function1 = this.confirmValueChange;
        SheetValue sheetValue = SheetValue.Hidden;
        return (((Boolean) function1.invoke(sheetValue)).booleanValue() && (objF = f(this, sheetValue, this.hideMotionSpec, 0.0f, q22Var, 4, null)) == a.g()) ? objF : Unit.a;
    }

    public final boolean p() {
        return this.anchoredDraggableState.z();
    }

    public final boolean q() {
        return this.anchoredDraggableState.t() != SheetValue.Hidden;
    }

    public final Object r(q22<? super Unit> q22Var) {
        Object objF;
        if (this.skipPartiallyExpanded) {
            throw new IllegalStateException("Attempted to animate to partial expanded when skipPartiallyExpanded was enabled. Set skipPartiallyExpanded to false to use this function.");
        }
        Function1<SheetValue, Boolean> function1 = this.confirmValueChange;
        SheetValue sheetValue = SheetValue.PartiallyExpanded;
        return (((Boolean) function1.invoke(sheetValue)).booleanValue() && (objF = f(this, sheetValue, this.hideMotionSpec, 0.0f, q22Var, 4, null)) == a.g()) ? objF : Unit.a;
    }

    public final float s() {
        return this.anchoredDraggableState.C();
    }

    public final void t(kr<Float> krVar) {
        this.anchoredDraggableMotionSpec = krVar;
    }

    public final void u(xa4<Float> xa4Var) {
        this.hideMotionSpec = xa4Var;
    }

    public final void v(xa4<Float> xa4Var) {
        this.showMotionSpec = xa4Var;
    }

    public final Object w(float f, q22<? super Unit> q22Var) {
        Object objI = this.anchoredDraggableState.I(f, q22Var);
        return objI == a.g() ? objI : Unit.a;
    }

    public final Object x(q22<? super Unit> q22Var) {
        Object objF;
        SheetValue sheetValue = k() ? SheetValue.PartiallyExpanded : SheetValue.Expanded;
        return (((Boolean) this.confirmValueChange.invoke(sheetValue)).booleanValue() && (objF = f(this, sheetValue, this.showMotionSpec, 0.0f, q22Var, 4, null)) == a.g()) ? objF : Unit.a;
    }
}
