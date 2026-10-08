package com.google.inputmethod;

import android.graphics.Canvas;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0015\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b\"\u0014\u0010\n\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\t\"\u0015\u0010\r\u001a\u00020\u0005*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f*8\b\u0007\u0010\u0016\"\u00020\u00052\u00020\u0005B*\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u001c\b\u0011\u0012\u0018\b\u000bB\u0014\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0006\b\u0015\u0012\u0002\b\f¨\u0006\u0017"}, d2 = {"Lcom/google/android/ml5;", "image", "Lcom/google/android/w41;", "a", "(Lcom/google/android/ml5;)Lcom/google/android/w41;", "Landroid/graphics/Canvas;", "c", "b", "(Landroid/graphics/Canvas;)Lcom/google/android/w41;", "Landroid/graphics/Canvas;", "EmptyCanvas", "d", "(Lcom/google/android/w41;)Landroid/graphics/Canvas;", "nativeCanvas", "Lcom/google/android/r43;", "message", "Use android.graphics.Canvas directly instead", "replaceWith", "Lcom/google/android/kia;", "expression", "android.graphics.Canvas", "imports", "NativeCanvas", "ui-graphics"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class xi {
    private static final Canvas a = new Canvas();

    public static final w41 a(ml5 ml5Var) {
        wi wiVar = new wi();
        wiVar.d(new Canvas(cl.b(ml5Var)));
        return wiVar;
    }

    public static final w41 b(Canvas canvas) {
        wi wiVar = new wi();
        wiVar.d(canvas);
        return wiVar;
    }

    public static final Canvas d(w41 w41Var) {
        Intrinsics.h(w41Var, "null cannot be cast to non-null type androidx.compose.ui.graphics.AndroidCanvas");
        return ((wi) w41Var).a();
    }
}
