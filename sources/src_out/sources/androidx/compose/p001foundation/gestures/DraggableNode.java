package androidx.compose.p001foundation.gestures;

import androidx.compose.p001foundation.MutatePriority;
import androidx.compose.ui.input.pointer.j;
import com.google.android.ps4;
import com.google.android.q22;
import com.google.android.rw0;
import com.google.android.ta2;
import com.google.inputmethod.og3;
import com.google.inputmethod.r48;
import com.google.inputmethod.rn8;
import com.google.inputmethod.t3e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0001\u0018\u00002\u00020\u0001B¡\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012(\u0010\u0014\u001a$\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u000e\u0012(\u0010\u0016\u001a$\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u000e\u0012\u0006\u0010\u0017\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\u0019J\u0013\u0010\u001b\u001a\u00020\u001a*\u00020\u001aH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\u0010*\u00020\u0010H\u0002¢\u0006\u0004\b\u001d\u0010\u001cJ@\u0010!\u001a\u00020\u00122.\u0010 \u001a*\b\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00120\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u001eH\u0096@¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020\u00122\u0006\u0010#\u001a\u00020\u0010H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020\u00122\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0006H\u0016¢\u0006\u0004\b*\u0010+J§\u0001\u0010,\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\r\u001a\u00020\u00062(\u0010\u0014\u001a$\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u000e2(\u0010\u0016\u001a$\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u000e2\u0006\u0010\u0017\u001a\u00020\u0006¢\u0006\u0004\b,\u0010\u0019R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u0010\r\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R8\u0010\u0014\u001a$\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R8\u0010\u0016\u001a$\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00104R\u0016\u0010\u0017\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00102¨\u00067"}, d2 = {"Landroidx/compose/foundation/gestures/DraggableNode;", "Landroidx/compose/foundation/gestures/DragGestureNode;", "Lcom/google/android/og3;", "state", "Lkotlin/Function1;", "Landroidx/compose/ui/input/pointer/j;", "", "canDrag", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "enabled", "Lcom/google/android/r48;", "interactionSource", "startDragImmediately", "Lkotlin/Function3;", "Lcom/google/android/ta2;", "Lcom/google/android/rn8;", "Lcom/google/android/q22;", "", "", "onDragStarted", "", "onDragStopped", "reverseDirection", "<init>", "(Lcom/google/android/og3;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/gestures/Orientation;ZLcom/google/android/r48;ZLcom/google/android/ps4;Lcom/google/android/ps4;Z)V", "Lcom/google/android/t3e;", "q4", "(J)J", "r4", "Lkotlin/Function2;", "Landroidx/compose/foundation/gestures/l$b;", "forEachDelta", "z3", "(Lkotlin/jvm/functions/Function2;Lcom/google/android/q22;)Ljava/lang/Object;", "startedPosition", "P3", "(J)V", "Landroidx/compose/foundation/gestures/l$d;", "event", "Q3", "(Landroidx/compose/foundation/gestures/l$d;)V", "h4", "()Z", "s4", "L", "Lcom/google/android/og3;", "M", "Landroidx/compose/foundation/gestures/Orientation;", "N", "Z", "O", "Lcom/google/android/ps4;", "P", "Q", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DraggableNode extends DragGestureNode {

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private og3 state;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    private Orientation orientation;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    private boolean startDragImmediately;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    private ps4<? super ta2, ? super rn8, ? super q22<? super Unit>, ? extends Object> onDragStarted;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    private ps4<? super ta2, ? super Float, ? super q22<? super Unit>, ? extends Object> onDragStopped;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    private boolean reverseDirection;

    public DraggableNode(og3 og3Var, Function1<? super j, Boolean> function1, Orientation orientation, boolean z, r48 r48Var, boolean z2, ps4<? super ta2, ? super rn8, ? super q22<? super Unit>, ? extends Object> ps4Var, ps4<? super ta2, ? super Float, ? super q22<? super Unit>, ? extends Object> ps4Var2, boolean z3) {
        super(function1, z, r48Var, orientation);
        this.state = og3Var;
        this.orientation = orientation;
        this.startDragImmediately = z2;
        this.onDragStarted = ps4Var;
        this.onDragStopped = ps4Var2;
        this.reverseDirection = z3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long q4(long j) {
        return t3e.m(j, this.reverseDirection ? -1.0f : 1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long r4(long j) {
        return rn8.r(j, this.reverseDirection ? -1.0f : 1.0f);
    }

    @Override // androidx.compose.p001foundation.gestures.DragGestureNode
    public void P3(long startedPosition) {
        if (!getIsAttached() || Intrinsics.e(this.onDragStarted, DraggableKt.a)) {
            return;
        }
        rw0.d(L2(), (CoroutineContext) null, CoroutineStart.d, new DraggableNode$onDragStarted$1(this, startedPosition, null), 1, (Object) null);
    }

    @Override // androidx.compose.p001foundation.gestures.DragGestureNode
    public void Q3(l.d event) {
        if (!getIsAttached() || Intrinsics.e(this.onDragStopped, DraggableKt.b)) {
            return;
        }
        rw0.d(L2(), (CoroutineContext) null, CoroutineStart.d, new DraggableNode$onDragStopped$1(this, event, null), 1, (Object) null);
    }

    @Override // androidx.compose.p001foundation.gestures.DragGestureNode
    /* JADX INFO: renamed from: h4, reason: from getter */
    public boolean getStartDragImmediately() {
        return this.startDragImmediately;
    }

    public final void s4(og3 state, Function1<? super j, Boolean> canDrag, Orientation orientation, boolean enabled, r48 interactionSource, boolean startDragImmediately, ps4<? super ta2, ? super rn8, ? super q22<? super Unit>, ? extends Object> onDragStarted, ps4<? super ta2, ? super Float, ? super q22<? super Unit>, ? extends Object> onDragStopped, boolean reverseDirection) {
        boolean z;
        boolean z2 = true;
        if (Intrinsics.e(this.state, state)) {
            z = false;
        } else {
            this.state = state;
            z = true;
        }
        if (this.orientation != orientation) {
            this.orientation = orientation;
            z = true;
        }
        if (this.reverseDirection != reverseDirection) {
            this.reverseDirection = reverseDirection;
        } else {
            z2 = z;
        }
        this.onDragStarted = onDragStarted;
        this.onDragStopped = onDragStopped;
        this.startDragImmediately = startDragImmediately;
        j4(canDrag, enabled, interactionSource, orientation, z2);
    }

    @Override // androidx.compose.p001foundation.gestures.DragGestureNode
    public Object z3(Function2<? super Function1<? super l.b, Unit>, ? super q22<? super Unit>, ? extends Object> function2, q22<? super Unit> q22Var) {
        Object objA = this.state.a(MutatePriority.UserInput, new DraggableNode$drag$2(function2, this, null), q22Var);
        return objA == a.g() ? objA : Unit.a;
    }
}
