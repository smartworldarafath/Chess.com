package androidx.compose.ui.node;

import androidx.compose.ui.graphics.layer.GraphicsLayer;
import com.google.inputmethod.dm;
import com.google.inputmethod.ei1;
import com.google.inputmethod.emc;
import com.google.inputmethod.fo6;
import com.google.inputmethod.hd5;
import com.google.inputmethod.mq1;
import com.google.inputmethod.q09;
import com.google.inputmethod.r58;
import com.google.inputmethod.t04;
import com.google.inputmethod.uc;
import com.google.inputmethod.w09;
import com.google.inputmethod.w41;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\b\u0001\u0018\u0000 H2\u00020\u0001:\u0002IJB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0014\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0015\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0016\u0010\u0012J'\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ5\u0010\"\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0014\u0010!\u001a\u0010\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u0006\u0018\u00010\u001fH\u0014¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J!\u0010+\u001a\u00020\u00062\u0006\u0010)\u001a\u00020(2\b\u0010*\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b+\u0010,J7\u00107\u001a\u00020\u00062\u0006\u0010.\u001a\u00020-2\u0006\u00100\u001a\u00020/2\u0006\u00102\u001a\u0002012\u0006\u00104\u001a\u0002032\u0006\u00106\u001a\u000205H\u0016¢\u0006\u0004\b7\u00108R\u001a\u0010>\u001a\u0002098\u0016X\u0096\u0004¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R.\u0010G\u001a\u0004\u0018\u00010?2\b\u0010@\u001a\u0004\u0018\u00010?8\u0016@TX\u0096\u000e¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010F¨\u0006K"}, d2 = {"Landroidx/compose/ui/node/a;", "Landroidx/compose/ui/node/NodeCoordinator;", "Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "<init>", "(Landroidx/compose/ui/node/LayoutNode;)V", "", "m4", "()V", "S2", "Lcom/google/android/kx1;", "constraints", "Landroidx/compose/ui/layout/o;", "r0", "(J)Landroidx/compose/ui/layout/o;", "", "height", "o0", "(I)I", "width", "d0", "q0", "W", "Lcom/google/android/g16;", "position", "", "zIndex", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "layer", "W0", "(JFLandroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/m;", "layerBlock", "X0", "(JFLkotlin/jvm/functions/Function1;)V", "Lcom/google/android/uc;", "alignmentLine", "h1", "(Lcom/google/android/uc;)I", "Lcom/google/android/w41;", "canvas", "graphicsLayer", "J3", "(Lcom/google/android/w41;Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "Landroidx/compose/ui/node/NodeCoordinator$d;", "hitTestSource", "Lcom/google/android/rn8;", "pointerPosition", "Lcom/google/android/hd5;", "hitTestResult", "Landroidx/compose/ui/input/pointer/j;", "pointerType", "", "isInLayer", "u3", "(Landroidx/compose/ui/node/NodeCoordinator$d;JLcom/google/android/hd5;IZ)V", "Lcom/google/android/emc;", "Z", "Lcom/google/android/emc;", "l4", "()Lcom/google/android/emc;", "tail", "Landroidx/compose/ui/node/i;", "value", "a0", "Landroidx/compose/ui/node/i;", "f3", "()Landroidx/compose/ui/node/i;", "n4", "(Landroidx/compose/ui/node/i;)V", "lookaheadDelegate", "b0", "b", "a", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a extends NodeCoordinator {
    private static final q09 c0;

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    private final emc tail;

    /* JADX INFO: renamed from: a0, reason: from kotlin metadata */
    private i lookaheadDelegate;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0015\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0016\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0017\u0010\u0013¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/node/a$b;", "Landroidx/compose/ui/node/i;", "<init>", "(Landroidx/compose/ui/node/a;)V", "Lcom/google/android/kx1;", "constraints", "Landroidx/compose/ui/layout/o;", "r0", "(J)Landroidx/compose/ui/layout/o;", "Lcom/google/android/uc;", "alignmentLine", "", "h1", "(Lcom/google/android/uc;)I", "", "E2", "()V", "height", "o0", "(I)I", "width", "d0", "q0", "W", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private final class b extends i {
        public b() {
            super(a.this);
        }

        @Override // androidx.compose.ui.node.i
        protected void E2() {
            LookaheadPassDelegate lookaheadPassDelegateL0 = getLayoutNode().l0();
            Intrinsics.g(lookaheadPassDelegateL0);
            lookaheadPassDelegateL0.s2();
        }

        @Override // androidx.compose.ui.node.i, com.google.inputmethod.f66
        public int W(int width) {
            return getLayoutNode().k1(width);
        }

        @Override // androidx.compose.ui.node.i, com.google.inputmethod.f66
        public int d0(int width) {
            return getLayoutNode().o1(width);
        }

        @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
        public int h1(uc alignmentLine) {
            Integer num = n2().r().get(alignmentLine);
            int iIntValue = num != null ? num.intValue() : t04.INVALID_ID;
            q2().u(alignmentLine, iIntValue);
            return iIntValue;
        }

        @Override // androidx.compose.ui.node.i, com.google.inputmethod.f66
        public int o0(int height) {
            return getLayoutNode().p1(height);
        }

        @Override // androidx.compose.ui.node.i, com.google.inputmethod.f66
        public int q0(int height) {
            return getLayoutNode().l1(height);
        }

        @Override // com.google.inputmethod.dj7
        public androidx.compose.ui.layout.o r0(long constraints) {
            Z0(constraints);
            r58<LayoutNode> r58VarL0 = getLayoutNode().L0();
            LayoutNode[] layoutNodeArr = r58VarL0.content;
            int size = r58VarL0.getSize();
            for (int i = 0; i < size; i++) {
                LookaheadPassDelegate lookaheadPassDelegateL0 = layoutNodeArr[i].l0();
                Intrinsics.g(lookaheadPassDelegateL0);
                lookaheadPassDelegateL0.L2(LayoutNode.UsageByParent.NotUsed);
            }
            K2(getLayoutNode().getMeasurePolicy().mo0measure3p2s80s(this, getLayoutNode().P(), constraints));
            return this;
        }
    }

    static {
        q09 q09VarA = dm.a();
        q09VarA.n(ei1.INSTANCE.g());
        q09VarA.z(1.0f);
        q09VarA.y(w09.INSTANCE.b());
        c0 = q09VarA;
    }

    public a(LayoutNode layoutNode) {
        super(layoutNode);
        this.tail = new emc();
        j3().l3(this);
        this.lookaheadDelegate = layoutNode.getLookaheadRoot() != null ? new b() : null;
    }

    private final void m4() {
        if (getIsShallowPlacing()) {
            return;
        }
        getLayoutNode().o0().v2();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    @Override // androidx.compose.ui.node.NodeCoordinator
    public void J3(w41 canvas, GraphicsLayer graphicsLayer) throws Throwable {
        m mVarB = fo6.b(getLayoutNode());
        r58<LayoutNode> r58VarK0 = getLayoutNode().K0();
        LayoutNode[] layoutNodeArr = r58VarK0.content;
        int size = r58VarK0.getSize();
        for (int i = 0; i < size; i++) {
            LayoutNode layoutNode = layoutNodeArr[i];
            if (layoutNode.x()) {
                layoutNode.J(canvas, graphicsLayer);
            }
        }
        if (mVarB.getShowLayoutBounds()) {
            Q2(canvas, c0);
        }
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    public void S2() {
        if (getLookaheadDelegate() == null) {
            n4(new b());
        }
    }

    @Override // com.google.inputmethod.f66
    public int W(int width) {
        return getLayoutNode().i1(width);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    @Override // androidx.compose.ui.node.NodeCoordinator, androidx.compose.ui.layout.o
    public void W0(long position, float zIndex, GraphicsLayer layer) throws KotlinNothingValueException {
        super.W0(position, zIndex, layer);
        m4();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    @Override // androidx.compose.ui.node.NodeCoordinator, androidx.compose.ui.layout.o
    public void X0(long position, float zIndex, Function1<? super androidx.compose.ui.graphics.m, Unit> layerBlock) throws KotlinNothingValueException {
        super.X0(position, zIndex, layerBlock);
        m4();
    }

    @Override // com.google.inputmethod.f66
    public int d0(int width) {
        return getLayoutNode().m1(width);
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    /* JADX INFO: renamed from: f3, reason: from getter */
    public i getLookaheadDelegate() {
        return this.lookaheadDelegate;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public int h1(uc alignmentLine) {
        i lookaheadDelegate = getLookaheadDelegate();
        if (lookaheadDelegate != null) {
            return lookaheadDelegate.h1(alignmentLine);
        }
        Integer num = X2().r().get(alignmentLine);
        return num != null ? num.intValue() : t04.INVALID_ID;
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    /* JADX INFO: renamed from: l4, reason: from getter and merged with bridge method [inline-methods] */
    public emc j3() {
        return this.tail;
    }

    protected void n4(i iVar) {
        this.lookaheadDelegate = iVar;
    }

    @Override // com.google.inputmethod.f66
    public int o0(int height) {
        return getLayoutNode().n1(height);
    }

    @Override // com.google.inputmethod.f66
    public int q0(int height) {
        return getLayoutNode().j1(height);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    @Override // com.google.inputmethod.dj7
    public androidx.compose.ui.layout.o r0(long constraints) throws KotlinNothingValueException {
        if (getForceMeasureWithLookaheadConstraints()) {
            i lookaheadDelegate = getLookaheadDelegate();
            Intrinsics.g(lookaheadDelegate);
            constraints = lookaheadDelegate.s2();
        }
        Z0(constraints);
        r58<LayoutNode> r58VarL0 = getLayoutNode().L0();
        LayoutNode[] layoutNodeArr = r58VarL0.content;
        int size = r58VarL0.getSize();
        for (int i = 0; i < size; i++) {
            layoutNodeArr[i].o0().K2(LayoutNode.UsageByParent.NotUsed);
        }
        T3(getLayoutNode().getMeasurePolicy().mo0measure3p2s80s(this, getLayoutNode().Q(), constraints));
        E3();
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003f  */
    /* JADX WARN: Code duplicated, block: B:18:0x0055  */
    /* JADX WARN: Code duplicated, block: B:20:0x005f  */
    /* JADX WARN: Code duplicated, block: B:22:0x0070  */
    /* JADX WARN: Code duplicated, block: B:23:0x0072  */
    /* JADX WARN: Code duplicated, block: B:26:0x0079  */
    /* JADX WARN: Code duplicated, block: B:28:0x007c  */
    /* JADX WARN: Code duplicated, block: B:30:0x0086  */
    /* JADX WARN: Code duplicated, block: B:31:0x008a  */
    /* JADX WARN: Code duplicated, block: B:37:0x0090 A[EDGE_INSN: B:37:0x0090->B:33:0x0090 BREAK  A[LOOP:0: B:17:0x0053->B:32:0x008b], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x008b A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x008b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:? A[RETURN, SYNTHETIC] */
    @Override // androidx.compose.ui.node.NodeCoordinator
    public void u3(NodeCoordinator.d hitTestSource, long pointerPosition, hd5 hitTestResult, int pointerType, boolean isInLayer) {
        int i;
        boolean z;
        LayoutNode[] layoutNodeArr;
        int size;
        LayoutNode layoutNode;
        boolean z2;
        boolean zR;
        boolean z3 = false;
        if (hitTestSource.e(getLayoutNode())) {
            if (!k4(pointerPosition)) {
                i = pointerType;
                if (!androidx.compose.ui.input.pointer.j.i(pointerType, androidx.compose.ui.input.pointer.j.INSTANCE.d()) || (Float.floatToRawIntBits(O2(pointerPosition, g3())) & Integer.MAX_VALUE) >= 2139095040) {
                }
                if (z) {
                    int i2 = hitTestResult.hitDepth;
                    r58<LayoutNode> r58VarK0 = getLayoutNode().K0();
                    layoutNodeArr = r58VarK0.content;
                    size = r58VarK0.getSize() - 1;
                    while (size >= 0) {
                        layoutNode = layoutNodeArr[size];
                        if (layoutNode.x()) {
                            int i3 = i;
                            z2 = z3;
                            hitTestSource.b(layoutNode, pointerPosition, hitTestResult, i3, z2);
                            zR = hitTestResult.r();
                            if (mq1.isSkipNonImportantSemanticsNodesHitTestEnabled) {
                                if (!zR && !hitTestSource.d(hitTestResult, layoutNode)) {
                                    break;
                                }
                            } else if (!zR) {
                                if (!layoutNode.x0().Y3()) {
                                    break;
                                } else {
                                    hitTestResult.b();
                                }
                            } else {
                                continue;
                            }
                        } else {
                            z2 = z3;
                        }
                        size--;
                        z3 = z2;
                        i = pointerType;
                    }
                    hitTestResult.hitDepth = i2;
                }
            }
            i = pointerType;
            z3 = isInLayer;
            z = true;
            if (z) {
                int i4 = hitTestResult.hitDepth;
                r58<LayoutNode> r58VarK1 = getLayoutNode().K0();
                layoutNodeArr = r58VarK1.content;
                size = r58VarK1.getSize() - 1;
                while (size >= 0) {
                    layoutNode = layoutNodeArr[size];
                    if (layoutNode.x()) {
                        int i5 = i;
                        z2 = z3;
                        hitTestSource.b(layoutNode, pointerPosition, hitTestResult, i5, z2);
                        zR = hitTestResult.r();
                        if (mq1.isSkipNonImportantSemanticsNodesHitTestEnabled) {
                            if (!zR) {
                                if (!layoutNode.x0().Y3()) {
                                    break;
                                    break;
                                }
                                hitTestResult.b();
                            } else {
                                continue;
                            }
                        } else if (!zR) {
                            continue;
                        }
                    } else {
                        z2 = z3;
                    }
                    size--;
                    z3 = z2;
                    i = pointerType;
                }
                hitTestResult.hitDepth = i4;
            }
        }
        i = pointerType;
        z = false;
        z3 = isInLayer;
        if (z) {
            int i6 = hitTestResult.hitDepth;
            r58<LayoutNode> r58VarK2 = getLayoutNode().K0();
            layoutNodeArr = r58VarK2.content;
            size = r58VarK2.getSize() - 1;
            while (size >= 0) {
                layoutNode = layoutNodeArr[size];
                if (layoutNode.x()) {
                    int i7 = i;
                    z2 = z3;
                    hitTestSource.b(layoutNode, pointerPosition, hitTestResult, i7, z2);
                    zR = hitTestResult.r();
                    if (mq1.isSkipNonImportantSemanticsNodesHitTestEnabled) {
                        if (!zR) {
                            if (!layoutNode.x0().Y3()) {
                                break;
                                break;
                            }
                            hitTestResult.b();
                        } else {
                            continue;
                        }
                    } else if (!zR) {
                        continue;
                    }
                } else {
                    z2 = z3;
                }
                size--;
                z3 = z2;
                i = pointerType;
            }
            hitTestResult.hitDepth = i6;
        }
    }
}
