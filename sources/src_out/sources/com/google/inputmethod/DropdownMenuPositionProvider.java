package com.google.inputmethod;

import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.m;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.google.android.rj3, reason: from toString */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\f\b\u0081\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u001a\b\u0002\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\f\u0010\rJ/\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010\u001bR)\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0014\u00102\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00104\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00101R\u0014\u00106\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00101R\u0014\u00108\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00101R\u0014\u0010<\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010>\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010;R\u0014\u0010@\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010;R\u0014\u0010B\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010;R\u0014\u0010D\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010;¨\u0006E"}, d2 = {"Lcom/google/android/rj3;", "Lcom/google/android/rg9;", "Lcom/google/android/if3;", "contentOffset", "Lcom/google/android/f43;", "density", "", "verticalMargin", "Lkotlin/Function2;", "Lcom/google/android/k16;", "", "onPositionCalculated", "<init>", "(JLcom/google/android/f43;ILkotlin/jvm/functions/Function2;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "anchorBounds", "Lcom/google/android/q16;", "windowSize", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "popupContentSize", "Lcom/google/android/g16;", "a", "(Lcom/google/android/k16;JLandroidx/compose/ui/unit/LayoutDirection;J)J", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getContentOffset-RKDOV3M", "()J", "b", "Lcom/google/android/f43;", "getDensity", "()Lcom/google/android/f43;", "c", "I", "getVerticalMargin", "d", "Lkotlin/jvm/functions/Function2;", "getOnPositionCalculated", "()Lkotlin/jvm/functions/Function2;", "Lcom/google/android/tq7$a;", "e", "Lcom/google/android/tq7$a;", "startToAnchorStart", "f", "endToAnchorEnd", "g", "leftToWindowLeft", "h", "rightToWindowRight", "Lcom/google/android/tq7$b;", "i", "Lcom/google/android/tq7$b;", "topToAnchorBottom", "j", "bottomToAnchorTop", "k", "centerToAnchorTop", "l", "topToWindowTop", "m", "bottomToWindowBottom", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DropdownMenuPositionProvider implements rg9 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final long contentOffset;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final f43 density;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final int verticalMargin;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final Function2<k16, k16, Unit> onPositionCalculated;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final tq7.a startToAnchorStart;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final tq7.a endToAnchorEnd;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final tq7.a leftToWindowLeft;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final tq7.a rightToWindowRight;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final tq7.b topToAnchorBottom;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final tq7.b bottomToAnchorTop;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final tq7.b centerToAnchorTop;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final tq7.b topToWindowTop;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final tq7.b bottomToWindowBottom;

    public /* synthetic */ DropdownMenuPositionProvider(long j, f43 f43Var, int i, Function2 function2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, f43Var, i, function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(k16 k16Var, k16 k16Var2) {
        return Unit.a;
    }

    @Override // com.google.inputmethod.rg9
    public long a(k16 anchorBounds, long windowSize, LayoutDirection layoutDirection, long popupContentSize) {
        k16 k16Var;
        long j;
        char c;
        int iA;
        int i;
        int i2;
        char c2 = ' ';
        int i3 = (int) (windowSize >> 32);
        List listS = m.s(new tq7.a[]{this.startToAnchorStart, this.endToAnchorEnd, g16.k(anchorBounds.i()) < i3 / 2 ? this.leftToWindowLeft : this.rightToWindowRight});
        int size = listS.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                k16Var = anchorBounds;
                j = windowSize;
                c = c2;
                iA = 0;
                break;
            }
            tq7.a aVar = (tq7.a) listS.get(i4);
            int i5 = (int) (popupContentSize >> c2);
            int i6 = size;
            c = c2;
            j = windowSize;
            int i7 = i4;
            k16Var = anchorBounds;
            iA = aVar.a(k16Var, j, i5, layoutDirection);
            if (i7 == m.r(listS) || (iA >= 0 && i5 + iA <= i3)) {
                break;
            }
            i4 = i7 + 1;
            size = i6;
            c2 = c;
        }
        int i8 = (int) (j & 4294967295L);
        List listS2 = m.s(new tq7.b[]{this.topToAnchorBottom, this.bottomToAnchorTop, this.centerToAnchorTop, g16.l(k16Var.i()) < i8 / 2 ? this.topToWindowTop : this.bottomToWindowBottom});
        int size2 = listS2.size();
        for (int i9 = 0; i9 < size2; i9++) {
            int i10 = (int) (popupContentSize & 4294967295L);
            int iA2 = ((tq7.b) listS2.get(i9)).a(k16Var, j, i10);
            if (i9 == m.r(listS2) || (iA2 >= (i2 = this.verticalMargin) && i10 + iA2 <= i8 - i2)) {
                i = iA2;
                long jF = g16.f((((long) iA) << c) | (((long) i) & 4294967295L));
                this.onPositionCalculated.invoke(k16Var, l16.b(jF, popupContentSize));
                return jF;
            }
        }
        i = 0;
        long jF2 = g16.f((((long) iA) << c) | (((long) i) & 4294967295L));
        this.onPositionCalculated.invoke(k16Var, l16.b(jF2, popupContentSize));
        return jF2;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DropdownMenuPositionProvider)) {
            return false;
        }
        DropdownMenuPositionProvider dropdownMenuPositionProvider = (DropdownMenuPositionProvider) other;
        return if3.e(this.contentOffset, dropdownMenuPositionProvider.contentOffset) && Intrinsics.e(this.density, dropdownMenuPositionProvider.density) && this.verticalMargin == dropdownMenuPositionProvider.verticalMargin && Intrinsics.e(this.onPositionCalculated, dropdownMenuPositionProvider.onPositionCalculated);
    }

    public int hashCode() {
        return (((((if3.h(this.contentOffset) * 31) + this.density.hashCode()) * 31) + Integer.hashCode(this.verticalMargin)) * 31) + this.onPositionCalculated.hashCode();
    }

    public String toString() {
        return "DropdownMenuPositionProvider(contentOffset=" + ((Object) if3.i(this.contentOffset)) + ", density=" + this.density + ", verticalMargin=" + this.verticalMargin + ", onPositionCalculated=" + this.onPositionCalculated + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    private DropdownMenuPositionProvider(long j, f43 f43Var, int i, Function2<? super k16, ? super k16, Unit> function2) {
        this.contentOffset = j;
        this.density = f43Var;
        this.verticalMargin = i;
        this.onPositionCalculated = function2;
        int iO1 = f43Var.O1(if3.f(j));
        tq7 tq7Var = tq7.a;
        this.startToAnchorStart = tq7Var.k(iO1);
        this.endToAnchorEnd = tq7Var.e(iO1);
        this.leftToWindowLeft = tq7Var.g(0);
        this.rightToWindowRight = tq7Var.i(0);
        int iO2 = f43Var.O1(if3.g(j));
        this.topToAnchorBottom = tq7Var.m(iO2);
        this.bottomToAnchorTop = tq7Var.a(iO2);
        this.centerToAnchorTop = tq7Var.d(iO2);
        this.topToWindowTop = tq7Var.o(i);
        this.bottomToWindowBottom = tq7Var.c(i);
    }

    public /* synthetic */ DropdownMenuPositionProvider(long j, f43 f43Var, int i, Function2 function2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, f43Var, (i2 & 4) != 0 ? f43Var.O1(qq7.n()) : i, (i2 & 8) != 0 ? new Function2() { // from class: com.google.android.qj3
            public final Object invoke(Object obj, Object obj2) {
                return DropdownMenuPositionProvider.c((k16) obj, (k16) obj2);
            }
        } : function2, null);
    }
}
