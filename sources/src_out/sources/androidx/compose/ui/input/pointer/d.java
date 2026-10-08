package androidx.compose.ui.input.pointer;

import com.google.inputmethod.e58;
import com.google.inputmethod.ha7;
import com.google.inputmethod.kn6;
import com.google.inputmethod.o56;
import com.google.inputmethod.r58;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0011\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\r\u001a\u00020\u000b2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ5\u0010\u000f\u001a\u00020\u000b2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0003J\u0017\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0012¢\u0006\u0004\b\u0018\u0010\u0003J%\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u00192\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b \u0010!R\u001d\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001c0\"8\u0006¢\u0006\f\n\u0004\b\r\u0010#\u001a\u0004\b$\u0010%R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00000\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010'¨\u0006)"}, d2 = {"Landroidx/compose/ui/input/pointer/d;", "", "<init>", "()V", "Lcom/google/android/ha7;", "Landroidx/compose/ui/input/pointer/i;", "changes", "Lcom/google/android/kn6;", "parentCoordinates", "Lcom/google/android/o56;", "internalPointerEvent", "", "isInBounds", "a", "(Lcom/google/android/ha7;Lcom/google/android/kn6;Lcom/google/android/o56;Z)Z", "f", "e", "(Lcom/google/android/o56;)Z", "", "d", "Landroidx/compose/ui/b$c;", "pointerInputModifierNode", "i", "(Landroidx/compose/ui/b$c;)V", "c", "", "pointerIdValue", "Lcom/google/android/e58;", "Landroidx/compose/ui/input/pointer/c;", "hitNodes", "h", "(JLcom/google/android/e58;)V", "b", "(Lcom/google/android/o56;)V", "Lcom/google/android/r58;", "Lcom/google/android/r58;", "g", "()Lcom/google/android/r58;", "children", "Lcom/google/android/e58;", "removeMatchingPointerInputModifierNodeList", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final r58<Node> children = new r58<>(new Node[16], 0);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final e58<d> removeMatchingPointerInputModifierNodeList = new e58<>(10);

    public boolean a(ha7<PointerInputChange> changes, kn6 parentCoordinates, o56 internalPointerEvent, boolean isInBounds) {
        r58<Node> r58Var = this.children;
        Node[] cVarArr = r58Var.content;
        int size = r58Var.getSize();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            z = cVarArr[i].a(changes, parentCoordinates, internalPointerEvent, isInBounds) || z;
        }
        return z;
    }

    public void b(o56 internalPointerEvent) {
        int size = this.children.getSize();
        while (true) {
            size--;
            if (-1 >= size) {
                return;
            }
            if (this.children.content[size].getPointerIds().f()) {
                this.children.u(size);
            }
        }
    }

    public final void c() {
        this.children.j();
    }

    public void d() {
        r58<Node> r58Var = this.children;
        Node[] cVarArr = r58Var.content;
        int size = r58Var.getSize();
        for (int i = 0; i < size; i++) {
            cVarArr[i].d();
        }
    }

    public boolean e(o56 internalPointerEvent) {
        r58<Node> r58Var = this.children;
        Node[] cVarArr = r58Var.content;
        int size = r58Var.getSize();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            z = cVarArr[i].e(internalPointerEvent) || z;
        }
        b(internalPointerEvent);
        return z;
    }

    public boolean f(ha7<PointerInputChange> changes, kn6 parentCoordinates, o56 internalPointerEvent, boolean isInBounds) {
        r58<Node> r58Var = this.children;
        Node[] cVarArr = r58Var.content;
        int size = r58Var.getSize();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            z = cVarArr[i].f(changes, parentCoordinates, internalPointerEvent, isInBounds) || z;
        }
        return z;
    }

    public final r58<Node> g() {
        return this.children;
    }

    public void h(long pointerIdValue, e58<Node> hitNodes) {
        r58<Node> r58Var = this.children;
        Node[] cVarArr = r58Var.content;
        int size = r58Var.getSize();
        for (int i = 0; i < size; i++) {
            cVarArr[i].h(pointerIdValue, hitNodes);
        }
    }

    public void i(androidx.compose.ui.b.c pointerInputModifierNode) {
        this.removeMatchingPointerInputModifierNodeList.u();
        this.removeMatchingPointerInputModifierNodeList.n(this);
        while (this.removeMatchingPointerInputModifierNodeList.h()) {
            e58<d> e58Var = this.removeMatchingPointerInputModifierNodeList;
            d dVarB = e58Var.B(e58Var.get_size() - 1);
            int i = 0;
            while (i < dVarB.children.getSize()) {
                Node cVar = dVarB.children.content[i];
                if (Intrinsics.e(cVar.getModifierNode(), pointerInputModifierNode)) {
                    dVarB.children.s(cVar);
                    cVar.d();
                } else {
                    this.removeMatchingPointerInputModifierNodeList.n(cVar);
                    i++;
                }
            }
        }
    }
}
