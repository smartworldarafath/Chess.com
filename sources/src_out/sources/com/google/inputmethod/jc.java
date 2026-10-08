package com.google.inputmethod;

import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\r\u001a\u00020\n8G¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0011\u001a\u00020\u000e8G¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0012\u001a\u00020\u000e8G¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0010R\u0011\u0010\u0014\u001a\u00020\u000e8G¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\u0016\u001a\u00020\u000e8G¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0010¨\u0006\u0017"}, d2 = {"Lcom/google/android/jc;", "", "<init>", "()V", "Lcom/google/android/ff3;", "b", "F", "f", "()F", "TonalElevation", "Lcom/google/android/xkb;", "c", "(Landroidx/compose/runtime/d;I)Lcom/google/android/xkb;", "shape", "Lcom/google/android/ei1;", "a", "(Landroidx/compose/runtime/d;I)J", "containerColor", "iconContentColor", "e", "titleContentColor", "d", "textContentColor", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class jc {
    public static final jc a = new jc();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final float TonalElevation = ff3.i(0);

    private jc() {
    }

    public final long a(d dVar, int i) {
        if (e.k()) {
            e.o(616766901, i, -1, "androidx.compose.material3.AlertDialogDefaults.<get-containerColor> (AlertDialog.kt:225)");
        }
        long jL = bj1.l(y93.a.c(), dVar, 6);
        if (e.k()) {
            e.n();
        }
        return jL;
    }

    public final long b(d dVar, int i) {
        if (e.k()) {
            e.o(1646653461, i, -1, "androidx.compose.material3.AlertDialogDefaults.<get-iconContentColor> (AlertDialog.kt:229)");
        }
        long jL = bj1.l(y93.a.g(), dVar, 6);
        if (e.k()) {
            e.n();
        }
        return jL;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final xkb c(d dVar, int i) throws NoWhenBranchMatchedException {
        if (e.k()) {
            e.o(-952504159, i, -1, "androidx.compose.material3.AlertDialogDefaults.<get-shape> (AlertDialog.kt:221)");
        }
        xkb xkbVarI = ulb.i(y93.a.d(), dVar, 6);
        if (e.k()) {
            e.n();
        }
        return xkbVarI;
    }

    public final long d(d dVar, int i) {
        if (e.k()) {
            e.o(1729845653, i, -1, "androidx.compose.material3.AlertDialogDefaults.<get-textContentColor> (AlertDialog.kt:237)");
        }
        long jL = bj1.l(y93.a.h(), dVar, 6);
        if (e.k()) {
            e.n();
        }
        return jL;
    }

    public final long e(d dVar, int i) {
        if (e.k()) {
            e.o(247083549, i, -1, "androidx.compose.material3.AlertDialogDefaults.<get-titleContentColor> (AlertDialog.kt:233)");
        }
        long jL = bj1.l(y93.a.e(), dVar, 6);
        if (e.k()) {
            e.n();
        }
        return jL;
    }

    public final float f() {
        return TonalElevation;
    }
}
