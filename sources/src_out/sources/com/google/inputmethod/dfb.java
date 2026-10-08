package com.google.inputmethod;

import androidx.compose.ui.semantics.SemanticsNode;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0012\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\f\u0010\u0010\u001a\u0004\b\n\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/google/android/dfb;", "", "Landroidx/compose/ui/semantics/SemanticsNode;", "semanticsNode", "Lcom/google/android/e16;", "Lcom/google/android/ffb;", "currentSemanticsNodes", "<init>", "(Landroidx/compose/ui/semantics/SemanticsNode;Lcom/google/android/e16;)V", "Lcom/google/android/seb;", "a", "Lcom/google/android/seb;", "b", "()Lcom/google/android/seb;", "unmergedConfig", "Lcom/google/android/p48;", "Lcom/google/android/p48;", "()Lcom/google/android/p48;", "children", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class dfb {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final seb unmergedConfig;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final p48 children;

    public dfb(SemanticsNode semanticsNode, e16<ffb> e16Var) {
        this.unmergedConfig = semanticsNode.getUnmergedConfig();
        List<SemanticsNode> listV = semanticsNode.v();
        this.children = new p48(listV.size());
        int size = listV.size();
        for (int i = 0; i < size; i++) {
            SemanticsNode semanticsNode2 = listV.get(i);
            if (e16Var.a(semanticsNode2.getId())) {
                this.children.g(semanticsNode2.getId());
            }
        }
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final p48 getChildren() {
        return this.children;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final seb getUnmergedConfig() {
        return this.unmergedConfig;
    }
}
