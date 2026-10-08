package androidx.compose.ui.node;

import com.google.inputmethod.go6;
import com.google.inputmethod.kx1;
import com.google.inputmethod.wc;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\n\u0010\bJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u000b\u0010\bJ\r\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\bJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0011\u0010\bJ\r\u0010\u0012\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\bJ\r\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\bJ\r\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\bJ\r\u0010\u0015\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\bJ\r\u0010\u0016\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\"\u0010 \u001a\u00020\u001a8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0012\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010$\u001a\u00020\u001a8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b!\u0010\u0012\u001a\u0004\b\"\u0010\u001d\"\u0004\b#\u0010\u001fR\"\u0010,\u001a\u00020%8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\"\u00100\u001a\u00020\u001a8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b-\u0010\u0012\u001a\u0004\b.\u0010\u001d\"\u0004\b/\u0010\u001fR\"\u00104\u001a\u00020\u001a8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b1\u0010\u0012\u001a\u0004\b2\u0010\u001d\"\u0004\b3\u0010\u001fR\"\u00107\u001a\u00020\u001a8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0012\u001a\u0004\b5\u0010\u001d\"\u0004\b6\u0010\u001fR\"\u0010=\u001a\u0002088\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u0016\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\"\u0010A\u001a\u0002088\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b>\u0010\u0016\u001a\u0004\b?\u0010:\"\u0004\b@\u0010<R*\u0010E\u001a\u00020\u001a2\u0006\u0010B\u001a\u00020\u001a8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bC\u0010\u0012\u001a\u0004\b1\u0010\u001d\"\u0004\bD\u0010\u001fR*\u0010H\u001a\u00020\u001a2\u0006\u0010B\u001a\u00020\u001a8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bF\u0010\u0012\u001a\u0004\b-\u0010\u001d\"\u0004\bG\u0010\u001fR*\u0010J\u001a\u0002082\u0006\u0010B\u001a\u0002088\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b!\u0010:\"\u0004\bI\u0010<R*\u0010N\u001a\u00020\u001a2\u0006\u0010B\u001a\u00020\u001a8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bK\u0010\u0012\u001a\u0004\bL\u0010\u001d\"\u0004\bM\u0010\u001fR*\u0010Q\u001a\u00020\u001a2\u0006\u0010B\u001a\u00020\u001a8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010\u0012\u001a\u0004\bO\u0010\u001d\"\u0004\bP\u0010\u001fR*\u0010T\u001a\u0002082\u0006\u0010B\u001a\u0002088\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bR\u0010\u0016\u001a\u0004\b&\u0010:\"\u0004\bS\u0010<R\u001a\u0010Y\u001a\u00020U8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bO\u0010V\u001a\u0004\bW\u0010XR(\u0010^\u001a\u0004\u0018\u00010Z2\b\u0010B\u001a\u0004\u0018\u00010Z8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bL\u0010[\u001a\u0004\b\\\u0010]R\u0011\u0010b\u001a\u00020_8F¢\u0006\u0006\u001a\u0004\b`\u0010aR\u0013\u0010d\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\bC\u0010cR\u0013\u0010e\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\bF\u0010cR\u0014\u0010f\u001a\u0002088@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b>\u0010:R\u0014\u0010h\u001a\u0002088@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bg\u0010:R\u0014\u0010j\u001a\u00020\u001a8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bi\u0010\u001dR\u0014\u0010k\u001a\u00020\u001a8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bK\u0010\u001dR\u0014\u0010n\u001a\u00020l8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010mR\u0016\u0010o\u001a\u0004\u0018\u00010l8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bR\u0010m¨\u0006p"}, d2 = {"Landroidx/compose/ui/node/f;", "", "Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "<init>", "(Landroidx/compose/ui/node/LayoutNode;)V", "", "D", "()V", "G", "E", "F", "H", "Lcom/google/android/kx1;", "constraints", "J", "(J)V", "a", "Z", "B", "K", "C", "I", "Landroidx/compose/ui/node/LayoutNode;", "l", "()Landroidx/compose/ui/node/LayoutNode;", "", "b", "g", "()Z", "P", "(Z)V", "detachedFromParentLookaheadPass", "c", "h", "Q", "detachedFromParentLookaheadPlacement", "Landroidx/compose/ui/node/LayoutNode$LayoutState;", "d", "Landroidx/compose/ui/node/LayoutNode$LayoutState;", "n", "()Landroidx/compose/ui/node/LayoutNode$LayoutState;", "R", "(Landroidx/compose/ui/node/LayoutNode$LayoutState;)V", "layoutState", "e", "t", "W", "lookaheadMeasurePending", "f", "r", "U", "lookaheadLayoutPending", "s", "V", "lookaheadLayoutPendingForAlignment", "", "x", "()I", "X", "(I)V", "nextChildLookaheadPlaceOrder", "i", "y", "Y", "nextChildPlaceOrder", "value", "j", "O", "coordinatesAccessedDuringPlacement", "k", "N", "coordinatesAccessedDuringModifierPlacement", "L", "childrenAccessingCoordinatesDuringPlacement", "m", "q", "T", "lookaheadCoordinatesAccessedDuringPlacement", "p", "S", "lookaheadCoordinatesAccessedDuringModifierPlacement", "o", "M", "childrenAccessingLookaheadCoordinatesDuringPlacement", "Landroidx/compose/ui/node/MeasurePassDelegate;", "Landroidx/compose/ui/node/MeasurePassDelegate;", "v", "()Landroidx/compose/ui/node/MeasurePassDelegate;", "measurePassDelegate", "Landroidx/compose/ui/node/LookaheadPassDelegate;", "Landroidx/compose/ui/node/LookaheadPassDelegate;", "u", "()Landroidx/compose/ui/node/LookaheadPassDelegate;", "lookaheadPassDelegate", "Landroidx/compose/ui/node/NodeCoordinator;", "z", "()Landroidx/compose/ui/node/NodeCoordinator;", "outerCoordinator", "()Lcom/google/android/kx1;", "lastConstraints", "lastLookaheadConstraints", "height", "A", "width", "w", "measurePending", "layoutPending", "Lcom/google/android/wc;", "()Lcom/google/android/wc;", "alignmentLinesOwner", "lookaheadAlignmentLinesOwner", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final LayoutNode layoutNode;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private boolean detachedFromParentLookaheadPass;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private boolean detachedFromParentLookaheadPlacement;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private boolean lookaheadMeasurePending;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private boolean lookaheadLayoutPending;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private boolean lookaheadLayoutPendingForAlignment;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private int nextChildLookaheadPlaceOrder;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private int nextChildPlaceOrder;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private boolean coordinatesAccessedDuringPlacement;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private boolean coordinatesAccessedDuringModifierPlacement;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private int childrenAccessingCoordinatesDuringPlacement;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private boolean lookaheadCoordinatesAccessedDuringPlacement;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private boolean lookaheadCoordinatesAccessedDuringModifierPlacement;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private int childrenAccessingLookaheadCoordinatesDuringPlacement;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private LookaheadPassDelegate lookaheadPassDelegate;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private LayoutNode.LayoutState layoutState = LayoutNode.LayoutState.Idle;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private final MeasurePassDelegate measurePassDelegate = new MeasurePassDelegate(this);

    public f(LayoutNode layoutNode) {
        this.layoutNode = layoutNode;
    }

    public final int A() {
        return this.measurePassDelegate.getWidth();
    }

    public final void B() {
        this.measurePassDelegate.b2();
        LookaheadPassDelegate lookaheadPassDelegate = this.lookaheadPassDelegate;
        if (lookaheadPassDelegate != null) {
            lookaheadPassDelegate.Y1();
        }
    }

    public final void C() {
        this.measurePassDelegate.I2(true);
        LookaheadPassDelegate lookaheadPassDelegate = this.lookaheadPassDelegate;
        if (lookaheadPassDelegate != null) {
            lookaheadPassDelegate.F2(true);
        }
    }

    public final void D() {
        this.measurePassDelegate.i2();
    }

    public final void E() {
        this.lookaheadLayoutPending = true;
        this.lookaheadLayoutPendingForAlignment = true;
    }

    public final void F() {
        this.lookaheadMeasurePending = true;
    }

    public final void G() {
        this.measurePassDelegate.l2();
    }

    public final void H() {
        LayoutNode.LayoutState layoutStateI0 = this.layoutNode.i0();
        if (layoutStateI0 == LayoutNode.LayoutState.LayingOut || layoutStateI0 == LayoutNode.LayoutState.LookaheadLayingOut) {
            if (this.measurePassDelegate.getLayingOutChildren()) {
                O(true);
            } else {
                N(true);
            }
        }
        if (layoutStateI0 == LayoutNode.LayoutState.LookaheadLayingOut) {
            LookaheadPassDelegate lookaheadPassDelegate = this.lookaheadPassDelegate;
            if (lookaheadPassDelegate == null || !lookaheadPassDelegate.getLayingOutChildren()) {
                S(true);
            } else {
                T(true);
            }
        }
    }

    public final void I() {
        this.lookaheadPassDelegate = null;
        this.lookaheadLayoutPending = false;
        this.lookaheadMeasurePending = false;
    }

    public final void J(long constraints) {
        LookaheadPassDelegate lookaheadPassDelegate = this.lookaheadPassDelegate;
        if (lookaheadPassDelegate != null) {
            lookaheadPassDelegate.v2(constraints);
        }
    }

    public final void K() {
        AlignmentLines alignmentLinesJ;
        this.measurePassDelegate.getAlignmentLines().p();
        LookaheadPassDelegate lookaheadPassDelegate = this.lookaheadPassDelegate;
        if (lookaheadPassDelegate == null || (alignmentLinesJ = lookaheadPassDelegate.getAlignmentLines()) == null) {
            return;
        }
        alignmentLinesJ.p();
    }

    public final void L(int i) {
        int i2 = this.childrenAccessingCoordinatesDuringPlacement;
        this.childrenAccessingCoordinatesDuringPlacement = i;
        if ((i2 == 0) != (i == 0)) {
            LayoutNode layoutNodeC0 = this.layoutNode.C0();
            f layoutDelegate = layoutNodeC0 != null ? layoutNodeC0.getLayoutDelegate() : null;
            if (layoutDelegate != null) {
                if (i == 0) {
                    layoutDelegate.L(layoutDelegate.childrenAccessingCoordinatesDuringPlacement - 1);
                } else {
                    layoutDelegate.L(layoutDelegate.childrenAccessingCoordinatesDuringPlacement + 1);
                }
            }
        }
    }

    public final void M(int i) {
        int i2 = this.childrenAccessingLookaheadCoordinatesDuringPlacement;
        this.childrenAccessingLookaheadCoordinatesDuringPlacement = i;
        if ((i2 == 0) != (i == 0)) {
            LayoutNode layoutNodeC0 = this.layoutNode.C0();
            f layoutDelegate = layoutNodeC0 != null ? layoutNodeC0.getLayoutDelegate() : null;
            if (layoutDelegate != null) {
                if (i == 0) {
                    layoutDelegate.M(layoutDelegate.childrenAccessingLookaheadCoordinatesDuringPlacement - 1);
                } else {
                    layoutDelegate.M(layoutDelegate.childrenAccessingLookaheadCoordinatesDuringPlacement + 1);
                }
            }
        }
    }

    public final void N(boolean z) {
        if (this.coordinatesAccessedDuringModifierPlacement != z) {
            this.coordinatesAccessedDuringModifierPlacement = z;
            if (z && !this.coordinatesAccessedDuringPlacement) {
                L(this.childrenAccessingCoordinatesDuringPlacement + 1);
            } else {
                if (z || this.coordinatesAccessedDuringPlacement) {
                    return;
                }
                L(this.childrenAccessingCoordinatesDuringPlacement - 1);
            }
        }
    }

    public final void O(boolean z) {
        if (this.coordinatesAccessedDuringPlacement != z) {
            this.coordinatesAccessedDuringPlacement = z;
            if (z && !this.coordinatesAccessedDuringModifierPlacement) {
                L(this.childrenAccessingCoordinatesDuringPlacement + 1);
            } else {
                if (z || this.coordinatesAccessedDuringModifierPlacement) {
                    return;
                }
                L(this.childrenAccessingCoordinatesDuringPlacement - 1);
            }
        }
    }

    public final void P(boolean z) {
        this.detachedFromParentLookaheadPass = z;
    }

    public final void Q(boolean z) {
        this.detachedFromParentLookaheadPlacement = z;
    }

    public final void R(LayoutNode.LayoutState layoutState) {
        this.layoutState = layoutState;
    }

    public final void S(boolean z) {
        if (this.lookaheadCoordinatesAccessedDuringModifierPlacement != z) {
            this.lookaheadCoordinatesAccessedDuringModifierPlacement = z;
            if (z && !this.lookaheadCoordinatesAccessedDuringPlacement) {
                M(this.childrenAccessingLookaheadCoordinatesDuringPlacement + 1);
            } else {
                if (z || this.lookaheadCoordinatesAccessedDuringPlacement) {
                    return;
                }
                M(this.childrenAccessingLookaheadCoordinatesDuringPlacement - 1);
            }
        }
    }

    public final void T(boolean z) {
        if (this.lookaheadCoordinatesAccessedDuringPlacement != z) {
            this.lookaheadCoordinatesAccessedDuringPlacement = z;
            if (z && !this.lookaheadCoordinatesAccessedDuringModifierPlacement) {
                M(this.childrenAccessingLookaheadCoordinatesDuringPlacement + 1);
            } else {
                if (z || this.lookaheadCoordinatesAccessedDuringModifierPlacement) {
                    return;
                }
                M(this.childrenAccessingLookaheadCoordinatesDuringPlacement - 1);
            }
        }
    }

    public final void U(boolean z) {
        this.lookaheadLayoutPending = z;
    }

    public final void V(boolean z) {
        this.lookaheadLayoutPendingForAlignment = z;
    }

    public final void W(boolean z) {
        this.lookaheadMeasurePending = z;
    }

    public final void X(int i) {
        this.nextChildLookaheadPlaceOrder = i;
    }

    public final void Y(int i) {
        this.nextChildPlaceOrder = i;
    }

    public final void Z() {
        LayoutNode layoutNodeC0;
        if (this.measurePassDelegate.O2() && (layoutNodeC0 = this.layoutNode.C0()) != null) {
            LayoutNode.K1(layoutNodeC0, false, false, false, 7, null);
        }
        LookaheadPassDelegate lookaheadPassDelegate = this.lookaheadPassDelegate;
        if (lookaheadPassDelegate == null || !lookaheadPassDelegate.P2()) {
            return;
        }
        if (go6.a(this.layoutNode)) {
            LayoutNode layoutNodeC1 = this.layoutNode.C0();
            if (layoutNodeC1 != null) {
                LayoutNode.K1(layoutNodeC1, false, false, false, 7, null);
                return;
            }
            return;
        }
        LayoutNode layoutNodeC2 = this.layoutNode.C0();
        if (layoutNodeC2 != null) {
            LayoutNode.G1(layoutNodeC2, false, false, false, 7, null);
        }
    }

    public final void a() {
        if (this.lookaheadPassDelegate == null) {
            this.lookaheadPassDelegate = new LookaheadPassDelegate(this);
        }
    }

    public final wc b() {
        return this.measurePassDelegate;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getChildrenAccessingCoordinatesDuringPlacement() {
        return this.childrenAccessingCoordinatesDuringPlacement;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getChildrenAccessingLookaheadCoordinatesDuringPlacement() {
        return this.childrenAccessingLookaheadCoordinatesDuringPlacement;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getCoordinatesAccessedDuringModifierPlacement() {
        return this.coordinatesAccessedDuringModifierPlacement;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getCoordinatesAccessedDuringPlacement() {
        return this.coordinatesAccessedDuringPlacement;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getDetachedFromParentLookaheadPass() {
        return this.detachedFromParentLookaheadPass;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getDetachedFromParentLookaheadPlacement() {
        return this.detachedFromParentLookaheadPlacement;
    }

    public final int i() {
        return this.measurePassDelegate.getHeight();
    }

    public final kx1 j() {
        return this.measurePassDelegate.z1();
    }

    public final kx1 k() {
        LookaheadPassDelegate lookaheadPassDelegate = this.lookaheadPassDelegate;
        if (lookaheadPassDelegate != null) {
            return lookaheadPassDelegate.getLookaheadConstraints();
        }
        return null;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final LayoutNode getLayoutNode() {
        return this.layoutNode;
    }

    public final boolean m() {
        return this.measurePassDelegate.getLayoutPending();
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final LayoutNode.LayoutState getLayoutState() {
        return this.layoutState;
    }

    public final wc o() {
        return this.lookaheadPassDelegate;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final boolean getLookaheadCoordinatesAccessedDuringModifierPlacement() {
        return this.lookaheadCoordinatesAccessedDuringModifierPlacement;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final boolean getLookaheadCoordinatesAccessedDuringPlacement() {
        return this.lookaheadCoordinatesAccessedDuringPlacement;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final boolean getLookaheadLayoutPending() {
        return this.lookaheadLayoutPending;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final boolean getLookaheadLayoutPendingForAlignment() {
        return this.lookaheadLayoutPendingForAlignment;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final boolean getLookaheadMeasurePending() {
        return this.lookaheadMeasurePending;
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final LookaheadPassDelegate getLookaheadPassDelegate() {
        return this.lookaheadPassDelegate;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final MeasurePassDelegate getMeasurePassDelegate() {
        return this.measurePassDelegate;
    }

    public final boolean w() {
        return this.measurePassDelegate.getMeasurePending();
    }

    /* JADX INFO: renamed from: x, reason: from getter */
    public final int getNextChildLookaheadPlaceOrder() {
        return this.nextChildLookaheadPlaceOrder;
    }

    /* JADX INFO: renamed from: y, reason: from getter */
    public final int getNextChildPlaceOrder() {
        return this.nextChildPlaceOrder;
    }

    public final NodeCoordinator z() {
        return this.layoutNode.getNodes().getOuterCoordinator();
    }
}
