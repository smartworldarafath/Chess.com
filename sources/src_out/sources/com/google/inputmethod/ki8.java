package com.google.inputmethod;

import androidx.compose.ui.node.BackwardsCompatNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeChainKt;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.d;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000o\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001d*\u0001D\b\u0001\u0018\u00002\u00020\u0001:\u0002AEB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJG\u0010\u0019\u001a\u00060\u0018R\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJC\u0010!\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010 \u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u0006H\u0002¢\u0006\u0004\b$\u0010\u000bJ\u0017\u0010%\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u0006H\u0002¢\u0006\u0004\b%\u0010\u000bJ\u001f\u0010(\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u00132\u0006\u0010'\u001a\u00020\u0006H\u0002¢\u0006\u0004\b(\u0010)J\u001f\u0010*\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u00062\u0006\u0010'\u001a\u00020\u0006H\u0002¢\u0006\u0004\b*\u0010+J'\u0010.\u001a\u00020\f2\u0006\u0010,\u001a\u00020\u00132\u0006\u0010-\u001a\u00020\u00132\u0006\u0010#\u001a\u00020\u0006H\u0002¢\u0006\u0004\b.\u0010/J\u0017\u00102\u001a\u00020\f2\u0006\u00101\u001a\u000200H\u0000¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\fH\u0000¢\u0006\u0004\b4\u0010\u000eJ\r\u00105\u001a\u00020\f¢\u0006\u0004\b5\u0010\u000eJ\r\u00106\u001a\u00020\f¢\u0006\u0004\b6\u0010\u000eJ\r\u00107\u001a\u00020\f¢\u0006\u0004\b7\u0010\u000eJ\u000f\u00108\u001a\u00020\fH\u0000¢\u0006\u0004\b8\u0010\u000eJ\u000f\u00109\u001a\u00020\fH\u0000¢\u0006\u0004\b9\u0010\u000eJ\u001b\u0010<\u001a\u00020\u00162\n\u0010;\u001a\u0006\u0012\u0002\b\u00030:H\u0000¢\u0006\u0004\b<\u0010=J\u000f\u0010?\u001a\u00020>H\u0016¢\u0006\u0004\b?\u0010@R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\b1\u0010CR\u0014\u0010G\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u001a\u0010M\u001a\u00020H8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR$\u0010S\u001a\u00020\u001c2\u0006\u0010N\u001a\u00020\u001c8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010RR\u001a\u0010 \u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u0010\bR$\u0010\u000f\u001a\u00020\u00062\u0006\u0010N\u001a\u00020\u00068\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bW\u0010U\u001a\u0004\bX\u0010\bR\u001e\u0010Z\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010YR\u001e\u0010[\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010YR\u001a\u0010]\u001a\b\u0012\u0004\u0012\u0002000\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010YR\u001c\u0010_\u001a\b\u0018\u00010\u0018R\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010^R\u0014\u0010a\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\\\u0010`R\u0014\u0010d\u001a\u00020\u00168@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bb\u0010c¨\u0006e"}, d2 = {"Lcom/google/android/ki8;", "", "Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "<init>", "(Landroidx/compose/ui/node/LayoutNode;)V", "Landroidx/compose/ui/b$c;", "u", "()Landroidx/compose/ui/b$c;", "paddedHead", "D", "(Landroidx/compose/ui/b$c;)Landroidx/compose/ui/b$c;", "", "B", "()V", "head", "", "offset", "Lcom/google/android/r58;", "Landroidx/compose/ui/b$b;", "before", "after", "", "shouldAttachOnInsert", "Lcom/google/android/ki8$a;", "j", "(Landroidx/compose/ui/b$c;ILcom/google/android/r58;Lcom/google/android/r58;Z)Lcom/google/android/ki8$a;", "start", "Landroidx/compose/ui/node/NodeCoordinator;", "coordinator", "v", "(Landroidx/compose/ui/b$c;Landroidx/compose/ui/node/NodeCoordinator;)V", "tail", "A", "(ILcom/google/android/r58;Lcom/google/android/r58;Landroidx/compose/ui/b$c;Z)V", "node", "h", "w", "element", "parent", "g", "(Landroidx/compose/ui/b$b;Landroidx/compose/ui/b$c;)Landroidx/compose/ui/b$c;", "q", "(Landroidx/compose/ui/b$c;Landroidx/compose/ui/b$c;)Landroidx/compose/ui/b$c;", "prev", "next", "F", "(Landroidx/compose/ui/b$b;Landroidx/compose/ui/b$b;Landroidx/compose/ui/b$c;)V", "Landroidx/compose/ui/b;", "m", "E", "(Landroidx/compose/ui/b;)V", "x", "C", "s", "y", "t", "z", "Lcom/google/android/ni8;", "type", "p", "(I)Z", "", "toString", "()Ljava/lang/String;", "a", "Landroidx/compose/ui/node/LayoutNode;", "()Landroidx/compose/ui/node/LayoutNode;", "com/google/android/ki8$c", "b", "Lcom/google/android/ki8$c;", "sentinelHead", "Landroidx/compose/ui/node/a;", "c", "Landroidx/compose/ui/node/a;", "l", "()Landroidx/compose/ui/node/a;", "innerCoordinator", "value", "d", "Landroidx/compose/ui/node/NodeCoordinator;", "n", "()Landroidx/compose/ui/node/NodeCoordinator;", "outerCoordinator", "e", "Landroidx/compose/ui/b$c;", "o", "f", "k", "Lcom/google/android/r58;", "current", "buffer", "i", "stack", "Lcom/google/android/ki8$a;", "cachedDiffer", "()I", "aggregateChildKindSet", "r", "()Z", "isUpdating", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ki8 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final LayoutNode layoutNode;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final c sentinelHead;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final androidx.compose.ui.node.a innerCoordinator;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private NodeCoordinator outerCoordinator;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final androidx.compose.ui.b.c tail;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private androidx.compose.ui.b.c head;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private r58<androidx.compose.ui.b.InterfaceC0050b> current;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private r58<androidx.compose.ui.b.InterfaceC0050b> buffer;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final r58<androidx.compose.ui.b> stack;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private a cachedDiffer;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u001c\b\u0082\u0004\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0018\u0010\u0017R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\u0014R(\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R(\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\"\u001a\u0004\b'\u0010$\"\u0004\b(\u0010&R\"\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-¨\u0006."}, d2 = {"Lcom/google/android/ki8$a;", "Lcom/google/android/aa3;", "Landroidx/compose/ui/b$c;", "node", "", "offset", "Lcom/google/android/r58;", "Landroidx/compose/ui/b$b;", "before", "after", "", "shouldAttachOnInsert", "<init>", "(Lcom/google/android/ki8;Landroidx/compose/ui/b$c;ILcom/google/android/r58;Lcom/google/android/r58;Z)V", "oldIndex", "newIndex", "a", "(II)Z", "", "c", "(I)V", "atIndex", "b", "(II)V", "d", "Landroidx/compose/ui/b$c;", "getNode", "()Landroidx/compose/ui/b$c;", "g", "(Landroidx/compose/ui/b$c;)V", "I", "getOffset", "()I", "h", "Lcom/google/android/r58;", "getBefore", "()Lcom/google/android/r58;", "f", "(Lcom/google/android/r58;)V", "getAfter", "e", "Z", "getShouldAttachOnInsert", "()Z", "i", "(Z)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private final class a implements aa3 {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private androidx.compose.ui.b.c node;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private int offset;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private r58<androidx.compose.ui.b.InterfaceC0050b> before;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private r58<androidx.compose.ui.b.InterfaceC0050b> after;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private boolean shouldAttachOnInsert;

        public a(androidx.compose.ui.b.c cVar, int i, r58<androidx.compose.ui.b.InterfaceC0050b> r58Var, r58<androidx.compose.ui.b.InterfaceC0050b> r58Var2, boolean z) {
            this.node = cVar;
            this.offset = i;
            this.before = r58Var;
            this.after = r58Var2;
            this.shouldAttachOnInsert = z;
        }

        @Override // com.google.inputmethod.aa3
        public boolean a(int oldIndex, int newIndex) {
            r58<androidx.compose.ui.b.InterfaceC0050b> r58Var = this.before;
            int i = this.offset;
            return NodeChainKt.c(r58Var.content[oldIndex + i], this.after.content[i + newIndex]) != 0;
        }

        @Override // com.google.inputmethod.aa3
        public void b(int atIndex, int oldIndex) {
            androidx.compose.ui.b.c child = this.node.getChild();
            Intrinsics.g(child);
            ki8.d(ki8.this);
            if ((ni8.a(2) & child.getKindSet()) != 0) {
                NodeCoordinator coordinator = child.getCoordinator();
                Intrinsics.g(coordinator);
                NodeCoordinator nodeCoordinatorM3 = coordinator.getWrappedBy();
                NodeCoordinator nodeCoordinatorL3 = coordinator.getWrapped();
                Intrinsics.g(nodeCoordinatorL3);
                if (nodeCoordinatorM3 != null) {
                    nodeCoordinatorM3.W3(nodeCoordinatorL3);
                }
                nodeCoordinatorL3.X3(nodeCoordinatorM3);
                ki8.this.v(this.node, nodeCoordinatorL3);
            }
            this.node = ki8.this.h(child);
        }

        @Override // com.google.inputmethod.aa3
        public void c(int newIndex) {
            int i = this.offset + newIndex;
            this.node = ki8.this.g(this.after.content[i], this.node);
            ki8.d(ki8.this);
            if (!this.shouldAttachOnInsert) {
                this.node.f3(true);
                return;
            }
            androidx.compose.ui.b.c child = this.node.getChild();
            Intrinsics.g(child);
            NodeCoordinator coordinator = child.getCoordinator();
            Intrinsics.g(coordinator);
            androidx.compose.ui.node.c cVarD = y23.d(this.node);
            if (cVarD != null) {
                d dVar = new d(ki8.this.getLayoutNode(), cVarD);
                this.node.l3(dVar);
                ki8.this.v(this.node, dVar);
                dVar.X3(coordinator.getWrappedBy());
                dVar.W3(coordinator);
                coordinator.X3(dVar);
            } else {
                this.node.l3(coordinator);
            }
            this.node.T2();
            this.node.Z2();
            oi8.a(this.node);
        }

        @Override // com.google.inputmethod.aa3
        public void d(int oldIndex, int newIndex) {
            androidx.compose.ui.b.c child = this.node.getChild();
            Intrinsics.g(child);
            this.node = child;
            r58<androidx.compose.ui.b.InterfaceC0050b> r58Var = this.before;
            int i = this.offset;
            androidx.compose.ui.b.InterfaceC0050b interfaceC0050b = r58Var.content[oldIndex + i];
            androidx.compose.ui.b.InterfaceC0050b interfaceC0050b2 = this.after.content[i + newIndex];
            if (Intrinsics.e(interfaceC0050b, interfaceC0050b2)) {
                ki8.d(ki8.this);
            } else {
                ki8.this.F(interfaceC0050b, interfaceC0050b2, this.node);
                ki8.d(ki8.this);
            }
        }

        public final void e(r58<androidx.compose.ui.b.InterfaceC0050b> r58Var) {
            this.after = r58Var;
        }

        public final void f(r58<androidx.compose.ui.b.InterfaceC0050b> r58Var) {
            this.before = r58Var;
        }

        public final void g(androidx.compose.ui.b.c cVar) {
            this.node = cVar;
        }

        public final void h(int i) {
            this.offset = i;
        }

        public final void i(boolean z) {
            this.shouldAttachOnInsert = z;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b`\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lcom/google/android/ki8$b;", "", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface b {
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/google/android/ki8$c", "Landroidx/compose/ui/b$c;", "", "toString", "()Ljava/lang/String;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c extends androidx.compose.ui.b.c {
        c() {
        }

        public String toString() {
            return "<Head>";
        }
    }

    public ki8(LayoutNode layoutNode) {
        this.layoutNode = layoutNode;
        c cVar = new c();
        cVar.b3(-1);
        this.sentinelHead = cVar;
        androidx.compose.ui.node.a aVar = new androidx.compose.ui.node.a(layoutNode);
        this.innerCoordinator = aVar;
        this.outerCoordinator = aVar;
        emc emcVarL4 = aVar.j3();
        this.tail = emcVarL4;
        this.head = emcVarL4;
        this.stack = new r58<>(new androidx.compose.ui.b[16], 0);
    }

    private final void A(int offset, r58<androidx.compose.ui.b.InterfaceC0050b> before, r58<androidx.compose.ui.b.InterfaceC0050b> after, androidx.compose.ui.b.c tail, boolean shouldAttachOnInsert) {
        b68.e(before.getSize() - offset, after.getSize() - offset, j(tail, offset, before, after, shouldAttachOnInsert));
        B();
    }

    private final void B() {
        int kindSet = 0;
        for (androidx.compose.ui.b.c parent = this.tail.getParent(); parent != null && parent != this.sentinelHead; parent = parent.getParent()) {
            kindSet |= parent.getKindSet();
            parent.b3(kindSet);
        }
    }

    private final androidx.compose.ui.b.c D(androidx.compose.ui.b.c paddedHead) {
        if (!(paddedHead == this.sentinelHead)) {
            zw5.c("trimChain called on already trimmed chain");
        }
        androidx.compose.ui.b.c child = this.sentinelHead.getChild();
        if (child == null) {
            child = this.tail;
        }
        child.i3(null);
        this.sentinelHead.d3(null);
        this.sentinelHead.b3(-1);
        this.sentinelHead.l3(null);
        if (!(child != this.sentinelHead)) {
            zw5.c("trimChain did not update the head");
        }
        return child;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F(androidx.compose.ui.b.InterfaceC0050b prev, androidx.compose.ui.b.InterfaceC0050b next, androidx.compose.ui.b.c node) {
        if ((prev instanceof uy7) && (next instanceof uy7)) {
            NodeChainKt.e((uy7) next, node);
            if (node.getIsAttached()) {
                oi8.e(node);
                return;
            } else {
                node.j3(true);
                return;
            }
        }
        if (!(node instanceof BackwardsCompatNode)) {
            zw5.c("Unknown Modifier.Node type");
            return;
        }
        ((BackwardsCompatNode) node).r3(next);
        if (node.getIsAttached()) {
            oi8.e(node);
        } else {
            node.j3(true);
        }
    }

    public static final /* synthetic */ b d(ki8 ki8Var) {
        ki8Var.getClass();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final androidx.compose.ui.b.c g(androidx.compose.ui.b.InterfaceC0050b element, androidx.compose.ui.b.c parent) {
        androidx.compose.ui.b.c backwardsCompatNode;
        if (element instanceof uy7) {
            backwardsCompatNode = ((uy7) element).a();
            backwardsCompatNode.g3(oi8.h(backwardsCompatNode));
        } else {
            backwardsCompatNode = new BackwardsCompatNode(element);
        }
        if (backwardsCompatNode.getIsAttached()) {
            zw5.c("A ModifierNodeElement cannot return an already attached node from create() ");
        }
        backwardsCompatNode.f3(true);
        return q(backwardsCompatNode, parent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final androidx.compose.ui.b.c h(androidx.compose.ui.b.c node) {
        if (node.getIsAttached()) {
            oi8.d(node);
            node.a3();
            node.U2();
        }
        return w(node);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int i() {
        return this.head.getAggregateChildKindSet();
    }

    private final a j(androidx.compose.ui.b.c head, int offset, r58<androidx.compose.ui.b.InterfaceC0050b> before, r58<androidx.compose.ui.b.InterfaceC0050b> after, boolean shouldAttachOnInsert) {
        a aVar = this.cachedDiffer;
        if (aVar == null) {
            a aVar2 = new a(head, offset, before, after, shouldAttachOnInsert);
            this.cachedDiffer = aVar2;
            return aVar2;
        }
        aVar.g(head);
        aVar.h(offset);
        aVar.f(before);
        aVar.e(after);
        aVar.i(shouldAttachOnInsert);
        return aVar;
    }

    private final androidx.compose.ui.b.c q(androidx.compose.ui.b.c node, androidx.compose.ui.b.c parent) {
        androidx.compose.ui.b.c child = parent.getChild();
        if (child != null) {
            child.i3(node);
            node.d3(child);
        }
        parent.d3(node);
        node.i3(parent);
        return node;
    }

    private final androidx.compose.ui.b.c u() {
        if (!(this.head != this.sentinelHead)) {
            zw5.c("padChain called on already padded chain");
        }
        androidx.compose.ui.b.c cVar = this.head;
        cVar.i3(this.sentinelHead);
        this.sentinelHead.d3(cVar);
        return this.sentinelHead;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v(androidx.compose.ui.b.c start, NodeCoordinator coordinator) {
        for (androidx.compose.ui.b.c parent = start.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == this.sentinelHead) {
                LayoutNode layoutNodeC0 = this.layoutNode.C0();
                coordinator.X3(layoutNodeC0 != null ? layoutNodeC0.b0() : null);
                this.outerCoordinator = coordinator;
                return;
            } else {
                if ((ni8.a(2) & parent.getKindSet()) != 0) {
                    return;
                }
                parent.l3(coordinator);
            }
        }
    }

    private final androidx.compose.ui.b.c w(androidx.compose.ui.b.c node) {
        androidx.compose.ui.b.c child = node.getChild();
        androidx.compose.ui.b.c parent = node.getParent();
        if (child != null) {
            child.i3(parent);
            node.d3(null);
        }
        if (parent != null) {
            parent.d3(child);
            node.i3(null);
        }
        Intrinsics.g(parent);
        return parent;
    }

    public final void C() {
        NodeCoordinator dVar;
        NodeCoordinator nodeCoordinator = this.innerCoordinator;
        for (androidx.compose.ui.b.c parent = this.tail.getParent(); parent != null; parent = parent.getParent()) {
            androidx.compose.ui.node.c cVarD = y23.d(parent);
            if (cVarD != null) {
                if (parent.getCoordinator() != null) {
                    NodeCoordinator coordinator = parent.getCoordinator();
                    Intrinsics.h(coordinator, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
                    dVar = (d) coordinator;
                    androidx.compose.ui.node.c cVarM4 = dVar.getLayoutModifierNode();
                    dVar.q4(cVarD);
                    if (cVarM4 != parent) {
                        dVar.B3();
                    }
                } else {
                    dVar = new d(this.layoutNode, cVarD);
                    parent.l3(dVar);
                }
                nodeCoordinator.X3(dVar);
                dVar.W3(nodeCoordinator);
                nodeCoordinator = dVar;
            } else {
                parent.l3(nodeCoordinator);
            }
        }
        LayoutNode layoutNodeC0 = this.layoutNode.C0();
        nodeCoordinator.X3(layoutNodeC0 != null ? layoutNodeC0.b0() : null);
        this.outerCoordinator = nodeCoordinator;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final void E(androidx.compose.ui.b m) throws KotlinNothingValueException {
        ki8 ki8Var;
        androidx.compose.ui.b.c cVarU = u();
        r58<androidx.compose.ui.b.InterfaceC0050b> r58Var = this.current;
        int i = 0;
        int size = r58Var != null ? r58Var.getSize() : 0;
        r58<androidx.compose.ui.b.InterfaceC0050b> r58Var2 = this.buffer;
        if (r58Var2 == null) {
            r58Var2 = new r58<>(new androidx.compose.ui.b.InterfaceC0050b[16], 0);
        }
        r58<androidx.compose.ui.b.InterfaceC0050b> r58VarD = NodeChainKt.d(m, r58Var2, this.stack);
        r58<androidx.compose.ui.b.InterfaceC0050b> r58Var3 = null;
        if (r58VarD.getSize() == size) {
            androidx.compose.ui.b.c child = cVarU.getChild();
            int i2 = 0;
            while (child != null && i2 < size) {
                if (r58Var == null) {
                    zw5.d("expected prior modifier list to be non-empty");
                    throw new KotlinNothingValueException();
                }
                androidx.compose.ui.b.InterfaceC0050b interfaceC0050b = r58Var.content[i2];
                androidx.compose.ui.b.InterfaceC0050b interfaceC0050b2 = r58VarD.content[i2];
                int iC = NodeChainKt.c(interfaceC0050b, interfaceC0050b2);
                if (iC == 0) {
                    child = child.getParent();
                    break;
                }
                if (iC == 1) {
                    F(interfaceC0050b, interfaceC0050b2, child);
                }
                child = child.getChild();
                i2++;
            }
            androidx.compose.ui.b.c cVar = child;
            if (i2 >= size) {
                ki8Var = this;
            } else {
                if (r58Var == null) {
                    zw5.d("expected prior modifier list to be non-empty");
                    throw new KotlinNothingValueException();
                }
                if (cVar == null) {
                    zw5.d("structuralUpdate requires a non-null tail");
                    throw new KotlinNothingValueException();
                }
                ki8Var = this;
                ki8Var.A(i2, r58Var, r58VarD, cVar, !this.layoutNode.N());
                i = 1;
            }
        } else {
            ki8Var = this;
            if (ki8Var.layoutNode.N() && size == 0) {
                androidx.compose.ui.b.c cVarG = cVarU;
                while (i < r58VarD.getSize()) {
                    cVarG = g(r58VarD.content[i], cVarG);
                    i++;
                }
                B();
            } else if (r58VarD.getSize() != 0) {
                if (r58Var == null) {
                    r58Var = new r58<>(new androidx.compose.ui.b.InterfaceC0050b[16], 0);
                }
                r58<androidx.compose.ui.b.InterfaceC0050b> r58Var4 = r58Var;
                ki8Var.A(0, r58Var4, r58VarD, cVarU, !ki8Var.layoutNode.N());
                ki8Var = ki8Var;
                r58Var = r58Var4;
            } else {
                if (r58Var == null) {
                    zw5.d("expected prior modifier list to be non-empty");
                    throw new KotlinNothingValueException();
                }
                androidx.compose.ui.b.c child2 = cVarU.getChild();
                for (int i3 = 0; child2 != null && i3 < r58Var.getSize(); i3++) {
                    child2 = h(child2).getChild();
                }
                androidx.compose.ui.node.a aVar = ki8Var.innerCoordinator;
                LayoutNode layoutNodeC0 = ki8Var.layoutNode.C0();
                aVar.X3(layoutNodeC0 != null ? layoutNodeC0.b0() : null);
                ki8Var.outerCoordinator = ki8Var.innerCoordinator;
            }
            i = 1;
        }
        ki8Var.current = r58VarD;
        if (r58Var != null) {
            r58Var.j();
            r58Var3 = r58Var;
        }
        ki8Var.buffer = r58Var3;
        ki8Var.head = D(cVarU);
        if (i != 0) {
            C();
        }
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final androidx.compose.ui.b.c getHead() {
        return this.head;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final androidx.compose.ui.node.a getInnerCoordinator() {
        return this.innerCoordinator;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final LayoutNode getLayoutNode() {
        return this.layoutNode;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final NodeCoordinator getOuterCoordinator() {
        return this.outerCoordinator;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final androidx.compose.ui.b.c getTail() {
        return this.tail;
    }

    public final boolean p(int type) {
        return (type & i()) != 0;
    }

    public final boolean r() {
        return this.sentinelHead.getChild() != null;
    }

    public final void s() {
        for (androidx.compose.ui.b.c head = getHead(); head != null; head = head.getChild()) {
            head.T2();
        }
    }

    public final void t() {
        for (androidx.compose.ui.b.c tail = getTail(); tail != null; tail = tail.getParent()) {
            if (tail.getIsAttached()) {
                tail.U2();
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        if (this.head == this.tail) {
            sb.append("]");
        } else {
            for (androidx.compose.ui.b.c head = getHead(); head != null && head != getTail(); head = head.getChild()) {
                sb.append(String.valueOf(head));
                if (head.getChild() == this.tail) {
                    sb.append("]");
                    break;
                }
                sb.append(",");
            }
        }
        return sb.toString();
    }

    public final void x() {
        for (androidx.compose.ui.b.c tail = getTail(); tail != null; tail = tail.getParent()) {
            if (tail.getIsAttached()) {
                tail.Y2();
            }
        }
        z();
        t();
    }

    public final void y() {
        for (androidx.compose.ui.b.c head = getHead(); head != null; head = head.getChild()) {
            head.Z2();
            if (head.getInsertedNodeAwaitingAttachForInvalidation()) {
                oi8.a(head);
            }
            if (head.getUpdatedNodeAwaitingAttachForInvalidation()) {
                oi8.e(head);
            }
            head.f3(false);
            head.j3(false);
        }
    }

    public final void z() {
        for (androidx.compose.ui.b.c tail = getTail(); tail != null; tail = tail.getParent()) {
            if (tail.getIsAttached()) {
                tail.a3();
            }
        }
    }
}
