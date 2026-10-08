package androidx.compose.ui.input.pointer;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeCoordinator;
import com.google.inputmethod.bf9;
import com.google.inputmethod.e58;
import com.google.inputmethod.ha7;
import com.google.inputmethod.k33;
import com.google.inputmethod.kn6;
import com.google.inputmethod.ni8;
import com.google.inputmethod.o56;
import com.google.inputmethod.r58;
import com.google.inputmethod.rn8;
import com.google.inputmethod.te9;
import com.google.inputmethod.y23;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: androidx.compose.ui.input.pointer.c, reason: from toString */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\n\u001a\u00020\t2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00000\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J5\u0010\u001d\u001a\u00020\t2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001f\u0010 J5\u0010!\u001a\u00020\t2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\tH\u0016¢\u0006\u0004\b!\u0010\u001eJ\u000f\u0010\"\u001a\u00020\fH\u0016¢\u0006\u0004\b\"\u0010\u000eJ\r\u0010#\u001a\u00020\f¢\u0006\u0004\b#\u0010\u000eJ\u0017\u0010$\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0017\u00101\u001a\u00020-8\u0006¢\u0006\f\n\u0004\b\"\u0010.\u001a\u0004\b/\u00100R\u001a\u00103\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u00102R\u0018\u00105\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u00104R\u0018\u00108\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u0010:\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u00109R\u0016\u0010<\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u00109R\u0016\u0010=\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u00109¨\u0006>"}, d2 = {"Landroidx/compose/ui/input/pointer/c;", "Landroidx/compose/ui/input/pointer/d;", "Landroidx/compose/ui/b$c;", "modifierNode", "<init>", "(Landroidx/compose/ui/b$c;)V", "Landroidx/compose/ui/input/pointer/e;", "oldEvent", "newEvent", "", "m", "(Landroidx/compose/ui/input/pointer/e;Landroidx/compose/ui/input/pointer/e;)Z", "", "j", "()V", "", "pointerIdValue", "Lcom/google/android/e58;", "hitNodes", "h", "(JLcom/google/android/e58;)V", "Lcom/google/android/ha7;", "Landroidx/compose/ui/input/pointer/i;", "changes", "Lcom/google/android/kn6;", "parentCoordinates", "Lcom/google/android/o56;", "internalPointerEvent", "isInBounds", "f", "(Lcom/google/android/ha7;Lcom/google/android/kn6;Lcom/google/android/o56;Z)Z", "e", "(Lcom/google/android/o56;)Z", "a", "d", "n", "b", "(Lcom/google/android/o56;)V", "", "toString", "()Ljava/lang/String;", "c", "Landroidx/compose/ui/b$c;", "k", "()Landroidx/compose/ui/b$c;", "Lcom/google/android/te9;", "Lcom/google/android/te9;", "l", "()Lcom/google/android/te9;", "pointerIds", "Lcom/google/android/ha7;", "relevantChanges", "Lcom/google/android/kn6;", "coordinates", "g", "Landroidx/compose/ui/input/pointer/e;", "pointerEvent", "Z", "wasIn", "i", "isIn", "hasExited", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Node extends d {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final androidx.compose.ui.b.c modifierNode;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private kn6 coordinates;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private e pointerEvent;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private boolean wasIn;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final te9 pointerIds = new te9();

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final ha7<PointerInputChange> relevantChanges = new ha7<>(2);

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private boolean isIn = true;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private boolean hasExited = true;

    public Node(androidx.compose.ui.b.c cVar) {
        this.modifierNode = cVar;
    }

    private final void j() {
        this.relevantChanges.a();
        this.coordinates = null;
    }

    private final boolean m(e oldEvent, e newEvent) {
        if (oldEvent == null || oldEvent.c().size() != newEvent.c().size()) {
            return true;
        }
        int size = newEvent.c().size();
        for (int i = 0; i < size; i++) {
            if (!rn8.j(oldEvent.c().get(i).getPosition(), newEvent.c().get(i).getPosition())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0281  */
    /* JADX WARN: Code duplicated, block: B:107:0x028f  */
    /* JADX WARN: Code duplicated, block: B:98:0x0261  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v29 */
    /*  JADX ERROR: NullPointerException in pass: PrepareForCodeGen
        java.lang.NullPointerException
        */
    @Override // androidx.compose.ui.input.pointer.d
    public boolean a(com.google.inputmethod.ha7<androidx.compose.ui.input.pointer.PointerInputChange> r49, com.google.inputmethod.kn6 r50, com.google.inputmethod.o56 r51, boolean r52) {
        /*
            Method dump skipped, instruction units count: 708
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.pointer.Node.a(com.google.android.ha7, com.google.android.kn6, com.google.android.o56, boolean):boolean");
    }

    @Override // androidx.compose.ui.input.pointer.d
    public void b(o56 internalPointerEvent) {
        super.b(internalPointerEvent);
        e eVar = this.pointerEvent;
        if (eVar == null) {
            return;
        }
        this.wasIn = this.isIn;
        List<PointerInputChange> listC = eVar.c();
        int size = listC.size();
        for (int i = 0; i < size; i++) {
            PointerInputChange pointerInputChange = listC.get(i);
            boolean pressed = pointerInputChange.getPressed();
            boolean zA = internalPointerEvent.a(pointerInputChange.getId());
            boolean z = this.isIn;
            if ((!pressed && !zA) || (!pressed && !z)) {
                this.pointerIds.g(pointerInputChange.getId());
            }
        }
        this.isIn = false;
        this.hasExited = g.o(eVar.getType(), g.INSTANCE.b());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8 */
    @Override // androidx.compose.ui.input.pointer.d
    public void d() {
        r58<Node> r58VarG = g();
        Node[] nodeArr = r58VarG.content;
        int size = r58VarG.getSize();
        for (int i = 0; i < size; i++) {
            nodeArr[i].d();
        }
        androidx.compose.ui.b.c cVarJ = this.modifierNode;
        int iA = ni8.a(16);
        r58 r58Var = null;
        while (cVarJ != 0) {
            if (cVarJ instanceof bf9) {
                ((bf9) cVarJ).K0();
            } else if ((cVarJ.getKindSet() & iA) != 0 && (cVarJ instanceof k33)) {
                androidx.compose.ui.b.c delegate = ((k33) cVarJ).getDelegate();
                int i2 = 0;
                cVarJ = cVarJ;
                while (delegate != null) {
                    if ((delegate.getKindSet() & iA) != 0) {
                        i2++;
                        if (i2 == 1) {
                            cVarJ = delegate;
                        } else {
                            if (r58Var == null) {
                                r58Var = new r58(new androidx.compose.ui.b.c[16], 0);
                            }
                            if (cVarJ != 0) {
                                r58Var.c(cVarJ);
                                cVarJ = 0;
                            }
                            r58Var.c(delegate);
                        }
                    }
                    delegate = delegate.getChild();
                    cVarJ = cVarJ;
                }
                if (i2 == 1) {
                }
            }
            cVarJ = y23.j(r58Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.ui.input.pointer.d
    public boolean e(o56 internalPointerEvent) {
        Object[] objArr;
        LayoutNode layoutNode;
        boolean z = false;
        z = false;
        z = false;
        if (!this.relevantChanges.f() && this.modifierNode.getIsAttached()) {
            NodeCoordinator coordinator = this.modifierNode.getCoordinator();
            if ((coordinator == null || (layoutNode = coordinator.getLayoutNode()) == null) ? false : layoutNode.x()) {
                e eVar = this.pointerEvent;
                Intrinsics.g(eVar);
                kn6 kn6Var = this.coordinates;
                Intrinsics.g(kn6Var);
                long jA = kn6Var.a();
                androidx.compose.ui.b.c cVarJ = this.modifierNode;
                int iA = ni8.a(16);
                r58 r58Var = null;
                while (cVarJ != null) {
                    if (cVarJ instanceof bf9) {
                        ((bf9) cVarJ).x1(eVar, PointerEventPass.Final, jA);
                        objArr = false;
                    } else {
                        objArr = true;
                    }
                    if (objArr != false) {
                        if (((cVarJ.getKindSet() & iA) != 0) != false && (cVarJ instanceof k33)) {
                            int i = 0;
                            for (androidx.compose.ui.b.c delegate = ((k33) cVarJ).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                if (((delegate.getKindSet() & iA) != 0) != false) {
                                    i++;
                                    if (i == 1) {
                                        cVarJ = delegate;
                                    } else {
                                        if (r58Var == null) {
                                            r58Var = new r58(new androidx.compose.ui.b.c[16], 0);
                                        }
                                        if (cVarJ != null) {
                                            r58Var.c(cVarJ);
                                            cVarJ = null;
                                        }
                                        r58Var.c(delegate);
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                    }
                    cVarJ = y23.j(r58Var);
                }
                if (this.modifierNode.getIsAttached()) {
                    r58<Node> r58VarG = g();
                    Node[] nodeArr = r58VarG.content;
                    int size = r58VarG.getSize();
                    for (int i2 = 0; i2 < size; i2++) {
                        nodeArr[i2].e(internalPointerEvent);
                    }
                }
                z = true;
            }
        }
        b(internalPointerEvent);
        j();
        return z;
    }

    @Override // androidx.compose.ui.input.pointer.d
    public boolean f(ha7<PointerInputChange> changes, kn6 parentCoordinates, o56 internalPointerEvent, boolean isInBounds) {
        boolean z;
        boolean z2;
        LayoutNode layoutNode;
        if (this.relevantChanges.f() || !this.modifierNode.getIsAttached()) {
            return false;
        }
        NodeCoordinator coordinator = this.modifierNode.getCoordinator();
        if (!((coordinator == null || (layoutNode = coordinator.getLayoutNode()) == null) ? false : layoutNode.x())) {
            return false;
        }
        e eVar = this.pointerEvent;
        Intrinsics.g(eVar);
        kn6 kn6Var = this.coordinates;
        Intrinsics.g(kn6Var);
        long jA = kn6Var.a();
        androidx.compose.ui.b.c cVarJ = this.modifierNode;
        int iA = ni8.a(16);
        r58 r58Var = null;
        while (cVarJ != null) {
            if (cVarJ instanceof bf9) {
                ((bf9) cVarJ).x1(eVar, PointerEventPass.Initial, jA);
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2) {
                if (((cVarJ.getKindSet() & iA) != 0) && (cVarJ instanceof k33)) {
                    int i = 0;
                    for (androidx.compose.ui.b.c delegate = ((k33) cVarJ).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                        if ((delegate.getKindSet() & iA) != 0) {
                            i++;
                            if (i == 1) {
                                cVarJ = delegate;
                            } else {
                                if (r58Var == null) {
                                    r58Var = new r58(new androidx.compose.ui.b.c[16], 0);
                                }
                                if (cVarJ != null) {
                                    r58Var.c(cVarJ);
                                    cVarJ = null;
                                }
                                r58Var.c(delegate);
                            }
                        }
                    }
                    if (i == 1) {
                    }
                }
            }
            cVarJ = y23.j(r58Var);
        }
        if (this.modifierNode.getIsAttached()) {
            r58<Node> r58VarG = g();
            Node[] nodeArr = r58VarG.content;
            int size = r58VarG.getSize();
            for (int i2 = 0; i2 < size; i2++) {
                Node node = nodeArr[i2];
                ha7<PointerInputChange> ha7Var = this.relevantChanges;
                kn6 kn6Var2 = this.coordinates;
                Intrinsics.g(kn6Var2);
                node.f(ha7Var, kn6Var2, internalPointerEvent, isInBounds);
            }
        }
        if (this.modifierNode.getIsAttached()) {
            androidx.compose.ui.b.c cVarJ2 = this.modifierNode;
            int iA2 = ni8.a(16);
            r58 r58Var2 = null;
            while (cVarJ2 != null) {
                if (cVarJ2 instanceof bf9) {
                    ((bf9) cVarJ2).x1(eVar, PointerEventPass.Main, jA);
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    if (((cVarJ2.getKindSet() & iA2) != 0) && (cVarJ2 instanceof k33)) {
                        int i3 = 0;
                        for (androidx.compose.ui.b.c delegate2 = ((k33) cVarJ2).getDelegate(); delegate2 != null; delegate2 = delegate2.getChild()) {
                            if ((delegate2.getKindSet() & iA2) != 0) {
                                i3++;
                                if (i3 == 1) {
                                    cVarJ2 = delegate2;
                                } else {
                                    if (r58Var2 == null) {
                                        r58Var2 = new r58(new androidx.compose.ui.b.c[16], 0);
                                    }
                                    if (cVarJ2 != null) {
                                        r58Var2.c(cVarJ2);
                                        cVarJ2 = null;
                                    }
                                    r58Var2.c(delegate2);
                                }
                            }
                        }
                        if (i3 == 1) {
                        }
                    }
                }
                cVarJ2 = y23.j(r58Var2);
            }
        }
        return true;
    }

    @Override // androidx.compose.ui.input.pointer.d
    public void h(long pointerIdValue, e58<Node> hitNodes) {
        if (this.pointerIds.c(pointerIdValue) && !hitNodes.a(this)) {
            this.pointerIds.g(pointerIdValue);
            this.relevantChanges.i(pointerIdValue);
        }
        r58<Node> r58VarG = g();
        Node[] nodeArr = r58VarG.content;
        int size = r58VarG.getSize();
        for (int i = 0; i < size; i++) {
            nodeArr[i].h(pointerIdValue, hitNodes);
        }
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final androidx.compose.ui.b.c getModifierNode() {
        return this.modifierNode;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final te9 getPointerIds() {
        return this.pointerIds;
    }

    public final void n() {
        this.isIn = true;
    }

    public String toString() {
        return "Node(modifierNode=" + this.modifierNode + ", children=" + g() + ", pointerIds=" + this.pointerIds + ')';
    }
}
