package androidx.compose.ui.node;

import com.google.inputmethod.g16;
import com.google.inputmethod.rn8;
import com.google.inputmethod.uc;
import com.google.inputmethod.wc;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\n\u001a\u00020\t*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u000e\u001a\u00020\f*\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\u000e\u0010\u000fR$\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t0\u0010*\u00020\u00068TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/node/h;", "Landroidx/compose/ui/node/AlignmentLines;", "Lcom/google/android/wc;", "alignmentLinesOwner", "<init>", "(Lcom/google/android/wc;)V", "Landroidx/compose/ui/node/NodeCoordinator;", "Lcom/google/android/uc;", "alignmentLine", "", "i", "(Landroidx/compose/ui/node/NodeCoordinator;Lcom/google/android/uc;)I", "Lcom/google/android/rn8;", "position", "d", "(Landroidx/compose/ui/node/NodeCoordinator;J)J", "", "e", "(Landroidx/compose/ui/node/NodeCoordinator;)Ljava/util/Map;", "alignmentLinesMap", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class h extends AlignmentLines {
    public h(wc wcVar) {
        super(wcVar, null);
    }

    @Override // androidx.compose.ui.node.AlignmentLines
    protected long d(NodeCoordinator nodeCoordinator, long j) {
        i lookaheadDelegate = nodeCoordinator.getLookaheadDelegate();
        Intrinsics.g(lookaheadDelegate);
        long position = lookaheadDelegate.getPosition();
        return rn8.q(rn8.e((((long) Float.floatToRawIntBits(g16.k(position))) << 32) | (((long) Float.floatToRawIntBits(g16.l(position))) & 4294967295L)), j);
    }

    @Override // androidx.compose.ui.node.AlignmentLines
    protected Map<uc, Integer> e(NodeCoordinator nodeCoordinator) {
        i lookaheadDelegate = nodeCoordinator.getLookaheadDelegate();
        Intrinsics.g(lookaheadDelegate);
        return lookaheadDelegate.z1().j();
    }

    @Override // androidx.compose.ui.node.AlignmentLines
    protected int i(NodeCoordinator nodeCoordinator, uc ucVar) {
        i lookaheadDelegate = nodeCoordinator.getLookaheadDelegate();
        Intrinsics.g(lookaheadDelegate);
        return lookaheadDelegate.J(ucVar);
    }
}
