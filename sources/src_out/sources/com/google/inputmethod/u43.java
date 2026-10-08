package com.google.inputmethod;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.SortedSet;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u0010\u0010\fJ\r\u0010\u0011\u001a\u00020\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0018R\u001e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00070\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001c¨\u0006\u001e"}, d2 = {"Lcom/google/android/u43;", "", "", "extraAssertions", "<init>", "(Z)V", "Lcom/google/android/d58;", "Landroidx/compose/ui/node/LayoutNode;", "f", "()Lcom/google/android/d58;", "node", "b", "(Landroidx/compose/ui/node/LayoutNode;)Z", "", "a", "(Landroidx/compose/ui/node/LayoutNode;)V", "e", "d", "()Landroidx/compose/ui/node/LayoutNode;", "c", "()Z", "", "toString", "()Ljava/lang/String;", "Z", "Lcom/google/android/d58;", "mapOfOriginalDepth", "Landroidx/compose/ui/node/SortedSet;", "Landroidx/compose/ui/node/SortedSet;", "set", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class u43 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean extraAssertions;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private d58<LayoutNode> mapOfOriginalDepth;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final SortedSet<LayoutNode> set = new SortedSet<>(v43.a);

    public u43(boolean z) {
        this.extraAssertions = z;
    }

    private final d58<LayoutNode> f() {
        if (this.mapOfOriginalDepth == null) {
            this.mapOfOriginalDepth = xl8.b();
        }
        d58<LayoutNode> d58Var = this.mapOfOriginalDepth;
        Intrinsics.g(d58Var);
        return d58Var;
    }

    public final void a(LayoutNode node) {
        if (!node.b()) {
            zw5.c("DepthSortedSet.add called on an unattached node");
        }
        if (this.extraAssertions) {
            d58<LayoutNode> d58VarF = f();
            int iE = d58VarF.e(node, Integer.MAX_VALUE);
            if (iE == Integer.MAX_VALUE) {
                d58VarF.u(node, node.getDepth());
            } else {
                if (!(iE == node.getDepth())) {
                    zw5.c("invalid node depth");
                }
            }
        }
        this.set.add(node);
    }

    public final boolean b(LayoutNode node) {
        boolean zContains = this.set.contains(node);
        if (this.extraAssertions) {
            if (!(zContains == f().a(node))) {
                zw5.c("inconsistency in TreeSet");
            }
        }
        return zContains;
    }

    public final boolean c() {
        return this.set.isEmpty();
    }

    public final LayoutNode d() {
        LayoutNode layoutNodeFirst = this.set.first();
        e(layoutNodeFirst);
        return layoutNodeFirst;
    }

    public final boolean e(LayoutNode node) {
        if (!node.b()) {
            zw5.c("DepthSortedSet.remove called on an unattached node");
        }
        boolean zRemove = this.set.remove(node);
        if (this.extraAssertions) {
            d58<LayoutNode> d58VarF = f();
            if (d58VarF.a(node)) {
                int iC = d58VarF.c(node);
                d58VarF.r(node);
                if (!(iC == (zRemove ? node.getDepth() : Integer.MAX_VALUE))) {
                    zw5.c("invalid node depth");
                }
            }
        }
        return zRemove;
    }

    public String toString() {
        return this.set.toString();
    }
}
