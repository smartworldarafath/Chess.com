package com.google.inputmethod;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.semantics.SemanticsNode;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B'\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\nH\u0080\u0002¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0000¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0016\u0010\u001eR\u0011\u0010\"\u001a\u00020 8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010!R\u0014\u0010$\u001a\u00020\f8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010#¨\u0006%"}, d2 = {"Lcom/google/android/hfb;", "", "Landroidx/compose/ui/node/LayoutNode;", "rootNode", "Lcom/google/android/vr3;", "outerSemanticsNode", "Lcom/google/android/e16;", "nodes", "<init>", "(Landroidx/compose/ui/node/LayoutNode;Lcom/google/android/vr3;Lcom/google/android/e16;)V", "", "semanticsId", "Lcom/google/android/teb;", "a", "(I)Lcom/google/android/teb;", "semanticsInfo", "Lcom/google/android/seb;", "previousSemanticsConfiguration", "", "e", "(Lcom/google/android/teb;Lcom/google/android/seb;)V", "Landroidx/compose/ui/node/LayoutNode;", "b", "Lcom/google/android/vr3;", "c", "Lcom/google/android/e16;", "Lcom/google/android/e58;", "Lcom/google/android/web;", "d", "Lcom/google/android/e58;", "()Lcom/google/android/e58;", "listeners", "Landroidx/compose/ui/semantics/SemanticsNode;", "()Landroidx/compose/ui/semantics/SemanticsNode;", "unmergedRootSemanticsNode", "()Lcom/google/android/teb;", "rootInfo", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class hfb {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final LayoutNode rootNode;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final vr3 outerSemanticsNode;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final e16<LayoutNode> nodes;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final e58<web> listeners = new e58<>(2);

    public hfb(LayoutNode layoutNode, vr3 vr3Var, e16<LayoutNode> e16Var) {
        this.rootNode = layoutNode;
        this.outerSemanticsNode = vr3Var;
        this.nodes = e16Var;
    }

    public final teb a(int semanticsId) {
        return this.nodes.b(semanticsId);
    }

    public final e58<web> b() {
        return this.listeners;
    }

    public final teb c() {
        return this.rootNode;
    }

    public final SemanticsNode d() {
        return new SemanticsNode(this.outerSemanticsNode, false, this.rootNode, new seb());
    }

    public final void e(teb semanticsInfo, seb previousSemanticsConfiguration) {
        e58<web> e58Var = this.listeners;
        Object[] objArr = e58Var.content;
        int i = e58Var._size;
        for (int i2 = 0; i2 < i; i2++) {
            ((web) objArr[i2]).a(semanticsInfo, previousSemanticsConfiguration);
        }
    }
}
