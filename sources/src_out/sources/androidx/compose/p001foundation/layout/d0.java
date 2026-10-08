package androidx.compose.p001foundation.layout;

import androidx.compose.p001foundation.layout.d0;
import androidx.compose.ui.layout.j;
import androidx.compose.ui.layout.o;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.inputmethod.RowColumnParentData;
import com.google.inputmethod.cra;
import com.google.inputmethod.dra;
import com.google.inputmethod.fj7;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\u0006\u001a\u00020\u0003*\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0005J7\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJi\u0010\u001e\u001a\u00020\u001d2\u000e\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00032\b\u0010\u0019\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ/\u0010#\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020!2\u0006\u0010\u0014\u001a\u00020\u0003H\u0016¢\u0006\u0004\b#\u0010$J/\u0010'\u001a\u00020&2\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010%\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b'\u0010(R\u0014\u0010+\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0014\u0010/\u001a\u00020,8&X¦\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0014\u00103\u001a\u0002008&X¦\u0004¢\u0006\u0006\u001a\u0004\b1\u00102R\u0014\u00107\u001a\u0002048&X¦\u0004¢\u0006\u0006\u001a\u0004\b5\u00106ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u00068À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/layout/d0;", "Lcom/google/android/dra;", "Landroidx/compose/ui/layout/o;", "", "f", "(Landroidx/compose/ui/layout/o;)I", "c", "mainAxisMin", "crossAxisMin", "mainAxisMax", "crossAxisMax", "", "isPrioritizing", "Lcom/google/android/kx1;", "a", "(IIIIZ)J", "", "placeables", "Landroidx/compose/ui/layout/j;", "measureScope", "beforeCrossAxisAlignmentLine", "", "mainAxisPositions", "mainAxisLayoutSize", "crossAxisLayoutSize", "crossAxisOffset", "currentLineIndex", "startIndex", "endIndex", "Lcom/google/android/fj7;", "e", "([Landroidx/compose/ui/layout/o;Landroidx/compose/ui/layout/j;I[III[IIII)Lcom/google/android/fj7;", "placeable", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "n", "(Landroidx/compose/ui/layout/o;ILandroidx/compose/ui/unit/LayoutDirection;I)I", "childrenMainAxisSize", "", "b", "(I[I[ILandroidx/compose/ui/layout/j;)V", "d", "()Z", "isHorizontal", "Landroidx/compose/foundation/layout/c$e;", "q", "()Landroidx/compose/foundation/layout/c$e;", "horizontalArrangement", "Landroidx/compose/foundation/layout/c$n;", "l", "()Landroidx/compose/foundation/layout/c$n;", "verticalArrangement", "Landroidx/compose/foundation/layout/s;", "g", "()Landroidx/compose/foundation/layout/s;", "crossAxisAlignment", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface d0 extends dra {
    /* JADX INFO: Access modifiers changed from: private */
    static Unit k(int[] iArr, int i, int i2, int i3, o[] oVarArr, d0 d0Var, int i4, LayoutDirection layoutDirection, int i5, int[] iArr2, o.a aVar) {
        int i6 = iArr != null ? iArr[i] : 0;
        for (int i7 = i2; i7 < i3; i7++) {
            o oVar = oVarArr[i7];
            Intrinsics.g(oVar);
            int iN = d0Var.n(oVar, i4, layoutDirection, i5) + i6;
            if (d0Var.d()) {
                o.a.z(aVar, oVar, iArr2[i7 - i2], iN, 0.0f, 4, null);
            } else {
                o.a.z(aVar, oVar, iN, iArr2[i7 - i2], 0.0f, 4, null);
            }
        }
        return Unit.a;
    }

    @Override // com.google.inputmethod.dra
    default long a(int mainAxisMin, int crossAxisMin, int mainAxisMax, int crossAxisMax, boolean isPrioritizing) {
        return d() ? t0.a(isPrioritizing, mainAxisMin, crossAxisMin, mainAxisMax, crossAxisMax) : o.b(isPrioritizing, mainAxisMin, crossAxisMin, mainAxisMax, crossAxisMax);
    }

    @Override // com.google.inputmethod.dra
    default void b(int mainAxisLayoutSize, int[] childrenMainAxisSize, int[] mainAxisPositions, j measureScope) {
        if (d()) {
            q().a(measureScope, mainAxisLayoutSize, childrenMainAxisSize, measureScope.getLayoutDirection(), mainAxisPositions);
        } else {
            l().arrange(measureScope, mainAxisLayoutSize, childrenMainAxisSize, mainAxisPositions);
        }
    }

    @Override // com.google.inputmethod.dra
    default int c(o oVar) {
        return d() ? oVar.G0() : oVar.J0();
    }

    boolean d();

    @Override // com.google.inputmethod.dra
    default fj7 e(final o[] placeables, j measureScope, final int beforeCrossAxisAlignmentLine, final int[] mainAxisPositions, int mainAxisLayoutSize, final int crossAxisLayoutSize, final int[] crossAxisOffset, final int currentLineIndex, final int startIndex, final int endIndex) {
        int i;
        int i2;
        if (d()) {
            i2 = mainAxisLayoutSize;
            i = crossAxisLayoutSize;
        } else {
            i = mainAxisLayoutSize;
            i2 = crossAxisLayoutSize;
        }
        final LayoutDirection layoutDirection = d() ? LayoutDirection.Ltr : measureScope.getLayoutDirection();
        return j.Q1(measureScope, i2, i, null, new Function1() { // from class: com.google.android.hj4
            public final Object invoke(Object obj) {
                return d0.k(crossAxisOffset, currentLineIndex, startIndex, endIndex, placeables, this, crossAxisLayoutSize, layoutDirection, beforeCrossAxisAlignmentLine, mainAxisPositions, (o.a) obj);
            }
        }, 4, null);
    }

    @Override // com.google.inputmethod.dra
    default int f(o oVar) {
        return d() ? oVar.J0() : oVar.G0();
    }

    s g();

    c.n l();

    default int n(o placeable, int crossAxisLayoutSize, LayoutDirection layoutDirection, int beforeCrossAxisAlignmentLine) {
        s sVarG;
        RowColumnParentData rowColumnParentDataC = cra.c(placeable);
        if (rowColumnParentDataC == null || (sVarG = rowColumnParentDataC.getCrossAxisAlignment()) == null) {
            sVarG = g();
        }
        return sVarG.a(crossAxisLayoutSize, c(placeable), layoutDirection, placeable, beforeCrossAxisAlignmentLine);
    }

    c.e q();
}
