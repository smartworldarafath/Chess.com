package androidx.compose.p001foundation.gestures.snapping;

import com.google.android.lq2;
import com.google.android.q22;
import com.google.android.ta2;
import com.google.android.ut0;
import com.google.inputmethod.AnimationState;
import com.google.inputmethod.cx5;
import com.google.inputmethod.kr;
import com.google.inputmethod.or;
import com.google.inputmethod.p9b;
import com.google.inputmethod.qr;
import com.google.inputmethod.xq2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/google/android/ta2;", "Landroidx/compose/foundation/gestures/snapping/a;", "", "Lcom/google/android/qr;", "<anonymous>", "(Lcom/google/android/ta2;)Landroidx/compose/foundation/gestures/snapping/a;"}, k = 3, mv = {2, 1, 0})
@lq2(c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$result$1", f = "SnapFlingBehavior.kt", l = {134, 150}, m = "invokeSuspend", v = 1)
final class SnapFlingBehavior$fling$result$1 extends SuspendLambda implements Function2<ta2, q22<? super a<Float, qr>>, Object> {
    final /* synthetic */ float $initialVelocity;
    final /* synthetic */ Function1<Float, Unit> $onRemainingScrollOffsetUpdate;
    final /* synthetic */ p9b $this_fling;
    Object L$0;
    int label;
    final /* synthetic */ SnapFlingBehavior this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SnapFlingBehavior$fling$result$1(SnapFlingBehavior snapFlingBehavior, float f, Function1<? super Float, Unit> function1, p9b p9bVar, q22<? super SnapFlingBehavior$fling$result$1> q22Var) {
        super(2, q22Var);
        this.this$0 = snapFlingBehavior;
        this.$initialVelocity = f;
        this.$onRemainingScrollOffsetUpdate = function1;
        this.$this_fling = p9bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(Ref.FloatRef floatRef, Function1 function1, float f) {
        float f2 = floatRef.element - f;
        floatRef.element = f2;
        function1.invoke(Float.valueOf(f2));
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o(Ref.FloatRef floatRef, Function1 function1, float f) {
        float f2 = floatRef.element - f;
        floatRef.element = f2;
        function1.invoke(Float.valueOf(f2));
        return Unit.a;
    }

    public final q22<Unit> create(Object obj, q22<?> q22Var) {
        return new SnapFlingBehavior$fling$result$1(this.this$0, this.$initialVelocity, this.$onRemainingScrollOffsetUpdate, this.$this_fling, q22Var);
    }

    public final Object invoke(ta2 ta2Var, q22<? super a<Float, qr>> q22Var) {
        return create(ta2Var, q22Var).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        final Ref.FloatRef floatRef;
        Object objM;
        Object objG = a.g();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            float fB = this.this$0.snapLayoutInfoProvider.b(this.$initialVelocity, xq2.a(this.this$0.decayAnimationSpec, 0.0f, this.$initialVelocity));
            if (Float.isNaN(fB)) {
                cx5.c("calculateApproachOffset returned NaN. Please use a valid value.");
            }
            floatRef = new Ref.FloatRef();
            float fAbs = Math.abs(fB) * Math.signum(this.$initialVelocity);
            floatRef.element = fAbs;
            this.$onRemainingScrollOffsetUpdate.invoke(ut0.d(fAbs));
            SnapFlingBehavior snapFlingBehavior = this.this$0;
            p9b p9bVar = this.$this_fling;
            float f = floatRef.element;
            float f2 = this.$initialVelocity;
            final Function1<Float, Unit> function1 = this.$onRemainingScrollOffsetUpdate;
            Function1 function2 = new Function1() { // from class: androidx.compose.foundation.gestures.snapping.h
                public final Object invoke(Object obj2) {
                    return SnapFlingBehavior$fling$result$1.m(floatRef, function1, ((Float) obj2).floatValue());
                }
            };
            this.L$0 = floatRef;
            this.label = 1;
            objM = snapFlingBehavior.m(p9bVar, f, f2, function2, this);
            if (objM != objG) {
            }
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
            return obj;
        }
        Ref.FloatRef floatRef2 = (Ref.FloatRef) this.L$0;
        f.b(obj);
        floatRef = floatRef2;
        objM = obj;
        AnimationState animationState = (AnimationState) objM;
        float fA = this.this$0.snapLayoutInfoProvider.a(((Number) animationState.q()).floatValue());
        if (Float.isNaN(fA)) {
            cx5.c("calculateSnapOffset returned NaN. Please use a valid value.");
        }
        floatRef.element = fA;
        p9b p9bVar2 = this.$this_fling;
        AnimationState animationStateG = or.g(animationState, 0.0f, 0.0f, 0L, 0L, false, 30, null);
        kr krVar = this.this$0.snapAnimationSpec;
        final Function1<Float, Unit> function3 = this.$onRemainingScrollOffsetUpdate;
        Function1 function4 = new Function1() { // from class: androidx.compose.foundation.gestures.snapping.i
            public final Object invoke(Object obj2) {
                return SnapFlingBehavior$fling$result$1.o(floatRef, function3, ((Float) obj2).floatValue());
            }
        };
        this.L$0 = null;
        this.label = 2;
        Object objI = SnapFlingBehaviorKt.i(p9bVar2, fA, fA, animationStateG, krVar, function4, this);
        return objI == objG ? objG : objI;
    }
}
