package com.google.inputmethod;

import androidx.compose.ui.b;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0019\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0001H\u0010¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0019\u001a\u00028\u0000\"\b\b\u0000\u0010\u0017*\u00020\u00162\u0006\u0010\u0018\u001a\u00028\u0000H\u0004¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u0016H\u0004¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0007H\u0010¢\u0006\u0004\b\u001e\u0010\u0003J\u000f\u0010\u001f\u001a\u00020\u0007H\u0010¢\u0006\u0004\b\u001f\u0010\u0003J\u000f\u0010 \u001a\u00020\u0007H\u0010¢\u0006\u0004\b \u0010\u0003J\u000f\u0010!\u001a\u00020\u0007H\u0010¢\u0006\u0004\b!\u0010\u0003J\u000f\u0010\"\u001a\u00020\u0007H\u0010¢\u0006\u0004\b\"\u0010\u0003R \u0010(\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\u0012\n\u0004\b#\u0010$\u0012\u0004\b'\u0010\u0003\u001a\u0004\b%\u0010&R$\u0010.\u001a\u0004\u0018\u00010\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010\u0015¨\u0006/"}, d2 = {"Lcom/google/android/k33;", "Landroidx/compose/ui/b$c;", "<init>", "()V", "", "delegateKindSet", "delegateNode", "", "r3", "(ILandroidx/compose/ui/b$c;)V", "newKindSet", "", "recalculateOwner", "q3", "(IZ)V", "Landroidx/compose/ui/node/NodeCoordinator;", "coordinator", "l3", "(Landroidx/compose/ui/node/NodeCoordinator;)V", "owner", "c3", "(Landroidx/compose/ui/b$c;)V", "Lcom/google/android/x23;", "T", "delegatableNode", "m3", "(Lcom/google/android/x23;)Lcom/google/android/x23;", "instance", "p3", "(Lcom/google/android/x23;)V", "T2", "Z2", "a3", "U2", "Y2", "p", "I", "o3", "()I", "getSelfKindSet$ui$annotations", "selfKindSet", "q", "Landroidx/compose/ui/b$c;", "n3", "()Landroidx/compose/ui/b$c;", "setDelegate$ui", "delegate", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class k33 extends b.c {

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private final int selfKindSet = oi8.g(this);

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private b.c delegate;

    private final void q3(int newKindSet, boolean recalculateOwner) {
        b.c child;
        int kindSet = getKindSet();
        g3(newKindSet);
        if (kindSet != newKindSet) {
            if (y23.i(this)) {
                b3(newKindSet);
            }
            if (getIsAttached()) {
                b.c node = getNode();
                b.c parent = this;
                while (parent != null) {
                    newKindSet |= parent.getKindSet();
                    parent.g3(newKindSet);
                    if (parent == node) {
                        break;
                    } else {
                        parent = parent.getParent();
                    }
                }
                if (recalculateOwner && parent == node) {
                    newKindSet = oi8.h(node);
                    node.g3(newKindSet);
                }
                int aggregateChildKindSet = newKindSet | ((parent == null || (child = parent.getChild()) == null) ? 0 : child.getAggregateChildKindSet());
                while (parent != null) {
                    aggregateChildKindSet |= parent.getKindSet();
                    parent.b3(aggregateChildKindSet);
                    parent = parent.getParent();
                }
            }
        }
    }

    private final void r3(int delegateKindSet, b.c delegateNode) {
        int kindSet = getKindSet();
        if ((delegateKindSet & ni8.a(2)) == 0 || (ni8.a(2) & kindSet) == 0 || (this instanceof c)) {
            return;
        }
        zw5.c("Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: " + this + "\nDelegate Node: " + delegateNode);
    }

    @Override // androidx.compose.ui.b.c
    public void T2() {
        super.T2();
        for (b.c delegate = getDelegate(); delegate != null; delegate = delegate.getChild()) {
            delegate.l3(getCoordinator());
            if (!delegate.getIsAttached()) {
                delegate.T2();
            }
        }
    }

    @Override // androidx.compose.ui.b.c
    public void U2() {
        for (b.c delegate = getDelegate(); delegate != null; delegate = delegate.getChild()) {
            delegate.U2();
        }
        super.U2();
    }

    @Override // androidx.compose.ui.b.c
    public void Y2() {
        super.Y2();
        for (b.c delegate = getDelegate(); delegate != null; delegate = delegate.getChild()) {
            delegate.Y2();
        }
    }

    @Override // androidx.compose.ui.b.c
    public void Z2() {
        for (b.c delegate = getDelegate(); delegate != null; delegate = delegate.getChild()) {
            delegate.Z2();
        }
        super.Z2();
    }

    @Override // androidx.compose.ui.b.c
    public void a3() {
        super.a3();
        for (b.c delegate = getDelegate(); delegate != null; delegate = delegate.getChild()) {
            delegate.a3();
        }
    }

    @Override // androidx.compose.ui.b.c
    public void c3(b.c owner) {
        super.c3(owner);
        for (b.c delegate = getDelegate(); delegate != null; delegate = delegate.getChild()) {
            delegate.c3(owner);
        }
    }

    @Override // androidx.compose.ui.b.c
    public void l3(NodeCoordinator coordinator) {
        super.l3(coordinator);
        for (b.c delegate = getDelegate(); delegate != null; delegate = delegate.getChild()) {
            delegate.l3(coordinator);
        }
    }

    protected final <T extends x23> T m3(T delegatableNode) {
        b.c node = delegatableNode.getNode();
        if (node != delegatableNode) {
            b.c cVar = delegatableNode instanceof b.c ? (b.c) delegatableNode : null;
            b.c parent = cVar != null ? cVar.getParent() : null;
            if (node == getNode() && Intrinsics.e(parent, this)) {
                return delegatableNode;
            }
            throw new IllegalStateException("Cannot delegate to an already delegated node");
        }
        if (node.getIsAttached()) {
            zw5.c("Cannot delegate to an already attached node");
        }
        node.c3(getNode());
        int kindSet = getKindSet();
        int iH = oi8.h(node);
        node.g3(iH);
        r3(iH, node);
        node.d3(this.delegate);
        this.delegate = node;
        node.i3(this);
        q3(getKindSet() | iH, false);
        if (getIsAttached()) {
            if ((iH & ni8.a(2)) == 0 || (kindSet & ni8.a(2)) != 0) {
                l3(getCoordinator());
            } else {
                ki8 nodes = y23.q(this).getNodes();
                getNode().l3(null);
                nodes.C();
            }
            node.T2();
            node.Z2();
            oi8.a(node);
        }
        return delegatableNode;
    }

    /* JADX INFO: renamed from: n3, reason: from getter */
    public final b.c getDelegate() {
        return this.delegate;
    }

    /* JADX INFO: renamed from: o3, reason: from getter */
    public final int getSelfKindSet() {
        return this.selfKindSet;
    }

    protected final void p3(x23 instance) {
        b.c cVar = null;
        for (b.c child = this.delegate; child != null; child = child.getChild()) {
            if (child == instance) {
                if (child.getIsAttached()) {
                    oi8.d(child);
                    child.a3();
                    child.U2();
                }
                child.c3(child);
                child.b3(0);
                if (cVar == null) {
                    this.delegate = child.getChild();
                } else {
                    cVar.d3(child.getChild());
                }
                child.d3(null);
                child.i3(null);
                int kindSet = getKindSet();
                int iH = oi8.h(this);
                q3(iH, true);
                if (getIsAttached() && (kindSet & ni8.a(2)) != 0 && (ni8.a(2) & iH) == 0) {
                    ki8 nodes = y23.q(this).getNodes();
                    getNode().l3(null);
                    nodes.C();
                    return;
                }
                return;
            }
            cVar = child;
        }
        throw new IllegalStateException(("Could not find delegate: " + instance).toString());
    }
}
