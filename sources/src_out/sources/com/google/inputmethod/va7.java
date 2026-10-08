package com.google.inputmethod;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.i;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0018\u0010\u0003\u001a\u00020\u0000*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0001\u0010\u0002¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/node/i;", "a", "(Landroidx/compose/ui/node/i;)Landroidx/compose/ui/node/i;", "rootLookaheadDelegate", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class va7 {
    public static final i a(i iVar) {
        LayoutNode layoutNode = iVar.getLayoutNode();
        while (true) {
            LayoutNode layoutNodeC0 = layoutNode.C0();
            if ((layoutNodeC0 != null ? layoutNodeC0.getLookaheadRoot() : null) == null) {
                i lookaheadDelegate = layoutNode.x0().getLookaheadDelegate();
                Intrinsics.g(lookaheadDelegate);
                return lookaheadDelegate;
            }
            LayoutNode layoutNodeC1 = layoutNode.C0();
            LayoutNode lookaheadRoot = layoutNodeC1 != null ? layoutNodeC1.getLookaheadRoot() : null;
            Intrinsics.g(lookaheadRoot);
            if (lookaheadRoot.getIsVirtualLookaheadRoot()) {
                layoutNode = layoutNode.C0();
                Intrinsics.g(layoutNode);
            } else {
                LayoutNode layoutNodeC2 = layoutNode.C0();
                Intrinsics.g(layoutNodeC2);
                layoutNode = layoutNodeC2.getLookaheadRoot();
                Intrinsics.g(layoutNode);
            }
        }
    }
}
