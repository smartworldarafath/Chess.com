package com.google.inputmethod;

import androidx.compose.ui.node.LayoutNode;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\"\u0018\u0010\u0004\u001a\u00020\u0001*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/node/LayoutNode;", "", "a", "(Landroidx/compose/ui/node/LayoutNode;)Z", "isOutMostLookaheadRoot", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class go6 {
    public static final boolean a(LayoutNode layoutNode) {
        if (layoutNode.getLookaheadRoot() == null) {
            return false;
        }
        LayoutNode layoutNodeC0 = layoutNode.C0();
        return (layoutNodeC0 != null ? layoutNodeC0.getLookaheadRoot() : null) == null || layoutNode.getLayoutDelegate().getDetachedFromParentLookaheadPass();
    }
}
