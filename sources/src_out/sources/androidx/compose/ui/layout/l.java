package androidx.compose.ui.layout;

import com.google.inputmethod.gn6;
import com.google.inputmethod.uy7;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006%"}, d2 = {"Landroidx/compose/ui/layout/l;", "Lcom/google/android/uy7;", "Landroidx/compose/ui/layout/OnFirstVisibleNode;", "", "minDurationMs", "", "minFractionVisible", "Lcom/google/android/gn6;", "viewportBounds", "Lkotlin/Function0;", "", "callback", "<init>", "(JFLcom/google/android/gn6;Lkotlin/jvm/functions/Function0;)V", "d", "()Landroidx/compose/ui/layout/OnFirstVisibleNode;", "node", "e", "(Landroidx/compose/ui/layout/OnFirstVisibleNode;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "J", "getMinDurationMs", "()J", "F", "getMinFractionVisible", "()F", "f", "Lkotlin/jvm/functions/Function0;", "getCallback", "()Lkotlin/jvm/functions/Function0;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class l extends uy7<OnFirstVisibleNode> {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final long minDurationMs;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final float minFractionVisible;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final Function0<Unit> callback;

    public l(long j, float f, gn6 gn6Var, Function0<Unit> function0) {
        this.minDurationMs = j;
        this.minFractionVisible = f;
        this.callback = function0;
    }

    @Override // com.google.inputmethod.uy7
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public OnFirstVisibleNode a() {
        return new OnFirstVisibleNode(this.minDurationMs, this.minFractionVisible, null, this.callback);
    }

    @Override // com.google.inputmethod.uy7
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void c(OnFirstVisibleNode node) {
        node.t3(this.minDurationMs);
        node.u3(this.minFractionVisible);
        node.r3(this.callback);
        node.v3(null);
        node.o3();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other != null && l.class == other.getClass()) {
            l lVar = (l) other;
            return this.minDurationMs == lVar.minDurationMs && this.minFractionVisible == lVar.minFractionVisible && Intrinsics.e((Object) null, (Object) null) && this.callback == lVar.callback;
        }
        return false;
    }

    public int hashCode() {
        return (((Long.hashCode(this.minDurationMs) * 31) + Float.hashCode(this.minFractionVisible)) * 961) + this.callback.hashCode();
    }
}
