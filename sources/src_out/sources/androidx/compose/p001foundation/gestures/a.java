package androidx.compose.p001foundation.gestures;

import com.google.inputmethod.qg4;
import com.google.inputmethod.r48;
import com.google.inputmethod.uy7;
import com.google.inputmethod.zv8;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0011\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002B[\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0018\u001a\u00020\u00172\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0096\u0002¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010!R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\"R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010\n\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010\r\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010&R\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-¨\u0006."}, d2 = {"Landroidx/compose/foundation/gestures/a;", "T", "Lcom/google/android/uy7;", "Landroidx/compose/foundation/gestures/AnchoredDraggableNode;", "Landroidx/compose/foundation/gestures/AnchoredDraggableState;", "state", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "", "enabled", "reverseDirection", "Lcom/google/android/r48;", "interactionSource", "startDragImmediately", "Lcom/google/android/zv8;", "overscrollEffect", "Lcom/google/android/qg4;", "flingBehavior", "<init>", "(Landroidx/compose/foundation/gestures/AnchoredDraggableState;Landroidx/compose/foundation/gestures/Orientation;ZLjava/lang/Boolean;Lcom/google/android/r48;Ljava/lang/Boolean;Lcom/google/android/zv8;Lcom/google/android/qg4;)V", "d", "()Landroidx/compose/foundation/gestures/AnchoredDraggableNode;", "node", "", "e", "(Landroidx/compose/foundation/gestures/AnchoredDraggableNode;)V", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Landroidx/compose/foundation/gestures/AnchoredDraggableState;", "Landroidx/compose/foundation/gestures/Orientation;", "f", "Z", "g", "Ljava/lang/Boolean;", "h", "Lcom/google/android/r48;", "i", "j", "Lcom/google/android/zv8;", "k", "Lcom/google/android/qg4;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class a<T> extends uy7<AnchoredDraggableNode<T>> {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final AnchoredDraggableState<T> state;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final Orientation orientation;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final boolean enabled;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final Boolean reverseDirection;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final r48 interactionSource;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final Boolean startDragImmediately;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final zv8 overscrollEffect;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final qg4 flingBehavior;

    public a(AnchoredDraggableState<T> anchoredDraggableState, Orientation orientation, boolean z, Boolean bool, r48 r48Var, Boolean bool2, zv8 zv8Var, qg4 qg4Var) {
        this.state = anchoredDraggableState;
        this.orientation = orientation;
        this.enabled = z;
        this.reverseDirection = bool;
        this.interactionSource = r48Var;
        this.startDragImmediately = bool2;
        this.overscrollEffect = zv8Var;
        this.flingBehavior = qg4Var;
    }

    @Override // com.google.inputmethod.uy7
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public AnchoredDraggableNode<T> a() {
        return new AnchoredDraggableNode<>(this.state, this.orientation, this.enabled, this.reverseDirection, this.interactionSource, this.overscrollEffect, this.startDragImmediately, this.flingBehavior);
    }

    @Override // com.google.inputmethod.uy7
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void c(AnchoredDraggableNode<T> node) {
        node.E4(this.state, this.orientation, this.enabled, this.reverseDirection, this.interactionSource, this.overscrollEffect, this.startDragImmediately, this.flingBehavior);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof a)) {
            return false;
        }
        a aVar = (a) other;
        return Intrinsics.e(this.state, aVar.state) && this.orientation == aVar.orientation && this.enabled == aVar.enabled && Intrinsics.e(this.reverseDirection, aVar.reverseDirection) && Intrinsics.e(this.interactionSource, aVar.interactionSource) && Intrinsics.e(this.startDragImmediately, aVar.startDragImmediately) && Intrinsics.e(this.overscrollEffect, aVar.overscrollEffect) && Intrinsics.e(this.flingBehavior, aVar.flingBehavior);
    }

    public int hashCode() {
        int iHashCode = ((((this.state.hashCode() * 31) + this.orientation.hashCode()) * 31) + Boolean.hashCode(this.enabled)) * 31;
        Boolean bool = this.reverseDirection;
        int iHashCode2 = (iHashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        r48 r48Var = this.interactionSource;
        int iHashCode3 = (iHashCode2 + (r48Var != null ? r48Var.hashCode() : 0)) * 31;
        Boolean bool2 = this.startDragImmediately;
        int iHashCode4 = (iHashCode3 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        zv8 zv8Var = this.overscrollEffect;
        int iHashCode5 = (iHashCode4 + (zv8Var != null ? zv8Var.hashCode() : 0)) * 31;
        qg4 qg4Var = this.flingBehavior;
        return iHashCode5 + (qg4Var != null ? qg4Var.hashCode() : 0);
    }

    public /* synthetic */ a(AnchoredDraggableState anchoredDraggableState, Orientation orientation, boolean z, Boolean bool, r48 r48Var, Boolean bool2, zv8 zv8Var, qg4 qg4Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(anchoredDraggableState, orientation, z, bool, r48Var, (i & 32) != 0 ? null : bool2, zv8Var, (i & 128) != 0 ? null : qg4Var);
    }
}
