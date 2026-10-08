package androidx.compose.ui.input.pointer;

import com.google.inputmethod.e58;
import com.google.inputmethod.kn6;
import com.google.inputmethod.o56;
import com.google.inputmethod.r58;
import com.google.inputmethod.w48;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ%\u0010\u0010\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J-\u0010\u0017\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u00122\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u0015¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\b¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\b¢\u0006\u0004\b \u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010$\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010#R\u0016\u0010%\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010#R\u0016\u0010&\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010#R\u0016\u0010'\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010#R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00060\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010(R\u001a\u0010.\u001a\u00020*8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010+\u001a\u0004\b,\u0010-R \u00102\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101¨\u00063"}, d2 = {"Landroidx/compose/ui/input/pointer/HitPathTracker;", "", "Lcom/google/android/kn6;", "rootCoordinates", "<init>", "(Lcom/google/android/kn6;)V", "Landroidx/compose/ui/b$c;", "pointerInputNode", "", "g", "(Landroidx/compose/ui/b$c;)V", "", "pointerId", "Lcom/google/android/e58;", "Landroidx/compose/ui/input/pointer/c;", "hitNodes", "f", "(JLcom/google/android/e58;)V", "Lcom/google/android/se9;", "", "pointerInputNodes", "", "prunePointerIdsAndChangesNotInNodesList", "b", "(JLjava/util/List;Z)V", "Lcom/google/android/o56;", "internalPointerEvent", "isInBounds", "d", "(Lcom/google/android/o56;Z)Z", "c", "()V", "e", "a", "Lcom/google/android/kn6;", "Z", "dispatchingEvent", "dispatchCancelAfterDispatchedEvent", "clearNodeCacheAfterDispatchedEvent", "removeSpecificNodesAfterDispatchedEvent", "Lcom/google/android/e58;", "nodesToRemove", "Landroidx/compose/ui/input/pointer/d;", "Landroidx/compose/ui/input/pointer/d;", "getRoot$ui", "()Landroidx/compose/ui/input/pointer/d;", "root", "Lcom/google/android/w48;", "h", "Lcom/google/android/w48;", "hitPointerIdsAndNodesForPruningNonMatches", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class HitPathTracker {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final kn6 rootCoordinates;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private boolean dispatchingEvent;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private boolean dispatchCancelAfterDispatchedEvent;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private boolean clearNodeCacheAfterDispatchedEvent;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private boolean removeSpecificNodesAfterDispatchedEvent;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final e58<androidx.compose.ui.b.c> nodesToRemove = new e58<>(0, 1, null);

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final d root = new d();

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final w48<e58<Node>> hitPointerIdsAndNodesForPruningNonMatches = new w48<>(10);

    public HitPathTracker(kn6 kn6Var) {
        this.rootCoordinates = kn6Var;
    }

    private final void f(long pointerId, e58<Node> hitNodes) {
        this.root.h(pointerId, hitNodes);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g(androidx.compose.ui.b.c pointerInputNode) {
        if (!this.dispatchingEvent) {
            this.root.i(pointerInputNode);
        } else {
            this.removeSpecificNodesAfterDispatchedEvent = true;
            this.nodesToRemove.n(pointerInputNode);
        }
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00ef A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x00f1 A[LOOP:2: B:40:0x00b8->B:50:0x00f1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:59:0x00f4 A[EDGE_INSN: B:59:0x00f4->B:51:0x00f4 BREAK  A[LOOP:2: B:40:0x00b8->B:50:0x00f1], SYNTHETIC] */
    public final void b(long pointerId, List<? extends androidx.compose.ui.b.c> pointerInputNodes, boolean prunePointerIdsAndChangesNotInNodesList) {
        Node node;
        d dVar = this.root;
        int size = pointerInputNodes.size();
        boolean z = true;
        for (int i = 0; i < size; i++) {
            final androidx.compose.ui.b.c cVar = pointerInputNodes.get(i);
            if (cVar.getIsAttached()) {
                cVar.e3(new Function0<Unit>() { // from class: androidx.compose.ui.input.pointer.HitPathTracker$addHitPath$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    public /* bridge */ /* synthetic */ Object invoke() {
                        m14invoke();
                        return Unit.a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                    public final void m14invoke() {
                        this.this$0.g(cVar);
                    }
                });
                if (z) {
                    r58<Node> r58VarG = dVar.g();
                    Node[] nodeArr = r58VarG.content;
                    int size2 = r58VarG.getSize();
                    int i2 = 0;
                    while (true) {
                        if (i2 >= size2) {
                            node = null;
                            break;
                        }
                        node = nodeArr[i2];
                        if (Intrinsics.e(node.getModifierNode(), cVar)) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                    Node node2 = node;
                    if (node2 != null) {
                        node2.n();
                        node2.getPointerIds().a(pointerId);
                        if (prunePointerIdsAndChangesNotInNodesList) {
                            w48<e58<Node>> w48Var = this.hitPointerIdsAndNodesForPruningNonMatches;
                            e58<Node> e58VarB = w48Var.b(pointerId);
                            if (e58VarB == null) {
                                e58VarB = new e58<>(0, 1, null);
                                w48Var.q(pointerId, e58VarB);
                            }
                            e58VarB.n(node2);
                        }
                        dVar = node2;
                    } else {
                        z = false;
                    }
                }
                Node node3 = new Node(cVar);
                node3.getPointerIds().a(pointerId);
                if (prunePointerIdsAndChangesNotInNodesList) {
                    w48<e58<Node>> w48Var2 = this.hitPointerIdsAndNodesForPruningNonMatches;
                    e58<Node> e58VarB2 = w48Var2.b(pointerId);
                    if (e58VarB2 == null) {
                        e58VarB2 = new e58<>(0, 1, null);
                        w48Var2.q(pointerId, e58VarB2);
                    }
                    e58VarB2.n(node3);
                }
                dVar.g().c(node3);
                dVar = node3;
            }
        }
        if (prunePointerIdsAndChangesNotInNodesList) {
            w48<e58<Node>> w48Var3 = this.hitPointerIdsAndNodesForPruningNonMatches;
            long[] jArr = w48Var3.keys;
            Object[] objArr = w48Var3.values;
            long[] jArr2 = w48Var3.metadata;
            int length = jArr2.length - 2;
            if (length >= 0) {
                int i3 = 0;
                while (true) {
                    long j = jArr2[i3];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i3 != length) {
                            break;
                            break;
                        }
                        i3++;
                    } else {
                        int i4 = 8 - ((~(i3 - length)) >>> 31);
                        for (int i5 = 0; i5 < i4; i5++) {
                            if ((255 & j) < 128) {
                                int i6 = (i3 << 3) + i5;
                                f(jArr[i6], (e58) objArr[i6]);
                            }
                            j >>= 8;
                        }
                        if (i4 != 8) {
                            break;
                        } else if (i3 != length) {
                            break;
                        } else {
                            i3++;
                        }
                    }
                }
            }
        }
        this.hitPointerIdsAndNodesForPruningNonMatches.g();
    }

    public final void c() {
        if (this.clearNodeCacheAfterDispatchedEvent) {
            this.clearNodeCacheAfterDispatchedEvent = true;
        } else {
            this.root.c();
        }
    }

    public final boolean d(o56 internalPointerEvent, boolean isInBounds) {
        if (!this.root.a(internalPointerEvent.b(), this.rootCoordinates, internalPointerEvent, isInBounds)) {
            return false;
        }
        boolean z = true;
        this.dispatchingEvent = true;
        boolean zF = this.root.f(internalPointerEvent.b(), this.rootCoordinates, internalPointerEvent, isInBounds);
        if (!this.root.e(internalPointerEvent) && !zF) {
            z = false;
        }
        this.dispatchingEvent = false;
        if (this.removeSpecificNodesAfterDispatchedEvent) {
            this.removeSpecificNodesAfterDispatchedEvent = false;
            int i = this.nodesToRemove.get_size();
            for (int i2 = 0; i2 < i; i2++) {
                g(this.nodesToRemove.d(i2));
            }
            this.nodesToRemove.u();
        }
        if (this.dispatchCancelAfterDispatchedEvent) {
            this.dispatchCancelAfterDispatchedEvent = false;
            e();
        }
        if (this.clearNodeCacheAfterDispatchedEvent) {
            this.clearNodeCacheAfterDispatchedEvent = false;
            c();
        }
        return z;
    }

    public final void e() {
        if (this.dispatchingEvent) {
            this.dispatchCancelAfterDispatchedEvent = true;
        } else {
            this.root.d();
            c();
        }
    }
}
