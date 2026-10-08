package androidx.compose.ui.node;

import com.google.inputmethod.w43;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u000f\u001a\u00020\f*\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0019R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001a¨\u0006\u001b"}, d2 = {"Landroidx/compose/ui/node/g;", "", "Landroidx/compose/ui/node/LayoutNode;", "root", "Lcom/google/android/w43;", "relayoutNodes", "", "Landroidx/compose/ui/node/j$a;", "postponedMeasureRequests", "<init>", "(Landroidx/compose/ui/node/LayoutNode;Lcom/google/android/w43;Ljava/util/List;)V", "node", "", "c", "(Landroidx/compose/ui/node/LayoutNode;)Z", "b", "", "f", "(Landroidx/compose/ui/node/LayoutNode;)Ljava/lang/String;", "d", "()Ljava/lang/String;", "", "a", "()V", "Landroidx/compose/ui/node/LayoutNode;", "Lcom/google/android/w43;", "Ljava/util/List;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final LayoutNode root;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final w43 relayoutNodes;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final List<j.a> postponedMeasureRequests;

    public g(LayoutNode layoutNode, w43 w43Var, List<j.a> list) {
        this.root = layoutNode;
        this.relayoutNodes = w43Var;
        this.postponedMeasureRequests = list;
    }

    private final boolean b(LayoutNode layoutNode) {
        j.a aVar;
        LayoutNode layoutNodeC0 = layoutNode.C0();
        j.a aVar2 = null;
        LayoutNode.LayoutState layoutStateI0 = layoutNodeC0 != null ? layoutNodeC0.i0() : null;
        if (layoutNode.x() || (layoutNode.D0() != Integer.MAX_VALUE && layoutNodeC0 != null && layoutNodeC0.x())) {
            if (layoutNode.p0()) {
                List<j.a> list = this.postponedMeasureRequests;
                int size = list.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        aVar = null;
                        break;
                    }
                    aVar = list.get(i);
                    j.a aVar3 = aVar;
                    if (Intrinsics.e(aVar3.getNode(), layoutNode) && !aVar3.getIsLookahead()) {
                        break;
                    }
                    i++;
                }
                if (aVar != null) {
                    return true;
                }
            }
            if (layoutNode.getIsDeactivated()) {
                return true;
            }
            if (layoutNode.p0()) {
                return this.relayoutNodes.e(layoutNode) || layoutNode.i0() == LayoutNode.LayoutState.LookaheadMeasuring || (layoutNodeC0 != null && layoutNodeC0.p0()) || ((layoutNodeC0 != null && layoutNodeC0.k0()) || layoutStateI0 == LayoutNode.LayoutState.Measuring);
            }
            if (layoutNode.h0()) {
                if (!this.relayoutNodes.e(layoutNode) && layoutNodeC0 != null && !layoutNodeC0.p0() && !layoutNodeC0.h0() && layoutStateI0 != LayoutNode.LayoutState.Measuring && layoutStateI0 != LayoutNode.LayoutState.LayingOut) {
                    List<j.a> list2 = this.postponedMeasureRequests;
                    int size2 = list2.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        if (!Intrinsics.e(list2.get(i2).getNode(), layoutNode)) {
                        }
                    }
                    if (layoutNode.i0() != LayoutNode.LayoutState.Measuring && layoutNode.i0() != LayoutNode.LayoutState.LayingOut) {
                        return false;
                    }
                }
                return true;
            }
        }
        if (Intrinsics.e(layoutNode.Z0(), Boolean.TRUE)) {
            if (layoutNode.k0()) {
                List<j.a> list3 = this.postponedMeasureRequests;
                int size3 = list3.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    j.a aVar4 = list3.get(i3);
                    j.a aVar5 = aVar4;
                    if (Intrinsics.e(aVar5.getNode(), layoutNode) && aVar5.getIsLookahead()) {
                        aVar2 = aVar4;
                        break;
                    }
                }
                if (aVar2 != null) {
                    return true;
                }
            }
            if (layoutNode.k0()) {
                return this.relayoutNodes.f(layoutNode, true) || (layoutNodeC0 != null && layoutNodeC0.k0()) || layoutStateI0 == LayoutNode.LayoutState.LookaheadMeasuring || (layoutNodeC0 != null && layoutNodeC0.p0() && Intrinsics.e(layoutNode.getLookaheadRoot(), layoutNode));
            }
            if (layoutNode.j0() && !this.relayoutNodes.f(layoutNode, true) && layoutNodeC0 != null && !layoutNodeC0.k0() && !layoutNodeC0.j0() && layoutStateI0 != LayoutNode.LayoutState.LookaheadMeasuring && layoutStateI0 != LayoutNode.LayoutState.LookaheadLayingOut && (!layoutNodeC0.h0() || !Intrinsics.e(layoutNode.getLookaheadRoot(), layoutNode))) {
                return false;
            }
        }
        return true;
    }

    private final boolean c(LayoutNode node) {
        if (!b(node)) {
            return false;
        }
        List<LayoutNode> listR = node.R();
        int size = listR.size();
        for (int i = 0; i < size; i++) {
            if (!c(listR.get(i))) {
                return false;
            }
        }
        return true;
    }

    private final String d() {
        StringBuilder sb = new StringBuilder();
        sb.append("Tree state:");
        sb.append('\n');
        e(this, sb, this.root, 0);
        return sb.toString();
    }

    private static final void e(g gVar, StringBuilder sb, LayoutNode layoutNode, int i) {
        String strF = gVar.f(layoutNode);
        if (strF.length() > 0) {
            for (int i2 = 0; i2 < i; i2++) {
                sb.append("..");
            }
            sb.append(strF);
            sb.append('\n');
            i++;
        }
        List<LayoutNode> listR = layoutNode.R();
        int size = listR.size();
        for (int i3 = 0; i3 < size; i3++) {
            e(gVar, sb, listR.get(i3), i);
        }
    }

    private final String f(LayoutNode node) {
        StringBuilder sb = new StringBuilder();
        sb.append(node);
        StringBuilder sb2 = new StringBuilder();
        sb2.append('[');
        sb2.append(node.i0());
        sb2.append(']');
        sb.append(sb2.toString());
        if (!node.x()) {
            sb.append("[!isPlaced]");
        }
        sb.append("[measuredByParent=" + node.r0() + ']');
        if (!b(node)) {
            sb.append("[INCONSISTENT]");
        }
        return sb.toString();
    }

    public final void a() {
        if (c(this.root)) {
            return;
        }
        System.out.println((Object) d());
        throw new IllegalStateException("Inconsistency found!");
    }
}
