package androidx.compose.p001foundation.gestures;

import com.google.inputmethod.fu0;
import com.google.inputmethod.hab;
import com.google.inputmethod.qg4;
import com.google.inputmethod.r48;
import com.google.inputmethod.uy7;
import com.google.inputmethod.zv8;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b \b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BO\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\t2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0096\u0002¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0014\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b/\u0010,\u001a\u0004\b0\u0010.R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<¨\u0006="}, d2 = {"Landroidx/compose/foundation/gestures/r;", "Lcom/google/android/uy7;", "Landroidx/compose/foundation/gestures/ScrollableNode;", "Lcom/google/android/hab;", "state", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "Lcom/google/android/zv8;", "overscrollEffect", "", "enabled", "reverseDirection", "Lcom/google/android/qg4;", "flingBehavior", "Lcom/google/android/r48;", "interactionSource", "Lcom/google/android/fu0;", "bringIntoViewSpec", "<init>", "(Lcom/google/android/hab;Landroidx/compose/foundation/gestures/Orientation;Lcom/google/android/zv8;ZZLcom/google/android/qg4;Lcom/google/android/r48;Lcom/google/android/fu0;)V", "d", "()Landroidx/compose/foundation/gestures/ScrollableNode;", "node", "", "e", "(Landroidx/compose/foundation/gestures/ScrollableNode;)V", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/google/android/hab;", "getState", "()Lcom/google/android/hab;", "Landroidx/compose/foundation/gestures/Orientation;", "getOrientation", "()Landroidx/compose/foundation/gestures/Orientation;", "f", "Lcom/google/android/zv8;", "getOverscrollEffect", "()Lcom/google/android/zv8;", "g", "Z", "getEnabled", "()Z", "h", "getReverseDirection", "i", "Lcom/google/android/qg4;", "getFlingBehavior", "()Lcom/google/android/qg4;", "j", "Lcom/google/android/r48;", "getInteractionSource", "()Lcom/google/android/r48;", "k", "Lcom/google/android/fu0;", "getBringIntoViewSpec", "()Lcom/google/android/fu0;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class r extends uy7<ScrollableNode> {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final hab state;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final Orientation orientation;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final zv8 overscrollEffect;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final boolean enabled;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final boolean reverseDirection;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final qg4 flingBehavior;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final r48 interactionSource;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final fu0 bringIntoViewSpec;

    public r(hab habVar, Orientation orientation, zv8 zv8Var, boolean z, boolean z2, qg4 qg4Var, r48 r48Var, fu0 fu0Var) {
        this.state = habVar;
        this.orientation = orientation;
        this.overscrollEffect = zv8Var;
        this.enabled = z;
        this.reverseDirection = z2;
        this.flingBehavior = qg4Var;
        this.interactionSource = r48Var;
        this.bringIntoViewSpec = fu0Var;
    }

    @Override // com.google.inputmethod.uy7
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public ScrollableNode a() {
        return new ScrollableNode(this.state, this.overscrollEffect, this.flingBehavior, this.orientation, this.enabled, this.reverseDirection, this.interactionSource, this.bringIntoViewSpec);
    }

    @Override // com.google.inputmethod.uy7
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void c(ScrollableNode node) {
        node.C4(this.state, this.orientation, this.overscrollEffect, this.enabled, this.reverseDirection, this.flingBehavior, this.interactionSource, this.bringIntoViewSpec);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof r)) {
            return false;
        }
        r rVar = (r) other;
        return Intrinsics.e(this.state, rVar.state) && this.orientation == rVar.orientation && Intrinsics.e(this.overscrollEffect, rVar.overscrollEffect) && this.enabled == rVar.enabled && this.reverseDirection == rVar.reverseDirection && Intrinsics.e(this.flingBehavior, rVar.flingBehavior) && Intrinsics.e(this.interactionSource, rVar.interactionSource) && Intrinsics.e(this.bringIntoViewSpec, rVar.bringIntoViewSpec);
    }

    public int hashCode() {
        int iHashCode = ((this.state.hashCode() * 31) + this.orientation.hashCode()) * 31;
        zv8 zv8Var = this.overscrollEffect;
        int iHashCode2 = (((((iHashCode + (zv8Var != null ? zv8Var.hashCode() : 0)) * 31) + Boolean.hashCode(this.enabled)) * 31) + Boolean.hashCode(this.reverseDirection)) * 31;
        qg4 qg4Var = this.flingBehavior;
        int iHashCode3 = (iHashCode2 + (qg4Var != null ? qg4Var.hashCode() : 0)) * 31;
        r48 r48Var = this.interactionSource;
        int iHashCode4 = (iHashCode3 + (r48Var != null ? r48Var.hashCode() : 0)) * 31;
        fu0 fu0Var = this.bringIntoViewSpec;
        return iHashCode4 + (fu0Var != null ? fu0Var.hashCode() : 0);
    }
}
