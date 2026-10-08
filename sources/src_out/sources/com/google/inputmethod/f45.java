package com.google.inputmethod;

import androidx.compose.ui.graphics.drawscope.a;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R$\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR$\u0010\u0012\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0018\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0014\u001a\u0004\b\u0005\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lcom/google/android/f45;", "", "<init>", "()V", "Lcom/google/android/ml5;", "b", "Lcom/google/android/ml5;", "c", "()Lcom/google/android/ml5;", "f", "(Lcom/google/android/ml5;)V", "imageBitmap", "Lcom/google/android/w41;", "Lcom/google/android/w41;", "a", "()Lcom/google/android/w41;", "d", "(Lcom/google/android/w41;)V", "canvas", "Landroidx/compose/ui/graphics/drawscope/a;", "Landroidx/compose/ui/graphics/drawscope/a;", "()Landroidx/compose/ui/graphics/drawscope/a;", "e", "(Landroidx/compose/ui/graphics/drawscope/a;)V", "canvasDrawScope", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class f45 {
    public static final f45 a = new f45();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static ml5 imageBitmap;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static w41 canvas;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private static a canvasDrawScope;

    private f45() {
    }

    public final w41 a() {
        return canvas;
    }

    public final a b() {
        return canvasDrawScope;
    }

    public final ml5 c() {
        return imageBitmap;
    }

    public final void d(w41 w41Var) {
        canvas = w41Var;
    }

    public final void e(a aVar) {
        canvasDrawScope = aVar;
    }

    public final void f(ml5 ml5Var) {
        imageBitmap = ml5Var;
    }
}
