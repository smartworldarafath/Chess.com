package androidx.compose.ui.node;

import androidx.compose.ui.unit.LayoutDirection;
import com.google.inputmethod.d58;
import com.google.inputmethod.dj7;
import com.google.inputmethod.fj7;
import com.google.inputmethod.g16;
import com.google.inputmethod.kn6;
import com.google.inputmethod.q16;
import com.google.inputmethod.t04;
import com.google.inputmethod.ua7;
import com.google.inputmethod.uc;
import com.google.inputmethod.wc;
import com.google.inputmethod.xl8;
import com.google.inputmethod.zw5;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0004\b!\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\tH\u0010¢\u0006\u0004\b\u0011\u0010\u0012J5\u0010\u0018\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00132\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\t\u0018\u00010\u0015H\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u001a\u0010\u000bJ\u000f\u0010\u001b\u001a\u00020\tH\u0014¢\u0006\u0004\b\u001b\u0010\u0012J\u0017\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001f\u0010\u001eJ\u0017\u0010!\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u000eH\u0016¢\u0006\u0004\b!\u0010\u001eJ\u0017\u0010\"\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u000eH\u0016¢\u0006\u0004\b\"\u0010\u001eJ\u001f\u0010&\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\u00002\u0006\u0010%\u001a\u00020$H\u0000¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\"\u0010\b\u001a\u00020\u00078\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u0010\u000bR$\u00104\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000e\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0017\u0010:\u001a\u0002058\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R(\u0010A\u001a\u0004\u0018\u00010;2\b\u0010<\u001a\u0004\u0018\u00010;8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b=\u0010>\"\u0004\b?\u0010@R \u0010G\u001a\b\u0012\u0004\u0012\u00020\f0B8\u0004X\u0084\u0004¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u0016\u0010J\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bH\u0010IR\u0014\u0010M\u001a\u00020$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bK\u0010LR\u0014\u0010P\u001a\u00020;8PX\u0090\u0004¢\u0006\u0006\u001a\u0004\bN\u0010OR\u0014\u0010R\u001a\u00020$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010LR\u0014\u0010V\u001a\u00020S8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bT\u0010UR\u0014\u0010Y\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bW\u0010XR\u0014\u0010[\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bZ\u0010XR\u0016\u0010]\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\\\u0010IR\u0014\u0010a\u001a\u00020^8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b_\u0010`R\u0014\u0010d\u001a\u00020b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bC\u0010cR\u0014\u0010g\u001a\u00020e8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bf\u0010/R\u0014\u0010j\u001a\u00020h8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bi\u0010/R\u0014\u0010n\u001a\u00020k8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bl\u0010mR\u0016\u0010r\u001a\u0004\u0018\u00010o8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bp\u0010q¨\u0006s"}, d2 = {"Landroidx/compose/ui/node/i;", "Lcom/google/android/dj7;", "Landroidx/compose/ui/node/LookaheadCapablePlaceable;", "Landroidx/compose/ui/node/NodeCoordinator;", "coordinator", "<init>", "(Landroidx/compose/ui/node/NodeCoordinator;)V", "Lcom/google/android/g16;", "position", "", "F2", "(J)V", "Lcom/google/android/uc;", "alignmentLine", "", "p2", "(Lcom/google/android/uc;)I", "d2", "()V", "", "zIndex", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/m;", "layerBlock", "X0", "(JFLkotlin/jvm/functions/Function1;)V", "H2", "E2", "height", "o0", "(I)I", "q0", "width", "d0", "W", "ancestor", "", "excludingAgnosticOffset", "I2", "(Landroidx/compose/ui/node/i;Z)J", "q", "Landroidx/compose/ui/node/NodeCoordinator;", "v2", "()Landroidx/compose/ui/node/NodeCoordinator;", "r", "J", "F1", "()J", "J2", "", "s", "Ljava/util/Map;", "oldAlignmentLines", "Lcom/google/android/ua7;", "t", "Lcom/google/android/ua7;", "z2", "()Lcom/google/android/ua7;", "lookaheadLayoutCoordinates", "Lcom/google/android/fj7;", "result", "u", "Lcom/google/android/fj7;", "K2", "(Lcom/google/android/fj7;)V", "_measureResult", "Lcom/google/android/d58;", "v", "Lcom/google/android/d58;", "q2", "()Lcom/google/android/d58;", "cachedAlignmentLinesMap", "x1", "()Landroidx/compose/ui/node/LookaheadCapablePlaceable;", "child", "y1", "()Z", "hasMeasureResult", "z1", "()Lcom/google/android/fj7;", "measureResult", "G1", "isLookingAhead", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "getDensity", "()F", "density", "w2", "fontScale", "B1", "parent", "Landroidx/compose/ui/node/LayoutNode;", "a1", "()Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "Lcom/google/android/kn6;", "()Lcom/google/android/kn6;", "coordinates", "Lcom/google/android/q16;", "D2", "size", "Lcom/google/android/kx1;", "s2", "constraints", "Lcom/google/android/wc;", "n2", "()Lcom/google/android/wc;", "alignmentLinesOwner", "", "f", "()Ljava/lang/Object;", "parentData", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class i extends LookaheadCapablePlaceable implements dj7 {

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private final NodeCoordinator coordinator;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private Map<uc, Integer> oldAlignmentLines;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private fj7 _measureResult;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private long position = g16.INSTANCE.b();

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private final ua7 lookaheadLayoutCoordinates = new ua7(this);

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private final d58<uc> cachedAlignmentLinesMap = xl8.b();

    public i(NodeCoordinator nodeCoordinator) {
        this.coordinator = nodeCoordinator;
    }

    private final void F2(long position) {
        if (!g16.j(getPosition(), position)) {
            J2(position);
            LookaheadPassDelegate lookaheadPassDelegate = getLayoutNode().getLayoutDelegate().getLookaheadPassDelegate();
            if (lookaheadPassDelegate != null) {
                lookaheadPassDelegate.i2();
            }
            M1(this.coordinator);
        }
        if (getIsPlacingForAlignment()) {
            return;
        }
        r1(z1());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K2(fj7 fj7Var) {
        Map<uc, Integer> map;
        if (fj7Var != null) {
            Y0(q16.c((((long) fj7Var.getHeight()) & 4294967295L) | (((long) fj7Var.getWidth()) << 32)));
        } else {
            Y0(q16.INSTANCE.a());
        }
        if (!Intrinsics.e(this._measureResult, fj7Var) && fj7Var != null && ((((map = this.oldAlignmentLines) != null && !map.isEmpty()) || !fj7Var.j().isEmpty()) && !Intrinsics.e(fj7Var.j(), this.oldAlignmentLines))) {
            n2().getAlignmentLines().m();
            Map linkedHashMap = this.oldAlignmentLines;
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap();
                this.oldAlignmentLines = linkedHashMap;
            }
            linkedHashMap.clear();
            linkedHashMap.putAll(fj7Var.j());
        }
        this._measureResult = fj7Var;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public LookaheadCapablePlaceable B1() {
        NodeCoordinator wrappedBy = this.coordinator.getWrappedBy();
        if (wrappedBy != null) {
            return wrappedBy.getLookaheadDelegate();
        }
        return null;
    }

    public final long D2() {
        return q16.c((((long) getHeight()) & 4294967295L) | (((long) getWidth()) << 32));
    }

    protected void E2() {
        z1().l();
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    /* JADX INFO: renamed from: F1, reason: from getter */
    public long getPosition() {
        return this.position;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable, com.google.inputmethod.h66
    public boolean G1() {
        return true;
    }

    public final void H2(long position) {
        F2(g16.o(position, getApparentToRealOffset()));
    }

    public final long I2(i ancestor, boolean excludingAgnosticOffset) {
        long jB = g16.INSTANCE.b();
        i lookaheadDelegate = this;
        while (!Intrinsics.e(lookaheadDelegate, ancestor)) {
            if (!lookaheadDelegate.getIsPlacedUnderMotionFrameOfReference() || !excludingAgnosticOffset) {
                jB = g16.o(jB, lookaheadDelegate.getPosition());
            }
            NodeCoordinator wrappedBy = lookaheadDelegate.coordinator.getWrappedBy();
            Intrinsics.g(wrappedBy);
            lookaheadDelegate = wrappedBy.getLookaheadDelegate();
            Intrinsics.g(lookaheadDelegate);
        }
        return jB;
    }

    public void J2(long j) {
        this.position = j;
    }

    public abstract int W(int width);

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.compose.ui.layout.o
    public final void X0(long position, float zIndex, Function1<? super androidx.compose.ui.graphics.m, Unit> layerBlock) {
        F2(position);
        if (getIsShallowPlacing()) {
            return;
        }
        E2();
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable, com.google.inputmethod.gj7
    /* JADX INFO: renamed from: a1 */
    public LayoutNode getLayoutNode() {
        return this.coordinator.getLayoutNode();
    }

    public abstract int d0(int width);

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public void d2() {
        X0(getPosition(), 0.0f, null);
    }

    @Override // com.google.inputmethod.ij7, com.google.inputmethod.f66
    /* JADX INFO: renamed from: f */
    public Object getParentData() {
        return this.coordinator.getParentData();
    }

    @Override // com.google.inputmethod.f43
    public float getDensity() {
        return this.coordinator.getDensity();
    }

    @Override // com.google.inputmethod.h66
    public LayoutDirection getLayoutDirection() {
        return this.coordinator.getLayoutDirection();
    }

    public wc n2() {
        wc wcVarO = this.coordinator.getLayoutNode().getLayoutDelegate().o();
        Intrinsics.g(wcVarO);
        return wcVarO;
    }

    public abstract int o0(int height);

    public final int p2(uc alignmentLine) {
        return this.cachedAlignmentLinesMap.e(alignmentLine, t04.INVALID_ID);
    }

    public abstract int q0(int height);

    protected final d58<uc> q2() {
        return this.cachedAlignmentLinesMap;
    }

    public final long s2() {
        return getMeasurementConstraints();
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public kn6 v() {
        return this.lookaheadLayoutCoordinates;
    }

    /* JADX INFO: renamed from: v2, reason: from getter */
    public final NodeCoordinator getCoordinator() {
        return this.coordinator;
    }

    @Override // com.google.inputmethod.hm4
    /* JADX INFO: renamed from: w2 */
    public float getFontScale() {
        return this.coordinator.getFontScale();
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public LookaheadCapablePlaceable x1() {
        NodeCoordinator wrapped = this.coordinator.getWrapped();
        if (wrapped != null) {
            return wrapped.getLookaheadDelegate();
        }
        return null;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public boolean y1() {
        return this._measureResult != null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public fj7 z1() throws KotlinNothingValueException {
        fj7 fj7Var = this._measureResult;
        if (fj7Var != null) {
            return fj7Var;
        }
        zw5.d("LookaheadDelegate has not been measured yet when measureResult is requested.");
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: renamed from: z2, reason: from getter */
    public final ua7 getLookaheadLayoutCoordinates() {
        return this.lookaheadLayoutCoordinates;
    }
}
