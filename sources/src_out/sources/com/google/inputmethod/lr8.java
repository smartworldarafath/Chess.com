package com.google.inputmethod;

import androidx.compose.ui.node.LayoutNode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u0001\u0018\u0000 \n2\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\bJ\u0015\u0010\u000e\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\bJ\u0015\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\bJ\r\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0003R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0013R \u0010\u0017\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0016¨\u0006\u0018"}, d2 = {"Lcom/google/android/lr8;", "", "<init>", "()V", "Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "", "b", "(Landroidx/compose/ui/node/LayoutNode;)V", "", "c", "()Z", "node", "d", "f", "rootNode", "e", "a", "Lcom/google/android/r58;", "Lcom/google/android/r58;", "layoutNodes", "", "[Landroidx/compose/ui/node/LayoutNode;", "cachedNodes", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class lr8 {
    public static final int d = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final r58<LayoutNode> layoutNodes = new r58<>(new LayoutNode[16], 0);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private LayoutNode[] cachedNodes;

    private final void b(LayoutNode layoutNode) {
        if (layoutNode.getGloballyPositionedObservers() > 0) {
            layoutNode.I();
            layoutNode.X1(false);
            r58<LayoutNode> r58VarL0 = layoutNode.L0();
            LayoutNode[] layoutNodeArr = r58VarL0.content;
            int size = r58VarL0.getSize();
            for (int i = 0; i < size; i++) {
                b(layoutNodeArr[i]);
            }
        }
    }

    public final void a() {
        this.layoutNodes.A(Companion.C0113a.a);
        int size = this.layoutNodes.getSize();
        LayoutNode[] layoutNodeArr = this.cachedNodes;
        if (layoutNodeArr == null || layoutNodeArr.length < size) {
            layoutNodeArr = new LayoutNode[Math.max(16, this.layoutNodes.getSize())];
        }
        this.cachedNodes = null;
        for (int i = 0; i < size; i++) {
            layoutNodeArr[i] = this.layoutNodes.content[i];
        }
        this.layoutNodes.j();
        while (true) {
            size--;
            if (-1 >= size) {
                this.cachedNodes = layoutNodeArr;
                return;
            }
            LayoutNode layoutNode = layoutNodeArr[size];
            Intrinsics.g(layoutNode);
            if (layoutNode.getNeedsOnGloballyPositionedDispatch()) {
                b(layoutNode);
            }
            layoutNodeArr[size] = null;
        }
    }

    public final boolean c() {
        return this.layoutNodes.getSize() != 0;
    }

    public final void d(LayoutNode node) {
        if (node.getGloballyPositionedObservers() > 0) {
            this.layoutNodes.c(node);
            node.X1(true);
        }
    }

    public final void e(LayoutNode rootNode) {
        if (rootNode.getGloballyPositionedObservers() > 0) {
            this.layoutNodes.j();
            this.layoutNodes.c(rootNode);
            rootNode.X1(true);
        }
    }

    public final void f(LayoutNode node) {
        this.layoutNodes.s(node);
    }
}
