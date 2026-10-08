package com.google.inputmethod;

import androidx.compose.ui.b;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001JI\u0010\t\u001a\u00020\u0002*\u00020\u00022\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H&¢\u0006\u0004\b\t\u0010\n\u0082\u0001\u0001\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Lcom/google/android/up6;", "", "Landroidx/compose/ui/b;", "Lcom/google/android/xa4;", "", "fadeInSpec", "Lcom/google/android/g16;", "placementSpec", "fadeOutSpec", "a", "(Landroidx/compose/ui/b;Lcom/google/android/xa4;Lcom/google/android/xa4;Lcom/google/android/xa4;)Landroidx/compose/ui/b;", "Lcom/google/android/vp6;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface up6 {
    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ b b(up6 up6Var, b bVar, xa4 xa4Var, xa4 xa4Var2, xa4 xa4Var3, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animateItem");
        }
        if ((i & 1) != 0) {
            xa4Var = lr.j(0.0f, 400.0f, null, 5, null);
        }
        if ((i & 2) != 0) {
            xa4Var2 = lr.j(0.0f, 400.0f, g16.c(kce.c(g16.INSTANCE)), 1, null);
        }
        if ((i & 4) != 0) {
            xa4Var3 = lr.j(0.0f, 400.0f, null, 5, null);
        }
        return up6Var.a(bVar, xa4Var, xa4Var2, xa4Var3);
    }

    b a(b bVar, xa4<Float> xa4Var, xa4<g16> xa4Var2, xa4<Float> xa4Var3);
}
