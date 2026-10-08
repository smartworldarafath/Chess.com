package com.google.inputmethod;

import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B3\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u001c\b\u0002\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nB/\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u001c\b\u0002\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\fJ/\u0010\u0013\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0015R(\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/google/android/j12;", "Lcom/google/android/rg9;", "Lkotlin/Function0;", "Lcom/google/android/g16;", "anchorPositionBlock", "Lkotlin/Function2;", "Lcom/google/android/k16;", "", "onPositionCalculated", "<init>", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;)V", "anchorPosition", "(JLkotlin/jvm/functions/Function2;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "anchorBounds", "Lcom/google/android/q16;", "windowSize", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "popupContentSize", "a", "(Lcom/google/android/k16;JLandroidx/compose/ui/unit/LayoutDirection;J)J", "Lkotlin/jvm/functions/Function0;", "b", "Lkotlin/jvm/functions/Function2;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class j12 implements rg9 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Function0<g16> anchorPositionBlock;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Function2<g16, k16, Unit> onPositionCalculated;

    public /* synthetic */ j12(long j, Function2 function2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, (Function2<? super g16, ? super k16, Unit>) function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g16 c(long j) {
        return g16.c(j);
    }

    @Override // com.google.inputmethod.rg9
    public long a(k16 anchorBounds, long windowSize, LayoutDirection layoutDirection, long popupContentSize) {
        long packedValue = ((g16) this.anchorPositionBlock.invoke()).getPackedValue();
        long jF = g16.f((((long) k12.b(anchorBounds.getLeft() + g16.k(packedValue), (int) (popupContentSize >> 32), (int) (windowSize >> 32), layoutDirection == LayoutDirection.Ltr)) << 32) | (4294967295L & ((long) k12.c(anchorBounds.getTop() + g16.l(packedValue), (int) (popupContentSize & 4294967295L), (int) (windowSize & 4294967295L), false, 8, null))));
        Function2<g16, k16, Unit> function2 = this.onPositionCalculated;
        if (function2 != null) {
            function2.invoke(g16.c(packedValue), l16.b(jF, popupContentSize));
        }
        return jF;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public j12(Function0<g16> function0, Function2<? super g16, ? super k16, Unit> function2) {
        this.anchorPositionBlock = function0;
        this.onPositionCalculated = function2;
    }

    public /* synthetic */ j12(Function0 function0, Function2 function2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((Function0<g16>) function0, (Function2<? super g16, ? super k16, Unit>) ((i & 2) != 0 ? null : function2));
    }

    public /* synthetic */ j12(long j, Function2 function2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, (i & 2) != 0 ? null : function2, null);
    }

    private j12(final long j, Function2<? super g16, ? super k16, Unit> function2) {
        this((Function0<g16>) new Function0() { // from class: com.google.android.i12
            public final Object invoke() {
                return j12.c(j);
            }
        }, function2);
    }
}
