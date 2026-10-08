package androidx.compose.ui.layout;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.inputmethod.fj7;
import com.google.inputmethod.gz;
import com.google.inputmethod.kn6;
import com.google.inputmethod.mra;
import com.google.inputmethod.q16;
import com.google.inputmethod.ua7;
import com.google.inputmethod.uc;
import com.google.inputmethod.wa7;
import com.google.inputmethod.zw5;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\u000b\u001a\u00020\n*\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ]\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\r0\u00102\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00132\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00150\u0013H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0014\u0010\u001e\u001a\u00020\u001d*\u00020\u001cH\u0097\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0014\u0010!\u001a\u00020\u001d*\u00020 H\u0097\u0001¢\u0006\u0004\b!\u0010\"J\u0014\u0010#\u001a\u00020\r*\u00020\u001cH\u0097\u0001¢\u0006\u0004\b#\u0010$J\u0014\u0010%\u001a\u00020\r*\u00020 H\u0097\u0001¢\u0006\u0004\b%\u0010&J\u0014\u0010'\u001a\u00020\u001c*\u00020\rH\u0097\u0001¢\u0006\u0004\b'\u0010(J\u0014\u0010)\u001a\u00020\u001c*\u00020\u001dH\u0097\u0001¢\u0006\u0004\b)\u0010\u001fJ\u0014\u0010*\u001a\u00020\u001c*\u00020 H\u0097\u0001¢\u0006\u0004\b*\u0010\"J\u0014\u0010+\u001a\u00020 *\u00020\rH\u0097\u0001¢\u0006\u0004\b+\u0010,J\u0014\u0010-\u001a\u00020 *\u00020\u001dH\u0097\u0001¢\u0006\u0004\b-\u0010.J\u0014\u0010/\u001a\u00020 *\u00020\u001cH\u0097\u0001¢\u0006\u0004\b/\u0010.J\u0014\u00102\u001a\u000201*\u000200H\u0097\u0001¢\u0006\u0004\b2\u00103J\u0014\u00104\u001a\u000200*\u000201H\u0097\u0001¢\u0006\u0004\b4\u00103JH\u00105\u001a\u00020\u00192\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\r0\u00102\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00150\u0013H\u0096\u0001¢\u0006\u0004\b5\u00106R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\"\u0010H\u001a\u00020A8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\u0014\u0010L\u001a\u00020I8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010KR\u0018\u0010N\u001a\u00020\n*\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b;\u0010MR\u0014\u0010P\u001a\u00020A8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bO\u0010ER\u0014\u0010T\u001a\u00020Q8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bR\u0010SR\u0014\u0010W\u001a\u00020\u001d8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\bU\u0010VR\u0014\u0010Y\u001a\u00020\u001d8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\bX\u0010V¨\u0006Z"}, d2 = {"Landroidx/compose/ui/layout/b;", "Lcom/google/android/gz;", "Landroidx/compose/ui/layout/j;", "Lcom/google/android/wa7;", "Landroidx/compose/ui/node/d;", "coordinator", "Landroidx/compose/ui/layout/ApproachLayoutModifierNode;", "approachNode", "<init>", "(Landroidx/compose/ui/node/d;Landroidx/compose/ui/layout/ApproachLayoutModifierNode;)V", "Lcom/google/android/kn6;", "f", "(Lcom/google/android/kn6;)Lcom/google/android/kn6;", "", "width", "height", "", "Lcom/google/android/uc;", "alignmentLines", "Lkotlin/Function1;", "Lcom/google/android/mra;", "", "rulers", "Landroidx/compose/ui/layout/o$a;", "placementBlock", "Lcom/google/android/fj7;", "B2", "(IILjava/util/Map;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lcom/google/android/fj7;", "Lcom/google/android/ff3;", "", "x2", "(F)F", "Lcom/google/android/b0d;", "T1", "(J)F", "O1", "(F)I", "A2", "(J)I", "O0", "(I)F", "P0", "U", "X", "(I)J", "Y", "(F)J", "s1", "Lcom/google/android/jf3;", "Lcom/google/android/tsb;", "b1", "(J)J", "S", "h2", "(IILjava/util/Map;Lkotlin/jvm/functions/Function1;)Lcom/google/android/fj7;", "a", "Landroidx/compose/ui/node/d;", "t", "()Landroidx/compose/ui/node/d;", "b", "Landroidx/compose/ui/layout/ApproachLayoutModifierNode;", "r", "()Landroidx/compose/ui/layout/ApproachLayoutModifierNode;", "z", "(Landroidx/compose/ui/layout/ApproachLayoutModifierNode;)V", "", "c", "Z", "m", "()Z", "w", "(Z)V", "approachMeasureRequired", "Lcom/google/android/q16;", "s0", "()J", "lookaheadSize", "(Landroidx/compose/ui/layout/o$a;)Lcom/google/android/kn6;", "lookaheadScopeCoordinates", "G1", "isLookingAhead", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "getDensity", "()F", "density", "w2", "fontScale", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b implements gz, j, wa7 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final androidx.compose.ui.node.d coordinator;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private ApproachLayoutModifierNode approachNode;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private boolean approachMeasureRequired;

    @Metadata(d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\r\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\tR,\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00050\u000e8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u0012\u0004\b\u0014\u0010\u0004\u001a\u0004\b\u0012\u0010\u0013R(\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"androidx/compose/ui/layout/b$a", "Lcom/google/android/fj7;", "", "l", "()V", "", "a", "I", "getWidth", "()I", "width", "b", "getHeight", "height", "", "Lcom/google/android/uc;", "c", "Ljava/util/Map;", "j", "()Ljava/util/Map;", "getAlignmentLines$annotations", "alignmentLines", "Lkotlin/Function1;", "Lcom/google/android/mra;", "d", "Lkotlin/jvm/functions/Function1;", "k", "()Lkotlin/jvm/functions/Function1;", "rulers", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements fj7 {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final int width;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final int height;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final Map<uc, Integer> alignmentLines;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final Function1<mra, Unit> rulers;
        final /* synthetic */ Function1<o.a, Unit> e;
        final /* synthetic */ b f;

        /* JADX WARN: Multi-variable type inference failed */
        a(int i, int i2, Map<uc, Integer> map, Function1<? super mra, Unit> function1, Function1<? super o.a, Unit> function2, b bVar) {
            this.e = function2;
            this.f = bVar;
            this.width = i;
            this.height = i2;
            this.alignmentLines = map;
            this.rulers = function1;
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
            return this.alignmentLines;
        }

        @Override // com.google.inputmethod.fj7
        public Function1<mra, Unit> k() {
            return this.rulers;
        }

        @Override // com.google.inputmethod.fj7
        public void l() {
            this.e.invoke(this.f.getCoordinator().getPlacementScope());
        }
    }

    public b(androidx.compose.ui.node.d dVar, ApproachLayoutModifierNode approachLayoutModifierNode) {
        this.coordinator = dVar;
        this.approachNode = approachLayoutModifierNode;
    }

    @Override // com.google.inputmethod.f43
    public int A2(long j) {
        return this.coordinator.A2(j);
    }

    @Override // androidx.compose.ui.layout.j
    public fj7 B2(int width, int height, Map<uc, Integer> alignmentLines, Function1<? super mra, Unit> rulers, Function1<? super o.a, Unit> placementBlock) {
        if (!((width & (-16777216)) == 0 && ((-16777216) & height) == 0)) {
            zw5.c("Size(" + width + " x " + height + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new a(width, height, alignmentLines, rulers, placementBlock, this);
    }

    @Override // com.google.inputmethod.h66
    public boolean G1() {
        return false;
    }

    @Override // com.google.inputmethod.f43
    public float O0(int i) {
        return this.coordinator.O0(i);
    }

    @Override // com.google.inputmethod.f43
    public int O1(float f) {
        return this.coordinator.O1(f);
    }

    @Override // com.google.inputmethod.f43
    public float P0(float f) {
        return this.coordinator.P0(f);
    }

    @Override // com.google.inputmethod.f43
    public long S(long j) {
        return this.coordinator.S(j);
    }

    @Override // com.google.inputmethod.f43
    public float T1(long j) {
        return this.coordinator.T1(j);
    }

    @Override // com.google.inputmethod.hm4
    public float U(long j) {
        return this.coordinator.U(j);
    }

    @Override // com.google.inputmethod.f43
    public long X(int i) {
        return this.coordinator.X(i);
    }

    @Override // com.google.inputmethod.f43
    public long Y(float f) {
        return this.coordinator.Y(f);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    @Override // com.google.inputmethod.wa7
    public kn6 b(o.a aVar) throws KotlinNothingValueException {
        NodeCoordinator nodeCoordinatorB0;
        LayoutNode lookaheadRoot = this.coordinator.getLayoutNode().getLookaheadRoot();
        if (lookaheadRoot == null) {
            zw5.b("Error: Requesting LookaheadScopeCoordinates is not permitted from outside of a LookaheadScope.");
            throw new KotlinNothingValueException();
        }
        if (!lookaheadRoot.getIsVirtualLookaheadRoot()) {
            return lookaheadRoot.x0();
        }
        LayoutNode layoutNodeC0 = lookaheadRoot.C0();
        return (layoutNodeC0 == null || (nodeCoordinatorB0 = layoutNodeC0.b0()) == null) ? lookaheadRoot.R().get(0).x0() : nodeCoordinatorB0;
    }

    @Override // com.google.inputmethod.f43
    public long b1(long j) {
        return this.coordinator.b1(j);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    @Override // com.google.inputmethod.wa7
    public kn6 f(kn6 kn6Var) throws KotlinNothingValueException {
        ua7 lookaheadLayoutCoordinates;
        if (kn6Var instanceof ua7) {
            return kn6Var;
        }
        if (kn6Var instanceof NodeCoordinator) {
            androidx.compose.ui.node.i lookaheadDelegate = ((NodeCoordinator) kn6Var).getLookaheadDelegate();
            return (lookaheadDelegate == null || (lookaheadLayoutCoordinates = lookaheadDelegate.getLookaheadLayoutCoordinates()) == null) ? kn6Var : lookaheadLayoutCoordinates;
        }
        zw5.b("Unsupported LayoutCoordinates");
        throw new KotlinNothingValueException();
    }

    @Override // com.google.inputmethod.f43
    public float getDensity() {
        return this.coordinator.getDensity();
    }

    @Override // com.google.inputmethod.h66
    public LayoutDirection getLayoutDirection() {
        return this.coordinator.getLayoutDirection();
    }

    @Override // androidx.compose.ui.layout.j
    public fj7 h2(int width, int height, Map<uc, Integer> alignmentLines, Function1<? super o.a, Unit> placementBlock) {
        return this.coordinator.h2(width, height, alignmentLines, placementBlock);
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final boolean getApproachMeasureRequired() {
        return this.approachMeasureRequired;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final ApproachLayoutModifierNode getApproachNode() {
        return this.approachNode;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    @Override // com.google.inputmethod.fz
    public long s0() throws KotlinNothingValueException {
        androidx.compose.ui.node.i lookaheadDelegate = this.coordinator.getLookaheadDelegate();
        Intrinsics.g(lookaheadDelegate);
        fj7 fj7VarZ1 = lookaheadDelegate.z1();
        return q16.c((((long) fj7VarZ1.getWidth()) << 32) | (((long) fj7VarZ1.getHeight()) & 4294967295L));
    }

    @Override // com.google.inputmethod.hm4
    public long s1(float f) {
        return this.coordinator.s1(f);
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final androidx.compose.ui.node.d getCoordinator() {
        return this.coordinator;
    }

    public final void w(boolean z) {
        this.approachMeasureRequired = z;
    }

    @Override // com.google.inputmethod.hm4
    /* JADX INFO: renamed from: w2 */
    public float getFontScale() {
        return this.coordinator.getFontScale();
    }

    @Override // com.google.inputmethod.f43
    public float x2(float f) {
        return this.coordinator.x2(f);
    }

    public final void z(ApproachLayoutModifierNode approachLayoutModifierNode) {
        this.approachNode = approachLayoutModifierNode;
    }
}
