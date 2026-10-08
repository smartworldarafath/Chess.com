package androidx.compose.p001foundation.layout;

import androidx.compose.p001foundation.layout.ColumnMeasurePolicy;
import androidx.compose.ui.layout.j;
import androidx.compose.ui.layout.o;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.inputmethod.RowColumnParentData;
import com.google.inputmethod.cra;
import com.google.inputmethod.dj7;
import com.google.inputmethod.dra;
import com.google.inputmethod.ej7;
import com.google.inputmethod.era;
import com.google.inputmethod.f66;
import com.google.inputmethod.fj7;
import com.google.inputmethod.g66;
import com.google.inputmethod.h66;
import com.google.inputmethod.kx1;
import com.google.inputmethod.tc;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.p, reason: from toString */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ9\u0010\u0012\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\r*\u00020\tH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\r*\u00020\tH\u0016¢\u0006\u0004\b\u0016\u0010\u0015J/\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJi\u0010'\u001a\u00020&2\u000e\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0 2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\"\u001a\u0004\u0018\u00010\u00182\u0006\u0010#\u001a\u00020\r2\u0006\u0010$\u001a\u00020\r2\u0006\u0010%\u001a\u00020\rH\u0016¢\u0006\u0004\b'\u0010(J7\u00100\u001a\u00020/2\u0006\u0010)\u001a\u00020\r2\u0006\u0010*\u001a\u00020\r2\u0006\u0010+\u001a\u00020\r2\u0006\u0010,\u001a\u00020\r2\u0006\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b0\u00101J)\u00108\u001a\u00020&*\u00020\u001b2\f\u00104\u001a\b\u0012\u0004\u0012\u000203022\u0006\u00105\u001a\u00020/H\u0016¢\u0006\u0004\b6\u00107J)\u0010<\u001a\u00020\r*\u0002092\f\u00104\u001a\b\u0012\u0004\u0012\u00020:022\u0006\u0010;\u001a\u00020\rH\u0016¢\u0006\u0004\b<\u0010=J)\u0010?\u001a\u00020\r*\u0002092\f\u00104\u001a\b\u0012\u0004\u0012\u00020:022\u0006\u0010>\u001a\u00020\rH\u0016¢\u0006\u0004\b?\u0010=J)\u0010@\u001a\u00020\r*\u0002092\f\u00104\u001a\b\u0012\u0004\u0012\u00020:022\u0006\u0010;\u001a\u00020\rH\u0016¢\u0006\u0004\b@\u0010=J)\u0010A\u001a\u00020\r*\u0002092\f\u00104\u001a\b\u0012\u0004\u0012\u00020:022\u0006\u0010>\u001a\u00020\rH\u0016¢\u0006\u0004\bA\u0010=J\u0010\u0010C\u001a\u00020BHÖ\u0001¢\u0006\u0004\bC\u0010DJ\u0010\u0010E\u001a\u00020\rHÖ\u0001¢\u0006\u0004\bE\u0010FJ\u001a\u0010I\u001a\u00020-2\b\u0010H\u001a\u0004\u0018\u00010GHÖ\u0003¢\u0006\u0004\bI\u0010JR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010KR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010L¨\u0006M"}, d2 = {"Landroidx/compose/foundation/layout/p;", "Lcom/google/android/ej7;", "Lcom/google/android/dra;", "Landroidx/compose/foundation/layout/c$n;", "verticalArrangement", "Lcom/google/android/tc$b;", "horizontalAlignment", "<init>", "(Landroidx/compose/foundation/layout/c$n;Lcom/google/android/tc$b;)V", "Landroidx/compose/ui/layout/o;", "placeable", "Lcom/google/android/fra;", "parentData", "", "crossAxisLayoutSize", "beforeCrossAxisAlignmentLine", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "s", "(Landroidx/compose/ui/layout/o;Lcom/google/android/fra;IILandroidx/compose/ui/unit/LayoutDirection;)I", "f", "(Landroidx/compose/ui/layout/o;)I", "c", "mainAxisLayoutSize", "", "childrenMainAxisSize", "mainAxisPositions", "Landroidx/compose/ui/layout/j;", "measureScope", "", "b", "(I[I[ILandroidx/compose/ui/layout/j;)V", "", "placeables", "crossAxisOffset", "currentLineIndex", "startIndex", "endIndex", "Lcom/google/android/fj7;", "e", "([Landroidx/compose/ui/layout/o;Landroidx/compose/ui/layout/j;I[III[IIII)Lcom/google/android/fj7;", "mainAxisMin", "crossAxisMin", "mainAxisMax", "crossAxisMax", "", "isPrioritizing", "Lcom/google/android/kx1;", "a", "(IIIIZ)J", "", "Lcom/google/android/dj7;", "measurables", "constraints", "measure-3p2s80s", "(Landroidx/compose/ui/layout/j;Ljava/util/List;J)Lcom/google/android/fj7;", "measure", "Lcom/google/android/h66;", "Lcom/google/android/f66;", "height", "minIntrinsicWidth", "(Lcom/google/android/h66;Ljava/util/List;I)I", "width", "minIntrinsicHeight", "maxIntrinsicWidth", "maxIntrinsicHeight", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Landroidx/compose/foundation/layout/c$n;", "Lcom/google/android/tc$b;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ColumnMeasurePolicy implements ej7, dra {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final c.n verticalArrangement;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final tc.b horizontalAlignment;

    public ColumnMeasurePolicy(c.n nVar, tc.b bVar) {
        this.verticalArrangement = nVar;
        this.horizontalAlignment = bVar;
    }

    private final int s(o placeable, RowColumnParentData parentData, int crossAxisLayoutSize, int beforeCrossAxisAlignmentLine, LayoutDirection layoutDirection) {
        s crossAxisAlignment = parentData != null ? parentData.getCrossAxisAlignment() : null;
        return crossAxisAlignment != null ? crossAxisAlignment.a(crossAxisLayoutSize, c(placeable), layoutDirection, placeable, beforeCrossAxisAlignmentLine) : this.horizontalAlignment.a(c(placeable), crossAxisLayoutSize, layoutDirection);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(o[] oVarArr, ColumnMeasurePolicy columnMeasurePolicy, int i, int i2, j jVar, int[] iArr, o.a aVar) {
        int length = oVarArr.length;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            o oVar = oVarArr[i3];
            Intrinsics.g(oVar);
            o.a.z(aVar, oVar, columnMeasurePolicy.s(oVar, cra.c(oVar), i, i2, jVar.getLayoutDirection()), iArr[i4], 0.0f, 4, null);
            i3++;
            i4++;
        }
        return Unit.a;
    }

    @Override // com.google.inputmethod.dra
    public long a(int mainAxisMin, int crossAxisMin, int mainAxisMax, int crossAxisMax, boolean isPrioritizing) {
        return o.b(isPrioritizing, mainAxisMin, crossAxisMin, mainAxisMax, crossAxisMax);
    }

    @Override // com.google.inputmethod.dra
    public void b(int mainAxisLayoutSize, int[] childrenMainAxisSize, int[] mainAxisPositions, j measureScope) {
        this.verticalArrangement.arrange(measureScope, mainAxisLayoutSize, childrenMainAxisSize, mainAxisPositions);
    }

    @Override // com.google.inputmethod.dra
    public int c(o oVar) {
        return oVar.getWidth();
    }

    @Override // com.google.inputmethod.dra
    public fj7 e(final o[] placeables, final j measureScope, final int beforeCrossAxisAlignmentLine, final int[] mainAxisPositions, int mainAxisLayoutSize, final int crossAxisLayoutSize, int[] crossAxisOffset, int currentLineIndex, int startIndex, int endIndex) {
        return j.Q1(measureScope, crossAxisLayoutSize, mainAxisLayoutSize, null, new Function1() { // from class: com.google.android.wj1
            public final Object invoke(Object obj) {
                return ColumnMeasurePolicy.t(placeables, this, crossAxisLayoutSize, beforeCrossAxisAlignmentLine, measureScope, mainAxisPositions, (o.a) obj);
            }
        }, 4, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ColumnMeasurePolicy)) {
            return false;
        }
        ColumnMeasurePolicy columnMeasurePolicy = (ColumnMeasurePolicy) other;
        return Intrinsics.e(this.verticalArrangement, columnMeasurePolicy.verticalArrangement) && Intrinsics.e(this.horizontalAlignment, columnMeasurePolicy.horizontalAlignment);
    }

    @Override // com.google.inputmethod.dra
    public int f(o oVar) {
        return oVar.getHeight();
    }

    public int hashCode() {
        return (this.verticalArrangement.hashCode() * 31) + this.horizontalAlignment.hashCode();
    }

    @Override // com.google.inputmethod.ej7
    public int maxIntrinsicHeight(h66 h66Var, List<? extends f66> list, int i) {
        return g66.a.e(list, i, h66Var.O1(this.verticalArrangement.getSpacing()));
    }

    @Override // com.google.inputmethod.ej7
    public int maxIntrinsicWidth(h66 h66Var, List<? extends f66> list, int i) {
        return g66.a.f(list, i, h66Var.O1(this.verticalArrangement.getSpacing()));
    }

    @Override // com.google.inputmethod.ej7
    /* JADX INFO: renamed from: measure-3p2s80s */
    public fj7 mo0measure3p2s80s(j jVar, List<? extends dj7> list, long j) {
        return era.a(this, kx1.m(j), kx1.n(j), kx1.k(j), kx1.l(j), jVar.O1(this.verticalArrangement.getSpacing()), jVar, list, new o[list.size()], 0, list.size(), (3072 & 1024) != 0 ? null : null, (3072 & 2048) != 0 ? 0 : 0);
    }

    @Override // com.google.inputmethod.ej7
    public int minIntrinsicHeight(h66 h66Var, List<? extends f66> list, int i) {
        return g66.a.g(list, i, h66Var.O1(this.verticalArrangement.getSpacing()));
    }

    @Override // com.google.inputmethod.ej7
    public int minIntrinsicWidth(h66 h66Var, List<? extends f66> list, int i) {
        return g66.a.h(list, i, h66Var.O1(this.verticalArrangement.getSpacing()));
    }

    public String toString() {
        return "ColumnMeasurePolicy(verticalArrangement=" + this.verticalArrangement + ", horizontalAlignment=" + this.horizontalAlignment + ')';
    }
}
