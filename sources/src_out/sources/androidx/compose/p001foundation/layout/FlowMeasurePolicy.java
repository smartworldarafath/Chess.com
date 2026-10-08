package androidx.compose.p001foundation.layout;

import androidx.compose.ui.layout.j;
import androidx.compose.ui.layout.o;
import com.google.inputmethod.bu8;
import com.google.inputmethod.dj7;
import com.google.inputmethod.f66;
import com.google.inputmethod.ff3;
import com.google.inputmethod.fj7;
import com.google.inputmethod.h66;
import com.google.inputmethod.kx1;
import com.google.inputmethod.nx1;
import com.google.inputmethod.r28;
import com.google.inputmethod.t06;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.f;
import kotlin.collections.m;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.g0, reason: from toString */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u001a\b\u0082\b\u0018\u00002\u00020\u00012\u00020\u0002BO\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J/\u0010\u001e\u001a\u00020\u001b*\u00020\u00152\u0012\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u00162\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ/\u0010\"\u001a\u00020\u000e*\u00020\u001f2\u0012\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u00160\u00162\u0006\u0010!\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\"\u0010#J/\u0010%\u001a\u00020\u000e*\u00020\u001f2\u0012\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u00160\u00162\u0006\u0010$\u001a\u00020\u000eH\u0016¢\u0006\u0004\b%\u0010#J/\u0010&\u001a\u00020\u000e*\u00020\u001f2\u0012\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u00160\u00162\u0006\u0010$\u001a\u00020\u000eH\u0016¢\u0006\u0004\b&\u0010#J/\u0010'\u001a\u00020\u000e*\u00020\u001f2\u0012\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u00160\u00162\u0006\u0010!\u001a\u00020\u000eH\u0016¢\u0006\u0004\b'\u0010#JK\u0010*\u001a\u00020\u000e2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020 0\u00162\u0006\u0010(\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b*\u0010+J+\u0010-\u001a\u00020\u000e2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020 0\u00162\u0006\u0010!\u001a\u00020\u000e2\u0006\u0010,\u001a\u00020\u000e¢\u0006\u0004\b-\u0010.JK\u00100\u001a\u00020\u000e2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020 0\u00162\u0006\u0010/\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b0\u0010+J\u0019\u00102\u001a\u00020\u000e*\u00020 2\u0006\u00101\u001a\u00020\u000e¢\u0006\u0004\b2\u00103J\u0019\u00104\u001a\u00020\u000e*\u00020 2\u0006\u00101\u001a\u00020\u000e¢\u0006\u0004\b4\u00103J\u0019\u00105\u001a\u00020\u000e*\u00020 2\u0006\u00101\u001a\u00020\u000e¢\u0006\u0004\b5\u00103J\u0010\u00107\u001a\u000206HÖ\u0001¢\u0006\u0004\b7\u00108J\u0010\u00109\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b9\u0010:J\u001a\u0010=\u001a\u00020\u00032\b\u0010<\u001a\u0004\u0018\u00010;HÖ\u0003¢\u0006\u0004\b=\u0010>R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010KR\u001a\u0010\f\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010OR\u0014\u0010\r\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010KR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010QR\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010QR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010T¨\u0006U"}, d2 = {"Landroidx/compose/foundation/layout/g0;", "Lcom/google/android/r28;", "Landroidx/compose/foundation/layout/d0;", "", "isHorizontal", "Landroidx/compose/foundation/layout/c$e;", "horizontalArrangement", "Landroidx/compose/foundation/layout/c$n;", "verticalArrangement", "Lcom/google/android/ff3;", "mainAxisSpacing", "Landroidx/compose/foundation/layout/s;", "crossAxisAlignment", "crossAxisArrangementSpacing", "", "maxItemsInMainAxis", "maxLines", "Landroidx/compose/foundation/layout/c0;", "overflow", "<init>", "(ZLandroidx/compose/foundation/layout/c$e;Landroidx/compose/foundation/layout/c$n;FLandroidx/compose/foundation/layout/s;FIILandroidx/compose/foundation/layout/c0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/layout/j;", "", "Lcom/google/android/dj7;", "measurables", "Lcom/google/android/kx1;", "constraints", "Lcom/google/android/fj7;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/j;Ljava/util/List;J)Lcom/google/android/fj7;", "measure", "Lcom/google/android/h66;", "Lcom/google/android/f66;", "height", "minIntrinsicWidth", "(Lcom/google/android/h66;Ljava/util/List;I)I", "width", "minIntrinsicHeight", "maxIntrinsicHeight", "maxIntrinsicWidth", "crossAxisAvailable", "crossAxisSpacing", "v", "(Ljava/util/List;IIIIILandroidx/compose/foundation/layout/c0;)I", "arrangementSpacing", "o", "(Ljava/util/List;II)I", "mainAxisAvailable", "m", "size", "r", "(Lcom/google/android/f66;I)I", "u", "w", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "d", "()Z", "b", "Landroidx/compose/foundation/layout/c$e;", "q", "()Landroidx/compose/foundation/layout/c$e;", "c", "Landroidx/compose/foundation/layout/c$n;", "l", "()Landroidx/compose/foundation/layout/c$n;", "F", "e", "Landroidx/compose/foundation/layout/s;", "g", "()Landroidx/compose/foundation/layout/s;", "f", "I", "h", "i", "Landroidx/compose/foundation/layout/c0;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
final /* data */ class FlowMeasurePolicy implements r28, d0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final boolean isHorizontal;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final c.e horizontalArrangement;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final c.n verticalArrangement;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final float mainAxisSpacing;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    private final s crossAxisAlignment;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    private final float crossAxisArrangementSpacing;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    private final int maxItemsInMainAxis;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    private final int maxLines;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
    private final FlowLayoutOverflowState overflow;

    public /* synthetic */ FlowMeasurePolicy(boolean z, c.e eVar, c.n nVar, float f, s sVar, float f2, int i, int i2, FlowLayoutOverflowState flowLayoutOverflowState, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, eVar, nVar, f, sVar, f2, i, i2, flowLayoutOverflowState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s(o.a aVar) {
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(o.a aVar) {
        return Unit.a;
    }

    @Override // androidx.compose.p001foundation.layout.d0
    /* JADX INFO: renamed from: d, reason: from getter */
    public boolean getIsHorizontal() {
        return this.isHorizontal;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FlowMeasurePolicy)) {
            return false;
        }
        FlowMeasurePolicy flowMeasurePolicy = (FlowMeasurePolicy) other;
        return this.isHorizontal == flowMeasurePolicy.isHorizontal && Intrinsics.e(this.horizontalArrangement, flowMeasurePolicy.horizontalArrangement) && Intrinsics.e(this.verticalArrangement, flowMeasurePolicy.verticalArrangement) && ff3.k(this.mainAxisSpacing, flowMeasurePolicy.mainAxisSpacing) && Intrinsics.e(this.crossAxisAlignment, flowMeasurePolicy.crossAxisAlignment) && ff3.k(this.crossAxisArrangementSpacing, flowMeasurePolicy.crossAxisArrangementSpacing) && this.maxItemsInMainAxis == flowMeasurePolicy.maxItemsInMainAxis && this.maxLines == flowMeasurePolicy.maxLines && Intrinsics.e(this.overflow, flowMeasurePolicy.overflow);
    }

    @Override // androidx.compose.p001foundation.layout.d0
    /* JADX INFO: renamed from: g, reason: from getter */
    public s getCrossAxisAlignment() {
        return this.crossAxisAlignment;
    }

    public int hashCode() {
        return (((((((((((((((Boolean.hashCode(this.isHorizontal) * 31) + this.horizontalArrangement.hashCode()) * 31) + this.verticalArrangement.hashCode()) * 31) + ff3.l(this.mainAxisSpacing)) * 31) + this.crossAxisAlignment.hashCode()) * 31) + ff3.l(this.crossAxisArrangementSpacing)) * 31) + Integer.hashCode(this.maxItemsInMainAxis)) * 31) + Integer.hashCode(this.maxLines)) * 31) + this.overflow.hashCode();
    }

    @Override // androidx.compose.p001foundation.layout.d0
    /* JADX INFO: renamed from: l, reason: from getter */
    public c.n getVerticalArrangement() {
        return this.verticalArrangement;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final int m(List<? extends f66> measurables, int mainAxisAvailable, int mainAxisSpacing, int crossAxisSpacing, int maxItemsInMainAxis, int maxLines, FlowLayoutOverflowState overflow) throws NoWhenBranchMatchedException {
        long jB;
        int i = 0;
        if (measurables.isEmpty()) {
            jB = t06.b(0, 0);
        } else {
            a0 a0Var = new a0(maxItemsInMainAxis, overflow, bu8.a(0, mainAxisAvailable, 0, Integer.MAX_VALUE), maxLines, mainAxisSpacing, crossAxisSpacing, null);
            f66 f66Var = (f66) m.C0(measurables, 0);
            int iU = f66Var != null ? u(f66Var, mainAxisAvailable) : 0;
            int iW = f66Var != null ? w(f66Var, iU) : 0;
            int i2 = 0;
            if (a0Var.b(measurables.size() > 1, 0, t06.b(mainAxisAvailable, Integer.MAX_VALUE), f66Var == null ? null : t06.a(t06.b(iW, iU)), 0, 0, 0, false, false).getIsLastItemInContainer()) {
                t06 t06VarD = overflow.d(f66Var != null, 0, 0);
                jB = t06.b(t06VarD != null ? t06.f(t06VarD.getPackedValue()) : 0, 0);
            } else {
                int size = measurables.size();
                int i3 = mainAxisAvailable;
                int i4 = 0;
                int i5 = 0;
                int i6 = 0;
                int i7 = 0;
                int i8 = 0;
                while (i4 < size) {
                    int i9 = i3 - iW;
                    int i10 = i4 + 1;
                    int iMax = Math.max(i8, iU);
                    f66 f66Var2 = (f66) m.C0(measurables, i10);
                    int iU2 = f66Var2 != null ? u(f66Var2, mainAxisAvailable) : i;
                    int iW2 = f66Var2 != null ? w(f66Var2, iU2) + mainAxisSpacing : i;
                    boolean z = i4 + 2 < measurables.size();
                    int i11 = i10 - i6;
                    int i12 = i7;
                    int i13 = iW2;
                    int i14 = iU2;
                    a0.b bVarB = a0Var.b(z, i11, t06.b(i9, Integer.MAX_VALUE), f66Var2 == null ? null : t06.a(t06.b(iW2, iU2)), i12, i2, iMax, false, false);
                    if (bVarB.getIsLastItemInLine()) {
                        int iF = i2 + iMax + crossAxisSpacing;
                        a0.a aVarA = a0Var.a(bVarB, f66Var2 != null, i12, iF, i9, i11);
                        int i15 = i13 - mainAxisSpacing;
                        i7 = i12 + 1;
                        if (bVarB.getIsLastItemInContainer()) {
                            if (aVarA != null) {
                                long ellipsisSize = aVarA.getEllipsisSize();
                                if (!aVarA.getPlaceEllipsisOnLastContentLine()) {
                                    iF += t06.f(ellipsisSize) + crossAxisSpacing;
                                }
                            }
                            i2 = iF;
                            i5 = i10;
                            break;
                        }
                        i2 = iF;
                        iW = i15;
                        i6 = i10;
                        i8 = 0;
                        i3 = mainAxisAvailable;
                    } else {
                        i3 = i9;
                        i7 = i12;
                        i8 = iMax;
                        iW = i13;
                    }
                    iU = i14;
                    i4 = i10;
                    i5 = i4;
                    i = 0;
                }
                jB = t06.b(i2 - crossAxisSpacing, i5);
            }
        }
        return t06.e(jB);
    }

    @Override // com.google.inputmethod.r28
    public int maxIntrinsicHeight(h66 h66Var, List<? extends List<? extends f66>> list, int i) {
        FlowLayoutOverflowState flowLayoutOverflowState = this.overflow;
        List list2 = (List) m.C0(list, 1);
        f66 f66Var = list2 != null ? (f66) m.B0(list2) : null;
        List list3 = (List) m.C0(list, 2);
        flowLayoutOverflowState.k(f66Var, list3 != null ? (f66) m.B0(list3) : null, getIsHorizontal(), nx1.b(0, i, 0, 0, 13, null));
        if (getIsHorizontal()) {
            List<? extends f66> listP = (List) m.B0(list);
            if (listP == null) {
                listP = m.p();
            }
            return m(listP, i, h66Var.O1(this.mainAxisSpacing), h66Var.O1(this.crossAxisArrangementSpacing), this.maxItemsInMainAxis, this.maxLines, this.overflow);
        }
        List<? extends f66> listP2 = (List) m.B0(list);
        if (listP2 == null) {
            listP2 = m.p();
        }
        return o(listP2, i, h66Var.O1(this.mainAxisSpacing));
    }

    @Override // com.google.inputmethod.r28
    public int maxIntrinsicWidth(h66 h66Var, List<? extends List<? extends f66>> list, int i) {
        FlowLayoutOverflowState flowLayoutOverflowState = this.overflow;
        List list2 = (List) m.C0(list, 1);
        f66 f66Var = list2 != null ? (f66) m.B0(list2) : null;
        List list3 = (List) m.C0(list, 2);
        flowLayoutOverflowState.k(f66Var, list3 != null ? (f66) m.B0(list3) : null, getIsHorizontal(), nx1.b(0, 0, 0, i, 7, null));
        if (getIsHorizontal()) {
            List<? extends f66> listP = (List) m.B0(list);
            if (listP == null) {
                listP = m.p();
            }
            return o(listP, i, h66Var.O1(this.mainAxisSpacing));
        }
        List<? extends f66> listP2 = (List) m.B0(list);
        if (listP2 == null) {
            listP2 = m.p();
        }
        return m(listP2, i, h66Var.O1(this.mainAxisSpacing), h66Var.O1(this.crossAxisArrangementSpacing), this.maxItemsInMainAxis, this.maxLines, this.overflow);
    }

    @Override // com.google.inputmethod.r28
    /* JADX INFO: renamed from: measure-3p2s80s, reason: not valid java name */
    public fj7 mo4measure3p2s80s(j jVar, List<? extends List<? extends dj7>> list, long j) {
        if (this.maxLines == 0 || this.maxItemsInMainAxis == 0 || list.isEmpty() || (kx1.k(j) == 0 && this.overflow.getType() != FlowLayoutOverflow.OverflowType.Visible)) {
            return j.Q1(jVar, 0, 0, null, new Function1() { // from class: androidx.compose.foundation.layout.e0
                public final Object invoke(Object obj) {
                    return FlowMeasurePolicy.s((o.a) obj);
                }
            }, 4, null);
        }
        List list2 = (List) m.z0(list);
        if (list2.isEmpty()) {
            return j.Q1(jVar, 0, 0, null, new Function1() { // from class: androidx.compose.foundation.layout.f0
                public final Object invoke(Object obj) {
                    return FlowMeasurePolicy.t((o.a) obj);
                }
            }, 4, null);
        }
        List list3 = (List) m.C0(list, 1);
        dj7 dj7Var = list3 != null ? (dj7) m.B0(list3) : null;
        List list4 = (List) m.C0(list, 2);
        dj7 dj7Var2 = list4 != null ? (dj7) m.B0(list4) : null;
        this.overflow.h(list2.size());
        this.overflow.j(this, dj7Var, dj7Var2, j);
        return b0.m(jVar, this, list2.iterator(), this.mainAxisSpacing, this.crossAxisArrangementSpacing, bu8.c(j, getIsHorizontal() ? LayoutOrientation.Horizontal : LayoutOrientation.Vertical), this.maxItemsInMainAxis, this.maxLines, this.overflow);
    }

    @Override // com.google.inputmethod.r28
    public int minIntrinsicHeight(h66 h66Var, List<? extends List<? extends f66>> list, int i) {
        FlowLayoutOverflowState flowLayoutOverflowState = this.overflow;
        List list2 = (List) m.C0(list, 1);
        f66 f66Var = list2 != null ? (f66) m.B0(list2) : null;
        List list3 = (List) m.C0(list, 2);
        flowLayoutOverflowState.k(f66Var, list3 != null ? (f66) m.B0(list3) : null, getIsHorizontal(), nx1.b(0, i, 0, 0, 13, null));
        if (getIsHorizontal()) {
            List<? extends f66> listP = (List) m.B0(list);
            if (listP == null) {
                listP = m.p();
            }
            return m(listP, i, h66Var.O1(this.mainAxisSpacing), h66Var.O1(this.crossAxisArrangementSpacing), this.maxItemsInMainAxis, this.maxLines, this.overflow);
        }
        List<? extends f66> listP2 = (List) m.B0(list);
        if (listP2 == null) {
            listP2 = m.p();
        }
        return v(listP2, i, h66Var.O1(this.mainAxisSpacing), h66Var.O1(this.crossAxisArrangementSpacing), this.maxItemsInMainAxis, this.maxLines, this.overflow);
    }

    @Override // com.google.inputmethod.r28
    public int minIntrinsicWidth(h66 h66Var, List<? extends List<? extends f66>> list, int i) {
        FlowLayoutOverflowState flowLayoutOverflowState = this.overflow;
        List list2 = (List) m.C0(list, 1);
        f66 f66Var = list2 != null ? (f66) m.B0(list2) : null;
        List list3 = (List) m.C0(list, 2);
        flowLayoutOverflowState.k(f66Var, list3 != null ? (f66) m.B0(list3) : null, getIsHorizontal(), nx1.b(0, 0, 0, i, 7, null));
        if (getIsHorizontal()) {
            List<? extends f66> listP = (List) m.B0(list);
            if (listP == null) {
                listP = m.p();
            }
            return v(listP, i, h66Var.O1(this.mainAxisSpacing), h66Var.O1(this.crossAxisArrangementSpacing), this.maxItemsInMainAxis, this.maxLines, this.overflow);
        }
        List<? extends f66> listP2 = (List) m.B0(list);
        if (listP2 == null) {
            listP2 = m.p();
        }
        return m(listP2, i, h66Var.O1(this.mainAxisSpacing), h66Var.O1(this.crossAxisArrangementSpacing), this.maxItemsInMainAxis, this.maxLines, this.overflow);
    }

    public final int o(List<? extends f66> measurables, int height, int arrangementSpacing) {
        int i = this.maxItemsInMainAxis;
        int size = measurables.size();
        int i2 = 0;
        int iMax = 0;
        int i3 = 0;
        int i4 = 0;
        while (i2 < size) {
            int iR = r(measurables.get(i2), height) + arrangementSpacing;
            int i5 = i2 + 1;
            if (i5 - i3 == i || i5 == measurables.size()) {
                iMax = Math.max(iMax, (i4 + iR) - arrangementSpacing);
                i4 = 0;
                i3 = i2;
            } else {
                i4 += iR;
            }
            i2 = i5;
        }
        return iMax;
    }

    @Override // androidx.compose.p001foundation.layout.d0
    /* JADX INFO: renamed from: q, reason: from getter */
    public c.e getHorizontalArrangement() {
        return this.horizontalArrangement;
    }

    public final int r(f66 f66Var, int i) {
        return getIsHorizontal() ? f66Var.q0(i) : f66Var.W(i);
    }

    public String toString() {
        return "FlowMeasurePolicy(isHorizontal=" + this.isHorizontal + ", horizontalArrangement=" + this.horizontalArrangement + ", verticalArrangement=" + this.verticalArrangement + ", mainAxisSpacing=" + ((Object) ff3.m(this.mainAxisSpacing)) + ", crossAxisAlignment=" + this.crossAxisAlignment + ", crossAxisArrangementSpacing=" + ((Object) ff3.m(this.crossAxisArrangementSpacing)) + ", maxItemsInMainAxis=" + this.maxItemsInMainAxis + ", maxLines=" + this.maxLines + ", overflow=" + this.overflow + ')';
    }

    public final int u(f66 f66Var, int i) {
        return getIsHorizontal() ? f66Var.d0(i) : f66Var.o0(i);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final int v(List<? extends f66> measurables, int crossAxisAvailable, int mainAxisSpacing, int crossAxisSpacing, int maxItemsInMainAxis, int maxLines, FlowLayoutOverflowState overflow) throws NoWhenBranchMatchedException {
        int i = maxItemsInMainAxis;
        int i2 = maxLines;
        if (measurables.isEmpty()) {
            return 0;
        }
        int size = measurables.size();
        int[] iArr = new int[size];
        int size2 = measurables.size();
        int[] iArr2 = new int[size2];
        int size3 = measurables.size();
        for (int i3 = 0; i3 < size3; i3++) {
            f66 f66Var = measurables.get(i3);
            int iW = w(f66Var, crossAxisAvailable);
            iArr[i3] = iW;
            iArr2[i3] = u(f66Var, iW);
        }
        List<? extends f66> list = measurables;
        int i4 = Integer.MAX_VALUE;
        if (i2 != Integer.MAX_VALUE && i != Integer.MAX_VALUE) {
            i4 = i * i2;
        }
        int i5 = 1;
        int iMin = Math.min(i4 - (((i4 >= list.size() || !(overflow.getType() == FlowLayoutOverflow.OverflowType.ExpandIndicator || overflow.getType() == FlowLayoutOverflow.OverflowType.ExpandOrCollapseIndicator)) && (i4 < list.size() || i2 < overflow.getMinLinesToShowCollapse() || overflow.getType() != FlowLayoutOverflow.OverflowType.ExpandOrCollapseIndicator)) ? 0 : 1), list.size());
        int iK1 = f.k1(iArr) + ((list.size() - 1) * mainAxisSpacing);
        if (size2 == 0) {
            throw new NoSuchElementException();
        }
        int i6 = iArr2[0];
        int iV0 = f.v0(iArr2);
        if (1 <= iV0) {
            int i7 = 1;
            while (true) {
                int i8 = iArr2[i7];
                if (i6 < i8) {
                    i6 = i8;
                }
                if (i7 == iV0) {
                    break;
                }
                i7++;
            }
        }
        if (size == 0) {
            throw new NoSuchElementException();
        }
        int i9 = iArr[0];
        int iV1 = f.v0(iArr);
        if (1 <= iV1) {
            while (true) {
                int i10 = iArr[i5];
                if (i9 < i10) {
                    i9 = i10;
                }
                if (i5 == iV1) {
                    break;
                }
                i5++;
            }
        }
        int i11 = i9;
        int i12 = iK1;
        while (i11 <= i12 && i6 != crossAxisAvailable) {
            int i13 = (i11 + i12) / 2;
            long jQ = b0.q(list, iArr, iArr2, i13, mainAxisSpacing, crossAxisSpacing, i, i2, overflow);
            int iE = t06.e(jQ);
            int iF = t06.f(jQ);
            if (iE > crossAxisAvailable || iF < iMin) {
                i11 = i13 + 1;
                if (i11 > i12) {
                    return i11;
                }
            } else {
                if (iE >= crossAxisAvailable) {
                    return i13;
                }
                i12 = i13 - 1;
            }
            list = measurables;
            i = maxItemsInMainAxis;
            i2 = maxLines;
            iK1 = i13;
            i6 = iE;
        }
        return iK1;
    }

    public final int w(f66 f66Var, int i) {
        return getIsHorizontal() ? f66Var.o0(i) : f66Var.d0(i);
    }

    private FlowMeasurePolicy(boolean z, c.e eVar, c.n nVar, float f, s sVar, float f2, int i, int i2, FlowLayoutOverflowState flowLayoutOverflowState) {
        this.isHorizontal = z;
        this.horizontalArrangement = eVar;
        this.verticalArrangement = nVar;
        this.mainAxisSpacing = f;
        this.crossAxisAlignment = sVar;
        this.crossAxisArrangementSpacing = f2;
        this.maxItemsInMainAxis = i;
        this.maxLines = i2;
        this.overflow = flowLayoutOverflowState;
    }
}
