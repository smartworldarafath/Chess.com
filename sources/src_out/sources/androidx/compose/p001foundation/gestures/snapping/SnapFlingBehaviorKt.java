package androidx.compose.p001foundation.gestures.snapping;

import androidx.compose.p000animation.core.SuspendAnimationKt;
import androidx.compose.p001foundation.gestures.snapping.SnapFlingBehaviorKt;
import com.google.android.q22;
import com.google.android.ut0;
import com.google.inputmethod.AnimationState;
import com.google.inputmethod.bwb;
import com.google.inputmethod.ff3;
import com.google.inputmethod.jr;
import com.google.inputmethod.kr;
import com.google.inputmethod.omc;
import com.google.inputmethod.or;
import com.google.inputmethod.p9b;
import com.google.inputmethod.qr;
import com.google.inputmethod.t04;
import com.google.inputmethod.vq2;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.a;
import kotlin.f;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.g;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a1\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0004\b\b\u0010\t\u001aX\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e0\u0013*\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00032\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e0\r2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00110\u0010H\u0082@¢\u0006\u0004\b\u0014\u0010\u0015\u001a^\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e0\u0013*\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00032\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e0\u00172\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00110\u0010H\u0082@¢\u0006\u0004\b\u0019\u0010\u001a\u001af\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e0\u0013*\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u00032\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e0\u00172\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00110\u0010H\u0082@¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u001b\u0010 \u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u0003H\u0002¢\u0006\u0004\b \u0010!\u001a'\u0010&\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u00032\u0006\u0010%\u001a\u00020\u0003H\u0000¢\u0006\u0004\b&\u0010'\"\u001a\u0010-\u001a\u00020(8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,¨\u0006."}, d2 = {"Lcom/google/android/bwb;", "snapLayoutInfoProvider", "Lcom/google/android/vq2;", "", "decayAnimationSpec", "Lcom/google/android/kr;", "snapAnimationSpec", "Lcom/google/android/omc;", "p", "(Lcom/google/android/bwb;Lcom/google/android/vq2;Lcom/google/android/kr;)Lcom/google/android/omc;", "Lcom/google/android/p9b;", "initialTargetOffset", "initialVelocity", "Landroidx/compose/foundation/gestures/snapping/b;", "Lcom/google/android/qr;", "animation", "Lkotlin/Function1;", "", "onAnimationStep", "Landroidx/compose/foundation/gestures/snapping/a;", "k", "(Lcom/google/android/p9b;FFLandroidx/compose/foundation/gestures/snapping/b;Lkotlin/jvm/functions/Function1;Lcom/google/android/q22;)Ljava/lang/Object;", "targetOffset", "Lcom/google/android/nr;", "animationState", "f", "(Lcom/google/android/p9b;FLcom/google/android/nr;Lcom/google/android/vq2;Lkotlin/jvm/functions/Function1;Lcom/google/android/q22;)Ljava/lang/Object;", "cancelOffset", "animationSpec", "i", "(Lcom/google/android/p9b;FFLcom/google/android/nr;Lcom/google/android/kr;Lkotlin/jvm/functions/Function1;Lcom/google/android/q22;)Ljava/lang/Object;", "target", "n", "(FF)F", "Landroidx/compose/foundation/gestures/snapping/d;", "snappingOffset", "lowerBound", "upperBound", "l", "(IFF)F", "Lcom/google/android/ff3;", "a", "F", "o", "()F", "MinFlingVelocityDp", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class SnapFlingBehaviorKt {
    private static final float a = ff3.i(400);

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object f(final p9b p9bVar, final float f, AnimationState<Float, qr> animationState, vq2<Float> vq2Var, final Function1<? super Float, Unit> function1, q22<? super a<Float, qr>> q22Var) {
        SnapFlingBehaviorKt$animateDecay$1 snapFlingBehaviorKt$animateDecay$1;
        Ref.FloatRef floatRef;
        if (q22Var instanceof SnapFlingBehaviorKt$animateDecay$1) {
            snapFlingBehaviorKt$animateDecay$1 = (SnapFlingBehaviorKt$animateDecay$1) q22Var;
            int i = snapFlingBehaviorKt$animateDecay$1.label;
            if ((i & t04.INVALID_ID) != 0) {
                snapFlingBehaviorKt$animateDecay$1.label = i - t04.INVALID_ID;
            } else {
                snapFlingBehaviorKt$animateDecay$1 = new SnapFlingBehaviorKt$animateDecay$1(q22Var);
            }
        } else {
            snapFlingBehaviorKt$animateDecay$1 = new SnapFlingBehaviorKt$animateDecay$1(q22Var);
        }
        Object obj = snapFlingBehaviorKt$animateDecay$1.result;
        Object objG = a.g();
        int i2 = snapFlingBehaviorKt$animateDecay$1.label;
        if (i2 == 0) {
            f.b(obj);
            final Ref.FloatRef floatRef2 = new Ref.FloatRef();
            boolean z = animationState.q().floatValue() == 0.0f;
            Function1 function2 = new Function1() { // from class: com.google.android.zvb
                public final Object invoke(Object obj2) {
                    return SnapFlingBehaviorKt.h(f, floatRef2, p9bVar, function1, (jr) obj2);
                }
            };
            snapFlingBehaviorKt$animateDecay$1.L$0 = animationState;
            snapFlingBehaviorKt$animateDecay$1.L$1 = floatRef2;
            snapFlingBehaviorKt$animateDecay$1.F$0 = f;
            snapFlingBehaviorKt$animateDecay$1.label = 1;
            if (SuspendAnimationKt.u(animationState, vq2Var, !z, function2, snapFlingBehaviorKt$animateDecay$1) == objG) {
                return objG;
            }
            floatRef = floatRef2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f = snapFlingBehaviorKt$animateDecay$1.F$0;
            floatRef = (Ref.FloatRef) snapFlingBehaviorKt$animateDecay$1.L$1;
            animationState = (AnimationState) snapFlingBehaviorKt$animateDecay$1.L$0;
            f.b(obj);
        }
        return new a(ut0.d(f - floatRef.element), animationState);
    }

    private static final void g(jr<Float, qr> jrVar, p9b p9bVar, Function1<? super Float, Unit> function1, float f) {
        float fE;
        try {
            fE = p9bVar.e(f);
        } catch (CancellationException unused) {
            jrVar.a();
            fE = 0.0f;
        }
        function1.invoke(Float.valueOf(fE));
        if (Math.abs(f - fE) > 0.5f) {
            jrVar.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(float f, Ref.FloatRef floatRef, p9b p9bVar, Function1 function1, jr jrVar) {
        if (Math.abs(((Number) jrVar.e()).floatValue()) >= Math.abs(f)) {
            float fN = n(((Number) jrVar.e()).floatValue(), f);
            g(jrVar, p9bVar, function1, fN - floatRef.element);
            jrVar.a();
            floatRef.element = fN;
        } else {
            g(jrVar, p9bVar, function1, ((Number) jrVar.e()).floatValue() - floatRef.element);
            floatRef.element = ((Number) jrVar.e()).floatValue();
        }
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    public static final Object i(final p9b p9bVar, float f, final float f2, AnimationState<Float, qr> animationState, kr<Float> krVar, final Function1<? super Float, Unit> function1, q22<? super a<Float, qr>> q22Var) {
        SnapFlingBehaviorKt$animateWithTarget$1 snapFlingBehaviorKt$animateWithTarget$1;
        float f3;
        AnimationState<Float, qr> animationState2;
        Ref.FloatRef floatRef;
        float f4;
        if (q22Var instanceof SnapFlingBehaviorKt$animateWithTarget$1) {
            snapFlingBehaviorKt$animateWithTarget$1 = (SnapFlingBehaviorKt$animateWithTarget$1) q22Var;
            int i = snapFlingBehaviorKt$animateWithTarget$1.label;
            if ((i & t04.INVALID_ID) != 0) {
                snapFlingBehaviorKt$animateWithTarget$1.label = i - t04.INVALID_ID;
            } else {
                snapFlingBehaviorKt$animateWithTarget$1 = new SnapFlingBehaviorKt$animateWithTarget$1(q22Var);
            }
        } else {
            snapFlingBehaviorKt$animateWithTarget$1 = new SnapFlingBehaviorKt$animateWithTarget$1(q22Var);
        }
        SnapFlingBehaviorKt$animateWithTarget$1 snapFlingBehaviorKt$animateWithTarget$2 = snapFlingBehaviorKt$animateWithTarget$1;
        Object obj = snapFlingBehaviorKt$animateWithTarget$2.result;
        Object objG = a.g();
        int i2 = snapFlingBehaviorKt$animateWithTarget$2.label;
        if (i2 == 0) {
            f.b(obj);
            final Ref.FloatRef floatRef2 = new Ref.FloatRef();
            float fFloatValue = animationState.q().floatValue();
            Float fD = ut0.d(f);
            boolean z = animationState.q().floatValue() == 0.0f;
            Function1 function2 = new Function1() { // from class: com.google.android.awb
                public final Object invoke(Object obj2) {
                    return SnapFlingBehaviorKt.j(f2, floatRef2, p9bVar, function1, (jr) obj2);
                }
            };
            snapFlingBehaviorKt$animateWithTarget$2.L$0 = animationState;
            snapFlingBehaviorKt$animateWithTarget$2.L$1 = floatRef2;
            f3 = f;
            snapFlingBehaviorKt$animateWithTarget$2.F$0 = f3;
            snapFlingBehaviorKt$animateWithTarget$2.F$1 = fFloatValue;
            snapFlingBehaviorKt$animateWithTarget$2.label = 1;
            if (SuspendAnimationKt.x(animationState, fD, krVar, !z, function2, snapFlingBehaviorKt$animateWithTarget$2) == objG) {
                return objG;
            }
            animationState2 = animationState;
            floatRef = floatRef2;
            f4 = fFloatValue;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f4 = snapFlingBehaviorKt$animateWithTarget$2.F$1;
            float f5 = snapFlingBehaviorKt$animateWithTarget$2.F$0;
            floatRef = (Ref.FloatRef) snapFlingBehaviorKt$animateWithTarget$2.L$1;
            AnimationState<Float, qr> animationState3 = (AnimationState) snapFlingBehaviorKt$animateWithTarget$2.L$0;
            f.b(obj);
            f3 = f5;
            animationState2 = animationState3;
        }
        return new a(ut0.d(f3 - floatRef.element), or.g(animationState2, 0.0f, n(animationState2.q().floatValue(), f4), 0L, 0L, false, 29, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(float f, Ref.FloatRef floatRef, p9b p9bVar, Function1 function1, jr jrVar) {
        float fE;
        float fN = n(((Number) jrVar.e()).floatValue(), f);
        float f2 = fN - floatRef.element;
        try {
            fE = p9bVar.e(f2);
        } catch (CancellationException unused) {
            jrVar.a();
            fE = 0.0f;
        }
        function1.invoke(Float.valueOf(fE));
        if (Math.abs(f2 - fE) > 0.5f || fN != ((Number) jrVar.e()).floatValue()) {
            jrVar.a();
        }
        floatRef.element += fE;
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object k(p9b p9bVar, float f, float f2, b<Float, qr> bVar, Function1<? super Float, Unit> function1, q22<? super a<Float, qr>> q22Var) {
        return bVar.a(p9bVar, ut0.d(f), ut0.d(f2), function1, q22Var);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0024  */
    public static final float l(int i, float f, float f2) {
        d.Companion companion = d.INSTANCE;
        if (d.e(i, companion.a())) {
            if (Math.abs(f2) <= Math.abs(f)) {
                f = f2;
            }
        } else if (d.e(i, companion.b())) {
            f = f2;
        } else if (!d.e(i, companion.c())) {
            f = 0.0f;
        }
        if (m(f)) {
            return f;
        }
        return 0.0f;
    }

    private static final boolean m(float f) {
        return (f == Float.POSITIVE_INFINITY || f == Float.NEGATIVE_INFINITY) ? false : true;
    }

    private static final float n(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        return f2 > 0.0f ? g.i(f, f2) : g.d(f, f2);
    }

    public static final float o() {
        return a;
    }

    public static final omc p(bwb bwbVar, vq2<Float> vq2Var, kr<Float> krVar) {
        return new SnapFlingBehavior(bwbVar, vq2Var, krVar);
    }
}
