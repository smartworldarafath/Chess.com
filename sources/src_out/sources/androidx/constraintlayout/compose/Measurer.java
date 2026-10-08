package androidx.constraintlayout.compose;

import androidx.compose.ui.graphics.m;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.j;
import androidx.compose.ui.layout.o;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.f;
import com.google.inputmethod.cx1;
import com.google.inputmethod.d73;
import com.google.inputmethod.dj7;
import com.google.inputmethod.f43;
import com.google.inputmethod.h16;
import com.google.inputmethod.kx1;
import com.google.inputmethod.n6c;
import com.google.inputmethod.nx1;
import com.google.inputmethod.pn6;
import com.google.inputmethod.r16;
import com.google.inputmethod.t04;
import com.google.inputmethod.xdd;
import com.google.inputmethod.zw1;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.g;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000È\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0011\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004JO\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0017\u001a\u00020\u0016*\b\u0012\u0004\u0012\u00020\u00070\u00132\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001d\u0010\u0004JI\u0010+\u001a\u00020*2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020%0$2\u0006\u0010'\u001a\u00020\u00072\u0006\u0010)\u001a\u00020(ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0016H\u0000¢\u0006\u0004\b-\u0010\u0004J\u001d\u0010.\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u001eH\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b.\u0010/J\u001f\u00101\u001a\u00020\u0016*\u0002002\f\u0010&\u001a\b\u0012\u0004\u0012\u00020%0$¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\u0016H\u0016¢\u0006\u0004\b3\u0010\u0004R\u0016\u00106\u001a\u0002048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00105R\u001a\u0010;\u001a\u0002078\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u001b\u00108\u001a\u0004\b9\u0010:R&\u0010A\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020=0<8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b.\u0010>\u001a\u0004\b?\u0010@R&\u0010B\u001a\u0014\u0012\u0004\u0012\u00020%\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00130<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010>R&\u0010E\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020C0<8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0017\u0010>\u001a\u0004\bD\u0010@R\"\u0010L\u001a\u00020F8\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bG\u0010I\"\u0004\bJ\u0010KR\"\u0010)\u001a\u00020(8\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\bD\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\u001b\u0010V\u001a\u00020R8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b?\u0010S\u001a\u0004\bT\u0010UR\u0014\u0010X\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010WR\u0014\u0010Y\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010WR\"\u0010`\u001a\u00020Z8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u0010[\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R\"\u0010f\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010a\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR\"\u0010i\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010a\u001a\u0004\bg\u0010c\"\u0004\bh\u0010eR&\u0010n\u001a\u0012\u0012\u0004\u0012\u00020k0jj\b\u0012\u0004\u0012\u00020k`l8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010m\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006o"}, d2 = {"Landroidx/constraintlayout/compose/Measurer;", "Landroidx/constraintlayout/core/widgets/analyzer/b$b;", "Lcom/google/android/d73;", "<init>", "()V", "Landroidx/constraintlayout/core/widgets/ConstraintWidget$DimensionBehaviour;", "dimensionBehaviour", "", "dimension", "matchConstraintDefaultDimension", "measureStrategy", "", "otherDimensionResolved", "currentDimensionResolved", "rootMaxConstraint", "", "outConstraints", "j", "(Landroidx/constraintlayout/core/widgets/ConstraintWidget$DimensionBehaviour;IIIZZI[I)Z", "", "Landroidx/constraintlayout/core/widgets/analyzer/b$a;", "measure", "", "e", "([Ljava/lang/Integer;Landroidx/constraintlayout/core/widgets/analyzer/b$a;)V", "Landroidx/constraintlayout/core/widgets/ConstraintWidget;", "constraintWidget", "b", "(Landroidx/constraintlayout/core/widgets/ConstraintWidget;Landroidx/constraintlayout/core/widgets/analyzer/b$a;)V", "d", "Lcom/google/android/kx1;", "constraints", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Lcom/google/android/cx1;", "constraintSet", "", "Lcom/google/android/dj7;", "measurables", "optimizationLevel", "Landroidx/compose/ui/layout/j;", "measureScope", "Lcom/google/android/q16;", "l", "(JLandroidx/compose/ui/unit/LayoutDirection;Lcom/google/android/cx1;Ljava/util/List;ILandroidx/compose/ui/layout/j;)J", "m", "c", "(J)V", "Landroidx/compose/ui/layout/o$a;", "k", "(Landroidx/compose/ui/layout/o$a;Ljava/util/List;)V", "a", "", "Ljava/lang/String;", "computedLayoutResult", "Landroidx/constraintlayout/core/widgets/d;", "Landroidx/constraintlayout/core/widgets/d;", "getRoot", "()Landroidx/constraintlayout/core/widgets/d;", "root", "", "Landroidx/compose/ui/layout/o;", "Ljava/util/Map;", "h", "()Ljava/util/Map;", "placeables", "lastMeasures", "Landroidx/constraintlayout/core/state/d;", "g", "frameCache", "Lcom/google/android/f43;", "f", "Lcom/google/android/f43;", "()Lcom/google/android/f43;", "n", "(Lcom/google/android/f43;)V", "density", "Landroidx/compose/ui/layout/j;", "getMeasureScope", "()Landroidx/compose/ui/layout/j;", "o", "(Landroidx/compose/ui/layout/j;)V", "Lcom/google/android/n6c;", "Lkotlin/Lazy;", "i", "()Lcom/google/android/n6c;", "state", "[I", "widthConstraintsHolder", "heightConstraintsHolder", "", "F", "getForcedScaleFactor", "()F", "setForcedScaleFactor", "(F)V", "forcedScaleFactor", "I", "getLayoutCurrentWidth", "()I", "setLayoutCurrentWidth", "(I)V", "layoutCurrentWidth", "getLayoutCurrentHeight", "setLayoutCurrentHeight", "layoutCurrentHeight", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "designElements", "compose_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public class Measurer implements androidx.constraintlayout.core.widgets.analyzer.b.InterfaceC0068b, d73 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private String computedLayoutResult = "";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final androidx.constraintlayout.core.widgets.d root;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Map<dj7, o> placeables;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Map<dj7, Integer[]> lastMeasures;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final Map<dj7, androidx.constraintlayout.core.state.d> frameCache;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    protected f43 density;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    protected j measureScope;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final Lazy state;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final int[] widthConstraintsHolder;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final int[] heightConstraintsHolder;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private float forcedScaleFactor;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private int layoutCurrentWidth;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private int layoutCurrentHeight;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private ArrayList<Object> designElements;

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ConstraintWidget.DimensionBehaviour.values().length];
            iArr[ConstraintWidget.DimensionBehaviour.FIXED.ordinal()] = 1;
            iArr[ConstraintWidget.DimensionBehaviour.WRAP_CONTENT.ordinal()] = 2;
            iArr[ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT.ordinal()] = 3;
            iArr[ConstraintWidget.DimensionBehaviour.MATCH_PARENT.ordinal()] = 4;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public Measurer() {
        androidx.constraintlayout.core.widgets.d dVar = new androidx.constraintlayout.core.widgets.d(0, 0);
        dVar.e2(this);
        Unit unit = Unit.a;
        this.root = dVar;
        this.placeables = new LinkedHashMap();
        this.lastMeasures = new LinkedHashMap();
        this.frameCache = new LinkedHashMap();
        this.state = kotlin.c.a(LazyThreadSafetyMode.c, new Function0<n6c>() { // from class: androidx.constraintlayout.compose.Measurer$state$2
            {
                super(0);
            }

            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final n6c invoke() {
                return new n6c(this.this$0.f());
            }
        });
        this.widthConstraintsHolder = new int[2];
        this.heightConstraintsHolder = new int[2];
        this.forcedScaleFactor = Float.NaN;
        this.designElements = new ArrayList<>();
    }

    private final void e(Integer[] numArr, androidx.constraintlayout.core.widgets.analyzer.b.a aVar) {
        numArr[0] = Integer.valueOf(aVar.e);
        numArr[1] = Integer.valueOf(aVar.f);
        numArr[2] = Integer.valueOf(aVar.g);
    }

    private final boolean j(ConstraintWidget.DimensionBehaviour dimensionBehaviour, int dimension, int matchConstraintDefaultDimension, int measureStrategy, boolean otherDimensionResolved, boolean currentDimensionResolved, int rootMaxConstraint, int[] outConstraints) {
        int i = a.$EnumSwitchMapping$0[dimensionBehaviour.ordinal()];
        if (i == 1) {
            outConstraints[0] = dimension;
            outConstraints[1] = dimension;
            return false;
        }
        if (i == 2) {
            outConstraints[0] = 0;
            outConstraints[1] = rootMaxConstraint;
            return true;
        }
        if (i != 3) {
            if (i == 4) {
                outConstraints[0] = rootMaxConstraint;
                outConstraints[1] = rootMaxConstraint;
                return false;
            }
            throw new IllegalStateException((dimensionBehaviour + " is not supported").toString());
        }
        if (ConstraintLayoutKt.a) {
            Intrinsics.p("Measure strategy ", Integer.valueOf(measureStrategy));
            Intrinsics.p("DW ", Integer.valueOf(matchConstraintDefaultDimension));
            Intrinsics.p("ODR ", Boolean.valueOf(otherDimensionResolved));
            Intrinsics.p("IRH ", Boolean.valueOf(currentDimensionResolved));
        }
        boolean z = currentDimensionResolved || ((measureStrategy == androidx.constraintlayout.core.widgets.analyzer.b.a.l || measureStrategy == androidx.constraintlayout.core.widgets.analyzer.b.a.m) && (measureStrategy == androidx.constraintlayout.core.widgets.analyzer.b.a.m || matchConstraintDefaultDimension != 1 || otherDimensionResolved));
        if (ConstraintLayoutKt.a) {
            Intrinsics.p("UD ", Boolean.valueOf(z));
        }
        outConstraints[0] = z ? dimension : 0;
        if (!z) {
            dimension = rootMaxConstraint;
        }
        outConstraints[1] = dimension;
        return !z;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.b.InterfaceC0068b
    public void a() {
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00db  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:47:0x0105  */
    /* JADX WARN: Code duplicated, block: B:51:0x0127  */
    /* JADX WARN: Code duplicated, block: B:55:0x0135  */
    /* JADX WARN: Code duplicated, block: B:59:0x0155  */
    /* JADX WARN: Code duplicated, block: B:63:0x0163  */
    /* JADX WARN: Code duplicated, block: B:66:0x0174  */
    /* JADX WARN: Code duplicated, block: B:67:0x0182  */
    /* JADX WARN: Code duplicated, block: B:70:0x0189  */
    /* JADX WARN: Code duplicated, block: B:72:0x0198  */
    /* JADX WARN: Code duplicated, block: B:74:0x019e  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.constraintlayout.core.widgets.analyzer.b.InterfaceC0068b
    public void b(ConstraintWidget constraintWidget, androidx.constraintlayout.core.widgets.analyzer.b.a measure) {
        Integer num;
        Integer num2;
        dj7 dj7Var;
        o oVarR0;
        Integer numValueOf;
        Integer numValueOf2;
        int iIntValue;
        Integer numValueOf3;
        Integer numValueOf4;
        int iIntValue2;
        boolean z;
        Intrinsics.checkNotNullParameter(constraintWidget, "constraintWidget");
        Intrinsics.checkNotNullParameter(measure, "measure");
        Object objU = constraintWidget.u();
        if (objU instanceof dj7) {
            if (ConstraintLayoutKt.a) {
                Objects.toString(pn6.a((dj7) objU));
                ConstraintLayoutKt.g(constraintWidget);
                ConstraintLayoutKt.h(measure);
            }
            Integer[] numArr = this.lastMeasures.get(objU);
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = measure.a;
            Intrinsics.checkNotNullExpressionValue(dimensionBehaviour, "measure.horizontalBehavior");
            j(dimensionBehaviour, measure.c, constraintWidget.w, measure.j, ((numArr != null && (num = numArr[1]) != null) ? num.intValue() : 0) == constraintWidget.z(), constraintWidget.r0(), kx1.l(i().getRootIncomingConstraints()), this.widthConstraintsHolder);
            ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = measure.b;
            Intrinsics.checkNotNullExpressionValue(dimensionBehaviour2, "measure.verticalBehavior");
            j(dimensionBehaviour2, measure.d, constraintWidget.x, measure.j, ((numArr != null && (num2 = numArr[0]) != null) ? num2.intValue() : 0) == constraintWidget.a0(), constraintWidget.s0(), kx1.k(i().getRootIncomingConstraints()), this.heightConstraintsHolder);
            int[] iArr = this.widthConstraintsHolder;
            int i = iArr[0];
            int i2 = iArr[1];
            int[] iArr2 = this.heightConstraintsHolder;
            long jA = nx1.a(i, i2, iArr2[0], iArr2[1]);
            int i3 = measure.j;
            if (i3 == androidx.constraintlayout.core.widgets.analyzer.b.a.l || i3 == androidx.constraintlayout.core.widgets.analyzer.b.a.m) {
                if (ConstraintLayoutKt.a) {
                    Objects.toString(pn6.a((dj7) objU));
                    kx1.q(jA);
                }
                dj7Var = (dj7) objU;
                oVarR0 = dj7Var.r0(jA);
                h().put(objU, oVarR0);
                constraintWidget.f1(false);
                if (ConstraintLayoutKt.a) {
                    Objects.toString(pn6.a(dj7Var));
                    oVarR0.getWidth();
                    oVarR0.getHeight();
                }
                Integer numValueOf5 = Integer.valueOf(oVarR0.getWidth());
                numValueOf = Integer.valueOf(constraintWidget.z);
                if (numValueOf.intValue() <= 0) {
                    numValueOf = null;
                }
                numValueOf2 = Integer.valueOf(constraintWidget.A);
                if (numValueOf2.intValue() <= 0) {
                    numValueOf2 = null;
                }
                iIntValue = ((Number) g.t(numValueOf5, numValueOf, numValueOf2)).intValue();
                Integer numValueOf6 = Integer.valueOf(oVarR0.getHeight());
                numValueOf3 = Integer.valueOf(constraintWidget.C);
                if (numValueOf3.intValue() <= 0) {
                    numValueOf3 = null;
                }
                numValueOf4 = Integer.valueOf(constraintWidget.D);
                if (numValueOf4.intValue() <= 0) {
                    numValueOf4 = null;
                }
                iIntValue2 = ((Number) g.t(numValueOf6, numValueOf3, numValueOf4)).intValue();
                if (iIntValue != oVarR0.getWidth()) {
                    jA = nx1.a(iIntValue, iIntValue, kx1.m(jA), kx1.k(jA));
                    z = true;
                } else {
                    z = false;
                }
                if (iIntValue2 != oVarR0.getHeight()) {
                    jA = nx1.a(kx1.n(jA), kx1.l(jA), iIntValue2, iIntValue2);
                    z = true;
                }
                if (z) {
                    if (ConstraintLayoutKt.a) {
                        Objects.toString(pn6.a(dj7Var));
                        kx1.q(jA);
                    }
                    h().put(objU, dj7Var.r0(jA));
                    constraintWidget.f1(false);
                }
            } else {
                ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = measure.a;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                if (dimensionBehaviour3 != dimensionBehaviour4 || constraintWidget.w != 0 || measure.b != dimensionBehaviour4 || constraintWidget.x != 0) {
                    if (ConstraintLayoutKt.a) {
                        Objects.toString(pn6.a((dj7) objU));
                        kx1.q(jA);
                    }
                    dj7Var = (dj7) objU;
                    oVarR0 = dj7Var.r0(jA);
                    h().put(objU, oVarR0);
                    constraintWidget.f1(false);
                    if (ConstraintLayoutKt.a) {
                        Objects.toString(pn6.a(dj7Var));
                        oVarR0.getWidth();
                        oVarR0.getHeight();
                    }
                    Integer numValueOf7 = Integer.valueOf(oVarR0.getWidth());
                    numValueOf = Integer.valueOf(constraintWidget.z);
                    if (numValueOf.intValue() <= 0) {
                        numValueOf = null;
                    }
                    numValueOf2 = Integer.valueOf(constraintWidget.A);
                    if (numValueOf2.intValue() <= 0) {
                        numValueOf2 = null;
                    }
                    iIntValue = ((Number) g.t(numValueOf7, numValueOf, numValueOf2)).intValue();
                    Integer numValueOf8 = Integer.valueOf(oVarR0.getHeight());
                    numValueOf3 = Integer.valueOf(constraintWidget.C);
                    if (numValueOf3.intValue() <= 0) {
                        numValueOf3 = null;
                    }
                    numValueOf4 = Integer.valueOf(constraintWidget.D);
                    if (numValueOf4.intValue() <= 0) {
                        numValueOf4 = null;
                    }
                    iIntValue2 = ((Number) g.t(numValueOf8, numValueOf3, numValueOf4)).intValue();
                    if (iIntValue != oVarR0.getWidth()) {
                        jA = nx1.a(iIntValue, iIntValue, kx1.m(jA), kx1.k(jA));
                        z = true;
                    } else {
                        z = false;
                    }
                    if (iIntValue2 != oVarR0.getHeight()) {
                        jA = nx1.a(kx1.n(jA), kx1.l(jA), iIntValue2, iIntValue2);
                        z = true;
                    }
                    if (z) {
                        if (ConstraintLayoutKt.a) {
                            Objects.toString(pn6.a(dj7Var));
                            kx1.q(jA);
                        }
                        h().put(objU, dj7Var.r0(jA));
                        constraintWidget.f1(false);
                    }
                }
            }
            o oVar = this.placeables.get(objU);
            Integer numValueOf9 = oVar == null ? null : Integer.valueOf(oVar.getWidth());
            measure.e = numValueOf9 == null ? constraintWidget.a0() : numValueOf9.intValue();
            Integer numValueOf10 = oVar != null ? Integer.valueOf(oVar.getHeight()) : null;
            measure.f = numValueOf10 == null ? constraintWidget.z() : numValueOf10.intValue();
            int iJ = (oVar == null || !i().t(constraintWidget)) ? Integer.MIN_VALUE : oVar.J(AlignmentLineKt.a());
            measure.h = iJ != Integer.MIN_VALUE;
            measure.g = iJ;
            Map<dj7, Integer[]> map = this.lastMeasures;
            Integer[] numArr2 = map.get(objU);
            if (numArr2 == null) {
                numArr2 = new Integer[]{0, 0, Integer.valueOf(t04.INVALID_ID)};
                map.put((dj7) objU, numArr2);
            }
            e(numArr2, measure);
            measure.i = (measure.e == measure.c && measure.f == measure.d) ? false : true;
        }
    }

    protected final void c(long constraints) {
        this.root.r1(kx1.l(constraints));
        this.root.S0(kx1.k(constraints));
        this.forcedScaleFactor = Float.NaN;
        this.layoutCurrentWidth = this.root.a0();
        this.layoutCurrentHeight = this.root.z();
    }

    public void d() {
        ConstraintWidget constraintWidget;
        StringBuilder sb = new StringBuilder();
        sb.append("{ ");
        sb.append("  root: {");
        sb.append("interpolated: { left:  0,");
        sb.append("  top:  0,");
        sb.append("  right:   " + this.root.a0() + " ,");
        sb.append("  bottom:  " + this.root.z() + " ,");
        sb.append(" } }");
        for (ConstraintWidget constraintWidget2 : this.root.z1()) {
            Object objU = constraintWidget2.u();
            if (objU instanceof dj7) {
                androidx.constraintlayout.core.state.d dVar = null;
                if (constraintWidget2.o == null) {
                    dj7 dj7Var = (dj7) objU;
                    Object objA = pn6.a(dj7Var);
                    if (objA == null) {
                        objA = zw1.a(dj7Var);
                    }
                    constraintWidget2.o = objA == null ? null : objA.toString();
                }
                androidx.constraintlayout.core.state.d dVar2 = this.frameCache.get(objU);
                if (dVar2 != null && (constraintWidget = dVar2.a) != null) {
                    dVar = constraintWidget.n;
                }
                if (dVar != null) {
                    sb.append(' ' + ((Object) constraintWidget2.o) + ": {");
                    sb.append(" interpolated : ");
                    dVar.d(sb, true);
                    sb.append("}, ");
                }
            } else if (constraintWidget2 instanceof f) {
                sb.append(' ' + ((Object) constraintWidget2.o) + ": {");
                f fVar = (f) constraintWidget2;
                if (fVar.z1() == 0) {
                    sb.append(" type: 'hGuideline', ");
                } else {
                    sb.append(" type: 'vGuideline', ");
                }
                sb.append(" interpolated: ");
                sb.append(" { left: " + fVar.b0() + ", top: " + fVar.c0() + ", right: " + (fVar.b0() + fVar.a0()) + ", bottom: " + (fVar.c0() + fVar.z()) + " }");
                sb.append("}, ");
            }
        }
        sb.append(" }");
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "json.toString()");
        this.computedLayoutResult = string;
    }

    protected final f43 f() {
        f43 f43Var = this.density;
        if (f43Var != null) {
            return f43Var;
        }
        Intrinsics.x("density");
        throw null;
    }

    protected final Map<dj7, androidx.constraintlayout.core.state.d> g() {
        return this.frameCache;
    }

    protected final Map<dj7, o> h() {
        return this.placeables;
    }

    protected final n6c i() {
        return (n6c) this.state.getValue();
    }

    public final void k(o.a aVar, List<? extends dj7> list) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(list, "measurables");
        if (this.frameCache.isEmpty()) {
            for (ConstraintWidget constraintWidget : this.root.z1()) {
                Object objU = constraintWidget.u();
                if (objU instanceof dj7) {
                    this.frameCache.put((dj7) objU, new androidx.constraintlayout.core.state.d(constraintWidget.n.i()));
                }
            }
        }
        int size = list.size() - 1;
        if (size >= 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                dj7 dj7Var = list.get(i);
                final androidx.constraintlayout.core.state.d dVar = g().get(dj7Var);
                if (dVar == null) {
                    return;
                }
                if (dVar.c()) {
                    androidx.constraintlayout.core.state.d dVar2 = g().get(dj7Var);
                    Intrinsics.g(dVar2);
                    int i3 = dVar2.b;
                    androidx.constraintlayout.core.state.d dVar3 = g().get(dj7Var);
                    Intrinsics.g(dVar3);
                    int i4 = dVar3.c;
                    o oVar = h().get(dj7Var);
                    if (oVar != null) {
                        o.a.F(aVar, oVar, h16.a(i3, i4), 0.0f, 2, null);
                    }
                } else {
                    Function1<m, Unit> function1 = new Function1<m, Unit>() { // from class: androidx.constraintlayout.compose.Measurer$performLayout$1$layerBlock$1
                        {
                            super(1);
                        }

                        public final void a(m mVar) {
                            Intrinsics.checkNotNullParameter(mVar, "$this$null");
                            if (!Float.isNaN(dVar.f) || !Float.isNaN(dVar.g)) {
                                mVar.i0(xdd.a(Float.isNaN(dVar.f) ? 0.5f : dVar.f, Float.isNaN(dVar.g) ? 0.5f : dVar.g));
                            }
                            if (!Float.isNaN(dVar.h)) {
                                mVar.p(dVar.h);
                            }
                            if (!Float.isNaN(dVar.i)) {
                                mVar.q(dVar.i);
                            }
                            if (!Float.isNaN(dVar.j)) {
                                mVar.u(dVar.j);
                            }
                            if (!Float.isNaN(dVar.k)) {
                                mVar.setTranslationX(dVar.k);
                            }
                            if (!Float.isNaN(dVar.l)) {
                                mVar.setTranslationY(dVar.l);
                            }
                            if (!Float.isNaN(dVar.m)) {
                                mVar.s(dVar.m);
                            }
                            if (!Float.isNaN(dVar.n) || !Float.isNaN(dVar.o)) {
                                mVar.G(Float.isNaN(dVar.n) ? 1.0f : dVar.n);
                                mVar.M(Float.isNaN(dVar.o) ? 1.0f : dVar.o);
                            }
                            if (Float.isNaN(dVar.p)) {
                                return;
                            }
                            mVar.c(dVar.p);
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            a((m) obj);
                            return Unit.a;
                        }
                    };
                    androidx.constraintlayout.core.state.d dVar4 = g().get(dj7Var);
                    Intrinsics.g(dVar4);
                    int i5 = dVar4.b;
                    androidx.constraintlayout.core.state.d dVar5 = g().get(dj7Var);
                    Intrinsics.g(dVar5);
                    int i6 = dVar5.c;
                    float f = Float.isNaN(dVar.m) ? 0.0f : dVar.m;
                    o oVar2 = h().get(dj7Var);
                    if (oVar2 != null) {
                        aVar.c0(oVar2, i5, i6, f, function1);
                    }
                }
                if (i2 > size) {
                    break;
                } else {
                    i = i2;
                }
            }
        }
        if (LayoutInfoFlags.BOUNDS == null) {
            d();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long l(long constraints, LayoutDirection layoutDirection, cx1 constraintSet, List<? extends dj7> measurables, int optimizationLevel, j measureScope) {
        String string;
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        Intrinsics.checkNotNullParameter(constraintSet, "constraintSet");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        Intrinsics.checkNotNullParameter(measureScope, "measureScope");
        n(measureScope);
        o(measureScope);
        i().q(kx1.j(constraints) ? androidx.constraintlayout.core.state.b.a(kx1.l(constraints)) : androidx.constraintlayout.core.state.b.d().o(kx1.n(constraints)));
        i().h(kx1.i(constraints) ? androidx.constraintlayout.core.state.b.a(kx1.k(constraints)) : androidx.constraintlayout.core.state.b.d().o(kx1.m(constraints)));
        i().v(constraints);
        i().u(layoutDirection);
        m();
        if (constraintSet.b(measurables)) {
            i().l();
            constraintSet.a(i(), measurables);
            ConstraintLayoutKt.d(i(), measurables);
            i().a(this.root);
        } else {
            ConstraintLayoutKt.d(i(), measurables);
        }
        c(constraints);
        this.root.j2();
        if (ConstraintLayoutKt.a) {
            this.root.J0("ConstraintLayout");
            ArrayList<ConstraintWidget> arrayListZ1 = this.root.z1();
            Intrinsics.checkNotNullExpressionValue(arrayListZ1, "root.children");
            for (ConstraintWidget constraintWidget : arrayListZ1) {
                Object objU = constraintWidget.u();
                dj7 dj7Var = objU instanceof dj7 ? (dj7) objU : null;
                Object objA = dj7Var == null ? null : pn6.a(dj7Var);
                String str = "NOTAG";
                if (objA != null && (string = objA.toString()) != null) {
                    str = string;
                }
                constraintWidget.J0(str);
            }
            Intrinsics.p("ConstraintLayout is asked to measure with ", kx1.q(constraints));
            ConstraintLayoutKt.g(this.root);
            for (ConstraintWidget constraintWidget2 : this.root.z1()) {
                Intrinsics.checkNotNullExpressionValue(constraintWidget2, "child");
                ConstraintLayoutKt.g(constraintWidget2);
            }
        }
        this.root.f2(optimizationLevel);
        androidx.constraintlayout.core.widgets.d dVar = this.root;
        dVar.a2(dVar.S1(), 0, 0, 0, 0, 0, 0, 0, 0);
        for (ConstraintWidget constraintWidget3 : this.root.z1()) {
            Object objU2 = constraintWidget3.u();
            if (objU2 instanceof dj7) {
                o oVar = this.placeables.get(objU2);
                Integer numValueOf = oVar == null ? null : Integer.valueOf(oVar.getWidth());
                Integer numValueOf2 = oVar == null ? null : Integer.valueOf(oVar.getHeight());
                int iA0 = constraintWidget3.a0();
                if (numValueOf != null && iA0 == numValueOf.intValue()) {
                    int iZ = constraintWidget3.z();
                    if (numValueOf2 != null && iZ == numValueOf2.intValue()) {
                    }
                }
                if (ConstraintLayoutKt.a) {
                    Objects.toString(pn6.a((dj7) objU2));
                    constraintWidget3.a0();
                    constraintWidget3.z();
                }
                h().put(objU2, ((dj7) objU2).r0(kx1.INSTANCE.c(constraintWidget3.a0(), constraintWidget3.z())));
            }
        }
        if (ConstraintLayoutKt.a) {
            this.root.a0();
            this.root.z();
        }
        return r16.a(this.root.a0(), this.root.z());
    }

    public final void m() {
        this.placeables.clear();
        this.lastMeasures.clear();
        this.frameCache.clear();
    }

    protected final void n(f43 f43Var) {
        Intrinsics.checkNotNullParameter(f43Var, "<set-?>");
        this.density = f43Var;
    }

    protected final void o(j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<set-?>");
        this.measureScope = jVar;
    }
}
