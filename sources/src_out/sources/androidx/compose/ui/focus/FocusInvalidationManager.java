package androidx.compose.ui.focus;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.m;
import com.google.inputmethod.ik4;
import com.google.inputmethod.ki8;
import com.google.inputmethod.l4b;
import com.google.inputmethod.ni8;
import com.google.inputmethod.y23;
import com.google.inputmethod.zw5;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u0015\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\b¢\u0006\u0004\b\u0013\u0010\nJ\r\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0019R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\f0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001bR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00100\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001bR\u0016\u0010\u001f\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u001e¨\u0006 "}, d2 = {"Landroidx/compose/ui/focus/FocusInvalidationManager;", "", "Landroidx/compose/ui/focus/FocusOwner;", "focusOwner", "Landroidx/compose/ui/node/m;", "owner", "<init>", "(Landroidx/compose/ui/focus/FocusOwner;Landroidx/compose/ui/node/m;)V", "", "c", "()V", "d", "Landroidx/compose/ui/focus/FocusTargetNode;", "node", "f", "(Landroidx/compose/ui/focus/FocusTargetNode;)V", "Lcom/google/android/ik4;", "g", "(Lcom/google/android/ik4;)V", "e", "", "b", "()Z", "a", "Landroidx/compose/ui/focus/FocusOwner;", "Landroidx/compose/ui/node/m;", "Landroidx/collection/d;", "Landroidx/collection/d;", "focusTargetNodes", "focusEventNodes", "Z", "isInvalidationScheduled", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FocusInvalidationManager {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final FocusOwner focusOwner;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final m owner;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final androidx.collection.d<FocusTargetNode> focusTargetNodes = l4b.b();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final androidx.collection.d<ik4> focusEventNodes = l4b.b();

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private boolean isInvalidationScheduled;

    public FocusInvalidationManager(FocusOwner focusOwner, m mVar) {
        this.focusOwner = focusOwner;
        this.owner = mVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:69:0x013e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:70:0x0140 A[LOOP:4: B:60:0x0112->B:70:0x0140, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:91:0x0143 A[EDGE_INSN: B:91:0x0143->B:71:0x0143 BREAK  A[LOOP:4: B:60:0x0112->B:70:0x0140], SYNTHETIC] */
    public final void c() throws NoWhenBranchMatchedException, KotlinNothingValueException {
        ki8 nodes;
        long j;
        FocusTargetNode focusTargetNodeI = this.focusOwner.i();
        long j2 = 255;
        if (focusTargetNodeI == null) {
            androidx.collection.d<ik4> dVar = this.focusEventNodes;
            Object[] objArr = dVar.elements;
            long[] jArr = dVar.metadata;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j3 = jArr[i];
                    if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        int i3 = 0;
                        while (i3 < i2) {
                            if ((j3 & j2) < 128) {
                                ((ik4) objArr[(i << 3) + i3]).J(FocusStateImpl.Inactive);
                            }
                            j3 >>= 8;
                            i3++;
                            j2 = j2;
                        }
                        j = j2;
                        if (i2 != 8) {
                            break;
                        }
                    } else {
                        j = j2;
                    }
                    if (i == length) {
                        break;
                    }
                    i++;
                    j2 = j;
                }
            }
        } else if (focusTargetNodeI.getIsAttached()) {
            if (this.focusTargetNodes.a(focusTargetNodeI)) {
                focusTargetNodeI.z3();
            }
            FocusStateImpl focusStateImplV1 = focusTargetNodeI.v1();
            int iA = ni8.a(1024) | ni8.a(4096);
            if (!focusTargetNodeI.getNode().getIsAttached()) {
                zw5.c("visitAncestors called on an unattached node");
            }
            androidx.compose.ui.b.c node = focusTargetNodeI.getNode();
            LayoutNode layoutNodeQ = y23.q(focusTargetNodeI);
            int i4 = 0;
            while (layoutNodeQ != null) {
                if ((layoutNodeQ.getNodes().getHead().getAggregateChildKindSet() & iA) != 0) {
                    while (node != null) {
                        if ((node.getKindSet() & iA) != 0) {
                            if ((ni8.a(1024) & node.getKindSet()) != 0) {
                                i4++;
                            }
                            if ((node instanceof ik4) && this.focusEventNodes.a(node)) {
                                if (i4 <= 1) {
                                    ((ik4) node).J(focusStateImplV1);
                                } else {
                                    ((ik4) node).J(FocusStateImpl.ActiveParent);
                                }
                                this.focusEventNodes.y(node);
                            }
                        }
                        node = node.getParent();
                    }
                }
                layoutNodeQ = layoutNodeQ.C0();
                node = (layoutNodeQ == null || (nodes = layoutNodeQ.getNodes()) == null) ? null : nodes.getTail();
            }
            androidx.collection.d<ik4> dVar2 = this.focusEventNodes;
            Object[] objArr2 = dVar2.elements;
            long[] jArr2 = dVar2.metadata;
            int length2 = jArr2.length - 2;
            if (length2 >= 0) {
                int i5 = 0;
                while (true) {
                    long j4 = jArr2[i5];
                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i5 != length2) {
                            break;
                            break;
                        }
                        i5++;
                    } else {
                        int i6 = 8 - ((~(i5 - length2)) >>> 31);
                        for (int i7 = 0; i7 < i6; i7++) {
                            if ((j4 & 255) < 128) {
                                ((ik4) objArr2[(i5 << 3) + i7]).J(FocusStateImpl.Inactive);
                            }
                            j4 >>= 8;
                        }
                        if (i6 != 8) {
                            break;
                        } else if (i5 != length2) {
                            break;
                        } else {
                            i5++;
                        }
                    }
                }
            }
        }
        d();
        this.focusTargetNodes.m();
        this.focusEventNodes.m();
        this.isInvalidationScheduled = false;
    }

    private final void d() {
        if (this.focusOwner.i() == null || this.focusOwner.A() == FocusStateImpl.Inactive) {
            this.focusOwner.d();
        }
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getIsInvalidationScheduled() {
        return this.isInvalidationScheduled;
    }

    public final void e() {
        if (this.isInvalidationScheduled) {
            return;
        }
        this.owner.M(new FocusInvalidationManager$scheduleInvalidation$1(this));
        this.isInvalidationScheduled = true;
    }

    public final void f(FocusTargetNode node) {
        if (this.focusTargetNodes.h(node)) {
            e();
        }
    }

    public final void g(ik4 node) {
        if (this.focusEventNodes.h(node)) {
            e();
        }
    }
}
