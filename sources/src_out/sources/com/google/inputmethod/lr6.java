package com.google.inputmethod;

import androidx.compose.ui.b;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\u001d\u0010\u0005\u001a\u00020\u0002*\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u0007\u001a\u00020\u0002*\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0007\u0010\u0006JI\u0010\r\u001a\u00020\u0002*\u00020\u00022\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\bH\u0016¢\u0006\u0004\b\r\u0010\u000eø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0003"}, d2 = {"Lcom/google/android/lr6;", "", "Landroidx/compose/ui/b;", "", "fraction", "f", "(Landroidx/compose/ui/b;F)Landroidx/compose/ui/b;", "e", "Lcom/google/android/xa4;", "fadeInSpec", "Lcom/google/android/g16;", "placementSpec", "fadeOutSpec", "a", "(Landroidx/compose/ui/b;Lcom/google/android/xa4;Lcom/google/android/xa4;Lcom/google/android/xa4;)Landroidx/compose/ui/b;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface lr6 {
    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ b b(lr6 lr6Var, b bVar, xa4 xa4Var, xa4 xa4Var2, xa4 xa4Var3, int i, Object obj) {
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
        return lr6Var.a(bVar, xa4Var, xa4Var2, xa4Var3);
    }

    static /* synthetic */ b c(lr6 lr6Var, b bVar, float f, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fillParentMaxWidth");
        }
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        return lr6Var.f(bVar, f);
    }

    static /* synthetic */ b d(lr6 lr6Var, b bVar, float f, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fillParentMaxHeight");
        }
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        return lr6Var.e(bVar, f);
    }

    default b a(b bVar, xa4<Float> xa4Var, xa4<g16> xa4Var2, xa4<Float> xa4Var3) {
        return bVar;
    }

    b e(b bVar, float f);

    b f(b bVar, float f);
}
