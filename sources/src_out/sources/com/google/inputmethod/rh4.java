package com.google.inputmethod;

import androidx.compose.p002material3.FloatingActionButtonElevation;
import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0010\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0014\u001a\u00020\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0017\u001a\u00020\u00158G¢\u0006\u0006\u001a\u0004\b\f\u0010\u0016¨\u0006\u0018"}, d2 = {"Lcom/google/android/rh4;", "", "<init>", "()V", "Lcom/google/android/ff3;", "defaultElevation", "pressedElevation", "focusedElevation", "hoveredElevation", "Landroidx/compose/material3/FloatingActionButtonElevation;", "a", "(FFFFLandroidx/compose/runtime/d;II)Landroidx/compose/material3/FloatingActionButtonElevation;", "b", "F", "getLargeIconSize-D9Ej5fM", "()F", "LargeIconSize", "Lcom/google/android/xkb;", "c", "(Landroidx/compose/runtime/d;I)Lcom/google/android/xkb;", "shape", "Lcom/google/android/ei1;", "(Landroidx/compose/runtime/d;I)J", "containerColor", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class rh4 {
    public static final rh4 a = new rh4();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final float LargeIconSize = ff3.i(36);

    private rh4() {
    }

    public final FloatingActionButtonElevation a(float f, float f2, float f3, float f4, d dVar, int i, int i2) {
        if ((i2 & 1) != 0) {
            f = c44.a.b();
        }
        if ((i2 & 2) != 0) {
            f2 = c44.a.e();
        }
        if ((i2 & 4) != 0) {
            f3 = c44.a.c();
        }
        float f5 = f3;
        if ((i2 & 8) != 0) {
            f4 = c44.a.d();
        }
        if (e.k()) {
            e.o(-241106249, i, -1, "androidx.compose.material3.FloatingActionButtonDefaults.elevation (FloatingActionButton.kt:549)");
        }
        float f6 = f;
        FloatingActionButtonElevation floatingActionButtonElevation = new FloatingActionButtonElevation(f6, f2, f5, f4, null);
        if (e.k()) {
            e.n();
        }
        return floatingActionButtonElevation;
    }

    public final long b(d dVar, int i) {
        if (e.k()) {
            e.o(1855656391, i, -1, "androidx.compose.material3.FloatingActionButtonDefaults.<get-containerColor> (FloatingActionButton.kt:529)");
        }
        long jL = bj1.l(c44.a.a(), dVar, 6);
        if (e.k()) {
            e.n();
        }
        return jL;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final xkb c(d dVar, int i) throws NoWhenBranchMatchedException {
        if (e.k()) {
            e.o(-53247565, i, -1, "androidx.compose.material3.FloatingActionButtonDefaults.<get-shape> (FloatingActionButton.kt:513)");
        }
        xkb xkbVarI = ulb.i(a44.a.b(), dVar, 6);
        if (e.k()) {
            e.n();
        }
        return xkbVarI;
    }
}
