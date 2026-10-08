package androidx.constraintlayout.compose;

import androidx.compose.ui.unit.LayoutDirection;
import com.google.android.ps4;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\n\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\n\u0010\tJ\u001d\u0010\r\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\u000eR;\u0010\u0015\u001a&\u0012\"\u0012 \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00040\u00100\u000f0\u000f8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R5\u0010\u001a\u001a \u0012\u001c\u0012\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u00160\u000f0\u000f8\u0006¢\u0006\f\n\u0004\b\b\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R)\u0010\u001e\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u00168\u0006¢\u0006\f\n\u0004\b\n\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Landroidx/constraintlayout/compose/AnchorFunctions;", "", "<init>", "()V", "Landroidx/constraintlayout/core/state/a;", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "", "c", "(Landroidx/constraintlayout/core/state/a;Landroidx/compose/ui/unit/LayoutDirection;)V", "d", "", "index", "g", "(ILandroidx/compose/ui/unit/LayoutDirection;)I", "", "Lkotlin/Function3;", "b", "[[Lcom/google/android/ps4;", "f", "()[[Lcom/google/android/ps4;", "verticalAnchorFunctions", "Lkotlin/Function2;", "[[Lkotlin/jvm/functions/Function2;", "e", "()[[Lkotlin/jvm/functions/Function2;", "horizontalAnchorFunctions", "Lkotlin/jvm/functions/Function2;", "getBaselineAnchorFunction", "()Lkotlin/jvm/functions/Function2;", "baselineAnchorFunction", "compose_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class AnchorFunctions {
    public static final AnchorFunctions a = new AnchorFunctions();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final ps4<androidx.constraintlayout.core.state.a, Object, LayoutDirection, androidx.constraintlayout.core.state.a>[][] verticalAnchorFunctions = {new ps4[]{new ps4<androidx.constraintlayout.core.state.a, Object, LayoutDirection, androidx.constraintlayout.core.state.a>() { // from class: androidx.constraintlayout.compose.AnchorFunctions$verticalAnchorFunctions$1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final androidx.constraintlayout.core.state.a invoke(androidx.constraintlayout.core.state.a aVar, Object obj, LayoutDirection layoutDirection) {
            Intrinsics.checkNotNullParameter(aVar, "$this$arrayOf");
            Intrinsics.checkNotNullParameter(obj, "other");
            Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
            AnchorFunctions.a.c(aVar, layoutDirection);
            androidx.constraintlayout.core.state.a aVarA = aVar.A(obj);
            Intrinsics.checkNotNullExpressionValue(aVarA, "leftToLeft(other)");
            return aVarA;
        }
    }, new ps4<androidx.constraintlayout.core.state.a, Object, LayoutDirection, androidx.constraintlayout.core.state.a>() { // from class: androidx.constraintlayout.compose.AnchorFunctions$verticalAnchorFunctions$2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final androidx.constraintlayout.core.state.a invoke(androidx.constraintlayout.core.state.a aVar, Object obj, LayoutDirection layoutDirection) {
            Intrinsics.checkNotNullParameter(aVar, "$this$arrayOf");
            Intrinsics.checkNotNullParameter(obj, "other");
            Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
            AnchorFunctions.a.c(aVar, layoutDirection);
            androidx.constraintlayout.core.state.a aVarB = aVar.B(obj);
            Intrinsics.checkNotNullExpressionValue(aVarB, "leftToRight(other)");
            return aVarB;
        }
    }}, new ps4[]{new ps4<androidx.constraintlayout.core.state.a, Object, LayoutDirection, androidx.constraintlayout.core.state.a>() { // from class: androidx.constraintlayout.compose.AnchorFunctions$verticalAnchorFunctions$3
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final androidx.constraintlayout.core.state.a invoke(androidx.constraintlayout.core.state.a aVar, Object obj, LayoutDirection layoutDirection) {
            Intrinsics.checkNotNullParameter(aVar, "$this$arrayOf");
            Intrinsics.checkNotNullParameter(obj, "other");
            Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
            AnchorFunctions.a.d(aVar, layoutDirection);
            androidx.constraintlayout.core.state.a aVarH = aVar.H(obj);
            Intrinsics.checkNotNullExpressionValue(aVarH, "rightToLeft(other)");
            return aVarH;
        }
    }, new ps4<androidx.constraintlayout.core.state.a, Object, LayoutDirection, androidx.constraintlayout.core.state.a>() { // from class: androidx.constraintlayout.compose.AnchorFunctions$verticalAnchorFunctions$4
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final androidx.constraintlayout.core.state.a invoke(androidx.constraintlayout.core.state.a aVar, Object obj, LayoutDirection layoutDirection) {
            Intrinsics.checkNotNullParameter(aVar, "$this$arrayOf");
            Intrinsics.checkNotNullParameter(obj, "other");
            Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
            AnchorFunctions.a.d(aVar, layoutDirection);
            androidx.constraintlayout.core.state.a aVarI = aVar.I(obj);
            Intrinsics.checkNotNullExpressionValue(aVarI, "rightToRight(other)");
            return aVarI;
        }
    }}};

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static final Function2<androidx.constraintlayout.core.state.a, Object, androidx.constraintlayout.core.state.a>[][] horizontalAnchorFunctions = {new Function2[]{new Function2<androidx.constraintlayout.core.state.a, Object, androidx.constraintlayout.core.state.a>() { // from class: androidx.constraintlayout.compose.AnchorFunctions$horizontalAnchorFunctions$1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final androidx.constraintlayout.core.state.a invoke(androidx.constraintlayout.core.state.a aVar, Object obj) {
            Intrinsics.checkNotNullParameter(aVar, "$this$arrayOf");
            Intrinsics.checkNotNullParameter(obj, "other");
            aVar.W(null);
            aVar.h(null);
            androidx.constraintlayout.core.state.a aVarX = aVar.X(obj);
            Intrinsics.checkNotNullExpressionValue(aVarX, "topToTop(other)");
            return aVarX;
        }
    }, new Function2<androidx.constraintlayout.core.state.a, Object, androidx.constraintlayout.core.state.a>() { // from class: androidx.constraintlayout.compose.AnchorFunctions$horizontalAnchorFunctions$2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final androidx.constraintlayout.core.state.a invoke(androidx.constraintlayout.core.state.a aVar, Object obj) {
            Intrinsics.checkNotNullParameter(aVar, "$this$arrayOf");
            Intrinsics.checkNotNullParameter(obj, "other");
            aVar.X(null);
            aVar.h(null);
            androidx.constraintlayout.core.state.a aVarW = aVar.W(obj);
            Intrinsics.checkNotNullExpressionValue(aVarW, "topToBottom(other)");
            return aVarW;
        }
    }}, new Function2[]{new Function2<androidx.constraintlayout.core.state.a, Object, androidx.constraintlayout.core.state.a>() { // from class: androidx.constraintlayout.compose.AnchorFunctions$horizontalAnchorFunctions$3
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final androidx.constraintlayout.core.state.a invoke(androidx.constraintlayout.core.state.a aVar, Object obj) {
            Intrinsics.checkNotNullParameter(aVar, "$this$arrayOf");
            Intrinsics.checkNotNullParameter(obj, "other");
            aVar.j(null);
            aVar.h(null);
            androidx.constraintlayout.core.state.a aVarK = aVar.k(obj);
            Intrinsics.checkNotNullExpressionValue(aVarK, "bottomToTop(other)");
            return aVarK;
        }
    }, new Function2<androidx.constraintlayout.core.state.a, Object, androidx.constraintlayout.core.state.a>() { // from class: androidx.constraintlayout.compose.AnchorFunctions$horizontalAnchorFunctions$4
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final androidx.constraintlayout.core.state.a invoke(androidx.constraintlayout.core.state.a aVar, Object obj) {
            Intrinsics.checkNotNullParameter(aVar, "$this$arrayOf");
            Intrinsics.checkNotNullParameter(obj, "other");
            aVar.k(null);
            aVar.h(null);
            androidx.constraintlayout.core.state.a aVarJ = aVar.j(obj);
            Intrinsics.checkNotNullExpressionValue(aVarJ, "bottomToBottom(other)");
            return aVarJ;
        }
    }}};

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private static final Function2<androidx.constraintlayout.core.state.a, Object, androidx.constraintlayout.core.state.a> baselineAnchorFunction = new Function2<androidx.constraintlayout.core.state.a, Object, androidx.constraintlayout.core.state.a>() { // from class: androidx.constraintlayout.compose.AnchorFunctions$baselineAnchorFunction$1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final androidx.constraintlayout.core.state.a invoke(androidx.constraintlayout.core.state.a aVar, Object obj) {
            Intrinsics.checkNotNullParameter(aVar, "$this$null");
            Intrinsics.checkNotNullParameter(obj, "other");
            aVar.X(null);
            aVar.W(null);
            aVar.k(null);
            aVar.j(null);
            androidx.constraintlayout.core.state.a aVarH = aVar.h(obj);
            Intrinsics.checkNotNullExpressionValue(aVarH, "baselineToBaseline(other)");
            return aVarH;
        }
    };

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            iArr[LayoutDirection.Ltr.ordinal()] = 1;
            iArr[LayoutDirection.Rtl.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private AnchorFunctions() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(androidx.constraintlayout.core.state.a aVar, LayoutDirection layoutDirection) {
        aVar.A(null);
        aVar.B(null);
        int i = a.$EnumSwitchMapping$0[layoutDirection.ordinal()];
        if (i == 1) {
            aVar.U(null);
            aVar.T(null);
        } else {
            if (i != 2) {
                return;
            }
            aVar.t(null);
            aVar.s(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(androidx.constraintlayout.core.state.a aVar, LayoutDirection layoutDirection) {
        aVar.H(null);
        aVar.I(null);
        int i = a.$EnumSwitchMapping$0[layoutDirection.ordinal()];
        if (i == 1) {
            aVar.t(null);
            aVar.s(null);
        } else {
            if (i != 2) {
                return;
            }
            aVar.U(null);
            aVar.T(null);
        }
    }

    public final Function2<androidx.constraintlayout.core.state.a, Object, androidx.constraintlayout.core.state.a>[][] e() {
        return horizontalAnchorFunctions;
    }

    public final ps4<androidx.constraintlayout.core.state.a, Object, LayoutDirection, androidx.constraintlayout.core.state.a>[][] f() {
        return verticalAnchorFunctions;
    }

    public final int g(int index, LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        if (index >= 0) {
            return index;
        }
        return layoutDirection == LayoutDirection.Ltr ? index + 2 : (-index) - 1;
    }
}
