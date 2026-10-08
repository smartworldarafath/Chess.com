package androidx.compose.p001foundation.layout;

import androidx.compose.p001foundation.layout.FlowLayoutOverflowState;
import androidx.compose.ui.layout.o;
import com.google.inputmethod.bu8;
import com.google.inputmethod.dj7;
import com.google.inputmethod.f66;
import com.google.inputmethod.kx1;
import com.google.inputmethod.t06;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.c0, reason: from toString */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u0001B!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0011\u0010\u0012J3\u0010\u001a\u001a\u00020\u00192\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0017H\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ3\u0010\u001f\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\u0014\u001a\u0004\u0018\u00010\u001e2\b\u0010\u0015\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u0018\u001a\u00020\u0017H\u0000¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010'\u001a\u00020\t2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u0010%R\u001a\u0010\u0006\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0011\u0010.\u001a\u0004\b0\u0010%R\u001a\u00103\u001a\u00020!8\u0000X\u0080D¢\u0006\f\n\u0004\b\u000e\u00101\u001a\u0004\b2\u0010#R\"\u00107\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b/\u0010.\u001a\u0004\b4\u0010%\"\u0004\b5\u00106R\"\u0010;\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b8\u0010.\u001a\u0004\b9\u0010%\"\u0004\b:\u00106R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010<R\u0018\u0010?\u001a\u0004\u0018\u00010=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010>R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u0010<R\u0018\u0010@\u001a\u0004\u0018\u00010=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010>R\u0018\u0010B\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010AR\u0018\u0010D\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010AR,\u0010H\u001a\u0018\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u001e\u0018\u00010E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010I\u001a\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b8\u0010%¨\u0006J"}, d2 = {"Landroidx/compose/foundation/layout/c0;", "", "Landroidx/compose/foundation/layout/FlowLayoutOverflow$OverflowType;", "type", "", "minLinesToShowCollapse", "minCrossAxisSizeToShowCollapse", "<init>", "(Landroidx/compose/foundation/layout/FlowLayoutOverflow$OverflowType;II)V", "", "hasNext", "lineIndex", "totalCrossAxisSize", "Lcom/google/android/t06;", "d", "(ZII)Lcom/google/android/t06;", "Landroidx/compose/foundation/layout/a0$a;", "c", "(ZII)Landroidx/compose/foundation/layout/a0$a;", "Lcom/google/android/f66;", "seeMoreMeasurable", "collapseMeasurable", "isHorizontal", "Lcom/google/android/kx1;", "constraints", "", "k", "(Lcom/google/android/f66;Lcom/google/android/f66;ZJ)V", "Landroidx/compose/foundation/layout/d0;", "measurePolicy", "Lcom/google/android/dj7;", "j", "(Landroidx/compose/foundation/layout/d0;Lcom/google/android/dj7;Lcom/google/android/dj7;J)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Landroidx/compose/foundation/layout/FlowLayoutOverflow$OverflowType;", "g", "()Landroidx/compose/foundation/layout/FlowLayoutOverflow$OverflowType;", "b", "I", "e", "getMinCrossAxisSizeToShowCollapse$foundation_layout", "Ljava/lang/String;", "getShownItemLazyErrorMessage$foundation_layout", "shownItemLazyErrorMessage", "getItemShown$foundation_layout", "i", "(I)V", "itemShown", "f", "getItemCount$foundation_layout", "h", "itemCount", "Lcom/google/android/dj7;", "Landroidx/compose/ui/layout/o;", "Landroidx/compose/ui/layout/o;", "seeMorePlaceable", "collapsePlaceable", "Lcom/google/android/t06;", "seeMoreSize", "l", "collapseSize", "Lkotlin/Function2;", "m", "Lkotlin/jvm/functions/Function2;", "getOverflowMeasurable", "shownItemCount", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class FlowLayoutOverflowState {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final FlowLayoutOverflow.OverflowType type;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int minLinesToShowCollapse;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final int minCrossAxisSizeToShowCollapse;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String shownItemLazyErrorMessage = "Accessing shownItemCount before it is set. Are you calling this in the Composition phase, rather than in the draw phase? Consider our samples on how to use it during the draw phase or consider using ContextualFlowRow/ContextualFlowColumn which initializes this method in the composition phase.";

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private int itemShown = -1;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private int itemCount;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private dj7 seeMoreMeasurable;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private o seeMorePlaceable;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private dj7 collapseMeasurable;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private o collapsePlaceable;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private t06 seeMoreSize;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private t06 collapseSize;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private Function2<? super Boolean, ? super Integer, ? extends dj7> getOverflowMeasurable;

    /* JADX INFO: renamed from: androidx.compose.foundation.layout.c0$a */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FlowLayoutOverflow.OverflowType.values().length];
            try {
                iArr[FlowLayoutOverflow.OverflowType.Visible.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FlowLayoutOverflow.OverflowType.Clip.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FlowLayoutOverflow.OverflowType.ExpandIndicator.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FlowLayoutOverflow.OverflowType.ExpandOrCollapseIndicator.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public FlowLayoutOverflowState(FlowLayoutOverflow.OverflowType overflowType, int i, int i2) {
        this.type = overflowType;
        this.minLinesToShowCollapse = i;
        this.minCrossAxisSizeToShowCollapse = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(FlowLayoutOverflowState flowLayoutOverflowState, d0 d0Var, o oVar) {
        int iF;
        int iC;
        if (oVar != null) {
            iF = d0Var.f(oVar);
            iC = d0Var.c(oVar);
        } else {
            iF = 0;
            iC = 0;
        }
        flowLayoutOverflowState.seeMoreSize = t06.a(t06.b(iF, iC));
        flowLayoutOverflowState.seeMorePlaceable = oVar;
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(FlowLayoutOverflowState flowLayoutOverflowState, d0 d0Var, o oVar) {
        int iF;
        int iC;
        if (oVar != null) {
            iF = d0Var.f(oVar);
            iC = d0Var.c(oVar);
        } else {
            iF = 0;
            iC = 0;
        }
        flowLayoutOverflowState.collapseSize = t06.a(t06.b(iF, iC));
        flowLayoutOverflowState.collapsePlaceable = oVar;
        return Unit.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:23:0x0043 A[PHI: r11 r12
  0x0043: PHI (r11v10 com.google.android.dj7) = (r11v4 com.google.android.dj7), (r11v14 com.google.android.dj7) binds: [B:35:0x006d, B:20:0x003c] A[DONT_GENERATE, DONT_INLINE]
  0x0043: PHI (r12v3 com.google.android.t06) = (r12v1 com.google.android.t06), (r12v6 com.google.android.t06) binds: [B:35:0x006d, B:20:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    public final a0.a c(boolean hasNext, int lineIndex, int totalCrossAxisSize) throws NoWhenBranchMatchedException {
        dj7 dj7Var;
        t06 t06Var;
        o oVar;
        dj7 dj7Var2;
        o oVar2;
        int i = a.$EnumSwitchMapping$0[this.type.ordinal()];
        if (i == 1 || i == 2) {
            return null;
        }
        if (i != 3 && i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        if (hasNext) {
            Function2<? super Boolean, ? super Integer, ? extends dj7> function2 = this.getOverflowMeasurable;
            if (function2 == null || (dj7Var = (dj7) function2.invoke(Boolean.TRUE, Integer.valueOf(f()))) == null) {
                dj7Var = this.seeMoreMeasurable;
            }
            t06Var = this.seeMoreSize;
            if (this.getOverflowMeasurable == null) {
                oVar = this.seeMorePlaceable;
                dj7Var2 = dj7Var;
                oVar2 = oVar;
            } else {
                dj7Var2 = dj7Var;
                oVar2 = null;
            }
        } else {
            if (lineIndex < this.minLinesToShowCollapse - 1 || totalCrossAxisSize < this.minCrossAxisSizeToShowCollapse) {
                dj7Var = null;
            } else {
                Function2<? super Boolean, ? super Integer, ? extends dj7> function3 = this.getOverflowMeasurable;
                if (function3 == null || (dj7Var = (dj7) function3.invoke(Boolean.FALSE, Integer.valueOf(f()))) == null) {
                    dj7Var = this.collapseMeasurable;
                }
            }
            t06Var = this.collapseSize;
            if (this.getOverflowMeasurable == null) {
                oVar = this.collapsePlaceable;
                dj7Var2 = dj7Var;
                oVar2 = oVar;
            } else {
                dj7Var2 = dj7Var;
                oVar2 = null;
            }
        }
        if (dj7Var2 == null) {
            return null;
        }
        Intrinsics.g(t06Var);
        return new a0.a(dj7Var2, oVar2, t06Var.getPackedValue(), false, 8, null);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final t06 d(boolean hasNext, int lineIndex, int totalCrossAxisSize) throws NoWhenBranchMatchedException {
        int i = a.$EnumSwitchMapping$0[this.type.ordinal()];
        if (i != 1 && i != 2) {
            if (i != 3) {
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                if (hasNext) {
                    return this.seeMoreSize;
                }
                if (lineIndex + 1 < this.minLinesToShowCollapse || totalCrossAxisSize < this.minCrossAxisSizeToShowCollapse) {
                    return null;
                }
                return this.collapseSize;
            }
            if (hasNext) {
                return this.seeMoreSize;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getMinLinesToShowCollapse() {
        return this.minLinesToShowCollapse;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FlowLayoutOverflowState)) {
            return false;
        }
        FlowLayoutOverflowState flowLayoutOverflowState = (FlowLayoutOverflowState) other;
        return this.type == flowLayoutOverflowState.type && this.minLinesToShowCollapse == flowLayoutOverflowState.minLinesToShowCollapse && this.minCrossAxisSizeToShowCollapse == flowLayoutOverflowState.minCrossAxisSizeToShowCollapse;
    }

    public final int f() {
        int i = this.itemShown;
        if (i != -1) {
            return i;
        }
        throw new IllegalStateException(this.shownItemLazyErrorMessage);
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final FlowLayoutOverflow.OverflowType getType() {
        return this.type;
    }

    public final void h(int i) {
        this.itemCount = i;
    }

    public int hashCode() {
        return (((this.type.hashCode() * 31) + Integer.hashCode(this.minLinesToShowCollapse)) * 31) + Integer.hashCode(this.minCrossAxisSizeToShowCollapse);
    }

    public final void i(int i) {
        this.itemShown = i;
    }

    public final void j(final d0 measurePolicy, dj7 seeMoreMeasurable, dj7 collapseMeasurable, long constraints) {
        LayoutOrientation layoutOrientation = measurePolicy.d() ? LayoutOrientation.Horizontal : LayoutOrientation.Vertical;
        long jF = bu8.f(bu8.e(bu8.c(constraints, layoutOrientation), 0, 0, 0, 0, 10, null), layoutOrientation);
        if (seeMoreMeasurable != null) {
            b0.s(seeMoreMeasurable, measurePolicy, jF, new Function1() { // from class: com.google.android.ej4
                public final Object invoke(Object obj) {
                    return FlowLayoutOverflowState.l(this.a, measurePolicy, (o) obj);
                }
            });
            this.seeMoreMeasurable = seeMoreMeasurable;
        }
        if (collapseMeasurable != null) {
            b0.s(collapseMeasurable, measurePolicy, jF, new Function1() { // from class: com.google.android.fj4
                public final Object invoke(Object obj) {
                    return FlowLayoutOverflowState.m(this.a, measurePolicy, (o) obj);
                }
            });
            this.collapseMeasurable = collapseMeasurable;
        }
    }

    public final void k(f66 seeMoreMeasurable, f66 collapseMeasurable, boolean isHorizontal, long constraints) {
        long jC = bu8.c(constraints, isHorizontal ? LayoutOrientation.Horizontal : LayoutOrientation.Vertical);
        if (seeMoreMeasurable != null) {
            int iR = b0.r(seeMoreMeasurable, isHorizontal, kx1.k(jC));
            this.seeMoreSize = t06.a(t06.b(iR, b0.p(seeMoreMeasurable, isHorizontal, iR)));
            this.seeMoreMeasurable = seeMoreMeasurable instanceof dj7 ? (dj7) seeMoreMeasurable : null;
            this.seeMorePlaceable = null;
        }
        if (collapseMeasurable != null) {
            int iR2 = b0.r(collapseMeasurable, isHorizontal, kx1.k(jC));
            this.collapseSize = t06.a(t06.b(iR2, b0.p(collapseMeasurable, isHorizontal, iR2)));
            this.collapseMeasurable = collapseMeasurable instanceof dj7 ? (dj7) collapseMeasurable : null;
            this.collapsePlaceable = null;
        }
    }

    public String toString() {
        return "FlowLayoutOverflowState(type=" + this.type + ", minLinesToShowCollapse=" + this.minLinesToShowCollapse + ", minCrossAxisSizeToShowCollapse=" + this.minCrossAxisSizeToShowCollapse + ')';
    }
}
