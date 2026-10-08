package androidx.compose.p001foundation.gestures;

import androidx.compose.p001foundation.MutatePriority;
import androidx.compose.p001foundation.MutatorMutex;
import androidx.compose.p001foundation.gestures.AnchoredDraggableState;
import androidx.compose.p004runtime.p0;
import androidx.compose.p004runtime.s0;
import com.google.android.ps4;
import com.google.android.q22;
import com.google.android.r43;
import com.google.android.rs4;
import com.google.inputmethod.cx5;
import com.google.inputmethod.dg3;
import com.google.inputmethod.kr;
import com.google.inputmethod.l48;
import com.google.inputmethod.o58;
import com.google.inputmethod.q6c;
import com.google.inputmethod.rg;
import com.google.inputmethod.t04;
import com.google.inputmethod.tm9;
import com.google.inputmethod.up1;
import com.google.inputmethod.vq2;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.a;
import kotlin.f;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.g;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000w\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\b\u000b*\u0001w\b\u0007\u0018\u0000 \u0080\u0001*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001*B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0017\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\u0004\u0010\tJ\u0017\u0010\f\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u0017\u0010\u0001\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0001\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0017\u001a\u00020\u00162\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u00132\b\b\u0002\u0010\u0015\u001a\u00028\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\nH\u0087@¢\u0006\u0004\b\u001a\u0010\u001bJJ\u0010\"\u001a\u00020\u00162\b\b\u0002\u0010\u001d\u001a\u00020\u001c2.\u0010!\u001a*\b\u0001\u0012\u0004\u0012\u00020\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160 \u0012\u0006\u0012\u0004\u0018\u00010\u00020\u001eH\u0086@¢\u0006\u0004\b\"\u0010#JX\u0010%\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00028\u00002\b\b\u0002\u0010\u001d\u001a\u00020\u001c24\u0010!\u001a0\b\u0001\u0012\u0004\u0012\u00020\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0013\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160 \u0012\u0006\u0012\u0004\u0018\u00010\u00020$H\u0086@¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020\n2\u0006\u0010'\u001a\u00020\nH\u0000¢\u0006\u0004\b(\u0010)R.\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R.\u00103\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u00068\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b0\u0010+\u001a\u0004\b1\u0010-\"\u0004\b2\u0010/R(\u0010;\u001a\b\u0012\u0004\u0012\u00020\n048\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R<\u0010F\u001a\b\u0012\u0004\u0012\u00020\n0<2\f\u0010=\u001a\b\u0012\u0004\u0012\u00020\n0<8\u0006@@X\u0087.¢\u0006\u0018\n\u0004\b>\u0010?\u0012\u0004\bD\u0010E\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR<\u0010O\u001a\b\u0012\u0004\u0012\u00020\n0G2\f\u0010=\u001a\b\u0012\u0004\u0012\u00020\n0G8\u0006@@X\u0087.¢\u0006\u0018\n\u0004\bH\u0010I\u0012\u0004\bN\u0010E\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\u0014\u0010S\u001a\u00020P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR+\u0010Z\u001a\u00028\u00002\u0006\u0010T\u001a\u00028\u00008F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bU\u0010V\u001a\u0004\bW\u0010X\"\u0004\bY\u0010\u0005R+\u0010^\u001a\u00028\u00002\u0006\u0010T\u001a\u00028\u00008F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b[\u0010V\u001a\u0004\b\\\u0010X\"\u0004\b]\u0010\u0005R\u001b\u0010\u000f\u001a\u00028\u00008FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b_\u0010`\u001a\u0004\ba\u0010XR+\u0010f\u001a\u00020\n2\u0006\u0010T\u001a\u00020\n8G@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\"\u0010b\u001a\u0004\bc\u0010\u0012\"\u0004\bd\u0010eR!\u0010i\u001a\u00020\n8GX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b%\u0010`\u0012\u0004\bh\u0010E\u001a\u0004\bg\u0010\u0012R+\u0010m\u001a\u00020\n2\u0006\u0010T\u001a\u00020\n8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bj\u0010b\u001a\u0004\bk\u0010\u0012\"\u0004\bl\u0010eR/\u0010q\u001a\u0004\u0018\u00018\u00002\b\u0010T\u001a\u0004\u0018\u00018\u00008B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bn\u0010V\u001a\u0004\bo\u0010X\"\u0004\bp\u0010\u0005R7\u0010v\u001a\b\u0012\u0004\u0012\u00028\u00000\u00132\f\u0010T\u001a\b\u0012\u0004\u0012\u00028\u00000\u00138F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\f\u0010V\u001a\u0004\br\u0010s\"\u0004\bt\u0010uR\u0014\u0010y\u001a\u00020w8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010xR\u001a\u0010}\u001a\u00020\u00078@X\u0080\u0004¢\u0006\f\u0012\u0004\b|\u0010E\u001a\u0004\bz\u0010{R\u0011\u0010\u007f\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b~\u0010{¨\u0006\u0081\u0001"}, d2 = {"Landroidx/compose/foundation/gestures/AnchoredDraggableState;", "T", "", "initialValue", "<init>", "(Ljava/lang/Object;)V", "Lkotlin/Function1;", "", "confirmValueChange", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "", "currentOffset", "n", "(F)Ljava/lang/Object;", "o", "targetValue", "(Ljava/lang/Object;)Z", "G", "()F", "Lcom/google/android/dg3;", "newAnchors", "newTarget", "", "U", "(Lcom/google/android/dg3;Ljava/lang/Object;)V", "velocity", "R", "(FLcom/google/android/q22;)Ljava/lang/Object;", "Landroidx/compose/foundation/MutatePriority;", "dragPriority", "Lkotlin/Function3;", "Lcom/google/android/rg;", "Lcom/google/android/q22;", "block", "j", "(Landroidx/compose/foundation/MutatePriority;Lcom/google/android/ps4;Lcom/google/android/q22;)Ljava/lang/Object;", "Lkotlin/Function4;", "k", "(Ljava/lang/Object;Landroidx/compose/foundation/MutatePriority;Lcom/google/android/rs4;Lcom/google/android/q22;)Ljava/lang/Object;", "delta", "E", "(F)F", "a", "Lkotlin/jvm/functions/Function1;", "r", "()Lkotlin/jvm/functions/Function1;", "setConfirmValueChange$foundation", "(Lkotlin/jvm/functions/Function1;)V", "b", "x", "N", "positionalThreshold", "Lkotlin/Function0;", "c", "Lkotlin/jvm/functions/Function0;", "C", "()Lkotlin/jvm/functions/Function0;", "Q", "(Lkotlin/jvm/functions/Function0;)V", "velocityThreshold", "Lcom/google/android/kr;", "value", "d", "Lcom/google/android/kr;", "z", "()Lcom/google/android/kr;", "P", "(Lcom/google/android/kr;)V", "getSnapAnimationSpec$annotations", "()V", "snapAnimationSpec", "Lcom/google/android/vq2;", "e", "Lcom/google/android/vq2;", "t", "()Lcom/google/android/vq2;", "J", "(Lcom/google/android/vq2;)V", "getDecayAnimationSpec$annotations", "decayAnimationSpec", "Landroidx/compose/foundation/MutatorMutex;", "f", "Landroidx/compose/foundation/MutatorMutex;", "dragMutex", "<set-?>", "g", "Lcom/google/android/o58;", "s", "()Ljava/lang/Object;", "I", "currentValue", "h", "y", "O", "settledValue", "i", "Lcom/google/android/q6c;", "A", "Lcom/google/android/l48;", "w", "M", "(F)V", "offset", "getProgress", "getProgress$annotations", "progress", "l", "v", "L", "lastVelocity", "m", "u", "K", "dragTarget", "q", "()Lcom/google/android/dg3;", "H", "(Lcom/google/android/dg3;)V", "anchors", "androidx/compose/foundation/gestures/AnchoredDraggableState$b", "Landroidx/compose/foundation/gestures/AnchoredDraggableState$b;", "anchoredDragScope", "B", "()Z", "getUsePreModifierChangeBehavior$foundation$annotations", "usePreModifierChangeBehavior", "D", "isAnimationRunning", "p", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AnchoredDraggableState<T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private Function1<? super T, Boolean> confirmValueChange;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public Function1<? super Float, Float> positionalThreshold;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public Function0<Float> velocityThreshold;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public kr<Float> snapAnimationSpec;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public vq2<Float> decayAnimationSpec;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final MutatorMutex dragMutex;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final o58 currentValue;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final o58 settledValue;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final q6c targetValue;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final l48 offset;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final q6c progress;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final l48 lastVelocity;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final o58 dragTarget;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final o58 anchors;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final b anchoredDragScope;

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0015*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\f\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\f\u0010\u000bR$\u0010\u0012\u001a\u0004\u0018\u00018\u00008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0016\u001a\u0004\u0018\u00018\u00008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\r\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011R\"\u0010\u001c\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"androidx/compose/foundation/gestures/AnchoredDraggableState$b", "Lcom/google/android/rg;", "", "newOffset", "lastKnownVelocity", "", "a", "(FF)V", "", "isMovingForward", "d", "(Z)V", "c", "Ljava/lang/Object;", "getLeftBound", "()Ljava/lang/Object;", "setLeftBound", "(Ljava/lang/Object;)V", "leftBound", "b", "getRightBound", "setRightBound", "rightBound", "F", "getDistance", "()F", "setDistance", "(F)V", "distance", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements rg {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private T leftBound;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private T rightBound;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private float distance = Float.NaN;
        final /* synthetic */ AnchoredDraggableState<T> d;

        b(AnchoredDraggableState<T> anchoredDraggableState) {
            this.d = anchoredDraggableState;
        }

        @Override // com.google.inputmethod.rg
        public void a(float newOffset, float lastKnownVelocity) {
            float fW = this.d.w();
            this.d.M(newOffset);
            this.d.L(lastKnownVelocity);
            if (Float.isNaN(fW)) {
                return;
            }
            d(newOffset >= fW);
        }

        public final void c(boolean isMovingForward) {
            if (this.d.w() == this.d.q().c(this.d.s())) {
                T tA = this.d.q().a(this.d.w() + (isMovingForward ? 1.0f : -1.0f), isMovingForward);
                if (tA == null) {
                    tA = this.d.s();
                }
                if (isMovingForward) {
                    this.leftBound = this.d.s();
                    this.rightBound = tA;
                } else {
                    this.leftBound = tA;
                    this.rightBound = this.d.s();
                }
            } else {
                T tA2 = this.d.q().a(this.d.w(), false);
                if (tA2 == null) {
                    tA2 = this.d.s();
                }
                T tA3 = this.d.q().a(this.d.w(), true);
                if (tA3 == null) {
                    tA3 = this.d.s();
                }
                this.leftBound = tA2;
                this.rightBound = tA3;
            }
            dg3<T> dg3VarQ = this.d.q();
            T t = this.leftBound;
            Intrinsics.g(t);
            float fC = dg3VarQ.c(t);
            dg3<T> dg3VarQ2 = this.d.q();
            T t2 = this.rightBound;
            Intrinsics.g(t2);
            this.distance = Math.abs(fC - dg3VarQ2.c(t2));
        }

        public final void d(boolean isMovingForward) {
            c(isMovingForward);
            if (Math.abs(this.d.w() - this.d.q().c(this.d.s())) >= this.distance / 2.0f) {
                T tS = isMovingForward ? this.rightBound : this.leftBound;
                if (tS == null) {
                    tS = this.d.s();
                }
                if (((Boolean) this.d.r().invoke(tS)).booleanValue()) {
                    this.d.I(tS);
                }
            }
        }
    }

    public AnchoredDraggableState(T t) {
        this.confirmValueChange = new Function1() { // from class: com.google.android.zg
            public final Object invoke(Object obj) {
                return Boolean.valueOf(AnchoredDraggableState.p(obj));
            }
        };
        this.dragMutex = new MutatorMutex();
        this.currentValue = s0.e(t, null, 2, null);
        this.settledValue = s0.e(t, null, 2, null);
        this.targetValue = p0.e(new Function0() { // from class: com.google.android.bh
            public final Object invoke() {
                return AnchoredDraggableState.S(this.a);
            }
        });
        this.offset = tm9.a(Float.NaN);
        this.progress = p0.d(p0.t(), new Function0() { // from class: com.google.android.dh
            public final Object invoke() {
                return Float.valueOf(AnchoredDraggableState.F(this.a));
            }
        });
        this.lastVelocity = tm9.a(0.0f);
        this.dragTarget = s0.e(null, null, 2, null);
        this.anchors = s0.e(AnchoredDraggableKt.A(), null, 2, null);
        this.anchoredDragScope = new b(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final float F(AnchoredDraggableState anchoredDraggableState) {
        float fC = anchoredDraggableState.q().c(anchoredDraggableState.y());
        float fC2 = anchoredDraggableState.q().c(anchoredDraggableState.A()) - fC;
        float fAbs = Math.abs(fC2);
        if (Float.isNaN(fAbs) || fAbs <= 1.0E-6f) {
            return 1.0f;
        }
        float fG = (anchoredDraggableState.G() - fC) / fC2;
        if (fG < 1.0E-6f) {
            return 0.0f;
        }
        if (fG > 0.999999f) {
            return 1.0f;
        }
        return fG;
    }

    private final void H(dg3<T> dg3Var) {
        this.anchors.setValue(dg3Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I(T t) {
        this.currentValue.setValue(t);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K(T t) {
        this.dragTarget.setValue(t);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void L(float f) {
        this.lastVelocity.p(f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M(float f) {
        this.offset.p(f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O(T t) {
        this.settledValue.setValue(t);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object S(AnchoredDraggableState anchoredDraggableState) {
        Object objU = anchoredDraggableState.u();
        return objU == null ? anchoredDraggableState.n(anchoredDraggableState.w()) : objU;
    }

    private final boolean T(T targetValue) {
        MutatorMutex mutatorMutex = this.dragMutex;
        boolean zG = mutatorMutex.g();
        if (!zG) {
            return zG;
        }
        try {
            b bVar = this.anchoredDragScope;
            float fC = q().c(targetValue);
            if (!Float.isNaN(fC)) {
                rg.b(bVar, fC, 0.0f, 2, null);
                K(null);
            }
            I(targetValue);
            O(targetValue);
            return zG;
        } finally {
            mutatorMutex.i();
        }
    }

    public static /* synthetic */ Object l(AnchoredDraggableState anchoredDraggableState, MutatePriority mutatePriority, ps4 ps4Var, q22 q22Var, int i, Object obj) {
        if ((i & 1) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return anchoredDraggableState.j(mutatePriority, ps4Var, q22Var);
    }

    public static /* synthetic */ Object m(AnchoredDraggableState anchoredDraggableState, Object obj, MutatePriority mutatePriority, rs4 rs4Var, q22 q22Var, int i, Object obj2) {
        if ((i & 2) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return anchoredDraggableState.k(obj, mutatePriority, rs4Var, q22Var);
    }

    private final T n(float currentOffset) {
        T tB;
        if (up1.isAnchoredDraggableTargetValueCalculationFixEnabled) {
            return o(currentOffset);
        }
        return (Float.isNaN(currentOffset) || (tB = q().b(currentOffset)) == null) ? s() : tB;
    }

    private final T o(float currentOffset) {
        if (Float.isNaN(currentOffset)) {
            return s();
        }
        float fC = q().c(s());
        if (Float.isNaN(fC) || currentOffset == fC) {
            return s();
        }
        T tB = q().b(currentOffset);
        return tB == null ? s() : tB;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean p(Object obj) {
        return true;
    }

    private final T u() {
        return this.dragTarget.getValue();
    }

    public final T A() {
        return (T) this.targetValue.getValue();
    }

    public final boolean B() {
        return (this.positionalThreshold == null || this.velocityThreshold == null || this.snapAnimationSpec == null || this.decayAnimationSpec == null) ? false : true;
    }

    public final Function0<Float> C() {
        Function0<Float> function0 = this.velocityThreshold;
        if (function0 != null) {
            return function0;
        }
        Intrinsics.x("velocityThreshold");
        return null;
    }

    public final boolean D() {
        return u() != null;
    }

    public final float E(float delta) {
        return g.n((Float.isNaN(w()) ? 0.0f : w()) + delta, q().f(), q().e());
    }

    public final float G() {
        if (Float.isNaN(w())) {
            cx5.c("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?");
        }
        return w();
    }

    public final void J(vq2<Float> vq2Var) {
        this.decayAnimationSpec = vq2Var;
    }

    public final void N(Function1<? super Float, Float> function1) {
        this.positionalThreshold = function1;
    }

    public final void P(kr<Float> krVar) {
        this.snapAnimationSpec = krVar;
    }

    public final void Q(Function0<Float> function0) {
        this.velocityThreshold = function0;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @r43
    public final Object R(float f, q22<? super Float> q22Var) throws NoWhenBranchMatchedException {
        if (!B()) {
            cx5.a("AnchoredDraggableState was configured through a constructor without providing positional and velocity threshold. This overload of settle has been deprecated. Please refer to AnchoredDraggableState#settle(animationSpec) for more information.");
        }
        T tS = s();
        Object objZ = AnchoredDraggableKt.z(q(), G(), f, x(), C());
        return ((Boolean) this.confirmValueChange.invoke(objZ)).booleanValue() ? AnchoredDraggableKt.x(this, objZ, f, null, null, q22Var, 12, null) : AnchoredDraggableKt.x(this, tS, f, null, null, q22Var, 12, null);
    }

    public final void U(dg3<T> newAnchors, T newTarget) {
        if (Intrinsics.e(q(), newAnchors)) {
            return;
        }
        H(newAnchors);
        if (T(newTarget)) {
            return;
        }
        K(newTarget);
    }

    public final Object j(MutatePriority mutatePriority, ps4<? super rg, ? super dg3<T>, ? super q22<? super Unit>, ? extends Object> ps4Var, q22<? super Unit> q22Var) {
        Object objD = this.dragMutex.d(mutatePriority, new AnchoredDraggableState$anchoredDrag$2(this, ps4Var, null), q22Var);
        return objD == a.g() ? objD : Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object k(T t, MutatePriority mutatePriority, rs4<? super rg, ? super dg3<T>, ? super T, ? super q22<? super Unit>, ? extends Object> rs4Var, q22<? super Unit> q22Var) {
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
                if (q().d(t)) {
                    MutatorMutex mutatorMutex = this.dragMutex;
                    AnchoredDraggableState$anchoredDrag$4 anchoredDraggableState$anchoredDrag$4 = new AnchoredDraggableState$anchoredDrag$4(this, t, rs4Var, null);
                    anchoredDraggableState$anchoredDrag$3.label = 1;
                    if (mutatorMutex.d(mutatePriority, anchoredDraggableState$anchoredDrag$4, anchoredDraggableState$anchoredDrag$3) == objG) {
                        return objG;
                    }
                } else if (((Boolean) this.confirmValueChange.invoke(t)).booleanValue()) {
                    O(t);
                    I(t);
                }
                return Unit.a;
            }
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
            K(null);
            return Unit.a;
        } catch (Throwable th) {
            K(null);
            throw th;
        }
    }

    public final dg3<T> q() {
        return (dg3) this.anchors.getValue();
    }

    public final Function1<T, Boolean> r() {
        return this.confirmValueChange;
    }

    public final T s() {
        return this.currentValue.getValue();
    }

    public final vq2<Float> t() {
        vq2<Float> vq2Var = this.decayAnimationSpec;
        if (vq2Var != null) {
            return vq2Var;
        }
        Intrinsics.x("decayAnimationSpec");
        return null;
    }

    public final float v() {
        return this.lastVelocity.b();
    }

    public final float w() {
        return this.offset.b();
    }

    public final Function1<Float, Float> x() {
        Function1 function1 = this.positionalThreshold;
        if (function1 != null) {
            return function1;
        }
        Intrinsics.x("positionalThreshold");
        return null;
    }

    public final T y() {
        return this.settledValue.getValue();
    }

    public final kr<Float> z() {
        kr<Float> krVar = this.snapAnimationSpec;
        if (krVar != null) {
            return krVar;
        }
        Intrinsics.x("snapAnimationSpec");
        return null;
    }

    @r43
    public AnchoredDraggableState(T t, Function1<? super T, Boolean> function1) {
        this(t);
        this.confirmValueChange = function1;
    }
}
