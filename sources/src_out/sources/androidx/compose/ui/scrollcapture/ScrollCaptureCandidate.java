package androidx.compose.ui.scrollcapture;

import androidx.compose.ui.semantics.SemanticsNode;
import com.google.inputmethod.k16;
import com.google.inputmethod.kn6;
import kotlin.Metadata;

/* JADX INFO: renamed from: androidx.compose.ui.scrollcapture.b, reason: from toString */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0002\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u000f\u0010\u001a¨\u0006\u001b"}, d2 = {"Landroidx/compose/ui/scrollcapture/b;", "", "Landroidx/compose/ui/semantics/SemanticsNode;", "node", "", "depth", "Lcom/google/android/k16;", "viewportBoundsInWindow", "Lcom/google/android/kn6;", "coordinates", "<init>", "(Landroidx/compose/ui/semantics/SemanticsNode;ILcom/google/android/k16;Lcom/google/android/kn6;)V", "", "toString", "()Ljava/lang/String;", "a", "Landroidx/compose/ui/semantics/SemanticsNode;", "c", "()Landroidx/compose/ui/semantics/SemanticsNode;", "b", "I", "()I", "Lcom/google/android/k16;", "d", "()Lcom/google/android/k16;", "Lcom/google/android/kn6;", "()Lcom/google/android/kn6;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class ScrollCaptureCandidate {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final SemanticsNode node;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int depth;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final k16 viewportBoundsInWindow;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final kn6 coordinates;

    public ScrollCaptureCandidate(SemanticsNode semanticsNode, int i, k16 k16Var, kn6 kn6Var) {
        this.node = semanticsNode;
        this.depth = i;
        this.viewportBoundsInWindow = k16Var;
        this.coordinates = kn6Var;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final kn6 getCoordinates() {
        return this.coordinates;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getDepth() {
        return this.depth;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final SemanticsNode getNode() {
        return this.node;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final k16 getViewportBoundsInWindow() {
        return this.viewportBoundsInWindow;
    }

    public String toString() {
        return "ScrollCaptureCandidate(node=" + this.node + ", depth=" + this.depth + ", viewportBoundsInWindow=" + this.viewportBoundsInWindow + ", coordinates=" + this.coordinates + ')';
    }
}
