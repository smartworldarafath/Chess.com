package com.google.inputmethod;

import androidx.compose.p004runtime.s0;
import androidx.compose.ui.node.LayoutNode;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0015\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0012\u0010\u000fJ\u0015\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b\u0013\u0010\u000fJ\u0015\u0010\u0014\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0014\u0010\u000fJ\u0015\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b\u0015\u0010\u000fJ\u0015\u0010\u0016\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0016\u0010\u000fJ\u0015\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b\u0017\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR+\u0010 \u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u00048B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0013\u0010\u001d\u001a\u0004\b\u0018\u0010\u001e\"\u0004\b\u001f\u0010\u000b¨\u0006!"}, d2 = {"Lcom/google/android/i66;", "", "Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "Lcom/google/android/ej7;", "policy", "<init>", "(Landroidx/compose/ui/node/LayoutNode;Lcom/google/android/ej7;)V", "measurePolicy", "", "k", "(Lcom/google/android/ej7;)V", "", "height", "g", "(I)I", "width", "f", "c", "b", "i", "h", "e", "d", "a", "Landroidx/compose/ui/node/LayoutNode;", "getLayoutNode", "()Landroidx/compose/ui/node/LayoutNode;", "<set-?>", "Lcom/google/android/o58;", "()Lcom/google/android/ej7;", "j", "measurePolicyState", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class i66 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final LayoutNode layoutNode;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final o58 measurePolicyState;

    public i66(LayoutNode layoutNode, ej7 ej7Var) {
        this.layoutNode = layoutNode;
        this.measurePolicyState = s0.e(ej7Var, null, 2, null);
    }

    private final ej7 a() {
        return (ej7) this.measurePolicyState.getValue();
    }

    private final void j(ej7 ej7Var) {
        this.measurePolicyState.setValue(ej7Var);
    }

    public final int b(int width) {
        return a().maxIntrinsicHeight(this.layoutNode.x0(), this.layoutNode.Q(), width);
    }

    public final int c(int height) {
        return a().maxIntrinsicWidth(this.layoutNode.x0(), this.layoutNode.Q(), height);
    }

    public final int d(int width) {
        return a().maxIntrinsicHeight(this.layoutNode.x0(), this.layoutNode.P(), width);
    }

    public final int e(int height) {
        return a().maxIntrinsicWidth(this.layoutNode.x0(), this.layoutNode.P(), height);
    }

    public final int f(int width) {
        return a().minIntrinsicHeight(this.layoutNode.x0(), this.layoutNode.Q(), width);
    }

    public final int g(int height) {
        return a().minIntrinsicWidth(this.layoutNode.x0(), this.layoutNode.Q(), height);
    }

    public final int h(int width) {
        return a().minIntrinsicHeight(this.layoutNode.x0(), this.layoutNode.P(), width);
    }

    public final int i(int height) {
        return a().minIntrinsicWidth(this.layoutNode.x0(), this.layoutNode.P(), height);
    }

    public final void k(ej7 measurePolicy) {
        j(measurePolicy);
    }
}
