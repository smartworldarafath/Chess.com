package com.google.inputmethod;

import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.m;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\u001a\b\u0002\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00070\n¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010\u001c\u001a\u0004\b$\u0010\u001eR)\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00070\n8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0014\u0010,\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010.\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010+R\u0014\u00100\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010+R\u0014\u00102\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010+R\u0014\u00106\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00108\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00105R\u0014\u0010:\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u00105R\u0014\u0010<\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u00105¨\u0006="}, d2 = {"Lcom/google/android/j14;", "Lcom/google/android/rg9;", "Lcom/google/android/f43;", "density", "", "topWindowInsets", "Lcom/google/android/q6c;", "", "keyboardSignalState", "verticalMargin", "Lkotlin/Function2;", "Lcom/google/android/k16;", "onPositionCalculated", "<init>", "(Lcom/google/android/f43;ILcom/google/android/q6c;ILkotlin/jvm/functions/Function2;)V", "anchorBounds", "Lcom/google/android/q16;", "windowSize", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "popupContentSize", "Lcom/google/android/g16;", "a", "(Lcom/google/android/k16;JLandroidx/compose/ui/unit/LayoutDirection;J)J", "Lcom/google/android/f43;", "getDensity", "()Lcom/google/android/f43;", "b", "I", "getTopWindowInsets", "()I", "c", "Lcom/google/android/q6c;", "getKeyboardSignalState", "()Lcom/google/android/q6c;", "d", "getVerticalMargin", "e", "Lkotlin/jvm/functions/Function2;", "getOnPositionCalculated", "()Lkotlin/jvm/functions/Function2;", "Lcom/google/android/tq7$a;", "f", "Lcom/google/android/tq7$a;", "startToAnchorStart", "g", "endToAnchorEnd", "h", "leftToWindowLeft", "i", "rightToWindowRight", "Lcom/google/android/tq7$b;", "j", "Lcom/google/android/tq7$b;", "topToAnchorBottom", "k", "bottomToAnchorTop", "l", "topToWindowTop", "m", "bottomToWindowBottom", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class j14 implements rg9 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final f43 density;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int topWindowInsets;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final q6c<Unit> keyboardSignalState;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final int verticalMargin;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final Function2<k16, k16, Unit> onPositionCalculated;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final tq7.a startToAnchorStart;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final tq7.a endToAnchorEnd;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final tq7.a leftToWindowLeft;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final tq7.a rightToWindowRight;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final tq7.b topToAnchorBottom;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final tq7.b bottomToAnchorTop;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final tq7.b topToWindowTop;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final tq7.b bottomToWindowBottom;

    /* JADX WARN: Multi-variable type inference failed */
    public j14(f43 f43Var, int i, q6c<Unit> q6cVar, int i2, Function2<? super k16, ? super k16, Unit> function2) {
        this.density = f43Var;
        this.topWindowInsets = i;
        this.keyboardSignalState = q6cVar;
        this.verticalMargin = i2;
        this.onPositionCalculated = function2;
        tq7 tq7Var = tq7.a;
        this.startToAnchorStart = tq7.l(tq7Var, 0, 1, null);
        this.endToAnchorEnd = tq7.f(tq7Var, 0, 1, null);
        this.leftToWindowLeft = tq7.h(tq7Var, 0, 1, null);
        this.rightToWindowRight = tq7.j(tq7Var, 0, 1, null);
        this.topToAnchorBottom = tq7.n(tq7Var, 0, 1, null);
        this.bottomToAnchorTop = tq7.b(tq7Var, 0, 1, null);
        this.topToWindowTop = tq7Var.o(i2);
        this.bottomToWindowBottom = tq7Var.c(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(k16 k16Var, k16 k16Var2) {
        return Unit.a;
    }

    @Override // com.google.inputmethod.rg9
    public long a(k16 anchorBounds, long windowSize, LayoutDirection layoutDirection, long popupContentSize) {
        k16 k16Var;
        char c;
        long j;
        int iA;
        q6c<Unit> q6cVar = this.keyboardSignalState;
        if (q6cVar != null) {
            q6cVar.getValue();
        }
        char c2 = ' ';
        long j2 = 4294967295L;
        long jC = q16.c((((long) (((int) (windowSize & 4294967295L)) + this.topWindowInsets)) & 4294967295L) | (((long) ((int) (windowSize >> 32))) << 32));
        int i = (int) (jC >> 32);
        int i2 = 0;
        List listS = m.s(new tq7.a[]{this.startToAnchorStart, this.endToAnchorEnd, g16.k(anchorBounds.i()) < i / 2 ? this.leftToWindowLeft : this.rightToWindowRight});
        int size = listS.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                k16Var = anchorBounds;
                c = c2;
                j = j2;
                iA = 0;
                break;
            }
            c = c2;
            j = j2;
            int i4 = (int) (popupContentSize >> c);
            int i5 = size;
            int i6 = i3;
            k16Var = anchorBounds;
            List list = listS;
            iA = ((tq7.a) listS.get(i3)).a(k16Var, jC, i4, layoutDirection);
            if (i6 == m.r(list) || (iA >= 0 && i4 + iA <= i)) {
                break;
            }
            i3 = i6 + 1;
            listS = list;
            size = i5;
            c2 = c;
            j2 = j;
        }
        int i7 = (int) (jC & j);
        List listS2 = m.s(new tq7.b[]{this.topToAnchorBottom, this.bottomToAnchorTop, g16.l(k16Var.i()) < i7 / 2 ? this.topToWindowTop : this.bottomToWindowBottom});
        int size2 = listS2.size();
        for (int i8 = 0; i8 < size2; i8++) {
            int i9 = (int) (popupContentSize & j);
            int iA2 = ((tq7.b) listS2.get(i8)).a(k16Var, jC, i9);
            if (i8 == m.r(listS2) || (iA2 >= 0 && i9 + iA2 <= i7)) {
                i2 = iA2;
                break;
            }
        }
        long jF = g16.f((((long) iA) << c) | (((long) i2) & j));
        this.onPositionCalculated.invoke(k16Var, l16.b(jF, popupContentSize));
        return jF;
    }

    public /* synthetic */ j14(f43 f43Var, int i, q6c q6cVar, int i2, Function2 function2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(f43Var, i, (i3 & 4) != 0 ? null : q6cVar, (i3 & 8) != 0 ? f43Var.O1(qq7.n()) : i2, (i3 & 16) != 0 ? new Function2() { // from class: com.google.android.i14
            public final Object invoke(Object obj, Object obj2) {
                return j14.c((k16) obj, (k16) obj2);
            }
        } : function2);
    }
}
