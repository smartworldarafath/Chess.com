package androidx.compose.p002material3.p003internal;

import androidx.compose.p001foundation.MutatePriority;
import androidx.compose.p002material3.p003internal.AnchoredDraggableState;
import androidx.compose.p004runtime.p0;
import androidx.compose.p004runtime.s0;
import com.google.android.ps4;
import com.google.android.q22;
import com.google.android.rs4;
import com.google.inputmethod.cg3;
import com.google.inputmethod.kr;
import com.google.inputmethod.l48;
import com.google.inputmethod.o58;
import com.google.inputmethod.og3;
import com.google.inputmethod.q6c;
import com.google.inputmethod.qg;
import com.google.inputmethod.t04;
import com.google.inputmethod.tm9;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.a;
import kotlin.f;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.g;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b*\b\u0001\u0018\u0000 b*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u00012B[\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\t0\u0007\u0012\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0014\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0005¢\u0006\u0004\b\u0019\u0010\u001aJ%\u0010\u001f\u001a\u00020\u001e2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b2\b\b\u0002\u0010\u001d\u001a\u00028\u0000¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010!\u001a\u00020\u001e2\u0006\u0010\u0011\u001a\u00020\u0005H\u0086@¢\u0006\u0004\b!\u0010\"JJ\u0010)\u001a\u00020\u001e2\b\b\u0002\u0010$\u001a\u00020#2.\u0010(\u001a*\b\u0001\u0012\u0004\u0012\u00020&\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0'\u0012\u0006\u0012\u0004\u0018\u00010\u00020%H\u0086@¢\u0006\u0004\b)\u0010*JX\u0010,\u001a\u00020\u001e2\u0006\u0010\u0016\u001a\u00028\u00002\b\b\u0002\u0010$\u001a\u00020#24\u0010(\u001a0\b\u0001\u0012\u0004\u0012\u00020&\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001b\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0'\u0012\u0006\u0012\u0004\u0018\u00010\u00020+H\u0086@¢\u0006\u0004\b,\u0010-J\u0017\u0010/\u001a\u00020\u00052\u0006\u0010.\u001a\u00020\u0005H\u0000¢\u0006\u0004\b/\u00100J\u0015\u00101\u001a\u00020\u00052\u0006\u0010.\u001a\u00020\u0005¢\u0006\u0004\b1\u00100R&\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R#\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\t0\u00078\u0006¢\u0006\f\n\u0004\b:\u00107\u001a\u0004\b;\u00109R&\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000b0\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b<\u00103\u001a\u0004\b=\u00105R\u0014\u0010A\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u001a\u0010G\u001a\u00020B8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR+\u0010\u0010\u001a\u00028\u00002\u0006\u0010H\u001a\u00028\u00008F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\u001b\u0010\u0016\u001a\u00028\u00008FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010LR\u001b\u0010S\u001a\u00028\u00008@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b)\u0010P\u001a\u0004\bR\u0010LR+\u0010\u000f\u001a\u00020\u00052\u0006\u0010H\u001a\u00020\u00058F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b,\u0010T\u001a\u0004\bU\u0010\u001a\"\u0004\bV\u0010WR\u001b\u0010Z\u001a\u00020\u00058GX\u0086\u0084\u0002¢\u0006\f\n\u0004\bX\u0010P\u001a\u0004\bY\u0010\u001aR+\u0010^\u001a\u00020\u00052\u0006\u0010H\u001a\u00020\u00058F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b[\u0010T\u001a\u0004\b\\\u0010\u001a\"\u0004\b]\u0010WR/\u0010a\u001a\u0004\u0018\u00018\u00002\b\u0010H\u001a\u0004\u0018\u00018\u00008B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010J\u001a\u0004\b_\u0010L\"\u0004\b`\u0010NR7\u0010f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b2\f\u0010H\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0014\u0010J\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR\u0014\u0010h\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010gR\u0011\u0010k\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\bi\u0010j¨\u0006l"}, d2 = {"Landroidx/compose/material3/internal/AnchoredDraggableState;", "T", "", "initialValue", "Lkotlin/Function1;", "", "positionalThreshold", "Lkotlin/Function0;", "velocityThreshold", "Lcom/google/android/kr;", "animationSpec", "", "confirmValueChange", "<init>", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "offset", "currentValue", "velocity", "m", "(FLjava/lang/Object;F)Ljava/lang/Object;", "n", "(FLjava/lang/Object;)Ljava/lang/Object;", "targetValue", "K", "(Ljava/lang/Object;)Z", "C", "()F", "Lcom/google/android/cg3;", "newAnchors", "newTarget", "", "M", "(Lcom/google/android/cg3;Ljava/lang/Object;)V", "I", "(FLcom/google/android/q22;)Ljava/lang/Object;", "Landroidx/compose/foundation/MutatePriority;", "dragPriority", "Lkotlin/Function3;", "Lcom/google/android/qg;", "Lcom/google/android/q22;", "block", "i", "(Landroidx/compose/foundation/MutatePriority;Lcom/google/android/ps4;Lcom/google/android/q22;)Ljava/lang/Object;", "Lkotlin/Function4;", "j", "(Ljava/lang/Object;Landroidx/compose/foundation/MutatePriority;Lcom/google/android/rs4;Lcom/google/android/q22;)Ljava/lang/Object;", "delta", "A", "(F)F", "o", "a", "Lkotlin/jvm/functions/Function1;", "getPositionalThreshold$material3", "()Lkotlin/jvm/functions/Function1;", "b", "Lkotlin/jvm/functions/Function0;", "getVelocityThreshold$material3", "()Lkotlin/jvm/functions/Function0;", "c", "q", "d", "s", "Landroidx/compose/material3/internal/InternalMutatorMutex;", "e", "Landroidx/compose/material3/internal/InternalMutatorMutex;", "dragMutex", "Lcom/google/android/og3;", "f", "Lcom/google/android/og3;", "v", "()Lcom/google/android/og3;", "draggableState", "<set-?>", "g", "Lcom/google/android/o58;", "t", "()Ljava/lang/Object;", "E", "(Ljava/lang/Object;)V", "h", "Lcom/google/android/q6c;", "y", "r", "closestValue", "Lcom/google/android/l48;", "x", "H", "(F)V", "k", "getProgress", "progress", "l", "w", "G", "lastVelocity", "u", "F", "dragTarget", "p", "()Lcom/google/android/cg3;", "D", "(Lcom/google/android/cg3;)V", "anchors", "Lcom/google/android/qg;", "anchoredDragScope", "z", "()Z", "isAnimationRunning", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AnchoredDraggableState<T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Function1<Float, Float> positionalThreshold;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Function0<Float> velocityThreshold;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Function0<kr<Float>> animationSpec;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Function1<T, Boolean> confirmValueChange;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final o58 currentValue;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InternalMutatorMutex dragMutex = new InternalMutatorMutex();

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final og3 draggableState = new AnchoredDraggableState$draggableState$1(this);

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final q6c targetValue = p0.e(new Function0() { // from class: com.google.android.yg
        public final Object invoke() {
            return AnchoredDraggableState.J(this.a);
        }
    });

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final q6c closestValue = p0.e(new Function0() { // from class: com.google.android.ah
        public final Object invoke() {
            return AnchoredDraggableState.l(this.a);
        }
    });

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final l48 offset = tm9.a(Float.NaN);

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final q6c progress = p0.d(p0.t(), new Function0() { // from class: com.google.android.ch
        public final Object invoke() {
            return Float.valueOf(AnchoredDraggableState.B(this.a));
        }
    });

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final l48 lastVelocity = tm9.a(0.0f);

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final o58 dragTarget = s0.e(null, null, 2, null);

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final o58 anchors = s0.e(AnchoredDraggableKt.f(), null, 2, null);

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final qg anchoredDragScope = new b(this);

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"androidx/compose/material3/internal/AnchoredDraggableState$b", "Lcom/google/android/qg;", "", "newOffset", "lastKnownVelocity", "", "a", "(FF)V", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b implements qg {
        final /* synthetic */ AnchoredDraggableState<T> a;

        b(AnchoredDraggableState<T> anchoredDraggableState) {
            this.a = anchoredDraggableState;
        }

        @Override // com.google.inputmethod.qg
        public void a(float newOffset, float lastKnownVelocity) {
            this.a.H(newOffset);
            this.a.G(lastKnownVelocity);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AnchoredDraggableState(T t, Function1<? super Float, Float> function1, Function0<Float> function0, Function0<? extends kr<Float>> function2, Function1<? super T, Boolean> function3) {
        this.positionalThreshold = function1;
        this.velocityThreshold = function0;
        this.animationSpec = function2;
        this.confirmValueChange = function3;
        this.currentValue = s0.e(t, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final float B(AnchoredDraggableState anchoredDraggableState) {
        float fC = anchoredDraggableState.p().c(anchoredDraggableState.t());
        float fC2 = anchoredDraggableState.p().c(anchoredDraggableState.r()) - fC;
        float fAbs = Math.abs(fC2);
        if (Float.isNaN(fAbs) || fAbs <= 1.0E-6f) {
            return 1.0f;
        }
        float fC3 = (anchoredDraggableState.C() - fC) / fC2;
        if (fC3 < 1.0E-6f) {
            return 0.0f;
        }
        if (fC3 > 0.999999f) {
            return 1.0f;
        }
        return fC3;
    }

    private final void D(cg3<T> cg3Var) {
        this.anchors.setValue(cg3Var);
    }

    private final void E(T t) {
        this.currentValue.setValue(t);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F(T t) {
        this.dragTarget.setValue(t);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G(float f) {
        this.lastVelocity.p(f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H(float f) {
        this.offset.p(f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object J(AnchoredDraggableState anchoredDraggableState) {
        Object objU = anchoredDraggableState.u();
        if (objU != null) {
            return objU;
        }
        float fX = anchoredDraggableState.x();
        return !Float.isNaN(fX) ? anchoredDraggableState.m(fX, anchoredDraggableState.t(), 0.0f) : anchoredDraggableState.t();
    }

    private final boolean K(final T targetValue) {
        return this.dragMutex.e(new Function0() { // from class: com.google.android.eh
            public final Object invoke() {
                return AnchoredDraggableState.L(this.a, targetValue);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit L(AnchoredDraggableState anchoredDraggableState, Object obj) {
        qg qgVar = anchoredDraggableState.anchoredDragScope;
        float fC = anchoredDraggableState.p().c(obj);
        if (!Float.isNaN(fC)) {
            qg.b(qgVar, fC, 0.0f, 2, null);
            anchoredDraggableState.F(null);
        }
        anchoredDraggableState.E(obj);
        return Unit.a;
    }

    public static /* synthetic */ Object k(AnchoredDraggableState anchoredDraggableState, Object obj, MutatePriority mutatePriority, rs4 rs4Var, q22 q22Var, int i, Object obj2) {
        if ((i & 2) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return anchoredDraggableState.j(obj, mutatePriority, rs4Var, q22Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object l(AnchoredDraggableState anchoredDraggableState) {
        Object objU = anchoredDraggableState.u();
        if (objU != null) {
            return objU;
        }
        float fX = anchoredDraggableState.x();
        return !Float.isNaN(fX) ? anchoredDraggableState.n(fX, anchoredDraggableState.t()) : anchoredDraggableState.t();
    }

    private final T m(float offset, T currentValue, float velocity) {
        cg3<T> cg3VarP = p();
        float fC = cg3VarP.c(currentValue);
        float fFloatValue = ((Number) this.velocityThreshold.invoke()).floatValue();
        if (fC != offset && !Float.isNaN(fC)) {
            if (fC < offset) {
                if (velocity >= fFloatValue) {
                    T tA = cg3VarP.a(offset, true);
                    Intrinsics.g(tA);
                    return tA;
                }
                T tA2 = cg3VarP.a(offset, true);
                Intrinsics.g(tA2);
                if (offset >= Math.abs(fC + Math.abs(((Number) this.positionalThreshold.invoke(Float.valueOf(Math.abs(cg3VarP.c(tA2) - fC)))).floatValue()))) {
                    return tA2;
                }
            } else {
                if (velocity <= (-fFloatValue)) {
                    T tA3 = cg3VarP.a(offset, false);
                    Intrinsics.g(tA3);
                    return tA3;
                }
                T tA4 = cg3VarP.a(offset, false);
                Intrinsics.g(tA4);
                float fAbs = Math.abs(fC - Math.abs(((Number) this.positionalThreshold.invoke(Float.valueOf(Math.abs(fC - cg3VarP.c(tA4))))).floatValue()));
                if (offset >= 0.0f ? offset <= fAbs : Math.abs(offset) >= fAbs) {
                    return tA4;
                }
            }
        }
        return currentValue;
    }

    private final T n(float offset, T currentValue) {
        cg3<T> cg3VarP = p();
        float fC = cg3VarP.c(currentValue);
        if (fC != offset && !Float.isNaN(fC)) {
            if (fC < offset) {
                T tA = cg3VarP.a(offset, true);
                if (tA != null) {
                    return tA;
                }
            } else {
                T tA2 = cg3VarP.a(offset, false);
                if (tA2 != null) {
                    return tA2;
                }
            }
        }
        return currentValue;
    }

    private final T u() {
        return this.dragTarget.getValue();
    }

    public final float A(float delta) {
        return g.n((Float.isNaN(x()) ? 0.0f : x()) + delta, p().e(), p().f());
    }

    public final float C() {
        if (Float.isNaN(x())) {
            throw new IllegalStateException("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?");
        }
        return x();
    }

    public final Object I(float f, q22<? super Unit> q22Var) {
        T t = t();
        T tM = m(C(), t, f);
        if (((Boolean) this.confirmValueChange.invoke(tM)).booleanValue()) {
            Object objD = AnchoredDraggableKt.d(this, tM, f, q22Var);
            return objD == a.g() ? objD : Unit.a;
        }
        Object objD2 = AnchoredDraggableKt.d(this, t, f, q22Var);
        return objD2 == a.g() ? objD2 : Unit.a;
    }

    public final void M(cg3<T> newAnchors, T newTarget) {
        if (Intrinsics.e(p(), newAnchors)) {
            return;
        }
        D(newAnchors);
        if (K(newTarget)) {
            return;
        }
        F(newTarget);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i(MutatePriority mutatePriority, ps4<? super qg, ? super cg3<T>, ? super q22<? super Unit>, ? extends Object> ps4Var, q22<? super Unit> q22Var) {
        AnchoredDraggableState$anchoredDrag$1 anchoredDraggableState$anchoredDrag$1;
        if (q22Var instanceof AnchoredDraggableState$anchoredDrag$1) {
            anchoredDraggableState$anchoredDrag$1 = (AnchoredDraggableState$anchoredDrag$1) q22Var;
            int i = anchoredDraggableState$anchoredDrag$1.label;
            if ((i & t04.INVALID_ID) != 0) {
                anchoredDraggableState$anchoredDrag$1.label = i - t04.INVALID_ID;
            } else {
                anchoredDraggableState$anchoredDrag$1 = new AnchoredDraggableState$anchoredDrag$1(this, q22Var);
            }
        } else {
            anchoredDraggableState$anchoredDrag$1 = new AnchoredDraggableState$anchoredDrag$1(this, q22Var);
        }
        Object obj = anchoredDraggableState$anchoredDrag$1.result;
        Object objG = a.g();
        int i2 = anchoredDraggableState$anchoredDrag$1.label;
        try {
            if (i2 == 0) {
                f.b(obj);
                InternalMutatorMutex internalMutatorMutex = this.dragMutex;
                AnchoredDraggableState$anchoredDrag$2 anchoredDraggableState$anchoredDrag$2 = new AnchoredDraggableState$anchoredDrag$2(this, ps4Var, null);
                anchoredDraggableState$anchoredDrag$1.label = 1;
                if (internalMutatorMutex.d(mutatePriority, anchoredDraggableState$anchoredDrag$2, anchoredDraggableState$anchoredDrag$1) == objG) {
                    return objG;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                f.b(obj);
            }
            T tB = p().b(x());
            if (tB != null && Math.abs(x() - p().c(tB)) <= 0.5f && ((Boolean) this.confirmValueChange.invoke(tB)).booleanValue()) {
                E(tB);
            }
            return Unit.a;
        } catch (Throwable th) {
            T tB2 = p().b(x());
            if (tB2 != null && Math.abs(x() - p().c(tB2)) <= 0.5f && ((Boolean) this.confirmValueChange.invoke(tB2)).booleanValue()) {
                E(tB2);
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object j(T t, MutatePriority mutatePriority, rs4<? super qg, ? super cg3<T>, ? super T, ? super q22<? super Unit>, ? extends Object> rs4Var, q22<? super Unit> q22Var) {
        AnchoredDraggableState$anchoredDrag$3 anchoredDraggableState$anchoredDrag$3;
        if (q22Var instanceof AnchoredDraggableState$anchoredDrag$3) {
            anchoredDraggableState$anchoredDrag$3 = (AnchoredDraggableState$anchoredDrag$3) q22Var;
            int i = anchoredDraggableState$anchoredDrag$3.label;
            if ((i & t04.INVALID_ID) != 0) {
                anchoredDraggableState$anchoredDrag$3.label = i - t04.INVALID_ID;
            } else {
                anchoredDraggableState$anchoredDrag$3 = new AnchoredDraggableState$anchoredDrag$3(this, q22Var);
            }
        } else {
            anchoredDraggableState$anchoredDrag$3 = new AnchoredDraggableState$anchoredDrag$3(this, q22Var);
        }
        Object obj = anchoredDraggableState$anchoredDrag$3.result;
        Object objG = a.g();
        int i2 = anchoredDraggableState$anchoredDrag$3.label;
        try {
            if (i2 == 0) {
                f.b(obj);
                if (p().d(t)) {
                    InternalMutatorMutex internalMutatorMutex = this.dragMutex;
                    AnchoredDraggableState$anchoredDrag$4 anchoredDraggableState$anchoredDrag$4 = new AnchoredDraggableState$anchoredDrag$4(this, t, rs4Var, null);
                    anchoredDraggableState$anchoredDrag$3.label = 1;
                    if (internalMutatorMutex.d(mutatePriority, anchoredDraggableState$anchoredDrag$4, anchoredDraggableState$anchoredDrag$3) == objG) {
                        return objG;
                    }
                } else {
                    E(t);
                }
                return Unit.a;
            }
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
            F(null);
            T tB = p().b(x());
            if (tB != null && Math.abs(x() - p().c(tB)) <= 0.5f && ((Boolean) this.confirmValueChange.invoke(tB)).booleanValue()) {
                E(tB);
            }
            return Unit.a;
        } catch (Throwable th) {
            F(null);
            T tB2 = p().b(x());
            if (tB2 != null && Math.abs(x() - p().c(tB2)) <= 0.5f && ((Boolean) this.confirmValueChange.invoke(tB2)).booleanValue()) {
                E(tB2);
            }
            throw th;
        }
    }

    public final float o(float delta) {
        float fA = A(delta);
        float fX = Float.isNaN(x()) ? 0.0f : x();
        H(fA);
        return fA - fX;
    }

    public final cg3<T> p() {
        return (cg3) this.anchors.getValue();
    }

    public final Function0<kr<Float>> q() {
        return this.animationSpec;
    }

    public final T r() {
        return (T) this.closestValue.getValue();
    }

    public final Function1<T, Boolean> s() {
        return this.confirmValueChange;
    }

    public final T t() {
        return this.currentValue.getValue();
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final og3 getDraggableState() {
        return this.draggableState;
    }

    public final float w() {
        return this.lastVelocity.b();
    }

    public final float x() {
        return this.offset.b();
    }

    public final T y() {
        return (T) this.targetValue.getValue();
    }

    public final boolean z() {
        return u() != null;
    }
}
