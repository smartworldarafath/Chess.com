package com.google.inputmethod;

import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0007\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u000b\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000f\u001a\u00020\f8G¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00100\u00148@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lcom/google/android/kh7;", "", "<init>", "()V", "Lcom/google/android/yi1;", "a", "(Landroidx/compose/runtime/d;I)Lcom/google/android/yi1;", "colorScheme", "Lcom/google/android/vod;", "e", "(Landroidx/compose/runtime/d;I)Lcom/google/android/vod;", "typography", "Lcom/google/android/slb;", "d", "(Landroidx/compose/runtime/d;I)Lcom/google/android/slb;", "shapes", "Lcom/google/android/c08;", "c", "(Landroidx/compose/runtime/d;I)Lcom/google/android/c08;", "motionScheme", "Lcom/google/android/zr1;", "b", "()Lcom/google/android/zr1;", "LocalMotionScheme", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class kh7 {
    public static final kh7 a = new kh7();
    public static final int b = 0;

    private kh7() {
    }

    public final ColorScheme a(d dVar, int i) {
        if (e.k()) {
            e.o(-561618718, i, -1, "androidx.compose.material3.MaterialTheme.<get-colorScheme> (MaterialTheme.kt:121)");
        }
        ColorScheme colorScheme = (ColorScheme) dVar.v(bj1.k());
        if (e.k()) {
            e.n();
        }
        return colorScheme;
    }

    public final zr1<c08> b() {
        return ph7.b;
    }

    public final c08 c(d dVar, int i) {
        if (e.k()) {
            e.o(-506613891, i, -1, "androidx.compose.material3.MaterialTheme.<get-motionScheme> (MaterialTheme.kt:141)");
        }
        c08 c08Var = (c08) dVar.v(b());
        if (e.k()) {
            e.n();
        }
        return c08Var;
    }

    public final Shapes d(d dVar, int i) {
        if (e.k()) {
            e.o(419509830, i, -1, "androidx.compose.material3.MaterialTheme.<get-shapes> (MaterialTheme.kt:137)");
        }
        Shapes shapes = (Shapes) dVar.v(ulb.h());
        if (e.k()) {
            e.n();
        }
        return shapes;
    }

    public final Typography e(d dVar, int i) {
        if (e.k()) {
            e.o(-942794935, i, -1, "androidx.compose.material3.MaterialTheme.<get-typography> (MaterialTheme.kt:129)");
        }
        Typography typography = (Typography) dVar.v(xod.d());
        if (e.k()) {
            e.n();
        }
        return typography;
    }
}
