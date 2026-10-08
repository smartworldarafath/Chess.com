package androidx.compose.p002material3;

import androidx.compose.p001foundation.gestures.AnchoredDraggableKt;
import androidx.compose.p001foundation.gestures.AnchoredDraggableState;
import androidx.compose.p002material3.SwipeToDismissBoxValue;
import androidx.compose.p002material3.s1;
import com.google.android.r43;
import com.google.inputmethod.f43;
import com.google.inputmethod.k0b;
import com.google.inputmethod.n0b;
import com.google.inputmethod.o0b;
import com.google.inputmethod.tg;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u000eBC\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u0006¢\u0006\u0004\b\u000b\u0010\fR \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\r8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R.\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u00068\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00078@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\t8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010!\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0011\u0010#\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\"\u0010 R\u0011\u0010%\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b$\u0010 R\u0011\u0010'\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b&\u0010 ¨\u0006("}, d2 = {"Landroidx/compose/material3/s1;", "", "Landroidx/compose/material3/SwipeToDismissBoxValue;", "initialValue", "Lcom/google/android/f43;", "density", "Lkotlin/Function1;", "", "confirmValueChange", "", "positionalThreshold", "<init>", "(Landroidx/compose/material3/SwipeToDismissBoxValue;Lcom/google/android/f43;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Landroidx/compose/foundation/gestures/AnchoredDraggableState;", "a", "Landroidx/compose/foundation/gestures/AnchoredDraggableState;", "c", "()Landroidx/compose/foundation/gestures/AnchoredDraggableState;", "anchoredDraggableState", "b", "Lkotlin/jvm/functions/Function1;", "g", "()Lkotlin/jvm/functions/Function1;", "setPositionalThreshold$material3", "(Lkotlin/jvm/functions/Function1;)V", "j", "()Z", "useFlingBehavior", "f", "()F", "offset", "d", "()Landroidx/compose/material3/SwipeToDismissBoxValue;", "currentValue", "i", "targetValue", "h", "settledValue", "e", "dismissDirection", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class s1 {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int d = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AnchoredDraggableState<SwipeToDismissBoxValue> anchoredDraggableState;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public Function1<? super Float, Float> positionalThreshold;

    /* JADX INFO: renamed from: androidx.compose.material3.s1$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JK\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00050\f2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Landroidx/compose/material3/s1$a;", "", "<init>", "()V", "Lkotlin/Function1;", "Landroidx/compose/material3/SwipeToDismissBoxValue;", "", "confirmValueChange", "", "positionalThreshold", "Lcom/google/android/f43;", "density", "Lcom/google/android/k0b;", "Landroidx/compose/material3/s1;", "c", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/google/android/f43;)Lcom/google/android/k0b;", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final SwipeToDismissBoxValue d(o0b o0bVar, s1 s1Var) {
            return s1Var.d();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final s1 e(f43 f43Var, Function1 function1, Function1 function2, SwipeToDismissBoxValue swipeToDismissBoxValue) {
            return new s1(swipeToDismissBoxValue, f43Var, function1, function2);
        }

        @r43
        public final k0b<s1, SwipeToDismissBoxValue> c(final Function1<? super SwipeToDismissBoxValue, Boolean> confirmValueChange, final Function1<? super Float, Float> positionalThreshold, final f43 density) {
            return n0b.e(new Function2() { // from class: com.google.android.phc
                public final Object invoke(Object obj, Object obj2) {
                    return s1.Companion.d((o0b) obj, (s1) obj2);
                }
            }, new Function1() { // from class: com.google.android.qhc
                public final Object invoke(Object obj) {
                    return s1.Companion.e(density, confirmValueChange, positionalThreshold, (SwipeToDismissBoxValue) obj);
                }
            });
        }

        private Companion() {
        }
    }

    @r43
    public s1(SwipeToDismissBoxValue swipeToDismissBoxValue, final f43 f43Var, Function1<? super SwipeToDismissBoxValue, Boolean> function1, Function1<? super Float, Float> function2) {
        tg tgVar = tg.a;
        this.anchoredDraggableState = AnchoredDraggableKt.g(swipeToDismissBoxValue, function2, new Function0() { // from class: com.google.android.ohc
            public final Object invoke() {
                return Float.valueOf(s1.b(f43Var));
            }
        }, tgVar.f(), tgVar.d(), function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float b(f43 f43Var) {
        return f43Var.x2(SwipeToDismissBoxKt.a);
    }

    public final AnchoredDraggableState<SwipeToDismissBoxValue> c() {
        return this.anchoredDraggableState;
    }

    public final SwipeToDismissBoxValue d() {
        return this.anchoredDraggableState.s();
    }

    public final SwipeToDismissBoxValue e() {
        if (f() == 0.0f || Float.isNaN(f())) {
            return SwipeToDismissBoxValue.Settled;
        }
        return f() > 0.0f ? SwipeToDismissBoxValue.StartToEnd : SwipeToDismissBoxValue.EndToStart;
    }

    public final float f() {
        return this.anchoredDraggableState.w();
    }

    public final Function1<Float, Float> g() {
        Function1 function1 = this.positionalThreshold;
        if (function1 != null) {
            return function1;
        }
        Intrinsics.x("positionalThreshold");
        return null;
    }

    public final SwipeToDismissBoxValue h() {
        return this.anchoredDraggableState.y();
    }

    public final SwipeToDismissBoxValue i() {
        return this.anchoredDraggableState.A();
    }

    public final boolean j() {
        return this.positionalThreshold != null;
    }
}
