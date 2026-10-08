package com.google.inputmethod;

import androidx.compose.p001foundation.gestures.DraggableNode;
import androidx.compose.p001foundation.gestures.Orientation;
import androidx.compose.ui.input.pointer.j;
import com.google.android.ps4;
import com.google.android.q22;
import com.google.android.ta2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0011\b\u0001\u0018\u0000 /2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00010B\u008d\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012(\u0010\u0012\u001a$\b\u0001\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00110\f\u0012(\u0010\u0014\u001a$\b\u0001\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00110\f\u0012\u0006\u0010\u0015\u001a\u00020\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001e\u001a\u00020\u00072\b\u0010\u001d\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\u000b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010(R6\u0010\u0012\u001a$\b\u0001\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00110\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R6\u0010\u0014\u001a$\b\u0001\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00110\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010-R\u0014\u0010\u0015\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010(¨\u00061"}, d2 = {"Lcom/google/android/mg3;", "Lcom/google/android/uy7;", "Landroidx/compose/foundation/gestures/DraggableNode;", "Lcom/google/android/og3;", "state", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "", "enabled", "Lcom/google/android/r48;", "interactionSource", "startDragImmediately", "Lkotlin/Function3;", "Lcom/google/android/ta2;", "Lcom/google/android/rn8;", "Lcom/google/android/q22;", "", "", "onDragStarted", "", "onDragStopped", "reverseDirection", "<init>", "(Lcom/google/android/og3;Landroidx/compose/foundation/gestures/Orientation;ZLcom/google/android/r48;ZLcom/google/android/ps4;Lcom/google/android/ps4;Z)V", "k", "()Landroidx/compose/foundation/gestures/DraggableNode;", "node", "n", "(Landroidx/compose/foundation/gestures/DraggableNode;)V", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "d", "Lcom/google/android/og3;", "e", "Landroidx/compose/foundation/gestures/Orientation;", "f", "Z", "g", "Lcom/google/android/r48;", "h", "i", "Lcom/google/android/ps4;", "j", "l", "a", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class mg3 extends uy7<DraggableNode> {
    private static final Function1<j, Boolean> m = new Function1() { // from class: com.google.android.lg3
        public final Object invoke(Object obj) {
            return Boolean.valueOf(mg3.e((j) obj));
        }
    };

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final og3 state;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final Orientation orientation;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final boolean enabled;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final r48 interactionSource;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final boolean startDragImmediately;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final ps4<ta2, rn8, q22<? super Unit>, Object> onDragStarted;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final ps4<ta2, Float, q22<? super Unit>, Object> onDragStopped;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final boolean reverseDirection;

    public mg3(og3 og3Var, Orientation orientation, boolean z, r48 r48Var, boolean z2, ps4<? super ta2, ? super rn8, ? super q22<? super Unit>, ? extends Object> ps4Var, ps4<? super ta2, ? super Float, ? super q22<? super Unit>, ? extends Object> ps4Var2, boolean z3) {
        this.state = og3Var;
        this.orientation = orientation;
        this.enabled = z;
        this.interactionSource = r48Var;
        this.startDragImmediately = z2;
        this.onDragStarted = ps4Var;
        this.onDragStopped = ps4Var2;
        this.reverseDirection = z3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean e(j jVar) {
        return true;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || mg3.class != other.getClass()) {
            return false;
        }
        mg3 mg3Var = (mg3) other;
        return Intrinsics.e(this.state, mg3Var.state) && this.orientation == mg3Var.orientation && this.enabled == mg3Var.enabled && Intrinsics.e(this.interactionSource, mg3Var.interactionSource) && this.startDragImmediately == mg3Var.startDragImmediately && Intrinsics.e(this.onDragStarted, mg3Var.onDragStarted) && Intrinsics.e(this.onDragStopped, mg3Var.onDragStopped) && this.reverseDirection == mg3Var.reverseDirection;
    }

    public int hashCode() {
        int iHashCode = ((((this.state.hashCode() * 31) + this.orientation.hashCode()) * 31) + Boolean.hashCode(this.enabled)) * 31;
        r48 r48Var = this.interactionSource;
        return ((((((((iHashCode + (r48Var != null ? r48Var.hashCode() : 0)) * 31) + Boolean.hashCode(this.startDragImmediately)) * 31) + this.onDragStarted.hashCode()) * 31) + this.onDragStopped.hashCode()) * 31) + Boolean.hashCode(this.reverseDirection);
    }

    @Override // com.google.inputmethod.uy7
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public DraggableNode a() {
        return new DraggableNode(this.state, m, this.orientation, this.enabled, this.interactionSource, this.startDragImmediately, this.onDragStarted, this.onDragStopped, this.reverseDirection);
    }

    @Override // com.google.inputmethod.uy7
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void c(DraggableNode node) {
        node.s4(this.state, m, this.orientation, this.enabled, this.interactionSource, this.startDragImmediately, this.onDragStarted, this.onDragStopped, this.reverseDirection);
    }
}
