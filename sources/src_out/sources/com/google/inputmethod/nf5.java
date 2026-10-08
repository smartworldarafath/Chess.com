package com.google.inputmethod;

import androidx.constraintlayout.compose.ConstraintLayoutBaseScope;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J1\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\n"}, d2 = {"Lcom/google/android/nf5;", "", "Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$b;", "anchor", "Lcom/google/android/ff3;", "margin", "goneMargin", "", "a", "(Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$b;FF)V", "compose_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public interface nf5 {

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class a {
        public static /* synthetic */ void a(nf5 nf5Var, ConstraintLayoutBaseScope.HorizontalAnchor horizontalAnchor, float f, float f2, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: linkTo-VpY3zN4");
            }
            if ((i & 2) != 0) {
                f = ff3.i(0);
            }
            if ((i & 4) != 0) {
                f2 = ff3.i(0);
            }
            nf5Var.a(horizontalAnchor, f, f2);
        }
    }

    void a(ConstraintLayoutBaseScope.HorizontalAnchor anchor, float margin, float goneMargin);
}
