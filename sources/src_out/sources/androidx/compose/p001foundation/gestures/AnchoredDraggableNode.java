package androidx.compose.p001foundation.gestures;

import androidx.compose.ui.unit.LayoutDirection;
import com.google.android.q22;
import com.google.android.rw0;
import com.google.android.ut0;
import com.google.inputmethod.f43;
import com.google.inputmethod.kr;
import com.google.inputmethod.qg4;
import com.google.inputmethod.r48;
import com.google.inputmethod.rn8;
import com.google.inputmethod.t04;
import com.google.inputmethod.t3e;
import com.google.inputmethod.tg;
import com.google.inputmethod.u3e;
import com.google.inputmethod.y23;
import com.google.inputmethod.zv8;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.a;
import kotlin.f;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002BW\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0017\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0019H\u0082@¢\u0006\u0004\b\u001b\u0010\u001cJ\u0013\u0010\u001e\u001a\u00020\u001d*\u00020\u0019H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0013\u0010!\u001a\u00020 *\u00020\u0019H\u0002¢\u0006\u0004\b!\u0010\u001fJ\u0013\u0010\"\u001a\u00020\u0019*\u00020 H\u0002¢\u0006\u0004\b\"\u0010#J\u0013\u0010$\u001a\u00020\u0019*\u00020\u001dH\u0002¢\u0006\u0004\b$\u0010#J\u0013\u0010%\u001a\u00020 *\u00020 H\u0002¢\u0006\u0004\b%\u0010&J\u0013\u0010'\u001a\u00020\u001d*\u00020\u001dH\u0002¢\u0006\u0004\b'\u0010&J\u000f\u0010(\u001a\u00020\u0013H\u0016¢\u0006\u0004\b(\u0010\u0015J\u000f\u0010)\u001a\u00020\u0013H\u0016¢\u0006\u0004\b)\u0010\u0015J@\u00100\u001a\u00020\u00132.\u0010/\u001a*\b\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\u00130+\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130-\u0012\u0006\u0012\u0004\u0018\u00010.0*H\u0096@¢\u0006\u0004\b0\u00101J\u0017\u00103\u001a\u00020\u00132\u0006\u00102\u001a\u00020\u001dH\u0016¢\u0006\u0004\b3\u00104J\u0017\u00107\u001a\u00020\u00132\u0006\u00106\u001a\u000205H\u0016¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020\u0007H\u0016¢\u0006\u0004\b9\u0010:J]\u0010;\u001a\u00020\u00132\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b;\u0010\u0012R\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010@R\u0018\u0010\r\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010@R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\"\u0010J\u001a\u00020\u000f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bF\u0010E\u001a\u0004\bG\u0010H\"\u0004\bI\u0010\u0018R\u0018\u0010N\u001a\u0004\u0018\u00010K8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010P\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bO\u0010:¨\u0006Q"}, d2 = {"Landroidx/compose/foundation/gestures/AnchoredDraggableNode;", "T", "Landroidx/compose/foundation/gestures/DragGestureNode;", "Landroidx/compose/foundation/gestures/AnchoredDraggableState;", "state", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "", "enabled", "reverseDirection", "Lcom/google/android/r48;", "interactionSource", "Lcom/google/android/zv8;", "overscrollEffect", "startDragImmediately", "Lcom/google/android/qg4;", "flingBehavior", "<init>", "(Landroidx/compose/foundation/gestures/AnchoredDraggableState;Landroidx/compose/foundation/gestures/Orientation;ZLjava/lang/Boolean;Lcom/google/android/r48;Lcom/google/android/zv8;Ljava/lang/Boolean;Lcom/google/android/qg4;)V", "", "F4", "()V", "newFlingBehavior", "G4", "(Lcom/google/android/qg4;)V", "", "velocity", "u4", "(FLcom/google/android/q22;)Ljava/lang/Object;", "Lcom/google/android/rn8;", "C4", "(F)J", "Lcom/google/android/t3e;", "D4", "A4", "(J)F", "B4", "x4", "(J)J", "y4", "V2", "N", "Lkotlin/Function2;", "Lkotlin/Function1;", "Landroidx/compose/foundation/gestures/l$b;", "Lcom/google/android/q22;", "", "forEachDelta", "z3", "(Lkotlin/jvm/functions/Function2;Lcom/google/android/q22;)Ljava/lang/Object;", "startedPosition", "P3", "(J)V", "Landroidx/compose/foundation/gestures/l$d;", "event", "Q3", "(Landroidx/compose/foundation/gestures/l$d;)V", "h4", "()Z", "E4", "L", "Landroidx/compose/foundation/gestures/AnchoredDraggableState;", "M", "Landroidx/compose/foundation/gestures/Orientation;", "Ljava/lang/Boolean;", "O", "Lcom/google/android/zv8;", "P", "Q", "Lcom/google/android/qg4;", "R", "v4", "()Lcom/google/android/qg4;", "z4", "resolvedFlingBehavior", "Lcom/google/android/f43;", "S", "Lcom/google/android/f43;", "density", "w4", "isReverseDirection", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class AnchoredDraggableNode<T> extends DragGestureNode {

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private AnchoredDraggableState<T> state;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    private Orientation orientation;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    private Boolean reverseDirection;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    private zv8 overscrollEffect;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    private Boolean startDragImmediately;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    private qg4 flingBehavior;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public qg4 resolvedFlingBehavior;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    private f43 density;

    public AnchoredDraggableNode(AnchoredDraggableState<T> anchoredDraggableState, Orientation orientation, boolean z, Boolean bool, r48 r48Var, zv8 zv8Var, Boolean bool2, qg4 qg4Var) {
        super(AnchoredDraggableKt.a, z, r48Var, orientation);
        this.state = anchoredDraggableState;
        this.orientation = orientation;
        this.reverseDirection = bool;
        this.overscrollEffect = zv8Var;
        this.startDragImmediately = bool2;
        this.flingBehavior = qg4Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float A4(long j) {
        return this.orientation == Orientation.Vertical ? t3e.i(j) : t3e.h(j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float B4(long j) {
        return Float.intBitsToFloat((int) (this.orientation == Orientation.Vertical ? j & 4294967295L : j >> 32));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long C4(float f) {
        Orientation orientation = this.orientation;
        float f2 = orientation == Orientation.Horizontal ? f : 0.0f;
        if (orientation != Orientation.Vertical) {
            f = 0.0f;
        }
        return rn8.e((((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long D4(float f) {
        Orientation orientation = this.orientation;
        float f2 = orientation == Orientation.Horizontal ? f : 0.0f;
        if (orientation != Orientation.Vertical) {
            f = 0.0f;
        }
        return u3e.a(f2, f);
    }

    private final void F4() {
        f43 f43VarM = y23.m(this);
        f43 f43Var = this.density;
        if (f43Var == null || !Intrinsics.e(f43Var, f43VarM)) {
            this.density = f43VarM;
            G4(this.flingBehavior);
        }
    }

    private final void G4(qg4 newFlingBehavior) {
        if (newFlingBehavior == null) {
            tg tgVar = tg.a;
            kr<Float> krVarF = tgVar.f();
            Function1<Float, Float> function1E = tgVar.e();
            f43 f43VarM = y23.m(this);
            this.density = f43VarM;
            newFlingBehavior = AnchoredDraggableKt.s(this.state, f43VarM, function1E, krVarF);
        }
        z4(newFlingBehavior);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object u4(float f, q22<? super Float> q22Var) throws NoWhenBranchMatchedException {
        AnchoredDraggableNode$fling$1 anchoredDraggableNode$fling$1;
        Ref.FloatRef floatRef;
        if (q22Var instanceof AnchoredDraggableNode$fling$1) {
            anchoredDraggableNode$fling$1 = (AnchoredDraggableNode$fling$1) q22Var;
            int i = anchoredDraggableNode$fling$1.label;
            if ((i & t04.INVALID_ID) != 0) {
                anchoredDraggableNode$fling$1.label = i - t04.INVALID_ID;
            } else {
                anchoredDraggableNode$fling$1 = new AnchoredDraggableNode$fling$1(this, q22Var);
            }
        } else {
            anchoredDraggableNode$fling$1 = new AnchoredDraggableNode$fling$1(this, q22Var);
        }
        AnchoredDraggableNode$fling$1 anchoredDraggableNode$fling$2 = anchoredDraggableNode$fling$1;
        Object obj = anchoredDraggableNode$fling$2.result;
        Object objG = a.g();
        int i2 = anchoredDraggableNode$fling$2.label;
        if (i2 == 0) {
            f.b(obj);
            if (this.state.B()) {
                AnchoredDraggableState<T> anchoredDraggableState = this.state;
                anchoredDraggableNode$fling$2.label = 1;
                Object objR = anchoredDraggableState.R(f, anchoredDraggableNode$fling$2);
                if (objR != objG) {
                    return objR;
                }
            } else {
                Ref.FloatRef floatRef2 = new Ref.FloatRef();
                floatRef2.element = f;
                AnchoredDraggableState<T> anchoredDraggableState2 = this.state;
                AnchoredDraggableNode$fling$2 anchoredDraggableNode$fling$3 = new AnchoredDraggableNode$fling$2(this, floatRef2, f, null);
                anchoredDraggableNode$fling$2.L$0 = floatRef2;
                anchoredDraggableNode$fling$2.label = 2;
                if (AnchoredDraggableState.l(anchoredDraggableState2, null, anchoredDraggableNode$fling$3, anchoredDraggableNode$fling$2, 1, null) != objG) {
                    floatRef = floatRef2;
                }
            }
            return objG;
        }
        if (i2 == 1) {
            f.b(obj);
            return obj;
        }
        if (i2 != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        floatRef = (Ref.FloatRef) anchoredDraggableNode$fling$2.L$0;
        f.b(obj);
        return ut0.d(floatRef.element);
    }

    private final boolean w4() {
        Boolean bool = this.reverseDirection;
        if (bool == null) {
            return y23.p(this) == LayoutDirection.Rtl && this.orientation == Orientation.Horizontal;
        }
        Intrinsics.g(bool);
        return bool.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long x4(long j) {
        return t3e.m(j, w4() ? -1.0f : 1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long y4(long j) {
        return rn8.r(j, w4() ? -1.0f : 1.0f);
    }

    public final void E4(AnchoredDraggableState<T> state, Orientation orientation, boolean enabled, Boolean reverseDirection, r48 interactionSource, zv8 overscrollEffect, Boolean startDragImmediately, qg4 flingBehavior) {
        boolean z;
        boolean z2;
        this.flingBehavior = flingBehavior;
        if (Intrinsics.e(this.state, state)) {
            z = false;
        } else {
            this.state = state;
            G4(flingBehavior);
            z = true;
        }
        if (this.orientation != orientation) {
            this.orientation = orientation;
            z = true;
        }
        if (Intrinsics.e(this.reverseDirection, reverseDirection)) {
            z2 = z;
        } else {
            this.reverseDirection = reverseDirection;
            z2 = true;
        }
        this.startDragImmediately = startDragImmediately;
        this.overscrollEffect = overscrollEffect;
        DragGestureNode.k4(this, null, enabled, interactionSource, orientation, z2, 1, null);
    }

    @Override // com.google.inputmethod.x23, com.google.inputmethod.bf9
    public void N() {
        K0();
        if (getIsAttached()) {
            F4();
        }
    }

    @Override // androidx.compose.p001foundation.gestures.DragGestureNode
    public void P3(long startedPosition) {
    }

    @Override // androidx.compose.p001foundation.gestures.DragGestureNode
    public void Q3(l.d event) {
        if (getIsAttached()) {
            rw0.d(L2(), (CoroutineContext) null, (CoroutineStart) null, new AnchoredDraggableNode$onDragStopped$1(this, event, null), 3, (Object) null);
        }
    }

    @Override // androidx.compose.ui.b.c
    public void V2() {
        G4(this.flingBehavior);
    }

    @Override // androidx.compose.p001foundation.gestures.DragGestureNode
    /* JADX INFO: renamed from: h4 */
    public boolean getStartDragImmediately() {
        Boolean bool = this.startDragImmediately;
        return bool != null ? bool.booleanValue() : this.state.D();
    }

    public final qg4 v4() {
        qg4 qg4Var = this.resolvedFlingBehavior;
        if (qg4Var != null) {
            return qg4Var;
        }
        Intrinsics.x("resolvedFlingBehavior");
        return null;
    }

    @Override // androidx.compose.p001foundation.gestures.DragGestureNode
    public Object z3(Function2<? super Function1<? super l.b, Unit>, ? super q22<? super Unit>, ? extends Object> function2, q22<? super Unit> q22Var) {
        Object objL = AnchoredDraggableState.l(this.state, null, new AnchoredDraggableNode$drag$2(function2, this, null), q22Var, 1, null);
        return objL == a.g() ? objL : Unit.a;
    }

    public final void z4(qg4 qg4Var) {
        this.resolvedFlingBehavior = qg4Var;
    }
}
