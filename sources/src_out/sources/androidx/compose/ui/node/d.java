package androidx.compose.ui.node;

import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.layout.ApproachLayoutModifierNode;
import com.google.inputmethod.ao6;
import com.google.inputmethod.dm;
import com.google.inputmethod.ei1;
import com.google.inputmethod.fj7;
import com.google.inputmethod.fo6;
import com.google.inputmethod.g16;
import com.google.inputmethod.kx1;
import com.google.inputmethod.mra;
import com.google.inputmethod.ni8;
import com.google.inputmethod.q09;
import com.google.inputmethod.q16;
import com.google.inputmethod.uc;
import com.google.inputmethod.w09;
import com.google.inputmethod.w41;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u0000 \u00172\u00020\u0001:\u0002QRB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0017\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0018\u0010\u0014J'\u0010\u001f\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0014¢\u0006\u0004\b\u001f\u0010 J5\u0010$\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0014\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\b\u0018\u00010!H\u0014¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020\u00112\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b(\u0010)J!\u0010-\u001a\u00020\b2\u0006\u0010+\u001a\u00020*2\b\u0010,\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b-\u0010.R*\u00106\u001a\u00020\u00042\u0006\u0010/\u001a\u00020\u00048\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R$\u0010=\u001a\u0004\u0018\u00010\f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R.\u0010E\u001a\u0004\u0018\u00010>2\b\u0010/\u001a\u0004\u0018\u00010>8\u0016@TX\u0096\u000e¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\u0018\u0010I\u001a\u0004\u0018\u00010F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010M\u001a\u00020J8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bK\u0010LR\u0011\u0010P\u001a\u00020\u00018F¢\u0006\u0006\u001a\u0004\bN\u0010O¨\u0006S"}, d2 = {"Landroidx/compose/ui/node/d;", "Landroidx/compose/ui/node/NodeCoordinator;", "Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "Landroidx/compose/ui/node/c;", "measureNode", "<init>", "(Landroidx/compose/ui/node/LayoutNode;Landroidx/compose/ui/node/c;)V", "", "p4", "()V", "S2", "Lcom/google/android/kx1;", "constraints", "Landroidx/compose/ui/layout/o;", "r0", "(J)Landroidx/compose/ui/layout/o;", "", "height", "o0", "(I)I", "q0", "width", "d0", "W", "Lcom/google/android/g16;", "position", "", "zIndex", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "layer", "W0", "(JFLandroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/m;", "layerBlock", "X0", "(JFLkotlin/jvm/functions/Function1;)V", "Lcom/google/android/uc;", "alignmentLine", "h1", "(Lcom/google/android/uc;)I", "Lcom/google/android/w41;", "canvas", "graphicsLayer", "J3", "(Lcom/google/android/w41;Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "value", "Z", "Landroidx/compose/ui/node/c;", "m4", "()Landroidx/compose/ui/node/c;", "q4", "(Landroidx/compose/ui/node/c;)V", "layoutModifierNode", "a0", "Lcom/google/android/kx1;", "n4", "()Lcom/google/android/kx1;", "r4", "(Lcom/google/android/kx1;)V", "lookaheadConstraints", "Landroidx/compose/ui/node/i;", "b0", "Landroidx/compose/ui/node/i;", "f3", "()Landroidx/compose/ui/node/i;", "s4", "(Landroidx/compose/ui/node/i;)V", "lookaheadDelegate", "Landroidx/compose/ui/layout/b;", "c0", "Landroidx/compose/ui/layout/b;", "approachMeasureScope", "Landroidx/compose/ui/b$c;", "j3", "()Landroidx/compose/ui/b$c;", "tail", "o4", "()Landroidx/compose/ui/node/NodeCoordinator;", "wrappedNonNull", "b", "a", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d extends NodeCoordinator {
    private static final q09 e0;

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    private androidx.compose.ui.node.c layoutModifierNode;

    /* JADX INFO: renamed from: a0, reason: from kotlin metadata */
    private kx1 lookaheadConstraints;

    /* JADX INFO: renamed from: b0, reason: from kotlin metadata */
    private i lookaheadDelegate;

    /* JADX INFO: renamed from: c0, reason: from kotlin metadata */
    private androidx.compose.ui.layout.b approachMeasureScope;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\u0010¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/node/d$b;", "Landroidx/compose/ui/node/i;", "<init>", "(Landroidx/compose/ui/node/d;)V", "Lcom/google/android/kx1;", "constraints", "Landroidx/compose/ui/layout/o;", "r0", "(J)Landroidx/compose/ui/layout/o;", "Lcom/google/android/uc;", "alignmentLine", "", "h1", "(Lcom/google/android/uc;)I", "height", "o0", "(I)I", "q0", "width", "d0", "W", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private final class b extends i {
        public b() {
            super(d.this);
        }

        @Override // androidx.compose.ui.node.i, com.google.inputmethod.f66
        public int W(int width) {
            androidx.compose.ui.node.c layoutModifierNode = d.this.getLayoutModifierNode();
            i lookaheadDelegate = d.this.o4().getLookaheadDelegate();
            Intrinsics.g(lookaheadDelegate);
            return layoutModifierNode.i(this, lookaheadDelegate, width);
        }

        @Override // androidx.compose.ui.node.i, com.google.inputmethod.f66
        public int d0(int width) {
            androidx.compose.ui.node.c layoutModifierNode = d.this.getLayoutModifierNode();
            i lookaheadDelegate = d.this.o4().getLookaheadDelegate();
            Intrinsics.g(lookaheadDelegate);
            return layoutModifierNode.m(this, lookaheadDelegate, width);
        }

        @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
        public int h1(uc alignmentLine) {
            int iB = ao6.b(this, alignmentLine);
            q2().u(alignmentLine, iB);
            return iB;
        }

        @Override // androidx.compose.ui.node.i, com.google.inputmethod.f66
        public int o0(int height) {
            androidx.compose.ui.node.c layoutModifierNode = d.this.getLayoutModifierNode();
            i lookaheadDelegate = d.this.o4().getLookaheadDelegate();
            Intrinsics.g(lookaheadDelegate);
            return layoutModifierNode.z(this, lookaheadDelegate, height);
        }

        @Override // androidx.compose.ui.node.i, com.google.inputmethod.f66
        public int q0(int height) {
            androidx.compose.ui.node.c layoutModifierNode = d.this.getLayoutModifierNode();
            i lookaheadDelegate = d.this.o4().getLookaheadDelegate();
            Intrinsics.g(lookaheadDelegate);
            return layoutModifierNode.t(this, lookaheadDelegate, height);
        }

        @Override // com.google.inputmethod.dj7
        public androidx.compose.ui.layout.o r0(long constraints) {
            d dVar = d.this;
            Z0(constraints);
            dVar.r4(kx1.a(constraints));
            androidx.compose.ui.node.c layoutModifierNode = dVar.getLayoutModifierNode();
            i lookaheadDelegate = dVar.o4().getLookaheadDelegate();
            Intrinsics.g(lookaheadDelegate);
            K2(layoutModifierNode.b(this, lookaheadDelegate, constraints));
            return this;
        }
    }

    @Metadata(d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H\u0096\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\r\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\tR \u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00050\u000e8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\"\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00138VX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"androidx/compose/ui/node/d$c", "Lcom/google/android/fj7;", "", "l", "()V", "", "b", "I", "getWidth", "()I", "width", "c", "getHeight", "height", "", "Lcom/google/android/uc;", "j", "()Ljava/util/Map;", "alignmentLines", "Lkotlin/Function1;", "Lcom/google/android/mra;", "k", "()Lkotlin/jvm/functions/Function1;", "rulers", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c implements fj7 {
        private final /* synthetic */ fj7 a;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final int width;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final int height;

        c(fj7 fj7Var, d dVar) {
            this.a = fj7Var;
            i lookaheadDelegate = dVar.getLookaheadDelegate();
            Intrinsics.g(lookaheadDelegate);
            this.width = lookaheadDelegate.getWidth();
            i lookaheadDelegate2 = dVar.getLookaheadDelegate();
            Intrinsics.g(lookaheadDelegate2);
            this.height = lookaheadDelegate2.getHeight();
        }

        @Override // com.google.inputmethod.fj7
        public int getHeight() {
            return this.height;
        }

        @Override // com.google.inputmethod.fj7
        public int getWidth() {
            return this.width;
        }

        @Override // com.google.inputmethod.fj7
        public Map<uc, Integer> j() {
            return this.a.j();
        }

        @Override // com.google.inputmethod.fj7
        public Function1<mra, Unit> k() {
            return this.a.k();
        }

        @Override // com.google.inputmethod.fj7
        public void l() {
            this.a.l();
        }
    }

    static {
        q09 q09VarA = dm.a();
        q09VarA.n(ei1.INSTANCE.b());
        q09VarA.z(1.0f);
        q09VarA.y(w09.INSTANCE.b());
        e0 = q09VarA;
    }

    public d(LayoutNode layoutNode, androidx.compose.ui.node.c cVar) {
        super(layoutNode);
        this.layoutModifierNode = cVar;
        androidx.compose.ui.layout.b bVar = null;
        this.lookaheadDelegate = layoutNode.getLookaheadRoot() != null ? new b() : null;
        if ((cVar.getNode().getKindSet() & ni8.a(512)) != 0) {
            Intrinsics.h(cVar, "null cannot be cast to non-null type androidx.compose.ui.layout.ApproachLayoutModifierNode");
            bVar = new androidx.compose.ui.layout.b(this, (ApproachLayoutModifierNode) cVar);
        }
        this.approachMeasureScope = bVar;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0067  */
    private final void p4() {
        boolean z;
        if (getIsShallowPlacing()) {
            return;
        }
        F3();
        NodeCoordinator nodeCoordinatorO4 = o4();
        androidx.compose.ui.layout.b bVar = this.approachMeasureScope;
        if (bVar != null) {
            ApproachLayoutModifierNode approachLayoutModifierNodeR = bVar.getApproachNode();
            androidx.compose.ui.layout.o.a placementScope = getPlacementScope();
            i lookaheadDelegate = getLookaheadDelegate();
            Intrinsics.g(lookaheadDelegate);
            if (approachLayoutModifierNodeR.Q(placementScope, lookaheadDelegate.getLookaheadLayoutCoordinates()) || bVar.getApproachMeasureRequired()) {
                z = false;
            } else {
                long jA = a();
                i lookaheadDelegate2 = getLookaheadDelegate();
                if (q16.e(jA, lookaheadDelegate2 != null ? q16.b(lookaheadDelegate2.D2()) : null)) {
                    long jA2 = nodeCoordinatorO4.a();
                    i lookaheadDelegate3 = nodeCoordinatorO4.getLookaheadDelegate();
                    if (q16.e(jA2, lookaheadDelegate3 != null ? q16.b(lookaheadDelegate3.D2()) : null)) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else {
                    z = false;
                }
            }
            nodeCoordinatorO4.Q3(z);
        }
        nodeCoordinatorO4.g2(getIsPlacingForAlignment());
        z1().l();
        nodeCoordinatorO4.g2(false);
        nodeCoordinatorO4.Q3(false);
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    public void J3(w41 canvas, GraphicsLayer graphicsLayer) {
        NodeCoordinator wrapped;
        o4().P2(canvas, graphicsLayer);
        if (!fo6.b(getLayoutNode()).getShowLayoutBounds() || (wrapped = getWrapped()) == null) {
            return;
        }
        if (q16.f(a(), wrapped.a()) && g16.j(wrapped.getPosition(), g16.INSTANCE.b())) {
            return;
        }
        Q2(canvas, e0);
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    public void S2() {
        if (getLookaheadDelegate() == null) {
            s4(new b());
        }
    }

    @Override // com.google.inputmethod.f66
    public int W(int width) {
        androidx.compose.ui.layout.b bVar = this.approachMeasureScope;
        return bVar != null ? bVar.getApproachNode().B0(bVar, o4(), width) : this.layoutModifierNode.i(this, o4(), width);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    @Override // androidx.compose.ui.node.NodeCoordinator, androidx.compose.ui.layout.o
    public void W0(long position, float zIndex, GraphicsLayer layer) throws KotlinNothingValueException {
        super.W0(position, zIndex, layer);
        p4();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    @Override // androidx.compose.ui.node.NodeCoordinator, androidx.compose.ui.layout.o
    public void X0(long position, float zIndex, Function1<? super androidx.compose.ui.graphics.m, Unit> layerBlock) throws KotlinNothingValueException {
        super.X0(position, zIndex, layerBlock);
        p4();
    }

    @Override // com.google.inputmethod.f66
    public int d0(int width) {
        androidx.compose.ui.layout.b bVar = this.approachMeasureScope;
        return bVar != null ? bVar.getApproachNode().S0(bVar, o4(), width) : this.layoutModifierNode.m(this, o4(), width);
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    /* JADX INFO: renamed from: f3, reason: from getter */
    public i getLookaheadDelegate() {
        return this.lookaheadDelegate;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public int h1(uc alignmentLine) {
        i lookaheadDelegate = getLookaheadDelegate();
        return lookaheadDelegate != null ? lookaheadDelegate.p2(alignmentLine) : ao6.b(this, alignmentLine);
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    public androidx.compose.ui.b.c j3() {
        return this.layoutModifierNode.getNode();
    }

    /* JADX INFO: renamed from: m4, reason: from getter */
    public final androidx.compose.ui.node.c getLayoutModifierNode() {
        return this.layoutModifierNode;
    }

    /* JADX INFO: renamed from: n4, reason: from getter */
    public final kx1 getLookaheadConstraints() {
        return this.lookaheadConstraints;
    }

    @Override // com.google.inputmethod.f66
    public int o0(int height) {
        androidx.compose.ui.layout.b bVar = this.approachMeasureScope;
        return bVar != null ? bVar.getApproachNode().D0(bVar, o4(), height) : this.layoutModifierNode.z(this, o4(), height);
    }

    public final NodeCoordinator o4() {
        NodeCoordinator wrapped = getWrapped();
        Intrinsics.g(wrapped);
        return wrapped;
    }

    @Override // com.google.inputmethod.f66
    public int q0(int height) {
        androidx.compose.ui.layout.b bVar = this.approachMeasureScope;
        return bVar != null ? bVar.getApproachNode().I1(bVar, o4(), height) : this.layoutModifierNode.t(this, o4(), height);
    }

    public final void q4(androidx.compose.ui.node.c cVar) {
        if (!Intrinsics.e(cVar, this.layoutModifierNode)) {
            androidx.compose.ui.b.c node = cVar.getNode();
            if ((node.getKindSet() & ni8.a(512)) != 0) {
                Intrinsics.h(cVar, "null cannot be cast to non-null type androidx.compose.ui.layout.ApproachLayoutModifierNode");
                ApproachLayoutModifierNode approachLayoutModifierNode = (ApproachLayoutModifierNode) cVar;
                androidx.compose.ui.layout.b bVar = this.approachMeasureScope;
                if (bVar != null) {
                    bVar.z(approachLayoutModifierNode);
                } else {
                    bVar = new androidx.compose.ui.layout.b(this, approachLayoutModifierNode);
                }
                this.approachMeasureScope = bVar;
            } else {
                this.approachMeasureScope = null;
            }
        }
        this.layoutModifierNode = cVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX WARN: Code duplicated, block: B:26:0x0080  */
    @Override // com.google.inputmethod.dj7
    public androidx.compose.ui.layout.o r0(long constraints) throws KotlinNothingValueException {
        fj7 fj7VarB;
        boolean z;
        if (getForceMeasureWithLookaheadConstraints()) {
            kx1 kx1Var = this.lookaheadConstraints;
            if (kx1Var == null) {
                throw new IllegalArgumentException("Lookahead constraints cannot be null in approach pass.");
            }
            constraints = kx1Var.getValue();
        }
        Z0(constraints);
        androidx.compose.ui.layout.b bVar = this.approachMeasureScope;
        if (bVar != null) {
            ApproachLayoutModifierNode approachLayoutModifierNodeR = bVar.getApproachNode();
            bVar.w(approachLayoutModifierNodeR.Y1(bVar.s0()) || !kx1.e(constraints, getLookaheadConstraints()));
            if (!bVar.getApproachMeasureRequired()) {
                o4().P3(true);
            }
            fj7VarB = approachLayoutModifierNodeR.d2(bVar, o4(), constraints);
            o4().P3(false);
            int width = fj7VarB.getWidth();
            i lookaheadDelegate = getLookaheadDelegate();
            Intrinsics.g(lookaheadDelegate);
            if (width == lookaheadDelegate.getWidth()) {
                int height = fj7VarB.getHeight();
                i lookaheadDelegate2 = getLookaheadDelegate();
                Intrinsics.g(lookaheadDelegate2);
                z = height == lookaheadDelegate2.getHeight();
            }
            if (!bVar.getApproachMeasureRequired()) {
                long jA = o4().a();
                i lookaheadDelegate3 = o4().getLookaheadDelegate();
                if (q16.e(jA, lookaheadDelegate3 != null ? q16.b(lookaheadDelegate3.D2()) : null) && !z) {
                    fj7VarB = new c(fj7VarB, this);
                }
            }
        } else {
            fj7VarB = getLayoutModifierNode().b(this, o4(), constraints);
        }
        T3(fj7VarB);
        E3();
        return this;
    }

    public final void r4(kx1 kx1Var) {
        this.lookaheadConstraints = kx1Var;
    }

    protected void s4(i iVar) {
        this.lookaheadDelegate = iVar;
    }
}
